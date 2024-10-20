package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("e")
public class class26 {

    @ObfuscatedName("e.k")
    public static int[] field382 = new int[5];

    @ObfuscatedName("e.n")
    public static int[][] field380 = new int[5][5000];

    @ObfuscatedName("e.s")
    public static int[] field386 = new int[1000];

    @ObfuscatedName("e.x")
    public static String[] field385 = new String[1000];

    @ObfuscatedName("e.b")
    public static int field391 = 0;

    @ObfuscatedName("e.j")
    public static class18[] field387 = new class18[50];

    @ObfuscatedName("e.i")
    public static Calendar field397 = Calendar.getInstance();

    @ObfuscatedName("e.r")
    public static final String[] field390 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.y(Ly;I)V")
    public static void method2369(class1 arg0) {
        Object[] var1 = arg0.field13;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method99(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field58;
        int[] var8 = var3.field73;
        byte var9 = -1;
        field391 = 0;
        try {
            Statics.field381 = new int[var3.field61];
            int var10 = 0;
            Statics.field1382 = new String[var3.field62];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field3;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field6;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2656;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2587;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field4 == null ? -1 : arg0.field4.field2656;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field4 == null ? -1 : arg0.field4.field2587;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field1;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field8;
                    }
                    Statics.field381[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field1382[var11++] = var14;
                }
            }
            int var15 = 0;
            label2296: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var370 = var7[var6];
                if (var370 < 100) {
                    if (var370 == 0) {
                        field386[var4++] = var8[var6];
                        continue;
                    }
                    if (var370 == 1) {
                        int var16 = var8[var6];
                        field386[var4++] = class159.field2705[var16];
                        continue;
                    }
                    if (var370 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2705[var17] = field386[var4];
                        continue;
                    }
                    if (var370 == 3) {
                        field385[var5++] = var3.field60[var6];
                        continue;
                    }
                    if (var370 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var370 == 7) {
                        var4 -= 2;
                        if (field386[var4 + 1] != field386[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var370 == 8) {
                        var4 -= 2;
                        if (field386[var4 + 1] == field386[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var370 == 9) {
                        var4 -= 2;
                        if (field386[var4] < field386[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var370 == 10) {
                        var4 -= 2;
                        if (field386[var4] > field386[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var370 == 21) {
                        if (field391 == 0) {
                            return;
                        }
                        class18 var18 = field387[--field391];
                        var3 = var18.field269;
                        var7 = var3.field58;
                        var8 = var3.field73;
                        var6 = var18.field267;
                        Statics.field381 = var18.field271;
                        Statics.field1382 = var18.field268;
                        continue;
                    }
                    if (var370 == 25) {
                        int var19 = var8[var6];
                        field386[var4++] = class159.method2974(var19);
                        continue;
                    }
                    if (var370 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class159.method1682(var20, field386[var4]);
                        continue;
                    }
                    if (var370 == 31) {
                        var4 -= 2;
                        if (field386[var4] <= field386[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var370 == 32) {
                        var4 -= 2;
                        if (field386[var4] >= field386[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var370 == 33) {
                        field386[var4++] = Statics.field381[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var370 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field381[var10001] = field386[var4];
                        continue;
                    }
                    if (var370 == 35) {
                        field385[var5++] = Statics.field1382[var8[var6]];
                        continue;
                    }
                    if (var370 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field1382[var10001] = field385[var5];
                        continue;
                    }
                    if (var370 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String[] var22 = field385;
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
                        field385[var5++] = var23;
                        continue;
                    }
                    if (var370 == 38) {
                        var4--;
                        continue;
                    }
                    if (var370 == 39) {
                        var5--;
                        continue;
                    }
                    if (var370 == 40) {
                        int var33 = var8[var6];
                        class5 var34 = class5.method99(var33);
                        int[] var35 = new int[var34.field61];
                        String[] var36 = new String[var34.field62];
                        for (int var37 = 0; var37 < var34.field63; var37++) {
                            var35[var37] = field386[var4 - var34.field63 + var37];
                        }
                        for (int var38 = 0; var38 < var34.field64; var38++) {
                            var36[var38] = field385[var5 - var34.field64 + var38];
                        }
                        var4 -= var34.field63;
                        var5 -= var34.field64;
                        class18 var39 = new class18();
                        var39.field269 = var3;
                        var39.field267 = var6;
                        var39.field271 = Statics.field381;
                        var39.field268 = Statics.field1382;
                        field387[++field391 - 1] = var39;
                        var3 = var34;
                        var7 = var34.field58;
                        var8 = var34.field73;
                        var6 = -1;
                        Statics.field381 = var35;
                        Statics.field1382 = var36;
                        continue;
                    }
                    if (var370 == 42) {
                        field386[var4++] = client.field606[var8[var6]];
                        continue;
                    }
                    if (var370 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field606[var10001] = field386[var4];
                        continue;
                    }
                    if (var370 == 44) {
                        int var40 = var8[var6] >> 16;
                        int var41 = var8[var6] & 0xFFFF;
                        var4--;
                        int var42 = field386[var4];
                        if (var42 >= 0 && var42 <= 5000) {
                            field382[var40] = var42;
                            byte var43 = -1;
                            if (var41 == 105) {
                                var43 = 0;
                            }
                            int var44 = 0;
                            while (true) {
                                if (var44 >= var42) {
                                    continue label2296;
                                }
                                field380[var40][var44] = var43;
                                var44++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var370 == 45) {
                        int var45 = var8[var6];
                        var4--;
                        int var46 = field386[var4];
                        if (var46 >= 0 && var46 < field382[var45]) {
                            field386[var4++] = field380[var45][var46];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var370 == 46) {
                        int var47 = var8[var6];
                        var4 -= 2;
                        int var48 = field386[var4];
                        if (var48 >= 0 && var48 < field382[var47]) {
                            field380[var47][var48] = field386[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var370 == 47) {
                        String var49 = client.field656[var8[var6]];
                        if (var49 == null) {
                            var49 = "null";
                        }
                        field385[var5++] = var49;
                        continue;
                    }
                    if (var370 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field656[var10001] = field385[var5];
                        continue;
                    }
                }
                boolean var50;
                if (var8[var6] == 1) {
                    var50 = true;
                } else {
                    var50 = false;
                }
                if (var370 < 1000) {
                    if (var370 == 100) {
                        var4 -= 3;
                        int var51 = field386[var4];
                        int var52 = field386[var4 + 1];
                        int var53 = field386[var4 + 2];
                        if (var52 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var54 = class158.method792(var51);
                        if (var54.field2694 == null) {
                            var54.field2694 = new class158[var53 + 1];
                        }
                        if (var54.field2694.length <= var53) {
                            class158[] var55 = new class158[var53 + 1];
                            for (int var56 = 0; var56 < var54.field2694.length; var56++) {
                                var55[var56] = var54.field2694[var56];
                            }
                            var54.field2694 = var55;
                        }
                        if (var53 > 0 && var54.field2694[var53 - 1] == null) {
                            throw new RuntimeException("" + (var53 - 1));
                        }
                        class158 var57 = new class158();
                        var57.field2588 = var52;
                        var57.field2686 = var57.field2656 = var54.field2656;
                        var57.field2587 = var53;
                        var57.field2595 = true;
                        var54.field2694[var53] = var57;
                        if (var50) {
                            Statics.field78 = var57;
                        } else {
                            Statics.field383 = var57;
                        }
                        client.method41(var54);
                        continue;
                    }
                    if (var370 == 101) {
                        class158 var58 = var50 ? Statics.field78 : Statics.field383;
                        class158 var59 = class158.method792(var58.field2656);
                        var59.field2694[var58.field2587] = null;
                        client.method41(var59);
                        continue;
                    }
                    if (var370 == 102) {
                        var4--;
                        class158 var60 = class158.method792(field386[var4]);
                        var60.field2694 = null;
                        client.method41(var60);
                        continue;
                    }
                    if (var370 == 200) {
                        var4 -= 2;
                        int var61 = field386[var4];
                        int var62 = field386[var4 + 1];
                        class158 var63 = class158.method810(var61, var62);
                        if (var63 != null && var62 != -1) {
                            field386[var4++] = 1;
                            if (var50) {
                                Statics.field78 = var63;
                            } else {
                                Statics.field383 = var63;
                            }
                            continue;
                        }
                        field386[var4++] = 0;
                        continue;
                    }
                } else if (var370 >= 1000 && var370 < 1100 || var370 >= 2000 && var370 < 2100) {
                    class158 var64;
                    if (var370 >= 2000) {
                        var370 -= 1000;
                        var4--;
                        var64 = class158.method792(field386[var4]);
                    } else {
                        var64 = var50 ? Statics.field78 : Statics.field383;
                    }
                    if (var370 == 1000) {
                        var4 -= 2;
                        var64.field2672 = field386[var4];
                        var64.field2592 = field386[var4 + 1];
                        client.method41(var64);
                        continue;
                    }
                    if (var370 == 1001) {
                        var4 -= 2;
                        var64.field2613 = field386[var4];
                        var64.field2697 = field386[var4 + 1];
                        client.method41(var64);
                        continue;
                    }
                    if (var370 == 1003) {
                        var4--;
                        boolean var65 = field386[var4] == 1;
                        if (var64.field2598 != var65) {
                            var64.field2598 = var65;
                            client.method41(var64);
                        }
                        continue;
                    }
                } else if (!(var370 < 1100 || var370 >= 1200) || !(var370 < 2100 || var370 >= 2200)) {
                    class158 var66;
                    if (var370 >= 2000) {
                        var370 -= 1000;
                        var4--;
                        var66 = class158.method792(field386[var4]);
                    } else {
                        var66 = var50 ? Statics.field78 : Statics.field383;
                    }
                    if (var370 == 1100) {
                        var4 -= 2;
                        var66.field2599 = field386[var4];
                        if (var66.field2599 > var66.field2601 - var66.field2613) {
                            var66.field2599 = var66.field2601 - var66.field2613;
                        }
                        if (var66.field2599 < 0) {
                            var66.field2599 = 0;
                        }
                        var66.field2600 = field386[var4 + 1];
                        if (var66.field2600 > var66.field2602 - var66.field2697) {
                            var66.field2600 = var66.field2602 - var66.field2697;
                        }
                        if (var66.field2600 < 0) {
                            var66.field2600 = 0;
                        }
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1101) {
                        var4--;
                        var66.field2657 = field386[var4];
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1102) {
                        var4--;
                        var66.field2589 = field386[var4] == 1;
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1103) {
                        var4--;
                        var66.field2608 = field386[var4];
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1104) {
                        var4--;
                        var66.field2609 = field386[var4];
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1105) {
                        var4--;
                        var66.field2615 = field386[var4];
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1106) {
                        var4--;
                        var66.field2612 = field386[var4];
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1107) {
                        var4--;
                        var66.field2596 = field386[var4] == 1;
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1108) {
                        var66.field2618 = 1;
                        var4--;
                        var66.field2619 = field386[var4];
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1109) {
                        var4 -= 6;
                        var66.field2624 = field386[var4];
                        var66.field2625 = field386[var4 + 1];
                        var66.field2626 = field386[var4 + 2];
                        var66.field2627 = field386[var4 + 3];
                        var66.field2682 = field386[var4 + 4];
                        var66.field2629 = field386[var4 + 5];
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1110) {
                        var4--;
                        int var67 = field386[var4];
                        if (var66.field2622 != var67) {
                            var66.field2622 = var67;
                            var66.field2692 = 0;
                            var66.field2584 = 0;
                            client.method41(var66);
                        }
                        continue;
                    }
                    if (var370 == 1111) {
                        var4--;
                        var66.field2631 = field386[var4] == 1;
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1112) {
                        var5--;
                        String var68 = field385[var5];
                        if (!var68.equals(var66.field2633)) {
                            var66.field2633 = var68;
                            client.method41(var66);
                        }
                        continue;
                    }
                    if (var370 == 1113) {
                        var4--;
                        var66.field2632 = field386[var4];
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1114) {
                        var4 -= 3;
                        var66.field2636 = field386[var4];
                        var66.field2637 = field386[var4 + 1];
                        var66.field2635 = field386[var4 + 2];
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1115) {
                        var4--;
                        var66.field2638 = field386[var4] == 1;
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1116) {
                        var4--;
                        var66.field2614 = field386[var4];
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1117) {
                        var4--;
                        var66.field2665 = field386[var4];
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1118) {
                        var4--;
                        var66.field2688 = field386[var4] == 1;
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1119) {
                        var4--;
                        var66.field2617 = field386[var4] == 1;
                        client.method41(var66);
                        continue;
                    }
                    if (var370 == 1120) {
                        var4 -= 2;
                        var66.field2601 = field386[var4];
                        var66.field2602 = field386[var4 + 1];
                        client.method41(var66);
                        continue;
                    }
                } else if (var370 >= 1200 && var370 < 1300 || var370 >= 2200 && var370 < 2300) {
                    class158 var69;
                    if (var370 >= 2000) {
                        var370 -= 1000;
                        var4--;
                        var69 = class158.method792(field386[var4]);
                    } else {
                        var69 = var50 ? Statics.field78 : Statics.field383;
                    }
                    client.method41(var69);
                    if (var370 == 1200) {
                        var4 -= 2;
                        int var70 = field386[var4];
                        int var71 = field386[var4 + 1];
                        var69.field2667 = var70;
                        var69.field2691 = var71;
                        class40 var72 = class40.method30(var70);
                        var69.field2626 = var72.field976;
                        var69.field2627 = var72.field977;
                        var69.field2682 = var72.field978;
                        var69.field2624 = var72.field979;
                        var69.field2625 = var72.field970;
                        var69.field2629 = var72.field975;
                        if (var69.field2613 > 0) {
                            var69.field2629 = var69.field2629 * 32 / var69.field2613;
                        }
                        continue;
                    }
                    if (var370 == 1201) {
                        var69.field2618 = 2;
                        var4--;
                        var69.field2619 = field386[var4];
                        continue;
                    }
                    if (var370 == 1202) {
                        var69.field2618 = 3;
                        var69.field2619 = Statics.field147.field29.method3205();
                        continue;
                    }
                } else if (var370 >= 1300 && var370 < 1400 || var370 >= 2300 && var370 < 2400) {
                    class158 var73;
                    if (var370 >= 2000) {
                        var370 -= 1000;
                        var4--;
                        var73 = class158.method792(field386[var4]);
                    } else {
                        var73 = var50 ? Statics.field78 : Statics.field383;
                    }
                    if (var370 == 1300) {
                        var4--;
                        int var74 = field386[var4] - 1;
                        if (var74 >= 0 && var74 <= 9) {
                            var5--;
                            var73.method3137(var74, field385[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var370 == 1301) {
                        var4 -= 2;
                        int var75 = field386[var4];
                        int var76 = field386[var4 + 1];
                        var73.field2669 = class158.method810(var75, var76);
                        continue;
                    }
                    if (var370 == 1302) {
                        var4--;
                        var73.field2651 = field386[var4] == 1;
                        continue;
                    }
                    if (var370 == 1303) {
                        var4--;
                        var73.field2678 = field386[var4];
                        continue;
                    }
                    if (var370 == 1304) {
                        var4--;
                        var73.field2650 = field386[var4];
                        continue;
                    }
                    if (var370 == 1305) {
                        var5--;
                        var73.field2693 = field385[var5];
                        continue;
                    }
                    if (var370 == 1306) {
                        var5--;
                        var73.field2652 = field385[var5];
                        continue;
                    }
                    if (var370 == 1307) {
                        var73.field2647 = null;
                        continue;
                    }
                } else {
                    if (var370 >= 1400 && var370 < 1500 || var370 >= 2400 && var370 < 2500) {
                        class158 var77;
                        if (var370 >= 2000) {
                            var370 -= 1000;
                            var4--;
                            var77 = class158.method792(field386[var4]);
                        } else {
                            var77 = var50 ? Statics.field78 : Statics.field383;
                        }
                        var5--;
                        String var78 = field385[var5];
                        int[] var79 = null;
                        if (var78.length() > 0 && var78.charAt(var78.length() - 1) == 'Y') {
                            var4--;
                            int var80 = field386[var4];
                            if (var80 > 0) {
                                var79 = new int[var80];
                                while (var80-- > 0) {
                                    var4--;
                                    var79[var80] = field386[var4];
                                }
                            }
                            var78 = var78.substring(0, var78.length() - 1);
                        }
                        Object[] var81 = new Object[var78.length() + 1];
                        for (int var82 = var81.length - 1; var82 >= 1; var82--) {
                            if (var78.charAt(var82 - 1) == 's') {
                                var5--;
                                var81[var82] = field385[var5];
                            } else {
                                var4--;
                                var81[var82] = Integer.valueOf(field386[var4]);
                            }
                        }
                        var4--;
                        int var83 = field386[var4];
                        if (var83 == -1) {
                            var81 = null;
                        } else {
                            var81[0] = Integer.valueOf(var83);
                        }
                        if (var370 == 1400) {
                            var77.field2655 = var81;
                        }
                        if (var370 == 1401) {
                            var77.field2658 = var81;
                        }
                        if (var370 == 1402) {
                            var77.field2585 = var81;
                        }
                        if (var370 == 1403) {
                            var77.field2659 = var81;
                        }
                        if (var370 == 1404) {
                            var77.field2661 = var81;
                        }
                        if (var370 == 1405) {
                            var77.field2662 = var81;
                        }
                        if (var370 == 1406) {
                            var77.field2580 = var81;
                        }
                        if (var370 == 1407) {
                            var77.field2666 = var81;
                            var77.field2698 = var79;
                        }
                        if (var370 == 1408) {
                            var77.field2690 = var81;
                        }
                        if (var370 == 1409) {
                            var77.field2673 = var81;
                        }
                        if (var370 == 1410) {
                            var77.field2663 = var81;
                        }
                        if (var370 == 1411) {
                            var77.field2597 = var81;
                        }
                        if (var370 == 1412) {
                            var77.field2660 = var81;
                        }
                        if (var370 == 1414) {
                            var77.field2620 = var81;
                            var77.field2628 = var79;
                        }
                        if (var370 == 1415) {
                            var77.field2616 = var81;
                            var77.field2696 = var79;
                        }
                        if (var370 == 1416) {
                            var77.field2664 = var81;
                        }
                        if (var370 == 1417) {
                            var77.field2603 = var81;
                        }
                        if (var370 == 1418) {
                            var77.field2675 = var81;
                        }
                        if (var370 == 1419) {
                            var77.field2586 = var81;
                        }
                        if (var370 == 1420) {
                            var77.field2677 = var81;
                        }
                        if (var370 == 1421) {
                            var77.field2578 = var81;
                        }
                        if (var370 == 1422) {
                            var77.field2679 = var81;
                        }
                        if (var370 == 1423) {
                            var77.field2680 = var81;
                        }
                        if (var370 == 1424) {
                            var77.field2681 = var81;
                        }
                        var77.field2653 = true;
                        continue;
                    }
                    if (var370 < 1600) {
                        class158 var84 = var50 ? Statics.field78 : Statics.field383;
                        if (var370 == 1500) {
                            field386[var4++] = var84.field2672;
                            continue;
                        }
                        if (var370 == 1501) {
                            field386[var4++] = var84.field2592;
                            continue;
                        }
                        if (var370 == 1502) {
                            field386[var4++] = var84.field2613;
                            continue;
                        }
                        if (var370 == 1503) {
                            field386[var4++] = var84.field2697;
                            continue;
                        }
                        if (var370 == 1504) {
                            field386[var4++] = var84.field2598 ? 1 : 0;
                            continue;
                        }
                        if (var370 == 1505) {
                            field386[var4++] = var84.field2686;
                            continue;
                        }
                    } else if (var370 < 1700) {
                        class158 var85 = var50 ? Statics.field78 : Statics.field383;
                        if (var370 == 1600) {
                            field386[var4++] = var85.field2599;
                            continue;
                        }
                        if (var370 == 1601) {
                            field386[var4++] = var85.field2600;
                            continue;
                        }
                        if (var370 == 1602) {
                            field385[var5++] = var85.field2633;
                            continue;
                        }
                        if (var370 == 1603) {
                            field386[var4++] = var85.field2601;
                            continue;
                        }
                        if (var370 == 1604) {
                            field386[var4++] = var85.field2602;
                            continue;
                        }
                        if (var370 == 1605) {
                            field386[var4++] = var85.field2629;
                            continue;
                        }
                        if (var370 == 1606) {
                            field386[var4++] = var85.field2626;
                            continue;
                        }
                        if (var370 == 1607) {
                            field386[var4++] = var85.field2682;
                            continue;
                        }
                        if (var370 == 1608) {
                            field386[var4++] = var85.field2627;
                            continue;
                        }
                    } else if (var370 < 1800) {
                        class158 var86 = var50 ? Statics.field78 : Statics.field383;
                        if (var370 == 1700) {
                            field386[var4++] = var86.field2667;
                            continue;
                        }
                        if (var370 == 1701) {
                            if (var86.field2667 == -1) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = var86.field2691;
                            }
                            continue;
                        }
                        if (var370 == 1702) {
                            field386[var4++] = var86.field2587;
                            continue;
                        }
                    } else if (var370 < 1900) {
                        class158 var87 = var50 ? Statics.field78 : Statics.field383;
                        if (var370 == 1800) {
                            int[] var88 = field386;
                            int var89 = var4++;
                            int var90 = client.method29(var87);
                            int var91 = var90 >> 11 & 0x3F;
                            var88[var89] = var91;
                            continue;
                        }
                        if (var370 == 1801) {
                            var4--;
                            int var92 = field386[var4];
                            int var371 = var92 - 1;
                            if (var87.field2647 != null && var371 < var87.field2647.length && var87.field2647[var371] != null) {
                                field385[var5++] = var87.field2647[var371];
                                continue;
                            }
                            field385[var5++] = "";
                            continue;
                        }
                        if (var370 == 1802) {
                            if (var87.field2693 == null) {
                                field385[var5++] = "";
                            } else {
                                field385[var5++] = var87.field2693;
                            }
                            continue;
                        }
                    } else if (var370 < 2600) {
                        var4--;
                        class158 var93 = class158.method792(field386[var4]);
                        if (var370 == 2500) {
                            field386[var4++] = var93.field2672;
                            continue;
                        }
                        if (var370 == 2501) {
                            field386[var4++] = var93.field2592;
                            continue;
                        }
                        if (var370 == 2502) {
                            field386[var4++] = var93.field2613;
                            continue;
                        }
                        if (var370 == 2503) {
                            field386[var4++] = var93.field2697;
                            continue;
                        }
                        if (var370 == 2504) {
                            field386[var4++] = var93.field2598 ? 1 : 0;
                            continue;
                        }
                        if (var370 == 2505) {
                            field386[var4++] = var93.field2686;
                            continue;
                        }
                    } else if (var370 < 2700) {
                        var4--;
                        class158 var94 = class158.method792(field386[var4]);
                        if (var370 == 2600) {
                            field386[var4++] = var94.field2599;
                            continue;
                        }
                        if (var370 == 2601) {
                            field386[var4++] = var94.field2600;
                            continue;
                        }
                        if (var370 == 2602) {
                            field385[var5++] = var94.field2633;
                            continue;
                        }
                        if (var370 == 2603) {
                            field386[var4++] = var94.field2601;
                            continue;
                        }
                        if (var370 == 2604) {
                            field386[var4++] = var94.field2602;
                            continue;
                        }
                        if (var370 == 2605) {
                            field386[var4++] = var94.field2629;
                            continue;
                        }
                        if (var370 == 2606) {
                            field386[var4++] = var94.field2626;
                            continue;
                        }
                        if (var370 == 2607) {
                            field386[var4++] = var94.field2682;
                            continue;
                        }
                        if (var370 == 2608) {
                            field386[var4++] = var94.field2627;
                            continue;
                        }
                    } else if (var370 < 2800) {
                        if (var370 == 2700) {
                            var4--;
                            class158 var95 = class158.method792(field386[var4]);
                            field386[var4++] = var95.field2667;
                            continue;
                        }
                        if (var370 == 2701) {
                            var4--;
                            class158 var96 = class158.method792(field386[var4]);
                            if (var96.field2667 == -1) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = var96.field2691;
                            }
                            continue;
                        }
                        if (var370 == 2702) {
                            var4--;
                            int var97 = field386[var4];
                            class4 var98 = (class4) client.field622.method3337((long) var97);
                            if (var98 == null) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var370 < 2900) {
                        var4--;
                        class158 var99 = class158.method792(field386[var4]);
                        if (var370 == 2800) {
                            field386[var4++] = class162.method2142(client.method29(var99));
                            continue;
                        }
                        if (var370 == 2801) {
                            var4--;
                            int var100 = field386[var4];
                            int var372 = var100 - 1;
                            if (var99.field2647 != null && var372 < var99.field2647.length && var99.field2647[var372] != null) {
                                field385[var5++] = var99.field2647[var372];
                                continue;
                            }
                            field385[var5++] = "";
                            continue;
                        }
                        if (var370 == 2802) {
                            if (var99.field2693 == null) {
                                field385[var5++] = "";
                            } else {
                                field385[var5++] = var99.field2693;
                            }
                            continue;
                        }
                    } else if (var370 < 3200) {
                        if (var370 == 3100) {
                            var5--;
                            String var101 = field385[var5];
                            client.method2740(0, "", var101);
                            continue;
                        }
                        if (var370 == 3101) {
                            var4 -= 2;
                            client.method2058(Statics.field147, field386[var4], field386[var4 + 1]);
                            continue;
                        }
                        if (var370 == 3103) {
                            client.method150();
                            continue;
                        }
                        if (var370 == 3104) {
                            var5--;
                            String var102 = field385[var5];
                            int var103 = 0;
                            if (class147.method2699(var102)) {
                                var103 = class147.method2698(var102);
                            }
                            client.field509.method2337(92);
                            client.field509.method2563(var103);
                            continue;
                        }
                        if (var370 == 3105) {
                            var5--;
                            String var104 = field385[var5];
                            client.field509.method2337(164);
                            client.field509.method2444(var104.length() + 1);
                            client.field509.method2484(var104);
                            continue;
                        }
                        if (var370 == 3106) {
                            var5--;
                            String var105 = field385[var5];
                            client.field509.method2337(26);
                            client.field509.method2444(var105.length() + 1);
                            client.field509.method2484(var105);
                            continue;
                        }
                        if (var370 == 3107) {
                            var4--;
                            int var106 = field386[var4];
                            var5--;
                            String var107 = field385[var5];
                            client.method146(var106, var107);
                            continue;
                        }
                        if (var370 == 3108) {
                            var4 -= 3;
                            int var108 = field386[var4];
                            int var109 = field386[var4 + 1];
                            int var110 = field386[var4 + 2];
                            class158 var111 = class158.method792(var110);
                            if (client.field632 == null && !client.field694 && var111 != null && client.method212(var111) != null) {
                                client.field632 = var111;
                                client.field633 = client.method212(var111);
                                client.field505 = var108;
                                client.field635 = var109;
                                Statics.field1013 = 0;
                                client.field627 = false;
                            }
                            continue;
                        }
                        if (var370 == 3109) {
                            var4 -= 2;
                            int var112 = field386[var4];
                            int var113 = field386[var4 + 1];
                            class158 var114 = var50 ? Statics.field78 : Statics.field383;
                            if (client.field632 == null && !client.field694 && var114 != null && client.method212(var114) != null) {
                                client.field632 = var114;
                                client.field633 = client.method212(var114);
                                client.field505 = var112;
                                client.field635 = var113;
                                Statics.field1013 = 0;
                                client.field627 = false;
                            }
                            continue;
                        }
                    } else if (var370 < 3300) {
                        if (var370 == 3200) {
                            var4 -= 3;
                            client.method895(field386[var4], field386[var4 + 1], field386[var4 + 2]);
                            continue;
                        }
                        if (var370 == 3201) {
                            var4--;
                            client.method16(field386[var4]);
                            continue;
                        }
                        if (var370 == 3202) {
                            var4 -= 2;
                            client.method162(field386[var4], field386[var4 + 1]);
                            continue;
                        }
                    } else if (var370 < 3400) {
                        if (var370 == 3300) {
                            field386[var4++] = client.field691;
                            continue;
                        }
                        if (var370 == 3301) {
                            var4 -= 2;
                            int var115 = field386[var4];
                            int var116 = field386[var4 + 1];
                            field386[var4++] = class19.method597(var115, var116);
                            continue;
                        }
                        if (var370 == 3302) {
                            var4 -= 2;
                            int var117 = field386[var4];
                            int var118 = field386[var4 + 1];
                            field386[var4++] = class19.method2224(var117, var118);
                            continue;
                        }
                        if (var370 == 3303) {
                            var4 -= 2;
                            int var119 = field386[var4];
                            int var120 = field386[var4 + 1];
                            field386[var4++] = class19.method3405(var119, var120);
                            continue;
                        }
                        if (var370 == 3304) {
                            var4--;
                            int var121 = field386[var4];
                            field386[var4++] = class41.method2331(var121).field1012;
                            continue;
                        }
                        if (var370 == 3305) {
                            var4--;
                            int var122 = field386[var4];
                            field386[var4++] = client.field598[var122];
                            continue;
                        }
                        if (var370 == 3306) {
                            var4--;
                            int var123 = field386[var4];
                            field386[var4++] = client.field599[var123];
                            continue;
                        }
                        if (var370 == 3307) {
                            var4--;
                            int var124 = field386[var4];
                            field386[var4++] = client.field600[var124];
                            continue;
                        }
                        if (var370 == 3308) {
                            int var125 = Statics.field68;
                            int var126 = (Statics.field147.field444 >> 7) + Statics.field47;
                            int var127 = (Statics.field147.field399 >> 7) + Statics.field196;
                            field386[var4++] = (var125 << 28) + (var126 << 14) + var127;
                            continue;
                        }
                        if (var370 == 3309) {
                            var4--;
                            int var128 = field386[var4];
                            field386[var4++] = var128 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var370 == 3310) {
                            var4--;
                            int var129 = field386[var4];
                            field386[var4++] = var129 >> 28;
                            continue;
                        }
                        if (var370 == 3311) {
                            var4--;
                            int var130 = field386[var4];
                            field386[var4++] = var130 & 0x3FFF;
                            continue;
                        }
                        if (var370 == 3312) {
                            field386[var4++] = client.field564 ? 1 : 0;
                            continue;
                        }
                        if (var370 == 3313) {
                            var4 -= 2;
                            int var131 = field386[var4] + 32768;
                            int var132 = field386[var4 + 1];
                            field386[var4++] = class19.method597(var131, var132);
                            continue;
                        }
                        if (var370 == 3314) {
                            var4 -= 2;
                            int var133 = field386[var4] + 32768;
                            int var134 = field386[var4 + 1];
                            field386[var4++] = class19.method2224(var133, var134);
                            continue;
                        }
                        if (var370 == 3315) {
                            var4 -= 2;
                            int var135 = field386[var4] + 32768;
                            int var136 = field386[var4 + 1];
                            field386[var4++] = class19.method3405(var135, var136);
                            continue;
                        }
                        if (var370 == 3316) {
                            if (client.field628 >= 2) {
                                field386[var4++] = client.field628;
                            } else {
                                field386[var4++] = 0;
                            }
                            continue;
                        }
                        if (var370 == 3317) {
                            field386[var4++] = client.field475;
                            continue;
                        }
                        if (var370 == 3318) {
                            field386[var4++] = client.field665;
                            continue;
                        }
                        if (var370 == 3321) {
                            field386[var4++] = client.field685;
                            continue;
                        }
                        if (var370 == 3322) {
                            field386[var4++] = client.field481;
                            continue;
                        }
                        if (var370 == 3323) {
                            if (client.field629) {
                                field386[var4++] = 1;
                            } else {
                                field386[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var370 < 3500) {
                        if (var370 == 3400) {
                            var4 -= 2;
                            int var137 = field386[var4];
                            int var138 = field386[var4 + 1];
                            class39 var139 = (class39) class39.field948.method3288((long) var137);
                            class39 var140;
                            if (var139 == null) {
                                byte[] var141 = Statics.field954.method2991(8, var137);
                                class39 var142 = new class39();
                                if (var141 != null) {
                                    var142.method829(new class127(var141));
                                }
                                class39.field948.method3291(var142, (long) var137);
                                var140 = var142;
                            } else {
                                var140 = var139;
                            }
                            class39 var143 = var140;
                            if (var140.field950 != 's') {
                            }
                            for (int var144 = 0; var144 < var143.field953; var144++) {
                                if (var143.field956[var144] == var138) {
                                    field385[var5++] = var143.field951[var144];
                                    var143 = null;
                                    break;
                                }
                            }
                            if (var143 != null) {
                                field385[var5++] = var143.field962;
                            }
                            continue;
                        }
                        if (var370 == 3408) {
                            var4 -= 4;
                            int var145 = field386[var4];
                            int var146 = field386[var4 + 1];
                            int var147 = field386[var4 + 2];
                            int var148 = field386[var4 + 3];
                            class39 var149 = (class39) class39.field948.method3288((long) var147);
                            class39 var150;
                            if (var149 == null) {
                                byte[] var151 = Statics.field954.method2991(8, var147);
                                class39 var152 = new class39();
                                if (var151 != null) {
                                    var152.method829(new class127(var151));
                                }
                                class39.field948.method3291(var152, (long) var147);
                                var150 = var152;
                            } else {
                                var150 = var149;
                            }
                            class39 var153 = var150;
                            if (var150.field949 == var145 && var150.field950 == var146) {
                                for (int var154 = 0; var154 < var153.field953; var154++) {
                                    if (var153.field956[var154] == var148) {
                                        if (var146 == 115) {
                                            field385[var5++] = var153.field951[var154];
                                        } else {
                                            field386[var4++] = var153.field947[var154];
                                        }
                                        var153 = null;
                                        break;
                                    }
                                }
                                if (var153 != null) {
                                    if (var146 == 115) {
                                        field385[var5++] = var153.field962;
                                    } else {
                                        field386[var4++] = var153.field952;
                                    }
                                }
                                continue;
                            }
                            if (var146 == 115) {
                                field385[var5++] = "null";
                            } else {
                                field386[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var370 < 3700) {
                        if (var370 == 3600) {
                            if (client.field714 == 0) {
                                field386[var4++] = -2;
                            } else if (client.field714 == 1) {
                                field386[var4++] = -1;
                            } else {
                                field386[var4++] = client.field703;
                            }
                            continue;
                        }
                        if (var370 == 3601) {
                            var4--;
                            int var155 = field386[var4];
                            if (client.field714 == 2 && var155 < client.field703) {
                                field385[var5++] = client.field715[var155].field353;
                                continue;
                            }
                            field385[var5++] = "";
                            continue;
                        }
                        if (var370 == 3602) {
                            var4--;
                            int var156 = field386[var4];
                            if (client.field714 == 2 && var156 < client.field703) {
                                field386[var4++] = client.field715[var156].field354;
                                continue;
                            }
                            field386[var4++] = 0;
                            continue;
                        }
                        if (var370 == 3603) {
                            var4--;
                            int var157 = field386[var4];
                            if (client.field714 == 2 && var157 < client.field703) {
                                field386[var4++] = client.field715[var157].field355;
                                continue;
                            }
                            field386[var4++] = 0;
                            continue;
                        }
                        if (var370 == 3604) {
                            var5--;
                            String var158 = field385[var5];
                            var4--;
                            int var159 = field386[var4];
                            client.field509.method2337(61);
                            client.field509.method2444(class127.method2052(var158) + 1);
                            client.field509.method2484(var158);
                            client.field509.method2444(var159);
                            continue;
                        }
                        if (var370 == 3605) {
                            var5--;
                            String var160 = field385[var5];
                            client.method2140(var160);
                            continue;
                        }
                        if (var370 == 3606) {
                            var5--;
                            String var161 = field385[var5];
                            if (var161 == null) {
                                continue;
                            }
                            String var162 = class148.method2054(var161, Statics.field1304);
                            if (var162 == null) {
                                continue;
                            }
                            int var163 = 0;
                            while (true) {
                                if (var163 >= client.field703) {
                                    continue label2296;
                                }
                                class23 var164 = client.field715[var163];
                                String var165 = var164.field353;
                                String var166 = class148.method2054(var165, Statics.field1304);
                                boolean var167;
                                if (var161 == null || var165 == null) {
                                    var167 = false;
                                } else if (var161.startsWith("#") || var165.startsWith("#")) {
                                    var167 = var161.equals(var165);
                                } else {
                                    var167 = var162.equals(var166);
                                }
                                if (var167) {
                                    client.field703--;
                                    for (int var168 = var163; var168 < client.field703; var168++) {
                                        client.field715[var168] = client.field715[var168 + 1];
                                    }
                                    client.field652 = client.field646;
                                    client.field509.method2337(124);
                                    client.field509.method2444(class127.method2052(var161));
                                    client.field509.method2484(var161);
                                    continue label2296;
                                }
                                var163++;
                            }
                        }
                        if (var370 == 3607) {
                            var5--;
                            String var169 = field385[var5];
                            client.method1570(var169, false);
                            continue;
                        }
                        if (var370 == 3608) {
                            var5--;
                            String var170 = field385[var5];
                            client.method596(var170);
                            continue;
                        }
                        if (var370 == 3609) {
                            var5--;
                            String var171 = field385[var5];
                            if (var171.startsWith(class2.method1873(0)) || var171.startsWith(class2.method1873(1))) {
                                var171 = var171.substring(7);
                            }
                            int[] var172 = field386;
                            int var173 = var4++;
                            boolean var174;
                            if (var171 == null) {
                                var174 = false;
                            } else {
                                String var175 = class148.method2054(var171, Statics.field1304);
                                int var176 = 0;
                                while (true) {
                                    if (var176 >= client.field703) {
                                        if (var171.equalsIgnoreCase(class148.method2054(Statics.field147.field39, Statics.field1304))) {
                                            var174 = true;
                                        } else {
                                            var174 = false;
                                        }
                                        break;
                                    }
                                    if (var175.equalsIgnoreCase(class148.method2054(client.field715[var176].field353, Statics.field1304))) {
                                        var174 = true;
                                        break;
                                    }
                                    var176++;
                                }
                            }
                            var172[var173] = var174 ? 1 : 0;
                            continue;
                        }
                        if (var370 == 3611) {
                            if (client.field686 == null) {
                                field385[var5++] = "";
                                continue;
                            }
                            String[] var177 = field385;
                            int var178 = var5++;
                            String var179 = client.field686;
                            long var180 = 0L;
                            int var182 = var179.length();
                            for (int var183 = 0; var183 < var182; var183++) {
                                var180 *= 37L;
                                char var184 = var179.charAt(var183);
                                if (var184 >= 'A' && var184 <= 'Z') {
                                    var180 += (long) (var184 + 1 - 65);
                                } else if (var184 >= 'a' && var184 <= 'z') {
                                    var180 += (long) (var184 + 1 - 97);
                                } else if (var184 >= '0' && var184 <= '9') {
                                    var180 += (long) (var184 + 27 - 48);
                                }
                                if (var180 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var180 % 37L == 0L && var180 != 0L) {
                                var180 /= 37L;
                            }
                            String var187 = class146.method2389(var180);
                            if (var187 == null) {
                                var187 = "";
                            }
                            var177[var178] = var187;
                            continue;
                        }
                        if (var370 == 3612) {
                            if (client.field686 == null) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = Statics.field2570;
                            }
                            continue;
                        }
                        if (var370 == 3613) {
                            var4--;
                            int var189 = field386[var4];
                            if (client.field686 != null && var189 < Statics.field2570) {
                                field385[var5++] = Statics.field1436[var189].field105;
                                continue;
                            }
                            field385[var5++] = "";
                            continue;
                        }
                        if (var370 == 3614) {
                            var4--;
                            int var190 = field386[var4];
                            if (client.field686 != null && var190 < Statics.field2570) {
                                field386[var4++] = Statics.field1436[var190].field113;
                                continue;
                            }
                            field386[var4++] = 0;
                            continue;
                        }
                        if (var370 == 3615) {
                            var4--;
                            int var191 = field386[var4];
                            if (client.field686 != null && var191 < Statics.field2570) {
                                field386[var4++] = Statics.field1436[var191].field111;
                                continue;
                            }
                            field386[var4++] = 0;
                            continue;
                        }
                        if (var370 == 3616) {
                            field386[var4++] = Statics.field1384;
                            continue;
                        }
                        if (var370 == 3617) {
                            var5--;
                            String var192 = field385[var5];
                            if (Statics.field1436 != null) {
                                client.field509.method2337(138);
                                client.field509.method2444(class127.method2052(var192));
                                client.field509.method2484(var192);
                            }
                            continue;
                        }
                        if (var370 == 3618) {
                            field386[var4++] = Statics.field393;
                            continue;
                        }
                        if (var370 == 3619) {
                            var5--;
                            String var193 = field385[var5];
                            client.method6(var193);
                            continue;
                        }
                        if (var370 == 3620) {
                            client.method1659();
                            continue;
                        }
                        if (var370 == 3621) {
                            if (client.field714 == 0) {
                                field386[var4++] = -1;
                            } else {
                                field386[var4++] = client.field470;
                            }
                            continue;
                        }
                        if (var370 == 3622) {
                            var4--;
                            int var194 = field386[var4];
                            if (client.field714 != 0 && var194 < client.field470) {
                                field385[var5++] = client.field718[var194].field172;
                                continue;
                            }
                            field385[var5++] = "";
                            continue;
                        }
                        if (var370 == 3623) {
                            var5--;
                            String var195 = field385[var5];
                            if (var195.startsWith(class2.method1873(0)) || var195.startsWith(class2.method1873(1))) {
                                var195 = var195.substring(7);
                            }
                            field386[var4++] = client.method200(var195) ? 1 : 0;
                            continue;
                        }
                        if (var370 == 3624) {
                            var4--;
                            int var196 = field386[var4];
                            if (Statics.field1436 != null && var196 < Statics.field2570 && Statics.field1436[var196].field105.equalsIgnoreCase(Statics.field147.field39)) {
                                field386[var4++] = 1;
                                continue;
                            }
                            field386[var4++] = 0;
                            continue;
                        }
                        if (var370 == 3625) {
                            if (client.field687 == null) {
                                field385[var5++] = "";
                                continue;
                            }
                            String[] var197 = field385;
                            int var198 = var5++;
                            String var199 = client.field687;
                            long var200 = 0L;
                            int var202 = var199.length();
                            for (int var203 = 0; var203 < var202; var203++) {
                                var200 *= 37L;
                                char var204 = var199.charAt(var203);
                                if (var204 >= 'A' && var204 <= 'Z') {
                                    var200 += (long) (var204 + 1 - 65);
                                } else if (var204 >= 'a' && var204 <= 'z') {
                                    var200 += (long) (var204 + 1 - 97);
                                } else if (var204 >= '0' && var204 <= '9') {
                                    var200 += (long) (var204 + 27 - 48);
                                }
                                if (var200 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var200 % 37L == 0L && var200 != 0L) {
                                var200 /= 37L;
                            }
                            String var207 = class146.method2389(var200);
                            if (var207 == null) {
                                var207 = "";
                            }
                            var197[var198] = var207;
                            continue;
                        }
                    } else if (var370 < 4100) {
                        if (var370 == 4000) {
                            var4 -= 2;
                            int var209 = field386[var4];
                            int var210 = field386[var4 + 1];
                            field386[var4++] = var209 + var210;
                            continue;
                        }
                        if (var370 == 4001) {
                            var4 -= 2;
                            int var211 = field386[var4];
                            int var212 = field386[var4 + 1];
                            field386[var4++] = var211 - var212;
                            continue;
                        }
                        if (var370 == 4002) {
                            var4 -= 2;
                            int var213 = field386[var4];
                            int var214 = field386[var4 + 1];
                            field386[var4++] = var213 * var214;
                            continue;
                        }
                        if (var370 == 4003) {
                            var4 -= 2;
                            int var215 = field386[var4];
                            int var216 = field386[var4 + 1];
                            field386[var4++] = var215 / var216;
                            continue;
                        }
                        if (var370 == 4004) {
                            var4--;
                            int var217 = field386[var4];
                            field386[var4++] = (int) (Math.random() * (double) var217);
                            continue;
                        }
                        if (var370 == 4005) {
                            var4--;
                            int var218 = field386[var4];
                            field386[var4++] = (int) (Math.random() * (double) (var218 + 1));
                            continue;
                        }
                        if (var370 == 4006) {
                            var4 -= 5;
                            int var219 = field386[var4];
                            int var220 = field386[var4 + 1];
                            int var221 = field386[var4 + 2];
                            int var222 = field386[var4 + 3];
                            int var223 = field386[var4 + 4];
                            field386[var4++] = (var220 - var219) * (var223 - var221) / (var222 - var221) + var219;
                            continue;
                        }
                        if (var370 == 4007) {
                            var4 -= 2;
                            int var224 = field386[var4];
                            int var225 = field386[var4 + 1];
                            field386[var4++] = var224 * var225 / 100 + var224;
                            continue;
                        }
                        if (var370 == 4008) {
                            var4 -= 2;
                            int var226 = field386[var4];
                            int var227 = field386[var4 + 1];
                            field386[var4++] = var226 | 0x1 << var227;
                            continue;
                        }
                        if (var370 == 4009) {
                            var4 -= 2;
                            int var228 = field386[var4];
                            int var229 = field386[var4 + 1];
                            field386[var4++] = var228 & -1 - (0x1 << var229);
                            continue;
                        }
                        if (var370 == 4010) {
                            var4 -= 2;
                            int var230 = field386[var4];
                            int var231 = field386[var4 + 1];
                            field386[var4++] = (var230 & 0x1 << var231) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var370 == 4011) {
                            var4 -= 2;
                            int var232 = field386[var4];
                            int var233 = field386[var4 + 1];
                            field386[var4++] = var232 % var233;
                            continue;
                        }
                        if (var370 == 4012) {
                            var4 -= 2;
                            int var234 = field386[var4];
                            int var235 = field386[var4 + 1];
                            if (var234 == 0) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = (int) Math.pow((double) var234, (double) var235);
                            }
                            continue;
                        }
                        if (var370 == 4013) {
                            var4 -= 2;
                            int var236 = field386[var4];
                            int var237 = field386[var4 + 1];
                            if (var236 == 0) {
                                field386[var4++] = 0;
                            } else if (var237 == 0) {
                                field386[var4++] = Integer.MAX_VALUE;
                            } else {
                                field386[var4++] = (int) Math.pow((double) var236, 1.0D / (double) var237);
                            }
                            continue;
                        }
                        if (var370 == 4014) {
                            var4 -= 2;
                            int var238 = field386[var4];
                            int var239 = field386[var4 + 1];
                            field386[var4++] = var238 & var239;
                            continue;
                        }
                        if (var370 == 4015) {
                            var4 -= 2;
                            int var240 = field386[var4];
                            int var241 = field386[var4 + 1];
                            field386[var4++] = var240 | var241;
                            continue;
                        }
                    } else if (var370 < 4200) {
                        if (var370 == 4100) {
                            var5--;
                            String var242 = field385[var5];
                            var4--;
                            int var243 = field386[var4];
                            field385[var5++] = var242 + var243;
                            continue;
                        }
                        if (var370 == 4101) {
                            var5 -= 2;
                            String var244 = field385[var5];
                            String var245 = field385[var5 + 1];
                            field385[var5++] = var244 + var245;
                            continue;
                        }
                        if (var370 == 4102) {
                            var5--;
                            String var246 = field385[var5];
                            var4--;
                            int var247 = field386[var4];
                            field385[var5++] = var246 + class147.method36(var247, true);
                            continue;
                        }
                        if (var370 == 4103) {
                            var5--;
                            String var248 = field385[var5];
                            field385[var5++] = var248.toLowerCase();
                            continue;
                        }
                        if (var370 == 4104) {
                            var4--;
                            int var249 = field386[var4];
                            long var250 = ((long) var249 + 11745L) * 86400000L;
                            field397.setTime(new Date(var250));
                            int var252 = field397.get(5);
                            int var253 = field397.get(2);
                            int var254 = field397.get(1);
                            field385[var5++] = var252 + "-" + field390[var253] + "-" + var254;
                            continue;
                        }
                        if (var370 == 4105) {
                            var5 -= 2;
                            String var255 = field385[var5];
                            String var256 = field385[var5 + 1];
                            if (Statics.field147.field29 != null && Statics.field147.field29.field2737) {
                                field385[var5++] = var256;
                                continue;
                            }
                            field385[var5++] = var255;
                            continue;
                        }
                        if (var370 == 4106) {
                            var4--;
                            int var257 = field386[var4];
                            field385[var5++] = Integer.toString(var257);
                            continue;
                        }
                        if (var370 == 4107) {
                            var5 -= 2;
                            int[] var258 = field386;
                            int var259 = var4++;
                            String var260 = field385[var5];
                            String var261 = field385[var5 + 1];
                            int var262 = client.field464;
                            int var263 = var260.length();
                            int var264 = var261.length();
                            int var265 = 0;
                            int var266 = 0;
                            char var267 = 0;
                            char var268 = 0;
                            int var269;
                            label2151: while (true) {
                                if (var265 - var267 >= var263 && var266 - var268 >= var264) {
                                    int var278 = Math.min(var263, var264);
                                    for (int var279 = 0; var279 < var278; var279++) {
                                        char var282 = var260.charAt(var279);
                                        char var283 = var261.charAt(var279);
                                        if (var282 != var283 && Character.toUpperCase(var282) != Character.toUpperCase(var283)) {
                                            char var284 = Character.toLowerCase(var282);
                                            char var285 = Character.toLowerCase(var283);
                                            if (var284 != var285) {
                                                var269 = class150.method2141(var284, var262) - class150.method2141(var285, var262);
                                                break label2151;
                                            }
                                        }
                                    }
                                    int var286 = var263 - var264;
                                    if (var286 == 0) {
                                        for (int var287 = 0; var287 < var278; var287++) {
                                            char var288 = var260.charAt(var287);
                                            char var289 = var261.charAt(var287);
                                            if (var288 != var289) {
                                                var269 = class150.method2141(var288, var262) - class150.method2141(var289, var262);
                                                break label2151;
                                            }
                                        }
                                        var269 = 0;
                                    } else {
                                        var269 = var286;
                                    }
                                    break;
                                }
                                if (var265 - var267 >= var263) {
                                    var269 = -1;
                                    break;
                                }
                                if (var266 - var268 >= var264) {
                                    var269 = 1;
                                    break;
                                }
                                char var270;
                                if (var267 == 0) {
                                    var270 = var260.charAt(var265++);
                                } else {
                                    var270 = var267;
                                    boolean var271 = false;
                                }
                                char var272;
                                if (var268 == 0) {
                                    var272 = var261.charAt(var266++);
                                } else {
                                    var272 = var268;
                                    boolean var273 = false;
                                }
                                var267 = class150.method2944(var270);
                                var268 = class150.method2944(var272);
                                char var274 = class150.method2243(var270, var262);
                                char var275 = class150.method2243(var272, var262);
                                if (var274 != var275 && Character.toUpperCase(var274) != Character.toUpperCase(var275)) {
                                    char var276 = Character.toLowerCase(var274);
                                    char var277 = Character.toLowerCase(var275);
                                    if (var276 != var277) {
                                        var269 = class150.method2141(var276, var262) - class150.method2141(var277, var262);
                                        break;
                                    }
                                }
                            }
                            var258[var259] = class147.method2945(var269);
                            continue;
                        }
                        if (var370 == 4108) {
                            var5--;
                            String var290 = field385[var5];
                            var4 -= 2;
                            int var291 = field386[var4];
                            int var292 = field386[var4 + 1];
                            byte[] var293 = Statics.field1164.method2991(var292, 0);
                            class183 var294 = new class183(var293);
                            field386[var4++] = var294.method3430(var290, var291);
                            continue;
                        }
                        if (var370 == 4109) {
                            var5--;
                            String var295 = field385[var5];
                            var4 -= 2;
                            int var296 = field386[var4];
                            int var297 = field386[var4 + 1];
                            byte[] var298 = Statics.field1164.method2991(var297, 0);
                            class183 var299 = new class183(var298);
                            field386[var4++] = var299.method3433(var295, var296);
                            continue;
                        }
                        if (var370 == 4110) {
                            var5 -= 2;
                            String var300 = field385[var5];
                            String var301 = field385[var5 + 1];
                            var4--;
                            if (field386[var4] == 1) {
                                field385[var5++] = var300;
                            } else {
                                field385[var5++] = var301;
                            }
                            continue;
                        }
                        if (var370 == 4111) {
                            var5--;
                            String var302 = field385[var5];
                            field385[var5++] = class185.method3435(var302);
                            continue;
                        }
                        if (var370 == 4112) {
                            var5--;
                            String var303 = field385[var5];
                            var4--;
                            int var304 = field386[var4];
                            field385[var5++] = var303 + (char) var304;
                            continue;
                        }
                        if (var370 == 4113) {
                            var4--;
                            int var305 = field386[var4];
                            field386[var4++] = class147.method2404((char) var305) ? 1 : 0;
                            continue;
                        }
                        if (var370 == 4114) {
                            var4--;
                            int var306 = field386[var4];
                            field386[var4++] = class147.method1540((char) var306) ? 1 : 0;
                            continue;
                        }
                        if (var370 == 4115) {
                            var4--;
                            int var307 = field386[var4];
                            field386[var4++] = class147.method598((char) var307) ? 1 : 0;
                            continue;
                        }
                        if (var370 == 4116) {
                            var4--;
                            int var308 = field386[var4];
                            field386[var4++] = class147.method1614((char) var308) ? 1 : 0;
                            continue;
                        }
                        if (var370 == 4117) {
                            var5--;
                            String var309 = field385[var5];
                            if (var309 == null) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = var309.length();
                            }
                            continue;
                        }
                        if (var370 == 4118) {
                            var5--;
                            String var310 = field385[var5];
                            var4 -= 2;
                            int var311 = field386[var4];
                            int var312 = field386[var4 + 1];
                            field385[var5++] = var310.substring(var311, var312);
                            continue;
                        }
                        if (var370 == 4119) {
                            var5--;
                            String var313 = field385[var5];
                            StringBuilder var314 = new StringBuilder(var313.length());
                            boolean var315 = false;
                            for (int var316 = 0; var316 < var313.length(); var316++) {
                                char var317 = var313.charAt(var316);
                                if (var317 == '<') {
                                    var315 = true;
                                } else if (var317 == '>') {
                                    var315 = false;
                                } else if (!var315) {
                                    var314.append(var317);
                                }
                            }
                            field385[var5++] = var314.toString();
                            continue;
                        }
                        if (var370 == 4120) {
                            var5--;
                            String var318 = field385[var5];
                            var4--;
                            int var319 = field386[var4];
                            field386[var4++] = var318.indexOf(var319);
                            continue;
                        }
                    } else if (var370 < 4300) {
                        if (var370 == 4200) {
                            var4--;
                            int var320 = field386[var4];
                            field385[var5++] = class40.method30(var320).field989;
                            continue;
                        }
                        if (var370 == 4201) {
                            var4 -= 2;
                            int var321 = field386[var4];
                            int var322 = field386[var4 + 1];
                            class40 var323 = class40.method30(var321);
                            if (var322 >= 1 && var322 <= 5 && var323.field984[var322 - 1] != null) {
                                field385[var5++] = var323.field984[var322 - 1];
                                continue;
                            }
                            field385[var5++] = "";
                            continue;
                        }
                        if (var370 == 4202) {
                            var4 -= 2;
                            int var324 = field386[var4];
                            int var325 = field386[var4 + 1];
                            class40 var326 = class40.method30(var324);
                            if (var325 >= 1 && var325 <= 5 && var326.field980[var325 - 1] != null) {
                                field385[var5++] = var326.field980[var325 - 1];
                                continue;
                            }
                            field385[var5++] = "";
                            continue;
                        }
                        if (var370 == 4203) {
                            var4--;
                            int var327 = field386[var4];
                            field386[var4++] = class40.method30(var327).field1009;
                            continue;
                        }
                        if (var370 == 4204) {
                            var4--;
                            int var328 = field386[var4];
                            field386[var4++] = class40.method30(var328).field981 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var370 == 4205) {
                            var4--;
                            int var329 = field386[var4];
                            class40 var330 = class40.method30(var329);
                            if (var330.field1001 == -1 && var330.field1000 >= 0) {
                                field386[var4++] = var330.field1000;
                                continue;
                            }
                            field386[var4++] = var329;
                            continue;
                        }
                        if (var370 == 4206) {
                            var4--;
                            int var331 = field386[var4];
                            class40 var332 = class40.method30(var331);
                            if (var332.field1001 >= 0 && var332.field1000 >= 0) {
                                field386[var4++] = var332.field1000;
                                continue;
                            }
                            field386[var4++] = var331;
                            continue;
                        }
                        if (var370 == 4207) {
                            var4--;
                            int var333 = field386[var4];
                            field386[var4++] = class40.method30(var333).field983 ? 1 : 0;
                            continue;
                        }
                    } else if (var370 < 5100) {
                        if (var370 == 5000) {
                            field386[var4++] = client.field678;
                            continue;
                        }
                        if (var370 == 5001) {
                            var4 -= 3;
                            client.field678 = field386[var4];
                            int var334 = field386[var4 + 1];
                            class137[] var335 = class137.method1556();
                            int var336 = 0;
                            class137 var338;
                            while (true) {
                                if (var336 >= var335.length) {
                                    var338 = null;
                                    break;
                                }
                                class137 var337 = var335[var336];
                                if (var337.field2324 == var334) {
                                    var338 = var337;
                                    break;
                                }
                                var336++;
                            }
                            Statics.field239 = var338;
                            if (Statics.field239 == null) {
                                Statics.field239 = class137.field2322;
                            }
                            client.field679 = field386[var4 + 2];
                            client.field509.method2337(173);
                            client.field509.method2444(client.field678);
                            client.field509.method2444(Statics.field239.field2324);
                            client.field509.method2444(client.field679);
                            continue;
                        }
                        if (var370 == 5002) {
                            var5--;
                            String var339 = field385[var5];
                            var4 -= 2;
                            int var340 = field386[var4];
                            int var341 = field386[var4 + 1];
                            client.field509.method2337(120);
                            client.field509.method2444(class127.method2052(var339) + 2);
                            client.field509.method2484(var339);
                            client.field509.method2444(var340 - 1);
                            client.field509.method2444(var341);
                            continue;
                        }
                        if (var370 == 5003) {
                            var4--;
                            int var342 = field386[var4];
                            String var343 = null;
                            if (var342 < 100) {
                                var343 = client.field472[var342];
                            }
                            if (var343 == null) {
                                var343 = "";
                            }
                            field385[var5++] = var343;
                            continue;
                        }
                        if (var370 == 5004) {
                            var4--;
                            int var344 = field386[var4];
                            int var345 = -1;
                            if (var344 < 100 && client.field472[var344] != null) {
                                var345 = client.field500[var344];
                            }
                            field386[var4++] = var345;
                            continue;
                        }
                        if (var370 == 5005) {
                            if (Statics.field239 == null) {
                                field386[var4++] = -1;
                            } else {
                                field386[var4++] = Statics.field239.field2324;
                            }
                            continue;
                        }
                        if (var370 == 5008) {
                            var5--;
                            String var346 = field385[var5];
                            if (var346.startsWith("::")) {
                                client.method1589(var346);
                            } else {
                                String var347 = var346.toLowerCase();
                                byte var348 = 0;
                                if (var347.startsWith(class134.field2104)) {
                                    var348 = 0;
                                    var346 = var346.substring(class134.field2104.length());
                                } else if (var347.startsWith(class134.field2249)) {
                                    var348 = 1;
                                    var346 = var346.substring(class134.field2249.length());
                                } else if (var347.startsWith(class134.field2121)) {
                                    var348 = 2;
                                    var346 = var346.substring(class134.field2121.length());
                                } else if (var347.startsWith(class134.field2253)) {
                                    var348 = 3;
                                    var346 = var346.substring(class134.field2253.length());
                                } else if (var347.startsWith(class134.field2302)) {
                                    var348 = 4;
                                    var346 = var346.substring(class134.field2302.length());
                                } else if (var347.startsWith(class134.field2257)) {
                                    var348 = 5;
                                    var346 = var346.substring(class134.field2257.length());
                                } else if (var347.startsWith(class134.field2297)) {
                                    var348 = 6;
                                    var346 = var346.substring(class134.field2297.length());
                                } else if (var347.startsWith(class134.field2165)) {
                                    var348 = 7;
                                    var346 = var346.substring(class134.field2165.length());
                                } else if (var347.startsWith(class134.field2263)) {
                                    var348 = 8;
                                    var346 = var346.substring(class134.field2263.length());
                                } else if (var347.startsWith(class134.field2296)) {
                                    var348 = 9;
                                    var346 = var346.substring(class134.field2296.length());
                                } else if (var347.startsWith(class134.field2280)) {
                                    var348 = 10;
                                    var346 = var346.substring(class134.field2280.length());
                                } else if (var347.startsWith(class134.field2269)) {
                                    var348 = 11;
                                    var346 = var346.substring(class134.field2269.length());
                                } else if (client.field464 != 0) {
                                    if (var347.startsWith(class134.field2187)) {
                                        var348 = 0;
                                        var346 = var346.substring(class134.field2187.length());
                                    } else if (var347.startsWith(class134.field2250)) {
                                        var348 = 1;
                                        var346 = var346.substring(class134.field2250.length());
                                    } else if (var347.startsWith(class134.field2252)) {
                                        var348 = 2;
                                        var346 = var346.substring(class134.field2252.length());
                                    } else if (var347.startsWith(class134.field2254)) {
                                        var348 = 3;
                                        var346 = var346.substring(class134.field2254.length());
                                    } else if (var347.startsWith(class134.field2219)) {
                                        var348 = 4;
                                        var346 = var346.substring(class134.field2219.length());
                                    } else if (var347.startsWith(class134.field2151)) {
                                        var348 = 5;
                                        var346 = var346.substring(class134.field2151.length());
                                    } else if (var347.startsWith(class134.field2234)) {
                                        var348 = 6;
                                        var346 = var346.substring(class134.field2234.length());
                                    } else if (var347.startsWith(class134.field2262)) {
                                        var348 = 7;
                                        var346 = var346.substring(class134.field2262.length());
                                    } else if (var347.startsWith(class134.field2264)) {
                                        var348 = 8;
                                        var346 = var346.substring(class134.field2264.length());
                                    } else if (var347.startsWith(class134.field2266)) {
                                        var348 = 9;
                                        var346 = var346.substring(class134.field2266.length());
                                    } else if (var347.startsWith(class134.field2268)) {
                                        var348 = 10;
                                        var346 = var346.substring(class134.field2268.length());
                                    } else if (var347.startsWith(class134.field2092)) {
                                        var348 = 11;
                                        var346 = var346.substring(class134.field2092.length());
                                    }
                                }
                                String var349 = var346.toLowerCase();
                                byte var350 = 0;
                                if (var349.startsWith(class134.field2271)) {
                                    var350 = 1;
                                    var346 = var346.substring(class134.field2271.length());
                                } else if (var349.startsWith(class134.field2273)) {
                                    var350 = 2;
                                    var346 = var346.substring(class134.field2273.length());
                                } else if (var349.startsWith(class134.field2275)) {
                                    var350 = 3;
                                    var346 = var346.substring(class134.field2275.length());
                                } else if (var349.startsWith(class134.field2190)) {
                                    var350 = 4;
                                    var346 = var346.substring(class134.field2190.length());
                                } else if (var349.startsWith(class134.field2279)) {
                                    var350 = 5;
                                    var346 = var346.substring(class134.field2279.length());
                                } else if (client.field464 != 0) {
                                    if (var349.startsWith(class134.field2272)) {
                                        var350 = 1;
                                        var346 = var346.substring(class134.field2272.length());
                                    } else if (var349.startsWith(class134.field2274)) {
                                        var350 = 2;
                                        var346 = var346.substring(class134.field2274.length());
                                    } else if (var349.startsWith(class134.field2276)) {
                                        var350 = 3;
                                        var346 = var346.substring(class134.field2276.length());
                                    } else if (var349.startsWith(class134.field2278)) {
                                        var350 = 4;
                                        var346 = var346.substring(class134.field2278.length());
                                    } else if (var349.startsWith(class134.field2236)) {
                                        var350 = 5;
                                        var346 = var346.substring(class134.field2236.length());
                                    }
                                }
                                client.field509.method2337(73);
                                client.field509.method2444(0);
                                int var351 = client.field509.field2036;
                                client.field509.method2444(var348);
                                client.field509.method2444(var350);
                                class116 var352 = client.field509;
                                int var353 = var352.field2036;
                                byte[] var354 = Statics.method1667(var346);
                                var352.method2456(var354.length);
                                var352.field2036 += Statics.field2833.method2396(var354, 0, var354.length, var352.field2037, var352.field2036);
                                client.field509.method2455(client.field509.field2036 - var351);
                            }
                            continue;
                        }
                        if (var370 == 5009) {
                            var5 -= 2;
                            String var355 = field385[var5];
                            String var356 = field385[var5 + 1];
                            client.field509.method2337(10);
                            client.field509.method2445(0);
                            int var357 = client.field509.field2036;
                            client.field509.method2484(var355);
                            class116 var358 = client.field509;
                            int var359 = var358.field2036;
                            byte[] var360 = Statics.method1667(var356);
                            var358.method2456(var360.length);
                            var358.field2036 += Statics.field2833.method2396(var360, 0, var360.length, var358.field2037, var358.field2036);
                            client.field509.method2454(client.field509.field2036 - var357);
                            continue;
                        }
                        if (var370 == 5010) {
                            var4--;
                            int var361 = field386[var4];
                            String var362 = null;
                            if (var361 < 100) {
                                var362 = client.field673[var361];
                            }
                            if (var362 == null) {
                                var362 = "";
                            }
                            field385[var5++] = var362;
                            continue;
                        }
                        if (var370 == 5011) {
                            var4--;
                            int var363 = field386[var4];
                            String var364 = null;
                            if (var363 < 100) {
                                var364 = client.field695[var363];
                            }
                            if (var364 == null) {
                                var364 = "";
                            }
                            field385[var5++] = var364;
                            continue;
                        }
                        if (var370 == 5015) {
                            String var365;
                            if (Statics.field147 == null || Statics.field147.field39 == null) {
                                var365 = "";
                            } else {
                                var365 = Statics.field147.field39;
                            }
                            field385[var5++] = var365;
                            continue;
                        }
                        if (var370 == 5016) {
                            field386[var4++] = client.field679;
                            continue;
                        }
                        if (var370 == 5017) {
                            field386[var4++] = client.field676;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var369) {
            StringBuilder var367 = new StringBuilder(30);
            var367.append("").append(var3.field2819).append(" ");
            for (int var368 = field391 - 1; var368 >= 0; var368--) {
                var367.append("").append(field387[var368].field269.field2819).append(" ");
            }
            var367.append("").append(var9);
            class80.method210(var367.toString(), var369);
        }
    }
}
