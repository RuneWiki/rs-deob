package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("cr")
public class class73 {

    @ObfuscatedName("cr.an")
    public static int[] field862 = new int[5];

    @ObfuscatedName("cr.aj")
    public static int[][] field872 = new int[5][5000];

    @ObfuscatedName("cr.av")
    public static int[] field863 = new int[1000];

    @ObfuscatedName("cr.ai")
    public static String[] field858 = new String[1000];

    @ObfuscatedName("cr.au")
    public static int field865 = 0;

    @ObfuscatedName("cr.ah")
    public static class64[] field866 = new class64[50];

    @ObfuscatedName("cr.ao")
    public static Calendar field868 = Calendar.getInstance();

    @ObfuscatedName("cr.aa")
    public static final String[] field869 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cr.aw")
    public static boolean field864 = false;

    @ObfuscatedName("cr.at")
    public static boolean field871 = false;

    @ObfuscatedName("cr.af")
    public static ArrayList field861 = new ArrayList();

    @ObfuscatedName("cr.am")
    public static int field873 = 0;

    @ObfuscatedName("cr.be")
    public static final double field870 = Math.log(2.0D);

    public class73() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.aq(Ldu;I)V")
    public static void method2137(class90 arg0) {
        method5835(arg0, 500000, 475000);
    }

    @ObfuscatedName("no.ad(Ldu;III)V")
    public static void method5835(class90 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1088;
        class81 var5;
        if (class545.method3370(arg0.field1092)) {
            Statics.field3005 = (class271) var3[0];
            class182 var4 = class182.method3196(Statics.field3005.field2755);
            var5 = class81.method4011(arg0.field1092, var4.field1890, var4.field1893);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class81.method3463(var6);
        }
        if (var5 != null) {
            method5525(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("mb.ag(Ldu;Ldg;III)V")
    public static void method5525(class90 arg0, class81 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1088;
        Statics.field1535 = 0;
        Statics.field3663 = 0;
        int var5 = -1;
        int[] var6 = arg1.field1004;
        int[] var7 = arg1.field1005;
        byte var8 = -1;
        field865 = 0;
        field864 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            StringBuilder var50;
            try {
                Statics.field860 = new int[arg1.field1007];
                int var11 = 0;
                Statics.field75 = new String[arg1.field1003];
                int var12 = 0;
                for (int var13 = 1; var13 < var4.length; var13++) {
                    if (var4[var13] instanceof Integer) {
                        int var14 = (Integer) var4[var13];
                        if (var14 == -2147483647) {
                            var14 = arg0.field1083;
                        }
                        if (var14 == -2147483646) {
                            var14 = arg0.field1085;
                        }
                        if (var14 == -2147483645) {
                            var14 = arg0.field1086 == null ? -1 : arg0.field1086.field3831;
                        }
                        if (var14 == -2147483644) {
                            var14 = arg0.field1082;
                        }
                        if (var14 == -2147483643) {
                            var14 = arg0.field1086 == null ? -1 : arg0.field1086.field3870;
                        }
                        if (var14 == -2147483642) {
                            var14 = arg0.field1087 == null ? -1 : arg0.field1087.field3831;
                        }
                        if (var14 == -2147483641) {
                            var14 = arg0.field1087 == null ? -1 : arg0.field1087.field3870;
                        }
                        if (var14 == -2147483640) {
                            var14 = arg0.field1081;
                        }
                        if (var14 == -2147483639) {
                            var14 = arg0.field1089;
                        }
                        Statics.field860[var11++] = var14;
                    } else if (var4[var13] instanceof String) {
                        String var15 = (String) var4[var13];
                        if (var15.equals("event_opbase")) {
                            var15 = arg0.field1090;
                        }
                        Statics.field75[var12++] = var15;
                    }
                }
                field873 = arg0.field1091;
                while (true) {
                    var10++;
                    if (var10 > arg2) {
                        throw new RuntimeException();
                    }
                    var5++;
                    int var59 = var6[var5];
                    if (var59 >= 100) {
                        boolean var46;
                        if (arg1.field1005[var5] == 1) {
                            var46 = true;
                        } else {
                            var46 = false;
                        }
                        int var47 = method3569(var59, arg1, var46);
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
                        field863[++Statics.field1535 - 1] = var7[var5];
                    } else if (var59 == 1) {
                        int var16 = var7[var5];
                        field863[++Statics.field1535 - 1] = class347.field3731[var16];
                    } else if (var59 == 2) {
                        int var17 = var7[var5];
                        class347.field3731[var17] = field863[--Statics.field1535];
                        client.method2148(var17);
                    } else if (var59 == 3) {
                        field858[++Statics.field3663 - 1] = arg1.field1006[var5];
                    } else if (var59 == 6) {
                        var5 += var7[var5];
                    } else if (var59 == 7) {
                        Statics.field1535 -= 2;
                        if (field863[Statics.field1535] != field863[Statics.field1535 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 8) {
                        Statics.field1535 -= 2;
                        if (field863[Statics.field1535] == field863[Statics.field1535 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 9) {
                        Statics.field1535 -= 2;
                        if (field863[Statics.field1535] < field863[Statics.field1535 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 10) {
                        Statics.field1535 -= 2;
                        if (field863[Statics.field1535] > field863[Statics.field1535 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 21) {
                        if (field865 == 0) {
                            return;
                        }
                        class64 var19 = field866[--field865];
                        arg1 = var19.field446;
                        var6 = arg1.field1004;
                        var7 = arg1.field1005;
                        var5 = var19.field444;
                        Statics.field860 = var19.field447;
                        Statics.field75 = var19.field445;
                    } else if (var59 == 25) {
                        int var20 = var7[var5];
                        field863[++Statics.field1535 - 1] = class347.method3186(var20);
                    } else if (var59 == 27) {
                        int var21 = var7[var5];
                        class347.method3989(var21, field863[--Statics.field1535]);
                    } else if (var59 == 31) {
                        Statics.field1535 -= 2;
                        if (field863[Statics.field1535] <= field863[Statics.field1535 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 32) {
                        Statics.field1535 -= 2;
                        if (field863[Statics.field1535] >= field863[Statics.field1535 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 33) {
                        field863[++Statics.field1535 - 1] = Statics.field860[var7[var5]];
                    } else if (var59 == 34) {
                        Statics.field860[var7[var5]] = field863[--Statics.field1535];
                    } else if (var59 == 35) {
                        field858[++Statics.field3663 - 1] = Statics.field75[var7[var5]];
                    } else if (var59 == 36) {
                        Statics.field75[var7[var5]] = field858[--Statics.field3663];
                    } else if (var59 == 37) {
                        int var22 = var7[var5];
                        Statics.field3663 -= var22;
                        String var23 = class416.method39(field858, Statics.field3663, var22);
                        field858[++Statics.field3663 - 1] = var23;
                    } else if (var59 == 38) {
                        Statics.field1535--;
                    } else if (var59 == 39) {
                        Statics.field3663--;
                    } else if (var59 == 40) {
                        int var24 = var7[var5];
                        class81 var25 = class81.method3463(var24);
                        int[] var26 = new int[var25.field1007];
                        String[] var27 = new String[var25.field1003];
                        for (int var28 = 0; var28 < var25.field1009; var28++) {
                            var26[var28] = field863[Statics.field1535 - var25.field1009 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field1010; var29++) {
                            var27[var29] = field858[Statics.field3663 - var25.field1010 + var29];
                        }
                        Statics.field1535 -= var25.field1009;
                        Statics.field3663 -= var25.field1010;
                        class64 var30 = new class64();
                        var30.field446 = arg1;
                        var30.field444 = var5;
                        var30.field447 = Statics.field860;
                        var30.field445 = Statics.field75;
                        field866[++field865 - 1] = var30;
                        arg1 = var25;
                        var6 = var25.field1004;
                        var7 = var25.field1005;
                        var5 = -1;
                        Statics.field860 = var26;
                        Statics.field75 = var27;
                    } else if (var59 == 42) {
                        field863[++Statics.field1535 - 1] = Statics.field4481.method2743(var7[var5]);
                    } else if (var59 == 43) {
                        Statics.field4481.method2702(var7[var5], field863[--Statics.field1535]);
                    } else if (var59 == 44) {
                        int var31 = var7[var5] >> 16;
                        int var32 = var7[var5] & 0xFFFF;
                        int var33 = field863[--Statics.field1535];
                        if (var33 < 0 || var33 > 5000) {
                            throw new RuntimeException();
                        }
                        field862[var31] = var33;
                        byte var34 = -1;
                        if (var32 == 105) {
                            var34 = 0;
                        }
                        for (int var35 = 0; var35 < var33; var35++) {
                            field872[var31][var35] = var34;
                        }
                    } else if (var59 == 45) {
                        int var36 = var7[var5];
                        int var37 = field863[--Statics.field1535];
                        if (var37 < 0 || var37 >= field862[var36]) {
                            throw new RuntimeException();
                        }
                        field863[++Statics.field1535 - 1] = field872[var36][var37];
                    } else if (var59 == 46) {
                        int var38 = var7[var5];
                        Statics.field1535 -= 2;
                        int var39 = field863[Statics.field1535];
                        if (var39 < 0 || var39 >= field862[var38]) {
                            throw new RuntimeException();
                        }
                        field872[var38][var39] = field863[Statics.field1535 + 1];
                    } else if (var59 == 47) {
                        String var40 = Statics.field4481.method2707(var7[var5]);
                        if (var40 == null) {
                            var40 = class379.field4390;
                        }
                        field858[++Statics.field3663 - 1] = var40;
                    } else if (var59 == 48) {
                        Statics.field4481.method2706(var7[var5], field858[--Statics.field3663]);
                    } else if (var59 == 49) {
                        String var41 = Statics.field4481.method2722(var7[var5]);
                        field858[++Statics.field3663 - 1] = var41;
                    } else if (var59 == 50) {
                        Statics.field4481.method2704(var7[var5], field858[--Statics.field3663]);
                    } else if (var59 == 60) {
                        class520 var42 = arg1.field1011[var7[var5]];
                        class504 var43 = (class504) var42.method8442((long) field863[--Statics.field1535]);
                        if (var43 != null) {
                            var5 += var43.field5080;
                        }
                    } else if (var59 == 74) {
                        Integer var44 = Statics.field5477.method3121(var7[var5]);
                        if (var44 == null) {
                            field863[++Statics.field1535 - 1] = -1;
                        } else {
                            field863[++Statics.field1535 - 1] = var44;
                        }
                    } else if (var59 == 76) {
                        Integer var45 = Statics.field1172.method8038(var7[var5]);
                        if (var45 == null) {
                            field863[++Statics.field1535 - 1] = -1;
                        } else {
                            field863[++Statics.field1535 - 1] = var45;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (Exception var57) {
                var9 = true;
                var50 = new StringBuilder(30);
                var50.append("").append(arg1.field5082).append(" ");
                for (int var51 = field865 - 1; var51 >= 0; var51--) {
                    var50.append("").append(field866[var51].field446.field5082).append(" ");
                }
            }
            var50.append("").append(var8);
            class572.method7807(var50.toString(), var57);
        } finally {
            while (field861.size() > 0) {
                class106 var54 = (class106) field861.remove(0);
                client.method7586(var54.method2633(), var54.method2638(), var54.method2640(), var54.method2637(), "");
            }
            if (field864) {
                field864 = false;
                client.method2669();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                class572.method7807("Warning: Script " + arg1.field1012 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("hk.ak(ILdg;ZI)I")
    public static int method3569(int arg0, class81 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method8621(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2894(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method6656(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method5512(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method170(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method57(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method3242(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method5575(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method2353(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method4098(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method5237(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2894(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method6656(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method5512(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method170(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method57(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method277(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method2352(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method5513(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return Statics.method5901(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method5237(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method6433(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method1149(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method3030(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method6422(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method4574(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method6459(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method641(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method3233(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method3266(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method844(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method294(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method1173(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method94(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method8(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method2791(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return Statics.method2892(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method5783(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method709(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method4176(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method7989(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method1062(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method293(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method479(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method5807(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method6230(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method4576(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method7748(arg0, arg1, arg2);
        } else if (arg0 < 8100) {
            return method11(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("um.ap(ILdg;ZI)I")
    public static int method8621(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1535 -= 3;
            int var3 = field863[Statics.field1535];
            int var4 = field863[Statics.field1535 + 1];
            int var5 = field863[Statics.field1535 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class359 var6 = Statics.field4650.method5895(var3);
            if (var6.field3969 == null) {
                var6.field3969 = new class359[var5 + 1];
            }
            if (var6.field3969.length <= var5) {
                class359[] var7 = new class359[var5 + 1];
                for (int var8 = 0; var8 < var6.field3969.length; var8++) {
                    var7[var8] = var6.field3969[var8];
                }
                var6.field3969 = var7;
            }
            if (var5 > 0 && var6.field3969[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class359 var9 = new class359();
            var9.field3834 = var4;
            var9.field3851 = var9.field3831 = var6.field3831;
            var9.field3870 = var5;
            var9.field3915 = true;
            if (var4 == 12) {
                var9.method6264();
                var9.method6367().method6007(new class109(var9));
                var9.method6367().method6006(new class110(var9));
            }
            var6.field3969[var5] = var9;
            if (arg2) {
                Statics.field867 = var9;
            } else {
                Statics.field143 = var9;
            }
            client.method7942(var6);
            return 1;
        } else if (arg0 == 101) {
            class359 var10 = arg2 ? Statics.field867 : Statics.field143;
            class359 var11 = Statics.field4650.method5895(var10.field3831);
            var11.field3969[var10.field3870] = null;
            client.method7942(var11);
            return 1;
        } else if (arg0 == 102) {
            class359 var12 = Statics.field4650.method5895(field863[--Statics.field1535]);
            var12.field3969 = null;
            client.method7942(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1535 -= 2;
            int var13 = field863[Statics.field1535];
            int var14 = field863[Statics.field1535 + 1];
            class359 var15 = Statics.field4650.method5889(var13, var14);
            if (var15 == null || var14 == -1) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = 1;
                if (arg2) {
                    Statics.field867 = var15;
                } else {
                    Statics.field143 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class359 var16 = Statics.field4650.method5895(field863[--Statics.field1535]);
            if (var16 == null) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = 1;
                if (arg2) {
                    Statics.field867 = var16;
                } else {
                    Statics.field143 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ef.an(ILdg;ZI)I")
    public static int method2894(int arg0, class81 arg1, boolean arg2) {
        int var3 = -1;
        class359 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field863[--Statics.field1535];
            var4 = Statics.field4650.method5895(var3);
        } else {
            var4 = arg2 ? Statics.field867 : Statics.field143;
        }
        if (arg0 == 1000) {
            Statics.field1535 -= 4;
            var4.field3907 = field863[Statics.field1535];
            var4.field3842 = field863[Statics.field1535 + 1];
            var4.field3837 = field863[Statics.field1535 + 2];
            var4.field3897 = field863[Statics.field1535 + 3];
            client.method7942(var4);
            Statics.field4675.method1205(var4);
            if (var3 != -1 && var4.field3834 == 0) {
                client.method4149(Statics.field4650.field3741[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1535 -= 4;
            var4.field3947 = field863[Statics.field1535];
            var4.field3844 = field863[Statics.field1535 + 1];
            var4.field3917 = field863[Statics.field1535 + 2];
            var4.field3921 = field863[Statics.field1535 + 3];
            client.method7942(var4);
            Statics.field4675.method1205(var4);
            if (var3 != -1 && var4.field3834 == 0) {
                client.method4149(Statics.field4650.field3741[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field863[--Statics.field1535] == 1;
            if (var4.field3852 != var5) {
                var4.field3852 = var5;
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3979 = field863[--Statics.field1535] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3980 = field863[--Statics.field1535] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oe.aj(ILdg;ZI)I")
    public static int method6656(int arg0, class81 arg1, boolean arg2) {
        int var3 = -1;
        class359 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field863[--Statics.field1535];
            var4 = Statics.field4650.method5895(var3);
        } else {
            var4 = arg2 ? Statics.field867 : Statics.field143;
        }
        if (arg0 == 1100) {
            Statics.field1535 -= 2;
            int var5 = field863[Statics.field1535];
            int var6 = field863[Statics.field1535 + 1];
            if (var4.field3834 == 12) {
                class357 var7 = var4.method6367();
                if (var7 != null && var7.method6106(var5, var6)) {
                    client.method7942(var4);
                }
            } else {
                var4.field3977 = var5;
                if (var4.field3977 > var4.field3855 - var4.field3847) {
                    var4.field3977 = var4.field3855 - var4.field3847;
                }
                if (var4.field3977 < 0) {
                    var4.field3977 = 0;
                }
                var4.field3854 = var6;
                if (var4.field3854 > var4.field3856 - var4.field3848) {
                    var4.field3854 = var4.field3856 - var4.field3848;
                }
                if (var4.field3854 < 0) {
                    var4.field3854 = 0;
                }
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3913 = field863[--Statics.field1535];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3861 = field863[--Statics.field1535] == 1;
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3863 = field863[--Statics.field1535];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3865 = field863[--Statics.field1535];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3867 = field863[--Statics.field1535];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3821 = field863[--Statics.field1535];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3840 = field863[--Statics.field1535] == 1;
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3910 = 1;
            var4.field3877 = field863[--Statics.field1535];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1535 -= 6;
            var4.field3882 = field863[Statics.field1535];
            var4.field3883 = field863[Statics.field1535 + 1];
            var4.field3884 = field863[Statics.field1535 + 2];
            var4.field3885 = field863[Statics.field1535 + 3];
            var4.field3886 = field863[Statics.field1535 + 4];
            var4.field3887 = field863[Statics.field1535 + 5];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field863[--Statics.field1535];
            if (var4.field3880 != var8) {
                var4.field3880 = var8;
                var4.field3872 = 0;
                var4.field3945 = 0;
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3891 = field863[--Statics.field1535] == 1;
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field858[--Statics.field3663];
            if (var4.field3834 == 12) {
                class357 var10 = var4.method6367();
                if (var10 != null && var10.method6016()) {
                    var10.method6034(var9);
                } else {
                    var4.field3895 = var9;
                }
                client.method7942(var4);
            } else if (!var9.equals(var4.field3895)) {
                var4.field3895 = var9;
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3894 = field863[--Statics.field1535];
            if (var4.field3834 == 12) {
                class357 var11 = var4.method6367();
                if (var11 != null) {
                    var11.method5976();
                }
            }
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1535 -= 3;
            if (var4.field3834 == 12) {
                class357 var12 = var4.method6367();
                if (var12 != null) {
                    var12.method6025(field863[Statics.field1535], field863[Statics.field1535 + 1]);
                    var12.method5996(field863[Statics.field1535 + 2]);
                }
            } else {
                var4.field3898 = field863[Statics.field1535];
                var4.field3899 = field863[Statics.field1535 + 1];
                var4.field3862 = field863[Statics.field1535 + 2];
            }
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3933 = field863[--Statics.field1535] == 1;
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3943 = field863[--Statics.field1535];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3873 = field863[--Statics.field1535];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3874 = field863[--Statics.field1535] == 1;
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3875 = field863[--Statics.field1535] == 1;
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1535 -= 2;
            var4.field3855 = field863[Statics.field1535];
            var4.field3856 = field863[Statics.field1535 + 1];
            client.method7942(var4);
            if (var3 != -1 && var4.field3834 == 0) {
                client.method4149(Statics.field4650.field3741[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3179(var4.field3831, var4.field3870);
            client.field582 = var4;
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3876 = field863[--Statics.field1535];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3858 = field863[--Statics.field1535];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3864 = field863[--Statics.field1535];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var13 = field863[--Statics.field1535];
            class559 var14 = (class559) class402.method3799(class559.method3071(), var13);
            if (var14 != null) {
                var4.field3949 = var14;
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var15 = field863[--Statics.field1535] == 1;
            var4.field3881 = var15;
            return 1;
        } else if (arg0 == 1127) {
            boolean var16 = field863[--Statics.field1535] == 1;
            var4.field3857 = var16;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3869 = field858[--Statics.field3663];
            client.method7942(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method6248(field858[--Statics.field3663], "", Statics.field4837, client.method7663());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field1535 -= 2;
            var4.method6252(field863[Statics.field1535], field863[Statics.field1535 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method6357(field858[--Statics.field3663], field863[--Statics.field1535]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field1535--;
            class351 var17 = var4.method6266();
            if (var17 != null) {
                var17.field3753 = field863[Statics.field1535];
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field1535--;
            class351 var18 = var4.method6266();
            if (var18 != null) {
                var18.field3752 = field863[Statics.field1535];
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field3663--;
            class357 var19 = var4.method6367();
            if (var19 != null) {
                var4.field3896 = field858[Statics.field3663];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field1535--;
            class351 var20 = var4.method6266();
            if (var20 != null) {
                var20.field3751 = field863[Statics.field1535];
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field1535--;
            class357 var21 = var4.method6367();
            if (var21 != null && var21.method6092(field863[Statics.field1535])) {
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field1535--;
            class357 var22 = var4.method6367();
            if (var22 != null && var22.method5967(field863[Statics.field1535])) {
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field1535--;
            class357 var23 = var4.method6367();
            if (var23 != null && var23.method5968(field863[Statics.field1535])) {
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var24 = field863[--Statics.field1535] == 1;
            client.field741.method4016();
            class357 var25 = var4.method6367();
            if (var25 != null && var25.method6139(var24)) {
                if (var24) {
                    client.field741.method4014(var4);
                }
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var26 = field863[--Statics.field1535] == 1;
            if (!var26 && client.field741.method4015() == var4) {
                client.field741.method4016();
                client.method7942(var4);
            }
            class357 var27 = var4.method6367();
            if (var27 != null) {
                var27.method5961(var26);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field1535 -= 2;
            class357 var28 = var4.method6367();
            if (var28 != null && var28.method5984(field863[Statics.field1535], field863[Statics.field1535 + 1])) {
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field1535--;
            class357 var29 = var4.method6367();
            if (var29 != null && var29.method5984(field863[Statics.field1535], field863[Statics.field1535])) {
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field1535--;
            class357 var30 = var4.method6367();
            if (var30 != null) {
                var30.method5973(field863[Statics.field1535]);
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field1535--;
            class357 var31 = var4.method6367();
            if (var31 != null) {
                var31.method6125(field863[Statics.field1535]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field1535--;
            class357 var32 = var4.method6367();
            if (var32 != null) {
                var32.method5975(field863[Statics.field1535]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field1535--;
            class357 var33 = var4.method6367();
            if (var33 != null) {
                var33.method5989(field863[Statics.field1535]);
                client.method7942(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field1535 -= 2;
            class28 var34 = var4.method6316();
            if (var34 != null) {
                var34.method388(field863[Statics.field1535], field863[Statics.field1535 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field1535 -= 2;
            class28 var35 = var4.method6316();
            if (var35 != null) {
                var35.method389((char) field863[Statics.field1535], field863[Statics.field1535 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method6250(field858[--Statics.field3663], Statics.field4837);
            return 1;
        } else if (arg0 == 1151) {
            Statics.field3663 -= 3;
            String var36 = field858[Statics.field3663];
            String var37 = field858[Statics.field3663 + 1];
            String var38 = field858[Statics.field3663 + 2];
            long var39 = client.method7663();
            long var41 = client.method4029();
            String var43 = client.method7588().method8152(client.method7588().field5096);
            if (var39 != -1L) {
                var36 = var36.replaceAll("%userid%", Long.toString(var39));
            }
            if (var41 != -1L) {
                var36 = var36.replaceAll("%userhash%", Long.toString(var41));
            }
            if (!var43.isEmpty()) {
                var36 = var36.replaceAll("%deviceid%", var43);
            }
            var4.method6245(var36, var37, var38, var43, Long.toString(var41), Statics.field4837);
            return 1;
        } else if (arg0 != 1152) {
            return 2;
        } else if (var4.field3834 == 11) {
            class214 var44 = var4.method6296();
            boolean var45 = var44 != null && class223.method7422().method3935(var44.method3830());
            field863[++Statics.field1535 - 1] = var45 ? 1 : 0;
            return 1;
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("mj.av(ILdg;ZI)I")
    public static int method5512(int arg0, class81 arg1, boolean arg2) {
        class359 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field4650.method5895(field863[--Statics.field1535]);
        } else {
            var3 = arg2 ? Statics.field867 : Statics.field143;
        }
        client.method7942(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1535 -= 2;
            int var9 = field863[Statics.field1535];
            int var10 = field863[Statics.field1535 + 1];
            var3.field3965 = var9;
            var3.field3938 = var10;
            class208 var11 = class208.method3193(var9);
            var3.field3884 = var11.field2234;
            var3.field3885 = var11.field2245;
            var3.field3886 = var11.field2225;
            var3.field3882 = var11.field2226;
            var3.field3883 = var11.field2227;
            var3.field3887 = var11.field2222;
            if (arg0 == 1205) {
                var3.field3893 = 0;
            } else if (arg0 == 1212 | var11.field2228 == 1) {
                var3.field3893 = 1;
            } else {
                var3.field3893 = 2;
            }
            if (var3.field3888 > 0) {
                var3.field3887 = var3.field3887 * 32 / var3.field3888;
            } else if (var3.field3947 > 0) {
                var3.field3887 = var3.field3887 * 32 / var3.field3947;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3910 = 2;
            var3.field3877 = field863[--Statics.field1535];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3910 = 3;
            var3.field3877 = Statics.field297.field1147.method5926();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field863[--Statics.field1535] == 1;
            class359.method5797(var3, Statics.field297.field1147, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field863[--Statics.field1535];
            if (var3.field3839 == null) {
                throw new RuntimeException("");
            }
            class359.method4092(var3, var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field1535 -= 2;
            int var6 = field863[Statics.field1535];
            int var7 = field863[Statics.field1535 + 1];
            if (var3.field3839 == null) {
                throw new RuntimeException("");
            }
            class359.method2354(var3, var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field863[--Statics.field1535];
            if (var3.field3839 == null) {
                throw new RuntimeException("");
            }
            class359.method3987(var3, Statics.field297.field1147.field3776, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ax.ab(ILdg;ZI)I")
    public static int method170(int arg0, class81 arg1, boolean arg2) {
        boolean var3 = true;
        class359 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = Statics.field4650.method5895(field863[--Statics.field1535]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field867 : Statics.field143;
        }
        if (arg0 == 1300) {
            int var5 = field863[--Statics.field1535] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method6273(var5, field858[--Statics.field3663]);
                return 1;
            } else {
                Statics.field3663--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1535 -= 2;
            int var6 = field863[Statics.field1535];
            int var7 = field863[Statics.field1535 + 1];
            var4.field3914 = Statics.field4650.method5889(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3868 = field863[--Statics.field1535] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3889 = field863[--Statics.field1535];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3892 = field863[--Statics.field1535];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3959 = field858[--Statics.field3663];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3918 = field858[--Statics.field3663];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3928 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3968 = field863[--Statics.field1535] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field1535--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1535 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field863[Statics.field1535 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field863[Statics.field1535 + var10];
                        var9[var10 / 2] = (byte) field863[Statics.field1535 + var10 + 1];
                    }
                }
            } else {
                Statics.field1535 -= 2;
                var8 = new byte[] { (byte) field863[Statics.field1535] };
                var9 = new byte[] { (byte) field863[Statics.field1535 + 1] };
            }
            int var11 = field863[--Statics.field1535] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method4582(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1535 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field863[Statics.field1535] };
            byte[] var14 = new byte[] { (byte) field863[Statics.field1535 + 1] };
            method4582(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1535 -= 3;
            int var15 = field863[Statics.field1535] - 1;
            int var16 = field863[Statics.field1535 + 1];
            int var17 = field863[Statics.field1535 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method5517(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field863[--Statics.field1535];
            int var20 = field863[--Statics.field1535];
            method5517(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1535--;
            int var21 = field863[Statics.field1535] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method513(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method513(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ks.ai(Lnx;I[B[BI)V")
    public static final void method4582(class359 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3908 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3908 = new byte[11][];
            arg0.field3981 = new byte[11][];
            arg0.field3967 = new int[11];
            arg0.field3911 = new int[11];
        }
        arg0.field3908[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3916 = false;
            for (int var4 = 0; var4 < arg0.field3908.length; var4++) {
                if (arg0.field3908[var4] != null) {
                    arg0.field3916 = true;
                    break;
                }
            }
        } else {
            arg0.field3916 = true;
        }
        arg0.field3981[arg1] = arg3;
    }

    @ObfuscatedName("md.ae(Lnx;IIII)V")
    public static final void method5517(class359 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3967 == null) {
            throw new RuntimeException();
        }
        arg0.field3967[arg1] = arg2;
        arg0.field3911[arg1] = arg3;
    }

    @ObfuscatedName("bs.au(Lnx;II)V")
    public static final void method513(class359 arg0, int arg1) {
        if (arg0.field3908 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3978 == null) {
            arg0.field3978 = new int[arg0.field3908.length];
        }
        arg0.field3978[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("av.ah(ILdg;ZB)I")
    public static int method57(int arg0, class81 arg1, boolean arg2) {
        class359 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field4650.method5895(field863[--Statics.field1535]);
        } else {
            var3 = arg2 ? Statics.field867 : Statics.field143;
        }
        String var4 = field858[--Statics.field3663];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field863[--Statics.field1535];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field863[--Statics.field1535];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field858[--Statics.field3663];
            } else {
                var7[var8] = Integer.valueOf(field863[--Statics.field1535]);
            }
        }
        int var9 = field863[--Statics.field1535];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3952 = var7;
        } else if (arg0 == 1401) {
            var3.field3924 = var7;
        } else if (arg0 == 1402) {
            var3.field3923 = var7;
        } else if (arg0 == 1403) {
            var3.field3958 = var7;
        } else if (arg0 == 1404) {
            var3.field3927 = var7;
        } else if (arg0 == 1405) {
            var3.field3909 = var7;
        } else if (arg0 == 1406) {
            var3.field3931 = var7;
        } else if (arg0 == 1407) {
            var3.field3932 = var7;
            var3.field3904 = var5;
        } else if (arg0 == 1408) {
            var3.field3966 = var7;
        } else if (arg0 == 1409) {
            var3.field3939 = var7;
        } else if (arg0 == 1410) {
            var3.field3929 = var7;
        } else if (arg0 == 1411) {
            var3.field3922 = var7;
        } else if (arg0 == 1412) {
            var3.field3838 = var7;
        } else if (arg0 == 1414) {
            var3.field3934 = var7;
            var3.field3935 = var5;
        } else if (arg0 == 1415) {
            var3.field3936 = var7;
            var3.field3973 = var5;
        } else if (arg0 == 1416) {
            var3.field3890 = var7;
        } else if (arg0 == 1417) {
            var3.field3941 = var7;
        } else if (arg0 == 1418) {
            var3.field3942 = var7;
        } else if (arg0 == 1419) {
            var3.field3832 = var7;
        } else if (arg0 == 1420) {
            var3.field3946 = var7;
        } else if (arg0 == 1421) {
            var3.field3903 = var7;
        } else if (arg0 == 1422) {
            var3.field3950 = var7;
        } else if (arg0 == 1423) {
            var3.field3951 = var7;
        } else if (arg0 == 1424) {
            var3.field3853 = var7;
        } else if (arg0 == 1425) {
            var3.field3954 = var7;
        } else if (arg0 == 1426) {
            var3.field3955 = var7;
        } else if (arg0 == 1427) {
            var3.field3953 = var7;
        } else if (arg0 == 1428) {
            var3.field3948 = var7;
        } else if (arg0 == 1429) {
            var3.field3866 = var7;
        } else if (arg0 == 1430) {
            var3.field3841 = var7;
        } else if (arg0 == 1431) {
            var3.field3830 = var7;
        } else if (arg0 == 1434) {
            var3.field3956 = var7;
        } else if (arg0 == 1435) {
            var3.field3940 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class355 var10 = var3.method6268();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3769 = var7;
                } else if (arg0 == 1437) {
                    var10.field3764 = var7;
                } else if (arg0 == 1438) {
                    var10.field3770 = var7;
                } else if (arg0 == 1439) {
                    var10.field3767 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3919 = true;
        return 1;
    }

    @ObfuscatedName("go.az(ILdg;ZI)I")
    public static int method3242(int arg0, class81 arg1, boolean arg2) {
        class359 var3 = arg2 ? Statics.field867 : Statics.field143;
        if (arg0 == 1500) {
            field863[++Statics.field1535 - 1] = var3.field3845;
            return 1;
        } else if (arg0 == 1501) {
            field863[++Statics.field1535 - 1] = var3.field3846;
            return 1;
        } else if (arg0 == 1502) {
            field863[++Statics.field1535 - 1] = var3.field3847;
            return 1;
        } else if (arg0 == 1503) {
            field863[++Statics.field1535 - 1] = var3.field3848;
            return 1;
        } else if (arg0 == 1504) {
            field863[++Statics.field1535 - 1] = var3.field3852 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field863[++Statics.field1535 - 1] = var3.field3851;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ml.ax(ILdg;ZI)I")
    public static int method5575(int arg0, class81 arg1, boolean arg2) {
        class359 var3 = arg2 ? Statics.field867 : Statics.field143;
        if (arg0 == 1600) {
            field863[++Statics.field1535 - 1] = var3.field3977;
            return 1;
        } else if (arg0 == 1601) {
            field863[++Statics.field1535 - 1] = var3.field3854;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3834 == 12) {
                class357 var4 = var3.method6367();
                if (var4 != null) {
                    field858[++Statics.field3663 - 1] = var4.method6008().method7269();
                    return 1;
                }
            }
            field858[++Statics.field3663 - 1] = var3.field3895;
            return 1;
        } else if (arg0 == 1603) {
            field863[++Statics.field1535 - 1] = var3.field3855;
            return 1;
        } else if (arg0 == 1604) {
            field863[++Statics.field1535 - 1] = var3.field3856;
            return 1;
        } else if (arg0 == 1605) {
            field863[++Statics.field1535 - 1] = var3.field3887;
            return 1;
        } else if (arg0 == 1606) {
            field863[++Statics.field1535 - 1] = var3.field3884;
            return 1;
        } else if (arg0 == 1607) {
            field863[++Statics.field1535 - 1] = var3.field3886;
            return 1;
        } else if (arg0 == 1608) {
            field863[++Statics.field1535 - 1] = var3.field3885;
            return 1;
        } else if (arg0 == 1609) {
            field863[++Statics.field1535 - 1] = var3.field3863;
            return 1;
        } else if (arg0 == 1610) {
            field863[++Statics.field1535 - 1] = var3.field3864;
            return 1;
        } else if (arg0 == 1611) {
            field863[++Statics.field1535 - 1] = var3.field3913;
            return 1;
        } else if (arg0 == 1612) {
            field863[++Statics.field1535 - 1] = var3.field3858;
            return 1;
        } else if (arg0 == 1613) {
            field863[++Statics.field1535 - 1] = var3.field3949.method32();
            return 1;
        } else if (arg0 == 1614) {
            field863[++Statics.field1535 - 1] = var3.field3857 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class351 var5 = var3.method6266();
                field863[++Statics.field1535 - 1] = var5 == null ? 0 : var5.field3753;
            }
            if (arg0 == 1618) {
                class351 var6 = var3.method6266();
                field863[++Statics.field1535 - 1] = var6 == null ? 0 : var6.field3752;
                return 1;
            } else if (arg0 == 1619) {
                class357 var7 = var3.method6367();
                field858[++Statics.field3663 - 1] = var7 == null ? "" : var7.method6051().method7269();
                return 1;
            } else if (arg0 == 1620) {
                class351 var8 = var3.method6266();
                field863[++Statics.field1535 - 1] = var8 == null ? 0 : var8.field3751;
                return 1;
            } else if (arg0 == 1621) {
                class357 var9 = var3.method6367();
                field863[++Statics.field1535 - 1] = var9 == null ? 0 : var9.method6019();
                return 1;
            } else if (arg0 == 1622) {
                class357 var10 = var3.method6367();
                field863[++Statics.field1535 - 1] = var10 == null ? 0 : var10.method6020();
                return 1;
            } else if (arg0 == 1623) {
                class357 var11 = var3.method6367();
                field863[++Statics.field1535 - 1] = var11 == null ? 0 : var11.method6021();
                return 1;
            } else if (arg0 == 1624) {
                class357 var12 = var3.method6367();
                field863[++Statics.field1535 - 1] = var12 != null && var12.method6011() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class357 var13 = var3.method6367();
                field863[++Statics.field1535 - 1] = var13 != null && var13.method6012() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class357 var14 = var3.method6367();
                field858[++Statics.field3663 - 1] = var14 == null ? "" : var14.method6173().method7532();
                return 1;
            } else if (arg0 == 1627) {
                class357 var15 = var3.method6367();
                int var16 = var15 == null ? 0 : var15.method6015();
                int var17 = var15 == null ? 0 : var15.method6155();
                field863[++Statics.field1535 - 1] = Math.min(var16, var17);
                field863[++Statics.field1535 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class357 var18 = var3.method6367();
                field863[++Statics.field1535 - 1] = var18 == null ? 0 : var18.method6155();
                return 1;
            } else if (arg0 == 1629) {
                class357 var19 = var3.method6367();
                field863[++Statics.field1535 - 1] = var19 == null ? 0 : var19.method6023();
                return 1;
            } else if (arg0 == 1630) {
                class357 var20 = var3.method6367();
                field863[++Statics.field1535 - 1] = var20 == null ? 0 : var20.method6160();
                return 1;
            } else if (arg0 == 1631) {
                class357 var21 = var3.method6367();
                field863[++Statics.field1535 - 1] = var21 == null ? 0 : var21.method6024();
                return 1;
            } else if (arg0 == 1632) {
                class357 var22 = var3.method6367();
                field863[++Statics.field1535 - 1] = var22 == null ? 0 : var22.method6206();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method6316();
                field863[Statics.field1535 - 1] = var23 == null ? 0 : var23.method400(field863[Statics.field1535 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method6316();
                field863[Statics.field1535 - 1] = var24 == null ? 0 : var24.method391((char) field863[Statics.field1535 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("dc.ac(ILdg;ZB)I")
    public static int method2353(int arg0, class81 arg1, boolean arg2) {
        class359 var3 = arg2 ? Statics.field867 : Statics.field143;
        if (arg0 == 1700) {
            field863[++Statics.field1535 - 1] = var3.field3965;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3965 == -1) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = var3.field3938;
            }
            return 1;
        } else if (arg0 == 1702) {
            field863[++Statics.field1535 - 1] = var3.field3870;
            return 1;
        } else if (arg0 == 1707) {
            field863[++Statics.field1535 - 1] = var3.method6325() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method5538(var3);
        } else if (arg0 == 1709) {
            return method6402(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mn.al(Lnx;B)I")
    public static int method5538(class359 arg0) {
        if (arg0.field3834 == 11) {
            String var1 = field858[--Statics.field3663];
            field863[++Statics.field1535 - 1] = arg0.method6255(var1);
            return 1;
        } else {
            Statics.field3663--;
            field863[++Statics.field1535 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("np.ay(Lnx;I)I")
    public static int method6402(class359 arg0) {
        if (arg0.field3834 == 11) {
            String var1 = field858[--Statics.field3663];
            field858[++Statics.field3663 - 1] = arg0.method6318(var1);
            return 1;
        } else {
            field858[Statics.field3663 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("jv.ao(ILdg;ZI)I")
    public static int method4098(int arg0, class81 arg1, boolean arg2) {
        class359 var3 = arg2 ? Statics.field867 : Statics.field143;
        if (arg0 == 1800) {
            field863[++Statics.field1535 - 1] = Statics.method5458(client.method3224(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field863[--Statics.field1535];
            int var5 = var4 - 1;
            if (var3.field3928 == null || var5 >= var3.field3928.length || var3.field3928[var5] == null) {
                field858[++Statics.field3663 - 1] = "";
            } else {
                field858[++Statics.field3663 - 1] = var3.field3928[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3959 == null) {
                field858[++Statics.field3663 - 1] = "";
            } else {
                field858[++Statics.field3663 - 1] = var3.field3959;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lr.aa(ILdg;ZB)I")
    public static int method5237(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field873 >= 10) {
                throw new RuntimeException();
            }
            class359 var10;
            if (arg0 >= 2000) {
                var10 = Statics.field4650.method5895(field863[--Statics.field1535]);
            } else {
                var10 = arg2 ? Statics.field867 : Statics.field143;
            }
            if (var10.field3953 == null) {
                return 0;
            }
            class90 var11 = new class90();
            var11.field1086 = var10;
            var11.field1088 = var10.field3953;
            var11.field1091 = field873 + 1;
            client.field715.method6794(var11);
            return 1;
        } else if (arg0 == 1928) {
            class359 var3 = arg2 ? Statics.field867 : Statics.field143;
            int var4 = field863[--Statics.field1535];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class106 var5 = new class106(var4, var3.field3831, var3.field3870, var3.field3965);
            field861.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field1535 -= 3;
            int var6 = field863[Statics.field1535];
            int var7 = field863[Statics.field1535 + 1];
            int var8 = field863[Statics.field1535 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class106 var9 = new class106(var8, var6, var7, Statics.field4650.method5895(var6).field3965);
            field861.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.as(ILdg;ZI)I")
    public static int method277(int arg0, class81 arg1, boolean arg2) {
        class359 var3 = Statics.field4650.method5895(field863[--Statics.field1535]);
        if (arg0 == 2500) {
            field863[++Statics.field1535 - 1] = var3.field3845;
            return 1;
        } else if (arg0 == 2501) {
            field863[++Statics.field1535 - 1] = var3.field3846;
            return 1;
        } else if (arg0 == 2502) {
            field863[++Statics.field1535 - 1] = var3.field3847;
            return 1;
        } else if (arg0 == 2503) {
            field863[++Statics.field1535 - 1] = var3.field3848;
            return 1;
        } else if (arg0 == 2504) {
            field863[++Statics.field1535 - 1] = var3.field3852 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field863[++Statics.field1535 - 1] = var3.field3851;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dc.aw(ILdg;ZB)I")
    public static int method2352(int arg0, class81 arg1, boolean arg2) {
        class359 var3 = Statics.field4650.method5895(field863[--Statics.field1535]);
        if (arg0 == 2600) {
            field863[++Statics.field1535 - 1] = var3.field3977;
            return 1;
        } else if (arg0 == 2601) {
            field863[++Statics.field1535 - 1] = var3.field3854;
            return 1;
        } else if (arg0 == 2602) {
            field858[++Statics.field3663 - 1] = var3.field3895;
            return 1;
        } else if (arg0 == 2603) {
            field863[++Statics.field1535 - 1] = var3.field3855;
            return 1;
        } else if (arg0 == 2604) {
            field863[++Statics.field1535 - 1] = var3.field3856;
            return 1;
        } else if (arg0 == 2605) {
            field863[++Statics.field1535 - 1] = var3.field3887;
            return 1;
        } else if (arg0 == 2606) {
            field863[++Statics.field1535 - 1] = var3.field3884;
            return 1;
        } else if (arg0 == 2607) {
            field863[++Statics.field1535 - 1] = var3.field3886;
            return 1;
        } else if (arg0 == 2608) {
            field863[++Statics.field1535 - 1] = var3.field3885;
            return 1;
        } else if (arg0 == 2609) {
            field863[++Statics.field1535 - 1] = var3.field3863;
            return 1;
        } else if (arg0 == 2610) {
            field863[++Statics.field1535 - 1] = var3.field3864;
            return 1;
        } else if (arg0 == 2611) {
            field863[++Statics.field1535 - 1] = var3.field3913;
            return 1;
        } else if (arg0 == 2612) {
            field863[++Statics.field1535 - 1] = var3.field3858;
            return 1;
        } else if (arg0 == 2613) {
            field863[++Statics.field1535 - 1] = var3.field3949.method32();
            return 1;
        } else if (arg0 == 2614) {
            field863[++Statics.field1535 - 1] = var3.field3857 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class351 var4 = var3.method6266();
                field863[++Statics.field1535 - 1] = var4 == null ? 0 : var4.field3753;
            }
            if (arg0 == 2618) {
                class351 var5 = var3.method6266();
                field863[++Statics.field1535 - 1] = var5 == null ? 0 : var5.field3752;
                return 1;
            } else if (arg0 == 2619) {
                class357 var6 = var3.method6367();
                field858[++Statics.field3663 - 1] = var6 == null ? "" : var6.method6051().method7269();
                return 1;
            } else if (arg0 == 2620) {
                class351 var7 = var3.method6266();
                field863[++Statics.field1535 - 1] = var7 == null ? 0 : var7.field3751;
                return 1;
            } else if (arg0 == 2621) {
                class357 var8 = var3.method6367();
                field863[++Statics.field1535 - 1] = var8 == null ? 0 : var8.method6019();
                return 1;
            } else if (arg0 == 2622) {
                class357 var9 = var3.method6367();
                field863[++Statics.field1535 - 1] = var9 == null ? 0 : var9.method6020();
                return 1;
            } else if (arg0 == 2623) {
                class357 var10 = var3.method6367();
                field863[++Statics.field1535 - 1] = var10 == null ? 0 : var10.method6021();
                return 1;
            } else if (arg0 == 2624) {
                class357 var11 = var3.method6367();
                field863[++Statics.field1535 - 1] = var11 != null && var11.method6011() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class357 var12 = var3.method6367();
                field863[++Statics.field1535 - 1] = var12 != null && var12.method6012() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class357 var13 = var3.method6367();
                field858[++Statics.field3663 - 1] = var13 == null ? "" : var13.method6173().method7532();
                return 1;
            } else if (arg0 == 2627) {
                class357 var14 = var3.method6367();
                int var15 = var14 == null ? 0 : var14.method6015();
                int var16 = var14 == null ? 0 : var14.method6155();
                field863[++Statics.field1535 - 1] = Math.min(var15, var16);
                field863[++Statics.field1535 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class357 var17 = var3.method6367();
                field863[++Statics.field1535 - 1] = var17 == null ? 0 : var17.method6155();
                return 1;
            } else if (arg0 == 2629) {
                class357 var18 = var3.method6367();
                field863[++Statics.field1535 - 1] = var18 == null ? 0 : var18.method6023();
                return 1;
            } else if (arg0 == 2630) {
                class357 var19 = var3.method6367();
                field863[++Statics.field1535 - 1] = var19 == null ? 0 : var19.method6160();
                return 1;
            } else if (arg0 == 2631) {
                class357 var20 = var3.method6367();
                field863[++Statics.field1535 - 1] = var20 == null ? 0 : var20.method6024();
                return 1;
            } else if (arg0 == 2632) {
                class357 var21 = var3.method6367();
                field863[++Statics.field1535 - 1] = var21 == null ? 0 : var21.method6206();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method6316();
                field863[Statics.field1535 - 1] = var22 == null ? 0 : var22.method400(field863[Statics.field1535 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method6316();
                field863[Statics.field1535 - 1] = var23 == null ? 0 : var23.method391((char) field863[Statics.field1535 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("mi.at(ILdg;ZB)I")
    public static int method5513(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class359 var3 = Statics.field4650.method5895(field863[--Statics.field1535]);
            field863[++Statics.field1535 - 1] = var3.field3965;
            return 1;
        } else if (arg0 == 2701) {
            class359 var4 = Statics.field4650.method5895(field863[--Statics.field1535]);
            if (var4.field3965 == -1) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = var4.field3938;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field863[--Statics.field1535];
            class89 var6 = (class89) client.field673.method8464((long) var5);
            if (var6 == null) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field863[++Statics.field1535 - 1] = client.field567;
            return 1;
        } else if (arg0 == 2707) {
            class359 var7 = Statics.field4650.method5895(field863[--Statics.field1535]);
            field863[++Statics.field1535 - 1] = var7.method6325() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class359 var8 = Statics.field4650.method5895(field863[--Statics.field1535]);
            return method5538(var8);
        } else if (arg0 == 2709) {
            class359 var9 = Statics.field4650.method5895(field863[--Statics.field1535]);
            return method6402(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ot.am(ILdg;ZI)I")
    public static int method6433(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field858[--Statics.field3663];
            class114.method3518(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1535 -= 2;
            Statics.method320(Statics.field297, field863[Statics.field1535], field863[Statics.field1535 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field871) {
                field864 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field858[--Statics.field3663];
            int var5 = 0;
            if (class416.method2403(var4)) {
                var5 = class416.method6702(var4);
            }
            class322 var6 = class322.method3236(class320.field3288, client.field653.field1456);
            var6.field3394.method8714(var5);
            client.field653.method2773(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field858[--Statics.field3663];
            class322 var8 = class322.method3236(class320.field3310, client.field653.field1456);
            var8.field3394.method8711(var7.length() + 1);
            var8.field3394.method8718(var7);
            client.field653.method2773(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field858[--Statics.field3663];
            class322 var10 = class322.method3236(class320.field3282, client.field653.field1456);
            var10.field3394.method8711(var9.length() + 1);
            var10.field3394.method8718(var9);
            client.field653.method2773(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field863[--Statics.field1535];
            String var12 = field858[--Statics.field3663];
            client.method873(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1535 -= 3;
            int var13 = field863[Statics.field1535];
            int var14 = field863[Statics.field1535 + 1];
            int var15 = field863[Statics.field1535 + 2];
            class359 var16 = Statics.field4650.method5895(var15);
            client.method670(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1535 -= 2;
            int var17 = field863[Statics.field1535];
            int var18 = field863[Statics.field1535 + 1];
            class359 var19 = arg2 ? Statics.field867 : Statics.field143;
            client.method670(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field828 = field863[--Statics.field1535] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field863[++Statics.field1535 - 1] = Statics.field1379.method2535() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1379.method2443(field863[--Statics.field1535] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field858[--Statics.field3663];
            boolean var21 = field863[--Statics.field1535] == 1;
            class32.method7064(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field863[--Statics.field1535];
            class322 var23 = class322.method3236(class320.field3338, client.field653.field1456);
            var23.field3394.method8712(var22);
            client.field653.method2773(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field863[--Statics.field1535];
            Statics.field3663 -= 2;
            String var25 = field858[Statics.field3663];
            String var26 = field858[Statics.field3663 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class322 var27 = class322.method3236(class320.field3328, client.field653.field1456);
                var27.field3394.method8712(1 + class547.method2396(var25) + class547.method2396(var26));
                var27.field3394.method8718(var25);
                var27.field3394.method8711(var24);
                var27.field3394.method8718(var26);
                client.field653.method2773(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field1535--;
            return 1;
        } else if (arg0 == 3118) {
            client.field596 = field863[--Statics.field1535] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field552 = field863[--Statics.field1535] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field863[--Statics.field1535] == 1) {
                client.field634 |= 0x1;
            } else {
                client.field634 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field863[--Statics.field1535] == 1) {
                client.field634 |= 0x2;
            } else {
                client.field634 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field863[--Statics.field1535] == 1) {
                client.field634 |= 0x4;
            } else {
                client.field634 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field863[--Statics.field1535] == 1) {
                client.field634 |= 0x8;
            } else {
                client.field634 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field634 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field625 = field863[--Statics.field1535] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field627 = field863[--Statics.field1535] == 1;
            return 1;
        } else if (arg0 == 3127) {
            Statics.method6434(field863[--Statics.field1535] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field863[++Statics.field1535 - 1] = client.method295() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1535 -= 2;
            client.field600 = field863[Statics.field1535];
            client.field749 = field863[Statics.field1535 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1535 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1535--;
            return 1;
        } else if (arg0 == 3132) {
            field863[++Statics.field1535 - 1] = Statics.field890;
            field863[++Statics.field1535 - 1] = Statics.field5;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1535--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1535 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field674 = 3;
            client.field505 = field863[--Statics.field1535];
            return 1;
        } else if (arg0 == 3137) {
            client.field674 = 2;
            client.field505 = field863[--Statics.field1535];
            return 1;
        } else if (arg0 == 3138) {
            client.field674 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field674 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field674 = 3;
            client.field505 = arg2 ? Statics.field867.field3831 : Statics.field143.field3831;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field863[--Statics.field1535] == 1;
            Statics.field1379.method2501(var28);
            return 1;
        } else if (arg0 == 3142) {
            field863[++Statics.field1535 - 1] = Statics.field1379.method2543() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field863[--Statics.field1535] == 1;
            client.field558 = var29;
            if (!var29) {
                Statics.field1379.method2462("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field863[++Statics.field1535 - 1] = client.field558 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field863[--Statics.field1535] == 1;
            Statics.field1379.method2447(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field863[++Statics.field1535 - 1] = Statics.field1379.method2473() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field863[++Statics.field1535 - 1] = class78.field930;
            return 1;
        } else if (arg0 == 3154) {
            field863[++Statics.field1535 - 1] = client.method8054();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field3663--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1535 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1535--;
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1535--;
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field3663--;
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1535--;
            field858[++Statics.field3663 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1535--;
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1535 -= 2;
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1535 -= 2;
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1535 -= 2;
            field858[++Statics.field3663 - 1] = "";
            field858[++Statics.field3663 - 1] = "";
            field858[++Statics.field3663 - 1] = "";
            field858[++Statics.field3663 - 1] = "";
            field858[++Statics.field3663 - 1] = "";
            field858[++Statics.field3663 - 1] = "";
            field858[++Statics.field3663 - 1] = "";
            field858[++Statics.field3663 - 1] = "";
            field858[++Statics.field3663 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1535--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1535--;
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1535--;
            return 1;
        } else if (arg0 == 3175) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field3663--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field3663--;
            return 1;
        } else if (arg0 == 3181) {
            client.method3199(field863[--Statics.field1535]);
            return 1;
        } else if (arg0 == 3182) {
            field863[++Statics.field1535 - 1] = client.method4293();
            return 1;
        } else if (arg0 == 3185) {
            int var31 = field863[--Statics.field1535];
            Statics.field1379.method2472(var31);
            return 1;
        } else if (arg0 == 3186) {
            int var32 = Statics.field1379.method2440();
            field863[++Statics.field1535 - 1] = var32;
            return 1;
        } else if (arg0 == 3189) {
            int var33 = field863[--Statics.field1535];
            client.method3281(var33);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cq.ar(ILdg;ZB)I")
    public static int method1149(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1535 -= 3;
            client.method863(field863[Statics.field1535], field863[Statics.field1535 + 1], field863[Statics.field1535 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field1535 -= 5;
            int var3 = field863[Statics.field1535];
            int var4 = field863[Statics.field1535 + 1];
            int var5 = field863[Statics.field1535 + 2];
            int var6 = field863[Statics.field1535 + 3];
            int var7 = field863[Statics.field1535 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method8120(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1535 -= 2;
            client.method2422(field863[Statics.field1535], field863[Statics.field1535 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class93 var50 = class93.field1117;
            class92 var51 = class92.field1103;
            int var52 = field863[--Statics.field1535];
            if (arg0 == 3212) {
                int var53 = field863[--Statics.field1535];
                var50 = (class93) class402.method3799(class93.method35(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field863[--Statics.field1535];
                var51 = (class92) class402.method3799(class92.method2047(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field863[--Statics.field1535];
                var50 = (class93) class402.method3799(class93.method35(), var55);
                if (var50 == null) {
                    var51 = (class92) class402.method3799(class92.method2047(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class93.field1114;
            } else if (arg0 == 3203) {
                var51 = class92.field1102;
            } else if (arg0 == 3205) {
                var51 = class92.field1100;
            } else if (arg0 == 3207) {
                var51 = class92.field1104;
            }
            if (class92.field1103 == var51) {
                switch(var50.field1109) {
                    case 1:
                        Statics.field1379.method2501(var52 == 1);
                        break;
                    case 2:
                        Statics.field1379.method2447(var52 == 1);
                        break;
                    case 3:
                        Statics.field1379.method2513(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field1379.method2528(var52);
                        break;
                    case 5:
                        client.method3199(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1105) {
                    case 1:
                        Statics.field1379.method2443(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method2164(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method2646(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        client.method3088(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class93 var38 = class93.field1117;
            class92 var39 = class92.field1103;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field863[--Statics.field1535];
                var38 = (class93) class402.method3799(class93.method35(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field863[--Statics.field1535];
                var39 = (class92) class402.method3799(class92.method2047(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field863[--Statics.field1535];
                var38 = (class93) class402.method3799(class93.method35(), var43);
                if (var38 == null) {
                    var39 = (class92) class402.method3799(class92.method2047(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class93.field1114;
            } else if (arg0 == 3204) {
                var39 = class92.field1102;
            } else if (arg0 == 3206) {
                var39 = class92.field1100;
            } else if (arg0 == 3208) {
                var39 = class92.field1104;
            }
            int var45;
            if (class92.field1103 == var39) {
                switch(var38.field1109) {
                    case 1:
                        var45 = Statics.field1379.method2543() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field1379.method2473() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field1379.method2451() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field1379.method2452();
                        break;
                    case 5:
                        var45 = client.method4293();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1105) {
                    case 1:
                        var45 = Statics.field1379.method2535() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field1379.method2525();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field1379.method2459();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field1379.method2489();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field863[++Statics.field1535 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field863[--Statics.field1535];
            int var10 = 0;
            class93 var11 = (class93) class402.method3799(class93.method35(), var9);
            if (var11 != null) {
                var10 = class93.field1117 == var11 ? 0 : 1;
            }
            field863[++Statics.field1535 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field863[--Statics.field1535];
            int var13 = 0;
            class92 var14 = (class92) class402.method3799(class92.method2047(), var12);
            if (var14 != null) {
                var13 = class92.field1103 == var14 ? 0 : 1;
            }
            field863[++Statics.field1535 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class93 var28 = class93.field1117;
            class92 var29 = class92.field1103;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field863[--Statics.field1535];
                var28 = (class93) class402.method3799(class93.method35(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field863[--Statics.field1535];
                var29 = (class92) class402.method3799(class92.method2047(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class92.field1103 == var29) {
                switch(var28.field1109) {
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
                switch(var29.field1105) {
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
            field863[++Statics.field1535 - 1] = var35;
            field863[++Statics.field1535 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field1535 -= 2;
            int var15 = field863[Statics.field1535];
            int var16 = field863[Statics.field1535 + 1];
            class331.method3026(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field1535 -= 6;
            int var17 = field863[Statics.field1535];
            int var18 = field863[Statics.field1535 + 1];
            int var19 = field863[Statics.field1535 + 2];
            int var20 = field863[Statics.field1535 + 3];
            int var21 = field863[Statics.field1535 + 4];
            int var22 = field863[Statics.field1535 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method8120(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field1535 -= 4;
            int var24 = field863[Statics.field1535];
            int var25 = field863[Statics.field1535 + 1];
            int var26 = field863[Statics.field1535 + 2];
            int var27 = field863[Statics.field1535 + 3];
            class331.method2667(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fp.bt(ILdg;ZI)I")
    public static int method3030(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field863[++Statics.field1535 - 1] = client.field516;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1535 -= 2;
            int var3 = field863[Statics.field1535];
            int var4 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = class87.method3389(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1535 -= 2;
            int var5 = field863[Statics.field1535];
            int var6 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = class87.method451(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1535 -= 2;
            int var7 = field863[Statics.field1535];
            int var8 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = class87.method3197(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class175.method4610(var9).field1856;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field604[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field705[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field644[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field5138.field1319;
            int var14 = (Statics.field297.field1229 >> 7) + Statics.field5138.field1322;
            int var15 = (Statics.field297.field1192 >> 7) + Statics.field5138.field1324;
            field863[++Statics.field1535 - 1] = Statics.method5840(var13, var14, var15);
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = Statics.method5848(var16);
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class348.method5849(var17);
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class348.method5854(var18);
            return 1;
        } else if (arg0 == 3312) {
            field863[++Statics.field1535 - 1] = client.field503 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1535 -= 2;
            int var19 = field863[Statics.field1535] + 32768;
            int var20 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = class87.method3389(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1535 -= 2;
            int var21 = field863[Statics.field1535] + 32768;
            int var22 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = class87.method451(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1535 -= 2;
            int var23 = field863[Statics.field1535] + 32768;
            int var24 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = class87.method3197(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field680 >= 2) {
                field863[++Statics.field1535 - 1] = client.field680;
            } else {
                field863[++Statics.field1535 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field863[++Statics.field1535 - 1] = client.field524;
            return 1;
        } else if (arg0 == 3318) {
            field863[++Statics.field1535 - 1] = client.field500;
            return 1;
        } else if (arg0 == 3321) {
            field863[++Statics.field1535 - 1] = client.field678 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field863[++Statics.field1535 - 1] = client.field679;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field682) {
                field863[++Statics.field1535 - 1] = 1;
            } else {
                field863[++Statics.field1535 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field863[++Statics.field1535 - 1] = client.field771;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1535 -= 4;
            int var25 = field863[Statics.field1535];
            int var26 = field863[Statics.field1535 + 1];
            int var27 = field863[Statics.field1535 + 2];
            int var28 = field863[Statics.field1535 + 3];
            int var29 = Statics.method5840(var27, var26, var28);
            field863[++Statics.field1535 - 1] = var25 + var29;
            return 1;
        } else if (arg0 == 3326) {
            field863[++Statics.field1535 - 1] = client.field520;
            return 1;
        } else if (arg0 == 3327) {
            field863[++Statics.field1535 - 1] = client.field808;
            return 1;
        } else if (arg0 == 3331) {
            field863[++Statics.field1535 - 1] = client.field678;
            return 1;
        } else if (arg0 == 3332) {
            int var30 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field776[var30];
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("od.bj(ILdg;ZI)I")
    public static int method6422(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1535 -= 2;
            int var3 = field863[Statics.field1535];
            int var4 = field863[Statics.field1535 + 1];
            class188 var5 = class188.method7051(var3);
            if (var5.field1955 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1959; var6++) {
                if (var5.field1953[var6] == var4) {
                    field858[++Statics.field3663 - 1] = var5.field1961[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field858[++Statics.field3663 - 1] = var5.field1956;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1535 -= 4;
            int var7 = field863[Statics.field1535];
            int var8 = field863[Statics.field1535 + 1];
            int var9 = field863[Statics.field1535 + 2];
            int var10 = field863[Statics.field1535 + 3];
            class188 var11 = class188.method7051(var9);
            if (var11.field1954 != var7 || var11.field1955 != var8) {
                if (var8 == 115) {
                    field858[++Statics.field3663 - 1] = class379.field4390;
                } else {
                    field863[++Statics.field1535 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1959; var12++) {
                if (var11.field1953[var12] == var10) {
                    if (var8 == 115) {
                        field858[++Statics.field3663 - 1] = var11.field1961[var12];
                    } else {
                        field863[++Statics.field1535 - 1] = var11.field1952[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field858[++Statics.field3663 - 1] = var11.field1956;
                } else {
                    field863[++Statics.field1535 - 1] = var11.field1957;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field863[--Statics.field1535];
            class188 var14 = class188.method7051(var13);
            field863[++Statics.field1535 - 1] = var14.method3374();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("km.be(ILdg;ZI)I")
    public static int method4574(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field729.method4036(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field729.method4035(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field729.method4037(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ox.bm(ILdg;ZI)I")
    public static int method6459(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1599.field836 == 0) {
                field863[++Statics.field1535 - 1] = -2;
            } else if (Statics.field1599.field836 == 1) {
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = Statics.field1599.field837.method7889();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field863[--Statics.field1535];
            if (Statics.field1599.method1814() && var3 >= 0 && var3 < Statics.field1599.field837.method7889()) {
                class468 var4 = (class468) Statics.field1599.field837.method7876(var3);
                field858[++Statics.field3663 - 1] = var4.method7843();
                field858[++Statics.field3663 - 1] = var4.method7844();
            } else {
                field858[++Statics.field3663 - 1] = "";
                field858[++Statics.field3663 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field863[--Statics.field1535];
            if (Statics.field1599.method1814() && var5 >= 0 && var5 < Statics.field1599.field837.method7889()) {
                field863[++Statics.field1535 - 1] = ((class475) Statics.field1599.field837.method7876(var5)).field4957;
            } else {
                field863[++Statics.field1535 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field863[--Statics.field1535];
            if (Statics.field1599.method1814() && var6 >= 0 && var6 < Statics.field1599.field837.method7889()) {
                field863[++Statics.field1535 - 1] = ((class475) Statics.field1599.field837.method7876(var6)).field4955;
            } else {
                field863[++Statics.field1535 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field858[--Statics.field3663];
            int var8 = field863[--Statics.field1535];
            class71.method4055(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field858[--Statics.field3663];
            Statics.field1599.method1875(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field858[--Statics.field3663];
            Statics.field1599.method1858(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field858[--Statics.field3663];
            Statics.field1599.method1823(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field858[--Statics.field3663];
            boolean var13 = true;
            Statics.field1599.method1820(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field858[--Statics.field3663];
            String var15 = client.method8419(var14);
            field863[++Statics.field1535 - 1] = Statics.field1599.method1819(new class569(var15, Statics.field992), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field382 == null) {
                field858[++Statics.field3663 - 1] = "";
            } else {
                field858[++Statics.field3663 - 1] = Statics.field382.field4930;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field382 == null) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = Statics.field382.method7889();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field863[--Statics.field1535];
            if (Statics.field382 == null || var16 >= Statics.field382.method7889()) {
                field858[++Statics.field3663 - 1] = "";
            } else {
                field858[++Statics.field3663 - 1] = Statics.field382.method7876(var16).method7842().method9347();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field863[--Statics.field1535];
            if (Statics.field382 == null || var17 >= Statics.field382.method7889()) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = ((class475) Statics.field382.method7876(var17)).method7938();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field863[--Statics.field1535];
            if (Statics.field382 == null || var18 >= Statics.field382.method7889()) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = ((class475) Statics.field382.method7876(var18)).field4955;
            }
            return 1;
        } else if (arg0 == 3616) {
            field863[++Statics.field1535 - 1] = Statics.field382 == null ? 0 : Statics.field382.field4929;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field858[--Statics.field3663];
            client.method2766(var19);
            return 1;
        } else if (arg0 == 3618) {
            field863[++Statics.field1535 - 1] = Statics.field382 == null ? 0 : Statics.field382.field4927;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field858[--Statics.field3663];
            Statics.method7565(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method2769();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1599.method1814()) {
                field863[++Statics.field1535 - 1] = Statics.field1599.field835.method7889();
            } else {
                field863[++Statics.field1535 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field863[--Statics.field1535];
            if (Statics.field1599.method1814() && var21 >= 0 && var21 < Statics.field1599.field835.method7889()) {
                class474 var22 = (class474) Statics.field1599.field835.method7876(var21);
                field858[++Statics.field3663 - 1] = var22.method7843();
                field858[++Statics.field3663 - 1] = var22.method7844();
            } else {
                field858[++Statics.field3663 - 1] = "";
                field858[++Statics.field3663 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field858[--Statics.field3663];
            String var24 = client.method8419(var23);
            field863[++Statics.field1535 - 1] = Statics.field1599.method1837(new class569(var24, Statics.field992)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field863[--Statics.field1535];
            if (Statics.field382 == null || var25 >= Statics.field382.method7889() || !Statics.field382.method7876(var25).method7842().equals(Statics.field297.field1137)) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field382 == null || Statics.field382.field4928 == null) {
                field858[++Statics.field3663 - 1] = "";
            } else {
                field858[++Statics.field3663 - 1] = Statics.field382.field4928;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field863[--Statics.field1535];
            if (Statics.field382 == null || var26 >= Statics.field382.method7889() || !((class470) Statics.field382.method7876(var26)).method7820()) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field863[--Statics.field1535];
            if (Statics.field382 == null || var27 >= Statics.field382.method7889() || !((class470) Statics.field382.method7876(var27)).method7823()) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1599.field837.method7883();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field863[--Statics.field1535] == 1;
            Statics.field1599.field837.method7911(new class553(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field863[--Statics.field1535] == 1;
            Statics.field1599.field837.method7911(new class554(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field863[--Statics.field1535] == 1;
            Statics.field1599.field837.method7911(new class124(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field863[--Statics.field1535] == 1;
            Statics.field1599.field837.method7911(new class120(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field863[--Statics.field1535] == 1;
            Statics.field1599.field837.method7911(new class123(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field863[--Statics.field1535] == 1;
            Statics.field1599.field837.method7911(new class128(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field863[--Statics.field1535] == 1;
            Statics.field1599.field837.method7911(new class122(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field863[--Statics.field1535] == 1;
            Statics.field1599.field837.method7911(new class121(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field863[--Statics.field1535] == 1;
            Statics.field1599.field837.method7911(new class125(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field863[--Statics.field1535] == 1;
            Statics.field1599.field837.method7911(new class126(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1599.field837.method7877();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1599.field835.method7883();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field863[--Statics.field1535] == 1;
            Statics.field1599.field835.method7911(new class553(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field863[--Statics.field1535] == 1;
            Statics.field1599.field835.method7911(new class554(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1599.field835.method7877();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field382 != null) {
                Statics.field382.method7883();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field863[--Statics.field1535] == 1;
            if (Statics.field382 != null) {
                Statics.field382.method7911(new class553(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field863[--Statics.field1535] == 1;
            if (Statics.field382 != null) {
                Statics.field382.method7911(new class554(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field863[--Statics.field1535] == 1;
            if (Statics.field382 != null) {
                Statics.field382.method7911(new class124(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field863[--Statics.field1535] == 1;
            if (Statics.field382 != null) {
                Statics.field382.method7911(new class120(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field863[--Statics.field1535] == 1;
            if (Statics.field382 != null) {
                Statics.field382.method7911(new class123(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field863[--Statics.field1535] == 1;
            if (Statics.field382 != null) {
                Statics.field382.method7911(new class128(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field863[--Statics.field1535] == 1;
            if (Statics.field382 != null) {
                Statics.field382.method7911(new class122(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field863[--Statics.field1535] == 1;
            if (Statics.field382 != null) {
                Statics.field382.method7911(new class121(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field863[--Statics.field1535] == 1;
            if (Statics.field382 != null) {
                Statics.field382.method7911(new class125(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field863[--Statics.field1535] == 1;
            if (Statics.field382 != null) {
                Statics.field382.method7911(new class126(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field382 != null) {
                Statics.field382.method7877();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field863[--Statics.field1535] == 1;
            Statics.field1599.field837.method7911(new class127(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field863[--Statics.field1535] == 1;
            if (Statics.field382 != null) {
                Statics.field382.method7911(new class127(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.bo(ILdg;ZI)I")
    public static int method641(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("gh.bi(ILdg;ZI)I")
    public static int method3233(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field1649 == null) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = 1;
                Statics.field5477 = Statics.field1649;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field863[--Statics.field1535];
            if (client.field746[var3] == null) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = 1;
                Statics.field5477 = client.field746[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field858[++Statics.field3663 - 1] = Statics.field5477.field1778;
            return 1;
        } else if (arg0 == 3803) {
            field863[++Statics.field1535 - 1] = Statics.field5477.field1779 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field863[++Statics.field1535 - 1] = Statics.field5477.field1767;
            return 1;
        } else if (arg0 == 3805) {
            field863[++Statics.field1535 - 1] = Statics.field5477.field1768;
            return 1;
        } else if (arg0 == 3806) {
            field863[++Statics.field1535 - 1] = Statics.field5477.field1769;
            return 1;
        } else if (arg0 == 3807) {
            field863[++Statics.field1535 - 1] = Statics.field5477.field1770;
            return 1;
        } else if (arg0 == 3809) {
            field863[++Statics.field1535 - 1] = Statics.field5477.field1771;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field863[--Statics.field1535];
            field858[++Statics.field3663 - 1] = Statics.field5477.field1782[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = Statics.field5477.field1773[var5];
            return 1;
        } else if (arg0 == 3812) {
            field863[++Statics.field1535 - 1] = Statics.field5477.field1780;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field863[--Statics.field1535];
            field858[++Statics.field3663 - 1] = Statics.field5477.field1783[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field1535 -= 3;
            int var7 = field863[Statics.field1535];
            int var8 = field863[Statics.field1535 + 1];
            int var9 = field863[Statics.field1535 + 2];
            field863[++Statics.field1535 - 1] = Statics.field5477.method3120(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field863[++Statics.field1535 - 1] = Statics.field5477.field1776;
            return 1;
        } else if (arg0 == 3816) {
            field863[++Statics.field1535 - 1] = Statics.field5477.field1785;
            return 1;
        } else if (arg0 == 3817) {
            field863[++Statics.field1535 - 1] = Statics.field5477.method3177(field858[--Statics.field3663]);
            return 1;
        } else if (arg0 == 3818) {
            field863[Statics.field1535 - 1] = Statics.field5477.method3153()[field863[Statics.field1535 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field1535 -= 2;
            int var10 = field863[Statics.field1535];
            int var11 = field863[Statics.field1535 + 1];
            client.method5230(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = Statics.field5477.field1775[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field1535 -= 3;
                int var13 = field863[Statics.field1535];
                boolean var14 = field863[Statics.field1535 + 1] == 1;
                int var15 = field863[Statics.field1535 + 2];
                client.method2832(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field863[--Statics.field1535];
                field863[++Statics.field1535 - 1] = Statics.field5477.field1777[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field2869 == null) {
                    field863[++Statics.field1535 - 1] = 0;
                } else {
                    field863[++Statics.field1535 - 1] = 1;
                    Statics.field1974 = Statics.field2869;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field863[--Statics.field1535];
                if (client.field747[var17] == null) {
                    field863[++Statics.field1535 - 1] = 0;
                } else {
                    field863[++Statics.field1535 - 1] = 1;
                    Statics.field1974 = client.field747[var17];
                    Statics.field5286 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field858[++Statics.field3663 - 1] = Statics.field1974.field1825;
                return 1;
            } else if (arg0 == 3853) {
                field863[++Statics.field1535 - 1] = Statics.field1974.field1818;
                return 1;
            } else if (arg0 == 3854) {
                field863[++Statics.field1535 - 1] = Statics.field1974.field1824;
                return 1;
            } else if (arg0 == 3855) {
                field863[++Statics.field1535 - 1] = Statics.field1974.method3223();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field863[--Statics.field1535];
                field858[++Statics.field3663 - 1] = ((class150) Statics.field1974.field1820.get(var18)).field1702.method9347();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field863[--Statics.field1535];
                field863[++Statics.field1535 - 1] = ((class150) Statics.field1974.field1820.get(var19)).field1704;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field863[--Statics.field1535];
                field863[++Statics.field1535 - 1] = ((class150) Statics.field1974.field1820.get(var20)).field1701;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field863[--Statics.field1535];
                client.method2666(Statics.field5286, var21);
                return 1;
            } else if (arg0 == 3860) {
                field863[++Statics.field1535 - 1] = Statics.field1974.method3206(field858[--Statics.field3663]);
                return 1;
            } else if (arg0 == 3861) {
                field863[Statics.field1535 - 1] = Statics.field1974.method3202()[field863[Statics.field1535 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field863[++Statics.field1535 - 1] = Statics.field1172 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("gv.ba(ILdg;ZI)I")
    public static int method3266(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field794[var3].method6706();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field794[var4].field4600;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field794[var5].field4599;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field794[var6].field4598;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field794[var7].field4601;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.field794[var8].field4602;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field863[--Statics.field1535];
            int var10 = client.field794[var9].method6705();
            field863[++Statics.field1535 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field863[--Statics.field1535];
            int var12 = client.field794[var11].method6705();
            field863[++Statics.field1535 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field863[--Statics.field1535];
            int var14 = client.field794[var13].method6705();
            field863[++Statics.field1535 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field863[--Statics.field1535];
            int var16 = client.field794[var15].method6705();
            field863[++Statics.field1535 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field863[--Statics.field1535] == 1;
            if (Statics.field2634 != null) {
                Statics.field2634.method6659(class390.field4576, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field863[--Statics.field1535] == 1;
            if (Statics.field2634 != null) {
                Statics.field2634.method6659(class390.field4575, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1535 -= 2;
            boolean var19 = field863[Statics.field1535] == 1;
            boolean var20 = field863[Statics.field1535 + 1] == 1;
            if (Statics.field2634 != null) {
                client.field809.field466 = var20;
                Statics.field2634.method6659(client.field809, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field863[--Statics.field1535] == 1;
            if (Statics.field2634 != null) {
                Statics.field2634.method6659(class390.field4574, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field863[--Statics.field1535] == 1;
            if (Statics.field2634 != null) {
                Statics.field2634.method6659(class390.field4573, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field863[++Statics.field1535 - 1] = Statics.field2634 == null ? 0 : Statics.field2634.field4578.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field863[--Statics.field1535];
            class396 var24 = (class396) Statics.field2634.field4578.get(var23);
            field863[++Statics.field1535 - 1] = var24.field4594;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field863[--Statics.field1535];
            class396 var26 = (class396) Statics.field2634.field4578.get(var25);
            field858[++Statics.field3663 - 1] = var26.method6698();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field863[--Statics.field1535];
            class396 var28 = (class396) Statics.field2634.field4578.get(var27);
            field858[++Statics.field3663 - 1] = var28.method6699();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field863[--Statics.field1535];
            class396 var30 = (class396) Statics.field2634.field4578.get(var29);
            long var31 = class327.method4500() - Statics.field4989 - var30.field4592;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field858[++Statics.field3663 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field863[--Statics.field1535];
            class396 var38 = (class396) Statics.field2634.field4578.get(var37);
            field863[++Statics.field1535 - 1] = var38.field4593.field4598;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field863[--Statics.field1535];
            class396 var40 = (class396) Statics.field2634.field4578.get(var39);
            field863[++Statics.field1535 - 1] = var40.field4593.field4599;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field863[--Statics.field1535];
            class396 var42 = (class396) Statics.field2634.field4578.get(var41);
            field863[++Statics.field1535 - 1] = var42.field4593.field4600;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class208.method3193(var43).field2261 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.bg(ILdg;ZI)I")
    public static int method844(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1535 -= 2;
            int var3 = field863[Statics.field1535];
            int var4 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1535 -= 2;
            int var5 = field863[Statics.field1535];
            int var6 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1535 -= 2;
            int var7 = field863[Statics.field1535];
            int var8 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1535 -= 2;
            int var9 = field863[Statics.field1535];
            int var10 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1535 -= 5;
            int var13 = field863[Statics.field1535];
            int var14 = field863[Statics.field1535 + 1];
            int var15 = field863[Statics.field1535 + 2];
            int var16 = field863[Statics.field1535 + 3];
            int var17 = field863[Statics.field1535 + 4];
            field863[++Statics.field1535 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1535 -= 2;
            int var18 = field863[Statics.field1535];
            int var19 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1535 -= 2;
            int var20 = field863[Statics.field1535];
            int var21 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1535 -= 2;
            int var22 = field863[Statics.field1535];
            int var23 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1535 -= 2;
            int var24 = field863[Statics.field1535];
            int var25 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1535 -= 2;
            int var26 = field863[Statics.field1535];
            int var27 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1535 -= 2;
            int var28 = field863[Statics.field1535];
            int var29 = field863[Statics.field1535 + 1];
            if (var28 == 0) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1535 -= 2;
            int var30 = field863[Statics.field1535];
            int var31 = field863[Statics.field1535 + 1];
            if (var30 == 0) {
                field863[++Statics.field1535 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field863[++Statics.field1535 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field863[++Statics.field1535 - 1] = var30;
                    break;
                case 2:
                    field863[++Statics.field1535 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field863[++Statics.field1535 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field863[++Statics.field1535 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field863[++Statics.field1535 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1535 -= 2;
            int var32 = field863[Statics.field1535];
            int var33 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1535 -= 2;
            int var34 = field863[Statics.field1535];
            int var35 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field1535 -= 2;
            int var36 = field863[Statics.field1535];
            int var37 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field1535 -= 2;
            int var38 = field863[Statics.field1535];
            int var39 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1535 -= 3;
            long var40 = (long) field863[Statics.field1535];
            long var42 = (long) field863[Statics.field1535 + 1];
            long var44 = (long) field863[Statics.field1535 + 2];
            field863[++Statics.field1535 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class329.method1810(field863[--Statics.field1535]);
            field863[++Statics.field1535 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field1535 -= 2;
            int var47 = field863[Statics.field1535];
            int var48 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field1535 -= 3;
            int var49 = field863[Statics.field1535];
            int var50 = field863[Statics.field1535 + 1];
            int var51 = field863[Statics.field1535 + 2];
            field863[++Statics.field1535 - 1] = class329.method3200(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field1535 -= 3;
            int var52 = field863[Statics.field1535];
            int var53 = field863[Statics.field1535 + 1];
            int var54 = field863[Statics.field1535 + 2];
            field863[++Statics.field1535 - 1] = class329.method276(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field1535 -= 3;
            int var55 = field863[Statics.field1535];
            int var56 = field863[Statics.field1535 + 1];
            int var57 = field863[Statics.field1535 + 2];
            int var58 = 31 - var57;
            field863[++Statics.field1535 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field1535 -= 4;
            int var59 = field863[Statics.field1535];
            int var60 = field863[Statics.field1535 + 1];
            int var61 = field863[Statics.field1535 + 2];
            int var62 = field863[Statics.field1535 + 3];
            int var63 = class329.method276(var59, var61, var62);
            int var64 = class329.method2056(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field863[++Statics.field1535 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field863[Statics.field1535 - 1] = class497.method3733(field863[Statics.field1535 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field863[Statics.field1535 - 1] = class497.method37(field863[Statics.field1535 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field1535 -= 2;
            int var65 = field863[Statics.field1535];
            int var66 = field863[Statics.field1535 + 1];
            int var67 = class497.method5887(var65, var66);
            field863[++Statics.field1535 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field863[Statics.field1535 - 1] = Math.abs(field863[Statics.field1535 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field858[--Statics.field3663];
            int var69 = -1;
            if (class416.method2403(var68)) {
                var69 = class416.method6702(var68);
            }
            field863[++Statics.field1535 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("as.bs(ILdg;ZB)I")
    public static int method294(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field858[--Statics.field3663];
            int var4 = field863[--Statics.field1535];
            field858[++Statics.field3663 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field3663 -= 2;
            String var5 = field858[Statics.field3663];
            String var6 = field858[Statics.field3663 + 1];
            field858[++Statics.field3663 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field858[--Statics.field3663];
            int var8 = field863[--Statics.field1535];
            field858[++Statics.field3663 - 1] = var7 + class416.method3526(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field858[--Statics.field3663];
            field858[++Statics.field3663 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field863[--Statics.field1535];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field868.setTime(new Date(var11));
            int var13 = field868.get(5);
            int var14 = field868.get(2);
            int var15 = field868.get(1);
            field858[++Statics.field3663 - 1] = var13 + "-" + field869[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field3663 -= 2;
            String var16 = field858[Statics.field3663];
            String var17 = field858[Statics.field3663 + 1];
            if (Statics.field297.field1147 == null || Statics.field297.field1147.field3776 == 0) {
                field858[++Statics.field3663 - 1] = var16;
            } else {
                field858[++Statics.field3663 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field863[--Statics.field1535];
            field858[++Statics.field3663 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field3663 -= 2;
            field863[++Statics.field1535 - 1] = class416.method3888(Statics.method477(field858[Statics.field3663], field858[Statics.field3663 + 1], Statics.field1514));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field858[--Statics.field3663];
            Statics.field1535 -= 2;
            int var20 = field863[Statics.field1535];
            int var21 = field863[Statics.field1535 + 1];
            byte[] var22 = Statics.field1029.method6539(var21, 0);
            class432 var23 = new class432(var22);
            field863[++Statics.field1535 - 1] = var23.method7429(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field858[--Statics.field3663];
            Statics.field1535 -= 2;
            int var25 = field863[Statics.field1535];
            int var26 = field863[Statics.field1535 + 1];
            byte[] var27 = Statics.field1029.method6539(var26, 0);
            class432 var28 = new class432(var27);
            field863[++Statics.field1535 - 1] = var28.method7428(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field3663 -= 2;
            String var29 = field858[Statics.field3663];
            String var30 = field858[Statics.field3663 + 1];
            if (field863[--Statics.field1535] == 1) {
                field858[++Statics.field3663 - 1] = var29;
            } else {
                field858[++Statics.field3663 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field858[--Statics.field3663];
            field858[++Statics.field3663 - 1] = class436.method7430(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field858[--Statics.field3663];
            int var33 = field863[--Statics.field1535];
            field858[++Statics.field3663 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class416.method5215((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class416.method3280((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class416.method5773((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class416.method4577((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field858[--Statics.field3663];
            if (var38 == null) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field858[--Statics.field3663];
            Statics.field1535 -= 2;
            int var40 = field863[Statics.field1535];
            int var41 = field863[Statics.field1535 + 1];
            field858[++Statics.field3663 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field858[--Statics.field3663];
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
            field858[++Statics.field3663 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field858[--Statics.field3663];
            int var48 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field3663 -= 2;
            String var49 = field858[Statics.field3663];
            String var50 = field858[Statics.field3663 + 1];
            int var51 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field858[--Statics.field3663];
            field858[++Statics.field3663 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field3663 -= 3;
            String var53 = field858[Statics.field3663];
            String var54 = field858[Statics.field3663 + 1];
            String var55 = field858[Statics.field3663 + 2];
            if (Statics.field297.field1147 == null) {
                field858[++Statics.field3663 - 1] = var55;
                return 1;
            }
            switch(Statics.field297.field1147.field3784) {
                case 0:
                    field858[++Statics.field3663 - 1] = var53;
                    break;
                case 1:
                    field858[++Statics.field3663 - 1] = var54;
                    break;
                case 2:
                default:
                    field858[++Statics.field3663 - 1] = var55;
            }
            return 1;
        } else if (arg0 == 4124) {
            field863[++Statics.field1535 - 1] = Statics.field297.field1147 == null ? -1 : Statics.field297.field1147.field3784;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cy.bp(ILdg;ZI)I")
    public static int method1173(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field863[--Statics.field1535];
            field858[++Statics.field3663 - 1] = class208.method3193(var3).field2216;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1535 -= 2;
            int var4 = field863[Statics.field1535];
            int var5 = field863[Statics.field1535 + 1];
            class208 var6 = class208.method3193(var4);
            if (var5 < 1 || var5 > 5 || var6.field2257[var5 - 1] == null) {
                field858[++Statics.field3663 - 1] = "";
            } else {
                field858[++Statics.field3663 - 1] = var6.field2257[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1535 -= 2;
            int var7 = field863[Statics.field1535];
            int var8 = field863[Statics.field1535 + 1];
            class208 var9 = class208.method3193(var7);
            if (var8 < 1 || var8 > 5 || var9.field2237[var8 - 1] == null) {
                field858[++Statics.field3663 - 1] = "";
            } else {
                field858[++Statics.field3663 - 1] = var9.field2237[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class208.method3193(var10).field2229;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class208.method3193(var11).field2228 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field863[--Statics.field1535];
            class208 var13 = class208.method3193(var12);
            if (var13.field2252 == -1 && var13.field2251 >= 0) {
                field863[++Statics.field1535 - 1] = var13.field2251;
            } else {
                field863[++Statics.field1535 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field863[--Statics.field1535];
            class208 var15 = class208.method3193(var14);
            if (var15.field2252 >= 0 && var15.field2251 >= 0) {
                field863[++Statics.field1535 - 1] = var15.field2251;
            } else {
                field863[++Statics.field1535 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class208.method3193(var16).field2233 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field863[--Statics.field1535];
            class208 var18 = class208.method3193(var17);
            if (var18.field2265 == -1 && var18.field2264 >= 0) {
                field863[++Statics.field1535 - 1] = var18.field2264;
            } else {
                field863[++Statics.field1535 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field863[--Statics.field1535];
            class208 var20 = class208.method3193(var19);
            if (var20.field2265 >= 0 && var20.field2264 >= 0) {
                field863[++Statics.field1535 - 1] = var20.field2264;
            } else {
                field863[++Statics.field1535 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field858[--Statics.field3663];
            int var22 = field863[--Statics.field1535];
            client.method36(var21, var22 == 1);
            field863[++Statics.field1535 - 1] = Statics.field1079;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field2548 == null || Statics.field908 >= Statics.field1079) {
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = Statics.field2548[++Statics.field908 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field908 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field863[--Statics.field1535];
            int var24 = class208.method3193(var23).method3674();
            if (var24 == -1) {
                field863[++Statics.field1535 - 1] = var24;
            } else {
                field863[++Statics.field1535 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class208.method3193(var25).field2230;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class208.method3193(var26).field2224;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class208.method3193(var27).field2232;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field863[--Statics.field1535];
            class208 var29 = class208.method3193(var28);
            field863[++Statics.field1535 - 1] = var29.field2259;
            return 1;
        } else if (arg0 == 4218) {
            int var30 = field863[--Statics.field1535];
            field858[++Statics.field3663 - 1] = class208.method3193(var30).field2217;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ae.bx(ILdg;ZI)I")
    public static int method94(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field863[++Statics.field1535 - 1] = client.field735;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1535 -= 3;
            client.field735 = field863[Statics.field1535];
            Statics.field5244 = class566.method38(field863[Statics.field1535 + 1]);
            if (Statics.field5244 == null) {
                Statics.field5244 = class566.field5502;
            }
            client.field774 = field863[Statics.field1535 + 2];
            class322 var3 = class322.method3236(class320.field3333, client.field653.field1456);
            var3.field3394.method8711(client.field735);
            var3.field3394.method8711(Statics.field5244.field5504);
            var3.field3394.method8711(client.field774);
            client.field653.method2773(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field858[--Statics.field3663];
            Statics.field1535 -= 2;
            int var5 = field863[Statics.field1535];
            int var6 = field863[Statics.field1535 + 1];
            class322 var7 = class322.method3236(class320.field3350, client.field653.field1456);
            var7.field3394.method8711(class547.method2396(var4) + 2);
            var7.field3394.method8718(var4);
            var7.field3394.method8711(var5 - 1);
            var7.field3394.method8711(var6);
            client.field653.method2773(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1535 -= 2;
            int var8 = field863[Statics.field1535];
            int var9 = field863[Statics.field1535 + 1];
            class65 var10 = class114.method2289(var8, var9);
            if (var10 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
                field858[++Statics.field3663 - 1] = "";
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = var10.field448;
                field863[++Statics.field1535 - 1] = var10.field449;
                field858[++Statics.field3663 - 1] = var10.field451 == null ? "" : var10.field451;
                field858[++Statics.field3663 - 1] = var10.field455 == null ? "" : var10.field455;
                field858[++Statics.field3663 - 1] = var10.field456 == null ? "" : var10.field456;
                field863[++Statics.field1535 - 1] = var10.method1129() ? 1 : (var10.method1126() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field863[--Statics.field1535];
            class65 var12 = class114.method5182(var11);
            if (var12 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
                field858[++Statics.field3663 - 1] = "";
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = var12.field450;
                field863[++Statics.field1535 - 1] = var12.field449;
                field858[++Statics.field3663 - 1] = var12.field451 == null ? "" : var12.field451;
                field858[++Statics.field3663 - 1] = var12.field455 == null ? "" : var12.field455;
                field858[++Statics.field3663 - 1] = var12.field456 == null ? "" : var12.field456;
                field863[++Statics.field1535 - 1] = var12.method1129() ? 1 : (var12.method1126() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field5244 == null) {
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = Statics.field5244.field5504;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field858[--Statics.field3663];
            int var14 = field863[--Statics.field1535];
            class322 var15 = class570.method7946(var14, var13, Statics.field1514, -1);
            client.field653.method2773(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field3663 -= 2;
            String var16 = field858[Statics.field3663];
            String var17 = field858[Statics.field3663 + 1];
            class322 var18 = class322.method3236(class320.field3322, client.field653.field1456);
            var18.field3394.method8712(0);
            int var19 = var18.field3394.field5363;
            var18.field3394.method8718(var16);
            class366.method3990(var18.field3394, var17);
            var18.field3394.method8921(var18.field3394.field5363 - var19);
            client.field653.method2773(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field858[--Statics.field3663];
            Statics.field1535 -= 2;
            int var21 = field863[Statics.field1535];
            int var22 = field863[Statics.field1535 + 1];
            class322 var23 = class570.method7946(var21, var20, Statics.field1514, var22);
            client.field653.method2773(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field297 == null || Statics.field297.field1137 == null) {
                var24 = "";
            } else {
                var24 = Statics.field297.field1137.method9347();
            }
            field858[++Statics.field3663 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field863[++Statics.field1535 - 1] = client.field774;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class114.method1032(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class114.method706(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = class114.method2062(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field858[--Statics.field3663];
            client.method3191(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field737 = field858[--Statics.field3663].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field858[++Statics.field3663 - 1] = client.field737;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field858[--Statics.field3663];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field1535 -= 2;
            int var30 = field863[Statics.field1535];
            int var31 = field863[Statics.field1535 + 1];
            class65 var32 = class114.method2289(var30, var31);
            if (var32 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
                field858[++Statics.field3663 - 1] = "";
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = var32.field448;
                field863[++Statics.field1535 - 1] = var32.field449;
                field858[++Statics.field3663 - 1] = var32.field451 == null ? "" : var32.field451;
                field858[++Statics.field3663 - 1] = var32.field455 == null ? "" : var32.field455;
                field858[++Statics.field3663 - 1] = var32.field456 == null ? "" : var32.field456;
                field863[++Statics.field1535 - 1] = var32.method1129() ? 1 : (var32.method1126() ? 2 : 0);
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field863[--Statics.field1535];
            class65 var34 = class114.method5182(var33);
            if (var34 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
                field858[++Statics.field3663 - 1] = "";
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = var34.field450;
                field863[++Statics.field1535 - 1] = var34.field449;
                field858[++Statics.field3663 - 1] = var34.field451 == null ? "" : var34.field451;
                field858[++Statics.field3663 - 1] = var34.field455 == null ? "" : var34.field455;
                field858[++Statics.field3663 - 1] = var34.field456 == null ? "" : var34.field456;
                field863[++Statics.field1535 - 1] = var34.method1129() ? 1 : (var34.method1126() ? 2 : 0);
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.bu(ILdg;ZB)I")
    public static int method8(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field863[++Statics.field1535 - 1] = client.method1159();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field863[--Statics.field1535];
            if (var3 == 1 || var3 == 2) {
                client.method3988(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field863[++Statics.field1535 - 1] = Statics.field1379.method2494();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field863[--Statics.field1535];
            if (var4 == 1 || var4 == 2) {
                Statics.field1379.method2466(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1535--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ev.by(ILdg;ZI)I")
    public static int method2791(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1535 -= 2;
            int var3 = field863[Statics.field1535];
            int var4 = field863[Statics.field1535 + 1];
            if (!client.field767) {
                client.field632 = var3;
                client.field590 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field863[++Statics.field1535 - 1] = client.field632;
            return 1;
        } else if (arg0 == 5506) {
            field863[++Statics.field1535 - 1] = client.field590;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field863[--Statics.field1535];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field686 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field863[++Statics.field1535 - 1] = client.field686;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fj.bl(IB)I")
    public static int method3111(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("dp.bc(IS)I")
    public static int method2268(int arg0) {
        return (int) ((Math.log((double) arg0) / field870 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("mf.bv(ILdg;ZI)I")
    public static int method5783(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1535 -= 2;
            client.field777 = (short) method3111(field863[Statics.field1535]);
            if (client.field777 <= 0) {
                client.field777 = 256;
            }
            client.field778 = (short) method3111(field863[Statics.field1535 + 1]);
            if (client.field778 <= 0) {
                client.field778 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1535 -= 2;
            client.field650 = (short) field863[Statics.field1535];
            if (client.field650 <= 0) {
                client.field650 = 256;
            }
            client.field780 = (short) field863[Statics.field1535 + 1];
            if (client.field780 <= 0) {
                client.field780 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1535 -= 4;
            client.field752 = (short) field863[Statics.field1535];
            if (client.field752 <= 0) {
                client.field752 = 1;
            }
            client.field782 = (short) field863[Statics.field1535 + 1];
            if (client.field782 <= 0) {
                client.field782 = 32767;
            } else if (client.field782 < client.field752) {
                client.field782 = client.field752;
            }
            client.field783 = (short) field863[Statics.field1535 + 2];
            if (client.field783 <= 0) {
                client.field783 = 1;
            }
            client.field784 = (short) field863[Statics.field1535 + 3];
            if (client.field784 <= 0) {
                client.field784 = 32767;
            } else if (client.field784 < client.field783) {
                client.field784 = client.field783;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field683 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = -1;
            } else {
                client.method2790(0, 0, client.field683.field3847, client.field683.field3848, false);
                field863[++Statics.field1535 - 1] = client.field787;
                field863[++Statics.field1535 - 1] = client.field701;
            }
            return 1;
        } else if (arg0 == 6204) {
            field863[++Statics.field1535 - 1] = client.field650;
            field863[++Statics.field1535 - 1] = client.field780;
            return 1;
        } else if (arg0 == 6205) {
            field863[++Statics.field1535 - 1] = method2268(client.field777);
            field863[++Statics.field1535 - 1] = method2268(client.field778);
            return 1;
        } else if (arg0 == 6220) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field863[++Statics.field1535 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field863[++Statics.field1535 - 1] = Statics.field890;
            return 1;
        } else if (arg0 == 6223) {
            field863[++Statics.field1535 - 1] = Statics.field5;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bu.bb(ILdg;ZI)I")
    public static int method709(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field863[++Statics.field1535 - 1] = class70.method6455() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class70 var3 = class70.method5216();
            if (var3 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
            } else {
                field863[++Statics.field1535 - 1] = var3.field819;
                field863[++Statics.field1535 - 1] = var3.field829;
                field858[++Statics.field3663 - 1] = var3.field823;
                field863[++Statics.field1535 - 1] = var3.field824;
                field863[++Statics.field1535 - 1] = var3.field821;
                field858[++Statics.field3663 - 1] = var3.field822;
            }
            return 1;
        } else if (arg0 == 6502) {
            class70 var4 = class70.method1811();
            if (var4 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
            } else {
                field863[++Statics.field1535 - 1] = var4.field819;
                field863[++Statics.field1535 - 1] = var4.field829;
                field858[++Statics.field3663 - 1] = var4.field823;
                field863[++Statics.field1535 - 1] = var4.field824;
                field863[++Statics.field1535 - 1] = var4.field821;
                field858[++Statics.field3663 - 1] = var4.field822;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field863[--Statics.field1535];
            class70 var6 = null;
            for (int var7 = 0; var7 < class70.field815; var7++) {
                if (Statics.field3820[var7].field819 == var5) {
                    var6 = Statics.field3820[var7];
                    break;
                }
            }
            if (var6 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
            } else {
                field863[++Statics.field1535 - 1] = var6.field819;
                field863[++Statics.field1535 - 1] = var6.field829;
                field858[++Statics.field3663 - 1] = var6.field823;
                field863[++Statics.field1535 - 1] = var6.field824;
                field863[++Statics.field1535 - 1] = var6.field821;
                field858[++Statics.field3663 - 1] = var6.field822;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1535 -= 4;
            int var8 = field863[Statics.field1535];
            boolean var9 = field863[Statics.field1535 + 1] == 1;
            int var10 = field863[Statics.field1535 + 2];
            boolean var11 = field863[Statics.field1535 + 3] == 1;
            class70.method3238(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field863[--Statics.field1535];
            if (var12 >= 0 && var12 < class70.field815) {
                class70 var13 = Statics.field3820[var12];
                field863[++Statics.field1535 - 1] = var13.field819;
                field863[++Statics.field1535 - 1] = var13.field829;
                field858[++Statics.field3663 - 1] = var13.field823;
                field863[++Statics.field1535 - 1] = var13.field824;
                field863[++Statics.field1535 - 1] = var13.field821;
                field858[++Statics.field3663 - 1] = var13.field822;
            } else {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
                field863[++Statics.field1535 - 1] = 0;
                field863[++Statics.field1535 - 1] = 0;
                field858[++Statics.field3663 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field658 = field863[--Statics.field1535] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1535 -= 2;
            int var14 = field863[Statics.field1535];
            int var15 = field863[Statics.field1535 + 1];
            class203 var16 = class203.method1148(var15);
            if (var16.method3535()) {
                field858[++Statics.field3663 - 1] = class193.method2064(var14).method3409(var15, var16.field2114);
            } else {
                field863[++Statics.field1535 - 1] = class193.method2064(var14).method3410(var15, var16.field2116);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1535 -= 2;
            int var17 = field863[Statics.field1535];
            int var18 = field863[Statics.field1535 + 1];
            class203 var19 = class203.method1148(var18);
            if (var19.method3535()) {
                field858[++Statics.field3663 - 1] = class207.method95(var17).method3618(var18, var19.field2114);
            } else {
                field863[++Statics.field1535 - 1] = class207.method95(var17).method3652(var18, var19.field2116);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1535 -= 2;
            int var20 = field863[Statics.field1535];
            int var21 = field863[Statics.field1535 + 1];
            class203 var22 = class203.method1148(var21);
            if (var22.method3535()) {
                field858[++Statics.field3663 - 1] = class208.method3193(var20).method3719(var21, var22.field2114);
            } else {
                field863[++Statics.field1535 - 1] = class208.method3193(var20).method3672(var21, var22.field2116);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1535 -= 2;
            int var23 = field863[Statics.field1535];
            int var24 = field863[Statics.field1535 + 1];
            class203 var25 = class203.method1148(var24);
            if (var25.method3535()) {
                field858[++Statics.field3663 - 1] = class204.method1746(var23).method3552(var24, var25.field2114);
            } else {
                field863[++Statics.field1535 - 1] = class204.method1746(var23).method3551(var24, var25.field2116);
            }
            return 1;
        } else if (arg0 == 6518) {
            field863[++Statics.field1535 - 1] = client.field508 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field863[++Statics.field1535 - 1] = client.field635;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field3663--;
            Statics.field1535--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field3663--;
            Statics.field1535--;
            return 1;
        } else if (arg0 == 6524) {
            field863[++Statics.field1535 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field863[++Statics.field1535 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field863[++Statics.field1535 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field863[++Statics.field1535 - 1] = client.field507;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jz.bn(ILdg;ZI)I")
    public static int method4176(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field5138.field1319;
            int var4 = (Statics.field297.field1229 >> 7) + Statics.field5138.field1322;
            int var5 = (Statics.field297.field1192 >> 7) + Statics.field5138.field1324;
            client.method196().method8211(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field863[--Statics.field1535];
            String var7 = "";
            class248 var8 = client.method196().method8303(var6);
            if (var8 != null) {
                var7 = var8.method4272();
            }
            field858[++Statics.field3663 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field863[--Statics.field1535];
            client.method196().method8300(var9);
            return 1;
        } else if (arg0 == 6603) {
            field863[++Statics.field1535 - 1] = client.method196().method8227();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field863[--Statics.field1535];
            client.method196().method8224(var10);
            return 1;
        } else if (arg0 == 6605) {
            field863[++Statics.field1535 - 1] = client.method196().method8229() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class348 var11 = new class348(field863[--Statics.field1535]);
            client.method196().method8231(var11.field3733, var11.field3735);
            return 1;
        } else if (arg0 == 6607) {
            class348 var12 = new class348(field863[--Statics.field1535]);
            client.method196().method8322(var12.field3733, var12.field3735);
            return 1;
        } else if (arg0 == 6608) {
            class348 var13 = new class348(field863[--Statics.field1535]);
            client.method196().method8313(var13.field3734, var13.field3733, var13.field3735);
            return 1;
        } else if (arg0 == 6609) {
            class348 var14 = new class348(field863[--Statics.field1535]);
            client.method196().method8234(var14.field3734, var14.field3733, var14.field3735);
            return 1;
        } else if (arg0 == 6610) {
            field863[++Statics.field1535 - 1] = client.method196().method8235();
            field863[++Statics.field1535 - 1] = client.method196().method8236();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field863[--Statics.field1535];
            class248 var16 = client.method196().method8303(var15);
            if (var16 == null) {
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = var16.method4283().method5852();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field863[--Statics.field1535];
            class248 var18 = client.method196().method8303(var17);
            if (var18 == null) {
                field863[++Statics.field1535 - 1] = 0;
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = (var18.method4277() - var18.method4281() + 1) * 64;
                field863[++Statics.field1535 - 1] = (var18.method4298() - var18.method4278() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field863[--Statics.field1535];
            class248 var20 = client.method196().method8303(var19);
            if (var20 == null) {
                field863[++Statics.field1535 - 1] = 0;
                field863[++Statics.field1535 - 1] = 0;
                field863[++Statics.field1535 - 1] = 0;
                field863[++Statics.field1535 - 1] = 0;
            } else {
                field863[++Statics.field1535 - 1] = var20.method4281() * 64;
                field863[++Statics.field1535 - 1] = var20.method4278() * 64;
                field863[++Statics.field1535 - 1] = var20.method4277() * 64 + 64 - 1;
                field863[++Statics.field1535 - 1] = var20.method4298() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field863[--Statics.field1535];
            class248 var22 = client.method196().method8303(var21);
            if (var22 == null) {
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = var22.method4275();
            }
            return 1;
        } else if (arg0 == 6615) {
            class348 var23 = client.method196().method8237();
            if (var23 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = var23.field3733;
                field863[++Statics.field1535 - 1] = var23.field3735;
            }
            return 1;
        } else if (arg0 == 6616) {
            field863[++Statics.field1535 - 1] = client.method196().method8371();
            return 1;
        } else if (arg0 == 6617) {
            class348 var24 = new class348(field863[--Statics.field1535]);
            class248 var25 = client.method196().method8214();
            if (var25 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4266(var24.field3734, var24.field3733, var24.field3735);
            if (var26 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = var26[0];
                field863[++Statics.field1535 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class348 var27 = new class348(field863[--Statics.field1535]);
            class248 var28 = client.method196().method8214();
            if (var28 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = -1;
                return 1;
            }
            class348 var29 = var28.method4267(var27.field3733, var27.field3735);
            if (var29 == null) {
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = var29.method5852();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1535 -= 2;
            int var30 = field863[Statics.field1535];
            class348 var31 = new class348(field863[Statics.field1535 + 1]);
            method5462(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1535 -= 2;
            int var32 = field863[Statics.field1535];
            class348 var33 = new class348(field863[Statics.field1535 + 1]);
            method5462(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1535 -= 2;
            int var34 = field863[Statics.field1535];
            class348 var35 = new class348(field863[Statics.field1535 + 1]);
            class248 var36 = client.method196().method8303(var34);
            if (var36 == null) {
                field863[++Statics.field1535 - 1] = 0;
                return 1;
            } else {
                field863[++Statics.field1535 - 1] = var36.method4269(var35.field3734, var35.field3733, var35.field3735) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field863[++Statics.field1535 - 1] = client.method196().method8304();
            field863[++Statics.field1535 - 1] = client.method196().method8204();
            return 1;
        } else if (arg0 == 6623) {
            class348 var37 = new class348(field863[--Statics.field1535]);
            class248 var38 = client.method196().method8372(var37.field3734, var37.field3733, var37.field3735);
            if (var38 == null) {
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = var38.method4282();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method196().method8240(field863[--Statics.field1535]);
            return 1;
        } else if (arg0 == 6625) {
            client.method196().method8241();
            return 1;
        } else if (arg0 == 6626) {
            client.method196().method8253(field863[--Statics.field1535]);
            return 1;
        } else if (arg0 == 6627) {
            client.method196().method8243();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field863[--Statics.field1535] == 1;
            client.method196().method8244(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field863[--Statics.field1535];
            client.method196().method8245(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field863[--Statics.field1535];
            client.method196().method8246(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method196().method8200();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field863[--Statics.field1535] == 1;
            client.method196().method8248(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1535 -= 2;
            int var43 = field863[Statics.field1535];
            boolean var44 = field863[Statics.field1535 + 1] == 1;
            client.method196().method8249(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1535 -= 2;
            int var45 = field863[Statics.field1535];
            boolean var46 = field863[Statics.field1535 + 1] == 1;
            client.method196().method8341(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field863[++Statics.field1535 - 1] = client.method196().method8251() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.method196().method8252(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field863[--Statics.field1535];
            field863[++Statics.field1535 - 1] = client.method196().method8267(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1535 -= 2;
            int var49 = field863[Statics.field1535];
            class348 var50 = new class348(field863[Statics.field1535 + 1]);
            class348 var51 = client.method196().method8256(var49, var50);
            if (var51 == null) {
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = var51.method5852();
            }
            return 1;
        } else if (arg0 == 6639) {
            class266 var52 = client.method196().method8258();
            if (var52 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = var52.method4215();
                field863[++Statics.field1535 - 1] = var52.field2732.method5852();
            }
            return 1;
        } else if (arg0 == 6640) {
            class266 var53 = client.method196().method8259();
            if (var53 == null) {
                field863[++Statics.field1535 - 1] = -1;
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = var53.method4215();
                field863[++Statics.field1535 - 1] = var53.field2732.method5852();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field863[--Statics.field1535];
            class182 var55 = class182.method3196(var54);
            if (var55.field1891 == null) {
                field858[++Statics.field3663 - 1] = "";
            } else {
                field858[++Statics.field3663 - 1] = var55.field1891;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field863[--Statics.field1535];
            class182 var57 = class182.method3196(var56);
            field863[++Statics.field1535 - 1] = var57.field1894;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field863[--Statics.field1535];
            class182 var59 = class182.method3196(var58);
            if (var59 == null) {
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = var59.field1893;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field863[--Statics.field1535];
            class182 var61 = class182.method3196(var60);
            if (var61 == null) {
                field863[++Statics.field1535 - 1] = -1;
            } else {
                field863[++Statics.field1535 - 1] = var61.field1910;
            }
            return 1;
        } else if (arg0 == 6697) {
            field863[++Statics.field1535 - 1] = Statics.field3005.field2755;
            return 1;
        } else if (arg0 == 6698) {
            field863[++Statics.field1535 - 1] = Statics.field3005.field2756.method5852();
            return 1;
        } else if (arg0 == 6699) {
            field863[++Statics.field1535 - 1] = Statics.field3005.field2757.method5852();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("sz.bh(ILdg;ZI)I")
    public static int method7989(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field863[--Statics.field1535];
            class193 var4 = class193.method2064(var3);
            field858[++Statics.field3663 - 1] = var4 == null ? "" : var4.field1990;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field1535 -= 2;
            class193 var5 = class193.method2064(field863[Statics.field1535]);
            int var6 = field863[Statics.field1535 + 1];
            field863[++Statics.field1535 - 1] = var5.method3402(var6);
            field863[++Statics.field1535 - 1] = var5.method3416(var6);
            return 1;
        } else if (arg0 == 6765) {
            class193 var7 = class193.method2064(field863[--Statics.field1535]);
            field863[++Statics.field1535 - 1] = var7 == null ? 0 : var7.field2015;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cu.bq(ILdg;ZI)I")
    public static int method1062(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field863[--Statics.field1535];
            class207 var4 = class207.method95(var3);
            field858[++Statics.field3663 - 1] = var4 == null ? "" : var4.field2203;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("as.bd(ILdg;ZI)I")
    public static int method293(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("bg.bz(ILdg;ZB)I")
    public static int method479(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("nv.bk(ILdg;ZI)I")
    public static int method5807(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field863[++Statics.field1535 - 1] = client.method2647() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ns.br(ILdg;ZS)I")
    public static int method6230(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field863[--Statics.field1535] == 1;
            client.method3231(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kg.bf(ILdg;ZI)I")
    public static int method4576(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field863[--Statics.field1535];
            Object var45 = method4162(var44);
            int var46 = field863[--Statics.field1535];
            class539 var47 = client.method6456(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class541.method6662(var46);
            Statics.field2279 = var47.method8625(var45, var48);
            if (Statics.field2279 == null) {
                client.field799 = -1;
                Statics.field1490 = null;
                if (arg0 == 7500) {
                    field863[++Statics.field1535 - 1] = 0;
                }
            } else {
                client.field799 = class541.method3185(var46);
                Statics.field1490 = Statics.field2279.iterator();
                if (arg0 == 7500) {
                    field863[++Statics.field1535 - 1] = Statics.field2279.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field1490 != null && Statics.field1490.hasNext()) {
                field863[++Statics.field1535 - 1] = (Integer) Statics.field1490.next();
            } else {
                field863[++Statics.field1535 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field1535 -= 3;
            int var3 = field863[Statics.field1535];
            int var4 = field863[Statics.field1535 + 1];
            int var5 = field863[Statics.field1535 + 2];
            int var6 = class541.method3185(var4);
            int var7 = class541.method6964(var4);
            int var8 = class541.method6662(var4);
            class540 var9 = class540.method4538(var3);
            class538 var10 = class538.method3571(var6);
            int[] var11 = var10.field5297[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8634(var7);
            if (var14 == null && var10.field5298 != null) {
                var14 = var10.field5298[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class535 var17 = class533.method2651(var16);
                    if (class535.field5287 == var17) {
                        field858[++Statics.field3663 - 1] = "";
                    } else {
                        field863[++Statics.field1535 - 1] = Statics.method8553(var16);
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
                class535 var21 = class533.method2651(var11[var19]);
                if (class535.field5287 == var21) {
                    field858[++Statics.field3663 - 1] = (String) var14[var20];
                } else {
                    field863[++Statics.field1535 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field1535 -= 2;
            int var22 = field863[Statics.field1535];
            int var23 = field863[Statics.field1535 + 1];
            int var24 = 0;
            int var25 = class541.method3185(var23);
            int var26 = class541.method6964(var23);
            class540 var27 = class540.method4538(var22);
            class538 var28 = class538.method3571(var25);
            int[] var29 = var28.field5297[var26];
            Object[] var30 = var27.method8634(var26);
            if (var30 == null && var28.field5298 != null) {
                var30 = var28.field5298[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field863[++Statics.field1535 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field1535--;
            int var41 = field863[Statics.field1535];
            class539 var42 = client.method3258(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field2279 = var42.method8625(0, 0);
            int var43 = 0;
            if (Statics.field2279 != null) {
                client.field799 = var41;
                Statics.field1490 = Statics.field2279.iterator();
                var43 = Statics.field2279.size();
            }
            if (arg0 == 7504) {
                field863[++Statics.field1535 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field863[--Statics.field1535];
            class540 var32 = class540.method4538(var31);
            field863[++Statics.field1535 - 1] = var32.field5305;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field863[--Statics.field1535];
            int var34 = -1;
            if (Statics.field2279 != null && var33 >= 0 && var33 < Statics.field2279.size()) {
                var34 = (Integer) Statics.field2279.get(var33);
            }
            field863[++Statics.field1535 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field863[--Statics.field1535];
            Object var36 = method4162(var35);
            int var37 = field863[--Statics.field1535];
            class539 var38 = client.method6456(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class541.method3185(var37) != client.field799) {
                throw new RuntimeException();
            } else if (Statics.field2279 == null && Statics.field2279.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class541.method6662(var37);
                List var40 = var38.method8625(var36, var39);
                Statics.field2279 = new LinkedList(Statics.field2279);
                if (var40 == null) {
                    Statics.field2279.clear();
                } else {
                    Statics.field2279.retainAll(var40);
                }
                Statics.field1490 = Statics.field2279.iterator();
                if (arg0 == 7507) {
                    field863[++Statics.field1535 - 1] = Statics.field2279.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("rb.cf(ILdg;ZI)I")
    public static int method7748(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ad.cv(ILdg;ZI)I")
    public static int method11(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 8000) {
            Statics.field1535--;
            int var3 = field863[Statics.field1535];
            int var4 = field862[var3];
            class542.method3237(field872[var3], new int[var4], 0, var4 - 1);
            return 1;
        } else if (arg0 == 8001) {
            Statics.field1535 -= 3;
            int var5 = field863[Statics.field1535];
            int var6 = field863[Statics.field1535 + 1];
            int var7 = field863[Statics.field1535 + 2];
            int var8 = field862[var5];
            if (var8 <= 1) {
                return 1;
            } else {
                class448.method7599(field872[var5], var8, var6, var7);
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.cl(II)V")
    public static void method54(int arg0) {
        if (arg0 == -1 || !Statics.field4650.method5890(arg0)) {
            return;
        }
        class359[] var1 = Statics.field4650.field3741[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class359 var3 = var1[var2];
            if (var3.field3920 != null) {
                class90 var4 = new class90();
                var4.field1086 = var3;
                var4.field1088 = var3.field3920;
                method5835(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("lp.cm(ILnl;ZI)V")
    public static void method5462(int arg0, class348 arg1, boolean arg2) {
        class248 var3 = client.method196().method8303(arg0);
        int var4 = Statics.field297.field1128;
        int var5 = (Statics.field297.field1229 >> 7) + Statics.field5138.field1322;
        int var6 = (Statics.field297.field1192 >> 7) + Statics.field5138.field1324;
        class348 var7 = new class348(var4, var5, var6);
        client.method196().method8217(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("jz.cu(IB)Ljava/lang/Object;")
    public static Object method4162(int arg0) {
        return Statics.method2348((class535) class402.method3799(class535.method8593(), arg0));
    }
}
