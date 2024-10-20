package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bv")
public class class77 {

    @ObfuscatedName("bv.o")
    public static int[] field1067 = new int[5];

    @ObfuscatedName("bv.u")
    public static int[][] field1063 = new int[5][5000];

    @ObfuscatedName("bv.g")
    public static int[] field1064 = new int[1000];

    @ObfuscatedName("bv.e")
    public static String[] field1065 = new String[1000];

    @ObfuscatedName("bv.d")
    public static int field1062 = 0;

    @ObfuscatedName("bv.k")
    public static class57[] field1068 = new class57[50];

    @ObfuscatedName("bv.a")
    public static Calendar field1069 = Calendar.getInstance();

    @ObfuscatedName("bv.z")
    public static final String[] field1071 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bv.s")
    public static boolean field1059 = false;

    @ObfuscatedName("bv.t")
    public static boolean field1072 = false;

    @ObfuscatedName("bv.y")
    public static int field1073 = 0;

    @ObfuscatedName("bv.r")
    public static final double field1074 = Math.log(2.0D);

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ir.m(Lby;S)V")
    public static void method4251(class63 arg0) {
        method68(arg0, 500000);
    }

    @ObfuscatedName("l.f(Lby;II)V")
    public static void method68(class63 arg0, int arg1) {
        Object[] var2 = arg0.field554;
        class93 var4;
        if (class301.method145(arg0.field560)) {
            Statics.field79 = (class42) var2[0];
            class253 var3 = class253.method2731(Statics.field79.field335);
            var4 = class93.method2978(arg0.field560, var3.field3297, var3.field3305);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class93.method2238(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field2126 = 0;
        Statics.field1066 = 0;
        int var6 = -1;
        int[] var7 = var4.field1257;
        int[] var8 = var4.field1259;
        byte var9 = -1;
        field1062 = 0;
        field1059 = false;
        try {
            Statics.field3717 = new int[var4.field1261];
            int var10 = 0;
            Statics.field1061 = new String[var4.field1262];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field546;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field547;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field558 == null ? -1 : arg0.field558.field2644;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field548;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field558 == null ? -1 : arg0.field558.field2645;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field553 == null ? -1 : arg0.field553.field2644;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field553 == null ? -1 : arg0.field553.field2645;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field550;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field551;
                    }
                    Statics.field3717[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field552;
                    }
                    Statics.field1061[var11++] = var14;
                }
            }
            int var15 = 0;
            field1073 = arg0.field549;
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
                    int var44 = method3385(var53, var4, var43);
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
                    field1064[++Statics.field2126 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1064[++Statics.field2126 - 1] = class224.field2601[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class224.field2601[var17] = field1064[--Statics.field2126];
                    client.method4292(var17);
                } else if (var53 == 3) {
                    field1065[++Statics.field1066 - 1] = var4.field1260[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field2126 -= 2;
                    if (field1064[Statics.field2126] != field1064[Statics.field2126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field2126 -= 2;
                    if (field1064[Statics.field2126] == field1064[Statics.field2126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field2126 -= 2;
                    if (field1064[Statics.field2126] < field1064[Statics.field2126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field2126 -= 2;
                    if (field1064[Statics.field2126] > field1064[Statics.field2126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1062 == 0) {
                        return;
                    }
                    class57 var18 = field1068[--field1062];
                    var4 = var18.field497;
                    var7 = var4.field1257;
                    var8 = var4.field1259;
                    var6 = var18.field498;
                    Statics.field3717 = var18.field499;
                    Statics.field1061 = var18.field500;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1064[++Statics.field2126 - 1] = class224.method529(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class224.method1534(var20, field1064[--Statics.field2126]);
                } else if (var53 == 31) {
                    Statics.field2126 -= 2;
                    if (field1064[Statics.field2126] <= field1064[Statics.field2126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field2126 -= 2;
                    if (field1064[Statics.field2126] >= field1064[Statics.field2126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1064[++Statics.field2126 - 1] = Statics.field3717[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field3717[var8[var6]] = field1064[--Statics.field2126];
                } else if (var53 == 35) {
                    field1065[++Statics.field1066 - 1] = Statics.field1061[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field1061[var8[var6]] = field1065[--Statics.field1066];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field1066 -= var21;
                    String var22 = Statics.method4939(field1065, Statics.field1066, var21);
                    field1065[++Statics.field1066 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field2126--;
                } else if (var53 == 39) {
                    Statics.field1066--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class93 var24 = class93.method2238(var23);
                    int[] var25 = new int[var24.field1261];
                    String[] var26 = new String[var24.field1262];
                    for (int var27 = 0; var27 < var24.field1263; var27++) {
                        var25[var27] = field1064[Statics.field2126 - var24.field1263 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1264; var28++) {
                        var26[var28] = field1065[Statics.field1066 - var24.field1264 + var28];
                    }
                    Statics.field2126 -= var24.field1263;
                    Statics.field1066 -= var24.field1264;
                    class57 var29 = new class57();
                    var29.field497 = var4;
                    var29.field498 = var6;
                    var29.field499 = Statics.field3717;
                    var29.field500 = Statics.field1061;
                    field1068[++field1062 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1257;
                    var8 = var24.field1259;
                    var6 = -1;
                    Statics.field3717 = var25;
                    Statics.field1061 = var26;
                } else if (var53 == 42) {
                    field1064[++Statics.field2126 - 1] = Statics.field2390.method1940(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field2390.method1939(var8[var6], field1064[--Statics.field2126]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1064[--Statics.field2126];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1067[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1063[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1064[--Statics.field2126];
                    if (var36 < 0 || var36 >= field1067[var35]) {
                        throw new RuntimeException();
                    }
                    field1064[++Statics.field2126 - 1] = field1063[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field2126 -= 2;
                    int var38 = field1064[Statics.field2126];
                    if (var38 < 0 || var38 >= field1067[var37]) {
                        throw new RuntimeException();
                    }
                    field1063[var37][var38] = field1064[Statics.field2126 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field2390.method1944(var8[var6]);
                    if (var39 == null) {
                        var39 = class236.field2980;
                    }
                    field1065[++Statics.field1066 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field2390.method1968(var8[var6], field1065[--Statics.field1066]);
                } else if (var53 == 49) {
                    String var40 = Statics.field2390.method1969(var8[var6]);
                    field1065[++Statics.field1066 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field2390.method1941(var8[var6], field1065[--Statics.field1066]);
                } else if (var53 == 60) {
                    class317 var41 = var4.field1265[var8[var6]];
                    class185 var42 = (class185) var41.method5382((long) field1064[--Statics.field2126]);
                    if (var42 != null) {
                        var6 += var42.field2138;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2139).append(" ");
            for (int var47 = field1062 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1068[var47].field497.field2139).append(" ");
            }
            var46.append("").append(var9);
            class166.method4746(var46.toString(), var51);
        } finally {
            if (field1059) {
                field1072 = true;
                client.method181();
                field1072 = false;
                field1059 = false;
            }
        }
    }

    @ObfuscatedName("gy.q(ILcg;ZB)I")
    public static int method3385(int arg0, class93 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method723(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return Statics.method8(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method4538(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method519(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method597(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method124(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method233(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method1047(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method1848(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method171(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method1702(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return Statics.method8(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method4538(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method519(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method597(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method124(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method2732(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method58(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method129(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method165(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method1702(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method37(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method51(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method1049(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method1847(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method5181(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method4330(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method2501(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method3745(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method11(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2036(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3053(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method1147(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method2279(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method4119(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method516(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method955(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ao.w(ILcg;ZI)I")
    public static int method723(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field2126 -= 3;
            int var3 = field1064[Statics.field2126];
            int var4 = field1064[Statics.field2126 + 1];
            int var5 = field1064[Statics.field2126 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class229 var6 = class229.method3345(var3);
            if (var6.field2774 == null) {
                var6.field2774 = new class229[var5 + 1];
            }
            if (var6.field2774.length <= var5) {
                class229[] var7 = new class229[var5 + 1];
                for (int var8 = 0; var8 < var6.field2774.length; var8++) {
                    var7[var8] = var6.field2774[var8];
                }
                var6.field2774 = var7;
            }
            if (var5 > 0 && var6.field2774[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class229 var9 = new class229();
            var9.field2646 = var4;
            var9.field2663 = var9.field2644 = var6.field2644;
            var9.field2645 = var5;
            var9.field2643 = true;
            var6.field2774[var5] = var9;
            if (arg2) {
                Statics.field112 = var9;
            } else {
                Statics.field65 = var9;
            }
            client.method272(var6);
            return 1;
        } else if (arg0 == 101) {
            class229 var10 = arg2 ? Statics.field112 : Statics.field65;
            class229 var11 = class229.method3345(var10.field2644);
            var11.field2774[var10.field2645] = null;
            client.method272(var11);
            return 1;
        } else if (arg0 == 102) {
            class229 var12 = class229.method3345(field1064[--Statics.field2126]);
            var12.field2774 = null;
            client.method272(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field2126 -= 2;
            int var13 = field1064[Statics.field2126];
            int var14 = field1064[Statics.field2126 + 1];
            class229 var15 = class229.method3661(var13, var14);
            if (var15 == null || var14 == -1) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = 1;
                if (arg2) {
                    Statics.field112 = var15;
                } else {
                    Statics.field65 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class229 var16 = class229.method3345(field1064[--Statics.field2126]);
            if (var16 == null) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = 1;
                if (arg2) {
                    Statics.field112 = var16;
                } else {
                    Statics.field65 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jq.u(ILcg;ZI)I")
    public static int method4538(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class229 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1064[--Statics.field2126];
            var4 = class229.method3345(var3);
        } else {
            var4 = arg2 ? Statics.field112 : Statics.field65;
        }
        if (arg0 == 1100) {
            Statics.field2126 -= 2;
            var4.field2665 = field1064[Statics.field2126];
            if (var4.field2665 > var4.field2667 - var4.field2765) {
                var4.field2665 = var4.field2667 - var4.field2765;
            }
            if (var4.field2665 < 0) {
                var4.field2665 = 0;
            }
            var4.field2734 = field1064[Statics.field2126 + 1];
            if (var4.field2734 > var4.field2668 - var4.field2678) {
                var4.field2734 = var4.field2668 - var4.field2678;
            }
            if (var4.field2734 < 0) {
                var4.field2734 = 0;
            }
            client.method272(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2669 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2760 = field1064[--Statics.field2126] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2778 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2677 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2679 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2662 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2682 = field1064[--Statics.field2126] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2757 = 1;
            var4.field2688 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field2126 -= 6;
            var4.field2693 = field1064[Statics.field2126];
            var4.field2718 = field1064[Statics.field2126 + 1];
            var4.field2641 = field1064[Statics.field2126 + 2];
            var4.field2696 = field1064[Statics.field2126 + 3];
            var4.field2697 = field1064[Statics.field2126 + 4];
            var4.field2698 = field1064[Statics.field2126 + 5];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1064[--Statics.field2126];
            if (var4.field2691 != var5) {
                var4.field2691 = var5;
                var4.field2771 = 0;
                var4.field2773 = 0;
                client.method272(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2701 = field1064[--Statics.field2126] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1065[--Statics.field1066];
            if (!var6.equals(var4.field2705)) {
                var4.field2705 = var6;
                client.method272(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2704 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field2126 -= 3;
            var4.field2708 = field1064[Statics.field2126];
            var4.field2709 = field1064[Statics.field2126 + 1];
            var4.field2763 = field1064[Statics.field2126 + 2];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2710 = field1064[--Statics.field2126] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2673 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2684 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2685 = field1064[--Statics.field2126] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2686 = field1064[--Statics.field2126] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field2126 -= 2;
            var4.field2667 = field1064[Statics.field2126];
            var4.field2668 = field1064[Statics.field2126 + 1];
            client.method272(var4);
            if (var3 != -1 && var4.field2646 == 0) {
                client.method620(Statics.field2634[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method2809(var4.field2644, var4.field2645);
            client.field788 = var4;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2680 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2670 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2676 = field1064[--Statics.field2126];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1064[--Statics.field2126];
            class326 var8 = (class326) class197.method999(class326.method5357(), var7);
            if (var8 != null) {
                var4.field2666 = var8;
                client.method272(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1064[--Statics.field2126] == 1;
            var4.field2694 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1064[--Statics.field2126] == 1;
            var4.field2702 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.g(ILcg;ZB)I")
    public static int method519(int arg0, class93 arg1, boolean arg2) {
        class229 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class229.method3345(field1064[--Statics.field2126]);
        } else {
            var3 = arg2 ? Statics.field112 : Statics.field65;
        }
        client.method272(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field2126 -= 2;
            int var4 = field1064[Statics.field2126];
            int var5 = field1064[Statics.field2126 + 1];
            var3.field2770 = var4;
            var3.field2720 = var5;
            class266 var6 = class266.method4129(var4);
            var3.field2641 = var6.field3488;
            var3.field2696 = var6.field3516;
            var3.field2697 = var6.field3490;
            var3.field2693 = var6.field3496;
            var3.field2718 = var6.field3492;
            var3.field2698 = var6.field3487;
            if (arg0 == 1205) {
                var3.field2729 = 0;
            } else if (arg0 == 1212 | var6.field3493 == 1) {
                var3.field2729 = 1;
            } else {
                var3.field2729 = 2;
            }
            if (var3.field2741 > 0) {
                var3.field2698 = var3.field2698 * 32 / var3.field2741;
            } else if (var3.field2655 > 0) {
                var3.field2698 = var3.field2698 * 32 / var3.field2655;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2757 = 2;
            var3.field2688 = field1064[--Statics.field2126];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2757 = 3;
            var3.field2688 = Statics.field389.field588.method4032();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ae.l(ILcg;ZI)I")
    public static int method597(int arg0, class93 arg1, boolean arg2) {
        boolean var3 = true;
        class229 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class229.method3345(field1064[--Statics.field2126]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field112 : Statics.field65;
        }
        if (arg0 == 1300) {
            int var5 = field1064[--Statics.field2126] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4089(var5, field1065[--Statics.field1066]);
                return 1;
            } else {
                Statics.field1066--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field2126 -= 2;
            int var6 = field1064[Statics.field2126];
            int var7 = field1064[Statics.field2126 + 1];
            var4.field2747 = class229.method3661(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2728 = field1064[--Statics.field2126] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2661 = field1064[--Statics.field2126];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2727 = field1064[--Statics.field2126];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2723 = field1065[--Statics.field1066];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2675 = field1065[--Statics.field1066];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2783 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2786 = field1064[--Statics.field2126] == 1;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field2126 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1064[Statics.field2126 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1064[Statics.field2126 + var10];
                        var9[var10 / 2] = (byte) field1064[Statics.field2126 + var10 + 1];
                    }
                }
            } else {
                Statics.field2126 -= 2;
                var8 = new byte[] { (byte) field1064[Statics.field2126] };
                var9 = new byte[] { (byte) field1064[Statics.field2126 + 1] };
            }
            int var11 = field1064[--Statics.field2126] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method3247(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field2126 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1064[Statics.field2126] };
            byte[] var14 = new byte[] { (byte) field1064[Statics.field2126 + 1] };
            method3247(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field2126 -= 3;
            int var15 = field1064[Statics.field2126] - 1;
            int var16 = field1064[Statics.field2126 + 1];
            int var17 = field1064[Statics.field2126 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method1984(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1064[--Statics.field2126];
            int var20 = field1064[--Statics.field2126];
            method1984(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field2126--;
            int var21 = field1064[Statics.field2126] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method288(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method288(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fr.e(Lho;I[B[BI)V")
    public static final void method3247(class229 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2719 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2719 = new byte[11][];
            arg0.field2695 = new byte[11][];
            arg0.field2721 = new int[11];
            arg0.field2725 = new int[11];
        }
        arg0.field2719[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2724 = false;
            for (int var4 = 0; var4 < arg0.field2719.length; var4++) {
                if (arg0.field2719[var4] != null) {
                    arg0.field2724 = true;
                    break;
                }
            }
        } else {
            arg0.field2724 = true;
        }
        arg0.field2695[arg1] = arg3;
    }

    @ObfuscatedName("ch.x(Lho;IIII)V")
    public static final void method1984(class229 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2721 == null) {
            throw new RuntimeException();
        }
        arg0.field2721[arg1] = arg2;
        arg0.field2725[arg1] = arg3;
    }

    @ObfuscatedName("p.d(Lho;II)V")
    public static final void method288(class229 arg0, int arg1) {
        if (arg0.field2719 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2687 == null) {
            arg0.field2687 = new int[arg0.field2719.length];
        }
        arg0.field2687[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("k.a(ILcg;ZI)I")
    public static int method124(int arg0, class93 arg1, boolean arg2) {
        class229 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class229.method3345(field1064[--Statics.field2126]);
        } else {
            var3 = arg2 ? Statics.field112 : Statics.field65;
        }
        String var4 = field1065[--Statics.field1066];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1064[--Statics.field2126];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1064[--Statics.field2126];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1065[--Statics.field1066];
            } else {
                var7[var8] = Integer.valueOf(field1064[--Statics.field2126]);
            }
        }
        int var9 = field1064[--Statics.field2126];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2683 = var7;
        } else if (arg0 == 1401) {
            var3.field2735 = var7;
        } else if (arg0 == 1402) {
            var3.field2784 = var7;
        } else if (arg0 == 1403) {
            var3.field2736 = var7;
        } else if (arg0 == 1404) {
            var3.field2722 = var7;
        } else if (arg0 == 1405) {
            var3.field2739 = var7;
        } else if (arg0 == 1406) {
            var3.field2738 = var7;
        } else if (arg0 == 1407) {
            var3.field2745 = var7;
            var3.field2744 = var5;
        } else if (arg0 == 1408) {
            var3.field2681 = var7;
        } else if (arg0 == 1409) {
            var3.field2750 = var7;
        } else if (arg0 == 1410) {
            var3.field2740 = var7;
        } else if (arg0 == 1411) {
            var3.field2733 = var7;
        } else if (arg0 == 1412) {
            var3.field2737 = var7;
        } else if (arg0 == 1414) {
            var3.field2748 = var7;
            var3.field2746 = var5;
        } else if (arg0 == 1415) {
            var3.field2699 = var7;
            var3.field2779 = var5;
        } else if (arg0 == 1416) {
            var3.field2647 = var7;
        } else if (arg0 == 1417) {
            var3.field2751 = var7;
        } else if (arg0 == 1418) {
            var3.field2752 = var7;
        } else if (arg0 == 1419) {
            var3.field2657 = var7;
        } else if (arg0 == 1420) {
            var3.field2754 = var7;
        } else if (arg0 == 1421) {
            var3.field2755 = var7;
        } else if (arg0 == 1422) {
            var3.field2756 = var7;
        } else if (arg0 == 1423) {
            var3.field2656 = var7;
        } else if (arg0 == 1424) {
            var3.field2758 = var7;
        } else if (arg0 == 1425) {
            var3.field2753 = var7;
        } else if (arg0 == 1426) {
            var3.field2761 = var7;
        } else if (arg0 == 1427) {
            var3.field2759 = var7;
        } else {
            return 2;
        }
        var3.field2767 = true;
        return 1;
    }

    @ObfuscatedName("h.z(ILcg;ZI)I")
    public static int method233(int arg0, class93 arg1, boolean arg2) {
        class229 var3 = arg2 ? Statics.field112 : Statics.field65;
        if (arg0 == 1500) {
            field1064[++Statics.field2126 - 1] = var3.field2762;
            return 1;
        } else if (arg0 == 1501) {
            field1064[++Statics.field2126 - 1] = var3.field2707;
            return 1;
        } else if (arg0 == 1502) {
            field1064[++Statics.field2126 - 1] = var3.field2765;
            return 1;
        } else if (arg0 == 1503) {
            field1064[++Statics.field2126 - 1] = var3.field2678;
            return 1;
        } else if (arg0 == 1504) {
            field1064[++Statics.field2126 - 1] = var3.field2664 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1064[++Statics.field2126 - 1] = var3.field2663;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("by.j(ILcg;ZB)I")
    public static int method1047(int arg0, class93 arg1, boolean arg2) {
        class229 var3 = arg2 ? Statics.field112 : Statics.field65;
        if (arg0 == 1600) {
            field1064[++Statics.field2126 - 1] = var3.field2665;
            return 1;
        } else if (arg0 == 1601) {
            field1064[++Statics.field2126 - 1] = var3.field2734;
            return 1;
        } else if (arg0 == 1602) {
            field1065[++Statics.field1066 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 1603) {
            field1064[++Statics.field2126 - 1] = var3.field2667;
            return 1;
        } else if (arg0 == 1604) {
            field1064[++Statics.field2126 - 1] = var3.field2668;
            return 1;
        } else if (arg0 == 1605) {
            field1064[++Statics.field2126 - 1] = var3.field2698;
            return 1;
        } else if (arg0 == 1606) {
            field1064[++Statics.field2126 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 1607) {
            field1064[++Statics.field2126 - 1] = var3.field2697;
            return 1;
        } else if (arg0 == 1608) {
            field1064[++Statics.field2126 - 1] = var3.field2696;
            return 1;
        } else if (arg0 == 1609) {
            field1064[++Statics.field2126 - 1] = var3.field2778;
            return 1;
        } else if (arg0 == 1610) {
            field1064[++Statics.field2126 - 1] = var3.field2676;
            return 1;
        } else if (arg0 == 1611) {
            field1064[++Statics.field2126 - 1] = var3.field2669;
            return 1;
        } else if (arg0 == 1612) {
            field1064[++Statics.field2126 - 1] = var3.field2670;
            return 1;
        } else if (arg0 == 1613) {
            field1064[++Statics.field2126 - 1] = var3.field2666.method29();
            return 1;
        } else if (arg0 == 1614) {
            field1064[++Statics.field2126 - 1] = var3.field2702 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cy.s(ILcg;ZI)I")
    public static int method1848(int arg0, class93 arg1, boolean arg2) {
        class229 var3 = arg2 ? Statics.field112 : Statics.field65;
        if (arg0 == 1700) {
            field1064[++Statics.field2126 - 1] = var3.field2770;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2770 == -1) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = var3.field2720;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1064[++Statics.field2126 - 1] = var3.field2645;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("j.t(ILcg;ZI)I")
    public static int method171(int arg0, class93 arg1, boolean arg2) {
        class229 var3 = arg2 ? Statics.field112 : Statics.field65;
        if (arg0 == 1800) {
            field1064[++Statics.field2126 - 1] = class230.method3749(client.method12(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1064[--Statics.field2126];
            int var5 = var4 - 1;
            if (var3.field2783 == null || var5 >= var3.field2783.length || var3.field2783[var5] == null) {
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1065[++Statics.field1066 - 1] = var3.field2783[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2723 == null) {
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1065[++Statics.field1066 - 1] = var3.field2723;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.y(ILcg;ZI)I")
    public static int method1702(int arg0, class93 arg1, boolean arg2) {
        class229 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class229.method3345(field1064[--Statics.field2126]);
        } else {
            var3 = arg2 ? Statics.field112 : Statics.field65;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1073 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2759 == null) {
            return 0;
        } else {
            class63 var4 = new class63();
            var4.field558 = var3;
            var4.field554 = var3.field2759;
            var4.field549 = field1073 + 1;
            client.field680.method4851(var4);
            return 1;
        }
    }

    @ObfuscatedName("dm.h(ILcg;ZI)I")
    public static int method2732(int arg0, class93 arg1, boolean arg2) {
        class229 var3 = class229.method3345(field1064[--Statics.field2126]);
        if (arg0 == 2500) {
            field1064[++Statics.field2126 - 1] = var3.field2762;
            return 1;
        } else if (arg0 == 2501) {
            field1064[++Statics.field2126 - 1] = var3.field2707;
            return 1;
        } else if (arg0 == 2502) {
            field1064[++Statics.field2126 - 1] = var3.field2765;
            return 1;
        } else if (arg0 == 2503) {
            field1064[++Statics.field2126 - 1] = var3.field2678;
            return 1;
        } else if (arg0 == 2504) {
            field1064[++Statics.field2126 - 1] = var3.field2664 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1064[++Statics.field2126 - 1] = var3.field2663;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.b(ILcg;ZI)I")
    public static int method58(int arg0, class93 arg1, boolean arg2) {
        class229 var3 = class229.method3345(field1064[--Statics.field2126]);
        if (arg0 == 2600) {
            field1064[++Statics.field2126 - 1] = var3.field2665;
            return 1;
        } else if (arg0 == 2601) {
            field1064[++Statics.field2126 - 1] = var3.field2734;
            return 1;
        } else if (arg0 == 2602) {
            field1065[++Statics.field1066 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 2603) {
            field1064[++Statics.field2126 - 1] = var3.field2667;
            return 1;
        } else if (arg0 == 2604) {
            field1064[++Statics.field2126 - 1] = var3.field2668;
            return 1;
        } else if (arg0 == 2605) {
            field1064[++Statics.field2126 - 1] = var3.field2698;
            return 1;
        } else if (arg0 == 2606) {
            field1064[++Statics.field2126 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 2607) {
            field1064[++Statics.field2126 - 1] = var3.field2697;
            return 1;
        } else if (arg0 == 2608) {
            field1064[++Statics.field2126 - 1] = var3.field2696;
            return 1;
        } else if (arg0 == 2609) {
            field1064[++Statics.field2126 - 1] = var3.field2778;
            return 1;
        } else if (arg0 == 2610) {
            field1064[++Statics.field2126 - 1] = var3.field2676;
            return 1;
        } else if (arg0 == 2611) {
            field1064[++Statics.field2126 - 1] = var3.field2669;
            return 1;
        } else if (arg0 == 2612) {
            field1064[++Statics.field2126 - 1] = var3.field2670;
            return 1;
        } else if (arg0 == 2613) {
            field1064[++Statics.field2126 - 1] = var3.field2666.method29();
            return 1;
        } else if (arg0 == 2614) {
            field1064[++Statics.field2126 - 1] = var3.field2702 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.c(ILcg;ZI)I")
    public static int method129(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class229 var3 = class229.method3345(field1064[--Statics.field2126]);
            field1064[++Statics.field2126 - 1] = var3.field2770;
            return 1;
        } else if (arg0 == 2701) {
            class229 var4 = class229.method3345(field1064[--Statics.field2126]);
            if (var4.field2770 == -1) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = var4.field2720;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1064[--Statics.field2126];
            class62 var6 = (class62) client.field703.method5416((long) var5);
            if (var6 == null) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1064[++Statics.field2126 - 1] = client.field830;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.p(ILcg;ZI)I")
    public static int method165(int arg0, class93 arg1, boolean arg2) {
        class229 var3 = class229.method3345(field1064[--Statics.field2126]);
        if (arg0 == 2800) {
            field1064[++Statics.field2126 - 1] = class230.method3749(client.method12(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1064[--Statics.field2126];
            int var5 = var4 - 1;
            if (var3.field2783 == null || var5 >= var3.field2783.length || var3.field2783[var5] == null) {
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1065[++Statics.field1066 - 1] = var3.field2783[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2723 == null) {
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1065[++Statics.field1066 - 1] = var3.field2723;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.v(ILcg;ZB)I")
    public static int method37(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1065[--Statics.field1066];
            class92.method202(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field2126 -= 2;
            client.method4137(Statics.field389, field1064[Statics.field2126], field1064[Statics.field2126 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1072) {
                field1059 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1065[--Statics.field1066];
            int var5 = 0;
            if (class309.method3054(var4)) {
                var5 = class309.method947(var4);
            }
            class192 var6 = class192.method1750(class189.field2247, client.field669.field1284);
            var6.field2356.method3422(var5);
            client.field669.method2056(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1065[--Statics.field1066];
            class192 var8 = class192.method1750(class189.field2325, client.field669.field1284);
            var8.field2356.method3565(var7.length() + 1);
            var8.field2356.method3591(var7);
            client.field669.method2056(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1065[--Statics.field1066];
            class192 var10 = class192.method1750(class189.field2238, client.field669.field1284);
            var10.field2356.method3565(var9.length() + 1);
            var10.field2356.method3591(var9);
            client.field669.method2056(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1064[--Statics.field2126];
            String var12 = field1065[--Statics.field1066];
            client.method523(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field2126 -= 3;
            int var13 = field1064[Statics.field2126];
            int var14 = field1064[Statics.field2126 + 1];
            int var15 = field1064[Statics.field2126 + 2];
            class229 var16 = class229.method3345(var15);
            client.method1934(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field2126 -= 2;
            int var17 = field1064[Statics.field2126];
            int var18 = field1064[Statics.field2126 + 1];
            class229 var19 = arg2 ? Statics.field112 : Statics.field65;
            client.method1934(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field3880 = field1064[--Statics.field2126] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1064[++Statics.field2126 - 1] = Statics.field3868.field1022 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field3868.field1022 = field1064[--Statics.field2126] == 1;
            class74.method230();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1065[--Statics.field1066];
            boolean var21 = field1064[--Statics.field2126] == 1;
            class51.method544(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1064[--Statics.field2126];
            class192 var23 = class192.method1750(class189.field2317, client.field669.field1284);
            var23.field2356.method3402(var22);
            client.field669.method2056(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1064[--Statics.field2126];
            Statics.field1066 -= 2;
            String var25 = field1065[Statics.field1066];
            String var26 = field1065[Statics.field1066 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class192 var27 = class192.method1750(class189.field2279, client.field669.field1284);
                var27.field2356.method3402(1 + class202.method493(var25) + class202.method493(var26));
                var27.field2356.method3591(var25);
                var27.field2356.method3565(var24);
                var27.field2356.method3591(var26);
                client.field669.method2056(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field739 = field1064[--Statics.field2126] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field770 = field1064[--Statics.field2126] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field779 = field1064[--Statics.field2126] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1064[--Statics.field2126] == 1) {
                client.field686 |= 0x1;
            } else {
                client.field686 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1064[--Statics.field2126] == 1) {
                client.field686 |= 0x2;
            } else {
                client.field686 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1064[--Statics.field2126] == 1) {
                client.field686 |= 0x4;
            } else {
                client.field686 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1064[--Statics.field2126] == 1) {
                client.field686 |= 0x8;
            } else {
                client.field686 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field686 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field727 = field1064[--Statics.field2126] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field737 = field1064[--Statics.field2126] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method592(field1064[--Statics.field2126] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1064[++Statics.field2126 - 1] = client.method3673() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field2126 -= 2;
            client.field702 = field1064[Statics.field2126];
            client.field812 = field1064[Statics.field2126 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field2126 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field2126--;
            return 1;
        } else if (arg0 == 3132) {
            field1064[++Statics.field2126 - 1] = Statics.field1402;
            field1064[++Statics.field2126 - 1] = Statics.field2370;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field2126--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field2126 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field784 = 3;
            client.field785 = field1064[--Statics.field2126];
            return 1;
        } else if (arg0 == 3137) {
            client.field784 = 2;
            client.field785 = field1064[--Statics.field2126];
            return 1;
        } else if (arg0 == 3138) {
            client.field784 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field784 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field784 = 3;
            client.field785 = arg2 ? Statics.field112.field2644 : Statics.field65.field2644;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1064[--Statics.field2126] == 1;
            Statics.field3868.field1020 = var28;
            class74.method230();
            return 1;
        } else if (arg0 == 3142) {
            field1064[++Statics.field2126 - 1] = Statics.field3868.field1020 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1064[--Statics.field2126] == 1;
            client.field752 = var29;
            if (!var29) {
                Statics.field3868.field1026 = "";
                class74.method230();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1064[++Statics.field2126 - 1] = client.field752 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1064[--Statics.field2126] == 1;
            if (Statics.field3868.field1029 == var30) {
                Statics.field3868.field1029 = !var30;
                class74.method230();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1064[++Statics.field2126 - 1] = Statics.field3868.field1029 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1064[++Statics.field2126 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1064[++Statics.field2126 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1064[++Statics.field2126 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1064[++Statics.field2126 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1064[++Statics.field2126 - 1] = class86.field1149;
            return 1;
        } else if (arg0 == 3154) {
            field1064[++Statics.field2126 - 1] = client.method84();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("u.ag(ILcg;ZB)I")
    public static int method51(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field2126 -= 3;
            client.method5111(field1064[Statics.field2126], field1064[Statics.field2126 + 1], field1064[Statics.field2126 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method5020(field1064[--Statics.field2126]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field2126 -= 2;
            client.method1826(field1064[Statics.field2126], field1064[Statics.field2126 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("by.aq(ILcg;ZI)I")
    public static int method1049(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1064[++Statics.field2126 - 1] = client.field633;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field2126 -= 2;
            int var3 = field1064[Statics.field2126];
            int var4 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = class60.method1852(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field2126 -= 2;
            int var5 = field1064[Statics.field2126];
            int var6 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = class60.method385(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field2126 -= 2;
            int var7 = field1064[Statics.field2126];
            int var8 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = class60.method13(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = class251.method4127(var9).field3281;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = client.field754[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = client.field755[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = client.field756[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1394;
            int var14 = (Statics.field389.field957 >> 7) + Statics.field405;
            int var15 = (Statics.field389.field916 >> 7) + Statics.field1088;
            field1064[++Statics.field2126 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1064[++Statics.field2126 - 1] = client.field625 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field2126 -= 2;
            int var19 = field1064[Statics.field2126] + 32768;
            int var20 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = class60.method1852(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field2126 -= 2;
            int var21 = field1064[Statics.field2126] + 32768;
            int var22 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = class60.method385(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field2126 -= 2;
            int var23 = field1064[Statics.field2126] + 32768;
            int var24 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = class60.method13(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field791 >= 2) {
                field1064[++Statics.field2126 - 1] = client.field791;
            } else {
                field1064[++Statics.field2126 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1064[++Statics.field2126 - 1] = client.field640;
            return 1;
        } else if (arg0 == 3318) {
            field1064[++Statics.field2126 - 1] = client.field622;
            return 1;
        } else if (arg0 == 3321) {
            field1064[++Statics.field2126 - 1] = client.field721;
            return 1;
        } else if (arg0 == 3322) {
            field1064[++Statics.field2126 - 1] = client.field717;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field811) {
                field1064[++Statics.field2126 - 1] = 1;
            } else {
                field1064[++Statics.field2126 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1064[++Statics.field2126 - 1] = client.field623;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field2126 -= 4;
            int var25 = field1064[Statics.field2126];
            int var26 = field1064[Statics.field2126 + 1];
            int var27 = field1064[Statics.field2126 + 2];
            int var28 = field1064[Statics.field2126 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1064[++Statics.field2126 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cy.aj(ILcg;ZI)I")
    public static int method1847(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field2126 -= 2;
            int var3 = field1064[Statics.field2126];
            int var4 = field1064[Statics.field2126 + 1];
            class263 var5 = Statics.method1814(var3);
            if (var5.field3389 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3392; var6++) {
                if (var5.field3395[var6] == var4) {
                    field1065[++Statics.field1066 - 1] = var5.field3386[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1065[++Statics.field1066 - 1] = var5.field3390;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field2126 -= 4;
            int var7 = field1064[Statics.field2126];
            int var8 = field1064[Statics.field2126 + 1];
            int var9 = field1064[Statics.field2126 + 2];
            int var10 = field1064[Statics.field2126 + 3];
            class263 var11 = Statics.method1814(var9);
            if (var11.field3394 != var7 || var11.field3389 != var8) {
                if (var8 == 115) {
                    field1065[++Statics.field1066 - 1] = class236.field2980;
                } else {
                    field1064[++Statics.field2126 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3392; var12++) {
                if (var11.field3395[var12] == var10) {
                    if (var8 == 115) {
                        field1065[++Statics.field1066 - 1] = var11.field3386[var12];
                    } else {
                        field1064[++Statics.field2126 - 1] = var11.field3393[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1065[++Statics.field1066 - 1] = var11.field3390;
                } else {
                    field1064[++Statics.field2126 - 1] = var11.field3391;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1064[--Statics.field2126];
            class263 var14 = Statics.method1814(var13);
            field1064[++Statics.field2126 - 1] = var14.method4541();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kx.av(ILcg;ZI)I")
    public static int method5181(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field205.field1036 == 0) {
                field1064[++Statics.field2126 - 1] = -2;
            } else if (Statics.field205.field1036 == 1) {
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = Statics.field205.field1037.method5036();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1064[--Statics.field2126];
            if (Statics.field205.method1646() && var3 >= 0 && var3 < Statics.field205.field1037.method5036()) {
                class296 var4 = (class296) Statics.field205.field1037.method5046(var3);
                field1065[++Statics.field1066 - 1] = var4.method4992();
                field1065[++Statics.field1066 - 1] = var4.method4993();
            } else {
                field1065[++Statics.field1066 - 1] = "";
                field1065[++Statics.field1066 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1064[--Statics.field2126];
            if (Statics.field205.method1646() && var5 >= 0 && var5 < Statics.field205.field1037.method5036()) {
                field1064[++Statics.field2126 - 1] = ((class291) Statics.field205.field1037.method5046(var5)).field3703;
            } else {
                field1064[++Statics.field2126 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1064[--Statics.field2126];
            if (Statics.field205.method1646() && var6 >= 0 && var6 < Statics.field205.field1037.method5036()) {
                field1064[++Statics.field2126 - 1] = ((class291) Statics.field205.field1037.method5046(var6)).field3700;
            } else {
                field1064[++Statics.field2126 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1065[--Statics.field1066];
            int var8 = field1064[--Statics.field2126];
            class75.method5180(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1065[--Statics.field1066];
            Statics.field205.method1652(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1065[--Statics.field1066];
            Statics.field205.method1656(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1065[--Statics.field1066];
            Statics.field205.method1654(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1065[--Statics.field1066];
            Statics.field205.method1657(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1065[--Statics.field1066];
            String var14 = client.method4744(var13);
            field1064[++Statics.field2126 - 1] = Statics.field205.method1650(new class295(var14, Statics.field366), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1298 == null) {
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1065[++Statics.field1066 - 1] = Statics.field1298.field3724;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1298 == null) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = Statics.field1298.method5036();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1064[--Statics.field2126];
            if (Statics.field1298 == null || var15 >= Statics.field1298.method5036()) {
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1065[++Statics.field1066 - 1] = Statics.field1298.method5046(var15).method4997().method5136();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1064[--Statics.field2126];
            if (Statics.field1298 == null || var16 >= Statics.field1298.method5036()) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = ((class291) Statics.field1298.method5046(var16)).method5116();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1064[--Statics.field2126];
            if (Statics.field1298 == null || var17 >= Statics.field1298.method5036()) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = ((class291) Statics.field1298.method5046(var17)).field3700;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1064[++Statics.field2126 - 1] = Statics.field1298 == null ? 0 : Statics.field1298.field3726;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1065[--Statics.field1066];
            client.method4252(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1064[++Statics.field2126 - 1] = Statics.field1298 == null ? 0 : Statics.field1298.field3727;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1065[--Statics.field1066];
            client.method517(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method141();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field205.method1646()) {
                field1064[++Statics.field2126 - 1] = Statics.field205.field1034.method5036();
            } else {
                field1064[++Statics.field2126 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1064[--Statics.field2126];
            if (Statics.field205.method1646() && var20 >= 0 && var20 < Statics.field205.field1034.method5036()) {
                class290 var21 = (class290) Statics.field205.field1034.method5046(var20);
                field1065[++Statics.field1066 - 1] = var21.method4992();
                field1065[++Statics.field1066 - 1] = var21.method4993();
            } else {
                field1065[++Statics.field1066 - 1] = "";
                field1065[++Statics.field1066 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1065[--Statics.field1066];
            String var23 = client.method4744(var22);
            field1064[++Statics.field2126 - 1] = Statics.field205.method1684(new class295(var23, Statics.field366)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1064[--Statics.field2126];
            if (Statics.field1298 == null || var24 >= Statics.field1298.method5036() || !Statics.field1298.method5046(var24).method4997().equals(Statics.field389.field599)) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1298 == null || Statics.field1298.field3728 == null) {
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1065[++Statics.field1066 - 1] = Statics.field1298.field3728;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1064[--Statics.field2126];
            if (Statics.field1298 == null || var25 >= Statics.field1298.method5036() || !((class285) Statics.field1298.method5046(var25)).method4971()) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1064[--Statics.field2126];
            if (Statics.field1298 == null || var26 >= Statics.field1298.method5036() || !((class285) Statics.field1298.method5046(var26)).method4974()) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field205.field1037.method5054();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1037.method5055(new class315(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1037.method5055(new class316(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1037.method5055(new class157(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1037.method5055(new class151(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1037.method5055(new class156(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1037.method5055(new class159(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1037.method5055(new class155(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1037.method5055(new class153(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1037.method5055(new class152(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1037.method5055(new class154(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field205.field1037.method5047();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field205.field1034.method5054();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1034.method5055(new class315(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1034.method5055(new class316(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field205.field1034.method5047();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1298 != null) {
                Statics.field1298.method5054();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1064[--Statics.field2126] == 1;
            if (Statics.field1298 != null) {
                Statics.field1298.method5055(new class315(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1064[--Statics.field2126] == 1;
            if (Statics.field1298 != null) {
                Statics.field1298.method5055(new class316(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1064[--Statics.field2126] == 1;
            if (Statics.field1298 != null) {
                Statics.field1298.method5055(new class157(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1064[--Statics.field2126] == 1;
            if (Statics.field1298 != null) {
                Statics.field1298.method5055(new class151(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1064[--Statics.field2126] == 1;
            if (Statics.field1298 != null) {
                Statics.field1298.method5055(new class156(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1064[--Statics.field2126] == 1;
            if (Statics.field1298 != null) {
                Statics.field1298.method5055(new class159(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1064[--Statics.field2126] == 1;
            if (Statics.field1298 != null) {
                Statics.field1298.method5055(new class155(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1064[--Statics.field2126] == 1;
            if (Statics.field1298 != null) {
                Statics.field1298.method5055(new class153(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1064[--Statics.field2126] == 1;
            if (Statics.field1298 != null) {
                Statics.field1298.method5055(new class152(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1064[--Statics.field2126] == 1;
            if (Statics.field1298 != null) {
                Statics.field1298.method5055(new class154(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1298 != null) {
                Statics.field1298.method5047();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1064[--Statics.field2126] == 1;
            Statics.field205.field1037.method5055(new class158(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1064[--Statics.field2126] == 1;
            if (Statics.field1298 != null) {
                Statics.field1298.method5055(new class158(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iu.ar(ILcg;ZI)I")
    public static int method4330(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = client.field889[var3].method102();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = client.field889[var4].field58;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = client.field889[var5].field51;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = client.field889[var6].field52;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = client.field889[var7].field55;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = client.field889[var8].field54;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1064[--Statics.field2126];
            int var10 = client.field889[var9].method87();
            field1064[++Statics.field2126 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1064[--Statics.field2126];
            int var12 = client.field889[var11].method87();
            field1064[++Statics.field2126 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1064[--Statics.field2126];
            int var14 = client.field889[var13].method87();
            field1064[++Statics.field2126 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1064[--Statics.field2126];
            int var16 = client.field889[var15].method87();
            field1064[++Statics.field2126 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1064[--Statics.field2126] == 1;
            if (Statics.field1590 != null) {
                Statics.field1590.method53(class7.field32, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1064[--Statics.field2126] == 1;
            if (Statics.field1590 != null) {
                Statics.field1590.method53(class7.field31, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field2126 -= 2;
            boolean var19 = field1064[Statics.field2126] == 1;
            boolean var20 = field1064[Statics.field2126 + 1] == 1;
            if (Statics.field1590 != null) {
                client.field890.field619 = var20;
                Statics.field1590.method53(client.field890, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1064[--Statics.field2126] == 1;
            if (Statics.field1590 != null) {
                Statics.field1590.method53(class7.field30, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1064[--Statics.field2126] == 1;
            if (Statics.field1590 != null) {
                Statics.field1590.method53(class7.field33, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1064[++Statics.field2126 - 1] = Statics.field1590 == null ? 0 : Statics.field1590.field37.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1064[--Statics.field2126];
            class8 var24 = (class8) Statics.field1590.field37.get(var23);
            field1064[++Statics.field2126 - 1] = var24.field40;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1064[--Statics.field2126];
            class8 var26 = (class8) Statics.field1590.field37.get(var25);
            field1065[++Statics.field1066 - 1] = var26.method61();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1064[--Statics.field2126];
            class8 var28 = (class8) Statics.field1590.field37.get(var27);
            field1065[++Statics.field1066 - 1] = var28.method62();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1064[--Statics.field2126];
            class8 var30 = (class8) Statics.field1590.field37.get(var29);
            long var31 = class204.method3658() - Statics.field82 - var30.field39;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1065[++Statics.field1066 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1064[--Statics.field2126];
            class8 var38 = (class8) Statics.field1590.field37.get(var37);
            field1064[++Statics.field2126 - 1] = var38.field41.field52;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1064[--Statics.field2126];
            class8 var40 = (class8) Statics.field1590.field37.get(var39);
            field1064[++Statics.field2126 - 1] = var40.field41.field51;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1064[--Statics.field2126];
            class8 var42 = (class8) Statics.field1590.field37.get(var41);
            field1064[++Statics.field2126 - 1] = var42.field41.field58;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dl.ac(ILcg;ZI)I")
    public static int method2501(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field2126 -= 2;
            int var3 = field1064[Statics.field2126];
            int var4 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field2126 -= 2;
            int var5 = field1064[Statics.field2126];
            int var6 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field2126 -= 2;
            int var7 = field1064[Statics.field2126];
            int var8 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field2126 -= 2;
            int var9 = field1064[Statics.field2126];
            int var10 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field2126 -= 5;
            int var13 = field1064[Statics.field2126];
            int var14 = field1064[Statics.field2126 + 1];
            int var15 = field1064[Statics.field2126 + 2];
            int var16 = field1064[Statics.field2126 + 3];
            int var17 = field1064[Statics.field2126 + 4];
            field1064[++Statics.field2126 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field2126 -= 2;
            int var18 = field1064[Statics.field2126];
            int var19 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field2126 -= 2;
            int var20 = field1064[Statics.field2126];
            int var21 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field2126 -= 2;
            int var22 = field1064[Statics.field2126];
            int var23 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field2126 -= 2;
            int var24 = field1064[Statics.field2126];
            int var25 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field2126 -= 2;
            int var26 = field1064[Statics.field2126];
            int var27 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field2126 -= 2;
            int var28 = field1064[Statics.field2126];
            int var29 = field1064[Statics.field2126 + 1];
            if (var28 == 0) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field2126 -= 2;
            int var30 = field1064[Statics.field2126];
            int var31 = field1064[Statics.field2126 + 1];
            if (var30 == 0) {
                field1064[++Statics.field2126 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1064[++Statics.field2126 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1064[++Statics.field2126 - 1] = var30;
                    break;
                case 2:
                    field1064[++Statics.field2126 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1064[++Statics.field2126 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1064[++Statics.field2126 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1064[++Statics.field2126 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field2126 -= 2;
            int var32 = field1064[Statics.field2126];
            int var33 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field2126 -= 2;
            int var34 = field1064[Statics.field2126];
            int var35 = field1064[Statics.field2126 + 1];
            field1064[++Statics.field2126 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field2126 -= 3;
            long var36 = (long) field1064[Statics.field2126];
            long var38 = (long) field1064[Statics.field2126 + 1];
            long var40 = (long) field1064[Statics.field2126 + 2];
            field1064[++Statics.field2126 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hg.ay(ILcg;ZI)I")
    public static int method3745(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1065[--Statics.field1066];
            int var4 = field1064[--Statics.field2126];
            field1065[++Statics.field1066 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1066 -= 2;
            String var5 = field1065[Statics.field1066];
            String var6 = field1065[Statics.field1066 + 1];
            field1065[++Statics.field1066 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1065[--Statics.field1066];
            int var8 = field1064[--Statics.field2126];
            field1065[++Statics.field1066 - 1] = var7 + class309.method3650(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1065[--Statics.field1066];
            field1065[++Statics.field1066 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1064[--Statics.field2126];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1069.setTime(new Date(var11));
            int var13 = field1069.get(5);
            int var14 = field1069.get(2);
            int var15 = field1069.get(1);
            field1065[++Statics.field1066 - 1] = var13 + "-" + field1071[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1066 -= 2;
            String var16 = field1065[Statics.field1066];
            String var17 = field1065[Statics.field1066 + 1];
            if (Statics.field389.field588 != null && Statics.field389.field588.field2611) {
                field1065[++Statics.field1066 - 1] = var17;
            } else {
                field1065[++Statics.field1066 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1064[--Statics.field2126];
            field1065[++Statics.field1066 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1066 -= 2;
            field1064[++Statics.field2126 - 1] = class309.method2986(class193.method1855(field1065[Statics.field1066], field1065[Statics.field1066 + 1], client.field671));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1065[--Statics.field1066];
            Statics.field2126 -= 2;
            int var20 = field1064[Statics.field2126];
            int var21 = field1064[Statics.field2126 + 1];
            byte[] var22 = Statics.field2449.method4156(var21, 0);
            class302 var23 = new class302(var22);
            field1064[++Statics.field2126 - 1] = var23.method5205(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1065[--Statics.field1066];
            Statics.field2126 -= 2;
            int var25 = field1064[Statics.field2126];
            int var26 = field1064[Statics.field2126 + 1];
            byte[] var27 = Statics.field2449.method4156(var26, 0);
            class302 var28 = new class302(var27);
            field1064[++Statics.field2126 - 1] = var28.method5264(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1066 -= 2;
            String var29 = field1065[Statics.field1066];
            String var30 = field1065[Statics.field1066 + 1];
            if (field1064[--Statics.field2126] == 1) {
                field1065[++Statics.field1066 - 1] = var29;
            } else {
                field1065[++Statics.field1066 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1065[--Statics.field1066];
            field1065[++Statics.field1066 - 1] = class303.method5206(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1065[--Statics.field1066];
            int var33 = field1064[--Statics.field2126];
            field1065[++Statics.field1066 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = class309.method2051((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = class309.method4393((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = class309.method3001((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = class309.method3109((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1065[--Statics.field1066];
            if (var38 == null) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1065[--Statics.field1066];
            Statics.field2126 -= 2;
            int var40 = field1064[Statics.field2126];
            int var41 = field1064[Statics.field2126 + 1];
            field1065[++Statics.field1066 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1065[--Statics.field1066];
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
            field1065[++Statics.field1066 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1065[--Statics.field1066];
            int var48 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1066 -= 2;
            String var49 = field1065[Statics.field1066];
            String var50 = field1065[Statics.field1066 + 1];
            int var51 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1065[--Statics.field1066];
            field1065[++Statics.field1066 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.ah(ILcg;ZB)I")
    public static int method11(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1064[--Statics.field2126];
            field1065[++Statics.field1066 - 1] = class266.method4129(var3).field3482;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field2126 -= 2;
            int var4 = field1064[Statics.field2126];
            int var5 = field1064[Statics.field2126 + 1];
            class266 var6 = class266.method4129(var4);
            if (var5 < 1 || var5 > 5 || var6.field3509[var5 - 1] == null) {
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1065[++Statics.field1066 - 1] = var6.field3509[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field2126 -= 2;
            int var7 = field1064[Statics.field2126];
            int var8 = field1064[Statics.field2126 + 1];
            class266 var9 = class266.method4129(var7);
            if (var8 < 1 || var8 > 5 || var9.field3477[var8 - 1] == null) {
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1065[++Statics.field1066 - 1] = var9.field3477[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = class266.method4129(var10).field3494;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = class266.method4129(var11).field3493 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1064[--Statics.field2126];
            class266 var13 = class266.method4129(var12);
            if (var13.field3476 == -1 && var13.field3513 >= 0) {
                field1064[++Statics.field2126 - 1] = var13.field3513;
            } else {
                field1064[++Statics.field2126 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1064[--Statics.field2126];
            class266 var15 = class266.method4129(var14);
            if (var15.field3476 >= 0 && var15.field3513 >= 0) {
                field1064[++Statics.field2126 - 1] = var15.field3513;
            } else {
                field1064[++Statics.field2126 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = class266.method4129(var16).field3495 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1064[--Statics.field2126];
            class266 var18 = class266.method4129(var17);
            if (var18.field3504 == -1 && var18.field3472 >= 0) {
                field1064[++Statics.field2126 - 1] = var18.field3472;
            } else {
                field1064[++Statics.field2126 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1064[--Statics.field2126];
            class266 var20 = class266.method4129(var19);
            if (var20.field3504 >= 0 && var20.field3472 >= 0) {
                field1064[++Statics.field2126 - 1] = var20.field3472;
            } else {
                field1064[++Statics.field2126 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1065[--Statics.field1066];
            int var22 = field1064[--Statics.field2126];
            client.method762(var21, var22 == 1);
            field1064[++Statics.field2126 - 1] = Statics.field127;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1148 == null || Statics.field2826 >= Statics.field127) {
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = Statics.field1148[++Statics.field2826 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field2826 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cf.ak(ILcg;ZB)I")
    public static int method2036(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1064[++Statics.field2126 - 1] = client.field838;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field2126 -= 3;
            client.field838 = field1064[Statics.field2126];
            Statics.field513 = class311.method4369(field1064[Statics.field2126 + 1]);
            if (Statics.field513 == null) {
                Statics.field513 = class311.field3806;
            }
            client.field628 = field1064[Statics.field2126 + 2];
            class192 var3 = class192.method1750(class189.field2322, client.field669.field1284);
            var3.field2356.method3565(client.field838);
            var3.field2356.method3565(Statics.field513.field3805);
            var3.field2356.method3565(client.field628);
            client.field669.method2056(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1065[--Statics.field1066];
            Statics.field2126 -= 2;
            int var5 = field1064[Statics.field2126];
            int var6 = field1064[Statics.field2126 + 1];
            class192 var7 = class192.method1750(class189.field2268, client.field669.field1284);
            var7.field2356.method3565(class202.method493(var4) + 2);
            var7.field2356.method3591(var4);
            var7.field2356.method3565(var5 - 1);
            var7.field2356.method3565(var6);
            client.field669.method2056(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field2126 -= 2;
            int var8 = field1064[Statics.field2126];
            int var9 = field1064[Statics.field2126 + 1];
            class65 var10 = class92.method1088(var8, var9);
            if (var10 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = 0;
                field1065[++Statics.field1066 - 1] = "";
                field1065[++Statics.field1066 - 1] = "";
                field1065[++Statics.field1066 - 1] = "";
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = var10.field576;
                field1064[++Statics.field2126 - 1] = var10.field571;
                field1065[++Statics.field1066 - 1] = var10.field573 == null ? "" : var10.field573;
                field1065[++Statics.field1066 - 1] = var10.field577 == null ? "" : var10.field577;
                field1065[++Statics.field1066 - 1] = var10.field578 == null ? "" : var10.field578;
                field1064[++Statics.field2126 - 1] = var10.method1060() ? 1 : (var10.method1063() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1064[--Statics.field2126];
            class65 var12 = class92.method4297(var11);
            if (var12 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = 0;
                field1065[++Statics.field1066 - 1] = "";
                field1065[++Statics.field1066 - 1] = "";
                field1065[++Statics.field1066 - 1] = "";
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = var12.field570;
                field1064[++Statics.field2126 - 1] = var12.field571;
                field1065[++Statics.field1066 - 1] = var12.field573 == null ? "" : var12.field573;
                field1065[++Statics.field1066 - 1] = var12.field577 == null ? "" : var12.field577;
                field1065[++Statics.field1066 - 1] = var12.field578 == null ? "" : var12.field578;
                field1064[++Statics.field2126 - 1] = var12.method1060() ? 1 : (var12.method1063() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field513 == null) {
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = Statics.field513.field3805;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1065[--Statics.field1066];
            int var14 = field1064[--Statics.field2126];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class236.field2968)) {
                var16 = 0;
                var13 = var13.substring(class236.field2968.length());
            } else if (var15.startsWith(class236.field3023)) {
                var16 = 1;
                var13 = var13.substring(class236.field3023.length());
            } else if (var15.startsWith(class236.field3025)) {
                var16 = 2;
                var13 = var13.substring(class236.field3025.length());
            } else if (var15.startsWith(class236.field3027)) {
                var16 = 3;
                var13 = var13.substring(class236.field3027.length());
            } else if (var15.startsWith(class236.field2944)) {
                var16 = 4;
                var13 = var13.substring(class236.field2944.length());
            } else if (var15.startsWith(class236.field3031)) {
                var16 = 5;
                var13 = var13.substring(class236.field3031.length());
            } else if (var15.startsWith(class236.field3033)) {
                var16 = 6;
                var13 = var13.substring(class236.field3033.length());
            } else if (var15.startsWith(class236.field3035)) {
                var16 = 7;
                var13 = var13.substring(class236.field3035.length());
            } else if (var15.startsWith(class236.field3037)) {
                var16 = 8;
                var13 = var13.substring(class236.field3037.length());
            } else if (var15.startsWith(class236.field2926)) {
                var16 = 9;
                var13 = var13.substring(class236.field2926.length());
            } else if (var15.startsWith(class236.field3041)) {
                var16 = 10;
                var13 = var13.substring(class236.field3041.length());
            } else if (var15.startsWith(class236.field3043)) {
                var16 = 11;
                var13 = var13.substring(class236.field3043.length());
            } else if (client.field671 != 0) {
                if (var15.startsWith(class236.field3022)) {
                    var16 = 0;
                    var13 = var13.substring(class236.field3022.length());
                } else if (var15.startsWith(class236.field3024)) {
                    var16 = 1;
                    var13 = var13.substring(class236.field3024.length());
                } else if (var15.startsWith(class236.field2846)) {
                    var16 = 2;
                    var13 = var13.substring(class236.field2846.length());
                } else if (var15.startsWith(class236.field3056)) {
                    var16 = 3;
                    var13 = var13.substring(class236.field3056.length());
                } else if (var15.startsWith(class236.field3132)) {
                    var16 = 4;
                    var13 = var13.substring(class236.field3132.length());
                } else if (var15.startsWith(class236.field3032)) {
                    var16 = 5;
                    var13 = var13.substring(class236.field3032.length());
                } else if (var15.startsWith(class236.field3034)) {
                    var16 = 6;
                    var13 = var13.substring(class236.field3034.length());
                } else if (var15.startsWith(class236.field3036)) {
                    var16 = 7;
                    var13 = var13.substring(class236.field3036.length());
                } else if (var15.startsWith(class236.field2870)) {
                    var16 = 8;
                    var13 = var13.substring(class236.field2870.length());
                } else if (var15.startsWith(class236.field3040)) {
                    var16 = 9;
                    var13 = var13.substring(class236.field3040.length());
                } else if (var15.startsWith(class236.field3042)) {
                    var16 = 10;
                    var13 = var13.substring(class236.field3042.length());
                } else if (var15.startsWith(class236.field3044)) {
                    var16 = 11;
                    var13 = var13.substring(class236.field3044.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class236.field3045)) {
                var18 = 1;
                var13 = var13.substring(class236.field3045.length());
            } else if (var17.startsWith(class236.field3051)) {
                var18 = 2;
                var13 = var13.substring(class236.field3051.length());
            } else if (var17.startsWith(class236.field3049)) {
                var18 = 3;
                var13 = var13.substring(class236.field3049.length());
            } else if (var17.startsWith(class236.field2841)) {
                var18 = 4;
                var13 = var13.substring(class236.field2841.length());
            } else if (var17.startsWith(class236.field3053)) {
                var18 = 5;
                var13 = var13.substring(class236.field3053.length());
            } else if (client.field671 != 0) {
                if (var17.startsWith(class236.field3104)) {
                    var18 = 1;
                    var13 = var13.substring(class236.field3104.length());
                } else if (var17.startsWith(class236.field3048)) {
                    var18 = 2;
                    var13 = var13.substring(class236.field3048.length());
                } else if (var17.startsWith(class236.field3050)) {
                    var18 = 3;
                    var13 = var13.substring(class236.field3050.length());
                } else if (var17.startsWith(class236.field2947)) {
                    var18 = 4;
                    var13 = var13.substring(class236.field2947.length());
                } else if (var17.startsWith(class236.field2902)) {
                    var18 = 5;
                    var13 = var13.substring(class236.field2902.length());
                }
            }
            class192 var19 = class192.method1750(class189.field2237, client.field669.field1284);
            var19.field2356.method3565(0);
            int var20 = var19.field2356.field2439;
            var19.field2356.method3565(var14);
            var19.field2356.method3565(var16);
            var19.field2356.method3565(var18);
            class304.method2526(var19.field2356, var13);
            var19.field2356.method3409(var19.field2356.field2439 - var20);
            client.field669.method2056(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1066 -= 2;
            String var21 = field1065[Statics.field1066];
            String var22 = field1065[Statics.field1066 + 1];
            class192 var23 = class192.method1750(class189.field2255, client.field669.field1284);
            var23.field2356.method3402(0);
            int var24 = var23.field2356.field2439;
            var23.field2356.method3591(var21);
            class304.method2526(var23.field2356, var22);
            var23.field2356.method3413(var23.field2356.field2439 - var24);
            client.field669.method2056(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field389 == null || Statics.field389.field599 == null) {
                var25 = "";
            } else {
                var25 = Statics.field389.field599.method5136();
            }
            field1065[++Statics.field1066 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1064[++Statics.field2126 - 1] = client.field628;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = class92.method1036(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = class92.method144(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = class92.method3997(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1065[--Statics.field1066];
            Statics.method2977(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field840 = field1065[--Statics.field1066].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1065[++Statics.field1066 - 1] = client.field840;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1065[--Statics.field1066];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ev.aw(ILcg;ZI)I")
    public static int method3053(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1064[++Statics.field2126 - 1] = client.method4408();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1064[--Statics.field2126];
            if (var3 == 1 || var3 == 2) {
                client.method1911(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1064[++Statics.field2126 - 1] = Statics.field3868.field1024;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1064[--Statics.field2126];
            if (var4 == 1 || var4 == 2) {
                Statics.field3868.field1024 = var4;
                class74.method230();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field2126--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bj.al(ILcg;ZI)I")
    public static int method1147(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field2126 -= 2;
            int var3 = field1064[Statics.field2126];
            int var4 = field1064[Statics.field2126 + 1];
            if (!client.field742) {
                client.field693 = var3;
                client.field692 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1064[++Statics.field2126 - 1] = client.field693;
            return 1;
        } else if (arg0 == 5506) {
            field1064[++Statics.field2126 - 1] = client.field692;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1064[--Statics.field2126];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field687 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1064[++Statics.field2126 - 1] = client.field687;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.ab(ILcg;ZI)I")
    public static int method2279(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field670 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fj.ae(II)I")
    public static int method3110(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ar.at(II)I")
    public static int method514(int arg0) {
        return (int) ((Math.log((double) arg0) / field1074 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("hz.ad(ILcg;ZI)I")
    public static int method4119(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field2126 -= 2;
            client.field872 = (short) method3110(field1064[Statics.field2126]);
            if (client.field872 <= 0) {
                client.field872 = 256;
            }
            client.field632 = (short) method3110(field1064[Statics.field2126 + 1]);
            if (client.field632 <= 0) {
                client.field632 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field2126 -= 2;
            client.field874 = (short) field1064[Statics.field2126];
            if (client.field874 <= 0) {
                client.field874 = 256;
            }
            client.field875 = (short) field1064[Statics.field2126 + 1];
            if (client.field875 <= 0) {
                client.field875 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field2126 -= 4;
            client.field892 = (short) field1064[Statics.field2126];
            if (client.field892 <= 0) {
                client.field892 = 1;
            }
            client.field877 = (short) field1064[Statics.field2126 + 1];
            if (client.field877 <= 0) {
                client.field877 = 32767;
            } else if (client.field877 < client.field892) {
                client.field877 = client.field892;
            }
            client.field878 = (short) field1064[Statics.field2126 + 2];
            if (client.field878 <= 0) {
                client.field878 = 1;
            }
            client.field879 = (short) field1064[Statics.field2126 + 3];
            if (client.field879 <= 0) {
                client.field879 = 32767;
            } else if (client.field879 < client.field878) {
                client.field879 = client.field878;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field794 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                client.method5182(0, 0, client.field794.field2765, client.field794.field2678, false);
                field1064[++Statics.field2126 - 1] = client.field882;
                field1064[++Statics.field2126 - 1] = client.field883;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1064[++Statics.field2126 - 1] = client.field874;
            field1064[++Statics.field2126 - 1] = client.field875;
            return 1;
        } else if (arg0 == 6205) {
            field1064[++Statics.field2126 - 1] = method514(client.field872);
            field1064[++Statics.field2126 - 1] = method514(client.field632);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.ap(ILcg;ZI)I")
    public static int method516(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1064[++Statics.field2126 - 1] = class72.method4944() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class72 var3 = class72.method3321();
            if (var3 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = 0;
                field1065[++Statics.field1066 - 1] = "";
                field1064[++Statics.field2126 - 1] = 0;
                field1064[++Statics.field2126 - 1] = 0;
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1064[++Statics.field2126 - 1] = var3.field990;
                field1064[++Statics.field2126 - 1] = var3.field996;
                field1065[++Statics.field1066 - 1] = var3.field994;
                field1064[++Statics.field2126 - 1] = var3.field995;
                field1064[++Statics.field2126 - 1] = var3.field992;
                field1065[++Statics.field1066 - 1] = var3.field988;
            }
            return 1;
        } else if (arg0 == 6502) {
            class72 var4 = class72.method5189();
            if (var4 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = 0;
                field1065[++Statics.field1066 - 1] = "";
                field1064[++Statics.field2126 - 1] = 0;
                field1064[++Statics.field2126 - 1] = 0;
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1064[++Statics.field2126 - 1] = var4.field990;
                field1064[++Statics.field2126 - 1] = var4.field996;
                field1065[++Statics.field1066 - 1] = var4.field994;
                field1064[++Statics.field2126 - 1] = var4.field995;
                field1064[++Statics.field2126 - 1] = var4.field992;
                field1065[++Statics.field1066 - 1] = var4.field988;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1064[--Statics.field2126];
            class72 var6 = null;
            for (int var7 = 0; var7 < class72.field991; var7++) {
                if (Statics.field517[var7].field990 == var5) {
                    var6 = Statics.field517[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = 0;
                field1065[++Statics.field1066 - 1] = "";
                field1064[++Statics.field2126 - 1] = 0;
                field1064[++Statics.field2126 - 1] = 0;
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1064[++Statics.field2126 - 1] = var6.field990;
                field1064[++Statics.field2126 - 1] = var6.field996;
                field1065[++Statics.field1066 - 1] = var6.field994;
                field1064[++Statics.field2126 - 1] = var6.field995;
                field1064[++Statics.field2126 - 1] = var6.field992;
                field1065[++Statics.field1066 - 1] = var6.field988;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field2126 -= 4;
            int var8 = field1064[Statics.field2126];
            boolean var9 = field1064[Statics.field2126 + 1] == 1;
            int var10 = field1064[Statics.field2126 + 2];
            boolean var11 = field1064[Statics.field2126 + 3] == 1;
            class72.method231(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1064[--Statics.field2126];
            if (var12 >= 0 && var12 < class72.field991) {
                class72 var13 = Statics.field517[var12];
                field1064[++Statics.field2126 - 1] = var13.field990;
                field1064[++Statics.field2126 - 1] = var13.field996;
                field1065[++Statics.field1066 - 1] = var13.field994;
                field1064[++Statics.field2126 - 1] = var13.field995;
                field1064[++Statics.field2126 - 1] = var13.field992;
                field1065[++Statics.field1066 - 1] = var13.field988;
            } else {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = 0;
                field1065[++Statics.field1066 - 1] = "";
                field1064[++Statics.field2126 - 1] = 0;
                field1064[++Statics.field2126 - 1] = 0;
                field1065[++Statics.field1066 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field767 = field1064[--Statics.field2126] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field2126 -= 2;
            int var14 = field1064[Statics.field2126];
            int var15 = field1064[Statics.field2126 + 1];
            class261 var16 = class261.method4106(var15);
            if (var16.method4504()) {
                field1065[++Statics.field1066 - 1] = class268.method4643(var14).method4704(var15, var16.field3380);
            } else {
                field1064[++Statics.field2126 - 1] = class268.method4643(var14).method4730(var15, var16.field3379);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field2126 -= 2;
            int var17 = field1064[Statics.field2126];
            int var18 = field1064[Statics.field2126 + 1];
            class261 var19 = class261.method4106(var18);
            if (var19.method4504()) {
                field1065[++Statics.field1066 - 1] = class265.method763(var17).method4603(var18, var19.field3380);
            } else {
                field1064[++Statics.field2126 - 1] = class265.method763(var17).method4602(var18, var19.field3379);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field2126 -= 2;
            int var20 = field1064[Statics.field2126];
            int var21 = field1064[Statics.field2126 + 1];
            class261 var22 = class261.method4106(var21);
            if (var22.method4504()) {
                field1065[++Statics.field1066 - 1] = class266.method4129(var20).method4659(var21, var22.field3380);
            } else {
                field1064[++Statics.field2126 - 1] = class266.method4129(var20).method4658(var21, var22.field3379);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field2126 -= 2;
            int var23 = field1064[Statics.field2126];
            int var24 = field1064[Statics.field2126 + 1];
            class261 var25 = class261.method4106(var24);
            if (var25.method4504()) {
                field1065[++Statics.field1066 - 1] = class262.method3351(var23).method4525(var24, var25.field3380);
            } else {
                field1064[++Statics.field2126 - 1] = class262.method3351(var23).method4524(var24, var25.field3379);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1064[++Statics.field2126 - 1] = client.field629 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1064[++Statics.field2126 - 1] = client.field685 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1066--;
            Statics.field2126--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1066--;
            Statics.field2126--;
            return 1;
        } else if (arg0 == 6524) {
            field1064[++Statics.field2126 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1064[++Statics.field2126 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1064[++Statics.field2126 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.as(ILcg;ZI)I")
    public static int method955(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1394;
            int var4 = (Statics.field389.field957 >> 7) + Statics.field405;
            int var5 = (Statics.field389.field916 >> 7) + Statics.field1088;
            Statics.method2469().method5742(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1064[--Statics.field2126];
            String var7 = "";
            class27 var8 = Statics.method2469().method5760(var6);
            if (var8 != null) {
                var7 = var8.method364();
            }
            field1065[++Statics.field1066 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1064[--Statics.field2126];
            Statics.method2469().method5743(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1064[++Statics.field2126 - 1] = Statics.method2469().method5757();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1064[--Statics.field2126];
            Statics.method2469().method5853(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1064[++Statics.field2126 - 1] = Statics.method2469().method5759() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class225 var11 = new class225(field1064[--Statics.field2126]);
            Statics.method2469().method5906(var11.field2605, var11.field2606);
            return 1;
        } else if (arg0 == 6607) {
            class225 var12 = new class225(field1064[--Statics.field2126]);
            Statics.method2469().method5762(var12.field2605, var12.field2606);
            return 1;
        } else if (arg0 == 6608) {
            class225 var13 = new class225(field1064[--Statics.field2126]);
            Statics.method2469().method5753(var13.field2608, var13.field2605, var13.field2606);
            return 1;
        } else if (arg0 == 6609) {
            class225 var14 = new class225(field1064[--Statics.field2126]);
            Statics.method2469().method5764(var14.field2608, var14.field2605, var14.field2606);
            return 1;
        } else if (arg0 == 6610) {
            field1064[++Statics.field2126 - 1] = Statics.method2469().method5765();
            field1064[++Statics.field2126 - 1] = Statics.method2469().method5864();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1064[--Statics.field2126];
            class27 var16 = Statics.method2469().method5760(var15);
            if (var16 == null) {
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = var16.method336().method4009();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1064[--Statics.field2126];
            class27 var18 = Statics.method2469().method5760(var17);
            if (var18 == null) {
                field1064[++Statics.field2126 - 1] = 0;
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = (var18.method295() - var18.method308() + 1) * 64;
                field1064[++Statics.field2126 - 1] = (var18.method311() - var18.method310() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1064[--Statics.field2126];
            class27 var20 = Statics.method2469().method5760(var19);
            if (var20 == null) {
                field1064[++Statics.field2126 - 1] = 0;
                field1064[++Statics.field2126 - 1] = 0;
                field1064[++Statics.field2126 - 1] = 0;
                field1064[++Statics.field2126 - 1] = 0;
            } else {
                field1064[++Statics.field2126 - 1] = var20.method308() * 64;
                field1064[++Statics.field2126 - 1] = var20.method310() * 64;
                field1064[++Statics.field2126 - 1] = var20.method295() * 64 + 64 - 1;
                field1064[++Statics.field2126 - 1] = var20.method311() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1064[--Statics.field2126];
            class27 var22 = Statics.method2469().method5760(var21);
            if (var22 == null) {
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = var22.method307();
            }
            return 1;
        } else if (arg0 == 6615) {
            class225 var23 = Statics.method2469().method5767();
            if (var23 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = var23.field2605;
                field1064[++Statics.field2126 - 1] = var23.field2606;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1064[++Statics.field2126 - 1] = Statics.method2469().method5744();
            return 1;
        } else if (arg0 == 6617) {
            class225 var24 = new class225(field1064[--Statics.field2126]);
            class27 var25 = Statics.method2469().method5745();
            if (var25 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method299(var24.field2608, var24.field2605, var24.field2606);
            if (var26 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = var26[0];
                field1064[++Statics.field2126 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class225 var27 = new class225(field1064[--Statics.field2126]);
            class27 var28 = Statics.method2469().method5745();
            if (var28 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = -1;
                return 1;
            }
            class225 var29 = var28.method300(var27.field2605, var27.field2606);
            if (var29 == null) {
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = var29.method4009();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field2126 -= 2;
            int var30 = field1064[Statics.field2126];
            class225 var31 = new class225(field1064[Statics.field2126 + 1]);
            method79(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field2126 -= 2;
            int var32 = field1064[Statics.field2126];
            class225 var33 = new class225(field1064[Statics.field2126 + 1]);
            method79(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field2126 -= 2;
            int var34 = field1064[Statics.field2126];
            class225 var35 = new class225(field1064[Statics.field2126 + 1]);
            class27 var36 = Statics.method2469().method5760(var34);
            if (var36 == null) {
                field1064[++Statics.field2126 - 1] = 0;
                return 1;
            } else {
                field1064[++Statics.field2126 - 1] = var36.method297(var35.field2608, var35.field2605, var35.field2606) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1064[++Statics.field2126 - 1] = Statics.method2469().method5768();
            field1064[++Statics.field2126 - 1] = Statics.method2469().method5769();
            return 1;
        } else if (arg0 == 6623) {
            class225 var37 = new class225(field1064[--Statics.field2126]);
            class27 var38 = Statics.method2469().method5741(var37.field2608, var37.field2605, var37.field2606);
            if (var38 == null) {
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = var38.method337();
            }
            return 1;
        } else if (arg0 == 6624) {
            Statics.method2469().method5770(field1064[--Statics.field2126]);
            return 1;
        } else if (arg0 == 6625) {
            Statics.method2469().method5771();
            return 1;
        } else if (arg0 == 6626) {
            Statics.method2469().method5772(field1064[--Statics.field2126]);
            return 1;
        } else if (arg0 == 6627) {
            Statics.method2469().method5773();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1064[--Statics.field2126] == 1;
            Statics.method2469().method5774(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1064[--Statics.field2126];
            Statics.method2469().method5775(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1064[--Statics.field2126];
            Statics.method2469().method5826(var41);
            return 1;
        } else if (arg0 == 6631) {
            Statics.method2469().method5777();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1064[--Statics.field2126] == 1;
            Statics.method2469().method5776(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field2126 -= 2;
            int var43 = field1064[Statics.field2126];
            boolean var44 = field1064[Statics.field2126 + 1] == 1;
            Statics.method2469().method5779(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field2126 -= 2;
            int var45 = field1064[Statics.field2126];
            boolean var46 = field1064[Statics.field2126 + 1] == 1;
            Statics.method2469().method5901(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1064[++Statics.field2126 - 1] = Statics.method2469().method5781() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = Statics.method2469().method5782(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1064[--Statics.field2126];
            field1064[++Statics.field2126 - 1] = Statics.method2469().method5859(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field2126 -= 2;
            int var49 = field1064[Statics.field2126];
            class225 var50 = new class225(field1064[Statics.field2126 + 1]);
            class225 var51 = Statics.method2469().method5786(var49, var50);
            if (var51 == null) {
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = var51.method4009();
            }
            return 1;
        } else if (arg0 == 6639) {
            class35 var52 = Statics.method2469().method5788();
            if (var52 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = var52.method192();
                field1064[++Statics.field2126 - 1] = var52.field287.method4009();
            }
            return 1;
        } else if (arg0 == 6640) {
            class35 var53 = Statics.method2469().method5789();
            if (var53 == null) {
                field1064[++Statics.field2126 - 1] = -1;
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = var53.method192();
                field1064[++Statics.field2126 - 1] = var53.field287.method4009();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1064[--Statics.field2126];
            class253 var55 = class253.method2731(var54);
            if (var55.field3291 == null) {
                field1065[++Statics.field1066 - 1] = "";
            } else {
                field1065[++Statics.field1066 - 1] = var55.field3291;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1064[--Statics.field2126];
            class253 var57 = class253.method2731(var56);
            field1064[++Statics.field2126 - 1] = var57.field3290;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1064[--Statics.field2126];
            class253 var59 = class253.method2731(var58);
            if (var59 == null) {
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = var59.field3305;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1064[--Statics.field2126];
            class253 var61 = class253.method2731(var60);
            if (var61 == null) {
                field1064[++Statics.field2126 - 1] = -1;
            } else {
                field1064[++Statics.field2126 - 1] = var61.field3289;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1064[++Statics.field2126 - 1] = Statics.field79.field335;
            return 1;
        } else if (arg0 == 6698) {
            field1064[++Statics.field2126 - 1] = Statics.field79.field332.method4009();
            return 1;
        } else if (arg0 == 6699) {
            field1064[++Statics.field2126 - 1] = Statics.field79.field333.method4009();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.am(IB)V")
    public static void method289(int arg0) {
        if (arg0 == -1 || !class229.method2527(arg0)) {
            return;
        }
        class229[] var1 = Statics.field2634[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class229 var3 = var1[var2];
            if (var3.field2660 != null) {
                class63 var4 = new class63();
                var4.field558 = var3;
                var4.field554 = var3.field2660;
                method68(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("e.an(ILhu;ZI)V")
    public static void method79(int arg0, class225 arg1, boolean arg2) {
        class27 var3 = Statics.method2469().method5760(arg0);
        int var4 = Statics.field389.field608;
        int var5 = (Statics.field389.field957 >> 7) + Statics.field405;
        int var6 = (Statics.field389.field916 >> 7) + Statics.field1088;
        class225 var7 = new class225(var4, var5, var6);
        Statics.method2469().method5748(var3, var7, arg1, arg2);
    }
}
