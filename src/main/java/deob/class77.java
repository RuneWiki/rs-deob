package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("by")
public class class77 {

    @ObfuscatedName("by.v")
    public static int[] field1085 = new int[5];

    @ObfuscatedName("by.l")
    public static int[][] field1068 = new int[5][5000];

    @ObfuscatedName("by.c")
    public static int[] field1080 = new int[1000];

    @ObfuscatedName("by.i")
    public static String[] field1071 = new String[1000];

    @ObfuscatedName("by.m")
    public static int field1072 = 0;

    @ObfuscatedName("by.p")
    public static class57[] field1073 = new class57[50];

    @ObfuscatedName("by.x")
    public static Calendar field1087 = Calendar.getInstance();

    @ObfuscatedName("by.j")
    public static final String[] field1075 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("by.e")
    public static boolean field1076 = false;

    @ObfuscatedName("by.s")
    public static boolean field1077 = false;

    @ObfuscatedName("by.b")
    public static int field1081 = 0;

    @ObfuscatedName("by.w")
    public static final double field1079 = Math.log(2.0D);

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.a(Lbi;I)V")
    public static void method165(class63 arg0) {
        Statics.method59(arg0, 500000);
    }

    @ObfuscatedName("bx.n(ILcj;ZB)I")
    public static int method1044(int arg0, class93 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method1147(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method102(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method3411(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method3258(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3423(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method700(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method3412(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method495(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method3682(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method1089(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method968(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method102(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method3411(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method3258(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3423(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method700(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method2196(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method764(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method21(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method2417(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method968(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method3435(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method192(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method742(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method1136(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method526(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method3779(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method1052(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method164(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method1043(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method689(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method1071(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method1041(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method5470(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method1002(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3867(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method703(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.q(ILcj;ZB)I")
    public static int method1147(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1070 -= 3;
            int var3 = field1080[Statics.field1070];
            int var4 = field1080[Statics.field1070 + 1];
            int var5 = field1080[Statics.field1070 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class218 var6 = class218.method3416(var3);
            if (var6.field2679 == null) {
                var6.field2679 = new class218[var5 + 1];
            }
            if (var6.field2679.length <= var5) {
                class218[] var7 = new class218[var5 + 1];
                for (int var8 = 0; var8 < var6.field2679.length; var8++) {
                    var7[var8] = var6.field2679[var8];
                }
                var6.field2679 = var7;
            }
            if (var5 > 0 && var6.field2679[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class218 var9 = new class218();
            var9.field2630 = var4;
            var9.field2673 = var9.field2549 = var6.field2549;
            var9.field2550 = var5;
            var9.field2569 = true;
            var6.field2679[var5] = var9;
            if (arg2) {
                Statics.field1302 = var9;
            } else {
                Statics.field1311 = var9;
            }
            client.method166(var6);
            return 1;
        } else if (arg0 == 101) {
            class218 var10 = arg2 ? Statics.field1302 : Statics.field1311;
            class218 var11 = class218.method3416(var10.field2549);
            var11.field2679[var10.field2550] = null;
            client.method166(var11);
            return 1;
        } else if (arg0 == 102) {
            class218 var12 = class218.method3416(field1080[--Statics.field1070]);
            var12.field2679 = null;
            client.method166(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1070 -= 2;
            int var13 = field1080[Statics.field1070];
            int var14 = field1080[Statics.field1070 + 1];
            class218 var15 = class218.method1064(var13, var14);
            if (var15 == null || var14 == -1) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = 1;
                if (arg2) {
                    Statics.field1302 = var15;
                } else {
                    Statics.field1311 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class218 var16 = class218.method3416(field1080[--Statics.field1070]);
            if (var16 == null) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = 1;
                if (arg2) {
                    Statics.field1302 = var16;
                } else {
                    Statics.field1311 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("i.v(ILcj;ZI)I")
    public static int method102(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1080[--Statics.field1070];
            var4 = class218.method3416(var3);
        } else {
            var4 = arg2 ? Statics.field1302 : Statics.field1311;
        }
        if (arg0 == 1000) {
            Statics.field1070 -= 4;
            var4.field2554 = field1080[Statics.field1070];
            var4.field2559 = field1080[Statics.field1070 + 1];
            var4.field2621 = field1080[Statics.field1070 + 2];
            var4.field2555 = field1080[Statics.field1070 + 3];
            client.method166(var4);
            Statics.field257.method1235(var4);
            if (var3 != -1 && var4.field2630 == 0) {
                client.method707(Statics.field2540[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1070 -= 4;
            var4.field2560 = field1080[Statics.field1070];
            var4.field2561 = field1080[Statics.field1070 + 1];
            var4.field2665 = field1080[Statics.field1070 + 2];
            var4.field2584 = field1080[Statics.field1070 + 3];
            client.method166(var4);
            Statics.field257.method1235(var4);
            if (var3 != -1 && var4.field2630 == 0) {
                client.method707(Statics.field2540[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1080[--Statics.field1070] == 1;
            if (var4.field2570 != var5) {
                var4.field2570 = var5;
                client.method166(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2689 = field1080[--Statics.field1070] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2690 = field1080[--Statics.field1070] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ge.l(ILcj;ZI)I")
    public static int method3411(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1080[--Statics.field1070];
            var4 = class218.method3416(var3);
        } else {
            var4 = arg2 ? Statics.field1302 : Statics.field1311;
        }
        if (arg0 == 1100) {
            Statics.field1070 -= 2;
            var4.field2573 = field1080[Statics.field1070];
            if (var4.field2573 > var4.field2572 - var4.field2562) {
                var4.field2573 = var4.field2572 - var4.field2562;
            }
            if (var4.field2573 < 0) {
                var4.field2573 = 0;
            }
            var4.field2614 = field1080[Statics.field1070 + 1];
            if (var4.field2614 > var4.field2654 - var4.field2565) {
                var4.field2614 = var4.field2654 - var4.field2565;
            }
            if (var4.field2614 < 0) {
                var4.field2614 = 0;
            }
            client.method166(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2574 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2634 = field1080[--Statics.field1070] == 1;
            client.method166(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2587 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2582 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2680 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2610 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2623 = field1080[--Statics.field1070] == 1;
            client.method166(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2662 = 1;
            var4.field2593 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1070 -= 6;
            var4.field2632 = field1080[Statics.field1070];
            var4.field2548 = field1080[Statics.field1070 + 1];
            var4.field2600 = field1080[Statics.field1070 + 2];
            var4.field2601 = field1080[Statics.field1070 + 3];
            var4.field2598 = field1080[Statics.field1070 + 4];
            var4.field2603 = field1080[Statics.field1070 + 5];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1080[--Statics.field1070];
            if (var4.field2596 != var5) {
                var4.field2596 = var5;
                var4.field2677 = 0;
                var4.field2678 = 0;
                client.method166(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2606 = field1080[--Statics.field1070] == 1;
            client.method166(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1071[--Statics.field198];
            if (!var6.equals(var4.field2599)) {
                var4.field2599 = var6;
                client.method166(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2609 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1070 -= 3;
            var4.field2631 = field1080[Statics.field1070];
            var4.field2635 = field1080[Statics.field1070 + 1];
            var4.field2612 = field1080[Statics.field1070 + 2];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2615 = field1080[--Statics.field1070] == 1;
            client.method166(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2684 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2586 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2590 = field1080[--Statics.field1070] == 1;
            client.method166(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2591 = field1080[--Statics.field1070] == 1;
            client.method166(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1070 -= 2;
            var4.field2572 = field1080[Statics.field1070];
            var4.field2654 = field1080[Statics.field1070 + 1];
            client.method166(var4);
            if (var3 != -1 && var4.field2630 == 0) {
                client.method707(Statics.field2540[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method1040(var4.field2549, var4.field2550);
            client.field798 = var4;
            client.method166(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2585 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2575 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2581 = field1080[--Statics.field1070];
            client.method166(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1080[--Statics.field1070];
            class323 var8 = (class323) class196.method292(class323.method3424(), var7);
            if (var8 != null) {
                var4.field2579 = var8;
                client.method166(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1080[--Statics.field1070] == 1;
            var4.field2642 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1080[--Statics.field1070] == 1;
            var4.field2564 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ff.c(ILcj;ZI)I")
    public static int method3258(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3416(field1080[--Statics.field1070]);
        } else {
            var3 = arg2 ? Statics.field1302 : Statics.field1311;
        }
        client.method166(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1070 -= 2;
            int var4 = field1080[Statics.field1070];
            int var5 = field1080[Statics.field1070 + 1];
            var3.field2675 = var4;
            var3.field2580 = var5;
            class255 var6 = class255.method3852(var4);
            var3.field2600 = var6.field3407;
            var3.field2601 = var6.field3408;
            var3.field2598 = var6.field3409;
            var3.field2632 = var6.field3410;
            var3.field2548 = var6.field3411;
            var3.field2603 = var6.field3406;
            if (arg0 == 1205) {
                var3.field2608 = 0;
            } else if (arg0 == 1212 | var6.field3442 == 1) {
                var3.field2608 = 1;
            } else {
                var3.field2608 = 2;
            }
            if (var3.field2578 > 0) {
                var3.field2603 = var3.field2603 * 32 / var3.field2578;
            } else if (var3.field2560 > 0) {
                var3.field2603 = var3.field2603 * 32 / var3.field2560;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2662 = 2;
            var3.field2593 = field1080[--Statics.field1070];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2662 = 3;
            var3.field2593 = Statics.field2530.field597.method3750();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gk.o(ILcj;ZI)I")
    public static int method3423(int arg0, class93 arg1, boolean arg2) {
        boolean var3 = true;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class218.method3416(field1080[--Statics.field1070]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1302 : Statics.field1311;
        }
        if (arg0 == 1300) {
            int var5 = field1080[--Statics.field1070] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3791(var5, field1071[--Statics.field198]);
                return 1;
            } else {
                Statics.field198--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1070 -= 2;
            int var6 = field1080[Statics.field1070];
            int var7 = field1080[Statics.field1070 + 1];
            var4.field2558 = class218.method1064(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2633 = field1080[--Statics.field1070] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2589 = field1080[--Statics.field1070];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2543 = field1080[--Statics.field1070];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2676 = field1071[--Statics.field198];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2592 = field1071[--Statics.field198];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2595 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2691 = field1080[--Statics.field1070] == 1;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1070 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1080[Statics.field1070 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1080[Statics.field1070 + var10];
                        var9[var10 / 2] = (byte) field1080[Statics.field1070 + var10 + 1];
                    }
                }
            } else {
                Statics.field1070 -= 2;
                var8 = new byte[] { (byte) field1080[Statics.field1070] };
                var9 = new byte[] { (byte) field1080[Statics.field1070 + 1] };
            }
            int var11 = field1080[--Statics.field1070] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method3103(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1070 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1080[Statics.field1070] };
            byte[] var14 = new byte[] { (byte) field1080[Statics.field1070 + 1] };
            method3103(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1070 -= 3;
            int var15 = field1080[Statics.field1070] - 1;
            int var16 = field1080[Statics.field1070 + 1];
            int var17 = field1080[Statics.field1070 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method1840(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1080[--Statics.field1070];
            int var20 = field1080[--Statics.field1070];
            method1840(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1070--;
            int var21 = field1080[Statics.field1070] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method569(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method569(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ex.i(Lhi;I[B[BB)V")
    public static final void method3103(class218 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2624 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2624 = new byte[11][];
            arg0.field2625 = new byte[11][];
            arg0.field2629 = new int[11];
            arg0.field2627 = new int[11];
        }
        arg0.field2624[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2607 = false;
            for (int var4 = 0; var4 < arg0.field2624.length; var4++) {
                if (arg0.field2624[var4] != null) {
                    arg0.field2607 = true;
                    break;
                }
            }
        } else {
            arg0.field2607 = true;
        }
        arg0.field2625[arg1] = arg3;
    }

    @ObfuscatedName("bf.d(Lhi;IIII)V")
    public static final void method1840(class218 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2629 == null) {
            throw new RuntimeException();
        }
        arg0.field2629[arg1] = arg2;
        arg0.field2627[arg1] = arg3;
    }

    @ObfuscatedName("ab.m(Lhi;IB)V")
    public static final void method569(class218 arg0, int arg1) {
        if (arg0.field2624 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2628 == null) {
            arg0.field2628 = new int[arg0.field2624.length];
        }
        arg0.field2628[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ah.p(ILcj;ZI)I")
    public static int method700(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3416(field1080[--Statics.field1070]);
        } else {
            var3 = arg2 ? Statics.field1302 : Statics.field1311;
        }
        String var4 = field1071[--Statics.field198];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1080[--Statics.field1070];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1080[--Statics.field1070];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1071[--Statics.field198];
            } else {
                var7[var8] = Integer.valueOf(field1080[--Statics.field1070]);
            }
        }
        int var9 = field1080[--Statics.field1070];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2613 = var7;
        } else if (arg0 == 1401) {
            var3.field2640 = var7;
        } else if (arg0 == 1402) {
            var3.field2552 = var7;
        } else if (arg0 == 1403) {
            var3.field2641 = var7;
        } else if (arg0 == 1404) {
            var3.field2643 = var7;
        } else if (arg0 == 1405) {
            var3.field2683 = var7;
        } else if (arg0 == 1406) {
            var3.field2647 = var7;
        } else if (arg0 == 1407) {
            var3.field2648 = var7;
            var3.field2669 = var5;
        } else if (arg0 == 1408) {
            var3.field2571 = var7;
        } else if (arg0 == 1409) {
            var3.field2655 = var7;
        } else if (arg0 == 1410) {
            var3.field2688 = var7;
        } else if (arg0 == 1411) {
            var3.field2638 = var7;
        } else if (arg0 == 1412) {
            var3.field2535 = var7;
        } else if (arg0 == 1414) {
            var3.field2597 = var7;
            var3.field2651 = var5;
        } else if (arg0 == 1415) {
            var3.field2663 = var7;
            var3.field2653 = var5;
        } else if (arg0 == 1416) {
            var3.field2646 = var7;
        } else if (arg0 == 1417) {
            var3.field2656 = var7;
        } else if (arg0 == 1418) {
            var3.field2657 = var7;
        } else if (arg0 == 1419) {
            var3.field2658 = var7;
        } else if (arg0 == 1420) {
            var3.field2639 = var7;
        } else if (arg0 == 1421) {
            var3.field2660 = var7;
        } else if (arg0 == 1422) {
            var3.field2649 = var7;
        } else if (arg0 == 1423) {
            var3.field2659 = var7;
        } else if (arg0 == 1424) {
            var3.field2538 = var7;
        } else if (arg0 == 1425) {
            var3.field2626 = var7;
        } else if (arg0 == 1426) {
            var3.field2666 = var7;
        } else if (arg0 == 1427) {
            var3.field2664 = var7;
        } else {
            return 2;
        }
        var3.field2551 = true;
        return 1;
    }

    @ObfuscatedName("ge.h(ILcj;ZB)I")
    public static int method3412(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1302 : Statics.field1311;
        if (arg0 == 1500) {
            field1080[++Statics.field1070 - 1] = var3.field2650;
            return 1;
        } else if (arg0 == 1501) {
            field1080[++Statics.field1070 - 1] = var3.field2563;
            return 1;
        } else if (arg0 == 1502) {
            field1080[++Statics.field1070 - 1] = var3.field2562;
            return 1;
        } else if (arg0 == 1503) {
            field1080[++Statics.field1070 - 1] = var3.field2565;
            return 1;
        } else if (arg0 == 1504) {
            field1080[++Statics.field1070 - 1] = var3.field2570 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1080[++Statics.field1070 - 1] = var3.field2673;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.k(ILcj;ZI)I")
    public static int method495(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1302 : Statics.field1311;
        if (arg0 == 1600) {
            field1080[++Statics.field1070 - 1] = var3.field2573;
            return 1;
        } else if (arg0 == 1601) {
            field1080[++Statics.field1070 - 1] = var3.field2614;
            return 1;
        } else if (arg0 == 1602) {
            field1071[++Statics.field198 - 1] = var3.field2599;
            return 1;
        } else if (arg0 == 1603) {
            field1080[++Statics.field1070 - 1] = var3.field2572;
            return 1;
        } else if (arg0 == 1604) {
            field1080[++Statics.field1070 - 1] = var3.field2654;
            return 1;
        } else if (arg0 == 1605) {
            field1080[++Statics.field1070 - 1] = var3.field2603;
            return 1;
        } else if (arg0 == 1606) {
            field1080[++Statics.field1070 - 1] = var3.field2600;
            return 1;
        } else if (arg0 == 1607) {
            field1080[++Statics.field1070 - 1] = var3.field2598;
            return 1;
        } else if (arg0 == 1608) {
            field1080[++Statics.field1070 - 1] = var3.field2601;
            return 1;
        } else if (arg0 == 1609) {
            field1080[++Statics.field1070 - 1] = var3.field2587;
            return 1;
        } else if (arg0 == 1610) {
            field1080[++Statics.field1070 - 1] = var3.field2581;
            return 1;
        } else if (arg0 == 1611) {
            field1080[++Statics.field1070 - 1] = var3.field2574;
            return 1;
        } else if (arg0 == 1612) {
            field1080[++Statics.field1070 - 1] = var3.field2575;
            return 1;
        } else if (arg0 == 1613) {
            field1080[++Statics.field1070 - 1] = var3.field2579.method33();
            return 1;
        } else if (arg0 == 1614) {
            field1080[++Statics.field1070 - 1] = var3.field2564 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gc.x(ILcj;ZI)I")
    public static int method3682(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1302 : Statics.field1311;
        if (arg0 == 1700) {
            field1080[++Statics.field1070 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2675 == -1) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = var3.field2580;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1080[++Statics.field1070 - 1] = var3.field2550;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.j(ILcj;ZB)I")
    public static int method1089(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1302 : Statics.field1311;
        if (arg0 == 1800) {
            field1080[++Statics.field1070 - 1] = class219.method3215(client.method3452(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1080[--Statics.field1070];
            int var5 = var4 - 1;
            if (var3.field2595 == null || var5 >= var3.field2595.length || var3.field2595[var5] == null) {
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1071[++Statics.field198 - 1] = var3.field2595[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2676 == null) {
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1071[++Statics.field198 - 1] = var3.field2676;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.r(ILcj;ZI)I")
    public static int method968(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3416(field1080[--Statics.field1070]);
        } else {
            var3 = arg2 ? Statics.field1302 : Statics.field1311;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1081 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2664 == null) {
            return 0;
        } else {
            class63 var4 = new class63();
            var4.field560 = var3;
            var4.field558 = var3.field2664;
            var4.field551 = field1081 + 1;
            client.field831.method4576(var4);
            return 1;
        }
    }

    @ObfuscatedName("cp.e(ILcj;ZI)I")
    public static int method2196(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3416(field1080[--Statics.field1070]);
        if (arg0 == 2500) {
            field1080[++Statics.field1070 - 1] = var3.field2650;
            return 1;
        } else if (arg0 == 2501) {
            field1080[++Statics.field1070 - 1] = var3.field2563;
            return 1;
        } else if (arg0 == 2502) {
            field1080[++Statics.field1070 - 1] = var3.field2562;
            return 1;
        } else if (arg0 == 2503) {
            field1080[++Statics.field1070 - 1] = var3.field2565;
            return 1;
        } else if (arg0 == 2504) {
            field1080[++Statics.field1070 - 1] = var3.field2570 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1080[++Statics.field1070 - 1] = var3.field2673;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.s(ILcj;ZI)I")
    public static int method764(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3416(field1080[--Statics.field1070]);
        if (arg0 == 2600) {
            field1080[++Statics.field1070 - 1] = var3.field2573;
            return 1;
        } else if (arg0 == 2601) {
            field1080[++Statics.field1070 - 1] = var3.field2614;
            return 1;
        } else if (arg0 == 2602) {
            field1071[++Statics.field198 - 1] = var3.field2599;
            return 1;
        } else if (arg0 == 2603) {
            field1080[++Statics.field1070 - 1] = var3.field2572;
            return 1;
        } else if (arg0 == 2604) {
            field1080[++Statics.field1070 - 1] = var3.field2654;
            return 1;
        } else if (arg0 == 2605) {
            field1080[++Statics.field1070 - 1] = var3.field2603;
            return 1;
        } else if (arg0 == 2606) {
            field1080[++Statics.field1070 - 1] = var3.field2600;
            return 1;
        } else if (arg0 == 2607) {
            field1080[++Statics.field1070 - 1] = var3.field2598;
            return 1;
        } else if (arg0 == 2608) {
            field1080[++Statics.field1070 - 1] = var3.field2601;
            return 1;
        } else if (arg0 == 2609) {
            field1080[++Statics.field1070 - 1] = var3.field2587;
            return 1;
        } else if (arg0 == 2610) {
            field1080[++Statics.field1070 - 1] = var3.field2581;
            return 1;
        } else if (arg0 == 2611) {
            field1080[++Statics.field1070 - 1] = var3.field2574;
            return 1;
        } else if (arg0 == 2612) {
            field1080[++Statics.field1070 - 1] = var3.field2575;
            return 1;
        } else if (arg0 == 2613) {
            field1080[++Statics.field1070 - 1] = var3.field2579.method33();
            return 1;
        } else if (arg0 == 2614) {
            field1080[++Statics.field1070 - 1] = var3.field2564 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("n.b(ILcj;ZB)I")
    public static int method21(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class218 var3 = class218.method3416(field1080[--Statics.field1070]);
            field1080[++Statics.field1070 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 2701) {
            class218 var4 = class218.method3416(field1080[--Statics.field1070]);
            if (var4.field2675 == -1) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = var4.field2580;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1080[--Statics.field1070];
            class62 var6 = (class62) client.field793.method5528((long) var5);
            if (var6 == null) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1080[++Statics.field1070 - 1] = client.field697;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dm.w(ILcj;ZI)I")
    public static int method2417(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3416(field1080[--Statics.field1070]);
        if (arg0 == 2800) {
            field1080[++Statics.field1070 - 1] = class219.method3215(client.method3452(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1080[--Statics.field1070];
            int var5 = var4 - 1;
            if (var3.field2595 == null || var5 >= var3.field2595.length || var3.field2595[var5] == null) {
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1071[++Statics.field198 - 1] = var3.field2595[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2676 == null) {
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1071[++Statics.field198 - 1] = var3.field2676;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gf.u(ILcj;ZI)I")
    public static int method3435(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1071[--Statics.field198];
            class92.method522(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1070 -= 2;
            client.method1107(Statics.field2530, field1080[Statics.field1070], field1080[Statics.field1070 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1077) {
                field1076 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1071[--Statics.field198];
            int var5 = 0;
            if (class291.method276(var4)) {
                var5 = class291.method1750(var4);
            }
            class188 var6 = class188.method2402(class184.field2222, client.field679.field1284);
            var6.field2308.method5262(var5);
            client.field679.method2177(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1071[--Statics.field198];
            class188 var8 = class188.method2402(class184.field2200, client.field679.field1284);
            var8.field2308.method5253(var7.length() + 1);
            var8.field2308.method5114(var7);
            client.field679.method2177(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1071[--Statics.field198];
            class188 var10 = class188.method2402(class184.field2256, client.field679.field1284);
            var10.field2308.method5253(var9.length() + 1);
            var10.field2308.method5114(var9);
            client.field679.method2177(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1080[--Statics.field1070];
            String var12 = field1071[--Statics.field198];
            client.method760(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1070 -= 3;
            int var13 = field1080[Statics.field1070];
            int var14 = field1080[Statics.field1070 + 1];
            int var15 = field1080[Statics.field1070 + 2];
            class218 var16 = class218.method3416(var15);
            client.method60(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1070 -= 2;
            int var17 = field1080[Statics.field1070];
            int var18 = field1080[Statics.field1070 + 1];
            class218 var19 = arg2 ? Statics.field1302 : Statics.field1311;
            client.method60(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field113 = field1080[--Statics.field1070] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1080[++Statics.field1070 - 1] = Statics.field562.field1037 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field562.field1037 = field1080[--Statics.field1070] == 1;
            class74.method4291();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1071[--Statics.field198];
            boolean var21 = field1080[--Statics.field1070] == 1;
            class52.method27(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1080[--Statics.field1070];
            class188 var23 = class188.method2402(class184.field2180, client.field679.field1284);
            var23.field2308.method5128(var22);
            client.field679.method2177(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1080[--Statics.field1070];
            Statics.field198 -= 2;
            String var25 = field1071[Statics.field198];
            String var26 = field1071[Statics.field198 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class188 var27 = class188.method2402(class184.field2231, client.field679.field1284);
                var27.field2308.method5128(1 + Statics.method3242(var25) + Statics.method3242(var26));
                var27.field2308.method5114(var25);
                var27.field2308.method5114(var26);
                var27.field2308.method5149(var24);
                client.field679.method2177(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field652 = field1080[--Statics.field1070] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field780 = field1080[--Statics.field1070] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field751 = field1080[--Statics.field1070] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1080[--Statics.field1070] == 1) {
                client.field698 |= 0x1;
            } else {
                client.field698 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1080[--Statics.field1070] == 1) {
                client.field698 |= 0x2;
            } else {
                client.field698 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1080[--Statics.field1070] == 1) {
                client.field698 |= 0x4;
            } else {
                client.field698 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1080[--Statics.field1070] == 1) {
                client.field698 |= 0x8;
            } else {
                client.field698 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field698 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field650 = field1080[--Statics.field1070] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field747 = field1080[--Statics.field1070] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method2207(field1080[--Statics.field1070] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1080[++Statics.field1070 - 1] = client.method646() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1070 -= 2;
            client.field712 = field1080[Statics.field1070];
            client.field713 = field1080[Statics.field1070 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1070 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1070--;
            return 1;
        } else if (arg0 == 3132) {
            field1080[++Statics.field1070 - 1] = Statics.field3628;
            field1080[++Statics.field1070 - 1] = Statics.field3243;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1070--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1070 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field829 = 3;
            client.field795 = field1080[--Statics.field1070];
            return 1;
        } else if (arg0 == 3137) {
            client.field829 = 2;
            client.field795 = field1080[--Statics.field1070];
            return 1;
        } else if (arg0 == 3138) {
            client.field829 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field829 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field829 = 3;
            client.field795 = arg2 ? Statics.field1302.field2549 : Statics.field1311.field2549;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1080[--Statics.field1070] == 1;
            Statics.field562.field1038 = var28;
            class74.method4291();
            return 1;
        } else if (arg0 == 3142) {
            field1080[++Statics.field1070 - 1] = Statics.field562.field1038 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1080[--Statics.field1070] == 1;
            client.field671 = var29;
            if (!var29) {
                Statics.field562.field1036 = "";
                class74.method4291();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1080[++Statics.field1070 - 1] = client.field671 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1080[--Statics.field1070] == 1;
            if (Statics.field562.field1034 == var30) {
                Statics.field562.field1034 = !var30;
                class74.method4291();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1080[++Statics.field1070 - 1] = Statics.field562.field1034 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1080[++Statics.field1070 - 1] = class86.field1164;
            return 1;
        } else if (arg0 == 3154) {
            field1080[++Statics.field1070 - 1] = client.method171();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field198--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1070 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1070--;
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1070--;
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field198--;
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1070--;
            field1071[++Statics.field198 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1070--;
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1070 -= 2;
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1070 -= 2;
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1070 -= 2;
            field1071[++Statics.field198 - 1] = "";
            field1071[++Statics.field198 - 1] = "";
            field1071[++Statics.field198 - 1] = "";
            field1071[++Statics.field198 - 1] = "";
            field1071[++Statics.field198 - 1] = "";
            field1071[++Statics.field198 - 1] = "";
            field1071[++Statics.field198 - 1] = "";
            field1071[++Statics.field198 - 1] = "";
            field1071[++Statics.field198 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1070--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1070--;
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1070--;
            return 1;
        } else if (arg0 == 3175) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field198--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field198--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("r.ad(ILcj;ZI)I")
    public static int method192(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1070 -= 3;
            client.method3414(field1080[Statics.field1070], field1080[Statics.field1070 + 1], field1080[Statics.field1070 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method563(field1080[--Statics.field1070]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1070 -= 2;
            client.method692(field1080[Statics.field1070], field1080[Statics.field1070 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.ag(ILcj;ZI)I")
    public static int method742(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1080[++Statics.field1070 - 1] = client.field643;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1070 -= 2;
            int var3 = field1080[Statics.field1070];
            int var4 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = class60.method47(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1070 -= 2;
            int var5 = field1080[Statics.field1070];
            int var6 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = class60.method617(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1070 -= 2;
            int var7 = field1080[Statics.field1070];
            int var8 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = class60.method761(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = class240.method256(var9).field3187;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = client.field764[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = client.field765[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = client.field766[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field625;
            int var14 = (Statics.field2530.field930 >> 7) + Statics.field1961;
            int var15 = (Statics.field2530.field933 >> 7) + Statics.field1108;
            field1080[++Statics.field1070 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1080[++Statics.field1070 - 1] = client.field636 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1070 -= 2;
            int var19 = field1080[Statics.field1070] + 32768;
            int var20 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = class60.method47(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1070 -= 2;
            int var21 = field1080[Statics.field1070] + 32768;
            int var22 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = class60.method617(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1070 -= 2;
            int var23 = field1080[Statics.field1070] + 32768;
            int var24 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = class60.method761(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field755 >= 2) {
                field1080[++Statics.field1070 - 1] = client.field755;
            } else {
                field1080[++Statics.field1070 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1080[++Statics.field1070 - 1] = client.field726;
            return 1;
        } else if (arg0 == 3318) {
            field1080[++Statics.field1070 - 1] = client.field701;
            return 1;
        } else if (arg0 == 3321) {
            field1080[++Statics.field1070 - 1] = client.field633;
            return 1;
        } else if (arg0 == 3322) {
            field1080[++Statics.field1070 - 1] = client.field824;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field803) {
                field1080[++Statics.field1070 - 1] = 1;
            } else {
                field1080[++Statics.field1070 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1080[++Statics.field1070 - 1] = client.field768;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1070 -= 4;
            int var25 = field1080[Statics.field1070];
            int var26 = field1080[Statics.field1070 + 1];
            int var27 = field1080[Statics.field1070 + 2];
            int var28 = field1080[Statics.field1070 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1080[++Statics.field1070 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.ak(ILcj;ZI)I")
    public static int method1136(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1070 -= 2;
            int var3 = field1080[Statics.field1070];
            int var4 = field1080[Statics.field1070 + 1];
            class252 var5 = class252.method3732(var3);
            if (var5.field3304 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3310; var6++) {
                if (var5.field3311[var6] == var4) {
                    field1071[++Statics.field198 - 1] = var5.field3307[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1071[++Statics.field198 - 1] = var5.field3308;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1070 -= 4;
            int var7 = field1080[Statics.field1070];
            int var8 = field1080[Statics.field1070 + 1];
            int var9 = field1080[Statics.field1070 + 2];
            int var10 = field1080[Statics.field1070 + 3];
            class252 var11 = class252.method3732(var9);
            if (var11.field3306 != var7 || var11.field3304 != var8) {
                if (var8 == 115) {
                    field1071[++Statics.field198 - 1] = class225.field2836;
                } else {
                    field1080[++Statics.field1070 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3310; var12++) {
                if (var11.field3311[var12] == var10) {
                    if (var8 == 115) {
                        field1071[++Statics.field198 - 1] = var11.field3307[var12];
                    } else {
                        field1080[++Statics.field1070 - 1] = var11.field3312[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1071[++Statics.field198 - 1] = var11.field3308;
                } else {
                    field1080[++Statics.field1070 - 1] = var11.field3309;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1080[--Statics.field1070];
            class252 var14 = class252.method3732(var13);
            field1080[++Statics.field1070 - 1] = var14.method4251();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.av(ILcj;ZI)I")
    public static int method526(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1296.field1045 == 0) {
                field1080[++Statics.field1070 - 1] = -2;
            } else if (Statics.field1296.field1045 == 1) {
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = Statics.field1296.field1043.method4756();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1080[--Statics.field1070];
            if (Statics.field1296.method1765() && var3 >= 0 && var3 < Statics.field1296.field1043.method4756()) {
                class284 var4 = (class284) Statics.field1296.field1043.method4766(var3);
                field1071[++Statics.field198 - 1] = var4.method4713();
                field1071[++Statics.field198 - 1] = var4.method4714();
            } else {
                field1071[++Statics.field198 - 1] = "";
                field1071[++Statics.field198 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1080[--Statics.field1070];
            if (Statics.field1296.method1765() && var5 >= 0 && var5 < Statics.field1296.field1043.method4756()) {
                field1080[++Statics.field1070 - 1] = ((class279) Statics.field1296.field1043.method4766(var5)).field3597;
            } else {
                field1080[++Statics.field1070 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1080[--Statics.field1070];
            if (Statics.field1296.method1765() && var6 >= 0 && var6 < Statics.field1296.field1043.method4756()) {
                field1080[++Statics.field1070 - 1] = ((class279) Statics.field1296.field1043.method4766(var6)).field3599;
            } else {
                field1080[++Statics.field1070 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1071[--Statics.field198];
            int var8 = field1080[--Statics.field1070];
            class75.method1068(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1071[--Statics.field198];
            Statics.field1296.method1809(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1071[--Statics.field198];
            Statics.field1296.method1770(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1071[--Statics.field198];
            Statics.field1296.method1769(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1071[--Statics.field198];
            Statics.field1296.method1771(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1071[--Statics.field198];
            String var14 = client.method3415(var13);
            field1080[++Statics.field1070 - 1] = Statics.field1296.method1764(new class283(var14, Statics.field536), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field28 == null) {
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1071[++Statics.field198 - 1] = Statics.field28.field3618;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field28 == null) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = Statics.field28.method4756();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1080[--Statics.field1070];
            if (Statics.field28 == null || var15 >= Statics.field28.method4756()) {
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1071[++Statics.field198 - 1] = Statics.field28.method4766(var15).method4737().method4851();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1080[--Statics.field1070];
            if (Statics.field28 == null || var16 >= Statics.field28.method4756()) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = ((class279) Statics.field28.method4766(var16)).method4836();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1080[--Statics.field1070];
            if (Statics.field28 == null || var17 >= Statics.field28.method4756()) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = ((class279) Statics.field28.method4766(var17)).field3599;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1080[++Statics.field1070 - 1] = Statics.field28 == null ? 0 : Statics.field28.field3617;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1071[--Statics.field198];
            client.method3188(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1080[++Statics.field1070 - 1] = Statics.field28 == null ? 0 : Statics.field28.field3616;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1071[--Statics.field198];
            client.method3085(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method4664();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1296.method1765()) {
                field1080[++Statics.field1070 - 1] = Statics.field1296.field1044.method4756();
            } else {
                field1080[++Statics.field1070 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1080[--Statics.field1070];
            if (Statics.field1296.method1765() && var20 >= 0 && var20 < Statics.field1296.field1044.method4756()) {
                class278 var21 = (class278) Statics.field1296.field1044.method4766(var20);
                field1071[++Statics.field198 - 1] = var21.method4713();
                field1071[++Statics.field198 - 1] = var21.method4714();
            } else {
                field1071[++Statics.field198 - 1] = "";
                field1071[++Statics.field198 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1071[--Statics.field198];
            String var23 = client.method3415(var22);
            field1080[++Statics.field1070 - 1] = Statics.field1296.method1826(new class283(var23, Statics.field536)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1080[--Statics.field1070];
            if (Statics.field28 == null || var24 >= Statics.field28.method4756() || !Statics.field28.method4766(var24).method4737().equals(Statics.field2530.field601)) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field28 == null || Statics.field28.field3619 == null) {
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1071[++Statics.field198 - 1] = Statics.field28.field3619;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1080[--Statics.field1070];
            if (Statics.field28 == null || var25 >= Statics.field28.method4756() || !((class273) Statics.field28.method4766(var25)).method4691()) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1080[--Statics.field1070];
            if (Statics.field28 == null || var26 >= Statics.field28.method4756() || !((class273) Statics.field28.method4766(var26)).method4694()) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1296.field1043.method4775();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1043.method4771(new class314(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1043.method4771(new class315(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1043.method4771(new class158(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1043.method4771(new class152(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1043.method4771(new class157(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1043.method4771(new class160(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1043.method4771(new class156(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1043.method4771(new class154(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1043.method4771(new class153(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1043.method4771(new class155(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1296.field1043.method4767();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1296.field1044.method4775();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1044.method4771(new class314(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1044.method4771(new class315(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1296.field1044.method4767();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field28 != null) {
                Statics.field28.method4775();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1080[--Statics.field1070] == 1;
            if (Statics.field28 != null) {
                Statics.field28.method4771(new class314(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1080[--Statics.field1070] == 1;
            if (Statics.field28 != null) {
                Statics.field28.method4771(new class315(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1080[--Statics.field1070] == 1;
            if (Statics.field28 != null) {
                Statics.field28.method4771(new class158(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1080[--Statics.field1070] == 1;
            if (Statics.field28 != null) {
                Statics.field28.method4771(new class152(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1080[--Statics.field1070] == 1;
            if (Statics.field28 != null) {
                Statics.field28.method4771(new class157(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1080[--Statics.field1070] == 1;
            if (Statics.field28 != null) {
                Statics.field28.method4771(new class160(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1080[--Statics.field1070] == 1;
            if (Statics.field28 != null) {
                Statics.field28.method4771(new class156(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1080[--Statics.field1070] == 1;
            if (Statics.field28 != null) {
                Statics.field28.method4771(new class154(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1080[--Statics.field1070] == 1;
            if (Statics.field28 != null) {
                Statics.field28.method4771(new class153(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1080[--Statics.field1070] == 1;
            if (Statics.field28 != null) {
                Statics.field28.method4771(new class155(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field28 != null) {
                Statics.field28.method4767();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1080[--Statics.field1070] == 1;
            Statics.field1296.field1043.method4771(new class159(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1080[--Statics.field1070] == 1;
            if (Statics.field28 != null) {
                Statics.field28.method4771(new class159(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hb.am(ILcj;ZI)I")
    public static int method3779(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = client.field899[var3].method106();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = client.field899[var4].field58;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = client.field899[var5].field59;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = client.field899[var6].field60;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = client.field899[var7].field61;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = client.field899[var8].field65;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1080[--Statics.field1070];
            int var10 = client.field899[var9].method105();
            field1080[++Statics.field1070 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1080[--Statics.field1070];
            int var12 = client.field899[var11].method105();
            field1080[++Statics.field1070 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1080[--Statics.field1070];
            int var14 = client.field899[var13].method105();
            field1080[++Statics.field1070 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1080[--Statics.field1070];
            int var16 = client.field899[var15].method105();
            field1080[++Statics.field1070 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1080[--Statics.field1070] == 1;
            if (Statics.field338 != null) {
                Statics.field338.method75(class7.field35, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1080[--Statics.field1070] == 1;
            if (Statics.field338 != null) {
                Statics.field338.method75(class7.field36, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1070 -= 2;
            boolean var19 = field1080[Statics.field1070] == 1;
            boolean var20 = field1080[Statics.field1070 + 1] == 1;
            if (Statics.field338 != null) {
                client.field900.field631 = var20;
                Statics.field338.method75(client.field900, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1080[--Statics.field1070] == 1;
            if (Statics.field338 != null) {
                Statics.field338.method75(class7.field34, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1080[--Statics.field1070] == 1;
            if (Statics.field338 != null) {
                Statics.field338.method75(class7.field38, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1080[++Statics.field1070 - 1] = Statics.field338 == null ? 0 : Statics.field338.field37.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1080[--Statics.field1070];
            class8 var24 = (class8) Statics.field338.field37.get(var23);
            field1080[++Statics.field1070 - 1] = var24.field43;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1080[--Statics.field1070];
            class8 var26 = (class8) Statics.field338.field37.get(var25);
            field1071[++Statics.field198 - 1] = var26.method83();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1080[--Statics.field1070];
            class8 var28 = (class8) Statics.field338.field37.get(var27);
            field1071[++Statics.field198 - 1] = var28.method84();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1080[--Statics.field1070];
            class8 var30 = (class8) Statics.field338.field37.get(var29);
            long var31 = class297.method3777() - Statics.field585 - var30.field42;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1071[++Statics.field198 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1080[--Statics.field1070];
            class8 var38 = (class8) Statics.field338.field37.get(var37);
            field1080[++Statics.field1070 - 1] = var38.field45.field60;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1080[--Statics.field1070];
            class8 var40 = (class8) Statics.field338.field37.get(var39);
            field1080[++Statics.field1070 - 1] = var40.field45.field59;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1080[--Statics.field1070];
            class8 var42 = (class8) Statics.field338.field37.get(var41);
            field1080[++Statics.field1070 - 1] = var42.field45.field58;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.ab(ILcj;ZB)I")
    public static int method1052(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1070 -= 2;
            int var3 = field1080[Statics.field1070];
            int var4 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1070 -= 2;
            int var5 = field1080[Statics.field1070];
            int var6 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1070 -= 2;
            int var7 = field1080[Statics.field1070];
            int var8 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1070 -= 2;
            int var9 = field1080[Statics.field1070];
            int var10 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1070 -= 5;
            int var13 = field1080[Statics.field1070];
            int var14 = field1080[Statics.field1070 + 1];
            int var15 = field1080[Statics.field1070 + 2];
            int var16 = field1080[Statics.field1070 + 3];
            int var17 = field1080[Statics.field1070 + 4];
            field1080[++Statics.field1070 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1070 -= 2;
            int var18 = field1080[Statics.field1070];
            int var19 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1070 -= 2;
            int var20 = field1080[Statics.field1070];
            int var21 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1070 -= 2;
            int var22 = field1080[Statics.field1070];
            int var23 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1070 -= 2;
            int var24 = field1080[Statics.field1070];
            int var25 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1070 -= 2;
            int var26 = field1080[Statics.field1070];
            int var27 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1070 -= 2;
            int var28 = field1080[Statics.field1070];
            int var29 = field1080[Statics.field1070 + 1];
            if (var28 == 0) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1070 -= 2;
            int var30 = field1080[Statics.field1070];
            int var31 = field1080[Statics.field1070 + 1];
            if (var30 == 0) {
                field1080[++Statics.field1070 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1080[++Statics.field1070 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1080[++Statics.field1070 - 1] = var30;
                    break;
                case 2:
                    field1080[++Statics.field1070 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1080[++Statics.field1070 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1080[++Statics.field1070 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1080[++Statics.field1070 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1070 -= 2;
            int var32 = field1080[Statics.field1070];
            int var33 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1070 -= 2;
            int var34 = field1080[Statics.field1070];
            int var35 = field1080[Statics.field1070 + 1];
            field1080[++Statics.field1070 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1070 -= 3;
            long var36 = (long) field1080[Statics.field1070];
            long var38 = (long) field1080[Statics.field1070 + 1];
            long var40 = (long) field1080[Statics.field1070 + 2];
            field1080[++Statics.field1070 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.ax(ILcj;ZB)I")
    public static int method164(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1071[--Statics.field198];
            int var4 = field1080[--Statics.field1070];
            field1071[++Statics.field198 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field198 -= 2;
            String var5 = field1071[Statics.field198];
            String var6 = field1071[Statics.field198 + 1];
            field1071[++Statics.field198 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1071[--Statics.field198];
            int var8 = field1080[--Statics.field1070];
            field1071[++Statics.field198 - 1] = var7 + class291.method185(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1071[--Statics.field198];
            field1071[++Statics.field198 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1080[--Statics.field1070];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1087.setTime(new Date(var11));
            int var13 = field1087.get(5);
            int var14 = field1087.get(2);
            int var15 = field1087.get(1);
            field1071[++Statics.field198 - 1] = var13 + "-" + field1075[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field198 -= 2;
            String var16 = field1071[Statics.field198];
            String var17 = field1071[Statics.field198 + 1];
            if (Statics.field2530.field597 != null && Statics.field2530.field597.field2516) {
                field1071[++Statics.field198 - 1] = var17;
            } else {
                field1071[++Statics.field198 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1080[--Statics.field1070];
            field1071[++Statics.field198 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field198 -= 2;
            field1080[++Statics.field1070 - 1] = class291.method5823(class287.method3865(field1071[Statics.field198], field1071[Statics.field198 + 1], Statics.field281));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1071[--Statics.field198];
            Statics.field1070 -= 2;
            int var20 = field1080[Statics.field1070];
            int var21 = field1080[Statics.field1070 + 1];
            byte[] var22 = Statics.field1934.method3873(var21, 0);
            class295 var23 = new class295(var22);
            field1080[++Statics.field1070 - 1] = var23.method4985(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1071[--Statics.field198];
            Statics.field1070 -= 2;
            int var25 = field1080[Statics.field1070];
            int var26 = field1080[Statics.field1070 + 1];
            byte[] var27 = Statics.field1934.method3873(var26, 0);
            class295 var28 = new class295(var27);
            field1080[++Statics.field1070 - 1] = var28.method4984(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field198 -= 2;
            String var29 = field1071[Statics.field198];
            String var30 = field1071[Statics.field198 + 1];
            if (field1080[--Statics.field1070] == 1) {
                field1071[++Statics.field198 - 1] = var29;
            } else {
                field1071[++Statics.field198 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1071[--Statics.field198];
            field1071[++Statics.field198 - 1] = class296.method5037(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1071[--Statics.field198];
            int var33 = field1080[--Statics.field1070];
            field1071[++Statics.field198 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = class291.method4101((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = class291.method3195((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = class291.method2173((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = class291.method3401((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1071[--Statics.field198];
            if (var38 == null) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1071[--Statics.field198];
            Statics.field1070 -= 2;
            int var40 = field1080[Statics.field1070];
            int var41 = field1080[Statics.field1070 + 1];
            field1071[++Statics.field198 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1071[--Statics.field198];
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
            field1071[++Statics.field198 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1071[--Statics.field198];
            int var48 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field198 -= 2;
            String var49 = field1071[Statics.field198];
            String var50 = field1071[Statics.field198 + 1];
            int var51 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1071[--Statics.field198];
            field1071[++Statics.field198 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.al(ILcj;ZI)I")
    public static int method1043(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1080[--Statics.field1070];
            field1071[++Statics.field198 - 1] = class255.method3852(var3).field3416;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1070 -= 2;
            int var4 = field1080[Statics.field1070];
            int var5 = field1080[Statics.field1070 + 1];
            class255 var6 = class255.method3852(var4);
            if (var5 < 1 || var5 > 5 || var6.field3415[var5 - 1] == null) {
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1071[++Statics.field198 - 1] = var6.field3415[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1070 -= 2;
            int var7 = field1080[Statics.field1070];
            int var8 = field1080[Statics.field1070 + 1];
            class255 var9 = class255.method3852(var7);
            if (var8 < 1 || var8 > 5 || var9.field3412[var8 - 1] == null) {
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1071[++Statics.field198 - 1] = var9.field3412[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = class255.method3852(var10).field3413;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = class255.method3852(var11).field3442 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1080[--Statics.field1070];
            class255 var13 = class255.method3852(var12);
            if (var13.field3392 == -1 && var13.field3432 >= 0) {
                field1080[++Statics.field1070 - 1] = var13.field3432;
            } else {
                field1080[++Statics.field1070 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1080[--Statics.field1070];
            class255 var15 = class255.method3852(var14);
            if (var15.field3392 >= 0 && var15.field3432 >= 0) {
                field1080[++Statics.field1070 - 1] = var15.field3432;
            } else {
                field1080[++Statics.field1070 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = class255.method3852(var16).field3431 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1080[--Statics.field1070];
            class255 var18 = class255.method3852(var17);
            if (var18.field3445 == -1 && var18.field3444 >= 0) {
                field1080[++Statics.field1070 - 1] = var18.field3444;
            } else {
                field1080[++Statics.field1070 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1080[--Statics.field1070];
            class255 var20 = class255.method3852(var19);
            if (var20.field3445 >= 0 && var20.field3444 >= 0) {
                field1080[++Statics.field1070 - 1] = var20.field3444;
            } else {
                field1080[++Statics.field1070 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1071[--Statics.field198];
            int var22 = field1080[--Statics.field1070];
            client.method3088(var21, var22 == 1);
            field1080[++Statics.field1070 - 1] = Statics.field477;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1952 == null || Statics.field322 >= Statics.field477) {
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = Statics.field1952[++Statics.field322 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field322 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ae.ap(ILcj;ZB)I")
    public static int method689(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1080[++Statics.field1070 - 1] = client.field848;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1070 -= 3;
            client.field848 = field1080[Statics.field1070];
            Statics.field20 = class310.method4432(field1080[Statics.field1070 + 1]);
            if (Statics.field20 == null) {
                Statics.field20 = class310.field3780;
            }
            client.field849 = field1080[Statics.field1070 + 2];
            class188 var3 = class188.method2402(class184.field2257, client.field679.field1284);
            var3.field2308.method5253(client.field848);
            var3.field2308.method5253(Statics.field20.field3782);
            var3.field2308.method5253(client.field849);
            client.field679.method2177(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1071[--Statics.field198];
            Statics.field1070 -= 2;
            int var5 = field1080[Statics.field1070];
            int var6 = field1080[Statics.field1070 + 1];
            class188 var7 = class188.method2402(class184.field2205, client.field679.field1284);
            var7.field2308.method5253(Statics.method3242(var4) + 2);
            var7.field2308.method5114(var4);
            var7.field2308.method5253(var5 - 1);
            var7.field2308.method5253(var6);
            client.field679.method2177(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1070 -= 2;
            int var8 = field1080[Statics.field1070];
            int var9 = field1080[Statics.field1070 + 1];
            class65 var10 = class92.method3099(var8, var9);
            if (var10 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = 0;
                field1071[++Statics.field198 - 1] = "";
                field1071[++Statics.field198 - 1] = "";
                field1071[++Statics.field198 - 1] = "";
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = var10.field580;
                field1080[++Statics.field1070 - 1] = var10.field579;
                field1071[++Statics.field198 - 1] = var10.field591 == null ? "" : var10.field591;
                field1071[++Statics.field198 - 1] = var10.field592 == null ? "" : var10.field592;
                field1071[++Statics.field198 - 1] = var10.field586 == null ? "" : var10.field586;
                field1080[++Statics.field1070 - 1] = var10.method1139() ? 1 : (var10.method1114() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1080[--Statics.field1070];
            class65 var12 = class92.method295(var11);
            if (var12 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = 0;
                field1071[++Statics.field198 - 1] = "";
                field1071[++Statics.field198 - 1] = "";
                field1071[++Statics.field198 - 1] = "";
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = var12.field589;
                field1080[++Statics.field1070 - 1] = var12.field579;
                field1071[++Statics.field198 - 1] = var12.field591 == null ? "" : var12.field591;
                field1071[++Statics.field198 - 1] = var12.field592 == null ? "" : var12.field592;
                field1071[++Statics.field198 - 1] = var12.field586 == null ? "" : var12.field586;
                field1080[++Statics.field1070 - 1] = var12.method1139() ? 1 : (var12.method1114() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field20 == null) {
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = Statics.field20.field3782;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1071[--Statics.field198];
            int var14 = field1080[--Statics.field1070];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class225.field2905)) {
                var16 = 0;
                var13 = var13.substring(class225.field2905.length());
            } else if (var15.startsWith(class225.field2884)) {
                var16 = 1;
                var13 = var13.substring(class225.field2884.length());
            } else if (var15.startsWith(class225.field2927)) {
                var16 = 2;
                var13 = var13.substring(class225.field2927.length());
            } else if (var15.startsWith(class225.field2929)) {
                var16 = 3;
                var13 = var13.substring(class225.field2929.length());
            } else if (var15.startsWith(class225.field2931)) {
                var16 = 4;
                var13 = var13.substring(class225.field2931.length());
            } else if (var15.startsWith(class225.field2933)) {
                var16 = 5;
                var13 = var13.substring(class225.field2933.length());
            } else if (var15.startsWith(class225.field2935)) {
                var16 = 6;
                var13 = var13.substring(class225.field2935.length());
            } else if (var15.startsWith(class225.field2937)) {
                var16 = 7;
                var13 = var13.substring(class225.field2937.length());
            } else if (var15.startsWith(class225.field2939)) {
                var16 = 8;
                var13 = var13.substring(class225.field2939.length());
            } else if (var15.startsWith(class225.field2941)) {
                var16 = 9;
                var13 = var13.substring(class225.field2941.length());
            } else if (var15.startsWith(class225.field2943)) {
                var16 = 10;
                var13 = var13.substring(class225.field2943.length());
            } else if (var15.startsWith(class225.field3025)) {
                var16 = 11;
                var13 = var13.substring(class225.field3025.length());
            } else if (Statics.field281 != class191.field2332) {
                if (var15.startsWith(class225.field2850)) {
                    var16 = 0;
                    var13 = var13.substring(class225.field2850.length());
                } else if (var15.startsWith(class225.field2945)) {
                    var16 = 1;
                    var13 = var13.substring(class225.field2945.length());
                } else if (var15.startsWith(class225.field2928)) {
                    var16 = 2;
                    var13 = var13.substring(class225.field2928.length());
                } else if (var15.startsWith(class225.field2930)) {
                    var16 = 3;
                    var13 = var13.substring(class225.field2930.length());
                } else if (var15.startsWith(class225.field2807)) {
                    var16 = 4;
                    var13 = var13.substring(class225.field2807.length());
                } else if (var15.startsWith(class225.field2934)) {
                    var16 = 5;
                    var13 = var13.substring(class225.field2934.length());
                } else if (var15.startsWith(class225.field2936)) {
                    var16 = 6;
                    var13 = var13.substring(class225.field2936.length());
                } else if (var15.startsWith(class225.field2938)) {
                    var16 = 7;
                    var13 = var13.substring(class225.field2938.length());
                } else if (var15.startsWith(class225.field2940)) {
                    var16 = 8;
                    var13 = var13.substring(class225.field2940.length());
                } else if (var15.startsWith(class225.field2958)) {
                    var16 = 9;
                    var13 = var13.substring(class225.field2958.length());
                } else if (var15.startsWith(class225.field2944)) {
                    var16 = 10;
                    var13 = var13.substring(class225.field2944.length());
                } else if (var15.startsWith(class225.field3040)) {
                    var16 = 11;
                    var13 = var13.substring(class225.field3040.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class225.field2992)) {
                var18 = 1;
                var13 = var13.substring(class225.field2992.length());
            } else if (var17.startsWith(class225.field2921)) {
                var18 = 2;
                var13 = var13.substring(class225.field2921.length());
            } else if (var17.startsWith(class225.field2809)) {
                var18 = 3;
                var13 = var13.substring(class225.field2809.length());
            } else if (var17.startsWith(class225.field2953)) {
                var18 = 4;
                var13 = var13.substring(class225.field2953.length());
            } else if (var17.startsWith(class225.field2955)) {
                var18 = 5;
                var13 = var13.substring(class225.field2955.length());
            } else if (Statics.field281 != class191.field2332) {
                if (var17.startsWith(class225.field2948)) {
                    var18 = 1;
                    var13 = var13.substring(class225.field2948.length());
                } else if (var17.startsWith(class225.field2950)) {
                    var18 = 2;
                    var13 = var13.substring(class225.field2950.length());
                } else if (var17.startsWith(class225.field2952)) {
                    var18 = 3;
                    var13 = var13.substring(class225.field2952.length());
                } else if (var17.startsWith(class225.field3011)) {
                    var18 = 4;
                    var13 = var13.substring(class225.field3011.length());
                } else if (var17.startsWith(class225.field2956)) {
                    var18 = 5;
                    var13 = var13.substring(class225.field2956.length());
                }
            }
            class188 var19 = class188.method2402(class184.field2183, client.field679.field1284);
            var19.field2308.method5253(0);
            int var20 = var19.field2308.field3694;
            var19.field2308.method5253(var14);
            var19.field2308.method5253(var16);
            var19.field2308.method5253(var18);
            class211.method1055(var19.field2308, var13);
            var19.field2308.method5120(var19.field2308.field3694 - var20);
            client.field679.method2177(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field198 -= 2;
            String var21 = field1071[Statics.field198];
            String var22 = field1071[Statics.field198 + 1];
            class188 var23 = class188.method2402(class184.field2208, client.field679.field1284);
            var23.field2308.method5128(0);
            int var24 = var23.field2308.field3694;
            var23.field2308.method5114(var21);
            class211.method1055(var23.field2308, var22);
            var23.field2308.method5289(var23.field2308.field3694 - var24);
            client.field679.method2177(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field2530 == null || Statics.field2530.field601 == null) {
                var25 = "";
            } else {
                var25 = Statics.field2530.field601.method4851();
            }
            field1071[++Statics.field198 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1080[++Statics.field1070 - 1] = client.field849;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = class92.method1998(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = class92.method1994(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = class92.method1148(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1071[--Statics.field198];
            client.method3578(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field850 = field1071[--Statics.field198].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1071[++Statics.field198 - 1] = client.field850;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1071[--Statics.field198];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.aj(ILcj;ZI)I")
    public static int method1071(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1080[++Statics.field1070 - 1] = client.method3100();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1080[--Statics.field1070];
            if (var3 == 1 || var3 == 2) {
                client.method4962(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1080[++Statics.field1070 - 1] = Statics.field562.field1035;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1080[--Statics.field1070];
            if (var4 == 1 || var4 == 2) {
                Statics.field562.field1035 = var4;
                class74.method4291();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1070--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bd.ae(ILcj;ZI)I")
    public static int method1041(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1070 -= 2;
            int var3 = field1080[Statics.field1070];
            int var4 = field1080[Statics.field1070 + 1];
            if (!client.field834) {
                client.field704 = var3;
                client.field702 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1080[++Statics.field1070 - 1] = client.field704;
            return 1;
        } else if (arg0 == 5506) {
            field1080[++Statics.field1070 - 1] = client.field702;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1080[--Statics.field1070];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field708 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1080[++Statics.field1070 - 1] = client.field708;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kb.au(ILcj;ZI)I")
    public static int method5470(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field634 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jx.ah(IB)I")
    public static int method4838(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ad.an(II)I")
    public static int method529(int arg0) {
        return (int) ((Math.log((double) arg0) / field1079 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("bc.af(ILcj;ZB)I")
    public static int method1002(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1070 -= 2;
            client.field882 = (short) method4838(field1080[Statics.field1070]);
            if (client.field882 <= 0) {
                client.field882 = 256;
            }
            client.field883 = (short) method4838(field1080[Statics.field1070 + 1]);
            if (client.field883 <= 0) {
                client.field883 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1070 -= 2;
            client.field799 = (short) field1080[Statics.field1070];
            if (client.field799 <= 0) {
                client.field799 = 256;
            }
            client.field885 = (short) field1080[Statics.field1070 + 1];
            if (client.field885 <= 0) {
                client.field885 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1070 -= 4;
            client.field886 = (short) field1080[Statics.field1070];
            if (client.field886 <= 0) {
                client.field886 = 1;
            }
            client.field887 = (short) field1080[Statics.field1070 + 1];
            if (client.field887 <= 0) {
                client.field887 = 32767;
            } else if (client.field887 < client.field886) {
                client.field887 = client.field886;
            }
            client.field845 = (short) field1080[Statics.field1070 + 2];
            if (client.field845 <= 0) {
                client.field845 = 1;
            }
            client.field889 = (short) field1080[Statics.field1070 + 3];
            if (client.field889 <= 0) {
                client.field889 = 32767;
            } else if (client.field889 < client.field845) {
                client.field889 = client.field845;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field804 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                client.method3686(0, 0, client.field804.field2562, client.field804.field2565, false);
                field1080[++Statics.field1070 - 1] = client.field892;
                field1080[++Statics.field1070 - 1] = client.field893;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1080[++Statics.field1070 - 1] = client.field799;
            field1080[++Statics.field1070 - 1] = client.field885;
            return 1;
        } else if (arg0 == 6205) {
            field1080[++Statics.field1070 - 1] = method529(client.field882);
            field1080[++Statics.field1070 - 1] = method529(client.field883);
            return 1;
        } else if (arg0 == 6220) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1080[++Statics.field1070 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1080[++Statics.field1070 - 1] = Statics.field3628;
            return 1;
        } else if (arg0 == 6223) {
            field1080[++Statics.field1070 - 1] = Statics.field3243;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hs.ay(ILcj;ZB)I")
    public static int method3867(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1080[++Statics.field1070 - 1] = Statics.method709() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class72 var3 = class72.method173();
            if (var3 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = 0;
                field1071[++Statics.field198 - 1] = "";
                field1080[++Statics.field1070 - 1] = 0;
                field1080[++Statics.field1070 - 1] = 0;
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1080[++Statics.field1070 - 1] = var3.field999;
                field1080[++Statics.field1070 - 1] = var3.field1000;
                field1071[++Statics.field198 - 1] = var3.field1003;
                field1080[++Statics.field1070 - 1] = var3.field1004;
                field1080[++Statics.field1070 - 1] = var3.field1001;
                field1071[++Statics.field198 - 1] = var3.field1002;
            }
            return 1;
        } else if (arg0 == 6502) {
            class72 var4 = class72.method16();
            if (var4 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = 0;
                field1071[++Statics.field198 - 1] = "";
                field1080[++Statics.field1070 - 1] = 0;
                field1080[++Statics.field1070 - 1] = 0;
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1080[++Statics.field1070 - 1] = var4.field999;
                field1080[++Statics.field1070 - 1] = var4.field1000;
                field1071[++Statics.field198 - 1] = var4.field1003;
                field1080[++Statics.field1070 - 1] = var4.field1004;
                field1080[++Statics.field1070 - 1] = var4.field1001;
                field1071[++Statics.field198 - 1] = var4.field1002;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1080[--Statics.field1070];
            class72 var6 = null;
            for (int var7 = 0; var7 < class72.field996; var7++) {
                if (Statics.field3608[var7].field999 == var5) {
                    var6 = Statics.field3608[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = 0;
                field1071[++Statics.field198 - 1] = "";
                field1080[++Statics.field1070 - 1] = 0;
                field1080[++Statics.field1070 - 1] = 0;
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1080[++Statics.field1070 - 1] = var6.field999;
                field1080[++Statics.field1070 - 1] = var6.field1000;
                field1071[++Statics.field198 - 1] = var6.field1003;
                field1080[++Statics.field1070 - 1] = var6.field1004;
                field1080[++Statics.field1070 - 1] = var6.field1001;
                field1071[++Statics.field198 - 1] = var6.field1002;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1070 -= 4;
            int var8 = field1080[Statics.field1070];
            boolean var9 = field1080[Statics.field1070 + 1] == 1;
            int var10 = field1080[Statics.field1070 + 2];
            boolean var11 = field1080[Statics.field1070 + 3] == 1;
            class72.method2206(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1080[--Statics.field1070];
            if (var12 >= 0 && var12 < class72.field996) {
                class72 var13 = Statics.field3608[var12];
                field1080[++Statics.field1070 - 1] = var13.field999;
                field1080[++Statics.field1070 - 1] = var13.field1000;
                field1071[++Statics.field198 - 1] = var13.field1003;
                field1080[++Statics.field1070 - 1] = var13.field1004;
                field1080[++Statics.field1070 - 1] = var13.field1001;
                field1071[++Statics.field198 - 1] = var13.field1002;
            } else {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = 0;
                field1071[++Statics.field198 - 1] = "";
                field1080[++Statics.field1070 - 1] = 0;
                field1080[++Statics.field1070 - 1] = 0;
                field1071[++Statics.field198 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field777 = field1080[--Statics.field1070] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1070 -= 2;
            int var14 = field1080[Statics.field1070];
            int var15 = field1080[Statics.field1070 + 1];
            class250 var16 = class250.method3249(var15);
            if (var16.method4210()) {
                field1071[++Statics.field198 - 1] = class257.method1054(var14).method4420(var15, var16.field3295);
            } else {
                field1080[++Statics.field1070 - 1] = class257.method1054(var14).method4429(var15, var16.field3294);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1070 -= 2;
            int var17 = field1080[Statics.field1070];
            int var18 = field1080[Statics.field1070 + 1];
            class250 var19 = class250.method3249(var18);
            if (var19.method4210()) {
                field1071[++Statics.field198 - 1] = class254.method3848(var17).method4319(var18, var19.field3295);
            } else {
                field1080[++Statics.field1070 - 1] = class254.method3848(var17).method4303(var18, var19.field3294);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1070 -= 2;
            int var20 = field1080[Statics.field1070];
            int var21 = field1080[Statics.field1070 + 1];
            class250 var22 = class250.method3249(var21);
            if (var22.method4210()) {
                field1071[++Statics.field198 - 1] = class255.method3852(var20).method4349(var21, var22.field3295);
            } else {
                field1080[++Statics.field1070 - 1] = class255.method3852(var20).method4386(var21, var22.field3294);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1070 -= 2;
            int var23 = field1080[Statics.field1070];
            int var24 = field1080[Statics.field1070 + 1];
            class250 var25 = class250.method3249(var24);
            if (var25.method4210()) {
                field1071[++Statics.field198 - 1] = class251.method1217(var23).method4240(var24, var25.field3295);
            } else {
                field1080[++Statics.field1070 - 1] = class251.method1217(var23).method4243(var24, var25.field3294);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1080[++Statics.field1070 - 1] = client.field639 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1080[++Statics.field1070 - 1] = client.field709 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field198--;
            Statics.field1070--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field198--;
            Statics.field1070--;
            return 1;
        } else if (arg0 == 6524) {
            field1080[++Statics.field1070 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1080[++Statics.field1070 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1080[++Statics.field1070 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.az(ILcj;ZI)I")
    public static int method703(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field625;
            int var4 = (Statics.field2530.field930 >> 7) + Statics.field1961;
            int var5 = (Statics.field2530.field933 >> 7) + Statics.field1108;
            client.method3177().method5882(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1080[--Statics.field1070];
            String var7 = "";
            class27 var8 = client.method3177().method5900(var6);
            if (var8 != null) {
                var7 = var8.method322();
            }
            field1071[++Statics.field198 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1080[--Statics.field1070];
            client.method3177().method5883(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1080[++Statics.field1070 - 1] = client.method3177().method5920();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1080[--Statics.field1070];
            client.method3177().method5894(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1080[++Statics.field1070 - 1] = client.method3177().method5947() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class214 var11 = new class214(field1080[--Statics.field1070]);
            client.method3177().method5901(var11.field2512, var11.field2510);
            return 1;
        } else if (arg0 == 6607) {
            class214 var12 = new class214(field1080[--Statics.field1070]);
            client.method3177().method6025(var12.field2512, var12.field2510);
            return 1;
        } else if (arg0 == 6608) {
            class214 var13 = new class214(field1080[--Statics.field1070]);
            client.method3177().method5903(var13.field2509, var13.field2512, var13.field2510);
            return 1;
        } else if (arg0 == 6609) {
            class214 var14 = new class214(field1080[--Statics.field1070]);
            client.method3177().method5904(var14.field2509, var14.field2512, var14.field2510);
            return 1;
        } else if (arg0 == 6610) {
            field1080[++Statics.field1070 - 1] = client.method3177().method6081();
            field1080[++Statics.field1070 - 1] = client.method3177().method5997();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1080[--Statics.field1070];
            class27 var16 = client.method3177().method5900(var15);
            if (var16 == null) {
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = var16.method332().method3731();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1080[--Statics.field1070];
            class27 var18 = client.method3177().method5900(var17);
            if (var18 == null) {
                field1080[++Statics.field1070 - 1] = 0;
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = (var18.method311() - var18.method325() + 1) * 64;
                field1080[++Statics.field1070 - 1] = (var18.method370() - var18.method327() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1080[--Statics.field1070];
            class27 var20 = client.method3177().method5900(var19);
            if (var20 == null) {
                field1080[++Statics.field1070 - 1] = 0;
                field1080[++Statics.field1070 - 1] = 0;
                field1080[++Statics.field1070 - 1] = 0;
                field1080[++Statics.field1070 - 1] = 0;
            } else {
                field1080[++Statics.field1070 - 1] = var20.method325() * 64;
                field1080[++Statics.field1070 - 1] = var20.method327() * 64;
                field1080[++Statics.field1070 - 1] = var20.method311() * 64 + 64 - 1;
                field1080[++Statics.field1070 - 1] = var20.method370() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1080[--Statics.field1070];
            class27 var22 = client.method3177().method5900(var21);
            if (var22 == null) {
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = var22.method312();
            }
            return 1;
        } else if (arg0 == 6615) {
            class214 var23 = client.method3177().method5907();
            if (var23 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = var23.field2512;
                field1080[++Statics.field1070 - 1] = var23.field2510;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1080[++Statics.field1070 - 1] = client.method3177().method5939();
            return 1;
        } else if (arg0 == 6617) {
            class214 var24 = new class214(field1080[--Statics.field1070]);
            class27 var25 = client.method3177().method5885();
            if (var25 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method316(var24.field2509, var24.field2512, var24.field2510);
            if (var26 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = var26[0];
                field1080[++Statics.field1070 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class214 var27 = new class214(field1080[--Statics.field1070]);
            class27 var28 = client.method3177().method5885();
            if (var28 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = -1;
                return 1;
            }
            class214 var29 = var28.method380(var27.field2512, var27.field2510);
            if (var29 == null) {
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = var29.method3731();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1070 -= 2;
            int var30 = field1080[Statics.field1070];
            class214 var31 = new class214(field1080[Statics.field1070 + 1]);
            method3445(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1070 -= 2;
            int var32 = field1080[Statics.field1070];
            class214 var33 = new class214(field1080[Statics.field1070 + 1]);
            method3445(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1070 -= 2;
            int var34 = field1080[Statics.field1070];
            class214 var35 = new class214(field1080[Statics.field1070 + 1]);
            class27 var36 = client.method3177().method5900(var34);
            if (var36 == null) {
                field1080[++Statics.field1070 - 1] = 0;
                return 1;
            } else {
                field1080[++Statics.field1070 - 1] = var36.method314(var35.field2509, var35.field2512, var35.field2510) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1080[++Statics.field1070 - 1] = client.method3177().method6027();
            field1080[++Statics.field1070 - 1] = client.method3177().method5909();
            return 1;
        } else if (arg0 == 6623) {
            class214 var37 = new class214(field1080[--Statics.field1070]);
            class27 var38 = client.method3177().method5881(var37.field2509, var37.field2512, var37.field2510);
            if (var38 == null) {
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = var38.method354();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method3177().method5969(field1080[--Statics.field1070]);
            return 1;
        } else if (arg0 == 6625) {
            client.method3177().method6034();
            return 1;
        } else if (arg0 == 6626) {
            client.method3177().method5912(field1080[--Statics.field1070]);
            return 1;
        } else if (arg0 == 6627) {
            client.method3177().method5953();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1080[--Statics.field1070] == 1;
            client.method3177().method6064(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1080[--Statics.field1070];
            client.method3177().method5915(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1080[--Statics.field1070];
            client.method3177().method5916(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method3177().method6057();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1080[--Statics.field1070] == 1;
            client.method3177().method5918(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1070 -= 2;
            int var43 = field1080[Statics.field1070];
            boolean var44 = field1080[Statics.field1070 + 1] == 1;
            client.method3177().method5919(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1070 -= 2;
            int var45 = field1080[Statics.field1070];
            boolean var46 = field1080[Statics.field1070 + 1] == 1;
            client.method3177().method5962(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1080[++Statics.field1070 - 1] = client.method3177().method5921() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = client.method3177().method5897(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1080[--Statics.field1070];
            field1080[++Statics.field1070 - 1] = client.method3177().method5923(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1070 -= 2;
            int var49 = field1080[Statics.field1070];
            class214 var50 = new class214(field1080[Statics.field1070 + 1]);
            class214 var51 = client.method3177().method5926(var49, var50);
            if (var51 == null) {
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = var51.method3731();
            }
            return 1;
        } else if (arg0 == 6639) {
            class35 var52 = client.method3177().method6083();
            if (var52 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = var52.method210();
                field1080[++Statics.field1070 - 1] = var52.field283.method3731();
            }
            return 1;
        } else if (arg0 == 6640) {
            class35 var53 = client.method3177().method5979();
            if (var53 == null) {
                field1080[++Statics.field1070 - 1] = -1;
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = var53.method210();
                field1080[++Statics.field1070 - 1] = var53.field283.method3731();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1080[--Statics.field1070];
            class242 var55 = class242.method1149(var54);
            if (var55.field3202 == null) {
                field1071[++Statics.field198 - 1] = "";
            } else {
                field1071[++Statics.field198 - 1] = var55.field3202;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1080[--Statics.field1070];
            class242 var57 = class242.method1149(var56);
            field1080[++Statics.field1070 - 1] = var57.field3199;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1080[--Statics.field1070];
            class242 var59 = class242.method1149(var58);
            if (var59 == null) {
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = var59.field3216;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1080[--Statics.field1070];
            class242 var61 = class242.method1149(var60);
            if (var61 == null) {
                field1080[++Statics.field1070 - 1] = -1;
            } else {
                field1080[++Statics.field1070 - 1] = var61.field3200;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1080[++Statics.field1070 - 1] = Statics.field215.field346;
            return 1;
        } else if (arg0 == 6698) {
            field1080[++Statics.field1070 - 1] = Statics.field215.field345.method3731();
            return 1;
        } else if (arg0 == 6699) {
            field1080[++Statics.field1070 - 1] = Statics.field215.field344.method3731();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eq.ao(II)V")
    public static void method3091(int arg0) {
        if (arg0 == -1 || !class218.method2615(arg0)) {
            return;
        }
        class218[] var1 = Statics.field2540[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2636 != null) {
                class63 var4 = new class63();
                var4.field560 = var3;
                var4.field558 = var3.field2636;
                Statics.method59(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("gw.ai(ILhf;ZI)V")
    public static void method3445(int arg0, class214 arg1, boolean arg2) {
        class27 var3 = client.method3177().method5900(arg0);
        int var4 = Statics.field2530.field618;
        int var5 = (Statics.field2530.field930 >> 7) + Statics.field1961;
        int var6 = (Statics.field2530.field933 >> 7) + Statics.field1108;
        class214 var7 = new class214(var4, var5, var6);
        client.method3177().method5888(var3, var7, arg1, arg2);
    }
}
