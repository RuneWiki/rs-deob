package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("cy")
public class class67 {

    @ObfuscatedName("cy.ab")
    public static int[] field841 = new int[5];

    @ObfuscatedName("cy.aq")
    public static int[][] field839 = new int[5][5000];

    @ObfuscatedName("cy.al")
    public static int[] field843 = new int[1000];

    @ObfuscatedName("cy.aa")
    public static String[] field842 = new String[1000];

    @ObfuscatedName("cy.ao")
    public static int field846 = 0;

    @ObfuscatedName("cy.ax")
    public static class60[] field847 = new class60[50];

    @ObfuscatedName("cy.am")
    public static Calendar field848 = Calendar.getInstance();

    @ObfuscatedName("cy.as")
    public static final String[] field849 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cy.ak")
    public static boolean field850 = false;

    @ObfuscatedName("cy.az")
    public static boolean field854 = false;

    @ObfuscatedName("cy.ad")
    public static ArrayList field838 = new ArrayList();

    @ObfuscatedName("cy.ae")
    public static int field853 = 0;

    @ObfuscatedName("cy.bi")
    public static final double field852 = Math.log(2.0D);

    public class67() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dh.af(Ldr;B)V")
    public static void method2285(class84 arg0) {
        method5995(arg0, 500000, 475000);
    }

    @ObfuscatedName("nz.an(Ldr;III)V")
    public static void method5995(class84 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1052;
        class75 var5;
        if (class487.method5166(arg0.field1051)) {
            Statics.field4480 = (class272) var3[0];
            class183 var4 = class183.method6285(Statics.field4480.field3069);
            var5 = class75.method3139(arg0.field1051, var4.field1917, var4.field1937);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class75.method5959(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field836 = 0;
        Statics.field1015 = 0;
        int var7 = -1;
        int[] var8 = var5.field964;
        int[] var9 = var5.field965;
        byte var10 = -1;
        field846 = 0;
        field850 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field845 = new int[var5.field967];
            int var13 = 0;
            Statics.field851 = new String[var5.field968];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1043;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1044;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1048 == null ? -1 : arg0.field1048.field3570;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1045;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1048 == null ? -1 : arg0.field1048.field3571;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1046 == null ? -1 : arg0.field1046.field3570;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1046 == null ? -1 : arg0.field1046.field3571;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1047;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1041;
                    }
                    Statics.field845[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1049;
                    }
                    Statics.field851[var14++] = var17;
                }
            }
            field853 = arg0.field1050;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field965[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method504(var61, var5, var48);
                    switch(var49) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var61 == 0) {
                    field843[++Statics.field836 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field843[++Statics.field836 - 1] = class307.field3482[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class307.field3482[var19] = field843[--Statics.field836];
                    client.method50(var19);
                } else if (var61 == 3) {
                    field842[++Statics.field1015 - 1] = var5.field966[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field836 -= 2;
                    if (field843[Statics.field836] != field843[Statics.field836 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field836 -= 2;
                    if (field843[Statics.field836] == field843[Statics.field836 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field836 -= 2;
                    if (field843[Statics.field836] < field843[Statics.field836 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field836 -= 2;
                    if (field843[Statics.field836] > field843[Statics.field836 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field846 == 0) {
                        return;
                    }
                    class60 var21 = field847[--field846];
                    var5 = var21.field464;
                    var8 = var5.field964;
                    var9 = var5.field965;
                    var7 = var21.field463;
                    Statics.field845 = var21.field467;
                    Statics.field851 = var21.field465;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field843[++Statics.field836 - 1] = class307.method4941(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class307.method5133(var23, field843[--Statics.field836]);
                } else if (var61 == 31) {
                    Statics.field836 -= 2;
                    if (field843[Statics.field836] <= field843[Statics.field836 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field836 -= 2;
                    if (field843[Statics.field836] >= field843[Statics.field836 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field843[++Statics.field836 - 1] = Statics.field845[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field845[var9[var7]] = field843[--Statics.field836];
                } else if (var61 == 35) {
                    field842[++Statics.field1015 - 1] = Statics.field851[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field851[var9[var7]] = field842[--Statics.field1015];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field1015 -= var24;
                    String var25 = class372.method4989(field842, Statics.field1015, var24);
                    field842[++Statics.field1015 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field836--;
                } else if (var61 == 39) {
                    Statics.field1015--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class75 var27 = class75.method5959(var26);
                    int[] var28 = new int[var27.field967];
                    String[] var29 = new String[var27.field968];
                    for (int var30 = 0; var30 < var27.field970; var30++) {
                        var28[var30] = field843[Statics.field836 - var27.field970 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field969; var31++) {
                        var29[var31] = field842[Statics.field1015 - var27.field969 + var31];
                    }
                    Statics.field836 -= var27.field970;
                    Statics.field1015 -= var27.field969;
                    class60 var32 = new class60();
                    var32.field464 = var5;
                    var32.field463 = var7;
                    var32.field467 = Statics.field845;
                    var32.field465 = Statics.field851;
                    field847[++field846 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field964;
                    var9 = var27.field965;
                    var7 = -1;
                    Statics.field845 = var28;
                    Statics.field851 = var29;
                } else if (var61 == 42) {
                    field843[++Statics.field836 - 1] = Statics.field4387.method2575(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field4387.method2599(var9[var7], field843[--Statics.field836]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field843[--Statics.field836];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field841[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field839[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field843[--Statics.field836];
                    if (var39 < 0 || var39 >= field841[var38]) {
                        throw new RuntimeException();
                    }
                    field843[++Statics.field836 - 1] = field839[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field836 -= 2;
                    int var41 = field843[Statics.field836];
                    if (var41 < 0 || var41 >= field841[var40]) {
                        throw new RuntimeException();
                    }
                    field839[var40][var41] = field843[Statics.field836 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field4387.method2580(var9[var7]);
                    if (var42 == null) {
                        var42 = class337.field3889;
                    }
                    field842[++Statics.field1015 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field4387.method2579(var9[var7], field842[--Statics.field1015]);
                } else if (var61 == 49) {
                    String var43 = Statics.field4387.method2586(var9[var7]);
                    field842[++Statics.field1015 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field4387.method2577(var9[var7], field842[--Statics.field1015]);
                } else if (var61 == 60) {
                    class464 var44 = var5.field971[var9[var7]];
                    class448 var45 = (class448) var44.method7945((long) field843[--Statics.field836]);
                    if (var45 != null) {
                        var7 += var45.field4744;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field1598.method3133(var9[var7]);
                    if (var46 == null) {
                        field843[++Statics.field836 - 1] = -1;
                    } else {
                        field843[++Statics.field836 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field1340.method7559(var9[var7]);
                    if (var47 == null) {
                        field843[++Statics.field836 - 1] = -1;
                    } else {
                        field843[++Statics.field836 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4745).append(" ");
            for (int var53 = field846 - 1; var53 >= 0; var53--) {
                var52.append("").append(field847[var53].field464.field4745).append(" ");
            }
            var52.append("").append(var10);
            class516.method6950(var52.toString(), var59);
        } finally {
            while (field838.size() > 0) {
                class98 var56 = (class98) field838.remove(0);
                client.method1129(var56.method2509(), var56.method2507(), var56.method2508(), var56.method2511(), "");
            }
            if (field850) {
                field850 = false;
                client.method3076();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class516.method6950("Warning: Script " + var5.field962 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("bz.aw(ILch;ZB)I")
    public static int method504(int arg0, class75 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2318(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2969(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method467(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2611(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3621(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method2829(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return Statics.method4637(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method7181(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method7363(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method4099(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method168(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2969(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method467(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2611(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3621(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method2829(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method464(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return Statics.method706(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method4549(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method499(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method168(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method6066(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3681(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method2967(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method6756(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method3659(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method5028(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method3805(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method8106(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method265(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method2782(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method1141(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method5373(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2815(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method2730(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method3283(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method1162(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method5968(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method4755(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method2162(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method5130(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method6067(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method2763(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method853(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method3185(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method208(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method2943(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method3054(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method1794(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.ac(ILch;ZI)I")
    public static int method2318(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field836 -= 3;
            int var3 = field843[Statics.field836];
            int var4 = field843[Statics.field836 + 1];
            int var5 = field843[Statics.field836 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class317 var6 = class317.method3201(var3);
            if (var6.field3707 == null) {
                var6.field3707 = new class317[var5 + 1];
            }
            if (var6.field3707.length <= var5) {
                class317[] var7 = new class317[var5 + 1];
                for (int var8 = 0; var8 < var6.field3707.length; var8++) {
                    var7[var8] = var6.field3707[var8];
                }
                var6.field3707 = var7;
            }
            if (var5 > 0 && var6.field3707[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class317 var9 = new class317();
            var9.field3598 = var4;
            var9.field3589 = var9.field3570 = var6.field3570;
            var9.field3571 = var5;
            var9.field3651 = true;
            if (var4 == 12) {
                var9.method5796();
                var9.method5797().method5663(new class101(var9));
                var9.method5797().method5537(new class102(var9));
            }
            var6.field3707[var5] = var9;
            if (arg2) {
                Statics.field329 = var9;
            } else {
                Statics.field6 = var9;
            }
            client.method3056(var6);
            return 1;
        } else if (arg0 == 101) {
            class317 var10 = arg2 ? Statics.field329 : Statics.field6;
            class317 var11 = class317.method3201(var10.field3570);
            var11.field3707[var10.field3571] = null;
            client.method3056(var11);
            return 1;
        } else if (arg0 == 102) {
            class317 var12 = class317.method3201(field843[--Statics.field836]);
            var12.field3707 = null;
            client.method3056(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field836 -= 2;
            int var13 = field843[Statics.field836];
            int var14 = field843[Statics.field836 + 1];
            class317 var15 = class317.method854(var13, var14);
            if (var15 == null || var14 == -1) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = 1;
                if (arg2) {
                    Statics.field329 = var15;
                } else {
                    Statics.field6 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class317 var16 = class317.method3201(field843[--Statics.field836]);
            if (var16 == null) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = 1;
                if (arg2) {
                    Statics.field329 = var16;
                } else {
                    Statics.field6 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fs.au(ILch;ZI)I")
    public static int method2969(int arg0, class75 arg1, boolean arg2) {
        int var3 = -1;
        class317 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field843[--Statics.field836];
            var4 = class317.method3201(var3);
        } else {
            var4 = arg2 ? Statics.field329 : Statics.field6;
        }
        if (arg0 == 1000) {
            Statics.field836 -= 4;
            var4.field3579 = field843[Statics.field836];
            var4.field3580 = field843[Statics.field836 + 1];
            var4.field3609 = field843[Statics.field836 + 2];
            var4.field3576 = field843[Statics.field836 + 3];
            client.method3056(var4);
            Statics.field466.method1281(var4);
            if (var3 != -1 && var4.field3598 == 0) {
                client.method4620(Statics.field2057[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field836 -= 4;
            var4.field3581 = field843[Statics.field836];
            var4.field3658 = field843[Statics.field836 + 1];
            var4.field3708 = field843[Statics.field836 + 2];
            var4.field3578 = field843[Statics.field836 + 3];
            client.method3056(var4);
            Statics.field466.method1281(var4);
            if (var3 != -1 && var4.field3598 == 0) {
                client.method4620(Statics.field2057[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field843[--Statics.field836] == 1;
            if (var4.field3590 != var5) {
                var4.field3590 = var5;
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3611 = field843[--Statics.field836] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3718 = field843[--Statics.field836] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.ab(ILch;ZB)I")
    public static int method467(int arg0, class75 arg1, boolean arg2) {
        int var3 = -1;
        class317 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field843[--Statics.field836];
            var4 = class317.method3201(var3);
        } else {
            var4 = arg2 ? Statics.field329 : Statics.field6;
        }
        if (arg0 == 1100) {
            Statics.field836 -= 2;
            int var5 = field843[Statics.field836];
            int var6 = field843[Statics.field836 + 1];
            if (var4.field3598 == 12) {
                class315 var7 = var4.method5797();
                if (var7 != null && var7.method5501(var5, var6)) {
                    client.method3056(var4);
                }
            } else {
                var4.field3591 = var5;
                if (var4.field3591 > var4.field3593 - var4.field3572) {
                    var4.field3591 = var4.field3593 - var4.field3572;
                }
                if (var4.field3591 < 0) {
                    var4.field3591 = 0;
                }
                var4.field3592 = var6;
                if (var4.field3592 > var4.field3594 - var4.field3586) {
                    var4.field3592 = var4.field3594 - var4.field3586;
                }
                if (var4.field3592 < 0) {
                    var4.field3592 = 0;
                }
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3595 = field843[--Statics.field836];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3599 = field843[--Statics.field836] == 1;
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3601 = field843[--Statics.field836];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3603 = field843[--Statics.field836];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3605 = field843[--Statics.field836];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3608 = field843[--Statics.field836];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3659 = field843[--Statics.field836] == 1;
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3657 = 1;
            var4.field3683 = field843[--Statics.field836];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field836 -= 6;
            var4.field3620 = field843[Statics.field836];
            var4.field3709 = field843[Statics.field836 + 1];
            var4.field3622 = field843[Statics.field836 + 2];
            var4.field3566 = field843[Statics.field836 + 3];
            var4.field3711 = field843[Statics.field836 + 4];
            var4.field3619 = field843[Statics.field836 + 5];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field843[--Statics.field836];
            if (var4.field3618 != var8) {
                var4.field3618 = var8;
                var4.field3705 = 0;
                var4.field3706 = 0;
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3575 = field843[--Statics.field836] == 1;
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field842[--Statics.field1015];
            if (!var9.equals(var4.field3716)) {
                var4.field3716 = var9;
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3632 = field843[--Statics.field836];
            if (var4.field3598 == 12) {
                class315 var10 = var4.method5797();
                if (var10 != null) {
                    var10.method5620();
                }
            }
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field836 -= 3;
            if (var4.field3598 == 12) {
                class315 var11 = var4.method5797();
                if (var11 != null) {
                    var11.method5502(field843[Statics.field836], field843[Statics.field836 + 1]);
                    var11.method5503(field843[Statics.field836 + 2]);
                }
            } else {
                var4.field3636 = field843[Statics.field836];
                var4.field3684 = field843[Statics.field836 + 1];
                var4.field3635 = field843[Statics.field836 + 2];
            }
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3574 = field843[--Statics.field836] == 1;
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3610 = field843[--Statics.field836];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3717 = field843[--Statics.field836];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3612 = field843[--Statics.field836] == 1;
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3556 = field843[--Statics.field836] == 1;
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field836 -= 2;
            var4.field3593 = field843[Statics.field836];
            var4.field3594 = field843[Statics.field836 + 1];
            client.method3056(var4);
            if (var3 != -1 && var4.field3598 == 0) {
                client.method4620(Statics.field2057[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method2140(var4.field3570, var4.field3571);
            client.field661 = var4;
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3606 = field843[--Statics.field836];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3596 = field843[--Statics.field836];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3602 = field843[--Statics.field836];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var12 = field843[--Statics.field836];
            class501 var13 = (class501) Statics.method3600(class501.method6249(), var12);
            if (var13 != null) {
                var4.field3600 = var13;
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var14 = field843[--Statics.field836] == 1;
            var4.field3604 = var14;
            return 1;
        } else if (arg0 == 1127) {
            boolean var15 = field843[--Statics.field836] == 1;
            var4.field3630 = var15;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3607 = field842[--Statics.field1015];
            client.method3056(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method5781(field842[--Statics.field1015], Statics.field78, client.method2011());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field836 -= 2;
            var4.method5871(field843[Statics.field836], field843[Statics.field836 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5785(field842[--Statics.field1015], field843[--Statics.field836]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field836--;
            class310 var16 = var4.method5799();
            if (var16 != null) {
                var16.field3494 = field843[Statics.field836];
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field836--;
            class310 var17 = var4.method5799();
            if (var17 != null) {
                var17.field3490 = field843[Statics.field836];
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field1015--;
            class315 var18 = var4.method5797();
            if (var18 != null) {
                var4.field3634 = field842[Statics.field1015];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field836--;
            class310 var19 = var4.method5799();
            if (var19 != null) {
                var19.field3492 = field843[Statics.field836];
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field836--;
            class315 var20 = var4.method5797();
            if (var20 != null && var20.method5498(field843[Statics.field836])) {
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field836--;
            class315 var21 = var4.method5797();
            if (var21 != null && var21.method5741(field843[Statics.field836])) {
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field836--;
            class315 var22 = var4.method5797();
            if (var22 != null && var22.method5500(field843[Statics.field836])) {
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var23 = field843[--Statics.field836] == 1;
            client.field723.method3863();
            class315 var24 = var4.method5797();
            if (var24 != null && var24.method5492(var23)) {
                if (var23) {
                    client.field723.method3861(var4);
                }
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var25 = field843[--Statics.field836] == 1;
            if (!var25 && client.field723.method3872() == var4) {
                client.field723.method3863();
                client.method3056(var4);
            }
            class315 var26 = var4.method5797();
            if (var26 != null) {
                var26.method5493(var25);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field836 -= 2;
            class315 var27 = var4.method5797();
            if (var27 != null && var27.method5516(field843[Statics.field836], field843[Statics.field836 + 1])) {
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field836--;
            class315 var28 = var4.method5797();
            if (var28 != null && var28.method5516(field843[Statics.field836], field843[Statics.field836])) {
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field836--;
            class315 var29 = var4.method5797();
            if (var29 != null) {
                var29.method5505(field843[Statics.field836]);
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field836--;
            class315 var30 = var4.method5797();
            if (var30 != null) {
                var30.method5491(field843[Statics.field836]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field836--;
            class315 var31 = var4.method5797();
            if (var31 != null) {
                var31.method5507(field843[Statics.field836]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field836--;
            class315 var32 = var4.method5797();
            if (var32 != null) {
                var32.method5506(field843[Statics.field836]);
                client.method3056(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field836 -= 2;
            class28 var33 = var4.method5772();
            if (var33 != null) {
                var33.method400(field843[Statics.field836], field843[Statics.field836 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field836 -= 2;
            class28 var34 = var4.method5772();
            if (var34 != null) {
                var34.method401((char) field843[Statics.field836], field843[Statics.field836 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method5780(field842[--Statics.field1015], Statics.field78);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ep.aq(ILch;ZI)I")
    public static int method2611(int arg0, class75 arg1, boolean arg2) {
        class317 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class317.method3201(field843[--Statics.field836]);
        } else {
            var3 = arg2 ? Statics.field329 : Statics.field6;
        }
        client.method3056(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field836 -= 2;
            int var9 = field843[Statics.field836];
            int var10 = field843[Statics.field836 + 1];
            var3.field3703 = var9;
            var3.field3637 = var10;
            class202 var11 = class202.method2286(var9);
            var3.field3622 = var11.field2225;
            var3.field3566 = var11.field2226;
            var3.field3711 = var11.field2260;
            var3.field3620 = var11.field2228;
            var3.field3709 = var11.field2229;
            var3.field3619 = var11.field2224;
            if (arg0 == 1205) {
                var3.field3631 = 0;
            } else if (arg0 == 1212 | var11.field2236 == 1) {
                var3.field3631 = 1;
            } else {
                var3.field3631 = 2;
            }
            if (var3.field3626 > 0) {
                var3.field3619 = var3.field3619 * 32 / var3.field3626;
            } else if (var3.field3581 > 0) {
                var3.field3619 = var3.field3619 * 32 / var3.field3581;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3657 = 2;
            var3.field3683 = field843[--Statics.field836];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3657 = 3;
            var3.field3683 = Statics.field3454.field1097.method5452();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field843[--Statics.field836] == 1;
            class317.method2117(var3, Statics.field3454.field1097, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field843[--Statics.field836];
            if (var3.field3585 == null) {
                throw new RuntimeException("");
            }
            class317.method5131(var3, var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field836 -= 2;
            int var6 = field843[Statics.field836];
            int var7 = field843[Statics.field836 + 1];
            if (var3.field3585 == null) {
                throw new RuntimeException("");
            }
            class317.method2050(var3, var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field843[--Statics.field836];
            if (var3.field3585 == null) {
                throw new RuntimeException("");
            }
            class317.method3182(var3, Statics.field3454.field1097.field3522, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ht.al(ILch;ZI)I")
    public static int method3621(int arg0, class75 arg1, boolean arg2) {
        boolean var3 = true;
        class317 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class317.method3201(field843[--Statics.field836]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field329 : Statics.field6;
        }
        if (arg0 == 1300) {
            int var5 = field843[--Statics.field836] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5778(var5, field842[--Statics.field1015]);
                return 1;
            } else {
                Statics.field1015--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field836 -= 2;
            int var6 = field843[Statics.field836];
            int var7 = field843[Statics.field836 + 1];
            var4.field3652 = class317.method854(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3577 = field843[--Statics.field836] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3653 = field843[--Statics.field836];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3639 = field843[--Statics.field836];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3650 = field842[--Statics.field1015];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3713 = field842[--Statics.field1015];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3648 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3719 = field843[--Statics.field836] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field836 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field843[Statics.field836 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field843[Statics.field836 + var10];
                        var9[var10 / 2] = (byte) field843[Statics.field836 + var10 + 1];
                    }
                }
            } else {
                Statics.field836 -= 2;
                var8 = new byte[] { (byte) field843[Statics.field836] };
                var9 = new byte[] { (byte) field843[Statics.field836 + 1] };
            }
            int var11 = field843[--Statics.field836] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method60(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field836 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field843[Statics.field836] };
            byte[] var14 = new byte[] { (byte) field843[Statics.field836 + 1] };
            method60(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field836 -= 3;
            int var15 = field843[Statics.field836] - 1;
            int var16 = field843[Statics.field836 + 1];
            int var17 = field843[Statics.field836 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method1942(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field843[--Statics.field836];
            int var20 = field843[--Statics.field836];
            method1942(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field836--;
            int var21 = field843[Statics.field836] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method6307(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method6307(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.at(Lmq;I[B[BI)V")
    public static final void method60(class317 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3646 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3646 = new byte[11][];
            arg0.field3647 = new byte[11][];
            arg0.field3628 = new int[11];
            arg0.field3671 = new int[11];
        }
        arg0.field3646[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3582 = false;
            for (int var4 = 0; var4 < arg0.field3646.length; var4++) {
                if (arg0.field3646[var4] != null) {
                    arg0.field3582 = true;
                    break;
                }
            }
        } else {
            arg0.field3582 = true;
        }
        arg0.field3647[arg1] = arg3;
    }

    @ObfuscatedName("cv.aa(Lmq;IIII)V")
    public static final void method1942(class317 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3628 == null) {
            throw new RuntimeException();
        }
        arg0.field3628[arg1] = arg2;
        arg0.field3671[arg1] = arg3;
    }

    @ObfuscatedName("ne.ay(Lmq;IB)V")
    public static final void method6307(class317 arg0, int arg1) {
        if (arg0.field3646 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3644 == null) {
            arg0.field3644 = new int[arg0.field3646.length];
        }
        arg0.field3644[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("em.ao(ILch;ZB)I")
    public static int method2829(int arg0, class75 arg1, boolean arg2) {
        class317 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class317.method3201(field843[--Statics.field836]);
        } else {
            var3 = arg2 ? Statics.field329 : Statics.field6;
        }
        String var4 = field842[--Statics.field1015];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field843[--Statics.field836];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field843[--Statics.field836];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field842[--Statics.field1015];
            } else {
                var7[var8] = Integer.valueOf(field843[--Statics.field836]);
            }
        }
        int var9 = field843[--Statics.field836];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3694 = var7;
        } else if (arg0 == 1401) {
            var3.field3662 = var7;
        } else if (arg0 == 1402) {
            var3.field3633 = var7;
        } else if (arg0 == 1403) {
            var3.field3687 = var7;
        } else if (arg0 == 1404) {
            var3.field3665 = var7;
        } else if (arg0 == 1405) {
            var3.field3666 = var7;
        } else if (arg0 == 1406) {
            var3.field3669 = var7;
        } else if (arg0 == 1407) {
            var3.field3670 = var7;
            var3.field3584 = var5;
        } else if (arg0 == 1408) {
            var3.field3676 = var7;
        } else if (arg0 == 1409) {
            var3.field3677 = var7;
        } else if (arg0 == 1410) {
            var3.field3667 = var7;
        } else if (arg0 == 1411) {
            var3.field3660 = var7;
        } else if (arg0 == 1412) {
            var3.field3664 = var7;
        } else if (arg0 == 1414) {
            var3.field3615 = var7;
            var3.field3673 = var5;
        } else if (arg0 == 1415) {
            var3.field3674 = var7;
            var3.field3675 = var5;
        } else if (arg0 == 1416) {
            var3.field3625 = var7;
        } else if (arg0 == 1417) {
            var3.field3679 = var7;
        } else if (arg0 == 1418) {
            var3.field3680 = var7;
        } else if (arg0 == 1419) {
            var3.field3681 = var7;
        } else if (arg0 == 1420) {
            var3.field3692 = var7;
        } else if (arg0 == 1421) {
            var3.field3623 = var7;
        } else if (arg0 == 1422) {
            var3.field3688 = var7;
        } else if (arg0 == 1423) {
            var3.field3689 = var7;
        } else if (arg0 == 1424) {
            var3.field3690 = var7;
        } else if (arg0 == 1425) {
            var3.field3645 = var7;
        } else if (arg0 == 1426) {
            var3.field3693 = var7;
        } else if (arg0 == 1427) {
            var3.field3691 = var7;
        } else if (arg0 == 1428) {
            var3.field3638 = var7;
        } else if (arg0 == 1429) {
            var3.field3567 = var7;
        } else if (arg0 == 1430) {
            var3.field3682 = var7;
        } else if (arg0 == 1431) {
            var3.field3583 = var7;
        } else if (arg0 == 1434) {
            var3.field3654 = var7;
        } else if (arg0 == 1435) {
            var3.field3678 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class313 var10 = var3.method5800();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3501 = var7;
                } else if (arg0 == 1437) {
                    var10.field3506 = var7;
                } else if (arg0 == 1438) {
                    var10.field3505 = var7;
                } else if (arg0 == 1439) {
                    var10.field3504 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3624 = true;
        return 1;
    }

    @ObfuscatedName("pz.ai(ILch;ZI)I")
    public static int method7181(int arg0, class75 arg1, boolean arg2) {
        class317 var3 = arg2 ? Statics.field329 : Statics.field6;
        if (arg0 == 1600) {
            field843[++Statics.field836 - 1] = var3.field3591;
            return 1;
        } else if (arg0 == 1601) {
            field843[++Statics.field836 - 1] = var3.field3592;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3598 == 12) {
                class315 var4 = var3.method5797();
                if (var4 != null) {
                    field842[++Statics.field1015 - 1] = var4.method5540().method6623();
                    return 1;
                }
            }
            field842[++Statics.field1015 - 1] = var3.field3716;
            return 1;
        } else if (arg0 == 1603) {
            field843[++Statics.field836 - 1] = var3.field3593;
            return 1;
        } else if (arg0 == 1604) {
            field843[++Statics.field836 - 1] = var3.field3594;
            return 1;
        } else if (arg0 == 1605) {
            field843[++Statics.field836 - 1] = var3.field3619;
            return 1;
        } else if (arg0 == 1606) {
            field843[++Statics.field836 - 1] = var3.field3622;
            return 1;
        } else if (arg0 == 1607) {
            field843[++Statics.field836 - 1] = var3.field3711;
            return 1;
        } else if (arg0 == 1608) {
            field843[++Statics.field836 - 1] = var3.field3566;
            return 1;
        } else if (arg0 == 1609) {
            field843[++Statics.field836 - 1] = var3.field3601;
            return 1;
        } else if (arg0 == 1610) {
            field843[++Statics.field836 - 1] = var3.field3602;
            return 1;
        } else if (arg0 == 1611) {
            field843[++Statics.field836 - 1] = var3.field3595;
            return 1;
        } else if (arg0 == 1612) {
            field843[++Statics.field836 - 1] = var3.field3596;
            return 1;
        } else if (arg0 == 1613) {
            field843[++Statics.field836 - 1] = var3.field3600.method39();
            return 1;
        } else if (arg0 == 1614) {
            field843[++Statics.field836 - 1] = var3.field3630 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class310 var5 = var3.method5799();
                field843[++Statics.field836 - 1] = var5 == null ? 0 : var5.field3494;
            }
            if (arg0 == 1618) {
                class310 var6 = var3.method5799();
                field843[++Statics.field836 - 1] = var6 == null ? 0 : var6.field3490;
                return 1;
            } else if (arg0 == 1619) {
                class315 var7 = var3.method5797();
                field842[++Statics.field1015 - 1] = var7 == null ? "" : var7.method5541().method6623();
                return 1;
            } else if (arg0 == 1620) {
                class310 var8 = var3.method5799();
                field843[++Statics.field836 - 1] = var8 == null ? 0 : var8.field3492;
                return 1;
            } else if (arg0 == 1621) {
                class315 var9 = var3.method5797();
                field843[++Statics.field836 - 1] = var9 == null ? 0 : var9.method5551();
                return 1;
            } else if (arg0 == 1622) {
                class315 var10 = var3.method5797();
                field843[++Statics.field836 - 1] = var10 == null ? 0 : var10.method5734();
                return 1;
            } else if (arg0 == 1623) {
                class315 var11 = var3.method5797();
                field843[++Statics.field836 - 1] = var11 == null ? 0 : var11.method5504();
                return 1;
            } else if (arg0 == 1624) {
                class315 var12 = var3.method5797();
                field843[++Statics.field836 - 1] = var12 != null && var12.method5543() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class315 var13 = var3.method5797();
                field843[++Statics.field836 - 1] = var13 != null && var13.method5544() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class315 var14 = var3.method5797();
                field842[++Statics.field1015 - 1] = var14 == null ? "" : var14.method5542().method6872();
                return 1;
            } else if (arg0 == 1627) {
                class315 var15 = var3.method5797();
                int var16 = var15 == null ? 0 : var15.method5547();
                int var17 = var15 == null ? 0 : var15.method5546();
                field843[++Statics.field836 - 1] = Math.min(var16, var17);
                field843[++Statics.field836 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class315 var18 = var3.method5797();
                field843[++Statics.field836 - 1] = var18 == null ? 0 : var18.method5546();
                return 1;
            } else if (arg0 == 1629) {
                class315 var19 = var3.method5797();
                field843[++Statics.field836 - 1] = var19 == null ? 0 : var19.method5553();
                return 1;
            } else if (arg0 == 1630) {
                class315 var20 = var3.method5797();
                field843[++Statics.field836 - 1] = var20 == null ? 0 : var20.method5554();
                return 1;
            } else if (arg0 == 1631) {
                class315 var21 = var3.method5797();
                field843[++Statics.field836 - 1] = var21 == null ? 0 : var21.method5556();
                return 1;
            } else if (arg0 == 1632) {
                class315 var22 = var3.method5797();
                field843[++Statics.field836 - 1] = var22 == null ? 0 : var22.method5557();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method5772();
                field843[Statics.field836 - 1] = var23 == null ? 0 : var23.method402(field843[Statics.field836 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method5772();
                field843[Statics.field836 - 1] = var24 == null ? 0 : var24.method403((char) field843[Statics.field836 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("qp.ag(ILch;ZI)I")
    public static int method7363(int arg0, class75 arg1, boolean arg2) {
        class317 var3 = arg2 ? Statics.field329 : Statics.field6;
        if (arg0 == 1700) {
            field843[++Statics.field836 - 1] = var3.field3703;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3703 == -1) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = var3.field3637;
            }
            return 1;
        } else if (arg0 == 1702) {
            field843[++Statics.field836 - 1] = var3.field3571;
            return 1;
        } else if (arg0 == 1707) {
            field843[++Statics.field836 - 1] = var3.method5787() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method7312(var3);
        } else if (arg0 == 1709) {
            return method19(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pn.ah(Lmq;I)I")
    public static int method7312(class317 arg0) {
        if (arg0.field3598 == 11) {
            String var1 = field842[--Statics.field1015];
            field843[++Statics.field836 - 1] = arg0.method5783(var1);
            return 1;
        } else {
            Statics.field1015--;
            field843[++Statics.field836 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("au.av(Lmq;I)I")
    public static int method19(class317 arg0) {
        if (arg0.field3598 == 11) {
            String var1 = field842[--Statics.field1015];
            field842[++Statics.field1015 - 1] = arg0.method5789(var1);
            return 1;
        } else {
            field842[Statics.field1015 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("in.ar(ILch;ZI)I")
    public static int method4099(int arg0, class75 arg1, boolean arg2) {
        class317 var3 = arg2 ? Statics.field329 : Statics.field6;
        if (arg0 == 1800) {
            field843[++Statics.field836 - 1] = class318.method3554(client.method345(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field843[--Statics.field836];
            int var5 = var4 - 1;
            if (var3.field3648 == null || var5 >= var3.field3648.length || var3.field3648[var5] == null) {
                field842[++Statics.field1015 - 1] = "";
            } else {
                field842[++Statics.field1015 - 1] = var3.field3648[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3650 == null) {
                field842[++Statics.field1015 - 1] = "";
            } else {
                field842[++Statics.field1015 - 1] = var3.field3650;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.am(ILch;ZS)I")
    public static int method168(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field853 >= 10) {
                throw new RuntimeException();
            }
            class317 var10;
            if (arg0 >= 2000) {
                var10 = class317.method3201(field843[--Statics.field836]);
            } else {
                var10 = arg2 ? Statics.field329 : Statics.field6;
            }
            if (var10.field3691 == null) {
                return 0;
            }
            class84 var11 = new class84();
            var11.field1048 = var10;
            var11.field1052 = var10.field3691;
            var11.field1050 = field853 + 1;
            client.field699.method6324(var11);
            return 1;
        } else if (arg0 == 1928) {
            class317 var3 = arg2 ? Statics.field329 : Statics.field6;
            int var4 = field843[--Statics.field836];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class98 var5 = new class98(var4, var3.field3570, var3.field3571, var3.field3703);
            field838.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field836 -= 3;
            int var6 = field843[Statics.field836];
            int var7 = field843[Statics.field836 + 1];
            int var8 = field843[Statics.field836 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class98 var9 = new class98(var8, var6, var7, class317.method3201(var6).field3703);
            field838.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.as(ILch;ZB)I")
    public static int method464(int arg0, class75 arg1, boolean arg2) {
        class317 var3 = class317.method3201(field843[--Statics.field836]);
        if (arg0 == 2500) {
            field843[++Statics.field836 - 1] = var3.field3661;
            return 1;
        } else if (arg0 == 2501) {
            field843[++Statics.field836 - 1] = var3.field3715;
            return 1;
        } else if (arg0 == 2502) {
            field843[++Statics.field836 - 1] = var3.field3572;
            return 1;
        } else if (arg0 == 2503) {
            field843[++Statics.field836 - 1] = var3.field3586;
            return 1;
        } else if (arg0 == 2504) {
            field843[++Statics.field836 - 1] = var3.field3590 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field843[++Statics.field836 - 1] = var3.field3589;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jc.ak(ILch;ZB)I")
    public static int method4549(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class317 var3 = class317.method3201(field843[--Statics.field836]);
            field843[++Statics.field836 - 1] = var3.field3703;
            return 1;
        } else if (arg0 == 2701) {
            class317 var4 = class317.method3201(field843[--Statics.field836]);
            if (var4.field3703 == -1) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = var4.field3637;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field843[--Statics.field836];
            class83 var6 = (class83) client.field657.method7966((long) var5);
            if (var6 == null) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field843[++Statics.field836 - 1] = client.field656;
            return 1;
        } else if (arg0 == 2707) {
            class317 var7 = class317.method3201(field843[--Statics.field836]);
            field843[++Statics.field836 - 1] = var7.method5787() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class317 var8 = class317.method3201(field843[--Statics.field836]);
            return method7312(var8);
        } else if (arg0 == 2709) {
            class317 var9 = class317.method3201(field843[--Statics.field836]);
            return method19(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.az(ILch;ZI)I")
    public static int method499(int arg0, class75 arg1, boolean arg2) {
        class317 var3 = class317.method3201(field843[--Statics.field836]);
        if (arg0 == 2800) {
            field843[++Statics.field836 - 1] = class318.method3554(client.method345(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field843[--Statics.field836];
            int var5 = var4 - 1;
            if (var3.field3648 == null || var5 >= var3.field3648.length || var3.field3648[var5] == null) {
                field842[++Statics.field1015 - 1] = "";
            } else {
                field842[++Statics.field1015 - 1] = var3.field3648[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3650 == null) {
                field842[++Statics.field1015 - 1] = "";
            } else {
                field842[++Statics.field1015 - 1] = var3.field3650;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("no.ad(ILch;ZB)I")
    public static int method6066(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field842[--Statics.field1015];
            class106.method2767(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field836 -= 2;
            client.method4045(Statics.field3454, field843[Statics.field836], field843[Statics.field836 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field854) {
                field850 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field842[--Statics.field1015];
            int var5 = 0;
            if (class372.method4954(var4)) {
                var5 = class372.method5157(var4);
            }
            class289 var6 = class289.method5974(class287.field3110, client.field753.field1385);
            var6.field3212.method8234(var5);
            client.field753.method2650(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field842[--Statics.field1015];
            class289 var8 = class289.method5974(class287.field3164, client.field753.field1385);
            var8.field3212.method8285(var7.length() + 1);
            var8.field3212.method8238(var7);
            client.field753.method2650(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field842[--Statics.field1015];
            class289 var10 = class289.method5974(class287.field3153, client.field753.field1385);
            var10.field3212.method8285(var9.length() + 1);
            var10.field3212.method8238(var9);
            client.field753.method2650(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field843[--Statics.field836];
            String var12 = field842[--Statics.field1015];
            client.method2761(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field836 -= 3;
            int var13 = field843[Statics.field836];
            int var14 = field843[Statics.field836 + 1];
            int var15 = field843[Statics.field836 + 2];
            class317 var16 = class317.method3201(var15);
            client.method6507(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field836 -= 2;
            int var17 = field843[Statics.field836];
            int var18 = field843[Statics.field836 + 1];
            class317 var19 = arg2 ? Statics.field329 : Statics.field6;
            client.method6507(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field4941 = field843[--Statics.field836] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field843[++Statics.field836 - 1] = Statics.field112.method2391() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field112.method2326(field843[--Statics.field836] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field842[--Statics.field1015];
            boolean var21 = field843[--Statics.field836] == 1;
            class32.method7266(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field843[--Statics.field836];
            class289 var23 = class289.method5974(class287.field3160, client.field753.field1385);
            var23.field3212.method8232(var22);
            client.field753.method2650(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field843[--Statics.field836];
            Statics.field1015 -= 2;
            String var25 = field842[Statics.field1015];
            String var26 = field842[Statics.field1015 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class289 var27 = class289.method5974(class287.field3141, client.field753.field1385);
                var27.field3212.method8232(1 + class489.method2043(var25) + class489.method2043(var26));
                var27.field3212.method8238(var25);
                var27.field3212.method8395(var24);
                var27.field3212.method8238(var26);
                client.field753.method2650(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 3118) {
            client.field644 = field843[--Statics.field836] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field615 = field843[--Statics.field836] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field843[--Statics.field836] == 1) {
                client.field612 |= 0x1;
            } else {
                client.field612 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field843[--Statics.field836] == 1) {
                client.field612 |= 0x2;
            } else {
                client.field612 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field843[--Statics.field836] == 1) {
                client.field612 |= 0x4;
            } else {
                client.field612 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field843[--Statics.field836] == 1) {
                client.field612 |= 0x8;
            } else {
                client.field612 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field612 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field696 = field843[--Statics.field836] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field610 = field843[--Statics.field836] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method2828(field843[--Statics.field836] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field843[++Statics.field836 - 1] = client.method170() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field836 -= 2;
            client.field583 = field843[Statics.field836];
            client.field711 = field843[Statics.field836 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field836 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 3132) {
            field843[++Statics.field836 - 1] = Statics.field211;
            field843[++Statics.field836 - 1] = Statics.field3026;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field836 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field596 = 3;
            client.field659 = field843[--Statics.field836];
            return 1;
        } else if (arg0 == 3137) {
            client.field596 = 2;
            client.field659 = field843[--Statics.field836];
            return 1;
        } else if (arg0 == 3138) {
            client.field596 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field596 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field596 = 3;
            client.field659 = arg2 ? Statics.field329.field3570 : Statics.field6.field3570;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field843[--Statics.field836] == 1;
            Statics.field112.method2327(var28);
            return 1;
        } else if (arg0 == 3142) {
            field843[++Statics.field836 - 1] = Statics.field112.method2328() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field843[--Statics.field836] == 1;
            client.field540 = var29;
            if (!var29) {
                Statics.field112.method2344("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field843[++Statics.field836 - 1] = client.field540 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field843[--Statics.field836] == 1;
            Statics.field112.method2409(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field843[++Statics.field836 - 1] = Statics.field112.method2412() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field843[++Statics.field836 - 1] = class72.field897;
            return 1;
        } else if (arg0 == 3154) {
            field843[++Statics.field836 - 1] = client.method703();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1015--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field836 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field836--;
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field836--;
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1015--;
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field836--;
            field842[++Statics.field1015 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field836--;
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field836 -= 2;
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field836 -= 2;
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field836 -= 2;
            field842[++Statics.field1015 - 1] = "";
            field842[++Statics.field1015 - 1] = "";
            field842[++Statics.field1015 - 1] = "";
            field842[++Statics.field1015 - 1] = "";
            field842[++Statics.field1015 - 1] = "";
            field842[++Statics.field1015 - 1] = "";
            field842[++Statics.field1015 - 1] = "";
            field842[++Statics.field1015 - 1] = "";
            field842[++Statics.field1015 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field836--;
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 3175) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1015--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1015--;
            return 1;
        } else if (arg0 == 3181) {
            client.method1134(field843[--Statics.field836]);
            return 1;
        } else if (arg0 == 3182) {
            field843[++Statics.field836 - 1] = client.method2570();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field843[--Statics.field836];
            client.method316(var31);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hq.ae(ILch;ZB)I")
    public static int method3681(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field836 -= 3;
            client.method2974(field843[Statics.field836], field843[Statics.field836 + 1], field843[Statics.field836 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method11(field843[--Statics.field836]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field836 -= 2;
            client.method3930(field843[Statics.field836], field843[Statics.field836 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class87 var31 = class87.field1081;
            class86 var32 = class86.field1066;
            int var33 = field843[--Statics.field836];
            if (arg0 == 3212) {
                int var34 = field843[--Statics.field836];
                var31 = (class87) Statics.method3600(class87.method5998(), var34);
                if (var31 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var34));
                }
            }
            if (arg0 == 3213) {
                int var35 = field843[--Statics.field836];
                var32 = (class86) Statics.method3600(class86.method2843(), var35);
                if (var32 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var35));
                }
            }
            if (arg0 == 3209) {
                int var36 = field843[--Statics.field836];
                var31 = (class87) Statics.method3600(class87.method5998(), var36);
                if (var31 == null) {
                    var32 = (class86) Statics.method3600(class86.method2843(), var36);
                    if (var32 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var36));
                    }
                }
            } else if (arg0 == 3181) {
                var31 = class87.field1079;
            } else if (arg0 == 3203) {
                var32 = class86.field1071;
            } else if (arg0 == 3205) {
                var32 = class86.field1065;
            } else if (arg0 == 3207) {
                var32 = class86.field1068;
            }
            if (class86.field1066 == var32) {
                switch(var31.field1082) {
                    case 1:
                        Statics.field112.method2327(var33 == 1);
                        break;
                    case 2:
                        Statics.field112.method2409(var33 == 1);
                        break;
                    case 3:
                        Statics.field112.method2361(var33 == 1);
                        break;
                    case 4:
                        if (var33 < 0) {
                            var33 = 0;
                        }
                        Statics.field112.method2418(var33);
                        break;
                    case 5:
                        client.method1134(var33);
                        break;
                    default:
                        String var37 = String.format("Unkown device option: %s.", var31.toString());
                        throw new RuntimeException(var37);
                }
            } else {
                switch(var32.field1067) {
                    case 1:
                        Statics.field112.method2326(var33 == 1);
                        break;
                    case 2:
                        int var43 = Math.min(Math.max(var33, 0), 100);
                        int var44 = Math.round((float) (var43 * 255) / 100.0F);
                        client.method2172(var44);
                        break;
                    case 3:
                        int var41 = Math.min(Math.max(var33, 0), 100);
                        int var42 = Math.round((float) (var41 * 127) / 100.0F);
                        client.method2965(var42);
                        break;
                    case 4:
                        int var39 = Math.min(Math.max(var33, 0), 100);
                        int var40 = Math.round((float) (var39 * 127) / 100.0F);
                        client.method3018(var40);
                        break;
                    default:
                        String var38 = String.format("Unkown game option: %s.", var32.toString());
                        throw new RuntimeException(var38);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class87 var19 = class87.field1081;
            class86 var20 = class86.field1066;
            boolean var21 = false;
            if (arg0 == 3214) {
                int var22 = field843[--Statics.field836];
                var19 = (class87) Statics.method3600(class87.method5998(), var22);
                if (var19 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var22));
                }
            }
            if (arg0 == 3215) {
                int var23 = field843[--Statics.field836];
                var20 = (class86) Statics.method3600(class86.method2843(), var23);
                if (var20 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var23));
                }
            }
            if (arg0 == 3210) {
                int var24 = field843[--Statics.field836];
                var19 = (class87) Statics.method3600(class87.method5998(), var24);
                if (var19 == null) {
                    var20 = (class86) Statics.method3600(class86.method2843(), var24);
                    if (var20 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var24));
                    }
                }
            } else if (arg0 == 3182) {
                var19 = class87.field1079;
            } else if (arg0 == 3204) {
                var20 = class86.field1071;
            } else if (arg0 == 3206) {
                var20 = class86.field1065;
            } else if (arg0 == 3208) {
                var20 = class86.field1068;
            }
            int var26;
            if (class86.field1066 == var20) {
                switch(var19.field1082) {
                    case 1:
                        var26 = Statics.field112.method2328() ? 1 : 0;
                        break;
                    case 2:
                        var26 = Statics.field112.method2412() ? 1 : 0;
                        break;
                    case 3:
                        var26 = Statics.field112.method2333() ? 1 : 0;
                        break;
                    case 4:
                        var26 = Statics.field112.method2345();
                        break;
                    case 5:
                        var26 = client.method2570();
                        break;
                    default:
                        String var25 = String.format("Unkown device option: %s.", var19.toString());
                        throw new RuntimeException(var25);
                }
            } else {
                switch(var20.field1067) {
                    case 1:
                        var26 = Statics.field112.method2391() ? 1 : 0;
                        break;
                    case 2:
                        int var30 = Statics.field112.method2339();
                        var26 = Math.round((float) (var30 * 100) / 255.0F);
                        break;
                    case 3:
                        int var29 = Statics.field112.method2341();
                        var26 = Math.round((float) (var29 * 100) / 127.0F);
                        break;
                    case 4:
                        int var28 = Statics.field112.method2343();
                        var26 = Math.round((float) (var28 * 100) / 127.0F);
                        break;
                    default:
                        String var27 = String.format("Unkown game option: %s.", var20.toString());
                        throw new RuntimeException(var27);
                }
            }
            field843[++Statics.field836 - 1] = var26;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var3 = field843[--Statics.field836];
            int var4 = 0;
            class87 var5 = (class87) Statics.method3600(class87.method5998(), var3);
            if (var5 != null) {
                var4 = class87.field1081 == var5 ? 0 : 1;
            }
            field843[++Statics.field836 - 1] = var4;
            return 1;
        } else if (arg0 == 3218) {
            int var6 = field843[--Statics.field836];
            int var7 = 0;
            class86 var8 = (class86) Statics.method3600(class86.method2843(), var6);
            if (var8 != null) {
                var7 = class86.field1066 == var8 ? 0 : 1;
            }
            field843[++Statics.field836 - 1] = var7;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class87 var9 = class87.field1081;
            class86 var10 = class86.field1066;
            boolean var11 = true;
            boolean var12 = true;
            if (arg0 == 3217) {
                int var13 = field843[--Statics.field836];
                var9 = (class87) Statics.method3600(class87.method5998(), var13);
                if (var9 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var13));
                }
            }
            if (arg0 == 3219) {
                int var14 = field843[--Statics.field836];
                var10 = (class86) Statics.method3600(class86.method2843(), var14);
                if (var10 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var14));
                }
            }
            byte var16;
            int var17;
            if (class86.field1066 == var10) {
                switch(var9.field1082) {
                    case 1:
                    case 2:
                    case 3:
                        var16 = 0;
                        var17 = 1;
                        break;
                    case 4:
                        var16 = 0;
                        var17 = Integer.MAX_VALUE;
                        break;
                    case 5:
                        var16 = 0;
                        var17 = 100;
                        break;
                    default:
                        String var15 = String.format("Unkown device option: %s.", var9.toString());
                        throw new RuntimeException(var15);
                }
            } else {
                switch(var10.field1067) {
                    case 1:
                        var16 = 0;
                        var17 = 1;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        var16 = 0;
                        var17 = 100;
                        break;
                    default:
                        String var18 = String.format("Unkown game option: %s.", var10.toString());
                        throw new RuntimeException(var18);
                }
            }
            field843[++Statics.field836 - 1] = var16;
            field843[++Statics.field836 - 1] = var17;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fe.ap(ILch;ZB)I")
    public static int method2967(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field843[++Statics.field836 - 1] = client.field602;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field836 -= 2;
            int var3 = field843[Statics.field836];
            int var4 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = class81.method2238(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field836 -= 2;
            int var5 = field843[Statics.field836];
            int var6 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = class81.method7581(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field836 -= 2;
            int var7 = field843[Statics.field836];
            int var8 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = class81.method7307(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class181.method1140(var9).field1905;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field743[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field629[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field630[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field231;
            int var14 = (Statics.field3454.field1171 >> 7) + Statics.field2850;
            int var15 = (Statics.field3454.field1138 >> 7) + Statics.field2841;
            field843[++Statics.field836 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field843[++Statics.field836 - 1] = client.field492 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field836 -= 2;
            int var19 = field843[Statics.field836] + 32768;
            int var20 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = class81.method2238(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field836 -= 2;
            int var21 = field843[Statics.field836] + 32768;
            int var22 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = class81.method7581(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field836 -= 2;
            int var23 = field843[Statics.field836] + 32768;
            int var24 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = class81.method7307(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field682 >= 2) {
                field843[++Statics.field836 - 1] = client.field682;
            } else {
                field843[++Statics.field836 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field843[++Statics.field836 - 1] = client.field545;
            return 1;
        } else if (arg0 == 3318) {
            field843[++Statics.field836 - 1] = client.field579;
            return 1;
        } else if (arg0 == 3321) {
            field843[++Statics.field836 - 1] = client.field625 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field843[++Statics.field836 - 1] = client.field683;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field666) {
                field843[++Statics.field836 - 1] = 1;
            } else {
                field843[++Statics.field836 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field843[++Statics.field836 - 1] = client.field489;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field836 -= 4;
            int var25 = field843[Statics.field836];
            int var26 = field843[Statics.field836 + 1];
            int var27 = field843[Statics.field836 + 2];
            int var28 = field843[Statics.field836 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field843[++Statics.field836 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field843[++Statics.field836 - 1] = client.field503;
            return 1;
        } else if (arg0 == 3327) {
            field843[++Statics.field836 - 1] = client.field504;
            return 1;
        } else if (arg0 == 3331) {
            field843[++Statics.field836 - 1] = client.field625;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ow.by(ILch;ZI)I")
    public static int method6756(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field836 -= 2;
            int var3 = field843[Statics.field836];
            int var4 = field843[Statics.field836 + 1];
            class188 var5 = class188.method3074(var3);
            if (var5.field1981 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1990; var6++) {
                if (var5.field1987[var6] == var4) {
                    field842[++Statics.field1015 - 1] = var5.field1989[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field842[++Statics.field1015 - 1] = var5.field1984;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field836 -= 4;
            int var7 = field843[Statics.field836];
            int var8 = field843[Statics.field836 + 1];
            int var9 = field843[Statics.field836 + 2];
            int var10 = field843[Statics.field836 + 3];
            class188 var11 = class188.method3074(var9);
            if (var11.field1982 != var7 || var11.field1981 != var8) {
                if (var8 == 115) {
                    field842[++Statics.field1015 - 1] = class337.field3889;
                } else {
                    field843[++Statics.field836 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1990; var12++) {
                if (var11.field1987[var12] == var10) {
                    if (var8 == 115) {
                        field842[++Statics.field1015 - 1] = var11.field1989[var12];
                    } else {
                        field843[++Statics.field836 - 1] = var11.field1988[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field842[++Statics.field1015 - 1] = var11.field1984;
                } else {
                    field843[++Statics.field836 - 1] = var11.field1986;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field843[--Statics.field836];
            class188 var14 = class188.method3074(var13);
            field843[++Statics.field836 - 1] = var14.method3429();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hb.bb(ILch;ZB)I")
    public static int method3659(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field722.method3888(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field722.method3882(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field722.method3890(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kk.bi(ILch;ZI)I")
    public static int method5028(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field804.field813 == 0) {
                field843[++Statics.field836 - 1] = -2;
            } else if (Statics.field804.field813 == 1) {
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = Statics.field804.field811.method7195();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field843[--Statics.field836];
            if (Statics.field804.method1749() && var3 >= 0 && var3 < Statics.field804.field811.method7195()) {
                class405 var4 = (class405) Statics.field804.field811.method7220(var3);
                field842[++Statics.field1015 - 1] = var4.method7168();
                field842[++Statics.field1015 - 1] = var4.method7169();
            } else {
                field842[++Statics.field1015 - 1] = "";
                field842[++Statics.field1015 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field843[--Statics.field836];
            if (Statics.field804.method1749() && var5 >= 0 && var5 < Statics.field804.field811.method7195()) {
                field843[++Statics.field836 - 1] = ((class412) Statics.field804.field811.method7220(var5)).field4600;
            } else {
                field843[++Statics.field836 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field843[--Statics.field836];
            if (Statics.field804.method1749() && var6 >= 0 && var6 < Statics.field804.field811.method7195()) {
                field843[++Statics.field836 - 1] = ((class412) Statics.field804.field811.method7220(var6)).field4599;
            } else {
                field843[++Statics.field836 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field842[--Statics.field1015];
            int var8 = field843[--Statics.field836];
            class65.method2319(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field842[--Statics.field1015];
            Statics.field804.method1742(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field842[--Statics.field1015];
            Statics.field804.method1746(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field842[--Statics.field1015];
            Statics.field804.method1744(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field842[--Statics.field1015];
            boolean var13 = true;
            Statics.field804.method1747(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field842[--Statics.field1015];
            String var15 = client.method6310(var14);
            field843[++Statics.field836 - 1] = Statics.field804.method1740(new class513(var15, Statics.field889), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1426 == null) {
                field842[++Statics.field1015 - 1] = "";
            } else {
                field842[++Statics.field1015 - 1] = Statics.field1426.field4564;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1426 == null) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = Statics.field1426.method7195();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field843[--Statics.field836];
            if (Statics.field1426 == null || var16 >= Statics.field1426.method7195()) {
                field842[++Statics.field1015 - 1] = "";
            } else {
                field842[++Statics.field1015 - 1] = Statics.field1426.method7220(var16).method7167().method8841();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field843[--Statics.field836];
            if (Statics.field1426 == null || var17 >= Statics.field1426.method7195()) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = ((class412) Statics.field1426.method7220(var17)).method7272();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field843[--Statics.field836];
            if (Statics.field1426 == null || var18 >= Statics.field1426.method7195()) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = ((class412) Statics.field1426.method7220(var18)).field4599;
            }
            return 1;
        } else if (arg0 == 3616) {
            field843[++Statics.field836 - 1] = Statics.field1426 == null ? 0 : Statics.field1426.field4568;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field842[--Statics.field1015];
            client.method8109(var19);
            return 1;
        } else if (arg0 == 3618) {
            field843[++Statics.field836 - 1] = Statics.field1426 == null ? 0 : Statics.field1426.field4567;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field842[--Statics.field1015];
            client.method6752(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method4636();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field804.method1749()) {
                field843[++Statics.field836 - 1] = Statics.field804.field812.method7195();
            } else {
                field843[++Statics.field836 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field843[--Statics.field836];
            if (Statics.field804.method1749() && var21 >= 0 && var21 < Statics.field804.field812.method7195()) {
                class411 var22 = (class411) Statics.field804.field812.method7220(var21);
                field842[++Statics.field1015 - 1] = var22.method7168();
                field842[++Statics.field1015 - 1] = var22.method7169();
            } else {
                field842[++Statics.field1015 - 1] = "";
                field842[++Statics.field1015 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field842[--Statics.field1015];
            String var24 = client.method6310(var23);
            field843[++Statics.field836 - 1] = Statics.field804.method1741(new class513(var24, Statics.field889)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field843[--Statics.field836];
            if (Statics.field1426 == null || var25 >= Statics.field1426.method7195() || !Statics.field1426.method7220(var25).method7167().equals(Statics.field3454.field1089)) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1426 == null || Statics.field1426.field4565 == null) {
                field842[++Statics.field1015 - 1] = "";
            } else {
                field842[++Statics.field1015 - 1] = Statics.field1426.field4565;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field843[--Statics.field836];
            if (Statics.field1426 == null || var26 >= Statics.field1426.method7195() || !((class407) Statics.field1426.method7220(var26)).method7144()) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field843[--Statics.field836];
            if (Statics.field1426 == null || var27 >= Statics.field1426.method7195() || !((class407) Statics.field1426.method7220(var27)).method7148()) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field804.field811.method7212();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field843[--Statics.field836] == 1;
            Statics.field804.field811.method7213(new class495(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field843[--Statics.field836] == 1;
            Statics.field804.field811.method7213(new class496(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field843[--Statics.field836] == 1;
            Statics.field804.field811.method7213(new class115(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field843[--Statics.field836] == 1;
            Statics.field804.field811.method7213(new class111(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field843[--Statics.field836] == 1;
            Statics.field804.field811.method7213(new class114(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field843[--Statics.field836] == 1;
            Statics.field804.field811.method7213(new class119(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field843[--Statics.field836] == 1;
            Statics.field804.field811.method7213(new class113(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field843[--Statics.field836] == 1;
            Statics.field804.field811.method7213(new class112(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field843[--Statics.field836] == 1;
            Statics.field804.field811.method7213(new class116(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field843[--Statics.field836] == 1;
            Statics.field804.field811.method7213(new class117(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field804.field811.method7205();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field804.field812.method7212();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field843[--Statics.field836] == 1;
            Statics.field804.field812.method7213(new class495(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field843[--Statics.field836] == 1;
            Statics.field804.field812.method7213(new class496(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field804.field812.method7205();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1426 != null) {
                Statics.field1426.method7212();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field843[--Statics.field836] == 1;
            if (Statics.field1426 != null) {
                Statics.field1426.method7213(new class495(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field843[--Statics.field836] == 1;
            if (Statics.field1426 != null) {
                Statics.field1426.method7213(new class496(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field843[--Statics.field836] == 1;
            if (Statics.field1426 != null) {
                Statics.field1426.method7213(new class115(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field843[--Statics.field836] == 1;
            if (Statics.field1426 != null) {
                Statics.field1426.method7213(new class111(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field843[--Statics.field836] == 1;
            if (Statics.field1426 != null) {
                Statics.field1426.method7213(new class114(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field843[--Statics.field836] == 1;
            if (Statics.field1426 != null) {
                Statics.field1426.method7213(new class119(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field843[--Statics.field836] == 1;
            if (Statics.field1426 != null) {
                Statics.field1426.method7213(new class113(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field843[--Statics.field836] == 1;
            if (Statics.field1426 != null) {
                Statics.field1426.method7213(new class112(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field843[--Statics.field836] == 1;
            if (Statics.field1426 != null) {
                Statics.field1426.method7213(new class116(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field843[--Statics.field836] == 1;
            if (Statics.field1426 != null) {
                Statics.field1426.method7213(new class117(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1426 != null) {
                Statics.field1426.method7205();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field843[--Statics.field836] == 1;
            Statics.field804.field811.method7213(new class118(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field843[--Statics.field836] == 1;
            if (Statics.field1426 != null) {
                Statics.field1426.method7213(new class118(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hk.be(ILch;ZI)I")
    public static int method3805(int arg0, class75 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("sh.bk(ILch;ZB)I")
    public static int method8106(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field2269 == null) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = 1;
                Statics.field1598 = Statics.field2269;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field843[--Statics.field836];
            if (client.field750[var3] == null) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = 1;
                Statics.field1598 = client.field750[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field842[++Statics.field1015 - 1] = Statics.field1598.field1714;
            return 1;
        } else if (arg0 == 3803) {
            field843[++Statics.field836 - 1] = Statics.field1598.field1716 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field843[++Statics.field836 - 1] = Statics.field1598.field1729;
            return 1;
        } else if (arg0 == 3805) {
            field843[++Statics.field836 - 1] = Statics.field1598.field1718;
            return 1;
        } else if (arg0 == 3806) {
            field843[++Statics.field836 - 1] = Statics.field1598.field1719;
            return 1;
        } else if (arg0 == 3807) {
            field843[++Statics.field836 - 1] = Statics.field1598.field1710;
            return 1;
        } else if (arg0 == 3809) {
            field843[++Statics.field836 - 1] = Statics.field1598.field1721;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field843[--Statics.field836];
            field842[++Statics.field1015 - 1] = Statics.field1598.field1732[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = Statics.field1598.field1723[var5];
            return 1;
        } else if (arg0 == 3812) {
            field843[++Statics.field836 - 1] = Statics.field1598.field1712;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field843[--Statics.field836];
            field842[++Statics.field1015 - 1] = Statics.field1598.field1733[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field836 -= 3;
            int var7 = field843[Statics.field836];
            int var8 = field843[Statics.field836 + 1];
            int var9 = field843[Statics.field836 + 2];
            field843[++Statics.field836 - 1] = Statics.field1598.method3083(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field843[++Statics.field836 - 1] = Statics.field1598.field1728;
            return 1;
        } else if (arg0 == 3816) {
            field843[++Statics.field836 - 1] = Statics.field1598.field1734;
            return 1;
        } else if (arg0 == 3817) {
            field843[++Statics.field836 - 1] = Statics.field1598.method3082(field842[--Statics.field1015]);
            return 1;
        } else if (arg0 == 3818) {
            field843[Statics.field836 - 1] = Statics.field1598.method3085()[field843[Statics.field836 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field836 -= 2;
            int var10 = field843[Statics.field836];
            int var11 = field843[Statics.field836 + 1];
            client.method5051(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = Statics.field1598.field1726[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field836 -= 3;
                int var13 = field843[Statics.field836];
                boolean var14 = field843[Statics.field836 + 1] == 1;
                int var15 = field843[Statics.field836 + 2];
                client.method3317(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field843[--Statics.field836];
                field843[++Statics.field836 - 1] = Statics.field1598.field1735[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field253 == null) {
                    field843[++Statics.field836 - 1] = 0;
                } else {
                    field843[++Statics.field836 - 1] = 1;
                    Statics.field1695 = Statics.field253;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field843[--Statics.field836];
                if (client.field679[var17] == null) {
                    field843[++Statics.field836 - 1] = 0;
                } else {
                    field843[++Statics.field836 - 1] = 1;
                    Statics.field1695 = client.field679[var17];
                    Statics.field928 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field842[++Statics.field1015 - 1] = Statics.field1695.field1773;
                return 1;
            } else if (arg0 == 3853) {
                field843[++Statics.field836 - 1] = Statics.field1695.field1775;
                return 1;
            } else if (arg0 == 3854) {
                field843[++Statics.field836 - 1] = Statics.field1695.field1769;
                return 1;
            } else if (arg0 == 3855) {
                field843[++Statics.field836 - 1] = Statics.field1695.method3155();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field843[--Statics.field836];
                field842[++Statics.field1015 - 1] = ((class142) Statics.field1695.field1770.get(var18)).field1652.method8841();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field843[--Statics.field836];
                field843[++Statics.field836 - 1] = ((class142) Statics.field1695.field1770.get(var19)).field1650;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field843[--Statics.field836];
                field843[++Statics.field836 - 1] = ((class142) Statics.field1695.field1770.get(var20)).field1655;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field843[--Statics.field836];
                client.method3137(Statics.field928, var21);
                return 1;
            } else if (arg0 == 3860) {
                field843[++Statics.field836 - 1] = Statics.field1695.method3154(field842[--Statics.field1015]);
                return 1;
            } else if (arg0 == 3861) {
                field843[Statics.field836 - 1] = Statics.field1695.method3163()[field843[Statics.field836 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field843[++Statics.field836 - 1] = Statics.field1340 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("am.bx(ILch;ZI)I")
    public static int method265(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field776[var3].method6232();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field776[var4].field4290;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field776[var5].field4291;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field776[var6].field4293;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field776[var7].field4289;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.field776[var8].field4294;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field843[--Statics.field836];
            int var10 = client.field776[var9].method6229();
            field843[++Statics.field836 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field843[--Statics.field836];
            int var12 = client.field776[var11].method6229();
            field843[++Statics.field836 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field843[--Statics.field836];
            int var14 = client.field776[var13].method6229();
            field843[++Statics.field836 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field843[--Statics.field836];
            int var16 = client.field776[var15].method6229();
            field843[++Statics.field836 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field843[--Statics.field836] == 1;
            if (Statics.field4389 != null) {
                Statics.field4389.method6163(class346.field4266, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field843[--Statics.field836] == 1;
            if (Statics.field4389 != null) {
                Statics.field4389.method6163(class346.field4267, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field836 -= 2;
            boolean var19 = field843[Statics.field836] == 1;
            boolean var20 = field843[Statics.field836 + 1] == 1;
            if (Statics.field4389 != null) {
                client.field513.field486 = var20;
                Statics.field4389.method6163(client.field513, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field843[--Statics.field836] == 1;
            if (Statics.field4389 != null) {
                Statics.field4389.method6163(class346.field4264, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field843[--Statics.field836] == 1;
            if (Statics.field4389 != null) {
                Statics.field4389.method6163(class346.field4263, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field843[++Statics.field836 - 1] = Statics.field4389 == null ? 0 : Statics.field4389.field4265.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field843[--Statics.field836];
            class352 var24 = (class352) Statics.field4389.field4265.get(var23);
            field843[++Statics.field836 - 1] = var24.field4284;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field843[--Statics.field836];
            class352 var26 = (class352) Statics.field4389.field4265.get(var25);
            field842[++Statics.field1015 - 1] = var26.method6225();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field843[--Statics.field836];
            class352 var28 = (class352) Statics.field4389.field4265.get(var27);
            field842[++Statics.field1015 - 1] = var28.method6221();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field843[--Statics.field836];
            class352 var30 = (class352) Statics.field4389.field4265.get(var29);
            long var31 = class294.method2504() - Statics.field3741 - var30.field4283;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field842[++Statics.field1015 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field843[--Statics.field836];
            class352 var38 = (class352) Statics.field4389.field4265.get(var37);
            field843[++Statics.field836 - 1] = var38.field4285.field4293;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field843[--Statics.field836];
            class352 var40 = (class352) Statics.field4389.field4265.get(var39);
            field843[++Statics.field836 - 1] = var40.field4285.field4291;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field843[--Statics.field836];
            class352 var42 = (class352) Statics.field4389.field4265.get(var41);
            field843[++Statics.field836 - 1] = var42.field4285.field4290;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eb.bo(ILch;ZI)I")
    public static int method2782(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field836 -= 2;
            int var3 = field843[Statics.field836];
            int var4 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field836 -= 2;
            int var5 = field843[Statics.field836];
            int var6 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field836 -= 2;
            int var7 = field843[Statics.field836];
            int var8 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field836 -= 2;
            int var9 = field843[Statics.field836];
            int var10 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field836 -= 5;
            int var13 = field843[Statics.field836];
            int var14 = field843[Statics.field836 + 1];
            int var15 = field843[Statics.field836 + 2];
            int var16 = field843[Statics.field836 + 3];
            int var17 = field843[Statics.field836 + 4];
            field843[++Statics.field836 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field836 -= 2;
            int var18 = field843[Statics.field836];
            int var19 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field836 -= 2;
            int var20 = field843[Statics.field836];
            int var21 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field836 -= 2;
            int var22 = field843[Statics.field836];
            int var23 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field836 -= 2;
            int var24 = field843[Statics.field836];
            int var25 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field836 -= 2;
            int var26 = field843[Statics.field836];
            int var27 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field836 -= 2;
            int var28 = field843[Statics.field836];
            int var29 = field843[Statics.field836 + 1];
            if (var28 == 0) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field836 -= 2;
            int var30 = field843[Statics.field836];
            int var31 = field843[Statics.field836 + 1];
            if (var30 == 0) {
                field843[++Statics.field836 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field843[++Statics.field836 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field843[++Statics.field836 - 1] = var30;
                    break;
                case 2:
                    field843[++Statics.field836 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field843[++Statics.field836 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field843[++Statics.field836 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field843[++Statics.field836 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field836 -= 2;
            int var32 = field843[Statics.field836];
            int var33 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field836 -= 2;
            int var34 = field843[Statics.field836];
            int var35 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field836 -= 2;
            int var36 = field843[Statics.field836];
            int var37 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field836 -= 2;
            int var38 = field843[Statics.field836];
            int var39 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field836 -= 3;
            long var40 = (long) field843[Statics.field836];
            long var42 = (long) field843[Statics.field836 + 1];
            long var44 = (long) field843[Statics.field836 + 2];
            field843[++Statics.field836 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class296.method282(field843[--Statics.field836]);
            field843[++Statics.field836 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field836 -= 2;
            int var47 = field843[Statics.field836];
            int var48 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field836 -= 3;
            int var49 = field843[Statics.field836];
            int var50 = field843[Statics.field836 + 1];
            int var51 = field843[Statics.field836 + 2];
            field843[++Statics.field836 - 1] = class296.method3015(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field836 -= 3;
            int var52 = field843[Statics.field836];
            int var53 = field843[Statics.field836 + 1];
            int var54 = field843[Statics.field836 + 2];
            field843[++Statics.field836 - 1] = class296.method324(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field836 -= 3;
            int var55 = field843[Statics.field836];
            int var56 = field843[Statics.field836 + 1];
            int var57 = field843[Statics.field836 + 2];
            int var58 = 31 - var57;
            field843[++Statics.field836 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field836 -= 4;
            int var59 = field843[Statics.field836];
            int var60 = field843[Statics.field836 + 1];
            int var61 = field843[Statics.field836 + 2];
            int var62 = field843[Statics.field836 + 3];
            int var63 = class296.method324(var59, var61, var62);
            int var64 = class296.method3035(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field843[++Statics.field836 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field843[Statics.field836 - 1] = class440.method2527(field843[Statics.field836 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field843[Statics.field836 - 1] = Statics.method7280(field843[Statics.field836 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field836 -= 2;
            int var65 = field843[Statics.field836];
            int var66 = field843[Statics.field836 + 1];
            int var67 = class440.method2742(var65, var66);
            field843[++Statics.field836 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field843[Statics.field836 - 1] = Math.abs(field843[Statics.field836 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field842[--Statics.field1015];
            int var69 = -1;
            if (class372.method4954(var68)) {
                var69 = class372.method5157(var68);
            }
            field843[++Statics.field836 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.bz(ILch;ZI)I")
    public static int method1141(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field842[--Statics.field1015];
            int var4 = field843[--Statics.field836];
            field842[++Statics.field1015 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1015 -= 2;
            String var5 = field842[Statics.field1015];
            String var6 = field842[Statics.field1015 + 1];
            field842[++Statics.field1015 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field842[--Statics.field1015];
            int var8 = field843[--Statics.field836];
            field842[++Statics.field1015 - 1] = var7 + class372.method3397(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field842[--Statics.field1015];
            field842[++Statics.field1015 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field843[--Statics.field836];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field848.setTime(new Date(var11));
            int var13 = field848.get(5);
            int var14 = field848.get(2);
            int var15 = field848.get(1);
            field842[++Statics.field1015 - 1] = var13 + "-" + field849[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1015 -= 2;
            String var16 = field842[Statics.field1015];
            String var17 = field842[Statics.field1015 + 1];
            if (Statics.field3454.field1097 == null || Statics.field3454.field1097.field3522 == 0) {
                field842[++Statics.field1015 - 1] = var16;
            } else {
                field842[++Statics.field1015 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field843[--Statics.field836];
            field842[++Statics.field1015 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1015 -= 2;
            field843[++Statics.field836 - 1] = class372.method2813(class373.method210(field842[Statics.field1015], field842[Statics.field1015 + 1], Statics.field1736));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field842[--Statics.field1015];
            Statics.field836 -= 2;
            int var20 = field843[Statics.field836];
            int var21 = field843[Statics.field836 + 1];
            byte[] var22 = Statics.field1568.method6090(var21, 0);
            class379 var23 = new class379(var22);
            field843[++Statics.field836 - 1] = var23.method6808(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field842[--Statics.field1015];
            Statics.field836 -= 2;
            int var25 = field843[Statics.field836];
            int var26 = field843[Statics.field836 + 1];
            byte[] var27 = Statics.field1568.method6090(var26, 0);
            class379 var28 = new class379(var27);
            field843[++Statics.field836 - 1] = var28.method6848(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1015 -= 2;
            String var29 = field842[Statics.field1015];
            String var30 = field842[Statics.field1015 + 1];
            if (field843[--Statics.field836] == 1) {
                field842[++Statics.field1015 - 1] = var29;
            } else {
                field842[++Statics.field1015 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field842[--Statics.field1015];
            field842[++Statics.field1015 - 1] = class383.method6854(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field842[--Statics.field1015];
            int var33 = field843[--Statics.field836];
            field842[++Statics.field1015 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class372.method3374((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class372.method1943((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class372.method3016((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class372.method3077((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field842[--Statics.field1015];
            if (var38 == null) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field842[--Statics.field1015];
            Statics.field836 -= 2;
            int var40 = field843[Statics.field836];
            int var41 = field843[Statics.field836 + 1];
            field842[++Statics.field1015 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field842[--Statics.field1015];
            StringBuilder var43 = new StringBuilder(var42.length());
            boolean var44 = false;
            for (int var45 = 0; var45 < var42.length(); var45++) {
                char var46 = var42.charAt(var45);
                if (var46 == '<') {
                    var44 = true;
                } else if (var46 == '>') {
                    var44 = false;
                } else if (!var44) {
                    var43.append(var46);
                }
            }
            field842[++Statics.field1015 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field842[--Statics.field1015];
            int var48 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1015 -= 2;
            String var49 = field842[Statics.field1015];
            String var50 = field842[Statics.field1015 + 1];
            int var51 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field842[--Statics.field1015];
            field842[++Statics.field1015 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field1015 -= 3;
            String var53 = field842[Statics.field1015];
            String var54 = field842[Statics.field1015 + 1];
            String var55 = field842[Statics.field1015 + 2];
            if (Statics.field3454.field1097 == null) {
                field842[++Statics.field1015 - 1] = var55;
                return 1;
            }
            switch(Statics.field3454.field1097.field3512) {
                case 0:
                    field842[++Statics.field1015 - 1] = var53;
                    break;
                case 1:
                    field842[++Statics.field1015 - 1] = var54;
                    break;
                case 2:
                default:
                    field842[++Statics.field1015 - 1] = var55;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lc.bm(ILch;ZB)I")
    public static int method5373(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field843[--Statics.field836];
            field842[++Statics.field1015 - 1] = class202.method2286(var3).field2261;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field836 -= 2;
            int var4 = field843[Statics.field836];
            int var5 = field843[Statics.field836 + 1];
            class202 var6 = class202.method2286(var4);
            if (var5 < 1 || var5 > 5 || var6.field2220[var5 - 1] == null) {
                field842[++Statics.field1015 - 1] = "";
            } else {
                field842[++Statics.field1015 - 1] = var6.field2220[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field836 -= 2;
            int var7 = field843[Statics.field836];
            int var8 = field843[Statics.field836 + 1];
            class202 var9 = class202.method2286(var7);
            if (var8 < 1 || var8 > 5 || var9.field2237[var8 - 1] == null) {
                field842[++Statics.field1015 - 1] = "";
            } else {
                field842[++Statics.field1015 - 1] = var9.field2237[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class202.method2286(var10).field2211;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class202.method2286(var11).field2236 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field843[--Statics.field836];
            class202 var13 = class202.method2286(var12);
            if (var13.field2254 == -1 && var13.field2253 >= 0) {
                field843[++Statics.field836 - 1] = var13.field2253;
            } else {
                field843[++Statics.field836 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field843[--Statics.field836];
            class202 var15 = class202.method2286(var14);
            if (var15.field2254 >= 0 && var15.field2253 >= 0) {
                field843[++Statics.field836 - 1] = var15.field2253;
            } else {
                field843[++Statics.field836 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class202.method2286(var16).field2231 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field843[--Statics.field836];
            class202 var18 = class202.method2286(var17);
            if (var18.field2267 == -1 && var18.field2266 >= 0) {
                field843[++Statics.field836 - 1] = var18.field2266;
            } else {
                field843[++Statics.field836 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field843[--Statics.field836];
            class202 var20 = class202.method2286(var19);
            if (var20.field2267 >= 0 && var20.field2266 >= 0) {
                field843[++Statics.field836 - 1] = var20.field2266;
            } else {
                field843[++Statics.field836 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field842[--Statics.field1015];
            int var22 = field843[--Statics.field836];
            client.method1941(var21, var22 == 1);
            field843[++Statics.field836 - 1] = Statics.field3040;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field4549 == null || Statics.field4876 >= Statics.field3040) {
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = Statics.field4549[++Statics.field4876 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field4876 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field843[--Statics.field836];
            int var24 = class202.method2286(var23).method3727();
            if (var24 == -1) {
                field843[++Statics.field836 - 1] = var24;
            } else {
                field843[++Statics.field836 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class202.method2286(var25).field2232;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class202.method2286(var26).field2217;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class202.method2286(var27).field2234;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field843[--Statics.field836];
            class202 var29 = class202.method2286(var28);
            field843[++Statics.field836 - 1] = var29.field2252;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eg.bd(ILch;ZB)I")
    public static int method2815(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field843[++Statics.field836 - 1] = client.field717;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field836 -= 3;
            client.field717 = field843[Statics.field836];
            Statics.field2100 = class508.method7082(field843[Statics.field836 + 1]);
            if (Statics.field2100 == null) {
                Statics.field2100 = class508.field5129;
            }
            client.field578 = field843[Statics.field836 + 2];
            class289 var3 = class289.method5974(class287.field3137, client.field753.field1385);
            var3.field3212.method8285(client.field717);
            var3.field3212.method8285(Statics.field2100.field5132);
            var3.field3212.method8285(client.field578);
            client.field753.method2650(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field842[--Statics.field1015];
            Statics.field836 -= 2;
            int var5 = field843[Statics.field836];
            int var6 = field843[Statics.field836 + 1];
            class289 var7 = class289.method5974(class287.field3172, client.field753.field1385);
            var7.field3212.method8285(class489.method2043(var4) + 2);
            var7.field3212.method8238(var4);
            var7.field3212.method8285(var5 - 1);
            var7.field3212.method8285(var6);
            client.field753.method2650(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field836 -= 2;
            int var8 = field843[Statics.field836];
            int var9 = field843[Statics.field836 + 1];
            class61 var10 = class106.method2253(var8, var9);
            if (var10 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
                field842[++Statics.field1015 - 1] = "";
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = var10.field471;
                field843[++Statics.field836 - 1] = var10.field472;
                field842[++Statics.field1015 - 1] = var10.field473 == null ? "" : var10.field473;
                field842[++Statics.field1015 - 1] = var10.field474 == null ? "" : var10.field474;
                field842[++Statics.field1015 - 1] = var10.field479 == null ? "" : var10.field479;
                field843[++Statics.field836 - 1] = var10.method1098() ? 1 : (var10.method1102() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field843[--Statics.field836];
            class61 var12 = class106.method2161(var11);
            if (var12 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
                field842[++Statics.field1015 - 1] = "";
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = var12.field478;
                field843[++Statics.field836 - 1] = var12.field472;
                field842[++Statics.field1015 - 1] = var12.field473 == null ? "" : var12.field473;
                field842[++Statics.field1015 - 1] = var12.field474 == null ? "" : var12.field474;
                field842[++Statics.field1015 - 1] = var12.field479 == null ? "" : var12.field479;
                field843[++Statics.field836 - 1] = var12.method1098() ? 1 : (var12.method1102() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2100 == null) {
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = Statics.field2100.field5132;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field842[--Statics.field1015];
            int var14 = field843[--Statics.field836];
            class289 var15 = class514.method5630(var14, var13, Statics.field1736, -1);
            client.field753.method2650(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1015 -= 2;
            String var16 = field842[Statics.field1015];
            String var17 = field842[Statics.field1015 + 1];
            class289 var18 = class289.method5974(class287.field3157, client.field753.field1385);
            var18.field3212.method8232(0);
            int var19 = var18.field3212.field4989;
            var18.field3212.method8238(var16);
            class320.method4756(var18.field3212, var17);
            var18.field3212.method8244(var18.field3212.field4989 - var19);
            client.field753.method2650(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field842[--Statics.field1015];
            Statics.field836 -= 2;
            int var21 = field843[Statics.field836];
            int var22 = field843[Statics.field836 + 1];
            class289 var23 = class514.method5630(var21, var20, Statics.field1736, var22);
            client.field753.method2650(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field3454 == null || Statics.field3454.field1089 == null) {
                var24 = "";
            } else {
                var24 = Statics.field3454.field1089.method8841();
            }
            field842[++Statics.field1015 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field843[++Statics.field836 - 1] = client.field578;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = Statics.method1733(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class106.method4348(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = class106.method2801(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field842[--Statics.field1015];
            Statics.method2046(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field719 = field842[--Statics.field1015].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field842[++Statics.field1015 - 1] = client.field719;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field842[--Statics.field1015];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field836 -= 2;
            int var30 = field843[Statics.field836];
            int var31 = field843[Statics.field836 + 1];
            class61 var32 = class106.method2253(var30, var31);
            if (var32 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
                field842[++Statics.field1015 - 1] = "";
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = var32.field471;
                field843[++Statics.field836 - 1] = var32.field472;
                field842[++Statics.field1015 - 1] = var32.field473 == null ? "" : var32.field473;
                field842[++Statics.field1015 - 1] = var32.field474 == null ? "" : var32.field474;
                field842[++Statics.field1015 - 1] = var32.field479 == null ? "" : var32.field479;
                field843[++Statics.field836 - 1] = var32.method1098() ? 1 : (var32.method1102() ? 2 : 0);
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field843[--Statics.field836];
            class61 var34 = class106.method2161(var33);
            if (var34 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
                field842[++Statics.field1015 - 1] = "";
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = var34.field478;
                field843[++Statics.field836 - 1] = var34.field472;
                field842[++Statics.field1015 - 1] = var34.field473 == null ? "" : var34.field473;
                field842[++Statics.field1015 - 1] = var34.field474 == null ? "" : var34.field474;
                field842[++Statics.field1015 - 1] = var34.field479 == null ? "" : var34.field479;
                field843[++Statics.field836 - 1] = var34.method1098() ? 1 : (var34.method1102() ? 2 : 0);
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ej.bt(ILch;ZI)I")
    public static int method2730(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field843[++Statics.field836 - 1] = client.method6195();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field843[--Statics.field836];
            if (var3 == 1 || var3 == 2) {
                client.method1062(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field843[++Statics.field836 - 1] = Statics.field112.method2349();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field843[--Statics.field836];
            if (var4 == 1 || var4 == 2) {
                Statics.field112.method2348(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field836--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gd.bj(ILch;ZI)I")
    public static int method3283(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field836 -= 2;
            int var3 = field843[Statics.field836];
            int var4 = field843[Statics.field836 + 1];
            if (!client.field746) {
                client.field595 = var3;
                client.field758 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field843[++Statics.field836 - 1] = client.field595;
            return 1;
        } else if (arg0 == 5506) {
            field843[++Statics.field836 - 1] = client.field758;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field843[--Statics.field836];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field771 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field843[++Statics.field836 - 1] = client.field771;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.bn(ILch;ZI)I")
    public static int method1162(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field761 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.br(II)I")
    public static int method852(int arg0) {
        return (int) ((Math.log((double) arg0) / field852 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("mg.bg(ILch;ZB)I")
    public static int method5968(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field836 -= 2;
            client.field759 = (short) Statics.method4548(field843[Statics.field836]);
            if (client.field759 <= 0) {
                client.field759 = 256;
            }
            client.field760 = (short) Statics.method4548(field843[Statics.field836 + 1]);
            if (client.field760 <= 0) {
                client.field760 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field836 -= 2;
            client.field775 = (short) field843[Statics.field836];
            if (client.field775 <= 0) {
                client.field775 = 256;
            }
            client.field762 = (short) field843[Statics.field836 + 1];
            if (client.field762 <= 0) {
                client.field762 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field836 -= 4;
            client.field573 = (short) field843[Statics.field836];
            if (client.field573 <= 0) {
                client.field573 = 1;
            }
            client.field764 = (short) field843[Statics.field836 + 1];
            if (client.field764 <= 0) {
                client.field764 = 32767;
            } else if (client.field764 < client.field573) {
                client.field764 = client.field573;
            }
            client.field621 = (short) field843[Statics.field836 + 2];
            if (client.field621 <= 0) {
                client.field621 = 1;
            }
            client.field695 = (short) field843[Statics.field836 + 3];
            if (client.field695 <= 0) {
                client.field695 = 32767;
            } else if (client.field695 < client.field621) {
                client.field695 = client.field621;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field667 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = -1;
            } else {
                client.method711(0, 0, client.field667.field3572, client.field667.field3586, false);
                field843[++Statics.field836 - 1] = client.field767;
                field843[++Statics.field836 - 1] = client.field770;
            }
            return 1;
        } else if (arg0 == 6204) {
            field843[++Statics.field836 - 1] = client.field775;
            field843[++Statics.field836 - 1] = client.field762;
            return 1;
        } else if (arg0 == 6205) {
            field843[++Statics.field836 - 1] = method852(client.field759);
            field843[++Statics.field836 - 1] = method852(client.field760);
            return 1;
        } else if (arg0 == 6220) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field843[++Statics.field836 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field843[++Statics.field836 - 1] = Statics.field211;
            return 1;
        } else if (arg0 == 6223) {
            field843[++Statics.field836 - 1] = Statics.field3026;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("js.bu(ILch;ZI)I")
    public static int method4755(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field843[++Statics.field836 - 1] = Statics.method2559() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class64 var3 = class64.method4345();
            if (var3 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
            } else {
                field843[++Statics.field836 - 1] = var3.field802;
                field843[++Statics.field836 - 1] = var3.field797;
                field842[++Statics.field1015 - 1] = var3.field800;
                field843[++Statics.field836 - 1] = var3.field801;
                field843[++Statics.field836 - 1] = var3.field798;
                field842[++Statics.field1015 - 1] = var3.field799;
            }
            return 1;
        } else if (arg0 == 6502) {
            class64 var4 = class64.method1918();
            if (var4 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
            } else {
                field843[++Statics.field836 - 1] = var4.field802;
                field843[++Statics.field836 - 1] = var4.field797;
                field842[++Statics.field1015 - 1] = var4.field800;
                field843[++Statics.field836 - 1] = var4.field801;
                field843[++Statics.field836 - 1] = var4.field798;
                field842[++Statics.field1015 - 1] = var4.field799;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field843[--Statics.field836];
            class64 var6 = null;
            for (int var7 = 0; var7 < class64.field792; var7++) {
                if (Statics.field179[var7].field802 == var5) {
                    var6 = Statics.field179[var7];
                    break;
                }
            }
            if (var6 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
            } else {
                field843[++Statics.field836 - 1] = var6.field802;
                field843[++Statics.field836 - 1] = var6.field797;
                field842[++Statics.field1015 - 1] = var6.field800;
                field843[++Statics.field836 - 1] = var6.field801;
                field843[++Statics.field836 - 1] = var6.field798;
                field842[++Statics.field1015 - 1] = var6.field799;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field836 -= 4;
            int var8 = field843[Statics.field836];
            boolean var9 = field843[Statics.field836 + 1] == 1;
            int var10 = field843[Statics.field836 + 2];
            boolean var11 = field843[Statics.field836 + 3] == 1;
            class64.method2958(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field843[--Statics.field836];
            if (var12 >= 0 && var12 < class64.field792) {
                class64 var13 = Statics.field179[var12];
                field843[++Statics.field836 - 1] = var13.field802;
                field843[++Statics.field836 - 1] = var13.field797;
                field842[++Statics.field1015 - 1] = var13.field800;
                field843[++Statics.field836 - 1] = var13.field801;
                field843[++Statics.field836 - 1] = var13.field798;
                field842[++Statics.field1015 - 1] = var13.field799;
            } else {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
                field843[++Statics.field836 - 1] = 0;
                field843[++Statics.field836 - 1] = 0;
                field842[++Statics.field1015 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field642 = field843[--Statics.field836] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field836 -= 2;
            int var14 = field843[Statics.field836];
            int var15 = field843[Statics.field836 + 1];
            class198 var16 = class198.method505(var15);
            if (var16.method3577()) {
                field842[++Statics.field1015 - 1] = class191.method6098(var14).method3507(var15, var16.field2118);
            } else {
                field843[++Statics.field836 - 1] = class191.method6098(var14).method3460(var15, var16.field2121);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field836 -= 2;
            int var17 = field843[Statics.field836];
            int var18 = field843[Statics.field836 + 1];
            class198 var19 = class198.method505(var18);
            if (var19.method3577()) {
                field842[++Statics.field1015 - 1] = Statics.method3057(var17).method3697(var18, var19.field2118);
            } else {
                field843[++Statics.field836 - 1] = Statics.method3057(var17).method3675(var18, var19.field2121);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field836 -= 2;
            int var20 = field843[Statics.field836];
            int var21 = field843[Statics.field836 + 1];
            class198 var22 = class198.method505(var21);
            if (var22.method3577()) {
                field842[++Statics.field1015 - 1] = class202.method2286(var20).method3726(var21, var22.field2118);
            } else {
                field843[++Statics.field836 - 1] = class202.method2286(var20).method3725(var21, var22.field2121);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field836 -= 2;
            int var23 = field843[Statics.field836];
            int var24 = field843[Statics.field836 + 1];
            class198 var25 = class198.method505(var24);
            if (var25.method3577()) {
                field842[++Statics.field1015 - 1] = class199.method3557(var23).method3604(var24, var25.field2118);
            } else {
                field843[++Statics.field836 - 1] = class199.method3557(var23).method3603(var24, var25.field2121);
            }
            return 1;
        } else if (arg0 == 6518) {
            field843[++Statics.field836 - 1] = client.field562 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field843[++Statics.field836 - 1] = client.field495;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1015--;
            Statics.field836--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1015--;
            Statics.field836--;
            return 1;
        } else if (arg0 == 6524) {
            field843[++Statics.field836 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field843[++Statics.field836 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field843[++Statics.field836 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field843[++Statics.field836 - 1] = client.field496;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dl.bf(ILch;ZI)I")
    public static int method2162(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field231;
            int var4 = (Statics.field3454.field1171 >> 7) + Statics.field2850;
            int var5 = (Statics.field3454.field1138 >> 7) + Statics.field2841;
            client.method2239().method7876(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field843[--Statics.field836];
            String var7 = "";
            class249 var8 = client.method2239().method7747(var6);
            if (var8 != null) {
                var7 = var8.method4703();
            }
            field842[++Statics.field1015 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field843[--Statics.field836];
            client.method2239().method7730(var9);
            return 1;
        } else if (arg0 == 6603) {
            field843[++Statics.field836 - 1] = client.method2239().method7744();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field843[--Statics.field836];
            client.method2239().method7729(var10);
            return 1;
        } else if (arg0 == 6605) {
            field843[++Statics.field836 - 1] = client.method2239().method7746() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class308 var11 = new class308(field843[--Statics.field836]);
            client.method2239().method7774(var11.field3486, var11.field3488);
            return 1;
        } else if (arg0 == 6607) {
            class308 var12 = new class308(field843[--Statics.field836]);
            client.method2239().method7749(var12.field3486, var12.field3488);
            return 1;
        } else if (arg0 == 6608) {
            class308 var13 = new class308(field843[--Statics.field836]);
            client.method2239().method7750(var13.field3487, var13.field3486, var13.field3488);
            return 1;
        } else if (arg0 == 6609) {
            class308 var14 = new class308(field843[--Statics.field836]);
            client.method2239().method7831(var14.field3487, var14.field3486, var14.field3488);
            return 1;
        } else if (arg0 == 6610) {
            field843[++Statics.field836 - 1] = client.method2239().method7752();
            field843[++Statics.field836 - 1] = client.method2239().method7753();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field843[--Statics.field836];
            class249 var16 = client.method2239().method7747(var15);
            if (var16 == null) {
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = var16.method4712().method5414();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field843[--Statics.field836];
            class249 var18 = client.method2239().method7747(var17);
            if (var18 == null) {
                field843[++Statics.field836 - 1] = 0;
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = (var18.method4707() - var18.method4706() + 1) * 64;
                field843[++Statics.field836 - 1] = (var18.method4693() - var18.method4747() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field843[--Statics.field836];
            class249 var20 = client.method2239().method7747(var19);
            if (var20 == null) {
                field843[++Statics.field836 - 1] = 0;
                field843[++Statics.field836 - 1] = 0;
                field843[++Statics.field836 - 1] = 0;
                field843[++Statics.field836 - 1] = 0;
            } else {
                field843[++Statics.field836 - 1] = var20.method4706() * 64;
                field843[++Statics.field836 - 1] = var20.method4747() * 64;
                field843[++Statics.field836 - 1] = var20.method4707() * 64 + 64 - 1;
                field843[++Statics.field836 - 1] = var20.method4693() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field843[--Statics.field836];
            class249 var22 = client.method2239().method7747(var21);
            if (var22 == null) {
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = var22.method4702();
            }
            return 1;
        } else if (arg0 == 6615) {
            class308 var23 = client.method2239().method7754();
            if (var23 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = var23.field3486;
                field843[++Statics.field836 - 1] = var23.field3488;
            }
            return 1;
        } else if (arg0 == 6616) {
            field843[++Statics.field836 - 1] = client.method2239().method7803();
            return 1;
        } else if (arg0 == 6617) {
            class308 var24 = new class308(field843[--Statics.field836]);
            class249 var25 = client.method2239().method7872();
            if (var25 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4746(var24.field3487, var24.field3486, var24.field3488);
            if (var26 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = var26[0];
                field843[++Statics.field836 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class308 var27 = new class308(field843[--Statics.field836]);
            class249 var28 = client.method2239().method7872();
            if (var28 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = -1;
                return 1;
            }
            class308 var29 = var28.method4698(var27.field3486, var27.field3488);
            if (var29 == null) {
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = var29.method5414();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field836 -= 2;
            int var30 = field843[Statics.field836];
            class308 var31 = new class308(field843[Statics.field836 + 1]);
            Statics.method4141(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field836 -= 2;
            int var32 = field843[Statics.field836];
            class308 var33 = new class308(field843[Statics.field836 + 1]);
            Statics.method4141(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field836 -= 2;
            int var34 = field843[Statics.field836];
            class308 var35 = new class308(field843[Statics.field836 + 1]);
            class249 var36 = client.method2239().method7747(var34);
            if (var36 == null) {
                field843[++Statics.field836 - 1] = 0;
                return 1;
            } else {
                field843[++Statics.field836 - 1] = var36.method4751(var35.field3487, var35.field3486, var35.field3488) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field843[++Statics.field836 - 1] = client.method2239().method7788();
            field843[++Statics.field836 - 1] = client.method2239().method7804();
            return 1;
        } else if (arg0 == 6623) {
            class308 var37 = new class308(field843[--Statics.field836]);
            class249 var38 = client.method2239().method7878(var37.field3487, var37.field3486, var37.field3488);
            if (var38 == null) {
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = var38.method4740();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method2239().method7757(field843[--Statics.field836]);
            return 1;
        } else if (arg0 == 6625) {
            client.method2239().method7758();
            return 1;
        } else if (arg0 == 6626) {
            client.method2239().method7759(field843[--Statics.field836]);
            return 1;
        } else if (arg0 == 6627) {
            client.method2239().method7790();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field843[--Statics.field836] == 1;
            client.method2239().method7761(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field843[--Statics.field836];
            client.method2239().method7762(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field843[--Statics.field836];
            client.method2239().method7763(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method2239().method7854();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field843[--Statics.field836] == 1;
            client.method2239().method7765(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field836 -= 2;
            int var43 = field843[Statics.field836];
            boolean var44 = field843[Statics.field836 + 1] == 1;
            client.method2239().method7766(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field836 -= 2;
            int var45 = field843[Statics.field836];
            boolean var46 = field843[Statics.field836 + 1] == 1;
            client.method2239().method7856(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field843[++Statics.field836 - 1] = client.method2239().method7847() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.method2239().method7768(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field843[--Statics.field836];
            field843[++Statics.field836 - 1] = client.method2239().method7769(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field836 -= 2;
            int var49 = field843[Statics.field836];
            class308 var50 = new class308(field843[Statics.field836 + 1]);
            class308 var51 = client.method2239().method7908(var49, var50);
            if (var51 == null) {
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = var51.method5414();
            }
            return 1;
        } else if (arg0 == 6639) {
            class267 var52 = client.method2239().method7743();
            if (var52 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = var52.method4662();
                field843[++Statics.field836 - 1] = var52.field3050.method5414();
            }
            return 1;
        } else if (arg0 == 6640) {
            class267 var53 = client.method2239().method7775();
            if (var53 == null) {
                field843[++Statics.field836 - 1] = -1;
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = var53.method4662();
                field843[++Statics.field836 - 1] = var53.field3050.method5414();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field843[--Statics.field836];
            class183 var55 = class183.method6285(var54);
            if (var55.field1920 == null) {
                field842[++Statics.field1015 - 1] = "";
            } else {
                field842[++Statics.field1015 - 1] = var55.field1920;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field843[--Statics.field836];
            class183 var57 = class183.method6285(var56);
            field843[++Statics.field836 - 1] = var57.field1922;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field843[--Statics.field836];
            class183 var59 = class183.method6285(var58);
            if (var59 == null) {
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = var59.field1937;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field843[--Statics.field836];
            class183 var61 = class183.method6285(var60);
            if (var61 == null) {
                field843[++Statics.field836 - 1] = -1;
            } else {
                field843[++Statics.field836 - 1] = var61.field1929;
            }
            return 1;
        } else if (arg0 == 6697) {
            field843[++Statics.field836 - 1] = Statics.field4480.field3069;
            return 1;
        } else if (arg0 == 6698) {
            field843[++Statics.field836 - 1] = Statics.field4480.field3070.method5414();
            return 1;
        } else if (arg0 == 6699) {
            field843[++Statics.field836 - 1] = Statics.field4480.field3071.method5414();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ks.bq(ILch;ZI)I")
    public static int method5130(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field843[--Statics.field836];
            class191 var4 = class191.method6098(var3);
            field842[++Statics.field1015 - 1] = var4 == null ? "" : var4.field2013;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field836 -= 2;
            class191 var5 = class191.method6098(field843[Statics.field836]);
            int var6 = field843[Statics.field836 + 1];
            field843[++Statics.field836 - 1] = var5.method3464(var6);
            field843[++Statics.field836 - 1] = var5.method3469(var6);
            return 1;
        } else if (arg0 == 6765) {
            class191 var7 = class191.method6098(field843[--Statics.field836]);
            field843[++Statics.field836 - 1] = var7 == null ? 0 : var7.field2046;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("no.ba(ILch;ZS)I")
    public static int method6067(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field843[--Statics.field836];
            class201 var4 = Statics.method3057(var3);
            field842[++Statics.field1015 - 1] = var4 == null ? "" : var4.field2184;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eu.bv(ILch;ZI)I")
    public static int method2763(int arg0, class75 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("bq.bl(ILch;ZI)I")
    public static int method853(int arg0, class75 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("gt.bp(ILch;ZI)I")
    public static int method3185(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field843[++Statics.field836 - 1] = client.method6945() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.bc(ILch;ZI)I")
    public static int method208(int arg0, class75 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ey.bh(ILch;ZS)I")
    public static int method2943(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field843[--Statics.field836] == 1;
            Statics.method1156(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fw.bw(ILch;ZB)I")
    public static int method3054(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field843[--Statics.field836];
            Object var45 = method2147(var44);
            int var46 = field843[--Statics.field836];
            class483 var47 = client.method3875(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class485.method3069(var46);
            Statics.field36 = var47.method8141(var45, var48);
            if (Statics.field36 == null) {
                client.field747 = -1;
                Statics.field7 = null;
                if (arg0 == 7500) {
                    field843[++Statics.field836 - 1] = 0;
                }
            } else {
                client.field747 = class485.method6561(var46);
                Statics.field7 = Statics.field36.iterator();
                if (arg0 == 7500) {
                    field843[++Statics.field836 - 1] = Statics.field36.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field7 != null && Statics.field7.hasNext()) {
                field843[++Statics.field836 - 1] = (Integer) Statics.field7.next();
            } else {
                field843[++Statics.field836 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field836 -= 3;
            int var3 = field843[Statics.field836];
            int var4 = field843[Statics.field836 + 1];
            int var5 = field843[Statics.field836 + 2];
            int var6 = class485.method6561(var4);
            int var7 = class485.method7347(var4);
            int var8 = class485.method3069(var4);
            class484 var9 = class484.method2941(var3);
            class482 var10 = class482.method5980(var6);
            int[] var11 = var10.field4960[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8161(var7);
            if (var14 == null && var10.field4961 != null) {
                var14 = var10.field4961[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class479 var17 = class477.method2573(var16);
                    if (class479.field4947 == var17) {
                        field842[++Statics.field1015 - 1] = "";
                    } else {
                        field843[++Statics.field836 - 1] = class477.method6254(var16);
                    }
                }
                return 1;
            }
            int var18 = var14.length / var11.length;
            if (var5 < 0 || var5 >= var18) {
                throw new RuntimeException();
            }
            for (int var19 = var12; var19 < var13; var19++) {
                int var20 = var11.length * var5 + var19;
                class479 var21 = class477.method2573(var11[var19]);
                if (class479.field4947 == var21) {
                    field842[++Statics.field1015 - 1] = (String) var14[var20];
                } else {
                    field843[++Statics.field836 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field836 -= 2;
            int var22 = field843[Statics.field836];
            int var23 = field843[Statics.field836 + 1];
            int var24 = 0;
            int var25 = class485.method6561(var23);
            int var26 = class485.method7347(var23);
            class484 var27 = class484.method2941(var22);
            class482 var28 = class482.method5980(var25);
            int[] var29 = var28.field4960[var26];
            Object[] var30 = var27.method8161(var26);
            if (var30 == null && var28.field4961 != null) {
                var30 = var28.field4961[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field843[++Statics.field836 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field836--;
            int var41 = field843[Statics.field836];
            class483 var42 = client.method92(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field36 = var42.method8141(0, 0);
            int var43 = 0;
            if (Statics.field36 != null) {
                client.field747 = var41;
                Statics.field7 = Statics.field36.iterator();
                var43 = Statics.field36.size();
            }
            if (arg0 == 7504) {
                field843[++Statics.field836 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field843[--Statics.field836];
            class484 var32 = class484.method2941(var31);
            field843[++Statics.field836 - 1] = var32.field4971;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field843[--Statics.field836];
            int var34 = -1;
            if (Statics.field36 != null && var33 >= 0 && var33 < Statics.field36.size()) {
                var34 = (Integer) Statics.field36.get(var33);
            }
            field843[++Statics.field836 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field843[--Statics.field836];
            Object var36 = method2147(var35);
            int var37 = field843[--Statics.field836];
            class483 var38 = client.method3875(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class485.method6561(var37) != client.field747) {
                throw new RuntimeException();
            } else if (Statics.field36 == null && Statics.field36.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class485.method3069(var37);
                List var40 = var38.method8141(var36, var39);
                Statics.field36 = new LinkedList(Statics.field36);
                if (var40 == null) {
                    Statics.field36.clear();
                } else {
                    Statics.field36.retainAll(var40);
                }
                Statics.field7 = Statics.field36.iterator();
                if (arg0 == 7507) {
                    field843[++Statics.field836 - 1] = Statics.field36.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cg.ce(ILch;ZI)I")
    public static int method1794(int arg0, class75 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ax.ci(IB)V")
    public static void method156(int arg0) {
        if (arg0 == -1 || !class317.method855(arg0)) {
            return;
        }
        class317[] var1 = Statics.field2057[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class317 var3 = var1[var2];
            if (var3.field3668 != null) {
                class84 var4 = new class84();
                var4.field1048 = var3;
                var4.field1052 = var3.field3668;
                method5995(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("nx.cc(Lsh;B)Ljava/lang/Object;")
    public static Object method6302(class479 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field4950) {
            case 1:
                return field843[--Statics.field836];
            case 2:
                return field842[--Statics.field1015];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("dr.cn(II)Ljava/lang/Object;")
    public static Object method2147(int arg0) {
        return method6302((class479) Statics.method3600(class479.method8097(), arg0));
    }
}
