package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("af")
public class class27 {

    @ObfuscatedName("af.s")
    public static int[] field406 = new int[5];

    @ObfuscatedName("af.d")
    public static int[][] field407 = new int[5][5000];

    @ObfuscatedName("af.e")
    public static int[] field408 = new int[1000];

    @ObfuscatedName("af.u")
    public static String[] field409 = new String[1000];

    @ObfuscatedName("af.q")
    public static int field410 = 0;

    @ObfuscatedName("af.o")
    public static class18[] field404 = new class18[50];

    @ObfuscatedName("af.x")
    public static Calendar field413 = Calendar.getInstance();

    @ObfuscatedName("af.w")
    public static final String[] field414 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class27() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bl.i(Li;I)V")
    public static void method1310(class1 arg0) {
        method25(arg0, 200000);
    }

    @ObfuscatedName("r.b(Li;II)V")
    public static void method25(class1 arg0, int arg1) {
        Object[] var2 = arg0.field6;
        int var3 = (Integer) var2[0];
        class5 var4 = class5.method35(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field82;
        int[] var9 = var4.field74;
        byte var10 = -1;
        field410 = 0;
        try {
            Statics.field402 = new int[var4.field72];
            int var11 = 0;
            Statics.field405 = new String[var4.field77];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field2;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2727;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2620;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2727;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2620;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field12;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field402[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1;
                    }
                    Statics.field405[var12++] = var15;
                }
            }
            int var16 = 0;
            label2297: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var371 = var8[var7];
                if (var371 < 100) {
                    if (var371 == 0) {
                        field408[var5++] = var9[var7];
                        continue;
                    }
                    if (var371 == 1) {
                        int var17 = var9[var7];
                        field408[var5++] = class162.field2740[var17];
                        continue;
                    }
                    if (var371 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class162.field2740[var18] = field408[var5];
                        client.method821(var18);
                        continue;
                    }
                    if (var371 == 3) {
                        field409[var6++] = var4.field75[var7];
                        continue;
                    }
                    if (var371 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var371 == 7) {
                        var5 -= 2;
                        if (field408[var5 + 1] != field408[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var371 == 8) {
                        var5 -= 2;
                        if (field408[var5 + 1] == field408[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var371 == 9) {
                        var5 -= 2;
                        if (field408[var5] < field408[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var371 == 10) {
                        var5 -= 2;
                        if (field408[var5] > field408[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var371 == 21) {
                        if (field410 == 0) {
                            return;
                        }
                        class18 var19 = field404[--field410];
                        var4 = var19.field264;
                        var8 = var4.field82;
                        var9 = var4.field74;
                        var7 = var19.field266;
                        Statics.field402 = var19.field258;
                        Statics.field405 = var19.field260;
                        continue;
                    }
                    if (var371 == 25) {
                        int var20 = var9[var7];
                        field408[var5++] = class162.method2738(var20);
                        continue;
                    }
                    if (var371 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class162.method880(var21, field408[var5]);
                        continue;
                    }
                    if (var371 == 31) {
                        var5 -= 2;
                        if (field408[var5] <= field408[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var371 == 32) {
                        var5 -= 2;
                        if (field408[var5] >= field408[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var371 == 33) {
                        field408[var5++] = Statics.field402[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var371 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field402[var10001] = field408[var5];
                        continue;
                    }
                    if (var371 == 35) {
                        field409[var6++] = Statics.field405[var9[var7]];
                        continue;
                    }
                    if (var371 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field405[var10001] = field409[var6];
                        continue;
                    }
                    if (var371 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class150.method2228(field409, var6, var22);
                        field409[var6++] = var23;
                        continue;
                    }
                    if (var371 == 38) {
                        var5--;
                        continue;
                    }
                    if (var371 == 39) {
                        var6--;
                        continue;
                    }
                    if (var371 == 40) {
                        int var24 = var9[var7];
                        class5 var25 = class5.method35(var24);
                        int[] var26 = new int[var25.field72];
                        String[] var27 = new String[var25.field77];
                        for (int var28 = 0; var28 < var25.field73; var28++) {
                            var26[var28] = field408[var5 - var25.field73 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field79; var29++) {
                            var27[var29] = field409[var6 - var25.field79 + var29];
                        }
                        var5 -= var25.field73;
                        var6 -= var25.field79;
                        class18 var30 = new class18();
                        var30.field264 = var4;
                        var30.field266 = var7;
                        var30.field258 = Statics.field402;
                        var30.field260 = Statics.field405;
                        field404[++field410 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field82;
                        var9 = var25.field74;
                        var7 = -1;
                        Statics.field402 = var26;
                        Statics.field405 = var27;
                        continue;
                    }
                    if (var371 == 42) {
                        field408[var5++] = client.field674[var9[var7]];
                        continue;
                    }
                    if (var371 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field674[var10001] = field408[var5];
                        continue;
                    }
                    if (var371 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field408[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field406[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2297;
                                }
                                field407[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var371 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field408[var5];
                        if (var37 >= 0 && var37 < field406[var36]) {
                            field408[var5++] = field407[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var371 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field408[var5];
                        if (var39 >= 0 && var39 < field406[var38]) {
                            field407[var38][var39] = field408[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var371 == 47) {
                        String var40 = client.field643[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field409[var6++] = var40;
                        continue;
                    }
                    if (var371 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field643[var10001] = field409[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var371 < 1000) {
                    if (var371 == 100) {
                        var5 -= 3;
                        int var42 = field408[var5];
                        int var43 = field408[var5 + 1];
                        int var44 = field408[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class161 var45 = class161.method3039(var42);
                        if (var45.field2641 == null) {
                            var45.field2641 = new class161[var44 + 1];
                        }
                        if (var45.field2641.length <= var44) {
                            class161[] var46 = new class161[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2641.length; var47++) {
                                var46[var47] = var45.field2641[var47];
                            }
                            var45.field2641 = var46;
                        }
                        if (var44 > 0 && var45.field2641[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class161 var48 = new class161();
                        var48.field2621 = var43;
                        var48.field2713 = var48.field2727 = var45.field2727;
                        var48.field2620 = var44;
                        var48.field2618 = true;
                        var45.field2641[var44] = var48;
                        if (var41) {
                            Statics.field412 = var48;
                        } else {
                            Statics.field187 = var48;
                        }
                        client.method610(var45);
                        continue;
                    }
                    if (var371 == 101) {
                        class161 var49 = var41 ? Statics.field412 : Statics.field187;
                        class161 var50 = class161.method3039(var49.field2727);
                        var50.field2641[var49.field2620] = null;
                        client.method610(var50);
                        continue;
                    }
                    if (var371 == 102) {
                        var5--;
                        class161 var51 = class161.method3039(field408[var5]);
                        var51.field2641 = null;
                        client.method610(var51);
                        continue;
                    }
                    if (var371 == 200) {
                        var5 -= 2;
                        int var52 = field408[var5];
                        int var53 = field408[var5 + 1];
                        class161 var54 = class161.method2331(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field408[var5++] = 1;
                            if (var41) {
                                Statics.field412 = var54;
                            } else {
                                Statics.field187 = var54;
                            }
                            continue;
                        }
                        field408[var5++] = 0;
                        continue;
                    }
                } else if (!(var371 < 1000 || var371 >= 1100) || !(var371 < 2000 || var371 >= 2100)) {
                    class161 var55;
                    if (var371 >= 2000) {
                        var371 -= 1000;
                        var5--;
                        var55 = class161.method3039(field408[var5]);
                    } else {
                        var55 = var41 ? Statics.field412 : Statics.field187;
                    }
                    if (var371 == 1000) {
                        var5 -= 2;
                        var55.field2624 = field408[var5];
                        var55.field2674 = field408[var5 + 1];
                        client.method610(var55);
                        continue;
                    }
                    if (var371 == 1001) {
                        var5 -= 2;
                        var55.field2734 = field408[var5];
                        var55.field2629 = field408[var5 + 1];
                        client.method610(var55);
                        continue;
                    }
                    if (var371 == 1003) {
                        var5--;
                        boolean var56 = field408[var5] == 1;
                        if (var55.field2631 != var56) {
                            var55.field2631 = var56;
                            client.method610(var55);
                        }
                        continue;
                    }
                } else if (!(var371 < 1100 || var371 >= 1200) || !(var371 < 2100 || var371 >= 2200)) {
                    class161 var57;
                    if (var371 >= 2000) {
                        var371 -= 1000;
                        var5--;
                        var57 = class161.method3039(field408[var5]);
                    } else {
                        var57 = var41 ? Statics.field412 : Statics.field187;
                    }
                    if (var371 == 1100) {
                        var5 -= 2;
                        var57.field2632 = field408[var5];
                        if (var57.field2632 > var57.field2634 - var57.field2734) {
                            var57.field2632 = var57.field2634 - var57.field2734;
                        }
                        if (var57.field2632 < 0) {
                            var57.field2632 = 0;
                        }
                        var57.field2655 = field408[var5 + 1];
                        if (var57.field2655 > var57.field2635 - var57.field2629) {
                            var57.field2655 = var57.field2635 - var57.field2629;
                        }
                        if (var57.field2655 < 0) {
                            var57.field2655 = 0;
                        }
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1101) {
                        var5--;
                        var57.field2636 = field408[var5];
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1102) {
                        var5--;
                        var57.field2640 = field408[var5] == 1;
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1103) {
                        var5--;
                        var57.field2691 = field408[var5];
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1104) {
                        var5--;
                        var57.field2716 = field408[var5];
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1105) {
                        var5--;
                        var57.field2643 = field408[var5];
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1106) {
                        var5--;
                        var57.field2645 = field408[var5];
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1107) {
                        var5--;
                        var57.field2646 = field408[var5] == 1;
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1108) {
                        var57.field2651 = 1;
                        var5--;
                        var57.field2652 = field408[var5];
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1109) {
                        var5 -= 6;
                        var57.field2657 = field408[var5];
                        var57.field2658 = field408[var5 + 1];
                        var57.field2659 = field408[var5 + 2];
                        var57.field2660 = field408[var5 + 3];
                        var57.field2661 = field408[var5 + 4];
                        var57.field2662 = field408[var5 + 5];
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1110) {
                        var5--;
                        int var58 = field408[var5];
                        if (var57.field2700 != var58) {
                            var57.field2700 = var58;
                            var57.field2725 = 0;
                            var57.field2726 = 0;
                            client.method610(var57);
                        }
                        continue;
                    }
                    if (var371 == 1111) {
                        var5--;
                        var57.field2664 = field408[var5] == 1;
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1112) {
                        var6--;
                        String var59 = field409[var6];
                        if (!var59.equals(var57.field2666)) {
                            var57.field2666 = var59;
                            client.method610(var57);
                        }
                        continue;
                    }
                    if (var371 == 1113) {
                        var5--;
                        var57.field2665 = field408[var5];
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1114) {
                        var5 -= 3;
                        var57.field2669 = field408[var5];
                        var57.field2670 = field408[var5 + 1];
                        var57.field2668 = field408[var5 + 2];
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1115) {
                        var5--;
                        var57.field2671 = field408[var5] == 1;
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1116) {
                        var5--;
                        var57.field2703 = field408[var5];
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1117) {
                        var5--;
                        var57.field2648 = field408[var5];
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1118) {
                        var5--;
                        var57.field2649 = field408[var5] == 1;
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1119) {
                        var5--;
                        var57.field2650 = field408[var5] == 1;
                        client.method610(var57);
                        continue;
                    }
                    if (var371 == 1120) {
                        var5 -= 2;
                        var57.field2634 = field408[var5];
                        var57.field2635 = field408[var5 + 1];
                        client.method610(var57);
                        continue;
                    }
                } else if (!(var371 < 1200 || var371 >= 1300) || !(var371 < 2200 || var371 >= 2300)) {
                    class161 var60;
                    if (var371 >= 2000) {
                        var371 -= 1000;
                        var5--;
                        var60 = class161.method3039(field408[var5]);
                    } else {
                        var60 = var41 ? Statics.field412 : Statics.field187;
                    }
                    client.method610(var60);
                    if (var371 == 1200) {
                        var5 -= 2;
                        int var61 = field408[var5];
                        int var62 = field408[var5 + 1];
                        var60.field2723 = var61;
                        var60.field2627 = var62;
                        class41 var63 = class41.method1342(var61);
                        var60.field2659 = var63.field1001;
                        var60.field2660 = var63.field1002;
                        var60.field2661 = var63.field995;
                        var60.field2657 = var63.field1004;
                        var60.field2658 = var63.field1005;
                        var60.field2662 = var63.field1000;
                        if (var60.field2734 > 0) {
                            var60.field2662 = var60.field2662 * 32 / var60.field2734;
                        }
                        continue;
                    }
                    if (var371 == 1201) {
                        var60.field2651 = 2;
                        var5--;
                        var60.field2652 = field408[var5];
                        continue;
                    }
                    if (var371 == 1202) {
                        var60.field2651 = 3;
                        var60.field2652 = Statics.field1683.field38.method3260();
                        continue;
                    }
                } else if ((var371 < 1300 || var371 >= 1400) && (var371 < 2300 || var371 >= 2400)) {
                    if (var371 >= 1400 && var371 < 1500 || var371 >= 2400 && var371 < 2500) {
                        class161 var68;
                        if (var371 >= 2000) {
                            var371 -= 1000;
                            var5--;
                            var68 = class161.method3039(field408[var5]);
                        } else {
                            var68 = var41 ? Statics.field412 : Statics.field187;
                        }
                        var6--;
                        String var69 = field409[var6];
                        int[] var70 = null;
                        if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                            var5--;
                            int var71 = field408[var5];
                            if (var71 > 0) {
                                var70 = new int[var71];
                                while (var71-- > 0) {
                                    var5--;
                                    var70[var71] = field408[var5];
                                }
                            }
                            var69 = var69.substring(0, var69.length() - 1);
                        }
                        Object[] var72 = new Object[var69.length() + 1];
                        for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                            if (var69.charAt(var73 - 1) == 's') {
                                var6--;
                                var72[var73] = field409[var6];
                            } else {
                                var5--;
                                var72[var73] = Integer.valueOf(field408[var5]);
                            }
                        }
                        var5--;
                        int var74 = field408[var5];
                        if (var74 == -1) {
                            var72 = null;
                        } else {
                            var72[0] = Integer.valueOf(var74);
                        }
                        if (var371 == 1400) {
                            var68.field2623 = var72;
                        }
                        if (var371 == 1401) {
                            var68.field2720 = var72;
                        }
                        if (var371 == 1402) {
                            var68.field2685 = var72;
                        }
                        if (var371 == 1403) {
                            var68.field2625 = var72;
                        }
                        if (var371 == 1404) {
                            var68.field2694 = var72;
                        }
                        if (var371 == 1405) {
                            var68.field2678 = var72;
                        }
                        if (var371 == 1406) {
                            var68.field2698 = var72;
                        }
                        if (var371 == 1407) {
                            var68.field2699 = var72;
                            var68.field2708 = var70;
                        }
                        if (var371 == 1408) {
                            var68.field2705 = var72;
                        }
                        if (var371 == 1409) {
                            var68.field2706 = var72;
                        }
                        if (var371 == 1410) {
                            var68.field2696 = var72;
                        }
                        if (var371 == 1411) {
                            var68.field2689 = var72;
                        }
                        if (var371 == 1412) {
                            var68.field2679 = var72;
                        }
                        if (var371 == 1414) {
                            var68.field2719 = var72;
                            var68.field2702 = var70;
                        }
                        if (var371 == 1415) {
                            var68.field2733 = var72;
                            var68.field2710 = var70;
                        }
                        if (var371 == 1416) {
                            var68.field2697 = var72;
                        }
                        if (var371 == 1417) {
                            var68.field2707 = var72;
                        }
                        if (var371 == 1418) {
                            var68.field2695 = var72;
                        }
                        if (var371 == 1419) {
                            var68.field2630 = var72;
                        }
                        if (var371 == 1420) {
                            var68.field2693 = var72;
                        }
                        if (var371 == 1421) {
                            var68.field2711 = var72;
                        }
                        if (var371 == 1422) {
                            var68.field2712 = var72;
                        }
                        if (var371 == 1423) {
                            var68.field2617 = var72;
                        }
                        if (var371 == 1424) {
                            var68.field2714 = var72;
                        }
                        var68.field2686 = true;
                        continue;
                    }
                    if (var371 < 1600) {
                        class161 var75 = var41 ? Statics.field412 : Statics.field187;
                        if (var371 == 1500) {
                            field408[var5++] = var75.field2624;
                            continue;
                        }
                        if (var371 == 1501) {
                            field408[var5++] = var75.field2674;
                            continue;
                        }
                        if (var371 == 1502) {
                            field408[var5++] = var75.field2734;
                            continue;
                        }
                        if (var371 == 1503) {
                            field408[var5++] = var75.field2629;
                            continue;
                        }
                        if (var371 == 1504) {
                            field408[var5++] = var75.field2631 ? 1 : 0;
                            continue;
                        }
                        if (var371 == 1505) {
                            field408[var5++] = var75.field2713;
                            continue;
                        }
                    } else if (var371 < 1700) {
                        class161 var76 = var41 ? Statics.field412 : Statics.field187;
                        if (var371 == 1600) {
                            field408[var5++] = var76.field2632;
                            continue;
                        }
                        if (var371 == 1601) {
                            field408[var5++] = var76.field2655;
                            continue;
                        }
                        if (var371 == 1602) {
                            field409[var6++] = var76.field2666;
                            continue;
                        }
                        if (var371 == 1603) {
                            field408[var5++] = var76.field2634;
                            continue;
                        }
                        if (var371 == 1604) {
                            field408[var5++] = var76.field2635;
                            continue;
                        }
                        if (var371 == 1605) {
                            field408[var5++] = var76.field2662;
                            continue;
                        }
                        if (var371 == 1606) {
                            field408[var5++] = var76.field2659;
                            continue;
                        }
                        if (var371 == 1607) {
                            field408[var5++] = var76.field2661;
                            continue;
                        }
                        if (var371 == 1608) {
                            field408[var5++] = var76.field2660;
                            continue;
                        }
                    } else if (var371 < 1800) {
                        class161 var77 = var41 ? Statics.field412 : Statics.field187;
                        if (var371 == 1700) {
                            field408[var5++] = var77.field2723;
                            continue;
                        }
                        if (var371 == 1701) {
                            if (var77.field2723 == -1) {
                                field408[var5++] = 0;
                            } else {
                                field408[var5++] = var77.field2627;
                            }
                            continue;
                        }
                        if (var371 == 1702) {
                            field408[var5++] = var77.field2620;
                            continue;
                        }
                    } else if (var371 < 1900) {
                        class161 var78 = var41 ? Statics.field412 : Statics.field187;
                        if (var371 == 1800) {
                            int[] var79 = field408;
                            int var80 = var5++;
                            int var81 = client.method559(var78);
                            int var82 = var81 >> 11 & 0x3F;
                            var79[var80] = var82;
                            continue;
                        }
                        if (var371 == 1801) {
                            var5--;
                            int var83 = field408[var5];
                            int var372 = var83 - 1;
                            if (var78.field2610 != null && var372 < var78.field2610.length && var78.field2610[var372] != null) {
                                field409[var6++] = var78.field2610[var372];
                                continue;
                            }
                            field409[var6++] = "";
                            continue;
                        }
                        if (var371 == 1802) {
                            if (var78.field2672 == null) {
                                field409[var6++] = "";
                            } else {
                                field409[var6++] = var78.field2672;
                            }
                            continue;
                        }
                    } else if (var371 < 2600) {
                        var5--;
                        class161 var84 = class161.method3039(field408[var5]);
                        if (var371 == 2500) {
                            field408[var5++] = var84.field2624;
                            continue;
                        }
                        if (var371 == 2501) {
                            field408[var5++] = var84.field2674;
                            continue;
                        }
                        if (var371 == 2502) {
                            field408[var5++] = var84.field2734;
                            continue;
                        }
                        if (var371 == 2503) {
                            field408[var5++] = var84.field2629;
                            continue;
                        }
                        if (var371 == 2504) {
                            field408[var5++] = var84.field2631 ? 1 : 0;
                            continue;
                        }
                        if (var371 == 2505) {
                            field408[var5++] = var84.field2713;
                            continue;
                        }
                    } else if (var371 < 2700) {
                        var5--;
                        class161 var85 = class161.method3039(field408[var5]);
                        if (var371 == 2600) {
                            field408[var5++] = var85.field2632;
                            continue;
                        }
                        if (var371 == 2601) {
                            field408[var5++] = var85.field2655;
                            continue;
                        }
                        if (var371 == 2602) {
                            field409[var6++] = var85.field2666;
                            continue;
                        }
                        if (var371 == 2603) {
                            field408[var5++] = var85.field2634;
                            continue;
                        }
                        if (var371 == 2604) {
                            field408[var5++] = var85.field2635;
                            continue;
                        }
                        if (var371 == 2605) {
                            field408[var5++] = var85.field2662;
                            continue;
                        }
                        if (var371 == 2606) {
                            field408[var5++] = var85.field2659;
                            continue;
                        }
                        if (var371 == 2607) {
                            field408[var5++] = var85.field2661;
                            continue;
                        }
                        if (var371 == 2608) {
                            field408[var5++] = var85.field2660;
                            continue;
                        }
                    } else if (var371 < 2800) {
                        if (var371 == 2700) {
                            var5--;
                            class161 var86 = class161.method3039(field408[var5]);
                            field408[var5++] = var86.field2723;
                            continue;
                        }
                        if (var371 == 2701) {
                            var5--;
                            class161 var87 = class161.method3039(field408[var5]);
                            if (var87.field2723 == -1) {
                                field408[var5++] = 0;
                            } else {
                                field408[var5++] = var87.field2627;
                            }
                            continue;
                        }
                        if (var371 == 2702) {
                            var5--;
                            int var88 = field408[var5];
                            class4 var89 = (class4) client.field641.method3315((long) var88);
                            if (var89 == null) {
                                field408[var5++] = 0;
                            } else {
                                field408[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var371 < 2900) {
                        var5--;
                        class161 var90 = class161.method3039(field408[var5]);
                        if (var371 == 2800) {
                            int[] var91 = field408;
                            int var92 = var5++;
                            int var93 = client.method559(var90);
                            int var94 = var93 >> 11 & 0x3F;
                            var91[var92] = var94;
                            continue;
                        }
                        if (var371 == 2801) {
                            var5--;
                            int var95 = field408[var5];
                            int var373 = var95 - 1;
                            if (var90.field2610 != null && var373 < var90.field2610.length && var90.field2610[var373] != null) {
                                field409[var6++] = var90.field2610[var373];
                                continue;
                            }
                            field409[var6++] = "";
                            continue;
                        }
                        if (var371 == 2802) {
                            if (var90.field2672 == null) {
                                field409[var6++] = "";
                            } else {
                                field409[var6++] = var90.field2672;
                            }
                            continue;
                        }
                    } else if (var371 < 3200) {
                        if (var371 == 3100) {
                            var6--;
                            String var96 = field409[var6];
                            client.method197(0, "", var96);
                            continue;
                        }
                        if (var371 == 3101) {
                            var5 -= 2;
                            client.method2136(Statics.field1683, field408[var5], field408[var5 + 1]);
                            continue;
                        }
                        if (var371 == 3103) {
                            client.method116();
                            continue;
                        }
                        if (var371 == 3104) {
                            var6--;
                            String var97 = field409[var6];
                            int var98 = 0;
                            boolean var99 = class150.method2993(var97, 10, true);
                            if (var99) {
                                int var100 = class150.method1561(var97, 10, true);
                                var98 = var100;
                            }
                            client.field689.method2335(165);
                            client.field689.method2452(var98);
                            continue;
                        }
                        if (var371 == 3105) {
                            var6--;
                            String var101 = field409[var6];
                            client.field689.method2335(10);
                            client.field689.method2449(var101.length() + 1);
                            client.field689.method2454(var101);
                            continue;
                        }
                        if (var371 == 3106) {
                            var6--;
                            String var102 = field409[var6];
                            client.field689.method2335(130);
                            client.field689.method2449(var102.length() + 1);
                            client.field689.method2454(var102);
                            continue;
                        }
                        if (var371 == 3107) {
                            var5--;
                            int var103 = field408[var5];
                            var6--;
                            String var104 = field409[var6];
                            client.method252(var103, var104);
                            continue;
                        }
                        if (var371 == 3108) {
                            var5 -= 3;
                            int var105 = field408[var5];
                            int var106 = field408[var5 + 1];
                            int var107 = field408[var5 + 2];
                            class161 var108 = class161.method3039(var107);
                            client.method2810(var108, var105, var106);
                            continue;
                        }
                        if (var371 == 3109) {
                            var5 -= 2;
                            int var109 = field408[var5];
                            int var110 = field408[var5 + 1];
                            class161 var111 = var41 ? Statics.field412 : Statics.field187;
                            client.method2810(var111, var109, var110);
                            continue;
                        }
                        if (var371 == 3110) {
                            var5--;
                            Statics.field1668 = field408[var5] == 1;
                            continue;
                        }
                        if (var371 == 3111) {
                            field408[var5++] = Statics.field247.field181 ? 1 : 0;
                            continue;
                        }
                        if (var371 == 3112) {
                            var5--;
                            Statics.field247.field181 = field408[var5] == 1;
                            class12.method38();
                            continue;
                        }
                    } else if (var371 < 3300) {
                        if (var371 == 3200) {
                            var5 -= 3;
                            int var112 = field408[var5];
                            int var113 = field408[var5 + 1];
                            int var114 = field408[var5 + 2];
                            if (client.field718 != 0 && var113 != 0 && client.field702 < 50) {
                                client.field721[client.field702] = var112;
                                client.field722[client.field702] = var113;
                                client.field723[client.field702] = var114;
                                client.field725[client.field702] = null;
                                client.field724[client.field702] = 0;
                                client.field702++;
                            }
                            continue;
                        }
                        if (var371 == 3201) {
                            var5--;
                            client.method198(field408[var5]);
                            continue;
                        }
                        if (var371 == 3202) {
                            var5 -= 2;
                            int var115 = field408[var5];
                            int var10000 = field408[var5 + 1];
                            if (client.field715 != 0 && var115 != -1) {
                                class141.method761(Statics.field310, var115, 0, client.field715, false);
                                client.field543 = true;
                            }
                            continue;
                        }
                    } else if (var371 < 3400) {
                        if (var371 == 3300) {
                            field408[var5++] = client.field735;
                            continue;
                        }
                        if (var371 == 3301) {
                            var5 -= 2;
                            int var117 = field408[var5];
                            int var118 = field408[var5 + 1];
                            field408[var5++] = class19.method1278(var117, var118);
                            continue;
                        }
                        if (var371 == 3302) {
                            var5 -= 2;
                            int var119 = field408[var5];
                            int var120 = field408[var5 + 1];
                            int[] var121 = field408;
                            int var122 = var5++;
                            class19 var123 = (class19) class19.field273.method3315((long) var119);
                            int var124;
                            if (var123 == null) {
                                var124 = 0;
                            } else if (var120 >= 0 && var120 < var123.field272.length) {
                                var124 = var123.field272[var120];
                            } else {
                                var124 = 0;
                            }
                            var121[var122] = var124;
                            continue;
                        }
                        if (var371 == 3303) {
                            var5 -= 2;
                            int var125 = field408[var5];
                            int var126 = field408[var5 + 1];
                            field408[var5++] = class19.method1181(var125, var126);
                            continue;
                        }
                        if (var371 == 3304) {
                            var5--;
                            int var127 = field408[var5];
                            field408[var5++] = class42.method125(var127).field1036;
                            continue;
                        }
                        if (var371 == 3305) {
                            var5--;
                            int var128 = field408[var5];
                            field408[var5++] = client.field618[var128];
                            continue;
                        }
                        if (var371 == 3306) {
                            var5--;
                            int var129 = field408[var5];
                            field408[var5++] = client.field619[var129];
                            continue;
                        }
                        if (var371 == 3307) {
                            var5--;
                            int var130 = field408[var5];
                            field408[var5++] = client.field620[var130];
                            continue;
                        }
                        if (var371 == 3308) {
                            int var131 = Statics.field259;
                            int var132 = (Statics.field1683.field470 >> 7) + Statics.field52;
                            int var133 = (Statics.field1683.field419 >> 7) + Statics.field332;
                            field408[var5++] = (var131 << 28) + (var132 << 14) + var133;
                            continue;
                        }
                        if (var371 == 3309) {
                            var5--;
                            int var134 = field408[var5];
                            field408[var5++] = var134 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var371 == 3310) {
                            var5--;
                            int var135 = field408[var5];
                            field408[var5++] = var135 >> 28;
                            continue;
                        }
                        if (var371 == 3311) {
                            var5--;
                            int var136 = field408[var5];
                            field408[var5++] = var136 & 0x3FFF;
                            continue;
                        }
                        if (var371 == 3312) {
                            field408[var5++] = client.field484 ? 1 : 0;
                            continue;
                        }
                        if (var371 == 3313) {
                            var5 -= 2;
                            int var137 = field408[var5] + 32768;
                            int var138 = field408[var5 + 1];
                            field408[var5++] = class19.method1278(var137, var138);
                            continue;
                        }
                        if (var371 == 3314) {
                            var5 -= 2;
                            int var139 = field408[var5] + 32768;
                            int var140 = field408[var5 + 1];
                            int[] var141 = field408;
                            int var142 = var5++;
                            class19 var143 = (class19) class19.field273.method3315((long) var139);
                            int var144;
                            if (var143 == null) {
                                var144 = 0;
                            } else if (var140 >= 0 && var140 < var143.field272.length) {
                                var144 = var143.field272[var140];
                            } else {
                                var144 = 0;
                            }
                            var141[var142] = var144;
                            continue;
                        }
                        if (var371 == 3315) {
                            var5 -= 2;
                            int var145 = field408[var5] + 32768;
                            int var146 = field408[var5 + 1];
                            field408[var5++] = class19.method1181(var145, var146);
                            continue;
                        }
                        if (var371 == 3316) {
                            if (client.field511 >= 2) {
                                field408[var5++] = client.field511;
                            } else {
                                field408[var5++] = 0;
                            }
                            continue;
                        }
                        if (var371 == 3317) {
                            field408[var5++] = client.field496;
                            continue;
                        }
                        if (var371 == 3318) {
                            field408[var5++] = client.field552;
                            continue;
                        }
                        if (var371 == 3321) {
                            field408[var5++] = client.field645;
                            continue;
                        }
                        if (var371 == 3322) {
                            field408[var5++] = client.field574;
                            continue;
                        }
                        if (var371 == 3323) {
                            if (client.field648) {
                                field408[var5++] = 1;
                            } else {
                                field408[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var371 < 3500) {
                        if (var371 == 3400) {
                            var5 -= 2;
                            int var147 = field408[var5];
                            int var148 = field408[var5 + 1];
                            class40 var149 = (class40) class40.field971.method3277((long) var147);
                            class40 var150;
                            if (var149 == null) {
                                byte[] var151 = Statics.field983.method3043(8, var147);
                                class40 var152 = new class40();
                                if (var151 != null) {
                                    var152.method823(new class128(var151));
                                }
                                class40.field971.method3281(var152, (long) var147);
                                var150 = var152;
                            } else {
                                var150 = var149;
                            }
                            class40 var153 = var150;
                            if (var150.field974 != 's') {
                            }
                            for (int var154 = 0; var154 < var153.field977; var154++) {
                                if (var153.field978[var154] == var148) {
                                    field409[var6++] = var153.field972[var154];
                                    var153 = null;
                                    break;
                                }
                            }
                            if (var153 != null) {
                                field409[var6++] = var153.field975;
                            }
                            continue;
                        }
                        if (var371 == 3408) {
                            var5 -= 4;
                            int var155 = field408[var5];
                            int var156 = field408[var5 + 1];
                            int var157 = field408[var5 + 2];
                            int var158 = field408[var5 + 3];
                            class40 var159 = (class40) class40.field971.method3277((long) var157);
                            class40 var160;
                            if (var159 == null) {
                                byte[] var161 = Statics.field983.method3043(8, var157);
                                class40 var162 = new class40();
                                if (var161 != null) {
                                    var162.method823(new class128(var161));
                                }
                                class40.field971.method3281(var162, (long) var157);
                                var160 = var162;
                            } else {
                                var160 = var159;
                            }
                            class40 var163 = var160;
                            if (var160.field980 == var155 && var160.field974 == var156) {
                                for (int var164 = 0; var164 < var163.field977; var164++) {
                                    if (var163.field978[var164] == var158) {
                                        if (var156 == 115) {
                                            field409[var6++] = var163.field972[var164];
                                        } else {
                                            field408[var5++] = var163.field979[var164];
                                        }
                                        var163 = null;
                                        break;
                                    }
                                }
                                if (var163 != null) {
                                    if (var156 == 115) {
                                        field409[var6++] = var163.field975;
                                    } else {
                                        field408[var5++] = var163.field976;
                                    }
                                }
                                continue;
                            }
                            if (var156 == 115) {
                                field409[var6++] = "null";
                            } else {
                                field408[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var371 < 3700) {
                        if (var371 == 3600) {
                            if (client.field561 == 0) {
                                field408[var5++] = -2;
                            } else if (client.field561 == 1) {
                                field408[var5++] = -1;
                            } else {
                                field408[var5++] = client.field732;
                            }
                            continue;
                        }
                        if (var371 == 3601) {
                            var5--;
                            int var165 = field408[var5];
                            if (client.field561 == 2 && var165 < client.field732) {
                                field409[var6++] = client.field734[var165].field372;
                                continue;
                            }
                            field409[var6++] = "";
                            continue;
                        }
                        if (var371 == 3602) {
                            var5--;
                            int var166 = field408[var5];
                            if (client.field561 == 2 && var166 < client.field732) {
                                field408[var5++] = client.field734[var166].field375;
                                continue;
                            }
                            field408[var5++] = 0;
                            continue;
                        }
                        if (var371 == 3603) {
                            var5--;
                            int var167 = field408[var5];
                            if (client.field561 == 2 && var167 < client.field732) {
                                field408[var5++] = client.field734[var167].field371;
                                continue;
                            }
                            field408[var5++] = 0;
                            continue;
                        }
                        if (var371 == 3604) {
                            var6--;
                            String var168 = field409[var6];
                            var5--;
                            int var169 = field408[var5];
                            client.method2784(var168, var169);
                            continue;
                        }
                        if (var371 == 3605) {
                            var6--;
                            String var170 = field409[var6];
                            if (var170 == null) {
                                continue;
                            }
                            if ((client.field732 < 200 || client.field623 == 1) && client.field732 < 400) {
                                String var171 = class151.method276(var170, Statics.field483);
                                if (var171 == null) {
                                    continue;
                                }
                                for (int var172 = 0; var172 < client.field732; var172++) {
                                    class24 var173 = client.field734[var172];
                                    String var174 = class151.method276(var173.field372, Statics.field483);
                                    if (var174 != null && var174.equals(var171)) {
                                        client.method197(30, "", var170 + class137.field2278);
                                        continue label2297;
                                    }
                                    if (var173.field369 != null) {
                                        String var175 = class151.method276(var173.field369, Statics.field483);
                                        if (var175 != null && var175.equals(var171)) {
                                            client.method197(30, "", var170 + class137.field2278);
                                            continue label2297;
                                        }
                                    }
                                }
                                for (int var176 = 0; var176 < client.field736; var176++) {
                                    class11 var177 = client.field737[var176];
                                    String var178 = class151.method276(var177.field177, Statics.field483);
                                    if (var178 != null && var178.equals(var171)) {
                                        client.method197(30, "", class137.field2225 + var170 + class137.field2216);
                                        continue label2297;
                                    }
                                    if (var177.field176 != null) {
                                        String var179 = class151.method276(var177.field176, Statics.field483);
                                        if (var179 != null && var179.equals(var171)) {
                                            client.method197(30, "", class137.field2225 + var170 + class137.field2216);
                                            continue label2297;
                                        }
                                    }
                                }
                                if (class151.method276(Statics.field1683.field47, Statics.field483).equals(var171)) {
                                    client.method197(30, "", class137.field2281);
                                } else {
                                    client.field689.method2335(206);
                                    client.field689.method2449(class128.method594(var170));
                                    client.field689.method2454(var170);
                                }
                                continue;
                            }
                            client.method197(30, "", class137.field2251);
                            continue;
                        }
                        if (var371 == 3606) {
                            var6--;
                            String var180 = field409[var6];
                            client.method2237(var180);
                            continue;
                        }
                        if (var371 == 3607) {
                            var6--;
                            String var181 = field409[var6];
                            if (var181 == null) {
                                continue;
                            }
                            if ((client.field736 < 100 || client.field623 == 1) && client.field736 < 400) {
                                String var182 = class151.method276(var181, Statics.field483);
                                if (var182 == null) {
                                    continue;
                                }
                                for (int var183 = 0; var183 < client.field736; var183++) {
                                    class11 var184 = client.field737[var183];
                                    String var185 = class151.method276(var184.field177, Statics.field483);
                                    if (var185 != null && var185.equals(var182)) {
                                        client.method197(31, "", var181 + class137.field2280);
                                        continue label2297;
                                    }
                                    if (var184.field176 != null) {
                                        String var186 = class151.method276(var184.field176, Statics.field483);
                                        if (var186 != null && var186.equals(var182)) {
                                            client.method197(31, "", var181 + class137.field2280);
                                            continue label2297;
                                        }
                                    }
                                }
                                for (int var187 = 0; var187 < client.field732; var187++) {
                                    class24 var188 = client.field734[var187];
                                    String var189 = class151.method276(var188.field372, Statics.field483);
                                    if (var189 != null && var189.equals(var182)) {
                                        client.method197(31, "", class137.field2304 + var181 + class137.field2286);
                                        continue label2297;
                                    }
                                    if (var188.field369 != null) {
                                        String var190 = class151.method276(var188.field369, Statics.field483);
                                        if (var190 != null && var190.equals(var182)) {
                                            client.method197(31, "", class137.field2304 + var181 + class137.field2286);
                                            continue label2297;
                                        }
                                    }
                                }
                                if (class151.method276(Statics.field1683.field47, Statics.field483).equals(var182)) {
                                    client.method197(31, "", class137.field2142);
                                } else {
                                    client.field689.method2335(33);
                                    client.field689.method2449(class128.method594(var181));
                                    client.field689.method2454(var181);
                                }
                                continue;
                            }
                            client.method197(31, "", class137.field2343);
                            continue;
                        }
                        if (var371 == 3608) {
                            var6--;
                            String var191 = field409[var6];
                            client.method31(var191);
                            continue;
                        }
                        if (var371 == 3609) {
                            var6--;
                            String var192 = field409[var6];
                            if (var192.startsWith(class2.method155(0)) || var192.startsWith(class2.method155(1))) {
                                var192 = var192.substring(7);
                            }
                            field408[var5++] = client.method2446(var192, false) ? 1 : 0;
                            continue;
                        }
                        if (var371 == 3611) {
                            if (client.field705 == null) {
                                field409[var6++] = "";
                            } else {
                                field409[var6++] = class149.method187(client.field705);
                            }
                            continue;
                        }
                        if (var371 == 3612) {
                            if (client.field705 == null) {
                                field408[var5++] = 0;
                            } else {
                                field408[var5++] = Statics.field365;
                            }
                            continue;
                        }
                        if (var371 == 3613) {
                            var5--;
                            int var193 = field408[var5];
                            if (client.field705 != null && var193 < Statics.field365) {
                                field409[var6++] = Statics.field24[var193].field108;
                                continue;
                            }
                            field409[var6++] = "";
                            continue;
                        }
                        if (var371 == 3614) {
                            var5--;
                            int var194 = field408[var5];
                            if (client.field705 != null && var194 < Statics.field365) {
                                field408[var5++] = Statics.field24[var194].field110;
                                continue;
                            }
                            field408[var5++] = 0;
                            continue;
                        }
                        if (var371 == 3615) {
                            var5--;
                            int var195 = field408[var5];
                            if (client.field705 != null && var195 < Statics.field365) {
                                field408[var5++] = Statics.field24[var195].field111;
                                continue;
                            }
                            field408[var5++] = 0;
                            continue;
                        }
                        if (var371 == 3616) {
                            field408[var5++] = Statics.field56;
                            continue;
                        }
                        if (var371 == 3617) {
                            var6--;
                            String var196 = field409[var6];
                            if (Statics.field24 != null) {
                                client.field689.method2335(224);
                                client.field689.method2449(class128.method594(var196));
                                client.field689.method2454(var196);
                            }
                            continue;
                        }
                        if (var371 == 3618) {
                            field408[var5++] = Statics.field1050;
                            continue;
                        }
                        if (var371 == 3619) {
                            var6--;
                            String var197 = field409[var6];
                            client.method794(var197);
                            continue;
                        }
                        if (var371 == 3620) {
                            client.field689.method2335(89);
                            client.field689.method2449(0);
                            continue;
                        }
                        if (var371 == 3621) {
                            if (client.field561 == 0) {
                                field408[var5++] = -1;
                            } else {
                                field408[var5++] = client.field736;
                            }
                            continue;
                        }
                        if (var371 == 3622) {
                            var5--;
                            int var198 = field408[var5];
                            if (client.field561 != 0 && var198 < client.field736) {
                                field409[var6++] = client.field737[var198].field177;
                                continue;
                            }
                            field409[var6++] = "";
                            continue;
                        }
                        if (var371 == 3623) {
                            var6--;
                            String var199 = field409[var6];
                            if (var199.startsWith(class2.method155(0)) || var199.startsWith(class2.method155(1))) {
                                var199 = var199.substring(7);
                            }
                            field408[var5++] = client.method664(var199) ? 1 : 0;
                            continue;
                        }
                        if (var371 == 3624) {
                            var5--;
                            int var200 = field408[var5];
                            if (Statics.field24 != null && var200 < Statics.field365 && Statics.field24[var200].field108.equalsIgnoreCase(Statics.field1683.field47)) {
                                field408[var5++] = 1;
                                continue;
                            }
                            field408[var5++] = 0;
                            continue;
                        }
                        if (var371 == 3625) {
                            if (client.field706 == null) {
                                field409[var6++] = "";
                            } else {
                                field409[var6++] = class149.method187(client.field706);
                            }
                            continue;
                        }
                    } else if (var371 < 4100) {
                        if (var371 == 4000) {
                            var5 -= 2;
                            int var201 = field408[var5];
                            int var202 = field408[var5 + 1];
                            field408[var5++] = var201 + var202;
                            continue;
                        }
                        if (var371 == 4001) {
                            var5 -= 2;
                            int var203 = field408[var5];
                            int var204 = field408[var5 + 1];
                            field408[var5++] = var203 - var204;
                            continue;
                        }
                        if (var371 == 4002) {
                            var5 -= 2;
                            int var205 = field408[var5];
                            int var206 = field408[var5 + 1];
                            field408[var5++] = var205 * var206;
                            continue;
                        }
                        if (var371 == 4003) {
                            var5 -= 2;
                            int var207 = field408[var5];
                            int var208 = field408[var5 + 1];
                            field408[var5++] = var207 / var208;
                            continue;
                        }
                        if (var371 == 4004) {
                            var5--;
                            int var209 = field408[var5];
                            field408[var5++] = (int) (Math.random() * (double) var209);
                            continue;
                        }
                        if (var371 == 4005) {
                            var5--;
                            int var210 = field408[var5];
                            field408[var5++] = (int) (Math.random() * (double) (var210 + 1));
                            continue;
                        }
                        if (var371 == 4006) {
                            var5 -= 5;
                            int var211 = field408[var5];
                            int var212 = field408[var5 + 1];
                            int var213 = field408[var5 + 2];
                            int var214 = field408[var5 + 3];
                            int var215 = field408[var5 + 4];
                            field408[var5++] = (var212 - var211) * (var215 - var213) / (var214 - var213) + var211;
                            continue;
                        }
                        if (var371 == 4007) {
                            var5 -= 2;
                            int var216 = field408[var5];
                            int var217 = field408[var5 + 1];
                            field408[var5++] = var216 * var217 / 100 + var216;
                            continue;
                        }
                        if (var371 == 4008) {
                            var5 -= 2;
                            int var218 = field408[var5];
                            int var219 = field408[var5 + 1];
                            field408[var5++] = var218 | 0x1 << var219;
                            continue;
                        }
                        if (var371 == 4009) {
                            var5 -= 2;
                            int var220 = field408[var5];
                            int var221 = field408[var5 + 1];
                            field408[var5++] = var220 & -1 - (0x1 << var221);
                            continue;
                        }
                        if (var371 == 4010) {
                            var5 -= 2;
                            int var222 = field408[var5];
                            int var223 = field408[var5 + 1];
                            field408[var5++] = (var222 & 0x1 << var223) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var371 == 4011) {
                            var5 -= 2;
                            int var224 = field408[var5];
                            int var225 = field408[var5 + 1];
                            field408[var5++] = var224 % var225;
                            continue;
                        }
                        if (var371 == 4012) {
                            var5 -= 2;
                            int var226 = field408[var5];
                            int var227 = field408[var5 + 1];
                            if (var226 == 0) {
                                field408[var5++] = 0;
                            } else {
                                field408[var5++] = (int) Math.pow((double) var226, (double) var227);
                            }
                            continue;
                        }
                        if (var371 == 4013) {
                            var5 -= 2;
                            int var228 = field408[var5];
                            int var229 = field408[var5 + 1];
                            if (var228 == 0) {
                                field408[var5++] = 0;
                            } else if (var229 == 0) {
                                field408[var5++] = Integer.MAX_VALUE;
                            } else {
                                field408[var5++] = (int) Math.pow((double) var228, 1.0D / (double) var229);
                            }
                            continue;
                        }
                        if (var371 == 4014) {
                            var5 -= 2;
                            int var230 = field408[var5];
                            int var231 = field408[var5 + 1];
                            field408[var5++] = var230 & var231;
                            continue;
                        }
                        if (var371 == 4015) {
                            var5 -= 2;
                            int var232 = field408[var5];
                            int var233 = field408[var5 + 1];
                            field408[var5++] = var232 | var233;
                            continue;
                        }
                    } else if (var371 < 4200) {
                        if (var371 == 4100) {
                            var6--;
                            String var234 = field409[var6];
                            var5--;
                            int var235 = field408[var5];
                            field409[var6++] = var234 + var235;
                            continue;
                        }
                        if (var371 == 4101) {
                            var6 -= 2;
                            String var236 = field409[var6];
                            String var237 = field409[var6 + 1];
                            field409[var6++] = var236 + var237;
                            continue;
                        }
                        if (var371 == 4102) {
                            var6--;
                            String var238 = field409[var6];
                            var5--;
                            int var239 = field408[var5];
                            String[] var240 = field409;
                            int var241 = var6++;
                            String var243;
                            if (var239 < 0) {
                                var243 = Integer.toString(var239);
                            } else {
                                var243 = class150.method2255(var239, 10, true);
                            }
                            var240[var241] = var238 + var243;
                            continue;
                        }
                        if (var371 == 4103) {
                            var6--;
                            String var244 = field409[var6];
                            field409[var6++] = var244.toLowerCase();
                            continue;
                        }
                        if (var371 == 4104) {
                            var5--;
                            int var245 = field408[var5];
                            long var246 = ((long) var245 + 11745L) * 86400000L;
                            field413.setTime(new Date(var246));
                            int var248 = field413.get(5);
                            int var249 = field413.get(2);
                            int var250 = field413.get(1);
                            field409[var6++] = var248 + "-" + field414[var249] + "-" + var250;
                            continue;
                        }
                        if (var371 == 4105) {
                            var6 -= 2;
                            String var251 = field409[var6];
                            String var252 = field409[var6 + 1];
                            if (Statics.field1683.field38 != null && Statics.field1683.field38.field2752) {
                                field409[var6++] = var252;
                                continue;
                            }
                            field409[var6++] = var251;
                            continue;
                        }
                        if (var371 == 4106) {
                            var5--;
                            int var253 = field408[var5];
                            field409[var6++] = Integer.toString(var253);
                            continue;
                        }
                        if (var371 == 4107) {
                            var6 -= 2;
                            int[] var254 = field408;
                            int var255 = var5++;
                            String var256 = field409[var6];
                            String var257 = field409[var6 + 1];
                            int var258 = client.field486;
                            int var259 = var256.length();
                            int var260 = var257.length();
                            int var261 = 0;
                            int var262 = 0;
                            char var263 = 0;
                            char var264 = 0;
                            int var265;
                            label2142: while (true) {
                                if (var261 - var263 >= var259 && var262 - var264 >= var260) {
                                    int var274 = Math.min(var259, var260);
                                    for (int var275 = 0; var275 < var274; var275++) {
                                        char var278 = var256.charAt(var275);
                                        char var279 = var257.charAt(var275);
                                        if (var278 != var279 && Character.toUpperCase(var278) != Character.toUpperCase(var279)) {
                                            char var280 = Character.toLowerCase(var278);
                                            char var281 = Character.toLowerCase(var279);
                                            if (var280 != var281) {
                                                var265 = class153.method1585(var280, var258) - class153.method1585(var281, var258);
                                                break label2142;
                                            }
                                        }
                                    }
                                    int var282 = var259 - var260;
                                    if (var282 == 0) {
                                        for (int var283 = 0; var283 < var274; var283++) {
                                            char var284 = var256.charAt(var283);
                                            char var285 = var257.charAt(var283);
                                            if (var284 != var285) {
                                                var265 = class153.method1585(var284, var258) - class153.method1585(var285, var258);
                                                break label2142;
                                            }
                                        }
                                        var265 = 0;
                                    } else {
                                        var265 = var282;
                                    }
                                    break;
                                }
                                if (var261 - var263 >= var259) {
                                    var265 = -1;
                                    break;
                                }
                                if (var262 - var264 >= var260) {
                                    var265 = 1;
                                    break;
                                }
                                char var266;
                                if (var263 == 0) {
                                    var266 = var256.charAt(var261++);
                                } else {
                                    var266 = var263;
                                    boolean var267 = false;
                                }
                                char var268;
                                if (var264 == 0) {
                                    var268 = var257.charAt(var262++);
                                } else {
                                    var268 = var264;
                                    boolean var269 = false;
                                }
                                var263 = class153.method2781(var266);
                                var264 = class153.method2781(var268);
                                char var270 = class153.method150(var266, var258);
                                char var271 = class153.method150(var268, var258);
                                if (var270 != var271 && Character.toUpperCase(var270) != Character.toUpperCase(var271)) {
                                    char var272 = Character.toLowerCase(var270);
                                    char var273 = Character.toLowerCase(var271);
                                    if (var272 != var273) {
                                        var265 = class153.method1585(var272, var258) - class153.method1585(var273, var258);
                                        break;
                                    }
                                }
                            }
                            byte var287;
                            if (var265 > 0) {
                                var287 = 1;
                            } else if (var265 < 0) {
                                var287 = -1;
                            } else {
                                var287 = 0;
                            }
                            var254[var255] = var287;
                            continue;
                        }
                        if (var371 == 4108) {
                            var6--;
                            String var288 = field409[var6];
                            var5 -= 2;
                            int var289 = field408[var5];
                            int var290 = field408[var5 + 1];
                            byte[] var291 = Statics.field1815.method3043(var290, 0);
                            class185 var292 = new class185(var291);
                            field408[var5++] = var292.method3400(var288, var289);
                            continue;
                        }
                        if (var371 == 4109) {
                            var6--;
                            String var293 = field409[var6];
                            var5 -= 2;
                            int var294 = field408[var5];
                            int var295 = field408[var5 + 1];
                            byte[] var296 = Statics.field1815.method3043(var295, 0);
                            class185 var297 = new class185(var296);
                            field408[var5++] = var297.method3461(var293, var294);
                            continue;
                        }
                        if (var371 == 4110) {
                            var6 -= 2;
                            String var298 = field409[var6];
                            String var299 = field409[var6 + 1];
                            var5--;
                            if (field408[var5] == 1) {
                                field409[var6++] = var298;
                            } else {
                                field409[var6++] = var299;
                            }
                            continue;
                        }
                        if (var371 == 4111) {
                            var6--;
                            String var300 = field409[var6];
                            field409[var6++] = class187.method3460(var300);
                            continue;
                        }
                        if (var371 == 4112) {
                            var6--;
                            String var301 = field409[var6];
                            var5--;
                            int var302 = field408[var5];
                            field409[var6++] = var301 + (char) var302;
                            continue;
                        }
                        if (var371 == 4113) {
                            var5--;
                            int var303 = field408[var5];
                            field408[var5++] = class150.method2747((char) var303) ? 1 : 0;
                            continue;
                        }
                        if (var371 == 4114) {
                            var5--;
                            int var304 = field408[var5];
                            field408[var5++] = class150.method170((char) var304) ? 1 : 0;
                            continue;
                        }
                        if (var371 == 4115) {
                            var5--;
                            int var305 = field408[var5];
                            int[] var306 = field408;
                            int var307 = var5++;
                            char var308 = (char) var305;
                            boolean var309 = var308 >= 'A' && var308 <= 'Z' || var308 >= 'a' && var308 <= 'z';
                            var306[var307] = var309 ? 1 : 0;
                            continue;
                        }
                        if (var371 == 4116) {
                            var5--;
                            int var310 = field408[var5];
                            int[] var311 = field408;
                            int var312 = var5++;
                            char var313 = (char) var310;
                            boolean var314 = var313 >= '0' && var313 <= '9';
                            var311[var312] = var314 ? 1 : 0;
                            continue;
                        }
                        if (var371 == 4117) {
                            var6--;
                            String var315 = field409[var6];
                            if (var315 == null) {
                                field408[var5++] = 0;
                            } else {
                                field408[var5++] = var315.length();
                            }
                            continue;
                        }
                        if (var371 == 4118) {
                            var6--;
                            String var316 = field409[var6];
                            var5 -= 2;
                            int var317 = field408[var5];
                            int var318 = field408[var5 + 1];
                            field409[var6++] = var316.substring(var317, var318);
                            continue;
                        }
                        if (var371 == 4119) {
                            var6--;
                            String var319 = field409[var6];
                            StringBuilder var320 = new StringBuilder(var319.length());
                            boolean var321 = false;
                            for (int var322 = 0; var322 < var319.length(); var322++) {
                                char var323 = var319.charAt(var322);
                                if (var323 == '<') {
                                    var321 = true;
                                } else if (var323 == '>') {
                                    var321 = false;
                                } else if (!var321) {
                                    var320.append(var323);
                                }
                            }
                            field409[var6++] = var320.toString();
                            continue;
                        }
                        if (var371 == 4120) {
                            var6--;
                            String var324 = field409[var6];
                            var5--;
                            int var325 = field408[var5];
                            field408[var5++] = var324.indexOf(var325);
                            continue;
                        }
                    } else if (var371 < 4300) {
                        if (var371 == 4200) {
                            var5--;
                            int var326 = field408[var5];
                            field409[var6++] = class41.method1342(var326).field993;
                            continue;
                        }
                        if (var371 == 4201) {
                            var5 -= 2;
                            int var327 = field408[var5];
                            int var328 = field408[var5 + 1];
                            class41 var329 = class41.method1342(var327);
                            if (var328 >= 1 && var328 <= 5 && var329.field1021[var328 - 1] != null) {
                                field409[var6++] = var329.field1021[var328 - 1];
                                continue;
                            }
                            field409[var6++] = "";
                            continue;
                        }
                        if (var371 == 4202) {
                            var5 -= 2;
                            int var330 = field408[var5];
                            int var331 = field408[var5 + 1];
                            class41 var332 = class41.method1342(var330);
                            if (var331 >= 1 && var331 <= 5 && var332.field1010[var331 - 1] != null) {
                                field409[var6++] = var332.field1010[var331 - 1];
                                continue;
                            }
                            field409[var6++] = "";
                            continue;
                        }
                        if (var371 == 4203) {
                            var5--;
                            int var333 = field408[var5];
                            field408[var5++] = class41.method1342(var333).field1007;
                            continue;
                        }
                        if (var371 == 4204) {
                            var5--;
                            int var334 = field408[var5];
                            field408[var5++] = class41.method1342(var334).field1006 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var371 == 4205) {
                            var5--;
                            int var335 = field408[var5];
                            class41 var336 = class41.method1342(var335);
                            if (var336.field1026 == -1 && var336.field996 >= 0) {
                                field408[var5++] = var336.field996;
                                continue;
                            }
                            field408[var5++] = var335;
                            continue;
                        }
                        if (var371 == 4206) {
                            var5--;
                            int var337 = field408[var5];
                            class41 var338 = class41.method1342(var337);
                            if (var338.field1026 >= 0 && var338.field996 >= 0) {
                                field408[var5++] = var338.field996;
                                continue;
                            }
                            field408[var5++] = var337;
                            continue;
                        }
                        if (var371 == 4207) {
                            var5--;
                            int var339 = field408[var5];
                            field408[var5++] = class41.method1342(var339).field1025 ? 1 : 0;
                            continue;
                        }
                    } else if (var371 < 5100) {
                        if (var371 == 5000) {
                            field408[var5++] = client.field697;
                            continue;
                        }
                        if (var371 == 5001) {
                            var5 -= 3;
                            client.field697 = field408[var5];
                            int var340 = field408[var5 + 1];
                            class140[] var341 = new class140[] { class140.field2372, class140.field2371, class140.field2373 };
                            class140[] var342 = var341;
                            int var343 = 0;
                            class140 var345;
                            while (true) {
                                if (var343 >= var342.length) {
                                    var345 = null;
                                    break;
                                }
                                class140 var344 = var342[var343];
                                if (var344.field2370 == var340) {
                                    var345 = var344;
                                    break;
                                }
                                var343++;
                            }
                            Statics.field806 = var345;
                            if (Statics.field806 == null) {
                                Statics.field806 = class140.field2371;
                            }
                            client.field607 = field408[var5 + 2];
                            client.field689.method2335(183);
                            client.field689.method2449(client.field697);
                            client.field689.method2449(Statics.field806.field2370);
                            client.field689.method2449(client.field607);
                            continue;
                        }
                        if (var371 == 5002) {
                            var6--;
                            String var346 = field409[var6];
                            var5 -= 2;
                            int var347 = field408[var5];
                            int var348 = field408[var5 + 1];
                            client.field689.method2335(191);
                            client.field689.method2449(class128.method594(var346) + 2);
                            client.field689.method2454(var346);
                            client.field689.method2449(var347 - 1);
                            client.field689.method2449(var348);
                            continue;
                        }
                        if (var371 == 5003) {
                            var5--;
                            int var349 = field408[var5];
                            String var350 = null;
                            if (var349 < 100) {
                                var350 = client.field694[var349];
                            }
                            if (var350 == null) {
                                var350 = "";
                            }
                            field409[var6++] = var350;
                            continue;
                        }
                        if (var371 == 5004) {
                            var5--;
                            int var351 = field408[var5];
                            int var352 = -1;
                            if (var351 < 100 && client.field694[var351] != null) {
                                var352 = client.field691[var351];
                            }
                            field408[var5++] = var352;
                            continue;
                        }
                        if (var371 == 5005) {
                            if (Statics.field806 == null) {
                                field408[var5++] = -1;
                            } else {
                                field408[var5++] = Statics.field806.field2370;
                            }
                            continue;
                        }
                        if (var371 == 5008) {
                            var6--;
                            String var353 = field409[var6];
                            if (var353.startsWith("::")) {
                                client.method1365(var353.substring(2));
                            } else {
                                String var354 = var353.toLowerCase();
                                byte var355 = 0;
                                if (var354.startsWith(class137.field2287)) {
                                    var355 = 0;
                                    var353 = var353.substring(class137.field2287.length());
                                } else if (var354.startsWith(class137.field2289)) {
                                    var355 = 1;
                                    var353 = var353.substring(class137.field2289.length());
                                } else if (var354.startsWith(class137.field2291)) {
                                    var355 = 2;
                                    var353 = var353.substring(class137.field2291.length());
                                } else if (var354.startsWith(class137.field2293)) {
                                    var355 = 3;
                                    var353 = var353.substring(class137.field2293.length());
                                } else if (var354.startsWith(class137.field2295)) {
                                    var355 = 4;
                                    var353 = var353.substring(class137.field2295.length());
                                } else if (var354.startsWith(class137.field2349)) {
                                    var355 = 5;
                                    var353 = var353.substring(class137.field2349.length());
                                } else if (var354.startsWith(class137.field2352)) {
                                    var355 = 6;
                                    var353 = var353.substring(class137.field2352.length());
                                } else if (var354.startsWith(class137.field2301)) {
                                    var355 = 7;
                                    var353 = var353.substring(class137.field2301.length());
                                } else if (var354.startsWith(class137.field2303)) {
                                    var355 = 8;
                                    var353 = var353.substring(class137.field2303.length());
                                } else if (var354.startsWith(class137.field2305)) {
                                    var355 = 9;
                                    var353 = var353.substring(class137.field2305.length());
                                } else if (var354.startsWith(class137.field2307)) {
                                    var355 = 10;
                                    var353 = var353.substring(class137.field2307.length());
                                } else if (var354.startsWith(class137.field2309)) {
                                    var355 = 11;
                                    var353 = var353.substring(class137.field2309.length());
                                } else if (client.field486 != 0) {
                                    if (var354.startsWith(class137.field2288)) {
                                        var355 = 0;
                                        var353 = var353.substring(class137.field2288.length());
                                    } else if (var354.startsWith(class137.field2277)) {
                                        var355 = 1;
                                        var353 = var353.substring(class137.field2277.length());
                                    } else if (var354.startsWith(class137.field2292)) {
                                        var355 = 2;
                                        var353 = var353.substring(class137.field2292.length());
                                    } else if (var354.startsWith(class137.field2261)) {
                                        var355 = 3;
                                        var353 = var353.substring(class137.field2261.length());
                                    } else if (var354.startsWith(class137.field2296)) {
                                        var355 = 4;
                                        var353 = var353.substring(class137.field2296.length());
                                    } else if (var354.startsWith(class137.field2177)) {
                                        var355 = 5;
                                        var353 = var353.substring(class137.field2177.length());
                                    } else if (var354.startsWith(class137.field2320)) {
                                        var355 = 6;
                                        var353 = var353.substring(class137.field2320.length());
                                    } else if (var354.startsWith(class137.field2302)) {
                                        var355 = 7;
                                        var353 = var353.substring(class137.field2302.length());
                                    } else if (var354.startsWith(class137.field2322)) {
                                        var355 = 8;
                                        var353 = var353.substring(class137.field2322.length());
                                    } else if (var354.startsWith(class137.field2283)) {
                                        var355 = 9;
                                        var353 = var353.substring(class137.field2283.length());
                                    } else if (var354.startsWith(class137.field2308)) {
                                        var355 = 10;
                                        var353 = var353.substring(class137.field2308.length());
                                    } else if (var354.startsWith(class137.field2151)) {
                                        var355 = 11;
                                        var353 = var353.substring(class137.field2151.length());
                                    }
                                }
                                String var356 = var353.toLowerCase();
                                byte var357 = 0;
                                if (var356.startsWith(class137.field2311)) {
                                    var357 = 1;
                                    var353 = var353.substring(class137.field2311.length());
                                } else if (var356.startsWith(class137.field2294)) {
                                    var357 = 2;
                                    var353 = var353.substring(class137.field2294.length());
                                } else if (var356.startsWith(class137.field2315)) {
                                    var357 = 3;
                                    var353 = var353.substring(class137.field2315.length());
                                } else if (var356.startsWith(class137.field2317)) {
                                    var357 = 4;
                                    var353 = var353.substring(class137.field2317.length());
                                } else if (var356.startsWith(class137.field2209)) {
                                    var357 = 5;
                                    var353 = var353.substring(class137.field2209.length());
                                } else if (client.field486 != 0) {
                                    if (var356.startsWith(class137.field2192)) {
                                        var357 = 1;
                                        var353 = var353.substring(class137.field2192.length());
                                    } else if (var356.startsWith(class137.field2314)) {
                                        var357 = 2;
                                        var353 = var353.substring(class137.field2314.length());
                                    } else if (var356.startsWith(class137.field2316)) {
                                        var357 = 3;
                                        var353 = var353.substring(class137.field2316.length());
                                    } else if (var356.startsWith(class137.field2318)) {
                                        var357 = 4;
                                        var353 = var353.substring(class137.field2318.length());
                                    } else if (var356.startsWith(class137.field2263)) {
                                        var357 = 5;
                                        var353 = var353.substring(class137.field2263.length());
                                    }
                                }
                                client.field689.method2335(213);
                                client.field689.method2449(0);
                                int var358 = client.field689.field2048;
                                client.field689.method2449(var355);
                                client.field689.method2449(var357);
                                class186.method2054(client.field689, var353);
                                client.field689.method2460(client.field689.field2048 - var358);
                            }
                            continue;
                        }
                        if (var371 == 5009) {
                            var6 -= 2;
                            String var359 = field409[var6];
                            String var360 = field409[var6 + 1];
                            client.field689.method2335(221);
                            client.field689.method2529(0);
                            int var361 = client.field689.field2048;
                            client.field689.method2454(var359);
                            class186.method2054(client.field689, var360);
                            client.field689.method2459(client.field689.field2048 - var361);
                            continue;
                        }
                        if (var371 == 5010) {
                            var5--;
                            int var362 = field408[var5];
                            String var363 = null;
                            if (var362 < 100) {
                                var363 = client.field692[var362];
                            }
                            if (var363 == null) {
                                var363 = "";
                            }
                            field409[var6++] = var363;
                            continue;
                        }
                        if (var371 == 5011) {
                            var5--;
                            int var364 = field408[var5];
                            String var365 = null;
                            if (var364 < 100) {
                                var365 = client.field710[var364];
                            }
                            if (var365 == null) {
                                var365 = "";
                            }
                            field409[var6++] = var365;
                            continue;
                        }
                        if (var371 == 5015) {
                            String var366;
                            if (Statics.field1683 == null || Statics.field1683.field47 == null) {
                                var366 = "";
                            } else {
                                var366 = Statics.field1683.field47;
                            }
                            field409[var6++] = var366;
                            continue;
                        }
                        if (var371 == 5016) {
                            field408[var5++] = client.field607;
                            continue;
                        }
                        if (var371 == 5017) {
                            field408[var5++] = client.field695;
                            continue;
                        }
                    }
                } else {
                    class161 var64;
                    if (var371 >= 2000) {
                        var371 -= 1000;
                        var5--;
                        var64 = class161.method3039(field408[var5]);
                    } else {
                        var64 = var41 ? Statics.field412 : Statics.field187;
                    }
                    if (var371 == 1300) {
                        var5--;
                        int var65 = field408[var5] - 1;
                        if (var65 >= 0 && var65 <= 9) {
                            var6--;
                            var64.method3185(var65, field409[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var371 == 1301) {
                        var5 -= 2;
                        int var66 = field408[var5];
                        int var67 = field408[var5 + 1];
                        var64.field2681 = class161.method2331(var66, var67);
                        continue;
                    }
                    if (var371 == 1302) {
                        var5--;
                        var64.field2684 = field408[var5] == 1;
                        continue;
                    }
                    if (var371 == 1303) {
                        var5--;
                        var64.field2682 = field408[var5];
                        continue;
                    }
                    if (var371 == 1304) {
                        var5--;
                        var64.field2683 = field408[var5];
                        continue;
                    }
                    if (var371 == 1305) {
                        var6--;
                        var64.field2672 = field409[var6];
                        continue;
                    }
                    if (var371 == 1306) {
                        var6--;
                        var64.field2633 = field409[var6];
                        continue;
                    }
                    if (var371 == 1307) {
                        var64.field2610 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var370) {
            StringBuilder var368 = new StringBuilder(30);
            var368.append("").append(var4.field2839).append(" ");
            for (int var369 = field410 - 1; var369 >= 0; var369--) {
                var368.append("").append(field404[var369].field264.field2839).append(" ");
            }
            var368.append("").append(var10);
            class81.method3159(var368.toString(), var370);
        }
    }

    @ObfuscatedName("ba.r(II)V")
    public static void method1230(int arg0) {
        if (arg0 == -1 || !class161.method199(arg0)) {
            return;
        }
        class161[] var1 = Statics.field2626[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class161 var3 = var1[var2];
            if (var3.field2688 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field6 = var3.field2688;
                method25(var4, 2000000);
            }
        }
    }
}
