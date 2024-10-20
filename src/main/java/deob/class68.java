package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("bq")
public class class68 {

    @ObfuscatedName("bq.q")
    public static int[] field859 = new int[5];

    @ObfuscatedName("bq.f")
    public static int[][] field860 = new int[5][5000];

    @ObfuscatedName("bq.r")
    public static int[] field861 = new int[1000];

    @ObfuscatedName("bq.b")
    public static String[] field862 = new String[1000];

    @ObfuscatedName("bq.g")
    public static int field864 = 0;

    @ObfuscatedName("bq.i")
    public static class61[] field865 = new class61[50];

    @ObfuscatedName("bq.l")
    public static Calendar field857 = Calendar.getInstance();

    @ObfuscatedName("bq.t")
    public static final String[] field867 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bq.p")
    public static boolean field866 = false;

    @ObfuscatedName("bq.d")
    public static boolean field869 = false;

    @ObfuscatedName("bq.y")
    public static ArrayList field868 = new ArrayList();

    @ObfuscatedName("bq.z")
    public static int field875 = 0;

    @ObfuscatedName("bq.ao")
    public static final double field872 = Math.log(2.0D);

    public class68() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.h(Lcb;B)V")
    public static void method3219(class85 arg0) {
        method2823(arg0, 500000, 475000);
    }

    @ObfuscatedName("du.e(Lcb;III)V")
    public static void method2823(class85 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1079;
        class76 var5;
        if (class465.method2162(arg0.field1086)) {
            Statics.field4277 = (class261) var3[0];
            class179 var4 = class179.method3153(Statics.field4277.field3020);
            var5 = class76.method423(arg0.field1086, var4.field1930, var4.field1950);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class76.method3435(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field1118 = 0;
        Statics.field863 = 0;
        int var7 = -1;
        int[] var8 = var5.field992;
        int[] var9 = var5.field993;
        byte var10 = -1;
        field864 = 0;
        field866 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field871 = new int[var5.field994];
            int var13 = 0;
            Statics.field4649 = new String[var5.field996];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1075;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1082;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1077 == null ? -1 : arg0.field1077.field3635;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1080;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1077 == null ? -1 : arg0.field1077.field3543;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1089 == null ? -1 : arg0.field1089.field3635;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1089 == null ? -1 : arg0.field1089.field3543;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1078;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1083;
                    }
                    Statics.field871[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1084;
                    }
                    Statics.field4649[var14++] = var17;
                }
            }
            field875 = arg0.field1085;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field993[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method2008(var61, var5, var48);
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
                    field861[++Statics.field1118 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field861[++Statics.field1118 - 1] = class296.field3445[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class296.field3445[var19] = field861[--Statics.field1118];
                    client.method2154(var19);
                } else if (var61 == 3) {
                    field862[++Statics.field863 - 1] = var5.field998[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field1118 -= 2;
                    if (field861[Statics.field1118] != field861[Statics.field1118 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field1118 -= 2;
                    if (field861[Statics.field1118] == field861[Statics.field1118 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field1118 -= 2;
                    if (field861[Statics.field1118] < field861[Statics.field1118 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field1118 -= 2;
                    if (field861[Statics.field1118] > field861[Statics.field1118 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field864 == 0) {
                        return;
                    }
                    class61 var21 = field865[--field864];
                    var5 = var21.field482;
                    var8 = var5.field992;
                    var9 = var5.field993;
                    var7 = var21.field481;
                    Statics.field871 = var21.field480;
                    Statics.field4649 = var21.field483;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field861[++Statics.field1118 - 1] = class296.method3182(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class296.method1957(var23, field861[--Statics.field1118]);
                } else if (var61 == 31) {
                    Statics.field1118 -= 2;
                    if (field861[Statics.field1118] <= field861[Statics.field1118 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field1118 -= 2;
                    if (field861[Statics.field1118] >= field861[Statics.field1118 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field861[++Statics.field1118 - 1] = Statics.field871[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field871[var9[var7]] = field861[--Statics.field1118];
                } else if (var61 == 35) {
                    field862[++Statics.field863 - 1] = Statics.field4649[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field4649[var9[var7]] = field862[--Statics.field863];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field863 -= var24;
                    String var25 = class361.method3924(field862, Statics.field863, var24);
                    field862[++Statics.field863 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field1118--;
                } else if (var61 == 39) {
                    Statics.field863--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class76 var27 = class76.method3435(var26);
                    int[] var28 = new int[var27.field994];
                    String[] var29 = new String[var27.field996];
                    for (int var30 = 0; var30 < var27.field1001; var30++) {
                        var28[var30] = field861[Statics.field1118 - var27.field1001 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field995; var31++) {
                        var29[var31] = field862[Statics.field863 - var27.field995 + var31];
                    }
                    Statics.field1118 -= var27.field1001;
                    Statics.field863 -= var27.field995;
                    class61 var32 = new class61();
                    var32.field482 = var5;
                    var32.field481 = var7;
                    var32.field480 = Statics.field871;
                    var32.field483 = Statics.field4649;
                    field865[++field864 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field992;
                    var9 = var27.field993;
                    var7 = -1;
                    Statics.field871 = var28;
                    Statics.field4649 = var29;
                } else if (var61 == 42) {
                    field861[++Statics.field1118 - 1] = Statics.field2864.method2525(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field2864.method2511(var9[var7], field861[--Statics.field1118]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field861[--Statics.field1118];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field859[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field860[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field861[--Statics.field1118];
                    if (var39 < 0 || var39 >= field859[var38]) {
                        throw new RuntimeException();
                    }
                    field861[++Statics.field1118 - 1] = field860[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field1118 -= 2;
                    int var41 = field861[Statics.field1118];
                    if (var41 < 0 || var41 >= field859[var40]) {
                        throw new RuntimeException();
                    }
                    field860[var40][var41] = field861[Statics.field1118 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field2864.method2515(var9[var7]);
                    if (var42 == null) {
                        var42 = class326.field3819;
                    }
                    field862[++Statics.field863 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field2864.method2514(var9[var7], field862[--Statics.field863]);
                } else if (var61 == 49) {
                    String var43 = Statics.field2864.method2513(var9[var7]);
                    field862[++Statics.field863 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field2864.method2512(var9[var7], field862[--Statics.field863]);
                } else if (var61 == 60) {
                    class443 var44 = var5.field999[var9[var7]];
                    class432 var45 = (class432) var44.method7525((long) field861[--Statics.field1118]);
                    if (var45 != null) {
                        var7 += var45.field4683;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field1574.method2933(var9[var7]);
                    if (var46 == null) {
                        field861[++Statics.field1118 - 1] = -1;
                    } else {
                        field861[++Statics.field1118 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field1287.method7161(var9[var7]);
                    if (var47 == null) {
                        field861[++Statics.field1118 - 1] = -1;
                    } else {
                        field861[++Statics.field1118 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4686).append(" ");
            for (int var53 = field864 - 1; var53 >= 0; var53--) {
                var52.append("").append(field865[var53].field482.field4686).append(" ");
            }
            var52.append("").append(var10);
            class493.method2879(var52.toString(), var59);
        } finally {
            while (field868.size() > 0) {
                class99 var56 = (class99) field868.remove(0);
                client.method4417(var56.method2460(), var56.method2461(), var56.method2462(), var56.method2467(), "");
            }
            if (field866) {
                field866 = false;
                client.method4763();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class493.method2879("Warning: Script " + var5.field991 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("bb.v(ILbm;ZI)I")
    public static int method2008(int arg0, class76 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2677(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method4747(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2403(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method1144(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method457(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method5204(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method1925(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method6047(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method5183(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method4559(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method6364(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method4747(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2403(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method1144(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method457(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method5204(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method163(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method49(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method2150(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method4497(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method6364(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method7159(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method1634(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method6017(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method856(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method3163(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method4826(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method283(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method4414(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method6284(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method3454(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method3380(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return Statics.method285(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2925(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method4962(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method2134(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method4419(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method91(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method2909(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method2835(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method369(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method1121(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method5258(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method3165(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method2209(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method3726(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method4444(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method7194(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method2241(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ds.x(ILbm;ZI)I")
    public static int method2677(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1118 -= 3;
            int var3 = field861[Statics.field1118];
            int var4 = field861[Statics.field1118 + 1];
            int var5 = field861[Statics.field1118 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class306 var6 = Statics.method3181(var3);
            if (var6.field3684 == null) {
                var6.field3684 = new class306[var5 + 1];
            }
            if (var6.field3684.length <= var5) {
                class306[] var7 = new class306[var5 + 1];
                for (int var8 = 0; var8 < var6.field3684.length; var8++) {
                    var7[var8] = var6.field3684[var8];
                }
                var6.field3684 = var7;
            }
            if (var5 > 0 && var6.field3684[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class306 var9 = new class306();
            var9.field3679 = var4;
            var9.field3561 = var9.field3635 = var6.field3635;
            var9.field3543 = var5;
            var9.field3541 = true;
            if (var4 == 12) {
                var9.method5675();
                var9.method5581().method5341(new class102(var9));
                var9.method5581().method5340(new class103(var9));
            }
            var6.field3684[var5] = var9;
            if (arg2) {
                Statics.field2104 = var9;
            } else {
                Statics.field4355 = var9;
            }
            client.method1922(var6);
            return 1;
        } else if (arg0 == 101) {
            class306 var10 = arg2 ? Statics.field2104 : Statics.field4355;
            class306 var11 = Statics.method3181(var10.field3635);
            var11.field3684[var10.field3543] = null;
            client.method1922(var11);
            return 1;
        } else if (arg0 == 102) {
            class306 var12 = Statics.method3181(field861[--Statics.field1118]);
            var12.field3684 = null;
            client.method1922(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1118 -= 2;
            int var13 = field861[Statics.field1118];
            int var14 = field861[Statics.field1118 + 1];
            class306 var15 = class306.method2472(var13, var14);
            if (var15 == null || var14 == -1) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = 1;
                if (arg2) {
                    Statics.field2104 = var15;
                } else {
                    Statics.field4355 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class306 var16 = Statics.method3181(field861[--Statics.field1118]);
            if (var16 == null) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = 1;
                if (arg2) {
                    Statics.field2104 = var16;
                } else {
                    Statics.field4355 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ij.m(ILbm;ZB)I")
    public static int method4747(int arg0, class76 arg1, boolean arg2) {
        int var3 = -1;
        class306 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field861[--Statics.field1118];
            var4 = Statics.method3181(var3);
        } else {
            var4 = arg2 ? Statics.field2104 : Statics.field4355;
        }
        if (arg0 == 1000) {
            Statics.field1118 -= 4;
            var4.field3551 = field861[Statics.field1118];
            var4.field3552 = field861[Statics.field1118 + 1];
            var4.field3590 = field861[Statics.field1118 + 2];
            var4.field3689 = field861[Statics.field1118 + 3];
            client.method1922(var4);
            Statics.field1488.method1620(var4);
            if (var3 != -1 && var4.field3679 == 0) {
                client.method3169(Statics.field914[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1118 -= 4;
            var4.field3553 = field861[Statics.field1118];
            var4.field3572 = field861[Statics.field1118 + 1];
            var4.field3548 = field861[Statics.field1118 + 2];
            var4.field3550 = field861[Statics.field1118 + 3];
            client.method1922(var4);
            Statics.field1488.method1620(var4);
            if (var3 != -1 && var4.field3679 == 0) {
                client.method3169(Statics.field914[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field861[--Statics.field1118] == 1;
            if (var4.field3595 != var5) {
                var4.field3595 = var5;
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3694 = field861[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3695 = field861[--Statics.field1118] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cg.q(ILbm;ZI)I")
    public static int method2403(int arg0, class76 arg1, boolean arg2) {
        int var3 = -1;
        class306 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field861[--Statics.field1118];
            var4 = Statics.method3181(var3);
        } else {
            var4 = arg2 ? Statics.field2104 : Statics.field4355;
        }
        if (arg0 == 1100) {
            Statics.field1118 -= 2;
            int var5 = field861[Statics.field1118];
            int var6 = field861[Statics.field1118 + 1];
            if (var4.field3679 == 12) {
                class304 var7 = var4.method5581();
                if (var7 != null && var7.method5303(var5, var6)) {
                    client.method1922(var4);
                }
            } else {
                var4.field3570 = var5;
                if (var4.field3570 > var4.field3565 - var4.field3557) {
                    var4.field3570 = var4.field3565 - var4.field3557;
                }
                if (var4.field3570 < 0) {
                    var4.field3570 = 0;
                }
                var4.field3564 = var6;
                if (var4.field3564 > var4.field3566 - var4.field3617) {
                    var4.field3564 = var4.field3566 - var4.field3617;
                }
                if (var4.field3564 < 0) {
                    var4.field3564 = 0;
                }
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3567 = field861[--Statics.field1118];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3571 = field861[--Statics.field1118] == 1;
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3676 = field861[--Statics.field1118];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3575 = field861[--Statics.field1118];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3577 = field861[--Statics.field1118];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3531 = field861[--Statics.field1118];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3559 = field861[--Statics.field1118] == 1;
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3586 = 1;
            var4.field3605 = field861[--Statics.field1118];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1118 -= 6;
            var4.field3592 = field861[Statics.field1118];
            var4.field3687 = field861[Statics.field1118 + 1];
            var4.field3610 = field861[Statics.field1118 + 2];
            var4.field3597 = field861[Statics.field1118 + 3];
            var4.field3596 = field861[Statics.field1118 + 4];
            var4.field3525 = field861[Statics.field1118 + 5];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field861[--Statics.field1118];
            if (var4.field3625 != var8) {
                var4.field3625 = var8;
                var4.field3682 = 0;
                var4.field3683 = 0;
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3600 = field861[--Statics.field1118] == 1;
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field862[--Statics.field863];
            if (!var9.equals(var4.field3604)) {
                var4.field3604 = var9;
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3603 = field861[--Statics.field1118];
            if (var4.field3679 == 12) {
                class304 var10 = var4.method5581();
                if (var10 != null) {
                    var10.method5310();
                }
            }
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1118 -= 3;
            if (var4.field3679 == 12) {
                class304 var11 = var4.method5581();
                if (var11 != null) {
                    var11.method5304(field861[Statics.field1118], field861[Statics.field1118 + 1]);
                    var11.method5305(field861[Statics.field1118 + 2]);
                }
            } else {
                var4.field3607 = field861[Statics.field1118];
                var4.field3670 = field861[Statics.field1118 + 1];
                var4.field3606 = field861[Statics.field1118 + 2];
            }
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3609 = field861[--Statics.field1118] == 1;
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3582 = field861[--Statics.field1118];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3647 = field861[--Statics.field1118];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3584 = field861[--Statics.field1118] == 1;
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3697 = field861[--Statics.field1118] == 1;
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1118 -= 2;
            var4.field3565 = field861[Statics.field1118];
            var4.field3566 = field861[Statics.field1118 + 1];
            client.method1922(var4);
            if (var3 != -1 && var4.field3679 == 0) {
                client.method3169(Statics.field914[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method4874(var4.field3635, var4.field3543);
            client.field687 = var4;
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3640 = field861[--Statics.field1118];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3688 = field861[--Statics.field1118];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3574 = field861[--Statics.field1118];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var12 = field861[--Statics.field1118];
            class479 var13 = (class479) class347.method1688(class479.method2654(), var12);
            if (var13 != null) {
                var4.field3589 = var13;
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var14 = field861[--Statics.field1118] == 1;
            var4.field3576 = var14;
            return 1;
        } else if (arg0 == 1127) {
            boolean var15 = field861[--Statics.field1118] == 1;
            var4.field3601 = var15;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3579 = field862[--Statics.field863];
            client.method1922(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method5699(field862[--Statics.field863], Statics.field1850, client.method3018());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field1118 -= 2;
            var4.method5584(field861[Statics.field1118], field861[Statics.field1118 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5576(field862[--Statics.field863], field861[--Statics.field1118]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field1118--;
            class299 var16 = var4.method5707();
            if (var16 != null) {
                var16.field3455 = field861[Statics.field1118];
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field1118--;
            class299 var17 = var4.method5707();
            if (var17 != null) {
                var17.field3457 = field861[Statics.field1118];
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field863--;
            class304 var18 = var4.method5581();
            if (var18 != null) {
                var4.field3645 = field862[Statics.field863];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field1118--;
            class299 var19 = var4.method5707();
            if (var19 != null) {
                var19.field3456 = field861[Statics.field1118];
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field1118--;
            class304 var20 = var4.method5581();
            if (var20 != null && var20.method5300(field861[Statics.field1118])) {
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field1118--;
            class304 var21 = var4.method5581();
            if (var21 != null && var21.method5301(field861[Statics.field1118])) {
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field1118--;
            class304 var22 = var4.method5581();
            if (var22 != null && var22.method5302(field861[Statics.field1118])) {
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var23 = field861[--Statics.field1118] == 1;
            client.field573.method3718();
            class304 var24 = var4.method5581();
            if (var24 != null && var24.method5294(var23)) {
                if (var23) {
                    client.field573.method3716(var4);
                }
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var25 = field861[--Statics.field1118] == 1;
            if (!var25 && client.field573.method3717() == var4) {
                client.field573.method3718();
                client.method1922(var4);
            }
            class304 var26 = var4.method5581();
            if (var26 != null) {
                var26.method5295(var25);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field1118 -= 2;
            class304 var27 = var4.method5581();
            if (var27 != null && var27.method5318(field861[Statics.field1118], field861[Statics.field1118 + 1])) {
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field1118--;
            class304 var28 = var4.method5581();
            if (var28 != null && var28.method5318(field861[Statics.field1118], field861[Statics.field1118])) {
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field1118--;
            class304 var29 = var4.method5581();
            if (var29 != null) {
                var29.method5429(field861[Statics.field1118]);
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field1118--;
            class304 var30 = var4.method5581();
            if (var30 != null) {
                var30.method5306(field861[Statics.field1118]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field1118--;
            class304 var31 = var4.method5581();
            if (var31 != null) {
                var31.method5458(field861[Statics.field1118]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field1118--;
            class304 var32 = var4.method5581();
            if (var32 != null) {
                var32.method5355(field861[Statics.field1118]);
                client.method1922(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field1118 -= 2;
            class29 var33 = var4.method5601();
            if (var33 != null) {
                var33.method391(field861[Statics.field1118], field861[Statics.field1118 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field1118 -= 2;
            class29 var34 = var4.method5601();
            if (var34 != null) {
                var34.method385((char) field861[Statics.field1118], field861[Statics.field1118 + 1]);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.f(ILbm;ZI)I")
    public static int method1144(int arg0, class76 arg1, boolean arg2) {
        class306 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method3181(field861[--Statics.field1118]);
        } else {
            var3 = arg2 ? Statics.field2104 : Statics.field4355;
        }
        client.method1922(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1118 -= 2;
            int var4 = field861[Statics.field1118];
            int var5 = field861[Statics.field1118 + 1];
            var3.field3547 = var4;
            var3.field3681 = var5;
            class197 var6 = class197.method3345(var4);
            var3.field3610 = var6.field2221;
            var3.field3597 = var6.field2222;
            var3.field3596 = var6.field2229;
            var3.field3592 = var6.field2224;
            var3.field3687 = var6.field2209;
            var3.field3525 = var6.field2220;
            if (arg0 == 1205) {
                var3.field3602 = 0;
            } else if (arg0 == 1212 | var6.field2226 == 1) {
                var3.field3602 = 1;
            } else {
                var3.field3602 = 2;
            }
            if (var3.field3660 > 0) {
                var3.field3525 = var3.field3525 * 32 / var3.field3660;
            } else if (var3.field3553 > 0) {
                var3.field3525 = var3.field3525 * 32 / var3.field3553;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3586 = 2;
            var3.field3605 = field861[--Statics.field1118];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3586 = 3;
            var3.field3605 = Statics.field1790.field1123.method5271();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ar.r(ILbm;ZI)I")
    public static int method457(int arg0, class76 arg1, boolean arg2) {
        boolean var3 = true;
        class306 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = Statics.method3181(field861[--Statics.field1118]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field2104 : Statics.field4355;
        }
        if (arg0 == 1300) {
            int var5 = field861[--Statics.field1118] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5580(var5, field862[--Statics.field863]);
                return 1;
            } else {
                Statics.field863--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1118 -= 2;
            int var6 = field861[Statics.field1118];
            int var7 = field861[Statics.field1118 + 1];
            var4.field3629 = class306.method2472(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3632 = field861[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3630 = field861[--Statics.field1118];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3583 = field861[--Statics.field1118];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3542 = field862[--Statics.field863];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3633 = field862[--Statics.field863];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3628 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3696 = field861[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field1118--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1118 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field861[Statics.field1118 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field861[Statics.field1118 + var10];
                        var9[var10 / 2] = (byte) field861[Statics.field1118 + var10 + 1];
                    }
                }
            } else {
                Statics.field1118 -= 2;
                var8 = new byte[] { (byte) field861[Statics.field1118] };
                var9 = new byte[] { (byte) field861[Statics.field1118 + 1] };
            }
            int var11 = field861[--Statics.field1118] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method259(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1118 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field861[Statics.field1118] };
            byte[] var14 = new byte[] { (byte) field861[Statics.field1118 + 1] };
            method259(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1118 -= 3;
            int var15 = field861[Statics.field1118] - 1;
            int var16 = field861[Statics.field1118 + 1];
            int var17 = field861[Statics.field1118 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method70(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field861[--Statics.field1118];
            int var20 = field861[--Statics.field1118];
            method70(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1118--;
            int var21 = field861[Statics.field1118] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method5957(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method5957(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.u(Lkd;I[B[BB)V")
    public static final void method259(class306 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3623 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3623 = new byte[11][];
            arg0.field3624 = new byte[11][];
            arg0.field3631 = new int[11];
            arg0.field3626 = new int[11];
        }
        arg0.field3623[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3622 = false;
            for (int var4 = 0; var4 < arg0.field3623.length; var4++) {
                if (arg0.field3623[var4] != null) {
                    arg0.field3622 = true;
                    break;
                }
            }
        } else {
            arg0.field3622 = true;
        }
        arg0.field3624[arg1] = arg3;
    }

    @ObfuscatedName("b.b(Lkd;IIIB)V")
    public static final void method70(class306 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3631 == null) {
            throw new RuntimeException();
        }
        arg0.field3631[arg1] = arg2;
        arg0.field3626[arg1] = arg3;
    }

    @ObfuscatedName("lx.j(Lkd;II)V")
    public static final void method5957(class306 arg0, int arg1) {
        if (arg0.field3623 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3693 == null) {
            arg0.field3693 = new int[arg0.field3623.length];
        }
        arg0.field3693[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("kx.g(ILbm;ZS)I")
    public static int method5204(int arg0, class76 arg1, boolean arg2) {
        class306 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method3181(field861[--Statics.field1118]);
        } else {
            var3 = arg2 ? Statics.field2104 : Statics.field4355;
        }
        String var4 = field862[--Statics.field863];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field861[--Statics.field1118];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field861[--Statics.field1118];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field862[--Statics.field863];
            } else {
                var7[var8] = Integer.valueOf(field861[--Statics.field1118]);
            }
        }
        int var9 = field861[--Statics.field1118];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3569 = var7;
        } else if (arg0 == 1401) {
            var3.field3639 = var7;
        } else if (arg0 == 1402) {
            var3.field3578 = var7;
        } else if (arg0 == 1403) {
            var3.field3636 = var7;
        } else if (arg0 == 1404) {
            var3.field3642 = var7;
        } else if (arg0 == 1405) {
            var3.field3690 = var7;
        } else if (arg0 == 1406) {
            var3.field3558 = var7;
        } else if (arg0 == 1407) {
            var3.field3585 = var7;
            var3.field3648 = var5;
        } else if (arg0 == 1408) {
            var3.field3653 = var7;
        } else if (arg0 == 1409) {
            var3.field3580 = var7;
        } else if (arg0 == 1410) {
            var3.field3644 = var7;
        } else if (arg0 == 1411) {
            var3.field3637 = var7;
        } else if (arg0 == 1412) {
            var3.field3686 = var7;
        } else if (arg0 == 1414) {
            var3.field3534 = var7;
            var3.field3587 = var5;
        } else if (arg0 == 1415) {
            var3.field3651 = var7;
            var3.field3544 = var5;
        } else if (arg0 == 1416) {
            var3.field3634 = var7;
        } else if (arg0 == 1417) {
            var3.field3656 = var7;
        } else if (arg0 == 1418) {
            var3.field3657 = var7;
        } else if (arg0 == 1419) {
            var3.field3658 = var7;
        } else if (arg0 == 1420) {
            var3.field3661 = var7;
        } else if (arg0 == 1421) {
            var3.field3613 = var7;
        } else if (arg0 == 1422) {
            var3.field3665 = var7;
        } else if (arg0 == 1423) {
            var3.field3666 = var7;
        } else if (arg0 == 1424) {
            var3.field3667 = var7;
        } else if (arg0 == 1425) {
            var3.field3523 = var7;
        } else if (arg0 == 1426) {
            var3.field3568 = var7;
        } else if (arg0 == 1427) {
            var3.field3668 = var7;
        } else if (arg0 == 1428) {
            var3.field3554 = var7;
        } else if (arg0 == 1429) {
            var3.field3664 = var7;
        } else if (arg0 == 1430) {
            var3.field3659 = var7;
        } else if (arg0 == 1431) {
            var3.field3654 = var7;
        } else if (arg0 == 1434) {
            var3.field3671 = var7;
        } else if (arg0 == 1435) {
            var3.field3655 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class302 var10 = var3.method5599();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3468 = var7;
                } else if (arg0 == 1437) {
                    var10.field3469 = var7;
                } else if (arg0 == 1438) {
                    var10.field3466 = var7;
                } else if (arg0 == 1439) {
                    var10.field3470 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3627 = true;
        return 1;
    }

    @ObfuscatedName("bt.i(ILbm;ZI)I")
    public static int method1925(int arg0, class76 arg1, boolean arg2) {
        class306 var3 = arg2 ? Statics.field2104 : Statics.field4355;
        if (arg0 == 1500) {
            field861[++Statics.field1118 - 1] = var3.field3555;
            return 1;
        } else if (arg0 == 1501) {
            field861[++Statics.field1118 - 1] = var3.field3556;
            return 1;
        } else if (arg0 == 1502) {
            field861[++Statics.field1118 - 1] = var3.field3557;
            return 1;
        } else if (arg0 == 1503) {
            field861[++Statics.field1118 - 1] = var3.field3617;
            return 1;
        } else if (arg0 == 1504) {
            field861[++Statics.field1118 - 1] = var3.field3595 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field861[++Statics.field1118 - 1] = var3.field3561;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ms.o(ILbm;ZI)I")
    public static int method6047(int arg0, class76 arg1, boolean arg2) {
        class306 var3 = arg2 ? Statics.field2104 : Statics.field4355;
        if (arg0 == 1600) {
            field861[++Statics.field1118 - 1] = var3.field3570;
            return 1;
        } else if (arg0 == 1601) {
            field861[++Statics.field1118 - 1] = var3.field3564;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3679 == 12) {
                class304 var4 = var3.method5581();
                if (var4 != null) {
                    field862[++Statics.field863 - 1] = var4.method5418().method6455();
                    return 1;
                }
            }
            field862[++Statics.field863 - 1] = var3.field3604;
            return 1;
        } else if (arg0 == 1603) {
            field861[++Statics.field1118 - 1] = var3.field3565;
            return 1;
        } else if (arg0 == 1604) {
            field861[++Statics.field1118 - 1] = var3.field3566;
            return 1;
        } else if (arg0 == 1605) {
            field861[++Statics.field1118 - 1] = var3.field3525;
            return 1;
        } else if (arg0 == 1606) {
            field861[++Statics.field1118 - 1] = var3.field3610;
            return 1;
        } else if (arg0 == 1607) {
            field861[++Statics.field1118 - 1] = var3.field3596;
            return 1;
        } else if (arg0 == 1608) {
            field861[++Statics.field1118 - 1] = var3.field3597;
            return 1;
        } else if (arg0 == 1609) {
            field861[++Statics.field1118 - 1] = var3.field3676;
            return 1;
        } else if (arg0 == 1610) {
            field861[++Statics.field1118 - 1] = var3.field3574;
            return 1;
        } else if (arg0 == 1611) {
            field861[++Statics.field1118 - 1] = var3.field3567;
            return 1;
        } else if (arg0 == 1612) {
            field861[++Statics.field1118 - 1] = var3.field3688;
            return 1;
        } else if (arg0 == 1613) {
            field861[++Statics.field1118 - 1] = var3.field3589.method32();
            return 1;
        } else if (arg0 == 1614) {
            field861[++Statics.field1118 - 1] = var3.field3601 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class299 var5 = var3.method5707();
                field861[++Statics.field1118 - 1] = var5 == null ? 0 : var5.field3455;
            }
            if (arg0 == 1618) {
                class299 var6 = var3.method5707();
                field861[++Statics.field1118 - 1] = var6 == null ? 0 : var6.field3457;
                return 1;
            } else if (arg0 == 1619) {
                class304 var7 = var3.method5581();
                field862[++Statics.field863 - 1] = var7 == null ? "" : var7.method5307().method6455();
                return 1;
            } else if (arg0 == 1620) {
                class299 var8 = var3.method5707();
                field861[++Statics.field1118 - 1] = var8 == null ? 0 : var8.field3456;
                return 1;
            } else if (arg0 == 1621) {
                class304 var9 = var3.method5581();
                field861[++Statics.field1118 - 1] = var9 == null ? 0 : var9.method5353();
                return 1;
            } else if (arg0 == 1622) {
                class304 var10 = var3.method5581();
                field861[++Statics.field1118 - 1] = var10 == null ? 0 : var10.method5354();
                return 1;
            } else if (arg0 == 1623) {
                class304 var11 = var3.method5581();
                field861[++Statics.field1118 - 1] = var11 == null ? 0 : var11.method5525();
                return 1;
            } else if (arg0 == 1624) {
                class304 var12 = var3.method5581();
                field861[++Statics.field1118 - 1] = var12 != null && var12.method5377() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class304 var13 = var3.method5581();
                field861[++Statics.field1118 - 1] = var13 != null && var13.method5292() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class304 var14 = var3.method5581();
                field862[++Statics.field863 - 1] = var14 == null ? "" : var14.method5344().method6632();
                return 1;
            } else if (arg0 == 1627) {
                class304 var15 = var3.method5581();
                int var16 = var15 == null ? 0 : var15.method5327();
                int var17 = var15 == null ? 0 : var15.method5348();
                field861[++Statics.field1118 - 1] = Math.min(var16, var17);
                field861[++Statics.field1118 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class304 var18 = var3.method5581();
                field861[++Statics.field1118 - 1] = var18 == null ? 0 : var18.method5348();
                return 1;
            } else if (arg0 == 1629) {
                class304 var19 = var3.method5581();
                field861[++Statics.field1118 - 1] = var19 == null ? 0 : var19.method5468();
                return 1;
            } else if (arg0 == 1630) {
                class304 var20 = var3.method5581();
                field861[++Statics.field1118 - 1] = var20 == null ? 0 : var20.method5356();
                return 1;
            } else if (arg0 == 1631) {
                class304 var21 = var3.method5581();
                field861[++Statics.field1118 - 1] = var21 == null ? 0 : var21.method5358();
                return 1;
            } else if (arg0 == 1632) {
                class304 var22 = var3.method5581();
                field861[++Statics.field1118 - 1] = var22 == null ? 0 : var22.method5438();
                return 1;
            } else if (arg0 == 1633) {
                class29 var23 = var3.method5601();
                field861[Statics.field1118 - 1] = var23 == null ? 0 : var23.method384(field861[Statics.field1118 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class29 var24 = var3.method5601();
                field861[Statics.field1118 - 1] = var24 == null ? 0 : var24.method387((char) field861[Statics.field1118 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("kg.n(ILbm;ZI)I")
    public static int method5183(int arg0, class76 arg1, boolean arg2) {
        class306 var3 = arg2 ? Statics.field2104 : Statics.field4355;
        if (arg0 == 1700) {
            field861[++Statics.field1118 - 1] = var3.field3547;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3547 == -1) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = var3.field3681;
            }
            return 1;
        } else if (arg0 == 1702) {
            field861[++Statics.field1118 - 1] = var3.field3543;
            return 1;
        } else if (arg0 == 1707) {
            field861[++Statics.field1118 - 1] = var3.method5586() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method5260(var3);
        } else if (arg0 == 1709) {
            return method2253(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ku.k(Lkd;I)I")
    public static int method5260(class306 arg0) {
        if (arg0.field3679 == 11) {
            String var1 = field862[--Statics.field863];
            field861[++Statics.field1118 - 1] = arg0.method5587(var1);
            return 1;
        } else {
            Statics.field863--;
            field861[++Statics.field1118 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("co.a(Lkd;I)I")
    public static int method2253(class306 arg0) {
        if (arg0.field3679 == 11) {
            String var1 = field862[--Statics.field863];
            field862[++Statics.field863 - 1] = arg0.method5585(var1);
            return 1;
        } else {
            field862[Statics.field863 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("it.s(ILbm;ZI)I")
    public static int method4559(int arg0, class76 arg1, boolean arg2) {
        class306 var3 = arg2 ? Statics.field2104 : Statics.field4355;
        if (arg0 == 1800) {
            field861[++Statics.field1118 - 1] = class307.method2580(client.method3180(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field861[--Statics.field1118];
            int var5 = var4 - 1;
            if (var3.field3628 == null || var5 >= var3.field3628.length || var3.field3628[var5] == null) {
                field862[++Statics.field863 - 1] = "";
            } else {
                field862[++Statics.field863 - 1] = var3.field3628[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3542 == null) {
                field862[++Statics.field863 - 1] = "";
            } else {
                field862[++Statics.field863 - 1] = var3.field3542;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nx.l(ILbm;ZI)I")
    public static int method6364(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field875 >= 10) {
                throw new RuntimeException();
            }
            class306 var10;
            if (arg0 >= 2000) {
                var10 = Statics.method3181(field861[--Statics.field1118]);
            } else {
                var10 = arg2 ? Statics.field2104 : Statics.field4355;
            }
            if (var10.field3668 == null) {
                return 0;
            }
            class85 var11 = new class85();
            var11.field1077 = var10;
            var11.field1079 = var10.field3668;
            var11.field1085 = field875 + 1;
            client.field583.method6081(var11);
            return 1;
        } else if (arg0 == 1928) {
            class306 var3 = arg2 ? Statics.field2104 : Statics.field4355;
            int var4 = field861[--Statics.field1118];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class99 var5 = new class99(var4, var3.field3635, var3.field3543, var3.field3547);
            field868.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field1118 -= 3;
            int var6 = field861[Statics.field1118];
            int var7 = field861[Statics.field1118 + 1];
            int var8 = field861[Statics.field1118 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class99 var9 = new class99(var8, var6, var7, Statics.method3181(var6).field3547);
            field868.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("n.t(ILbm;ZB)I")
    public static int method163(int arg0, class76 arg1, boolean arg2) {
        class306 var3 = Statics.method3181(field861[--Statics.field1118]);
        if (arg0 == 2500) {
            field861[++Statics.field1118 - 1] = var3.field3555;
            return 1;
        } else if (arg0 == 2501) {
            field861[++Statics.field1118 - 1] = var3.field3556;
            return 1;
        } else if (arg0 == 2502) {
            field861[++Statics.field1118 - 1] = var3.field3557;
            return 1;
        } else if (arg0 == 2503) {
            field861[++Statics.field1118 - 1] = var3.field3617;
            return 1;
        } else if (arg0 == 2504) {
            field861[++Statics.field1118 - 1] = var3.field3595 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field861[++Statics.field1118 - 1] = var3.field3561;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("r.c(ILbm;ZI)I")
    public static int method49(int arg0, class76 arg1, boolean arg2) {
        class306 var3 = Statics.method3181(field861[--Statics.field1118]);
        if (arg0 == 2600) {
            field861[++Statics.field1118 - 1] = var3.field3570;
            return 1;
        } else if (arg0 == 2601) {
            field861[++Statics.field1118 - 1] = var3.field3564;
            return 1;
        } else if (arg0 == 2602) {
            field862[++Statics.field863 - 1] = var3.field3604;
            return 1;
        } else if (arg0 == 2603) {
            field861[++Statics.field1118 - 1] = var3.field3565;
            return 1;
        } else if (arg0 == 2604) {
            field861[++Statics.field1118 - 1] = var3.field3566;
            return 1;
        } else if (arg0 == 2605) {
            field861[++Statics.field1118 - 1] = var3.field3525;
            return 1;
        } else if (arg0 == 2606) {
            field861[++Statics.field1118 - 1] = var3.field3610;
            return 1;
        } else if (arg0 == 2607) {
            field861[++Statics.field1118 - 1] = var3.field3596;
            return 1;
        } else if (arg0 == 2608) {
            field861[++Statics.field1118 - 1] = var3.field3597;
            return 1;
        } else if (arg0 == 2609) {
            field861[++Statics.field1118 - 1] = var3.field3676;
            return 1;
        } else if (arg0 == 2610) {
            field861[++Statics.field1118 - 1] = var3.field3574;
            return 1;
        } else if (arg0 == 2611) {
            field861[++Statics.field1118 - 1] = var3.field3567;
            return 1;
        } else if (arg0 == 2612) {
            field861[++Statics.field1118 - 1] = var3.field3688;
            return 1;
        } else if (arg0 == 2613) {
            field861[++Statics.field1118 - 1] = var3.field3589.method32();
            return 1;
        } else if (arg0 == 2614) {
            field861[++Statics.field1118 - 1] = var3.field3601 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class299 var4 = var3.method5707();
                field861[++Statics.field1118 - 1] = var4 == null ? 0 : var4.field3455;
            }
            if (arg0 == 2618) {
                class299 var5 = var3.method5707();
                field861[++Statics.field1118 - 1] = var5 == null ? 0 : var5.field3457;
                return 1;
            } else if (arg0 == 2619) {
                class304 var6 = var3.method5581();
                field862[++Statics.field863 - 1] = var6 == null ? "" : var6.method5307().method6455();
                return 1;
            } else if (arg0 == 2620) {
                class299 var7 = var3.method5707();
                field861[++Statics.field1118 - 1] = var7 == null ? 0 : var7.field3456;
                return 1;
            } else if (arg0 == 2621) {
                class304 var8 = var3.method5581();
                field861[++Statics.field1118 - 1] = var8 == null ? 0 : var8.method5353();
                return 1;
            } else if (arg0 == 2622) {
                class304 var9 = var3.method5581();
                field861[++Statics.field1118 - 1] = var9 == null ? 0 : var9.method5354();
                return 1;
            } else if (arg0 == 2623) {
                class304 var10 = var3.method5581();
                field861[++Statics.field1118 - 1] = var10 == null ? 0 : var10.method5525();
                return 1;
            } else if (arg0 == 2624) {
                class304 var11 = var3.method5581();
                field861[++Statics.field1118 - 1] = var11 != null && var11.method5377() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class304 var12 = var3.method5581();
                field861[++Statics.field1118 - 1] = var12 != null && var12.method5292() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class304 var13 = var3.method5581();
                field862[++Statics.field863 - 1] = var13 == null ? "" : var13.method5344().method6632();
                return 1;
            } else if (arg0 == 2627) {
                class304 var14 = var3.method5581();
                int var15 = var14 == null ? 0 : var14.method5327();
                int var16 = var14 == null ? 0 : var14.method5348();
                field861[++Statics.field1118 - 1] = Math.min(var15, var16);
                field861[++Statics.field1118 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class304 var17 = var3.method5581();
                field861[++Statics.field1118 - 1] = var17 == null ? 0 : var17.method5348();
                return 1;
            } else if (arg0 == 2629) {
                class304 var18 = var3.method5581();
                field861[++Statics.field1118 - 1] = var18 == null ? 0 : var18.method5468();
                return 1;
            } else if (arg0 == 2630) {
                class304 var19 = var3.method5581();
                field861[++Statics.field1118 - 1] = var19 == null ? 0 : var19.method5356();
                return 1;
            } else if (arg0 == 2631) {
                class304 var20 = var3.method5581();
                field861[++Statics.field1118 - 1] = var20 == null ? 0 : var20.method5358();
                return 1;
            } else if (arg0 == 2632) {
                class304 var21 = var3.method5581();
                field861[++Statics.field1118 - 1] = var21 == null ? 0 : var21.method5438();
                return 1;
            } else if (arg0 == 2633) {
                class29 var22 = var3.method5601();
                field861[Statics.field1118 - 1] = var22 == null ? 0 : var22.method384(field861[Statics.field1118 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class29 var23 = var3.method5601();
                field861[Statics.field1118 - 1] = var23 == null ? 0 : var23.method387((char) field861[Statics.field1118 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("cs.p(ILbm;ZI)I")
    public static int method2150(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class306 var3 = Statics.method3181(field861[--Statics.field1118]);
            field861[++Statics.field1118 - 1] = var3.field3547;
            return 1;
        } else if (arg0 == 2701) {
            class306 var4 = Statics.method3181(field861[--Statics.field1118]);
            if (var4.field3547 == -1) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = var4.field3681;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field861[--Statics.field1118];
            class84 var6 = (class84) client.field682.method7535((long) var5);
            if (var6 == null) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field861[++Statics.field1118 - 1] = client.field681;
            return 1;
        } else if (arg0 == 2707) {
            class306 var7 = Statics.method3181(field861[--Statics.field1118]);
            field861[++Statics.field1118 - 1] = var7.method5586() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class306 var8 = Statics.method3181(field861[--Statics.field1118]);
            return method5260(var8);
        } else if (arg0 == 2709) {
            class306 var9 = Statics.method3181(field861[--Statics.field1118]);
            return method2253(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iu.d(ILbm;ZI)I")
    public static int method4497(int arg0, class76 arg1, boolean arg2) {
        class306 var3 = Statics.method3181(field861[--Statics.field1118]);
        if (arg0 == 2800) {
            field861[++Statics.field1118 - 1] = class307.method2580(client.method3180(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field861[--Statics.field1118];
            int var5 = var4 - 1;
            if (var3.field3628 == null || var5 >= var3.field3628.length || var3.field3628[var5] == null) {
                field862[++Statics.field863 - 1] = "";
            } else {
                field862[++Statics.field863 - 1] = var3.field3628[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3542 == null) {
                field862[++Statics.field863 - 1] = "";
            } else {
                field862[++Statics.field863 - 1] = var3.field3542;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("om.y(ILbm;ZB)I")
    public static int method7159(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field862[--Statics.field863];
            class107.method3247(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1118 -= 2;
            client.method4873(Statics.field1790, field861[Statics.field1118], field861[Statics.field1118 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field869) {
                field866 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field862[--Statics.field863];
            int var5 = 0;
            if (class361.method6052(var4)) {
                var5 = class361.method7156(var4);
            }
            class278 var6 = class278.method2890(class276.field3078, client.field567.field1425);
            var6.field3177.method7778(var5);
            client.field567.method2603(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field862[--Statics.field863];
            class278 var8 = class278.method2890(class276.field3093, client.field567.field1425);
            var8.field3177.method7789(var7.length() + 1);
            var8.field3177.method7782(var7);
            client.field567.method2603(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field862[--Statics.field863];
            class278 var10 = class278.method2890(class276.field3126, client.field567.field1425);
            var10.field3177.method7789(var9.length() + 1);
            var10.field3177.method7782(var9);
            client.field567.method2603(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field861[--Statics.field1118];
            String var12 = field862[--Statics.field863];
            client.method819(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1118 -= 3;
            int var13 = field861[Statics.field1118];
            int var14 = field861[Statics.field1118 + 1];
            int var15 = field861[Statics.field1118 + 2];
            class306 var16 = Statics.method3181(var15);
            client.method245(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1118 -= 2;
            int var17 = field861[Statics.field1118];
            int var18 = field861[Statics.field1118 + 1];
            class306 var19 = arg2 ? Statics.field2104 : Statics.field4355;
            client.method245(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field2773 = field861[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field861[++Statics.field1118 - 1] = Statics.field2126.method2285() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field2126.method2359(field861[--Statics.field1118] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field862[--Statics.field863];
            boolean var21 = field861[--Statics.field1118] == 1;
            class33.method6066(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field861[--Statics.field1118];
            class278 var23 = class278.method2890(class276.field3135, client.field567.field1425);
            var23.field3177.method7776(var22);
            client.field567.method2603(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field861[--Statics.field1118];
            Statics.field863 -= 2;
            String var25 = field862[Statics.field863];
            String var26 = field862[Statics.field863 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class278 var27 = class278.method2890(class276.field3116, client.field567.field1425);
                var27.field3177.method7776(1 + class467.method155(var25) + class467.method155(var26));
                var27.field3177.method7822(var24);
                var27.field3177.method7782(var26);
                var27.field3177.method7782(var25);
                client.field567.method2603(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field672 = field861[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field669 = field861[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field546 = field861[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field861[--Statics.field1118] == 1) {
                client.field737 |= 0x1;
            } else {
                client.field737 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field861[--Statics.field1118] == 1) {
                client.field737 |= 0x2;
            } else {
                client.field737 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field861[--Statics.field1118] == 1) {
                client.field737 |= 0x4;
            } else {
                client.field737 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field861[--Statics.field1118] == 1) {
                client.field737 |= 0x8;
            } else {
                client.field737 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field737 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field540 = field861[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field634 = field861[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method6281(field861[--Statics.field1118] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field861[++Statics.field1118 - 1] = client.method4267() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1118 -= 2;
            client.field661 = field861[Statics.field1118];
            client.field600 = field861[Statics.field1118 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1118 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1118--;
            return 1;
        } else if (arg0 == 3132) {
            field861[++Statics.field1118 - 1] = Statics.field2331;
            field861[++Statics.field1118 - 1] = Statics.field4300;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1118--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1118 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field792 = 3;
            client.field684 = field861[--Statics.field1118];
            return 1;
        } else if (arg0 == 3137) {
            client.field792 = 2;
            client.field684 = field861[--Statics.field1118];
            return 1;
        } else if (arg0 == 3138) {
            client.field792 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field792 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field792 = 3;
            client.field684 = arg2 ? Statics.field2104.field3635 : Statics.field4355.field3635;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field861[--Statics.field1118] == 1;
            Statics.field2126.method2334(var28);
            return 1;
        } else if (arg0 == 3142) {
            field861[++Statics.field1118 - 1] = Statics.field2126.method2286() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field861[--Statics.field1118] == 1;
            client.field556 = var29;
            if (!var29) {
                Statics.field2126.method2302("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field861[++Statics.field1118 - 1] = client.field556 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field861[--Statics.field1118] == 1;
            Statics.field2126.method2321(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field861[++Statics.field1118 - 1] = Statics.field2126.method2301() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field861[++Statics.field1118 - 1] = class73.field926;
            return 1;
        } else if (arg0 == 3154) {
            field861[++Statics.field1118 - 1] = client.method1913();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field863--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1118 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1118--;
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1118--;
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field863--;
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1118--;
            field862[++Statics.field863 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1118--;
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1118 -= 2;
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1118 -= 2;
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1118 -= 2;
            field862[++Statics.field863 - 1] = "";
            field862[++Statics.field863 - 1] = "";
            field862[++Statics.field863 - 1] = "";
            field862[++Statics.field863 - 1] = "";
            field862[++Statics.field863 - 1] = "";
            field862[++Statics.field863 - 1] = "";
            field862[++Statics.field863 - 1] = "";
            field862[++Statics.field863 - 1] = "";
            field862[++Statics.field863 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1118--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1118--;
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1118--;
            return 1;
        } else if (arg0 == 3175) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field863--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field863--;
            return 1;
        } else if (arg0 == 3181) {
            client.method161(field861[--Statics.field1118]);
            return 1;
        } else if (arg0 == 3182) {
            field861[++Statics.field1118 - 1] = Statics.method4932();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field861[--Statics.field1118];
            class199 var32 = class199.method4223(var31);
            if (var32.method3671()) {
                class199.method1988(var32.field2283);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.z(ILbm;ZI)I")
    public static int method1634(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1118 -= 3;
            Statics.method12(field861[Statics.field1118], field861[Statics.field1118 + 1], field861[Statics.field1118 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method3170(field861[--Statics.field1118]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1118 -= 2;
            client.method188(field861[Statics.field1118], field861[Statics.field1118 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class88 var15 = class88.field1115;
            class87 var16 = class87.field1107;
            int var17 = field861[--Statics.field1118];
            if (arg0 == 3212) {
                int var18 = field861[--Statics.field1118];
                var15 = (class88) class347.method1688(class88.method3112(), var18);
                if (var15 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var18));
                }
            }
            if (arg0 == 3213) {
                int var19 = field861[--Statics.field1118];
                var16 = (class87) class347.method1688(class87.method4870(), var19);
                if (var16 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var19));
                }
            }
            if (arg0 == 3209) {
                int var20 = field861[--Statics.field1118];
                var15 = (class88) class347.method1688(class88.method3112(), var20);
                if (var15 == null) {
                    var16 = (class87) class347.method1688(class87.method4870(), var20);
                    if (var16 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var20));
                    }
                }
            } else if (arg0 == 3181) {
                var15 = class88.field1119;
            } else if (arg0 == 3203) {
                var16 = class87.field1098;
            } else if (arg0 == 3205) {
                var16 = class87.field1101;
            } else if (arg0 == 3207) {
                var16 = class87.field1102;
            }
            if (class87.field1107 == var16) {
                switch(var15.field1116) {
                    case 1:
                        Statics.field2126.method2334(var17 == 1);
                        break;
                    case 2:
                        Statics.field2126.method2321(var17 == 1);
                        break;
                    case 3:
                        Statics.field2126.method2343(var17 == 1);
                        break;
                    case 4:
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        Statics.field2126.method2293(var17);
                        break;
                    case 5:
                        client.method161(var17);
                        break;
                    default:
                        String var21 = String.format("Unkown device option: %s.", var15.toString());
                        throw new RuntimeException(var21);
                }
            } else {
                switch(var16.field1100) {
                    case 1:
                        Statics.field2126.method2359(var17 == 1);
                        break;
                    case 2:
                        int var27 = Math.min(Math.max(var17, 0), 100);
                        int var28 = Math.round((float) (var27 * 255) / 100.0F);
                        client.method5248(var28);
                        break;
                    case 3:
                        int var25 = Math.min(Math.max(var17, 0), 100);
                        int var26 = Math.round((float) (var25 * 127) / 100.0F);
                        client.method38(var26);
                        break;
                    case 4:
                        int var23 = Math.min(Math.max(var17, 0), 100);
                        int var24 = Math.round((float) (var23 * 127) / 100.0F);
                        client.method261(var24);
                        break;
                    default:
                        String var22 = String.format("Unkown game option: %s.", var16.toString());
                        throw new RuntimeException(var22);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class88 var3 = class88.field1115;
            class87 var4 = class87.field1107;
            boolean var5 = false;
            if (arg0 == 3214) {
                int var6 = field861[--Statics.field1118];
                var3 = (class88) class347.method1688(class88.method3112(), var6);
                if (var3 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                }
            }
            if (arg0 == 3215) {
                int var7 = field861[--Statics.field1118];
                var4 = (class87) class347.method1688(class87.method4870(), var7);
                if (var4 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                }
            }
            if (arg0 == 3210) {
                int var8 = field861[--Statics.field1118];
                var3 = (class88) class347.method1688(class88.method3112(), var8);
                if (var3 == null) {
                    var4 = (class87) class347.method1688(class87.method4870(), var8);
                    if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var8));
                    }
                }
            } else if (arg0 == 3182) {
                var3 = class88.field1119;
            } else if (arg0 == 3204) {
                var4 = class87.field1098;
            } else if (arg0 == 3206) {
                var4 = class87.field1101;
            } else if (arg0 == 3208) {
                var4 = class87.field1102;
            }
            int var10;
            if (class87.field1107 == var4) {
                switch(var3.field1116) {
                    case 1:
                        var10 = Statics.field2126.method2286() ? 1 : 0;
                        break;
                    case 2:
                        var10 = Statics.field2126.method2301() ? 1 : 0;
                        break;
                    case 3:
                        var10 = Statics.field2126.method2292() ? 1 : 0;
                        break;
                    case 4:
                        var10 = Statics.field2126.method2294();
                        break;
                    case 5:
                        var10 = Statics.method4932();
                        break;
                    default:
                        String var9 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var9);
                }
            } else {
                switch(var4.field1100) {
                    case 1:
                        var10 = Statics.field2126.method2285() ? 1 : 0;
                        break;
                    case 2:
                        int var14 = Statics.field2126.method2298();
                        var10 = Math.round((float) (var14 * 100) / 255.0F);
                        break;
                    case 3:
                        int var13 = Statics.field2126.method2299();
                        var10 = Math.round((float) (var13 * 100) / 127.0F);
                        break;
                    case 4:
                        int var12 = Statics.field2126.method2379();
                        var10 = Math.round((float) (var12 * 100) / 127.0F);
                        break;
                    default:
                        String var11 = String.format("Unkown game option: %s.", var4.toString());
                        throw new RuntimeException(var11);
                }
            }
            field861[++Statics.field1118 - 1] = var10;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mx.w(ILbm;ZI)I")
    public static int method6017(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field861[++Statics.field1118 - 1] = client.field519;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1118 -= 2;
            int var3 = field861[Statics.field1118];
            int var4 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = class82.method258(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1118 -= 2;
            int var5 = field861[Statics.field1118];
            int var6 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = class82.method2387(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1118 -= 2;
            int var7 = field861[Statics.field1118];
            int var8 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = class82.method3730(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = class177.method5784(var9).field1916;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field581[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field653[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field654[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field4488;
            int var14 = (Statics.field1790.field1243 >> 7) + Statics.field1780;
            int var15 = (Statics.field1790.field1179 >> 7) + Statics.field4368;
            field861[++Statics.field1118 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field861[++Statics.field1118 - 1] = client.field510 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1118 -= 2;
            int var19 = field861[Statics.field1118] + 32768;
            int var20 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = class82.method258(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1118 -= 2;
            int var21 = field861[Statics.field1118] + 32768;
            int var22 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = class82.method2387(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1118 -= 2;
            int var23 = field861[Statics.field1118] + 32768;
            int var24 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = class82.method3730(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field769 >= 2) {
                field861[++Statics.field1118 - 1] = client.field769;
            } else {
                field861[++Statics.field1118 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field861[++Statics.field1118 - 1] = client.field525;
            return 1;
        } else if (arg0 == 3318) {
            field861[++Statics.field1118 - 1] = client.field683;
            return 1;
        } else if (arg0 == 3321) {
            field861[++Statics.field1118 - 1] = client.field630 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field861[++Statics.field1118 - 1] = client.field689;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field729) {
                field861[++Statics.field1118 - 1] = 1;
            } else {
                field861[++Statics.field1118 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field861[++Statics.field1118 - 1] = client.field596;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1118 -= 4;
            int var25 = field861[Statics.field1118];
            int var26 = field861[Statics.field1118 + 1];
            int var27 = field861[Statics.field1118 + 2];
            int var28 = field861[Statics.field1118 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field861[++Statics.field1118 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field861[++Statics.field1118 - 1] = client.field521;
            return 1;
        } else if (arg0 == 3327) {
            field861[++Statics.field1118 - 1] = client.field553;
            return 1;
        } else if (arg0 == 3331) {
            field861[++Statics.field1118 - 1] = client.field630;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.as(ILbm;ZI)I")
    public static int method856(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1118 -= 2;
            int var3 = field861[Statics.field1118];
            int var4 = field861[Statics.field1118 + 1];
            class184 var5 = class184.method2161(var3);
            if (var5.field2000 != 's') {
            }
            for (int var6 = 0; var6 < var5.field2003; var6++) {
                if (var5.field1998[var6] == var4) {
                    field862[++Statics.field863 - 1] = var5.field2005[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field862[++Statics.field863 - 1] = var5.field2001;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1118 -= 4;
            int var7 = field861[Statics.field1118];
            int var8 = field861[Statics.field1118 + 1];
            int var9 = field861[Statics.field1118 + 2];
            int var10 = field861[Statics.field1118 + 3];
            class184 var11 = class184.method2161(var9);
            if (var11.field1999 != var7 || var11.field2000 != var8) {
                if (var8 == 115) {
                    field862[++Statics.field863 - 1] = class326.field3819;
                } else {
                    field861[++Statics.field1118 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field2003; var12++) {
                if (var11.field1998[var12] == var10) {
                    if (var8 == 115) {
                        field862[++Statics.field863 - 1] = var11.field2005[var12];
                    } else {
                        field861[++Statics.field1118 - 1] = var11.field2006[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field862[++Statics.field863 - 1] = var11.field2001;
                } else {
                    field861[++Statics.field1118 - 1] = var11.field2002;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field861[--Statics.field1118];
            class184 var14 = class184.method2161(var13);
            field861[++Statics.field1118 - 1] = var14.method3302();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ft.ad(ILbm;ZI)I")
    public static int method3163(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field748.method3737(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field748.method3757(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field748.method3735(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ic.ao(ILbm;ZI)I")
    public static int method4826(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field4582.field834 == 0) {
                field861[++Statics.field1118 - 1] = -2;
            } else if (Statics.field4582.field834 == 1) {
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = Statics.field4582.field829.method6865();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field861[--Statics.field1118];
            if (Statics.field4582.method1719() && var3 >= 0 && var3 < Statics.field4582.field829.method6865()) {
                class391 var4 = (class391) Statics.field4582.field829.method6875(var3);
                field862[++Statics.field863 - 1] = var4.method6841();
                field862[++Statics.field863 - 1] = var4.method6847();
            } else {
                field862[++Statics.field863 - 1] = "";
                field862[++Statics.field863 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field861[--Statics.field1118];
            if (Statics.field4582.method1719() && var5 >= 0 && var5 < Statics.field4582.field829.method6865()) {
                field861[++Statics.field1118 - 1] = ((class398) Statics.field4582.field829.method6875(var5)).field4543;
            } else {
                field861[++Statics.field1118 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field861[--Statics.field1118];
            if (Statics.field4582.method1719() && var6 >= 0 && var6 < Statics.field4582.field829.method6865()) {
                field861[++Statics.field1118 - 1] = ((class398) Statics.field4582.field829.method6875(var6)).field4544;
            } else {
                field861[++Statics.field1118 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field862[--Statics.field863];
            int var8 = field861[--Statics.field1118];
            class66.method3039(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field862[--Statics.field863];
            Statics.field4582.method1707(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field862[--Statics.field863];
            Statics.field4582.method1712(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field862[--Statics.field863];
            Statics.field4582.method1728(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field862[--Statics.field863];
            Statics.field4582.method1700(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field862[--Statics.field863];
            String var14 = client.method4961(var13);
            field861[++Statics.field1118 - 1] = Statics.field4582.method1706(new class490(var14, Statics.field986), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field3324 == null) {
                field862[++Statics.field863 - 1] = "";
            } else {
                field862[++Statics.field863 - 1] = Statics.field3324.field4512;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field3324 == null) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = Statics.field3324.method6865();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field861[--Statics.field1118];
            if (Statics.field3324 == null || var15 >= Statics.field3324.method6865()) {
                field862[++Statics.field863 - 1] = "";
            } else {
                field862[++Statics.field863 - 1] = Statics.field3324.method6875(var15).method6844().method8383();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field861[--Statics.field1118];
            if (Statics.field3324 == null || var16 >= Statics.field3324.method6865()) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = ((class398) Statics.field3324.method6875(var16)).method6939();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field861[--Statics.field1118];
            if (Statics.field3324 == null || var17 >= Statics.field3324.method6865()) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = ((class398) Statics.field3324.method6875(var17)).field4544;
            }
            return 1;
        } else if (arg0 == 3616) {
            field861[++Statics.field1118 - 1] = Statics.field3324 == null ? 0 : Statics.field3324.field4514;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field862[--Statics.field863];
            client.method703(var18);
            return 1;
        } else if (arg0 == 3618) {
            field861[++Statics.field1118 - 1] = Statics.field3324 == null ? 0 : Statics.field3324.field4513;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field862[--Statics.field863];
            client.method6814(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method54();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field4582.method1719()) {
                field861[++Statics.field1118 - 1] = Statics.field4582.field830.method6865();
            } else {
                field861[++Statics.field1118 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field861[--Statics.field1118];
            if (Statics.field4582.method1719() && var20 >= 0 && var20 < Statics.field4582.field830.method6865()) {
                class397 var21 = (class397) Statics.field4582.field830.method6875(var20);
                field862[++Statics.field863 - 1] = var21.method6841();
                field862[++Statics.field863 - 1] = var21.method6847();
            } else {
                field862[++Statics.field863 - 1] = "";
                field862[++Statics.field863 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field862[--Statics.field863];
            String var23 = client.method4961(var22);
            field861[++Statics.field1118 - 1] = Statics.field4582.method1701(new class490(var23, Statics.field986)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field861[--Statics.field1118];
            if (Statics.field3324 == null || var24 >= Statics.field3324.method6865() || !Statics.field3324.method6875(var24).method6844().equals(Statics.field1790.field1136)) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field3324 == null || Statics.field3324.field4518 == null) {
                field862[++Statics.field863 - 1] = "";
            } else {
                field862[++Statics.field863 - 1] = Statics.field3324.field4518;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field861[--Statics.field1118];
            if (Statics.field3324 == null || var25 >= Statics.field3324.method6865() || !((class393) Statics.field3324.method6875(var25)).method6816()) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field861[--Statics.field1118];
            if (Statics.field3324 == null || var26 >= Statics.field3324.method6865() || !((class393) Statics.field3324.method6875(var26)).method6832()) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field4582.field829.method6868();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field861[--Statics.field1118] == 1;
            Statics.field4582.field829.method6919(new class473(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field861[--Statics.field1118] == 1;
            Statics.field4582.field829.method6919(new class474(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field861[--Statics.field1118] == 1;
            Statics.field4582.field829.method6919(new class116(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field861[--Statics.field1118] == 1;
            Statics.field4582.field829.method6919(new class112(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field861[--Statics.field1118] == 1;
            Statics.field4582.field829.method6919(new class115(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field861[--Statics.field1118] == 1;
            Statics.field4582.field829.method6919(new class120(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field861[--Statics.field1118] == 1;
            Statics.field4582.field829.method6919(new class114(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field861[--Statics.field1118] == 1;
            Statics.field4582.field829.method6919(new class113(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field861[--Statics.field1118] == 1;
            Statics.field4582.field829.method6919(new class117(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field861[--Statics.field1118] == 1;
            Statics.field4582.field829.method6919(new class118(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field4582.field829.method6917();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field4582.field830.method6868();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field861[--Statics.field1118] == 1;
            Statics.field4582.field830.method6919(new class473(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field861[--Statics.field1118] == 1;
            Statics.field4582.field830.method6919(new class474(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field4582.field830.method6917();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field3324 != null) {
                Statics.field3324.method6868();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field861[--Statics.field1118] == 1;
            if (Statics.field3324 != null) {
                Statics.field3324.method6919(new class473(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field861[--Statics.field1118] == 1;
            if (Statics.field3324 != null) {
                Statics.field3324.method6919(new class474(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field861[--Statics.field1118] == 1;
            if (Statics.field3324 != null) {
                Statics.field3324.method6919(new class116(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field861[--Statics.field1118] == 1;
            if (Statics.field3324 != null) {
                Statics.field3324.method6919(new class112(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field861[--Statics.field1118] == 1;
            if (Statics.field3324 != null) {
                Statics.field3324.method6919(new class115(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field861[--Statics.field1118] == 1;
            if (Statics.field3324 != null) {
                Statics.field3324.method6919(new class120(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field861[--Statics.field1118] == 1;
            if (Statics.field3324 != null) {
                Statics.field3324.method6919(new class114(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field861[--Statics.field1118] == 1;
            if (Statics.field3324 != null) {
                Statics.field3324.method6919(new class113(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field861[--Statics.field1118] == 1;
            if (Statics.field3324 != null) {
                Statics.field3324.method6919(new class117(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field861[--Statics.field1118] == 1;
            if (Statics.field3324 != null) {
                Statics.field3324.method6919(new class118(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field3324 != null) {
                Statics.field3324.method6917();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field861[--Statics.field1118] == 1;
            Statics.field4582.field829.method6919(new class119(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field861[--Statics.field1118] == 1;
            if (Statics.field3324 != null) {
                Statics.field3324.method6919(new class119(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("c.am(ILbm;ZI)I")
    public static int method283(int arg0, class76 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("hj.av(ILbm;ZB)I")
    public static int method4414(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field115 == null) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = 1;
                Statics.field1574 = Statics.field115;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field861[--Statics.field1118];
            if (client.field754[var3] == null) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = 1;
                Statics.field1574 = client.field754[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field862[++Statics.field863 - 1] = Statics.field1574.field1726;
            return 1;
        } else if (arg0 == 3803) {
            field861[++Statics.field1118 - 1] = Statics.field1574.field1728 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field861[++Statics.field1118 - 1] = Statics.field1574.field1729;
            return 1;
        } else if (arg0 == 3805) {
            field861[++Statics.field1118 - 1] = Statics.field1574.field1730;
            return 1;
        } else if (arg0 == 3806) {
            field861[++Statics.field1118 - 1] = Statics.field1574.field1735;
            return 1;
        } else if (arg0 == 3807) {
            field861[++Statics.field1118 - 1] = Statics.field1574.field1732;
            return 1;
        } else if (arg0 == 3809) {
            field861[++Statics.field1118 - 1] = Statics.field1574.field1733;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field861[--Statics.field1118];
            field862[++Statics.field863 - 1] = Statics.field1574.field1738[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = Statics.field1574.field1744[var5];
            return 1;
        } else if (arg0 == 3812) {
            field861[++Statics.field1118 - 1] = Statics.field1574.field1742;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field861[--Statics.field1118];
            field862[++Statics.field863 - 1] = Statics.field1574.field1743[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field1118 -= 3;
            int var7 = field861[Statics.field1118];
            int var8 = field861[Statics.field1118 + 1];
            int var9 = field861[Statics.field1118 + 2];
            field861[++Statics.field1118 - 1] = Statics.field1574.method2932(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field861[++Statics.field1118 - 1] = Statics.field1574.field1740;
            return 1;
        } else if (arg0 == 3816) {
            field861[++Statics.field1118 - 1] = Statics.field1574.field1741;
            return 1;
        } else if (arg0 == 3817) {
            field861[++Statics.field1118 - 1] = Statics.field1574.method2929(field862[--Statics.field863]);
            return 1;
        } else if (arg0 == 3818) {
            field861[Statics.field1118 - 1] = Statics.field1574.method2960()[field861[Statics.field1118 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field1118 -= 2;
            int var10 = field861[Statics.field1118];
            int var11 = field861[Statics.field1118 + 1];
            client.method5841(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = Statics.field1574.field1721[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field1118 -= 3;
                int var13 = field861[Statics.field1118];
                boolean var14 = field861[Statics.field1118 + 1] == 1;
                int var15 = field861[Statics.field1118 + 2];
                client.method4230(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field861[--Statics.field1118];
                field861[++Statics.field1118 - 1] = Statics.field1574.field1725[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1959 == null) {
                    field861[++Statics.field1118 - 1] = 0;
                } else {
                    field861[++Statics.field1118 - 1] = 1;
                    Statics.field1957 = Statics.field1959;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field861[--Statics.field1118];
                if (client.field633[var17] == null) {
                    field861[++Statics.field1118 - 1] = 0;
                } else {
                    field861[++Statics.field1118 - 1] = 1;
                    Statics.field1957 = client.field633[var17];
                    Statics.field79 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field862[++Statics.field863 - 1] = Statics.field1957.field1796;
                return 1;
            } else if (arg0 == 3853) {
                field861[++Statics.field1118 - 1] = Statics.field1957.field1800;
                return 1;
            } else if (arg0 == 3854) {
                field861[++Statics.field1118 - 1] = Statics.field1957.field1797;
                return 1;
            } else if (arg0 == 3855) {
                field861[++Statics.field1118 - 1] = Statics.field1957.method3022();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field861[--Statics.field1118];
                field862[++Statics.field863 - 1] = ((class139) Statics.field1957.field1804.get(var18)).field1662.method8383();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field861[--Statics.field1118];
                field861[++Statics.field1118 - 1] = ((class139) Statics.field1957.field1804.get(var19)).field1665;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field861[--Statics.field1118];
                field861[++Statics.field1118 - 1] = ((class139) Statics.field1957.field1804.get(var20)).field1664;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field861[--Statics.field1118];
                client.method1092(Statics.field79, var21);
                return 1;
            } else if (arg0 == 3860) {
                field861[++Statics.field1118 - 1] = Statics.field1957.method3023(field862[--Statics.field863]);
                return 1;
            } else if (arg0 == 3861) {
                field861[Statics.field1118 - 1] = Statics.field1957.method3019()[field861[Statics.field1118 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field861[++Statics.field1118 - 1] = Statics.field1287 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("my.au(ILbm;ZI)I")
    public static int method6284(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field717[var3].method6006();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field717[var4].field4270;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field717[var5].field4271;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field717[var6].field4272;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field717[var7].field4274;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.field717[var8].field4269;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field861[--Statics.field1118];
            int var10 = client.field717[var9].method6000();
            field861[++Statics.field1118 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field861[--Statics.field1118];
            int var12 = client.field717[var11].method6000();
            field861[++Statics.field1118 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field861[--Statics.field1118];
            int var14 = client.field717[var13].method6000();
            field861[++Statics.field1118 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field861[--Statics.field1118];
            int var16 = client.field717[var15].method6000();
            field861[++Statics.field1118 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field861[--Statics.field1118] == 1;
            if (Statics.field1057 != null) {
                Statics.field1057.method5944(class335.field4242, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field861[--Statics.field1118] == 1;
            if (Statics.field1057 != null) {
                Statics.field1057.method5944(class335.field4239, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1118 -= 2;
            boolean var19 = field861[Statics.field1118] == 1;
            boolean var20 = field861[Statics.field1118 + 1] == 1;
            if (Statics.field1057 != null) {
                client.field797.field503 = var20;
                Statics.field1057.method5944(client.field797, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field861[--Statics.field1118] == 1;
            if (Statics.field1057 != null) {
                Statics.field1057.method5944(class335.field4244, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field861[--Statics.field1118] == 1;
            if (Statics.field1057 != null) {
                Statics.field1057.method5944(class335.field4243, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field861[++Statics.field1118 - 1] = Statics.field1057 == null ? 0 : Statics.field1057.field4240.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field861[--Statics.field1118];
            class341 var24 = (class341) Statics.field1057.field4240.get(var23);
            field861[++Statics.field1118 - 1] = var24.field4266;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field861[--Statics.field1118];
            class341 var26 = (class341) Statics.field1057.field4240.get(var25);
            field862[++Statics.field863 - 1] = var26.method5996();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field861[--Statics.field1118];
            class341 var28 = (class341) Statics.field1057.field4240.get(var27);
            field862[++Statics.field863 - 1] = var28.method5993();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field861[--Statics.field1118];
            class341 var30 = (class341) Statics.field1057.field4240.get(var29);
            long var31 = Statics.method1118() - Statics.field2825 - var30.field4265;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field862[++Statics.field863 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field861[--Statics.field1118];
            class341 var38 = (class341) Statics.field1057.field4240.get(var37);
            field861[++Statics.field1118 - 1] = var38.field4268.field4272;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field861[--Statics.field1118];
            class341 var40 = (class341) Statics.field1057.field4240.get(var39);
            field861[++Statics.field1118 - 1] = var40.field4268.field4271;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field861[--Statics.field1118];
            class341 var42 = (class341) Statics.field1057.field4240.get(var41);
            field861[++Statics.field1118 - 1] = var42.field4268.field4270;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gv.ar(ILbm;ZI)I")
    public static int method3454(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1118 -= 2;
            int var3 = field861[Statics.field1118];
            int var4 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1118 -= 2;
            int var5 = field861[Statics.field1118];
            int var6 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1118 -= 2;
            int var7 = field861[Statics.field1118];
            int var8 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1118 -= 2;
            int var9 = field861[Statics.field1118];
            int var10 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1118 -= 5;
            int var13 = field861[Statics.field1118];
            int var14 = field861[Statics.field1118 + 1];
            int var15 = field861[Statics.field1118 + 2];
            int var16 = field861[Statics.field1118 + 3];
            int var17 = field861[Statics.field1118 + 4];
            field861[++Statics.field1118 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1118 -= 2;
            int var18 = field861[Statics.field1118];
            int var19 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1118 -= 2;
            int var20 = field861[Statics.field1118];
            int var21 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1118 -= 2;
            int var22 = field861[Statics.field1118];
            int var23 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1118 -= 2;
            int var24 = field861[Statics.field1118];
            int var25 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1118 -= 2;
            int var26 = field861[Statics.field1118];
            int var27 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1118 -= 2;
            int var28 = field861[Statics.field1118];
            int var29 = field861[Statics.field1118 + 1];
            if (var28 == 0) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1118 -= 2;
            int var30 = field861[Statics.field1118];
            int var31 = field861[Statics.field1118 + 1];
            if (var30 == 0) {
                field861[++Statics.field1118 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field861[++Statics.field1118 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field861[++Statics.field1118 - 1] = var30;
                    break;
                case 2:
                    field861[++Statics.field1118 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field861[++Statics.field1118 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field861[++Statics.field1118 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field861[++Statics.field1118 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1118 -= 2;
            int var32 = field861[Statics.field1118];
            int var33 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1118 -= 2;
            int var34 = field861[Statics.field1118];
            int var35 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1118 -= 3;
            long var36 = (long) field861[Statics.field1118];
            long var38 = (long) field861[Statics.field1118 + 1];
            long var40 = (long) field861[Statics.field1118 + 2];
            field861[++Statics.field1118 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class285.method4442(field861[--Statics.field1118]);
            field861[++Statics.field1118 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field1118 -= 2;
            int var43 = field861[Statics.field1118];
            int var44 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field1118 -= 3;
            int var45 = field861[Statics.field1118];
            int var46 = field861[Statics.field1118 + 1];
            int var47 = field861[Statics.field1118 + 2];
            field861[++Statics.field1118 - 1] = class285.method4871(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field1118 -= 3;
            int var48 = field861[Statics.field1118];
            int var49 = field861[Statics.field1118 + 1];
            int var50 = field861[Statics.field1118 + 2];
            field861[++Statics.field1118 - 1] = class285.method3041(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field1118 -= 3;
            int var51 = field861[Statics.field1118];
            int var52 = field861[Statics.field1118 + 1];
            int var53 = field861[Statics.field1118 + 2];
            int var54 = 31 - var53;
            field861[++Statics.field1118 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field1118 -= 4;
            int var55 = field861[Statics.field1118];
            int var56 = field861[Statics.field1118 + 1];
            int var57 = field861[Statics.field1118 + 2];
            int var58 = field861[Statics.field1118 + 3];
            int var59 = class285.method3041(var55, var57, var58);
            int var60 = class285.method2235(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field861[++Statics.field1118 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field861[Statics.field1118 - 1] = class425.method3103(field861[Statics.field1118 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field861[Statics.field1118 - 1] = class425.method837(field861[Statics.field1118 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field1118 -= 2;
            int var61 = field861[Statics.field1118];
            int var62 = field861[Statics.field1118 + 1];
            int var63 = class425.method6931(var61, var62);
            field861[++Statics.field1118 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field861[Statics.field1118 - 1] = Math.abs(field861[Statics.field1118 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gz.at(ILbm;ZI)I")
    public static int method3380(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field862[--Statics.field863];
            int var4 = field861[--Statics.field1118];
            field862[++Statics.field863 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field863 -= 2;
            String var5 = field862[Statics.field863];
            String var6 = field862[Statics.field863 + 1];
            field862[++Statics.field863 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field862[--Statics.field863];
            int var8 = field861[--Statics.field1118];
            field862[++Statics.field863 - 1] = var7 + class361.method5737(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field862[--Statics.field863];
            field862[++Statics.field863 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field861[--Statics.field1118];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field857.setTime(new Date(var11));
            int var13 = field857.get(5);
            int var14 = field857.get(2);
            int var15 = field857.get(1);
            field862[++Statics.field863 - 1] = var13 + "-" + field867[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field863 -= 2;
            String var16 = field862[Statics.field863];
            String var17 = field862[Statics.field863 + 1];
            if (Statics.field1790.field1123 == null || Statics.field1790.field1123.field3475 == 0) {
                field862[++Statics.field863 - 1] = var16;
            } else {
                field862[++Statics.field863 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field861[--Statics.field1118];
            field862[++Statics.field863 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field863 -= 2;
            field861[++Statics.field1118 - 1] = Statics.method2927(class362.method4421(field862[Statics.field863], field862[Statics.field863 + 1], Statics.field1905));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field862[--Statics.field863];
            Statics.field1118 -= 2;
            int var20 = field861[Statics.field1118];
            int var21 = field861[Statics.field1118 + 1];
            byte[] var22 = Statics.field4350.method5909(var21, 0);
            class368 var23 = new class368(var22);
            field861[++Statics.field1118 - 1] = var23.method6523(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field862[--Statics.field863];
            Statics.field1118 -= 2;
            int var25 = field861[Statics.field1118];
            int var26 = field861[Statics.field1118 + 1];
            byte[] var27 = Statics.field4350.method5909(var26, 0);
            class368 var28 = new class368(var27);
            field861[++Statics.field1118 - 1] = var28.method6522(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field863 -= 2;
            String var29 = field862[Statics.field863];
            String var30 = field862[Statics.field863 + 1];
            if (field861[--Statics.field1118] == 1) {
                field862[++Statics.field863 - 1] = var29;
            } else {
                field862[++Statics.field863 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field862[--Statics.field863];
            field862[++Statics.field863 - 1] = class372.method6553(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field862[--Statics.field863];
            int var33 = field861[--Statics.field1118];
            field862[++Statics.field863 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = class361.method3001((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = class361.method3573((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = class361.method4401((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = class361.method4452((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field862[--Statics.field863];
            if (var38 == null) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field862[--Statics.field863];
            Statics.field1118 -= 2;
            int var40 = field861[Statics.field1118];
            int var41 = field861[Statics.field1118 + 1];
            field862[++Statics.field863 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field862[--Statics.field863];
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
            field862[++Statics.field863 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field862[--Statics.field863];
            int var48 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field863 -= 2;
            String var49 = field862[Statics.field863];
            String var50 = field862[Statics.field863 + 1];
            int var51 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field862[--Statics.field863];
            field862[++Statics.field863 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field863 -= 3;
            String var53 = field862[Statics.field863];
            String var54 = field862[Statics.field863 + 1];
            String var55 = field862[Statics.field863 + 2];
            if (Statics.field1790.field1123 == null) {
                field862[++Statics.field863 - 1] = var55;
                return 1;
            }
            switch(Statics.field1790.field1123.field3477) {
                case 0:
                    field862[++Statics.field863 - 1] = var53;
                    break;
                case 1:
                    field862[++Statics.field863 - 1] = var54;
                    break;
                case 2:
                default:
                    field862[++Statics.field863 - 1] = var55;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eb.an(ILbm;ZB)I")
    public static int method2925(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field861[++Statics.field1118 - 1] = client.field743;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1118 -= 3;
            client.field743 = field861[Statics.field1118];
            Statics.field1288 = class486.method4415(field861[Statics.field1118 + 1]);
            if (Statics.field1288 == null) {
                Statics.field1288 = class486.field5048;
            }
            client.field744 = field861[Statics.field1118 + 2];
            class278 var3 = class278.method2890(class276.field3086, client.field567.field1425);
            var3.field3177.method7789(client.field743);
            var3.field3177.method7789(Statics.field1288.field5051);
            var3.field3177.method7789(client.field744);
            client.field567.method2603(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field862[--Statics.field863];
            Statics.field1118 -= 2;
            int var5 = field861[Statics.field1118];
            int var6 = field861[Statics.field1118 + 1];
            class278 var7 = class278.method2890(class276.field3088, client.field567.field1425);
            var7.field3177.method7789(class467.method155(var4) + 2);
            var7.field3177.method7782(var4);
            var7.field3177.method7789(var5 - 1);
            var7.field3177.method7789(var6);
            client.field567.method2603(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1118 -= 2;
            int var8 = field861[Statics.field1118];
            int var9 = field861[Statics.field1118 + 1];
            class62 var10 = class107.method2855(var8, var9);
            if (var10 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
                field862[++Statics.field863 - 1] = "";
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = var10.field487;
                field861[++Statics.field1118 - 1] = var10.field495;
                field862[++Statics.field863 - 1] = var10.field489 == null ? "" : var10.field489;
                field862[++Statics.field863 - 1] = var10.field491 == null ? "" : var10.field491;
                field862[++Statics.field863 - 1] = var10.field492 == null ? "" : var10.field492;
                field861[++Statics.field1118 - 1] = var10.method1099() ? 1 : (var10.method1102() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field861[--Statics.field1118];
            class62 var12 = class107.method2023(var11);
            if (var12 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
                field862[++Statics.field863 - 1] = "";
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = var12.field486;
                field861[++Statics.field1118 - 1] = var12.field495;
                field862[++Statics.field863 - 1] = var12.field489 == null ? "" : var12.field489;
                field862[++Statics.field863 - 1] = var12.field491 == null ? "" : var12.field491;
                field862[++Statics.field863 - 1] = var12.field492 == null ? "" : var12.field492;
                field861[++Statics.field1118 - 1] = var12.method1099() ? 1 : (var12.method1102() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1288 == null) {
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = Statics.field1288.field5051;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field862[--Statics.field863];
            int var14 = field861[--Statics.field1118];
            class278 var15 = class491.method8045(var14, var13, Statics.field1905, -1);
            client.field567.method2603(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field863 -= 2;
            String var16 = field862[Statics.field863];
            String var17 = field862[Statics.field863 + 1];
            class278 var18 = class278.method2890(class276.field3119, client.field567.field1425);
            var18.field3177.method7776(0);
            int var19 = var18.field3177.field4915;
            var18.field3177.method7782(var16);
            class309.method6981(var18.field3177, var17);
            var18.field3177.method7788(var18.field3177.field4915 - var19);
            client.field567.method2603(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field862[--Statics.field863];
            Statics.field1118 -= 2;
            int var21 = field861[Statics.field1118];
            int var22 = field861[Statics.field1118 + 1];
            class278 var23 = class491.method8045(var21, var20, Statics.field1905, var22);
            client.field567.method2603(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field1790 == null || Statics.field1790.field1136 == null) {
                var24 = "";
            } else {
                var24 = Statics.field1790.field1136.method8383();
            }
            field862[++Statics.field863 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field861[++Statics.field1118 - 1] = client.field744;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = class107.method2892(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = class107.method5762(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = class107.method2027(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field862[--Statics.field863];
            client.method3007(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field745 = field862[--Statics.field863].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field862[++Statics.field863 - 1] = client.field745;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field862[--Statics.field863];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field1118 -= 2;
            int var30 = field861[Statics.field1118];
            int var31 = field861[Statics.field1118 + 1];
            class62 var32 = class107.method2855(var30, var31);
            if (var32 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
                field862[++Statics.field863 - 1] = "";
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = var32.field487;
                field861[++Statics.field1118 - 1] = var32.field495;
                field862[++Statics.field863 - 1] = var32.field489 == null ? "" : var32.field489;
                field862[++Statics.field863 - 1] = var32.field491 == null ? "" : var32.field491;
                field862[++Statics.field863 - 1] = var32.field492 == null ? "" : var32.field492;
                field861[++Statics.field1118 - 1] = var32.method1099() ? 1 : (var32.method1102() ? 2 : 0);
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field861[--Statics.field1118];
            class62 var34 = class107.method2023(var33);
            if (var34 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
                field862[++Statics.field863 - 1] = "";
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = var34.field486;
                field861[++Statics.field1118 - 1] = var34.field495;
                field862[++Statics.field863 - 1] = var34.field489 == null ? "" : var34.field489;
                field862[++Statics.field863 - 1] = var34.field491 == null ? "" : var34.field491;
                field862[++Statics.field863 - 1] = var34.field492 == null ? "" : var34.field492;
                field861[++Statics.field1118 - 1] = var34.method1099() ? 1 : (var34.method1102() ? 2 : 0);
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jc.ab(ILbm;ZI)I")
    public static int method4962(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field861[++Statics.field1118 - 1] = client.method1127();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field861[--Statics.field1118];
            if (var3 == 1 || var3 == 2) {
                Statics.method2483(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field861[++Statics.field1118 - 1] = Statics.field2126.method2307();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field861[--Statics.field1118];
            if (var4 == 1 || var4 == 2) {
                Statics.field2126.method2333(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1118--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cw.al(ILbm;ZI)I")
    public static int method2134(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1118 -= 2;
            int var3 = field861[Statics.field1118];
            int var4 = field861[Statics.field1118 + 1];
            if (!client.field772) {
                client.field588 = var3;
                client.field589 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field861[++Statics.field1118 - 1] = client.field588;
            return 1;
        } else if (arg0 == 5506) {
            field861[++Statics.field1118 - 1] = client.field589;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field861[--Statics.field1118];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field750 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field861[++Statics.field1118 - 1] = client.field750;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hb.ag(ILbm;ZB)I")
    public static int method4419(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field568 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cz.az(IB)I")
    public static int method2474(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("lr.ak(IB)I")
    public static int method5945(int arg0) {
        return (int) ((Math.log((double) arg0) / field872 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("j.af(ILbm;ZI)I")
    public static int method91(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1118 -= 2;
            client.field779 = (short) method2474(field861[Statics.field1118]);
            if (client.field779 <= 0) {
                client.field779 = 256;
            }
            client.field551 = (short) method2474(field861[Statics.field1118 + 1]);
            if (client.field551 <= 0) {
                client.field551 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1118 -= 2;
            client.field781 = (short) field861[Statics.field1118];
            if (client.field781 <= 0) {
                client.field781 = 256;
            }
            client.field673 = (short) field861[Statics.field1118 + 1];
            if (client.field673 <= 0) {
                client.field673 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1118 -= 4;
            client.field691 = (short) field861[Statics.field1118];
            if (client.field691 <= 0) {
                client.field691 = 1;
            }
            client.field784 = (short) field861[Statics.field1118 + 1];
            if (client.field784 <= 0) {
                client.field784 = 32767;
            } else if (client.field784 < client.field691) {
                client.field784 = client.field691;
            }
            client.field785 = (short) field861[Statics.field1118 + 2];
            if (client.field785 <= 0) {
                client.field785 = 1;
            }
            client.field511 = (short) field861[Statics.field1118 + 3];
            if (client.field511 <= 0) {
                client.field511 = 32767;
            } else if (client.field511 < client.field785) {
                client.field511 = client.field785;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field770 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = -1;
            } else {
                client.method2923(0, 0, client.field770.field3557, client.field770.field3617, false);
                field861[++Statics.field1118 - 1] = client.field789;
                field861[++Statics.field1118 - 1] = client.field688;
            }
            return 1;
        } else if (arg0 == 6204) {
            field861[++Statics.field1118 - 1] = client.field781;
            field861[++Statics.field1118 - 1] = client.field673;
            return 1;
        } else if (arg0 == 6205) {
            field861[++Statics.field1118 - 1] = method5945(client.field779);
            field861[++Statics.field1118 - 1] = method5945(client.field551);
            return 1;
        } else if (arg0 == 6220) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field861[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field861[++Statics.field1118 - 1] = Statics.field2331;
            return 1;
        } else if (arg0 == 6223) {
            field861[++Statics.field1118 - 1] = Statics.field4300;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ex.ai(ILbm;ZB)I")
    public static int method2909(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field861[++Statics.field1118 - 1] = class65.method422() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class65 var3 = class65.method5291();
            if (var3 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
            } else {
                field861[++Statics.field1118 - 1] = var3.field812;
                field861[++Statics.field1118 - 1] = var3.field818;
                field862[++Statics.field863 - 1] = var3.field815;
                field861[++Statics.field1118 - 1] = var3.field821;
                field861[++Statics.field1118 - 1] = var3.field819;
                field862[++Statics.field863 - 1] = var3.field820;
            }
            return 1;
        } else if (arg0 == 6502) {
            class65 var4 = class65.method2715();
            if (var4 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
            } else {
                field861[++Statics.field1118 - 1] = var4.field812;
                field861[++Statics.field1118 - 1] = var4.field818;
                field862[++Statics.field863 - 1] = var4.field815;
                field861[++Statics.field1118 - 1] = var4.field821;
                field861[++Statics.field1118 - 1] = var4.field819;
                field862[++Statics.field863 - 1] = var4.field820;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field861[--Statics.field1118];
            class65 var6 = null;
            for (int var7 = 0; var7 < class65.field813; var7++) {
                if (Statics.field814[var7].field812 == var5) {
                    var6 = Statics.field814[var7];
                    break;
                }
            }
            if (var6 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
            } else {
                field861[++Statics.field1118 - 1] = var6.field812;
                field861[++Statics.field1118 - 1] = var6.field818;
                field862[++Statics.field863 - 1] = var6.field815;
                field861[++Statics.field1118 - 1] = var6.field821;
                field861[++Statics.field1118 - 1] = var6.field819;
                field862[++Statics.field863 - 1] = var6.field820;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1118 -= 4;
            int var8 = field861[Statics.field1118];
            boolean var9 = field861[Statics.field1118 + 1] == 1;
            int var10 = field861[Statics.field1118 + 2];
            boolean var11 = field861[Statics.field1118 + 3] == 1;
            class65.method7181(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field861[--Statics.field1118];
            if (var12 >= 0 && var12 < class65.field813) {
                class65 var13 = Statics.field814[var12];
                field861[++Statics.field1118 - 1] = var13.field812;
                field861[++Statics.field1118 - 1] = var13.field818;
                field862[++Statics.field863 - 1] = var13.field815;
                field861[++Statics.field1118 - 1] = var13.field821;
                field861[++Statics.field1118 - 1] = var13.field819;
                field862[++Statics.field863 - 1] = var13.field820;
            } else {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
                field861[++Statics.field1118 - 1] = 0;
                field861[++Statics.field1118 - 1] = 0;
                field862[++Statics.field863 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field666 = field861[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1118 -= 2;
            int var14 = field861[Statics.field1118];
            int var15 = field861[Statics.field1118 + 1];
            class193 var16 = class193.method3003(var15);
            if (var16.method3440()) {
                field862[++Statics.field863 - 1] = class187.method2847(var14).method3326(var15, var16.field2118);
            } else {
                field861[++Statics.field1118 - 1] = class187.method2847(var14).method3325(var15, var16.field2120);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1118 -= 2;
            int var17 = field861[Statics.field1118];
            int var18 = field861[Statics.field1118 + 1];
            class193 var19 = class193.method3003(var18);
            if (var19.method3440()) {
                field862[++Statics.field863 - 1] = class196.method3208(var17).method3526(var18, var19.field2118);
            } else {
                field861[++Statics.field1118 - 1] = class196.method3208(var17).method3525(var18, var19.field2120);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1118 -= 2;
            int var20 = field861[Statics.field1118];
            int var21 = field861[Statics.field1118 + 1];
            class193 var22 = class193.method3003(var21);
            if (var22.method3440()) {
                field862[++Statics.field863 - 1] = class197.method3345(var20).method3589(var21, var22.field2118);
            } else {
                field861[++Statics.field1118 - 1] = class197.method3345(var20).method3588(var21, var22.field2120);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1118 -= 2;
            int var23 = field861[Statics.field1118];
            int var24 = field861[Statics.field1118 + 1];
            class193 var25 = class193.method3003(var24);
            if (var25.method3440()) {
                field862[++Statics.field863 - 1] = class194.method2704(var23).method3460(var24, var25.field2118);
            } else {
                field861[++Statics.field1118 - 1] = class194.method2704(var23).method3459(var24, var25.field2120);
            }
            return 1;
        } else if (arg0 == 6518) {
            field861[++Statics.field1118 - 1] = client.field749 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field861[++Statics.field1118 - 1] = client.field603;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field863--;
            Statics.field1118--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field863--;
            Statics.field1118--;
            return 1;
        } else if (arg0 == 6524) {
            field861[++Statics.field1118 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field861[++Statics.field1118 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field861[++Statics.field1118 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field861[++Statics.field1118 - 1] = client.field699;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dj.ax(ILbm;ZI)I")
    public static int method2835(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field4488;
            int var4 = (Statics.field1790.field1243 >> 7) + Statics.field1780;
            int var5 = (Statics.field1790.field1179 >> 7) + Statics.field4368;
            client.method1635().method7281(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field861[--Statics.field1118];
            String var7 = "";
            class238 var8 = client.method1635().method7298(var6);
            if (var8 != null) {
                var7 = var8.method4541();
            }
            field862[++Statics.field863 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field861[--Statics.field1118];
            client.method1635().method7282(var9);
            return 1;
        } else if (arg0 == 6603) {
            field861[++Statics.field1118 - 1] = client.method1635().method7295();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field861[--Statics.field1118];
            client.method1635().method7292(var10);
            return 1;
        } else if (arg0 == 6605) {
            field861[++Statics.field1118 - 1] = client.method1635().method7423() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class297 var11 = new class297(field861[--Statics.field1118]);
            client.method1635().method7358(var11.field3451, var11.field3452);
            return 1;
        } else if (arg0 == 6607) {
            class297 var12 = new class297(field861[--Statics.field1118]);
            client.method1635().method7300(var12.field3451, var12.field3452);
            return 1;
        } else if (arg0 == 6608) {
            class297 var13 = new class297(field861[--Statics.field1118]);
            client.method1635().method7299(var13.field3450, var13.field3451, var13.field3452);
            return 1;
        } else if (arg0 == 6609) {
            class297 var14 = new class297(field861[--Statics.field1118]);
            client.method1635().method7386(var14.field3450, var14.field3451, var14.field3452);
            return 1;
        } else if (arg0 == 6610) {
            field861[++Statics.field1118 - 1] = client.method1635().method7369();
            field861[++Statics.field1118 - 1] = client.method1635().method7303();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field861[--Statics.field1118];
            class238 var16 = client.method1635().method7298(var15);
            if (var16 == null) {
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = var16.method4512().method5225();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field861[--Statics.field1118];
            class238 var18 = client.method1635().method7298(var17);
            if (var18 == null) {
                field861[++Statics.field1118 - 1] = 0;
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = (var18.method4516() - var18.method4527() + 1) * 64;
                field861[++Statics.field1118 - 1] = (var18.method4518() - var18.method4517() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field861[--Statics.field1118];
            class238 var20 = client.method1635().method7298(var19);
            if (var20 == null) {
                field861[++Statics.field1118 - 1] = 0;
                field861[++Statics.field1118 - 1] = 0;
                field861[++Statics.field1118 - 1] = 0;
                field861[++Statics.field1118 - 1] = 0;
            } else {
                field861[++Statics.field1118 - 1] = var20.method4527() * 64;
                field861[++Statics.field1118 - 1] = var20.method4517() * 64;
                field861[++Statics.field1118 - 1] = var20.method4516() * 64 + 64 - 1;
                field861[++Statics.field1118 - 1] = var20.method4518() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field861[--Statics.field1118];
            class238 var22 = client.method1635().method7298(var21);
            if (var22 == null) {
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = var22.method4514();
            }
            return 1;
        } else if (arg0 == 6615) {
            class297 var23 = client.method1635().method7453();
            if (var23 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = var23.field3451;
                field861[++Statics.field1118 - 1] = var23.field3452;
            }
            return 1;
        } else if (arg0 == 6616) {
            field861[++Statics.field1118 - 1] = client.method1635().method7418();
            return 1;
        } else if (arg0 == 6617) {
            class297 var24 = new class297(field861[--Statics.field1118]);
            class238 var25 = client.method1635().method7283();
            if (var25 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4539(var24.field3450, var24.field3451, var24.field3452);
            if (var26 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = var26[0];
                field861[++Statics.field1118 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class297 var27 = new class297(field861[--Statics.field1118]);
            class238 var28 = client.method1635().method7283();
            if (var28 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = -1;
                return 1;
            }
            class297 var29 = var28.method4507(var27.field3451, var27.field3452);
            if (var29 == null) {
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = var29.method5225();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1118 -= 2;
            int var30 = field861[Statics.field1118];
            class297 var31 = new class297(field861[Statics.field1118 + 1]);
            method2473(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1118 -= 2;
            int var32 = field861[Statics.field1118];
            class297 var33 = new class297(field861[Statics.field1118 + 1]);
            method2473(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1118 -= 2;
            int var34 = field861[Statics.field1118];
            class297 var35 = new class297(field861[Statics.field1118 + 1]);
            class238 var36 = client.method1635().method7298(var34);
            if (var36 == null) {
                field861[++Statics.field1118 - 1] = 0;
                return 1;
            } else {
                field861[++Statics.field1118 - 1] = var36.method4548(var35.field3450, var35.field3451, var35.field3452) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field861[++Statics.field1118 - 1] = client.method1635().method7305();
            field861[++Statics.field1118 - 1] = client.method1635().method7306();
            return 1;
        } else if (arg0 == 6623) {
            class297 var37 = new class297(field861[--Statics.field1118]);
            class238 var38 = client.method1635().method7280(var37.field3450, var37.field3451, var37.field3452);
            if (var38 == null) {
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = var38.method4509();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1635().method7307(field861[--Statics.field1118]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1635().method7308();
            return 1;
        } else if (arg0 == 6626) {
            client.method1635().method7399(field861[--Statics.field1118]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1635().method7437();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field861[--Statics.field1118] == 1;
            client.method1635().method7311(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field861[--Statics.field1118];
            client.method1635().method7312(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field861[--Statics.field1118];
            client.method1635().method7313(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1635().method7314();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field861[--Statics.field1118] == 1;
            client.method1635().method7276(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1118 -= 2;
            int var43 = field861[Statics.field1118];
            boolean var44 = field861[Statics.field1118 + 1] == 1;
            client.method1635().method7316(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1118 -= 2;
            int var45 = field861[Statics.field1118];
            boolean var46 = field861[Statics.field1118 + 1] == 1;
            client.method1635().method7317(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field861[++Statics.field1118 - 1] = client.method1635().method7318() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.method1635().method7457(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field861[--Statics.field1118];
            field861[++Statics.field1118 - 1] = client.method1635().method7380(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1118 -= 2;
            int var49 = field861[Statics.field1118];
            class297 var50 = new class297(field861[Statics.field1118 + 1]);
            class297 var51 = client.method1635().method7323(var49, var50);
            if (var51 == null) {
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = var51.method5225();
            }
            return 1;
        } else if (arg0 == 6639) {
            class256 var52 = client.method1635().method7325();
            if (var52 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = var52.method4455();
                field861[++Statics.field1118 - 1] = var52.field3003.method5225();
            }
            return 1;
        } else if (arg0 == 6640) {
            class256 var53 = client.method1635().method7415();
            if (var53 == null) {
                field861[++Statics.field1118 - 1] = -1;
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = var53.method4455();
                field861[++Statics.field1118 - 1] = var53.field3003.method5225();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field861[--Statics.field1118];
            class179 var55 = class179.method3153(var54);
            if (var55.field1933 == null) {
                field862[++Statics.field863 - 1] = "";
            } else {
                field862[++Statics.field863 - 1] = var55.field1933;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field861[--Statics.field1118];
            class179 var57 = class179.method3153(var56);
            field861[++Statics.field1118 - 1] = var57.field1936;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field861[--Statics.field1118];
            class179 var59 = class179.method3153(var58);
            if (var59 == null) {
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = var59.field1950;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field861[--Statics.field1118];
            class179 var61 = class179.method3153(var60);
            if (var61 == null) {
                field861[++Statics.field1118 - 1] = -1;
            } else {
                field861[++Statics.field1118 - 1] = var61.field1926;
            }
            return 1;
        } else if (arg0 == 6697) {
            field861[++Statics.field1118 - 1] = Statics.field4277.field3020;
            return 1;
        } else if (arg0 == 6698) {
            field861[++Statics.field1118 - 1] = Statics.field4277.field3018.method5225();
            return 1;
        } else if (arg0 == 6699) {
            field861[++Statics.field1118 - 1] = Statics.field4277.field3019.method5225();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("as.ah(ILbm;ZB)I")
    public static int method369(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field861[--Statics.field1118];
            class187 var4 = class187.method2847(var3);
            field862[++Statics.field863 - 1] = var4 == null ? "" : var4.field2025;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field1118 -= 2;
            class187 var5 = class187.method2847(Statics.field1118);
            int var6 = field861[Statics.field1118 + 1];
            field861[++Statics.field1118 - 1] = var5.method3318(var6);
            field861[++Statics.field1118 - 1] = var5.method3328(var6);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.aw(ILbm;ZI)I")
    public static int method1121(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field861[--Statics.field1118];
            class196 var4 = class196.method3208(var3);
            field862[++Statics.field863 - 1] = var4 == null ? "" : var4.field2163;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ku.aj(ILbm;ZB)I")
    public static int method5258(int arg0, class76 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("fs.aq(ILbm;ZI)I")
    public static int method3165(int arg0, class76 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("cj.ap(ILbm;ZI)I")
    public static int method2209(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field861[++Statics.field1118 - 1] = client.method3418() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gb.aa(ILbm;ZI)I")
    public static int method3726(int arg0, class76 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("iq.ae(ILbm;ZB)I")
    public static int method4444(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field861[--Statics.field1118] == 1;
            client.method3811(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pv.ac(ILbm;ZI)I")
    public static int method7194(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field861[--Statics.field1118];
            Object var45 = method2876(var44);
            int var46 = field861[--Statics.field1118];
            class461 var47 = client.method2280(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class463.method3109(var46);
            Statics.field334 = var47.method7693(var45, var48);
            if (Statics.field334 == null) {
                client.field801 = -1;
                Statics.field4461 = null;
                if (arg0 == 7500) {
                    field861[++Statics.field1118 - 1] = 0;
                }
            } else {
                client.field801 = class463.method5261(var46);
                Statics.field4461 = Statics.field334.iterator();
                if (arg0 == 7500) {
                    field861[++Statics.field1118 - 1] = Statics.field334.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field4461 != null && Statics.field4461.hasNext()) {
                field861[++Statics.field1118 - 1] = (Integer) Statics.field4461.next();
            } else {
                field861[++Statics.field1118 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field1118 -= 3;
            int var3 = field861[Statics.field1118];
            int var4 = field861[Statics.field1118 + 1];
            int var5 = field861[Statics.field1118 + 2];
            int var6 = class463.method5261(var4);
            int var7 = class463.method7689(var4);
            int var8 = class463.method3109(var4);
            class462 var9 = class462.method2238(var3);
            class460 var10 = class460.method2928(var6);
            int[] var11 = var10.field4884[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method7703(var7);
            if (var14 == null && var10.field4881 != null) {
                var14 = var10.field4881[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class457 var17 = class455.method73(var16);
                    if (class457.field4872 == var17) {
                        field862[++Statics.field863 - 1] = "";
                    } else {
                        field861[++Statics.field1118 - 1] = class455.method260(var16);
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
                class457 var21 = class455.method73(var11[var19]);
                if (class457.field4872 == var21) {
                    field862[++Statics.field863 - 1] = (String) var14[var20];
                } else {
                    field861[++Statics.field1118 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field1118 -= 2;
            int var22 = field861[Statics.field1118];
            int var23 = field861[Statics.field1118 + 1];
            int var24 = 0;
            int var25 = class463.method5261(var23);
            int var26 = class463.method7689(var23);
            class462 var27 = class462.method2238(var22);
            class460 var28 = class460.method2928(var25);
            int[] var29 = var28.field4884[var26];
            Object[] var30 = var27.method7703(var26);
            if (var30 == null && var28.field4881 != null) {
                var30 = var28.field4881[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field861[++Statics.field1118 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field1118--;
            int var41 = field861[Statics.field1118];
            class461 var42 = client.method7152(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field334 = var42.method7693(0, 0);
            int var43 = 0;
            if (Statics.field334 != null) {
                client.field801 = var41;
                Statics.field4461 = Statics.field334.iterator();
                var43 = Statics.field334.size();
            }
            if (arg0 == 7504) {
                field861[++Statics.field1118 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field861[--Statics.field1118];
            class462 var32 = class462.method2238(var31);
            field861[++Statics.field1118 - 1] = var32.field4892;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field861[--Statics.field1118];
            int var34 = -1;
            if (Statics.field334 != null && var33 >= 0 && var33 < Statics.field334.size()) {
                var34 = (Integer) Statics.field334.get(var33);
            }
            field861[++Statics.field1118 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field861[--Statics.field1118];
            Object var36 = method2876(var35);
            int var37 = field861[--Statics.field1118];
            class461 var38 = client.method2280(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class463.method5261(var37) != client.field801) {
                throw new RuntimeException();
            } else if (Statics.field334 == null && Statics.field334.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class463.method3109(var37);
                List var40 = var38.method7693(var36, var39);
                Statics.field334 = new LinkedList(Statics.field334);
                if (var40 == null) {
                    Statics.field334.clear();
                } else {
                    Statics.field334.retainAll(var40);
                }
                Statics.field4461 = Statics.field334.iterator();
                if (arg0 == 7507) {
                    field861[++Statics.field1118 - 1] = Statics.field334.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cu.bh(ILbm;ZB)I")
    public static int method2241(int arg0, class76 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("au.by(IB)V")
    public static void method446(int arg0) {
        if (arg0 == -1 || !class306.method2497(arg0)) {
            return;
        }
        class306[] var1 = Statics.field914[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class306 var3 = var1[var2];
            if (var3.field3680 != null) {
                class85 var4 = new class85();
                var4.field1077 = var3;
                var4.field1079 = var3.field3680;
                method2823(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("cz.bw(ILky;ZB)V")
    public static void method2473(int arg0, class297 arg1, boolean arg2) {
        class238 var3 = client.method1635().method7298(arg0);
        int var4 = Statics.field1790.field1143;
        int var5 = (Statics.field1790.field1243 >> 7) + Statics.field1780;
        int var6 = (Statics.field1790.field1179 >> 7) + Statics.field4368;
        class297 var7 = new class297(var4, var5, var6);
        client.method1635().method7328(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("ml.bp(Lqr;B)Ljava/lang/Object;")
    public static Object method6055(class457 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field4873) {
            case 0:
                return field861[--Statics.field1118];
            case 1:
                return field862[--Statics.field863];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("ew.bc(II)Ljava/lang/Object;")
    public static Object method2876(int arg0) {
        return method6055((class457) class347.method1688(class457.method7658(), arg0));
    }
}
