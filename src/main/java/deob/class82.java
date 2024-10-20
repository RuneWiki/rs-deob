package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("v")
public class class82 {

    @ObfuscatedName("v.f")
    public static int field942 = 0;

    @ObfuscatedName("v.g")
    public static Calendar field949 = Calendar.getInstance();

    @ObfuscatedName("v.d")
    public static int[] field944 = new int[1000];

    @ObfuscatedName("v.o")
    public static final String[] field950 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("v.l")
    public static String[] field945 = new String[1000];

    @ObfuscatedName("v.w")
    public static int[] field955 = new int[5];

    @ObfuscatedName("v.t")
    public static int[][] field943 = new int[5][5000];

    @ObfuscatedName("v.s")
    public static class90[] field947 = new class90[50];

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.b(Lb;I)V")
    public static void method1110(class61 arg0) {
        Object[] var1 = arg0.field664;
        int var2 = (Integer) var1[0];
        class86 var3 = class86.method1413(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field1212;
        int[] var8 = var3.field1213;
        byte var9 = -1;
        field942 = 0;
        try {
            Statics.field953 = new int[var3.field1215];
            int var10 = 0;
            Statics.field941 = new String[var3.field1217];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field663;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field665;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field662 == null ? -1 : arg0.field662.field128;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field661;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field662 == null ? -1 : arg0.field662.field80;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field671 == null ? -1 : arg0.field671.field128;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field671 == null ? -1 : arg0.field671.field80;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field667;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field668;
                    }
                    Statics.field953[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field669;
                    }
                    Statics.field941[var11++] = var14;
                }
            }
            int var15 = 0;
            label2618: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var396 = var7[var6];
                if (var396 < 100) {
                    if (var396 == 0) {
                        field944[var4++] = var8[var6];
                        continue;
                    }
                    if (var396 == 1) {
                        int var16 = var8[var6];
                        field944[var4++] = class71.field800[var16];
                        continue;
                    }
                    if (var396 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class71.field800[var17] = field944[var4];
                        client.method1148(var17);
                        continue;
                    }
                    if (var396 == 3) {
                        field945[var5++] = var3.field1214[var6];
                        continue;
                    }
                    if (var396 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var396 == 7) {
                        var4 -= 2;
                        if (field944[var4 + 1] != field944[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 8) {
                        var4 -= 2;
                        if (field944[var4 + 1] == field944[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 9) {
                        var4 -= 2;
                        if (field944[var4] < field944[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 10) {
                        var4 -= 2;
                        if (field944[var4] > field944[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 21) {
                        if (field942 == 0) {
                            return;
                        }
                        class90 var18 = field947[--field942];
                        var3 = var18.field1282;
                        var7 = var3.field1212;
                        var8 = var3.field1213;
                        var6 = var18.field1276;
                        Statics.field953 = var18.field1280;
                        Statics.field941 = var18.field1278;
                        continue;
                    }
                    if (var396 == 25) {
                        int var19 = var8[var6];
                        field944[var4++] = class71.method2005(var19);
                        continue;
                    }
                    if (var396 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class71.method166(var20, field944[var4]);
                        continue;
                    }
                    if (var396 == 31) {
                        var4 -= 2;
                        if (field944[var4] <= field944[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 32) {
                        var4 -= 2;
                        if (field944[var4] >= field944[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 33) {
                        field944[var4++] = Statics.field953[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var396 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field953[var10001] = field944[var4];
                        continue;
                    }
                    if (var396 == 35) {
                        field945[var5++] = Statics.field941[var8[var6]];
                        continue;
                    }
                    if (var396 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field941[var10001] = field945[var5];
                        continue;
                    }
                    if (var396 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String[] var22 = field945;
                        String var23;
                        if (var21 == 0) {
                            var23 = "";
                        } else if (var21 == 1) {
                            String var24 = var22[var5];
                            if (var24 == null) {
                                var23 = "null";
                            } else {
                                var23 = var24.toString();
                            }
                        } else {
                            int var25 = var5 + var21;
                            int var26 = 0;
                            for (int var27 = var5; var27 < var25; var27++) {
                                String var28 = var22[var27];
                                if (var28 == null) {
                                    var26 += 4;
                                } else {
                                    var26 += var28.length();
                                }
                            }
                            StringBuilder var29 = new StringBuilder(var26);
                            for (int var30 = var5; var30 < var25; var30++) {
                                String var31 = var22[var30];
                                if (var31 == null) {
                                    var29.append("null");
                                } else {
                                    var29.append(var31);
                                }
                            }
                            var23 = var29.toString();
                        }
                        field945[var5++] = var23;
                        continue;
                    }
                    if (var396 == 38) {
                        var4--;
                        continue;
                    }
                    if (var396 == 39) {
                        var5--;
                        continue;
                    }
                    if (var396 == 40) {
                        int var33 = var8[var6];
                        class86 var34 = class86.method1413(var33);
                        int[] var35 = new int[var34.field1215];
                        String[] var36 = new String[var34.field1217];
                        for (int var37 = 0; var37 < var34.field1218; var37++) {
                            var35[var37] = field944[var4 - var34.field1218 + var37];
                        }
                        for (int var38 = 0; var38 < var34.field1216; var38++) {
                            var36[var38] = field945[var5 - var34.field1216 + var38];
                        }
                        var4 -= var34.field1218;
                        var5 -= var34.field1216;
                        class90 var39 = new class90();
                        var39.field1282 = var3;
                        var39.field1276 = var6;
                        var39.field1280 = Statics.field953;
                        var39.field1278 = Statics.field941;
                        field947[++field942 - 1] = var39;
                        var3 = var34;
                        var7 = var34.field1212;
                        var8 = var34.field1213;
                        var6 = -1;
                        Statics.field953 = var35;
                        Statics.field941 = var36;
                        continue;
                    }
                    if (var396 == 42) {
                        field944[var4++] = client.field1689[var8[var6]];
                        continue;
                    }
                    if (var396 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field1689[var10001] = field944[var4];
                        continue;
                    }
                    if (var396 == 44) {
                        int var40 = var8[var6] >> 16;
                        int var41 = var8[var6] & 0xFFFF;
                        var4--;
                        int var42 = field944[var4];
                        if (var42 >= 0 && var42 <= 5000) {
                            field955[var40] = var42;
                            byte var43 = -1;
                            if (var41 == 105) {
                                var43 = 0;
                            }
                            int var44 = 0;
                            while (true) {
                                if (var44 >= var42) {
                                    continue label2618;
                                }
                                field943[var40][var44] = var43;
                                var44++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var396 == 45) {
                        int var45 = var8[var6];
                        var4--;
                        int var46 = field944[var4];
                        if (var46 >= 0 && var46 < field955[var45]) {
                            field944[var4++] = field943[var45][var46];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var396 == 46) {
                        int var47 = var8[var6];
                        var4 -= 2;
                        int var48 = field944[var4];
                        if (var48 >= 0 && var48 < field955[var47]) {
                            field943[var47][var48] = field944[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var396 == 47) {
                        String var49 = client.field1780[var8[var6]];
                        if (var49 == null) {
                            var49 = "null";
                        }
                        field945[var5++] = var49;
                        continue;
                    }
                    if (var396 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field1780[var10001] = field945[var5];
                        continue;
                    }
                }
                boolean var50;
                if (var8[var6] == 1) {
                    var50 = true;
                } else {
                    var50 = false;
                }
                if (var396 < 1000) {
                    if (var396 == 100) {
                        var4 -= 3;
                        int var51 = field944[var4];
                        int var52 = field944[var4 + 1];
                        int var53 = field944[var4 + 2];
                        if (var52 == 0) {
                            throw new RuntimeException();
                        }
                        class12 var54 = class12.method2369(var51);
                        if (var54.field187 == null) {
                            var54.field187 = new class12[var53 + 1];
                        }
                        if (var54.field187.length <= var53) {
                            class12[] var55 = new class12[var53 + 1];
                            for (int var56 = 0; var56 < var54.field187.length; var56++) {
                                var55[var56] = var54.field187[var56];
                            }
                            var54.field187 = var55;
                        }
                        if (var53 > 0 && var54.field187[var53 - 1] == null) {
                            throw new RuntimeException("" + (var53 - 1));
                        }
                        class12 var57 = new class12();
                        var57.field81 = var52;
                        var57.field90 = var57.field128 = var54.field128;
                        var57.field80 = var53;
                        var57.field78 = true;
                        var54.field187[var53] = var57;
                        if (var50) {
                            Statics.field948 = var57;
                        } else {
                            Statics.field882 = var57;
                        }
                        client.method2390(var54);
                        continue;
                    }
                    if (var396 == 101) {
                        class12 var58 = var50 ? Statics.field948 : Statics.field882;
                        class12 var59 = class12.method2369(var58.field128);
                        var59.field187[var58.field80] = null;
                        client.method2390(var59);
                        continue;
                    }
                    if (var396 == 102) {
                        var4--;
                        class12 var60 = class12.method2369(field944[var4]);
                        var60.field187 = null;
                        client.method2390(var60);
                        continue;
                    }
                    if (var396 == 200) {
                        var4 -= 2;
                        int var61 = field944[var4];
                        int var62 = field944[var4 + 1];
                        class12 var63 = class12.method2328(var61, var62);
                        if (var63 != null && var62 != -1) {
                            field944[var4++] = 1;
                            if (var50) {
                                Statics.field948 = var63;
                            } else {
                                Statics.field882 = var63;
                            }
                            continue;
                        }
                        field944[var4++] = 0;
                        continue;
                    }
                } else if (var396 >= 1000 && var396 < 1100 || var396 >= 2000 && var396 < 2100) {
                    class12 var64;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var4--;
                        var64 = class12.method2369(field944[var4]);
                    } else {
                        var64 = var50 ? Statics.field948 : Statics.field882;
                    }
                    if (var396 == 1000) {
                        var4 -= 2;
                        var64.field176 = field944[var4];
                        var64.field85 = field944[var4 + 1];
                        client.method2390(var64);
                        continue;
                    }
                    if (var396 == 1001) {
                        var4 -= 2;
                        var64.field88 = field944[var4];
                        var64.field89 = field944[var4 + 1];
                        client.method2390(var64);
                        continue;
                    }
                    if (var396 == 1003) {
                        var4--;
                        boolean var65 = field944[var4] == 1;
                        if (var64.field179 != var65) {
                            var64.field179 = var65;
                            client.method2390(var64);
                        }
                        continue;
                    }
                } else if (!(var396 < 1100 || var396 >= 1200) || !(var396 < 2100 || var396 >= 2200)) {
                    class12 var66;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var4--;
                        var66 = class12.method2369(field944[var4]);
                    } else {
                        var66 = var50 ? Statics.field948 : Statics.field882;
                    }
                    if (var396 == 1100) {
                        var4 -= 2;
                        var66.field92 = field944[var4];
                        if (var66.field92 > var66.field94 - var66.field88) {
                            var66.field92 = var66.field94 - var66.field88;
                        }
                        if (var66.field92 < 0) {
                            var66.field92 = 0;
                        }
                        var66.field93 = field944[var4 + 1];
                        if (var66.field93 > var66.field95 - var66.field89) {
                            var66.field93 = var66.field95 - var66.field89;
                        }
                        if (var66.field93 < 0) {
                            var66.field93 = 0;
                        }
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1101) {
                        var4--;
                        var66.field96 = field944[var4];
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1102) {
                        var4--;
                        var66.field135 = field944[var4] == 1;
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1103) {
                        var4--;
                        var66.field101 = field944[var4];
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1104) {
                        var4--;
                        var66.field102 = field944[var4];
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1105) {
                        var4--;
                        var66.field103 = field944[var4];
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1106) {
                        var4--;
                        var66.field105 = field944[var4];
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1107) {
                        var4--;
                        var66.field106 = field944[var4] == 1;
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1108) {
                        var66.field163 = 1;
                        var4--;
                        var66.field112 = field944[var4];
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1109) {
                        var4 -= 6;
                        var66.field121 = field944[var4];
                        var66.field118 = field944[var4 + 1];
                        var66.field117 = field944[var4 + 2];
                        var66.field120 = field944[var4 + 3];
                        var66.field79 = field944[var4 + 4];
                        var66.field150 = field944[var4 + 5];
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1110) {
                        var4--;
                        int var67 = field944[var4];
                        if (var66.field115 != var67) {
                            var66.field115 = var67;
                            var66.field147 = 0;
                            var66.field186 = 0;
                            client.method2390(var66);
                        }
                        continue;
                    }
                    if (var396 == 1111) {
                        var4--;
                        var66.field124 = field944[var4] == 1;
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1112) {
                        var5--;
                        String var68 = field945[var5];
                        if (!var68.equals(var66.field122)) {
                            var66.field122 = var68;
                            client.method2390(var66);
                        }
                        continue;
                    }
                    if (var396 == 1113) {
                        var4--;
                        var66.field125 = field944[var4];
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1114) {
                        var4 -= 3;
                        var66.field129 = field944[var4];
                        var66.field158 = field944[var4 + 1];
                        var66.field191 = field944[var4 + 2];
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1115) {
                        var4--;
                        var66.field131 = field944[var4] == 1;
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1116) {
                        var4--;
                        var66.field107 = field944[var4];
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1117) {
                        var4--;
                        var66.field108 = field944[var4];
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1118) {
                        var4--;
                        var66.field109 = field944[var4] == 1;
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1119) {
                        var4--;
                        var66.field160 = field944[var4] == 1;
                        client.method2390(var66);
                        continue;
                    }
                    if (var396 == 1120) {
                        var4 -= 2;
                        var66.field94 = field944[var4];
                        var66.field95 = field944[var4 + 1];
                        client.method2390(var66);
                        continue;
                    }
                } else if (var396 >= 1200 && var396 < 1300 || var396 >= 2200 && var396 < 2300) {
                    class12 var69;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var4--;
                        var69 = class12.method2369(field944[var4]);
                    } else {
                        var69 = var50 ? Statics.field948 : Statics.field882;
                    }
                    client.method2390(var69);
                    if (var396 == 1200) {
                        var4 -= 2;
                        int var70 = field944[var4];
                        int var71 = field944[var4 + 1];
                        var69.field183 = var70;
                        var69.field184 = var71;
                        class176 var72 = class176.method3351(var70);
                        var69.field117 = var72.field2623;
                        var69.field120 = var72.field2617;
                        var69.field79 = var72.field2618;
                        var69.field121 = var72.field2619;
                        var69.field118 = var72.field2620;
                        var69.field150 = var72.field2615;
                        if (var69.field88 > 0) {
                            var69.field150 = var69.field150 * 32 / var69.field88;
                        }
                        continue;
                    }
                    if (var396 == 1201) {
                        var69.field163 = 2;
                        var4--;
                        var69.field112 = field944[var4];
                        continue;
                    }
                    if (var396 == 1202) {
                        var69.field163 = 3;
                        var69.field112 = Statics.field1320.field863.method173();
                        continue;
                    }
                } else if ((var396 < 1300 || var396 >= 1400) && (var396 < 2300 || var396 >= 2400)) {
                    if (var396 >= 1400 && var396 < 1500 || var396 >= 2400 && var396 < 2500) {
                        class12 var77;
                        if (var396 >= 2000) {
                            var396 -= 1000;
                            var4--;
                            var77 = class12.method2369(field944[var4]);
                        } else {
                            var77 = var50 ? Statics.field948 : Statics.field882;
                        }
                        var5--;
                        String var78 = field945[var5];
                        int[] var79 = null;
                        if (var78.length() > 0 && var78.charAt(var78.length() - 1) == 'Y') {
                            var4--;
                            int var80 = field944[var4];
                            if (var80 > 0) {
                                var79 = new int[var80];
                                while (var80-- > 0) {
                                    var4--;
                                    var79[var80] = field944[var4];
                                }
                            }
                            var78 = var78.substring(0, var78.length() - 1);
                        }
                        Object[] var81 = new Object[var78.length() + 1];
                        for (int var82 = var81.length - 1; var82 >= 1; var82--) {
                            if (var78.charAt(var82 - 1) == 's') {
                                var5--;
                                var81[var82] = field945[var5];
                            } else {
                                var4--;
                                var81[var82] = Integer.valueOf(field944[var4]);
                            }
                        }
                        var4--;
                        int var83 = field944[var4];
                        if (var83 == -1) {
                            var81 = null;
                        } else {
                            var81[0] = Integer.valueOf(var83);
                        }
                        if (var396 == 1400) {
                            var77.field148 = var81;
                        }
                        if (var396 == 1401) {
                            var77.field151 = var81;
                        }
                        if (var396 == 1402) {
                            var77.field114 = var81;
                        }
                        if (var396 == 1403) {
                            var77.field152 = var81;
                        }
                        if (var396 == 1404) {
                            var77.field142 = var81;
                        }
                        if (var396 == 1405) {
                            var77.field155 = var81;
                        }
                        if (var396 == 1406) {
                            var77.field167 = var81;
                        }
                        if (var396 == 1407) {
                            var77.field159 = var81;
                            var77.field76 = var79;
                        }
                        if (var396 == 1408) {
                            var77.field165 = var81;
                        }
                        if (var396 == 1409) {
                            var77.field166 = var81;
                        }
                        if (var396 == 1410) {
                            var77.field156 = var81;
                        }
                        if (var396 == 1411) {
                            var77.field149 = var81;
                        }
                        if (var396 == 1412) {
                            var77.field153 = var81;
                        }
                        if (var396 == 1414) {
                            var77.field161 = var81;
                            var77.field91 = var79;
                        }
                        if (var396 == 1415) {
                            var77.field110 = var81;
                            var77.field72 = var79;
                        }
                        if (var396 == 1416) {
                            var77.field157 = var81;
                        }
                        if (var396 == 1417) {
                            var77.field162 = var81;
                        }
                        if (var396 == 1418) {
                            var77.field185 = var81;
                        }
                        if (var396 == 1419) {
                            var77.field69 = var81;
                        }
                        if (var396 == 1420) {
                            var77.field170 = var81;
                        }
                        if (var396 == 1421) {
                            var77.field171 = var81;
                        }
                        if (var396 == 1422) {
                            var77.field172 = var81;
                        }
                        if (var396 == 1423) {
                            var77.field98 = var81;
                        }
                        if (var396 == 1424) {
                            var77.field174 = var81;
                        }
                        var77.field146 = true;
                        continue;
                    }
                    if (var396 < 1600) {
                        class12 var84 = var50 ? Statics.field948 : Statics.field882;
                        if (var396 == 1500) {
                            field944[var4++] = var84.field176;
                            continue;
                        }
                        if (var396 == 1501) {
                            field944[var4++] = var84.field85;
                            continue;
                        }
                        if (var396 == 1502) {
                            field944[var4++] = var84.field88;
                            continue;
                        }
                        if (var396 == 1503) {
                            field944[var4++] = var84.field89;
                            continue;
                        }
                        if (var396 == 1504) {
                            field944[var4++] = var84.field179 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 1505) {
                            field944[var4++] = var84.field90;
                            continue;
                        }
                    } else if (var396 < 1700) {
                        class12 var85 = var50 ? Statics.field948 : Statics.field882;
                        if (var396 == 1600) {
                            field944[var4++] = var85.field92;
                            continue;
                        }
                        if (var396 == 1601) {
                            field944[var4++] = var85.field93;
                            continue;
                        }
                        if (var396 == 1602) {
                            field945[var5++] = var85.field122;
                            continue;
                        }
                        if (var396 == 1603) {
                            field944[var4++] = var85.field94;
                            continue;
                        }
                        if (var396 == 1604) {
                            field944[var4++] = var85.field95;
                            continue;
                        }
                        if (var396 == 1605) {
                            field944[var4++] = var85.field150;
                            continue;
                        }
                        if (var396 == 1606) {
                            field944[var4++] = var85.field117;
                            continue;
                        }
                        if (var396 == 1607) {
                            field944[var4++] = var85.field79;
                            continue;
                        }
                        if (var396 == 1608) {
                            field944[var4++] = var85.field120;
                            continue;
                        }
                    } else if (var396 < 1800) {
                        class12 var86 = var50 ? Statics.field948 : Statics.field882;
                        if (var396 == 1700) {
                            field944[var4++] = var86.field183;
                            continue;
                        }
                        if (var396 == 1701) {
                            if (var86.field183 == -1) {
                                field944[var4++] = 0;
                            } else {
                                field944[var4++] = var86.field184;
                            }
                            continue;
                        }
                        if (var396 == 1702) {
                            field944[var4++] = var86.field80;
                            continue;
                        }
                    } else if (var396 < 1900) {
                        class12 var87 = var50 ? Statics.field948 : Statics.field882;
                        if (var396 == 1800) {
                            int[] var88 = field944;
                            int var89 = var4++;
                            int var90 = client.method2929(var87);
                            int var91 = var90 >> 11 & 0x3F;
                            var88[var89] = var91;
                            continue;
                        }
                        if (var396 == 1801) {
                            var4--;
                            int var92 = field944[var4];
                            int var397 = var92 - 1;
                            if (var87.field140 != null && var397 < var87.field140.length && var87.field140[var397] != null) {
                                field945[var5++] = var87.field140[var397];
                                continue;
                            }
                            field945[var5++] = "";
                            continue;
                        }
                        if (var396 == 1802) {
                            if (var87.field139 == null) {
                                field945[var5++] = "";
                            } else {
                                field945[var5++] = var87.field139;
                            }
                            continue;
                        }
                    } else if (var396 < 2600) {
                        var4--;
                        class12 var93 = class12.method2369(field944[var4]);
                        if (var396 == 2500) {
                            field944[var4++] = var93.field176;
                            continue;
                        }
                        if (var396 == 2501) {
                            field944[var4++] = var93.field85;
                            continue;
                        }
                        if (var396 == 2502) {
                            field944[var4++] = var93.field88;
                            continue;
                        }
                        if (var396 == 2503) {
                            field944[var4++] = var93.field89;
                            continue;
                        }
                        if (var396 == 2504) {
                            field944[var4++] = var93.field179 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 2505) {
                            field944[var4++] = var93.field90;
                            continue;
                        }
                    } else if (var396 < 2700) {
                        var4--;
                        class12 var94 = class12.method2369(field944[var4]);
                        if (var396 == 2600) {
                            field944[var4++] = var94.field92;
                            continue;
                        }
                        if (var396 == 2601) {
                            field944[var4++] = var94.field93;
                            continue;
                        }
                        if (var396 == 2602) {
                            field945[var5++] = var94.field122;
                            continue;
                        }
                        if (var396 == 2603) {
                            field944[var4++] = var94.field94;
                            continue;
                        }
                        if (var396 == 2604) {
                            field944[var4++] = var94.field95;
                            continue;
                        }
                        if (var396 == 2605) {
                            field944[var4++] = var94.field150;
                            continue;
                        }
                        if (var396 == 2606) {
                            field944[var4++] = var94.field117;
                            continue;
                        }
                        if (var396 == 2607) {
                            field944[var4++] = var94.field79;
                            continue;
                        }
                        if (var396 == 2608) {
                            field944[var4++] = var94.field120;
                            continue;
                        }
                    } else if (var396 < 2800) {
                        if (var396 == 2700) {
                            var4--;
                            class12 var95 = class12.method2369(field944[var4]);
                            field944[var4++] = var95.field183;
                            continue;
                        }
                        if (var396 == 2701) {
                            var4--;
                            class12 var96 = class12.method2369(field944[var4]);
                            if (var96.field183 == -1) {
                                field944[var4++] = 0;
                            } else {
                                field944[var4++] = var96.field184;
                            }
                            continue;
                        }
                        if (var396 == 2702) {
                            var4--;
                            int var97 = field944[var4];
                            class80 var98 = (class80) client.field1691.method20((long) var97);
                            if (var98 == null) {
                                field944[var4++] = 0;
                            } else {
                                field944[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var396 < 2900) {
                        var4--;
                        class12 var99 = class12.method2369(field944[var4]);
                        if (var396 == 2800) {
                            int[] var100 = field944;
                            int var101 = var4++;
                            int var102 = client.method2929(var99);
                            int var103 = var102 >> 11 & 0x3F;
                            var100[var101] = var103;
                            continue;
                        }
                        if (var396 == 2801) {
                            var4--;
                            int var104 = field944[var4];
                            int var398 = var104 - 1;
                            if (var99.field140 != null && var398 < var99.field140.length && var99.field140[var398] != null) {
                                field945[var5++] = var99.field140[var398];
                                continue;
                            }
                            field945[var5++] = "";
                            continue;
                        }
                        if (var396 == 2802) {
                            if (var99.field139 == null) {
                                field945[var5++] = "";
                            } else {
                                field945[var5++] = var99.field139;
                            }
                            continue;
                        }
                    } else if (var396 < 3200) {
                        if (var396 == 3100) {
                            var5--;
                            String var105 = field945[var5];
                            client.method2192(0, "", var105);
                            continue;
                        }
                        if (var396 == 3101) {
                            var4 -= 2;
                            client.method476(Statics.field1320, field944[var4], field944[var4 + 1]);
                            continue;
                        }
                        if (var396 == 3103) {
                            client.field1570.method653(104);
                            for (class80 var106 = (class80) client.field1691.method16(); var106 != null; var106 = (class80) client.field1691.method17()) {
                                if (var106.field932 == 0 || var106.field932 == 3) {
                                    client.method2908(var106, true);
                                }
                            }
                            if (client.field1694 != null) {
                                client.method2390(client.field1694);
                                client.field1694 = null;
                            }
                            continue;
                        }
                        if (var396 == 3104) {
                            var5--;
                            String var107 = field945[var5];
                            int var108 = 0;
                            if (class91.method2381(var107)) {
                                var108 = class91.method2282(var107);
                            }
                            client.field1570.method653(159);
                            client.field1570.method669(var108);
                            continue;
                        }
                        if (var396 == 3105) {
                            var5--;
                            String var109 = field945[var5];
                            client.field1570.method653(60);
                            client.field1570.method666(var109.length() + 1);
                            client.field1570.method671(var109);
                            continue;
                        }
                        if (var396 == 3106) {
                            var5--;
                            String var110 = field945[var5];
                            client.field1570.method653(113);
                            client.field1570.method666(var110.length() + 1);
                            client.field1570.method671(var110);
                            continue;
                        }
                        if (var396 == 3107) {
                            var4--;
                            int var111 = field944[var4];
                            var5--;
                            String var112 = field945[var5];
                            client.method1128(var111, var112);
                            continue;
                        }
                        if (var396 == 3108) {
                            var4 -= 3;
                            int var113 = field944[var4];
                            int var114 = field944[var4 + 1];
                            int var115 = field944[var4 + 2];
                            class12 var116 = class12.method2369(var115);
                            client.method1948(var116, var113, var114);
                            continue;
                        }
                        if (var396 == 3109) {
                            var4 -= 2;
                            int var117 = field944[var4];
                            int var118 = field944[var4 + 1];
                            class12 var119 = var50 ? Statics.field948 : Statics.field882;
                            client.method1948(var119, var117, var118);
                            continue;
                        }
                    } else if (var396 < 3300) {
                        if (var396 == 3200) {
                            var4 -= 3;
                            client.method3046(field944[var4], field944[var4 + 1], field944[var4 + 2]);
                            continue;
                        }
                        if (var396 == 3201) {
                            var4--;
                            client.method1211(field944[var4]);
                            continue;
                        }
                        if (var396 == 3202) {
                            var4 -= 2;
                            int var120 = field944[var4];
                            int var10000 = field944[var4 + 1];
                            if (client.field1765 != 0 && var120 != -1) {
                                class97.method2017(Statics.field905, var120, 0, client.field1765, false);
                                client.field1767 = true;
                            }
                            continue;
                        }
                    } else if (var396 < 3400) {
                        if (var396 == 3300) {
                            field944[var4++] = client.field1541;
                            continue;
                        }
                        if (var396 == 3301) {
                            var4 -= 2;
                            int var122 = field944[var4];
                            int var123 = field944[var4 + 1];
                            int[] var124 = field944;
                            int var125 = var4++;
                            class66 var126 = (class66) class66.field736.method20((long) var122);
                            int var127;
                            if (var126 == null) {
                                var127 = -1;
                            } else if (var123 >= 0 && var123 < var126.field727.length) {
                                var127 = var126.field727[var123];
                            } else {
                                var127 = -1;
                            }
                            var124[var125] = var127;
                            continue;
                        }
                        if (var396 == 3302) {
                            var4 -= 2;
                            int var128 = field944[var4];
                            int var129 = field944[var4 + 1];
                            field944[var4++] = class66.method1362(var128, var129);
                            continue;
                        }
                        if (var396 == 3303) {
                            var4 -= 2;
                            int var130 = field944[var4];
                            int var131 = field944[var4 + 1];
                            int[] var132 = field944;
                            int var133 = var4++;
                            class66 var134 = (class66) class66.field736.method20((long) var130);
                            int var135;
                            if (var134 == null) {
                                var135 = 0;
                            } else if (var131 == -1) {
                                var135 = 0;
                            } else {
                                int var136 = 0;
                                for (int var137 = 0; var137 < var134.field729.length; var137++) {
                                    if (var134.field727[var137] == var131) {
                                        var136 += var134.field729[var137];
                                    }
                                }
                                var135 = var136;
                            }
                            var132[var133] = var135;
                            continue;
                        }
                        if (var396 == 3304) {
                            var4--;
                            int var138 = field944[var4];
                            int[] var139 = field944;
                            int var140 = var4++;
                            class177 var141 = (class177) class177.field2654.method1((long) var138);
                            class177 var142;
                            if (var141 == null) {
                                byte[] var143 = Statics.field2655.method1266(5, var138);
                                class177 var144 = new class177();
                                if (var143 != null) {
                                    var144.method3102(new class50(var143));
                                }
                                class177.field2654.method4(var144, (long) var138);
                                var142 = var144;
                            } else {
                                var142 = var141;
                            }
                            var139[var140] = var142.field2658;
                            continue;
                        }
                        if (var396 == 3305) {
                            var4--;
                            int var145 = field944[var4];
                            field944[var4++] = client.field1614[var145];
                            continue;
                        }
                        if (var396 == 3306) {
                            var4--;
                            int var146 = field944[var4];
                            field944[var4++] = client.field1669[var146];
                            continue;
                        }
                        if (var396 == 3307) {
                            var4--;
                            int var147 = field944[var4];
                            field944[var4++] = client.field1670[var147];
                            continue;
                        }
                        if (var396 == 3308) {
                            int var148 = Statics.field2252;
                            int var149 = (Statics.field1320.field2707 >> 7) + Statics.field2043;
                            int var150 = (Statics.field1320.field2664 >> 7) + Statics.field403;
                            field944[var4++] = (var148 << 28) + (var149 << 14) + var150;
                            continue;
                        }
                        if (var396 == 3309) {
                            var4--;
                            int var151 = field944[var4];
                            field944[var4++] = var151 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var396 == 3310) {
                            var4--;
                            int var152 = field944[var4];
                            field944[var4++] = var152 >> 28;
                            continue;
                        }
                        if (var396 == 3311) {
                            var4--;
                            int var153 = field944[var4];
                            field944[var4++] = var153 & 0x3FFF;
                            continue;
                        }
                        if (var396 == 3312) {
                            field944[var4++] = client.field1675 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 3313) {
                            var4 -= 2;
                            int var154 = field944[var4] + 32768;
                            int var155 = field944[var4 + 1];
                            int[] var156 = field944;
                            int var157 = var4++;
                            class66 var158 = (class66) class66.field736.method20((long) var154);
                            int var159;
                            if (var158 == null) {
                                var159 = -1;
                            } else if (var155 >= 0 && var155 < var158.field727.length) {
                                var159 = var158.field727[var155];
                            } else {
                                var159 = -1;
                            }
                            var156[var157] = var159;
                            continue;
                        }
                        if (var396 == 3314) {
                            var4 -= 2;
                            int var160 = field944[var4] + 32768;
                            int var161 = field944[var4 + 1];
                            field944[var4++] = class66.method1362(var160, var161);
                            continue;
                        }
                        if (var396 == 3315) {
                            var4 -= 2;
                            int var162 = field944[var4] + 32768;
                            int var163 = field944[var4 + 1];
                            int[] var164 = field944;
                            int var165 = var4++;
                            class66 var166 = (class66) class66.field736.method20((long) var162);
                            int var167;
                            if (var166 == null) {
                                var167 = 0;
                            } else if (var163 == -1) {
                                var167 = 0;
                            } else {
                                int var168 = 0;
                                for (int var169 = 0; var169 < var166.field729.length; var169++) {
                                    if (var166.field727[var169] == var163) {
                                        var168 += var166.field729[var169];
                                    }
                                }
                                var167 = var168;
                            }
                            var164[var165] = var167;
                            continue;
                        }
                        if (var396 == 3316) {
                            if (client.field1536 >= 2) {
                                field944[var4++] = client.field1536;
                            } else {
                                field944[var4++] = 0;
                            }
                            continue;
                        }
                        if (var396 == 3317) {
                            field944[var4++] = client.field1534;
                            continue;
                        }
                        if (var396 == 3318) {
                            field944[var4++] = client.field1533;
                            continue;
                        }
                        if (var396 == 3321) {
                            field944[var4++] = client.field1535;
                            continue;
                        }
                        if (var396 == 3322) {
                            field944[var4++] = client.field1696;
                            continue;
                        }
                        if (var396 == 3323) {
                            if (client.field1592) {
                                field944[var4++] = 1;
                            } else {
                                field944[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var396 < 3500) {
                        if (var396 == 3400) {
                            var4 -= 2;
                            int var170 = field944[var4];
                            int var171 = field944[var4 + 1];
                            class170 var172 = (class170) class170.field2518.method1((long) var170);
                            class170 var173;
                            if (var172 == null) {
                                byte[] var174 = Statics.field2524.method1266(8, var170);
                                class170 var175 = new class170();
                                if (var174 != null) {
                                    var175.method2941(new class50(var174));
                                }
                                class170.field2518.method4(var175, (long) var170);
                                var173 = var175;
                            } else {
                                var173 = var172;
                            }
                            class170 var176 = var173;
                            if (var173.field2517 != 's') {
                            }
                            for (int var177 = 0; var177 < var176.field2521; var177++) {
                                if (var176.field2522[var177] == var171) {
                                    field945[var5++] = var176.field2527[var177];
                                    var176 = null;
                                    break;
                                }
                            }
                            if (var176 != null) {
                                field945[var5++] = var176.field2519;
                            }
                            continue;
                        }
                        if (var396 == 3408) {
                            var4 -= 4;
                            int var178 = field944[var4];
                            int var179 = field944[var4 + 1];
                            int var180 = field944[var4 + 2];
                            int var181 = field944[var4 + 3];
                            class170 var182 = (class170) class170.field2518.method1((long) var180);
                            class170 var183;
                            if (var182 == null) {
                                byte[] var184 = Statics.field2524.method1266(8, var180);
                                class170 var185 = new class170();
                                if (var184 != null) {
                                    var185.method2941(new class50(var184));
                                }
                                class170.field2518.method4(var185, (long) var180);
                                var183 = var185;
                            } else {
                                var183 = var182;
                            }
                            class170 var186 = var183;
                            if (var183.field2515 == var178 && var183.field2517 == var179) {
                                for (int var187 = 0; var187 < var186.field2521; var187++) {
                                    if (var186.field2522[var187] == var181) {
                                        if (var179 == 115) {
                                            field945[var5++] = var186.field2527[var187];
                                        } else {
                                            field944[var4++] = var186.field2523[var187];
                                        }
                                        var186 = null;
                                        break;
                                    }
                                }
                                if (var186 != null) {
                                    if (var179 == 115) {
                                        field945[var5++] = var186.field2519;
                                    } else {
                                        field944[var4++] = var186.field2520;
                                    }
                                }
                                continue;
                            }
                            if (var179 == 115) {
                                field945[var5++] = "null";
                            } else {
                                field944[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var396 < 3700) {
                        if (var396 == 3600) {
                            if (client.field1709 == 0) {
                                field944[var4++] = -2;
                            } else if (client.field1709 == 1) {
                                field944[var4++] = -1;
                            } else {
                                field944[var4++] = client.field1782;
                            }
                            continue;
                        }
                        if (var396 == 3601) {
                            var4--;
                            int var188 = field944[var4];
                            if (client.field1709 == 2 && var188 < client.field1782) {
                                field945[var5++] = client.field1784[var188].field1321;
                                continue;
                            }
                            field945[var5++] = "";
                            continue;
                        }
                        if (var396 == 3602) {
                            var4--;
                            int var189 = field944[var4];
                            if (client.field1709 == 2 && var189 < client.field1782) {
                                field944[var4++] = client.field1784[var189].field1316;
                                continue;
                            }
                            field944[var4++] = 0;
                            continue;
                        }
                        if (var396 == 3603) {
                            var4--;
                            int var190 = field944[var4];
                            if (client.field1709 == 2 && var190 < client.field1782) {
                                field944[var4++] = client.field1784[var190].field1314;
                                continue;
                            }
                            field944[var4++] = 0;
                            continue;
                        }
                        if (var396 == 3604) {
                            var5--;
                            String var191 = field945[var5];
                            var4--;
                            int var192 = field944[var4];
                            client.method475(var191, var192);
                            continue;
                        }
                        if (var396 == 3605) {
                            var5--;
                            String var193 = field945[var5];
                            if (var193 == null) {
                                continue;
                            }
                            if ((client.field1782 < 200 || client.field1657 == 1) && client.field1782 < 400) {
                                String var194 = class53.method1409(var193, Statics.field502);
                                if (var194 == null) {
                                    continue;
                                }
                                for (int var195 = 0; var195 < client.field1782; var195++) {
                                    class94 var196 = client.field1784[var195];
                                    String var197 = class53.method1409(var196.field1321, Statics.field502);
                                    if (var197 != null && var197.equals(var194)) {
                                        client.method2192(0, "", var193 + class85.field994);
                                        continue label2618;
                                    }
                                    if (var196.field1315 != null) {
                                        String var198 = class53.method1409(var196.field1315, Statics.field502);
                                        if (var198 != null && var198.equals(var194)) {
                                            client.method2192(0, "", var193 + class85.field994);
                                            continue label2618;
                                        }
                                    }
                                }
                                for (int var199 = 0; var199 < client.field1786; var199++) {
                                    class104 var200 = client.field1787[var199];
                                    String var201 = class53.method1409(var200.field1450, Statics.field502);
                                    if (var201 != null && var201.equals(var194)) {
                                        client.method2192(0, "", class85.field1102 + var193 + class85.field1058);
                                        continue label2618;
                                    }
                                    if (var200.field1439 != null) {
                                        String var202 = class53.method1409(var200.field1439, Statics.field502);
                                        if (var202 != null && var202.equals(var194)) {
                                            client.method2192(0, "", class85.field1102 + var193 + class85.field1058);
                                            continue label2618;
                                        }
                                    }
                                }
                                if (class53.method1409(Statics.field1320.field855, Statics.field502).equals(var194)) {
                                    client.method2192(0, "", class85.field1141);
                                } else {
                                    client.field1570.method653(109);
                                    client.field1570.method666(class50.method2053(var193));
                                    client.field1570.method671(var193);
                                }
                                continue;
                            }
                            client.method2192(0, "", class85.field1137);
                            continue;
                        }
                        if (var396 == 3606) {
                            var5--;
                            String var203 = field945[var5];
                            if (var203 == null) {
                                continue;
                            }
                            String var204 = class53.method1409(var203, Statics.field502);
                            if (var204 == null) {
                                continue;
                            }
                            int var205 = 0;
                            while (true) {
                                if (var205 >= client.field1782) {
                                    continue label2618;
                                }
                                class94 var206 = client.field1784[var205];
                                String var207 = var206.field1321;
                                String var208 = class53.method1409(var207, Statics.field502);
                                if (class93.method1079(var203, var204, var207, var208)) {
                                    client.field1782--;
                                    for (int var209 = var205; var209 < client.field1782; var209++) {
                                        client.field1784[var209] = client.field1784[var209 + 1];
                                    }
                                    client.field1721 = client.field1713;
                                    client.field1570.method653(25);
                                    client.field1570.method666(class50.method2053(var203));
                                    client.field1570.method671(var203);
                                    continue label2618;
                                }
                                var205++;
                            }
                        }
                        if (var396 == 3607) {
                            var5--;
                            String var210 = field945[var5];
                            if (var210 == null) {
                                continue;
                            }
                            if ((client.field1786 < 100 || client.field1657 == 1) && client.field1786 < 400) {
                                String var211 = class53.method1409(var210, Statics.field502);
                                if (var211 == null) {
                                    continue;
                                }
                                for (int var212 = 0; var212 < client.field1786; var212++) {
                                    class104 var213 = client.field1787[var212];
                                    String var214 = class53.method1409(var213.field1450, Statics.field502);
                                    if (var214 != null && var214.equals(var211)) {
                                        client.method2192(0, "", var210 + class85.field1140);
                                        continue label2618;
                                    }
                                    if (var213.field1439 != null) {
                                        String var215 = class53.method1409(var213.field1439, Statics.field502);
                                        if (var215 != null && var215.equals(var211)) {
                                            client.method2192(0, "", var210 + class85.field1140);
                                            continue label2618;
                                        }
                                    }
                                }
                                for (int var216 = 0; var216 < client.field1782; var216++) {
                                    class94 var217 = client.field1784[var216];
                                    String var218 = class53.method1409(var217.field1321, Statics.field502);
                                    if (var218 != null && var218.equals(var211)) {
                                        client.method2192(0, "", class85.field1008 + var210 + class85.field998);
                                        continue label2618;
                                    }
                                    if (var217.field1315 != null) {
                                        String var219 = class53.method1409(var217.field1315, Statics.field502);
                                        if (var219 != null && var219.equals(var211)) {
                                            client.method2192(0, "", class85.field1008 + var210 + class85.field998);
                                            continue label2618;
                                        }
                                    }
                                }
                                if (class53.method1409(Statics.field1320.field855, Statics.field502).equals(var211)) {
                                    client.method2192(0, "", class85.field1142);
                                } else {
                                    client.field1570.method653(1);
                                    client.field1570.method666(class50.method2053(var210));
                                    client.field1570.method671(var210);
                                }
                                continue;
                            }
                            client.method2192(0, "", class85.field1139);
                            continue;
                        }
                        if (var396 == 3608) {
                            var5--;
                            String var220 = field945[var5];
                            if (var220 == null) {
                                continue;
                            }
                            String var221 = class53.method1409(var220, Statics.field502);
                            if (var221 == null) {
                                continue;
                            }
                            int var222 = 0;
                            while (true) {
                                if (var222 >= client.field1786) {
                                    continue label2618;
                                }
                                class104 var223 = client.field1787[var222];
                                String var224 = var223.field1450;
                                String var225 = class53.method1409(var224, Statics.field502);
                                if (class93.method1079(var220, var221, var224, var225)) {
                                    client.field1786--;
                                    for (int var226 = var222; var226 < client.field1786; var226++) {
                                        client.field1787[var226] = client.field1787[var226 + 1];
                                    }
                                    client.field1721 = client.field1713;
                                    client.field1570.method653(86);
                                    client.field1570.method666(class50.method2053(var220));
                                    client.field1570.method671(var220);
                                    continue label2618;
                                }
                                var222++;
                            }
                        }
                        if (var396 == 3609) {
                            var5--;
                            String var227 = field945[var5];
                            if (var227.startsWith(class76.method2095(0)) || var227.startsWith(class76.method2095(1))) {
                                var227 = var227.substring(7);
                            }
                            field944[var4++] = client.method1218(var227) ? 1 : 0;
                            continue;
                        }
                        if (var396 == 3611) {
                            if (client.field1755 == null) {
                                field945[var5++] = "";
                            } else {
                                field945[var5++] = class103.method2871(client.field1755);
                            }
                            continue;
                        }
                        if (var396 == 3612) {
                            if (client.field1755 == null) {
                                field944[var4++] = 0;
                            } else {
                                field944[var4++] = Statics.field768;
                            }
                            continue;
                        }
                        if (var396 == 3613) {
                            var4--;
                            int var228 = field944[var4];
                            if (client.field1755 != null && var228 < Statics.field768) {
                                field945[var5++] = Statics.field2012[var228].field563;
                                continue;
                            }
                            field945[var5++] = "";
                            continue;
                        }
                        if (var396 == 3614) {
                            var4--;
                            int var229 = field944[var4];
                            if (client.field1755 != null && var229 < Statics.field768) {
                                field944[var4++] = Statics.field2012[var229].field558;
                                continue;
                            }
                            field944[var4++] = 0;
                            continue;
                        }
                        if (var396 == 3615) {
                            var4--;
                            int var230 = field944[var4];
                            if (client.field1755 != null && var230 < Statics.field768) {
                                field944[var4++] = Statics.field2012[var230].field559;
                                continue;
                            }
                            field944[var4++] = 0;
                            continue;
                        }
                        if (var396 == 3616) {
                            field944[var4++] = Statics.field1326;
                            continue;
                        }
                        if (var396 == 3617) {
                            var5--;
                            String var231 = field945[var5];
                            client.method2028(var231);
                            continue;
                        }
                        if (var396 == 3618) {
                            field944[var4++] = Statics.field2035;
                            continue;
                        }
                        if (var396 == 3619) {
                            var5--;
                            String var232 = field945[var5];
                            if (!var232.equals("")) {
                                client.field1570.method653(120);
                                client.field1570.method666(class50.method2053(var232));
                                client.field1570.method671(var232);
                            }
                            continue;
                        }
                        if (var396 == 3620) {
                            client.method1170();
                            continue;
                        }
                        if (var396 == 3621) {
                            if (client.field1709 == 0) {
                                field944[var4++] = -1;
                            } else {
                                field944[var4++] = client.field1786;
                            }
                            continue;
                        }
                        if (var396 == 3622) {
                            var4--;
                            int var233 = field944[var4];
                            if (client.field1709 != 0 && var233 < client.field1786) {
                                field945[var5++] = client.field1787[var233].field1450;
                                continue;
                            }
                            field945[var5++] = "";
                            continue;
                        }
                        if (var396 == 3623) {
                            var5--;
                            String var234 = field945[var5];
                            if (var234.startsWith(class76.method2095(0)) || var234.startsWith(class76.method2095(1))) {
                                var234 = var234.substring(7);
                            }
                            field944[var4++] = client.method1147(var234) ? 1 : 0;
                            continue;
                        }
                        if (var396 == 3624) {
                            var4--;
                            int var235 = field944[var4];
                            if (Statics.field2012 != null && var235 < Statics.field768 && Statics.field2012[var235].field563.equalsIgnoreCase(Statics.field1320.field855)) {
                                field944[var4++] = 1;
                                continue;
                            }
                            field944[var4++] = 0;
                            continue;
                        }
                        if (var396 == 3625) {
                            if (client.field1551 == null) {
                                field945[var5++] = "";
                            } else {
                                field945[var5++] = class103.method2871(client.field1551);
                            }
                            continue;
                        }
                    } else if (var396 < 4100) {
                        if (var396 == 4000) {
                            var4 -= 2;
                            int var236 = field944[var4];
                            int var237 = field944[var4 + 1];
                            field944[var4++] = var236 + var237;
                            continue;
                        }
                        if (var396 == 4001) {
                            var4 -= 2;
                            int var238 = field944[var4];
                            int var239 = field944[var4 + 1];
                            field944[var4++] = var238 - var239;
                            continue;
                        }
                        if (var396 == 4002) {
                            var4 -= 2;
                            int var240 = field944[var4];
                            int var241 = field944[var4 + 1];
                            field944[var4++] = var240 * var241;
                            continue;
                        }
                        if (var396 == 4003) {
                            var4 -= 2;
                            int var242 = field944[var4];
                            int var243 = field944[var4 + 1];
                            field944[var4++] = var242 / var243;
                            continue;
                        }
                        if (var396 == 4004) {
                            var4--;
                            int var244 = field944[var4];
                            field944[var4++] = (int) (Math.random() * (double) var244);
                            continue;
                        }
                        if (var396 == 4005) {
                            var4--;
                            int var245 = field944[var4];
                            field944[var4++] = (int) (Math.random() * (double) (var245 + 1));
                            continue;
                        }
                        if (var396 == 4006) {
                            var4 -= 5;
                            int var246 = field944[var4];
                            int var247 = field944[var4 + 1];
                            int var248 = field944[var4 + 2];
                            int var249 = field944[var4 + 3];
                            int var250 = field944[var4 + 4];
                            field944[var4++] = (var247 - var246) * (var250 - var248) / (var249 - var248) + var246;
                            continue;
                        }
                        if (var396 == 4007) {
                            var4 -= 2;
                            int var251 = field944[var4];
                            int var252 = field944[var4 + 1];
                            field944[var4++] = var251 * var252 / 100 + var251;
                            continue;
                        }
                        if (var396 == 4008) {
                            var4 -= 2;
                            int var253 = field944[var4];
                            int var254 = field944[var4 + 1];
                            field944[var4++] = var253 | 0x1 << var254;
                            continue;
                        }
                        if (var396 == 4009) {
                            var4 -= 2;
                            int var255 = field944[var4];
                            int var256 = field944[var4 + 1];
                            field944[var4++] = var255 & -1 - (0x1 << var256);
                            continue;
                        }
                        if (var396 == 4010) {
                            var4 -= 2;
                            int var257 = field944[var4];
                            int var258 = field944[var4 + 1];
                            field944[var4++] = (var257 & 0x1 << var258) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var396 == 4011) {
                            var4 -= 2;
                            int var259 = field944[var4];
                            int var260 = field944[var4 + 1];
                            field944[var4++] = var259 % var260;
                            continue;
                        }
                        if (var396 == 4012) {
                            var4 -= 2;
                            int var261 = field944[var4];
                            int var262 = field944[var4 + 1];
                            if (var261 == 0) {
                                field944[var4++] = 0;
                            } else {
                                field944[var4++] = (int) Math.pow((double) var261, (double) var262);
                            }
                            continue;
                        }
                        if (var396 == 4013) {
                            var4 -= 2;
                            int var263 = field944[var4];
                            int var264 = field944[var4 + 1];
                            if (var263 == 0) {
                                field944[var4++] = 0;
                            } else if (var264 == 0) {
                                field944[var4++] = Integer.MAX_VALUE;
                            } else {
                                field944[var4++] = (int) Math.pow((double) var263, 1.0D / (double) var264);
                            }
                            continue;
                        }
                        if (var396 == 4014) {
                            var4 -= 2;
                            int var265 = field944[var4];
                            int var266 = field944[var4 + 1];
                            field944[var4++] = var265 & var266;
                            continue;
                        }
                        if (var396 == 4015) {
                            var4 -= 2;
                            int var267 = field944[var4];
                            int var268 = field944[var4 + 1];
                            field944[var4++] = var267 | var268;
                            continue;
                        }
                    } else if (var396 < 4200) {
                        if (var396 == 4100) {
                            var5--;
                            String var269 = field945[var5];
                            var4--;
                            int var270 = field944[var4];
                            field945[var5++] = var269 + var270;
                            continue;
                        }
                        if (var396 == 4101) {
                            var5 -= 2;
                            String var271 = field945[var5];
                            String var272 = field945[var5 + 1];
                            field945[var5++] = var271 + var272;
                            continue;
                        }
                        if (var396 == 4102) {
                            var5--;
                            String var273 = field945[var5];
                            var4--;
                            int var274 = field944[var4];
                            String[] var275 = field945;
                            int var276 = var5++;
                            String var278;
                            if (var274 < 0) {
                                var278 = Integer.toString(var274);
                            } else {
                                var278 = class91.method1207(var274, 10, true);
                            }
                            var275[var276] = var273 + var278;
                            continue;
                        }
                        if (var396 == 4103) {
                            var5--;
                            String var279 = field945[var5];
                            field945[var5++] = var279.toLowerCase();
                            continue;
                        }
                        if (var396 == 4104) {
                            var4--;
                            int var280 = field944[var4];
                            long var281 = ((long) var280 + 11745L) * 86400000L;
                            field949.setTime(new Date(var281));
                            int var283 = field949.get(5);
                            int var284 = field949.get(2);
                            int var285 = field949.get(1);
                            field945[var5++] = var283 + "-" + field950[var284] + "-" + var285;
                            continue;
                        }
                        if (var396 == 4105) {
                            var5 -= 2;
                            String var286 = field945[var5];
                            String var287 = field945[var5 + 1];
                            if (Statics.field1320.field863 != null && Statics.field1320.field863.field204) {
                                field945[var5++] = var287;
                                continue;
                            }
                            field945[var5++] = var286;
                            continue;
                        }
                        if (var396 == 4106) {
                            var4--;
                            int var288 = field944[var4];
                            field945[var5++] = Integer.toString(var288);
                            continue;
                        }
                        if (var396 == 4107) {
                            var5 -= 2;
                            field944[var4++] = class91.method2353(class35.method1423(field945[var5], field945[var5 + 1], client.field1538));
                            continue;
                        }
                        if (var396 == 4108) {
                            var5--;
                            String var289 = field945[var5];
                            var4 -= 2;
                            int var290 = field944[var4];
                            int var291 = field944[var4 + 1];
                            byte[] var292 = Statics.field390.method1266(var291, 0);
                            class23 var293 = new class23(var292);
                            field944[var4++] = var293.method292(var289, var290);
                            continue;
                        }
                        if (var396 == 4109) {
                            var5--;
                            String var294 = field945[var5];
                            var4 -= 2;
                            int var295 = field944[var4];
                            int var296 = field944[var4 + 1];
                            byte[] var297 = Statics.field390.method1266(var296, 0);
                            class23 var298 = new class23(var297);
                            field944[var4++] = var298.method289(var294, var295);
                            continue;
                        }
                        if (var396 == 4110) {
                            var5 -= 2;
                            String var299 = field945[var5];
                            String var300 = field945[var5 + 1];
                            var4--;
                            if (field944[var4] == 1) {
                                field945[var5++] = var299;
                            } else {
                                field945[var5++] = var300;
                            }
                            continue;
                        }
                        if (var396 == 4111) {
                            var5--;
                            String var301 = field945[var5];
                            field945[var5++] = class25.method357(var301);
                            continue;
                        }
                        if (var396 == 4112) {
                            var5--;
                            String var302 = field945[var5];
                            var4--;
                            int var303 = field944[var4];
                            field945[var5++] = var302 + (char) var303;
                            continue;
                        }
                        if (var396 == 4113) {
                            var4--;
                            int var304 = field944[var4];
                            int[] var305 = field944;
                            int var306 = var4++;
                            char var307 = (char) var304;
                            boolean var308;
                            if (var307 >= ' ' && var307 <= '~') {
                                var308 = true;
                            } else if (var307 >= 160 && var307 <= 255) {
                                var308 = true;
                            } else if (var307 == 8364 || var307 == 338 || var307 == 8212 || var307 == 339 || var307 == 376) {
                                var308 = true;
                            } else {
                                var308 = false;
                            }
                            var305[var306] = var308 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4114) {
                            var4--;
                            int var309 = field944[var4];
                            int[] var310 = field944;
                            int var311 = var4++;
                            char var312 = (char) var309;
                            boolean var313 = var312 >= '0' && var312 <= '9' || var312 >= 'A' && var312 <= 'Z' || var312 >= 'a' && var312 <= 'z';
                            var310[var311] = var313 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4115) {
                            var4--;
                            int var314 = field944[var4];
                            int[] var315 = field944;
                            int var316 = var4++;
                            char var317 = (char) var314;
                            boolean var318 = var317 >= 'A' && var317 <= 'Z' || var317 >= 'a' && var317 <= 'z';
                            var315[var316] = var318 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4116) {
                            var4--;
                            int var319 = field944[var4];
                            int[] var320 = field944;
                            int var321 = var4++;
                            char var322 = (char) var319;
                            boolean var323 = var322 >= '0' && var322 <= '9';
                            var320[var321] = var323 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4117) {
                            var5--;
                            String var324 = field945[var5];
                            if (var324 == null) {
                                field944[var4++] = 0;
                            } else {
                                field944[var4++] = var324.length();
                            }
                            continue;
                        }
                        if (var396 == 4118) {
                            var5--;
                            String var325 = field945[var5];
                            var4 -= 2;
                            int var326 = field944[var4];
                            int var327 = field944[var4 + 1];
                            field945[var5++] = var325.substring(var326, var327);
                            continue;
                        }
                        if (var396 == 4119) {
                            var5--;
                            String var328 = field945[var5];
                            StringBuilder var329 = new StringBuilder(var328.length());
                            boolean var330 = false;
                            for (int var331 = 0; var331 < var328.length(); var331++) {
                                char var332 = var328.charAt(var331);
                                if (var332 == '<') {
                                    var330 = true;
                                } else if (var332 == '>') {
                                    var330 = false;
                                } else if (!var330) {
                                    var329.append(var332);
                                }
                            }
                            field945[var5++] = var329.toString();
                            continue;
                        }
                        if (var396 == 4120) {
                            var5--;
                            String var333 = field945[var5];
                            var4--;
                            int var334 = field944[var4];
                            field944[var4++] = var333.indexOf(var334);
                            continue;
                        }
                    } else if (var396 < 4300) {
                        if (var396 == 4200) {
                            var4--;
                            int var335 = field944[var4];
                            field945[var5++] = class176.method3351(var335).field2614;
                            continue;
                        }
                        if (var396 == 4201) {
                            var4 -= 2;
                            int var336 = field944[var4];
                            int var337 = field944[var4 + 1];
                            class176 var338 = class176.method3351(var336);
                            if (var337 >= 1 && var337 <= 5 && var338.field2643[var337 - 1] != null) {
                                field945[var5++] = var338.field2643[var337 - 1];
                                continue;
                            }
                            field945[var5++] = "";
                            continue;
                        }
                        if (var396 == 4202) {
                            var4 -= 2;
                            int var339 = field944[var4];
                            int var340 = field944[var4 + 1];
                            class176 var341 = class176.method3351(var339);
                            if (var340 >= 1 && var340 <= 5 && var341.field2613[var340 - 1] != null) {
                                field945[var5++] = var341.field2613[var340 - 1];
                                continue;
                            }
                            field945[var5++] = "";
                            continue;
                        }
                        if (var396 == 4203) {
                            var4--;
                            int var342 = field944[var4];
                            field944[var4++] = class176.method3351(var342).field2636;
                            continue;
                        }
                        if (var396 == 4204) {
                            var4--;
                            int var343 = field944[var4];
                            field944[var4++] = class176.method3351(var343).field2621 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4205) {
                            var4--;
                            int var344 = field944[var4];
                            class176 var345 = class176.method3351(var344);
                            if (var345.field2627 == -1 && var345.field2640 >= 0) {
                                field944[var4++] = var345.field2640;
                                continue;
                            }
                            field944[var4++] = var344;
                            continue;
                        }
                        if (var396 == 4206) {
                            var4--;
                            int var346 = field944[var4];
                            class176 var347 = class176.method3351(var346);
                            if (var347.field2627 >= 0 && var347.field2640 >= 0) {
                                field944[var4++] = var347.field2640;
                                continue;
                            }
                            field944[var4++] = var346;
                            continue;
                        }
                        if (var396 == 4207) {
                            var4--;
                            int var348 = field944[var4];
                            field944[var4++] = class176.method3351(var348).field2610 ? 1 : 0;
                            continue;
                        }
                    } else if (var396 < 5100) {
                        if (var396 == 5000) {
                            field944[var4++] = client.field1699;
                            continue;
                        }
                        if (var396 == 5001) {
                            var4 -= 3;
                            client.field1699 = field944[var4];
                            int var349 = field944[var4 + 1];
                            class64[] var350 = new class64[] { class64.field703, class64.field707, class64.field708 };
                            class64[] var351 = var350;
                            int var352 = 0;
                            class64 var354;
                            while (true) {
                                if (var352 >= var351.length) {
                                    var354 = null;
                                    break;
                                }
                                class64 var353 = var351[var352];
                                if (var353.field705 == var349) {
                                    var354 = var353;
                                    break;
                                }
                                var352++;
                            }
                            Statics.field396 = var354;
                            if (Statics.field396 == null) {
                                Statics.field396 = class64.field708;
                            }
                            client.field1748 = field944[var4 + 2];
                            client.field1570.method653(209);
                            client.field1570.method666(client.field1699);
                            client.field1570.method666(Statics.field396.field705);
                            client.field1570.method666(client.field1748);
                            continue;
                        }
                        if (var396 == 5002) {
                            var5--;
                            String var355 = field945[var5];
                            var4 -= 2;
                            int var356 = field944[var4];
                            int var357 = field944[var4 + 1];
                            client.field1570.method653(254);
                            client.field1570.method666(class50.method2053(var355) + 2);
                            client.field1570.method671(var355);
                            client.field1570.method666(var356 - 1);
                            client.field1570.method666(var357);
                            continue;
                        }
                        if (var396 == 5003) {
                            var4--;
                            int var358 = field944[var4];
                            String var359 = null;
                            if (var358 < 100) {
                                var359 = client.field1668[var358];
                            }
                            if (var359 == null) {
                                var359 = "";
                            }
                            field945[var5++] = var359;
                            continue;
                        }
                        if (var396 == 5004) {
                            var4--;
                            int var360 = field944[var4];
                            int var361 = -1;
                            if (var360 < 100 && client.field1668[var360] != null) {
                                var361 = client.field1741[var360];
                            }
                            field944[var4++] = var361;
                            continue;
                        }
                        if (var396 == 5005) {
                            if (Statics.field396 == null) {
                                field944[var4++] = -1;
                            } else {
                                field944[var4++] = Statics.field396.field705;
                            }
                            continue;
                        }
                        if (var396 == 5008) {
                            var5--;
                            String var362 = field945[var5];
                            if (var362.startsWith("::")) {
                                client.method884(var362);
                                continue;
                            }
                            String var363 = var362.toLowerCase();
                            byte var364 = 0;
                            if (var363.startsWith(class85.field1147)) {
                                var364 = 0;
                                var362 = var362.substring(class85.field1147.length());
                            } else if (var363.startsWith(class85.field1081)) {
                                var364 = 1;
                                var362 = var362.substring(class85.field1081.length());
                            } else if (var363.startsWith(class85.field1151)) {
                                var364 = 2;
                                var362 = var362.substring(class85.field1151.length());
                            } else if (var363.startsWith(class85.field1153)) {
                                var364 = 3;
                                var362 = var362.substring(class85.field1153.length());
                            } else if (var363.startsWith(class85.field1155)) {
                                var364 = 4;
                                var362 = var362.substring(class85.field1155.length());
                            } else if (var363.startsWith(class85.field1157)) {
                                var364 = 5;
                                var362 = var362.substring(class85.field1157.length());
                            } else if (var363.startsWith(class85.field1045)) {
                                var364 = 6;
                                var362 = var362.substring(class85.field1045.length());
                            } else if (var363.startsWith(class85.field1161)) {
                                var364 = 7;
                                var362 = var362.substring(class85.field1161.length());
                            } else if (var363.startsWith(class85.field1074)) {
                                var364 = 8;
                                var362 = var362.substring(class85.field1074.length());
                            } else if (var363.startsWith(class85.field1207)) {
                                var364 = 9;
                                var362 = var362.substring(class85.field1207.length());
                            } else if (var363.startsWith(class85.field1167)) {
                                var364 = 10;
                                var362 = var362.substring(class85.field1167.length());
                            } else if (var363.startsWith(class85.field1000)) {
                                var364 = 11;
                                var362 = var362.substring(class85.field1000.length());
                            } else if (client.field1538 != 0) {
                                if (var363.startsWith(class85.field1089)) {
                                    var364 = 0;
                                    var362 = var362.substring(class85.field1089.length());
                                } else if (var363.startsWith(class85.field1150)) {
                                    var364 = 1;
                                    var362 = var362.substring(class85.field1150.length());
                                } else if (var363.startsWith(class85.field987)) {
                                    var364 = 2;
                                    var362 = var362.substring(class85.field987.length());
                                } else if (var363.startsWith(class85.field1180)) {
                                    var364 = 3;
                                    var362 = var362.substring(class85.field1180.length());
                                } else if (var363.startsWith(class85.field1156)) {
                                    var364 = 4;
                                    var362 = var362.substring(class85.field1156.length());
                                } else if (var363.startsWith(class85.field1158)) {
                                    var364 = 5;
                                    var362 = var362.substring(class85.field1158.length());
                                } else if (var363.startsWith(class85.field1152)) {
                                    var364 = 6;
                                    var362 = var362.substring(class85.field1152.length());
                                } else if (var363.startsWith(class85.field1162)) {
                                    var364 = 7;
                                    var362 = var362.substring(class85.field1162.length());
                                } else if (var363.startsWith(class85.field1115)) {
                                    var364 = 8;
                                    var362 = var362.substring(class85.field1115.length());
                                } else if (var363.startsWith(class85.field1166)) {
                                    var364 = 9;
                                    var362 = var362.substring(class85.field1166.length());
                                } else if (var363.startsWith(class85.field1168)) {
                                    var364 = 10;
                                    var362 = var362.substring(class85.field1168.length());
                                } else if (var363.startsWith(class85.field1170)) {
                                    var364 = 11;
                                    var362 = var362.substring(class85.field1170.length());
                                }
                            }
                            String var365 = var362.toLowerCase();
                            byte var366 = 0;
                            if (var365.startsWith(class85.field1086)) {
                                var366 = 1;
                                var362 = var362.substring(class85.field1086.length());
                            } else if (var365.startsWith(class85.field1165)) {
                                var366 = 2;
                                var362 = var362.substring(class85.field1165.length());
                            } else if (var365.startsWith(class85.field1175)) {
                                var366 = 3;
                                var362 = var362.substring(class85.field1175.length());
                            } else if (var365.startsWith(class85.field1060)) {
                                var366 = 4;
                                var362 = var362.substring(class85.field1060.length());
                            } else if (var365.startsWith(class85.field1179)) {
                                var366 = 5;
                                var362 = var362.substring(class85.field1179.length());
                            } else if (client.field1538 != 0) {
                                if (var365.startsWith(class85.field1032)) {
                                    var366 = 1;
                                    var362 = var362.substring(class85.field1032.length());
                                } else if (var365.startsWith(class85.field1174)) {
                                    var366 = 2;
                                    var362 = var362.substring(class85.field1174.length());
                                } else if (var365.startsWith(class85.field1176)) {
                                    var366 = 3;
                                    var362 = var362.substring(class85.field1176.length());
                                } else if (var365.startsWith(class85.field1178)) {
                                    var366 = 4;
                                    var362 = var362.substring(class85.field1178.length());
                                } else if (var365.startsWith(class85.field1163)) {
                                    var366 = 5;
                                    var362 = var362.substring(class85.field1163.length());
                                }
                            }
                            client.field1570.method653(164);
                            client.field1570.method666(0);
                            int var367 = client.field1570.field540;
                            client.field1570.method666(var364);
                            client.field1570.method666(var366);
                            class49 var368 = client.field1570;
                            int var369 = var368.field540;
                            int var370 = var362.length();
                            byte[] var371 = new byte[var370];
                            for (int var372 = 0; var372 < var370; var372++) {
                                char var373 = var362.charAt(var372);
                                if (var373 > 0 && var373 < 128 || var373 >= 160 && var373 <= 255) {
                                    var371[var372] = (byte) var373;
                                } else if (var373 == 8364) {
                                    var371[var372] = -128;
                                } else if (var373 == 8218) {
                                    var371[var372] = -126;
                                } else if (var373 == 402) {
                                    var371[var372] = -125;
                                } else if (var373 == 8222) {
                                    var371[var372] = -124;
                                } else if (var373 == 8230) {
                                    var371[var372] = -123;
                                } else if (var373 == 8224) {
                                    var371[var372] = -122;
                                } else if (var373 == 8225) {
                                    var371[var372] = -121;
                                } else if (var373 == 710) {
                                    var371[var372] = -120;
                                } else if (var373 == 8240) {
                                    var371[var372] = -119;
                                } else if (var373 == 352) {
                                    var371[var372] = -118;
                                } else if (var373 == 8249) {
                                    var371[var372] = -117;
                                } else if (var373 == 338) {
                                    var371[var372] = -116;
                                } else if (var373 == 381) {
                                    var371[var372] = -114;
                                } else if (var373 == 8216) {
                                    var371[var372] = -111;
                                } else if (var373 == 8217) {
                                    var371[var372] = -110;
                                } else if (var373 == 8220) {
                                    var371[var372] = -109;
                                } else if (var373 == 8221) {
                                    var371[var372] = -108;
                                } else if (var373 == 8226) {
                                    var371[var372] = -107;
                                } else if (var373 == 8211) {
                                    var371[var372] = -106;
                                } else if (var373 == 8212) {
                                    var371[var372] = -105;
                                } else if (var373 == 732) {
                                    var371[var372] = -104;
                                } else if (var373 == 8482) {
                                    var371[var372] = -103;
                                } else if (var373 == 353) {
                                    var371[var372] = -102;
                                } else if (var373 == 8250) {
                                    var371[var372] = -101;
                                } else if (var373 == 339) {
                                    var371[var372] = -100;
                                } else if (var373 == 382) {
                                    var371[var372] = -98;
                                } else if (var373 == 376) {
                                    var371[var372] = -97;
                                } else {
                                    var371[var372] = 63;
                                }
                            }
                            var368.method678(var371.length);
                            var368.field540 += Statics.field236.method2318(var371, 0, var371.length, var368.field541, var368.field540);
                            client.field1570.method677(client.field1570.field540 - var367);
                            continue;
                        }
                        if (var396 == 5009) {
                            var5 -= 2;
                            String var376 = field945[var5];
                            String var377 = field945[var5 + 1];
                            client.field1570.method653(202);
                            client.field1570.method667(0);
                            int var378 = client.field1570.field540;
                            client.field1570.method671(var376);
                            class49 var379 = client.field1570;
                            int var380 = var379.field540;
                            int var381 = var377.length();
                            byte[] var382 = new byte[var381];
                            for (int var383 = 0; var383 < var381; var383++) {
                                char var384 = var377.charAt(var383);
                                if (var384 > 0 && var384 < 128 || var384 >= 160 && var384 <= 255) {
                                    var382[var383] = (byte) var384;
                                } else if (var384 == 8364) {
                                    var382[var383] = -128;
                                } else if (var384 == 8218) {
                                    var382[var383] = -126;
                                } else if (var384 == 402) {
                                    var382[var383] = -125;
                                } else if (var384 == 8222) {
                                    var382[var383] = -124;
                                } else if (var384 == 8230) {
                                    var382[var383] = -123;
                                } else if (var384 == 8224) {
                                    var382[var383] = -122;
                                } else if (var384 == 8225) {
                                    var382[var383] = -121;
                                } else if (var384 == 710) {
                                    var382[var383] = -120;
                                } else if (var384 == 8240) {
                                    var382[var383] = -119;
                                } else if (var384 == 352) {
                                    var382[var383] = -118;
                                } else if (var384 == 8249) {
                                    var382[var383] = -117;
                                } else if (var384 == 338) {
                                    var382[var383] = -116;
                                } else if (var384 == 381) {
                                    var382[var383] = -114;
                                } else if (var384 == 8216) {
                                    var382[var383] = -111;
                                } else if (var384 == 8217) {
                                    var382[var383] = -110;
                                } else if (var384 == 8220) {
                                    var382[var383] = -109;
                                } else if (var384 == 8221) {
                                    var382[var383] = -108;
                                } else if (var384 == 8226) {
                                    var382[var383] = -107;
                                } else if (var384 == 8211) {
                                    var382[var383] = -106;
                                } else if (var384 == 8212) {
                                    var382[var383] = -105;
                                } else if (var384 == 732) {
                                    var382[var383] = -104;
                                } else if (var384 == 8482) {
                                    var382[var383] = -103;
                                } else if (var384 == 353) {
                                    var382[var383] = -102;
                                } else if (var384 == 8250) {
                                    var382[var383] = -101;
                                } else if (var384 == 339) {
                                    var382[var383] = -100;
                                } else if (var384 == 382) {
                                    var382[var383] = -98;
                                } else if (var384 == 376) {
                                    var382[var383] = -97;
                                } else {
                                    var382[var383] = 63;
                                }
                            }
                            var379.method678(var382.length);
                            var379.field540 += Statics.field236.method2318(var382, 0, var382.length, var379.field541, var379.field540);
                            client.field1570.method676(client.field1570.field540 - var378);
                            continue;
                        }
                        if (var396 == 5010) {
                            var4--;
                            int var387 = field944[var4];
                            String var388 = null;
                            if (var387 < 100) {
                                var388 = client.field1737[var387];
                            }
                            if (var388 == null) {
                                var388 = "";
                            }
                            field945[var5++] = var388;
                            continue;
                        }
                        if (var396 == 5011) {
                            var4--;
                            int var389 = field944[var4];
                            String var390 = null;
                            if (var389 < 100) {
                                var390 = client.field1743[var389];
                            }
                            if (var390 == null) {
                                var390 = "";
                            }
                            field945[var5++] = var390;
                            continue;
                        }
                        if (var396 == 5015) {
                            String var391;
                            if (Statics.field1320 == null || Statics.field1320.field855 == null) {
                                var391 = "";
                            } else {
                                var391 = Statics.field1320.field855;
                            }
                            field945[var5++] = var391;
                            continue;
                        }
                        if (var396 == 5016) {
                            field944[var4++] = client.field1748;
                            continue;
                        }
                        if (var396 == 5017) {
                            field944[var4++] = client.field1745;
                            continue;
                        }
                    }
                } else {
                    class12 var73;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var4--;
                        var73 = class12.method2369(field944[var4]);
                    } else {
                        var73 = var50 ? Statics.field948 : Statics.field882;
                    }
                    if (var396 == 1300) {
                        var4--;
                        int var74 = field944[var4] - 1;
                        if (var74 >= 0 && var74 <= 9) {
                            var5--;
                            var73.method123(var74, field945[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var396 == 1301) {
                        var4 -= 2;
                        int var75 = field944[var4];
                        int var76 = field944[var4 + 1];
                        var73.field141 = class12.method2328(var75, var76);
                        continue;
                    }
                    if (var396 == 1302) {
                        var4--;
                        var73.field104 = field944[var4] == 1;
                        continue;
                    }
                    if (var396 == 1303) {
                        var4--;
                        var73.field175 = field944[var4];
                        continue;
                    }
                    if (var396 == 1304) {
                        var4--;
                        var73.field143 = field944[var4];
                        continue;
                    }
                    if (var396 == 1305) {
                        var5--;
                        var73.field139 = field945[var5];
                        continue;
                    }
                    if (var396 == 1306) {
                        var5--;
                        var73.field145 = field945[var5];
                        continue;
                    }
                    if (var396 == 1307) {
                        var73.field140 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var395) {
            StringBuilder var393 = new StringBuilder(30);
            var393.append("").append(var3.field213).append(" ");
            for (int var394 = field942 - 1; var394 >= 0; var394--) {
                var393.append("").append(field947[var394].field1282.field213).append(" ");
            }
            var393.append("").append(var9);
            class136.method1127(var393.toString(), var395);
        }
    }

    @ObfuscatedName("bs.h(II)V")
    public static void method2051(int arg0) {
        if (arg0 == -1 || !class12.method536(arg0)) {
            return;
        }
        class12[] var1 = Statics.field173[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class12 var3 = var1[var2];
            if (var3.field130 != null) {
                class61 var4 = new class61();
                var4.field662 = var3;
                var4.field664 = var3.field130;
                method1110(var4);
            }
        }
    }
}
