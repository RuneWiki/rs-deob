package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("al")
public class class33 {

    @ObfuscatedName("al.r")
    public static int[] field698 = new int[5];

    @ObfuscatedName("al.f")
    public static int[][] field690 = new int[5][5000];

    @ObfuscatedName("al.z")
    public static int[] field691 = new int[1000];

    @ObfuscatedName("al.o")
    public static String[] field692 = new String[1000];

    @ObfuscatedName("al.k")
    public static int field693 = 0;

    @ObfuscatedName("al.s")
    public static class13[] field694 = new class13[50];

    @ObfuscatedName("al.w")
    public static Calendar field688 = Calendar.getInstance();

    @ObfuscatedName("al.q")
    public static final String[] field696 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.p(Lp;B)V")
    public static void method131(class1 arg0) {
        method2474(arg0, 200000);
    }

    @ObfuscatedName("di.y(Lp;IB)V")
    public static void method2474(class1 arg0, int arg1) {
        Object[] var2 = arg0.field5;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method3179(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field509;
        int[] var9 = var4.field511;
        byte var10 = -1;
        field693 = 0;
        try {
            Statics.field2838 = new int[var4.field513];
            int var11 = 0;
            Statics.field674 = new String[var4.field514];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2622;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2550;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2622;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2550;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field2838[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field674[var12++] = var15;
                }
            }
            int var16 = 0;
            label2793: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var433 = var8[var7];
                if (var433 < 100) {
                    if (var433 == 0) {
                        field691[var5++] = var9[var7];
                        continue;
                    }
                    if (var433 == 1) {
                        int var17 = var9[var7];
                        field691[var5++] = class159.field2680[var17];
                        continue;
                    }
                    if (var433 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class159.field2680[var18] = field691[var5];
                        client.method1893(var18);
                        continue;
                    }
                    if (var433 == 3) {
                        field692[var6++] = var4.field512[var7];
                        continue;
                    }
                    if (var433 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var433 == 7) {
                        var5 -= 2;
                        if (field691[var5 + 1] != field691[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var433 == 8) {
                        var5 -= 2;
                        if (field691[var5 + 1] == field691[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var433 == 9) {
                        var5 -= 2;
                        if (field691[var5] < field691[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var433 == 10) {
                        var5 -= 2;
                        if (field691[var5] > field691[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var433 == 21) {
                        if (field693 == 0) {
                            return;
                        }
                        class13 var19 = field694[--field693];
                        var4 = var19.field172;
                        var8 = var4.field509;
                        var9 = var4.field511;
                        var7 = var19.field168;
                        Statics.field2838 = var19.field167;
                        Statics.field674 = var19.field169;
                        continue;
                    }
                    if (var433 == 25) {
                        int var20 = var9[var7];
                        field691[var5++] = class159.method2859(var20);
                        continue;
                    }
                    if (var433 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class159.method1043(var21, field691[var5]);
                        continue;
                    }
                    if (var433 == 31) {
                        var5 -= 2;
                        if (field691[var5] <= field691[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var433 == 32) {
                        var5 -= 2;
                        if (field691[var5] >= field691[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var433 == 33) {
                        field691[var5++] = Statics.field2838[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var433 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2838[var10001] = field691[var5];
                        continue;
                    }
                    if (var433 == 35) {
                        field692[var6++] = Statics.field674[var9[var7]];
                        continue;
                    }
                    if (var433 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field674[var10001] = field692[var6];
                        continue;
                    }
                    if (var433 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field692;
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
                        field692[var6++] = var24;
                        continue;
                    }
                    if (var433 == 38) {
                        var5--;
                        continue;
                    }
                    if (var433 == 39) {
                        var6--;
                        continue;
                    }
                    if (var433 == 40) {
                        int var34 = var9[var7];
                        class19 var35 = class19.method3179(var34);
                        int[] var36 = new int[var35.field513];
                        String[] var37 = new String[var35.field514];
                        for (int var38 = 0; var38 < var35.field510; var38++) {
                            var36[var38] = field691[var5 - var35.field510 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field515; var39++) {
                            var37[var39] = field692[var6 - var35.field515 + var39];
                        }
                        var5 -= var35.field510;
                        var6 -= var35.field515;
                        class13 var40 = new class13();
                        var40.field172 = var4;
                        var40.field168 = var7;
                        var40.field167 = Statics.field2838;
                        var40.field169 = Statics.field674;
                        field694[++field693 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field509;
                        var9 = var35.field511;
                        var7 = -1;
                        Statics.field2838 = var36;
                        Statics.field674 = var37;
                        continue;
                    }
                    if (var433 == 42) {
                        field691[var5++] = client.field400[var9[var7]];
                        continue;
                    }
                    if (var433 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field400[var10001] = field691[var5];
                        continue;
                    }
                    if (var433 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field691[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field698[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2793;
                                }
                                field690[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var433 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field691[var5];
                        if (var47 >= 0 && var47 < field698[var46]) {
                            field691[var5++] = field690[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var433 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field691[var5];
                        if (var49 >= 0 && var49 < field698[var48]) {
                            field690[var48][var49] = field691[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var433 == 47) {
                        String var50 = client.field433[var9[var7]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field692[var6++] = var50;
                        continue;
                    }
                    if (var433 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field433[var10001] = field692[var6];
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var433 < 1000) {
                    if (var433 == 100) {
                        var5 -= 3;
                        int var52 = field691[var5];
                        int var53 = field691[var5 + 1];
                        int var54 = field691[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class157 var55 = class157.method2872(var52);
                        if (var55.field2660 == null) {
                            var55.field2660 = new class157[var54 + 1];
                        }
                        if (var55.field2660.length <= var54) {
                            class157[] var56 = new class157[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2660.length; var57++) {
                                var56[var57] = var55.field2660[var57];
                            }
                            var55.field2660 = var56;
                        }
                        if (var54 > 0 && var55.field2660[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class157 var58 = new class157();
                        var58.field2551 = var53;
                        var58.field2608 = var58.field2622 = var55.field2622;
                        var58.field2550 = var54;
                        var58.field2592 = true;
                        var55.field2660[var54] = var58;
                        if (var51) {
                            Statics.field2691 = var58;
                        } else {
                            Statics.field558 = var58;
                        }
                        client.method3177(var55);
                        continue;
                    }
                    if (var433 == 101) {
                        class157 var59 = var51 ? Statics.field2691 : Statics.field558;
                        class157 var60 = class157.method2872(var59.field2622);
                        var60.field2660[var59.field2550] = null;
                        client.method3177(var60);
                        continue;
                    }
                    if (var433 == 102) {
                        var5--;
                        class157 var61 = class157.method2872(field691[var5]);
                        var61.field2660 = null;
                        client.method3177(var61);
                        continue;
                    }
                    if (var433 == 200) {
                        var5 -= 2;
                        int var62 = field691[var5];
                        int var63 = field691[var5 + 1];
                        class157 var64 = class157.method2707(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field691[var5++] = 1;
                            if (var51) {
                                Statics.field2691 = var64;
                            } else {
                                Statics.field558 = var64;
                            }
                            continue;
                        }
                        field691[var5++] = 0;
                        continue;
                    }
                } else if (var433 >= 1000 && var433 < 1100 || var433 >= 2000 && var433 < 2100) {
                    class157 var65;
                    if (var433 >= 2000) {
                        var433 -= 1000;
                        var5--;
                        var65 = class157.method2872(field691[var5]);
                    } else {
                        var65 = var51 ? Statics.field2691 : Statics.field558;
                    }
                    if (var433 == 1000) {
                        var5 -= 2;
                        var65.field2639 = field691[var5];
                        var65.field2576 = field691[var5 + 1];
                        client.method3177(var65);
                        continue;
                    }
                    if (var433 == 1001) {
                        var5 -= 2;
                        var65.field2577 = field691[var5];
                        var65.field2559 = field691[var5 + 1];
                        client.method3177(var65);
                        continue;
                    }
                    if (var433 == 1003) {
                        var5--;
                        boolean var66 = field691[var5] == 1;
                        if (var65.field2561 != var66) {
                            var65.field2561 = var66;
                            client.method3177(var65);
                        }
                        continue;
                    }
                } else if (!(var433 < 1100 || var433 >= 1200) || !(var433 < 2100 || var433 >= 2200)) {
                    class157 var67;
                    if (var433 >= 2000) {
                        var433 -= 1000;
                        var5--;
                        var67 = class157.method2872(field691[var5]);
                    } else {
                        var67 = var51 ? Statics.field2691 : Statics.field558;
                    }
                    if (var433 == 1100) {
                        var5 -= 2;
                        var67.field2562 = field691[var5];
                        if (var67.field2562 > var67.field2564 - var67.field2577) {
                            var67.field2562 = var67.field2564 - var67.field2577;
                        }
                        if (var67.field2562 < 0) {
                            var67.field2562 = 0;
                        }
                        var67.field2563 = field691[var5 + 1];
                        if (var67.field2563 > var67.field2565 - var67.field2559) {
                            var67.field2563 = var67.field2565 - var67.field2559;
                        }
                        if (var67.field2563 < 0) {
                            var67.field2563 = 0;
                        }
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1101) {
                        var5--;
                        var67.field2566 = field691[var5];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1102) {
                        var5--;
                        var67.field2570 = field691[var5] == 1;
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1103) {
                        var5--;
                        var67.field2600 = field691[var5];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1104) {
                        var5--;
                        var67.field2572 = field691[var5];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1105) {
                        var5--;
                        var67.field2573 = field691[var5];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1106) {
                        var5--;
                        var67.field2602 = field691[var5];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1107) {
                        var5--;
                        var67.field2609 = field691[var5] == 1;
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1108) {
                        var67.field2581 = 1;
                        var5--;
                        var67.field2582 = field691[var5];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1109) {
                        var5 -= 6;
                        var67.field2587 = field691[var5];
                        var67.field2588 = field691[var5 + 1];
                        var67.field2589 = field691[var5 + 2];
                        var67.field2604 = field691[var5 + 3];
                        var67.field2567 = field691[var5 + 4];
                        var67.field2651 = field691[var5 + 5];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1110) {
                        var5--;
                        int var68 = field691[var5];
                        if (var67.field2585 != var68) {
                            var67.field2585 = var68;
                            var67.field2619 = 0;
                            var67.field2601 = 0;
                            client.method3177(var67);
                        }
                        continue;
                    }
                    if (var433 == 1111) {
                        var5--;
                        var67.field2594 = field691[var5] == 1;
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1112) {
                        var6--;
                        String var69 = field692[var6];
                        if (!var69.equals(var67.field2597)) {
                            var67.field2597 = var69;
                            client.method3177(var67);
                        }
                        continue;
                    }
                    if (var433 == 1113) {
                        var5--;
                        var67.field2596 = field691[var5];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1114) {
                        var5 -= 3;
                        var67.field2624 = field691[var5];
                        var67.field2611 = field691[var5 + 1];
                        var67.field2623 = field691[var5 + 2];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1115) {
                        var5--;
                        var67.field2621 = field691[var5] == 1;
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1116) {
                        var5--;
                        var67.field2555 = field691[var5];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1117) {
                        var5--;
                        var67.field2578 = field691[var5];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1118) {
                        var5--;
                        var67.field2558 = field691[var5] == 1;
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1119) {
                        var5--;
                        var67.field2580 = field691[var5] == 1;
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1120) {
                        var5 -= 2;
                        var67.field2564 = field691[var5];
                        var67.field2565 = field691[var5 + 1];
                        client.method3177(var67);
                        continue;
                    }
                    if (var433 == 1121) {
                        client.method811(var67.field2622, var67.field2550);
                        client.field399 = var67;
                        client.method3177(var67);
                        continue;
                    }
                } else if (!(var433 < 1200 || var433 >= 1300) || !(var433 < 2200 || var433 >= 2300)) {
                    class157 var70;
                    if (var433 >= 2000) {
                        var433 -= 1000;
                        var5--;
                        var70 = class157.method2872(field691[var5]);
                    } else {
                        var70 = var51 ? Statics.field2691 : Statics.field558;
                    }
                    client.method3177(var70);
                    if (var433 == 1200 || var433 == 1205 || var433 == 1212) {
                        var5 -= 2;
                        int var71 = field691[var5];
                        int var72 = field691[var5 + 1];
                        var70.field2656 = var71;
                        var70.field2657 = var72;
                        class46 var73 = Statics.method607(var71);
                        var70.field2589 = var73.field1041;
                        var70.field2604 = var73.field1005;
                        var70.field2567 = var73.field1006;
                        var70.field2587 = var73.field1019;
                        var70.field2588 = var73.field1004;
                        var70.field2651 = var73.field1003;
                        if (var433 == 1205) {
                            var70.field2595 = 0;
                        } else if (var433 == 1212 | var73.field1009 == 1) {
                            var70.field2595 = 1;
                        } else {
                            var70.field2595 = 2;
                        }
                        if (var70.field2577 > 0) {
                            var70.field2651 = var70.field2651 * 32 / var70.field2577;
                        }
                        continue;
                    }
                    if (var433 == 1201) {
                        var70.field2581 = 2;
                        var5--;
                        var70.field2582 = field691[var5];
                        continue;
                    }
                    if (var433 == 1202) {
                        var70.field2581 = 3;
                        var70.field2582 = Statics.field2498.field31.method2955();
                        continue;
                    }
                } else if ((var433 < 1300 || var433 >= 1400) && (var433 < 2300 || var433 >= 2400)) {
                    if (var433 >= 1400 && var433 < 1500 || var433 >= 2400 && var433 < 2500) {
                        class157 var78;
                        if (var433 >= 2000) {
                            var433 -= 1000;
                            var5--;
                            var78 = class157.method2872(field691[var5]);
                        } else {
                            var78 = var51 ? Statics.field2691 : Statics.field558;
                        }
                        var6--;
                        String var79 = field692[var6];
                        int[] var80 = null;
                        if (var79.length() > 0 && var79.charAt(var79.length() - 1) == 'Y') {
                            var5--;
                            int var81 = field691[var5];
                            if (var81 > 0) {
                                var80 = new int[var81];
                                while (var81-- > 0) {
                                    var5--;
                                    var80[var81] = field691[var5];
                                }
                            }
                            var79 = var79.substring(0, var79.length() - 1);
                        }
                        Object[] var82 = new Object[var79.length() + 1];
                        for (int var83 = var82.length - 1; var83 >= 1; var83--) {
                            if (var79.charAt(var83 - 1) == 's') {
                                var6--;
                                var82[var83] = field692[var6];
                            } else {
                                var5--;
                                var82[var83] = Integer.valueOf(field691[var5]);
                            }
                        }
                        var5--;
                        int var84 = field691[var5];
                        if (var84 == -1) {
                            var82 = null;
                        } else {
                            var82[0] = Integer.valueOf(var84);
                        }
                        if (var433 == 1400) {
                            var78.field2615 = var82;
                        }
                        if (var433 == 1401) {
                            var78.field2603 = var82;
                        }
                        if (var433 == 1402) {
                            var78.field2554 = var82;
                        }
                        if (var433 == 1403) {
                            var78.field2553 = var82;
                        }
                        if (var433 == 1404) {
                            var78.field2627 = var82;
                        }
                        if (var433 == 1405) {
                            var78.field2626 = var82;
                        }
                        if (var433 == 1406) {
                            var78.field2629 = var82;
                        }
                        if (var433 == 1407) {
                            var78.field2630 = var82;
                            var78.field2631 = var80;
                        }
                        if (var433 == 1408) {
                            var78.field2636 = var82;
                        }
                        if (var433 == 1409) {
                            var78.field2556 = var82;
                        }
                        if (var433 == 1410) {
                            var78.field2552 = var82;
                        }
                        if (var433 == 1411) {
                            var78.field2620 = var82;
                        }
                        if (var433 == 1412) {
                            var78.field2642 = var82;
                        }
                        if (var433 == 1414) {
                            var78.field2632 = var82;
                            var78.field2633 = var80;
                        }
                        if (var433 == 1415) {
                            var78.field2634 = var82;
                            var78.field2635 = var80;
                        }
                        if (var433 == 1416) {
                            var78.field2649 = var82;
                        }
                        if (var433 == 1417) {
                            var78.field2546 = var82;
                        }
                        if (var433 == 1418) {
                            var78.field2571 = var82;
                        }
                        if (var433 == 1419) {
                            var78.field2640 = var82;
                        }
                        if (var433 == 1420) {
                            var78.field2625 = var82;
                        }
                        if (var433 == 1421) {
                            var78.field2666 = var82;
                        }
                        if (var433 == 1422) {
                            var78.field2643 = var82;
                        }
                        if (var433 == 1423) {
                            var78.field2644 = var82;
                        }
                        if (var433 == 1424) {
                            var78.field2560 = var82;
                        }
                        if (var433 == 1425) {
                            var78.field2646 = var82;
                        }
                        if (var433 == 1426) {
                            var78.field2647 = var82;
                        }
                        var78.field2590 = true;
                        continue;
                    }
                    if (var433 < 1600) {
                        class157 var85 = var51 ? Statics.field2691 : Statics.field558;
                        if (var433 == 1500) {
                            field691[var5++] = var85.field2639;
                            continue;
                        }
                        if (var433 == 1501) {
                            field691[var5++] = var85.field2576;
                            continue;
                        }
                        if (var433 == 1502) {
                            field691[var5++] = var85.field2577;
                            continue;
                        }
                        if (var433 == 1503) {
                            field691[var5++] = var85.field2559;
                            continue;
                        }
                        if (var433 == 1504) {
                            field691[var5++] = var85.field2561 ? 1 : 0;
                            continue;
                        }
                        if (var433 == 1505) {
                            field691[var5++] = var85.field2608;
                            continue;
                        }
                    } else if (var433 < 1700) {
                        class157 var86 = var51 ? Statics.field2691 : Statics.field558;
                        if (var433 == 1600) {
                            field691[var5++] = var86.field2562;
                            continue;
                        }
                        if (var433 == 1601) {
                            field691[var5++] = var86.field2563;
                            continue;
                        }
                        if (var433 == 1602) {
                            field692[var6++] = var86.field2597;
                            continue;
                        }
                        if (var433 == 1603) {
                            field691[var5++] = var86.field2564;
                            continue;
                        }
                        if (var433 == 1604) {
                            field691[var5++] = var86.field2565;
                            continue;
                        }
                        if (var433 == 1605) {
                            field691[var5++] = var86.field2651;
                            continue;
                        }
                        if (var433 == 1606) {
                            field691[var5++] = var86.field2589;
                            continue;
                        }
                        if (var433 == 1607) {
                            field691[var5++] = var86.field2567;
                            continue;
                        }
                        if (var433 == 1608) {
                            field691[var5++] = var86.field2604;
                            continue;
                        }
                        if (var433 == 1609) {
                            field691[var5++] = var86.field2600;
                            continue;
                        }
                    } else if (var433 < 1800) {
                        class157 var87 = var51 ? Statics.field2691 : Statics.field558;
                        if (var433 == 1700) {
                            field691[var5++] = var87.field2656;
                            continue;
                        }
                        if (var433 == 1701) {
                            if (var87.field2656 == -1) {
                                field691[var5++] = 0;
                            } else {
                                field691[var5++] = var87.field2657;
                            }
                            continue;
                        }
                        if (var433 == 1702) {
                            field691[var5++] = var87.field2550;
                            continue;
                        }
                    } else if (var433 < 1900) {
                        class157 var88 = var51 ? Statics.field2691 : Statics.field558;
                        if (var433 == 1800) {
                            int[] var89 = field691;
                            int var90 = var5++;
                            int var91 = client.method838(var88);
                            int var92 = var91 >> 11 & 0x3F;
                            var89[var90] = var92;
                            continue;
                        }
                        if (var433 == 1801) {
                            var5--;
                            int var93 = field691[var5];
                            int var434 = var93 - 1;
                            if (var88.field2628 != null && var434 < var88.field2628.length && var88.field2628[var434] != null) {
                                field692[var6++] = var88.field2628[var434];
                                continue;
                            }
                            field692[var6++] = "";
                            continue;
                        }
                        if (var433 == 1802) {
                            if (var88.field2610 == null) {
                                field692[var6++] = "";
                            } else {
                                field692[var6++] = var88.field2610;
                            }
                            continue;
                        }
                    } else if (var433 < 2600) {
                        var5--;
                        class157 var94 = class157.method2872(field691[var5]);
                        if (var433 == 2500) {
                            field691[var5++] = var94.field2639;
                            continue;
                        }
                        if (var433 == 2501) {
                            field691[var5++] = var94.field2576;
                            continue;
                        }
                        if (var433 == 2502) {
                            field691[var5++] = var94.field2577;
                            continue;
                        }
                        if (var433 == 2503) {
                            field691[var5++] = var94.field2559;
                            continue;
                        }
                        if (var433 == 2504) {
                            field691[var5++] = var94.field2561 ? 1 : 0;
                            continue;
                        }
                        if (var433 == 2505) {
                            field691[var5++] = var94.field2608;
                            continue;
                        }
                    } else if (var433 < 2700) {
                        var5--;
                        class157 var95 = class157.method2872(field691[var5]);
                        if (var433 == 2600) {
                            field691[var5++] = var95.field2562;
                            continue;
                        }
                        if (var433 == 2601) {
                            field691[var5++] = var95.field2563;
                            continue;
                        }
                        if (var433 == 2602) {
                            field692[var6++] = var95.field2597;
                            continue;
                        }
                        if (var433 == 2603) {
                            field691[var5++] = var95.field2564;
                            continue;
                        }
                        if (var433 == 2604) {
                            field691[var5++] = var95.field2565;
                            continue;
                        }
                        if (var433 == 2605) {
                            field691[var5++] = var95.field2651;
                            continue;
                        }
                        if (var433 == 2606) {
                            field691[var5++] = var95.field2589;
                            continue;
                        }
                        if (var433 == 2607) {
                            field691[var5++] = var95.field2567;
                            continue;
                        }
                        if (var433 == 2608) {
                            field691[var5++] = var95.field2604;
                            continue;
                        }
                        if (var433 == 2609) {
                            field691[var5++] = var95.field2600;
                            continue;
                        }
                    } else if (var433 < 2800) {
                        if (var433 == 2700) {
                            var5--;
                            class157 var96 = class157.method2872(field691[var5]);
                            field691[var5++] = var96.field2656;
                            continue;
                        }
                        if (var433 == 2701) {
                            var5--;
                            class157 var97 = class157.method2872(field691[var5]);
                            if (var97.field2656 == -1) {
                                field691[var5++] = 0;
                            } else {
                                field691[var5++] = var97.field2657;
                            }
                            continue;
                        }
                        if (var433 == 2702) {
                            var5--;
                            int var98 = field691[var5];
                            class4 var99 = (class4) client.field396.method3224((long) var98);
                            if (var99 == null) {
                                field691[var5++] = 0;
                            } else {
                                field691[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var433 < 2900) {
                        var5--;
                        class157 var100 = class157.method2872(field691[var5]);
                        if (var433 == 2800) {
                            int[] var101 = field691;
                            int var102 = var5++;
                            int var103 = client.method838(var100);
                            int var104 = var103 >> 11 & 0x3F;
                            var101[var102] = var104;
                            continue;
                        }
                        if (var433 == 2801) {
                            var5--;
                            int var105 = field691[var5];
                            int var435 = var105 - 1;
                            if (var100.field2628 != null && var435 < var100.field2628.length && var100.field2628[var435] != null) {
                                field692[var6++] = var100.field2628[var435];
                                continue;
                            }
                            field692[var6++] = "";
                            continue;
                        }
                        if (var433 == 2802) {
                            if (var100.field2610 == null) {
                                field692[var6++] = "";
                            } else {
                                field692[var6++] = var100.field2610;
                            }
                            continue;
                        }
                    } else if (var433 < 3200) {
                        if (var433 == 3100) {
                            var6--;
                            String var106 = field692[var6];
                            class10.method616(0, "", var106);
                            continue;
                        }
                        if (var433 == 3101) {
                            var5 -= 2;
                            client.method164(Statics.field2498, field691[var5], field691[var5 + 1]);
                            continue;
                        }
                        if (var433 == 3103) {
                            client.field275.method2367(145);
                            for (class4 var107 = (class4) client.field396.method3227(); var107 != null; var107 = (class4) client.field396.method3228()) {
                                if (var107.field58 == 0 || var107.field58 == 3) {
                                    client.method549(var107, true);
                                }
                            }
                            if (client.field399 != null) {
                                client.method3177(client.field399);
                                client.field399 = null;
                            }
                            continue;
                        }
                        if (var433 == 3104) {
                            var6--;
                            String var108 = field692[var6];
                            int var109 = 0;
                            boolean var110 = false;
                            boolean var111 = false;
                            int var112 = 0;
                            int var113 = var108.length();
                            int var114 = 0;
                            boolean var116;
                            while (true) {
                                if (var114 >= var113) {
                                    var116 = var111;
                                    break;
                                }
                                label3039: {
                                    char var115 = var108.charAt(var114);
                                    if (var114 == 0) {
                                        if (var115 == '-') {
                                            var110 = true;
                                            break label3039;
                                        }
                                        if (var115 == '+') {
                                            break label3039;
                                        }
                                    }
                                    int var436;
                                    if (var115 >= '0' && var115 <= '9') {
                                        var436 = var115 - '0';
                                    } else if (var115 >= 'A' && var115 <= 'Z') {
                                        var436 = var115 - '7';
                                    } else {
                                        if (var115 < 'a' || var115 > 'z') {
                                            var116 = false;
                                            break;
                                        }
                                        var436 = var115 - 'W';
                                    }
                                    if (var436 >= 10) {
                                        var116 = false;
                                        break;
                                    }
                                    if (var110) {
                                        var436 = -var436;
                                    }
                                    int var117 = var112 * 10 + var436;
                                    if (var117 / 10 != var112) {
                                        var116 = false;
                                        break;
                                    }
                                    var112 = var117;
                                    var111 = true;
                                }
                                var114++;
                            }
                            if (var116) {
                                int var119 = class213.method2826(var108, 10, true);
                                var109 = var119;
                            }
                            client.field275.method2367(98);
                            client.field275.method2113(var109);
                            continue;
                        }
                        if (var433 == 3105) {
                            var6--;
                            String var120 = field692[var6];
                            client.field275.method2367(24);
                            client.field275.method2110(var120.length() + 1);
                            client.field275.method2314(var120);
                            continue;
                        }
                        if (var433 == 3106) {
                            var6--;
                            String var121 = field692[var6];
                            client.field275.method2367(66);
                            client.field275.method2110(var121.length() + 1);
                            client.field275.method2314(var121);
                            continue;
                        }
                        if (var433 == 3107) {
                            var5--;
                            int var122 = field691[var5];
                            var6--;
                            String var123 = field692[var6];
                            boolean var124 = false;
                            for (int var125 = 0; var125 < client.field354; var125++) {
                                class3 var126 = client.field276[client.field355[var125]];
                                if (var126 != null && var126.field43 != null && var126.field43.equalsIgnoreCase(var123)) {
                                    if (var122 == 1) {
                                        client.field275.method2367(220);
                                        client.field275.method2154(client.field355[var125]);
                                        client.field275.method2110(0);
                                    } else if (var122 == 4) {
                                        client.field275.method2367(122);
                                        client.field275.method2129(client.field355[var125]);
                                        client.field275.method2146(0);
                                    } else if (var122 == 6) {
                                        client.field275.method2367(102);
                                        client.field275.method2147(0);
                                        client.field275.method2154(client.field355[var125]);
                                    } else if (var122 == 7) {
                                        client.field275.method2367(120);
                                        client.field275.method2129(client.field355[var125]);
                                        client.field275.method2219(0);
                                    }
                                    var124 = true;
                                    break;
                                }
                            }
                            if (!var124) {
                                class10.method616(4, "", class147.field2368 + var123);
                            }
                            continue;
                        }
                        if (var433 == 3108) {
                            var5 -= 3;
                            int var127 = field691[var5];
                            int var128 = field691[var5 + 1];
                            int var129 = field691[var5 + 2];
                            class157 var130 = class157.method2872(var129);
                            client.method168(var130, var127, var128);
                            continue;
                        }
                        if (var433 == 3109) {
                            var5 -= 2;
                            int var131 = field691[var5];
                            int var132 = field691[var5 + 1];
                            class157 var133 = var51 ? Statics.field2691 : Statics.field558;
                            client.method168(var133, var131, var132);
                            continue;
                        }
                        if (var433 == 3110) {
                            var5--;
                            Statics.field1271 = field691[var5] == 1;
                            continue;
                        }
                        if (var433 == 3111) {
                            field691[var5++] = Statics.field1993.field126 ? 1 : 0;
                            continue;
                        }
                        if (var433 == 3112) {
                            var5--;
                            Statics.field1993.field126 = field691[var5] == 1;
                            class9.method3364();
                            continue;
                        }
                        if (var433 == 3113) {
                            var6--;
                            String var134 = field692[var6];
                            var5--;
                            boolean var135 = field691[var5] == 1;
                            class129.method2743(var134, var135, false);
                            continue;
                        }
                        if (var433 == 3115) {
                            var5--;
                            int var136 = field691[var5];
                            client.field275.method2367(232);
                            client.field275.method2111(var136);
                            continue;
                        }
                    } else if (var433 < 3300) {
                        if (var433 == 3200) {
                            var5 -= 3;
                            client.method2435(field691[var5], field691[var5 + 1], field691[var5 + 2]);
                            continue;
                        }
                        if (var433 == 3201) {
                            var5--;
                            int var137 = field691[var5];
                            if (var137 == -1 && !client.field472) {
                                class166.method503();
                            } else if (var137 != -1 && client.field469 != var137 && client.field470 != 0 && !client.field472) {
                                class166.method1890(2, Statics.field1928, var137, 0, client.field470, false);
                            }
                            client.field469 = var137;
                            continue;
                        }
                        if (var433 == 3202) {
                            var5 -= 2;
                            int var138 = field691[var5];
                            int var10000 = field691[var5 + 1];
                            if (client.field470 != 0 && var138 != -1) {
                                class166.method812(Statics.field266, var138, 0, client.field470, false);
                                client.field472 = true;
                            }
                            continue;
                        }
                    } else if (var433 < 3400) {
                        if (var433 == 3300) {
                            field691[var5++] = client.field243;
                            continue;
                        }
                        if (var433 == 3301) {
                            var5 -= 2;
                            int var140 = field691[var5];
                            int var141 = field691[var5 + 1];
                            field691[var5++] = class14.method2406(var140, var141);
                            continue;
                        }
                        if (var433 == 3302) {
                            var5 -= 2;
                            int var142 = field691[var5];
                            int var143 = field691[var5 + 1];
                            field691[var5++] = class14.method497(var142, var143);
                            continue;
                        }
                        if (var433 == 3303) {
                            var5 -= 2;
                            int var144 = field691[var5];
                            int var145 = field691[var5 + 1];
                            int[] var146 = field691;
                            int var147 = var5++;
                            class14 var148 = (class14) class14.field180.method3224((long) var144);
                            int var149;
                            if (var148 == null) {
                                var149 = 0;
                            } else if (var145 == -1) {
                                var149 = 0;
                            } else {
                                int var150 = 0;
                                for (int var151 = 0; var151 < var148.field181.length; var151++) {
                                    if (var148.field178[var151] == var145) {
                                        var150 += var148.field181[var151];
                                    }
                                }
                                var149 = var150;
                            }
                            var146[var147] = var149;
                            continue;
                        }
                        if (var433 == 3304) {
                            var5--;
                            int var152 = field691[var5];
                            field691[var5++] = class45.method543(var152).field979;
                            continue;
                        }
                        if (var433 == 3305) {
                            var5--;
                            int var153 = field691[var5];
                            field691[var5++] = client.field372[var153];
                            continue;
                        }
                        if (var433 == 3306) {
                            var5--;
                            int var154 = field691[var5];
                            field691[var5++] = client.field373[var154];
                            continue;
                        }
                        if (var433 == 3307) {
                            var5--;
                            int var155 = field691[var5];
                            field691[var5++] = client.field293[var155];
                            continue;
                        }
                        if (var433 == 3308) {
                            int var156 = Statics.field1082;
                            int var157 = (Statics.field2498.field746 >> 7) + Statics.field24;
                            int var158 = (Statics.field2498.field752 >> 7) + Statics.field1047;
                            field691[var5++] = (var156 << 28) + (var157 << 14) + var158;
                            continue;
                        }
                        if (var433 == 3309) {
                            var5--;
                            int var159 = field691[var5];
                            field691[var5++] = var159 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var433 == 3310) {
                            var5--;
                            int var160 = field691[var5];
                            field691[var5++] = var160 >> 28;
                            continue;
                        }
                        if (var433 == 3311) {
                            var5--;
                            int var161 = field691[var5];
                            field691[var5++] = var161 & 0x3FFF;
                            continue;
                        }
                        if (var433 == 3312) {
                            field691[var5++] = client.field250 ? 1 : 0;
                            continue;
                        }
                        if (var433 == 3313) {
                            var5 -= 2;
                            int var162 = field691[var5] + 32768;
                            int var163 = field691[var5 + 1];
                            field691[var5++] = class14.method2406(var162, var163);
                            continue;
                        }
                        if (var433 == 3314) {
                            var5 -= 2;
                            int var164 = field691[var5] + 32768;
                            int var165 = field691[var5 + 1];
                            field691[var5++] = class14.method497(var164, var165);
                            continue;
                        }
                        if (var433 == 3315) {
                            var5 -= 2;
                            int var166 = field691[var5] + 32768;
                            int var167 = field691[var5 + 1];
                            int[] var168 = field691;
                            int var169 = var5++;
                            class14 var170 = (class14) class14.field180.method3224((long) var166);
                            int var171;
                            if (var170 == null) {
                                var171 = 0;
                            } else if (var167 == -1) {
                                var171 = 0;
                            } else {
                                int var172 = 0;
                                for (int var173 = 0; var173 < var170.field181.length; var173++) {
                                    if (var170.field178[var173] == var167) {
                                        var172 += var170.field181[var173];
                                    }
                                }
                                var171 = var172;
                            }
                            var168[var169] = var171;
                            continue;
                        }
                        if (var433 == 3316) {
                            if (client.field402 >= 2) {
                                field691[var5++] = client.field402;
                            } else {
                                field691[var5++] = 0;
                            }
                            continue;
                        }
                        if (var433 == 3317) {
                            field691[var5++] = client.field312;
                            continue;
                        }
                        if (var433 == 3318) {
                            field691[var5++] = client.field269;
                            continue;
                        }
                        if (var433 == 3321) {
                            field691[var5++] = client.field323;
                            continue;
                        }
                        if (var433 == 3322) {
                            field691[var5++] = client.field401;
                            continue;
                        }
                        if (var433 == 3323) {
                            if (client.field404) {
                                field691[var5++] = 1;
                            } else {
                                field691[var5++] = 0;
                            }
                            continue;
                        }
                        if (var433 == 3324) {
                            field691[var5++] = client.field233;
                            continue;
                        }
                    } else if (var433 < 3500) {
                        if (var433 == 3400) {
                            var5 -= 2;
                            int var174 = field691[var5];
                            int var175 = field691[var5 + 1];
                            class44 var176 = class44.method2883(var174);
                            if (var176.field976 != 's') {
                            }
                            for (int var177 = 0; var177 < var176.field972; var177++) {
                                if (var176.field973[var177] == var175) {
                                    field692[var6++] = var176.field971[var177];
                                    var176 = null;
                                    break;
                                }
                            }
                            if (var176 != null) {
                                field692[var6++] = var176.field970;
                            }
                            continue;
                        }
                        if (var433 == 3408) {
                            var5 -= 4;
                            int var178 = field691[var5];
                            int var179 = field691[var5 + 1];
                            int var180 = field691[var5 + 2];
                            int var181 = field691[var5 + 3];
                            class44 var182 = class44.method2883(var180);
                            if (var182.field966 == var178 && var182.field976 == var179) {
                                for (int var183 = 0; var183 < var182.field972; var183++) {
                                    if (var182.field973[var183] == var181) {
                                        if (var179 == 115) {
                                            field692[var6++] = var182.field971[var183];
                                        } else {
                                            field691[var5++] = var182.field974[var183];
                                        }
                                        var182 = null;
                                        break;
                                    }
                                }
                                if (var182 != null) {
                                    if (var179 == 115) {
                                        field692[var6++] = var182.field970;
                                    } else {
                                        field691[var5++] = var182.field969;
                                    }
                                }
                                continue;
                            }
                            if (var179 == 115) {
                                field692[var6++] = "null";
                            } else {
                                field691[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var433 < 3700) {
                        if (var433 == 3600) {
                            if (client.field488 == 0) {
                                field691[var5++] = -2;
                            } else if (client.field488 == 1) {
                                field691[var5++] = -1;
                            } else {
                                field691[var5++] = client.field487;
                            }
                            continue;
                        }
                        if (var433 == 3601) {
                            var5--;
                            int var184 = field691[var5];
                            if (client.field488 == 2 && var184 < client.field487) {
                                field692[var6++] = client.field489[var184].field214;
                                field692[var6++] = client.field489[var184].field203;
                                continue;
                            }
                            field692[var6++] = "";
                            field692[var6++] = "";
                            continue;
                        }
                        if (var433 == 3602) {
                            var5--;
                            int var185 = field691[var5];
                            if (client.field488 == 2 && var185 < client.field487) {
                                field691[var5++] = client.field489[var185].field204;
                                continue;
                            }
                            field691[var5++] = 0;
                            continue;
                        }
                        if (var433 == 3603) {
                            var5--;
                            int var186 = field691[var5];
                            if (client.field488 == 2 && var186 < client.field487) {
                                field691[var5++] = client.field489[var186].field206;
                                continue;
                            }
                            field691[var5++] = 0;
                            continue;
                        }
                        if (var433 == 3604) {
                            var6--;
                            String var187 = field692[var6];
                            var5--;
                            int var188 = field691[var5];
                            client.field275.method2367(136);
                            client.field275.method2110(class110.method505(var187) + 1);
                            client.field275.method2314(var187);
                            client.field275.method2110(var188);
                            continue;
                        }
                        if (var433 == 3605) {
                            var6--;
                            String var189 = field692[var6];
                            if (var189 == null) {
                                continue;
                            }
                            if ((client.field487 < 200 || client.field374 == 1) && client.field487 < 400) {
                                String var190 = class214.method2464(var189, Statics.field237);
                                if (var190 == null) {
                                    continue;
                                }
                                for (int var191 = 0; var191 < client.field487; var191++) {
                                    class16 var192 = client.field489[var191];
                                    String var193 = class214.method2464(var192.field214, Statics.field237);
                                    if (var193 != null && var193.equals(var190)) {
                                        class10.method616(30, "", var189 + class147.field2194);
                                        continue label2793;
                                    }
                                    if (var192.field203 != null) {
                                        String var194 = class214.method2464(var192.field203, Statics.field237);
                                        if (var194 != null && var194.equals(var190)) {
                                            class10.method616(30, "", var189 + class147.field2194);
                                            continue label2793;
                                        }
                                    }
                                }
                                for (int var195 = 0; var195 < client.field491; var195++) {
                                    class8 var196 = client.field492[var195];
                                    String var197 = class214.method2464(var196.field114, Statics.field237);
                                    if (var197 != null && var197.equals(var190)) {
                                        class10.method616(30, "", class147.field2336 + var189 + class147.field2340);
                                        continue label2793;
                                    }
                                    if (var196.field111 != null) {
                                        String var198 = class214.method2464(var196.field111, Statics.field237);
                                        if (var198 != null && var198.equals(var190)) {
                                            class10.method616(30, "", class147.field2336 + var189 + class147.field2340);
                                            continue label2793;
                                        }
                                    }
                                }
                                if (class214.method2464(Statics.field2498.field43, Statics.field237).equals(var190)) {
                                    class10.method616(30, "", class147.field2334);
                                } else {
                                    client.field275.method2367(154);
                                    client.field275.method2110(class110.method505(var189));
                                    client.field275.method2314(var189);
                                }
                                continue;
                            }
                            class10.method616(30, "", class147.field2330);
                            continue;
                        }
                        if (var433 == 3606) {
                            var6--;
                            String var199 = field692[var6];
                            if (var199 == null) {
                                continue;
                            }
                            String var200 = class214.method2464(var199, Statics.field237);
                            if (var200 == null) {
                                continue;
                            }
                            int var201 = 0;
                            while (true) {
                                if (var201 >= client.field487) {
                                    continue label2793;
                                }
                                class16 var202 = client.field489[var201];
                                String var203 = var202.field214;
                                String var204 = class214.method2464(var203, Statics.field237);
                                boolean var205;
                                if (var199 == null || var203 == null) {
                                    var205 = false;
                                } else if (var199.startsWith("#") || var203.startsWith("#")) {
                                    var205 = var199.equals(var203);
                                } else {
                                    var205 = var200.equals(var204);
                                }
                                if (var205) {
                                    client.field487--;
                                    for (int var206 = var201; var206 < client.field487; var206++) {
                                        client.field489[var206] = client.field489[var206 + 1];
                                    }
                                    client.field427 = client.field471;
                                    client.field275.method2367(155);
                                    client.field275.method2110(class110.method505(var199));
                                    client.field275.method2314(var199);
                                    continue label2793;
                                }
                                var201++;
                            }
                        }
                        if (var433 == 3607) {
                            var6--;
                            String var207 = field692[var6];
                            if (var207 == null) {
                                continue;
                            }
                            if ((client.field491 < 100 || client.field374 == 1) && client.field491 < 400) {
                                String var208 = class214.method2464(var207, Statics.field237);
                                if (var208 == null) {
                                    continue;
                                }
                                for (int var209 = 0; var209 < client.field491; var209++) {
                                    class8 var210 = client.field492[var209];
                                    String var211 = class214.method2464(var210.field114, Statics.field237);
                                    if (var211 != null && var211.equals(var208)) {
                                        class10.method616(31, "", var207 + class147.field2333);
                                        continue label2793;
                                    }
                                    if (var210.field111 != null) {
                                        String var212 = class214.method2464(var210.field111, Statics.field237);
                                        if (var212 != null && var212.equals(var208)) {
                                            class10.method616(31, "", var207 + class147.field2333);
                                            continue label2793;
                                        }
                                    }
                                }
                                for (int var213 = 0; var213 < client.field487; var213++) {
                                    class16 var214 = client.field489[var213];
                                    String var215 = class214.method2464(var214.field214, Statics.field237);
                                    if (var215 != null && var215.equals(var208)) {
                                        class10.method616(31, "", class147.field2403 + var207 + class147.field2339);
                                        continue label2793;
                                    }
                                    if (var214.field203 != null) {
                                        String var216 = class214.method2464(var214.field203, Statics.field237);
                                        if (var216 != null && var216.equals(var208)) {
                                            class10.method616(31, "", class147.field2403 + var207 + class147.field2339);
                                            continue label2793;
                                        }
                                    }
                                }
                                if (class214.method2464(Statics.field2498.field43, Statics.field237).equals(var208)) {
                                    class10.method616(31, "", class147.field2175);
                                } else {
                                    client.field275.method2367(243);
                                    client.field275.method2110(class110.method505(var207));
                                    client.field275.method2314(var207);
                                }
                                continue;
                            }
                            class10.method616(31, "", class147.field2332);
                            continue;
                        }
                        if (var433 == 3608) {
                            var6--;
                            String var217 = field692[var6];
                            client.method560(var217);
                            continue;
                        }
                        if (var433 == 3609) {
                            var6--;
                            String var218 = field692[var6];
                            class142[] var219 = class142.method499();
                            for (int var220 = 0; var220 < var219.length; var220++) {
                                class142 var221 = var219[var220];
                                if (var221.field2116 != -1) {
                                    int var223 = var221.field2116;
                                    String var224 = "<img=" + var223 + ">";
                                    if (var218.startsWith(var224)) {
                                        var218 = var218.substring(6 + Integer.toString(var221.field2116).length());
                                        break;
                                    }
                                }
                            }
                            field691[var5++] = client.method165(var218, false) ? 1 : 0;
                            continue;
                        }
                        if (var433 == 3611) {
                            if (client.field460 == null) {
                                field692[var6++] = "";
                            } else {
                                field692[var6++] = class212.method3183(client.field460);
                            }
                            continue;
                        }
                        if (var433 == 3612) {
                            if (client.field460 == null) {
                                field691[var5++] = 0;
                            } else {
                                field691[var5++] = Statics.field765;
                            }
                            continue;
                        }
                        if (var433 == 3613) {
                            var5--;
                            int var225 = field691[var5];
                            if (client.field460 != null && var225 < Statics.field765) {
                                field692[var6++] = Statics.field13[var225].field555;
                                continue;
                            }
                            field692[var6++] = "";
                            continue;
                        }
                        if (var433 == 3614) {
                            var5--;
                            int var226 = field691[var5];
                            if (client.field460 != null && var226 < Statics.field765) {
                                field691[var5++] = Statics.field13[var226].field551;
                                continue;
                            }
                            field691[var5++] = 0;
                            continue;
                        }
                        if (var433 == 3615) {
                            var5--;
                            int var227 = field691[var5];
                            if (client.field460 != null && var227 < Statics.field765) {
                                field691[var5++] = Statics.field13[var227].field552;
                                continue;
                            }
                            field691[var5++] = 0;
                            continue;
                        }
                        if (var433 == 3616) {
                            field691[var5++] = Statics.field2909;
                            continue;
                        }
                        if (var433 == 3617) {
                            var6--;
                            String var228 = field692[var6];
                            if (Statics.field13 != null) {
                                client.field275.method2367(222);
                                client.field275.method2110(class110.method505(var228));
                                client.field275.method2314(var228);
                            }
                            continue;
                        }
                        if (var433 == 3618) {
                            field691[var5++] = Statics.field119;
                            continue;
                        }
                        if (var433 == 3619) {
                            var6--;
                            String var229 = field692[var6];
                            client.method1800(var229);
                            continue;
                        }
                        if (var433 == 3620) {
                            client.method3410();
                            continue;
                        }
                        if (var433 == 3621) {
                            if (client.field488 == 0) {
                                field691[var5++] = -1;
                            } else {
                                field691[var5++] = client.field491;
                            }
                            continue;
                        }
                        if (var433 == 3622) {
                            var5--;
                            int var230 = field691[var5];
                            if (client.field488 != 0 && var230 < client.field491) {
                                field692[var6++] = client.field492[var230].field114;
                                field692[var6++] = client.field492[var230].field111;
                                continue;
                            }
                            field692[var6++] = "";
                            field692[var6++] = "";
                            continue;
                        }
                        if (var433 == 3623) {
                            String var231;
                            label2555: {
                                var6--;
                                var231 = field692[var6];
                                String var233 = "<img=0>";
                                if (!var231.startsWith(var233)) {
                                    String var235 = "<img=1>";
                                    if (!var231.startsWith(var235)) {
                                        break label2555;
                                    }
                                }
                                var231 = var231.substring(7);
                            }
                            field691[var5++] = client.method1369(var231) ? 1 : 0;
                            continue;
                        }
                        if (var433 == 3624) {
                            var5--;
                            int var236 = field691[var5];
                            if (Statics.field13 != null && var236 < Statics.field765 && Statics.field13[var236].field555.equalsIgnoreCase(Statics.field2498.field43)) {
                                field691[var5++] = 1;
                                continue;
                            }
                            field691[var5++] = 0;
                            continue;
                        }
                        if (var433 == 3625) {
                            if (client.field423 == null) {
                                field692[var6++] = "";
                            } else {
                                field692[var6++] = class212.method3183(client.field423);
                            }
                            continue;
                        }
                    } else if (var433 < 4000) {
                        if (var433 == 3903) {
                            var5--;
                            int var237 = field691[var5];
                            field691[var5++] = client.field496[var237].method3436();
                            continue;
                        }
                        if (var433 == 3904) {
                            var5--;
                            int var238 = field691[var5];
                            field691[var5++] = client.field496[var238].field2965;
                            continue;
                        }
                        if (var433 == 3905) {
                            var5--;
                            int var239 = field691[var5];
                            field691[var5++] = client.field496[var239].field2961;
                            continue;
                        }
                        if (var433 == 3906) {
                            var5--;
                            int var240 = field691[var5];
                            field691[var5++] = client.field496[var240].field2963;
                            continue;
                        }
                        if (var433 == 3907) {
                            var5--;
                            int var241 = field691[var5];
                            field691[var5++] = client.field496[var241].field2964;
                            continue;
                        }
                        if (var433 == 3908) {
                            var5--;
                            int var242 = field691[var5];
                            field691[var5++] = client.field496[var242].field2967;
                            continue;
                        }
                        if (var433 == 3910) {
                            var5--;
                            int var243 = field691[var5];
                            int var244 = client.field496[var243].method3421();
                            field691[var5++] = var244 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var433 == 3911) {
                            var5--;
                            int var245 = field691[var5];
                            int var246 = client.field496[var245].method3421();
                            field691[var5++] = var246 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var433 == 3912) {
                            var5--;
                            int var247 = field691[var5];
                            int var248 = client.field496[var247].method3421();
                            field691[var5++] = var248 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var433 == 3913) {
                            var5--;
                            int var249 = field691[var5];
                            int var250 = client.field496[var249].method3421();
                            field691[var5++] = var250 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var433 == 3914) {
                            var5--;
                            boolean var251 = field691[var5] == 1;
                            if (Statics.field981 != null) {
                                Statics.field981.method3446(class204.field2972, var251);
                            }
                            continue;
                        }
                        if (var433 == 3915) {
                            var5--;
                            boolean var252 = field691[var5] == 1;
                            if (Statics.field981 != null) {
                                Statics.field981.method3446(class204.field2971, var252);
                            }
                            continue;
                        }
                        if (var433 == 3916) {
                            var5 -= 2;
                            boolean var253 = field691[var5] == 1;
                            boolean var254 = field691[var5 + 1] == 1;
                            if (Statics.field981 != null) {
                                Statics.field981.method3446(new class20(var254), var253);
                            }
                            continue;
                        }
                        if (var433 == 3917) {
                            var5--;
                            boolean var255 = field691[var5] == 1;
                            if (Statics.field981 != null) {
                                Statics.field981.method3446(class204.field2970, var255);
                            }
                            continue;
                        }
                        if (var433 == 3918) {
                            var5--;
                            boolean var256 = field691[var5] == 1;
                            if (Statics.field981 != null) {
                                Statics.field981.method3446(class204.field2973, var256);
                            }
                            continue;
                        }
                        if (var433 == 3919) {
                            field691[var5++] = Statics.field981 == null ? 0 : Statics.field981.field2969.size();
                            continue;
                        }
                        if (var433 == 3920) {
                            var5--;
                            int var257 = field691[var5];
                            class197 var258 = (class197) Statics.field981.field2969.get(var257);
                            field691[var5++] = var258.field2940;
                            continue;
                        }
                        if (var433 == 3921) {
                            var5--;
                            int var259 = field691[var5];
                            class197 var260 = (class197) Statics.field981.field2969.get(var259);
                            field692[var6++] = var260.method3383();
                            continue;
                        }
                        if (var433 == 3922) {
                            var5--;
                            int var261 = field691[var5];
                            class197 var262 = (class197) Statics.field981.field2969.get(var261);
                            field692[var6++] = var262.method3384();
                            continue;
                        }
                        if (var433 == 3923) {
                            var5--;
                            int var263 = field691[var5];
                            class197 var264 = (class197) Statics.field981.field2969.get(var263);
                            long var265 = class106.method870() - Statics.field1889 - var264.field2939;
                            int var267 = (int) (var265 / 3600000L);
                            int var268 = (int) ((var265 - (long) (var267 * 3600000)) / 60000L);
                            int var269 = (int) ((var265 - (long) (var267 * 3600000) - (long) (var268 * 60000)) / 1000L);
                            String var270 = var267 + ":" + var268 / 10 + var268 % 10 + ":" + var269 / 10 + var269 % 10;
                            field692[var6++] = var270;
                            continue;
                        }
                        if (var433 == 3924) {
                            var5--;
                            int var271 = field691[var5];
                            class197 var272 = (class197) Statics.field981.field2969.get(var271);
                            field691[var5++] = var272.field2942.field2963;
                            continue;
                        }
                        if (var433 == 3925) {
                            var5--;
                            int var273 = field691[var5];
                            class197 var274 = (class197) Statics.field981.field2969.get(var273);
                            field691[var5++] = var274.field2942.field2961;
                            continue;
                        }
                        if (var433 == 3926) {
                            var5--;
                            int var275 = field691[var5];
                            class197 var276 = (class197) Statics.field981.field2969.get(var275);
                            field691[var5++] = var276.field2942.field2965;
                            continue;
                        }
                    } else if (var433 < 4100) {
                        if (var433 == 4000) {
                            var5 -= 2;
                            int var277 = field691[var5];
                            int var278 = field691[var5 + 1];
                            field691[var5++] = var277 + var278;
                            continue;
                        }
                        if (var433 == 4001) {
                            var5 -= 2;
                            int var279 = field691[var5];
                            int var280 = field691[var5 + 1];
                            field691[var5++] = var279 - var280;
                            continue;
                        }
                        if (var433 == 4002) {
                            var5 -= 2;
                            int var281 = field691[var5];
                            int var282 = field691[var5 + 1];
                            field691[var5++] = var281 * var282;
                            continue;
                        }
                        if (var433 == 4003) {
                            var5 -= 2;
                            int var283 = field691[var5];
                            int var284 = field691[var5 + 1];
                            field691[var5++] = var283 / var284;
                            continue;
                        }
                        if (var433 == 4004) {
                            var5--;
                            int var285 = field691[var5];
                            field691[var5++] = (int) (Math.random() * (double) var285);
                            continue;
                        }
                        if (var433 == 4005) {
                            var5--;
                            int var286 = field691[var5];
                            field691[var5++] = (int) (Math.random() * (double) (var286 + 1));
                            continue;
                        }
                        if (var433 == 4006) {
                            var5 -= 5;
                            int var287 = field691[var5];
                            int var288 = field691[var5 + 1];
                            int var289 = field691[var5 + 2];
                            int var290 = field691[var5 + 3];
                            int var291 = field691[var5 + 4];
                            field691[var5++] = (var288 - var287) * (var291 - var289) / (var290 - var289) + var287;
                            continue;
                        }
                        if (var433 == 4007) {
                            var5 -= 2;
                            int var292 = field691[var5];
                            int var293 = field691[var5 + 1];
                            field691[var5++] = var292 * var293 / 100 + var292;
                            continue;
                        }
                        if (var433 == 4008) {
                            var5 -= 2;
                            int var294 = field691[var5];
                            int var295 = field691[var5 + 1];
                            field691[var5++] = var294 | 0x1 << var295;
                            continue;
                        }
                        if (var433 == 4009) {
                            var5 -= 2;
                            int var296 = field691[var5];
                            int var297 = field691[var5 + 1];
                            field691[var5++] = var296 & -1 - (0x1 << var297);
                            continue;
                        }
                        if (var433 == 4010) {
                            var5 -= 2;
                            int var298 = field691[var5];
                            int var299 = field691[var5 + 1];
                            field691[var5++] = (var298 & 0x1 << var299) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var433 == 4011) {
                            var5 -= 2;
                            int var300 = field691[var5];
                            int var301 = field691[var5 + 1];
                            field691[var5++] = var300 % var301;
                            continue;
                        }
                        if (var433 == 4012) {
                            var5 -= 2;
                            int var302 = field691[var5];
                            int var303 = field691[var5 + 1];
                            if (var302 == 0) {
                                field691[var5++] = 0;
                            } else {
                                field691[var5++] = (int) Math.pow((double) var302, (double) var303);
                            }
                            continue;
                        }
                        if (var433 == 4013) {
                            var5 -= 2;
                            int var304 = field691[var5];
                            int var305 = field691[var5 + 1];
                            if (var304 == 0) {
                                field691[var5++] = 0;
                            } else if (var305 == 0) {
                                field691[var5++] = Integer.MAX_VALUE;
                            } else {
                                field691[var5++] = (int) Math.pow((double) var304, 1.0D / (double) var305);
                            }
                            continue;
                        }
                        if (var433 == 4014) {
                            var5 -= 2;
                            int var306 = field691[var5];
                            int var307 = field691[var5 + 1];
                            field691[var5++] = var306 & var307;
                            continue;
                        }
                        if (var433 == 4015) {
                            var5 -= 2;
                            int var308 = field691[var5];
                            int var309 = field691[var5 + 1];
                            field691[var5++] = var308 | var309;
                            continue;
                        }
                    } else if (var433 < 4200) {
                        if (var433 == 4100) {
                            var6--;
                            String var310 = field692[var6];
                            var5--;
                            int var311 = field691[var5];
                            field692[var6++] = var310 + var311;
                            continue;
                        }
                        if (var433 == 4101) {
                            var6 -= 2;
                            String var312 = field692[var6];
                            String var313 = field692[var6 + 1];
                            field692[var6++] = var312 + var313;
                            continue;
                        }
                        if (var433 == 4102) {
                            var6--;
                            String var314 = field692[var6];
                            var5--;
                            int var315 = field691[var5];
                            String[] var316 = field692;
                            int var317 = var6++;
                            String var319;
                            if (var315 < 0) {
                                var319 = Integer.toString(var315);
                            } else {
                                int var320 = var315;
                                String var321;
                                if (var315 < 0) {
                                    var321 = Integer.toString(var315, 10);
                                } else {
                                    int var322 = 2;
                                    int var323 = var315 / 10;
                                    while (var323 != 0) {
                                        var323 /= 10;
                                        var322++;
                                    }
                                    char[] var324 = new char[var322];
                                    var324[0] = '+';
                                    for (int var325 = var322 - 1; var325 > 0; var325--) {
                                        int var326 = var320;
                                        var320 /= 10;
                                        int var327 = var326 - var320 * 10;
                                        if (var327 >= 10) {
                                            var324[var325] = (char) (var327 + 87);
                                        } else {
                                            var324[var325] = (char) (var327 + 48);
                                        }
                                    }
                                    var321 = new String(var324);
                                }
                                var319 = var321;
                            }
                            var316[var317] = var314 + var319;
                            continue;
                        }
                        if (var433 == 4103) {
                            var6--;
                            String var328 = field692[var6];
                            field692[var6++] = var328.toLowerCase();
                            continue;
                        }
                        if (var433 == 4104) {
                            var5--;
                            int var329 = field691[var5];
                            long var330 = ((long) var329 + 11745L) * 86400000L;
                            field688.setTime(new Date(var330));
                            int var332 = field688.get(5);
                            int var333 = field688.get(2);
                            int var334 = field688.get(1);
                            field692[var6++] = var332 + "-" + field696[var333] + "-" + var334;
                            continue;
                        }
                        if (var433 == 4105) {
                            var6 -= 2;
                            String var335 = field692[var6];
                            String var336 = field692[var6 + 1];
                            if (Statics.field2498.field31 != null && Statics.field2498.field31.field2696) {
                                field692[var6++] = var336;
                                continue;
                            }
                            field692[var6++] = var335;
                            continue;
                        }
                        if (var433 == 4106) {
                            var5--;
                            int var337 = field691[var5];
                            field692[var6++] = Integer.toString(var337);
                            continue;
                        }
                        if (var433 == 4107) {
                            var6 -= 2;
                            field691[var5++] = class213.method489(class216.method30(field692[var6], field692[var6 + 1], client.field240));
                            continue;
                        }
                        if (var433 == 4108) {
                            var6--;
                            String var338 = field692[var6];
                            var5 -= 2;
                            int var339 = field691[var5];
                            int var340 = field691[var5 + 1];
                            byte[] var341 = Statics.field587.method2811(var340, 0);
                            class207 var342 = new class207(var341);
                            field691[var5++] = var342.method3485(var338, var339);
                            continue;
                        }
                        if (var433 == 4109) {
                            var6--;
                            String var343 = field692[var6];
                            var5 -= 2;
                            int var344 = field691[var5];
                            int var345 = field691[var5 + 1];
                            byte[] var346 = Statics.field587.method2811(var345, 0);
                            class207 var347 = new class207(var346);
                            field691[var5++] = var347.method3502(var343, var344);
                            continue;
                        }
                        if (var433 == 4110) {
                            var6 -= 2;
                            String var348 = field692[var6];
                            String var349 = field692[var6 + 1];
                            var5--;
                            if (field691[var5] == 1) {
                                field692[var6++] = var348;
                            } else {
                                field692[var6++] = var349;
                            }
                            continue;
                        }
                        if (var433 == 4111) {
                            var6--;
                            String var350 = field692[var6];
                            field692[var6++] = class206.method3468(var350);
                            continue;
                        }
                        if (var433 == 4112) {
                            var6--;
                            String var351 = field692[var6];
                            var5--;
                            int var352 = field691[var5];
                            field692[var6++] = var351 + (char) var352;
                            continue;
                        }
                        if (var433 == 4113) {
                            var5--;
                            int var353 = field691[var5];
                            field691[var5++] = class213.method1442((char) var353) ? 1 : 0;
                            continue;
                        }
                        if (var433 == 4114) {
                            var5--;
                            int var354 = field691[var5];
                            field691[var5++] = class213.method2686((char) var354) ? 1 : 0;
                            continue;
                        }
                        if (var433 == 4115) {
                            var5--;
                            int var355 = field691[var5];
                            field691[var5++] = class213.method1377((char) var355) ? 1 : 0;
                            continue;
                        }
                        if (var433 == 4116) {
                            var5--;
                            int var356 = field691[var5];
                            field691[var5++] = class213.method1982((char) var356) ? 1 : 0;
                            continue;
                        }
                        if (var433 == 4117) {
                            var6--;
                            String var357 = field692[var6];
                            if (var357 == null) {
                                field691[var5++] = 0;
                            } else {
                                field691[var5++] = var357.length();
                            }
                            continue;
                        }
                        if (var433 == 4118) {
                            var6--;
                            String var358 = field692[var6];
                            var5 -= 2;
                            int var359 = field691[var5];
                            int var360 = field691[var5 + 1];
                            field692[var6++] = var358.substring(var359, var360);
                            continue;
                        }
                        if (var433 == 4119) {
                            var6--;
                            String var361 = field692[var6];
                            StringBuilder var362 = new StringBuilder(var361.length());
                            boolean var363 = false;
                            for (int var364 = 0; var364 < var361.length(); var364++) {
                                char var365 = var361.charAt(var364);
                                if (var365 == '<') {
                                    var363 = true;
                                } else if (var365 == '>') {
                                    var363 = false;
                                } else if (!var363) {
                                    var362.append(var365);
                                }
                            }
                            field692[var6++] = var362.toString();
                            continue;
                        }
                        if (var433 == 4120) {
                            var6--;
                            String var366 = field692[var6];
                            var5--;
                            int var367 = field691[var5];
                            field691[var5++] = var366.indexOf(var367);
                            continue;
                        }
                        if (var433 == 4121) {
                            var6 -= 2;
                            String var368 = field692[var6];
                            String var369 = field692[var6 + 1];
                            var5--;
                            int var370 = field691[var5];
                            field691[var5++] = var368.indexOf(var369, var370);
                            continue;
                        }
                    } else if (var433 < 4300) {
                        if (var433 == 4200) {
                            var5--;
                            int var371 = field691[var5];
                            field692[var6++] = Statics.method607(var371).field998;
                            continue;
                        }
                        if (var433 == 4201) {
                            var5 -= 2;
                            int var372 = field691[var5];
                            int var373 = field691[var5 + 1];
                            class46 var374 = Statics.method607(var372);
                            if (var373 >= 1 && var373 <= 5 && var374.field990[var373 - 1] != null) {
                                field692[var6++] = var374.field990[var373 - 1];
                                continue;
                            }
                            field692[var6++] = "";
                            continue;
                        }
                        if (var433 == 4202) {
                            var5 -= 2;
                            int var375 = field691[var5];
                            int var376 = field691[var5 + 1];
                            class46 var377 = Statics.method607(var375);
                            if (var376 >= 1 && var376 <= 5 && var377.field1013[var376 - 1] != null) {
                                field692[var6++] = var377.field1013[var376 - 1];
                                continue;
                            }
                            field692[var6++] = "";
                            continue;
                        }
                        if (var433 == 4203) {
                            var5--;
                            int var378 = field691[var5];
                            field691[var5++] = Statics.method607(var378).field1010;
                            continue;
                        }
                        if (var433 == 4204) {
                            var5--;
                            int var379 = field691[var5];
                            field691[var5++] = Statics.method607(var379).field1009 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var433 == 4205) {
                            var5--;
                            int var380 = field691[var5];
                            class46 var381 = Statics.method607(var380);
                            if (var381.field1023 == -1 && var381.field1024 >= 0) {
                                field691[var5++] = var381.field1024;
                                continue;
                            }
                            field691[var5++] = var380;
                            continue;
                        }
                        if (var433 == 4206) {
                            var5--;
                            int var382 = field691[var5];
                            class46 var383 = Statics.method607(var382);
                            if (var383.field1023 >= 0 && var383.field1024 >= 0) {
                                field691[var5++] = var383.field1024;
                                continue;
                            }
                            field691[var5++] = var382;
                            continue;
                        }
                        if (var433 == 4207) {
                            var5--;
                            int var384 = field691[var5];
                            field691[var5++] = Statics.method607(var384).field1037 ? 1 : 0;
                            continue;
                        }
                        if (var433 == 4210) {
                            var6--;
                            String var385 = field692[var6];
                            var5--;
                            int var386 = field691[var5];
                            boolean var388 = var386 == 1;
                            String var389 = var385.toLowerCase();
                            short[] var390 = new short[16];
                            int var391 = 0;
                            int var392 = 0;
                            while (true) {
                                if (var392 >= Statics.field549) {
                                    Statics.field985 = var390;
                                    Statics.field571 = 0;
                                    Statics.field570 = var391;
                                    String[] var396 = new String[Statics.field570];
                                    for (int var397 = 0; var397 < Statics.field570; var397++) {
                                        var396[var397] = Statics.method607(var390[var397]).field998;
                                    }
                                    short[] var398 = Statics.field985;
                                    class115.method1448(var396, var398, 0, var396.length - 1);
                                    break;
                                }
                                class46 var393 = Statics.method607(var392);
                                if ((!var388 || var393.field1028) && var393.field1023 == -1 && var393.field998.toLowerCase().indexOf(var389) != -1) {
                                    if (var391 >= 250) {
                                        Statics.field570 = -1;
                                        Statics.field985 = null;
                                        break;
                                    }
                                    if (var391 >= var390.length) {
                                        short[] var394 = new short[var390.length * 2];
                                        for (int var395 = 0; var395 < var391; var395++) {
                                            var394[var395] = var390[var395];
                                        }
                                        var390 = var394;
                                    }
                                    var390[var391++] = (short) var392;
                                }
                                var392++;
                            }
                            field691[var5++] = Statics.field570;
                            continue;
                        }
                        if (var433 == 4211) {
                            if (Statics.field985 != null && Statics.field571 < Statics.field570) {
                                field691[var5++] = Statics.field985[++Statics.field571 - 1] & 0xFFFF;
                                continue;
                            }
                            field691[var5++] = -1;
                            continue;
                        }
                        if (var433 == 4212) {
                            Statics.field571 = 0;
                            continue;
                        }
                    } else if (var433 < 5100) {
                        if (var433 == 5000) {
                            field691[var5++] = client.field451;
                            continue;
                        }
                        if (var433 == 5001) {
                            var5 -= 3;
                            client.field451 = field691[var5];
                            int var399 = field691[var5 + 1];
                            class121[] var400 = class121.method2056();
                            int var401 = 0;
                            class121 var403;
                            while (true) {
                                if (var401 >= var400.length) {
                                    var403 = null;
                                    break;
                                }
                                class121 var402 = var400[var401];
                                if (var402.field1910 == var399) {
                                    var403 = var402;
                                    break;
                                }
                                var401++;
                            }
                            Statics.field700 = var403;
                            if (Statics.field700 == null) {
                                Statics.field700 = class121.field1915;
                            }
                            client.field439 = field691[var5 + 2];
                            client.field275.method2367(200);
                            client.field275.method2110(client.field451);
                            client.field275.method2110(Statics.field700.field1910);
                            client.field275.method2110(client.field439);
                            continue;
                        }
                        if (var433 == 5002) {
                            var6--;
                            String var404 = field692[var6];
                            var5 -= 2;
                            int var405 = field691[var5];
                            int var406 = field691[var5 + 1];
                            client.field275.method2367(53);
                            client.field275.method2110(class110.method505(var404) + 2);
                            client.field275.method2314(var404);
                            client.field275.method2110(var405 - 1);
                            client.field275.method2110(var406);
                            continue;
                        }
                        if (var433 == 5003) {
                            var5 -= 2;
                            int var407 = field691[var5];
                            int var408 = field691[var5 + 1];
                            class32 var409 = class10.method600(var407, var408);
                            if (var409 == null) {
                                field691[var5++] = -1;
                                field691[var5++] = 0;
                                field692[var6++] = "";
                                field692[var6++] = "";
                                field692[var6++] = "";
                            } else {
                                field691[var5++] = var409.field685;
                                field691[var5++] = var409.field678;
                                field692[var6++] = var409.field677 == null ? "" : var409.field677;
                                field692[var6++] = var409.field681 == null ? "" : var409.field681;
                                field692[var6++] = var409.field682 == null ? "" : var409.field682;
                            }
                            continue;
                        }
                        if (var433 == 5004) {
                            var5--;
                            int var410 = field691[var5];
                            class32 var411 = class10.method521(var410);
                            if (var411 == null) {
                                field691[var5++] = -1;
                                field691[var5++] = 0;
                                field692[var6++] = "";
                                field692[var6++] = "";
                                field692[var6++] = "";
                            } else {
                                field691[var5++] = var411.field679;
                                field691[var5++] = var411.field678;
                                field692[var6++] = var411.field677 == null ? "" : var411.field677;
                                field692[var6++] = var411.field681 == null ? "" : var411.field681;
                                field692[var6++] = var411.field682 == null ? "" : var411.field682;
                            }
                            continue;
                        }
                        if (var433 == 5005) {
                            if (Statics.field700 == null) {
                                field691[var5++] = -1;
                            } else {
                                field691[var5++] = Statics.field700.field1910;
                            }
                            continue;
                        }
                        if (var433 == 5008) {
                            var6--;
                            String var412 = field692[var6];
                            var5--;
                            int var413 = field691[var5];
                            String var414 = var412.toLowerCase();
                            byte var415 = 0;
                            if (var414.startsWith(class147.field2338)) {
                                var415 = 0;
                                var412 = var412.substring(class147.field2338.length());
                            } else if (var414.startsWith(class147.field2342)) {
                                var415 = 1;
                                var412 = var412.substring(class147.field2342.length());
                            } else if (var414.startsWith(class147.field2235)) {
                                var415 = 2;
                                var412 = var412.substring(class147.field2235.length());
                            } else if (var414.startsWith(class147.field2346)) {
                                var415 = 3;
                                var412 = var412.substring(class147.field2346.length());
                            } else if (var414.startsWith(class147.field2348)) {
                                var415 = 4;
                                var412 = var412.substring(class147.field2348.length());
                            } else if (var414.startsWith(class147.field2350)) {
                                var415 = 5;
                                var412 = var412.substring(class147.field2350.length());
                            } else if (var414.startsWith(class147.field2278)) {
                                var415 = 6;
                                var412 = var412.substring(class147.field2278.length());
                            } else if (var414.startsWith(class147.field2354)) {
                                var415 = 7;
                                var412 = var412.substring(class147.field2354.length());
                            } else if (var414.startsWith(class147.field2258)) {
                                var415 = 8;
                                var412 = var412.substring(class147.field2258.length());
                            } else if (var414.startsWith(class147.field2358)) {
                                var415 = 9;
                                var412 = var412.substring(class147.field2358.length());
                            } else if (var414.startsWith(class147.field2360)) {
                                var415 = 10;
                                var412 = var412.substring(class147.field2360.length());
                            } else if (var414.startsWith(class147.field2362)) {
                                var415 = 11;
                                var412 = var412.substring(class147.field2362.length());
                            } else if (client.field240 != 0) {
                                if (var414.startsWith(class147.field2279)) {
                                    var415 = 0;
                                    var412 = var412.substring(class147.field2279.length());
                                } else if (var414.startsWith(class147.field2314)) {
                                    var415 = 1;
                                    var412 = var412.substring(class147.field2314.length());
                                } else if (var414.startsWith(class147.field2345)) {
                                    var415 = 2;
                                    var412 = var412.substring(class147.field2345.length());
                                } else if (var414.startsWith(class147.field2176)) {
                                    var415 = 3;
                                    var412 = var412.substring(class147.field2176.length());
                                } else if (var414.startsWith(class147.field2349)) {
                                    var415 = 4;
                                    var412 = var412.substring(class147.field2349.length());
                                } else if (var414.startsWith(class147.field2351)) {
                                    var415 = 5;
                                    var412 = var412.substring(class147.field2351.length());
                                } else if (var414.startsWith(class147.field2353)) {
                                    var415 = 6;
                                    var412 = var412.substring(class147.field2353.length());
                                } else if (var414.startsWith(class147.field2355)) {
                                    var415 = 7;
                                    var412 = var412.substring(class147.field2355.length());
                                } else if (var414.startsWith(class147.field2357)) {
                                    var415 = 8;
                                    var412 = var412.substring(class147.field2357.length());
                                } else if (var414.startsWith(class147.field2359)) {
                                    var415 = 9;
                                    var412 = var412.substring(class147.field2359.length());
                                } else if (var414.startsWith(class147.field2361)) {
                                    var415 = 10;
                                    var412 = var412.substring(class147.field2361.length());
                                } else if (var414.startsWith(class147.field2190)) {
                                    var415 = 11;
                                    var412 = var412.substring(class147.field2190.length());
                                }
                            }
                            String var416 = var412.toLowerCase();
                            byte var417 = 0;
                            if (var416.startsWith(class147.field2364)) {
                                var417 = 1;
                                var412 = var412.substring(class147.field2364.length());
                            } else if (var416.startsWith(class147.field2366)) {
                                var417 = 2;
                                var412 = var412.substring(class147.field2366.length());
                            } else if (var416.startsWith(class147.field2254)) {
                                var417 = 3;
                                var412 = var412.substring(class147.field2254.length());
                            } else if (var416.startsWith(class147.field2384)) {
                                var417 = 4;
                                var412 = var412.substring(class147.field2384.length());
                            } else if (var416.startsWith(class147.field2372)) {
                                var417 = 5;
                                var412 = var412.substring(class147.field2372.length());
                            } else if (client.field240 != 0) {
                                if (var416.startsWith(class147.field2365)) {
                                    var417 = 1;
                                    var412 = var412.substring(class147.field2365.length());
                                } else if (var416.startsWith(class147.field2406)) {
                                    var417 = 2;
                                    var412 = var412.substring(class147.field2406.length());
                                } else if (var416.startsWith(class147.field2347)) {
                                    var417 = 3;
                                    var412 = var412.substring(class147.field2347.length());
                                } else if (var416.startsWith(class147.field2241)) {
                                    var417 = 4;
                                    var412 = var412.substring(class147.field2241.length());
                                } else if (var416.startsWith(class147.field2238)) {
                                    var417 = 5;
                                    var412 = var412.substring(class147.field2238.length());
                                }
                            }
                            client.field275.method2367(42);
                            client.field275.method2110(0);
                            int var418 = client.field275.field1842;
                            client.field275.method2110(var413);
                            client.field275.method2110(var415);
                            client.field275.method2110(var417);
                            class205.method1795(client.field275, var412);
                            client.field275.method2121(client.field275.field1842 - var418);
                            continue;
                        }
                        if (var433 == 5009) {
                            var6 -= 2;
                            String var419 = field692[var6];
                            String var420 = field692[var6 + 1];
                            client.field275.method2367(181);
                            client.field275.method2111(0);
                            int var421 = client.field275.field1842;
                            client.field275.method2314(var419);
                            class205.method1795(client.field275, var420);
                            client.field275.method2120(client.field275.field1842 - var421);
                            continue;
                        }
                        if (var433 == 5015) {
                            String var422;
                            if (Statics.field2498 == null || Statics.field2498.field43 == null) {
                                var422 = "";
                            } else {
                                var422 = Statics.field2498.field43;
                            }
                            field692[var6++] = var422;
                            continue;
                        }
                        if (var433 == 5016) {
                            field691[var5++] = client.field439;
                            continue;
                        }
                        if (var433 == 5017) {
                            var5--;
                            int var423 = field691[var5];
                            field691[var5++] = class10.method2429(var423);
                            continue;
                        }
                        if (var433 == 5018) {
                            var5--;
                            int var424 = field691[var5];
                            field691[var5++] = class10.method1(var424);
                            continue;
                        }
                        if (var433 == 5019) {
                            var5--;
                            int var425 = field691[var5];
                            field691[var5++] = class10.method494(var425);
                            continue;
                        }
                        if (var433 == 5020) {
                            var6--;
                            String var426 = field692[var6];
                            if (var426.equalsIgnoreCase("toggleroof")) {
                                Statics.field1993.field126 = !Statics.field1993.field126;
                                class9.method3364();
                                if (Statics.field1993.field126) {
                                    class10.method616(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method616(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field402 >= 2) {
                                if (var426.equalsIgnoreCase("fpson")) {
                                    client.field249 = true;
                                }
                                if (var426.equalsIgnoreCase("fpsoff")) {
                                    client.field249 = false;
                                }
                                if (var426.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var426.equalsIgnoreCase("clientdrop")) {
                                    if (client.field301 > 0) {
                                        client.method917();
                                    } else {
                                        client.method871(40);
                                        Statics.field175 = Statics.field3046;
                                        Statics.field3046 = null;
                                    }
                                }
                                if (var426.equalsIgnoreCase("errortest") && client.field235 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field275.method2367(221);
                            client.field275.method2110(var426.length() + 1);
                            client.field275.method2314(var426);
                            continue;
                        }
                        if (var433 == 5021) {
                            var6--;
                            client.field453 = field692[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var433 == 5022) {
                            field692[var6++] = client.field453;
                            continue;
                        }
                    }
                } else {
                    class157 var74;
                    if (var433 >= 2000) {
                        var433 -= 1000;
                        var5--;
                        var74 = class157.method2872(field691[var5]);
                    } else {
                        var74 = var51 ? Statics.field2691 : Statics.field558;
                    }
                    if (var433 == 1300) {
                        var5--;
                        int var75 = field691[var5] - 1;
                        if (var75 >= 0 && var75 <= 9) {
                            var6--;
                            var74.method2885(var75, field692[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var433 == 1301) {
                        var5 -= 2;
                        int var76 = field691[var5];
                        int var77 = field691[var5 + 1];
                        var74.field2612 = class157.method2707(var76, var77);
                        continue;
                    }
                    if (var433 == 1302) {
                        var5--;
                        var74.field2655 = field691[var5] == 1;
                        continue;
                    }
                    if (var433 == 1303) {
                        var5--;
                        var74.field2613 = field691[var5];
                        continue;
                    }
                    if (var433 == 1304) {
                        var5--;
                        var74.field2614 = field691[var5];
                        continue;
                    }
                    if (var433 == 1305) {
                        var6--;
                        var74.field2610 = field692[var6];
                        continue;
                    }
                    if (var433 == 1306) {
                        var6--;
                        var74.field2616 = field692[var6];
                        continue;
                    }
                    if (var433 == 1307) {
                        var74.field2628 = null;
                        continue;
                    }
                }
                if (var433 >= 5600 || var433 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var427 = field691[var5];
                int var428 = field691[var5 + 1];
                if (!client.field481) {
                    client.field291 = var427;
                    client.field310 = var428;
                }
            }
        } catch (Exception var432) {
            StringBuilder var430 = new StringBuilder(30);
            var430.append("").append(var4.field2903).append(" ");
            for (int var431 = field693 - 1; var431 >= 0; var431--) {
                var430.append("").append(field694[var431].field172.field2903).append(" ");
            }
            var430.append("").append(var10);
            class139.method2074(var430.toString(), var432);
        }
    }

    @ObfuscatedName("n.d(II)V")
    public static void method520(int arg0) {
        if (arg0 == -1 || !class157.method831(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2641[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3.field2658 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field5 = var3.field2658;
                method2474(var4, 2000000);
            }
        }
    }
}
