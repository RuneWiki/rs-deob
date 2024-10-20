package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("a")
public class class65 {

    @ObfuscatedName("a.g")
    public static int field595 = 0;

    @ObfuscatedName("a.e")
    public static class82[] field596 = new class82[50];

    @ObfuscatedName("a.n")
    public static String[] field594 = new String[1000];

    @ObfuscatedName("a.l")
    public static final String[] field588 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("a.h")
    public static int[][] field602 = new int[5][5000];

    @ObfuscatedName("a.t")
    public static int[] field591 = new int[5];

    @ObfuscatedName("a.r")
    public static int[] field593 = new int[1000];

    @ObfuscatedName("a.z")
    public static Calendar field598 = Calendar.getInstance();

    public class65() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.p(II)V")
    public static void method929(int arg0) {
        if (arg0 == -1 || !class75.method299(arg0)) {
            return;
        }
        class75[] var1 = Statics.field826[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class75 var3 = var1[var2];
            if (var3.field729 != null) {
                class72 var4 = new class72();
                var4.field682 = var3;
                var4.field678 = var3.field729;
                method1306(var4);
            }
        }
    }

    @ObfuscatedName("s.j(Lj;I)V")
    public static void method1306(class72 arg0) {
        Object[] var1 = arg0.field678;
        int var2 = (Integer) var1[0];
        class76 var3 = class76.method2267(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field846;
        int[] var8 = var3.field847;
        byte var9 = -1;
        field595 = 0;
        try {
            Statics.field589 = new int[var3.field849];
            int var10 = 0;
            Statics.field590 = new String[var3.field850];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field680;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field687;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field682 == null ? -1 : arg0.field682.field727;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field685;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field682 == null ? -1 : arg0.field682.field728;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field683 == null ? -1 : arg0.field683.field727;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field683 == null ? -1 : arg0.field683.field728;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field679;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field681;
                    }
                    Statics.field589[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field686;
                    }
                    Statics.field590[var11++] = var14;
                }
            }
            int var15 = 0;
            label2248: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var351 = var7[var6];
                if (var351 < 100) {
                    if (var351 == 0) {
                        field593[var4++] = var8[var6];
                        continue;
                    }
                    if (var351 == 1) {
                        int var16 = var8[var6];
                        field593[var4++] = class19.field88[var16];
                        continue;
                    }
                    if (var351 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class19.field88[var17] = field593[var4];
                        client.method1546(var17);
                        continue;
                    }
                    if (var351 == 3) {
                        field594[var5++] = var3.field853[var6];
                        continue;
                    }
                    if (var351 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var351 == 7) {
                        var4 -= 2;
                        if (field593[var4 + 1] != field593[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var351 == 8) {
                        var4 -= 2;
                        if (field593[var4 + 1] == field593[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var351 == 9) {
                        var4 -= 2;
                        if (field593[var4] < field593[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var351 == 10) {
                        var4 -= 2;
                        if (field593[var4] > field593[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var351 == 21) {
                        if (field595 == 0) {
                            return;
                        }
                        class82 var18 = field596[--field595];
                        var3 = var18.field941;
                        var7 = var3.field846;
                        var8 = var3.field847;
                        var6 = var18.field931;
                        Statics.field589 = var18.field938;
                        Statics.field590 = var18.field933;
                        continue;
                    }
                    if (var351 == 25) {
                        int var19 = var8[var6];
                        field593[var4++] = class19.method2891(var19);
                        continue;
                    }
                    if (var351 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field593[var4];
                        class182 var22 = class182.method934(var20);
                        int var23 = var22.field2750;
                        int var24 = var22.field2744;
                        int var25 = var22.field2745;
                        int var26 = class19.field89[var25 - var24];
                        if (var21 < 0 || var21 > var26) {
                            var21 = 0;
                        }
                        int var27 = var26 << var24;
                        class19.field88[var23] = class19.field88[var23] & ~var27 | var21 << var24 & var27;
                        continue;
                    }
                    if (var351 == 31) {
                        var4 -= 2;
                        if (field593[var4] <= field593[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var351 == 32) {
                        var4 -= 2;
                        if (field593[var4] >= field593[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var351 == 33) {
                        field593[var4++] = Statics.field589[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var351 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field589[var10001] = field593[var4];
                        continue;
                    }
                    if (var351 == 35) {
                        field594[var5++] = Statics.field590[var8[var6]];
                        continue;
                    }
                    if (var351 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field590[var10001] = field594[var5];
                        continue;
                    }
                    if (var351 == 37) {
                        int var28 = var8[var6];
                        var5 -= var28;
                        String var29 = class99.method1986(field594, var5, var28);
                        field594[var5++] = var29;
                        continue;
                    }
                    if (var351 == 38) {
                        var4--;
                        continue;
                    }
                    if (var351 == 39) {
                        var5--;
                        continue;
                    }
                    if (var351 == 40) {
                        int var30 = var8[var6];
                        class76 var31 = class76.method2267(var30);
                        int[] var32 = new int[var31.field849];
                        String[] var33 = new String[var31.field850];
                        for (int var34 = 0; var34 < var31.field851; var34++) {
                            var32[var34] = field593[var4 - var31.field851 + var34];
                        }
                        for (int var35 = 0; var35 < var31.field852; var35++) {
                            var33[var35] = field594[var5 - var31.field852 + var35];
                        }
                        var4 -= var31.field851;
                        var5 -= var31.field852;
                        class82 var36 = new class82();
                        var36.field941 = var3;
                        var36.field931 = var6;
                        var36.field938 = Statics.field589;
                        var36.field933 = Statics.field590;
                        field596[++field595 - 1] = var36;
                        var3 = var31;
                        var7 = var31.field846;
                        var8 = var31.field847;
                        var6 = -1;
                        Statics.field589 = var32;
                        Statics.field590 = var33;
                        continue;
                    }
                    if (var351 == 42) {
                        field593[var4++] = client.field1669[var8[var6]];
                        continue;
                    }
                    if (var351 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field1669[var10001] = field593[var4];
                        continue;
                    }
                    if (var351 == 44) {
                        int var37 = var8[var6] >> 16;
                        int var38 = var8[var6] & 0xFFFF;
                        var4--;
                        int var39 = field593[var4];
                        if (var39 >= 0 && var39 <= 5000) {
                            field591[var37] = var39;
                            byte var40 = -1;
                            if (var38 == 105) {
                                var40 = 0;
                            }
                            int var41 = 0;
                            while (true) {
                                if (var41 >= var39) {
                                    continue label2248;
                                }
                                field602[var37][var41] = var40;
                                var41++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var351 == 45) {
                        int var42 = var8[var6];
                        var4--;
                        int var43 = field593[var4];
                        if (var43 >= 0 && var43 < field591[var42]) {
                            field593[var4++] = field602[var42][var43];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var351 == 46) {
                        int var44 = var8[var6];
                        var4 -= 2;
                        int var45 = field593[var4];
                        if (var45 >= 0 && var45 < field591[var44]) {
                            field602[var44][var45] = field593[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var351 == 47) {
                        String var46 = client.field1670[var8[var6]];
                        if (var46 == null) {
                            var46 = "null";
                        }
                        field594[var5++] = var46;
                        continue;
                    }
                    if (var351 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field1670[var10001] = field594[var5];
                        continue;
                    }
                }
                boolean var47;
                if (var8[var6] == 1) {
                    var47 = true;
                } else {
                    var47 = false;
                }
                if (var351 < 1000) {
                    if (var351 == 100) {
                        var4 -= 3;
                        int var48 = field593[var4];
                        int var49 = field593[var4 + 1];
                        int var50 = field593[var4 + 2];
                        if (var49 == 0) {
                            throw new RuntimeException();
                        }
                        class75 var51 = class75.method1490(var48);
                        if (var51.field835 == null) {
                            var51.field835 = new class75[var50 + 1];
                        }
                        if (var51.field835.length <= var50) {
                            class75[] var52 = new class75[var50 + 1];
                            for (int var53 = 0; var53 < var51.field835.length; var53++) {
                                var52[var53] = var51.field835[var53];
                            }
                            var51.field835 = var52;
                        }
                        if (var50 > 0 && var51.field835[var50 - 1] == null) {
                            throw new RuntimeException("" + (var50 - 1));
                        }
                        class75 var54 = new class75();
                        var54.field809 = var49;
                        var54.field738 = var54.field727 = var51.field727;
                        var54.field728 = var50;
                        var54.field726 = true;
                        var51.field835[var50] = var54;
                        if (var47) {
                            Statics.field1432 = var54;
                        } else {
                            Statics.field597 = var54;
                        }
                        client.method319(var51);
                        continue;
                    }
                    if (var351 == 101) {
                        class75 var55 = var47 ? Statics.field1432 : Statics.field597;
                        class75 var56 = class75.method1490(var55.field727);
                        var56.field835[var55.field728] = null;
                        client.method319(var56);
                        continue;
                    }
                    if (var351 == 102) {
                        var4--;
                        class75 var57 = class75.method1490(field593[var4]);
                        var57.field835 = null;
                        client.method319(var57);
                        continue;
                    }
                    if (var351 == 200) {
                        var4 -= 2;
                        int var58 = field593[var4];
                        int var59 = field593[var4 + 1];
                        class75 var60 = class75.method811(var58, var59);
                        if (var60 != null && var59 != -1) {
                            field593[var4++] = 1;
                            if (var47) {
                                Statics.field1432 = var60;
                            } else {
                                Statics.field597 = var60;
                            }
                            continue;
                        }
                        field593[var4++] = 0;
                        continue;
                    }
                } else if (!(var351 < 1000 || var351 >= 1100) || !(var351 < 2000 || var351 >= 2100)) {
                    class75 var61;
                    if (var351 >= 2000) {
                        var351 -= 1000;
                        var4--;
                        var61 = class75.method1490(field593[var4]);
                    } else {
                        var61 = var47 ? Statics.field1432 : Statics.field597;
                    }
                    if (var351 == 1000) {
                        var4 -= 2;
                        var61.field741 = field593[var4];
                        var61.field733 = field593[var4 + 1];
                        client.method319(var61);
                        continue;
                    }
                    if (var351 == 1001) {
                        var4 -= 2;
                        var61.field798 = field593[var4];
                        var61.field737 = field593[var4 + 1];
                        client.method319(var61);
                        continue;
                    }
                    if (var351 == 1003) {
                        var4--;
                        boolean var62 = field593[var4] == 1;
                        if (var61.field765 != var62) {
                            var61.field765 = var62;
                            client.method319(var61);
                        }
                        continue;
                    }
                } else if (var351 >= 1100 && var351 < 1200 || var351 >= 2100 && var351 < 2200) {
                    class75 var63;
                    if (var351 >= 2000) {
                        var351 -= 1000;
                        var4--;
                        var63 = class75.method1490(field593[var4]);
                    } else {
                        var63 = var47 ? Statics.field1432 : Statics.field597;
                    }
                    if (var351 == 1100) {
                        var4 -= 2;
                        var63.field740 = field593[var4];
                        if (var63.field740 > var63.field742 - var63.field798) {
                            var63.field740 = var63.field742 - var63.field798;
                        }
                        if (var63.field740 < 0) {
                            var63.field740 = 0;
                        }
                        var63.field718 = field593[var4 + 1];
                        if (var63.field718 > var63.field763 - var63.field737) {
                            var63.field718 = var63.field763 - var63.field737;
                        }
                        if (var63.field718 < 0) {
                            var63.field718 = 0;
                        }
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1101) {
                        var4--;
                        var63.field719 = field593[var4];
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1102) {
                        var4--;
                        var63.field748 = field593[var4] == 1;
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1103) {
                        var4--;
                        var63.field749 = field593[var4];
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1104) {
                        var4--;
                        var63.field744 = field593[var4];
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1105) {
                        var4--;
                        var63.field751 = field593[var4];
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1106) {
                        var4--;
                        var63.field750 = field593[var4];
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1107) {
                        var4--;
                        var63.field754 = field593[var4] == 1;
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1108) {
                        var63.field825 = 1;
                        var4--;
                        var63.field724 = field593[var4];
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1109) {
                        var4 -= 6;
                        var63.field797 = field593[var4];
                        var63.field766 = field593[var4 + 1];
                        var63.field732 = field593[var4 + 2];
                        var63.field768 = field593[var4 + 3];
                        var63.field819 = field593[var4 + 4];
                        var63.field720 = field593[var4 + 5];
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1110) {
                        var4--;
                        int var64 = field593[var4];
                        if (var63.field822 != var64) {
                            var63.field822 = var64;
                            var63.field774 = 0;
                            var63.field834 = 0;
                            client.method319(var63);
                        }
                        continue;
                    }
                    if (var351 == 1111) {
                        var4--;
                        var63.field772 = field593[var4] == 1;
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1112) {
                        var5--;
                        String var65 = field594[var5];
                        if (!var65.equals(var63.field829)) {
                            var63.field829 = var65;
                            client.method319(var63);
                        }
                        continue;
                    }
                    if (var351 == 1113) {
                        var4--;
                        var63.field812 = field593[var4];
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1114) {
                        var4 -= 3;
                        var63.field739 = field593[var4];
                        var63.field778 = field593[var4 + 1];
                        var63.field776 = field593[var4 + 2];
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1115) {
                        var4--;
                        var63.field773 = field593[var4] == 1;
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1116) {
                        var4--;
                        var63.field755 = field593[var4];
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1117) {
                        var4--;
                        var63.field756 = field593[var4];
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1118) {
                        var4--;
                        var63.field757 = field593[var4] == 1;
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1119) {
                        var4--;
                        var63.field782 = field593[var4] == 1;
                        client.method319(var63);
                        continue;
                    }
                    if (var351 == 1120) {
                        var4 -= 2;
                        var63.field742 = field593[var4];
                        var63.field763 = field593[var4 + 1];
                        client.method319(var63);
                        continue;
                    }
                } else if (var351 >= 1200 && var351 < 1300 || var351 >= 2200 && var351 < 2300) {
                    class75 var66;
                    if (var351 >= 2000) {
                        var351 -= 1000;
                        var4--;
                        var66 = class75.method1490(field593[var4]);
                    } else {
                        var66 = var47 ? Statics.field1432 : Statics.field597;
                    }
                    client.method319(var66);
                    if (var351 == 1200) {
                        var4 -= 2;
                        int var67 = field593[var4];
                        int var68 = field593[var4 + 1];
                        var66.field831 = var67;
                        var66.field832 = var68;
                        class165 var69 = class165.method3520(var67);
                        var66.field732 = var69.field2522;
                        var66.field768 = var69.field2489;
                        var66.field819 = var69.field2474;
                        var66.field797 = var69.field2491;
                        var66.field766 = var69.field2521;
                        var66.field720 = var69.field2487;
                        if (var66.field798 > 0) {
                            var66.field720 = var66.field720 * 32 / var66.field798;
                        }
                        continue;
                    }
                    if (var351 == 1201) {
                        var66.field825 = 2;
                        var4--;
                        var66.field724 = field593[var4];
                        continue;
                    }
                    if (var351 == 1202) {
                        var66.field825 = 3;
                        var66.field724 = Statics.field387.field633.method968();
                        continue;
                    }
                } else if (var351 >= 1300 && var351 < 1400 || var351 >= 2300 && var351 < 2400) {
                    class75 var70;
                    if (var351 >= 2000) {
                        var351 -= 1000;
                        var4--;
                        var70 = class75.method1490(field593[var4]);
                    } else {
                        var70 = var47 ? Statics.field1432 : Statics.field597;
                    }
                    if (var351 == 1300) {
                        var4--;
                        int var71 = field593[var4] - 1;
                        if (var71 >= 0 && var71 <= 9) {
                            var5--;
                            var70.method1010(var71, field594[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var351 == 1301) {
                        var4 -= 2;
                        int var72 = field593[var4];
                        int var73 = field593[var4 + 1];
                        var70.field789 = class75.method811(var72, var73);
                        continue;
                    }
                    if (var351 == 1302) {
                        var4--;
                        var70.field808 = field593[var4] == 1;
                        continue;
                    }
                    if (var351 == 1303) {
                        var4--;
                        var70.field790 = field593[var4];
                        continue;
                    }
                    if (var351 == 1304) {
                        var4--;
                        var70.field813 = field593[var4];
                        continue;
                    }
                    if (var351 == 1305) {
                        var5--;
                        var70.field787 = field594[var5];
                        continue;
                    }
                    if (var351 == 1306) {
                        var5--;
                        var70.field827 = field594[var5];
                        continue;
                    }
                    if (var351 == 1307) {
                        var70.field788 = null;
                        continue;
                    }
                } else {
                    if (var351 >= 1400 && var351 < 1500 || var351 >= 2400 && var351 < 2500) {
                        class75 var74;
                        if (var351 >= 2000) {
                            var351 -= 1000;
                            var4--;
                            var74 = class75.method1490(field593[var4]);
                        } else {
                            var74 = var47 ? Statics.field1432 : Statics.field597;
                        }
                        var5--;
                        String var75 = field594[var5];
                        int[] var76 = null;
                        if (var75.length() > 0 && var75.charAt(var75.length() - 1) == 'Y') {
                            var4--;
                            int var77 = field593[var4];
                            if (var77 > 0) {
                                var76 = new int[var77];
                                while (var77-- > 0) {
                                    var4--;
                                    var76[var77] = field593[var4];
                                }
                            }
                            var75 = var75.substring(0, var75.length() - 1);
                        }
                        Object[] var78 = new Object[var75.length() + 1];
                        for (int var79 = var78.length - 1; var79 >= 1; var79--) {
                            if (var75.charAt(var79 - 1) == 's') {
                                var5--;
                                var78[var79] = field594[var5];
                            } else {
                                var4--;
                                var78[var79] = Integer.valueOf(field593[var4]);
                            }
                        }
                        var4--;
                        int var80 = field593[var4];
                        if (var80 == -1) {
                            var78 = null;
                        } else {
                            var78[0] = Integer.valueOf(var80);
                        }
                        if (var351 == 1400) {
                            var74.field796 = var78;
                        }
                        if (var351 == 1401) {
                            var74.field799 = var78;
                        }
                        if (var351 == 1402) {
                            var74.field722 = var78;
                        }
                        if (var351 == 1403) {
                            var74.field800 = var78;
                        }
                        if (var351 == 1404) {
                            var74.field802 = var78;
                        }
                        if (var351 == 1405) {
                            var74.field803 = var78;
                        }
                        if (var351 == 1406) {
                            var74.field806 = var78;
                        }
                        if (var351 == 1407) {
                            var74.field807 = var78;
                            var74.field779 = var76;
                        }
                        if (var351 == 1408) {
                            var74.field786 = var78;
                        }
                        if (var351 == 1409) {
                            var74.field814 = var78;
                        }
                        if (var351 == 1410) {
                            var74.field810 = var78;
                        }
                        if (var351 == 1411) {
                            var74.field746 = var78;
                        }
                        if (var351 == 1412) {
                            var74.field801 = var78;
                        }
                        if (var351 == 1414) {
                            var74.field793 = var78;
                            var74.field760 = var76;
                        }
                        if (var351 == 1415) {
                            var74.field811 = var78;
                            var74.field795 = var76;
                        }
                        if (var351 == 1416) {
                            var74.field805 = var78;
                        }
                        if (var351 == 1417) {
                            var74.field815 = var78;
                        }
                        if (var351 == 1418) {
                            var74.field816 = var78;
                        }
                        if (var351 == 1419) {
                            var74.field817 = var78;
                        }
                        if (var351 == 1420) {
                            var74.field818 = var78;
                        }
                        if (var351 == 1421) {
                            var74.field836 = var78;
                        }
                        if (var351 == 1422) {
                            var74.field820 = var78;
                        }
                        if (var351 == 1423) {
                            var74.field821 = var78;
                        }
                        if (var351 == 1424) {
                            var74.field785 = var78;
                        }
                        var74.field794 = true;
                        continue;
                    }
                    if (var351 < 1600) {
                        class75 var81 = var47 ? Statics.field1432 : Statics.field597;
                        if (var351 == 1500) {
                            field593[var4++] = var81.field741;
                            continue;
                        }
                        if (var351 == 1501) {
                            field593[var4++] = var81.field733;
                            continue;
                        }
                        if (var351 == 1502) {
                            field593[var4++] = var81.field798;
                            continue;
                        }
                        if (var351 == 1503) {
                            field593[var4++] = var81.field737;
                            continue;
                        }
                        if (var351 == 1504) {
                            field593[var4++] = var81.field765 ? 1 : 0;
                            continue;
                        }
                        if (var351 == 1505) {
                            field593[var4++] = var81.field738;
                            continue;
                        }
                    } else if (var351 < 1700) {
                        class75 var82 = var47 ? Statics.field1432 : Statics.field597;
                        if (var351 == 1600) {
                            field593[var4++] = var82.field740;
                            continue;
                        }
                        if (var351 == 1601) {
                            field593[var4++] = var82.field718;
                            continue;
                        }
                        if (var351 == 1602) {
                            field594[var5++] = var82.field829;
                            continue;
                        }
                        if (var351 == 1603) {
                            field593[var4++] = var82.field742;
                            continue;
                        }
                        if (var351 == 1604) {
                            field593[var4++] = var82.field763;
                            continue;
                        }
                        if (var351 == 1605) {
                            field593[var4++] = var82.field720;
                            continue;
                        }
                        if (var351 == 1606) {
                            field593[var4++] = var82.field732;
                            continue;
                        }
                        if (var351 == 1607) {
                            field593[var4++] = var82.field819;
                            continue;
                        }
                        if (var351 == 1608) {
                            field593[var4++] = var82.field768;
                            continue;
                        }
                    } else if (var351 < 1800) {
                        class75 var83 = var47 ? Statics.field1432 : Statics.field597;
                        if (var351 == 1700) {
                            field593[var4++] = var83.field831;
                            continue;
                        }
                        if (var351 == 1701) {
                            if (var83.field831 == -1) {
                                field593[var4++] = 0;
                            } else {
                                field593[var4++] = var83.field832;
                            }
                            continue;
                        }
                        if (var351 == 1702) {
                            field593[var4++] = var83.field728;
                            continue;
                        }
                    } else if (var351 < 1900) {
                        class75 var84 = var47 ? Statics.field1432 : Statics.field597;
                        if (var351 == 1800) {
                            int[] var85 = field593;
                            int var86 = var4++;
                            int var87 = client.method855(var84);
                            int var88 = var87 >> 11 & 0x3F;
                            var85[var86] = var88;
                            continue;
                        }
                        if (var351 == 1801) {
                            var4--;
                            int var89 = field593[var4];
                            int var352 = var89 - 1;
                            if (var84.field788 != null && var352 < var84.field788.length && var84.field788[var352] != null) {
                                field594[var5++] = var84.field788[var352];
                                continue;
                            }
                            field594[var5++] = "";
                            continue;
                        }
                        if (var351 == 1802) {
                            if (var84.field787 == null) {
                                field594[var5++] = "";
                            } else {
                                field594[var5++] = var84.field787;
                            }
                            continue;
                        }
                    } else if (var351 < 2600) {
                        var4--;
                        class75 var90 = class75.method1490(field593[var4]);
                        if (var351 == 2500) {
                            field593[var4++] = var90.field741;
                            continue;
                        }
                        if (var351 == 2501) {
                            field593[var4++] = var90.field733;
                            continue;
                        }
                        if (var351 == 2502) {
                            field593[var4++] = var90.field798;
                            continue;
                        }
                        if (var351 == 2503) {
                            field593[var4++] = var90.field737;
                            continue;
                        }
                        if (var351 == 2504) {
                            field593[var4++] = var90.field765 ? 1 : 0;
                            continue;
                        }
                        if (var351 == 2505) {
                            field593[var4++] = var90.field738;
                            continue;
                        }
                    } else if (var351 < 2700) {
                        var4--;
                        class75 var91 = class75.method1490(field593[var4]);
                        if (var351 == 2600) {
                            field593[var4++] = var91.field740;
                            continue;
                        }
                        if (var351 == 2601) {
                            field593[var4++] = var91.field718;
                            continue;
                        }
                        if (var351 == 2602) {
                            field594[var5++] = var91.field829;
                            continue;
                        }
                        if (var351 == 2603) {
                            field593[var4++] = var91.field742;
                            continue;
                        }
                        if (var351 == 2604) {
                            field593[var4++] = var91.field763;
                            continue;
                        }
                        if (var351 == 2605) {
                            field593[var4++] = var91.field720;
                            continue;
                        }
                        if (var351 == 2606) {
                            field593[var4++] = var91.field732;
                            continue;
                        }
                        if (var351 == 2607) {
                            field593[var4++] = var91.field819;
                            continue;
                        }
                        if (var351 == 2608) {
                            field593[var4++] = var91.field768;
                            continue;
                        }
                    } else if (var351 < 2800) {
                        if (var351 == 2700) {
                            var4--;
                            class75 var92 = class75.method1490(field593[var4]);
                            field593[var4++] = var92.field831;
                            continue;
                        }
                        if (var351 == 2701) {
                            var4--;
                            class75 var93 = class75.method1490(field593[var4]);
                            if (var93.field831 == -1) {
                                field593[var4++] = 0;
                            } else {
                                field593[var4++] = var93.field832;
                            }
                            continue;
                        }
                        if (var351 == 2702) {
                            var4--;
                            int var94 = field593[var4];
                            class86 var95 = (class86) client.field1636.method20((long) var94);
                            if (var95 == null) {
                                field593[var4++] = 0;
                            } else {
                                field593[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var351 < 2900) {
                        var4--;
                        class75 var96 = class75.method1490(field593[var4]);
                        if (var351 == 2800) {
                            int[] var97 = field593;
                            int var98 = var4++;
                            int var99 = client.method855(var96);
                            int var100 = var99 >> 11 & 0x3F;
                            var97[var98] = var100;
                            continue;
                        }
                        if (var351 == 2801) {
                            var4--;
                            int var101 = field593[var4];
                            int var353 = var101 - 1;
                            if (var96.field788 != null && var353 < var96.field788.length && var96.field788[var353] != null) {
                                field594[var5++] = var96.field788[var353];
                                continue;
                            }
                            field594[var5++] = "";
                            continue;
                        }
                        if (var351 == 2802) {
                            if (var96.field787 == null) {
                                field594[var5++] = "";
                            } else {
                                field594[var5++] = var96.field787;
                            }
                            continue;
                        }
                    } else if (var351 < 3200) {
                        if (var351 == 3100) {
                            var5--;
                            String var102 = field594[var5];
                            client.method862(0, "", var102);
                            continue;
                        }
                        if (var351 == 3101) {
                            var4 -= 2;
                            client.method1053(Statics.field387, field593[var4], field593[var4 + 1]);
                            continue;
                        }
                        if (var351 == 3103) {
                            client.method2360();
                            continue;
                        }
                        if (var351 == 3104) {
                            var5--;
                            String var103 = field594[var5];
                            int var104 = 0;
                            boolean var105 = class99.method2362(var103, 10, true);
                            if (var105) {
                                var104 = class99.method2705(var103);
                            }
                            client.field1515.method2253(117);
                            client.field1515.method360(var104);
                            continue;
                        }
                        if (var351 == 3105) {
                            var5--;
                            String var106 = field594[var5];
                            client.field1515.method2253(125);
                            client.field1515.method357(var106.length() + 1);
                            client.field1515.method506(var106);
                            continue;
                        }
                        if (var351 == 3106) {
                            var5--;
                            String var107 = field594[var5];
                            client.field1515.method2253(161);
                            client.field1515.method357(var107.length() + 1);
                            client.field1515.method506(var107);
                            continue;
                        }
                        if (var351 == 3107) {
                            var4--;
                            int var108 = field593[var4];
                            var5--;
                            String var109 = field594[var5];
                            client.method1165(var108, var109);
                            continue;
                        }
                        if (var351 == 3108) {
                            var4 -= 3;
                            int var110 = field593[var4];
                            int var111 = field593[var4 + 1];
                            int var112 = field593[var4 + 2];
                            class75 var113 = class75.method1490(var112);
                            if (client.field1646 == null && !client.field1633 && var113 != null) {
                                class75 var114 = client.method1055(var113);
                                if (var114 == null) {
                                    var114 = var113.field789;
                                }
                                if (var114 != null) {
                                    client.field1646 = var113;
                                    class75 var116 = client.method1055(var113);
                                    if (var116 == null) {
                                        var116 = var113.field789;
                                    }
                                    client.field1481 = var116;
                                    client.field1648 = var110;
                                    client.field1649 = var111;
                                    Statics.field558 = 0;
                                    client.field1657 = false;
                                }
                            }
                            continue;
                        }
                        if (var351 == 3109) {
                            var4 -= 2;
                            int var118 = field593[var4];
                            int var119 = field593[var4 + 1];
                            class75 var120 = var47 ? Statics.field1432 : Statics.field597;
                            if (client.field1646 == null && !client.field1633 && var120 != null) {
                                class75 var121 = client.method1055(var120);
                                if (var121 == null) {
                                    var121 = var120.field789;
                                }
                                if (var121 != null) {
                                    client.field1646 = var120;
                                    class75 var123 = client.method1055(var120);
                                    if (var123 == null) {
                                        var123 = var120.field789;
                                    }
                                    client.field1481 = var123;
                                    client.field1648 = var118;
                                    client.field1649 = var119;
                                    Statics.field558 = 0;
                                    client.field1657 = false;
                                }
                            }
                            continue;
                        }
                    } else if (var351 < 3300) {
                        if (var351 == 3200) {
                            var4 -= 3;
                            client.method930(field593[var4], field593[var4 + 1], field593[var4 + 2]);
                            continue;
                        }
                        if (var351 == 3201) {
                            var4--;
                            int var125 = field593[var4];
                            if (var125 == -1 && !client.field1489) {
                                class79.method2782();
                            } else if (var125 != -1 && client.field1711 != var125 && client.field1530 != 0 && !client.field1489) {
                                class79.method1982(2, Statics.field1532, var125, 0, client.field1530, false);
                            }
                            client.field1711 = var125;
                            continue;
                        }
                        if (var351 == 3202) {
                            var4 -= 2;
                            int var126 = field593[var4];
                            int var10000 = field593[var4 + 1];
                            if (client.field1530 != 0 && var126 != -1) {
                                class79.method3142(Statics.field937, var126, 0, client.field1530, false);
                                client.field1489 = true;
                            }
                            continue;
                        }
                    } else if (var351 < 3400) {
                        if (var351 == 3300) {
                            field593[var4++] = client.field1483;
                            continue;
                        }
                        if (var351 == 3301) {
                            var4 -= 2;
                            int var128 = field593[var4];
                            int var129 = field593[var4 + 1];
                            field593[var4++] = class62.method1181(var128, var129);
                            continue;
                        }
                        if (var351 == 3302) {
                            var4 -= 2;
                            int var130 = field593[var4];
                            int var131 = field593[var4 + 1];
                            int[] var132 = field593;
                            int var133 = var4++;
                            class62 var134 = (class62) class62.field569.method20((long) var130);
                            int var135;
                            if (var134 == null) {
                                var135 = 0;
                            } else if (var131 >= 0 && var131 < var134.field553.length) {
                                var135 = var134.field553[var131];
                            } else {
                                var135 = 0;
                            }
                            var132[var133] = var135;
                            continue;
                        }
                        if (var351 == 3303) {
                            var4 -= 2;
                            int var136 = field593[var4];
                            int var137 = field593[var4 + 1];
                            int[] var138 = field593;
                            int var139 = var4++;
                            class62 var140 = (class62) class62.field569.method20((long) var136);
                            int var141;
                            if (var140 == null) {
                                var141 = 0;
                            } else if (var137 == -1) {
                                var141 = 0;
                            } else {
                                int var142 = 0;
                                for (int var143 = 0; var143 < var140.field553.length; var143++) {
                                    if (var140.field552[var143] == var137) {
                                        var142 += var140.field553[var143];
                                    }
                                }
                                var141 = var142;
                            }
                            var138[var139] = var141;
                            continue;
                        }
                        if (var351 == 3304) {
                            var4--;
                            int var144 = field593[var4];
                            field593[var4++] = class176.method1332(var144).field2639;
                            continue;
                        }
                        if (var351 == 3305) {
                            var4--;
                            int var145 = field593[var4];
                            field593[var4++] = client.field1551[var145];
                            continue;
                        }
                        if (var351 == 3306) {
                            var4--;
                            int var146 = field593[var4];
                            field593[var4++] = client.field1614[var146];
                            continue;
                        }
                        if (var351 == 3307) {
                            var4--;
                            int var147 = field593[var4];
                            field593[var4++] = client.field1602[var147];
                            continue;
                        }
                        if (var351 == 3308) {
                            int var148 = Statics.field1863;
                            int var149 = (Statics.field387.field2735 >> 7) + Statics.field2469;
                            int var150 = (Statics.field387.field2683 >> 7) + Statics.field622;
                            field593[var4++] = (var148 << 28) + (var149 << 14) + var150;
                            continue;
                        }
                        if (var351 == 3309) {
                            var4--;
                            int var151 = field593[var4];
                            field593[var4++] = var151 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var351 == 3310) {
                            var4--;
                            int var152 = field593[var4];
                            field593[var4++] = var152 >> 28;
                            continue;
                        }
                        if (var351 == 3311) {
                            var4--;
                            int var153 = field593[var4];
                            field593[var4++] = var153 & 0x3FFF;
                            continue;
                        }
                        if (var351 == 3312) {
                            field593[var4++] = client.field1477 ? 1 : 0;
                            continue;
                        }
                        if (var351 == 3313) {
                            var4 -= 2;
                            int var154 = field593[var4] + 32768;
                            int var155 = field593[var4 + 1];
                            field593[var4++] = class62.method1181(var154, var155);
                            continue;
                        }
                        if (var351 == 3314) {
                            var4 -= 2;
                            int var156 = field593[var4] + 32768;
                            int var157 = field593[var4 + 1];
                            int[] var158 = field593;
                            int var159 = var4++;
                            class62 var160 = (class62) class62.field569.method20((long) var156);
                            int var161;
                            if (var160 == null) {
                                var161 = 0;
                            } else if (var157 >= 0 && var157 < var160.field553.length) {
                                var161 = var160.field553[var157];
                            } else {
                                var161 = 0;
                            }
                            var158[var159] = var161;
                            continue;
                        }
                        if (var351 == 3315) {
                            var4 -= 2;
                            int var162 = field593[var4] + 32768;
                            int var163 = field593[var4 + 1];
                            int[] var164 = field593;
                            int var165 = var4++;
                            class62 var166 = (class62) class62.field569.method20((long) var162);
                            int var167;
                            if (var166 == null) {
                                var167 = 0;
                            } else if (var163 == -1) {
                                var167 = 0;
                            } else {
                                int var168 = 0;
                                for (int var169 = 0; var169 < var166.field553.length; var169++) {
                                    if (var166.field552[var169] == var163) {
                                        var168 += var166.field553[var169];
                                    }
                                }
                                var167 = var168;
                            }
                            var164[var165] = var167;
                            continue;
                        }
                        if (var351 == 3316) {
                            if (client.field1534 >= 2) {
                                field593[var4++] = client.field1534;
                            } else {
                                field593[var4++] = 0;
                            }
                            continue;
                        }
                        if (var351 == 3317) {
                            field593[var4++] = client.field1697;
                            continue;
                        }
                        if (var351 == 3318) {
                            field593[var4++] = client.field1687;
                            continue;
                        }
                        if (var351 == 3321) {
                            field593[var4++] = client.field1707;
                            continue;
                        }
                        if (var351 == 3322) {
                            field593[var4++] = client.field1511;
                            continue;
                        }
                        if (var351 == 3323) {
                            if (client.field1592) {
                                field593[var4++] = 1;
                            } else {
                                field593[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var351 < 3500) {
                        if (var351 == 3400) {
                            var4 -= 2;
                            int var170 = field593[var4];
                            int var171 = field593[var4 + 1];
                            class174 var172 = (class174) class174.field2625.method908((long) var170);
                            class174 var173;
                            if (var172 == null) {
                                byte[] var174 = Statics.field2619.method1083(8, var170);
                                class174 var175 = new class174();
                                if (var174 != null) {
                                    var175.method3355(new class31(var174));
                                }
                                class174.field2625.method907(var175, (long) var170);
                                var173 = var175;
                            } else {
                                var173 = var172;
                            }
                            class174 var176 = var173;
                            if (var173.field2622 != 's') {
                            }
                            for (int var177 = 0; var177 < var176.field2620; var177++) {
                                if (var176.field2629[var177] == var171) {
                                    field594[var5++] = var176.field2626[var177];
                                    var176 = null;
                                    break;
                                }
                            }
                            if (var176 != null) {
                                field594[var5++] = var176.field2623;
                            }
                            continue;
                        }
                        if (var351 == 3408) {
                            var4 -= 4;
                            int var178 = field593[var4];
                            int var179 = field593[var4 + 1];
                            int var180 = field593[var4 + 2];
                            int var181 = field593[var4 + 3];
                            class174 var182 = (class174) class174.field2625.method908((long) var180);
                            class174 var183;
                            if (var182 == null) {
                                byte[] var184 = Statics.field2619.method1083(8, var180);
                                class174 var185 = new class174();
                                if (var184 != null) {
                                    var185.method3355(new class31(var184));
                                }
                                class174.field2625.method907(var185, (long) var180);
                                var183 = var185;
                            } else {
                                var183 = var182;
                            }
                            class174 var186 = var183;
                            if (var183.field2621 == var178 && var183.field2622 == var179) {
                                for (int var187 = 0; var187 < var186.field2620; var187++) {
                                    if (var186.field2629[var187] == var181) {
                                        if (var179 == 115) {
                                            field594[var5++] = var186.field2626[var187];
                                        } else {
                                            field593[var4++] = var186.field2627[var187];
                                        }
                                        var186 = null;
                                        break;
                                    }
                                }
                                if (var186 != null) {
                                    if (var179 == 115) {
                                        field594[var5++] = var186.field2623;
                                    } else {
                                        field593[var4++] = var186.field2624;
                                    }
                                }
                                continue;
                            }
                            if (var179 == 115) {
                                field594[var5++] = "null";
                            } else {
                                field593[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var351 < 3700) {
                        if (var351 == 3600) {
                            if (client.field1726 == 0) {
                                field593[var4++] = -2;
                            } else if (client.field1726 == 1) {
                                field593[var4++] = -1;
                            } else {
                                field593[var4++] = client.field1727;
                            }
                            continue;
                        }
                        if (var351 == 3601) {
                            var4--;
                            int var188 = field593[var4];
                            if (client.field1726 == 2 && var188 < client.field1727) {
                                field594[var5++] = client.field1729[var188].field705;
                                continue;
                            }
                            field594[var5++] = "";
                            continue;
                        }
                        if (var351 == 3602) {
                            var4--;
                            int var189 = field593[var4];
                            if (client.field1726 == 2 && var189 < client.field1727) {
                                field593[var4++] = client.field1729[var189].field704;
                                continue;
                            }
                            field593[var4++] = 0;
                            continue;
                        }
                        if (var351 == 3603) {
                            var4--;
                            int var190 = field593[var4];
                            if (client.field1726 == 2 && var190 < client.field1727) {
                                field593[var4++] = client.field1729[var190].field713;
                                continue;
                            }
                            field593[var4++] = 0;
                            continue;
                        }
                        if (var351 == 3604) {
                            var5--;
                            String var191 = field594[var5];
                            var4--;
                            int var192 = field593[var4];
                            client.field1515.method2253(81);
                            client.field1515.method357(class31.method1333(var191) + 1);
                            client.field1515.method506(var191);
                            client.field1515.method393(var192);
                            continue;
                        }
                        if (var351 == 3605) {
                            var5--;
                            String var193 = field594[var5];
                            if (var193 == null) {
                                continue;
                            }
                            if ((client.field1727 < 200 || client.field1613 == 1) && client.field1727 < 400) {
                                String var194 = class57.method1168(var193, Statics.field1104);
                                if (var194 == null) {
                                    continue;
                                }
                                for (int var195 = 0; var195 < client.field1727; var195++) {
                                    class74 var196 = client.field1729[var195];
                                    String var197 = class57.method1168(var196.field705, Statics.field1104);
                                    if (var197 != null && var197.equals(var194)) {
                                        client.method862(0, "", var193 + class98.field1293);
                                        continue label2248;
                                    }
                                    if (var196.field703 != null) {
                                        String var198 = class57.method1168(var196.field703, Statics.field1104);
                                        if (var198 != null && var198.equals(var194)) {
                                            client.method862(0, "", var193 + class98.field1293);
                                            continue label2248;
                                        }
                                    }
                                }
                                for (int var199 = 0; var199 < client.field1731; var199++) {
                                    class105 var200 = client.field1474[var199];
                                    String var201 = class57.method1168(var200.field1449, Statics.field1104);
                                    if (var201 != null && var201.equals(var194)) {
                                        client.method862(0, "", class98.field1167 + var193 + class98.field1363);
                                        continue label2248;
                                    }
                                    if (var200.field1444 != null) {
                                        String var202 = class57.method1168(var200.field1444, Statics.field1104);
                                        if (var202 != null && var202.equals(var194)) {
                                            client.method862(0, "", class98.field1167 + var193 + class98.field1363);
                                            continue label2248;
                                        }
                                    }
                                }
                                if (class57.method1168(Statics.field387.field632, Statics.field1104).equals(var194)) {
                                    client.method862(0, "", class98.field1296);
                                } else {
                                    client.field1515.method2253(227);
                                    client.field1515.method357(class31.method1333(var193));
                                    client.field1515.method506(var193);
                                }
                                continue;
                            }
                            client.method862(0, "", class98.field1292);
                            continue;
                        }
                        if (var351 == 3606) {
                            var5--;
                            String var203 = field594[var5];
                            client.method1545(var203);
                            continue;
                        }
                        if (var351 == 3607) {
                            var5--;
                            String var204 = field594[var5];
                            client.method1549(var204, false);
                            continue;
                        }
                        if (var351 == 3608) {
                            var5--;
                            String var205 = field594[var5];
                            client.method2857(var205);
                            continue;
                        }
                        if (var351 == 3609) {
                            var5--;
                            String var206 = field594[var5];
                            if (var206.startsWith(class94.method1167(0)) || var206.startsWith(class94.method1167(1))) {
                                var206 = var206.substring(7);
                            }
                            field593[var4++] = client.method2211(var206) ? 1 : 0;
                            continue;
                        }
                        if (var351 == 3611) {
                            if (client.field1589 == null) {
                                field594[var5++] = "";
                            } else {
                                field594[var5++] = class34.method2178(client.field1589);
                            }
                            continue;
                        }
                        if (var351 == 3612) {
                            if (client.field1589 == null) {
                                field593[var4++] = 0;
                            } else {
                                field593[var4++] = Statics.field1791;
                            }
                            continue;
                        }
                        if (var351 == 3613) {
                            var4--;
                            int var207 = field593[var4];
                            if (client.field1589 != null && var207 < Statics.field1791) {
                                field594[var5++] = Statics.field854[var207].field482;
                                continue;
                            }
                            field594[var5++] = "";
                            continue;
                        }
                        if (var351 == 3614) {
                            var4--;
                            int var208 = field593[var4];
                            if (client.field1589 != null && var208 < Statics.field1791) {
                                field593[var4++] = Statics.field854[var208].field478;
                                continue;
                            }
                            field593[var4++] = 0;
                            continue;
                        }
                        if (var351 == 3615) {
                            var4--;
                            int var209 = field593[var4];
                            if (client.field1589 != null && var209 < Statics.field1791) {
                                field593[var4++] = Statics.field854[var209].field487;
                                continue;
                            }
                            field593[var4++] = 0;
                            continue;
                        }
                        if (var351 == 3616) {
                            field593[var4++] = Statics.field949;
                            continue;
                        }
                        if (var351 == 3617) {
                            var5--;
                            String var210 = field594[var5];
                            client.method1985(var210);
                            continue;
                        }
                        if (var351 == 3618) {
                            field593[var4++] = Statics.field2577;
                            continue;
                        }
                        if (var351 == 3619) {
                            var5--;
                            String var211 = field594[var5];
                            if (!var211.equals("")) {
                                client.field1515.method2253(33);
                                client.field1515.method357(class31.method1333(var211));
                                client.field1515.method506(var211);
                            }
                            continue;
                        }
                        if (var351 == 3620) {
                            client.method1685();
                            continue;
                        }
                        if (var351 == 3621) {
                            if (client.field1726 == 0) {
                                field593[var4++] = -1;
                            } else {
                                field593[var4++] = client.field1731;
                            }
                            continue;
                        }
                        if (var351 == 3622) {
                            var4--;
                            int var212 = field593[var4];
                            if (client.field1726 != 0 && var212 < client.field1731) {
                                field594[var5++] = client.field1474[var212].field1449;
                                continue;
                            }
                            field594[var5++] = "";
                            continue;
                        }
                        if (var351 == 3623) {
                            var5--;
                            String var213 = field594[var5];
                            if (var213.startsWith(class94.method1167(0)) || var213.startsWith(class94.method1167(1))) {
                                var213 = var213.substring(7);
                            }
                            field593[var4++] = client.method1354(var213) ? 1 : 0;
                            continue;
                        }
                        if (var351 == 3624) {
                            var4--;
                            int var214 = field593[var4];
                            if (Statics.field854 != null && var214 < Statics.field1791 && Statics.field854[var214].field482.equalsIgnoreCase(Statics.field387.field632)) {
                                field593[var4++] = 1;
                                continue;
                            }
                            field593[var4++] = 0;
                            continue;
                        }
                        if (var351 == 3625) {
                            if (client.field1701 == null) {
                                field594[var5++] = "";
                            } else {
                                field594[var5++] = class34.method2178(client.field1701);
                            }
                            continue;
                        }
                    } else if (var351 < 4100) {
                        if (var351 == 4000) {
                            var4 -= 2;
                            int var215 = field593[var4];
                            int var216 = field593[var4 + 1];
                            field593[var4++] = var215 + var216;
                            continue;
                        }
                        if (var351 == 4001) {
                            var4 -= 2;
                            int var217 = field593[var4];
                            int var218 = field593[var4 + 1];
                            field593[var4++] = var217 - var218;
                            continue;
                        }
                        if (var351 == 4002) {
                            var4 -= 2;
                            int var219 = field593[var4];
                            int var220 = field593[var4 + 1];
                            field593[var4++] = var219 * var220;
                            continue;
                        }
                        if (var351 == 4003) {
                            var4 -= 2;
                            int var221 = field593[var4];
                            int var222 = field593[var4 + 1];
                            field593[var4++] = var221 / var222;
                            continue;
                        }
                        if (var351 == 4004) {
                            var4--;
                            int var223 = field593[var4];
                            field593[var4++] = (int) (Math.random() * (double) var223);
                            continue;
                        }
                        if (var351 == 4005) {
                            var4--;
                            int var224 = field593[var4];
                            field593[var4++] = (int) (Math.random() * (double) (var224 + 1));
                            continue;
                        }
                        if (var351 == 4006) {
                            var4 -= 5;
                            int var225 = field593[var4];
                            int var226 = field593[var4 + 1];
                            int var227 = field593[var4 + 2];
                            int var228 = field593[var4 + 3];
                            int var229 = field593[var4 + 4];
                            field593[var4++] = (var226 - var225) * (var229 - var227) / (var228 - var227) + var225;
                            continue;
                        }
                        if (var351 == 4007) {
                            var4 -= 2;
                            int var230 = field593[var4];
                            int var231 = field593[var4 + 1];
                            field593[var4++] = var230 * var231 / 100 + var230;
                            continue;
                        }
                        if (var351 == 4008) {
                            var4 -= 2;
                            int var232 = field593[var4];
                            int var233 = field593[var4 + 1];
                            field593[var4++] = var232 | 0x1 << var233;
                            continue;
                        }
                        if (var351 == 4009) {
                            var4 -= 2;
                            int var234 = field593[var4];
                            int var235 = field593[var4 + 1];
                            field593[var4++] = var234 & -1 - (0x1 << var235);
                            continue;
                        }
                        if (var351 == 4010) {
                            var4 -= 2;
                            int var236 = field593[var4];
                            int var237 = field593[var4 + 1];
                            field593[var4++] = (var236 & 0x1 << var237) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var351 == 4011) {
                            var4 -= 2;
                            int var238 = field593[var4];
                            int var239 = field593[var4 + 1];
                            field593[var4++] = var238 % var239;
                            continue;
                        }
                        if (var351 == 4012) {
                            var4 -= 2;
                            int var240 = field593[var4];
                            int var241 = field593[var4 + 1];
                            if (var240 == 0) {
                                field593[var4++] = 0;
                            } else {
                                field593[var4++] = (int) Math.pow((double) var240, (double) var241);
                            }
                            continue;
                        }
                        if (var351 == 4013) {
                            var4 -= 2;
                            int var242 = field593[var4];
                            int var243 = field593[var4 + 1];
                            if (var242 == 0) {
                                field593[var4++] = 0;
                            } else if (var243 == 0) {
                                field593[var4++] = Integer.MAX_VALUE;
                            } else {
                                field593[var4++] = (int) Math.pow((double) var242, 1.0D / (double) var243);
                            }
                            continue;
                        }
                        if (var351 == 4014) {
                            var4 -= 2;
                            int var244 = field593[var4];
                            int var245 = field593[var4 + 1];
                            field593[var4++] = var244 & var245;
                            continue;
                        }
                        if (var351 == 4015) {
                            var4 -= 2;
                            int var246 = field593[var4];
                            int var247 = field593[var4 + 1];
                            field593[var4++] = var246 | var247;
                            continue;
                        }
                    } else if (var351 < 4200) {
                        if (var351 == 4100) {
                            var5--;
                            String var248 = field594[var5];
                            var4--;
                            int var249 = field593[var4];
                            field594[var5++] = var248 + var249;
                            continue;
                        }
                        if (var351 == 4101) {
                            var5 -= 2;
                            String var250 = field594[var5];
                            String var251 = field594[var5 + 1];
                            field594[var5++] = var250 + var251;
                            continue;
                        }
                        if (var351 == 4102) {
                            var5--;
                            String var252 = field594[var5];
                            var4--;
                            int var253 = field593[var4];
                            field594[var5++] = var252 + class99.method586(var253, true);
                            continue;
                        }
                        if (var351 == 4103) {
                            var5--;
                            String var254 = field594[var5];
                            field594[var5++] = var254.toLowerCase();
                            continue;
                        }
                        if (var351 == 4104) {
                            var4--;
                            int var255 = field593[var4];
                            long var256 = ((long) var255 + 11745L) * 86400000L;
                            field598.setTime(new Date(var256));
                            int var258 = field598.get(5);
                            int var259 = field598.get(2);
                            int var260 = field598.get(1);
                            field594[var5++] = var258 + "-" + field588[var259] + "-" + var260;
                            continue;
                        }
                        if (var351 == 4105) {
                            var5 -= 2;
                            String var261 = field594[var5];
                            String var262 = field594[var5 + 1];
                            if (Statics.field387.field633 != null && Statics.field387.field633.field695) {
                                field594[var5++] = var262;
                                continue;
                            }
                            field594[var5++] = var261;
                            continue;
                        }
                        if (var351 == 4106) {
                            var4--;
                            int var263 = field593[var4];
                            field594[var5++] = Integer.toString(var263);
                            continue;
                        }
                        if (var351 == 4107) {
                            var5 -= 2;
                            field593[var4++] = class99.method829(class64.method861(field594[var5], field594[var5 + 1], client.field1690));
                            continue;
                        }
                        if (var351 == 4108) {
                            var5--;
                            String var264 = field594[var5];
                            var4 -= 2;
                            int var265 = field593[var4];
                            int var266 = field593[var4 + 1];
                            byte[] var267 = Statics.field620.method1083(var266, 0);
                            class23 var268 = new class23(var267);
                            field593[var4++] = var268.method151(var264, var265);
                            continue;
                        }
                        if (var351 == 4109) {
                            var5--;
                            String var269 = field594[var5];
                            var4 -= 2;
                            int var270 = field593[var4];
                            int var271 = field593[var4 + 1];
                            byte[] var272 = Statics.field620.method1083(var271, 0);
                            class23 var273 = new class23(var272);
                            field593[var4++] = var273.method59(var269, var270);
                            continue;
                        }
                        if (var351 == 4110) {
                            var5 -= 2;
                            String var274 = field594[var5];
                            String var275 = field594[var5 + 1];
                            var4--;
                            if (field593[var4] == 1) {
                                field594[var5++] = var274;
                            } else {
                                field594[var5++] = var275;
                            }
                            continue;
                        }
                        if (var351 == 4111) {
                            var5--;
                            String var276 = field594[var5];
                            field594[var5++] = class6.method61(var276);
                            continue;
                        }
                        if (var351 == 4112) {
                            var5--;
                            String var277 = field594[var5];
                            var4--;
                            int var278 = field593[var4];
                            field594[var5++] = var277 + (char) var278;
                            continue;
                        }
                        if (var351 == 4113) {
                            var4--;
                            int var279 = field593[var4];
                            field593[var4++] = class99.method1338((char) var279) ? 1 : 0;
                            continue;
                        }
                        if (var351 == 4114) {
                            var4--;
                            int var280 = field593[var4];
                            int[] var281 = field593;
                            int var282 = var4++;
                            char var283 = (char) var280;
                            boolean var284 = var283 >= '0' && var283 <= '9' || var283 >= 'A' && var283 <= 'Z' || var283 >= 'a' && var283 <= 'z';
                            var281[var282] = var284 ? 1 : 0;
                            continue;
                        }
                        if (var351 == 4115) {
                            var4--;
                            int var285 = field593[var4];
                            int[] var286 = field593;
                            int var287 = var4++;
                            char var288 = (char) var285;
                            boolean var289 = var288 >= 'A' && var288 <= 'Z' || var288 >= 'a' && var288 <= 'z';
                            var286[var287] = var289 ? 1 : 0;
                            continue;
                        }
                        if (var351 == 4116) {
                            var4--;
                            int var290 = field593[var4];
                            int[] var291 = field593;
                            int var292 = var4++;
                            char var293 = (char) var290;
                            boolean var294 = var293 >= '0' && var293 <= '9';
                            var291[var292] = var294 ? 1 : 0;
                            continue;
                        }
                        if (var351 == 4117) {
                            var5--;
                            String var295 = field594[var5];
                            if (var295 == null) {
                                field593[var4++] = 0;
                            } else {
                                field593[var4++] = var295.length();
                            }
                            continue;
                        }
                        if (var351 == 4118) {
                            var5--;
                            String var296 = field594[var5];
                            var4 -= 2;
                            int var297 = field593[var4];
                            int var298 = field593[var4 + 1];
                            field594[var5++] = var296.substring(var297, var298);
                            continue;
                        }
                        if (var351 == 4119) {
                            var5--;
                            String var299 = field594[var5];
                            StringBuilder var300 = new StringBuilder(var299.length());
                            boolean var301 = false;
                            for (int var302 = 0; var302 < var299.length(); var302++) {
                                char var303 = var299.charAt(var302);
                                if (var303 == '<') {
                                    var301 = true;
                                } else if (var303 == '>') {
                                    var301 = false;
                                } else if (!var301) {
                                    var300.append(var303);
                                }
                            }
                            field594[var5++] = var300.toString();
                            continue;
                        }
                        if (var351 == 4120) {
                            var5--;
                            String var304 = field594[var5];
                            var4--;
                            int var305 = field593[var4];
                            field593[var4++] = var304.indexOf(var305);
                            continue;
                        }
                    } else if (var351 < 4300) {
                        if (var351 == 4200) {
                            var4--;
                            int var306 = field593[var4];
                            field594[var5++] = class165.method3520(var306).field2482;
                            continue;
                        }
                        if (var351 == 4201) {
                            var4 -= 2;
                            int var307 = field593[var4];
                            int var308 = field593[var4 + 1];
                            class165 var309 = class165.method3520(var307);
                            if (var308 >= 1 && var308 <= 5 && var309.field2486[var308 - 1] != null) {
                                field594[var5++] = var309.field2486[var308 - 1];
                                continue;
                            }
                            field594[var5++] = "";
                            continue;
                        }
                        if (var351 == 4202) {
                            var4 -= 2;
                            int var310 = field593[var4];
                            int var311 = field593[var4 + 1];
                            class165 var312 = class165.method3520(var310);
                            if (var311 >= 1 && var311 <= 5 && var312.field2497[var311 - 1] != null) {
                                field594[var5++] = var312.field2497[var311 - 1];
                                continue;
                            }
                            field594[var5++] = "";
                            continue;
                        }
                        if (var351 == 4203) {
                            var4--;
                            int var313 = field593[var4];
                            field593[var4++] = class165.method3520(var313).field2494;
                            continue;
                        }
                        if (var351 == 4204) {
                            var4--;
                            int var314 = field593[var4];
                            field593[var4++] = class165.method3520(var314).field2493 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var351 == 4205) {
                            var4--;
                            int var315 = field593[var4];
                            class165 var316 = class165.method3520(var315);
                            if (var316.field2518 == -1 && var316.field2512 >= 0) {
                                field593[var4++] = var316.field2512;
                                continue;
                            }
                            field593[var4++] = var315;
                            continue;
                        }
                        if (var351 == 4206) {
                            var4--;
                            int var317 = field593[var4];
                            class165 var318 = class165.method3520(var317);
                            if (var318.field2518 >= 0 && var318.field2512 >= 0) {
                                field593[var4++] = var318.field2512;
                                continue;
                            }
                            field593[var4++] = var317;
                            continue;
                        }
                        if (var351 == 4207) {
                            var4--;
                            int var319 = field593[var4];
                            field593[var4++] = class165.method3520(var319).field2495 ? 1 : 0;
                            continue;
                        }
                    } else if (var351 < 5100) {
                        if (var351 == 5000) {
                            field593[var4++] = client.field1692;
                            continue;
                        }
                        if (var351 == 5001) {
                            var4 -= 3;
                            client.field1692 = field593[var4];
                            int var320 = field593[var4 + 1];
                            class93[] var321 = new class93[] { class93.field1083, class93.field1078, class93.field1085 };
                            class93[] var322 = var321;
                            int var323 = 0;
                            class93 var325;
                            while (true) {
                                if (var323 >= var322.length) {
                                    var325 = null;
                                    break;
                                }
                                class93 var324 = var322[var323];
                                if (var324.field1080 == var320) {
                                    var325 = var324;
                                    break;
                                }
                                var323++;
                            }
                            Statics.field1039 = var325;
                            if (Statics.field1039 == null) {
                                Statics.field1039 = class93.field1078;
                            }
                            client.field1566 = field593[var4 + 2];
                            client.field1515.method2253(123);
                            client.field1515.method357(client.field1692);
                            client.field1515.method357(Statics.field1039.field1080);
                            client.field1515.method357(client.field1566);
                            continue;
                        }
                        if (var351 == 5002) {
                            var5--;
                            String var326 = field594[var5];
                            var4 -= 2;
                            int var327 = field593[var4];
                            int var328 = field593[var4 + 1];
                            client.field1515.method2253(77);
                            client.field1515.method357(class31.method1333(var326) + 2);
                            client.field1515.method506(var326);
                            client.field1515.method357(var327 - 1);
                            client.field1515.method357(var328);
                            continue;
                        }
                        if (var351 == 5003) {
                            var4--;
                            int var329 = field593[var4];
                            String var330 = null;
                            if (var329 < 100) {
                                var330 = client.field1689[var329];
                            }
                            if (var330 == null) {
                                var330 = "";
                            }
                            field594[var5++] = var330;
                            continue;
                        }
                        if (var351 == 5004) {
                            var4--;
                            int var331 = field593[var4];
                            int var332 = -1;
                            if (var331 < 100 && client.field1689[var331] != null) {
                                var332 = client.field1686[var331];
                            }
                            field593[var4++] = var332;
                            continue;
                        }
                        if (var351 == 5005) {
                            if (Statics.field1039 == null) {
                                field593[var4++] = -1;
                            } else {
                                field593[var4++] = Statics.field1039.field1080;
                            }
                            continue;
                        }
                        if (var351 == 5008) {
                            var5--;
                            String var333 = field594[var5];
                            if (var333.startsWith("::")) {
                                client.method3568(var333);
                            } else {
                                String var334 = var333.toLowerCase();
                                byte var335 = 0;
                                if (var334.startsWith(class98.field1302)) {
                                    var335 = 0;
                                    var333 = var333.substring(class98.field1302.length());
                                } else if (var334.startsWith(class98.field1304)) {
                                    var335 = 1;
                                    var333 = var333.substring(class98.field1304.length());
                                } else if (var334.startsWith(class98.field1230)) {
                                    var335 = 2;
                                    var333 = var333.substring(class98.field1230.length());
                                } else if (var334.startsWith(class98.field1333)) {
                                    var335 = 3;
                                    var333 = var333.substring(class98.field1333.length());
                                } else if (var334.startsWith(class98.field1310)) {
                                    var335 = 4;
                                    var333 = var333.substring(class98.field1310.length());
                                } else if (var334.startsWith(class98.field1312)) {
                                    var335 = 5;
                                    var333 = var333.substring(class98.field1312.length());
                                } else if (var334.startsWith(class98.field1314)) {
                                    var335 = 6;
                                    var333 = var333.substring(class98.field1314.length());
                                } else if (var334.startsWith(class98.field1316)) {
                                    var335 = 7;
                                    var333 = var333.substring(class98.field1316.length());
                                } else if (var334.startsWith(class98.field1356)) {
                                    var335 = 8;
                                    var333 = var333.substring(class98.field1356.length());
                                } else if (var334.startsWith(class98.field1320)) {
                                    var335 = 9;
                                    var333 = var333.substring(class98.field1320.length());
                                } else if (var334.startsWith(class98.field1162)) {
                                    var335 = 10;
                                    var333 = var333.substring(class98.field1162.length());
                                } else if (var334.startsWith(class98.field1324)) {
                                    var335 = 11;
                                    var333 = var333.substring(class98.field1324.length());
                                } else if (client.field1690 != 0) {
                                    if (var334.startsWith(class98.field1303)) {
                                        var335 = 0;
                                        var333 = var333.substring(class98.field1303.length());
                                    } else if (var334.startsWith(class98.field1305)) {
                                        var335 = 1;
                                        var333 = var333.substring(class98.field1305.length());
                                    } else if (var334.startsWith(class98.field1307)) {
                                        var335 = 2;
                                        var333 = var333.substring(class98.field1307.length());
                                    } else if (var334.startsWith(class98.field1214)) {
                                        var335 = 3;
                                        var333 = var333.substring(class98.field1214.length());
                                    } else if (var334.startsWith(class98.field1358)) {
                                        var335 = 4;
                                        var333 = var333.substring(class98.field1358.length());
                                    } else if (var334.startsWith(class98.field1165)) {
                                        var335 = 5;
                                        var333 = var333.substring(class98.field1165.length());
                                    } else if (var334.startsWith(class98.field1315)) {
                                        var335 = 6;
                                        var333 = var333.substring(class98.field1315.length());
                                    } else if (var334.startsWith(class98.field1317)) {
                                        var335 = 7;
                                        var333 = var333.substring(class98.field1317.length());
                                    } else if (var334.startsWith(class98.field1319)) {
                                        var335 = 8;
                                        var333 = var333.substring(class98.field1319.length());
                                    } else if (var334.startsWith(class98.field1321)) {
                                        var335 = 9;
                                        var333 = var333.substring(class98.field1321.length());
                                    } else if (var334.startsWith(class98.field1330)) {
                                        var335 = 10;
                                        var333 = var333.substring(class98.field1330.length());
                                    } else if (var334.startsWith(class98.field1325)) {
                                        var335 = 11;
                                        var333 = var333.substring(class98.field1325.length());
                                    }
                                }
                                String var336 = var333.toLowerCase();
                                byte var337 = 0;
                                if (var336.startsWith(class98.field1326)) {
                                    var337 = 1;
                                    var333 = var333.substring(class98.field1326.length());
                                } else if (var336.startsWith(class98.field1328)) {
                                    var337 = 2;
                                    var333 = var333.substring(class98.field1328.length());
                                } else if (var336.startsWith(class98.field1193)) {
                                    var337 = 3;
                                    var333 = var333.substring(class98.field1193.length());
                                } else if (var336.startsWith(class98.field1332)) {
                                    var337 = 4;
                                    var333 = var333.substring(class98.field1332.length());
                                } else if (var336.startsWith(class98.field1334)) {
                                    var337 = 5;
                                    var333 = var333.substring(class98.field1334.length());
                                } else if (client.field1690 != 0) {
                                    if (var336.startsWith(class98.field1327)) {
                                        var337 = 1;
                                        var333 = var333.substring(class98.field1327.length());
                                    } else if (var336.startsWith(class98.field1187)) {
                                        var337 = 2;
                                        var333 = var333.substring(class98.field1187.length());
                                    } else if (var336.startsWith(class98.field1331)) {
                                        var337 = 3;
                                        var333 = var333.substring(class98.field1331.length());
                                    } else if (var336.startsWith(class98.field1184)) {
                                        var337 = 4;
                                        var333 = var333.substring(class98.field1184.length());
                                    } else if (var336.startsWith(class98.field1188)) {
                                        var337 = 5;
                                        var333 = var333.substring(class98.field1188.length());
                                    }
                                }
                                client.field1515.method2253(241);
                                client.field1515.method357(0);
                                int var338 = client.field1515.field172;
                                client.field1515.method357(var335);
                                client.field1515.method357(var337);
                                class24.method1983(client.field1515, var333);
                                client.field1515.method368(client.field1515.field172 - var338);
                            }
                            continue;
                        }
                        if (var351 == 5009) {
                            var5 -= 2;
                            String var339 = field594[var5];
                            String var340 = field594[var5 + 1];
                            client.field1515.method2253(58);
                            client.field1515.method358(0);
                            int var341 = client.field1515.field172;
                            client.field1515.method506(var339);
                            class24.method1983(client.field1515, var340);
                            client.field1515.method367(client.field1515.field172 - var341);
                            continue;
                        }
                        if (var351 == 5010) {
                            var4--;
                            int var342 = field593[var4];
                            String var343 = null;
                            if (var342 < 100) {
                                var343 = client.field1710[var342];
                            }
                            if (var343 == null) {
                                var343 = "";
                            }
                            field594[var5++] = var343;
                            continue;
                        }
                        if (var351 == 5011) {
                            var4--;
                            int var344 = field593[var4];
                            String var345 = null;
                            if (var344 < 100) {
                                var345 = client.field1688[var344];
                            }
                            if (var345 == null) {
                                var345 = "";
                            }
                            field594[var5++] = var345;
                            continue;
                        }
                        if (var351 == 5015) {
                            String var346;
                            if (Statics.field387 == null || Statics.field387.field632 == null) {
                                var346 = "";
                            } else {
                                var346 = Statics.field387.field632;
                            }
                            field594[var5++] = var346;
                            continue;
                        }
                        if (var351 == 5016) {
                            field593[var4++] = client.field1566;
                            continue;
                        }
                        if (var351 == 5017) {
                            field593[var4++] = client.field1516;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var350) {
            StringBuilder var348 = new StringBuilder(30);
            var348.append("").append(var3.field11).append(" ");
            for (int var349 = field595 - 1; var349 >= 0; var349--) {
                var348.append("").append(field596[var349].field941.field11).append(" ");
            }
            var348.append("").append(var9);
            class156.method2297(var348.toString(), var350);
        }
    }
}
