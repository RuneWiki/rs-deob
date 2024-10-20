package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("s")
public class class26 {

    @ObfuscatedName("s.j")
    public static int[] field405 = new int[5];

    @ObfuscatedName("s.o")
    public static int[][] field407 = new int[5][5000];

    @ObfuscatedName("s.l")
    public static int[] field402 = new int[1000];

    @ObfuscatedName("s.g")
    public static String[] field406 = new String[1000];

    @ObfuscatedName("s.w")
    public static int field409 = 0;

    @ObfuscatedName("s.c")
    public static class18[] field410 = new class18[50];

    @ObfuscatedName("s.a")
    public static Calendar field412 = Calendar.getInstance();

    @ObfuscatedName("s.d")
    public static final String[] field408 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.i(Li;S)V")
    public static void method820(class1 arg0) {
        Object[] var1 = arg0.field18;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method22(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field67;
        int[] var8 = var3.field68;
        byte var9 = -1;
        field409 = 0;
        try {
            Statics.field403 = new int[var3.field74];
            int var10 = 0;
            Statics.field404 = new String[var3.field77];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field3;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field4;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2690;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field16;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2586;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2690;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2586;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field1;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field8;
                    }
                    Statics.field403[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field404[var11++] = var14;
                }
            }
            int var15 = 0;
            label2473: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var397 = var7[var6];
                if (var397 < 100) {
                    if (var397 == 0) {
                        field402[var4++] = var8[var6];
                        continue;
                    }
                    if (var397 == 1) {
                        int var16 = var8[var6];
                        field402[var4++] = class159.field2705[var16];
                        continue;
                    }
                    if (var397 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2705[var17] = field402[var4];
                        continue;
                    }
                    if (var397 == 3) {
                        field406[var5++] = var3.field69[var6];
                        continue;
                    }
                    if (var397 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var397 == 7) {
                        var4 -= 2;
                        if (field402[var4 + 1] != field402[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var397 == 8) {
                        var4 -= 2;
                        if (field402[var4 + 1] == field402[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var397 == 9) {
                        var4 -= 2;
                        if (field402[var4] < field402[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var397 == 10) {
                        var4 -= 2;
                        if (field402[var4] > field402[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var397 == 21) {
                        if (field409 == 0) {
                            return;
                        }
                        class18 var18 = field410[--field409];
                        var3 = var18.field280;
                        var7 = var3.field67;
                        var8 = var3.field68;
                        var6 = var18.field272;
                        Statics.field403 = var18.field273;
                        Statics.field404 = var18.field276;
                        continue;
                    }
                    if (var397 == 25) {
                        int var19 = var8[var6];
                        field402[var4++] = class159.method923(var19);
                        continue;
                    }
                    if (var397 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class159.method1404(var20, field402[var4]);
                        continue;
                    }
                    if (var397 == 31) {
                        var4 -= 2;
                        if (field402[var4] <= field402[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var397 == 32) {
                        var4 -= 2;
                        if (field402[var4] >= field402[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var397 == 33) {
                        field402[var4++] = Statics.field403[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var397 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field403[var10001] = field402[var4];
                        continue;
                    }
                    if (var397 == 35) {
                        field406[var5++] = Statics.field404[var8[var6]];
                        continue;
                    }
                    if (var397 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field404[var10001] = field406[var5];
                        continue;
                    }
                    if (var397 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String var22 = class147.method2751(field406, var5, var21);
                        field406[var5++] = var22;
                        continue;
                    }
                    if (var397 == 38) {
                        var4--;
                        continue;
                    }
                    if (var397 == 39) {
                        var5--;
                        continue;
                    }
                    if (var397 == 40) {
                        int var23 = var8[var6];
                        class5 var24 = class5.method22(var23);
                        int[] var25 = new int[var24.field74];
                        String[] var26 = new String[var24.field77];
                        for (int var27 = 0; var27 < var24.field72; var27++) {
                            var25[var27] = field402[var4 - var24.field72 + var27];
                        }
                        for (int var28 = 0; var28 < var24.field70; var28++) {
                            var26[var28] = field406[var5 - var24.field70 + var28];
                        }
                        var4 -= var24.field72;
                        var5 -= var24.field70;
                        class18 var29 = new class18();
                        var29.field280 = var3;
                        var29.field272 = var6;
                        var29.field273 = Statics.field403;
                        var29.field276 = Statics.field404;
                        field410[++field409 - 1] = var29;
                        var3 = var24;
                        var7 = var24.field67;
                        var8 = var24.field68;
                        var6 = -1;
                        Statics.field403 = var25;
                        Statics.field404 = var26;
                        continue;
                    }
                    if (var397 == 42) {
                        field402[var4++] = client.field680[var8[var6]];
                        continue;
                    }
                    if (var397 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field680[var10001] = field402[var4];
                        continue;
                    }
                    if (var397 == 44) {
                        int var30 = var8[var6] >> 16;
                        int var31 = var8[var6] & 0xFFFF;
                        var4--;
                        int var32 = field402[var4];
                        if (var32 >= 0 && var32 <= 5000) {
                            field405[var30] = var32;
                            byte var33 = -1;
                            if (var31 == 105) {
                                var33 = 0;
                            }
                            int var34 = 0;
                            while (true) {
                                if (var34 >= var32) {
                                    continue label2473;
                                }
                                field407[var30][var34] = var33;
                                var34++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var397 == 45) {
                        int var35 = var8[var6];
                        var4--;
                        int var36 = field402[var4];
                        if (var36 >= 0 && var36 < field405[var35]) {
                            field402[var4++] = field407[var35][var36];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var397 == 46) {
                        int var37 = var8[var6];
                        var4 -= 2;
                        int var38 = field402[var4];
                        if (var38 >= 0 && var38 < field405[var37]) {
                            field407[var37][var38] = field402[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var397 == 47) {
                        String var39 = client.field681[var8[var6]];
                        if (var39 == null) {
                            var39 = "null";
                        }
                        field406[var5++] = var39;
                        continue;
                    }
                    if (var397 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field681[var10001] = field406[var5];
                        continue;
                    }
                }
                boolean var40;
                if (var8[var6] == 1) {
                    var40 = true;
                } else {
                    var40 = false;
                }
                if (var397 < 1000) {
                    if (var397 == 100) {
                        var4 -= 3;
                        int var41 = field402[var4];
                        int var42 = field402[var4 + 1];
                        int var43 = field402[var4 + 2];
                        if (var42 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var44 = class158.method821(var41);
                        if (var44.field2591 == null) {
                            var44.field2591 = new class158[var43 + 1];
                        }
                        if (var44.field2591.length <= var43) {
                            class158[] var45 = new class158[var43 + 1];
                            for (int var46 = 0; var46 < var44.field2591.length; var46++) {
                                var45[var46] = var44.field2591[var46];
                            }
                            var44.field2591 = var45;
                        }
                        if (var43 > 0 && var44.field2591[var43 - 1] == null) {
                            throw new RuntimeException("" + (var43 - 1));
                        }
                        class158 var47 = new class158();
                        var47.field2641 = var42;
                        var47.field2661 = var47.field2690 = var44.field2690;
                        var47.field2586 = var43;
                        var47.field2626 = true;
                        var44.field2591[var43] = var47;
                        if (var40) {
                            Statics.field212 = var47;
                        } else {
                            Statics.field411 = var47;
                        }
                        client.method394(var44);
                        continue;
                    }
                    if (var397 == 101) {
                        class158 var48 = var40 ? Statics.field212 : Statics.field411;
                        class158 var49 = class158.method821(var48.field2690);
                        var49.field2591[var48.field2586] = null;
                        client.method394(var49);
                        continue;
                    }
                    if (var397 == 102) {
                        var4--;
                        class158 var50 = class158.method821(field402[var4]);
                        var50.field2591 = null;
                        client.method394(var50);
                        continue;
                    }
                    if (var397 == 200) {
                        var4 -= 2;
                        int var51 = field402[var4];
                        int var52 = field402[var4 + 1];
                        class158 var53 = class158.method2241(var51, var52);
                        if (var53 != null && var52 != -1) {
                            field402[var4++] = 1;
                            if (var40) {
                                Statics.field212 = var53;
                            } else {
                                Statics.field411 = var53;
                            }
                            continue;
                        }
                        field402[var4++] = 0;
                        continue;
                    }
                } else if (!(var397 < 1000 || var397 >= 1100) || !(var397 < 2000 || var397 >= 2100)) {
                    class158 var54;
                    if (var397 >= 2000) {
                        var397 -= 1000;
                        var4--;
                        var54 = class158.method821(field402[var4]);
                    } else {
                        var54 = var40 ? Statics.field212 : Statics.field411;
                    }
                    if (var397 == 1000) {
                        var4 -= 2;
                        var54.field2590 = field402[var4];
                        var54.field2602 = field402[var4 + 1];
                        client.method394(var54);
                        continue;
                    }
                    if (var397 == 1001) {
                        var4 -= 2;
                        var54.field2594 = field402[var4];
                        var54.field2595 = field402[var4 + 1];
                        client.method394(var54);
                        continue;
                    }
                    if (var397 == 1003) {
                        var4--;
                        boolean var55 = field402[var4] == 1;
                        if (var54.field2597 != var55) {
                            var54.field2597 = var55;
                            client.method394(var54);
                        }
                        continue;
                    }
                } else if (var397 >= 1100 && var397 < 1200 || var397 >= 2100 && var397 < 2200) {
                    class158 var56;
                    if (var397 >= 2000) {
                        var397 -= 1000;
                        var4--;
                        var56 = class158.method821(field402[var4]);
                    } else {
                        var56 = var40 ? Statics.field212 : Statics.field411;
                    }
                    if (var397 == 1100) {
                        var4 -= 2;
                        var56.field2680 = field402[var4];
                        if (var56.field2680 > var56.field2685 - var56.field2594) {
                            var56.field2680 = var56.field2685 - var56.field2594;
                        }
                        if (var56.field2680 < 0) {
                            var56.field2680 = 0;
                        }
                        var56.field2599 = field402[var4 + 1];
                        if (var56.field2599 > var56.field2601 - var56.field2595) {
                            var56.field2599 = var56.field2601 - var56.field2595;
                        }
                        if (var56.field2599 < 0) {
                            var56.field2599 = 0;
                        }
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1101) {
                        var4--;
                        var56.field2621 = field402[var4];
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1102) {
                        var4--;
                        var56.field2606 = field402[var4] == 1;
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1103) {
                        var4--;
                        var56.field2607 = field402[var4];
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1104) {
                        var4--;
                        var56.field2608 = field402[var4];
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1105) {
                        var4--;
                        var56.field2609 = field402[var4];
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1106) {
                        var4--;
                        var56.field2611 = field402[var4];
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1107) {
                        var4--;
                        var56.field2603 = field402[var4] == 1;
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1108) {
                        var56.field2617 = 1;
                        var4--;
                        var56.field2618 = field402[var4];
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1109) {
                        var4 -= 6;
                        var56.field2623 = field402[var4];
                        var56.field2624 = field402[var4 + 1];
                        var56.field2625 = field402[var4 + 2];
                        var56.field2584 = field402[var4 + 3];
                        var56.field2640 = field402[var4 + 4];
                        var56.field2628 = field402[var4 + 5];
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1110) {
                        var4--;
                        int var57 = field402[var4];
                        if (var56.field2650 != var57) {
                            var56.field2650 = var57;
                            var56.field2691 = 0;
                            var56.field2692 = 0;
                            client.method394(var56);
                        }
                        continue;
                    }
                    if (var397 == 1111) {
                        var4--;
                        var56.field2575 = field402[var4] == 1;
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1112) {
                        var5--;
                        String var58 = field406[var5];
                        if (!var58.equals(var56.field2598)) {
                            var56.field2598 = var58;
                            client.method394(var56);
                        }
                        continue;
                    }
                    if (var397 == 1113) {
                        var4--;
                        var56.field2631 = field402[var4];
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1114) {
                        var4 -= 3;
                        var56.field2635 = field402[var4];
                        var56.field2593 = field402[var4 + 1];
                        var56.field2634 = field402[var4 + 2];
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1115) {
                        var4--;
                        var56.field2596 = field402[var4] == 1;
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1116) {
                        var4--;
                        var56.field2613 = field402[var4];
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1117) {
                        var4--;
                        var56.field2614 = field402[var4];
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1118) {
                        var4--;
                        var56.field2620 = field402[var4] == 1;
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1119) {
                        var4--;
                        var56.field2616 = field402[var4] == 1;
                        client.method394(var56);
                        continue;
                    }
                    if (var397 == 1120) {
                        var4 -= 2;
                        var56.field2685 = field402[var4];
                        var56.field2601 = field402[var4 + 1];
                        client.method394(var56);
                        continue;
                    }
                } else if (var397 >= 1200 && var397 < 1300 || var397 >= 2200 && var397 < 2300) {
                    class158 var59;
                    if (var397 >= 2000) {
                        var397 -= 1000;
                        var4--;
                        var59 = class158.method821(field402[var4]);
                    } else {
                        var59 = var40 ? Statics.field212 : Statics.field411;
                    }
                    client.method394(var59);
                    if (var397 == 1200) {
                        var4 -= 2;
                        int var60 = field402[var4];
                        int var61 = field402[var4 + 1];
                        var59.field2592 = var60;
                        var59.field2666 = var61;
                        class40 var62 = class40.method259(var60);
                        var59.field2625 = var62.field1007;
                        var59.field2584 = var62.field997;
                        var59.field2640 = var62.field1005;
                        var59.field2623 = var62.field992;
                        var59.field2624 = var62.field1000;
                        var59.field2628 = var62.field999;
                        if (var59.field2594 > 0) {
                            var59.field2628 = var59.field2628 * 32 / var59.field2594;
                        }
                        continue;
                    }
                    if (var397 == 1201) {
                        var59.field2617 = 2;
                        var4--;
                        var59.field2618 = field402[var4];
                        continue;
                    }
                    if (var397 == 1202) {
                        var59.field2617 = 3;
                        var59.field2618 = Statics.field885.field49.method3237();
                        continue;
                    }
                } else if (var397 >= 1300 && var397 < 1400 || var397 >= 2300 && var397 < 2400) {
                    class158 var63;
                    if (var397 >= 2000) {
                        var397 -= 1000;
                        var4--;
                        var63 = class158.method821(field402[var4]);
                    } else {
                        var63 = var40 ? Statics.field212 : Statics.field411;
                    }
                    if (var397 == 1300) {
                        var4--;
                        int var64 = field402[var4] - 1;
                        if (var64 >= 0 && var64 <= 9) {
                            var5--;
                            var63.method3179(var64, field406[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var397 == 1301) {
                        var4 -= 2;
                        int var65 = field402[var4];
                        int var66 = field402[var4 + 1];
                        var63.field2647 = class158.method2241(var65, var66);
                        continue;
                    }
                    if (var397 == 1302) {
                        var4--;
                        var63.field2637 = field402[var4] == 1;
                        continue;
                    }
                    if (var397 == 1303) {
                        var4--;
                        var63.field2648 = field402[var4];
                        continue;
                    }
                    if (var397 == 1304) {
                        var4--;
                        var63.field2649 = field402[var4];
                        continue;
                    }
                    if (var397 == 1305) {
                        var5--;
                        var63.field2627 = field406[var5];
                        continue;
                    }
                    if (var397 == 1306) {
                        var5--;
                        var63.field2651 = field406[var5];
                        continue;
                    }
                    if (var397 == 1307) {
                        var63.field2646 = null;
                        continue;
                    }
                } else {
                    if (var397 >= 1400 && var397 < 1500 || var397 >= 2400 && var397 < 2500) {
                        class158 var67;
                        if (var397 >= 2000) {
                            var397 -= 1000;
                            var4--;
                            var67 = class158.method821(field402[var4]);
                        } else {
                            var67 = var40 ? Statics.field212 : Statics.field411;
                        }
                        var5--;
                        String var68 = field406[var5];
                        int[] var69 = null;
                        if (var68.length() > 0 && var68.charAt(var68.length() - 1) == 'Y') {
                            var4--;
                            int var70 = field402[var4];
                            if (var70 > 0) {
                                var69 = new int[var70];
                                while (var70-- > 0) {
                                    var4--;
                                    var69[var70] = field402[var4];
                                }
                            }
                            var68 = var68.substring(0, var68.length() - 1);
                        }
                        Object[] var71 = new Object[var68.length() + 1];
                        for (int var72 = var71.length - 1; var72 >= 1; var72--) {
                            if (var68.charAt(var72 - 1) == 's') {
                                var5--;
                                var71[var72] = field406[var5];
                            } else {
                                var4--;
                                var71[var72] = Integer.valueOf(field402[var4]);
                            }
                        }
                        var4--;
                        int var73 = field402[var4];
                        if (var73 == -1) {
                            var71 = null;
                        } else {
                            var71[0] = Integer.valueOf(var73);
                        }
                        if (var397 == 1400) {
                            var67.field2654 = var71;
                        }
                        if (var397 == 1401) {
                            var67.field2580 = var71;
                        }
                        if (var397 == 1402) {
                            var67.field2636 = var71;
                        }
                        if (var397 == 1403) {
                            var67.field2658 = var71;
                        }
                        if (var397 == 1404) {
                            var67.field2660 = var71;
                        }
                        if (var397 == 1405) {
                            var67.field2681 = var71;
                        }
                        if (var397 == 1406) {
                            var67.field2664 = var71;
                        }
                        if (var397 == 1407) {
                            var67.field2630 = var71;
                            var67.field2612 = var69;
                        }
                        if (var397 == 1408) {
                            var67.field2671 = var71;
                        }
                        if (var397 == 1409) {
                            var67.field2672 = var71;
                        }
                        if (var397 == 1410) {
                            var67.field2668 = var71;
                        }
                        if (var397 == 1411) {
                            var67.field2655 = var71;
                        }
                        if (var397 == 1412) {
                            var67.field2659 = var71;
                        }
                        if (var397 == 1414) {
                            var67.field2667 = var71;
                            var67.field2677 = var69;
                        }
                        if (var397 == 1415) {
                            var67.field2669 = var71;
                            var67.field2670 = var69;
                        }
                        if (var397 == 1416) {
                            var67.field2663 = var71;
                        }
                        if (var397 == 1417) {
                            var67.field2673 = var71;
                        }
                        if (var397 == 1418) {
                            var67.field2674 = var71;
                        }
                        if (var397 == 1419) {
                            var67.field2675 = var71;
                        }
                        if (var397 == 1420) {
                            var67.field2676 = var71;
                        }
                        if (var397 == 1421) {
                            var67.field2583 = var71;
                        }
                        if (var397 == 1422) {
                            var67.field2678 = var71;
                        }
                        if (var397 == 1423) {
                            var67.field2585 = var71;
                        }
                        if (var397 == 1424) {
                            var67.field2679 = var71;
                        }
                        var67.field2652 = true;
                        continue;
                    }
                    if (var397 < 1600) {
                        class158 var74 = var40 ? Statics.field212 : Statics.field411;
                        if (var397 == 1500) {
                            field402[var4++] = var74.field2590;
                            continue;
                        }
                        if (var397 == 1501) {
                            field402[var4++] = var74.field2602;
                            continue;
                        }
                        if (var397 == 1502) {
                            field402[var4++] = var74.field2594;
                            continue;
                        }
                        if (var397 == 1503) {
                            field402[var4++] = var74.field2595;
                            continue;
                        }
                        if (var397 == 1504) {
                            field402[var4++] = var74.field2597 ? 1 : 0;
                            continue;
                        }
                        if (var397 == 1505) {
                            field402[var4++] = var74.field2661;
                            continue;
                        }
                    } else if (var397 < 1700) {
                        class158 var75 = var40 ? Statics.field212 : Statics.field411;
                        if (var397 == 1600) {
                            field402[var4++] = var75.field2680;
                            continue;
                        }
                        if (var397 == 1601) {
                            field402[var4++] = var75.field2599;
                            continue;
                        }
                        if (var397 == 1602) {
                            field406[var5++] = var75.field2598;
                            continue;
                        }
                        if (var397 == 1603) {
                            field402[var4++] = var75.field2685;
                            continue;
                        }
                        if (var397 == 1604) {
                            field402[var4++] = var75.field2601;
                            continue;
                        }
                        if (var397 == 1605) {
                            field402[var4++] = var75.field2628;
                            continue;
                        }
                        if (var397 == 1606) {
                            field402[var4++] = var75.field2625;
                            continue;
                        }
                        if (var397 == 1607) {
                            field402[var4++] = var75.field2640;
                            continue;
                        }
                        if (var397 == 1608) {
                            field402[var4++] = var75.field2584;
                            continue;
                        }
                    } else if (var397 < 1800) {
                        class158 var76 = var40 ? Statics.field212 : Statics.field411;
                        if (var397 == 1700) {
                            field402[var4++] = var76.field2592;
                            continue;
                        }
                        if (var397 == 1701) {
                            if (var76.field2592 == -1) {
                                field402[var4++] = 0;
                            } else {
                                field402[var4++] = var76.field2666;
                            }
                            continue;
                        }
                        if (var397 == 1702) {
                            field402[var4++] = var76.field2586;
                            continue;
                        }
                    } else if (var397 < 1900) {
                        class158 var77 = var40 ? Statics.field212 : Statics.field411;
                        if (var397 == 1800) {
                            int[] var78 = field402;
                            int var79 = var4++;
                            int var80 = client.method2374(var77);
                            int var81 = var80 >> 11 & 0x3F;
                            var78[var79] = var81;
                            continue;
                        }
                        if (var397 == 1801) {
                            var4--;
                            int var82 = field402[var4];
                            int var398 = var82 - 1;
                            if (var77.field2646 != null && var398 < var77.field2646.length && var77.field2646[var398] != null) {
                                field406[var5++] = var77.field2646[var398];
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var397 == 1802) {
                            if (var77.field2627 == null) {
                                field406[var5++] = "";
                            } else {
                                field406[var5++] = var77.field2627;
                            }
                            continue;
                        }
                    } else if (var397 < 2600) {
                        var4--;
                        class158 var83 = class158.method821(field402[var4]);
                        if (var397 == 2500) {
                            field402[var4++] = var83.field2590;
                            continue;
                        }
                        if (var397 == 2501) {
                            field402[var4++] = var83.field2602;
                            continue;
                        }
                        if (var397 == 2502) {
                            field402[var4++] = var83.field2594;
                            continue;
                        }
                        if (var397 == 2503) {
                            field402[var4++] = var83.field2595;
                            continue;
                        }
                        if (var397 == 2504) {
                            field402[var4++] = var83.field2597 ? 1 : 0;
                            continue;
                        }
                        if (var397 == 2505) {
                            field402[var4++] = var83.field2661;
                            continue;
                        }
                    } else if (var397 < 2700) {
                        var4--;
                        class158 var84 = class158.method821(field402[var4]);
                        if (var397 == 2600) {
                            field402[var4++] = var84.field2680;
                            continue;
                        }
                        if (var397 == 2601) {
                            field402[var4++] = var84.field2599;
                            continue;
                        }
                        if (var397 == 2602) {
                            field406[var5++] = var84.field2598;
                            continue;
                        }
                        if (var397 == 2603) {
                            field402[var4++] = var84.field2685;
                            continue;
                        }
                        if (var397 == 2604) {
                            field402[var4++] = var84.field2601;
                            continue;
                        }
                        if (var397 == 2605) {
                            field402[var4++] = var84.field2628;
                            continue;
                        }
                        if (var397 == 2606) {
                            field402[var4++] = var84.field2625;
                            continue;
                        }
                        if (var397 == 2607) {
                            field402[var4++] = var84.field2640;
                            continue;
                        }
                        if (var397 == 2608) {
                            field402[var4++] = var84.field2584;
                            continue;
                        }
                    } else if (var397 < 2800) {
                        if (var397 == 2700) {
                            var4--;
                            class158 var85 = class158.method821(field402[var4]);
                            field402[var4++] = var85.field2592;
                            continue;
                        }
                        if (var397 == 2701) {
                            var4--;
                            class158 var86 = class158.method821(field402[var4]);
                            if (var86.field2592 == -1) {
                                field402[var4++] = 0;
                            } else {
                                field402[var4++] = var86.field2666;
                            }
                            continue;
                        }
                        if (var397 == 2702) {
                            var4--;
                            int var87 = field402[var4];
                            class4 var88 = (class4) client.field647.method3348((long) var87);
                            if (var88 == null) {
                                field402[var4++] = 0;
                            } else {
                                field402[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var397 < 2900) {
                        var4--;
                        class158 var89 = class158.method821(field402[var4]);
                        if (var397 == 2800) {
                            int[] var90 = field402;
                            int var91 = var4++;
                            int var92 = client.method2374(var89);
                            int var93 = var92 >> 11 & 0x3F;
                            var90[var91] = var93;
                            continue;
                        }
                        if (var397 == 2801) {
                            var4--;
                            int var94 = field402[var4];
                            int var399 = var94 - 1;
                            if (var89.field2646 != null && var399 < var89.field2646.length && var89.field2646[var399] != null) {
                                field406[var5++] = var89.field2646[var399];
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var397 == 2802) {
                            if (var89.field2627 == null) {
                                field406[var5++] = "";
                            } else {
                                field406[var5++] = var89.field2627;
                            }
                            continue;
                        }
                    } else if (var397 < 3200) {
                        if (var397 == 3100) {
                            var5--;
                            String var95 = field406[var5];
                            client.method11(0, "", var95);
                            continue;
                        }
                        if (var397 == 3101) {
                            var4 -= 2;
                            Statics.method838(Statics.field885, field402[var4], field402[var4 + 1]);
                            continue;
                        }
                        if (var397 == 3103) {
                            client.method213();
                            continue;
                        }
                        if (var397 == 3104) {
                            var5--;
                            String var96 = field406[var5];
                            int var97 = 0;
                            boolean var98 = class147.method222(var96, 10, true);
                            if (var98) {
                                var97 = class147.method2752(var96);
                            }
                            client.field540.method2352(204);
                            client.field540.method2480(var97);
                            continue;
                        }
                        if (var397 == 3105) {
                            var5--;
                            String var99 = field406[var5];
                            client.field540.method2352(134);
                            client.field540.method2477(var99.length() + 1);
                            client.field540.method2535(var99);
                            continue;
                        }
                        if (var397 == 3106) {
                            var5--;
                            String var100 = field406[var5];
                            client.field540.method2352(140);
                            client.field540.method2477(var100.length() + 1);
                            client.field540.method2535(var100);
                            continue;
                        }
                        if (var397 == 3107) {
                            var4--;
                            int var101 = field402[var4];
                            var5--;
                            String var102 = field406[var5];
                            client.method261(var101, var102);
                            continue;
                        }
                        if (var397 == 3108) {
                            var4 -= 3;
                            int var103 = field402[var4];
                            int var104 = field402[var4 + 1];
                            int var105 = field402[var4 + 2];
                            class158 var106 = class158.method821(var105);
                            client.method1381(var106, var103, var104);
                            continue;
                        }
                        if (var397 == 3109) {
                            var4 -= 2;
                            int var107 = field402[var4];
                            int var108 = field402[var4 + 1];
                            class158 var109 = var40 ? Statics.field212 : Statics.field411;
                            client.method1381(var109, var107, var108);
                            continue;
                        }
                    } else if (var397 < 3300) {
                        if (var397 == 3200) {
                            var4 -= 3;
                            client.method103(field402[var4], field402[var4 + 1], field402[var4 + 2]);
                            continue;
                        }
                        if (var397 == 3201) {
                            var4--;
                            int var110 = field402[var4];
                            if (var110 == -1 && !client.field537) {
                                class138.method2252();
                            } else if (var110 != -1 && client.field722 != var110 && client.field652 != 0 && !client.field537) {
                                class154 var111 = Statics.field1028;
                                int var112 = client.field652;
                                class138.field2332 = 1;
                                Statics.field1036 = var111;
                                Statics.field2334 = var110;
                                Statics.field282 = 0;
                                Statics.field2336 = var112;
                                Statics.field2337 = false;
                                Statics.field73 = 2;
                            }
                            client.field722 = var110;
                            continue;
                        }
                        if (var397 == 3202) {
                            var4 -= 2;
                            Statics.method120(field402[var4], field402[var4 + 1]);
                            continue;
                        }
                    } else if (var397 < 3400) {
                        if (var397 == 3300) {
                            field402[var4++] = client.field491;
                            continue;
                        }
                        if (var397 == 3301) {
                            var4 -= 2;
                            int var113 = field402[var4];
                            int var114 = field402[var4 + 1];
                            int[] var115 = field402;
                            int var116 = var4++;
                            class19 var117 = (class19) class19.field293.method3348((long) var113);
                            int var118;
                            if (var117 == null) {
                                var118 = -1;
                            } else if (var114 >= 0 && var114 < var117.field297.length) {
                                var118 = var117.field297[var114];
                            } else {
                                var118 = -1;
                            }
                            var115[var116] = var118;
                            continue;
                        }
                        if (var397 == 3302) {
                            var4 -= 2;
                            int var119 = field402[var4];
                            int var120 = field402[var4 + 1];
                            int[] var121 = field402;
                            int var122 = var4++;
                            class19 var123 = (class19) class19.field293.method3348((long) var119);
                            int var124;
                            if (var123 == null) {
                                var124 = 0;
                            } else if (var120 >= 0 && var120 < var123.field287.length) {
                                var124 = var123.field287[var120];
                            } else {
                                var124 = 0;
                            }
                            var121[var122] = var124;
                            continue;
                        }
                        if (var397 == 3303) {
                            var4 -= 2;
                            int var125 = field402[var4];
                            int var126 = field402[var4 + 1];
                            field402[var4++] = class19.method663(var125, var126);
                            continue;
                        }
                        if (var397 == 3304) {
                            var4--;
                            int var127 = field402[var4];
                            field402[var4++] = class41.method2420(var127).field1033;
                            continue;
                        }
                        if (var397 == 3305) {
                            var4--;
                            int var128 = field402[var4];
                            field402[var4++] = client.field573[var128];
                            continue;
                        }
                        if (var397 == 3306) {
                            var4--;
                            int var129 = field402[var4];
                            field402[var4++] = client.field625[var129];
                            continue;
                        }
                        if (var397 == 3307) {
                            var4--;
                            int var130 = field402[var4];
                            field402[var4++] = client.field575[var130];
                            continue;
                        }
                        if (var397 == 3308) {
                            int var131 = Statics.field2384;
                            int var132 = (Statics.field885.field471 >> 7) + Statics.field1795;
                            int var133 = (Statics.field885.field420 >> 7) + Statics.field884;
                            field402[var4++] = (var131 << 28) + (var132 << 14) + var133;
                            continue;
                        }
                        if (var397 == 3309) {
                            var4--;
                            int var134 = field402[var4];
                            field402[var4++] = var134 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var397 == 3310) {
                            var4--;
                            int var135 = field402[var4];
                            field402[var4++] = var135 >> 28;
                            continue;
                        }
                        if (var397 == 3311) {
                            var4--;
                            int var136 = field402[var4];
                            field402[var4++] = var136 & 0x3FFF;
                            continue;
                        }
                        if (var397 == 3312) {
                            field402[var4++] = client.field524 ? 1 : 0;
                            continue;
                        }
                        if (var397 == 3313) {
                            var4 -= 2;
                            int var137 = field402[var4] + 32768;
                            int var138 = field402[var4 + 1];
                            int[] var139 = field402;
                            int var140 = var4++;
                            class19 var141 = (class19) class19.field293.method3348((long) var137);
                            int var142;
                            if (var141 == null) {
                                var142 = -1;
                            } else if (var138 >= 0 && var138 < var141.field297.length) {
                                var142 = var141.field297[var138];
                            } else {
                                var142 = -1;
                            }
                            var139[var140] = var142;
                            continue;
                        }
                        if (var397 == 3314) {
                            var4 -= 2;
                            int var143 = field402[var4] + 32768;
                            int var144 = field402[var4 + 1];
                            int[] var145 = field402;
                            int var146 = var4++;
                            class19 var147 = (class19) class19.field293.method3348((long) var143);
                            int var148;
                            if (var147 == null) {
                                var148 = 0;
                            } else if (var144 >= 0 && var144 < var147.field287.length) {
                                var148 = var147.field287[var144];
                            } else {
                                var148 = 0;
                            }
                            var145[var146] = var148;
                            continue;
                        }
                        if (var397 == 3315) {
                            var4 -= 2;
                            int var149 = field402[var4] + 32768;
                            int var150 = field402[var4 + 1];
                            field402[var4++] = class19.method663(var149, var150);
                            continue;
                        }
                        if (var397 == 3316) {
                            if (client.field653 >= 2) {
                                field402[var4++] = client.field653;
                            } else {
                                field402[var4++] = 0;
                            }
                            continue;
                        }
                        if (var397 == 3317) {
                            field402[var4++] = client.field715;
                            continue;
                        }
                        if (var397 == 3318) {
                            field402[var4++] = client.field591;
                            continue;
                        }
                        if (var397 == 3321) {
                            field402[var4++] = client.field606;
                            continue;
                        }
                        if (var397 == 3322) {
                            field402[var4++] = client.field512;
                            continue;
                        }
                        if (var397 == 3323) {
                            if (client.field648) {
                                field402[var4++] = 1;
                            } else {
                                field402[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var397 < 3500) {
                        if (var397 == 3400) {
                            var4 -= 2;
                            int var151 = field402[var4];
                            int var152 = field402[var4 + 1];
                            class39 var153 = (class39) class39.field971.method3308((long) var151);
                            class39 var154;
                            if (var153 == null) {
                                byte[] var155 = Statics.field970.method3032(8, var151);
                                class39 var156 = new class39();
                                if (var155 != null) {
                                    var156.method843(new class127(var155));
                                }
                                class39.field971.method3307(var156, (long) var151);
                                var154 = var156;
                            } else {
                                var154 = var153;
                            }
                            class39 var157 = var154;
                            if (var154.field973 != 's') {
                            }
                            for (int var158 = 0; var158 < var157.field981; var158++) {
                                if (var157.field982[var158] == var152) {
                                    field406[var5++] = var157.field979[var158];
                                    var157 = null;
                                    break;
                                }
                            }
                            if (var157 != null) {
                                field406[var5++] = var157.field974;
                            }
                            continue;
                        }
                        if (var397 == 3408) {
                            var4 -= 4;
                            int var159 = field402[var4];
                            int var160 = field402[var4 + 1];
                            int var161 = field402[var4 + 2];
                            int var162 = field402[var4 + 3];
                            class39 var163 = (class39) class39.field971.method3308((long) var161);
                            class39 var164;
                            if (var163 == null) {
                                byte[] var165 = Statics.field970.method3032(8, var161);
                                class39 var166 = new class39();
                                if (var165 != null) {
                                    var166.method843(new class127(var165));
                                }
                                class39.field971.method3307(var166, (long) var161);
                                var164 = var166;
                            } else {
                                var164 = var163;
                            }
                            class39 var167 = var164;
                            if (var164.field972 == var159 && var164.field973 == var160) {
                                for (int var168 = 0; var168 < var167.field981; var168++) {
                                    if (var167.field982[var168] == var162) {
                                        if (var160 == 115) {
                                            field406[var5++] = var167.field979[var168];
                                        } else {
                                            field402[var4++] = var167.field978[var168];
                                        }
                                        var167 = null;
                                        break;
                                    }
                                }
                                if (var167 != null) {
                                    if (var160 == 115) {
                                        field406[var5++] = var167.field974;
                                    } else {
                                        field402[var4++] = var167.field975;
                                    }
                                }
                                continue;
                            }
                            if (var160 == 115) {
                                field406[var5++] = "null";
                            } else {
                                field402[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var397 < 3700) {
                        if (var397 == 3600) {
                            if (client.field739 == 0) {
                                field402[var4++] = -2;
                            } else if (client.field739 == 1) {
                                field402[var4++] = -1;
                            } else {
                                field402[var4++] = client.field738;
                            }
                            continue;
                        }
                        if (var397 == 3601) {
                            var4--;
                            int var169 = field402[var4];
                            if (client.field739 == 2 && var169 < client.field738) {
                                field406[var5++] = client.field741[var169].field381;
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var397 == 3602) {
                            var4--;
                            int var170 = field402[var4];
                            if (client.field739 == 2 && var170 < client.field738) {
                                field402[var4++] = client.field741[var170].field372;
                                continue;
                            }
                            field402[var4++] = 0;
                            continue;
                        }
                        if (var397 == 3603) {
                            var4--;
                            int var171 = field402[var4];
                            if (client.field739 == 2 && var171 < client.field738) {
                                field402[var4++] = client.field741[var171].field374;
                                continue;
                            }
                            field402[var4++] = 0;
                            continue;
                        }
                        if (var397 == 3604) {
                            var5--;
                            String var172 = field406[var5];
                            var4--;
                            int var173 = field402[var4];
                            client.method225(var172, var173);
                            continue;
                        }
                        if (var397 == 3605) {
                            var5--;
                            String var174 = field406[var5];
                            if (var174 == null) {
                                continue;
                            }
                            if ((client.field738 < 200 || client.field746 == 1) && client.field738 < 400) {
                                String var175 = class148.method1395(var174, Statics.field484);
                                if (var175 == null) {
                                    continue;
                                }
                                for (int var176 = 0; var176 < client.field738; var176++) {
                                    class23 var177 = client.field741[var176];
                                    String var178 = class148.method1395(var177.field381, Statics.field484);
                                    if (var178 != null && var178.equals(var175)) {
                                        client.method11(0, "", var174 + class134.field2241);
                                        continue label2473;
                                    }
                                    if (var177.field371 != null) {
                                        String var179 = class148.method1395(var177.field371, Statics.field484);
                                        if (var179 != null && var179.equals(var175)) {
                                            client.method11(0, "", var174 + class134.field2241);
                                            continue label2473;
                                        }
                                    }
                                }
                                for (int var180 = 0; var180 < client.field523; var180++) {
                                    class11 var181 = client.field744[var180];
                                    String var182 = class148.method1395(var181.field192, Statics.field484);
                                    if (var182 != null && var182.equals(var175)) {
                                        client.method11(0, "", class134.field2138 + var174 + class134.field2247);
                                        continue label2473;
                                    }
                                    if (var181.field188 != null) {
                                        String var183 = class148.method1395(var181.field188, Statics.field484);
                                        if (var183 != null && var183.equals(var175)) {
                                            client.method11(0, "", class134.field2138 + var174 + class134.field2247);
                                            continue label2473;
                                        }
                                    }
                                }
                                if (class148.method1395(Statics.field885.field58, Statics.field484).equals(var175)) {
                                    client.method11(0, "", class134.field2244);
                                } else {
                                    client.field540.method2352(187);
                                    client.field540.method2477(class127.method12(var174));
                                    client.field540.method2535(var174);
                                }
                                continue;
                            }
                            client.method11(0, "", class134.field2240);
                            continue;
                        }
                        if (var397 == 3606) {
                            var5--;
                            String var184 = field406[var5];
                            client.method48(var184);
                            continue;
                        }
                        if (var397 == 3607) {
                            var5--;
                            String var185 = field406[var5];
                            if (var185 == null) {
                                continue;
                            }
                            if ((client.field523 < 100 || client.field746 == 1) && client.field523 < 400) {
                                String var186 = class148.method1395(var185, Statics.field484);
                                if (var186 == null) {
                                    continue;
                                }
                                for (int var187 = 0; var187 < client.field523; var187++) {
                                    class11 var188 = client.field744[var187];
                                    String var189 = class148.method1395(var188.field192, Statics.field484);
                                    if (var189 != null && var189.equals(var186)) {
                                        client.method11(0, "", var185 + class134.field2243);
                                        continue label2473;
                                    }
                                    if (var188.field188 != null) {
                                        String var190 = class148.method1395(var188.field188, Statics.field484);
                                        if (var190 != null && var190.equals(var186)) {
                                            client.method11(0, "", var185 + class134.field2243);
                                            continue label2473;
                                        }
                                    }
                                }
                                for (int var191 = 0; var191 < client.field738; var191++) {
                                    class23 var192 = client.field741[var191];
                                    String var193 = class148.method1395(var192.field381, Statics.field484);
                                    if (var193 != null && var193.equals(var186)) {
                                        client.method11(0, "", class134.field2248 + var185 + class134.field2249);
                                        continue label2473;
                                    }
                                    if (var192.field371 != null) {
                                        String var194 = class148.method1395(var192.field371, Statics.field484);
                                        if (var194 != null && var194.equals(var186)) {
                                            client.method11(0, "", class134.field2248 + var185 + class134.field2249);
                                            continue label2473;
                                        }
                                    }
                                }
                                if (class148.method1395(Statics.field885.field58, Statics.field484).equals(var186)) {
                                    client.method11(0, "", class134.field2245);
                                } else {
                                    client.field540.method2352(173);
                                    client.field540.method2477(class127.method12(var185));
                                    client.field540.method2535(var185);
                                }
                                continue;
                            }
                            client.method11(0, "", class134.field2242);
                            continue;
                        }
                        if (var397 == 3608) {
                            var5--;
                            String var195 = field406[var5];
                            if (var195 == null) {
                                continue;
                            }
                            String var196 = class148.method1395(var195, Statics.field484);
                            if (var196 == null) {
                                continue;
                            }
                            int var197 = 0;
                            while (true) {
                                if (var197 >= client.field523) {
                                    continue label2473;
                                }
                                class11 var198 = client.field744[var197];
                                String var199 = var198.field192;
                                String var200 = class148.method1395(var199, Statics.field484);
                                boolean var201;
                                if (var195 == null || var199 == null) {
                                    var201 = false;
                                } else if (var195.startsWith("#") || var199.startsWith("#")) {
                                    var201 = var195.equals(var199);
                                } else {
                                    var201 = var196.equals(var200);
                                }
                                if (var201) {
                                    client.field523--;
                                    for (int var202 = var197; var202 < client.field523; var202++) {
                                        client.field744[var202] = client.field744[var202 + 1];
                                    }
                                    client.field677 = client.field669;
                                    client.field540.method2352(79);
                                    client.field540.method2477(class127.method12(var195));
                                    client.field540.method2535(var195);
                                    continue label2473;
                                }
                                var197++;
                            }
                        }
                        if (var397 == 3609) {
                            var5--;
                            String var203 = field406[var5];
                            if (var203.startsWith(Statics.method139(0)) || var203.startsWith(Statics.method139(1))) {
                                var203 = var203.substring(7);
                            }
                            field402[var4++] = client.method147(var203) ? 1 : 0;
                            continue;
                        }
                        if (var397 == 3611) {
                            if (client.field711 == null) {
                                field406[var5++] = "";
                            } else {
                                String[] var204 = field406;
                                int var205 = var5++;
                                String var206 = client.field711;
                                String var207 = class146.method2266(class146.method2243(var206));
                                if (var207 == null) {
                                    var207 = "";
                                }
                                var204[var205] = var207;
                            }
                            continue;
                        }
                        if (var397 == 3612) {
                            if (client.field711 == null) {
                                field402[var4++] = 0;
                            } else {
                                field402[var4++] = Statics.field80;
                            }
                            continue;
                        }
                        if (var397 == 3613) {
                            var4--;
                            int var209 = field402[var4];
                            if (client.field711 != null && var209 < Statics.field80) {
                                field406[var5++] = Statics.field367[var209].field125;
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var397 == 3614) {
                            var4--;
                            int var210 = field402[var4];
                            if (client.field711 != null && var210 < Statics.field80) {
                                field402[var4++] = Statics.field367[var210].field124;
                                continue;
                            }
                            field402[var4++] = 0;
                            continue;
                        }
                        if (var397 == 3615) {
                            var4--;
                            int var211 = field402[var4];
                            if (client.field711 != null && var211 < Statics.field80) {
                                field402[var4++] = Statics.field367[var211].field129;
                                continue;
                            }
                            field402[var4++] = 0;
                            continue;
                        }
                        if (var397 == 3616) {
                            field402[var4++] = Statics.field1662;
                            continue;
                        }
                        if (var397 == 3617) {
                            var5--;
                            String var212 = field406[var5];
                            if (Statics.field367 != null) {
                                client.field540.method2352(188);
                                client.field540.method2477(class127.method12(var212));
                                client.field540.method2535(var212);
                            }
                            continue;
                        }
                        if (var397 == 3618) {
                            field402[var4++] = Statics.field977;
                            continue;
                        }
                        if (var397 == 3619) {
                            var5--;
                            String var213 = field406[var5];
                            client.method1620(var213);
                            continue;
                        }
                        if (var397 == 3620) {
                            client.method227();
                            continue;
                        }
                        if (var397 == 3621) {
                            if (client.field739 == 0) {
                                field402[var4++] = -1;
                            } else {
                                field402[var4++] = client.field523;
                            }
                            continue;
                        }
                        if (var397 == 3622) {
                            var4--;
                            int var214 = field402[var4];
                            if (client.field739 != 0 && var214 < client.field523) {
                                field406[var5++] = client.field744[var214].field192;
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var397 == 3623) {
                            var5--;
                            String var215 = field406[var5];
                            if (var215.startsWith(Statics.method139(0)) || var215.startsWith(Statics.method139(1))) {
                                var215 = var215.substring(7);
                            }
                            field402[var4++] = client.method24(var215) ? 1 : 0;
                            continue;
                        }
                        if (var397 == 3624) {
                            var4--;
                            int var216 = field402[var4];
                            if (Statics.field367 != null && var216 < Statics.field80 && Statics.field367[var216].field125.equalsIgnoreCase(Statics.field885.field58)) {
                                field402[var4++] = 1;
                                continue;
                            }
                            field402[var4++] = 0;
                            continue;
                        }
                        if (var397 == 3625) {
                            if (client.field712 == null) {
                                field406[var5++] = "";
                            } else {
                                String[] var217 = field406;
                                int var218 = var5++;
                                String var219 = client.field712;
                                String var220 = class146.method2266(class146.method2243(var219));
                                if (var220 == null) {
                                    var220 = "";
                                }
                                var217[var218] = var220;
                            }
                            continue;
                        }
                    } else if (var397 < 4100) {
                        if (var397 == 4000) {
                            var4 -= 2;
                            int var222 = field402[var4];
                            int var223 = field402[var4 + 1];
                            field402[var4++] = var222 + var223;
                            continue;
                        }
                        if (var397 == 4001) {
                            var4 -= 2;
                            int var224 = field402[var4];
                            int var225 = field402[var4 + 1];
                            field402[var4++] = var224 - var225;
                            continue;
                        }
                        if (var397 == 4002) {
                            var4 -= 2;
                            int var226 = field402[var4];
                            int var227 = field402[var4 + 1];
                            field402[var4++] = var226 * var227;
                            continue;
                        }
                        if (var397 == 4003) {
                            var4 -= 2;
                            int var228 = field402[var4];
                            int var229 = field402[var4 + 1];
                            field402[var4++] = var228 / var229;
                            continue;
                        }
                        if (var397 == 4004) {
                            var4--;
                            int var230 = field402[var4];
                            field402[var4++] = (int) (Math.random() * (double) var230);
                            continue;
                        }
                        if (var397 == 4005) {
                            var4--;
                            int var231 = field402[var4];
                            field402[var4++] = (int) (Math.random() * (double) (var231 + 1));
                            continue;
                        }
                        if (var397 == 4006) {
                            var4 -= 5;
                            int var232 = field402[var4];
                            int var233 = field402[var4 + 1];
                            int var234 = field402[var4 + 2];
                            int var235 = field402[var4 + 3];
                            int var236 = field402[var4 + 4];
                            field402[var4++] = (var233 - var232) * (var236 - var234) / (var235 - var234) + var232;
                            continue;
                        }
                        if (var397 == 4007) {
                            var4 -= 2;
                            int var237 = field402[var4];
                            int var238 = field402[var4 + 1];
                            field402[var4++] = var237 * var238 / 100 + var237;
                            continue;
                        }
                        if (var397 == 4008) {
                            var4 -= 2;
                            int var239 = field402[var4];
                            int var240 = field402[var4 + 1];
                            field402[var4++] = var239 | 0x1 << var240;
                            continue;
                        }
                        if (var397 == 4009) {
                            var4 -= 2;
                            int var241 = field402[var4];
                            int var242 = field402[var4 + 1];
                            field402[var4++] = var241 & -1 - (0x1 << var242);
                            continue;
                        }
                        if (var397 == 4010) {
                            var4 -= 2;
                            int var243 = field402[var4];
                            int var244 = field402[var4 + 1];
                            field402[var4++] = (var243 & 0x1 << var244) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var397 == 4011) {
                            var4 -= 2;
                            int var245 = field402[var4];
                            int var246 = field402[var4 + 1];
                            field402[var4++] = var245 % var246;
                            continue;
                        }
                        if (var397 == 4012) {
                            var4 -= 2;
                            int var247 = field402[var4];
                            int var248 = field402[var4 + 1];
                            if (var247 == 0) {
                                field402[var4++] = 0;
                            } else {
                                field402[var4++] = (int) Math.pow((double) var247, (double) var248);
                            }
                            continue;
                        }
                        if (var397 == 4013) {
                            var4 -= 2;
                            int var249 = field402[var4];
                            int var250 = field402[var4 + 1];
                            if (var249 == 0) {
                                field402[var4++] = 0;
                            } else if (var250 == 0) {
                                field402[var4++] = Integer.MAX_VALUE;
                            } else {
                                field402[var4++] = (int) Math.pow((double) var249, 1.0D / (double) var250);
                            }
                            continue;
                        }
                        if (var397 == 4014) {
                            var4 -= 2;
                            int var251 = field402[var4];
                            int var252 = field402[var4 + 1];
                            field402[var4++] = var251 & var252;
                            continue;
                        }
                        if (var397 == 4015) {
                            var4 -= 2;
                            int var253 = field402[var4];
                            int var254 = field402[var4 + 1];
                            field402[var4++] = var253 | var254;
                            continue;
                        }
                    } else if (var397 < 4200) {
                        if (var397 == 4100) {
                            var5--;
                            String var255 = field406[var5];
                            var4--;
                            int var256 = field402[var4];
                            field406[var5++] = var255 + var256;
                            continue;
                        }
                        if (var397 == 4101) {
                            var5 -= 2;
                            String var257 = field406[var5];
                            String var258 = field406[var5 + 1];
                            field406[var5++] = var257 + var258;
                            continue;
                        }
                        if (var397 == 4102) {
                            var5--;
                            String var259 = field406[var5];
                            var4--;
                            int var260 = field402[var4];
                            String[] var261 = field406;
                            int var262 = var5++;
                            String var264;
                            if (var260 < 0) {
                                var264 = Integer.toString(var260);
                            } else {
                                int var265 = var260;
                                String var266;
                                if (var260 < 0) {
                                    var266 = Integer.toString(var260, 10);
                                } else {
                                    int var267 = 2;
                                    int var268 = var260 / 10;
                                    while (var268 != 0) {
                                        var268 /= 10;
                                        var267++;
                                    }
                                    char[] var269 = new char[var267];
                                    var269[0] = '+';
                                    for (int var270 = var267 - 1; var270 > 0; var270--) {
                                        int var271 = var265;
                                        var265 /= 10;
                                        int var272 = var271 - var265 * 10;
                                        if (var272 >= 10) {
                                            var269[var270] = (char) (var272 + 87);
                                        } else {
                                            var269[var270] = (char) (var272 + 48);
                                        }
                                    }
                                    var266 = new String(var269);
                                }
                                var264 = var266;
                            }
                            var261[var262] = var259 + var264;
                            continue;
                        }
                        if (var397 == 4103) {
                            var5--;
                            String var273 = field406[var5];
                            field406[var5++] = var273.toLowerCase();
                            continue;
                        }
                        if (var397 == 4104) {
                            var4--;
                            int var274 = field402[var4];
                            long var275 = ((long) var274 + 11745L) * 86400000L;
                            field412.setTime(new Date(var275));
                            int var277 = field412.get(5);
                            int var278 = field412.get(2);
                            int var279 = field412.get(1);
                            field406[var5++] = var277 + "-" + field408[var278] + "-" + var279;
                            continue;
                        }
                        if (var397 == 4105) {
                            var5 -= 2;
                            String var280 = field406[var5];
                            String var281 = field406[var5 + 1];
                            if (Statics.field885.field49 != null && Statics.field885.field49.field2725) {
                                field406[var5++] = var281;
                                continue;
                            }
                            field406[var5++] = var280;
                            continue;
                        }
                        if (var397 == 4106) {
                            var4--;
                            int var282 = field402[var4];
                            field406[var5++] = Integer.toString(var282);
                            continue;
                        }
                        if (var397 == 4107) {
                            var5 -= 2;
                            int[] var283 = field402;
                            int var284 = var4++;
                            String var285 = field406[var5];
                            String var286 = field406[var5 + 1];
                            int var287 = client.field487;
                            int var288 = var285.length();
                            int var289 = var286.length();
                            int var290 = 0;
                            int var291 = 0;
                            byte var292 = 0;
                            byte var293 = 0;
                            int var294;
                            label2287: while (true) {
                                if (var290 - var292 >= var288 && var291 - var293 >= var289) {
                                    int var305 = Math.min(var288, var289);
                                    for (int var306 = 0; var306 < var305; var306++) {
                                        char var309 = var285.charAt(var306);
                                        char var310 = var286.charAt(var306);
                                        if (var309 != var310 && Character.toUpperCase(var309) != Character.toUpperCase(var310)) {
                                            char var311 = Character.toLowerCase(var309);
                                            char var312 = Character.toLowerCase(var310);
                                            if (var311 != var312) {
                                                var294 = class150.method2779(var311, var287) - class150.method2779(var312, var287);
                                                break label2287;
                                            }
                                        }
                                    }
                                    int var313 = var288 - var289;
                                    if (var313 == 0) {
                                        for (int var314 = 0; var314 < var305; var314++) {
                                            char var315 = var285.charAt(var314);
                                            char var316 = var286.charAt(var314);
                                            if (var315 != var316) {
                                                var294 = class150.method2779(var315, var287) - class150.method2779(var316, var287);
                                                break label2287;
                                            }
                                        }
                                        var294 = 0;
                                    } else {
                                        var294 = var313;
                                    }
                                    break;
                                }
                                if (var290 - var292 >= var288) {
                                    var294 = -1;
                                    break;
                                }
                                if (var291 - var293 >= var289) {
                                    var294 = 1;
                                    break;
                                }
                                char var295;
                                if (var292 == 0) {
                                    var295 = var285.charAt(var290++);
                                } else {
                                    var295 = (char) var292;
                                    boolean var296 = false;
                                }
                                char var297;
                                if (var293 == 0) {
                                    var297 = var286.charAt(var291++);
                                } else {
                                    var297 = (char) var293;
                                    boolean var298 = false;
                                }
                                byte var299;
                                if (var295 == 198) {
                                    var299 = 69;
                                } else if (var295 == 230) {
                                    var299 = 101;
                                } else if (var295 == 223) {
                                    var299 = 115;
                                } else if (var295 == 338) {
                                    var299 = 69;
                                } else if (var295 == 339) {
                                    var299 = 101;
                                } else {
                                    var299 = 0;
                                }
                                var292 = var299;
                                byte var300;
                                if (var297 == 198) {
                                    var300 = 69;
                                } else if (var297 == 230) {
                                    var300 = 101;
                                } else if (var297 == 223) {
                                    var300 = 115;
                                } else if (var297 == 338) {
                                    var300 = 69;
                                } else if (var297 == 339) {
                                    var300 = 101;
                                } else {
                                    var300 = 0;
                                }
                                var293 = var300;
                                char var301 = class150.method2737(var295, var287);
                                char var302 = class150.method2737(var297, var287);
                                if (var301 != var302 && Character.toUpperCase(var301) != Character.toUpperCase(var302)) {
                                    char var303 = Character.toLowerCase(var301);
                                    char var304 = Character.toLowerCase(var302);
                                    if (var303 != var304) {
                                        var294 = class150.method2779(var303, var287) - class150.method2779(var304, var287);
                                        break;
                                    }
                                }
                            }
                            var283[var284] = class147.method99(var294);
                            continue;
                        }
                        if (var397 == 4108) {
                            var5--;
                            String var317 = field406[var5];
                            var4 -= 2;
                            int var318 = field402[var4];
                            int var319 = field402[var4 + 1];
                            byte[] var320 = Statics.field63.method3032(var319, 0);
                            class183 var321 = new class183(var320);
                            field402[var4++] = var321.method3438(var317, var318);
                            continue;
                        }
                        if (var397 == 4109) {
                            var5--;
                            String var322 = field406[var5];
                            var4 -= 2;
                            int var323 = field402[var4];
                            int var324 = field402[var4 + 1];
                            byte[] var325 = Statics.field63.method3032(var324, 0);
                            class183 var326 = new class183(var325);
                            field402[var4++] = var326.method3437(var322, var323);
                            continue;
                        }
                        if (var397 == 4110) {
                            var5 -= 2;
                            String var327 = field406[var5];
                            String var328 = field406[var5 + 1];
                            var4--;
                            if (field402[var4] == 1) {
                                field406[var5++] = var327;
                            } else {
                                field406[var5++] = var328;
                            }
                            continue;
                        }
                        if (var397 == 4111) {
                            var5--;
                            String var329 = field406[var5];
                            field406[var5++] = class185.method3511(var329);
                            continue;
                        }
                        if (var397 == 4112) {
                            var5--;
                            String var330 = field406[var5];
                            var4--;
                            int var331 = field402[var4];
                            field406[var5++] = var330 + (char) var331;
                            continue;
                        }
                        if (var397 == 4113) {
                            var4--;
                            int var332 = field402[var4];
                            field402[var4++] = class147.method2903((char) var332) ? 1 : 0;
                            continue;
                        }
                        if (var397 == 4114) {
                            var4--;
                            int var333 = field402[var4];
                            field402[var4++] = class147.method31((char) var333) ? 1 : 0;
                            continue;
                        }
                        if (var397 == 4115) {
                            var4--;
                            int var334 = field402[var4];
                            int[] var335 = field402;
                            int var336 = var4++;
                            char var337 = (char) var334;
                            boolean var338 = var337 >= 'A' && var337 <= 'Z' || var337 >= 'a' && var337 <= 'z';
                            var335[var336] = var338 ? 1 : 0;
                            continue;
                        }
                        if (var397 == 4116) {
                            var4--;
                            int var339 = field402[var4];
                            int[] var340 = field402;
                            int var341 = var4++;
                            char var342 = (char) var339;
                            boolean var343 = var342 >= '0' && var342 <= '9';
                            var340[var341] = var343 ? 1 : 0;
                            continue;
                        }
                        if (var397 == 4117) {
                            var5--;
                            String var344 = field406[var5];
                            if (var344 == null) {
                                field402[var4++] = 0;
                            } else {
                                field402[var4++] = var344.length();
                            }
                            continue;
                        }
                        if (var397 == 4118) {
                            var5--;
                            String var345 = field406[var5];
                            var4 -= 2;
                            int var346 = field402[var4];
                            int var347 = field402[var4 + 1];
                            field406[var5++] = var345.substring(var346, var347);
                            continue;
                        }
                        if (var397 == 4119) {
                            var5--;
                            String var348 = field406[var5];
                            StringBuilder var349 = new StringBuilder(var348.length());
                            boolean var350 = false;
                            for (int var351 = 0; var351 < var348.length(); var351++) {
                                char var352 = var348.charAt(var351);
                                if (var352 == '<') {
                                    var350 = true;
                                } else if (var352 == '>') {
                                    var350 = false;
                                } else if (!var350) {
                                    var349.append(var352);
                                }
                            }
                            field406[var5++] = var349.toString();
                            continue;
                        }
                        if (var397 == 4120) {
                            var5--;
                            String var353 = field406[var5];
                            var4--;
                            int var354 = field402[var4];
                            field402[var4++] = var353.indexOf(var354);
                            continue;
                        }
                    } else if (var397 < 4300) {
                        if (var397 == 4200) {
                            var4--;
                            int var355 = field402[var4];
                            field406[var5++] = class40.method259(var355).field990;
                            continue;
                        }
                        if (var397 == 4201) {
                            var4 -= 2;
                            int var356 = field402[var4];
                            int var357 = field402[var4 + 1];
                            class40 var358 = class40.method259(var356);
                            if (var357 >= 1 && var357 <= 5 && var358.field1004[var357 - 1] != null) {
                                field406[var5++] = var358.field1004[var357 - 1];
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var397 == 4202) {
                            var4 -= 2;
                            int var359 = field402[var4];
                            int var360 = field402[var4 + 1];
                            class40 var361 = class40.method259(var359);
                            if (var360 >= 1 && var360 <= 5 && var361.field983[var360 - 1] != null) {
                                field406[var5++] = var361.field983[var360 - 1];
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var397 == 4203) {
                            var4--;
                            int var362 = field402[var4];
                            field402[var4++] = class40.method259(var362).field1002;
                            continue;
                        }
                        if (var397 == 4204) {
                            var4--;
                            int var363 = field402[var4];
                            field402[var4++] = class40.method259(var363).field1001 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var397 == 4205) {
                            var4--;
                            int var364 = field402[var4];
                            class40 var365 = class40.method259(var364);
                            if (var365.field1021 == -1 && var365.field1020 >= 0) {
                                field402[var4++] = var365.field1020;
                                continue;
                            }
                            field402[var4++] = var364;
                            continue;
                        }
                        if (var397 == 4206) {
                            var4--;
                            int var366 = field402[var4];
                            class40 var367 = class40.method259(var366);
                            if (var367.field1021 >= 0 && var367.field1020 >= 0) {
                                field402[var4++] = var367.field1020;
                                continue;
                            }
                            field402[var4++] = var366;
                            continue;
                        }
                        if (var397 == 4207) {
                            var4--;
                            int var368 = field402[var4];
                            field402[var4++] = class40.method259(var368).field1003 ? 1 : 0;
                            continue;
                        }
                    } else if (var397 < 5100) {
                        if (var397 == 5000) {
                            field402[var4++] = client.field594;
                            continue;
                        }
                        if (var397 == 5001) {
                            var4 -= 3;
                            client.field594 = field402[var4];
                            Statics.field1372 = class137.method2474(field402[var4 + 1]);
                            if (Statics.field1372 == null) {
                                Statics.field1372 = class137.field2328;
                            }
                            client.field637 = field402[var4 + 2];
                            client.field540.method2352(190);
                            client.field540.method2477(client.field594);
                            client.field540.method2477(Statics.field1372.field2325);
                            client.field540.method2477(client.field637);
                            continue;
                        }
                        if (var397 == 5002) {
                            var5--;
                            String var369 = field406[var5];
                            var4 -= 2;
                            int var370 = field402[var4];
                            int var371 = field402[var4 + 1];
                            client.field540.method2352(122);
                            client.field540.method2477(class127.method12(var369) + 2);
                            client.field540.method2535(var369);
                            client.field540.method2477(var370 - 1);
                            client.field540.method2477(var371);
                            continue;
                        }
                        if (var397 == 5003) {
                            var4--;
                            int var372 = field402[var4];
                            String var373 = null;
                            if (var372 < 100) {
                                var373 = client.field700[var372];
                            }
                            if (var373 == null) {
                                var373 = "";
                            }
                            field406[var5++] = var373;
                            continue;
                        }
                        if (var397 == 5004) {
                            var4--;
                            int var374 = field402[var4];
                            int var375 = -1;
                            if (var374 < 100 && client.field700[var374] != null) {
                                var375 = client.field697[var374];
                            }
                            field402[var4++] = var375;
                            continue;
                        }
                        if (var397 == 5005) {
                            if (Statics.field1372 == null) {
                                field402[var4++] = -1;
                            } else {
                                field402[var4++] = Statics.field1372.field2325;
                            }
                            continue;
                        }
                        if (var397 == 5008) {
                            var5--;
                            String var376 = field406[var5];
                            if (var376.startsWith("::")) {
                                if (var376.equalsIgnoreCase("::toggleroof")) {
                                    Statics.field193.field203 = !Statics.field193.field203;
                                    class12.method6();
                                    if (Statics.field193.field203) {
                                        client.method11(0, "", "Roofs are now all hidden");
                                    } else {
                                        client.method11(0, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field653 >= 2) {
                                    if (var376.equalsIgnoreCase("::gc")) {
                                        System.gc();
                                    }
                                    if (var376.equalsIgnoreCase("::clientdrop")) {
                                        if (client.field533 > 0) {
                                            client.method169();
                                        } else {
                                            client.method828(40);
                                            Statics.field1439 = Statics.field199;
                                            Statics.field199 = null;
                                        }
                                    }
                                    if (var376.equalsIgnoreCase("::fpson")) {
                                        client.field498 = true;
                                    }
                                    if (var376.equalsIgnoreCase("::fpsoff")) {
                                        client.field498 = false;
                                    }
                                    if (var376.equalsIgnoreCase("::noclip")) {
                                        for (int var377 = 0; var377 < 4; var377++) {
                                            for (int var378 = 1; var378 < 103; var378++) {
                                                for (int var379 = 1; var379 < 103; var379++) {
                                                    client.field544[var377].field2736[var378][var379] = 0;
                                                }
                                            }
                                        }
                                    }
                                    if (var376.equalsIgnoreCase("::errortest") && client.field482 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field540.method2352(221);
                                client.field540.method2477(var376.length() - 1);
                                client.field540.method2535(var376.substring(2));
                                continue;
                            }
                            String var380 = var376.toLowerCase();
                            byte var381 = 0;
                            if (var380.startsWith(class134.field2109)) {
                                var381 = 0;
                                var376 = var376.substring(class134.field2109.length());
                            } else if (var380.startsWith(class134.field2271)) {
                                var381 = 1;
                                var376 = var376.substring(class134.field2271.length());
                            } else if (var380.startsWith(class134.field2250)) {
                                var381 = 2;
                                var376 = var376.substring(class134.field2250.length());
                            } else if (var380.startsWith(class134.field2256)) {
                                var381 = 3;
                                var376 = var376.substring(class134.field2256.length());
                            } else if (var380.startsWith(class134.field2114)) {
                                var381 = 4;
                                var376 = var376.substring(class134.field2114.length());
                            } else if (var380.startsWith(class134.field2230)) {
                                var381 = 5;
                                var376 = var376.substring(class134.field2230.length());
                            } else if (var380.startsWith(class134.field2111)) {
                                var381 = 6;
                                var376 = var376.substring(class134.field2111.length());
                            } else if (var380.startsWith(class134.field2264)) {
                                var381 = 7;
                                var376 = var376.substring(class134.field2264.length());
                            } else if (var380.startsWith(class134.field2100)) {
                                var381 = 8;
                                var376 = var376.substring(class134.field2100.length());
                            } else if (var380.startsWith(class134.field2187)) {
                                var381 = 9;
                                var376 = var376.substring(class134.field2187.length());
                            } else if (var380.startsWith(class134.field2224)) {
                                var381 = 10;
                                var376 = var376.substring(class134.field2224.length());
                            } else if (var380.startsWith(class134.field2272)) {
                                var381 = 11;
                                var376 = var376.substring(class134.field2272.length());
                            } else if (client.field487 != 0) {
                                if (var380.startsWith(class134.field2251)) {
                                    var381 = 0;
                                    var376 = var376.substring(class134.field2251.length());
                                } else if (var380.startsWith(class134.field2253)) {
                                    var381 = 1;
                                    var376 = var376.substring(class134.field2253.length());
                                } else if (var380.startsWith(class134.field2255)) {
                                    var381 = 2;
                                    var376 = var376.substring(class134.field2255.length());
                                } else if (var380.startsWith(class134.field2257)) {
                                    var381 = 3;
                                    var376 = var376.substring(class134.field2257.length());
                                } else if (var380.startsWith(class134.field2223)) {
                                    var381 = 4;
                                    var376 = var376.substring(class134.field2223.length());
                                } else if (var380.startsWith(class134.field2261)) {
                                    var381 = 5;
                                    var376 = var376.substring(class134.field2261.length());
                                } else if (var380.startsWith(class134.field2263)) {
                                    var381 = 6;
                                    var376 = var376.substring(class134.field2263.length());
                                } else if (var380.startsWith(class134.field2265)) {
                                    var381 = 7;
                                    var376 = var376.substring(class134.field2265.length());
                                } else if (var380.startsWith(class134.field2275)) {
                                    var381 = 8;
                                    var376 = var376.substring(class134.field2275.length());
                                } else if (var380.startsWith(class134.field2279)) {
                                    var381 = 9;
                                    var376 = var376.substring(class134.field2279.length());
                                } else if (var380.startsWith(class134.field2254)) {
                                    var381 = 10;
                                    var376 = var376.substring(class134.field2254.length());
                                } else if (var380.startsWith(class134.field2273)) {
                                    var381 = 11;
                                    var376 = var376.substring(class134.field2273.length());
                                }
                            }
                            String var382 = var376.toLowerCase();
                            byte var383 = 0;
                            if (var382.startsWith(class134.field2274)) {
                                var383 = 1;
                                var376 = var376.substring(class134.field2274.length());
                            } else if (var382.startsWith(class134.field2276)) {
                                var383 = 2;
                                var376 = var376.substring(class134.field2276.length());
                            } else if (var382.startsWith(class134.field2146)) {
                                var383 = 3;
                                var376 = var376.substring(class134.field2146.length());
                            } else if (var382.startsWith(class134.field2217)) {
                                var383 = 4;
                                var376 = var376.substring(class134.field2217.length());
                            } else if (var382.startsWith(class134.field2282)) {
                                var383 = 5;
                                var376 = var376.substring(class134.field2282.length());
                            } else if (client.field487 != 0) {
                                if (var382.startsWith(class134.field2278)) {
                                    var383 = 1;
                                    var376 = var376.substring(class134.field2278.length());
                                } else if (var382.startsWith(class134.field2268)) {
                                    var383 = 2;
                                    var376 = var376.substring(class134.field2268.length());
                                } else if (var382.startsWith(class134.field2258)) {
                                    var383 = 3;
                                    var376 = var376.substring(class134.field2258.length());
                                } else if (var382.startsWith(class134.field2281)) {
                                    var383 = 4;
                                    var376 = var376.substring(class134.field2281.length());
                                } else if (var382.startsWith(class134.field2283)) {
                                    var383 = 5;
                                    var376 = var376.substring(class134.field2283.length());
                                }
                            }
                            client.field540.method2352(214);
                            client.field540.method2477(0);
                            int var384 = client.field540.field2039;
                            client.field540.method2477(var381);
                            client.field540.method2477(var383);
                            class184.method2753(client.field540, var376);
                            client.field540.method2488(client.field540.field2039 - var384);
                            continue;
                        }
                        if (var397 == 5009) {
                            var5 -= 2;
                            String var385 = field406[var5];
                            String var386 = field406[var5 + 1];
                            client.field540.method2352(180);
                            client.field540.method2694(0);
                            int var387 = client.field540.field2039;
                            client.field540.method2535(var385);
                            class184.method2753(client.field540, var386);
                            client.field540.method2681(client.field540.field2039 - var387);
                            continue;
                        }
                        if (var397 == 5010) {
                            var4--;
                            int var388 = field402[var4];
                            String var389 = null;
                            if (var388 < 100) {
                                var389 = client.field577[var388];
                            }
                            if (var389 == null) {
                                var389 = "";
                            }
                            field406[var5++] = var389;
                            continue;
                        }
                        if (var397 == 5011) {
                            var4--;
                            int var390 = field402[var4];
                            String var391 = null;
                            if (var390 < 100) {
                                var391 = client.field699[var390];
                            }
                            if (var391 == null) {
                                var391 = "";
                            }
                            field406[var5++] = var391;
                            continue;
                        }
                        if (var397 == 5015) {
                            String var392;
                            if (Statics.field885 == null || Statics.field885.field58 == null) {
                                var392 = "";
                            } else {
                                var392 = Statics.field885.field58;
                            }
                            field406[var5++] = var392;
                            continue;
                        }
                        if (var397 == 5016) {
                            field402[var4++] = client.field637;
                            continue;
                        }
                        if (var397 == 5017) {
                            field402[var4++] = client.field701;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var396) {
            StringBuilder var394 = new StringBuilder(30);
            var394.append("").append(var3.field2818).append(" ");
            for (int var395 = field409 - 1; var395 >= 0; var395--) {
                var394.append("").append(field410[var395].field280.field2818).append(" ");
            }
            var394.append("").append(var9);
            class80.method562(var394.toString(), var396);
        }
    }

    @ObfuscatedName("d.v(IB)V")
    public static void method115(int arg0) {
        if (arg0 == -1 || !class158.method2760(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2682[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3.field2653 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field18 = var3.field2653;
                method820(var4);
            }
        }
    }
}
