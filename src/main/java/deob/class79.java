package deob;

import java.util.Calendar;

@ObfuscatedName("cw")
public class class79 {

    @ObfuscatedName("cw.g")
    public static int[] field932 = new int[5];

    @ObfuscatedName("cw.h")
    public static int[][] field941 = new int[5][5000];

    @ObfuscatedName("cw.n")
    public static int[] field937 = new int[1000];

    @ObfuscatedName("cw.m")
    public static String[] field938 = new String[1000];

    @ObfuscatedName("cw.c")
    public static int field940 = 0;

    @ObfuscatedName("cw.j")
    public static class72[] field930 = new class72[50];

    @ObfuscatedName("cw.z")
    public static Calendar field943 = Calendar.getInstance();

    @ObfuscatedName("cw.i")
    public static final String[] field948 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cw.w")
    public static boolean field945 = false;

    @ObfuscatedName("cw.s")
    public static boolean field947 = false;

    @ObfuscatedName("cw.y")
    public static int field951 = 0;

    @ObfuscatedName("cw.ag")
    public static final double field935 = Math.log(2.0D);

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.f(Lcj;I)V")
    public static void method179(class96 arg0) {
        method3192(arg0, 500000, 475000);
    }

    @ObfuscatedName("fh.o(Lcj;IIB)V")
    public static void method3192(class96 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1157;
        class87 var5;
        if (class378.method5604(arg0.field1156)) {
            Statics.field1407 = (class167) var3[0];
            class280 var4 = class280.method4995(Statics.field1407.field1781);
            var5 = class87.method1806(arg0.field1156, var4.field3405, var4.field3409);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class87.method199(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field130 = 0;
        Statics.field939 = 0;
        int var7 = -1;
        int[] var8 = var5.field1060;
        int[] var9 = var5.field1064;
        byte var10 = -1;
        field940 = 0;
        field945 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field574 = new int[var5.field1063];
            int var13 = 0;
            Statics.field934 = new String[var5.field1067];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1148;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1150;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1147 == null ? -1 : arg0.field1147.field2703;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1153;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1147 == null ? -1 : arg0.field1147.field2626;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1151 == null ? -1 : arg0.field1151.field2703;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1151 == null ? -1 : arg0.field1151.field2626;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1146;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1152;
                    }
                    Statics.field574[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1154;
                    }
                    Statics.field934[var14++] = var17;
                }
            }
            field951 = arg0.field1155;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var57 = var8[var7];
                if (var57 >= 100) {
                    boolean var47;
                    if (var5.field1064[var7] == 1) {
                        var47 = true;
                    } else {
                        var47 = false;
                    }
                    int var48 = method3721(var57, var5, var47);
                    switch(var48) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var57 == 0) {
                    field937[++Statics.field130 - 1] = var9[var7];
                } else if (var57 == 1) {
                    int var18 = var9[var7];
                    field937[++Statics.field130 - 1] = class220.field2578[var18];
                } else if (var57 == 2) {
                    int var19 = var9[var7];
                    class220.field2578[var19] = field937[--Statics.field130];
                    client.method207(var19);
                } else if (var57 == 3) {
                    field938[++Statics.field939 - 1] = var5.field1062[var7];
                } else if (var57 == 6) {
                    var7 += var9[var7];
                } else if (var57 == 7) {
                    Statics.field130 -= 2;
                    if (field937[Statics.field130] != field937[Statics.field130 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 8) {
                    Statics.field130 -= 2;
                    if (field937[Statics.field130] == field937[Statics.field130 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 9) {
                    Statics.field130 -= 2;
                    if (field937[Statics.field130] < field937[Statics.field130 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 10) {
                    Statics.field130 -= 2;
                    if (field937[Statics.field130] > field937[Statics.field130 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 21) {
                    if (field940 == 0) {
                        return;
                    }
                    class72 var20 = field930[--field940];
                    var5 = var20.field577;
                    var8 = var5.field1060;
                    var9 = var5.field1064;
                    var7 = var20.field572;
                    Statics.field574 = var20.field579;
                    Statics.field934 = var20.field571;
                } else if (var57 == 25) {
                    int var21 = var9[var7];
                    field937[++Statics.field130 - 1] = class220.method29(var21);
                } else if (var57 == 27) {
                    int var22 = var9[var7];
                    class220.method5313(var22, field937[--Statics.field130]);
                } else if (var57 == 31) {
                    Statics.field130 -= 2;
                    if (field937[Statics.field130] <= field937[Statics.field130 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 32) {
                    Statics.field130 -= 2;
                    if (field937[Statics.field130] >= field937[Statics.field130 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 33) {
                    field937[++Statics.field130 - 1] = Statics.field574[var9[var7]];
                } else if (var57 == 34) {
                    Statics.field574[var9[var7]] = field937[--Statics.field130];
                } else if (var57 == 35) {
                    field938[++Statics.field939 - 1] = Statics.field934[var9[var7]];
                } else if (var57 == 36) {
                    Statics.field934[var9[var7]] = field938[--Statics.field939];
                } else if (var57 == 37) {
                    int var23 = var9[var7];
                    Statics.field939 -= var23;
                    String var24 = class303.method197(field938, Statics.field939, var23);
                    field938[++Statics.field939 - 1] = var24;
                } else if (var57 == 38) {
                    Statics.field130--;
                } else if (var57 == 39) {
                    Statics.field939--;
                } else if (var57 == 40) {
                    int var25 = var9[var7];
                    class87 var26 = class87.method199(var25);
                    int[] var27 = new int[var26.field1063];
                    String[] var28 = new String[var26.field1067];
                    for (int var29 = 0; var29 < var26.field1065; var29++) {
                        var27[var29] = field937[Statics.field130 - var26.field1065 + var29];
                    }
                    for (int var30 = 0; var30 < var26.field1058; var30++) {
                        var28[var30] = field938[Statics.field939 - var26.field1058 + var30];
                    }
                    Statics.field130 -= var26.field1065;
                    Statics.field939 -= var26.field1058;
                    class72 var31 = new class72();
                    var31.field577 = var5;
                    var31.field572 = var7;
                    var31.field579 = Statics.field574;
                    var31.field571 = Statics.field934;
                    field930[++field940 - 1] = var31;
                    var5 = var26;
                    var8 = var26.field1060;
                    var9 = var26.field1064;
                    var7 = -1;
                    Statics.field574 = var27;
                    Statics.field934 = var28;
                } else if (var57 == 42) {
                    field937[++Statics.field130 - 1] = Statics.field2038.method2041(var9[var7]);
                } else if (var57 == 43) {
                    Statics.field2038.method2038(var9[var7], field937[--Statics.field130]);
                } else if (var57 == 44) {
                    int var32 = var9[var7] >> 16;
                    int var33 = var9[var7] & 0xFFFF;
                    int var34 = field937[--Statics.field130];
                    if (var34 < 0 || var34 > 5000) {
                        throw new RuntimeException();
                    }
                    field932[var32] = var34;
                    byte var35 = -1;
                    if (var33 == 105) {
                        var35 = 0;
                    }
                    for (int var36 = 0; var36 < var34; var36++) {
                        field941[var32][var36] = var35;
                    }
                } else if (var57 == 45) {
                    int var37 = var9[var7];
                    int var38 = field937[--Statics.field130];
                    if (var38 < 0 || var38 >= field932[var37]) {
                        throw new RuntimeException();
                    }
                    field937[++Statics.field130 - 1] = field941[var37][var38];
                } else if (var57 == 46) {
                    int var39 = var9[var7];
                    Statics.field130 -= 2;
                    int var40 = field937[Statics.field130];
                    if (var40 < 0 || var40 >= field932[var39]) {
                        throw new RuntimeException();
                    }
                    field941[var39][var40] = field937[Statics.field130 + 1];
                } else if (var57 == 47) {
                    String var41 = Statics.field2038.method2008(var9[var7]);
                    if (var41 == null) {
                        var41 = class246.field2920;
                    }
                    field938[++Statics.field939 - 1] = var41;
                } else if (var57 == 48) {
                    Statics.field2038.method2007(var9[var7], field938[--Statics.field939]);
                } else if (var57 == 49) {
                    String var42 = Statics.field2038.method2006(var9[var7]);
                    field938[++Statics.field939 - 1] = var42;
                } else if (var57 == 50) {
                    Statics.field2038.method2023(var9[var7], field938[--Statics.field939]);
                } else if (var57 == 60) {
                    class360 var43 = var5.field1066[var9[var7]];
                    class350 var44 = (class350) var43.method5621((long) field937[--Statics.field130]);
                    if (var44 != null) {
                        var7 += var44.field3940;
                    }
                } else if (var57 == 74) {
                    Integer var45 = Statics.field155.method90(var9[var7]);
                    if (var45 == null) {
                        field937[++Statics.field130 - 1] = -1;
                    } else {
                        field937[++Statics.field130 - 1] = var45;
                    }
                } else if (var57 == 76) {
                    Integer var46 = Statics.field2592.method5317(var9[var7]);
                    if (var46 == null) {
                        field937[++Statics.field130 - 1] = -1;
                    } else {
                        field937[++Statics.field130 - 1] = var46;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var55) {
            var11 = true;
            StringBuilder var50 = new StringBuilder(30);
            var50.append("").append(var5.field3941).append(" ");
            for (int var51 = field940 - 1; var51 >= 0; var51--) {
                var50.append("").append(field930[var51].field577.field3941).append(" ");
            }
            var50.append("").append(var10);
            class405.method3718(var50.toString(), var55);
        } finally {
            if (field945) {
                field947 = true;
                client.method3928();
                field947 = false;
                field945 = false;
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class405.method3718("Warning: Script " + var5.field1059 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("hi.u(ILcc;ZI)I")
    public static int method3721(int arg0, class87 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method218(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2145(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method1977(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method200(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method4141(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method1830(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method2426(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method371(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method686(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method1872(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method550(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2145(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method1977(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method200(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method4141(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method1830(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method932(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method934(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method5196(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method5104(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method550(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method3191(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2922(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method3658(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method11(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return Statics.method4113(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method3720(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method1736(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method5835(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method1663(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return Statics.method76(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3855(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return Statics.method171(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method980(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method201(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method67(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method641(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method78(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method3812(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return Statics.method979(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method77(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method4376(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method153(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method4333(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method4475(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.p(ILcc;ZI)I")
    public static int method218(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field130 -= 3;
            int var3 = field937[Statics.field130];
            int var4 = field937[Statics.field130 + 1];
            int var5 = field937[Statics.field130 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class225 var6 = class225.method2354(var3);
            if (var6.field2757 == null) {
                var6.field2757 = new class225[var5 + 1];
            }
            if (var6.field2757.length <= var5) {
                class225[] var7 = new class225[var5 + 1];
                for (int var8 = 0; var8 < var6.field2757.length; var8++) {
                    var7[var8] = var6.field2757[var8];
                }
                var6.field2757 = var7;
            }
            if (var5 > 0 && var6.field2757[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class225 var9 = new class225();
            var9.field2627 = var4;
            var9.field2644 = var9.field2703 = var6.field2703;
            var9.field2626 = var5;
            var9.field2625 = true;
            var6.field2757[var5] = var9;
            if (arg2) {
                Statics.field906 = var9;
            } else {
                Statics.field36 = var9;
            }
            client.method213(var6);
            return 1;
        } else if (arg0 == 101) {
            class225 var10 = arg2 ? Statics.field906 : Statics.field36;
            class225 var11 = class225.method2354(var10.field2703);
            var11.field2757[var10.field2626] = null;
            client.method213(var11);
            return 1;
        } else if (arg0 == 102) {
            class225 var12 = class225.method2354(field937[--Statics.field130]);
            var12.field2757 = null;
            client.method213(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field130 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field130--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field130 -= 2;
            int var13 = field937[Statics.field130];
            int var14 = field937[Statics.field130 + 1];
            class225 var15 = class225.method3833(var13, var14);
            if (var15 == null || var14 == -1) {
                field937[++Statics.field130 - 1] = 0;
            } else {
                field937[++Statics.field130 - 1] = 1;
                if (arg2) {
                    Statics.field906 = var15;
                } else {
                    Statics.field36 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class225 var16 = class225.method2354(field937[--Statics.field130]);
            if (var16 == null) {
                field937[++Statics.field130 - 1] = 0;
            } else {
                field937[++Statics.field130 - 1] = 1;
                if (arg2) {
                    Statics.field906 = var16;
                } else {
                    Statics.field36 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field937[Statics.field130 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field937[--Statics.field130 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dh.b(ILcc;ZI)I")
    public static int method2145(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class225 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field937[--Statics.field130];
            var4 = class225.method2354(var3);
        } else {
            var4 = arg2 ? Statics.field906 : Statics.field36;
        }
        if (arg0 == 1000) {
            Statics.field130 -= 4;
            var4.field2634 = field937[Statics.field130];
            var4.field2669 = field937[Statics.field130 + 1];
            var4.field2630 = field937[Statics.field130 + 2];
            var4.field2739 = field937[Statics.field130 + 3];
            client.method213(var4);
            Statics.field75.method997(var4);
            if (var3 != -1 && var4.field2627 == 0) {
                client.method5183(Statics.field2618[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field130 -= 4;
            var4.field2636 = field937[Statics.field130];
            var4.field2676 = field937[Statics.field130 + 1];
            var4.field2768 = field937[Statics.field130 + 2];
            var4.field2633 = field937[Statics.field130 + 3];
            client.method213(var4);
            Statics.field75.method997(var4);
            if (var3 != -1 && var4.field2627 == 0) {
                client.method5183(Statics.field2618[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field937[--Statics.field130] == 1;
            if (var4.field2645 != var5) {
                var4.field2645 = var5;
                client.method213(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2638 = field937[--Statics.field130] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2742 = field937[--Statics.field130] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dy.e(ILcc;ZI)I")
    public static int method1977(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class225 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field937[--Statics.field130];
            var4 = class225.method2354(var3);
        } else {
            var4 = arg2 ? Statics.field906 : Statics.field36;
        }
        if (arg0 == 1100) {
            Statics.field130 -= 2;
            var4.field2646 = field937[Statics.field130];
            if (var4.field2646 > var4.field2720 - var4.field2640) {
                var4.field2646 = var4.field2720 - var4.field2640;
            }
            if (var4.field2646 < 0) {
                var4.field2646 = 0;
            }
            var4.field2647 = field937[Statics.field130 + 1];
            if (var4.field2647 > var4.field2649 - var4.field2641) {
                var4.field2647 = var4.field2649 - var4.field2641;
            }
            if (var4.field2647 < 0) {
                var4.field2647 = 0;
            }
            client.method213(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2659 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2672 = field937[--Statics.field130] == 1;
            client.method213(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2688 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2658 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2637 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2662 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2663 = field937[--Statics.field130] == 1;
            client.method213(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2668 = 1;
            var4.field2695 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field130 -= 6;
            var4.field2716 = field937[Statics.field130];
            var4.field2675 = field937[Statics.field130 + 1];
            var4.field2723 = field937[Statics.field130 + 2];
            var4.field2677 = field937[Statics.field130 + 3];
            var4.field2694 = field937[Statics.field130 + 4];
            var4.field2679 = field937[Statics.field130 + 5];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field937[--Statics.field130];
            if (var4.field2624 != var5) {
                var4.field2624 = var5;
                var4.field2706 = 0;
                var4.field2756 = 0;
                client.method213(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2682 = field937[--Statics.field130] == 1;
            client.method213(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field938[--Statics.field939];
            if (!var6.equals(var4.field2686)) {
                var4.field2686 = var6;
                client.method213(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2685 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field130 -= 3;
            var4.field2689 = field937[Statics.field130];
            var4.field2690 = field937[Statics.field130 + 1];
            var4.field2712 = field937[Statics.field130 + 2];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2691 = field937[--Statics.field130] == 1;
            client.method213(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2664 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2665 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2745 = field937[--Statics.field130] == 1;
            client.method213(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2763 = field937[--Statics.field130] == 1;
            client.method213(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field130 -= 2;
            var4.field2720 = field937[Statics.field130];
            var4.field2649 = field937[Statics.field130 + 1];
            client.method213(var4);
            if (var3 != -1 && var4.field2627 == 0) {
                client.method5183(Statics.field2618[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method339(var4.field2703, var4.field2626);
            client.field640 = var4;
            client.method213(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2661 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2651 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2657 = field937[--Statics.field130];
            client.method213(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field937[--Statics.field130];
            class393 var8 = (class393) class267.method2139(class393.method5020(), var7);
            if (var8 != null) {
                var4.field2655 = var8;
                client.method213(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field937[--Statics.field130] == 1;
            var4.field2728 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field937[--Statics.field130] == 1;
            var4.field2683 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field130 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("s.k(ILcc;ZB)I")
    public static int method200(int arg0, class87 arg1, boolean arg2) {
        class225 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class225.method2354(field937[--Statics.field130]);
        } else {
            var3 = arg2 ? Statics.field906 : Statics.field36;
        }
        client.method213(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field130 -= 2;
            int var4 = field937[Statics.field130];
            int var5 = field937[Statics.field130 + 1];
            var3.field2753 = var4;
            var3.field2754 = var5;
            class296 var6 = class296.method194(var4);
            var3.field2723 = var6.field3679;
            var3.field2677 = var6.field3650;
            var3.field2694 = var6.field3658;
            var3.field2716 = var6.field3662;
            var3.field2675 = var6.field3660;
            var3.field2679 = var6.field3655;
            if (arg0 == 1205) {
                var3.field2666 = 0;
            } else if (arg0 == 1212 | var6.field3661 == 1) {
                var3.field2666 = 1;
            } else {
                var3.field2666 = 2;
            }
            if (var3.field2721 > 0) {
                var3.field2679 = var3.field2679 * 32 / var3.field2721;
            } else if (var3.field2636 > 0) {
                var3.field2679 = var3.field2679 * 32 / var3.field2636;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2668 = 2;
            var3.field2695 = field937[--Statics.field130];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2668 = 3;
            var3.field2695 = Statics.field1374.field1166.method3689();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jb.g(ILcc;ZI)I")
    public static int method4141(int arg0, class87 arg1, boolean arg2) {
        boolean var3 = true;
        class225 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class225.method2354(field937[--Statics.field130]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field906 : Statics.field36;
        }
        if (arg0 == 1300) {
            int var5 = field937[--Statics.field130] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3764(var5, field938[--Statics.field939]);
                return 1;
            } else {
                Statics.field939--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field130 -= 2;
            int var6 = field937[Statics.field130];
            int var7 = field937[Statics.field130 + 1];
            var4.field2701 = class225.method3833(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2680 = field937[--Statics.field130] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2707 = field937[--Statics.field130];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2708 = field937[--Statics.field130];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2704 = field938[--Statics.field939];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2751 = field938[--Statics.field939];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2705 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2769 = field937[--Statics.field130] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field130--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field130 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field937[Statics.field130 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field937[Statics.field130 + var10];
                        var9[var10 / 2] = (byte) field937[Statics.field130 + var10 + 1];
                    }
                }
            } else {
                Statics.field130 -= 2;
                var8 = new byte[] { (byte) field937[Statics.field130] };
                var9 = new byte[] { (byte) field937[Statics.field130 + 1] };
            }
            int var11 = field937[--Statics.field130] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method966(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field130 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field937[Statics.field130] };
            byte[] var14 = new byte[] { (byte) field937[Statics.field130 + 1] };
            method966(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field130 -= 3;
            int var15 = field937[Statics.field130] - 1;
            int var16 = field937[Statics.field130 + 1];
            int var17 = field937[Statics.field130 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            Statics.method31(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field937[--Statics.field130];
            int var20 = field937[--Statics.field130];
            Statics.method31(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field130--;
            int var21 = field937[Statics.field130] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method3867(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method3867(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bm.h(Lhu;I[B[BI)V")
    public static final void method966(class225 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2700 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2700 = new byte[11][];
            arg0.field2748 = new byte[11][];
            arg0.field2702 = new int[11];
            arg0.field2693 = new int[11];
        }
        arg0.field2700[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2699 = false;
            for (int var4 = 0; var4 < arg0.field2700.length; var4++) {
                if (arg0.field2700[var4] != null) {
                    arg0.field2699 = true;
                    break;
                }
            }
        } else {
            arg0.field2699 = true;
        }
        arg0.field2748[arg1] = arg3;
    }

    @ObfuscatedName("iq.l(Lhu;II)V")
    public static final void method3867(class225 arg0, int arg1) {
        if (arg0.field2700 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2654 == null) {
            arg0.field2654 = new int[arg0.field2700.length];
        }
        arg0.field2654[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("cv.m(ILcc;ZI)I")
    public static int method1830(int arg0, class87 arg1, boolean arg2) {
        class225 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class225.method2354(field937[--Statics.field130]);
        } else {
            var3 = arg2 ? Statics.field906 : Statics.field36;
        }
        String var4 = field938[--Statics.field939];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field937[--Statics.field130];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field937[--Statics.field130];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field938[--Statics.field939];
            } else {
                var7[var8] = Integer.valueOf(field937[--Statics.field130]);
            }
        }
        int var9 = field937[--Statics.field130];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2713 = var7;
        } else if (arg0 == 1401) {
            var3.field2738 = var7;
        } else if (arg0 == 1402) {
            var3.field2715 = var7;
        } else if (arg0 == 1403) {
            var3.field2767 = var7;
        } else if (arg0 == 1404) {
            var3.field2719 = var7;
        } else if (arg0 == 1405) {
            var3.field2727 = var7;
        } else if (arg0 == 1406) {
            var3.field2762 = var7;
        } else if (arg0 == 1407) {
            var3.field2724 = var7;
            var3.field2725 = var5;
        } else if (arg0 == 1408) {
            var3.field2709 = var7;
        } else if (arg0 == 1409) {
            var3.field2731 = var7;
        } else if (arg0 == 1410) {
            var3.field2631 = var7;
        } else if (arg0 == 1411) {
            var3.field2667 = var7;
        } else if (arg0 == 1412) {
            var3.field2718 = var7;
        } else if (arg0 == 1414) {
            var3.field2632 = var7;
            var3.field2684 = var5;
        } else if (arg0 == 1415) {
            var3.field2741 = var7;
            var3.field2729 = var5;
        } else if (arg0 == 1416) {
            var3.field2711 = var7;
        } else if (arg0 == 1417) {
            var3.field2732 = var7;
        } else if (arg0 == 1418) {
            var3.field2698 = var7;
        } else if (arg0 == 1419) {
            var3.field2734 = var7;
        } else if (arg0 == 1420) {
            var3.field2735 = var7;
        } else if (arg0 == 1421) {
            var3.field2650 = var7;
        } else if (arg0 == 1422) {
            var3.field2714 = var7;
        } else if (arg0 == 1423) {
            var3.field2766 = var7;
        } else if (arg0 == 1424) {
            var3.field2648 = var7;
        } else if (arg0 == 1425) {
            var3.field2743 = var7;
        } else if (arg0 == 1426) {
            var3.field2744 = var7;
        } else if (arg0 == 1427) {
            var3.field2678 = var7;
        } else if (arg0 == 1428) {
            var3.field2737 = var7;
        } else if (arg0 == 1429) {
            var3.field2656 = var7;
        } else {
            return 2;
        }
        var3.field2736 = true;
        return 1;
    }

    @ObfuscatedName("eq.d(ILcc;ZI)I")
    public static int method2426(int arg0, class87 arg1, boolean arg2) {
        class225 var3 = arg2 ? Statics.field906 : Statics.field36;
        if (arg0 == 1500) {
            field937[++Statics.field130 - 1] = var3.field2642;
            return 1;
        } else if (arg0 == 1501) {
            field937[++Statics.field130 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 1502) {
            field937[++Statics.field130 - 1] = var3.field2640;
            return 1;
        } else if (arg0 == 1503) {
            field937[++Statics.field130 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 1504) {
            field937[++Statics.field130 - 1] = var3.field2645 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field937[++Statics.field130 - 1] = var3.field2644;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.c(ILcc;ZS)I")
    public static int method371(int arg0, class87 arg1, boolean arg2) {
        class225 var3 = arg2 ? Statics.field906 : Statics.field36;
        if (arg0 == 1600) {
            field937[++Statics.field130 - 1] = var3.field2646;
            return 1;
        } else if (arg0 == 1601) {
            field937[++Statics.field130 - 1] = var3.field2647;
            return 1;
        } else if (arg0 == 1602) {
            field938[++Statics.field939 - 1] = var3.field2686;
            return 1;
        } else if (arg0 == 1603) {
            field937[++Statics.field130 - 1] = var3.field2720;
            return 1;
        } else if (arg0 == 1604) {
            field937[++Statics.field130 - 1] = var3.field2649;
            return 1;
        } else if (arg0 == 1605) {
            field937[++Statics.field130 - 1] = var3.field2679;
            return 1;
        } else if (arg0 == 1606) {
            field937[++Statics.field130 - 1] = var3.field2723;
            return 1;
        } else if (arg0 == 1607) {
            field937[++Statics.field130 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 1608) {
            field937[++Statics.field130 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 1609) {
            field937[++Statics.field130 - 1] = var3.field2688;
            return 1;
        } else if (arg0 == 1610) {
            field937[++Statics.field130 - 1] = var3.field2657;
            return 1;
        } else if (arg0 == 1611) {
            field937[++Statics.field130 - 1] = var3.field2659;
            return 1;
        } else if (arg0 == 1612) {
            field937[++Statics.field130 - 1] = var3.field2651;
            return 1;
        } else if (arg0 == 1613) {
            field937[++Statics.field130 - 1] = var3.field2655.method240();
            return 1;
        } else if (arg0 == 1614) {
            field937[++Statics.field130 - 1] = var3.field2683 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field130++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.j(ILcc;ZB)I")
    public static int method686(int arg0, class87 arg1, boolean arg2) {
        class225 var3 = arg2 ? Statics.field906 : Statics.field36;
        if (arg0 == 1700) {
            field937[++Statics.field130 - 1] = var3.field2753;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2753 == -1) {
                field937[++Statics.field130 - 1] = 0;
            } else {
                field937[++Statics.field130 - 1] = var3.field2754;
            }
            return 1;
        } else if (arg0 == 1702) {
            field937[++Statics.field130 - 1] = var3.field2626;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cs.r(ILcc;ZI)I")
    public static int method1872(int arg0, class87 arg1, boolean arg2) {
        class225 var3 = arg2 ? Statics.field906 : Statics.field36;
        if (arg0 == 1800) {
            field937[++Statics.field130 - 1] = class226.method3716(client.method3830(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field937[--Statics.field130];
            int var5 = var4 - 1;
            if (var3.field2705 == null || var5 >= var3.field2705.length || var3.field2705[var5] == null) {
                field938[++Statics.field939 - 1] = "";
            } else {
                field938[++Statics.field939 - 1] = var3.field2705[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2704 == null) {
                field938[++Statics.field939 - 1] = "";
            } else {
                field938[++Statics.field939 - 1] = var3.field2704;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ar.q(ILcc;ZI)I")
    public static int method550(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field951 >= 10) {
                throw new RuntimeException();
            }
            class225 var8;
            if (arg0 >= 2000) {
                var8 = class225.method2354(field937[--Statics.field130]);
            } else {
                var8 = arg2 ? Statics.field906 : Statics.field36;
            }
            if (var8.field2678 == null) {
                return 0;
            }
            class96 var9 = new class96();
            var9.field1147 = var8;
            var9.field1157 = var8.field2678;
            var9.field1155 = field951 + 1;
            client.field806.method4155(var9);
            return 1;
        } else if (arg0 == 1928) {
            class225 var3 = arg2 ? Statics.field906 : Statics.field36;
            int var4 = field937[--Statics.field130];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            client.method5788(var4, var3.field2703, var3.field2626, var3.field2753, "");
            return 1;
        } else if (arg0 == 2928) {
            Statics.field130 -= 3;
            int var5 = field937[Statics.field130];
            int var6 = field937[Statics.field130 + 1];
            int var7 = field937[Statics.field130 + 2];
            if (var7 < 1 || var7 > 10) {
                throw new RuntimeException();
            }
            client.method5788(var7, var5, var6, class225.method2354(var5).field2753, "");
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.t(ILcc;ZI)I")
    public static int method932(int arg0, class87 arg1, boolean arg2) {
        class225 var3 = class225.method2354(field937[--Statics.field130]);
        if (arg0 == 2500) {
            field937[++Statics.field130 - 1] = var3.field2642;
            return 1;
        } else if (arg0 == 2501) {
            field937[++Statics.field130 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 2502) {
            field937[++Statics.field130 - 1] = var3.field2640;
            return 1;
        } else if (arg0 == 2503) {
            field937[++Statics.field130 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 2504) {
            field937[++Statics.field130 - 1] = var3.field2645 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field937[++Statics.field130 - 1] = var3.field2644;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bd.v(ILcc;ZI)I")
    public static int method934(int arg0, class87 arg1, boolean arg2) {
        class225 var3 = class225.method2354(field937[--Statics.field130]);
        if (arg0 == 2600) {
            field937[++Statics.field130 - 1] = var3.field2646;
            return 1;
        } else if (arg0 == 2601) {
            field937[++Statics.field130 - 1] = var3.field2647;
            return 1;
        } else if (arg0 == 2602) {
            field938[++Statics.field939 - 1] = var3.field2686;
            return 1;
        } else if (arg0 == 2603) {
            field937[++Statics.field130 - 1] = var3.field2720;
            return 1;
        } else if (arg0 == 2604) {
            field937[++Statics.field130 - 1] = var3.field2649;
            return 1;
        } else if (arg0 == 2605) {
            field937[++Statics.field130 - 1] = var3.field2679;
            return 1;
        } else if (arg0 == 2606) {
            field937[++Statics.field130 - 1] = var3.field2723;
            return 1;
        } else if (arg0 == 2607) {
            field937[++Statics.field130 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 2608) {
            field937[++Statics.field130 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 2609) {
            field937[++Statics.field130 - 1] = var3.field2688;
            return 1;
        } else if (arg0 == 2610) {
            field937[++Statics.field130 - 1] = var3.field2657;
            return 1;
        } else if (arg0 == 2611) {
            field937[++Statics.field130 - 1] = var3.field2659;
            return 1;
        } else if (arg0 == 2612) {
            field937[++Statics.field130 - 1] = var3.field2651;
            return 1;
        } else if (arg0 == 2613) {
            field937[++Statics.field130 - 1] = var3.field2655.method240();
            return 1;
        } else if (arg0 == 2614) {
            field937[++Statics.field130 - 1] = var3.field2683 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field130++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lg.x(ILcc;ZI)I")
    public static int method5196(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class225 var3 = class225.method2354(field937[--Statics.field130]);
            field937[++Statics.field130 - 1] = var3.field2753;
            return 1;
        } else if (arg0 == 2701) {
            class225 var4 = class225.method2354(field937[--Statics.field130]);
            if (var4.field2753 == -1) {
                field937[++Statics.field130 - 1] = 0;
            } else {
                field937[++Statics.field130 - 1] = var4.field2754;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field937[--Statics.field130];
            class95 var6 = (class95) client.field764.method5638((long) var5);
            if (var6 == null) {
                field937[++Statics.field130 - 1] = 0;
            } else {
                field937[++Statics.field130 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field937[++Statics.field130 - 1] = client.field763;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ll.z(ILcc;ZI)I")
    public static int method5104(int arg0, class87 arg1, boolean arg2) {
        class225 var3 = class225.method2354(field937[--Statics.field130]);
        if (arg0 == 2800) {
            field937[++Statics.field130 - 1] = class226.method3716(client.method3830(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field937[--Statics.field130];
            int var5 = var4 - 1;
            if (var3.field2705 == null || var5 >= var3.field2705.length || var3.field2705[var5] == null) {
                field938[++Statics.field939 - 1] = "";
            } else {
                field938[++Statics.field939 - 1] = var3.field2705[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2704 == null) {
                field938[++Statics.field939 - 1] = "";
            } else {
                field938[++Statics.field939 - 1] = var3.field2704;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fh.i(ILcc;ZI)I")
    public static int method3191(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field938[--Statics.field939];
            class111.method930(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field130 -= 2;
            client.method215(Statics.field1374, field937[Statics.field130], field937[Statics.field130 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field947) {
                field945 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field938[--Statics.field939];
            int var5 = 0;
            if (class303.method2462(var4)) {
                var5 = class303.method931(var4);
            }
            class205 var6 = class205.method4631(class203.field2214, client.field649.field1385);
            var6.field2342.method5842(var5);
            client.field649.method2099(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field938[--Statics.field939];
            class205 var8 = class205.method4631(class203.field2244, client.field649.field1385);
            var8.field2342.method5839(var7.length() + 1);
            var8.field2342.method6016(var7);
            client.field649.method2099(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field938[--Statics.field939];
            class205 var10 = class205.method4631(class203.field2274, client.field649.field1385);
            var10.field2342.method5839(var9.length() + 1);
            var10.field2342.method6016(var9);
            client.field649.method2099(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field937[--Statics.field130];
            String var12 = field938[--Statics.field939];
            client.method692(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field130 -= 3;
            int var13 = field937[Statics.field130];
            int var14 = field937[Statics.field130 + 1];
            int var15 = field937[Statics.field130 + 2];
            class225 var16 = class225.method2354(var15);
            client.method659(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field130 -= 2;
            int var17 = field937[Statics.field130];
            int var18 = field937[Statics.field130 + 1];
            class225 var19 = arg2 ? Statics.field906 : Statics.field36;
            client.method659(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field360 = field937[--Statics.field130] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field937[++Statics.field130 - 1] = Statics.field988.field1311 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field988.field1311 = field937[--Statics.field130] == 1;
            class103.method964();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field938[--Statics.field939];
            boolean var21 = field937[--Statics.field130] == 1;
            class45.method4915(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field937[--Statics.field130];
            class205 var23 = class205.method4631(class203.field2305, client.field649.field1385);
            var23.field2342.method5853(var22);
            client.field649.method2099(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field937[--Statics.field130];
            Statics.field939 -= 2;
            String var25 = field938[Statics.field939];
            String var26 = field938[Statics.field939 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class205 var27 = class205.method4631(class203.field2307, client.field649.field1385);
                var27.field2342.method5853(1 + class382.method5070(var25) + class382.method5070(var26));
                var27.field2342.method5915(var24);
                var27.field2342.method6016(var26);
                var27.field2342.method6016(var25);
                client.field649.method2099(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field749 = field937[--Statics.field130] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field751 = field937[--Statics.field130] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field722 = field937[--Statics.field130] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field937[--Statics.field130] == 1) {
                client.field796 |= 0x1;
            } else {
                client.field796 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field937[--Statics.field130] == 1) {
                client.field796 |= 0x2;
            } else {
                client.field796 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field937[--Statics.field130] == 1) {
                client.field796 |= 0x4;
            } else {
                client.field796 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field937[--Statics.field130] == 1) {
                client.field796 |= 0x8;
            } else {
                client.field796 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field796 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field772 = field937[--Statics.field130] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field718 = field937[--Statics.field130] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method3427(field937[--Statics.field130] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field937[++Statics.field130 - 1] = client.method206() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field130 -= 2;
            client.field642 = field937[Statics.field130];
            client.field684 = field937[Statics.field130 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field130 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field130--;
            return 1;
        } else if (arg0 == 3132) {
            field937[++Statics.field130 - 1] = Statics.field1143;
            field937[++Statics.field130 - 1] = Statics.field320;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field130--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field130 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field765 = 3;
            client.field766 = field937[--Statics.field130];
            return 1;
        } else if (arg0 == 3137) {
            client.field765 = 2;
            client.field766 = field937[--Statics.field130];
            return 1;
        } else if (arg0 == 3138) {
            client.field765 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field765 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field765 = 3;
            client.field766 = arg2 ? Statics.field906.field2703 : Statics.field36.field2703;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field937[--Statics.field130] == 1;
            Statics.field988.field1298 = var28;
            class103.method964();
            return 1;
        } else if (arg0 == 3142) {
            field937[++Statics.field130 - 1] = Statics.field988.field1298 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field937[--Statics.field130] == 1;
            client.field638 = var29;
            if (!var29) {
                Statics.field988.field1300 = "";
                class103.method964();
            }
            return 1;
        } else if (arg0 == 3144) {
            field937[++Statics.field130 - 1] = client.field638 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field937[--Statics.field130] == 1;
            if (Statics.field988.field1301 == var30) {
                Statics.field988.field1301 = !var30;
                class103.method964();
            }
            return 1;
        } else if (arg0 == 3147) {
            field937[++Statics.field130 - 1] = Statics.field988.field1301 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field937[++Statics.field130 - 1] = class84.field1023;
            return 1;
        } else if (arg0 == 3154) {
            field937[++Statics.field130 - 1] = client.method196();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field939--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field130 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field130--;
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field130--;
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field939--;
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field130--;
            field938[++Statics.field939 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field130--;
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field130 -= 2;
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field130 -= 2;
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field130 -= 2;
            field938[++Statics.field939 - 1] = "";
            field938[++Statics.field939 - 1] = "";
            field938[++Statics.field939 - 1] = "";
            field938[++Statics.field939 - 1] = "";
            field938[++Statics.field939 - 1] = "";
            field938[++Statics.field939 - 1] = "";
            field938[++Statics.field939 - 1] = "";
            field938[++Statics.field939 - 1] = "";
            field938[++Statics.field939 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field130--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field130--;
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field130--;
            return 1;
        } else if (arg0 == 3175) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field939--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field939--;
            return 1;
        } else if (arg0 == 3181) {
            int var31 = 100 - Math.min(Math.max(field937[--Statics.field130], 0), 100);
            client.method1844((double) ((float) var31 / 200.0F + 0.5F));
            return 1;
        } else if (arg0 == 3182) {
            float var32 = ((float) Statics.field988.field1305 - 0.5F) * 200.0F;
            field937[++Statics.field130 - 1] = 100 - Math.round(var32);
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field130--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fx.a(ILcc;ZI)I")
    public static int method2922(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field130 -= 3;
            client.method3878(field937[Statics.field130], field937[Statics.field130 + 1], field937[Statics.field130 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method55(field937[--Statics.field130]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field130 -= 2;
            client.method1903(field937[Statics.field130], field937[Statics.field130 + 1]);
            return 1;
        } else if (arg0 == 3203) {
            int var3 = Math.min(Math.max(field937[--Statics.field130], 0), 100);
            client.method2081(Math.round((float) var3 * 2.55F));
            return 1;
        } else if (arg0 == 3204) {
            field937[++Statics.field130 - 1] = Math.round((float) Statics.field988.field1303 / 2.55F);
            return 1;
        } else if (arg0 == 3205) {
            int var4 = Math.min(Math.max(field937[--Statics.field130], 0), 100);
            client.method302(Math.round((float) var4 * 1.27F));
            return 1;
        } else if (arg0 == 3206) {
            field937[++Statics.field130 - 1] = Math.round((float) Statics.field988.field1307 / 1.27F);
            return 1;
        } else if (arg0 == 3207) {
            int var5 = Math.min(Math.max(field937[--Statics.field130], 0), 100);
            client.method3625(Math.round((float) var5 * 1.27F));
            return 1;
        } else if (arg0 == 3208) {
            field937[++Statics.field130 - 1] = Math.round((float) Statics.field988.field1308 / 1.27F);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hh.w(ILcc;ZI)I")
    public static int method3658(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field937[++Statics.field130 - 1] = client.field611;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field130 -= 2;
            int var3 = field937[Statics.field130];
            int var4 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = Statics.method1664(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field130 -= 2;
            int var5 = field937[Statics.field130];
            int var6 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = class93.method4139(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field130 -= 2;
            int var7 = field937[Statics.field130];
            int var8 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = class93.method3856(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = Statics.method3347(var9).field3397;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = client.field735[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = client.field737[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = client.field652[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field201;
            int var14 = (Statics.field1374.field1232 >> 7) + Statics.field1795;
            int var15 = (Statics.field1374.field1210 >> 7) + Statics.field1892;
            field937[++Statics.field130 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field937[++Statics.field130 - 1] = client.field599 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field130 -= 2;
            int var19 = field937[Statics.field130] + 32768;
            int var20 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = Statics.method1664(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field130 -= 2;
            int var21 = field937[Statics.field130] + 32768;
            int var22 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = class93.method4139(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field130 -= 2;
            int var23 = field937[Statics.field130] + 32768;
            int var24 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = class93.method3856(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field797 >= 2) {
                field937[++Statics.field130 - 1] = client.field797;
            } else {
                field937[++Statics.field130 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field937[++Statics.field130 - 1] = client.field618;
            return 1;
        } else if (arg0 == 3318) {
            field937[++Statics.field130 - 1] = client.field600;
            return 1;
        } else if (arg0 == 3321) {
            field937[++Statics.field130 - 1] = client.field626;
            return 1;
        } else if (arg0 == 3322) {
            field937[++Statics.field130 - 1] = client.field771;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field774) {
                field937[++Statics.field130 - 1] = 1;
            } else {
                field937[++Statics.field130 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field937[++Statics.field130 - 1] = client.field601;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field130 -= 4;
            int var25 = field937[Statics.field130];
            int var26 = field937[Statics.field130 + 1];
            int var27 = field937[Statics.field130 + 2];
            int var28 = field937[Statics.field130 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field937[++Statics.field130 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field937[++Statics.field130 - 1] = client.field876;
            return 1;
        } else if (arg0 == 3327) {
            field937[++Statics.field130 - 1] = client.field760;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.s(ILcc;ZI)I")
    public static int method11(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field130 -= 2;
            int var3 = field937[Statics.field130];
            int var4 = field937[Statics.field130 + 1];
            class285 var5 = class285.method2749(var3);
            if (var5.field3461 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3464; var6++) {
                if (var5.field3467[var6] == var4) {
                    field938[++Statics.field939 - 1] = var5.field3460[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field938[++Statics.field939 - 1] = var5.field3465;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field130 -= 4;
            int var7 = field937[Statics.field130];
            int var8 = field937[Statics.field130 + 1];
            int var9 = field937[Statics.field130 + 2];
            int var10 = field937[Statics.field130 + 3];
            class285 var11 = class285.method2749(var9);
            if (var11.field3458 != var7 || var11.field3461 != var8) {
                if (var8 == 115) {
                    field938[++Statics.field939 - 1] = class246.field2920;
                } else {
                    field937[++Statics.field130 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3464; var12++) {
                if (var11.field3467[var12] == var10) {
                    if (var8 == 115) {
                        field938[++Statics.field939 - 1] = var11.field3460[var12];
                    } else {
                        field937[++Statics.field130 - 1] = var11.field3466[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field938[++Statics.field939 - 1] = var11.field3465;
                } else {
                    field937[++Statics.field130 - 1] = var11.field3463;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field937[--Statics.field130];
            class285 var14 = class285.method2749(var13);
            field937[++Statics.field130 - 1] = var14.method4425();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hi.ac(ILcc;ZI)I")
    public static int method3720(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field130--;
            Statics.field939--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field130++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.ay(ILcc;ZI)I")
    public static int method1736(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field929 == null) {
                field937[++Statics.field130 - 1] = 0;
            } else {
                field937[++Statics.field130 - 1] = 1;
                Statics.field155 = Statics.field929;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field937[--Statics.field130];
            if (client.field832[var3] == null) {
                field937[++Statics.field130 - 1] = 0;
            } else {
                field937[++Statics.field130 - 1] = 1;
                Statics.field155 = client.field832[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field938[++Statics.field939 - 1] = Statics.field155.field82;
            return 1;
        } else if (arg0 == 3803) {
            field937[++Statics.field130 - 1] = Statics.field155.field91 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field937[++Statics.field130 - 1] = Statics.field155.field85;
            return 1;
        } else if (arg0 == 3805) {
            field937[++Statics.field130 - 1] = Statics.field155.field84;
            return 1;
        } else if (arg0 == 3806) {
            field937[++Statics.field130 - 1] = Statics.field155.field87;
            return 1;
        } else if (arg0 == 3807) {
            field937[++Statics.field130 - 1] = Statics.field155.field88;
            return 1;
        } else if (arg0 == 3809) {
            field937[++Statics.field130 - 1] = Statics.field155.field89;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field937[--Statics.field130];
            field938[++Statics.field939 - 1] = Statics.field155.field100[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = Statics.field155.field77[var5];
            return 1;
        } else if (arg0 == 3812) {
            field937[++Statics.field130 - 1] = Statics.field155.field98;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field937[--Statics.field130];
            field938[++Statics.field939 - 1] = Statics.field155.field106[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field130 -= 3;
            int var7 = field937[Statics.field130];
            int var8 = field937[Statics.field130 + 1];
            int var9 = field937[Statics.field130 + 2];
            field937[++Statics.field130 - 1] = Statics.field155.method89(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field937[++Statics.field130 - 1] = Statics.field155.field101;
            return 1;
        } else if (arg0 == 3816) {
            field937[++Statics.field130 - 1] = Statics.field155.field97;
            return 1;
        } else if (arg0 == 3817) {
            field937[++Statics.field130 - 1] = Statics.field155.method88(field938[--Statics.field939]);
            return 1;
        } else if (arg0 == 3818) {
            field937[Statics.field130 - 1] = Statics.field155.method105()[field937[Statics.field130 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field130 -= 2;
            int var10 = field937[Statics.field130];
            int var11 = field937[Statics.field130 + 1];
            client.method3404(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = Statics.field155.field95[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field130 -= 3;
                int var13 = field937[Statics.field130];
                boolean var14 = field937[Statics.field130 + 1] == 1;
                int var15 = field937[Statics.field130 + 2];
                client.method56(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field937[--Statics.field130];
                field937[++Statics.field130 - 1] = Statics.field155.field79[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field4267 == null) {
                    field937[++Statics.field130 - 1] = 0;
                } else {
                    field937[++Statics.field130 - 1] = 1;
                    Statics.field942 = Statics.field4267;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field937[--Statics.field130];
                if (client.field821[var17] == null) {
                    field937[++Statics.field130 - 1] = 0;
                } else {
                    field937[++Statics.field130 - 1] = 1;
                    Statics.field942 = client.field821[var17];
                    Statics.field198 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field938[++Statics.field939 - 1] = Statics.field942.field26;
                return 1;
            } else if (arg0 == 3853) {
                field937[++Statics.field130 - 1] = Statics.field942.field31;
                return 1;
            } else if (arg0 == 3854) {
                field937[++Statics.field130 - 1] = Statics.field942.field32;
                return 1;
            } else if (arg0 == 3855) {
                field937[++Statics.field130 - 1] = Statics.field942.method37();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field937[--Statics.field130];
                field938[++Statics.field939 - 1] = ((class10) Statics.field942.field28.get(var18)).field66;
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field937[--Statics.field130];
                field937[++Statics.field130 - 1] = ((class10) Statics.field942.field28.get(var19)).field67;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field937[--Statics.field130];
                field937[++Statics.field130 - 1] = ((class10) Statics.field942.field28.get(var20)).field65;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field937[--Statics.field130];
                client.method1654(Statics.field198, var21);
                return 1;
            } else if (arg0 == 3860) {
                field937[++Statics.field130 - 1] = Statics.field942.method34(field938[--Statics.field939]);
                return 1;
            } else if (arg0 == 3861) {
                field937[Statics.field130 - 1] = Statics.field942.method35()[field937[Statics.field130 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field937[++Statics.field130 - 1] = Statics.field2592 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("nk.am(ILcc;ZI)I")
    public static int method5835(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = client.field873[var3].method4077();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = client.field873[var4].field3327;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = client.field873[var5].field3329;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = client.field873[var6].field3330;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = client.field873[var7].field3331;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = client.field873[var8].field3332;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field937[--Statics.field130];
            int var10 = client.field873[var9].method4073();
            field937[++Statics.field130 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field937[--Statics.field130];
            int var12 = client.field873[var11].method4073();
            field937[++Statics.field130 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field937[--Statics.field130];
            int var14 = client.field873[var13].method4073();
            field937[++Statics.field130 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field937[--Statics.field130];
            int var16 = client.field873[var15].method4073();
            field937[++Statics.field130 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field937[--Statics.field130] == 1;
            if (Statics.field2790 != null) {
                Statics.field2790.method4029(class255.field3307, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field937[--Statics.field130] == 1;
            if (Statics.field2790 != null) {
                Statics.field2790.method4029(class255.field3306, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field130 -= 2;
            boolean var19 = field937[Statics.field130] == 1;
            boolean var20 = field937[Statics.field130 + 1] == 1;
            if (Statics.field2790 != null) {
                client.field773.field598 = var20;
                Statics.field2790.method4029(client.field773, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field937[--Statics.field130] == 1;
            if (Statics.field2790 != null) {
                Statics.field2790.method4029(class255.field3305, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field937[--Statics.field130] == 1;
            if (Statics.field2790 != null) {
                Statics.field2790.method4029(class255.field3304, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field937[++Statics.field130 - 1] = Statics.field2790 == null ? 0 : Statics.field2790.field3308.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field937[--Statics.field130];
            class261 var24 = (class261) Statics.field2790.field3308.get(var23);
            field937[++Statics.field130 - 1] = var24.field3322;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field937[--Statics.field130];
            class261 var26 = (class261) Statics.field2790.field3308.get(var25);
            field938[++Statics.field939 - 1] = var26.method4071();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field937[--Statics.field130];
            class261 var28 = (class261) Statics.field2790.field3308.get(var27);
            field938[++Statics.field939 - 1] = var28.method4064();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field937[--Statics.field130];
            class261 var30 = (class261) Statics.field2790.field3308.get(var29);
            long var31 = class379.method1540() - Statics.field1273 - var30.field3326;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field938[++Statics.field939 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field937[--Statics.field130];
            class261 var38 = (class261) Statics.field2790.field3308.get(var37);
            field937[++Statics.field130 - 1] = var38.field3324.field3330;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field937[--Statics.field130];
            class261 var40 = (class261) Statics.field2790.field3308.get(var39);
            field937[++Statics.field130 - 1] = var40.field3324.field3329;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field937[--Statics.field130];
            class261 var42 = (class261) Statics.field2790.field3308.get(var41);
            field937[++Statics.field130 - 1] = var42.field3324.field3327;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cp.ag(ILcc;ZI)I")
    public static int method1663(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field130 -= 2;
            int var3 = field937[Statics.field130];
            int var4 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field130 -= 2;
            int var5 = field937[Statics.field130];
            int var6 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field130 -= 2;
            int var7 = field937[Statics.field130];
            int var8 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field130 -= 2;
            int var9 = field937[Statics.field130];
            int var10 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field130 -= 5;
            int var13 = field937[Statics.field130];
            int var14 = field937[Statics.field130 + 1];
            int var15 = field937[Statics.field130 + 2];
            int var16 = field937[Statics.field130 + 3];
            int var17 = field937[Statics.field130 + 4];
            field937[++Statics.field130 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field130 -= 2;
            int var18 = field937[Statics.field130];
            int var19 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field130 -= 2;
            int var20 = field937[Statics.field130];
            int var21 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field130 -= 2;
            int var22 = field937[Statics.field130];
            int var23 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field130 -= 2;
            int var24 = field937[Statics.field130];
            int var25 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field130 -= 2;
            int var26 = field937[Statics.field130];
            int var27 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field130 -= 2;
            int var28 = field937[Statics.field130];
            int var29 = field937[Statics.field130 + 1];
            if (var28 == 0) {
                field937[++Statics.field130 - 1] = 0;
            } else {
                field937[++Statics.field130 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field130 -= 2;
            int var30 = field937[Statics.field130];
            int var31 = field937[Statics.field130 + 1];
            if (var30 == 0) {
                field937[++Statics.field130 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field937[++Statics.field130 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field937[++Statics.field130 - 1] = var30;
                    break;
                case 2:
                    field937[++Statics.field130 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field937[++Statics.field130 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field937[++Statics.field130 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field937[++Statics.field130 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field130 -= 2;
            int var32 = field937[Statics.field130];
            int var33 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field130 -= 2;
            int var34 = field937[Statics.field130];
            int var35 = field937[Statics.field130 + 1];
            field937[++Statics.field130 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field130 -= 3;
            long var36 = (long) field937[Statics.field130];
            long var38 = (long) field937[Statics.field130 + 1];
            long var40 = (long) field937[Statics.field130 + 2];
            field937[++Statics.field130 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ip.at(ILcc;ZI)I")
    public static int method3855(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field937[--Statics.field130];
            field938[++Statics.field939 - 1] = class296.method194(var3).field3691;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field130 -= 2;
            int var4 = field937[Statics.field130];
            int var5 = field937[Statics.field130 + 1];
            class296 var6 = class296.method194(var4);
            if (var5 < 1 || var5 > 5 || var6.field3664[var5 - 1] == null) {
                field938[++Statics.field939 - 1] = "";
            } else {
                field938[++Statics.field939 - 1] = var6.field3664[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field130 -= 2;
            int var7 = field937[Statics.field130];
            int var8 = field937[Statics.field130 + 1];
            class296 var9 = class296.method194(var7);
            if (var8 < 1 || var8 > 5 || var9.field3665[var8 - 1] == null) {
                field938[++Statics.field939 - 1] = "";
            } else {
                field938[++Statics.field939 - 1] = var9.field3665[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = class296.method194(var10).field3653;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = class296.method194(var11).field3661 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field937[--Statics.field130];
            class296 var13 = class296.method194(var12);
            if (var13.field3682 == -1 && var13.field3681 >= 0) {
                field937[++Statics.field130 - 1] = var13.field3681;
            } else {
                field937[++Statics.field130 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field937[--Statics.field130];
            class296 var15 = class296.method194(var14);
            if (var15.field3682 >= 0 && var15.field3681 >= 0) {
                field937[++Statics.field130 - 1] = var15.field3681;
            } else {
                field937[++Statics.field130 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = class296.method194(var16).field3663 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field937[--Statics.field130];
            class296 var18 = class296.method194(var17);
            if (var18.field3671 == -1 && var18.field3693 >= 0) {
                field937[++Statics.field130 - 1] = var18.field3693;
            } else {
                field937[++Statics.field130 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field937[--Statics.field130];
            class296 var20 = class296.method194(var19);
            if (var20.field3671 >= 0 && var20.field3693 >= 0) {
                field937[++Statics.field130 - 1] = var20.field3693;
            } else {
                field937[++Statics.field130 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field938[--Statics.field939];
            int var22 = field937[--Statics.field130];
            client.method2784(var21, var22 == 1);
            field937[++Statics.field130 - 1] = Statics.field1785;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field150 == null || Statics.field2339 >= Statics.field1785) {
                field937[++Statics.field130 - 1] = -1;
            } else {
                field937[++Statics.field130 - 1] = Statics.field150[++Statics.field2339 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field2339 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.aw(ILcc;ZB)I")
    public static int method980(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field937[++Statics.field130 - 1] = client.method2829();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field937[--Statics.field130];
            if (var3 == 1 || var3 == 2) {
                client.method2921(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field937[++Statics.field130 - 1] = Statics.field988.field1306;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field937[--Statics.field130];
            if (var4 == 1 || var4 == 2) {
                Statics.field988.field1306 = var4;
                class103.method964();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field130--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field939 -= 2;
            Statics.field130--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field939--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.ap(ILcc;ZI)I")
    public static int method201(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field130 -= 2;
            int var3 = field937[Statics.field130];
            int var4 = field937[Statics.field130 + 1];
            if (!client.field850) {
                client.field632 = var3;
                client.field673 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field937[++Statics.field130 - 1] = client.field632;
            return 1;
        } else if (arg0 == 5506) {
            field937[++Statics.field130 - 1] = client.field673;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field937[--Statics.field130];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field870 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field937[++Statics.field130 - 1] = client.field870;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.ax(ILcc;ZB)I")
    public static int method67(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field651 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field939 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field937[++Statics.field130 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dg.as(II)I")
    public static int method1980(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("bh.af(ILcc;ZI)I")
    public static int method641(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field130 -= 2;
            client.field856 = (short) method1980(field937[Statics.field130]);
            if (client.field856 <= 0) {
                client.field856 = 256;
            }
            client.field857 = (short) method1980(field937[Statics.field130 + 1]);
            if (client.field857 <= 0) {
                client.field857 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field130 -= 2;
            client.field683 = (short) field937[Statics.field130];
            if (client.field683 <= 0) {
                client.field683 = 256;
            }
            client.field859 = (short) field937[Statics.field130 + 1];
            if (client.field859 <= 0) {
                client.field859 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field130 -= 4;
            client.field860 = (short) field937[Statics.field130];
            if (client.field860 <= 0) {
                client.field860 = 1;
            }
            client.field743 = (short) field937[Statics.field130 + 1];
            if (client.field743 <= 0) {
                client.field743 = 32767;
            } else if (client.field743 < client.field860) {
                client.field743 = client.field860;
            }
            client.field708 = (short) field937[Statics.field130 + 2];
            if (client.field708 <= 0) {
                client.field708 = 1;
            }
            client.field863 = (short) field937[Statics.field130 + 3];
            if (client.field863 <= 0) {
                client.field863 = 32767;
            } else if (client.field863 < client.field708) {
                client.field863 = client.field708;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field775 == null) {
                field937[++Statics.field130 - 1] = -1;
                field937[++Statics.field130 - 1] = -1;
            } else {
                client.method5310(0, 0, client.field775.field2640, client.field775.field2641, false);
                field937[++Statics.field130 - 1] = client.field866;
                field937[++Statics.field130 - 1] = client.field603;
            }
            return 1;
        } else if (arg0 == 6204) {
            field937[++Statics.field130 - 1] = client.field683;
            field937[++Statics.field130 - 1] = client.field859;
            return 1;
        } else if (arg0 == 6205) {
            field937[++Statics.field130 - 1] = Statics.method1949(client.field856);
            field937[++Statics.field130 - 1] = Statics.method1949(client.field857);
            return 1;
        } else if (arg0 == 6220) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field937[++Statics.field130 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field937[++Statics.field130 - 1] = Statics.field1143;
            return 1;
        } else if (arg0 == 6223) {
            field937[++Statics.field130 - 1] = Statics.field320;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("n.ao(ILcc;ZI)I")
    public static int method78(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field937[++Statics.field130 - 1] = class76.method2785() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class76 var3 = class76.method4441();
            if (var3 == null) {
                field937[++Statics.field130 - 1] = -1;
                field937[++Statics.field130 - 1] = 0;
                field938[++Statics.field939 - 1] = "";
                field937[++Statics.field130 - 1] = 0;
                field937[++Statics.field130 - 1] = 0;
                field938[++Statics.field939 - 1] = "";
            } else {
                field937[++Statics.field130 - 1] = var3.field900;
                field937[++Statics.field130 - 1] = var3.field889;
                field938[++Statics.field939 - 1] = var3.field898;
                field937[++Statics.field130 - 1] = var3.field899;
                field937[++Statics.field130 - 1] = var3.field896;
                field938[++Statics.field939 - 1] = var3.field897;
            }
            return 1;
        } else if (arg0 == 6502) {
            class76 var4 = class76.method937();
            if (var4 == null) {
                field937[++Statics.field130 - 1] = -1;
                field937[++Statics.field130 - 1] = 0;
                field938[++Statics.field939 - 1] = "";
                field937[++Statics.field130 - 1] = 0;
                field937[++Statics.field130 - 1] = 0;
                field938[++Statics.field939 - 1] = "";
            } else {
                field937[++Statics.field130 - 1] = var4.field900;
                field937[++Statics.field130 - 1] = var4.field889;
                field938[++Statics.field939 - 1] = var4.field898;
                field937[++Statics.field130 - 1] = var4.field899;
                field937[++Statics.field130 - 1] = var4.field896;
                field938[++Statics.field939 - 1] = var4.field897;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field937[--Statics.field130];
            class76 var6 = null;
            for (int var7 = 0; var7 < class76.field892; var7++) {
                if (Statics.field69[var7].field900 == var5) {
                    var6 = Statics.field69[var7];
                    break;
                }
            }
            if (var6 == null) {
                field937[++Statics.field130 - 1] = -1;
                field937[++Statics.field130 - 1] = 0;
                field938[++Statics.field939 - 1] = "";
                field937[++Statics.field130 - 1] = 0;
                field937[++Statics.field130 - 1] = 0;
                field938[++Statics.field939 - 1] = "";
            } else {
                field937[++Statics.field130 - 1] = var6.field900;
                field937[++Statics.field130 - 1] = var6.field889;
                field938[++Statics.field939 - 1] = var6.field898;
                field937[++Statics.field130 - 1] = var6.field899;
                field937[++Statics.field130 - 1] = var6.field896;
                field938[++Statics.field939 - 1] = var6.field897;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field130 -= 4;
            int var8 = field937[Statics.field130];
            boolean var9 = field937[Statics.field130 + 1] == 1;
            int var10 = field937[Statics.field130 + 2];
            boolean var11 = field937[Statics.field130 + 3] == 1;
            class76.method2688(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field937[--Statics.field130];
            if (var12 >= 0 && var12 < class76.field892) {
                class76 var13 = Statics.field69[var12];
                field937[++Statics.field130 - 1] = var13.field900;
                field937[++Statics.field130 - 1] = var13.field889;
                field938[++Statics.field939 - 1] = var13.field898;
                field937[++Statics.field130 - 1] = var13.field899;
                field937[++Statics.field130 - 1] = var13.field896;
                field938[++Statics.field939 - 1] = var13.field897;
            } else {
                field937[++Statics.field130 - 1] = -1;
                field937[++Statics.field130 - 1] = 0;
                field938[++Statics.field939 - 1] = "";
                field937[++Statics.field130 - 1] = 0;
                field937[++Statics.field130 - 1] = 0;
                field938[++Statics.field939 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field862 = field937[--Statics.field130] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field130 -= 2;
            int var14 = field937[Statics.field130];
            int var15 = field937[Statics.field130 + 1];
            class292 var16 = class292.method2171(var15);
            if (var16.method4520()) {
                field938[++Statics.field939 - 1] = class287.method1652(var14).method4440(var15, var16.field3556);
            } else {
                field937[++Statics.field130 - 1] = class287.method1652(var14).method4439(var15, var16.field3553);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field130 -= 2;
            int var17 = field937[Statics.field130];
            int var18 = field937[Statics.field130 + 1];
            class292 var19 = class292.method2171(var18);
            if (var19.method4520()) {
                field938[++Statics.field939 - 1] = class295.method182(var17).method4608(var18, var19.field3556);
            } else {
                field937[++Statics.field130 - 1] = class295.method182(var17).method4607(var18, var19.field3553);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field130 -= 2;
            int var20 = field937[Statics.field130];
            int var21 = field937[Statics.field130 + 1];
            class292 var22 = class292.method2171(var21);
            if (var22.method4520()) {
                field938[++Statics.field939 - 1] = class296.method194(var20).method4667(var21, var22.field3556);
            } else {
                field937[++Statics.field130 - 1] = class296.method194(var20).method4666(var21, var22.field3553);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field130 -= 2;
            int var23 = field937[Statics.field130];
            int var24 = field937[Statics.field130 + 1];
            class292 var25 = class292.method2171(var24);
            if (var25.method4520()) {
                field938[++Statics.field939 - 1] = class293.method3426(var23).method4536(var24, var25.field3556);
            } else {
                field937[++Statics.field130 - 1] = class293.method3426(var23).method4557(var24, var25.field3553);
            }
            return 1;
        } else if (arg0 == 6518) {
            field937[++Statics.field130 - 1] = client.field607 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field937[++Statics.field130 - 1] = client.field619 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field939--;
            Statics.field130--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field939--;
            Statics.field130--;
            return 1;
        } else if (arg0 == 6524) {
            field937[++Statics.field130 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field937[++Statics.field130 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field937[++Statics.field130 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field937[++Statics.field130 - 1] = client.field606;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hz.ai(ILcc;ZB)I")
    public static int method3812(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field201;
            int var4 = (Statics.field1374.field1232 >> 7) + Statics.field1795;
            int var5 = (Statics.field1374.field1210 >> 7) + Statics.field1892;
            client.method1900().method5439(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field937[--Statics.field130];
            String var7 = "";
            class144 var8 = client.method1900().method5427(var6);
            if (var8 != null) {
                var7 = var8.method2446();
            }
            field938[++Statics.field939 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field937[--Statics.field130];
            client.method1900().method5561(var9);
            return 1;
        } else if (arg0 == 6603) {
            field937[++Statics.field130 - 1] = client.method1900().method5424();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field937[--Statics.field130];
            client.method1900().method5421(var10);
            return 1;
        } else if (arg0 == 6605) {
            field937[++Statics.field130 - 1] = client.method1900().method5426() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class221 var11 = new class221(field937[--Statics.field130]);
            client.method1900().method5428(var11.field2586, var11.field2588);
            return 1;
        } else if (arg0 == 6607) {
            class221 var12 = new class221(field937[--Statics.field130]);
            client.method1900().method5429(var12.field2586, var12.field2588);
            return 1;
        } else if (arg0 == 6608) {
            class221 var13 = new class221(field937[--Statics.field130]);
            client.method1900().method5576(var13.field2591, var13.field2586, var13.field2588);
            return 1;
        } else if (arg0 == 6609) {
            class221 var14 = new class221(field937[--Statics.field130]);
            client.method1900().method5461(var14.field2591, var14.field2586, var14.field2588);
            return 1;
        } else if (arg0 == 6610) {
            field937[++Statics.field130 - 1] = client.method1900().method5432();
            field937[++Statics.field130 - 1] = client.method1900().method5398();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field937[--Statics.field130];
            class144 var16 = client.method1900().method5427(var15);
            if (var16 == null) {
                field937[++Statics.field130 - 1] = 0;
            } else {
                field937[++Statics.field130 - 1] = var16.method2434().method3676();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field937[--Statics.field130];
            class144 var18 = client.method1900().method5427(var17);
            if (var18 == null) {
                field937[++Statics.field130 - 1] = 0;
                field937[++Statics.field130 - 1] = 0;
            } else {
                field937[++Statics.field130 - 1] = (var18.method2428() - var18.method2464() + 1) * 64;
                field937[++Statics.field130 - 1] = (var18.method2468() - var18.method2429() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field937[--Statics.field130];
            class144 var20 = client.method1900().method5427(var19);
            if (var20 == null) {
                field937[++Statics.field130 - 1] = 0;
                field937[++Statics.field130 - 1] = 0;
                field937[++Statics.field130 - 1] = 0;
                field937[++Statics.field130 - 1] = 0;
            } else {
                field937[++Statics.field130 - 1] = var20.method2464() * 64;
                field937[++Statics.field130 - 1] = var20.method2429() * 64;
                field937[++Statics.field130 - 1] = var20.method2428() * 64 + 64 - 1;
                field937[++Statics.field130 - 1] = var20.method2468() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field937[--Statics.field130];
            class144 var22 = client.method1900().method5427(var21);
            if (var22 == null) {
                field937[++Statics.field130 - 1] = -1;
            } else {
                field937[++Statics.field130 - 1] = var22.method2458();
            }
            return 1;
        } else if (arg0 == 6615) {
            class221 var23 = client.method1900().method5434();
            if (var23 == null) {
                field937[++Statics.field130 - 1] = -1;
                field937[++Statics.field130 - 1] = -1;
            } else {
                field937[++Statics.field130 - 1] = var23.field2586;
                field937[++Statics.field130 - 1] = var23.field2588;
            }
            return 1;
        } else if (arg0 == 6616) {
            field937[++Statics.field130 - 1] = client.method1900().method5411();
            return 1;
        } else if (arg0 == 6617) {
            class221 var24 = new class221(field937[--Statics.field130]);
            class144 var25 = client.method1900().method5412();
            if (var25 == null) {
                field937[++Statics.field130 - 1] = -1;
                field937[++Statics.field130 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method2418(var24.field2591, var24.field2586, var24.field2588);
            if (var26 == null) {
                field937[++Statics.field130 - 1] = -1;
                field937[++Statics.field130 - 1] = -1;
            } else {
                field937[++Statics.field130 - 1] = var26[0];
                field937[++Statics.field130 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class221 var27 = new class221(field937[--Statics.field130]);
            class144 var28 = client.method1900().method5412();
            if (var28 == null) {
                field937[++Statics.field130 - 1] = -1;
                field937[++Statics.field130 - 1] = -1;
                return 1;
            }
            class221 var29 = var28.method2419(var27.field2586, var27.field2588);
            if (var29 == null) {
                field937[++Statics.field130 - 1] = -1;
            } else {
                field937[++Statics.field130 - 1] = var29.method3676();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field130 -= 2;
            int var30 = field937[Statics.field130];
            class221 var31 = new class221(field937[Statics.field130 + 1]);
            Statics.method28(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field130 -= 2;
            int var32 = field937[Statics.field130];
            class221 var33 = new class221(field937[Statics.field130 + 1]);
            Statics.method28(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field130 -= 2;
            int var34 = field937[Statics.field130];
            class221 var35 = new class221(field937[Statics.field130 + 1]);
            class144 var36 = client.method1900().method5427(var34);
            if (var36 == null) {
                field937[++Statics.field130 - 1] = 0;
                return 1;
            } else {
                field937[++Statics.field130 - 1] = var36.method2416(var35.field2591, var35.field2586, var35.field2588) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field937[++Statics.field130 - 1] = client.method1900().method5435();
            field937[++Statics.field130 - 1] = client.method1900().method5436();
            return 1;
        } else if (arg0 == 6623) {
            class221 var37 = new class221(field937[--Statics.field130]);
            class144 var38 = client.method1900().method5408(var37.field2591, var37.field2586, var37.field2588);
            if (var38 == null) {
                field937[++Statics.field130 - 1] = -1;
            } else {
                field937[++Statics.field130 - 1] = var38.method2441();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1900().method5437(field937[--Statics.field130]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1900().method5438();
            return 1;
        } else if (arg0 == 6626) {
            client.method1900().method5413(field937[--Statics.field130]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1900().method5440();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field937[--Statics.field130] == 1;
            client.method1900().method5441(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field937[--Statics.field130];
            client.method1900().method5468(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field937[--Statics.field130];
            client.method1900().method5547(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1900().method5444();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field937[--Statics.field130] == 1;
            client.method1900().method5445(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field130 -= 2;
            int var43 = field937[Statics.field130];
            boolean var44 = field937[Statics.field130 + 1] == 1;
            client.method1900().method5446(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field130 -= 2;
            int var45 = field937[Statics.field130];
            boolean var46 = field937[Statics.field130 + 1] == 1;
            client.method1900().method5414(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field937[++Statics.field130 - 1] = client.method1900().method5448() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = client.method1900().method5449(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field937[--Statics.field130];
            field937[++Statics.field130 - 1] = client.method1900().method5572(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field130 -= 2;
            int var49 = field937[Statics.field130];
            class221 var50 = new class221(field937[Statics.field130 + 1]);
            class221 var51 = client.method1900().method5453(var49, var50);
            if (var51 == null) {
                field937[++Statics.field130 - 1] = -1;
            } else {
                field937[++Statics.field130 - 1] = var51.method3676();
            }
            return 1;
        } else if (arg0 == 6639) {
            class162 var52 = client.method1900().method5455();
            if (var52 == null) {
                field937[++Statics.field130 - 1] = -1;
                field937[++Statics.field130 - 1] = -1;
            } else {
                field937[++Statics.field130 - 1] = var52.method2372();
                field937[++Statics.field130 - 1] = var52.field1759.method3676();
            }
            return 1;
        } else if (arg0 == 6640) {
            class162 var53 = client.method1900().method5456();
            if (var53 == null) {
                field937[++Statics.field130 - 1] = -1;
                field937[++Statics.field130 - 1] = -1;
            } else {
                field937[++Statics.field130 - 1] = var53.method2372();
                field937[++Statics.field130 - 1] = var53.field1759.method3676();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field937[--Statics.field130];
            class280 var55 = class280.method4995(var54);
            if (var55.field3408 == null) {
                field938[++Statics.field939 - 1] = "";
            } else {
                field938[++Statics.field939 - 1] = var55.field3408;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field937[--Statics.field130];
            class280 var57 = class280.method4995(var56);
            field937[++Statics.field130 - 1] = var57.field3403;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field937[--Statics.field130];
            class280 var59 = class280.method4995(var58);
            if (var59 == null) {
                field937[++Statics.field130 - 1] = -1;
            } else {
                field937[++Statics.field130 - 1] = var59.field3409;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field937[--Statics.field130];
            class280 var61 = class280.method4995(var60);
            if (var61 == null) {
                field937[++Statics.field130 - 1] = -1;
            } else {
                field937[++Statics.field130 - 1] = var61.field3416;
            }
            return 1;
        } else if (arg0 == 6697) {
            field937[++Statics.field130 - 1] = Statics.field1407.field1781;
            return 1;
        } else if (arg0 == 6698) {
            field937[++Statics.field130 - 1] = Statics.field1407.field1783.method3676();
            return 1;
        } else if (arg0 == 6699) {
            field937[++Statics.field130 - 1] = Statics.field1407.field1782.method3676();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("n.az(ILcc;ZI)I")
    public static int method77(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6800) {
            Statics.field939++;
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            Statics.field130++;
            return 1;
        } else if (arg0 == 6850) {
            Statics.field939++;
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            Statics.field130++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jv.au(ILcc;ZI)I")
    public static int method4376(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6900) {
            Statics.field939++;
            return 1;
        } else if (arg0 == 6950) {
            Statics.field130++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.ab(ILcc;ZI)I")
    public static int method153(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field130 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field130 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field130 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field130 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field130--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field939--;
            Statics.field130--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field939--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field130 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field130--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field130--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("je.aa(ILcc;ZB)I")
    public static int method4333(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field130++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field939 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field130++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field130++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field130++;
            return 1;
        } else if (arg0 == 7108) {
            field937[++Statics.field130 - 1] = client.method3796() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kb.al(ILcc;ZB)I")
    public static int method4475(int arg0, class87 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field130 -= 5;
            field937[++Statics.field130 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field130 -= 6;
            field937[++Statics.field130 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field937[Statics.field130 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field130 -= 2;
            field937[++Statics.field130 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field130--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field130 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("li.ar(II)V")
    public static void method5223(int arg0) {
        if (arg0 == -1 || !Statics.method161(arg0)) {
            return;
        }
        class225[] var1 = Statics.field2618[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class225 var3 = var1[var2];
            if (var3.field2730 != null) {
                class96 var4 = new class96();
                var4.field1147 = var3;
                var4.field1157 = var3.field2730;
                method3192(var4, 5000000, 0);
            }
        }
    }
}
