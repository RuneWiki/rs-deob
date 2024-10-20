package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aj")
public class class35 {

    @ObfuscatedName("aj.w")
    public static int[] field779 = new int[5];

    @ObfuscatedName("aj.d")
    public static int[][] field780 = new int[5][5000];

    @ObfuscatedName("aj.f")
    public static int[] field781 = new int[1000];

    @ObfuscatedName("aj.i")
    public static String[] field778 = new String[1000];

    @ObfuscatedName("aj.a")
    public static int field783 = 0;

    @ObfuscatedName("aj.o")
    public static class14[] field784 = new class14[50];

    @ObfuscatedName("aj.e")
    public static Calendar field782 = Calendar.getInstance();

    @ObfuscatedName("aj.v")
    public static final String[] field786 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("aj.r")
    public static int field790 = 0;

    public class35() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.j(Lj;B)V")
    public static void method26(class1 arg0) {
        method701(arg0, 200000);
    }

    @ObfuscatedName("ag.y(Lj;IB)V")
    public static void method701(class1 arg0, int arg1) {
        Object[] var2 = arg0.field4;
        int var3 = (Integer) var2[0];
        class21 var4 = class21.method2340(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field588;
        int[] var9 = var4.field598;
        byte var10 = -1;
        field783 = 0;
        try {
            Statics.field3071 = new int[var4.field592];
            int var11 = 0;
            Statics.field1975 = new String[var4.field596];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field13;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2807;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2677;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field9 == null ? -1 : arg0.field9.field2807;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field9 == null ? -1 : arg0.field9.field2677;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field2;
                    }
                    Statics.field3071[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field11;
                    }
                    Statics.field1975[var12++] = var15;
                }
            }
            int var16 = 0;
            field790 = arg0.field10;
            label3104: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var452 = var8[var7];
                if (var452 < 100) {
                    if (var452 == 0) {
                        field781[var5++] = var9[var7];
                        continue;
                    }
                    if (var452 == 1) {
                        int var17 = var9[var7];
                        field781[var5++] = class170.field2823[var17];
                        continue;
                    }
                    if (var452 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class170.field2823[var18] = field781[var5];
                        client.method174(var18);
                        continue;
                    }
                    if (var452 == 3) {
                        field778[var6++] = var4.field591[var7];
                        continue;
                    }
                    if (var452 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var452 == 7) {
                        var5 -= 2;
                        if (field781[var5 + 1] != field781[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var452 == 8) {
                        var5 -= 2;
                        if (field781[var5 + 1] == field781[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var452 == 9) {
                        var5 -= 2;
                        if (field781[var5] < field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var452 == 10) {
                        var5 -= 2;
                        if (field781[var5] > field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var452 == 21) {
                        if (field783 == 0) {
                            return;
                        }
                        class14 var19 = field784[--field783];
                        var4 = var19.field213;
                        var8 = var4.field588;
                        var9 = var4.field598;
                        var7 = var19.field211;
                        Statics.field3071 = var19.field212;
                        Statics.field1975 = var19.field218;
                        continue;
                    }
                    if (var452 == 25) {
                        int var20 = var9[var7];
                        field781[var5++] = class170.method2874(var20);
                        continue;
                    }
                    if (var452 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class170.method2901(var21, field781[var5]);
                        continue;
                    }
                    if (var452 == 31) {
                        var5 -= 2;
                        if (field781[var5] <= field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var452 == 32) {
                        var5 -= 2;
                        if (field781[var5] >= field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var452 == 33) {
                        field781[var5++] = Statics.field3071[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var452 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field3071[var10001] = field781[var5];
                        continue;
                    }
                    if (var452 == 35) {
                        field778[var6++] = Statics.field1975[var9[var7]];
                        continue;
                    }
                    if (var452 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1975[var10001] = field778[var6];
                        continue;
                    }
                    if (var452 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class157.method2890(field778, var6, var22);
                        field778[var6++] = var23;
                        continue;
                    }
                    if (var452 == 38) {
                        var5--;
                        continue;
                    }
                    if (var452 == 39) {
                        var6--;
                        continue;
                    }
                    if (var452 == 40) {
                        int var24 = var9[var7];
                        class21 var25 = class21.method2340(var24);
                        int[] var26 = new int[var25.field592];
                        String[] var27 = new String[var25.field596];
                        for (int var28 = 0; var28 < var25.field590; var28++) {
                            var26[var28] = field781[var5 - var25.field590 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field595; var29++) {
                            var27[var29] = field778[var6 - var25.field595 + var29];
                        }
                        var5 -= var25.field590;
                        var6 -= var25.field595;
                        class14 var30 = new class14();
                        var30.field213 = var4;
                        var30.field211 = var7;
                        var30.field212 = Statics.field3071;
                        var30.field218 = Statics.field1975;
                        field784[++field783 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field588;
                        var9 = var25.field598;
                        var7 = -1;
                        Statics.field3071 = var26;
                        Statics.field1975 = var27;
                        continue;
                    }
                    if (var452 == 42) {
                        field781[var5++] = Statics.field15.method200(var9[var7]);
                        continue;
                    }
                    if (var452 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field15.method190(var10001, field781[var5]);
                        continue;
                    }
                    if (var452 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field781[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field779[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label3104;
                                }
                                field780[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var452 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field781[var5];
                        if (var37 >= 0 && var37 < field779[var36]) {
                            field781[var5++] = field780[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var452 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field781[var5];
                        if (var39 >= 0 && var39 < field779[var38]) {
                            field780[var38][var39] = field781[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var452 == 47) {
                        String var40 = Statics.field15.method193(var9[var7]);
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field778[var6++] = var40;
                        continue;
                    }
                    if (var452 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field15.method203(var10001, field778[var6]);
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var452 < 1000) {
                    if (var452 == 100) {
                        var5 -= 3;
                        int var42 = field781[var5];
                        int var43 = field781[var5 + 1];
                        int var44 = field781[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class167 var45 = class167.method1258(var42);
                        if (var45.field2786 == null) {
                            var45.field2786 = new class167[var44 + 1];
                        }
                        if (var45.field2786.length <= var44) {
                            class167[] var46 = new class167[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2786.length; var47++) {
                                var46[var47] = var45.field2786[var47];
                            }
                            var45.field2786 = var46;
                        }
                        if (var44 > 0 && var45.field2786[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class167 var48 = new class167();
                        var48.field2714 = var43;
                        var48.field2782 = var48.field2807 = var45.field2807;
                        var48.field2677 = var44;
                        var48.field2675 = true;
                        var45.field2786[var44] = var48;
                        if (var41) {
                            Statics.field3107 = var48;
                        } else {
                            Statics.field198 = var48;
                        }
                        client.method1085(var45);
                        continue;
                    }
                    if (var452 == 101) {
                        class167 var49 = var41 ? Statics.field3107 : Statics.field198;
                        class167 var50 = class167.method1258(var49.field2807);
                        var50.field2786[var49.field2677] = null;
                        client.method1085(var50);
                        continue;
                    }
                    if (var452 == 102) {
                        var5--;
                        class167 var51 = class167.method1258(field781[var5]);
                        var51.field2786 = null;
                        client.method1085(var51);
                        continue;
                    }
                    if (var452 == 200) {
                        var5 -= 2;
                        int var52 = field781[var5];
                        int var53 = field781[var5 + 1];
                        class167 var54 = class167.method2858(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field781[var5++] = 1;
                            if (var41) {
                                Statics.field3107 = var54;
                            } else {
                                Statics.field198 = var54;
                            }
                            continue;
                        }
                        field781[var5++] = 0;
                        continue;
                    }
                    if (var452 == 201) {
                        var5--;
                        class167 var55 = class167.method1258(field781[var5]);
                        if (var55 == null) {
                            field781[var5++] = 0;
                        } else {
                            field781[var5++] = 1;
                            if (var41) {
                                Statics.field3107 = var55;
                            } else {
                                Statics.field198 = var55;
                            }
                        }
                        continue;
                    }
                } else if (!(var452 < 1000 || var452 >= 1100) || !(var452 < 2000 || var452 >= 2100)) {
                    int var56 = -1;
                    class167 var57;
                    if (var452 >= 2000) {
                        var452 -= 1000;
                        var5--;
                        var56 = field781[var5];
                        var57 = class167.method1258(var56);
                    } else {
                        var57 = var41 ? Statics.field3107 : Statics.field198;
                    }
                    if (var452 == 1000) {
                        var5 -= 4;
                        var57.field2739 = field781[var5];
                        var57.field2686 = field781[var5 + 1];
                        var57.field2681 = field781[var5 + 2];
                        var57.field2671 = field781[var5 + 3];
                        client.method1085(var57);
                        client.method2273(var57);
                        if (var56 != -1 && var57.field2714 == 0) {
                            client.method568(Statics.field1130[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var452 == 1001) {
                        var5 -= 4;
                        var57.field2780 = field781[var5];
                        var57.field2688 = field781[var5 + 1];
                        var57.field2733 = field781[var5 + 2];
                        var57.field2684 = field781[var5 + 3];
                        client.method1085(var57);
                        client.method2273(var57);
                        if (var56 != -1 && var57.field2714 == 0) {
                            client.method568(Statics.field1130[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var452 == 1003) {
                        var5--;
                        boolean var58 = field781[var5] == 1;
                        if (var57.field2696 != var58) {
                            var57.field2696 = var58;
                            client.method1085(var57);
                        }
                        continue;
                    }
                    if (var452 == 1005) {
                        var5--;
                        var57.field2783 = field781[var5] == 1;
                        continue;
                    }
                    if (var452 == 1006) {
                        var5--;
                        var57.field2808 = field781[var5] == 1;
                        continue;
                    }
                } else if (var452 >= 1100 && var452 < 1200 || var452 >= 2100 && var452 < 2200) {
                    int var59 = -1;
                    class167 var60;
                    if (var452 >= 2000) {
                        var452 -= 1000;
                        var5--;
                        var59 = field781[var5];
                        var60 = class167.method1258(var59);
                    } else {
                        var60 = var41 ? Statics.field3107 : Statics.field198;
                    }
                    if (var452 == 1100) {
                        var5 -= 2;
                        var60.field2697 = field781[var5];
                        if (var60.field2697 > var60.field2699 - var60.field2691) {
                            var60.field2697 = var60.field2699 - var60.field2691;
                        }
                        if (var60.field2697 < 0) {
                            var60.field2697 = 0;
                        }
                        var60.field2698 = field781[var5 + 1];
                        if (var60.field2698 > var60.field2700 - var60.field2692) {
                            var60.field2698 = var60.field2700 - var60.field2692;
                        }
                        if (var60.field2698 < 0) {
                            var60.field2698 = 0;
                        }
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1101) {
                        var5--;
                        var60.field2701 = field781[var5];
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1102) {
                        var5--;
                        var60.field2741 = field781[var5] == 1;
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1103) {
                        var5--;
                        var60.field2706 = field781[var5];
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1104) {
                        var5--;
                        var60.field2760 = field781[var5];
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1105) {
                        var5--;
                        var60.field2709 = field781[var5];
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1106) {
                        var5--;
                        var60.field2711 = field781[var5];
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1107) {
                        var5--;
                        var60.field2712 = field781[var5] == 1;
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1108) {
                        var60.field2752 = 1;
                        var5--;
                        var60.field2720 = field781[var5];
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1109) {
                        var5 -= 6;
                        var60.field2723 = field781[var5];
                        var60.field2724 = field781[var5 + 1];
                        var60.field2725 = field781[var5 + 2];
                        var60.field2726 = field781[var5 + 3];
                        var60.field2727 = field781[var5 + 4];
                        var60.field2728 = field781[var5 + 5];
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1110) {
                        var5--;
                        int var61 = field781[var5];
                        if (var60.field2745 != var61) {
                            var60.field2745 = var61;
                            var60.field2796 = 0;
                            var60.field2797 = 0;
                            client.method1085(var60);
                        }
                        continue;
                    }
                    if (var452 == 1111) {
                        var5--;
                        var60.field2731 = field781[var5] == 1;
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1112) {
                        var6--;
                        String var62 = field778[var6];
                        if (!var62.equals(var60.field2708)) {
                            var60.field2708 = var62;
                            client.method1085(var60);
                        }
                        continue;
                    }
                    if (var452 == 1113) {
                        var5--;
                        var60.field2678 = field781[var5];
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1114) {
                        var5 -= 3;
                        var60.field2737 = field781[var5];
                        var60.field2738 = field781[var5 + 1];
                        var60.field2736 = field781[var5 + 2];
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1115) {
                        var5--;
                        var60.field2734 = field781[var5] == 1;
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1116) {
                        var5--;
                        var60.field2690 = field781[var5];
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1117) {
                        var5--;
                        var60.field2803 = field781[var5];
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1118) {
                        var5--;
                        var60.field2715 = field781[var5] == 1;
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1119) {
                        var5--;
                        var60.field2716 = field781[var5] == 1;
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1120) {
                        var5 -= 2;
                        var60.field2699 = field781[var5];
                        var60.field2700 = field781[var5 + 1];
                        client.method1085(var60);
                        if (var59 != -1 && var60.field2714 == 0) {
                            client.method568(Statics.field1130[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var452 == 1121) {
                        int var63 = var60.field2807;
                        int var64 = var60.field2677;
                        client.field342.method2574(198);
                        client.field342.method2310(var63);
                        client.field342.method2367(var64);
                        client.field360 = var60;
                        client.method1085(var60);
                        continue;
                    }
                    if (var452 == 1122) {
                        var5--;
                        var60.field2710 = field781[var5];
                        client.method1085(var60);
                        continue;
                    }
                } else if (var452 >= 1200 && var452 < 1300 || var452 >= 2200 && var452 < 2300) {
                    class167 var65;
                    if (var452 >= 2000) {
                        var452 -= 1000;
                        var5--;
                        var65 = class167.method1258(field781[var5]);
                    } else {
                        var65 = var41 ? Statics.field3107 : Statics.field198;
                    }
                    client.method1085(var65);
                    if (var452 == 1200 || var452 == 1205 || var452 == 1212) {
                        var5 -= 2;
                        int var66 = field781[var5];
                        int var67 = field781[var5 + 1];
                        var65.field2794 = var66;
                        var65.field2795 = var67;
                        class50 var68 = class50.method1088(var66);
                        var65.field2725 = var68.field1123;
                        var65.field2726 = var68.field1096;
                        var65.field2727 = var68.field1095;
                        var65.field2723 = var68.field1099;
                        var65.field2724 = var68.field1097;
                        var65.field2728 = var68.field1092;
                        if (var452 == 1205) {
                            var65.field2732 = 0;
                        } else if (var452 == 1212 | var68.field1102 == 1) {
                            var65.field2732 = 1;
                        } else {
                            var65.field2732 = 2;
                        }
                        if (var65.field2729 > 0) {
                            var65.field2728 = var65.field2728 * 32 / var65.field2729;
                        } else if (var65.field2780 > 0) {
                            var65.field2728 = var65.field2728 * 32 / var65.field2780;
                        }
                        continue;
                    }
                    if (var452 == 1201) {
                        var65.field2752 = 2;
                        var5--;
                        var65.field2720 = field781[var5];
                        continue;
                    }
                    if (var452 == 1202) {
                        var65.field2752 = 3;
                        var65.field2720 = Statics.field143.field39.method3200();
                        continue;
                    }
                } else if (var452 >= 1300 && var452 < 1400 || var452 >= 2300 && var452 < 2400) {
                    class167 var69;
                    if (var452 >= 2000) {
                        var452 -= 1000;
                        var5--;
                        var69 = class167.method1258(field781[var5]);
                    } else {
                        var69 = var41 ? Statics.field3107 : Statics.field198;
                    }
                    if (var452 == 1300) {
                        var5--;
                        int var70 = field781[var5] - 1;
                        if (var70 >= 0 && var70 <= 9) {
                            var6--;
                            var69.method3110(var70, field778[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var452 == 1301) {
                        var5 -= 2;
                        int var71 = field781[var5];
                        int var72 = field781[var5 + 1];
                        var69.field2774 = class167.method2858(var71, var72);
                        continue;
                    }
                    if (var452 == 1302) {
                        var5--;
                        var69.field2676 = field781[var5] == 1;
                        continue;
                    }
                    if (var452 == 1303) {
                        var5--;
                        var69.field2750 = field781[var5];
                        continue;
                    }
                    if (var452 == 1304) {
                        var5--;
                        var69.field2751 = field781[var5];
                        continue;
                    }
                    if (var452 == 1305) {
                        var6--;
                        var69.field2747 = field778[var6];
                        continue;
                    }
                    if (var452 == 1306) {
                        var6--;
                        var69.field2753 = field778[var6];
                        continue;
                    }
                    if (var452 == 1307) {
                        var69.field2748 = null;
                        continue;
                    }
                } else {
                    if (var452 >= 1400 && var452 < 1500 || var452 >= 2400 && var452 < 2500) {
                        class167 var73;
                        if (var452 >= 2000) {
                            var452 -= 1000;
                            var5--;
                            var73 = class167.method1258(field781[var5]);
                        } else {
                            var73 = var41 ? Statics.field3107 : Statics.field198;
                        }
                        var6--;
                        String var74 = field778[var6];
                        int[] var75 = null;
                        if (var74.length() > 0 && var74.charAt(var74.length() - 1) == 'Y') {
                            var5--;
                            int var76 = field781[var5];
                            if (var76 > 0) {
                                var75 = new int[var76];
                                while (var76-- > 0) {
                                    var5--;
                                    var75[var76] = field781[var5];
                                }
                            }
                            var74 = var74.substring(0, var74.length() - 1);
                        }
                        Object[] var77 = new Object[var74.length() + 1];
                        for (int var78 = var77.length - 1; var78 >= 1; var78--) {
                            if (var74.charAt(var78 - 1) == 's') {
                                var6--;
                                var77[var78] = field778[var6];
                            } else {
                                var5--;
                                var77[var78] = Integer.valueOf(field781[var5]);
                            }
                        }
                        var5--;
                        int var79 = field781[var5];
                        if (var79 == -1) {
                            var77 = null;
                        } else {
                            var77[0] = Integer.valueOf(var79);
                        }
                        if (var452 == 1400) {
                            var73.field2756 = var77;
                        }
                        if (var452 == 1401) {
                            var73.field2717 = var77;
                        }
                        if (var452 == 1402) {
                            var73.field2758 = var77;
                        }
                        if (var452 == 1403) {
                            var73.field2749 = var77;
                        }
                        if (var452 == 1404) {
                            var73.field2683 = var77;
                        }
                        if (var452 == 1405) {
                            var73.field2779 = var77;
                        }
                        if (var452 == 1406) {
                            var73.field2766 = var77;
                        }
                        if (var452 == 1407) {
                            var73.field2767 = var77;
                            var73.field2804 = var75;
                        }
                        if (var452 == 1408) {
                            var73.field2773 = var77;
                        }
                        if (var452 == 1409) {
                            var73.field2721 = var77;
                        }
                        if (var452 == 1410) {
                            var73.field2682 = var77;
                        }
                        if (var452 == 1411) {
                            var73.field2757 = var77;
                        }
                        if (var452 == 1412) {
                            var73.field2761 = var77;
                        }
                        if (var452 == 1414) {
                            var73.field2769 = var77;
                            var73.field2805 = var75;
                        }
                        if (var452 == 1415) {
                            var73.field2771 = var77;
                            var73.field2772 = var75;
                        }
                        if (var452 == 1416) {
                            var73.field2759 = var77;
                        }
                        if (var452 == 1417) {
                            var73.field2775 = var77;
                        }
                        if (var452 == 1418) {
                            var73.field2667 = var77;
                        }
                        if (var452 == 1419) {
                            var73.field2777 = var77;
                        }
                        if (var452 == 1420) {
                            var73.field2778 = var77;
                        }
                        if (var452 == 1421) {
                            var73.field2754 = var77;
                        }
                        if (var452 == 1422) {
                            var73.field2776 = var77;
                        }
                        if (var452 == 1423) {
                            var73.field2781 = var77;
                        }
                        if (var452 == 1424) {
                            var73.field2770 = var77;
                        }
                        if (var452 == 1425) {
                            var73.field2784 = var77;
                        }
                        if (var452 == 1426) {
                            var73.field2785 = var77;
                        }
                        if (var452 == 1427) {
                            var73.field2707 = var77;
                        }
                        var73.field2718 = true;
                        continue;
                    }
                    if (var452 < 1600) {
                        class167 var80 = var41 ? Statics.field3107 : Statics.field198;
                        if (var452 == 1500) {
                            field781[var5++] = var80.field2689;
                            continue;
                        }
                        if (var452 == 1501) {
                            field781[var5++] = var80.field2746;
                            continue;
                        }
                        if (var452 == 1502) {
                            field781[var5++] = var80.field2691;
                            continue;
                        }
                        if (var452 == 1503) {
                            field781[var5++] = var80.field2692;
                            continue;
                        }
                        if (var452 == 1504) {
                            field781[var5++] = var80.field2696 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 1505) {
                            field781[var5++] = var80.field2782;
                            continue;
                        }
                    } else if (var452 < 1700) {
                        class167 var81 = var41 ? Statics.field3107 : Statics.field198;
                        if (var452 == 1600) {
                            field781[var5++] = var81.field2697;
                            continue;
                        }
                        if (var452 == 1601) {
                            field781[var5++] = var81.field2698;
                            continue;
                        }
                        if (var452 == 1602) {
                            field778[var6++] = var81.field2708;
                            continue;
                        }
                        if (var452 == 1603) {
                            field781[var5++] = var81.field2699;
                            continue;
                        }
                        if (var452 == 1604) {
                            field781[var5++] = var81.field2700;
                            continue;
                        }
                        if (var452 == 1605) {
                            field781[var5++] = var81.field2728;
                            continue;
                        }
                        if (var452 == 1606) {
                            field781[var5++] = var81.field2725;
                            continue;
                        }
                        if (var452 == 1607) {
                            field781[var5++] = var81.field2727;
                            continue;
                        }
                        if (var452 == 1608) {
                            field781[var5++] = var81.field2726;
                            continue;
                        }
                        if (var452 == 1609) {
                            field781[var5++] = var81.field2706;
                            continue;
                        }
                    } else if (var452 < 1800) {
                        class167 var82 = var41 ? Statics.field3107 : Statics.field198;
                        if (var452 == 1700) {
                            field781[var5++] = var82.field2794;
                            continue;
                        }
                        if (var452 == 1701) {
                            if (var82.field2794 == -1) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = var82.field2795;
                            }
                            continue;
                        }
                        if (var452 == 1702) {
                            field781[var5++] = var82.field2677;
                            continue;
                        }
                    } else if (var452 < 1900) {
                        class167 var83 = var41 ? Statics.field3107 : Statics.field198;
                        if (var452 == 1800) {
                            int[] var84 = field781;
                            int var85 = var5++;
                            int var86 = client.method147(var83);
                            int var87 = var86 >> 11 & 0x3F;
                            var84[var85] = var87;
                            continue;
                        }
                        if (var452 == 1801) {
                            var5--;
                            int var88 = field781[var5];
                            int var453 = var88 - 1;
                            if (var83.field2748 != null && var453 < var83.field2748.length && var83.field2748[var453] != null) {
                                field778[var6++] = var83.field2748[var453];
                                continue;
                            }
                            field778[var6++] = "";
                            continue;
                        }
                        if (var452 == 1802) {
                            if (var83.field2747 == null) {
                                field778[var6++] = "";
                            } else {
                                field778[var6++] = var83.field2747;
                            }
                            continue;
                        }
                    } else if (var452 >= 1900 && var452 < 2000 || var452 >= 2900 && var452 < 3000) {
                        class167 var89;
                        if (var452 >= 2000) {
                            var452 -= 1000;
                            var5--;
                            var89 = class167.method1258(field781[var5]);
                        } else {
                            var89 = var41 ? Statics.field3107 : Statics.field198;
                        }
                        if (var452 == 1927) {
                            if (field790 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var89.field2707 == null) {
                                return;
                            }
                            class1 var90 = new class1();
                            var90.field3 = var89;
                            var90.field4 = var89.field2707;
                            var90.field10 = field790 + 1;
                            client.field500.method3485(arg0);
                            continue;
                        }
                    } else if (var452 < 2600) {
                        var5--;
                        class167 var91 = class167.method1258(field781[var5]);
                        if (var452 == 2500) {
                            field781[var5++] = var91.field2689;
                            continue;
                        }
                        if (var452 == 2501) {
                            field781[var5++] = var91.field2746;
                            continue;
                        }
                        if (var452 == 2502) {
                            field781[var5++] = var91.field2691;
                            continue;
                        }
                        if (var452 == 2503) {
                            field781[var5++] = var91.field2692;
                            continue;
                        }
                        if (var452 == 2504) {
                            field781[var5++] = var91.field2696 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 2505) {
                            field781[var5++] = var91.field2782;
                            continue;
                        }
                    } else if (var452 < 2700) {
                        var5--;
                        class167 var92 = class167.method1258(field781[var5]);
                        if (var452 == 2600) {
                            field781[var5++] = var92.field2697;
                            continue;
                        }
                        if (var452 == 2601) {
                            field781[var5++] = var92.field2698;
                            continue;
                        }
                        if (var452 == 2602) {
                            field778[var6++] = var92.field2708;
                            continue;
                        }
                        if (var452 == 2603) {
                            field781[var5++] = var92.field2699;
                            continue;
                        }
                        if (var452 == 2604) {
                            field781[var5++] = var92.field2700;
                            continue;
                        }
                        if (var452 == 2605) {
                            field781[var5++] = var92.field2728;
                            continue;
                        }
                        if (var452 == 2606) {
                            field781[var5++] = var92.field2725;
                            continue;
                        }
                        if (var452 == 2607) {
                            field781[var5++] = var92.field2727;
                            continue;
                        }
                        if (var452 == 2608) {
                            field781[var5++] = var92.field2726;
                            continue;
                        }
                        if (var452 == 2609) {
                            field781[var5++] = var92.field2706;
                            continue;
                        }
                    } else if (var452 < 2800) {
                        if (var452 == 2700) {
                            var5--;
                            class167 var93 = class167.method1258(field781[var5]);
                            field781[var5++] = var93.field2794;
                            continue;
                        }
                        if (var452 == 2701) {
                            var5--;
                            class167 var94 = class167.method1258(field781[var5]);
                            if (var94.field2794 == -1) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = var94.field2795;
                            }
                            continue;
                        }
                        if (var452 == 2702) {
                            var5--;
                            int var95 = field781[var5];
                            class4 var96 = (class4) client.field462.method3459((long) var95);
                            if (var96 == null) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = 1;
                            }
                            continue;
                        }
                        if (var452 == 2706) {
                            field781[var5++] = client.field461;
                            continue;
                        }
                    } else if (var452 < 2900) {
                        var5--;
                        class167 var97 = class167.method1258(field781[var5]);
                        if (var452 == 2800) {
                            int[] var98 = field781;
                            int var99 = var5++;
                            int var100 = client.method147(var97);
                            int var101 = var100 >> 11 & 0x3F;
                            var98[var99] = var101;
                            continue;
                        }
                        if (var452 == 2801) {
                            var5--;
                            int var102 = field781[var5];
                            int var454 = var102 - 1;
                            if (var97.field2748 != null && var454 < var97.field2748.length && var97.field2748[var454] != null) {
                                field778[var6++] = var97.field2748[var454];
                                continue;
                            }
                            field778[var6++] = "";
                            continue;
                        }
                        if (var452 == 2802) {
                            if (var97.field2747 == null) {
                                field778[var6++] = "";
                            } else {
                                field778[var6++] = var97.field2747;
                            }
                            continue;
                        }
                    } else if (var452 < 3200) {
                        if (var452 == 3100) {
                            var6--;
                            String var103 = field778[var6];
                            class11.method1792(0, "", var103);
                            continue;
                        }
                        if (var452 == 3101) {
                            var5 -= 2;
                            client.method182(Statics.field143, field781[var5], field781[var5 + 1]);
                            continue;
                        }
                        if (var452 == 3103) {
                            client.field342.method2574(180);
                            for (class4 var104 = (class4) client.field462.method3462(); var104 != null; var104 = (class4) client.field462.method3468()) {
                                if (var104.field61 == 0 || var104.field61 == 3) {
                                    Statics.method962(var104, true);
                                }
                            }
                            if (client.field360 != null) {
                                client.method1085(client.field360);
                                client.field360 = null;
                            }
                            continue;
                        }
                        if (var452 == 3104) {
                            var6--;
                            String var105 = field778[var6];
                            int var106 = 0;
                            boolean var107 = class157.method2615(var105, 10, true);
                            if (var107) {
                                int var108 = class157.method644(var105, 10, true);
                                var106 = var108;
                            }
                            client.field342.method2574(37);
                            client.field342.method2310(var106);
                            continue;
                        }
                        if (var452 == 3105) {
                            var6--;
                            String var109 = field778[var6];
                            client.field342.method2574(84);
                            client.field342.method2307(var109.length() + 1);
                            client.field342.method2313(var109);
                            continue;
                        }
                        if (var452 == 3106) {
                            var6--;
                            String var110 = field778[var6];
                            client.field342.method2574(181);
                            client.field342.method2307(var110.length() + 1);
                            client.field342.method2313(var110);
                            continue;
                        }
                        if (var452 == 3107) {
                            var5--;
                            int var111 = field781[var5];
                            var6--;
                            String var112 = field778[var6];
                            boolean var113 = false;
                            for (int var114 = 0; var114 < client.field409; var114++) {
                                class3 var115 = client.field419[client.field447[var114]];
                                if (var115 != null && var115.field53 != null && var115.field53.equalsIgnoreCase(var112)) {
                                    if (var111 == 1) {
                                        client.field342.method2574(177);
                                        client.field342.method2351(client.field447[var114]);
                                        client.field342.method2345(0);
                                    } else if (var111 == 4) {
                                        client.field342.method2574(139);
                                        client.field342.method2367(client.field447[var114]);
                                        client.field342.method2345(0);
                                    } else if (var111 == 6) {
                                        client.field342.method2574(192);
                                        client.field342.method2360(client.field447[var114]);
                                        client.field342.method2344(0);
                                    } else if (var111 == 7) {
                                        client.field342.method2574(153);
                                        client.field342.method2360(client.field447[var114]);
                                        client.field342.method2345(0);
                                    }
                                    var113 = true;
                                    break;
                                }
                            }
                            if (!var113) {
                                class11.method1792(4, "", class151.field2378 + var112);
                            }
                            continue;
                        }
                        if (var452 == 3108) {
                            var5 -= 3;
                            int var116 = field781[var5];
                            int var117 = field781[var5 + 1];
                            int var118 = field781[var5 + 2];
                            class167 var119 = class167.method1258(var118);
                            client.method105(var119, var116, var117);
                            continue;
                        }
                        if (var452 == 3109) {
                            var5 -= 2;
                            int var120 = field781[var5];
                            int var121 = field781[var5 + 1];
                            class167 var122 = var41 ? Statics.field3107 : Statics.field198;
                            client.method105(var122, var120, var121);
                            continue;
                        }
                        if (var452 == 3110) {
                            var5--;
                            Statics.field1352 = field781[var5] == 1;
                            continue;
                        }
                        if (var452 == 3111) {
                            field781[var5++] = Statics.field1870.field145 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3112) {
                            var5--;
                            Statics.field1870.field145 = field781[var5] == 1;
                            Statics.method2571();
                            continue;
                        }
                        if (var452 == 3113) {
                            var6--;
                            String var123 = field778[var6];
                            var5--;
                            boolean var124 = field781[var5] == 1;
                            if (!var124) {
                                class133.method149(var123, 3, "openjs");
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var123));
                                    continue;
                                } catch (Exception var450) {
                                }
                            }
                            if (class133.field2021.startsWith("win")) {
                                class133.method149(var123, 0, "openjs");
                            } else if (class133.field2021.startsWith("mac")) {
                                class133.method149(var123, 1, "openjs");
                            } else {
                                class133.method149(var123, 2, "openjs");
                            }
                            continue;
                        }
                        if (var452 == 3115) {
                            var5--;
                            int var126 = field781[var5];
                            client.field342.method2574(148);
                            client.field342.method2367(var126);
                            continue;
                        }
                        if (var452 == 3116) {
                            var5--;
                            int var127 = field781[var5];
                            var6 -= 2;
                            String var128 = field778[var6];
                            String var129 = field778[var6 + 1];
                            if (var128.length() <= 500 && var129.length() <= 500) {
                                client.field342.method2574(13);
                                client.field342.method2367(1 + class114.method2250(var128) + class114.method2250(var129));
                                client.field342.method2313(var129);
                                client.field342.method2346(var127);
                                client.field342.method2313(var128);
                            }
                            continue;
                        }
                    } else if (var452 < 3300) {
                        if (var452 == 3200) {
                            var5 -= 3;
                            int var130 = field781[var5];
                            int var131 = field781[var5 + 1];
                            int var132 = field781[var5 + 2];
                            if (client.field558 != 0 && var131 != 0 && client.field544 < 50) {
                                client.field545[client.field544] = var130;
                                client.field546[client.field544] = var131;
                                client.field547[client.field544] = var132;
                                client.field549[client.field544] = null;
                                client.field548[client.field544] = 0;
                                client.field544++;
                            }
                            continue;
                        }
                        if (var452 == 3201) {
                            var5--;
                            int var133 = field781[var5];
                            if (var133 == -1 && !client.field540) {
                                class177.method2070();
                            } else if (var133 != -1 && client.field539 != var133 && client.field538 != 0 && !client.field540) {
                                class177.method570(2, Statics.field677, var133, 0, client.field538, false);
                            }
                            client.field539 = var133;
                            continue;
                        }
                        if (var452 == 3202) {
                            var5 -= 2;
                            int var134 = field781[var5];
                            int var10000 = field781[var5 + 1];
                            if (client.field538 != 0 && var134 != -1) {
                                class177.method708(Statics.field1848, var134, 0, client.field538, false);
                                client.field540 = true;
                            }
                            continue;
                        }
                    } else if (var452 < 3400) {
                        if (var452 == 3300) {
                            field781[var5++] = client.field477;
                            continue;
                        }
                        if (var452 == 3301) {
                            var5 -= 2;
                            int var136 = field781[var5];
                            int var137 = field781[var5 + 1];
                            int[] var138 = field781;
                            int var139 = var5++;
                            class15 var140 = (class15) class15.field228.method3459((long) var136);
                            int var141;
                            if (var140 == null) {
                                var141 = -1;
                            } else if (var137 >= 0 && var137 < var140.field222.length) {
                                var141 = var140.field222[var137];
                            } else {
                                var141 = -1;
                            }
                            var138[var139] = var141;
                            continue;
                        }
                        if (var452 == 3302) {
                            var5 -= 2;
                            int var142 = field781[var5];
                            int var143 = field781[var5 + 1];
                            field781[var5++] = class15.method2611(var142, var143);
                            continue;
                        }
                        if (var452 == 3303) {
                            var5 -= 2;
                            int var144 = field781[var5];
                            int var145 = field781[var5 + 1];
                            field781[var5++] = class15.method164(var144, var145);
                            continue;
                        }
                        if (var452 == 3304) {
                            var5--;
                            int var146 = field781[var5];
                            field781[var5++] = class49.method3605(var146).field1075;
                            continue;
                        }
                        if (var452 == 3305) {
                            var5--;
                            int var147 = field781[var5];
                            field781[var5++] = client.field445[var147];
                            continue;
                        }
                        if (var452 == 3306) {
                            var5--;
                            int var148 = field781[var5];
                            field781[var5++] = client.field348[var148];
                            continue;
                        }
                        if (var452 == 3307) {
                            var5--;
                            int var149 = field781[var5];
                            field781[var5++] = client.field440[var149];
                            continue;
                        }
                        if (var452 == 3308) {
                            int var150 = Statics.field3101;
                            int var151 = (Statics.field143.field814 >> 7) + Statics.field1367;
                            int var152 = (Statics.field143.field821 >> 7) + Statics.field2578;
                            field781[var5++] = (var150 << 28) + (var151 << 14) + var152;
                            continue;
                        }
                        if (var452 == 3309) {
                            var5--;
                            int var153 = field781[var5];
                            field781[var5++] = var153 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var452 == 3310) {
                            var5--;
                            int var154 = field781[var5];
                            field781[var5++] = var154 >> 28;
                            continue;
                        }
                        if (var452 == 3311) {
                            var5--;
                            int var155 = field781[var5];
                            field781[var5++] = var155 & 0x3FFF;
                            continue;
                        }
                        if (var452 == 3312) {
                            field781[var5++] = client.field306 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3313) {
                            var5 -= 2;
                            int var156 = field781[var5] + 32768;
                            int var157 = field781[var5 + 1];
                            int[] var158 = field781;
                            int var159 = var5++;
                            class15 var160 = (class15) class15.field228.method3459((long) var156);
                            int var161;
                            if (var160 == null) {
                                var161 = -1;
                            } else if (var157 >= 0 && var157 < var160.field222.length) {
                                var161 = var160.field222[var157];
                            } else {
                                var161 = -1;
                            }
                            var158[var159] = var161;
                            continue;
                        }
                        if (var452 == 3314) {
                            var5 -= 2;
                            int var162 = field781[var5] + 32768;
                            int var163 = field781[var5 + 1];
                            field781[var5++] = class15.method2611(var162, var163);
                            continue;
                        }
                        if (var452 == 3315) {
                            var5 -= 2;
                            int var164 = field781[var5] + 32768;
                            int var165 = field781[var5 + 1];
                            field781[var5++] = class15.method164(var164, var165);
                            continue;
                        }
                        if (var452 == 3316) {
                            if (client.field468 >= 2) {
                                field781[var5++] = client.field468;
                            } else {
                                field781[var5++] = 0;
                            }
                            continue;
                        }
                        if (var452 == 3317) {
                            field781[var5++] = client.field319;
                            continue;
                        }
                        if (var452 == 3318) {
                            field781[var5++] = client.field397;
                            continue;
                        }
                        if (var452 == 3321) {
                            field781[var5++] = client.field466;
                            continue;
                        }
                        if (var452 == 3322) {
                            field781[var5++] = client.field467;
                            continue;
                        }
                        if (var452 == 3323) {
                            if (client.field470) {
                                field781[var5++] = 1;
                            } else {
                                field781[var5++] = 0;
                            }
                            continue;
                        }
                        if (var452 == 3324) {
                            field781[var5++] = client.field302;
                            continue;
                        }
                    } else if (var452 < 3500) {
                        if (var452 == 3400) {
                            var5 -= 2;
                            int var166 = field781[var5];
                            int var167 = field781[var5 + 1];
                            class47 var168 = class47.method2685(var166);
                            if (var168.field1050 != 's') {
                            }
                            for (int var169 = 0; var169 < var168.field1053; var169++) {
                                if (var168.field1054[var169] == var167) {
                                    field778[var6++] = var168.field1056[var169];
                                    var168 = null;
                                    break;
                                }
                            }
                            if (var168 != null) {
                                field778[var6++] = var168.field1051;
                            }
                            continue;
                        }
                        if (var452 == 3408) {
                            var5 -= 4;
                            int var170 = field781[var5];
                            int var171 = field781[var5 + 1];
                            int var172 = field781[var5 + 2];
                            int var173 = field781[var5 + 3];
                            class47 var174 = class47.method2685(var172);
                            if (var174.field1055 == var170 && var174.field1050 == var171) {
                                for (int var175 = 0; var175 < var174.field1053; var175++) {
                                    if (var174.field1054[var175] == var173) {
                                        if (var171 == 115) {
                                            field778[var6++] = var174.field1056[var175];
                                        } else {
                                            field781[var5++] = var174.field1057[var175];
                                        }
                                        var174 = null;
                                        break;
                                    }
                                }
                                if (var174 != null) {
                                    if (var171 == 115) {
                                        field778[var6++] = var174.field1051;
                                    } else {
                                        field781[var5++] = var174.field1047;
                                    }
                                }
                                continue;
                            }
                            if (var171 == 115) {
                                field778[var6++] = "null";
                            } else {
                                field781[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var452 < 3700) {
                        if (var452 == 3600) {
                            if (client.field534 == 0) {
                                field781[var5++] = -2;
                            } else if (client.field534 == 1) {
                                field781[var5++] = -1;
                            } else {
                                field781[var5++] = client.field374;
                            }
                            continue;
                        }
                        if (var452 == 3601) {
                            var5--;
                            int var176 = field781[var5];
                            if (client.field534 == 2 && var176 < client.field374) {
                                field778[var6++] = client.field417[var176].field260;
                                field778[var6++] = client.field417[var176].field253;
                                continue;
                            }
                            field778[var6++] = "";
                            field778[var6++] = "";
                            continue;
                        }
                        if (var452 == 3602) {
                            var5--;
                            int var177 = field781[var5];
                            if (client.field534 == 2 && var177 < client.field374) {
                                field781[var5++] = client.field417[var177].field254;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var452 == 3603) {
                            var5--;
                            int var178 = field781[var5];
                            if (client.field534 == 2 && var178 < client.field374) {
                                field781[var5++] = client.field417[var178].field255;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var452 == 3604) {
                            var6--;
                            String var179 = field778[var6];
                            var5--;
                            int var180 = field781[var5];
                            client.method1524(var179, var180);
                            continue;
                        }
                        if (var452 == 3605) {
                            var6--;
                            String var181 = field778[var6];
                            client.method181(var181);
                            continue;
                        }
                        if (var452 == 3606) {
                            var6--;
                            String var182 = field778[var6];
                            if (var182 == null) {
                                continue;
                            }
                            String var183 = class158.method560(var182, Statics.field87);
                            if (var183 == null) {
                                continue;
                            }
                            int var184 = 0;
                            while (true) {
                                if (var184 >= client.field374) {
                                    continue label3104;
                                }
                                class17 var185 = client.field417[var184];
                                String var186 = var185.field260;
                                String var187 = class158.method560(var186, Statics.field87);
                                boolean var188;
                                if (var182 == null || var186 == null) {
                                    var188 = false;
                                } else if (var182.startsWith("#") || var186.startsWith("#")) {
                                    var188 = var182.equals(var186);
                                } else {
                                    var188 = var183.equals(var187);
                                }
                                if (var188) {
                                    client.field374--;
                                    for (int var189 = var184; var189 < client.field374; var189++) {
                                        client.field417[var189] = client.field417[var189 + 1];
                                    }
                                    client.field494 = client.field385;
                                    client.field342.method2574(39);
                                    client.field342.method2307(class114.method2250(var182));
                                    client.field342.method2313(var182);
                                    continue label3104;
                                }
                                var184++;
                            }
                        }
                        if (var452 == 3607) {
                            var6--;
                            String var190 = field778[var6];
                            client.method101(var190, false);
                            continue;
                        }
                        if (var452 == 3608) {
                            var6--;
                            String var191 = field778[var6];
                            client.method629(var191);
                            continue;
                        }
                        if (var452 == 3609) {
                            var6--;
                            String var192 = field778[var6];
                            class146[] var193 = new class146[] { class146.field2168, class146.field2169, class146.field2176, class146.field2174, class146.field2167 };
                            class146[] var194 = var193;
                            for (int var195 = 0; var195 < var194.length; var195++) {
                                class146 var196 = var194[var195];
                                if (var196.field2172 != -1 && var192.startsWith(class2.method3082(var196.field2172))) {
                                    var192 = var192.substring(6 + Integer.toString(var196.field2172).length());
                                    break;
                                }
                            }
                            field781[var5++] = client.method811(var192, false) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3611) {
                            if (client.field439 == null) {
                                field778[var6++] = "";
                            } else {
                                String[] var197 = field778;
                                int var198 = var6++;
                                String var199 = client.field439;
                                String var200 = class156.method2610(class156.method2635(var199));
                                if (var200 == null) {
                                    var200 = "";
                                }
                                var197[var198] = var200;
                            }
                            continue;
                        }
                        if (var452 == 3612) {
                            if (client.field439 == null) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = Statics.field2918;
                            }
                            continue;
                        }
                        if (var452 == 3613) {
                            var5--;
                            int var202 = field781[var5];
                            if (client.field439 != null && var202 < Statics.field2918) {
                                field778[var6++] = Statics.field1912[var202].field632;
                                continue;
                            }
                            field778[var6++] = "";
                            continue;
                        }
                        if (var452 == 3614) {
                            var5--;
                            int var203 = field781[var5];
                            if (client.field439 != null && var203 < Statics.field2918) {
                                field781[var5++] = Statics.field1912[var203].field630;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var452 == 3615) {
                            var5--;
                            int var204 = field781[var5];
                            if (client.field439 != null && var204 < Statics.field2918) {
                                field781[var5++] = Statics.field1912[var204].field631;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var452 == 3616) {
                            field781[var5++] = Statics.field701;
                            continue;
                        }
                        if (var452 == 3617) {
                            var6--;
                            String var205 = field778[var6];
                            client.method38(var205);
                            continue;
                        }
                        if (var452 == 3618) {
                            field781[var5++] = Statics.field1359;
                            continue;
                        }
                        if (var452 == 3619) {
                            var6--;
                            String var206 = field778[var6];
                            client.method2965(var206);
                            continue;
                        }
                        if (var452 == 3620) {
                            client.field342.method2574(36);
                            client.field342.method2307(0);
                            continue;
                        }
                        if (var452 == 3621) {
                            if (client.field534 == 0) {
                                field781[var5++] = -1;
                            } else {
                                field781[var5++] = client.field571;
                            }
                            continue;
                        }
                        if (var452 == 3622) {
                            var5--;
                            int var207 = field781[var5];
                            if (client.field534 != 0 && var207 < client.field571) {
                                field778[var6++] = client.field304[var207].field137;
                                field778[var6++] = client.field304[var207].field138;
                                continue;
                            }
                            field778[var6++] = "";
                            field778[var6++] = "";
                            continue;
                        }
                        if (var452 == 3623) {
                            var6--;
                            String var208 = field778[var6];
                            if (var208.startsWith(class2.method3082(0)) || var208.startsWith(class2.method3082(1))) {
                                var208 = var208.substring(7);
                            }
                            field781[var5++] = client.method688(var208) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3624) {
                            var5--;
                            int var209 = field781[var5];
                            if (Statics.field1912 != null && var209 < Statics.field2918 && Statics.field1912[var209].field632.equalsIgnoreCase(Statics.field143.field53)) {
                                field781[var5++] = 1;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var452 == 3625) {
                            if (client.field529 == null) {
                                field778[var6++] = "";
                            } else {
                                String[] var210 = field778;
                                int var211 = var6++;
                                String var212 = client.field529;
                                String var213 = class156.method2610(class156.method2635(var212));
                                if (var213 == null) {
                                    var213 = "";
                                }
                                var210[var211] = var213;
                            }
                            continue;
                        }
                    } else if (var452 < 4000) {
                        if (var452 == 3903) {
                            var5--;
                            int var215 = field781[var5];
                            field781[var5++] = client.field578[var215].method3646();
                            continue;
                        }
                        if (var452 == 3904) {
                            var5--;
                            int var216 = field781[var5];
                            field781[var5++] = client.field578[var216].field3094;
                            continue;
                        }
                        if (var452 == 3905) {
                            var5--;
                            int var217 = field781[var5];
                            field781[var5++] = client.field578[var217].field3097;
                            continue;
                        }
                        if (var452 == 3906) {
                            var5--;
                            int var218 = field781[var5];
                            field781[var5++] = client.field578[var218].field3096;
                            continue;
                        }
                        if (var452 == 3907) {
                            var5--;
                            int var219 = field781[var5];
                            field781[var5++] = client.field578[var219].field3098;
                            continue;
                        }
                        if (var452 == 3908) {
                            var5--;
                            int var220 = field781[var5];
                            field781[var5++] = client.field578[var220].field3095;
                            continue;
                        }
                        if (var452 == 3910) {
                            var5--;
                            int var221 = field781[var5];
                            int var222 = client.field578[var221].method3640();
                            field781[var5++] = var222 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3911) {
                            var5--;
                            int var223 = field781[var5];
                            int var224 = client.field578[var223].method3640();
                            field781[var5++] = var224 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3912) {
                            var5--;
                            int var225 = field781[var5];
                            int var226 = client.field578[var225].method3640();
                            field781[var5++] = var226 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3913) {
                            var5--;
                            int var227 = field781[var5];
                            int var228 = client.field578[var227].method3640();
                            field781[var5++] = var228 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3914) {
                            var5--;
                            boolean var229 = field781[var5] == 1;
                            if (Statics.field667 != null) {
                                Statics.field667.method3652(class215.field3105, var229);
                            }
                            continue;
                        }
                        if (var452 == 3915) {
                            var5--;
                            boolean var230 = field781[var5] == 1;
                            if (Statics.field667 != null) {
                                Statics.field667.method3652(class215.field3103, var230);
                            }
                            continue;
                        }
                        if (var452 == 3916) {
                            var5 -= 2;
                            boolean var231 = field781[var5] == 1;
                            boolean var232 = field781[var5 + 1] == 1;
                            if (Statics.field667 != null) {
                                Statics.field667.method3652(new class22(var232), var231);
                            }
                            continue;
                        }
                        if (var452 == 3917) {
                            var5--;
                            boolean var233 = field781[var5] == 1;
                            if (Statics.field667 != null) {
                                Statics.field667.method3652(class215.field3102, var233);
                            }
                            continue;
                        }
                        if (var452 == 3918) {
                            var5--;
                            boolean var234 = field781[var5] == 1;
                            if (Statics.field667 != null) {
                                Statics.field667.method3652(class215.field3106, var234);
                            }
                            continue;
                        }
                        if (var452 == 3919) {
                            field781[var5++] = Statics.field667 == null ? 0 : Statics.field667.field3104.size();
                            continue;
                        }
                        if (var452 == 3920) {
                            var5--;
                            int var235 = field781[var5];
                            class208 var236 = (class208) Statics.field667.field3104.get(var235);
                            field781[var5++] = var236.field3075;
                            continue;
                        }
                        if (var452 == 3921) {
                            var5--;
                            int var237 = field781[var5];
                            class208 var238 = (class208) Statics.field667.field3104.get(var237);
                            field778[var6++] = var238.method3600();
                            continue;
                        }
                        if (var452 == 3922) {
                            var5--;
                            int var239 = field781[var5];
                            class208 var240 = (class208) Statics.field667.field3104.get(var239);
                            field778[var6++] = var240.method3601();
                            continue;
                        }
                        if (var452 == 3923) {
                            var5--;
                            int var241 = field781[var5];
                            class208 var242 = (class208) Statics.field667.field3104.get(var241);
                            long var243 = Statics.method2875() - Statics.field68 - var242.field3073;
                            int var245 = (int) (var243 / 3600000L);
                            int var246 = (int) ((var243 - (long) (var245 * 3600000)) / 60000L);
                            int var247 = (int) ((var243 - (long) (var245 * 3600000) - (long) (var246 * 60000)) / 1000L);
                            String var248 = var245 + ":" + var246 / 10 + var246 % 10 + ":" + var247 / 10 + var247 % 10;
                            field778[var6++] = var248;
                            continue;
                        }
                        if (var452 == 3924) {
                            var5--;
                            int var249 = field781[var5];
                            class208 var250 = (class208) Statics.field667.field3104.get(var249);
                            field781[var5++] = var250.field3074.field3096;
                            continue;
                        }
                        if (var452 == 3925) {
                            var5--;
                            int var251 = field781[var5];
                            class208 var252 = (class208) Statics.field667.field3104.get(var251);
                            field781[var5++] = var252.field3074.field3097;
                            continue;
                        }
                        if (var452 == 3926) {
                            var5--;
                            int var253 = field781[var5];
                            class208 var254 = (class208) Statics.field667.field3104.get(var253);
                            field781[var5++] = var254.field3074.field3094;
                            continue;
                        }
                    } else if (var452 < 4100) {
                        if (var452 == 4000) {
                            var5 -= 2;
                            int var255 = field781[var5];
                            int var256 = field781[var5 + 1];
                            field781[var5++] = var255 + var256;
                            continue;
                        }
                        if (var452 == 4001) {
                            var5 -= 2;
                            int var257 = field781[var5];
                            int var258 = field781[var5 + 1];
                            field781[var5++] = var257 - var258;
                            continue;
                        }
                        if (var452 == 4002) {
                            var5 -= 2;
                            int var259 = field781[var5];
                            int var260 = field781[var5 + 1];
                            field781[var5++] = var259 * var260;
                            continue;
                        }
                        if (var452 == 4003) {
                            var5 -= 2;
                            int var261 = field781[var5];
                            int var262 = field781[var5 + 1];
                            field781[var5++] = var261 / var262;
                            continue;
                        }
                        if (var452 == 4004) {
                            var5--;
                            int var263 = field781[var5];
                            field781[var5++] = (int) (Math.random() * (double) var263);
                            continue;
                        }
                        if (var452 == 4005) {
                            var5--;
                            int var264 = field781[var5];
                            field781[var5++] = (int) (Math.random() * (double) (var264 + 1));
                            continue;
                        }
                        if (var452 == 4006) {
                            var5 -= 5;
                            int var265 = field781[var5];
                            int var266 = field781[var5 + 1];
                            int var267 = field781[var5 + 2];
                            int var268 = field781[var5 + 3];
                            int var269 = field781[var5 + 4];
                            field781[var5++] = (var266 - var265) * (var269 - var267) / (var268 - var267) + var265;
                            continue;
                        }
                        if (var452 == 4007) {
                            var5 -= 2;
                            int var270 = field781[var5];
                            int var271 = field781[var5 + 1];
                            field781[var5++] = var270 * var271 / 100 + var270;
                            continue;
                        }
                        if (var452 == 4008) {
                            var5 -= 2;
                            int var272 = field781[var5];
                            int var273 = field781[var5 + 1];
                            field781[var5++] = var272 | 0x1 << var273;
                            continue;
                        }
                        if (var452 == 4009) {
                            var5 -= 2;
                            int var274 = field781[var5];
                            int var275 = field781[var5 + 1];
                            field781[var5++] = var274 & -1 - (0x1 << var275);
                            continue;
                        }
                        if (var452 == 4010) {
                            var5 -= 2;
                            int var276 = field781[var5];
                            int var277 = field781[var5 + 1];
                            field781[var5++] = (var276 & 0x1 << var277) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var452 == 4011) {
                            var5 -= 2;
                            int var278 = field781[var5];
                            int var279 = field781[var5 + 1];
                            field781[var5++] = var278 % var279;
                            continue;
                        }
                        if (var452 == 4012) {
                            var5 -= 2;
                            int var280 = field781[var5];
                            int var281 = field781[var5 + 1];
                            if (var280 == 0) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = (int) Math.pow((double) var280, (double) var281);
                            }
                            continue;
                        }
                        if (var452 == 4013) {
                            var5 -= 2;
                            int var282 = field781[var5];
                            int var283 = field781[var5 + 1];
                            if (var282 == 0) {
                                field781[var5++] = 0;
                            } else if (var283 == 0) {
                                field781[var5++] = Integer.MAX_VALUE;
                            } else {
                                field781[var5++] = (int) Math.pow((double) var282, 1.0D / (double) var283);
                            }
                            continue;
                        }
                        if (var452 == 4014) {
                            var5 -= 2;
                            int var284 = field781[var5];
                            int var285 = field781[var5 + 1];
                            field781[var5++] = var284 & var285;
                            continue;
                        }
                        if (var452 == 4015) {
                            var5 -= 2;
                            int var286 = field781[var5];
                            int var287 = field781[var5 + 1];
                            field781[var5++] = var286 | var287;
                            continue;
                        }
                    } else if (var452 < 4200) {
                        if (var452 == 4100) {
                            var6--;
                            String var288 = field778[var6];
                            var5--;
                            int var289 = field781[var5];
                            field778[var6++] = var288 + var289;
                            continue;
                        }
                        if (var452 == 4101) {
                            var6 -= 2;
                            String var290 = field778[var6];
                            String var291 = field778[var6 + 1];
                            field778[var6++] = var290 + var291;
                            continue;
                        }
                        if (var452 == 4102) {
                            var6--;
                            String var292 = field778[var6];
                            var5--;
                            int var293 = field781[var5];
                            String[] var294 = field778;
                            int var295 = var6++;
                            String var297;
                            if (var293 < 0) {
                                var297 = Integer.toString(var293);
                            } else {
                                int var298 = var293;
                                String var299;
                                if (var293 < 0) {
                                    var299 = Integer.toString(var293, 10);
                                } else {
                                    int var300 = 2;
                                    int var301 = var293 / 10;
                                    while (var301 != 0) {
                                        var301 /= 10;
                                        var300++;
                                    }
                                    char[] var302 = new char[var300];
                                    var302[0] = '+';
                                    for (int var303 = var300 - 1; var303 > 0; var303--) {
                                        int var304 = var298;
                                        var298 /= 10;
                                        int var305 = var304 - var298 * 10;
                                        if (var305 >= 10) {
                                            var302[var303] = (char) (var305 + 87);
                                        } else {
                                            var302[var303] = (char) (var305 + 48);
                                        }
                                    }
                                    var299 = new String(var302);
                                }
                                var297 = var299;
                            }
                            var294[var295] = var292 + var297;
                            continue;
                        }
                        if (var452 == 4103) {
                            var6--;
                            String var306 = field778[var6];
                            field778[var6++] = var306.toLowerCase();
                            continue;
                        }
                        if (var452 == 4104) {
                            var5--;
                            int var307 = field781[var5];
                            long var308 = ((long) var307 + 11745L) * 86400000L;
                            field782.setTime(new Date(var308));
                            int var310 = field782.get(5);
                            int var311 = field782.get(2);
                            int var312 = field782.get(1);
                            field778[var6++] = var310 + "-" + field786[var311] + "-" + var312;
                            continue;
                        }
                        if (var452 == 4105) {
                            var6 -= 2;
                            String var313 = field778[var6];
                            String var314 = field778[var6 + 1];
                            if (Statics.field143.field39 != null && Statics.field143.field39.field2840) {
                                field778[var6++] = var314;
                                continue;
                            }
                            field778[var6++] = var313;
                            continue;
                        }
                        if (var452 == 4106) {
                            var5--;
                            int var315 = field781[var5];
                            field778[var6++] = Integer.toString(var315);
                            continue;
                        }
                        if (var452 == 4107) {
                            var6 -= 2;
                            int[] var316 = field781;
                            int var317 = var5++;
                            int var318 = class160.method5(field778[var6], field778[var6 + 1], client.field376);
                            byte var319;
                            if (var318 > 0) {
                                var319 = 1;
                            } else if (var318 < 0) {
                                var319 = -1;
                            } else {
                                var319 = 0;
                            }
                            var316[var317] = var319;
                            continue;
                        }
                        if (var452 == 4108) {
                            var6--;
                            String var320 = field778[var6];
                            var5 -= 2;
                            int var321 = field781[var5];
                            int var322 = field781[var5 + 1];
                            byte[] var323 = Statics.field607.method2995(var322, 0);
                            class218 var324 = new class218(var323);
                            field781[var5++] = var324.method3693(var320, var321);
                            continue;
                        }
                        if (var452 == 4109) {
                            var6--;
                            String var325 = field778[var6];
                            var5 -= 2;
                            int var326 = field781[var5];
                            int var327 = field781[var5 + 1];
                            byte[] var328 = Statics.field607.method2995(var327, 0);
                            class218 var329 = new class218(var328);
                            field781[var5++] = var329.method3662(var325, var326);
                            continue;
                        }
                        if (var452 == 4110) {
                            var6 -= 2;
                            String var330 = field778[var6];
                            String var331 = field778[var6 + 1];
                            var5--;
                            if (field781[var5] == 1) {
                                field778[var6++] = var330;
                            } else {
                                field778[var6++] = var331;
                            }
                            continue;
                        }
                        if (var452 == 4111) {
                            var6--;
                            String var332 = field778[var6];
                            field778[var6++] = class217.method3681(var332);
                            continue;
                        }
                        if (var452 == 4112) {
                            var6--;
                            String var333 = field778[var6];
                            var5--;
                            int var334 = field781[var5];
                            field778[var6++] = var333 + (char) var334;
                            continue;
                        }
                        if (var452 == 4113) {
                            var5--;
                            int var335 = field781[var5];
                            int[] var336 = field781;
                            int var337 = var5++;
                            char var338 = (char) var335;
                            boolean var339;
                            if (var338 >= ' ' && var338 <= '~') {
                                var339 = true;
                            } else if (var338 >= 160 && var338 <= 255) {
                                var339 = true;
                            } else if (var338 == 8364 || var338 == 338 || var338 == 8212 || var338 == 339 || var338 == 376) {
                                var339 = true;
                            } else {
                                var339 = false;
                            }
                            var336[var337] = var339 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4114) {
                            var5--;
                            int var340 = field781[var5];
                            field781[var5++] = class157.method1095((char) var340) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4115) {
                            var5--;
                            int var341 = field781[var5];
                            field781[var5++] = class157.method2638((char) var341) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4116) {
                            var5--;
                            int var342 = field781[var5];
                            field781[var5++] = class157.method2616((char) var342) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4117) {
                            var6--;
                            String var343 = field778[var6];
                            if (var343 == null) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = var343.length();
                            }
                            continue;
                        }
                        if (var452 == 4118) {
                            var6--;
                            String var344 = field778[var6];
                            var5 -= 2;
                            int var345 = field781[var5];
                            int var346 = field781[var5 + 1];
                            field778[var6++] = var344.substring(var345, var346);
                            continue;
                        }
                        if (var452 == 4119) {
                            var6--;
                            String var347 = field778[var6];
                            StringBuilder var348 = new StringBuilder(var347.length());
                            boolean var349 = false;
                            for (int var350 = 0; var350 < var347.length(); var350++) {
                                char var351 = var347.charAt(var350);
                                if (var351 == '<') {
                                    var349 = true;
                                } else if (var351 == '>') {
                                    var349 = false;
                                } else if (!var349) {
                                    var348.append(var351);
                                }
                            }
                            field778[var6++] = var348.toString();
                            continue;
                        }
                        if (var452 == 4120) {
                            var6--;
                            String var352 = field778[var6];
                            var5--;
                            int var353 = field781[var5];
                            field781[var5++] = var352.indexOf(var353);
                            continue;
                        }
                        if (var452 == 4121) {
                            var6 -= 2;
                            String var354 = field778[var6];
                            String var355 = field778[var6 + 1];
                            var5--;
                            int var356 = field781[var5];
                            field781[var5++] = var354.indexOf(var355, var356);
                            continue;
                        }
                    } else if (var452 < 4300) {
                        if (var452 == 4200) {
                            var5--;
                            int var357 = field781[var5];
                            field778[var6++] = class50.method1088(var357).field1094;
                            continue;
                        }
                        if (var452 == 4201) {
                            var5 -= 2;
                            int var358 = field781[var5];
                            int var359 = field781[var5 + 1];
                            class50 var360 = class50.method1088(var358);
                            if (var359 >= 1 && var359 <= 5 && var360.field1101[var359 - 1] != null) {
                                field778[var6++] = var360.field1101[var359 - 1];
                                continue;
                            }
                            field778[var6++] = "";
                            continue;
                        }
                        if (var452 == 4202) {
                            var5 -= 2;
                            int var361 = field781[var5];
                            int var362 = field781[var5 + 1];
                            class50 var363 = class50.method1088(var361);
                            if (var362 >= 1 && var362 <= 5 && var363.field1111[var362 - 1] != null) {
                                field778[var6++] = var363.field1111[var362 - 1];
                                continue;
                            }
                            field778[var6++] = "";
                            continue;
                        }
                        if (var452 == 4203) {
                            var5--;
                            int var364 = field781[var5];
                            field781[var5++] = class50.method1088(var364).field1079;
                            continue;
                        }
                        if (var452 == 4204) {
                            var5--;
                            int var365 = field781[var5];
                            field781[var5++] = class50.method1088(var365).field1102 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4205) {
                            var5--;
                            int var366 = field781[var5];
                            class50 var367 = class50.method1088(var366);
                            if (var367.field1118 == -1 && var367.field1129 >= 0) {
                                field781[var5++] = var367.field1129;
                                continue;
                            }
                            field781[var5++] = var366;
                            continue;
                        }
                        if (var452 == 4206) {
                            var5--;
                            int var368 = field781[var5];
                            class50 var369 = class50.method1088(var368);
                            if (var369.field1118 >= 0 && var369.field1129 >= 0) {
                                field781[var5++] = var369.field1129;
                                continue;
                            }
                            field781[var5++] = var368;
                            continue;
                        }
                        if (var452 == 4207) {
                            var5--;
                            int var370 = field781[var5];
                            field781[var5++] = class50.method1088(var370).field1100 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4210) {
                            var6--;
                            String var371 = field778[var6];
                            var5--;
                            int var372 = field781[var5];
                            boolean var374 = var372 == 1;
                            String var375 = var371.toLowerCase();
                            short[] var376 = new short[16];
                            int var377 = 0;
                            int var378 = 0;
                            while (true) {
                                if (var378 >= Statics.field2132) {
                                    Statics.field188 = var376;
                                    Statics.field1968 = 0;
                                    Statics.field139 = var377;
                                    String[] var382 = new String[Statics.field139];
                                    for (int var383 = 0; var383 < Statics.field139; var383++) {
                                        var382[var383] = class50.method1088(var376[var383]).field1094;
                                    }
                                    short[] var384 = Statics.field188;
                                    class119.method827(var382, var384, 0, var382.length - 1);
                                    break;
                                }
                                class50 var379 = class50.method1088(var378);
                                if ((!var374 || var379.field1125) && var379.field1118 == -1 && var379.field1094.toLowerCase().indexOf(var375) != -1) {
                                    if (var377 >= 250) {
                                        Statics.field139 = -1;
                                        Statics.field188 = null;
                                        break;
                                    }
                                    if (var377 >= var376.length) {
                                        short[] var380 = new short[var376.length * 2];
                                        for (int var381 = 0; var381 < var377; var381++) {
                                            var380[var381] = var376[var381];
                                        }
                                        var376 = var380;
                                    }
                                    var376[var377++] = (short) var378;
                                }
                                var378++;
                            }
                            field781[var5++] = Statics.field139;
                            continue;
                        }
                        if (var452 == 4211) {
                            if (Statics.field188 != null && Statics.field1968 < Statics.field139) {
                                field781[var5++] = Statics.field188[++Statics.field1968 - 1] & 0xFFFF;
                                continue;
                            }
                            field781[var5++] = -1;
                            continue;
                        }
                        if (var452 == 4212) {
                            Statics.field1968 = 0;
                            continue;
                        }
                    } else if (var452 < 5100) {
                        if (var452 == 5000) {
                            field781[var5++] = client.field384;
                            continue;
                        }
                        if (var452 == 5001) {
                            var5 -= 3;
                            client.field384 = field781[var5];
                            Statics.field252 = class125.method2568(field781[var5 + 1]);
                            if (Statics.field252 == null) {
                                Statics.field252 = class125.field1952;
                            }
                            client.field520 = field781[var5 + 2];
                            client.field342.method2574(68);
                            client.field342.method2307(client.field384);
                            client.field342.method2307(Statics.field252.field1951);
                            client.field342.method2307(client.field520);
                            continue;
                        }
                        if (var452 == 5002) {
                            var6--;
                            String var385 = field778[var6];
                            var5 -= 2;
                            int var386 = field781[var5];
                            int var387 = field781[var5 + 1];
                            client.field342.method2574(219);
                            client.field342.method2307(class114.method2250(var385) + 2);
                            client.field342.method2313(var385);
                            client.field342.method2307(var386 - 1);
                            client.field342.method2307(var387);
                            continue;
                        }
                        if (var452 == 5003) {
                            var5 -= 2;
                            int var388 = field781[var5];
                            int var389 = field781[var5 + 1];
                            class27 var390 = (class27) class11.field171.get(var388);
                            class34 var391 = var390.method636(var389);
                            if (var391 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field778[var6++] = "";
                                field778[var6++] = "";
                                field778[var6++] = "";
                            } else {
                                field781[var5++] = var391.field775;
                                field781[var5++] = var391.field767;
                                field778[var6++] = var391.field769 == null ? "" : var391.field769;
                                field778[var6++] = var391.field770 == null ? "" : var391.field770;
                                field778[var6++] = var391.field773 == null ? "" : var391.field773;
                            }
                            continue;
                        }
                        if (var452 == 5004) {
                            var5--;
                            int var393 = field781[var5];
                            class34 var394 = (class34) class11.field177.method3473((long) var393);
                            if (var394 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field778[var6++] = "";
                                field778[var6++] = "";
                                field778[var6++] = "";
                            } else {
                                field781[var5++] = var394.field768;
                                field781[var5++] = var394.field767;
                                field778[var6++] = var394.field769 == null ? "" : var394.field769;
                                field778[var6++] = var394.field770 == null ? "" : var394.field770;
                                field778[var6++] = var394.field773 == null ? "" : var394.field773;
                            }
                            continue;
                        }
                        if (var452 == 5005) {
                            if (Statics.field252 == null) {
                                field781[var5++] = -1;
                            } else {
                                field781[var5++] = Statics.field252.field1951;
                            }
                            continue;
                        }
                        if (var452 == 5008) {
                            var6--;
                            String var396 = field778[var6];
                            var5--;
                            int var397 = field781[var5];
                            String var398 = var396.toLowerCase();
                            byte var399 = 0;
                            if (var398.startsWith(class151.field2405)) {
                                var399 = 0;
                                var396 = var396.substring(class151.field2405.length());
                            } else if (var398.startsWith(class151.field2407)) {
                                var399 = 1;
                                var396 = var396.substring(class151.field2407.length());
                            } else if (var398.startsWith(class151.field2478)) {
                                var399 = 2;
                                var396 = var396.substring(class151.field2478.length());
                            } else if (var398.startsWith(class151.field2411)) {
                                var399 = 3;
                                var396 = var396.substring(class151.field2411.length());
                            } else if (var398.startsWith(class151.field2413)) {
                                var399 = 4;
                                var396 = var396.substring(class151.field2413.length());
                            } else if (var398.startsWith(class151.field2415)) {
                                var399 = 5;
                                var396 = var396.substring(class151.field2415.length());
                            } else if (var398.startsWith(class151.field2417)) {
                                var399 = 6;
                                var396 = var396.substring(class151.field2417.length());
                            } else if (var398.startsWith(class151.field2419)) {
                                var399 = 7;
                                var396 = var396.substring(class151.field2419.length());
                            } else if (var398.startsWith(class151.field2421)) {
                                var399 = 8;
                                var396 = var396.substring(class151.field2421.length());
                            } else if (var398.startsWith(class151.field2423)) {
                                var399 = 9;
                                var396 = var396.substring(class151.field2423.length());
                            } else if (var398.startsWith(class151.field2425)) {
                                var399 = 10;
                                var396 = var396.substring(class151.field2425.length());
                            } else if (var398.startsWith(class151.field2408)) {
                                var399 = 11;
                                var396 = var396.substring(class151.field2408.length());
                            } else if (client.field376 != 0) {
                                if (var398.startsWith(class151.field2406)) {
                                    var399 = 0;
                                    var396 = var396.substring(class151.field2406.length());
                                } else if (var398.startsWith(class151.field2438)) {
                                    var399 = 1;
                                    var396 = var396.substring(class151.field2438.length());
                                } else if (var398.startsWith(class151.field2410)) {
                                    var399 = 2;
                                    var396 = var396.substring(class151.field2410.length());
                                } else if (var398.startsWith(class151.field2412)) {
                                    var399 = 3;
                                    var396 = var396.substring(class151.field2412.length());
                                } else if (var398.startsWith(class151.field2414)) {
                                    var399 = 4;
                                    var396 = var396.substring(class151.field2414.length());
                                } else if (var398.startsWith(class151.field2416)) {
                                    var399 = 5;
                                    var396 = var396.substring(class151.field2416.length());
                                } else if (var398.startsWith(class151.field2418)) {
                                    var399 = 6;
                                    var396 = var396.substring(class151.field2418.length());
                                } else if (var398.startsWith(class151.field2247)) {
                                    var399 = 7;
                                    var396 = var396.substring(class151.field2247.length());
                                } else if (var398.startsWith(class151.field2422)) {
                                    var399 = 8;
                                    var396 = var396.substring(class151.field2422.length());
                                } else if (var398.startsWith(class151.field2424)) {
                                    var399 = 9;
                                    var396 = var396.substring(class151.field2424.length());
                                } else if (var398.startsWith(class151.field2426)) {
                                    var399 = 10;
                                    var396 = var396.substring(class151.field2426.length());
                                } else if (var398.startsWith(class151.field2370)) {
                                    var399 = 11;
                                    var396 = var396.substring(class151.field2370.length());
                                }
                            }
                            String var400 = var396.toLowerCase();
                            byte var401 = 0;
                            if (var400.startsWith(class151.field2429)) {
                                var401 = 1;
                                var396 = var396.substring(class151.field2429.length());
                            } else if (var400.startsWith(class151.field2228)) {
                                var401 = 2;
                                var396 = var396.substring(class151.field2228.length());
                            } else if (var400.startsWith(class151.field2433)) {
                                var401 = 3;
                                var396 = var396.substring(class151.field2433.length());
                            } else if (var400.startsWith(class151.field2435)) {
                                var401 = 4;
                                var396 = var396.substring(class151.field2435.length());
                            } else if (var400.startsWith(class151.field2466)) {
                                var401 = 5;
                                var396 = var396.substring(class151.field2466.length());
                            } else if (client.field376 != 0) {
                                if (var400.startsWith(class151.field2241)) {
                                    var401 = 1;
                                    var396 = var396.substring(class151.field2241.length());
                                } else if (var400.startsWith(class151.field2432)) {
                                    var401 = 2;
                                    var396 = var396.substring(class151.field2432.length());
                                } else if (var400.startsWith(class151.field2434)) {
                                    var401 = 3;
                                    var396 = var396.substring(class151.field2434.length());
                                } else if (var400.startsWith(class151.field2403)) {
                                    var401 = 4;
                                    var396 = var396.substring(class151.field2403.length());
                                } else if (var400.startsWith(class151.field2239)) {
                                    var401 = 5;
                                    var396 = var396.substring(class151.field2239.length());
                                }
                            }
                            client.field342.method2574(223);
                            client.field342.method2307(0);
                            int var402 = client.field342.field1894;
                            client.field342.method2307(var397);
                            client.field342.method2307(var399);
                            client.field342.method2307(var401);
                            class117 var403 = client.field342;
                            int var404 = var403.field1894;
                            int var405 = var396.length();
                            byte[] var406 = new byte[var405];
                            for (int var407 = 0; var407 < var405; var407++) {
                                char var408 = var396.charAt(var407);
                                if (!(var408 <= 0 || var408 >= 128) || !(var408 < 160 || var408 > 255)) {
                                    var406[var407] = (byte) var408;
                                } else if (var408 == 8364) {
                                    var406[var407] = -128;
                                } else if (var408 == 8218) {
                                    var406[var407] = -126;
                                } else if (var408 == 402) {
                                    var406[var407] = -125;
                                } else if (var408 == 8222) {
                                    var406[var407] = -124;
                                } else if (var408 == 8230) {
                                    var406[var407] = -123;
                                } else if (var408 == 8224) {
                                    var406[var407] = -122;
                                } else if (var408 == 8225) {
                                    var406[var407] = -121;
                                } else if (var408 == 710) {
                                    var406[var407] = -120;
                                } else if (var408 == 8240) {
                                    var406[var407] = -119;
                                } else if (var408 == 352) {
                                    var406[var407] = -118;
                                } else if (var408 == 8249) {
                                    var406[var407] = -117;
                                } else if (var408 == 338) {
                                    var406[var407] = -116;
                                } else if (var408 == 381) {
                                    var406[var407] = -114;
                                } else if (var408 == 8216) {
                                    var406[var407] = -111;
                                } else if (var408 == 8217) {
                                    var406[var407] = -110;
                                } else if (var408 == 8220) {
                                    var406[var407] = -109;
                                } else if (var408 == 8221) {
                                    var406[var407] = -108;
                                } else if (var408 == 8226) {
                                    var406[var407] = -107;
                                } else if (var408 == 8211) {
                                    var406[var407] = -106;
                                } else if (var408 == 8212) {
                                    var406[var407] = -105;
                                } else if (var408 == 732) {
                                    var406[var407] = -104;
                                } else if (var408 == 8482) {
                                    var406[var407] = -103;
                                } else if (var408 == 353) {
                                    var406[var407] = -102;
                                } else if (var408 == 8250) {
                                    var406[var407] = -101;
                                } else if (var408 == 339) {
                                    var406[var407] = -100;
                                } else if (var408 == 382) {
                                    var406[var407] = -98;
                                } else if (var408 == 376) {
                                    var406[var407] = -97;
                                } else {
                                    var406[var407] = 63;
                                }
                            }
                            var403.method2320(var406.length);
                            var403.field1894 += Statics.field3109.method2266(var406, 0, var406.length, var403.field1891, var403.field1894);
                            client.field342.method2319(client.field342.field1894 - var402);
                            continue;
                        }
                        if (var452 == 5009) {
                            var6 -= 2;
                            String var411 = field778[var6];
                            String var412 = field778[var6 + 1];
                            client.field342.method2574(123);
                            client.field342.method2367(0);
                            int var413 = client.field342.field1894;
                            client.field342.method2313(var411);
                            class117 var414 = client.field342;
                            int var415 = var414.field1894;
                            int var416 = var412.length();
                            byte[] var417 = new byte[var416];
                            for (int var418 = 0; var418 < var416; var418++) {
                                char var419 = var412.charAt(var418);
                                if (var419 > 0 && var419 < 128 || var419 >= 160 && var419 <= 255) {
                                    var417[var418] = (byte) var419;
                                } else if (var419 == 8364) {
                                    var417[var418] = -128;
                                } else if (var419 == 8218) {
                                    var417[var418] = -126;
                                } else if (var419 == 402) {
                                    var417[var418] = -125;
                                } else if (var419 == 8222) {
                                    var417[var418] = -124;
                                } else if (var419 == 8230) {
                                    var417[var418] = -123;
                                } else if (var419 == 8224) {
                                    var417[var418] = -122;
                                } else if (var419 == 8225) {
                                    var417[var418] = -121;
                                } else if (var419 == 710) {
                                    var417[var418] = -120;
                                } else if (var419 == 8240) {
                                    var417[var418] = -119;
                                } else if (var419 == 352) {
                                    var417[var418] = -118;
                                } else if (var419 == 8249) {
                                    var417[var418] = -117;
                                } else if (var419 == 338) {
                                    var417[var418] = -116;
                                } else if (var419 == 381) {
                                    var417[var418] = -114;
                                } else if (var419 == 8216) {
                                    var417[var418] = -111;
                                } else if (var419 == 8217) {
                                    var417[var418] = -110;
                                } else if (var419 == 8220) {
                                    var417[var418] = -109;
                                } else if (var419 == 8221) {
                                    var417[var418] = -108;
                                } else if (var419 == 8226) {
                                    var417[var418] = -107;
                                } else if (var419 == 8211) {
                                    var417[var418] = -106;
                                } else if (var419 == 8212) {
                                    var417[var418] = -105;
                                } else if (var419 == 732) {
                                    var417[var418] = -104;
                                } else if (var419 == 8482) {
                                    var417[var418] = -103;
                                } else if (var419 == 353) {
                                    var417[var418] = -102;
                                } else if (var419 == 8250) {
                                    var417[var418] = -101;
                                } else if (var419 == 339) {
                                    var417[var418] = -100;
                                } else if (var419 == 382) {
                                    var417[var418] = -98;
                                } else if (var419 == 376) {
                                    var417[var418] = -97;
                                } else {
                                    var417[var418] = 63;
                                }
                            }
                            var414.method2320(var417.length);
                            var414.field1894 += Statics.field3109.method2266(var417, 0, var417.length, var414.field1891, var414.field1894);
                            client.field342.method2318(client.field342.field1894 - var413);
                            continue;
                        }
                        if (var452 == 5015) {
                            String var422;
                            if (Statics.field143 == null || Statics.field143.field53 == null) {
                                var422 = "";
                            } else {
                                var422 = Statics.field143.field53;
                            }
                            field778[var6++] = var422;
                            continue;
                        }
                        if (var452 == 5016) {
                            field781[var5++] = client.field520;
                            continue;
                        }
                        if (var452 == 5017) {
                            var5--;
                            int var423 = field781[var5];
                            int[] var424 = field781;
                            int var425 = var5++;
                            class27 var426 = (class27) class11.field171.get(var423);
                            int var427;
                            if (var426 == null) {
                                var427 = 0;
                            } else {
                                var427 = var426.method637();
                            }
                            var424[var425] = var427;
                            continue;
                        }
                        if (var452 == 5018) {
                            var5--;
                            int var428 = field781[var5];
                            field781[var5++] = class11.method2154(var428);
                            continue;
                        }
                        if (var452 == 5019) {
                            var5--;
                            int var429 = field781[var5];
                            field781[var5++] = class11.method120(var429);
                            continue;
                        }
                        if (var452 == 5020) {
                            var6--;
                            String var430 = field778[var6];
                            if (var430.equalsIgnoreCase("toggleroof")) {
                                Statics.field1870.field145 = !Statics.field1870.field145;
                                Statics.method2571();
                                if (Statics.field1870.field145) {
                                    class11.method1792(99, "", "Roofs are now all hidden");
                                } else {
                                    class11.method1792(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var430.equalsIgnoreCase("displayfps")) {
                                client.field318 = !client.field318;
                            }
                            if (client.field468 >= 2) {
                                if (var430.equalsIgnoreCase("fpson")) {
                                    client.field318 = true;
                                }
                                if (var430.equalsIgnoreCase("fpsoff")) {
                                    client.field318 = false;
                                }
                                if (var430.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var430.equalsIgnoreCase("clientdrop")) {
                                    client.method1270();
                                }
                                if (var430.equalsIgnoreCase("errortest") && client.field398 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field342.method2574(188);
                            client.field342.method2307(var430.length() + 1);
                            client.field342.method2313(var430);
                            continue;
                        }
                        if (var452 == 5021) {
                            var6--;
                            client.field521 = field778[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var452 == 5022) {
                            field778[var6++] = client.field521;
                            continue;
                        }
                    }
                }
                if (var452 < 5400) {
                    if (var452 == 5306) {
                        field781[var5++] = client.method563();
                        continue;
                    }
                    if (var452 == 5307) {
                        var5--;
                        int var431 = field781[var5];
                        if (var431 == 1 || var431 == 2) {
                            client.method901(var431);
                        }
                        continue;
                    }
                    if (var452 == 5308) {
                        field781[var5++] = Statics.field1870.field148;
                        continue;
                    }
                    if (var452 == 5309) {
                        var5--;
                        int var432 = field781[var5];
                        if (var432 == 1 || var432 == 2) {
                            Statics.field1870.field148 = var432;
                            Statics.method2571();
                        }
                        continue;
                    }
                }
                if (var452 < 5600 && var452 == 5504) {
                    var5 -= 2;
                    int var433 = field781[var5];
                    int var434 = field781[var5 + 1];
                    if (!client.field550) {
                        client.field394 = var433;
                        client.field574 = var434;
                    }
                } else if (var452 < 5700 && var452 == 5630) {
                    client.field352 = 250;
                } else {
                    if (var452 < 6300) {
                        if (var452 == 6200) {
                            var5 -= 2;
                            client.field556 = (short) field781[var5];
                            if (client.field556 <= 0) {
                                client.field556 = 256;
                            }
                            client.field349 = (short) field781[var5 + 1];
                            if (client.field349 <= 0) {
                                client.field349 = 205;
                            }
                            continue;
                        }
                        if (var452 == 6201) {
                            var5 -= 2;
                            client.field499 = (short) field781[var5];
                            if (client.field499 <= 0) {
                                client.field499 = 256;
                            }
                            client.field410 = (short) field781[var5 + 1];
                            if (client.field410 <= 0) {
                                client.field410 = 320;
                            }
                            continue;
                        }
                        if (var452 == 6202) {
                            var5 -= 4;
                            client.field570 = (short) field781[var5];
                            if (client.field570 <= 0) {
                                client.field570 = 1;
                            }
                            client.field561 = (short) field781[var5 + 1];
                            if (client.field561 <= 0) {
                                client.field561 = 32767;
                            } else if (client.field561 < client.field570) {
                                client.field561 = client.field570;
                            }
                            client.field553 = (short) field781[var5 + 2];
                            if (client.field553 <= 0) {
                                client.field553 = 1;
                            }
                            client.field325 = (short) field781[var5 + 3];
                            if (client.field325 <= 0) {
                                client.field325 = 32767;
                            } else if (client.field325 < client.field553) {
                                client.field325 = client.field553;
                            }
                            continue;
                        }
                        if (var452 == 6203) {
                            if (client.field473 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = -1;
                            } else {
                                client.method702(0, 0, client.field473.field2691, client.field473.field2692, false);
                                field781[var5++] = client.field566;
                                field781[var5++] = client.field567;
                            }
                            continue;
                        }
                        if (var452 == 6204) {
                            field781[var5++] = client.field499;
                            field781[var5++] = client.field410;
                            continue;
                        }
                        if (var452 == 6205) {
                            field781[var5++] = client.field556;
                            field781[var5++] = client.field349;
                            continue;
                        }
                    }
                    if (var452 < 6600) {
                        if (var452 == 6500) {
                            field781[var5++] = class25.method3301() ? 1 : 0;
                            continue;
                        }
                        if (var452 == 6501) {
                            class25.field644 = 0;
                            class25 var435 = class25.method2262();
                            if (var435 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field778[var6++] = "";
                                field781[var5++] = 0;
                                field781[var5++] = 0;
                                field778[var6++] = "";
                            } else {
                                field781[var5++] = var435.field650;
                                field781[var5++] = var435.field641;
                                field778[var6++] = var435.field651;
                                field781[var5++] = var435.field652;
                                field781[var5++] = var435.field649;
                                field778[var6++] = var435.field638;
                            }
                            continue;
                        }
                        if (var452 == 6502) {
                            class25 var437 = class25.method2262();
                            if (var437 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field778[var6++] = "";
                                field781[var5++] = 0;
                                field781[var5++] = 0;
                                field778[var6++] = "";
                            } else {
                                field781[var5++] = var437.field650;
                                field781[var5++] = var437.field641;
                                field778[var6++] = var437.field651;
                                field781[var5++] = var437.field652;
                                field781[var5++] = var437.field649;
                                field778[var6++] = var437.field638;
                            }
                            continue;
                        }
                        if (var452 == 6506) {
                            var5--;
                            int var438 = field781[var5];
                            class25 var439 = null;
                            for (int var440 = 0; var440 < class25.field643; var440++) {
                                if (Statics.field642[var440].field650 == var438) {
                                    var439 = Statics.field642[var440];
                                    break;
                                }
                            }
                            if (var439 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field778[var6++] = "";
                                field781[var5++] = 0;
                                field781[var5++] = 0;
                                field778[var6++] = "";
                            } else {
                                field781[var5++] = var439.field650;
                                field781[var5++] = var439.field641;
                                field778[var6++] = var439.field651;
                                field781[var5++] = var439.field652;
                                field781[var5++] = var439.field649;
                                field778[var6++] = var439.field638;
                            }
                            continue;
                        }
                        if (var452 == 6507) {
                            var5 -= 4;
                            int var441 = field781[var5];
                            boolean var442 = field781[var5 + 1] == 1;
                            int var443 = field781[var5 + 2];
                            boolean var444 = field781[var5 + 3] == 1;
                            class25.method94(var441, var442, var443, var444);
                            continue;
                        }
                        if (var452 == 6511) {
                            var5--;
                            int var445 = field781[var5];
                            if (var445 >= 0 && var445 < class25.field643) {
                                class25 var446 = Statics.field642[var445];
                                field781[var5++] = var446.field650;
                                field781[var5++] = var446.field641;
                                field778[var6++] = var446.field651;
                                field781[var5++] = var446.field652;
                                field781[var5++] = var446.field649;
                                field778[var6++] = var446.field638;
                                continue;
                            }
                            field781[var5++] = -1;
                            field781[var5++] = 0;
                            field778[var6++] = "";
                            field781[var5++] = 0;
                            field781[var5++] = 0;
                            field778[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var451) {
            StringBuilder var448 = new StringBuilder(30);
            var448.append("").append(var4.field3043).append(" ");
            for (int var449 = field783 - 1; var449 >= 0; var449--) {
                var448.append("").append(field784[var449].field213.field3043).append(" ");
            }
            var448.append("").append(var10);
            class143.method1973(var448.toString(), var451);
        }
    }

    @ObfuscatedName("ak.z(II)V")
    public static void method654(int arg0) {
        if (arg0 == -1 || !class167.method2884(arg0)) {
            return;
        }
        class167[] var1 = Statics.field1130[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            if (var3.field2755 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field4 = var3.field2755;
                method701(var4, 2000000);
            }
        }
    }
}
