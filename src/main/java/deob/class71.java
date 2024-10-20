package deob;

import java.util.Calendar;

@ObfuscatedName("bz")
public class class71 {

    @ObfuscatedName("bz.g")
    public static int[] field1053 = new int[5];

    @ObfuscatedName("bz.i")
    public static int[][] field1054 = new int[5][5000];

    @ObfuscatedName("bz.h")
    public static int[] field1056 = new int[1000];

    @ObfuscatedName("bz.d")
    public static String[] field1057 = new String[1000];

    @ObfuscatedName("bz.s")
    public static int field1058 = 0;

    @ObfuscatedName("bz.k")
    public static class52[] field1059 = new class52[50];

    @ObfuscatedName("bz.n")
    public static Calendar field1060 = Calendar.getInstance();

    @ObfuscatedName("bz.t")
    public static final String[] field1061 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bz.x")
    public static boolean field1063 = false;

    @ObfuscatedName("bz.b")
    public static boolean field1051 = false;

    @ObfuscatedName("bz.w")
    public static int field1064 = 0;

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.c(Lbt;B)V")
    public static void method3130(class58 arg0) {
        Statics.method623(arg0, 500000);
    }

    @ObfuscatedName("it.m(ILcb;ZI)I")
    public static int method4181(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1065 -= 3;
            int var3 = field1056[Statics.field1065];
            int var4 = field1056[Statics.field1065 + 1];
            int var5 = field1056[Statics.field1065 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class233 var6 = class233.method575(var3);
            if (var6.field2756 == null) {
                var6.field2756 = new class233[var5 + 1];
            }
            if (var6.field2756.length <= var5) {
                class233[] var7 = new class233[var5 + 1];
                for (int var8 = 0; var8 < var6.field2756.length; var8++) {
                    var7[var8] = var6.field2756[var8];
                }
                var6.field2756 = var7;
            }
            if (var5 > 0 && var6.field2756[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class233 var9 = new class233();
            var9.field2620 = var4;
            var9.field2737 = var9.field2631 = var6.field2631;
            var9.field2632 = var5;
            var9.field2710 = true;
            var6.field2756[var5] = var9;
            if (arg2) {
                Statics.field2581 = var9;
            } else {
                Statics.field3821 = var9;
            }
            client.method481(var6);
            return 1;
        } else if (arg0 == 101) {
            class233 var10 = arg2 ? Statics.field2581 : Statics.field3821;
            class233 var11 = class233.method575(var10.field2631);
            var11.field2756[var10.field2632] = null;
            client.method481(var11);
            return 1;
        } else if (arg0 == 102) {
            class233 var12 = class233.method575(field1056[--Statics.field1065]);
            var12.field2756 = null;
            client.method481(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1065 -= 2;
            int var13 = field1056[Statics.field1065];
            int var14 = field1056[Statics.field1065 + 1];
            class233 var15 = class233.method3154(var13, var14);
            if (var15 == null || var14 == -1) {
                field1056[++Statics.field1065 - 1] = 0;
            } else {
                field1056[++Statics.field1065 - 1] = 1;
                if (arg2) {
                    Statics.field2581 = var15;
                } else {
                    Statics.field3821 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class233 var16 = class233.method575(field1056[--Statics.field1065]);
            if (var16 == null) {
                field1056[++Statics.field1065 - 1] = 0;
            } else {
                field1056[++Statics.field1065 - 1] = 1;
                if (arg2) {
                    Statics.field2581 = var16;
                } else {
                    Statics.field3821 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("il.j(ILcb;ZI)I")
    public static int method4395(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1056[--Statics.field1065];
            var4 = class233.method575(var3);
        } else {
            var4 = arg2 ? Statics.field2581 : Statics.field3821;
        }
        if (arg0 == 1000) {
            Statics.field1065 -= 4;
            var4.field2640 = field1056[Statics.field1065];
            var4.field2752 = field1056[Statics.field1065 + 1];
            var4.field2636 = field1056[Statics.field1065 + 2];
            var4.field2637 = field1056[Statics.field1065 + 3];
            client.method481(var4);
            Statics.field3184.method1135(var4);
            if (var3 != -1 && var4.field2620 == 0) {
                client.method2957(Statics.field2622[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1065 -= 4;
            var4.field2642 = field1056[Statics.field1065];
            var4.field2643 = field1056[Statics.field1065 + 1];
            var4.field2638 = field1056[Statics.field1065 + 2];
            var4.field2639 = field1056[Statics.field1065 + 3];
            client.method481(var4);
            Statics.field3184.method1135(var4);
            if (var3 != -1 && var4.field2620 == 0) {
                client.method2957(Statics.field2622[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1056[--Statics.field1065] == 1;
            if (var4.field2651 != var5) {
                var4.field2651 = var5;
                client.method481(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2765 = field1056[--Statics.field1065] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2733 = field1056[--Statics.field1065] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bb.g(ILcb;ZI)I")
    public static int method1067(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1056[--Statics.field1065];
            var4 = class233.method575(var3);
        } else {
            var4 = arg2 ? Statics.field2581 : Statics.field3821;
        }
        if (arg0 == 1100) {
            Statics.field1065 -= 2;
            var4.field2712 = field1056[Statics.field1065];
            if (var4.field2712 > var4.field2709 - var4.field2691) {
                var4.field2712 = var4.field2709 - var4.field2691;
            }
            if (var4.field2712 < 0) {
                var4.field2712 = 0;
            }
            var4.field2653 = field1056[Statics.field1065 + 1];
            if (var4.field2653 > var4.field2708 - var4.field2740) {
                var4.field2653 = var4.field2708 - var4.field2740;
            }
            if (var4.field2653 < 0) {
                var4.field2653 = 0;
            }
            client.method481(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2656 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2660 = field1056[--Statics.field1065] == 1;
            client.method481(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2703 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2664 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2666 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2668 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2716 = field1056[--Statics.field1065] == 1;
            client.method481(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2674 = 1;
            var4.field2675 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1065 -= 6;
            var4.field2722 = field1056[Statics.field1065];
            var4.field2681 = field1056[Statics.field1065 + 1];
            var4.field2682 = field1056[Statics.field1065 + 2];
            var4.field2683 = field1056[Statics.field1065 + 3];
            var4.field2684 = field1056[Statics.field1065 + 4];
            var4.field2758 = field1056[Statics.field1065 + 5];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1056[--Statics.field1065];
            if (var4.field2678 != var5) {
                var4.field2678 = var5;
                var4.field2754 = 0;
                var4.field2654 = 0;
                client.method481(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2688 = field1056[--Statics.field1065] == 1;
            client.method481(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1057[--Statics.field2334];
            if (!var6.equals(var4.field2692)) {
                var4.field2692 = var6;
                client.method481(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2635 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1065 -= 3;
            var4.field2727 = field1056[Statics.field1065];
            var4.field2701 = field1056[Statics.field1065 + 1];
            var4.field2689 = field1056[Statics.field1065 + 2];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2680 = field1056[--Statics.field1065] == 1;
            client.method481(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2697 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2671 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2672 = field1056[--Statics.field1065] == 1;
            client.method481(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2673 = field1056[--Statics.field1065] == 1;
            client.method481(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1065 -= 2;
            var4.field2709 = field1056[Statics.field1065];
            var4.field2708 = field1056[Statics.field1065 + 1];
            client.method481(var4);
            if (var3 != -1 && var4.field2620 == 0) {
                client.method2957(Statics.field2622[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method621(var4.field2631, var4.field2632);
            client.field806 = var4;
            client.method481(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2667 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2657 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2663 = field1056[--Statics.field1065];
            client.method481(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1056[--Statics.field1065];
            class322 var8 = (class322) class180.method3951(class322.method1072(), var7);
            if (var8 != null) {
                var4.field2661 = var8;
                client.method481(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1056[--Statics.field1065] == 1;
            var4.field2665 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1056[--Statics.field1065] == 1;
            var4.field2739 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hb.i(ILcb;ZI)I")
    public static int method3956(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method575(field1056[--Statics.field1065]);
        } else {
            var3 = arg2 ? Statics.field2581 : Statics.field3821;
        }
        client.method481(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1065 -= 2;
            int var4 = field1056[Statics.field1065];
            int var5 = field1056[Statics.field1065 + 1];
            var3.field2695 = var4;
            var3.field2753 = var5;
            class272 var6 = class272.method1730(var4);
            var3.field2682 = var6.field3495;
            var3.field2683 = var6.field3488;
            var3.field2684 = var6.field3472;
            var3.field2722 = var6.field3477;
            var3.field2681 = var6.field3490;
            var3.field2758 = var6.field3485;
            if (arg0 == 1205) {
                var3.field2690 = 0;
            } else if (arg0 == 1212 | var6.field3512 == 1) {
                var3.field2690 = 1;
            } else {
                var3.field2690 = 2;
            }
            if (var3.field2686 > 0) {
                var3.field2758 = var3.field2758 * 32 / var3.field2686;
            } else if (var3.field2642 > 0) {
                var3.field2758 = var3.field2758 * 32 / var3.field2642;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2674 = 2;
            var3.field2675 = field1056[--Statics.field1065];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2674 = 3;
            var3.field2675 = Statics.field241.field624.method4056();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("a.h(ILcb;ZI)I")
    public static int method293(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method575(field1056[--Statics.field1065]);
        } else {
            var3 = arg2 ? Statics.field2581 : Statics.field3821;
        }
        if (arg0 == 1300) {
            int var4 = field1056[--Statics.field1065] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4116(var4, field1057[--Statics.field2334]);
                return 1;
            } else {
                Statics.field2334--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1065 -= 2;
            int var5 = field1056[Statics.field1065];
            int var6 = field1056[Statics.field1065 + 1];
            var3.field2707 = class233.method3154(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2685 = field1056[--Statics.field1065] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2644 = field1056[--Statics.field1065];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2721 = field1056[--Statics.field1065];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2705 = field1057[--Statics.field2334];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2711 = field1057[--Statics.field2334];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2706 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gh.l(ILcb;ZI)I")
    public static int method3489(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method575(field1056[--Statics.field1065]);
        } else {
            var3 = arg2 ? Statics.field2581 : Statics.field3821;
        }
        String var4 = field1057[--Statics.field2334];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1056[--Statics.field1065];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1056[--Statics.field1065];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1057[--Statics.field2334];
            } else {
                var7[var8] = Integer.valueOf(field1056[--Statics.field1065]);
            }
        }
        int var9 = field1056[--Statics.field1065];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2714 = var7;
        } else if (arg0 == 1401) {
            var3.field2717 = var7;
        } else if (arg0 == 1402) {
            var3.field2738 = var7;
        } else if (arg0 == 1403) {
            var3.field2658 = var7;
        } else if (arg0 == 1404) {
            var3.field2720 = var7;
        } else if (arg0 == 1405) {
            var3.field2728 = var7;
        } else if (arg0 == 1406) {
            var3.field2724 = var7;
        } else if (arg0 == 1407) {
            var3.field2725 = var7;
            var3.field2726 = var5;
        } else if (arg0 == 1408) {
            var3.field2704 = var7;
        } else if (arg0 == 1409) {
            var3.field2732 = var7;
        } else if (arg0 == 1410) {
            var3.field2633 = var7;
        } else if (arg0 == 1411) {
            var3.field2715 = var7;
        } else if (arg0 == 1412) {
            var3.field2719 = var7;
        } else if (arg0 == 1414) {
            var3.field2655 = var7;
            var3.field2647 = var5;
        } else if (arg0 == 1415) {
            var3.field2729 = var7;
            var3.field2629 = var5;
        } else if (arg0 == 1416) {
            var3.field2723 = var7;
        } else if (arg0 == 1417) {
            var3.field2626 = var7;
        } else if (arg0 == 1418) {
            var3.field2734 = var7;
        } else if (arg0 == 1419) {
            var3.field2735 = var7;
        } else if (arg0 == 1420) {
            var3.field2736 = var7;
        } else if (arg0 == 1421) {
            var3.field2621 = var7;
        } else if (arg0 == 1422) {
            var3.field2670 = var7;
        } else if (arg0 == 1423) {
            var3.field2652 = var7;
        } else if (arg0 == 1424) {
            var3.field2662 = var7;
        } else if (arg0 == 1425) {
            var3.field2742 = var7;
        } else if (arg0 == 1426) {
            var3.field2743 = var7;
        } else if (arg0 == 1427) {
            var3.field2741 = var7;
        } else {
            return 2;
        }
        var3.field2677 = true;
        return 1;
    }

    @ObfuscatedName("bp.o(ILcb;ZI)I")
    public static int method1025(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field2581 : Statics.field3821;
        if (arg0 == 1600) {
            field1056[++Statics.field1065 - 1] = var3.field2712;
            return 1;
        } else if (arg0 == 1601) {
            field1056[++Statics.field1065 - 1] = var3.field2653;
            return 1;
        } else if (arg0 == 1602) {
            field1057[++Statics.field2334 - 1] = var3.field2692;
            return 1;
        } else if (arg0 == 1603) {
            field1056[++Statics.field1065 - 1] = var3.field2709;
            return 1;
        } else if (arg0 == 1604) {
            field1056[++Statics.field1065 - 1] = var3.field2708;
            return 1;
        } else if (arg0 == 1605) {
            field1056[++Statics.field1065 - 1] = var3.field2758;
            return 1;
        } else if (arg0 == 1606) {
            field1056[++Statics.field1065 - 1] = var3.field2682;
            return 1;
        } else if (arg0 == 1607) {
            field1056[++Statics.field1065 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 1608) {
            field1056[++Statics.field1065 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 1609) {
            field1056[++Statics.field1065 - 1] = var3.field2703;
            return 1;
        } else if (arg0 == 1610) {
            field1056[++Statics.field1065 - 1] = var3.field2663;
            return 1;
        } else if (arg0 == 1611) {
            field1056[++Statics.field1065 - 1] = var3.field2656;
            return 1;
        } else if (arg0 == 1612) {
            field1056[++Statics.field1065 - 1] = var3.field2657;
            return 1;
        } else if (arg0 == 1613) {
            field1056[++Statics.field1065 - 1] = var3.field2661.method165();
            return 1;
        } else if (arg0 == 1614) {
            field1056[++Statics.field1065 - 1] = var3.field2739 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ae.k(ILcb;ZB)I")
    public static int method921(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field2581 : Statics.field3821;
        if (arg0 == 1700) {
            field1056[++Statics.field1065 - 1] = var3.field2695;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2695 == -1) {
                field1056[++Statics.field1065 - 1] = 0;
            } else {
                field1056[++Statics.field1065 - 1] = var3.field2753;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1056[++Statics.field1065 - 1] = var3.field2632;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hp.v(ILcb;ZB)I")
    public static int method4086(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field2581 : Statics.field3821;
        if (arg0 == 1800) {
            int[] var4 = field1056;
            int var5 = ++Statics.field1065 - 1;
            int var6 = client.method5092(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 1801) {
            int var8 = field1056[--Statics.field1065];
            int var9 = var8 - 1;
            if (var3.field2706 == null || var9 >= var3.field2706.length || var3.field2706[var9] == null) {
                field1057[++Statics.field2334 - 1] = "";
            } else {
                field1057[++Statics.field2334 - 1] = var3.field2706[var9];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2705 == null) {
                field1057[++Statics.field2334 - 1] = "";
            } else {
                field1057[++Statics.field2334 - 1] = var3.field2705;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.p(ILcb;ZS)I")
    public static int method1831(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method575(field1056[--Statics.field1065]);
        } else {
            var3 = arg2 ? Statics.field2581 : Statics.field3821;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1064 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2741 == null) {
            return 0;
        } else {
            class58 var4 = new class58();
            var4.field562 = var3;
            var4.field574 = var3.field2741;
            var4.field560 = field1064 + 1;
            client.field839.method3740(var4);
            return 1;
        }
    }

    @ObfuscatedName("ci.n(ILcb;ZI)I")
    public static int method1721(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method575(field1056[--Statics.field1065]);
        if (arg0 == 2600) {
            field1056[++Statics.field1065 - 1] = var3.field2712;
            return 1;
        } else if (arg0 == 2601) {
            field1056[++Statics.field1065 - 1] = var3.field2653;
            return 1;
        } else if (arg0 == 2602) {
            field1057[++Statics.field2334 - 1] = var3.field2692;
            return 1;
        } else if (arg0 == 2603) {
            field1056[++Statics.field1065 - 1] = var3.field2709;
            return 1;
        } else if (arg0 == 2604) {
            field1056[++Statics.field1065 - 1] = var3.field2708;
            return 1;
        } else if (arg0 == 2605) {
            field1056[++Statics.field1065 - 1] = var3.field2758;
            return 1;
        } else if (arg0 == 2606) {
            field1056[++Statics.field1065 - 1] = var3.field2682;
            return 1;
        } else if (arg0 == 2607) {
            field1056[++Statics.field1065 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 2608) {
            field1056[++Statics.field1065 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 2609) {
            field1056[++Statics.field1065 - 1] = var3.field2703;
            return 1;
        } else if (arg0 == 2610) {
            field1056[++Statics.field1065 - 1] = var3.field2663;
            return 1;
        } else if (arg0 == 2611) {
            field1056[++Statics.field1065 - 1] = var3.field2656;
            return 1;
        } else if (arg0 == 2612) {
            field1056[++Statics.field1065 - 1] = var3.field2657;
            return 1;
        } else if (arg0 == 2613) {
            field1056[++Statics.field1065 - 1] = var3.field2661.method165();
            return 1;
        } else if (arg0 == 2614) {
            field1056[++Statics.field1065 - 1] = var3.field2739 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.t(ILcb;ZI)I")
    public static int method1475(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1057[--Statics.field2334];
            class86.method1671(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1065 -= 2;
            client.method891(Statics.field241, field1056[Statics.field1065], field1056[Statics.field1065 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1051) {
                field1063 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1057[--Statics.field2334];
            int var5 = 0;
            if (class308.method954(var4)) {
                int var6 = class308.method3843(var4, 10, true);
                var5 = var6;
            }
            class175 var7 = class175.method948(class172.field2258, client.field689.field1278);
            var7.field2308.method3230(var5);
            client.field689.method1848(var7);
            return 1;
        } else if (arg0 == 3105) {
            String var8 = field1057[--Statics.field2334];
            class175 var9 = class175.method948(class172.field2190, client.field689.field1278);
            var9.field2308.method3227(var8.length() + 1);
            var9.field2308.method3234(var8);
            client.field689.method1848(var9);
            return 1;
        } else if (arg0 == 3106) {
            String var10 = field1057[--Statics.field2334];
            class175 var11 = class175.method948(class172.field2218, client.field689.field1278);
            var11.field2308.method3227(var10.length() + 1);
            var11.field2308.method3234(var10);
            client.field689.method1848(var11);
            return 1;
        } else if (arg0 == 3107) {
            int var12 = field1056[--Statics.field1065];
            String var13 = field1057[--Statics.field2334];
            int var14 = class84.field1212;
            int[] var15 = class84.field1211;
            boolean var16 = false;
            class294 var17 = new class294(var13, Statics.field252);
            for (int var18 = 0; var18 < var14; var18++) {
                class62 var19 = client.field758[var15[var18]];
                if (var19 != null && Statics.field241 != var19 && var19.field633 != null && var19.field633.equals(var17)) {
                    if (var12 == 1) {
                        class175 var20 = class175.method948(class172.field2242, client.field689.field1278);
                        var20.field2308.method3269(0);
                        var20.field2308.method3235(var15[var18]);
                        client.field689.method1848(var20);
                    } else if (var12 == 4) {
                        class175 var21 = class175.method948(class172.field2281, client.field689.field1278);
                        var21.field2308.method3269(0);
                        var21.field2308.method3383(var15[var18]);
                        client.field689.method1848(var21);
                    } else if (var12 == 6) {
                        class175 var22 = class175.method948(class172.field2266, client.field689.field1278);
                        var22.field2308.method3339(var15[var18]);
                        var22.field2308.method3268(0);
                        client.field689.method1848(var22);
                    } else if (var12 == 7) {
                        class175 var23 = class175.method948(class172.field2234, client.field689.field1278);
                        var23.field2308.method3227(0);
                        var23.field2308.method3235(var15[var18]);
                        client.field689.method1848(var23);
                    }
                    var16 = true;
                    break;
                }
            }
            if (!var16) {
                class86.method1671(4, "", class240.field2976 + var13);
            }
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1065 -= 3;
            int var24 = field1056[Statics.field1065];
            int var25 = field1056[Statics.field1065 + 1];
            int var26 = field1056[Statics.field1065 + 2];
            class233 var27 = class233.method575(var26);
            client.method483(var27, var24, var25);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1065 -= 2;
            int var28 = field1056[Statics.field1065];
            int var29 = field1056[Statics.field1065 + 1];
            class233 var30 = arg2 ? Statics.field2581 : Statics.field3821;
            client.method483(var30, var28, var29);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1393 = field1056[--Statics.field1065] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1056[++Statics.field1065 - 1] = Statics.field580.field1017 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field580.field1017 = field1056[--Statics.field1065] == 1;
            class68.method1080();
            return 1;
        } else if (arg0 == 3113) {
            String var31 = field1057[--Statics.field2334];
            boolean var32 = field1056[--Statics.field1065] == 1;
            class46.method3140(var31, var32, false);
            return 1;
        } else if (arg0 == 3115) {
            int var33 = field1056[--Statics.field1065];
            class175 var34 = class175.method948(class172.field2221, client.field689.field1278);
            var34.field2308.method3383(var33);
            client.field689.method1848(var34);
            return 1;
        } else if (arg0 == 3116) {
            int var35 = field1056[--Statics.field1065];
            Statics.field2334 -= 2;
            String var36 = field1057[Statics.field2334];
            String var37 = field1057[Statics.field2334 + 1];
            if (var36.length() > 500) {
                return 1;
            } else if (var37.length() > 500) {
                return 1;
            } else {
                class175 var38 = class175.method948(class172.field2235, client.field689.field1278);
                var38.field2308.method3383(1 + class185.method1686(var36) + class185.method1686(var37));
                var38.field2308.method3270(var35);
                var38.field2308.method3234(var36);
                var38.field2308.method3234(var37);
                client.field689.method1848(var38);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field788 = field1056[--Statics.field1065] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field759 = field1056[--Statics.field1065] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field687 = field1056[--Statics.field1065] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1056[--Statics.field1065] == 1) {
                client.field667 |= 0x1;
            } else {
                client.field667 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1056[--Statics.field1065] == 1) {
                client.field667 |= 0x2;
            } else {
                client.field667 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1056[--Statics.field1065] == 1) {
                client.field667 |= 0x4;
            } else {
                client.field667 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1056[--Statics.field1065] == 1) {
                client.field667 |= 0x8;
            } else {
                client.field667 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field667 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field739 = field1056[--Statics.field1065] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field753 = field1056[--Statics.field1065] == 1;
            return 1;
        } else if (arg0 == 3127) {
            boolean var39 = field1056[--Statics.field1065] == 1;
            client.field789 = var39;
            return 1;
        } else if (arg0 == 3128) {
            int[] var40 = field1056;
            int var41 = ++Statics.field1065 - 1;
            boolean var42 = client.field789;
            var40[var41] = var42 ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1065 -= 2;
            client.field756 = field1056[Statics.field1065];
            client.field671 = field1056[Statics.field1065 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1065 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1065--;
            return 1;
        } else if (arg0 == 3132) {
            field1056[++Statics.field1065 - 1] = Statics.field1983;
            field1056[++Statics.field1065 - 1] = Statics.field42;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1065--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1065 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            boolean var43 = field1056[--Statics.field1065] == 1;
            Statics.field580.field1022 = var43;
            class68.method1080();
            return 1;
        } else if (arg0 == 3137) {
            field1056[++Statics.field1065 - 1] = Statics.field580.field1022 ? 1 : 0;
            return 1;
        } else if (arg0 == 3138) {
            boolean var44 = field1056[--Statics.field1065] == 1;
            client.field681 = var44;
            if (!var44) {
                Statics.field580.field1016 = "";
                class68.method1080();
            }
            return 1;
        } else if (arg0 == 3139) {
            field1056[++Statics.field1065 - 1] = client.field681 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.r(ILcb;ZI)I")
    public static int method959(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1065 -= 3;
            int var3 = field1056[Statics.field1065];
            int var4 = field1056[Statics.field1065 + 1];
            int var5 = field1056[Statics.field1065 + 2];
            if (client.field797 != 0 && var4 != 0 && client.field677 < 50) {
                client.field879[client.field677] = var3;
                client.field880[client.field677] = var4;
                client.field881[client.field677] = var5;
                client.field883[client.field677] = null;
                client.field769[client.field677] = 0;
                client.field677++;
            }
            return 1;
        } else if (arg0 == 3201) {
            int var6 = field1056[--Statics.field1065];
            if (var6 == -1 && !client.field875) {
                Statics.field1971.method3852();
                class220.field2500 = 1;
                Statics.field1392 = null;
            } else if (var6 != -1 && client.field874 != var6 && client.field822 != 0 && !client.field875) {
                class220.method2873(2, Statics.field3168, var6, 0, client.field822, false);
            }
            client.field874 = var6;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1065 -= 2;
            int var7 = field1056[Statics.field1065];
            int var8 = field1056[Statics.field1065 + 1];
            if (client.field822 != 0 && var7 != -1) {
                class220.method88(Statics.field2820, var7, 0, client.field822, false);
                client.field875 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fe.x(ILcb;ZI)I")
    public static int method3207(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field40.field1030 == 0) {
                field1056[++Statics.field1065 - 1] = -2;
            } else if (Statics.field40.field1030 == 1) {
                field1056[++Statics.field1065 - 1] = -1;
            } else {
                field1056[++Statics.field1065 - 1] = Statics.field40.field1025.method4970();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1056[--Statics.field1065];
            if (Statics.field40.method1517() && var3 >= 0 && var3 < Statics.field40.field1025.method4970()) {
                class295 var4 = (class295) Statics.field40.field1025.method4980(var3);
                field1057[++Statics.field2334 - 1] = var4.method4934();
                field1057[++Statics.field2334 - 1] = var4.method4949();
            } else {
                field1057[++Statics.field2334 - 1] = "";
                field1057[++Statics.field2334 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1056[--Statics.field1065];
            if (Statics.field40.method1517() && var5 >= 0 && var5 < Statics.field40.field1025.method4970()) {
                field1056[++Statics.field1065 - 1] = ((class290) Statics.field40.field1025.method4980(var5)).field3679;
            } else {
                field1056[++Statics.field1065 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1056[--Statics.field1065];
            if (Statics.field40.method1517() && var6 >= 0 && var6 < Statics.field40.field1025.method4970()) {
                field1056[++Statics.field1065 - 1] = ((class290) Statics.field40.field1025.method4980(var6)).field3677;
            } else {
                field1056[++Statics.field1065 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1057[--Statics.field2334];
            int var8 = field1056[--Statics.field1065];
            class175 var9 = class175.method948(class172.field2207, client.field689.field1278);
            var9.field2308.method3227(class185.method1686(var7) + 1);
            var9.field2308.method3234(var7);
            var9.field2308.method3227(var8);
            client.field689.method1848(var9);
            return 1;
        } else if (arg0 == 3605) {
            String var10 = field1057[--Statics.field2334];
            Statics.field40.method1524(var10);
            return 1;
        } else if (arg0 == 3606) {
            String var11 = field1057[--Statics.field2334];
            Statics.field40.method1546(var11);
            return 1;
        } else if (arg0 == 3607) {
            String var12 = field1057[--Statics.field2334];
            Statics.field40.method1526(var12);
            return 1;
        } else if (arg0 == 3608) {
            String var13 = field1057[--Statics.field2334];
            Statics.field40.method1545(var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field1057[--Statics.field2334];
            String var15 = client.method3842(var14);
            field1056[++Statics.field1065 - 1] = Statics.field40.method1522(new class294(var15, Statics.field252), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field928 == null) {
                field1057[++Statics.field2334 - 1] = "";
            } else {
                field1057[++Statics.field2334 - 1] = Statics.field928.field3696;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field928 == null) {
                field1056[++Statics.field1065 - 1] = 0;
            } else {
                field1056[++Statics.field1065 - 1] = Statics.field928.method4970();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field1056[--Statics.field1065];
            if (Statics.field928 == null || var16 >= Statics.field928.method4970()) {
                field1057[++Statics.field2334 - 1] = "";
            } else {
                field1057[++Statics.field2334 - 1] = Statics.field928.method4980(var16).method4943().method5075();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field1056[--Statics.field1065];
            if (Statics.field928 == null || var17 >= Statics.field928.method4970()) {
                field1056[++Statics.field1065 - 1] = 0;
            } else {
                field1056[++Statics.field1065 - 1] = ((class290) Statics.field928.method4980(var17)).method5055();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field1056[--Statics.field1065];
            if (Statics.field928 == null || var18 >= Statics.field928.method4970()) {
                field1056[++Statics.field1065 - 1] = 0;
            } else {
                field1056[++Statics.field1065 - 1] = ((class290) Statics.field928.method4980(var18)).field3677;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1056[++Statics.field1065 - 1] = Statics.field928 == null ? 0 : Statics.field928.field3701;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field1057[--Statics.field2334];
            if (Statics.field928 != null) {
                class175 var20 = class175.method948(class172.field2222, client.field689.field1278);
                var20.field2308.method3227(class185.method1686(var19));
                var20.field2308.method3234(var19);
                client.field689.method1848(var20);
            }
            return 1;
        } else if (arg0 == 3618) {
            field1056[++Statics.field1065 - 1] = Statics.field928 == null ? 0 : Statics.field928.field3702;
            return 1;
        } else if (arg0 == 3619) {
            String var21 = field1057[--Statics.field2334];
            if (!var21.equals("")) {
                class175 var22 = class175.method948(class172.field2259, client.field689.field1278);
                var22.field2308.method3227(class185.method1686(var21));
                var22.field2308.method3234(var21);
                client.field689.method1848(var22);
            }
            return 1;
        } else if (arg0 == 3620) {
            client.method3039();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field40.method1517()) {
                field1056[++Statics.field1065 - 1] = Statics.field40.field1029.method4970();
            } else {
                field1056[++Statics.field1065 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var23 = field1056[--Statics.field1065];
            if (Statics.field40.method1517() && var23 >= 0 && var23 < Statics.field40.field1029.method4970()) {
                class289 var24 = (class289) Statics.field40.field1029.method4980(var23);
                field1057[++Statics.field2334 - 1] = var24.method4934();
                field1057[++Statics.field2334 - 1] = var24.method4949();
            } else {
                field1057[++Statics.field2334 - 1] = "";
                field1057[++Statics.field2334 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var25 = field1057[--Statics.field2334];
            String var26 = client.method3842(var25);
            field1056[++Statics.field1065 - 1] = Statics.field40.method1528(new class294(var26, Statics.field252)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var27 = field1056[--Statics.field1065];
            if (Statics.field928 == null || var27 >= Statics.field928.method4970() || !Statics.field928.method4980(var27).method4943().equals(Statics.field241.field633)) {
                field1056[++Statics.field1065 - 1] = 0;
            } else {
                field1056[++Statics.field1065 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field928 == null || Statics.field928.field3703 == null) {
                field1057[++Statics.field2334 - 1] = "";
            } else {
                field1057[++Statics.field2334 - 1] = Statics.field928.field3703;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var28 = field1056[--Statics.field1065];
            if (Statics.field928 == null || var28 >= Statics.field928.method4970() || !((class284) Statics.field928.method4980(var28)).method4921()) {
                field1056[++Statics.field1065 - 1] = 0;
            } else {
                field1056[++Statics.field1065 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var29 = field1056[--Statics.field1065];
            if (Statics.field928 == null || var29 >= Statics.field928.method4970() || !((class284) Statics.field928.method4980(var29)).method4924()) {
                field1056[++Statics.field1065 - 1] = 0;
            } else {
                field1056[++Statics.field1065 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field40.field1025.method5033();
            return 1;
        } else if (arg0 == 3629) {
            boolean var30 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1025.method4990(new class314(var30));
            return 1;
        } else if (arg0 == 3630) {
            boolean var31 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1025.method4990(new class315(var31));
            return 1;
        } else if (arg0 == 3631) {
            boolean var32 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1025.method4990(new class146(var32));
            return 1;
        } else if (arg0 == 3632) {
            boolean var33 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1025.method4990(new class140(var33));
            return 1;
        } else if (arg0 == 3633) {
            boolean var34 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1025.method4990(new class145(var34));
            return 1;
        } else if (arg0 == 3634) {
            boolean var35 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1025.method4990(new class148(var35));
            return 1;
        } else if (arg0 == 3635) {
            boolean var36 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1025.method4990(new class144(var36));
            return 1;
        } else if (arg0 == 3636) {
            boolean var37 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1025.method4990(new class142(var37));
            return 1;
        } else if (arg0 == 3637) {
            boolean var38 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1025.method4990(new class141(var38));
            return 1;
        } else if (arg0 == 3638) {
            boolean var39 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1025.method4990(new class143(var39));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field40.field1025.method4981();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field40.field1029.method5033();
            return 1;
        } else if (arg0 == 3641) {
            boolean var40 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1029.method4990(new class314(var40));
            return 1;
        } else if (arg0 == 3642) {
            boolean var41 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1029.method4990(new class315(var41));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field40.field1029.method4981();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field928 != null) {
                Statics.field928.method5033();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var42 = field1056[--Statics.field1065] == 1;
            if (Statics.field928 != null) {
                Statics.field928.method4990(new class314(var42));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var43 = field1056[--Statics.field1065] == 1;
            if (Statics.field928 != null) {
                Statics.field928.method4990(new class315(var43));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var44 = field1056[--Statics.field1065] == 1;
            if (Statics.field928 != null) {
                Statics.field928.method4990(new class146(var44));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var45 = field1056[--Statics.field1065] == 1;
            if (Statics.field928 != null) {
                Statics.field928.method4990(new class140(var45));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var46 = field1056[--Statics.field1065] == 1;
            if (Statics.field928 != null) {
                Statics.field928.method4990(new class145(var46));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var47 = field1056[--Statics.field1065] == 1;
            if (Statics.field928 != null) {
                Statics.field928.method4990(new class148(var47));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var48 = field1056[--Statics.field1065] == 1;
            if (Statics.field928 != null) {
                Statics.field928.method4990(new class144(var48));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var49 = field1056[--Statics.field1065] == 1;
            if (Statics.field928 != null) {
                Statics.field928.method4990(new class142(var49));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var50 = field1056[--Statics.field1065] == 1;
            if (Statics.field928 != null) {
                Statics.field928.method4990(new class141(var50));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var51 = field1056[--Statics.field1065] == 1;
            if (Statics.field928 != null) {
                Statics.field928.method4990(new class143(var51));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field928 != null) {
                Statics.field928.method4981();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var52 = field1056[--Statics.field1065] == 1;
            Statics.field40.field1025.method4990(new class147(var52));
            return 1;
        } else if (arg0 == 3657) {
            boolean var53 = field1056[--Statics.field1065] == 1;
            if (Statics.field928 != null) {
                Statics.field928.method4990(new class147(var53));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.b(ILcb;ZI)I")
    public static int method1009(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1056[--Statics.field1065];
            field1056[++Statics.field1065 - 1] = client.field907[var3].method52();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1056[--Statics.field1065];
            field1056[++Statics.field1065 - 1] = client.field907[var4].field27;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1056[--Statics.field1065];
            field1056[++Statics.field1065 - 1] = client.field907[var5].field28;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1056[--Statics.field1065];
            field1056[++Statics.field1065 - 1] = client.field907[var6].field29;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1056[--Statics.field1065];
            field1056[++Statics.field1065 - 1] = client.field907[var7].field30;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1056[--Statics.field1065];
            field1056[++Statics.field1065 - 1] = client.field907[var8].field33;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1056[--Statics.field1065];
            int var10 = client.field907[var9].method49();
            field1056[++Statics.field1065 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1056[--Statics.field1065];
            int var12 = client.field907[var11].method49();
            field1056[++Statics.field1065 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1056[--Statics.field1065];
            int var14 = client.field907[var13].method49();
            field1056[++Statics.field1065 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1056[--Statics.field1065];
            int var16 = client.field907[var15].method49();
            field1056[++Statics.field1065 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1056[--Statics.field1065] == 1;
            if (Statics.field2594 != null) {
                Statics.field2594.method12(class2.field11, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1056[--Statics.field1065] == 1;
            if (Statics.field2594 != null) {
                Statics.field2594.method12(class2.field10, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1065 -= 2;
            boolean var19 = field1056[Statics.field1065] == 1;
            boolean var20 = field1056[Statics.field1065 + 1] == 1;
            if (Statics.field2594 != null) {
                client.field908.field637 = var20;
                Statics.field2594.method12(client.field908, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1056[--Statics.field1065] == 1;
            if (Statics.field2594 != null) {
                Statics.field2594.method12(class2.field9, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1056[--Statics.field1065] == 1;
            if (Statics.field2594 != null) {
                Statics.field2594.method12(class2.field12, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1056[++Statics.field1065 - 1] = Statics.field2594 == null ? 0 : Statics.field2594.field14.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1056[--Statics.field1065];
            class3 var24 = (class3) Statics.field2594.field14.get(var23);
            field1056[++Statics.field1065 - 1] = var24.field20;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1056[--Statics.field1065];
            class3 var26 = (class3) Statics.field2594.field14.get(var25);
            field1057[++Statics.field2334 - 1] = var26.method20();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1056[--Statics.field1065];
            class3 var28 = (class3) Statics.field2594.field14.get(var27);
            field1057[++Statics.field2334 - 1] = var28.method23();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1056[--Statics.field1065];
            class3 var30 = (class3) Statics.field2594.field14.get(var29);
            long var31 = class187.method918() - Statics.field2094 - var30.field15;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1057[++Statics.field2334 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1056[--Statics.field1065];
            class3 var38 = (class3) Statics.field2594.field14.get(var37);
            field1056[++Statics.field1065 - 1] = var38.field17.field29;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1056[--Statics.field1065];
            class3 var40 = (class3) Statics.field2594.field14.get(var39);
            field1056[++Statics.field1065 - 1] = var40.field17.field28;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1056[--Statics.field1065];
            class3 var42 = (class3) Statics.field2594.field14.get(var41);
            field1056[++Statics.field1065 - 1] = var42.field17.field27;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("br.a(ILcb;ZB)I")
    public static int method991(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1056[++Statics.field1065 - 1] = client.method1667();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1056[--Statics.field1065];
            if (var3 == 1 || var3 == 2) {
                client.method1069(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1056[++Statics.field1065 - 1] = Statics.field580.field1020;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1056[--Statics.field1065];
            if (var4 == 1 || var4 == 2) {
                Statics.field580.field1020 = var4;
                class68.method1080();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.z(ILcb;ZB)I")
    public static int method448(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1065 -= 2;
            client.field890 = (short) field1056[Statics.field1065];
            if (client.field890 <= 0) {
                client.field890 = 256;
            }
            client.field772 = (short) field1056[Statics.field1065 + 1];
            if (client.field772 <= 0) {
                client.field772 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1065 -= 2;
            client.field892 = (short) field1056[Statics.field1065];
            if (client.field892 <= 0) {
                client.field892 = 256;
            }
            client.field722 = (short) field1056[Statics.field1065 + 1];
            if (client.field722 <= 0) {
                client.field722 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1065 -= 4;
            client.field912 = (short) field1056[Statics.field1065];
            if (client.field912 <= 0) {
                client.field912 = 1;
            }
            client.field895 = (short) field1056[Statics.field1065 + 1];
            if (client.field895 <= 0) {
                client.field895 = 32767;
            } else if (client.field895 < client.field912) {
                client.field895 = client.field912;
            }
            client.field894 = (short) field1056[Statics.field1065 + 2];
            if (client.field894 <= 0) {
                client.field894 = 1;
            }
            client.field897 = (short) field1056[Statics.field1065 + 3];
            if (client.field897 <= 0) {
                client.field897 = 32767;
            } else if (client.field897 < client.field894) {
                client.field897 = client.field894;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field812 == null) {
                field1056[++Statics.field1065 - 1] = -1;
                field1056[++Statics.field1065 - 1] = -1;
            } else {
                client.method4306(0, 0, client.field812.field2691, client.field812.field2740, false);
                field1056[++Statics.field1065 - 1] = client.field900;
                field1056[++Statics.field1065 - 1] = client.field901;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1056[++Statics.field1065 - 1] = client.field892;
            field1056[++Statics.field1065 - 1] = client.field722;
            return 1;
        } else if (arg0 == 6205) {
            field1056[++Statics.field1065 - 1] = client.field890;
            field1056[++Statics.field1065 - 1] = client.field772;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("v.y(IB)V")
    public static void method130(int arg0) {
        if (arg0 == -1 || !class233.method91(arg0)) {
            return;
        }
        class233[] var1 = Statics.field2622[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3.field2713 != null) {
                class58 var4 = new class58();
                var4.field562 = var3;
                var4.field574 = var3.field2713;
                Statics.method623(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("h.u(ILhr;ZB)V")
    public static void method90(int arg0, class229 arg1, boolean arg2) {
        class21 var3 = client.method4620().method5683(arg0);
        int var4 = Statics.field241.field627;
        int var5 = (Statics.field241.field947 >> 7) + Statics.field31;
        int var6 = (Statics.field241.field960 >> 7) + Statics.field1241;
        class229 var7 = new class229(var4, var5, var6);
        client.method4620().method5672(var3, var7, arg1, arg2);
    }
}
