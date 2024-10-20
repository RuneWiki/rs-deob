package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("au")
public class class37 {

    @ObfuscatedName("au.r")
    public static int[] field793 = new int[5];

    @ObfuscatedName("au.u")
    public static int[][] field797 = new int[5][5000];

    @ObfuscatedName("au.j")
    public static int[] field790 = new int[1000];

    @ObfuscatedName("au.w")
    public static String[] field804 = new String[1000];

    @ObfuscatedName("au.y")
    public static int field796 = 0;

    @ObfuscatedName("au.o")
    public static class15[] field798 = new class15[50];

    @ObfuscatedName("au.v")
    public static Calendar field799 = Calendar.getInstance();

    @ObfuscatedName("au.p")
    public static final String[] field800 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("au.m")
    public static int field801 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.n(Ln;I)V")
    public static void method591(class1 arg0) {
        method1253(arg0, 200000);
    }

    @ObfuscatedName("bg.q(Ln;II)V")
    public static void method1253(class1 arg0, int arg1) {
        Object[] var2 = arg0.field2;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method2043(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field594;
        int[] var9 = var4.field595;
        byte var10 = -1;
        field796 = 0;
        try {
            Statics.field795 = new int[var4.field597];
            int var11 = 0;
            Statics.field3127 = new String[var4.field598];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2746;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2747;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field13 == null ? -1 : arg0.field13.field2746;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field13 == null ? -1 : arg0.field13.field2747;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field795[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field3127[var12++] = var15;
                }
            }
            int var16 = 0;
            field801 = arg0.field7;
            label2973: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var456 = var8[var7];
                if (var456 < 100) {
                    if (var456 == 0) {
                        field790[var5++] = var9[var7];
                        continue;
                    }
                    if (var456 == 1) {
                        int var17 = var9[var7];
                        field790[var5++] = class176.field2896[var17];
                        continue;
                    }
                    if (var456 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2896[var18] = field790[var5];
                        client.method2707(var18);
                        continue;
                    }
                    if (var456 == 3) {
                        field804[var6++] = var4.field604[var7];
                        continue;
                    }
                    if (var456 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var456 == 7) {
                        var5 -= 2;
                        if (field790[var5 + 1] != field790[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var456 == 8) {
                        var5 -= 2;
                        if (field790[var5 + 1] == field790[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var456 == 9) {
                        var5 -= 2;
                        if (field790[var5] < field790[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var456 == 10) {
                        var5 -= 2;
                        if (field790[var5] > field790[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var456 == 21) {
                        if (field796 == 0) {
                            return;
                        }
                        class15 var19 = field798[--field796];
                        var4 = var19.field221;
                        var8 = var4.field594;
                        var9 = var4.field595;
                        var7 = var19.field216;
                        Statics.field795 = var19.field217;
                        Statics.field3127 = var19.field218;
                        continue;
                    }
                    if (var456 == 25) {
                        int var20 = var9[var7];
                        field790[var5++] = class176.method2038(var20);
                        continue;
                    }
                    if (var456 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method2042(var21, field790[var5]);
                        continue;
                    }
                    if (var456 == 31) {
                        var5 -= 2;
                        if (field790[var5] <= field790[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var456 == 32) {
                        var5 -= 2;
                        if (field790[var5] >= field790[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var456 == 33) {
                        field790[var5++] = Statics.field795[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var456 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field795[var10001] = field790[var5];
                        continue;
                    }
                    if (var456 == 35) {
                        field804[var6++] = Statics.field3127[var9[var7]];
                        continue;
                    }
                    if (var456 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field3127[var10001] = field804[var6];
                        continue;
                    }
                    if (var456 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field804;
                        String var24;
                        if (var22 == 0) {
                            var24 = "";
                        } else if (var22 == 1) {
                            String var25 = var23[var6];
                            if (var25 == null) {
                                var24 = "null";
                            } else {
                                var24 = var25.toString();
                            }
                        } else {
                            int var26 = var6 + var22;
                            int var27 = 0;
                            for (int var28 = var6; var28 < var26; var28++) {
                                String var29 = var23[var28];
                                if (var29 == null) {
                                    var27 += 4;
                                } else {
                                    var27 += var29.length();
                                }
                            }
                            StringBuilder var30 = new StringBuilder(var27);
                            for (int var31 = var6; var31 < var26; var31++) {
                                String var32 = var23[var31];
                                if (var32 == null) {
                                    var30.append("null");
                                } else {
                                    var30.append(var32);
                                }
                            }
                            var24 = var30.toString();
                        }
                        field804[var6++] = var24;
                        continue;
                    }
                    if (var456 == 38) {
                        var5--;
                        continue;
                    }
                    if (var456 == 39) {
                        var6--;
                        continue;
                    }
                    if (var456 == 40) {
                        int var34 = var9[var7];
                        class23 var35 = class23.method2043(var34);
                        int[] var36 = new int[var35.field597];
                        String[] var37 = new String[var35.field598];
                        for (int var38 = 0; var38 < var35.field599; var38++) {
                            var36[var38] = field790[var5 - var35.field599 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field600; var39++) {
                            var37[var39] = field804[var6 - var35.field600 + var39];
                        }
                        var5 -= var35.field599;
                        var6 -= var35.field600;
                        class15 var40 = new class15();
                        var40.field221 = var4;
                        var40.field216 = var7;
                        var40.field217 = Statics.field795;
                        var40.field218 = Statics.field3127;
                        field798[++field796 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field594;
                        var9 = var35.field595;
                        var7 = -1;
                        Statics.field795 = var36;
                        Statics.field3127 = var37;
                        continue;
                    }
                    if (var456 == 42) {
                        field790[var5++] = Statics.field2260.method204(var9[var7]);
                        continue;
                    }
                    if (var456 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2260.method226(var10001, field790[var5]);
                        continue;
                    }
                    if (var456 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field790[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field793[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2973;
                                }
                                field797[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var456 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field790[var5];
                        if (var47 >= 0 && var47 < field793[var46]) {
                            field790[var5++] = field797[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var456 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field790[var5];
                        if (var49 >= 0 && var49 < field793[var48]) {
                            field797[var48][var49] = field790[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var456 == 47) {
                        String var50 = Statics.field2260.method224(var9[var7]);
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field804[var6++] = var50;
                        continue;
                    }
                    if (var456 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2260.method205(var10001, field804[var6]);
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var456 < 1000) {
                    if (var456 == 100) {
                        var5 -= 3;
                        int var52 = field790[var5];
                        int var53 = field790[var5 + 1];
                        int var54 = field790[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var55 = class173.method2934(var52);
                        if (var55.field2793 == null) {
                            var55.field2793 = new class173[var54 + 1];
                        }
                        if (var55.field2793.length <= var54) {
                            class173[] var56 = new class173[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2793.length; var57++) {
                                var56[var57] = var55.field2793[var57];
                            }
                            var55.field2793 = var56;
                        }
                        if (var54 > 0 && var55.field2793[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class173 var58 = new class173();
                        var58.field2748 = var53;
                        var58.field2849 = var58.field2746 = var55.field2746;
                        var58.field2747 = var54;
                        var58.field2745 = true;
                        var55.field2793[var54] = var58;
                        if (var51) {
                            Statics.field1948 = var58;
                        } else {
                            Statics.field274 = var58;
                        }
                        client.method1964(var55);
                        continue;
                    }
                    if (var456 == 101) {
                        class173 var59 = var51 ? Statics.field1948 : Statics.field274;
                        class173 var60 = class173.method2934(var59.field2746);
                        var60.field2793[var59.field2747] = null;
                        client.method1964(var60);
                        continue;
                    }
                    if (var456 == 102) {
                        var5--;
                        class173 var61 = class173.method2934(field790[var5]);
                        var61.field2793 = null;
                        client.method1964(var61);
                        continue;
                    }
                    if (var456 == 200) {
                        var5 -= 2;
                        int var62 = field790[var5];
                        int var63 = field790[var5 + 1];
                        class173 var64 = class173.method2858(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field790[var5++] = 1;
                            if (var51) {
                                Statics.field1948 = var64;
                            } else {
                                Statics.field274 = var64;
                            }
                            continue;
                        }
                        field790[var5++] = 0;
                        continue;
                    }
                    if (var456 == 201) {
                        var5--;
                        class173 var65 = class173.method2934(field790[var5]);
                        if (var65 == null) {
                            field790[var5++] = 0;
                        } else {
                            field790[var5++] = 1;
                            if (var51) {
                                Statics.field1948 = var65;
                            } else {
                                Statics.field274 = var65;
                            }
                        }
                        continue;
                    }
                } else if (var456 >= 1000 && var456 < 1100 || var456 >= 2000 && var456 < 2100) {
                    int var66 = -1;
                    class173 var67;
                    if (var456 >= 2000) {
                        var456 -= 1000;
                        var5--;
                        var66 = field790[var5];
                        var67 = class173.method2934(var66);
                    } else {
                        var67 = var51 ? Statics.field1948 : Statics.field274;
                    }
                    if (var456 == 1000) {
                        var5 -= 4;
                        var67.field2818 = field790[var5];
                        var67.field2756 = field790[var5 + 1];
                        var67.field2751 = field790[var5 + 2];
                        var67.field2752 = field790[var5 + 3];
                        client.method1964(var67);
                        client.method190(var67);
                        if (var66 != -1 && var67.field2748 == 0) {
                            client.method3(Statics.field2862[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var456 == 1001) {
                        var5 -= 4;
                        var67.field2761 = field790[var5];
                        var67.field2758 = field790[var5 + 1];
                        var67.field2753 = field790[var5 + 2];
                        var67.field2754 = field790[var5 + 3];
                        client.method1964(var67);
                        client.method190(var67);
                        if (var66 != -1 && var67.field2748 == 0) {
                            client.method3(Statics.field2862[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var456 == 1003) {
                        var5--;
                        boolean var68 = field790[var5] == 1;
                        if (var67.field2766 != var68) {
                            var67.field2766 = var68;
                            client.method1964(var67);
                        }
                        continue;
                    }
                    if (var456 == 1005) {
                        var5--;
                        var67.field2877 = field790[var5] == 1;
                        continue;
                    }
                    if (var456 == 1006) {
                        var5--;
                        var67.field2878 = field790[var5] == 1;
                        continue;
                    }
                } else if (!(var456 < 1100 || var456 >= 1200) || !(var456 < 2100 || var456 >= 2200)) {
                    int var69 = -1;
                    class173 var70;
                    if (var456 >= 2000) {
                        var456 -= 1000;
                        var5--;
                        var69 = field790[var5];
                        var70 = class173.method2934(var69);
                    } else {
                        var70 = var51 ? Statics.field1948 : Statics.field274;
                    }
                    if (var456 == 1100) {
                        var5 -= 2;
                        var70.field2767 = field790[var5];
                        if (var70.field2767 > var70.field2769 - var70.field2828) {
                            var70.field2767 = var70.field2769 - var70.field2828;
                        }
                        if (var70.field2767 < 0) {
                            var70.field2767 = 0;
                        }
                        var70.field2839 = field790[var5 + 1];
                        if (var70.field2839 > var70.field2825 - var70.field2762) {
                            var70.field2839 = var70.field2825 - var70.field2762;
                        }
                        if (var70.field2839 < 0) {
                            var70.field2839 = 0;
                        }
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1101) {
                        var5--;
                        var70.field2771 = field790[var5];
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1102) {
                        var5--;
                        var70.field2856 = field790[var5] == 1;
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1103) {
                        var5--;
                        var70.field2776 = field790[var5];
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1104) {
                        var5--;
                        var70.field2777 = field790[var5];
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1105) {
                        var5--;
                        var70.field2775 = field790[var5];
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1106) {
                        var5--;
                        var70.field2781 = field790[var5];
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1107) {
                        var5--;
                        var70.field2827 = field790[var5] == 1;
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1108) {
                        var70.field2822 = 1;
                        var5--;
                        var70.field2791 = field790[var5];
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1109) {
                        var5 -= 6;
                        var70.field2813 = field790[var5];
                        var70.field2879 = field790[var5 + 1];
                        var70.field2797 = field790[var5 + 2];
                        var70.field2847 = field790[var5 + 3];
                        var70.field2770 = field790[var5 + 4];
                        var70.field2772 = field790[var5 + 5];
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1110) {
                        var5--;
                        int var71 = field790[var5];
                        if (var70.field2814 != var71) {
                            var70.field2814 = var71;
                            var70.field2866 = 0;
                            var70.field2867 = 0;
                            client.method1964(var70);
                        }
                        continue;
                    }
                    if (var456 == 1111) {
                        var5--;
                        var70.field2801 = field790[var5] == 1;
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1112) {
                        var6--;
                        String var72 = field804[var6];
                        if (!var72.equals(var70.field2804)) {
                            var70.field2804 = var72;
                            client.method1964(var70);
                        }
                        continue;
                    }
                    if (var456 == 1113) {
                        var5--;
                        var70.field2803 = field790[var5];
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1114) {
                        var5 -= 3;
                        var70.field2868 = field790[var5];
                        var70.field2808 = field790[var5 + 1];
                        var70.field2815 = field790[var5 + 2];
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1115) {
                        var5--;
                        var70.field2809 = field790[var5] == 1;
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1116) {
                        var5--;
                        var70.field2783 = field790[var5];
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1117) {
                        var5--;
                        var70.field2784 = field790[var5];
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1118) {
                        var5--;
                        var70.field2787 = field790[var5] == 1;
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1119) {
                        var5--;
                        var70.field2786 = field790[var5] == 1;
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1120) {
                        var5 -= 2;
                        var70.field2769 = field790[var5];
                        var70.field2825 = field790[var5 + 1];
                        client.method1964(var70);
                        if (var69 != -1 && var70.field2748 == 0) {
                            client.method3(Statics.field2862[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var456 == 1121) {
                        client.method1(var70.field2746, var70.field2747);
                        client.field560 = var70;
                        client.method1964(var70);
                        continue;
                    }
                    if (var456 == 1122) {
                        var5--;
                        var70.field2780 = field790[var5];
                        client.method1964(var70);
                        continue;
                    }
                } else if (!(var456 < 1200 || var456 >= 1300) || !(var456 < 2200 || var456 >= 2300)) {
                    class173 var73;
                    if (var456 >= 2000) {
                        var456 -= 1000;
                        var5--;
                        var73 = class173.method2934(field790[var5]);
                    } else {
                        var73 = var51 ? Statics.field1948 : Statics.field274;
                    }
                    client.method1964(var73);
                    if (var456 == 1200 || var456 == 1205 || var456 == 1212) {
                        var5 -= 2;
                        int var74 = field790[var5];
                        int var75 = field790[var5 + 1];
                        var73.field2750 = var74;
                        var73.field2865 = var75;
                        class52 var76 = class52.method724(var74);
                        var73.field2797 = var76.field1119;
                        var73.field2847 = var76.field1130;
                        var73.field2770 = var76.field1146;
                        var73.field2813 = var76.field1122;
                        var73.field2879 = var76.field1123;
                        var73.field2772 = var76.field1118;
                        if (var456 == 1205) {
                            var73.field2785 = 0;
                        } else if (var456 == 1212 | var76.field1124 == 1) {
                            var73.field2785 = 1;
                        } else {
                            var73.field2785 = 2;
                        }
                        if (var73.field2821 > 0) {
                            var73.field2772 = var73.field2772 * 32 / var73.field2821;
                        } else if (var73.field2761 > 0) {
                            var73.field2772 = var73.field2772 * 32 / var73.field2761;
                        }
                        continue;
                    }
                    if (var456 == 1201) {
                        var73.field2822 = 2;
                        var5--;
                        var73.field2791 = field790[var5];
                        continue;
                    }
                    if (var456 == 1202) {
                        var73.field2822 = 3;
                        var73.field2791 = Statics.field180.field37.method3237();
                        continue;
                    }
                } else if (var456 >= 1300 && var456 < 1400 || var456 >= 2300 && var456 < 2400) {
                    class173 var77;
                    if (var456 >= 2000) {
                        var456 -= 1000;
                        var5--;
                        var77 = class173.method2934(field790[var5]);
                    } else {
                        var77 = var51 ? Statics.field1948 : Statics.field274;
                    }
                    if (var456 == 1300) {
                        var5--;
                        int var78 = field790[var5] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var6--;
                            var77.method3162(var78, field804[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var456 == 1301) {
                        var5 -= 2;
                        int var79 = field790[var5];
                        int var80 = field790[var5 + 1];
                        var77.field2819 = class173.method2858(var79, var80);
                        continue;
                    }
                    if (var456 == 1302) {
                        var5--;
                        var77.field2842 = field790[var5] == 1;
                        continue;
                    }
                    if (var456 == 1303) {
                        var5--;
                        var77.field2820 = field790[var5];
                        continue;
                    }
                    if (var456 == 1304) {
                        var5--;
                        var77.field2811 = field790[var5];
                        continue;
                    }
                    if (var456 == 1305) {
                        var6--;
                        var77.field2817 = field804[var6];
                        continue;
                    }
                    if (var456 == 1306) {
                        var6--;
                        var77.field2823 = field804[var6];
                        continue;
                    }
                    if (var456 == 1307) {
                        var77.field2807 = null;
                        continue;
                    }
                } else {
                    if (var456 >= 1400 && var456 < 1500 || var456 >= 2400 && var456 < 2500) {
                        class173 var81;
                        if (var456 >= 2000) {
                            var456 -= 1000;
                            var5--;
                            var81 = class173.method2934(field790[var5]);
                        } else {
                            var81 = var51 ? Statics.field1948 : Statics.field274;
                        }
                        var6--;
                        String var82 = field804[var6];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var5--;
                            int var84 = field790[var5];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var5--;
                                    var83[var84] = field790[var5];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var6--;
                                var85[var86] = field804[var6];
                            } else {
                                var5--;
                                var85[var86] = Integer.valueOf(field790[var5]);
                            }
                        }
                        var5--;
                        int var87 = field790[var5];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var456 == 1400) {
                            var81.field2826 = var85;
                        }
                        if (var456 == 1401) {
                            var81.field2829 = var85;
                        }
                        if (var456 == 1402) {
                            var81.field2774 = var85;
                        }
                        if (var456 == 1403) {
                            var81.field2830 = var85;
                        }
                        if (var456 == 1404) {
                            var81.field2832 = var85;
                        }
                        if (var456 == 1405) {
                            var81.field2833 = var85;
                        }
                        if (var456 == 1406) {
                            var81.field2840 = var85;
                        }
                        if (var456 == 1407) {
                            var81.field2837 = var85;
                            var81.field2768 = var83;
                        }
                        if (var456 == 1408) {
                            var81.field2843 = var85;
                        }
                        if (var456 == 1409) {
                            var81.field2854 = var85;
                        }
                        if (var456 == 1410) {
                            var81.field2834 = var85;
                        }
                        if (var456 == 1411) {
                            var81.field2858 = var85;
                        }
                        if (var456 == 1412) {
                            var81.field2876 = var85;
                        }
                        if (var456 == 1414) {
                            var81.field2836 = var85;
                            var81.field2779 = var83;
                        }
                        if (var456 == 1415) {
                            var81.field2841 = var85;
                            var81.field2859 = var83;
                        }
                        if (var456 == 1416) {
                            var81.field2835 = var85;
                        }
                        if (var456 == 1417) {
                            var81.field2845 = var85;
                        }
                        if (var456 == 1418) {
                            var81.field2846 = var85;
                        }
                        if (var456 == 1419) {
                            var81.field2850 = var85;
                        }
                        if (var456 == 1420) {
                            var81.field2848 = var85;
                        }
                        if (var456 == 1421) {
                            var81.field2790 = var85;
                        }
                        if (var456 == 1422) {
                            var81.field2802 = var85;
                        }
                        if (var456 == 1423) {
                            var81.field2851 = var85;
                        }
                        if (var456 == 1424) {
                            var81.field2852 = var85;
                        }
                        if (var456 == 1425) {
                            var81.field2838 = var85;
                        }
                        if (var456 == 1426) {
                            var81.field2855 = var85;
                        }
                        if (var456 == 1427) {
                            var81.field2853 = var85;
                        }
                        var81.field2824 = true;
                        continue;
                    }
                    if (var456 < 1600) {
                        class173 var88 = var51 ? Statics.field1948 : Statics.field274;
                        if (var456 == 1500) {
                            field790[var5++] = var88.field2759;
                            continue;
                        }
                        if (var456 == 1501) {
                            field790[var5++] = var88.field2760;
                            continue;
                        }
                        if (var456 == 1502) {
                            field790[var5++] = var88.field2828;
                            continue;
                        }
                        if (var456 == 1503) {
                            field790[var5++] = var88.field2762;
                            continue;
                        }
                        if (var456 == 1504) {
                            field790[var5++] = var88.field2766 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 1505) {
                            field790[var5++] = var88.field2849;
                            continue;
                        }
                    } else if (var456 < 1700) {
                        class173 var89 = var51 ? Statics.field1948 : Statics.field274;
                        if (var456 == 1600) {
                            field790[var5++] = var89.field2767;
                            continue;
                        }
                        if (var456 == 1601) {
                            field790[var5++] = var89.field2839;
                            continue;
                        }
                        if (var456 == 1602) {
                            field804[var6++] = var89.field2804;
                            continue;
                        }
                        if (var456 == 1603) {
                            field790[var5++] = var89.field2769;
                            continue;
                        }
                        if (var456 == 1604) {
                            field790[var5++] = var89.field2825;
                            continue;
                        }
                        if (var456 == 1605) {
                            field790[var5++] = var89.field2772;
                            continue;
                        }
                        if (var456 == 1606) {
                            field790[var5++] = var89.field2797;
                            continue;
                        }
                        if (var456 == 1607) {
                            field790[var5++] = var89.field2770;
                            continue;
                        }
                        if (var456 == 1608) {
                            field790[var5++] = var89.field2847;
                            continue;
                        }
                        if (var456 == 1609) {
                            field790[var5++] = var89.field2776;
                            continue;
                        }
                    } else if (var456 < 1800) {
                        class173 var90 = var51 ? Statics.field1948 : Statics.field274;
                        if (var456 == 1700) {
                            field790[var5++] = var90.field2750;
                            continue;
                        }
                        if (var456 == 1701) {
                            if (var90.field2750 == -1) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = var90.field2865;
                            }
                            continue;
                        }
                        if (var456 == 1702) {
                            field790[var5++] = var90.field2747;
                            continue;
                        }
                    } else if (var456 < 1900) {
                        class173 var91 = var51 ? Statics.field1948 : Statics.field274;
                        if (var456 == 1800) {
                            field790[var5++] = class178.method727(client.method721(var91));
                            continue;
                        }
                        if (var456 == 1801) {
                            var5--;
                            int var92 = field790[var5];
                            int var457 = var92 - 1;
                            if (var91.field2807 != null && var457 < var91.field2807.length && var91.field2807[var457] != null) {
                                field804[var6++] = var91.field2807[var457];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var456 == 1802) {
                            if (var91.field2817 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = var91.field2817;
                            }
                            continue;
                        }
                    } else if (!(var456 < 1900 || var456 >= 2000) || !(var456 < 2900 || var456 >= 3000)) {
                        class173 var93;
                        if (var456 >= 2000) {
                            var456 -= 1000;
                            var5--;
                            var93 = class173.method2934(field790[var5]);
                        } else {
                            var93 = var51 ? Statics.field1948 : Statics.field274;
                        }
                        if (var456 == 1927) {
                            if (field801 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var93.field2853 == null) {
                                return;
                            }
                            class1 var94 = new class1();
                            var94.field3 = var93;
                            var94.field2 = var93.field2853;
                            var94.field7 = field801 + 1;
                            client.field346.method3544(arg0);
                            continue;
                        }
                    } else if (var456 < 2600) {
                        var5--;
                        class173 var95 = class173.method2934(field790[var5]);
                        if (var456 == 2500) {
                            field790[var5++] = var95.field2759;
                            continue;
                        }
                        if (var456 == 2501) {
                            field790[var5++] = var95.field2760;
                            continue;
                        }
                        if (var456 == 2502) {
                            field790[var5++] = var95.field2828;
                            continue;
                        }
                        if (var456 == 2503) {
                            field790[var5++] = var95.field2762;
                            continue;
                        }
                        if (var456 == 2504) {
                            field790[var5++] = var95.field2766 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 2505) {
                            field790[var5++] = var95.field2849;
                            continue;
                        }
                    } else if (var456 < 2700) {
                        var5--;
                        class173 var96 = class173.method2934(field790[var5]);
                        if (var456 == 2600) {
                            field790[var5++] = var96.field2767;
                            continue;
                        }
                        if (var456 == 2601) {
                            field790[var5++] = var96.field2839;
                            continue;
                        }
                        if (var456 == 2602) {
                            field804[var6++] = var96.field2804;
                            continue;
                        }
                        if (var456 == 2603) {
                            field790[var5++] = var96.field2769;
                            continue;
                        }
                        if (var456 == 2604) {
                            field790[var5++] = var96.field2825;
                            continue;
                        }
                        if (var456 == 2605) {
                            field790[var5++] = var96.field2772;
                            continue;
                        }
                        if (var456 == 2606) {
                            field790[var5++] = var96.field2797;
                            continue;
                        }
                        if (var456 == 2607) {
                            field790[var5++] = var96.field2770;
                            continue;
                        }
                        if (var456 == 2608) {
                            field790[var5++] = var96.field2847;
                            continue;
                        }
                        if (var456 == 2609) {
                            field790[var5++] = var96.field2776;
                            continue;
                        }
                    } else if (var456 < 2800) {
                        if (var456 == 2700) {
                            var5--;
                            class173 var97 = class173.method2934(field790[var5]);
                            field790[var5++] = var97.field2750;
                            continue;
                        }
                        if (var456 == 2701) {
                            var5--;
                            class173 var98 = class173.method2934(field790[var5]);
                            if (var98.field2750 == -1) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = var98.field2865;
                            }
                            continue;
                        }
                        if (var456 == 2702) {
                            var5--;
                            int var99 = field790[var5];
                            class4 var100 = (class4) client.field546.method3518((long) var99);
                            if (var100 == null) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = 1;
                            }
                            continue;
                        }
                        if (var456 == 2706) {
                            field790[var5++] = client.field452;
                            continue;
                        }
                    } else if (var456 < 2900) {
                        var5--;
                        class173 var101 = class173.method2934(field790[var5]);
                        if (var456 == 2800) {
                            field790[var5++] = class178.method727(client.method721(var101));
                            continue;
                        }
                        if (var456 == 2801) {
                            var5--;
                            int var102 = field790[var5];
                            int var458 = var102 - 1;
                            if (var101.field2807 != null && var458 < var101.field2807.length && var101.field2807[var458] != null) {
                                field804[var6++] = var101.field2807[var458];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var456 == 2802) {
                            if (var101.field2817 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = var101.field2817;
                            }
                            continue;
                        }
                    } else if (var456 < 3200) {
                        if (var456 == 3100) {
                            var6--;
                            String var103 = field804[var6];
                            class12.method3686(0, "", var103);
                            continue;
                        }
                        if (var456 == 3101) {
                            var5 -= 2;
                            client.method3126(Statics.field180, field790[var5], field790[var5 + 1]);
                            continue;
                        }
                        if (var456 == 3103) {
                            client.method193();
                            continue;
                        }
                        if (var456 == 3104) {
                            var6--;
                            String var104 = field804[var6];
                            int var105 = 0;
                            boolean var106 = false;
                            boolean var107 = false;
                            int var108 = 0;
                            int var109 = var104.length();
                            int var110 = 0;
                            boolean var112;
                            while (true) {
                                if (var110 >= var109) {
                                    var112 = var107;
                                    break;
                                }
                                label3233: {
                                    char var111 = var104.charAt(var110);
                                    if (var110 == 0) {
                                        if (var111 == '-') {
                                            var106 = true;
                                            break label3233;
                                        }
                                        if (var111 == '+') {
                                            break label3233;
                                        }
                                    }
                                    int var459;
                                    if (var111 >= '0' && var111 <= '9') {
                                        var459 = var111 - '0';
                                    } else if (var111 >= 'A' && var111 <= 'Z') {
                                        var459 = var111 - '7';
                                    } else {
                                        if (var111 < 'a' || var111 > 'z') {
                                            var112 = false;
                                            break;
                                        }
                                        var459 = var111 - 'W';
                                    }
                                    if (var459 >= 10) {
                                        var112 = false;
                                        break;
                                    }
                                    if (var106) {
                                        var459 = -var459;
                                    }
                                    int var113 = var108 * 10 + var459;
                                    if (var113 / 10 != var108) {
                                        var112 = false;
                                        break;
                                    }
                                    var108 = var113;
                                    var107 = true;
                                }
                                var110++;
                            }
                            if (var112) {
                                int var115 = class163.method2155(var104, 10, true);
                                var105 = var115;
                            }
                            client.field388.method2592(236);
                            client.field388.method2348(var105);
                            continue;
                        }
                        if (var456 == 3105) {
                            var6--;
                            String var116 = field804[var6];
                            client.field388.method2592(131);
                            client.field388.method2345(var116.length() + 1);
                            client.field388.method2509(var116);
                            continue;
                        }
                        if (var456 == 3106) {
                            var6--;
                            String var117 = field804[var6];
                            client.field388.method2592(210);
                            client.field388.method2345(var117.length() + 1);
                            client.field388.method2509(var117);
                            continue;
                        }
                        if (var456 == 3107) {
                            var5--;
                            int var118 = field790[var5];
                            var6--;
                            String var119 = field804[var6];
                            client.method1960(var118, var119);
                            continue;
                        }
                        if (var456 == 3108) {
                            var5 -= 3;
                            int var120 = field790[var5];
                            int var121 = field790[var5 + 1];
                            int var122 = field790[var5 + 2];
                            class173 var123 = class173.method2934(var122);
                            client.method662(var123, var120, var121);
                            continue;
                        }
                        if (var456 == 3109) {
                            var5 -= 2;
                            int var124 = field790[var5];
                            int var125 = field790[var5 + 1];
                            class173 var126 = var51 ? Statics.field1948 : Statics.field274;
                            client.method662(var126, var124, var125);
                            continue;
                        }
                        if (var456 == 3110) {
                            var5--;
                            Statics.field2634 = field790[var5] == 1;
                            continue;
                        }
                        if (var456 == 3111) {
                            field790[var5++] = Statics.field133.field156 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 3112) {
                            var5--;
                            Statics.field133.field156 = field790[var5] == 1;
                            Statics.method986();
                            continue;
                        }
                        if (var456 == 3113) {
                            var6--;
                            String var127 = field804[var6];
                            var5--;
                            boolean var128 = field790[var5] == 1;
                            class138.method1483(var127, var128, false);
                            continue;
                        }
                        if (var456 == 3115) {
                            var5--;
                            int var129 = field790[var5];
                            client.field388.method2592(47);
                            client.field388.method2346(var129);
                            continue;
                        }
                        if (var456 == 3116) {
                            var5--;
                            int var130 = field790[var5];
                            var6 -= 2;
                            String var131 = field804[var6];
                            String var132 = field804[var6 + 1];
                            if (var131.length() <= 500 && var132.length() <= 500) {
                                client.field388.method2592(247);
                                client.field388.method2346(1 + class119.method763(var131) + class119.method763(var132));
                                client.field388.method2345(var130);
                                client.field388.method2509(var131);
                                client.field388.method2509(var132);
                            }
                            continue;
                        }
                    } else if (var456 < 3300) {
                        if (var456 == 3200) {
                            var5 -= 3;
                            client.method45(field790[var5], field790[var5 + 1], field790[var5 + 2]);
                            continue;
                        }
                        if (var456 == 3201) {
                            var5--;
                            int var133 = field790[var5];
                            if (var133 == -1 && !client.field532) {
                                class183.method2988();
                            } else if (var133 != -1 && client.field531 != var133 && client.field492 != 0 && !client.field532) {
                                class183.method2244(2, Statics.field997, var133, 0, client.field492, false);
                            }
                            client.field531 = var133;
                            continue;
                        }
                        if (var456 == 3202) {
                            var5 -= 2;
                            client.method2966(field790[var5], field790[var5 + 1]);
                            continue;
                        }
                    } else if (var456 < 3400) {
                        if (var456 == 3300) {
                            field790[var5++] = client.field303;
                            continue;
                        }
                        if (var456 == 3301) {
                            var5 -= 2;
                            int var134 = field790[var5];
                            int var135 = field790[var5 + 1];
                            int[] var136 = field790;
                            int var137 = var5++;
                            class16 var138 = (class16) class16.field231.method3518((long) var134);
                            int var139;
                            if (var138 == null) {
                                var139 = -1;
                            } else if (var135 >= 0 && var135 < var138.field230.length) {
                                var139 = var138.field230[var135];
                            } else {
                                var139 = -1;
                            }
                            var136[var137] = var139;
                            continue;
                        }
                        if (var456 == 3302) {
                            var5 -= 2;
                            int var140 = field790[var5];
                            int var141 = field790[var5 + 1];
                            int[] var142 = field790;
                            int var143 = var5++;
                            class16 var144 = (class16) class16.field231.method3518((long) var140);
                            int var145;
                            if (var144 == null) {
                                var145 = 0;
                            } else if (var141 >= 0 && var141 < var144.field229.length) {
                                var145 = var144.field229[var141];
                            } else {
                                var145 = 0;
                            }
                            var142[var143] = var145;
                            continue;
                        }
                        if (var456 == 3303) {
                            var5 -= 2;
                            int var146 = field790[var5];
                            int var147 = field790[var5 + 1];
                            int[] var148 = field790;
                            int var149 = var5++;
                            class16 var150 = (class16) class16.field231.method3518((long) var146);
                            int var151;
                            if (var150 == null) {
                                var151 = 0;
                            } else if (var147 == -1) {
                                var151 = 0;
                            } else {
                                int var152 = 0;
                                for (int var153 = 0; var153 < var150.field229.length; var153++) {
                                    if (var150.field230[var153] == var147) {
                                        var152 += var150.field229[var153];
                                    }
                                }
                                var151 = var152;
                            }
                            var148[var149] = var151;
                            continue;
                        }
                        if (var456 == 3304) {
                            var5--;
                            int var154 = field790[var5];
                            field790[var5++] = class51.method117(var154).field1098;
                            continue;
                        }
                        if (var456 == 3305) {
                            var5--;
                            int var155 = field790[var5];
                            field790[var5++] = client.field429[var155];
                            continue;
                        }
                        if (var456 == 3306) {
                            var5--;
                            int var156 = field790[var5];
                            field790[var5++] = client.field517[var156];
                            continue;
                        }
                        if (var456 == 3307) {
                            var5--;
                            int var157 = field790[var5];
                            field790[var5++] = client.field541[var157];
                            continue;
                        }
                        if (var456 == 3308) {
                            int var158 = Statics.field1154;
                            int var159 = (Statics.field180.field867 >> 7) + Statics.field1941;
                            int var160 = (Statics.field180.field807 >> 7) + Statics.field1588;
                            field790[var5++] = (var158 << 28) + (var159 << 14) + var160;
                            continue;
                        }
                        if (var456 == 3309) {
                            var5--;
                            int var161 = field790[var5];
                            field790[var5++] = var161 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var456 == 3310) {
                            var5--;
                            int var162 = field790[var5];
                            field790[var5++] = var162 >> 28;
                            continue;
                        }
                        if (var456 == 3311) {
                            var5--;
                            int var163 = field790[var5];
                            field790[var5++] = var163 & 0x3FFF;
                            continue;
                        }
                        if (var456 == 3312) {
                            field790[var5++] = client.field366 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 3313) {
                            var5 -= 2;
                            int var164 = field790[var5] + 32768;
                            int var165 = field790[var5 + 1];
                            int[] var166 = field790;
                            int var167 = var5++;
                            class16 var168 = (class16) class16.field231.method3518((long) var164);
                            int var169;
                            if (var168 == null) {
                                var169 = -1;
                            } else if (var165 >= 0 && var165 < var168.field230.length) {
                                var169 = var168.field230[var165];
                            } else {
                                var169 = -1;
                            }
                            var166[var167] = var169;
                            continue;
                        }
                        if (var456 == 3314) {
                            var5 -= 2;
                            int var170 = field790[var5] + 32768;
                            int var171 = field790[var5 + 1];
                            int[] var172 = field790;
                            int var173 = var5++;
                            class16 var174 = (class16) class16.field231.method3518((long) var170);
                            int var175;
                            if (var174 == null) {
                                var175 = 0;
                            } else if (var171 >= 0 && var171 < var174.field229.length) {
                                var175 = var174.field229[var171];
                            } else {
                                var175 = 0;
                            }
                            var172[var173] = var175;
                            continue;
                        }
                        if (var456 == 3315) {
                            var5 -= 2;
                            int var176 = field790[var5] + 32768;
                            int var177 = field790[var5 + 1];
                            int[] var178 = field790;
                            int var179 = var5++;
                            class16 var180 = (class16) class16.field231.method3518((long) var176);
                            int var181;
                            if (var180 == null) {
                                var181 = 0;
                            } else if (var177 == -1) {
                                var181 = 0;
                            } else {
                                int var182 = 0;
                                for (int var183 = 0; var183 < var180.field229.length; var183++) {
                                    if (var180.field230[var183] == var177) {
                                        var182 += var180.field229[var183];
                                    }
                                }
                                var181 = var182;
                            }
                            var178[var179] = var181;
                            continue;
                        }
                        if (var456 == 3316) {
                            if (client.field540 >= 2) {
                                field790[var5++] = client.field540;
                            } else {
                                field790[var5++] = 0;
                            }
                            continue;
                        }
                        if (var456 == 3317) {
                            field790[var5++] = client.field299;
                            continue;
                        }
                        if (var456 == 3318) {
                            field790[var5++] = client.field295;
                            continue;
                        }
                        if (var456 == 3321) {
                            field790[var5++] = client.field457;
                            continue;
                        }
                        if (var456 == 3322) {
                            field790[var5++] = client.field340;
                            continue;
                        }
                        if (var456 == 3323) {
                            if (client.field461) {
                                field790[var5++] = 1;
                            } else {
                                field790[var5++] = 0;
                            }
                            continue;
                        }
                        if (var456 == 3324) {
                            field790[var5++] = client.field370;
                            continue;
                        }
                    } else if (var456 < 3500) {
                        if (var456 == 3400) {
                            var5 -= 2;
                            int var184 = field790[var5];
                            int var185 = field790[var5 + 1];
                            class49 var186 = (class49) class49.field1085.method3475((long) var184);
                            class49 var187;
                            if (var186 == null) {
                                byte[] var188 = Statics.field1076.method3094(8, var184);
                                class49 var189 = new class49();
                                if (var188 != null) {
                                    var189.method985(new class119(var188));
                                }
                                class49.field1085.method3488(var189, (long) var184);
                                var187 = var189;
                            } else {
                                var187 = var186;
                            }
                            class49 var190 = var187;
                            if (var187.field1079 != 's') {
                            }
                            for (int var191 = 0; var191 < var190.field1082; var191++) {
                                if (var190.field1086[var191] == var185) {
                                    field804[var6++] = var190.field1083[var191];
                                    var190 = null;
                                    break;
                                }
                            }
                            if (var190 != null) {
                                field804[var6++] = var190.field1077;
                            }
                            continue;
                        }
                        if (var456 == 3408) {
                            var5 -= 4;
                            int var192 = field790[var5];
                            int var193 = field790[var5 + 1];
                            int var194 = field790[var5 + 2];
                            int var195 = field790[var5 + 3];
                            class49 var196 = (class49) class49.field1085.method3475((long) var194);
                            class49 var197;
                            if (var196 == null) {
                                byte[] var198 = Statics.field1076.method3094(8, var194);
                                class49 var199 = new class49();
                                if (var198 != null) {
                                    var199.method985(new class119(var198));
                                }
                                class49.field1085.method3488(var199, (long) var194);
                                var197 = var199;
                            } else {
                                var197 = var196;
                            }
                            class49 var200 = var197;
                            if (var197.field1078 == var192 && var197.field1079 == var193) {
                                for (int var201 = 0; var201 < var200.field1082; var201++) {
                                    if (var200.field1086[var201] == var195) {
                                        if (var193 == 115) {
                                            field804[var6++] = var200.field1083[var201];
                                        } else {
                                            field790[var5++] = var200.field1084[var201];
                                        }
                                        var200 = null;
                                        break;
                                    }
                                }
                                if (var200 != null) {
                                    if (var193 == 115) {
                                        field804[var6++] = var200.field1077;
                                    } else {
                                        field790[var5++] = var200.field1080;
                                    }
                                }
                                continue;
                            }
                            if (var193 == 115) {
                                field804[var6++] = "null";
                            } else {
                                field790[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var456 < 3700) {
                        if (var456 == 3600) {
                            if (client.field561 == 0) {
                                field790[var5++] = -2;
                            } else if (client.field561 == 1) {
                                field790[var5++] = -1;
                            } else {
                                field790[var5++] = client.field564;
                            }
                            continue;
                        }
                        if (var456 == 3601) {
                            var5--;
                            int var202 = field790[var5];
                            if (client.field561 == 2 && var202 < client.field564) {
                                field804[var6++] = client.field562[var202].field255;
                                field804[var6++] = client.field562[var202].field257;
                                continue;
                            }
                            field804[var6++] = "";
                            field804[var6++] = "";
                            continue;
                        }
                        if (var456 == 3602) {
                            var5--;
                            int var203 = field790[var5];
                            if (client.field561 == 2 && var203 < client.field564) {
                                field790[var5++] = client.field562[var203].field261;
                                continue;
                            }
                            field790[var5++] = 0;
                            continue;
                        }
                        if (var456 == 3603) {
                            var5--;
                            int var204 = field790[var5];
                            if (client.field561 == 2 && var204 < client.field564) {
                                field790[var5++] = client.field562[var204].field256;
                                continue;
                            }
                            field790[var5++] = 0;
                            continue;
                        }
                        if (var456 == 3604) {
                            var6--;
                            String var205 = field804[var6];
                            var5--;
                            int var206 = field790[var5];
                            client.method1006(var205, var206);
                            continue;
                        }
                        if (var456 == 3605) {
                            var6--;
                            String var207 = field804[var6];
                            if (var207 == null) {
                                continue;
                            }
                            if ((client.field564 < 200 || client.field501 == 1) && client.field564 < 400) {
                                String var208 = class164.method1588(var207, Statics.field2020);
                                if (var208 == null) {
                                    continue;
                                }
                                for (int var209 = 0; var209 < client.field564; var209++) {
                                    class18 var210 = client.field562[var209];
                                    String var211 = class164.method1588(var210.field255, Statics.field2020);
                                    if (var211 != null && var211.equals(var208)) {
                                        class12.method3686(30, "", var207 + class157.field2506);
                                        continue label2973;
                                    }
                                    if (var210.field257 != null) {
                                        String var212 = class164.method1588(var210.field257, Statics.field2020);
                                        if (var212 != null && var212.equals(var208)) {
                                            class12.method3686(30, "", var207 + class157.field2506);
                                            continue label2973;
                                        }
                                    }
                                }
                                for (int var213 = 0; var213 < client.field515; var213++) {
                                    class8 var214 = client.field565[var213];
                                    String var215 = class164.method1588(var214.field135, Statics.field2020);
                                    if (var215 != null && var215.equals(var208)) {
                                        class12.method3686(30, "", class157.field2469 + var207 + class157.field2470);
                                        continue label2973;
                                    }
                                    if (var214.field136 != null) {
                                        String var216 = class164.method1588(var214.field136, Statics.field2020);
                                        if (var216 != null && var216.equals(var208)) {
                                            class12.method3686(30, "", class157.field2469 + var207 + class157.field2470);
                                            continue label2973;
                                        }
                                    }
                                }
                                if (class164.method1588(Statics.field180.field60, Statics.field2020).equals(var208)) {
                                    class12.method3686(30, "", class157.field2457);
                                } else {
                                    client.field388.method2592(43);
                                    client.field388.method2345(class119.method763(var207));
                                    client.field388.method2509(var207);
                                }
                                continue;
                            }
                            class12.method3686(30, "", class157.field2455);
                            continue;
                        }
                        if (var456 == 3606) {
                            var6--;
                            String var217 = field804[var6];
                            client.method155(var217);
                            continue;
                        }
                        if (var456 == 3607) {
                            var6--;
                            String var218 = field804[var6];
                            client.method1593(var218, false);
                            continue;
                        }
                        if (var456 == 3608) {
                            var6--;
                            String var219 = field804[var6];
                            client.method2040(var219);
                            continue;
                        }
                        if (var456 == 3609) {
                            var6--;
                            String var220 = field804[var6];
                            class152[] var221 = class152.method2928();
                            for (int var222 = 0; var222 < var221.length; var222++) {
                                class152 var223 = var221[var222];
                                if (var223.field2251 != -1 && var220.startsWith(class2.method771(var223.field2251))) {
                                    var220 = var220.substring(6 + Integer.toString(var223.field2251).length());
                                    break;
                                }
                            }
                            field790[var5++] = client.method2762(var220, false) ? 1 : 0;
                            continue;
                        }
                        if (var456 == 3611) {
                            if (client.field306 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = class162.method592(client.field306);
                            }
                            continue;
                        }
                        if (var456 == 3612) {
                            if (client.field306 == null) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = Statics.field1649;
                            }
                            continue;
                        }
                        if (var456 == 3613) {
                            var5--;
                            int var224 = field790[var5];
                            if (client.field306 != null && var224 < Statics.field1649) {
                                field804[var6++] = Statics.field1435[var224].field625;
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var456 == 3614) {
                            var5--;
                            int var225 = field790[var5];
                            if (client.field306 != null && var225 < Statics.field1649) {
                                field790[var5++] = Statics.field1435[var225].field626;
                                continue;
                            }
                            field790[var5++] = 0;
                            continue;
                        }
                        if (var456 == 3615) {
                            var5--;
                            int var226 = field790[var5];
                            if (client.field306 != null && var226 < Statics.field1649) {
                                field790[var5++] = Statics.field1435[var226].field627;
                                continue;
                            }
                            field790[var5++] = 0;
                            continue;
                        }
                        if (var456 == 3616) {
                            field790[var5++] = Statics.field181;
                            continue;
                        }
                        if (var456 == 3617) {
                            var6--;
                            String var227 = field804[var6];
                            if (Statics.field1435 != null) {
                                client.field388.method2592(211);
                                client.field388.method2345(class119.method763(var227));
                                client.field388.method2509(var227);
                            }
                            continue;
                        }
                        if (var456 == 3618) {
                            field790[var5++] = Statics.field3045;
                            continue;
                        }
                        if (var456 == 3619) {
                            var6--;
                            String var228 = field804[var6];
                            client.method1081(var228);
                            continue;
                        }
                        if (var456 == 3620) {
                            client.method911();
                            continue;
                        }
                        if (var456 == 3621) {
                            if (client.field561 == 0) {
                                field790[var5++] = -1;
                            } else {
                                field790[var5++] = client.field515;
                            }
                            continue;
                        }
                        if (var456 == 3622) {
                            var5--;
                            int var229 = field790[var5];
                            if (client.field561 != 0 && var229 < client.field515) {
                                field804[var6++] = client.field565[var229].field135;
                                field804[var6++] = client.field565[var229].field136;
                                continue;
                            }
                            field804[var6++] = "";
                            field804[var6++] = "";
                            continue;
                        }
                        if (var456 == 3623) {
                            var6--;
                            String var230 = field804[var6];
                            if (var230.startsWith(class2.method771(0)) || var230.startsWith(class2.method771(1))) {
                                var230 = var230.substring(7);
                            }
                            field790[var5++] = client.method7(var230) ? 1 : 0;
                            continue;
                        }
                        if (var456 == 3624) {
                            var5--;
                            int var231 = field790[var5];
                            if (Statics.field1435 != null && var231 < Statics.field1649 && Statics.field1435[var231].field625.equalsIgnoreCase(Statics.field180.field60)) {
                                field790[var5++] = 1;
                                continue;
                            }
                            field790[var5++] = 0;
                            continue;
                        }
                        if (var456 == 3625) {
                            if (client.field535 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = class162.method592(client.field535);
                            }
                            continue;
                        }
                    } else if (var456 < 4000) {
                        if (var456 == 3903) {
                            var5--;
                            int var232 = field790[var5];
                            field790[var5++] = client.field569[var232].method3724();
                            continue;
                        }
                        if (var456 == 3904) {
                            var5--;
                            int var233 = field790[var5];
                            field790[var5++] = client.field569[var233].field3160;
                            continue;
                        }
                        if (var456 == 3905) {
                            var5--;
                            int var234 = field790[var5];
                            field790[var5++] = client.field569[var234].field3161;
                            continue;
                        }
                        if (var456 == 3906) {
                            var5--;
                            int var235 = field790[var5];
                            field790[var5++] = client.field569[var235].field3164;
                            continue;
                        }
                        if (var456 == 3907) {
                            var5--;
                            int var236 = field790[var5];
                            field790[var5++] = client.field569[var236].field3159;
                            continue;
                        }
                        if (var456 == 3908) {
                            var5--;
                            int var237 = field790[var5];
                            field790[var5++] = client.field569[var237].field3162;
                            continue;
                        }
                        if (var456 == 3910) {
                            var5--;
                            int var238 = field790[var5];
                            int var239 = client.field569[var238].method3727();
                            field790[var5++] = var239 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 3911) {
                            var5--;
                            int var240 = field790[var5];
                            int var241 = client.field569[var240].method3727();
                            field790[var5++] = var241 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 3912) {
                            var5--;
                            int var242 = field790[var5];
                            int var243 = client.field569[var242].method3727();
                            field790[var5++] = var243 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 3913) {
                            var5--;
                            int var244 = field790[var5];
                            int var245 = client.field569[var244].method3727();
                            field790[var5++] = var245 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 3914) {
                            var5--;
                            boolean var246 = field790[var5] == 1;
                            if (Statics.field153 != null) {
                                Statics.field153.method3736(class221.field3168, var246);
                            }
                            continue;
                        }
                        if (var456 == 3915) {
                            var5--;
                            boolean var247 = field790[var5] == 1;
                            if (Statics.field153 != null) {
                                Statics.field153.method3736(class221.field3165, var247);
                            }
                            continue;
                        }
                        if (var456 == 3916) {
                            var5 -= 2;
                            boolean var248 = field790[var5] == 1;
                            boolean var249 = field790[var5 + 1] == 1;
                            if (Statics.field153 != null) {
                                Statics.field153.method3736(new class22(var249), var248);
                            }
                            continue;
                        }
                        if (var456 == 3917) {
                            var5--;
                            boolean var250 = field790[var5] == 1;
                            if (Statics.field153 != null) {
                                Statics.field153.method3736(class221.field3166, var250);
                            }
                            continue;
                        }
                        if (var456 == 3918) {
                            var5--;
                            boolean var251 = field790[var5] == 1;
                            if (Statics.field153 != null) {
                                Statics.field153.method3736(class221.field3169, var251);
                            }
                            continue;
                        }
                        if (var456 == 3919) {
                            field790[var5++] = Statics.field153 == null ? 0 : Statics.field153.field3167.size();
                            continue;
                        }
                        if (var456 == 3920) {
                            var5--;
                            int var252 = field790[var5];
                            class214 var253 = (class214) Statics.field153.field3167.get(var252);
                            field790[var5++] = var253.field3145;
                            continue;
                        }
                        if (var456 == 3921) {
                            var5--;
                            int var254 = field790[var5];
                            class214 var255 = (class214) Statics.field153.field3167.get(var254);
                            field804[var6++] = var255.method3685();
                            continue;
                        }
                        if (var456 == 3922) {
                            var5--;
                            int var256 = field790[var5];
                            class214 var257 = (class214) Statics.field153.field3167.get(var256);
                            field804[var6++] = var257.method3681();
                            continue;
                        }
                        if (var456 == 3923) {
                            var5--;
                            int var258 = field790[var5];
                            class214 var259 = (class214) Statics.field153.field3167.get(var258);
                            long var260 = class115.method179() - Statics.field175 - var259.field3144;
                            int var262 = (int) (var260 / 3600000L);
                            int var263 = (int) ((var260 - (long) (var262 * 3600000)) / 60000L);
                            int var264 = (int) ((var260 - (long) (var262 * 3600000) - (long) (var263 * 60000)) / 1000L);
                            String var265 = var262 + ":" + var263 / 10 + var263 % 10 + ":" + var264 / 10 + var264 % 10;
                            field804[var6++] = var265;
                            continue;
                        }
                        if (var456 == 3924) {
                            var5--;
                            int var266 = field790[var5];
                            class214 var267 = (class214) Statics.field153.field3167.get(var266);
                            field790[var5++] = var267.field3149.field3164;
                            continue;
                        }
                        if (var456 == 3925) {
                            var5--;
                            int var268 = field790[var5];
                            class214 var269 = (class214) Statics.field153.field3167.get(var268);
                            field790[var5++] = var269.field3149.field3161;
                            continue;
                        }
                        if (var456 == 3926) {
                            var5--;
                            int var270 = field790[var5];
                            class214 var271 = (class214) Statics.field153.field3167.get(var270);
                            field790[var5++] = var271.field3149.field3160;
                            continue;
                        }
                    } else if (var456 < 4100) {
                        if (var456 == 4000) {
                            var5 -= 2;
                            int var272 = field790[var5];
                            int var273 = field790[var5 + 1];
                            field790[var5++] = var272 + var273;
                            continue;
                        }
                        if (var456 == 4001) {
                            var5 -= 2;
                            int var274 = field790[var5];
                            int var275 = field790[var5 + 1];
                            field790[var5++] = var274 - var275;
                            continue;
                        }
                        if (var456 == 4002) {
                            var5 -= 2;
                            int var276 = field790[var5];
                            int var277 = field790[var5 + 1];
                            field790[var5++] = var276 * var277;
                            continue;
                        }
                        if (var456 == 4003) {
                            var5 -= 2;
                            int var278 = field790[var5];
                            int var279 = field790[var5 + 1];
                            field790[var5++] = var278 / var279;
                            continue;
                        }
                        if (var456 == 4004) {
                            var5--;
                            int var280 = field790[var5];
                            field790[var5++] = (int) (Math.random() * (double) var280);
                            continue;
                        }
                        if (var456 == 4005) {
                            var5--;
                            int var281 = field790[var5];
                            field790[var5++] = (int) (Math.random() * (double) (var281 + 1));
                            continue;
                        }
                        if (var456 == 4006) {
                            var5 -= 5;
                            int var282 = field790[var5];
                            int var283 = field790[var5 + 1];
                            int var284 = field790[var5 + 2];
                            int var285 = field790[var5 + 3];
                            int var286 = field790[var5 + 4];
                            field790[var5++] = (var283 - var282) * (var286 - var284) / (var285 - var284) + var282;
                            continue;
                        }
                        if (var456 == 4007) {
                            var5 -= 2;
                            int var287 = field790[var5];
                            int var288 = field790[var5 + 1];
                            field790[var5++] = var287 * var288 / 100 + var287;
                            continue;
                        }
                        if (var456 == 4008) {
                            var5 -= 2;
                            int var289 = field790[var5];
                            int var290 = field790[var5 + 1];
                            field790[var5++] = var289 | 0x1 << var290;
                            continue;
                        }
                        if (var456 == 4009) {
                            var5 -= 2;
                            int var291 = field790[var5];
                            int var292 = field790[var5 + 1];
                            field790[var5++] = var291 & -1 - (0x1 << var292);
                            continue;
                        }
                        if (var456 == 4010) {
                            var5 -= 2;
                            int var293 = field790[var5];
                            int var294 = field790[var5 + 1];
                            field790[var5++] = (var293 & 0x1 << var294) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var456 == 4011) {
                            var5 -= 2;
                            int var295 = field790[var5];
                            int var296 = field790[var5 + 1];
                            field790[var5++] = var295 % var296;
                            continue;
                        }
                        if (var456 == 4012) {
                            var5 -= 2;
                            int var297 = field790[var5];
                            int var298 = field790[var5 + 1];
                            if (var297 == 0) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = (int) Math.pow((double) var297, (double) var298);
                            }
                            continue;
                        }
                        if (var456 == 4013) {
                            var5 -= 2;
                            int var299 = field790[var5];
                            int var300 = field790[var5 + 1];
                            if (var299 == 0) {
                                field790[var5++] = 0;
                            } else if (var300 == 0) {
                                field790[var5++] = Integer.MAX_VALUE;
                            } else {
                                field790[var5++] = (int) Math.pow((double) var299, 1.0D / (double) var300);
                            }
                            continue;
                        }
                        if (var456 == 4014) {
                            var5 -= 2;
                            int var301 = field790[var5];
                            int var302 = field790[var5 + 1];
                            field790[var5++] = var301 & var302;
                            continue;
                        }
                        if (var456 == 4015) {
                            var5 -= 2;
                            int var303 = field790[var5];
                            int var304 = field790[var5 + 1];
                            field790[var5++] = var303 | var304;
                            continue;
                        }
                    } else if (var456 < 4200) {
                        if (var456 == 4100) {
                            var6--;
                            String var305 = field804[var6];
                            var5--;
                            int var306 = field790[var5];
                            field804[var6++] = var305 + var306;
                            continue;
                        }
                        if (var456 == 4101) {
                            var6 -= 2;
                            String var307 = field804[var6];
                            String var308 = field804[var6 + 1];
                            field804[var6++] = var307 + var308;
                            continue;
                        }
                        if (var456 == 4102) {
                            var6--;
                            String var309 = field804[var6];
                            var5--;
                            int var310 = field790[var5];
                            String[] var311 = field804;
                            int var312 = var6++;
                            String var314;
                            if (var310 < 0) {
                                var314 = Integer.toString(var310);
                            } else {
                                int var315 = var310;
                                String var316;
                                if (var310 < 0) {
                                    var316 = Integer.toString(var310, 10);
                                } else {
                                    int var317 = 2;
                                    int var318 = var310 / 10;
                                    while (var318 != 0) {
                                        var318 /= 10;
                                        var317++;
                                    }
                                    char[] var319 = new char[var317];
                                    var319[0] = '+';
                                    for (int var320 = var317 - 1; var320 > 0; var320--) {
                                        int var321 = var315;
                                        var315 /= 10;
                                        int var322 = var321 - var315 * 10;
                                        if (var322 >= 10) {
                                            var319[var320] = (char) (var322 + 87);
                                        } else {
                                            var319[var320] = (char) (var322 + 48);
                                        }
                                    }
                                    var316 = new String(var319);
                                }
                                var314 = var316;
                            }
                            var311[var312] = var309 + var314;
                            continue;
                        }
                        if (var456 == 4103) {
                            var6--;
                            String var323 = field804[var6];
                            field804[var6++] = var323.toLowerCase();
                            continue;
                        }
                        if (var456 == 4104) {
                            var5--;
                            int var324 = field790[var5];
                            long var325 = ((long) var324 + 11745L) * 86400000L;
                            field799.setTime(new Date(var325));
                            int var327 = field799.get(5);
                            int var328 = field799.get(2);
                            int var329 = field799.get(1);
                            field804[var6++] = var327 + "-" + field800[var328] + "-" + var329;
                            continue;
                        }
                        if (var456 == 4105) {
                            var6 -= 2;
                            String var330 = field804[var6];
                            String var331 = field804[var6 + 1];
                            if (Statics.field180.field37 != null && Statics.field180.field37.field2910) {
                                field804[var6++] = var331;
                                continue;
                            }
                            field804[var6++] = var330;
                            continue;
                        }
                        if (var456 == 4106) {
                            var5--;
                            int var332 = field790[var5];
                            field804[var6++] = Integer.toString(var332);
                            continue;
                        }
                        if (var456 == 4107) {
                            var6 -= 2;
                            int[] var333 = field790;
                            int var334 = var5++;
                            int var335 = class166.method2639(field804[var6], field804[var6 + 1], client.field300);
                            byte var336;
                            if (var335 > 0) {
                                var336 = 1;
                            } else if (var335 < 0) {
                                var336 = -1;
                            } else {
                                var336 = 0;
                            }
                            var333[var334] = var336;
                            continue;
                        }
                        if (var456 == 4108) {
                            var6--;
                            String var337 = field804[var6];
                            var5 -= 2;
                            int var338 = field790[var5];
                            int var339 = field790[var5 + 1];
                            byte[] var340 = Statics.field3210.method3094(var339, 0);
                            class224 var341 = new class224(var340);
                            field790[var5++] = var341.method3748(var337, var338);
                            continue;
                        }
                        if (var456 == 4109) {
                            var6--;
                            String var342 = field804[var6];
                            var5 -= 2;
                            int var343 = field790[var5];
                            int var344 = field790[var5 + 1];
                            byte[] var345 = Statics.field3210.method3094(var344, 0);
                            class224 var346 = new class224(var345);
                            field790[var5++] = var346.method3747(var342, var343);
                            continue;
                        }
                        if (var456 == 4110) {
                            var6 -= 2;
                            String var347 = field804[var6];
                            String var348 = field804[var6 + 1];
                            var5--;
                            if (field790[var5] == 1) {
                                field804[var6++] = var347;
                            } else {
                                field804[var6++] = var348;
                            }
                            continue;
                        }
                        if (var456 == 4111) {
                            var6--;
                            String var349 = field804[var6];
                            field804[var6++] = class223.method3749(var349);
                            continue;
                        }
                        if (var456 == 4112) {
                            var6--;
                            String var350 = field804[var6];
                            var5--;
                            int var351 = field790[var5];
                            field804[var6++] = var350 + (char) var351;
                            continue;
                        }
                        if (var456 == 4113) {
                            var5--;
                            int var352 = field790[var5];
                            int[] var353 = field790;
                            int var354 = var5++;
                            char var355 = (char) var352;
                            boolean var356;
                            if (var355 >= ' ' && var355 <= '~') {
                                var356 = true;
                            } else if (var355 >= 160 && var355 <= 255) {
                                var356 = true;
                            } else if (var355 == 8364 || var355 == 338 || var355 == 8212 || var355 == 339 || var355 == 376) {
                                var356 = true;
                            } else {
                                var356 = false;
                            }
                            var353[var354] = var356 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 4114) {
                            var5--;
                            int var357 = field790[var5];
                            int[] var358 = field790;
                            int var359 = var5++;
                            char var360 = (char) var357;
                            boolean var361 = var360 >= '0' && var360 <= '9' || var360 >= 'A' && var360 <= 'Z' || var360 >= 'a' && var360 <= 'z';
                            var358[var359] = var361 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 4115) {
                            var5--;
                            int var362 = field790[var5];
                            int[] var363 = field790;
                            int var364 = var5++;
                            char var365 = (char) var362;
                            boolean var366 = var365 >= 'A' && var365 <= 'Z' || var365 >= 'a' && var365 <= 'z';
                            var363[var364] = var366 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 4116) {
                            var5--;
                            int var367 = field790[var5];
                            field790[var5++] = class163.method2971((char) var367) ? 1 : 0;
                            continue;
                        }
                        if (var456 == 4117) {
                            var6--;
                            String var368 = field804[var6];
                            if (var368 == null) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = var368.length();
                            }
                            continue;
                        }
                        if (var456 == 4118) {
                            var6--;
                            String var369 = field804[var6];
                            var5 -= 2;
                            int var370 = field790[var5];
                            int var371 = field790[var5 + 1];
                            field804[var6++] = var369.substring(var370, var371);
                            continue;
                        }
                        if (var456 == 4119) {
                            var6--;
                            String var372 = field804[var6];
                            StringBuilder var373 = new StringBuilder(var372.length());
                            boolean var374 = false;
                            for (int var375 = 0; var375 < var372.length(); var375++) {
                                char var376 = var372.charAt(var375);
                                if (var376 == '<') {
                                    var374 = true;
                                } else if (var376 == '>') {
                                    var374 = false;
                                } else if (!var374) {
                                    var373.append(var376);
                                }
                            }
                            field804[var6++] = var373.toString();
                            continue;
                        }
                        if (var456 == 4120) {
                            var6--;
                            String var377 = field804[var6];
                            var5--;
                            int var378 = field790[var5];
                            field790[var5++] = var377.indexOf(var378);
                            continue;
                        }
                        if (var456 == 4121) {
                            var6 -= 2;
                            String var379 = field804[var6];
                            String var380 = field804[var6 + 1];
                            var5--;
                            int var381 = field790[var5];
                            field790[var5++] = var379.indexOf(var380, var381);
                            continue;
                        }
                    } else if (var456 < 4300) {
                        if (var456 == 4200) {
                            var5--;
                            int var382 = field790[var5];
                            field804[var6++] = class52.method724(var382).field1113;
                            continue;
                        }
                        if (var456 == 4201) {
                            var5 -= 2;
                            int var383 = field790[var5];
                            int var384 = field790[var5 + 1];
                            class52 var385 = class52.method724(var383);
                            if (var384 >= 1 && var384 <= 5 && var385.field1127[var384 - 1] != null) {
                                field804[var6++] = var385.field1127[var384 - 1];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var456 == 4202) {
                            var5 -= 2;
                            int var386 = field790[var5];
                            int var387 = field790[var5 + 1];
                            class52 var388 = class52.method724(var386);
                            if (var387 >= 1 && var387 <= 5 && var388.field1128[var387 - 1] != null) {
                                field804[var6++] = var388.field1128[var387 - 1];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var456 == 4203) {
                            var5--;
                            int var389 = field790[var5];
                            field790[var5++] = class52.method724(var389).field1125;
                            continue;
                        }
                        if (var456 == 4204) {
                            var5--;
                            int var390 = field790[var5];
                            field790[var5++] = class52.method724(var390).field1124 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 4205) {
                            var5--;
                            int var391 = field790[var5];
                            class52 var392 = class52.method724(var391);
                            if (var392.field1144 == -1 && var392.field1143 >= 0) {
                                field790[var5++] = var392.field1143;
                                continue;
                            }
                            field790[var5++] = var391;
                            continue;
                        }
                        if (var456 == 4206) {
                            var5--;
                            int var393 = field790[var5];
                            class52 var394 = class52.method724(var393);
                            if (var394.field1144 >= 0 && var394.field1143 >= 0) {
                                field790[var5++] = var394.field1143;
                                continue;
                            }
                            field790[var5++] = var393;
                            continue;
                        }
                        if (var456 == 4207) {
                            var5--;
                            int var395 = field790[var5];
                            field790[var5++] = class52.method724(var395).field1126 ? 1 : 0;
                            continue;
                        }
                        if (var456 == 4210) {
                            var6--;
                            String var396 = field804[var6];
                            var5--;
                            int var397 = field790[var5];
                            client.method2586(var396, var397 == 1);
                            field790[var5++] = Statics.field1040;
                            continue;
                        }
                        if (var456 == 4211) {
                            if (Statics.field1610 != null && Statics.field1755 < Statics.field1040) {
                                field790[var5++] = Statics.field1610[++Statics.field1755 - 1] & 0xFFFF;
                                continue;
                            }
                            field790[var5++] = -1;
                            continue;
                        }
                        if (var456 == 4212) {
                            Statics.field1755 = 0;
                            continue;
                        }
                    } else if (var456 < 5100) {
                        if (var456 == 5000) {
                            field790[var5++] = client.field444;
                            continue;
                        }
                        if (var456 == 5001) {
                            var5 -= 3;
                            client.field444 = field790[var5];
                            Statics.field1752 = class130.method2629(field790[var5 + 1]);
                            if (Statics.field1752 == null) {
                                Statics.field1752 = class130.field2045;
                            }
                            client.field511 = field790[var5 + 2];
                            client.field388.method2592(50);
                            client.field388.method2345(client.field444);
                            client.field388.method2345(Statics.field1752.field2049);
                            client.field388.method2345(client.field511);
                            continue;
                        }
                        if (var456 == 5002) {
                            var6--;
                            String var398 = field804[var6];
                            var5 -= 2;
                            int var399 = field790[var5];
                            int var400 = field790[var5 + 1];
                            client.field388.method2592(159);
                            client.field388.method2345(class119.method763(var398) + 2);
                            client.field388.method2509(var398);
                            client.field388.method2345(var399 - 1);
                            client.field388.method2345(var400);
                            continue;
                        }
                        if (var456 == 5003) {
                            var5 -= 2;
                            int var401 = field790[var5];
                            int var402 = field790[var5 + 1];
                            class28 var403 = (class28) class12.field187.get(var401);
                            class36 var404 = var403.method651(var402);
                            if (var404 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = 0;
                                field804[var6++] = "";
                                field804[var6++] = "";
                                field804[var6++] = "";
                            } else {
                                field790[var5++] = var404.field786;
                                field790[var5++] = var404.field782;
                                field804[var6++] = var404.field780 == null ? "" : var404.field780;
                                field804[var6++] = var404.field783 == null ? "" : var404.field783;
                                field804[var6++] = var404.field784 == null ? "" : var404.field784;
                            }
                            continue;
                        }
                        if (var456 == 5004) {
                            var5--;
                            int var406 = field790[var5];
                            class36 var407 = class12.method3470(var406);
                            if (var407 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = 0;
                                field804[var6++] = "";
                                field804[var6++] = "";
                                field804[var6++] = "";
                            } else {
                                field790[var5++] = var407.field781;
                                field790[var5++] = var407.field782;
                                field804[var6++] = var407.field780 == null ? "" : var407.field780;
                                field804[var6++] = var407.field783 == null ? "" : var407.field783;
                                field804[var6++] = var407.field784 == null ? "" : var407.field784;
                            }
                            continue;
                        }
                        if (var456 == 5005) {
                            if (Statics.field1752 == null) {
                                field790[var5++] = -1;
                            } else {
                                field790[var5++] = Statics.field1752.field2049;
                            }
                            continue;
                        }
                        if (var456 == 5008) {
                            var6--;
                            String var408 = field804[var6];
                            var5--;
                            int var409 = field790[var5];
                            String var410 = var408.toLowerCase();
                            byte var411 = 0;
                            if (var410.startsWith(class157.field2473)) {
                                var411 = 0;
                                var408 = var408.substring(class157.field2473.length());
                            } else if (var410.startsWith(class157.field2475)) {
                                var411 = 1;
                                var408 = var408.substring(class157.field2475.length());
                            } else if (var410.startsWith(class157.field2477)) {
                                var411 = 2;
                                var408 = var408.substring(class157.field2477.length());
                            } else if (var410.startsWith(class157.field2479)) {
                                var411 = 3;
                                var408 = var408.substring(class157.field2479.length());
                            } else if (var410.startsWith(class157.field2428)) {
                                var411 = 4;
                                var408 = var408.substring(class157.field2428.length());
                            } else if (var410.startsWith(class157.field2483)) {
                                var411 = 5;
                                var408 = var408.substring(class157.field2483.length());
                            } else if (var410.startsWith(class157.field2485)) {
                                var411 = 6;
                                var408 = var408.substring(class157.field2485.length());
                            } else if (var410.startsWith(class157.field2494)) {
                                var411 = 7;
                                var408 = var408.substring(class157.field2494.length());
                            } else if (var410.startsWith(class157.field2489)) {
                                var411 = 8;
                                var408 = var408.substring(class157.field2489.length());
                            } else if (var410.startsWith(class157.field2413)) {
                                var411 = 9;
                                var408 = var408.substring(class157.field2413.length());
                            } else if (var410.startsWith(class157.field2493)) {
                                var411 = 10;
                                var408 = var408.substring(class157.field2493.length());
                            } else if (var410.startsWith(class157.field2390)) {
                                var411 = 11;
                                var408 = var408.substring(class157.field2390.length());
                            } else if (client.field300 != 0) {
                                if (var410.startsWith(class157.field2474)) {
                                    var411 = 0;
                                    var408 = var408.substring(class157.field2474.length());
                                } else if (var410.startsWith(class157.field2530)) {
                                    var411 = 1;
                                    var408 = var408.substring(class157.field2530.length());
                                } else if (var410.startsWith(class157.field2554)) {
                                    var411 = 2;
                                    var408 = var408.substring(class157.field2554.length());
                                } else if (var410.startsWith(class157.field2480)) {
                                    var411 = 3;
                                    var408 = var408.substring(class157.field2480.length());
                                } else if (var410.startsWith(class157.field2482)) {
                                    var411 = 4;
                                    var408 = var408.substring(class157.field2482.length());
                                } else if (var410.startsWith(class157.field2484)) {
                                    var411 = 5;
                                    var408 = var408.substring(class157.field2484.length());
                                } else if (var410.startsWith(class157.field2486)) {
                                    var411 = 6;
                                    var408 = var408.substring(class157.field2486.length());
                                } else if (var410.startsWith(class157.field2488)) {
                                    var411 = 7;
                                    var408 = var408.substring(class157.field2488.length());
                                } else if (var410.startsWith(class157.field2497)) {
                                    var411 = 8;
                                    var408 = var408.substring(class157.field2497.length());
                                } else if (var410.startsWith(class157.field2452)) {
                                    var411 = 9;
                                    var408 = var408.substring(class157.field2452.length());
                                } else if (var410.startsWith(class157.field2319)) {
                                    var411 = 10;
                                    var408 = var408.substring(class157.field2319.length());
                                } else if (var410.startsWith(class157.field2504)) {
                                    var411 = 11;
                                    var408 = var408.substring(class157.field2504.length());
                                }
                            }
                            String var412 = var408.toLowerCase();
                            byte var413 = 0;
                            if (var412.startsWith(class157.field2481)) {
                                var413 = 1;
                                var408 = var408.substring(class157.field2481.length());
                            } else if (var412.startsWith(class157.field2499)) {
                                var413 = 2;
                                var408 = var408.substring(class157.field2499.length());
                            } else if (var412.startsWith(class157.field2501)) {
                                var413 = 3;
                                var408 = var408.substring(class157.field2501.length());
                            } else if (var412.startsWith(class157.field2503)) {
                                var413 = 4;
                                var408 = var408.substring(class157.field2503.length());
                            } else if (var412.startsWith(class157.field2386)) {
                                var413 = 5;
                                var408 = var408.substring(class157.field2386.length());
                            } else if (client.field300 != 0) {
                                if (var412.startsWith(class157.field2498)) {
                                    var413 = 1;
                                    var408 = var408.substring(class157.field2498.length());
                                } else if (var412.startsWith(class157.field2505)) {
                                    var413 = 2;
                                    var408 = var408.substring(class157.field2505.length());
                                } else if (var412.startsWith(class157.field2502)) {
                                    var413 = 3;
                                    var408 = var408.substring(class157.field2502.length());
                                } else if (var412.startsWith(class157.field2519)) {
                                    var413 = 4;
                                    var408 = var408.substring(class157.field2519.length());
                                } else if (var412.startsWith(class157.field2495)) {
                                    var413 = 5;
                                    var408 = var408.substring(class157.field2495.length());
                                }
                            }
                            client.field388.method2592(141);
                            client.field388.method2345(0);
                            int var414 = client.field388.field1982;
                            client.field388.method2345(var409);
                            client.field388.method2345(var411);
                            client.field388.method2345(var413);
                            class122 var415 = client.field388;
                            int var416 = var415.field1982;
                            byte[] var417 = class165.method41(var408);
                            var415.method2505(var417.length);
                            var415.field1982 += Statics.field3171.method2285(var417, 0, var417.length, var415.field1987, var415.field1982);
                            client.field388.method2527(client.field388.field1982 - var414);
                            continue;
                        }
                        if (var456 == 5009) {
                            var6 -= 2;
                            String var418 = field804[var6];
                            String var419 = field804[var6 + 1];
                            client.field388.method2592(166);
                            client.field388.method2346(0);
                            int var420 = client.field388.field1982;
                            client.field388.method2509(var418);
                            class122 var421 = client.field388;
                            int var422 = var421.field1982;
                            byte[] var423 = class165.method41(var419);
                            var421.method2505(var423.length);
                            var421.field1982 += Statics.field3171.method2285(var423, 0, var423.length, var421.field1987, var421.field1982);
                            client.field388.method2356(client.field388.field1982 - var420);
                            continue;
                        }
                        if (var456 == 5015) {
                            String var424;
                            if (Statics.field180 == null || Statics.field180.field60 == null) {
                                var424 = "";
                            } else {
                                var424 = Statics.field180.field60;
                            }
                            field804[var6++] = var424;
                            continue;
                        }
                        if (var456 == 5016) {
                            field790[var5++] = client.field511;
                            continue;
                        }
                        if (var456 == 5017) {
                            var5--;
                            int var425 = field790[var5];
                            field790[var5++] = class12.method1074(var425);
                            continue;
                        }
                        if (var456 == 5018) {
                            var5--;
                            int var426 = field790[var5];
                            field790[var5++] = class12.method948(var426);
                            continue;
                        }
                        if (var456 == 5019) {
                            var5--;
                            int var427 = field790[var5];
                            int[] var428 = field790;
                            int var429 = var5++;
                            class36 var430 = (class36) class12.field191.method3533((long) var427);
                            int var431;
                            if (var430 == null) {
                                var431 = -1;
                            } else if (class12.field184.field3096 == var430.field3100) {
                                var431 = -1;
                            } else {
                                var431 = ((class36) var430.field3100).field786;
                            }
                            var428[var429] = var431;
                            continue;
                        }
                        if (var456 == 5020) {
                            var6--;
                            String var432 = field804[var6];
                            client.method2956(var432);
                            continue;
                        }
                        if (var456 == 5021) {
                            var6--;
                            client.field512 = field804[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var456 == 5022) {
                            field804[var6++] = client.field512;
                            continue;
                        }
                    }
                }
                if (var456 < 5400) {
                    if (var456 == 5306) {
                        int[] var433 = field790;
                        int var434 = var5++;
                        int var435 = client.field506 ? 2 : 1;
                        var433[var434] = var435;
                        continue;
                    }
                    if (var456 == 5307) {
                        var5--;
                        int var436 = field790[var5];
                        if (var436 == 1 || var436 == 2) {
                            Statics.method242(var436);
                        }
                        continue;
                    }
                    if (var456 == 5308) {
                        field790[var5++] = Statics.field133.field147;
                        continue;
                    }
                    if (var456 == 5309) {
                        var5--;
                        int var437 = field790[var5];
                        if (var437 == 1 || var437 == 2) {
                            Statics.field133.field147 = var437;
                            Statics.method986();
                        }
                        continue;
                    }
                }
                if (var456 < 5600) {
                    if (var456 == 5504) {
                        var5 -= 2;
                        int var438 = field790[var5];
                        int var439 = field790[var5 + 1];
                        if (!client.field343) {
                            client.field427 = var438;
                            client.field337 = var439;
                        }
                        continue;
                    }
                    if (var456 == 5505) {
                        field790[var5++] = client.field427;
                        continue;
                    }
                    if (var456 == 5506) {
                        field790[var5++] = client.field337;
                        continue;
                    }
                    if (var456 == 5530) {
                        var5--;
                        int var440 = field790[var5];
                        if (var440 < 0) {
                            var440 = 0;
                        }
                        client.field384 = var440;
                        continue;
                    }
                    if (var456 == 5531) {
                        field790[var5++] = client.field384;
                        continue;
                    }
                }
                if (var456 >= 5700 || var456 != 5630) {
                    if (var456 < 6300) {
                        if (var456 == 6200) {
                            var5 -= 2;
                            client.field547 = (short) field790[var5];
                            if (client.field547 <= 0) {
                                client.field547 = 256;
                            }
                            client.field548 = (short) field790[var5 + 1];
                            if (client.field548 <= 0) {
                                client.field548 = 205;
                            }
                            continue;
                        }
                        if (var456 == 6201) {
                            var5 -= 2;
                            client.field443 = (short) field790[var5];
                            if (client.field443 <= 0) {
                                client.field443 = 256;
                            }
                            client.field426 = (short) field790[var5 + 1];
                            if (client.field426 <= 0) {
                                client.field426 = 320;
                            }
                            continue;
                        }
                        if (var456 == 6202) {
                            var5 -= 4;
                            client.field551 = (short) field790[var5];
                            if (client.field551 <= 0) {
                                client.field551 = 1;
                            }
                            client.field552 = (short) field790[var5 + 1];
                            if (client.field552 <= 0) {
                                client.field552 = 32767;
                            } else if (client.field552 < client.field551) {
                                client.field552 = client.field551;
                            }
                            client.field553 = (short) field790[var5 + 2];
                            if (client.field553 <= 0) {
                                client.field553 = 1;
                            }
                            client.field554 = (short) field790[var5 + 3];
                            if (client.field554 <= 0) {
                                client.field554 = 32767;
                            } else if (client.field554 < client.field553) {
                                client.field554 = client.field553;
                            }
                            continue;
                        }
                        if (var456 == 6203) {
                            if (client.field464 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = -1;
                            } else {
                                Statics.method573(0, 0, client.field464.field2828, client.field464.field2762, false);
                                field790[var5++] = client.field557;
                                field790[var5++] = client.field558;
                            }
                            continue;
                        }
                        if (var456 == 6204) {
                            field790[var5++] = client.field443;
                            field790[var5++] = client.field426;
                            continue;
                        }
                        if (var456 == 6205) {
                            field790[var5++] = client.field547;
                            field790[var5++] = client.field548;
                            continue;
                        }
                    }
                    if (var456 < 6600) {
                        if (var456 == 6500) {
                            field790[var5++] = class26.method731() ? 1 : 0;
                            continue;
                        }
                        if (var456 == 6501) {
                            class26 var441 = class26.method2936();
                            if (var441 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = 0;
                                field804[var6++] = "";
                                field790[var5++] = 0;
                                field790[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field790[var5++] = var441.field651;
                                field790[var5++] = var441.field649;
                                field804[var6++] = var441.field647;
                                field790[var5++] = var441.field648;
                                field790[var5++] = var441.field645;
                                field804[var6++] = var441.field646;
                            }
                            continue;
                        }
                        if (var456 == 6502) {
                            class26 var442 = class26.method903();
                            if (var442 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = 0;
                                field804[var6++] = "";
                                field790[var5++] = 0;
                                field790[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field790[var5++] = var442.field651;
                                field790[var5++] = var442.field649;
                                field804[var6++] = var442.field647;
                                field790[var5++] = var442.field648;
                                field790[var5++] = var442.field645;
                                field804[var6++] = var442.field646;
                            }
                            continue;
                        }
                        if (var456 == 6506) {
                            var5--;
                            int var443 = field790[var5];
                            class26 var444 = null;
                            for (int var445 = 0; var445 < class26.field638; var445++) {
                                if (Statics.field1157[var445].field651 == var443) {
                                    var444 = Statics.field1157[var445];
                                    break;
                                }
                            }
                            if (var444 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = 0;
                                field804[var6++] = "";
                                field790[var5++] = 0;
                                field790[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field790[var5++] = var444.field651;
                                field790[var5++] = var444.field649;
                                field804[var6++] = var444.field647;
                                field790[var5++] = var444.field648;
                                field790[var5++] = var444.field645;
                                field804[var6++] = var444.field646;
                            }
                            continue;
                        }
                        if (var456 == 6507) {
                            var5 -= 4;
                            int var446 = field790[var5];
                            boolean var447 = field790[var5 + 1] == 1;
                            int var448 = field790[var5 + 2];
                            boolean var449 = field790[var5 + 3] == 1;
                            class26.method837(var446, var447, var448, var449);
                            continue;
                        }
                        if (var456 == 6511) {
                            var5--;
                            int var450 = field790[var5];
                            if (var450 >= 0 && var450 < class26.field638) {
                                class26 var451 = Statics.field1157[var450];
                                field790[var5++] = var451.field651;
                                field790[var5++] = var451.field649;
                                field804[var6++] = var451.field647;
                                field790[var5++] = var451.field648;
                                field790[var5++] = var451.field645;
                                field804[var6++] = var451.field646;
                                continue;
                            }
                            field790[var5++] = -1;
                            field790[var5++] = 0;
                            field804[var6++] = "";
                            field790[var5++] = 0;
                            field790[var5++] = 0;
                            field804[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field357 = 250;
            }
        } catch (Exception var455) {
            StringBuilder var453 = new StringBuilder(30);
            var453.append("").append(var4.field3112).append(" ");
            for (int var454 = field796 - 1; var454 >= 0; var454--) {
                var453.append("").append(field798[var454].field221.field3112).append(" ");
            }
            var453.append("").append(var10);
            class148.method2765(var453.toString(), var455);
        }
    }

    @ObfuscatedName("m.c(II)V")
    public static void method163(int arg0) {
        if (arg0 == -1 || !class173.method2791(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2862[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2844 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field2 = var3.field2844;
                method1253(var4, 2000000);
            }
        }
    }
}
