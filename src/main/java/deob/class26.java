package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("u")
public class class26 {

    @ObfuscatedName("u.o")
    public static int[] field393 = new int[5];

    @ObfuscatedName("u.a")
    public static int[][] field390 = new int[5][5000];

    @ObfuscatedName("u.h")
    public static int[] field405 = new int[1000];

    @ObfuscatedName("u.j")
    public static String[] field396 = new String[1000];

    @ObfuscatedName("u.f")
    public static int field395 = 0;

    @ObfuscatedName("u.q")
    public static class18[] field399 = new class18[50];

    @ObfuscatedName("u.z")
    public static Calendar field400 = Calendar.getInstance();

    @ObfuscatedName("u.n")
    public static final String[] field401 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.b(Lb;I)V")
    public static void method1(class1 arg0) {
        Object[] var1 = arg0.field15;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method562(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field67;
        int[] var8 = var3.field68;
        byte var9 = -1;
        field395 = 0;
        try {
            Statics.field391 = new int[var3.field74];
            int var10 = 0;
            Statics.field392 = new String[var3.field71];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field2;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field4;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field7 == null ? -1 : arg0.field7.field2661;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field18;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field7 == null ? -1 : arg0.field7.field2609;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field8 == null ? -1 : arg0.field8.field2661;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field8 == null ? -1 : arg0.field8.field2609;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field3;
                    }
                    Statics.field391[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field392[var11++] = var14;
                }
            }
            int var15 = 0;
            label2498: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var387 = var7[var6];
                if (var387 < 100) {
                    if (var387 == 0) {
                        field405[var4++] = var8[var6];
                        continue;
                    }
                    if (var387 == 1) {
                        int var16 = var8[var6];
                        field405[var4++] = class160.field2726[var16];
                        continue;
                    }
                    if (var387 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class160.field2726[var17] = field405[var4];
                        client.method93(var17);
                        continue;
                    }
                    if (var387 == 3) {
                        field396[var5++] = var3.field69[var6];
                        continue;
                    }
                    if (var387 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var387 == 7) {
                        var4 -= 2;
                        if (field405[var4 + 1] != field405[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var387 == 8) {
                        var4 -= 2;
                        if (field405[var4 + 1] == field405[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var387 == 9) {
                        var4 -= 2;
                        if (field405[var4] < field405[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var387 == 10) {
                        var4 -= 2;
                        if (field405[var4] > field405[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var387 == 21) {
                        if (field395 == 0) {
                            return;
                        }
                        class18 var18 = field399[--field395];
                        var3 = var18.field275;
                        var7 = var3.field67;
                        var8 = var3.field68;
                        var6 = var18.field270;
                        Statics.field391 = var18.field268;
                        Statics.field392 = var18.field269;
                        continue;
                    }
                    if (var387 == 25) {
                        int var19 = var8[var6];
                        field405[var4++] = class160.method748(var19);
                        continue;
                    }
                    if (var387 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field405[var4];
                        class38 var22 = (class38) class38.field936.method3248((long) var20);
                        class38 var23;
                        if (var22 == null) {
                            byte[] var24 = Statics.field937.method3026(14, var20);
                            class38 var25 = new class38();
                            if (var24 != null) {
                                var25.method793(new class126(var24));
                            }
                            class38.field936.method3252(var25, (long) var20);
                            var23 = var25;
                        } else {
                            var23 = var22;
                        }
                        int var27 = var23.field935;
                        int var28 = var23.field938;
                        int var29 = var23.field939;
                        int var30 = class160.field2728[var29 - var28];
                        if (var21 < 0 || var21 > var30) {
                            var21 = 0;
                        }
                        int var31 = var30 << var28;
                        class160.field2726[var27] = class160.field2726[var27] & ~var31 | var21 << var28 & var31;
                        continue;
                    }
                    if (var387 == 31) {
                        var4 -= 2;
                        if (field405[var4] <= field405[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var387 == 32) {
                        var4 -= 2;
                        if (field405[var4] >= field405[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var387 == 33) {
                        field405[var4++] = Statics.field391[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var387 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field391[var10001] = field405[var4];
                        continue;
                    }
                    if (var387 == 35) {
                        field396[var5++] = Statics.field392[var8[var6]];
                        continue;
                    }
                    if (var387 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field392[var10001] = field396[var5];
                        continue;
                    }
                    if (var387 == 37) {
                        int var32 = var8[var6];
                        var5 -= var32;
                        String[] var33 = field396;
                        String var34;
                        if (var32 == 0) {
                            var34 = "";
                        } else if (var32 == 1) {
                            String var35 = var33[var5];
                            if (var35 == null) {
                                var34 = "null";
                            } else {
                                var34 = var35.toString();
                            }
                        } else {
                            int var36 = var5 + var32;
                            int var37 = 0;
                            for (int var38 = var5; var38 < var36; var38++) {
                                String var39 = var33[var38];
                                if (var39 == null) {
                                    var37 += 4;
                                } else {
                                    var37 += var39.length();
                                }
                            }
                            StringBuilder var40 = new StringBuilder(var37);
                            for (int var41 = var5; var41 < var36; var41++) {
                                String var42 = var33[var41];
                                if (var42 == null) {
                                    var40.append("null");
                                } else {
                                    var40.append(var42);
                                }
                            }
                            var34 = var40.toString();
                        }
                        field396[var5++] = var34;
                        continue;
                    }
                    if (var387 == 38) {
                        var4--;
                        continue;
                    }
                    if (var387 == 39) {
                        var5--;
                        continue;
                    }
                    if (var387 == 40) {
                        int var44 = var8[var6];
                        class5 var45 = class5.method562(var44);
                        int[] var46 = new int[var45.field74];
                        String[] var47 = new String[var45.field71];
                        for (int var48 = 0; var48 < var45.field70; var48++) {
                            var46[var48] = field405[var4 - var45.field70 + var48];
                        }
                        for (int var49 = 0; var49 < var45.field73; var49++) {
                            var47[var49] = field396[var5 - var45.field73 + var49];
                        }
                        var4 -= var45.field70;
                        var5 -= var45.field73;
                        class18 var50 = new class18();
                        var50.field275 = var3;
                        var50.field270 = var6;
                        var50.field268 = Statics.field391;
                        var50.field269 = Statics.field392;
                        field399[++field395 - 1] = var50;
                        var3 = var45;
                        var7 = var45.field67;
                        var8 = var45.field68;
                        var6 = -1;
                        Statics.field391 = var46;
                        Statics.field392 = var47;
                        continue;
                    }
                    if (var387 == 42) {
                        field405[var4++] = client.field662[var8[var6]];
                        continue;
                    }
                    if (var387 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field662[var10001] = field405[var4];
                        continue;
                    }
                    if (var387 == 44) {
                        int var51 = var8[var6] >> 16;
                        int var52 = var8[var6] & 0xFFFF;
                        var4--;
                        int var53 = field405[var4];
                        if (var53 >= 0 && var53 <= 5000) {
                            field393[var51] = var53;
                            byte var54 = -1;
                            if (var52 == 105) {
                                var54 = 0;
                            }
                            int var55 = 0;
                            while (true) {
                                if (var55 >= var53) {
                                    continue label2498;
                                }
                                field390[var51][var55] = var54;
                                var55++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var387 == 45) {
                        int var56 = var8[var6];
                        var4--;
                        int var57 = field405[var4];
                        if (var57 >= 0 && var57 < field393[var56]) {
                            field405[var4++] = field390[var56][var57];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var387 == 46) {
                        int var58 = var8[var6];
                        var4 -= 2;
                        int var59 = field405[var4];
                        if (var59 >= 0 && var59 < field393[var58]) {
                            field390[var58][var59] = field405[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var387 == 47) {
                        String var60 = client.field663[var8[var6]];
                        if (var60 == null) {
                            var60 = "null";
                        }
                        field396[var5++] = var60;
                        continue;
                    }
                    if (var387 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field663[var10001] = field396[var5];
                        continue;
                    }
                }
                boolean var61;
                if (var8[var6] == 1) {
                    var61 = true;
                } else {
                    var61 = false;
                }
                if (var387 < 1000) {
                    if (var387 == 100) {
                        var4 -= 3;
                        int var62 = field405[var4];
                        int var63 = field405[var4 + 1];
                        int var64 = field405[var4 + 2];
                        if (var63 == 0) {
                            throw new RuntimeException();
                        }
                        class159 var65 = class159.method2352(var62);
                        if (var65.field2694 == null) {
                            var65.field2694 = new class159[var64 + 1];
                        }
                        if (var65.field2694.length <= var64) {
                            class159[] var66 = new class159[var64 + 1];
                            for (int var67 = 0; var67 < var65.field2694.length; var67++) {
                                var66[var67] = var65.field2694[var67];
                            }
                            var65.field2694 = var66;
                        }
                        if (var64 > 0 && var65.field2694[var64 - 1] == null) {
                            throw new RuntimeException("" + (var64 - 1));
                        }
                        class159 var68 = new class159();
                        var68.field2610 = var63;
                        var68.field2619 = var68.field2661 = var65.field2661;
                        var68.field2609 = var64;
                        var68.field2607 = true;
                        var65.field2694[var64] = var68;
                        if (var61) {
                            Statics.field2037 = var68;
                        } else {
                            Statics.field398 = var68;
                        }
                        client.method2180(var65);
                        continue;
                    }
                    if (var387 == 101) {
                        class159 var69 = var61 ? Statics.field2037 : Statics.field398;
                        class159 var70 = class159.method2352(var69.field2661);
                        var70.field2694[var69.field2609] = null;
                        client.method2180(var70);
                        continue;
                    }
                    if (var387 == 102) {
                        var4--;
                        class159 var71 = class159.method2352(field405[var4]);
                        var71.field2694 = null;
                        client.method2180(var71);
                        continue;
                    }
                    if (var387 == 200) {
                        var4 -= 2;
                        int var72 = field405[var4];
                        int var73 = field405[var4 + 1];
                        class159 var74 = class159.method3099(var72, var73);
                        if (var74 != null && var73 != -1) {
                            field405[var4++] = 1;
                            if (var61) {
                                Statics.field2037 = var74;
                            } else {
                                Statics.field398 = var74;
                            }
                            continue;
                        }
                        field405[var4++] = 0;
                        continue;
                    }
                } else if (var387 >= 1000 && var387 < 1100 || var387 >= 2000 && var387 < 2100) {
                    class159 var75;
                    if (var387 >= 2000) {
                        var387 -= 1000;
                        var4--;
                        var75 = class159.method2352(field405[var4]);
                    } else {
                        var75 = var61 ? Statics.field2037 : Statics.field398;
                    }
                    if (var387 == 1000) {
                        var4 -= 2;
                        var75.field2613 = field405[var4];
                        var75.field2649 = field405[var4 + 1];
                        client.method2180(var75);
                        continue;
                    }
                    if (var387 == 1001) {
                        var4 -= 2;
                        var75.field2617 = field405[var4];
                        var75.field2618 = field405[var4 + 1];
                        client.method2180(var75);
                        continue;
                    }
                    if (var387 == 1003) {
                        var4--;
                        boolean var76 = field405[var4] == 1;
                        if (var75.field2620 != var76) {
                            var75.field2620 = var76;
                            client.method2180(var75);
                        }
                        continue;
                    }
                } else if (!(var387 < 1100 || var387 >= 1200) || !(var387 < 2100 || var387 >= 2200)) {
                    class159 var77;
                    if (var387 >= 2000) {
                        var387 -= 1000;
                        var4--;
                        var77 = class159.method2352(field405[var4]);
                    } else {
                        var77 = var61 ? Statics.field2037 : Statics.field398;
                    }
                    if (var387 == 1100) {
                        var4 -= 2;
                        var77.field2621 = field405[var4];
                        if (var77.field2621 > var77.field2597 - var77.field2617) {
                            var77.field2621 = var77.field2597 - var77.field2617;
                        }
                        if (var77.field2621 < 0) {
                            var77.field2621 = 0;
                        }
                        var77.field2622 = field405[var4 + 1];
                        if (var77.field2622 > var77.field2624 - var77.field2618) {
                            var77.field2622 = var77.field2624 - var77.field2618;
                        }
                        if (var77.field2622 < 0) {
                            var77.field2622 = 0;
                        }
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1101) {
                        var4--;
                        var77.field2692 = field405[var4];
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1102) {
                        var4--;
                        var77.field2629 = field405[var4] == 1;
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1103) {
                        var4--;
                        var77.field2630 = field405[var4];
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1104) {
                        var4--;
                        var77.field2631 = field405[var4];
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1105) {
                        var4--;
                        var77.field2716 = field405[var4];
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1106) {
                        var4--;
                        var77.field2634 = field405[var4];
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1107) {
                        var4--;
                        var77.field2652 = field405[var4] == 1;
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1108) {
                        var77.field2640 = 1;
                        var4--;
                        var77.field2641 = field405[var4];
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1109) {
                        var4 -= 6;
                        var77.field2646 = field405[var4];
                        var77.field2647 = field405[var4 + 1];
                        var77.field2720 = field405[var4 + 2];
                        var77.field2696 = field405[var4 + 3];
                        var77.field2650 = field405[var4 + 4];
                        var77.field2651 = field405[var4 + 5];
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1110) {
                        var4--;
                        int var78 = field405[var4];
                        if (var77.field2644 != var78) {
                            var77.field2644 = var78;
                            var77.field2603 = 0;
                            var77.field2715 = 0;
                            client.method2180(var77);
                        }
                        continue;
                    }
                    if (var387 == 1111) {
                        var4--;
                        var77.field2638 = field405[var4] == 1;
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1112) {
                        var5--;
                        String var79 = field396[var5];
                        if (!var79.equals(var77.field2655)) {
                            var77.field2655 = var79;
                            client.method2180(var77);
                        }
                        continue;
                    }
                    if (var387 == 1113) {
                        var4--;
                        var77.field2656 = field405[var4];
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1114) {
                        var4 -= 3;
                        var77.field2658 = field405[var4];
                        var77.field2701 = field405[var4 + 1];
                        var77.field2657 = field405[var4 + 2];
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1115) {
                        var4--;
                        var77.field2660 = field405[var4] == 1;
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1116) {
                        var4--;
                        var77.field2636 = field405[var4];
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1117) {
                        var4--;
                        var77.field2637 = field405[var4];
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1118) {
                        var4--;
                        var77.field2708 = field405[var4] == 1;
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1119) {
                        var4--;
                        var77.field2639 = field405[var4] == 1;
                        client.method2180(var77);
                        continue;
                    }
                    if (var387 == 1120) {
                        var4 -= 2;
                        var77.field2597 = field405[var4];
                        var77.field2624 = field405[var4 + 1];
                        client.method2180(var77);
                        continue;
                    }
                } else if (!(var387 < 1200 || var387 >= 1300) || !(var387 < 2200 || var387 >= 2300)) {
                    class159 var80;
                    if (var387 >= 2000) {
                        var387 -= 1000;
                        var4--;
                        var80 = class159.method2352(field405[var4]);
                    } else {
                        var80 = var61 ? Statics.field2037 : Statics.field398;
                    }
                    client.method2180(var80);
                    if (var387 == 1200) {
                        var4 -= 2;
                        int var81 = field405[var4];
                        int var82 = field405[var4 + 1];
                        var80.field2648 = var81;
                        var80.field2705 = var82;
                        class40 var83 = class40.method672(var81);
                        var80.field2720 = var83.field979;
                        var80.field2696 = var83.field980;
                        var80.field2650 = var83.field1010;
                        var80.field2646 = var83.field992;
                        var80.field2647 = var83.field983;
                        var80.field2651 = var83.field978;
                        if (var80.field2617 > 0) {
                            var80.field2651 = var80.field2651 * 32 / var80.field2617;
                        }
                        continue;
                    }
                    if (var387 == 1201) {
                        var80.field2640 = 2;
                        var4--;
                        var80.field2641 = field405[var4];
                        continue;
                    }
                    if (var387 == 1202) {
                        var80.field2640 = 3;
                        var80.field2641 = Statics.field52.field51.method3215();
                        continue;
                    }
                } else if ((var387 < 1300 || var387 >= 1400) && (var387 < 2300 || var387 >= 2400)) {
                    if (var387 >= 1400 && var387 < 1500 || var387 >= 2400 && var387 < 2500) {
                        class159 var88;
                        if (var387 >= 2000) {
                            var387 -= 1000;
                            var4--;
                            var88 = class159.method2352(field405[var4]);
                        } else {
                            var88 = var61 ? Statics.field2037 : Statics.field398;
                        }
                        var5--;
                        String var89 = field396[var5];
                        int[] var90 = null;
                        if (var89.length() > 0 && var89.charAt(var89.length() - 1) == 'Y') {
                            var4--;
                            int var91 = field405[var4];
                            if (var91 > 0) {
                                var90 = new int[var91];
                                while (var91-- > 0) {
                                    var4--;
                                    var90[var91] = field405[var4];
                                }
                            }
                            var89 = var89.substring(0, var89.length() - 1);
                        }
                        Object[] var92 = new Object[var89.length() + 1];
                        for (int var93 = var92.length - 1; var93 >= 1; var93--) {
                            if (var89.charAt(var93 - 1) == 's') {
                                var5--;
                                var92[var93] = field396[var5];
                            } else {
                                var4--;
                                var92[var93] = Integer.valueOf(field405[var4]);
                            }
                        }
                        var4--;
                        int var94 = field405[var4];
                        if (var94 == -1) {
                            var92 = null;
                        } else {
                            var92[0] = Integer.valueOf(var94);
                        }
                        if (var387 == 1400) {
                            var88.field2713 = var92;
                        }
                        if (var387 == 1401) {
                            var88.field2680 = var92;
                        }
                        if (var387 == 1402) {
                            var88.field2679 = var92;
                        }
                        if (var387 == 1403) {
                            var88.field2681 = var92;
                        }
                        if (var387 == 1404) {
                            var88.field2635 = var92;
                        }
                        if (var387 == 1405) {
                            var88.field2677 = var92;
                        }
                        if (var387 == 1406) {
                            var88.field2687 = var92;
                        }
                        if (var387 == 1407) {
                            var88.field2688 = var92;
                            var88.field2689 = var90;
                        }
                        if (var387 == 1408) {
                            var88.field2625 = var92;
                        }
                        if (var387 == 1409) {
                            var88.field2712 = var92;
                        }
                        if (var387 == 1410) {
                            var88.field2686 = var92;
                        }
                        if (var387 == 1411) {
                            var88.field2678 = var92;
                        }
                        if (var387 == 1412) {
                            var88.field2682 = var92;
                        }
                        if (var387 == 1414) {
                            var88.field2698 = var92;
                            var88.field2623 = var90;
                        }
                        if (var387 == 1415) {
                            var88.field2668 = var92;
                            var88.field2693 = var90;
                        }
                        if (var387 == 1416) {
                            var88.field2662 = var92;
                        }
                        if (var387 == 1417) {
                            var88.field2707 = var92;
                        }
                        if (var387 == 1418) {
                            var88.field2683 = var92;
                        }
                        if (var387 == 1419) {
                            var88.field2685 = var92;
                        }
                        if (var387 == 1420) {
                            var88.field2699 = var92;
                        }
                        if (var387 == 1421) {
                            var88.field2700 = var92;
                        }
                        if (var387 == 1422) {
                            var88.field2690 = var92;
                        }
                        if (var387 == 1423) {
                            var88.field2702 = var92;
                        }
                        if (var387 == 1424) {
                            var88.field2703 = var92;
                        }
                        var88.field2675 = true;
                        continue;
                    }
                    if (var387 < 1600) {
                        class159 var95 = var61 ? Statics.field2037 : Statics.field398;
                        if (var387 == 1500) {
                            field405[var4++] = var95.field2613;
                            continue;
                        }
                        if (var387 == 1501) {
                            field405[var4++] = var95.field2649;
                            continue;
                        }
                        if (var387 == 1502) {
                            field405[var4++] = var95.field2617;
                            continue;
                        }
                        if (var387 == 1503) {
                            field405[var4++] = var95.field2618;
                            continue;
                        }
                        if (var387 == 1504) {
                            field405[var4++] = var95.field2620 ? 1 : 0;
                            continue;
                        }
                        if (var387 == 1505) {
                            field405[var4++] = var95.field2619;
                            continue;
                        }
                    } else if (var387 < 1700) {
                        class159 var96 = var61 ? Statics.field2037 : Statics.field398;
                        if (var387 == 1600) {
                            field405[var4++] = var96.field2621;
                            continue;
                        }
                        if (var387 == 1601) {
                            field405[var4++] = var96.field2622;
                            continue;
                        }
                        if (var387 == 1602) {
                            field396[var5++] = var96.field2655;
                            continue;
                        }
                        if (var387 == 1603) {
                            field405[var4++] = var96.field2597;
                            continue;
                        }
                        if (var387 == 1604) {
                            field405[var4++] = var96.field2624;
                            continue;
                        }
                        if (var387 == 1605) {
                            field405[var4++] = var96.field2651;
                            continue;
                        }
                        if (var387 == 1606) {
                            field405[var4++] = var96.field2720;
                            continue;
                        }
                        if (var387 == 1607) {
                            field405[var4++] = var96.field2650;
                            continue;
                        }
                        if (var387 == 1608) {
                            field405[var4++] = var96.field2696;
                            continue;
                        }
                    } else if (var387 < 1800) {
                        class159 var97 = var61 ? Statics.field2037 : Statics.field398;
                        if (var387 == 1700) {
                            field405[var4++] = var97.field2648;
                            continue;
                        }
                        if (var387 == 1701) {
                            if (var97.field2648 == -1) {
                                field405[var4++] = 0;
                            } else {
                                field405[var4++] = var97.field2705;
                            }
                            continue;
                        }
                        if (var387 == 1702) {
                            field405[var4++] = var97.field2609;
                            continue;
                        }
                    } else if (var387 < 1900) {
                        class159 var98 = var61 ? Statics.field2037 : Statics.field398;
                        if (var387 == 1800) {
                            int[] var99 = field405;
                            int var100 = var4++;
                            int var101 = client.method256(var98);
                            int var102 = var101 >> 11 & 0x3F;
                            var99[var100] = var102;
                            continue;
                        }
                        if (var387 == 1801) {
                            var4--;
                            int var103 = field405[var4];
                            int var388 = var103 - 1;
                            if (var98.field2669 != null && var388 < var98.field2669.length && var98.field2669[var388] != null) {
                                field396[var5++] = var98.field2669[var388];
                                continue;
                            }
                            field396[var5++] = "";
                            continue;
                        }
                        if (var387 == 1802) {
                            if (var98.field2628 == null) {
                                field396[var5++] = "";
                            } else {
                                field396[var5++] = var98.field2628;
                            }
                            continue;
                        }
                    } else if (var387 < 2600) {
                        var4--;
                        class159 var104 = class159.method2352(field405[var4]);
                        if (var387 == 2500) {
                            field405[var4++] = var104.field2613;
                            continue;
                        }
                        if (var387 == 2501) {
                            field405[var4++] = var104.field2649;
                            continue;
                        }
                        if (var387 == 2502) {
                            field405[var4++] = var104.field2617;
                            continue;
                        }
                        if (var387 == 2503) {
                            field405[var4++] = var104.field2618;
                            continue;
                        }
                        if (var387 == 2504) {
                            field405[var4++] = var104.field2620 ? 1 : 0;
                            continue;
                        }
                        if (var387 == 2505) {
                            field405[var4++] = var104.field2619;
                            continue;
                        }
                    } else if (var387 < 2700) {
                        var4--;
                        class159 var105 = class159.method2352(field405[var4]);
                        if (var387 == 2600) {
                            field405[var4++] = var105.field2621;
                            continue;
                        }
                        if (var387 == 2601) {
                            field405[var4++] = var105.field2622;
                            continue;
                        }
                        if (var387 == 2602) {
                            field396[var5++] = var105.field2655;
                            continue;
                        }
                        if (var387 == 2603) {
                            field405[var4++] = var105.field2597;
                            continue;
                        }
                        if (var387 == 2604) {
                            field405[var4++] = var105.field2624;
                            continue;
                        }
                        if (var387 == 2605) {
                            field405[var4++] = var105.field2651;
                            continue;
                        }
                        if (var387 == 2606) {
                            field405[var4++] = var105.field2720;
                            continue;
                        }
                        if (var387 == 2607) {
                            field405[var4++] = var105.field2650;
                            continue;
                        }
                        if (var387 == 2608) {
                            field405[var4++] = var105.field2696;
                            continue;
                        }
                    } else if (var387 < 2800) {
                        if (var387 == 2700) {
                            var4--;
                            class159 var106 = class159.method2352(field405[var4]);
                            field405[var4++] = var106.field2648;
                            continue;
                        }
                        if (var387 == 2701) {
                            var4--;
                            class159 var107 = class159.method2352(field405[var4]);
                            if (var107.field2648 == -1) {
                                field405[var4++] = 0;
                            } else {
                                field405[var4++] = var107.field2705;
                            }
                            continue;
                        }
                        if (var387 == 2702) {
                            var4--;
                            int var108 = field405[var4];
                            class4 var109 = (class4) client.field629.method3291((long) var108);
                            if (var109 == null) {
                                field405[var4++] = 0;
                            } else {
                                field405[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var387 < 2900) {
                        var4--;
                        class159 var110 = class159.method2352(field405[var4]);
                        if (var387 == 2800) {
                            int[] var111 = field405;
                            int var112 = var4++;
                            int var113 = client.method256(var110);
                            int var114 = var113 >> 11 & 0x3F;
                            var111[var112] = var114;
                            continue;
                        }
                        if (var387 == 2801) {
                            var4--;
                            int var115 = field405[var4];
                            int var389 = var115 - 1;
                            if (var110.field2669 != null && var389 < var110.field2669.length && var110.field2669[var389] != null) {
                                field396[var5++] = var110.field2669[var389];
                                continue;
                            }
                            field396[var5++] = "";
                            continue;
                        }
                        if (var387 == 2802) {
                            if (var110.field2628 == null) {
                                field396[var5++] = "";
                            } else {
                                field396[var5++] = var110.field2628;
                            }
                            continue;
                        }
                    } else if (var387 < 3200) {
                        if (var387 == 3100) {
                            var5--;
                            String var116 = field396[var5];
                            client.method35(0, "", var116);
                            continue;
                        }
                        if (var387 == 3101) {
                            var4 -= 2;
                            client.method261(Statics.field52, field405[var4], field405[var4 + 1]);
                            continue;
                        }
                        if (var387 == 3103) {
                            client.field602.method2306(67);
                            for (class4 var117 = (class4) client.field629.method3294(); var117 != null; var117 = (class4) client.field629.method3302()) {
                                if (var117.field55 == 0 || var117.field55 == 3) {
                                    client.method219(var117, true);
                                }
                            }
                            if (client.field632 != null) {
                                client.method2180(client.field632);
                                client.field632 = null;
                            }
                            continue;
                        }
                        if (var387 == 3104) {
                            var5--;
                            String var118 = field396[var5];
                            int var119 = 0;
                            if (class148.method2196(var118)) {
                                int var120 = class148.method205(var118, 10, true);
                                var119 = var120;
                            }
                            client.field602.method2306(106);
                            client.field602.method2425(var119);
                            continue;
                        }
                        if (var387 == 3105) {
                            var5--;
                            String var121 = field396[var5];
                            client.field602.method2306(214);
                            client.field602.method2422(var121.length() + 1);
                            client.field602.method2588(var121);
                            continue;
                        }
                        if (var387 == 3106) {
                            var5--;
                            String var122 = field396[var5];
                            client.field602.method2306(124);
                            client.field602.method2422(var122.length() + 1);
                            client.field602.method2588(var122);
                            continue;
                        }
                        if (var387 == 3107) {
                            var4--;
                            int var123 = field405[var4];
                            var5--;
                            String var124 = field396[var5];
                            client.method146(var123, var124);
                            continue;
                        }
                        if (var387 == 3108) {
                            var4 -= 3;
                            int var125 = field405[var4];
                            int var126 = field405[var4 + 1];
                            int var127 = field405[var4 + 2];
                            class159 var128 = class159.method2352(var127);
                            client.method13(var128, var125, var126);
                            continue;
                        }
                        if (var387 == 3109) {
                            var4 -= 2;
                            int var129 = field405[var4];
                            int var130 = field405[var4 + 1];
                            class159 var131 = var61 ? Statics.field2037 : Statics.field398;
                            client.method13(var131, var129, var130);
                            continue;
                        }
                    } else if (var387 < 3300) {
                        if (var387 == 3200) {
                            var4 -= 3;
                            int var132 = field405[var4];
                            int var133 = field405[var4 + 1];
                            int var134 = field405[var4 + 2];
                            if (client.field706 != 0 && var133 != 0 && client.field549 < 50) {
                                client.field709[client.field549] = var132;
                                client.field580[client.field549] = var133;
                                client.field711[client.field549] = var134;
                                client.field713[client.field549] = null;
                                client.field712[client.field549] = 0;
                                client.field549++;
                            }
                            continue;
                        }
                        if (var387 == 3201) {
                            var4--;
                            client.method2698(field405[var4]);
                            continue;
                        }
                        if (var387 == 3202) {
                            var4 -= 2;
                            int var135 = field405[var4];
                            int var10000 = field405[var4 + 1];
                            if (client.field703 != 0 && var135 != -1) {
                                class139.method235(Statics.field962, var135, 0, client.field703, false);
                                client.field705 = true;
                            }
                            continue;
                        }
                    } else if (var387 < 3400) {
                        if (var387 == 3300) {
                            field405[var4++] = client.field477;
                            continue;
                        }
                        if (var387 == 3301) {
                            var4 -= 2;
                            int var137 = field405[var4];
                            int var138 = field405[var4 + 1];
                            field405[var4++] = class19.method2861(var137, var138);
                            continue;
                        }
                        if (var387 == 3302) {
                            var4 -= 2;
                            int var139 = field405[var4];
                            int var140 = field405[var4 + 1];
                            int[] var141 = field405;
                            int var142 = var4++;
                            class19 var143 = (class19) class19.field280.method3291((long) var139);
                            int var144;
                            if (var143 == null) {
                                var144 = 0;
                            } else if (var140 >= 0 && var140 < var143.field278.length) {
                                var144 = var143.field278[var140];
                            } else {
                                var144 = 0;
                            }
                            var141[var142] = var144;
                            continue;
                        }
                        if (var387 == 3303) {
                            var4 -= 2;
                            int var145 = field405[var4];
                            int var146 = field405[var4 + 1];
                            int[] var147 = field405;
                            int var148 = var4++;
                            class19 var149 = (class19) class19.field280.method3291((long) var145);
                            int var150;
                            if (var149 == null) {
                                var150 = 0;
                            } else if (var146 == -1) {
                                var150 = 0;
                            } else {
                                int var151 = 0;
                                for (int var152 = 0; var152 < var149.field278.length; var152++) {
                                    if (var149.field277[var152] == var146) {
                                        var151 += var149.field278[var152];
                                    }
                                }
                                var150 = var151;
                            }
                            var147[var148] = var150;
                            continue;
                        }
                        if (var387 == 3304) {
                            var4--;
                            int var153 = field405[var4];
                            int[] var154 = field405;
                            int var155 = var4++;
                            class41 var156 = (class41) class41.field1014.method3248((long) var153);
                            class41 var157;
                            if (var156 == null) {
                                byte[] var158 = Statics.field1019.method3026(5, var153);
                                class41 var159 = new class41();
                                if (var158 != null) {
                                    var159.method859(new class126(var158));
                                }
                                class41.field1014.method3252(var159, (long) var153);
                                var157 = var159;
                            } else {
                                var157 = var156;
                            }
                            var154[var155] = var157.field1013;
                            continue;
                        }
                        if (var387 == 3305) {
                            var4--;
                            int var160 = field405[var4];
                            field405[var4++] = client.field710[var160];
                            continue;
                        }
                        if (var387 == 3306) {
                            var4--;
                            int var161 = field405[var4];
                            field405[var4++] = client.field627[var161];
                            continue;
                        }
                        if (var387 == 3307) {
                            var4--;
                            int var162 = field405[var4];
                            field405[var4++] = client.field642[var162];
                            continue;
                        }
                        if (var387 == 3308) {
                            int var163 = Statics.field263;
                            int var164 = (Statics.field52.field443 >> 7) + Statics.field56;
                            int var165 = (Statics.field52.field408 >> 7) + Statics.field932;
                            field405[var4++] = (var163 << 28) + (var164 << 14) + var165;
                            continue;
                        }
                        if (var387 == 3309) {
                            var4--;
                            int var166 = field405[var4];
                            field405[var4++] = var166 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var387 == 3310) {
                            var4--;
                            int var167 = field405[var4];
                            field405[var4++] = var167 >> 28;
                            continue;
                        }
                        if (var387 == 3311) {
                            var4--;
                            int var168 = field405[var4];
                            field405[var4++] = var168 & 0x3FFF;
                            continue;
                        }
                        if (var387 == 3312) {
                            field405[var4++] = client.field472 ? 1 : 0;
                            continue;
                        }
                        if (var387 == 3313) {
                            var4 -= 2;
                            int var169 = field405[var4] + 32768;
                            int var170 = field405[var4 + 1];
                            field405[var4++] = class19.method2861(var169, var170);
                            continue;
                        }
                        if (var387 == 3314) {
                            var4 -= 2;
                            int var171 = field405[var4] + 32768;
                            int var172 = field405[var4 + 1];
                            int[] var173 = field405;
                            int var174 = var4++;
                            class19 var175 = (class19) class19.field280.method3291((long) var171);
                            int var176;
                            if (var175 == null) {
                                var176 = 0;
                            } else if (var172 >= 0 && var172 < var175.field278.length) {
                                var176 = var175.field278[var172];
                            } else {
                                var176 = 0;
                            }
                            var173[var174] = var176;
                            continue;
                        }
                        if (var387 == 3315) {
                            var4 -= 2;
                            int var177 = field405[var4] + 32768;
                            int var178 = field405[var4 + 1];
                            int[] var179 = field405;
                            int var180 = var4++;
                            class19 var181 = (class19) class19.field280.method3291((long) var177);
                            int var182;
                            if (var181 == null) {
                                var182 = 0;
                            } else if (var178 == -1) {
                                var182 = 0;
                            } else {
                                int var183 = 0;
                                for (int var184 = 0; var184 < var181.field278.length; var184++) {
                                    if (var181.field277[var184] == var178) {
                                        var183 += var181.field278[var184];
                                    }
                                }
                                var182 = var183;
                            }
                            var179[var180] = var182;
                            continue;
                        }
                        if (var387 == 3316) {
                            if (client.field635 >= 2) {
                                field405[var4++] = client.field635;
                            } else {
                                field405[var4++] = 0;
                            }
                            continue;
                        }
                        if (var387 == 3317) {
                            field405[var4++] = client.field484;
                            continue;
                        }
                        if (var387 == 3318) {
                            field405[var4++] = client.field692;
                            continue;
                        }
                        if (var387 == 3321) {
                            field405[var4++] = client.field633;
                            continue;
                        }
                        if (var387 == 3322) {
                            field405[var4++] = client.field634;
                            continue;
                        }
                        if (var387 == 3323) {
                            if (client.field553) {
                                field405[var4++] = 1;
                            } else {
                                field405[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var387 < 3500) {
                        if (var387 == 3400) {
                            var4 -= 2;
                            int var185 = field405[var4];
                            int var186 = field405[var4 + 1];
                            class39 var187 = (class39) class39.field944.method3248((long) var185);
                            class39 var188;
                            if (var187 == null) {
                                byte[] var189 = Statics.field960.method3026(8, var185);
                                class39 var190 = new class39();
                                if (var189 != null) {
                                    var190.method806(new class126(var189));
                                }
                                class39.field944.method3252(var190, (long) var185);
                                var188 = var190;
                            } else {
                                var188 = var187;
                            }
                            class39 var191 = var188;
                            if (var188.field946 != 's') {
                            }
                            for (int var192 = 0; var192 < var191.field949; var192++) {
                                if (var191.field950[var192] == var186) {
                                    field396[var5++] = var191.field955[var192];
                                    var191 = null;
                                    break;
                                }
                            }
                            if (var191 != null) {
                                field396[var5++] = var191.field947;
                            }
                            continue;
                        }
                        if (var387 == 3408) {
                            var4 -= 4;
                            int var193 = field405[var4];
                            int var194 = field405[var4 + 1];
                            int var195 = field405[var4 + 2];
                            int var196 = field405[var4 + 3];
                            class39 var197 = (class39) class39.field944.method3248((long) var195);
                            class39 var198;
                            if (var197 == null) {
                                byte[] var199 = Statics.field960.method3026(8, var195);
                                class39 var200 = new class39();
                                if (var199 != null) {
                                    var200.method806(new class126(var199));
                                }
                                class39.field944.method3252(var200, (long) var195);
                                var198 = var200;
                            } else {
                                var198 = var197;
                            }
                            class39 var201 = var198;
                            if (var198.field945 == var193 && var198.field946 == var194) {
                                for (int var202 = 0; var202 < var201.field949; var202++) {
                                    if (var201.field950[var202] == var196) {
                                        if (var194 == 115) {
                                            field396[var5++] = var201.field955[var202];
                                        } else {
                                            field405[var4++] = var201.field951[var202];
                                        }
                                        var201 = null;
                                        break;
                                    }
                                }
                                if (var201 != null) {
                                    if (var194 == 115) {
                                        field396[var5++] = var201.field947;
                                    } else {
                                        field405[var4++] = var201.field943;
                                    }
                                }
                                continue;
                            }
                            if (var194 == 115) {
                                field396[var5++] = "null";
                            } else {
                                field405[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var387 < 3700) {
                        if (var387 == 3600) {
                            if (client.field601 == 0) {
                                field405[var4++] = -2;
                            } else if (client.field601 == 1) {
                                field405[var4++] = -1;
                            } else {
                                field405[var4++] = client.field720;
                            }
                            continue;
                        }
                        if (var387 == 3601) {
                            var4--;
                            int var203 = field405[var4];
                            if (client.field601 == 2 && var203 < client.field720) {
                                field396[var5++] = client.field618[var203].field367;
                                continue;
                            }
                            field396[var5++] = "";
                            continue;
                        }
                        if (var387 == 3602) {
                            var4--;
                            int var204 = field405[var4];
                            if (client.field601 == 2 && var204 < client.field720) {
                                field405[var4++] = client.field618[var204].field361;
                                continue;
                            }
                            field405[var4++] = 0;
                            continue;
                        }
                        if (var387 == 3603) {
                            var4--;
                            int var205 = field405[var4];
                            if (client.field601 == 2 && var205 < client.field720) {
                                field405[var4++] = client.field618[var205].field359;
                                continue;
                            }
                            field405[var4++] = 0;
                            continue;
                        }
                        if (var387 == 3604) {
                            var5--;
                            String var206 = field396[var5];
                            var4--;
                            int var207 = field405[var4];
                            client.field602.method2306(78);
                            class116 var208 = client.field602;
                            int var209 = var206.length() + 1;
                            var208.method2422(var209 + 1);
                            client.field602.method2588(var206);
                            client.field602.method2422(var207);
                            continue;
                        }
                        if (var387 == 3605) {
                            var5--;
                            String var210 = field396[var5];
                            if (var210 == null) {
                                continue;
                            }
                            if ((client.field720 < 200 || client.field595 == 1) && client.field720 < 400) {
                                String var211 = class149.method1628(var210, Statics.field471);
                                if (var211 == null) {
                                    continue;
                                }
                                for (int var212 = 0; var212 < client.field720; var212++) {
                                    class23 var213 = client.field618[var212];
                                    String var214 = class149.method1628(var213.field367, Statics.field471);
                                    if (var214 != null && var214.equals(var211)) {
                                        client.method35(0, "", var210 + class135.field2255);
                                        continue label2498;
                                    }
                                    if (var213.field357 != null) {
                                        String var215 = class149.method1628(var213.field357, Statics.field471);
                                        if (var215 != null && var215.equals(var211)) {
                                            client.method35(0, "", var210 + class135.field2255);
                                            continue label2498;
                                        }
                                    }
                                }
                                for (int var216 = 0; var216 < client.field724; var216++) {
                                    class11 var217 = client.field725[var216];
                                    String var218 = class149.method1628(var217.field188, Statics.field471);
                                    if (var218 != null && var218.equals(var211)) {
                                        client.method35(0, "", class135.field2260 + var210 + class135.field2213);
                                        continue label2498;
                                    }
                                    if (var217.field182 != null) {
                                        String var219 = class149.method1628(var217.field182, Statics.field471);
                                        if (var219 != null && var219.equals(var211)) {
                                            client.method35(0, "", class135.field2260 + var210 + class135.field2213);
                                            continue label2498;
                                        }
                                    }
                                }
                                if (class149.method1628(Statics.field52.field32, Statics.field471).equals(var211)) {
                                    client.method35(0, "", class135.field2258);
                                } else {
                                    client.field602.method2306(8);
                                    class116 var220 = client.field602;
                                    int var221 = var210.length() + 1;
                                    var220.method2422(var221);
                                    client.field602.method2588(var210);
                                }
                                continue;
                            }
                            client.method35(0, "", class135.field2296);
                            continue;
                        }
                        if (var387 == 3606) {
                            var5--;
                            String var222 = field396[var5];
                            client.method1143(var222);
                            continue;
                        }
                        if (var387 == 3607) {
                            var5--;
                            String var223 = field396[var5];
                            client.method136(var223, false);
                            continue;
                        }
                        if (var387 == 3608) {
                            var5--;
                            String var224 = field396[var5];
                            if (var224 == null) {
                                continue;
                            }
                            String var225 = class149.method1628(var224, Statics.field471);
                            if (var225 == null) {
                                continue;
                            }
                            int var226 = 0;
                            while (true) {
                                if (var226 >= client.field724) {
                                    continue label2498;
                                }
                                class11 var227 = client.field725[var226];
                                String var228 = var227.field188;
                                String var229 = class149.method1628(var228, Statics.field471);
                                if (class137.method1265(var224, var225, var228, var229)) {
                                    client.field724--;
                                    for (int var230 = var226; var230 < client.field724; var230++) {
                                        client.field725[var230] = client.field725[var230 + 1];
                                    }
                                    client.field659 = client.field651;
                                    client.field602.method2306(209);
                                    class116 var231 = client.field602;
                                    int var232 = var224.length() + 1;
                                    var231.method2422(var232);
                                    client.field602.method2588(var224);
                                    continue label2498;
                                }
                                var226++;
                            }
                        }
                        if (var387 == 3609) {
                            var5--;
                            String var233 = field396[var5];
                            if (var233.startsWith(class2.method1168(0)) || var233.startsWith(class2.method1168(1))) {
                                var233 = var233.substring(7);
                            }
                            field405[var4++] = client.method544(var233) ? 1 : 0;
                            continue;
                        }
                        if (var387 == 3611) {
                            if (client.field693 == null) {
                                field396[var5++] = "";
                            } else {
                                field396[var5++] = class147.method2027(client.field693);
                            }
                            continue;
                        }
                        if (var387 == 3612) {
                            if (client.field693 == null) {
                                field405[var4++] = 0;
                            } else {
                                field405[var4++] = Statics.field1017;
                            }
                            continue;
                        }
                        if (var387 == 3613) {
                            var4--;
                            int var234 = field405[var4];
                            if (client.field693 != null && var234 < Statics.field1017) {
                                field396[var5++] = Statics.field2367[var234].field120;
                                continue;
                            }
                            field396[var5++] = "";
                            continue;
                        }
                        if (var387 == 3614) {
                            var4--;
                            int var235 = field405[var4];
                            if (client.field693 != null && var235 < Statics.field1017) {
                                field405[var4++] = Statics.field2367[var235].field114;
                                continue;
                            }
                            field405[var4++] = 0;
                            continue;
                        }
                        if (var387 == 3615) {
                            var4--;
                            int var236 = field405[var4];
                            if (client.field693 != null && var236 < Statics.field1017) {
                                field405[var4++] = Statics.field2367[var236].field115;
                                continue;
                            }
                            field405[var4++] = 0;
                            continue;
                        }
                        if (var387 == 3616) {
                            field405[var4++] = Statics.field1913;
                            continue;
                        }
                        if (var387 == 3617) {
                            var5--;
                            String var237 = field396[var5];
                            if (Statics.field2367 != null) {
                                client.field602.method2306(182);
                                class116 var238 = client.field602;
                                int var239 = var237.length() + 1;
                                var238.method2422(var239);
                                client.field602.method2588(var237);
                            }
                            continue;
                        }
                        if (var387 == 3618) {
                            field405[var4++] = Statics.field247;
                            continue;
                        }
                        if (var387 == 3619) {
                            var5--;
                            String var240 = field396[var5];
                            if (!var240.equals("")) {
                                client.field602.method2306(229);
                                class116 var241 = client.field602;
                                int var242 = var240.length() + 1;
                                var241.method2422(var242);
                                client.field602.method2588(var240);
                            }
                            continue;
                        }
                        if (var387 == 3620) {
                            client.method1530();
                            continue;
                        }
                        if (var387 == 3621) {
                            if (client.field601 == 0) {
                                field405[var4++] = -1;
                            } else {
                                field405[var4++] = client.field724;
                            }
                            continue;
                        }
                        if (var387 == 3622) {
                            var4--;
                            int var243 = field405[var4];
                            if (client.field601 != 0 && var243 < client.field724) {
                                field396[var5++] = client.field725[var243].field188;
                                continue;
                            }
                            field396[var5++] = "";
                            continue;
                        }
                        if (var387 == 3623) {
                            var5--;
                            String var244 = field396[var5];
                            if (var244.startsWith(class2.method1168(0)) || var244.startsWith(class2.method1168(1))) {
                                var244 = var244.substring(7);
                            }
                            field405[var4++] = client.method791(var244) ? 1 : 0;
                            continue;
                        }
                        if (var387 == 3624) {
                            var4--;
                            int var245 = field405[var4];
                            if (Statics.field2367 != null && var245 < Statics.field1017 && Statics.field2367[var245].field120.equalsIgnoreCase(Statics.field52.field32)) {
                                field405[var4++] = 1;
                                continue;
                            }
                            field405[var4++] = 0;
                            continue;
                        }
                        if (var387 == 3625) {
                            if (client.field694 == null) {
                                field396[var5++] = "";
                            } else {
                                field396[var5++] = class147.method2027(client.field694);
                            }
                            continue;
                        }
                    } else if (var387 < 4100) {
                        if (var387 == 4000) {
                            var4 -= 2;
                            int var246 = field405[var4];
                            int var247 = field405[var4 + 1];
                            field405[var4++] = var246 + var247;
                            continue;
                        }
                        if (var387 == 4001) {
                            var4 -= 2;
                            int var248 = field405[var4];
                            int var249 = field405[var4 + 1];
                            field405[var4++] = var248 - var249;
                            continue;
                        }
                        if (var387 == 4002) {
                            var4 -= 2;
                            int var250 = field405[var4];
                            int var251 = field405[var4 + 1];
                            field405[var4++] = var250 * var251;
                            continue;
                        }
                        if (var387 == 4003) {
                            var4 -= 2;
                            int var252 = field405[var4];
                            int var253 = field405[var4 + 1];
                            field405[var4++] = var252 / var253;
                            continue;
                        }
                        if (var387 == 4004) {
                            var4--;
                            int var254 = field405[var4];
                            field405[var4++] = (int) (Math.random() * (double) var254);
                            continue;
                        }
                        if (var387 == 4005) {
                            var4--;
                            int var255 = field405[var4];
                            field405[var4++] = (int) (Math.random() * (double) (var255 + 1));
                            continue;
                        }
                        if (var387 == 4006) {
                            var4 -= 5;
                            int var256 = field405[var4];
                            int var257 = field405[var4 + 1];
                            int var258 = field405[var4 + 2];
                            int var259 = field405[var4 + 3];
                            int var260 = field405[var4 + 4];
                            field405[var4++] = (var257 - var256) * (var260 - var258) / (var259 - var258) + var256;
                            continue;
                        }
                        if (var387 == 4007) {
                            var4 -= 2;
                            int var261 = field405[var4];
                            int var262 = field405[var4 + 1];
                            field405[var4++] = var261 * var262 / 100 + var261;
                            continue;
                        }
                        if (var387 == 4008) {
                            var4 -= 2;
                            int var263 = field405[var4];
                            int var264 = field405[var4 + 1];
                            field405[var4++] = var263 | 0x1 << var264;
                            continue;
                        }
                        if (var387 == 4009) {
                            var4 -= 2;
                            int var265 = field405[var4];
                            int var266 = field405[var4 + 1];
                            field405[var4++] = var265 & -1 - (0x1 << var266);
                            continue;
                        }
                        if (var387 == 4010) {
                            var4 -= 2;
                            int var267 = field405[var4];
                            int var268 = field405[var4 + 1];
                            field405[var4++] = (var267 & 0x1 << var268) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var387 == 4011) {
                            var4 -= 2;
                            int var269 = field405[var4];
                            int var270 = field405[var4 + 1];
                            field405[var4++] = var269 % var270;
                            continue;
                        }
                        if (var387 == 4012) {
                            var4 -= 2;
                            int var271 = field405[var4];
                            int var272 = field405[var4 + 1];
                            if (var271 == 0) {
                                field405[var4++] = 0;
                            } else {
                                field405[var4++] = (int) Math.pow((double) var271, (double) var272);
                            }
                            continue;
                        }
                        if (var387 == 4013) {
                            var4 -= 2;
                            int var273 = field405[var4];
                            int var274 = field405[var4 + 1];
                            if (var273 == 0) {
                                field405[var4++] = 0;
                            } else if (var274 == 0) {
                                field405[var4++] = Integer.MAX_VALUE;
                            } else {
                                field405[var4++] = (int) Math.pow((double) var273, 1.0D / (double) var274);
                            }
                            continue;
                        }
                        if (var387 == 4014) {
                            var4 -= 2;
                            int var275 = field405[var4];
                            int var276 = field405[var4 + 1];
                            field405[var4++] = var275 & var276;
                            continue;
                        }
                        if (var387 == 4015) {
                            var4 -= 2;
                            int var277 = field405[var4];
                            int var278 = field405[var4 + 1];
                            field405[var4++] = var277 | var278;
                            continue;
                        }
                    } else if (var387 < 4200) {
                        if (var387 == 4100) {
                            var5--;
                            String var279 = field396[var5];
                            var4--;
                            int var280 = field405[var4];
                            field396[var5++] = var279 + var280;
                            continue;
                        }
                        if (var387 == 4101) {
                            var5 -= 2;
                            String var281 = field396[var5];
                            String var282 = field396[var5 + 1];
                            field396[var5++] = var281 + var282;
                            continue;
                        }
                        if (var387 == 4102) {
                            var5--;
                            String var283 = field396[var5];
                            var4--;
                            int var284 = field405[var4];
                            field396[var5++] = var283 + class148.method587(var284, true);
                            continue;
                        }
                        if (var387 == 4103) {
                            var5--;
                            String var285 = field396[var5];
                            field396[var5++] = var285.toLowerCase();
                            continue;
                        }
                        if (var387 == 4104) {
                            var4--;
                            int var286 = field405[var4];
                            long var287 = ((long) var286 + 11745L) * 86400000L;
                            field400.setTime(new Date(var287));
                            int var289 = field400.get(5);
                            int var290 = field400.get(2);
                            int var291 = field400.get(1);
                            field396[var5++] = var289 + "-" + field401[var290] + "-" + var291;
                            continue;
                        }
                        if (var387 == 4105) {
                            var5 -= 2;
                            String var292 = field396[var5];
                            String var293 = field396[var5 + 1];
                            if (Statics.field52.field51 != null && Statics.field52.field51.field2744) {
                                field396[var5++] = var293;
                                continue;
                            }
                            field396[var5++] = var292;
                            continue;
                        }
                        if (var387 == 4106) {
                            var4--;
                            int var294 = field405[var4];
                            field396[var5++] = Integer.toString(var294);
                            continue;
                        }
                        if (var387 == 4107) {
                            var5 -= 2;
                            int[] var295 = field405;
                            int var296 = var4++;
                            int var297 = Statics.method49(field396[var5], field396[var5 + 1], client.field474);
                            byte var298;
                            if (var297 > 0) {
                                var298 = 1;
                            } else if (var297 < 0) {
                                var298 = -1;
                            } else {
                                var298 = 0;
                            }
                            var295[var296] = var298;
                            continue;
                        }
                        if (var387 == 4108) {
                            var5--;
                            String var299 = field396[var5];
                            var4 -= 2;
                            int var300 = field405[var4];
                            int var301 = field405[var4 + 1];
                            byte[] var302 = Statics.field1920.method3026(var301, 0);
                            class183 var303 = new class183(var302);
                            field405[var4++] = var303.method3372(var299, var300);
                            continue;
                        }
                        if (var387 == 4109) {
                            var5--;
                            String var304 = field396[var5];
                            var4 -= 2;
                            int var305 = field405[var4];
                            int var306 = field405[var4 + 1];
                            byte[] var307 = Statics.field1920.method3026(var306, 0);
                            class183 var308 = new class183(var307);
                            field405[var4++] = var308.method3400(var304, var305);
                            continue;
                        }
                        if (var387 == 4110) {
                            var5 -= 2;
                            String var309 = field396[var5];
                            String var310 = field396[var5 + 1];
                            var4--;
                            if (field405[var4] == 1) {
                                field396[var5++] = var309;
                            } else {
                                field396[var5++] = var310;
                            }
                            continue;
                        }
                        if (var387 == 4111) {
                            var5--;
                            String var311 = field396[var5];
                            field396[var5++] = class185.method3423(var311);
                            continue;
                        }
                        if (var387 == 4112) {
                            var5--;
                            String var312 = field396[var5];
                            var4--;
                            int var313 = field405[var4];
                            field396[var5++] = var312 + (char) var313;
                            continue;
                        }
                        if (var387 == 4113) {
                            var4--;
                            int var314 = field405[var4];
                            field405[var4++] = class148.method854((char) var314) ? 1 : 0;
                            continue;
                        }
                        if (var387 == 4114) {
                            var4--;
                            int var315 = field405[var4];
                            field405[var4++] = class148.method2112((char) var315) ? 1 : 0;
                            continue;
                        }
                        if (var387 == 4115) {
                            var4--;
                            int var316 = field405[var4];
                            field405[var4++] = class148.method2198((char) var316) ? 1 : 0;
                            continue;
                        }
                        if (var387 == 4116) {
                            var4--;
                            int var317 = field405[var4];
                            field405[var4++] = class148.method139((char) var317) ? 1 : 0;
                            continue;
                        }
                        if (var387 == 4117) {
                            var5--;
                            String var318 = field396[var5];
                            if (var318 == null) {
                                field405[var4++] = 0;
                            } else {
                                field405[var4++] = var318.length();
                            }
                            continue;
                        }
                        if (var387 == 4118) {
                            var5--;
                            String var319 = field396[var5];
                            var4 -= 2;
                            int var320 = field405[var4];
                            int var321 = field405[var4 + 1];
                            field396[var5++] = var319.substring(var320, var321);
                            continue;
                        }
                        if (var387 == 4119) {
                            var5--;
                            String var322 = field396[var5];
                            StringBuilder var323 = new StringBuilder(var322.length());
                            boolean var324 = false;
                            for (int var325 = 0; var325 < var322.length(); var325++) {
                                char var326 = var322.charAt(var325);
                                if (var326 == '<') {
                                    var324 = true;
                                } else if (var326 == '>') {
                                    var324 = false;
                                } else if (!var324) {
                                    var323.append(var326);
                                }
                            }
                            field396[var5++] = var323.toString();
                            continue;
                        }
                        if (var387 == 4120) {
                            var5--;
                            String var327 = field396[var5];
                            var4--;
                            int var328 = field405[var4];
                            field405[var4++] = var327.indexOf(var328);
                            continue;
                        }
                    } else if (var387 < 4300) {
                        if (var387 == 4200) {
                            var4--;
                            int var329 = field405[var4];
                            field396[var5++] = class40.method672(var329).field1008;
                            continue;
                        }
                        if (var387 == 4201) {
                            var4 -= 2;
                            int var330 = field405[var4];
                            int var331 = field405[var4 + 1];
                            class40 var332 = class40.method672(var330);
                            if (var331 >= 1 && var331 <= 5 && var332.field997[var331 - 1] != null) {
                                field396[var5++] = var332.field997[var331 - 1];
                                continue;
                            }
                            field396[var5++] = "";
                            continue;
                        }
                        if (var387 == 4202) {
                            var4 -= 2;
                            int var333 = field405[var4];
                            int var334 = field405[var4 + 1];
                            class40 var335 = class40.method672(var333);
                            if (var334 >= 1 && var334 <= 5 && var335.field988[var334 - 1] != null) {
                                field396[var5++] = var335.field988[var334 - 1];
                                continue;
                            }
                            field396[var5++] = "";
                            continue;
                        }
                        if (var387 == 4203) {
                            var4--;
                            int var336 = field405[var4];
                            field405[var4++] = class40.method672(var336).field985;
                            continue;
                        }
                        if (var387 == 4204) {
                            var4--;
                            int var337 = field405[var4];
                            field405[var4++] = class40.method672(var337).field984 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var387 == 4205) {
                            var4--;
                            int var338 = field405[var4];
                            class40 var339 = class40.method672(var338);
                            if (var339.field973 == -1 && var339.field1003 >= 0) {
                                field405[var4++] = var339.field1003;
                                continue;
                            }
                            field405[var4++] = var338;
                            continue;
                        }
                        if (var387 == 4206) {
                            var4--;
                            int var340 = field405[var4];
                            class40 var341 = class40.method672(var340);
                            if (var341.field973 >= 0 && var341.field1003 >= 0) {
                                field405[var4++] = var341.field1003;
                                continue;
                            }
                            field405[var4++] = var340;
                            continue;
                        }
                        if (var387 == 4207) {
                            var4--;
                            int var342 = field405[var4];
                            field405[var4++] = class40.method672(var342).field986 ? 1 : 0;
                            continue;
                        }
                    } else if (var387 < 5100) {
                        if (var387 == 5000) {
                            field405[var4++] = client.field685;
                            continue;
                        }
                        if (var387 == 5001) {
                            var4 -= 3;
                            client.field685 = field405[var4];
                            Statics.field1438 = class138.method1345(field405[var4 + 1]);
                            if (Statics.field1438 == null) {
                                Statics.field1438 = class138.field2342;
                            }
                            client.field686 = field405[var4 + 2];
                            client.field602.method2306(141);
                            client.field602.method2422(client.field685);
                            client.field602.method2422(Statics.field1438.field2344);
                            client.field602.method2422(client.field686);
                            continue;
                        }
                        if (var387 == 5002) {
                            var5--;
                            String var343 = field396[var5];
                            var4 -= 2;
                            int var344 = field405[var4];
                            int var345 = field405[var4 + 1];
                            client.field602.method2306(10);
                            class116 var346 = client.field602;
                            int var347 = var343.length() + 1;
                            var346.method2422(var347 + 2);
                            client.field602.method2588(var343);
                            client.field602.method2422(var344 - 1);
                            client.field602.method2422(var345);
                            continue;
                        }
                        if (var387 == 5003) {
                            var4--;
                            int var348 = field405[var4];
                            String var349 = null;
                            if (var348 < 100) {
                                var349 = client.field682[var348];
                            }
                            if (var349 == null) {
                                var349 = "";
                            }
                            field396[var5++] = var349;
                            continue;
                        }
                        if (var387 == 5004) {
                            var4--;
                            int var350 = field405[var4];
                            int var351 = -1;
                            if (var350 < 100 && client.field682[var350] != null) {
                                var351 = client.field497[var350];
                            }
                            field405[var4++] = var351;
                            continue;
                        }
                        if (var387 == 5005) {
                            if (Statics.field1438 == null) {
                                field405[var4++] = -1;
                            } else {
                                field405[var4++] = Statics.field1438.field2344;
                            }
                            continue;
                        }
                        if (var387 == 5008) {
                            var5--;
                            String var352 = field396[var5];
                            if (var352.startsWith("::")) {
                                String var353 = var352.substring(2);
                                if (var353.equalsIgnoreCase("toggleroof")) {
                                    Statics.field60.field193 = !Statics.field60.field193;
                                    class12.method1350();
                                    if (Statics.field60.field193) {
                                        client.method35(0, "", "Roofs are now all hidden");
                                    } else {
                                        client.method35(0, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field635 >= 2) {
                                    if (var353.equalsIgnoreCase("fpson")) {
                                        client.field501 = true;
                                    }
                                    if (var353.equalsIgnoreCase("fpsoff")) {
                                        client.field501 = false;
                                    }
                                    if (var353.equalsIgnoreCase("gc")) {
                                        System.gc();
                                    }
                                    if (var353.equalsIgnoreCase("clientdrop")) {
                                        client.method222();
                                    }
                                    if (var353.equalsIgnoreCase("errortest") && client.field469 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field602.method2306(211);
                                client.field602.method2422(var353.length() + 1);
                                client.field602.method2588(var353);
                                continue;
                            }
                            String var354 = var352.toLowerCase();
                            byte var355 = 0;
                            if (var354.startsWith(class135.field2153)) {
                                var355 = 0;
                                var352 = var352.substring(class135.field2153.length());
                            } else if (var354.startsWith(class135.field2266)) {
                                var355 = 1;
                                var352 = var352.substring(class135.field2266.length());
                            } else if (var354.startsWith(class135.field2268)) {
                                var355 = 2;
                                var352 = var352.substring(class135.field2268.length());
                            } else if (var354.startsWith(class135.field2270)) {
                                var355 = 3;
                                var352 = var352.substring(class135.field2270.length());
                            } else if (var354.startsWith(class135.field2272)) {
                                var355 = 4;
                                var352 = var352.substring(class135.field2272.length());
                            } else if (var354.startsWith(class135.field2177)) {
                                var355 = 5;
                                var352 = var352.substring(class135.field2177.length());
                            } else if (var354.startsWith(class135.field2276)) {
                                var355 = 6;
                                var352 = var352.substring(class135.field2276.length());
                            } else if (var354.startsWith(class135.field2232)) {
                                var355 = 7;
                                var352 = var352.substring(class135.field2232.length());
                            } else if (var354.startsWith(class135.field2280)) {
                                var355 = 8;
                                var352 = var352.substring(class135.field2280.length());
                            } else if (var354.startsWith(class135.field2180)) {
                                var355 = 9;
                                var352 = var352.substring(class135.field2180.length());
                            } else if (var354.startsWith(class135.field2284)) {
                                var355 = 10;
                                var352 = var352.substring(class135.field2284.length());
                            } else if (var354.startsWith(class135.field2171)) {
                                var355 = 11;
                                var352 = var352.substring(class135.field2171.length());
                            } else if (client.field474 != 0) {
                                if (var354.startsWith(class135.field2254)) {
                                    var355 = 0;
                                    var352 = var352.substring(class135.field2254.length());
                                } else if (var354.startsWith(class135.field2267)) {
                                    var355 = 1;
                                    var352 = var352.substring(class135.field2267.length());
                                } else if (var354.startsWith(class135.field2269)) {
                                    var355 = 2;
                                    var352 = var352.substring(class135.field2269.length());
                                } else if (var354.startsWith(class135.field2271)) {
                                    var355 = 3;
                                    var352 = var352.substring(class135.field2271.length());
                                } else if (var354.startsWith(class135.field2190)) {
                                    var355 = 4;
                                    var352 = var352.substring(class135.field2190.length());
                                } else if (var354.startsWith(class135.field2275)) {
                                    var355 = 5;
                                    var352 = var352.substring(class135.field2275.length());
                                } else if (var354.startsWith(class135.field2277)) {
                                    var355 = 6;
                                    var352 = var352.substring(class135.field2277.length());
                                } else if (var354.startsWith(class135.field2279)) {
                                    var355 = 7;
                                    var352 = var352.substring(class135.field2279.length());
                                } else if (var354.startsWith(class135.field2281)) {
                                    var355 = 8;
                                    var352 = var352.substring(class135.field2281.length());
                                } else if (var354.startsWith(class135.field2283)) {
                                    var355 = 9;
                                    var352 = var352.substring(class135.field2283.length());
                                } else if (var354.startsWith(class135.field2285)) {
                                    var355 = 10;
                                    var352 = var352.substring(class135.field2285.length());
                                } else if (var354.startsWith(class135.field2287)) {
                                    var355 = 11;
                                    var352 = var352.substring(class135.field2287.length());
                                }
                            }
                            String var356 = var352.toLowerCase();
                            byte var357 = 0;
                            if (var356.startsWith(class135.field2288)) {
                                var357 = 1;
                                var352 = var352.substring(class135.field2288.length());
                            } else if (var356.startsWith(class135.field2154)) {
                                var357 = 2;
                                var352 = var352.substring(class135.field2154.length());
                            } else if (var356.startsWith(class135.field2184)) {
                                var357 = 3;
                                var352 = var352.substring(class135.field2184.length());
                            } else if (var356.startsWith(class135.field2294)) {
                                var357 = 4;
                                var352 = var352.substring(class135.field2294.length());
                            } else if (var356.startsWith(class135.field2221)) {
                                var357 = 5;
                                var352 = var352.substring(class135.field2221.length());
                            } else if (client.field474 != 0) {
                                if (var356.startsWith(class135.field2289)) {
                                    var357 = 1;
                                    var352 = var352.substring(class135.field2289.length());
                                } else if (var356.startsWith(class135.field2291)) {
                                    var357 = 2;
                                    var352 = var352.substring(class135.field2291.length());
                                } else if (var356.startsWith(class135.field2293)) {
                                    var357 = 3;
                                    var352 = var352.substring(class135.field2293.length());
                                } else if (var356.startsWith(class135.field2135)) {
                                    var357 = 4;
                                    var352 = var352.substring(class135.field2135.length());
                                } else if (var356.startsWith(class135.field2297)) {
                                    var357 = 5;
                                    var352 = var352.substring(class135.field2297.length());
                                }
                            }
                            client.field602.method2306(196);
                            client.field602.method2422(0);
                            int var358 = client.field602.field2027;
                            client.field602.method2422(var355);
                            client.field602.method2422(var357);
                            class116 var359 = client.field602;
                            int var360 = var359.field2027;
                            int var361 = var352.length();
                            byte[] var362 = new byte[var361];
                            for (int var363 = 0; var363 < var361; var363++) {
                                char var364 = var352.charAt(var363);
                                if (!(var364 <= 0 || var364 >= 128) || !(var364 < 160 || var364 > 255)) {
                                    var362[var363] = (byte) var364;
                                } else if (var364 == 8364) {
                                    var362[var363] = -128;
                                } else if (var364 == 8218) {
                                    var362[var363] = -126;
                                } else if (var364 == 402) {
                                    var362[var363] = -125;
                                } else if (var364 == 8222) {
                                    var362[var363] = -124;
                                } else if (var364 == 8230) {
                                    var362[var363] = -123;
                                } else if (var364 == 8224) {
                                    var362[var363] = -122;
                                } else if (var364 == 8225) {
                                    var362[var363] = -121;
                                } else if (var364 == 710) {
                                    var362[var363] = -120;
                                } else if (var364 == 8240) {
                                    var362[var363] = -119;
                                } else if (var364 == 352) {
                                    var362[var363] = -118;
                                } else if (var364 == 8249) {
                                    var362[var363] = -117;
                                } else if (var364 == 338) {
                                    var362[var363] = -116;
                                } else if (var364 == 381) {
                                    var362[var363] = -114;
                                } else if (var364 == 8216) {
                                    var362[var363] = -111;
                                } else if (var364 == 8217) {
                                    var362[var363] = -110;
                                } else if (var364 == 8220) {
                                    var362[var363] = -109;
                                } else if (var364 == 8221) {
                                    var362[var363] = -108;
                                } else if (var364 == 8226) {
                                    var362[var363] = -107;
                                } else if (var364 == 8211) {
                                    var362[var363] = -106;
                                } else if (var364 == 8212) {
                                    var362[var363] = -105;
                                } else if (var364 == 732) {
                                    var362[var363] = -104;
                                } else if (var364 == 8482) {
                                    var362[var363] = -103;
                                } else if (var364 == 353) {
                                    var362[var363] = -102;
                                } else if (var364 == 8250) {
                                    var362[var363] = -101;
                                } else if (var364 == 339) {
                                    var362[var363] = -100;
                                } else if (var364 == 382) {
                                    var362[var363] = -98;
                                } else if (var364 == 376) {
                                    var362[var363] = -97;
                                } else {
                                    var362[var363] = 63;
                                }
                            }
                            var359.method2459(var362.length);
                            var359.field2027 += Statics.field2825.method2366(var362, 0, var362.length, var359.field2026, var359.field2027);
                            client.field602.method2461(client.field602.field2027 - var358);
                            continue;
                        }
                        if (var387 == 5009) {
                            var5 -= 2;
                            String var367 = field396[var5];
                            String var368 = field396[var5 + 1];
                            client.field602.method2306(157);
                            client.field602.method2423(0);
                            int var369 = client.field602.field2027;
                            client.field602.method2588(var367);
                            class116 var370 = client.field602;
                            int var371 = var370.field2027;
                            int var372 = var368.length();
                            byte[] var373 = new byte[var372];
                            for (int var374 = 0; var374 < var372; var374++) {
                                char var375 = var368.charAt(var374);
                                if (var375 > 0 && var375 < 128 || var375 >= 160 && var375 <= 255) {
                                    var373[var374] = (byte) var375;
                                } else if (var375 == 8364) {
                                    var373[var374] = -128;
                                } else if (var375 == 8218) {
                                    var373[var374] = -126;
                                } else if (var375 == 402) {
                                    var373[var374] = -125;
                                } else if (var375 == 8222) {
                                    var373[var374] = -124;
                                } else if (var375 == 8230) {
                                    var373[var374] = -123;
                                } else if (var375 == 8224) {
                                    var373[var374] = -122;
                                } else if (var375 == 8225) {
                                    var373[var374] = -121;
                                } else if (var375 == 710) {
                                    var373[var374] = -120;
                                } else if (var375 == 8240) {
                                    var373[var374] = -119;
                                } else if (var375 == 352) {
                                    var373[var374] = -118;
                                } else if (var375 == 8249) {
                                    var373[var374] = -117;
                                } else if (var375 == 338) {
                                    var373[var374] = -116;
                                } else if (var375 == 381) {
                                    var373[var374] = -114;
                                } else if (var375 == 8216) {
                                    var373[var374] = -111;
                                } else if (var375 == 8217) {
                                    var373[var374] = -110;
                                } else if (var375 == 8220) {
                                    var373[var374] = -109;
                                } else if (var375 == 8221) {
                                    var373[var374] = -108;
                                } else if (var375 == 8226) {
                                    var373[var374] = -107;
                                } else if (var375 == 8211) {
                                    var373[var374] = -106;
                                } else if (var375 == 8212) {
                                    var373[var374] = -105;
                                } else if (var375 == 732) {
                                    var373[var374] = -104;
                                } else if (var375 == 8482) {
                                    var373[var374] = -103;
                                } else if (var375 == 353) {
                                    var373[var374] = -102;
                                } else if (var375 == 8250) {
                                    var373[var374] = -101;
                                } else if (var375 == 339) {
                                    var373[var374] = -100;
                                } else if (var375 == 382) {
                                    var373[var374] = -98;
                                } else if (var375 == 376) {
                                    var373[var374] = -97;
                                } else {
                                    var373[var374] = 63;
                                }
                            }
                            var370.method2459(var373.length);
                            var370.field2027 += Statics.field2825.method2366(var373, 0, var373.length, var370.field2026, var370.field2027);
                            client.field602.method2432(client.field602.field2027 - var369);
                            continue;
                        }
                        if (var387 == 5010) {
                            var4--;
                            int var378 = field405[var4];
                            String var379 = null;
                            if (var378 < 100) {
                                var379 = client.field680[var378];
                            }
                            if (var379 == null) {
                                var379 = "";
                            }
                            field396[var5++] = var379;
                            continue;
                        }
                        if (var387 == 5011) {
                            var4--;
                            int var380 = field405[var4];
                            String var381 = null;
                            if (var380 < 100) {
                                var381 = client.field681[var380];
                            }
                            if (var381 == null) {
                                var381 = "";
                            }
                            field396[var5++] = var381;
                            continue;
                        }
                        if (var387 == 5015) {
                            String var382;
                            if (Statics.field52 == null || Statics.field52.field32 == null) {
                                var382 = "";
                            } else {
                                var382 = Statics.field52.field32;
                            }
                            field396[var5++] = var382;
                            continue;
                        }
                        if (var387 == 5016) {
                            field405[var4++] = client.field686;
                            continue;
                        }
                        if (var387 == 5017) {
                            field405[var4++] = client.field683;
                            continue;
                        }
                    }
                } else {
                    class159 var84;
                    if (var387 >= 2000) {
                        var387 -= 1000;
                        var4--;
                        var84 = class159.method2352(field405[var4]);
                    } else {
                        var84 = var61 ? Statics.field2037 : Statics.field398;
                    }
                    if (var387 == 1300) {
                        var4--;
                        int var85 = field405[var4] - 1;
                        if (var85 >= 0 && var85 <= 9) {
                            var5--;
                            var84.method3124(var85, field396[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var387 == 1301) {
                        var4 -= 2;
                        int var86 = field405[var4];
                        int var87 = field405[var4 + 1];
                        var84.field2670 = class159.method3099(var86, var87);
                        continue;
                    }
                    if (var387 == 1302) {
                        var4--;
                        var84.field2673 = field405[var4] == 1;
                        continue;
                    }
                    if (var387 == 1303) {
                        var4--;
                        var84.field2671 = field405[var4];
                        continue;
                    }
                    if (var387 == 1304) {
                        var4--;
                        var84.field2672 = field405[var4];
                        continue;
                    }
                    if (var387 == 1305) {
                        var5--;
                        var84.field2628 = field396[var5];
                        continue;
                    }
                    if (var387 == 1306) {
                        var5--;
                        var84.field2674 = field396[var5];
                        continue;
                    }
                    if (var387 == 1307) {
                        var84.field2669 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var386) {
            StringBuilder var384 = new StringBuilder(30);
            var384.append("").append(var3.field2810).append(" ");
            for (int var385 = field395 - 1; var385 >= 0; var385--) {
                var384.append("").append(field399[var385].field275.field2810).append(" ");
            }
            var384.append("").append(var9);
            class80.method1557(var384.toString(), var386);
        }
    }

    @ObfuscatedName("v.e(II)V")
    public static void method144(int arg0) {
        if (arg0 == -1 || !class159.method804(arg0)) {
            return;
        }
        class159[] var1 = Statics.field2704[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3.field2676 != null) {
                class1 var4 = new class1();
                var4.field7 = var3;
                var4.field15 = var3.field2676;
                method1(var4);
            }
        }
    }
}
