package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("bd")
public class class64 {

    @ObfuscatedName("bd.w")
    public static int[] field838 = new int[5];

    @ObfuscatedName("bd.s")
    public static int[][] field839 = new int[5][5000];

    @ObfuscatedName("bd.q")
    public static int[] field847 = new int[1000];

    @ObfuscatedName("bd.x")
    public static String[] field842 = new String[1000];

    @ObfuscatedName("bd.v")
    public static int field843 = 0;

    @ObfuscatedName("bd.h")
    public static class57[] field848 = new class57[50];

    @ObfuscatedName("bd.l")
    public static Calendar field845 = Calendar.getInstance();

    @ObfuscatedName("bd.e")
    public static final String[] field846 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bd.y")
    public static boolean field844 = false;

    @ObfuscatedName("bd.i")
    public static boolean field834 = false;

    @ObfuscatedName("bd.r")
    public static ArrayList field849 = new ArrayList();

    @ObfuscatedName("bd.z")
    public static int field850 = 0;

    @ObfuscatedName("bd.ao")
    public static final double field851 = Math.log(2.0D);

    public class64() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mr.c(Lcf;B)V")
    public static void method5903(class81 arg0) {
        method4649(arg0, 500000, 475000);
    }

    @ObfuscatedName("ig.p(Lcf;III)V")
    public static void method4649(class81 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1046;
        class72 var5;
        if (class443.method5554(arg0.field1053)) {
            Statics.field4696 = (class249) var3[0];
            class172 var4 = class172.method2879(Statics.field4696.field2913);
            var5 = class72.method4085(arg0.field1053, var4.field1854, var4.field1847);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class72.method2734(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field837 = 0;
        Statics.field2020 = 0;
        int var7 = -1;
        int[] var8 = var5.field971;
        int[] var9 = var5.field974;
        byte var10 = -1;
        field843 = 0;
        field844 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field836 = new int[var5.field973];
            int var13 = 0;
            Statics.field840 = new String[var5.field977];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1045;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1048;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1044 == null ? -1 : arg0.field1044.field3395;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1047;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1044 == null ? -1 : arg0.field1044.field3415;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1051 == null ? -1 : arg0.field1051.field3395;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1051 == null ? -1 : arg0.field1051.field3415;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1049;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1050;
                    }
                    Statics.field836[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1052;
                    }
                    Statics.field840[var14++] = var17;
                }
            }
            field850 = arg0.field1042;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field974[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method5627(var61, var5, var48);
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
                    field847[++Statics.field837 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field847[++Statics.field837 - 1] = class290.field3346[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class290.field3346[var19] = field847[--Statics.field837];
                    client.method4827(var19);
                } else if (var61 == 3) {
                    field842[++Statics.field2020 - 1] = var5.field972[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field837 -= 2;
                    if (field847[Statics.field837] != field847[Statics.field837 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field837 -= 2;
                    if (field847[Statics.field837] == field847[Statics.field837 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field837 -= 2;
                    if (field847[Statics.field837] < field847[Statics.field837 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field837 -= 2;
                    if (field847[Statics.field837] > field847[Statics.field837 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field843 == 0) {
                        return;
                    }
                    class57 var21 = field848[--field843];
                    var5 = var21.field463;
                    var8 = var5.field971;
                    var9 = var5.field974;
                    var7 = var21.field467;
                    Statics.field836 = var21.field464;
                    Statics.field840 = var21.field466;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field847[++Statics.field837 - 1] = class290.method2609(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class290.method10(var23, field847[--Statics.field837]);
                } else if (var61 == 31) {
                    Statics.field837 -= 2;
                    if (field847[Statics.field837] <= field847[Statics.field837 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field837 -= 2;
                    if (field847[Statics.field837] >= field847[Statics.field837 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field847[++Statics.field837 - 1] = Statics.field836[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field836[var9[var7]] = field847[--Statics.field837];
                } else if (var61 == 35) {
                    field842[++Statics.field2020 - 1] = Statics.field840[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field840[var9[var7]] = field842[--Statics.field2020];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field2020 -= var24;
                    String var25 = class345.method5325(field842, Statics.field2020, var24);
                    field842[++Statics.field2020 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field837--;
                } else if (var61 == 39) {
                    Statics.field2020--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class72 var27 = class72.method2734(var26);
                    int[] var28 = new int[var27.field973];
                    String[] var29 = new String[var27.field977];
                    for (int var30 = 0; var30 < var27.field975; var30++) {
                        var28[var30] = field847[Statics.field837 - var27.field975 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field969; var31++) {
                        var29[var31] = field842[Statics.field2020 - var27.field969 + var31];
                    }
                    Statics.field837 -= var27.field975;
                    Statics.field2020 -= var27.field969;
                    class57 var32 = new class57();
                    var32.field463 = var5;
                    var32.field467 = var7;
                    var32.field464 = Statics.field836;
                    var32.field466 = Statics.field840;
                    field848[++field843 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field971;
                    var9 = var27.field974;
                    var7 = -1;
                    Statics.field836 = var28;
                    Statics.field840 = var29;
                } else if (var61 == 42) {
                    field847[++Statics.field837 - 1] = Statics.field4652.method2489(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field4652.method2500(var9[var7], field847[--Statics.field837]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field847[--Statics.field837];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field838[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field839[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field847[--Statics.field837];
                    if (var39 < 0 || var39 >= field838[var38]) {
                        throw new RuntimeException();
                    }
                    field847[++Statics.field837 - 1] = field839[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field837 -= 2;
                    int var41 = field847[Statics.field837];
                    if (var41 < 0 || var41 >= field838[var40]) {
                        throw new RuntimeException();
                    }
                    field839[var40][var41] = field847[Statics.field837 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field4652.method2472(var9[var7]);
                    if (var42 == null) {
                        var42 = class310.field3924;
                    }
                    field842[++Statics.field2020 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field4652.method2501(var9[var7], field842[--Statics.field2020]);
                } else if (var61 == 49) {
                    String var43 = Statics.field4652.method2503(var9[var7]);
                    field842[++Statics.field2020 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field4652.method2491(var9[var7], field842[--Statics.field2020]);
                } else if (var61 == 60) {
                    class421 var44 = var5.field976[var9[var7]];
                    class411 var45 = (class411) var44.method6917((long) field847[--Statics.field837]);
                    if (var45 != null) {
                        var7 += var45.field4503;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field2799.method2885(var9[var7]);
                    if (var46 == null) {
                        field847[++Statics.field837 - 1] = -1;
                    } else {
                        field847[++Statics.field837 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field183.method6591(var9[var7]);
                    if (var47 == null) {
                        field847[++Statics.field837 - 1] = -1;
                    } else {
                        field847[++Statics.field837 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4504).append(" ");
            for (int var53 = field843 - 1; var53 >= 0; var53--) {
                var52.append("").append(field848[var53].field463.field4504).append(" ");
            }
            var52.append("").append(var10);
            Statics.method3146(var52.toString(), var59);
        } finally {
            while (field849.size() > 0) {
                class94 var56 = (class94) field849.remove(0);
                client.method1101(var56.method2438(), var56.method2439(), var56.method2431(), var56.method2427(), "");
            }
            if (field844) {
                field844 = false;
                client.method312();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                Statics.method3146("Warning: Script " + var5.field968 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("lj.f(ILbt;ZI)I")
    public static int method5627(int arg0, class72 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method362(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method5308(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2586(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method4098(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method7020(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method6118(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method13(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method5331(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method2143(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method2844(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method2245(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method5308(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2586(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method4098(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method7020(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method6118(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method4614(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method3610(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method3199(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method6115(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method2245(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method5833(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2648(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method2585(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method209(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method2850(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method5332(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method2658(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method597(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method6117(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method2847(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method3017(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3667(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method4835(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method2144(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method4309(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method4599(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method408(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method4800(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method2848(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method174(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method7071(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method2140(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method3666(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method5352(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method2011(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method2111(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method2781(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method4662(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("r.n(ILbt;ZI)I")
    public static int method362(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field837 -= 3;
            int var3 = field847[Statics.field837];
            int var4 = field847[Statics.field837 + 1];
            int var5 = field847[Statics.field837 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class296 var6 = class296.method3318(var3);
            if (var6.field3503 == null) {
                var6.field3503 = new class296[var5 + 1];
            }
            if (var6.field3503.length <= var5) {
                class296[] var7 = new class296[var5 + 1];
                for (int var8 = 0; var8 < var6.field3503.length; var8++) {
                    var7[var8] = var6.field3503[var8];
                }
                var6.field3503 = var7;
            }
            if (var5 > 0 && var6.field3503[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class296 var9 = new class296();
            var9.field3397 = var4;
            var9.field3441 = var9.field3395 = var6.field3395;
            var9.field3415 = var5;
            var9.field3488 = true;
            var6.field3503[var5] = var9;
            if (arg2) {
                Statics.field2515 = var9;
            } else {
                Statics.field883 = var9;
            }
            client.method6648(var6);
            return 1;
        } else if (arg0 == 101) {
            class296 var10 = arg2 ? Statics.field2515 : Statics.field883;
            class296 var11 = class296.method3318(var10.field3395);
            var11.field3503[var10.field3415] = null;
            client.method6648(var11);
            return 1;
        } else if (arg0 == 102) {
            class296 var12 = class296.method3318(field847[--Statics.field837]);
            var12.field3503 = null;
            client.method6648(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field837 -= 2;
            int var13 = field847[Statics.field837];
            int var14 = field847[Statics.field837 + 1];
            class296 var15 = class296.method3126(var13, var14);
            if (var15 == null || var14 == -1) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = 1;
                if (arg2) {
                    Statics.field2515 = var15;
                } else {
                    Statics.field883 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class296 var16 = class296.method3318(field847[--Statics.field837]);
            if (var16 == null) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = 1;
                if (arg2) {
                    Statics.field2515 = var16;
                } else {
                    Statics.field883 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("km.k(ILbt;ZI)I")
    public static int method5308(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class296 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field847[--Statics.field837];
            var4 = class296.method3318(var3);
        } else {
            var4 = arg2 ? Statics.field2515 : Statics.field883;
        }
        if (arg0 == 1000) {
            Statics.field837 -= 4;
            var4.field3404 = field847[Statics.field837];
            var4.field3405 = field847[Statics.field837 + 1];
            var4.field3536 = field847[Statics.field837 + 2];
            var4.field3534 = field847[Statics.field837 + 3];
            client.method6648(var4);
            Statics.field4326.method1142(var4);
            if (var3 != -1 && var4.field3397 == 0) {
                client.method3379(Statics.field3331[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field837 -= 4;
            var4.field3436 = field847[Statics.field837];
            var4.field3518 = field847[Statics.field837 + 1];
            var4.field3402 = field847[Statics.field837 + 2];
            var4.field3460 = field847[Statics.field837 + 3];
            client.method6648(var4);
            Statics.field4326.method1142(var4);
            if (var3 != -1 && var4.field3397 == 0) {
                client.method3379(Statics.field3331[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field847[--Statics.field837] == 1;
            if (var4.field3382 != var5) {
                var4.field3382 = var5;
                client.method6648(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3407 = field847[--Statics.field837] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3547 = field847[--Statics.field837] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.w(ILbt;ZI)I")
    public static int method2586(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class296 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field847[--Statics.field837];
            var4 = class296.method3318(var3);
        } else {
            var4 = arg2 ? Statics.field2515 : Statics.field883;
        }
        if (arg0 == 1100) {
            Statics.field837 -= 2;
            var4.field3378 = field847[Statics.field837];
            if (var4.field3378 > var4.field3479 - var4.field3410) {
                var4.field3378 = var4.field3479 - var4.field3410;
            }
            if (var4.field3378 < 0) {
                var4.field3378 = 0;
            }
            var4.field3417 = field847[Statics.field837 + 1];
            if (var4.field3417 > var4.field3419 - var4.field3411) {
                var4.field3417 = var4.field3419 - var4.field3411;
            }
            if (var4.field3417 < 0) {
                var4.field3417 = 0;
            }
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field3420 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3505 = field847[--Statics.field837] == 1;
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3426 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3506 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3430 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3423 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3434 = field847[--Statics.field837] == 1;
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3439 = 1;
            var4.field3440 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field837 -= 6;
            var4.field3389 = field847[Statics.field837];
            var4.field3446 = field847[Statics.field837 + 1];
            var4.field3513 = field847[Statics.field837 + 2];
            var4.field3516 = field847[Statics.field837 + 3];
            var4.field3449 = field847[Statics.field837 + 4];
            var4.field3450 = field847[Statics.field837 + 5];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field847[--Statics.field837];
            if (var4.field3443 != var5) {
                var4.field3443 = var5;
                var4.field3497 = 0;
                var4.field3535 = 0;
                client.method6648(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3414 = field847[--Statics.field837] == 1;
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field842[--Statics.field2020];
            if (!var6.equals(var4.field3457)) {
                var4.field3457 = var6;
                client.method6648(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3456 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field837 -= 3;
            var4.field3445 = field847[Statics.field837];
            var4.field3433 = field847[Statics.field837 + 1];
            var4.field3459 = field847[Statics.field837 + 2];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3462 = field847[--Statics.field837] == 1;
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3428 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3394 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3437 = field847[--Statics.field837] == 1;
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3438 = field847[--Statics.field837] == 1;
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field837 -= 2;
            var4.field3479 = field847[Statics.field837];
            var4.field3419 = field847[Statics.field837 + 1];
            client.method6648(var4);
            if (var3 != -1 && var4.field3397 == 0) {
                client.method3379(Statics.field3331[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method6966(var4.field3395, var4.field3415);
            client.field628 = var4;
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3403 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3421 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3427 = field847[--Statics.field837];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field847[--Statics.field837];
            class456 var8 = (class456) class331.method5118(class456.method2602(), var7);
            if (var8 != null) {
                var4.field3425 = var8;
                client.method6648(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field847[--Statics.field837] == 1;
            var4.field3435 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field847[--Statics.field837] == 1;
            var4.field3502 = var10;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3543 = field842[--Statics.field2020];
            client.method6648(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method5242(field842[--Statics.field2020], Statics.field1337, client.method307());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field837 -= 2;
            var4.method5294(field847[Statics.field837], field847[Statics.field837 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5209(field842[--Statics.field2020], field847[--Statics.field837]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gt.s(ILbt;ZI)I")
    public static int method4098(int arg0, class72 arg1, boolean arg2) {
        class296 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class296.method3318(field847[--Statics.field837]);
        } else {
            var3 = arg2 ? Statics.field2515 : Statics.field883;
        }
        client.method6648(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field837 -= 2;
            int var4 = field847[Statics.field837];
            int var5 = field847[Statics.field837 + 1];
            var3.field3454 = var4;
            var3.field3424 = var5;
            class189 var6 = class189.method2643(var4);
            var3.field3513 = var6.field2150;
            var3.field3516 = var6.field2140;
            var3.field3449 = var6.field2141;
            var3.field3389 = var6.field2142;
            var3.field3446 = var6.field2143;
            var3.field3450 = var6.field2138;
            if (arg0 == 1205) {
                var3.field3455 = 0;
            } else if (arg0 == 1212 | var6.field2133 == 1) {
                var3.field3455 = 1;
            } else {
                var3.field3455 = 2;
            }
            if (var3.field3447 > 0) {
                var3.field3450 = var3.field3450 * 32 / var3.field3447;
            } else if (var3.field3436 > 0) {
                var3.field3450 = var3.field3450 * 32 / var3.field3436;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3439 = 2;
            var3.field3440 = field847[--Statics.field837];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3439 = 3;
            var3.field3440 = Statics.field890.field1086.method5157();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pr.q(ILbt;ZI)I")
    public static int method7020(int arg0, class72 arg1, boolean arg2) {
        boolean var3 = true;
        class296 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class296.method3318(field847[--Statics.field837]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field2515 : Statics.field883;
        }
        if (arg0 == 1300) {
            int var5 = field847[--Statics.field837] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5264(var5, field842[--Statics.field2020]);
                return 1;
            } else {
                Statics.field2020--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field837 -= 2;
            int var6 = field847[Statics.field837];
            int var7 = field847[Statics.field837 + 1];
            var4.field3481 = class296.method3126(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3484 = field847[--Statics.field837] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3532 = field847[--Statics.field837];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3483 = field847[--Statics.field837];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3491 = field842[--Statics.field2020];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3485 = field842[--Statics.field2020];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3480 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3548 = field847[--Statics.field837] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field837--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field837 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field847[Statics.field837 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field847[Statics.field837 + var10];
                        var9[var10 / 2] = (byte) field847[Statics.field837 + var10 + 1];
                    }
                }
            } else {
                Statics.field837 -= 2;
                var8 = new byte[] { (byte) field847[Statics.field837] };
                var9 = new byte[] { (byte) field847[Statics.field837 + 1] };
            }
            int var11 = field847[--Statics.field837] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method2993(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field837 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field847[Statics.field837] };
            byte[] var14 = new byte[] { (byte) field847[Statics.field837 + 1] };
            method2993(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field837 -= 3;
            int var15 = field847[Statics.field837] - 1;
            int var16 = field847[Statics.field837 + 1];
            int var17 = field847[Statics.field837 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method4538(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field847[--Statics.field837];
            int var20 = field847[--Statics.field837];
            method4538(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field837--;
            int var21 = field847[Statics.field837] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method2446(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method2446(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ec.m(Lkw;I[B[BI)V")
    public static final void method2993(class296 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3465 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3465 = new byte[11][];
            arg0.field3476 = new byte[11][];
            arg0.field3418 = new int[11];
            arg0.field3478 = new int[11];
        }
        arg0.field3465[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3396 = false;
            for (int var4 = 0; var4 < arg0.field3465.length; var4++) {
                if (arg0.field3465[var4] != null) {
                    arg0.field3396 = true;
                    break;
                }
            }
        } else {
            arg0.field3396 = true;
        }
        arg0.field3476[arg1] = arg3;
    }

    @ObfuscatedName("hy.x(Lkw;IIII)V")
    public static final void method4538(class296 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3418 == null) {
            throw new RuntimeException();
        }
        arg0.field3418[arg1] = arg2;
        arg0.field3478[arg1] = arg3;
    }

    @ObfuscatedName("cp.j(Lkw;II)V")
    public static final void method2446(class296 arg0, int arg1) {
        if (arg0.field3465 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3545 == null) {
            arg0.field3545 = new int[arg0.field3465.length];
        }
        arg0.field3545[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("mq.v(ILbt;ZB)I")
    public static int method6118(int arg0, class72 arg1, boolean arg2) {
        class296 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class296.method3318(field847[--Statics.field837]);
        } else {
            var3 = arg2 ? Statics.field2515 : Statics.field883;
        }
        String var4 = field842[--Statics.field2020];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field847[--Statics.field837];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field847[--Statics.field837];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field842[--Statics.field2020];
            } else {
                var7[var8] = Integer.valueOf(field847[--Statics.field837]);
            }
        }
        int var9 = field847[--Statics.field837];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3406 = var7;
        } else if (arg0 == 1401) {
            var3.field3477 = var7;
        } else if (arg0 == 1402) {
            var3.field3490 = var7;
        } else if (arg0 == 1403) {
            var3.field3492 = var7;
        } else if (arg0 == 1404) {
            var3.field3517 = var7;
        } else if (arg0 == 1405) {
            var3.field3495 = var7;
        } else if (arg0 == 1406) {
            var3.field3498 = var7;
        } else if (arg0 == 1407) {
            var3.field3499 = var7;
            var3.field3500 = var5;
        } else if (arg0 == 1408) {
            var3.field3377 = var7;
        } else if (arg0 == 1409) {
            var3.field3494 = var7;
        } else if (arg0 == 1410) {
            var3.field3496 = var7;
        } else if (arg0 == 1411) {
            var3.field3489 = var7;
        } else if (arg0 == 1412) {
            var3.field3493 = var7;
        } else if (arg0 == 1414) {
            var3.field3501 = var7;
            var3.field3530 = var5;
        } else if (arg0 == 1415) {
            var3.field3444 = var7;
            var3.field3504 = var5;
        } else if (arg0 == 1416) {
            var3.field3400 = var7;
        } else if (arg0 == 1417) {
            var3.field3508 = var7;
        } else if (arg0 == 1418) {
            var3.field3509 = var7;
        } else if (arg0 == 1419) {
            var3.field3510 = var7;
        } else if (arg0 == 1420) {
            var3.field3515 = var7;
        } else if (arg0 == 1421) {
            var3.field3514 = var7;
        } else if (arg0 == 1422) {
            var3.field3431 = var7;
        } else if (arg0 == 1423) {
            var3.field3519 = var7;
        } else if (arg0 == 1424) {
            var3.field3451 = var7;
        } else if (arg0 == 1425) {
            var3.field3521 = var7;
        } else if (arg0 == 1426) {
            var3.field3453 = var7;
        } else if (arg0 == 1427) {
            var3.field3520 = var7;
        } else if (arg0 == 1428) {
            var3.field3527 = var7;
        } else if (arg0 == 1429) {
            var3.field3432 = var7;
        } else if (arg0 == 1430) {
            var3.field3529 = var7;
        } else if (arg0 == 1431) {
            var3.field3512 = var7;
        } else if (arg0 == 1434) {
            var3.field3523 = var7;
        } else if (arg0 == 1435) {
            var3.field3507 = var7;
        } else {
            return 2;
        }
        var3.field3486 = true;
        return 1;
    }

    @ObfuscatedName("p.h(ILbt;ZI)I")
    public static int method13(int arg0, class72 arg1, boolean arg2) {
        class296 var3 = arg2 ? Statics.field2515 : Statics.field883;
        if (arg0 == 1500) {
            field847[++Statics.field837 - 1] = var3.field3448;
            return 1;
        } else if (arg0 == 1501) {
            field847[++Statics.field837 - 1] = var3.field3409;
            return 1;
        } else if (arg0 == 1502) {
            field847[++Statics.field837 - 1] = var3.field3410;
            return 1;
        } else if (arg0 == 1503) {
            field847[++Statics.field837 - 1] = var3.field3411;
            return 1;
        } else if (arg0 == 1504) {
            field847[++Statics.field837 - 1] = var3.field3382 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field847[++Statics.field837 - 1] = var3.field3441;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kq.t(ILbt;ZB)I")
    public static int method5331(int arg0, class72 arg1, boolean arg2) {
        class296 var3 = arg2 ? Statics.field2515 : Statics.field883;
        if (arg0 == 1600) {
            field847[++Statics.field837 - 1] = var3.field3378;
            return 1;
        } else if (arg0 == 1601) {
            field847[++Statics.field837 - 1] = var3.field3417;
            return 1;
        } else if (arg0 == 1602) {
            field842[++Statics.field2020 - 1] = var3.field3457;
            return 1;
        } else if (arg0 == 1603) {
            field847[++Statics.field837 - 1] = var3.field3479;
            return 1;
        } else if (arg0 == 1604) {
            field847[++Statics.field837 - 1] = var3.field3419;
            return 1;
        } else if (arg0 == 1605) {
            field847[++Statics.field837 - 1] = var3.field3450;
            return 1;
        } else if (arg0 == 1606) {
            field847[++Statics.field837 - 1] = var3.field3513;
            return 1;
        } else if (arg0 == 1607) {
            field847[++Statics.field837 - 1] = var3.field3449;
            return 1;
        } else if (arg0 == 1608) {
            field847[++Statics.field837 - 1] = var3.field3516;
            return 1;
        } else if (arg0 == 1609) {
            field847[++Statics.field837 - 1] = var3.field3426;
            return 1;
        } else if (arg0 == 1610) {
            field847[++Statics.field837 - 1] = var3.field3427;
            return 1;
        } else if (arg0 == 1611) {
            field847[++Statics.field837 - 1] = var3.field3420;
            return 1;
        } else if (arg0 == 1612) {
            field847[++Statics.field837 - 1] = var3.field3421;
            return 1;
        } else if (arg0 == 1613) {
            field847[++Statics.field837 - 1] = var3.field3425.method42();
            return 1;
        } else if (arg0 == 1614) {
            field847[++Statics.field837 - 1] = var3.field3502 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cv.u(ILbt;ZI)I")
    public static int method2143(int arg0, class72 arg1, boolean arg2) {
        class296 var3 = arg2 ? Statics.field2515 : Statics.field883;
        if (arg0 == 1700) {
            field847[++Statics.field837 - 1] = var3.field3454;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3454 == -1) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = var3.field3424;
            }
            return 1;
        } else if (arg0 == 1702) {
            field847[++Statics.field837 - 1] = var3.field3415;
            return 1;
        } else if (arg0 == 1707) {
            field847[++Statics.field837 - 1] = var3.method5211() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method2748(var3);
        } else if (arg0 == 1709) {
            return method5898(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("di.d(Lkw;B)I")
    public static int method2748(class296 arg0) {
        if (arg0.field3397 == 11) {
            String var1 = field842[--Statics.field2020];
            field847[++Statics.field837 - 1] = arg0.method5287(var1);
            return 1;
        } else {
            Statics.field2020--;
            field847[++Statics.field837 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("mp.b(Lkw;I)I")
    public static int method5898(class296 arg0) {
        if (arg0.field3397 == 11) {
            String var1 = field842[--Statics.field2020];
            field842[++Statics.field2020 - 1] = arg0.method5213(var1);
            return 1;
        } else {
            field842[Statics.field2020 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("dd.a(ILbt;ZI)I")
    public static int method2844(int arg0, class72 arg1, boolean arg2) {
        class296 var3 = arg2 ? Statics.field2515 : Statics.field883;
        if (arg0 == 1800) {
            field847[++Statics.field837 - 1] = class297.method813(client.method2462(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field847[--Statics.field837];
            int var5 = var4 - 1;
            if (var3.field3480 == null || var5 >= var3.field3480.length || var3.field3480[var5] == null) {
                field842[++Statics.field2020 - 1] = "";
            } else {
                field842[++Statics.field2020 - 1] = var3.field3480[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3491 == null) {
                field842[++Statics.field2020 - 1] = "";
            } else {
                field842[++Statics.field2020 - 1] = var3.field3491;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cg.l(ILbt;ZI)I")
    public static int method2245(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field850 >= 10) {
                throw new RuntimeException();
            }
            class296 var10;
            if (arg0 >= 2000) {
                var10 = class296.method3318(field847[--Statics.field837]);
            } else {
                var10 = arg2 ? Statics.field2515 : Statics.field883;
            }
            if (var10.field3520 == null) {
                return 0;
            }
            class81 var11 = new class81();
            var11.field1044 = var10;
            var11.field1046 = var10.field3520;
            var11.field1042 = field850 + 1;
            client.field678.method5660(var11);
            return 1;
        } else if (arg0 == 1928) {
            class296 var3 = arg2 ? Statics.field2515 : Statics.field883;
            int var4 = field847[--Statics.field837];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class94 var5 = new class94(var4, var3.field3395, var3.field3415, var3.field3454);
            field849.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field837 -= 3;
            int var6 = field847[Statics.field837];
            int var7 = field847[Statics.field837 + 1];
            int var8 = field847[Statics.field837 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class94 var9 = new class94(var8, var6, var7, class296.method3318(var6).field3454);
            field849.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hb.e(ILbt;ZI)I")
    public static int method4614(int arg0, class72 arg1, boolean arg2) {
        class296 var3 = class296.method3318(field847[--Statics.field837]);
        if (arg0 == 2500) {
            field847[++Statics.field837 - 1] = var3.field3448;
            return 1;
        } else if (arg0 == 2501) {
            field847[++Statics.field837 - 1] = var3.field3409;
            return 1;
        } else if (arg0 == 2502) {
            field847[++Statics.field837 - 1] = var3.field3410;
            return 1;
        } else if (arg0 == 2503) {
            field847[++Statics.field837 - 1] = var3.field3411;
            return 1;
        } else if (arg0 == 2504) {
            field847[++Statics.field837 - 1] = var3.field3382 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field847[++Statics.field837 - 1] = var3.field3441;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gd.g(ILbt;ZI)I")
    public static int method3610(int arg0, class72 arg1, boolean arg2) {
        class296 var3 = class296.method3318(field847[--Statics.field837]);
        if (arg0 == 2600) {
            field847[++Statics.field837 - 1] = var3.field3378;
            return 1;
        } else if (arg0 == 2601) {
            field847[++Statics.field837 - 1] = var3.field3417;
            return 1;
        } else if (arg0 == 2602) {
            field842[++Statics.field2020 - 1] = var3.field3457;
            return 1;
        } else if (arg0 == 2603) {
            field847[++Statics.field837 - 1] = var3.field3479;
            return 1;
        } else if (arg0 == 2604) {
            field847[++Statics.field837 - 1] = var3.field3419;
            return 1;
        } else if (arg0 == 2605) {
            field847[++Statics.field837 - 1] = var3.field3450;
            return 1;
        } else if (arg0 == 2606) {
            field847[++Statics.field837 - 1] = var3.field3513;
            return 1;
        } else if (arg0 == 2607) {
            field847[++Statics.field837 - 1] = var3.field3449;
            return 1;
        } else if (arg0 == 2608) {
            field847[++Statics.field837 - 1] = var3.field3516;
            return 1;
        } else if (arg0 == 2609) {
            field847[++Statics.field837 - 1] = var3.field3426;
            return 1;
        } else if (arg0 == 2610) {
            field847[++Statics.field837 - 1] = var3.field3427;
            return 1;
        } else if (arg0 == 2611) {
            field847[++Statics.field837 - 1] = var3.field3420;
            return 1;
        } else if (arg0 == 2612) {
            field847[++Statics.field837 - 1] = var3.field3421;
            return 1;
        } else if (arg0 == 2613) {
            field847[++Statics.field837 - 1] = var3.field3425.method42();
            return 1;
        } else if (arg0 == 2614) {
            field847[++Statics.field837 - 1] = var3.field3502 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fb.y(ILbt;ZS)I")
    public static int method3199(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class296 var3 = class296.method3318(field847[--Statics.field837]);
            field847[++Statics.field837 - 1] = var3.field3454;
            return 1;
        } else if (arg0 == 2701) {
            class296 var4 = class296.method3318(field847[--Statics.field837]);
            if (var4.field3454 == -1) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = var4.field3424;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field847[--Statics.field837];
            class80 var6 = (class80) client.field667.method6941((long) var5);
            if (var6 == null) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field847[++Statics.field837 - 1] = client.field666;
            return 1;
        } else if (arg0 == 2707) {
            class296 var7 = class296.method3318(field847[--Statics.field837]);
            field847[++Statics.field837 - 1] = var7.method5211() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class296 var8 = class296.method3318(field847[--Statics.field837]);
            return method2748(var8);
        } else if (arg0 == 2709) {
            class296 var9 = class296.method3318(field847[--Statics.field837]);
            return method5898(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mw.i(ILbt;ZB)I")
    public static int method6115(int arg0, class72 arg1, boolean arg2) {
        class296 var3 = class296.method3318(field847[--Statics.field837]);
        if (arg0 == 2800) {
            field847[++Statics.field837 - 1] = class297.method813(client.method2462(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field847[--Statics.field837];
            int var5 = var4 - 1;
            if (var3.field3480 == null || var5 >= var3.field3480.length || var3.field3480[var5] == null) {
                field842[++Statics.field2020 - 1] = "";
            } else {
                field842[++Statics.field2020 - 1] = var3.field3480[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3491 == null) {
                field842[++Statics.field2020 - 1] = "";
            } else {
                field842[++Statics.field2020 - 1] = var3.field3491;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mo.r(ILbt;ZI)I")
    public static int method5833(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field842[--Statics.field2020];
            class100.method1932(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field837 -= 2;
            client.method2785(Statics.field890, field847[Statics.field837], field847[Statics.field837 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field834) {
                field844 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field842[--Statics.field2020];
            int var5 = 0;
            if (class345.method2992(var4)) {
                var5 = class345.method4977(var4);
            }
            class266 var6 = Statics.method2786(class264.field2943, client.field552.field1342);
            var6.field3064.method7364(var5);
            client.field552.method2534(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field842[--Statics.field2020];
            class266 var8 = Statics.method2786(class264.field3010, client.field552.field1342);
            var8.field3064.method7179(var7.length() + 1);
            var8.field3064.method7186(var7);
            client.field552.method2534(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field842[--Statics.field2020];
            class266 var10 = Statics.method2786(class264.field2973, client.field552.field1342);
            var10.field3064.method7179(var9.length() + 1);
            var10.field3064.method7186(var9);
            client.field552.method2534(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field847[--Statics.field837];
            String var12 = field842[--Statics.field2020];
            client.method2553(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field837 -= 3;
            int var13 = field847[Statics.field837];
            int var14 = field847[Statics.field837 + 1];
            int var15 = field847[Statics.field837 + 2];
            class296 var16 = class296.method3318(var15);
            client.method5089(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field837 -= 2;
            int var17 = field847[Statics.field837];
            int var18 = field847[Statics.field837 + 1];
            class296 var19 = arg2 ? Statics.field2515 : Statics.field883;
            client.method5089(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field2478 = field847[--Statics.field837] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field847[++Statics.field837 - 1] = Statics.field1108.method2344() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1108.method2304(field847[--Statics.field837] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field842[--Statics.field2020];
            boolean var21 = field847[--Statics.field837] == 1;
            class30.method3656(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field847[--Statics.field837];
            class266 var23 = Statics.method2786(class264.field2967, client.field552.field1342);
            var23.field3064.method7286(var22);
            client.field552.method2534(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field847[--Statics.field837];
            Statics.field2020 -= 2;
            String var25 = field842[Statics.field2020];
            String var26 = field842[Statics.field2020 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class266 var27 = Statics.method2786(class264.field3004, client.field552.field1342);
                var27.field3064.method7286(1 + class445.method6110(var25) + class445.method6110(var26));
                var27.field3064.method7186(var26);
                var27.field3064.method7179(var24);
                var27.field3064.method7186(var25);
                client.field552.method2534(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field668 = field847[--Statics.field837] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field726 = field847[--Statics.field837] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field624 = field847[--Statics.field837] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field847[--Statics.field837] == 1) {
                client.field625 |= 0x1;
            } else {
                client.field625 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field847[--Statics.field837] == 1) {
                client.field625 |= 0x2;
            } else {
                client.field625 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field847[--Statics.field837] == 1) {
                client.field625 |= 0x4;
            } else {
                client.field625 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field847[--Statics.field837] == 1) {
                client.field625 |= 0x8;
            } else {
                client.field625 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field625 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field609 = field847[--Statics.field837] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field533 = field847[--Statics.field837] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method374(field847[--Statics.field837] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field847[++Statics.field837 - 1] = client.method4834() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field837 -= 2;
            client.field584 = field847[Statics.field837];
            client.field585 = field847[Statics.field837 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field837 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field837--;
            return 1;
        } else if (arg0 == 3132) {
            field847[++Statics.field837 - 1] = Statics.field1514;
            field847[++Statics.field837 - 1] = Statics.field1825;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field837--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field837 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field594 = 3;
            client.field669 = field847[--Statics.field837];
            return 1;
        } else if (arg0 == 3137) {
            client.field594 = 2;
            client.field669 = field847[--Statics.field837];
            return 1;
        } else if (arg0 == 3138) {
            client.field594 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field594 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field594 = 3;
            client.field669 = arg2 ? Statics.field2515.field3395 : Statics.field883.field3395;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field847[--Statics.field837] == 1;
            Statics.field1108.method2282(var28);
            return 1;
        } else if (arg0 == 3142) {
            field847[++Statics.field837 - 1] = Statics.field1108.method2289() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field847[--Statics.field837] == 1;
            client.field541 = var29;
            if (!var29) {
                Statics.field1108.method2298("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field847[++Statics.field837 - 1] = client.field541 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field847[--Statics.field837] == 1;
            Statics.field1108.method2284(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field847[++Statics.field837 - 1] = Statics.field1108.method2285() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field847[++Statics.field837 - 1] = class69.field906;
            return 1;
        } else if (arg0 == 3154) {
            field847[++Statics.field837 - 1] = client.method2846();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field2020--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field837 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field837--;
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field837--;
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field2020--;
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field837--;
            field842[++Statics.field2020 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field837--;
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field837 -= 2;
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field837 -= 2;
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field837 -= 2;
            field842[++Statics.field2020 - 1] = "";
            field842[++Statics.field2020 - 1] = "";
            field842[++Statics.field2020 - 1] = "";
            field842[++Statics.field2020 - 1] = "";
            field842[++Statics.field2020 - 1] = "";
            field842[++Statics.field2020 - 1] = "";
            field842[++Statics.field2020 - 1] = "";
            field842[++Statics.field2020 - 1] = "";
            field842[++Statics.field2020 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field837--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field837--;
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field837--;
            return 1;
        } else if (arg0 == 3175) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field2020--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field2020--;
            return 1;
        } else if (arg0 == 3181) {
            client.method1107(field847[--Statics.field837]);
            return 1;
        } else if (arg0 == 3182) {
            field847[++Statics.field837 - 1] = client.method2627();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field847[--Statics.field837];
            class191 var32 = class191.method22(var31);
            if (var32.method3578()) {
                class191.method3543(var32.field2217);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dr.z(ILbt;ZB)I")
    public static int method2648(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field837 -= 3;
            client.method1943(field847[Statics.field837], field847[Statics.field837 + 1], field847[Statics.field837 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method82(field847[--Statics.field837]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field837 -= 2;
            client.method3132(field847[Statics.field837], field847[Statics.field837 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class84 var15 = class84.field1079;
            class83 var16 = class83.field1063;
            int var17 = field847[--Statics.field837];
            if (arg0 == 3212) {
                int var18 = field847[--Statics.field837];
                var15 = (class84) class331.method5118(class84.method1760(), var18);
                if (var15 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var18));
                }
            }
            if (arg0 == 3213) {
                int var19 = field847[--Statics.field837];
                var16 = (class83) class331.method5118(class83.method4089(), var19);
                if (var16 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var19));
                }
            }
            if (arg0 == 3209) {
                int var20 = field847[--Statics.field837];
                var15 = (class84) class331.method5118(class84.method1760(), var20);
                if (var15 == null) {
                    var16 = (class83) class331.method5118(class83.method4089(), var20);
                    if (var16 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var20));
                    }
                }
            } else if (arg0 == 3181) {
                var15 = class84.field1078;
            } else if (arg0 == 3203) {
                var16 = class83.field1070;
            } else if (arg0 == 3205) {
                var16 = class83.field1065;
            } else if (arg0 == 3207) {
                var16 = class83.field1066;
            }
            if (class83.field1063 == var16) {
                switch(var15.field1080) {
                    case 1:
                        Statics.field1108.method2282(var17 == 1);
                        break;
                    case 2:
                        Statics.field1108.method2284(var17 == 1);
                        break;
                    case 3:
                        Statics.field1108.method2286(var17 == 1);
                        break;
                    case 4:
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        Statics.field1108.method2343(var17);
                        break;
                    case 5:
                        client.method1107(var17);
                        break;
                    default:
                        String var21 = String.format("Unkown device option: %s.", var15.toString());
                        throw new RuntimeException(var21);
                }
            } else {
                switch(var16.field1067) {
                    case 1:
                        Statics.field1108.method2304(var17 == 1);
                        break;
                    case 2:
                        int var27 = Math.min(Math.max(var17, 0), 100);
                        int var28 = Math.round((float) (var27 * 255) / 100.0F);
                        client.method2402(var28);
                        break;
                    case 3:
                        int var25 = Math.min(Math.max(var17, 0), 100);
                        int var26 = Math.round((float) (var25 * 127) / 100.0F);
                        client.method2990(var26);
                        break;
                    case 4:
                        int var23 = Math.min(Math.max(var17, 0), 100);
                        int var24 = Math.round((float) (var23 * 127) / 100.0F);
                        client.method4805(var24);
                        break;
                    default:
                        String var22 = String.format("Unkown game option: %s.", var16.toString());
                        throw new RuntimeException(var22);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class84 var3 = class84.field1079;
            class83 var4 = class83.field1063;
            boolean var5 = false;
            if (arg0 == 3214) {
                int var6 = field847[--Statics.field837];
                var3 = (class84) class331.method5118(class84.method1760(), var6);
                if (var3 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                }
            }
            if (arg0 == 3215) {
                int var7 = field847[--Statics.field837];
                var4 = (class83) class331.method5118(class83.method4089(), var7);
                if (var4 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                }
            }
            if (arg0 == 3210) {
                int var8 = field847[--Statics.field837];
                var3 = (class84) class331.method5118(class84.method1760(), var8);
                if (var3 == null) {
                    var4 = (class83) class331.method5118(class83.method4089(), var8);
                    if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var8));
                    }
                }
            } else if (arg0 == 3182) {
                var3 = class84.field1078;
            } else if (arg0 == 3204) {
                var4 = class83.field1070;
            } else if (arg0 == 3206) {
                var4 = class83.field1065;
            } else if (arg0 == 3208) {
                var4 = class83.field1066;
            }
            int var10;
            if (class83.field1063 == var4) {
                switch(var3.field1080) {
                    case 1:
                        var10 = Statics.field1108.method2289() ? 1 : 0;
                        break;
                    case 2:
                        var10 = Statics.field1108.method2285() ? 1 : 0;
                        break;
                    case 3:
                        var10 = Statics.field1108.method2288() ? 1 : 0;
                        break;
                    case 4:
                        var10 = Statics.field1108.method2290();
                        break;
                    case 5:
                        var10 = client.method2627();
                        break;
                    default:
                        String var9 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var9);
                }
            } else {
                switch(var4.field1067) {
                    case 1:
                        var10 = Statics.field1108.method2344() ? 1 : 0;
                        break;
                    case 2:
                        int var14 = Statics.field1108.method2294();
                        var10 = Math.round((float) (var14 * 100) / 255.0F);
                        break;
                    case 3:
                        int var13 = Statics.field1108.method2277();
                        var10 = Math.round((float) (var13 * 100) / 127.0F);
                        break;
                    case 4:
                        int var12 = Statics.field1108.method2366();
                        var10 = Math.round((float) (var12 * 100) / 127.0F);
                        break;
                    default:
                        String var11 = String.format("Unkown game option: %s.", var4.toString());
                        throw new RuntimeException(var11);
                }
            }
            field847[++Statics.field837 - 1] = var10;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.o(ILbt;ZI)I")
    public static int method2585(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field847[++Statics.field837 - 1] = client.field504;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field837 -= 2;
            int var3 = field847[Statics.field837];
            int var4 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = class78.method2995(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field837 -= 2;
            int var5 = field847[Statics.field837];
            int var6 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = class78.method584(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field837 -= 2;
            int var7 = field847[Statics.field837];
            int var8 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = class78.method6203(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class170.method21(var9).field1839;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = client.field637[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = client.field638[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = client.field500[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1013;
            int var14 = (Statics.field890.field1185 >> 7) + Statics.field1560;
            int var15 = (Statics.field890.field1129 >> 7) + Statics.field2784;
            field847[++Statics.field837 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field847[++Statics.field837 - 1] = client.field685 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field837 -= 2;
            int var19 = field847[Statics.field837] + 32768;
            int var20 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = class78.method2995(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field837 -= 2;
            int var21 = field847[Statics.field837] + 32768;
            int var22 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = class78.method584(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field837 -= 2;
            int var23 = field847[Statics.field837] + 32768;
            int var24 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = class78.method6203(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field675 >= 2) {
                field847[++Statics.field837 - 1] = client.field675;
            } else {
                field847[++Statics.field837 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field847[++Statics.field837 - 1] = client.field602;
            return 1;
        } else if (arg0 == 3318) {
            field847[++Statics.field837 - 1] = client.field493;
            return 1;
        } else if (arg0 == 3321) {
            field847[++Statics.field837 - 1] = client.field673;
            return 1;
        } else if (arg0 == 3322) {
            field847[++Statics.field837 - 1] = client.field674;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field677) {
                field847[++Statics.field837 - 1] = 1;
            } else {
                field847[++Statics.field837 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field847[++Statics.field837 - 1] = client.field494;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field837 -= 4;
            int var25 = field847[Statics.field837];
            int var26 = field847[Statics.field837 + 1];
            int var27 = field847[Statics.field837 + 2];
            int var28 = field847[Statics.field837 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field847[++Statics.field837 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field847[++Statics.field837 - 1] = client.field506;
            return 1;
        } else if (arg0 == 3327) {
            field847[++Statics.field837 - 1] = client.field507;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.as(ILbt;ZB)I")
    public static int method209(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field837 -= 2;
            int var3 = field847[Statics.field837];
            int var4 = field847[Statics.field837 + 1];
            class177 var5 = class177.method5178(var3);
            if (var5.field1918 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1912; var6++) {
                if (var5.field1920[var6] == var4) {
                    field842[++Statics.field2020 - 1] = var5.field1916[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field842[++Statics.field2020 - 1] = var5.field1913;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field837 -= 4;
            int var7 = field847[Statics.field837];
            int var8 = field847[Statics.field837 + 1];
            int var9 = field847[Statics.field837 + 2];
            int var10 = field847[Statics.field837 + 3];
            class177 var11 = class177.method5178(var9);
            if (var11.field1911 != var7 || var11.field1918 != var8) {
                if (var8 == 115) {
                    field842[++Statics.field2020 - 1] = class310.field3924;
                } else {
                    field847[++Statics.field837 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1912; var12++) {
                if (var11.field1920[var12] == var10) {
                    if (var8 == 115) {
                        field842[++Statics.field2020 - 1] = var11.field1916[var12];
                    } else {
                        field847[++Statics.field837 - 1] = var11.field1915[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field842[++Statics.field2020 - 1] = var11.field1913;
                } else {
                    field847[++Statics.field837 - 1] = var11.field1914;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field847[--Statics.field837];
            class177 var14 = class177.method5178(var13);
            field847[++Statics.field837 - 1] = var14.method3258();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ea.ac(ILbt;ZI)I")
    public static int method2850(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class24.method5189(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class24.method2682(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class24.method4273(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ku.ao(ILbt;ZB)I")
    public static int method5332(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field3345.field815 == 0) {
                field847[++Statics.field837 - 1] = -2;
            } else if (Statics.field3345.field815 == 1) {
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = Statics.field3345.field813.method6246();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field847[--Statics.field837];
            if (Statics.field3345.method1695() && var3 >= 0 && var3 < Statics.field3345.field813.method6246()) {
                class370 var4 = (class370) Statics.field3345.field813.method6256(var3);
                field842[++Statics.field2020 - 1] = var4.method6231();
                field842[++Statics.field2020 - 1] = var4.method6234();
            } else {
                field842[++Statics.field2020 - 1] = "";
                field842[++Statics.field2020 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field847[--Statics.field837];
            if (Statics.field3345.method1695() && var5 >= 0 && var5 < Statics.field3345.field813.method6246()) {
                field847[++Statics.field837 - 1] = ((class377) Statics.field3345.field813.method6256(var5)).field4366;
            } else {
                field847[++Statics.field837 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field847[--Statics.field837];
            if (Statics.field3345.method1695() && var6 >= 0 && var6 < Statics.field3345.field813.method6246()) {
                field847[++Statics.field837 - 1] = ((class377) Statics.field3345.field813.method6256(var6)).field4368;
            } else {
                field847[++Statics.field837 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field842[--Statics.field2020];
            int var8 = field847[--Statics.field837];
            class62.method2873(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field842[--Statics.field2020];
            Statics.field3345.method1702(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field842[--Statics.field2020];
            Statics.field3345.method1706(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field842[--Statics.field2020];
            Statics.field3345.method1704(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field842[--Statics.field2020];
            Statics.field3345.method1736(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field842[--Statics.field2020];
            String var14 = client.method189(var13);
            field847[++Statics.field837 - 1] = Statics.field3345.method1746(new class466(var14, Statics.field1304), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1679 == null) {
                field842[++Statics.field2020 - 1] = "";
            } else {
                field842[++Statics.field2020 - 1] = Statics.field1679.field4339;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1679 == null) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = Statics.field1679.method6246();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field847[--Statics.field837];
            if (Statics.field1679 == null || var15 >= Statics.field1679.method6246()) {
                field842[++Statics.field2020 - 1] = "";
            } else {
                field842[++Statics.field2020 - 1] = Statics.field1679.method6256(var15).method6224().method7774();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field847[--Statics.field837];
            if (Statics.field1679 == null || var16 >= Statics.field1679.method6246()) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = ((class377) Statics.field1679.method6256(var16)).method6328();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field847[--Statics.field837];
            if (Statics.field1679 == null || var17 >= Statics.field1679.method6246()) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = ((class377) Statics.field1679.method6256(var17)).field4368;
            }
            return 1;
        } else if (arg0 == 3616) {
            field847[++Statics.field837 - 1] = Statics.field1679 == null ? 0 : Statics.field1679.field4337;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field842[--Statics.field2020];
            client.method84(var18);
            return 1;
        } else if (arg0 == 3618) {
            field847[++Statics.field837 - 1] = Statics.field1679 == null ? 0 : Statics.field1679.field4338;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field842[--Statics.field2020];
            client.method5345(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method2965();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field3345.method1695()) {
                field847[++Statics.field837 - 1] = Statics.field3345.field811.method6246();
            } else {
                field847[++Statics.field837 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field847[--Statics.field837];
            if (Statics.field3345.method1695() && var20 >= 0 && var20 < Statics.field3345.field811.method6246()) {
                class376 var21 = (class376) Statics.field3345.field811.method6256(var20);
                field842[++Statics.field2020 - 1] = var21.method6231();
                field842[++Statics.field2020 - 1] = var21.method6234();
            } else {
                field842[++Statics.field2020 - 1] = "";
                field842[++Statics.field2020 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field842[--Statics.field2020];
            String var23 = client.method189(var22);
            field847[++Statics.field837 - 1] = Statics.field3345.method1711(new class466(var23, Statics.field1304)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field847[--Statics.field837];
            if (Statics.field1679 == null || var24 >= Statics.field1679.method6246() || !Statics.field1679.method6256(var24).method6224().equals(Statics.field890.field1109)) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1679 == null || Statics.field1679.field4335 == null) {
                field842[++Statics.field2020 - 1] = "";
            } else {
                field842[++Statics.field2020 - 1] = Statics.field1679.field4335;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field847[--Statics.field837];
            if (Statics.field1679 == null || var25 >= Statics.field1679.method6246() || !((class372) Statics.field1679.method6256(var25)).method6213()) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field847[--Statics.field837];
            if (Statics.field1679 == null || var26 >= Statics.field1679.method6246() || !((class372) Statics.field1679.method6256(var26)).method6208()) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field3345.field813.method6262();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field847[--Statics.field837] == 1;
            Statics.field3345.field813.method6263(new class450(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field847[--Statics.field837] == 1;
            Statics.field3345.field813.method6263(new class451(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field847[--Statics.field837] == 1;
            Statics.field3345.field813.method6263(new class109(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field847[--Statics.field837] == 1;
            Statics.field3345.field813.method6263(new class105(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field847[--Statics.field837] == 1;
            Statics.field3345.field813.method6263(new class108(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field847[--Statics.field837] == 1;
            Statics.field3345.field813.method6263(new class113(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field847[--Statics.field837] == 1;
            Statics.field3345.field813.method6263(new class107(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field847[--Statics.field837] == 1;
            Statics.field3345.field813.method6263(new class106(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field847[--Statics.field837] == 1;
            Statics.field3345.field813.method6263(new class110(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field847[--Statics.field837] == 1;
            Statics.field3345.field813.method6263(new class111(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field3345.field813.method6268();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field3345.field811.method6262();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field847[--Statics.field837] == 1;
            Statics.field3345.field811.method6263(new class450(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field847[--Statics.field837] == 1;
            Statics.field3345.field811.method6263(new class451(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field3345.field811.method6268();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1679 != null) {
                Statics.field1679.method6262();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field847[--Statics.field837] == 1;
            if (Statics.field1679 != null) {
                Statics.field1679.method6263(new class450(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field847[--Statics.field837] == 1;
            if (Statics.field1679 != null) {
                Statics.field1679.method6263(new class451(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field847[--Statics.field837] == 1;
            if (Statics.field1679 != null) {
                Statics.field1679.method6263(new class109(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field847[--Statics.field837] == 1;
            if (Statics.field1679 != null) {
                Statics.field1679.method6263(new class105(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field847[--Statics.field837] == 1;
            if (Statics.field1679 != null) {
                Statics.field1679.method6263(new class108(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field847[--Statics.field837] == 1;
            if (Statics.field1679 != null) {
                Statics.field1679.method6263(new class113(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field847[--Statics.field837] == 1;
            if (Statics.field1679 != null) {
                Statics.field1679.method6263(new class107(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field847[--Statics.field837] == 1;
            if (Statics.field1679 != null) {
                Statics.field1679.method6263(new class106(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field847[--Statics.field837] == 1;
            if (Statics.field1679 != null) {
                Statics.field1679.method6263(new class110(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field847[--Statics.field837] == 1;
            if (Statics.field1679 != null) {
                Statics.field1679.method6263(new class111(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1679 != null) {
                Statics.field1679.method6268();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field847[--Statics.field837] == 1;
            Statics.field3345.field813.method6263(new class112(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field847[--Statics.field837] == 1;
            if (Statics.field1679 != null) {
                Statics.field1679.method6263(new class112(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dq.ar(ILbt;ZB)I")
    public static int method2658(int arg0, class72 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("an.aq(ILbt;ZB)I")
    public static int method597(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field1083 == null) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = 1;
                Statics.field2799 = Statics.field1083;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field847[--Statics.field837];
            if (client.field548[var3] == null) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = 1;
                Statics.field2799 = client.field548[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field842[++Statics.field2020 - 1] = Statics.field2799.field1629;
            return 1;
        } else if (arg0 == 3803) {
            field847[++Statics.field837 - 1] = Statics.field2799.field1638 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field847[++Statics.field837 - 1] = Statics.field2799.field1632;
            return 1;
        } else if (arg0 == 3805) {
            field847[++Statics.field837 - 1] = Statics.field2799.field1633;
            return 1;
        } else if (arg0 == 3806) {
            field847[++Statics.field837 - 1] = Statics.field2799.field1634;
            return 1;
        } else if (arg0 == 3807) {
            field847[++Statics.field837 - 1] = Statics.field2799.field1635;
            return 1;
        } else if (arg0 == 3809) {
            field847[++Statics.field837 - 1] = Statics.field2799.field1636;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field847[--Statics.field837];
            field842[++Statics.field2020 - 1] = Statics.field2799.field1654[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = Statics.field2799.field1653[var5];
            return 1;
        } else if (arg0 == 3812) {
            field847[++Statics.field837 - 1] = Statics.field2799.field1639;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field847[--Statics.field837];
            field842[++Statics.field2020 - 1] = Statics.field2799.field1648[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field837 -= 3;
            int var7 = field847[Statics.field837];
            int var8 = field847[Statics.field837 + 1];
            int var9 = field847[Statics.field837 + 2];
            field847[++Statics.field837 - 1] = Statics.field2799.method2919(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field847[++Statics.field837 - 1] = Statics.field2799.field1624;
            return 1;
        } else if (arg0 == 3816) {
            field847[++Statics.field837 - 1] = Statics.field2799.field1644;
            return 1;
        } else if (arg0 == 3817) {
            field847[++Statics.field837 - 1] = Statics.field2799.method2904(field842[--Statics.field2020]);
            return 1;
        } else if (arg0 == 3818) {
            field847[Statics.field837 - 1] = Statics.field2799.method2901()[field847[Statics.field837 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field837 -= 2;
            int var10 = field847[Statics.field837];
            int var11 = field847[Statics.field837 + 1];
            client.method297(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = Statics.field2799.field1641[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field837 -= 3;
                int var13 = field847[Statics.field837];
                boolean var14 = field847[Statics.field837 + 1] == 1;
                int var15 = field847[Statics.field837 + 2];
                client.method4266(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field847[--Statics.field837];
                field847[++Statics.field837 - 1] = Statics.field2799.field1643[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field3287 == null) {
                    field847[++Statics.field837 - 1] = 0;
                } else {
                    field847[++Statics.field837 - 1] = 1;
                    Statics.field4427 = Statics.field3287;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field847[--Statics.field837];
                if (client.field769[var17] == null) {
                    field847[++Statics.field837 - 1] = 0;
                } else {
                    field847[++Statics.field837 - 1] = 1;
                    Statics.field4427 = client.field769[var17];
                    Statics.field4355 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field842[++Statics.field2020 - 1] = Statics.field4427.field1706;
                return 1;
            } else if (arg0 == 3853) {
                field847[++Statics.field837 - 1] = Statics.field4427.field1710;
                return 1;
            } else if (arg0 == 3854) {
                field847[++Statics.field837 - 1] = Statics.field4427.field1712;
                return 1;
            } else if (arg0 == 3855) {
                field847[++Statics.field837 - 1] = Statics.field4427.method2969();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field847[--Statics.field837];
                field842[++Statics.field2020 - 1] = ((class132) Statics.field4427.field1704.get(var18)).field1572.method7774();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field847[--Statics.field837];
                field847[++Statics.field837 - 1] = ((class132) Statics.field4427.field1704.get(var19)).field1575;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field847[--Statics.field837];
                field847[++Statics.field837 - 1] = ((class132) Statics.field4427.field1704.get(var20)).field1571;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field847[--Statics.field837];
                Statics.method4615(Statics.field4355, var21);
                return 1;
            } else if (arg0 == 3860) {
                field847[++Statics.field837 - 1] = Statics.field4427.method2970(field842[--Statics.field2020]);
                return 1;
            } else if (arg0 == 3861) {
                field847[Statics.field837 - 1] = Statics.field4427.method2966()[field847[Statics.field837 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field847[++Statics.field837 - 1] = Statics.field183 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("mq.ai(ILbt;ZB)I")
    public static int method6117(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = client.field778[var3].method5575();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = client.field778[var4].field4108;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = client.field778[var5].field4110;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = client.field778[var6].field4111;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = client.field778[var7].field4112;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = client.field778[var8].field4113;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field847[--Statics.field837];
            int var10 = client.field778[var9].method5574();
            field847[++Statics.field837 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field847[--Statics.field837];
            int var12 = client.field778[var11].method5574();
            field847[++Statics.field837 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field847[--Statics.field837];
            int var14 = client.field778[var13].method5574();
            field847[++Statics.field837 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field847[--Statics.field837];
            int var16 = client.field778[var15].method5574();
            field847[++Statics.field837 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field847[--Statics.field837] == 1;
            if (Statics.field1919 != null) {
                Statics.field1919.method5525(class319.field4082, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field847[--Statics.field837] == 1;
            if (Statics.field1919 != null) {
                Statics.field1919.method5525(class319.field4081, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field837 -= 2;
            boolean var19 = field847[Statics.field837] == 1;
            boolean var20 = field847[Statics.field837 + 1] == 1;
            if (Statics.field1919 != null) {
                client.field496.field486 = var20;
                Statics.field1919.method5525(client.field496, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field847[--Statics.field837] == 1;
            if (Statics.field1919 != null) {
                Statics.field1919.method5525(class319.field4083, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field847[--Statics.field837] == 1;
            if (Statics.field1919 != null) {
                Statics.field1919.method5525(class319.field4080, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field847[++Statics.field837 - 1] = Statics.field1919 == null ? 0 : Statics.field1919.field4079.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field847[--Statics.field837];
            class325 var24 = (class325) Statics.field1919.field4079.get(var23);
            field847[++Statics.field837 - 1] = var24.field4100;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field847[--Statics.field837];
            class325 var26 = (class325) Statics.field1919.field4079.get(var25);
            field842[++Statics.field2020 - 1] = var26.method5566();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field847[--Statics.field837];
            class325 var28 = (class325) Statics.field1919.field4079.get(var27);
            field842[++Statics.field2020 - 1] = var28.method5565();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field847[--Statics.field837];
            class325 var30 = (class325) Statics.field1919.field4079.get(var29);
            long var31 = class271.method5624() - Statics.field2650 - var30.field4105;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field842[++Statics.field2020 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field847[--Statics.field837];
            class325 var38 = (class325) Statics.field1919.field4079.get(var37);
            field847[++Statics.field837 - 1] = var38.field4104.field4111;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field847[--Statics.field837];
            class325 var40 = (class325) Statics.field1919.field4079.get(var39);
            field847[++Statics.field837 - 1] = var40.field4104.field4110;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field847[--Statics.field837];
            class325 var42 = (class325) Statics.field1919.field4079.get(var41);
            field847[++Statics.field837 - 1] = var42.field4104.field4108;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ds.an(ILbt;ZI)I")
    public static int method2847(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field837 -= 2;
            int var3 = field847[Statics.field837];
            int var4 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field837 -= 2;
            int var5 = field847[Statics.field837];
            int var6 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field837 -= 2;
            int var7 = field847[Statics.field837];
            int var8 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field837 -= 2;
            int var9 = field847[Statics.field837];
            int var10 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field837 -= 5;
            int var13 = field847[Statics.field837];
            int var14 = field847[Statics.field837 + 1];
            int var15 = field847[Statics.field837 + 2];
            int var16 = field847[Statics.field837 + 3];
            int var17 = field847[Statics.field837 + 4];
            field847[++Statics.field837 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field837 -= 2;
            int var18 = field847[Statics.field837];
            int var19 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field837 -= 2;
            int var20 = field847[Statics.field837];
            int var21 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field837 -= 2;
            int var22 = field847[Statics.field837];
            int var23 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field837 -= 2;
            int var24 = field847[Statics.field837];
            int var25 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field837 -= 2;
            int var26 = field847[Statics.field837];
            int var27 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field837 -= 2;
            int var28 = field847[Statics.field837];
            int var29 = field847[Statics.field837 + 1];
            if (var28 == 0) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field837 -= 2;
            int var30 = field847[Statics.field837];
            int var31 = field847[Statics.field837 + 1];
            if (var30 == 0) {
                field847[++Statics.field837 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field847[++Statics.field837 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field847[++Statics.field837 - 1] = var30;
                    break;
                case 2:
                    field847[++Statics.field837 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field847[++Statics.field837 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field847[++Statics.field837 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field847[++Statics.field837 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field837 -= 2;
            int var32 = field847[Statics.field837];
            int var33 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field837 -= 2;
            int var34 = field847[Statics.field837];
            int var35 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field837 -= 3;
            long var36 = (long) field847[Statics.field837];
            long var38 = (long) field847[Statics.field837 + 1];
            long var40 = (long) field847[Statics.field837 + 2];
            field847[++Statics.field837 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class273.method3658(field847[--Statics.field837]);
            field847[++Statics.field837 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field837 -= 2;
            int var43 = field847[Statics.field837];
            int var44 = field847[Statics.field837 + 1];
            field847[++Statics.field837 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field837 -= 3;
            int var45 = field847[Statics.field837];
            int var46 = field847[Statics.field837 + 1];
            int var47 = field847[Statics.field837 + 2];
            field847[++Statics.field837 - 1] = class273.method3227(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field837 -= 3;
            int var48 = field847[Statics.field837];
            int var49 = field847[Statics.field837 + 1];
            int var50 = field847[Statics.field837 + 2];
            field847[++Statics.field837 - 1] = class273.method4650(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field837 -= 3;
            int var51 = field847[Statics.field837];
            int var52 = field847[Statics.field837 + 1];
            int var53 = field847[Statics.field837 + 2];
            int var54 = 31 - var53;
            field847[++Statics.field837 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field837 -= 4;
            int var55 = field847[Statics.field837];
            int var56 = field847[Statics.field837 + 1];
            int var57 = field847[Statics.field837 + 2];
            int var58 = field847[Statics.field837 + 3];
            int var59 = class273.method4650(var55, var57, var58);
            int var60 = class273.method2113(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field847[++Statics.field837 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field847[Statics.field837 - 1] = class404.method3342(field847[Statics.field837 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field847[Statics.field837 - 1] = class404.method6413(field847[Statics.field837 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field837 -= 2;
            int var61 = field847[Statics.field837];
            int var62 = field847[Statics.field837 + 1];
            int var63 = class404.method6170(var61, var62);
            field847[++Statics.field837 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field847[Statics.field837 - 1] = Math.abs(field847[Statics.field837 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eh.aa(ILbt;ZI)I")
    public static int method3017(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field842[--Statics.field2020];
            int var4 = field847[--Statics.field837];
            field842[++Statics.field2020 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field2020 -= 2;
            String var5 = field842[Statics.field2020];
            String var6 = field842[Statics.field2020 + 1];
            field842[++Statics.field2020 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field842[--Statics.field2020];
            int var8 = field847[--Statics.field837];
            field842[++Statics.field2020 - 1] = var7 + class345.method5896(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field842[--Statics.field2020];
            field842[++Statics.field2020 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field847[--Statics.field837];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field845.setTime(new Date(var11));
            int var13 = field845.get(5);
            int var14 = field845.get(2);
            int var15 = field845.get(1);
            field842[++Statics.field2020 - 1] = var13 + "-" + field846[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field2020 -= 2;
            String var16 = field842[Statics.field2020];
            String var17 = field842[Statics.field2020 + 1];
            if (Statics.field890.field1086 != null && Statics.field890.field1086.field3362) {
                field842[++Statics.field2020 - 1] = var17;
            } else {
                field842[++Statics.field2020 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field847[--Statics.field837];
            field842[++Statics.field2020 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field2020 -= 2;
            field847[++Statics.field837 - 1] = class345.method5544(class346.method2447(field842[Statics.field2020], field842[Statics.field2020 + 1], Statics.field3203));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field842[--Statics.field2020];
            Statics.field837 -= 2;
            int var20 = field847[Statics.field837];
            int var21 = field847[Statics.field837 + 1];
            byte[] var22 = Statics.field4356.method5499(var21, 0);
            class351 var23 = new class351(var22);
            field847[++Statics.field837 - 1] = var23.method5950(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field842[--Statics.field2020];
            Statics.field837 -= 2;
            int var25 = field847[Statics.field837];
            int var26 = field847[Statics.field837 + 1];
            byte[] var27 = Statics.field4356.method5499(var26, 0);
            class351 var28 = new class351(var27);
            field847[++Statics.field837 - 1] = var28.method5965(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field2020 -= 2;
            String var29 = field842[Statics.field2020];
            String var30 = field842[Statics.field2020 + 1];
            if (field847[--Statics.field837] == 1) {
                field842[++Statics.field2020 - 1] = var29;
            } else {
                field842[++Statics.field2020 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field842[--Statics.field2020];
            field842[++Statics.field2020 - 1] = class352.method5951(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field842[--Statics.field2020];
            int var33 = field847[--Statics.field837];
            field842[++Statics.field2020 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class345.method5526((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class345.method3148((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class345.method4606((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class345.method4651((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field842[--Statics.field2020];
            if (var38 == null) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field842[--Statics.field2020];
            Statics.field837 -= 2;
            int var40 = field847[Statics.field837];
            int var41 = field847[Statics.field837 + 1];
            field842[++Statics.field2020 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field842[--Statics.field2020];
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
            field842[++Statics.field2020 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field842[--Statics.field2020];
            int var48 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field2020 -= 2;
            String var49 = field842[Statics.field2020];
            String var50 = field842[Statics.field2020 + 1];
            int var51 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field842[--Statics.field2020];
            field842[++Statics.field2020 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gc.ak(ILbt;ZI)I")
    public static int method3667(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field847[--Statics.field837];
            field842[++Statics.field2020 - 1] = class189.method2643(var3).field2139;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field837 -= 2;
            int var4 = field847[Statics.field837];
            int var5 = field847[Statics.field837 + 1];
            class189 var6 = class189.method2643(var4);
            if (var5 < 1 || var5 > 5 || var6.field2147[var5 - 1] == null) {
                field842[++Statics.field2020 - 1] = "";
            } else {
                field842[++Statics.field2020 - 1] = var6.field2147[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field837 -= 2;
            int var7 = field847[Statics.field837];
            int var8 = field847[Statics.field837 + 1];
            class189 var9 = class189.method2643(var7);
            if (var8 < 1 || var8 > 5 || var9.field2170[var8 - 1] == null) {
                field842[++Statics.field2020 - 1] = "";
            } else {
                field842[++Statics.field2020 - 1] = var9.field2170[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class189.method2643(var10).field2145;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class189.method2643(var11).field2133 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field847[--Statics.field837];
            class189 var13 = class189.method2643(var12);
            if (var13.field2166 == -1 && var13.field2165 >= 0) {
                field847[++Statics.field837 - 1] = var13.field2165;
            } else {
                field847[++Statics.field837 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field847[--Statics.field837];
            class189 var15 = class189.method2643(var14);
            if (var15.field2166 >= 0 && var15.field2165 >= 0) {
                field847[++Statics.field837 - 1] = var15.field2165;
            } else {
                field847[++Statics.field837 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class189.method2643(var16).field2146 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field847[--Statics.field837];
            class189 var18 = class189.method2643(var17);
            if (var18.field2178 == -1 && var18.field2177 >= 0) {
                field847[++Statics.field837 - 1] = var18.field2177;
            } else {
                field847[++Statics.field837 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field847[--Statics.field837];
            class189 var20 = class189.method2643(var19);
            if (var20.field2178 >= 0 && var20.field2177 >= 0) {
                field847[++Statics.field837 - 1] = var20.field2177;
            } else {
                field847[++Statics.field837 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field842[--Statics.field2020];
            int var22 = field847[--Statics.field837];
            client.method5337(var21, var22 == 1);
            field847[++Statics.field837 - 1] = Statics.field1372;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field3325 == null || Statics.field219 >= Statics.field1372) {
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = Statics.field3325[++Statics.field219 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field219 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field847[--Statics.field837];
            int var24 = class189.method2643(var23).method3516();
            if (var24 == -1) {
                field847[++Statics.field837 - 1] = var24;
            } else {
                field847[++Statics.field837 - 1] = var24 + 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jy.am(ILbt;ZB)I")
    public static int method4835(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field847[++Statics.field837 - 1] = client.field698;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field837 -= 3;
            client.field698 = field847[Statics.field837];
            Statics.field1663 = class462.method2051(field847[Statics.field837 + 1]);
            if (Statics.field1663 == null) {
                Statics.field1663 = class462.field4852;
            }
            client.field644 = field847[Statics.field837 + 2];
            class266 var3 = Statics.method2786(class264.field3001, client.field552.field1342);
            var3.field3064.method7179(client.field698);
            var3.field3064.method7179(Statics.field1663.field4854);
            var3.field3064.method7179(client.field644);
            client.field552.method2534(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field842[--Statics.field2020];
            Statics.field837 -= 2;
            int var5 = field847[Statics.field837];
            int var6 = field847[Statics.field837 + 1];
            class266 var7 = Statics.method2786(class264.field2991, client.field552.field1342);
            var7.field3064.method7179(class445.method6110(var4) + 2);
            var7.field3064.method7186(var4);
            var7.field3064.method7179(var5 - 1);
            var7.field3064.method7179(var6);
            client.field552.method2534(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field837 -= 2;
            int var8 = field847[Statics.field837];
            int var9 = field847[Statics.field837 + 1];
            class58 var10 = class100.method15(var8, var9);
            if (var10 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
                field842[++Statics.field2020 - 1] = "";
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = var10.field470;
                field847[++Statics.field837 - 1] = var10.field471;
                field842[++Statics.field2020 - 1] = var10.field473 == null ? "" : var10.field473;
                field842[++Statics.field2020 - 1] = var10.field477 == null ? "" : var10.field477;
                field842[++Statics.field2020 - 1] = var10.field478 == null ? "" : var10.field478;
                field847[++Statics.field837 - 1] = var10.method1072() ? 1 : (var10.method1099() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field847[--Statics.field837];
            class58 var12 = class100.method2141(var11);
            if (var12 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
                field842[++Statics.field2020 - 1] = "";
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = var12.field475;
                field847[++Statics.field837 - 1] = var12.field471;
                field842[++Statics.field2020 - 1] = var12.field473 == null ? "" : var12.field473;
                field842[++Statics.field2020 - 1] = var12.field477 == null ? "" : var12.field477;
                field842[++Statics.field2020 - 1] = var12.field478 == null ? "" : var12.field478;
                field847[++Statics.field837 - 1] = var12.method1072() ? 1 : (var12.method1099() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1663 == null) {
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = Statics.field1663.field4854;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field842[--Statics.field2020];
            int var14 = field847[--Statics.field837];
            class266 var15 = class467.method4271(var14, var13, Statics.field3203, -1);
            client.field552.method2534(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field2020 -= 2;
            String var16 = field842[Statics.field2020];
            String var17 = field842[Statics.field2020 + 1];
            class266 var18 = Statics.method2786(class264.field2979, client.field552.field1342);
            var18.field3064.method7286(0);
            int var19 = var18.field3064.field4735;
            var18.field3064.method7186(var16);
            class284.method2158(var18.field3064, var17);
            var18.field3064.method7194(var18.field3064.field4735 - var19);
            client.field552.method2534(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field842[--Statics.field2020];
            Statics.field837 -= 2;
            int var21 = field847[Statics.field837];
            int var22 = field847[Statics.field837 + 1];
            class266 var23 = class467.method4271(var21, var20, Statics.field3203, var22);
            client.field552.method2534(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field890 == null || Statics.field890.field1109 == null) {
                var24 = "";
            } else {
                var24 = Statics.field890.field1109.method7774();
            }
            field842[++Statics.field2020 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field847[++Statics.field837 - 1] = client.field644;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = Statics.method5897(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class100.method6111(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = class100.method5120(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field842[--Statics.field2020];
            client.method12(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field753 = field842[--Statics.field2020].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field842[++Statics.field2020 - 1] = client.field753;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field842[--Statics.field2020];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field837 -= 2;
            int var30 = field847[Statics.field837];
            int var31 = field847[Statics.field837 + 1];
            class58 var32 = class100.method15(var30, var31);
            if (var32 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
                field842[++Statics.field2020 - 1] = "";
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = var32.field470;
                field847[++Statics.field837 - 1] = var32.field471;
                field842[++Statics.field2020 - 1] = var32.field473 == null ? "" : var32.field473;
                field842[++Statics.field2020 - 1] = var32.field477 == null ? "" : var32.field477;
                field842[++Statics.field2020 - 1] = var32.field478 == null ? "" : var32.field478;
                field847[++Statics.field837 - 1] = var32.method1072() ? 1 : (var32.method1099() ? 2 : 0);
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field847[--Statics.field837];
            class58 var34 = class100.method2141(var33);
            if (var34 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
                field842[++Statics.field2020 - 1] = "";
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = var34.field475;
                field847[++Statics.field837 - 1] = var34.field471;
                field842[++Statics.field2020 - 1] = var34.field473 == null ? "" : var34.field473;
                field842[++Statics.field2020 - 1] = var34.field477 == null ? "" : var34.field477;
                field842[++Statics.field2020 - 1] = var34.field478 == null ? "" : var34.field478;
                field847[++Statics.field837 - 1] = var34.method1072() ? 1 : (var34.method1099() ? 2 : 0);
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cv.ap(ILbt;ZS)I")
    public static int method2144(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field847[++Statics.field837 - 1] = client.method4268();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field847[--Statics.field837];
            if (var3 == 1 || var3 == 2) {
                client.method4272(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field847[++Statics.field837 - 1] = Statics.field1108.method2303();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field847[--Statics.field837];
            if (var4 == 1 || var4 == 2) {
                Statics.field1108.method2302(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field837--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hq.ab(ILbt;ZI)I")
    public static int method4309(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field837 -= 2;
            int var3 = field847[Statics.field837];
            int var4 = field847[Statics.field837 + 1];
            if (!client.field754) {
                client.field573 = var3;
                client.field574 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field847[++Statics.field837 - 1] = client.field573;
            return 1;
        } else if (arg0 == 5506) {
            field847[++Statics.field837 - 1] = client.field574;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field847[--Statics.field837];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field580 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field847[++Statics.field837 - 1] = client.field580;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hh.az(ILbt;ZI)I")
    public static int method4599(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field553 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cp.ad(II)I")
    public static int method2445(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("dm.af(II)I")
    public static int method2842(int arg0) {
        return (int) ((Math.log((double) arg0) / field851 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("ao.aj(ILbt;ZI)I")
    public static int method408(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field837 -= 2;
            client.field761 = (short) method2445(field847[Statics.field837]);
            if (client.field761 <= 0) {
                client.field761 = 256;
            }
            client.field763 = (short) method2445(field847[Statics.field837 + 1]);
            if (client.field763 <= 0) {
                client.field763 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field837 -= 2;
            client.field649 = (short) field847[Statics.field837];
            if (client.field649 <= 0) {
                client.field649 = 256;
            }
            client.field595 = (short) field847[Statics.field837 + 1];
            if (client.field595 <= 0) {
                client.field595 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field837 -= 4;
            client.field765 = (short) field847[Statics.field837];
            if (client.field765 <= 0) {
                client.field765 = 1;
            }
            client.field757 = (short) field847[Statics.field837 + 1];
            if (client.field757 <= 0) {
                client.field757 = 32767;
            } else if (client.field757 < client.field765) {
                client.field757 = client.field765;
            }
            client.field538 = (short) field847[Statics.field837 + 2];
            if (client.field538 <= 0) {
                client.field538 = 1;
            }
            client.field639 = (short) field847[Statics.field837 + 3];
            if (client.field639 <= 0) {
                client.field639 = 32767;
            } else if (client.field639 < client.field538) {
                client.field639 = client.field538;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field740 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = -1;
            } else {
                client.method5888(0, 0, client.field740.field3410, client.field740.field3411, false);
                field847[++Statics.field837 - 1] = client.field771;
                field847[++Statics.field837 - 1] = client.field772;
            }
            return 1;
        } else if (arg0 == 6204) {
            field847[++Statics.field837 - 1] = client.field649;
            field847[++Statics.field837 - 1] = client.field595;
            return 1;
        } else if (arg0 == 6205) {
            field847[++Statics.field837 - 1] = method2842(client.field761);
            field847[++Statics.field837 - 1] = method2842(client.field763);
            return 1;
        } else if (arg0 == 6220) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field847[++Statics.field837 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field847[++Statics.field837 - 1] = Statics.field1514;
            return 1;
        } else if (arg0 == 6223) {
            field847[++Statics.field837 - 1] = Statics.field1825;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jp.ax(ILbt;ZI)I")
    public static int method4800(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field847[++Statics.field837 - 1] = class61.method2651() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class61 var3 = class61.method2962();
            if (var3 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
            } else {
                field847[++Statics.field837 - 1] = var3.field794;
                field847[++Statics.field837 - 1] = var3.field801;
                field842[++Statics.field2020 - 1] = var3.field792;
                field847[++Statics.field837 - 1] = var3.field805;
                field847[++Statics.field837 - 1] = var3.field802;
                field842[++Statics.field2020 - 1] = var3.field803;
            }
            return 1;
        } else if (arg0 == 6502) {
            class61 var4 = class61.method5520();
            if (var4 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
            } else {
                field847[++Statics.field837 - 1] = var4.field794;
                field847[++Statics.field837 - 1] = var4.field801;
                field842[++Statics.field2020 - 1] = var4.field792;
                field847[++Statics.field837 - 1] = var4.field805;
                field847[++Statics.field837 - 1] = var4.field802;
                field842[++Statics.field2020 - 1] = var4.field803;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field847[--Statics.field837];
            class61 var6 = null;
            for (int var7 = 0; var7 < class61.field796; var7++) {
                if (Statics.field795[var7].field794 == var5) {
                    var6 = Statics.field795[var7];
                    break;
                }
            }
            if (var6 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
            } else {
                field847[++Statics.field837 - 1] = var6.field794;
                field847[++Statics.field837 - 1] = var6.field801;
                field842[++Statics.field2020 - 1] = var6.field792;
                field847[++Statics.field837 - 1] = var6.field805;
                field847[++Statics.field837 - 1] = var6.field802;
                field842[++Statics.field2020 - 1] = var6.field803;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field837 -= 4;
            int var8 = field847[Statics.field837];
            boolean var9 = field847[Statics.field837 + 1] == 1;
            int var10 = field847[Statics.field837 + 2];
            boolean var11 = field847[Statics.field837 + 3] == 1;
            class61.method2947(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field847[--Statics.field837];
            if (var12 >= 0 && var12 < class61.field796) {
                class61 var13 = Statics.field795[var12];
                field847[++Statics.field837 - 1] = var13.field794;
                field847[++Statics.field837 - 1] = var13.field801;
                field842[++Statics.field2020 - 1] = var13.field792;
                field847[++Statics.field837 - 1] = var13.field805;
                field847[++Statics.field837 - 1] = var13.field802;
                field842[++Statics.field2020 - 1] = var13.field803;
            } else {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
                field847[++Statics.field837 - 1] = 0;
                field847[++Statics.field837 - 1] = 0;
                field842[++Statics.field2020 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field651 = field847[--Statics.field837] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field837 -= 2;
            int var14 = field847[Statics.field837];
            int var15 = field847[Statics.field837 + 1];
            class185 var16 = class185.method2006(var15);
            if (var16.method3343()) {
                field842[++Statics.field2020 - 1] = class179.method3662(var14).method3278(var15, var16.field2030);
            } else {
                field847[++Statics.field837 - 1] = class179.method3662(var14).method3286(var15, var16.field2032);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field837 -= 2;
            int var17 = field847[Statics.field837];
            int var18 = field847[Statics.field837 + 1];
            class185 var19 = class185.method2006(var18);
            if (var19.method3343()) {
                field842[++Statics.field2020 - 1] = Statics.method5147(var17).method3426(var18, var19.field2030);
            } else {
                field847[++Statics.field837 - 1] = Statics.method5147(var17).method3453(var18, var19.field2032);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field837 -= 2;
            int var20 = field847[Statics.field837];
            int var21 = field847[Statics.field837 + 1];
            class185 var22 = class185.method2006(var21);
            if (var22.method3343()) {
                field842[++Statics.field2020 - 1] = class189.method2643(var20).method3506(var21, var22.field2030);
            } else {
                field847[++Statics.field837 - 1] = class189.method2643(var20).method3474(var21, var22.field2032);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field837 -= 2;
            int var23 = field847[Statics.field837];
            int var24 = field847[Statics.field837 + 1];
            class185 var25 = class185.method2006(var24);
            if (var25.method3343()) {
                field842[++Statics.field2020 - 1] = class186.method3334(var23).method3366(var24, var25.field2030);
            } else {
                field847[++Statics.field837 - 1] = class186.method3334(var23).method3374(var24, var25.field2032);
            }
            return 1;
        } else if (arg0 == 6518) {
            field847[++Statics.field837 - 1] = client.field501 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field847[++Statics.field837 - 1] = client.field693;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field2020--;
            Statics.field837--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field2020--;
            Statics.field837--;
            return 1;
        } else if (arg0 == 6524) {
            field847[++Statics.field837 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field847[++Statics.field837 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field847[++Statics.field837 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field847[++Statics.field837 - 1] = client.field572;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ee.av(ILbt;ZB)I")
    public static int method2848(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1013;
            int var4 = (Statics.field890.field1185 >> 7) + Statics.field1560;
            int var5 = (Statics.field890.field1129 >> 7) + Statics.field2784;
            client.method2659().method6819(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field847[--Statics.field837];
            String var7 = "";
            class226 var8 = client.method2659().method6728(var6);
            if (var8 != null) {
                var7 = var8.method4348();
            }
            field842[++Statics.field2020 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field847[--Statics.field837];
            client.method2659().method6711(var9);
            return 1;
        } else if (arg0 == 6603) {
            field847[++Statics.field837 - 1] = client.method2659().method6895();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field847[--Statics.field837];
            client.method2659().method6722(var10);
            return 1;
        } else if (arg0 == 6605) {
            field847[++Statics.field837 - 1] = client.method2659().method6888() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class291 var11 = new class291(field847[--Statics.field837]);
            client.method2659().method6699(var11.field3349, var11.field3350);
            return 1;
        } else if (arg0 == 6607) {
            class291 var12 = new class291(field847[--Statics.field837]);
            client.method2659().method6734(var12.field3349, var12.field3350);
            return 1;
        } else if (arg0 == 6608) {
            class291 var13 = new class291(field847[--Statics.field837]);
            client.method2659().method6731(var13.field3351, var13.field3349, var13.field3350);
            return 1;
        } else if (arg0 == 6609) {
            class291 var14 = new class291(field847[--Statics.field837]);
            client.method2659().method6732(var14.field3351, var14.field3349, var14.field3350);
            return 1;
        } else if (arg0 == 6610) {
            field847[++Statics.field837 - 1] = client.method2659().method6825();
            field847[++Statics.field837 - 1] = client.method2659().method6862();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field847[--Statics.field837];
            class226 var16 = client.method2659().method6728(var15);
            if (var16 == null) {
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = var16.method4358().method5123();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field847[--Statics.field837];
            class226 var18 = client.method2659().method6728(var17);
            if (var18 == null) {
                field847[++Statics.field837 - 1] = 0;
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = (var18.method4352() - var18.method4351() + 1) * 64;
                field847[++Statics.field837 - 1] = (var18.method4412() - var18.method4353() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field847[--Statics.field837];
            class226 var20 = client.method2659().method6728(var19);
            if (var20 == null) {
                field847[++Statics.field837 - 1] = 0;
                field847[++Statics.field837 - 1] = 0;
                field847[++Statics.field837 - 1] = 0;
                field847[++Statics.field837 - 1] = 0;
            } else {
                field847[++Statics.field837 - 1] = var20.method4351() * 64;
                field847[++Statics.field837 - 1] = var20.method4353() * 64;
                field847[++Statics.field837 - 1] = var20.method4352() * 64 + 64 - 1;
                field847[++Statics.field837 - 1] = var20.method4412() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field847[--Statics.field837];
            class226 var22 = client.method2659().method6728(var21);
            if (var22 == null) {
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = var22.method4350();
            }
            return 1;
        } else if (arg0 == 6615) {
            class291 var23 = client.method2659().method6735();
            if (var23 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = var23.field3349;
                field847[++Statics.field837 - 1] = var23.field3350;
            }
            return 1;
        } else if (arg0 == 6616) {
            field847[++Statics.field837 - 1] = client.method2659().method6723();
            return 1;
        } else if (arg0 == 6617) {
            class291 var24 = new class291(field847[--Statics.field837]);
            class226 var25 = client.method2659().method6842();
            if (var25 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4414(var24.field3351, var24.field3349, var24.field3350);
            if (var26 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = var26[0];
                field847[++Statics.field837 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class291 var27 = new class291(field847[--Statics.field837]);
            class226 var28 = client.method2659().method6842();
            if (var28 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = -1;
                return 1;
            }
            class291 var29 = var28.method4337(var27.field3349, var27.field3350);
            if (var29 == null) {
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = var29.method5123();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field837 -= 2;
            int var30 = field847[Statics.field837];
            class291 var31 = new class291(field847[Statics.field837 + 1]);
            method3864(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field837 -= 2;
            int var32 = field847[Statics.field837];
            class291 var33 = new class291(field847[Statics.field837 + 1]);
            method3864(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field837 -= 2;
            int var34 = field847[Statics.field837];
            class291 var35 = new class291(field847[Statics.field837 + 1]);
            class226 var36 = client.method2659().method6728(var34);
            if (var36 == null) {
                field847[++Statics.field837 - 1] = 0;
                return 1;
            } else {
                field847[++Statics.field837 - 1] = var36.method4340(var35.field3351, var35.field3349, var35.field3350) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field847[++Statics.field837 - 1] = client.method2659().method6736();
            field847[++Statics.field837 - 1] = client.method2659().method6833();
            return 1;
        } else if (arg0 == 6623) {
            class291 var37 = new class291(field847[--Statics.field837]);
            class226 var38 = client.method2659().method6859(var37.field3351, var37.field3349, var37.field3350);
            if (var38 == null) {
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = var38.method4345();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method2659().method6712(field847[--Statics.field837]);
            return 1;
        } else if (arg0 == 6625) {
            client.method2659().method6791();
            return 1;
        } else if (arg0 == 6626) {
            client.method2659().method6740(field847[--Statics.field837]);
            return 1;
        } else if (arg0 == 6627) {
            client.method2659().method6823();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field847[--Statics.field837] == 1;
            client.method2659().method6742(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field847[--Statics.field837];
            client.method2659().method6743(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field847[--Statics.field837];
            client.method2659().method6739(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method2659().method6745();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field847[--Statics.field837] == 1;
            client.method2659().method6746(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field837 -= 2;
            int var43 = field847[Statics.field837];
            boolean var44 = field847[Statics.field837 + 1] == 1;
            client.method2659().method6855(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field837 -= 2;
            int var45 = field847[Statics.field837];
            boolean var46 = field847[Statics.field837 + 1] == 1;
            client.method2659().method6748(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field847[++Statics.field837 - 1] = client.method2659().method6749() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = client.method2659().method6750(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field847[--Statics.field837];
            field847[++Statics.field837 - 1] = client.method2659().method6751(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field837 -= 2;
            int var49 = field847[Statics.field837];
            class291 var50 = new class291(field847[Statics.field837 + 1]);
            class291 var51 = client.method2659().method6754(var49, var50);
            if (var51 == null) {
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = var51.method5123();
            }
            return 1;
        } else if (arg0 == 6639) {
            class244 var52 = client.method2659().method6821();
            if (var52 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = var52.method4295();
                field847[++Statics.field837 - 1] = var52.field2888.method5123();
            }
            return 1;
        } else if (arg0 == 6640) {
            class244 var53 = client.method2659().method6757();
            if (var53 == null) {
                field847[++Statics.field837 - 1] = -1;
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = var53.method4295();
                field847[++Statics.field837 - 1] = var53.field2888.method5123();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field847[--Statics.field837];
            class172 var55 = class172.method2879(var54);
            if (var55.field1861 == null) {
                field842[++Statics.field2020 - 1] = "";
            } else {
                field842[++Statics.field2020 - 1] = var55.field1861;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field847[--Statics.field837];
            class172 var57 = class172.method2879(var56);
            field847[++Statics.field837 - 1] = var57.field1855;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field847[--Statics.field837];
            class172 var59 = class172.method2879(var58);
            if (var59 == null) {
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = var59.field1847;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field847[--Statics.field837];
            class172 var61 = class172.method2879(var60);
            if (var61 == null) {
                field847[++Statics.field837 - 1] = -1;
            } else {
                field847[++Statics.field837 - 1] = var61.field1851;
            }
            return 1;
        } else if (arg0 == 6697) {
            field847[++Statics.field837 - 1] = Statics.field4696.field2913;
            return 1;
        } else if (arg0 == 6698) {
            field847[++Statics.field837 - 1] = Statics.field4696.field2911.method5123();
            return 1;
        } else if (arg0 == 6699) {
            field847[++Statics.field837 - 1] = Statics.field4696.field2910.method5123();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.ae(ILbt;ZI)I")
    public static int method174(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field847[--Statics.field837];
            class179 var4 = class179.method3662(var3);
            field842[++Statics.field2020 - 1] = var4 == null ? "" : var4.field1934;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ps.ay(ILbt;ZI)I")
    public static int method7071(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field847[--Statics.field837];
            class188 var4 = Statics.method5147(var3);
            field842[++Statics.field2020 - 1] = var4 == null ? "" : var4.field2074;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cy.ag(ILbt;ZS)I")
    public static int method2140(int arg0, class72 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("gn.aw(ILbt;ZI)I")
    public static int method3666(int arg0, class72 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("kj.ah(ILbt;ZB)I")
    public static int method5352(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field847[++Statics.field837 - 1] = client.method5303() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ba.at(ILbt;ZI)I")
    public static int method2011(int arg0, class72 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("bq.al(ILbt;ZI)I")
    public static int method2111(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field847[--Statics.field837] == 1;
            client.method158(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dv.au(ILbt;ZB)I")
    public static int method2781(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field847[--Statics.field837];
            Object var45 = method178(var44);
            int var46 = field847[--Statics.field837];
            class439 var47 = client.method3166(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class441.method4088(var46);
            Statics.field1785 = var47.method7097(var45, var48);
            if (Statics.field1785 == null) {
                client.field619 = -1;
                Statics.field101 = null;
                if (arg0 == 7500) {
                    field847[++Statics.field837 - 1] = 0;
                }
            } else {
                client.field619 = class441.method6969(var46);
                Statics.field101 = Statics.field1785.iterator();
                if (arg0 == 7500) {
                    field847[++Statics.field837 - 1] = Statics.field1785.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field101 != null && Statics.field101.hasNext()) {
                field847[++Statics.field837 - 1] = (Integer) Statics.field101.next();
            } else {
                field847[++Statics.field837 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field837 -= 3;
            int var3 = field847[Statics.field837];
            int var4 = field847[Statics.field837 + 1];
            int var5 = field847[Statics.field837 + 2];
            int var6 = class441.method6969(var4);
            int var7 = class441.method3090(var4);
            int var8 = class441.method4088(var4);
            class440 var9 = class440.method2106(var3);
            class438 var10 = Statics.method4600(var6);
            int[] var11 = var10.field4707[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method7100(var7);
            if (var14 == null && var10.field4708 != null) {
                var14 = var10.field4708[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class435 var17 = class433.method6114(var16);
                    if (class435.field4690 == var17) {
                        field842[++Statics.field2020 - 1] = "";
                    } else {
                        field847[++Statics.field837 - 1] = class433.method6447(var16);
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
                class435 var21 = class433.method6114(var11[var19]);
                if (class435.field4690 == var21) {
                    field842[++Statics.field2020 - 1] = (String) var14[var20];
                } else {
                    field847[++Statics.field837 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field837 -= 2;
            int var22 = field847[Statics.field837];
            int var23 = field847[Statics.field837 + 1];
            int var24 = 0;
            int var25 = class441.method6969(var23);
            int var26 = class441.method3090(var23);
            class440 var27 = class440.method2106(var22);
            class438 var28 = Statics.method4600(var25);
            int[] var29 = var28.field4707[var26];
            Object[] var30 = var27.method7100(var26);
            if (var30 == null && var28.field4708 != null) {
                var30 = var28.field4708[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field847[++Statics.field837 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7509) {
            Statics.field837--;
            int var41 = field847[Statics.field837];
            class439 var42 = client.method1036(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field1785 = var42.method7097(0, 0);
            int var43 = 0;
            if (Statics.field1785 != null) {
                client.field619 = var41;
                Statics.field101 = Statics.field1785.iterator();
                var43 = Statics.field1785.size();
            }
            if (arg0 == 7504) {
                field847[++Statics.field837 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field847[--Statics.field837];
            class440 var32 = class440.method2106(var31);
            field847[++Statics.field837 - 1] = var32.field4714;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field847[--Statics.field837];
            int var34 = -1;
            if (Statics.field1785 != null && var33 >= 0 && var33 < Statics.field1785.size()) {
                var34 = (Integer) Statics.field1785.get(var33);
            }
            field847[++Statics.field837 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7510) {
            int var35 = field847[--Statics.field837];
            Object var36 = method178(var35);
            int var37 = field847[--Statics.field837];
            class439 var38 = client.method3166(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class441.method6969(var37) != client.field619) {
                throw new RuntimeException();
            } else if (Statics.field1785 == null && Statics.field1785.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class441.method4088(var37);
                List var40 = var38.method7097(var36, var39);
                Statics.field1785 = new LinkedList(Statics.field1785);
                if (var40 == null) {
                    Statics.field1785.clear();
                } else {
                    Statics.field1785.retainAll(var40);
                }
                Statics.field101 = Statics.field1785.iterator();
                if (arg0 == 7507) {
                    field847[++Statics.field837 - 1] = Statics.field1785.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ij.bg(ILbt;ZI)I")
    public static int method4662(int arg0, class72 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("v.bi(II)V")
    public static void method112(int arg0) {
        if (arg0 == -1 || !class296.method3567(arg0)) {
            return;
        }
        class296[] var1 = Statics.field3331[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class296 var3 = var1[var2];
            if (var3.field3487 != null) {
                class81 var4 = new class81();
                var4.field1044 = var3;
                var4.field1046 = var3.field3487;
                method4649(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("ge.bj(ILkz;ZB)V")
    public static void method3864(int arg0, class291 arg1, boolean arg2) {
        class226 var3 = client.method2659().method6728(arg0);
        int var4 = Statics.field890.field1106;
        int var5 = (Statics.field890.field1185 >> 7) + Statics.field1560;
        int var6 = (Statics.field890.field1129 >> 7) + Statics.field2784;
        class291 var7 = new class291(var4, var5, var6);
        client.method2659().method6741(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("jt.by(Lps;I)Ljava/lang/Object;")
    public static Object method4826(class435 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field4695) {
            case 1:
                return field847[--Statics.field837];
            case 2:
                return field842[--Statics.field2020];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("t.bz(IB)Ljava/lang/Object;")
    public static Object method178(int arg0) {
        return method4826((class435) class331.method5118(class435.method7062(), arg0));
    }
}
