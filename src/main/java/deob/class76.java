package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("by")
public class class76 {

    @ObfuscatedName("by.b")
    public static int[] field1052 = new int[5];

    @ObfuscatedName("by.a")
    public static int[][] field1055 = new int[5][5000];

    @ObfuscatedName("by.c")
    public static int[] field1053 = new int[1000];

    @ObfuscatedName("by.j")
    public static String[] field1054 = new String[1000];

    @ObfuscatedName("by.t")
    public static int field1064 = 0;

    @ObfuscatedName("by.f")
    public static class57[] field1056 = new class57[50];

    @ObfuscatedName("by.v")
    public static Calendar field1062 = Calendar.getInstance();

    @ObfuscatedName("by.r")
    public static final String[] field1057 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("by.y")
    public static boolean field1059 = false;

    @ObfuscatedName("by.p")
    public static boolean field1060 = false;

    @ObfuscatedName("by.k")
    public static int field1050 = 0;

    @ObfuscatedName("by.e")
    public static final double field1051 = Math.log(2.0D);

    public class76() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.n(Lbh;B)V")
    public static void method990(class63 arg0) {
        method1046(arg0, 500000);
    }

    @ObfuscatedName("bh.h(Lbh;II)V")
    public static void method1046(class63 arg0, int arg1) {
        Object[] var2 = arg0.field560;
        class92 var4;
        if (class303.method5175(arg0.field563)) {
            Statics.field2057 = (class42) var2[0];
            class262 var3 = class262.method106(Statics.field2057.field350);
            var4 = class92.method1134(arg0.field563, var3.field3312, var3.field3329);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class92.method4616(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field14 = 0;
        Statics.field3838 = 0;
        int var6 = -1;
        int[] var7 = var4.field1243;
        int[] var8 = var4.field1244;
        byte var9 = -1;
        field1064 = 0;
        field1059 = false;
        try {
            Statics.field34 = new int[var4.field1242];
            int var10 = 0;
            Statics.field403 = new String[var4.field1251];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field568;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field565;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field559 == null ? -1 : arg0.field559.field2699;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field562;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field559 == null ? -1 : arg0.field559.field2674;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field564 == null ? -1 : arg0.field564.field2699;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field564 == null ? -1 : arg0.field564.field2674;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field561;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field566;
                    }
                    Statics.field34[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field557;
                    }
                    Statics.field403[var11++] = var14;
                }
            }
            int var15 = 0;
            field1050 = arg0.field567;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1244[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method647(var53, var4, var43);
                    switch(var44) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var53 == 0) {
                    field1053[++Statics.field14 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1053[++Statics.field14 - 1] = class233.field2632[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class233.field2632[var17] = field1053[--Statics.field14];
                    client.method2266(var17);
                } else if (var53 == 3) {
                    field1054[++Statics.field3838 - 1] = var4.field1245[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field14 -= 2;
                    if (field1053[Statics.field14] != field1053[Statics.field14 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field14 -= 2;
                    if (field1053[Statics.field14] == field1053[Statics.field14 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field14 -= 2;
                    if (field1053[Statics.field14] < field1053[Statics.field14 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field14 -= 2;
                    if (field1053[Statics.field14] > field1053[Statics.field14 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1064 == 0) {
                        return;
                    }
                    class57 var18 = field1056[--field1064];
                    var4 = var18.field513;
                    var7 = var4.field1243;
                    var8 = var4.field1244;
                    var6 = var18.field514;
                    Statics.field34 = var18.field515;
                    Statics.field403 = var18.field516;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1053[++Statics.field14 - 1] = class233.method4441(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class233.method1952(var20, field1053[--Statics.field14]);
                } else if (var53 == 31) {
                    Statics.field14 -= 2;
                    if (field1053[Statics.field14] <= field1053[Statics.field14 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field14 -= 2;
                    if (field1053[Statics.field14] >= field1053[Statics.field14 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1053[++Statics.field14 - 1] = Statics.field34[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field34[var8[var6]] = field1053[--Statics.field14];
                } else if (var53 == 35) {
                    field1054[++Statics.field3838 - 1] = Statics.field403[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field403[var8[var6]] = field1054[--Statics.field3838];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field3838 -= var21;
                    String var22 = class311.method4431(field1054, Statics.field3838, var21);
                    field1054[++Statics.field3838 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field14--;
                } else if (var53 == 39) {
                    Statics.field3838--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class92 var24 = class92.method4616(var23);
                    int[] var25 = new int[var24.field1242];
                    String[] var26 = new String[var24.field1251];
                    for (int var27 = 0; var27 < var24.field1247; var27++) {
                        var25[var27] = field1053[Statics.field14 - var24.field1247 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1249; var28++) {
                        var26[var28] = field1054[Statics.field3838 - var24.field1249 + var28];
                    }
                    Statics.field14 -= var24.field1247;
                    Statics.field3838 -= var24.field1249;
                    class57 var29 = new class57();
                    var29.field513 = var4;
                    var29.field514 = var6;
                    var29.field515 = Statics.field34;
                    var29.field516 = Statics.field403;
                    field1056[++field1064 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1243;
                    var8 = var24.field1244;
                    var6 = -1;
                    Statics.field34 = var25;
                    Statics.field403 = var26;
                } else if (var53 == 42) {
                    field1053[++Statics.field14 - 1] = Statics.field1514.method1966(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field1514.method1994(var8[var6], field1053[--Statics.field14]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1053[--Statics.field14];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1052[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1055[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1053[--Statics.field14];
                    if (var36 < 0 || var36 >= field1052[var35]) {
                        throw new RuntimeException();
                    }
                    field1053[++Statics.field14 - 1] = field1055[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field14 -= 2;
                    int var38 = field1053[Statics.field14];
                    if (var38 < 0 || var38 >= field1052[var37]) {
                        throw new RuntimeException();
                    }
                    field1055[var37][var38] = field1053[Statics.field14 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field1514.method1970(var8[var6]);
                    if (var39 == null) {
                        var39 = class245.field2894;
                    }
                    field1054[++Statics.field3838 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field1514.method1969(var8[var6], field1054[--Statics.field3838]);
                } else if (var53 == 49) {
                    String var40 = Statics.field1514.method1968(var8[var6]);
                    field1054[++Statics.field3838 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field1514.method1978(var8[var6], field1054[--Statics.field3838]);
                } else if (var53 == 60) {
                    class205 var41 = var4.field1250[var8[var6]];
                    class219 var42 = (class219) var41.method3870((long) field1053[--Statics.field14]);
                    if (var42 != null) {
                        var6 += var42.field2517;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2502).append(" ");
            for (int var47 = field1064 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1056[var47].field513.field2502).append(" ");
            }
            var46.append("").append(var9);
            class160.method943(var46.toString(), var51);
        } finally {
            if (field1059) {
                field1060 = true;
                client.method147();
                field1060 = false;
                field1059 = false;
            }
        }
    }

    @ObfuscatedName("ae.l(ILcn;ZS)I")
    public static int method647(int arg0, class92 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method988(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method488(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method135(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method705(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method183(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method987(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method1027(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method3080(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method583(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method1853(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method734(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method488(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method135(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method705(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method183(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method987(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method1572(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method2668(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method481(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method1837(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method734(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method1591(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method998(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method688(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method252(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method1717(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return Statics.method1864(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method3149(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method1034(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method4370(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method363(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return Statics.method5076(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method4433(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method36(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method2031(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return Statics.method1036(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method2774(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.g(ILcn;ZI)I")
    public static int method988(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field14 -= 3;
            int var3 = field1053[Statics.field14];
            int var4 = field1053[Statics.field14 + 1];
            int var5 = field1053[Statics.field14 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class238 var6 = class238.method2289(var3);
            if (var6.field2810 == null) {
                var6.field2810 = new class238[var5 + 1];
            }
            if (var6.field2810.length <= var5) {
                class238[] var7 = new class238[var5 + 1];
                for (int var8 = 0; var8 < var6.field2810.length; var8++) {
                    var7[var8] = var6.field2810[var8];
                }
                var6.field2810 = var7;
            }
            if (var5 > 0 && var6.field2810[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class238 var9 = new class238();
            var9.field2675 = var4;
            var9.field2812 = var9.field2699 = var6.field2699;
            var9.field2674 = var5;
            var9.field2672 = true;
            var6.field2810[var5] = var9;
            if (arg2) {
                Statics.field1518 = var9;
            } else {
                Statics.field275 = var9;
            }
            client.method649(var6);
            return 1;
        } else if (arg0 == 101) {
            class238 var10 = arg2 ? Statics.field1518 : Statics.field275;
            class238 var11 = class238.method2289(var10.field2699);
            var11.field2810[var10.field2674] = null;
            client.method649(var11);
            return 1;
        } else if (arg0 == 102) {
            class238 var12 = class238.method2289(field1053[--Statics.field14]);
            var12.field2810 = null;
            client.method649(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field14 -= 2;
            int var13 = field1053[Statics.field14];
            int var14 = field1053[Statics.field14 + 1];
            class238 var15 = class238.method4106(var13, var14);
            if (var15 == null || var14 == -1) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = 1;
                if (arg2) {
                    Statics.field1518 = var15;
                } else {
                    Statics.field275 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class238 var16 = class238.method2289(field1053[--Statics.field14]);
            if (var16 == null) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = 1;
                if (arg2) {
                    Statics.field1518 = var16;
                } else {
                    Statics.field275 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.b(ILcn;ZI)I")
    public static int method488(int arg0, class92 arg1, boolean arg2) {
        int var3 = -1;
        class238 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1053[--Statics.field14];
            var4 = class238.method2289(var3);
        } else {
            var4 = arg2 ? Statics.field1518 : Statics.field275;
        }
        if (arg0 == 1000) {
            Statics.field14 -= 4;
            var4.field2710 = field1053[Statics.field14];
            var4.field2668 = field1053[Statics.field14 + 1];
            var4.field2678 = field1053[Statics.field14 + 2];
            var4.field2682 = field1053[Statics.field14 + 3];
            client.method649(var4);
            Statics.field3685.method1165(var4);
            if (var3 != -1 && var4.field2675 == 0) {
                client.method5028(Statics.field2357[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field14 -= 4;
            var4.field2789 = field1053[Statics.field14];
            var4.field2716 = field1053[Statics.field14 + 1];
            var4.field2680 = field1053[Statics.field14 + 2];
            var4.field2681 = field1053[Statics.field14 + 3];
            client.method649(var4);
            Statics.field3685.method1165(var4);
            if (var3 != -1 && var4.field2675 == 0) {
                client.method5028(Statics.field2357[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1053[--Statics.field14] == 1;
            if (var4.field2693 != var5) {
                var4.field2693 = var5;
                client.method649(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2814 = field1053[--Statics.field14] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2815 = field1053[--Statics.field14] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.a(ILcn;ZB)I")
    public static int method135(int arg0, class92 arg1, boolean arg2) {
        int var3 = -1;
        class238 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1053[--Statics.field14];
            var4 = class238.method2289(var3);
        } else {
            var4 = arg2 ? Statics.field1518 : Statics.field275;
        }
        if (arg0 == 1100) {
            Statics.field14 -= 2;
            var4.field2694 = field1053[Statics.field14];
            if (var4.field2694 > var4.field2696 - var4.field2692) {
                var4.field2694 = var4.field2696 - var4.field2692;
            }
            if (var4.field2694 < 0) {
                var4.field2694 = 0;
            }
            var4.field2695 = field1053[Statics.field14 + 1];
            if (var4.field2695 > var4.field2735 - var4.field2807) {
                var4.field2695 = var4.field2735 - var4.field2807;
            }
            if (var4.field2695 < 0) {
                var4.field2695 = 0;
            }
            client.method649(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2698 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2702 = field1053[--Statics.field14] == 1;
            client.method649(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2704 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2706 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2729 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2761 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2803 = field1053[--Statics.field14] == 1;
            client.method649(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2795 = 1;
            var4.field2717 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field14 -= 6;
            var4.field2722 = field1053[Statics.field14];
            var4.field2723 = field1053[Statics.field14 + 1];
            var4.field2730 = field1053[Statics.field14 + 2];
            var4.field2725 = field1053[Statics.field14 + 3];
            var4.field2726 = field1053[Statics.field14 + 4];
            var4.field2727 = field1053[Statics.field14 + 5];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1053[--Statics.field14];
            if (var4.field2768 != var5) {
                var4.field2768 = var5;
                var4.field2760 = 0;
                var4.field2778 = 0;
                client.method649(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2685 = field1053[--Statics.field14] == 1;
            client.method649(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1054[--Statics.field3838];
            if (!var6.equals(var4.field2734)) {
                var4.field2734 = var6;
                client.method649(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2733 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field14 -= 3;
            var4.field2737 = field1053[Statics.field14];
            var4.field2738 = field1053[Statics.field14 + 1];
            var4.field2736 = field1053[Statics.field14 + 2];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2732 = field1053[--Statics.field14] == 1;
            client.method649(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2712 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2713 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2745 = field1053[--Statics.field14] == 1;
            client.method649(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2715 = field1053[--Statics.field14] == 1;
            client.method649(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field14 -= 2;
            var4.field2696 = field1053[Statics.field14];
            var4.field2735 = field1053[Statics.field14 + 1];
            client.method649(var4);
            if (var3 != -1 && var4.field2675 == 0) {
                client.method5028(Statics.field2357[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method1005(var4.field2699, var4.field2674);
            client.field655 = var4;
            client.method649(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2709 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2802 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2705 = field1053[--Statics.field14];
            client.method649(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1053[--Statics.field14];
            class325 var8 = (class325) class185.method3726(Statics.method1820(), var7);
            if (var8 != null) {
                var4.field2747 = var8;
                client.method649(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1053[--Statics.field14] == 1;
            var4.field2707 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1053[--Statics.field14] == 1;
            var4.field2731 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ax.c(ILcn;ZS)I")
    public static int method705(int arg0, class92 arg1, boolean arg2) {
        class238 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class238.method2289(field1053[--Statics.field14]);
        } else {
            var3 = arg2 ? Statics.field1518 : Statics.field275;
        }
        client.method649(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field14 -= 2;
            int var4 = field1053[Statics.field14];
            int var5 = field1053[Statics.field14 + 1];
            var3.field2800 = var4;
            var3.field2801 = var5;
            class275 var6 = class275.method4283(var4);
            var3.field2730 = var6.field3505;
            var3.field2725 = var6.field3506;
            var3.field2726 = var6.field3507;
            var3.field2722 = var6.field3525;
            var3.field2723 = var6.field3494;
            var3.field2727 = var6.field3504;
            if (arg0 == 1205) {
                var3.field2724 = 0;
            } else if (arg0 == 1212 | var6.field3510 == 1) {
                var3.field2724 = 1;
            } else {
                var3.field2724 = 2;
            }
            if (var3.field2728 > 0) {
                var3.field2727 = var3.field2727 * 32 / var3.field2728;
            } else if (var3.field2789 > 0) {
                var3.field2727 = var3.field2727 * 32 / var3.field2789;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2795 = 2;
            var3.field2717 = field1053[--Statics.field14];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2795 = 3;
            var3.field2717 = Statics.field218.field593.method4358();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.z(ILcn;ZB)I")
    public static int method183(int arg0, class92 arg1, boolean arg2) {
        boolean var3 = true;
        class238 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class238.method2289(field1053[--Statics.field14]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1518 : Statics.field275;
        }
        if (arg0 == 1300) {
            int var5 = field1053[--Statics.field14] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4411(var5, field1054[--Statics.field3838]);
                return 1;
            } else {
                Statics.field3838--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field14 -= 2;
            int var6 = field1053[Statics.field14];
            int var7 = field1053[Statics.field14 + 1];
            var4.field2816 = class238.method4106(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2758 = field1053[--Statics.field14] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2691 = field1053[--Statics.field14];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2757 = field1053[--Statics.field14];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2753 = field1054[--Statics.field3838];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2759 = field1054[--Statics.field3838];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2754 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2804 = field1053[--Statics.field14] == 1;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field14 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1053[Statics.field14 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1053[Statics.field14 + var10];
                        var9[var10 / 2] = (byte) field1053[Statics.field14 + var10 + 1];
                    }
                }
            } else {
                Statics.field14 -= 2;
                var8 = new byte[] { (byte) field1053[Statics.field14] };
                var9 = new byte[] { (byte) field1053[Statics.field14 + 1] };
            }
            int var11 = field1053[--Statics.field14] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method1838(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field14 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1053[Statics.field14] };
            byte[] var14 = new byte[] { (byte) field1053[Statics.field14 + 1] };
            method1838(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field14 -= 3;
            int var15 = field1053[Statics.field14] - 1;
            int var16 = field1053[Statics.field14 + 1];
            int var17 = field1053[Statics.field14 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method1083(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1053[--Statics.field14];
            int var20 = field1053[--Statics.field14];
            method1083(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field14--;
            int var21 = field1053[Statics.field14] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method186(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method186(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.j(Liq;I[B[BI)V")
    public static final void method1838(class238 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2748 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2748 = new byte[11][];
            arg0.field2749 = new byte[11][];
            arg0.field2750 = new int[11];
            arg0.field2755 = new int[11];
        }
        arg0.field2748[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2720 = false;
            for (int var4 = 0; var4 < arg0.field2748.length; var4++) {
                if (arg0.field2748[var4] != null) {
                    arg0.field2720 = true;
                    break;
                }
            }
        } else {
            arg0.field2720 = true;
        }
        arg0.field2749[arg1] = arg3;
    }

    @ObfuscatedName("bk.d(Liq;IIIB)V")
    public static final void method1083(class238 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2750 == null) {
            throw new RuntimeException();
        }
        arg0.field2750[arg1] = arg2;
        arg0.field2755[arg1] = arg3;
    }

    @ObfuscatedName("p.i(Liq;IB)V")
    public static final void method186(class238 arg0, int arg1) {
        if (arg0.field2748 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2813 == null) {
            arg0.field2813 = new int[arg0.field2748.length];
        }
        arg0.field2813[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("bu.m(ILcn;ZI)I")
    public static int method987(int arg0, class92 arg1, boolean arg2) {
        class238 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class238.method2289(field1053[--Statics.field14]);
        } else {
            var3 = arg2 ? Statics.field1518 : Statics.field275;
        }
        String var4 = field1054[--Statics.field3838];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1053[--Statics.field14];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1053[--Statics.field14];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1054[--Statics.field3838];
            } else {
                var7[var8] = Integer.valueOf(field1053[--Statics.field14]);
            }
        }
        int var9 = field1053[--Statics.field14];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2762 = var7;
        } else if (arg0 == 1401) {
            var3.field2765 = var7;
        } else if (arg0 == 1402) {
            var3.field2782 = var7;
        } else if (arg0 == 1403) {
            var3.field2766 = var7;
        } else if (arg0 == 1404) {
            var3.field2818 = var7;
        } else if (arg0 == 1405) {
            var3.field2683 = var7;
        } else if (arg0 == 1406) {
            var3.field2772 = var7;
        } else if (arg0 == 1407) {
            var3.field2773 = var7;
            var3.field2774 = var5;
        } else if (arg0 == 1408) {
            var3.field2779 = var7;
        } else if (arg0 == 1409) {
            var3.field2793 = var7;
        } else if (arg0 == 1410) {
            var3.field2770 = var7;
        } else if (arg0 == 1411) {
            var3.field2763 = var7;
        } else if (arg0 == 1412) {
            var3.field2781 = var7;
        } else if (arg0 == 1414) {
            var3.field2775 = var7;
            var3.field2776 = var5;
        } else if (arg0 == 1415) {
            var3.field2690 = var7;
            var3.field2684 = var5;
        } else if (arg0 == 1416) {
            var3.field2771 = var7;
        } else if (arg0 == 1417) {
            var3.field2751 = var7;
        } else if (arg0 == 1418) {
            var3.field2769 = var7;
        } else if (arg0 == 1419) {
            var3.field2783 = var7;
        } else if (arg0 == 1420) {
            var3.field2784 = var7;
        } else if (arg0 == 1421) {
            var3.field2741 = var7;
        } else if (arg0 == 1422) {
            var3.field2786 = var7;
        } else if (arg0 == 1423) {
            var3.field2679 = var7;
        } else if (arg0 == 1424) {
            var3.field2788 = var7;
        } else if (arg0 == 1425) {
            var3.field2790 = var7;
        } else if (arg0 == 1426) {
            var3.field2791 = var7;
        } else if (arg0 == 1427) {
            var3.field2670 = var7;
        } else {
            return 2;
        }
        var3.field2767 = true;
        return 1;
    }

    @ObfuscatedName("bm.v(ILcn;ZI)I")
    public static int method1027(int arg0, class92 arg1, boolean arg2) {
        class238 var3 = arg2 ? Statics.field1518 : Statics.field275;
        if (arg0 == 1500) {
            field1053[++Statics.field14 - 1] = var3.field2686;
            return 1;
        } else if (arg0 == 1501) {
            field1053[++Statics.field14 - 1] = var3.field2787;
            return 1;
        } else if (arg0 == 1502) {
            field1053[++Statics.field14 - 1] = var3.field2692;
            return 1;
        } else if (arg0 == 1503) {
            field1053[++Statics.field14 - 1] = var3.field2807;
            return 1;
        } else if (arg0 == 1504) {
            field1053[++Statics.field14 - 1] = var3.field2693 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1053[++Statics.field14 - 1] = var3.field2812;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ev.r(ILcn;ZB)I")
    public static int method3080(int arg0, class92 arg1, boolean arg2) {
        class238 var3 = arg2 ? Statics.field1518 : Statics.field275;
        if (arg0 == 1600) {
            field1053[++Statics.field14 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 1601) {
            field1053[++Statics.field14 - 1] = var3.field2695;
            return 1;
        } else if (arg0 == 1602) {
            field1054[++Statics.field3838 - 1] = var3.field2734;
            return 1;
        } else if (arg0 == 1603) {
            field1053[++Statics.field14 - 1] = var3.field2696;
            return 1;
        } else if (arg0 == 1604) {
            field1053[++Statics.field14 - 1] = var3.field2735;
            return 1;
        } else if (arg0 == 1605) {
            field1053[++Statics.field14 - 1] = var3.field2727;
            return 1;
        } else if (arg0 == 1606) {
            field1053[++Statics.field14 - 1] = var3.field2730;
            return 1;
        } else if (arg0 == 1607) {
            field1053[++Statics.field14 - 1] = var3.field2726;
            return 1;
        } else if (arg0 == 1608) {
            field1053[++Statics.field14 - 1] = var3.field2725;
            return 1;
        } else if (arg0 == 1609) {
            field1053[++Statics.field14 - 1] = var3.field2704;
            return 1;
        } else if (arg0 == 1610) {
            field1053[++Statics.field14 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 1611) {
            field1053[++Statics.field14 - 1] = var3.field2698;
            return 1;
        } else if (arg0 == 1612) {
            field1053[++Statics.field14 - 1] = var3.field2802;
            return 1;
        } else if (arg0 == 1613) {
            field1053[++Statics.field14 - 1] = var3.field2747.method29();
            return 1;
        } else if (arg0 == 1614) {
            field1053[++Statics.field14 - 1] = var3.field2731 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.x(ILcn;ZB)I")
    public static int method583(int arg0, class92 arg1, boolean arg2) {
        class238 var3 = arg2 ? Statics.field1518 : Statics.field275;
        if (arg0 == 1700) {
            field1053[++Statics.field14 - 1] = var3.field2800;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2800 == -1) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = var3.field2801;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1053[++Statics.field14 - 1] = var3.field2674;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.y(ILcn;ZI)I")
    public static int method1853(int arg0, class92 arg1, boolean arg2) {
        class238 var3 = arg2 ? Statics.field1518 : Statics.field275;
        if (arg0 == 1800) {
            field1053[++Statics.field14 - 1] = class239.method4292(client.method2756(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1053[--Statics.field14];
            int var5 = var4 - 1;
            if (var3.field2754 == null || var5 >= var3.field2754.length || var3.field2754[var5] == null) {
                field1054[++Statics.field3838 - 1] = "";
            } else {
                field1054[++Statics.field3838 - 1] = var3.field2754[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2753 == null) {
                field1054[++Statics.field3838 - 1] = "";
            } else {
                field1054[++Statics.field3838 - 1] = var3.field2753;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.p(ILcn;ZB)I")
    public static int method734(int arg0, class92 arg1, boolean arg2) {
        class238 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class238.method2289(field1053[--Statics.field14]);
        } else {
            var3 = arg2 ? Statics.field1518 : Statics.field275;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1050 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2670 == null) {
            return 0;
        } else {
            class63 var4 = new class63();
            var4.field559 = var3;
            var4.field560 = var3.field2670;
            var4.field567 = field1050 + 1;
            client.field829.method3981(var4);
            return 1;
        }
    }

    @ObfuscatedName("client.k(ILcn;ZB)I")
    public static int method1572(int arg0, class92 arg1, boolean arg2) {
        class238 var3 = class238.method2289(field1053[--Statics.field14]);
        if (arg0 == 2500) {
            field1053[++Statics.field14 - 1] = var3.field2686;
            return 1;
        } else if (arg0 == 2501) {
            field1053[++Statics.field14 - 1] = var3.field2787;
            return 1;
        } else if (arg0 == 2502) {
            field1053[++Statics.field14 - 1] = var3.field2692;
            return 1;
        } else if (arg0 == 2503) {
            field1053[++Statics.field14 - 1] = var3.field2807;
            return 1;
        } else if (arg0 == 2504) {
            field1053[++Statics.field14 - 1] = var3.field2693 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1053[++Statics.field14 - 1] = var3.field2812;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dm.o(ILcn;ZI)I")
    public static int method2668(int arg0, class92 arg1, boolean arg2) {
        class238 var3 = class238.method2289(field1053[--Statics.field14]);
        if (arg0 == 2600) {
            field1053[++Statics.field14 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 2601) {
            field1053[++Statics.field14 - 1] = var3.field2695;
            return 1;
        } else if (arg0 == 2602) {
            field1054[++Statics.field3838 - 1] = var3.field2734;
            return 1;
        } else if (arg0 == 2603) {
            field1053[++Statics.field14 - 1] = var3.field2696;
            return 1;
        } else if (arg0 == 2604) {
            field1053[++Statics.field14 - 1] = var3.field2735;
            return 1;
        } else if (arg0 == 2605) {
            field1053[++Statics.field14 - 1] = var3.field2727;
            return 1;
        } else if (arg0 == 2606) {
            field1053[++Statics.field14 - 1] = var3.field2730;
            return 1;
        } else if (arg0 == 2607) {
            field1053[++Statics.field14 - 1] = var3.field2726;
            return 1;
        } else if (arg0 == 2608) {
            field1053[++Statics.field14 - 1] = var3.field2725;
            return 1;
        } else if (arg0 == 2609) {
            field1053[++Statics.field14 - 1] = var3.field2704;
            return 1;
        } else if (arg0 == 2610) {
            field1053[++Statics.field14 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 2611) {
            field1053[++Statics.field14 - 1] = var3.field2698;
            return 1;
        } else if (arg0 == 2612) {
            field1053[++Statics.field14 - 1] = var3.field2802;
            return 1;
        } else if (arg0 == 2613) {
            field1053[++Statics.field14 - 1] = var3.field2747.method29();
            return 1;
        } else if (arg0 == 2614) {
            field1053[++Statics.field14 - 1] = var3.field2731 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.s(ILcn;ZB)I")
    public static int method481(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class238 var3 = class238.method2289(field1053[--Statics.field14]);
            field1053[++Statics.field14 - 1] = var3.field2800;
            return 1;
        } else if (arg0 == 2701) {
            class238 var4 = class238.method2289(field1053[--Statics.field14]);
            if (var4.field2800 == -1) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = var4.field2801;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1053[--Statics.field14];
            class62 var6 = (class62) client.field693.method3934((long) var5);
            if (var6 == null) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1053[++Statics.field14 - 1] = client.field790;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.u(ILcn;ZB)I")
    public static int method1837(int arg0, class92 arg1, boolean arg2) {
        class238 var3 = class238.method2289(field1053[--Statics.field14]);
        if (arg0 == 2800) {
            field1053[++Statics.field14 - 1] = class239.method4292(client.method2756(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1053[--Statics.field14];
            int var5 = var4 - 1;
            if (var3.field2754 == null || var5 >= var3.field2754.length || var3.field2754[var5] == null) {
                field1054[++Statics.field3838 - 1] = "";
            } else {
                field1054[++Statics.field3838 - 1] = var3.field2754[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2753 == null) {
                field1054[++Statics.field3838 - 1] = "";
            } else {
                field1054[++Statics.field3838 - 1] = var3.field2753;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bw.aa(ILcn;ZI)I")
    public static int method1591(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1054[--Statics.field3838];
            class91.method1872(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field14 -= 2;
            client.method1007(Statics.field218, field1053[Statics.field14], field1053[Statics.field14 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1060) {
                field1059 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1054[--Statics.field3838];
            int var5 = 0;
            if (Statics.method4372(var4)) {
                var5 = class311.method689(var4);
            }
            class180 var6 = class180.method1090(class177.field2267, client.field886.field1271);
            var6.field2345.method3576(var5);
            client.field886.method2059(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1054[--Statics.field3838];
            class180 var8 = class180.method1090(class177.field2265, client.field886.field1271);
            var8.field2345.method3646(var7.length() + 1);
            var8.field2345.method3669(var7);
            client.field886.method2059(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1054[--Statics.field3838];
            class180 var10 = class180.method1090(class177.field2272, client.field886.field1271);
            var10.field2345.method3646(var9.length() + 1);
            var10.field2345.method3669(var9);
            client.field886.method2059(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1053[--Statics.field14];
            String var12 = field1054[--Statics.field3838];
            client.method516(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field14 -= 3;
            int var13 = field1053[Statics.field14];
            int var14 = field1053[Statics.field14 + 1];
            int var15 = field1053[Statics.field14 + 2];
            class238 var16 = class238.method2289(var15);
            client.method1928(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field14 -= 2;
            int var17 = field1053[Statics.field14];
            int var18 = field1053[Statics.field14 + 1];
            class238 var19 = arg2 ? Statics.field1518 : Statics.field275;
            client.method1928(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field98 = field1053[--Statics.field14] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1053[++Statics.field14 - 1] = Statics.field2667.field1013 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field2667.field1013 = field1053[--Statics.field14] == 1;
            class73.method1874();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1054[--Statics.field3838];
            boolean var21 = field1053[--Statics.field14] == 1;
            class51.method119(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1053[--Statics.field14];
            class180 var23 = class180.method1090(class177.field2271, client.field886.field1271);
            var23.field2345.method3508(var22);
            client.field886.method2059(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1053[--Statics.field14];
            Statics.field3838 -= 2;
            String var25 = field1054[Statics.field3838];
            String var26 = field1054[Statics.field3838 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class180 var27 = class180.method1090(class177.field2235, client.field886.field1271);
                var27.field2345.method3508(1 + class190.method3098(var25) + class190.method3098(var26));
                var27.field2345.method3669(var25);
                var27.field2345.method3646(var24);
                var27.field2345.method3669(var26);
                client.field886.method2059(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field776 = field1053[--Statics.field14] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field778 = field1053[--Statics.field14] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field749 = field1053[--Statics.field14] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1053[--Statics.field14] == 1) {
                client.field750 |= 0x1;
            } else {
                client.field750 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1053[--Statics.field14] == 1) {
                client.field750 |= 0x2;
            } else {
                client.field750 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1053[--Statics.field14] == 1) {
                client.field750 |= 0x4;
            } else {
                client.field750 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1053[--Statics.field14] == 1) {
                client.field750 |= 0x8;
            } else {
                client.field750 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field750 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field735 = field1053[--Statics.field14] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field745 = field1053[--Statics.field14] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method2542(field1053[--Statics.field14] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1053[++Statics.field14 - 1] = client.method284() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field14 -= 2;
            client.field710 = field1053[Statics.field14];
            client.field711 = field1053[Statics.field14 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field14 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field14--;
            return 1;
        } else if (arg0 == 3132) {
            field1053[++Statics.field14 - 1] = Statics.field1878;
            field1053[++Statics.field14 - 1] = Statics.field442;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field14--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field14 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field756 = 3;
            client.field662 = field1053[--Statics.field14];
            return 1;
        } else if (arg0 == 3137) {
            client.field756 = 2;
            client.field662 = field1053[--Statics.field14];
            return 1;
        } else if (arg0 == 3138) {
            client.field756 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field756 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field756 = 3;
            client.field662 = arg2 ? Statics.field1518.field2699 : Statics.field275.field2699;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1053[--Statics.field14] == 1;
            Statics.field2667.field1015 = var28;
            class73.method1874();
            return 1;
        } else if (arg0 == 3142) {
            field1053[++Statics.field14 - 1] = Statics.field2667.field1015 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1053[--Statics.field14] == 1;
            client.field668 = var29;
            if (!var29) {
                Statics.field2667.field1017 = "";
                class73.method1874();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1053[++Statics.field14 - 1] = client.field668 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1053[--Statics.field14] == 1;
            if (Statics.field2667.field1014 == var30) {
                Statics.field2667.field1014 = !var30;
                class73.method1874();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1053[++Statics.field14 - 1] = Statics.field2667.field1014 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1053[++Statics.field14 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("be.ai(ILcn;ZB)I")
    public static int method998(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field14 -= 3;
            client.method2267(field1053[Statics.field14], field1053[Statics.field14 + 1], field1053[Statics.field14 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method152(field1053[--Statics.field14]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field14 -= 2;
            client.method3267(field1053[Statics.field14], field1053[Statics.field14 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.ag(ILcn;ZI)I")
    public static int method688(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1053[++Statics.field14 - 1] = client.field899;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field14 -= 2;
            int var3 = field1053[Statics.field14];
            int var4 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = class60.method897(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field14 -= 2;
            int var5 = field1053[Statics.field14];
            int var6 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = class60.method894(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field14 -= 2;
            int var7 = field1053[Statics.field14];
            int var8 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = class60.method4361(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = class260.method3071(var9).field3295;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = client.field762[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = client.field632[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = client.field764[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field66;
            int var14 = (Statics.field218.field949 >> 7) + Statics.field512;
            int var15 = (Statics.field218.field922 >> 7) + Statics.field318;
            field1053[++Statics.field14 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1053[++Statics.field14 - 1] = client.field851 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field14 -= 2;
            int var19 = field1053[Statics.field14] + 32768;
            int var20 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = class60.method897(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field14 -= 2;
            int var21 = field1053[Statics.field14] + 32768;
            int var22 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = class60.method894(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field14 -= 2;
            int var23 = field1053[Statics.field14] + 32768;
            int var24 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = class60.method4361(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field821 >= 2) {
                field1053[++Statics.field14 - 1] = client.field821;
            } else {
                field1053[++Statics.field14 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1053[++Statics.field14 - 1] = client.field648;
            return 1;
        } else if (arg0 == 3318) {
            field1053[++Statics.field14 - 1] = client.field630;
            return 1;
        } else if (arg0 == 3321) {
            field1053[++Statics.field14 - 1] = client.field760;
            return 1;
        } else if (arg0 == 3322) {
            field1053[++Statics.field14 - 1] = client.field798;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field801) {
                field1053[++Statics.field14 - 1] = 1;
            } else {
                field1053[++Statics.field14 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1053[++Statics.field14 - 1] = client.field631;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field14 -= 4;
            int var25 = field1053[Statics.field14];
            int var26 = field1053[Statics.field14 + 1];
            int var27 = field1053[Statics.field14 + 2];
            int var28 = field1053[Statics.field14 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1053[++Statics.field14 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("s.at(ILcn;ZB)I")
    public static int method252(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field14 -= 2;
            int var3 = field1053[Statics.field14];
            int var4 = field1053[Statics.field14 + 1];
            class272 var5 = class272.method3386(var3);
            if (var5.field3416 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3414; var6++) {
                if (var5.field3415[var6] == var4) {
                    field1054[++Statics.field3838 - 1] = var5.field3417[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1054[++Statics.field3838 - 1] = var5.field3408;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field14 -= 4;
            int var7 = field1053[Statics.field14];
            int var8 = field1053[Statics.field14 + 1];
            int var9 = field1053[Statics.field14 + 2];
            int var10 = field1053[Statics.field14 + 3];
            class272 var11 = class272.method3386(var9);
            if (var11.field3410 != var7 || var11.field3416 != var8) {
                if (var8 == 115) {
                    field1054[++Statics.field3838 - 1] = class245.field2894;
                } else {
                    field1053[++Statics.field14 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3414; var12++) {
                if (var11.field3415[var12] == var10) {
                    if (var8 == 115) {
                        field1054[++Statics.field3838 - 1] = var11.field3417[var12];
                    } else {
                        field1053[++Statics.field14 - 1] = var11.field3409[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1054[++Statics.field3838 - 1] = var11.field3408;
                } else {
                    field1053[++Statics.field14 - 1] = var11.field3413;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1053[--Statics.field14];
            class272 var14 = class272.method3386(var13);
            field1053[++Statics.field14 - 1] = var14.method4823();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bd.ad(ILcn;ZI)I")
    public static int method1717(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field2434.field1027 == 0) {
                field1053[++Statics.field14 - 1] = -2;
            } else if (Statics.field2434.field1027 == 1) {
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = Statics.field2434.field1025.method5164();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1053[--Statics.field14];
            if (Statics.field2434.method1646() && var3 >= 0 && var3 < Statics.field2434.field1025.method5164()) {
                class298 var4 = (class298) Statics.field2434.field1025.method5174(var3);
                field1054[++Statics.field3838 - 1] = var4.method5126();
                field1054[++Statics.field3838 - 1] = var4.method5127();
            } else {
                field1054[++Statics.field3838 - 1] = "";
                field1054[++Statics.field3838 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1053[--Statics.field14];
            if (Statics.field2434.method1646() && var5 >= 0 && var5 < Statics.field2434.field1025.method5164()) {
                field1053[++Statics.field14 - 1] = ((class293) Statics.field2434.field1025.method5174(var5)).field3701;
            } else {
                field1053[++Statics.field14 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1053[--Statics.field14];
            if (Statics.field2434.method1646() && var6 >= 0 && var6 < Statics.field2434.field1025.method5164()) {
                field1053[++Statics.field14 - 1] = ((class293) Statics.field2434.field1025.method5174(var6)).field3703;
            } else {
                field1053[++Statics.field14 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1054[--Statics.field3838];
            int var8 = field1053[--Statics.field14];
            class74.method899(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1054[--Statics.field3838];
            Statics.field2434.method1653(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1054[--Statics.field3838];
            Statics.field2434.method1715(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1054[--Statics.field3838];
            Statics.field2434.method1655(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1054[--Statics.field3838];
            Statics.field2434.method1658(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1054[--Statics.field3838];
            String var14 = client.method5321(var13);
            field1053[++Statics.field14 - 1] = Statics.field2434.method1651(new class297(var14, Statics.field346), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field481 == null) {
                field1054[++Statics.field3838 - 1] = "";
            } else {
                field1054[++Statics.field3838 - 1] = Statics.field481.field3719;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field481 == null) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = Statics.field481.method5164();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1053[--Statics.field14];
            if (Statics.field481 == null || var15 >= Statics.field481.method5164()) {
                field1054[++Statics.field3838 - 1] = "";
            } else {
                field1054[++Statics.field3838 - 1] = Statics.field481.method5174(var15).method5125().method5261();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1053[--Statics.field14];
            if (Statics.field481 == null || var16 >= Statics.field481.method5164()) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = ((class293) Statics.field481.method5174(var16)).method5236();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1053[--Statics.field14];
            if (Statics.field481 == null || var17 >= Statics.field481.method5164()) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = ((class293) Statics.field481.method5174(var17)).field3703;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1053[++Statics.field14 - 1] = Statics.field481 == null ? 0 : Statics.field481.field3723;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1054[--Statics.field3838];
            client.method697(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1053[++Statics.field14 - 1] = Statics.field481 == null ? 0 : Statics.field481.field3724;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1054[--Statics.field3838];
            client.method3338(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method1136();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field2434.method1646()) {
                field1053[++Statics.field14 - 1] = Statics.field2434.field1026.method5164();
            } else {
                field1053[++Statics.field14 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1053[--Statics.field14];
            if (Statics.field2434.method1646() && var20 >= 0 && var20 < Statics.field2434.field1026.method5164()) {
                class292 var21 = (class292) Statics.field2434.field1026.method5174(var20);
                field1054[++Statics.field3838 - 1] = var21.method5126();
                field1054[++Statics.field3838 - 1] = var21.method5127();
            } else {
                field1054[++Statics.field3838 - 1] = "";
                field1054[++Statics.field3838 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1054[--Statics.field3838];
            String var23 = client.method5321(var22);
            field1053[++Statics.field14 - 1] = Statics.field2434.method1694(new class297(var23, Statics.field346)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1053[--Statics.field14];
            if (Statics.field481 == null || var24 >= Statics.field481.method5164() || !Statics.field481.method5174(var24).method5125().equals(Statics.field218.field595)) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field481 == null || Statics.field481.field3725 == null) {
                field1054[++Statics.field3838 - 1] = "";
            } else {
                field1054[++Statics.field3838 - 1] = Statics.field481.field3725;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1053[--Statics.field14];
            if (Statics.field481 == null || var25 >= Statics.field481.method5164() || !((class287) Statics.field481.method5174(var25)).method5108()) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1053[--Statics.field14];
            if (Statics.field481 == null || var26 >= Statics.field481.method5164() || !((class287) Statics.field481.method5174(var26)).method5111()) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field2434.field1025.method5181();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1025.method5182(new class317(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1025.method5182(new class318(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1025.method5182(new class151(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1025.method5182(new class145(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1025.method5182(new class150(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1025.method5182(new class153(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1025.method5182(new class149(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1025.method5182(new class147(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1025.method5182(new class146(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1025.method5182(new class148(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field2434.field1025.method5191();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field2434.field1026.method5181();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1026.method5182(new class317(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1026.method5182(new class318(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field2434.field1026.method5191();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field481 != null) {
                Statics.field481.method5181();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1053[--Statics.field14] == 1;
            if (Statics.field481 != null) {
                Statics.field481.method5182(new class317(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1053[--Statics.field14] == 1;
            if (Statics.field481 != null) {
                Statics.field481.method5182(new class318(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1053[--Statics.field14] == 1;
            if (Statics.field481 != null) {
                Statics.field481.method5182(new class151(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1053[--Statics.field14] == 1;
            if (Statics.field481 != null) {
                Statics.field481.method5182(new class145(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1053[--Statics.field14] == 1;
            if (Statics.field481 != null) {
                Statics.field481.method5182(new class150(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1053[--Statics.field14] == 1;
            if (Statics.field481 != null) {
                Statics.field481.method5182(new class153(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1053[--Statics.field14] == 1;
            if (Statics.field481 != null) {
                Statics.field481.method5182(new class149(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1053[--Statics.field14] == 1;
            if (Statics.field481 != null) {
                Statics.field481.method5182(new class147(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1053[--Statics.field14] == 1;
            if (Statics.field481 != null) {
                Statics.field481.method5182(new class146(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1053[--Statics.field14] == 1;
            if (Statics.field481 != null) {
                Statics.field481.method5182(new class148(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field481 != null) {
                Statics.field481.method5191();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1053[--Statics.field14] == 1;
            Statics.field2434.field1025.method5182(new class152(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1053[--Statics.field14] == 1;
            if (Statics.field481 != null) {
                Statics.field481.method5182(new class152(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ei.ac(ILcn;ZI)I")
    public static int method3149(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field14 -= 2;
            int var3 = field1053[Statics.field14];
            int var4 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field14 -= 2;
            int var5 = field1053[Statics.field14];
            int var6 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field14 -= 2;
            int var7 = field1053[Statics.field14];
            int var8 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field14 -= 2;
            int var9 = field1053[Statics.field14];
            int var10 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field14 -= 5;
            int var13 = field1053[Statics.field14];
            int var14 = field1053[Statics.field14 + 1];
            int var15 = field1053[Statics.field14 + 2];
            int var16 = field1053[Statics.field14 + 3];
            int var17 = field1053[Statics.field14 + 4];
            field1053[++Statics.field14 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field14 -= 2;
            int var18 = field1053[Statics.field14];
            int var19 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field14 -= 2;
            int var20 = field1053[Statics.field14];
            int var21 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field14 -= 2;
            int var22 = field1053[Statics.field14];
            int var23 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field14 -= 2;
            int var24 = field1053[Statics.field14];
            int var25 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field14 -= 2;
            int var26 = field1053[Statics.field14];
            int var27 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field14 -= 2;
            int var28 = field1053[Statics.field14];
            int var29 = field1053[Statics.field14 + 1];
            if (var28 == 0) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field14 -= 2;
            int var30 = field1053[Statics.field14];
            int var31 = field1053[Statics.field14 + 1];
            if (var30 == 0) {
                field1053[++Statics.field14 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1053[++Statics.field14 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1053[++Statics.field14 - 1] = var30;
                    break;
                case 2:
                    field1053[++Statics.field14 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1053[++Statics.field14 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1053[++Statics.field14 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1053[++Statics.field14 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field14 -= 2;
            int var32 = field1053[Statics.field14];
            int var33 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field14 -= 2;
            int var34 = field1053[Statics.field14];
            int var35 = field1053[Statics.field14 + 1];
            field1053[++Statics.field14 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field14 -= 3;
            long var36 = (long) field1053[Statics.field14];
            long var38 = (long) field1053[Statics.field14 + 1];
            long var40 = (long) field1053[Statics.field14 + 2];
            field1053[++Statics.field14 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bc.an(ILcn;ZI)I")
    public static int method1034(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1054[--Statics.field3838];
            int var4 = field1053[--Statics.field14];
            field1054[++Statics.field3838 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field3838 -= 2;
            String var5 = field1054[Statics.field3838];
            String var6 = field1054[Statics.field3838 + 1];
            field1054[++Statics.field3838 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1054[--Statics.field3838];
            int var8 = field1053[--Statics.field14];
            field1054[++Statics.field3838 - 1] = var7 + Statics.method3137(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1054[--Statics.field3838];
            field1054[++Statics.field3838 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1053[--Statics.field14];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1062.setTime(new Date(var11));
            int var13 = field1062.get(5);
            int var14 = field1062.get(2);
            int var15 = field1062.get(1);
            field1054[++Statics.field3838 - 1] = var13 + "-" + field1057[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field3838 -= 2;
            String var16 = field1054[Statics.field3838];
            String var17 = field1054[Statics.field3838 + 1];
            if (Statics.field218.field593 != null && Statics.field218.field593.field2642) {
                field1054[++Statics.field3838 - 1] = var17;
            } else {
                field1054[++Statics.field3838 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1053[--Statics.field14];
            field1054[++Statics.field3838 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field3838 -= 2;
            field1053[++Statics.field14 - 1] = class311.method1880(class181.method554(field1054[Statics.field3838], field1054[Statics.field3838 + 1], client.field884));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1054[--Statics.field3838];
            Statics.field14 -= 2;
            int var20 = field1053[Statics.field14];
            int var21 = field1053[Statics.field14 + 1];
            byte[] var22 = Statics.field13.method4494(var21, 0);
            class304 var23 = new class304(var22);
            field1053[++Statics.field14 - 1] = var23.method5335(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1054[--Statics.field3838];
            Statics.field14 -= 2;
            int var25 = field1053[Statics.field14];
            int var26 = field1053[Statics.field14 + 1];
            byte[] var27 = Statics.field13.method4494(var26, 0);
            class304 var28 = new class304(var27);
            field1053[++Statics.field14 - 1] = var28.method5334(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field3838 -= 2;
            String var29 = field1054[Statics.field3838];
            String var30 = field1054[Statics.field3838 + 1];
            if (field1053[--Statics.field14] == 1) {
                field1054[++Statics.field3838 - 1] = var29;
            } else {
                field1054[++Statics.field3838 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1054[--Statics.field3838];
            field1054[++Statics.field3838 - 1] = class305.method5400(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1054[--Statics.field3838];
            int var33 = field1053[--Statics.field14];
            field1054[++Statics.field3838 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = class311.method3066((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = Statics.method5071((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = class311.method4969((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = class311.method515((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1054[--Statics.field3838];
            if (var38 == null) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1054[--Statics.field3838];
            Statics.field14 -= 2;
            int var40 = field1053[Statics.field14];
            int var41 = field1053[Statics.field14 + 1];
            field1054[++Statics.field3838 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1054[--Statics.field3838];
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
            field1054[++Statics.field3838 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1054[--Statics.field3838];
            int var48 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field3838 -= 2;
            String var49 = field1054[Statics.field3838];
            String var50 = field1054[Statics.field3838 + 1];
            int var51 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("id.ak(ILcn;ZI)I")
    public static int method4370(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1053[--Statics.field14];
            field1054[++Statics.field3838 - 1] = class275.method4283(var3).field3523;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field14 -= 2;
            int var4 = field1053[Statics.field14];
            int var5 = field1053[Statics.field14 + 1];
            class275 var6 = class275.method4283(var4);
            if (var5 < 1 || var5 > 5 || var6.field3537[var5 - 1] == null) {
                field1054[++Statics.field3838 - 1] = "";
            } else {
                field1054[++Statics.field3838 - 1] = var6.field3537[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field14 -= 2;
            int var7 = field1053[Statics.field14];
            int var8 = field1053[Statics.field14 + 1];
            class275 var9 = class275.method4283(var7);
            if (var8 < 1 || var8 > 5 || var9.field3514[var8 - 1] == null) {
                field1054[++Statics.field3838 - 1] = "";
            } else {
                field1054[++Statics.field3838 - 1] = var9.field3514[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = class275.method4283(var10).field3532;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = class275.method4283(var11).field3510 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1053[--Statics.field14];
            class275 var13 = class275.method4283(var12);
            if (var13.field3531 == -1 && var13.field3499 >= 0) {
                field1053[++Statics.field14 - 1] = var13.field3499;
            } else {
                field1053[++Statics.field14 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1053[--Statics.field14];
            class275 var15 = class275.method4283(var14);
            if (var15.field3531 >= 0 && var15.field3499 >= 0) {
                field1053[++Statics.field14 - 1] = var15.field3499;
            } else {
                field1053[++Statics.field14 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = class275.method4283(var16).field3512 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1053[--Statics.field14];
            class275 var18 = class275.method4283(var17);
            if (var18.field3543 == -1 && var18.field3542 >= 0) {
                field1053[++Statics.field14 - 1] = var18.field3542;
            } else {
                field1053[++Statics.field14 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1053[--Statics.field14];
            class275 var20 = class275.method4283(var19);
            if (var20.field3543 >= 0 && var20.field3542 >= 0) {
                field1053[++Statics.field14 - 1] = var20.field3542;
            } else {
                field1053[++Statics.field14 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1054[--Statics.field3838];
            int var22 = field1053[--Statics.field14];
            client.method5477(var21, var22 == 1);
            field1053[++Statics.field14 - 1] = Statics.field1931;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field3700 == null || Statics.field183 >= Statics.field1931) {
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = Statics.field3700[++Statics.field183 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field183 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.ah(ILcn;ZB)I")
    public static int method363(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1053[++Statics.field14 - 1] = client.field846;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field14 -= 3;
            client.field846 = field1053[Statics.field14];
            Statics.field421 = class313.method4746(field1053[Statics.field14 + 1]);
            if (Statics.field421 == null) {
                Statics.field421 = class313.field3803;
            }
            client.field847 = field1053[Statics.field14 + 2];
            class180 var3 = class180.method1090(class177.field2234, client.field886.field1271);
            var3.field2345.method3646(client.field846);
            var3.field2345.method3646(Statics.field421.field3800);
            var3.field2345.method3646(client.field847);
            client.field886.method2059(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1054[--Statics.field3838];
            Statics.field14 -= 2;
            int var5 = field1053[Statics.field14];
            int var6 = field1053[Statics.field14 + 1];
            class180 var7 = class180.method1090(class177.field2257, client.field886.field1271);
            var7.field2345.method3646(class190.method3098(var4) + 2);
            var7.field2345.method3669(var4);
            var7.field2345.method3646(var5 - 1);
            var7.field2345.method3646(var6);
            client.field886.method2059(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field14 -= 2;
            int var8 = field1053[Statics.field14];
            int var9 = field1053[Statics.field14 + 1];
            class65 var10 = class91.method82(var8, var9);
            if (var10 == null) {
                field1053[++Statics.field14 - 1] = -1;
                field1053[++Statics.field14 - 1] = 0;
                field1054[++Statics.field3838 - 1] = "";
                field1054[++Statics.field3838 - 1] = "";
                field1054[++Statics.field3838 - 1] = "";
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = var10.field583;
                field1053[++Statics.field14 - 1] = var10.field579;
                field1054[++Statics.field3838 - 1] = var10.field581 == null ? "" : var10.field581;
                field1054[++Statics.field3838 - 1] = var10.field585 == null ? "" : var10.field585;
                field1054[++Statics.field3838 - 1] = var10.field580 == null ? "" : var10.field580;
                field1053[++Statics.field14 - 1] = var10.method1061() ? 1 : (var10.method1064() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1053[--Statics.field14];
            class65 var12 = class91.method2058(var11);
            if (var12 == null) {
                field1053[++Statics.field14 - 1] = -1;
                field1053[++Statics.field14 - 1] = 0;
                field1054[++Statics.field3838 - 1] = "";
                field1054[++Statics.field3838 - 1] = "";
                field1054[++Statics.field3838 - 1] = "";
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = var12.field578;
                field1053[++Statics.field14 - 1] = var12.field579;
                field1054[++Statics.field3838 - 1] = var12.field581 == null ? "" : var12.field581;
                field1054[++Statics.field3838 - 1] = var12.field585 == null ? "" : var12.field585;
                field1054[++Statics.field3838 - 1] = var12.field580 == null ? "" : var12.field580;
                field1053[++Statics.field14 - 1] = var12.method1061() ? 1 : (var12.method1064() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field421 == null) {
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = Statics.field421.field3800;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1054[--Statics.field3838];
            int var14 = field1053[--Statics.field14];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class245.field3048)) {
                var16 = 0;
                var13 = var13.substring(class245.field3048.length());
            } else if (var15.startsWith(class245.field2915)) {
                var16 = 1;
                var13 = var13.substring(class245.field2915.length());
            } else if (var15.startsWith(class245.field3052)) {
                var16 = 2;
                var13 = var13.substring(class245.field3052.length());
            } else if (var15.startsWith(class245.field3054)) {
                var16 = 3;
                var13 = var13.substring(class245.field3054.length());
            } else if (var15.startsWith(class245.field3031)) {
                var16 = 4;
                var13 = var13.substring(class245.field3031.length());
            } else if (var15.startsWith(class245.field3058)) {
                var16 = 5;
                var13 = var13.substring(class245.field3058.length());
            } else if (var15.startsWith(class245.field3060)) {
                var16 = 6;
                var13 = var13.substring(class245.field3060.length());
            } else if (var15.startsWith(class245.field3028)) {
                var16 = 7;
                var13 = var13.substring(class245.field3028.length());
            } else if (var15.startsWith(class245.field3064)) {
                var16 = 8;
                var13 = var13.substring(class245.field3064.length());
            } else if (var15.startsWith(class245.field3066)) {
                var16 = 9;
                var13 = var13.substring(class245.field3066.length());
            } else if (var15.startsWith(class245.field3099)) {
                var16 = 10;
                var13 = var13.substring(class245.field3099.length());
            } else if (var15.startsWith(class245.field3051)) {
                var16 = 11;
                var13 = var13.substring(class245.field3051.length());
            } else if (client.field884 != 0) {
                if (var15.startsWith(class245.field3049)) {
                    var16 = 0;
                    var13 = var13.substring(class245.field3049.length());
                } else if (var15.startsWith(class245.field2901)) {
                    var16 = 1;
                    var13 = var13.substring(class245.field2901.length());
                } else if (var15.startsWith(class245.field2891)) {
                    var16 = 2;
                    var13 = var13.substring(class245.field2891.length());
                } else if (var15.startsWith(class245.field3055)) {
                    var16 = 3;
                    var13 = var13.substring(class245.field3055.length());
                } else if (var15.startsWith(class245.field2939)) {
                    var16 = 4;
                    var13 = var13.substring(class245.field2939.length());
                } else if (var15.startsWith(class245.field3059)) {
                    var16 = 5;
                    var13 = var13.substring(class245.field3059.length());
                } else if (var15.startsWith(class245.field3061)) {
                    var16 = 6;
                    var13 = var13.substring(class245.field3061.length());
                } else if (var15.startsWith(class245.field3063)) {
                    var16 = 7;
                    var13 = var13.substring(class245.field3063.length());
                } else if (var15.startsWith(class245.field2924)) {
                    var16 = 8;
                    var13 = var13.substring(class245.field2924.length());
                } else if (var15.startsWith(class245.field3067)) {
                    var16 = 9;
                    var13 = var13.substring(class245.field3067.length());
                } else if (var15.startsWith(class245.field3069)) {
                    var16 = 10;
                    var13 = var13.substring(class245.field3069.length());
                } else if (var15.startsWith(class245.field3071)) {
                    var16 = 11;
                    var13 = var13.substring(class245.field3071.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class245.field3072)) {
                var18 = 1;
                var13 = var13.substring(class245.field3072.length());
            } else if (var17.startsWith(class245.field3074)) {
                var18 = 2;
                var13 = var13.substring(class245.field3074.length());
            } else if (var17.startsWith(class245.field2890)) {
                var18 = 3;
                var13 = var13.substring(class245.field2890.length());
            } else if (var17.startsWith(class245.field3078)) {
                var18 = 4;
                var13 = var13.substring(class245.field3078.length());
            } else if (var17.startsWith(class245.field3008)) {
                var18 = 5;
                var13 = var13.substring(class245.field3008.length());
            } else if (client.field884 != 0) {
                if (var17.startsWith(class245.field3073)) {
                    var18 = 1;
                    var13 = var13.substring(class245.field3073.length());
                } else if (var17.startsWith(class245.field3075)) {
                    var18 = 2;
                    var13 = var13.substring(class245.field3075.length());
                } else if (var17.startsWith(class245.field2910)) {
                    var18 = 3;
                    var13 = var13.substring(class245.field2910.length());
                } else if (var17.startsWith(class245.field3079)) {
                    var18 = 4;
                    var13 = var13.substring(class245.field3079.length());
                } else if (var17.startsWith(class245.field3081)) {
                    var18 = 5;
                    var13 = var13.substring(class245.field3081.length());
                }
            }
            class180 var19 = class180.method1090(class177.field2316, client.field886.field1271);
            var19.field2345.method3646(0);
            int var20 = var19.field2345.field2423;
            var19.field2345.method3646(var14);
            var19.field2345.method3646(var16);
            var19.field2345.method3646(var18);
            class306.method3172(var19.field2345, var13);
            var19.field2345.method3506(var19.field2345.field2423 - var20);
            client.field886.method2059(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field3838 -= 2;
            String var21 = field1054[Statics.field3838];
            String var22 = field1054[Statics.field3838 + 1];
            class180 var23 = class180.method1090(class177.field2244, client.field886.field1271);
            var23.field2345.method3508(0);
            int var24 = var23.field2345.field2423;
            var23.field2345.method3669(var21);
            class306.method3172(var23.field2345, var22);
            var23.field2345.method3493(var23.field2345.field2423 - var24);
            client.field886.method2059(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field218 == null || Statics.field218.field595 == null) {
                var25 = "";
            } else {
                var25 = Statics.field218.field595.method5261();
            }
            field1054[++Statics.field3838 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1053[++Statics.field14 - 1] = client.field847;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = class91.method3074(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = class91.method1723(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = class91.method3196(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1054[--Statics.field3838];
            client.method3479(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field859 = field1054[--Statics.field3838].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1054[++Statics.field3838 - 1] = client.field859;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1054[--Statics.field3838];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ir.am(ILcn;ZI)I")
    public static int method4433(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field14 -= 2;
            int var3 = field1053[Statics.field14];
            int var4 = field1053[Statics.field14 + 1];
            if (!client.field874) {
                client.field699 = var3;
                client.field700 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1053[++Statics.field14 - 1] = client.field699;
            return 1;
        } else if (arg0 == 5506) {
            field1053[++Statics.field14 - 1] = client.field700;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1053[--Statics.field14];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field706 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1053[++Statics.field14 - 1] = client.field706;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.ao(ILcn;ZB)I")
    public static int method36(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field677 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.aq(II)I")
    public static int method1049(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("il.aw(II)I")
    public static int method4444(int arg0) {
        return (int) ((Math.log((double) arg0) / field1051 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("cn.ab(ILcn;ZI)I")
    public static int method2031(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field14 -= 2;
            client.field880 = (short) method1049(field1053[Statics.field14]);
            if (client.field880 <= 0) {
                client.field880 = 256;
            }
            client.field881 = (short) method1049(field1053[Statics.field14 + 1]);
            if (client.field881 <= 0) {
                client.field881 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field14 -= 2;
            client.field779 = (short) field1053[Statics.field14];
            if (client.field779 <= 0) {
                client.field779 = 256;
            }
            client.field727 = (short) field1053[Statics.field14 + 1];
            if (client.field727 <= 0) {
                client.field727 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field14 -= 4;
            client.field815 = (short) field1053[Statics.field14];
            if (client.field815 <= 0) {
                client.field815 = 1;
            }
            client.field848 = (short) field1053[Statics.field14 + 1];
            if (client.field848 <= 0) {
                client.field848 = 32767;
            } else if (client.field848 < client.field815) {
                client.field848 = client.field815;
            }
            client.field683 = (short) field1053[Statics.field14 + 2];
            if (client.field683 <= 0) {
                client.field683 = 1;
            }
            client.field883 = (short) field1053[Statics.field14 + 3];
            if (client.field883 <= 0) {
                client.field883 = 32767;
            } else if (client.field883 < client.field683) {
                client.field883 = client.field683;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field802 == null) {
                field1053[++Statics.field14 - 1] = -1;
                field1053[++Statics.field14 - 1] = -1;
            } else {
                Statics.method3138(0, 0, client.field802.field2692, client.field802.field2807, false);
                field1053[++Statics.field14 - 1] = client.field890;
                field1053[++Statics.field14 - 1] = client.field742;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1053[++Statics.field14 - 1] = client.field779;
            field1053[++Statics.field14 - 1] = client.field727;
            return 1;
        } else if (arg0 == 6205) {
            field1053[++Statics.field14 - 1] = method4444(client.field880);
            field1053[++Statics.field14 - 1] = method4444(client.field881);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dz.au(ILcn;ZI)I")
    public static int method2774(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field66;
            int var4 = (Statics.field218.field949 >> 7) + Statics.field512;
            int var5 = (Statics.field218.field922 >> 7) + Statics.field318;
            client.method266().method5932(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1053[--Statics.field14];
            String var7 = "";
            class27 var8 = client.method266().method5873(var6);
            if (var8 != null) {
                var7 = var8.method296();
            }
            field1054[++Statics.field3838 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1053[--Statics.field14];
            client.method266().method5922(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1053[++Statics.field14 - 1] = client.method266().method5870();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1053[--Statics.field14];
            client.method266().method5951(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1053[++Statics.field14 - 1] = client.method266().method5843() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class234 var11 = new class234(field1053[--Statics.field14]);
            client.method266().method5874(var11.field2637, var11.field2638);
            return 1;
        } else if (arg0 == 6607) {
            class234 var12 = new class234(field1053[--Statics.field14]);
            client.method266().method5878(var12.field2637, var12.field2638);
            return 1;
        } else if (arg0 == 6608) {
            class234 var13 = new class234(field1053[--Statics.field14]);
            client.method266().method5876(var13.field2639, var13.field2637, var13.field2638);
            return 1;
        } else if (arg0 == 6609) {
            class234 var14 = new class234(field1053[--Statics.field14]);
            client.method266().method5945(var14.field2639, var14.field2637, var14.field2638);
            return 1;
        } else if (arg0 == 6610) {
            field1053[++Statics.field14 - 1] = client.method266().method5926();
            field1053[++Statics.field14 - 1] = client.method266().method5851();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1053[--Statics.field14];
            class27 var16 = client.method266().method5873(var15);
            if (var16 == null) {
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = var16.method306().method4313();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1053[--Statics.field14];
            class27 var18 = client.method266().method5873(var17);
            if (var18 == null) {
                field1053[++Statics.field14 - 1] = 0;
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = (var18.method300() - var18.method334() + 1) * 64;
                field1053[++Statics.field14 - 1] = (var18.method302() - var18.method321() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1053[--Statics.field14];
            class27 var20 = client.method266().method5873(var19);
            if (var20 == null) {
                field1053[++Statics.field14 - 1] = 0;
                field1053[++Statics.field14 - 1] = 0;
                field1053[++Statics.field14 - 1] = 0;
                field1053[++Statics.field14 - 1] = 0;
            } else {
                field1053[++Statics.field14 - 1] = var20.method334() * 64;
                field1053[++Statics.field14 - 1] = var20.method321() * 64;
                field1053[++Statics.field14 - 1] = var20.method300() * 64 + 64 - 1;
                field1053[++Statics.field14 - 1] = var20.method302() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1053[--Statics.field14];
            class27 var22 = client.method266().method5873(var21);
            if (var22 == null) {
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = var22.method301();
            }
            return 1;
        } else if (arg0 == 6615) {
            class234 var23 = client.method266().method5879();
            if (var23 == null) {
                field1053[++Statics.field14 - 1] = -1;
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = var23.field2637;
                field1053[++Statics.field14 - 1] = var23.field2638;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1053[++Statics.field14 - 1] = client.method266().method6004();
            return 1;
        } else if (arg0 == 6617) {
            class234 var24 = new class234(field1053[--Statics.field14]);
            class27 var25 = client.method266().method6013();
            if (var25 == null) {
                field1053[++Statics.field14 - 1] = -1;
                field1053[++Statics.field14 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method290(var24.field2639, var24.field2637, var24.field2638);
            if (var26 == null) {
                field1053[++Statics.field14 - 1] = -1;
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = var26[0];
                field1053[++Statics.field14 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class234 var27 = new class234(field1053[--Statics.field14]);
            class27 var28 = client.method266().method6013();
            if (var28 == null) {
                field1053[++Statics.field14 - 1] = -1;
                field1053[++Statics.field14 - 1] = -1;
                return 1;
            }
            class234 var29 = var28.method291(var27.field2637, var27.field2638);
            if (var29 == null) {
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = var29.method4313();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field14 -= 2;
            int var30 = field1053[Statics.field14];
            class234 var31 = new class234(field1053[Statics.field14 + 1]);
            method641(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field14 -= 2;
            int var32 = field1053[Statics.field14];
            class234 var33 = new class234(field1053[Statics.field14 + 1]);
            method641(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field14 -= 2;
            int var34 = field1053[Statics.field14];
            class234 var35 = new class234(field1053[Statics.field14 + 1]);
            class27 var36 = client.method266().method5873(var34);
            if (var36 == null) {
                field1053[++Statics.field14 - 1] = 0;
                return 1;
            } else {
                field1053[++Statics.field14 - 1] = var36.method342(var35.field2639, var35.field2637, var35.field2638) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1053[++Statics.field14 - 1] = client.method266().method5880();
            field1053[++Statics.field14 - 1] = client.method266().method5881();
            return 1;
        } else if (arg0 == 6623) {
            class234 var37 = new class234(field1053[--Statics.field14]);
            class27 var38 = client.method266().method5854(var37.field2639, var37.field2637, var37.field2638);
            if (var38 == null) {
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = var38.method293();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method266().method5882(field1053[--Statics.field14]);
            return 1;
        } else if (arg0 == 6625) {
            client.method266().method5883();
            return 1;
        } else if (arg0 == 6626) {
            client.method266().method5872(field1053[--Statics.field14]);
            return 1;
        } else if (arg0 == 6627) {
            client.method266().method5947();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1053[--Statics.field14] == 1;
            client.method266().method5900(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1053[--Statics.field14];
            client.method266().method5887(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1053[--Statics.field14];
            client.method266().method5888(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method266().method5920();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1053[--Statics.field14] == 1;
            client.method266().method5890(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field14 -= 2;
            int var43 = field1053[Statics.field14];
            boolean var44 = field1053[Statics.field14 + 1] == 1;
            client.method266().method5891(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field14 -= 2;
            int var45 = field1053[Statics.field14];
            boolean var46 = field1053[Statics.field14 + 1] == 1;
            client.method266().method5892(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1053[++Statics.field14 - 1] = client.method266().method5893() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = client.method266().method5894(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1053[--Statics.field14];
            field1053[++Statics.field14 - 1] = client.method266().method5895(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field14 -= 2;
            int var49 = field1053[Statics.field14];
            class234 var50 = new class234(field1053[Statics.field14 + 1]);
            class234 var51 = client.method266().method5850(var49, var50);
            if (var51 == null) {
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = var51.method4313();
            }
            return 1;
        } else if (arg0 == 6639) {
            class35 var52 = client.method266().method5907();
            if (var52 == null) {
                field1053[++Statics.field14 - 1] = -1;
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = var52.method185();
                field1053[++Statics.field14 - 1] = var52.field289.method4313();
            }
            return 1;
        } else if (arg0 == 6640) {
            class35 var53 = client.method266().method5901();
            if (var53 == null) {
                field1053[++Statics.field14 - 1] = -1;
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = var53.method185();
                field1053[++Statics.field14 - 1] = var53.field289.method4313();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1053[--Statics.field14];
            class262 var55 = class262.method106(var54);
            if (var55.field3315 == null) {
                field1054[++Statics.field3838 - 1] = "";
            } else {
                field1054[++Statics.field3838 - 1] = var55.field3315;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1053[--Statics.field14];
            class262 var57 = class262.method106(var56);
            field1053[++Statics.field14 - 1] = var57.field3317;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1053[--Statics.field14];
            class262 var59 = class262.method106(var58);
            if (var59 == null) {
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = var59.field3329;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1053[--Statics.field14];
            class262 var61 = class262.method106(var60);
            if (var61 == null) {
                field1053[++Statics.field14 - 1] = -1;
            } else {
                field1053[++Statics.field14 - 1] = var61.field3313;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1053[++Statics.field14 - 1] = Statics.field2057.field350;
            return 1;
        } else if (arg0 == 6698) {
            field1053[++Statics.field14 - 1] = Statics.field2057.field343.method4313();
            return 1;
        } else if (arg0 == 6699) {
            field1053[++Statics.field14 - 1] = Statics.field2057.field344.method4313();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.ay(II)V")
    public static void method733(int arg0) {
        if (arg0 == -1 || !class238.method501(arg0)) {
            return;
        }
        class238[] var1 = Statics.field2357[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class238 var3 = var1[var2];
            if (var3.field2688 != null) {
                class63 var4 = new class63();
                var4.field559 = var3;
                var4.field560 = var3.field2688;
                method1046(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("ae.az(ILho;ZI)V")
    public static void method641(int arg0, class234 arg1, boolean arg2) {
        class27 var3 = client.method266().method5873(arg0);
        int var4 = Statics.field218.field614;
        int var5 = (Statics.field218.field949 >> 7) + Statics.field512;
        int var6 = (Statics.field218.field922 >> 7) + Statics.field318;
        class234 var7 = new class234(var4, var5, var6);
        client.method266().method5861(var3, var7, arg1, arg2);
    }
}
