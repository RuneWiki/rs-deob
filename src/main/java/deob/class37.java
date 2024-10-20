package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aj")
public class class37 {

    @ObfuscatedName("aj.e")
    public static int[] field803 = new int[5];

    @ObfuscatedName("aj.y")
    public static int[][] field804 = new int[5][5000];

    @ObfuscatedName("aj.m")
    public static int[] field805 = new int[1000];

    @ObfuscatedName("aj.c")
    public static String[] field817 = new String[1000];

    @ObfuscatedName("aj.v")
    public static int field813 = 0;

    @ObfuscatedName("aj.l")
    public static class15[] field809 = new class15[50];

    @ObfuscatedName("aj.j")
    public static Calendar field811 = Calendar.getInstance();

    @ObfuscatedName("aj.q")
    public static final String[] field812 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("aj.a")
    public static int field807 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.w(Lw;I)V")
    public static void method49(class1 arg0) {
        method158(arg0, 200000);
    }

    @ObfuscatedName("q.x(Lw;II)V")
    public static void method158(class1 arg0, int arg1) {
        Object[] var2 = arg0.field8;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method2669(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field598;
        int[] var9 = var4.field600;
        byte var10 = -1;
        field813 = 0;
        try {
            Statics.field801 = new int[var4.field604];
            int var11 = 0;
            Statics.field802 = new String[var4.field599];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2839;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2803;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2839;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2803;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field20;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field801[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field802[var12++] = var15;
                }
            }
            int var16 = 0;
            field807 = arg0.field11;
            label3223: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var461 = var8[var7];
                if (var461 < 100) {
                    if (var461 == 0) {
                        field805[var5++] = var9[var7];
                        continue;
                    }
                    if (var461 == 1) {
                        int var17 = var9[var7];
                        field805[var5++] = class177.field2917[var17];
                        continue;
                    }
                    if (var461 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class177.field2917[var18] = field805[var5];
                        client.method2051(var18);
                        continue;
                    }
                    if (var461 == 3) {
                        field817[var6++] = var4.field601[var7];
                        continue;
                    }
                    if (var461 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var461 == 7) {
                        var5 -= 2;
                        if (field805[var5 + 1] != field805[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 8) {
                        var5 -= 2;
                        if (field805[var5 + 1] == field805[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 9) {
                        var5 -= 2;
                        if (field805[var5] < field805[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 10) {
                        var5 -= 2;
                        if (field805[var5] > field805[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 21) {
                        if (field813 == 0) {
                            return;
                        }
                        class15 var19 = field809[--field813];
                        var4 = var19.field227;
                        var8 = var4.field598;
                        var9 = var4.field600;
                        var7 = var19.field224;
                        Statics.field801 = var19.field222;
                        Statics.field802 = var19.field223;
                        continue;
                    }
                    if (var461 == 25) {
                        int var20 = var9[var7];
                        field805[var5++] = class177.method2977(var20);
                        continue;
                    }
                    if (var461 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field805[var5];
                        class48 var23 = (class48) class48.field1080.method3520((long) var21);
                        class48 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1084.method3127(14, var21);
                            class48 var26 = new class48();
                            if (var25 != null) {
                                var26.method992(new class120(var25));
                            }
                            class48.field1080.method3522(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1086;
                        int var29 = var24.field1082;
                        int var30 = var24.field1083;
                        int var31 = class177.field2919[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class177.field2917[var28] = class177.field2917[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var461 == 31) {
                        var5 -= 2;
                        if (field805[var5] <= field805[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 32) {
                        var5 -= 2;
                        if (field805[var5] >= field805[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 33) {
                        field805[var5++] = Statics.field801[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var461 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field801[var10001] = field805[var5];
                        continue;
                    }
                    if (var461 == 35) {
                        field817[var6++] = Statics.field802[var9[var7]];
                        continue;
                    }
                    if (var461 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field802[var10001] = field817[var6];
                        continue;
                    }
                    if (var461 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = field817;
                        String var35;
                        if (var33 == 0) {
                            var35 = "";
                        } else if (var33 == 1) {
                            String var36 = var34[var6];
                            if (var36 == null) {
                                var35 = "null";
                            } else {
                                var35 = var36.toString();
                            }
                        } else {
                            int var37 = var6 + var33;
                            int var38 = 0;
                            for (int var39 = var6; var39 < var37; var39++) {
                                String var40 = var34[var39];
                                if (var40 == null) {
                                    var38 += 4;
                                } else {
                                    var38 += var40.length();
                                }
                            }
                            StringBuilder var41 = new StringBuilder(var38);
                            for (int var42 = var6; var42 < var37; var42++) {
                                String var43 = var34[var42];
                                if (var43 == null) {
                                    var41.append("null");
                                } else {
                                    var41.append(var43);
                                }
                            }
                            var35 = var41.toString();
                        }
                        field817[var6++] = var35;
                        continue;
                    }
                    if (var461 == 38) {
                        var5--;
                        continue;
                    }
                    if (var461 == 39) {
                        var6--;
                        continue;
                    }
                    if (var461 == 40) {
                        int var45 = var9[var7];
                        class23 var46 = class23.method2669(var45);
                        int[] var47 = new int[var46.field604];
                        String[] var48 = new String[var46.field599];
                        for (int var49 = 0; var49 < var46.field603; var49++) {
                            var47[var49] = field805[var5 - var46.field603 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field605; var50++) {
                            var48[var50] = field817[var6 - var46.field605 + var50];
                        }
                        var5 -= var46.field603;
                        var6 -= var46.field605;
                        class15 var51 = new class15();
                        var51.field227 = var4;
                        var51.field224 = var7;
                        var51.field222 = Statics.field801;
                        var51.field223 = Statics.field802;
                        field809[++field813 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field598;
                        var9 = var46.field600;
                        var7 = -1;
                        Statics.field801 = var47;
                        Statics.field802 = var48;
                        continue;
                    }
                    if (var461 == 42) {
                        field805[var5++] = Statics.field1376.method194(var9[var7]);
                        continue;
                    }
                    if (var461 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1376.method193(var10001, field805[var5]);
                        continue;
                    }
                    if (var461 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = field805[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            field803[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label3223;
                                }
                                field804[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = field805[var5];
                        if (var58 >= 0 && var58 < field803[var57]) {
                            field805[var5++] = field804[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = field805[var5];
                        if (var60 >= 0 && var60 < field803[var59]) {
                            field804[var59][var60] = field805[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 47) {
                        String var61 = Statics.field1376.method223(var9[var7]);
                        if (var61 == null) {
                            var61 = "null";
                        }
                        field817[var6++] = var61;
                        continue;
                    }
                    if (var461 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1376.method195(var10001, field817[var6]);
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var461 < 1000) {
                    if (var461 == 100) {
                        var5 -= 3;
                        int var63 = field805[var5];
                        int var64 = field805[var5 + 1];
                        int var65 = field805[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class174 var66 = class174.method1096(var63);
                        if (var66.field2892 == null) {
                            var66.field2892 = new class174[var65 + 1];
                        }
                        if (var66.field2892.length <= var65) {
                            class174[] var67 = new class174[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2892.length; var68++) {
                                var67[var68] = var66.field2892[var68];
                            }
                            var66.field2892 = var67;
                        }
                        if (var65 > 0 && var66.field2892[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class174 var69 = new class174();
                        var69.field2815 = var64;
                        var69.field2787 = var69.field2839 = var66.field2839;
                        var69.field2803 = var65;
                        var69.field2767 = true;
                        var66.field2892[var65] = var69;
                        if (var62) {
                            Statics.field810 = var69;
                        } else {
                            Statics.field799 = var69;
                        }
                        client.method2727(var66);
                        continue;
                    }
                    if (var461 == 101) {
                        class174 var70 = var62 ? Statics.field810 : Statics.field799;
                        class174 var71 = class174.method1096(var70.field2839);
                        var71.field2892[var70.field2803] = null;
                        client.method2727(var71);
                        continue;
                    }
                    if (var461 == 102) {
                        var5--;
                        class174 var72 = class174.method1096(field805[var5]);
                        var72.field2892 = null;
                        client.method2727(var72);
                        continue;
                    }
                    if (var461 == 200) {
                        var5 -= 2;
                        int var73 = field805[var5];
                        int var74 = field805[var5 + 1];
                        class174 var75 = class174.method2990(var73, var74);
                        if (var75 != null && var74 != -1) {
                            field805[var5++] = 1;
                            if (var62) {
                                Statics.field810 = var75;
                            } else {
                                Statics.field799 = var75;
                            }
                            continue;
                        }
                        field805[var5++] = 0;
                        continue;
                    }
                    if (var461 == 201) {
                        var5--;
                        class174 var76 = class174.method1096(field805[var5]);
                        if (var76 == null) {
                            field805[var5++] = 0;
                        } else {
                            field805[var5++] = 1;
                            if (var62) {
                                Statics.field810 = var76;
                            } else {
                                Statics.field799 = var76;
                            }
                        }
                        continue;
                    }
                } else if (!(var461 < 1000 || var461 >= 1100) || !(var461 < 2000 || var461 >= 2100)) {
                    int var77 = -1;
                    class174 var78;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var77 = field805[var5];
                        var78 = class174.method1096(var77);
                    } else {
                        var78 = var62 ? Statics.field810 : Statics.field799;
                    }
                    if (var461 == 1000) {
                        var5 -= 4;
                        var78.field2777 = field805[var5];
                        var78.field2874 = field805[var5 + 1];
                        var78.field2858 = field805[var5 + 2];
                        var78.field2841 = field805[var5 + 3];
                        client.method2727(var78);
                        client.method931(var78);
                        if (var77 != -1 && var78.field2815 == 0) {
                            client.method732(Statics.field2831[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var461 == 1001) {
                        var5 -= 4;
                        var78.field2779 = field805[var5];
                        var78.field2780 = field805[var5 + 1];
                        var78.field2775 = field805[var5 + 2];
                        var78.field2773 = field805[var5 + 3];
                        client.method2727(var78);
                        client.method931(var78);
                        if (var77 != -1 && var78.field2815 == 0) {
                            client.method732(Statics.field2831[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var461 == 1003) {
                        var5--;
                        boolean var79 = field805[var5] == 1;
                        if (var78.field2788 != var79) {
                            var78.field2788 = var79;
                            client.method2727(var78);
                        }
                        continue;
                    }
                    if (var461 == 1005) {
                        var5--;
                        var78.field2901 = field805[var5] == 1;
                        continue;
                    }
                    if (var461 == 1006) {
                        var5--;
                        var78.field2902 = field805[var5] == 1;
                        continue;
                    }
                } else if (!(var461 < 1100 || var461 >= 1200) || !(var461 < 2100 || var461 >= 2200)) {
                    int var80 = -1;
                    class174 var81;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var80 = field805[var5];
                        var81 = class174.method1096(var80);
                    } else {
                        var81 = var62 ? Statics.field810 : Statics.field799;
                    }
                    if (var461 == 1100) {
                        var5 -= 2;
                        var81.field2789 = field805[var5];
                        if (var81.field2789 > var81.field2791 - var81.field2768) {
                            var81.field2789 = var81.field2791 - var81.field2768;
                        }
                        if (var81.field2789 < 0) {
                            var81.field2789 = 0;
                        }
                        var81.field2883 = field805[var5 + 1];
                        if (var81.field2883 > var81.field2792 - var81.field2784) {
                            var81.field2883 = var81.field2792 - var81.field2784;
                        }
                        if (var81.field2883 < 0) {
                            var81.field2883 = 0;
                        }
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1101) {
                        var5--;
                        var81.field2885 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1102) {
                        var5--;
                        var81.field2797 = field805[var5] == 1;
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1103) {
                        var5--;
                        var81.field2799 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1104) {
                        var5--;
                        var81.field2801 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1105) {
                        var5--;
                        var81.field2807 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1106) {
                        var5--;
                        var81.field2805 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1107) {
                        var5--;
                        var81.field2806 = field805[var5] == 1;
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1108) {
                        var81.field2811 = 1;
                        var5--;
                        var81.field2812 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1109) {
                        var5 -= 6;
                        var81.field2817 = field805[var5];
                        var81.field2818 = field805[var5 + 1];
                        var81.field2764 = field805[var5 + 2];
                        var81.field2820 = field805[var5 + 3];
                        var81.field2837 = field805[var5 + 4];
                        var81.field2822 = field805[var5 + 5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1110) {
                        var5--;
                        int var82 = field805[var5];
                        if (var81.field2852 != var82) {
                            var81.field2852 = var82;
                            var81.field2890 = 0;
                            var81.field2899 = 0;
                            client.method2727(var81);
                        }
                        continue;
                    }
                    if (var461 == 1111) {
                        var5--;
                        var81.field2825 = field805[var5] == 1;
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1112) {
                        var6--;
                        String var83 = field817[var6];
                        if (!var83.equals(var81.field2772)) {
                            var81.field2772 = var83;
                            client.method2727(var81);
                        }
                        continue;
                    }
                    if (var461 == 1113) {
                        var5--;
                        var81.field2827 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1114) {
                        var5 -= 3;
                        var81.field2790 = field805[var5];
                        var81.field2832 = field805[var5 + 1];
                        var81.field2771 = field805[var5 + 2];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1115) {
                        var5--;
                        var81.field2833 = field805[var5] == 1;
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1116) {
                        var5--;
                        var81.field2826 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1117) {
                        var5--;
                        var81.field2821 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1118) {
                        var5--;
                        var81.field2809 = field805[var5] == 1;
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1119) {
                        var5--;
                        var81.field2828 = field805[var5] == 1;
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1120) {
                        var5 -= 2;
                        var81.field2791 = field805[var5];
                        var81.field2792 = field805[var5 + 1];
                        client.method2727(var81);
                        if (var80 != -1 && var81.field2815 == 0) {
                            client.method732(Statics.field2831[var80 >> 16], var81, false);
                        }
                        continue;
                    }
                    if (var461 == 1121) {
                        int var84 = var81.field2839;
                        int var85 = var81.field2803;
                        client.field319.method2614(138);
                        client.field319.method2406(var84);
                        client.field319.method2397(var85);
                        client.field459 = var81;
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1122) {
                        var5--;
                        var81.field2888 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1123) {
                        var5--;
                        var81.field2794 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1124) {
                        var5--;
                        var81.field2800 = field805[var5];
                        client.method2727(var81);
                        continue;
                    }
                    if (var461 == 1125) {
                        var5--;
                        int var86 = field805[var5];
                        class83 var87 = (class83) class110.method603(class83.method4(), var86);
                        if (var87 != null) {
                            var81.field2798 = var87;
                            client.method2727(var81);
                        }
                        continue;
                    }
                } else if (var461 >= 1200 && var461 < 1300 || var461 >= 2200 && var461 < 2300) {
                    class174 var88;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var88 = class174.method1096(field805[var5]);
                    } else {
                        var88 = var62 ? Statics.field810 : Statics.field799;
                    }
                    client.method2727(var88);
                    if (var461 == 1200 || var461 == 1205 || var461 == 1212) {
                        var5 -= 2;
                        int var89 = field805[var5];
                        int var90 = field805[var5 + 1];
                        var88.field2884 = var89;
                        var88.field2889 = var90;
                        class52 var91 = class52.method1036(var89);
                        var88.field2764 = var91.field1141;
                        var88.field2820 = var91.field1130;
                        var88.field2837 = var91.field1131;
                        var88.field2817 = var91.field1132;
                        var88.field2818 = var91.field1133;
                        var88.field2822 = var91.field1159;
                        if (var461 == 1205) {
                            var88.field2808 = 0;
                        } else if (var461 == 1212 | var91.field1134 == 1) {
                            var88.field2808 = 1;
                        } else {
                            var88.field2808 = 2;
                        }
                        if (var88.field2823 > 0) {
                            var88.field2822 = var88.field2822 * 32 / var88.field2823;
                        } else if (var88.field2779 > 0) {
                            var88.field2822 = var88.field2822 * 32 / var88.field2779;
                        }
                        continue;
                    }
                    if (var461 == 1201) {
                        var88.field2811 = 2;
                        var5--;
                        var88.field2812 = field805[var5];
                        continue;
                    }
                    if (var461 == 1202) {
                        var88.field2811 = 3;
                        var88.field2812 = Statics.field2693.field48.method3275();
                        continue;
                    }
                } else if (var461 >= 1300 && var461 < 1400 || var461 >= 2300 && var461 < 2400) {
                    class174 var92;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var92 = class174.method1096(field805[var5]);
                    } else {
                        var92 = var62 ? Statics.field810 : Statics.field799;
                    }
                    if (var461 == 1300) {
                        var5--;
                        int var93 = field805[var5] - 1;
                        if (var93 >= 0 && var93 <= 9) {
                            var6--;
                            var92.method3210(var93, field817[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var461 == 1301) {
                        var5 -= 2;
                        int var94 = field805[var5];
                        int var95 = field805[var5 + 1];
                        var92.field2769 = class174.method2990(var94, var95);
                        continue;
                    }
                    if (var461 == 1302) {
                        var5--;
                        var92.field2846 = field805[var5] == 1;
                        continue;
                    }
                    if (var461 == 1303) {
                        var5--;
                        var92.field2793 = field805[var5];
                        continue;
                    }
                    if (var461 == 1304) {
                        var5--;
                        var92.field2845 = field805[var5];
                        continue;
                    }
                    if (var461 == 1305) {
                        var6--;
                        var92.field2871 = field817[var6];
                        continue;
                    }
                    if (var461 == 1306) {
                        var6--;
                        var92.field2847 = field817[var6];
                        continue;
                    }
                    if (var461 == 1307) {
                        var92.field2843 = null;
                        continue;
                    }
                } else {
                    if (var461 >= 1400 && var461 < 1500 || var461 >= 2400 && var461 < 2500) {
                        class174 var96;
                        if (var461 >= 2000) {
                            var461 -= 1000;
                            var5--;
                            var96 = class174.method1096(field805[var5]);
                        } else {
                            var96 = var62 ? Statics.field810 : Statics.field799;
                        }
                        var6--;
                        String var97 = field817[var6];
                        int[] var98 = null;
                        if (var97.length() > 0 && var97.charAt(var97.length() - 1) == 'Y') {
                            var5--;
                            int var99 = field805[var5];
                            if (var99 > 0) {
                                var98 = new int[var99];
                                while (var99-- > 0) {
                                    var5--;
                                    var98[var99] = field805[var5];
                                }
                            }
                            var97 = var97.substring(0, var97.length() - 1);
                        }
                        Object[] var100 = new Object[var97.length() + 1];
                        for (int var101 = var100.length - 1; var101 >= 1; var101--) {
                            if (var97.charAt(var101 - 1) == 's') {
                                var6--;
                                var100[var101] = field817[var6];
                            } else {
                                var5--;
                                var100[var101] = Integer.valueOf(field805[var5]);
                            }
                        }
                        var5--;
                        int var102 = field805[var5];
                        if (var102 == -1) {
                            var100 = null;
                        } else {
                            var100[0] = Integer.valueOf(var102);
                        }
                        if (var461 == 1400) {
                            var96.field2850 = var100;
                        }
                        if (var461 == 1401) {
                            var96.field2853 = var100;
                        }
                        if (var461 == 1402) {
                            var96.field2897 = var100;
                        }
                        if (var461 == 1403) {
                            var96.field2782 = var100;
                        }
                        if (var461 == 1404) {
                            var96.field2856 = var100;
                        }
                        if (var461 == 1405) {
                            var96.field2857 = var100;
                        }
                        if (var461 == 1406) {
                            var96.field2860 = var100;
                        }
                        if (var461 == 1407) {
                            var96.field2861 = var100;
                            var96.field2862 = var98;
                        }
                        if (var461 == 1408) {
                            var96.field2867 = var100;
                        }
                        if (var461 == 1409) {
                            var96.field2868 = var100;
                        }
                        if (var461 == 1410) {
                            var96.field2796 = var100;
                        }
                        if (var461 == 1411) {
                            var96.field2851 = var100;
                        }
                        if (var461 == 1412) {
                            var96.field2763 = var100;
                        }
                        if (var461 == 1414) {
                            var96.field2863 = var100;
                            var96.field2776 = var98;
                        }
                        if (var461 == 1415) {
                            var96.field2865 = var100;
                            var96.field2866 = var98;
                        }
                        if (var461 == 1416) {
                            var96.field2859 = var100;
                        }
                        if (var461 == 1417) {
                            var96.field2774 = var100;
                        }
                        if (var461 == 1418) {
                            var96.field2870 = var100;
                        }
                        if (var461 == 1419) {
                            var96.field2864 = var100;
                        }
                        if (var461 == 1420) {
                            var96.field2830 = var100;
                        }
                        if (var461 == 1421) {
                            var96.field2873 = var100;
                        }
                        if (var461 == 1422) {
                            var96.field2810 = var100;
                        }
                        if (var461 == 1423) {
                            var96.field2875 = var100;
                        }
                        if (var461 == 1424) {
                            var96.field2876 = var100;
                        }
                        if (var461 == 1425) {
                            var96.field2878 = var100;
                        }
                        if (var461 == 1426) {
                            var96.field2879 = var100;
                        }
                        if (var461 == 1427) {
                            var96.field2877 = var100;
                        }
                        var96.field2848 = true;
                        continue;
                    }
                    if (var461 < 1600) {
                        class174 var103 = var62 ? Statics.field810 : Statics.field799;
                        if (var461 == 1500) {
                            field805[var5++] = var103.field2781;
                            continue;
                        }
                        if (var461 == 1501) {
                            field805[var5++] = var103.field2893;
                            continue;
                        }
                        if (var461 == 1502) {
                            field805[var5++] = var103.field2768;
                            continue;
                        }
                        if (var461 == 1503) {
                            field805[var5++] = var103.field2784;
                            continue;
                        }
                        if (var461 == 1504) {
                            field805[var5++] = var103.field2788 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 1505) {
                            field805[var5++] = var103.field2787;
                            continue;
                        }
                    } else if (var461 < 1700) {
                        class174 var104 = var62 ? Statics.field810 : Statics.field799;
                        if (var461 == 1600) {
                            field805[var5++] = var104.field2789;
                            continue;
                        }
                        if (var461 == 1601) {
                            field805[var5++] = var104.field2883;
                            continue;
                        }
                        if (var461 == 1602) {
                            field817[var6++] = var104.field2772;
                            continue;
                        }
                        if (var461 == 1603) {
                            field805[var5++] = var104.field2791;
                            continue;
                        }
                        if (var461 == 1604) {
                            field805[var5++] = var104.field2792;
                            continue;
                        }
                        if (var461 == 1605) {
                            field805[var5++] = var104.field2822;
                            continue;
                        }
                        if (var461 == 1606) {
                            field805[var5++] = var104.field2764;
                            continue;
                        }
                        if (var461 == 1607) {
                            field805[var5++] = var104.field2837;
                            continue;
                        }
                        if (var461 == 1608) {
                            field805[var5++] = var104.field2820;
                            continue;
                        }
                        if (var461 == 1609) {
                            field805[var5++] = var104.field2799;
                            continue;
                        }
                        if (var461 == 1610) {
                            field805[var5++] = var104.field2800;
                            continue;
                        }
                        if (var461 == 1611) {
                            field805[var5++] = var104.field2885;
                            continue;
                        }
                        if (var461 == 1612) {
                            field805[var5++] = var104.field2794;
                            continue;
                        }
                        if (var461 == 1613) {
                            field805[var5++] = var104.field2798.method575();
                            continue;
                        }
                    } else if (var461 < 1800) {
                        class174 var105 = var62 ? Statics.field810 : Statics.field799;
                        if (var461 == 1700) {
                            field805[var5++] = var105.field2884;
                            continue;
                        }
                        if (var461 == 1701) {
                            if (var105.field2884 == -1) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = var105.field2889;
                            }
                            continue;
                        }
                        if (var461 == 1702) {
                            field805[var5++] = var105.field2803;
                            continue;
                        }
                    } else if (var461 < 1900) {
                        class174 var106 = var62 ? Statics.field810 : Statics.field799;
                        if (var461 == 1800) {
                            field805[var5++] = class179.method47(client.method3180(var106));
                            continue;
                        }
                        if (var461 == 1801) {
                            var5--;
                            int var107 = field805[var5];
                            int var462 = var107 - 1;
                            if (var106.field2843 != null && var462 < var106.field2843.length && var106.field2843[var462] != null) {
                                field817[var6++] = var106.field2843[var462];
                                continue;
                            }
                            field817[var6++] = "";
                            continue;
                        }
                        if (var461 == 1802) {
                            if (var106.field2871 == null) {
                                field817[var6++] = "";
                            } else {
                                field817[var6++] = var106.field2871;
                            }
                            continue;
                        }
                    } else if (var461 >= 1900 && var461 < 2000 || var461 >= 2900 && var461 < 3000) {
                        class174 var108;
                        if (var461 >= 2000) {
                            var461 -= 1000;
                            var5--;
                            var108 = class174.method1096(field805[var5]);
                        } else {
                            var108 = var62 ? Statics.field810 : Statics.field799;
                        }
                        if (var461 == 1927) {
                            if (field807 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var108.field2877 == null) {
                                return;
                            }
                            class1 var109 = new class1();
                            var109.field3 = var108;
                            var109.field8 = var108.field2877;
                            var109.field11 = field807 + 1;
                            client.field494.method3583(arg0);
                            continue;
                        }
                    } else if (var461 < 2600) {
                        var5--;
                        class174 var110 = class174.method1096(field805[var5]);
                        if (var461 == 2500) {
                            field805[var5++] = var110.field2781;
                            continue;
                        }
                        if (var461 == 2501) {
                            field805[var5++] = var110.field2893;
                            continue;
                        }
                        if (var461 == 2502) {
                            field805[var5++] = var110.field2768;
                            continue;
                        }
                        if (var461 == 2503) {
                            field805[var5++] = var110.field2784;
                            continue;
                        }
                        if (var461 == 2504) {
                            field805[var5++] = var110.field2788 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 2505) {
                            field805[var5++] = var110.field2787;
                            continue;
                        }
                    } else if (var461 < 2700) {
                        var5--;
                        class174 var111 = class174.method1096(field805[var5]);
                        if (var461 == 2600) {
                            field805[var5++] = var111.field2789;
                            continue;
                        }
                        if (var461 == 2601) {
                            field805[var5++] = var111.field2883;
                            continue;
                        }
                        if (var461 == 2602) {
                            field817[var6++] = var111.field2772;
                            continue;
                        }
                        if (var461 == 2603) {
                            field805[var5++] = var111.field2791;
                            continue;
                        }
                        if (var461 == 2604) {
                            field805[var5++] = var111.field2792;
                            continue;
                        }
                        if (var461 == 2605) {
                            field805[var5++] = var111.field2822;
                            continue;
                        }
                        if (var461 == 2606) {
                            field805[var5++] = var111.field2764;
                            continue;
                        }
                        if (var461 == 2607) {
                            field805[var5++] = var111.field2837;
                            continue;
                        }
                        if (var461 == 2608) {
                            field805[var5++] = var111.field2820;
                            continue;
                        }
                        if (var461 == 2609) {
                            field805[var5++] = var111.field2799;
                            continue;
                        }
                        if (var461 == 2610) {
                            field805[var5++] = var111.field2800;
                            continue;
                        }
                        if (var461 == 2611) {
                            field805[var5++] = var111.field2885;
                            continue;
                        }
                        if (var461 == 2612) {
                            field805[var5++] = var111.field2794;
                            continue;
                        }
                        if (var461 == 2613) {
                            field805[var5++] = var111.field2798.method575();
                            continue;
                        }
                    } else if (var461 < 2800) {
                        if (var461 == 2700) {
                            var5--;
                            class174 var112 = class174.method1096(field805[var5]);
                            field805[var5++] = var112.field2884;
                            continue;
                        }
                        if (var461 == 2701) {
                            var5--;
                            class174 var113 = class174.method1096(field805[var5]);
                            if (var113.field2884 == -1) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = var113.field2889;
                            }
                            continue;
                        }
                        if (var461 == 2702) {
                            var5--;
                            int var114 = field805[var5];
                            class4 var115 = (class4) client.field456.method3555((long) var114);
                            if (var115 == null) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = 1;
                            }
                            continue;
                        }
                        if (var461 == 2706) {
                            field805[var5++] = client.field455;
                            continue;
                        }
                    } else if (var461 < 2900) {
                        var5--;
                        class174 var116 = class174.method1096(field805[var5]);
                        if (var461 == 2800) {
                            int[] var117 = field805;
                            int var118 = var5++;
                            int var119 = client.method3180(var116);
                            int var120 = var119 >> 11 & 0x3F;
                            var117[var118] = var120;
                            continue;
                        }
                        if (var461 == 2801) {
                            var5--;
                            int var121 = field805[var5];
                            int var463 = var121 - 1;
                            if (var116.field2843 != null && var463 < var116.field2843.length && var116.field2843[var463] != null) {
                                field817[var6++] = var116.field2843[var463];
                                continue;
                            }
                            field817[var6++] = "";
                            continue;
                        }
                        if (var461 == 2802) {
                            if (var116.field2871 == null) {
                                field817[var6++] = "";
                            } else {
                                field817[var6++] = var116.field2871;
                            }
                            continue;
                        }
                    } else if (var461 < 3200) {
                        if (var461 == 3100) {
                            var6--;
                            String var122 = field817[var6];
                            class12.method2156(0, "", var122);
                            continue;
                        }
                        if (var461 == 3101) {
                            var5 -= 2;
                            client.method183(Statics.field2693, field805[var5], field805[var5 + 1]);
                            continue;
                        }
                        if (var461 == 3103) {
                            client.field319.method2614(243);
                            for (class4 var123 = (class4) client.field456.method3554(); var123 != null; var123 = (class4) client.field456.method3558()) {
                                if (var123.field80 == 0 || var123.field80 == 3) {
                                    client.method94(var123, true);
                                }
                            }
                            if (client.field459 != null) {
                                client.method2727(client.field459);
                                client.field459 = null;
                            }
                            continue;
                        }
                        if (var461 == 3104) {
                            var6--;
                            String var124 = field817[var6];
                            int var125 = 0;
                            boolean var126 = class164.method2970(var124, 10, true);
                            if (var126) {
                                var125 = class164.method2833(var124);
                            }
                            client.field319.method2614(104);
                            client.field319.method2351(var125);
                            continue;
                        }
                        if (var461 == 3105) {
                            var6--;
                            String var127 = field817[var6];
                            client.field319.method2614(255);
                            client.field319.method2430(var127.length() + 1);
                            client.field319.method2518(var127);
                            continue;
                        }
                        if (var461 == 3106) {
                            var6--;
                            String var128 = field817[var6];
                            client.field319.method2614(117);
                            client.field319.method2430(var128.length() + 1);
                            client.field319.method2518(var128);
                            continue;
                        }
                        if (var461 == 3107) {
                            var5--;
                            int var129 = field805[var5];
                            var6--;
                            String var130 = field817[var6];
                            int var131 = class33.field752;
                            int[] var132 = class33.field758;
                            boolean var133 = false;
                            for (int var134 = 0; var134 < var131; var134++) {
                                class3 var135 = client.field416[var132[var134]];
                                if (var135 != null && Statics.field2693 != var135 && var135.field60 != null && var135.field60.equalsIgnoreCase(var130)) {
                                    if (var129 == 1) {
                                        client.field319.method2614(77);
                                        client.field319.method2430(0);
                                        client.field319.method2349(var132[var134]);
                                    } else if (var129 == 4) {
                                        client.field319.method2614(36);
                                        client.field319.method2395(var132[var134]);
                                        client.field319.method2430(0);
                                    } else if (var129 == 6) {
                                        client.field319.method2614(236);
                                        client.field319.method2475(0);
                                        client.field319.method2349(var132[var134]);
                                    } else if (var129 == 7) {
                                        client.field319.method2614(119);
                                        client.field319.method2430(0);
                                        client.field319.method2349(var132[var134]);
                                    }
                                    var133 = true;
                                    break;
                                }
                            }
                            if (!var133) {
                                class12.method2156(4, "", class158.field2542 + var130);
                            }
                            continue;
                        }
                        if (var461 == 3108) {
                            var5 -= 3;
                            int var136 = field805[var5];
                            int var137 = field805[var5 + 1];
                            int var138 = field805[var5 + 2];
                            class174 var139 = class174.method1096(var138);
                            client.method127(var139, var136, var137);
                            continue;
                        }
                        if (var461 == 3109) {
                            var5 -= 2;
                            int var140 = field805[var5];
                            int var141 = field805[var5 + 1];
                            class174 var142 = var62 ? Statics.field810 : Statics.field799;
                            client.method127(var142, var140, var141);
                            continue;
                        }
                        if (var461 == 3110) {
                            var5--;
                            Statics.field923 = field805[var5] == 1;
                            continue;
                        }
                        if (var461 == 3111) {
                            field805[var5++] = Statics.field990.field165 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3112) {
                            var5--;
                            Statics.field990.field165 = field805[var5] == 1;
                            class9.method151();
                            continue;
                        }
                        if (var461 == 3113) {
                            var6--;
                            String var143 = field817[var6];
                            var5--;
                            boolean var144 = field805[var5] == 1;
                            if (!var144) {
                                Statics.method735(var143, 3, "openjs");
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var143));
                                    continue;
                                } catch (Exception var459) {
                                }
                            }
                            if (class139.field2152.startsWith("win")) {
                                Statics.method735(var143, 0, "openjs");
                            } else if (class139.field2152.startsWith("mac")) {
                                Statics.method735(var143, 1, "openjs");
                            } else {
                                Statics.method735(var143, 2, "openjs");
                            }
                            continue;
                        }
                        if (var461 == 3115) {
                            var5--;
                            int var146 = field805[var5];
                            client.field319.method2614(57);
                            client.field319.method2349(var146);
                            continue;
                        }
                        if (var461 == 3116) {
                            var5--;
                            int var147 = field805[var5];
                            var6 -= 2;
                            String var148 = field817[var6];
                            String var149 = field817[var6 + 1];
                            if (var148.length() <= 500 && var149.length() <= 500) {
                                client.field319.method2614(252);
                                client.field319.method2349(1 + class120.method973(var148) + class120.method973(var149));
                                client.field319.method2518(var149);
                                client.field319.method2518(var148);
                                client.field319.method2475(var147);
                            }
                            continue;
                        }
                    } else if (var461 < 3300) {
                        if (var461 == 3200) {
                            var5 -= 3;
                            client.method2157(field805[var5], field805[var5 + 1], field805[var5 + 2]);
                            continue;
                        }
                        if (var461 == 3201) {
                            var5--;
                            int var150 = field805[var5];
                            if (var150 == -1 && !client.field497) {
                                Statics.field2968.method3431();
                                class184.field2969 = 1;
                                Statics.field2280 = null;
                            } else if (var150 != -1 && client.field533 != var150 && client.field370 != 0 && !client.field497) {
                                class169 var151 = Statics.field290;
                                int var152 = client.field370;
                                class184.field2969 = 1;
                                Statics.field2280 = var151;
                                Statics.field1359 = var150;
                                Statics.field2965 = 0;
                                Statics.field2971 = var152;
                                Statics.field226 = false;
                                Statics.field1385 = 2;
                            }
                            client.field533 = var150;
                            continue;
                        }
                        if (var461 == 3202) {
                            var5 -= 2;
                            client.method1569(field805[var5], field805[var5 + 1]);
                            continue;
                        }
                    } else if (var461 < 3400) {
                        if (var461 == 3300) {
                            field805[var5++] = client.field306;
                            continue;
                        }
                        if (var461 == 3301) {
                            var5 -= 2;
                            int var153 = field805[var5];
                            int var154 = field805[var5 + 1];
                            int[] var155 = field805;
                            int var156 = var5++;
                            class16 var157 = (class16) class16.field235.method3555((long) var153);
                            int var158;
                            if (var157 == null) {
                                var158 = -1;
                            } else if (var154 >= 0 && var154 < var157.field229.length) {
                                var158 = var157.field229[var154];
                            } else {
                                var158 = -1;
                            }
                            var155[var156] = var158;
                            continue;
                        }
                        if (var461 == 3302) {
                            var5 -= 2;
                            int var159 = field805[var5];
                            int var160 = field805[var5 + 1];
                            field805[var5++] = class16.method3179(var159, var160);
                            continue;
                        }
                        if (var461 == 3303) {
                            var5 -= 2;
                            int var161 = field805[var5];
                            int var162 = field805[var5 + 1];
                            field805[var5++] = class16.method175(var161, var162);
                            continue;
                        }
                        if (var461 == 3304) {
                            var5--;
                            int var163 = field805[var5];
                            field805[var5++] = class51.method160(var163).field1110;
                            continue;
                        }
                        if (var461 == 3305) {
                            var5--;
                            int var164 = field805[var5];
                            field805[var5++] = client.field430[var164];
                            continue;
                        }
                        if (var461 == 3306) {
                            var5--;
                            int var165 = field805[var5];
                            field805[var5++] = client.field538[var165];
                            continue;
                        }
                        if (var461 == 3307) {
                            var5--;
                            int var166 = field805[var5];
                            field805[var5++] = client.field465[var166];
                            continue;
                        }
                        if (var461 == 3308) {
                            int var167 = Statics.field1438;
                            int var168 = (Statics.field2693.field850 >> 7) + Statics.field991;
                            int var169 = (Statics.field2693.field820 >> 7) + Statics.field38;
                            field805[var5++] = (var167 << 28) + (var168 << 14) + var169;
                            continue;
                        }
                        if (var461 == 3309) {
                            var5--;
                            int var170 = field805[var5];
                            field805[var5++] = var170 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var461 == 3310) {
                            var5--;
                            int var171 = field805[var5];
                            field805[var5++] = var171 >> 28;
                            continue;
                        }
                        if (var461 == 3311) {
                            var5--;
                            int var172 = field805[var5];
                            field805[var5++] = var172 & 0x3FFF;
                            continue;
                        }
                        if (var461 == 3312) {
                            field805[var5++] = client.field301 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3313) {
                            var5 -= 2;
                            int var173 = field805[var5] + 32768;
                            int var174 = field805[var5 + 1];
                            int[] var175 = field805;
                            int var176 = var5++;
                            class16 var177 = (class16) class16.field235.method3555((long) var173);
                            int var178;
                            if (var177 == null) {
                                var178 = -1;
                            } else if (var174 >= 0 && var174 < var177.field229.length) {
                                var178 = var177.field229[var174];
                            } else {
                                var178 = -1;
                            }
                            var175[var176] = var178;
                            continue;
                        }
                        if (var461 == 3314) {
                            var5 -= 2;
                            int var179 = field805[var5] + 32768;
                            int var180 = field805[var5 + 1];
                            field805[var5++] = class16.method3179(var179, var180);
                            continue;
                        }
                        if (var461 == 3315) {
                            var5 -= 2;
                            int var181 = field805[var5] + 32768;
                            int var182 = field805[var5 + 1];
                            field805[var5++] = class16.method175(var181, var182);
                            continue;
                        }
                        if (var461 == 3316) {
                            if (client.field462 >= 2) {
                                field805[var5++] = client.field462;
                            } else {
                                field805[var5++] = 0;
                            }
                            continue;
                        }
                        if (var461 == 3317) {
                            field805[var5++] = client.field395;
                            continue;
                        }
                        if (var461 == 3318) {
                            field805[var5++] = client.field297;
                            continue;
                        }
                        if (var461 == 3321) {
                            field805[var5++] = client.field523;
                            continue;
                        }
                        if (var461 == 3322) {
                            field805[var5++] = client.field461;
                            continue;
                        }
                        if (var461 == 3323) {
                            if (client.field464) {
                                field805[var5++] = 1;
                            } else {
                                field805[var5++] = 0;
                            }
                            continue;
                        }
                        if (var461 == 3324) {
                            field805[var5++] = client.field504;
                            continue;
                        }
                    } else if (var461 < 3500) {
                        if (var461 == 3400) {
                            var5 -= 2;
                            int var183 = field805[var5];
                            int var184 = field805[var5 + 1];
                            class49 var185 = class49.method2834(var183);
                            if (var185.field1095 != 's') {
                            }
                            for (int var186 = 0; var186 < var185.field1094; var186++) {
                                if (var185.field1096[var186] == var184) {
                                    field817[var6++] = var185.field1097[var186];
                                    var185 = null;
                                    break;
                                }
                            }
                            if (var185 != null) {
                                field817[var6++] = var185.field1092;
                            }
                            continue;
                        }
                        if (var461 == 3408) {
                            var5 -= 4;
                            int var187 = field805[var5];
                            int var188 = field805[var5 + 1];
                            int var189 = field805[var5 + 2];
                            int var190 = field805[var5 + 3];
                            class49 var191 = class49.method2834(var189);
                            if (var191.field1090 == var187 && var191.field1095 == var188) {
                                for (int var192 = 0; var192 < var191.field1094; var192++) {
                                    if (var191.field1096[var192] == var190) {
                                        if (var188 == 115) {
                                            field817[var6++] = var191.field1097[var192];
                                        } else {
                                            field805[var5++] = var191.field1091[var192];
                                        }
                                        var191 = null;
                                        break;
                                    }
                                }
                                if (var191 != null) {
                                    if (var188 == 115) {
                                        field817[var6++] = var191.field1092;
                                    } else {
                                        field805[var5++] = var191.field1093;
                                    }
                                }
                                continue;
                            }
                            if (var188 == 115) {
                                field817[var6++] = "null";
                            } else {
                                field805[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var461 < 3700) {
                        if (var461 == 3600) {
                            if (client.field563 == 0) {
                                field805[var5++] = -2;
                            } else if (client.field563 == 1) {
                                field805[var5++] = -1;
                            } else {
                                field805[var5++] = client.field562;
                            }
                            continue;
                        }
                        if (var461 == 3601) {
                            var5--;
                            int var193 = field805[var5];
                            if (client.field563 == 2 && var193 < client.field562) {
                                field817[var6++] = client.field475[var193].field261;
                                field817[var6++] = client.field475[var193].field255;
                                continue;
                            }
                            field817[var6++] = "";
                            field817[var6++] = "";
                            continue;
                        }
                        if (var461 == 3602) {
                            var5--;
                            int var194 = field805[var5];
                            if (client.field563 == 2 && var194 < client.field562) {
                                field805[var5++] = client.field475[var194].field256;
                                continue;
                            }
                            field805[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3603) {
                            var5--;
                            int var195 = field805[var5];
                            if (client.field563 == 2 && var195 < client.field562) {
                                field805[var5++] = client.field475[var195].field262;
                                continue;
                            }
                            field805[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3604) {
                            var6--;
                            String var196 = field817[var6];
                            var5--;
                            int var197 = field805[var5];
                            client.field319.method2614(174);
                            client.field319.method2430(class120.method973(var196) + 1);
                            client.field319.method2518(var196);
                            client.field319.method2387(var197);
                            continue;
                        }
                        if (var461 == 3605) {
                            var6--;
                            String var198 = field817[var6];
                            client.method1779(var198);
                            continue;
                        }
                        if (var461 == 3606) {
                            var6--;
                            String var199 = field817[var6];
                            if (var199 == null) {
                                continue;
                            }
                            String var200 = class165.method2839(var199, Statics.field2679);
                            if (var200 == null) {
                                continue;
                            }
                            int var201 = 0;
                            while (true) {
                                if (var201 >= client.field562) {
                                    continue label3223;
                                }
                                class18 var202 = client.field475[var201];
                                String var203 = var202.field261;
                                String var204 = class165.method2839(var203, Statics.field2679);
                                boolean var205;
                                if (var199 == null || var203 == null) {
                                    var205 = false;
                                } else if (var199.startsWith("#") || var203.startsWith("#")) {
                                    var205 = var199.equals(var203);
                                } else {
                                    var205 = var200.equals(var204);
                                }
                                if (var205) {
                                    client.field562--;
                                    for (int var206 = var201; var206 < client.field562; var206++) {
                                        client.field475[var206] = client.field475[var206 + 1];
                                    }
                                    client.field573 = client.field492;
                                    client.field319.method2614(79);
                                    client.field319.method2430(class120.method973(var199));
                                    client.field319.method2518(var199);
                                    continue label3223;
                                }
                                var201++;
                            }
                        }
                        if (var461 == 3607) {
                            var6--;
                            String var207 = field817[var6];
                            client.method2148(var207, false);
                            continue;
                        }
                        if (var461 == 3608) {
                            var6--;
                            String var208 = field817[var6];
                            client.method180(var208);
                            continue;
                        }
                        if (var461 == 3609) {
                            var6--;
                            String var209 = field817[var6];
                            class153[] var210 = class153.method2055();
                            for (int var211 = 0; var211 < var210.length; var211++) {
                                class153 var212 = var210[var211];
                                if (var212.field2285 != -1 && var209.startsWith(class2.method2728(var212.field2285))) {
                                    var209 = var209.substring(6 + Integer.toString(var212.field2285).length());
                                    break;
                                }
                            }
                            field805[var5++] = Statics.method2684(var209, false) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3611) {
                            if (client.field339 == null) {
                                field817[var6++] = "";
                            } else {
                                field817[var6++] = class163.method751(client.field339);
                            }
                            continue;
                        }
                        if (var461 == 3612) {
                            if (client.field339 == null) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = Statics.field190;
                            }
                            continue;
                        }
                        if (var461 == 3613) {
                            var5--;
                            int var213 = field805[var5];
                            if (client.field339 != null && var213 < Statics.field190) {
                                field817[var6++] = Statics.field163[var213].field635;
                                continue;
                            }
                            field817[var6++] = "";
                            continue;
                        }
                        if (var461 == 3614) {
                            var5--;
                            int var214 = field805[var5];
                            if (client.field339 != null && var214 < Statics.field190) {
                                field805[var5++] = Statics.field163[var214].field628;
                                continue;
                            }
                            field805[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3615) {
                            var5--;
                            int var215 = field805[var5];
                            if (client.field339 != null && var215 < Statics.field190) {
                                field805[var5++] = Statics.field163[var215].field631;
                                continue;
                            }
                            field805[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3616) {
                            field805[var5++] = Statics.field3002;
                            continue;
                        }
                        if (var461 == 3617) {
                            var6--;
                            String var216 = field817[var6];
                            client.method867(var216);
                            continue;
                        }
                        if (var461 == 3618) {
                            field805[var5++] = Statics.field2503;
                            continue;
                        }
                        if (var461 == 3619) {
                            var6--;
                            String var217 = field817[var6];
                            if (!var217.equals("")) {
                                client.field319.method2614(232);
                                client.field319.method2430(class120.method973(var217));
                                client.field319.method2518(var217);
                            }
                            continue;
                        }
                        if (var461 == 3620) {
                            client.method155();
                            continue;
                        }
                        if (var461 == 3621) {
                            if (client.field563 == 0) {
                                field805[var5++] = -1;
                            } else {
                                field805[var5++] = client.field566;
                            }
                            continue;
                        }
                        if (var461 == 3622) {
                            var5--;
                            int var218 = field805[var5];
                            if (client.field563 != 0 && var218 < client.field566) {
                                field817[var6++] = client.field567[var218].field147;
                                field817[var6++] = client.field567[var218].field141;
                                continue;
                            }
                            field817[var6++] = "";
                            field817[var6++] = "";
                            continue;
                        }
                        if (var461 == 3623) {
                            var6--;
                            String var219 = field817[var6];
                            if (var219.startsWith(class2.method2728(0)) || var219.startsWith(class2.method2728(1))) {
                                var219 = var219.substring(7);
                            }
                            field805[var5++] = client.method972(var219) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3624) {
                            var5--;
                            int var220 = field805[var5];
                            if (Statics.field163 != null && var220 < Statics.field190 && Statics.field163[var220].field635.equalsIgnoreCase(Statics.field2693.field60)) {
                                field805[var5++] = 1;
                                continue;
                            }
                            field805[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3625) {
                            if (client.field451 == null) {
                                field817[var6++] = "";
                                continue;
                            }
                            String[] var221 = field817;
                            int var222 = var6++;
                            String var223 = client.field451;
                            long var224 = 0L;
                            int var226 = var223.length();
                            for (int var227 = 0; var227 < var226; var227++) {
                                var224 *= 37L;
                                char var228 = var223.charAt(var227);
                                if (var228 >= 'A' && var228 <= 'Z') {
                                    var224 += (long) (var228 + 1 - 65);
                                } else if (var228 >= 'a' && var228 <= 'z') {
                                    var224 += (long) (var228 + 1 - 97);
                                } else if (var228 >= '0' && var228 <= '9') {
                                    var224 += (long) (var228 + 27 - 48);
                                }
                                if (var224 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var224 % 37L == 0L && var224 != 0L) {
                                var224 /= 37L;
                            }
                            String var231 = class163.method2163(var224);
                            if (var231 == null) {
                                var231 = "";
                            }
                            var221[var222] = var231;
                            continue;
                        }
                    } else if (var461 < 4000) {
                        if (var461 == 3903) {
                            var5--;
                            int var233 = field805[var5];
                            field805[var5++] = client.field571[var233].method3752();
                            continue;
                        }
                        if (var461 == 3904) {
                            var5--;
                            int var234 = field805[var5];
                            field805[var5++] = client.field571[var234].field3173;
                            continue;
                        }
                        if (var461 == 3905) {
                            var5--;
                            int var235 = field805[var5];
                            field805[var5++] = client.field571[var235].field3174;
                            continue;
                        }
                        if (var461 == 3906) {
                            var5--;
                            int var236 = field805[var5];
                            field805[var5++] = client.field571[var236].field3175;
                            continue;
                        }
                        if (var461 == 3907) {
                            var5--;
                            int var237 = field805[var5];
                            field805[var5++] = client.field571[var237].field3172;
                            continue;
                        }
                        if (var461 == 3908) {
                            var5--;
                            int var238 = field805[var5];
                            field805[var5++] = client.field571[var238].field3177;
                            continue;
                        }
                        if (var461 == 3910) {
                            var5--;
                            int var239 = field805[var5];
                            int var240 = client.field571[var239].method3749();
                            field805[var5++] = var240 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3911) {
                            var5--;
                            int var241 = field805[var5];
                            int var242 = client.field571[var241].method3749();
                            field805[var5++] = var242 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3912) {
                            var5--;
                            int var243 = field805[var5];
                            int var244 = client.field571[var243].method3749();
                            field805[var5++] = var244 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3913) {
                            var5--;
                            int var245 = field805[var5];
                            int var246 = client.field571[var245].method3749();
                            field805[var5++] = var246 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3914) {
                            var5--;
                            boolean var247 = field805[var5] == 1;
                            if (Statics.field1165 != null) {
                                Statics.field1165.method3768(class222.field3183, var247);
                            }
                            continue;
                        }
                        if (var461 == 3915) {
                            var5--;
                            boolean var248 = field805[var5] == 1;
                            if (Statics.field1165 != null) {
                                Statics.field1165.method3768(class222.field3182, var248);
                            }
                            continue;
                        }
                        if (var461 == 3916) {
                            var5 -= 2;
                            boolean var249 = field805[var5] == 1;
                            boolean var250 = field805[var5 + 1] == 1;
                            if (Statics.field1165 != null) {
                                Statics.field1165.method3768(new class22(var250), var249);
                            }
                            continue;
                        }
                        if (var461 == 3917) {
                            var5--;
                            boolean var251 = field805[var5] == 1;
                            if (Statics.field1165 != null) {
                                Statics.field1165.method3768(class222.field3181, var251);
                            }
                            continue;
                        }
                        if (var461 == 3918) {
                            var5--;
                            boolean var252 = field805[var5] == 1;
                            if (Statics.field1165 != null) {
                                Statics.field1165.method3768(class222.field3184, var252);
                            }
                            continue;
                        }
                        if (var461 == 3919) {
                            field805[var5++] = Statics.field1165 == null ? 0 : Statics.field1165.field3180.size();
                            continue;
                        }
                        if (var461 == 3920) {
                            var5--;
                            int var253 = field805[var5];
                            class215 var254 = (class215) Statics.field1165.field3180.get(var253);
                            field805[var5++] = var254.field3161;
                            continue;
                        }
                        if (var461 == 3921) {
                            var5--;
                            int var255 = field805[var5];
                            class215 var256 = (class215) Statics.field1165.field3180.get(var255);
                            field817[var6++] = var256.method3713();
                            continue;
                        }
                        if (var461 == 3922) {
                            var5--;
                            int var257 = field805[var5];
                            class215 var258 = (class215) Statics.field1165.field3180.get(var257);
                            field817[var6++] = var258.method3712();
                            continue;
                        }
                        if (var461 == 3923) {
                            var5--;
                            int var259 = field805[var5];
                            class215 var260 = (class215) Statics.field1165.field3180.get(var259);
                            long var261 = Statics.method162() - Statics.field27 - var260.field3155;
                            int var263 = (int) (var261 / 3600000L);
                            int var264 = (int) ((var261 - (long) (var263 * 3600000)) / 60000L);
                            int var265 = (int) ((var261 - (long) (var263 * 3600000) - (long) (var264 * 60000)) / 1000L);
                            String var266 = var263 + ":" + var264 / 10 + var264 % 10 + ":" + var265 / 10 + var265 % 10;
                            field817[var6++] = var266;
                            continue;
                        }
                        if (var461 == 3924) {
                            var5--;
                            int var267 = field805[var5];
                            class215 var268 = (class215) Statics.field1165.field3180.get(var267);
                            field805[var5++] = var268.field3157.field3175;
                            continue;
                        }
                        if (var461 == 3925) {
                            var5--;
                            int var269 = field805[var5];
                            class215 var270 = (class215) Statics.field1165.field3180.get(var269);
                            field805[var5++] = var270.field3157.field3174;
                            continue;
                        }
                        if (var461 == 3926) {
                            var5--;
                            int var271 = field805[var5];
                            class215 var272 = (class215) Statics.field1165.field3180.get(var271);
                            field805[var5++] = var272.field3157.field3173;
                            continue;
                        }
                    } else if (var461 < 4100) {
                        if (var461 == 4000) {
                            var5 -= 2;
                            int var273 = field805[var5];
                            int var274 = field805[var5 + 1];
                            field805[var5++] = var273 + var274;
                            continue;
                        }
                        if (var461 == 4001) {
                            var5 -= 2;
                            int var275 = field805[var5];
                            int var276 = field805[var5 + 1];
                            field805[var5++] = var275 - var276;
                            continue;
                        }
                        if (var461 == 4002) {
                            var5 -= 2;
                            int var277 = field805[var5];
                            int var278 = field805[var5 + 1];
                            field805[var5++] = var277 * var278;
                            continue;
                        }
                        if (var461 == 4003) {
                            var5 -= 2;
                            int var279 = field805[var5];
                            int var280 = field805[var5 + 1];
                            field805[var5++] = var279 / var280;
                            continue;
                        }
                        if (var461 == 4004) {
                            var5--;
                            int var281 = field805[var5];
                            field805[var5++] = (int) (Math.random() * (double) var281);
                            continue;
                        }
                        if (var461 == 4005) {
                            var5--;
                            int var282 = field805[var5];
                            field805[var5++] = (int) (Math.random() * (double) (var282 + 1));
                            continue;
                        }
                        if (var461 == 4006) {
                            var5 -= 5;
                            int var283 = field805[var5];
                            int var284 = field805[var5 + 1];
                            int var285 = field805[var5 + 2];
                            int var286 = field805[var5 + 3];
                            int var287 = field805[var5 + 4];
                            field805[var5++] = (var284 - var283) * (var287 - var285) / (var286 - var285) + var283;
                            continue;
                        }
                        if (var461 == 4007) {
                            var5 -= 2;
                            int var288 = field805[var5];
                            int var289 = field805[var5 + 1];
                            field805[var5++] = var288 * var289 / 100 + var288;
                            continue;
                        }
                        if (var461 == 4008) {
                            var5 -= 2;
                            int var290 = field805[var5];
                            int var291 = field805[var5 + 1];
                            field805[var5++] = var290 | 0x1 << var291;
                            continue;
                        }
                        if (var461 == 4009) {
                            var5 -= 2;
                            int var292 = field805[var5];
                            int var293 = field805[var5 + 1];
                            field805[var5++] = var292 & -1 - (0x1 << var293);
                            continue;
                        }
                        if (var461 == 4010) {
                            var5 -= 2;
                            int var294 = field805[var5];
                            int var295 = field805[var5 + 1];
                            field805[var5++] = (var294 & 0x1 << var295) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var461 == 4011) {
                            var5 -= 2;
                            int var296 = field805[var5];
                            int var297 = field805[var5 + 1];
                            field805[var5++] = var296 % var297;
                            continue;
                        }
                        if (var461 == 4012) {
                            var5 -= 2;
                            int var298 = field805[var5];
                            int var299 = field805[var5 + 1];
                            if (var298 == 0) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = (int) Math.pow((double) var298, (double) var299);
                            }
                            continue;
                        }
                        if (var461 == 4013) {
                            var5 -= 2;
                            int var300 = field805[var5];
                            int var301 = field805[var5 + 1];
                            if (var300 == 0) {
                                field805[var5++] = 0;
                            } else if (var301 == 0) {
                                field805[var5++] = Integer.MAX_VALUE;
                            } else {
                                field805[var5++] = (int) Math.pow((double) var300, 1.0D / (double) var301);
                            }
                            continue;
                        }
                        if (var461 == 4014) {
                            var5 -= 2;
                            int var302 = field805[var5];
                            int var303 = field805[var5 + 1];
                            field805[var5++] = var302 & var303;
                            continue;
                        }
                        if (var461 == 4015) {
                            var5 -= 2;
                            int var304 = field805[var5];
                            int var305 = field805[var5 + 1];
                            field805[var5++] = var304 | var305;
                            continue;
                        }
                    } else if (var461 < 4200) {
                        if (var461 == 4100) {
                            var6--;
                            String var306 = field817[var6];
                            var5--;
                            int var307 = field805[var5];
                            field817[var6++] = var306 + var307;
                            continue;
                        }
                        if (var461 == 4101) {
                            var6 -= 2;
                            String var308 = field817[var6];
                            String var309 = field817[var6 + 1];
                            field817[var6++] = var308 + var309;
                            continue;
                        }
                        if (var461 == 4102) {
                            var6--;
                            String var310 = field817[var6];
                            var5--;
                            int var311 = field805[var5];
                            field817[var6++] = var310 + class164.method46(var311, true);
                            continue;
                        }
                        if (var461 == 4103) {
                            var6--;
                            String var312 = field817[var6];
                            field817[var6++] = var312.toLowerCase();
                            continue;
                        }
                        if (var461 == 4104) {
                            var5--;
                            int var313 = field805[var5];
                            long var314 = ((long) var313 + 11745L) * 86400000L;
                            field811.setTime(new Date(var314));
                            int var316 = field811.get(5);
                            int var317 = field811.get(2);
                            int var318 = field811.get(1);
                            field817[var6++] = var316 + "-" + field812[var317] + "-" + var318;
                            continue;
                        }
                        if (var461 == 4105) {
                            var6 -= 2;
                            String var319 = field817[var6];
                            String var320 = field817[var6 + 1];
                            if (Statics.field2693.field48 != null && Statics.field2693.field48.field2928) {
                                field817[var6++] = var320;
                                continue;
                            }
                            field817[var6++] = var319;
                            continue;
                        }
                        if (var461 == 4106) {
                            var5--;
                            int var321 = field805[var5];
                            field817[var6++] = Integer.toString(var321);
                            continue;
                        }
                        if (var461 == 4107) {
                            var6 -= 2;
                            field805[var5++] = class164.method663(class167.method100(field817[var6], field817[var6 + 1], client.field303));
                            continue;
                        }
                        if (var461 == 4108) {
                            var6--;
                            String var322 = field817[var6];
                            var5 -= 2;
                            int var323 = field805[var5];
                            int var324 = field805[var5 + 1];
                            byte[] var325 = Statics.field1650.method3127(var324, 0);
                            class225 var326 = new class225(var325);
                            field805[var5++] = var326.method3784(var322, var323);
                            continue;
                        }
                        if (var461 == 4109) {
                            var6--;
                            String var327 = field817[var6];
                            var5 -= 2;
                            int var328 = field805[var5];
                            int var329 = field805[var5 + 1];
                            byte[] var330 = Statics.field1650.method3127(var329, 0);
                            class225 var331 = new class225(var330);
                            field805[var5++] = var331.method3783(var327, var328);
                            continue;
                        }
                        if (var461 == 4110) {
                            var6 -= 2;
                            String var332 = field817[var6];
                            String var333 = field817[var6 + 1];
                            var5--;
                            if (field805[var5] == 1) {
                                field817[var6++] = var332;
                            } else {
                                field817[var6++] = var333;
                            }
                            continue;
                        }
                        if (var461 == 4111) {
                            var6--;
                            String var334 = field817[var6];
                            field817[var6++] = class224.method3852(var334);
                            continue;
                        }
                        if (var461 == 4112) {
                            var6--;
                            String var335 = field817[var6];
                            var5--;
                            int var336 = field805[var5];
                            field817[var6++] = var335 + (char) var336;
                            continue;
                        }
                        if (var461 == 4113) {
                            var5--;
                            int var337 = field805[var5];
                            field805[var5++] = class164.method1183((char) var337) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4114) {
                            var5--;
                            int var338 = field805[var5];
                            field805[var5++] = class164.method2161((char) var338) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4115) {
                            var5--;
                            int var339 = field805[var5];
                            int[] var340 = field805;
                            int var341 = var5++;
                            char var342 = (char) var339;
                            boolean var343 = var342 >= 'A' && var342 <= 'Z' || var342 >= 'a' && var342 <= 'z';
                            var340[var341] = var343 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4116) {
                            var5--;
                            int var344 = field805[var5];
                            field805[var5++] = class164.method172((char) var344) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4117) {
                            var6--;
                            String var345 = field817[var6];
                            if (var345 == null) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = var345.length();
                            }
                            continue;
                        }
                        if (var461 == 4118) {
                            var6--;
                            String var346 = field817[var6];
                            var5 -= 2;
                            int var347 = field805[var5];
                            int var348 = field805[var5 + 1];
                            field817[var6++] = var346.substring(var347, var348);
                            continue;
                        }
                        if (var461 == 4119) {
                            var6--;
                            String var349 = field817[var6];
                            StringBuilder var350 = new StringBuilder(var349.length());
                            boolean var351 = false;
                            for (int var352 = 0; var352 < var349.length(); var352++) {
                                char var353 = var349.charAt(var352);
                                if (var353 == '<') {
                                    var351 = true;
                                } else if (var353 == '>') {
                                    var351 = false;
                                } else if (!var351) {
                                    var350.append(var353);
                                }
                            }
                            field817[var6++] = var350.toString();
                            continue;
                        }
                        if (var461 == 4120) {
                            var6--;
                            String var354 = field817[var6];
                            var5--;
                            int var355 = field805[var5];
                            field805[var5++] = var354.indexOf(var355);
                            continue;
                        }
                        if (var461 == 4121) {
                            var6 -= 2;
                            String var356 = field817[var6];
                            String var357 = field817[var6 + 1];
                            var5--;
                            int var358 = field805[var5];
                            field805[var5++] = var356.indexOf(var357, var358);
                            continue;
                        }
                    } else if (var461 < 4300) {
                        if (var461 == 4200) {
                            var5--;
                            int var359 = field805[var5];
                            field817[var6++] = class52.method1036(var359).field1123;
                            continue;
                        }
                        if (var461 == 4201) {
                            var5 -= 2;
                            int var360 = field805[var5];
                            int var361 = field805[var5 + 1];
                            class52 var362 = class52.method1036(var360);
                            if (var361 >= 1 && var361 <= 5 && var362.field1137[var361 - 1] != null) {
                                field817[var6++] = var362.field1137[var361 - 1];
                                continue;
                            }
                            field817[var6++] = "";
                            continue;
                        }
                        if (var461 == 4202) {
                            var5 -= 2;
                            int var363 = field805[var5];
                            int var364 = field805[var5 + 1];
                            class52 var365 = class52.method1036(var363);
                            if (var364 >= 1 && var364 <= 5 && var365.field1113[var364 - 1] != null) {
                                field817[var6++] = var365.field1113[var364 - 1];
                                continue;
                            }
                            field817[var6++] = "";
                            continue;
                        }
                        if (var461 == 4203) {
                            var5--;
                            int var366 = field805[var5];
                            field805[var5++] = class52.method1036(var366).field1163;
                            continue;
                        }
                        if (var461 == 4204) {
                            var5--;
                            int var367 = field805[var5];
                            field805[var5++] = class52.method1036(var367).field1134 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4205) {
                            var5--;
                            int var368 = field805[var5];
                            class52 var369 = class52.method1036(var368);
                            if (var369.field1154 == -1 && var369.field1151 >= 0) {
                                field805[var5++] = var369.field1151;
                                continue;
                            }
                            field805[var5++] = var368;
                            continue;
                        }
                        if (var461 == 4206) {
                            var5--;
                            int var370 = field805[var5];
                            class52 var371 = class52.method1036(var370);
                            if (var371.field1154 >= 0 && var371.field1151 >= 0) {
                                field805[var5++] = var371.field1151;
                                continue;
                            }
                            field805[var5++] = var370;
                            continue;
                        }
                        if (var461 == 4207) {
                            var5--;
                            int var372 = field805[var5];
                            field805[var5++] = class52.method1036(var372).field1136 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4210) {
                            var6--;
                            String var373 = field817[var6];
                            var5--;
                            int var374 = field805[var5];
                            boolean var376 = var374 == 1;
                            String var377 = var373.toLowerCase();
                            short[] var378 = new short[16];
                            int var379 = 0;
                            int var380 = 0;
                            while (true) {
                                if (var380 >= Statics.field1117) {
                                    Statics.field2324 = var378;
                                    Statics.field2296 = 0;
                                    Statics.field2075 = var379;
                                    String[] var384 = new String[Statics.field2075];
                                    for (int var385 = 0; var385 < Statics.field2075; var385++) {
                                        var384[var385] = class52.method1036(var378[var385]).field1123;
                                    }
                                    short[] var386 = Statics.field2324;
                                    class125.method2306(var384, var386, 0, var384.length - 1);
                                    break;
                                }
                                class52 var381 = class52.method1036(var380);
                                if ((!var376 || var381.field1161) && var381.field1154 == -1 && var381.field1123.toLowerCase().indexOf(var377) != -1) {
                                    if (var379 >= 250) {
                                        Statics.field2075 = -1;
                                        Statics.field2324 = null;
                                        break;
                                    }
                                    if (var379 >= var378.length) {
                                        short[] var382 = new short[var378.length * 2];
                                        for (int var383 = 0; var383 < var379; var383++) {
                                            var382[var383] = var378[var383];
                                        }
                                        var378 = var382;
                                    }
                                    var378[var379++] = (short) var380;
                                }
                                var380++;
                            }
                            field805[var5++] = Statics.field2075;
                            continue;
                        }
                        if (var461 == 4211) {
                            if (Statics.field2324 != null && Statics.field2296 < Statics.field2075) {
                                field805[var5++] = Statics.field2324[++Statics.field2296 - 1] & 0xFFFF;
                                continue;
                            }
                            field805[var5++] = -1;
                            continue;
                        }
                        if (var461 == 4212) {
                            Statics.field2296 = 0;
                            continue;
                        }
                    } else if (var461 < 5100) {
                        if (var461 == 5000) {
                            field805[var5++] = client.field513;
                            continue;
                        }
                        if (var461 == 5001) {
                            var5 -= 3;
                            client.field513 = field805[var5];
                            int var387 = field805[var5 + 1];
                            class131[] var388 = class131.method109();
                            int var389 = 0;
                            class131 var391;
                            while (true) {
                                if (var389 >= var388.length) {
                                    var391 = null;
                                    break;
                                }
                                class131 var390 = var388[var389];
                                if (var390.field2068 == var387) {
                                    var391 = var390;
                                    break;
                                }
                                var389++;
                            }
                            Statics.field1786 = var391;
                            if (Statics.field1786 == null) {
                                Statics.field1786 = class131.field2067;
                            }
                            client.field514 = field805[var5 + 2];
                            client.field319.method2614(197);
                            client.field319.method2430(client.field513);
                            client.field319.method2430(Statics.field1786.field2068);
                            client.field319.method2430(client.field514);
                            continue;
                        }
                        if (var461 == 5002) {
                            var6--;
                            String var392 = field817[var6];
                            var5 -= 2;
                            int var393 = field805[var5];
                            int var394 = field805[var5 + 1];
                            client.field319.method2614(94);
                            client.field319.method2430(class120.method973(var392) + 2);
                            client.field319.method2518(var392);
                            client.field319.method2430(var393 - 1);
                            client.field319.method2430(var394);
                            continue;
                        }
                        if (var461 == 5003) {
                            var5 -= 2;
                            int var395 = field805[var5];
                            int var396 = field805[var5 + 1];
                            class36 var397 = class12.method642(var395, var396);
                            if (var397 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = 0;
                                field817[var6++] = "";
                                field817[var6++] = "";
                                field817[var6++] = "";
                            } else {
                                field805[var5++] = var397.field795;
                                field805[var5++] = var397.field790;
                                field817[var6++] = var397.field797 == null ? "" : var397.field797;
                                field817[var6++] = var397.field794 == null ? "" : var397.field794;
                                field817[var6++] = var397.field793 == null ? "" : var397.field793;
                            }
                            continue;
                        }
                        if (var461 == 5004) {
                            var5--;
                            int var398 = field805[var5];
                            class36 var399 = class12.method3228(var398);
                            if (var399 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = 0;
                                field817[var6++] = "";
                                field817[var6++] = "";
                                field817[var6++] = "";
                            } else {
                                field805[var5++] = var399.field792;
                                field805[var5++] = var399.field790;
                                field817[var6++] = var399.field797 == null ? "" : var399.field797;
                                field817[var6++] = var399.field794 == null ? "" : var399.field794;
                                field817[var6++] = var399.field793 == null ? "" : var399.field793;
                            }
                            continue;
                        }
                        if (var461 == 5005) {
                            if (Statics.field1786 == null) {
                                field805[var5++] = -1;
                            } else {
                                field805[var5++] = Statics.field1786.field2068;
                            }
                            continue;
                        }
                        if (var461 == 5008) {
                            var6--;
                            String var400 = field817[var6];
                            var5--;
                            int var401 = field805[var5];
                            String var402 = var400.toLowerCase();
                            byte var403 = 0;
                            if (var402.startsWith(class158.field2509)) {
                                var403 = 0;
                                var400 = var400.substring(class158.field2509.length());
                            } else if (var402.startsWith(class158.field2511)) {
                                var403 = 1;
                                var400 = var400.substring(class158.field2511.length());
                            } else if (var402.startsWith(class158.field2527)) {
                                var403 = 2;
                                var400 = var400.substring(class158.field2527.length());
                            } else if (var402.startsWith(class158.field2416)) {
                                var403 = 3;
                                var400 = var400.substring(class158.field2416.length());
                            } else if (var402.startsWith(class158.field2517)) {
                                var403 = 4;
                                var400 = var400.substring(class158.field2517.length());
                            } else if (var402.startsWith(class158.field2470)) {
                                var403 = 5;
                                var400 = var400.substring(class158.field2470.length());
                            } else if (var402.startsWith(class158.field2521)) {
                                var403 = 6;
                                var400 = var400.substring(class158.field2521.length());
                            } else if (var402.startsWith(class158.field2523)) {
                                var403 = 7;
                                var400 = var400.substring(class158.field2523.length());
                            } else if (var402.startsWith(class158.field2525)) {
                                var403 = 8;
                                var400 = var400.substring(class158.field2525.length());
                            } else if (var402.startsWith(class158.field2439)) {
                                var403 = 9;
                                var400 = var400.substring(class158.field2439.length());
                            } else if (var402.startsWith(class158.field2529)) {
                                var403 = 10;
                                var400 = var400.substring(class158.field2529.length());
                            } else if (var402.startsWith(class158.field2531)) {
                                var403 = 11;
                                var400 = var400.substring(class158.field2531.length());
                            } else if (client.field303 != 0) {
                                if (var402.startsWith(class158.field2510)) {
                                    var403 = 0;
                                    var400 = var400.substring(class158.field2510.length());
                                } else if (var402.startsWith(class158.field2374)) {
                                    var403 = 1;
                                    var400 = var400.substring(class158.field2374.length());
                                } else if (var402.startsWith(class158.field2514)) {
                                    var403 = 2;
                                    var400 = var400.substring(class158.field2514.length());
                                } else if (var402.startsWith(class158.field2516)) {
                                    var403 = 3;
                                    var400 = var400.substring(class158.field2516.length());
                                } else if (var402.startsWith(class158.field2518)) {
                                    var403 = 4;
                                    var400 = var400.substring(class158.field2518.length());
                                } else if (var402.startsWith(class158.field2520)) {
                                    var403 = 5;
                                    var400 = var400.substring(class158.field2520.length());
                                } else if (var402.startsWith(class158.field2534)) {
                                    var403 = 6;
                                    var400 = var400.substring(class158.field2534.length());
                                } else if (var402.startsWith(class158.field2368)) {
                                    var403 = 7;
                                    var400 = var400.substring(class158.field2368.length());
                                } else if (var402.startsWith(class158.field2526)) {
                                    var403 = 8;
                                    var400 = var400.substring(class158.field2526.length());
                                } else if (var402.startsWith(class158.field2528)) {
                                    var403 = 9;
                                    var400 = var400.substring(class158.field2528.length());
                                } else if (var402.startsWith(class158.field2591)) {
                                    var403 = 10;
                                    var400 = var400.substring(class158.field2591.length());
                                } else if (var402.startsWith(class158.field2532)) {
                                    var403 = 11;
                                    var400 = var400.substring(class158.field2532.length());
                                }
                            }
                            String var404 = var400.toLowerCase();
                            byte var405 = 0;
                            if (var404.startsWith(class158.field2515)) {
                                var405 = 1;
                                var400 = var400.substring(class158.field2515.length());
                            } else if (var404.startsWith(class158.field2492)) {
                                var405 = 2;
                                var400 = var400.substring(class158.field2492.length());
                            } else if (var404.startsWith(class158.field2398)) {
                                var405 = 3;
                                var400 = var400.substring(class158.field2398.length());
                            } else if (var404.startsWith(class158.field2539)) {
                                var405 = 4;
                                var400 = var400.substring(class158.field2539.length());
                            } else if (var404.startsWith(class158.field2541)) {
                                var405 = 5;
                                var400 = var400.substring(class158.field2541.length());
                            } else if (client.field303 != 0) {
                                if (var404.startsWith(class158.field2380)) {
                                    var405 = 1;
                                    var400 = var400.substring(class158.field2380.length());
                                } else if (var404.startsWith(class158.field2536)) {
                                    var405 = 2;
                                    var400 = var400.substring(class158.field2536.length());
                                } else if (var404.startsWith(class158.field2494)) {
                                    var405 = 3;
                                    var400 = var400.substring(class158.field2494.length());
                                } else if (var404.startsWith(class158.field2478)) {
                                    var405 = 4;
                                    var400 = var400.substring(class158.field2478.length());
                                } else if (var404.startsWith(class158.field2538)) {
                                    var405 = 5;
                                    var400 = var400.substring(class158.field2538.length());
                                }
                            }
                            client.field319.method2614(26);
                            client.field319.method2430(0);
                            int var406 = client.field319.field2012;
                            client.field319.method2430(var401);
                            client.field319.method2430(var403);
                            client.field319.method2430(var405);
                            class123 var407 = client.field319;
                            int var408 = var407.field2012;
                            int var409 = var400.length();
                            byte[] var410 = new byte[var409];
                            for (int var411 = 0; var411 < var409; var411++) {
                                char var412 = var400.charAt(var411);
                                if (!(var412 <= 0 || var412 >= 128) || !(var412 < 160 || var412 > 255)) {
                                    var410[var411] = (byte) var412;
                                } else if (var412 == 8364) {
                                    var410[var411] = -128;
                                } else if (var412 == 8218) {
                                    var410[var411] = -126;
                                } else if (var412 == 402) {
                                    var410[var411] = -125;
                                } else if (var412 == 8222) {
                                    var410[var411] = -124;
                                } else if (var412 == 8230) {
                                    var410[var411] = -123;
                                } else if (var412 == 8224) {
                                    var410[var411] = -122;
                                } else if (var412 == 8225) {
                                    var410[var411] = -121;
                                } else if (var412 == 710) {
                                    var410[var411] = -120;
                                } else if (var412 == 8240) {
                                    var410[var411] = -119;
                                } else if (var412 == 352) {
                                    var410[var411] = -118;
                                } else if (var412 == 8249) {
                                    var410[var411] = -117;
                                } else if (var412 == 338) {
                                    var410[var411] = -116;
                                } else if (var412 == 381) {
                                    var410[var411] = -114;
                                } else if (var412 == 8216) {
                                    var410[var411] = -111;
                                } else if (var412 == 8217) {
                                    var410[var411] = -110;
                                } else if (var412 == 8220) {
                                    var410[var411] = -109;
                                } else if (var412 == 8221) {
                                    var410[var411] = -108;
                                } else if (var412 == 8226) {
                                    var410[var411] = -107;
                                } else if (var412 == 8211) {
                                    var410[var411] = -106;
                                } else if (var412 == 8212) {
                                    var410[var411] = -105;
                                } else if (var412 == 732) {
                                    var410[var411] = -104;
                                } else if (var412 == 8482) {
                                    var410[var411] = -103;
                                } else if (var412 == 353) {
                                    var410[var411] = -102;
                                } else if (var412 == 8250) {
                                    var410[var411] = -101;
                                } else if (var412 == 339) {
                                    var410[var411] = -100;
                                } else if (var412 == 382) {
                                    var410[var411] = -98;
                                } else if (var412 == 376) {
                                    var410[var411] = -97;
                                } else {
                                    var410[var411] = 63;
                                }
                            }
                            var407.method2361(var410.length);
                            var407.field2012 += Statics.field3186.method2303(var410, 0, var410.length, var407.field2013, var407.field2012);
                            client.field319.method2492(client.field319.field2012 - var406);
                            continue;
                        }
                        if (var461 == 5009) {
                            var6 -= 2;
                            String var415 = field817[var6];
                            String var416 = field817[var6 + 1];
                            client.field319.method2614(39);
                            client.field319.method2349(0);
                            int var417 = client.field319.field2012;
                            client.field319.method2518(var415);
                            class123 var418 = client.field319;
                            int var419 = var418.field2012;
                            int var420 = var416.length();
                            byte[] var421 = new byte[var420];
                            for (int var422 = 0; var422 < var420; var422++) {
                                char var423 = var416.charAt(var422);
                                if (!(var423 <= 0 || var423 >= 128) || !(var423 < 160 || var423 > 255)) {
                                    var421[var422] = (byte) var423;
                                } else if (var423 == 8364) {
                                    var421[var422] = -128;
                                } else if (var423 == 8218) {
                                    var421[var422] = -126;
                                } else if (var423 == 402) {
                                    var421[var422] = -125;
                                } else if (var423 == 8222) {
                                    var421[var422] = -124;
                                } else if (var423 == 8230) {
                                    var421[var422] = -123;
                                } else if (var423 == 8224) {
                                    var421[var422] = -122;
                                } else if (var423 == 8225) {
                                    var421[var422] = -121;
                                } else if (var423 == 710) {
                                    var421[var422] = -120;
                                } else if (var423 == 8240) {
                                    var421[var422] = -119;
                                } else if (var423 == 352) {
                                    var421[var422] = -118;
                                } else if (var423 == 8249) {
                                    var421[var422] = -117;
                                } else if (var423 == 338) {
                                    var421[var422] = -116;
                                } else if (var423 == 381) {
                                    var421[var422] = -114;
                                } else if (var423 == 8216) {
                                    var421[var422] = -111;
                                } else if (var423 == 8217) {
                                    var421[var422] = -110;
                                } else if (var423 == 8220) {
                                    var421[var422] = -109;
                                } else if (var423 == 8221) {
                                    var421[var422] = -108;
                                } else if (var423 == 8226) {
                                    var421[var422] = -107;
                                } else if (var423 == 8211) {
                                    var421[var422] = -106;
                                } else if (var423 == 8212) {
                                    var421[var422] = -105;
                                } else if (var423 == 732) {
                                    var421[var422] = -104;
                                } else if (var423 == 8482) {
                                    var421[var422] = -103;
                                } else if (var423 == 353) {
                                    var421[var422] = -102;
                                } else if (var423 == 8250) {
                                    var421[var422] = -101;
                                } else if (var423 == 339) {
                                    var421[var422] = -100;
                                } else if (var423 == 382) {
                                    var421[var422] = -98;
                                } else if (var423 == 376) {
                                    var421[var422] = -97;
                                } else {
                                    var421[var422] = 63;
                                }
                            }
                            var418.method2361(var421.length);
                            var418.field2012 += Statics.field3186.method2303(var421, 0, var421.length, var418.field2013, var418.field2012);
                            client.field319.method2446(client.field319.field2012 - var417);
                            continue;
                        }
                        if (var461 == 5015) {
                            String var426;
                            if (Statics.field2693 == null || Statics.field2693.field60 == null) {
                                var426 = "";
                            } else {
                                var426 = Statics.field2693.field60;
                            }
                            field817[var6++] = var426;
                            continue;
                        }
                        if (var461 == 5016) {
                            field805[var5++] = client.field514;
                            continue;
                        }
                        if (var461 == 5017) {
                            var5--;
                            int var427 = field805[var5];
                            int[] var428 = field805;
                            int var429 = var5++;
                            class28 var430 = (class28) class12.field189.get(var427);
                            int var431;
                            if (var430 == null) {
                                var431 = 0;
                            } else {
                                var431 = var430.method647();
                            }
                            var428[var429] = var431;
                            continue;
                        }
                        if (var461 == 5018) {
                            var5--;
                            int var432 = field805[var5];
                            int[] var433 = field805;
                            int var434 = var5++;
                            class36 var435 = (class36) class12.field187.method3572((long) var432);
                            int var436;
                            if (var435 == null) {
                                var436 = -1;
                            } else if (class12.field186.field3110 == var435.field3115) {
                                var436 = -1;
                            } else {
                                var436 = ((class36) var435.field3115).field795;
                            }
                            var433[var434] = var436;
                            continue;
                        }
                        if (var461 == 5019) {
                            var5--;
                            int var437 = field805[var5];
                            field805[var5++] = class12.method2697(var437);
                            continue;
                        }
                        if (var461 == 5020) {
                            var6--;
                            String var438 = field817[var6];
                            if (var438.equalsIgnoreCase("toggleroof")) {
                                Statics.field990.field165 = !Statics.field990.field165;
                                class9.method151();
                                if (Statics.field990.field165) {
                                    class12.method2156(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method2156(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var438.equalsIgnoreCase("displayfps")) {
                                client.field312 = !client.field312;
                            }
                            if (client.field462 >= 2) {
                                if (var438.equalsIgnoreCase("fpson")) {
                                    client.field312 = true;
                                }
                                if (var438.equalsIgnoreCase("fpsoff")) {
                                    client.field312 = false;
                                }
                                if (var438.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var438.equalsIgnoreCase("clientdrop")) {
                                    client.method45();
                                }
                                if (var438.equalsIgnoreCase("errortest") && client.field300 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field319.method2614(229);
                            client.field319.method2430(var438.length() + 1);
                            client.field319.method2518(var438);
                            continue;
                        }
                        if (var461 == 5021) {
                            var6--;
                            client.field515 = field817[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var461 == 5022) {
                            field817[var6++] = client.field515;
                            continue;
                        }
                    }
                }
                if (var461 < 5400) {
                    if (var461 == 5306) {
                        field805[var5++] = client.method960();
                        continue;
                    }
                    if (var461 == 5307) {
                        var5--;
                        int var439 = field805[var5];
                        if (var439 == 1 || var439 == 2) {
                            client.method168(var439);
                        }
                        continue;
                    }
                    if (var461 == 5308) {
                        field805[var5++] = Statics.field990.field156;
                        continue;
                    }
                    if (var461 == 5309) {
                        var5--;
                        int var440 = field805[var5];
                        if (var440 == 1 || var440 == 2) {
                            Statics.field990.field156 = var440;
                            class9.method151();
                        }
                        continue;
                    }
                }
                if (var461 < 5600) {
                    if (var461 == 5504) {
                        var5 -= 2;
                        int var441 = field805[var5];
                        int var442 = field805[var5 + 1];
                        if (!client.field543) {
                            client.field379 = var441;
                            client.field389 = var442;
                        }
                        continue;
                    }
                    if (var461 == 5505) {
                        field805[var5++] = client.field379;
                        continue;
                    }
                    if (var461 == 5506) {
                        field805[var5++] = client.field389;
                        continue;
                    }
                    if (var461 == 5530) {
                        var5--;
                        int var443 = field805[var5];
                        if (var443 < 0) {
                            var443 = 0;
                        }
                        client.field385 = var443;
                        continue;
                    }
                    if (var461 == 5531) {
                        field805[var5++] = client.field385;
                        continue;
                    }
                }
                if (var461 >= 5700 || var461 != 5630) {
                    if (var461 < 6300) {
                        if (var461 == 6200) {
                            var5 -= 2;
                            client.field397 = (short) field805[var5];
                            if (client.field397 <= 0) {
                                client.field397 = 256;
                            }
                            client.field550 = (short) field805[var5 + 1];
                            if (client.field550 <= 0) {
                                client.field550 = 205;
                            }
                            continue;
                        }
                        if (var461 == 6201) {
                            var5 -= 2;
                            client.field565 = (short) field805[var5];
                            if (client.field565 <= 0) {
                                client.field565 = 256;
                            }
                            client.field552 = (short) field805[var5 + 1];
                            if (client.field552 <= 0) {
                                client.field552 = 320;
                            }
                            continue;
                        }
                        if (var461 == 6202) {
                            var5 -= 4;
                            client.field384 = (short) field805[var5];
                            if (client.field384 <= 0) {
                                client.field384 = 1;
                            }
                            client.field554 = (short) field805[var5 + 1];
                            if (client.field554 <= 0) {
                                client.field554 = 32767;
                            } else if (client.field554 < client.field384) {
                                client.field554 = client.field384;
                            }
                            client.field528 = (short) field805[var5 + 2];
                            if (client.field528 <= 0) {
                                client.field528 = 1;
                            }
                            client.field556 = (short) field805[var5 + 3];
                            if (client.field556 <= 0) {
                                client.field556 = 32767;
                            } else if (client.field556 < client.field528) {
                                client.field556 = client.field528;
                            }
                            continue;
                        }
                        if (var461 == 6203) {
                            if (client.field467 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = -1;
                            } else {
                                client.method795(0, 0, client.field467.field2768, client.field467.field2784, false);
                                field805[var5++] = client.field307;
                                field805[var5++] = client.field560;
                            }
                            continue;
                        }
                        if (var461 == 6204) {
                            field805[var5++] = client.field565;
                            field805[var5++] = client.field552;
                            continue;
                        }
                        if (var461 == 6205) {
                            field805[var5++] = client.field397;
                            field805[var5++] = client.field550;
                            continue;
                        }
                    }
                    if (var461 < 6600) {
                        if (var461 == 6500) {
                            field805[var5++] = Statics.method128() ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6501) {
                            class26.field644 = 0;
                            class26 var444 = class26.method48();
                            if (var444 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = 0;
                                field817[var6++] = "";
                                field805[var5++] = 0;
                                field805[var5++] = 0;
                                field817[var6++] = "";
                            } else {
                                field805[var5++] = var444.field651;
                                field805[var5++] = var444.field648;
                                field817[var6++] = var444.field640;
                                field805[var5++] = var444.field649;
                                field805[var5++] = var444.field639;
                                field817[var6++] = var444.field650;
                            }
                            continue;
                        }
                        if (var461 == 6502) {
                            class26 var446 = class26.method48();
                            if (var446 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = 0;
                                field817[var6++] = "";
                                field805[var5++] = 0;
                                field805[var5++] = 0;
                                field817[var6++] = "";
                            } else {
                                field805[var5++] = var446.field651;
                                field805[var5++] = var446.field648;
                                field817[var6++] = var446.field640;
                                field805[var5++] = var446.field649;
                                field805[var5++] = var446.field639;
                                field817[var6++] = var446.field650;
                            }
                            continue;
                        }
                        if (var461 == 6506) {
                            var5--;
                            int var447 = field805[var5];
                            class26 var448 = null;
                            for (int var449 = 0; var449 < class26.field643; var449++) {
                                if (Statics.field3063[var449].field651 == var447) {
                                    var448 = Statics.field3063[var449];
                                    break;
                                }
                            }
                            if (var448 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = 0;
                                field817[var6++] = "";
                                field805[var5++] = 0;
                                field805[var5++] = 0;
                                field817[var6++] = "";
                            } else {
                                field805[var5++] = var448.field651;
                                field805[var5++] = var448.field648;
                                field817[var6++] = var448.field640;
                                field805[var5++] = var448.field649;
                                field805[var5++] = var448.field639;
                                field817[var6++] = var448.field650;
                            }
                            continue;
                        }
                        if (var461 == 6507) {
                            var5 -= 4;
                            int var450 = field805[var5];
                            boolean var451 = field805[var5 + 1] == 1;
                            int var452 = field805[var5 + 2];
                            boolean var453 = field805[var5 + 3] == 1;
                            if (Statics.field3063 != null) {
                                class26.method43(0, Statics.field3063.length - 1, var450, var451, var452, var453);
                            }
                            continue;
                        }
                        if (var461 == 6511) {
                            var5--;
                            int var454 = field805[var5];
                            if (var454 >= 0 && var454 < class26.field643) {
                                class26 var455 = Statics.field3063[var454];
                                field805[var5++] = var455.field651;
                                field805[var5++] = var455.field648;
                                field817[var6++] = var455.field640;
                                field805[var5++] = var455.field649;
                                field805[var5++] = var455.field639;
                                field817[var6++] = var455.field650;
                                continue;
                            }
                            field805[var5++] = -1;
                            field805[var5++] = 0;
                            field817[var6++] = "";
                            field805[var5++] = 0;
                            field805[var5++] = 0;
                            field817[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field347 = 250;
            }
        } catch (Exception var460) {
            StringBuilder var457 = new StringBuilder(30);
            var457.append("").append(var4.field3124).append(" ");
            for (int var458 = field813 - 1; var458 >= 0; var458--) {
                var457.append("").append(field809[var458].field227.field3124).append(" ");
            }
            var457.append("").append(var10);
            class149.method1(var457.toString(), var460);
        }
    }

    @ObfuscatedName("aq.t(II)V")
    public static void method1002(int arg0) {
        if (arg0 == -1 || !class174.method798(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2831[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3.field2854 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field8 = var3.field2854;
                method158(var4, 2000000);
            }
        }
    }
}
