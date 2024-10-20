package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bt")
public class class77 {

    @ObfuscatedName("bt.p")
    public static int[] field1070 = new int[5];

    @ObfuscatedName("bt.b")
    public static int[][] field1083 = new int[5][5000];

    @ObfuscatedName("bt.e")
    public static int[] field1072 = new int[1000];

    @ObfuscatedName("bt.a")
    public static String[] field1081 = new String[1000];

    @ObfuscatedName("bt.c")
    public static int field1074 = 0;

    @ObfuscatedName("bt.o")
    public static class56[] field1075 = new class56[50];

    @ObfuscatedName("bt.s")
    public static Calendar field1076 = Calendar.getInstance();

    @ObfuscatedName("bt.l")
    public static final String[] field1077 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bt.j")
    public static boolean field1078 = false;

    @ObfuscatedName("bt.n")
    public static boolean field1079 = false;

    @ObfuscatedName("bt.u")
    public static int field1080 = 0;

    @ObfuscatedName("bt.g")
    public static final double field1084 = Math.log(2.0D);

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.f(Lbm;I)V")
    public static void method1570(class63 arg0) {
        method53(arg0, 500000);
    }

    @ObfuscatedName("e.i(Lbm;II)V")
    public static void method53(class63 arg0, int arg1) {
        Object[] var2 = arg0.field550;
        class93 var4;
        if (class296.method4335(arg0.field561)) {
            Statics.field222 = (class42) var2[0];
            class242 var3 = class242.method103(Statics.field222.field345);
            var4 = class93.method160(arg0.field561, var3.field3183, var3.field3202);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class93.method1005(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field2326 = 0;
        Statics.field590 = 0;
        int var6 = -1;
        int[] var7 = var4.field1261;
        int[] var8 = var4.field1262;
        byte var9 = -1;
        field1074 = 0;
        field1078 = false;
        try {
            Statics.field1069 = new int[var4.field1272];
            int var10 = 0;
            Statics.field3264 = new String[var4.field1265];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field553;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field555;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field552 == null ? -1 : arg0.field552.field2669;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field554;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field552 == null ? -1 : arg0.field552.field2553;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field556 == null ? -1 : arg0.field556.field2669;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field556 == null ? -1 : arg0.field556.field2553;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field557;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field563;
                    }
                    Statics.field1069[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field560;
                    }
                    Statics.field3264[var11++] = var14;
                }
            }
            int var15 = 0;
            field1080 = arg0.field558;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1262[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method3021(var53, var4, var43);
                    switch(var44) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var53 == 0) {
                    field1072[++Statics.field2326 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1072[++Statics.field2326 - 1] = class213.field2511[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class213.field2511[var17] = field1072[--Statics.field2326];
                    client.method5415(var17);
                } else if (var53 == 3) {
                    field1081[++Statics.field590 - 1] = var4.field1260[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field2326 -= 2;
                    if (field1072[Statics.field2326] != field1072[Statics.field2326 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field2326 -= 2;
                    if (field1072[Statics.field2326] == field1072[Statics.field2326 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field2326 -= 2;
                    if (field1072[Statics.field2326] < field1072[Statics.field2326 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field2326 -= 2;
                    if (field1072[Statics.field2326] > field1072[Statics.field2326 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1074 == 0) {
                        return;
                    }
                    class56 var18 = field1075[--field1074];
                    var4 = var18.field485;
                    var7 = var4.field1261;
                    var8 = var4.field1262;
                    var6 = var18.field486;
                    Statics.field1069 = var18.field487;
                    Statics.field3264 = var18.field488;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1072[++Statics.field2326 - 1] = Statics.method782(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class213.method2069(var20, field1072[--Statics.field2326]);
                } else if (var53 == 31) {
                    Statics.field2326 -= 2;
                    if (field1072[Statics.field2326] <= field1072[Statics.field2326 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field2326 -= 2;
                    if (field1072[Statics.field2326] >= field1072[Statics.field2326 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1072[++Statics.field2326 - 1] = Statics.field1069[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field1069[var8[var6]] = field1072[--Statics.field2326];
                } else if (var53 == 35) {
                    field1081[++Statics.field590 - 1] = Statics.field3264[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field3264[var8[var6]] = field1081[--Statics.field590];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field590 -= var21;
                    String var22 = class291.method4694(field1081, Statics.field590, var21);
                    field1081[++Statics.field590 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field2326--;
                } else if (var53 == 39) {
                    Statics.field590--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class93 var24 = class93.method1005(var23);
                    int[] var25 = new int[var24.field1272];
                    String[] var26 = new String[var24.field1265];
                    for (int var27 = 0; var27 < var24.field1266; var27++) {
                        var25[var27] = field1072[Statics.field2326 - var24.field1266 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1267; var28++) {
                        var26[var28] = field1081[Statics.field590 - var24.field1267 + var28];
                    }
                    Statics.field2326 -= var24.field1266;
                    Statics.field590 -= var24.field1267;
                    class56 var29 = new class56();
                    var29.field485 = var4;
                    var29.field486 = var6;
                    var29.field487 = Statics.field1069;
                    var29.field488 = Statics.field3264;
                    field1075[++field1074 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1261;
                    var8 = var24.field1262;
                    var6 = -1;
                    Statics.field1069 = var25;
                    Statics.field3264 = var26;
                } else if (var53 == 42) {
                    field1072[++Statics.field2326 - 1] = Statics.field2005.method1978(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field2005.method1977(var8[var6], field1072[--Statics.field2326]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1072[--Statics.field2326];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1070[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1083[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1072[--Statics.field2326];
                    if (var36 < 0 || var36 >= field1070[var35]) {
                        throw new RuntimeException();
                    }
                    field1072[++Statics.field2326 - 1] = field1083[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field2326 -= 2;
                    int var38 = field1072[Statics.field2326];
                    if (var38 < 0 || var38 >= field1070[var37]) {
                        throw new RuntimeException();
                    }
                    field1083[var37][var38] = field1072[Statics.field2326 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field2005.method2010(var8[var6]);
                    if (var39 == null) {
                        var39 = class225.field2800;
                    }
                    field1081[++Statics.field590 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field2005.method1976(var8[var6], field1081[--Statics.field590]);
                } else if (var53 == 49) {
                    String var40 = Statics.field2005.method1980(var8[var6]);
                    field1081[++Statics.field590 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field2005.method1985(var8[var6], field1081[--Statics.field590]);
                } else if (var53 == 60) {
                    class316 var41 = var4.field1264[var8[var6]];
                    class187 var42 = (class187) var41.method5467((long) field1072[--Statics.field2326]);
                    if (var42 != null) {
                        var6 += var42.field2321;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2322).append(" ");
            for (int var47 = field1074 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1075[var47].field485.field2322).append(" ");
            }
            var46.append("").append(var9);
            class341.method5815(var46.toString(), var51);
        } finally {
            if (field1078) {
                field1079 = true;
                client.method3188();
                field1079 = false;
                field1078 = false;
            }
        }
    }

    @ObfuscatedName("eq.y(ILcu;ZB)I")
    public static int method3021(int arg0, class93 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method558(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1029(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method3408(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method4864(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3033(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method114(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method21(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method3264(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method4795(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method3265(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3271(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1029(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method3408(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method4864(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3033(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method114(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3719(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method574(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method927(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method496(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3271(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method3793(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3584(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method3566(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method699(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method1893(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method970(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method52(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method1030(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method971(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method1003(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3096(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method3960(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method3072(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method1136(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method244(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method245(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ar.w(ILcu;ZB)I")
    public static int method558(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field2326 -= 3;
            int var3 = field1072[Statics.field2326];
            int var4 = field1072[Statics.field2326 + 1];
            int var5 = field1072[Statics.field2326 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class218 var6 = Statics.method2628(var3);
            if (var6.field2682 == null) {
                var6.field2682 = new class218[var5 + 1];
            }
            if (var6.field2682.length <= var5) {
                class218[] var7 = new class218[var5 + 1];
                for (int var8 = 0; var8 < var6.field2682.length; var8++) {
                    var7[var8] = var6.field2682[var8];
                }
                var6.field2682 = var7;
            }
            if (var5 > 0 && var6.field2682[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class218 var9 = new class218();
            var9.field2554 = var4;
            var9.field2542 = var9.field2669 = var6.field2669;
            var9.field2553 = var5;
            var9.field2607 = true;
            var6.field2682[var5] = var9;
            if (arg2) {
                Statics.field1947 = var9;
            } else {
                Statics.field2399 = var9;
            }
            client.method3272(var6);
            return 1;
        } else if (arg0 == 101) {
            class218 var10 = arg2 ? Statics.field1947 : Statics.field2399;
            class218 var11 = Statics.method2628(var10.field2669);
            var11.field2682[var10.field2553] = null;
            client.method3272(var11);
            return 1;
        } else if (arg0 == 102) {
            class218 var12 = Statics.method2628(field1072[--Statics.field2326]);
            var12.field2682 = null;
            client.method3272(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field2326 -= 2;
            int var13 = field1072[Statics.field2326];
            int var14 = field1072[Statics.field2326 + 1];
            class218 var15 = class218.method5373(var13, var14);
            if (var15 == null || var14 == -1) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = 1;
                if (arg2) {
                    Statics.field1947 = var15;
                } else {
                    Statics.field2399 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class218 var16 = Statics.method2628(field1072[--Statics.field2326]);
            if (var16 == null) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = 1;
                if (arg2) {
                    Statics.field1947 = var16;
                } else {
                    Statics.field2399 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("by.p(ILcu;ZI)I")
    public static int method1029(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1072[--Statics.field2326];
            var4 = Statics.method2628(var3);
        } else {
            var4 = arg2 ? Statics.field1947 : Statics.field2399;
        }
        if (arg0 == 1000) {
            Statics.field2326 -= 4;
            var4.field2561 = field1072[Statics.field2326];
            var4.field2562 = field1072[Statics.field2326 + 1];
            var4.field2557 = field1072[Statics.field2326 + 2];
            var4.field2558 = field1072[Statics.field2326 + 3];
            client.method3272(var4);
            Statics.field2488.method1164(var4);
            if (var3 != -1 && var4.field2554 == 0) {
                Statics.method2023(Statics.field1950[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field2326 -= 4;
            var4.field2657 = field1072[Statics.field2326];
            var4.field2599 = field1072[Statics.field2326 + 1];
            var4.field2667 = field1072[Statics.field2326 + 2];
            var4.field2560 = field1072[Statics.field2326 + 3];
            client.method3272(var4);
            Statics.field2488.method1164(var4);
            if (var3 != -1 && var4.field2554 == 0) {
                Statics.method2023(Statics.field1950[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1072[--Statics.field2326] == 1;
            if (var4.field2572 != var5) {
                var4.field2572 = var5;
                client.method3272(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2620 = field1072[--Statics.field2326] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2565 = field1072[--Statics.field2326] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gm.b(ILcu;ZB)I")
    public static int method3408(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1072[--Statics.field2326];
            var4 = Statics.method2628(var3);
        } else {
            var4 = arg2 ? Statics.field1947 : Statics.field2399;
        }
        if (arg0 == 1100) {
            Statics.field2326 -= 2;
            var4.field2573 = field1072[Statics.field2326];
            if (var4.field2573 > var4.field2575 - var4.field2567) {
                var4.field2573 = var4.field2575 - var4.field2567;
            }
            if (var4.field2573 < 0) {
                var4.field2573 = 0;
            }
            var4.field2574 = field1072[Statics.field2326 + 1];
            if (var4.field2574 > var4.field2586 - var4.field2693) {
                var4.field2574 = var4.field2586 - var4.field2693;
            }
            if (var4.field2574 < 0) {
                var4.field2574 = 0;
            }
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2577 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2581 = field1072[--Statics.field2326] == 1;
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2583 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2585 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2587 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2589 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2590 = field1072[--Statics.field2326] == 1;
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2595 = 1;
            var4.field2571 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field2326 -= 6;
            var4.field2601 = field1072[Statics.field2326];
            var4.field2602 = field1072[Statics.field2326 + 1];
            var4.field2559 = field1072[Statics.field2326 + 2];
            var4.field2604 = field1072[Statics.field2326 + 3];
            var4.field2605 = field1072[Statics.field2326 + 4];
            var4.field2644 = field1072[Statics.field2326 + 5];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1072[--Statics.field2326];
            if (var4.field2596 != var5) {
                var4.field2596 = var5;
                var4.field2680 = 0;
                var4.field2681 = 0;
                client.method3272(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2609 = field1072[--Statics.field2326] == 1;
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1081[--Statics.field590];
            if (!var6.equals(var4.field2576)) {
                var4.field2576 = var6;
                client.method3272(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2612 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field2326 -= 3;
            var4.field2685 = field1072[Statics.field2326];
            var4.field2617 = field1072[Statics.field2326 + 1];
            var4.field2610 = field1072[Statics.field2326 + 2];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2691 = field1072[--Statics.field2326] == 1;
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2591 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2592 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2593 = field1072[--Statics.field2326] == 1;
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2594 = field1072[--Statics.field2326] == 1;
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field2326 -= 2;
            var4.field2575 = field1072[Statics.field2326];
            var4.field2586 = field1072[Statics.field2326 + 1];
            client.method3272(var4);
            if (var3 != -1 && var4.field2554 == 0) {
                Statics.method2023(Statics.field1950[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method246(var4.field2669, var4.field2553);
            client.field795 = var4;
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2648 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2578 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2615 = field1072[--Statics.field2326];
            client.method3272(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1072[--Statics.field2326];
            class323 var8 = (class323) class196.method2065(class323.method3011(), var7);
            if (var8 != null) {
                var4.field2652 = var8;
                client.method3272(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1072[--Statics.field2326] == 1;
            var4.field2677 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1072[--Statics.field2326] == 1;
            var4.field2569 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jg.e(ILcu;ZI)I")
    public static int method4864(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method2628(field1072[--Statics.field2326]);
        } else {
            var3 = arg2 ? Statics.field1947 : Statics.field2399;
        }
        client.method3272(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field2326 -= 2;
            int var4 = field1072[Statics.field2326];
            int var5 = field1072[Statics.field2326 + 1];
            var3.field2664 = var4;
            var3.field2694 = var5;
            class255 var6 = Statics.method3278(var4);
            var3.field2559 = var6.field3384;
            var3.field2604 = var6.field3385;
            var3.field2605 = var6.field3386;
            var3.field2601 = var6.field3387;
            var3.field2602 = var6.field3369;
            var3.field2644 = var6.field3383;
            if (arg0 == 1205) {
                var3.field2552 = 0;
            } else if (arg0 == 1212 | var6.field3411 == 1) {
                var3.field2552 = 1;
            } else {
                var3.field2552 = 2;
            }
            if (var3.field2646 > 0) {
                var3.field2644 = var3.field2644 * 32 / var3.field2646;
            } else if (var3.field2657 > 0) {
                var3.field2644 = var3.field2644 * 32 / var3.field2657;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2595 = 2;
            var3.field2571 = field1072[--Statics.field2326];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2595 = 3;
            var3.field2571 = Statics.field585.field595.method3626();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.x(ILcu;ZI)I")
    public static int method3033(int arg0, class93 arg1, boolean arg2) {
        boolean var3 = true;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = Statics.method2628(field1072[--Statics.field2326]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1947 : Statics.field2399;
        }
        if (arg0 == 1300) {
            int var5 = field1072[--Statics.field2326] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3671(var5, field1081[--Statics.field590]);
                return 1;
            } else {
                Statics.field590--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field2326 -= 2;
            int var6 = field1072[Statics.field2326];
            int var7 = field1072[Statics.field2326 + 1];
            var4.field2633 = class218.method5373(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2636 = field1072[--Statics.field2326] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2556 = field1072[--Statics.field2326];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2635 = field1072[--Statics.field2326];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2631 = field1081[--Statics.field590];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2637 = field1081[--Statics.field590];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2564 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2603 = field1072[--Statics.field2326] == 1;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field2326 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1072[Statics.field2326 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1072[Statics.field2326 + var10];
                        var9[var10 / 2] = (byte) field1072[Statics.field2326 + var10 + 1];
                    }
                }
            } else {
                Statics.field2326 -= 2;
                var8 = new byte[] { (byte) field1072[Statics.field2326] };
                var9 = new byte[] { (byte) field1072[Statics.field2326 + 1] };
            }
            int var11 = field1072[--Statics.field2326] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method1897(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field2326 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1072[Statics.field2326] };
            byte[] var14 = new byte[] { (byte) field1072[Statics.field2326 + 1] };
            method1897(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field2326 -= 3;
            int var15 = field1072[Statics.field2326] - 1;
            int var16 = field1072[Statics.field2326 + 1];
            int var17 = field1072[Statics.field2326 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            Statics.method96(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1072[--Statics.field2326];
            int var20 = field1072[--Statics.field2326];
            Statics.method96(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field2326--;
            int var21 = field1072[Statics.field2326] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method519(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method519(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cf.a(Lha;I[B[BI)V")
    public static final void method1897(class218 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2627 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2627 = new byte[11][];
            arg0.field2630 = new byte[11][];
            arg0.field2632 = new int[11];
            arg0.field2671 = new int[11];
        }
        arg0.field2627[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2626 = false;
            for (int var4 = 0; var4 < arg0.field2627.length; var4++) {
                if (arg0.field2627[var4] != null) {
                    arg0.field2626 = true;
                    break;
                }
            }
        } else {
            arg0.field2626 = true;
        }
        arg0.field2630[arg1] = arg3;
    }

    @ObfuscatedName("an.c(Lha;II)V")
    public static final void method519(class218 arg0, int arg1) {
        if (arg0.field2627 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2656 == null) {
            arg0.field2656 = new int[arg0.field2627.length];
        }
        arg0.field2656[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("o.o(ILcu;ZB)I")
    public static int method114(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method2628(field1072[--Statics.field2326]);
        } else {
            var3 = arg2 ? Statics.field1947 : Statics.field2399;
        }
        String var4 = field1081[--Statics.field590];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1072[--Statics.field2326];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1072[--Statics.field2326];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1081[--Statics.field590];
            } else {
                var7[var8] = Integer.valueOf(field1072[--Statics.field2326]);
            }
        }
        int var9 = field1072[--Statics.field2326];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2616 = var7;
        } else if (arg0 == 1401) {
            var3.field2647 = var7;
        } else if (arg0 == 1402) {
            var3.field2642 = var7;
        } else if (arg0 == 1403) {
            var3.field2634 = var7;
        } else if (arg0 == 1404) {
            var3.field2674 = var7;
        } else if (arg0 == 1405) {
            var3.field2606 = var7;
        } else if (arg0 == 1406) {
            var3.field2650 = var7;
        } else if (arg0 == 1407) {
            var3.field2651 = var7;
            var3.field2611 = var5;
        } else if (arg0 == 1408) {
            var3.field2566 = var7;
        } else if (arg0 == 1409) {
            var3.field2658 = var7;
        } else if (arg0 == 1410) {
            var3.field2638 = var7;
        } else if (arg0 == 1411) {
            var3.field2641 = var7;
        } else if (arg0 == 1412) {
            var3.field2645 = var7;
        } else if (arg0 == 1414) {
            var3.field2653 = var7;
            var3.field2654 = var5;
        } else if (arg0 == 1415) {
            var3.field2655 = var7;
            var3.field2643 = var5;
        } else if (arg0 == 1416) {
            var3.field2649 = var7;
        } else if (arg0 == 1417) {
            var3.field2659 = var7;
        } else if (arg0 == 1418) {
            var3.field2660 = var7;
        } else if (arg0 == 1419) {
            var3.field2661 = var7;
        } else if (arg0 == 1420) {
            var3.field2662 = var7;
        } else if (arg0 == 1421) {
            var3.field2663 = var7;
        } else if (arg0 == 1422) {
            var3.field2588 = var7;
        } else if (arg0 == 1423) {
            var3.field2665 = var7;
        } else if (arg0 == 1424) {
            var3.field2666 = var7;
        } else if (arg0 == 1425) {
            var3.field2668 = var7;
        } else if (arg0 == 1426) {
            var3.field2563 = var7;
        } else if (arg0 == 1427) {
            var3.field2621 = var7;
        } else {
            return 2;
        }
        var3.field2640 = true;
        return 1;
    }

    @ObfuscatedName("y.l(ILcu;ZB)I")
    public static int method21(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1947 : Statics.field2399;
        if (arg0 == 1500) {
            field1072[++Statics.field2326 - 1] = var3.field2543;
            return 1;
        } else if (arg0 == 1501) {
            field1072[++Statics.field2326 - 1] = var3.field2582;
            return 1;
        } else if (arg0 == 1502) {
            field1072[++Statics.field2326 - 1] = var3.field2567;
            return 1;
        } else if (arg0 == 1503) {
            field1072[++Statics.field2326 - 1] = var3.field2693;
            return 1;
        } else if (arg0 == 1504) {
            field1072[++Statics.field2326 - 1] = var3.field2572 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1072[++Statics.field2326 - 1] = var3.field2542;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fw.t(ILcu;ZI)I")
    public static int method3264(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1947 : Statics.field2399;
        if (arg0 == 1600) {
            field1072[++Statics.field2326 - 1] = var3.field2573;
            return 1;
        } else if (arg0 == 1601) {
            field1072[++Statics.field2326 - 1] = var3.field2574;
            return 1;
        } else if (arg0 == 1602) {
            field1081[++Statics.field590 - 1] = var3.field2576;
            return 1;
        } else if (arg0 == 1603) {
            field1072[++Statics.field2326 - 1] = var3.field2575;
            return 1;
        } else if (arg0 == 1604) {
            field1072[++Statics.field2326 - 1] = var3.field2586;
            return 1;
        } else if (arg0 == 1605) {
            field1072[++Statics.field2326 - 1] = var3.field2644;
            return 1;
        } else if (arg0 == 1606) {
            field1072[++Statics.field2326 - 1] = var3.field2559;
            return 1;
        } else if (arg0 == 1607) {
            field1072[++Statics.field2326 - 1] = var3.field2605;
            return 1;
        } else if (arg0 == 1608) {
            field1072[++Statics.field2326 - 1] = var3.field2604;
            return 1;
        } else if (arg0 == 1609) {
            field1072[++Statics.field2326 - 1] = var3.field2583;
            return 1;
        } else if (arg0 == 1610) {
            field1072[++Statics.field2326 - 1] = var3.field2615;
            return 1;
        } else if (arg0 == 1611) {
            field1072[++Statics.field2326 - 1] = var3.field2577;
            return 1;
        } else if (arg0 == 1612) {
            field1072[++Statics.field2326 - 1] = var3.field2578;
            return 1;
        } else if (arg0 == 1613) {
            field1072[++Statics.field2326 - 1] = var3.field2652.method28();
            return 1;
        } else if (arg0 == 1614) {
            field1072[++Statics.field2326 - 1] = var3.field2569 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jb.j(ILcu;ZB)I")
    public static int method4795(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1947 : Statics.field2399;
        if (arg0 == 1700) {
            field1072[++Statics.field2326 - 1] = var3.field2664;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2664 == -1) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = var3.field2694;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1072[++Statics.field2326 - 1] = var3.field2553;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fw.n(ILcu;ZI)I")
    public static int method3265(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1947 : Statics.field2399;
        if (arg0 == 1800) {
            field1072[++Statics.field2326 - 1] = class219.method137(client.method210(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1072[--Statics.field2326];
            int var5 = var4 - 1;
            if (var3.field2564 == null || var5 >= var3.field2564.length || var3.field2564[var5] == null) {
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1081[++Statics.field590 - 1] = var3.field2564[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2631 == null) {
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1081[++Statics.field590 - 1] = var3.field2631;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fm.u(ILcu;ZI)I")
    public static int method3271(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method2628(field1072[--Statics.field2326]);
        } else {
            var3 = arg2 ? Statics.field1947 : Statics.field2399;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1080 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2621 == null) {
            return 0;
        } else {
            class63 var4 = new class63();
            var4.field552 = var3;
            var4.field550 = var3.field2621;
            var4.field558 = field1080 + 1;
            client.field828.method4554(var4);
            return 1;
        }
    }

    @ObfuscatedName("hb.z(ILcu;ZS)I")
    public static int method3719(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = Statics.method2628(field1072[--Statics.field2326]);
        if (arg0 == 2500) {
            field1072[++Statics.field2326 - 1] = var3.field2543;
            return 1;
        } else if (arg0 == 2501) {
            field1072[++Statics.field2326 - 1] = var3.field2582;
            return 1;
        } else if (arg0 == 2502) {
            field1072[++Statics.field2326 - 1] = var3.field2567;
            return 1;
        } else if (arg0 == 2503) {
            field1072[++Statics.field2326 - 1] = var3.field2693;
            return 1;
        } else if (arg0 == 2504) {
            field1072[++Statics.field2326 - 1] = var3.field2572 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1072[++Statics.field2326 - 1] = var3.field2542;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.h(ILcu;ZI)I")
    public static int method574(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = Statics.method2628(field1072[--Statics.field2326]);
        if (arg0 == 2600) {
            field1072[++Statics.field2326 - 1] = var3.field2573;
            return 1;
        } else if (arg0 == 2601) {
            field1072[++Statics.field2326 - 1] = var3.field2574;
            return 1;
        } else if (arg0 == 2602) {
            field1081[++Statics.field590 - 1] = var3.field2576;
            return 1;
        } else if (arg0 == 2603) {
            field1072[++Statics.field2326 - 1] = var3.field2575;
            return 1;
        } else if (arg0 == 2604) {
            field1072[++Statics.field2326 - 1] = var3.field2586;
            return 1;
        } else if (arg0 == 2605) {
            field1072[++Statics.field2326 - 1] = var3.field2644;
            return 1;
        } else if (arg0 == 2606) {
            field1072[++Statics.field2326 - 1] = var3.field2559;
            return 1;
        } else if (arg0 == 2607) {
            field1072[++Statics.field2326 - 1] = var3.field2605;
            return 1;
        } else if (arg0 == 2608) {
            field1072[++Statics.field2326 - 1] = var3.field2604;
            return 1;
        } else if (arg0 == 2609) {
            field1072[++Statics.field2326 - 1] = var3.field2583;
            return 1;
        } else if (arg0 == 2610) {
            field1072[++Statics.field2326 - 1] = var3.field2615;
            return 1;
        } else if (arg0 == 2611) {
            field1072[++Statics.field2326 - 1] = var3.field2577;
            return 1;
        } else if (arg0 == 2612) {
            field1072[++Statics.field2326 - 1] = var3.field2578;
            return 1;
        } else if (arg0 == 2613) {
            field1072[++Statics.field2326 - 1] = var3.field2652.method28();
            return 1;
        } else if (arg0 == 2614) {
            field1072[++Statics.field2326 - 1] = var3.field2569 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bj.m(ILcu;ZB)I")
    public static int method927(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class218 var3 = Statics.method2628(field1072[--Statics.field2326]);
            field1072[++Statics.field2326 - 1] = var3.field2664;
            return 1;
        } else if (arg0 == 2701) {
            class218 var4 = Statics.method2628(field1072[--Statics.field2326]);
            if (var4.field2664 == -1) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = var4.field2694;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1072[--Statics.field2326];
            class62 var6 = (class62) client.field790.method5499((long) var5);
            if (var6 == null) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1072[++Statics.field2326 - 1] = client.field789;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ah.aa(ILcu;ZB)I")
    public static int method496(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = Statics.method2628(field1072[--Statics.field2326]);
        if (arg0 == 2800) {
            field1072[++Statics.field2326 - 1] = class219.method137(client.method210(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1072[--Statics.field2326];
            int var5 = var4 - 1;
            if (var3.field2564 == null || var5 >= var3.field2564.length || var3.field2564[var5] == null) {
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1081[++Statics.field590 - 1] = var3.field2564[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2631 == null) {
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1081[++Statics.field590 - 1] = var3.field2631;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hz.av(ILcu;ZI)I")
    public static int method3793(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1081[--Statics.field590];
            class92.method1894(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field2326 -= 2;
            client.method3083(Statics.field585, field1072[Statics.field2326], field1072[Statics.field2326 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1079) {
                field1078 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1081[--Statics.field590];
            int var5 = 0;
            if (class291.method1948(var4)) {
                var5 = class291.method3871(var4);
            }
            class182 var6 = class182.method19(class178.field2193, client.field668.field1294);
            var6.field2303.method5097(var5);
            client.field668.method2084(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1081[--Statics.field590];
            class182 var8 = class182.method19(class178.field2272, client.field668.field1294);
            var8.field2303.method5094(var7.length() + 1);
            var8.field2303.method5101(var7);
            client.field668.method2084(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1081[--Statics.field590];
            class182 var10 = class182.method19(class178.field2189, client.field668.field1294);
            var10.field2303.method5094(var9.length() + 1);
            var10.field2303.method5101(var9);
            client.field668.method2084(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1072[--Statics.field2326];
            String var12 = field1081[--Statics.field590];
            client.method301(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field2326 -= 3;
            int var13 = field1072[Statics.field2326];
            int var14 = field1072[Statics.field2326 + 1];
            int var15 = field1072[Statics.field2326 + 2];
            class218 var16 = Statics.method2628(var15);
            client.method117(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field2326 -= 2;
            int var17 = field1072[Statics.field2326];
            int var18 = field1072[Statics.field2326 + 1];
            class218 var19 = arg2 ? Statics.field1947 : Statics.field2399;
            client.method117(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field3102 = field1072[--Statics.field2326] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1072[++Statics.field2326 - 1] = Statics.field1071.field1028 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1071.field1028 = field1072[--Statics.field2326] == 1;
            class74.method1733();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1081[--Statics.field590];
            boolean var21 = field1072[--Statics.field2326] == 1;
            class51.method129(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1072[--Statics.field2326];
            class182 var23 = class182.method19(class178.field2179, client.field668.field1294);
            var23.field2303.method5095(var22);
            client.field668.method2084(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1072[--Statics.field2326];
            Statics.field590 -= 2;
            String var25 = field1081[Statics.field590];
            String var26 = field1081[Statics.field590 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class182 var27 = class182.method19(class178.field2219, client.field668.field1294);
                var27.field2303.method5095(1 + class300.method2738(var25) + class300.method2738(var26));
                var27.field2303.method5101(var25);
                var27.field2303.method5101(var26);
                var27.field2303.method5263(var24);
                client.field668.method2084(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field775 = field1072[--Statics.field2326] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field665 = field1072[--Statics.field2326] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field748 = field1072[--Statics.field2326] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1072[--Statics.field2326] == 1) {
                client.field749 |= 0x1;
            } else {
                client.field749 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1072[--Statics.field2326] == 1) {
                client.field749 |= 0x2;
            } else {
                client.field749 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1072[--Statics.field2326] == 1) {
                client.field749 |= 0x4;
            } else {
                client.field749 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1072[--Statics.field2326] == 1) {
                client.field749 |= 0x8;
            } else {
                client.field749 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field749 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field734 = field1072[--Statics.field2326] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field862 = field1072[--Statics.field2326] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method5044(field1072[--Statics.field2326] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1072[++Statics.field2326 - 1] = client.method648() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field2326 -= 2;
            client.field709 = field1072[Statics.field2326];
            client.field710 = field1072[Statics.field2326 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field2326 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field2326--;
            return 1;
        } else if (arg0 == 3132) {
            field1072[++Statics.field2326 - 1] = Statics.field45;
            field1072[++Statics.field2326 - 1] = Statics.field1152;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field2326--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field2326 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field791 = 3;
            client.field792 = field1072[--Statics.field2326];
            return 1;
        } else if (arg0 == 3137) {
            client.field791 = 2;
            client.field792 = field1072[--Statics.field2326];
            return 1;
        } else if (arg0 == 3138) {
            client.field791 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field791 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field791 = 3;
            client.field792 = arg2 ? Statics.field1947.field2669 : Statics.field2399.field2669;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1072[--Statics.field2326] == 1;
            Statics.field1071.field1030 = var28;
            class74.method1733();
            return 1;
        } else if (arg0 == 3142) {
            field1072[++Statics.field2326 - 1] = Statics.field1071.field1030 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1072[--Statics.field2326] == 1;
            client.field773 = var29;
            if (!var29) {
                Statics.field1071.field1031 = "";
                class74.method1733();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1072[++Statics.field2326 - 1] = client.field773 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1072[--Statics.field2326] == 1;
            if (Statics.field1071.field1029 == var30) {
                Statics.field1071.field1029 = !var30;
                class74.method1733();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1072[++Statics.field2326 - 1] = Statics.field1071.field1029 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1072[++Statics.field2326 - 1] = class86.field1178;
            return 1;
        } else if (arg0 == 3154) {
            field1072[++Statics.field2326 - 1] = client.method720();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field590--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field2326 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field2326--;
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field2326--;
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field590--;
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field2326--;
            field1081[++Statics.field590 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field2326--;
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field2326 -= 2;
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field2326 -= 2;
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field2326 -= 2;
            field1081[++Statics.field590 - 1] = "";
            field1081[++Statics.field590 - 1] = "";
            field1081[++Statics.field590 - 1] = "";
            field1081[++Statics.field590 - 1] = "";
            field1081[++Statics.field590 - 1] = "";
            field1081[++Statics.field590 - 1] = "";
            field1081[++Statics.field590 - 1] = "";
            field1081[++Statics.field590 - 1] = "";
            field1081[++Statics.field590 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field2326--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field2326--;
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field2326--;
            return 1;
        } else if (arg0 == 3175) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field590--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field590--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gu.aw(ILcu;ZB)I")
    public static int method3584(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field2326 -= 3;
            client.method4618(field1072[Statics.field2326], field1072[Statics.field2326 + 1], field1072[Statics.field2326 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method351(field1072[--Statics.field2326]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field2326 -= 2;
            client.method967(field1072[Statics.field2326], field1072[Statics.field2326 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gg.as(ILcu;ZI)I")
    public static int method3566(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1072[++Statics.field2326 - 1] = client.field641;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field2326 -= 2;
            int var3 = field1072[Statics.field2326];
            int var4 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = class60.method3155(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field2326 -= 2;
            int var5 = field1072[Statics.field2326];
            int var6 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = class60.method55(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field2326 -= 2;
            int var7 = field1072[Statics.field2326];
            int var8 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = class60.method98(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = class240.method3372(var9).field3177;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = client.field671[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = client.field788[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = client.field763[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1929;
            int var14 = (Statics.field585.field937 >> 7) + Statics.field2477;
            int var15 = (Statics.field585.field923 >> 7) + Statics.field562;
            field1072[++Statics.field2326 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1072[++Statics.field2326 - 1] = client.field634 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field2326 -= 2;
            int var19 = field1072[Statics.field2326] + 32768;
            int var20 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = class60.method3155(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field2326 -= 2;
            int var21 = field1072[Statics.field2326] + 32768;
            int var22 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = class60.method55(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field2326 -= 2;
            int var23 = field1072[Statics.field2326] + 32768;
            int var24 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = class60.method98(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field798 >= 2) {
                field1072[++Statics.field2326 - 1] = client.field798;
            } else {
                field1072[++Statics.field2326 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1072[++Statics.field2326 - 1] = client.field844;
            return 1;
        } else if (arg0 == 3318) {
            field1072[++Statics.field2326 - 1] = client.field829;
            return 1;
        } else if (arg0 == 3321) {
            field1072[++Statics.field2326 - 1] = client.field796;
            return 1;
        } else if (arg0 == 3322) {
            field1072[++Statics.field2326 - 1] = client.field725;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field716) {
                field1072[++Statics.field2326 - 1] = 1;
            } else {
                field1072[++Statics.field2326 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1072[++Statics.field2326 - 1] = client.field632;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field2326 -= 4;
            int var25 = field1072[Statics.field2326];
            int var26 = field1072[Statics.field2326 + 1];
            int var27 = field1072[Statics.field2326 + 2];
            int var28 = field1072[Statics.field2326 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1072[++Statics.field2326 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ax.ak(ILcu;ZI)I")
    public static int method699(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field2326 -= 2;
            int var3 = field1072[Statics.field2326];
            int var4 = field1072[Statics.field2326 + 1];
            class252 var5 = class252.method1620(var3);
            if (var5.field3284 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3288; var6++) {
                if (var5.field3287[var6] == var4) {
                    field1081[++Statics.field590 - 1] = var5.field3290[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1081[++Statics.field590 - 1] = var5.field3282;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field2326 -= 4;
            int var7 = field1072[Statics.field2326];
            int var8 = field1072[Statics.field2326 + 1];
            int var9 = field1072[Statics.field2326 + 2];
            int var10 = field1072[Statics.field2326 + 3];
            class252 var11 = class252.method1620(var9);
            if (var11.field3285 != var7 || var11.field3284 != var8) {
                if (var8 == 115) {
                    field1081[++Statics.field590 - 1] = class225.field2800;
                } else {
                    field1072[++Statics.field2326 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3288; var12++) {
                if (var11.field3287[var12] == var10) {
                    if (var8 == 115) {
                        field1081[++Statics.field590 - 1] = var11.field3290[var12];
                    } else {
                        field1072[++Statics.field2326 - 1] = var11.field3289[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1081[++Statics.field590 - 1] = var11.field3282;
                } else {
                    field1072[++Statics.field2326 - 1] = var11.field3286;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1072[--Statics.field2326];
            class252 var14 = class252.method1620(var13);
            field1072[++Statics.field2326 - 1] = var14.method4169();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cq.au(ILcu;ZI)I")
    public static int method1893(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field586.field1046 == 0) {
                field1072[++Statics.field2326 - 1] = -2;
            } else if (Statics.field586.field1046 == 1) {
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = Statics.field586.field1044.method4765();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1072[--Statics.field2326];
            if (Statics.field586.method1676() && var3 >= 0 && var3 < Statics.field586.field1044.method4765()) {
                class285 var4 = (class285) Statics.field586.field1044.method4742(var3);
                field1081[++Statics.field590 - 1] = var4.method4681();
                field1081[++Statics.field590 - 1] = var4.method4680();
            } else {
                field1081[++Statics.field590 - 1] = "";
                field1081[++Statics.field590 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1072[--Statics.field2326];
            if (Statics.field586.method1676() && var5 >= 0 && var5 < Statics.field586.field1044.method4765()) {
                field1072[++Statics.field2326 - 1] = ((class279) Statics.field586.field1044.method4742(var5)).field3595;
            } else {
                field1072[++Statics.field2326 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1072[--Statics.field2326];
            if (Statics.field586.method1676() && var6 >= 0 && var6 < Statics.field586.field1044.method4765()) {
                field1072[++Statics.field2326 - 1] = ((class279) Statics.field586.field1044.method4742(var6)).field3592;
            } else {
                field1072[++Statics.field2326 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1081[--Statics.field590];
            int var8 = field1072[--Statics.field2326];
            class75.method3014(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1081[--Statics.field590];
            Statics.field586.method1718(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1081[--Statics.field590];
            Statics.field586.method1717(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1081[--Statics.field590];
            Statics.field586.method1685(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1081[--Statics.field590];
            Statics.field586.method1688(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1081[--Statics.field590];
            String var14 = client.method564(var13);
            field1072[++Statics.field2326 - 1] = Statics.field586.method1694(new class283(var14, Statics.field2325), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field2499 == null) {
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1081[++Statics.field590 - 1] = Statics.field2499.field3611;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field2499 == null) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = Statics.field2499.method4765();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1072[--Statics.field2326];
            if (Statics.field2499 == null || var15 >= Statics.field2499.method4765()) {
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1081[++Statics.field590 - 1] = Statics.field2499.method4742(var15).method4678().method4822();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1072[--Statics.field2326];
            if (Statics.field2499 == null || var16 >= Statics.field2499.method4765()) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = ((class279) Statics.field2499.method4742(var16)).method4801();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1072[--Statics.field2326];
            if (Statics.field2499 == null || var17 >= Statics.field2499.method4765()) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = ((class279) Statics.field2499.method4742(var17)).field3592;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1072[++Statics.field2326 - 1] = Statics.field2499 == null ? 0 : Statics.field2499.field3613;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1081[--Statics.field590];
            client.method254(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1072[++Statics.field2326 - 1] = Statics.field2499 == null ? 0 : Statics.field2499.field3614;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1081[--Statics.field590];
            Statics.method260(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method29();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field586.method1676()) {
                field1072[++Statics.field2326 - 1] = Statics.field586.field1042.method4765();
            } else {
                field1072[++Statics.field2326 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1072[--Statics.field2326];
            if (Statics.field586.method1676() && var20 >= 0 && var20 < Statics.field586.field1042.method4765()) {
                class278 var21 = (class278) Statics.field586.field1042.method4742(var20);
                field1081[++Statics.field590 - 1] = var21.method4681();
                field1081[++Statics.field590 - 1] = var21.method4680();
            } else {
                field1081[++Statics.field590 - 1] = "";
                field1081[++Statics.field590 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1081[--Statics.field590];
            String var23 = client.method564(var22);
            field1072[++Statics.field2326 - 1] = Statics.field586.method1682(new class283(var23, Statics.field2325)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1072[--Statics.field2326];
            if (Statics.field2499 == null || var24 >= Statics.field2499.method4765() || !Statics.field2499.method4742(var24).method4678().equals(Statics.field585.field605)) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field2499 == null || Statics.field2499.field3612 == null) {
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1081[++Statics.field590 - 1] = Statics.field2499.field3612;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1072[--Statics.field2326];
            if (Statics.field2499 == null || var25 >= Statics.field2499.method4765() || !((class273) Statics.field2499.method4742(var25)).method4665()) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1072[--Statics.field2326];
            if (Statics.field2499 == null || var26 >= Statics.field2499.method4765() || !((class273) Statics.field2499.method4742(var26)).method4667()) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field586.field1044.method4736();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1044.method4737(new class314(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1044.method4737(new class315(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1044.method4737(new class152(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1044.method4737(new class146(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1044.method4737(new class151(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1044.method4737(new class154(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1044.method4737(new class150(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1044.method4737(new class148(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1044.method4737(new class147(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1044.method4737(new class149(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field586.field1044.method4729();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field586.field1042.method4736();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1042.method4737(new class314(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1042.method4737(new class315(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field586.field1042.method4729();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field2499 != null) {
                Statics.field2499.method4736();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1072[--Statics.field2326] == 1;
            if (Statics.field2499 != null) {
                Statics.field2499.method4737(new class314(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1072[--Statics.field2326] == 1;
            if (Statics.field2499 != null) {
                Statics.field2499.method4737(new class315(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1072[--Statics.field2326] == 1;
            if (Statics.field2499 != null) {
                Statics.field2499.method4737(new class152(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1072[--Statics.field2326] == 1;
            if (Statics.field2499 != null) {
                Statics.field2499.method4737(new class146(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1072[--Statics.field2326] == 1;
            if (Statics.field2499 != null) {
                Statics.field2499.method4737(new class151(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1072[--Statics.field2326] == 1;
            if (Statics.field2499 != null) {
                Statics.field2499.method4737(new class154(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1072[--Statics.field2326] == 1;
            if (Statics.field2499 != null) {
                Statics.field2499.method4737(new class150(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1072[--Statics.field2326] == 1;
            if (Statics.field2499 != null) {
                Statics.field2499.method4737(new class148(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1072[--Statics.field2326] == 1;
            if (Statics.field2499 != null) {
                Statics.field2499.method4737(new class147(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1072[--Statics.field2326] == 1;
            if (Statics.field2499 != null) {
                Statics.field2499.method4737(new class149(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field2499 != null) {
                Statics.field2499.method4729();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1072[--Statics.field2326] == 1;
            Statics.field586.field1044.method4737(new class153(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1072[--Statics.field2326] == 1;
            if (Statics.field2499 != null) {
                Statics.field2499.method4737(new class153(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bk.ah(ILcu;ZI)I")
    public static int method970(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = client.field897[var3].method89();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = client.field897[var4].field52;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = client.field897[var5].field64;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = client.field897[var6].field55;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = client.field897[var7].field56;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = client.field897[var8].field54;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1072[--Statics.field2326];
            int var10 = client.field897[var9].method77();
            field1072[++Statics.field2326 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1072[--Statics.field2326];
            int var12 = client.field897[var11].method77();
            field1072[++Statics.field2326 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1072[--Statics.field2326];
            int var14 = client.field897[var13].method77();
            field1072[++Statics.field2326 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1072[--Statics.field2326];
            int var16 = client.field897[var15].method77();
            field1072[++Statics.field2326 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1072[--Statics.field2326] == 1;
            if (Statics.field1271 != null) {
                Statics.field1271.method57(class7.field29, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1072[--Statics.field2326] == 1;
            if (Statics.field1271 != null) {
                Statics.field1271.method57(class7.field30, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field2326 -= 2;
            boolean var19 = field1072[Statics.field2326] == 1;
            boolean var20 = field1072[Statics.field2326 + 1] == 1;
            if (Statics.field1271 != null) {
                client.field898.field622 = var20;
                Statics.field1271.method57(client.field898, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1072[--Statics.field2326] == 1;
            if (Statics.field1271 != null) {
                Statics.field1271.method57(class7.field27, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1072[--Statics.field2326] == 1;
            if (Statics.field1271 != null) {
                Statics.field1271.method57(class7.field28, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1072[++Statics.field2326 - 1] = Statics.field1271 == null ? 0 : Statics.field1271.field31.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1072[--Statics.field2326];
            class8 var24 = (class8) Statics.field1271.field31.get(var23);
            field1072[++Statics.field2326 - 1] = var24.field37;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1072[--Statics.field2326];
            class8 var26 = (class8) Statics.field1271.field31.get(var25);
            field1081[++Statics.field590 - 1] = var26.method64();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1072[--Statics.field2326];
            class8 var28 = (class8) Statics.field1271.field31.get(var27);
            field1081[++Statics.field590 - 1] = var28.method61();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1072[--Statics.field2326];
            class8 var30 = (class8) Statics.field1271.field31.get(var29);
            long var31 = class297.method481() - Statics.field1523 - var30.field39;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1081[++Statics.field590 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1072[--Statics.field2326];
            class8 var38 = (class8) Statics.field1271.field31.get(var37);
            field1072[++Statics.field2326 - 1] = var38.field38.field55;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1072[--Statics.field2326];
            class8 var40 = (class8) Statics.field1271.field31.get(var39);
            field1072[++Statics.field2326 - 1] = var40.field38.field64;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1072[--Statics.field2326];
            class8 var42 = (class8) Statics.field1271.field31.get(var41);
            field1072[++Statics.field2326 - 1] = var42.field38.field52;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("e.aq(ILcu;ZI)I")
    public static int method52(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field2326 -= 2;
            int var3 = field1072[Statics.field2326];
            int var4 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field2326 -= 2;
            int var5 = field1072[Statics.field2326];
            int var6 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field2326 -= 2;
            int var7 = field1072[Statics.field2326];
            int var8 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field2326 -= 2;
            int var9 = field1072[Statics.field2326];
            int var10 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field2326 -= 5;
            int var13 = field1072[Statics.field2326];
            int var14 = field1072[Statics.field2326 + 1];
            int var15 = field1072[Statics.field2326 + 2];
            int var16 = field1072[Statics.field2326 + 3];
            int var17 = field1072[Statics.field2326 + 4];
            field1072[++Statics.field2326 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field2326 -= 2;
            int var18 = field1072[Statics.field2326];
            int var19 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field2326 -= 2;
            int var20 = field1072[Statics.field2326];
            int var21 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field2326 -= 2;
            int var22 = field1072[Statics.field2326];
            int var23 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field2326 -= 2;
            int var24 = field1072[Statics.field2326];
            int var25 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field2326 -= 2;
            int var26 = field1072[Statics.field2326];
            int var27 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field2326 -= 2;
            int var28 = field1072[Statics.field2326];
            int var29 = field1072[Statics.field2326 + 1];
            if (var28 == 0) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field2326 -= 2;
            int var30 = field1072[Statics.field2326];
            int var31 = field1072[Statics.field2326 + 1];
            if (var30 == 0) {
                field1072[++Statics.field2326 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1072[++Statics.field2326 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1072[++Statics.field2326 - 1] = var30;
                    break;
                case 2:
                    field1072[++Statics.field2326 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1072[++Statics.field2326 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1072[++Statics.field2326 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1072[++Statics.field2326 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field2326 -= 2;
            int var32 = field1072[Statics.field2326];
            int var33 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field2326 -= 2;
            int var34 = field1072[Statics.field2326];
            int var35 = field1072[Statics.field2326 + 1];
            field1072[++Statics.field2326 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field2326 -= 3;
            long var36 = (long) field1072[Statics.field2326];
            long var38 = (long) field1072[Statics.field2326 + 1];
            long var40 = (long) field1072[Statics.field2326 + 2];
            field1072[++Statics.field2326 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("by.ao(ILcu;ZB)I")
    public static int method1030(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1081[--Statics.field590];
            int var4 = field1072[--Statics.field2326];
            field1081[++Statics.field590 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field590 -= 2;
            String var5 = field1081[Statics.field590];
            String var6 = field1081[Statics.field590 + 1];
            field1081[++Statics.field590 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1081[--Statics.field590];
            int var8 = field1072[--Statics.field2326];
            field1081[++Statics.field590 - 1] = var7 + class291.method1090(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1081[--Statics.field590];
            field1081[++Statics.field590 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1072[--Statics.field2326];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1076.setTime(new Date(var11));
            int var13 = field1076.get(5);
            int var14 = field1076.get(2);
            int var15 = field1076.get(1);
            field1081[++Statics.field590 - 1] = var13 + "-" + field1077[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field590 -= 2;
            String var16 = field1081[Statics.field590];
            String var17 = field1081[Statics.field590 + 1];
            if (Statics.field585.field595 != null && Statics.field585.field595.field2522) {
                field1081[++Statics.field590 - 1] = var17;
            } else {
                field1081[++Statics.field590 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1072[--Statics.field2326];
            field1081[++Statics.field590 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field590 -= 2;
            field1072[++Statics.field2326 - 1] = class291.method2737(class287.method3346(field1081[Statics.field590], field1081[Statics.field590 + 1], Statics.field2515));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1081[--Statics.field590];
            Statics.field2326 -= 2;
            int var20 = field1072[Statics.field2326];
            int var21 = field1072[Statics.field2326 + 1];
            byte[] var22 = Statics.field268.method3752(var21, 0);
            class294 var23 = new class294(var22);
            field1072[++Statics.field2326 - 1] = var23.method5043(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1081[--Statics.field590];
            Statics.field2326 -= 2;
            int var25 = field1072[Statics.field2326];
            int var26 = field1072[Statics.field2326 + 1];
            byte[] var27 = Statics.field268.method3752(var26, 0);
            class294 var28 = new class294(var27);
            field1072[++Statics.field2326 - 1] = var28.method4964(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field590 -= 2;
            String var29 = field1081[Statics.field590];
            String var30 = field1081[Statics.field590 + 1];
            if (field1072[--Statics.field2326] == 1) {
                field1081[++Statics.field590 - 1] = var29;
            } else {
                field1081[++Statics.field590 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1081[--Statics.field590];
            field1081[++Statics.field590 - 1] = class295.method4965(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1081[--Statics.field590];
            int var33 = field1072[--Statics.field2326];
            field1081[++Statics.field590 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = class291.method484((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = class291.method3330((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = class291.method567((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = class291.method3938((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1081[--Statics.field590];
            if (var38 == null) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1081[--Statics.field590];
            Statics.field2326 -= 2;
            int var40 = field1072[Statics.field2326];
            int var41 = field1072[Statics.field2326 + 1];
            field1081[++Statics.field590 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1081[--Statics.field590];
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
            field1081[++Statics.field590 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1081[--Statics.field590];
            int var48 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field590 -= 2;
            String var49 = field1081[Statics.field590];
            String var50 = field1081[Statics.field590 + 1];
            int var51 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1081[--Statics.field590];
            field1081[++Statics.field590 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bk.an(ILcu;ZI)I")
    public static int method971(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1072[--Statics.field2326];
            field1081[++Statics.field590 - 1] = Statics.method3278(var3).field3378;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field2326 -= 2;
            int var4 = field1072[Statics.field2326];
            int var5 = field1072[Statics.field2326 + 1];
            class255 var6 = Statics.method3278(var4);
            if (var5 < 1 || var5 > 5 || var6.field3388[var5 - 1] == null) {
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1081[++Statics.field590 - 1] = var6.field3388[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field2326 -= 2;
            int var7 = field1072[Statics.field2326];
            int var8 = field1072[Statics.field2326 + 1];
            class255 var9 = Statics.method3278(var7);
            if (var8 < 1 || var8 > 5 || var9.field3393[var8 - 1] == null) {
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1081[++Statics.field590 - 1] = var9.field3393[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = Statics.method3278(var10).field3390;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = Statics.method3278(var11).field3411 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1072[--Statics.field2326];
            class255 var13 = Statics.method3278(var12);
            if (var13.field3410 == -1 && var13.field3414 >= 0) {
                field1072[++Statics.field2326 - 1] = var13.field3414;
            } else {
                field1072[++Statics.field2326 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1072[--Statics.field2326];
            class255 var15 = Statics.method3278(var14);
            if (var15.field3410 >= 0 && var15.field3414 >= 0) {
                field1072[++Statics.field2326 - 1] = var15.field3414;
            } else {
                field1072[++Statics.field2326 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = Statics.method3278(var16).field3391 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1072[--Statics.field2326];
            class255 var18 = Statics.method3278(var17);
            if (var18.field3422 == -1 && var18.field3394 >= 0) {
                field1072[++Statics.field2326 - 1] = var18.field3394;
            } else {
                field1072[++Statics.field2326 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1072[--Statics.field2326];
            class255 var20 = Statics.method3278(var19);
            if (var20.field3422 >= 0 && var20.field3394 >= 0) {
                field1072[++Statics.field2326 - 1] = var20.field3394;
            } else {
                field1072[++Statics.field2326 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1081[--Statics.field590];
            int var22 = field1072[--Statics.field2326];
            client.method216(var21, var22 == 1);
            field1072[++Statics.field2326 - 1] = Statics.field385;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field3543 == null || Statics.field2331 >= Statics.field385) {
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = Statics.field3543[++Statics.field2331 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field2331 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.ar(ILcu;ZI)I")
    public static int method1003(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1072[++Statics.field2326 - 1] = client.field845;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field2326 -= 3;
            client.field845 = field1072[Statics.field2326];
            Statics.field2501 = class310.method752(field1072[Statics.field2326 + 1]);
            if (Statics.field2501 == null) {
                Statics.field2501 = class310.field3792;
            }
            client.field849 = field1072[Statics.field2326 + 2];
            class182 var3 = class182.method19(class178.field2176, client.field668.field1294);
            var3.field2303.method5094(client.field845);
            var3.field2303.method5094(Statics.field2501.field3794);
            var3.field2303.method5094(client.field849);
            client.field668.method2084(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1081[--Statics.field590];
            Statics.field2326 -= 2;
            int var5 = field1072[Statics.field2326];
            int var6 = field1072[Statics.field2326 + 1];
            class182 var7 = class182.method19(class178.field2222, client.field668.field1294);
            var7.field2303.method5094(class300.method2738(var4) + 2);
            var7.field2303.method5101(var4);
            var7.field2303.method5094(var5 - 1);
            var7.field2303.method5094(var6);
            client.field668.method2084(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field2326 -= 2;
            int var8 = field1072[Statics.field2326];
            int var9 = field1072[Statics.field2326 + 1];
            class65 var10 = class92.method3590(var8, var9);
            if (var10 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = 0;
                field1081[++Statics.field590 - 1] = "";
                field1081[++Statics.field590 - 1] = "";
                field1081[++Statics.field590 - 1] = "";
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = var10.field588;
                field1072[++Statics.field2326 - 1] = var10.field577;
                field1081[++Statics.field590 - 1] = var10.field579 == null ? "" : var10.field579;
                field1081[++Statics.field590 - 1] = var10.field578 == null ? "" : var10.field578;
                field1081[++Statics.field590 - 1] = var10.field584 == null ? "" : var10.field584;
                field1072[++Statics.field2326 - 1] = var10.method1053() ? 1 : (var10.method1070() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1072[--Statics.field2326];
            class65 var12 = class92.method3269(var11);
            if (var12 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = 0;
                field1081[++Statics.field590 - 1] = "";
                field1081[++Statics.field590 - 1] = "";
                field1081[++Statics.field590 - 1] = "";
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = var12.field583;
                field1072[++Statics.field2326 - 1] = var12.field577;
                field1081[++Statics.field590 - 1] = var12.field579 == null ? "" : var12.field579;
                field1081[++Statics.field590 - 1] = var12.field578 == null ? "" : var12.field578;
                field1081[++Statics.field590 - 1] = var12.field584 == null ? "" : var12.field584;
                field1072[++Statics.field2326 - 1] = var12.method1053() ? 1 : (var12.method1070() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2501 == null) {
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = Statics.field2501.field3794;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1081[--Statics.field590];
            int var14 = field1072[--Statics.field2326];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class225.field2924)) {
                var16 = 0;
                var13 = var13.substring(class225.field2924.length());
            } else if (var15.startsWith(class225.field2904)) {
                var16 = 1;
                var13 = var13.substring(class225.field2904.length());
            } else if (var15.startsWith(class225.field2928)) {
                var16 = 2;
                var13 = var13.substring(class225.field2928.length());
            } else if (var15.startsWith(class225.field2805)) {
                var16 = 3;
                var13 = var13.substring(class225.field2805.length());
            } else if (var15.startsWith(class225.field2973)) {
                var16 = 4;
                var13 = var13.substring(class225.field2973.length());
            } else if (var15.startsWith(class225.field2870)) {
                var16 = 5;
                var13 = var13.substring(class225.field2870.length());
            } else if (var15.startsWith(class225.field2896)) {
                var16 = 6;
                var13 = var13.substring(class225.field2896.length());
            } else if (var15.startsWith(class225.field3002)) {
                var16 = 7;
                var13 = var13.substring(class225.field3002.length());
            } else if (var15.startsWith(class225.field2940)) {
                var16 = 8;
                var13 = var13.substring(class225.field2940.length());
            } else if (var15.startsWith(class225.field2942)) {
                var16 = 9;
                var13 = var13.substring(class225.field2942.length());
            } else if (var15.startsWith(class225.field2944)) {
                var16 = 10;
                var13 = var13.substring(class225.field2944.length());
            } else if (var15.startsWith(class225.field2939)) {
                var16 = 11;
                var13 = var13.substring(class225.field2939.length());
            } else if (Statics.field2515 != class191.field2336) {
                if (var15.startsWith(class225.field2787)) {
                    var16 = 0;
                    var13 = var13.substring(class225.field2787.length());
                } else if (var15.startsWith(class225.field2927)) {
                    var16 = 1;
                    var13 = var13.substring(class225.field2927.length());
                } else if (var15.startsWith(class225.field2929)) {
                    var16 = 2;
                    var13 = var13.substring(class225.field2929.length());
                } else if (var15.startsWith(class225.field2931)) {
                    var16 = 3;
                    var13 = var13.substring(class225.field2931.length());
                } else if (var15.startsWith(class225.field2933)) {
                    var16 = 4;
                    var13 = var13.substring(class225.field2933.length());
                } else if (var15.startsWith(class225.field2848)) {
                    var16 = 5;
                    var13 = var13.substring(class225.field2848.length());
                } else if (var15.startsWith(class225.field2745)) {
                    var16 = 6;
                    var13 = var13.substring(class225.field2745.length());
                } else if (var15.startsWith(class225.field3036)) {
                    var16 = 7;
                    var13 = var13.substring(class225.field3036.length());
                } else if (var15.startsWith(class225.field2941)) {
                    var16 = 8;
                    var13 = var13.substring(class225.field2941.length());
                } else if (var15.startsWith(class225.field2943)) {
                    var16 = 9;
                    var13 = var13.substring(class225.field2943.length());
                } else if (var15.startsWith(class225.field2945)) {
                    var16 = 10;
                    var13 = var13.substring(class225.field2945.length());
                } else if (var15.startsWith(class225.field2887)) {
                    var16 = 11;
                    var13 = var13.substring(class225.field2887.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class225.field2744)) {
                var18 = 1;
                var13 = var13.substring(class225.field2744.length());
            } else if (var17.startsWith(class225.field2950)) {
                var18 = 2;
                var13 = var13.substring(class225.field2950.length());
            } else if (var17.startsWith(class225.field2952)) {
                var18 = 3;
                var13 = var13.substring(class225.field2952.length());
            } else if (var17.startsWith(class225.field2954)) {
                var18 = 4;
                var13 = var13.substring(class225.field2954.length());
            } else if (var17.startsWith(class225.field2772)) {
                var18 = 5;
                var13 = var13.substring(class225.field2772.length());
            } else if (Statics.field2515 != class191.field2336) {
                if (var17.startsWith(class225.field2768)) {
                    var18 = 1;
                    var13 = var13.substring(class225.field2768.length());
                } else if (var17.startsWith(class225.field2951)) {
                    var18 = 2;
                    var13 = var13.substring(class225.field2951.length());
                } else if (var17.startsWith(class225.field2953)) {
                    var18 = 3;
                    var13 = var13.substring(class225.field2953.length());
                } else if (var17.startsWith(class225.field2847)) {
                    var18 = 4;
                    var13 = var13.substring(class225.field2847.length());
                } else if (var17.startsWith(class225.field2981)) {
                    var18 = 5;
                    var13 = var13.substring(class225.field2981.length());
                }
            }
            class182 var19 = class182.method19(class178.field2250, client.field668.field1294);
            var19.field2303.method5094(0);
            int var20 = var19.field2303.field3703;
            var19.field2303.method5094(var14);
            var19.field2303.method5094(var16);
            var19.field2303.method5094(var18);
            class207.method102(var19.field2303, var13);
            var19.field2303.method5093(var19.field2303.field3703 - var20);
            client.field668.method2084(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field590 -= 2;
            String var21 = field1081[Statics.field590];
            String var22 = field1081[Statics.field590 + 1];
            class182 var23 = class182.method19(class178.field2178, client.field668.field1294);
            var23.field2303.method5095(0);
            int var24 = var23.field2303.field3703;
            var23.field2303.method5101(var21);
            class207.method102(var23.field2303, var22);
            var23.field2303.method5106(var23.field2303.field3703 - var24);
            client.field668.method2084(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field585 == null || Statics.field585.field605 == null) {
                var25 = "";
            } else {
                var25 = Statics.field585.field605.method4822();
            }
            field1081[++Statics.field590 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1072[++Statics.field2326 - 1] = client.field849;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = class92.method960(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = class92.method198(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = class92.method1899(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1081[--Statics.field590];
            client.method3160(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field847 = field1081[--Statics.field590].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1081[++Statics.field590 - 1] = client.field847;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1081[--Statics.field590];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ey.az(ILcu;ZI)I")
    public static int method3096(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1072[++Statics.field2326 - 1] = client.method4329();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1072[--Statics.field2326];
            if (var3 == 1 || var3 == 2) {
                client.method1027(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1072[++Statics.field2326 - 1] = Statics.field1071.field1038;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1072[--Statics.field2326];
            if (var4 == 1 || var4 == 2) {
                Statics.field1071.field1038 = var4;
                class74.method1733();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field2326--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("im.ay(ILcu;ZI)I")
    public static int method3960(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field2326 -= 2;
            int var3 = field1072[Statics.field2326];
            int var4 = field1072[Statics.field2326 + 1];
            if (!client.field873) {
                client.field698 = var3;
                client.field699 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1072[++Statics.field2326 - 1] = client.field698;
            return 1;
        } else if (arg0 == 5506) {
            field1072[++Statics.field2326 - 1] = client.field699;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1072[--Statics.field2326];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field705 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1072[++Statics.field2326 - 1] = client.field705;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eu.ag(ILcu;ZI)I")
    public static int method3072(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field733 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.ac(IB)I")
    public static int method641(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("client.al(IB)I")
    public static int method1574(int arg0) {
        return (int) ((Math.log((double) arg0) / field1084 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("bn.ae(ILcu;ZI)I")
    public static int method1136(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field2326 -= 2;
            client.field880 = (short) method641(field1072[Statics.field2326]);
            if (client.field880 <= 0) {
                client.field880 = 256;
            }
            client.field881 = (short) method641(field1072[Statics.field2326 + 1]);
            if (client.field881 <= 0) {
                client.field881 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field2326 -= 2;
            client.field743 = (short) field1072[Statics.field2326];
            if (client.field743 <= 0) {
                client.field743 = 256;
            }
            client.field859 = (short) field1072[Statics.field2326 + 1];
            if (client.field859 <= 0) {
                client.field859 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field2326 -= 4;
            client.field797 = (short) field1072[Statics.field2326];
            if (client.field797 <= 0) {
                client.field797 = 1;
            }
            client.field885 = (short) field1072[Statics.field2326 + 1];
            if (client.field885 <= 0) {
                client.field885 = 32767;
            } else if (client.field885 < client.field797) {
                client.field885 = client.field797;
            }
            client.field805 = (short) field1072[Statics.field2326 + 2];
            if (client.field805 <= 0) {
                client.field805 = 1;
            }
            client.field887 = (short) field1072[Statics.field2326 + 3];
            if (client.field887 <= 0) {
                client.field887 = 32767;
            } else if (client.field887 < client.field805) {
                client.field887 = client.field805;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field875 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                client.method3018(0, 0, client.field875.field2567, client.field875.field2693, false);
                field1072[++Statics.field2326 - 1] = client.field890;
                field1072[++Statics.field2326 - 1] = client.field891;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1072[++Statics.field2326 - 1] = client.field743;
            field1072[++Statics.field2326 - 1] = client.field859;
            return 1;
        } else if (arg0 == 6205) {
            field1072[++Statics.field2326 - 1] = method1574(client.field880);
            field1072[++Statics.field2326 - 1] = method1574(client.field881);
            return 1;
        } else if (arg0 == 6220) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1072[++Statics.field2326 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1072[++Statics.field2326 - 1] = Statics.field45;
            return 1;
        } else if (arg0 == 6223) {
            field1072[++Statics.field2326 - 1] = Statics.field1152;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.ad(ILcu;ZI)I")
    public static int method244(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1072[++Statics.field2326 - 1] = class72.method1048() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class72 var3 = class72.method2081();
            if (var3 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = 0;
                field1081[++Statics.field590 - 1] = "";
                field1072[++Statics.field2326 - 1] = 0;
                field1072[++Statics.field2326 - 1] = 0;
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1072[++Statics.field2326 - 1] = var3.field1005;
                field1072[++Statics.field2326 - 1] = var3.field1000;
                field1081[++Statics.field590 - 1] = var3.field1004;
                field1072[++Statics.field2326 - 1] = var3.field991;
                field1072[++Statics.field2326 - 1] = var3.field999;
                field1081[++Statics.field590 - 1] = var3.field1002;
            }
            return 1;
        } else if (arg0 == 6502) {
            class72 var4 = class72.method4871();
            if (var4 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = 0;
                field1081[++Statics.field590 - 1] = "";
                field1072[++Statics.field2326 - 1] = 0;
                field1072[++Statics.field2326 - 1] = 0;
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1072[++Statics.field2326 - 1] = var4.field1005;
                field1072[++Statics.field2326 - 1] = var4.field1000;
                field1081[++Statics.field590 - 1] = var4.field1004;
                field1072[++Statics.field2326 - 1] = var4.field991;
                field1072[++Statics.field2326 - 1] = var4.field999;
                field1081[++Statics.field590 - 1] = var4.field1002;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1072[--Statics.field2326];
            class72 var6 = null;
            for (int var7 = 0; var7 < class72.field995; var7++) {
                if (Statics.field1994[var7].field1005 == var5) {
                    var6 = Statics.field1994[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = 0;
                field1081[++Statics.field590 - 1] = "";
                field1072[++Statics.field2326 - 1] = 0;
                field1072[++Statics.field2326 - 1] = 0;
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1072[++Statics.field2326 - 1] = var6.field1005;
                field1072[++Statics.field2326 - 1] = var6.field1000;
                field1081[++Statics.field590 - 1] = var6.field1004;
                field1072[++Statics.field2326 - 1] = var6.field991;
                field1072[++Statics.field2326 - 1] = var6.field999;
                field1081[++Statics.field590 - 1] = var6.field1002;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field2326 -= 4;
            int var8 = field1072[Statics.field2326];
            boolean var9 = field1072[Statics.field2326 + 1] == 1;
            int var10 = field1072[Statics.field2326 + 2];
            boolean var11 = field1072[Statics.field2326 + 3] == 1;
            class72.method1138(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1072[--Statics.field2326];
            if (var12 >= 0 && var12 < class72.field995) {
                class72 var13 = Statics.field1994[var12];
                field1072[++Statics.field2326 - 1] = var13.field1005;
                field1072[++Statics.field2326 - 1] = var13.field1000;
                field1081[++Statics.field590 - 1] = var13.field1004;
                field1072[++Statics.field2326 - 1] = var13.field991;
                field1072[++Statics.field2326 - 1] = var13.field999;
                field1081[++Statics.field590 - 1] = var13.field1002;
            } else {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = 0;
                field1081[++Statics.field590 - 1] = "";
                field1072[++Statics.field2326 - 1] = 0;
                field1072[++Statics.field2326 - 1] = 0;
                field1081[++Statics.field590 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field774 = field1072[--Statics.field2326] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field2326 -= 2;
            int var14 = field1072[Statics.field2326];
            int var15 = field1072[Statics.field2326 + 1];
            class250 var16 = class250.method255(var15);
            if (var16.method4116()) {
                field1081[++Statics.field590 - 1] = class257.method4706(var14).method4346(var15, var16.field3274);
            } else {
                field1072[++Statics.field2326 - 1] = class257.method4706(var14).method4370(var15, var16.field3273);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field2326 -= 2;
            int var17 = field1072[Statics.field2326];
            int var18 = field1072[Statics.field2326 + 1];
            class250 var19 = class250.method255(var18);
            if (var19.method4116()) {
                field1081[++Statics.field590 - 1] = class254.method3616(var17).method4236(var18, var19.field3274);
            } else {
                field1072[++Statics.field2326 - 1] = class254.method3616(var17).method4235(var18, var19.field3273);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field2326 -= 2;
            int var20 = field1072[Statics.field2326];
            int var21 = field1072[Statics.field2326 + 1];
            class250 var22 = class250.method255(var21);
            if (var22.method4116()) {
                field1081[++Statics.field590 - 1] = Statics.method3278(var20).method4281(var21, var22.field3274);
            } else {
                field1072[++Statics.field2326 - 1] = Statics.method3278(var20).method4279(var21, var22.field3273);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field2326 -= 2;
            int var23 = field1072[Statics.field2326];
            int var24 = field1072[Statics.field2326 + 1];
            class250 var25 = class250.method255(var24);
            if (var25.method4116()) {
                field1081[++Statics.field590 - 1] = class251.method4071(var23).method4145(var24, var25.field3274);
            } else {
                field1072[++Statics.field2326 - 1] = class251.method4071(var23).method4144(var24, var25.field3273);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1072[++Statics.field2326 - 1] = client.field801 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1072[++Statics.field2326 - 1] = client.field737 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field590--;
            Statics.field2326--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field590--;
            Statics.field2326--;
            return 1;
        } else if (arg0 == 6524) {
            field1072[++Statics.field2326 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1072[++Statics.field2326 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1072[++Statics.field2326 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("m.aj(ILcu;ZI)I")
    public static int method245(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1929;
            int var4 = (Statics.field585.field937 >> 7) + Statics.field2477;
            int var5 = (Statics.field585.field923 >> 7) + Statics.field562;
            Statics.method707().method5864(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1072[--Statics.field2326];
            String var7 = "";
            class27 var8 = Statics.method707().method5922(var6);
            if (var8 != null) {
                var7 = var8.method276();
            }
            field1081[++Statics.field590 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1072[--Statics.field2326];
            Statics.method707().method5951(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1072[++Statics.field2326 - 1] = Statics.method707().method5889();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1072[--Statics.field2326];
            Statics.method707().method5879(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1072[++Statics.field2326 - 1] = Statics.method707().method5985() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class214 var11 = new class214(field1072[--Statics.field2326]);
            Statics.method707().method5863(var11.field2516, var11.field2518);
            return 1;
        } else if (arg0 == 6607) {
            class214 var12 = new class214(field1072[--Statics.field2326]);
            Statics.method707().method5884(var12.field2516, var12.field2518);
            return 1;
        } else if (arg0 == 6608) {
            class214 var13 = new class214(field1072[--Statics.field2326]);
            Statics.method707().method6012(var13.field2517, var13.field2516, var13.field2518);
            return 1;
        } else if (arg0 == 6609) {
            class214 var14 = new class214(field1072[--Statics.field2326]);
            Statics.method707().method5886(var14.field2517, var14.field2516, var14.field2518);
            return 1;
        } else if (arg0 == 6610) {
            field1072[++Statics.field2326 - 1] = Statics.method707().method5887();
            field1072[++Statics.field2326 - 1] = Statics.method707().method5921();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1072[--Statics.field2326];
            class27 var16 = Statics.method707().method5922(var15);
            if (var16 == null) {
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = var16.method286().method3597();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1072[--Statics.field2326];
            class27 var18 = Statics.method707().method5922(var17);
            if (var18 == null) {
                field1072[++Statics.field2326 - 1] = 0;
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = (var18.method280() - var18.method339() + 1) * 64;
                field1072[++Statics.field2326 - 1] = (var18.method282() - var18.method281() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1072[--Statics.field2326];
            class27 var20 = Statics.method707().method5922(var19);
            if (var20 == null) {
                field1072[++Statics.field2326 - 1] = 0;
                field1072[++Statics.field2326 - 1] = 0;
                field1072[++Statics.field2326 - 1] = 0;
                field1072[++Statics.field2326 - 1] = 0;
            } else {
                field1072[++Statics.field2326 - 1] = var20.method339() * 64;
                field1072[++Statics.field2326 - 1] = var20.method281() * 64;
                field1072[++Statics.field2326 - 1] = var20.method280() * 64 + 64 - 1;
                field1072[++Statics.field2326 - 1] = var20.method282() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1072[--Statics.field2326];
            class27 var22 = Statics.method707().method5922(var21);
            if (var22 == null) {
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = var22.method289();
            }
            return 1;
        } else if (arg0 == 6615) {
            class214 var23 = Statics.method707().method5857();
            if (var23 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = var23.field2516;
                field1072[++Statics.field2326 - 1] = var23.field2518;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1072[++Statics.field2326 - 1] = Statics.method707().method5998();
            return 1;
        } else if (arg0 == 6617) {
            class214 var24 = new class214(field1072[--Statics.field2326]);
            class27 var25 = Statics.method707().method5867();
            if (var25 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method270(var24.field2517, var24.field2516, var24.field2518);
            if (var26 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = var26[0];
                field1072[++Statics.field2326 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class214 var27 = new class214(field1072[--Statics.field2326]);
            class27 var28 = Statics.method707().method5867();
            if (var28 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = -1;
                return 1;
            }
            class214 var29 = var28.method271(var27.field2516, var27.field2518);
            if (var29 == null) {
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = var29.method3597();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field2326 -= 2;
            int var30 = field1072[Statics.field2326];
            class214 var31 = new class214(field1072[Statics.field2326 + 1]);
            method60(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field2326 -= 2;
            int var32 = field1072[Statics.field2326];
            class214 var33 = new class214(field1072[Statics.field2326 + 1]);
            method60(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field2326 -= 2;
            int var34 = field1072[Statics.field2326];
            class214 var35 = new class214(field1072[Statics.field2326 + 1]);
            class27 var36 = Statics.method707().method5922(var34);
            if (var36 == null) {
                field1072[++Statics.field2326 - 1] = 0;
                return 1;
            } else {
                field1072[++Statics.field2326 - 1] = var36.method268(var35.field2517, var35.field2516, var35.field2518) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1072[++Statics.field2326 - 1] = Statics.method707().method5890();
            field1072[++Statics.field2326 - 1] = Statics.method707().method5946();
            return 1;
        } else if (arg0 == 6623) {
            class214 var37 = new class214(field1072[--Statics.field2326]);
            class27 var38 = Statics.method707().method5877(var37.field2517, var37.field2516, var37.field2518);
            if (var38 == null) {
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = var38.method273();
            }
            return 1;
        } else if (arg0 == 6624) {
            Statics.method707().method6027(field1072[--Statics.field2326]);
            return 1;
        } else if (arg0 == 6625) {
            Statics.method707().method5893();
            return 1;
        } else if (arg0 == 6626) {
            Statics.method707().method5894(field1072[--Statics.field2326]);
            return 1;
        } else if (arg0 == 6627) {
            Statics.method707().method5861();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1072[--Statics.field2326] == 1;
            Statics.method707().method5971(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1072[--Statics.field2326];
            Statics.method707().method5919(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1072[--Statics.field2326];
            Statics.method707().method5898(var41);
            return 1;
        } else if (arg0 == 6631) {
            Statics.method707().method5930();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1072[--Statics.field2326] == 1;
            Statics.method707().method5900(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field2326 -= 2;
            int var43 = field1072[Statics.field2326];
            boolean var44 = field1072[Statics.field2326 + 1] == 1;
            Statics.method707().method5901(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field2326 -= 2;
            int var45 = field1072[Statics.field2326];
            boolean var46 = field1072[Statics.field2326 + 1] == 1;
            Statics.method707().method5902(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1072[++Statics.field2326 - 1] = Statics.method707().method5903() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = Statics.method707().method5904(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1072[--Statics.field2326];
            field1072[++Statics.field2326 - 1] = Statics.method707().method5955(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field2326 -= 2;
            int var49 = field1072[Statics.field2326];
            class214 var50 = new class214(field1072[Statics.field2326 + 1]);
            class214 var51 = Statics.method707().method5913(var49, var50);
            if (var51 == null) {
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = var51.method3597();
            }
            return 1;
        } else if (arg0 == 6639) {
            class35 var52 = Statics.method707().method5910();
            if (var52 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = var52.method183();
                field1072[++Statics.field2326 - 1] = var52.field277.method3597();
            }
            return 1;
        } else if (arg0 == 6640) {
            class35 var53 = Statics.method707().method5911();
            if (var53 == null) {
                field1072[++Statics.field2326 - 1] = -1;
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = var53.method183();
                field1072[++Statics.field2326 - 1] = var53.field277.method3597();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1072[--Statics.field2326];
            class242 var55 = class242.method103(var54);
            if (var55.field3189 == null) {
                field1081[++Statics.field590 - 1] = "";
            } else {
                field1081[++Statics.field590 - 1] = var55.field3189;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1072[--Statics.field2326];
            class242 var57 = class242.method103(var56);
            field1072[++Statics.field2326 - 1] = var57.field3187;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1072[--Statics.field2326];
            class242 var59 = class242.method103(var58);
            if (var59 == null) {
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = var59.field3202;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1072[--Statics.field2326];
            class242 var61 = class242.method103(var60);
            if (var61 == null) {
                field1072[++Statics.field2326 - 1] = -1;
            } else {
                field1072[++Statics.field2326 - 1] = var61.field3198;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1072[++Statics.field2326 - 1] = Statics.field222.field345;
            return 1;
        } else if (arg0 == 6698) {
            field1072[++Statics.field2326 - 1] = Statics.field222.field344.method3597();
            return 1;
        } else if (arg0 == 6699) {
            field1072[++Statics.field2326 - 1] = Statics.field222.field343.method3597();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cx.ax(II)V")
    public static void method1975(int arg0) {
        if (arg0 == -1 || !class218.method3537(arg0)) {
            return;
        }
        class218[] var1 = Statics.field1950[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2639 != null) {
                class63 var4 = new class63();
                var4.field552 = var3;
                var4.field550 = var3.field2639;
                method53(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("x.at(ILht;ZI)V")
    public static void method60(int arg0, class214 arg1, boolean arg2) {
        class27 var3 = Statics.method707().method5922(arg0);
        int var4 = Statics.field585.field613;
        int var5 = (Statics.field585.field937 >> 7) + Statics.field2477;
        int var6 = (Statics.field585.field923 >> 7) + Statics.field562;
        class214 var7 = new class214(var4, var5, var6);
        Statics.method707().method5870(var3, var7, arg1, arg2);
    }
}
