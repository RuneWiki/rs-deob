package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("cs")
public class class68 {

    @ObfuscatedName("cs.ao")
    public static int[] field827 = new int[5];

    @ObfuscatedName("cs.av")
    public static int[][] field828 = new int[5][5000];

    @ObfuscatedName("cs.aq")
    public static int[] field842 = new int[1000];

    @ObfuscatedName("cs.ar")
    public static String[] field835 = new String[1000];

    @ObfuscatedName("cs.ax")
    public static int field834 = 0;

    @ObfuscatedName("cs.as")
    public static class60[] field833 = new class60[50];

    @ObfuscatedName("cs.ag")
    public static Calendar field844 = Calendar.getInstance();

    @ObfuscatedName("cs.at")
    public static final String[] field831 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cs.ai")
    public static boolean field836 = false;

    @ObfuscatedName("cs.aw")
    public static boolean field837 = false;

    @ObfuscatedName("cs.aa")
    public static ArrayList field838 = new ArrayList();

    @ObfuscatedName("cs.ah")
    public static int field839 = 0;

    @ObfuscatedName("cs.bo")
    public static final double field840 = Math.log(2.0D);

    public class68() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.aj(Ldx;I)V")
    public static void method69(class86 arg0) {
        method168(arg0, 500000, 475000);
    }

    @ObfuscatedName("am.al(Ldx;III)V")
    public static void method168(class86 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1057;
        class77 var5;
        if (class476.method5756(arg0.field1048)) {
            Statics.field1882 = (class268) var3[0];
            class185 var4 = class185.method2778(Statics.field1882.field3031);
            var5 = class77.method5970(arg0.field1048, var4.field1903, var4.field1923);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class77.method2128(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field830 = 0;
        Statics.field1267 = 0;
        int var7 = -1;
        int[] var8 = var5.field971;
        int[] var9 = var5.field968;
        byte var10 = -1;
        field834 = 0;
        field836 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field829 = new int[var5.field970];
            int var13 = 0;
            Statics.field832 = new String[var5.field965];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1049;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1050;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1056 == null ? -1 : arg0.field1056.field3526;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1051;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1056 == null ? -1 : arg0.field1056.field3524;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1046 == null ? -1 : arg0.field1046.field3526;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1046 == null ? -1 : arg0.field1046.field3524;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1053;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1054;
                    }
                    Statics.field829[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1055;
                    }
                    Statics.field832[var14++] = var17;
                }
            }
            field839 = arg0.field1052;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field968[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method37(var61, var5, var48);
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
                    field842[++Statics.field830 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field842[++Statics.field830 - 1] = class303.field3428[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class303.field3428[var19] = field842[--Statics.field830];
                    client.method3063(var19);
                } else if (var61 == 3) {
                    field835[++Statics.field1267 - 1] = var5.field975[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field830 -= 2;
                    if (field842[Statics.field830] != field842[Statics.field830 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field830 -= 2;
                    if (field842[Statics.field830] == field842[Statics.field830 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field830 -= 2;
                    if (field842[Statics.field830] < field842[Statics.field830 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field830 -= 2;
                    if (field842[Statics.field830] > field842[Statics.field830 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field834 == 0) {
                        return;
                    }
                    class60 var21 = field833[--field834];
                    var5 = var21.field449;
                    var8 = var5.field971;
                    var9 = var5.field968;
                    var7 = var21.field448;
                    Statics.field829 = var21.field450;
                    Statics.field832 = var21.field447;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field842[++Statics.field830 - 1] = class303.method233(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class303.method2175(var23, field842[--Statics.field830]);
                } else if (var61 == 31) {
                    Statics.field830 -= 2;
                    if (field842[Statics.field830] <= field842[Statics.field830 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field830 -= 2;
                    if (field842[Statics.field830] >= field842[Statics.field830 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field842[++Statics.field830 - 1] = Statics.field829[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field829[var9[var7]] = field842[--Statics.field830];
                } else if (var61 == 35) {
                    field835[++Statics.field1267 - 1] = Statics.field832[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field832[var9[var7]] = field835[--Statics.field1267];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field1267 -= var24;
                    String var25 = class368.method6262(field835, Statics.field1267, var24);
                    field835[++Statics.field1267 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field830--;
                } else if (var61 == 39) {
                    Statics.field1267--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class77 var27 = class77.method2128(var26);
                    int[] var28 = new int[var27.field970];
                    String[] var29 = new String[var27.field965];
                    for (int var30 = 0; var30 < var27.field972; var30++) {
                        var28[var30] = field842[Statics.field830 - var27.field972 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field967; var31++) {
                        var29[var31] = field835[Statics.field1267 - var27.field967 + var31];
                    }
                    Statics.field830 -= var27.field972;
                    Statics.field1267 -= var27.field967;
                    class60 var32 = new class60();
                    var32.field449 = var5;
                    var32.field448 = var7;
                    var32.field450 = Statics.field829;
                    var32.field447 = Statics.field832;
                    field833[++field834 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field971;
                    var9 = var27.field968;
                    var7 = -1;
                    Statics.field829 = var28;
                    Statics.field832 = var29;
                } else if (var61 == 42) {
                    field842[++Statics.field830 - 1] = Statics.field2901.method2564(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field2901.method2589(var9[var7], field842[--Statics.field830]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field842[--Statics.field830];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field827[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field828[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field842[--Statics.field830];
                    if (var39 < 0 || var39 >= field827[var38]) {
                        throw new RuntimeException();
                    }
                    field842[++Statics.field830 - 1] = field828[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field830 -= 2;
                    int var41 = field842[Statics.field830];
                    if (var41 < 0 || var41 >= field827[var40]) {
                        throw new RuntimeException();
                    }
                    field828[var40][var41] = field842[Statics.field830 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field2901.method2568(var9[var7]);
                    if (var42 == null) {
                        var42 = class333.field3824;
                    }
                    field835[++Statics.field1267 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field2901.method2579(var9[var7], field835[--Statics.field1267]);
                } else if (var61 == 49) {
                    String var43 = Statics.field2901.method2566(var9[var7]);
                    field835[++Statics.field1267 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field2901.method2585(var9[var7], field835[--Statics.field1267]);
                } else if (var61 == 60) {
                    class454 var44 = var5.field974[var9[var7]];
                    class443 var45 = (class443) var44.method7611((long) field842[--Statics.field830]);
                    if (var45 != null) {
                        var7 += var45.field4671;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field4339.method3012(var9[var7]);
                    if (var46 == null) {
                        field842[++Statics.field830 - 1] = -1;
                    } else {
                        field842[++Statics.field830 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field1959.method7270(var9[var7]);
                    if (var47 == null) {
                        field842[++Statics.field830 - 1] = -1;
                    } else {
                        field842[++Statics.field830 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4673).append(" ");
            for (int var53 = field834 - 1; var53 >= 0; var53--) {
                var52.append("").append(field833[var53].field449.field4673).append(" ");
            }
            var52.append("").append(var10);
            class504.method6263(var52.toString(), var59);
        } finally {
            while (field838.size() > 0) {
                class100 var56 = (class100) field838.remove(0);
                client.method5786(var56.method2509(), var56.method2510(), var56.method2513(), var56.method2512(), "");
            }
            if (field836) {
                field836 = false;
                client.method4414();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class504.method6263("Warning: Script " + var5.field966 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("aq.ac(ILcv;ZB)I")
    public static int method37(int arg0, class77 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method3475(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method7261(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method5762(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return Statics.method2094(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method6888(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method5962(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method5743(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method4960(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return Statics.method6018(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return Statics.method2129(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method5856(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method7261(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method5762(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return Statics.method2094(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method6888(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method5962(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method2971(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method4743(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method821(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method7574(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method5856(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method2060(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2631(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method2539(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method4881(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method1959(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method2742(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method4883(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method673(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method2013(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method1079(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method6052(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3808(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method804(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method1945(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method2560(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method2940(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method4442(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method1239(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method3431(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method2475(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method1135(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method1081(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method3396(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method6747(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method4744(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method169(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method3064(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method4742(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hy.ab(ILcv;ZI)I")
    public static int method3475(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field830 -= 3;
            int var3 = field842[Statics.field830];
            int var4 = field842[Statics.field830 + 1];
            int var5 = field842[Statics.field830 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class313 var6 = class313.method4802(var3);
            if (var6.field3662 == null) {
                var6.field3662 = new class313[var5 + 1];
            }
            if (var6.field3662.length <= var5) {
                class313[] var7 = new class313[var5 + 1];
                for (int var8 = 0; var8 < var6.field3662.length; var8++) {
                    var7[var8] = var6.field3662[var8];
                }
                var6.field3662 = var7;
            }
            if (var5 > 0 && var6.field3662[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class313 var9 = new class313();
            var9.field3528 = var4;
            var9.field3531 = var9.field3526 = var6.field3526;
            var9.field3524 = var5;
            var9.field3525 = true;
            if (var4 == 12) {
                var9.method5565();
                var9.method5566().method5312(new class103(var9));
                var9.method5566().method5299(new class104(var9));
            }
            var6.field3662[var5] = var9;
            if (arg2) {
                Statics.field2802 = var9;
            } else {
                Statics.field320 = var9;
            }
            client.method1946(var6);
            return 1;
        } else if (arg0 == 101) {
            class313 var10 = arg2 ? Statics.field2802 : Statics.field320;
            class313 var11 = class313.method4802(var10.field3526);
            var11.field3662[var10.field3524] = null;
            client.method1946(var11);
            return 1;
        } else if (arg0 == 102) {
            class313 var12 = class313.method4802(field842[--Statics.field830]);
            var12.field3662 = null;
            client.method1946(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field830 -= 2;
            int var13 = field842[Statics.field830];
            int var14 = field842[Statics.field830 + 1];
            class313 var15 = class313.method670(var13, var14);
            if (var15 == null || var14 == -1) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = 1;
                if (arg2) {
                    Statics.field2802 = var15;
                } else {
                    Statics.field320 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class313 var16 = class313.method4802(field842[--Statics.field830]);
            if (var16 == null) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = 1;
                if (arg2) {
                    Statics.field2802 = var16;
                } else {
                    Statics.field320 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("qx.an(ILcv;ZB)I")
    public static int method7261(int arg0, class77 arg1, boolean arg2) {
        int var3 = -1;
        class313 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field842[--Statics.field830];
            var4 = class313.method4802(var3);
        } else {
            var4 = arg2 ? Statics.field2802 : Statics.field320;
        }
        if (arg0 == 1000) {
            Statics.field830 -= 4;
            var4.field3535 = field842[Statics.field830];
            var4.field3536 = field842[Statics.field830 + 1];
            var4.field3550 = field842[Statics.field830 + 2];
            var4.field3559 = field842[Statics.field830 + 3];
            client.method1946(var4);
            Statics.field4480.method1171(var4);
            if (var3 != -1 && var4.field3528 == 0) {
                client.method4935(Statics.field1732[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field830 -= 4;
            var4.field3537 = field842[Statics.field830];
            var4.field3538 = field842[Statics.field830 + 1];
            var4.field3598 = field842[Statics.field830 + 2];
            var4.field3534 = field842[Statics.field830 + 3];
            client.method1946(var4);
            Statics.field4480.method1171(var4);
            if (var3 != -1 && var4.field3528 == 0) {
                client.method4935(Statics.field1732[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field842[--Statics.field830] == 1;
            if (var4.field3674 != var5) {
                var4.field3674 = var5;
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3672 = field842[--Statics.field830] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3673 = field842[--Statics.field830] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mj.ao(ILcv;ZB)I")
    public static int method5762(int arg0, class77 arg1, boolean arg2) {
        int var3 = -1;
        class313 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field842[--Statics.field830];
            var4 = class313.method4802(var3);
        } else {
            var4 = arg2 ? Statics.field2802 : Statics.field320;
        }
        if (arg0 == 1100) {
            Statics.field830 -= 2;
            int var5 = field842[Statics.field830];
            int var6 = field842[Statics.field830 + 1];
            if (var4.field3528 == 12) {
                class311 var7 = var4.method5566();
                if (var7 != null && var7.method5274(var5, var6)) {
                    client.method1946(var4);
                }
            } else {
                var4.field3517 = var5;
                if (var4.field3517 > var4.field3549 - var4.field3541) {
                    var4.field3517 = var4.field3549 - var4.field3541;
                }
                if (var4.field3517 < 0) {
                    var4.field3517 = 0;
                }
                var4.field3523 = var6;
                if (var4.field3523 > var4.field3614 - var4.field3516) {
                    var4.field3523 = var4.field3614 - var4.field3516;
                }
                if (var4.field3523 < 0) {
                    var4.field3523 = 0;
                }
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3551 = field842[--Statics.field830];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3555 = field842[--Statics.field830] == 1;
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3628 = field842[--Statics.field830];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3581 = field842[--Statics.field830];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3561 = field842[--Statics.field830];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3564 = field842[--Statics.field830];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3530 = field842[--Statics.field830] == 1;
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3574 = 1;
            var4.field3571 = field842[--Statics.field830];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field830 -= 6;
            var4.field3617 = field842[Statics.field830];
            var4.field3656 = field842[Statics.field830 + 1];
            var4.field3578 = field842[Statics.field830 + 2];
            var4.field3635 = field842[Statics.field830 + 3];
            var4.field3580 = field842[Statics.field830 + 4];
            var4.field3510 = field842[Statics.field830 + 5];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field842[--Statics.field830];
            if (var4.field3610 != var8) {
                var4.field3610 = var8;
                var4.field3666 = 0;
                var4.field3661 = 0;
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3527 = field842[--Statics.field830] == 1;
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field835[--Statics.field1267];
            if (!var9.equals(var4.field3588)) {
                var4.field3588 = var9;
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3587 = field842[--Statics.field830];
            if (var4.field3528 == 12) {
                class311 var10 = var4.method5566();
                if (var10 != null) {
                    var10.method5281();
                }
            }
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field830 -= 3;
            if (var4.field3528 == 12) {
                class311 var11 = var4.method5566();
                if (var11 != null) {
                    var11.method5383(field842[Statics.field830], field842[Statics.field830 + 1]);
                    var11.method5276(field842[Statics.field830 + 2]);
                }
            } else {
                var4.field3591 = field842[Statics.field830];
                var4.field3592 = field842[Statics.field830 + 1];
                var4.field3590 = field842[Statics.field830 + 2];
            }
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3593 = field842[--Statics.field830] == 1;
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3566 = field842[--Statics.field830];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3567 = field842[--Statics.field830];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3568 = field842[--Statics.field830] == 1;
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3569 = field842[--Statics.field830] == 1;
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field830 -= 2;
            var4.field3549 = field842[Statics.field830];
            var4.field3614 = field842[Statics.field830 + 1];
            client.method1946(var4);
            if (var3 != -1 && var4.field3528 == 0) {
                client.method4935(Statics.field1732[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method2886(var4.field3526, var4.field3524);
            client.field652 = var4;
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3562 = field842[--Statics.field830];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3675 = field842[--Statics.field830];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3560 = field842[--Statics.field830];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var12 = field842[--Statics.field830];
            class490 var13 = (class490) class354.method5197(class490.method4399(), var12);
            if (var13 != null) {
                var4.field3556 = var13;
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var14 = field842[--Statics.field830] == 1;
            var4.field3546 = var14;
            return 1;
        } else if (arg0 == 1127) {
            boolean var15 = field842[--Statics.field830] == 1;
            var4.field3585 = var15;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3563 = field835[--Statics.field1267];
            client.method1946(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method5584(field835[--Statics.field1267], Statics.field4254, client.method2939());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field830 -= 2;
            var4.method5553(field842[Statics.field830], field842[Statics.field830 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5554(field835[--Statics.field1267], field842[--Statics.field830]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field830--;
            class306 var16 = var4.method5567();
            if (var16 != null) {
                var16.field3437 = field842[Statics.field830];
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field830--;
            class306 var17 = var4.method5567();
            if (var17 != null) {
                var17.field3438 = field842[Statics.field830];
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field1267--;
            class311 var18 = var4.method5566();
            if (var18 != null) {
                var4.field3589 = field835[Statics.field1267];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field830--;
            class306 var19 = var4.method5567();
            if (var19 != null) {
                var19.field3441 = field842[Statics.field830];
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field830--;
            class311 var20 = var4.method5566();
            if (var20 != null && var20.method5263(field842[Statics.field830])) {
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field830--;
            class311 var21 = var4.method5566();
            if (var21 != null && var21.method5272(field842[Statics.field830])) {
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field830--;
            class311 var22 = var4.method5566();
            if (var22 != null && var22.method5273(field842[Statics.field830])) {
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var23 = field842[--Statics.field830] == 1;
            client.field714.method3738();
            class311 var24 = var4.method5566();
            if (var24 != null && var24.method5339(var23)) {
                if (var23) {
                    client.field714.method3729(var4);
                }
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var25 = field842[--Statics.field830] == 1;
            if (!var25 && client.field714.method3730() == var4) {
                client.field714.method3738();
                client.method1946(var4);
            }
            class311 var26 = var4.method5566();
            if (var26 != null) {
                var26.method5287(var25);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field830 -= 2;
            class311 var27 = var4.method5566();
            if (var27 != null && var27.method5289(field842[Statics.field830], field842[Statics.field830 + 1])) {
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field830--;
            class311 var28 = var4.method5566();
            if (var28 != null && var28.method5289(field842[Statics.field830], field842[Statics.field830])) {
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field830--;
            class311 var29 = var4.method5566();
            if (var29 != null) {
                var29.method5351(field842[Statics.field830]);
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field830--;
            class311 var30 = var4.method5566();
            if (var30 != null) {
                var30.method5310(field842[Statics.field830]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field830--;
            class311 var31 = var4.method5566();
            if (var31 != null) {
                var31.method5366(field842[Statics.field830]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field830--;
            class311 var32 = var4.method5566();
            if (var32 != null) {
                var32.method5279(field842[Statics.field830]);
                client.method1946(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field830 -= 2;
            class28 var33 = var4.method5568();
            if (var33 != null) {
                var33.method378(field842[Statics.field830], field842[Statics.field830 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field830 -= 2;
            class28 var34 = var4.method5568();
            if (var34 != null) {
                var34.method379((char) field842[Statics.field830], field842[Statics.field830 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method5624(field835[--Statics.field1267], Statics.field4254);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pa.aq(ILcv;ZI)I")
    public static int method6888(int arg0, class77 arg1, boolean arg2) {
        boolean var3 = true;
        class313 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class313.method4802(field842[--Statics.field830]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field2802 : Statics.field320;
        }
        if (arg0 == 1300) {
            int var5 = field842[--Statics.field830] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5547(var5, field835[--Statics.field1267]);
                return 1;
            } else {
                Statics.field1267--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field830 -= 2;
            int var6 = field842[Statics.field830];
            int var7 = field842[Statics.field830 + 1];
            var4.field3607 = class313.method670(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3633 = field842[--Statics.field830] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3608 = field842[--Statics.field830];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3609 = field842[--Statics.field830];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3558 = field835[--Statics.field1267];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3611 = field835[--Statics.field1267];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3631 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3603 = field842[--Statics.field830] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field830--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field830 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field842[Statics.field830 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field842[Statics.field830 + var10];
                        var9[var10 / 2] = (byte) field842[Statics.field830 + var10 + 1];
                    }
                }
            } else {
                Statics.field830 -= 2;
                var8 = new byte[] { (byte) field842[Statics.field830] };
                var9 = new byte[] { (byte) field842[Statics.field830 + 1] };
            }
            int var11 = field842[--Statics.field830] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method6007(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field830 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field842[Statics.field830] };
            byte[] var14 = new byte[] { (byte) field842[Statics.field830 + 1] };
            method6007(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field830 -= 3;
            int var15 = field842[Statics.field830] - 1;
            int var16 = field842[Statics.field830 + 1];
            int var17 = field842[Statics.field830 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method6744(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field842[--Statics.field830];
            int var20 = field842[--Statics.field830];
            method6744(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field830--;
            int var21 = field842[Statics.field830] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method3208(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method3208(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nd.ap(Lmy;I[B[BB)V")
    public static final void method6007(class313 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3576 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3576 = new byte[11][];
            arg0.field3602 = new byte[11][];
            arg0.field3584 = new int[11];
            arg0.field3604 = new int[11];
        }
        arg0.field3576[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3600 = false;
            for (int var4 = 0; var4 < arg0.field3576.length; var4++) {
                if (arg0.field3576[var4] != null) {
                    arg0.field3600 = true;
                    break;
                }
            }
        } else {
            arg0.field3600 = true;
        }
        arg0.field3602[arg1] = arg3;
    }

    @ObfuscatedName("os.ar(Lmy;IIIB)V")
    public static final void method6744(class313 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3584 == null) {
            throw new RuntimeException();
        }
        arg0.field3584[arg1] = arg2;
        arg0.field3604[arg1] = arg3;
    }

    @ObfuscatedName("gx.ak(Lmy;IB)V")
    public static final void method3208(class313 arg0, int arg1) {
        if (arg0.field3576 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3671 == null) {
            arg0.field3671 = new int[arg0.field3576.length];
        }
        arg0.field3671[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ng.ax(ILcv;ZB)I")
    public static int method5962(int arg0, class77 arg1, boolean arg2) {
        class313 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class313.method4802(field842[--Statics.field830]);
        } else {
            var3 = arg2 ? Statics.field2802 : Statics.field320;
        }
        String var4 = field835[--Statics.field1267];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field842[--Statics.field830];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field842[--Statics.field830];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field835[--Statics.field1267];
            } else {
                var7[var8] = Integer.valueOf(field842[--Statics.field830]);
            }
        }
        int var9 = field842[--Statics.field830];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3532 = var7;
        } else if (arg0 == 1401) {
            var3.field3601 = var7;
        } else if (arg0 == 1402) {
            var3.field3616 = var7;
        } else if (arg0 == 1403) {
            var3.field3618 = var7;
        } else if (arg0 == 1404) {
            var3.field3620 = var7;
        } else if (arg0 == 1405) {
            var3.field3621 = var7;
        } else if (arg0 == 1406) {
            var3.field3647 = var7;
        } else if (arg0 == 1407) {
            var3.field3660 = var7;
            var3.field3626 = var5;
        } else if (arg0 == 1408) {
            var3.field3577 = var7;
        } else if (arg0 == 1409) {
            var3.field3632 = var7;
        } else if (arg0 == 1410) {
            var3.field3622 = var7;
        } else if (arg0 == 1411) {
            var3.field3552 = var7;
        } else if (arg0 == 1412) {
            var3.field3619 = var7;
        } else if (arg0 == 1414) {
            var3.field3548 = var7;
            var3.field3582 = var5;
        } else if (arg0 == 1415) {
            var3.field3629 = var7;
            var3.field3543 = var5;
        } else if (arg0 == 1416) {
            var3.field3565 = var7;
        } else if (arg0 == 1417) {
            var3.field3634 = var7;
        } else if (arg0 == 1418) {
            var3.field3553 = var7;
        } else if (arg0 == 1419) {
            var3.field3613 = var7;
        } else if (arg0 == 1420) {
            var3.field3639 = var7;
        } else if (arg0 == 1421) {
            var3.field3640 = var7;
        } else if (arg0 == 1422) {
            var3.field3643 = var7;
        } else if (arg0 == 1423) {
            var3.field3644 = var7;
        } else if (arg0 == 1424) {
            var3.field3645 = var7;
        } else if (arg0 == 1425) {
            var3.field3625 = var7;
        } else if (arg0 == 1426) {
            var3.field3648 = var7;
        } else if (arg0 == 1427) {
            var3.field3606 = var7;
        } else if (arg0 == 1428) {
            var3.field3641 = var7;
        } else if (arg0 == 1429) {
            var3.field3642 = var7;
        } else if (arg0 == 1430) {
            var3.field3637 = var7;
        } else if (arg0 == 1431) {
            var3.field3542 = var7;
        } else if (arg0 == 1434) {
            var3.field3649 = var7;
        } else if (arg0 == 1435) {
            var3.field3623 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class309 var10 = var3.method5611();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3455 = var7;
                } else if (arg0 == 1437) {
                    var10.field3451 = var7;
                } else if (arg0 == 1438) {
                    var10.field3454 = var7;
                } else if (arg0 == 1439) {
                    var10.field3460 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3612 = true;
        return 1;
    }

    @ObfuscatedName("mi.as(ILcv;ZB)I")
    public static int method5743(int arg0, class77 arg1, boolean arg2) {
        class313 var3 = arg2 ? Statics.field2802 : Statics.field320;
        if (arg0 == 1500) {
            field842[++Statics.field830 - 1] = var3.field3539;
            return 1;
        } else if (arg0 == 1501) {
            field842[++Statics.field830 - 1] = var3.field3540;
            return 1;
        } else if (arg0 == 1502) {
            field842[++Statics.field830 - 1] = var3.field3541;
            return 1;
        } else if (arg0 == 1503) {
            field842[++Statics.field830 - 1] = var3.field3516;
            return 1;
        } else if (arg0 == 1504) {
            field842[++Statics.field830 - 1] = var3.field3674 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field842[++Statics.field830 - 1] = var3.field3531;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ln.ay(ILcv;ZI)I")
    public static int method4960(int arg0, class77 arg1, boolean arg2) {
        class313 var3 = arg2 ? Statics.field2802 : Statics.field320;
        if (arg0 == 1600) {
            field842[++Statics.field830 - 1] = var3.field3517;
            return 1;
        } else if (arg0 == 1601) {
            field842[++Statics.field830 - 1] = var3.field3523;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3528 == 12) {
                class311 var4 = var3.method5566();
                if (var4 != null) {
                    field835[++Statics.field1267 - 1] = var4.method5313().method6406();
                    return 1;
                }
            }
            field835[++Statics.field1267 - 1] = var3.field3588;
            return 1;
        } else if (arg0 == 1603) {
            field842[++Statics.field830 - 1] = var3.field3549;
            return 1;
        } else if (arg0 == 1604) {
            field842[++Statics.field830 - 1] = var3.field3614;
            return 1;
        } else if (arg0 == 1605) {
            field842[++Statics.field830 - 1] = var3.field3510;
            return 1;
        } else if (arg0 == 1606) {
            field842[++Statics.field830 - 1] = var3.field3578;
            return 1;
        } else if (arg0 == 1607) {
            field842[++Statics.field830 - 1] = var3.field3580;
            return 1;
        } else if (arg0 == 1608) {
            field842[++Statics.field830 - 1] = var3.field3635;
            return 1;
        } else if (arg0 == 1609) {
            field842[++Statics.field830 - 1] = var3.field3628;
            return 1;
        } else if (arg0 == 1610) {
            field842[++Statics.field830 - 1] = var3.field3560;
            return 1;
        } else if (arg0 == 1611) {
            field842[++Statics.field830 - 1] = var3.field3551;
            return 1;
        } else if (arg0 == 1612) {
            field842[++Statics.field830 - 1] = var3.field3675;
            return 1;
        } else if (arg0 == 1613) {
            field842[++Statics.field830 - 1] = var3.field3556.method33();
            return 1;
        } else if (arg0 == 1614) {
            field842[++Statics.field830 - 1] = var3.field3585 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class306 var5 = var3.method5567();
                field842[++Statics.field830 - 1] = var5 == null ? 0 : var5.field3437;
            }
            if (arg0 == 1618) {
                class306 var6 = var3.method5567();
                field842[++Statics.field830 - 1] = var6 == null ? 0 : var6.field3438;
                return 1;
            } else if (arg0 == 1619) {
                class311 var7 = var3.method5566();
                field835[++Statics.field1267 - 1] = var7 == null ? "" : var7.method5314().method6406();
                return 1;
            } else if (arg0 == 1620) {
                class306 var8 = var3.method5567();
                field842[++Statics.field830 - 1] = var8 == null ? 0 : var8.field3441;
                return 1;
            } else if (arg0 == 1621) {
                class311 var9 = var3.method5566();
                field842[++Statics.field830 - 1] = var9 == null ? 0 : var9.method5324();
                return 1;
            } else if (arg0 == 1622) {
                class311 var10 = var3.method5566();
                field842[++Statics.field830 - 1] = var10 == null ? 0 : var10.method5266();
                return 1;
            } else if (arg0 == 1623) {
                class311 var11 = var3.method5566();
                field842[++Statics.field830 - 1] = var11 == null ? 0 : var11.method5328();
                return 1;
            } else if (arg0 == 1624) {
                class311 var12 = var3.method5566();
                field842[++Statics.field830 - 1] = var12 != null && var12.method5403() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class311 var13 = var3.method5566();
                field842[++Statics.field830 - 1] = var13 != null && var13.method5381() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class311 var14 = var3.method5566();
                field835[++Statics.field1267 - 1] = var14 == null ? "" : var14.method5315().method6643();
                return 1;
            } else if (arg0 == 1627) {
                class311 var15 = var3.method5566();
                int var16 = var15 == null ? 0 : var15.method5477();
                int var17 = var15 == null ? 0 : var15.method5319();
                field842[++Statics.field830 - 1] = Math.min(var16, var17);
                field842[++Statics.field830 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class311 var18 = var3.method5566();
                field842[++Statics.field830 - 1] = var18 == null ? 0 : var18.method5319();
                return 1;
            } else if (arg0 == 1629) {
                class311 var19 = var3.method5566();
                field842[++Statics.field830 - 1] = var19 == null ? 0 : var19.method5361();
                return 1;
            } else if (arg0 == 1630) {
                class311 var20 = var3.method5566();
                field842[++Statics.field830 - 1] = var20 == null ? 0 : var20.method5327();
                return 1;
            } else if (arg0 == 1631) {
                class311 var21 = var3.method5566();
                field842[++Statics.field830 - 1] = var21 == null ? 0 : var21.method5329();
                return 1;
            } else if (arg0 == 1632) {
                class311 var22 = var3.method5566();
                field842[++Statics.field830 - 1] = var22 == null ? 0 : var22.method5391();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method5568();
                field842[Statics.field830 - 1] = var23 == null ? 0 : var23.method380(field842[Statics.field830 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method5568();
                field842[Statics.field830 - 1] = var24 == null ? 0 : var24.method381((char) field842[Statics.field830 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("cz.az(Lmy;B)I")
    public static int method1736(class313 arg0) {
        if (arg0.field3528 == 11) {
            String var1 = field835[--Statics.field1267];
            field842[++Statics.field830 - 1] = arg0.method5557(var1);
            return 1;
        } else {
            Statics.field1267--;
            field842[++Statics.field830 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("qh.ae(Lmy;I)I")
    public static int method7180(class313 arg0) {
        if (arg0.field3528 == 11) {
            String var1 = field835[--Statics.field1267];
            field835[++Statics.field1267 - 1] = arg0.method5558(var1);
            return 1;
        } else {
            field835[Statics.field1267 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("ns.ag(ILcv;ZB)I")
    public static int method5856(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field839 >= 10) {
                throw new RuntimeException();
            }
            class313 var10;
            if (arg0 >= 2000) {
                var10 = class313.method4802(field842[--Statics.field830]);
            } else {
                var10 = arg2 ? Statics.field2802 : Statics.field320;
            }
            if (var10.field3606 == null) {
                return 0;
            }
            class86 var11 = new class86();
            var11.field1056 = var10;
            var11.field1057 = var10.field3606;
            var11.field1052 = field839 + 1;
            client.field690.method6111(var11);
            return 1;
        } else if (arg0 == 1928) {
            class313 var3 = arg2 ? Statics.field2802 : Statics.field320;
            int var4 = field842[--Statics.field830];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class100 var5 = new class100(var4, var3.field3526, var3.field3524, var3.field3658);
            field838.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field830 -= 3;
            int var6 = field842[Statics.field830];
            int var7 = field842[Statics.field830 + 1];
            int var8 = field842[Statics.field830 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class100 var9 = new class100(var8, var6, var7, class313.method4802(var6).field3658);
            field838.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fh.at(ILcv;ZI)I")
    public static int method2971(int arg0, class77 arg1, boolean arg2) {
        class313 var3 = class313.method4802(field842[--Statics.field830]);
        if (arg0 == 2500) {
            field842[++Statics.field830 - 1] = var3.field3539;
            return 1;
        } else if (arg0 == 2501) {
            field842[++Statics.field830 - 1] = var3.field3540;
            return 1;
        } else if (arg0 == 2502) {
            field842[++Statics.field830 - 1] = var3.field3541;
            return 1;
        } else if (arg0 == 2503) {
            field842[++Statics.field830 - 1] = var3.field3516;
            return 1;
        } else if (arg0 == 2504) {
            field842[++Statics.field830 - 1] = var3.field3674 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field842[++Statics.field830 - 1] = var3.field3531;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jh.af(ILcv;ZI)I")
    public static int method4743(int arg0, class77 arg1, boolean arg2) {
        class313 var3 = class313.method4802(field842[--Statics.field830]);
        if (arg0 == 2600) {
            field842[++Statics.field830 - 1] = var3.field3517;
            return 1;
        } else if (arg0 == 2601) {
            field842[++Statics.field830 - 1] = var3.field3523;
            return 1;
        } else if (arg0 == 2602) {
            field835[++Statics.field1267 - 1] = var3.field3588;
            return 1;
        } else if (arg0 == 2603) {
            field842[++Statics.field830 - 1] = var3.field3549;
            return 1;
        } else if (arg0 == 2604) {
            field842[++Statics.field830 - 1] = var3.field3614;
            return 1;
        } else if (arg0 == 2605) {
            field842[++Statics.field830 - 1] = var3.field3510;
            return 1;
        } else if (arg0 == 2606) {
            field842[++Statics.field830 - 1] = var3.field3578;
            return 1;
        } else if (arg0 == 2607) {
            field842[++Statics.field830 - 1] = var3.field3580;
            return 1;
        } else if (arg0 == 2608) {
            field842[++Statics.field830 - 1] = var3.field3635;
            return 1;
        } else if (arg0 == 2609) {
            field842[++Statics.field830 - 1] = var3.field3628;
            return 1;
        } else if (arg0 == 2610) {
            field842[++Statics.field830 - 1] = var3.field3560;
            return 1;
        } else if (arg0 == 2611) {
            field842[++Statics.field830 - 1] = var3.field3551;
            return 1;
        } else if (arg0 == 2612) {
            field842[++Statics.field830 - 1] = var3.field3675;
            return 1;
        } else if (arg0 == 2613) {
            field842[++Statics.field830 - 1] = var3.field3556.method33();
            return 1;
        } else if (arg0 == 2614) {
            field842[++Statics.field830 - 1] = var3.field3585 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class306 var4 = var3.method5567();
                field842[++Statics.field830 - 1] = var4 == null ? 0 : var4.field3437;
            }
            if (arg0 == 2618) {
                class306 var5 = var3.method5567();
                field842[++Statics.field830 - 1] = var5 == null ? 0 : var5.field3438;
                return 1;
            } else if (arg0 == 2619) {
                class311 var6 = var3.method5566();
                field835[++Statics.field1267 - 1] = var6 == null ? "" : var6.method5314().method6406();
                return 1;
            } else if (arg0 == 2620) {
                class306 var7 = var3.method5567();
                field842[++Statics.field830 - 1] = var7 == null ? 0 : var7.field3441;
                return 1;
            } else if (arg0 == 2621) {
                class311 var8 = var3.method5566();
                field842[++Statics.field830 - 1] = var8 == null ? 0 : var8.method5324();
                return 1;
            } else if (arg0 == 2622) {
                class311 var9 = var3.method5566();
                field842[++Statics.field830 - 1] = var9 == null ? 0 : var9.method5266();
                return 1;
            } else if (arg0 == 2623) {
                class311 var10 = var3.method5566();
                field842[++Statics.field830 - 1] = var10 == null ? 0 : var10.method5328();
                return 1;
            } else if (arg0 == 2624) {
                class311 var11 = var3.method5566();
                field842[++Statics.field830 - 1] = var11 != null && var11.method5403() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class311 var12 = var3.method5566();
                field842[++Statics.field830 - 1] = var12 != null && var12.method5381() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class311 var13 = var3.method5566();
                field835[++Statics.field1267 - 1] = var13 == null ? "" : var13.method5315().method6643();
                return 1;
            } else if (arg0 == 2627) {
                class311 var14 = var3.method5566();
                int var15 = var14 == null ? 0 : var14.method5477();
                int var16 = var14 == null ? 0 : var14.method5319();
                field842[++Statics.field830 - 1] = Math.min(var15, var16);
                field842[++Statics.field830 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class311 var17 = var3.method5566();
                field842[++Statics.field830 - 1] = var17 == null ? 0 : var17.method5319();
                return 1;
            } else if (arg0 == 2629) {
                class311 var18 = var3.method5566();
                field842[++Statics.field830 - 1] = var18 == null ? 0 : var18.method5361();
                return 1;
            } else if (arg0 == 2630) {
                class311 var19 = var3.method5566();
                field842[++Statics.field830 - 1] = var19 == null ? 0 : var19.method5327();
                return 1;
            } else if (arg0 == 2631) {
                class311 var20 = var3.method5566();
                field842[++Statics.field830 - 1] = var20 == null ? 0 : var20.method5329();
                return 1;
            } else if (arg0 == 2632) {
                class311 var21 = var3.method5566();
                field842[++Statics.field830 - 1] = var21 == null ? 0 : var21.method5391();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method5568();
                field842[Statics.field830 - 1] = var22 == null ? 0 : var22.method380(field842[Statics.field830 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method5568();
                field842[Statics.field830 - 1] = var23 == null ? 0 : var23.method381((char) field842[Statics.field830 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("bb.ai(ILcv;ZB)I")
    public static int method821(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class313 var3 = class313.method4802(field842[--Statics.field830]);
            field842[++Statics.field830 - 1] = var3.field3658;
            return 1;
        } else if (arg0 == 2701) {
            class313 var4 = class313.method4802(field842[--Statics.field830]);
            if (var4.field3658 == -1) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = var4.field3659;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field842[--Statics.field830];
            class85 var6 = (class85) client.field648.method7619((long) var5);
            if (var6 == null) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field842[++Statics.field830 - 1] = client.field647;
            return 1;
        } else if (arg0 == 2707) {
            class313 var7 = class313.method4802(field842[--Statics.field830]);
            field842[++Statics.field830 - 1] = var7.method5639() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class313 var8 = class313.method4802(field842[--Statics.field830]);
            return method1736(var8);
        } else if (arg0 == 2709) {
            class313 var9 = class313.method4802(field842[--Statics.field830]);
            return method7180(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ry.aw(ILcv;ZB)I")
    public static int method7574(int arg0, class77 arg1, boolean arg2) {
        class313 var3 = class313.method4802(field842[--Statics.field830]);
        if (arg0 == 2800) {
            field842[++Statics.field830 - 1] = class314.method5745(client.method3468(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field842[--Statics.field830];
            int var5 = var4 - 1;
            if (var3.field3631 == null || var5 >= var3.field3631.length || var3.field3631[var5] == null) {
                field835[++Statics.field1267 - 1] = "";
            } else {
                field835[++Statics.field1267 - 1] = var3.field3631[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3558 == null) {
                field835[++Statics.field1267 - 1] = "";
            } else {
                field835[++Statics.field1267 - 1] = var3.field3558;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("du.aa(ILcv;ZB)I")
    public static int method2060(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field835[--Statics.field1267];
            class108.method5191(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field830 -= 2;
            client.method6063(Statics.field1440, field842[Statics.field830], field842[Statics.field830 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field837) {
                field836 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field835[--Statics.field1267];
            int var5 = 0;
            if (class368.method3084(var4)) {
                var5 = class368.method5989(var4);
            }
            class285 var6 = class285.method2741(class283.field3066, client.field734.field1380);
            var6.field3169.method7957(var5);
            client.field734.method2635(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field835[--Statics.field1267];
            class285 var8 = class285.method2741(class283.field3111, client.field734.field1380);
            var8.field3169.method7886(var7.length() + 1);
            var8.field3169.method7893(var7);
            client.field734.method2635(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field835[--Statics.field1267];
            class285 var10 = class285.method2741(class283.field3138, client.field734.field1380);
            var10.field3169.method7886(var9.length() + 1);
            var10.field3169.method7893(var9);
            client.field734.method2635(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field842[--Statics.field830];
            String var12 = field835[--Statics.field1267];
            client.method7570(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field830 -= 3;
            int var13 = field842[Statics.field830];
            int var14 = field842[Statics.field830 + 1];
            int var15 = field842[Statics.field830 + 2];
            class313 var16 = class313.method4802(var15);
            client.method4776(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field830 -= 2;
            int var17 = field842[Statics.field830];
            int var18 = field842[Statics.field830 + 1];
            class313 var19 = arg2 ? Statics.field2802 : Statics.field320;
            client.method4776(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field3700 = field842[--Statics.field830] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field842[++Statics.field830 - 1] = Statics.field2929.method2344() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field2929.method2318(field842[--Statics.field830] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field835[--Statics.field1267];
            boolean var21 = field842[--Statics.field830] == 1;
            class32.method367(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field842[--Statics.field830];
            class285 var23 = class285.method2741(class283.field3147, client.field734.field1380);
            var23.field3169.method7887(var22);
            client.field734.method2635(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field842[--Statics.field830];
            Statics.field1267 -= 2;
            String var25 = field835[Statics.field1267];
            String var26 = field835[Statics.field1267 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class285 var27 = class285.method2741(class283.field3142, client.field734.field1380);
                var27.field3169.method7887(1 + class478.method4789(var25) + class478.method4789(var26));
                var27.field3169.method8066(var24);
                var27.field3169.method7893(var26);
                var27.field3169.method7893(var25);
                client.field734.method2635(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field830--;
            return 1;
        } else if (arg0 == 3118) {
            client.field531 = field842[--Statics.field830] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field606 = field842[--Statics.field830] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field842[--Statics.field830] == 1) {
                client.field496 |= 0x1;
            } else {
                client.field496 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field842[--Statics.field830] == 1) {
                client.field496 |= 0x2;
            } else {
                client.field496 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field842[--Statics.field830] == 1) {
                client.field496 |= 0x4;
            } else {
                client.field496 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field842[--Statics.field830] == 1) {
                client.field496 |= 0x8;
            } else {
                client.field496 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field496 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field599 = field842[--Statics.field830] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field601 = field842[--Statics.field830] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method3046(field842[--Statics.field830] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field842[++Statics.field830 - 1] = client.method5202() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field830 -= 2;
            client.field574 = field842[Statics.field830];
            client.field515 = field842[Statics.field830 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field830 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field830--;
            return 1;
        } else if (arg0 == 3132) {
            field842[++Statics.field830 - 1] = Statics.field208;
            field842[++Statics.field830 - 1] = Statics.field1637;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field830--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field830 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field649 = 3;
            client.field764 = field842[--Statics.field830];
            return 1;
        } else if (arg0 == 3137) {
            client.field649 = 2;
            client.field764 = field842[--Statics.field830];
            return 1;
        } else if (arg0 == 3138) {
            client.field649 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field649 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field649 = 3;
            client.field764 = arg2 ? Statics.field2802.field3526 : Statics.field320.field3526;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field842[--Statics.field830] == 1;
            Statics.field2929.method2345(var28);
            return 1;
        } else if (arg0 == 3142) {
            field842[++Statics.field830 - 1] = Statics.field2929.method2315() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field842[--Statics.field830] == 1;
            client.field624 = var29;
            if (!var29) {
                Statics.field2929.method2325("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field842[++Statics.field830 - 1] = client.field624 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field842[--Statics.field830] == 1;
            Statics.field2929.method2386(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field842[++Statics.field830 - 1] = Statics.field2929.method2331() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field842[++Statics.field830 - 1] = class74.field898;
            return 1;
        } else if (arg0 == 3154) {
            field842[++Statics.field830 - 1] = client.method155();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1267--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field830 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field830--;
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field830--;
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1267--;
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field830--;
            field835[++Statics.field1267 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field830--;
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field830 -= 2;
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field830 -= 2;
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field830 -= 2;
            field835[++Statics.field1267 - 1] = "";
            field835[++Statics.field1267 - 1] = "";
            field835[++Statics.field1267 - 1] = "";
            field835[++Statics.field1267 - 1] = "";
            field835[++Statics.field1267 - 1] = "";
            field835[++Statics.field1267 - 1] = "";
            field835[++Statics.field1267 - 1] = "";
            field835[++Statics.field1267 - 1] = "";
            field835[++Statics.field1267 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field830--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field830--;
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field830--;
            return 1;
        } else if (arg0 == 3175) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1267--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1267--;
            return 1;
        } else if (arg0 == 3181) {
            client.method4031(field842[--Statics.field830]);
            return 1;
        } else if (arg0 == 3182) {
            field842[++Statics.field830 - 1] = client.method5950();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field842[--Statics.field830];
            client.method2656(var31);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ex.ah(ILcv;ZI)I")
    public static int method2631(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field830 -= 3;
            client.method5757(field842[Statics.field830], field842[Statics.field830 + 1], field842[Statics.field830 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method6060(field842[--Statics.field830]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field830 -= 2;
            client.method272(field842[Statics.field830], field842[Statics.field830 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class89 var31 = class89.field1084;
            class88 var32 = class88.field1070;
            int var33 = field842[--Statics.field830];
            if (arg0 == 3212) {
                int var34 = field842[--Statics.field830];
                var31 = (class89) class354.method5197(class89.method3471(), var34);
                if (var31 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var34));
                }
            }
            if (arg0 == 3213) {
                int var35 = field842[--Statics.field830];
                var32 = (class88) class354.method5197(class88.method2762(), var35);
                if (var32 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var35));
                }
            }
            if (arg0 == 3209) {
                int var36 = field842[--Statics.field830];
                var31 = (class89) class354.method5197(class89.method3471(), var36);
                if (var31 == null) {
                    var32 = (class88) class354.method5197(class88.method2762(), var36);
                    if (var32 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var36));
                    }
                }
            } else if (arg0 == 3181) {
                var31 = class89.field1083;
            } else if (arg0 == 3203) {
                var32 = class88.field1071;
            } else if (arg0 == 3205) {
                var32 = class88.field1077;
            } else if (arg0 == 3207) {
                var32 = class88.field1073;
            }
            if (class88.field1070 == var32) {
                switch(var31.field1080) {
                    case 1:
                        Statics.field2929.method2345(var33 == 1);
                        break;
                    case 2:
                        Statics.field2929.method2386(var33 == 1);
                        break;
                    case 3:
                        Statics.field2929.method2409(var33 == 1);
                        break;
                    case 4:
                        if (var33 < 0) {
                            var33 = 0;
                        }
                        Statics.field2929.method2321(var33);
                        break;
                    case 5:
                        client.method4031(var33);
                        break;
                    default:
                        String var37 = String.format("Unkown device option: %s.", var31.toString());
                        throw new RuntimeException(var37);
                }
            } else {
                switch(var32.field1074) {
                    case 1:
                        Statics.field2929.method2318(var33 == 1);
                        break;
                    case 2:
                        int var43 = Math.min(Math.max(var33, 0), 100);
                        int var44 = Math.round((float) (var43 * 255) / 100.0F);
                        client.method1953(var44);
                        break;
                    case 3:
                        int var41 = Math.min(Math.max(var33, 0), 100);
                        int var42 = Math.round((float) (var41 * 127) / 100.0F);
                        Statics.method1128(var42);
                        break;
                    case 4:
                        int var39 = Math.min(Math.max(var33, 0), 100);
                        int var40 = Math.round((float) (var39 * 127) / 100.0F);
                        client.method145(var40);
                        break;
                    default:
                        String var38 = String.format("Unkown game option: %s.", var32.toString());
                        throw new RuntimeException(var38);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class89 var19 = class89.field1084;
            class88 var20 = class88.field1070;
            boolean var21 = false;
            if (arg0 == 3214) {
                int var22 = field842[--Statics.field830];
                var19 = (class89) class354.method5197(class89.method3471(), var22);
                if (var19 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var22));
                }
            }
            if (arg0 == 3215) {
                int var23 = field842[--Statics.field830];
                var20 = (class88) class354.method5197(class88.method2762(), var23);
                if (var20 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var23));
                }
            }
            if (arg0 == 3210) {
                int var24 = field842[--Statics.field830];
                var19 = (class89) class354.method5197(class89.method3471(), var24);
                if (var19 == null) {
                    var20 = (class88) class354.method5197(class88.method2762(), var24);
                    if (var20 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var24));
                    }
                }
            } else if (arg0 == 3182) {
                var19 = class89.field1083;
            } else if (arg0 == 3204) {
                var20 = class88.field1071;
            } else if (arg0 == 3206) {
                var20 = class88.field1077;
            } else if (arg0 == 3208) {
                var20 = class88.field1073;
            }
            int var26;
            if (class88.field1070 == var20) {
                switch(var19.field1080) {
                    case 1:
                        var26 = Statics.field2929.method2315() ? 1 : 0;
                        break;
                    case 2:
                        var26 = Statics.field2929.method2331() ? 1 : 0;
                        break;
                    case 3:
                        var26 = Statics.field2929.method2312() ? 1 : 0;
                        break;
                    case 4:
                        var26 = Statics.field2929.method2415();
                        break;
                    case 5:
                        var26 = client.method5950();
                        break;
                    default:
                        String var25 = String.format("Unkown device option: %s.", var19.toString());
                        throw new RuntimeException(var25);
                }
            } else {
                switch(var20.field1074) {
                    case 1:
                        var26 = Statics.field2929.method2344() ? 1 : 0;
                        break;
                    case 2:
                        int var30 = Statics.field2929.method2326();
                        var26 = Math.round((float) (var30 * 100) / 255.0F);
                        break;
                    case 3:
                        int var29 = Statics.field2929.method2328();
                        var26 = Math.round((float) (var29 * 100) / 127.0F);
                        break;
                    case 4:
                        int var28 = Statics.field2929.method2349();
                        var26 = Math.round((float) (var28 * 100) / 127.0F);
                        break;
                    default:
                        String var27 = String.format("Unkown game option: %s.", var20.toString());
                        throw new RuntimeException(var27);
                }
            }
            field842[++Statics.field830 - 1] = var26;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var3 = field842[--Statics.field830];
            int var4 = 0;
            class89 var5 = (class89) class354.method5197(class89.method3471(), var3);
            if (var5 != null) {
                var4 = class89.field1084 == var5 ? 0 : 1;
            }
            field842[++Statics.field830 - 1] = var4;
            return 1;
        } else if (arg0 == 3218) {
            int var6 = field842[--Statics.field830];
            int var7 = 0;
            class88 var8 = (class88) class354.method5197(class88.method2762(), var6);
            if (var8 != null) {
                var7 = class88.field1070 == var8 ? 0 : 1;
            }
            field842[++Statics.field830 - 1] = var7;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class89 var9 = class89.field1084;
            class88 var10 = class88.field1070;
            boolean var11 = true;
            boolean var12 = true;
            if (arg0 == 3217) {
                int var13 = field842[--Statics.field830];
                var9 = (class89) class354.method5197(class89.method3471(), var13);
                if (var9 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var13));
                }
            }
            if (arg0 == 3219) {
                int var14 = field842[--Statics.field830];
                var10 = (class88) class354.method5197(class88.method2762(), var14);
                if (var10 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var14));
                }
            }
            byte var16;
            int var17;
            if (class88.field1070 == var10) {
                switch(var9.field1080) {
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
                switch(var10.field1074) {
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
            field842[++Statics.field830 - 1] = var16;
            field842[++Statics.field830 - 1] = var17;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("di.ad(ILcv;ZB)I")
    public static int method2539(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field842[++Statics.field830 - 1] = client.field494;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field830 -= 2;
            int var3 = field842[Statics.field830];
            int var4 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = class83.method2120(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field830 -= 2;
            int var5 = field842[Statics.field830];
            int var6 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = class83.method2884(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field830 -= 2;
            int var7 = field842[Statics.field830];
            int var8 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = class83.method4413(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class183.method2156(var9).field1884;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field619[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field620[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field621[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1812;
            int var14 = (Statics.field1440.field1200 >> 7) + Statics.field218;
            int var15 = (Statics.field1440.field1205 >> 7) + Statics.field1865;
            field842[++Statics.field830 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field842[++Statics.field830 - 1] = client.field485 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field830 -= 2;
            int var19 = field842[Statics.field830] + 32768;
            int var20 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = class83.method2120(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field830 -= 2;
            int var21 = field842[Statics.field830] + 32768;
            int var22 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = class83.method2884(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field830 -= 2;
            int var23 = field842[Statics.field830] + 32768;
            int var24 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = class83.method4413(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field655 >= 2) {
                field842[++Statics.field830 - 1] = client.field655;
            } else {
                field842[++Statics.field830 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field842[++Statics.field830 - 1] = client.field541;
            return 1;
        } else if (arg0 == 3318) {
            field842[++Statics.field830 - 1] = client.field482;
            return 1;
        } else if (arg0 == 3321) {
            field842[++Statics.field830 - 1] = client.field653 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field842[++Statics.field830 - 1] = client.field654;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field657) {
                field842[++Statics.field830 - 1] = 1;
            } else {
                field842[++Statics.field830 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field842[++Statics.field830 - 1] = client.field542;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field830 -= 4;
            int var25 = field842[Statics.field830];
            int var26 = field842[Statics.field830 + 1];
            int var27 = field842[Statics.field830 + 2];
            int var28 = field842[Statics.field830 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field842[++Statics.field830 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field842[++Statics.field830 - 1] = client.field516;
            return 1;
        } else if (arg0 == 3327) {
            field842[++Statics.field830 - 1] = client.field497;
            return 1;
        } else if (arg0 == 3331) {
            field842[++Statics.field830 - 1] = client.field653;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kn.bm(ILcv;ZI)I")
    public static int method4881(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field830 -= 2;
            int var3 = field842[Statics.field830];
            int var4 = field842[Statics.field830 + 1];
            class190 var5 = class190.method2892(var3);
            if (var5.field1972 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1969; var6++) {
                if (var5.field1974[var6] == var4) {
                    field835[++Statics.field1267 - 1] = var5.field1970[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field835[++Statics.field1267 - 1] = var5.field1975;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field830 -= 4;
            int var7 = field842[Statics.field830];
            int var8 = field842[Statics.field830 + 1];
            int var9 = field842[Statics.field830 + 2];
            int var10 = field842[Statics.field830 + 3];
            class190 var11 = class190.method2892(var9);
            if (var11.field1965 != var7 || var11.field1972 != var8) {
                if (var8 == 115) {
                    field835[++Statics.field1267 - 1] = class333.field3824;
                } else {
                    field842[++Statics.field830 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1969; var12++) {
                if (var11.field1974[var12] == var10) {
                    if (var8 == 115) {
                        field835[++Statics.field1267 - 1] = var11.field1970[var12];
                    } else {
                        field842[++Statics.field830 - 1] = var11.field1971[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field835[++Statics.field1267 - 1] = var11.field1975;
                } else {
                    field842[++Statics.field830 - 1] = var11.field1968;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field842[--Statics.field830];
            class190 var14 = class190.method2892(var13);
            field842[++Statics.field830 - 1] = var14.method3342();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.bv(ILcv;ZS)I")
    public static int method1959(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field713.method3741(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field713.method3746(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field713.method3743(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eg.bo(ILcv;ZI)I")
    public static int method2742(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field16.field800 == 0) {
                field842[++Statics.field830 - 1] = -2;
            } else if (Statics.field16.field800 == 1) {
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = Statics.field16.field798.method6951();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field842[--Statics.field830];
            if (Statics.field16.method1794() && var3 >= 0 && var3 < Statics.field16.field798.method6951()) {
                class401 var4 = (class401) Statics.field16.field798.method6988(var3);
                field835[++Statics.field1267 - 1] = var4.method6922();
                field835[++Statics.field1267 - 1] = var4.method6923();
            } else {
                field835[++Statics.field1267 - 1] = "";
                field835[++Statics.field1267 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field842[--Statics.field830];
            if (Statics.field16.method1794() && var5 >= 0 && var5 < Statics.field16.field798.method6951()) {
                field842[++Statics.field830 - 1] = ((class408) Statics.field16.field798.method6988(var5)).field4533;
            } else {
                field842[++Statics.field830 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field842[--Statics.field830];
            if (Statics.field16.method1794() && var6 >= 0 && var6 < Statics.field16.field798.method6951()) {
                field842[++Statics.field830 - 1] = ((class408) Statics.field16.field798.method6988(var6)).field4532;
            } else {
                field842[++Statics.field830 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field835[--Statics.field1267];
            int var8 = field842[--Statics.field830];
            class66.method3446(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field835[--Statics.field1267];
            Statics.field16.method1747(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field835[--Statics.field1267];
            Statics.field16.method1751(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field835[--Statics.field1267];
            Statics.field16.method1749(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field835[--Statics.field1267];
            boolean var13 = true;
            Statics.field16.method1802(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field835[--Statics.field1267];
            String var15 = client.method3662(var14);
            field842[++Statics.field830 - 1] = Statics.field16.method1765(new class501(var15, Statics.field2619), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field251 == null) {
                field835[++Statics.field1267 - 1] = "";
            } else {
                field835[++Statics.field1267 - 1] = Statics.field251.field4504;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field251 == null) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = Statics.field251.method6951();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field842[--Statics.field830];
            if (Statics.field251 == null || var16 >= Statics.field251.method6951()) {
                field835[++Statics.field1267 - 1] = "";
            } else {
                field835[++Statics.field1267 - 1] = Statics.field251.method6988(var16).method6921().method8490();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field842[--Statics.field830];
            if (Statics.field251 == null || var17 >= Statics.field251.method6951()) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = ((class408) Statics.field251.method6988(var17)).method7027();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field842[--Statics.field830];
            if (Statics.field251 == null || var18 >= Statics.field251.method6951()) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = ((class408) Statics.field251.method6988(var18)).field4532;
            }
            return 1;
        } else if (arg0 == 3616) {
            field842[++Statics.field830 - 1] = Statics.field251 == null ? 0 : Statics.field251.field4507;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field835[--Statics.field1267];
            client.method823(var19);
            return 1;
        } else if (arg0 == 3618) {
            field842[++Statics.field830 - 1] = Statics.field251 == null ? 0 : Statics.field251.field4501;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field835[--Statics.field1267];
            client.method1962(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method2947();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field16.method1794()) {
                field842[++Statics.field830 - 1] = Statics.field16.field799.method6951();
            } else {
                field842[++Statics.field830 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field842[--Statics.field830];
            if (Statics.field16.method1794() && var21 >= 0 && var21 < Statics.field16.field799.method6951()) {
                class407 var22 = (class407) Statics.field16.field799.method6988(var21);
                field835[++Statics.field1267 - 1] = var22.method6922();
                field835[++Statics.field1267 - 1] = var22.method6923();
            } else {
                field835[++Statics.field1267 - 1] = "";
                field835[++Statics.field1267 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field835[--Statics.field1267];
            String var24 = client.method3662(var23);
            field842[++Statics.field830 - 1] = Statics.field16.method1780(new class501(var24, Statics.field2619)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field842[--Statics.field830];
            if (Statics.field251 == null || var25 >= Statics.field251.method6951() || !Statics.field251.method6988(var25).method6921().equals(Statics.field1440.field1104)) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field251 == null || Statics.field251.field4505 == null) {
                field835[++Statics.field1267 - 1] = "";
            } else {
                field835[++Statics.field1267 - 1] = Statics.field251.field4505;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field842[--Statics.field830];
            if (Statics.field251 == null || var26 >= Statics.field251.method6951() || !((class403) Statics.field251.method6988(var26)).method6910()) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field842[--Statics.field830];
            if (Statics.field251 == null || var27 >= Statics.field251.method6951() || !((class403) Statics.field251.method6988(var27)).method6903()) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field16.field798.method6969();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field842[--Statics.field830] == 1;
            Statics.field16.field798.method6972(new class484(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field842[--Statics.field830] == 1;
            Statics.field16.field798.method6972(new class485(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field842[--Statics.field830] == 1;
            Statics.field16.field798.method6972(new class117(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field842[--Statics.field830] == 1;
            Statics.field16.field798.method6972(new class113(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field842[--Statics.field830] == 1;
            Statics.field16.field798.method6972(new class116(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field842[--Statics.field830] == 1;
            Statics.field16.field798.method6972(new class121(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field842[--Statics.field830] == 1;
            Statics.field16.field798.method6972(new class115(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field842[--Statics.field830] == 1;
            Statics.field16.field798.method6972(new class114(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field842[--Statics.field830] == 1;
            Statics.field16.field798.method6972(new class118(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field842[--Statics.field830] == 1;
            Statics.field16.field798.method6972(new class119(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field16.field798.method6962();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field16.field799.method6969();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field842[--Statics.field830] == 1;
            Statics.field16.field799.method6972(new class484(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field842[--Statics.field830] == 1;
            Statics.field16.field799.method6972(new class485(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field16.field799.method6962();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field251 != null) {
                Statics.field251.method6969();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field842[--Statics.field830] == 1;
            if (Statics.field251 != null) {
                Statics.field251.method6972(new class484(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field842[--Statics.field830] == 1;
            if (Statics.field251 != null) {
                Statics.field251.method6972(new class485(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field842[--Statics.field830] == 1;
            if (Statics.field251 != null) {
                Statics.field251.method6972(new class117(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field842[--Statics.field830] == 1;
            if (Statics.field251 != null) {
                Statics.field251.method6972(new class113(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field842[--Statics.field830] == 1;
            if (Statics.field251 != null) {
                Statics.field251.method6972(new class116(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field842[--Statics.field830] == 1;
            if (Statics.field251 != null) {
                Statics.field251.method6972(new class121(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field842[--Statics.field830] == 1;
            if (Statics.field251 != null) {
                Statics.field251.method6972(new class115(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field842[--Statics.field830] == 1;
            if (Statics.field251 != null) {
                Statics.field251.method6972(new class114(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field842[--Statics.field830] == 1;
            if (Statics.field251 != null) {
                Statics.field251.method6972(new class118(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field842[--Statics.field830] == 1;
            if (Statics.field251 != null) {
                Statics.field251.method6972(new class119(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field251 != null) {
                Statics.field251.method6962();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field842[--Statics.field830] == 1;
            Statics.field16.field798.method6972(new class120(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field842[--Statics.field830] == 1;
            if (Statics.field251 != null) {
                Statics.field251.method6972(new class120(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kh.bs(ILcv;ZB)I")
    public static int method4883(int arg0, class77 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("bq.bg(ILcv;ZB)I")
    public static int method673(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field3016 == null) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = 1;
                Statics.field4339 = Statics.field3016;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field842[--Statics.field830];
            if (client.field775[var3] == null) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = 1;
                Statics.field4339 = client.field775[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field835[++Statics.field1267 - 1] = Statics.field4339.field1690;
            return 1;
        } else if (arg0 == 3803) {
            field842[++Statics.field830 - 1] = Statics.field4339.field1692 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field842[++Statics.field830 - 1] = Statics.field4339.field1693;
            return 1;
        } else if (arg0 == 3805) {
            field842[++Statics.field830 - 1] = Statics.field4339.field1698;
            return 1;
        } else if (arg0 == 3806) {
            field842[++Statics.field830 - 1] = Statics.field4339.field1695;
            return 1;
        } else if (arg0 == 3807) {
            field842[++Statics.field830 - 1] = Statics.field4339.field1696;
            return 1;
        } else if (arg0 == 3809) {
            field842[++Statics.field830 - 1] = Statics.field4339.field1697;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field842[--Statics.field830];
            field835[++Statics.field1267 - 1] = Statics.field4339.field1708[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = Statics.field4339.field1709[var5];
            return 1;
        } else if (arg0 == 3812) {
            field842[++Statics.field830 - 1] = Statics.field4339.field1685;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field842[--Statics.field830];
            field835[++Statics.field1267 - 1] = Statics.field4339.field1689[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field830 -= 3;
            int var7 = field842[Statics.field830];
            int var8 = field842[Statics.field830 + 1];
            int var9 = field842[Statics.field830 + 2];
            field842[++Statics.field830 - 1] = Statics.field4339.method2979(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field842[++Statics.field830 - 1] = Statics.field4339.field1686;
            return 1;
        } else if (arg0 == 3816) {
            field842[++Statics.field830 - 1] = Statics.field4339.field1705;
            return 1;
        } else if (arg0 == 3817) {
            field842[++Statics.field830 - 1] = Statics.field4339.method3038(field835[--Statics.field1267]);
            return 1;
        } else if (arg0 == 3818) {
            field842[Statics.field830 - 1] = Statics.field4339.method3003()[field842[Statics.field830 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field830 -= 2;
            int var10 = field842[Statics.field830];
            int var11 = field842[Statics.field830 + 1];
            Statics.method3478(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = Statics.field4339.field1702[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field830 -= 3;
                int var13 = field842[Statics.field830];
                boolean var14 = field842[Statics.field830 + 1] == 1;
                int var15 = field842[Statics.field830 + 2];
                client.method4541(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field842[--Statics.field830];
                field842[++Statics.field830 - 1] = Statics.field4339.field1703[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field104 == null) {
                    field842[++Statics.field830 - 1] = 0;
                } else {
                    field842[++Statics.field830 - 1] = 1;
                    Statics.field108 = Statics.field104;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field842[--Statics.field830];
                if (client.field658[var17] == null) {
                    field842[++Statics.field830 - 1] = 0;
                } else {
                    field842[++Statics.field830 - 1] = 1;
                    Statics.field108 = client.field658[var17];
                    Statics.field2303 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field835[++Statics.field1267 - 1] = Statics.field108.field1760;
                return 1;
            } else if (arg0 == 3853) {
                field842[++Statics.field830 - 1] = Statics.field108.field1762;
                return 1;
            } else if (arg0 == 3854) {
                field842[++Statics.field830 - 1] = Statics.field108.field1759;
                return 1;
            } else if (arg0 == 3855) {
                field842[++Statics.field830 - 1] = Statics.field108.method3069();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field842[--Statics.field830];
                field835[++Statics.field1267 - 1] = ((class143) Statics.field108.field1757.get(var18)).field1622.method8490();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field842[--Statics.field830];
                field842[++Statics.field830 - 1] = ((class143) Statics.field108.field1757.get(var19)).field1624;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field842[--Statics.field830];
                field842[++Statics.field830 - 1] = ((class143) Statics.field108.field1757.get(var20)).field1623;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field842[--Statics.field830];
                client.method285(Statics.field2303, var21);
                return 1;
            } else if (arg0 == 3860) {
                field842[++Statics.field830 - 1] = Statics.field108.method3077(field835[--Statics.field1267]);
                return 1;
            } else if (arg0 == 3861) {
                field842[Statics.field830 - 1] = Statics.field108.method3066()[field842[Statics.field830 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field842[++Statics.field830 - 1] = Statics.field1959 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("cp.bh(ILcv;ZB)I")
    public static int method2013(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field761[var3].method5994();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field761[var4].field4265;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field761[var5].field4263;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field761[var6].field4264;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field761[var7].field4262;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.field761[var8].field4266;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field842[--Statics.field830];
            int var10 = client.field761[var9].method5993();
            field842[++Statics.field830 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field842[--Statics.field830];
            int var12 = client.field761[var11].method5993();
            field842[++Statics.field830 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field842[--Statics.field830];
            int var14 = client.field761[var13].method5993();
            field842[++Statics.field830 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field842[--Statics.field830];
            int var16 = client.field761[var15].method5993();
            field842[++Statics.field830 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field842[--Statics.field830] == 1;
            if (Statics.field954 != null) {
                Statics.field954.method5952(class342.field4229, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field842[--Statics.field830] == 1;
            if (Statics.field954 != null) {
                Statics.field954.method5952(class342.field4234, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field830 -= 2;
            boolean var19 = field842[Statics.field830] == 1;
            boolean var20 = field842[Statics.field830 + 1] == 1;
            if (Statics.field954 != null) {
                client.field762.field477 = var20;
                Statics.field954.method5952(client.field762, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field842[--Statics.field830] == 1;
            if (Statics.field954 != null) {
                Statics.field954.method5952(class342.field4227, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field842[--Statics.field830] == 1;
            if (Statics.field954 != null) {
                Statics.field954.method5952(class342.field4226, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field842[++Statics.field830 - 1] = Statics.field954 == null ? 0 : Statics.field954.field4231.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field842[--Statics.field830];
            class348 var24 = (class348) Statics.field954.field4231.get(var23);
            field842[++Statics.field830 - 1] = var24.field4258;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field842[--Statics.field830];
            class348 var26 = (class348) Statics.field954.field4231.get(var25);
            field835[++Statics.field1267 - 1] = var26.method5982();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field842[--Statics.field830];
            class348 var28 = (class348) Statics.field954.field4231.get(var27);
            field835[++Statics.field1267 - 1] = var28.method5983();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field842[--Statics.field830];
            class348 var30 = (class348) Statics.field954.field4231.get(var29);
            long var31 = class290.method4466() - Statics.field4255 - var30.field4257;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field835[++Statics.field1267 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field842[--Statics.field830];
            class348 var38 = (class348) Statics.field954.field4231.get(var37);
            field842[++Statics.field830 - 1] = var38.field4256.field4264;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field842[--Statics.field830];
            class348 var40 = (class348) Statics.field954.field4231.get(var39);
            field842[++Statics.field830 - 1] = var40.field4256.field4263;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field842[--Statics.field830];
            class348 var42 = (class348) Statics.field954.field4231.get(var41);
            field842[++Statics.field830 - 1] = var42.field4256.field4265;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cd.bl(ILcv;ZI)I")
    public static int method1079(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field830 -= 2;
            int var3 = field842[Statics.field830];
            int var4 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field830 -= 2;
            int var5 = field842[Statics.field830];
            int var6 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field830 -= 2;
            int var7 = field842[Statics.field830];
            int var8 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field830 -= 2;
            int var9 = field842[Statics.field830];
            int var10 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field830 -= 5;
            int var13 = field842[Statics.field830];
            int var14 = field842[Statics.field830 + 1];
            int var15 = field842[Statics.field830 + 2];
            int var16 = field842[Statics.field830 + 3];
            int var17 = field842[Statics.field830 + 4];
            field842[++Statics.field830 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field830 -= 2;
            int var18 = field842[Statics.field830];
            int var19 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field830 -= 2;
            int var20 = field842[Statics.field830];
            int var21 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field830 -= 2;
            int var22 = field842[Statics.field830];
            int var23 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field830 -= 2;
            int var24 = field842[Statics.field830];
            int var25 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field830 -= 2;
            int var26 = field842[Statics.field830];
            int var27 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field830 -= 2;
            int var28 = field842[Statics.field830];
            int var29 = field842[Statics.field830 + 1];
            if (var28 == 0) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field830 -= 2;
            int var30 = field842[Statics.field830];
            int var31 = field842[Statics.field830 + 1];
            if (var30 == 0) {
                field842[++Statics.field830 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field842[++Statics.field830 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field842[++Statics.field830 - 1] = var30;
                    break;
                case 2:
                    field842[++Statics.field830 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field842[++Statics.field830 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field842[++Statics.field830 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field842[++Statics.field830 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field830 -= 2;
            int var32 = field842[Statics.field830];
            int var33 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field830 -= 2;
            int var34 = field842[Statics.field830];
            int var35 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field830 -= 2;
            int var36 = field842[Statics.field830];
            int var37 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field830 -= 2;
            int var38 = field842[Statics.field830];
            int var39 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field830 -= 3;
            long var40 = (long) field842[Statics.field830];
            long var42 = (long) field842[Statics.field830 + 1];
            long var44 = (long) field842[Statics.field830 + 2];
            field842[++Statics.field830 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class292.method4963(field842[--Statics.field830]);
            field842[++Statics.field830 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field830 -= 2;
            int var47 = field842[Statics.field830];
            int var48 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field830 -= 3;
            int var49 = field842[Statics.field830];
            int var50 = field842[Statics.field830 + 1];
            int var51 = field842[Statics.field830 + 2];
            field842[++Statics.field830 - 1] = class292.method5784(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field830 -= 3;
            int var52 = field842[Statics.field830];
            int var53 = field842[Statics.field830 + 1];
            int var54 = field842[Statics.field830 + 2];
            field842[++Statics.field830 - 1] = Statics.method2715(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field830 -= 3;
            int var55 = field842[Statics.field830];
            int var56 = field842[Statics.field830 + 1];
            int var57 = field842[Statics.field830 + 2];
            int var58 = 31 - var57;
            field842[++Statics.field830 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field830 -= 4;
            int var59 = field842[Statics.field830];
            int var60 = field842[Statics.field830 + 1];
            int var61 = field842[Statics.field830 + 2];
            int var62 = field842[Statics.field830 + 3];
            int var63 = Statics.method2715(var59, var61, var62);
            int var64 = class292.method3737(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field842[++Statics.field830 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field842[Statics.field830 - 1] = class436.method3692(field842[Statics.field830 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field842[Statics.field830 - 1] = class436.method2500(field842[Statics.field830 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field830 -= 2;
            int var65 = field842[Statics.field830];
            int var66 = field842[Statics.field830 + 1];
            int var67 = class436.method4573(var65, var66);
            field842[++Statics.field830 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field842[Statics.field830 - 1] = Math.abs(field842[Statics.field830 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field835[--Statics.field1267];
            int var69 = -1;
            if (class368.method3084(var68)) {
                var69 = class368.method5989(var68);
            }
            field842[++Statics.field830 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nu.bk(ILcv;ZI)I")
    public static int method6052(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field835[--Statics.field1267];
            int var4 = field842[--Statics.field830];
            field835[++Statics.field1267 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1267 -= 2;
            String var5 = field835[Statics.field1267];
            String var6 = field835[Statics.field1267 + 1];
            field835[++Statics.field1267 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field835[--Statics.field1267];
            int var8 = field842[--Statics.field830];
            field835[++Statics.field1267 - 1] = var7 + class368.method6806(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field835[--Statics.field1267];
            field835[++Statics.field1267 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field842[--Statics.field830];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field844.setTime(new Date(var11));
            int var13 = field844.get(5);
            int var14 = field844.get(2);
            int var15 = field844.get(1);
            field835[++Statics.field1267 - 1] = var13 + "-" + field831[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1267 -= 2;
            String var16 = field835[Statics.field1267];
            String var17 = field835[Statics.field1267 + 1];
            if (Statics.field1440.field1086 == null || Statics.field1440.field1086.field3465 == 0) {
                field835[++Statics.field1267 - 1] = var16;
            } else {
                field835[++Statics.field1267 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field842[--Statics.field830];
            field835[++Statics.field1267 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1267 -= 2;
            field842[++Statics.field830 - 1] = class368.method3798(class369.method3324(field835[Statics.field1267], field835[Statics.field1267 + 1], Statics.field860));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field835[--Statics.field1267];
            Statics.field830 -= 2;
            int var20 = field842[Statics.field830];
            int var21 = field842[Statics.field830 + 1];
            byte[] var22 = Statics.field2621.method5860(var21, 0);
            class375 var23 = new class375(var22);
            field842[++Statics.field830 - 1] = var23.method6622(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field835[--Statics.field1267];
            Statics.field830 -= 2;
            int var25 = field842[Statics.field830];
            int var26 = field842[Statics.field830 + 1];
            byte[] var27 = Statics.field2621.method5860(var26, 0);
            class375 var28 = new class375(var27);
            field842[++Statics.field830 - 1] = var28.method6553(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1267 -= 2;
            String var29 = field835[Statics.field1267];
            String var30 = field835[Statics.field1267 + 1];
            if (field842[--Statics.field830] == 1) {
                field835[++Statics.field1267 - 1] = var29;
            } else {
                field835[++Statics.field1267 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field835[--Statics.field1267];
            field835[++Statics.field1267 - 1] = class379.method6555(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field835[--Statics.field1267];
            int var33 = field842[--Statics.field830];
            field835[++Statics.field1267 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class368.method5166((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class368.method5261((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class368.method5791((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class368.method421((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field835[--Statics.field1267];
            if (var38 == null) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field835[--Statics.field1267];
            Statics.field830 -= 2;
            int var40 = field842[Statics.field830];
            int var41 = field842[Statics.field830 + 1];
            field835[++Statics.field1267 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field835[--Statics.field1267];
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
            field835[++Statics.field1267 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field835[--Statics.field1267];
            int var48 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1267 -= 2;
            String var49 = field835[Statics.field1267];
            String var50 = field835[Statics.field1267 + 1];
            int var51 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field835[--Statics.field1267];
            field835[++Statics.field1267 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field1267 -= 3;
            String var53 = field835[Statics.field1267];
            String var54 = field835[Statics.field1267 + 1];
            String var55 = field835[Statics.field1267 + 2];
            if (Statics.field1440.field1086 == null) {
                field835[++Statics.field1267 - 1] = var55;
                return 1;
            }
            switch(Statics.field1440.field1086.field3462) {
                case 0:
                    field835[++Statics.field1267 - 1] = var53;
                    break;
                case 1:
                    field835[++Statics.field1267 - 1] = var54;
                    break;
                case 2:
                default:
                    field835[++Statics.field1267 - 1] = var55;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ij.br(ILcv;ZI)I")
    public static int method3808(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field842[--Statics.field830];
            field835[++Statics.field1267 - 1] = class204.method3453(var3).field2185;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field830 -= 2;
            int var4 = field842[Statics.field830];
            int var5 = field842[Statics.field830 + 1];
            class204 var6 = class204.method3453(var4);
            if (var5 < 1 || var5 > 5 || var6.field2202[var5 - 1] == null) {
                field835[++Statics.field1267 - 1] = "";
            } else {
                field835[++Statics.field1267 - 1] = var6.field2202[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field830 -= 2;
            int var7 = field842[Statics.field830];
            int var8 = field842[Statics.field830 + 1];
            class204 var9 = class204.method3453(var7);
            if (var8 < 1 || var8 > 5 || var9.field2203[var8 - 1] == null) {
                field835[++Statics.field1267 - 1] = "";
            } else {
                field835[++Statics.field1267 - 1] = var9.field2203[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class204.method3453(var10).field2197;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class204.method3453(var11).field2196 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field842[--Statics.field830];
            class204 var13 = class204.method3453(var12);
            if (var13.field2221 == -1 && var13.field2183 >= 0) {
                field842[++Statics.field830 - 1] = var13.field2183;
            } else {
                field842[++Statics.field830 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field842[--Statics.field830];
            class204 var15 = class204.method3453(var14);
            if (var15.field2221 >= 0 && var15.field2183 >= 0) {
                field842[++Statics.field830 - 1] = var15.field2183;
            } else {
                field842[++Statics.field830 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class204.method3453(var16).field2201 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field842[--Statics.field830];
            class204 var18 = class204.method3453(var17);
            if (var18.field2234 == -1 && var18.field2233 >= 0) {
                field842[++Statics.field830 - 1] = var18.field2233;
            } else {
                field842[++Statics.field830 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field842[--Statics.field830];
            class204 var20 = class204.method3453(var19);
            if (var20.field2234 >= 0 && var20.field2233 >= 0) {
                field842[++Statics.field830 - 1] = var20.field2233;
            } else {
                field842[++Statics.field830 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field835[--Statics.field1267];
            int var22 = field842[--Statics.field830];
            client.method2245(var21, var22 == 1);
            field842[++Statics.field830 - 1] = Statics.field3745;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field4233 == null || Statics.field1833 >= Statics.field3745) {
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = Statics.field4233[++Statics.field1833 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field1833 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field842[--Statics.field830];
            int var24 = class204.method3453(var23).method3619();
            if (var24 == -1) {
                field842[++Statics.field830 - 1] = var24;
            } else {
                field842[++Statics.field830 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class204.method3453(var25).field2198;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class204.method3453(var26).field2178;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class204.method3453(var27).field2214;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field842[--Statics.field830];
            class204 var29 = class204.method3453(var28);
            field842[++Statics.field830 - 1] = var29.field2228;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bp.ba(ILcv;ZB)I")
    public static int method804(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field842[++Statics.field830 - 1] = client.field694;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field830 -= 3;
            client.field694 = field842[Statics.field830];
            Statics.field2288 = class497.method3230(field842[Statics.field830 + 1]);
            if (Statics.field2288 == null) {
                Statics.field2288 = class497.field5041;
            }
            client.field639 = field842[Statics.field830 + 2];
            class285 var3 = class285.method2741(class283.field3086, client.field734.field1380);
            var3.field3169.method7886(client.field694);
            var3.field3169.method7886(Statics.field2288.field5039);
            var3.field3169.method7886(client.field639);
            client.field734.method2635(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field835[--Statics.field1267];
            Statics.field830 -= 2;
            int var5 = field842[Statics.field830];
            int var6 = field842[Statics.field830 + 1];
            class285 var7 = class285.method2741(class283.field3140, client.field734.field1380);
            var7.field3169.method7886(class478.method4789(var4) + 2);
            var7.field3169.method7893(var4);
            var7.field3169.method7886(var5 - 1);
            var7.field3169.method7886(var6);
            client.field734.method2635(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field830 -= 2;
            int var8 = field842[Statics.field830];
            int var9 = field842[Statics.field830 + 1];
            class62 var10 = class108.method3182(var8, var9);
            if (var10 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
                field835[++Statics.field1267 - 1] = "";
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = var10.field463;
                field842[++Statics.field830 - 1] = var10.field458;
                field835[++Statics.field1267 - 1] = var10.field460 == null ? "" : var10.field460;
                field835[++Statics.field1267 - 1] = var10.field462 == null ? "" : var10.field462;
                field835[++Statics.field1267 - 1] = var10.field465 == null ? "" : var10.field465;
                field842[++Statics.field830 - 1] = var10.method1092() ? 1 : (var10.method1102() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field842[--Statics.field830];
            class62 var12 = class108.method3766(var11);
            if (var12 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
                field835[++Statics.field1267 - 1] = "";
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = var12.field459;
                field842[++Statics.field830 - 1] = var12.field458;
                field835[++Statics.field1267 - 1] = var12.field460 == null ? "" : var12.field460;
                field835[++Statics.field1267 - 1] = var12.field462 == null ? "" : var12.field462;
                field835[++Statics.field1267 - 1] = var12.field465 == null ? "" : var12.field465;
                field842[++Statics.field830 - 1] = var12.method1092() ? 1 : (var12.method1102() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2288 == null) {
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = Statics.field2288.field5039;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field835[--Statics.field1267];
            int var14 = field842[--Statics.field830];
            class285 var15 = class502.method2753(var14, var13, Statics.field860, -1);
            client.field734.method2635(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1267 -= 2;
            String var16 = field835[Statics.field1267];
            String var17 = field835[Statics.field1267 + 1];
            class285 var18 = class285.method2741(class283.field3144, client.field734.field1380);
            var18.field3169.method7887(0);
            int var19 = var18.field3169.field4904;
            var18.field3169.method7893(var16);
            class316.method3065(var18.field3169, var17);
            var18.field3169.method7899(var18.field3169.field4904 - var19);
            client.field734.method2635(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field835[--Statics.field1267];
            Statics.field830 -= 2;
            int var21 = field842[Statics.field830];
            int var22 = field842[Statics.field830 + 1];
            class285 var23 = class502.method2753(var21, var20, Statics.field860, var22);
            client.field734.method2635(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field1440 == null || Statics.field1440.field1104 == null) {
                var24 = "";
            } else {
                var24 = Statics.field1440.field1104.method8490();
            }
            field835[++Statics.field1267 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field842[++Statics.field830 - 1] = client.field639;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class108.method2127(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class108.method8(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = class108.method5778(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field835[--Statics.field1267];
            client.method2763(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field638 = field835[--Statics.field1267].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field835[++Statics.field1267 - 1] = client.field638;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field835[--Statics.field1267];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field830 -= 2;
            int var30 = field842[Statics.field830];
            int var31 = field842[Statics.field830 + 1];
            class62 var32 = class108.method3182(var30, var31);
            if (var32 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
                field835[++Statics.field1267 - 1] = "";
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = var32.field463;
                field842[++Statics.field830 - 1] = var32.field458;
                field835[++Statics.field1267 - 1] = var32.field460 == null ? "" : var32.field460;
                field835[++Statics.field1267 - 1] = var32.field462 == null ? "" : var32.field462;
                field835[++Statics.field1267 - 1] = var32.field465 == null ? "" : var32.field465;
                field842[++Statics.field830 - 1] = var32.method1092() ? 1 : (var32.method1102() ? 2 : 0);
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field842[--Statics.field830];
            class62 var34 = class108.method3766(var33);
            if (var34 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
                field835[++Statics.field1267 - 1] = "";
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = var34.field459;
                field842[++Statics.field830 - 1] = var34.field458;
                field835[++Statics.field1267 - 1] = var34.field460 == null ? "" : var34.field460;
                field835[++Statics.field1267 - 1] = var34.field462 == null ? "" : var34.field462;
                field835[++Statics.field1267 - 1] = var34.field465 == null ? "" : var34.field465;
                field842[++Statics.field830 - 1] = var34.method1092() ? 1 : (var34.method1102() ? 2 : 0);
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cx.bz(ILcv;ZB)I")
    public static int method1945(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field842[++Statics.field830 - 1] = client.method48();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field842[--Statics.field830];
            if (var3 == 1 || var3 == 2) {
                client.method2496(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field842[++Statics.field830 - 1] = Statics.field2929.method2336();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field842[--Statics.field830];
            if (var4 == 1 || var4 == 2) {
                Statics.field2929.method2396(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field830--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ei.bq(ILcv;ZB)I")
    public static int method2560(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field830 -= 2;
            int var3 = field842[Statics.field830];
            int var4 = field842[Statics.field830 + 1];
            if (!client.field737) {
                client.field563 = var3;
                client.field564 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field842[++Statics.field830 - 1] = client.field563;
            return 1;
        } else if (arg0 == 5506) {
            field842[++Statics.field830 - 1] = client.field564;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field842[--Statics.field830];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field650 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field842[++Statics.field830 - 1] = client.field650;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fb.bc(ILcv;ZI)I")
    public static int method2940(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field675 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dn.bt(IB)I")
    public static int method2536(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("dd.be(II)I")
    public static int method2177(int arg0) {
        return (int) ((Math.log((double) arg0) / field840 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("jk.bu(ILcv;ZI)I")
    public static int method4442(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field830 -= 2;
            client.field545 = (short) method2536(field842[Statics.field830]);
            if (client.field545 <= 0) {
                client.field545 = 256;
            }
            client.field745 = (short) method2536(field842[Statics.field830 + 1]);
            if (client.field745 <= 0) {
                client.field745 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field830 -= 2;
            client.field583 = (short) field842[Statics.field830];
            if (client.field583 <= 0) {
                client.field583 = 256;
            }
            client.field747 = (short) field842[Statics.field830 + 1];
            if (client.field747 <= 0) {
                client.field747 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field830 -= 4;
            client.field748 = (short) field842[Statics.field830];
            if (client.field748 <= 0) {
                client.field748 = 1;
            }
            client.field749 = (short) field842[Statics.field830 + 1];
            if (client.field749 <= 0) {
                client.field749 = 32767;
            } else if (client.field749 < client.field748) {
                client.field749 = client.field748;
            }
            client.field750 = (short) field842[Statics.field830 + 2];
            if (client.field750 <= 0) {
                client.field750 = 1;
            }
            client.field751 = (short) field842[Statics.field830 + 3];
            if (client.field751 <= 0) {
                client.field751 = 32767;
            } else if (client.field751 < client.field750) {
                client.field751 = client.field750;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field773 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = -1;
            } else {
                client.method6073(0, 0, client.field773.field3541, client.field773.field3516, false);
                field842[++Statics.field830 - 1] = client.field754;
                field842[++Statics.field830 - 1] = client.field755;
            }
            return 1;
        } else if (arg0 == 6204) {
            field842[++Statics.field830 - 1] = client.field583;
            field842[++Statics.field830 - 1] = client.field747;
            return 1;
        } else if (arg0 == 6205) {
            field842[++Statics.field830 - 1] = method2177(client.field545);
            field842[++Statics.field830 - 1] = method2177(client.field745);
            return 1;
        } else if (arg0 == 6220) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field842[++Statics.field830 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field842[++Statics.field830 - 1] = Statics.field208;
            return 1;
        } else if (arg0 == 6223) {
            field842[++Statics.field830 - 1] = Statics.field1637;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.bd(ILcv;ZI)I")
    public static int method1239(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field842[++Statics.field830 - 1] = class65.method6855() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class65 var3 = class65.method7566();
            if (var3 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
            } else {
                field842[++Statics.field830 - 1] = var3.field785;
                field842[++Statics.field830 - 1] = var3.field778;
                field835[++Statics.field1267 - 1] = var3.field789;
                field842[++Statics.field830 - 1] = var3.field790;
                field842[++Statics.field830 - 1] = var3.field787;
                field835[++Statics.field1267 - 1] = var3.field788;
            }
            return 1;
        } else if (arg0 == 6502) {
            class65 var4 = class65.method7757();
            if (var4 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
            } else {
                field842[++Statics.field830 - 1] = var4.field785;
                field842[++Statics.field830 - 1] = var4.field778;
                field835[++Statics.field1267 - 1] = var4.field789;
                field842[++Statics.field830 - 1] = var4.field790;
                field842[++Statics.field830 - 1] = var4.field787;
                field835[++Statics.field1267 - 1] = var4.field788;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field842[--Statics.field830];
            class65 var6 = null;
            for (int var7 = 0; var7 < class65.field782; var7++) {
                if (Statics.field2996[var7].field785 == var5) {
                    var6 = Statics.field2996[var7];
                    break;
                }
            }
            if (var6 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
            } else {
                field842[++Statics.field830 - 1] = var6.field785;
                field842[++Statics.field830 - 1] = var6.field778;
                field835[++Statics.field1267 - 1] = var6.field789;
                field842[++Statics.field830 - 1] = var6.field790;
                field842[++Statics.field830 - 1] = var6.field787;
                field835[++Statics.field1267 - 1] = var6.field788;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field830 -= 4;
            int var8 = field842[Statics.field830];
            boolean var9 = field842[Statics.field830 + 1] == 1;
            int var10 = field842[Statics.field830 + 2];
            boolean var11 = field842[Statics.field830 + 3] == 1;
            class65.method2701(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field842[--Statics.field830];
            if (var12 >= 0 && var12 < class65.field782) {
                class65 var13 = Statics.field2996[var12];
                field842[++Statics.field830 - 1] = var13.field785;
                field842[++Statics.field830 - 1] = var13.field778;
                field835[++Statics.field1267 - 1] = var13.field789;
                field842[++Statics.field830 - 1] = var13.field790;
                field842[++Statics.field830 - 1] = var13.field787;
                field835[++Statics.field1267 - 1] = var13.field788;
            } else {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
                field842[++Statics.field830 - 1] = 0;
                field842[++Statics.field830 - 1] = 0;
                field835[++Statics.field1267 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field633 = field842[--Statics.field830] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field830 -= 2;
            int var14 = field842[Statics.field830];
            int var15 = field842[Statics.field830 + 1];
            class199 var16 = class199.method3048(var15);
            if (var16.method3465()) {
                field835[++Statics.field1267 - 1] = class193.method3331(var14).method3358(var15, var16.field2087);
            } else {
                field842[++Statics.field830 - 1] = class193.method3331(var14).method3357(var15, var16.field2083);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field830 -= 2;
            int var17 = field842[Statics.field830];
            int var18 = field842[Statics.field830 + 1];
            class199 var19 = class199.method3048(var18);
            if (var19.method3465()) {
                field835[++Statics.field1267 - 1] = Statics.method4396(var17).method3551(var18, var19.field2087);
            } else {
                field842[++Statics.field830 - 1] = Statics.method4396(var17).method3549(var18, var19.field2083);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field830 -= 2;
            int var20 = field842[Statics.field830];
            int var21 = field842[Statics.field830 + 1];
            class199 var22 = class199.method3048(var21);
            if (var22.method3465()) {
                field835[++Statics.field1267 - 1] = class204.method3453(var20).method3603(var21, var22.field2087);
            } else {
                field842[++Statics.field830 - 1] = class204.method3453(var20).method3616(var21, var22.field2083);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field830 -= 2;
            int var23 = field842[Statics.field830];
            int var24 = field842[Statics.field830 + 1];
            class199 var25 = class199.method3048(var24);
            if (var25.method3465()) {
                field835[++Statics.field1267 - 1] = class201.method4884(var23).method3484(var24, var25.field2087);
            } else {
                field842[++Statics.field830 - 1] = class201.method4884(var23).method3485(var24, var25.field2083);
            }
            return 1;
        } else if (arg0 == 6518) {
            field842[++Statics.field830 - 1] = client.field490 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field842[++Statics.field830 - 1] = client.field674;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1267--;
            Statics.field830--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1267--;
            Statics.field830--;
            return 1;
        } else if (arg0 == 6524) {
            field842[++Statics.field830 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field842[++Statics.field830 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field842[++Statics.field830 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field842[++Statics.field830 - 1] = client.field489;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hk.by(ILcv;ZB)I")
    public static int method3431(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1812;
            int var4 = (Statics.field1440.field1200 >> 7) + Statics.field218;
            int var5 = (Statics.field1440.field1205 >> 7) + Statics.field1865;
            client.method7771().method7391(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field842[--Statics.field830];
            String var7 = "";
            class245 var8 = client.method7771().method7421(var6);
            if (var8 != null) {
                var7 = var8.method4480();
            }
            field835[++Statics.field1267 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field842[--Statics.field830];
            client.method7771().method7392(var9);
            return 1;
        } else if (arg0 == 6603) {
            field842[++Statics.field830 - 1] = client.method7771().method7406();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field842[--Statics.field830];
            client.method7771().method7403(var10);
            return 1;
        } else if (arg0 == 6605) {
            field842[++Statics.field830 - 1] = client.method7771().method7408() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class304 var11 = new class304(field842[--Statics.field830]);
            client.method7771().method7409(var11.field3429, var11.field3431);
            return 1;
        } else if (arg0 == 6607) {
            class304 var12 = new class304(field842[--Statics.field830]);
            client.method7771().method7504(var12.field3429, var12.field3431);
            return 1;
        } else if (arg0 == 6608) {
            class304 var13 = new class304(field842[--Statics.field830]);
            client.method7771().method7411(var13.field3434, var13.field3429, var13.field3431);
            return 1;
        } else if (arg0 == 6609) {
            class304 var14 = new class304(field842[--Statics.field830]);
            client.method7771().method7412(var14.field3434, var14.field3429, var14.field3431);
            return 1;
        } else if (arg0 == 6610) {
            field842[++Statics.field830 - 1] = client.method7771().method7413();
            field842[++Statics.field830 - 1] = client.method7771().method7458();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field842[--Statics.field830];
            class245 var16 = client.method7771().method7421(var15);
            if (var16 == null) {
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = var16.method4494().method5208();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field842[--Statics.field830];
            class245 var18 = client.method7771().method7421(var17);
            if (var18 == null) {
                field842[++Statics.field830 - 1] = 0;
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = (var18.method4484() - var18.method4533() + 1) * 64;
                field842[++Statics.field830 - 1] = (var18.method4495() - var18.method4500() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field842[--Statics.field830];
            class245 var20 = client.method7771().method7421(var19);
            if (var20 == null) {
                field842[++Statics.field830 - 1] = 0;
                field842[++Statics.field830 - 1] = 0;
                field842[++Statics.field830 - 1] = 0;
                field842[++Statics.field830 - 1] = 0;
            } else {
                field842[++Statics.field830 - 1] = var20.method4533() * 64;
                field842[++Statics.field830 - 1] = var20.method4500() * 64;
                field842[++Statics.field830 - 1] = var20.method4484() * 64 + 64 - 1;
                field842[++Statics.field830 - 1] = var20.method4495() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field842[--Statics.field830];
            class245 var22 = client.method7771().method7421(var21);
            if (var22 == null) {
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = var22.method4482();
            }
            return 1;
        } else if (arg0 == 6615) {
            class304 var23 = client.method7771().method7543();
            if (var23 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = var23.field3429;
                field842[++Statics.field830 - 1] = var23.field3431;
            }
            return 1;
        } else if (arg0 == 6616) {
            field842[++Statics.field830 - 1] = client.method7771().method7393();
            return 1;
        } else if (arg0 == 6617) {
            class304 var24 = new class304(field842[--Statics.field830]);
            class245 var25 = client.method7771().method7394();
            if (var25 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4474(var24.field3434, var24.field3429, var24.field3431);
            if (var26 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = var26[0];
                field842[++Statics.field830 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class304 var27 = new class304(field842[--Statics.field830]);
            class245 var28 = client.method7771().method7394();
            if (var28 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = -1;
                return 1;
            }
            class304 var29 = var28.method4510(var27.field3429, var27.field3431);
            if (var29 == null) {
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = var29.method5208();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field830 -= 2;
            int var30 = field842[Statics.field830];
            class304 var31 = new class304(field842[Statics.field830 + 1]);
            method1083(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field830 -= 2;
            int var32 = field842[Statics.field830];
            class304 var33 = new class304(field842[Statics.field830 + 1]);
            method1083(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field830 -= 2;
            int var34 = field842[Statics.field830];
            class304 var35 = new class304(field842[Statics.field830 + 1]);
            class245 var36 = client.method7771().method7421(var34);
            if (var36 == null) {
                field842[++Statics.field830 - 1] = 0;
                return 1;
            } else {
                field842[++Statics.field830 - 1] = var36.method4517(var35.field3434, var35.field3429, var35.field3431) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field842[++Statics.field830 - 1] = client.method7771().method7416();
            field842[++Statics.field830 - 1] = client.method7771().method7417();
            return 1;
        } else if (arg0 == 6623) {
            class304 var37 = new class304(field842[--Statics.field830]);
            class245 var38 = client.method7771().method7493(var37.field3434, var37.field3429, var37.field3431);
            if (var38 == null) {
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = var38.method4477();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method7771().method7418(field842[--Statics.field830]);
            return 1;
        } else if (arg0 == 6625) {
            client.method7771().method7535();
            return 1;
        } else if (arg0 == 6626) {
            client.method7771().method7529(field842[--Statics.field830]);
            return 1;
        } else if (arg0 == 6627) {
            client.method7771().method7501();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field842[--Statics.field830] == 1;
            client.method7771().method7422(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field842[--Statics.field830];
            client.method7771().method7496(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field842[--Statics.field830];
            client.method7771().method7484(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method7771().method7425();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field842[--Statics.field830] == 1;
            client.method7771().method7426(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field830 -= 2;
            int var43 = field842[Statics.field830];
            boolean var44 = field842[Statics.field830 + 1] == 1;
            client.method7771().method7427(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field830 -= 2;
            int var45 = field842[Statics.field830];
            boolean var46 = field842[Statics.field830 + 1] == 1;
            client.method7771().method7490(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field842[++Statics.field830 - 1] = client.method7771().method7429() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.method7771().method7464(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field842[--Statics.field830];
            field842[++Statics.field830 - 1] = client.method7771().method7466(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field830 -= 2;
            int var49 = field842[Statics.field830];
            class304 var50 = new class304(field842[Statics.field830 + 1]);
            class304 var51 = client.method7771().method7434(var49, var50);
            if (var51 == null) {
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = var51.method5208();
            }
            return 1;
        } else if (arg0 == 6639) {
            class263 var52 = client.method7771().method7437();
            if (var52 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = var52.method4426();
                field842[++Statics.field830 - 1] = var52.field3013.method5208();
            }
            return 1;
        } else if (arg0 == 6640) {
            class263 var53 = client.method7771().method7530();
            if (var53 == null) {
                field842[++Statics.field830 - 1] = -1;
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = var53.method4426();
                field842[++Statics.field830 - 1] = var53.field3013.method5208();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field842[--Statics.field830];
            class185 var55 = class185.method2778(var54);
            if (var55.field1906 == null) {
                field835[++Statics.field1267 - 1] = "";
            } else {
                field835[++Statics.field1267 - 1] = var55.field1906;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field842[--Statics.field830];
            class185 var57 = class185.method2778(var56);
            field842[++Statics.field830 - 1] = var57.field1908;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field842[--Statics.field830];
            class185 var59 = class185.method2778(var58);
            if (var59 == null) {
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = var59.field1923;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field842[--Statics.field830];
            class185 var61 = class185.method2778(var60);
            if (var61 == null) {
                field842[++Statics.field830 - 1] = -1;
            } else {
                field842[++Statics.field830 - 1] = var61.field1904;
            }
            return 1;
        } else if (arg0 == 6697) {
            field842[++Statics.field830 - 1] = Statics.field1882.field3031;
            return 1;
        } else if (arg0 == 6698) {
            field842[++Statics.field830 - 1] = Statics.field1882.field3032.method5208();
            return 1;
        } else if (arg0 == 6699) {
            field842[++Statics.field830 - 1] = Statics.field1882.field3033.method5208();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dz.bp(ILcv;ZI)I")
    public static int method2475(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field842[--Statics.field830];
            class193 var4 = class193.method3331(var3);
            field835[++Statics.field1267 - 1] = var4 == null ? "" : var4.field1993;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field830 -= 2;
            class193 var5 = class193.method3331(field842[Statics.field830]);
            int var6 = field842[Statics.field830 + 1];
            field842[++Statics.field830 - 1] = var5.method3361(var6);
            field842[++Statics.field830 - 1] = var5.method3383(var6);
            return 1;
        } else if (arg0 == 6765) {
            class193 var7 = class193.method3331(field842[--Statics.field830]);
            field842[++Statics.field830 - 1] = var7 == null ? 0 : var7.field1991;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.bb(ILcv;ZB)I")
    public static int method1135(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field842[--Statics.field830];
            class203 var4 = Statics.method4396(var3);
            field835[++Statics.field1267 - 1] = var4 == null ? "" : var4.field2142;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cd.bx(ILcv;ZI)I")
    public static int method1081(int arg0, class77 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("hl.bn(ILcv;ZI)I")
    public static int method3396(int arg0, class77 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("oq.bj(ILcv;ZI)I")
    public static int method6747(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field842[++Statics.field830 - 1] = client.method6703() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jy.bf(ILcv;ZI)I")
    public static int method4744(int arg0, class77 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("am.bw(ILcv;ZB)I")
    public static int method169(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field842[--Statics.field830] == 1;
            client.method2943(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("go.bi(ILcv;ZB)I")
    public static int method3064(int arg0, class77 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field842[--Statics.field830];
            Object var45 = method2928(var44);
            int var46 = field842[--Statics.field830];
            class472 var47 = client.method2831(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class474.method3222(var46);
            Statics.field2983 = var47.method7796(var45, var48);
            if (Statics.field2983 == null) {
                client.field766 = -1;
                Statics.field451 = null;
                if (arg0 == 7500) {
                    field842[++Statics.field830 - 1] = 0;
                }
            } else {
                client.field766 = class474.method668(var46);
                Statics.field451 = Statics.field2983.iterator();
                if (arg0 == 7500) {
                    field842[++Statics.field830 - 1] = Statics.field2983.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field451 != null && Statics.field451.hasNext()) {
                field842[++Statics.field830 - 1] = (Integer) Statics.field451.next();
            } else {
                field842[++Statics.field830 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field830 -= 3;
            int var3 = field842[Statics.field830];
            int var4 = field842[Statics.field830 + 1];
            int var5 = field842[Statics.field830 + 2];
            int var6 = class474.method668(var4);
            int var7 = class474.method4400(var4);
            int var8 = class474.method3222(var4);
            class473 var9 = class473.method2123(var3);
            class471 var10 = class471.method4750(var6);
            int[] var11 = var10.field4873[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method7814(var7);
            if (var14 == null && var10.field4874 != null) {
                var14 = var10.field4874[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class468 var17 = class466.method7647(var16);
                    if (class468.field4866 == var17) {
                        field835[++Statics.field1267 - 1] = "";
                    } else {
                        field842[++Statics.field830 - 1] = class466.method3650(var16);
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
                class468 var21 = class466.method7647(var11[var19]);
                if (class468.field4866 == var21) {
                    field835[++Statics.field1267 - 1] = (String) var14[var20];
                } else {
                    field842[++Statics.field830 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field830 -= 2;
            int var22 = field842[Statics.field830];
            int var23 = field842[Statics.field830 + 1];
            int var24 = 0;
            int var25 = class474.method668(var23);
            int var26 = class474.method4400(var23);
            class473 var27 = class473.method2123(var22);
            class471 var28 = class471.method4750(var25);
            int[] var29 = var28.field4873[var26];
            Object[] var30 = var27.method7814(var26);
            if (var30 == null && var28.field4874 != null) {
                var30 = var28.field4874[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field842[++Statics.field830 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field830--;
            int var41 = field842[Statics.field830];
            class472 var42 = client.method1956(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field2983 = var42.method7796(0, 0);
            int var43 = 0;
            if (Statics.field2983 != null) {
                client.field766 = var41;
                Statics.field451 = Statics.field2983.iterator();
                var43 = Statics.field2983.size();
            }
            if (arg0 == 7504) {
                field842[++Statics.field830 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field842[--Statics.field830];
            class473 var32 = class473.method2123(var31);
            field842[++Statics.field830 - 1] = var32.field4884;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field842[--Statics.field830];
            int var34 = -1;
            if (Statics.field2983 != null && var33 >= 0 && var33 < Statics.field2983.size()) {
                var34 = (Integer) Statics.field2983.get(var33);
            }
            field842[++Statics.field830 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field842[--Statics.field830];
            Object var36 = method2928(var35);
            int var37 = field842[--Statics.field830];
            class472 var38 = client.method2831(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class474.method668(var37) != client.field766) {
                throw new RuntimeException();
            } else if (Statics.field2983 == null && Statics.field2983.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class474.method3222(var37);
                List var40 = var38.method7796(var36, var39);
                Statics.field2983 = new LinkedList(Statics.field2983);
                if (var40 == null) {
                    Statics.field2983.clear();
                } else {
                    Statics.field2983.retainAll(var40);
                }
                Statics.field451 = Statics.field2983.iterator();
                if (arg0 == 7507) {
                    field842[++Statics.field830 - 1] = Statics.field2983.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jh.cl(ILcv;ZI)I")
    public static int method4742(int arg0, class77 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("kx.ca(IB)V")
    public static void method4800(int arg0) {
        if (arg0 == -1 || !class313.method5988(arg0)) {
            return;
        }
        class313[] var1 = Statics.field1732[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class313 var3 = var1[var2];
            if (var3.field3514 != null) {
                class86 var4 = new class86();
                var4.field1056 = var3;
                var4.field1057 = var3.field3514;
                method168(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("cc.cb(ILlt;ZI)V")
    public static void method1083(int arg0, class304 arg1, boolean arg2) {
        class245 var3 = client.method7771().method7421(arg0);
        int var4 = Statics.field1440.field1102;
        int var5 = (Statics.field1440.field1200 >> 7) + Statics.field218;
        int var6 = (Statics.field1440.field1205 >> 7) + Statics.field1865;
        class304 var7 = new class304(var4, var5, var6);
        client.method7771().method7468(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("fm.co(Lrf;I)Ljava/lang/Object;")
    public static Object method2968(class468 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field4862) {
            case 0:
                return field842[--Statics.field830];
            case 2:
                return field835[--Statics.field1267];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("fa.cj(II)Ljava/lang/Object;")
    public static Object method2928(int arg0) {
        return method2968((class468) class354.method5197(class468.method7769(), arg0));
    }
}
