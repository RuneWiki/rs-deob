package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cn")
public class class86 {

    @ObfuscatedName("cn.z")
    public static int[] field1106 = new int[5];

    @ObfuscatedName("cn.e")
    public static int[][] field1111 = new int[5][5000];

    @ObfuscatedName("cn.q")
    public static int[] field1126 = new int[1000];

    @ObfuscatedName("cn.s")
    public static String[] field1114 = new String[1000];

    @ObfuscatedName("cn.a")
    public static int field1116 = 0;

    @ObfuscatedName("cn.w")
    public static class66[] field1107 = new class66[50];

    @ObfuscatedName("cn.x")
    public static Calendar field1119 = Calendar.getInstance();

    @ObfuscatedName("cn.f")
    public static final String[] field1120 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cn.u")
    public static boolean field1121 = false;

    @ObfuscatedName("cn.t")
    public static boolean field1123 = false;

    @ObfuscatedName("cn.p")
    public static int field1124 = 0;

    @ObfuscatedName("cn.j")
    public static final double field1125 = Math.log(2.0D);

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.n(Lby;I)V")
    public static void method2227(class72 arg0) {
        method107(arg0, 500000);
    }

    @ObfuscatedName("k.v(Lby;IB)V")
    public static void method107(class72 arg0, int arg1) {
        Object[] var2 = arg0.field595;
        class102 var4;
        if (class305.method4015(arg0.field596)) {
            Statics.field1112 = (class51) var2[0];
            class253 var3 = class253.method4155(Statics.field1112.field378);
            var4 = class102.method137(arg0.field596, var3.field3249, var3.field3268);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class102.method2170(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field1113 = 0;
        Statics.field1115 = 0;
        int var6 = -1;
        int[] var7 = var4.field1294;
        int[] var8 = var4.field1302;
        byte var9 = -1;
        field1116 = 0;
        field1121 = false;
        try {
            Statics.field1109 = new int[var4.field1293];
            int var10 = 0;
            Statics.field4080 = new String[var4.field1298];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field588;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field589;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field587 == null ? -1 : arg0.field587.field2594;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field590;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field587 == null ? -1 : arg0.field587.field2595;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field591 == null ? -1 : arg0.field591.field2594;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field591 == null ? -1 : arg0.field591.field2595;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field592;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field593;
                    }
                    Statics.field1109[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field585;
                    }
                    Statics.field4080[var11++] = var14;
                }
            }
            int var15 = 0;
            field1124 = arg0.field594;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1302[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method5071(var53, var4, var43);
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
                    field1126[++Statics.field1113 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1126[++Statics.field1113 - 1] = class222.field2556[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class222.field2556[var17] = field1126[--Statics.field1113];
                    client.method615(var17);
                } else if (var53 == 3) {
                    field1114[++Statics.field1115 - 1] = var4.field1296[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field1113 -= 2;
                    if (field1126[Statics.field1113] != field1126[Statics.field1113 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field1113 -= 2;
                    if (field1126[Statics.field1113] == field1126[Statics.field1113 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field1113 -= 2;
                    if (field1126[Statics.field1113] < field1126[Statics.field1113 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field1113 -= 2;
                    if (field1126[Statics.field1113] > field1126[Statics.field1113 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1116 == 0) {
                        return;
                    }
                    class66 var18 = field1107[--field1116];
                    var4 = var18.field538;
                    var7 = var4.field1294;
                    var8 = var4.field1302;
                    var6 = var18.field535;
                    Statics.field1109 = var18.field536;
                    Statics.field4080 = var18.field534;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1126[++Statics.field1113 - 1] = class222.method5065(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class222.method334(var20, field1126[--Statics.field1113]);
                } else if (var53 == 31) {
                    Statics.field1113 -= 2;
                    if (field1126[Statics.field1113] <= field1126[Statics.field1113 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field1113 -= 2;
                    if (field1126[Statics.field1113] >= field1126[Statics.field1113 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1126[++Statics.field1113 - 1] = Statics.field1109[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field1109[var8[var6]] = field1126[--Statics.field1113];
                } else if (var53 == 35) {
                    field1114[++Statics.field1115 - 1] = Statics.field4080[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field4080[var8[var6]] = field1114[--Statics.field1115];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field1115 -= var21;
                    String var22 = class302.method288(field1114, Statics.field1115, var21);
                    field1114[++Statics.field1115 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field1113--;
                } else if (var53 == 39) {
                    Statics.field1115--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class102 var24 = class102.method2170(var23);
                    int[] var25 = new int[var24.field1293];
                    String[] var26 = new String[var24.field1298];
                    for (int var27 = 0; var27 < var24.field1297; var27++) {
                        var25[var27] = field1126[Statics.field1113 - var24.field1297 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1300; var28++) {
                        var26[var28] = field1114[Statics.field1115 - var24.field1300 + var28];
                    }
                    Statics.field1113 -= var24.field1297;
                    Statics.field1115 -= var24.field1300;
                    class66 var29 = new class66();
                    var29.field538 = var4;
                    var29.field535 = var6;
                    var29.field536 = Statics.field1109;
                    var29.field534 = Statics.field4080;
                    field1107[++field1116 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1294;
                    var8 = var24.field1302;
                    var6 = -1;
                    Statics.field1109 = var25;
                    Statics.field4080 = var26;
                } else if (var53 == 42) {
                    field1126[++Statics.field1113 - 1] = Statics.field99.method2122(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field99.method2131(var8[var6], field1126[--Statics.field1113]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1126[--Statics.field1113];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1106[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1111[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1126[--Statics.field1113];
                    if (var36 < 0 || var36 >= field1106[var35]) {
                        throw new RuntimeException();
                    }
                    field1126[++Statics.field1113 - 1] = field1111[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field1113 -= 2;
                    int var38 = field1126[Statics.field1113];
                    if (var38 < 0 || var38 >= field1106[var37]) {
                        throw new RuntimeException();
                    }
                    field1111[var37][var38] = field1126[Statics.field1113 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field99.method2126(var8[var6]);
                    if (var39 == null) {
                        var39 = class234.field2795;
                    }
                    field1114[++Statics.field1115 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field99.method2125(var8[var6], field1114[--Statics.field1115]);
                } else if (var53 == 49) {
                    String var40 = Statics.field99.method2124(var8[var6]);
                    field1114[++Statics.field1115 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field99.method2123(var8[var6], field1114[--Statics.field1115]);
                } else if (var53 == 60) {
                    class327 var41 = var4.field1301[var8[var6]];
                    class189 var42 = (class189) var41.method5648((long) field1126[--Statics.field1113]);
                    if (var42 != null) {
                        var6 += var42.field2138;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2141).append(" ");
            for (int var47 = field1116 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1107[var47].field538.field2141).append(" ");
            }
            var46.append("").append(var9);
            class352.method4617(var46.toString(), var51);
        } finally {
            if (field1121) {
                field1123 = true;
                client.method3554();
                field1123 = false;
                field1121 = false;
            }
        }
    }

    @ObfuscatedName("kn.d(ILcl;ZI)I")
    public static int method5071(int arg0, class102 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method3944(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return Statics.method39(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2024(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method3529(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method319(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method596(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method618(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method79(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return Statics.method1686(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method3792(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3342(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return Statics.method39(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2024(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method3529(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method319(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method596(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3341(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method3971(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method1036(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method2049(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3342(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method3759(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method1175(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return Statics.method3956(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method651(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method3185(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method16(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method3808(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method3391(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method4526(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method1077(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method1687(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method1083(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method262(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method3927(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method1177(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method1680(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method3506(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hx.c(ILcl;ZI)I")
    public static int method3944(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1113 -= 3;
            int var3 = field1126[Statics.field1113];
            int var4 = field1126[Statics.field1113 + 1];
            int var5 = field1126[Statics.field1113 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class227 var6 = class227.method3963(var3);
            if (var6.field2584 == null) {
                var6.field2584 = new class227[var5 + 1];
            }
            if (var6.field2584.length <= var5) {
                class227[] var7 = new class227[var5 + 1];
                for (int var8 = 0; var8 < var6.field2584.length; var8++) {
                    var7[var8] = var6.field2584[var8];
                }
                var6.field2584 = var7;
            }
            if (var5 > 0 && var6.field2584[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class227 var9 = new class227();
            var9.field2596 = var4;
            var9.field2613 = var9.field2594 = var6.field2594;
            var9.field2595 = var5;
            var9.field2593 = true;
            var6.field2584[var5] = var9;
            if (arg2) {
                Statics.field3585 = var9;
            } else {
                Statics.field1118 = var9;
            }
            client.method5979(var6);
            return 1;
        } else if (arg0 == 101) {
            class227 var10 = arg2 ? Statics.field3585 : Statics.field1118;
            class227 var11 = class227.method3963(var10.field2594);
            var11.field2584[var10.field2595] = null;
            client.method5979(var11);
            return 1;
        } else if (arg0 == 102) {
            class227 var12 = class227.method3963(field1126[--Statics.field1113]);
            var12.field2584 = null;
            client.method5979(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1113 -= 2;
            int var13 = field1126[Statics.field1113];
            int var14 = field1126[Statics.field1113 + 1];
            class227 var15 = class227.method1102(var13, var14);
            if (var15 == null || var14 == -1) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = 1;
                if (arg2) {
                    Statics.field3585 = var15;
                } else {
                    Statics.field1118 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class227 var16 = class227.method3963(field1126[--Statics.field1113]);
            if (var16 == null) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = 1;
                if (arg2) {
                    Statics.field3585 = var16;
                } else {
                    Statics.field1118 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cs.h(ILcl;ZI)I")
    public static int method2024(int arg0, class102 arg1, boolean arg2) {
        int var3 = -1;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1126[--Statics.field1113];
            var4 = class227.method3963(var3);
        } else {
            var4 = arg2 ? Statics.field3585 : Statics.field1118;
        }
        if (arg0 == 1100) {
            Statics.field1113 -= 2;
            var4.field2615 = field1126[Statics.field1113];
            if (var4.field2615 > var4.field2617 - var4.field2609) {
                var4.field2615 = var4.field2617 - var4.field2609;
            }
            if (var4.field2615 < 0) {
                var4.field2615 = 0;
            }
            var4.field2736 = field1126[Statics.field1113 + 1];
            if (var4.field2736 > var4.field2618 - var4.field2647) {
                var4.field2736 = var4.field2618 - var4.field2647;
            }
            if (var4.field2736 < 0) {
                var4.field2736 = 0;
            }
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2619 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2640 = field1126[--Statics.field1113] == 1;
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2625 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2705 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2629 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2724 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2719 = field1126[--Statics.field1113] == 1;
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2637 = 1;
            var4.field2683 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1113 -= 6;
            var4.field2643 = field1126[Statics.field1113];
            var4.field2627 = field1126[Statics.field1113 + 1];
            var4.field2645 = field1126[Statics.field1113 + 2];
            var4.field2646 = field1126[Statics.field1113 + 3];
            var4.field2662 = field1126[Statics.field1113 + 4];
            var4.field2648 = field1126[Statics.field1113 + 5];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1126[--Statics.field1113];
            if (var4.field2641 != var5) {
                var4.field2641 = var5;
                var4.field2722 = 0;
                var4.field2696 = 0;
                client.method5979(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2700 = field1126[--Statics.field1113] == 1;
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1114[--Statics.field1115];
            if (!var6.equals(var4.field2655)) {
                var4.field2655 = var6;
                client.method5979(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2654 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1113 -= 3;
            var4.field2658 = field1126[Statics.field1113];
            var4.field2659 = field1126[Statics.field1113 + 1];
            var4.field2644 = field1126[Statics.field1113 + 2];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2651 = field1126[--Statics.field1113] == 1;
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2633 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2634 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2638 = field1126[--Statics.field1113] == 1;
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2636 = field1126[--Statics.field1113] == 1;
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1113 -= 2;
            var4.field2617 = field1126[Statics.field1113];
            var4.field2618 = field1126[Statics.field1113 + 1];
            client.method5979(var4);
            if (var3 != -1 && var4.field2596 == 0) {
                client.method3478(Statics.field3836[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method230(var4.field2594, var4.field2595);
            client.field831 = var4;
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2630 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2610 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2623 = field1126[--Statics.field1113];
            client.method5979(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1126[--Statics.field1113];
            class334 var8 = (class334) class205.method1123(class334.method5178(), var7);
            if (var8 != null) {
                var4.field2711 = var8;
                client.method5979(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1126[--Statics.field1113] == 1;
            var4.field2628 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1126[--Statics.field1113] == 1;
            var4.field2620 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gr.z(ILcl;ZI)I")
    public static int method3529(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method3963(field1126[--Statics.field1113]);
        } else {
            var3 = arg2 ? Statics.field3585 : Statics.field1118;
        }
        client.method5979(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1113 -= 2;
            int var4 = field1126[Statics.field1113];
            int var5 = field1126[Statics.field1113 + 1];
            var3.field2677 = var4;
            var3.field2721 = var5;
            class266 var6 = class266.method4793(var4);
            var3.field2645 = var6.field3449;
            var3.field2646 = var6.field3450;
            var3.field2662 = var6.field3451;
            var3.field2643 = var6.field3481;
            var3.field2627 = var6.field3466;
            var3.field2648 = var6.field3434;
            if (arg0 == 1205) {
                var3.field2653 = 0;
            } else if (arg0 == 1212 | var6.field3443 == 1) {
                var3.field2653 = 1;
            } else {
                var3.field2653 = 2;
            }
            if (var3.field2649 > 0) {
                var3.field2648 = var3.field2648 * 32 / var3.field2649;
            } else if (var3.field2605 > 0) {
                var3.field2648 = var3.field2648 * 32 / var3.field2605;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2637 = 2;
            var3.field2683 = field1126[--Statics.field1113];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2637 = 3;
            var3.field2683 = Statics.field1986.field629.method3847();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.e(ILcl;ZI)I")
    public static int method319(int arg0, class102 arg1, boolean arg2) {
        boolean var3 = true;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class227.method3963(field1126[--Statics.field1113]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field3585 : Statics.field1118;
        }
        if (arg0 == 1300) {
            int var5 = field1126[--Statics.field1113] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3887(var5, field1114[--Statics.field1115]);
                return 1;
            } else {
                Statics.field1115--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1113 -= 2;
            int var6 = field1126[Statics.field1113];
            int var7 = field1126[Statics.field1113 + 1];
            var4.field2697 = class227.method1102(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2678 = field1126[--Statics.field1113] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2703 = field1126[--Statics.field1113];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2675 = field1126[--Statics.field1113];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2673 = field1114[--Statics.field1115];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2692 = field1114[--Statics.field1115];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2699 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2714 = field1126[--Statics.field1113] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field1113--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1113 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1126[Statics.field1113 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1126[Statics.field1113 + var10];
                        var9[var10 / 2] = (byte) field1126[Statics.field1113 + var10 + 1];
                    }
                }
            } else {
                Statics.field1113 -= 2;
                var8 = new byte[] { (byte) field1126[Statics.field1113] };
                var9 = new byte[] { (byte) field1126[Statics.field1113 + 1] };
            }
            int var11 = field1126[--Statics.field1113] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method3386(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1113 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1126[Statics.field1113] };
            byte[] var14 = new byte[] { (byte) field1126[Statics.field1113 + 1] };
            method3386(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1113 -= 3;
            int var15 = field1126[Statics.field1113] - 1;
            int var16 = field1126[Statics.field1113 + 1];
            int var17 = field1126[Statics.field1113 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method517(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1126[--Statics.field1113];
            int var20 = field1126[--Statics.field1113];
            method517(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1113--;
            int var21 = field1126[Statics.field1113] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method257(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method257(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fu.q(Lhz;I[B[BI)V")
    public static final void method3386(class227 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2669 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2669 = new byte[11][];
            arg0.field2670 = new byte[11][];
            arg0.field2687 = new int[11];
            arg0.field2600 = new int[11];
        }
        arg0.field2669[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2668 = false;
            for (int var4 = 0; var4 < arg0.field2669.length; var4++) {
                if (arg0.field2669[var4] != null) {
                    arg0.field2668 = true;
                    break;
                }
            }
        } else {
            arg0.field2668 = true;
        }
        arg0.field2670[arg1] = arg3;
    }

    @ObfuscatedName("as.l(Lhz;IIII)V")
    public static final void method517(class227 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2687 == null) {
            throw new RuntimeException();
        }
        arg0.field2687[arg1] = arg2;
        arg0.field2600[arg1] = arg3;
    }

    @ObfuscatedName("am.s(Lhz;II)V")
    public static final void method257(class227 arg0, int arg1) {
        if (arg0.field2669 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2661 == null) {
            arg0.field2661 = new int[arg0.field2669.length];
        }
        arg0.field2661[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ap.b(ILcl;ZI)I")
    public static int method596(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method3963(field1126[--Statics.field1113]);
        } else {
            var3 = arg2 ? Statics.field3585 : Statics.field1118;
        }
        String var4 = field1114[--Statics.field1115];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1126[--Statics.field1113];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1126[--Statics.field1113];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1114[--Statics.field1115];
            } else {
                var7[var8] = Integer.valueOf(field1126[--Statics.field1113]);
            }
        }
        int var9 = field1126[--Statics.field1113];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2682 = var7;
        } else if (arg0 == 1401) {
            var3.field2685 = var7;
        } else if (arg0 == 1402) {
            var3.field2684 = var7;
        } else if (arg0 == 1403) {
            var3.field2686 = var7;
        } else if (arg0 == 1404) {
            var3.field2688 = var7;
        } else if (arg0 == 1405) {
            var3.field2710 = var7;
        } else if (arg0 == 1406) {
            var3.field2635 = var7;
        } else if (arg0 == 1407) {
            var3.field2693 = var7;
            var3.field2694 = var5;
        } else if (arg0 == 1408) {
            var3.field2604 = var7;
        } else if (arg0 == 1409) {
            var3.field2632 = var7;
        } else if (arg0 == 1410) {
            var3.field2690 = var7;
        } else if (arg0 == 1411) {
            var3.field2733 = var7;
        } else if (arg0 == 1412) {
            var3.field2586 = var7;
        } else if (arg0 == 1414) {
            var3.field2695 = var7;
            var3.field2676 = var5;
        } else if (arg0 == 1415) {
            var3.field2672 = var7;
            var3.field2698 = var5;
        } else if (arg0 == 1416) {
            var3.field2590 = var7;
        } else if (arg0 == 1417) {
            var3.field2701 = var7;
        } else if (arg0 == 1418) {
            var3.field2702 = var7;
        } else if (arg0 == 1419) {
            var3.field2626 = var7;
        } else if (arg0 == 1420) {
            var3.field2718 = var7;
        } else if (arg0 == 1421) {
            var3.field2689 = var7;
        } else if (arg0 == 1422) {
            var3.field2706 = var7;
        } else if (arg0 == 1423) {
            var3.field2707 = var7;
        } else if (arg0 == 1424) {
            var3.field2708 = var7;
        } else if (arg0 == 1425) {
            var3.field2704 = var7;
        } else if (arg0 == 1426) {
            var3.field2679 = var7;
        } else if (arg0 == 1427) {
            var3.field2709 = var7;
        } else {
            return 2;
        }
        var3.field2616 = true;
        return 1;
    }

    @ObfuscatedName("aj.a(ILcl;ZI)I")
    public static int method618(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field3585 : Statics.field1118;
        if (arg0 == 1500) {
            field1126[++Statics.field1113 - 1] = var3.field2607;
            return 1;
        } else if (arg0 == 1501) {
            field1126[++Statics.field1113 - 1] = var3.field2608;
            return 1;
        } else if (arg0 == 1502) {
            field1126[++Statics.field1113 - 1] = var3.field2609;
            return 1;
        } else if (arg0 == 1503) {
            field1126[++Statics.field1113 - 1] = var3.field2647;
            return 1;
        } else if (arg0 == 1504) {
            field1126[++Statics.field1113 - 1] = var3.field2614 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1126[++Statics.field1113 - 1] = var3.field2613;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.w(ILcl;ZI)I")
    public static int method79(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field3585 : Statics.field1118;
        if (arg0 == 1600) {
            field1126[++Statics.field1113 - 1] = var3.field2615;
            return 1;
        } else if (arg0 == 1601) {
            field1126[++Statics.field1113 - 1] = var3.field2736;
            return 1;
        } else if (arg0 == 1602) {
            field1114[++Statics.field1115 - 1] = var3.field2655;
            return 1;
        } else if (arg0 == 1603) {
            field1126[++Statics.field1113 - 1] = var3.field2617;
            return 1;
        } else if (arg0 == 1604) {
            field1126[++Statics.field1113 - 1] = var3.field2618;
            return 1;
        } else if (arg0 == 1605) {
            field1126[++Statics.field1113 - 1] = var3.field2648;
            return 1;
        } else if (arg0 == 1606) {
            field1126[++Statics.field1113 - 1] = var3.field2645;
            return 1;
        } else if (arg0 == 1607) {
            field1126[++Statics.field1113 - 1] = var3.field2662;
            return 1;
        } else if (arg0 == 1608) {
            field1126[++Statics.field1113 - 1] = var3.field2646;
            return 1;
        } else if (arg0 == 1609) {
            field1126[++Statics.field1113 - 1] = var3.field2625;
            return 1;
        } else if (arg0 == 1610) {
            field1126[++Statics.field1113 - 1] = var3.field2623;
            return 1;
        } else if (arg0 == 1611) {
            field1126[++Statics.field1113 - 1] = var3.field2619;
            return 1;
        } else if (arg0 == 1612) {
            field1126[++Statics.field1113 - 1] = var3.field2610;
            return 1;
        } else if (arg0 == 1613) {
            field1126[++Statics.field1113 - 1] = var3.field2711.method30();
            return 1;
        } else if (arg0 == 1614) {
            field1126[++Statics.field1113 - 1] = var3.field2620 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hp.i(ILcl;ZB)I")
    public static int method3792(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field3585 : Statics.field1118;
        if (arg0 == 1800) {
            field1126[++Statics.field1113 - 1] = Statics.method3749(client.method836(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1126[--Statics.field1113];
            int var5 = var4 - 1;
            if (var3.field2699 == null || var5 >= var3.field2699.length || var3.field2699[var5] == null) {
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1114[++Statics.field1115 - 1] = var3.field2699[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2673 == null) {
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1114[++Statics.field1115 - 1] = var3.field2673;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fy.x(ILcl;ZB)I")
    public static int method3342(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field1124 >= 10) {
                throw new RuntimeException();
            }
            class227 var8;
            if (arg0 >= 2000) {
                var8 = class227.method3963(field1126[--Statics.field1113]);
            } else {
                var8 = arg2 ? Statics.field3585 : Statics.field1118;
            }
            if (var8.field2709 == null) {
                return 0;
            }
            class72 var9 = new class72();
            var9.field587 = var8;
            var9.field595 = var8.field2709;
            var9.field594 = field1124 + 1;
            client.field810.method4699(var9);
            return 1;
        } else if (arg0 == 1928) {
            class227 var3 = arg2 ? Statics.field3585 : Statics.field1118;
            int var4 = field1126[--Statics.field1113];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            client.method1174(var4, var3.field2594, var3.field2595, var3.field2677, "");
            return 1;
        } else if (arg0 == 2928) {
            Statics.field1113 -= 3;
            int var5 = field1126[Statics.field1113];
            int var6 = field1126[Statics.field1113 + 1];
            int var7 = field1126[Statics.field1113 + 2];
            if (var7 < 1 || var7 > 10) {
                throw new RuntimeException();
            }
            client.method1174(var7, var5, var6, class227.method3963(var5).field2677, "");
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fy.g(ILcl;ZI)I")
    public static int method3341(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3963(field1126[--Statics.field1113]);
        if (arg0 == 2500) {
            field1126[++Statics.field1113 - 1] = var3.field2607;
            return 1;
        } else if (arg0 == 2501) {
            field1126[++Statics.field1113 - 1] = var3.field2608;
            return 1;
        } else if (arg0 == 2502) {
            field1126[++Statics.field1113 - 1] = var3.field2609;
            return 1;
        } else if (arg0 == 2503) {
            field1126[++Statics.field1113 - 1] = var3.field2647;
            return 1;
        } else if (arg0 == 2504) {
            field1126[++Statics.field1113 - 1] = var3.field2614 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1126[++Statics.field1113 - 1] = var3.field2613;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iv.u(ILcl;ZI)I")
    public static int method3971(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3963(field1126[--Statics.field1113]);
        if (arg0 == 2600) {
            field1126[++Statics.field1113 - 1] = var3.field2615;
            return 1;
        } else if (arg0 == 2601) {
            field1126[++Statics.field1113 - 1] = var3.field2736;
            return 1;
        } else if (arg0 == 2602) {
            field1114[++Statics.field1115 - 1] = var3.field2655;
            return 1;
        } else if (arg0 == 2603) {
            field1126[++Statics.field1113 - 1] = var3.field2617;
            return 1;
        } else if (arg0 == 2604) {
            field1126[++Statics.field1113 - 1] = var3.field2618;
            return 1;
        } else if (arg0 == 2605) {
            field1126[++Statics.field1113 - 1] = var3.field2648;
            return 1;
        } else if (arg0 == 2606) {
            field1126[++Statics.field1113 - 1] = var3.field2645;
            return 1;
        } else if (arg0 == 2607) {
            field1126[++Statics.field1113 - 1] = var3.field2662;
            return 1;
        } else if (arg0 == 2608) {
            field1126[++Statics.field1113 - 1] = var3.field2646;
            return 1;
        } else if (arg0 == 2609) {
            field1126[++Statics.field1113 - 1] = var3.field2625;
            return 1;
        } else if (arg0 == 2610) {
            field1126[++Statics.field1113 - 1] = var3.field2623;
            return 1;
        } else if (arg0 == 2611) {
            field1126[++Statics.field1113 - 1] = var3.field2619;
            return 1;
        } else if (arg0 == 2612) {
            field1126[++Statics.field1113 - 1] = var3.field2610;
            return 1;
        } else if (arg0 == 2613) {
            field1126[++Statics.field1113 - 1] = var3.field2711.method30();
            return 1;
        } else if (arg0 == 2614) {
            field1126[++Statics.field1113 - 1] = var3.field2620 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.t(ILcl;ZB)I")
    public static int method1036(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class227 var3 = class227.method3963(field1126[--Statics.field1113]);
            field1126[++Statics.field1113 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 2701) {
            class227 var4 = class227.method3963(field1126[--Statics.field1113]);
            if (var4.field2677 == -1) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = var4.field2721;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1126[--Statics.field1113];
            class71 var6 = (class71) client.field826.method5682((long) var5);
            if (var6 == null) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1126[++Statics.field1113 - 1] = client.field827;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cy.p(ILcl;ZB)I")
    public static int method2049(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3963(field1126[--Statics.field1113]);
        if (arg0 == 2800) {
            field1126[++Statics.field1113 - 1] = Statics.method3749(client.method836(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1126[--Statics.field1113];
            int var5 = var4 - 1;
            if (var3.field2699 == null || var5 >= var3.field2699.length || var3.field2699[var5] == null) {
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1114[++Statics.field1115 - 1] = var3.field2699[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2673 == null) {
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1114[++Statics.field1115 - 1] = var3.field2673;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("he.o(ILcl;ZI)I")
    public static int method3759(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1114[--Statics.field1115];
            class101.method314(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1113 -= 2;
            client.method3304(Statics.field1986, field1126[Statics.field1113], field1126[Statics.field1113 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1123) {
                field1121 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1114[--Statics.field1115];
            int var5 = 0;
            if (class302.method344(var4)) {
                var5 = class302.method3791(var4);
            }
            class197 var6 = class197.method434(class193.field2286, client.field751.field1333);
            var6.field2372.method5231(var5);
            client.field751.method2239(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1114[--Statics.field1115];
            class197 var8 = class197.method434(class193.field2304, client.field751.field1333);
            var8.field2372.method5279(var7.length() + 1);
            var8.field2372.method5257(var7);
            client.field751.method2239(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1114[--Statics.field1115];
            class197 var10 = class197.method434(class193.field2312, client.field751.field1333);
            var10.field2372.method5279(var9.length() + 1);
            var10.field2372.method5257(var9);
            client.field751.method2239(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1126[--Statics.field1113];
            String var12 = field1114[--Statics.field1115];
            client.method64(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1113 -= 3;
            int var13 = field1126[Statics.field1113];
            int var14 = field1126[Statics.field1113 + 1];
            int var15 = field1126[Statics.field1113 + 2];
            class227 var16 = class227.method3963(var15);
            client.method1849(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1113 -= 2;
            int var17 = field1126[Statics.field1113];
            int var18 = field1126[Statics.field1113 + 1];
            class227 var19 = arg2 ? Statics.field3585 : Statics.field1118;
            client.method1849(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field47 = field1126[--Statics.field1113] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1126[++Statics.field1113 - 1] = Statics.field191.field1068 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field191.field1068 = field1126[--Statics.field1113] == 1;
            class83.method213();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1114[--Statics.field1115];
            boolean var21 = field1126[--Statics.field1113] == 1;
            class61.method324(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1126[--Statics.field1113];
            class197 var23 = class197.method434(class193.field2332, client.field751.field1333);
            var23.field2372.method5229(var22);
            client.field751.method2239(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1126[--Statics.field1113];
            Statics.field1115 -= 2;
            String var25 = field1114[Statics.field1115];
            String var26 = field1114[Statics.field1115 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class197 var27 = class197.method434(class193.field2320, client.field751.field1333);
                var27.field2372.method5229(1 + class311.method235(var25) + class311.method235(var26));
                var27.field2372.method5257(var25);
                var27.field2372.method5334(var24);
                var27.field2372.method5257(var26);
                client.field751.method2239(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field811 = field1126[--Statics.field1113] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field813 = field1126[--Statics.field1113] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field784 = field1126[--Statics.field1113] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1126[--Statics.field1113] == 1) {
                client.field899 |= 0x1;
            } else {
                client.field899 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1126[--Statics.field1113] == 1) {
                client.field899 |= 0x2;
            } else {
                client.field899 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1126[--Statics.field1113] == 1) {
                client.field899 |= 0x4;
            } else {
                client.field899 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1126[--Statics.field1113] == 1) {
                client.field899 |= 0x8;
            } else {
                client.field899 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field899 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field776 = field1126[--Statics.field1113] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field898 = field1126[--Statics.field1113] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method1078(field1126[--Statics.field1113] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1126[++Statics.field1113 - 1] = client.method410() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1113 -= 2;
            client.field745 = field1126[Statics.field1113];
            client.field746 = field1126[Statics.field1113 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1113 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1113--;
            return 1;
        } else if (arg0 == 3132) {
            field1126[++Statics.field1113 - 1] = Statics.field88;
            field1126[++Statics.field1113 - 1] = Statics.field145;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1113--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1113 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field706 = 3;
            client.field700 = field1126[--Statics.field1113];
            return 1;
        } else if (arg0 == 3137) {
            client.field706 = 2;
            client.field700 = field1126[--Statics.field1113];
            return 1;
        } else if (arg0 == 3138) {
            client.field706 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field706 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field706 = 3;
            client.field700 = arg2 ? Statics.field3585.field2594 : Statics.field1118.field2594;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1126[--Statics.field1113] == 1;
            Statics.field191.field1072 = var28;
            class83.method213();
            return 1;
        } else if (arg0 == 3142) {
            field1126[++Statics.field1113 - 1] = Statics.field191.field1072 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1126[--Statics.field1113] == 1;
            client.field701 = var29;
            if (!var29) {
                Statics.field191.field1076 = "";
                class83.method213();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1126[++Statics.field1113 - 1] = client.field701 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1126[--Statics.field1113] == 1;
            if (Statics.field191.field1077 == var30) {
                Statics.field191.field1077 = !var30;
                class83.method213();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1126[++Statics.field1113 - 1] = Statics.field191.field1077 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1126[++Statics.field1113 - 1] = class95.field1205;
            return 1;
        } else if (arg0 == 3154) {
            field1126[++Statics.field1113 - 1] = client.method2921();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1115--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1113 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1113--;
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1113--;
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1115--;
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1113--;
            field1114[++Statics.field1115 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1113--;
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1113 -= 2;
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1113 -= 2;
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1113 -= 2;
            field1114[++Statics.field1115 - 1] = "";
            field1114[++Statics.field1115 - 1] = "";
            field1114[++Statics.field1115 - 1] = "";
            field1114[++Statics.field1115 - 1] = "";
            field1114[++Statics.field1115 - 1] = "";
            field1114[++Statics.field1115 - 1] = "";
            field1114[++Statics.field1115 - 1] = "";
            field1114[++Statics.field1115 - 1] = "";
            field1114[++Statics.field1115 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1113--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1113--;
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1113--;
            return 1;
        } else if (arg0 == 3175) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1115--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1115--;
            return 1;
        } else if (arg0 == 3181) {
            int var31 = 100 - Math.min(Math.max(field1126[--Statics.field1113], 0), 100);
            client.method2501((double) ((float) var31 / 200.0F + 0.5F));
            return 1;
        } else if (arg0 == 3182) {
            float var32 = ((float) Statics.field191.field1073 - 0.5F) * 200.0F;
            field1126[++Statics.field1113 - 1] = 100 - Math.round(var32);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ba.ay(ILcl;ZB)I")
    public static int method1175(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1113 -= 3;
            client.method798(field1126[Statics.field1113], field1126[Statics.field1113 + 1], field1126[Statics.field1113 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method5567(field1126[--Statics.field1113]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1113 -= 2;
            client.method2011(field1126[Statics.field1113], field1126[Statics.field1113 + 1]);
            return 1;
        } else if (arg0 == 3203) {
            int var3 = Math.min(Math.max(field1126[--Statics.field1113], 0), 100);
            client.method3505(Math.round((float) var3 * 2.55F));
            return 1;
        } else if (arg0 == 3204) {
            field1126[++Statics.field1113 - 1] = Math.round((float) Statics.field191.field1074 / 2.55F);
            return 1;
        } else if (arg0 == 3205) {
            int var4 = Math.min(Math.max(field1126[--Statics.field1113], 0), 100);
            client.method3356(Math.round((float) var4 * 1.27F));
            return 1;
        } else if (arg0 == 3206) {
            field1126[++Statics.field1113 - 1] = Math.round((float) Statics.field191.field1066 / 1.27F);
            return 1;
        } else if (arg0 == 3207) {
            int var5 = Math.min(Math.max(field1126[--Statics.field1113], 0), 100);
            client.method692(Math.round((float) var5 * 1.27F));
            return 1;
        } else if (arg0 == 3208) {
            field1126[++Statics.field1113 - 1] = Math.round((float) Statics.field191.field1071 / 1.27F);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.ag(ILcl;ZB)I")
    public static int method651(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1113 -= 2;
            int var3 = field1126[Statics.field1113];
            int var4 = field1126[Statics.field1113 + 1];
            class263 var5 = class263.method659(var3);
            if (var5.field3355 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3346; var6++) {
                if (var5.field3344[var6] == var4) {
                    field1114[++Statics.field1115 - 1] = var5.field3353[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1114[++Statics.field1115 - 1] = var5.field3351;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1113 -= 4;
            int var7 = field1126[Statics.field1113];
            int var8 = field1126[Statics.field1113 + 1];
            int var9 = field1126[Statics.field1113 + 2];
            int var10 = field1126[Statics.field1113 + 3];
            class263 var11 = class263.method659(var9);
            if (var11.field3348 != var7 || var11.field3355 != var8) {
                if (var8 == 115) {
                    field1114[++Statics.field1115 - 1] = class234.field2795;
                } else {
                    field1126[++Statics.field1113 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3346; var12++) {
                if (var11.field3344[var12] == var10) {
                    if (var8 == 115) {
                        field1114[++Statics.field1115 - 1] = var11.field3353[var12];
                    } else {
                        field1126[++Statics.field1113 - 1] = var11.field3352[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1114[++Statics.field1115 - 1] = var11.field3351;
                } else {
                    field1126[++Statics.field1113 - 1] = var11.field3349;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1126[--Statics.field1113];
            class263 var14 = class263.method659(var13);
            field1126[++Statics.field1113 - 1] = var14.method4352();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ea.ae(ILcl;ZI)I")
    public static int method3185(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field574.field1085 == 0) {
                field1126[++Statics.field1113 - 1] = -2;
            } else if (Statics.field574.field1085 == 1) {
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = Statics.field574.field1081.method4882();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1126[--Statics.field1113];
            if (Statics.field574.method1812() && var3 >= 0 && var3 < Statics.field574.field1081.method4882()) {
                class295 var4 = (class295) Statics.field574.field1081.method4883(var3);
                field1114[++Statics.field1115 - 1] = var4.method4841();
                field1114[++Statics.field1115 - 1] = var4.method4847();
            } else {
                field1114[++Statics.field1115 - 1] = "";
                field1114[++Statics.field1115 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1126[--Statics.field1113];
            if (Statics.field574.method1812() && var5 >= 0 && var5 < Statics.field574.field1081.method4882()) {
                field1126[++Statics.field1113 - 1] = ((class290) Statics.field574.field1081.method4883(var5)).field3645;
            } else {
                field1126[++Statics.field1113 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1126[--Statics.field1113];
            if (Statics.field574.method1812() && var6 >= 0 && var6 < Statics.field574.field1081.method4882()) {
                field1126[++Statics.field1113 - 1] = ((class290) Statics.field574.field1081.method4883(var6)).field3646;
            } else {
                field1126[++Statics.field1113 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1114[--Statics.field1115];
            int var8 = field1126[--Statics.field1113];
            class84.method140(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1114[--Statics.field1115];
            Statics.field574.method1811(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1114[--Statics.field1115];
            Statics.field574.method1823(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1114[--Statics.field1115];
            Statics.field574.method1821(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1114[--Statics.field1115];
            Statics.field574.method1856(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1114[--Statics.field1115];
            String var14 = client.method3788(var13);
            field1126[++Statics.field1113 - 1] = Statics.field574.method1844(new class294(var14, Statics.field617), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field295 == null) {
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1114[++Statics.field1115 - 1] = Statics.field295.field3668;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field295 == null) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = Statics.field295.method4882();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1126[--Statics.field1113];
            if (Statics.field295 == null || var15 >= Statics.field295.method4882()) {
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1114[++Statics.field1115 - 1] = Statics.field295.method4883(var15).method4851().method4963();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1126[--Statics.field1113];
            if (Statics.field295 == null || var16 >= Statics.field295.method4882()) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = ((class290) Statics.field295.method4883(var16)).method4948();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1126[--Statics.field1113];
            if (Statics.field295 == null || var17 >= Statics.field295.method4882()) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = ((class290) Statics.field295.method4883(var17)).field3646;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1126[++Statics.field1113 - 1] = Statics.field295 == null ? 0 : Statics.field295.field3666;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1114[--Statics.field1115];
            client.method2251(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1126[++Statics.field1113 - 1] = Statics.field295 == null ? 0 : Statics.field295.field3671;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1114[--Statics.field1115];
            client.method4301(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method792();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field574.method1812()) {
                field1126[++Statics.field1113 - 1] = Statics.field574.field1078.method4882();
            } else {
                field1126[++Statics.field1113 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1126[--Statics.field1113];
            if (Statics.field574.method1812() && var20 >= 0 && var20 < Statics.field574.field1078.method4882()) {
                class289 var21 = (class289) Statics.field574.field1078.method4883(var20);
                field1114[++Statics.field1115 - 1] = var21.method4841();
                field1114[++Statics.field1115 - 1] = var21.method4847();
            } else {
                field1114[++Statics.field1115 - 1] = "";
                field1114[++Statics.field1115 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1114[--Statics.field1115];
            String var23 = client.method3788(var22);
            field1126[++Statics.field1113 - 1] = Statics.field574.method1818(new class294(var23, Statics.field617)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1126[--Statics.field1113];
            if (Statics.field295 == null || var24 >= Statics.field295.method4882() || !Statics.field295.method4883(var24).method4851().equals(Statics.field1986.field630)) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field295 == null || Statics.field295.field3670 == null) {
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1114[++Statics.field1115 - 1] = Statics.field295.field3670;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1126[--Statics.field1113];
            if (Statics.field295 == null || var25 >= Statics.field295.method4882() || !((class284) Statics.field295.method4883(var25)).method4836()) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1126[--Statics.field1113];
            if (Statics.field295 == null || var26 >= Statics.field295.method4882() || !((class284) Statics.field295.method4883(var26)).method4820()) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field574.field1081.method4900();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1081.method4901(new class325(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1081.method4901(new class326(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1081.method4901(new class167(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1081.method4901(new class161(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1081.method4901(new class166(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1081.method4901(new class169(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1081.method4901(new class165(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1081.method4901(new class163(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1081.method4901(new class162(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1081.method4901(new class164(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field574.field1081.method4922();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field574.field1078.method4900();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1078.method4901(new class325(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1078.method4901(new class326(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field574.field1078.method4922();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field295 != null) {
                Statics.field295.method4900();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1126[--Statics.field1113] == 1;
            if (Statics.field295 != null) {
                Statics.field295.method4901(new class325(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1126[--Statics.field1113] == 1;
            if (Statics.field295 != null) {
                Statics.field295.method4901(new class326(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1126[--Statics.field1113] == 1;
            if (Statics.field295 != null) {
                Statics.field295.method4901(new class167(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1126[--Statics.field1113] == 1;
            if (Statics.field295 != null) {
                Statics.field295.method4901(new class161(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1126[--Statics.field1113] == 1;
            if (Statics.field295 != null) {
                Statics.field295.method4901(new class166(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1126[--Statics.field1113] == 1;
            if (Statics.field295 != null) {
                Statics.field295.method4901(new class169(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1126[--Statics.field1113] == 1;
            if (Statics.field295 != null) {
                Statics.field295.method4901(new class165(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1126[--Statics.field1113] == 1;
            if (Statics.field295 != null) {
                Statics.field295.method4901(new class163(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1126[--Statics.field1113] == 1;
            if (Statics.field295 != null) {
                Statics.field295.method4901(new class162(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1126[--Statics.field1113] == 1;
            if (Statics.field295 != null) {
                Statics.field295.method4901(new class164(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field295 != null) {
                Statics.field295.method4922();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1126[--Statics.field1113] == 1;
            Statics.field574.field1081.method4901(new class168(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1126[--Statics.field1113] == 1;
            if (Statics.field295 != null) {
                Statics.field295.method4901(new class168(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.ac(ILcl;ZS)I")
    public static int method16(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field1113--;
            Statics.field1115--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field1113++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hh.aq(ILcl;ZI)I")
    public static int method3808(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = client.field930[var3].method155();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = client.field930[var4].field98;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = client.field930[var5].field95;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = client.field930[var6].field96;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = client.field930[var7].field97;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = client.field930[var8].field102;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1126[--Statics.field1113];
            int var10 = client.field930[var9].method142();
            field1126[++Statics.field1113 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1126[--Statics.field1113];
            int var12 = client.field930[var11].method142();
            field1126[++Statics.field1113 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1126[--Statics.field1113];
            int var14 = client.field930[var13].method142();
            field1126[++Statics.field1113 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1126[--Statics.field1113];
            int var16 = client.field930[var15].method142();
            field1126[++Statics.field1113 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1126[--Statics.field1113] == 1;
            if (Statics.field187 != null) {
                Statics.field187.method117(class16.field76, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1126[--Statics.field1113] == 1;
            if (Statics.field187 != null) {
                Statics.field187.method117(class16.field72, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1113 -= 2;
            boolean var19 = field1126[Statics.field1113] == 1;
            boolean var20 = field1126[Statics.field1113 + 1] == 1;
            if (Statics.field187 != null) {
                client.field931.field660 = var20;
                Statics.field187.method117(client.field931, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1126[--Statics.field1113] == 1;
            if (Statics.field187 != null) {
                Statics.field187.method117(class16.field73, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1126[--Statics.field1113] == 1;
            if (Statics.field187 != null) {
                Statics.field187.method117(class16.field74, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1126[++Statics.field1113 - 1] = Statics.field187 == null ? 0 : Statics.field187.field75.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1126[--Statics.field1113];
            class17 var24 = (class17) Statics.field187.field75.get(var23);
            field1126[++Statics.field1113 - 1] = var24.field87;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1126[--Statics.field1113];
            class17 var26 = (class17) Statics.field187.field75.get(var25);
            field1114[++Statics.field1115 - 1] = var26.method120();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1126[--Statics.field1113];
            class17 var28 = (class17) Statics.field187.field75.get(var27);
            field1114[++Statics.field1115 - 1] = var28.method122();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1126[--Statics.field1113];
            class17 var30 = (class17) Statics.field187.field75.get(var29);
            long var31 = class308.method1082() - Statics.field58 - var30.field79;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1114[++Statics.field1115 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1126[--Statics.field1113];
            class17 var38 = (class17) Statics.field187.field75.get(var37);
            field1126[++Statics.field1113 - 1] = var38.field84.field96;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1126[--Statics.field1113];
            class17 var40 = (class17) Statics.field187.field75.get(var39);
            field1126[++Statics.field1113 - 1] = var40.field84.field95;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1126[--Statics.field1113];
            class17 var42 = (class17) Statics.field187.field75.get(var41);
            field1126[++Statics.field1113 - 1] = var42.field84.field98;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fp.at(ILcl;ZI)I")
    public static int method3391(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1113 -= 2;
            int var3 = field1126[Statics.field1113];
            int var4 = field1126[Statics.field1113 + 1];
            field1126[++Statics.field1113 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1113 -= 2;
            int var5 = field1126[Statics.field1113];
            int var6 = field1126[Statics.field1113 + 1];
            field1126[++Statics.field1113 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1113 -= 2;
            int var7 = field1126[Statics.field1113];
            int var8 = field1126[Statics.field1113 + 1];
            field1126[++Statics.field1113 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1113 -= 2;
            int var9 = field1126[Statics.field1113];
            int var10 = field1126[Statics.field1113 + 1];
            field1126[++Statics.field1113 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1113 -= 5;
            int var13 = field1126[Statics.field1113];
            int var14 = field1126[Statics.field1113 + 1];
            int var15 = field1126[Statics.field1113 + 2];
            int var16 = field1126[Statics.field1113 + 3];
            int var17 = field1126[Statics.field1113 + 4];
            field1126[++Statics.field1113 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1113 -= 2;
            int var18 = field1126[Statics.field1113];
            int var19 = field1126[Statics.field1113 + 1];
            field1126[++Statics.field1113 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1113 -= 2;
            int var20 = field1126[Statics.field1113];
            int var21 = field1126[Statics.field1113 + 1];
            field1126[++Statics.field1113 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1113 -= 2;
            int var22 = field1126[Statics.field1113];
            int var23 = field1126[Statics.field1113 + 1];
            field1126[++Statics.field1113 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1113 -= 2;
            int var24 = field1126[Statics.field1113];
            int var25 = field1126[Statics.field1113 + 1];
            field1126[++Statics.field1113 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1113 -= 2;
            int var26 = field1126[Statics.field1113];
            int var27 = field1126[Statics.field1113 + 1];
            field1126[++Statics.field1113 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1113 -= 2;
            int var28 = field1126[Statics.field1113];
            int var29 = field1126[Statics.field1113 + 1];
            if (var28 == 0) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1113 -= 2;
            int var30 = field1126[Statics.field1113];
            int var31 = field1126[Statics.field1113 + 1];
            if (var30 == 0) {
                field1126[++Statics.field1113 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1126[++Statics.field1113 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1126[++Statics.field1113 - 1] = var30;
                    break;
                case 2:
                    field1126[++Statics.field1113 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1126[++Statics.field1113 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1126[++Statics.field1113 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1126[++Statics.field1113 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1113 -= 2;
            int var32 = field1126[Statics.field1113];
            int var33 = field1126[Statics.field1113 + 1];
            field1126[++Statics.field1113 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1113 -= 2;
            int var34 = field1126[Statics.field1113];
            int var35 = field1126[Statics.field1113 + 1];
            field1126[++Statics.field1113 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1113 -= 3;
            long var36 = (long) field1126[Statics.field1113];
            long var38 = (long) field1126[Statics.field1113 + 1];
            long var40 = (long) field1126[Statics.field1113 + 2];
            field1126[++Statics.field1113 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("je.ak(ILcl;ZI)I")
    public static int method4526(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1114[--Statics.field1115];
            int var4 = field1126[--Statics.field1113];
            field1114[++Statics.field1115 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1115 -= 2;
            String var5 = field1114[Statics.field1115];
            String var6 = field1114[Statics.field1115 + 1];
            field1114[++Statics.field1115 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1114[--Statics.field1115];
            int var8 = field1126[--Statics.field1113];
            field1114[++Statics.field1115 - 1] = var7 + class302.method1241(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1114[--Statics.field1115];
            field1114[++Statics.field1115 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1126[--Statics.field1113];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1119.setTime(new Date(var11));
            int var13 = field1119.get(5);
            int var14 = field1119.get(2);
            int var15 = field1119.get(1);
            field1114[++Statics.field1115 - 1] = var13 + "-" + field1120[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1115 -= 2;
            String var16 = field1114[Statics.field1115];
            String var17 = field1114[Statics.field1115 + 1];
            if (Statics.field1986.field629 != null && Statics.field1986.field629.field2565) {
                field1114[++Statics.field1115 - 1] = var17;
            } else {
                field1114[++Statics.field1115 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1126[--Statics.field1113];
            field1114[++Statics.field1115 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1115 -= 2;
            field1126[++Statics.field1113 - 1] = class302.method3495(class298.method4861(field1114[Statics.field1115], field1114[Statics.field1115 + 1], Statics.field3535));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1114[--Statics.field1115];
            Statics.field1113 -= 2;
            int var20 = field1126[Statics.field1113];
            int var21 = field1126[Statics.field1113 + 1];
            byte[] var22 = Statics.field2113.method4032(var21, 0);
            class306 var23 = new class306(var22);
            field1126[++Statics.field1113 - 1] = var23.method5083(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1114[--Statics.field1115];
            Statics.field1113 -= 2;
            int var25 = field1126[Statics.field1113];
            int var26 = field1126[Statics.field1113 + 1];
            byte[] var27 = Statics.field2113.method4032(var26, 0);
            class306 var28 = new class306(var27);
            field1126[++Statics.field1113 - 1] = var28.method5110(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1115 -= 2;
            String var29 = field1114[Statics.field1115];
            String var30 = field1114[Statics.field1115 + 1];
            if (field1126[--Statics.field1113] == 1) {
                field1114[++Statics.field1115 - 1] = var29;
            } else {
                field1114[++Statics.field1115 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1114[--Statics.field1115];
            field1114[++Statics.field1115 - 1] = class307.method5122(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1114[--Statics.field1115];
            int var33 = field1126[--Statics.field1113];
            field1114[++Statics.field1115 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = class302.method2003((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = class302.method3875((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = class302.method1122((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = class302.method3958((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1114[--Statics.field1115];
            if (var38 == null) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1114[--Statics.field1115];
            Statics.field1113 -= 2;
            int var40 = field1126[Statics.field1113];
            int var41 = field1126[Statics.field1113 + 1];
            field1114[++Statics.field1115 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1114[--Statics.field1115];
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
            field1114[++Statics.field1115 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1114[--Statics.field1115];
            int var48 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1115 -= 2;
            String var49 = field1114[Statics.field1115];
            String var50 = field1114[Statics.field1115 + 1];
            int var51 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1114[--Statics.field1115];
            field1114[++Statics.field1115 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.ax(ILcl;ZI)I")
    public static int method1077(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1126[--Statics.field1113];
            field1114[++Statics.field1115 - 1] = class266.method4793(var3).field3448;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1113 -= 2;
            int var4 = field1126[Statics.field1113];
            int var5 = field1126[Statics.field1113 + 1];
            class266 var6 = class266.method4793(var4);
            if (var5 < 1 || var5 > 5 || var6.field3457[var5 - 1] == null) {
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1114[++Statics.field1115 - 1] = var6.field3457[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1113 -= 2;
            int var7 = field1126[Statics.field1113];
            int var8 = field1126[Statics.field1113 + 1];
            class266 var9 = class266.method4793(var7);
            if (var8 < 1 || var8 > 5 || var9.field3458[var8 - 1] == null) {
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1114[++Statics.field1115 - 1] = var9.field3458[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = class266.method4793(var10).field3455;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = class266.method4793(var11).field3443 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1126[--Statics.field1113];
            class266 var13 = class266.method4793(var12);
            if (var13.field3470 == -1 && var13.field3474 >= 0) {
                field1126[++Statics.field1113 - 1] = var13.field3474;
            } else {
                field1126[++Statics.field1113 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1126[--Statics.field1113];
            class266 var15 = class266.method4793(var14);
            if (var15.field3470 >= 0 && var15.field3474 >= 0) {
                field1126[++Statics.field1113 - 1] = var15.field3474;
            } else {
                field1126[++Statics.field1113 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = class266.method4793(var16).field3456 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1126[--Statics.field1113];
            class266 var18 = class266.method4793(var17);
            if (var18.field3487 == -1 && var18.field3486 >= 0) {
                field1126[++Statics.field1113 - 1] = var18.field3486;
            } else {
                field1126[++Statics.field1113 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1126[--Statics.field1113];
            class266 var20 = class266.method4793(var19);
            if (var20.field3487 >= 0 && var20.field3486 >= 0) {
                field1126[++Statics.field1113 - 1] = var20.field3486;
            } else {
                field1126[++Statics.field1113 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1114[--Statics.field1115];
            int var22 = field1126[--Statics.field1113];
            client.method1683(var21, var22 == 1);
            field1126[++Statics.field1113 - 1] = Statics.field1149;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field404 == null || Statics.field156 >= Statics.field1149) {
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = Statics.field404[++Statics.field156 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field156 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.ar(ILcl;ZI)I")
    public static int method1687(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1126[++Statics.field1113 - 1] = client.field738;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1113 -= 3;
            client.field738 = field1126[Statics.field1113];
            Statics.field549 = class321.method3324(field1126[Statics.field1113 + 1]);
            if (Statics.field549 == null) {
                Statics.field549 = class321.field3831;
            }
            client.field882 = field1126[Statics.field1113 + 2];
            class197 var3 = class197.method434(class193.field2265, client.field751.field1333);
            var3.field2372.method5279(client.field738);
            var3.field2372.method5279(Statics.field549.field3833);
            var3.field2372.method5279(client.field882);
            client.field751.method2239(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1114[--Statics.field1115];
            Statics.field1113 -= 2;
            int var5 = field1126[Statics.field1113];
            int var6 = field1126[Statics.field1113 + 1];
            class197 var7 = class197.method434(class193.field2315, client.field751.field1333);
            var7.field2372.method5279(class311.method235(var4) + 2);
            var7.field2372.method5257(var4);
            var7.field2372.method5279(var5 - 1);
            var7.field2372.method5279(var6);
            client.field751.method2239(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1113 -= 2;
            int var8 = field1126[Statics.field1113];
            int var9 = field1126[Statics.field1113 + 1];
            class74 var10 = class101.method2018(var8, var9);
            if (var10 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = 0;
                field1114[++Statics.field1115 - 1] = "";
                field1114[++Statics.field1115 - 1] = "";
                field1114[++Statics.field1115 - 1] = "";
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = var10.field608;
                field1126[++Statics.field1113 - 1] = var10.field621;
                field1114[++Statics.field1115 - 1] = var10.field611 == null ? "" : var10.field611;
                field1114[++Statics.field1115 - 1] = var10.field615 == null ? "" : var10.field615;
                field1114[++Statics.field1115 - 1] = var10.field618 == null ? "" : var10.field618;
                field1126[++Statics.field1113 - 1] = var10.method1146() ? 1 : (var10.method1144() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1126[--Statics.field1113];
            class74 var12 = class101.method2006(var11);
            if (var12 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = 0;
                field1114[++Statics.field1115 - 1] = "";
                field1114[++Statics.field1115 - 1] = "";
                field1114[++Statics.field1115 - 1] = "";
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = var12.field610;
                field1126[++Statics.field1113 - 1] = var12.field621;
                field1114[++Statics.field1115 - 1] = var12.field611 == null ? "" : var12.field611;
                field1114[++Statics.field1115 - 1] = var12.field615 == null ? "" : var12.field615;
                field1114[++Statics.field1115 - 1] = var12.field618 == null ? "" : var12.field618;
                field1126[++Statics.field1113 - 1] = var12.method1146() ? 1 : (var12.method1144() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field549 == null) {
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = Statics.field549.field3833;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1114[--Statics.field1115];
            int var14 = field1126[--Statics.field1113];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class234.field2967)) {
                var16 = 0;
                var13 = var13.substring(class234.field2967.length());
            } else if (var15.startsWith(class234.field2969)) {
                var16 = 1;
                var13 = var13.substring(class234.field2969.length());
            } else if (var15.startsWith(class234.field2971)) {
                var16 = 2;
                var13 = var13.substring(class234.field2971.length());
            } else if (var15.startsWith(class234.field2973)) {
                var16 = 3;
                var13 = var13.substring(class234.field2973.length());
            } else if (var15.startsWith(class234.field2916)) {
                var16 = 4;
                var13 = var13.substring(class234.field2916.length());
            } else if (var15.startsWith(class234.field2977)) {
                var16 = 5;
                var13 = var13.substring(class234.field2977.length());
            } else if (var15.startsWith(class234.field2979)) {
                var16 = 6;
                var13 = var13.substring(class234.field2979.length());
            } else if (var15.startsWith(class234.field2894)) {
                var16 = 7;
                var13 = var13.substring(class234.field2894.length());
            } else if (var15.startsWith(class234.field2983)) {
                var16 = 8;
                var13 = var13.substring(class234.field2983.length());
            } else if (var15.startsWith(class234.field2985)) {
                var16 = 9;
                var13 = var13.substring(class234.field2985.length());
            } else if (var15.startsWith(class234.field2987)) {
                var16 = 10;
                var13 = var13.substring(class234.field2987.length());
            } else if (var15.startsWith(class234.field2989)) {
                var16 = 11;
                var13 = var13.substring(class234.field2989.length());
            } else if (Statics.field3535 != class200.field2387) {
                if (var15.startsWith(class234.field3064)) {
                    var16 = 0;
                    var13 = var13.substring(class234.field3064.length());
                } else if (var15.startsWith(class234.field2970)) {
                    var16 = 1;
                    var13 = var13.substring(class234.field2970.length());
                } else if (var15.startsWith(class234.field2972)) {
                    var16 = 2;
                    var13 = var13.substring(class234.field2972.length());
                } else if (var15.startsWith(class234.field2934)) {
                    var16 = 3;
                    var13 = var13.substring(class234.field2934.length());
                } else if (var15.startsWith(class234.field3067)) {
                    var16 = 4;
                    var13 = var13.substring(class234.field3067.length());
                } else if (var15.startsWith(class234.field2978)) {
                    var16 = 5;
                    var13 = var13.substring(class234.field2978.length());
                } else if (var15.startsWith(class234.field2835)) {
                    var16 = 6;
                    var13 = var13.substring(class234.field2835.length());
                } else if (var15.startsWith(class234.field2982)) {
                    var16 = 7;
                    var13 = var13.substring(class234.field2982.length());
                } else if (var15.startsWith(class234.field3040)) {
                    var16 = 8;
                    var13 = var13.substring(class234.field3040.length());
                } else if (var15.startsWith(class234.field2986)) {
                    var16 = 9;
                    var13 = var13.substring(class234.field2986.length());
                } else if (var15.startsWith(class234.field2988)) {
                    var16 = 10;
                    var13 = var13.substring(class234.field2988.length());
                } else if (var15.startsWith(class234.field2990)) {
                    var16 = 11;
                    var13 = var13.substring(class234.field2990.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class234.field2991)) {
                var18 = 1;
                var13 = var13.substring(class234.field2991.length());
            } else if (var17.startsWith(class234.field3075)) {
                var18 = 2;
                var13 = var13.substring(class234.field3075.length());
            } else if (var17.startsWith(class234.field2995)) {
                var18 = 3;
                var13 = var13.substring(class234.field2995.length());
            } else if (var17.startsWith(class234.field2997)) {
                var18 = 4;
                var13 = var13.substring(class234.field2997.length());
            } else if (var17.startsWith(class234.field2999)) {
                var18 = 5;
                var13 = var13.substring(class234.field2999.length());
            } else if (Statics.field3535 != class200.field2387) {
                if (var17.startsWith(class234.field2790)) {
                    var18 = 1;
                    var13 = var13.substring(class234.field2790.length());
                } else if (var17.startsWith(class234.field2994)) {
                    var18 = 2;
                    var13 = var13.substring(class234.field2994.length());
                } else if (var17.startsWith(class234.field2996)) {
                    var18 = 3;
                    var13 = var13.substring(class234.field2996.length());
                } else if (var17.startsWith(class234.field2998)) {
                    var18 = 4;
                    var13 = var13.substring(class234.field2998.length());
                } else if (var17.startsWith(class234.field3000)) {
                    var18 = 5;
                    var13 = var13.substring(class234.field3000.length());
                }
            }
            class197 var19 = class197.method434(class193.field2294, client.field751.field1333);
            var19.field2372.method5279(0);
            int var20 = var19.field2372.field3747;
            var19.field2372.method5279(var14);
            var19.field2372.method5279(var16);
            var19.field2372.method5279(var18);
            class220.method3411(var19.field2372, var13);
            var19.field2372.method5343(var19.field2372.field3747 - var20);
            client.field751.method2239(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1115 -= 2;
            String var21 = field1114[Statics.field1115];
            String var22 = field1114[Statics.field1115 + 1];
            class197 var23 = class197.method434(class193.field2290, client.field751.field1333);
            var23.field2372.method5229(0);
            int var24 = var23.field2372.field3747;
            var23.field2372.method5257(var21);
            class220.method3411(var23.field2372, var22);
            var23.field2372.method5241(var23.field2372.field3747 - var24);
            client.field751.method2239(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field1986 == null || Statics.field1986.field630 == null) {
                var25 = "";
            } else {
                var25 = Statics.field1986.field630.method4963();
            }
            field1114[++Statics.field1115 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1126[++Statics.field1113 - 1] = client.field882;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = class101.method3368(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = class101.method1685(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = class101.method1713(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1114[--Statics.field1115];
            client.method289(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field883 = field1114[--Statics.field1115].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1114[++Statics.field1115 - 1] = client.field883;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1114[--Statics.field1115];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.al(ILcl;ZI)I")
    public static int method1083(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1126[++Statics.field1113 - 1] = client.method3174();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1126[--Statics.field1113];
            if (var3 == 1 || var3 == 2) {
                client.method3976(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1126[++Statics.field1113 - 1] = Statics.field191.field1075;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1126[--Statics.field1113];
            if (var4 == 1 || var4 == 2) {
                Statics.field191.field1075 = var4;
                class83.method213();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1113--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.aa(ILcl;ZI)I")
    public static int method262(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1113 -= 2;
            int var3 = field1126[Statics.field1113];
            int var4 = field1126[Statics.field1113 + 1];
            if (!client.field907) {
                client.field734 = var3;
                client.field735 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1126[++Statics.field1113 - 1] = client.field734;
            return 1;
        } else if (arg0 == 5506) {
            field1126[++Statics.field1113 - 1] = client.field735;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1126[--Statics.field1113];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field896 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1126[++Statics.field1113 - 1] = client.field896;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hz.as(ILcl;ZI)I")
    public static int method3927(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field712 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field1115 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field1126[++Statics.field1113 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.aw(II)I")
    public static int method797(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("fj.az(IB)I")
    public static int method3409(int arg0) {
        return (int) ((Math.log((double) arg0) / field1125 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("ba.ah(ILcl;ZB)I")
    public static int method1177(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1113 -= 2;
            client.field780 = (short) method797(field1126[Statics.field1113]);
            if (client.field780 <= 0) {
                client.field780 = 256;
            }
            client.field914 = (short) method797(field1126[Statics.field1113 + 1]);
            if (client.field914 <= 0) {
                client.field914 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1113 -= 2;
            client.field915 = (short) field1126[Statics.field1113];
            if (client.field915 <= 0) {
                client.field915 = 256;
            }
            client.field916 = (short) field1126[Statics.field1113 + 1];
            if (client.field916 <= 0) {
                client.field916 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1113 -= 4;
            client.field917 = (short) field1126[Statics.field1113];
            if (client.field917 <= 0) {
                client.field917 = 1;
            }
            client.field691 = (short) field1126[Statics.field1113 + 1];
            if (client.field691 <= 0) {
                client.field691 = 32767;
            } else if (client.field691 < client.field917) {
                client.field691 = client.field917;
            }
            client.field919 = (short) field1126[Statics.field1113 + 2];
            if (client.field919 <= 0) {
                client.field919 = 1;
            }
            client.field847 = (short) field1126[Statics.field1113 + 3];
            if (client.field847 <= 0) {
                client.field847 = 32767;
            } else if (client.field847 < client.field919) {
                client.field847 = client.field919;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field699 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                client.method2025(0, 0, client.field699.field2609, client.field699.field2647, false);
                field1126[++Statics.field1113 - 1] = client.field923;
                field1126[++Statics.field1113 - 1] = client.field924;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1126[++Statics.field1113 - 1] = client.field915;
            field1126[++Statics.field1113 - 1] = client.field916;
            return 1;
        } else if (arg0 == 6205) {
            field1126[++Statics.field1113 - 1] = method3409(client.field780);
            field1126[++Statics.field1113 - 1] = method3409(client.field914);
            return 1;
        } else if (arg0 == 6220) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1126[++Statics.field1113 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1126[++Statics.field1113 - 1] = Statics.field88;
            return 1;
        } else if (arg0 == 6223) {
            field1126[++Statics.field1113 - 1] = Statics.field145;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.ap(ILcl;ZS)I")
    public static int method1680(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1126[++Statics.field1113 - 1] = class81.method220() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class81 var3 = class81.method3186();
            if (var3 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = 0;
                field1114[++Statics.field1115 - 1] = "";
                field1126[++Statics.field1113 - 1] = 0;
                field1126[++Statics.field1113 - 1] = 0;
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1126[++Statics.field1113 - 1] = var3.field1033;
                field1126[++Statics.field1113 - 1] = var3.field1028;
                field1114[++Statics.field1115 - 1] = var3.field1032;
                field1126[++Statics.field1113 - 1] = var3.field1027;
                field1126[++Statics.field1113 - 1] = var3.field1034;
                field1114[++Statics.field1115 - 1] = var3.field1035;
            }
            return 1;
        } else if (arg0 == 6502) {
            class81 var4 = class81.method1224();
            if (var4 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = 0;
                field1114[++Statics.field1115 - 1] = "";
                field1126[++Statics.field1113 - 1] = 0;
                field1126[++Statics.field1113 - 1] = 0;
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1126[++Statics.field1113 - 1] = var4.field1033;
                field1126[++Statics.field1113 - 1] = var4.field1028;
                field1114[++Statics.field1115 - 1] = var4.field1032;
                field1126[++Statics.field1113 - 1] = var4.field1027;
                field1126[++Statics.field1113 - 1] = var4.field1034;
                field1114[++Statics.field1115 - 1] = var4.field1035;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1126[--Statics.field1113];
            class81 var6 = null;
            for (int var7 = 0; var7 < class81.field1042; var7++) {
                if (Statics.field1030[var7].field1033 == var5) {
                    var6 = Statics.field1030[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = 0;
                field1114[++Statics.field1115 - 1] = "";
                field1126[++Statics.field1113 - 1] = 0;
                field1126[++Statics.field1113 - 1] = 0;
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1126[++Statics.field1113 - 1] = var6.field1033;
                field1126[++Statics.field1113 - 1] = var6.field1028;
                field1114[++Statics.field1115 - 1] = var6.field1032;
                field1126[++Statics.field1113 - 1] = var6.field1027;
                field1126[++Statics.field1113 - 1] = var6.field1034;
                field1114[++Statics.field1115 - 1] = var6.field1035;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1113 -= 4;
            int var8 = field1126[Statics.field1113];
            boolean var9 = field1126[Statics.field1113 + 1] == 1;
            int var10 = field1126[Statics.field1113 + 2];
            boolean var11 = field1126[Statics.field1113 + 3] == 1;
            class81.method3821(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1126[--Statics.field1113];
            if (var12 >= 0 && var12 < class81.field1042) {
                class81 var13 = Statics.field1030[var12];
                field1126[++Statics.field1113 - 1] = var13.field1033;
                field1126[++Statics.field1113 - 1] = var13.field1028;
                field1114[++Statics.field1115 - 1] = var13.field1032;
                field1126[++Statics.field1113 - 1] = var13.field1027;
                field1126[++Statics.field1113 - 1] = var13.field1034;
                field1114[++Statics.field1115 - 1] = var13.field1035;
            } else {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = 0;
                field1114[++Statics.field1115 - 1] = "";
                field1126[++Statics.field1113 - 1] = 0;
                field1126[++Statics.field1113 - 1] = 0;
                field1114[++Statics.field1115 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field767 = field1126[--Statics.field1113] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1113 -= 2;
            int var14 = field1126[Statics.field1113];
            int var15 = field1126[Statics.field1113 + 1];
            class261 var16 = class261.method4072(var15);
            if (var16.method4306()) {
                field1114[++Statics.field1115 - 1] = class268.method2020(var14).method4537(var15, var16.field3336);
            } else {
                field1126[++Statics.field1113 - 1] = class268.method2020(var14).method4528(var15, var16.field3335);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1113 -= 2;
            int var17 = field1126[Statics.field1113];
            int var18 = field1126[Statics.field1113 + 1];
            class261 var19 = class261.method4072(var18);
            if (var19.method4306()) {
                field1114[++Statics.field1115 - 1] = class265.method668(var17).method4419(var18, var19.field3336);
            } else {
                field1126[++Statics.field1113 - 1] = class265.method668(var17).method4418(var18, var19.field3335);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1113 -= 2;
            int var20 = field1126[Statics.field1113];
            int var21 = field1126[Statics.field1113 + 1];
            class261 var22 = class261.method4072(var21);
            if (var22.method4306()) {
                field1114[++Statics.field1115 - 1] = class266.method4793(var20).method4480(var21, var22.field3336);
            } else {
                field1126[++Statics.field1113 - 1] = class266.method4793(var20).method4462(var21, var22.field3335);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1113 -= 2;
            int var23 = field1126[Statics.field1113];
            int var24 = field1126[Statics.field1113 + 1];
            class261 var25 = class261.method4072(var24);
            if (var25.method4306()) {
                field1114[++Statics.field1115 - 1] = class262.method4243(var23).method4328(var24, var25.field3336);
            } else {
                field1126[++Statics.field1113 - 1] = class262.method4243(var23).method4341(var24, var25.field3335);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1126[++Statics.field1113 - 1] = client.field742 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1126[++Statics.field1113 - 1] = client.field667 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1115--;
            Statics.field1113--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1115--;
            Statics.field1113--;
            return 1;
        } else if (arg0 == 6524) {
            field1126[++Statics.field1113 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1126[++Statics.field1113 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1126[++Statics.field1113 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field1126[++Statics.field1113 - 1] = client.field668;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gn.aj(ILcl;ZI)I")
    public static int method3506(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1162;
            int var4 = (Statics.field1986.field957 >> 7) + Statics.field109;
            int var5 = (Statics.field1986.field954 >> 7) + Statics.field3212;
            client.method265().method6029(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1126[--Statics.field1113];
            String var7 = "";
            class36 var8 = client.method265().method6047(var6);
            if (var8 != null) {
                var7 = var8.method395();
            }
            field1114[++Statics.field1115 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1126[--Statics.field1113];
            client.method265().method6030(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1126[++Statics.field1113 - 1] = client.method265().method6044();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1126[--Statics.field1113];
            client.method265().method6041(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1126[++Statics.field1113 - 1] = client.method265().method6046() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class223 var11 = new class223(field1126[--Statics.field1113]);
            client.method265().method6048(var11.field2560, var11.field2558);
            return 1;
        } else if (arg0 == 6607) {
            class223 var12 = new class223(field1126[--Statics.field1113]);
            client.method265().method6049(var12.field2560, var12.field2558);
            return 1;
        } else if (arg0 == 6608) {
            class223 var13 = new class223(field1126[--Statics.field1113]);
            client.method265().method6050(var13.field2559, var13.field2560, var13.field2558);
            return 1;
        } else if (arg0 == 6609) {
            class223 var14 = new class223(field1126[--Statics.field1113]);
            client.method265().method6051(var14.field2559, var14.field2560, var14.field2558);
            return 1;
        } else if (arg0 == 6610) {
            field1126[++Statics.field1113 - 1] = client.method265().method6052();
            field1126[++Statics.field1113 - 1] = client.method265().method6079();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1126[--Statics.field1113];
            class36 var16 = client.method265().method6047(var15);
            if (var16 == null) {
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = var16.method366().method3822();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1126[--Statics.field1113];
            class36 var18 = client.method265().method6047(var17);
            if (var18 == null) {
                field1126[++Statics.field1113 - 1] = 0;
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = (var18.method360() - var18.method359() + 1) * 64;
                field1126[++Statics.field1113 - 1] = (var18.method362() - var18.method409() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1126[--Statics.field1113];
            class36 var20 = client.method265().method6047(var19);
            if (var20 == null) {
                field1126[++Statics.field1113 - 1] = 0;
                field1126[++Statics.field1113 - 1] = 0;
                field1126[++Statics.field1113 - 1] = 0;
                field1126[++Statics.field1113 - 1] = 0;
            } else {
                field1126[++Statics.field1113 - 1] = var20.method359() * 64;
                field1126[++Statics.field1113 - 1] = var20.method409() * 64;
                field1126[++Statics.field1113 - 1] = var20.method360() * 64 + 64 - 1;
                field1126[++Statics.field1113 - 1] = var20.method362() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1126[--Statics.field1113];
            class36 var22 = client.method265().method6047(var21);
            if (var22 == null) {
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = var22.method358();
            }
            return 1;
        } else if (arg0 == 6615) {
            class223 var23 = client.method265().method6022();
            if (var23 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = var23.field2560;
                field1126[++Statics.field1113 - 1] = var23.field2558;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1126[++Statics.field1113 - 1] = client.method265().method6031();
            return 1;
        } else if (arg0 == 6617) {
            class223 var24 = new class223(field1126[--Statics.field1113]);
            class36 var25 = client.method265().method6169();
            if (var25 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method350(var24.field2559, var24.field2560, var24.field2558);
            if (var26 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = var26[0];
                field1126[++Statics.field1113 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class223 var27 = new class223(field1126[--Statics.field1113]);
            class36 var28 = client.method265().method6169();
            if (var28 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = -1;
                return 1;
            }
            class223 var29 = var28.method369(var27.field2560, var27.field2558);
            if (var29 == null) {
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = var29.method3822();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1113 -= 2;
            int var30 = field1126[Statics.field1113];
            class223 var31 = new class223(field1126[Statics.field1113 + 1]);
            method1990(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1113 -= 2;
            int var32 = field1126[Statics.field1113];
            class223 var33 = new class223(field1126[Statics.field1113 + 1]);
            method1990(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1113 -= 2;
            int var34 = field1126[Statics.field1113];
            class223 var35 = new class223(field1126[Statics.field1113 + 1]);
            class36 var36 = client.method265().method6047(var34);
            if (var36 == null) {
                field1126[++Statics.field1113 - 1] = 0;
                return 1;
            } else {
                field1126[++Statics.field1113 - 1] = var36.method348(var35.field2559, var35.field2560, var35.field2558) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1126[++Statics.field1113 - 1] = client.method265().method6055();
            field1126[++Statics.field1113 - 1] = client.method265().method6093();
            return 1;
        } else if (arg0 == 6623) {
            class223 var37 = new class223(field1126[--Statics.field1113]);
            class36 var38 = client.method265().method6028(var37.field2559, var37.field2560, var37.field2558);
            if (var38 == null) {
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = var38.method353();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method265().method6154(field1126[--Statics.field1113]);
            return 1;
        } else if (arg0 == 6625) {
            client.method265().method6058();
            return 1;
        } else if (arg0 == 6626) {
            client.method265().method6059(field1126[--Statics.field1113]);
            return 1;
        } else if (arg0 == 6627) {
            client.method265().method6060();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1126[--Statics.field1113] == 1;
            client.method265().method6168(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1126[--Statics.field1113];
            client.method265().method6062(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1126[--Statics.field1113];
            client.method265().method6063(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method265().method6084();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1126[--Statics.field1113] == 1;
            client.method265().method6203(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1113 -= 2;
            int var43 = field1126[Statics.field1113];
            boolean var44 = field1126[Statics.field1113 + 1] == 1;
            client.method265().method6065(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1113 -= 2;
            int var45 = field1126[Statics.field1113];
            boolean var46 = field1126[Statics.field1113 + 1] == 1;
            client.method265().method6066(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1126[++Statics.field1113 - 1] = client.method265().method6067() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = client.method265().method6069(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1126[--Statics.field1113];
            field1126[++Statics.field1113 - 1] = client.method265().method6124(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1113 -= 2;
            int var49 = field1126[Statics.field1113];
            class223 var50 = new class223(field1126[Statics.field1113 + 1]);
            class223 var51 = client.method265().method6142(var49, var50);
            if (var51 == null) {
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = var51.method3822();
            }
            return 1;
        } else if (arg0 == 6639) {
            class44 var52 = client.method265().method6074();
            if (var52 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = var52.method250();
                field1126[++Statics.field1113 - 1] = var52.field319.method3822();
            }
            return 1;
        } else if (arg0 == 6640) {
            class44 var53 = client.method265().method6075();
            if (var53 == null) {
                field1126[++Statics.field1113 - 1] = -1;
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = var53.method250();
                field1126[++Statics.field1113 - 1] = var53.field319.method3822();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1126[--Statics.field1113];
            class253 var55 = class253.method4155(var54);
            if (var55.field3255 == null) {
                field1114[++Statics.field1115 - 1] = "";
            } else {
                field1114[++Statics.field1115 - 1] = var55.field3255;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1126[--Statics.field1113];
            class253 var57 = class253.method4155(var56);
            field1126[++Statics.field1113 - 1] = var57.field3245;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1126[--Statics.field1113];
            class253 var59 = class253.method4155(var58);
            if (var59 == null) {
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = var59.field3268;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1126[--Statics.field1113];
            class253 var61 = class253.method4155(var60);
            if (var61 == null) {
                field1126[++Statics.field1113 - 1] = -1;
            } else {
                field1126[++Statics.field1113 - 1] = var61.field3250;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1126[++Statics.field1113 - 1] = Statics.field1112.field378;
            return 1;
        } else if (arg0 == 6698) {
            field1126[++Statics.field1113 - 1] = Statics.field1112.field379.method3822();
            return 1;
        } else if (arg0 == 6699) {
            field1126[++Statics.field1113 - 1] = Statics.field1112.field380.method3822();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.an(II)V")
    public static void method2467(int arg0) {
        if (arg0 == -1 || !class227.method619(arg0)) {
            return;
        }
        class227[] var1 = Statics.field3836[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3.field2681 != null) {
                class72 var4 = new class72();
                var4.field587 = var3;
                var4.field595 = var3.field2681;
                method107(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("cj.ai(ILhd;ZI)V")
    public static void method1990(int arg0, class223 arg1, boolean arg2) {
        class36 var3 = client.method265().method6047(arg0);
        int var4 = Statics.field1986.field650;
        int var5 = (Statics.field1986.field957 >> 7) + Statics.field109;
        int var6 = (Statics.field1986.field954 >> 7) + Statics.field3212;
        class223 var7 = new class223(var4, var5, var6);
        client.method265().method6035(var3, var7, arg1, arg2);
    }
}
