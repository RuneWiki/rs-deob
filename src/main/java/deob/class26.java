package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("i")
public class class26 {

    @ObfuscatedName("i.g")
    public static int[] field417 = new int[5];

    @ObfuscatedName("i.x")
    public static int[][] field418 = new int[5][5000];

    @ObfuscatedName("i.u")
    public static int[] field419 = new int[1000];

    @ObfuscatedName("i.l")
    public static String[] field420 = new String[1000];

    @ObfuscatedName("i.a")
    public static int field421 = 0;

    @ObfuscatedName("i.h")
    public static class18[] field422 = new class18[50];

    @ObfuscatedName("i.s")
    public static Calendar field423 = Calendar.getInstance();

    @ObfuscatedName("i.j")
    public static final String[] field415 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.c(Lc;I)V")
    public static void method196(class1 arg0) {
        method50(arg0, 200000);
    }

    @ObfuscatedName("u.q(Lc;IB)V")
    public static void method50(class1 arg0, int arg1) {
        Object[] var2 = arg0.field11;
        int var3 = (Integer) var2[0];
        class5 var4 = class5.method1587(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field63;
        int[] var9 = var4.field72;
        byte var10 = -1;
        field421 = 0;
        try {
            Statics.field414 = new int[var4.field62];
            int var11 = 0;
            Statics.field416 = new String[var4.field67];
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
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2719;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2612;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2719;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2612;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field5;
                    }
                    Statics.field414[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field416[var12++] = var15;
                }
            }
            int var16 = 0;
            label2391: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var396 = var8[var7];
                if (var396 < 100) {
                    if (var396 == 0) {
                        field419[var5++] = var9[var7];
                        continue;
                    }
                    if (var396 == 1) {
                        int var17 = var9[var7];
                        field419[var5++] = class160.field2731[var17];
                        continue;
                    }
                    if (var396 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class160.field2731[var18] = field419[var5];
                        client.method549(var18);
                        continue;
                    }
                    if (var396 == 3) {
                        field420[var6++] = var4.field65[var7];
                        continue;
                    }
                    if (var396 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var396 == 7) {
                        var5 -= 2;
                        if (field419[var5 + 1] != field419[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var396 == 8) {
                        var5 -= 2;
                        if (field419[var5 + 1] == field419[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var396 == 9) {
                        var5 -= 2;
                        if (field419[var5] < field419[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var396 == 10) {
                        var5 -= 2;
                        if (field419[var5] > field419[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var396 == 21) {
                        if (field421 == 0) {
                            return;
                        }
                        class18 var19 = field422[--field421];
                        var4 = var19.field278;
                        var8 = var4.field63;
                        var9 = var4.field72;
                        var7 = var19.field276;
                        Statics.field414 = var19.field284;
                        Statics.field416 = var19.field277;
                        continue;
                    }
                    if (var396 == 25) {
                        int var20 = var9[var7];
                        field419[var5++] = class160.method2195(var20);
                        continue;
                    }
                    if (var396 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field419[var5];
                        class38 var23 = (class38) class38.field971.method3097((long) var21);
                        class38 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1534.method2886(14, var21);
                            class38 var26 = new class38();
                            if (var25 != null) {
                                var26.method773(new class127(var25));
                            }
                            class38.field971.method3092(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field979;
                        int var29 = var24.field978;
                        int var30 = var24.field969;
                        int var31 = class160.field2730[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class160.field2731[var28] = class160.field2731[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var396 == 31) {
                        var5 -= 2;
                        if (field419[var5] <= field419[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var396 == 32) {
                        var5 -= 2;
                        if (field419[var5] >= field419[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var396 == 33) {
                        field419[var5++] = Statics.field414[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var396 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field414[var10001] = field419[var5];
                        continue;
                    }
                    if (var396 == 35) {
                        field420[var6++] = Statics.field416[var9[var7]];
                        continue;
                    }
                    if (var396 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field416[var10001] = field420[var6];
                        continue;
                    }
                    if (var396 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class148.method719(field420, var6, var33);
                        field420[var6++] = var34;
                        continue;
                    }
                    if (var396 == 38) {
                        var5--;
                        continue;
                    }
                    if (var396 == 39) {
                        var6--;
                        continue;
                    }
                    if (var396 == 40) {
                        int var35 = var9[var7];
                        class5 var36 = class5.method1587(var35);
                        int[] var37 = new int[var36.field62];
                        String[] var38 = new String[var36.field67];
                        for (int var39 = 0; var39 < var36.field68; var39++) {
                            var37[var39] = field419[var5 - var36.field68 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field69; var40++) {
                            var38[var40] = field420[var6 - var36.field69 + var40];
                        }
                        var5 -= var36.field68;
                        var6 -= var36.field69;
                        class18 var41 = new class18();
                        var41.field278 = var4;
                        var41.field276 = var7;
                        var41.field284 = Statics.field414;
                        var41.field277 = Statics.field416;
                        field422[++field421 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field63;
                        var9 = var36.field72;
                        var7 = -1;
                        Statics.field414 = var37;
                        Statics.field416 = var38;
                        continue;
                    }
                    if (var396 == 42) {
                        field419[var5++] = client.field686[var9[var7]];
                        continue;
                    }
                    if (var396 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field686[var10001] = field419[var5];
                        continue;
                    }
                    if (var396 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field419[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field417[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label2391;
                                }
                                field418[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var396 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field419[var5];
                        if (var48 >= 0 && var48 < field417[var47]) {
                            field419[var5++] = field418[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var396 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field419[var5];
                        if (var50 >= 0 && var50 < field417[var49]) {
                            field418[var49][var50] = field419[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var396 == 47) {
                        String var51 = client.field687[var9[var7]];
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field420[var6++] = var51;
                        continue;
                    }
                    if (var396 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field687[var10001] = field420[var6];
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var396 < 1000) {
                    if (var396 == 100) {
                        var5 -= 3;
                        int var53 = field419[var5];
                        int var54 = field419[var5 + 1];
                        int var55 = field419[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class159 var56 = class159.method1507(var53);
                        if (var56.field2705 == null) {
                            var56.field2705 = new class159[var55 + 1];
                        }
                        if (var56.field2705.length <= var55) {
                            class159[] var57 = new class159[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2705.length; var58++) {
                                var57[var58] = var56.field2705[var58];
                            }
                            var56.field2705 = var57;
                        }
                        if (var55 > 0 && var56.field2705[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class159 var59 = new class159();
                        var59.field2611 = var54;
                        var59.field2622 = var59.field2719 = var56.field2719;
                        var59.field2612 = var55;
                        var59.field2654 = true;
                        var56.field2705[var55] = var59;
                        if (var52) {
                            Statics.field379 = var59;
                        } else {
                            Statics.field54 = var59;
                        }
                        client.method852(var56);
                        continue;
                    }
                    if (var396 == 101) {
                        class159 var60 = var52 ? Statics.field379 : Statics.field54;
                        class159 var61 = class159.method1507(var60.field2719);
                        var61.field2705[var60.field2612] = null;
                        client.method852(var61);
                        continue;
                    }
                    if (var396 == 102) {
                        var5--;
                        class159 var62 = class159.method1507(field419[var5]);
                        var62.field2705 = null;
                        client.method852(var62);
                        continue;
                    }
                    if (var396 == 200) {
                        var5 -= 2;
                        int var63 = field419[var5];
                        int var64 = field419[var5 + 1];
                        class159 var65 = class159.method2121(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field419[var5++] = 1;
                            if (var52) {
                                Statics.field379 = var65;
                            } else {
                                Statics.field54 = var65;
                            }
                            continue;
                        }
                        field419[var5++] = 0;
                        continue;
                    }
                } else if (var396 >= 1000 && var396 < 1100 || var396 >= 2000 && var396 < 2100) {
                    class159 var66;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var5--;
                        var66 = class159.method1507(field419[var5]);
                    } else {
                        var66 = var52 ? Statics.field379 : Statics.field54;
                    }
                    if (var396 == 1000) {
                        var5 -= 2;
                        var66.field2609 = field419[var5];
                        var66.field2707 = field419[var5 + 1];
                        client.method852(var66);
                        continue;
                    }
                    if (var396 == 1001) {
                        var5 -= 2;
                        var66.field2620 = field419[var5];
                        var66.field2615 = field419[var5 + 1];
                        client.method852(var66);
                        continue;
                    }
                    if (var396 == 1003) {
                        var5--;
                        boolean var67 = field419[var5] == 1;
                        if (var66.field2625 != var67) {
                            var66.field2625 = var67;
                            client.method852(var66);
                        }
                        continue;
                    }
                } else if (!(var396 < 1100 || var396 >= 1200) || !(var396 < 2100 || var396 >= 2200)) {
                    class159 var68;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var5--;
                        var68 = class159.method1507(field419[var5]);
                    } else {
                        var68 = var52 ? Statics.field379 : Statics.field54;
                    }
                    if (var396 == 1100) {
                        var5 -= 2;
                        var68.field2624 = field419[var5];
                        if (var68.field2624 > var68.field2626 - var68.field2620) {
                            var68.field2624 = var68.field2626 - var68.field2620;
                        }
                        if (var68.field2624 < 0) {
                            var68.field2624 = 0;
                        }
                        var68.field2683 = field419[var5 + 1];
                        if (var68.field2683 > var68.field2627 - var68.field2615) {
                            var68.field2683 = var68.field2627 - var68.field2615;
                        }
                        if (var68.field2683 < 0) {
                            var68.field2683 = 0;
                        }
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1101) {
                        var5--;
                        var68.field2702 = field419[var5];
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1102) {
                        var5--;
                        var68.field2632 = field419[var5] == 1;
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1103) {
                        var5--;
                        var68.field2610 = field419[var5];
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1104) {
                        var5--;
                        var68.field2634 = field419[var5];
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1105) {
                        var5--;
                        var68.field2668 = field419[var5];
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1106) {
                        var5--;
                        var68.field2635 = field419[var5];
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1107) {
                        var5--;
                        var68.field2638 = field419[var5] == 1;
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1108) {
                        var68.field2643 = 1;
                        var5--;
                        var68.field2644 = field419[var5];
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1109) {
                        var5 -= 6;
                        var68.field2649 = field419[var5];
                        var68.field2650 = field419[var5 + 1];
                        var68.field2651 = field419[var5 + 2];
                        var68.field2606 = field419[var5 + 3];
                        var68.field2653 = field419[var5 + 4];
                        var68.field2680 = field419[var5 + 5];
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1110) {
                        var5--;
                        int var69 = field419[var5];
                        if (var68.field2647 != var69) {
                            var68.field2647 = var69;
                            var68.field2717 = 0;
                            var68.field2718 = 0;
                            client.method852(var68);
                        }
                        continue;
                    }
                    if (var396 == 1111) {
                        var5--;
                        var68.field2656 = field419[var5] == 1;
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1112) {
                        var6--;
                        String var70 = field420[var6];
                        if (!var70.equals(var68.field2658)) {
                            var68.field2658 = var70;
                            client.method852(var68);
                        }
                        continue;
                    }
                    if (var396 == 1113) {
                        var5--;
                        var68.field2657 = field419[var5];
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1114) {
                        var5 -= 3;
                        var68.field2661 = field419[var5];
                        var68.field2662 = field419[var5 + 1];
                        var68.field2659 = field419[var5 + 2];
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1115) {
                        var5--;
                        var68.field2663 = field419[var5] == 1;
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1116) {
                        var5--;
                        var68.field2703 = field419[var5];
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1117) {
                        var5--;
                        var68.field2640 = field419[var5];
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1118) {
                        var5--;
                        var68.field2641 = field419[var5] == 1;
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1119) {
                        var5--;
                        var68.field2655 = field419[var5] == 1;
                        client.method852(var68);
                        continue;
                    }
                    if (var396 == 1120) {
                        var5 -= 2;
                        var68.field2626 = field419[var5];
                        var68.field2627 = field419[var5 + 1];
                        client.method852(var68);
                        continue;
                    }
                } else if (var396 >= 1200 && var396 < 1300 || var396 >= 2200 && var396 < 2300) {
                    class159 var71;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var5--;
                        var71 = class159.method1507(field419[var5]);
                    } else {
                        var71 = var52 ? Statics.field379 : Statics.field54;
                    }
                    client.method852(var71);
                    if (var396 == 1200) {
                        var5 -= 2;
                        int var72 = field419[var5];
                        int var73 = field419[var5 + 1];
                        var71.field2721 = var72;
                        var71.field2716 = var73;
                        class40 var74 = class40.method11(var72);
                        var71.field2651 = var74.field1031;
                        var71.field2606 = var74.field1009;
                        var71.field2653 = var74.field1005;
                        var71.field2649 = var74.field1011;
                        var71.field2650 = var74.field1012;
                        var71.field2680 = var74.field1022;
                        if (var71.field2620 > 0) {
                            var71.field2680 = var71.field2680 * 32 / var71.field2620;
                        }
                        continue;
                    }
                    if (var396 == 1201) {
                        var71.field2643 = 2;
                        var5--;
                        var71.field2644 = field419[var5];
                        continue;
                    }
                    if (var396 == 1202) {
                        var71.field2643 = 3;
                        var71.field2644 = Statics.field2555.field31.method3069();
                        continue;
                    }
                } else if ((var396 < 1300 || var396 >= 1400) && (var396 < 2300 || var396 >= 2400)) {
                    if (var396 >= 1400 && var396 < 1500 || var396 >= 2400 && var396 < 2500) {
                        class159 var79;
                        if (var396 >= 2000) {
                            var396 -= 1000;
                            var5--;
                            var79 = class159.method1507(field419[var5]);
                        } else {
                            var79 = var52 ? Statics.field379 : Statics.field54;
                        }
                        var6--;
                        String var80 = field420[var6];
                        int[] var81 = null;
                        if (var80.length() > 0 && var80.charAt(var80.length() - 1) == 'Y') {
                            var5--;
                            int var82 = field419[var5];
                            if (var82 > 0) {
                                var81 = new int[var82];
                                while (var82-- > 0) {
                                    var5--;
                                    var81[var82] = field419[var5];
                                }
                            }
                            var80 = var80.substring(0, var80.length() - 1);
                        }
                        Object[] var83 = new Object[var80.length() + 1];
                        for (int var84 = var83.length - 1; var84 >= 1; var84--) {
                            if (var80.charAt(var84 - 1) == 's') {
                                var6--;
                                var83[var84] = field420[var6];
                            } else {
                                var5--;
                                var83[var84] = Integer.valueOf(field419[var5]);
                            }
                        }
                        var5--;
                        int var85 = field419[var5];
                        if (var85 == -1) {
                            var83 = null;
                        } else {
                            var83[0] = Integer.valueOf(var85);
                        }
                        if (var396 == 1400) {
                            var79.field2628 = var83;
                        }
                        if (var396 == 1401) {
                            var79.field2709 = var83;
                        }
                        if (var396 == 1402) {
                            var79.field2682 = var83;
                        }
                        if (var396 == 1403) {
                            var79.field2684 = var83;
                        }
                        if (var396 == 1404) {
                            var79.field2676 = var83;
                        }
                        if (var396 == 1405) {
                            var79.field2687 = var83;
                        }
                        if (var396 == 1406) {
                            var79.field2690 = var83;
                        }
                        if (var396 == 1407) {
                            var79.field2691 = var83;
                            var79.field2692 = var81;
                        }
                        if (var396 == 1408) {
                            var79.field2697 = var83;
                        }
                        if (var396 == 1409) {
                            var79.field2698 = var83;
                        }
                        if (var396 == 1410) {
                            var79.field2688 = var83;
                        }
                        if (var396 == 1411) {
                            var79.field2608 = var83;
                        }
                        if (var396 == 1412) {
                            var79.field2685 = var83;
                        }
                        if (var396 == 1414) {
                            var79.field2693 = var83;
                            var79.field2660 = var81;
                        }
                        if (var396 == 1415) {
                            var79.field2695 = var83;
                            var79.field2712 = var81;
                        }
                        if (var396 == 1416) {
                            var79.field2689 = var83;
                        }
                        if (var396 == 1417) {
                            var79.field2699 = var83;
                        }
                        if (var396 == 1418) {
                            var79.field2700 = var83;
                        }
                        if (var396 == 1419) {
                            var79.field2667 = var83;
                        }
                        if (var396 == 1420) {
                            var79.field2623 = var83;
                        }
                        if (var396 == 1421) {
                            var79.field2652 = var83;
                        }
                        if (var396 == 1422) {
                            var79.field2704 = var83;
                        }
                        if (var396 == 1423) {
                            var79.field2720 = var83;
                        }
                        if (var396 == 1424) {
                            var79.field2706 = var83;
                        }
                        var79.field2621 = true;
                        continue;
                    }
                    if (var396 < 1600) {
                        class159 var86 = var52 ? Statics.field379 : Statics.field54;
                        if (var396 == 1500) {
                            field419[var5++] = var86.field2609;
                            continue;
                        }
                        if (var396 == 1501) {
                            field419[var5++] = var86.field2707;
                            continue;
                        }
                        if (var396 == 1502) {
                            field419[var5++] = var86.field2620;
                            continue;
                        }
                        if (var396 == 1503) {
                            field419[var5++] = var86.field2615;
                            continue;
                        }
                        if (var396 == 1504) {
                            field419[var5++] = var86.field2625 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 1505) {
                            field419[var5++] = var86.field2622;
                            continue;
                        }
                    } else if (var396 < 1700) {
                        class159 var87 = var52 ? Statics.field379 : Statics.field54;
                        if (var396 == 1600) {
                            field419[var5++] = var87.field2624;
                            continue;
                        }
                        if (var396 == 1601) {
                            field419[var5++] = var87.field2683;
                            continue;
                        }
                        if (var396 == 1602) {
                            field420[var6++] = var87.field2658;
                            continue;
                        }
                        if (var396 == 1603) {
                            field419[var5++] = var87.field2626;
                            continue;
                        }
                        if (var396 == 1604) {
                            field419[var5++] = var87.field2627;
                            continue;
                        }
                        if (var396 == 1605) {
                            field419[var5++] = var87.field2680;
                            continue;
                        }
                        if (var396 == 1606) {
                            field419[var5++] = var87.field2651;
                            continue;
                        }
                        if (var396 == 1607) {
                            field419[var5++] = var87.field2653;
                            continue;
                        }
                        if (var396 == 1608) {
                            field419[var5++] = var87.field2606;
                            continue;
                        }
                    } else if (var396 < 1800) {
                        class159 var88 = var52 ? Statics.field379 : Statics.field54;
                        if (var396 == 1700) {
                            field419[var5++] = var88.field2721;
                            continue;
                        }
                        if (var396 == 1701) {
                            if (var88.field2721 == -1) {
                                field419[var5++] = 0;
                            } else {
                                field419[var5++] = var88.field2716;
                            }
                            continue;
                        }
                        if (var396 == 1702) {
                            field419[var5++] = var88.field2612;
                            continue;
                        }
                    } else if (var396 < 1900) {
                        class159 var89 = var52 ? Statics.field379 : Statics.field54;
                        if (var396 == 1800) {
                            int[] var90 = field419;
                            int var91 = var5++;
                            int var92 = client.method2111(var89);
                            int var93 = var92 >> 11 & 0x3F;
                            var90[var91] = var93;
                            continue;
                        }
                        if (var396 == 1801) {
                            var5--;
                            int var94 = field419[var5];
                            int var397 = var94 - 1;
                            if (var89.field2672 != null && var397 < var89.field2672.length && var89.field2672[var397] != null) {
                                field420[var6++] = var89.field2672[var397];
                                continue;
                            }
                            field420[var6++] = "";
                            continue;
                        }
                        if (var396 == 1802) {
                            if (var89.field2671 == null) {
                                field420[var6++] = "";
                            } else {
                                field420[var6++] = var89.field2671;
                            }
                            continue;
                        }
                    } else if (var396 < 2600) {
                        var5--;
                        class159 var95 = class159.method1507(field419[var5]);
                        if (var396 == 2500) {
                            field419[var5++] = var95.field2609;
                            continue;
                        }
                        if (var396 == 2501) {
                            field419[var5++] = var95.field2707;
                            continue;
                        }
                        if (var396 == 2502) {
                            field419[var5++] = var95.field2620;
                            continue;
                        }
                        if (var396 == 2503) {
                            field419[var5++] = var95.field2615;
                            continue;
                        }
                        if (var396 == 2504) {
                            field419[var5++] = var95.field2625 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 2505) {
                            field419[var5++] = var95.field2622;
                            continue;
                        }
                    } else if (var396 < 2700) {
                        var5--;
                        class159 var96 = class159.method1507(field419[var5]);
                        if (var396 == 2600) {
                            field419[var5++] = var96.field2624;
                            continue;
                        }
                        if (var396 == 2601) {
                            field419[var5++] = var96.field2683;
                            continue;
                        }
                        if (var396 == 2602) {
                            field420[var6++] = var96.field2658;
                            continue;
                        }
                        if (var396 == 2603) {
                            field419[var5++] = var96.field2626;
                            continue;
                        }
                        if (var396 == 2604) {
                            field419[var5++] = var96.field2627;
                            continue;
                        }
                        if (var396 == 2605) {
                            field419[var5++] = var96.field2680;
                            continue;
                        }
                        if (var396 == 2606) {
                            field419[var5++] = var96.field2651;
                            continue;
                        }
                        if (var396 == 2607) {
                            field419[var5++] = var96.field2653;
                            continue;
                        }
                        if (var396 == 2608) {
                            field419[var5++] = var96.field2606;
                            continue;
                        }
                    } else if (var396 < 2800) {
                        if (var396 == 2700) {
                            var5--;
                            class159 var97 = class159.method1507(field419[var5]);
                            field419[var5++] = var97.field2721;
                            continue;
                        }
                        if (var396 == 2701) {
                            var5--;
                            class159 var98 = class159.method1507(field419[var5]);
                            if (var98.field2721 == -1) {
                                field419[var5++] = 0;
                            } else {
                                field419[var5++] = var98.field2716;
                            }
                            continue;
                        }
                        if (var396 == 2702) {
                            var5--;
                            int var99 = field419[var5];
                            class4 var100 = (class4) client.field652.method3138((long) var99);
                            if (var100 == null) {
                                field419[var5++] = 0;
                            } else {
                                field419[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var396 < 2900) {
                        var5--;
                        class159 var101 = class159.method1507(field419[var5]);
                        if (var396 == 2800) {
                            int[] var102 = field419;
                            int var103 = var5++;
                            int var104 = client.method2111(var101);
                            int var105 = var104 >> 11 & 0x3F;
                            var102[var103] = var105;
                            continue;
                        }
                        if (var396 == 2801) {
                            var5--;
                            int var106 = field419[var5];
                            int var398 = var106 - 1;
                            if (var101.field2672 != null && var398 < var101.field2672.length && var101.field2672[var398] != null) {
                                field420[var6++] = var101.field2672[var398];
                                continue;
                            }
                            field420[var6++] = "";
                            continue;
                        }
                        if (var396 == 2802) {
                            if (var101.field2671 == null) {
                                field420[var6++] = "";
                            } else {
                                field420[var6++] = var101.field2671;
                            }
                            continue;
                        }
                    } else if (var396 < 3200) {
                        if (var396 == 3100) {
                            var6--;
                            String var107 = field420[var6];
                            client.method105(0, "", var107);
                            continue;
                        }
                        if (var396 == 3101) {
                            var5 -= 2;
                            client.method1296(Statics.field2555, field419[var5], field419[var5 + 1]);
                            continue;
                        }
                        if (var396 == 3103) {
                            client.field504.method2218(72);
                            for (class4 var108 = (class4) client.field652.method3155(); var108 != null; var108 = (class4) client.field652.method3139()) {
                                if (var108.field52 == 0 || var108.field52 == 3) {
                                    client.method37(var108, true);
                                }
                            }
                            if (client.field568 != null) {
                                client.method852(client.field568);
                                client.field568 = null;
                            }
                            continue;
                        }
                        if (var396 == 3104) {
                            var6--;
                            String var109 = field420[var6];
                            int var110 = 0;
                            if (class148.method2117(var109)) {
                                int var111 = class148.method863(var109, 10, true);
                                var110 = var111;
                            }
                            client.field504.method2218(228);
                            client.field504.method2307(var110);
                            continue;
                        }
                        if (var396 == 3105) {
                            var6--;
                            String var112 = field420[var6];
                            client.field504.method2218(61);
                            client.field504.method2333(var112.length() + 1);
                            client.field504.method2309(var112);
                            continue;
                        }
                        if (var396 == 3106) {
                            var6--;
                            String var113 = field420[var6];
                            client.field504.method2218(36);
                            client.field504.method2333(var113.length() + 1);
                            client.field504.method2309(var113);
                            continue;
                        }
                        if (var396 == 3107) {
                            var5--;
                            int var114 = field419[var5];
                            var6--;
                            String var115 = field420[var6];
                            client.method92(var114, var115);
                            continue;
                        }
                        if (var396 == 3108) {
                            var5 -= 3;
                            int var116 = field419[var5];
                            int var117 = field419[var5 + 1];
                            int var118 = field419[var5 + 2];
                            class159 var119 = class159.method1507(var118);
                            client.method245(var119, var116, var117);
                            continue;
                        }
                        if (var396 == 3109) {
                            var5 -= 2;
                            int var120 = field419[var5];
                            int var121 = field419[var5 + 1];
                            class159 var122 = var52 ? Statics.field379 : Statics.field54;
                            client.method245(var122, var120, var121);
                            continue;
                        }
                        if (var396 == 3110) {
                            var5--;
                            Statics.field1273 = field419[var5] == 1;
                            continue;
                        }
                    } else if (var396 < 3300) {
                        if (var396 == 3200) {
                            var5 -= 3;
                            client.method1225(field419[var5], field419[var5 + 1], field419[var5 + 2]);
                            continue;
                        }
                        if (var396 == 3201) {
                            var5--;
                            client.method140(field419[var5]);
                            continue;
                        }
                        if (var396 == 3202) {
                            var5 -= 2;
                            int var123 = field419[var5];
                            int var10000 = field419[var5 + 1];
                            if (client.field626 != 0 && var123 != -1) {
                                class139.method1505(Statics.field1867, var123, 0, client.field626, false);
                                client.field729 = true;
                            }
                            continue;
                        }
                    } else if (var396 < 3400) {
                        if (var396 == 3300) {
                            field419[var5++] = client.field503;
                            continue;
                        }
                        if (var396 == 3301) {
                            var5 -= 2;
                            int var125 = field419[var5];
                            int var126 = field419[var5 + 1];
                            field419[var5++] = class19.method133(var125, var126);
                            continue;
                        }
                        if (var396 == 3302) {
                            var5 -= 2;
                            int var127 = field419[var5];
                            int var128 = field419[var5 + 1];
                            field419[var5++] = class19.method288(var127, var128);
                            continue;
                        }
                        if (var396 == 3303) {
                            var5 -= 2;
                            int var129 = field419[var5];
                            int var130 = field419[var5 + 1];
                            int[] var131 = field419;
                            int var132 = var5++;
                            class19 var133 = (class19) class19.field290.method3138((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = 0;
                            } else if (var130 == -1) {
                                var134 = 0;
                            } else {
                                int var135 = 0;
                                for (int var136 = 0; var136 < var133.field292.length; var136++) {
                                    if (var133.field287[var136] == var130) {
                                        var135 += var133.field292[var136];
                                    }
                                }
                                var134 = var135;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var396 == 3304) {
                            var5--;
                            int var137 = field419[var5];
                            field419[var5++] = class41.method178(var137).field1045;
                            continue;
                        }
                        if (var396 == 3305) {
                            var5--;
                            int var138 = field419[var5];
                            field419[var5++] = client.field628[var138];
                            continue;
                        }
                        if (var396 == 3306) {
                            var5--;
                            int var139 = field419[var5];
                            field419[var5++] = client.field629[var139];
                            continue;
                        }
                        if (var396 == 3307) {
                            var5--;
                            int var140 = field419[var5];
                            field419[var5++] = client.field630[var140];
                            continue;
                        }
                        if (var396 == 3308) {
                            int var141 = Statics.field178;
                            int var142 = (Statics.field2555.field468 >> 7) + Statics.field267;
                            int var143 = (Statics.field2555.field435 >> 7) + Statics.field1246;
                            field419[var5++] = (var141 << 28) + (var142 << 14) + var143;
                            continue;
                        }
                        if (var396 == 3309) {
                            var5--;
                            int var144 = field419[var5];
                            field419[var5++] = var144 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var396 == 3310) {
                            var5--;
                            int var145 = field419[var5];
                            field419[var5++] = var145 >> 28;
                            continue;
                        }
                        if (var396 == 3311) {
                            var5--;
                            int var146 = field419[var5];
                            field419[var5++] = var146 & 0x3FFF;
                            continue;
                        }
                        if (var396 == 3312) {
                            field419[var5++] = client.field602 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 3313) {
                            var5 -= 2;
                            int var147 = field419[var5] + 32768;
                            int var148 = field419[var5 + 1];
                            field419[var5++] = class19.method133(var147, var148);
                            continue;
                        }
                        if (var396 == 3314) {
                            var5 -= 2;
                            int var149 = field419[var5] + 32768;
                            int var150 = field419[var5 + 1];
                            field419[var5++] = class19.method288(var149, var150);
                            continue;
                        }
                        if (var396 == 3315) {
                            var5 -= 2;
                            int var151 = field419[var5] + 32768;
                            int var152 = field419[var5 + 1];
                            int[] var153 = field419;
                            int var154 = var5++;
                            class19 var155 = (class19) class19.field290.method3138((long) var151);
                            int var156;
                            if (var155 == null) {
                                var156 = 0;
                            } else if (var152 == -1) {
                                var156 = 0;
                            } else {
                                int var157 = 0;
                                for (int var158 = 0; var158 < var155.field292.length; var158++) {
                                    if (var155.field287[var158] == var152) {
                                        var157 += var155.field292[var158];
                                    }
                                }
                                var156 = var157;
                            }
                            var153[var154] = var156;
                            continue;
                        }
                        if (var396 == 3316) {
                            if (client.field658 >= 2) {
                                field419[var5++] = client.field658;
                            } else {
                                field419[var5++] = 0;
                            }
                            continue;
                        }
                        if (var396 == 3317) {
                            field419[var5++] = client.field660;
                            continue;
                        }
                        if (var396 == 3318) {
                            field419[var5++] = client.field494;
                            continue;
                        }
                        if (var396 == 3321) {
                            field419[var5++] = client.field656;
                            continue;
                        }
                        if (var396 == 3322) {
                            field419[var5++] = client.field657;
                            continue;
                        }
                        if (var396 == 3323) {
                            if (client.field659) {
                                field419[var5++] = 1;
                            } else {
                                field419[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var396 < 3500) {
                        if (var396 == 3400) {
                            var5 -= 2;
                            int var159 = field419[var5];
                            int var160 = field419[var5 + 1];
                            class39 var161 = (class39) class39.field989.method3097((long) var159);
                            class39 var162;
                            if (var161 == null) {
                                byte[] var163 = Statics.field983.method2886(8, var159);
                                class39 var164 = new class39();
                                if (var163 != null) {
                                    var164.method780(new class127(var163));
                                }
                                class39.field989.method3092(var164, (long) var159);
                                var162 = var164;
                            } else {
                                var162 = var161;
                            }
                            class39 var165 = var162;
                            if (var162.field984 != 's') {
                            }
                            for (int var166 = 0; var166 < var165.field987; var166++) {
                                if (var165.field988[var166] == var160) {
                                    field420[var6++] = var165.field990[var166];
                                    var165 = null;
                                    break;
                                }
                            }
                            if (var165 != null) {
                                field420[var6++] = var165.field985;
                            }
                            continue;
                        }
                        if (var396 == 3408) {
                            var5 -= 4;
                            int var167 = field419[var5];
                            int var168 = field419[var5 + 1];
                            int var169 = field419[var5 + 2];
                            int var170 = field419[var5 + 3];
                            class39 var171 = (class39) class39.field989.method3097((long) var169);
                            class39 var172;
                            if (var171 == null) {
                                byte[] var173 = Statics.field983.method2886(8, var169);
                                class39 var174 = new class39();
                                if (var173 != null) {
                                    var174.method780(new class127(var173));
                                }
                                class39.field989.method3092(var174, (long) var169);
                                var172 = var174;
                            } else {
                                var172 = var171;
                            }
                            class39 var175 = var172;
                            if (var172.field982 == var167 && var172.field984 == var168) {
                                for (int var176 = 0; var176 < var175.field987; var176++) {
                                    if (var175.field988[var176] == var170) {
                                        if (var168 == 115) {
                                            field420[var6++] = var175.field990[var176];
                                        } else {
                                            field419[var5++] = var175.field981[var176];
                                        }
                                        var175 = null;
                                        break;
                                    }
                                }
                                if (var175 != null) {
                                    if (var168 == 115) {
                                        field420[var6++] = var175.field985;
                                    } else {
                                        field419[var5++] = var175.field986;
                                    }
                                }
                                continue;
                            }
                            if (var168 == 115) {
                                field420[var6++] = "null";
                            } else {
                                field419[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var396 < 3700) {
                        if (var396 == 3600) {
                            if (client.field745 == 0) {
                                field419[var5++] = -2;
                            } else if (client.field745 == 1) {
                                field419[var5++] = -1;
                            } else {
                                field419[var5++] = client.field744;
                            }
                            continue;
                        }
                        if (var396 == 3601) {
                            var5--;
                            int var177 = field419[var5];
                            if (client.field745 == 2 && var177 < client.field744) {
                                field420[var6++] = client.field746[var177].field383;
                                continue;
                            }
                            field420[var6++] = "";
                            continue;
                        }
                        if (var396 == 3602) {
                            var5--;
                            int var178 = field419[var5];
                            if (client.field745 == 2 && var178 < client.field744) {
                                field419[var5++] = client.field746[var178].field375;
                                continue;
                            }
                            field419[var5++] = 0;
                            continue;
                        }
                        if (var396 == 3603) {
                            var5--;
                            int var179 = field419[var5];
                            if (client.field745 == 2 && var179 < client.field744) {
                                field419[var5++] = client.field746[var179].field376;
                                continue;
                            }
                            field419[var5++] = 0;
                            continue;
                        }
                        if (var396 == 3604) {
                            var6--;
                            String var180 = field420[var6];
                            var5--;
                            int var181 = field419[var5];
                            client.field504.method2218(157);
                            client.field504.method2333(class127.method210(var180) + 1);
                            client.field504.method2372(var181);
                            client.field504.method2309(var180);
                            continue;
                        }
                        if (var396 == 3605) {
                            var6--;
                            String var182 = field420[var6];
                            if (var182 == null) {
                                continue;
                            }
                            if ((client.field744 < 200 || client.field617 == 1) && client.field744 < 400) {
                                String var183 = class149.method2225(var182, Statics.field427);
                                if (var183 == null) {
                                    continue;
                                }
                                for (int var184 = 0; var184 < client.field744; var184++) {
                                    class23 var185 = client.field746[var184];
                                    String var186 = class149.method2225(var185.field383, Statics.field427);
                                    if (var186 != null && var186.equals(var183)) {
                                        client.method105(0, "", var182 + class135.field2273);
                                        continue label2391;
                                    }
                                    if (var185.field374 != null) {
                                        String var187 = class149.method2225(var185.field374, Statics.field427);
                                        if (var187 != null && var187.equals(var183)) {
                                            client.method105(0, "", var182 + class135.field2273);
                                            continue label2391;
                                        }
                                    }
                                }
                                for (int var188 = 0; var188 < client.field524; var188++) {
                                    class11 var189 = client.field681[var188];
                                    String var190 = class149.method2225(var189.field187, Statics.field427);
                                    if (var190 != null && var190.equals(var183)) {
                                        client.method105(0, "", class135.field2278 + var182 + class135.field2135);
                                        continue label2391;
                                    }
                                    if (var189.field189 != null) {
                                        String var191 = class149.method2225(var189.field189, Statics.field427);
                                        if (var191 != null && var191.equals(var183)) {
                                            client.method105(0, "", class135.field2278 + var182 + class135.field2135);
                                            continue label2391;
                                        }
                                    }
                                }
                                if (class149.method2225(Statics.field2555.field50, Statics.field427).equals(var183)) {
                                    client.method105(0, "", class135.field2267);
                                } else {
                                    client.field504.method2218(20);
                                    client.field504.method2333(class127.method210(var182));
                                    client.field504.method2309(var182);
                                }
                                continue;
                            }
                            client.method105(0, "", class135.field2169);
                            continue;
                        }
                        if (var396 == 3606) {
                            var6--;
                            String var192 = field420[var6];
                            client.method541(var192);
                            continue;
                        }
                        if (var396 == 3607) {
                            var6--;
                            String var193 = field420[var6];
                            client.method1475(var193, false);
                            continue;
                        }
                        if (var396 == 3608) {
                            var6--;
                            String var194 = field420[var6];
                            client.method2993(var194);
                            continue;
                        }
                        if (var396 == 3609) {
                            var6--;
                            String var195 = field420[var6];
                            if (var195.startsWith(class2.method1422(0)) || var195.startsWith(class2.method1422(1))) {
                                var195 = var195.substring(7);
                            }
                            field419[var5++] = client.method1(var195) ? 1 : 0;
                            continue;
                        }
                        if (var396 == 3611) {
                            if (client.field651 == null) {
                                field420[var6++] = "";
                                continue;
                            }
                            String[] var196 = field420;
                            int var197 = var6++;
                            String var198 = client.field651;
                            long var199 = 0L;
                            int var201 = var198.length();
                            for (int var202 = 0; var202 < var201; var202++) {
                                var199 *= 37L;
                                char var203 = var198.charAt(var202);
                                if (var203 >= 'A' && var203 <= 'Z') {
                                    var199 += (long) (var203 + 1 - 65);
                                } else if (var203 >= 'a' && var203 <= 'z') {
                                    var199 += (long) (var203 + 1 - 97);
                                } else if (var203 >= '0' && var203 <= '9') {
                                    var199 += (long) (var203 + 27 - 48);
                                }
                                if (var199 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var199 % 37L == 0L && var199 != 0L) {
                                var199 /= 37L;
                            }
                            String var206 = class147.method203(var199);
                            if (var206 == null) {
                                var206 = "";
                            }
                            var196[var197] = var206;
                            continue;
                        }
                        if (var396 == 3612) {
                            if (client.field651 == null) {
                                field419[var5++] = 0;
                            } else {
                                field419[var5++] = Statics.field15;
                            }
                            continue;
                        }
                        if (var396 == 3613) {
                            var5--;
                            int var208 = field419[var5];
                            if (client.field651 != null && var208 < Statics.field15) {
                                field420[var6++] = Statics.field962[var208].field120;
                                continue;
                            }
                            field420[var6++] = "";
                            continue;
                        }
                        if (var396 == 3614) {
                            var5--;
                            int var209 = field419[var5];
                            if (client.field651 != null && var209 < Statics.field15) {
                                field419[var5++] = Statics.field962[var209].field124;
                                continue;
                            }
                            field419[var5++] = 0;
                            continue;
                        }
                        if (var396 == 3615) {
                            var5--;
                            int var210 = field419[var5];
                            if (client.field651 != null && var210 < Statics.field15) {
                                field419[var5++] = Statics.field962[var210].field121;
                                continue;
                            }
                            field419[var5++] = 0;
                            continue;
                        }
                        if (var396 == 3616) {
                            field419[var5++] = Statics.field2008;
                            continue;
                        }
                        if (var396 == 3617) {
                            var6--;
                            String var211 = field420[var6];
                            client.method1274(var211);
                            continue;
                        }
                        if (var396 == 3618) {
                            field419[var5++] = Statics.field258;
                            continue;
                        }
                        if (var396 == 3619) {
                            var6--;
                            String var212 = field420[var6];
                            if (!var212.equals("")) {
                                client.field504.method2218(206);
                                client.field504.method2333(class127.method210(var212));
                                client.field504.method2309(var212);
                            }
                            continue;
                        }
                        if (var396 == 3620) {
                            client.method606();
                            continue;
                        }
                        if (var396 == 3621) {
                            if (client.field745 == 0) {
                                field419[var5++] = -1;
                            } else {
                                field419[var5++] = client.field524;
                            }
                            continue;
                        }
                        if (var396 == 3622) {
                            var5--;
                            int var213 = field419[var5];
                            if (client.field745 != 0 && var213 < client.field524) {
                                field420[var6++] = client.field681[var213].field187;
                                continue;
                            }
                            field420[var6++] = "";
                            continue;
                        }
                        if (var396 == 3623) {
                            var6--;
                            String var214 = field420[var6];
                            if (var214.startsWith(class2.method1422(0)) || var214.startsWith(class2.method1422(1))) {
                                var214 = var214.substring(7);
                            }
                            field419[var5++] = client.method605(var214) ? 1 : 0;
                            continue;
                        }
                        if (var396 == 3624) {
                            var5--;
                            int var215 = field419[var5];
                            if (Statics.field962 != null && var215 < Statics.field15 && Statics.field962[var215].field120.equalsIgnoreCase(Statics.field2555.field50)) {
                                field419[var5++] = 1;
                                continue;
                            }
                            field419[var5++] = 0;
                            continue;
                        }
                        if (var396 == 3625) {
                            if (client.field718 == null) {
                                field420[var6++] = "";
                                continue;
                            }
                            String[] var216 = field420;
                            int var217 = var6++;
                            String var218 = client.field718;
                            long var219 = 0L;
                            int var221 = var218.length();
                            for (int var222 = 0; var222 < var221; var222++) {
                                var219 *= 37L;
                                char var223 = var218.charAt(var222);
                                if (var223 >= 'A' && var223 <= 'Z') {
                                    var219 += (long) (var223 + 1 - 65);
                                } else if (var223 >= 'a' && var223 <= 'z') {
                                    var219 += (long) (var223 + 1 - 97);
                                } else if (var223 >= '0' && var223 <= '9') {
                                    var219 += (long) (var223 + 27 - 48);
                                }
                                if (var219 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var219 % 37L == 0L && var219 != 0L) {
                                var219 /= 37L;
                            }
                            String var226 = class147.method203(var219);
                            if (var226 == null) {
                                var226 = "";
                            }
                            var216[var217] = var226;
                            continue;
                        }
                    } else if (var396 < 4100) {
                        if (var396 == 4000) {
                            var5 -= 2;
                            int var228 = field419[var5];
                            int var229 = field419[var5 + 1];
                            field419[var5++] = var228 + var229;
                            continue;
                        }
                        if (var396 == 4001) {
                            var5 -= 2;
                            int var230 = field419[var5];
                            int var231 = field419[var5 + 1];
                            field419[var5++] = var230 - var231;
                            continue;
                        }
                        if (var396 == 4002) {
                            var5 -= 2;
                            int var232 = field419[var5];
                            int var233 = field419[var5 + 1];
                            field419[var5++] = var232 * var233;
                            continue;
                        }
                        if (var396 == 4003) {
                            var5 -= 2;
                            int var234 = field419[var5];
                            int var235 = field419[var5 + 1];
                            field419[var5++] = var234 / var235;
                            continue;
                        }
                        if (var396 == 4004) {
                            var5--;
                            int var236 = field419[var5];
                            field419[var5++] = (int) (Math.random() * (double) var236);
                            continue;
                        }
                        if (var396 == 4005) {
                            var5--;
                            int var237 = field419[var5];
                            field419[var5++] = (int) (Math.random() * (double) (var237 + 1));
                            continue;
                        }
                        if (var396 == 4006) {
                            var5 -= 5;
                            int var238 = field419[var5];
                            int var239 = field419[var5 + 1];
                            int var240 = field419[var5 + 2];
                            int var241 = field419[var5 + 3];
                            int var242 = field419[var5 + 4];
                            field419[var5++] = (var239 - var238) * (var242 - var240) / (var241 - var240) + var238;
                            continue;
                        }
                        if (var396 == 4007) {
                            var5 -= 2;
                            int var243 = field419[var5];
                            int var244 = field419[var5 + 1];
                            field419[var5++] = var243 * var244 / 100 + var243;
                            continue;
                        }
                        if (var396 == 4008) {
                            var5 -= 2;
                            int var245 = field419[var5];
                            int var246 = field419[var5 + 1];
                            field419[var5++] = var245 | 0x1 << var246;
                            continue;
                        }
                        if (var396 == 4009) {
                            var5 -= 2;
                            int var247 = field419[var5];
                            int var248 = field419[var5 + 1];
                            field419[var5++] = var247 & -1 - (0x1 << var248);
                            continue;
                        }
                        if (var396 == 4010) {
                            var5 -= 2;
                            int var249 = field419[var5];
                            int var250 = field419[var5 + 1];
                            field419[var5++] = (var249 & 0x1 << var250) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var396 == 4011) {
                            var5 -= 2;
                            int var251 = field419[var5];
                            int var252 = field419[var5 + 1];
                            field419[var5++] = var251 % var252;
                            continue;
                        }
                        if (var396 == 4012) {
                            var5 -= 2;
                            int var253 = field419[var5];
                            int var254 = field419[var5 + 1];
                            if (var253 == 0) {
                                field419[var5++] = 0;
                            } else {
                                field419[var5++] = (int) Math.pow((double) var253, (double) var254);
                            }
                            continue;
                        }
                        if (var396 == 4013) {
                            var5 -= 2;
                            int var255 = field419[var5];
                            int var256 = field419[var5 + 1];
                            if (var255 == 0) {
                                field419[var5++] = 0;
                            } else if (var256 == 0) {
                                field419[var5++] = Integer.MAX_VALUE;
                            } else {
                                field419[var5++] = (int) Math.pow((double) var255, 1.0D / (double) var256);
                            }
                            continue;
                        }
                        if (var396 == 4014) {
                            var5 -= 2;
                            int var257 = field419[var5];
                            int var258 = field419[var5 + 1];
                            field419[var5++] = var257 & var258;
                            continue;
                        }
                        if (var396 == 4015) {
                            var5 -= 2;
                            int var259 = field419[var5];
                            int var260 = field419[var5 + 1];
                            field419[var5++] = var259 | var260;
                            continue;
                        }
                    } else if (var396 < 4200) {
                        if (var396 == 4100) {
                            var6--;
                            String var261 = field420[var6];
                            var5--;
                            int var262 = field419[var5];
                            field420[var6++] = var261 + var262;
                            continue;
                        }
                        if (var396 == 4101) {
                            var6 -= 2;
                            String var263 = field420[var6];
                            String var264 = field420[var6 + 1];
                            field420[var6++] = var263 + var264;
                            continue;
                        }
                        if (var396 == 4102) {
                            var6--;
                            String var265 = field420[var6];
                            var5--;
                            int var266 = field419[var5];
                            field420[var6++] = var265 + class148.method116(var266, true);
                            continue;
                        }
                        if (var396 == 4103) {
                            var6--;
                            String var267 = field420[var6];
                            field420[var6++] = var267.toLowerCase();
                            continue;
                        }
                        if (var396 == 4104) {
                            var5--;
                            int var268 = field419[var5];
                            long var269 = ((long) var268 + 11745L) * 86400000L;
                            field423.setTime(new Date(var269));
                            int var271 = field423.get(5);
                            int var272 = field423.get(2);
                            int var273 = field423.get(1);
                            field420[var6++] = var271 + "-" + field415[var272] + "-" + var273;
                            continue;
                        }
                        if (var396 == 4105) {
                            var6 -= 2;
                            String var274 = field420[var6];
                            String var275 = field420[var6 + 1];
                            if (Statics.field2555.field31 != null && Statics.field2555.field31.field2753) {
                                field420[var6++] = var275;
                                continue;
                            }
                            field420[var6++] = var274;
                            continue;
                        }
                        if (var396 == 4106) {
                            var5--;
                            int var276 = field419[var5];
                            field420[var6++] = Integer.toString(var276);
                            continue;
                        }
                        if (var396 == 4107) {
                            var6 -= 2;
                            int[] var277 = field419;
                            int var278 = var5++;
                            String var279 = field420[var6];
                            String var280 = field420[var6 + 1];
                            int var281 = client.field623;
                            int var282 = var279.length();
                            int var283 = var280.length();
                            int var284 = 0;
                            int var285 = 0;
                            byte var286 = 0;
                            byte var287 = 0;
                            int var288;
                            label2233: while (true) {
                                if (var284 - var286 >= var282 && var285 - var287 >= var283) {
                                    int var299 = Math.min(var282, var283);
                                    for (int var300 = 0; var300 < var299; var300++) {
                                        char var303 = var279.charAt(var300);
                                        char var304 = var280.charAt(var300);
                                        if (var303 != var304 && Character.toUpperCase(var303) != Character.toUpperCase(var304)) {
                                            char var305 = Character.toLowerCase(var303);
                                            char var306 = Character.toLowerCase(var304);
                                            if (var305 != var306) {
                                                var288 = class151.method58(var305, var281) - class151.method58(var306, var281);
                                                break label2233;
                                            }
                                        }
                                    }
                                    int var307 = var282 - var283;
                                    if (var307 == 0) {
                                        for (int var308 = 0; var308 < var299; var308++) {
                                            char var309 = var279.charAt(var308);
                                            char var310 = var280.charAt(var308);
                                            if (var309 != var310) {
                                                var288 = class151.method58(var309, var281) - class151.method58(var310, var281);
                                                break label2233;
                                            }
                                        }
                                        var288 = 0;
                                    } else {
                                        var288 = var307;
                                    }
                                    break;
                                }
                                if (var284 - var286 >= var282) {
                                    var288 = -1;
                                    break;
                                }
                                if (var285 - var287 >= var283) {
                                    var288 = 1;
                                    break;
                                }
                                char var289;
                                if (var286 == 0) {
                                    var289 = var279.charAt(var284++);
                                } else {
                                    var289 = (char) var286;
                                    boolean var290 = false;
                                }
                                char var291;
                                if (var287 == 0) {
                                    var291 = var280.charAt(var285++);
                                } else {
                                    var291 = (char) var287;
                                    boolean var292 = false;
                                }
                                byte var293;
                                if (var289 == 198) {
                                    var293 = 69;
                                } else if (var289 == 230) {
                                    var293 = 101;
                                } else if (var289 == 223) {
                                    var293 = 115;
                                } else if (var289 == 338) {
                                    var293 = 69;
                                } else if (var289 == 339) {
                                    var293 = 101;
                                } else {
                                    var293 = 0;
                                }
                                var286 = var293;
                                byte var294;
                                if (var291 == 198) {
                                    var294 = 69;
                                } else if (var291 == 230) {
                                    var294 = 101;
                                } else if (var291 == 223) {
                                    var294 = 115;
                                } else if (var291 == 338) {
                                    var294 = 69;
                                } else if (var291 == 339) {
                                    var294 = 101;
                                } else {
                                    var294 = 0;
                                }
                                var287 = var294;
                                char var295 = class151.method1510(var289, var281);
                                char var296 = class151.method1510(var291, var281);
                                if (var295 != var296 && Character.toUpperCase(var295) != Character.toUpperCase(var296)) {
                                    char var297 = Character.toLowerCase(var295);
                                    char var298 = Character.toLowerCase(var296);
                                    if (var297 != var298) {
                                        var288 = class151.method58(var297, var281) - class151.method58(var298, var281);
                                        break;
                                    }
                                }
                            }
                            byte var312;
                            if (var288 > 0) {
                                var312 = 1;
                            } else if (var288 < 0) {
                                var312 = -1;
                            } else {
                                var312 = 0;
                            }
                            var277[var278] = var312;
                            continue;
                        }
                        if (var396 == 4108) {
                            var6--;
                            String var313 = field420[var6];
                            var5 -= 2;
                            int var314 = field419[var5];
                            int var315 = field419[var5 + 1];
                            byte[] var316 = Statics.field283.method2886(var315, 0);
                            class183 var317 = new class183(var316);
                            field419[var5++] = var317.method3229(var313, var314);
                            continue;
                        }
                        if (var396 == 4109) {
                            var6--;
                            String var318 = field420[var6];
                            var5 -= 2;
                            int var319 = field419[var5];
                            int var320 = field419[var5 + 1];
                            byte[] var321 = Statics.field283.method2886(var320, 0);
                            class183 var322 = new class183(var321);
                            field419[var5++] = var322.method3277(var318, var319);
                            continue;
                        }
                        if (var396 == 4110) {
                            var6 -= 2;
                            String var323 = field420[var6];
                            String var324 = field420[var6 + 1];
                            var5--;
                            if (field419[var5] == 1) {
                                field420[var6++] = var323;
                            } else {
                                field420[var6++] = var324;
                            }
                            continue;
                        }
                        if (var396 == 4111) {
                            var6--;
                            String var325 = field420[var6];
                            field420[var6++] = class185.method3231(var325);
                            continue;
                        }
                        if (var396 == 4112) {
                            var6--;
                            String var326 = field420[var6];
                            var5--;
                            int var327 = field419[var5];
                            field420[var6++] = var326 + (char) var327;
                            continue;
                        }
                        if (var396 == 4113) {
                            var5--;
                            int var328 = field419[var5];
                            int[] var329 = field419;
                            int var330 = var5++;
                            char var331 = (char) var328;
                            boolean var332;
                            if (var331 >= ' ' && var331 <= '~') {
                                var332 = true;
                            } else if (var331 >= 160 && var331 <= 255) {
                                var332 = true;
                            } else if (var331 == 8364 || var331 == 338 || var331 == 8212 || var331 == 339 || var331 == 376) {
                                var332 = true;
                            } else {
                                var332 = false;
                            }
                            var329[var330] = var332 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4114) {
                            var5--;
                            int var333 = field419[var5];
                            field419[var5++] = class148.method1317((char) var333) ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4115) {
                            var5--;
                            int var334 = field419[var5];
                            field419[var5++] = class148.method674((char) var334) ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4116) {
                            var5--;
                            int var335 = field419[var5];
                            int[] var336 = field419;
                            int var337 = var5++;
                            char var338 = (char) var335;
                            boolean var339 = var338 >= '0' && var338 <= '9';
                            var336[var337] = var339 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4117) {
                            var6--;
                            String var340 = field420[var6];
                            if (var340 == null) {
                                field419[var5++] = 0;
                            } else {
                                field419[var5++] = var340.length();
                            }
                            continue;
                        }
                        if (var396 == 4118) {
                            var6--;
                            String var341 = field420[var6];
                            var5 -= 2;
                            int var342 = field419[var5];
                            int var343 = field419[var5 + 1];
                            field420[var6++] = var341.substring(var342, var343);
                            continue;
                        }
                        if (var396 == 4119) {
                            var6--;
                            String var344 = field420[var6];
                            StringBuilder var345 = new StringBuilder(var344.length());
                            boolean var346 = false;
                            for (int var347 = 0; var347 < var344.length(); var347++) {
                                char var348 = var344.charAt(var347);
                                if (var348 == '<') {
                                    var346 = true;
                                } else if (var348 == '>') {
                                    var346 = false;
                                } else if (!var346) {
                                    var345.append(var348);
                                }
                            }
                            field420[var6++] = var345.toString();
                            continue;
                        }
                        if (var396 == 4120) {
                            var6--;
                            String var349 = field420[var6];
                            var5--;
                            int var350 = field419[var5];
                            field419[var5++] = var349.indexOf(var350);
                            continue;
                        }
                    } else if (var396 < 4300) {
                        if (var396 == 4200) {
                            var5--;
                            int var351 = field419[var5];
                            field420[var6++] = class40.method11(var351).field1030;
                            continue;
                        }
                        if (var396 == 4201) {
                            var5 -= 2;
                            int var352 = field419[var5];
                            int var353 = field419[var5 + 1];
                            class40 var354 = class40.method11(var352);
                            if (var353 >= 1 && var353 <= 5 && var354.field1016[var353 - 1] != null) {
                                field420[var6++] = var354.field1016[var353 - 1];
                                continue;
                            }
                            field420[var6++] = "";
                            continue;
                        }
                        if (var396 == 4202) {
                            var5 -= 2;
                            int var355 = field419[var5];
                            int var356 = field419[var5 + 1];
                            class40 var357 = class40.method11(var355);
                            if (var356 >= 1 && var356 <= 5 && var357.field1041[var356 - 1] != null) {
                                field420[var6++] = var357.field1041[var356 - 1];
                                continue;
                            }
                            field420[var6++] = "";
                            continue;
                        }
                        if (var396 == 4203) {
                            var5--;
                            int var358 = field419[var5];
                            field419[var5++] = class40.method11(var358).field1014;
                            continue;
                        }
                        if (var396 == 4204) {
                            var5--;
                            int var359 = field419[var5];
                            field419[var5++] = class40.method11(var359).field1013 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4205) {
                            var5--;
                            int var360 = field419[var5];
                            class40 var361 = class40.method11(var360);
                            if (var361.field1033 == -1 && var361.field1032 >= 0) {
                                field419[var5++] = var361.field1032;
                                continue;
                            }
                            field419[var5++] = var360;
                            continue;
                        }
                        if (var396 == 4206) {
                            var5--;
                            int var362 = field419[var5];
                            class40 var363 = class40.method11(var362);
                            if (var363.field1033 >= 0 && var363.field1032 >= 0) {
                                field419[var5++] = var363.field1032;
                                continue;
                            }
                            field419[var5++] = var362;
                            continue;
                        }
                        if (var396 == 4207) {
                            var5--;
                            int var364 = field419[var5];
                            field419[var5++] = class40.method11(var364).field1015 ? 1 : 0;
                            continue;
                        }
                    } else if (var396 < 5100) {
                        if (var396 == 5000) {
                            field419[var5++] = client.field752;
                            continue;
                        }
                        if (var396 == 5001) {
                            var5 -= 3;
                            client.field752 = field419[var5];
                            Statics.field184 = class138.method1176(field419[var5 + 1]);
                            if (Statics.field184 == null) {
                                Statics.field184 = class138.field2372;
                            }
                            client.field519 = field419[var5 + 2];
                            client.field504.method2218(55);
                            client.field504.method2333(client.field752);
                            client.field504.method2333(Statics.field184.field2374);
                            client.field504.method2333(client.field519);
                            continue;
                        }
                        if (var396 == 5002) {
                            var6--;
                            String var365 = field420[var6];
                            var5 -= 2;
                            int var366 = field419[var5];
                            int var367 = field419[var5 + 1];
                            client.field504.method2218(227);
                            client.field504.method2333(class127.method210(var365) + 2);
                            client.field504.method2309(var365);
                            client.field504.method2333(var366 - 1);
                            client.field504.method2333(var367);
                            continue;
                        }
                        if (var396 == 5003) {
                            var5--;
                            int var368 = field419[var5];
                            String var369 = null;
                            if (var368 < 100) {
                                var369 = client.field706[var368];
                            }
                            if (var369 == null) {
                                var369 = "";
                            }
                            field420[var6++] = var369;
                            continue;
                        }
                        if (var396 == 5004) {
                            var5--;
                            int var370 = field419[var5];
                            int var371 = -1;
                            if (var370 < 100 && client.field706[var370] != null) {
                                var371 = client.field655[var370];
                            }
                            field419[var5++] = var371;
                            continue;
                        }
                        if (var396 == 5005) {
                            if (Statics.field184 == null) {
                                field419[var5++] = -1;
                            } else {
                                field419[var5++] = Statics.field184.field2374;
                            }
                            continue;
                        }
                        if (var396 == 5008) {
                            var6--;
                            String var372 = field420[var6];
                            if (var372.startsWith("::")) {
                                client.method2587(var372.substring(2));
                            } else {
                                String var373 = var372.toLowerCase();
                                byte var374 = 0;
                                if (var373.startsWith(class135.field2282)) {
                                    var374 = 0;
                                    var372 = var372.substring(class135.field2282.length());
                                } else if (var373.startsWith(class135.field2263)) {
                                    var374 = 1;
                                    var372 = var372.substring(class135.field2263.length());
                                } else if (var373.startsWith(class135.field2286)) {
                                    var374 = 2;
                                    var372 = var372.substring(class135.field2286.length());
                                } else if (var373.startsWith(class135.field2288)) {
                                    var374 = 3;
                                    var372 = var372.substring(class135.field2288.length());
                                } else if (var373.startsWith(class135.field2318)) {
                                    var374 = 4;
                                    var372 = var372.substring(class135.field2318.length());
                                } else if (var373.startsWith(class135.field2292)) {
                                    var374 = 5;
                                    var372 = var372.substring(class135.field2292.length());
                                } else if (var373.startsWith(class135.field2294)) {
                                    var374 = 6;
                                    var372 = var372.substring(class135.field2294.length());
                                } else if (var373.startsWith(class135.field2296)) {
                                    var374 = 7;
                                    var372 = var372.substring(class135.field2296.length());
                                } else if (var373.startsWith(class135.field2327)) {
                                    var374 = 8;
                                    var372 = var372.substring(class135.field2327.length());
                                } else if (var373.startsWith(class135.field2136)) {
                                    var374 = 9;
                                    var372 = var372.substring(class135.field2136.length());
                                } else if (var373.startsWith(class135.field2224)) {
                                    var374 = 10;
                                    var372 = var372.substring(class135.field2224.length());
                                } else if (var373.startsWith(class135.field2302)) {
                                    var374 = 11;
                                    var372 = var372.substring(class135.field2302.length());
                                } else if (client.field623 != 0) {
                                    if (var373.startsWith(class135.field2283)) {
                                        var374 = 0;
                                        var372 = var372.substring(class135.field2283.length());
                                    } else if (var373.startsWith(class135.field2285)) {
                                        var374 = 1;
                                        var372 = var372.substring(class135.field2285.length());
                                    } else if (var373.startsWith(class135.field2287)) {
                                        var374 = 2;
                                        var372 = var372.substring(class135.field2287.length());
                                    } else if (var373.startsWith(class135.field2289)) {
                                        var374 = 3;
                                        var372 = var372.substring(class135.field2289.length());
                                    } else if (var373.startsWith(class135.field2124)) {
                                        var374 = 4;
                                        var372 = var372.substring(class135.field2124.length());
                                    } else if (var373.startsWith(class135.field2340)) {
                                        var374 = 5;
                                        var372 = var372.substring(class135.field2340.length());
                                    } else if (var373.startsWith(class135.field2249)) {
                                        var374 = 6;
                                        var372 = var372.substring(class135.field2249.length());
                                    } else if (var373.startsWith(class135.field2297)) {
                                        var374 = 7;
                                        var372 = var372.substring(class135.field2297.length());
                                    } else if (var373.startsWith(class135.field2299)) {
                                        var374 = 8;
                                        var372 = var372.substring(class135.field2299.length());
                                    } else if (var373.startsWith(class135.field2301)) {
                                        var374 = 9;
                                        var372 = var372.substring(class135.field2301.length());
                                    } else if (var373.startsWith(class135.field2259)) {
                                        var374 = 10;
                                        var372 = var372.substring(class135.field2259.length());
                                    } else if (var373.startsWith(class135.field2305)) {
                                        var374 = 11;
                                        var372 = var372.substring(class135.field2305.length());
                                    }
                                }
                                String var375 = var372.toLowerCase();
                                byte var376 = 0;
                                if (var375.startsWith(class135.field2338)) {
                                    var376 = 1;
                                    var372 = var372.substring(class135.field2338.length());
                                } else if (var375.startsWith(class135.field2234)) {
                                    var376 = 2;
                                    var372 = var372.substring(class135.field2234.length());
                                } else if (var375.startsWith(class135.field2310)) {
                                    var376 = 3;
                                    var372 = var372.substring(class135.field2310.length());
                                } else if (var375.startsWith(class135.field2304)) {
                                    var376 = 4;
                                    var372 = var372.substring(class135.field2304.length());
                                } else if (var375.startsWith(class135.field2121)) {
                                    var376 = 5;
                                    var372 = var372.substring(class135.field2121.length());
                                } else if (client.field623 != 0) {
                                    if (var375.startsWith(class135.field2291)) {
                                        var376 = 1;
                                        var372 = var372.substring(class135.field2291.length());
                                    } else if (var375.startsWith(class135.field2309)) {
                                        var376 = 2;
                                        var372 = var372.substring(class135.field2309.length());
                                    } else if (var375.startsWith(class135.field2182)) {
                                        var376 = 3;
                                        var372 = var372.substring(class135.field2182.length());
                                    } else if (var375.startsWith(class135.field2176)) {
                                        var376 = 4;
                                        var372 = var372.substring(class135.field2176.length());
                                    } else if (var375.startsWith(class135.field2315)) {
                                        var376 = 5;
                                        var372 = var372.substring(class135.field2315.length());
                                    }
                                }
                                client.field504.method2218(42);
                                client.field504.method2333(0);
                                int var377 = client.field504.field2052;
                                client.field504.method2333(var374);
                                client.field504.method2333(var376);
                                class116 var378 = client.field504;
                                int var379 = var378.field2052;
                                byte[] var380 = class150.method100(var372);
                                var378.method2316(var380.length);
                                var378.field2052 += Statics.field2839.method2252(var380, 0, var380.length, var378.field2057, var378.field2052);
                                client.field504.method2374(client.field504.field2052 - var377);
                            }
                            continue;
                        }
                        if (var396 == 5009) {
                            var6 -= 2;
                            String var381 = field420[var6];
                            String var382 = field420[var6 + 1];
                            client.field504.method2218(50);
                            client.field504.method2306(0);
                            int var383 = client.field504.field2052;
                            client.field504.method2309(var381);
                            class116 var384 = client.field504;
                            int var385 = var384.field2052;
                            byte[] var386 = class150.method100(var382);
                            var384.method2316(var386.length);
                            var384.field2052 += Statics.field2839.method2252(var386, 0, var386.length, var384.field2057, var384.field2052);
                            client.field504.method2314(client.field504.field2052 - var383);
                            continue;
                        }
                        if (var396 == 5010) {
                            var5--;
                            int var387 = field419[var5];
                            String var388 = null;
                            if (var387 < 100) {
                                var388 = client.field704[var387];
                            }
                            if (var388 == null) {
                                var388 = "";
                            }
                            field420[var6++] = var388;
                            continue;
                        }
                        if (var396 == 5011) {
                            var5--;
                            int var389 = field419[var5];
                            String var390 = null;
                            if (var389 < 100) {
                                var390 = client.field705[var389];
                            }
                            if (var390 == null) {
                                var390 = "";
                            }
                            field420[var6++] = var390;
                            continue;
                        }
                        if (var396 == 5015) {
                            String var391;
                            if (Statics.field2555 == null || Statics.field2555.field50 == null) {
                                var391 = "";
                            } else {
                                var391 = Statics.field2555.field50;
                            }
                            field420[var6++] = var391;
                            continue;
                        }
                        if (var396 == 5016) {
                            field419[var5++] = client.field519;
                            continue;
                        }
                        if (var396 == 5017) {
                            field419[var5++] = client.field707;
                            continue;
                        }
                    }
                } else {
                    class159 var75;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var5--;
                        var75 = class159.method1507(field419[var5]);
                    } else {
                        var75 = var52 ? Statics.field379 : Statics.field54;
                    }
                    if (var396 == 1300) {
                        var5--;
                        int var76 = field419[var5] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var6--;
                            var75.method3012(var76, field420[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var396 == 1301) {
                        var5 -= 2;
                        int var77 = field419[var5];
                        int var78 = field419[var5 + 1];
                        var75.field2673 = class159.method2121(var77, var78);
                        continue;
                    }
                    if (var396 == 1302) {
                        var5--;
                        var75.field2674 = field419[var5] == 1;
                        continue;
                    }
                    if (var396 == 1303) {
                        var5--;
                        var75.field2678 = field419[var5];
                        continue;
                    }
                    if (var396 == 1304) {
                        var5--;
                        var75.field2675 = field419[var5];
                        continue;
                    }
                    if (var396 == 1305) {
                        var6--;
                        var75.field2671 = field420[var6];
                        continue;
                    }
                    if (var396 == 1306) {
                        var6--;
                        var75.field2617 = field420[var6];
                        continue;
                    }
                    if (var396 == 1307) {
                        var75.field2672 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var395) {
            StringBuilder var393 = new StringBuilder(30);
            var393.append("").append(var4.field2824).append(" ");
            for (int var394 = field421 - 1; var394 >= 0; var394--) {
                var393.append("").append(field422[var394].field278.field2824).append(" ");
            }
            var393.append("").append(var10);
            class80.method789(var393.toString(), var395);
        }
    }

    @ObfuscatedName("n.y(II)V")
    public static void method141(int arg0) {
        if (arg0 == -1 || !class159.method227(arg0)) {
            return;
        }
        class159[] var1 = Statics.field2666[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3.field2679 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field11 = var3.field2679;
                method50(var4, 2000000);
            }
        }
    }
}
