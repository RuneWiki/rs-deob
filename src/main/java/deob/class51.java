package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ac")
public class class51 {

    @ObfuscatedName("ac.f")
    public static int[] field751 = new int[5];

    @ObfuscatedName("ac.o")
    public static int[][] field744 = new int[5][5000];

    @ObfuscatedName("ac.x")
    public static int[] field747 = new int[1000];

    @ObfuscatedName("ac.p")
    public static String[] field738 = new String[1000];

    @ObfuscatedName("ac.k")
    public static int field748 = 0;

    @ObfuscatedName("ac.a")
    public static class44[] field749 = new class44[50];

    @ObfuscatedName("ac.m")
    public static Calendar field745 = Calendar.getInstance();

    @ObfuscatedName("ac.b")
    public static final String[] field752 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ac.d")
    public static boolean field753 = false;

    @ObfuscatedName("ac.y")
    public static boolean field741 = false;

    @ObfuscatedName("ac.g")
    public static ArrayList field755 = new ArrayList();

    @ObfuscatedName("ac.ae")
    public static int field743 = 0;

    @ObfuscatedName("ac.aq")
    public static final double field757 = Math.log(2.0D);

    public class51() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.s(Lbq;I)V")
    public static void method2079(class68 arg0) {
        method1868(arg0, 500000, 475000);
    }

    @ObfuscatedName("cb.t(Lbq;III)V")
    public static void method1868(class68 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field955;
        class59 var5;
        if (class381.method3891(arg0.field963)) {
            Statics.field3879 = (class191) var3[0];
            class141 var4 = class141.method1794(Statics.field3879.field2136);
            var5 = class59.method3150(arg0.field963, var4.field1534, var4.field1553);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class59.method41(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field746 = 0;
        Statics.field4 = 0;
        int var7 = -1;
        int[] var8 = var5.field865;
        int[] var9 = var5.field870;
        byte var10 = -1;
        field748 = 0;
        field753 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field3854 = new int[var5.field864];
            int var13 = 0;
            Statics.field742 = new String[var5.field868];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field953;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field956;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field961 == null ? -1 : arg0.field961.field2958;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field957;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field961 == null ? -1 : arg0.field961.field3031;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field958 == null ? -1 : arg0.field958.field2958;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field958 == null ? -1 : arg0.field958.field3031;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field959;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field960;
                    }
                    Statics.field3854[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field952;
                    }
                    Statics.field742[var14++] = var17;
                }
            }
            field743 = arg0.field962;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field870[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method1872(var61, var5, var48);
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
                    field747[++Statics.field746 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field747[++Statics.field746 - 1] = class244.field2911[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class244.field2911[var19] = field747[--Statics.field746];
                    client.method817(var19);
                } else if (var61 == 3) {
                    field738[++Statics.field4 - 1] = var5.field866[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field746 -= 2;
                    if (field747[Statics.field746] != field747[Statics.field746 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field746 -= 2;
                    if (field747[Statics.field746] == field747[Statics.field746 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field746 -= 2;
                    if (field747[Statics.field746] < field747[Statics.field746 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field746 -= 2;
                    if (field747[Statics.field746] > field747[Statics.field746 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field748 == 0) {
                        return;
                    }
                    class44 var21 = field749[--field748];
                    var5 = var21.field368;
                    var8 = var5.field865;
                    var9 = var5.field870;
                    var7 = var21.field366;
                    Statics.field3854 = var21.field374;
                    Statics.field742 = var21.field369;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field747[++Statics.field746 - 1] = class244.method3219(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class244.method2110(var23, field747[--Statics.field746]);
                } else if (var61 == 31) {
                    Statics.field746 -= 2;
                    if (field747[Statics.field746] <= field747[Statics.field746 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field746 -= 2;
                    if (field747[Statics.field746] >= field747[Statics.field746 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field747[++Statics.field746 - 1] = Statics.field3854[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field3854[var9[var7]] = field747[--Statics.field746];
                } else if (var61 == 35) {
                    field738[++Statics.field4 - 1] = Statics.field742[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field742[var9[var7]] = field738[--Statics.field4];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field4 -= var24;
                    String var25 = class306.method3266(field738, Statics.field4, var24);
                    field738[++Statics.field4 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field746--;
                } else if (var61 == 39) {
                    Statics.field4--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class59 var27 = class59.method41(var26);
                    int[] var28 = new int[var27.field864];
                    String[] var29 = new String[var27.field868];
                    for (int var30 = 0; var30 < var27.field869; var30++) {
                        var28[var30] = field747[Statics.field746 - var27.field869 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field867; var31++) {
                        var29[var31] = field738[Statics.field4 - var27.field867 + var31];
                    }
                    Statics.field746 -= var27.field869;
                    Statics.field4 -= var27.field867;
                    class44 var32 = new class44();
                    var32.field368 = var5;
                    var32.field366 = var7;
                    var32.field374 = Statics.field3854;
                    var32.field369 = Statics.field742;
                    field749[++field748 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field865;
                    var9 = var27.field870;
                    var7 = -1;
                    Statics.field3854 = var28;
                    Statics.field742 = var29;
                } else if (var61 == 42) {
                    field747[++Statics.field746 - 1] = Statics.field311.method1913(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field311.method1912(var9[var7], field747[--Statics.field746]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field747[--Statics.field746];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field751[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field744[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field747[--Statics.field746];
                    if (var39 < 0 || var39 >= field751[var38]) {
                        throw new RuntimeException();
                    }
                    field747[++Statics.field746 - 1] = field744[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field746 -= 2;
                    int var41 = field747[Statics.field746];
                    if (var41 < 0 || var41 >= field751[var40]) {
                        throw new RuntimeException();
                    }
                    field744[var40][var41] = field747[Statics.field746 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field311.method1916(var9[var7]);
                    if (var42 == null) {
                        var42 = class270.field3234;
                    }
                    field738[++Statics.field4 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field311.method1915(var9[var7], field738[--Statics.field4]);
                } else if (var61 == 49) {
                    String var43 = Statics.field311.method1914(var9[var7]);
                    field738[++Statics.field4 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field311.method1942(var9[var7], field738[--Statics.field4]);
                } else if (var61 == 60) {
                    class363 var44 = var5.field871[var9[var7]];
                    class353 var45 = (class353) var44.method5726((long) field747[--Statics.field746]);
                    if (var45 != null) {
                        var7 += var45.field3964;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field1669.method2173(var9[var7]);
                    if (var46 == null) {
                        field747[++Statics.field746 - 1] = -1;
                    } else {
                        field747[++Statics.field746 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field372.method5402(var9[var7]);
                    if (var47 == null) {
                        field747[++Statics.field746 - 1] = -1;
                    } else {
                        field747[++Statics.field746 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field3966).append(" ");
            for (int var53 = field748 - 1; var53 >= 0; var53--) {
                var52.append("").append(field749[var53].field368.field3966).append(" ");
            }
            var52.append("").append(var10);
            class409.method5337(var52.toString(), var59);
        } finally {
            if (field753) {
                field741 = true;
            }
            while (field755.size() > 0) {
                class80 var56 = (class80) field755.remove(0);
                client.method3276(var56.method1884(), var56.method1871(), var56.method1875(), var56.method1878(), "");
            }
            if (field741) {
                client.method483();
                field741 = false;
                field753 = false;
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class409.method5337("Warning: Script " + var5.field863 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("cl.v(ILbd;ZB)I")
    public static int method1872(int arg0, class59 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method4362(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method4684(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method1925(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method1692(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method5712(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method2382(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method1887(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method34(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method4396(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method3885(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3889(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method4684(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method1925(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method1692(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method5712(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method2382(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method2527(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method4406(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method5306(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method5711(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3889(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method1788(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2241(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method120(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method4253(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method2489(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method4601(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method48(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method2095(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method2846(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method3995(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method2224(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3883(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2276(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method1315(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return Statics.method5703(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method1567(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method2776(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method1331(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method2955(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method2145(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method5372(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method1718(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method2326(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method3260(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method2906(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ib.j(ILbd;ZI)I")
    public static int method4362(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field746 -= 3;
            int var3 = field747[Statics.field746];
            int var4 = field747[Statics.field746 + 1];
            int var5 = field747[Statics.field746 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class249 var6 = class249.method2019(var3);
            if (var6.field3061 == null) {
                var6.field3061 = new class249[var5 + 1];
            }
            if (var6.field3061.length <= var5) {
                class249[] var7 = new class249[var5 + 1];
                for (int var8 = 0; var8 < var6.field3061.length; var8++) {
                    var7[var8] = var6.field3061[var8];
                }
                var6.field3061 = var7;
            }
            if (var5 > 0 && var6.field3061[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class249 var9 = new class249();
            var9.field2977 = var4;
            var9.field3001 = var9.field2958 = var6.field2958;
            var9.field3031 = var5;
            var9.field2993 = true;
            var6.field3061[var5] = var9;
            if (arg2) {
                Statics.field3660 = var9;
            } else {
                Statics.field750 = var9;
            }
            client.method1893(var6);
            return 1;
        } else if (arg0 == 101) {
            class249 var10 = arg2 ? Statics.field3660 : Statics.field750;
            class249 var11 = class249.method2019(var10.field2958);
            var11.field3061[var10.field3031] = null;
            client.method1893(var11);
            return 1;
        } else if (arg0 == 102) {
            class249 var12 = class249.method2019(field747[--Statics.field746]);
            var12.field3061 = null;
            client.method1893(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field746 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field746 -= 2;
            int var13 = field747[Statics.field746];
            int var14 = field747[Statics.field746 + 1];
            class249 var15 = class249.method1416(var13, var14);
            if (var15 == null || var14 == -1) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = 1;
                if (arg2) {
                    Statics.field3660 = var15;
                } else {
                    Statics.field750 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class249 var16 = class249.method2019(field747[--Statics.field746]);
            if (var16 == null) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = 1;
                if (arg2) {
                    Statics.field3660 = var16;
                } else {
                    Statics.field750 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field747[Statics.field746 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field747[--Statics.field746 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kj.l(ILbd;ZI)I")
    public static int method4684(int arg0, class59 arg1, boolean arg2) {
        int var3 = -1;
        class249 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field747[--Statics.field746];
            var4 = class249.method2019(var3);
        } else {
            var4 = arg2 ? Statics.field3660 : Statics.field750;
        }
        if (arg0 == 1000) {
            Statics.field746 -= 4;
            var4.field2947 = field747[Statics.field746];
            var4.field3019 = field747[Statics.field746 + 1];
            var4.field3063 = field747[Statics.field746 + 2];
            var4.field2964 = field747[Statics.field746 + 3];
            client.method1893(var4);
            Statics.field874.method852(var4);
            if (var3 != -1 && var4.field2977 == 0) {
                client.method1892(Statics.field3039[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field746 -= 4;
            var4.field2969 = field747[Statics.field746];
            var4.field2970 = field747[Statics.field746 + 1];
            var4.field3033 = field747[Statics.field746 + 2];
            var4.field3092 = field747[Statics.field746 + 3];
            client.method1893(var4);
            Statics.field874.method852(var4);
            if (var3 != -1 && var4.field2977 == 0) {
                client.method1892(Statics.field3039[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field747[--Statics.field746] == 1;
            if (var4.field2978 != var5) {
                var4.field2978 = var5;
                client.method1893(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3102 = field747[--Statics.field746] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3078 = field747[--Statics.field746] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ci.n(ILbd;ZI)I")
    public static int method1925(int arg0, class59 arg1, boolean arg2) {
        int var3 = -1;
        class249 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field747[--Statics.field746];
            var4 = class249.method2019(var3);
        } else {
            var4 = arg2 ? Statics.field3660 : Statics.field750;
        }
        if (arg0 == 1100) {
            Statics.field746 -= 2;
            var4.field3054 = field747[Statics.field746];
            if (var4.field3054 > var4.field2981 - var4.field2973) {
                var4.field3054 = var4.field2981 - var4.field2973;
            }
            if (var4.field3054 < 0) {
                var4.field3054 = 0;
            }
            var4.field2968 = field747[Statics.field746 + 1];
            if (var4.field2968 > var4.field3091 - var4.field2990) {
                var4.field2968 = var4.field3091 - var4.field2990;
            }
            if (var4.field2968 < 0) {
                var4.field2968 = 0;
            }
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2983 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2987 = field747[--Statics.field746] == 1;
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2989 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2959 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3084 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3077 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3027 = field747[--Statics.field746] == 1;
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2950 = 1;
            var4.field3002 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field746 -= 6;
            var4.field3007 = field747[Statics.field746];
            var4.field2960 = field747[Statics.field746 + 1];
            var4.field3009 = field747[Statics.field746 + 2];
            var4.field3010 = field747[Statics.field746 + 3];
            var4.field3011 = field747[Statics.field746 + 4];
            var4.field3000 = field747[Statics.field746 + 5];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field747[--Statics.field746];
            if (var4.field3005 != var5) {
                var4.field3005 = var5;
                var4.field3094 = 0;
                var4.field3090 = 0;
                client.method1893(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3015 = field747[--Statics.field746] == 1;
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field738[--Statics.field4];
            if (!var6.equals(var4.field3042)) {
                var4.field3042 = var6;
                client.method1893(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3018 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field746 -= 3;
            var4.field3022 = field747[Statics.field746];
            var4.field3023 = field747[Statics.field746 + 1];
            var4.field3021 = field747[Statics.field746 + 2];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3024 = field747[--Statics.field746] == 1;
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2997 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2998 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2945 = field747[--Statics.field746] == 1;
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2963 = field747[--Statics.field746] == 1;
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field746 -= 2;
            var4.field2981 = field747[Statics.field746];
            var4.field3091 = field747[Statics.field746 + 1];
            client.method1893(var4);
            if (var3 != -1 && var4.field2977 == 0) {
                client.method1892(Statics.field3039[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3454(var4.field2958, var4.field3031);
            client.field574 = var4;
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3006 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2984 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3103 = field747[--Statics.field746];
            client.method1893(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field747[--Statics.field746];
            class396 var8 = (class396) class291.method4326(class396.method822(), var7);
            if (var8 != null) {
                var4.field3071 = var8;
                client.method1893(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field747[--Statics.field746] == 1;
            var4.field2992 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field747[--Statics.field746] == 1;
            var4.field3016 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field746 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bu.w(ILbd;ZB)I")
    public static int method1692(int arg0, class59 arg1, boolean arg2) {
        class249 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class249.method2019(field747[--Statics.field746]);
        } else {
            var3 = arg2 ? Statics.field3660 : Statics.field750;
        }
        client.method1893(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field746 -= 2;
            int var4 = field747[Statics.field746];
            int var5 = field747[Statics.field746 + 1];
            var3.field3088 = var4;
            var3.field3089 = var5;
            class157 var6 = class157.method101(var4);
            var3.field3009 = var6.field1801;
            var3.field3010 = var6.field1822;
            var3.field3011 = var6.field1803;
            var3.field3007 = var6.field1804;
            var3.field2960 = var6.field1805;
            var3.field3000 = var6.field1800;
            if (arg0 == 1205) {
                var3.field2991 = 0;
            } else if (arg0 == 1212 | var6.field1806 == 1) {
                var3.field2991 = 1;
            } else {
                var3.field2991 = 2;
            }
            if (var3.field3013 > 0) {
                var3.field3000 = var3.field3000 * 32 / var3.field3013;
            } else if (var3.field2969 > 0) {
                var3.field3000 = var3.field3000 * 32 / var3.field2969;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2950 = 2;
            var3.field3002 = field747[--Statics.field746];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2950 = 3;
            var3.field3002 = Statics.field140.field979.method4237();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mk.f(ILbd;ZS)I")
    public static int method5712(int arg0, class59 arg1, boolean arg2) {
        boolean var3 = true;
        class249 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class249.method2019(field747[--Statics.field746]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field3660 : Statics.field750;
        }
        if (arg0 == 1300) {
            int var5 = field747[--Statics.field746] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4267(var5, field738[--Statics.field4]);
                return 1;
            } else {
                Statics.field4--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field746 -= 2;
            int var6 = field747[Statics.field746];
            int var7 = field747[Statics.field746 + 1];
            var4.field3064 = class249.method1416(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3053 = field747[--Statics.field746] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3040 = field747[--Statics.field746];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2957 = field747[--Statics.field746];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3037 = field738[--Statics.field4];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3043 = field738[--Statics.field4];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3038 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3104 = field747[--Statics.field746] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field746 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field747[Statics.field746 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field747[Statics.field746 + var10];
                        var9[var10 / 2] = (byte) field747[Statics.field746 + var10 + 1];
                    }
                }
            } else {
                Statics.field746 -= 2;
                var8 = new byte[] { (byte) field747[Statics.field746] };
                var9 = new byte[] { (byte) field747[Statics.field746 + 1] };
            }
            int var11 = field747[--Statics.field746] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method2754(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field746 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field747[Statics.field746] };
            byte[] var14 = new byte[] { (byte) field747[Statics.field746 + 1] };
            method2754(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field746 -= 3;
            int var15 = field747[Statics.field746] - 1;
            int var16 = field747[Statics.field746 + 1];
            int var17 = field747[Statics.field746 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method3228(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field747[--Statics.field746];
            int var20 = field747[--Statics.field746];
            method3228(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field746--;
            int var21 = field747[Statics.field746] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method2633(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method2633(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fh.o(Lio;I[B[BI)V")
    public static final void method2754(class249 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2988 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2988 = new byte[11][];
            arg0.field3034 = new byte[11][];
            arg0.field2994 = new int[11];
            arg0.field3036 = new int[11];
        }
        arg0.field2988[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3032 = false;
            for (int var4 = 0; var4 < arg0.field2988.length; var4++) {
                if (arg0.field2988[var4] != null) {
                    arg0.field3032 = true;
                    break;
                }
            }
        } else {
            arg0.field3032 = true;
        }
        arg0.field3034[arg1] = arg3;
    }

    @ObfuscatedName("fs.x(Lio;IIIB)V")
    public static final void method3228(class249 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2994 == null) {
            throw new RuntimeException();
        }
        arg0.field2994[arg1] = arg2;
        arg0.field3036[arg1] = arg3;
    }

    @ObfuscatedName("et.r(Lio;II)V")
    public static final void method2633(class249 arg0, int arg1) {
        if (arg0.field2988 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2967 == null) {
            arg0.field2967 = new int[arg0.field2988.length];
        }
        arg0.field2967[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("el.p(ILbd;ZI)I")
    public static int method2382(int arg0, class59 arg1, boolean arg2) {
        class249 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class249.method2019(field747[--Statics.field746]);
        } else {
            var3 = arg2 ? Statics.field3660 : Statics.field750;
        }
        String var4 = field738[--Statics.field4];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field747[--Statics.field746];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field747[--Statics.field746];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field738[--Statics.field4];
            } else {
                var7[var8] = Integer.valueOf(field747[--Statics.field746]);
            }
        }
        int var9 = field747[--Statics.field746];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3046 = var7;
        } else if (arg0 == 1401) {
            var3.field3049 = var7;
        } else if (arg0 == 1402) {
            var3.field2955 = var7;
        } else if (arg0 == 1403) {
            var3.field3050 = var7;
        } else if (arg0 == 1404) {
            var3.field3052 = var7;
        } else if (arg0 == 1405) {
            var3.field2995 = var7;
        } else if (arg0 == 1406) {
            var3.field3056 = var7;
        } else if (arg0 == 1407) {
            var3.field3057 = var7;
            var3.field3058 = var5;
        } else if (arg0 == 1408) {
            var3.field3017 = var7;
        } else if (arg0 == 1409) {
            var3.field3055 = var7;
        } else if (arg0 == 1410) {
            var3.field3081 = var7;
        } else if (arg0 == 1411) {
            var3.field3047 = var7;
        } else if (arg0 == 1412) {
            var3.field3051 = var7;
        } else if (arg0 == 1414) {
            var3.field3083 = var7;
            var3.field3060 = var5;
        } else if (arg0 == 1415) {
            var3.field2996 = var7;
            var3.field3062 = var5;
        } else if (arg0 == 1416) {
            var3.field2974 = var7;
        } else if (arg0 == 1417) {
            var3.field3065 = var7;
        } else if (arg0 == 1418) {
            var3.field3066 = var7;
        } else if (arg0 == 1419) {
            var3.field3067 = var7;
        } else if (arg0 == 1420) {
            var3.field3070 = var7;
        } else if (arg0 == 1421) {
            var3.field3059 = var7;
        } else if (arg0 == 1422) {
            var3.field3074 = var7;
        } else if (arg0 == 1423) {
            var3.field3008 = var7;
        } else if (arg0 == 1424) {
            var3.field3076 = var7;
        } else if (arg0 == 1425) {
            var3.field2982 = var7;
        } else if (arg0 == 1426) {
            var3.field3079 = var7;
        } else if (arg0 == 1427) {
            var3.field3072 = var7;
        } else if (arg0 == 1428) {
            var3.field3075 = var7;
        } else if (arg0 == 1429) {
            var3.field3073 = var7;
        } else if (arg0 == 1430) {
            var3.field3068 = var7;
        } else if (arg0 == 1431) {
            var3.field3069 = var7;
        } else {
            return 2;
        }
        var3.field3044 = true;
        return 1;
    }

    @ObfuscatedName("ce.h(ILbd;ZI)I")
    public static int method1887(int arg0, class59 arg1, boolean arg2) {
        class249 var3 = arg2 ? Statics.field3660 : Statics.field750;
        if (arg0 == 1500) {
            field747[++Statics.field746 - 1] = var3.field2971;
            return 1;
        } else if (arg0 == 1501) {
            field747[++Statics.field746 - 1] = var3.field2972;
            return 1;
        } else if (arg0 == 1502) {
            field747[++Statics.field746 - 1] = var3.field2973;
            return 1;
        } else if (arg0 == 1503) {
            field747[++Statics.field746 - 1] = var3.field2990;
            return 1;
        } else if (arg0 == 1504) {
            field747[++Statics.field746 - 1] = var3.field2978 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field747[++Statics.field746 - 1] = var3.field3001;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("w.k(ILbd;ZI)I")
    public static int method34(int arg0, class59 arg1, boolean arg2) {
        class249 var3 = arg2 ? Statics.field3660 : Statics.field750;
        if (arg0 == 1600) {
            field747[++Statics.field746 - 1] = var3.field3054;
            return 1;
        } else if (arg0 == 1601) {
            field747[++Statics.field746 - 1] = var3.field2968;
            return 1;
        } else if (arg0 == 1602) {
            field738[++Statics.field4 - 1] = var3.field3042;
            return 1;
        } else if (arg0 == 1603) {
            field747[++Statics.field746 - 1] = var3.field2981;
            return 1;
        } else if (arg0 == 1604) {
            field747[++Statics.field746 - 1] = var3.field3091;
            return 1;
        } else if (arg0 == 1605) {
            field747[++Statics.field746 - 1] = var3.field3000;
            return 1;
        } else if (arg0 == 1606) {
            field747[++Statics.field746 - 1] = var3.field3009;
            return 1;
        } else if (arg0 == 1607) {
            field747[++Statics.field746 - 1] = var3.field3011;
            return 1;
        } else if (arg0 == 1608) {
            field747[++Statics.field746 - 1] = var3.field3010;
            return 1;
        } else if (arg0 == 1609) {
            field747[++Statics.field746 - 1] = var3.field2989;
            return 1;
        } else if (arg0 == 1610) {
            field747[++Statics.field746 - 1] = var3.field3103;
            return 1;
        } else if (arg0 == 1611) {
            field747[++Statics.field746 - 1] = var3.field2983;
            return 1;
        } else if (arg0 == 1612) {
            field747[++Statics.field746 - 1] = var3.field2984;
            return 1;
        } else if (arg0 == 1613) {
            field747[++Statics.field746 - 1] = var3.field3071.method35();
            return 1;
        } else if (arg0 == 1614) {
            field747[++Statics.field746 - 1] = var3.field3016 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field746++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jw.a(ILbd;ZB)I")
    public static int method4396(int arg0, class59 arg1, boolean arg2) {
        class249 var3 = arg2 ? Statics.field3660 : Statics.field750;
        if (arg0 == 1700) {
            field747[++Statics.field746 - 1] = var3.field3088;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3088 == -1) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = var3.field3089;
            }
            return 1;
        } else if (arg0 == 1702) {
            field747[++Statics.field746 - 1] = var3.field3031;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ha.q(ILbd;ZI)I")
    public static int method3885(int arg0, class59 arg1, boolean arg2) {
        class249 var3 = arg2 ? Statics.field3660 : Statics.field750;
        if (arg0 == 1800) {
            field747[++Statics.field746 - 1] = class250.method2115(client.method4179(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field747[--Statics.field746];
            int var5 = var4 - 1;
            if (var3.field3038 == null || var5 >= var3.field3038.length || var3.field3038[var5] == null) {
                field738[++Statics.field4 - 1] = "";
            } else {
                field738[++Statics.field4 - 1] = var3.field3038[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3037 == null) {
                field738[++Statics.field4 - 1] = "";
            } else {
                field738[++Statics.field4 - 1] = var3.field3037;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hh.u(ILbd;ZI)I")
    public static int method3889(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field743 >= 10) {
                throw new RuntimeException();
            }
            class249 var10;
            if (arg0 >= 2000) {
                var10 = class249.method2019(field747[--Statics.field746]);
            } else {
                var10 = arg2 ? Statics.field3660 : Statics.field750;
            }
            if (var10.field3072 == null) {
                return 0;
            }
            class68 var11 = new class68();
            var11.field961 = var10;
            var11.field955 = var10.field3072;
            var11.field962 = field743 + 1;
            client.field611.method4706(var11);
            return 1;
        } else if (arg0 == 1928) {
            class249 var3 = arg2 ? Statics.field3660 : Statics.field750;
            int var4 = field747[--Statics.field746];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class80 var5 = new class80(var4, var3.field2958, var3.field3031, var3.field3088);
            field755.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field746 -= 3;
            int var6 = field747[Statics.field746];
            int var7 = field747[Statics.field746 + 1];
            int var8 = field747[Statics.field746 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class80 var9 = new class80(var8, var6, var7, class249.method2019(var6).field3088);
            field755.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ej.e(ILbd;ZI)I")
    public static int method2527(int arg0, class59 arg1, boolean arg2) {
        class249 var3 = class249.method2019(field747[--Statics.field746]);
        if (arg0 == 2500) {
            field747[++Statics.field746 - 1] = var3.field2971;
            return 1;
        } else if (arg0 == 2501) {
            field747[++Statics.field746 - 1] = var3.field2972;
            return 1;
        } else if (arg0 == 2502) {
            field747[++Statics.field746 - 1] = var3.field2973;
            return 1;
        } else if (arg0 == 2503) {
            field747[++Statics.field746 - 1] = var3.field2990;
            return 1;
        } else if (arg0 == 2504) {
            field747[++Statics.field746 - 1] = var3.field2978 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field747[++Statics.field746 - 1] = var3.field3001;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ji.c(ILbd;ZI)I")
    public static int method4406(int arg0, class59 arg1, boolean arg2) {
        class249 var3 = class249.method2019(field747[--Statics.field746]);
        if (arg0 == 2600) {
            field747[++Statics.field746 - 1] = var3.field3054;
            return 1;
        } else if (arg0 == 2601) {
            field747[++Statics.field746 - 1] = var3.field2968;
            return 1;
        } else if (arg0 == 2602) {
            field738[++Statics.field4 - 1] = var3.field3042;
            return 1;
        } else if (arg0 == 2603) {
            field747[++Statics.field746 - 1] = var3.field2981;
            return 1;
        } else if (arg0 == 2604) {
            field747[++Statics.field746 - 1] = var3.field3091;
            return 1;
        } else if (arg0 == 2605) {
            field747[++Statics.field746 - 1] = var3.field3000;
            return 1;
        } else if (arg0 == 2606) {
            field747[++Statics.field746 - 1] = var3.field3009;
            return 1;
        } else if (arg0 == 2607) {
            field747[++Statics.field746 - 1] = var3.field3011;
            return 1;
        } else if (arg0 == 2608) {
            field747[++Statics.field746 - 1] = var3.field3010;
            return 1;
        } else if (arg0 == 2609) {
            field747[++Statics.field746 - 1] = var3.field2989;
            return 1;
        } else if (arg0 == 2610) {
            field747[++Statics.field746 - 1] = var3.field3103;
            return 1;
        } else if (arg0 == 2611) {
            field747[++Statics.field746 - 1] = var3.field2983;
            return 1;
        } else if (arg0 == 2612) {
            field747[++Statics.field746 - 1] = var3.field2984;
            return 1;
        } else if (arg0 == 2613) {
            field747[++Statics.field746 - 1] = var3.field3071.method35();
            return 1;
        } else if (arg0 == 2614) {
            field747[++Statics.field746 - 1] = var3.field3016 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field746++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lr.i(ILbd;ZB)I")
    public static int method5306(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class249 var3 = class249.method2019(field747[--Statics.field746]);
            field747[++Statics.field746 - 1] = var3.field3088;
            return 1;
        } else if (arg0 == 2701) {
            class249 var4 = class249.method2019(field747[--Statics.field746]);
            if (var4.field3088 == -1) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = var4.field3089;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field747[--Statics.field746];
            class67 var6 = (class67) client.field569.method5756((long) var5);
            if (var6 == null) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field747[++Statics.field746 - 1] = client.field568;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mk.m(ILbd;ZI)I")
    public static int method5711(int arg0, class59 arg1, boolean arg2) {
        class249 var3 = class249.method2019(field747[--Statics.field746]);
        if (arg0 == 2800) {
            field747[++Statics.field746 - 1] = class250.method2115(client.method4179(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field747[--Statics.field746];
            int var5 = var4 - 1;
            if (var3.field3038 == null || var5 >= var3.field3038.length || var3.field3038[var5] == null) {
                field738[++Statics.field4 - 1] = "";
            } else {
                field738[++Statics.field4 - 1] = var3.field3038[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3037 == null) {
                field738[++Statics.field4 - 1] = "";
            } else {
                field738[++Statics.field4 - 1] = var3.field3037;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.b(ILbd;ZI)I")
    public static int method1788(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field738[--Statics.field4];
            class85.method2228(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field746 -= 2;
            client.method2608(Statics.field140, field747[Statics.field746], field747[Statics.field746 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field741) {
                field753 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field738[--Statics.field4];
            int var5 = 0;
            if (Statics.method4323(var4)) {
                var5 = class306.method4541(var4);
            }
            class229 var6 = class229.method2538(class227.field2650, client.field453.field1205);
            var6.field2691.method5944(var5);
            client.field453.method1987(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field738[--Statics.field4];
            class229 var8 = class229.method2538(class227.field2609, client.field453.field1205);
            var8.field2691.method5941(var7.length() + 1);
            var8.field2691.method5948(var7);
            client.field453.method1987(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field738[--Statics.field4];
            class229 var10 = class229.method2538(class227.field2638, client.field453.field1205);
            var10.field2691.method5941(var9.length() + 1);
            var10.field2691.method5948(var9);
            client.field453.method1987(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field747[--Statics.field746];
            String var12 = field738[--Statics.field4];
            client.method2133(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field746 -= 3;
            int var13 = field747[Statics.field746];
            int var14 = field747[Statics.field746 + 1];
            int var15 = field747[Statics.field746 + 2];
            class249 var16 = class249.method2019(var15);
            client.method1701(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field746 -= 2;
            int var17 = field747[Statics.field746];
            int var18 = field747[Statics.field746 + 1];
            class249 var19 = arg2 ? Statics.field3660 : Statics.field750;
            client.method1701(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field3777 = field747[--Statics.field746] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field747[++Statics.field746 - 1] = Statics.field308.field1113 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field308.field1113 = field747[--Statics.field746] == 1;
            class76.method2370();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field738[--Statics.field4];
            boolean var21 = field747[--Statics.field746] == 1;
            Statics.method2388(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field747[--Statics.field746];
            class229 var23 = class229.method2538(class227.field2647, client.field453.field1205);
            var23.field2691.method6132(var22);
            client.field453.method1987(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field747[--Statics.field746];
            Statics.field4 -= 2;
            String var25 = field738[Statics.field4];
            String var26 = field738[Statics.field4 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class229 var27 = class229.method2538(class227.field2641, client.field453.field1205);
                var27.field2691.method6132(1 + class385.method4571(var25) + class385.method4571(var26));
                var27.field2691.method5948(var26);
                var27.field2691.method5986(var24);
                var27.field2691.method5948(var25);
                client.field453.method1987(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field554 = field747[--Statics.field746] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field578 = field747[--Statics.field746] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field527 = field747[--Statics.field746] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field747[--Statics.field746] == 1) {
                client.field427 |= 0x1;
            } else {
                client.field427 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field747[--Statics.field746] == 1) {
                client.field427 |= 0x2;
            } else {
                client.field427 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field747[--Statics.field746] == 1) {
                client.field427 |= 0x4;
            } else {
                client.field427 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field747[--Statics.field746] == 1) {
                client.field427 |= 0x8;
            } else {
                client.field427 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field427 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field512 = field747[--Statics.field746] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field523 = field747[--Statics.field746] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method157(field747[--Statics.field746] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field747[++Statics.field746 - 1] = client.method783() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field746 -= 2;
            client.field487 = field747[Statics.field746];
            client.field488 = field747[Statics.field746 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field746 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 3132) {
            field747[++Statics.field746 - 1] = Statics.field971;
            field747[++Statics.field746 - 1] = Statics.field687;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field746 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field570 = 3;
            client.field484 = field747[--Statics.field746];
            return 1;
        } else if (arg0 == 3137) {
            client.field570 = 2;
            client.field484 = field747[--Statics.field746];
            return 1;
        } else if (arg0 == 3138) {
            client.field570 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field570 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field570 = 3;
            client.field484 = arg2 ? Statics.field3660.field2958 : Statics.field750.field2958;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field747[--Statics.field746] == 1;
            Statics.field308.field1117 = var28;
            class76.method2370();
            return 1;
        } else if (arg0 == 3142) {
            field747[++Statics.field746 - 1] = Statics.field308.field1117 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field747[--Statics.field746] == 1;
            client.field443 = var29;
            if (!var29) {
                Statics.field308.field1123 = "";
                class76.method2370();
            }
            return 1;
        } else if (arg0 == 3144) {
            field747[++Statics.field746 - 1] = client.field443 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field747[--Statics.field746] == 1;
            if (Statics.field308.field1114 == var30) {
                Statics.field308.field1114 = !var30;
                class76.method2370();
            }
            return 1;
        } else if (arg0 == 3147) {
            field747[++Statics.field746 - 1] = Statics.field308.field1114 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field747[++Statics.field746 - 1] = class56.field806;
            return 1;
        } else if (arg0 == 3154) {
            field747[++Statics.field746 - 1] = client.method1714();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field4--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field746 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field746--;
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field746--;
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field4--;
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field746--;
            field738[++Statics.field4 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field746--;
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field746 -= 2;
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field746 -= 2;
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field746 -= 2;
            field738[++Statics.field4 - 1] = "";
            field738[++Statics.field4 - 1] = "";
            field738[++Statics.field4 - 1] = "";
            field738[++Statics.field4 - 1] = "";
            field738[++Statics.field4 - 1] = "";
            field738[++Statics.field4 - 1] = "";
            field738[++Statics.field4 - 1] = "";
            field738[++Statics.field4 - 1] = "";
            field738[++Statics.field4 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field746--;
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 3175) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field4--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field4--;
            return 1;
        } else if (arg0 == 3181) {
            int var31 = 100 - Math.min(Math.max(field747[--Statics.field746], 0), 100);
            client.method2088((double) ((float) var31 / 200.0F + 0.5F));
            return 1;
        } else if (arg0 == 3182) {
            float var32 = ((float) Statics.field308.field1118 - 0.5F) * 200.0F;
            field747[++Statics.field746 - 1] = 100 - Math.round(var32);
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field746--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dq.z(ILbd;ZI)I")
    public static int method2241(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field746 -= 3;
            client.method2280(field747[Statics.field746], field747[Statics.field746 + 1], field747[Statics.field746 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method780(field747[--Statics.field746]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field746 -= 2;
            client.method2024(field747[Statics.field746], field747[Statics.field746 + 1]);
            return 1;
        } else if (arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            int var6 = 0;
            int var7 = field747[--Statics.field746];
            if (arg0 == 3209) {
                var6 = field747[--Statics.field746];
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
                client.method2088((double) ((float) var8 / 200.0F + 0.5F));
            } else if (var6 == 7) {
                int var9 = Math.min(Math.max(var7, 0), 100);
                client.method2290(Math.round((float) var9 * 2.55F));
            } else if (var6 == 8) {
                int var10 = Math.min(Math.max(var7, 0), 100);
                client.method2097(Math.round((float) var10 * 1.27F));
            } else if (var6 == 9) {
                int var11 = Math.min(Math.max(var7, 0), 100);
                client.method171(Math.round((float) var11 * 1.27F));
            }
            return 1;
        } else if (arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            int var3 = 0;
            int var4 = 0;
            if (arg0 == 3210) {
                var3 = field747[--Statics.field746];
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
                float var5 = ((float) Statics.field308.field1118 - 0.5F) * 200.0F;
                var4 = 100 - Math.round(var5);
            } else if (var3 == 7) {
                var4 = Math.round((float) Statics.field308.field1119 / 2.55F);
            } else if (var3 == 8) {
                var4 = Math.round((float) Statics.field308.field1121 / 1.27F);
            } else if (var3 == 9) {
                var4 = Math.round((float) Statics.field308.field1116 / 1.27F);
            }
            field747[++Statics.field746 - 1] = var4;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.d(ILbd;ZI)I")
    public static int method120(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field747[++Statics.field746 - 1] = client.field452;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field746 -= 2;
            int var3 = field747[Statics.field746];
            int var4 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = class65.method3888(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field746 -= 2;
            int var5 = field747[Statics.field746];
            int var6 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = Statics.method2063(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field746 -= 2;
            int var7 = field747[Statics.field746];
            int var8 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = class65.method4365(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class139.method2111(var9).field1523;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = client.field435[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = client.field541[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = client.field542[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field3652;
            int var14 = (Statics.field140.field1069 >> 7) + Statics.field3625;
            int var15 = (Statics.field140.field1059 >> 7) + Statics.field1134;
            field747[++Statics.field746 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field747[++Statics.field746 - 1] = client.field562 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field746 -= 2;
            int var19 = field747[Statics.field746] + 32768;
            int var20 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = class65.method3888(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field746 -= 2;
            int var21 = field747[Statics.field746] + 32768;
            int var22 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = Statics.method2063(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field746 -= 2;
            int var23 = field747[Statics.field746] + 32768;
            int var24 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = class65.method4365(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field577 >= 2) {
                field747[++Statics.field746 - 1] = client.field577;
            } else {
                field747[++Statics.field746 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field747[++Statics.field746 - 1] = client.field423;
            return 1;
        } else if (arg0 == 3318) {
            field747[++Statics.field746 - 1] = client.field405;
            return 1;
        } else if (arg0 == 3321) {
            field747[++Statics.field746 - 1] = client.field432;
            return 1;
        } else if (arg0 == 3322) {
            field747[++Statics.field746 - 1] = client.field576;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field603) {
                field747[++Statics.field746 - 1] = 1;
            } else {
                field747[++Statics.field746 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field747[++Statics.field746 - 1] = client.field406;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field746 -= 4;
            int var25 = field747[Statics.field746];
            int var26 = field747[Statics.field746 + 1];
            int var27 = field747[Statics.field746 + 2];
            int var28 = field747[Statics.field746 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field747[++Statics.field746 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field747[++Statics.field746 - 1] = client.field418;
            return 1;
        } else if (arg0 == 3327) {
            field747[++Statics.field746 - 1] = client.field419;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ih.y(ILbd;ZI)I")
    public static int method4253(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field746 -= 2;
            int var3 = field747[Statics.field746];
            int var4 = field747[Statics.field746 + 1];
            class146 var5 = class146.method2098(var3);
            if (var5.field1599 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1602; var6++) {
                if (var5.field1603[var6] == var4) {
                    field738[++Statics.field4 - 1] = var5.field1605[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field738[++Statics.field4 - 1] = var5.field1600;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field746 -= 4;
            int var7 = field747[Statics.field746];
            int var8 = field747[Statics.field746 + 1];
            int var9 = field747[Statics.field746 + 2];
            int var10 = field747[Statics.field746 + 3];
            class146 var11 = class146.method2098(var9);
            if (var11.field1596 != var7 || var11.field1599 != var8) {
                if (var8 == 115) {
                    field738[++Statics.field4 - 1] = class270.field3234;
                } else {
                    field747[++Statics.field746 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1602; var12++) {
                if (var11.field1603[var12] == var10) {
                    if (var8 == 115) {
                        field738[++Statics.field4 - 1] = var11.field1605[var12];
                    } else {
                        field747[++Statics.field746 - 1] = var11.field1606[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field738[++Statics.field4 - 1] = var11.field1600;
                } else {
                    field747[++Statics.field746 - 1] = var11.field1604;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field747[--Statics.field746];
            class146 var14 = class146.method2098(var13);
            field747[++Statics.field746 - 1] = var14.method2502();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eb.g(ILbd;ZI)I")
    public static int method2489(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class11.method2211(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class11.method4394(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class11.method2236(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jj.ae(ILbd;ZI)I")
    public static int method4601(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field80.field714 == 0) {
                field747[++Statics.field746 - 1] = -2;
            } else if (Statics.field80.field714 == 1) {
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = Statics.field80.field712.method5235();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field747[--Statics.field746];
            if (Statics.field80.method1384() && var3 >= 0 && var3 < Statics.field80.field712.method5235()) {
                class321 var4 = (class321) Statics.field80.field712.method5231(var3);
                field738[++Statics.field4 - 1] = var4.method5198();
                field738[++Statics.field4 - 1] = var4.method5199();
            } else {
                field738[++Statics.field4 - 1] = "";
                field738[++Statics.field4 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field747[--Statics.field746];
            if (Statics.field80.method1384() && var5 >= 0 && var5 < Statics.field80.field712.method5235()) {
                field747[++Statics.field746 - 1] = ((class328) Statics.field80.field712.method5231(var5)).field3865;
            } else {
                field747[++Statics.field746 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field747[--Statics.field746];
            if (Statics.field80.method1384() && var6 >= 0 && var6 < Statics.field80.field712.method5235()) {
                field747[++Statics.field746 - 1] = ((class328) Statics.field80.field712.method5231(var6)).field3866;
            } else {
                field747[++Statics.field746 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field738[--Statics.field4];
            int var8 = field747[--Statics.field746];
            class49.method5176(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field738[--Statics.field4];
            Statics.field80.method1348(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field738[--Statics.field4];
            Statics.field80.method1352(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field738[--Statics.field4];
            Statics.field80.method1406(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field738[--Statics.field4];
            Statics.field80.method1392(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field738[--Statics.field4];
            String var14 = client.method1559(var13);
            field747[++Statics.field746 - 1] = Statics.field80.method1346(new class406(var14, Statics.field761), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field972 == null) {
                field738[++Statics.field4 - 1] = "";
            } else {
                field738[++Statics.field4 - 1] = Statics.field972.field3834;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field972 == null) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = Statics.field972.method5235();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field747[--Statics.field746];
            if (Statics.field972 == null || var15 >= Statics.field972.method5235()) {
                field738[++Statics.field4 - 1] = "";
            } else {
                field738[++Statics.field4 - 1] = Statics.field972.method5231(var15).method5204().method6520();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field747[--Statics.field746];
            if (Statics.field972 == null || var16 >= Statics.field972.method5235()) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = ((class328) Statics.field972.method5231(var16)).method5297();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field747[--Statics.field746];
            if (Statics.field972 == null || var17 >= Statics.field972.method5235()) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = ((class328) Statics.field972.method5231(var17)).field3866;
            }
            return 1;
        } else if (arg0 == 3616) {
            field747[++Statics.field746 - 1] = Statics.field972 == null ? 0 : Statics.field972.field3832;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field738[--Statics.field4];
            client.method1684(var18);
            return 1;
        } else if (arg0 == 3618) {
            field747[++Statics.field746 - 1] = Statics.field972 == null ? 0 : Statics.field972.field3837;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field738[--Statics.field4];
            client.method825(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method1604();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field80.method1384()) {
                field747[++Statics.field746 - 1] = Statics.field80.field713.method5235();
            } else {
                field747[++Statics.field746 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field747[--Statics.field746];
            if (Statics.field80.method1384() && var20 >= 0 && var20 < Statics.field80.field713.method5235()) {
                class327 var21 = (class327) Statics.field80.field713.method5231(var20);
                field738[++Statics.field4 - 1] = var21.method5198();
                field738[++Statics.field4 - 1] = var21.method5199();
            } else {
                field738[++Statics.field4 - 1] = "";
                field738[++Statics.field4 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field738[--Statics.field4];
            String var23 = client.method1559(var22);
            field747[++Statics.field746 - 1] = Statics.field80.method1347(new class406(var23, Statics.field761)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field747[--Statics.field746];
            if (Statics.field972 == null || var24 >= Statics.field972.method5235() || !Statics.field972.method5231(var24).method5204().equals(Statics.field140.field980)) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field972 == null || Statics.field972.field3833 == null) {
                field738[++Statics.field4 - 1] = "";
            } else {
                field738[++Statics.field4 - 1] = Statics.field972.field3833;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field747[--Statics.field746];
            if (Statics.field972 == null || var25 >= Statics.field972.method5235() || !((class323) Statics.field972.method5231(var25)).method5177()) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field747[--Statics.field746];
            if (Statics.field972 == null || var26 >= Statics.field972.method5235() || !((class323) Statics.field972.method5231(var26)).method5182()) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field80.field712.method5279();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field747[--Statics.field746] == 1;
            Statics.field80.field712.method5270(new class390(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field747[--Statics.field746] == 1;
            Statics.field80.field712.method5270(new class391(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field747[--Statics.field746] == 1;
            Statics.field80.field712.method5270(new class93(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field747[--Statics.field746] == 1;
            Statics.field80.field712.method5270(new class89(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field747[--Statics.field746] == 1;
            Statics.field80.field712.method5270(new class92(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field747[--Statics.field746] == 1;
            Statics.field80.field712.method5270(new class97(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field747[--Statics.field746] == 1;
            Statics.field80.field712.method5270(new class91(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field747[--Statics.field746] == 1;
            Statics.field80.field712.method5270(new class90(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field747[--Statics.field746] == 1;
            Statics.field80.field712.method5270(new class94(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field747[--Statics.field746] == 1;
            Statics.field80.field712.method5270(new class95(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field80.field712.method5232();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field80.field713.method5279();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field747[--Statics.field746] == 1;
            Statics.field80.field713.method5270(new class390(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field747[--Statics.field746] == 1;
            Statics.field80.field713.method5270(new class391(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field80.field713.method5232();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field972 != null) {
                Statics.field972.method5279();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field747[--Statics.field746] == 1;
            if (Statics.field972 != null) {
                Statics.field972.method5270(new class390(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field747[--Statics.field746] == 1;
            if (Statics.field972 != null) {
                Statics.field972.method5270(new class391(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field747[--Statics.field746] == 1;
            if (Statics.field972 != null) {
                Statics.field972.method5270(new class93(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field747[--Statics.field746] == 1;
            if (Statics.field972 != null) {
                Statics.field972.method5270(new class89(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field747[--Statics.field746] == 1;
            if (Statics.field972 != null) {
                Statics.field972.method5270(new class92(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field747[--Statics.field746] == 1;
            if (Statics.field972 != null) {
                Statics.field972.method5270(new class97(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field747[--Statics.field746] == 1;
            if (Statics.field972 != null) {
                Statics.field972.method5270(new class91(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field747[--Statics.field746] == 1;
            if (Statics.field972 != null) {
                Statics.field972.method5270(new class90(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field747[--Statics.field746] == 1;
            if (Statics.field972 != null) {
                Statics.field972.method5270(new class94(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field747[--Statics.field746] == 1;
            if (Statics.field972 != null) {
                Statics.field972.method5270(new class95(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field972 != null) {
                Statics.field972.method5232();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field747[--Statics.field746] == 1;
            Statics.field80.field712.method5270(new class96(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field747[--Statics.field746] == 1;
            if (Statics.field972 != null) {
                Statics.field972.method5270(new class96(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.an(ILbd;ZI)I")
    public static int method48(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field746--;
            Statics.field4--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field746++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.am(ILbd;ZI)I")
    public static int method2095(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field355 == null) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = 1;
                Statics.field1669 = Statics.field355;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field747[--Statics.field746];
            if (client.field637[var3] == null) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = 1;
                Statics.field1669 = client.field637[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field738[++Statics.field4 - 1] = Statics.field1669.field1368;
            return 1;
        } else if (arg0 == 3803) {
            field747[++Statics.field746 - 1] = Statics.field1669.field1367 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field747[++Statics.field746 - 1] = Statics.field1669.field1360;
            return 1;
        } else if (arg0 == 3805) {
            field747[++Statics.field746 - 1] = Statics.field1669.field1369;
            return 1;
        } else if (arg0 == 3806) {
            field747[++Statics.field746 - 1] = Statics.field1669.field1370;
            return 1;
        } else if (arg0 == 3807) {
            field747[++Statics.field746 - 1] = Statics.field1669.field1384;
            return 1;
        } else if (arg0 == 3809) {
            field747[++Statics.field746 - 1] = Statics.field1669.field1372;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field747[--Statics.field746];
            field738[++Statics.field4 - 1] = Statics.field1669.field1373[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = Statics.field1669.field1374[var5];
            return 1;
        } else if (arg0 == 3812) {
            field747[++Statics.field746 - 1] = Statics.field1669.field1381;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field747[--Statics.field746];
            field738[++Statics.field4 - 1] = Statics.field1669.field1363[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field746 -= 3;
            int var7 = field747[Statics.field746];
            int var8 = field747[Statics.field746 + 1];
            int var9 = field747[Statics.field746 + 2];
            field747[++Statics.field746 - 1] = Statics.field1669.method2170(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field747[++Statics.field746 - 1] = Statics.field1669.field1379;
            return 1;
        } else if (arg0 == 3816) {
            field747[++Statics.field746 - 1] = Statics.field1669.field1380;
            return 1;
        } else if (arg0 == 3817) {
            field747[++Statics.field746 - 1] = Statics.field1669.method2152(field738[--Statics.field4]);
            return 1;
        } else if (arg0 == 3818) {
            field747[Statics.field746 - 1] = Statics.field1669.method2154()[field747[Statics.field746 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field746 -= 2;
            int var10 = field747[Statics.field746];
            int var11 = field747[Statics.field746 + 1];
            client.method364(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = Statics.field1669.field1377[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field746 -= 3;
                int var13 = field747[Statics.field746];
                boolean var14 = field747[Statics.field746 + 1] == 1;
                int var15 = field747[Statics.field746 + 2];
                client.method6238(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field747[--Statics.field746];
                field747[++Statics.field746 - 1] = Statics.field1669.field1378[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field3845 == null) {
                    field747[++Statics.field746 - 1] = 0;
                } else {
                    field747[++Statics.field746 - 1] = 1;
                    Statics.field1294 = Statics.field3845;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field747[--Statics.field746];
                if (client.field638[var17] == null) {
                    field747[++Statics.field746 - 1] = 0;
                } else {
                    field747[++Statics.field746 - 1] = 1;
                    Statics.field1294 = client.field638[var17];
                    Statics.field2674 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field738[++Statics.field4 - 1] = Statics.field1294.field1430;
                return 1;
            } else if (arg0 == 3853) {
                field747[++Statics.field746 - 1] = Statics.field1294.field1437;
                return 1;
            } else if (arg0 == 3854) {
                field747[++Statics.field746 - 1] = Statics.field1294.field1431;
                return 1;
            } else if (arg0 == 3855) {
                field747[++Statics.field746 - 1] = Statics.field1294.method2254();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field747[--Statics.field746];
                field738[++Statics.field4 - 1] = ((class106) Statics.field1294.field1436.get(var18)).field1303.method6520();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field747[--Statics.field746];
                field747[++Statics.field746 - 1] = ((class106) Statics.field1294.field1436.get(var19)).field1306;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field747[--Statics.field746];
                field747[++Statics.field746 - 1] = ((class106) Statics.field1294.field1436.get(var20)).field1302;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field747[--Statics.field746];
                client.method4183(Statics.field2674, var21);
                return 1;
            } else if (arg0 == 3860) {
                field747[++Statics.field746 - 1] = Statics.field1294.method2246(field738[--Statics.field4]);
                return 1;
            } else if (arg0 == 3861) {
                field747[Statics.field746 - 1] = Statics.field1294.method2247()[field747[Statics.field746 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field747[++Statics.field746 - 1] = Statics.field372 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("fz.al(ILbd;ZI)I")
    public static int method2846(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = client.field620[var3].method4612();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = client.field620[var4].field3654;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = client.field620[var5].field3656;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = client.field620[var6].field3653;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = client.field620[var7].field3657;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = client.field620[var8].field3659;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field747[--Statics.field746];
            int var10 = client.field620[var9].method4609();
            field747[++Statics.field746 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field747[--Statics.field746];
            int var12 = client.field620[var11].method4609();
            field747[++Statics.field746 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field747[--Statics.field746];
            int var14 = client.field620[var13].method4609();
            field747[++Statics.field746 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field747[--Statics.field746];
            int var16 = client.field620[var15].method4609();
            field747[++Statics.field746 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field747[--Statics.field746] == 1;
            if (Statics.field3711 != null) {
                Statics.field3711.method4549(class279.field3620, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field747[--Statics.field746] == 1;
            if (Statics.field3711 != null) {
                Statics.field3711.method4549(class279.field3618, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field746 -= 2;
            boolean var19 = field747[Statics.field746] == 1;
            boolean var20 = field747[Statics.field746 + 1] == 1;
            if (Statics.field3711 != null) {
                client.field518.field399 = var20;
                Statics.field3711.method4549(client.field518, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field747[--Statics.field746] == 1;
            if (Statics.field3711 != null) {
                Statics.field3711.method4549(class279.field3616, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field747[--Statics.field746] == 1;
            if (Statics.field3711 != null) {
                Statics.field3711.method4549(class279.field3619, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field747[++Statics.field746 - 1] = Statics.field3711 == null ? 0 : Statics.field3711.field3617.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field747[--Statics.field746];
            class285 var24 = (class285) Statics.field3711.field3617.get(var23);
            field747[++Statics.field746 - 1] = var24.field3648;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field747[--Statics.field746];
            class285 var26 = (class285) Statics.field3711.field3617.get(var25);
            field738[++Statics.field4 - 1] = var26.method4596();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field747[--Statics.field746];
            class285 var28 = (class285) Statics.field3711.field3617.get(var27);
            field738[++Statics.field4 - 1] = var28.method4597();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field747[--Statics.field746];
            class285 var30 = (class285) Statics.field3711.field3617.get(var29);
            long var31 = class382.method2013() - Statics.field2067 - var30.field3646;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field738[++Statics.field4 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field747[--Statics.field746];
            class285 var38 = (class285) Statics.field3711.field3617.get(var37);
            field747[++Statics.field746 - 1] = var38.field3647.field3653;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field747[--Statics.field746];
            class285 var40 = (class285) Statics.field3711.field3617.get(var39);
            field747[++Statics.field746 - 1] = var40.field3647.field3656;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field747[--Statics.field746];
            class285 var42 = (class285) Statics.field3711.field3617.get(var41);
            field747[++Statics.field746 - 1] = var42.field3647.field3654;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ix.aq(ILbd;ZB)I")
    public static int method3995(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field746 -= 2;
            int var3 = field747[Statics.field746];
            int var4 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field746 -= 2;
            int var5 = field747[Statics.field746];
            int var6 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field746 -= 2;
            int var7 = field747[Statics.field746];
            int var8 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field746 -= 2;
            int var9 = field747[Statics.field746];
            int var10 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field746 -= 5;
            int var13 = field747[Statics.field746];
            int var14 = field747[Statics.field746 + 1];
            int var15 = field747[Statics.field746 + 2];
            int var16 = field747[Statics.field746 + 3];
            int var17 = field747[Statics.field746 + 4];
            field747[++Statics.field746 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field746 -= 2;
            int var18 = field747[Statics.field746];
            int var19 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field746 -= 2;
            int var20 = field747[Statics.field746];
            int var21 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field746 -= 2;
            int var22 = field747[Statics.field746];
            int var23 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field746 -= 2;
            int var24 = field747[Statics.field746];
            int var25 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field746 -= 2;
            int var26 = field747[Statics.field746];
            int var27 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field746 -= 2;
            int var28 = field747[Statics.field746];
            int var29 = field747[Statics.field746 + 1];
            if (var28 == 0) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field746 -= 2;
            int var30 = field747[Statics.field746];
            int var31 = field747[Statics.field746 + 1];
            if (var30 == 0) {
                field747[++Statics.field746 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field747[++Statics.field746 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field747[++Statics.field746 - 1] = var30;
                    break;
                case 2:
                    field747[++Statics.field746 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field747[++Statics.field746 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field747[++Statics.field746 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field747[++Statics.field746 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field746 -= 2;
            int var32 = field747[Statics.field746];
            int var33 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field746 -= 2;
            int var34 = field747[Statics.field746];
            int var35 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field746 -= 3;
            long var36 = (long) field747[Statics.field746];
            long var38 = (long) field747[Statics.field746 + 1];
            long var40 = (long) field747[Statics.field746 + 2];
            field747[++Statics.field746 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class233.method2269(field747[--Statics.field746]);
            field747[++Statics.field746 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field746 -= 2;
            int var43 = field747[Statics.field746];
            int var44 = field747[Statics.field746 + 1];
            field747[++Statics.field746 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field746 -= 3;
            int var45 = field747[Statics.field746];
            int var46 = field747[Statics.field746 + 1];
            int var47 = field747[Statics.field746 + 2];
            field747[++Statics.field746 - 1] = class233.method1795(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field746 -= 3;
            int var48 = field747[Statics.field746];
            int var49 = field747[Statics.field746 + 1];
            int var50 = field747[Statics.field746 + 2];
            field747[++Statics.field746 - 1] = class233.method2268(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field746 -= 3;
            int var51 = field747[Statics.field746];
            int var52 = field747[Statics.field746 + 1];
            int var53 = field747[Statics.field746 + 2];
            int var54 = 31 - var53;
            field747[++Statics.field746 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field746 -= 4;
            int var55 = field747[Statics.field746];
            int var56 = field747[Statics.field746 + 1];
            int var57 = field747[Statics.field746 + 2];
            int var58 = field747[Statics.field746 + 3];
            int var59 = class233.method2268(var55, var57, var58);
            int var60 = class233.method2221(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field747[++Statics.field746 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field747[Statics.field746 - 1] = class346.method1896(field747[Statics.field746 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field747[Statics.field746 - 1] = class346.method2005(field747[Statics.field746 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field746 -= 2;
            int var61 = field747[Statics.field746];
            int var62 = field747[Statics.field746 + 1];
            int var63 = class346.method4214(var61, var62);
            field747[++Statics.field746 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field747[Statics.field746 - 1] = Math.abs(field747[Statics.field746 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dh.aa(ILbd;ZI)I")
    public static int method2224(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field738[--Statics.field4];
            int var4 = field747[--Statics.field746];
            field738[++Statics.field4 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field4 -= 2;
            String var5 = field738[Statics.field4];
            String var6 = field738[Statics.field4 + 1];
            field738[++Statics.field4 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field738[--Statics.field4];
            int var8 = field747[--Statics.field746];
            field738[++Statics.field4 - 1] = var7 + class306.method4178(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field738[--Statics.field4];
            field738[++Statics.field4 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field747[--Statics.field746];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field745.setTime(new Date(var11));
            int var13 = field745.get(5);
            int var14 = field745.get(2);
            int var15 = field745.get(1);
            field738[++Statics.field4 - 1] = var13 + "-" + field752[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field4 -= 2;
            String var16 = field738[Statics.field4];
            String var17 = field738[Statics.field4 + 1];
            if (Statics.field140.field979 != null && Statics.field140.field979.field2931) {
                field738[++Statics.field4 - 1] = var17;
            } else {
                field738[++Statics.field4 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field747[--Statics.field746];
            field738[++Statics.field4 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field4 -= 2;
            field747[++Statics.field746 - 1] = class306.method3536(class307.method2966(field738[Statics.field4], field738[Statics.field4 + 1], Statics.field3644));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field738[--Statics.field4];
            Statics.field746 -= 2;
            int var20 = field747[Statics.field746];
            int var21 = field747[Statics.field746 + 1];
            byte[] var22 = Statics.field1440.method4459(var21, 0);
            class302 var23 = new class302(var22);
            field747[++Statics.field746 - 1] = var23.method4915(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field738[--Statics.field4];
            Statics.field746 -= 2;
            int var25 = field747[Statics.field746];
            int var26 = field747[Statics.field746 + 1];
            byte[] var27 = Statics.field1440.method4459(var26, 0);
            class302 var28 = new class302(var27);
            field747[++Statics.field746 - 1] = var28.method4935(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field4 -= 2;
            String var29 = field738[Statics.field4];
            String var30 = field738[Statics.field4 + 1];
            if (field747[--Statics.field746] == 1) {
                field738[++Statics.field4 - 1] = var29;
            } else {
                field738[++Statics.field4 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field738[--Statics.field4];
            field738[++Statics.field4 - 1] = class303.method4948(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field738[--Statics.field4];
            int var33 = field747[--Statics.field746];
            field738[++Statics.field4 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class306.method4991((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class306.method4392((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class306.method2073((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class306.method4572((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field738[--Statics.field4];
            if (var38 == null) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field738[--Statics.field4];
            Statics.field746 -= 2;
            int var40 = field747[Statics.field746];
            int var41 = field747[Statics.field746 + 1];
            field738[++Statics.field4 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field738[--Statics.field4];
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
            field738[++Statics.field4 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field738[--Statics.field4];
            int var48 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field4 -= 2;
            String var49 = field738[Statics.field4];
            String var50 = field738[Statics.field4 + 1];
            int var51 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field738[--Statics.field4];
            field738[++Statics.field4 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("he.ab(ILbd;ZI)I")
    public static int method3883(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field747[--Statics.field746];
            field738[++Statics.field4 - 1] = class157.method101(var3).field1836;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field746 -= 2;
            int var4 = field747[Statics.field746];
            int var5 = field747[Statics.field746 + 1];
            class157 var6 = class157.method101(var4);
            if (var5 < 1 || var5 > 5 || var6.field1809[var5 - 1] == null) {
                field738[++Statics.field4 - 1] = "";
            } else {
                field738[++Statics.field4 - 1] = var6.field1809[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field746 -= 2;
            int var7 = field747[Statics.field746];
            int var8 = field747[Statics.field746 + 1];
            class157 var9 = class157.method101(var7);
            if (var8 < 1 || var8 > 5 || var9.field1810[var8 - 1] == null) {
                field738[++Statics.field4 - 1] = "";
            } else {
                field738[++Statics.field4 - 1] = var9.field1810[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class157.method101(var10).field1807;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class157.method101(var11).field1806 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field747[--Statics.field746];
            class157 var13 = class157.method101(var12);
            if (var13.field1789 == -1 && var13.field1827 >= 0) {
                field747[++Statics.field746 - 1] = var13.field1827;
            } else {
                field747[++Statics.field746 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field747[--Statics.field746];
            class157 var15 = class157.method101(var14);
            if (var15.field1789 >= 0 && var15.field1827 >= 0) {
                field747[++Statics.field746 - 1] = var15.field1827;
            } else {
                field747[++Statics.field746 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class157.method101(var16).field1808 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field747[--Statics.field746];
            class157 var18 = class157.method101(var17);
            if (var18.field1820 == -1 && var18.field1838 >= 0) {
                field747[++Statics.field746 - 1] = var18.field1838;
            } else {
                field747[++Statics.field746 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field747[--Statics.field746];
            class157 var20 = class157.method101(var19);
            if (var20.field1820 >= 0 && var20.field1838 >= 0) {
                field747[++Statics.field746 - 1] = var20.field1838;
            } else {
                field747[++Statics.field746 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field738[--Statics.field4];
            int var22 = field747[--Statics.field746];
            client.method3278(var21, var22 == 1);
            field747[++Statics.field746 - 1] = Statics.field2520;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1137 == null || Statics.field1165 >= Statics.field2520) {
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = Statics.field1137[++Statics.field1165 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field1165 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field747[--Statics.field746];
            int var24 = class157.method101(var23).method2744();
            if (var24 == -1) {
                field747[++Statics.field746 - 1] = var24;
            } else {
                field747[++Statics.field746 - 1] = var24 + 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dg.ax(ILbd;ZS)I")
    public static int method2276(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field747[++Statics.field746 - 1] = client.field670;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field746 -= 3;
            client.field670 = field747[Statics.field746];
            Statics.field1441 = class402.method2815(field747[Statics.field746 + 1]);
            if (Statics.field1441 == null) {
                Statics.field1441 = class402.field4299;
            }
            client.field647 = field747[Statics.field746 + 2];
            class229 var3 = class229.method2538(class227.field2653, client.field453.field1205);
            var3.field2691.method5941(client.field670);
            var3.field2691.method5941(Statics.field1441.field4301);
            var3.field2691.method5941(client.field647);
            client.field453.method1987(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field738[--Statics.field4];
            Statics.field746 -= 2;
            int var5 = field747[Statics.field746];
            int var6 = field747[Statics.field746 + 1];
            class229 var7 = class229.method2538(class227.field2601, client.field453.field1205);
            var7.field2691.method5941(class385.method4571(var4) + 2);
            var7.field2691.method5948(var4);
            var7.field2691.method5941(var5 - 1);
            var7.field2691.method5941(var6);
            client.field453.method1987(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field746 -= 2;
            int var8 = field747[Statics.field746];
            int var9 = field747[Statics.field746 + 1];
            class45 var10 = class85.method14(var8, var9);
            if (var10 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
                field738[++Statics.field4 - 1] = "";
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = var10.field378;
                field747[++Statics.field746 - 1] = var10.field389;
                field738[++Statics.field4 - 1] = var10.field380 == null ? "" : var10.field380;
                field738[++Statics.field4 - 1] = var10.field385 == null ? "" : var10.field385;
                field738[++Statics.field4 - 1] = var10.field388 == null ? "" : var10.field388;
                field747[++Statics.field746 - 1] = var10.method813() ? 1 : (var10.method806() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field747[--Statics.field746];
            class45 var12 = class85.method2308(var11);
            if (var12 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
                field738[++Statics.field4 - 1] = "";
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = var12.field379;
                field747[++Statics.field746 - 1] = var12.field389;
                field738[++Statics.field4 - 1] = var12.field380 == null ? "" : var12.field380;
                field738[++Statics.field4 - 1] = var12.field385 == null ? "" : var12.field385;
                field738[++Statics.field4 - 1] = var12.field388 == null ? "" : var12.field388;
                field747[++Statics.field746 - 1] = var12.method813() ? 1 : (var12.method806() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1441 == null) {
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = Statics.field1441.field4301;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field738[--Statics.field4];
            int var14 = field747[--Statics.field746];
            class229 var15 = class407.method2116(var14, var13, Statics.field3644, -1);
            client.field453.method1987(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field4 -= 2;
            String var16 = field738[Statics.field4];
            String var17 = field738[Statics.field4 + 1];
            class229 var18 = class229.method2538(class227.field2624, client.field453.field1205);
            var18.field2691.method6132(0);
            int var19 = var18.field2691.field4182;
            var18.field2691.method5948(var16);
            class252.method4188(var18.field2691, var17);
            var18.field2691.method6044(var18.field2691.field4182 - var19);
            client.field453.method1987(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field738[--Statics.field4];
            Statics.field746 -= 2;
            int var21 = field747[Statics.field746];
            int var22 = field747[Statics.field746 + 1];
            class229 var23 = class407.method2116(var21, var20, Statics.field3644, var22);
            client.field453.method1987(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field140 == null || Statics.field140.field980 == null) {
                var24 = "";
            } else {
                var24 = Statics.field140.field980.method6520();
            }
            field738[++Statics.field4 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field747[++Statics.field746 - 1] = client.field647;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class85.method773(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class85.method4252(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = class85.method4189(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field738[--Statics.field4];
            client.method2237(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field630 = field738[--Statics.field4].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field738[++Statics.field4 - 1] = client.field630;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field738[--Statics.field4];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field746++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field746 -= 2;
            int var30 = field747[Statics.field746];
            int var31 = field747[Statics.field746 + 1];
            class45 var32 = class85.method14(var30, var31);
            if (var32 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
                field738[++Statics.field4 - 1] = "";
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = var32.field378;
                field747[++Statics.field746 - 1] = var32.field389;
                field738[++Statics.field4 - 1] = var32.field380 == null ? "" : var32.field380;
                field738[++Statics.field4 - 1] = var32.field385 == null ? "" : var32.field385;
                field738[++Statics.field4 - 1] = var32.field388 == null ? "" : var32.field388;
                field747[++Statics.field746 - 1] = var32.method813() ? 1 : (var32.method806() ? 2 : 0);
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field747[--Statics.field746];
            class45 var34 = class85.method2308(var33);
            if (var34 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
                field738[++Statics.field4 - 1] = "";
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = var34.field379;
                field747[++Statics.field746 - 1] = var34.field389;
                field738[++Statics.field4 - 1] = var34.field380 == null ? "" : var34.field380;
                field738[++Statics.field4 - 1] = var34.field385 == null ? "" : var34.field385;
                field738[++Statics.field4 - 1] = var34.field388 == null ? "" : var34.field388;
                field747[++Statics.field746 - 1] = var34.method813() ? 1 : (var34.method806() ? 2 : 0);
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ag.au(ILbd;ZI)I")
    public static int method1315(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field747[++Statics.field746 - 1] = client.method4156();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field747[--Statics.field746];
            if (var3 == 1 || var3 == 2) {
                client.method2909(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field747[++Statics.field746 - 1] = Statics.field308.field1122;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field747[--Statics.field746];
            if (var4 == 1 || var4 == 2) {
                Statics.field308.field1122 = var4;
                class76.method2370();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 5311) {
            Statics.field746 -= 2;
            return 1;
        } else if (arg0 == 5312) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field4 -= 2;
            Statics.field746--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field4--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bk.as(ILbd;ZI)I")
    public static int method1567(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field571 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field4 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field747[++Statics.field746 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ju.ao(II)I")
    public static int method4585(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ej.az(II)I")
    public static int method2533(int arg0) {
        return (int) ((Math.log((double) arg0) / field757 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("fh.ak(ILbd;ZI)I")
    public static int method2776(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field746 -= 2;
            client.field661 = (short) method4585(field747[Statics.field746]);
            if (client.field661 <= 0) {
                client.field661 = 256;
            }
            client.field632 = (short) method4585(field747[Statics.field746 + 1]);
            if (client.field632 <= 0) {
                client.field632 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field746 -= 2;
            client.field663 = (short) field747[Statics.field746];
            if (client.field663 <= 0) {
                client.field663 = 256;
            }
            client.field449 = (short) field747[Statics.field746 + 1];
            if (client.field449 <= 0) {
                client.field449 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field746 -= 4;
            client.field473 = (short) field747[Statics.field746];
            if (client.field473 <= 0) {
                client.field473 = 1;
            }
            client.field543 = (short) field747[Statics.field746 + 1];
            if (client.field543 <= 0) {
                client.field543 = 32767;
            } else if (client.field543 < client.field473) {
                client.field543 = client.field473;
            }
            client.field667 = (short) field747[Statics.field746 + 2];
            if (client.field667 <= 0) {
                client.field667 = 1;
            }
            client.field668 = (short) field747[Statics.field746 + 3];
            if (client.field668 <= 0) {
                client.field668 = 32767;
            } else if (client.field668 < client.field667) {
                client.field668 = client.field667;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field580 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = -1;
            } else {
                client.method1547(0, 0, client.field580.field2973, client.field580.field2990, false);
                field747[++Statics.field746 - 1] = client.field671;
                field747[++Statics.field746 - 1] = client.field672;
            }
            return 1;
        } else if (arg0 == 6204) {
            field747[++Statics.field746 - 1] = client.field663;
            field747[++Statics.field746 - 1] = client.field449;
            return 1;
        } else if (arg0 == 6205) {
            field747[++Statics.field746 - 1] = method2533(client.field661);
            field747[++Statics.field746 - 1] = method2533(client.field632);
            return 1;
        } else if (arg0 == 6220) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field747[++Statics.field746 - 1] = Statics.field971;
            return 1;
        } else if (arg0 == 6223) {
            field747[++Statics.field746 - 1] = Statics.field687;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ag.aj(ILbd;ZB)I")
    public static int method1331(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field747[++Statics.field746 - 1] = class48.method4398() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class48 var3 = class48.method3302();
            if (var3 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
            } else {
                field747[++Statics.field746 - 1] = var3.field697;
                field747[++Statics.field746 - 1] = var3.field700;
                field738[++Statics.field4 - 1] = var3.field690;
                field747[++Statics.field746 - 1] = var3.field702;
                field747[++Statics.field746 - 1] = var3.field699;
                field738[++Statics.field4 - 1] = var3.field701;
            }
            return 1;
        } else if (arg0 == 6502) {
            class48 var4 = class48.method2147();
            if (var4 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
            } else {
                field747[++Statics.field746 - 1] = var4.field697;
                field747[++Statics.field746 - 1] = var4.field700;
                field738[++Statics.field4 - 1] = var4.field690;
                field747[++Statics.field746 - 1] = var4.field702;
                field747[++Statics.field746 - 1] = var4.field699;
                field738[++Statics.field4 - 1] = var4.field701;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field747[--Statics.field746];
            class48 var6 = null;
            for (int var7 = 0; var7 < class48.field692; var7++) {
                if (Statics.field86[var7].field697 == var5) {
                    var6 = Statics.field86[var7];
                    break;
                }
            }
            if (var6 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
            } else {
                field747[++Statics.field746 - 1] = var6.field697;
                field747[++Statics.field746 - 1] = var6.field700;
                field738[++Statics.field4 - 1] = var6.field690;
                field747[++Statics.field746 - 1] = var6.field702;
                field747[++Statics.field746 - 1] = var6.field699;
                field738[++Statics.field4 - 1] = var6.field701;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field746 -= 4;
            int var8 = field747[Statics.field746];
            boolean var9 = field747[Statics.field746 + 1] == 1;
            int var10 = field747[Statics.field746 + 2];
            boolean var11 = field747[Statics.field746 + 3] == 1;
            class48.method5197(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field747[--Statics.field746];
            if (var12 >= 0 && var12 < class48.field692) {
                class48 var13 = Statics.field86[var12];
                field747[++Statics.field746 - 1] = var13.field697;
                field747[++Statics.field746 - 1] = var13.field700;
                field738[++Statics.field4 - 1] = var13.field690;
                field747[++Statics.field746 - 1] = var13.field702;
                field747[++Statics.field746 - 1] = var13.field699;
                field738[++Statics.field4 - 1] = var13.field701;
            } else {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
                field747[++Statics.field746 - 1] = 0;
                field747[++Statics.field746 - 1] = 0;
                field738[++Statics.field4 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field408 = field747[--Statics.field746] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field746 -= 2;
            int var14 = field747[Statics.field746];
            int var15 = field747[Statics.field746 + 1];
            class153 var16 = class153.method5938(var15);
            if (var16.method2591()) {
                field738[++Statics.field4 - 1] = class148.method2089(var14).method2517(var15, var16.field1701);
            } else {
                field747[++Statics.field746 - 1] = class148.method2089(var14).method2518(var15, var16.field1696);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field746 -= 2;
            int var17 = field747[Statics.field746];
            int var18 = field747[Statics.field746 + 1];
            class153 var19 = class153.method5938(var18);
            if (var19.method2591()) {
                field738[++Statics.field4 - 1] = class156.method2267(var17).method2682(var18, var19.field1701);
            } else {
                field747[++Statics.field746 - 1] = class156.method2267(var17).method2716(var18, var19.field1696);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field746 -= 2;
            int var20 = field747[Statics.field746];
            int var21 = field747[Statics.field746 + 1];
            class153 var22 = class153.method5938(var21);
            if (var22.method2591()) {
                field738[++Statics.field4 - 1] = class157.method101(var20).method2743(var21, var22.field1701);
            } else {
                field747[++Statics.field746 - 1] = class157.method101(var20).method2784(var21, var22.field1696);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field746 -= 2;
            int var23 = field747[Statics.field746];
            int var24 = field747[Statics.field746 + 1];
            class153 var25 = class153.method5938(var24);
            if (var25.method2591()) {
                field738[++Statics.field4 - 1] = class154.method2113(var23).method2616(var24, var25.field1701);
            } else {
                field747[++Statics.field746 - 1] = class154.method2113(var23).method2615(var24, var25.field1696);
            }
            return 1;
        } else if (arg0 == 6518) {
            field747[++Statics.field746 - 1] = client.field412 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field747[++Statics.field746 - 1] = client.field410 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field4--;
            Statics.field746--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field4--;
            Statics.field746--;
            return 1;
        } else if (arg0 == 6524) {
            field747[++Statics.field746 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field747[++Statics.field746 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field747[++Statics.field746 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field747[++Statics.field746 - 1] = client.field474;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fv.at(ILbd;ZB)I")
    public static int method2955(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field3652;
            int var4 = (Statics.field140.field1069 >> 7) + Statics.field3625;
            int var5 = (Statics.field140.field1059 >> 7) + Statics.field1134;
            client.method3288().method5498(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field747[--Statics.field746];
            String var7 = "";
            class168 var8 = client.method3288().method5521(var6);
            if (var8 != null) {
                var7 = var8.method2980();
            }
            field738[++Statics.field4 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field747[--Statics.field746];
            client.method3288().method5504(var9);
            return 1;
        } else if (arg0 == 6603) {
            field747[++Statics.field746 - 1] = client.method3288().method5518();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field747[--Statics.field746];
            client.method3288().method5622(var10);
            return 1;
        } else if (arg0 == 6605) {
            field747[++Statics.field746 - 1] = client.method3288().method5520() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class245 var11 = new class245(field747[--Statics.field746]);
            client.method3288().method5522(var11.field2920, var11.field2922);
            return 1;
        } else if (arg0 == 6607) {
            class245 var12 = new class245(field747[--Statics.field746]);
            client.method3288().method5523(var12.field2920, var12.field2922);
            return 1;
        } else if (arg0 == 6608) {
            class245 var13 = new class245(field747[--Statics.field746]);
            client.method3288().method5524(var13.field2921, var13.field2920, var13.field2922);
            return 1;
        } else if (arg0 == 6609) {
            class245 var14 = new class245(field747[--Statics.field746]);
            client.method3288().method5550(var14.field2921, var14.field2920, var14.field2922);
            return 1;
        } else if (arg0 == 6610) {
            field747[++Statics.field746 - 1] = client.method3288().method5526();
            field747[++Statics.field746 - 1] = client.method3288().method5571();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field747[--Statics.field746];
            class168 var16 = client.method3288().method5521(var15);
            if (var16 == null) {
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = var16.method2990().method4200();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field747[--Statics.field746];
            class168 var18 = client.method3288().method5521(var17);
            if (var18 == null) {
                field747[++Statics.field746 - 1] = 0;
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = (var18.method2984() - var18.method3029() + 1) * 64;
                field747[++Statics.field746 - 1] = (var18.method2986() - var18.method2985() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field747[--Statics.field746];
            class168 var20 = client.method3288().method5521(var19);
            if (var20 == null) {
                field747[++Statics.field746 - 1] = 0;
                field747[++Statics.field746 - 1] = 0;
                field747[++Statics.field746 - 1] = 0;
                field747[++Statics.field746 - 1] = 0;
            } else {
                field747[++Statics.field746 - 1] = var20.method3029() * 64;
                field747[++Statics.field746 - 1] = var20.method2985() * 64;
                field747[++Statics.field746 - 1] = var20.method2984() * 64 + 64 - 1;
                field747[++Statics.field746 - 1] = var20.method2986() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field747[--Statics.field746];
            class168 var22 = client.method3288().method5521(var21);
            if (var22 == null) {
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = var22.method3005();
            }
            return 1;
        } else if (arg0 == 6615) {
            class245 var23 = client.method3288().method5528();
            if (var23 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = var23.field2920;
                field747[++Statics.field746 - 1] = var23.field2922;
            }
            return 1;
        } else if (arg0 == 6616) {
            field747[++Statics.field746 - 1] = client.method3288().method5505();
            return 1;
        } else if (arg0 == 6617) {
            class245 var24 = new class245(field747[--Statics.field746]);
            class168 var25 = client.method3288().method5561();
            if (var25 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method3008(var24.field2921, var24.field2920, var24.field2922);
            if (var26 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = var26[0];
                field747[++Statics.field746 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class245 var27 = new class245(field747[--Statics.field746]);
            class168 var28 = client.method3288().method5561();
            if (var28 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = -1;
                return 1;
            }
            class245 var29 = var28.method2975(var27.field2920, var27.field2922);
            if (var29 == null) {
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = var29.method4200();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field746 -= 2;
            int var30 = field747[Statics.field746];
            class245 var31 = new class245(field747[Statics.field746 + 1]);
            Statics.method3453(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field746 -= 2;
            int var32 = field747[Statics.field746];
            class245 var33 = new class245(field747[Statics.field746 + 1]);
            Statics.method3453(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field746 -= 2;
            int var34 = field747[Statics.field746];
            class245 var35 = new class245(field747[Statics.field746 + 1]);
            class168 var36 = client.method3288().method5521(var34);
            if (var36 == null) {
                field747[++Statics.field746 - 1] = 0;
                return 1;
            } else {
                field747[++Statics.field746 - 1] = var36.method2972(var35.field2921, var35.field2920, var35.field2922) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field747[++Statics.field746 - 1] = client.method3288().method5529();
            field747[++Statics.field746 - 1] = client.method3288().method5530();
            return 1;
        } else if (arg0 == 6623) {
            class245 var37 = new class245(field747[--Statics.field746]);
            class168 var38 = client.method3288().method5502(var37.field2921, var37.field2920, var37.field2922);
            if (var38 == null) {
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = var38.method2977();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method3288().method5531(field747[--Statics.field746]);
            return 1;
        } else if (arg0 == 6625) {
            client.method3288().method5579();
            return 1;
        } else if (arg0 == 6626) {
            client.method3288().method5532(field747[--Statics.field746]);
            return 1;
        } else if (arg0 == 6627) {
            client.method3288().method5533();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field747[--Statics.field746] == 1;
            client.method3288().method5534(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field747[--Statics.field746];
            client.method3288().method5535(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field747[--Statics.field746];
            client.method3288().method5536(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method3288().method5681();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field747[--Statics.field746] == 1;
            client.method3288().method5538(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field746 -= 2;
            int var43 = field747[Statics.field746];
            boolean var44 = field747[Statics.field746 + 1] == 1;
            client.method3288().method5651(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field746 -= 2;
            int var45 = field747[Statics.field746];
            boolean var46 = field747[Statics.field746 + 1] == 1;
            client.method3288().method5540(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field747[++Statics.field746 - 1] = client.method3288().method5516() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = client.method3288().method5542(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field747[--Statics.field746];
            field747[++Statics.field746 - 1] = client.method3288().method5618(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field746 -= 2;
            int var49 = field747[Statics.field746];
            class245 var50 = new class245(field747[Statics.field746 + 1]);
            class245 var51 = client.method3288().method5546(var49, var50);
            if (var51 == null) {
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = var51.method4200();
            }
            return 1;
        } else if (arg0 == 6639) {
            class186 var52 = client.method3288().method5629();
            if (var52 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = var52.method2921();
                field747[++Statics.field746 - 1] = var52.field2110.method4200();
            }
            return 1;
        } else if (arg0 == 6640) {
            class186 var53 = client.method3288().method5549();
            if (var53 == null) {
                field747[++Statics.field746 - 1] = -1;
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = var53.method2921();
                field747[++Statics.field746 - 1] = var53.field2110.method4200();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field747[--Statics.field746];
            class141 var55 = class141.method1794(var54);
            if (var55.field1537 == null) {
                field738[++Statics.field4 - 1] = "";
            } else {
                field738[++Statics.field4 - 1] = var55.field1537;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field747[--Statics.field746];
            class141 var57 = class141.method1794(var56);
            field747[++Statics.field746 - 1] = var57.field1539;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field747[--Statics.field746];
            class141 var59 = class141.method1794(var58);
            if (var59 == null) {
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = var59.field1553;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field747[--Statics.field746];
            class141 var61 = class141.method1794(var60);
            if (var61 == null) {
                field747[++Statics.field746 - 1] = -1;
            } else {
                field747[++Statics.field746 - 1] = var61.field1535;
            }
            return 1;
        } else if (arg0 == 6697) {
            field747[++Statics.field746 - 1] = Statics.field3879.field2136;
            return 1;
        } else if (arg0 == 6698) {
            field747[++Statics.field746 - 1] = Statics.field3879.field2133.method4200();
            return 1;
        } else if (arg0 == 6699) {
            field747[++Statics.field746 - 1] = Statics.field3879.field2134.method4200();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dx.af(ILbd;ZS)I")
    public static int method2145(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field746 -= 2;
            Statics.field4--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 6750) {
            field738[++Statics.field4 - 1] = "";
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            field747[++Statics.field746 - 1] = -1;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field747[--Statics.field746];
            class148 var4 = class148.method2089(var3);
            field738[++Statics.field4 - 1] = var4 == null ? "" : var4.field1620;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lq.ar(ILbd;ZI)I")
    public static int method5372(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 6800) {
            field738[++Statics.field4 - 1] = "";
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            field747[++Statics.field746 - 1] = -1;
            return 1;
        } else if (arg0 == 6850) {
            field738[++Statics.field4 - 1] = "";
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            field747[++Statics.field746 - 1] = -1;
            return 1;
        } else if (arg0 == 6853) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.ay(ILbd;ZI)I")
    public static int method1718(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 6900) {
            field738[++Statics.field4 - 1] = "";
            return 1;
        } else if (arg0 == 6950) {
            field747[++Statics.field746 - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ef.ap(ILbd;ZI)I")
    public static int method2326(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field746 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field746 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field746 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field746 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field4--;
            Statics.field746--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field4--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field746 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field746--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fo.ah(ILbd;ZI)I")
    public static int method3260(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field746++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field4 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field746++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field746++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field746++;
            return 1;
        } else if (arg0 == 7108) {
            field747[++Statics.field746 - 1] = client.method4690() ? 1 : 0;
            return 1;
        } else if (arg0 == 7110) {
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 7120) {
            Statics.field746--;
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else if (arg0 == 7121) {
            Statics.field746 -= 2;
            field747[++Statics.field746 - 1] = -1;
            return 1;
        } else if (arg0 == 7122) {
            Statics.field746 -= 2;
            field747[++Statics.field746 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fj.ag(ILbd;ZB)I")
    public static int method2906(int arg0, class59 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field746 -= 5;
            field747[++Statics.field746 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field746 -= 6;
            field747[++Statics.field746 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field747[Statics.field746 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field746 -= 2;
            field747[++Statics.field746 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field746--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field746 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("da.ai(IB)V")
    public static void method2146(int arg0) {
        if (arg0 == -1 || !class249.method4333(arg0)) {
            return;
        }
        class249[] var1 = Statics.field3039[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class249 var3 = var1[var2];
            if (var3.field3045 != null) {
                class68 var4 = new class68();
                var4.field961 = var3;
                var4.field955 = var3.field3045;
                method1868(var4, 5000000, 0);
            }
        }
    }
}
