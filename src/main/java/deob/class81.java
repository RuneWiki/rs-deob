package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cc")
public class class81 {

    @ObfuscatedName("cc.j")
    public static int[] field1222 = new int[5];

    @ObfuscatedName("cc.a")
    public static int[][] field1219 = new int[5][5000];

    @ObfuscatedName("cc.t")
    public static int[] field1224 = new int[1000];

    @ObfuscatedName("cc.m")
    public static String[] field1226 = new String[1000];

    @ObfuscatedName("cc.o")
    public static int field1231 = 0;

    @ObfuscatedName("cc.x")
    public static class63[] field1227 = new class63[50];

    @ObfuscatedName("cc.n")
    public static Calendar field1229 = Calendar.getInstance();

    @ObfuscatedName("cc.y")
    public static final String[] field1230 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cc.l")
    public static int field1228 = 0;

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.p(Lbk;I)V")
    public static void method1724(class68 arg0) {
        method3653(arg0, 200000);
    }

    @ObfuscatedName("hh.i(Lbk;IB)V")
    public static void method3653(class68 arg0, int arg1) {
        Object[] var2 = arg0.field748;
        class231 var3 = arg0.field757;
        boolean var4 = class231.field2887 == var3 || class231.field2881 == var3 || class231.field2879 == var3 || class231.field2885 == var3 || class231.field2880 == var3 || class231.field2882 == var3 || class231.field2883 == var3 || class231.field2884 == var3;
        class96 var6;
        if (var4) {
            Statics.field1993 = (class48) var2[0];
            class254 var5 = Statics.field3354[Statics.field1993.field557];
            var6 = class96.method644(arg0.field757, var5.field3361, var5.field3374);
        } else {
            int var7 = (Integer) var2[0];
            class96 var8 = (class96) class96.field1422.method3504((long) var7);
            class96 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field390.method4032(var7, 0);
                if (var10 == null) {
                    var9 = null;
                } else {
                    class96 var11 = class96.method1358(var10);
                    class96.field1422.method3506(var11, (long) var7);
                    var9 = var11;
                }
            } else {
                var9 = var8;
            }
            var6 = var9;
        }
        if (var6 == null) {
            return;
        }
        Statics.field1234 = 0;
        Statics.field258 = 0;
        int var12 = -1;
        int[] var13 = var6.field1411;
        int[] var14 = var6.field1412;
        byte var15 = -1;
        field1231 = 0;
        try {
            Statics.field1220 = new int[var6.field1414];
            int var16 = 0;
            Statics.field1221 = new String[var6.field1415];
            int var17 = 0;
            for (int var18 = 1; var18 < var2.length; var18++) {
                if (var2[var18] instanceof Integer) {
                    int var19 = (Integer) var2[var18];
                    if (var19 == -2147483647) {
                        var19 = arg0.field749;
                    }
                    if (var19 == -2147483646) {
                        var19 = arg0.field747;
                    }
                    if (var19 == -2147483645) {
                        var19 = arg0.field750 == null ? -1 : arg0.field750.field2739;
                    }
                    if (var19 == -2147483644) {
                        var19 = arg0.field751;
                    }
                    if (var19 == -2147483643) {
                        var19 = arg0.field750 == null ? -1 : arg0.field750.field2841;
                    }
                    if (var19 == -2147483642) {
                        var19 = arg0.field753 == null ? -1 : arg0.field753.field2739;
                    }
                    if (var19 == -2147483641) {
                        var19 = arg0.field753 == null ? -1 : arg0.field753.field2841;
                    }
                    if (var19 == -2147483640) {
                        var19 = arg0.field746;
                    }
                    if (var19 == -2147483639) {
                        var19 = arg0.field754;
                    }
                    Statics.field1220[var16++] = var19;
                } else if (var2[var18] instanceof String) {
                    String var20 = (String) var2[var18];
                    if (var20.equals("event_opbase")) {
                        var20 = arg0.field755;
                    }
                    Statics.field1221[var17++] = var20;
                }
            }
            int var21 = 0;
            field1228 = arg0.field756;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                while (true) {
                                    while (true) {
                                        while (true) {
                                            while (true) {
                                                while (true) {
                                                    while (true) {
                                                        while (true) {
                                                            while (true) {
                                                                while (true) {
                                                                    while (true) {
                                                                        while (true) {
                                                                            while (true) {
                                                                                while (true) {
                                                                                    while (true) {
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                        while (true) {
                                                                                                            while (true) {
                                                                                                                label252: while (true) {
                                                                                                                    var21++;
                                                                                                                    if (var21 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var12++;
                                                                                                                    int var58 = var13[var12];
                                                                                                                    if (var58 >= 100) {
                                                                                                                        boolean var52;
                                                                                                                        if (var6.field1412[var12] == 1) {
                                                                                                                            var52 = true;
                                                                                                                        } else {
                                                                                                                            var52 = false;
                                                                                                                        }
                                                                                                                        int var53 = method1034(var58, var6, var52);
                                                                                                                        switch(var53) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var58 == 0) {
                                                                                                                        field1224[++Statics.field1234 - 1] = var14[var12];
                                                                                                                    } else if (var58 == 1) {
                                                                                                                        int var22 = var14[var12];
                                                                                                                        field1224[++Statics.field1234 - 1] = class223.field2691[var22];
                                                                                                                    } else if (var58 == 2) {
                                                                                                                        int var23 = var14[var12];
                                                                                                                        class223.field2691[var23] = field1224[--Statics.field1234];
                                                                                                                        client.method252(var23);
                                                                                                                    } else if (var58 == 3) {
                                                                                                                        field1226[++Statics.field258 - 1] = var6.field1413[var12];
                                                                                                                    } else if (var58 == 6) {
                                                                                                                        var12 += var14[var12];
                                                                                                                    } else if (var58 == 7) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1224[Statics.field1234] != field1224[Statics.field1234 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 8) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1224[Statics.field1234] == field1224[Statics.field1234 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 9) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1224[Statics.field1234] < field1224[Statics.field1234 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 10) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1224[Statics.field1234] > field1224[Statics.field1234 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 21) {
                                                                                                                        if (field1231 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var24 = field1227[--field1231];
                                                                                                                        var6 = var24.field710;
                                                                                                                        var13 = var6.field1411;
                                                                                                                        var14 = var6.field1412;
                                                                                                                        var12 = var24.field706;
                                                                                                                        Statics.field1220 = var24.field705;
                                                                                                                        Statics.field1221 = var24.field708;
                                                                                                                    } else if (var58 == 25) {
                                                                                                                        int var25 = var14[var12];
                                                                                                                        field1224[++Statics.field1234 - 1] = class223.method3012(var25);
                                                                                                                    } else if (var58 == 27) {
                                                                                                                        int var26 = var14[var12];
                                                                                                                        class223.method2801(var26, field1224[--Statics.field1234]);
                                                                                                                    } else if (var58 == 31) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1224[Statics.field1234] <= field1224[Statics.field1234 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 32) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1224[Statics.field1234] >= field1224[Statics.field1234 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 33) {
                                                                                                                        field1224[++Statics.field1234 - 1] = Statics.field1220[var14[var12]];
                                                                                                                    } else if (var58 == 34) {
                                                                                                                        Statics.field1220[var14[var12]] = field1224[--Statics.field1234];
                                                                                                                    } else if (var58 == 35) {
                                                                                                                        field1226[++Statics.field258 - 1] = Statics.field1221[var14[var12]];
                                                                                                                    } else if (var58 == 36) {
                                                                                                                        Statics.field1221[var14[var12]] = field1226[--Statics.field258];
                                                                                                                    } else if (var58 == 37) {
                                                                                                                        int var27 = var14[var12];
                                                                                                                        Statics.field258 -= var27;
                                                                                                                        String var28 = class294.method2993(field1226, Statics.field258, var27);
                                                                                                                        field1226[++Statics.field258 - 1] = var28;
                                                                                                                    } else if (var58 == 38) {
                                                                                                                        Statics.field1234--;
                                                                                                                    } else if (var58 == 39) {
                                                                                                                        Statics.field258--;
                                                                                                                    } else if (var58 == 40) {
                                                                                                                        int var29 = var14[var12];
                                                                                                                        class96 var30 = (class96) class96.field1422.method3504((long) var29);
                                                                                                                        class96 var31;
                                                                                                                        if (var30 == null) {
                                                                                                                            byte[] var32 = Statics.field390.method4032(var29, 0);
                                                                                                                            if (var32 == null) {
                                                                                                                                var31 = null;
                                                                                                                            } else {
                                                                                                                                class96 var33 = class96.method1358(var32);
                                                                                                                                class96.field1422.method3506(var33, (long) var29);
                                                                                                                                var31 = var33;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var31 = var30;
                                                                                                                        }
                                                                                                                        class96 var34 = var31;
                                                                                                                        int[] var35 = new int[var31.field1414];
                                                                                                                        String[] var36 = new String[var31.field1415];
                                                                                                                        for (int var37 = 0; var37 < var34.field1416; var37++) {
                                                                                                                            var35[var37] = field1224[Statics.field1234 - var34.field1416 + var37];
                                                                                                                        }
                                                                                                                        for (int var38 = 0; var38 < var34.field1417; var38++) {
                                                                                                                            var36[var38] = field1226[Statics.field258 - var34.field1417 + var38];
                                                                                                                        }
                                                                                                                        Statics.field1234 -= var34.field1416;
                                                                                                                        Statics.field258 -= var34.field1417;
                                                                                                                        class63 var39 = new class63();
                                                                                                                        var39.field710 = var6;
                                                                                                                        var39.field706 = var12;
                                                                                                                        var39.field705 = Statics.field1220;
                                                                                                                        var39.field708 = Statics.field1221;
                                                                                                                        field1227[++field1231 - 1] = var39;
                                                                                                                        var6 = var34;
                                                                                                                        var13 = var34.field1411;
                                                                                                                        var14 = var34.field1412;
                                                                                                                        var12 = -1;
                                                                                                                        Statics.field1220 = var35;
                                                                                                                        Statics.field1221 = var36;
                                                                                                                    } else if (var58 == 42) {
                                                                                                                        field1224[++Statics.field1234 - 1] = Statics.field701.method1807(var14[var12]);
                                                                                                                    } else if (var58 == 43) {
                                                                                                                        Statics.field701.method1806(var14[var12], field1224[--Statics.field1234]);
                                                                                                                    } else if (var58 == 44) {
                                                                                                                        int var40 = var14[var12] >> 16;
                                                                                                                        int var41 = var14[var12] & 0xFFFF;
                                                                                                                        int var42 = field1224[--Statics.field1234];
                                                                                                                        if (var42 >= 0 && var42 <= 5000) {
                                                                                                                            field1222[var40] = var42;
                                                                                                                            byte var43 = -1;
                                                                                                                            if (var41 == 105) {
                                                                                                                                var43 = 0;
                                                                                                                            }
                                                                                                                            int var44 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var44 >= var42) {
                                                                                                                                    continue label252;
                                                                                                                                }
                                                                                                                                field1219[var40][var44] = var43;
                                                                                                                                var44++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var58 == 45) {
                                                                                                                        int var45 = var14[var12];
                                                                                                                        int var46 = field1224[--Statics.field1234];
                                                                                                                        if (var46 < 0 || var46 >= field1222[var45]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1224[++Statics.field1234 - 1] = field1219[var45][var46];
                                                                                                                    } else if (var58 == 46) {
                                                                                                                        int var47 = var14[var12];
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        int var48 = field1224[Statics.field1234];
                                                                                                                        if (var48 < 0 || var48 >= field1222[var47]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1219[var47][var48] = field1224[Statics.field1234 + 1];
                                                                                                                    } else if (var58 == 47) {
                                                                                                                        String var49 = Statics.field701.method1823(var14[var12]);
                                                                                                                        if (var49 == null) {
                                                                                                                            var49 = "null";
                                                                                                                        }
                                                                                                                        field1226[++Statics.field258 - 1] = var49;
                                                                                                                    } else if (var58 == 48) {
                                                                                                                        Statics.field701.method1808(var14[var12], field1226[--Statics.field258]);
                                                                                                                    } else if (var58 == 60) {
                                                                                                                        class198 var50 = var6.field1419[var14[var12]];
                                                                                                                        class210 var51 = (class210) var50.method3472((long) field1224[--Statics.field1234]);
                                                                                                                        if (var51 != null) {
                                                                                                                            var12 += var51.field2576;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        throw new IllegalStateException();
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception var57) {
            StringBuilder var55 = new StringBuilder(30);
            var55.append("").append(var6.field2563).append(" ");
            for (int var56 = field1231 - 1; var56 >= 0; var56--) {
                var55.append("").append(field1227[var56].field710.field2563).append(" ");
            }
            var55.append("").append(var15);
            class155.method1770(var55.toString(), var57);
        }
    }

    @ObfuscatedName("bo.w(ILcd;ZI)I")
    public static int method1034(int arg0, class96 arg1, boolean arg2) {
        if (arg0 < 1000) {
            byte var10;
            if (arg0 == 100) {
                Statics.field1234 -= 3;
                int var3 = field1224[Statics.field1234];
                int var4 = field1224[Statics.field1234 + 1];
                int var5 = field1224[Statics.field1234 + 2];
                if (var4 == 0) {
                    throw new RuntimeException();
                }
                class228 var6 = class228.method471(var3);
                if (var6.field2794 == null) {
                    var6.field2794 = new class228[var5 + 1];
                }
                if (var6.field2794.length <= var5) {
                    class228[] var7 = new class228[var5 + 1];
                    for (int var8 = 0; var8 < var6.field2794.length; var8++) {
                        var7[var8] = var6.field2794[var8];
                    }
                    var6.field2794 = var7;
                }
                if (var5 > 0 && var6.field2794[var5 - 1] == null) {
                    throw new RuntimeException("" + (var5 - 1));
                }
                class228 var9 = new class228();
                var9.field2741 = var4;
                var9.field2758 = var9.field2739 = var6.field2739;
                var9.field2841 = var5;
                var9.field2738 = true;
                var6.field2794[var5] = var9;
                if (arg2) {
                    Statics.field332 = var9;
                } else {
                    Statics.field298 = var9;
                }
                client.method924(var6);
                var10 = 1;
            } else if (arg0 == 101) {
                class228 var11 = arg2 ? Statics.field332 : Statics.field298;
                class228 var12 = class228.method471(var11.field2739);
                var12.field2794[var11.field2841] = null;
                client.method924(var12);
                var10 = 1;
            } else if (arg0 == 102) {
                class228 var13 = class228.method471(field1224[--Statics.field1234]);
                var13.field2794 = null;
                client.method924(var13);
                var10 = 1;
            } else if (arg0 == 200) {
                Statics.field1234 -= 2;
                int var14 = field1224[Statics.field1234];
                int var15 = field1224[Statics.field1234 + 1];
                class228 var16 = class228.method256(var14, var15);
                if (var16 == null || var15 == -1) {
                    field1224[++Statics.field1234 - 1] = 0;
                } else {
                    field1224[++Statics.field1234 - 1] = 1;
                    if (arg2) {
                        Statics.field332 = var16;
                    } else {
                        Statics.field298 = var16;
                    }
                }
                var10 = 1;
            } else if (arg0 == 201) {
                class228 var17 = class228.method471(field1224[--Statics.field1234]);
                if (var17 == null) {
                    field1224[++Statics.field1234 - 1] = 0;
                } else {
                    field1224[++Statics.field1234 - 1] = 1;
                    if (arg2) {
                        Statics.field332 = var17;
                    } else {
                        Statics.field298 = var17;
                    }
                }
                var10 = 1;
            } else {
                var10 = 2;
            }
            return var10;
        } else if (arg0 < 1100) {
            return method1484(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method4259(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method467(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method2800(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method1882(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method3045(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method101(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method493(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            class228 var18 = arg2 ? Statics.field332 : Statics.field298;
            byte var19;
            if (arg0 == 1800) {
                field1224[++Statics.field1234 - 1] = class229.method3003(client.method920(var18));
                var19 = 1;
            } else if (arg0 == 1801) {
                int var20 = field1224[--Statics.field1234];
                int var259 = var20 - 1;
                if (var18.field2828 == null || var259 >= var18.field2828.length || var18.field2828[var259] == null) {
                    field1226[++Statics.field258 - 1] = "";
                } else {
                    field1226[++Statics.field258 - 1] = var18.field2828[var259];
                }
                var19 = 1;
            } else if (arg0 == 1802) {
                if (var18.field2812 == null) {
                    field1226[++Statics.field258 - 1] = "";
                } else {
                    field1226[++Statics.field258 - 1] = var18.field2812;
                }
                var19 = 1;
            } else {
                var19 = 2;
            }
            return var19;
        } else if (arg0 < 2000) {
            int var21 = arg0;
            class228 var22;
            if (arg0 >= 2000) {
                var21 = arg0 - 1000;
                var22 = class228.method471(field1224[--Statics.field1234]);
            } else {
                var22 = arg2 ? Statics.field332 : Statics.field298;
            }
            byte var23;
            if (var21 == 1927) {
                if (field1228 >= 10) {
                    throw new RuntimeException();
                }
                if (var22.field2745 == null) {
                    var23 = 0;
                } else {
                    class68 var24 = new class68();
                    var24.field750 = var22;
                    var24.field748 = var22.field2745;
                    var24.field756 = field1228 + 1;
                    client.field1007.method3572(var24);
                    var23 = 1;
                }
            } else {
                var23 = 2;
            }
            return var23;
        } else if (arg0 < 2100) {
            return method1484(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method4259(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method467(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method2800(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method1882(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            class228 var25 = class228.method471(field1224[--Statics.field1234]);
            byte var26;
            if (arg0 == 2500) {
                field1224[++Statics.field1234 - 1] = var25.field2847;
                var26 = 1;
            } else if (arg0 == 2501) {
                field1224[++Statics.field1234 - 1] = var25.field2753;
                var26 = 1;
            } else if (arg0 == 2502) {
                field1224[++Statics.field1234 - 1] = var25.field2754;
                var26 = 1;
            } else if (arg0 == 2503) {
                field1224[++Statics.field1234 - 1] = var25.field2764;
                var26 = 1;
            } else if (arg0 == 2504) {
                field1224[++Statics.field1234 - 1] = var25.field2797 ? 1 : 0;
                var26 = 1;
            } else if (arg0 == 2505) {
                field1224[++Statics.field1234 - 1] = var25.field2758;
                var26 = 1;
            } else {
                var26 = 2;
            }
            return var26;
        } else if (arg0 < 2700) {
            return method469(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            byte var28;
            if (arg0 == 2700) {
                class228 var27 = class228.method471(field1224[--Statics.field1234]);
                field1224[++Statics.field1234 - 1] = var27.field2848;
                var28 = 1;
            } else if (arg0 == 2701) {
                class228 var29 = class228.method471(field1224[--Statics.field1234]);
                if (var29.field2848 == -1) {
                    field1224[++Statics.field1234 - 1] = 0;
                } else {
                    field1224[++Statics.field1234 - 1] = var29.field2860;
                }
                var28 = 1;
            } else if (arg0 == 2702) {
                int var30 = field1224[--Statics.field1234];
                class67 var31 = (class67) client.field969.method3517((long) var30);
                if (var31 == null) {
                    field1224[++Statics.field1234 - 1] = 0;
                } else {
                    field1224[++Statics.field1234 - 1] = 1;
                }
                var28 = 1;
            } else if (arg0 == 2706) {
                field1224[++Statics.field1234 - 1] = client.field968;
                var28 = 1;
            } else {
                var28 = 2;
            }
            return var28;
        } else if (arg0 < 2900) {
            class228 var32 = class228.method471(field1224[--Statics.field1234]);
            byte var33;
            if (arg0 == 2800) {
                field1224[++Statics.field1234 - 1] = class229.method3003(client.method920(var32));
                var33 = 1;
            } else if (arg0 == 2801) {
                int var34 = field1224[--Statics.field1234];
                int var260 = var34 - 1;
                if (var32.field2828 == null || var260 >= var32.field2828.length || var32.field2828[var260] == null) {
                    field1226[++Statics.field258 - 1] = "";
                } else {
                    field1226[++Statics.field258 - 1] = var32.field2828[var260];
                }
                var33 = 1;
            } else if (arg0 == 2802) {
                if (var32.field2812 == null) {
                    field1226[++Statics.field258 - 1] = "";
                } else {
                    field1226[++Statics.field258 - 1] = var32.field2812;
                }
                var33 = 1;
            } else {
                var33 = 2;
            }
            return var33;
        } else if (arg0 < 3000) {
            int var35 = arg0;
            class228 var36;
            if (arg0 >= 2000) {
                var35 = arg0 - 1000;
                var36 = class228.method471(field1224[--Statics.field1234]);
            } else {
                var36 = arg2 ? Statics.field332 : Statics.field298;
            }
            byte var37;
            if (var35 == 1927) {
                if (field1228 >= 10) {
                    throw new RuntimeException();
                }
                if (var36.field2745 == null) {
                    var37 = 0;
                } else {
                    class68 var38 = new class68();
                    var38.field750 = var36;
                    var38.field748 = var36.field2745;
                    var38.field756 = field1228 + 1;
                    client.field1007.method3572(var38);
                    var37 = 1;
                }
            } else {
                var37 = 2;
            }
            return var37;
        } else if (arg0 < 3200) {
            byte var40;
            if (arg0 == 3100) {
                String var39 = field1226[--Statics.field258];
                Statics.method4020(0, "", var39);
                var40 = 1;
            } else if (arg0 == 3101) {
                Statics.field1234 -= 2;
                client.method180(Statics.field470, field1224[Statics.field1234], field1224[Statics.field1234 + 1]);
                var40 = 1;
            } else if (arg0 == 3103) {
                Statics.method2824();
                var40 = 1;
            } else if (arg0 == 3104) {
                String var41 = field1226[--Statics.field258];
                int var42 = 0;
                boolean var43 = false;
                boolean var44 = false;
                int var45 = 0;
                int var46 = var41.length();
                int var47 = 0;
                boolean var49;
                while (true) {
                    if (var47 >= var46) {
                        var49 = var44;
                        break;
                    }
                    label1330: {
                        char var48 = var41.charAt(var47);
                        if (var47 == 0) {
                            if (var48 == '-') {
                                var43 = true;
                                break label1330;
                            }
                            if (var48 == '+') {
                                break label1330;
                            }
                        }
                        int var261;
                        if (var48 >= '0' && var48 <= '9') {
                            var261 = var48 - '0';
                        } else if (var48 >= 'A' && var48 <= 'Z') {
                            var261 = var48 - '7';
                        } else {
                            if (var48 < 'a' || var48 > 'z') {
                                var49 = false;
                                break;
                            }
                            var261 = var48 - 'W';
                        }
                        if (var261 >= 10) {
                            var49 = false;
                            break;
                        }
                        if (var43) {
                            var261 = -var261;
                        }
                        int var50 = var45 * 10 + var261;
                        if (var50 / 10 != var45) {
                            var49 = false;
                            break;
                        }
                        var45 = var50;
                        var44 = true;
                    }
                    var47++;
                }
                if (var49) {
                    int var52 = class294.method66(var41, 10, true);
                    var42 = var52;
                }
                class175 var53 = class175.method470(class172.field2357, client.field868.field1440);
                var53.field2403.method3110(var42);
                client.field868.method1879(var53);
                var40 = 1;
            } else if (arg0 == 3105) {
                String var54 = field1226[--Statics.field258];
                class175 var55 = class175.method470(class172.field2312, client.field868.field1440);
                var55.field2403.method3107(var54.length() + 1);
                var55.field2403.method3189(var54);
                client.field868.method1879(var55);
                var40 = 1;
            } else if (arg0 == 3106) {
                String var56 = field1226[--Statics.field258];
                class175 var57 = class175.method470(class172.field2319, client.field868.field1440);
                var57.field2403.method3107(var56.length() + 1);
                var57.field2403.method3189(var56);
                client.field868.method1879(var57);
                var40 = 1;
            } else if (arg0 == 3107) {
                int var58 = field1224[--Statics.field1234];
                String var59 = field1226[--Statics.field258];
                Statics.method4003(var58, var59);
                var40 = 1;
            } else if (arg0 == 3108) {
                Statics.field1234 -= 3;
                int var60 = field1224[Statics.field1234];
                int var61 = field1224[Statics.field1234 + 1];
                int var62 = field1224[Statics.field1234 + 2];
                class228 var63 = class228.method471(var62);
                client.method1744(var63, var60, var61);
                var40 = 1;
            } else if (arg0 == 3109) {
                Statics.field1234 -= 2;
                int var64 = field1224[Statics.field1234];
                int var65 = field1224[Statics.field1234 + 1];
                class228 var66 = arg2 ? Statics.field332 : Statics.field298;
                client.method1744(var66, var64, var65);
                var40 = 1;
            } else if (arg0 == 3110) {
                Statics.field848 = field1224[--Statics.field1234] == 1;
                var40 = 1;
            } else if (arg0 == 3111) {
                field1224[++Statics.field1234 - 1] = Statics.field2688.field1184 ? 1 : 0;
                var40 = 1;
            } else if (arg0 == 3112) {
                Statics.field2688.field1184 = field1224[--Statics.field1234] == 1;
                class78.method1030();
                var40 = 1;
            } else if (arg0 == 3113) {
                String var67 = field1226[--Statics.field258];
                boolean var68 = field1224[--Statics.field1234] == 1;
                class57.method145(var67, var68, "openjs", false);
                var40 = 1;
            } else if (arg0 == 3115) {
                int var69 = field1224[--Statics.field1234];
                class175 var70 = class175.method470(class172.field2291, client.field868.field1440);
                var70.field2403.method3250(var69);
                client.field868.method1879(var70);
                var40 = 1;
            } else if (arg0 == 3116) {
                int var71 = field1224[--Statics.field1234];
                Statics.field258 -= 2;
                String var72 = field1226[Statics.field258];
                String var73 = field1226[Statics.field258 + 1];
                if (var72.length() > 500) {
                    var40 = 1;
                } else if (var73.length() > 500) {
                    var40 = 1;
                } else {
                    class175 var74 = class175.method470(class172.field2361, client.field868.field1440);
                    var74.field2403.method3250(1 + class185.method1722(var72) + class185.method1722(var73));
                    var74.field2403.method3189(var72);
                    var74.field2403.method3189(var73);
                    var74.field2403.method3148(var71);
                    client.field868.method1879(var74);
                    var40 = 1;
                }
            } else if (arg0 == 3117) {
                client.field955 = field1224[--Statics.field1234] == 1;
                var40 = 1;
            } else {
                var40 = 2;
            }
            return var40;
        } else if (arg0 < 3300) {
            byte var78;
            if (arg0 == 3200) {
                Statics.field1234 -= 3;
                int var75 = field1224[Statics.field1234];
                int var76 = field1224[Statics.field1234 + 1];
                int var77 = field1224[Statics.field1234 + 2];
                if (client.field1009 != 0 && var76 != 0 && client.field1046 < 50) {
                    client.field1047[client.field1046] = var75;
                    client.field1048[client.field1046] = var76;
                    client.field895[client.field1046] = var77;
                    client.field856[client.field1046] = null;
                    client.field843[client.field1046] = 0;
                    client.field1046++;
                }
                var78 = 1;
            } else if (arg0 == 3201) {
                client.method976(field1224[--Statics.field1234]);
                var78 = 1;
            } else if (arg0 == 3202) {
                Statics.field1234 -= 2;
                int var79 = field1224[Statics.field1234];
                int var80 = field1224[Statics.field1234 + 1];
                if (client.field1041 != 0 && var79 != -1) {
                    class215.method2935(Statics.field784, var79, 0, client.field1041, false);
                    client.field1015 = true;
                }
                var78 = 1;
            } else {
                var78 = 2;
            }
            return var78;
        } else if (arg0 < 3400) {
            return method158(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method1712(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method172(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method3344(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            byte var83;
            if (arg0 == 4000) {
                Statics.field1234 -= 2;
                int var81 = field1224[Statics.field1234];
                int var82 = field1224[Statics.field1234 + 1];
                field1224[++Statics.field1234 - 1] = var81 + var82;
                var83 = 1;
            } else if (arg0 == 4001) {
                Statics.field1234 -= 2;
                int var84 = field1224[Statics.field1234];
                int var85 = field1224[Statics.field1234 + 1];
                field1224[++Statics.field1234 - 1] = var84 - var85;
                var83 = 1;
            } else if (arg0 == 4002) {
                Statics.field1234 -= 2;
                int var86 = field1224[Statics.field1234];
                int var87 = field1224[Statics.field1234 + 1];
                field1224[++Statics.field1234 - 1] = var86 * var87;
                var83 = 1;
            } else if (arg0 == 4003) {
                Statics.field1234 -= 2;
                int var88 = field1224[Statics.field1234];
                int var89 = field1224[Statics.field1234 + 1];
                field1224[++Statics.field1234 - 1] = var88 / var89;
                var83 = 1;
            } else if (arg0 == 4004) {
                int var90 = field1224[--Statics.field1234];
                field1224[++Statics.field1234 - 1] = (int) (Math.random() * (double) var90);
                var83 = 1;
            } else if (arg0 == 4005) {
                int var91 = field1224[--Statics.field1234];
                field1224[++Statics.field1234 - 1] = (int) (Math.random() * (double) (var91 + 1));
                var83 = 1;
            } else if (arg0 == 4006) {
                Statics.field1234 -= 5;
                int var92 = field1224[Statics.field1234];
                int var93 = field1224[Statics.field1234 + 1];
                int var94 = field1224[Statics.field1234 + 2];
                int var95 = field1224[Statics.field1234 + 3];
                int var96 = field1224[Statics.field1234 + 4];
                field1224[++Statics.field1234 - 1] = (var93 - var92) * (var96 - var94) / (var95 - var94) + var92;
                var83 = 1;
            } else if (arg0 == 4007) {
                Statics.field1234 -= 2;
                int var97 = field1224[Statics.field1234];
                int var98 = field1224[Statics.field1234 + 1];
                field1224[++Statics.field1234 - 1] = var97 * var98 / 100 + var97;
                var83 = 1;
            } else if (arg0 == 4008) {
                Statics.field1234 -= 2;
                int var99 = field1224[Statics.field1234];
                int var100 = field1224[Statics.field1234 + 1];
                field1224[++Statics.field1234 - 1] = var99 | 0x1 << var100;
                var83 = 1;
            } else if (arg0 == 4009) {
                Statics.field1234 -= 2;
                int var101 = field1224[Statics.field1234];
                int var102 = field1224[Statics.field1234 + 1];
                field1224[++Statics.field1234 - 1] = var101 & -1 - (0x1 << var102);
                var83 = 1;
            } else if (arg0 == 4010) {
                Statics.field1234 -= 2;
                int var103 = field1224[Statics.field1234];
                int var104 = field1224[Statics.field1234 + 1];
                field1224[++Statics.field1234 - 1] = (var103 & 0x1 << var104) == 0 ? 0 : 1;
                var83 = 1;
            } else if (arg0 == 4011) {
                Statics.field1234 -= 2;
                int var105 = field1224[Statics.field1234];
                int var106 = field1224[Statics.field1234 + 1];
                field1224[++Statics.field1234 - 1] = var105 % var106;
                var83 = 1;
            } else if (arg0 == 4012) {
                Statics.field1234 -= 2;
                int var107 = field1224[Statics.field1234];
                int var108 = field1224[Statics.field1234 + 1];
                if (var107 == 0) {
                    field1224[++Statics.field1234 - 1] = 0;
                } else {
                    field1224[++Statics.field1234 - 1] = (int) Math.pow((double) var107, (double) var108);
                }
                var83 = 1;
            } else if (arg0 == 4013) {
                Statics.field1234 -= 2;
                int var109 = field1224[Statics.field1234];
                int var110 = field1224[Statics.field1234 + 1];
                if (var109 == 0) {
                    field1224[++Statics.field1234 - 1] = 0;
                    var83 = 1;
                } else {
                    switch(var110) {
                        case 0:
                            field1224[++Statics.field1234 - 1] = Integer.MAX_VALUE;
                            break;
                        case 1:
                            field1224[++Statics.field1234 - 1] = var109;
                            break;
                        case 2:
                            field1224[++Statics.field1234 - 1] = (int) Math.sqrt((double) var109);
                            break;
                        case 3:
                            field1224[++Statics.field1234 - 1] = (int) Math.cbrt((double) var109);
                            break;
                        case 4:
                            field1224[++Statics.field1234 - 1] = (int) Math.sqrt(Math.sqrt((double) var109));
                            break;
                        default:
                            field1224[++Statics.field1234 - 1] = (int) Math.pow((double) var109, 1.0D / (double) var110);
                    }
                    var83 = 1;
                }
            } else if (arg0 == 4014) {
                Statics.field1234 -= 2;
                int var111 = field1224[Statics.field1234];
                int var112 = field1224[Statics.field1234 + 1];
                field1224[++Statics.field1234 - 1] = var111 & var112;
                var83 = 1;
            } else if (arg0 == 4015) {
                Statics.field1234 -= 2;
                int var113 = field1224[Statics.field1234];
                int var114 = field1224[Statics.field1234 + 1];
                field1224[++Statics.field1234 - 1] = var113 | var114;
                var83 = 1;
            } else if (arg0 == 4018) {
                Statics.field1234 -= 3;
                long var115 = (long) field1224[Statics.field1234];
                long var117 = (long) field1224[Statics.field1234 + 1];
                long var119 = (long) field1224[Statics.field1234 + 2];
                field1224[++Statics.field1234 - 1] = (int) (var115 * var119 / var117);
                var83 = 1;
            } else {
                var83 = 2;
            }
            return var83;
        } else if (arg0 < 4200) {
            byte var123;
            if (arg0 == 4100) {
                String var121 = field1226[--Statics.field258];
                int var122 = field1224[--Statics.field1234];
                field1226[++Statics.field258 - 1] = var121 + var122;
                var123 = 1;
            } else if (arg0 == 4101) {
                Statics.field258 -= 2;
                String var124 = field1226[Statics.field258];
                String var125 = field1226[Statics.field258 + 1];
                field1226[++Statics.field258 - 1] = var124 + var125;
                var123 = 1;
            } else if (arg0 == 4102) {
                String var126 = field1226[--Statics.field258];
                int var127 = field1224[--Statics.field1234];
                String[] var128 = field1226;
                int var129 = ++Statics.field258 - 1;
                String var131;
                if (var127 < 0) {
                    var131 = Integer.toString(var127);
                } else {
                    var131 = class294.method3340(var127, 10, true);
                }
                var128[var129] = var126 + var131;
                var123 = 1;
            } else if (arg0 == 4103) {
                String var132 = field1226[--Statics.field258];
                field1226[++Statics.field258 - 1] = var132.toLowerCase();
                var123 = 1;
            } else if (arg0 == 4104) {
                int var133 = field1224[--Statics.field1234];
                long var134 = ((long) var133 + 11745L) * 86400000L;
                field1229.setTime(new Date(var134));
                int var136 = field1229.get(5);
                int var137 = field1229.get(2);
                int var138 = field1229.get(1);
                field1226[++Statics.field258 - 1] = var136 + "-" + field1230[var137] + "-" + var138;
                var123 = 1;
            } else if (arg0 == 4105) {
                Statics.field258 -= 2;
                String var139 = field1226[Statics.field258];
                String var140 = field1226[Statics.field258 + 1];
                if (Statics.field470.field788 != null && Statics.field470.field788.field2704) {
                    field1226[++Statics.field258 - 1] = var140;
                } else {
                    field1226[++Statics.field258 - 1] = var139;
                }
                var123 = 1;
            } else if (arg0 == 4106) {
                int var141 = field1224[--Statics.field1234];
                field1226[++Statics.field258 - 1] = Integer.toString(var141);
                var123 = 1;
            } else if (arg0 == 4107) {
                Statics.field258 -= 2;
                field1224[++Statics.field1234 - 1] = class294.method1490(class176.method479(field1226[Statics.field258], field1226[Statics.field258 + 1], client.field828));
                var123 = 1;
            } else if (arg0 == 4108) {
                String var142 = field1226[--Statics.field258];
                Statics.field1234 -= 2;
                int var143 = field1224[Statics.field1234];
                int var144 = field1224[Statics.field1234 + 1];
                byte[] var145 = Statics.field3850.method4032(var144, 0);
                class287 var146 = new class287(var145);
                field1224[++Statics.field1234 - 1] = var146.method4813(var142, var143);
                var123 = 1;
            } else if (arg0 == 4109) {
                String var147 = field1226[--Statics.field258];
                Statics.field1234 -= 2;
                int var148 = field1224[Statics.field1234];
                int var149 = field1224[Statics.field1234 + 1];
                byte[] var150 = Statics.field3850.method4032(var149, 0);
                class287 var151 = new class287(var150);
                field1224[++Statics.field1234 - 1] = var151.method4815(var147, var148);
                var123 = 1;
            } else if (arg0 == 4110) {
                Statics.field258 -= 2;
                String var152 = field1226[Statics.field258];
                String var153 = field1226[Statics.field258 + 1];
                if (field1224[--Statics.field1234] == 1) {
                    field1226[++Statics.field258 - 1] = var152;
                } else {
                    field1226[++Statics.field258 - 1] = var153;
                }
                var123 = 1;
            } else if (arg0 == 4111) {
                String var154 = field1226[--Statics.field258];
                field1226[++Statics.field258 - 1] = class288.method4817(var154);
                var123 = 1;
            } else if (arg0 == 4112) {
                String var155 = field1226[--Statics.field258];
                int var156 = field1224[--Statics.field1234];
                field1226[++Statics.field258 - 1] = var155 + (char) var156;
                var123 = 1;
            } else if (arg0 == 4113) {
                int var157 = field1224[--Statics.field1234];
                int[] var158 = field1224;
                int var159 = ++Statics.field1234 - 1;
                char var160 = (char) var157;
                boolean var161;
                if (var160 >= ' ' && var160 <= '~') {
                    var161 = true;
                } else if (var160 >= 160 && var160 <= 255) {
                    var161 = true;
                } else if (var160 == 8364 || var160 == 338 || var160 == 8212 || var160 == 339 || var160 == 376) {
                    var161 = true;
                } else {
                    var161 = false;
                }
                var158[var159] = var161 ? 1 : 0;
                var123 = 1;
            } else if (arg0 == 4114) {
                int var162 = field1224[--Statics.field1234];
                field1224[++Statics.field1234 - 1] = class294.method2837((char) var162) ? 1 : 0;
                var123 = 1;
            } else if (arg0 == 4115) {
                int var163 = field1224[--Statics.field1234];
                int[] var164 = field1224;
                int var165 = ++Statics.field1234 - 1;
                char var166 = (char) var163;
                boolean var167 = var166 >= 'A' && var166 <= 'Z' || var166 >= 'a' && var166 <= 'z';
                var164[var165] = var167 ? 1 : 0;
                var123 = 1;
            } else if (arg0 == 4116) {
                int var168 = field1224[--Statics.field1234];
                int[] var169 = field1224;
                int var170 = ++Statics.field1234 - 1;
                char var171 = (char) var168;
                boolean var172 = var171 >= '0' && var171 <= '9';
                var169[var170] = var172 ? 1 : 0;
                var123 = 1;
            } else if (arg0 == 4117) {
                String var173 = field1226[--Statics.field258];
                if (var173 == null) {
                    field1224[++Statics.field1234 - 1] = 0;
                } else {
                    field1224[++Statics.field1234 - 1] = var173.length();
                }
                var123 = 1;
            } else if (arg0 == 4118) {
                String var174 = field1226[--Statics.field258];
                Statics.field1234 -= 2;
                int var175 = field1224[Statics.field1234];
                int var176 = field1224[Statics.field1234 + 1];
                field1226[++Statics.field258 - 1] = var174.substring(var175, var176);
                var123 = 1;
            } else if (arg0 == 4119) {
                String var177 = field1226[--Statics.field258];
                StringBuilder var178 = new StringBuilder(var177.length());
                boolean var179 = false;
                for (int var180 = 0; var180 < var177.length(); var180++) {
                    char var181 = var177.charAt(var180);
                    if (var181 == '<') {
                        var179 = true;
                    } else if (var181 == '>') {
                        var179 = false;
                    } else if (!var179) {
                        var178.append(var181);
                    }
                }
                field1226[++Statics.field258 - 1] = var178.toString();
                var123 = 1;
            } else if (arg0 == 4120) {
                String var182 = field1226[--Statics.field258];
                int var183 = field1224[--Statics.field1234];
                field1224[++Statics.field1234 - 1] = var182.indexOf(var183);
                var123 = 1;
            } else if (arg0 == 4121) {
                Statics.field258 -= 2;
                String var184 = field1226[Statics.field258];
                String var185 = field1226[Statics.field258 + 1];
                int var186 = field1224[--Statics.field1234];
                field1224[++Statics.field1234 - 1] = var184.indexOf(var185, var186);
                var123 = 1;
            } else {
                var123 = 2;
            }
            return var123;
        } else if (arg0 < 4300) {
            return Statics.method58(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method20(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            byte var187;
            if (arg0 == 5306) {
                field1224[++Statics.field1234 - 1] = client.method1528();
                var187 = 1;
            } else if (arg0 == 5307) {
                int var188 = field1224[--Statics.field1234];
                if (var188 == 1 || var188 == 2) {
                    client.method1659(var188);
                }
                var187 = 1;
            } else if (arg0 == 5308) {
                field1224[++Statics.field1234 - 1] = Statics.field2688.field1190;
                var187 = 1;
            } else if (arg0 == 5309) {
                int var189 = field1224[--Statics.field1234];
                if (var189 == 1 || var189 == 2) {
                    Statics.field2688.field1190 = var189;
                    class78.method1030();
                }
                var187 = 1;
            } else {
                var187 = 2;
            }
            return var187;
        } else if (arg0 < 5600) {
            byte var195;
            if (arg0 == 5504) {
                Statics.field1234 -= 2;
                int var193 = field1224[Statics.field1234];
                int var194 = field1224[Statics.field1234 + 1];
                if (!client.field1052) {
                    client.field890 = var193;
                    client.field853 = var194;
                }
                var195 = 1;
            } else if (arg0 == 5505) {
                field1224[++Statics.field1234 - 1] = client.field890;
                var195 = 1;
            } else if (arg0 == 5506) {
                field1224[++Statics.field1234 - 1] = client.field853;
                var195 = 1;
            } else if (arg0 == 5530) {
                int var196 = field1224[--Statics.field1234];
                if (var196 < 0) {
                    var196 = 0;
                }
                client.field896 = var196;
                var195 = 1;
            } else if (arg0 == 5531) {
                field1224[++Statics.field1234 - 1] = client.field896;
                var195 = 1;
            } else {
                var195 = 2;
            }
            return var195;
        } else if (arg0 < 5700) {
            byte var197;
            if (arg0 == 5630) {
                client.field1044 = 250;
                var197 = 1;
            } else {
                var197 = 2;
            }
            return var197;
        } else if (arg0 < 6300) {
            byte var198;
            if (arg0 == 6200) {
                Statics.field1234 -= 2;
                client.field1058 = (short) field1224[Statics.field1234];
                if (client.field1058 <= 0) {
                    client.field1058 = 256;
                }
                client.field1059 = (short) field1224[Statics.field1234 + 1];
                if (client.field1059 <= 0) {
                    client.field1059 = 205;
                }
                var198 = 1;
            } else if (arg0 == 6201) {
                Statics.field1234 -= 2;
                client.field857 = (short) field1224[Statics.field1234];
                if (client.field857 <= 0) {
                    client.field857 = 256;
                }
                client.field1061 = (short) field1224[Statics.field1234 + 1];
                if (client.field1061 <= 0) {
                    client.field1061 = 320;
                }
                var198 = 1;
            } else if (arg0 == 6202) {
                Statics.field1234 -= 4;
                client.field1062 = (short) field1224[Statics.field1234];
                if (client.field1062 <= 0) {
                    client.field1062 = 1;
                }
                client.field1063 = (short) field1224[Statics.field1234 + 1];
                if (client.field1063 <= 0) {
                    client.field1063 = 32767;
                } else if (client.field1063 < client.field1062) {
                    client.field1063 = client.field1062;
                }
                client.field1064 = (short) field1224[Statics.field1234 + 2];
                if (client.field1064 <= 0) {
                    client.field1064 = 1;
                }
                client.field1065 = (short) field1224[Statics.field1234 + 3];
                if (client.field1065 <= 0) {
                    client.field1065 = 32767;
                } else if (client.field1065 < client.field1064) {
                    client.field1065 = client.field1064;
                }
                var198 = 1;
            } else if (arg0 == 6203) {
                if (client.field980 == null) {
                    field1224[++Statics.field1234 - 1] = -1;
                    field1224[++Statics.field1234 - 1] = -1;
                } else {
                    client.method978(0, 0, client.field980.field2754, client.field980.field2764, false);
                    field1224[++Statics.field1234 - 1] = client.field1068;
                    field1224[++Statics.field1234 - 1] = client.field912;
                }
                var198 = 1;
            } else if (arg0 == 6204) {
                field1224[++Statics.field1234 - 1] = client.field857;
                field1224[++Statics.field1234 - 1] = client.field1061;
                var198 = 1;
            } else if (arg0 == 6205) {
                field1224[++Statics.field1234 - 1] = client.field1058;
                field1224[++Statics.field1234 - 1] = client.field1059;
                var198 = 1;
            } else {
                var198 = 2;
            }
            return var198;
        } else if (arg0 < 6600) {
            return method4005(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            byte var202;
            if (arg0 == 6600) {
                int var199 = Statics.field780;
                int var200 = (Statics.field470.field1152 >> 7) + Statics.field407;
                int var201 = (Statics.field470.field1117 >> 7) + Statics.field1272;
                client.method89().method5257(var199, var200, var201, true);
                var202 = 1;
            } else if (arg0 == 6601) {
                int var203 = field1224[--Statics.field1234];
                String var204 = "";
                class33 var205 = client.method89().method5273(var203);
                if (var205 != null) {
                    var204 = var205.method269();
                }
                field1226[++Statics.field258 - 1] = var204;
                var202 = 1;
            } else if (arg0 == 6602) {
                int var206 = field1224[--Statics.field1234];
                client.method89().method5258(var206);
                var202 = 1;
            } else if (arg0 == 6603) {
                field1224[++Statics.field1234 - 1] = client.method89().method5270();
                var202 = 1;
            } else if (arg0 == 6604) {
                int var207 = field1224[--Statics.field1234];
                client.method89().method5267(var207);
                var202 = 1;
            } else if (arg0 == 6605) {
                field1224[++Statics.field1234 - 1] = client.method89().method5424() ? 1 : 0;
                var202 = 1;
            } else if (arg0 == 6606) {
                class224 var208 = new class224(field1224[--Statics.field1234]);
                client.method89().method5372(var208.field2697, var208.field2698);
                var202 = 1;
            } else if (arg0 == 6607) {
                class224 var209 = new class224(field1224[--Statics.field1234]);
                client.method89().method5407(var209.field2697, var209.field2698);
                var202 = 1;
            } else if (arg0 == 6608) {
                class224 var210 = new class224(field1224[--Statics.field1234]);
                client.method89().method5276(var210.field2700, var210.field2697, var210.field2698);
                var202 = 1;
            } else if (arg0 == 6609) {
                class224 var211 = new class224(field1224[--Statics.field1234]);
                client.method89().method5248(var211.field2700, var211.field2697, var211.field2698);
                var202 = 1;
            } else if (arg0 == 6610) {
                field1224[++Statics.field1234 - 1] = client.method89().method5427();
                field1224[++Statics.field1234 - 1] = client.method89().method5371();
                var202 = 1;
            } else if (arg0 == 6611) {
                int var212 = field1224[--Statics.field1234];
                class33 var213 = client.method89().method5273(var212);
                if (var213 == null) {
                    field1224[++Statics.field1234 - 1] = 0;
                } else {
                    field1224[++Statics.field1234 - 1] = var213.method278().method3877();
                }
                var202 = 1;
            } else if (arg0 == 6612) {
                int var214 = field1224[--Statics.field1234];
                class33 var215 = client.method89().method5273(var214);
                if (var215 == null) {
                    field1224[++Statics.field1234 - 1] = 0;
                    field1224[++Statics.field1234 - 1] = 0;
                } else {
                    field1224[++Statics.field1234 - 1] = (var215.method273() - var215.method327() + 1) * 64;
                    field1224[++Statics.field1234 - 1] = (var215.method276() - var215.method274() + 1) * 64;
                }
                var202 = 1;
            } else if (arg0 == 6613) {
                int var216 = field1224[--Statics.field1234];
                class33 var217 = client.method89().method5273(var216);
                if (var217 == null) {
                    field1224[++Statics.field1234 - 1] = 0;
                    field1224[++Statics.field1234 - 1] = 0;
                    field1224[++Statics.field1234 - 1] = 0;
                    field1224[++Statics.field1234 - 1] = 0;
                } else {
                    field1224[++Statics.field1234 - 1] = var217.method327() * 64;
                    field1224[++Statics.field1234 - 1] = var217.method274() * 64;
                    field1224[++Statics.field1234 - 1] = var217.method273() * 64 + 64 - 1;
                    field1224[++Statics.field1234 - 1] = var217.method276() * 64 + 64 - 1;
                }
                var202 = 1;
            } else if (arg0 == 6614) {
                int var218 = field1224[--Statics.field1234];
                class33 var219 = client.method89().method5273(var218);
                if (var219 == null) {
                    field1224[++Statics.field1234 - 1] = -1;
                } else {
                    field1224[++Statics.field1234 - 1] = var219.method271();
                }
                var202 = 1;
            } else if (arg0 == 6615) {
                class224 var220 = client.method89().method5280();
                if (var220 == null) {
                    field1224[++Statics.field1234 - 1] = -1;
                    field1224[++Statics.field1234 - 1] = -1;
                } else {
                    field1224[++Statics.field1234 - 1] = var220.field2697;
                    field1224[++Statics.field1234 - 1] = var220.field2698;
                }
                var202 = 1;
            } else if (arg0 == 6616) {
                field1224[++Statics.field1234 - 1] = client.method89().method5259();
                var202 = 1;
            } else if (arg0 == 6617) {
                class224 var221 = new class224(field1224[--Statics.field1234]);
                class33 var222 = client.method89().method5260();
                if (var222 == null) {
                    field1224[++Statics.field1234 - 1] = -1;
                    field1224[++Statics.field1234 - 1] = -1;
                    var202 = 1;
                } else {
                    int[] var223 = var222.method263(var221.field2700, var221.field2697, var221.field2698);
                    if (var223 == null) {
                        field1224[++Statics.field1234 - 1] = -1;
                        field1224[++Statics.field1234 - 1] = -1;
                    } else {
                        field1224[++Statics.field1234 - 1] = var223[0];
                        field1224[++Statics.field1234 - 1] = var223[1];
                    }
                    var202 = 1;
                }
            } else if (arg0 == 6618) {
                class224 var224 = new class224(field1224[--Statics.field1234]);
                class33 var225 = client.method89().method5260();
                if (var225 == null) {
                    field1224[++Statics.field1234 - 1] = -1;
                    field1224[++Statics.field1234 - 1] = -1;
                    var202 = 1;
                } else {
                    class224 var226 = var225.method264(var224.field2697, var224.field2698);
                    if (var226 == null) {
                        field1224[++Statics.field1234 - 1] = -1;
                    } else {
                        field1224[++Statics.field1234 - 1] = var226.method3877();
                    }
                    var202 = 1;
                }
            } else if (arg0 == 6619) {
                Statics.field1234 -= 2;
                int var227 = field1224[Statics.field1234];
                class224 var228 = new class224(field1224[Statics.field1234 + 1]);
                method5(var227, var228, false);
                var202 = 1;
            } else if (arg0 == 6620) {
                Statics.field1234 -= 2;
                int var229 = field1224[Statics.field1234];
                class224 var230 = new class224(field1224[Statics.field1234 + 1]);
                method5(var229, var230, true);
                var202 = 1;
            } else if (arg0 == 6621) {
                Statics.field1234 -= 2;
                int var231 = field1224[Statics.field1234];
                class224 var232 = new class224(field1224[Statics.field1234 + 1]);
                class33 var233 = client.method89().method5273(var231);
                if (var233 == null) {
                    field1224[++Statics.field1234 - 1] = 0;
                    var202 = 1;
                } else {
                    field1224[++Statics.field1234 - 1] = var233.method261(var232.field2700, var232.field2697, var232.field2698) ? 1 : 0;
                    var202 = 1;
                }
            } else if (arg0 == 6622) {
                field1224[++Statics.field1234 - 1] = client.method89().method5281();
                field1224[++Statics.field1234 - 1] = client.method89().method5274();
                var202 = 1;
            } else if (arg0 == 6623) {
                class224 var234 = new class224(field1224[--Statics.field1234]);
                class33 var235 = client.method89().method5423(var234.field2700, var234.field2697, var234.field2698);
                if (var235 == null) {
                    field1224[++Statics.field1234 - 1] = -1;
                } else {
                    field1224[++Statics.field1234 - 1] = var235.method266();
                }
                var202 = 1;
            } else if (arg0 == 6624) {
                client.method89().method5283(field1224[--Statics.field1234]);
                var202 = 1;
            } else if (arg0 == 6625) {
                client.method89().method5284();
                var202 = 1;
            } else if (arg0 == 6626) {
                client.method89().method5393(field1224[--Statics.field1234]);
                var202 = 1;
            } else if (arg0 == 6627) {
                client.method89().method5292();
                var202 = 1;
            } else if (arg0 == 6628) {
                boolean var236 = field1224[--Statics.field1234] == 1;
                client.method89().method5287(var236);
                var202 = 1;
            } else if (arg0 == 6629) {
                int var237 = field1224[--Statics.field1234];
                client.method89().method5288(var237);
                var202 = 1;
            } else if (arg0 == 6630) {
                int var238 = field1224[--Statics.field1234];
                client.method89().method5289(var238);
                var202 = 1;
            } else if (arg0 == 6631) {
                client.method89().method5290();
                var202 = 1;
            } else if (arg0 == 6632) {
                boolean var239 = field1224[--Statics.field1234] == 1;
                client.method89().method5366(var239);
                var202 = 1;
            } else if (arg0 == 6633) {
                Statics.field1234 -= 2;
                int var240 = field1224[Statics.field1234];
                boolean var241 = field1224[Statics.field1234 + 1] == 1;
                client.method89().method5294(var240, var241);
                var202 = 1;
            } else if (arg0 == 6634) {
                Statics.field1234 -= 2;
                int var242 = field1224[Statics.field1234];
                boolean var243 = field1224[Statics.field1234 + 1] == 1;
                client.method89().method5381(var242, var243);
                var202 = 1;
            } else if (arg0 == 6635) {
                field1224[++Statics.field1234 - 1] = client.method89().method5318() ? 1 : 0;
                var202 = 1;
            } else if (arg0 == 6636) {
                int var244 = field1224[--Statics.field1234];
                field1224[++Statics.field1234 - 1] = client.method89().method5295(var244) ? 1 : 0;
                var202 = 1;
            } else if (arg0 == 6637) {
                int var245 = field1224[--Statics.field1234];
                field1224[++Statics.field1234 - 1] = client.method89().method5296(var245) ? 1 : 0;
                var202 = 1;
            } else if (arg0 == 6638) {
                Statics.field1234 -= 2;
                int var246 = field1224[Statics.field1234];
                class224 var247 = new class224(field1224[Statics.field1234 + 1]);
                class224 var248 = client.method89().method5315(var246, var247);
                if (var248 == null) {
                    field1224[++Statics.field1234 - 1] = -1;
                } else {
                    field1224[++Statics.field1234 - 1] = var248.method3877();
                }
                var202 = 1;
            } else if (arg0 == 6639) {
                class40 var249 = client.method89().method5301();
                if (var249 == null) {
                    field1224[++Statics.field1234 - 1] = -1;
                    field1224[++Statics.field1234 - 1] = -1;
                } else {
                    field1224[++Statics.field1234 - 1] = var249.field496;
                    field1224[++Statics.field1234 - 1] = var249.field497.method3877();
                }
                var202 = 1;
            } else if (arg0 == 6640) {
                class40 var250 = client.method89().method5302();
                if (var250 == null) {
                    field1224[++Statics.field1234 - 1] = -1;
                    field1224[++Statics.field1234 - 1] = -1;
                } else {
                    field1224[++Statics.field1234 - 1] = var250.field496;
                    field1224[++Statics.field1234 - 1] = var250.field497.method3877();
                }
                var202 = 1;
            } else if (arg0 == 6693) {
                int var251 = field1224[--Statics.field1234];
                class254 var252 = Statics.field3354[var251];
                if (var252.field3360 == null) {
                    field1226[++Statics.field258 - 1] = "";
                } else {
                    field1226[++Statics.field258 - 1] = var252.field3360;
                }
                var202 = 1;
            } else if (arg0 == 6694) {
                int var253 = field1224[--Statics.field1234];
                class254 var254 = Statics.field3354[var253];
                field1224[++Statics.field1234 - 1] = var254.field3353;
                var202 = 1;
            } else if (arg0 == 6695) {
                int var255 = field1224[--Statics.field1234];
                class254 var256 = Statics.field3354[var255];
                if (var256 == null) {
                    field1224[++Statics.field1234 - 1] = -1;
                } else {
                    field1224[++Statics.field1234 - 1] = var256.field3374;
                }
                var202 = 1;
            } else if (arg0 == 6696) {
                int var257 = field1224[--Statics.field1234];
                class254 var258 = Statics.field3354[var257];
                if (var258 == null) {
                    field1224[++Statics.field1234 - 1] = -1;
                } else {
                    field1224[++Statics.field1234 - 1] = var258.field3358;
                }
                var202 = 1;
            } else if (arg0 == 6697) {
                field1224[++Statics.field1234 - 1] = Statics.field1993.field557;
                var202 = 1;
            } else if (arg0 == 6698) {
                field1224[++Statics.field1234 - 1] = Statics.field1993.field555.method3877();
                var202 = 1;
            } else if (arg0 == 6699) {
                field1224[++Statics.field1234 - 1] = Statics.field1993.field556.method3877();
                var202 = 1;
            } else {
                var202 = 2;
            }
            return var202;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bj.s(ILcd;ZB)I")
    public static int method1484(int arg0, class96 arg1, boolean arg2) {
        int var3 = -1;
        class228 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1224[--Statics.field1234];
            var4 = class228.method471(var3);
        } else {
            var4 = arg2 ? Statics.field332 : Statics.field298;
        }
        if (arg0 == 1000) {
            Statics.field1234 -= 4;
            var4.field2748 = field1224[Statics.field1234];
            var4.field2749 = field1224[Statics.field1234 + 1];
            var4.field2857 = field1224[Statics.field1234 + 2];
            var4.field2743 = field1224[Statics.field1234 + 3];
            client.method924(var4);
            Statics.field481.method1110(var4);
            if (var3 != -1 && var4.field2741 == 0) {
                client.method331(Statics.field3286[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1234 -= 4;
            var4.field2750 = field1224[Statics.field1234];
            var4.field2751 = field1224[Statics.field1234 + 1];
            var4.field2816 = field1224[Statics.field1234 + 2];
            var4.field2747 = field1224[Statics.field1234 + 3];
            client.method924(var4);
            Statics.field481.method1110(var4);
            if (var3 != -1 && var4.field2741 == 0) {
                client.method331(Statics.field3286[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1224[--Statics.field1234] == 1;
            if (var4.field2797 != var5) {
                var4.field2797 = var5;
                client.method924(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2829 = field1224[--Statics.field1234] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2867 = field1224[--Statics.field1234] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ie.j(ILcd;ZI)I")
    public static int method4259(int arg0, class96 arg1, boolean arg2) {
        int var3 = -1;
        class228 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1224[--Statics.field1234];
            var4 = class228.method471(var3);
        } else {
            var4 = arg2 ? Statics.field332 : Statics.field298;
        }
        if (arg0 == 1100) {
            Statics.field1234 -= 2;
            var4.field2760 = field1224[Statics.field1234];
            if (var4.field2760 > var4.field2862 - var4.field2754) {
                var4.field2760 = var4.field2862 - var4.field2754;
            }
            if (var4.field2760 < 0) {
                var4.field2760 = 0;
            }
            var4.field2778 = field1224[Statics.field1234 + 1];
            if (var4.field2778 > var4.field2763 - var4.field2764) {
                var4.field2778 = var4.field2763 - var4.field2764;
            }
            if (var4.field2778 < 0) {
                var4.field2778 = 0;
            }
            client.method924(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2830 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2859 = field1224[--Statics.field1234] == 1;
            client.method924(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2770 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2866 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2774 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2776 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2777 = field1224[--Statics.field1234] == 1;
            client.method924(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2755 = 1;
            var4.field2834 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1234 -= 6;
            var4.field2788 = field1224[Statics.field1234];
            var4.field2783 = field1224[Statics.field1234 + 1];
            var4.field2727 = field1224[Statics.field1234 + 2];
            var4.field2791 = field1224[Statics.field1234 + 3];
            var4.field2792 = field1224[Statics.field1234 + 4];
            var4.field2793 = field1224[Statics.field1234 + 5];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1224[--Statics.field1234];
            if (var4.field2786 != var5) {
                var4.field2786 = var5;
                var4.field2861 = 0;
                var4.field2872 = 0;
                client.method924(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2796 = field1224[--Statics.field1234] == 1;
            client.method924(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1226[--Statics.field258];
            if (!var6.equals(var4.field2823)) {
                var4.field2823 = var6;
                client.method924(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2798 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1234 -= 3;
            var4.field2802 = field1224[Statics.field1234];
            var4.field2789 = field1224[Statics.field1234 + 1];
            var4.field2801 = field1224[Statics.field1234 + 2];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2804 = field1224[--Statics.field1234] == 1;
            client.method924(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2731 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2779 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2780 = field1224[--Statics.field1234] == 1;
            client.method924(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2869 = field1224[--Statics.field1234] == 1;
            client.method924(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1234 -= 2;
            var4.field2862 = field1224[Statics.field1234];
            var4.field2763 = field1224[Statics.field1234 + 1];
            client.method924(var4);
            if (var3 != -1 && var4.field2741 == 0) {
                client.method331(Statics.field3286[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method1679(var4.field2739, var4.field2841);
            client.field972 = var4;
            client.method924(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2806 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2765 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2771 = field1224[--Statics.field1234];
            client.method924(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1224[--Statics.field1234];
            class308[] var8 = new class308[] { class308.field3864, class308.field3865, class308.field3866, class308.field3867, class308.field3870 };
            class308 var9 = (class308) class180.method4646(var8, var7);
            if (var9 != null) {
                var4.field2759 = var9;
                client.method924(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var10 = field1224[--Statics.field1234] == 1;
            var4.field2773 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.a(ILcd;ZI)I")
    public static int method467(int arg0, class96 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method471(field1224[--Statics.field1234]);
        } else {
            var3 = arg2 ? Statics.field332 : Statics.field298;
        }
        client.method924(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1234 -= 2;
            int var4 = field1224[Statics.field1234];
            int var5 = field1224[Statics.field1234 + 1];
            var3.field2848 = var4;
            var3.field2860 = var5;
            class268 var6 = class268.method1489(var4);
            var3.field2727 = var6.field3563;
            var3.field2791 = var6.field3570;
            var3.field2792 = var6.field3565;
            var3.field2788 = var6.field3567;
            var3.field2783 = var6.field3584;
            var3.field2793 = var6.field3562;
            if (arg0 == 1205) {
                var3.field2740 = 0;
            } else if (arg0 == 1212 | var6.field3568 == 1) {
                var3.field2740 = 1;
            } else {
                var3.field2740 = 2;
            }
            if (var3.field2725 > 0) {
                var3.field2793 = var3.field2793 * 32 / var3.field2725;
            } else if (var3.field2750 > 0) {
                var3.field2793 = var3.field2793 * 32 / var3.field2750;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2755 = 2;
            var3.field2834 = field1224[--Statics.field1234];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2755 = 3;
            var3.field2834 = Statics.field470.field788.method3897();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("et.t(ILcd;ZI)I")
    public static int method2800(int arg0, class96 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method471(field1224[--Statics.field1234]);
        } else {
            var3 = arg2 ? Statics.field332 : Statics.field298;
        }
        if (arg0 == 1300) {
            int var4 = field1224[--Statics.field1234] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3939(var4, field1226[--Statics.field258]);
                return 1;
            } else {
                Statics.field258--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1234 -= 2;
            int var5 = field1224[Statics.field1234];
            int var6 = field1224[Statics.field1234 + 1];
            var3.field2768 = class228.method256(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2817 = field1224[--Statics.field1234] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2815 = field1224[--Statics.field1234];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2803 = field1224[--Statics.field1234];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2812 = field1226[--Statics.field258];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2818 = field1226[--Statics.field258];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2828 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.r(ILcd;ZB)I")
    public static int method1882(int arg0, class96 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method471(field1224[--Statics.field1234]);
        } else {
            var3 = arg2 ? Statics.field332 : Statics.field298;
        }
        String var4 = field1226[--Statics.field258];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1224[--Statics.field1234];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1224[--Statics.field1234];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1226[--Statics.field258];
            } else {
                var7[var8] = Integer.valueOf(field1224[--Statics.field1234]);
            }
        }
        int var9 = field1224[--Statics.field1234];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2821 = var7;
        } else if (arg0 == 1401) {
            var3.field2824 = var7;
        } else if (arg0 == 1402) {
            var3.field2761 = var7;
        } else if (arg0 == 1403) {
            var3.field2870 = var7;
        } else if (arg0 == 1404) {
            var3.field2827 = var7;
        } else if (arg0 == 1405) {
            var3.field2833 = var7;
        } else if (arg0 == 1406) {
            var3.field2831 = var7;
        } else if (arg0 == 1407) {
            var3.field2832 = var7;
            var3.field2825 = var5;
        } else if (arg0 == 1408) {
            var3.field2838 = var7;
        } else if (arg0 == 1409) {
            var3.field2839 = var7;
        } else if (arg0 == 1410) {
            var3.field2850 = var7;
        } else if (arg0 == 1411) {
            var3.field2813 = var7;
        } else if (arg0 == 1412) {
            var3.field2826 = var7;
        } else if (arg0 == 1414) {
            var3.field2752 = var7;
            var3.field2790 = var5;
        } else if (arg0 == 1415) {
            var3.field2836 = var7;
            var3.field2837 = var5;
        } else if (arg0 == 1416) {
            var3.field2781 = var7;
        } else if (arg0 == 1417) {
            var3.field2840 = var7;
        } else if (arg0 == 1418) {
            var3.field2762 = var7;
        } else if (arg0 == 1419) {
            var3.field2842 = var7;
        } else if (arg0 == 1420) {
            var3.field2843 = var7;
        } else if (arg0 == 1421) {
            var3.field2844 = var7;
        } else if (arg0 == 1422) {
            var3.field2845 = var7;
        } else if (arg0 == 1423) {
            var3.field2822 = var7;
        } else if (arg0 == 1424) {
            var3.field2772 = var7;
        } else if (arg0 == 1425) {
            var3.field2849 = var7;
        } else if (arg0 == 1426) {
            var3.field2835 = var7;
        } else if (arg0 == 1427) {
            var3.field2745 = var7;
        } else {
            return 2;
        }
        var3.field2814 = true;
        return 1;
    }

    @ObfuscatedName("fe.m(ILcd;ZI)I")
    public static int method3045(int arg0, class96 arg1, boolean arg2) {
        class228 var3 = arg2 ? Statics.field332 : Statics.field298;
        if (arg0 == 1500) {
            field1224[++Statics.field1234 - 1] = var3.field2847;
            return 1;
        } else if (arg0 == 1501) {
            field1224[++Statics.field1234 - 1] = var3.field2753;
            return 1;
        } else if (arg0 == 1502) {
            field1224[++Statics.field1234 - 1] = var3.field2754;
            return 1;
        } else if (arg0 == 1503) {
            field1224[++Statics.field1234 - 1] = var3.field2764;
            return 1;
        } else if (arg0 == 1504) {
            field1224[++Statics.field1234 - 1] = var3.field2797 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1224[++Statics.field1234 - 1] = var3.field2758;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.h(ILcd;ZB)I")
    public static int method101(int arg0, class96 arg1, boolean arg2) {
        class228 var3 = arg2 ? Statics.field332 : Statics.field298;
        if (arg0 == 1600) {
            field1224[++Statics.field1234 - 1] = var3.field2760;
            return 1;
        } else if (arg0 == 1601) {
            field1224[++Statics.field1234 - 1] = var3.field2778;
            return 1;
        } else if (arg0 == 1602) {
            field1226[++Statics.field258 - 1] = var3.field2823;
            return 1;
        } else if (arg0 == 1603) {
            field1224[++Statics.field1234 - 1] = var3.field2862;
            return 1;
        } else if (arg0 == 1604) {
            field1224[++Statics.field1234 - 1] = var3.field2763;
            return 1;
        } else if (arg0 == 1605) {
            field1224[++Statics.field1234 - 1] = var3.field2793;
            return 1;
        } else if (arg0 == 1606) {
            field1224[++Statics.field1234 - 1] = var3.field2727;
            return 1;
        } else if (arg0 == 1607) {
            field1224[++Statics.field1234 - 1] = var3.field2792;
            return 1;
        } else if (arg0 == 1608) {
            field1224[++Statics.field1234 - 1] = var3.field2791;
            return 1;
        } else if (arg0 == 1609) {
            field1224[++Statics.field1234 - 1] = var3.field2770;
            return 1;
        } else if (arg0 == 1610) {
            field1224[++Statics.field1234 - 1] = var3.field2771;
            return 1;
        } else if (arg0 == 1611) {
            field1224[++Statics.field1234 - 1] = var3.field2830;
            return 1;
        } else if (arg0 == 1612) {
            field1224[++Statics.field1234 - 1] = var3.field2765;
            return 1;
        } else if (arg0 == 1613) {
            field1224[++Statics.field1234 - 1] = var3.field2759.method13();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ag.o(ILcd;ZI)I")
    public static int method493(int arg0, class96 arg1, boolean arg2) {
        class228 var3 = arg2 ? Statics.field332 : Statics.field298;
        if (arg0 == 1700) {
            field1224[++Statics.field1234 - 1] = var3.field2848;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2848 == -1) {
                field1224[++Statics.field1234 - 1] = 0;
            } else {
                field1224[++Statics.field1234 - 1] = var3.field2860;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1224[++Statics.field1234 - 1] = var3.field2841;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.x(ILcd;ZB)I")
    public static int method469(int arg0, class96 arg1, boolean arg2) {
        class228 var3 = class228.method471(field1224[--Statics.field1234]);
        if (arg0 == 2600) {
            field1224[++Statics.field1234 - 1] = var3.field2760;
            return 1;
        } else if (arg0 == 2601) {
            field1224[++Statics.field1234 - 1] = var3.field2778;
            return 1;
        } else if (arg0 == 2602) {
            field1226[++Statics.field258 - 1] = var3.field2823;
            return 1;
        } else if (arg0 == 2603) {
            field1224[++Statics.field1234 - 1] = var3.field2862;
            return 1;
        } else if (arg0 == 2604) {
            field1224[++Statics.field1234 - 1] = var3.field2763;
            return 1;
        } else if (arg0 == 2605) {
            field1224[++Statics.field1234 - 1] = var3.field2793;
            return 1;
        } else if (arg0 == 2606) {
            field1224[++Statics.field1234 - 1] = var3.field2727;
            return 1;
        } else if (arg0 == 2607) {
            field1224[++Statics.field1234 - 1] = var3.field2792;
            return 1;
        } else if (arg0 == 2608) {
            field1224[++Statics.field1234 - 1] = var3.field2791;
            return 1;
        } else if (arg0 == 2609) {
            field1224[++Statics.field1234 - 1] = var3.field2770;
            return 1;
        } else if (arg0 == 2610) {
            field1224[++Statics.field1234 - 1] = var3.field2771;
            return 1;
        } else if (arg0 == 2611) {
            field1224[++Statics.field1234 - 1] = var3.field2830;
            return 1;
        } else if (arg0 == 2612) {
            field1224[++Statics.field1234 - 1] = var3.field2765;
            return 1;
        } else if (arg0 == 2613) {
            field1224[++Statics.field1234 - 1] = var3.field2759.method13();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("e.q(ILcd;ZI)I")
    public static int method158(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1224[++Statics.field1234 - 1] = client.field832;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1234 -= 2;
            int var3 = field1224[Statics.field1234];
            int var4 = field1224[Statics.field1234 + 1];
            field1224[++Statics.field1234 - 1] = class65.method57(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1234 -= 2;
            int var5 = field1224[Statics.field1234];
            int var6 = field1224[Statics.field1234 + 1];
            int[] var7 = field1224;
            int var8 = ++Statics.field1234 - 1;
            class65 var9 = (class65) class65.field724.method3517((long) var5);
            int var10;
            if (var9 == null) {
                var10 = 0;
            } else if (var6 >= 0 && var6 < var9.field725.length) {
                var10 = var9.field725[var6];
            } else {
                var10 = 0;
            }
            var7[var8] = var10;
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1234 -= 2;
            int var11 = field1224[Statics.field1234];
            int var12 = field1224[Statics.field1234 + 1];
            field1224[++Statics.field1234 - 1] = class65.method900(var11, var12);
            return 1;
        } else if (arg0 == 3304) {
            int var13 = field1224[--Statics.field1234];
            int[] var14 = field1224;
            int var15 = ++Statics.field1234 - 1;
            class252 var16 = (class252) class252.field3346.method3504((long) var13);
            class252 var17;
            if (var16 == null) {
                byte[] var18 = Statics.field3345.method4032(5, var13);
                class252 var19 = new class252();
                if (var18 != null) {
                    var19.method4179(new class185(var18));
                }
                class252.field3346.method3506(var19, (long) var13);
                var17 = var19;
            } else {
                var17 = var16;
            }
            var14[var15] = var17.field3344;
            return 1;
        } else if (arg0 == 3305) {
            int var20 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = client.field941[var20];
            return 1;
        } else if (arg0 == 3306) {
            int var21 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = client.field942[var21];
            return 1;
        } else if (arg0 == 3307) {
            int var22 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = client.field943[var22];
            return 1;
        } else if (arg0 == 3308) {
            int var23 = Statics.field780;
            int var24 = (Statics.field470.field1152 >> 7) + Statics.field407;
            int var25 = (Statics.field470.field1117 >> 7) + Statics.field1272;
            field1224[++Statics.field1234 - 1] = (var23 << 28) + (var24 << 14) + var25;
            return 1;
        } else if (arg0 == 3309) {
            int var26 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = var26 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var27 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = var27 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var28 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = var28 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1224[++Statics.field1234 - 1] = client.field902 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1234 -= 2;
            int var29 = field1224[Statics.field1234] + 32768;
            int var30 = field1224[Statics.field1234 + 1];
            field1224[++Statics.field1234 - 1] = class65.method57(var29, var30);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1234 -= 2;
            int var31 = field1224[Statics.field1234] + 32768;
            int var32 = field1224[Statics.field1234 + 1];
            int[] var33 = field1224;
            int var34 = ++Statics.field1234 - 1;
            class65 var35 = (class65) class65.field724.method3517((long) var31);
            int var36;
            if (var35 == null) {
                var36 = 0;
            } else if (var32 >= 0 && var32 < var35.field725.length) {
                var36 = var35.field725[var32];
            } else {
                var36 = 0;
            }
            var33[var34] = var36;
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1234 -= 2;
            int var37 = field1224[Statics.field1234] + 32768;
            int var38 = field1224[Statics.field1234 + 1];
            field1224[++Statics.field1234 - 1] = class65.method900(var37, var38);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field957 >= 2) {
                field1224[++Statics.field1234 - 1] = client.field957;
            } else {
                field1224[++Statics.field1234 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1224[++Statics.field1234 - 1] = client.field905;
            return 1;
        } else if (arg0 == 3318) {
            field1224[++Statics.field1234 - 1] = client.field996;
            return 1;
        } else if (arg0 == 3321) {
            field1224[++Statics.field1234 - 1] = client.field973;
            return 1;
        } else if (arg0 == 3322) {
            field1224[++Statics.field1234 - 1] = client.field974;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field977) {
                field1224[++Statics.field1234 - 1] = 1;
            } else {
                field1224[++Statics.field1234 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1224[++Statics.field1234 - 1] = client.field824;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1234 -= 4;
            int var39 = field1224[Statics.field1234];
            int var40 = field1224[Statics.field1234 + 1];
            int var41 = field1224[Statics.field1234 + 2];
            int var42 = field1224[Statics.field1234 + 3];
            int var43 = (var40 << 14) + var39;
            int var44 = (var41 << 28) + var43;
            int var45 = var42 + var44;
            field1224[++Statics.field1234 - 1] = var45;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ca.d(ILcd;ZB)I")
    public static int method1712(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1234 -= 2;
            int var3 = field1224[Statics.field1234];
            int var4 = field1224[Statics.field1234 + 1];
            class265 var5 = class265.method1861(var3);
            if (var5.field3462 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3466; var6++) {
                if (var5.field3464[var6] == var4) {
                    field1226[++Statics.field258 - 1] = var5.field3468[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1226[++Statics.field258 - 1] = var5.field3465;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1234 -= 4;
            int var7 = field1224[Statics.field1234];
            int var8 = field1224[Statics.field1234 + 1];
            int var9 = field1224[Statics.field1234 + 2];
            int var10 = field1224[Statics.field1234 + 3];
            class265 var11 = class265.method1861(var9);
            if (var11.field3461 != var7 || var11.field3462 != var8) {
                if (var8 == 115) {
                    field1226[++Statics.field258 - 1] = "null";
                } else {
                    field1224[++Statics.field1234 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3466; var12++) {
                if (var11.field3464[var12] == var10) {
                    if (var8 == 115) {
                        field1226[++Statics.field258 - 1] = var11.field3468[var12];
                    } else {
                        field1224[++Statics.field1234 - 1] = var11.field3463[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1226[++Statics.field258 - 1] = var11.field3465;
                } else {
                    field1224[++Statics.field1234 - 1] = var11.field3459;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1224[--Statics.field1234];
            class265 var14 = class265.method1861(var13);
            field1224[++Statics.field1234 - 1] = var14.method4378();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.l(ILcd;ZB)I")
    public static int method172(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field2282.field1196 == 0) {
                field1224[++Statics.field1234 - 1] = -2;
            } else if (Statics.field2282.field1196 == 1) {
                field1224[++Statics.field1234 - 1] = -1;
            } else {
                field1224[++Statics.field1234 - 1] = Statics.field2282.field1192.method4682();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1224[--Statics.field1234];
            if (Statics.field2282.method1548() && var3 >= 0 && var3 < Statics.field2282.field1192.method4682()) {
                class282 var4 = (class282) Statics.field2282.field1192.method4699(var3);
                field1226[++Statics.field258 - 1] = var4.method4658();
                field1226[++Statics.field258 - 1] = var4.method4649();
            } else {
                field1226[++Statics.field258 - 1] = "";
                field1226[++Statics.field258 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1224[--Statics.field1234];
            if (Statics.field2282.method1548() && var5 >= 0 && var5 < Statics.field2282.field1192.method4682()) {
                field1224[++Statics.field1234 - 1] = ((class282) Statics.field2282.field1192.method4699(var5)).field3706;
            } else {
                field1224[++Statics.field1234 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1224[--Statics.field1234];
            if (Statics.field2282.method1548() && var6 >= 0 && var6 < Statics.field2282.field1192.method4682()) {
                field1224[++Statics.field1234 - 1] = ((class282) Statics.field2282.field1192.method4699(var6)).field3708;
            } else {
                field1224[++Statics.field1234 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1226[--Statics.field258];
            int var8 = field1224[--Statics.field1234];
            class175 var9 = class175.method470(class172.field2359, client.field868.field1440);
            var9.field2403.method3107(class185.method1722(var7) + 1);
            var9.field2403.method3148(var8);
            var9.field2403.method3189(var7);
            client.field868.method1879(var9);
            return 1;
        } else if (arg0 == 3605) {
            String var10 = field1226[--Statics.field258];
            Statics.field2282.method1591(var10);
            return 1;
        } else if (arg0 == 3606) {
            String var11 = field1226[--Statics.field258];
            Statics.field2282.method1559(var11);
            return 1;
        } else if (arg0 == 3607) {
            String var12 = field1226[--Statics.field258];
            Statics.field2282.method1557(var12);
            return 1;
        } else if (arg0 == 3608) {
            String var13 = field1226[--Statics.field258];
            Statics.field2282.method1597(var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field1226[--Statics.field258];
            String var15 = client.method330(var14);
            field1224[++Statics.field1234 - 1] = Statics.field2282.method1599(new class281(var15, Statics.field459), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field2926 == null) {
                field1226[++Statics.field258 - 1] = "";
            } else {
                field1226[++Statics.field258 - 1] = Statics.field2926.field3714;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field2926 == null) {
                field1224[++Statics.field1234 - 1] = 0;
            } else {
                field1224[++Statics.field1234 - 1] = Statics.field2926.method4682();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field1224[--Statics.field1234];
            if (Statics.field2926 == null || var16 >= Statics.field2926.method4682()) {
                field1226[++Statics.field258 - 1] = "";
            } else {
                field1226[++Statics.field258 - 1] = Statics.field2926.method4699(var16).method4648().method4758();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field1224[--Statics.field1234];
            if (Statics.field2926 == null || var17 >= Statics.field2926.method4682()) {
                field1224[++Statics.field1234 - 1] = 0;
            } else {
                field1224[++Statics.field1234 - 1] = ((class273) Statics.field2926.method4699(var17)).field3674;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field1224[--Statics.field1234];
            if (Statics.field2926 == null || var18 >= Statics.field2926.method4682()) {
                field1224[++Statics.field1234 - 1] = 0;
            } else {
                field1224[++Statics.field1234 - 1] = ((class273) Statics.field2926.method4699(var18)).field3675;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1224[++Statics.field1234 - 1] = Statics.field2926 == null ? 0 : Statics.field2926.field3712;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field1226[--Statics.field258];
            client.method1783(var19);
            return 1;
        } else if (arg0 == 3618) {
            field1224[++Statics.field1234 - 1] = Statics.field2926 == null ? 0 : Statics.field2926.field3715;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field1226[--Statics.field258];
            if (!var20.equals("")) {
                class175 var21 = class175.method470(class172.field2371, client.field868.field1440);
                var21.field2403.method3107(class185.method1722(var20));
                var21.field2403.method3189(var20);
                client.field868.method1879(var21);
            }
            return 1;
        } else if (arg0 == 3620) {
            class175 var22 = class175.method470(class172.field2371, client.field868.field1440);
            var22.field2403.method3107(0);
            client.field868.method1879(var22);
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field2282.method1548()) {
                field1224[++Statics.field1234 - 1] = Statics.field2282.field1197.method4682();
            } else {
                field1224[++Statics.field1234 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var23 = field1224[--Statics.field1234];
            if (Statics.field2282.method1548() && var23 >= 0 && var23 < Statics.field2282.field1197.method4682()) {
                class277 var24 = (class277) Statics.field2282.field1197.method4699(var23);
                field1226[++Statics.field258 - 1] = var24.method4658();
                field1226[++Statics.field258 - 1] = var24.method4649();
            } else {
                field1226[++Statics.field258 - 1] = "";
                field1226[++Statics.field258 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var25 = field1226[--Statics.field258];
            String var26 = client.method330(var25);
            field1224[++Statics.field1234 - 1] = Statics.field2282.method1554(new class281(var26, Statics.field459)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var27 = field1224[--Statics.field1234];
            if (Statics.field2926 == null || var27 >= Statics.field2926.method4682() || !Statics.field2926.method4699(var27).method4648().equals(Statics.field470.field787)) {
                field1224[++Statics.field1234 - 1] = 0;
            } else {
                field1224[++Statics.field1234 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field2926 == null || Statics.field2926.field3709 == null) {
                field1226[++Statics.field258 - 1] = "";
            } else {
                field1226[++Statics.field258 - 1] = Statics.field2926.field3709;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var28 = field1224[--Statics.field1234];
            if (Statics.field2926 == null || var28 >= Statics.field2926.method4682() || !((class273) Statics.field2926.method4699(var28)).method4643()) {
                field1224[++Statics.field1234 - 1] = 0;
            } else {
                field1224[++Statics.field1234 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var29 = field1224[--Statics.field1234];
            if (Statics.field2926 == null || var29 >= Statics.field2926.method4682() || !((class273) Statics.field2926.method4699(var29)).method4637()) {
                field1224[++Statics.field1234 - 1] = 0;
            } else {
                field1224[++Statics.field1234 - 1] = 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gl.f(ILcd;ZI)I")
    public static int method3344(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = client.field1019[var3].method106();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = client.field1019[var4].field287;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = client.field1019[var5].field288;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = client.field1019[var6].field292;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = client.field1019[var7].field290;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = client.field1019[var8].field286;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1224[--Statics.field1234];
            int var10 = client.field1019[var9].method105();
            field1224[++Statics.field1234 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1224[--Statics.field1234];
            int var12 = client.field1019[var11].method105();
            field1224[++Statics.field1234 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1224[--Statics.field1234];
            int var14 = client.field1019[var13].method105();
            field1224[++Statics.field1234 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1224[--Statics.field1234];
            int var16 = client.field1019[var15].method105();
            field1224[++Statics.field1234 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1224[--Statics.field1234] == 1;
            if (Statics.field1398 != null) {
                Statics.field1398.method79(class14.field268, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1224[--Statics.field1234] == 1;
            if (Statics.field1398 != null) {
                Statics.field1398.method79(class14.field267, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1234 -= 2;
            boolean var19 = field1224[Statics.field1234] == 1;
            boolean var20 = field1224[Statics.field1234 + 1] == 1;
            if (Statics.field1398 != null) {
                client.field842.field821 = var20;
                Statics.field1398.method79(client.field842, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1224[--Statics.field1234] == 1;
            if (Statics.field1398 != null) {
                Statics.field1398.method79(class14.field272, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1224[--Statics.field1234] == 1;
            if (Statics.field1398 != null) {
                Statics.field1398.method79(class14.field269, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1224[++Statics.field1234 - 1] = Statics.field1398 == null ? 0 : Statics.field1398.field271.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1224[--Statics.field1234];
            class15 var24 = (class15) Statics.field1398.field271.get(var23);
            field1224[++Statics.field1234 - 1] = var24.field274;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1224[--Statics.field1234];
            class15 var26 = (class15) Statics.field1398.field271.get(var25);
            field1226[++Statics.field258 - 1] = var26.method84();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1224[--Statics.field1234];
            class15 var28 = (class15) Statics.field1398.field271.get(var27);
            field1226[++Statics.field258 - 1] = var28.method83();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1224[--Statics.field1234];
            class15 var30 = (class15) Statics.field1398.field271.get(var29);
            long var31 = class187.method35() - Statics.field474 - var30.field276;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1226[++Statics.field258 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1224[--Statics.field1234];
            class15 var38 = (class15) Statics.field1398.field271.get(var37);
            field1224[++Statics.field1234 - 1] = var38.field275.field292;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1224[--Statics.field1234];
            class15 var40 = (class15) Statics.field1398.field271.get(var39);
            field1224[++Statics.field1234 - 1] = var40.field275.field288;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1224[--Statics.field1234];
            class15 var42 = (class15) Statics.field1398.field271.get(var41);
            field1224[++Statics.field1234 - 1] = var42.field275.field287;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("a.e(ILcd;ZB)I")
    public static int method20(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1224[++Statics.field1234 - 1] = client.field1024;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1234 -= 3;
            client.field1024 = field1224[Statics.field1234];
            Statics.field416 = class302.method3006(field1224[Statics.field1234 + 1]);
            if (Statics.field416 == null) {
                Statics.field416 = class302.field3833;
            }
            client.field976 = field1224[Statics.field1234 + 2];
            class175 var3 = class175.method470(class172.field2295, client.field868.field1440);
            var3.field2403.method3107(client.field1024);
            var3.field2403.method3107(Statics.field416.field3830);
            var3.field2403.method3107(client.field976);
            client.field868.method1879(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1226[--Statics.field258];
            Statics.field1234 -= 2;
            int var5 = field1224[Statics.field1234];
            int var6 = field1224[Statics.field1234 + 1];
            class175 var7 = class175.method470(class172.field2302, client.field868.field1440);
            var7.field2403.method3107(class185.method1722(var4) + 2);
            var7.field2403.method3189(var4);
            var7.field2403.method3107(var5 - 1);
            var7.field2403.method3107(var6);
            client.field868.method1879(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1234 -= 2;
            int var8 = field1224[Statics.field1234];
            int var9 = field1224[Statics.field1234 + 1];
            class98 var10 = (class98) class95.field1407.get(var8);
            class70 var11 = var10.method1870(var9);
            if (var11 == null) {
                field1224[++Statics.field1234 - 1] = -1;
                field1224[++Statics.field1234 - 1] = 0;
                field1226[++Statics.field258 - 1] = "";
                field1226[++Statics.field258 - 1] = "";
                field1226[++Statics.field258 - 1] = "";
                field1224[++Statics.field1234 - 1] = 0;
            } else {
                field1224[++Statics.field1234 - 1] = var11.field775;
                field1224[++Statics.field1234 - 1] = var11.field772;
                field1226[++Statics.field258 - 1] = var11.field774 == null ? "" : var11.field774;
                field1226[++Statics.field258 - 1] = var11.field771 == null ? "" : var11.field771;
                field1226[++Statics.field258 - 1] = var11.field779 == null ? "" : var11.field779;
                field1224[++Statics.field1234 - 1] = var11.method1000() ? 1 : (var11.method1025() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var13 = field1224[--Statics.field1234];
            class70 var14 = (class70) class95.field1401.method3472((long) var13);
            if (var14 == null) {
                field1224[++Statics.field1234 - 1] = -1;
                field1224[++Statics.field1234 - 1] = 0;
                field1226[++Statics.field258 - 1] = "";
                field1226[++Statics.field258 - 1] = "";
                field1226[++Statics.field258 - 1] = "";
                field1224[++Statics.field1234 - 1] = 0;
            } else {
                field1224[++Statics.field1234 - 1] = var14.field773;
                field1224[++Statics.field1234 - 1] = var14.field772;
                field1226[++Statics.field258 - 1] = var14.field774 == null ? "" : var14.field774;
                field1226[++Statics.field258 - 1] = var14.field771 == null ? "" : var14.field771;
                field1226[++Statics.field258 - 1] = var14.field779 == null ? "" : var14.field779;
                field1224[++Statics.field1234 - 1] = var14.method1000() ? 1 : (var14.method1025() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field416 == null) {
                field1224[++Statics.field1234 - 1] = -1;
            } else {
                field1224[++Statics.field1234 - 1] = Statics.field416.field3830;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var16 = field1226[--Statics.field258];
            int var17 = field1224[--Statics.field1234];
            String var18 = var16.toLowerCase();
            byte var19 = 0;
            if (var18.startsWith(class237.field3110)) {
                var19 = 0;
                var16 = var16.substring(class237.field3110.length());
            } else if (var18.startsWith(class237.field3112)) {
                var19 = 1;
                var16 = var16.substring(class237.field3112.length());
            } else if (var18.startsWith(class237.field3084)) {
                var19 = 2;
                var16 = var16.substring(class237.field3084.length());
            } else if (var18.startsWith(class237.field3116)) {
                var19 = 3;
                var16 = var16.substring(class237.field3116.length());
            } else if (var18.startsWith(class237.field3118)) {
                var19 = 4;
                var16 = var16.substring(class237.field3118.length());
            } else if (var18.startsWith(class237.field3120)) {
                var19 = 5;
                var16 = var16.substring(class237.field3120.length());
            } else if (var18.startsWith(class237.field3122)) {
                var19 = 6;
                var16 = var16.substring(class237.field3122.length());
            } else if (var18.startsWith(class237.field3124)) {
                var19 = 7;
                var16 = var16.substring(class237.field3124.length());
            } else if (var18.startsWith(class237.field3126)) {
                var19 = 8;
                var16 = var16.substring(class237.field3126.length());
            } else if (var18.startsWith(class237.field3025)) {
                var19 = 9;
                var16 = var16.substring(class237.field3025.length());
            } else if (var18.startsWith(class237.field3130)) {
                var19 = 10;
                var16 = var16.substring(class237.field3130.length());
            } else if (var18.startsWith(class237.field3132)) {
                var19 = 11;
                var16 = var16.substring(class237.field3132.length());
            } else if (client.field828 != 0) {
                if (var18.startsWith(class237.field2960)) {
                    var19 = 0;
                    var16 = var16.substring(class237.field2960.length());
                } else if (var18.startsWith(class237.field2955)) {
                    var19 = 1;
                    var16 = var16.substring(class237.field2955.length());
                } else if (var18.startsWith(class237.field3030)) {
                    var19 = 2;
                    var16 = var16.substring(class237.field3030.length());
                } else if (var18.startsWith(class237.field2986)) {
                    var19 = 3;
                    var16 = var16.substring(class237.field2986.length());
                } else if (var18.startsWith(class237.field3119)) {
                    var19 = 4;
                    var16 = var16.substring(class237.field3119.length());
                } else if (var18.startsWith(class237.field3121)) {
                    var19 = 5;
                    var16 = var16.substring(class237.field3121.length());
                } else if (var18.startsWith(class237.field2998)) {
                    var19 = 6;
                    var16 = var16.substring(class237.field2998.length());
                } else if (var18.startsWith(class237.field3008)) {
                    var19 = 7;
                    var16 = var16.substring(class237.field3008.length());
                } else if (var18.startsWith(class237.field3114)) {
                    var19 = 8;
                    var16 = var16.substring(class237.field3114.length());
                } else if (var18.startsWith(class237.field2959)) {
                    var19 = 9;
                    var16 = var16.substring(class237.field2959.length());
                } else if (var18.startsWith(class237.field3131)) {
                    var19 = 10;
                    var16 = var16.substring(class237.field3131.length());
                } else if (var18.startsWith(class237.field3133)) {
                    var19 = 11;
                    var16 = var16.substring(class237.field3133.length());
                }
            }
            String var20 = var16.toLowerCase();
            byte var21 = 0;
            if (var20.startsWith(class237.field3134)) {
                var21 = 1;
                var16 = var16.substring(class237.field3134.length());
            } else if (var20.startsWith(class237.field2953)) {
                var21 = 2;
                var16 = var16.substring(class237.field2953.length());
            } else if (var20.startsWith(class237.field3138)) {
                var21 = 3;
                var16 = var16.substring(class237.field3138.length());
            } else if (var20.startsWith(class237.field3140)) {
                var21 = 4;
                var16 = var16.substring(class237.field3140.length());
            } else if (var20.startsWith(class237.field3142)) {
                var21 = 5;
                var16 = var16.substring(class237.field3142.length());
            } else if (client.field828 != 0) {
                if (var20.startsWith(class237.field3135)) {
                    var21 = 1;
                    var16 = var16.substring(class237.field3135.length());
                } else if (var20.startsWith(class237.field2934)) {
                    var21 = 2;
                    var16 = var16.substring(class237.field2934.length());
                } else if (var20.startsWith(class237.field3208)) {
                    var21 = 3;
                    var16 = var16.substring(class237.field3208.length());
                } else if (var20.startsWith(class237.field2964)) {
                    var21 = 4;
                    var16 = var16.substring(class237.field2964.length());
                } else if (var20.startsWith(class237.field3217)) {
                    var21 = 5;
                    var16 = var16.substring(class237.field3217.length());
                }
            }
            class175 var22 = class175.method470(class172.field2300, client.field868.field1440);
            var22.field2403.method3107(0);
            int var23 = var22.field2403.field2488;
            var22.field2403.method3107(var17);
            var22.field2403.method3107(var19);
            var22.field2403.method3107(var21);
            class191 var24 = var22.field2403;
            int var25 = var24.field2488;
            byte[] var26 = class290.method2827(var16);
            var24.method3130(var26.length);
            var24.field2488 += Statics.field3762.method3054(var26, 0, var26.length, var24.field2491, var24.field2488);
            var22.field2403.method3120(var22.field2403.field2488 - var23);
            client.field868.method1879(var22);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field258 -= 2;
            String var27 = field1226[Statics.field258];
            String var28 = field1226[Statics.field258 + 1];
            class175 var29 = class175.method470(class172.field2342, client.field868.field1440);
            var29.field2403.method3250(0);
            int var30 = var29.field2403.field2488;
            var29.field2403.method3189(var27);
            class191 var31 = var29.field2403;
            int var32 = var31.field2488;
            byte[] var33 = class290.method2827(var28);
            var31.method3130(var33.length);
            var31.field2488 += Statics.field3762.method3054(var33, 0, var33.length, var31.field2491, var31.field2488);
            var29.field2403.method3210(var29.field2403.field2488 - var30);
            client.field868.method1879(var29);
            return 1;
        } else if (arg0 == 5015) {
            String var34;
            if (Statics.field470 == null || Statics.field470.field787 == null) {
                var34 = "";
            } else {
                var34 = Statics.field470.field787.method4758();
            }
            field1226[++Statics.field258 - 1] = var34;
            return 1;
        } else if (arg0 == 5016) {
            field1224[++Statics.field1234 - 1] = client.field976;
            return 1;
        } else if (arg0 == 5017) {
            int var35 = field1224[--Statics.field1234];
            int[] var36 = field1224;
            int var37 = ++Statics.field1234 - 1;
            class98 var38 = (class98) class95.field1407.get(var35);
            int var39;
            if (var38 == null) {
                var39 = 0;
            } else {
                var39 = var38.method1866();
            }
            var36[var37] = var39;
            return 1;
        } else if (arg0 == 5018) {
            int var40 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = class95.method1617(var40);
            return 1;
        } else if (arg0 == 5019) {
            int var41 = field1224[--Statics.field1234];
            field1224[++Statics.field1234 - 1] = class95.method3773(var41);
            return 1;
        } else if (arg0 == 5020) {
            String var42 = field1226[--Statics.field258];
            if (var42.equalsIgnoreCase("toggleroof")) {
                Statics.field2688.field1184 = !Statics.field2688.field1184;
                class78.method1030();
                if (Statics.field2688.field1184) {
                    Statics.method4020(99, "", "Roofs are now all hidden");
                } else {
                    Statics.method4020(99, "", "Roofs will only be removed selectively");
                }
            }
            if (var42.equalsIgnoreCase("displayfps")) {
                client.field997 = !client.field997;
            }
            if (client.field957 >= 2) {
                if (var42.equalsIgnoreCase("aabb")) {
                    if (!class8.field227) {
                        class8.field227 = true;
                        class8.field223 = class12.field256;
                    } else if (class8.field223 == class12.field256) {
                        class8.field227 = true;
                        class8.field223 = class12.field252;
                    } else {
                        class8.field227 = false;
                    }
                }
                if (var42.equalsIgnoreCase("fpson")) {
                    client.field997 = true;
                }
                if (var42.equalsIgnoreCase("fpsoff")) {
                    client.field997 = false;
                }
                if (var42.equalsIgnoreCase("gc")) {
                    System.gc();
                }
                if (var42.equalsIgnoreCase("clientdrop")) {
                    client.method130();
                }
                if (var42.equalsIgnoreCase("cs")) {
                    Statics.method4020(99, "", "" + client.field871);
                }
                if (var42.equalsIgnoreCase("errortest") && client.field958 == 2) {
                    throw new RuntimeException();
                }
            }
            class175 var43 = class175.method470(class172.field2351, client.field868.field1440);
            var43.field2403.method3107(var42.length() + 1);
            var43.field2403.method3189(var42);
            client.field868.method1879(var43);
            return 1;
        } else if (arg0 == 5021) {
            client.field858 = field1226[--Statics.field258].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1226[++Statics.field258 - 1] = client.field858;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ht.u(ILcd;ZI)I")
    public static int method4005(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1224[++Statics.field1234 - 1] = class77.method1769() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class77.field1177 = 0;
            class77 var3 = class77.method891();
            if (var3 == null) {
                field1224[++Statics.field1234 - 1] = -1;
                field1224[++Statics.field1234 - 1] = 0;
                field1226[++Statics.field258 - 1] = "";
                field1224[++Statics.field1234 - 1] = 0;
                field1224[++Statics.field1234 - 1] = 0;
                field1226[++Statics.field258 - 1] = "";
            } else {
                field1224[++Statics.field1234 - 1] = var3.field1175;
                field1224[++Statics.field1234 - 1] = var3.field1173;
                field1226[++Statics.field258 - 1] = var3.field1176;
                field1224[++Statics.field1234 - 1] = var3.field1180;
                field1224[++Statics.field1234 - 1] = var3.field1178;
                field1226[++Statics.field258 - 1] = var3.field1179;
            }
            return 1;
        } else if (arg0 == 6502) {
            class77 var5 = class77.method891();
            if (var5 == null) {
                field1224[++Statics.field1234 - 1] = -1;
                field1224[++Statics.field1234 - 1] = 0;
                field1226[++Statics.field258 - 1] = "";
                field1224[++Statics.field1234 - 1] = 0;
                field1224[++Statics.field1234 - 1] = 0;
                field1226[++Statics.field258 - 1] = "";
            } else {
                field1224[++Statics.field1234 - 1] = var5.field1175;
                field1224[++Statics.field1234 - 1] = var5.field1173;
                field1226[++Statics.field258 - 1] = var5.field1176;
                field1224[++Statics.field1234 - 1] = var5.field1180;
                field1224[++Statics.field1234 - 1] = var5.field1178;
                field1226[++Statics.field258 - 1] = var5.field1179;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var6 = field1224[--Statics.field1234];
            class77 var7 = null;
            for (int var8 = 0; var8 < class77.field1171; var8++) {
                if (Statics.field1322[var8].field1175 == var6) {
                    var7 = Statics.field1322[var8];
                    break;
                }
            }
            if (var7 == null) {
                field1224[++Statics.field1234 - 1] = -1;
                field1224[++Statics.field1234 - 1] = 0;
                field1226[++Statics.field258 - 1] = "";
                field1224[++Statics.field1234 - 1] = 0;
                field1224[++Statics.field1234 - 1] = 0;
                field1226[++Statics.field258 - 1] = "";
            } else {
                field1224[++Statics.field1234 - 1] = var7.field1175;
                field1224[++Statics.field1234 - 1] = var7.field1173;
                field1226[++Statics.field258 - 1] = var7.field1176;
                field1224[++Statics.field1234 - 1] = var7.field1180;
                field1224[++Statics.field1234 - 1] = var7.field1178;
                field1226[++Statics.field258 - 1] = var7.field1179;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1234 -= 4;
            int var9 = field1224[Statics.field1234];
            boolean var10 = field1224[Statics.field1234 + 1] == 1;
            int var11 = field1224[Statics.field1234 + 2];
            boolean var12 = field1224[Statics.field1234 + 3] == 1;
            if (Statics.field1322 != null) {
                class77.method2799(0, Statics.field1322.length - 1, var9, var10, var11, var12);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var13 = field1224[--Statics.field1234];
            if (var13 >= 0 && var13 < class77.field1171) {
                class77 var14 = Statics.field1322[var13];
                field1224[++Statics.field1234 - 1] = var14.field1175;
                field1224[++Statics.field1234 - 1] = var14.field1173;
                field1226[++Statics.field258 - 1] = var14.field1176;
                field1224[++Statics.field1234 - 1] = var14.field1180;
                field1224[++Statics.field1234 - 1] = var14.field1178;
                field1226[++Statics.field258 - 1] = var14.field1179;
            } else {
                field1224[++Statics.field1234 - 1] = -1;
                field1224[++Statics.field1234 - 1] = 0;
                field1226[++Statics.field258 - 1] = "";
                field1224[++Statics.field1234 - 1] = 0;
                field1224[++Statics.field1234 - 1] = 0;
                field1226[++Statics.field258 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field954 = field1224[--Statics.field1234] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1234 -= 2;
            int var15 = field1224[Statics.field1234];
            int var16 = field1224[Statics.field1234 + 1];
            class263 var17 = class263.method2891(var16);
            if (var17.method4342()) {
                field1226[++Statics.field258 - 1] = class270.method4001(var15).method4562(var16, var17.field3450);
            } else {
                field1224[++Statics.field1234 - 1] = class270.method4001(var15).method4552(var16, var17.field3452);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1234 -= 2;
            int var18 = field1224[Statics.field1234];
            int var19 = field1224[Statics.field1234 + 1];
            class263 var20 = class263.method2891(var19);
            if (var20.method4342()) {
                field1226[++Statics.field258 - 1] = class267.method2363(var18).method4440(var19, var20.field3450);
            } else {
                field1224[++Statics.field1234 - 1] = class267.method2363(var18).method4439(var19, var20.field3452);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1234 -= 2;
            int var21 = field1224[Statics.field1234];
            int var22 = field1224[Statics.field1234 + 1];
            class263 var23 = class263.method2891(var22);
            if (var23.method4342()) {
                field1226[++Statics.field258 - 1] = class268.method1489(var21).method4525(var22, var23.field3450);
            } else {
                field1224[++Statics.field1234 - 1] = class268.method1489(var21).method4477(var22, var23.field3452);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1234 -= 2;
            int var24 = field1224[Statics.field1234];
            int var25 = field1224[Statics.field1234 + 1];
            class263 var26 = class263.method2891(var25);
            if (var26.method4342()) {
                String[] var27 = field1226;
                int var28 = ++Statics.field258 - 1;
                class264 var29 = (class264) class264.field3454.method3504((long) var24);
                class264 var30;
                if (var29 == null) {
                    byte[] var31 = Statics.field3456.method4032(34, var24);
                    class264 var32 = new class264();
                    if (var31 != null) {
                        var32.method4359(new class185(var31));
                    }
                    var32.method4363();
                    class264.field3454.method3506(var32, (long) var24);
                    var30 = var32;
                } else {
                    var30 = var29;
                }
                var27[var28] = var30.method4362(var25, var26.field3450);
            } else {
                field1224[++Statics.field1234 - 1] = class264.method2545(var24).method4361(var25, var26.field3452);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1224[++Statics.field1234 - 1] = 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fm.z(IB)V")
    public static void method3095(int arg0) {
        if (arg0 == -1 || !class228.method3651(arg0)) {
            return;
        }
        class228[] var1 = Statics.field3286[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class228 var3 = var1[var2];
            if (var3.field2820 != null) {
                class68 var4 = new class68();
                var4.field750 = var3;
                var4.field748 = var3.field2820;
                method3653(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("w.b(ILhn;ZI)V")
    public static void method5(int arg0, class224 arg1, boolean arg2) {
        class33 var3 = client.method89().method5273(arg0);
        int var4 = Statics.field470.field809;
        int var5 = (Statics.field470.field1152 >> 7) + Statics.field407;
        int var6 = (Statics.field470.field1117 >> 7) + Statics.field1272;
        class224 var7 = new class224(var4, var5, var6);
        client.method89().method5247(var3, var7, arg1, arg2);
    }
}
