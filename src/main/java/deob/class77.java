package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bw")
public class class77 {

    @ObfuscatedName("bw.r")
    public static int[] field1089 = new int[5];

    @ObfuscatedName("bw.p")
    public static int[][] field1092 = new int[5][5000];

    @ObfuscatedName("bw.q")
    public static int[] field1080 = new int[1000];

    @ObfuscatedName("bw.y")
    public static String[] field1082 = new String[1000];

    @ObfuscatedName("bw.c")
    public static int field1084 = 0;

    @ObfuscatedName("bw.b")
    public static class57[] field1088 = new class57[50];

    @ObfuscatedName("bw.e")
    public static Calendar field1086 = Calendar.getInstance();

    @ObfuscatedName("bw.w")
    public static final String[] field1087 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bw.g")
    public static boolean field1075 = false;

    @ObfuscatedName("bw.x")
    public static boolean field1076 = false;

    @ObfuscatedName("bw.h")
    public static int field1090 = 0;

    @ObfuscatedName("bw.d")
    public static final double field1078 = Math.log(2.0D);

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("if.z(Lba;B)V")
    public static void method4064(class63 arg0) {
        method719(arg0, 500000);
    }

    @ObfuscatedName("ah.n(Lba;IB)V")
    public static void method719(class63 arg0, int arg1) {
        Object[] var2 = arg0.field572;
        class93 var4;
        if (class294.method3710(arg0.field570)) {
            Statics.field3307 = (class42) var2[0];
            class242 var3 = class242.method2284(Statics.field3307.field337);
            var4 = class93.method670(arg0.field570, var3.field3207, var3.field3194);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class93.method3263(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field1081 = 0;
        Statics.field1083 = 0;
        int var6 = -1;
        int[] var7 = var4.field1269;
        int[] var8 = var4.field1267;
        byte var9 = -1;
        field1084 = 0;
        field1075 = false;
        try {
            Statics.field1079 = new int[var4.field1270];
            int var10 = 0;
            Statics.field1925 = new String[var4.field1271];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field562;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field563;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field566 == null ? -1 : arg0.field566.field2546;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field564;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field566 == null ? -1 : arg0.field566.field2674;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field559 == null ? -1 : arg0.field559.field2546;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field559 == null ? -1 : arg0.field559.field2674;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field565;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field567;
                    }
                    Statics.field1079[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field568;
                    }
                    Statics.field1925[var11++] = var14;
                }
            }
            int var15 = 0;
            field1090 = arg0.field569;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1267[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method1928(var53, var4, var43);
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
                    field1080[++Statics.field1081 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1080[++Statics.field1081 - 1] = class213.field2511[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class213.field2511[var17] = field1080[--Statics.field1081];
                    client.method3153(var17);
                } else if (var53 == 3) {
                    field1082[++Statics.field1083 - 1] = var4.field1272[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field1081 -= 2;
                    if (field1080[Statics.field1081] != field1080[Statics.field1081 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field1081 -= 2;
                    if (field1080[Statics.field1081] == field1080[Statics.field1081 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field1081 -= 2;
                    if (field1080[Statics.field1081] < field1080[Statics.field1081 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field1081 -= 2;
                    if (field1080[Statics.field1081] > field1080[Statics.field1081 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1084 == 0) {
                        return;
                    }
                    class57 var18 = field1088[--field1084];
                    var4 = var18.field505;
                    var7 = var4.field1269;
                    var8 = var4.field1267;
                    var6 = var18.field506;
                    Statics.field1079 = var18.field507;
                    Statics.field1925 = var18.field508;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1080[++Statics.field1081 - 1] = class213.method367(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class213.method3956(var20, field1080[--Statics.field1081]);
                } else if (var53 == 31) {
                    Statics.field1081 -= 2;
                    if (field1080[Statics.field1081] <= field1080[Statics.field1081 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field1081 -= 2;
                    if (field1080[Statics.field1081] >= field1080[Statics.field1081 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1080[++Statics.field1081 - 1] = Statics.field1079[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field1079[var8[var6]] = field1080[--Statics.field1081];
                } else if (var53 == 35) {
                    field1082[++Statics.field1083 - 1] = Statics.field1925[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field1925[var8[var6]] = field1082[--Statics.field1083];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field1083 -= var21;
                    String var22 = class291.method4308(field1082, Statics.field1083, var21);
                    field1082[++Statics.field1083 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field1081--;
                } else if (var53 == 39) {
                    Statics.field1083--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class93 var24 = class93.method3263(var23);
                    int[] var25 = new int[var24.field1270];
                    String[] var26 = new String[var24.field1271];
                    for (int var27 = 0; var27 < var24.field1268; var27++) {
                        var25[var27] = field1080[Statics.field1081 - var24.field1268 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1273; var28++) {
                        var26[var28] = field1082[Statics.field1083 - var24.field1273 + var28];
                    }
                    Statics.field1081 -= var24.field1268;
                    Statics.field1083 -= var24.field1273;
                    class57 var29 = new class57();
                    var29.field505 = var4;
                    var29.field506 = var6;
                    var29.field507 = Statics.field1079;
                    var29.field508 = Statics.field1925;
                    field1088[++field1084 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1269;
                    var8 = var24.field1267;
                    var6 = -1;
                    Statics.field1079 = var25;
                    Statics.field1925 = var26;
                } else if (var53 == 42) {
                    field1080[++Statics.field1081 - 1] = Statics.field2385.method1960(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field2385.method1980(var8[var6], field1080[--Statics.field1081]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1080[--Statics.field1081];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1089[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1092[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1080[--Statics.field1081];
                    if (var36 < 0 || var36 >= field1089[var35]) {
                        throw new RuntimeException();
                    }
                    field1080[++Statics.field1081 - 1] = field1092[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field1081 -= 2;
                    int var38 = field1080[Statics.field1081];
                    if (var38 < 0 || var38 >= field1089[var37]) {
                        throw new RuntimeException();
                    }
                    field1092[var37][var38] = field1080[Statics.field1081 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field2385.method1951(var8[var6]);
                    if (var39 == null) {
                        var39 = class225.field2755;
                    }
                    field1082[++Statics.field1083 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field2385.method1956(var8[var6], field1082[--Statics.field1083]);
                } else if (var53 == 49) {
                    String var40 = Statics.field2385.method1955(var8[var6]);
                    field1082[++Statics.field1083 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field2385.method1954(var8[var6], field1082[--Statics.field1083]);
                } else if (var53 == 60) {
                    class316 var41 = var4.field1274[var8[var6]];
                    class180 var42 = (class180) var41.method5362((long) field1080[--Statics.field1081]);
                    if (var42 != null) {
                        var6 += var42.field2092;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2094).append(" ");
            for (int var47 = field1084 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1088[var47].field505.field2094).append(" ");
            }
            var46.append("").append(var9);
            class341.method511(var46.toString(), var51);
        } finally {
            if (field1075) {
                field1076 = true;
                client.method766();
                field1076 = false;
                field1075 = false;
            }
        }
    }

    @ObfuscatedName("cj.v(ILcu;ZI)I")
    public static int method1928(int arg0, class93 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method278(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1918(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method1869(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return Statics.method4749(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method664(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method954(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method4827(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method3106(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method3943(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method1630(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3256(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1918(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method1869(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return Statics.method4749(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method664(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method954(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method765(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method1569(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method3110(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method442(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3256(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method2010(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return Statics.method2068(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method3254(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method4971(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method4690(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method267(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method588(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method163(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3708(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method1000(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return Statics.method733(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method616(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method3707(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method2951(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3702(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method3101(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.u(ILcu;ZI)I")
    public static int method278(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1081 -= 3;
            int var3 = field1080[Statics.field1081];
            int var4 = field1080[Statics.field1081 + 1];
            int var5 = field1080[Statics.field1081 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class218 var6 = class218.method728(var3);
            if (var6.field2676 == null) {
                var6.field2676 = new class218[var5 + 1];
            }
            if (var6.field2676.length <= var5) {
                class218[] var7 = new class218[var5 + 1];
                for (int var8 = 0; var8 < var6.field2676.length; var8++) {
                    var7[var8] = var6.field2676[var8];
                }
                var6.field2676 = var7;
            }
            if (var5 > 0 && var6.field2676[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class218 var9 = new class218();
            var9.field2548 = var4;
            var9.field2565 = var9.field2546 = var6.field2546;
            var9.field2674 = var5;
            var9.field2593 = true;
            var6.field2676[var5] = var9;
            if (arg2) {
                Statics.field77 = var9;
            } else {
                Statics.field3253 = var9;
            }
            client.method237(var6);
            return 1;
        } else if (arg0 == 101) {
            class218 var10 = arg2 ? Statics.field77 : Statics.field3253;
            class218 var11 = class218.method728(var10.field2546);
            var11.field2676[var10.field2674] = null;
            client.method237(var11);
            return 1;
        } else if (arg0 == 102) {
            class218 var12 = class218.method728(field1080[--Statics.field1081]);
            var12.field2676 = null;
            client.method237(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1081 -= 2;
            int var13 = field1080[Statics.field1081];
            int var14 = field1080[Statics.field1081 + 1];
            class218 var15 = class218.method61(var13, var14);
            if (var15 == null || var14 == -1) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = 1;
                if (arg2) {
                    Statics.field77 = var15;
                } else {
                    Statics.field3253 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class218 var16 = class218.method728(field1080[--Statics.field1081]);
            if (var16 == null) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = 1;
                if (arg2) {
                    Statics.field77 = var16;
                } else {
                    Statics.field3253 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cd.r(ILcu;ZI)I")
    public static int method1918(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1080[--Statics.field1081];
            var4 = class218.method728(var3);
        } else {
            var4 = arg2 ? Statics.field77 : Statics.field3253;
        }
        if (arg0 == 1000) {
            Statics.field1081 -= 4;
            var4.field2555 = field1080[Statics.field1081];
            var4.field2617 = field1080[Statics.field1081 + 1];
            var4.field2571 = field1080[Statics.field1081 + 2];
            var4.field2552 = field1080[Statics.field1081 + 3];
            client.method237(var4);
            Statics.field1710.method1266(var4);
            if (var3 != -1 && var4.field2548 == 0) {
                client.method836(Statics.field1967[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1081 -= 4;
            var4.field2557 = field1080[Statics.field1081];
            var4.field2558 = field1080[Statics.field1081 + 1];
            var4.field2543 = field1080[Statics.field1081 + 2];
            var4.field2597 = field1080[Statics.field1081 + 3];
            client.method237(var4);
            Statics.field1710.method1266(var4);
            if (var3 != -1 && var4.field2548 == 0) {
                client.method836(Statics.field1967[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1080[--Statics.field1081] == 1;
            if (var4.field2541 != var5) {
                var4.field2541 = var5;
                client.method237(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2686 = field1080[--Statics.field1081] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2687 = field1080[--Statics.field1081] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("co.p(ILcu;ZB)I")
    public static int method1869(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1080[--Statics.field1081];
            var4 = class218.method728(var3);
        } else {
            var4 = arg2 ? Statics.field77 : Statics.field3253;
        }
        if (arg0 == 1100) {
            Statics.field1081 -= 2;
            var4.field2567 = field1080[Statics.field1081];
            if (var4.field2567 > var4.field2675 - var4.field2672) {
                var4.field2567 = var4.field2675 - var4.field2672;
            }
            if (var4.field2567 < 0) {
                var4.field2567 = 0;
            }
            var4.field2568 = field1080[Statics.field1081 + 1];
            if (var4.field2568 > var4.field2570 - var4.field2639) {
                var4.field2568 = var4.field2570 - var4.field2639;
            }
            if (var4.field2568 < 0) {
                var4.field2568 = 0;
            }
            client.method237(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2562 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2619 = field1080[--Statics.field1081] == 1;
            client.method237(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2577 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2579 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2545 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2583 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2584 = field1080[--Statics.field1081] == 1;
            client.method237(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2666 = 1;
            var4.field2590 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1081 -= 6;
            var4.field2595 = field1080[Statics.field1081];
            var4.field2596 = field1080[Statics.field1081 + 1];
            var4.field2551 = field1080[Statics.field1081 + 2];
            var4.field2598 = field1080[Statics.field1081 + 3];
            var4.field2612 = field1080[Statics.field1081 + 4];
            var4.field2600 = field1080[Statics.field1081 + 5];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1080[--Statics.field1081];
            if (var4.field2556 != var5) {
                var4.field2556 = var5;
                var4.field2601 = 0;
                var4.field2604 = 0;
                client.method237(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2603 = field1080[--Statics.field1081] == 1;
            client.method237(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1082[--Statics.field1083];
            if (!var6.equals(var4.field2607)) {
                var4.field2607 = var6;
                client.method237(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2606 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1081 -= 3;
            var4.field2610 = field1080[Statics.field1081];
            var4.field2547 = field1080[Statics.field1081 + 1];
            var4.field2624 = field1080[Statics.field1081 + 2];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2608 = field1080[--Statics.field1081] == 1;
            client.method237(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2569 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2586 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2635 = field1080[--Statics.field1081] == 1;
            client.method237(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2588 = field1080[--Statics.field1081] == 1;
            client.method237(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1081 -= 2;
            var4.field2675 = field1080[Statics.field1081];
            var4.field2570 = field1080[Statics.field1081 + 1];
            client.method237(var4);
            if (var3 != -1 && var4.field2548 == 0) {
                client.method836(Statics.field1967[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3149(var4.field2546, var4.field2674);
            client.field707 = var4;
            client.method237(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2582 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2564 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2578 = field1080[--Statics.field1081];
            client.method237(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1080[--Statics.field1081];
            class323 var8 = (class323) class196.method3185(class323.method2067(), var7);
            if (var8 != null) {
                var4.field2576 = var8;
                client.method237(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1080[--Statics.field1081] == 1;
            var4.field2580 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1080[--Statics.field1081] == 1;
            var4.field2655 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.m(ILcu;ZI)I")
    public static int method664(int arg0, class93 arg1, boolean arg2) {
        boolean var3 = true;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class218.method728(field1080[--Statics.field1081]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field77 : Statics.field3253;
        }
        if (arg0 == 1300) {
            int var5 = field1080[--Statics.field1081] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3650(var5, field1082[--Statics.field1083]);
                return 1;
            } else {
                Statics.field1083--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1081 -= 2;
            int var6 = field1080[Statics.field1081];
            int var7 = field1080[Statics.field1081 + 1];
            var4.field2633 = class218.method61(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2575 = field1080[--Statics.field1081] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2563 = field1080[--Statics.field1081];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2629 = field1080[--Statics.field1081];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2625 = field1082[--Statics.field1083];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2679 = field1082[--Statics.field1083];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2626 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2688 = field1080[--Statics.field1081] == 1;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1081 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1080[Statics.field1081 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1080[Statics.field1081 + var10];
                        var9[var10 / 2] = (byte) field1080[Statics.field1081 + var10 + 1];
                    }
                }
            } else {
                Statics.field1081 -= 2;
                var8 = new byte[] { (byte) field1080[Statics.field1081] };
                var9 = new byte[] { (byte) field1080[Statics.field1081 + 1] };
            }
            int var11 = field1080[--Statics.field1081] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method3551(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1081 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1080[Statics.field1081] };
            byte[] var14 = new byte[] { (byte) field1080[Statics.field1081 + 1] };
            method3551(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1081 -= 3;
            int var15 = field1080[Statics.field1081] - 1;
            int var16 = field1080[Statics.field1081 + 1];
            int var17 = field1080[Statics.field1081 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method1644(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1080[--Statics.field1081];
            int var20 = field1080[--Statics.field1081];
            method1644(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1081--;
            int var21 = field1080[Statics.field1081] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method155(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method155(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gz.y(Lho;I[B[BB)V")
    public static final void method3551(class218 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2553 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2553 = new byte[11][];
            arg0.field2622 = new byte[11][];
            arg0.field2587 = new int[11];
            arg0.field2549 = new int[11];
        }
        arg0.field2553[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2620 = false;
            for (int var4 = 0; var4 < arg0.field2553.length; var4++) {
                if (arg0.field2553[var4] != null) {
                    arg0.field2620 = true;
                    break;
                }
            }
        } else {
            arg0.field2620 = true;
        }
        arg0.field2622[arg1] = arg3;
    }

    @ObfuscatedName("br.i(Lho;IIII)V")
    public static final void method1644(class218 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2587 == null) {
            throw new RuntimeException();
        }
        arg0.field2587[arg1] = arg2;
        arg0.field2549[arg1] = arg3;
    }

    @ObfuscatedName("a.c(Lho;II)V")
    public static final void method155(class218 arg0, int arg1) {
        if (arg0.field2553 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2685 == null) {
            arg0.field2685 = new int[arg0.field2553.length];
        }
        arg0.field2685[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("bm.b(ILcu;ZB)I")
    public static int method954(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method728(field1080[--Statics.field1081]);
        } else {
            var3 = arg2 ? Statics.field77 : Statics.field3253;
        }
        String var4 = field1082[--Statics.field1083];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1080[--Statics.field1081];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1080[--Statics.field1081];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1082[--Statics.field1083];
            } else {
                var7[var8] = Integer.valueOf(field1080[--Statics.field1081]);
            }
        }
        int var9 = field1080[--Statics.field1081];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2634 = var7;
        } else if (arg0 == 1401) {
            var3.field2637 = var7;
        } else if (arg0 == 1402) {
            var3.field2636 = var7;
        } else if (arg0 == 1403) {
            var3.field2638 = var7;
        } else if (arg0 == 1404) {
            var3.field2640 = var7;
        } else if (arg0 == 1405) {
            var3.field2641 = var7;
        } else if (arg0 == 1406) {
            var3.field2644 = var7;
        } else if (arg0 == 1407) {
            var3.field2645 = var7;
            var3.field2646 = var5;
        } else if (arg0 == 1408) {
            var3.field2651 = var7;
        } else if (arg0 == 1409) {
            var3.field2652 = var7;
        } else if (arg0 == 1410) {
            var3.field2642 = var7;
        } else if (arg0 == 1411) {
            var3.field2561 = var7;
        } else if (arg0 == 1412) {
            var3.field2613 = var7;
        } else if (arg0 == 1414) {
            var3.field2647 = var7;
            var3.field2648 = var5;
        } else if (arg0 == 1415) {
            var3.field2649 = var7;
            var3.field2650 = var5;
        } else if (arg0 == 1416) {
            var3.field2643 = var7;
        } else if (arg0 == 1417) {
            var3.field2653 = var7;
        } else if (arg0 == 1418) {
            var3.field2680 = var7;
        } else if (arg0 == 1419) {
            var3.field2654 = var7;
        } else if (arg0 == 1420) {
            var3.field2554 = var7;
        } else if (arg0 == 1421) {
            var3.field2657 = var7;
        } else if (arg0 == 1422) {
            var3.field2658 = var7;
        } else if (arg0 == 1423) {
            var3.field2659 = var7;
        } else if (arg0 == 1424) {
            var3.field2660 = var7;
        } else if (arg0 == 1425) {
            var3.field2662 = var7;
        } else if (arg0 == 1426) {
            var3.field2663 = var7;
        } else if (arg0 == 1427) {
            var3.field2661 = var7;
        } else {
            return 2;
        }
        var3.field2632 = true;
        return 1;
    }

    @ObfuscatedName("ko.o(ILcu;ZI)I")
    public static int method4827(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field77 : Statics.field3253;
        if (arg0 == 1500) {
            field1080[++Statics.field1081 - 1] = var3.field2611;
            return 1;
        } else if (arg0 == 1501) {
            field1080[++Statics.field1081 - 1] = var3.field2566;
            return 1;
        } else if (arg0 == 1502) {
            field1080[++Statics.field1081 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 1503) {
            field1080[++Statics.field1081 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 1504) {
            field1080[++Statics.field1081 - 1] = var3.field2541 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1080[++Statics.field1081 - 1] = var3.field2565;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fy.a(ILcu;ZI)I")
    public static int method3106(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field77 : Statics.field3253;
        if (arg0 == 1600) {
            field1080[++Statics.field1081 - 1] = var3.field2567;
            return 1;
        } else if (arg0 == 1601) {
            field1080[++Statics.field1081 - 1] = var3.field2568;
            return 1;
        } else if (arg0 == 1602) {
            field1082[++Statics.field1083 - 1] = var3.field2607;
            return 1;
        } else if (arg0 == 1603) {
            field1080[++Statics.field1081 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 1604) {
            field1080[++Statics.field1081 - 1] = var3.field2570;
            return 1;
        } else if (arg0 == 1605) {
            field1080[++Statics.field1081 - 1] = var3.field2600;
            return 1;
        } else if (arg0 == 1606) {
            field1080[++Statics.field1081 - 1] = var3.field2551;
            return 1;
        } else if (arg0 == 1607) {
            field1080[++Statics.field1081 - 1] = var3.field2612;
            return 1;
        } else if (arg0 == 1608) {
            field1080[++Statics.field1081 - 1] = var3.field2598;
            return 1;
        } else if (arg0 == 1609) {
            field1080[++Statics.field1081 - 1] = var3.field2577;
            return 1;
        } else if (arg0 == 1610) {
            field1080[++Statics.field1081 - 1] = var3.field2578;
            return 1;
        } else if (arg0 == 1611) {
            field1080[++Statics.field1081 - 1] = var3.field2562;
            return 1;
        } else if (arg0 == 1612) {
            field1080[++Statics.field1081 - 1] = var3.field2564;
            return 1;
        } else if (arg0 == 1613) {
            field1080[++Statics.field1081 - 1] = var3.field2576.method25();
            return 1;
        } else if (arg0 == 1614) {
            field1080[++Statics.field1081 - 1] = var3.field2655 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iq.e(ILcu;ZI)I")
    public static int method3943(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field77 : Statics.field3253;
        if (arg0 == 1700) {
            field1080[++Statics.field1081 - 1] = var3.field2572;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2572 == -1) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = var3.field2673;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1080[++Statics.field1081 - 1] = var3.field2674;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.x(ILcu;ZI)I")
    public static int method1630(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field77 : Statics.field3253;
        if (arg0 == 1800) {
            field1080[++Statics.field1081 - 1] = class219.method21(client.method15(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1080[--Statics.field1081];
            int var5 = var4 - 1;
            if (var3.field2626 == null || var5 >= var3.field2626.length || var3.field2626[var5] == null) {
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1082[++Statics.field1083 - 1] = var3.field2626[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2625 == null) {
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1082[++Statics.field1083 - 1] = var3.field2625;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gy.h(ILcu;ZI)I")
    public static int method3256(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method728(field1080[--Statics.field1081]);
        } else {
            var3 = arg2 ? Statics.field77 : Statics.field3253;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1090 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2661 == null) {
            return 0;
        } else {
            class63 var4 = new class63();
            var4.field566 = var3;
            var4.field572 = var3.field2661;
            var4.field569 = field1090 + 1;
            client.field844.method4433(var4);
            return 1;
        }
    }

    @ObfuscatedName("at.s(ILcu;ZI)I")
    public static int method765(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method728(field1080[--Statics.field1081]);
        if (arg0 == 2500) {
            field1080[++Statics.field1081 - 1] = var3.field2611;
            return 1;
        } else if (arg0 == 2501) {
            field1080[++Statics.field1081 - 1] = var3.field2566;
            return 1;
        } else if (arg0 == 2502) {
            field1080[++Statics.field1081 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 2503) {
            field1080[++Statics.field1081 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 2504) {
            field1080[++Statics.field1081 - 1] = var3.field2541 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1080[++Statics.field1081 - 1] = var3.field2565;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.f(ILcu;ZI)I")
    public static int method1569(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method728(field1080[--Statics.field1081]);
        if (arg0 == 2600) {
            field1080[++Statics.field1081 - 1] = var3.field2567;
            return 1;
        } else if (arg0 == 2601) {
            field1080[++Statics.field1081 - 1] = var3.field2568;
            return 1;
        } else if (arg0 == 2602) {
            field1082[++Statics.field1083 - 1] = var3.field2607;
            return 1;
        } else if (arg0 == 2603) {
            field1080[++Statics.field1081 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 2604) {
            field1080[++Statics.field1081 - 1] = var3.field2570;
            return 1;
        } else if (arg0 == 2605) {
            field1080[++Statics.field1081 - 1] = var3.field2600;
            return 1;
        } else if (arg0 == 2606) {
            field1080[++Statics.field1081 - 1] = var3.field2551;
            return 1;
        } else if (arg0 == 2607) {
            field1080[++Statics.field1081 - 1] = var3.field2612;
            return 1;
        } else if (arg0 == 2608) {
            field1080[++Statics.field1081 - 1] = var3.field2598;
            return 1;
        } else if (arg0 == 2609) {
            field1080[++Statics.field1081 - 1] = var3.field2577;
            return 1;
        } else if (arg0 == 2610) {
            field1080[++Statics.field1081 - 1] = var3.field2578;
            return 1;
        } else if (arg0 == 2611) {
            field1080[++Statics.field1081 - 1] = var3.field2562;
            return 1;
        } else if (arg0 == 2612) {
            field1080[++Statics.field1081 - 1] = var3.field2564;
            return 1;
        } else if (arg0 == 2613) {
            field1080[++Statics.field1081 - 1] = var3.field2576.method25();
            return 1;
        } else if (arg0 == 2614) {
            field1080[++Statics.field1081 - 1] = var3.field2655 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fy.j(ILcu;ZB)I")
    public static int method3110(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class218 var3 = class218.method728(field1080[--Statics.field1081]);
            field1080[++Statics.field1081 - 1] = var3.field2572;
            return 1;
        } else if (arg0 == 2701) {
            class218 var4 = class218.method728(field1080[--Statics.field1081]);
            if (var4.field2572 == -1) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = var4.field2673;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1080[--Statics.field1081];
            class62 var6 = (class62) client.field900.method5393((long) var5);
            if (var6 == null) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1080[++Statics.field1081 - 1] = client.field887;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.d(ILcu;ZI)I")
    public static int method442(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method728(field1080[--Statics.field1081]);
        if (arg0 == 2800) {
            field1080[++Statics.field1081 - 1] = class219.method21(client.method15(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1080[--Statics.field1081];
            int var5 = var4 - 1;
            if (var3.field2626 == null || var5 >= var3.field2626.length || var3.field2626[var5] == null) {
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1082[++Statics.field1083 - 1] = var3.field2626[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2625 == null) {
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1082[++Statics.field1083 - 1] = var3.field2625;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ci.l(ILcu;ZI)I")
    public static int method2010(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1082[--Statics.field1083];
            class92.method3567(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1081 -= 2;
            client.method3262(Statics.field2737, field1080[Statics.field1081], field1080[Statics.field1081 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1076) {
                field1075 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1082[--Statics.field1083];
            int var5 = 0;
            if (class291.method3186(var4)) {
                var5 = class291.method2779(var4);
            }
            class188 var6 = class188.method1039(class184.field2239, client.field668.field1293);
            var6.field2315.method4977(var5);
            client.field668.method2040(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1082[--Statics.field1083];
            class188 var8 = class188.method1039(class184.field2285, client.field668.field1293);
            var8.field2315.method5065(var7.length() + 1);
            var8.field2315.method4981(var7);
            client.field668.method2040(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1082[--Statics.field1083];
            class188 var10 = class188.method1039(class184.field2203, client.field668.field1293);
            var10.field2315.method5065(var9.length() + 1);
            var10.field2315.method4981(var9);
            client.field668.method2040(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1080[--Statics.field1081];
            String var12 = field1082[--Statics.field1083];
            client.method187(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1081 -= 3;
            int var13 = field1080[Statics.field1081];
            int var14 = field1080[Statics.field1081 + 1];
            int var15 = field1080[Statics.field1081 + 2];
            class218 var16 = class218.method728(var15);
            client.method3713(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1081 -= 2;
            int var17 = field1080[Statics.field1081];
            int var18 = field1080[Statics.field1081 + 1];
            class218 var19 = arg2 ? Statics.field77 : Statics.field3253;
            client.method3713(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field183 = field1080[--Statics.field1081] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1080[++Statics.field1081 - 1] = Statics.field3112.field1037 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field3112.field1037 = field1080[--Statics.field1081] == 1;
            class74.method3302();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1082[--Statics.field1083];
            boolean var21 = field1080[--Statics.field1081] == 1;
            class52.method3830(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1080[--Statics.field1081];
            class188 var23 = class188.method1039(class184.field2246, client.field668.field1293);
            var23.field2315.method4975(var22);
            client.field668.method2040(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1080[--Statics.field1081];
            Statics.field1083 -= 2;
            String var25 = field1082[Statics.field1083];
            String var26 = field1082[Statics.field1083 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class188 var27 = class188.method1039(class184.field2271, client.field668.field1293);
                var27.field2315.method4975(1 + class300.method4526(var25) + class300.method4526(var26));
                var27.field2315.method4981(var25);
                var27.field2315.method4981(var26);
                var27.field2315.method5016(var24);
                client.field668.method2040(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field871 = field1080[--Statics.field1081] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field785 = field1080[--Statics.field1081] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field775 = field1080[--Statics.field1081] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1080[--Statics.field1081] == 1) {
                client.field757 |= 0x1;
            } else {
                client.field757 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1080[--Statics.field1081] == 1) {
                client.field757 |= 0x2;
            } else {
                client.field757 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1080[--Statics.field1081] == 1) {
                client.field757 |= 0x4;
            } else {
                client.field757 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1080[--Statics.field1081] == 1) {
                client.field757 |= 0x8;
            } else {
                client.field757 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field757 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field742 = field1080[--Statics.field1081] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field752 = field1080[--Statics.field1081] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method1048(field1080[--Statics.field1081] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1080[++Statics.field1081 - 1] = client.method373() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1081 -= 2;
            client.field717 = field1080[Statics.field1081];
            client.field718 = field1080[Statics.field1081 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1081 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1081--;
            return 1;
        } else if (arg0 == 3132) {
            field1080[++Statics.field1081 - 1] = Statics.field1578;
            field1080[++Statics.field1081 - 1] = Statics.field1904;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1081--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1081 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field799 = 3;
            client.field825 = field1080[--Statics.field1081];
            return 1;
        } else if (arg0 == 3137) {
            client.field799 = 2;
            client.field825 = field1080[--Statics.field1081];
            return 1;
        } else if (arg0 == 3138) {
            client.field799 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field799 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field799 = 3;
            client.field825 = arg2 ? Statics.field77.field2546 : Statics.field3253.field2546;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1080[--Statics.field1081] == 1;
            Statics.field3112.field1041 = var28;
            class74.method3302();
            return 1;
        } else if (arg0 == 3142) {
            field1080[++Statics.field1081 - 1] = Statics.field3112.field1041 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1080[--Statics.field1081] == 1;
            client.field674 = var29;
            if (!var29) {
                Statics.field3112.field1035 = "";
                class74.method3302();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1080[++Statics.field1081 - 1] = client.field674 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1080[--Statics.field1081] == 1;
            if (Statics.field3112.field1038 == var30) {
                Statics.field3112.field1038 = !var30;
                class74.method3302();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1080[++Statics.field1081 - 1] = Statics.field3112.field1038 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1080[++Statics.field1081 - 1] = class86.field1167;
            return 1;
        } else if (arg0 == 3154) {
            field1080[++Statics.field1081 - 1] = client.method86();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1083--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1081 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1081--;
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1081--;
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1083--;
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1081--;
            field1082[++Statics.field1083 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1081--;
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1081 -= 2;
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1081 -= 2;
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1081 -= 2;
            field1082[++Statics.field1083 - 1] = "";
            field1082[++Statics.field1083 - 1] = "";
            field1082[++Statics.field1083 - 1] = "";
            field1082[++Statics.field1083 - 1] = "";
            field1082[++Statics.field1083 - 1] = "";
            field1082[++Statics.field1083 - 1] = "";
            field1082[++Statics.field1083 - 1] = "";
            field1082[++Statics.field1083 - 1] = "";
            field1082[++Statics.field1083 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1081--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1081--;
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1081--;
            return 1;
        } else if (arg0 == 3175) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gv.ac(ILcu;ZI)I")
    public static int method3254(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1080[++Statics.field1081 - 1] = client.field645;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1081 -= 2;
            int var3 = field1080[Statics.field1081];
            int var4 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = class60.method280(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1081 -= 2;
            int var5 = field1080[Statics.field1081];
            int var6 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = class60.method4004(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1081 -= 2;
            int var7 = field1080[Statics.field1081];
            int var8 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = class60.method668(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = Statics.method3722(var9).field3177;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = client.field726[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = client.field854[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = client.field771[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field174;
            int var14 = (Statics.field2737.field986 >> 7) + Statics.field2734;
            int var15 = (Statics.field2737.field930 >> 7) + Statics.field3631;
            field1080[++Statics.field1081 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1080[++Statics.field1081 - 1] = client.field638 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1081 -= 2;
            int var19 = field1080[Statics.field1081] + 32768;
            int var20 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = class60.method280(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1081 -= 2;
            int var21 = field1080[Statics.field1081] + 32768;
            int var22 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = class60.method4004(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1081 -= 2;
            int var23 = field1080[Statics.field1081] + 32768;
            int var24 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = class60.method668(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field806 >= 2) {
                field1080[++Statics.field1081 - 1] = client.field806;
            } else {
                field1080[++Statics.field1081 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1080[++Statics.field1081 - 1] = client.field652;
            return 1;
        } else if (arg0 == 3318) {
            field1080[++Statics.field1081 - 1] = client.field856;
            return 1;
        } else if (arg0 == 3321) {
            field1080[++Statics.field1081 - 1] = client.field804;
            return 1;
        } else if (arg0 == 3322) {
            field1080[++Statics.field1081 - 1] = client.field805;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field808) {
                field1080[++Statics.field1081 - 1] = 1;
            } else {
                field1080[++Statics.field1081 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1080[++Statics.field1081 - 1] = client.field636;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1081 -= 4;
            int var25 = field1080[Statics.field1081];
            int var26 = field1080[Statics.field1081 + 1];
            int var27 = field1080[Statics.field1081 + 2];
            int var28 = field1080[Statics.field1081 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1080[++Statics.field1081 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kf.aa(ILcu;ZB)I")
    public static int method4971(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1081 -= 2;
            int var3 = field1080[Statics.field1081];
            int var4 = field1080[Statics.field1081 + 1];
            class252 var5 = class252.method3067(var3);
            if (var5.field3298 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3303; var6++) {
                if (var5.field3304[var6] == var4) {
                    field1082[++Statics.field1083 - 1] = var5.field3302[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1082[++Statics.field1083 - 1] = var5.field3301;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1081 -= 4;
            int var7 = field1080[Statics.field1081];
            int var8 = field1080[Statics.field1081 + 1];
            int var9 = field1080[Statics.field1081 + 2];
            int var10 = field1080[Statics.field1081 + 3];
            class252 var11 = class252.method3067(var9);
            if (var11.field3299 != var7 || var11.field3298 != var8) {
                if (var8 == 115) {
                    field1082[++Statics.field1083 - 1] = class225.field2755;
                } else {
                    field1080[++Statics.field1081 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3303; var12++) {
                if (var11.field3304[var12] == var10) {
                    if (var8 == 115) {
                        field1082[++Statics.field1083 - 1] = var11.field3302[var12];
                    } else {
                        field1080[++Statics.field1081 - 1] = var11.field3305[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1082[++Statics.field1083 - 1] = var11.field3301;
                } else {
                    field1080[++Statics.field1081 - 1] = var11.field3297;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1080[--Statics.field1081];
            class252 var14 = class252.method3067(var13);
            field1080[++Statics.field1081 - 1] = var14.method4098();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jl.ap(ILcu;ZI)I")
    public static int method4690(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field500.field1053 == 0) {
                field1080[++Statics.field1081 - 1] = -2;
            } else if (Statics.field500.field1053 == 1) {
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = Statics.field500.field1051.method4637();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1080[--Statics.field1081];
            if (Statics.field500.method1678() && var3 >= 0 && var3 < Statics.field500.field1051.method4637()) {
                class284 var4 = (class284) Statics.field500.field1051.method4620(var3);
                field1082[++Statics.field1083 - 1] = var4.method4571();
                field1082[++Statics.field1083 - 1] = var4.method4569();
            } else {
                field1082[++Statics.field1083 - 1] = "";
                field1082[++Statics.field1083 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1080[--Statics.field1081];
            if (Statics.field500.method1678() && var5 >= 0 && var5 < Statics.field500.field1051.method4637()) {
                field1080[++Statics.field1081 - 1] = ((class279) Statics.field500.field1051.method4620(var5)).field3600;
            } else {
                field1080[++Statics.field1081 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1080[--Statics.field1081];
            if (Statics.field500.method1678() && var6 >= 0 && var6 < Statics.field500.field1051.method4637()) {
                field1080[++Statics.field1081 - 1] = ((class279) Statics.field500.field1051.method4620(var6)).field3599;
            } else {
                field1080[++Statics.field1081 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1082[--Statics.field1083];
            int var8 = field1080[--Statics.field1081];
            class75.method1857(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1082[--Statics.field1083];
            Statics.field500.method1685(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1082[--Statics.field1083];
            Statics.field500.method1729(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1082[--Statics.field1083];
            Statics.field500.method1687(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1082[--Statics.field1083];
            Statics.field500.method1710(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1082[--Statics.field1083];
            String var14 = Statics.method236(var13);
            field1080[++Statics.field1081 - 1] = Statics.field500.method1683(new class283(var14, Statics.field275), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field2513 == null) {
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1082[++Statics.field1083 - 1] = Statics.field2513.field3620;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field2513 == null) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = Statics.field2513.method4637();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1080[--Statics.field1081];
            if (Statics.field2513 == null || var15 >= Statics.field2513.method4637()) {
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1082[++Statics.field1083 - 1] = Statics.field2513.method4620(var15).method4570().method4712();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1080[--Statics.field1081];
            if (Statics.field2513 == null || var16 >= Statics.field2513.method4637()) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = ((class279) Statics.field2513.method4620(var16)).method4687();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1080[--Statics.field1081];
            if (Statics.field2513 == null || var17 >= Statics.field2513.method4637()) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = ((class279) Statics.field2513.method4620(var17)).field3599;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1080[++Statics.field1081 - 1] = Statics.field2513 == null ? 0 : Statics.field2513.field3622;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1082[--Statics.field1083];
            client.method3895(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1080[++Statics.field1081 - 1] = Statics.field2513 == null ? 0 : Statics.field2513.field3619;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1082[--Statics.field1083];
            client.method1632(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method374();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field500.method1678()) {
                field1080[++Statics.field1081 - 1] = Statics.field500.field1052.method4637();
            } else {
                field1080[++Statics.field1081 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1080[--Statics.field1081];
            if (Statics.field500.method1678() && var20 >= 0 && var20 < Statics.field500.field1052.method4637()) {
                class278 var21 = (class278) Statics.field500.field1052.method4620(var20);
                field1082[++Statics.field1083 - 1] = var21.method4571();
                field1082[++Statics.field1083 - 1] = var21.method4569();
            } else {
                field1082[++Statics.field1083 - 1] = "";
                field1082[++Statics.field1083 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1082[--Statics.field1083];
            String var23 = Statics.method236(var22);
            field1080[++Statics.field1081 - 1] = Statics.field500.method1684(new class283(var23, Statics.field275)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1080[--Statics.field1081];
            if (Statics.field2513 == null || var24 >= Statics.field2513.method4637() || !Statics.field2513.method4620(var24).method4570().equals(Statics.field2737.field599)) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field2513 == null || Statics.field2513.field3621 == null) {
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1082[++Statics.field1083 - 1] = Statics.field2513.field3621;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1080[--Statics.field1081];
            if (Statics.field2513 == null || var25 >= Statics.field2513.method4637() || !((class273) Statics.field2513.method4620(var25)).method4561()) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1080[--Statics.field1081];
            if (Statics.field2513 == null || var26 >= Statics.field2513.method4637() || !((class273) Statics.field2513.method4620(var26)).method4555()) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field500.field1051.method4629();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1051.method4630(new class314(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1051.method4630(new class315(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1051.method4630(new class158(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1051.method4630(new class152(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1051.method4630(new class157(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1051.method4630(new class160(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1051.method4630(new class156(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1051.method4630(new class154(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1051.method4630(new class153(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1051.method4630(new class155(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field500.field1051.method4608();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field500.field1052.method4629();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1052.method4630(new class314(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1052.method4630(new class315(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field500.field1052.method4608();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field2513 != null) {
                Statics.field2513.method4629();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1080[--Statics.field1081] == 1;
            if (Statics.field2513 != null) {
                Statics.field2513.method4630(new class314(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1080[--Statics.field1081] == 1;
            if (Statics.field2513 != null) {
                Statics.field2513.method4630(new class315(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1080[--Statics.field1081] == 1;
            if (Statics.field2513 != null) {
                Statics.field2513.method4630(new class158(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1080[--Statics.field1081] == 1;
            if (Statics.field2513 != null) {
                Statics.field2513.method4630(new class152(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1080[--Statics.field1081] == 1;
            if (Statics.field2513 != null) {
                Statics.field2513.method4630(new class157(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1080[--Statics.field1081] == 1;
            if (Statics.field2513 != null) {
                Statics.field2513.method4630(new class160(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1080[--Statics.field1081] == 1;
            if (Statics.field2513 != null) {
                Statics.field2513.method4630(new class156(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1080[--Statics.field1081] == 1;
            if (Statics.field2513 != null) {
                Statics.field2513.method4630(new class154(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1080[--Statics.field1081] == 1;
            if (Statics.field2513 != null) {
                Statics.field2513.method4630(new class153(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1080[--Statics.field1081] == 1;
            if (Statics.field2513 != null) {
                Statics.field2513.method4630(new class155(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field2513 != null) {
                Statics.field2513.method4608();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1080[--Statics.field1081] == 1;
            Statics.field500.field1051.method4630(new class159(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1080[--Statics.field1081] == 1;
            if (Statics.field2513 != null) {
                Statics.field2513.method4630(new class159(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.ar(ILcu;ZI)I")
    public static int method267(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = client.field904[var3].method95();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = client.field904[var4].field61;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = client.field904[var5].field57;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = client.field904[var6].field58;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = client.field904[var7].field59;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = client.field904[var8].field56;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1080[--Statics.field1081];
            int var10 = client.field904[var9].method94();
            field1080[++Statics.field1081 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1080[--Statics.field1081];
            int var12 = client.field904[var11].method94();
            field1080[++Statics.field1081 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1080[--Statics.field1081];
            int var14 = client.field904[var13].method94();
            field1080[++Statics.field1081 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1080[--Statics.field1081];
            int var16 = client.field904[var15].method94();
            field1080[++Statics.field1081 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1080[--Statics.field1081] == 1;
            if (Statics.field1227 != null) {
                Statics.field1227.method68(class7.field33, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1080[--Statics.field1081] == 1;
            if (Statics.field1227 != null) {
                Statics.field1227.method68(class7.field42, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1081 -= 2;
            boolean var19 = field1080[Statics.field1081] == 1;
            boolean var20 = field1080[Statics.field1081 + 1] == 1;
            if (Statics.field1227 != null) {
                client.field695.field625 = var20;
                Statics.field1227.method68(client.field695, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1080[--Statics.field1081] == 1;
            if (Statics.field1227 != null) {
                Statics.field1227.method68(class7.field32, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1080[--Statics.field1081] == 1;
            if (Statics.field1227 != null) {
                Statics.field1227.method68(class7.field35, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1080[++Statics.field1081 - 1] = Statics.field1227 == null ? 0 : Statics.field1227.field31.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1080[--Statics.field1081];
            class8 var24 = (class8) Statics.field1227.field31.get(var23);
            field1080[++Statics.field1081 - 1] = var24.field48;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1080[--Statics.field1081];
            class8 var26 = (class8) Statics.field1227.field31.get(var25);
            field1082[++Statics.field1083 - 1] = var26.method76();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1080[--Statics.field1081];
            class8 var28 = (class8) Statics.field1227.field31.get(var27);
            field1082[++Statics.field1083 - 1] = var28.method75();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1080[--Statics.field1081];
            class8 var30 = (class8) Statics.field1227.field31.get(var29);
            long var31 = class297.method502() - Statics.field1136 - var30.field51;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1082[++Statics.field1083 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1080[--Statics.field1081];
            class8 var38 = (class8) Statics.field1227.field31.get(var37);
            field1080[++Statics.field1081 - 1] = var38.field45.field58;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1080[--Statics.field1081];
            class8 var40 = (class8) Statics.field1227.field31.get(var39);
            field1080[++Statics.field1081 - 1] = var40.field45.field57;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1080[--Statics.field1081];
            class8 var42 = (class8) Statics.field1227.field31.get(var41);
            field1080[++Statics.field1081 - 1] = var42.field45.field61;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.ab(ILcu;ZI)I")
    public static int method588(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1081 -= 2;
            int var3 = field1080[Statics.field1081];
            int var4 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1081 -= 2;
            int var5 = field1080[Statics.field1081];
            int var6 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1081 -= 2;
            int var7 = field1080[Statics.field1081];
            int var8 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1081 -= 2;
            int var9 = field1080[Statics.field1081];
            int var10 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1081 -= 5;
            int var13 = field1080[Statics.field1081];
            int var14 = field1080[Statics.field1081 + 1];
            int var15 = field1080[Statics.field1081 + 2];
            int var16 = field1080[Statics.field1081 + 3];
            int var17 = field1080[Statics.field1081 + 4];
            field1080[++Statics.field1081 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1081 -= 2;
            int var18 = field1080[Statics.field1081];
            int var19 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1081 -= 2;
            int var20 = field1080[Statics.field1081];
            int var21 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1081 -= 2;
            int var22 = field1080[Statics.field1081];
            int var23 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1081 -= 2;
            int var24 = field1080[Statics.field1081];
            int var25 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1081 -= 2;
            int var26 = field1080[Statics.field1081];
            int var27 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1081 -= 2;
            int var28 = field1080[Statics.field1081];
            int var29 = field1080[Statics.field1081 + 1];
            if (var28 == 0) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1081 -= 2;
            int var30 = field1080[Statics.field1081];
            int var31 = field1080[Statics.field1081 + 1];
            if (var30 == 0) {
                field1080[++Statics.field1081 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1080[++Statics.field1081 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1080[++Statics.field1081 - 1] = var30;
                    break;
                case 2:
                    field1080[++Statics.field1081 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1080[++Statics.field1081 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1080[++Statics.field1081 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1080[++Statics.field1081 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1081 -= 2;
            int var32 = field1080[Statics.field1081];
            int var33 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1081 -= 2;
            int var34 = field1080[Statics.field1081];
            int var35 = field1080[Statics.field1081 + 1];
            field1080[++Statics.field1081 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1081 -= 3;
            long var36 = (long) field1080[Statics.field1081];
            long var38 = (long) field1080[Statics.field1081 + 1];
            long var40 = (long) field1080[Statics.field1081 + 2];
            field1080[++Statics.field1081 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("w.ax(ILcu;ZI)I")
    public static int method163(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1082[--Statics.field1083];
            int var4 = field1080[--Statics.field1081];
            field1082[++Statics.field1083 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1083 -= 2;
            String var5 = field1082[Statics.field1083];
            String var6 = field1082[Statics.field1083 + 1];
            field1082[++Statics.field1083 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1082[--Statics.field1083];
            int var8 = field1080[--Statics.field1081];
            field1082[++Statics.field1083 - 1] = var7 + class291.method1853(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1082[--Statics.field1083];
            field1082[++Statics.field1083 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1080[--Statics.field1081];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1086.setTime(new Date(var11));
            int var13 = field1086.get(5);
            int var14 = field1086.get(2);
            int var15 = field1086.get(1);
            field1082[++Statics.field1083 - 1] = var13 + "-" + field1087[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1083 -= 2;
            String var16 = field1082[Statics.field1083];
            String var17 = field1082[Statics.field1083 + 1];
            if (Statics.field2737.field597 != null && Statics.field2737.field597.field2522) {
                field1082[++Statics.field1083 - 1] = var17;
            } else {
                field1082[++Statics.field1083 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1080[--Statics.field1081];
            field1082[++Statics.field1083 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1083 -= 2;
            field1080[++Statics.field1081 - 1] = class291.method3292(class287.method1839(field1082[Statics.field1083], field1082[Statics.field1083 + 1], Statics.field112));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1082[--Statics.field1083];
            Statics.field1081 -= 2;
            int var20 = field1080[Statics.field1081];
            int var21 = field1080[Statics.field1081 + 1];
            byte[] var22 = Statics.field1633.method3726(var21, 0);
            class295 var23 = new class295(var22);
            field1080[++Statics.field1081 - 1] = var23.method4850(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1082[--Statics.field1083];
            Statics.field1081 -= 2;
            int var25 = field1080[Statics.field1081];
            int var26 = field1080[Statics.field1081 + 1];
            byte[] var27 = Statics.field1633.method3726(var26, 0);
            class295 var28 = new class295(var27);
            field1080[++Statics.field1081 - 1] = var28.method4905(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1083 -= 2;
            String var29 = field1082[Statics.field1083];
            String var30 = field1082[Statics.field1083 + 1];
            if (field1080[--Statics.field1081] == 1) {
                field1082[++Statics.field1083 - 1] = var29;
            } else {
                field1082[++Statics.field1083 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1082[--Statics.field1083];
            field1082[++Statics.field1083 - 1] = class296.method4851(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1082[--Statics.field1083];
            int var33 = field1080[--Statics.field1081];
            field1082[++Statics.field1083 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = class291.method1926((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = class291.method3817((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = class291.method3072((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = class291.method530((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1082[--Statics.field1083];
            if (var38 == null) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1082[--Statics.field1083];
            Statics.field1081 -= 2;
            int var40 = field1080[Statics.field1081];
            int var41 = field1080[Statics.field1081 + 1];
            field1082[++Statics.field1083 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1082[--Statics.field1083];
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
            field1082[++Statics.field1083 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1082[--Statics.field1083];
            int var48 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1083 -= 2;
            String var49 = field1082[Statics.field1083];
            String var50 = field1082[Statics.field1083 + 1];
            int var51 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1082[--Statics.field1083];
            field1082[++Statics.field1083 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hu.as(ILcu;ZI)I")
    public static int method3708(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1080[--Statics.field1081];
            field1082[++Statics.field1083 - 1] = class255.method2964(var3).field3387;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1081 -= 2;
            int var4 = field1080[Statics.field1081];
            int var5 = field1080[Statics.field1081 + 1];
            class255 var6 = class255.method2964(var4);
            if (var5 < 1 || var5 > 5 || var6.field3411[var5 - 1] == null) {
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1082[++Statics.field1083 - 1] = var6.field3411[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1081 -= 2;
            int var7 = field1080[Statics.field1081];
            int var8 = field1080[Statics.field1081 + 1];
            class255 var9 = class255.method2964(var7);
            if (var8 < 1 || var8 > 5 || var9.field3437[var8 - 1] == null) {
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1082[++Statics.field1083 - 1] = var9.field3437[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = class255.method2964(var10).field3409;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = class255.method2964(var11).field3434 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1080[--Statics.field1081];
            class255 var13 = class255.method2964(var12);
            if (var13.field3432 == -1 && var13.field3429 >= 0) {
                field1080[++Statics.field1081 - 1] = var13.field3429;
            } else {
                field1080[++Statics.field1081 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1080[--Statics.field1081];
            class255 var15 = class255.method2964(var14);
            if (var15.field3432 >= 0 && var15.field3429 >= 0) {
                field1080[++Statics.field1081 - 1] = var15.field3429;
            } else {
                field1080[++Statics.field1081 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = class255.method2964(var16).field3410 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1080[--Statics.field1081];
            class255 var18 = class255.method2964(var17);
            if (var18.field3441 == -1 && var18.field3433 >= 0) {
                field1080[++Statics.field1081 - 1] = var18.field3433;
            } else {
                field1080[++Statics.field1081 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1080[--Statics.field1081];
            class255 var20 = class255.method2964(var19);
            if (var20.field3441 >= 0 && var20.field3433 >= 0) {
                field1080[++Statics.field1081 - 1] = var20.field3433;
            } else {
                field1080[++Statics.field1081 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1082[--Statics.field1083];
            int var22 = field1080[--Statics.field1081];
            client.method731(var21, var22 == 1);
            field1080[++Statics.field1081 - 1] = Statics.field393;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field123 == null || Statics.field1311 >= Statics.field393) {
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = Statics.field123[++Statics.field1311 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field1311 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bm.ao(ILcu;ZB)I")
    public static int method1000(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1080[++Statics.field1081 - 1] = client.field853;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1081 -= 3;
            client.field853 = field1080[Statics.field1081];
            Statics.field2697 = class310.method4829(field1080[Statics.field1081 + 1]);
            if (Statics.field2697 == null) {
                Statics.field2697 = class310.field3792;
            }
            client.field800 = field1080[Statics.field1081 + 2];
            class188 var3 = class188.method1039(class184.field2234, client.field668.field1293);
            var3.field2315.method5065(client.field853);
            var3.field2315.method5065(Statics.field2697.field3794);
            var3.field2315.method5065(client.field800);
            client.field668.method2040(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1082[--Statics.field1083];
            Statics.field1081 -= 2;
            int var5 = field1080[Statics.field1081];
            int var6 = field1080[Statics.field1081 + 1];
            class188 var7 = class188.method1039(class184.field2277, client.field668.field1293);
            var7.field2315.method5065(class300.method4526(var4) + 2);
            var7.field2315.method4981(var4);
            var7.field2315.method5065(var5 - 1);
            var7.field2315.method5065(var6);
            client.field668.method2040(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1081 -= 2;
            int var8 = field1080[Statics.field1081];
            int var9 = field1080[Statics.field1081 + 1];
            class65 var10 = Statics.method1589(var8, var9);
            if (var10 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = 0;
                field1082[++Statics.field1083 - 1] = "";
                field1082[++Statics.field1083 - 1] = "";
                field1082[++Statics.field1083 - 1] = "";
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = var10.field595;
                field1080[++Statics.field1081 - 1] = var10.field590;
                field1082[++Statics.field1083 - 1] = var10.field586 == null ? "" : var10.field586;
                field1082[++Statics.field1083 - 1] = var10.field591 == null ? "" : var10.field591;
                field1082[++Statics.field1083 - 1] = var10.field594 == null ? "" : var10.field594;
                field1080[++Statics.field1081 - 1] = var10.method1064() ? 1 : (var10.method1065() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1080[--Statics.field1081];
            class65 var12 = class92.method1149(var11);
            if (var12 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = 0;
                field1082[++Statics.field1083 - 1] = "";
                field1082[++Statics.field1083 - 1] = "";
                field1082[++Statics.field1083 - 1] = "";
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = var12.field585;
                field1080[++Statics.field1081 - 1] = var12.field590;
                field1082[++Statics.field1083 - 1] = var12.field586 == null ? "" : var12.field586;
                field1082[++Statics.field1083 - 1] = var12.field591 == null ? "" : var12.field591;
                field1082[++Statics.field1083 - 1] = var12.field594 == null ? "" : var12.field594;
                field1080[++Statics.field1081 - 1] = var12.method1064() ? 1 : (var12.method1065() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2697 == null) {
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = Statics.field2697.field3794;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1082[--Statics.field1083];
            int var14 = field1080[--Statics.field1081];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class225.field2919)) {
                var16 = 0;
                var13 = var13.substring(class225.field2919.length());
            } else if (var15.startsWith(class225.field2921)) {
                var16 = 1;
                var13 = var13.substring(class225.field2921.length());
            } else if (var15.startsWith(class225.field2812)) {
                var16 = 2;
                var13 = var13.substring(class225.field2812.length());
            } else if (var15.startsWith(class225.field2934)) {
                var16 = 3;
                var13 = var13.substring(class225.field2934.length());
            } else if (var15.startsWith(class225.field2927)) {
                var16 = 4;
                var13 = var13.substring(class225.field2927.length());
            } else if (var15.startsWith(class225.field2929)) {
                var16 = 5;
                var13 = var13.substring(class225.field2929.length());
            } else if (var15.startsWith(class225.field2931)) {
                var16 = 6;
                var13 = var13.substring(class225.field2931.length());
            } else if (var15.startsWith(class225.field2933)) {
                var16 = 7;
                var13 = var13.substring(class225.field2933.length());
            } else if (var15.startsWith(class225.field2772)) {
                var16 = 8;
                var13 = var13.substring(class225.field2772.length());
            } else if (var15.startsWith(class225.field2937)) {
                var16 = 9;
                var13 = var13.substring(class225.field2937.length());
            } else if (var15.startsWith(class225.field3021)) {
                var16 = 10;
                var13 = var13.substring(class225.field3021.length());
            } else if (var15.startsWith(class225.field2928)) {
                var16 = 11;
                var13 = var13.substring(class225.field2928.length());
            } else if (Statics.field112 != class191.field2338) {
                if (var15.startsWith(class225.field2920)) {
                    var16 = 0;
                    var13 = var13.substring(class225.field2920.length());
                } else if (var15.startsWith(class225.field2922)) {
                    var16 = 1;
                    var13 = var13.substring(class225.field2922.length());
                } else if (var15.startsWith(class225.field2778)) {
                    var16 = 2;
                    var13 = var13.substring(class225.field2778.length());
                } else if (var15.startsWith(class225.field2926)) {
                    var16 = 3;
                    var13 = var13.substring(class225.field2926.length());
                } else if (var15.startsWith(class225.field2842)) {
                    var16 = 4;
                    var13 = var13.substring(class225.field2842.length());
                } else if (var15.startsWith(class225.field2930)) {
                    var16 = 5;
                    var13 = var13.substring(class225.field2930.length());
                } else if (var15.startsWith(class225.field2995)) {
                    var16 = 6;
                    var13 = var13.substring(class225.field2995.length());
                } else if (var15.startsWith(class225.field2760)) {
                    var16 = 7;
                    var13 = var13.substring(class225.field2760.length());
                } else if (var15.startsWith(class225.field2936)) {
                    var16 = 8;
                    var13 = var13.substring(class225.field2936.length());
                } else if (var15.startsWith(class225.field3004)) {
                    var16 = 9;
                    var13 = var13.substring(class225.field3004.length());
                } else if (var15.startsWith(class225.field2758)) {
                    var16 = 10;
                    var13 = var13.substring(class225.field2758.length());
                } else if (var15.startsWith(class225.field2887)) {
                    var16 = 11;
                    var13 = var13.substring(class225.field2887.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class225.field2943)) {
                var18 = 1;
                var13 = var13.substring(class225.field2943.length());
            } else if (var17.startsWith(class225.field2880)) {
                var18 = 2;
                var13 = var13.substring(class225.field2880.length());
            } else if (var17.startsWith(class225.field2849)) {
                var18 = 3;
                var13 = var13.substring(class225.field2849.length());
            } else if (var17.startsWith(class225.field2949)) {
                var18 = 4;
                var13 = var13.substring(class225.field2949.length());
            } else if (var17.startsWith(class225.field2951)) {
                var18 = 5;
                var13 = var13.substring(class225.field2951.length());
            } else if (Statics.field112 != class191.field2338) {
                if (var17.startsWith(class225.field2944)) {
                    var18 = 1;
                    var13 = var13.substring(class225.field2944.length());
                } else if (var17.startsWith(class225.field2946)) {
                    var18 = 2;
                    var13 = var13.substring(class225.field2946.length());
                } else if (var17.startsWith(class225.field2941)) {
                    var18 = 3;
                    var13 = var13.substring(class225.field2941.length());
                } else if (var17.startsWith(class225.field2897)) {
                    var18 = 4;
                    var13 = var13.substring(class225.field2897.length());
                } else if (var17.startsWith(class225.field2832)) {
                    var18 = 5;
                    var13 = var13.substring(class225.field2832.length());
                }
            }
            class188 var19 = class188.method1039(class184.field2217, client.field668.field1293);
            var19.field2315.method5065(0);
            int var20 = var19.field2315.field3702;
            var19.field2315.method5065(var14);
            var19.field2315.method5065(var16);
            var19.field2315.method5065(var18);
            class211.method5294(var19.field2315, var13);
            var19.field2315.method4987(var19.field2315.field3702 - var20);
            client.field668.method2040(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1083 -= 2;
            String var21 = field1082[Statics.field1083];
            String var22 = field1082[Statics.field1083 + 1];
            class188 var23 = class188.method1039(class184.field2194, client.field668.field1293);
            var23.field2315.method4975(0);
            int var24 = var23.field2315.field3702;
            var23.field2315.method4981(var21);
            class211.method5294(var23.field2315, var22);
            var23.field2315.method4986(var23.field2315.field3702 - var24);
            client.field668.method2040(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field2737 == null || Statics.field2737.field599 == null) {
                var25 = "";
            } else {
                var25 = Statics.field2737.field599.method4712();
            }
            field1082[++Statics.field1083 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1080[++Statics.field1081 - 1] = client.field800;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = class92.method1921(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = class92.method156(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = class92.method3150(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1082[--Statics.field1083];
            client.method234(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field908 = field1082[--Statics.field1083].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1082[++Statics.field1083 - 1] = client.field908;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1082[--Statics.field1083];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.ad(ILcu;ZB)I")
    public static int method616(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1081 -= 2;
            int var3 = field1080[Statics.field1081];
            int var4 = field1080[Statics.field1081 + 1];
            if (!client.field849) {
                client.field706 = var3;
                client.field640 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1080[++Statics.field1081 - 1] = client.field706;
            return 1;
        } else if (arg0 == 5506) {
            field1080[++Statics.field1081 - 1] = client.field640;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1080[--Statics.field1081];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field867 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1080[++Statics.field1081 - 1] = client.field867;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hu.an(ILcu;ZI)I")
    public static int method3707(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field684 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hr.ai(II)I")
    public static int method3600(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("hg.ak(II)I")
    public static int method3703(int arg0) {
        return (int) ((Math.log((double) arg0) / field1078 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("er.aq(ILcu;ZI)I")
    public static int method2951(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1081 -= 2;
            client.field881 = (short) method3600(field1080[Statics.field1081]);
            if (client.field881 <= 0) {
                client.field881 = 256;
            }
            client.field888 = (short) method3600(field1080[Statics.field1081 + 1]);
            if (client.field888 <= 0) {
                client.field888 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1081 -= 2;
            client.field905 = (short) field1080[Statics.field1081];
            if (client.field905 <= 0) {
                client.field905 = 256;
            }
            client.field754 = (short) field1080[Statics.field1081 + 1];
            if (client.field754 <= 0) {
                client.field754 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1081 -= 4;
            client.field687 = (short) field1080[Statics.field1081];
            if (client.field687 <= 0) {
                client.field687 = 1;
            }
            client.field892 = (short) field1080[Statics.field1081 + 1];
            if (client.field892 <= 0) {
                client.field892 = 32767;
            } else if (client.field892 < client.field687) {
                client.field892 = client.field687;
            }
            client.field893 = (short) field1080[Statics.field1081 + 2];
            if (client.field893 <= 0) {
                client.field893 = 1;
            }
            client.field894 = (short) field1080[Statics.field1081 + 3];
            if (client.field894 <= 0) {
                client.field894 = 32767;
            } else if (client.field894 < client.field893) {
                client.field894 = client.field893;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field809 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                client.method3548(0, 0, client.field809.field2672, client.field809.field2639, false);
                field1080[++Statics.field1081 - 1] = client.field897;
                field1080[++Statics.field1081 - 1] = client.field898;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1080[++Statics.field1081 - 1] = client.field905;
            field1080[++Statics.field1081 - 1] = client.field754;
            return 1;
        } else if (arg0 == 6205) {
            field1080[++Statics.field1081 - 1] = method3703(client.field881);
            field1080[++Statics.field1081 - 1] = method3703(client.field888);
            return 1;
        } else if (arg0 == 6220) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1080[++Statics.field1081 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1080[++Statics.field1081 - 1] = Statics.field1578;
            return 1;
        } else if (arg0 == 6223) {
            field1080[++Statics.field1081 - 1] = Statics.field1904;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hg.am(ILcu;ZI)I")
    public static int method3702(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1080[++Statics.field1081 - 1] = class72.method5273() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class72 var3 = Statics.method2948();
            if (var3 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = 0;
                field1082[++Statics.field1083 - 1] = "";
                field1080[++Statics.field1081 - 1] = 0;
                field1080[++Statics.field1081 - 1] = 0;
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1080[++Statics.field1081 - 1] = var3.field1002;
                field1080[++Statics.field1081 - 1] = var3.field1006;
                field1082[++Statics.field1083 - 1] = var3.field1009;
                field1080[++Statics.field1081 - 1] = var3.field1010;
                field1080[++Statics.field1081 - 1] = var3.field1007;
                field1082[++Statics.field1083 - 1] = var3.field1004;
            }
            return 1;
        } else if (arg0 == 6502) {
            class72 var4 = class72.method3549();
            if (var4 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = 0;
                field1082[++Statics.field1083 - 1] = "";
                field1080[++Statics.field1081 - 1] = 0;
                field1080[++Statics.field1081 - 1] = 0;
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1080[++Statics.field1081 - 1] = var4.field1002;
                field1080[++Statics.field1081 - 1] = var4.field1006;
                field1082[++Statics.field1083 - 1] = var4.field1009;
                field1080[++Statics.field1081 - 1] = var4.field1010;
                field1080[++Statics.field1081 - 1] = var4.field1007;
                field1082[++Statics.field1083 - 1] = var4.field1004;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1080[--Statics.field1081];
            class72 var6 = null;
            for (int var7 = 0; var7 < class72.field1001; var7++) {
                if (Statics.field1000[var7].field1002 == var5) {
                    var6 = Statics.field1000[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = 0;
                field1082[++Statics.field1083 - 1] = "";
                field1080[++Statics.field1081 - 1] = 0;
                field1080[++Statics.field1081 - 1] = 0;
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1080[++Statics.field1081 - 1] = var6.field1002;
                field1080[++Statics.field1081 - 1] = var6.field1006;
                field1082[++Statics.field1083 - 1] = var6.field1009;
                field1080[++Statics.field1081 - 1] = var6.field1010;
                field1080[++Statics.field1081 - 1] = var6.field1007;
                field1082[++Statics.field1083 - 1] = var6.field1004;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1081 -= 4;
            int var8 = field1080[Statics.field1081];
            boolean var9 = field1080[Statics.field1081 + 1] == 1;
            int var10 = field1080[Statics.field1081 + 2];
            boolean var11 = field1080[Statics.field1081 + 3] == 1;
            class72.method736(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1080[--Statics.field1081];
            if (var12 >= 0 && var12 < class72.field1001) {
                class72 var13 = Statics.field1000[var12];
                field1080[++Statics.field1081 - 1] = var13.field1002;
                field1080[++Statics.field1081 - 1] = var13.field1006;
                field1082[++Statics.field1083 - 1] = var13.field1009;
                field1080[++Statics.field1081 - 1] = var13.field1010;
                field1080[++Statics.field1081 - 1] = var13.field1007;
                field1082[++Statics.field1083 - 1] = var13.field1004;
            } else {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = 0;
                field1082[++Statics.field1083 - 1] = "";
                field1080[++Statics.field1081 - 1] = 0;
                field1080[++Statics.field1081 - 1] = 0;
                field1082[++Statics.field1083 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field782 = field1080[--Statics.field1081] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1081 -= 2;
            int var14 = field1080[Statics.field1081];
            int var15 = field1080[Statics.field1081 + 1];
            class250 var16 = class250.method2965(var15);
            if (var16.method4072()) {
                field1082[++Statics.field1083 - 1] = class257.method3280(var14).method4276(var15, var16.field3286);
            } else {
                field1080[++Statics.field1081 - 1] = class257.method3280(var14).method4275(var15, var16.field3289);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1081 -= 2;
            int var17 = field1080[Statics.field1081];
            int var18 = field1080[Statics.field1081 + 1];
            class250 var19 = class250.method2965(var18);
            if (var19.method4072()) {
                field1082[++Statics.field1083 - 1] = class254.method1148(var17).method4173(var18, var19.field3286);
            } else {
                field1080[++Statics.field1081 - 1] = class254.method1148(var17).method4150(var18, var19.field3289);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1081 -= 2;
            int var20 = field1080[Statics.field1081];
            int var21 = field1080[Statics.field1081 + 1];
            class250 var22 = class250.method2965(var21);
            if (var22.method4072()) {
                field1082[++Statics.field1083 - 1] = class255.method2964(var20).method4205(var21, var22.field3286);
            } else {
                field1080[++Statics.field1081 - 1] = class255.method2964(var20).method4204(var21, var22.field3289);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1081 -= 2;
            int var23 = field1080[Statics.field1081];
            int var24 = field1080[Statics.field1081 + 1];
            class250 var25 = class250.method2965(var24);
            if (var25.method4072()) {
                field1082[++Statics.field1083 - 1] = class251.method3143(var23).method4083(var24, var25.field3286);
            } else {
                field1080[++Statics.field1081 - 1] = class251.method3143(var23).method4085(var24, var25.field3289);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1080[++Statics.field1081 - 1] = client.field827 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1080[++Statics.field1081 - 1] = client.field839 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1083--;
            Statics.field1081--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1083--;
            Statics.field1081--;
            return 1;
        } else if (arg0 == 6524) {
            field1080[++Statics.field1081 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1080[++Statics.field1081 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1080[++Statics.field1081 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fy.ae(ILcu;ZI)I")
    public static int method3101(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field174;
            int var4 = (Statics.field2737.field986 >> 7) + Statics.field2734;
            int var5 = (Statics.field2737.field930 >> 7) + Statics.field3631;
            client.method2271().method5749(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1080[--Statics.field1081];
            String var7 = "";
            class27 var8 = client.method2271().method5767(var6);
            if (var8 != null) {
                var7 = var8.method298();
            }
            field1082[++Statics.field1083 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1080[--Statics.field1081];
            client.method2271().method5750(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1080[++Statics.field1081 - 1] = client.method2271().method5764();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1080[--Statics.field1081];
            client.method2271().method5761(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1080[++Statics.field1081 - 1] = client.method2271().method5766() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class214 var11 = new class214(field1080[--Statics.field1081]);
            client.method2271().method5868(var11.field2515, var11.field2514);
            return 1;
        } else if (arg0 == 6607) {
            class214 var12 = new class214(field1080[--Statics.field1081]);
            client.method2271().method5743(var12.field2515, var12.field2514);
            return 1;
        } else if (arg0 == 6608) {
            class214 var13 = new class214(field1080[--Statics.field1081]);
            client.method2271().method5770(var13.field2516, var13.field2515, var13.field2514);
            return 1;
        } else if (arg0 == 6609) {
            class214 var14 = new class214(field1080[--Statics.field1081]);
            client.method2271().method5771(var14.field2516, var14.field2515, var14.field2514);
            return 1;
        } else if (arg0 == 6610) {
            field1080[++Statics.field1081 - 1] = client.method2271().method5772();
            field1080[++Statics.field1081 - 1] = client.method2271().method5773();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1080[--Statics.field1081];
            class27 var16 = client.method2271().method5767(var15);
            if (var16 == null) {
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = var16.method308().method3579();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1080[--Statics.field1081];
            class27 var18 = client.method2271().method5767(var17);
            if (var18 == null) {
                field1080[++Statics.field1081 - 1] = 0;
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = (var18.method351() - var18.method301() + 1) * 64;
                field1080[++Statics.field1081 - 1] = (var18.method304() - var18.method303() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1080[--Statics.field1081];
            class27 var20 = client.method2271().method5767(var19);
            if (var20 == null) {
                field1080[++Statics.field1081 - 1] = 0;
                field1080[++Statics.field1081 - 1] = 0;
                field1080[++Statics.field1081 - 1] = 0;
                field1080[++Statics.field1081 - 1] = 0;
            } else {
                field1080[++Statics.field1081 - 1] = var20.method301() * 64;
                field1080[++Statics.field1081 - 1] = var20.method303() * 64;
                field1080[++Statics.field1081 - 1] = var20.method351() * 64 + 64 - 1;
                field1080[++Statics.field1081 - 1] = var20.method304() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1080[--Statics.field1081];
            class27 var22 = client.method2271().method5767(var21);
            if (var22 == null) {
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = var22.method300();
            }
            return 1;
        } else if (arg0 == 6615) {
            class214 var23 = client.method2271().method5774();
            if (var23 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = var23.field2515;
                field1080[++Statics.field1081 - 1] = var23.field2514;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1080[++Statics.field1081 - 1] = client.method2271().method5751();
            return 1;
        } else if (arg0 == 6617) {
            class214 var24 = new class214(field1080[--Statics.field1081]);
            class27 var25 = client.method2271().method5752();
            if (var25 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method310(var24.field2516, var24.field2515, var24.field2514);
            if (var26 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = var26[0];
                field1080[++Statics.field1081 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class214 var27 = new class214(field1080[--Statics.field1081]);
            class27 var28 = client.method2271().method5752();
            if (var28 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = -1;
                return 1;
            }
            class214 var29 = var28.method293(var27.field2515, var27.field2514);
            if (var29 == null) {
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = var29.method3579();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1081 -= 2;
            int var30 = field1080[Statics.field1081];
            class214 var31 = new class214(field1080[Statics.field1081 + 1]);
            Statics.method375(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1081 -= 2;
            int var32 = field1080[Statics.field1081];
            class214 var33 = new class214(field1080[Statics.field1081 + 1]);
            Statics.method375(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1081 -= 2;
            int var34 = field1080[Statics.field1081];
            class214 var35 = new class214(field1080[Statics.field1081 + 1]);
            class27 var36 = client.method2271().method5767(var34);
            if (var36 == null) {
                field1080[++Statics.field1081 - 1] = 0;
                return 1;
            } else {
                field1080[++Statics.field1081 - 1] = var36.method302(var35.field2516, var35.field2515, var35.field2514) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1080[++Statics.field1081 - 1] = client.method2271().method5877();
            field1080[++Statics.field1081 - 1] = client.method2271().method5835();
            return 1;
        } else if (arg0 == 6623) {
            class214 var37 = new class214(field1080[--Statics.field1081]);
            class27 var38 = client.method2271().method5786(var37.field2516, var37.field2515, var37.field2514);
            if (var38 == null) {
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = var38.method295();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method2271().method5777(field1080[--Statics.field1081]);
            return 1;
        } else if (arg0 == 6625) {
            client.method2271().method5778();
            return 1;
        } else if (arg0 == 6626) {
            client.method2271().method5789(field1080[--Statics.field1081]);
            return 1;
        } else if (arg0 == 6627) {
            client.method2271().method5780();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1080[--Statics.field1081] == 1;
            client.method2271().method5915(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1080[--Statics.field1081];
            client.method2271().method5776(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1080[--Statics.field1081];
            client.method2271().method5783(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method2271().method5784();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1080[--Statics.field1081] == 1;
            client.method2271().method5785(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1081 -= 2;
            int var43 = field1080[Statics.field1081];
            boolean var44 = field1080[Statics.field1081 + 1] == 1;
            client.method2271().method5878(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1081 -= 2;
            int var45 = field1080[Statics.field1081];
            boolean var46 = field1080[Statics.field1081 + 1] == 1;
            client.method2271().method5864(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1080[++Statics.field1081 - 1] = client.method2271().method5818() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = client.method2271().method5775(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1080[--Statics.field1081];
            field1080[++Statics.field1081 - 1] = client.method2271().method5790(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1081 -= 2;
            int var49 = field1080[Statics.field1081];
            class214 var50 = new class214(field1080[Statics.field1081 + 1]);
            class214 var51 = client.method2271().method5793(var49, var50);
            if (var51 == null) {
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = var51.method3579();
            }
            return 1;
        } else if (arg0 == 6639) {
            class35 var52 = client.method2271().method5795();
            if (var52 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = var52.method196();
                field1080[++Statics.field1081 - 1] = var52.field282.method3579();
            }
            return 1;
        } else if (arg0 == 6640) {
            class35 var53 = client.method2271().method5796();
            if (var53 == null) {
                field1080[++Statics.field1081 - 1] = -1;
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = var53.method196();
                field1080[++Statics.field1081 - 1] = var53.field282.method3579();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1080[--Statics.field1081];
            class242 var55 = class242.method2284(var54);
            if (var55.field3188 == null) {
                field1082[++Statics.field1083 - 1] = "";
            } else {
                field1082[++Statics.field1083 - 1] = var55.field3188;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1080[--Statics.field1081];
            class242 var57 = class242.method2284(var56);
            field1080[++Statics.field1081 - 1] = var57.field3209;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1080[--Statics.field1081];
            class242 var59 = class242.method2284(var58);
            if (var59 == null) {
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = var59.field3194;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1080[--Statics.field1081];
            class242 var61 = class242.method2284(var60);
            if (var61 == null) {
                field1080[++Statics.field1081 - 1] = -1;
            } else {
                field1080[++Statics.field1081 - 1] = var61.field3193;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1080[++Statics.field1081 - 1] = Statics.field3307.field337;
            return 1;
        } else if (arg0 == 6698) {
            field1080[++Statics.field1081 - 1] = Statics.field3307.field332.method3579();
            return 1;
        } else if (arg0 == 6699) {
            field1080[++Statics.field1081 - 1] = Statics.field3307.field336.method3579();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gg.av(II)V")
    public static void method3273(int arg0) {
        if (arg0 == -1 || !class218.method178(arg0)) {
            return;
        }
        class218[] var1 = Statics.field1967[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2664 != null) {
                class63 var4 = new class63();
                var4.field566 = var3;
                var4.field572 = var3.field2664;
                method719(var4, 5000000);
            }
        }
    }
}
