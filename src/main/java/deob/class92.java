package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("q")
public class class92 {

    @ObfuscatedName("q.d")
    public static int field1301 = 0;

    @ObfuscatedName("q.a")
    public static Calendar field1305 = Calendar.getInstance();

    @ObfuscatedName("q.m")
    public static int[][] field1299 = new int[5][5000];

    @ObfuscatedName("q.j")
    public static class88[] field1303 = new class88[50];

    @ObfuscatedName("q.i")
    public static int[] field1298 = new int[5];

    @ObfuscatedName("q.u")
    public static final String[] field1302 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("q.z")
    public static int[] field1300 = new int[1000];

    @ObfuscatedName("q.x")
    public static String[] field1311 = new String[1000];

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.c(II)V")
    public static void method737(int arg0) {
        if (arg0 == -1 || !class17.method856(arg0)) {
            return;
        }
        class17[] var1 = Statics.field116[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class17 var3 = var1[var2];
            if (var3.field171 != null) {
                class82 var4 = new class82();
                var4.field1148 = var3;
                var4.field1158 = var3.field171;
                method3230(var4);
            }
        }
    }

    @ObfuscatedName("am.v(Lv;I)V")
    public static void method3230(class82 arg0) {
        Object[] var1 = arg0.field1158;
        int var2 = (Integer) var1[0];
        class70 var3 = class70.method121(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field1016;
        int[] var8 = var3.field1017;
        byte var9 = -1;
        field1301 = 0;
        try {
            Statics.field1306 = new int[var3.field1019];
            int var10 = 0;
            Statics.field1297 = new String[var3.field1015];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field1157;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field1150;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field1148 == null ? -1 : arg0.field1148.field167;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field1161;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field1148 == null ? -1 : arg0.field1148.field113;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field1147 == null ? -1 : arg0.field1147.field167;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field1147 == null ? -1 : arg0.field1147.field113;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field1153;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field1154;
                    }
                    Statics.field1306[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field1152;
                    }
                    Statics.field1297[var11++] = var14;
                }
            }
            int var15 = 0;
            label2306: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var331 = var7[var6];
                if (var331 < 100) {
                    if (var331 == 0) {
                        field1300[var4++] = var8[var6];
                        continue;
                    }
                    if (var331 == 1) {
                        int var16 = var8[var6];
                        field1300[var4++] = class1.field4[var16];
                        continue;
                    }
                    if (var331 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class1.field4[var17] = field1300[var4];
                        client.method3055(var17);
                        continue;
                    }
                    if (var331 == 3) {
                        field1311[var5++] = var3.field1027[var6];
                        continue;
                    }
                    if (var331 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var331 == 7) {
                        var4 -= 2;
                        if (field1300[var4 + 1] != field1300[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var331 == 8) {
                        var4 -= 2;
                        if (field1300[var4 + 1] == field1300[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var331 == 9) {
                        var4 -= 2;
                        if (field1300[var4] < field1300[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var331 == 10) {
                        var4 -= 2;
                        if (field1300[var4] > field1300[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var331 == 21) {
                        if (field1301 == 0) {
                            return;
                        }
                        class88 var18 = field1303[--field1301];
                        var3 = var18.field1269;
                        var7 = var3.field1016;
                        var8 = var3.field1017;
                        var6 = var18.field1258;
                        Statics.field1306 = var18.field1259;
                        Statics.field1297 = var18.field1260;
                        continue;
                    }
                    if (var331 == 25) {
                        int var19 = var8[var6];
                        field1300[var4++] = class1.method945(var19);
                        continue;
                    }
                    if (var331 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class1.method730(var20, field1300[var4]);
                        continue;
                    }
                    if (var331 == 31) {
                        var4 -= 2;
                        if (field1300[var4] <= field1300[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var331 == 32) {
                        var4 -= 2;
                        if (field1300[var4] >= field1300[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var331 == 33) {
                        field1300[var4++] = Statics.field1306[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var331 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field1306[var10001] = field1300[var4];
                        continue;
                    }
                    if (var331 == 35) {
                        field1311[var5++] = Statics.field1297[var8[var6]];
                        continue;
                    }
                    if (var331 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field1297[var10001] = field1311[var5];
                        continue;
                    }
                    if (var331 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String var22 = class97.method1260(field1311, var5, var21);
                        field1311[var5++] = var22;
                        continue;
                    }
                    if (var331 == 38) {
                        var4--;
                        continue;
                    }
                    if (var331 == 39) {
                        var5--;
                        continue;
                    }
                    if (var331 == 40) {
                        int var23 = var8[var6];
                        class70 var24 = class70.method121(var23);
                        int[] var25 = new int[var24.field1019];
                        String[] var26 = new String[var24.field1015];
                        for (int var27 = 0; var27 < var24.field1021; var27++) {
                            var25[var27] = field1300[var4 - var24.field1021 + var27];
                        }
                        for (int var28 = 0; var28 < var24.field1023; var28++) {
                            var26[var28] = field1311[var5 - var24.field1023 + var28];
                        }
                        var4 -= var24.field1021;
                        var5 -= var24.field1023;
                        class88 var29 = new class88();
                        var29.field1269 = var3;
                        var29.field1258 = var6;
                        var29.field1259 = Statics.field1306;
                        var29.field1260 = Statics.field1297;
                        field1303[++field1301 - 1] = var29;
                        var3 = var24;
                        var7 = var24.field1016;
                        var8 = var24.field1017;
                        var6 = -1;
                        Statics.field1306 = var25;
                        Statics.field1297 = var26;
                        continue;
                    }
                    if (var331 == 42) {
                        field1300[var4++] = client.field1657[var8[var6]];
                        continue;
                    }
                    if (var331 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field1657[var10001] = field1300[var4];
                        continue;
                    }
                    if (var331 == 44) {
                        int var30 = var8[var6] >> 16;
                        int var31 = var8[var6] & 0xFFFF;
                        var4--;
                        int var32 = field1300[var4];
                        if (var32 >= 0 && var32 <= 5000) {
                            field1298[var30] = var32;
                            byte var33 = -1;
                            if (var31 == 105) {
                                var33 = 0;
                            }
                            int var34 = 0;
                            while (true) {
                                if (var34 >= var32) {
                                    continue label2306;
                                }
                                field1299[var30][var34] = var33;
                                var34++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var331 == 45) {
                        int var35 = var8[var6];
                        var4--;
                        int var36 = field1300[var4];
                        if (var36 >= 0 && var36 < field1298[var35]) {
                            field1300[var4++] = field1299[var35][var36];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var331 == 46) {
                        int var37 = var8[var6];
                        var4 -= 2;
                        int var38 = field1300[var4];
                        if (var38 >= 0 && var38 < field1298[var37]) {
                            field1299[var37][var38] = field1300[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var331 == 47) {
                        String var39 = client.field1477[var8[var6]];
                        if (var39 == null) {
                            var39 = "null";
                        }
                        field1311[var5++] = var39;
                        continue;
                    }
                    if (var331 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field1477[var10001] = field1311[var5];
                        continue;
                    }
                }
                boolean var40;
                if (var8[var6] == 1) {
                    var40 = true;
                } else {
                    var40 = false;
                }
                if (var331 < 1000) {
                    if (var331 == 100) {
                        var4 -= 3;
                        int var41 = field1300[var4];
                        int var42 = field1300[var4 + 1];
                        int var43 = field1300[var4 + 2];
                        if (var42 == 0) {
                            throw new RuntimeException();
                        }
                        class17 var44 = class17.method865(var41);
                        if (var44.field220 == null) {
                            var44.field220 = new class17[var43 + 1];
                        }
                        if (var44.field220.length <= var43) {
                            class17[] var45 = new class17[var43 + 1];
                            for (int var46 = 0; var46 < var44.field220.length; var46++) {
                                var45[var46] = var44.field220[var46];
                            }
                            var44.field220 = var45;
                        }
                        if (var43 > 0 && var44.field220[var43 - 1] == null) {
                            throw new RuntimeException("" + (var43 - 1));
                        }
                        class17 var47 = new class17();
                        var47.field114 = var42;
                        var47.field123 = var47.field167 = var44.field167;
                        var47.field113 = var43;
                        var47.field111 = true;
                        var44.field220[var43] = var47;
                        if (var40) {
                            Statics.field1304 = var47;
                        } else {
                            Statics.field391 = var47;
                        }
                        client.method854(var44);
                        continue;
                    }
                    if (var331 == 101) {
                        class17 var48 = var40 ? Statics.field1304 : Statics.field391;
                        class17 var49 = class17.method865(var48.field167);
                        var49.field220[var48.field113] = null;
                        client.method854(var49);
                        continue;
                    }
                    if (var331 == 102) {
                        var4--;
                        class17 var50 = class17.method865(field1300[var4]);
                        var50.field220 = null;
                        client.method854(var50);
                        continue;
                    }
                    if (var331 == 200) {
                        var4 -= 2;
                        int var51 = field1300[var4];
                        int var52 = field1300[var4 + 1];
                        class17 var53 = class17.method3203(var51, var52);
                        if (var53 != null && var52 != -1) {
                            field1300[var4++] = 1;
                            if (var40) {
                                Statics.field1304 = var53;
                            } else {
                                Statics.field391 = var53;
                            }
                            continue;
                        }
                        field1300[var4++] = 0;
                        continue;
                    }
                } else if (var331 >= 1000 && var331 < 1100 || var331 >= 2000 && var331 < 2100) {
                    class17 var54;
                    if (var331 >= 2000) {
                        var331 -= 1000;
                        var4--;
                        var54 = class17.method865(field1300[var4]);
                    } else {
                        var54 = var40 ? Statics.field1304 : Statics.field391;
                    }
                    if (var331 == 1000) {
                        var4 -= 2;
                        var54.field117 = field1300[var4];
                        var54.field180 = field1300[var4 + 1];
                        client.method854(var54);
                        continue;
                    }
                    if (var331 == 1001) {
                        var4 -= 2;
                        var54.field121 = field1300[var4];
                        var54.field122 = field1300[var4 + 1];
                        client.method854(var54);
                        continue;
                    }
                    if (var331 == 1003) {
                        var4--;
                        boolean var55 = field1300[var4] == 1;
                        if (var54.field182 != var55) {
                            var54.field182 = var55;
                            client.method854(var54);
                        }
                        continue;
                    }
                } else if (!(var331 < 1100 || var331 >= 1200) || !(var331 < 2100 || var331 >= 2200)) {
                    class17 var56;
                    if (var331 >= 2000) {
                        var331 -= 1000;
                        var4--;
                        var56 = class17.method865(field1300[var4]);
                    } else {
                        var56 = var40 ? Statics.field1304 : Statics.field391;
                    }
                    if (var331 == 1100) {
                        var4 -= 2;
                        var56.field125 = field1300[var4];
                        if (var56.field125 > var56.field202 - var56.field121) {
                            var56.field125 = var56.field202 - var56.field121;
                        }
                        if (var56.field125 < 0) {
                            var56.field125 = 0;
                        }
                        var56.field126 = field1300[var4 + 1];
                        if (var56.field126 > var56.field128 - var56.field122) {
                            var56.field126 = var56.field128 - var56.field122;
                        }
                        if (var56.field126 < 0) {
                            var56.field126 = 0;
                        }
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1101) {
                        var4--;
                        var56.field129 = field1300[var4];
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1102) {
                        var4--;
                        var56.field133 = field1300[var4] == 1;
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1103) {
                        var4--;
                        var56.field144 = field1300[var4];
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1104) {
                        var4--;
                        var56.field135 = field1300[var4];
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1105) {
                        var4--;
                        var56.field136 = field1300[var4];
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1106) {
                        var4--;
                        var56.field138 = field1300[var4];
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1107) {
                        var4--;
                        var56.field139 = field1300[var4] == 1;
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1108) {
                        var56.field134 = 1;
                        var4--;
                        var56.field145 = field1300[var4];
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1109) {
                        var4 -= 6;
                        var56.field189 = field1300[var4];
                        var56.field151 = field1300[var4 + 1];
                        var56.field159 = field1300[var4 + 2];
                        var56.field153 = field1300[var4 + 3];
                        var56.field154 = field1300[var4 + 4];
                        var56.field155 = field1300[var4 + 5];
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1110) {
                        var4--;
                        int var57 = field1300[var4];
                        if (var56.field141 != var57) {
                            var56.field141 = var57;
                            var56.field218 = 0;
                            var56.field219 = 0;
                            client.method854(var56);
                        }
                        continue;
                    }
                    if (var331 == 1111) {
                        var4--;
                        var56.field170 = field1300[var4] == 1;
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1112) {
                        var5--;
                        String var58 = field1311[var5];
                        if (!var58.equals(var56.field205)) {
                            var56.field205 = var58;
                            client.method854(var56);
                        }
                        continue;
                    }
                    if (var331 == 1113) {
                        var4--;
                        var56.field158 = field1300[var4];
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1114) {
                        var4 -= 3;
                        var56.field115 = field1300[var4];
                        var56.field163 = field1300[var4 + 1];
                        var56.field143 = field1300[var4 + 2];
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1115) {
                        var4--;
                        var56.field164 = field1300[var4] == 1;
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1116) {
                        var4--;
                        var56.field196 = field1300[var4];
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1117) {
                        var4--;
                        var56.field124 = field1300[var4];
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1118) {
                        var4--;
                        var56.field226 = field1300[var4] == 1;
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1119) {
                        var4--;
                        var56.field186 = field1300[var4] == 1;
                        client.method854(var56);
                        continue;
                    }
                    if (var331 == 1120) {
                        var4 -= 2;
                        var56.field202 = field1300[var4];
                        var56.field128 = field1300[var4 + 1];
                        client.method854(var56);
                        continue;
                    }
                } else if (!(var331 < 1200 || var331 >= 1300) || !(var331 < 2200 || var331 >= 2300)) {
                    class17 var59;
                    if (var331 >= 2000) {
                        var331 -= 1000;
                        var4--;
                        var59 = class17.method865(field1300[var4]);
                    } else {
                        var59 = var40 ? Statics.field1304 : Statics.field391;
                    }
                    client.method854(var59);
                    if (var331 == 1200) {
                        var4 -= 2;
                        int var60 = field1300[var4];
                        int var61 = field1300[var4 + 1];
                        var59.field216 = var60;
                        var59.field217 = var61;
                        class172 var62 = class172.method934(var60);
                        var59.field159 = var62.field2634;
                        var59.field153 = var62.field2615;
                        var59.field154 = var62.field2617;
                        var59.field189 = var62.field2614;
                        var59.field151 = var62.field2618;
                        var59.field155 = var62.field2616;
                        if (var59.field121 > 0) {
                            var59.field155 = var59.field155 * 32 / var59.field121;
                        }
                        continue;
                    }
                    if (var331 == 1201) {
                        var59.field134 = 2;
                        var4--;
                        var59.field145 = field1300[var4];
                        continue;
                    }
                    if (var331 == 1202) {
                        var59.field134 = 3;
                        var59.field145 = Statics.field1393.field911.method1045();
                        continue;
                    }
                } else if ((var331 < 1300 || var331 >= 1400) && (var331 < 2300 || var331 >= 2400)) {
                    if (var331 >= 1400 && var331 < 1500 || var331 >= 2400 && var331 < 2500) {
                        class17 var67;
                        if (var331 >= 2000) {
                            var331 -= 1000;
                            var4--;
                            var67 = class17.method865(field1300[var4]);
                        } else {
                            var67 = var40 ? Statics.field1304 : Statics.field391;
                        }
                        var5--;
                        String var68 = field1311[var5];
                        int[] var69 = null;
                        if (var68.length() > 0 && var68.charAt(var68.length() - 1) == 'Y') {
                            var4--;
                            int var70 = field1300[var4];
                            if (var70 > 0) {
                                var69 = new int[var70];
                                while (var70-- > 0) {
                                    var4--;
                                    var69[var70] = field1300[var4];
                                }
                            }
                            var68 = var68.substring(0, var68.length() - 1);
                        }
                        Object[] var71 = new Object[var68.length() + 1];
                        for (int var72 = var71.length - 1; var72 >= 1; var72--) {
                            if (var68.charAt(var72 - 1) == 's') {
                                var5--;
                                var71[var72] = field1311[var5];
                            } else {
                                var4--;
                                var71[var72] = Integer.valueOf(field1300[var4]);
                            }
                        }
                        var4--;
                        int var73 = field1300[var4];
                        if (var73 == -1) {
                            var71 = null;
                        } else {
                            var71[0] = Integer.valueOf(var73);
                        }
                        if (var331 == 1400) {
                            var67.field181 = var71;
                        }
                        if (var331 == 1401) {
                            var67.field184 = var71;
                        }
                        if (var331 == 1402) {
                            var67.field213 = var71;
                        }
                        if (var331 == 1403) {
                            var67.field185 = var71;
                        }
                        if (var331 == 1404) {
                            var67.field127 = var71;
                        }
                        if (var331 == 1405) {
                            var67.field188 = var71;
                        }
                        if (var331 == 1406) {
                            var67.field191 = var71;
                        }
                        if (var331 == 1407) {
                            var67.field192 = var71;
                            var67.field193 = var69;
                        }
                        if (var331 == 1408) {
                            var67.field198 = var71;
                        }
                        if (var331 == 1409) {
                            var67.field152 = var71;
                        }
                        if (var331 == 1410) {
                            var67.field157 = var71;
                        }
                        if (var331 == 1411) {
                            var67.field199 = var71;
                        }
                        if (var331 == 1412) {
                            var67.field150 = var71;
                        }
                        if (var331 == 1414) {
                            var67.field194 = var71;
                            var67.field195 = var69;
                        }
                        if (var331 == 1415) {
                            var67.field197 = var71;
                            var67.field161 = var69;
                        }
                        if (var331 == 1416) {
                            var67.field190 = var71;
                        }
                        if (var331 == 1417) {
                            var67.field200 = var71;
                        }
                        if (var331 == 1418) {
                            var67.field148 = var71;
                        }
                        if (var331 == 1419) {
                            var67.field187 = var71;
                        }
                        if (var331 == 1420) {
                            var67.field165 = var71;
                        }
                        if (var331 == 1421) {
                            var67.field204 = var71;
                        }
                        if (var331 == 1422) {
                            var67.field110 = var71;
                        }
                        if (var331 == 1423) {
                            var67.field206 = var71;
                        }
                        if (var331 == 1424) {
                            var67.field207 = var71;
                        }
                        var67.field179 = true;
                        continue;
                    }
                    if (var331 < 1600) {
                        class17 var74 = var40 ? Statics.field1304 : Statics.field391;
                        if (var331 == 1500) {
                            field1300[var4++] = var74.field117;
                            continue;
                        }
                        if (var331 == 1501) {
                            field1300[var4++] = var74.field180;
                            continue;
                        }
                        if (var331 == 1502) {
                            field1300[var4++] = var74.field121;
                            continue;
                        }
                        if (var331 == 1503) {
                            field1300[var4++] = var74.field122;
                            continue;
                        }
                        if (var331 == 1504) {
                            field1300[var4++] = var74.field182 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 1505) {
                            field1300[var4++] = var74.field123;
                            continue;
                        }
                    } else if (var331 < 1700) {
                        class17 var75 = var40 ? Statics.field1304 : Statics.field391;
                        if (var331 == 1600) {
                            field1300[var4++] = var75.field125;
                            continue;
                        }
                        if (var331 == 1601) {
                            field1300[var4++] = var75.field126;
                            continue;
                        }
                        if (var331 == 1602) {
                            field1311[var5++] = var75.field205;
                            continue;
                        }
                        if (var331 == 1603) {
                            field1300[var4++] = var75.field202;
                            continue;
                        }
                        if (var331 == 1604) {
                            field1300[var4++] = var75.field128;
                            continue;
                        }
                        if (var331 == 1605) {
                            field1300[var4++] = var75.field155;
                            continue;
                        }
                        if (var331 == 1606) {
                            field1300[var4++] = var75.field159;
                            continue;
                        }
                        if (var331 == 1607) {
                            field1300[var4++] = var75.field154;
                            continue;
                        }
                        if (var331 == 1608) {
                            field1300[var4++] = var75.field153;
                            continue;
                        }
                    } else if (var331 < 1800) {
                        class17 var76 = var40 ? Statics.field1304 : Statics.field391;
                        if (var331 == 1700) {
                            field1300[var4++] = var76.field216;
                            continue;
                        }
                        if (var331 == 1701) {
                            if (var76.field216 == -1) {
                                field1300[var4++] = 0;
                            } else {
                                field1300[var4++] = var76.field217;
                            }
                            continue;
                        }
                        if (var331 == 1702) {
                            field1300[var4++] = var76.field113;
                            continue;
                        }
                    } else if (var331 < 1900) {
                        class17 var77 = var40 ? Statics.field1304 : Statics.field391;
                        if (var331 == 1800) {
                            field1300[var4++] = class12.method2632(client.method1362(var77));
                            continue;
                        }
                        if (var331 == 1801) {
                            var4--;
                            int var78 = field1300[var4];
                            int var332 = var78 - 1;
                            if (var77.field173 != null && var332 < var77.field173.length && var77.field173[var332] != null) {
                                field1311[var5++] = var77.field173[var332];
                                continue;
                            }
                            field1311[var5++] = "";
                            continue;
                        }
                        if (var331 == 1802) {
                            if (var77.field172 == null) {
                                field1311[var5++] = "";
                            } else {
                                field1311[var5++] = var77.field172;
                            }
                            continue;
                        }
                    } else if (var331 < 2600) {
                        var4--;
                        class17 var79 = class17.method865(field1300[var4]);
                        if (var331 == 2500) {
                            field1300[var4++] = var79.field117;
                            continue;
                        }
                        if (var331 == 2501) {
                            field1300[var4++] = var79.field180;
                            continue;
                        }
                        if (var331 == 2502) {
                            field1300[var4++] = var79.field121;
                            continue;
                        }
                        if (var331 == 2503) {
                            field1300[var4++] = var79.field122;
                            continue;
                        }
                        if (var331 == 2504) {
                            field1300[var4++] = var79.field182 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 2505) {
                            field1300[var4++] = var79.field123;
                            continue;
                        }
                    } else if (var331 < 2700) {
                        var4--;
                        class17 var80 = class17.method865(field1300[var4]);
                        if (var331 == 2600) {
                            field1300[var4++] = var80.field125;
                            continue;
                        }
                        if (var331 == 2601) {
                            field1300[var4++] = var80.field126;
                            continue;
                        }
                        if (var331 == 2602) {
                            field1311[var5++] = var80.field205;
                            continue;
                        }
                        if (var331 == 2603) {
                            field1300[var4++] = var80.field202;
                            continue;
                        }
                        if (var331 == 2604) {
                            field1300[var4++] = var80.field128;
                            continue;
                        }
                        if (var331 == 2605) {
                            field1300[var4++] = var80.field155;
                            continue;
                        }
                        if (var331 == 2606) {
                            field1300[var4++] = var80.field159;
                            continue;
                        }
                        if (var331 == 2607) {
                            field1300[var4++] = var80.field154;
                            continue;
                        }
                        if (var331 == 2608) {
                            field1300[var4++] = var80.field153;
                            continue;
                        }
                    } else if (var331 < 2800) {
                        if (var331 == 2700) {
                            var4--;
                            class17 var81 = class17.method865(field1300[var4]);
                            field1300[var4++] = var81.field216;
                            continue;
                        }
                        if (var331 == 2701) {
                            var4--;
                            class17 var82 = class17.method865(field1300[var4]);
                            if (var82.field216 == -1) {
                                field1300[var4++] = 0;
                            } else {
                                field1300[var4++] = var82.field217;
                            }
                            continue;
                        }
                        if (var331 == 2702) {
                            var4--;
                            int var83 = field1300[var4];
                            class78 var84 = (class78) client.field1505.method8((long) var83);
                            if (var84 == null) {
                                field1300[var4++] = 0;
                            } else {
                                field1300[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var331 < 2900) {
                        var4--;
                        class17 var85 = class17.method865(field1300[var4]);
                        if (var331 == 2800) {
                            field1300[var4++] = class12.method2632(client.method1362(var85));
                            continue;
                        }
                        if (var331 == 2801) {
                            var4--;
                            int var86 = field1300[var4];
                            int var333 = var86 - 1;
                            if (var85.field173 != null && var333 < var85.field173.length && var85.field173[var333] != null) {
                                field1311[var5++] = var85.field173[var333];
                                continue;
                            }
                            field1311[var5++] = "";
                            continue;
                        }
                        if (var331 == 2802) {
                            if (var85.field172 == null) {
                                field1311[var5++] = "";
                            } else {
                                field1311[var5++] = var85.field172;
                            }
                            continue;
                        }
                    } else if (var331 < 3200) {
                        if (var331 == 3100) {
                            var5--;
                            String var87 = field1311[var5];
                            client.method1199(0, "", var87);
                            continue;
                        }
                        if (var331 == 3101) {
                            var4 -= 2;
                            Statics.method898(Statics.field1393, field1300[var4], field1300[var4 + 1]);
                            continue;
                        }
                        if (var331 == 3103) {
                            client.method3135();
                            continue;
                        }
                        if (var331 == 3104) {
                            var5--;
                            String var88 = field1311[var5];
                            int var89 = 0;
                            if (class97.method3043(var88)) {
                                var89 = class97.method2271(var88);
                            }
                            client.field1695.method746(53);
                            client.field1695.method302(var89);
                            continue;
                        }
                        if (var331 == 3105) {
                            var5--;
                            String var90 = field1311[var5];
                            client.field1695.method746(171);
                            client.field1695.method443(var90.length() + 1);
                            client.field1695.method303(var90);
                            continue;
                        }
                        if (var331 == 3106) {
                            var5--;
                            String var91 = field1311[var5];
                            client.field1695.method746(220);
                            client.field1695.method443(var91.length() + 1);
                            client.field1695.method303(var91);
                            continue;
                        }
                        if (var331 == 3107) {
                            var4--;
                            int var92 = field1300[var4];
                            var5--;
                            String var93 = field1311[var5];
                            boolean var94 = false;
                            for (int var95 = 0; var95 < client.field1584; var95++) {
                                class61 var96 = client.field1583[client.field1525[var95]];
                                if (var96 != null && var96.field918 != null && var96.field918.equalsIgnoreCase(var93)) {
                                    client.method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var96.field2503[0], var96.field2507[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var92 == 1) {
                                        client.field1695.method746(159);
                                        client.field1695.method342(client.field1525[var95]);
                                    } else if (var92 == 4) {
                                        client.field1695.method746(148);
                                        client.field1695.method343(client.field1525[var95]);
                                    } else if (var92 == 6) {
                                        client.field1695.method746(88);
                                        client.field1695.method341(client.field1525[var95]);
                                    } else if (var92 == 7) {
                                        client.field1695.method746(193);
                                        client.field1695.method341(client.field1525[var95]);
                                    }
                                    var94 = true;
                                    break;
                                }
                            }
                            if (!var94) {
                                client.method1199(0, "", class57.field739 + var93);
                            }
                            continue;
                        }
                        if (var331 == 3108) {
                            var4 -= 3;
                            int var97 = field1300[var4];
                            int var98 = field1300[var4 + 1];
                            int var99 = field1300[var4 + 2];
                            class17 var100 = class17.method865(var99);
                            client.method1222(var100, var97, var98);
                            continue;
                        }
                        if (var331 == 3109) {
                            var4 -= 2;
                            int var101 = field1300[var4];
                            int var102 = field1300[var4 + 1];
                            class17 var103 = var40 ? Statics.field1304 : Statics.field391;
                            client.method1222(var103, var101, var102);
                            continue;
                        }
                    } else if (var331 < 3300) {
                        if (var331 == 3200) {
                            var4 -= 3;
                            client.method1093(field1300[var4], field1300[var4 + 1], field1300[var4 + 2]);
                            continue;
                        }
                        if (var331 == 3201) {
                            var4--;
                            int var104 = field1300[var4];
                            if (var104 == -1 && !client.field1700) {
                                Statics.field1383.method587();
                                class101.field1381 = 1;
                                Statics.field1384 = null;
                            } else if (var104 != -1 && client.field1699 != var104 && client.field1698 != 0 && !client.field1700) {
                                class83 var105 = Statics.field888;
                                int var106 = client.field1698;
                                class101.field1381 = 1;
                                Statics.field1384 = var105;
                                Statics.field1385 = var104;
                                Statics.field1394 = 0;
                                Statics.field1801 = var106;
                                Statics.field2356 = false;
                                Statics.field1388 = 2;
                            }
                            client.field1699 = var104;
                            continue;
                        }
                        if (var331 == 3202) {
                            var4 -= 2;
                            int var107 = field1300[var4];
                            int var10000 = field1300[var4 + 1];
                            if (client.field1698 != 0 && var107 != -1) {
                                class101.method1488(Statics.field1114, var107, 0, client.field1698, false);
                                client.field1700 = true;
                            }
                            continue;
                        }
                    } else if (var331 < 3400) {
                        if (var331 == 3300) {
                            field1300[var4++] = client.field1468;
                            continue;
                        }
                        if (var331 == 3301) {
                            var4 -= 2;
                            int var109 = field1300[var4];
                            int var110 = field1300[var4 + 1];
                            field1300[var4++] = class54.method843(var109, var110);
                            continue;
                        }
                        if (var331 == 3302) {
                            var4 -= 2;
                            int var111 = field1300[var4];
                            int var112 = field1300[var4 + 1];
                            int[] var113 = field1300;
                            int var114 = var4++;
                            class54 var115 = (class54) class54.field583.method8((long) var111);
                            int var116;
                            if (var115 == null) {
                                var116 = 0;
                            } else if (var112 >= 0 && var112 < var115.field584.length) {
                                var116 = var115.field584[var112];
                            } else {
                                var116 = 0;
                            }
                            var113[var114] = var116;
                            continue;
                        }
                        if (var331 == 3303) {
                            var4 -= 2;
                            int var117 = field1300[var4];
                            int var118 = field1300[var4 + 1];
                            int[] var119 = field1300;
                            int var120 = var4++;
                            class54 var121 = (class54) class54.field583.method8((long) var117);
                            int var122;
                            if (var121 == null) {
                                var122 = 0;
                            } else if (var118 == -1) {
                                var122 = 0;
                            } else {
                                int var123 = 0;
                                for (int var124 = 0; var124 < var121.field584.length; var124++) {
                                    if (var121.field576[var124] == var118) {
                                        var123 += var121.field584[var124];
                                    }
                                }
                                var122 = var123;
                            }
                            var119[var120] = var122;
                            continue;
                        }
                        if (var331 == 3304) {
                            var4--;
                            int var125 = field1300[var4];
                            int[] var126 = field1300;
                            int var127 = var4++;
                            class168 var128 = (class168) class168.field2554.method1196((long) var125);
                            class168 var129;
                            if (var128 == null) {
                                byte[] var130 = Statics.field2553.method1298(5, var125);
                                class168 var131 = new class168();
                                if (var130 != null) {
                                    var131.method3038(new class28(var130));
                                }
                                class168.field2554.method1184(var131, (long) var125);
                                var129 = var131;
                            } else {
                                var129 = var128;
                            }
                            var126[var127] = var129.field2559;
                            continue;
                        }
                        if (var331 == 3305) {
                            var4--;
                            int var132 = field1300[var4];
                            field1300[var4++] = client.field1601[var132];
                            continue;
                        }
                        if (var331 == 3306) {
                            var4--;
                            int var133 = field1300[var4];
                            field1300[var4++] = client.field1602[var133];
                            continue;
                        }
                        if (var331 == 3307) {
                            var4--;
                            int var134 = field1300[var4];
                            field1300[var4++] = client.field1479[var134];
                            continue;
                        }
                        if (var331 == 3308) {
                            int var135 = Statics.field933;
                            int var136 = (Statics.field1393.field2461 >> 7) + Statics.field2722;
                            int var137 = (Statics.field1393.field2500 >> 7) + Statics.field1915;
                            field1300[var4++] = (var135 << 28) + (var136 << 14) + var137;
                            continue;
                        }
                        if (var331 == 3309) {
                            var4--;
                            int var138 = field1300[var4];
                            field1300[var4++] = var138 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var331 == 3310) {
                            var4--;
                            int var139 = field1300[var4];
                            field1300[var4++] = var139 >> 28;
                            continue;
                        }
                        if (var331 == 3311) {
                            var4--;
                            int var140 = field1300[var4];
                            field1300[var4++] = var140 & 0x3FFF;
                            continue;
                        }
                        if (var331 == 3312) {
                            field1300[var4++] = client.field1463 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 3313) {
                            var4 -= 2;
                            int var141 = field1300[var4] + 32768;
                            int var142 = field1300[var4 + 1];
                            field1300[var4++] = class54.method843(var141, var142);
                            continue;
                        }
                        if (var331 == 3314) {
                            var4 -= 2;
                            int var143 = field1300[var4] + 32768;
                            int var144 = field1300[var4 + 1];
                            field1300[var4++] = class54.method6(var143, var144);
                            continue;
                        }
                        if (var331 == 3315) {
                            var4 -= 2;
                            int var145 = field1300[var4] + 32768;
                            int var146 = field1300[var4 + 1];
                            int[] var147 = field1300;
                            int var148 = var4++;
                            class54 var149 = (class54) class54.field583.method8((long) var145);
                            int var150;
                            if (var149 == null) {
                                var150 = 0;
                            } else if (var146 == -1) {
                                var150 = 0;
                            } else {
                                int var151 = 0;
                                for (int var152 = 0; var152 < var149.field584.length; var152++) {
                                    if (var149.field576[var152] == var146) {
                                        var151 += var149.field584[var152];
                                    }
                                }
                                var150 = var151;
                            }
                            var147[var148] = var150;
                            continue;
                        }
                        if (var331 == 3316) {
                            if (client.field1630 >= 2) {
                                field1300[var4++] = client.field1630;
                            } else {
                                field1300[var4++] = 0;
                            }
                            continue;
                        }
                        if (var331 == 3317) {
                            field1300[var4++] = client.field1680;
                            continue;
                        }
                        if (var331 == 3318) {
                            field1300[var4++] = client.field1537;
                            continue;
                        }
                        if (var331 == 3321) {
                            field1300[var4++] = client.field1650;
                            continue;
                        }
                        if (var331 == 3322) {
                            field1300[var4++] = client.field1629;
                            continue;
                        }
                        if (var331 == 3323) {
                            if (client.field1480) {
                                field1300[var4++] = 1;
                            } else {
                                field1300[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var331 < 3500) {
                        if (var331 == 3400) {
                            var4 -= 2;
                            int var153 = field1300[var4];
                            int var154 = field1300[var4 + 1];
                            class170 var155 = class170.method3474(var153);
                            if (var155.field2575 != 's') {
                            }
                            for (int var156 = 0; var156 < var155.field2578; var156++) {
                                if (var155.field2579[var156] == var154) {
                                    field1311[var5++] = var155.field2581[var156];
                                    var155 = null;
                                    break;
                                }
                            }
                            if (var155 != null) {
                                field1311[var5++] = var155.field2574;
                            }
                            continue;
                        }
                        if (var331 == 3408) {
                            var4 -= 4;
                            int var157 = field1300[var4];
                            int var158 = field1300[var4 + 1];
                            int var159 = field1300[var4 + 2];
                            int var160 = field1300[var4 + 3];
                            class170 var161 = class170.method3474(var159);
                            if (var161.field2573 == var157 && var161.field2575 == var158) {
                                for (int var162 = 0; var162 < var161.field2578; var162++) {
                                    if (var161.field2579[var162] == var160) {
                                        if (var158 == 115) {
                                            field1311[var5++] = var161.field2581[var162];
                                        } else {
                                            field1300[var4++] = var161.field2580[var162];
                                        }
                                        var161 = null;
                                        break;
                                    }
                                }
                                if (var161 != null) {
                                    if (var158 == 115) {
                                        field1311[var5++] = var161.field2574;
                                    } else {
                                        field1300[var4++] = var161.field2583;
                                    }
                                }
                                continue;
                            }
                            if (var158 == 115) {
                                field1311[var5++] = "null";
                            } else {
                                field1300[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var331 < 3700) {
                        if (var331 == 3600) {
                            if (client.field1717 == 0) {
                                field1300[var4++] = -2;
                            } else if (client.field1717 == 1) {
                                field1300[var4++] = -1;
                            } else {
                                field1300[var4++] = client.field1716;
                            }
                            continue;
                        }
                        if (var331 == 3601) {
                            var4--;
                            int var163 = field1300[var4];
                            if (client.field1717 == 2 && var163 < client.field1716) {
                                field1311[var5++] = client.field1718[var163].field1278;
                                continue;
                            }
                            field1311[var5++] = "";
                            continue;
                        }
                        if (var331 == 3602) {
                            var4--;
                            int var164 = field1300[var4];
                            if (client.field1717 == 2 && var164 < client.field1716) {
                                field1300[var4++] = client.field1718[var164].field1276;
                                continue;
                            }
                            field1300[var4++] = 0;
                            continue;
                        }
                        if (var331 == 3603) {
                            var4--;
                            int var165 = field1300[var4];
                            if (client.field1717 == 2 && var165 < client.field1716) {
                                field1300[var4++] = client.field1718[var165].field1277;
                                continue;
                            }
                            field1300[var4++] = 0;
                            continue;
                        }
                        if (var331 == 3604) {
                            var5--;
                            String var166 = field1311[var5];
                            var4--;
                            int var167 = field1300[var4];
                            client.method2954(var166, var167);
                            continue;
                        }
                        if (var331 == 3605) {
                            var5--;
                            String var168 = field1311[var5];
                            if (var168 == null) {
                                continue;
                            }
                            if ((client.field1716 < 200 || client.field1640 == 1) && client.field1716 < 400) {
                                String var169 = class103.method740(var168, Statics.field1462);
                                if (var169 == null) {
                                    continue;
                                }
                                for (int var170 = 0; var170 < client.field1716; var170++) {
                                    class90 var171 = client.field1718[var170];
                                    String var172 = class103.method740(var171.field1278, Statics.field1462);
                                    if (var172 != null && var172.equals(var169)) {
                                        client.method1199(0, "", var168 + class57.field708);
                                        continue label2306;
                                    }
                                    if (var171.field1275 != null) {
                                        String var173 = class103.method740(var171.field1275, Statics.field1462);
                                        if (var173 != null && var173.equals(var169)) {
                                            client.method1199(0, "", var168 + class57.field708);
                                            continue label2306;
                                        }
                                    }
                                }
                                for (int var174 = 0; var174 < client.field1720; var174++) {
                                    class102 var175 = client.field1721[var174];
                                    String var176 = class103.method740(var175.field1400, Statics.field1462);
                                    if (var176 != null && var176.equals(var169)) {
                                        client.method1199(0, "", class57.field803 + var168 + class57.field804);
                                        continue label2306;
                                    }
                                    if (var175.field1399 != null) {
                                        String var177 = class103.method740(var175.field1399, Statics.field1462);
                                        if (var177 != null && var177.equals(var169)) {
                                            client.method1199(0, "", class57.field803 + var168 + class57.field804);
                                            continue label2306;
                                        }
                                    }
                                }
                                if (class103.method740(Statics.field1393.field918, Statics.field1462).equals(var169)) {
                                    client.method1199(0, "", class57.field717);
                                } else {
                                    client.field1695.method746(81);
                                    client.field1695.method443(class28.method2628(var168));
                                    client.field1695.method303(var168);
                                }
                                continue;
                            }
                            client.method1199(0, "", class57.field797);
                            continue;
                        }
                        if (var331 == 3606) {
                            var5--;
                            String var178 = field1311[var5];
                            if (var178 == null) {
                                continue;
                            }
                            String var179 = class103.method740(var178, Statics.field1462);
                            if (var179 == null) {
                                continue;
                            }
                            int var180 = 0;
                            while (true) {
                                if (var180 >= client.field1716) {
                                    continue label2306;
                                }
                                class90 var181 = client.field1718[var180];
                                String var182 = var181.field1278;
                                String var183 = class103.method740(var182, Statics.field1462);
                                boolean var184;
                                if (var178 == null || var182 == null) {
                                    var184 = false;
                                } else if (var178.startsWith("#") || var182.startsWith("#")) {
                                    var184 = var178.equals(var182);
                                } else {
                                    var184 = var179.equals(var183);
                                }
                                if (var184) {
                                    client.field1716--;
                                    for (int var185 = var180; var185 < client.field1716; var185++) {
                                        client.field1718[var185] = client.field1718[var185 + 1];
                                    }
                                    client.field1635 = client.field1472;
                                    client.field1695.method746(101);
                                    client.field1695.method443(class28.method2628(var178));
                                    client.field1695.method303(var178);
                                    continue label2306;
                                }
                                var180++;
                            }
                        }
                        if (var331 == 3607) {
                            var5--;
                            String var186 = field1311[var5];
                            client.method1074(var186, false);
                            continue;
                        }
                        if (var331 == 3608) {
                            var5--;
                            String var187 = field1311[var5];
                            if (var187 == null) {
                                continue;
                            }
                            String var188 = class103.method740(var187, Statics.field1462);
                            if (var188 == null) {
                                continue;
                            }
                            int var189 = 0;
                            while (true) {
                                if (var189 >= client.field1720) {
                                    continue label2306;
                                }
                                class102 var190 = client.field1721[var189];
                                String var191 = var190.field1400;
                                String var192 = class103.method740(var191, Statics.field1462);
                                boolean var193;
                                if (var187 == null || var191 == null) {
                                    var193 = false;
                                } else if (var187.startsWith("#") || var191.startsWith("#")) {
                                    var193 = var187.equals(var191);
                                } else {
                                    var193 = var188.equals(var192);
                                }
                                if (var193) {
                                    client.field1720--;
                                    for (int var194 = var189; var194 < client.field1720; var194++) {
                                        client.field1721[var194] = client.field1721[var194 + 1];
                                    }
                                    client.field1635 = client.field1472;
                                    client.field1695.method746(135);
                                    client.field1695.method443(class28.method2628(var187));
                                    client.field1695.method303(var187);
                                    continue label2306;
                                }
                                var189++;
                            }
                        }
                        if (var331 == 3609) {
                            var5--;
                            String var195 = field1311[var5];
                            if (var195.startsWith(class62.method904(0)) || var195.startsWith(class62.method904(1))) {
                                var195 = var195.substring(7);
                            }
                            field1300[var4++] = client.method2157(var195) ? 1 : 0;
                            continue;
                        }
                        if (var331 == 3611) {
                            if (client.field1654 == null) {
                                field1311[var5++] = "";
                            } else {
                                field1311[var5++] = class59.method2811(client.field1654);
                            }
                            continue;
                        }
                        if (var331 == 3612) {
                            if (client.field1654 == null) {
                                field1300[var4++] = 0;
                            } else {
                                field1300[var4++] = Statics.field2438;
                            }
                            continue;
                        }
                        if (var331 == 3613) {
                            var4--;
                            int var196 = field1300[var4];
                            if (client.field1654 != null && var196 < Statics.field2438) {
                                field1311[var5++] = Statics.field1267[var196].field878;
                                continue;
                            }
                            field1311[var5++] = "";
                            continue;
                        }
                        if (var331 == 3614) {
                            var4--;
                            int var197 = field1300[var4];
                            if (client.field1654 != null && var197 < Statics.field2438) {
                                field1300[var4++] = Statics.field1267[var197].field875;
                                continue;
                            }
                            field1300[var4++] = 0;
                            continue;
                        }
                        if (var331 == 3615) {
                            var4--;
                            int var198 = field1300[var4];
                            if (client.field1654 != null && var198 < Statics.field2438) {
                                field1300[var4++] = Statics.field1267[var198].field872;
                                continue;
                            }
                            field1300[var4++] = 0;
                            continue;
                        }
                        if (var331 == 3616) {
                            field1300[var4++] = Statics.field2698;
                            continue;
                        }
                        if (var331 == 3617) {
                            var5--;
                            String var199 = field1311[var5];
                            if (Statics.field1267 != null) {
                                client.field1695.method746(175);
                                client.field1695.method443(class28.method2628(var199));
                                client.field1695.method303(var199);
                            }
                            continue;
                        }
                        if (var331 == 3618) {
                            field1300[var4++] = Statics.field2054;
                            continue;
                        }
                        if (var331 == 3619) {
                            var5--;
                            String var200 = field1311[var5];
                            client.method3426(var200);
                            continue;
                        }
                        if (var331 == 3620) {
                            client.method1588();
                            continue;
                        }
                        if (var331 == 3621) {
                            if (client.field1717 == 0) {
                                field1300[var4++] = -1;
                            } else {
                                field1300[var4++] = client.field1720;
                            }
                            continue;
                        }
                        if (var331 == 3622) {
                            var4--;
                            int var201 = field1300[var4];
                            if (client.field1717 != 0 && var201 < client.field1720) {
                                field1311[var5++] = client.field1721[var201].field1400;
                                continue;
                            }
                            field1311[var5++] = "";
                            continue;
                        }
                        if (var331 == 3623) {
                            var5--;
                            String var202 = field1311[var5];
                            if (var202.startsWith(class62.method904(0)) || var202.startsWith(class62.method904(1))) {
                                var202 = var202.substring(7);
                            }
                            field1300[var4++] = client.method1079(var202) ? 1 : 0;
                            continue;
                        }
                        if (var331 == 3624) {
                            var4--;
                            int var203 = field1300[var4];
                            if (Statics.field1267 != null && var203 < Statics.field2438 && Statics.field1267[var203].field878.equalsIgnoreCase(Statics.field1393.field918)) {
                                field1300[var4++] = 1;
                                continue;
                            }
                            field1300[var4++] = 0;
                            continue;
                        }
                        if (var331 == 3625) {
                            if (client.field1689 == null) {
                                field1311[var5++] = "";
                            } else {
                                field1311[var5++] = class59.method2811(client.field1689);
                            }
                            continue;
                        }
                    } else if (var331 < 4100) {
                        if (var331 == 4000) {
                            var4 -= 2;
                            int var204 = field1300[var4];
                            int var205 = field1300[var4 + 1];
                            field1300[var4++] = var204 + var205;
                            continue;
                        }
                        if (var331 == 4001) {
                            var4 -= 2;
                            int var206 = field1300[var4];
                            int var207 = field1300[var4 + 1];
                            field1300[var4++] = var206 - var207;
                            continue;
                        }
                        if (var331 == 4002) {
                            var4 -= 2;
                            int var208 = field1300[var4];
                            int var209 = field1300[var4 + 1];
                            field1300[var4++] = var208 * var209;
                            continue;
                        }
                        if (var331 == 4003) {
                            var4 -= 2;
                            int var210 = field1300[var4];
                            int var211 = field1300[var4 + 1];
                            field1300[var4++] = var210 / var211;
                            continue;
                        }
                        if (var331 == 4004) {
                            var4--;
                            int var212 = field1300[var4];
                            field1300[var4++] = (int) (Math.random() * (double) var212);
                            continue;
                        }
                        if (var331 == 4005) {
                            var4--;
                            int var213 = field1300[var4];
                            field1300[var4++] = (int) (Math.random() * (double) (var213 + 1));
                            continue;
                        }
                        if (var331 == 4006) {
                            var4 -= 5;
                            int var214 = field1300[var4];
                            int var215 = field1300[var4 + 1];
                            int var216 = field1300[var4 + 2];
                            int var217 = field1300[var4 + 3];
                            int var218 = field1300[var4 + 4];
                            field1300[var4++] = (var215 - var214) * (var218 - var216) / (var217 - var216) + var214;
                            continue;
                        }
                        if (var331 == 4007) {
                            var4 -= 2;
                            int var219 = field1300[var4];
                            int var220 = field1300[var4 + 1];
                            field1300[var4++] = var219 * var220 / 100 + var219;
                            continue;
                        }
                        if (var331 == 4008) {
                            var4 -= 2;
                            int var221 = field1300[var4];
                            int var222 = field1300[var4 + 1];
                            field1300[var4++] = var221 | 0x1 << var222;
                            continue;
                        }
                        if (var331 == 4009) {
                            var4 -= 2;
                            int var223 = field1300[var4];
                            int var224 = field1300[var4 + 1];
                            field1300[var4++] = var223 & -1 - (0x1 << var224);
                            continue;
                        }
                        if (var331 == 4010) {
                            var4 -= 2;
                            int var225 = field1300[var4];
                            int var226 = field1300[var4 + 1];
                            field1300[var4++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var331 == 4011) {
                            var4 -= 2;
                            int var227 = field1300[var4];
                            int var228 = field1300[var4 + 1];
                            field1300[var4++] = var227 % var228;
                            continue;
                        }
                        if (var331 == 4012) {
                            var4 -= 2;
                            int var229 = field1300[var4];
                            int var230 = field1300[var4 + 1];
                            if (var229 == 0) {
                                field1300[var4++] = 0;
                            } else {
                                field1300[var4++] = (int) Math.pow((double) var229, (double) var230);
                            }
                            continue;
                        }
                        if (var331 == 4013) {
                            var4 -= 2;
                            int var231 = field1300[var4];
                            int var232 = field1300[var4 + 1];
                            if (var231 == 0) {
                                field1300[var4++] = 0;
                            } else if (var232 == 0) {
                                field1300[var4++] = Integer.MAX_VALUE;
                            } else {
                                field1300[var4++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                            }
                            continue;
                        }
                        if (var331 == 4014) {
                            var4 -= 2;
                            int var233 = field1300[var4];
                            int var234 = field1300[var4 + 1];
                            field1300[var4++] = var233 & var234;
                            continue;
                        }
                        if (var331 == 4015) {
                            var4 -= 2;
                            int var235 = field1300[var4];
                            int var236 = field1300[var4 + 1];
                            field1300[var4++] = var235 | var236;
                            continue;
                        }
                    } else if (var331 < 4200) {
                        if (var331 == 4100) {
                            var5--;
                            String var237 = field1311[var5];
                            var4--;
                            int var238 = field1300[var4];
                            field1311[var5++] = var237 + var238;
                            continue;
                        }
                        if (var331 == 4101) {
                            var5 -= 2;
                            String var239 = field1311[var5];
                            String var240 = field1311[var5 + 1];
                            field1311[var5++] = var239 + var240;
                            continue;
                        }
                        if (var331 == 4102) {
                            var5--;
                            String var241 = field1311[var5];
                            var4--;
                            int var242 = field1300[var4];
                            field1311[var5++] = var241 + class97.method1032(var242, true);
                            continue;
                        }
                        if (var331 == 4103) {
                            var5--;
                            String var243 = field1311[var5];
                            field1311[var5++] = var243.toLowerCase();
                            continue;
                        }
                        if (var331 == 4104) {
                            var4--;
                            int var244 = field1300[var4];
                            long var245 = ((long) var244 + 11745L) * 86400000L;
                            field1305.setTime(new Date(var245));
                            int var247 = field1305.get(5);
                            int var248 = field1305.get(2);
                            int var249 = field1305.get(1);
                            field1311[var5++] = var247 + "-" + field1302[var248] + "-" + var249;
                            continue;
                        }
                        if (var331 == 4105) {
                            var5 -= 2;
                            String var250 = field1311[var5];
                            String var251 = field1311[var5 + 1];
                            if (Statics.field1393.field911 != null && Statics.field1393.field911.field977) {
                                field1311[var5++] = var251;
                                continue;
                            }
                            field1311[var5++] = var250;
                            continue;
                        }
                        if (var331 == 4106) {
                            var4--;
                            int var252 = field1300[var4];
                            field1311[var5++] = Integer.toString(var252);
                            continue;
                        }
                        if (var331 == 4107) {
                            var5 -= 2;
                            field1300[var4++] = class97.method2253(class89.method1224(field1311[var5], field1311[var5 + 1], client.field1465));
                            continue;
                        }
                        if (var331 == 4108) {
                            var5--;
                            String var253 = field1311[var5];
                            var4 -= 2;
                            int var254 = field1300[var4];
                            int var255 = field1300[var4 + 1];
                            byte[] var256 = Statics.field1719.method1298(var255, 0);
                            class23 var257 = new class23(var256);
                            field1300[var4++] = var257.method219(var253, var254);
                            continue;
                        }
                        if (var331 == 4109) {
                            var5--;
                            String var258 = field1311[var5];
                            var4 -= 2;
                            int var259 = field1300[var4];
                            int var260 = field1300[var4 + 1];
                            byte[] var261 = Statics.field1719.method1298(var260, 0);
                            class23 var262 = new class23(var261);
                            field1300[var4++] = var262.method218(var258, var259);
                            continue;
                        }
                        if (var331 == 4110) {
                            var5 -= 2;
                            String var263 = field1311[var5];
                            String var264 = field1311[var5 + 1];
                            var4--;
                            if (field1300[var4] == 1) {
                                field1311[var5++] = var263;
                            } else {
                                field1311[var5++] = var264;
                            }
                            continue;
                        }
                        if (var331 == 4111) {
                            var5--;
                            String var265 = field1311[var5];
                            field1311[var5++] = class25.method220(var265);
                            continue;
                        }
                        if (var331 == 4112) {
                            var5--;
                            String var266 = field1311[var5];
                            var4--;
                            int var267 = field1300[var4];
                            field1311[var5++] = var266 + (char) var267;
                            continue;
                        }
                        if (var331 == 4113) {
                            var4--;
                            int var268 = field1300[var4];
                            field1300[var4++] = class97.method1024((char) var268) ? 1 : 0;
                            continue;
                        }
                        if (var331 == 4114) {
                            var4--;
                            int var269 = field1300[var4];
                            field1300[var4++] = class97.method2653((char) var269) ? 1 : 0;
                            continue;
                        }
                        if (var331 == 4115) {
                            var4--;
                            int var270 = field1300[var4];
                            field1300[var4++] = class97.method569((char) var270) ? 1 : 0;
                            continue;
                        }
                        if (var331 == 4116) {
                            var4--;
                            int var271 = field1300[var4];
                            field1300[var4++] = class97.method2285((char) var271) ? 1 : 0;
                            continue;
                        }
                        if (var331 == 4117) {
                            var5--;
                            String var272 = field1311[var5];
                            if (var272 == null) {
                                field1300[var4++] = 0;
                            } else {
                                field1300[var4++] = var272.length();
                            }
                            continue;
                        }
                        if (var331 == 4118) {
                            var5--;
                            String var273 = field1311[var5];
                            var4 -= 2;
                            int var274 = field1300[var4];
                            int var275 = field1300[var4 + 1];
                            field1311[var5++] = var273.substring(var274, var275);
                            continue;
                        }
                        if (var331 == 4119) {
                            var5--;
                            String var276 = field1311[var5];
                            StringBuilder var277 = new StringBuilder(var276.length());
                            boolean var278 = false;
                            for (int var279 = 0; var279 < var276.length(); var279++) {
                                char var280 = var276.charAt(var279);
                                if (var280 == '<') {
                                    var278 = true;
                                } else if (var280 == '>') {
                                    var278 = false;
                                } else if (!var278) {
                                    var277.append(var280);
                                }
                            }
                            field1311[var5++] = var277.toString();
                            continue;
                        }
                        if (var331 == 4120) {
                            var5--;
                            String var281 = field1311[var5];
                            var4--;
                            int var282 = field1300[var4];
                            field1300[var4++] = var281.indexOf(var282);
                            continue;
                        }
                    } else if (var331 < 4300) {
                        if (var331 == 4200) {
                            var4--;
                            int var283 = field1300[var4];
                            field1311[var5++] = class172.method934(var283).field2608;
                            continue;
                        }
                        if (var331 == 4201) {
                            var4 -= 2;
                            int var284 = field1300[var4];
                            int var285 = field1300[var4 + 1];
                            class172 var286 = class172.method934(var284);
                            if (var285 >= 1 && var285 <= 5 && var286.field2622[var285 - 1] != null) {
                                field1311[var5++] = var286.field2622[var285 - 1];
                                continue;
                            }
                            field1311[var5++] = "";
                            continue;
                        }
                        if (var331 == 4202) {
                            var4 -= 2;
                            int var287 = field1300[var4];
                            int var288 = field1300[var4 + 1];
                            class172 var289 = class172.method934(var287);
                            if (var288 >= 1 && var288 <= 5 && var289.field2623[var288 - 1] != null) {
                                field1311[var5++] = var289.field2623[var288 - 1];
                                continue;
                            }
                            field1311[var5++] = "";
                            continue;
                        }
                        if (var331 == 4203) {
                            var4--;
                            int var290 = field1300[var4];
                            field1300[var4++] = class172.method934(var290).field2620;
                            continue;
                        }
                        if (var331 == 4204) {
                            var4--;
                            int var291 = field1300[var4];
                            field1300[var4++] = class172.method934(var291).field2644 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 4205) {
                            var4--;
                            int var292 = field1300[var4];
                            class172 var293 = class172.method934(var292);
                            if (var293.field2639 == -1 && var293.field2638 >= 0) {
                                field1300[var4++] = var293.field2638;
                                continue;
                            }
                            field1300[var4++] = var292;
                            continue;
                        }
                        if (var331 == 4206) {
                            var4--;
                            int var294 = field1300[var4];
                            class172 var295 = class172.method934(var294);
                            if (var295.field2639 >= 0 && var295.field2638 >= 0) {
                                field1300[var4++] = var295.field2638;
                                continue;
                            }
                            field1300[var4++] = var294;
                            continue;
                        }
                        if (var331 == 4207) {
                            var4--;
                            int var296 = field1300[var4];
                            field1300[var4++] = class172.method934(var296).field2621 ? 1 : 0;
                            continue;
                        }
                    } else if (var331 < 5100) {
                        if (var331 == 5000) {
                            field1300[var4++] = client.field1561;
                            continue;
                        }
                        if (var331 == 5001) {
                            var4 -= 3;
                            client.field1561 = field1300[var4];
                            Statics.field578 = class85.method2158(field1300[var4 + 1]);
                            if (Statics.field578 == null) {
                                Statics.field578 = class85.field1186;
                            }
                            client.field1595 = field1300[var4 + 2];
                            client.field1695.method746(2);
                            client.field1695.method443(client.field1561);
                            client.field1695.method443(Statics.field578.field1188);
                            client.field1695.method443(client.field1595);
                            continue;
                        }
                        if (var331 == 5002) {
                            var5--;
                            String var297 = field1311[var5];
                            var4 -= 2;
                            int var298 = field1300[var4];
                            int var299 = field1300[var4 + 1];
                            client.field1695.method746(230);
                            client.field1695.method443(class28.method2628(var297) + 2);
                            client.field1695.method303(var297);
                            client.field1695.method443(var298 - 1);
                            client.field1695.method443(var299);
                            continue;
                        }
                        if (var331 == 5003) {
                            var4--;
                            int var300 = field1300[var4];
                            String var301 = null;
                            if (var300 < 100) {
                                var301 = client.field1515[var300];
                            }
                            if (var301 == null) {
                                var301 = "";
                            }
                            field1311[var5++] = var301;
                            continue;
                        }
                        if (var331 == 5004) {
                            var4--;
                            int var302 = field1300[var4];
                            int var303 = -1;
                            if (var302 < 100 && client.field1515[var302] != null) {
                                var303 = client.field1674[var302];
                            }
                            field1300[var4++] = var303;
                            continue;
                        }
                        if (var331 == 5005) {
                            if (Statics.field578 == null) {
                                field1300[var4++] = -1;
                            } else {
                                field1300[var4++] = Statics.field578.field1188;
                            }
                            continue;
                        }
                        if (var331 == 5008) {
                            var5--;
                            String var304 = field1311[var5];
                            if (var304.startsWith("::")) {
                                if (var304.equalsIgnoreCase("::toggleroof")) {
                                    Statics.field1861.field958 = !Statics.field1861.field958;
                                    class65.method1090();
                                    if (Statics.field1861.field958) {
                                        client.method1199(0, "", "Roofs are now all hidden");
                                    } else {
                                        client.method1199(0, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field1630 >= 2) {
                                    if (var304.equalsIgnoreCase("::gc")) {
                                        System.gc();
                                    }
                                    if (var304.equalsIgnoreCase("::clientdrop")) {
                                        client.method2631();
                                    }
                                    if (var304.equalsIgnoreCase("::fpson")) {
                                        client.field1475 = true;
                                    }
                                    if (var304.equalsIgnoreCase("::fpsoff")) {
                                        client.field1475 = false;
                                    }
                                    if (var304.equalsIgnoreCase("::noclip")) {
                                        for (int var305 = 0; var305 < 4; var305++) {
                                            for (int var306 = 1; var306 < 103; var306++) {
                                                for (int var307 = 1; var307 < 103; var307++) {
                                                    client.field1520[var305].field95[var306][var307] = 0;
                                                }
                                            }
                                        }
                                    }
                                    if (var304.equalsIgnoreCase("::errortest") && client.field1461 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field1695.method746(119);
                                client.field1695.method443(var304.length() - 1);
                                client.field1695.method303(var304.substring(2));
                                continue;
                            }
                            String var308 = var304.toLowerCase();
                            byte var309 = 0;
                            if (var308.startsWith(class57.field665)) {
                                var309 = 0;
                                var304 = var304.substring(class57.field665.length());
                            } else if (var308.startsWith(class57.field809)) {
                                var309 = 1;
                                var304 = var304.substring(class57.field809.length());
                            } else if (var308.startsWith(class57.field649)) {
                                var309 = 2;
                                var304 = var304.substring(class57.field649.length());
                            } else if (var308.startsWith(class57.field813)) {
                                var309 = 3;
                                var304 = var304.substring(class57.field813.length());
                            } else if (var308.startsWith(class57.field815)) {
                                var309 = 4;
                                var304 = var304.substring(class57.field815.length());
                            } else if (var308.startsWith(class57.field817)) {
                                var309 = 5;
                                var304 = var304.substring(class57.field817.length());
                            } else if (var308.startsWith(class57.field859)) {
                                var309 = 6;
                                var304 = var304.substring(class57.field859.length());
                            } else if (var308.startsWith(class57.field821)) {
                                var309 = 7;
                                var304 = var304.substring(class57.field821.length());
                            } else if (var308.startsWith(class57.field823)) {
                                var309 = 8;
                                var304 = var304.substring(class57.field823.length());
                            } else if (var308.startsWith(class57.field757)) {
                                var309 = 9;
                                var304 = var304.substring(class57.field757.length());
                            } else if (var308.startsWith(class57.field827)) {
                                var309 = 10;
                                var304 = var304.substring(class57.field827.length());
                            } else if (var308.startsWith(class57.field829)) {
                                var309 = 11;
                                var304 = var304.substring(class57.field829.length());
                            } else if (client.field1465 != 0) {
                                if (var308.startsWith(class57.field808)) {
                                    var309 = 0;
                                    var304 = var304.substring(class57.field808.length());
                                } else if (var308.startsWith(class57.field707)) {
                                    var309 = 1;
                                    var304 = var304.substring(class57.field707.length());
                                } else if (var308.startsWith(class57.field750)) {
                                    var309 = 2;
                                    var304 = var304.substring(class57.field750.length());
                                } else if (var308.startsWith(class57.field801)) {
                                    var309 = 3;
                                    var304 = var304.substring(class57.field801.length());
                                } else if (var308.startsWith(class57.field816)) {
                                    var309 = 4;
                                    var304 = var304.substring(class57.field816.length());
                                } else if (var308.startsWith(class57.field818)) {
                                    var309 = 5;
                                    var304 = var304.substring(class57.field818.length());
                                } else if (var308.startsWith(class57.field820)) {
                                    var309 = 6;
                                    var304 = var304.substring(class57.field820.length());
                                } else if (var308.startsWith(class57.field709)) {
                                    var309 = 7;
                                    var304 = var304.substring(class57.field709.length());
                                } else if (var308.startsWith(class57.field824)) {
                                    var309 = 8;
                                    var304 = var304.substring(class57.field824.length());
                                } else if (var308.startsWith(class57.field826)) {
                                    var309 = 9;
                                    var304 = var304.substring(class57.field826.length());
                                } else if (var308.startsWith(class57.field828)) {
                                    var309 = 10;
                                    var304 = var304.substring(class57.field828.length());
                                } else if (var308.startsWith(class57.field830)) {
                                    var309 = 11;
                                    var304 = var304.substring(class57.field830.length());
                                }
                            }
                            String var310 = var304.toLowerCase();
                            byte var311 = 0;
                            if (var310.startsWith(class57.field831)) {
                                var311 = 1;
                                var304 = var304.substring(class57.field831.length());
                            } else if (var310.startsWith(class57.field702)) {
                                var311 = 2;
                                var304 = var304.substring(class57.field702.length());
                            } else if (var310.startsWith(class57.field835)) {
                                var311 = 3;
                                var304 = var304.substring(class57.field835.length());
                            } else if (var310.startsWith(class57.field837)) {
                                var311 = 4;
                                var304 = var304.substring(class57.field837.length());
                            } else if (var310.startsWith(class57.field812)) {
                                var311 = 5;
                                var304 = var304.substring(class57.field812.length());
                            } else if (client.field1465 != 0) {
                                if (var310.startsWith(class57.field832)) {
                                    var311 = 1;
                                    var304 = var304.substring(class57.field832.length());
                                } else if (var310.startsWith(class57.field834)) {
                                    var311 = 2;
                                    var304 = var304.substring(class57.field834.length());
                                } else if (var310.startsWith(class57.field836)) {
                                    var311 = 3;
                                    var304 = var304.substring(class57.field836.length());
                                } else if (var310.startsWith(class57.field838)) {
                                    var311 = 4;
                                    var304 = var304.substring(class57.field838.length());
                                } else if (var310.startsWith(class57.field840)) {
                                    var311 = 5;
                                    var304 = var304.substring(class57.field840.length());
                                }
                            }
                            client.field1695.method746(184);
                            client.field1695.method443(0);
                            int var312 = client.field1695.field303;
                            client.field1695.method443(var309);
                            client.field1695.method443(var311);
                            class41 var313 = client.field1695;
                            int var314 = var313.field303;
                            byte[] var315 = class98.method1221(var304);
                            var313.method426(var315.length);
                            var313.field303 += Statics.field50.method879(var315, 0, var315.length, var313.field306, var313.field303);
                            client.field1695.method494(client.field1695.field303 - var312);
                            continue;
                        }
                        if (var331 == 5009) {
                            var5 -= 2;
                            String var316 = field1311[var5];
                            String var317 = field1311[var5 + 1];
                            client.field1695.method746(0);
                            client.field1695.method300(0);
                            int var318 = client.field1695.field303;
                            client.field1695.method303(var316);
                            class41 var319 = client.field1695;
                            int var320 = var319.field303;
                            byte[] var321 = class98.method1221(var317);
                            var319.method426(var321.length);
                            var319.field303 += Statics.field50.method879(var321, 0, var321.length, var319.field306, var319.field303);
                            client.field1695.method312(client.field1695.field303 - var318);
                            continue;
                        }
                        if (var331 == 5010) {
                            var4--;
                            int var322 = field1300[var4];
                            String var323 = null;
                            if (var322 < 100) {
                                var323 = client.field1569[var322];
                            }
                            if (var323 == null) {
                                var323 = "";
                            }
                            field1311[var5++] = var323;
                            continue;
                        }
                        if (var331 == 5011) {
                            var4--;
                            int var324 = field1300[var4];
                            String var325 = null;
                            if (var324 < 100) {
                                var325 = client.field1676[var324];
                            }
                            if (var325 == null) {
                                var325 = "";
                            }
                            field1311[var5++] = var325;
                            continue;
                        }
                        if (var331 == 5015) {
                            String var326;
                            if (Statics.field1393 == null || Statics.field1393.field918 == null) {
                                var326 = "";
                            } else {
                                var326 = Statics.field1393.field918;
                            }
                            field1311[var5++] = var326;
                            continue;
                        }
                        if (var331 == 5016) {
                            field1300[var4++] = client.field1595;
                            continue;
                        }
                        if (var331 == 5017) {
                            field1300[var4++] = client.field1678;
                            continue;
                        }
                    }
                } else {
                    class17 var63;
                    if (var331 >= 2000) {
                        var331 -= 1000;
                        var4--;
                        var63 = class17.method865(field1300[var4]);
                    } else {
                        var63 = var40 ? Statics.field1304 : Statics.field391;
                    }
                    if (var331 == 1300) {
                        var4--;
                        int var64 = field1300[var4] - 1;
                        if (var64 >= 0 && var64 <= 9) {
                            var5--;
                            var63.method140(var64, field1311[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var331 == 1301) {
                        var4 -= 2;
                        int var65 = field1300[var4];
                        int var66 = field1300[var4 + 1];
                        var63.field174 = class17.method3203(var65, var66);
                        continue;
                    }
                    if (var331 == 1302) {
                        var4--;
                        var63.field140 = field1300[var4] == 1;
                        continue;
                    }
                    if (var331 == 1303) {
                        var4--;
                        var63.field175 = field1300[var4];
                        continue;
                    }
                    if (var331 == 1304) {
                        var4--;
                        var63.field176 = field1300[var4];
                        continue;
                    }
                    if (var331 == 1305) {
                        var5--;
                        var63.field172 = field1311[var5];
                        continue;
                    }
                    if (var331 == 1306) {
                        var5--;
                        var63.field178 = field1311[var5];
                        continue;
                    }
                    if (var331 == 1307) {
                        var63.field173 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var330) {
            StringBuilder var328 = new StringBuilder(30);
            var328.append("").append(var3.field76).append(" ");
            for (int var329 = field1301 - 1; var329 >= 0; var329--) {
                var328.append("").append(field1303[var329].field1269.field76).append(" ");
            }
            var328.append("").append(var9);
            class136.method1295(var328.toString(), var330);
        }
    }
}
