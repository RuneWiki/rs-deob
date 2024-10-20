package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("be")
public class class77 {

    @ObfuscatedName("be.u")
    public static int[] field1064 = new int[5];

    @ObfuscatedName("be.n")
    public static int[][] field1066 = new int[5][5000];

    @ObfuscatedName("be.t")
    public static int[] field1067 = new int[1000];

    @ObfuscatedName("be.x")
    public static String[] field1068 = new String[1000];

    @ObfuscatedName("be.f")
    public static int field1069 = 0;

    @ObfuscatedName("be.c")
    public static class57[] field1072 = new class57[50];

    @ObfuscatedName("be.p")
    public static Calendar field1077 = Calendar.getInstance();

    @ObfuscatedName("be.b")
    public static final String[] field1074 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("be.e")
    public static boolean field1075 = false;

    @ObfuscatedName("be.z")
    public static boolean field1073 = false;

    @ObfuscatedName("be.a")
    public static int field1065 = 0;

    @ObfuscatedName("be.v")
    public static final double field1079 = Math.log(2.0D);

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cc.s(Lby;I)V")
    public static void method1875(class63 arg0) {
        method261(arg0, 500000);
    }

    @ObfuscatedName("v.j(Lby;IB)V")
    public static void method261(class63 arg0, int arg1) {
        Object[] var2 = arg0.field551;
        class93 var4;
        if (class294.method3601(arg0.field555)) {
            Statics.field1996 = (class42) var2[0];
            class242 var3 = class242.method156(Statics.field1996.field335);
            var4 = class93.method473(arg0.field555, var3.field3204, var3.field3214);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class93.method978(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field1076 = 0;
        Statics.field1070 = 0;
        int var6 = -1;
        int[] var7 = var4.field1254;
        int[] var8 = var4.field1259;
        byte var9 = -1;
        field1069 = 0;
        field1075 = false;
        try {
            Statics.field3822 = new int[var4.field1258];
            int var10 = 0;
            Statics.field3821 = new String[var4.field1257];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field549;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field550;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field548 == null ? -1 : arg0.field548.field2658;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field559;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field548 == null ? -1 : arg0.field548.field2558;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field552 == null ? -1 : arg0.field552.field2658;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field552 == null ? -1 : arg0.field552.field2558;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field553;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field561;
                    }
                    Statics.field3822[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field554;
                    }
                    Statics.field3821[var11++] = var14;
                }
            }
            int var15 = 0;
            field1065 = arg0.field556;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1259[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method2519(var53, var4, var43);
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
                    field1067[++Statics.field1076 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1067[++Statics.field1076 - 1] = class213.field2503[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class213.field2503[var17] = field1067[--Statics.field1076];
                    client.method1732(var17);
                } else if (var53 == 3) {
                    field1068[++Statics.field1070 - 1] = var4.field1256[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field1076 -= 2;
                    if (field1067[Statics.field1076] != field1067[Statics.field1076 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field1076 -= 2;
                    if (field1067[Statics.field1076] == field1067[Statics.field1076 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field1076 -= 2;
                    if (field1067[Statics.field1076] < field1067[Statics.field1076 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field1076 -= 2;
                    if (field1067[Statics.field1076] > field1067[Statics.field1076 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1069 == 0) {
                        return;
                    }
                    class57 var18 = field1072[--field1069];
                    var4 = var18.field496;
                    var7 = var4.field1254;
                    var8 = var4.field1259;
                    var6 = var18.field490;
                    Statics.field3822 = var18.field491;
                    Statics.field3821 = var18.field492;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1067[++Statics.field1076 - 1] = class213.method3606(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class213.method917(var20, field1067[--Statics.field1076]);
                } else if (var53 == 31) {
                    Statics.field1076 -= 2;
                    if (field1067[Statics.field1076] <= field1067[Statics.field1076 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field1076 -= 2;
                    if (field1067[Statics.field1076] >= field1067[Statics.field1076 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1067[++Statics.field1076 - 1] = Statics.field3822[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field3822[var8[var6]] = field1067[--Statics.field1076];
                } else if (var53 == 35) {
                    field1068[++Statics.field1070 - 1] = Statics.field3821[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field3821[var8[var6]] = field1068[--Statics.field1070];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field1070 -= var21;
                    String var22 = class291.method51(field1068, Statics.field1070, var21);
                    field1068[++Statics.field1070 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field1076--;
                } else if (var53 == 39) {
                    Statics.field1070--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class93 var24 = class93.method978(var23);
                    int[] var25 = new int[var24.field1258];
                    String[] var26 = new String[var24.field1257];
                    for (int var27 = 0; var27 < var24.field1260; var27++) {
                        var25[var27] = field1067[Statics.field1076 - var24.field1260 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1261; var28++) {
                        var26[var28] = field1068[Statics.field1070 - var24.field1261 + var28];
                    }
                    Statics.field1076 -= var24.field1260;
                    Statics.field1070 -= var24.field1261;
                    class57 var29 = new class57();
                    var29.field496 = var4;
                    var29.field490 = var6;
                    var29.field491 = Statics.field3822;
                    var29.field492 = Statics.field3821;
                    field1072[++field1069 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1254;
                    var8 = var24.field1259;
                    var6 = -1;
                    Statics.field3822 = var25;
                    Statics.field3821 = var26;
                } else if (var53 == 42) {
                    field1067[++Statics.field1076 - 1] = Statics.field389.method1960(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field389.method1961(var8[var6], field1067[--Statics.field1076]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1067[--Statics.field1076];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1064[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1066[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1067[--Statics.field1076];
                    if (var36 < 0 || var36 >= field1064[var35]) {
                        throw new RuntimeException();
                    }
                    field1067[++Statics.field1076 - 1] = field1066[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field1076 -= 2;
                    int var38 = field1067[Statics.field1076];
                    if (var38 < 0 || var38 >= field1064[var37]) {
                        throw new RuntimeException();
                    }
                    field1066[var37][var38] = field1067[Statics.field1076 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field389.method1962(var8[var6]);
                    if (var39 == null) {
                        var39 = class225.field2929;
                    }
                    field1068[++Statics.field1070 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field389.method1963(var8[var6], field1068[--Statics.field1070]);
                } else if (var53 == 49) {
                    String var40 = Statics.field389.method1982(var8[var6]);
                    field1068[++Statics.field1070 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field389.method1994(var8[var6], field1068[--Statics.field1070]);
                } else if (var53 == 60) {
                    class316 var41 = var4.field1262[var8[var6]];
                    class180 var42 = (class180) var41.method5405((long) field1067[--Statics.field1076]);
                    if (var42 != null) {
                        var6 += var42.field2094;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2096).append(" ");
            for (int var47 = field1069 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1072[var47].field496.field2096).append(" ");
            }
            var46.append("").append(var9);
            class341.method40(var46.toString(), var51);
        } finally {
            if (field1075) {
                field1073 = true;
                client.method4111();
                field1073 = false;
                field1075 = false;
            }
        }
    }

    @ObfuscatedName("du.i(ILcr;ZI)I")
    public static int method2519(int arg0, class93 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method1726(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method3129(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method683(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method100(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method1935(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method1856(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return Statics.method1938(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method5388(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method1834(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method622(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method56(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method3129(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method683(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method100(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method1935(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method1856(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return Statics.method880(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method4576(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method61(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method213(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method56(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method406(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method183(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method1559(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method4818(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method3371(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method1049(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method113(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method1051(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method920(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method127(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method1101(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method3741(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method3023(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method688(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3041(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method1003(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ba.k(ILcr;ZI)I")
    public static int method1726(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1076 -= 3;
            int var3 = field1067[Statics.field1076];
            int var4 = field1067[Statics.field1076 + 1];
            int var5 = field1067[Statics.field1076 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class218 var6 = class218.method3998(var3);
            if (var6.field2677 == null) {
                var6.field2677 = new class218[var5 + 1];
            }
            if (var6.field2677.length <= var5) {
                class218[] var7 = new class218[var5 + 1];
                for (int var8 = 0; var8 < var6.field2677.length; var8++) {
                    var7[var8] = var6.field2677[var8];
                }
                var6.field2677 = var7;
            }
            if (var5 > 0 && var6.field2677[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class218 var9 = new class218();
            var9.field2606 = var4;
            var9.field2575 = var9.field2658 = var6.field2658;
            var9.field2558 = var5;
            var9.field2546 = true;
            var6.field2677[var5] = var9;
            if (arg2) {
                Statics.field3624 = var9;
            } else {
                Statics.field3694 = var9;
            }
            client.method1717(var6);
            return 1;
        } else if (arg0 == 101) {
            class218 var10 = arg2 ? Statics.field3624 : Statics.field3694;
            class218 var11 = class218.method3998(var10.field2658);
            var11.field2677[var10.field2558] = null;
            client.method1717(var11);
            return 1;
        } else if (arg0 == 102) {
            class218 var12 = class218.method3998(field1067[--Statics.field1076]);
            var12.field2677 = null;
            client.method1717(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1076 -= 2;
            int var13 = field1067[Statics.field1076];
            int var14 = field1067[Statics.field1076 + 1];
            class218 var15 = class218.method3020(var13, var14);
            if (var15 == null || var14 == -1) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = 1;
                if (arg2) {
                    Statics.field3624 = var15;
                } else {
                    Statics.field3694 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class218 var16 = class218.method3998(field1067[--Statics.field1076]);
            if (var16 == null) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = 1;
                if (arg2) {
                    Statics.field3624 = var16;
                } else {
                    Statics.field3694 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ew.u(ILcr;ZS)I")
    public static int method3129(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1067[--Statics.field1076];
            var4 = class218.method3998(var3);
        } else {
            var4 = arg2 ? Statics.field3624 : Statics.field3694;
        }
        if (arg0 == 1000) {
            Statics.field1076 -= 4;
            var4.field2596 = field1067[Statics.field1076];
            var4.field2557 = field1067[Statics.field1076 + 1];
            var4.field2552 = field1067[Statics.field1076 + 2];
            var4.field2553 = field1067[Statics.field1076 + 3];
            client.method1717(var4);
            Statics.field260.method1235(var4);
            if (var3 != -1 && var4.field2606 == 0) {
                client.method546(Statics.field2542[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1076 -= 4;
            var4.field2614 = field1067[Statics.field1076];
            var4.field2559 = field1067[Statics.field1076 + 1];
            var4.field2544 = field1067[Statics.field1076 + 2];
            var4.field2555 = field1067[Statics.field1076 + 3];
            client.method1717(var4);
            Statics.field260.method1235(var4);
            if (var3 != -1 && var4.field2606 == 0) {
                client.method546(Statics.field2542[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1067[--Statics.field1076] == 1;
            if (var4.field2567 != var5) {
                var4.field2567 = var5;
                client.method1717(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2687 = field1067[--Statics.field1076] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2654 = field1067[--Statics.field1076] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ah.n(ILcr;ZI)I")
    public static int method683(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1067[--Statics.field1076];
            var4 = class218.method3998(var3);
        } else {
            var4 = arg2 ? Statics.field3624 : Statics.field3694;
        }
        if (arg0 == 1100) {
            Statics.field1076 -= 2;
            var4.field2608 = field1067[Statics.field1076];
            if (var4.field2608 > var4.field2637 - var4.field2562) {
                var4.field2608 = var4.field2637 - var4.field2562;
            }
            if (var4.field2608 < 0) {
                var4.field2608 = 0;
            }
            var4.field2569 = field1067[Statics.field1076 + 1];
            if (var4.field2569 > var4.field2633 - var4.field2563) {
                var4.field2569 = var4.field2633 - var4.field2563;
            }
            if (var4.field2569 < 0) {
                var4.field2569 = 0;
            }
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2572 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2576 = field1067[--Statics.field1076] == 1;
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2634 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2670 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2549 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2584 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2585 = field1067[--Statics.field1076] == 1;
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2590 = 1;
            var4.field2591 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1076 -= 6;
            var4.field2578 = field1067[Statics.field1076];
            var4.field2597 = field1067[Statics.field1076 + 1];
            var4.field2598 = field1067[Statics.field1076 + 2];
            var4.field2599 = field1067[Statics.field1076 + 3];
            var4.field2671 = field1067[Statics.field1076 + 4];
            var4.field2535 = field1067[Statics.field1076 + 5];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1067[--Statics.field1076];
            if (var4.field2594 != var5) {
                var4.field2594 = var5;
                var4.field2685 = 0;
                var4.field2676 = 0;
                client.method1717(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2604 = field1067[--Statics.field1076] == 1;
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1068[--Statics.field1070];
            if (!var6.equals(var4.field2635)) {
                var4.field2635 = var6;
                client.method1717(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2607 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1076 -= 3;
            var4.field2688 = field1067[Statics.field1076];
            var4.field2541 = field1067[Statics.field1076 + 1];
            var4.field2610 = field1067[Statics.field1076 + 2];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2645 = field1067[--Statics.field1076] == 1;
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2586 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2587 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2588 = field1067[--Statics.field1076] == 1;
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2589 = field1067[--Statics.field1076] == 1;
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1076 -= 2;
            var4.field2637 = field1067[Statics.field1076];
            var4.field2633 = field1067[Statics.field1076 + 1];
            client.method1717(var4);
            if (var3 != -1 && var4.field2606 == 0) {
                client.method546(Statics.field2542[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method744(var4.field2658, var4.field2558);
            client.field790 = var4;
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2583 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2573 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2579 = field1067[--Statics.field1076];
            client.method1717(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1067[--Statics.field1076];
            class323 var8 = (class323) class196.method1723(class323.method4372(), var7);
            if (var8 != null) {
                var4.field2577 = var8;
                client.method1717(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1067[--Statics.field1076] == 1;
            var4.field2602 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1067[--Statics.field1076] == 1;
            var4.field2605 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.t(ILcr;ZB)I")
    public static int method100(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3998(field1067[--Statics.field1076]);
        } else {
            var3 = arg2 ? Statics.field3624 : Statics.field3694;
        }
        client.method1717(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1076 -= 2;
            int var4 = field1067[Statics.field1076];
            int var5 = field1067[Statics.field1076 + 1];
            var3.field2675 = var4;
            var3.field2674 = var5;
            class255 var6 = class255.method144(var4);
            var3.field2598 = var6.field3396;
            var3.field2599 = var6.field3385;
            var3.field2671 = var6.field3398;
            var3.field2578 = var6.field3423;
            var3.field2597 = var6.field3400;
            var3.field2535 = var6.field3395;
            if (arg0 == 1205) {
                var3.field2540 = 0;
            } else if (arg0 == 1212 | var6.field3401 == 1) {
                var3.field2540 = 1;
            } else {
                var3.field2540 = 2;
            }
            if (var3.field2639 > 0) {
                var3.field2535 = var3.field2535 * 32 / var3.field2639;
            } else if (var3.field2614 > 0) {
                var3.field2535 = var3.field2535 * 32 / var3.field2614;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2590 = 2;
            var3.field2591 = field1067[--Statics.field1076];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2590 = 3;
            var3.field2591 = Statics.field177.field590.method3650();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.q(ILcr;ZS)I")
    public static int method1935(int arg0, class93 arg1, boolean arg2) {
        boolean var3 = true;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class218.method3998(field1067[--Statics.field1076]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field3624 : Statics.field3694;
        }
        if (arg0 == 1300) {
            int var5 = field1067[--Statics.field1076] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3683(var5, field1068[--Statics.field1070]);
                return 1;
            } else {
                Statics.field1070--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1076 -= 2;
            int var6 = field1067[Statics.field1076];
            int var7 = field1067[Statics.field1076 + 1];
            var4.field2628 = class218.method3020(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2631 = field1067[--Statics.field1076] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2629 = field1067[--Statics.field1076];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2683 = field1067[--Statics.field1076];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2626 = field1068[--Statics.field1070];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2656 = field1068[--Statics.field1070];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2627 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2689 = field1067[--Statics.field1076] == 1;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1076 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1067[Statics.field1076 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1067[Statics.field1076 + var10];
                        var9[var10 / 2] = (byte) field1067[Statics.field1076 + var10 + 1];
                    }
                }
            } else {
                Statics.field1076 -= 2;
                var8 = new byte[] { (byte) field1067[Statics.field1076] };
                var9 = new byte[] { (byte) field1067[Statics.field1076 + 1] };
            }
            int var11 = field1067[--Statics.field1076] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method1867(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1076 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1067[Statics.field1076] };
            byte[] var14 = new byte[] { (byte) field1067[Statics.field1076 + 1] };
            method1867(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1076 -= 3;
            int var15 = field1067[Statics.field1076] - 1;
            int var16 = field1067[Statics.field1076 + 1];
            int var17 = field1067[Statics.field1076 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method4884(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1067[--Statics.field1076];
            int var20 = field1067[--Statics.field1076];
            method4884(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1076--;
            int var21 = field1067[Statics.field1076] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method476(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method476(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.x(Lhp;I[B[BI)V")
    public static final void method1867(class218 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2632 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2632 = new byte[11][];
            arg0.field2623 = new byte[11][];
            arg0.field2624 = new int[11];
            arg0.field2582 = new int[11];
        }
        arg0.field2632[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2621 = false;
            for (int var4 = 0; var4 < arg0.field2632.length; var4++) {
                if (arg0.field2632[var4] != null) {
                    arg0.field2621 = true;
                    break;
                }
            }
        } else {
            arg0.field2621 = true;
        }
        arg0.field2623[arg1] = arg3;
    }

    @ObfuscatedName("kz.d(Lhp;IIII)V")
    public static final void method4884(class218 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2624 == null) {
            throw new RuntimeException();
        }
        arg0.field2624[arg1] = arg2;
        arg0.field2582[arg1] = arg3;
    }

    @ObfuscatedName("az.f(Lhp;II)V")
    public static final void method476(class218 arg0, int arg1) {
        if (arg0.field2632 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2686 == null) {
            arg0.field2686 = new int[arg0.field2632.length];
        }
        arg0.field2686[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ci.c(ILcr;ZI)I")
    public static int method1856(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3998(field1067[--Statics.field1076]);
        } else {
            var3 = arg2 ? Statics.field3624 : Statics.field3694;
        }
        String var4 = field1068[--Statics.field1070];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1067[--Statics.field1076];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1067[--Statics.field1076];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1068[--Statics.field1070];
            } else {
                var7[var8] = Integer.valueOf(field1067[--Statics.field1076]);
            }
        }
        int var9 = field1067[--Statics.field1076];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2565 = var7;
        } else if (arg0 == 1401) {
            var3.field2570 = var7;
        } else if (arg0 == 1402) {
            var3.field2545 = var7;
        } else if (arg0 == 1403) {
            var3.field2548 = var7;
        } else if (arg0 == 1404) {
            var3.field2669 = var7;
        } else if (arg0 == 1405) {
            var3.field2642 = var7;
        } else if (arg0 == 1406) {
            var3.field2538 = var7;
        } else if (arg0 == 1407) {
            var3.field2646 = var7;
            var3.field2647 = var5;
        } else if (arg0 == 1408) {
            var3.field2652 = var7;
        } else if (arg0 == 1409) {
            var3.field2653 = var7;
        } else if (arg0 == 1410) {
            var3.field2643 = var7;
        } else if (arg0 == 1411) {
            var3.field2636 = var7;
        } else if (arg0 == 1412) {
            var3.field2640 = var7;
        } else if (arg0 == 1414) {
            var3.field2648 = var7;
            var3.field2638 = var5;
        } else if (arg0 == 1415) {
            var3.field2650 = var7;
            var3.field2651 = var5;
        } else if (arg0 == 1416) {
            var3.field2644 = var7;
        } else if (arg0 == 1417) {
            var3.field2641 = var7;
        } else if (arg0 == 1418) {
            var3.field2655 = var7;
        } else if (arg0 == 1419) {
            var3.field2556 = var7;
        } else if (arg0 == 1420) {
            var3.field2657 = var7;
        } else if (arg0 == 1421) {
            var3.field2630 = var7;
        } else if (arg0 == 1422) {
            var3.field2659 = var7;
        } else if (arg0 == 1423) {
            var3.field2622 = var7;
        } else if (arg0 == 1424) {
            var3.field2661 = var7;
        } else if (arg0 == 1425) {
            var3.field2663 = var7;
        } else if (arg0 == 1426) {
            var3.field2664 = var7;
        } else if (arg0 == 1427) {
            var3.field2662 = var7;
        } else {
            return 2;
        }
        var3.field2566 = true;
        return 1;
    }

    @ObfuscatedName("lz.y(ILcr;ZI)I")
    public static int method5388(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field3624 : Statics.field3694;
        if (arg0 == 1600) {
            field1067[++Statics.field1076 - 1] = var3.field2608;
            return 1;
        } else if (arg0 == 1601) {
            field1067[++Statics.field1076 - 1] = var3.field2569;
            return 1;
        } else if (arg0 == 1602) {
            field1068[++Statics.field1070 - 1] = var3.field2635;
            return 1;
        } else if (arg0 == 1603) {
            field1067[++Statics.field1076 - 1] = var3.field2637;
            return 1;
        } else if (arg0 == 1604) {
            field1067[++Statics.field1076 - 1] = var3.field2633;
            return 1;
        } else if (arg0 == 1605) {
            field1067[++Statics.field1076 - 1] = var3.field2535;
            return 1;
        } else if (arg0 == 1606) {
            field1067[++Statics.field1076 - 1] = var3.field2598;
            return 1;
        } else if (arg0 == 1607) {
            field1067[++Statics.field1076 - 1] = var3.field2671;
            return 1;
        } else if (arg0 == 1608) {
            field1067[++Statics.field1076 - 1] = var3.field2599;
            return 1;
        } else if (arg0 == 1609) {
            field1067[++Statics.field1076 - 1] = var3.field2634;
            return 1;
        } else if (arg0 == 1610) {
            field1067[++Statics.field1076 - 1] = var3.field2579;
            return 1;
        } else if (arg0 == 1611) {
            field1067[++Statics.field1076 - 1] = var3.field2572;
            return 1;
        } else if (arg0 == 1612) {
            field1067[++Statics.field1076 - 1] = var3.field2573;
            return 1;
        } else if (arg0 == 1613) {
            field1067[++Statics.field1076 - 1] = var3.field2577.method34();
            return 1;
        } else if (arg0 == 1614) {
            field1067[++Statics.field1076 - 1] = var3.field2605 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bc.p(ILcr;ZI)I")
    public static int method1834(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field3624 : Statics.field3694;
        if (arg0 == 1700) {
            field1067[++Statics.field1076 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2675 == -1) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = var3.field2674;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1067[++Statics.field1076 - 1] = var3.field2558;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ax.g(ILcr;ZI)I")
    public static int method622(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field3624 : Statics.field3694;
        if (arg0 == 1800) {
            field1067[++Statics.field1076 - 1] = class219.method472(client.method4095(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1067[--Statics.field1076];
            int var5 = var4 - 1;
            if (var3.field2627 == null || var5 >= var3.field2627.length || var3.field2627[var5] == null) {
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1068[++Statics.field1070 - 1] = var3.field2627[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2626 == null) {
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1068[++Statics.field1070 - 1] = var3.field2626;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("n.e(ILcr;ZI)I")
    public static int method56(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3998(field1067[--Statics.field1076]);
        } else {
            var3 = arg2 ? Statics.field3624 : Statics.field3694;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1065 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2662 == null) {
            return 0;
        } else {
            class63 var4 = new class63();
            var4.field548 = var3;
            var4.field551 = var3.field2662;
            var4.field556 = field1065 + 1;
            client.field878.method4475(var4);
            return 1;
        }
    }

    @ObfuscatedName("jy.w(ILcr;ZI)I")
    public static int method4576(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3998(field1067[--Statics.field1076]);
        if (arg0 == 2600) {
            field1067[++Statics.field1076 - 1] = var3.field2608;
            return 1;
        } else if (arg0 == 2601) {
            field1067[++Statics.field1076 - 1] = var3.field2569;
            return 1;
        } else if (arg0 == 2602) {
            field1068[++Statics.field1070 - 1] = var3.field2635;
            return 1;
        } else if (arg0 == 2603) {
            field1067[++Statics.field1076 - 1] = var3.field2637;
            return 1;
        } else if (arg0 == 2604) {
            field1067[++Statics.field1076 - 1] = var3.field2633;
            return 1;
        } else if (arg0 == 2605) {
            field1067[++Statics.field1076 - 1] = var3.field2535;
            return 1;
        } else if (arg0 == 2606) {
            field1067[++Statics.field1076 - 1] = var3.field2598;
            return 1;
        } else if (arg0 == 2607) {
            field1067[++Statics.field1076 - 1] = var3.field2671;
            return 1;
        } else if (arg0 == 2608) {
            field1067[++Statics.field1076 - 1] = var3.field2599;
            return 1;
        } else if (arg0 == 2609) {
            field1067[++Statics.field1076 - 1] = var3.field2634;
            return 1;
        } else if (arg0 == 2610) {
            field1067[++Statics.field1076 - 1] = var3.field2579;
            return 1;
        } else if (arg0 == 2611) {
            field1067[++Statics.field1076 - 1] = var3.field2572;
            return 1;
        } else if (arg0 == 2612) {
            field1067[++Statics.field1076 - 1] = var3.field2573;
            return 1;
        } else if (arg0 == 2613) {
            field1067[++Statics.field1076 - 1] = var3.field2577.method34();
            return 1;
        } else if (arg0 == 2614) {
            field1067[++Statics.field1076 - 1] = var3.field2605 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.l(ILcr;ZS)I")
    public static int method61(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class218 var3 = class218.method3998(field1067[--Statics.field1076]);
            field1067[++Statics.field1076 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 2701) {
            class218 var4 = class218.method3998(field1067[--Statics.field1076]);
            if (var4.field2675 == -1) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = var4.field2674;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1067[--Statics.field1076];
            class62 var6 = (class62) client.field854.method5434((long) var5);
            if (var6 == null) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1067[++Statics.field1076 - 1] = client.field700;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("w.h(ILcr;ZI)I")
    public static int method213(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3998(field1067[--Statics.field1076]);
        if (arg0 == 2800) {
            field1067[++Statics.field1076 - 1] = class219.method472(client.method4095(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1067[--Statics.field1076];
            int var5 = var4 - 1;
            if (var3.field2627 == null || var5 >= var3.field2627.length || var3.field2627[var5] == null) {
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1068[++Statics.field1070 - 1] = var3.field2627[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2626 == null) {
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1068[++Statics.field1070 - 1] = var3.field2626;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("af.v(ILcr;ZB)I")
    public static int method406(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1068[--Statics.field1070];
            class92.method3602(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1076 -= 2;
            client.method4758(Statics.field177, field1067[Statics.field1076], field1067[Statics.field1076 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1073) {
                field1075 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1068[--Statics.field1070];
            int var5 = 0;
            if (class291.method3195(var4)) {
                var5 = class291.method3042(var4);
            }
            class188 var6 = class188.method1879(class184.field2203, client.field828.field1300);
            var6.field2321.method5166(var5);
            client.field828.method2049(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1068[--Statics.field1070];
            class188 var8 = class188.method1879(class184.field2281, client.field828.field1300);
            var8.field2321.method5083(var7.length() + 1);
            var8.field2321.method5043(var7);
            client.field828.method2049(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1068[--Statics.field1070];
            class188 var10 = class188.method1879(class184.field2195, client.field828.field1300);
            var10.field2321.method5083(var9.length() + 1);
            var10.field2321.method5043(var9);
            client.field828.method2049(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1067[--Statics.field1076];
            String var12 = field1068[--Statics.field1070];
            client.method3019(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1076 -= 3;
            int var13 = field1067[Statics.field1076];
            int var14 = field1067[Statics.field1076 + 1];
            int var15 = field1067[Statics.field1076 + 2];
            class218 var16 = class218.method3998(var15);
            client.method421(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1076 -= 2;
            int var17 = field1067[Statics.field1076];
            int var18 = field1067[Statics.field1076 + 1];
            class218 var19 = arg2 ? Statics.field3624 : Statics.field3694;
            client.method421(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1048 = field1067[--Statics.field1076] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1067[++Statics.field1076 - 1] = Statics.field69.field1030 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field69.field1030 = field1067[--Statics.field1076] == 1;
            class74.method135();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1068[--Statics.field1070];
            boolean var21 = field1067[--Statics.field1076] == 1;
            class52.method3044(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1067[--Statics.field1076];
            class188 var23 = class188.method1879(class184.field2228, client.field828.field1300);
            var23.field2321.method5037(var22);
            client.field828.method2049(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1067[--Statics.field1076];
            Statics.field1070 -= 2;
            String var25 = field1068[Statics.field1070];
            String var26 = field1068[Statics.field1070 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class188 var27 = class188.method1879(class184.field2233, client.field828.field1300);
                var27.field2321.method5037(1 + class300.method4752(var25) + class300.method4752(var26));
                var27.field2321.method5043(var25);
                var27.field2321.method5083(var24);
                var27.field2321.method5043(var26);
                client.field828.method2049(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field770 = field1067[--Statics.field1076] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field772 = field1067[--Statics.field1076] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field743 = field1067[--Statics.field1076] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1067[--Statics.field1076] == 1) {
                client.field744 |= 0x1;
            } else {
                client.field744 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1067[--Statics.field1076] == 1) {
                client.field744 |= 0x2;
            } else {
                client.field744 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1067[--Statics.field1076] == 1) {
                client.field744 |= 0x4;
            } else {
                client.field744 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1067[--Statics.field1076] == 1) {
                client.field744 |= 0x8;
            } else {
                client.field744 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field744 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field729 = field1067[--Statics.field1076] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field739 = field1067[--Statics.field1076] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method3624(field1067[--Statics.field1076] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1067[++Statics.field1076 - 1] = client.method916() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1076 -= 2;
            client.field840 = field1067[Statics.field1076];
            client.field705 = field1067[Statics.field1076 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1076 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1076--;
            return 1;
        } else if (arg0 == 3132) {
            field1067[++Statics.field1076 - 1] = Statics.field3255;
            field1067[++Statics.field1076 - 1] = Statics.field256;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1076--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1076 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field639 = 3;
            client.field787 = field1067[--Statics.field1076];
            return 1;
        } else if (arg0 == 3137) {
            client.field639 = 2;
            client.field787 = field1067[--Statics.field1076];
            return 1;
        } else if (arg0 == 3138) {
            client.field639 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field639 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field639 = 3;
            client.field787 = arg2 ? Statics.field3624.field2658 : Statics.field3694.field2658;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1067[--Statics.field1076] == 1;
            Statics.field69.field1034 = var28;
            class74.method135();
            return 1;
        } else if (arg0 == 3142) {
            field1067[++Statics.field1076 - 1] = Statics.field69.field1034 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1067[--Statics.field1076] == 1;
            client.field663 = var29;
            if (!var29) {
                Statics.field69.field1033 = "";
                class74.method135();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1067[++Statics.field1076 - 1] = client.field663 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1067[--Statics.field1076] == 1;
            if (Statics.field69.field1037 == var30) {
                Statics.field69.field1037 = !var30;
                class74.method135();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1067[++Statics.field1076 - 1] = Statics.field69.field1037 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1067[++Statics.field1076 - 1] = class86.field1181;
            return 1;
        } else if (arg0 == 3154) {
            field1067[++Statics.field1076 - 1] = client.method635();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1070--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1076 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1076--;
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1076--;
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1070--;
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1076--;
            field1068[++Statics.field1070 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1076--;
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1076 -= 2;
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1076 -= 2;
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1076 -= 2;
            field1068[++Statics.field1070 - 1] = "";
            field1068[++Statics.field1070 - 1] = "";
            field1068[++Statics.field1070 - 1] = "";
            field1068[++Statics.field1070 - 1] = "";
            field1068[++Statics.field1070 - 1] = "";
            field1068[++Statics.field1070 - 1] = "";
            field1068[++Statics.field1070 - 1] = "";
            field1068[++Statics.field1070 - 1] = "";
            field1068[++Statics.field1070 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1076--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1076--;
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1076--;
            return 1;
        } else if (arg0 == 3175) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.m(ILcr;ZB)I")
    public static int method183(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1076 -= 3;
            client.method111(field1067[Statics.field1076], field1067[Statics.field1076 + 1], field1067[Statics.field1076 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method2277(field1067[--Statics.field1076]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1076 -= 2;
            client.method1015(field1067[Statics.field1076], field1067[Statics.field1076 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bm.o(ILcr;ZI)I")
    public static int method1559(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1067[++Statics.field1076 - 1] = client.field635;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1076 -= 2;
            int var3 = field1067[Statics.field1076];
            int var4 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = class60.method3364(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1076 -= 2;
            int var5 = field1067[Statics.field1076];
            int var6 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = class60.method2303(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1076 -= 2;
            int var7 = field1067[Statics.field1076];
            int var8 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = class60.method638(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = class240.method1575(var9).field3182;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = client.field756[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = client.field785[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = client.field717[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field519;
            int var14 = (Statics.field177.field957 >> 7) + Statics.field1299;
            int var15 = (Statics.field177.field918 >> 7) + Statics.field2085;
            field1067[++Statics.field1076 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1067[++Statics.field1076 - 1] = client.field637 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1076 -= 2;
            int var19 = field1067[Statics.field1076] + 32768;
            int var20 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = class60.method3364(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1076 -= 2;
            int var21 = field1067[Statics.field1076] + 32768;
            int var22 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = class60.method2303(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1076 -= 2;
            int var23 = field1067[Statics.field1076] + 32768;
            int var24 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = class60.method638(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field793 >= 2) {
                field1067[++Statics.field1076 - 1] = client.field793;
            } else {
                field1067[++Statics.field1076 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1067[++Statics.field1076 - 1] = client.field658;
            return 1;
        } else if (arg0 == 3318) {
            field1067[++Statics.field1076 - 1] = client.field872;
            return 1;
        } else if (arg0 == 3321) {
            field1067[++Statics.field1076 - 1] = client.field791;
            return 1;
        } else if (arg0 == 3322) {
            field1067[++Statics.field1076 - 1] = client.field675;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field795) {
                field1067[++Statics.field1076 - 1] = 1;
            } else {
                field1067[++Statics.field1076 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1067[++Statics.field1076 - 1] = client.field626;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1076 -= 4;
            int var25 = field1067[Statics.field1076];
            int var26 = field1067[Statics.field1076 + 1];
            int var27 = field1067[Statics.field1076 + 2];
            int var28 = field1067[Statics.field1076 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1067[++Statics.field1076 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ks.av(ILcr;ZI)I")
    public static int method4818(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1076 -= 2;
            int var3 = field1067[Statics.field1076];
            int var4 = field1067[Statics.field1076 + 1];
            class252 var5 = class252.method1880(var3);
            if (var5.field3301 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3302; var6++) {
                if (var5.field3303[var6] == var4) {
                    field1068[++Statics.field1070 - 1] = var5.field3296[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1068[++Statics.field1070 - 1] = var5.field3305;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1076 -= 4;
            int var7 = field1067[Statics.field1076];
            int var8 = field1067[Statics.field1076 + 1];
            int var9 = field1067[Statics.field1076 + 2];
            int var10 = field1067[Statics.field1076 + 3];
            class252 var11 = class252.method1880(var9);
            if (var11.field3298 != var7 || var11.field3301 != var8) {
                if (var8 == 115) {
                    field1068[++Statics.field1070 - 1] = class225.field2929;
                } else {
                    field1067[++Statics.field1076 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3302; var12++) {
                if (var11.field3303[var12] == var10) {
                    if (var8 == 115) {
                        field1068[++Statics.field1070 - 1] = var11.field3296[var12];
                    } else {
                        field1067[++Statics.field1076 - 1] = var11.field3304[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1068[++Statics.field1070 - 1] = var11.field3305;
                } else {
                    field1067[++Statics.field1076 - 1] = var11.field3307;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1067[--Statics.field1076];
            class252 var14 = class252.method1880(var13);
            field1067[++Statics.field1076 - 1] = var14.method4138();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gm.am(ILcr;ZI)I")
    public static int method3371(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field265.field1046 == 0) {
                field1067[++Statics.field1076 - 1] = -2;
            } else if (Statics.field265.field1046 == 1) {
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = Statics.field265.field1044.method4699();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1067[--Statics.field1076];
            if (Statics.field265.method1668() && var3 >= 0 && var3 < Statics.field265.field1044.method4699()) {
                class284 var4 = (class284) Statics.field265.field1044.method4736(var3);
                field1068[++Statics.field1070 - 1] = var4.method4634();
                field1068[++Statics.field1070 - 1] = var4.method4647();
            } else {
                field1068[++Statics.field1070 - 1] = "";
                field1068[++Statics.field1070 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1067[--Statics.field1076];
            if (Statics.field265.method1668() && var5 >= 0 && var5 < Statics.field265.field1044.method4699()) {
                field1067[++Statics.field1076 - 1] = ((class279) Statics.field265.field1044.method4736(var5)).field3588;
            } else {
                field1067[++Statics.field1076 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1067[--Statics.field1076];
            if (Statics.field265.method1668() && var6 >= 0 && var6 < Statics.field265.field1044.method4699()) {
                field1067[++Statics.field1076 - 1] = ((class279) Statics.field265.field1044.method4736(var6)).field3592;
            } else {
                field1067[++Statics.field1076 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1068[--Statics.field1070];
            int var8 = field1067[--Statics.field1076];
            class75.method251(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1068[--Statics.field1070];
            Statics.field265.method1674(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1068[--Statics.field1070];
            Statics.field265.method1686(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1068[--Statics.field1070];
            Statics.field265.method1681(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1068[--Statics.field1070];
            Statics.field265.method1715(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1068[--Statics.field1070];
            String var14 = client.method3252(var13);
            field1067[++Statics.field1076 - 1] = Statics.field265.method1673(new class283(var14, Statics.field3649), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field902 == null) {
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1068[++Statics.field1070 - 1] = Statics.field902.field3613;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field902 == null) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = Statics.field902.method4699();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1067[--Statics.field1076];
            if (Statics.field902 == null || var15 >= Statics.field902.method4699()) {
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1068[++Statics.field1070 - 1] = Statics.field902.method4736(var15).method4632().method4767();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1067[--Statics.field1076];
            if (Statics.field902 == null || var16 >= Statics.field902.method4699()) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = ((class279) Statics.field902.method4736(var16)).method4748();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1067[--Statics.field1076];
            if (Statics.field902 == null || var17 >= Statics.field902.method4699()) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = ((class279) Statics.field902.method4736(var17)).field3592;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1067[++Statics.field1076 - 1] = Statics.field902 == null ? 0 : Statics.field902.field3615;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1068[--Statics.field1070];
            client.method506(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1067[++Statics.field1076 - 1] = Statics.field902 == null ? 0 : Statics.field902.field3611;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1068[--Statics.field1070];
            client.method3750(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method951();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field265.method1668()) {
                field1067[++Statics.field1076 - 1] = Statics.field265.field1045.method4699();
            } else {
                field1067[++Statics.field1076 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1067[--Statics.field1076];
            if (Statics.field265.method1668() && var20 >= 0 && var20 < Statics.field265.field1045.method4699()) {
                class278 var21 = (class278) Statics.field265.field1045.method4736(var20);
                field1068[++Statics.field1070 - 1] = var21.method4634();
                field1068[++Statics.field1070 - 1] = var21.method4647();
            } else {
                field1068[++Statics.field1070 - 1] = "";
                field1068[++Statics.field1070 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1068[--Statics.field1070];
            String var23 = client.method3252(var22);
            field1067[++Statics.field1076 - 1] = Statics.field265.method1724(new class283(var23, Statics.field3649)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1067[--Statics.field1076];
            if (Statics.field902 == null || var24 >= Statics.field902.method4699() || !Statics.field902.method4736(var24).method4632().equals(Statics.field177.field591)) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field902 == null || Statics.field902.field3612 == null) {
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1068[++Statics.field1070 - 1] = Statics.field902.field3612;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1067[--Statics.field1076];
            if (Statics.field902 == null || var25 >= Statics.field902.method4699() || !((class273) Statics.field902.method4736(var25)).method4611()) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1067[--Statics.field1076];
            if (Statics.field902 == null || var26 >= Statics.field902.method4699() || !((class273) Statics.field902.method4736(var26)).method4614()) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field265.field1044.method4688();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1044.method4729(new class314(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1044.method4729(new class315(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1044.method4729(new class158(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1044.method4729(new class152(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1044.method4729(new class157(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1044.method4729(new class160(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1044.method4729(new class156(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1044.method4729(new class154(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1044.method4729(new class153(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1044.method4729(new class155(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field265.field1044.method4672();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field265.field1045.method4688();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1045.method4729(new class314(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1045.method4729(new class315(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field265.field1045.method4672();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field902 != null) {
                Statics.field902.method4688();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1067[--Statics.field1076] == 1;
            if (Statics.field902 != null) {
                Statics.field902.method4729(new class314(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1067[--Statics.field1076] == 1;
            if (Statics.field902 != null) {
                Statics.field902.method4729(new class315(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1067[--Statics.field1076] == 1;
            if (Statics.field902 != null) {
                Statics.field902.method4729(new class158(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1067[--Statics.field1076] == 1;
            if (Statics.field902 != null) {
                Statics.field902.method4729(new class152(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1067[--Statics.field1076] == 1;
            if (Statics.field902 != null) {
                Statics.field902.method4729(new class157(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1067[--Statics.field1076] == 1;
            if (Statics.field902 != null) {
                Statics.field902.method4729(new class160(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1067[--Statics.field1076] == 1;
            if (Statics.field902 != null) {
                Statics.field902.method4729(new class156(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1067[--Statics.field1076] == 1;
            if (Statics.field902 != null) {
                Statics.field902.method4729(new class154(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1067[--Statics.field1076] == 1;
            if (Statics.field902 != null) {
                Statics.field902.method4729(new class153(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1067[--Statics.field1076] == 1;
            if (Statics.field902 != null) {
                Statics.field902.method4729(new class155(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field902 != null) {
                Statics.field902.method4672();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1067[--Statics.field1076] == 1;
            Statics.field265.field1044.method4729(new class159(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1067[--Statics.field1076] == 1;
            if (Statics.field902 != null) {
                Statics.field902.method4729(new class159(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.ai(ILcr;ZS)I")
    public static int method1049(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = client.field891[var3].method84();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = client.field891[var4].field70;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = client.field891[var5].field63;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = client.field891[var6].field62;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = client.field891[var7].field61;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = client.field891[var8].field66;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1067[--Statics.field1076];
            int var10 = client.field891[var9].method81();
            field1067[++Statics.field1076 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1067[--Statics.field1076];
            int var12 = client.field891[var11].method81();
            field1067[++Statics.field1076 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1067[--Statics.field1076];
            int var14 = client.field891[var13].method81();
            field1067[++Statics.field1076 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1067[--Statics.field1076];
            int var16 = client.field891[var15].method81();
            field1067[++Statics.field1076 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1067[--Statics.field1076] == 1;
            if (Statics.field10 != null) {
                Statics.field10.method60(class7.field42, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1067[--Statics.field1076] == 1;
            if (Statics.field10 != null) {
                Statics.field10.method60(class7.field43, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1076 -= 2;
            boolean var19 = field1067[Statics.field1076] == 1;
            boolean var20 = field1067[Statics.field1076 + 1] == 1;
            if (Statics.field10 != null) {
                client.field852.field620 = var20;
                Statics.field10.method60(client.field852, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1067[--Statics.field1076] == 1;
            if (Statics.field10 != null) {
                Statics.field10.method60(class7.field41, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1067[--Statics.field1076] == 1;
            if (Statics.field10 != null) {
                Statics.field10.method60(class7.field40, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1067[++Statics.field1076 - 1] = Statics.field10 == null ? 0 : Statics.field10.field44.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1067[--Statics.field1076];
            class8 var24 = (class8) Statics.field10.field44.get(var23);
            field1067[++Statics.field1076 - 1] = var24.field54;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1067[--Statics.field1076];
            class8 var26 = (class8) Statics.field10.field44.get(var25);
            field1068[++Statics.field1070 - 1] = var26.method63();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1067[--Statics.field1076];
            class8 var28 = (class8) Statics.field10.field44.get(var27);
            field1068[++Statics.field1070 - 1] = var28.method67();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1067[--Statics.field1076];
            class8 var30 = (class8) Statics.field10.field44.get(var29);
            long var31 = class297.method4369() - Statics.field1891 - var30.field55;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1068[++Statics.field1070 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1067[--Statics.field1076];
            class8 var38 = (class8) Statics.field10.field44.get(var37);
            field1067[++Statics.field1076 - 1] = var38.field49.field62;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1067[--Statics.field1076];
            class8 var40 = (class8) Statics.field10.field44.get(var39);
            field1067[++Statics.field1076 - 1] = var40.field49.field63;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1067[--Statics.field1076];
            class8 var42 = (class8) Statics.field10.field44.get(var41);
            field1067[++Statics.field1076 - 1] = var42.field49.field70;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.af(ILcr;ZI)I")
    public static int method113(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1076 -= 2;
            int var3 = field1067[Statics.field1076];
            int var4 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1076 -= 2;
            int var5 = field1067[Statics.field1076];
            int var6 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1076 -= 2;
            int var7 = field1067[Statics.field1076];
            int var8 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1076 -= 2;
            int var9 = field1067[Statics.field1076];
            int var10 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1076 -= 5;
            int var13 = field1067[Statics.field1076];
            int var14 = field1067[Statics.field1076 + 1];
            int var15 = field1067[Statics.field1076 + 2];
            int var16 = field1067[Statics.field1076 + 3];
            int var17 = field1067[Statics.field1076 + 4];
            field1067[++Statics.field1076 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1076 -= 2;
            int var18 = field1067[Statics.field1076];
            int var19 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1076 -= 2;
            int var20 = field1067[Statics.field1076];
            int var21 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1076 -= 2;
            int var22 = field1067[Statics.field1076];
            int var23 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1076 -= 2;
            int var24 = field1067[Statics.field1076];
            int var25 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1076 -= 2;
            int var26 = field1067[Statics.field1076];
            int var27 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1076 -= 2;
            int var28 = field1067[Statics.field1076];
            int var29 = field1067[Statics.field1076 + 1];
            if (var28 == 0) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1076 -= 2;
            int var30 = field1067[Statics.field1076];
            int var31 = field1067[Statics.field1076 + 1];
            if (var30 == 0) {
                field1067[++Statics.field1076 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1067[++Statics.field1076 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1067[++Statics.field1076 - 1] = var30;
                    break;
                case 2:
                    field1067[++Statics.field1076 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1067[++Statics.field1076 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1067[++Statics.field1076 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1067[++Statics.field1076 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1076 -= 2;
            int var32 = field1067[Statics.field1076];
            int var33 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1076 -= 2;
            int var34 = field1067[Statics.field1076];
            int var35 = field1067[Statics.field1076 + 1];
            field1067[++Statics.field1076 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1076 -= 3;
            long var36 = (long) field1067[Statics.field1076];
            long var38 = (long) field1067[Statics.field1076 + 1];
            long var40 = (long) field1067[Statics.field1076 + 2];
            field1067[++Statics.field1076 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.az(ILcr;ZI)I")
    public static int method1051(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1068[--Statics.field1070];
            int var4 = field1067[--Statics.field1076];
            field1068[++Statics.field1070 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1070 -= 2;
            String var5 = field1068[Statics.field1070];
            String var6 = field1068[Statics.field1070 + 1];
            field1068[++Statics.field1070 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1068[--Statics.field1070];
            int var8 = field1067[--Statics.field1076];
            field1068[++Statics.field1070 - 1] = var7 + class291.method4786(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1068[--Statics.field1070];
            field1068[++Statics.field1070 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1067[--Statics.field1076];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1077.setTime(new Date(var11));
            int var13 = field1077.get(5);
            int var14 = field1077.get(2);
            int var15 = field1077.get(1);
            field1068[++Statics.field1070 - 1] = var13 + "-" + field1074[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1070 -= 2;
            String var16 = field1068[Statics.field1070];
            String var17 = field1068[Statics.field1070 + 1];
            if (Statics.field177.field590 != null && Statics.field177.field590.field2522) {
                field1068[++Statics.field1070 - 1] = var17;
            } else {
                field1068[++Statics.field1070 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1067[--Statics.field1076];
            field1068[++Statics.field1070 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1070 -= 2;
            field1067[++Statics.field1076 - 1] = class291.method3043(class287.method4753(field1068[Statics.field1070], field1068[Statics.field1070 + 1], Statics.field523));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1068[--Statics.field1070];
            Statics.field1076 -= 2;
            int var20 = field1067[Statics.field1076];
            int var21 = field1067[Statics.field1076 + 1];
            byte[] var22 = Statics.field263.method3790(var21, 0);
            class295 var23 = new class295(var22);
            field1067[++Statics.field1076 - 1] = var23.method4946(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1068[--Statics.field1070];
            Statics.field1076 -= 2;
            int var25 = field1067[Statics.field1076];
            int var26 = field1067[Statics.field1076 + 1];
            byte[] var27 = Statics.field263.method3790(var26, 0);
            class295 var28 = new class295(var27);
            field1067[++Statics.field1076 - 1] = var28.method4954(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1070 -= 2;
            String var29 = field1068[Statics.field1070];
            String var30 = field1068[Statics.field1070 + 1];
            if (field1067[--Statics.field1076] == 1) {
                field1068[++Statics.field1070 - 1] = var29;
            } else {
                field1068[++Statics.field1070 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1068[--Statics.field1070];
            field1068[++Statics.field1070 - 1] = class296.method4987(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1068[--Statics.field1070];
            int var33 = field1067[--Statics.field1076];
            field1068[++Statics.field1070 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = class291.method3865((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = class291.method3293((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = class291.method4631((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = class291.method3927((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1068[--Statics.field1070];
            if (var38 == null) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1068[--Statics.field1070];
            Statics.field1076 -= 2;
            int var40 = field1067[Statics.field1076];
            int var41 = field1067[Statics.field1076 + 1];
            field1068[++Statics.field1070 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1068[--Statics.field1070];
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
            field1068[++Statics.field1070 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1068[--Statics.field1070];
            int var48 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1070 -= 2;
            String var49 = field1068[Statics.field1070];
            String var50 = field1068[Statics.field1070 + 1];
            int var51 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1068[--Statics.field1070];
            field1068[++Statics.field1070 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.aj(ILcr;ZB)I")
    public static int method920(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1067[--Statics.field1076];
            field1068[++Statics.field1070 - 1] = class255.method144(var3).field3434;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1076 -= 2;
            int var4 = field1067[Statics.field1076];
            int var5 = field1067[Statics.field1076 + 1];
            class255 var6 = class255.method144(var4);
            if (var5 < 1 || var5 > 5 || var6.field3397[var5 - 1] == null) {
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1068[++Statics.field1070 - 1] = var6.field3397[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1076 -= 2;
            int var7 = field1067[Statics.field1076];
            int var8 = field1067[Statics.field1076 + 1];
            class255 var9 = class255.method144(var7);
            if (var8 < 1 || var8 > 5 || var9.field3405[var8 - 1] == null) {
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1068[++Statics.field1070 - 1] = var9.field3405[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = class255.method144(var10).field3402;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = class255.method144(var11).field3401 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1067[--Statics.field1076];
            class255 var13 = class255.method144(var12);
            if (var13.field3428 == -1 && var13.field3421 >= 0) {
                field1067[++Statics.field1076 - 1] = var13.field3421;
            } else {
                field1067[++Statics.field1076 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1067[--Statics.field1076];
            class255 var15 = class255.method144(var14);
            if (var15.field3428 >= 0 && var15.field3421 >= 0) {
                field1067[++Statics.field1076 - 1] = var15.field3421;
            } else {
                field1067[++Statics.field1076 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = class255.method144(var16).field3403 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1067[--Statics.field1076];
            class255 var18 = class255.method144(var17);
            if (var18.field3390 == -1 && var18.field3433 >= 0) {
                field1067[++Statics.field1076 - 1] = var18.field3433;
            } else {
                field1067[++Statics.field1076 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1067[--Statics.field1076];
            class255 var20 = class255.method144(var19);
            if (var20.field3390 >= 0 && var20.field3433 >= 0) {
                field1067[++Statics.field1076 - 1] = var20.field3433;
            } else {
                field1067[++Statics.field1076 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1068[--Statics.field1070];
            int var22 = field1067[--Statics.field1076];
            client.method3322(var21, var22 == 1);
            field1067[++Statics.field1076 - 1] = Statics.field2339;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field500 == null || Statics.field71 >= Statics.field2339) {
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = Statics.field500[++Statics.field71 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field71 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("c.an(ILcr;ZB)I")
    public static int method127(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1067[++Statics.field1076 - 1] = client.field624;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1076 -= 3;
            client.field624 = field1067[Statics.field1076];
            Statics.field112 = class310.method4578(field1067[Statics.field1076 + 1]);
            if (Statics.field112 == null) {
                Statics.field112 = class310.field3789;
            }
            client.field841 = field1067[Statics.field1076 + 2];
            class188 var3 = class188.method1879(class184.field2201, client.field828.field1300);
            var3.field2321.method5083(client.field624);
            var3.field2321.method5083(Statics.field112.field3792);
            var3.field2321.method5083(client.field841);
            client.field828.method2049(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1068[--Statics.field1070];
            Statics.field1076 -= 2;
            int var5 = field1067[Statics.field1076];
            int var6 = field1067[Statics.field1076 + 1];
            class188 var7 = class188.method1879(class184.field2224, client.field828.field1300);
            var7.field2321.method5083(class300.method4752(var4) + 2);
            var7.field2321.method5043(var4);
            var7.field2321.method5083(var5 - 1);
            var7.field2321.method5083(var6);
            client.field828.method2049(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1076 -= 2;
            int var8 = field1067[Statics.field1076];
            int var9 = field1067[Statics.field1076 + 1];
            class65 var10 = class92.method3215(var8, var9);
            if (var10 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = 0;
                field1068[++Statics.field1070 - 1] = "";
                field1068[++Statics.field1070 - 1] = "";
                field1068[++Statics.field1070 - 1] = "";
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = var10.field583;
                field1067[++Statics.field1076 - 1] = var10.field574;
                field1068[++Statics.field1070 - 1] = var10.field576 == null ? "" : var10.field576;
                field1068[++Statics.field1070 - 1] = var10.field580 == null ? "" : var10.field580;
                field1068[++Statics.field1070 - 1] = var10.field581 == null ? "" : var10.field581;
                field1067[++Statics.field1076 - 1] = var10.method1044() ? 1 : (var10.method1024() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1067[--Statics.field1076];
            class65 var12 = class92.method3749(var11);
            if (var12 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = 0;
                field1068[++Statics.field1070 - 1] = "";
                field1068[++Statics.field1070 - 1] = "";
                field1068[++Statics.field1070 - 1] = "";
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = var12.field575;
                field1067[++Statics.field1076 - 1] = var12.field574;
                field1068[++Statics.field1070 - 1] = var12.field576 == null ? "" : var12.field576;
                field1068[++Statics.field1070 - 1] = var12.field580 == null ? "" : var12.field580;
                field1068[++Statics.field1070 - 1] = var12.field581 == null ? "" : var12.field581;
                field1067[++Statics.field1076 - 1] = var12.method1044() ? 1 : (var12.method1024() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field112 == null) {
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = Statics.field112.field3792;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1068[--Statics.field1070];
            int var14 = field1067[--Statics.field1076];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class225.field2753)) {
                var16 = 0;
                var13 = var13.substring(class225.field2753.length());
            } else if (var15.startsWith(class225.field2920)) {
                var16 = 1;
                var13 = var13.substring(class225.field2920.length());
            } else if (var15.startsWith(class225.field2922)) {
                var16 = 2;
                var13 = var13.substring(class225.field2922.length());
            } else if (var15.startsWith(class225.field2924)) {
                var16 = 3;
                var13 = var13.substring(class225.field2924.length());
            } else if (var15.startsWith(class225.field2926)) {
                var16 = 4;
                var13 = var13.substring(class225.field2926.length());
            } else if (var15.startsWith(class225.field2928)) {
                var16 = 5;
                var13 = var13.substring(class225.field2928.length());
            } else if (var15.startsWith(class225.field2930)) {
                var16 = 6;
                var13 = var13.substring(class225.field2930.length());
            } else if (var15.startsWith(class225.field2932)) {
                var16 = 7;
                var13 = var13.substring(class225.field2932.length());
            } else if (var15.startsWith(class225.field2970)) {
                var16 = 8;
                var13 = var13.substring(class225.field2970.length());
            } else if (var15.startsWith(class225.field2936)) {
                var16 = 9;
                var13 = var13.substring(class225.field2936.length());
            } else if (var15.startsWith(class225.field2938)) {
                var16 = 10;
                var13 = var13.substring(class225.field2938.length());
            } else if (var15.startsWith(class225.field2959)) {
                var16 = 11;
                var13 = var13.substring(class225.field2959.length());
            } else if (Statics.field523 != class191.field2337) {
                if (var15.startsWith(class225.field2958)) {
                    var16 = 0;
                    var13 = var13.substring(class225.field2958.length());
                } else if (var15.startsWith(class225.field2921)) {
                    var16 = 1;
                    var13 = var13.substring(class225.field2921.length());
                } else if (var15.startsWith(class225.field2989)) {
                    var16 = 2;
                    var13 = var13.substring(class225.field2989.length());
                } else if (var15.startsWith(class225.field3038)) {
                    var16 = 3;
                    var13 = var13.substring(class225.field3038.length());
                } else if (var15.startsWith(class225.field2927)) {
                    var16 = 4;
                    var13 = var13.substring(class225.field2927.length());
                } else if (var15.startsWith(class225.field2998)) {
                    var16 = 5;
                    var13 = var13.substring(class225.field2998.length());
                } else if (var15.startsWith(class225.field2918)) {
                    var16 = 6;
                    var13 = var13.substring(class225.field2918.length());
                } else if (var15.startsWith(class225.field2933)) {
                    var16 = 7;
                    var13 = var13.substring(class225.field2933.length());
                } else if (var15.startsWith(class225.field2935)) {
                    var16 = 8;
                    var13 = var13.substring(class225.field2935.length());
                } else if (var15.startsWith(class225.field2937)) {
                    var16 = 9;
                    var13 = var13.substring(class225.field2937.length());
                } else if (var15.startsWith(class225.field2939)) {
                    var16 = 10;
                    var13 = var13.substring(class225.field2939.length());
                } else if (var15.startsWith(class225.field2941)) {
                    var16 = 11;
                    var13 = var13.substring(class225.field2941.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class225.field2942)) {
                var18 = 1;
                var13 = var13.substring(class225.field2942.length());
            } else if (var17.startsWith(class225.field2944)) {
                var18 = 2;
                var13 = var13.substring(class225.field2944.length());
            } else if (var17.startsWith(class225.field2946)) {
                var18 = 3;
                var13 = var13.substring(class225.field2946.length());
            } else if (var17.startsWith(class225.field2948)) {
                var18 = 4;
                var13 = var13.substring(class225.field2948.length());
            } else if (var17.startsWith(class225.field2786)) {
                var18 = 5;
                var13 = var13.substring(class225.field2786.length());
            } else if (Statics.field523 != class191.field2337) {
                if (var17.startsWith(class225.field2943)) {
                    var18 = 1;
                    var13 = var13.substring(class225.field2943.length());
                } else if (var17.startsWith(class225.field2945)) {
                    var18 = 2;
                    var13 = var13.substring(class225.field2945.length());
                } else if (var17.startsWith(class225.field2947)) {
                    var18 = 3;
                    var13 = var13.substring(class225.field2947.length());
                } else if (var17.startsWith(class225.field2949)) {
                    var18 = 4;
                    var13 = var13.substring(class225.field2949.length());
                } else if (var17.startsWith(class225.field2951)) {
                    var18 = 5;
                    var13 = var13.substring(class225.field2951.length());
                }
            }
            class188 var19 = class188.method1879(class184.field2283, client.field828.field1300);
            var19.field2321.method5083(0);
            int var20 = var19.field2321.field3704;
            var19.field2321.method5083(var14);
            var19.field2321.method5083(var16);
            var19.field2321.method5083(var18);
            class211.method4021(var19.field2321, var13);
            var19.field2321.method5241(var19.field2321.field3704 - var20);
            client.field828.method2049(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1070 -= 2;
            String var21 = field1068[Statics.field1070];
            String var22 = field1068[Statics.field1070 + 1];
            class188 var23 = class188.method1879(class184.field2211, client.field828.field1300);
            var23.field2321.method5037(0);
            int var24 = var23.field2321.field3704;
            var23.field2321.method5043(var21);
            class211.method4021(var23.field2321, var22);
            var23.field2321.method5048(var23.field2321.field3704 - var24);
            client.field828.method2049(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field177 == null || Statics.field177.field591 == null) {
                var25 = "";
            } else {
                var25 = Statics.field177.field591.method4767();
            }
            field1068[++Statics.field1070 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1067[++Statics.field1076 - 1] = client.field841;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = class92.method3030(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = class92.method3032(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = class92.method3367(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1068[--Statics.field1070];
            Statics.method3159(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field669 = field1068[--Statics.field1070].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1068[++Statics.field1070 - 1] = client.field669;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1068[--Statics.field1070];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bd.at(ILcr;ZI)I")
    public static int method1101(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1067[++Statics.field1076 - 1] = client.method3141();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1067[--Statics.field1076];
            if (var3 == 1 || var3 == 2) {
                client.method3755(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1067[++Statics.field1076 - 1] = Statics.field69.field1032;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1067[--Statics.field1076];
            if (var4 == 1 || var4 == 2) {
                Statics.field69.field1032 = var4;
                class74.method135();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1076--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hx.as(ILcr;ZB)I")
    public static int method3741(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1076 -= 2;
            int var3 = field1067[Statics.field1076];
            int var4 = field1067[Statics.field1076 + 1];
            if (!client.field708) {
                client.field693 = var3;
                client.field694 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1067[++Statics.field1076 - 1] = client.field693;
            return 1;
        } else if (arg0 == 5506) {
            field1067[++Statics.field1076 - 1] = client.field694;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1067[--Statics.field1076];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field867 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1067[++Statics.field1076 - 1] = client.field867;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("en.ak(ILcr;ZI)I")
    public static int method3023(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field672 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kw.ao(II)I")
    public static int method5308(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("cg.ac(II)I")
    public static int method2037(int arg0) {
        return (int) ((Math.log((double) arg0) / field1079 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("ab.ar(ILcr;ZI)I")
    public static int method688(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1076 -= 2;
            client.field874 = (short) method5308(field1067[Statics.field1076]);
            if (client.field874 <= 0) {
                client.field874 = 256;
            }
            client.field823 = (short) method5308(field1067[Statics.field1076 + 1]);
            if (client.field823 <= 0) {
                client.field823 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1076 -= 2;
            client.field876 = (short) field1067[Statics.field1076];
            if (client.field876 <= 0) {
                client.field876 = 256;
            }
            client.field877 = (short) field1067[Statics.field1076 + 1];
            if (client.field877 <= 0) {
                client.field877 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1076 -= 4;
            client.field796 = (short) field1067[Statics.field1076];
            if (client.field796 <= 0) {
                client.field796 = 1;
            }
            client.field662 = (short) field1067[Statics.field1076 + 1];
            if (client.field662 <= 0) {
                client.field662 = 32767;
            } else if (client.field662 < client.field796) {
                client.field662 = client.field796;
            }
            client.field653 = (short) field1067[Statics.field1076 + 2];
            if (client.field653 <= 0) {
                client.field653 = 1;
            }
            client.field792 = (short) field1067[Statics.field1076 + 3];
            if (client.field792 <= 0) {
                client.field792 = 32767;
            } else if (client.field792 < client.field653) {
                client.field792 = client.field653;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field721 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                client.method1654(0, 0, client.field721.field2562, client.field721.field2563, false);
                field1067[++Statics.field1076 - 1] = client.field884;
                field1067[++Statics.field1076 - 1] = client.field686;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1067[++Statics.field1076 - 1] = client.field876;
            field1067[++Statics.field1076 - 1] = client.field877;
            return 1;
        } else if (arg0 == 6205) {
            field1067[++Statics.field1076 - 1] = method2037(client.field874);
            field1067[++Statics.field1076 - 1] = method2037(client.field823);
            return 1;
        } else if (arg0 == 6220) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1067[++Statics.field1076 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1067[++Statics.field1076 - 1] = Statics.field3255;
            return 1;
        } else if (arg0 == 6223) {
            field1067[++Statics.field1076 - 1] = Statics.field256;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ec.au(ILcr;ZI)I")
    public static int method3041(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1067[++Statics.field1076 - 1] = class72.method3291() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class72 var3 = class72.method669();
            if (var3 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = 0;
                field1068[++Statics.field1070 - 1] = "";
                field1067[++Statics.field1076 - 1] = 0;
                field1067[++Statics.field1076 - 1] = 0;
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1067[++Statics.field1076 - 1] = var3.field997;
                field1067[++Statics.field1076 - 1] = var3.field998;
                field1068[++Statics.field1070 - 1] = var3.field1001;
                field1067[++Statics.field1076 - 1] = var3.field1002;
                field1067[++Statics.field1076 - 1] = var3.field999;
                field1068[++Statics.field1070 - 1] = var3.field1000;
            }
            return 1;
        } else if (arg0 == 6502) {
            class72 var4 = class72.method134();
            if (var4 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = 0;
                field1068[++Statics.field1070 - 1] = "";
                field1067[++Statics.field1076 - 1] = 0;
                field1067[++Statics.field1076 - 1] = 0;
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1067[++Statics.field1076 - 1] = var4.field997;
                field1067[++Statics.field1076 - 1] = var4.field998;
                field1068[++Statics.field1070 - 1] = var4.field1001;
                field1067[++Statics.field1076 - 1] = var4.field1002;
                field1067[++Statics.field1076 - 1] = var4.field999;
                field1068[++Statics.field1070 - 1] = var4.field1000;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1067[--Statics.field1076];
            class72 var6 = null;
            for (int var7 = 0; var7 < class72.field993; var7++) {
                if (Statics.field1284[var7].field997 == var5) {
                    var6 = Statics.field1284[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = 0;
                field1068[++Statics.field1070 - 1] = "";
                field1067[++Statics.field1076 - 1] = 0;
                field1067[++Statics.field1076 - 1] = 0;
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1067[++Statics.field1076 - 1] = var6.field997;
                field1067[++Statics.field1076 - 1] = var6.field998;
                field1068[++Statics.field1070 - 1] = var6.field1001;
                field1067[++Statics.field1076 - 1] = var6.field1002;
                field1067[++Statics.field1076 - 1] = var6.field999;
                field1068[++Statics.field1070 - 1] = var6.field1000;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1076 -= 4;
            int var8 = field1067[Statics.field1076];
            boolean var9 = field1067[Statics.field1076 + 1] == 1;
            int var10 = field1067[Statics.field1076 + 2];
            boolean var11 = field1067[Statics.field1076 + 3] == 1;
            class72.method919(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1067[--Statics.field1076];
            if (var12 >= 0 && var12 < class72.field993) {
                class72 var13 = Statics.field1284[var12];
                field1067[++Statics.field1076 - 1] = var13.field997;
                field1067[++Statics.field1076 - 1] = var13.field998;
                field1068[++Statics.field1070 - 1] = var13.field1001;
                field1067[++Statics.field1076 - 1] = var13.field1002;
                field1067[++Statics.field1076 - 1] = var13.field999;
                field1068[++Statics.field1070 - 1] = var13.field1000;
            } else {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = 0;
                field1068[++Statics.field1070 - 1] = "";
                field1067[++Statics.field1076 - 1] = 0;
                field1067[++Statics.field1076 - 1] = 0;
                field1068[++Statics.field1070 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field769 = field1067[--Statics.field1076] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1076 -= 2;
            int var14 = field1067[Statics.field1076];
            int var15 = field1067[Statics.field1076 + 1];
            class250 var16 = class250.method4003(var15);
            if (var16.method4098()) {
                field1068[++Statics.field1070 - 1] = class257.method2739(var14).method4341(var15, var16.field3286);
            } else {
                field1067[++Statics.field1076 - 1] = class257.method2739(var14).method4329(var15, var16.field3287);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1076 -= 2;
            int var17 = field1067[Statics.field1076];
            int var18 = field1067[Statics.field1076 + 1];
            class250 var19 = class250.method4003(var18);
            if (var19.method4098()) {
                field1068[++Statics.field1070 - 1] = class254.method3676(var17).method4211(var18, var19.field3286);
            } else {
                field1067[++Statics.field1076 - 1] = class254.method3676(var17).method4196(var18, var19.field3287);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1076 -= 2;
            int var20 = field1067[Statics.field1076];
            int var21 = field1067[Statics.field1076 + 1];
            class250 var22 = class250.method4003(var21);
            if (var22.method4098()) {
                field1068[++Statics.field1070 - 1] = class255.method144(var20).method4248(var21, var22.field3286);
            } else {
                field1067[++Statics.field1076 - 1] = class255.method144(var20).method4247(var21, var22.field3287);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1076 -= 2;
            int var23 = field1067[Statics.field1076];
            int var24 = field1067[Statics.field1076 + 1];
            class250 var25 = class250.method4003(var24);
            if (var25.method4098()) {
                field1068[++Statics.field1070 - 1] = class251.method631(var23).method4121(var24, var25.field3286);
            } else {
                field1067[++Statics.field1076 - 1] = class251.method631(var23).method4126(var24, var25.field3287);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1067[++Statics.field1076 - 1] = client.field631 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1067[++Statics.field1076 - 1] = client.field671 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1070--;
            Statics.field1076--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1070--;
            Statics.field1076--;
            return 1;
        } else if (arg0 == 6524) {
            field1067[++Statics.field1076 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1067[++Statics.field1076 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1067[++Statics.field1076 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.ax(ILcr;ZB)I")
    public static int method1003(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field519;
            int var4 = (Statics.field177.field957 >> 7) + Statics.field1299;
            int var5 = (Statics.field177.field918 >> 7) + Statics.field2085;
            client.method1656().method5782(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1067[--Statics.field1076];
            String var7 = "";
            class27 var8 = client.method1656().method5800(var6);
            if (var8 != null) {
                var7 = var8.method280();
            }
            field1068[++Statics.field1070 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1067[--Statics.field1076];
            client.method1656().method5783(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1067[++Statics.field1076 - 1] = client.method1656().method5797();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1067[--Statics.field1076];
            client.method1656().method5794(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1067[++Statics.field1076 - 1] = client.method1656().method5799() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class214 var11 = new class214(field1067[--Statics.field1076]);
            client.method1656().method5851(var11.field2513, var11.field2511);
            return 1;
        } else if (arg0 == 6607) {
            class214 var12 = new class214(field1067[--Statics.field1076]);
            client.method1656().method5955(var12.field2513, var12.field2511);
            return 1;
        } else if (arg0 == 6608) {
            class214 var13 = new class214(field1067[--Statics.field1076]);
            client.method1656().method5853(var13.field2515, var13.field2513, var13.field2511);
            return 1;
        } else if (arg0 == 6609) {
            class214 var14 = new class214(field1067[--Statics.field1076]);
            client.method1656().method5822(var14.field2515, var14.field2513, var14.field2511);
            return 1;
        } else if (arg0 == 6610) {
            field1067[++Statics.field1076 - 1] = client.method1656().method5828();
            field1067[++Statics.field1076 - 1] = client.method1656().method5806();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1067[--Statics.field1076];
            class27 var16 = client.method1656().method5800(var15);
            if (var16 == null) {
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = var16.method328().method3630();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1067[--Statics.field1076];
            class27 var18 = client.method1656().method5800(var17);
            if (var18 == null) {
                field1067[++Statics.field1076 - 1] = 0;
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = (var18.method284() - var18.method283() + 1) * 64;
                field1067[++Statics.field1076 - 1] = (var18.method286() - var18.method290() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1067[--Statics.field1076];
            class27 var20 = client.method1656().method5800(var19);
            if (var20 == null) {
                field1067[++Statics.field1076 - 1] = 0;
                field1067[++Statics.field1076 - 1] = 0;
                field1067[++Statics.field1076 - 1] = 0;
                field1067[++Statics.field1076 - 1] = 0;
            } else {
                field1067[++Statics.field1076 - 1] = var20.method283() * 64;
                field1067[++Statics.field1076 - 1] = var20.method290() * 64;
                field1067[++Statics.field1076 - 1] = var20.method284() * 64 + 64 - 1;
                field1067[++Statics.field1076 - 1] = var20.method286() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1067[--Statics.field1076];
            class27 var22 = client.method1656().method5800(var21);
            if (var22 == null) {
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = var22.method282();
            }
            return 1;
        } else if (arg0 == 6615) {
            class214 var23 = client.method1656().method5804();
            if (var23 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = var23.field2513;
                field1067[++Statics.field1076 - 1] = var23.field2511;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1067[++Statics.field1076 - 1] = client.method1656().method5902();
            return 1;
        } else if (arg0 == 6617) {
            class214 var24 = new class214(field1067[--Statics.field1076]);
            class27 var25 = client.method1656().method5803();
            if (var25 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method274(var24.field2515, var24.field2513, var24.field2511);
            if (var26 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = var26[0];
                field1067[++Statics.field1076 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class214 var27 = new class214(field1067[--Statics.field1076]);
            class27 var28 = client.method1656().method5803();
            if (var28 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = -1;
                return 1;
            }
            class214 var29 = var28.method275(var27.field2513, var27.field2511);
            if (var29 == null) {
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = var29.method3630();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1076 -= 2;
            int var30 = field1067[Statics.field1076];
            class214 var31 = new class214(field1067[Statics.field1076 + 1]);
            method3605(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1076 -= 2;
            int var32 = field1067[Statics.field1076];
            class214 var33 = new class214(field1067[Statics.field1076 + 1]);
            method3605(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1076 -= 2;
            int var34 = field1067[Statics.field1076];
            class214 var35 = new class214(field1067[Statics.field1076 + 1]);
            class27 var36 = client.method1656().method5800(var34);
            if (var36 == null) {
                field1067[++Statics.field1076 - 1] = 0;
                return 1;
            } else {
                field1067[++Statics.field1076 - 1] = var36.method272(var35.field2515, var35.field2513, var35.field2511) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1067[++Statics.field1076 - 1] = client.method1656().method5887();
            field1067[++Statics.field1076 - 1] = client.method1656().method5809();
            return 1;
        } else if (arg0 == 6623) {
            class214 var37 = new class214(field1067[--Statics.field1076]);
            class27 var38 = client.method1656().method5781(var37.field2515, var37.field2513, var37.field2511);
            if (var38 == null) {
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = var38.method338();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1656().method5810(field1067[--Statics.field1076]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1656().method5848();
            return 1;
        } else if (arg0 == 6626) {
            client.method1656().method5812(field1067[--Statics.field1076]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1656().method5813();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1067[--Statics.field1076] == 1;
            client.method1656().method5814(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1067[--Statics.field1076];
            client.method1656().method5815(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1067[--Statics.field1076];
            client.method1656().method5816(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1656().method5817();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1067[--Statics.field1076] == 1;
            client.method1656().method5818(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1076 -= 2;
            int var43 = field1067[Statics.field1076];
            boolean var44 = field1067[Statics.field1076 + 1] == 1;
            client.method1656().method5855(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1076 -= 2;
            int var45 = field1067[Statics.field1076];
            boolean var46 = field1067[Statics.field1076 + 1] == 1;
            client.method1656().method5820(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1067[++Statics.field1076 - 1] = client.method1656().method5844() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = client.method1656().method5843(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1067[--Statics.field1076];
            field1067[++Statics.field1076 - 1] = client.method1656().method5823(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1076 -= 2;
            int var49 = field1067[Statics.field1076];
            class214 var50 = new class214(field1067[Statics.field1076 + 1]);
            class214 var51 = client.method1656().method5826(var49, var50);
            if (var51 == null) {
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = var51.method3630();
            }
            return 1;
        } else if (arg0 == 6639) {
            class35 var52 = client.method1656().method5911();
            if (var52 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = var52.method169();
                field1067[++Statics.field1076 - 1] = var52.field289.method3630();
            }
            return 1;
        } else if (arg0 == 6640) {
            class35 var53 = client.method1656().method5829();
            if (var53 == null) {
                field1067[++Statics.field1076 - 1] = -1;
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = var53.method169();
                field1067[++Statics.field1076 - 1] = var53.field289.method3630();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1067[--Statics.field1076];
            class242 var55 = class242.method156(var54);
            if (var55.field3200 == null) {
                field1068[++Statics.field1070 - 1] = "";
            } else {
                field1068[++Statics.field1070 - 1] = var55.field3200;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1067[--Statics.field1076];
            class242 var57 = class242.method156(var56);
            field1067[++Statics.field1076 - 1] = var57.field3197;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1067[--Statics.field1076];
            class242 var59 = class242.method156(var58);
            if (var59 == null) {
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = var59.field3214;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1067[--Statics.field1076];
            class242 var61 = class242.method156(var60);
            if (var61 == null) {
                field1067[++Statics.field1076 - 1] = -1;
            } else {
                field1067[++Statics.field1076 - 1] = var61.field3198;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1067[++Statics.field1076 - 1] = Statics.field1996.field335;
            return 1;
        } else if (arg0 == 6698) {
            field1067[++Statics.field1076 - 1] = Statics.field1996.field336.method3630();
            return 1;
        } else if (arg0 == 6699) {
            field1067[++Statics.field1076 - 1] = Statics.field1996.field337.method3630();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ae.ag(II)V")
    public static void method721(int arg0) {
        if (arg0 == -1 || !class218.method1922(arg0)) {
            return;
        }
        class218[] var1 = Statics.field2542[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2554 != null) {
                class63 var4 = new class63();
                var4.field548 = var3;
                var4.field551 = var3.field2554;
                method261(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("hc.aa(ILhd;ZI)V")
    public static void method3605(int arg0, class214 arg1, boolean arg2) {
        class27 var3 = client.method1656().method5800(arg0);
        int var4 = Statics.field177.field611;
        int var5 = (Statics.field177.field957 >> 7) + Statics.field1299;
        int var6 = (Statics.field177.field918 >> 7) + Statics.field2085;
        class214 var7 = new class214(var4, var5, var6);
        client.method1656().method5788(var3, var7, arg1, arg2);
    }
}
