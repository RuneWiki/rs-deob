package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cu")
public class class86 {

    @ObfuscatedName("cu.w")
    public static int[] field1115 = new int[5];

    @ObfuscatedName("cu.v")
    public static int[][] field1123 = new int[5][5000];

    @ObfuscatedName("cu.q")
    public static int[] field1116 = new int[1000];

    @ObfuscatedName("cu.t")
    public static String[] field1119 = new String[1000];

    @ObfuscatedName("cu.s")
    public static int field1112 = 0;

    @ObfuscatedName("cu.p")
    public static class66[] field1122 = new class66[50];

    @ObfuscatedName("cu.h")
    public static Calendar field1114 = Calendar.getInstance();

    @ObfuscatedName("cu.g")
    public static final String[] field1125 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cu.a")
    public static boolean field1126 = false;

    @ObfuscatedName("cu.b")
    public static boolean field1127 = false;

    @ObfuscatedName("cu.l")
    public static int field1128 = 0;

    @ObfuscatedName("cu.j")
    public static final double field1129 = Math.log(2.0D);

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bl.x(Lbb;I)V")
    public static void method1239(class72 arg0) {
        Statics.method3756(arg0, 500000);
    }

    @ObfuscatedName("gd.k(ILce;ZI)I")
    public static int method3432(int arg0, class102 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method445(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1093(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method4823(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method17(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method2419(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method733(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method161(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method107(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method1956(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method588(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3858(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1093(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method4823(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method17(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method2419(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method733(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method642(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method76(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method3137(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method1162(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3858(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method3816(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method1954(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method4723(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method748(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method102(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method3757(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return Statics.method4318(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method348(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method228(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method3104(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method732(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method344(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method681(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method1134(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method208(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method4734(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.d(ILce;ZI)I")
    public static int method445(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1118 -= 3;
            int var3 = field1116[Statics.field1118];
            int var4 = field1116[Statics.field1118 + 1];
            int var5 = field1116[Statics.field1118 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class227 var6 = class227.method3572(var3);
            if (var6.field2698 == null) {
                var6.field2698 = new class227[var5 + 1];
            }
            if (var6.field2698.length <= var5) {
                class227[] var7 = new class227[var5 + 1];
                for (int var8 = 0; var8 < var6.field2698.length; var8++) {
                    var7[var8] = var6.field2698[var8];
                }
                var6.field2698 = var7;
            }
            if (var5 > 0 && var6.field2698[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class227 var9 = new class227();
            var9.field2570 = var4;
            var9.field2587 = var9.field2568 = var6.field2568;
            var9.field2710 = var5;
            var9.field2567 = true;
            var6.field2698[var5] = var9;
            if (arg2) {
                Statics.field116 = var9;
            } else {
                Statics.field1131 = var9;
            }
            client.method1117(var6);
            return 1;
        } else if (arg0 == 101) {
            class227 var10 = arg2 ? Statics.field116 : Statics.field1131;
            class227 var11 = class227.method3572(var10.field2568);
            var11.field2698[var10.field2710] = null;
            client.method1117(var11);
            return 1;
        } else if (arg0 == 102) {
            class227 var12 = class227.method3572(field1116[--Statics.field1118]);
            var12.field2698 = null;
            client.method1117(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1118 -= 2;
            int var13 = field1116[Statics.field1118];
            int var14 = field1116[Statics.field1118 + 1];
            class227 var15 = class227.method194(var13, var14);
            if (var15 == null || var14 == -1) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = 1;
                if (arg2) {
                    Statics.field116 = var15;
                } else {
                    Statics.field1131 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class227 var16 = class227.method3572(field1116[--Statics.field1118]);
            if (var16 == null) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = 1;
                if (arg2) {
                    Statics.field116 = var16;
                } else {
                    Statics.field1131 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.w(ILce;ZI)I")
    public static int method1093(int arg0, class102 arg1, boolean arg2) {
        int var3 = -1;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1116[--Statics.field1118];
            var4 = class227.method3572(var3);
        } else {
            var4 = arg2 ? Statics.field116 : Statics.field1131;
        }
        if (arg0 == 1000) {
            Statics.field1118 -= 4;
            var4.field2577 = field1116[Statics.field1118];
            var4.field2595 = field1116[Statics.field1118 + 1];
            var4.field2573 = field1116[Statics.field1118 + 2];
            var4.field2574 = field1116[Statics.field1118 + 3];
            client.method1117(var4);
            Statics.field319.method1257(var4);
            if (var3 != -1 && var4.field2570 == 0) {
                client.method1005(Statics.field2694[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1118 -= 4;
            var4.field2580 = field1116[Statics.field1118];
            var4.field2622 = field1116[Statics.field1118 + 1];
            var4.field2704 = field1116[Statics.field1118 + 2];
            var4.field2684 = field1116[Statics.field1118 + 3];
            client.method1117(var4);
            Statics.field319.method1257(var4);
            if (var3 != -1 && var4.field2570 == 0) {
                client.method1005(Statics.field2694[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1116[--Statics.field1118] == 1;
            if (var4.field2630 != var5) {
                var4.field2630 = var5;
                client.method1117(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2708 = field1116[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2709 = field1116[--Statics.field1118] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kw.v(ILce;ZB)I")
    public static int method4823(int arg0, class102 arg1, boolean arg2) {
        int var3 = -1;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1116[--Statics.field1118];
            var4 = class227.method3572(var3);
        } else {
            var4 = arg2 ? Statics.field116 : Statics.field1131;
        }
        if (arg0 == 1100) {
            Statics.field1118 -= 2;
            var4.field2647 = field1116[Statics.field1118];
            if (var4.field2647 > var4.field2591 - var4.field2583) {
                var4.field2647 = var4.field2591 - var4.field2583;
            }
            if (var4.field2647 < 0) {
                var4.field2647 = 0;
            }
            var4.field2590 = field1116[Statics.field1118 + 1];
            if (var4.field2590 > var4.field2598 - var4.field2643) {
                var4.field2590 = var4.field2598 - var4.field2643;
            }
            if (var4.field2590 < 0) {
                var4.field2590 = 0;
            }
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2593 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2686 = field1116[--Statics.field1118] == 1;
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2641 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2601 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2603 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2605 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2606 = field1116[--Statics.field1118] == 1;
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2611 = 1;
            var4.field2612 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1118 -= 6;
            var4.field2617 = field1116[Statics.field1118];
            var4.field2618 = field1116[Statics.field1118 + 1];
            var4.field2619 = field1116[Statics.field1118 + 2];
            var4.field2620 = field1116[Statics.field1118 + 3];
            var4.field2658 = field1116[Statics.field1118 + 4];
            var4.field2660 = field1116[Statics.field1118 + 5];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1116[--Statics.field1118];
            if (var4.field2615 != var5) {
                var4.field2615 = var5;
                var4.field2588 = 0;
                var4.field2697 = 0;
                client.method1117(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2625 = field1116[--Statics.field1118] == 1;
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1119[--Statics.field1120];
            if (!var6.equals(var4.field2629)) {
                var4.field2629 = var6;
                client.method1117(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2628 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1118 -= 3;
            var4.field2632 = field1116[Statics.field1118];
            var4.field2646 = field1116[Statics.field1118 + 1];
            var4.field2631 = field1116[Statics.field1118 + 2];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2685 = field1116[--Statics.field1118] == 1;
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2607 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2608 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2609 = field1116[--Statics.field1118] == 1;
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2610 = field1116[--Statics.field1118] == 1;
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1118 -= 2;
            var4.field2591 = field1116[Statics.field1118];
            var4.field2598 = field1116[Statics.field1118 + 1];
            client.method1117(var4);
            if (var3 != -1 && var4.field2570 == 0) {
                client.method1005(Statics.field2694[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method812(var4.field2568, var4.field2710);
            client.field883 = var4;
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2579 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2637 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2600 = field1116[--Statics.field1118];
            client.method1117(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1116[--Statics.field1118];
            class333 var8 = (class333) class205.method129(class333.method3573(), var7);
            if (var8 != null) {
                var4.field2652 = var8;
                client.method1117(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1116[--Statics.field1118] == 1;
            var4.field2602 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1116[--Statics.field1118] == 1;
            var4.field2626 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.q(ILce;ZI)I")
    public static int method17(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method3572(field1116[--Statics.field1118]);
        } else {
            var3 = arg2 ? Statics.field116 : Statics.field1131;
        }
        client.method1117(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1118 -= 2;
            int var4 = field1116[Statics.field1118];
            int var5 = field1116[Statics.field1118 + 1];
            var3.field2705 = var4;
            var3.field2695 = var5;
            class265 var6 = class265.method337(var4);
            var3.field2619 = var6.field3412;
            var3.field2620 = var6.field3430;
            var3.field2658 = var6.field3414;
            var3.field2617 = var6.field3415;
            var3.field2618 = var6.field3446;
            var3.field2660 = var6.field3411;
            if (arg0 == 1205) {
                var3.field2627 = 0;
            } else if (arg0 == 1212 | var6.field3419 == 1) {
                var3.field2627 = 1;
            } else {
                var3.field2627 = 2;
            }
            if (var3.field2623 > 0) {
                var3.field2660 = var3.field2660 * 32 / var3.field2623;
            } else if (var3.field2580 > 0) {
                var3.field2660 = var3.field2660 * 32 / var3.field2580;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2611 = 2;
            var3.field2612 = field1116[--Statics.field1118];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2611 = 3;
            var3.field2612 = Statics.field3718.field647.method3728();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dx.z(ILce;ZI)I")
    public static int method2419(int arg0, class102 arg1, boolean arg2) {
        boolean var3 = true;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class227.method3572(field1116[--Statics.field1118]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field116 : Statics.field1131;
        }
        if (arg0 == 1300) {
            int var5 = field1116[--Statics.field1118] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3802(var5, field1119[--Statics.field1120]);
                return 1;
            } else {
                Statics.field1120--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1118 -= 2;
            int var6 = field1116[Statics.field1118];
            int var7 = field1116[Statics.field1118 + 1];
            var4.field2649 = class227.method194(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2675 = field1116[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2650 = field1116[--Statics.field1118];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2640 = field1116[--Statics.field1118];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2594 = field1119[--Statics.field1120];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2653 = field1119[--Statics.field1120];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2648 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2659 = field1116[--Statics.field1118] == 1;
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
                for (var10 = 0; var10 < 10 && field1116[Statics.field1118 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1116[Statics.field1118 + var10];
                        var9[var10 / 2] = (byte) field1116[Statics.field1118 + var10 + 1];
                    }
                }
            } else {
                Statics.field1118 -= 2;
                var8 = new byte[] { (byte) field1116[Statics.field1118] };
                var9 = new byte[] { (byte) field1116[Statics.field1118 + 1] };
            }
            int var11 = field1116[--Statics.field1118] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method4954(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1118 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1116[Statics.field1118] };
            byte[] var14 = new byte[] { (byte) field1116[Statics.field1118 + 1] };
            method4954(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1118 -= 3;
            int var15 = field1116[Statics.field1118] - 1;
            int var16 = field1116[Statics.field1118 + 1];
            int var17 = field1116[Statics.field1118 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method1007(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1116[--Statics.field1118];
            int var20 = field1116[--Statics.field1118];
            method1007(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1118--;
            int var21 = field1116[Statics.field1118] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method3377(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method3377(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ka.t(Lhe;I[B[BI)V")
    public static final void method4954(class227 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2556 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2556 = new byte[11][];
            arg0.field2644 = new byte[11][];
            arg0.field2645 = new int[11];
            arg0.field2696 = new int[11];
        }
        arg0.field2556[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2642 = false;
            for (int var4 = 0; var4 < arg0.field2556.length; var4++) {
                if (arg0.field2556[var4] != null) {
                    arg0.field2642 = true;
                    break;
                }
            }
        } else {
            arg0.field2642 = true;
        }
        arg0.field2644[arg1] = arg3;
    }

    @ObfuscatedName("bq.e(Lhe;IIII)V")
    public static final void method1007(class227 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2645 == null) {
            throw new RuntimeException();
        }
        arg0.field2645[arg1] = arg2;
        arg0.field2696[arg1] = arg3;
    }

    @ObfuscatedName("gm.s(Lhe;IS)V")
    public static final void method3377(class227 arg0, int arg1) {
        if (arg0.field2556 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2707 == null) {
            arg0.field2707 = new int[arg0.field2556.length];
        }
        arg0.field2707[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ag.p(ILce;ZI)I")
    public static int method733(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method3572(field1116[--Statics.field1118]);
        } else {
            var3 = arg2 ? Statics.field116 : Statics.field1131;
        }
        String var4 = field1119[--Statics.field1120];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1116[--Statics.field1118];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1116[--Statics.field1118];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1119[--Statics.field1120];
            } else {
                var7[var8] = Integer.valueOf(field1116[--Statics.field1118]);
            }
        }
        int var9 = field1116[--Statics.field1118];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2656 = var7;
        } else if (arg0 == 1401) {
            var3.field2669 = var7;
        } else if (arg0 == 1402) {
            var3.field2578 = var7;
        } else if (arg0 == 1403) {
            var3.field2681 = var7;
        } else if (arg0 == 1404) {
            var3.field2662 = var7;
        } else if (arg0 == 1405) {
            var3.field2663 = var7;
        } else if (arg0 == 1406) {
            var3.field2666 = var7;
        } else if (arg0 == 1407) {
            var3.field2667 = var7;
            var3.field2668 = var5;
        } else if (arg0 == 1408) {
            var3.field2673 = var7;
        } else if (arg0 == 1409) {
            var3.field2674 = var7;
        } else if (arg0 == 1410) {
            var3.field2664 = var7;
        } else if (arg0 == 1411) {
            var3.field2657 = var7;
        } else if (arg0 == 1412) {
            var3.field2558 = var7;
        } else if (arg0 == 1414) {
            var3.field2633 = var7;
            var3.field2670 = var5;
        } else if (arg0 == 1415) {
            var3.field2634 = var7;
            var3.field2569 = var5;
        } else if (arg0 == 1416) {
            var3.field2665 = var7;
        } else if (arg0 == 1417) {
            var3.field2599 = var7;
        } else if (arg0 == 1418) {
            var3.field2676 = var7;
        } else if (arg0 == 1419) {
            var3.field2677 = var7;
        } else if (arg0 == 1420) {
            var3.field2592 = var7;
        } else if (arg0 == 1421) {
            var3.field2679 = var7;
        } else if (arg0 == 1422) {
            var3.field2680 = var7;
        } else if (arg0 == 1423) {
            var3.field2700 = var7;
        } else if (arg0 == 1424) {
            var3.field2682 = var7;
        } else if (arg0 == 1425) {
            var3.field2554 = var7;
        } else if (arg0 == 1426) {
            var3.field2692 = var7;
        } else if (arg0 == 1427) {
            var3.field2683 = var7;
        } else {
            return 2;
        }
        var3.field2671 = true;
        return 1;
    }

    @ObfuscatedName("b.n(ILce;ZB)I")
    public static int method161(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field116 : Statics.field1131;
        if (arg0 == 1500) {
            field1116[++Statics.field1118 - 1] = var3.field2581;
            return 1;
        } else if (arg0 == 1501) {
            field1116[++Statics.field1118 - 1] = var3.field2654;
            return 1;
        } else if (arg0 == 1502) {
            field1116[++Statics.field1118 - 1] = var3.field2583;
            return 1;
        } else if (arg0 == 1503) {
            field1116[++Statics.field1118 - 1] = var3.field2643;
            return 1;
        } else if (arg0 == 1504) {
            field1116[++Statics.field1118 - 1] = var3.field2630 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1116[++Statics.field1118 - 1] = var3.field2587;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.u(ILce;ZI)I")
    public static int method107(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field116 : Statics.field1131;
        if (arg0 == 1600) {
            field1116[++Statics.field1118 - 1] = var3.field2647;
            return 1;
        } else if (arg0 == 1601) {
            field1116[++Statics.field1118 - 1] = var3.field2590;
            return 1;
        } else if (arg0 == 1602) {
            field1119[++Statics.field1120 - 1] = var3.field2629;
            return 1;
        } else if (arg0 == 1603) {
            field1116[++Statics.field1118 - 1] = var3.field2591;
            return 1;
        } else if (arg0 == 1604) {
            field1116[++Statics.field1118 - 1] = var3.field2598;
            return 1;
        } else if (arg0 == 1605) {
            field1116[++Statics.field1118 - 1] = var3.field2660;
            return 1;
        } else if (arg0 == 1606) {
            field1116[++Statics.field1118 - 1] = var3.field2619;
            return 1;
        } else if (arg0 == 1607) {
            field1116[++Statics.field1118 - 1] = var3.field2658;
            return 1;
        } else if (arg0 == 1608) {
            field1116[++Statics.field1118 - 1] = var3.field2620;
            return 1;
        } else if (arg0 == 1609) {
            field1116[++Statics.field1118 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 1610) {
            field1116[++Statics.field1118 - 1] = var3.field2600;
            return 1;
        } else if (arg0 == 1611) {
            field1116[++Statics.field1118 - 1] = var3.field2593;
            return 1;
        } else if (arg0 == 1612) {
            field1116[++Statics.field1118 - 1] = var3.field2637;
            return 1;
        } else if (arg0 == 1613) {
            field1116[++Statics.field1118 - 1] = var3.field2652.method26();
            return 1;
        } else if (arg0 == 1614) {
            field1116[++Statics.field1118 - 1] = var3.field2626 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cd.h(ILce;ZI)I")
    public static int method1956(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field116 : Statics.field1131;
        if (arg0 == 1700) {
            field1116[++Statics.field1118 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2705 == -1) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = var3.field2695;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1116[++Statics.field1118 - 1] = var3.field2710;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.g(ILce;ZB)I")
    public static int method588(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field116 : Statics.field1131;
        if (arg0 == 1800) {
            field1116[++Statics.field1118 - 1] = class228.method352(client.method1127(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1116[--Statics.field1118];
            int var5 = var4 - 1;
            if (var3.field2648 == null || var5 >= var3.field2648.length || var3.field2648[var5] == null) {
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1119[++Statics.field1120 - 1] = var3.field2648[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2594 == null) {
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1119[++Statics.field1120 - 1] = var3.field2594;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iz.i(ILce;ZI)I")
    public static int method3858(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method3572(field1116[--Statics.field1118]);
        } else {
            var3 = arg2 ? Statics.field116 : Statics.field1131;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1128 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2683 == null) {
            return 0;
        } else {
            class72 var4 = new class72();
            var4.field613 = var3;
            var4.field603 = var3.field2683;
            var4.field605 = field1128 + 1;
            client.field788.method4580(var4);
            return 1;
        }
    }

    @ObfuscatedName("aj.a(ILce;ZI)I")
    public static int method642(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3572(field1116[--Statics.field1118]);
        if (arg0 == 2500) {
            field1116[++Statics.field1118 - 1] = var3.field2581;
            return 1;
        } else if (arg0 == 2501) {
            field1116[++Statics.field1118 - 1] = var3.field2654;
            return 1;
        } else if (arg0 == 2502) {
            field1116[++Statics.field1118 - 1] = var3.field2583;
            return 1;
        } else if (arg0 == 2503) {
            field1116[++Statics.field1118 - 1] = var3.field2643;
            return 1;
        } else if (arg0 == 2504) {
            field1116[++Statics.field1118 - 1] = var3.field2630 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1116[++Statics.field1118 - 1] = var3.field2587;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.o(ILce;ZI)I")
    public static int method76(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3572(field1116[--Statics.field1118]);
        if (arg0 == 2600) {
            field1116[++Statics.field1118 - 1] = var3.field2647;
            return 1;
        } else if (arg0 == 2601) {
            field1116[++Statics.field1118 - 1] = var3.field2590;
            return 1;
        } else if (arg0 == 2602) {
            field1119[++Statics.field1120 - 1] = var3.field2629;
            return 1;
        } else if (arg0 == 2603) {
            field1116[++Statics.field1118 - 1] = var3.field2591;
            return 1;
        } else if (arg0 == 2604) {
            field1116[++Statics.field1118 - 1] = var3.field2598;
            return 1;
        } else if (arg0 == 2605) {
            field1116[++Statics.field1118 - 1] = var3.field2660;
            return 1;
        } else if (arg0 == 2606) {
            field1116[++Statics.field1118 - 1] = var3.field2619;
            return 1;
        } else if (arg0 == 2607) {
            field1116[++Statics.field1118 - 1] = var3.field2658;
            return 1;
        } else if (arg0 == 2608) {
            field1116[++Statics.field1118 - 1] = var3.field2620;
            return 1;
        } else if (arg0 == 2609) {
            field1116[++Statics.field1118 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 2610) {
            field1116[++Statics.field1118 - 1] = var3.field2600;
            return 1;
        } else if (arg0 == 2611) {
            field1116[++Statics.field1118 - 1] = var3.field2593;
            return 1;
        } else if (arg0 == 2612) {
            field1116[++Statics.field1118 - 1] = var3.field2637;
            return 1;
        } else if (arg0 == 2613) {
            field1116[++Statics.field1118 - 1] = var3.field2652.method26();
            return 1;
        } else if (arg0 == 2614) {
            field1116[++Statics.field1118 - 1] = var3.field2626 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ew.c(ILce;ZI)I")
    public static int method3137(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class227 var3 = class227.method3572(field1116[--Statics.field1118]);
            field1116[++Statics.field1118 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 2701) {
            class227 var4 = class227.method3572(field1116[--Statics.field1118]);
            if (var4.field2705 == -1) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = var4.field2695;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1116[--Statics.field1118];
            class71 var6 = (class71) client.field842.method5561((long) var5);
            if (var6 == null) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1116[++Statics.field1118 - 1] = client.field925;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("by.f(ILce;ZI)I")
    public static int method1162(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3572(field1116[--Statics.field1118]);
        if (arg0 == 2800) {
            field1116[++Statics.field1118 - 1] = class228.method352(client.method1127(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1116[--Statics.field1118];
            int var5 = var4 - 1;
            if (var3.field2648 == null || var5 >= var3.field2648.length || var3.field2648[var5] == null) {
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1119[++Statics.field1120 - 1] = var3.field2648[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2594 == null) {
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1119[++Statics.field1120 - 1] = var3.field2594;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("he.ae(ILce;ZI)I")
    public static int method3816(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1119[--Statics.field1120];
            class101.method2911(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1118 -= 2;
            client.method119(Statics.field3718, field1116[Statics.field1118], field1116[Statics.field1118 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1127) {
                field1126 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1119[--Statics.field1120];
            int var5 = 0;
            if (class301.method3633(var4)) {
                var5 = class301.method1061(var4);
            }
            class197 var6 = class197.method3105(class193.field2280, client.field762.field1341);
            var6.field2339.method5279(var5);
            client.field762.method2171(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1119[--Statics.field1120];
            class197 var8 = class197.method3105(class193.field2214, client.field762.field1341);
            var8.field2339.method5121(var7.length() + 1);
            var8.field2339.method5217(var7);
            client.field762.method2171(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1119[--Statics.field1120];
            class197 var10 = class197.method3105(class193.field2274, client.field762.field1341);
            var10.field2339.method5121(var9.length() + 1);
            var10.field2339.method5217(var9);
            client.field762.method2171(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1116[--Statics.field1118];
            String var12 = field1119[--Statics.field1120];
            client.method574(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1118 -= 3;
            int var13 = field1116[Statics.field1118];
            int var14 = field1116[Statics.field1118 + 1];
            int var15 = field1116[Statics.field1118 + 2];
            class227 var16 = class227.method3572(var15);
            Statics.method1224(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1118 -= 2;
            int var17 = field1116[Statics.field1118];
            int var18 = field1116[Statics.field1118 + 1];
            class227 var19 = arg2 ? Statics.field116 : Statics.field1131;
            Statics.method1224(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field2507 = field1116[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1116[++Statics.field1118 - 1] = Statics.field677.field1078 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field677.field1078 = field1116[--Statics.field1118] == 1;
            class83.method437();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1119[--Statics.field1120];
            boolean var21 = field1116[--Statics.field1118] == 1;
            class61.method2135(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1116[--Statics.field1118];
            class197 var23 = class197.method3105(class193.field2254, client.field762.field1341);
            var23.field2339.method5122(var22);
            client.field762.method2171(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1116[--Statics.field1118];
            Statics.field1120 -= 2;
            String var25 = field1119[Statics.field1120];
            String var26 = field1119[Statics.field1120 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class197 var27 = class197.method3105(class193.field2215, client.field762.field1341);
                var27.field2339.method5122(1 + class310.method3851(var25) + class310.method3851(var26));
                var27.field2339.method5290(var24);
                var27.field2339.method5217(var25);
                var27.field2339.method5217(var26);
                client.field762.method2171(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field827 = field1116[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field829 = field1116[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field800 = field1116[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1116[--Statics.field1118] == 1) {
                client.field691 |= 0x1;
            } else {
                client.field691 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1116[--Statics.field1118] == 1) {
                client.field691 |= 0x2;
            } else {
                client.field691 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1116[--Statics.field1118] == 1) {
                client.field691 |= 0x4;
            } else {
                client.field691 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1116[--Statics.field1118] == 1) {
                client.field691 |= 0x8;
            } else {
                client.field691 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field691 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field786 = field1116[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field796 = field1116[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method20(field1116[--Statics.field1118] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1116[++Statics.field1118 - 1] = Statics.method737() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1118 -= 2;
            client.field761 = field1116[Statics.field1118];
            client.field891 = field1116[Statics.field1118 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1118 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1118--;
            return 1;
        } else if (arg0 == 3132) {
            field1116[++Statics.field1118 - 1] = Statics.field278;
            field1116[++Statics.field1118 - 1] = Statics.field2526;
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
            client.field843 = 3;
            client.field844 = field1116[--Statics.field1118];
            return 1;
        } else if (arg0 == 3137) {
            client.field843 = 2;
            client.field844 = field1116[--Statics.field1118];
            return 1;
        } else if (arg0 == 3138) {
            client.field843 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field843 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field843 = 3;
            client.field844 = arg2 ? Statics.field116.field2568 : Statics.field1131.field2568;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1116[--Statics.field1118] == 1;
            Statics.field677.field1076 = var28;
            class83.method437();
            return 1;
        } else if (arg0 == 3142) {
            field1116[++Statics.field1118 - 1] = Statics.field677.field1076 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1116[--Statics.field1118] == 1;
            client.field717 = var29;
            if (!var29) {
                Statics.field677.field1081 = "";
                class83.method437();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1116[++Statics.field1118 - 1] = client.field717 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1116[--Statics.field1118] == 1;
            if (Statics.field677.field1079 == var30) {
                Statics.field677.field1079 = !var30;
                class83.method437();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1116[++Statics.field1118 - 1] = Statics.field677.field1079 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1116[++Statics.field1118 - 1] = class95.field1199;
            return 1;
        } else if (arg0 == 3154) {
            field1116[++Statics.field1118 - 1] = client.method117();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1120--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1118 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1118--;
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1118--;
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1120--;
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1118--;
            field1119[++Statics.field1120 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1118--;
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1118 -= 2;
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1118 -= 2;
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1118 -= 2;
            field1119[++Statics.field1120 - 1] = "";
            field1119[++Statics.field1120 - 1] = "";
            field1119[++Statics.field1120 - 1] = "";
            field1119[++Statics.field1120 - 1] = "";
            field1119[++Statics.field1120 - 1] = "";
            field1119[++Statics.field1120 - 1] = "";
            field1119[++Statics.field1120 - 1] = "";
            field1119[++Statics.field1120 - 1] = "";
            field1119[++Statics.field1120 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1118--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1118--;
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1118--;
            return 1;
        } else if (arg0 == 3175) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1120--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1120--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cd.an(ILce;ZB)I")
    public static int method1954(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1118 -= 3;
            client.method3100(field1116[Statics.field1118], field1116[Statics.field1118 + 1], field1116[Statics.field1118 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method3864(field1116[--Statics.field1118]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1118 -= 2;
            client.method4047(field1116[Statics.field1118], field1116[Statics.field1118 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("js.ai(ILce;ZI)I")
    public static int method4723(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1116[++Statics.field1118 - 1] = client.field690;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1118 -= 2;
            int var3 = field1116[Statics.field1118];
            int var4 = field1116[Statics.field1118 + 1];
            field1116[++Statics.field1118 - 1] = class69.method3433(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1118 -= 2;
            int var5 = field1116[Statics.field1118];
            int var6 = field1116[Statics.field1118 + 1];
            field1116[++Statics.field1118 - 1] = class69.method3388(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1118 -= 2;
            int var7 = field1116[Statics.field1118];
            int var8 = field1116[Statics.field1118 + 1];
            field1116[++Statics.field1118 - 1] = class69.method1966(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = class250.method3846(var9).field3198;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = client.field687[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = client.field753[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = client.field822[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field611;
            int var14 = (Statics.field3718.field984 >> 7) + Statics.field591;
            int var15 = (Statics.field3718.field974 >> 7) + Statics.field1153;
            field1116[++Statics.field1118 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1116[++Statics.field1118 - 1] = client.field684 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1118 -= 2;
            int var19 = field1116[Statics.field1118] + 32768;
            int var20 = field1116[Statics.field1118 + 1];
            field1116[++Statics.field1118 - 1] = class69.method3433(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1118 -= 2;
            int var21 = field1116[Statics.field1118] + 32768;
            int var22 = field1116[Statics.field1118 + 1];
            field1116[++Statics.field1118 - 1] = class69.method3388(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1118 -= 2;
            int var23 = field1116[Statics.field1118] + 32768;
            int var24 = field1116[Statics.field1118 + 1];
            field1116[++Statics.field1118 - 1] = class69.method1966(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field850 >= 2) {
                field1116[++Statics.field1118 - 1] = client.field850;
            } else {
                field1116[++Statics.field1118 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1116[++Statics.field1118 - 1] = client.field918;
            return 1;
        } else if (arg0 == 3318) {
            field1116[++Statics.field1118 - 1] = client.field681;
            return 1;
        } else if (arg0 == 3321) {
            field1116[++Statics.field1118 - 1] = client.field848;
            return 1;
        } else if (arg0 == 3322) {
            field1116[++Statics.field1118 - 1] = client.field849;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field711) {
                field1116[++Statics.field1118 - 1] = 1;
            } else {
                field1116[++Statics.field1118 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1116[++Statics.field1118 - 1] = client.field682;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1118 -= 4;
            int var25 = field1116[Statics.field1118];
            int var26 = field1116[Statics.field1118 + 1];
            int var27 = field1116[Statics.field1118 + 2];
            int var28 = field1116[Statics.field1118 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1116[++Statics.field1118 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.ap(ILce;ZB)I")
    public static int method748(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1118 -= 2;
            int var3 = field1116[Statics.field1118];
            int var4 = field1116[Statics.field1118 + 1];
            class262 var5 = class262.method811(var3);
            if (var5.field3315 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3318; var6++) {
                if (var5.field3321[var6] == var4) {
                    field1119[++Statics.field1120 - 1] = var5.field3314[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1119[++Statics.field1120 - 1] = var5.field3316;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1118 -= 4;
            int var7 = field1116[Statics.field1118];
            int var8 = field1116[Statics.field1118 + 1];
            int var9 = field1116[Statics.field1118 + 2];
            int var10 = field1116[Statics.field1118 + 3];
            class262 var11 = class262.method811(var9);
            if (var11.field3319 != var7 || var11.field3315 != var8) {
                if (var8 == 115) {
                    field1119[++Statics.field1120 - 1] = class234.field2765;
                } else {
                    field1116[++Statics.field1118 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3318; var12++) {
                if (var11.field3321[var12] == var10) {
                    if (var8 == 115) {
                        field1119[++Statics.field1120 - 1] = var11.field3314[var12];
                    } else {
                        field1116[++Statics.field1118 - 1] = var11.field3312[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1119[++Statics.field1120 - 1] = var11.field3316;
                } else {
                    field1116[++Statics.field1118 - 1] = var11.field3317;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1116[--Statics.field1118];
            class262 var14 = class262.method811(var13);
            field1116[++Statics.field1118 - 1] = var14.method4221();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("u.ab(ILce;ZI)I")
    public static int method102(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1253.field1093 == 0) {
                field1116[++Statics.field1118 - 1] = -2;
            } else if (Statics.field1253.field1093 == 1) {
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = Statics.field1253.field1091.method4743();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1116[--Statics.field1118];
            if (Statics.field1253.method1770() && var3 >= 0 && var3 < Statics.field1253.field1091.method4743()) {
                class294 var4 = (class294) Statics.field1253.field1091.method4818(var3);
                field1119[++Statics.field1120 - 1] = var4.method4711();
                field1119[++Statics.field1120 - 1] = var4.method4698();
            } else {
                field1119[++Statics.field1120 - 1] = "";
                field1119[++Statics.field1120 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1116[--Statics.field1118];
            if (Statics.field1253.method1770() && var5 >= 0 && var5 < Statics.field1253.field1091.method4743()) {
                field1116[++Statics.field1118 - 1] = ((class289) Statics.field1253.field1091.method4818(var5)).field3611;
            } else {
                field1116[++Statics.field1118 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1116[--Statics.field1118];
            if (Statics.field1253.method1770() && var6 >= 0 && var6 < Statics.field1253.field1091.method4743()) {
                field1116[++Statics.field1118 - 1] = ((class289) Statics.field1253.field1091.method4818(var6)).field3612;
            } else {
                field1116[++Statics.field1118 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1119[--Statics.field1120];
            int var8 = field1116[--Statics.field1118];
            class84.method746(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1119[--Statics.field1120];
            Statics.field1253.method1777(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1119[--Statics.field1120];
            Statics.field1253.method1813(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1119[--Statics.field1120];
            Statics.field1253.method1779(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1119[--Statics.field1120];
            Statics.field1253.method1782(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1119[--Statics.field1120];
            String var14 = client.method3114(var13);
            field1116[++Statics.field1118 - 1] = Statics.field1253.method1809(new class293(var14, Statics.field165), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field597 == null) {
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1119[++Statics.field1120 - 1] = Statics.field597.field3633;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field597 == null) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = Statics.field597.method4743();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1116[--Statics.field1118];
            if (Statics.field597 == null || var15 >= Statics.field597.method4743()) {
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1119[++Statics.field1120 - 1] = Statics.field597.method4818(var15).method4696().method4845();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1116[--Statics.field1118];
            if (Statics.field597 == null || var16 >= Statics.field597.method4743()) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = ((class289) Statics.field597.method4818(var16)).method4830();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1116[--Statics.field1118];
            if (Statics.field597 == null || var17 >= Statics.field597.method4743()) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = ((class289) Statics.field597.method4818(var17)).field3612;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1116[++Statics.field1118 - 1] = Statics.field597 == null ? 0 : Statics.field597.field3628;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1119[--Statics.field1120];
            client.method3720(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1116[++Statics.field1118 - 1] = Statics.field597 == null ? 0 : Statics.field597.field3632;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1119[--Statics.field1120];
            client.method126(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method364();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1253.method1770()) {
                field1116[++Statics.field1118 - 1] = Statics.field1253.field1094.method4743();
            } else {
                field1116[++Statics.field1118 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1116[--Statics.field1118];
            if (Statics.field1253.method1770() && var20 >= 0 && var20 < Statics.field1253.field1094.method4743()) {
                class288 var21 = (class288) Statics.field1253.field1094.method4818(var20);
                field1119[++Statics.field1120 - 1] = var21.method4711();
                field1119[++Statics.field1120 - 1] = var21.method4698();
            } else {
                field1119[++Statics.field1120 - 1] = "";
                field1119[++Statics.field1120 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1119[--Statics.field1120];
            String var23 = client.method3114(var22);
            field1116[++Statics.field1118 - 1] = Statics.field1253.method1776(new class293(var23, Statics.field165)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1116[--Statics.field1118];
            if (Statics.field597 == null || var24 >= Statics.field597.method4743() || !Statics.field597.method4818(var24).method4696().equals(Statics.field3718.field653)) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field597 == null || Statics.field597.field3631 == null) {
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1119[++Statics.field1120 - 1] = Statics.field597.field3631;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1116[--Statics.field1118];
            if (Statics.field597 == null || var25 >= Statics.field597.method4743() || !((class283) Statics.field597.method4818(var25)).method4669()) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1116[--Statics.field1118];
            if (Statics.field597 == null || var26 >= Statics.field597.method4743() || !((class283) Statics.field597.method4818(var26)).method4675()) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1253.field1091.method4761();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1091.method4762(new class324(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1091.method4762(new class325(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1091.method4762(new class167(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1091.method4762(new class161(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1091.method4762(new class166(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1091.method4762(new class169(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1091.method4762(new class165(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1091.method4762(new class163(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1091.method4762(new class162(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1091.method4762(new class164(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1253.field1091.method4754();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1253.field1094.method4761();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1094.method4762(new class324(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1094.method4762(new class325(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1253.field1094.method4754();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field597 != null) {
                Statics.field597.method4761();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1116[--Statics.field1118] == 1;
            if (Statics.field597 != null) {
                Statics.field597.method4762(new class324(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1116[--Statics.field1118] == 1;
            if (Statics.field597 != null) {
                Statics.field597.method4762(new class325(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1116[--Statics.field1118] == 1;
            if (Statics.field597 != null) {
                Statics.field597.method4762(new class167(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1116[--Statics.field1118] == 1;
            if (Statics.field597 != null) {
                Statics.field597.method4762(new class161(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1116[--Statics.field1118] == 1;
            if (Statics.field597 != null) {
                Statics.field597.method4762(new class166(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1116[--Statics.field1118] == 1;
            if (Statics.field597 != null) {
                Statics.field597.method4762(new class169(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1116[--Statics.field1118] == 1;
            if (Statics.field597 != null) {
                Statics.field597.method4762(new class165(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1116[--Statics.field1118] == 1;
            if (Statics.field597 != null) {
                Statics.field597.method4762(new class163(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1116[--Statics.field1118] == 1;
            if (Statics.field597 != null) {
                Statics.field597.method4762(new class162(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1116[--Statics.field1118] == 1;
            if (Statics.field597 != null) {
                Statics.field597.method4762(new class164(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field597 != null) {
                Statics.field597.method4754();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1116[--Statics.field1118] == 1;
            Statics.field1253.field1091.method4762(new class168(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1116[--Statics.field1118] == 1;
            if (Statics.field597 != null) {
                Statics.field597.method4762(new class168(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hm.ar(ILce;ZS)I")
    public static int method3757(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = client.field949[var3].method156();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = client.field949[var4].field96;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = client.field949[var5].field98;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = client.field949[var6].field101;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = client.field949[var7].field97;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = client.field949[var8].field100;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1116[--Statics.field1118];
            int var10 = client.field949[var9].method155();
            field1116[++Statics.field1118 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1116[--Statics.field1118];
            int var12 = client.field949[var11].method155();
            field1116[++Statics.field1118 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1116[--Statics.field1118];
            int var14 = client.field949[var13].method155();
            field1116[++Statics.field1118 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1116[--Statics.field1118];
            int var16 = client.field949[var15].method155();
            field1116[++Statics.field1118 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1116[--Statics.field1118] == 1;
            if (Statics.field85 != null) {
                Statics.field85.method122(class16.field69, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1116[--Statics.field1118] == 1;
            if (Statics.field85 != null) {
                Statics.field85.method122(class16.field70, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1118 -= 2;
            boolean var19 = field1116[Statics.field1118] == 1;
            boolean var20 = field1116[Statics.field1118 + 1] == 1;
            if (Statics.field85 != null) {
                client.field950.field679 = var20;
                Statics.field85.method122(client.field950, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1116[--Statics.field1118] == 1;
            if (Statics.field85 != null) {
                Statics.field85.method122(class16.field67, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1116[--Statics.field1118] == 1;
            if (Statics.field85 != null) {
                Statics.field85.method122(class16.field73, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1116[++Statics.field1118 - 1] = Statics.field85 == null ? 0 : Statics.field85.field68.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1116[--Statics.field1118];
            class17 var24 = (class17) Statics.field85.field68.get(var23);
            field1116[++Statics.field1118 - 1] = var24.field82;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1116[--Statics.field1118];
            class17 var26 = (class17) Statics.field85.field68.get(var25);
            field1119[++Statics.field1120 - 1] = var26.method127();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1116[--Statics.field1118];
            class17 var28 = (class17) Statics.field85.field68.get(var27);
            field1119[++Statics.field1120 - 1] = var28.method128();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1116[--Statics.field1118];
            class17 var30 = (class17) Statics.field85.field68.get(var29);
            long var31 = Statics.method3668() - Statics.field1803 - var30.field77;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1119[++Statics.field1120 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1116[--Statics.field1118];
            class17 var38 = (class17) Statics.field85.field68.get(var37);
            field1116[++Statics.field1118 - 1] = var38.field86.field101;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1116[--Statics.field1118];
            class17 var40 = (class17) Statics.field85.field68.get(var39);
            field1116[++Statics.field1118 - 1] = var40.field86.field98;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1116[--Statics.field1118];
            class17 var42 = (class17) Statics.field85.field68.get(var41);
            field1116[++Statics.field1118 - 1] = var42.field86.field96;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.at(ILce;ZI)I")
    public static int method348(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1119[--Statics.field1120];
            int var4 = field1116[--Statics.field1118];
            field1119[++Statics.field1120 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1120 -= 2;
            String var5 = field1119[Statics.field1120];
            String var6 = field1119[Statics.field1120 + 1];
            field1119[++Statics.field1120 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1119[--Statics.field1120];
            int var8 = field1116[--Statics.field1118];
            field1119[++Statics.field1120 - 1] = var7 + class301.method4644(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1119[--Statics.field1120];
            field1119[++Statics.field1120 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1116[--Statics.field1118];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1114.setTime(new Date(var11));
            int var13 = field1114.get(5);
            int var14 = field1114.get(2);
            int var15 = field1114.get(1);
            field1119[++Statics.field1120 - 1] = var13 + "-" + field1125[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1120 -= 2;
            String var16 = field1119[Statics.field1120];
            String var17 = field1119[Statics.field1120 + 1];
            if (Statics.field3718.field647 != null && Statics.field3718.field647.field2543) {
                field1119[++Statics.field1120 - 1] = var17;
            } else {
                field1119[++Statics.field1120 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1116[--Statics.field1118];
            field1119[++Statics.field1120 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1120 -= 2;
            field1116[++Statics.field1118 - 1] = class301.method3833(class297.method3679(field1119[Statics.field1120], field1119[Statics.field1120 + 1], Statics.field3598));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1119[--Statics.field1120];
            Statics.field1118 -= 2;
            int var20 = field1116[Statics.field1118];
            int var21 = field1116[Statics.field1118 + 1];
            byte[] var22 = Statics.field1152.method3869(var21, 0);
            class305 var23 = new class305(var22);
            field1116[++Statics.field1118 - 1] = var23.method5045(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1119[--Statics.field1120];
            Statics.field1118 -= 2;
            int var25 = field1116[Statics.field1118];
            int var26 = field1116[Statics.field1118 + 1];
            byte[] var27 = Statics.field1152.method3869(var26, 0);
            class305 var28 = new class305(var27);
            field1116[++Statics.field1118 - 1] = var28.method4984(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1120 -= 2;
            String var29 = field1119[Statics.field1120];
            String var30 = field1119[Statics.field1120 + 1];
            if (field1116[--Statics.field1118] == 1) {
                field1119[++Statics.field1120 - 1] = var29;
            } else {
                field1119[++Statics.field1120 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1119[--Statics.field1120];
            field1119[++Statics.field1120 - 1] = class306.method4986(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1119[--Statics.field1120];
            int var33 = field1116[--Statics.field1118];
            field1119[++Statics.field1120 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = class301.method1102((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = class301.method589((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = class301.method1725((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = class301.method2364((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1119[--Statics.field1120];
            if (var38 == null) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1119[--Statics.field1120];
            Statics.field1118 -= 2;
            int var40 = field1116[Statics.field1118];
            int var41 = field1116[Statics.field1118 + 1];
            field1119[++Statics.field1120 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1119[--Statics.field1120];
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
            field1119[++Statics.field1120 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1119[--Statics.field1120];
            int var48 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1120 -= 2;
            String var49 = field1119[Statics.field1120];
            String var50 = field1119[Statics.field1120 + 1];
            int var51 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1119[--Statics.field1120];
            field1119[++Statics.field1120 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("c.as(ILce;ZI)I")
    public static int method228(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1116[--Statics.field1118];
            field1119[++Statics.field1120 - 1] = class265.method337(var3).field3398;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1118 -= 2;
            int var4 = field1116[Statics.field1118];
            int var5 = field1116[Statics.field1118 + 1];
            class265 var6 = class265.method337(var4);
            if (var5 < 1 || var5 > 5 || var6.field3420[var5 - 1] == null) {
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1119[++Statics.field1120 - 1] = var6.field3420[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1118 -= 2;
            int var7 = field1116[Statics.field1118];
            int var8 = field1116[Statics.field1118 + 1];
            class265 var9 = class265.method337(var7);
            if (var8 < 1 || var8 > 5 || var9.field3421[var8 - 1] == null) {
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1119[++Statics.field1120 - 1] = var9.field3421[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = class265.method337(var10).field3418;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = class265.method337(var11).field3419 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1116[--Statics.field1118];
            class265 var13 = class265.method337(var12);
            if (var13.field3441 == -1 && var13.field3438 >= 0) {
                field1116[++Statics.field1118 - 1] = var13.field3438;
            } else {
                field1116[++Statics.field1118 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1116[--Statics.field1118];
            class265 var15 = class265.method337(var14);
            if (var15.field3441 >= 0 && var15.field3438 >= 0) {
                field1116[++Statics.field1118 - 1] = var15.field3438;
            } else {
                field1116[++Statics.field1118 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = class265.method337(var16).field3413 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1116[--Statics.field1118];
            class265 var18 = class265.method337(var17);
            if (var18.field3451 == -1 && var18.field3450 >= 0) {
                field1116[++Statics.field1118 - 1] = var18.field3450;
            } else {
                field1116[++Statics.field1118 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1116[--Statics.field1118];
            class265 var20 = class265.method337(var19);
            if (var20.field3451 >= 0 && var20.field3450 >= 0) {
                field1116[++Statics.field1118 - 1] = var20.field3450;
            } else {
                field1116[++Statics.field1118 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1119[--Statics.field1120];
            int var22 = field1116[--Statics.field1118];
            client.method1120(var21, var22 == 1);
            field1116[++Statics.field1118 - 1] = Statics.field1552;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field387 == null || Statics.field336 >= Statics.field1552) {
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = Statics.field387[++Statics.field336 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field336 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ep.am(ILce;ZI)I")
    public static int method3104(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1116[++Statics.field1118 - 1] = client.field897;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1118 -= 3;
            client.field897 = field1116[Statics.field1118];
            Statics.field1997 = class320.method3685(field1116[Statics.field1118 + 1]);
            if (Statics.field1997 == null) {
                Statics.field1997 = class320.field3807;
            }
            client.field863 = field1116[Statics.field1118 + 2];
            class197 var3 = class197.method3105(class193.field2213, client.field762.field1341);
            var3.field2339.method5121(client.field897);
            var3.field2339.method5121(Statics.field1997.field3805);
            var3.field2339.method5121(client.field863);
            client.field762.method2171(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1119[--Statics.field1120];
            Statics.field1118 -= 2;
            int var5 = field1116[Statics.field1118];
            int var6 = field1116[Statics.field1118 + 1];
            class197 var7 = class197.method3105(class193.field2290, client.field762.field1341);
            var7.field2339.method5121(class310.method3851(var4) + 2);
            var7.field2339.method5217(var4);
            var7.field2339.method5121(var5 - 1);
            var7.field2339.method5121(var6);
            client.field762.method2171(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1118 -= 2;
            int var8 = field1116[Statics.field1118];
            int var9 = field1116[Statics.field1118 + 1];
            class74 var10 = class101.method10(var8, var9);
            if (var10 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = 0;
                field1119[++Statics.field1120 - 1] = "";
                field1119[++Statics.field1120 - 1] = "";
                field1119[++Statics.field1120 - 1] = "";
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = var10.field623;
                field1116[++Statics.field1118 - 1] = var10.field624;
                field1119[++Statics.field1120 - 1] = var10.field637 == null ? "" : var10.field637;
                field1119[++Statics.field1120 - 1] = var10.field630 == null ? "" : var10.field630;
                field1119[++Statics.field1120 - 1] = var10.field636 == null ? "" : var10.field636;
                field1116[++Statics.field1118 - 1] = var10.method1160() ? 1 : (var10.method1152() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1116[--Statics.field1118];
            class74 var12 = class101.method1660(var11);
            if (var12 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = 0;
                field1119[++Statics.field1120 - 1] = "";
                field1119[++Statics.field1120 - 1] = "";
                field1119[++Statics.field1120 - 1] = "";
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = var12.field625;
                field1116[++Statics.field1118 - 1] = var12.field624;
                field1119[++Statics.field1120 - 1] = var12.field637 == null ? "" : var12.field637;
                field1119[++Statics.field1120 - 1] = var12.field630 == null ? "" : var12.field630;
                field1119[++Statics.field1120 - 1] = var12.field636 == null ? "" : var12.field636;
                field1116[++Statics.field1118 - 1] = var12.method1160() ? 1 : (var12.method1152() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1997 == null) {
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = Statics.field1997.field3805;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1119[--Statics.field1120];
            int var14 = field1116[--Statics.field1118];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class234.field2937)) {
                var16 = 0;
                var13 = var13.substring(class234.field2937.length());
            } else if (var15.startsWith(class234.field2939)) {
                var16 = 1;
                var13 = var13.substring(class234.field2939.length());
            } else if (var15.startsWith(class234.field2936)) {
                var16 = 2;
                var13 = var13.substring(class234.field2936.length());
            } else if (var15.startsWith(class234.field2943)) {
                var16 = 3;
                var13 = var13.substring(class234.field2943.length());
            } else if (var15.startsWith(class234.field2945)) {
                var16 = 4;
                var13 = var13.substring(class234.field2945.length());
            } else if (var15.startsWith(class234.field2911)) {
                var16 = 5;
                var13 = var13.substring(class234.field2911.length());
            } else if (var15.startsWith(class234.field2977)) {
                var16 = 6;
                var13 = var13.substring(class234.field2977.length());
            } else if (var15.startsWith(class234.field2951)) {
                var16 = 7;
                var13 = var13.substring(class234.field2951.length());
            } else if (var15.startsWith(class234.field2953)) {
                var16 = 8;
                var13 = var13.substring(class234.field2953.length());
            } else if (var15.startsWith(class234.field2955)) {
                var16 = 9;
                var13 = var13.substring(class234.field2955.length());
            } else if (var15.startsWith(class234.field2957)) {
                var16 = 10;
                var13 = var13.substring(class234.field2957.length());
            } else if (var15.startsWith(class234.field2959)) {
                var16 = 11;
                var13 = var13.substring(class234.field2959.length());
            } else if (Statics.field3598 != class200.field2359) {
                if (var15.startsWith(class234.field3036)) {
                    var16 = 0;
                    var13 = var13.substring(class234.field3036.length());
                } else if (var15.startsWith(class234.field2940)) {
                    var16 = 1;
                    var13 = var13.substring(class234.field2940.length());
                } else if (var15.startsWith(class234.field2942)) {
                    var16 = 2;
                    var13 = var13.substring(class234.field2942.length());
                } else if (var15.startsWith(class234.field2837)) {
                    var16 = 3;
                    var13 = var13.substring(class234.field2837.length());
                } else if (var15.startsWith(class234.field2829)) {
                    var16 = 4;
                    var13 = var13.substring(class234.field2829.length());
                } else if (var15.startsWith(class234.field2948)) {
                    var16 = 5;
                    var13 = var13.substring(class234.field2948.length());
                } else if (var15.startsWith(class234.field2950)) {
                    var16 = 6;
                    var13 = var13.substring(class234.field2950.length());
                } else if (var15.startsWith(class234.field2813)) {
                    var16 = 7;
                    var13 = var13.substring(class234.field2813.length());
                } else if (var15.startsWith(class234.field2758)) {
                    var16 = 8;
                    var13 = var13.substring(class234.field2758.length());
                } else if (var15.startsWith(class234.field2839)) {
                    var16 = 9;
                    var13 = var13.substring(class234.field2839.length());
                } else if (var15.startsWith(class234.field2958)) {
                    var16 = 10;
                    var13 = var13.substring(class234.field2958.length());
                } else if (var15.startsWith(class234.field2809)) {
                    var16 = 11;
                    var13 = var13.substring(class234.field2809.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class234.field2961)) {
                var18 = 1;
                var13 = var13.substring(class234.field2961.length());
            } else if (var17.startsWith(class234.field2963)) {
                var18 = 2;
                var13 = var13.substring(class234.field2963.length());
            } else if (var17.startsWith(class234.field2965)) {
                var18 = 3;
                var13 = var13.substring(class234.field2965.length());
            } else if (var17.startsWith(class234.field2967)) {
                var18 = 4;
                var13 = var13.substring(class234.field2967.length());
            } else if (var17.startsWith(class234.field2969)) {
                var18 = 5;
                var13 = var13.substring(class234.field2969.length());
            } else if (Statics.field3598 != class200.field2359) {
                if (var17.startsWith(class234.field2962)) {
                    var18 = 1;
                    var13 = var13.substring(class234.field2962.length());
                } else if (var17.startsWith(class234.field2964)) {
                    var18 = 2;
                    var13 = var13.substring(class234.field2964.length());
                } else if (var17.startsWith(class234.field2938)) {
                    var18 = 3;
                    var13 = var13.substring(class234.field2938.length());
                } else if (var17.startsWith(class234.field2968)) {
                    var18 = 4;
                    var13 = var13.substring(class234.field2968.length());
                } else if (var17.startsWith(class234.field2970)) {
                    var18 = 5;
                    var13 = var13.substring(class234.field2970.length());
                }
            }
            class197 var19 = class197.method3105(class193.field2230, client.field762.field1341);
            var19.field2339.method5121(0);
            int var20 = var19.field2339.field3711;
            var19.field2339.method5121(var14);
            var19.field2339.method5121(var16);
            var19.field2339.method5121(var18);
            class220.method5487(var19.field2339, var13);
            var19.field2339.method5246(var19.field2339.field3711 - var20);
            client.field762.method2171(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1120 -= 2;
            String var21 = field1119[Statics.field1120];
            String var22 = field1119[Statics.field1120 + 1];
            class197 var23 = class197.method3105(class193.field2284, client.field762.field1341);
            var23.field2339.method5122(0);
            int var24 = var23.field2339.field3711;
            var23.field2339.method5217(var21);
            class220.method5487(var23.field2339, var22);
            var23.field2339.method5316(var23.field2339.field3711 - var24);
            client.field762.method2171(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field3718 == null || Statics.field3718.field653 == null) {
                var25 = "";
            } else {
                var25 = Statics.field3718.field653.method4845();
            }
            field1119[++Statics.field1120 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1116[++Statics.field1118 - 1] = client.field863;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = class101.method2177(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = class101.method1834(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = class101.method809(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1119[--Statics.field1120];
            client.method843(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field815 = field1119[--Statics.field1120].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1119[++Statics.field1120 - 1] = client.field815;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1119[--Statics.field1120];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ag.au(ILce;ZI)I")
    public static int method732(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1116[++Statics.field1118 - 1] = client.method1171();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1116[--Statics.field1118];
            if (var3 == 1 || var3 == 2) {
                client.method357(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1116[++Statics.field1118 - 1] = Statics.field677.field1080;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1116[--Statics.field1118];
            if (var4 == 1 || var4 == 2) {
                Statics.field677.field1080 = var4;
                class83.method437();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1118--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.ao(ILce;ZI)I")
    public static int method344(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1118 -= 2;
            int var3 = field1116[Statics.field1118];
            int var4 = field1116[Statics.field1118 + 1];
            if (!client.field889) {
                client.field825 = var3;
                client.field910 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1116[++Statics.field1118 - 1] = client.field825;
            return 1;
        } else if (arg0 == 5506) {
            field1116[++Statics.field1118 - 1] = client.field910;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1116[--Statics.field1118];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field756 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1116[++Statics.field1118 - 1] = client.field756;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.aq(ILce;ZB)I")
    public static int method681(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field803 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jp.av(II)I")
    public static int method4643(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("cw.ak(II)I")
    public static int method1678(int arg0) {
        return (int) ((Math.log((double) arg0) / field1129 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("bn.aa(ILce;ZI)I")
    public static int method1134(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1118 -= 2;
            client.field932 = (short) method4643(field1116[Statics.field1118]);
            if (client.field932 <= 0) {
                client.field932 = 256;
            }
            client.field933 = (short) method4643(field1116[Statics.field1118 + 1]);
            if (client.field933 <= 0) {
                client.field933 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1118 -= 2;
            client.field898 = (short) field1116[Statics.field1118];
            if (client.field898 <= 0) {
                client.field898 = 256;
            }
            client.field851 = (short) field1116[Statics.field1118 + 1];
            if (client.field851 <= 0) {
                client.field851 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1118 -= 4;
            client.field936 = (short) field1116[Statics.field1118];
            if (client.field936 <= 0) {
                client.field936 = 1;
            }
            client.field749 = (short) field1116[Statics.field1118 + 1];
            if (client.field749 <= 0) {
                client.field749 = 32767;
            } else if (client.field749 < client.field936) {
                client.field749 = client.field936;
            }
            client.field938 = (short) field1116[Statics.field1118 + 2];
            if (client.field938 <= 0) {
                client.field938 = 1;
            }
            client.field939 = (short) field1116[Statics.field1118 + 3];
            if (client.field939 <= 0) {
                client.field939 = 32767;
            } else if (client.field939 < client.field938) {
                client.field939 = client.field938;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field853 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                client.method3440(0, 0, client.field853.field2583, client.field853.field2643, false);
                field1116[++Statics.field1118 - 1] = client.field821;
                field1116[++Statics.field1118 - 1] = client.field943;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1116[++Statics.field1118 - 1] = client.field898;
            field1116[++Statics.field1118 - 1] = client.field851;
            return 1;
        } else if (arg0 == 6205) {
            field1116[++Statics.field1118 - 1] = method1678(client.field932);
            field1116[++Statics.field1118 - 1] = method1678(client.field933);
            return 1;
        } else if (arg0 == 6220) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1116[++Statics.field1118 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1116[++Statics.field1118 - 1] = Statics.field278;
            return 1;
        } else if (arg0 == 6223) {
            field1116[++Statics.field1118 - 1] = Statics.field2526;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("r.ax(ILce;ZB)I")
    public static int method208(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1116[++Statics.field1118 - 1] = class81.method3426() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class81 var3 = class81.method365();
            if (var3 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = 0;
                field1119[++Statics.field1120 - 1] = "";
                field1116[++Statics.field1118 - 1] = 0;
                field1116[++Statics.field1118 - 1] = 0;
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1116[++Statics.field1118 - 1] = var3.field1041;
                field1116[++Statics.field1118 - 1] = var3.field1050;
                field1119[++Statics.field1120 - 1] = var3.field1053;
                field1116[++Statics.field1118 - 1] = var3.field1054;
                field1116[++Statics.field1118 - 1] = var3.field1051;
                field1119[++Statics.field1120 - 1] = var3.field1052;
            }
            return 1;
        } else if (arg0 == 6502) {
            class81 var4 = class81.method1028();
            if (var4 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = 0;
                field1119[++Statics.field1120 - 1] = "";
                field1116[++Statics.field1118 - 1] = 0;
                field1116[++Statics.field1118 - 1] = 0;
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1116[++Statics.field1118 - 1] = var4.field1041;
                field1116[++Statics.field1118 - 1] = var4.field1050;
                field1119[++Statics.field1120 - 1] = var4.field1053;
                field1116[++Statics.field1118 - 1] = var4.field1054;
                field1116[++Statics.field1118 - 1] = var4.field1051;
                field1119[++Statics.field1120 - 1] = var4.field1052;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1116[--Statics.field1118];
            class81 var6 = null;
            for (int var7 = 0; var7 < class81.field1045; var7++) {
                if (Statics.field3838[var7].field1041 == var5) {
                    var6 = Statics.field3838[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = 0;
                field1119[++Statics.field1120 - 1] = "";
                field1116[++Statics.field1118 - 1] = 0;
                field1116[++Statics.field1118 - 1] = 0;
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1116[++Statics.field1118 - 1] = var6.field1041;
                field1116[++Statics.field1118 - 1] = var6.field1050;
                field1119[++Statics.field1120 - 1] = var6.field1053;
                field1116[++Statics.field1118 - 1] = var6.field1054;
                field1116[++Statics.field1118 - 1] = var6.field1051;
                field1119[++Statics.field1120 - 1] = var6.field1052;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1118 -= 4;
            int var8 = field1116[Statics.field1118];
            boolean var9 = field1116[Statics.field1118 + 1] == 1;
            int var10 = field1116[Statics.field1118 + 2];
            boolean var11 = field1116[Statics.field1118 + 3] == 1;
            class81.method1228(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1116[--Statics.field1118];
            if (var12 >= 0 && var12 < class81.field1045) {
                class81 var13 = Statics.field3838[var12];
                field1116[++Statics.field1118 - 1] = var13.field1041;
                field1116[++Statics.field1118 - 1] = var13.field1050;
                field1119[++Statics.field1120 - 1] = var13.field1053;
                field1116[++Statics.field1118 - 1] = var13.field1054;
                field1116[++Statics.field1118 - 1] = var13.field1051;
                field1119[++Statics.field1120 - 1] = var13.field1052;
            } else {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = 0;
                field1119[++Statics.field1120 - 1] = "";
                field1116[++Statics.field1118 - 1] = 0;
                field1116[++Statics.field1118 - 1] = 0;
                field1119[++Statics.field1120 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field826 = field1116[--Statics.field1118] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1118 -= 2;
            int var14 = field1116[Statics.field1118];
            int var15 = field1116[Statics.field1118 + 1];
            class260 var16 = class260.method4738(var15);
            if (var16.method4182()) {
                field1119[++Statics.field1120 - 1] = class267.method3854(var14).method4397(var15, var16.field3300);
            } else {
                field1116[++Statics.field1118 - 1] = class267.method3854(var14).method4399(var15, var16.field3299);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1118 -= 2;
            int var17 = field1116[Statics.field1118];
            int var18 = field1116[Statics.field1118 + 1];
            class260 var19 = class260.method4738(var18);
            if (var19.method4182()) {
                field1119[++Statics.field1120 - 1] = class264.method363(var17).method4312(var18, var19.field3300);
            } else {
                field1116[++Statics.field1118 - 1] = class264.method363(var17).method4299(var18, var19.field3299);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1118 -= 2;
            int var20 = field1116[Statics.field1118];
            int var21 = field1116[Statics.field1118 + 1];
            class260 var22 = class260.method4738(var21);
            if (var22.method4182()) {
                field1119[++Statics.field1120 - 1] = class265.method337(var20).method4334(var21, var22.field3300);
            } else {
                field1116[++Statics.field1118 - 1] = class265.method337(var20).method4336(var21, var22.field3299);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1118 -= 2;
            int var23 = field1116[Statics.field1118];
            int var24 = field1116[Statics.field1118 + 1];
            class260 var25 = class260.method4738(var24);
            if (var25.method4182()) {
                field1119[++Statics.field1120 - 1] = class261.method4429(var23).method4194(var24, var25.field3300);
            } else {
                field1116[++Statics.field1118 - 1] = class261.method4429(var23).method4196(var24, var25.field3299);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1116[++Statics.field1118 - 1] = client.field783 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1116[++Statics.field1118 - 1] = client.field686 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1120--;
            Statics.field1118--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1120--;
            Statics.field1118--;
            return 1;
        } else if (arg0 == 6524) {
            field1116[++Statics.field1118 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1116[++Statics.field1118 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1116[++Statics.field1118 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jb.az(ILce;ZI)I")
    public static int method4734(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field611;
            int var4 = (Statics.field3718.field984 >> 7) + Statics.field591;
            int var5 = (Statics.field3718.field974 >> 7) + Statics.field1153;
            client.method103().method6028(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1116[--Statics.field1118];
            String var7 = "";
            class36 var8 = client.method103().method5975(var6);
            if (var8 != null) {
                var7 = var8.method378();
            }
            field1119[++Statics.field1120 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1116[--Statics.field1118];
            client.method103().method6006(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1116[++Statics.field1118 - 1] = client.method103().method5946();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1116[--Statics.field1118];
            client.method103().method5943(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1116[++Statics.field1118 - 1] = client.method103().method5948() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class223 var11 = new class223(field1116[--Statics.field1118]);
            client.method103().method5978(var11.field2533, var11.field2530);
            return 1;
        } else if (arg0 == 6607) {
            class223 var12 = new class223(field1116[--Statics.field1118]);
            client.method103().method5999(var12.field2533, var12.field2530);
            return 1;
        } else if (arg0 == 6608) {
            class223 var13 = new class223(field1116[--Statics.field1118]);
            client.method103().method5951(var13.field2529, var13.field2533, var13.field2530);
            return 1;
        } else if (arg0 == 6609) {
            class223 var14 = new class223(field1116[--Statics.field1118]);
            client.method103().method5952(var14.field2529, var14.field2533, var14.field2530);
            return 1;
        } else if (arg0 == 6610) {
            field1116[++Statics.field1118 - 1] = client.method103().method5953();
            field1116[++Statics.field1118 - 1] = client.method103().method5949();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1116[--Statics.field1118];
            class36 var16 = client.method103().method5975(var15);
            if (var16 == null) {
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = var16.method388().method3697();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1116[--Statics.field1118];
            class36 var18 = client.method103().method5975(var17);
            if (var18 == null) {
                field1116[++Statics.field1118 - 1] = 0;
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = (var18.method382() - var18.method381() + 1) * 64;
                field1116[++Statics.field1118 - 1] = (var18.method370() - var18.method367() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1116[--Statics.field1118];
            class36 var20 = client.method103().method5975(var19);
            if (var20 == null) {
                field1116[++Statics.field1118 - 1] = 0;
                field1116[++Statics.field1118 - 1] = 0;
                field1116[++Statics.field1118 - 1] = 0;
                field1116[++Statics.field1118 - 1] = 0;
            } else {
                field1116[++Statics.field1118 - 1] = var20.method381() * 64;
                field1116[++Statics.field1118 - 1] = var20.method367() * 64;
                field1116[++Statics.field1118 - 1] = var20.method382() * 64 + 64 - 1;
                field1116[++Statics.field1118 - 1] = var20.method370() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1116[--Statics.field1118];
            class36 var22 = client.method103().method5975(var21);
            if (var22 == null) {
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = var22.method380();
            }
            return 1;
        } else if (arg0 == 6615) {
            class223 var23 = client.method103().method5955();
            if (var23 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = var23.field2533;
                field1116[++Statics.field1118 - 1] = var23.field2530;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1116[++Statics.field1118 - 1] = client.method103().method5934();
            return 1;
        } else if (arg0 == 6617) {
            class223 var24 = new class223(field1116[--Statics.field1118]);
            class36 var25 = client.method103().method6071();
            if (var25 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method372(var24.field2529, var24.field2533, var24.field2530);
            if (var26 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = var26[0];
                field1116[++Statics.field1118 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class223 var27 = new class223(field1116[--Statics.field1118]);
            class36 var28 = client.method103().method6071();
            if (var28 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = -1;
                return 1;
            }
            class223 var29 = var28.method384(var27.field2533, var27.field2530);
            if (var29 == null) {
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = var29.method3697();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1118 -= 2;
            int var30 = field1116[Statics.field1118];
            class223 var31 = new class223(field1116[Statics.field1118 + 1]);
            method42(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1118 -= 2;
            int var32 = field1116[Statics.field1118];
            class223 var33 = new class223(field1116[Statics.field1118 + 1]);
            method42(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1118 -= 2;
            int var34 = field1116[Statics.field1118];
            class223 var35 = new class223(field1116[Statics.field1118 + 1]);
            class36 var36 = client.method103().method5975(var34);
            if (var36 == null) {
                field1116[++Statics.field1118 - 1] = 0;
                return 1;
            } else {
                field1116[++Statics.field1118 - 1] = var36.method396(var35.field2529, var35.field2533, var35.field2530) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1116[++Statics.field1118 - 1] = client.method103().method5956();
            field1116[++Statics.field1118 - 1] = client.method103().method5957();
            return 1;
        } else if (arg0 == 6623) {
            class223 var37 = new class223(field1116[--Statics.field1118]);
            class36 var38 = client.method103().method5931(var37.field2529, var37.field2533, var37.field2530);
            if (var38 == null) {
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = var38.method369();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method103().method5958(field1116[--Statics.field1118]);
            return 1;
        } else if (arg0 == 6625) {
            client.method103().method5939();
            return 1;
        } else if (arg0 == 6626) {
            client.method103().method6123(field1116[--Statics.field1118]);
            return 1;
        } else if (arg0 == 6627) {
            client.method103().method5961();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1116[--Statics.field1118] == 1;
            client.method103().method5962(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1116[--Statics.field1118];
            client.method103().method5963(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1116[--Statics.field1118];
            client.method103().method5964(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method103().method5959();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1116[--Statics.field1118] == 1;
            client.method103().method5936(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1118 -= 2;
            int var43 = field1116[Statics.field1118];
            boolean var44 = field1116[Statics.field1118 + 1] == 1;
            client.method103().method6032(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1118 -= 2;
            int var45 = field1116[Statics.field1118];
            boolean var46 = field1116[Statics.field1118 + 1] == 1;
            client.method103().method5965(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1116[++Statics.field1118 - 1] = client.method103().method6004() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = client.method103().method5970(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1116[--Statics.field1118];
            field1116[++Statics.field1118 - 1] = client.method103().method5971(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1118 -= 2;
            int var49 = field1116[Statics.field1118];
            class223 var50 = new class223(field1116[Statics.field1118 + 1]);
            class223 var51 = client.method103().method5974(var49, var50);
            if (var51 == null) {
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = var51.method3697();
            }
            return 1;
        } else if (arg0 == 6639) {
            class44 var52 = client.method103().method5976();
            if (var52 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = var52.method264();
                field1116[++Statics.field1118 - 1] = var52.field327.method3697();
            }
            return 1;
        } else if (arg0 == 6640) {
            class44 var53 = client.method103().method5977();
            if (var53 == null) {
                field1116[++Statics.field1118 - 1] = -1;
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = var53.method264();
                field1116[++Statics.field1118 - 1] = var53.field327.method3697();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1116[--Statics.field1118];
            class252 var55 = class252.method249(var54);
            if (var55.field3216 == null) {
                field1119[++Statics.field1120 - 1] = "";
            } else {
                field1119[++Statics.field1120 - 1] = var55.field3216;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1116[--Statics.field1118];
            class252 var57 = class252.method249(var56);
            field1116[++Statics.field1118 - 1] = var57.field3218;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1116[--Statics.field1118];
            class252 var59 = class252.method249(var58);
            if (var59 == null) {
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = var59.field3214;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1116[--Statics.field1118];
            class252 var61 = class252.method249(var60);
            if (var61 == null) {
                field1116[++Statics.field1118 - 1] = -1;
            } else {
                field1116[++Statics.field1118 - 1] = var61.field3225;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1116[++Statics.field1118 - 1] = Statics.field1257.field392;
            return 1;
        } else if (arg0 == 6698) {
            field1116[++Statics.field1118 - 1] = Statics.field1257.field389.method3697();
            return 1;
        } else if (arg0 == 6699) {
            field1116[++Statics.field1118 - 1] = Statics.field1257.field386.method3697();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.aj(II)V")
    public static void method315(int arg0) {
        if (arg0 == -1 || !class227.method1732(arg0)) {
            return;
        }
        class227[] var1 = Statics.field2694[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3.field2655 != null) {
                class72 var4 = new class72();
                var4.field613 = var3;
                var4.field603 = var3.field2655;
                Statics.method3756(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("d.ay(ILhj;ZI)V")
    public static void method42(int arg0, class223 arg1, boolean arg2) {
        class36 var3 = client.method103().method5975(arg0);
        int var4 = Statics.field3718.field667;
        int var5 = (Statics.field3718.field984 >> 7) + Statics.field591;
        int var6 = (Statics.field3718.field974 >> 7) + Statics.field1153;
        class223 var7 = new class223(var4, var5, var6);
        client.method103().method6092(var3, var7, arg1, arg2);
    }
}
