package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ao")
public class class34 {

    @ObfuscatedName("ao.s")
    public static int[] field761 = new int[5];

    @ObfuscatedName("ao.j")
    public static int[][] field765 = new int[5][5000];

    @ObfuscatedName("ao.f")
    public static int[] field762 = new int[1000];

    @ObfuscatedName("ao.b")
    public static String[] field764 = new String[1000];

    @ObfuscatedName("ao.t")
    public static int field768 = 0;

    @ObfuscatedName("ao.i")
    public static class14[] field769 = new class14[50];

    @ObfuscatedName("ao.x")
    public static Calendar field772 = Calendar.getInstance();

    @ObfuscatedName("ao.e")
    public static final String[] field773 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ao.q")
    public static int field774 = 0;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.n(Ln;B)V")
    public static void method97(class1 arg0) {
        method98(arg0, 200000);
    }

    @ObfuscatedName("b.g(Ln;II)V")
    public static void method98(class1 arg0, int arg1) {
        Object[] var2 = arg0.field16;
        int var3 = (Integer) var2[0];
        class20 var4 = class20.method160(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field581;
        int[] var9 = var4.field582;
        byte var10 = -1;
        field768 = 0;
        try {
            Statics.field777 = new int[var4.field589];
            int var11 = 0;
            Statics.field763 = new String[var4.field587];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field2;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2717;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field14;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2649;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2717;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2649;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field5;
                    }
                    Statics.field777[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field763[var12++] = var15;
                }
            }
            int var16 = 0;
            field774 = arg0.field11;
            label2970: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var470 = var8[var7];
                if (var470 < 100) {
                    if (var470 == 0) {
                        field762[var5++] = var9[var7];
                        continue;
                    }
                    if (var470 == 1) {
                        int var17 = var9[var7];
                        field762[var5++] = class167.field2796[var17];
                        continue;
                    }
                    if (var470 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class167.field2796[var18] = field762[var5];
                        client.method2484(var18);
                        continue;
                    }
                    if (var470 == 3) {
                        field764[var6++] = var4.field583[var7];
                        continue;
                    }
                    if (var470 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var470 == 7) {
                        var5 -= 2;
                        if (field762[var5 + 1] != field762[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 8) {
                        var5 -= 2;
                        if (field762[var5 + 1] == field762[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 9) {
                        var5 -= 2;
                        if (field762[var5] < field762[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 10) {
                        var5 -= 2;
                        if (field762[var5] > field762[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 21) {
                        if (field768 == 0) {
                            return;
                        }
                        class14 var19 = field769[--field768];
                        var4 = var19.field208;
                        var8 = var4.field581;
                        var9 = var4.field582;
                        var7 = var19.field215;
                        Statics.field777 = var19.field209;
                        Statics.field763 = var19.field212;
                        continue;
                    }
                    if (var470 == 25) {
                        int var20 = var9[var7];
                        field762[var5++] = Statics.method110(var20);
                        continue;
                    }
                    if (var470 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class167.method1856(var21, field762[var5]);
                        continue;
                    }
                    if (var470 == 31) {
                        var5 -= 2;
                        if (field762[var5] <= field762[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 32) {
                        var5 -= 2;
                        if (field762[var5] >= field762[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 33) {
                        field762[var5++] = Statics.field777[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var470 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field777[var10001] = field762[var5];
                        continue;
                    }
                    if (var470 == 35) {
                        field764[var6++] = Statics.field763[var9[var7]];
                        continue;
                    }
                    if (var470 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field763[var10001] = field764[var6];
                        continue;
                    }
                    if (var470 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field764;
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
                        field764[var6++] = var24;
                        continue;
                    }
                    if (var470 == 38) {
                        var5--;
                        continue;
                    }
                    if (var470 == 39) {
                        var6--;
                        continue;
                    }
                    if (var470 == 40) {
                        int var34 = var9[var7];
                        class20 var35 = class20.method160(var34);
                        int[] var36 = new int[var35.field589];
                        String[] var37 = new String[var35.field587];
                        for (int var38 = 0; var38 < var35.field586; var38++) {
                            var36[var38] = field762[var5 - var35.field586 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field584; var39++) {
                            var37[var39] = field764[var6 - var35.field584 + var39];
                        }
                        var5 -= var35.field586;
                        var6 -= var35.field584;
                        class14 var40 = new class14();
                        var40.field208 = var4;
                        var40.field215 = var7;
                        var40.field209 = Statics.field777;
                        var40.field212 = Statics.field763;
                        field769[++field768 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field581;
                        var9 = var35.field582;
                        var7 = -1;
                        Statics.field777 = var36;
                        Statics.field763 = var37;
                        continue;
                    }
                    if (var470 == 42) {
                        field762[var5++] = client.field534[var9[var7]];
                        continue;
                    }
                    if (var470 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field534[var10001] = field762[var5];
                        continue;
                    }
                    if (var470 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field762[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field761[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2970;
                                }
                                field765[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var470 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field762[var5];
                        if (var47 >= 0 && var47 < field761[var46]) {
                            field762[var5++] = field765[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var470 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field762[var5];
                        if (var49 >= 0 && var49 < field761[var48]) {
                            field765[var48][var49] = field762[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var470 == 47) {
                        String var50 = client.field438[var9[var7]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field764[var6++] = var50;
                        continue;
                    }
                    if (var470 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field438[var10001] = field764[var6];
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var470 < 1000) {
                    if (var470 == 100) {
                        var5 -= 3;
                        int var52 = field762[var5];
                        int var53 = field762[var5 + 1];
                        int var54 = field762[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class164 var55 = class164.method560(var52);
                        if (var55.field2770 == null) {
                            var55.field2770 = new class164[var54 + 1];
                        }
                        if (var55.field2770.length <= var54) {
                            class164[] var56 = new class164[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2770.length; var57++) {
                                var56[var57] = var55.field2770[var57];
                            }
                            var55.field2770 = var56;
                        }
                        if (var54 > 0 && var55.field2770[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class164 var58 = new class164();
                        var58.field2650 = var53;
                        var58.field2724 = var58.field2717 = var55.field2717;
                        var58.field2649 = var54;
                        var58.field2647 = true;
                        var55.field2770[var54] = var58;
                        if (var51) {
                            Statics.field771 = var58;
                        } else {
                            Statics.field770 = var58;
                        }
                        client.method572(var55);
                        continue;
                    }
                    if (var470 == 101) {
                        class164 var59 = var51 ? Statics.field771 : Statics.field770;
                        class164 var60 = class164.method560(var59.field2717);
                        var60.field2770[var59.field2649] = null;
                        client.method572(var60);
                        continue;
                    }
                    if (var470 == 102) {
                        var5--;
                        class164 var61 = class164.method560(field762[var5]);
                        var61.field2770 = null;
                        client.method572(var61);
                        continue;
                    }
                    if (var470 == 200) {
                        var5 -= 2;
                        int var62 = field762[var5];
                        int var63 = field762[var5 + 1];
                        class164 var64 = class164.method554(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field762[var5++] = 1;
                            if (var51) {
                                Statics.field771 = var64;
                            } else {
                                Statics.field770 = var64;
                            }
                            continue;
                        }
                        field762[var5++] = 0;
                        continue;
                    }
                } else if (!(var470 < 1000 || var470 >= 1100) || !(var470 < 2000 || var470 >= 2100)) {
                    int var65 = -1;
                    class164 var66;
                    if (var470 >= 2000) {
                        var470 -= 1000;
                        var5--;
                        var65 = field762[var5];
                        var66 = class164.method560(var65);
                    } else {
                        var66 = var51 ? Statics.field771 : Statics.field770;
                    }
                    if (var470 == 1000) {
                        var5 -= 4;
                        var66.field2657 = field762[var5];
                        var66.field2658 = field762[var5 + 1];
                        var66.field2779 = field762[var5 + 2];
                        var66.field2654 = field762[var5 + 3];
                        client.method572(var66);
                        client.method666(var66);
                        if (var65 != -1 && var66.field2650 == 0) {
                            client.method3375(Statics.field2764[var65 >> 16], var66, false);
                        }
                        continue;
                    }
                    if (var470 == 1001) {
                        var5 -= 4;
                        var66.field2659 = field762[var5];
                        var66.field2660 = field762[var5 + 1];
                        var66.field2655 = field762[var5 + 2];
                        var66.field2745 = field762[var5 + 3];
                        client.method572(var66);
                        client.method666(var66);
                        if (var65 != -1 && var66.field2650 == 0) {
                            client.method3375(Statics.field2764[var65 >> 16], var66, false);
                        }
                        continue;
                    }
                    if (var470 == 1003) {
                        var5--;
                        boolean var67 = field762[var5] == 1;
                        if (var66.field2668 != var67) {
                            var66.field2668 = var67;
                            client.method572(var66);
                        }
                        continue;
                    }
                    if (var470 == 1005) {
                        var5--;
                        var66.field2662 = field762[var5] == 1;
                        continue;
                    }
                } else if (!(var470 < 1100 || var470 >= 1200) || !(var470 < 2100 || var470 >= 2200)) {
                    int var68 = -1;
                    class164 var69;
                    if (var470 >= 2000) {
                        var470 -= 1000;
                        var5--;
                        var68 = field762[var5];
                        var69 = class164.method560(var68);
                    } else {
                        var69 = var51 ? Statics.field771 : Statics.field770;
                    }
                    if (var470 == 1100) {
                        var5 -= 2;
                        var69.field2669 = field762[var5];
                        if (var69.field2669 > var69.field2645 - var69.field2663) {
                            var69.field2669 = var69.field2645 - var69.field2663;
                        }
                        if (var69.field2669 < 0) {
                            var69.field2669 = 0;
                        }
                        var69.field2739 = field762[var5 + 1];
                        if (var69.field2739 > var69.field2672 - var69.field2765) {
                            var69.field2739 = var69.field2672 - var69.field2765;
                        }
                        if (var69.field2739 < 0) {
                            var69.field2739 = 0;
                        }
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1101) {
                        var5--;
                        var69.field2742 = field762[var5];
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1102) {
                        var5--;
                        var69.field2677 = field762[var5] == 1;
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1103) {
                        var5--;
                        var69.field2678 = field762[var5];
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1104) {
                        var5--;
                        var69.field2679 = field762[var5];
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1105) {
                        var5--;
                        var69.field2695 = field762[var5];
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1106) {
                        var5--;
                        var69.field2683 = field762[var5];
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1107) {
                        var5--;
                        var69.field2684 = field762[var5] == 1;
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1108) {
                        var69.field2689 = 1;
                        var5--;
                        var69.field2690 = field762[var5];
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1109) {
                        var5 -= 6;
                        var69.field2718 = field762[var5];
                        var69.field2696 = field762[var5 + 1];
                        var69.field2706 = field762[var5 + 2];
                        var69.field2698 = field762[var5 + 3];
                        var69.field2670 = field762[var5 + 4];
                        var69.field2700 = field762[var5 + 5];
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1110) {
                        var5--;
                        int var70 = field762[var5];
                        if (var69.field2693 != var70) {
                            var69.field2693 = var70;
                            var69.field2768 = 0;
                            var69.field2769 = 0;
                            client.method572(var69);
                        }
                        continue;
                    }
                    if (var470 == 1111) {
                        var5--;
                        var69.field2703 = field762[var5] == 1;
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1112) {
                        var6--;
                        String var71 = field764[var6];
                        if (!var71.equals(var69.field2680)) {
                            var69.field2680 = var71;
                            client.method572(var69);
                        }
                        continue;
                    }
                    if (var470 == 1113) {
                        var5--;
                        var69.field2705 = field762[var5];
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1114) {
                        var5 -= 3;
                        var69.field2709 = field762[var5];
                        var69.field2710 = field762[var5 + 1];
                        var69.field2708 = field762[var5 + 2];
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1115) {
                        var5--;
                        var69.field2711 = field762[var5] == 1;
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1116) {
                        var5--;
                        var69.field2685 = field762[var5];
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1117) {
                        var5--;
                        var69.field2686 = field762[var5];
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1118) {
                        var5--;
                        var69.field2777 = field762[var5] == 1;
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1119) {
                        var5--;
                        var69.field2688 = field762[var5] == 1;
                        client.method572(var69);
                        continue;
                    }
                    if (var470 == 1120) {
                        var5 -= 2;
                        var69.field2645 = field762[var5];
                        var69.field2672 = field762[var5 + 1];
                        client.method572(var69);
                        if (var68 != -1 && var69.field2650 == 0) {
                            client.method3375(Statics.field2764[var68 >> 16], var69, false);
                        }
                        continue;
                    }
                    if (var470 == 1121) {
                        int var72 = var69.field2717;
                        int var73 = var69.field2649;
                        client.field320.method2453(216);
                        client.field320.method2246(var73);
                        client.field320.method2257(var72);
                        client.field546 = var69;
                        client.method572(var69);
                        continue;
                    }
                } else if (!(var470 < 1200 || var470 >= 1300) || !(var470 < 2200 || var470 >= 2300)) {
                    class164 var74;
                    if (var470 >= 2000) {
                        var470 -= 1000;
                        var5--;
                        var74 = class164.method560(field762[var5]);
                    } else {
                        var74 = var51 ? Statics.field771 : Statics.field770;
                    }
                    client.method572(var74);
                    if (var470 == 1200 || var470 == 1205 || var470 == 1212) {
                        var5 -= 2;
                        int var75 = field762[var5];
                        int var76 = field762[var5 + 1];
                        var74.field2667 = var75;
                        var74.field2743 = var76;
                        class47 var77 = class47.method2845(var75);
                        var74.field2706 = var77.field1084;
                        var74.field2698 = var77.field1071;
                        var74.field2670 = var77.field1086;
                        var74.field2718 = var77.field1087;
                        var74.field2696 = var77.field1101;
                        var74.field2700 = var77.field1083;
                        if (var470 == 1205) {
                            var74.field2641 = 0;
                        } else if (var470 == 1212 | var77.field1092 == 1) {
                            var74.field2641 = 1;
                        } else {
                            var74.field2641 = 2;
                        }
                        if (var74.field2723 > 0) {
                            var74.field2700 = var74.field2700 * 32 / var74.field2723;
                        } else if (var74.field2659 > 0) {
                            var74.field2700 = var74.field2700 * 32 / var74.field2659;
                        }
                        continue;
                    }
                    if (var470 == 1201) {
                        var74.field2689 = 2;
                        var5--;
                        var74.field2690 = field762[var5];
                        continue;
                    }
                    if (var470 == 1202) {
                        var74.field2689 = 3;
                        var74.field2690 = Statics.field1994.field47.method3125();
                        continue;
                    }
                } else if ((var470 < 1300 || var470 >= 1400) && (var470 < 2300 || var470 >= 2400)) {
                    if (var470 >= 1400 && var470 < 1500 || var470 >= 2400 && var470 < 2500) {
                        class164 var82;
                        if (var470 >= 2000) {
                            var470 -= 1000;
                            var5--;
                            var82 = class164.method560(field762[var5]);
                        } else {
                            var82 = var51 ? Statics.field771 : Statics.field770;
                        }
                        var6--;
                        String var83 = field764[var6];
                        int[] var84 = null;
                        if (var83.length() > 0 && var83.charAt(var83.length() - 1) == 'Y') {
                            var5--;
                            int var85 = field762[var5];
                            if (var85 > 0) {
                                var84 = new int[var85];
                                while (var85-- > 0) {
                                    var5--;
                                    var84[var85] = field762[var5];
                                }
                            }
                            var83 = var83.substring(0, var83.length() - 1);
                        }
                        Object[] var86 = new Object[var83.length() + 1];
                        for (int var87 = var86.length - 1; var87 >= 1; var87--) {
                            if (var83.charAt(var87 - 1) == 's') {
                                var6--;
                                var86[var87] = field764[var6];
                            } else {
                                var5--;
                                var86[var87] = Integer.valueOf(field762[var5]);
                            }
                        }
                        var5--;
                        int var88 = field762[var5];
                        if (var88 == -1) {
                            var86 = null;
                        } else {
                            var86[0] = Integer.valueOf(var88);
                        }
                        if (var470 == 1400) {
                            var82.field2656 = var86;
                        }
                        if (var470 == 1401) {
                            var82.field2664 = var86;
                        }
                        if (var470 == 1402) {
                            var82.field2730 = var86;
                        }
                        if (var470 == 1403) {
                            var82.field2697 = var86;
                        }
                        if (var470 == 1404) {
                            var82.field2772 = var86;
                        }
                        if (var470 == 1405) {
                            var82.field2754 = var86;
                        }
                        if (var470 == 1406) {
                            var82.field2738 = var86;
                        }
                        if (var470 == 1407) {
                            var82.field2780 = var86;
                            var82.field2740 = var84;
                        }
                        if (var470 == 1408) {
                            var82.field2681 = var86;
                        }
                        if (var470 == 1409) {
                            var82.field2746 = var86;
                        }
                        if (var470 == 1410) {
                            var82.field2736 = var86;
                        }
                        if (var470 == 1411) {
                            var82.field2729 = var86;
                        }
                        if (var470 == 1412) {
                            var82.field2733 = var86;
                        }
                        if (var470 == 1414) {
                            var82.field2741 = var86;
                            var82.field2713 = var84;
                        }
                        if (var470 == 1415) {
                            var82.field2776 = var86;
                            var82.field2744 = var84;
                        }
                        if (var470 == 1416) {
                            var82.field2737 = var86;
                        }
                        if (var470 == 1417) {
                            var82.field2747 = var86;
                        }
                        if (var470 == 1418) {
                            var82.field2728 = var86;
                        }
                        if (var470 == 1419) {
                            var82.field2749 = var86;
                        }
                        if (var470 == 1420) {
                            var82.field2750 = var86;
                        }
                        if (var470 == 1421) {
                            var82.field2751 = var86;
                        }
                        if (var470 == 1422) {
                            var82.field2725 = var86;
                        }
                        if (var470 == 1423) {
                            var82.field2753 = var86;
                        }
                        if (var470 == 1424) {
                            var82.field2722 = var86;
                        }
                        if (var470 == 1425) {
                            var82.field2771 = var86;
                        }
                        if (var470 == 1426) {
                            var82.field2757 = var86;
                        }
                        if (var470 == 1427) {
                            var82.field2674 = var86;
                        }
                        var82.field2726 = true;
                        continue;
                    }
                    if (var470 < 1600) {
                        class164 var89 = var51 ? Statics.field771 : Statics.field770;
                        if (var470 == 1500) {
                            field762[var5++] = var89.field2661;
                            continue;
                        }
                        if (var470 == 1501) {
                            field762[var5++] = var89.field2734;
                            continue;
                        }
                        if (var470 == 1502) {
                            field762[var5++] = var89.field2663;
                            continue;
                        }
                        if (var470 == 1503) {
                            field762[var5++] = var89.field2765;
                            continue;
                        }
                        if (var470 == 1504) {
                            field762[var5++] = var89.field2668 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 1505) {
                            field762[var5++] = var89.field2724;
                            continue;
                        }
                    } else if (var470 < 1700) {
                        class164 var90 = var51 ? Statics.field771 : Statics.field770;
                        if (var470 == 1600) {
                            field762[var5++] = var90.field2669;
                            continue;
                        }
                        if (var470 == 1601) {
                            field762[var5++] = var90.field2739;
                            continue;
                        }
                        if (var470 == 1602) {
                            field764[var6++] = var90.field2680;
                            continue;
                        }
                        if (var470 == 1603) {
                            field762[var5++] = var90.field2645;
                            continue;
                        }
                        if (var470 == 1604) {
                            field762[var5++] = var90.field2672;
                            continue;
                        }
                        if (var470 == 1605) {
                            field762[var5++] = var90.field2700;
                            continue;
                        }
                        if (var470 == 1606) {
                            field762[var5++] = var90.field2706;
                            continue;
                        }
                        if (var470 == 1607) {
                            field762[var5++] = var90.field2670;
                            continue;
                        }
                        if (var470 == 1608) {
                            field762[var5++] = var90.field2698;
                            continue;
                        }
                        if (var470 == 1609) {
                            field762[var5++] = var90.field2678;
                            continue;
                        }
                    } else if (var470 < 1800) {
                        class164 var91 = var51 ? Statics.field771 : Statics.field770;
                        if (var470 == 1700) {
                            field762[var5++] = var91.field2667;
                            continue;
                        }
                        if (var470 == 1701) {
                            if (var91.field2667 == -1) {
                                field762[var5++] = 0;
                            } else {
                                field762[var5++] = var91.field2743;
                            }
                            continue;
                        }
                        if (var470 == 1702) {
                            field762[var5++] = var91.field2649;
                            continue;
                        }
                    } else if (var470 < 1900) {
                        class164 var92 = var51 ? Statics.field771 : Statics.field770;
                        if (var470 == 1800) {
                            field762[var5++] = class169.method2814(Statics.method74(var92));
                            continue;
                        }
                        if (var470 == 1801) {
                            var5--;
                            int var93 = field762[var5];
                            int var471 = var93 - 1;
                            if (var92.field2720 != null && var471 < var92.field2720.length && var92.field2720[var471] != null) {
                                field764[var6++] = var92.field2720[var471];
                                continue;
                            }
                            field764[var6++] = "";
                            continue;
                        }
                        if (var470 == 1802) {
                            if (var92.field2719 == null) {
                                field764[var6++] = "";
                            } else {
                                field764[var6++] = var92.field2719;
                            }
                            continue;
                        }
                    } else if (var470 >= 1900 && var470 < 2000 || var470 >= 2900 && var470 < 3000) {
                        class164 var94;
                        if (var470 >= 2000) {
                            var470 -= 1000;
                            var5--;
                            var94 = class164.method560(field762[var5]);
                        } else {
                            var94 = var51 ? Statics.field771 : Statics.field770;
                        }
                        if (var470 == 1927) {
                            if (field774 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var94.field2674 == null) {
                                return;
                            }
                            class1 var95 = new class1();
                            var95.field3 = var94;
                            var95.field16 = var94.field2674;
                            var95.field11 = field774 + 1;
                            client.field483.method3463(arg0);
                            continue;
                        }
                    } else if (var470 < 2600) {
                        var5--;
                        class164 var96 = class164.method560(field762[var5]);
                        if (var470 == 2500) {
                            field762[var5++] = var96.field2661;
                            continue;
                        }
                        if (var470 == 2501) {
                            field762[var5++] = var96.field2734;
                            continue;
                        }
                        if (var470 == 2502) {
                            field762[var5++] = var96.field2663;
                            continue;
                        }
                        if (var470 == 2503) {
                            field762[var5++] = var96.field2765;
                            continue;
                        }
                        if (var470 == 2504) {
                            field762[var5++] = var96.field2668 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 2505) {
                            field762[var5++] = var96.field2724;
                            continue;
                        }
                    } else if (var470 < 2700) {
                        var5--;
                        class164 var97 = class164.method560(field762[var5]);
                        if (var470 == 2600) {
                            field762[var5++] = var97.field2669;
                            continue;
                        }
                        if (var470 == 2601) {
                            field762[var5++] = var97.field2739;
                            continue;
                        }
                        if (var470 == 2602) {
                            field764[var6++] = var97.field2680;
                            continue;
                        }
                        if (var470 == 2603) {
                            field762[var5++] = var97.field2645;
                            continue;
                        }
                        if (var470 == 2604) {
                            field762[var5++] = var97.field2672;
                            continue;
                        }
                        if (var470 == 2605) {
                            field762[var5++] = var97.field2700;
                            continue;
                        }
                        if (var470 == 2606) {
                            field762[var5++] = var97.field2706;
                            continue;
                        }
                        if (var470 == 2607) {
                            field762[var5++] = var97.field2670;
                            continue;
                        }
                        if (var470 == 2608) {
                            field762[var5++] = var97.field2698;
                            continue;
                        }
                        if (var470 == 2609) {
                            field762[var5++] = var97.field2678;
                            continue;
                        }
                    } else if (var470 < 2800) {
                        if (var470 == 2700) {
                            var5--;
                            class164 var98 = class164.method560(field762[var5]);
                            field762[var5++] = var98.field2667;
                            continue;
                        }
                        if (var470 == 2701) {
                            var5--;
                            class164 var99 = class164.method560(field762[var5]);
                            if (var99.field2667 == -1) {
                                field762[var5++] = 0;
                            } else {
                                field762[var5++] = var99.field2743;
                            }
                            continue;
                        }
                        if (var470 == 2702) {
                            var5--;
                            int var100 = field762[var5];
                            class4 var101 = (class4) client.field443.method3425((long) var100);
                            if (var101 == null) {
                                field762[var5++] = 0;
                            } else {
                                field762[var5++] = 1;
                            }
                            continue;
                        }
                        if (var470 == 2706) {
                            field762[var5++] = client.field442;
                            continue;
                        }
                    } else if (var470 < 2900) {
                        var5--;
                        class164 var102 = class164.method560(field762[var5]);
                        if (var470 == 2800) {
                            int[] var103 = field762;
                            int var104 = var5++;
                            int var105 = Statics.method74(var102);
                            int var106 = var105 >> 11 & 0x3F;
                            var103[var104] = var106;
                            continue;
                        }
                        if (var470 == 2801) {
                            var5--;
                            int var107 = field762[var5];
                            int var472 = var107 - 1;
                            if (var102.field2720 != null && var472 < var102.field2720.length && var102.field2720[var472] != null) {
                                field764[var6++] = var102.field2720[var472];
                                continue;
                            }
                            field764[var6++] = "";
                            continue;
                        }
                        if (var470 == 2802) {
                            if (var102.field2719 == null) {
                                field764[var6++] = "";
                            } else {
                                field764[var6++] = var102.field2719;
                            }
                            continue;
                        }
                    } else if (var470 < 3200) {
                        if (var470 == 3100) {
                            var6--;
                            String var108 = field764[var6];
                            class11.method2846(0, "", var108);
                            continue;
                        }
                        if (var470 == 3101) {
                            var5 -= 2;
                            client.method575(Statics.field1994, field762[var5], field762[var5 + 1]);
                            continue;
                        }
                        if (var470 == 3103) {
                            client.field320.method2453(63);
                            for (class4 var109 = (class4) client.field443.method3428(); var109 != null; var109 = (class4) client.field443.method3432()) {
                                if (var109.field69 == 0 || var109.field69 == 3) {
                                    client.method2854(var109, true);
                                }
                            }
                            if (client.field546 != null) {
                                client.method572(client.field546);
                                client.field546 = null;
                            }
                            continue;
                        }
                        if (var470 == 3104) {
                            var6--;
                            String var110 = field764[var6];
                            int var111 = 0;
                            if (class154.method489(var110)) {
                                var111 = class154.method2139(var110);
                            }
                            client.field320.method2453(110);
                            client.field320.method2204(var111);
                            continue;
                        }
                        if (var470 == 3105) {
                            var6--;
                            String var112 = field764[var6];
                            client.field320.method2453(218);
                            client.field320.method2326(var112.length() + 1);
                            client.field320.method2362(var112);
                            continue;
                        }
                        if (var470 == 3106) {
                            var6--;
                            String var113 = field764[var6];
                            client.field320.method2453(208);
                            client.field320.method2326(var113.length() + 1);
                            client.field320.method2362(var113);
                            continue;
                        }
                        if (var470 == 3107) {
                            var5--;
                            int var114 = field762[var5];
                            var6--;
                            String var115 = field764[var6];
                            boolean var116 = false;
                            for (int var117 = 0; var117 < client.field401; var117++) {
                                class3 var118 = client.field400[client.field357[var117]];
                                if (var118 != null && var118.field60 != null && var118.field60.equalsIgnoreCase(var115)) {
                                    if (var114 == 1) {
                                        client.field320.method2453(57);
                                        client.field320.method2227(client.field357[var117]);
                                        client.field320.method2238(0);
                                    } else if (var114 == 4) {
                                        client.field320.method2453(4);
                                        client.field320.method2246(client.field357[var117]);
                                        client.field320.method2239(0);
                                    } else if (var114 == 6) {
                                        client.field320.method2453(61);
                                        client.field320.method2202(client.field357[var117]);
                                        client.field320.method2238(0);
                                    } else if (var114 == 7) {
                                        client.field320.method2453(158);
                                        client.field320.method2202(client.field357[var117]);
                                        client.field320.method2326(0);
                                    }
                                    var116 = true;
                                    break;
                                }
                            }
                            if (!var116) {
                                class11.method2846(4, "", class148.field2351 + var115);
                            }
                            continue;
                        }
                        if (var470 == 3108) {
                            var5 -= 3;
                            int var119 = field762[var5];
                            int var120 = field762[var5 + 1];
                            int var121 = field762[var5 + 2];
                            class164 var122 = class164.method560(var121);
                            client.method15(var122, var119, var120);
                            continue;
                        }
                        if (var470 == 3109) {
                            var5 -= 2;
                            int var123 = field762[var5];
                            int var124 = field762[var5 + 1];
                            class164 var125 = var51 ? Statics.field771 : Statics.field770;
                            client.method15(var125, var123, var124);
                            continue;
                        }
                        if (var470 == 3110) {
                            var5--;
                            Statics.field568 = field762[var5] == 1;
                            continue;
                        }
                        if (var470 == 3111) {
                            field762[var5++] = Statics.field134.field147 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3112) {
                            var5--;
                            Statics.field134.field147 = field762[var5] == 1;
                            class9.method156();
                            continue;
                        }
                        if (var470 == 3113) {
                            var6--;
                            String var126 = field764[var6];
                            var5--;
                            boolean var127 = field762[var5] == 1;
                            if (!var127) {
                                class130.method863(var126, 3, "openjs");
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var126));
                                    continue;
                                } catch (Exception var468) {
                                }
                            }
                            if (class130.field2044.startsWith("win")) {
                                class130.method863(var126, 0, "openjs");
                            } else if (class130.field2044.startsWith("mac")) {
                                class130.method863(var126, 1, "openjs");
                            } else {
                                class130.method863(var126, 2, "openjs");
                            }
                            continue;
                        }
                        if (var470 == 3115) {
                            var5--;
                            int var129 = field762[var5];
                            client.field320.method2453(248);
                            client.field320.method2202(var129);
                            continue;
                        }
                    } else if (var470 < 3300) {
                        if (var470 == 3200) {
                            var5 -= 3;
                            client.method3365(field762[var5], field762[var5 + 1], field762[var5 + 2]);
                            continue;
                        }
                        if (var470 == 3201) {
                            var5--;
                            int var130 = field762[var5];
                            if (var130 == -1 && !client.field524) {
                                Statics.field2540.method3252();
                                class174.field2843 = 1;
                                Statics.field2847 = null;
                            } else if (var130 != -1 && client.field523 != var130 && client.field522 != 0 && !client.field524) {
                                class174.method2054(2, Statics.field259, var130, 0, client.field522, false);
                            }
                            client.field523 = var130;
                            continue;
                        }
                        if (var470 == 3202) {
                            var5 -= 2;
                            int var131 = field762[var5];
                            int var10000 = field762[var5 + 1];
                            if (client.field522 != 0 && var131 != -1) {
                                class174.method2851(Statics.field885, var131, 0, client.field522, false);
                                client.field524 = true;
                            }
                            continue;
                        }
                    } else if (var470 < 3400) {
                        if (var470 == 3300) {
                            field762[var5++] = client.field289;
                            continue;
                        }
                        if (var470 == 3301) {
                            var5 -= 2;
                            int var133 = field762[var5];
                            int var134 = field762[var5 + 1];
                            int[] var135 = field762;
                            int var136 = var5++;
                            class15 var137 = (class15) class15.field227.method3425((long) var133);
                            int var138;
                            if (var137 == null) {
                                var138 = -1;
                            } else if (var134 >= 0 && var134 < var137.field224.length) {
                                var138 = var137.field224[var134];
                            } else {
                                var138 = -1;
                            }
                            var135[var136] = var138;
                            continue;
                        }
                        if (var470 == 3302) {
                            var5 -= 2;
                            int var139 = field762[var5];
                            int var140 = field762[var5 + 1];
                            int[] var141 = field762;
                            int var142 = var5++;
                            class15 var143 = (class15) class15.field227.method3425((long) var139);
                            int var144;
                            if (var143 == null) {
                                var144 = 0;
                            } else if (var140 >= 0 && var140 < var143.field222.length) {
                                var144 = var143.field222[var140];
                            } else {
                                var144 = 0;
                            }
                            var141[var142] = var144;
                            continue;
                        }
                        if (var470 == 3303) {
                            var5 -= 2;
                            int var145 = field762[var5];
                            int var146 = field762[var5 + 1];
                            field762[var5++] = class15.method2053(var145, var146);
                            continue;
                        }
                        if (var470 == 3304) {
                            var5--;
                            int var147 = field762[var5];
                            field762[var5++] = class46.method155(var147).field1065;
                            continue;
                        }
                        if (var470 == 3305) {
                            var5--;
                            int var148 = field762[var5];
                            field762[var5++] = client.field419[var148];
                            continue;
                        }
                        if (var470 == 3306) {
                            var5--;
                            int var149 = field762[var5];
                            field762[var5++] = client.field420[var149];
                            continue;
                        }
                        if (var470 == 3307) {
                            var5--;
                            int var150 = field762[var5];
                            field762[var5++] = client.field421[var150];
                            continue;
                        }
                        if (var470 == 3308) {
                            int var151 = Statics.field599;
                            int var152 = (Statics.field1994.field830 >> 7) + Statics.field2594;
                            int var153 = (Statics.field1994.field828 >> 7) + Statics.field954;
                            field762[var5++] = (var151 << 28) + (var152 << 14) + var153;
                            continue;
                        }
                        if (var470 == 3309) {
                            var5--;
                            int var154 = field762[var5];
                            field762[var5++] = var154 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var470 == 3310) {
                            var5--;
                            int var155 = field762[var5];
                            field762[var5++] = var155 >> 28;
                            continue;
                        }
                        if (var470 == 3311) {
                            var5--;
                            int var156 = field762[var5];
                            field762[var5++] = var156 & 0x3FFF;
                            continue;
                        }
                        if (var470 == 3312) {
                            field762[var5++] = client.field284 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3313) {
                            var5 -= 2;
                            int var157 = field762[var5] + 32768;
                            int var158 = field762[var5 + 1];
                            int[] var159 = field762;
                            int var160 = var5++;
                            class15 var161 = (class15) class15.field227.method3425((long) var157);
                            int var162;
                            if (var161 == null) {
                                var162 = -1;
                            } else if (var158 >= 0 && var158 < var161.field224.length) {
                                var162 = var161.field224[var158];
                            } else {
                                var162 = -1;
                            }
                            var159[var160] = var162;
                            continue;
                        }
                        if (var470 == 3314) {
                            var5 -= 2;
                            int var163 = field762[var5] + 32768;
                            int var164 = field762[var5 + 1];
                            int[] var165 = field762;
                            int var166 = var5++;
                            class15 var167 = (class15) class15.field227.method3425((long) var163);
                            int var168;
                            if (var167 == null) {
                                var168 = 0;
                            } else if (var164 >= 0 && var164 < var167.field222.length) {
                                var168 = var167.field222[var164];
                            } else {
                                var168 = 0;
                            }
                            var165[var166] = var168;
                            continue;
                        }
                        if (var470 == 3315) {
                            var5 -= 2;
                            int var169 = field762[var5] + 32768;
                            int var170 = field762[var5 + 1];
                            field762[var5++] = class15.method2053(var169, var170);
                            continue;
                        }
                        if (var470 == 3316) {
                            if (client.field449 >= 2) {
                                field762[var5++] = client.field449;
                            } else {
                                field762[var5++] = 0;
                            }
                            continue;
                        }
                        if (var470 == 3317) {
                            field762[var5++] = client.field296;
                            continue;
                        }
                        if (var470 == 3318) {
                            field762[var5++] = client.field281;
                            continue;
                        }
                        if (var470 == 3321) {
                            field762[var5++] = client.field373;
                            continue;
                        }
                        if (var470 == 3322) {
                            field762[var5++] = client.field448;
                            continue;
                        }
                        if (var470 == 3323) {
                            if (client.field451) {
                                field762[var5++] = 1;
                            } else {
                                field762[var5++] = 0;
                            }
                            continue;
                        }
                        if (var470 == 3324) {
                            field762[var5++] = client.field282;
                            continue;
                        }
                    } else if (var470 < 3500) {
                        if (var470 == 3400) {
                            var5 -= 2;
                            int var171 = field762[var5];
                            int var172 = field762[var5 + 1];
                            class45 var173 = (class45) class45.field1044.method3388((long) var171);
                            class45 var174;
                            if (var173 == null) {
                                byte[] var175 = Statics.field1058.method2929(8, var171);
                                class45 var176 = new class45();
                                if (var175 != null) {
                                    var176.method865(new class111(var175));
                                }
                                class45.field1044.method3396(var176, (long) var171);
                                var174 = var176;
                            } else {
                                var174 = var173;
                            }
                            class45 var177 = var174;
                            if (var174.field1043 != 's') {
                            }
                            for (int var178 = 0; var178 < var177.field1049; var178++) {
                                if (var177.field1052[var178] == var172) {
                                    field764[var6++] = var177.field1050[var178];
                                    var177 = null;
                                    break;
                                }
                            }
                            if (var177 != null) {
                                field764[var6++] = var177.field1046;
                            }
                            continue;
                        }
                        if (var470 == 3408) {
                            var5 -= 4;
                            int var179 = field762[var5];
                            int var180 = field762[var5 + 1];
                            int var181 = field762[var5 + 2];
                            int var182 = field762[var5 + 3];
                            class45 var183 = (class45) class45.field1044.method3388((long) var181);
                            class45 var184;
                            if (var183 == null) {
                                byte[] var185 = Statics.field1058.method2929(8, var181);
                                class45 var186 = new class45();
                                if (var185 != null) {
                                    var186.method865(new class111(var185));
                                }
                                class45.field1044.method3396(var186, (long) var181);
                                var184 = var186;
                            } else {
                                var184 = var183;
                            }
                            class45 var187 = var184;
                            if (var184.field1047 == var179 && var184.field1043 == var180) {
                                for (int var188 = 0; var188 < var187.field1049; var188++) {
                                    if (var187.field1052[var188] == var182) {
                                        if (var180 == 115) {
                                            field764[var6++] = var187.field1050[var188];
                                        } else {
                                            field762[var5++] = var187.field1051[var188];
                                        }
                                        var187 = null;
                                        break;
                                    }
                                }
                                if (var187 != null) {
                                    if (var180 == 115) {
                                        field764[var6++] = var187.field1046;
                                    } else {
                                        field762[var5++] = var187.field1048;
                                    }
                                }
                                continue;
                            }
                            if (var180 == 115) {
                                field764[var6++] = "null";
                            } else {
                                field762[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var470 < 3700) {
                        if (var470 == 3600) {
                            if (client.field539 == 0) {
                                field762[var5++] = -2;
                            } else if (client.field539 == 1) {
                                field762[var5++] = -1;
                            } else {
                                field762[var5++] = client.field553;
                            }
                            continue;
                        }
                        if (var470 == 3601) {
                            var5--;
                            int var189 = field762[var5];
                            if (client.field539 == 2 && var189 < client.field553) {
                                field764[var6++] = client.field518[var189].field260;
                                field764[var6++] = client.field518[var189].field252;
                                continue;
                            }
                            field764[var6++] = "";
                            field764[var6++] = "";
                            continue;
                        }
                        if (var470 == 3602) {
                            var5--;
                            int var190 = field762[var5];
                            if (client.field539 == 2 && var190 < client.field553) {
                                field762[var5++] = client.field518[var190].field247;
                                continue;
                            }
                            field762[var5++] = 0;
                            continue;
                        }
                        if (var470 == 3603) {
                            var5--;
                            int var191 = field762[var5];
                            if (client.field539 == 2 && var191 < client.field553) {
                                field762[var5++] = client.field518[var191].field248;
                                continue;
                            }
                            field762[var5++] = 0;
                            continue;
                        }
                        if (var470 == 3604) {
                            var6--;
                            String var192 = field764[var6];
                            var5--;
                            int var193 = field762[var5];
                            client.field320.method2453(69);
                            client.field320.method2326(class111.method2667(var192) + 1);
                            client.field320.method2362(var192);
                            client.field320.method2239(var193);
                            continue;
                        }
                        if (var470 == 3605) {
                            var6--;
                            String var194 = field764[var6];
                            client.method583(var194);
                            continue;
                        }
                        if (var470 == 3606) {
                            var6--;
                            String var195 = field764[var6];
                            if (var195 == null) {
                                continue;
                            }
                            String var196 = class155.method710(var195, Statics.field578);
                            if (var196 == null) {
                                continue;
                            }
                            int var197 = 0;
                            while (true) {
                                if (var197 >= client.field553) {
                                    continue label2970;
                                }
                                class17 var198 = client.field518[var197];
                                String var199 = var198.field260;
                                String var200 = class155.method710(var199, Statics.field578);
                                if (class121.method4(var195, var196, var199, var200)) {
                                    client.field553--;
                                    for (int var201 = var197; var201 < client.field553; var201++) {
                                        client.field518[var201] = client.field518[var201 + 1];
                                    }
                                    client.field475 = client.field467;
                                    client.field320.method2453(43);
                                    client.field320.method2326(class111.method2667(var195));
                                    client.field320.method2362(var195);
                                    continue label2970;
                                }
                                var197++;
                            }
                        }
                        if (var470 == 3607) {
                            var6--;
                            String var202 = field764[var6];
                            if (var202 == null) {
                                continue;
                            }
                            if ((client.field557 < 100 || client.field283 == 1) && client.field557 < 400) {
                                String var203 = class155.method710(var202, Statics.field578);
                                if (var203 == null) {
                                    continue;
                                }
                                for (int var204 = 0; var204 < client.field557; var204++) {
                                    class8 var205 = client.field298[var204];
                                    String var206 = class155.method710(var205.field142, Statics.field578);
                                    if (var206 != null && var206.equals(var203)) {
                                        class11.method2846(31, "", var202 + class148.field2378);
                                        continue label2970;
                                    }
                                    if (var205.field135 != null) {
                                        String var207 = class155.method710(var205.field135, Statics.field578);
                                        if (var207 != null && var207.equals(var203)) {
                                            class11.method2846(31, "", var202 + class148.field2378);
                                            continue label2970;
                                        }
                                    }
                                }
                                for (int var208 = 0; var208 < client.field553; var208++) {
                                    class17 var209 = client.field518[var208];
                                    String var210 = class155.method710(var209.field260, Statics.field578);
                                    if (var210 != null && var210.equals(var203)) {
                                        class11.method2846(31, "", class148.field2380 + var202 + class148.field2377);
                                        continue label2970;
                                    }
                                    if (var209.field252 != null) {
                                        String var211 = class155.method710(var209.field252, Statics.field578);
                                        if (var211 != null && var211.equals(var203)) {
                                            class11.method2846(31, "", class148.field2380 + var202 + class148.field2377);
                                            continue label2970;
                                        }
                                    }
                                }
                                if (class155.method710(Statics.field1994.field60, Statics.field578).equals(var203)) {
                                    class11.method2846(31, "", class148.field2405);
                                } else {
                                    client.field320.method2453(211);
                                    client.field320.method2326(class111.method2667(var202));
                                    client.field320.method2362(var202);
                                }
                                continue;
                            }
                            class11.method2846(31, "", class148.field2376);
                            continue;
                        }
                        if (var470 == 3608) {
                            var6--;
                            String var212 = field764[var6];
                            Statics.method487(var212);
                            continue;
                        }
                        if (var470 == 3609) {
                            var6--;
                            String var213 = field764[var6];
                            class143[] var214 = class143.method1052();
                            for (int var215 = 0; var215 < var214.length; var215++) {
                                class143 var216 = var214[var215];
                                if (var216.field2160 != -1) {
                                    int var218 = var216.field2160;
                                    String var219 = "<img=" + var218 + ">";
                                    if (var213.startsWith(var219)) {
                                        var213 = var213.substring(6 + Integer.toString(var216.field2160).length());
                                        break;
                                    }
                                }
                            }
                            field762[var5++] = client.method2896(var213, false) ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3611) {
                            if (client.field391 == null) {
                                field764[var6++] = "";
                                continue;
                            }
                            String[] var220 = field764;
                            int var221 = var6++;
                            String var222 = client.field391;
                            long var223 = 0L;
                            int var225 = var222.length();
                            for (int var226 = 0; var226 < var225; var226++) {
                                var223 *= 37L;
                                char var227 = var222.charAt(var226);
                                if (var227 >= 'A' && var227 <= 'Z') {
                                    var223 += (long) (var227 + 1 - 65);
                                } else if (var227 >= 'a' && var227 <= 'z') {
                                    var223 += (long) (var227 + 1 - 97);
                                } else if (var227 >= '0' && var227 <= '9') {
                                    var223 += (long) (var227 + 27 - 48);
                                }
                                if (var223 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var223 % 37L == 0L && var223 != 0L) {
                                var223 /= 37L;
                            }
                            String var230 = class153.method621(var223);
                            if (var230 == null) {
                                var230 = "";
                            }
                            var220[var221] = var230;
                            continue;
                        }
                        if (var470 == 3612) {
                            if (client.field391 == null) {
                                field762[var5++] = 0;
                            } else {
                                field762[var5++] = Statics.field2081;
                            }
                            continue;
                        }
                        if (var470 == 3613) {
                            var5--;
                            int var232 = field762[var5];
                            if (client.field391 != null && var232 < Statics.field2081) {
                                field764[var6++] = Statics.field1475[var232].field625;
                                continue;
                            }
                            field764[var6++] = "";
                            continue;
                        }
                        if (var470 == 3614) {
                            var5--;
                            int var233 = field762[var5];
                            if (client.field391 != null && var233 < Statics.field2081) {
                                field762[var5++] = Statics.field1475[var233].field620;
                                continue;
                            }
                            field762[var5++] = 0;
                            continue;
                        }
                        if (var470 == 3615) {
                            var5--;
                            int var234 = field762[var5];
                            if (client.field391 != null && var234 < Statics.field2081) {
                                field762[var5++] = Statics.field1475[var234].field621;
                                continue;
                            }
                            field762[var5++] = 0;
                            continue;
                        }
                        if (var470 == 3616) {
                            field762[var5++] = Statics.field2803;
                            continue;
                        }
                        if (var470 == 3617) {
                            var6--;
                            String var235 = field764[var6];
                            if (Statics.field1475 != null) {
                                client.field320.method2453(197);
                                client.field320.method2326(class111.method2667(var235));
                                client.field320.method2362(var235);
                            }
                            continue;
                        }
                        if (var470 == 3618) {
                            field762[var5++] = Statics.field1326;
                            continue;
                        }
                        if (var470 == 3619) {
                            var6--;
                            String var236 = field764[var6];
                            client.method127(var236);
                            continue;
                        }
                        if (var470 == 3620) {
                            client.method544();
                            continue;
                        }
                        if (var470 == 3621) {
                            if (client.field539 == 0) {
                                field762[var5++] = -1;
                            } else {
                                field762[var5++] = client.field557;
                            }
                            continue;
                        }
                        if (var470 == 3622) {
                            var5--;
                            int var237 = field762[var5];
                            if (client.field539 != 0 && var237 < client.field557) {
                                field764[var6++] = client.field298[var237].field142;
                                field764[var6++] = client.field298[var237].field135;
                                continue;
                            }
                            field764[var6++] = "";
                            field764[var6++] = "";
                            continue;
                        }
                        if (var470 == 3623) {
                            String var238;
                            label2670: {
                                var6--;
                                var238 = field764[var6];
                                String var240 = "<img=0>";
                                if (!var238.startsWith(var240)) {
                                    String var242 = "<img=1>";
                                    if (!var238.startsWith(var242)) {
                                        break label2670;
                                    }
                                }
                                var238 = var238.substring(7);
                            }
                            field762[var5++] = client.method574(var238) ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3624) {
                            var5--;
                            int var243 = field762[var5];
                            if (Statics.field1475 != null && var243 < Statics.field2081 && Statics.field1475[var243].field625.equalsIgnoreCase(Statics.field1994.field60)) {
                                field762[var5++] = 1;
                                continue;
                            }
                            field762[var5++] = 0;
                            continue;
                        }
                        if (var470 == 3625) {
                            if (client.field512 == null) {
                                field764[var6++] = "";
                                continue;
                            }
                            String[] var244 = field764;
                            int var245 = var6++;
                            String var246 = client.field512;
                            long var247 = 0L;
                            int var249 = var246.length();
                            for (int var250 = 0; var250 < var249; var250++) {
                                var247 *= 37L;
                                char var251 = var246.charAt(var250);
                                if (var251 >= 'A' && var251 <= 'Z') {
                                    var247 += (long) (var251 + 1 - 65);
                                } else if (var251 >= 'a' && var251 <= 'z') {
                                    var247 += (long) (var251 + 1 - 97);
                                } else if (var251 >= '0' && var251 <= '9') {
                                    var247 += (long) (var251 + 27 - 48);
                                }
                                if (var247 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var247 % 37L == 0L && var247 != 0L) {
                                var247 /= 37L;
                            }
                            String var254 = class153.method621(var247);
                            if (var254 == null) {
                                var254 = "";
                            }
                            var244[var245] = var254;
                            continue;
                        }
                    } else if (var470 < 4000) {
                        if (var470 == 3903) {
                            var5--;
                            int var256 = field762[var5];
                            field762[var5++] = client.field314[var256].method3638();
                            continue;
                        }
                        if (var470 == 3904) {
                            var5--;
                            int var257 = field762[var5];
                            field762[var5++] = client.field314[var257].field3072;
                            continue;
                        }
                        if (var470 == 3905) {
                            var5--;
                            int var258 = field762[var5];
                            field762[var5++] = client.field314[var258].field3073;
                            continue;
                        }
                        if (var470 == 3906) {
                            var5--;
                            int var259 = field762[var5];
                            field762[var5++] = client.field314[var259].field3074;
                            continue;
                        }
                        if (var470 == 3907) {
                            var5--;
                            int var260 = field762[var5];
                            field762[var5++] = client.field314[var260].field3075;
                            continue;
                        }
                        if (var470 == 3908) {
                            var5--;
                            int var261 = field762[var5];
                            field762[var5++] = client.field314[var261].field3076;
                            continue;
                        }
                        if (var470 == 3910) {
                            var5--;
                            int var262 = field762[var5];
                            int var263 = client.field314[var262].method3618();
                            field762[var5++] = var263 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3911) {
                            var5--;
                            int var264 = field762[var5];
                            int var265 = client.field314[var264].method3618();
                            field762[var5++] = var265 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3912) {
                            var5--;
                            int var266 = field762[var5];
                            int var267 = client.field314[var266].method3618();
                            field762[var5++] = var267 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3913) {
                            var5--;
                            int var268 = field762[var5];
                            int var269 = client.field314[var268].method3618();
                            field762[var5++] = var269 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3914) {
                            var5--;
                            boolean var270 = field762[var5] == 1;
                            if (Statics.field251 != null) {
                                Statics.field251.method3644(class212.field3081, var270);
                            }
                            continue;
                        }
                        if (var470 == 3915) {
                            var5--;
                            boolean var271 = field762[var5] == 1;
                            if (Statics.field251 != null) {
                                Statics.field251.method3644(class212.field3080, var271);
                            }
                            continue;
                        }
                        if (var470 == 3916) {
                            var5 -= 2;
                            boolean var272 = field762[var5] == 1;
                            boolean var273 = field762[var5 + 1] == 1;
                            if (Statics.field251 != null) {
                                Statics.field251.method3644(new class21(var273), var272);
                            }
                            continue;
                        }
                        if (var470 == 3917) {
                            var5--;
                            boolean var274 = field762[var5] == 1;
                            if (Statics.field251 != null) {
                                Statics.field251.method3644(class212.field3078, var274);
                            }
                            continue;
                        }
                        if (var470 == 3918) {
                            var5--;
                            boolean var275 = field762[var5] == 1;
                            if (Statics.field251 != null) {
                                Statics.field251.method3644(class212.field3083, var275);
                            }
                            continue;
                        }
                        if (var470 == 3919) {
                            field762[var5++] = Statics.field251 == null ? 0 : Statics.field251.field3079.size();
                            continue;
                        }
                        if (var470 == 3920) {
                            var5--;
                            int var276 = field762[var5];
                            class205 var277 = (class205) Statics.field251.field3079.get(var276);
                            field762[var5++] = var277.field3050;
                            continue;
                        }
                        if (var470 == 3921) {
                            var5--;
                            int var278 = field762[var5];
                            class205 var279 = (class205) Statics.field251.field3079.get(var278);
                            field764[var6++] = var279.method3574();
                            continue;
                        }
                        if (var470 == 3922) {
                            var5--;
                            int var280 = field762[var5];
                            class205 var281 = (class205) Statics.field251.field3079.get(var280);
                            field764[var6++] = var281.method3575();
                            continue;
                        }
                        if (var470 == 3923) {
                            var5--;
                            int var282 = field762[var5];
                            class205 var283 = (class205) Statics.field251.field3079.get(var282);
                            long var284 = class107.method3364() - Statics.field639 - var283.field3049;
                            int var286 = (int) (var284 / 3600000L);
                            int var287 = (int) ((var284 - (long) (var286 * 3600000)) / 60000L);
                            int var288 = (int) ((var284 - (long) (var286 * 3600000) - (long) (var287 * 60000)) / 1000L);
                            String var289 = var286 + ":" + var287 / 10 + var287 % 10 + ":" + var288 / 10 + var288 % 10;
                            field764[var6++] = var289;
                            continue;
                        }
                        if (var470 == 3924) {
                            var5--;
                            int var290 = field762[var5];
                            class205 var291 = (class205) Statics.field251.field3079.get(var290);
                            field762[var5++] = var291.field3051.field3074;
                            continue;
                        }
                        if (var470 == 3925) {
                            var5--;
                            int var292 = field762[var5];
                            class205 var293 = (class205) Statics.field251.field3079.get(var292);
                            field762[var5++] = var293.field3051.field3073;
                            continue;
                        }
                        if (var470 == 3926) {
                            var5--;
                            int var294 = field762[var5];
                            class205 var295 = (class205) Statics.field251.field3079.get(var294);
                            field762[var5++] = var295.field3051.field3072;
                            continue;
                        }
                    } else if (var470 < 4100) {
                        if (var470 == 4000) {
                            var5 -= 2;
                            int var296 = field762[var5];
                            int var297 = field762[var5 + 1];
                            field762[var5++] = var296 + var297;
                            continue;
                        }
                        if (var470 == 4001) {
                            var5 -= 2;
                            int var298 = field762[var5];
                            int var299 = field762[var5 + 1];
                            field762[var5++] = var298 - var299;
                            continue;
                        }
                        if (var470 == 4002) {
                            var5 -= 2;
                            int var300 = field762[var5];
                            int var301 = field762[var5 + 1];
                            field762[var5++] = var300 * var301;
                            continue;
                        }
                        if (var470 == 4003) {
                            var5 -= 2;
                            int var302 = field762[var5];
                            int var303 = field762[var5 + 1];
                            field762[var5++] = var302 / var303;
                            continue;
                        }
                        if (var470 == 4004) {
                            var5--;
                            int var304 = field762[var5];
                            field762[var5++] = (int) (Math.random() * (double) var304);
                            continue;
                        }
                        if (var470 == 4005) {
                            var5--;
                            int var305 = field762[var5];
                            field762[var5++] = (int) (Math.random() * (double) (var305 + 1));
                            continue;
                        }
                        if (var470 == 4006) {
                            var5 -= 5;
                            int var306 = field762[var5];
                            int var307 = field762[var5 + 1];
                            int var308 = field762[var5 + 2];
                            int var309 = field762[var5 + 3];
                            int var310 = field762[var5 + 4];
                            field762[var5++] = (var307 - var306) * (var310 - var308) / (var309 - var308) + var306;
                            continue;
                        }
                        if (var470 == 4007) {
                            var5 -= 2;
                            int var311 = field762[var5];
                            int var312 = field762[var5 + 1];
                            field762[var5++] = var311 * var312 / 100 + var311;
                            continue;
                        }
                        if (var470 == 4008) {
                            var5 -= 2;
                            int var313 = field762[var5];
                            int var314 = field762[var5 + 1];
                            field762[var5++] = var313 | 0x1 << var314;
                            continue;
                        }
                        if (var470 == 4009) {
                            var5 -= 2;
                            int var315 = field762[var5];
                            int var316 = field762[var5 + 1];
                            field762[var5++] = var315 & -1 - (0x1 << var316);
                            continue;
                        }
                        if (var470 == 4010) {
                            var5 -= 2;
                            int var317 = field762[var5];
                            int var318 = field762[var5 + 1];
                            field762[var5++] = (var317 & 0x1 << var318) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var470 == 4011) {
                            var5 -= 2;
                            int var319 = field762[var5];
                            int var320 = field762[var5 + 1];
                            field762[var5++] = var319 % var320;
                            continue;
                        }
                        if (var470 == 4012) {
                            var5 -= 2;
                            int var321 = field762[var5];
                            int var322 = field762[var5 + 1];
                            if (var321 == 0) {
                                field762[var5++] = 0;
                            } else {
                                field762[var5++] = (int) Math.pow((double) var321, (double) var322);
                            }
                            continue;
                        }
                        if (var470 == 4013) {
                            var5 -= 2;
                            int var323 = field762[var5];
                            int var324 = field762[var5 + 1];
                            if (var323 == 0) {
                                field762[var5++] = 0;
                            } else if (var324 == 0) {
                                field762[var5++] = Integer.MAX_VALUE;
                            } else {
                                field762[var5++] = (int) Math.pow((double) var323, 1.0D / (double) var324);
                            }
                            continue;
                        }
                        if (var470 == 4014) {
                            var5 -= 2;
                            int var325 = field762[var5];
                            int var326 = field762[var5 + 1];
                            field762[var5++] = var325 & var326;
                            continue;
                        }
                        if (var470 == 4015) {
                            var5 -= 2;
                            int var327 = field762[var5];
                            int var328 = field762[var5 + 1];
                            field762[var5++] = var327 | var328;
                            continue;
                        }
                    } else if (var470 < 4200) {
                        if (var470 == 4100) {
                            var6--;
                            String var329 = field764[var6];
                            var5--;
                            int var330 = field762[var5];
                            field764[var6++] = var329 + var330;
                            continue;
                        }
                        if (var470 == 4101) {
                            var6 -= 2;
                            String var331 = field764[var6];
                            String var332 = field764[var6 + 1];
                            field764[var6++] = var331 + var332;
                            continue;
                        }
                        if (var470 == 4102) {
                            var6--;
                            String var333 = field764[var6];
                            var5--;
                            int var334 = field762[var5];
                            String[] var335 = field764;
                            int var336 = var6++;
                            String var338;
                            if (var334 < 0) {
                                var338 = Integer.toString(var334);
                            } else {
                                int var339 = var334;
                                String var340;
                                if (var334 < 0) {
                                    var340 = Integer.toString(var334, 10);
                                } else {
                                    int var341 = 2;
                                    int var342 = var334 / 10;
                                    while (var342 != 0) {
                                        var342 /= 10;
                                        var341++;
                                    }
                                    char[] var343 = new char[var341];
                                    var343[0] = '+';
                                    for (int var344 = var341 - 1; var344 > 0; var344--) {
                                        int var345 = var339;
                                        var339 /= 10;
                                        int var346 = var345 - var339 * 10;
                                        if (var346 >= 10) {
                                            var343[var344] = (char) (var346 + 87);
                                        } else {
                                            var343[var344] = (char) (var346 + 48);
                                        }
                                    }
                                    var340 = new String(var343);
                                }
                                var338 = var340;
                            }
                            var335[var336] = var333 + var338;
                            continue;
                        }
                        if (var470 == 4103) {
                            var6--;
                            String var347 = field764[var6];
                            field764[var6++] = var347.toLowerCase();
                            continue;
                        }
                        if (var470 == 4104) {
                            var5--;
                            int var348 = field762[var5];
                            long var349 = ((long) var348 + 11745L) * 86400000L;
                            field772.setTime(new Date(var349));
                            int var351 = field772.get(5);
                            int var352 = field772.get(2);
                            int var353 = field772.get(1);
                            field764[var6++] = var351 + "-" + field773[var352] + "-" + var353;
                            continue;
                        }
                        if (var470 == 4105) {
                            var6 -= 2;
                            String var354 = field764[var6];
                            String var355 = field764[var6 + 1];
                            if (Statics.field1994.field47 != null && Statics.field1994.field47.field2814) {
                                field764[var6++] = var355;
                                continue;
                            }
                            field764[var6++] = var354;
                            continue;
                        }
                        if (var470 == 4106) {
                            var5--;
                            int var356 = field762[var5];
                            field764[var6++] = Integer.toString(var356);
                            continue;
                        }
                        if (var470 == 4107) {
                            var6 -= 2;
                            field762[var5++] = class154.method2132(Statics.method2828(field764[var6], field764[var6 + 1], client.field286));
                            continue;
                        }
                        if (var470 == 4108) {
                            var6--;
                            String var357 = field764[var6];
                            var5 -= 2;
                            int var358 = field762[var5];
                            int var359 = field762[var5 + 1];
                            byte[] var360 = Statics.field193.method2929(var359, 0);
                            class215 var361 = new class215(var360);
                            field762[var5++] = var361.method3658(var357, var358);
                            continue;
                        }
                        if (var470 == 4109) {
                            var6--;
                            String var362 = field764[var6];
                            var5 -= 2;
                            int var363 = field762[var5];
                            int var364 = field762[var5 + 1];
                            byte[] var365 = Statics.field193.method2929(var364, 0);
                            class215 var366 = new class215(var365);
                            field762[var5++] = var366.method3657(var362, var363);
                            continue;
                        }
                        if (var470 == 4110) {
                            var6 -= 2;
                            String var367 = field764[var6];
                            String var368 = field764[var6 + 1];
                            var5--;
                            if (field762[var5] == 1) {
                                field764[var6++] = var367;
                            } else {
                                field764[var6++] = var368;
                            }
                            continue;
                        }
                        if (var470 == 4111) {
                            var6--;
                            String var369 = field764[var6];
                            field764[var6++] = class214.method3659(var369);
                            continue;
                        }
                        if (var470 == 4112) {
                            var6--;
                            String var370 = field764[var6];
                            var5--;
                            int var371 = field762[var5];
                            field764[var6++] = var370 + (char) var371;
                            continue;
                        }
                        if (var470 == 4113) {
                            var5--;
                            int var372 = field762[var5];
                            int[] var373 = field762;
                            int var374 = var5++;
                            char var375 = (char) var372;
                            boolean var376;
                            if (var375 >= ' ' && var375 <= '~') {
                                var376 = true;
                            } else if (var375 >= 160 && var375 <= 255) {
                                var376 = true;
                            } else if (var375 == 8364 || var375 == 338 || var375 == 8212 || var375 == 339 || var375 == 376) {
                                var376 = true;
                            } else {
                                var376 = false;
                            }
                            var373[var374] = var376 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4114) {
                            var5--;
                            int var377 = field762[var5];
                            int[] var378 = field762;
                            int var379 = var5++;
                            char var380 = (char) var377;
                            boolean var381 = var380 >= '0' && var380 <= '9' || var380 >= 'A' && var380 <= 'Z' || var380 >= 'a' && var380 <= 'z';
                            var378[var379] = var381 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4115) {
                            var5--;
                            int var382 = field762[var5];
                            field762[var5++] = class154.method149((char) var382) ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4116) {
                            var5--;
                            int var383 = field762[var5];
                            field762[var5++] = class154.method2513((char) var383) ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4117) {
                            var6--;
                            String var384 = field764[var6];
                            if (var384 == null) {
                                field762[var5++] = 0;
                            } else {
                                field762[var5++] = var384.length();
                            }
                            continue;
                        }
                        if (var470 == 4118) {
                            var6--;
                            String var385 = field764[var6];
                            var5 -= 2;
                            int var386 = field762[var5];
                            int var387 = field762[var5 + 1];
                            field764[var6++] = var385.substring(var386, var387);
                            continue;
                        }
                        if (var470 == 4119) {
                            var6--;
                            String var388 = field764[var6];
                            StringBuilder var389 = new StringBuilder(var388.length());
                            boolean var390 = false;
                            for (int var391 = 0; var391 < var388.length(); var391++) {
                                char var392 = var388.charAt(var391);
                                if (var392 == '<') {
                                    var390 = true;
                                } else if (var392 == '>') {
                                    var390 = false;
                                } else if (!var390) {
                                    var389.append(var392);
                                }
                            }
                            field764[var6++] = var389.toString();
                            continue;
                        }
                        if (var470 == 4120) {
                            var6--;
                            String var393 = field764[var6];
                            var5--;
                            int var394 = field762[var5];
                            field762[var5++] = var393.indexOf(var394);
                            continue;
                        }
                        if (var470 == 4121) {
                            var6 -= 2;
                            String var395 = field764[var6];
                            String var396 = field764[var6 + 1];
                            var5--;
                            int var397 = field762[var5];
                            field762[var5++] = var395.indexOf(var396, var397);
                            continue;
                        }
                    } else if (var470 < 4300) {
                        if (var470 == 4200) {
                            var5--;
                            int var398 = field762[var5];
                            field764[var6++] = class47.method2845(var398).field1068;
                            continue;
                        }
                        if (var470 == 4201) {
                            var5 -= 2;
                            int var399 = field762[var5];
                            int var400 = field762[var5 + 1];
                            class47 var401 = class47.method2845(var399);
                            if (var400 >= 1 && var400 <= 5 && var401.field1070[var400 - 1] != null) {
                                field764[var6++] = var401.field1070[var400 - 1];
                                continue;
                            }
                            field764[var6++] = "";
                            continue;
                        }
                        if (var470 == 4202) {
                            var5 -= 2;
                            int var402 = field762[var5];
                            int var403 = field762[var5 + 1];
                            class47 var404 = class47.method2845(var402);
                            if (var403 >= 1 && var403 <= 5 && var404.field1093[var403 - 1] != null) {
                                field764[var6++] = var404.field1093[var403 - 1];
                                continue;
                            }
                            field764[var6++] = "";
                            continue;
                        }
                        if (var470 == 4203) {
                            var5--;
                            int var405 = field762[var5];
                            field762[var5++] = class47.method2845(var405).field1090;
                            continue;
                        }
                        if (var470 == 4204) {
                            var5--;
                            int var406 = field762[var5];
                            field762[var5++] = class47.method2845(var406).field1092 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4205) {
                            var5--;
                            int var407 = field762[var5];
                            class47 var408 = class47.method2845(var407);
                            if (var408.field1109 == -1 && var408.field1089 >= 0) {
                                field762[var5++] = var408.field1089;
                                continue;
                            }
                            field762[var5++] = var407;
                            continue;
                        }
                        if (var470 == 4206) {
                            var5--;
                            int var409 = field762[var5];
                            class47 var410 = class47.method2845(var409);
                            if (var410.field1109 >= 0 && var410.field1089 >= 0) {
                                field762[var5++] = var410.field1089;
                                continue;
                            }
                            field762[var5++] = var409;
                            continue;
                        }
                        if (var470 == 4207) {
                            var5--;
                            int var411 = field762[var5];
                            field762[var5++] = class47.method2845(var411).field1091 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4210) {
                            var6--;
                            String var412 = field764[var6];
                            var5--;
                            int var413 = field762[var5];
                            boolean var415 = var413 == 1;
                            String var416 = var412.toLowerCase();
                            short[] var417 = new short[16];
                            int var418 = 0;
                            int var419 = 0;
                            while (true) {
                                if (var419 >= Statics.field1883) {
                                    Statics.field839 = var417;
                                    Statics.field743 = 0;
                                    Statics.field271 = var418;
                                    String[] var423 = new String[Statics.field271];
                                    for (int var424 = 0; var424 < Statics.field271; var424++) {
                                        var423[var424] = class47.method2845(var417[var424]).field1068;
                                    }
                                    short[] var425 = Statics.field839;
                                    class116.method613(var423, var425, 0, var423.length - 1);
                                    break;
                                }
                                class47 var420 = class47.method2845(var419);
                                if ((!var415 || var420.field1116) && var420.field1109 == -1 && var420.field1068.toLowerCase().indexOf(var416) != -1) {
                                    if (var418 >= 250) {
                                        Statics.field271 = -1;
                                        Statics.field839 = null;
                                        break;
                                    }
                                    if (var418 >= var417.length) {
                                        short[] var421 = new short[var417.length * 2];
                                        for (int var422 = 0; var422 < var418; var422++) {
                                            var421[var422] = var417[var422];
                                        }
                                        var417 = var421;
                                    }
                                    var417[var418++] = (short) var419;
                                }
                                var419++;
                            }
                            field762[var5++] = Statics.field271;
                            continue;
                        }
                        if (var470 == 4211) {
                            if (Statics.field839 != null && Statics.field743 < Statics.field271) {
                                field762[var5++] = Statics.field839[++Statics.field743 - 1] & 0xFFFF;
                                continue;
                            }
                            field762[var5++] = -1;
                            continue;
                        }
                        if (var470 == 4212) {
                            Statics.field743 = 0;
                            continue;
                        }
                    } else if (var470 < 5100) {
                        if (var470 == 5000) {
                            field762[var5++] = client.field502;
                            continue;
                        }
                        if (var470 == 5001) {
                            var5 -= 3;
                            client.field502 = field762[var5];
                            Statics.field39 = class122.method638(field762[var5 + 1]);
                            if (Statics.field39 == null) {
                                Statics.field39 = class122.field1963;
                            }
                            client.field503 = field762[var5 + 2];
                            client.field320.method2453(2);
                            client.field320.method2326(client.field502);
                            client.field320.method2326(Statics.field39.field1966);
                            client.field320.method2326(client.field503);
                            continue;
                        }
                        if (var470 == 5002) {
                            var6--;
                            String var426 = field764[var6];
                            var5 -= 2;
                            int var427 = field762[var5];
                            int var428 = field762[var5 + 1];
                            client.field320.method2453(58);
                            client.field320.method2326(class111.method2667(var426) + 2);
                            client.field320.method2362(var426);
                            client.field320.method2326(var427 - 1);
                            client.field320.method2326(var428);
                            continue;
                        }
                        if (var470 == 5003) {
                            var5 -= 2;
                            int var429 = field762[var5];
                            int var430 = field762[var5 + 1];
                            class26 var431 = (class26) class11.field170.get(var429);
                            class33 var432 = var431.method550(var430);
                            if (var432 == null) {
                                field762[var5++] = -1;
                                field762[var5++] = 0;
                                field764[var6++] = "";
                                field764[var6++] = "";
                                field764[var6++] = "";
                            } else {
                                field762[var5++] = var432.field757;
                                field762[var5++] = var432.field753;
                                field764[var6++] = var432.field754 == null ? "" : var432.field754;
                                field764[var6++] = var432.field755 == null ? "" : var432.field755;
                                field764[var6++] = var432.field756 == null ? "" : var432.field756;
                            }
                            continue;
                        }
                        if (var470 == 5004) {
                            var5--;
                            int var434 = field762[var5];
                            class33 var435 = (class33) class11.field171.method3449((long) var434);
                            if (var435 == null) {
                                field762[var5++] = -1;
                                field762[var5++] = 0;
                                field764[var6++] = "";
                                field764[var6++] = "";
                                field764[var6++] = "";
                            } else {
                                field762[var5++] = var435.field752;
                                field762[var5++] = var435.field753;
                                field764[var6++] = var435.field754 == null ? "" : var435.field754;
                                field764[var6++] = var435.field755 == null ? "" : var435.field755;
                                field764[var6++] = var435.field756 == null ? "" : var435.field756;
                            }
                            continue;
                        }
                        if (var470 == 5005) {
                            if (Statics.field39 == null) {
                                field762[var5++] = -1;
                            } else {
                                field762[var5++] = Statics.field39.field1966;
                            }
                            continue;
                        }
                        if (var470 == 5008) {
                            var6--;
                            String var437 = field764[var6];
                            var5--;
                            int var438 = field762[var5];
                            String var439 = var437.toLowerCase();
                            byte var440 = 0;
                            if (var439.startsWith(class148.field2304)) {
                                var440 = 0;
                                var437 = var437.substring(class148.field2304.length());
                            } else if (var439.startsWith(class148.field2436)) {
                                var440 = 1;
                                var437 = var437.substring(class148.field2436.length());
                            } else if (var439.startsWith(class148.field2382)) {
                                var440 = 2;
                                var437 = var437.substring(class148.field2382.length());
                            } else if (var439.startsWith(class148.field2391)) {
                                var440 = 3;
                                var437 = var437.substring(class148.field2391.length());
                            } else if (var439.startsWith(class148.field2386)) {
                                var440 = 4;
                                var437 = var437.substring(class148.field2386.length());
                            } else if (var439.startsWith(class148.field2388)) {
                                var440 = 5;
                                var437 = var437.substring(class148.field2388.length());
                            } else if (var439.startsWith(class148.field2232)) {
                                var440 = 6;
                                var437 = var437.substring(class148.field2232.length());
                            } else if (var439.startsWith(class148.field2211)) {
                                var440 = 7;
                                var437 = var437.substring(class148.field2211.length());
                            } else if (var439.startsWith(class148.field2394)) {
                                var440 = 8;
                                var437 = var437.substring(class148.field2394.length());
                            } else if (var439.startsWith(class148.field2396)) {
                                var440 = 9;
                                var437 = var437.substring(class148.field2396.length());
                            } else if (var439.startsWith(class148.field2398)) {
                                var440 = 10;
                                var437 = var437.substring(class148.field2398.length());
                            } else if (var439.startsWith(class148.field2462)) {
                                var440 = 11;
                                var437 = var437.substring(class148.field2462.length());
                            } else if (client.field286 != 0) {
                                if (var439.startsWith(class148.field2430)) {
                                    var440 = 0;
                                    var437 = var437.substring(class148.field2430.length());
                                } else if (var439.startsWith(class148.field2408)) {
                                    var440 = 1;
                                    var437 = var437.substring(class148.field2408.length());
                                } else if (var439.startsWith(class148.field2306)) {
                                    var440 = 2;
                                    var437 = var437.substring(class148.field2306.length());
                                } else if (var439.startsWith(class148.field2385)) {
                                    var440 = 3;
                                    var437 = var437.substring(class148.field2385.length());
                                } else if (var439.startsWith(class148.field2387)) {
                                    var440 = 4;
                                    var437 = var437.substring(class148.field2387.length());
                                } else if (var439.startsWith(class148.field2303)) {
                                    var440 = 5;
                                    var437 = var437.substring(class148.field2303.length());
                                } else if (var439.startsWith(class148.field2241)) {
                                    var440 = 6;
                                    var437 = var437.substring(class148.field2241.length());
                                } else if (var439.startsWith(class148.field2393)) {
                                    var440 = 7;
                                    var437 = var437.substring(class148.field2393.length());
                                } else if (var439.startsWith(class148.field2395)) {
                                    var440 = 8;
                                    var437 = var437.substring(class148.field2395.length());
                                } else if (var439.startsWith(class148.field2397)) {
                                    var440 = 9;
                                    var437 = var437.substring(class148.field2397.length());
                                } else if (var439.startsWith(class148.field2399)) {
                                    var440 = 10;
                                    var437 = var437.substring(class148.field2399.length());
                                } else if (var439.startsWith(class148.field2401)) {
                                    var440 = 11;
                                    var437 = var437.substring(class148.field2401.length());
                                }
                            }
                            String var441 = var437.toLowerCase();
                            byte var442 = 0;
                            if (var441.startsWith(class148.field2402)) {
                                var442 = 1;
                                var437 = var437.substring(class148.field2402.length());
                            } else if (var441.startsWith(class148.field2404)) {
                                var442 = 2;
                                var437 = var437.substring(class148.field2404.length());
                            } else if (var441.startsWith(class148.field2406)) {
                                var442 = 3;
                                var437 = var437.substring(class148.field2406.length());
                            } else if (var441.startsWith(class148.field2364)) {
                                var442 = 4;
                                var437 = var437.substring(class148.field2364.length());
                            } else if (var441.startsWith(class148.field2410)) {
                                var442 = 5;
                                var437 = var437.substring(class148.field2410.length());
                            } else if (client.field286 != 0) {
                                if (var441.startsWith(class148.field2206)) {
                                    var442 = 1;
                                    var437 = var437.substring(class148.field2206.length());
                                } else if (var441.startsWith(class148.field2437)) {
                                    var442 = 2;
                                    var437 = var437.substring(class148.field2437.length());
                                } else if (var441.startsWith(class148.field2407)) {
                                    var442 = 3;
                                    var437 = var437.substring(class148.field2407.length());
                                } else if (var441.startsWith(class148.field2409)) {
                                    var442 = 4;
                                    var437 = var437.substring(class148.field2409.length());
                                } else if (var441.startsWith(class148.field2411)) {
                                    var442 = 5;
                                    var437 = var437.substring(class148.field2411.length());
                                }
                            }
                            client.field320.method2453(5);
                            client.field320.method2326(0);
                            int var443 = client.field320.field1896;
                            client.field320.method2326(var438);
                            client.field320.method2326(var440);
                            client.field320.method2326(var442);
                            class114 var444 = client.field320;
                            int var445 = var444.field1896;
                            byte[] var446 = class156.method512(var437);
                            var444.method2236(var446.length);
                            var444.field1896 += Statics.field3084.method2141(var446, 0, var446.length, var444.field1904, var444.field1896);
                            client.field320.method2294(client.field320.field1896 - var443);
                            continue;
                        }
                        if (var470 == 5009) {
                            var6 -= 2;
                            String var447 = field764[var6];
                            String var448 = field764[var6 + 1];
                            client.field320.method2453(1);
                            client.field320.method2202(0);
                            int var449 = client.field320.field1896;
                            client.field320.method2362(var447);
                            class114 var450 = client.field320;
                            int var451 = var450.field1896;
                            byte[] var452 = class156.method512(var448);
                            var450.method2236(var452.length);
                            var450.field1896 += Statics.field3084.method2141(var452, 0, var452.length, var450.field1904, var450.field1896);
                            client.field320.method2212(client.field320.field1896 - var449);
                            continue;
                        }
                        if (var470 == 5015) {
                            String var453;
                            if (Statics.field1994 == null || Statics.field1994.field60 == null) {
                                var453 = "";
                            } else {
                                var453 = Statics.field1994.field60;
                            }
                            field764[var6++] = var453;
                            continue;
                        }
                        if (var470 == 5016) {
                            field762[var5++] = client.field503;
                            continue;
                        }
                        if (var470 == 5017) {
                            var5--;
                            int var454 = field762[var5];
                            field762[var5++] = class11.method828(var454);
                            continue;
                        }
                        if (var470 == 5018) {
                            var5--;
                            int var455 = field762[var5];
                            field762[var5++] = class11.method569(var455);
                            continue;
                        }
                        if (var470 == 5019) {
                            var5--;
                            int var456 = field762[var5];
                            field762[var5++] = class11.method1424(var456);
                            continue;
                        }
                        if (var470 == 5020) {
                            var6--;
                            String var457 = field764[var6];
                            client.method709(var457);
                            continue;
                        }
                        if (var470 == 5021) {
                            var6--;
                            client.field540 = field764[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var470 == 5022) {
                            field764[var6++] = client.field540;
                            continue;
                        }
                    }
                } else {
                    class164 var78;
                    if (var470 >= 2000) {
                        var470 -= 1000;
                        var5--;
                        var78 = class164.method560(field762[var5]);
                    } else {
                        var78 = var51 ? Statics.field771 : Statics.field770;
                    }
                    if (var470 == 1300) {
                        var5--;
                        int var79 = field762[var5] - 1;
                        if (var79 >= 0 && var79 <= 9) {
                            var6--;
                            var78.method3044(var79, field764[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var470 == 1301) {
                        var5 -= 2;
                        int var80 = field762[var5];
                        int var81 = field762[var5 + 1];
                        var78.field2721 = class164.method554(var80, var81);
                        continue;
                    }
                    if (var470 == 1302) {
                        var5--;
                        var78.field2756 = field762[var5] == 1;
                        continue;
                    }
                    if (var470 == 1303) {
                        var5--;
                        var78.field2748 = field762[var5];
                        continue;
                    }
                    if (var470 == 1304) {
                        var5--;
                        var78.field2731 = field762[var5];
                        continue;
                    }
                    if (var470 == 1305) {
                        var6--;
                        var78.field2719 = field764[var6];
                        continue;
                    }
                    if (var470 == 1306) {
                        var6--;
                        var78.field2735 = field764[var6];
                        continue;
                    }
                    if (var470 == 1307) {
                        var78.field2720 = null;
                        continue;
                    }
                }
                if (var470 < 5400) {
                    if (var470 == 5306) {
                        int[] var458 = field762;
                        int var459 = var5++;
                        int var460 = client.field498 ? 2 : 1;
                        var458[var459] = var460;
                        continue;
                    }
                    if (var470 == 5307) {
                        var5--;
                        int var461 = field762[var5];
                        if (var461 != 1 && var461 != 2) {
                            continue;
                        }
                        client.field497 = 0L;
                        if (var461 >= 2) {
                            client.field498 = true;
                        } else {
                            client.field498 = false;
                        }
                        client.method541();
                        if (client.field555 >= 25) {
                            client.method2521();
                        }
                        class136.field2109 = true;
                        continue;
                    }
                    if (var470 == 5308) {
                        field762[var5++] = Statics.field134.field152;
                        continue;
                    }
                    if (var470 == 5309) {
                        var5--;
                        int var462 = field762[var5];
                        if (var462 == 1 || var462 == 2) {
                            Statics.field134.field152 = var462;
                            class9.method156();
                        }
                        continue;
                    }
                }
                if (var470 >= 5600 || var470 != 5504) {
                    if (var470 < 6300) {
                        if (var470 == 6200) {
                            var5 -= 2;
                            client.field525 = (short) field762[var5];
                            if (client.field525 <= 0) {
                                client.field525 = 256;
                            }
                            client.field541 = (short) field762[var5 + 1];
                            if (client.field541 <= 0) {
                                client.field541 = 205;
                            }
                            continue;
                        }
                        if (var470 == 6201) {
                            var5 -= 2;
                            client.field542 = (short) field762[var5];
                            if (client.field542 <= 0) {
                                client.field542 = 256;
                            }
                            client.field543 = (short) field762[var5 + 1];
                            if (client.field543 <= 0) {
                                client.field543 = 320;
                            }
                            continue;
                        }
                        if (var470 == 6202) {
                            var5 -= 4;
                            client.field531 = (short) field762[var5];
                            if (client.field531 <= 0) {
                                client.field531 = 1;
                            }
                            client.field545 = (short) field762[var5 + 1];
                            if (client.field545 <= 0) {
                                client.field545 = 32767;
                            } else if (client.field545 < client.field531) {
                                client.field545 = client.field531;
                            }
                            client.field480 = (short) field762[var5 + 2];
                            if (client.field480 <= 0) {
                                client.field480 = 1;
                            }
                            client.field547 = (short) field762[var5 + 3];
                            if (client.field547 <= 0) {
                                client.field547 = 32767;
                            } else if (client.field547 < client.field480) {
                                client.field547 = client.field480;
                            }
                            continue;
                        }
                        if (var470 == 6203) {
                            if (client.field376 == null) {
                                field762[var5++] = -1;
                                field762[var5++] = -1;
                            } else {
                                client.method874(0, 0, client.field376.field2663, client.field376.field2765, false);
                                field762[var5++] = client.field550;
                                field762[var5++] = client.field412;
                            }
                            continue;
                        }
                        if (var470 == 6204) {
                            field762[var5++] = client.field542;
                            field762[var5++] = client.field543;
                            continue;
                        }
                        if (var470 == 6205) {
                            field762[var5++] = client.field525;
                            field762[var5++] = client.field541;
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var463 = field762[var5];
                int var464 = field762[var5 + 1];
                if (!client.field533) {
                    client.field364 = var463;
                    client.field365 = var464;
                }
            }
        } catch (Exception var469) {
            StringBuilder var466 = new StringBuilder(30);
            var466.append("").append(var4.field3018).append(" ");
            for (int var467 = field768 - 1; var467 >= 0; var467--) {
                var466.append("").append(field769[var467].field208.field3018).append(" ");
            }
            var466.append("").append(var10);
            class140.method2829(var466.toString(), var469);
        }
    }

    @ObfuscatedName("c.a(II)V")
    public static void method122(int arg0) {
        if (arg0 == -1 || !class164.method915(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2764[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field2727 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field16 = var3.field2727;
                method98(var4, 2000000);
            }
        }
    }
}
