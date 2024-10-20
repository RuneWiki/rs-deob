package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("y")
public class class26 {

    @ObfuscatedName("y.t")
    public static int[] field383 = new int[5];

    @ObfuscatedName("y.k")
    public static int[][] field384 = new int[5][5000];

    @ObfuscatedName("y.x")
    public static int[] field385 = new int[1000];

    @ObfuscatedName("y.v")
    public static String[] field386 = new String[1000];

    @ObfuscatedName("y.g")
    public static int field387 = 0;

    @ObfuscatedName("y.n")
    public static class18[] field388 = new class18[50];

    @ObfuscatedName("y.p")
    public static Calendar field382 = Calendar.getInstance();

    @ObfuscatedName("y.e")
    public static final String[] field390 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.a(La;B)V")
    public static void method116(class1 arg0) {
        Object[] var1 = arg0.field6;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method27(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field66;
        int[] var8 = var3.field65;
        byte var9 = -1;
        field387 = 0;
        try {
            Statics.field2013 = new int[var3.field64];
            int var10 = 0;
            Statics.field389 = new String[var3.field70];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field1;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field4;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field9 == null ? -1 : arg0.field9.field2665;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field9 == null ? -1 : arg0.field9.field2674;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field3 == null ? -1 : arg0.field3.field2665;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field3 == null ? -1 : arg0.field3.field2674;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field8;
                    }
                    Statics.field2013[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field2;
                    }
                    Statics.field389[var11++] = var14;
                }
            }
            int var15 = 0;
            label2424: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var409 = var7[var6];
                if (var409 < 100) {
                    if (var409 == 0) {
                        field385[var4++] = var8[var6];
                        continue;
                    }
                    if (var409 == 1) {
                        int var16 = var8[var6];
                        field385[var4++] = class159.field2700[var16];
                        continue;
                    }
                    if (var409 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2700[var17] = field385[var4];
                        continue;
                    }
                    if (var409 == 3) {
                        field386[var5++] = var3.field63[var6];
                        continue;
                    }
                    if (var409 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var409 == 7) {
                        var4 -= 2;
                        if (field385[var4 + 1] != field385[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var409 == 8) {
                        var4 -= 2;
                        if (field385[var4 + 1] == field385[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var409 == 9) {
                        var4 -= 2;
                        if (field385[var4] < field385[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var409 == 10) {
                        var4 -= 2;
                        if (field385[var4] > field385[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var409 == 21) {
                        if (field387 == 0) {
                            return;
                        }
                        class18 var18 = field388[--field387];
                        var3 = var18.field256;
                        var7 = var3.field66;
                        var8 = var3.field65;
                        var6 = var18.field261;
                        Statics.field2013 = var18.field258;
                        Statics.field389 = var18.field259;
                        continue;
                    }
                    if (var409 == 25) {
                        int var19 = var8[var6];
                        field385[var4++] = class159.method2281(var19);
                        continue;
                    }
                    if (var409 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class159.method1991(var20, field385[var4]);
                        continue;
                    }
                    if (var409 == 31) {
                        var4 -= 2;
                        if (field385[var4] <= field385[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var409 == 32) {
                        var4 -= 2;
                        if (field385[var4] >= field385[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var409 == 33) {
                        field385[var4++] = Statics.field2013[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var409 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field2013[var10001] = field385[var4];
                        continue;
                    }
                    if (var409 == 35) {
                        field386[var5++] = Statics.field389[var8[var6]];
                        continue;
                    }
                    if (var409 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field389[var10001] = field386[var5];
                        continue;
                    }
                    if (var409 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String[] var22 = field386;
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
                        field386[var5++] = var23;
                        continue;
                    }
                    if (var409 == 38) {
                        var4--;
                        continue;
                    }
                    if (var409 == 39) {
                        var5--;
                        continue;
                    }
                    if (var409 == 40) {
                        int var33 = var8[var6];
                        class5 var34 = class5.method27(var33);
                        int[] var35 = new int[var34.field64];
                        String[] var36 = new String[var34.field70];
                        for (int var37 = 0; var37 < var34.field67; var37++) {
                            var35[var37] = field385[var4 - var34.field67 + var37];
                        }
                        for (int var38 = 0; var38 < var34.field69; var38++) {
                            var36[var38] = field386[var5 - var34.field69 + var38];
                        }
                        var4 -= var34.field67;
                        var5 -= var34.field69;
                        class18 var39 = new class18();
                        var39.field256 = var3;
                        var39.field261 = var6;
                        var39.field258 = Statics.field2013;
                        var39.field259 = Statics.field389;
                        field388[++field387 - 1] = var39;
                        var3 = var34;
                        var7 = var34.field66;
                        var8 = var34.field65;
                        var6 = -1;
                        Statics.field2013 = var35;
                        Statics.field389 = var36;
                        continue;
                    }
                    if (var409 == 42) {
                        field385[var4++] = client.field652[var8[var6]];
                        continue;
                    }
                    if (var409 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field652[var10001] = field385[var4];
                        continue;
                    }
                    if (var409 == 44) {
                        int var40 = var8[var6] >> 16;
                        int var41 = var8[var6] & 0xFFFF;
                        var4--;
                        int var42 = field385[var4];
                        if (var42 >= 0 && var42 <= 5000) {
                            field383[var40] = var42;
                            byte var43 = -1;
                            if (var41 == 105) {
                                var43 = 0;
                            }
                            int var44 = 0;
                            while (true) {
                                if (var44 >= var42) {
                                    continue label2424;
                                }
                                field384[var40][var44] = var43;
                                var44++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var409 == 45) {
                        int var45 = var8[var6];
                        var4--;
                        int var46 = field385[var4];
                        if (var46 >= 0 && var46 < field383[var45]) {
                            field385[var4++] = field384[var45][var46];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var409 == 46) {
                        int var47 = var8[var6];
                        var4 -= 2;
                        int var48 = field385[var4];
                        if (var48 >= 0 && var48 < field383[var47]) {
                            field384[var47][var48] = field385[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var409 == 47) {
                        String var49 = client.field472[var8[var6]];
                        if (var49 == null) {
                            var49 = "null";
                        }
                        field386[var5++] = var49;
                        continue;
                    }
                    if (var409 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field472[var10001] = field386[var5];
                        continue;
                    }
                }
                boolean var50;
                if (var8[var6] == 1) {
                    var50 = true;
                } else {
                    var50 = false;
                }
                if (var409 < 1000) {
                    if (var409 == 100) {
                        var4 -= 3;
                        int var51 = field385[var4];
                        int var52 = field385[var4 + 1];
                        int var53 = field385[var4 + 2];
                        if (var52 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var54 = class158.method1612(var51);
                        if (var54.field2687 == null) {
                            var54.field2687 = new class158[var53 + 1];
                        }
                        if (var54.field2687.length <= var53) {
                            class158[] var55 = new class158[var53 + 1];
                            for (int var56 = 0; var56 < var54.field2687.length; var56++) {
                                var55[var56] = var54.field2687[var56];
                            }
                            var54.field2687 = var55;
                        }
                        if (var53 > 0 && var54.field2687[var53 - 1] == null) {
                            throw new RuntimeException("" + (var53 - 1));
                        }
                        class158 var57 = new class158();
                        var57.field2581 = var52;
                        var57.field2596 = var57.field2665 = var54.field2665;
                        var57.field2674 = var53;
                        var57.field2578 = true;
                        var54.field2687[var53] = var57;
                        if (var50) {
                            Statics.field200 = var57;
                        } else {
                            Statics.field2451 = var57;
                        }
                        client.method186(var54);
                        continue;
                    }
                    if (var409 == 101) {
                        class158 var58 = var50 ? Statics.field200 : Statics.field2451;
                        class158 var59 = class158.method1612(var58.field2665);
                        var59.field2687[var58.field2674] = null;
                        client.method186(var59);
                        continue;
                    }
                    if (var409 == 102) {
                        var4--;
                        class158 var60 = class158.method1612(field385[var4]);
                        var60.field2687 = null;
                        client.method186(var60);
                        continue;
                    }
                    if (var409 == 200) {
                        var4 -= 2;
                        int var61 = field385[var4];
                        int var62 = field385[var4 + 1];
                        class158 var63 = class158.method2662(var61, var62);
                        if (var63 != null && var62 != -1) {
                            field385[var4++] = 1;
                            if (var50) {
                                Statics.field200 = var63;
                            } else {
                                Statics.field2451 = var63;
                            }
                            continue;
                        }
                        field385[var4++] = 0;
                        continue;
                    }
                } else if (!(var409 < 1000 || var409 >= 1100) || !(var409 < 2000 || var409 >= 2100)) {
                    class158 var64;
                    if (var409 >= 2000) {
                        var409 -= 1000;
                        var4--;
                        var64 = class158.method1612(field385[var4]);
                    } else {
                        var64 = var50 ? Statics.field200 : Statics.field2451;
                    }
                    if (var409 == 1000) {
                        var4 -= 2;
                        var64.field2584 = field385[var4];
                        var64.field2585 = field385[var4 + 1];
                        client.method186(var64);
                        continue;
                    }
                    if (var409 == 1001) {
                        var4 -= 2;
                        var64.field2588 = field385[var4];
                        var64.field2589 = field385[var4 + 1];
                        client.method186(var64);
                        continue;
                    }
                    if (var409 == 1003) {
                        var4--;
                        boolean var65 = field385[var4] == 1;
                        if (var64.field2591 != var65) {
                            var64.field2591 = var65;
                            client.method186(var64);
                        }
                        continue;
                    }
                } else if (!(var409 < 1100 || var409 >= 1200) || !(var409 < 2100 || var409 >= 2200)) {
                    class158 var66;
                    if (var409 >= 2000) {
                        var409 -= 1000;
                        var4--;
                        var66 = class158.method1612(field385[var4]);
                    } else {
                        var66 = var50 ? Statics.field200 : Statics.field2451;
                    }
                    if (var409 == 1100) {
                        var4 -= 2;
                        var66.field2572 = field385[var4];
                        if (var66.field2572 > var66.field2641 - var66.field2588) {
                            var66.field2572 = var66.field2641 - var66.field2588;
                        }
                        if (var66.field2572 < 0) {
                            var66.field2572 = 0;
                        }
                        var66.field2593 = field385[var4 + 1];
                        if (var66.field2593 > var66.field2604 - var66.field2589) {
                            var66.field2593 = var66.field2604 - var66.field2589;
                        }
                        if (var66.field2593 < 0) {
                            var66.field2593 = 0;
                        }
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1101) {
                        var4--;
                        var66.field2607 = field385[var4];
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1102) {
                        var4--;
                        var66.field2600 = field385[var4] == 1;
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1103) {
                        var4--;
                        var66.field2612 = field385[var4];
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1104) {
                        var4--;
                        var66.field2663 = field385[var4];
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1105) {
                        var4--;
                        var66.field2602 = field385[var4];
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1106) {
                        var4--;
                        var66.field2586 = field385[var4];
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1107) {
                        var4--;
                        var66.field2606 = field385[var4] == 1;
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1108) {
                        var66.field2675 = 1;
                        var4--;
                        var66.field2603 = field385[var4];
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1109) {
                        var4 -= 6;
                        var66.field2617 = field385[var4];
                        var66.field2669 = field385[var4 + 1];
                        var66.field2619 = field385[var4 + 2];
                        var66.field2632 = field385[var4 + 3];
                        var66.field2621 = field385[var4 + 4];
                        var66.field2622 = field385[var4 + 5];
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1110) {
                        var4--;
                        int var67 = field385[var4];
                        if (var66.field2615 != var67) {
                            var66.field2615 = var67;
                            var66.field2640 = 0;
                            var66.field2686 = 0;
                            client.method186(var66);
                        }
                        continue;
                    }
                    if (var409 == 1111) {
                        var4--;
                        var66.field2624 = field385[var4] == 1;
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1112) {
                        var5--;
                        String var68 = field386[var5];
                        if (!var68.equals(var66.field2626)) {
                            var66.field2626 = var68;
                            client.method186(var66);
                        }
                        continue;
                    }
                    if (var409 == 1113) {
                        var4--;
                        var66.field2625 = field385[var4];
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1114) {
                        var4 -= 3;
                        var66.field2594 = field385[var4];
                        var66.field2645 = field385[var4 + 1];
                        var66.field2629 = field385[var4 + 2];
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1115) {
                        var4--;
                        var66.field2631 = field385[var4] == 1;
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1116) {
                        var4--;
                        var66.field2643 = field385[var4];
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1117) {
                        var4--;
                        var66.field2608 = field385[var4];
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1118) {
                        var4--;
                        var66.field2630 = field385[var4] == 1;
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1119) {
                        var4--;
                        var66.field2610 = field385[var4] == 1;
                        client.method186(var66);
                        continue;
                    }
                    if (var409 == 1120) {
                        var4 -= 2;
                        var66.field2641 = field385[var4];
                        var66.field2604 = field385[var4 + 1];
                        client.method186(var66);
                        continue;
                    }
                } else if (var409 >= 1200 && var409 < 1300 || var409 >= 2200 && var409 < 2300) {
                    class158 var69;
                    if (var409 >= 2000) {
                        var409 -= 1000;
                        var4--;
                        var69 = class158.method1612(field385[var4]);
                    } else {
                        var69 = var50 ? Statics.field200 : Statics.field2451;
                    }
                    client.method186(var69);
                    if (var409 == 1200) {
                        var4 -= 2;
                        int var70 = field385[var4];
                        int var71 = field385[var4 + 1];
                        var69.field2683 = var70;
                        var69.field2684 = var71;
                        class40 var72 = Statics.method1799(var70);
                        var69.field2619 = var72.field1005;
                        var69.field2632 = var72.field964;
                        var69.field2621 = var72.field978;
                        var69.field2617 = var72.field962;
                        var69.field2669 = var72.field979;
                        var69.field2622 = var72.field1010;
                        if (var69.field2588 > 0) {
                            var69.field2622 = var69.field2622 * 32 / var69.field2588;
                        }
                        continue;
                    }
                    if (var409 == 1201) {
                        var69.field2675 = 2;
                        var4--;
                        var69.field2603 = field385[var4];
                        continue;
                    }
                    if (var409 == 1202) {
                        var69.field2675 = 3;
                        var69.field2603 = Statics.field164.field31.method3134();
                        continue;
                    }
                } else if (var409 >= 1300 && var409 < 1400 || var409 >= 2300 && var409 < 2400) {
                    class158 var73;
                    if (var409 >= 2000) {
                        var409 -= 1000;
                        var4--;
                        var73 = class158.method1612(field385[var4]);
                    } else {
                        var73 = var50 ? Statics.field200 : Statics.field2451;
                    }
                    if (var409 == 1300) {
                        var4--;
                        int var74 = field385[var4] - 1;
                        if (var74 >= 0 && var74 <= 9) {
                            var5--;
                            var73.method3071(var74, field386[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var409 == 1301) {
                        var4 -= 2;
                        int var75 = field385[var4];
                        int var76 = field385[var4 + 1];
                        var73.field2693 = class158.method2662(var75, var76);
                        continue;
                    }
                    if (var409 == 1302) {
                        var4--;
                        var73.field2644 = field385[var4] == 1;
                        continue;
                    }
                    if (var409 == 1303) {
                        var4--;
                        var73.field2642 = field385[var4];
                        continue;
                    }
                    if (var409 == 1304) {
                        var4--;
                        var73.field2618 = field385[var4];
                        continue;
                    }
                    if (var409 == 1305) {
                        var5--;
                        var73.field2620 = field386[var5];
                        continue;
                    }
                    if (var409 == 1306) {
                        var5--;
                        var73.field2694 = field386[var5];
                        continue;
                    }
                    if (var409 == 1307) {
                        var73.field2592 = null;
                        continue;
                    }
                } else {
                    if (var409 >= 1400 && var409 < 1500 || var409 >= 2400 && var409 < 2500) {
                        class158 var77;
                        if (var409 >= 2000) {
                            var409 -= 1000;
                            var4--;
                            var77 = class158.method1612(field385[var4]);
                        } else {
                            var77 = var50 ? Statics.field200 : Statics.field2451;
                        }
                        var5--;
                        String var78 = field386[var5];
                        int[] var79 = null;
                        if (var78.length() > 0 && var78.charAt(var78.length() - 1) == 'Y') {
                            var4--;
                            int var80 = field385[var4];
                            if (var80 > 0) {
                                var79 = new int[var80];
                                while (var80-- > 0) {
                                    var4--;
                                    var79[var80] = field385[var4];
                                }
                            }
                            var78 = var78.substring(0, var78.length() - 1);
                        }
                        Object[] var81 = new Object[var78.length() + 1];
                        for (int var82 = var81.length - 1; var82 >= 1; var82--) {
                            if (var78.charAt(var82 - 1) == 's') {
                                var5--;
                                var81[var82] = field386[var5];
                            } else {
                                var4--;
                                var81[var82] = Integer.valueOf(field385[var4]);
                            }
                        }
                        var4--;
                        int var83 = field385[var4];
                        if (var83 == -1) {
                            var81 = null;
                        } else {
                            var81[0] = Integer.valueOf(var83);
                        }
                        if (var409 == 1400) {
                            var77.field2648 = var81;
                        }
                        if (var409 == 1401) {
                            var77.field2651 = var81;
                        }
                        if (var409 == 1402) {
                            var77.field2650 = var81;
                        }
                        if (var409 == 1403) {
                            var77.field2652 = var81;
                        }
                        if (var409 == 1404) {
                            var77.field2654 = var81;
                        }
                        if (var409 == 1405) {
                            var77.field2655 = var81;
                        }
                        if (var409 == 1406) {
                            var77.field2658 = var81;
                        }
                        if (var409 == 1407) {
                            var77.field2659 = var81;
                            var77.field2601 = var79;
                        }
                        if (var409 == 1408) {
                            var77.field2605 = var81;
                        }
                        if (var409 == 1409) {
                            var77.field2666 = var81;
                        }
                        if (var409 == 1410) {
                            var77.field2656 = var81;
                        }
                        if (var409 == 1411) {
                            var77.field2649 = var81;
                        }
                        if (var409 == 1412) {
                            var77.field2653 = var81;
                        }
                        if (var409 == 1414) {
                            var77.field2661 = var81;
                            var77.field2662 = var79;
                        }
                        if (var409 == 1415) {
                            var77.field2579 = var81;
                            var77.field2664 = var79;
                        }
                        if (var409 == 1416) {
                            var77.field2657 = var81;
                        }
                        if (var409 == 1417) {
                            var77.field2667 = var81;
                        }
                        if (var409 == 1418) {
                            var77.field2668 = var81;
                        }
                        if (var409 == 1419) {
                            var77.field2611 = var81;
                        }
                        if (var409 == 1420) {
                            var77.field2639 = var81;
                        }
                        if (var409 == 1421) {
                            var77.field2671 = var81;
                        }
                        if (var409 == 1422) {
                            var77.field2646 = var81;
                        }
                        if (var409 == 1423) {
                            var77.field2595 = var81;
                        }
                        if (var409 == 1424) {
                            var77.field2580 = var81;
                        }
                        var77.field2685 = true;
                        continue;
                    }
                    if (var409 < 1600) {
                        class158 var84 = var50 ? Statics.field200 : Statics.field2451;
                        if (var409 == 1500) {
                            field385[var4++] = var84.field2584;
                            continue;
                        }
                        if (var409 == 1501) {
                            field385[var4++] = var84.field2585;
                            continue;
                        }
                        if (var409 == 1502) {
                            field385[var4++] = var84.field2588;
                            continue;
                        }
                        if (var409 == 1503) {
                            field385[var4++] = var84.field2589;
                            continue;
                        }
                        if (var409 == 1504) {
                            field385[var4++] = var84.field2591 ? 1 : 0;
                            continue;
                        }
                        if (var409 == 1505) {
                            field385[var4++] = var84.field2596;
                            continue;
                        }
                    } else if (var409 < 1700) {
                        class158 var85 = var50 ? Statics.field200 : Statics.field2451;
                        if (var409 == 1600) {
                            field385[var4++] = var85.field2572;
                            continue;
                        }
                        if (var409 == 1601) {
                            field385[var4++] = var85.field2593;
                            continue;
                        }
                        if (var409 == 1602) {
                            field386[var5++] = var85.field2626;
                            continue;
                        }
                        if (var409 == 1603) {
                            field385[var4++] = var85.field2641;
                            continue;
                        }
                        if (var409 == 1604) {
                            field385[var4++] = var85.field2604;
                            continue;
                        }
                        if (var409 == 1605) {
                            field385[var4++] = var85.field2622;
                            continue;
                        }
                        if (var409 == 1606) {
                            field385[var4++] = var85.field2619;
                            continue;
                        }
                        if (var409 == 1607) {
                            field385[var4++] = var85.field2621;
                            continue;
                        }
                        if (var409 == 1608) {
                            field385[var4++] = var85.field2632;
                            continue;
                        }
                    } else if (var409 < 1800) {
                        class158 var86 = var50 ? Statics.field200 : Statics.field2451;
                        if (var409 == 1700) {
                            field385[var4++] = var86.field2683;
                            continue;
                        }
                        if (var409 == 1701) {
                            if (var86.field2683 == -1) {
                                field385[var4++] = 0;
                            } else {
                                field385[var4++] = var86.field2684;
                            }
                            continue;
                        }
                        if (var409 == 1702) {
                            field385[var4++] = var86.field2674;
                            continue;
                        }
                    } else if (var409 < 1900) {
                        class158 var87 = var50 ? Statics.field200 : Statics.field2451;
                        if (var409 == 1800) {
                            int[] var88 = field385;
                            int var89 = var4++;
                            int var90 = client.method1523(var87);
                            int var91 = var90 >> 11 & 0x3F;
                            var88[var89] = var91;
                            continue;
                        }
                        if (var409 == 1801) {
                            var4--;
                            int var92 = field385[var4];
                            int var410 = var92 - 1;
                            if (var87.field2592 != null && var410 < var87.field2592.length && var87.field2592[var410] != null) {
                                field386[var5++] = var87.field2592[var410];
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var409 == 1802) {
                            if (var87.field2620 == null) {
                                field386[var5++] = "";
                            } else {
                                field386[var5++] = var87.field2620;
                            }
                            continue;
                        }
                    } else if (var409 < 2600) {
                        var4--;
                        class158 var93 = class158.method1612(field385[var4]);
                        if (var409 == 2500) {
                            field385[var4++] = var93.field2584;
                            continue;
                        }
                        if (var409 == 2501) {
                            field385[var4++] = var93.field2585;
                            continue;
                        }
                        if (var409 == 2502) {
                            field385[var4++] = var93.field2588;
                            continue;
                        }
                        if (var409 == 2503) {
                            field385[var4++] = var93.field2589;
                            continue;
                        }
                        if (var409 == 2504) {
                            field385[var4++] = var93.field2591 ? 1 : 0;
                            continue;
                        }
                        if (var409 == 2505) {
                            field385[var4++] = var93.field2596;
                            continue;
                        }
                    } else if (var409 < 2700) {
                        var4--;
                        class158 var94 = class158.method1612(field385[var4]);
                        if (var409 == 2600) {
                            field385[var4++] = var94.field2572;
                            continue;
                        }
                        if (var409 == 2601) {
                            field385[var4++] = var94.field2593;
                            continue;
                        }
                        if (var409 == 2602) {
                            field386[var5++] = var94.field2626;
                            continue;
                        }
                        if (var409 == 2603) {
                            field385[var4++] = var94.field2641;
                            continue;
                        }
                        if (var409 == 2604) {
                            field385[var4++] = var94.field2604;
                            continue;
                        }
                        if (var409 == 2605) {
                            field385[var4++] = var94.field2622;
                            continue;
                        }
                        if (var409 == 2606) {
                            field385[var4++] = var94.field2619;
                            continue;
                        }
                        if (var409 == 2607) {
                            field385[var4++] = var94.field2621;
                            continue;
                        }
                        if (var409 == 2608) {
                            field385[var4++] = var94.field2632;
                            continue;
                        }
                    } else if (var409 < 2800) {
                        if (var409 == 2700) {
                            var4--;
                            class158 var95 = class158.method1612(field385[var4]);
                            field385[var4++] = var95.field2683;
                            continue;
                        }
                        if (var409 == 2701) {
                            var4--;
                            class158 var96 = class158.method1612(field385[var4]);
                            if (var96.field2683 == -1) {
                                field385[var4++] = 0;
                            } else {
                                field385[var4++] = var96.field2684;
                            }
                            continue;
                        }
                        if (var409 == 2702) {
                            var4--;
                            int var97 = field385[var4];
                            class4 var98 = (class4) client.field615.method3252((long) var97);
                            if (var98 == null) {
                                field385[var4++] = 0;
                            } else {
                                field385[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var409 < 2900) {
                        var4--;
                        class158 var99 = class158.method1612(field385[var4]);
                        if (var409 == 2800) {
                            int[] var100 = field385;
                            int var101 = var4++;
                            int var102 = client.method1523(var99);
                            int var103 = var102 >> 11 & 0x3F;
                            var100[var101] = var103;
                            continue;
                        }
                        if (var409 == 2801) {
                            var4--;
                            int var104 = field385[var4];
                            int var411 = var104 - 1;
                            if (var99.field2592 != null && var411 < var99.field2592.length && var99.field2592[var411] != null) {
                                field386[var5++] = var99.field2592[var411];
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var409 == 2802) {
                            if (var99.field2620 == null) {
                                field386[var5++] = "";
                            } else {
                                field386[var5++] = var99.field2620;
                            }
                            continue;
                        }
                    } else if (var409 < 3200) {
                        if (var409 == 3100) {
                            var5--;
                            String var105 = field386[var5];
                            client.method91(0, "", var105);
                            continue;
                        }
                        if (var409 == 3101) {
                            var4 -= 2;
                            client.method2153(Statics.field164, field385[var4], field385[var4 + 1]);
                            continue;
                        }
                        if (var409 == 3103) {
                            client.method587();
                            continue;
                        }
                        if (var409 == 3104) {
                            var5--;
                            String var106 = field386[var5];
                            int var107 = 0;
                            if (class147.method844(var106)) {
                                int var108 = class147.method1989(var106, 10, true);
                                var107 = var108;
                            }
                            client.field493.method2256(88);
                            client.field493.method2367(var107);
                            continue;
                        }
                        if (var409 == 3105) {
                            var5--;
                            String var109 = field386[var5];
                            client.field493.method2256(21);
                            client.field493.method2364(var109.length() + 1);
                            client.field493.method2578(var109);
                            continue;
                        }
                        if (var409 == 3106) {
                            var5--;
                            String var110 = field386[var5];
                            client.field493.method2256(141);
                            client.field493.method2364(var110.length() + 1);
                            client.field493.method2578(var110);
                            continue;
                        }
                        if (var409 == 3107) {
                            var4--;
                            int var111 = field385[var4];
                            var5--;
                            String var112 = field386[var5];
                            boolean var113 = false;
                            for (int var114 = 0; var114 < client.field575; var114++) {
                                class3 var115 = client.field486[client.field576[var114]];
                                if (var115 != null && var115.field33 != null && var115.field33.equalsIgnoreCase(var112)) {
                                    client.method185(Statics.field164.field447[0], Statics.field164.field448[0], var115.field447[0], var115.field448[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var111 == 1) {
                                        client.field493.method2256(251);
                                        client.field493.method2409(client.field576[var114]);
                                    } else if (var111 == 4) {
                                        client.field493.method2256(79);
                                        client.field493.method2408(client.field576[var114]);
                                    } else if (var111 == 6) {
                                        client.field493.method2256(11);
                                        client.field493.method2407(client.field576[var114]);
                                    } else if (var111 == 7) {
                                        client.field493.method2256(23);
                                        client.field493.method2407(client.field576[var114]);
                                    }
                                    var113 = true;
                                    break;
                                }
                            }
                            if (!var113) {
                                client.method91(0, "", class134.field2208 + var112);
                            }
                            continue;
                        }
                        if (var409 == 3108) {
                            var4 -= 3;
                            int var116 = field385[var4];
                            int var117 = field385[var4 + 1];
                            int var118 = field385[var4 + 2];
                            class158 var119 = class158.method1612(var118);
                            client.method98(var119, var116, var117);
                            continue;
                        }
                        if (var409 == 3109) {
                            var4 -= 2;
                            int var120 = field385[var4];
                            int var121 = field385[var4 + 1];
                            class158 var122 = var50 ? Statics.field200 : Statics.field2451;
                            client.method98(var122, var120, var121);
                            continue;
                        }
                    } else if (var409 < 3300) {
                        if (var409 == 3200) {
                            var4 -= 3;
                            int var123 = field385[var4];
                            int var124 = field385[var4 + 1];
                            int var125 = field385[var4 + 2];
                            if (client.field692 != 0 && var124 != 0 && client.field694 < 50) {
                                client.field533[client.field694] = var123;
                                client.field696[client.field694] = var124;
                                client.field463[client.field694] = var125;
                                client.field565[client.field694] = null;
                                client.field626[client.field694] = 0;
                                client.field694++;
                            }
                            continue;
                        }
                        if (var409 == 3201) {
                            var4--;
                            int var126 = field385[var4];
                            if (var126 == -1 && !client.field699) {
                                class138.method2623();
                            } else if (var126 != -1 && client.field690 != var126 && client.field689 != 0 && !client.field699) {
                                class154 var127 = Statics.field1289;
                                int var128 = client.field689;
                                class138.field2326 = 1;
                                Statics.field1998 = var127;
                                Statics.field2327 = var126;
                                Statics.field732 = 0;
                                Statics.field2328 = var128;
                                Statics.field735 = false;
                                Statics.field2329 = 2;
                            }
                            client.field690 = var126;
                            continue;
                        }
                        if (var409 == 3202) {
                            var4 -= 2;
                            int var129 = field385[var4];
                            int var10000 = field385[var4 + 1];
                            if (client.field689 != 0 && var129 != -1) {
                                class138.method1509(Statics.field370, var129, 0, client.field689, false);
                                client.field699 = true;
                            }
                            continue;
                        }
                    } else if (var409 < 3400) {
                        if (var409 == 3300) {
                            field385[var4++] = client.field465;
                            continue;
                        }
                        if (var409 == 3301) {
                            var4 -= 2;
                            int var131 = field385[var4];
                            int var132 = field385[var4 + 1];
                            field385[var4++] = class19.method1615(var131, var132);
                            continue;
                        }
                        if (var409 == 3302) {
                            var4 -= 2;
                            int var133 = field385[var4];
                            int var134 = field385[var4 + 1];
                            field385[var4++] = class19.method3204(var133, var134);
                            continue;
                        }
                        if (var409 == 3303) {
                            var4 -= 2;
                            int var135 = field385[var4];
                            int var136 = field385[var4 + 1];
                            int[] var137 = field385;
                            int var138 = var4++;
                            class19 var139 = (class19) class19.field267.method3252((long) var135);
                            int var140;
                            if (var139 == null) {
                                var140 = 0;
                            } else if (var136 == -1) {
                                var140 = 0;
                            } else {
                                int var141 = 0;
                                for (int var142 = 0; var142 < var139.field265.length; var142++) {
                                    if (var139.field266[var142] == var136) {
                                        var141 += var139.field265[var142];
                                    }
                                }
                                var140 = var141;
                            }
                            var137[var138] = var140;
                            continue;
                        }
                        if (var409 == 3304) {
                            var4--;
                            int var143 = field385[var4];
                            int[] var144 = field385;
                            int var145 = var4++;
                            class41 var146 = (class41) class41.field1014.method3208((long) var143);
                            class41 var147;
                            if (var146 == null) {
                                byte[] var148 = Statics.field1016.method2943(5, var143);
                                class41 var149 = new class41();
                                if (var148 != null) {
                                    var149.method824(new class126(var148));
                                }
                                class41.field1014.method3210(var149, (long) var143);
                                var147 = var149;
                            } else {
                                var147 = var146;
                            }
                            var144[var145] = var147.field1017;
                            continue;
                        }
                        if (var409 == 3305) {
                            var4--;
                            int var150 = field385[var4];
                            field385[var4++] = client.field592[var150];
                            continue;
                        }
                        if (var409 == 3306) {
                            var4--;
                            int var151 = field385[var4];
                            field385[var4++] = client.field593[var151];
                            continue;
                        }
                        if (var409 == 3307) {
                            var4--;
                            int var152 = field385[var4];
                            field385[var4++] = client.field594[var152];
                            continue;
                        }
                        if (var409 == 3308) {
                            int var153 = Statics.field1519;
                            int var154 = (Statics.field164.field400 >> 7) + Statics.field736;
                            int var155 = (Statics.field164.field404 >> 7) + Statics.field26;
                            field385[var4++] = (var153 << 28) + (var154 << 14) + var155;
                            continue;
                        }
                        if (var409 == 3309) {
                            var4--;
                            int var156 = field385[var4];
                            field385[var4++] = var156 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var409 == 3310) {
                            var4--;
                            int var157 = field385[var4];
                            field385[var4++] = var157 >> 28;
                            continue;
                        }
                        if (var409 == 3311) {
                            var4--;
                            int var158 = field385[var4];
                            field385[var4++] = var158 & 0x3FFF;
                            continue;
                        }
                        if (var409 == 3312) {
                            field385[var4++] = client.field460 ? 1 : 0;
                            continue;
                        }
                        if (var409 == 3313) {
                            var4 -= 2;
                            int var159 = field385[var4] + 32768;
                            int var160 = field385[var4 + 1];
                            field385[var4++] = class19.method1615(var159, var160);
                            continue;
                        }
                        if (var409 == 3314) {
                            var4 -= 2;
                            int var161 = field385[var4] + 32768;
                            int var162 = field385[var4 + 1];
                            field385[var4++] = class19.method3204(var161, var162);
                            continue;
                        }
                        if (var409 == 3315) {
                            var4 -= 2;
                            int var163 = field385[var4] + 32768;
                            int var164 = field385[var4 + 1];
                            int[] var165 = field385;
                            int var166 = var4++;
                            class19 var167 = (class19) class19.field267.method3252((long) var163);
                            int var168;
                            if (var167 == null) {
                                var168 = 0;
                            } else if (var164 == -1) {
                                var168 = 0;
                            } else {
                                int var169 = 0;
                                for (int var170 = 0; var170 < var167.field265.length; var170++) {
                                    if (var167.field266[var170] == var164) {
                                        var169 += var167.field265[var170];
                                    }
                                }
                                var168 = var169;
                            }
                            var165[var166] = var168;
                            continue;
                        }
                        if (var409 == 3316) {
                            if (client.field621 >= 2) {
                                field385[var4++] = client.field621;
                            } else {
                                field385[var4++] = 0;
                            }
                            continue;
                        }
                        if (var409 == 3317) {
                            field385[var4++] = client.field459;
                            continue;
                        }
                        if (var409 == 3318) {
                            field385[var4++] = client.field457;
                            continue;
                        }
                        if (var409 == 3321) {
                            field385[var4++] = client.field619;
                            continue;
                        }
                        if (var409 == 3322) {
                            field385[var4++] = client.field697;
                            continue;
                        }
                        if (var409 == 3323) {
                            if (client.field500) {
                                field385[var4++] = 1;
                            } else {
                                field385[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var409 < 3500) {
                        if (var409 == 3400) {
                            var4 -= 2;
                            int var171 = field385[var4];
                            int var172 = field385[var4 + 1];
                            class39 var173 = class39.method6(var171);
                            if (var173.field953 != 's') {
                            }
                            for (int var174 = 0; var174 < var173.field950; var174++) {
                                if (var173.field951[var174] == var172) {
                                    field386[var5++] = var173.field945[var174];
                                    var173 = null;
                                    break;
                                }
                            }
                            if (var173 != null) {
                                field386[var5++] = var173.field946;
                            }
                            continue;
                        }
                        if (var409 == 3408) {
                            var4 -= 4;
                            int var175 = field385[var4];
                            int var176 = field385[var4 + 1];
                            int var177 = field385[var4 + 2];
                            int var178 = field385[var4 + 3];
                            class39 var179 = class39.method6(var177);
                            if (var179.field947 == var175 && var179.field953 == var176) {
                                for (int var180 = 0; var180 < var179.field950; var180++) {
                                    if (var179.field951[var180] == var178) {
                                        if (var176 == 115) {
                                            field386[var5++] = var179.field945[var180];
                                        } else {
                                            field385[var4++] = var179.field952[var180];
                                        }
                                        var179 = null;
                                        break;
                                    }
                                }
                                if (var179 != null) {
                                    if (var176 == 115) {
                                        field386[var5++] = var179.field946;
                                    } else {
                                        field385[var4++] = var179.field958;
                                    }
                                }
                                continue;
                            }
                            if (var176 == 115) {
                                field386[var5++] = "null";
                            } else {
                                field385[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var409 < 3700) {
                        if (var409 == 3600) {
                            if (client.field707 == 0) {
                                field385[var4++] = -2;
                            } else if (client.field707 == 1) {
                                field385[var4++] = -1;
                            } else {
                                field385[var4++] = client.field706;
                            }
                            continue;
                        }
                        if (var409 == 3601) {
                            var4--;
                            int var181 = field385[var4];
                            if (client.field707 == 2 && var181 < client.field706) {
                                field386[var5++] = client.field708[var181].field354;
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var409 == 3602) {
                            var4--;
                            int var182 = field385[var4];
                            if (client.field707 == 2 && var182 < client.field706) {
                                field385[var4++] = client.field708[var182].field348;
                                continue;
                            }
                            field385[var4++] = 0;
                            continue;
                        }
                        if (var409 == 3603) {
                            var4--;
                            int var183 = field385[var4];
                            if (client.field707 == 2 && var183 < client.field706) {
                                field385[var4++] = client.field708[var183].field351;
                                continue;
                            }
                            field385[var4++] = 0;
                            continue;
                        }
                        if (var409 == 3604) {
                            var5--;
                            String var184 = field386[var5];
                            var4--;
                            int var185 = field385[var4];
                            Statics.method3199(var184, var185);
                            continue;
                        }
                        if (var409 == 3605) {
                            var5--;
                            String var186 = field386[var5];
                            if (var186 == null) {
                                continue;
                            }
                            if ((client.field706 < 200 || client.field596 == 1) && client.field706 < 400) {
                                String var187 = class148.method120(var186, Statics.field645);
                                if (var187 == null) {
                                    continue;
                                }
                                for (int var188 = 0; var188 < client.field706; var188++) {
                                    class23 var189 = client.field708[var188];
                                    String var190 = class148.method120(var189.field354, Statics.field645);
                                    if (var190 != null && var190.equals(var187)) {
                                        client.method91(0, "", var186 + class134.field2226);
                                        continue label2424;
                                    }
                                    if (var189.field349 != null) {
                                        String var191 = class148.method120(var189.field349, Statics.field645);
                                        if (var191 != null && var191.equals(var187)) {
                                            client.method91(0, "", var186 + class134.field2226);
                                            continue label2424;
                                        }
                                    }
                                }
                                for (int var192 = 0; var192 < client.field701; var192++) {
                                    class11 var193 = client.field711[var192];
                                    String var194 = class148.method120(var193.field170, Statics.field645);
                                    if (var194 != null && var194.equals(var187)) {
                                        client.method91(0, "", class134.field2168 + var186 + class134.field2232);
                                        continue label2424;
                                    }
                                    if (var193.field166 != null) {
                                        String var195 = class148.method120(var193.field166, Statics.field645);
                                        if (var195 != null && var195.equals(var187)) {
                                            client.method91(0, "", class134.field2168 + var186 + class134.field2232);
                                            continue label2424;
                                        }
                                    }
                                }
                                if (class148.method120(Statics.field164.field33, Statics.field645).equals(var187)) {
                                    client.method91(0, "", class134.field2276);
                                } else {
                                    client.field493.method2256(135);
                                    class116 var196 = client.field493;
                                    int var197 = var186.length() + 1;
                                    var196.method2364(var197);
                                    client.field493.method2578(var186);
                                }
                                continue;
                            }
                            client.method91(0, "", class134.field2225);
                            continue;
                        }
                        if (var409 == 3606) {
                            var5--;
                            String var198 = field386[var5];
                            if (var198 == null) {
                                continue;
                            }
                            String var199 = class148.method120(var198, Statics.field645);
                            if (var199 == null) {
                                continue;
                            }
                            int var200 = 0;
                            while (true) {
                                if (var200 >= client.field706) {
                                    continue label2424;
                                }
                                class23 var201 = client.field708[var200];
                                String var202 = var201.field354;
                                String var203 = class148.method120(var202, Statics.field645);
                                if (class136.method2245(var198, var199, var202, var203)) {
                                    client.field706--;
                                    for (int var204 = var200; var204 < client.field706; var204++) {
                                        client.field708[var204] = client.field708[var204 + 1];
                                    }
                                    client.field698 = client.field504;
                                    client.field493.method2256(145);
                                    class116 var205 = client.field493;
                                    int var206 = var198.length() + 1;
                                    var205.method2364(var206);
                                    client.field493.method2578(var198);
                                    continue label2424;
                                }
                                var200++;
                            }
                        }
                        if (var409 == 3607) {
                            var5--;
                            String var207 = field386[var5];
                            if (var207 == null) {
                                continue;
                            }
                            if ((client.field701 < 100 || client.field596 == 1) && client.field701 < 400) {
                                String var208 = class148.method120(var207, Statics.field645);
                                if (var208 == null) {
                                    continue;
                                }
                                for (int var209 = 0; var209 < client.field701; var209++) {
                                    class11 var210 = client.field711[var209];
                                    String var211 = class148.method120(var210.field170, Statics.field645);
                                    if (var211 != null && var211.equals(var208)) {
                                        client.method91(0, "", var207 + class134.field2228);
                                        continue label2424;
                                    }
                                    if (var210.field166 != null) {
                                        String var212 = class148.method120(var210.field166, Statics.field645);
                                        if (var212 != null && var212.equals(var208)) {
                                            client.method91(0, "", var207 + class134.field2228);
                                            continue label2424;
                                        }
                                    }
                                }
                                for (int var213 = 0; var213 < client.field706; var213++) {
                                    class23 var214 = client.field708[var213];
                                    String var215 = class148.method120(var214.field354, Statics.field645);
                                    if (var215 != null && var215.equals(var208)) {
                                        client.method91(0, "", class134.field2233 + var207 + class134.field2286);
                                        continue label2424;
                                    }
                                    if (var214.field349 != null) {
                                        String var216 = class148.method120(var214.field349, Statics.field645);
                                        if (var216 != null && var216.equals(var208)) {
                                            client.method91(0, "", class134.field2233 + var207 + class134.field2286);
                                            continue label2424;
                                        }
                                    }
                                }
                                if (class148.method120(Statics.field164.field33, Statics.field645).equals(var208)) {
                                    client.method91(0, "", class134.field2194);
                                } else {
                                    client.field493.method2256(81);
                                    class116 var217 = client.field493;
                                    int var218 = var207.length() + 1;
                                    var217.method2364(var218);
                                    client.field493.method2578(var207);
                                }
                                continue;
                            }
                            client.method91(0, "", class134.field2227);
                            continue;
                        }
                        if (var409 == 3608) {
                            var5--;
                            String var219 = field386[var5];
                            client.method225(var219);
                            continue;
                        }
                        if (var409 == 3609) {
                            var5--;
                            String var220 = field386[var5];
                            if (var220.startsWith(class2.method2633(0)) || var220.startsWith(class2.method2633(1))) {
                                var220 = var220.substring(7);
                            }
                            field385[var4++] = client.method206(var220) ? 1 : 0;
                            continue;
                        }
                        if (var409 == 3611) {
                            if (client.field658 == null) {
                                field386[var5++] = "";
                            } else {
                                field386[var5++] = class146.method2622(client.field658);
                            }
                            continue;
                        }
                        if (var409 == 3612) {
                            if (client.field658 == null) {
                                field385[var4++] = 0;
                            } else {
                                field385[var4++] = Statics.field1431;
                            }
                            continue;
                        }
                        if (var409 == 3613) {
                            var4--;
                            int var221 = field385[var4];
                            if (client.field658 != null && var221 < Statics.field1431) {
                                field386[var5++] = Statics.field1593[var221].field105;
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var409 == 3614) {
                            var4--;
                            int var222 = field385[var4];
                            if (client.field658 != null && var222 < Statics.field1431) {
                                field385[var4++] = Statics.field1593[var222].field104;
                                continue;
                            }
                            field385[var4++] = 0;
                            continue;
                        }
                        if (var409 == 3615) {
                            var4--;
                            int var223 = field385[var4];
                            if (client.field658 != null && var223 < Statics.field1431) {
                                field385[var4++] = Statics.field1593[var223].field108;
                                continue;
                            }
                            field385[var4++] = 0;
                            continue;
                        }
                        if (var409 == 3616) {
                            field385[var4++] = Statics.field51;
                            continue;
                        }
                        if (var409 == 3617) {
                            var5--;
                            String var224 = field386[var5];
                            if (Statics.field1593 != null) {
                                client.field493.method2256(6);
                                class116 var225 = client.field493;
                                int var226 = var224.length() + 1;
                                var225.method2364(var226);
                                client.field493.method2578(var224);
                            }
                            continue;
                        }
                        if (var409 == 3618) {
                            field385[var4++] = Statics.field272;
                            continue;
                        }
                        if (var409 == 3619) {
                            var5--;
                            String var227 = field386[var5];
                            if (!var227.equals("")) {
                                client.field493.method2256(116);
                                class116 var228 = client.field493;
                                int var229 = var227.length() + 1;
                                var228.method2364(var229);
                                client.field493.method2578(var227);
                            }
                            continue;
                        }
                        if (var409 == 3620) {
                            client.field493.method2256(116);
                            client.field493.method2364(0);
                            continue;
                        }
                        if (var409 == 3621) {
                            if (client.field707 == 0) {
                                field385[var4++] = -1;
                            } else {
                                field385[var4++] = client.field701;
                            }
                            continue;
                        }
                        if (var409 == 3622) {
                            var4--;
                            int var230 = field385[var4];
                            if (client.field707 != 0 && var230 < client.field701) {
                                field386[var5++] = client.field711[var230].field170;
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var409 == 3623) {
                            var5--;
                            String var231 = field386[var5];
                            if (var231.startsWith(class2.method2633(0)) || var231.startsWith(class2.method2633(1))) {
                                var231 = var231.substring(7);
                            }
                            field385[var4++] = client.method202(var231) ? 1 : 0;
                            continue;
                        }
                        if (var409 == 3624) {
                            var4--;
                            int var232 = field385[var4];
                            if (Statics.field1593 != null && var232 < Statics.field1431 && Statics.field1593[var232].field105.equalsIgnoreCase(Statics.field164.field33)) {
                                field385[var4++] = 1;
                                continue;
                            }
                            field385[var4++] = 0;
                            continue;
                        }
                        if (var409 == 3625) {
                            if (client.field677 == null) {
                                field386[var5++] = "";
                            } else {
                                field386[var5++] = class146.method2622(client.field677);
                            }
                            continue;
                        }
                    } else if (var409 < 4100) {
                        if (var409 == 4000) {
                            var4 -= 2;
                            int var233 = field385[var4];
                            int var234 = field385[var4 + 1];
                            field385[var4++] = var233 + var234;
                            continue;
                        }
                        if (var409 == 4001) {
                            var4 -= 2;
                            int var235 = field385[var4];
                            int var236 = field385[var4 + 1];
                            field385[var4++] = var235 - var236;
                            continue;
                        }
                        if (var409 == 4002) {
                            var4 -= 2;
                            int var237 = field385[var4];
                            int var238 = field385[var4 + 1];
                            field385[var4++] = var237 * var238;
                            continue;
                        }
                        if (var409 == 4003) {
                            var4 -= 2;
                            int var239 = field385[var4];
                            int var240 = field385[var4 + 1];
                            field385[var4++] = var239 / var240;
                            continue;
                        }
                        if (var409 == 4004) {
                            var4--;
                            int var241 = field385[var4];
                            field385[var4++] = (int) (Math.random() * (double) var241);
                            continue;
                        }
                        if (var409 == 4005) {
                            var4--;
                            int var242 = field385[var4];
                            field385[var4++] = (int) (Math.random() * (double) (var242 + 1));
                            continue;
                        }
                        if (var409 == 4006) {
                            var4 -= 5;
                            int var243 = field385[var4];
                            int var244 = field385[var4 + 1];
                            int var245 = field385[var4 + 2];
                            int var246 = field385[var4 + 3];
                            int var247 = field385[var4 + 4];
                            field385[var4++] = (var244 - var243) * (var247 - var245) / (var246 - var245) + var243;
                            continue;
                        }
                        if (var409 == 4007) {
                            var4 -= 2;
                            int var248 = field385[var4];
                            int var249 = field385[var4 + 1];
                            field385[var4++] = var248 * var249 / 100 + var248;
                            continue;
                        }
                        if (var409 == 4008) {
                            var4 -= 2;
                            int var250 = field385[var4];
                            int var251 = field385[var4 + 1];
                            field385[var4++] = var250 | 0x1 << var251;
                            continue;
                        }
                        if (var409 == 4009) {
                            var4 -= 2;
                            int var252 = field385[var4];
                            int var253 = field385[var4 + 1];
                            field385[var4++] = var252 & -1 - (0x1 << var253);
                            continue;
                        }
                        if (var409 == 4010) {
                            var4 -= 2;
                            int var254 = field385[var4];
                            int var255 = field385[var4 + 1];
                            field385[var4++] = (var254 & 0x1 << var255) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var409 == 4011) {
                            var4 -= 2;
                            int var256 = field385[var4];
                            int var257 = field385[var4 + 1];
                            field385[var4++] = var256 % var257;
                            continue;
                        }
                        if (var409 == 4012) {
                            var4 -= 2;
                            int var258 = field385[var4];
                            int var259 = field385[var4 + 1];
                            if (var258 == 0) {
                                field385[var4++] = 0;
                            } else {
                                field385[var4++] = (int) Math.pow((double) var258, (double) var259);
                            }
                            continue;
                        }
                        if (var409 == 4013) {
                            var4 -= 2;
                            int var260 = field385[var4];
                            int var261 = field385[var4 + 1];
                            if (var260 == 0) {
                                field385[var4++] = 0;
                            } else if (var261 == 0) {
                                field385[var4++] = Integer.MAX_VALUE;
                            } else {
                                field385[var4++] = (int) Math.pow((double) var260, 1.0D / (double) var261);
                            }
                            continue;
                        }
                        if (var409 == 4014) {
                            var4 -= 2;
                            int var262 = field385[var4];
                            int var263 = field385[var4 + 1];
                            field385[var4++] = var262 & var263;
                            continue;
                        }
                        if (var409 == 4015) {
                            var4 -= 2;
                            int var264 = field385[var4];
                            int var265 = field385[var4 + 1];
                            field385[var4++] = var264 | var265;
                            continue;
                        }
                    } else if (var409 < 4200) {
                        if (var409 == 4100) {
                            var5--;
                            String var266 = field386[var5];
                            var4--;
                            int var267 = field385[var4];
                            field386[var5++] = var266 + var267;
                            continue;
                        }
                        if (var409 == 4101) {
                            var5 -= 2;
                            String var268 = field386[var5];
                            String var269 = field386[var5 + 1];
                            field386[var5++] = var268 + var269;
                            continue;
                        }
                        if (var409 == 4102) {
                            var5--;
                            String var270 = field386[var5];
                            var4--;
                            int var271 = field385[var4];
                            String[] var272 = field386;
                            int var273 = var5++;
                            String var275;
                            if (var271 < 0) {
                                var275 = Integer.toString(var271);
                            } else {
                                var275 = class147.method2249(var271, 10, true);
                            }
                            var272[var273] = var270 + var275;
                            continue;
                        }
                        if (var409 == 4103) {
                            var5--;
                            String var276 = field386[var5];
                            field386[var5++] = var276.toLowerCase();
                            continue;
                        }
                        if (var409 == 4104) {
                            var4--;
                            int var277 = field385[var4];
                            long var278 = ((long) var277 + 11745L) * 86400000L;
                            field382.setTime(new Date(var278));
                            int var280 = field382.get(5);
                            int var281 = field382.get(2);
                            int var282 = field382.get(1);
                            field386[var5++] = var280 + "-" + field390[var281] + "-" + var282;
                            continue;
                        }
                        if (var409 == 4105) {
                            var5 -= 2;
                            String var283 = field386[var5];
                            String var284 = field386[var5 + 1];
                            if (Statics.field164.field31 != null && Statics.field164.field31.field2719) {
                                field386[var5++] = var284;
                                continue;
                            }
                            field386[var5++] = var283;
                            continue;
                        }
                        if (var409 == 4106) {
                            var4--;
                            int var285 = field385[var4];
                            field386[var5++] = Integer.toString(var285);
                            continue;
                        }
                        if (var409 == 4107) {
                            var5 -= 2;
                            int[] var286 = field385;
                            int var287 = var4++;
                            String var288 = field386[var5];
                            String var289 = field386[var5 + 1];
                            int var290 = client.field462;
                            int var291 = var288.length();
                            int var292 = var289.length();
                            int var293 = 0;
                            int var294 = 0;
                            byte var295 = 0;
                            byte var296 = 0;
                            int var297;
                            label2272: while (true) {
                                if (var293 - var295 >= var291 && var294 - var296 >= var292) {
                                    int var308 = Math.min(var291, var292);
                                    for (int var309 = 0; var309 < var308; var309++) {
                                        char var312 = var288.charAt(var309);
                                        char var313 = var289.charAt(var309);
                                        if (var312 != var313 && Character.toUpperCase(var312) != Character.toUpperCase(var313)) {
                                            char var314 = Character.toLowerCase(var312);
                                            char var315 = Character.toLowerCase(var313);
                                            if (var314 != var315) {
                                                var297 = class150.method1617(var314, var290) - class150.method1617(var315, var290);
                                                break label2272;
                                            }
                                        }
                                    }
                                    int var316 = var291 - var292;
                                    if (var316 == 0) {
                                        for (int var317 = 0; var317 < var308; var317++) {
                                            char var318 = var288.charAt(var317);
                                            char var319 = var289.charAt(var317);
                                            if (var318 != var319) {
                                                var297 = class150.method1617(var318, var290) - class150.method1617(var319, var290);
                                                break label2272;
                                            }
                                        }
                                        var297 = 0;
                                    } else {
                                        var297 = var316;
                                    }
                                    break;
                                }
                                if (var293 - var295 >= var291) {
                                    var297 = -1;
                                    break;
                                }
                                if (var294 - var296 >= var292) {
                                    var297 = 1;
                                    break;
                                }
                                char var298;
                                if (var295 == 0) {
                                    var298 = var288.charAt(var293++);
                                } else {
                                    var298 = (char) var295;
                                    boolean var299 = false;
                                }
                                char var300;
                                if (var296 == 0) {
                                    var300 = var289.charAt(var294++);
                                } else {
                                    var300 = (char) var296;
                                    boolean var301 = false;
                                }
                                byte var302;
                                if (var298 == 198) {
                                    var302 = 69;
                                } else if (var298 == 230) {
                                    var302 = 101;
                                } else if (var298 == 223) {
                                    var302 = 115;
                                } else if (var298 == 338) {
                                    var302 = 69;
                                } else if (var298 == 339) {
                                    var302 = 101;
                                } else {
                                    var302 = 0;
                                }
                                var295 = var302;
                                byte var303;
                                if (var300 == 198) {
                                    var303 = 69;
                                } else if (var300 == 230) {
                                    var303 = 101;
                                } else if (var300 == 223) {
                                    var303 = 115;
                                } else if (var300 == 338) {
                                    var303 = 69;
                                } else if (var300 == 339) {
                                    var303 = 101;
                                } else {
                                    var303 = 0;
                                }
                                var296 = var303;
                                char var304 = class150.method1442(var298, var290);
                                char var305 = class150.method1442(var300, var290);
                                if (var304 != var305 && Character.toUpperCase(var304) != Character.toUpperCase(var305)) {
                                    char var306 = Character.toLowerCase(var304);
                                    char var307 = Character.toLowerCase(var305);
                                    if (var306 != var307) {
                                        var297 = class150.method1617(var306, var290) - class150.method1617(var307, var290);
                                        break;
                                    }
                                }
                            }
                            byte var321;
                            if (var297 > 0) {
                                var321 = 1;
                            } else if (var297 < 0) {
                                var321 = -1;
                            } else {
                                var321 = 0;
                            }
                            var286[var287] = var321;
                            continue;
                        }
                        if (var409 == 4108) {
                            var5--;
                            String var322 = field386[var5];
                            var4 -= 2;
                            int var323 = field385[var4];
                            int var324 = field385[var4 + 1];
                            byte[] var325 = Statics.field1279.method2943(var324, 0);
                            class183 var326 = new class183(var325);
                            field385[var4++] = var326.method3341(var322, var323);
                            continue;
                        }
                        if (var409 == 4109) {
                            var5--;
                            String var327 = field386[var5];
                            var4 -= 2;
                            int var328 = field385[var4];
                            int var329 = field385[var4 + 1];
                            byte[] var330 = Statics.field1279.method2943(var329, 0);
                            class183 var331 = new class183(var330);
                            field385[var4++] = var331.method3340(var327, var328);
                            continue;
                        }
                        if (var409 == 4110) {
                            var5 -= 2;
                            String var332 = field386[var5];
                            String var333 = field386[var5 + 1];
                            var4--;
                            if (field385[var4] == 1) {
                                field386[var5++] = var332;
                            } else {
                                field386[var5++] = var333;
                            }
                            continue;
                        }
                        if (var409 == 4111) {
                            var5--;
                            String var334 = field386[var5];
                            field386[var5++] = class185.method3346(var334);
                            continue;
                        }
                        if (var409 == 4112) {
                            var5--;
                            String var335 = field386[var5];
                            var4--;
                            int var336 = field385[var4];
                            field386[var5++] = var335 + (char) var336;
                            continue;
                        }
                        if (var409 == 4113) {
                            var4--;
                            int var337 = field385[var4];
                            field385[var4++] = class147.method39((char) var337) ? 1 : 0;
                            continue;
                        }
                        if (var409 == 4114) {
                            var4--;
                            int var338 = field385[var4];
                            field385[var4++] = class147.method2316((char) var338) ? 1 : 0;
                            continue;
                        }
                        if (var409 == 4115) {
                            var4--;
                            int var339 = field385[var4];
                            field385[var4++] = class147.method1600((char) var339) ? 1 : 0;
                            continue;
                        }
                        if (var409 == 4116) {
                            var4--;
                            int var340 = field385[var4];
                            int[] var341 = field385;
                            int var342 = var4++;
                            char var343 = (char) var340;
                            boolean var344 = var343 >= '0' && var343 <= '9';
                            var341[var342] = var344 ? 1 : 0;
                            continue;
                        }
                        if (var409 == 4117) {
                            var5--;
                            String var345 = field386[var5];
                            if (var345 == null) {
                                field385[var4++] = 0;
                            } else {
                                field385[var4++] = var345.length();
                            }
                            continue;
                        }
                        if (var409 == 4118) {
                            var5--;
                            String var346 = field386[var5];
                            var4 -= 2;
                            int var347 = field385[var4];
                            int var348 = field385[var4 + 1];
                            field386[var5++] = var346.substring(var347, var348);
                            continue;
                        }
                        if (var409 == 4119) {
                            var5--;
                            String var349 = field386[var5];
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
                            field386[var5++] = var350.toString();
                            continue;
                        }
                        if (var409 == 4120) {
                            var5--;
                            String var354 = field386[var5];
                            var4--;
                            int var355 = field385[var4];
                            field385[var4++] = var354.indexOf(var355);
                            continue;
                        }
                    } else if (var409 < 4300) {
                        if (var409 == 4200) {
                            var4--;
                            int var356 = field385[var4];
                            field386[var5++] = Statics.method1799(var356).field970;
                            continue;
                        }
                        if (var409 == 4201) {
                            var4 -= 2;
                            int var357 = field385[var4];
                            int var358 = field385[var4 + 1];
                            class40 var359 = Statics.method1799(var357);
                            if (var358 >= 1 && var358 <= 5 && var359.field984[var358 - 1] != null) {
                                field386[var5++] = var359.field984[var358 - 1];
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var409 == 4202) {
                            var4 -= 2;
                            int var360 = field385[var4];
                            int var361 = field385[var4 + 1];
                            class40 var362 = Statics.method1799(var360);
                            if (var361 >= 1 && var361 <= 5 && var362.field994[var361 - 1] != null) {
                                field386[var5++] = var362.field994[var361 - 1];
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var409 == 4203) {
                            var4--;
                            int var363 = field385[var4];
                            field385[var4++] = Statics.method1799(var363).field993;
                            continue;
                        }
                        if (var409 == 4204) {
                            var4--;
                            int var364 = field385[var4];
                            field385[var4++] = Statics.method1799(var364).field981 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var409 == 4205) {
                            var4--;
                            int var365 = field385[var4];
                            class40 var366 = Statics.method1799(var365);
                            if (var366.field1001 == -1 && var366.field980 >= 0) {
                                field385[var4++] = var366.field980;
                                continue;
                            }
                            field385[var4++] = var365;
                            continue;
                        }
                        if (var409 == 4206) {
                            var4--;
                            int var367 = field385[var4];
                            class40 var368 = Statics.method1799(var367);
                            if (var368.field1001 >= 0 && var368.field980 >= 0) {
                                field385[var4++] = var368.field980;
                                continue;
                            }
                            field385[var4++] = var367;
                            continue;
                        }
                        if (var409 == 4207) {
                            var4--;
                            int var369 = field385[var4];
                            field385[var4++] = Statics.method1799(var369).field998 ? 1 : 0;
                            continue;
                        }
                    } else if (var409 < 5100) {
                        if (var409 == 5000) {
                            field385[var4++] = client.field671;
                            continue;
                        }
                        if (var409 == 5001) {
                            var4 -= 3;
                            client.field671 = field385[var4];
                            int var370 = field385[var4 + 1];
                            class137[] var371 = new class137[] { class137.field2316, class137.field2313, class137.field2312 };
                            class137[] var372 = var371;
                            int var373 = 0;
                            class137 var375;
                            while (true) {
                                if (var373 >= var372.length) {
                                    var375 = null;
                                    break;
                                }
                                class137 var374 = var372[var373];
                                if (var374.field2314 == var370) {
                                    var375 = var374;
                                    break;
                                }
                                var373++;
                            }
                            Statics.field845 = var375;
                            if (Statics.field845 == null) {
                                Statics.field845 = class137.field2312;
                            }
                            client.field672 = field385[var4 + 2];
                            client.field493.method2256(150);
                            client.field493.method2364(client.field671);
                            client.field493.method2364(Statics.field845.field2314);
                            client.field493.method2364(client.field672);
                            continue;
                        }
                        if (var409 == 5002) {
                            var5--;
                            String var376 = field386[var5];
                            var4 -= 2;
                            int var377 = field385[var4];
                            int var378 = field385[var4 + 1];
                            client.field493.method2256(38);
                            class116 var379 = client.field493;
                            int var380 = var376.length() + 1;
                            var379.method2364(var380 + 2);
                            client.field493.method2578(var376);
                            client.field493.method2364(var377 - 1);
                            client.field493.method2364(var378);
                            continue;
                        }
                        if (var409 == 5003) {
                            var4--;
                            int var381 = field385[var4];
                            String var382 = null;
                            if (var381 < 100) {
                                var382 = client.field495[var381];
                            }
                            if (var382 == null) {
                                var382 = "";
                            }
                            field386[var5++] = var382;
                            continue;
                        }
                        if (var409 == 5004) {
                            var4--;
                            int var383 = field385[var4];
                            int var384 = -1;
                            if (var383 < 100 && client.field495[var383] != null) {
                                var384 = client.field665[var383];
                            }
                            field385[var4++] = var384;
                            continue;
                        }
                        if (var409 == 5005) {
                            if (Statics.field845 == null) {
                                field385[var4++] = -1;
                            } else {
                                field385[var4++] = Statics.field845.field2314;
                            }
                            continue;
                        }
                        if (var409 == 5008) {
                            var5--;
                            String var385 = field386[var5];
                            if (var385.startsWith("::")) {
                                client.method1800(var385);
                            } else {
                                String var386 = var385.toLowerCase();
                                byte var387 = 0;
                                if (var386.startsWith(class134.field2235)) {
                                    var387 = 0;
                                    var385 = var385.substring(class134.field2235.length());
                                } else if (var386.startsWith(class134.field2237)) {
                                    var387 = 1;
                                    var385 = var385.substring(class134.field2237.length());
                                } else if (var386.startsWith(class134.field2239)) {
                                    var387 = 2;
                                    var385 = var385.substring(class134.field2239.length());
                                } else if (var386.startsWith(class134.field2241)) {
                                    var387 = 3;
                                    var385 = var385.substring(class134.field2241.length());
                                } else if (var386.startsWith(class134.field2243)) {
                                    var387 = 4;
                                    var385 = var385.substring(class134.field2243.length());
                                } else if (var386.startsWith(class134.field2107)) {
                                    var387 = 5;
                                    var385 = var385.substring(class134.field2107.length());
                                } else if (var386.startsWith(class134.field2118)) {
                                    var387 = 6;
                                    var385 = var385.substring(class134.field2118.length());
                                } else if (var386.startsWith(class134.field2245)) {
                                    var387 = 7;
                                    var385 = var385.substring(class134.field2245.length());
                                } else if (var386.startsWith(class134.field2251)) {
                                    var387 = 8;
                                    var385 = var385.substring(class134.field2251.length());
                                } else if (var386.startsWith(class134.field2253)) {
                                    var387 = 9;
                                    var385 = var385.substring(class134.field2253.length());
                                } else if (var386.startsWith(class134.field2255)) {
                                    var387 = 10;
                                    var385 = var385.substring(class134.field2255.length());
                                } else if (var386.startsWith(class134.field2257)) {
                                    var387 = 11;
                                    var385 = var385.substring(class134.field2257.length());
                                } else if (client.field462 != 0) {
                                    if (var386.startsWith(class134.field2236)) {
                                        var387 = 0;
                                        var385 = var385.substring(class134.field2236.length());
                                    } else if (var386.startsWith(class134.field2081)) {
                                        var387 = 1;
                                        var385 = var385.substring(class134.field2081.length());
                                    } else if (var386.startsWith(class134.field2187)) {
                                        var387 = 2;
                                        var385 = var385.substring(class134.field2187.length());
                                    } else if (var386.startsWith(class134.field2167)) {
                                        var387 = 3;
                                        var385 = var385.substring(class134.field2167.length());
                                    } else if (var386.startsWith(class134.field2244)) {
                                        var387 = 4;
                                        var385 = var385.substring(class134.field2244.length());
                                    } else if (var386.startsWith(class134.field2271)) {
                                        var387 = 5;
                                        var385 = var385.substring(class134.field2271.length());
                                    } else if (var386.startsWith(class134.field2248)) {
                                        var387 = 6;
                                        var385 = var385.substring(class134.field2248.length());
                                    } else if (var386.startsWith(class134.field2250)) {
                                        var387 = 7;
                                        var385 = var385.substring(class134.field2250.length());
                                    } else if (var386.startsWith(class134.field2252)) {
                                        var387 = 8;
                                        var385 = var385.substring(class134.field2252.length());
                                    } else if (var386.startsWith(class134.field2254)) {
                                        var387 = 9;
                                        var385 = var385.substring(class134.field2254.length());
                                    } else if (var386.startsWith(class134.field2111)) {
                                        var387 = 10;
                                        var385 = var385.substring(class134.field2111.length());
                                    } else if (var386.startsWith(class134.field2258)) {
                                        var387 = 11;
                                        var385 = var385.substring(class134.field2258.length());
                                    }
                                }
                                String var388 = var385.toLowerCase();
                                byte var389 = 0;
                                if (var388.startsWith(class134.field2071)) {
                                    var389 = 1;
                                    var385 = var385.substring(class134.field2071.length());
                                } else if (var388.startsWith(class134.field2097)) {
                                    var389 = 2;
                                    var385 = var385.substring(class134.field2097.length());
                                } else if (var388.startsWith(class134.field2263)) {
                                    var389 = 3;
                                    var385 = var385.substring(class134.field2263.length());
                                } else if (var388.startsWith(class134.field2265)) {
                                    var389 = 4;
                                    var385 = var385.substring(class134.field2265.length());
                                } else if (var388.startsWith(class134.field2267)) {
                                    var389 = 5;
                                    var385 = var385.substring(class134.field2267.length());
                                } else if (client.field462 != 0) {
                                    if (var388.startsWith(class134.field2282)) {
                                        var389 = 1;
                                        var385 = var385.substring(class134.field2282.length());
                                    } else if (var388.startsWith(class134.field2262)) {
                                        var389 = 2;
                                        var385 = var385.substring(class134.field2262.length());
                                    } else if (var388.startsWith(class134.field2264)) {
                                        var389 = 3;
                                        var385 = var385.substring(class134.field2264.length());
                                    } else if (var388.startsWith(class134.field2266)) {
                                        var389 = 4;
                                        var385 = var385.substring(class134.field2266.length());
                                    } else if (var388.startsWith(class134.field2268)) {
                                        var389 = 5;
                                        var385 = var385.substring(class134.field2268.length());
                                    }
                                }
                                client.field493.method2256(157);
                                client.field493.method2364(0);
                                int var390 = client.field493.field2016;
                                client.field493.method2364(var387);
                                client.field493.method2364(var389);
                                class116 var391 = client.field493;
                                int var392 = var391.field2016;
                                byte[] var393 = class149.method1795(var385);
                                var391.method2469(var393.length);
                                var391.field2016 += Statics.field2831.method2317(var393, 0, var393.length, var391.field2015, var391.field2016);
                                client.field493.method2375(client.field493.field2016 - var390);
                            }
                            continue;
                        }
                        if (var409 == 5009) {
                            var5 -= 2;
                            String var394 = field386[var5];
                            String var395 = field386[var5 + 1];
                            client.field493.method2256(77);
                            client.field493.method2365(0);
                            int var396 = client.field493.field2016;
                            client.field493.method2578(var394);
                            class116 var397 = client.field493;
                            int var398 = var397.field2016;
                            byte[] var399 = class149.method1795(var395);
                            var397.method2469(var399.length);
                            var397.field2016 += Statics.field2831.method2317(var399, 0, var399.length, var397.field2015, var397.field2016);
                            client.field493.method2441(client.field493.field2016 - var396);
                            continue;
                        }
                        if (var409 == 5010) {
                            var4--;
                            int var400 = field385[var4];
                            String var401 = null;
                            if (var400 < 100) {
                                var401 = client.field666[var400];
                            }
                            if (var401 == null) {
                                var401 = "";
                            }
                            field386[var5++] = var401;
                            continue;
                        }
                        if (var409 == 5011) {
                            var4--;
                            int var402 = field385[var4];
                            String var403 = null;
                            if (var402 < 100) {
                                var403 = client.field667[var402];
                            }
                            if (var403 == null) {
                                var403 = "";
                            }
                            field386[var5++] = var403;
                            continue;
                        }
                        if (var409 == 5015) {
                            String var404;
                            if (Statics.field164 == null || Statics.field164.field33 == null) {
                                var404 = "";
                            } else {
                                var404 = Statics.field164.field33;
                            }
                            field386[var5++] = var404;
                            continue;
                        }
                        if (var409 == 5016) {
                            field385[var4++] = client.field672;
                            continue;
                        }
                        if (var409 == 5017) {
                            field385[var4++] = client.field589;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var408) {
            StringBuilder var406 = new StringBuilder(30);
            var406.append("").append(var3.field2817).append(" ");
            for (int var407 = field387 - 1; var407 >= 0; var407--) {
                var406.append("").append(field388[var407].field256.field2817).append(" ");
            }
            var406.append("").append(var9);
            class80.method184(var406.toString(), var408);
        }
    }

    @ObfuscatedName("dn.r(IB)V")
    public static void method2302(int arg0) {
        if (arg0 == -1 || !class158.method1540(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2670[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3.field2627 != null) {
                class1 var4 = new class1();
                var4.field9 = var3;
                var4.field6 = var3.field2627;
                method116(var4);
            }
        }
    }
}
