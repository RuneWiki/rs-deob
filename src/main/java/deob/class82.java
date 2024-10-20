package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ca")
public class class82 {

    @ObfuscatedName("ca.n")
    public static int[] field1278 = new int[5];

    @ObfuscatedName("ca.l")
    public static int[][] field1265 = new int[5][5000];

    @ObfuscatedName("ca.s")
    public static int[] field1266 = new int[1000];

    @ObfuscatedName("ca.c")
    public static String[] field1261 = new String[1000];

    @ObfuscatedName("ca.i")
    public static int field1269 = 0;

    @ObfuscatedName("ca.o")
    public static class64[] field1270 = new class64[50];

    @ObfuscatedName("ca.p")
    public static Calendar field1272 = Calendar.getInstance();

    @ObfuscatedName("ca.q")
    public static final String[] field1264 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ca.j")
    public static int field1275 = 0;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bu.g(Lbs;I)V")
    public static void method1108(class69 arg0) {
        method34(arg0, 500000);
    }

    @ObfuscatedName("y.e(Lbs;II)V")
    public static void method34(class69 arg0, int arg1) {
        Object[] var2 = arg0.field786;
        class97 var4;
        if (class246.method2940(arg0.field782)) {
            Statics.field1274 = (class49) var2[0];
            class270 var3 = Statics.field2517[Statics.field1274.field588];
            var4 = class97.method2993(arg0.field782, var3.field3453, var3.field3464);
        } else {
            int var5 = (Integer) var2[0];
            class97 var6 = (class97) class97.field1438.method3706((long) var5);
            class97 var7;
            if (var6 == null) {
                byte[] var8 = Statics.field533.method4294(var5, 0);
                if (var8 == null) {
                    var7 = null;
                } else {
                    class97 var9 = class97.method734(var8);
                    class97.field1438.method3712(var9, (long) var5);
                    var7 = var9;
                }
            } else {
                var7 = var6;
            }
            var4 = var7;
        }
        if (var4 == null) {
            return;
        }
        Statics.field2217 = 0;
        Statics.field1268 = 0;
        int var10 = -1;
        int[] var11 = var4.field1434;
        int[] var12 = var4.field1433;
        byte var13 = -1;
        field1269 = 0;
        try {
            Statics.field2601 = new int[var4.field1437];
            int var14 = 0;
            Statics.field1263 = new String[var4.field1435];
            int var15 = 0;
            for (int var16 = 1; var16 < var2.length; var16++) {
                if (var2[var16] instanceof Integer) {
                    int var17 = (Integer) var2[var16];
                    if (var17 == -2147483647) {
                        var17 = arg0.field788;
                    }
                    if (var17 == -2147483646) {
                        var17 = arg0.field781;
                    }
                    if (var17 == -2147483645) {
                        var17 = arg0.field778 == null ? -1 : arg0.field778.field2822;
                    }
                    if (var17 == -2147483644) {
                        var17 = arg0.field780;
                    }
                    if (var17 == -2147483643) {
                        var17 = arg0.field778 == null ? -1 : arg0.field778.field2823;
                    }
                    if (var17 == -2147483642) {
                        var17 = arg0.field777 == null ? -1 : arg0.field777.field2822;
                    }
                    if (var17 == -2147483641) {
                        var17 = arg0.field777 == null ? -1 : arg0.field777.field2823;
                    }
                    if (var17 == -2147483640) {
                        var17 = arg0.field787;
                    }
                    if (var17 == -2147483639) {
                        var17 = arg0.field783;
                    }
                    Statics.field2601[var14++] = var17;
                } else if (var2[var16] instanceof String) {
                    String var18 = (String) var2[var16];
                    if (var18.equals("event_opbase")) {
                        var18 = arg0.field784;
                    }
                    Statics.field1263[var15++] = var18;
                }
            }
            int var19 = 0;
            field1275 = arg0.field785;
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
                                                                                                                    var19++;
                                                                                                                    if (var19 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var10++;
                                                                                                                    int var67 = var11[var10];
                                                                                                                    if (var67 >= 100) {
                                                                                                                        boolean var61;
                                                                                                                        if (var4.field1433[var10] == 1) {
                                                                                                                            var61 = true;
                                                                                                                        } else {
                                                                                                                            var61 = false;
                                                                                                                        }
                                                                                                                        int var62 = method21(var67, var4, var61);
                                                                                                                        switch(var62) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var67 == 0) {
                                                                                                                        field1266[++Statics.field2217 - 1] = var12[var10];
                                                                                                                    } else if (var67 == 1) {
                                                                                                                        int var20 = var12[var10];
                                                                                                                        field1266[++Statics.field2217 - 1] = class238.field2788[var20];
                                                                                                                    } else if (var67 == 2) {
                                                                                                                        int var21 = var12[var10];
                                                                                                                        class238.field2788[var21] = field1266[--Statics.field2217];
                                                                                                                        client.method1977(var21);
                                                                                                                    } else if (var67 == 3) {
                                                                                                                        field1261[++Statics.field1268 - 1] = var4.field1436[var10];
                                                                                                                    } else if (var67 == 6) {
                                                                                                                        var10 += var12[var10];
                                                                                                                    } else if (var67 == 7) {
                                                                                                                        Statics.field2217 -= 2;
                                                                                                                        if (field1266[Statics.field2217] != field1266[Statics.field2217 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 8) {
                                                                                                                        Statics.field2217 -= 2;
                                                                                                                        if (field1266[Statics.field2217] == field1266[Statics.field2217 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 9) {
                                                                                                                        Statics.field2217 -= 2;
                                                                                                                        if (field1266[Statics.field2217] < field1266[Statics.field2217 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 10) {
                                                                                                                        Statics.field2217 -= 2;
                                                                                                                        if (field1266[Statics.field2217] > field1266[Statics.field2217 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 21) {
                                                                                                                        if (field1269 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class64 var22 = field1270[--field1269];
                                                                                                                        var4 = var22.field744;
                                                                                                                        var11 = var4.field1434;
                                                                                                                        var12 = var4.field1433;
                                                                                                                        var10 = var22.field739;
                                                                                                                        Statics.field2601 = var22.field738;
                                                                                                                        Statics.field1263 = var22.field740;
                                                                                                                    } else if (var67 == 25) {
                                                                                                                        int var23 = var12[var10];
                                                                                                                        field1266[++Statics.field2217 - 1] = class238.method4502(var23);
                                                                                                                    } else if (var67 == 27) {
                                                                                                                        int var24 = var12[var10];
                                                                                                                        int var25 = field1266[--Statics.field2217];
                                                                                                                        class278 var26 = (class278) class278.field3544.method3706((long) var24);
                                                                                                                        class278 var27;
                                                                                                                        if (var26 == null) {
                                                                                                                            byte[] var28 = Statics.field3541.method4294(14, var24);
                                                                                                                            class278 var29 = new class278();
                                                                                                                            if (var28 != null) {
                                                                                                                                var29.method4592(new class195(var28));
                                                                                                                            }
                                                                                                                            class278.field3544.method3712(var29, (long) var24);
                                                                                                                            var27 = var29;
                                                                                                                        } else {
                                                                                                                            var27 = var26;
                                                                                                                        }
                                                                                                                        int var31 = var27.field3540;
                                                                                                                        int var32 = var27.field3543;
                                                                                                                        int var33 = var27.field3542;
                                                                                                                        int var34 = class238.field2787[var33 - var32];
                                                                                                                        if (var25 < 0 || var25 > var34) {
                                                                                                                            var25 = 0;
                                                                                                                        }
                                                                                                                        int var35 = var34 << var32;
                                                                                                                        class238.field2788[var31] = class238.field2788[var31] & ~var35 | var25 << var32 & var35;
                                                                                                                    } else if (var67 == 31) {
                                                                                                                        Statics.field2217 -= 2;
                                                                                                                        if (field1266[Statics.field2217] <= field1266[Statics.field2217 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 32) {
                                                                                                                        Statics.field2217 -= 2;
                                                                                                                        if (field1266[Statics.field2217] >= field1266[Statics.field2217 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 33) {
                                                                                                                        field1266[++Statics.field2217 - 1] = Statics.field2601[var12[var10]];
                                                                                                                    } else if (var67 == 34) {
                                                                                                                        Statics.field2601[var12[var10]] = field1266[--Statics.field2217];
                                                                                                                    } else if (var67 == 35) {
                                                                                                                        field1261[++Statics.field1268 - 1] = Statics.field1263[var12[var10]];
                                                                                                                    } else if (var67 == 36) {
                                                                                                                        Statics.field1263[var12[var10]] = field1261[--Statics.field1268];
                                                                                                                    } else if (var67 == 37) {
                                                                                                                        int var36 = var12[var10];
                                                                                                                        Statics.field1268 -= var36;
                                                                                                                        String var37 = class319.method5039(field1261, Statics.field1268, var36);
                                                                                                                        field1261[++Statics.field1268 - 1] = var37;
                                                                                                                    } else if (var67 == 38) {
                                                                                                                        Statics.field2217--;
                                                                                                                    } else if (var67 == 39) {
                                                                                                                        Statics.field1268--;
                                                                                                                    } else if (var67 == 40) {
                                                                                                                        int var38 = var12[var10];
                                                                                                                        class97 var39 = (class97) class97.field1438.method3706((long) var38);
                                                                                                                        class97 var40;
                                                                                                                        if (var39 == null) {
                                                                                                                            byte[] var41 = Statics.field533.method4294(var38, 0);
                                                                                                                            if (var41 == null) {
                                                                                                                                var40 = null;
                                                                                                                            } else {
                                                                                                                                class97 var42 = class97.method734(var41);
                                                                                                                                class97.field1438.method3712(var42, (long) var38);
                                                                                                                                var40 = var42;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var40 = var39;
                                                                                                                        }
                                                                                                                        class97 var43 = var40;
                                                                                                                        int[] var44 = new int[var40.field1437];
                                                                                                                        String[] var45 = new String[var40.field1435];
                                                                                                                        for (int var46 = 0; var46 < var43.field1439; var46++) {
                                                                                                                            var44[var46] = field1266[Statics.field2217 - var43.field1439 + var46];
                                                                                                                        }
                                                                                                                        for (int var47 = 0; var47 < var43.field1440; var47++) {
                                                                                                                            var45[var47] = field1261[Statics.field1268 - var43.field1440 + var47];
                                                                                                                        }
                                                                                                                        Statics.field2217 -= var43.field1439;
                                                                                                                        Statics.field1268 -= var43.field1440;
                                                                                                                        class64 var48 = new class64();
                                                                                                                        var48.field744 = var4;
                                                                                                                        var48.field739 = var10;
                                                                                                                        var48.field738 = Statics.field2601;
                                                                                                                        var48.field740 = Statics.field1263;
                                                                                                                        field1270[++field1269 - 1] = var48;
                                                                                                                        var4 = var43;
                                                                                                                        var11 = var43.field1434;
                                                                                                                        var12 = var43.field1433;
                                                                                                                        var10 = -1;
                                                                                                                        Statics.field2601 = var44;
                                                                                                                        Statics.field1263 = var45;
                                                                                                                    } else if (var67 == 42) {
                                                                                                                        field1266[++Statics.field2217 - 1] = Statics.field2146.method1905(var12[var10]);
                                                                                                                    } else if (var67 == 43) {
                                                                                                                        Statics.field2146.method1904(var12[var10], field1266[--Statics.field2217]);
                                                                                                                    } else if (var67 == 44) {
                                                                                                                        int var49 = var12[var10] >> 16;
                                                                                                                        int var50 = var12[var10] & 0xFFFF;
                                                                                                                        int var51 = field1266[--Statics.field2217];
                                                                                                                        if (var51 >= 0 && var51 <= 5000) {
                                                                                                                            field1278[var49] = var51;
                                                                                                                            byte var52 = -1;
                                                                                                                            if (var50 == 105) {
                                                                                                                                var52 = 0;
                                                                                                                            }
                                                                                                                            int var53 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var53 >= var51) {
                                                                                                                                    continue label252;
                                                                                                                                }
                                                                                                                                field1265[var49][var53] = var52;
                                                                                                                                var53++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var67 == 45) {
                                                                                                                        int var54 = var12[var10];
                                                                                                                        int var55 = field1266[--Statics.field2217];
                                                                                                                        if (var55 < 0 || var55 >= field1278[var54]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1266[++Statics.field2217 - 1] = field1265[var54][var55];
                                                                                                                    } else if (var67 == 46) {
                                                                                                                        int var56 = var12[var10];
                                                                                                                        Statics.field2217 -= 2;
                                                                                                                        int var57 = field1266[Statics.field2217];
                                                                                                                        if (var57 < 0 || var57 >= field1278[var56]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1265[var56][var57] = field1266[Statics.field2217 + 1];
                                                                                                                    } else if (var67 == 47) {
                                                                                                                        String var58 = Statics.field2146.method1909(var12[var10]);
                                                                                                                        if (var58 == null) {
                                                                                                                            var58 = class252.field3028;
                                                                                                                        }
                                                                                                                        field1261[++Statics.field1268 - 1] = var58;
                                                                                                                    } else if (var67 == 48) {
                                                                                                                        Statics.field2146.method1931(var12[var10], field1261[--Statics.field1268]);
                                                                                                                    } else if (var67 == 60) {
                                                                                                                        class210 var59 = var4.field1441[var12[var10]];
                                                                                                                        class224 var60 = (class224) var59.method3674((long) field1266[--Statics.field2217]);
                                                                                                                        if (var60 != null) {
                                                                                                                            var10 += var60.field2675;
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
        } catch (Exception var66) {
            StringBuilder var64 = new StringBuilder(30);
            var64.append("").append(var4.field2660).append(" ");
            for (int var65 = field1269 - 1; var65 >= 0; var65--) {
                var64.append("").append(field1270[var65].field744.field2660).append(" ");
            }
            var64.append("").append(var13);
            class165.method4257(var64.toString(), var66);
        }
    }

    @ObfuscatedName("s.b(ILcr;ZI)I")
    public static int method21(int arg0, class97 arg1, boolean arg2) {
        if (arg0 < 1000) {
            byte var10;
            if (arg0 == 100) {
                Statics.field2217 -= 3;
                int var3 = field1266[Statics.field2217];
                int var4 = field1266[Statics.field2217 + 1];
                int var5 = field1266[Statics.field2217 + 2];
                if (var4 == 0) {
                    throw new RuntimeException();
                }
                class243 var6 = class243.method123(var3);
                if (var6.field2946 == null) {
                    var6.field2946 = new class243[var5 + 1];
                }
                if (var6.field2946.length <= var5) {
                    class243[] var7 = new class243[var5 + 1];
                    for (int var8 = 0; var8 < var6.field2946.length; var8++) {
                        var7[var8] = var6.field2946[var8];
                    }
                    var6.field2946 = var7;
                }
                if (var5 > 0 && var6.field2946[var5 - 1] == null) {
                    throw new RuntimeException("" + (var5 - 1));
                }
                class243 var9 = new class243();
                var9.field2824 = var4;
                var9.field2841 = var9.field2822 = var6.field2822;
                var9.field2823 = var5;
                var9.field2900 = true;
                var6.field2946[var5] = var9;
                if (arg2) {
                    Statics.field605 = var9;
                } else {
                    Statics.field1271 = var9;
                }
                client.method89(var6);
                var10 = 1;
            } else if (arg0 == 101) {
                class243 var11 = arg2 ? Statics.field605 : Statics.field1271;
                class243 var12 = class243.method123(var11.field2822);
                var12.field2946[var11.field2823] = null;
                client.method89(var12);
                var10 = 1;
            } else if (arg0 == 102) {
                class243 var13 = class243.method123(field1266[--Statics.field2217]);
                var13.field2946 = null;
                client.method89(var13);
                var10 = 1;
            } else if (arg0 == 200) {
                Statics.field2217 -= 2;
                int var14 = field1266[Statics.field2217];
                int var15 = field1266[Statics.field2217 + 1];
                class243 var16 = class243.method590(var14, var15);
                if (var16 == null || var15 == -1) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = 1;
                    if (arg2) {
                        Statics.field605 = var16;
                    } else {
                        Statics.field1271 = var16;
                    }
                }
                var10 = 1;
            } else if (arg0 == 201) {
                class243 var17 = class243.method123(field1266[--Statics.field2217]);
                if (var17 == null) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = 1;
                    if (arg2) {
                        Statics.field605 = var17;
                    } else {
                        Statics.field1271 = var17;
                    }
                }
                var10 = 1;
            } else {
                var10 = 2;
            }
            return var10;
        } else if (arg0 < 1100) {
            return method1817(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method3533(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method632(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method156(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method4874(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method3114(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method1793(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method163(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            class243 var18 = arg2 ? Statics.field605 : Statics.field1271;
            byte var19;
            if (arg0 == 1800) {
                field1266[++Statics.field2217 - 1] = class244.method3050(client.method1(var18));
                var19 = 1;
            } else if (arg0 == 1801) {
                int var20 = field1266[--Statics.field2217];
                int var293 = var20 - 1;
                if (var18.field2816 == null || var293 >= var18.field2816.length || var18.field2816[var293] == null) {
                    field1261[++Statics.field1268 - 1] = "";
                } else {
                    field1261[++Statics.field1268 - 1] = var18.field2816[var293];
                }
                var19 = 1;
            } else if (arg0 == 1802) {
                if (var18.field2821 == null) {
                    field1261[++Statics.field1268 - 1] = "";
                } else {
                    field1261[++Statics.field1268 - 1] = var18.field2821;
                }
                var19 = 1;
            } else {
                var19 = 2;
            }
            return var19;
        } else if (arg0 < 2000) {
            return method1042(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1817(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method3533(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method632(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method156(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method4874(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method33(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            class243 var21 = class243.method123(field1266[--Statics.field2217]);
            byte var22;
            if (arg0 == 2600) {
                field1266[++Statics.field2217 - 1] = var21.field2951;
                var22 = 1;
            } else if (arg0 == 2601) {
                field1266[++Statics.field2217 - 1] = var21.field2844;
                var22 = 1;
            } else if (arg0 == 2602) {
                field1261[++Statics.field1268 - 1] = var21.field2810;
                var22 = 1;
            } else if (arg0 == 2603) {
                field1266[++Statics.field2217 - 1] = var21.field2813;
                var22 = 1;
            } else if (arg0 == 2604) {
                field1266[++Statics.field2217 - 1] = var21.field2846;
                var22 = 1;
            } else if (arg0 == 2605) {
                field1266[++Statics.field2217 - 1] = var21.field2876;
                var22 = 1;
            } else if (arg0 == 2606) {
                field1266[++Statics.field2217 - 1] = var21.field2873;
                var22 = 1;
            } else if (arg0 == 2607) {
                field1266[++Statics.field2217 - 1] = var21.field2875;
                var22 = 1;
            } else if (arg0 == 2608) {
                field1266[++Statics.field2217 - 1] = var21.field2874;
                var22 = 1;
            } else if (arg0 == 2609) {
                field1266[++Statics.field2217 - 1] = var21.field2853;
                var22 = 1;
            } else if (arg0 == 2610) {
                field1266[++Statics.field2217 - 1] = var21.field2854;
                var22 = 1;
            } else if (arg0 == 2611) {
                field1266[++Statics.field2217 - 1] = var21.field2847;
                var22 = 1;
            } else if (arg0 == 2612) {
                field1266[++Statics.field2217 - 1] = var21.field2848;
                var22 = 1;
            } else if (arg0 == 2613) {
                field1266[++Statics.field2217 - 1] = var21.field2855.method15();
                var22 = 1;
            } else {
                var22 = 2;
            }
            return var22;
        } else if (arg0 < 2800) {
            byte var24;
            if (arg0 == 2700) {
                class243 var23 = class243.method123(field1266[--Statics.field2217]);
                field1266[++Statics.field2217 - 1] = var23.field2892;
                var24 = 1;
            } else if (arg0 == 2701) {
                class243 var25 = class243.method123(field1266[--Statics.field2217]);
                if (var25.field2892 == -1) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = var25.field2943;
                }
                var24 = 1;
            } else if (arg0 == 2702) {
                int var26 = field1266[--Statics.field2217];
                class68 var27 = (class68) client.field1014.method3740((long) var26);
                if (var27 == null) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = 1;
                }
                var24 = 1;
            } else if (arg0 == 2706) {
                field1266[++Statics.field2217 - 1] = client.field888;
                var24 = 1;
            } else {
                var24 = 2;
            }
            return var24;
        } else if (arg0 < 2900) {
            class243 var28 = class243.method123(field1266[--Statics.field2217]);
            byte var29;
            if (arg0 == 2800) {
                field1266[++Statics.field2217 - 1] = class244.method3050(client.method1(var28));
                var29 = 1;
            } else if (arg0 == 2801) {
                int var30 = field1266[--Statics.field2217];
                int var294 = var30 - 1;
                if (var28.field2816 == null || var294 >= var28.field2816.length || var28.field2816[var294] == null) {
                    field1261[++Statics.field1268 - 1] = "";
                } else {
                    field1261[++Statics.field1268 - 1] = var28.field2816[var294];
                }
                var29 = 1;
            } else if (arg0 == 2802) {
                if (var28.field2821 == null) {
                    field1261[++Statics.field1268 - 1] = "";
                } else {
                    field1261[++Statics.field1268 - 1] = var28.field2821;
                }
                var29 = 1;
            } else {
                var29 = 2;
            }
            return var29;
        } else if (arg0 < 3000) {
            return method1042(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return Statics.method5111(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method1724(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method509(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method507(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            byte var31;
            if (arg0 == 3600) {
                if (Statics.field1666.field1235 == 0) {
                    field1266[++Statics.field2217 - 1] = -2;
                } else if (Statics.field1666.field1235 == 1) {
                    field1266[++Statics.field2217 - 1] = -1;
                } else {
                    field1266[++Statics.field2217 - 1] = Statics.field1666.field1238.method4979();
                }
                var31 = 1;
            } else if (arg0 == 3601) {
                int var32 = field1266[--Statics.field2217];
                if (Statics.field1666.method1722() && var32 >= 0 && var32 < Statics.field1666.field1238.method4979()) {
                    class307 var33 = (class307) Statics.field1666.field1238.method5003(var32);
                    field1261[++Statics.field1268 - 1] = var33.method4929();
                    field1261[++Statics.field1268 - 1] = var33.method4938();
                } else {
                    field1261[++Statics.field1268 - 1] = "";
                    field1261[++Statics.field1268 - 1] = "";
                }
                var31 = 1;
            } else if (arg0 == 3602) {
                int var34 = field1266[--Statics.field2217];
                if (Statics.field1666.method1722() && var34 >= 0 && var34 < Statics.field1666.field1238.method4979()) {
                    field1266[++Statics.field2217 - 1] = ((class302) Statics.field1666.field1238.method5003(var34)).field3854;
                } else {
                    field1266[++Statics.field2217 - 1] = 0;
                }
                var31 = 1;
            } else if (arg0 == 3603) {
                int var35 = field1266[--Statics.field2217];
                if (Statics.field1666.method1722() && var35 >= 0 && var35 < Statics.field1666.field1238.method4979()) {
                    field1266[++Statics.field2217 - 1] = ((class302) Statics.field1666.field1238.method5003(var35)).field3855;
                } else {
                    field1266[++Statics.field2217 - 1] = 0;
                }
                var31 = 1;
            } else if (arg0 == 3604) {
                String var36 = field1261[--Statics.field1268];
                int var37 = field1266[--Statics.field2217];
                class80.method195(var36, var37);
                var31 = 1;
            } else if (arg0 == 3605) {
                String var38 = field1261[--Statics.field1268];
                Statics.field1666.method1670(var38);
                var31 = 1;
            } else if (arg0 == 3606) {
                String var39 = field1261[--Statics.field1268];
                Statics.field1666.method1673(var39);
                var31 = 1;
            } else if (arg0 == 3607) {
                String var40 = field1261[--Statics.field1268];
                Statics.field1666.method1694(var40);
                var31 = 1;
            } else if (arg0 == 3608) {
                String var41 = field1261[--Statics.field1268];
                Statics.field1666.method1687(var41);
                var31 = 1;
            } else if (arg0 == 3609) {
                String var42 = field1261[--Statics.field1268];
                String var43 = client.method322(var42);
                field1266[++Statics.field2217 - 1] = Statics.field1666.method1668(new class306(var43, Statics.field2078), false) ? 1 : 0;
                var31 = 1;
            } else if (arg0 == 3611) {
                if (Statics.field2474 == null) {
                    field1261[++Statics.field1268 - 1] = "";
                } else {
                    field1261[++Statics.field1268 - 1] = Statics.field2474.field3873;
                }
                var31 = 1;
            } else if (arg0 == 3612) {
                if (Statics.field2474 == null) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = Statics.field2474.method4979();
                }
                var31 = 1;
            } else if (arg0 == 3613) {
                int var44 = field1266[--Statics.field2217];
                if (Statics.field2474 == null || var44 >= Statics.field2474.method4979()) {
                    field1261[++Statics.field1268 - 1] = "";
                } else {
                    field1261[++Statics.field1268 - 1] = Statics.field2474.method5003(var44).method4928().method5060();
                }
                var31 = 1;
            } else if (arg0 == 3614) {
                int var45 = field1266[--Statics.field2217];
                if (Statics.field2474 == null || var45 >= Statics.field2474.method4979()) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = ((class302) Statics.field2474.method5003(var45)).method5047();
                }
                var31 = 1;
            } else if (arg0 == 3615) {
                int var46 = field1266[--Statics.field2217];
                if (Statics.field2474 == null || var46 >= Statics.field2474.method4979()) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = ((class302) Statics.field2474.method5003(var46)).field3855;
                }
                var31 = 1;
            } else if (arg0 == 3616) {
                field1266[++Statics.field2217 - 1] = Statics.field2474 == null ? 0 : Statics.field2474.field3875;
                var31 = 1;
            } else if (arg0 == 3617) {
                String var47 = field1261[--Statics.field1268];
                client.method13(var47);
                var31 = 1;
            } else if (arg0 == 3618) {
                field1266[++Statics.field2217 - 1] = Statics.field2474 == null ? 0 : Statics.field2474.field3872;
                var31 = 1;
            } else if (arg0 == 3619) {
                String var48 = field1261[--Statics.field1268];
                client.method2424(var48);
                var31 = 1;
            } else if (arg0 == 3620) {
                client.method1725();
                var31 = 1;
            } else if (arg0 == 3621) {
                if (Statics.field1666.method1722()) {
                    field1266[++Statics.field2217 - 1] = Statics.field1666.field1239.method4979();
                } else {
                    field1266[++Statics.field2217 - 1] = -1;
                }
                var31 = 1;
            } else if (arg0 == 3622) {
                int var49 = field1266[--Statics.field2217];
                if (Statics.field1666.method1722() && var49 >= 0 && var49 < Statics.field1666.field1239.method4979()) {
                    class301 var50 = (class301) Statics.field1666.field1239.method5003(var49);
                    field1261[++Statics.field1268 - 1] = var50.method4929();
                    field1261[++Statics.field1268 - 1] = var50.method4938();
                } else {
                    field1261[++Statics.field1268 - 1] = "";
                    field1261[++Statics.field1268 - 1] = "";
                }
                var31 = 1;
            } else if (arg0 == 3623) {
                String var51 = field1261[--Statics.field1268];
                String var52 = client.method322(var51);
                field1266[++Statics.field2217 - 1] = Statics.field1666.method1669(new class306(var52, Statics.field2078)) ? 1 : 0;
                var31 = 1;
            } else if (arg0 == 3624) {
                int var53 = field1266[--Statics.field2217];
                if (Statics.field2474 == null || var53 >= Statics.field2474.method4979() || !Statics.field2474.method5003(var53).method4928().equals(Statics.field3435.field829)) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = 1;
                }
                var31 = 1;
            } else if (arg0 == 3625) {
                if (Statics.field2474 == null || Statics.field2474.field3874 == null) {
                    field1261[++Statics.field1268 - 1] = "";
                } else {
                    field1261[++Statics.field1268 - 1] = Statics.field2474.field3874;
                }
                var31 = 1;
            } else if (arg0 == 3626) {
                int var54 = field1266[--Statics.field2217];
                if (Statics.field2474 == null || var54 >= Statics.field2474.method4979() || !((class296) Statics.field2474.method5003(var54)).method4906()) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = 1;
                }
                var31 = 1;
            } else if (arg0 == 3627) {
                int var55 = field1266[--Statics.field2217];
                if (Statics.field2474 == null || var55 >= Statics.field2474.method4979() || !((class296) Statics.field2474.method5003(var55)).method4920()) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = 1;
                }
                var31 = 1;
            } else if (arg0 == 3628) {
                Statics.field1666.field1238.method4999();
                var31 = 1;
            } else if (arg0 == 3629) {
                boolean var56 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1238.method4987(new class322(var56));
                var31 = 1;
            } else if (arg0 == 3630) {
                boolean var57 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1238.method4987(new class323(var57));
                var31 = 1;
            } else if (arg0 == 3631) {
                boolean var58 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1238.method4987(new class156(var58));
                var31 = 1;
            } else if (arg0 == 3632) {
                boolean var59 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1238.method4987(new class150(var59));
                var31 = 1;
            } else if (arg0 == 3633) {
                boolean var60 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1238.method4987(new class155(var60));
                var31 = 1;
            } else if (arg0 == 3634) {
                boolean var61 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1238.method4987(new class158(var61));
                var31 = 1;
            } else if (arg0 == 3635) {
                boolean var62 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1238.method4987(new class154(var62));
                var31 = 1;
            } else if (arg0 == 3636) {
                boolean var63 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1238.method4987(new class152(var63));
                var31 = 1;
            } else if (arg0 == 3637) {
                boolean var64 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1238.method4987(new class151(var64));
                var31 = 1;
            } else if (arg0 == 3638) {
                boolean var65 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1238.method4987(new class153(var65));
                var31 = 1;
            } else if (arg0 == 3639) {
                Statics.field1666.field1238.method4968();
                var31 = 1;
            } else if (arg0 == 3640) {
                Statics.field1666.field1239.method4999();
                var31 = 1;
            } else if (arg0 == 3641) {
                boolean var66 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1239.method4987(new class322(var66));
                var31 = 1;
            } else if (arg0 == 3642) {
                boolean var67 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1239.method4987(new class323(var67));
                var31 = 1;
            } else if (arg0 == 3643) {
                Statics.field1666.field1239.method4968();
                var31 = 1;
            } else if (arg0 == 3644) {
                if (Statics.field2474 != null) {
                    Statics.field2474.method4999();
                }
                var31 = 1;
            } else if (arg0 == 3645) {
                boolean var68 = field1266[--Statics.field2217] == 1;
                if (Statics.field2474 != null) {
                    Statics.field2474.method4987(new class322(var68));
                }
                var31 = 1;
            } else if (arg0 == 3646) {
                boolean var69 = field1266[--Statics.field2217] == 1;
                if (Statics.field2474 != null) {
                    Statics.field2474.method4987(new class323(var69));
                }
                var31 = 1;
            } else if (arg0 == 3647) {
                boolean var70 = field1266[--Statics.field2217] == 1;
                if (Statics.field2474 != null) {
                    Statics.field2474.method4987(new class156(var70));
                }
                var31 = 1;
            } else if (arg0 == 3648) {
                boolean var71 = field1266[--Statics.field2217] == 1;
                if (Statics.field2474 != null) {
                    Statics.field2474.method4987(new class150(var71));
                }
                var31 = 1;
            } else if (arg0 == 3649) {
                boolean var72 = field1266[--Statics.field2217] == 1;
                if (Statics.field2474 != null) {
                    Statics.field2474.method4987(new class155(var72));
                }
                var31 = 1;
            } else if (arg0 == 3650) {
                boolean var73 = field1266[--Statics.field2217] == 1;
                if (Statics.field2474 != null) {
                    Statics.field2474.method4987(new class158(var73));
                }
                var31 = 1;
            } else if (arg0 == 3651) {
                boolean var74 = field1266[--Statics.field2217] == 1;
                if (Statics.field2474 != null) {
                    Statics.field2474.method4987(new class154(var74));
                }
                var31 = 1;
            } else if (arg0 == 3652) {
                boolean var75 = field1266[--Statics.field2217] == 1;
                if (Statics.field2474 != null) {
                    Statics.field2474.method4987(new class152(var75));
                }
                var31 = 1;
            } else if (arg0 == 3653) {
                boolean var76 = field1266[--Statics.field2217] == 1;
                if (Statics.field2474 != null) {
                    Statics.field2474.method4987(new class151(var76));
                }
                var31 = 1;
            } else if (arg0 == 3654) {
                boolean var77 = field1266[--Statics.field2217] == 1;
                if (Statics.field2474 != null) {
                    Statics.field2474.method4987(new class153(var77));
                }
                var31 = 1;
            } else if (arg0 == 3655) {
                if (Statics.field2474 != null) {
                    Statics.field2474.method4968();
                }
                var31 = 1;
            } else if (arg0 == 3656) {
                boolean var78 = field1266[--Statics.field2217] == 1;
                Statics.field1666.field1238.method4987(new class157(var78));
                var31 = 1;
            } else if (arg0 == 3657) {
                boolean var79 = field1266[--Statics.field2217] == 1;
                if (Statics.field2474 != null) {
                    Statics.field2474.method4987(new class157(var79));
                }
                var31 = 1;
            } else {
                var31 = 2;
            }
            return var31;
        } else if (arg0 < 4000) {
            return method1170(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            byte var82;
            if (arg0 == 4000) {
                Statics.field2217 -= 2;
                int var80 = field1266[Statics.field2217];
                int var81 = field1266[Statics.field2217 + 1];
                field1266[++Statics.field2217 - 1] = var80 + var81;
                var82 = 1;
            } else if (arg0 == 4001) {
                Statics.field2217 -= 2;
                int var83 = field1266[Statics.field2217];
                int var84 = field1266[Statics.field2217 + 1];
                field1266[++Statics.field2217 - 1] = var83 - var84;
                var82 = 1;
            } else if (arg0 == 4002) {
                Statics.field2217 -= 2;
                int var85 = field1266[Statics.field2217];
                int var86 = field1266[Statics.field2217 + 1];
                field1266[++Statics.field2217 - 1] = var85 * var86;
                var82 = 1;
            } else if (arg0 == 4003) {
                Statics.field2217 -= 2;
                int var87 = field1266[Statics.field2217];
                int var88 = field1266[Statics.field2217 + 1];
                field1266[++Statics.field2217 - 1] = var87 / var88;
                var82 = 1;
            } else if (arg0 == 4004) {
                int var89 = field1266[--Statics.field2217];
                field1266[++Statics.field2217 - 1] = (int) (Math.random() * (double) var89);
                var82 = 1;
            } else if (arg0 == 4005) {
                int var90 = field1266[--Statics.field2217];
                field1266[++Statics.field2217 - 1] = (int) (Math.random() * (double) (var90 + 1));
                var82 = 1;
            } else if (arg0 == 4006) {
                Statics.field2217 -= 5;
                int var91 = field1266[Statics.field2217];
                int var92 = field1266[Statics.field2217 + 1];
                int var93 = field1266[Statics.field2217 + 2];
                int var94 = field1266[Statics.field2217 + 3];
                int var95 = field1266[Statics.field2217 + 4];
                field1266[++Statics.field2217 - 1] = (var92 - var91) * (var95 - var93) / (var94 - var93) + var91;
                var82 = 1;
            } else if (arg0 == 4007) {
                Statics.field2217 -= 2;
                int var96 = field1266[Statics.field2217];
                int var97 = field1266[Statics.field2217 + 1];
                field1266[++Statics.field2217 - 1] = var96 * var97 / 100 + var96;
                var82 = 1;
            } else if (arg0 == 4008) {
                Statics.field2217 -= 2;
                int var98 = field1266[Statics.field2217];
                int var99 = field1266[Statics.field2217 + 1];
                field1266[++Statics.field2217 - 1] = var98 | 0x1 << var99;
                var82 = 1;
            } else if (arg0 == 4009) {
                Statics.field2217 -= 2;
                int var100 = field1266[Statics.field2217];
                int var101 = field1266[Statics.field2217 + 1];
                field1266[++Statics.field2217 - 1] = var100 & -1 - (0x1 << var101);
                var82 = 1;
            } else if (arg0 == 4010) {
                Statics.field2217 -= 2;
                int var102 = field1266[Statics.field2217];
                int var103 = field1266[Statics.field2217 + 1];
                field1266[++Statics.field2217 - 1] = (var102 & 0x1 << var103) == 0 ? 0 : 1;
                var82 = 1;
            } else if (arg0 == 4011) {
                Statics.field2217 -= 2;
                int var104 = field1266[Statics.field2217];
                int var105 = field1266[Statics.field2217 + 1];
                field1266[++Statics.field2217 - 1] = var104 % var105;
                var82 = 1;
            } else if (arg0 == 4012) {
                Statics.field2217 -= 2;
                int var106 = field1266[Statics.field2217];
                int var107 = field1266[Statics.field2217 + 1];
                if (var106 == 0) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = (int) Math.pow((double) var106, (double) var107);
                }
                var82 = 1;
            } else if (arg0 == 4013) {
                Statics.field2217 -= 2;
                int var108 = field1266[Statics.field2217];
                int var109 = field1266[Statics.field2217 + 1];
                if (var108 == 0) {
                    field1266[++Statics.field2217 - 1] = 0;
                    var82 = 1;
                } else {
                    switch(var109) {
                        case 0:
                            field1266[++Statics.field2217 - 1] = Integer.MAX_VALUE;
                            break;
                        case 1:
                            field1266[++Statics.field2217 - 1] = var108;
                            break;
                        case 2:
                            field1266[++Statics.field2217 - 1] = (int) Math.sqrt((double) var108);
                            break;
                        case 3:
                            field1266[++Statics.field2217 - 1] = (int) Math.cbrt((double) var108);
                            break;
                        case 4:
                            field1266[++Statics.field2217 - 1] = (int) Math.sqrt(Math.sqrt((double) var108));
                            break;
                        default:
                            field1266[++Statics.field2217 - 1] = (int) Math.pow((double) var108, 1.0D / (double) var109);
                    }
                    var82 = 1;
                }
            } else if (arg0 == 4014) {
                Statics.field2217 -= 2;
                int var110 = field1266[Statics.field2217];
                int var111 = field1266[Statics.field2217 + 1];
                field1266[++Statics.field2217 - 1] = var110 & var111;
                var82 = 1;
            } else if (arg0 == 4015) {
                Statics.field2217 -= 2;
                int var112 = field1266[Statics.field2217];
                int var113 = field1266[Statics.field2217 + 1];
                field1266[++Statics.field2217 - 1] = var112 | var113;
                var82 = 1;
            } else if (arg0 == 4018) {
                Statics.field2217 -= 3;
                long var114 = (long) field1266[Statics.field2217];
                long var116 = (long) field1266[Statics.field2217 + 1];
                long var118 = (long) field1266[Statics.field2217 + 2];
                field1266[++Statics.field2217 - 1] = (int) (var114 * var118 / var116);
                var82 = 1;
            } else {
                var82 = 2;
            }
            return var82;
        } else if (arg0 < 4200) {
            byte var122;
            if (arg0 == 4100) {
                String var120 = field1261[--Statics.field1268];
                int var121 = field1266[--Statics.field2217];
                field1261[++Statics.field1268 - 1] = var120 + var121;
                var122 = 1;
            } else if (arg0 == 4101) {
                Statics.field1268 -= 2;
                String var123 = field1261[Statics.field1268];
                String var124 = field1261[Statics.field1268 + 1];
                field1261[++Statics.field1268 - 1] = var123 + var124;
                var122 = 1;
            } else if (arg0 == 4102) {
                String var125 = field1261[--Statics.field1268];
                int var126 = field1266[--Statics.field2217];
                String[] var127 = field1261;
                int var128 = ++Statics.field1268 - 1;
                String var130;
                if (var126 < 0) {
                    var130 = Integer.toString(var126);
                } else {
                    int var131 = var126;
                    String var132;
                    if (var126 < 0) {
                        var132 = Integer.toString(var126, 10);
                    } else {
                        int var133 = 2;
                        int var134 = var126 / 10;
                        while (var134 != 0) {
                            var134 /= 10;
                            var133++;
                        }
                        char[] var135 = new char[var133];
                        var135[0] = '+';
                        for (int var136 = var133 - 1; var136 > 0; var136--) {
                            int var137 = var131;
                            var131 /= 10;
                            int var138 = var137 - var131 * 10;
                            if (var138 >= 10) {
                                var135[var136] = (char) (var138 + 87);
                            } else {
                                var135[var136] = (char) (var138 + 48);
                            }
                        }
                        var132 = new String(var135);
                    }
                    var130 = var132;
                }
                var127[var128] = var125 + var130;
                var122 = 1;
            } else if (arg0 == 4103) {
                String var139 = field1261[--Statics.field1268];
                field1261[++Statics.field1268 - 1] = var139.toLowerCase();
                var122 = 1;
            } else if (arg0 == 4104) {
                int var140 = field1266[--Statics.field2217];
                long var141 = ((long) var140 + 11745L) * 86400000L;
                field1272.setTime(new Date(var141));
                int var143 = field1272.get(5);
                int var144 = field1272.get(2);
                int var145 = field1272.get(1);
                field1261[++Statics.field1268 - 1] = var143 + "-" + field1264[var144] + "-" + var145;
                var122 = 1;
            } else if (arg0 == 4105) {
                Statics.field1268 -= 2;
                String var146 = field1261[Statics.field1268];
                String var147 = field1261[Statics.field1268 + 1];
                if (Statics.field3435.field817 != null && Statics.field3435.field817.field2797) {
                    field1261[++Statics.field1268 - 1] = var147;
                } else {
                    field1261[++Statics.field1268 - 1] = var146;
                }
                var122 = 1;
            } else if (arg0 == 4106) {
                int var148 = field1266[--Statics.field2217];
                field1261[++Statics.field1268 - 1] = Integer.toString(var148);
                var122 = 1;
            } else if (arg0 == 4107) {
                Statics.field1268 -= 2;
                int[] var149 = field1266;
                int var150 = ++Statics.field2217 - 1;
                String var151 = field1261[Statics.field1268];
                String var152 = field1261[Statics.field1268 + 1];
                int var153 = client.field1020;
                int var154 = var151.length();
                int var155 = var152.length();
                int var156 = 0;
                int var157 = 0;
                byte var158 = 0;
                byte var159 = 0;
                int var168;
                label1436: while (true) {
                    if (var156 - var158 >= var154 && var157 - var159 >= var155) {
                        int var160 = Math.min(var154, var155);
                        for (int var161 = 0; var161 < var160; var161++) {
                            char var164 = var151.charAt(var161);
                            char var165 = var152.charAt(var161);
                            if (var164 != var165 && Character.toUpperCase(var164) != Character.toUpperCase(var165)) {
                                char var166 = Character.toLowerCase(var164);
                                char var167 = Character.toLowerCase(var165);
                                if (var166 != var167) {
                                    var168 = class186.method686(var166, var153) - class186.method686(var167, var153);
                                    break label1436;
                                }
                            }
                        }
                        int var169 = var154 - var155;
                        if (var169 != 0) {
                            var168 = var169;
                            break;
                        }
                        for (int var170 = 0; var170 < var160; var170++) {
                            char var171 = var151.charAt(var170);
                            char var172 = var152.charAt(var170);
                            if (var171 != var172) {
                                var168 = class186.method686(var171, var153) - class186.method686(var172, var153);
                                break label1436;
                            }
                        }
                        var168 = 0;
                        break;
                    }
                    if (var156 - var158 >= var154) {
                        var168 = -1;
                        break;
                    }
                    if (var157 - var159 >= var155) {
                        var168 = 1;
                        break;
                    }
                    char var173;
                    if (var158 == 0) {
                        var173 = var151.charAt(var156++);
                    } else {
                        var173 = (char) var158;
                        boolean var174 = false;
                    }
                    char var175;
                    if (var159 == 0) {
                        var175 = var152.charAt(var157++);
                    } else {
                        var175 = (char) var159;
                        boolean var176 = false;
                    }
                    byte var177;
                    if (var173 == 198) {
                        var177 = 69;
                    } else if (var173 == 230) {
                        var177 = 101;
                    } else if (var173 == 223) {
                        var177 = 115;
                    } else if (var173 == 338) {
                        var177 = 69;
                    } else if (var173 == 339) {
                        var177 = 101;
                    } else {
                        var177 = 0;
                    }
                    var158 = var177;
                    byte var178;
                    if (var175 == 198) {
                        var178 = 69;
                    } else if (var175 == 230) {
                        var178 = 101;
                    } else if (var175 == 223) {
                        var178 = 115;
                    } else if (var175 == 338) {
                        var178 = 69;
                    } else if (var175 == 339) {
                        var178 = 101;
                    } else {
                        var178 = 0;
                    }
                    var159 = var178;
                    char var179 = class186.method958(var173, var153);
                    char var180 = class186.method958(var175, var153);
                    if (var179 != var180 && Character.toUpperCase(var179) != Character.toUpperCase(var180)) {
                        char var181 = Character.toLowerCase(var179);
                        char var182 = Character.toLowerCase(var180);
                        if (var181 != var182) {
                            var168 = class186.method686(var181, var153) - class186.method686(var182, var153);
                            break;
                        }
                    }
                }
                byte var184;
                if (var168 > 0) {
                    var184 = 1;
                } else if (var168 < 0) {
                    var184 = -1;
                } else {
                    var184 = 0;
                }
                var149[var150] = var184;
                var122 = 1;
            } else if (arg0 == 4108) {
                String var185 = field1261[--Statics.field1268];
                Statics.field2217 -= 2;
                int var186 = field1266[Statics.field2217];
                int var187 = field1266[Statics.field2217 + 1];
                byte[] var188 = Statics.field490.method4294(var187, 0);
                class312 var189 = new class312(var188);
                field1266[++Statics.field2217 - 1] = var189.method5128(var185, var186);
                var122 = 1;
            } else if (arg0 == 4109) {
                String var190 = field1261[--Statics.field1268];
                Statics.field2217 -= 2;
                int var191 = field1266[Statics.field2217];
                int var192 = field1266[Statics.field2217 + 1];
                byte[] var193 = Statics.field490.method4294(var192, 0);
                class312 var194 = new class312(var193);
                field1266[++Statics.field2217 - 1] = var194.method5131(var190, var191);
                var122 = 1;
            } else if (arg0 == 4110) {
                Statics.field1268 -= 2;
                String var195 = field1261[Statics.field1268];
                String var196 = field1261[Statics.field1268 + 1];
                if (field1266[--Statics.field2217] == 1) {
                    field1261[++Statics.field1268 - 1] = var195;
                } else {
                    field1261[++Statics.field1268 - 1] = var196;
                }
                var122 = 1;
            } else if (arg0 == 4111) {
                String var197 = field1261[--Statics.field1268];
                field1261[++Statics.field1268 - 1] = class313.method5133(var197);
                var122 = 1;
            } else if (arg0 == 4112) {
                String var198 = field1261[--Statics.field1268];
                int var199 = field1266[--Statics.field2217];
                field1261[++Statics.field1268 - 1] = var198 + (char) var199;
                var122 = 1;
            } else if (arg0 == 4113) {
                int var200 = field1266[--Statics.field2217];
                field1266[++Statics.field2217 - 1] = class319.method4449((char) var200) ? 1 : 0;
                var122 = 1;
            } else if (arg0 == 4114) {
                int var201 = field1266[--Statics.field2217];
                int[] var202 = field1266;
                int var203 = ++Statics.field2217 - 1;
                char var204 = (char) var201;
                boolean var205 = var204 >= '0' && var204 <= '9' || var204 >= 'A' && var204 <= 'Z' || var204 >= 'a' && var204 <= 'z';
                var202[var203] = var205 ? 1 : 0;
                var122 = 1;
            } else if (arg0 == 4115) {
                int var206 = field1266[--Statics.field2217];
                field1266[++Statics.field2217 - 1] = class319.method50((char) var206) ? 1 : 0;
                var122 = 1;
            } else if (arg0 == 4116) {
                int var207 = field1266[--Statics.field2217];
                field1266[++Statics.field2217 - 1] = class319.method4260((char) var207) ? 1 : 0;
                var122 = 1;
            } else if (arg0 == 4117) {
                String var208 = field1261[--Statics.field1268];
                if (var208 == null) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = var208.length();
                }
                var122 = 1;
            } else if (arg0 == 4118) {
                String var209 = field1261[--Statics.field1268];
                Statics.field2217 -= 2;
                int var210 = field1266[Statics.field2217];
                int var211 = field1266[Statics.field2217 + 1];
                field1261[++Statics.field1268 - 1] = var209.substring(var210, var211);
                var122 = 1;
            } else if (arg0 == 4119) {
                String var212 = field1261[--Statics.field1268];
                StringBuilder var213 = new StringBuilder(var212.length());
                boolean var214 = false;
                for (int var215 = 0; var215 < var212.length(); var215++) {
                    char var216 = var212.charAt(var215);
                    if (var216 == '<') {
                        var214 = true;
                    } else if (var216 == '>') {
                        var214 = false;
                    } else if (!var214) {
                        var213.append(var216);
                    }
                }
                field1261[++Statics.field1268 - 1] = var213.toString();
                var122 = 1;
            } else if (arg0 == 4120) {
                String var217 = field1261[--Statics.field1268];
                int var218 = field1266[--Statics.field2217];
                field1266[++Statics.field2217 - 1] = var217.indexOf(var218);
                var122 = 1;
            } else if (arg0 == 4121) {
                Statics.field1268 -= 2;
                String var219 = field1261[Statics.field1268];
                String var220 = field1261[Statics.field1268 + 1];
                int var221 = field1266[--Statics.field2217];
                field1266[++Statics.field2217 - 1] = var219.indexOf(var220, var221);
                var122 = 1;
            } else {
                var122 = 2;
            }
            return var122;
        } else if (arg0 < 4300) {
            return method5262(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method154(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            byte var225;
            if (arg0 == 5306) {
                int[] var222 = field1266;
                int var223 = ++Statics.field2217 - 1;
                int var224 = client.field1065 ? 2 : 1;
                var222[var223] = var224;
                var225 = 1;
            } else if (arg0 == 5307) {
                int var226 = field1266[--Statics.field2217];
                if (var226 == 1 || var226 == 2) {
                    client.field1093 = 0L;
                    if (var226 >= 2) {
                        client.field1065 = true;
                    } else {
                        client.field1065 = false;
                    }
                    int var227 = client.field1065 ? 2 : 1;
                    if (var227 == 1) {
                        Statics.field3445.method807(765, 503);
                    } else {
                        Statics.field3445.method807(7680, 2160);
                    }
                    if (client.field1111 >= 25) {
                        class185 var228 = class185.method2191(class182.field2423, client.field912.field1461);
                        class202 var229 = var228.field2489;
                        int var230 = client.field1065 ? 2 : 1;
                        var229.method3363(var230);
                        var228.field2489.method3476(Statics.field2039);
                        var228.field2489.method3476(Statics.field328);
                        client.field912.method1999(var228);
                    }
                }
                var225 = 1;
            } else if (arg0 == 5308) {
                field1266[++Statics.field2217 - 1] = Statics.field1117.field1230;
                var225 = 1;
            } else if (arg0 == 5309) {
                int var231 = field1266[--Statics.field2217];
                if (var231 == 1 || var231 == 2) {
                    Statics.field1117.field1230 = var231;
                    class79.method4185();
                }
                var225 = 1;
            } else {
                var225 = 2;
            }
            return var225;
        } else if (arg0 < 5600) {
            return Statics.method2990(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            byte var232;
            if (arg0 == 5630) {
                client.field900 = 250;
                var232 = 1;
            } else {
                var232 = 2;
            }
            return var232;
        } else if (arg0 < 6300) {
            return method1002(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3593(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            byte var236;
            if (arg0 == 6600) {
                int var233 = Statics.field226;
                int var234 = (Statics.field3435.field1154 >> 7) + Statics.field2465;
                int var235 = (Statics.field3435.field1148 >> 7) + Statics.field594;
                client.method1107().method5622(var233, var234, var235, true);
                var236 = 1;
            } else if (arg0 == 6601) {
                int var237 = field1266[--Statics.field2217];
                String var238 = "";
                class33 var239 = client.method1107().method5765(var237);
                if (var239 != null) {
                    var238 = var239.method255();
                }
                field1261[++Statics.field1268 - 1] = var238;
                var236 = 1;
            } else if (arg0 == 6602) {
                int var240 = field1266[--Statics.field2217];
                client.method1107().method5623(var240);
                var236 = 1;
            } else if (arg0 == 6603) {
                field1266[++Statics.field2217 - 1] = client.method1107().method5726();
                var236 = 1;
            } else if (arg0 == 6604) {
                int var241 = field1266[--Statics.field2217];
                client.method1107().method5634(var241);
                var236 = 1;
            } else if (arg0 == 6605) {
                field1266[++Statics.field2217 - 1] = client.method1107().method5784() ? 1 : 0;
                var236 = 1;
            } else if (arg0 == 6606) {
                class239 var242 = new class239(field1266[--Statics.field2217]);
                client.method1107().method5655(var242.field2791, var242.field2790);
                var236 = 1;
            } else if (arg0 == 6607) {
                class239 var243 = new class239(field1266[--Statics.field2217]);
                client.method1107().method5641(var243.field2791, var243.field2790);
                var236 = 1;
            } else if (arg0 == 6608) {
                class239 var244 = new class239(field1266[--Statics.field2217]);
                client.method1107().method5785(var244.field2793, var244.field2791, var244.field2790);
                var236 = 1;
            } else if (arg0 == 6609) {
                class239 var245 = new class239(field1266[--Statics.field2217]);
                client.method1107().method5643(var245.field2793, var245.field2791, var245.field2790);
                var236 = 1;
            } else if (arg0 == 6610) {
                field1266[++Statics.field2217 - 1] = client.method1107().method5644();
                field1266[++Statics.field2217 - 1] = client.method1107().method5700();
                var236 = 1;
            } else if (arg0 == 6611) {
                int var246 = field1266[--Statics.field2217];
                class33 var247 = client.method1107().method5765(var246);
                if (var247 == null) {
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = var247.method265().method4126();
                }
                var236 = 1;
            } else if (arg0 == 6612) {
                int var248 = field1266[--Statics.field2217];
                class33 var249 = client.method1107().method5765(var248);
                if (var249 == null) {
                    field1266[++Statics.field2217 - 1] = 0;
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = (var249.method259() - var249.method258() + 1) * 64;
                    field1266[++Statics.field2217 - 1] = (var249.method261() - var249.method260() + 1) * 64;
                }
                var236 = 1;
            } else if (arg0 == 6613) {
                int var250 = field1266[--Statics.field2217];
                class33 var251 = client.method1107().method5765(var250);
                if (var251 == null) {
                    field1266[++Statics.field2217 - 1] = 0;
                    field1266[++Statics.field2217 - 1] = 0;
                    field1266[++Statics.field2217 - 1] = 0;
                    field1266[++Statics.field2217 - 1] = 0;
                } else {
                    field1266[++Statics.field2217 - 1] = var251.method258() * 64;
                    field1266[++Statics.field2217 - 1] = var251.method260() * 64;
                    field1266[++Statics.field2217 - 1] = var251.method259() * 64 + 64 - 1;
                    field1266[++Statics.field2217 - 1] = var251.method261() * 64 + 64 - 1;
                }
                var236 = 1;
            } else if (arg0 == 6614) {
                int var252 = field1266[--Statics.field2217];
                class33 var253 = client.method1107().method5765(var252);
                if (var253 == null) {
                    field1266[++Statics.field2217 - 1] = -1;
                } else {
                    field1266[++Statics.field2217 - 1] = var253.method283();
                }
                var236 = 1;
            } else if (arg0 == 6615) {
                class239 var254 = client.method1107().method5646();
                if (var254 == null) {
                    field1266[++Statics.field2217 - 1] = -1;
                    field1266[++Statics.field2217 - 1] = -1;
                } else {
                    field1266[++Statics.field2217 - 1] = var254.field2791;
                    field1266[++Statics.field2217 - 1] = var254.field2790;
                }
                var236 = 1;
            } else if (arg0 == 6616) {
                field1266[++Statics.field2217 - 1] = client.method1107().method5624();
                var236 = 1;
            } else if (arg0 == 6617) {
                class239 var255 = new class239(field1266[--Statics.field2217]);
                class33 var256 = client.method1107().method5625();
                if (var256 == null) {
                    field1266[++Statics.field2217 - 1] = -1;
                    field1266[++Statics.field2217 - 1] = -1;
                    var236 = 1;
                } else {
                    int[] var257 = var256.method319(var255.field2793, var255.field2791, var255.field2790);
                    if (var257 == null) {
                        field1266[++Statics.field2217 - 1] = -1;
                        field1266[++Statics.field2217 - 1] = -1;
                    } else {
                        field1266[++Statics.field2217 - 1] = var257[0];
                        field1266[++Statics.field2217 - 1] = var257[1];
                    }
                    var236 = 1;
                }
            } else if (arg0 == 6618) {
                class239 var258 = new class239(field1266[--Statics.field2217]);
                class33 var259 = client.method1107().method5625();
                if (var259 == null) {
                    field1266[++Statics.field2217 - 1] = -1;
                    field1266[++Statics.field2217 - 1] = -1;
                    var236 = 1;
                } else {
                    class239 var260 = var259.method250(var258.field2791, var258.field2790);
                    if (var260 == null) {
                        field1266[++Statics.field2217 - 1] = -1;
                    } else {
                        field1266[++Statics.field2217 - 1] = var260.method4126();
                    }
                    var236 = 1;
                }
            } else if (arg0 == 6619) {
                Statics.field2217 -= 2;
                int var261 = field1266[Statics.field2217];
                class239 var262 = new class239(field1266[Statics.field2217 + 1]);
                method1603(var261, var262, false);
                var236 = 1;
            } else if (arg0 == 6620) {
                Statics.field2217 -= 2;
                int var263 = field1266[Statics.field2217];
                class239 var264 = new class239(field1266[Statics.field2217 + 1]);
                method1603(var263, var264, true);
                var236 = 1;
            } else if (arg0 == 6621) {
                Statics.field2217 -= 2;
                int var265 = field1266[Statics.field2217];
                class239 var266 = new class239(field1266[Statics.field2217 + 1]);
                class33 var267 = client.method1107().method5765(var265);
                if (var267 == null) {
                    field1266[++Statics.field2217 - 1] = 0;
                    var236 = 1;
                } else {
                    field1266[++Statics.field2217 - 1] = var267.method247(var266.field2793, var266.field2791, var266.field2790) ? 1 : 0;
                    var236 = 1;
                }
            } else if (arg0 == 6622) {
                field1266[++Statics.field2217 - 1] = client.method1107().method5725();
                field1266[++Statics.field2217 - 1] = client.method1107().method5662();
                var236 = 1;
            } else if (arg0 == 6623) {
                class239 var268 = new class239(field1266[--Statics.field2217]);
                class33 var269 = client.method1107().method5621(var268.field2793, var268.field2791, var268.field2790);
                if (var269 == null) {
                    field1266[++Statics.field2217 - 1] = -1;
                } else {
                    field1266[++Statics.field2217 - 1] = var269.method252();
                }
                var236 = 1;
            } else if (arg0 == 6624) {
                client.method1107().method5649(field1266[--Statics.field2217]);
                var236 = 1;
            } else if (arg0 == 6625) {
                client.method1107().method5751();
                var236 = 1;
            } else if (arg0 == 6626) {
                client.method1107().method5651(field1266[--Statics.field2217]);
                var236 = 1;
            } else if (arg0 == 6627) {
                client.method1107().method5652();
                var236 = 1;
            } else if (arg0 == 6628) {
                boolean var270 = field1266[--Statics.field2217] == 1;
                client.method1107().method5653(var270);
                var236 = 1;
            } else if (arg0 == 6629) {
                int var271 = field1266[--Statics.field2217];
                client.method1107().method5633(var271);
                var236 = 1;
            } else if (arg0 == 6630) {
                int var272 = field1266[--Statics.field2217];
                client.method1107().method5791(var272);
                var236 = 1;
            } else if (arg0 == 6631) {
                client.method1107().method5656();
                var236 = 1;
            } else if (arg0 == 6632) {
                boolean var273 = field1266[--Statics.field2217] == 1;
                client.method1107().method5657(var273);
                var236 = 1;
            } else if (arg0 == 6633) {
                Statics.field2217 -= 2;
                int var274 = field1266[Statics.field2217];
                boolean var275 = field1266[Statics.field2217 + 1] == 1;
                client.method1107().method5698(var274, var275);
                var236 = 1;
            } else if (arg0 == 6634) {
                Statics.field2217 -= 2;
                int var276 = field1266[Statics.field2217];
                boolean var277 = field1266[Statics.field2217 + 1] == 1;
                client.method1107().method5659(var276, var277);
                var236 = 1;
            } else if (arg0 == 6635) {
                field1266[++Statics.field2217 - 1] = client.method1107().method5660() ? 1 : 0;
                var236 = 1;
            } else if (arg0 == 6636) {
                int var278 = field1266[--Statics.field2217];
                field1266[++Statics.field2217 - 1] = client.method1107().method5612(var278) ? 1 : 0;
                var236 = 1;
            } else if (arg0 == 6637) {
                int var279 = field1266[--Statics.field2217];
                field1266[++Statics.field2217 - 1] = client.method1107().method5717(var279) ? 1 : 0;
                var236 = 1;
            } else if (arg0 == 6638) {
                Statics.field2217 -= 2;
                int var280 = field1266[Statics.field2217];
                class239 var281 = new class239(field1266[Statics.field2217 + 1]);
                class239 var282 = client.method1107().method5665(var280, var281);
                if (var282 == null) {
                    field1266[++Statics.field2217 - 1] = -1;
                } else {
                    field1266[++Statics.field2217 - 1] = var282.method4126();
                }
                var236 = 1;
            } else if (arg0 == 6639) {
                class41 var283 = client.method1107().method5667();
                if (var283 == null) {
                    field1266[++Statics.field2217 - 1] = -1;
                    field1266[++Statics.field2217 - 1] = -1;
                } else {
                    field1266[++Statics.field2217 - 1] = var283.field530;
                    field1266[++Statics.field2217 - 1] = var283.field523.method4126();
                }
                var236 = 1;
            } else if (arg0 == 6640) {
                class41 var284 = client.method1107().method5668();
                if (var284 == null) {
                    field1266[++Statics.field2217 - 1] = -1;
                    field1266[++Statics.field2217 - 1] = -1;
                } else {
                    field1266[++Statics.field2217 - 1] = var284.field530;
                    field1266[++Statics.field2217 - 1] = var284.field523.method4126();
                }
                var236 = 1;
            } else if (arg0 == 6693) {
                int var285 = field1266[--Statics.field2217];
                class270 var286 = Statics.field2517[var285];
                if (var286.field3456 == null) {
                    field1261[++Statics.field1268 - 1] = "";
                } else {
                    field1261[++Statics.field1268 - 1] = var286.field3456;
                }
                var236 = 1;
            } else if (arg0 == 6694) {
                int var287 = field1266[--Statics.field2217];
                class270 var288 = Statics.field2517[var287];
                field1266[++Statics.field2217 - 1] = var288.field3458;
                var236 = 1;
            } else if (arg0 == 6695) {
                int var289 = field1266[--Statics.field2217];
                class270 var290 = Statics.field2517[var289];
                if (var290 == null) {
                    field1266[++Statics.field2217 - 1] = -1;
                } else {
                    field1266[++Statics.field2217 - 1] = var290.field3464;
                }
                var236 = 1;
            } else if (arg0 == 6696) {
                int var291 = field1266[--Statics.field2217];
                class270 var292 = Statics.field2517[var291];
                if (var292 == null) {
                    field1266[++Statics.field2217 - 1] = -1;
                } else {
                    field1266[++Statics.field2217 - 1] = var292.field3454;
                }
                var236 = 1;
            } else if (arg0 == 6697) {
                field1266[++Statics.field2217 - 1] = Statics.field1274.field588;
                var236 = 1;
            } else if (arg0 == 6698) {
                field1266[++Statics.field2217 - 1] = Statics.field1274.field587.method4126();
                var236 = 1;
            } else if (arg0 == 6699) {
                field1266[++Statics.field2217 - 1] = Statics.field1274.field592.method4126();
                var236 = 1;
            } else {
                var236 = 2;
            }
            return var236;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cf.z(ILcr;ZB)I")
    public static int method1817(int arg0, class97 arg1, boolean arg2) {
        int var3 = -1;
        class243 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1266[--Statics.field2217];
            var4 = class243.method123(var3);
        } else {
            var4 = arg2 ? Statics.field605 : Statics.field1271;
        }
        if (arg0 == 1000) {
            Statics.field2217 -= 4;
            var4.field2878 = field1266[Statics.field2217];
            var4.field2832 = field1266[Statics.field2217 + 1];
            var4.field2827 = field1266[Statics.field2217 + 2];
            var4.field2828 = field1266[Statics.field2217 + 3];
            client.method89(var4);
            Statics.field3445.method1192(var4);
            if (var3 != -1 && var4.field2824 == 0) {
                client.method337(Statics.field2503[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field2217 -= 4;
            var4.field2929 = field1266[Statics.field2217];
            var4.field2909 = field1266[Statics.field2217 + 1];
            var4.field2829 = field1266[Statics.field2217 + 2];
            var4.field2830 = field1266[Statics.field2217 + 3];
            client.method89(var4);
            Statics.field3445.method1192(var4);
            if (var3 != -1 && var4.field2824 == 0) {
                client.method337(Statics.field2503[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1266[--Statics.field2217] == 1;
            if (var4.field2845 != var5) {
                var4.field2845 = var5;
                client.method89(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2955 = field1266[--Statics.field2217] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2956 = field1266[--Statics.field2217] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gf.n(ILcr;ZB)I")
    public static int method3533(int arg0, class97 arg1, boolean arg2) {
        int var3 = -1;
        class243 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1266[--Statics.field2217];
            var4 = class243.method123(var3);
        } else {
            var4 = arg2 ? Statics.field605 : Statics.field1271;
        }
        if (arg0 == 1100) {
            Statics.field2217 -= 2;
            var4.field2951 = field1266[Statics.field2217];
            if (var4.field2951 > var4.field2813 - var4.field2837) {
                var4.field2951 = var4.field2813 - var4.field2837;
            }
            if (var4.field2951 < 0) {
                var4.field2951 = 0;
            }
            var4.field2844 = field1266[Statics.field2217 + 1];
            if (var4.field2844 > var4.field2846 - var4.field2838) {
                var4.field2844 = var4.field2846 - var4.field2838;
            }
            if (var4.field2844 < 0) {
                var4.field2844 = 0;
            }
            client.method89(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2847 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2851 = field1266[--Statics.field2217] == 1;
            client.method89(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2853 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2889 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2954 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2859 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2860 = field1266[--Statics.field2217] == 1;
            client.method89(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2898 = 1;
            var4.field2866 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field2217 -= 6;
            var4.field2865 = field1266[Statics.field2217];
            var4.field2881 = field1266[Statics.field2217 + 1];
            var4.field2873 = field1266[Statics.field2217 + 2];
            var4.field2874 = field1266[Statics.field2217 + 3];
            var4.field2875 = field1266[Statics.field2217 + 4];
            var4.field2876 = field1266[Statics.field2217 + 5];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1266[--Statics.field2217];
            if (var4.field2869 != var5) {
                var4.field2869 = var5;
                var4.field2944 = 0;
                var4.field2897 = 0;
                client.method89(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2879 = field1266[--Statics.field2217] == 1;
            client.method89(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1261[--Statics.field1268];
            if (!var6.equals(var4.field2810)) {
                var4.field2810 = var6;
                client.method89(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2919 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field2217 -= 3;
            var4.field2871 = field1266[Statics.field2217];
            var4.field2948 = field1266[Statics.field2217 + 1];
            var4.field2884 = field1266[Statics.field2217 + 2];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2887 = field1266[--Statics.field2217] == 1;
            client.method89(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2882 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2833 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2868 = field1266[--Statics.field2217] == 1;
            client.method89(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2910 = field1266[--Statics.field2217] == 1;
            client.method89(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field2217 -= 2;
            var4.field2813 = field1266[Statics.field2217];
            var4.field2846 = field1266[Statics.field2217 + 1];
            client.method89(var4);
            if (var3 != -1 && var4.field2824 == 0) {
                client.method337(Statics.field2503[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2822;
            int var8 = var4.field2823;
            class185 var9 = class185.method2191(class182.field2432, client.field912.field1461);
            var9.field2489.method3344(var8);
            var9.field2489.method3354(var7);
            client.field912.method1999(var9);
            client.field1018 = var4;
            client.method89(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2858 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2848 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2854 = field1266[--Statics.field2217];
            client.method89(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var10 = field1266[--Statics.field2217];
            class330[] var11 = new class330[] { class330.field3975, class330.field3972, class330.field3973, class330.field3977, class330.field3974 };
            class330 var12 = (class330) Statics.method3233(var11, var10);
            if (var12 != null) {
                var4.field2855 = var12;
                client.method89(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var13 = field1266[--Statics.field2217] == 1;
            var4.field2831 = var13;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.l(ILcr;ZI)I")
    public static int method632(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method123(field1266[--Statics.field2217]);
        } else {
            var3 = arg2 ? Statics.field605 : Statics.field1271;
        }
        client.method89(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field2217 -= 2;
            int var4 = field1266[Statics.field2217];
            int var5 = field1266[Statics.field2217 + 1];
            var3.field2892 = var4;
            var3.field2943 = var5;
            class284 var6 = class284.method2027(var4);
            var3.field2873 = var6.field3662;
            var3.field2874 = var6.field3663;
            var3.field2875 = var6.field3672;
            var3.field2865 = var6.field3656;
            var3.field2881 = var6.field3666;
            var3.field2876 = var6.field3661;
            if (arg0 == 1205) {
                var3.field2880 = 0;
            } else if (arg0 == 1212 | var6.field3667 == 1) {
                var3.field2880 = 1;
            } else {
                var3.field2880 = 2;
            }
            if (var3.field2877 > 0) {
                var3.field2876 = var3.field2876 * 32 / var3.field2877;
            } else if (var3.field2929 > 0) {
                var3.field2876 = var3.field2876 * 32 / var3.field2929;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2898 = 2;
            var3.field2866 = field1266[--Statics.field2217];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2898 = 3;
            var3.field2866 = Statics.field3435.field817.method4140();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("w.s(ILcr;ZB)I")
    public static int method156(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method123(field1266[--Statics.field2217]);
        } else {
            var3 = arg2 ? Statics.field605 : Statics.field1271;
        }
        if (arg0 == 1300) {
            int var4 = field1266[--Statics.field2217] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4177(var4, field1261[--Statics.field1268]);
                return 1;
            } else {
                Statics.field1268--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field2217 -= 2;
            int var5 = field1266[Statics.field2217];
            int var6 = field1266[Statics.field2217 + 1];
            var3.field2932 = class243.method590(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2945 = field1266[--Statics.field2217] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2861 = field1266[--Statics.field2217];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2899 = field1266[--Statics.field2217];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2821 = field1261[--Statics.field1268];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2901 = field1261[--Statics.field1268];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2816 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ks.y(ILcr;ZB)I")
    public static int method4874(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method123(field1266[--Statics.field2217]);
        } else {
            var3 = arg2 ? Statics.field605 : Statics.field1271;
        }
        String var4 = field1261[--Statics.field1268];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1266[--Statics.field2217];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1266[--Statics.field2217];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1261[--Statics.field1268];
            } else {
                var7[var8] = Integer.valueOf(field1266[--Statics.field2217]);
            }
        }
        int var9 = field1266[--Statics.field2217];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2904 = var7;
        } else if (arg0 == 1401) {
            var3.field2857 = var7;
        } else if (arg0 == 1402) {
            var3.field2906 = var7;
        } else if (arg0 == 1403) {
            var3.field2918 = var7;
        } else if (arg0 == 1404) {
            var3.field2896 = var7;
        } else if (arg0 == 1405) {
            var3.field2911 = var7;
        } else if (arg0 == 1406) {
            var3.field2914 = var7;
        } else if (arg0 == 1407) {
            var3.field2915 = var7;
            var3.field2916 = var5;
        } else if (arg0 == 1408) {
            var3.field2937 = var7;
        } else if (arg0 == 1409) {
            var3.field2895 = var7;
        } else if (arg0 == 1410) {
            var3.field2912 = var7;
        } else if (arg0 == 1411) {
            var3.field2905 = var7;
        } else if (arg0 == 1412) {
            var3.field2894 = var7;
        } else if (arg0 == 1414) {
            var3.field2917 = var7;
            var3.field2922 = var5;
        } else if (arg0 == 1415) {
            var3.field2886 = var7;
            var3.field2926 = var5;
        } else if (arg0 == 1416) {
            var3.field2913 = var7;
        } else if (arg0 == 1417) {
            var3.field2923 = var7;
        } else if (arg0 == 1418) {
            var3.field2924 = var7;
        } else if (arg0 == 1419) {
            var3.field2862 = var7;
        } else if (arg0 == 1420) {
            var3.field2942 = var7;
        } else if (arg0 == 1421) {
            var3.field2852 = var7;
        } else if (arg0 == 1422) {
            var3.field2920 = var7;
        } else if (arg0 == 1423) {
            var3.field2885 = var7;
        } else if (arg0 == 1424) {
            var3.field2930 = var7;
        } else if (arg0 == 1425) {
            var3.field2835 = var7;
        } else if (arg0 == 1426) {
            var3.field2933 = var7;
        } else if (arg0 == 1427) {
            var3.field2931 = var7;
        } else {
            return 2;
        }
        var3.field2902 = true;
        return 1;
    }

    @ObfuscatedName("fs.c(ILcr;ZI)I")
    public static int method3114(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = arg2 ? Statics.field605 : Statics.field1271;
        if (arg0 == 1500) {
            field1266[++Statics.field2217 - 1] = var3.field2928;
            return 1;
        } else if (arg0 == 1501) {
            field1266[++Statics.field2217 - 1] = var3.field2826;
            return 1;
        } else if (arg0 == 1502) {
            field1266[++Statics.field2217 - 1] = var3.field2837;
            return 1;
        } else if (arg0 == 1503) {
            field1266[++Statics.field2217 - 1] = var3.field2838;
            return 1;
        } else if (arg0 == 1504) {
            field1266[++Statics.field2217 - 1] = var3.field2845 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1266[++Statics.field2217 - 1] = var3.field2841;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ca.o(ILcr;ZI)I")
    public static int method1793(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = arg2 ? Statics.field605 : Statics.field1271;
        if (arg0 == 1600) {
            field1266[++Statics.field2217 - 1] = var3.field2951;
            return 1;
        } else if (arg0 == 1601) {
            field1266[++Statics.field2217 - 1] = var3.field2844;
            return 1;
        } else if (arg0 == 1602) {
            field1261[++Statics.field1268 - 1] = var3.field2810;
            return 1;
        } else if (arg0 == 1603) {
            field1266[++Statics.field2217 - 1] = var3.field2813;
            return 1;
        } else if (arg0 == 1604) {
            field1266[++Statics.field2217 - 1] = var3.field2846;
            return 1;
        } else if (arg0 == 1605) {
            field1266[++Statics.field2217 - 1] = var3.field2876;
            return 1;
        } else if (arg0 == 1606) {
            field1266[++Statics.field2217 - 1] = var3.field2873;
            return 1;
        } else if (arg0 == 1607) {
            field1266[++Statics.field2217 - 1] = var3.field2875;
            return 1;
        } else if (arg0 == 1608) {
            field1266[++Statics.field2217 - 1] = var3.field2874;
            return 1;
        } else if (arg0 == 1609) {
            field1266[++Statics.field2217 - 1] = var3.field2853;
            return 1;
        } else if (arg0 == 1610) {
            field1266[++Statics.field2217 - 1] = var3.field2854;
            return 1;
        } else if (arg0 == 1611) {
            field1266[++Statics.field2217 - 1] = var3.field2847;
            return 1;
        } else if (arg0 == 1612) {
            field1266[++Statics.field2217 - 1] = var3.field2848;
            return 1;
        } else if (arg0 == 1613) {
            field1266[++Statics.field2217 - 1] = var3.field2855.method15();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("m.d(ILcr;ZI)I")
    public static int method163(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = arg2 ? Statics.field605 : Statics.field1271;
        if (arg0 == 1700) {
            field1266[++Statics.field2217 - 1] = var3.field2892;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2892 == -1) {
                field1266[++Statics.field2217 - 1] = 0;
            } else {
                field1266[++Statics.field2217 - 1] = var3.field2943;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1266[++Statics.field2217 - 1] = var3.field2823;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("br.r(ILcr;ZI)I")
    public static int method1042(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method123(field1266[--Statics.field2217]);
        } else {
            var3 = arg2 ? Statics.field605 : Statics.field1271;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1275 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2931 == null) {
            return 0;
        } else {
            class69 var4 = new class69();
            var4.field778 = var3;
            var4.field786 = var3.field2931;
            var4.field785 = field1275 + 1;
            client.field1050.method3829(var4);
            return 1;
        }
    }

    @ObfuscatedName("y.p(ILcr;ZI)I")
    public static int method33(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = class243.method123(field1266[--Statics.field2217]);
        if (arg0 == 2500) {
            field1266[++Statics.field2217 - 1] = var3.field2928;
            return 1;
        } else if (arg0 == 2501) {
            field1266[++Statics.field2217 - 1] = var3.field2826;
            return 1;
        } else if (arg0 == 2502) {
            field1266[++Statics.field2217 - 1] = var3.field2837;
            return 1;
        } else if (arg0 == 2503) {
            field1266[++Statics.field2217 - 1] = var3.field2838;
            return 1;
        } else if (arg0 == 2504) {
            field1266[++Statics.field2217 - 1] = var3.field2845 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1266[++Statics.field2217 - 1] = var3.field2841;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.f(ILcr;ZI)I")
    public static int method1724(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field2217 -= 3;
            int var3 = field1266[Statics.field2217];
            int var4 = field1266[Statics.field2217 + 1];
            int var5 = field1266[Statics.field2217 + 2];
            if (client.field1087 != 0 && var4 != 0 && client.field957 < 50) {
                client.field1098[client.field957] = var3;
                client.field1091[client.field957] = var4;
                client.field1092[client.field957] = var5;
                client.field858[client.field957] = null;
                client.field1013[client.field957] = 0;
                client.field957++;
            }
            return 1;
        } else if (arg0 == 3201) {
            client.method684(field1266[--Statics.field2217]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field2217 -= 2;
            int var6 = field1266[Statics.field2217];
            int var7 = field1266[Statics.field2217 + 1];
            if (client.field1084 != 0 && var6 != -1) {
                class230.method3043(Statics.field2518, var6, 0, client.field1084, false);
                client.field1086 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.j(ILcr;ZI)I")
    public static int method509(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1266[++Statics.field2217 - 1] = client.field913;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field2217 -= 2;
            int var3 = field1266[Statics.field2217];
            int var4 = field1266[Statics.field2217 + 1];
            int[] var5 = field1266;
            int var6 = ++Statics.field2217 - 1;
            class66 var7 = (class66) class66.field753.method3740((long) var3);
            int var8;
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.field756.length) {
                var8 = var7.field756[var4];
            } else {
                var8 = -1;
            }
            var5[var6] = var8;
            return 1;
        } else if (arg0 == 3302) {
            Statics.field2217 -= 2;
            int var9 = field1266[Statics.field2217];
            int var10 = field1266[Statics.field2217 + 1];
            field1266[++Statics.field2217 - 1] = class66.method46(var9, var10);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field2217 -= 2;
            int var11 = field1266[Statics.field2217];
            int var12 = field1266[Statics.field2217 + 1];
            int[] var13 = field1266;
            int var14 = ++Statics.field2217 - 1;
            class66 var15 = (class66) class66.field753.method3740((long) var11);
            int var16;
            if (var15 == null) {
                var16 = 0;
            } else if (var12 == -1) {
                var16 = 0;
            } else {
                int var17 = 0;
                for (int var18 = 0; var18 < var15.field754.length; var18++) {
                    if (var15.field756[var18] == var12) {
                        var17 += var15.field754[var18];
                    }
                }
                var16 = var17;
            }
            var13[var14] = var16;
            return 1;
        } else if (arg0 == 3304) {
            int var19 = field1266[--Statics.field2217];
            int[] var20 = field1266;
            int var21 = ++Statics.field2217 - 1;
            class268 var22 = (class268) class268.field3443.method3706((long) var19);
            class268 var23;
            if (var22 == null) {
                byte[] var24 = Statics.field3442.method4294(5, var19);
                class268 var25 = new class268();
                if (var24 != null) {
                    var25.method4441(new class195(var24));
                }
                class268.field3443.method3712(var25, (long) var19);
                var23 = var25;
            } else {
                var23 = var22;
            }
            var20[var21] = var23.field3444;
            return 1;
        } else if (arg0 == 3305) {
            int var26 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = client.field984[var26];
            return 1;
        } else if (arg0 == 3306) {
            int var27 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = client.field985[var27];
            return 1;
        } else if (arg0 == 3307) {
            int var28 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = client.field876[var28];
            return 1;
        } else if (arg0 == 3308) {
            int var29 = Statics.field226;
            int var30 = (Statics.field3435.field1154 >> 7) + Statics.field2465;
            int var31 = (Statics.field3435.field1148 >> 7) + Statics.field594;
            field1266[++Statics.field2217 - 1] = (var29 << 28) + (var30 << 14) + var31;
            return 1;
        } else if (arg0 == 3309) {
            int var32 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = var32 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var33 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = var33 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var34 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = var34 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1266[++Statics.field2217 - 1] = client.field856 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field2217 -= 2;
            int var35 = field1266[Statics.field2217] + 32768;
            int var36 = field1266[Statics.field2217 + 1];
            int[] var37 = field1266;
            int var38 = ++Statics.field2217 - 1;
            class66 var39 = (class66) class66.field753.method3740((long) var35);
            int var40;
            if (var39 == null) {
                var40 = -1;
            } else if (var36 >= 0 && var36 < var39.field756.length) {
                var40 = var39.field756[var36];
            } else {
                var40 = -1;
            }
            var37[var38] = var40;
            return 1;
        } else if (arg0 == 3314) {
            Statics.field2217 -= 2;
            int var41 = field1266[Statics.field2217] + 32768;
            int var42 = field1266[Statics.field2217 + 1];
            field1266[++Statics.field2217 - 1] = class66.method46(var41, var42);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field2217 -= 2;
            int var43 = field1266[Statics.field2217] + 32768;
            int var44 = field1266[Statics.field2217 + 1];
            int[] var45 = field1266;
            int var46 = ++Statics.field2217 - 1;
            class66 var47 = (class66) class66.field753.method3740((long) var43);
            int var48;
            if (var47 == null) {
                var48 = 0;
            } else if (var44 == -1) {
                var48 = 0;
            } else {
                int var49 = 0;
                for (int var50 = 0; var50 < var47.field754.length; var50++) {
                    if (var47.field756[var50] == var44) {
                        var49 += var47.field754[var50];
                    }
                }
                var48 = var49;
            }
            var45[var46] = var48;
            return 1;
        } else if (arg0 == 3316) {
            if (client.field997 >= 2) {
                field1266[++Statics.field2217 - 1] = client.field997;
            } else {
                field1266[++Statics.field2217 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1266[++Statics.field2217 - 1] = client.field870;
            return 1;
        } else if (arg0 == 3318) {
            field1266[++Statics.field2217 - 1] = client.field994;
            return 1;
        } else if (arg0 == 3321) {
            field1266[++Statics.field2217 - 1] = client.field1007;
            return 1;
        } else if (arg0 == 3322) {
            field1266[++Statics.field2217 - 1] = client.field897;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field1022) {
                field1266[++Statics.field2217 - 1] = 1;
            } else {
                field1266[++Statics.field2217 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1266[++Statics.field2217 - 1] = client.field854;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field2217 -= 4;
            int var51 = field1266[Statics.field2217];
            int var52 = field1266[Statics.field2217 + 1];
            int var53 = field1266[Statics.field2217 + 2];
            int var54 = field1266[Statics.field2217 + 3];
            int var55 = (var52 << 14) + var51;
            int var56 = (var53 << 28) + var55;
            int var57 = var54 + var56;
            field1266[++Statics.field2217 - 1] = var57;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.v(ILcr;ZI)I")
    public static int method507(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field2217 -= 2;
            int var3 = field1266[Statics.field2217];
            int var4 = field1266[Statics.field2217 + 1];
            class281 var5 = Statics.method2562(var3);
            if (var5.field3559 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3556; var6++) {
                if (var5.field3563[var6] == var4) {
                    field1261[++Statics.field1268 - 1] = var5.field3557[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1261[++Statics.field1268 - 1] = var5.field3560;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field2217 -= 4;
            int var7 = field1266[Statics.field2217];
            int var8 = field1266[Statics.field2217 + 1];
            int var9 = field1266[Statics.field2217 + 2];
            int var10 = field1266[Statics.field2217 + 3];
            class281 var11 = Statics.method2562(var9);
            if (var11.field3558 != var7 || var11.field3559 != var8) {
                if (var8 == 115) {
                    field1261[++Statics.field1268 - 1] = class252.field3028;
                } else {
                    field1266[++Statics.field2217 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3556; var12++) {
                if (var11.field3563[var12] == var10) {
                    if (var8 == 115) {
                        field1261[++Statics.field1268 - 1] = var11.field3557[var12];
                    } else {
                        field1266[++Statics.field2217 - 1] = var11.field3564[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1261[++Statics.field1268 - 1] = var11.field3560;
                } else {
                    field1266[++Statics.field2217 - 1] = var11.field3561;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1266[--Statics.field2217];
            class281 var14 = Statics.method2562(var13);
            field1266[++Statics.field2217 - 1] = var14.method4639();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("by.u(ILcr;ZI)I")
    public static int method1170(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = client.field1045[var3].method104();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = client.field1045[var4].field301;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = client.field1045[var5].field302;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = client.field1045[var6].field303;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = client.field1045[var7].field308;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = client.field1045[var8].field305;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1266[--Statics.field2217];
            int var10 = client.field1045[var9].method101();
            field1266[++Statics.field2217 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1266[--Statics.field2217];
            int var12 = client.field1045[var11].method101();
            field1266[++Statics.field2217 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1266[--Statics.field2217];
            int var14 = client.field1045[var13].method101();
            field1266[++Statics.field2217 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1266[--Statics.field2217];
            int var16 = client.field1045[var15].method101();
            field1266[++Statics.field2217 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1266[--Statics.field2217] == 1;
            if (Statics.field519 != null) {
                Statics.field519.method68(class14.field283, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1266[--Statics.field2217] == 1;
            if (Statics.field519 != null) {
                Statics.field519.method68(class14.field282, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field2217 -= 2;
            boolean var19 = field1266[Statics.field2217] == 1;
            boolean var20 = field1266[Statics.field2217 + 1] == 1;
            if (Statics.field519 != null) {
                client.field1119.field849 = var20;
                Statics.field519.method68(client.field1119, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1266[--Statics.field2217] == 1;
            if (Statics.field519 != null) {
                Statics.field519.method68(class14.field284, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1266[--Statics.field2217] == 1;
            if (Statics.field519 != null) {
                Statics.field519.method68(class14.field280, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1266[++Statics.field2217 - 1] = Statics.field519 == null ? 0 : Statics.field519.field281.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1266[--Statics.field2217];
            class15 var24 = (class15) Statics.field519.field281.get(var23);
            field1266[++Statics.field2217 - 1] = var24.field295;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1266[--Statics.field2217];
            class15 var26 = (class15) Statics.field519.field281.get(var25);
            field1261[++Statics.field1268 - 1] = var26.method75();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1266[--Statics.field2217];
            class15 var28 = (class15) Statics.field519.field281.get(var27);
            field1261[++Statics.field1268 - 1] = var28.method74();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1266[--Statics.field2217];
            class15 var30 = (class15) Statics.field519.field281.get(var29);
            long var31 = class197.method4873() - Statics.field456 - var30.field288;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1261[++Statics.field1268 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1266[--Statics.field2217];
            class15 var38 = (class15) Statics.field519.field281.get(var37);
            field1266[++Statics.field2217 - 1] = var38.field289.field303;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1266[--Statics.field2217];
            class15 var40 = (class15) Statics.field519.field281.get(var39);
            field1266[++Statics.field2217 - 1] = var40.field289.field302;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1266[--Statics.field2217];
            class15 var42 = (class15) Statics.field519.field281.get(var41);
            field1266[++Statics.field2217 - 1] = var42.field289.field301;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ld.k(ILcr;ZI)I")
    public static int method5262(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1266[--Statics.field2217];
            field1261[++Statics.field1268 - 1] = class284.method2027(var3).field3692;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field2217 -= 2;
            int var4 = field1266[Statics.field2217];
            int var5 = field1266[Statics.field2217 + 1];
            class284 var6 = class284.method2027(var4);
            if (var5 < 1 || var5 > 5 || var6.field3660[var5 - 1] == null) {
                field1261[++Statics.field1268 - 1] = "";
            } else {
                field1261[++Statics.field1268 - 1] = var6.field3660[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field2217 -= 2;
            int var7 = field1266[Statics.field2217];
            int var8 = field1266[Statics.field2217 + 1];
            class284 var9 = class284.method2027(var7);
            if (var8 < 1 || var8 > 5 || var9.field3671[var8 - 1] == null) {
                field1261[++Statics.field1268 - 1] = "";
            } else {
                field1261[++Statics.field1268 - 1] = var9.field3671[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = class284.method2027(var10).field3668;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = class284.method2027(var11).field3667 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1266[--Statics.field2217];
            class284 var13 = class284.method2027(var12);
            if (var13.field3688 == -1 && var13.field3684 >= 0) {
                field1266[++Statics.field2217 - 1] = var13.field3684;
            } else {
                field1266[++Statics.field2217 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1266[--Statics.field2217];
            class284 var15 = class284.method2027(var14);
            if (var15.field3688 >= 0 && var15.field3684 >= 0) {
                field1266[++Statics.field2217 - 1] = var15.field3684;
            } else {
                field1266[++Statics.field2217 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = class284.method2027(var16).field3669 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1266[--Statics.field2217];
            class284 var18 = class284.method2027(var17);
            if (var18.field3700 == -1 && var18.field3699 >= 0) {
                field1266[++Statics.field2217 - 1] = var18.field3699;
            } else {
                field1266[++Statics.field2217 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1266[--Statics.field2217];
            class284 var20 = class284.method2027(var19);
            if (var20.field3700 >= 0 && var20.field3699 >= 0) {
                field1266[++Statics.field2217 - 1] = var20.field3699;
            } else {
                field1266[++Statics.field2217 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1261[--Statics.field1268];
            int var22 = field1266[--Statics.field2217];
            client.method2574(var21, var22 == 1);
            field1266[++Statics.field2217 - 1] = Statics.field773;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field367 == null || Statics.field847 >= Statics.field773) {
                field1266[++Statics.field2217 - 1] = -1;
            } else {
                field1266[++Statics.field2217 - 1] = Statics.field367[++Statics.field847 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field847 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("w.w(ILcr;ZB)I")
    public static int method154(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1266[++Statics.field2217 - 1] = client.field1067;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field2217 -= 3;
            client.field1067 = field1266[Statics.field2217];
            Statics.field247 = class321.method527(field1266[Statics.field2217 + 1]);
            if (Statics.field247 == null) {
                Statics.field247 = class321.field3935;
            }
            client.field1068 = field1266[Statics.field2217 + 2];
            class185 var3 = class185.method2191(class182.field2450, client.field912.field1461);
            var3.field2489.method3363(client.field1067);
            var3.field2489.method3363(Statics.field247.field3936);
            var3.field2489.method3363(client.field1068);
            client.field912.method1999(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1261[--Statics.field1268];
            Statics.field2217 -= 2;
            int var5 = field1266[Statics.field2217];
            int var6 = field1266[Statics.field2217 + 1];
            class185 var7 = class185.method2191(class182.field2403, client.field912.field1461);
            var7.field2489.method3363(class195.method1963(var4) + 2);
            var7.field2489.method3300(var4);
            var7.field2489.method3363(var5 - 1);
            var7.field2489.method3363(var6);
            client.field912.method1999(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field2217 -= 2;
            int var8 = field1266[Statics.field2217];
            int var9 = field1266[Statics.field2217 + 1];
            class71 var10 = class96.method727(var8, var9);
            if (var10 == null) {
                field1266[++Statics.field2217 - 1] = -1;
                field1266[++Statics.field2217 - 1] = 0;
                field1261[++Statics.field1268 - 1] = "";
                field1261[++Statics.field1268 - 1] = "";
                field1261[++Statics.field1268 - 1] = "";
                field1266[++Statics.field2217 - 1] = 0;
            } else {
                field1266[++Statics.field2217 - 1] = var10.field807;
                field1266[++Statics.field2217 - 1] = var10.field803;
                field1261[++Statics.field1268 - 1] = var10.field805 == null ? "" : var10.field805;
                field1261[++Statics.field1268 - 1] = var10.field809 == null ? "" : var10.field809;
                field1261[++Statics.field1268 - 1] = var10.field806 == null ? "" : var10.field806;
                field1266[++Statics.field2217 - 1] = var10.method1094() ? 1 : (var10.method1090() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1266[--Statics.field2217];
            class71 var12 = (class71) class96.field1429.method3674((long) var11);
            if (var12 == null) {
                field1266[++Statics.field2217 - 1] = -1;
                field1266[++Statics.field2217 - 1] = 0;
                field1261[++Statics.field1268 - 1] = "";
                field1261[++Statics.field1268 - 1] = "";
                field1261[++Statics.field1268 - 1] = "";
                field1266[++Statics.field2217 - 1] = 0;
            } else {
                field1266[++Statics.field2217 - 1] = var12.field804;
                field1266[++Statics.field2217 - 1] = var12.field803;
                field1261[++Statics.field1268 - 1] = var12.field805 == null ? "" : var12.field805;
                field1261[++Statics.field1268 - 1] = var12.field809 == null ? "" : var12.field809;
                field1261[++Statics.field1268 - 1] = var12.field806 == null ? "" : var12.field806;
                field1266[++Statics.field2217 - 1] = var12.method1094() ? 1 : (var12.method1090() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field247 == null) {
                field1266[++Statics.field2217 - 1] = -1;
            } else {
                field1266[++Statics.field2217 - 1] = Statics.field247.field3936;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var14 = field1261[--Statics.field1268];
            int var15 = field1266[--Statics.field2217];
            String var16 = var14.toLowerCase();
            byte var17 = 0;
            if (var16.startsWith(class252.field3229)) {
                var17 = 0;
                var14 = var14.substring(class252.field3229.length());
            } else if (var16.startsWith(class252.field3199)) {
                var17 = 1;
                var14 = var14.substring(class252.field3199.length());
            } else if (var16.startsWith(class252.field3201)) {
                var17 = 2;
                var14 = var14.substring(class252.field3201.length());
            } else if (var16.startsWith(class252.field3186)) {
                var17 = 3;
                var14 = var14.substring(class252.field3186.length());
            } else if (var16.startsWith(class252.field3205)) {
                var17 = 4;
                var14 = var14.substring(class252.field3205.length());
            } else if (var16.startsWith(class252.field3207)) {
                var17 = 5;
                var14 = var14.substring(class252.field3207.length());
            } else if (var16.startsWith(class252.field3209)) {
                var17 = 6;
                var14 = var14.substring(class252.field3209.length());
            } else if (var16.startsWith(class252.field3230)) {
                var17 = 7;
                var14 = var14.substring(class252.field3230.length());
            } else if (var16.startsWith(class252.field3213)) {
                var17 = 8;
                var14 = var14.substring(class252.field3213.length());
            } else if (var16.startsWith(class252.field3215)) {
                var17 = 9;
                var14 = var14.substring(class252.field3215.length());
            } else if (var16.startsWith(class252.field3217)) {
                var17 = 10;
                var14 = var14.substring(class252.field3217.length());
            } else if (var16.startsWith(class252.field3219)) {
                var17 = 11;
                var14 = var14.substring(class252.field3219.length());
            } else if (client.field1020 != 0) {
                if (var16.startsWith(class252.field3049)) {
                    var17 = 0;
                    var14 = var14.substring(class252.field3049.length());
                } else if (var16.startsWith(class252.field3200)) {
                    var17 = 1;
                    var14 = var14.substring(class252.field3200.length());
                } else if (var16.startsWith(class252.field3202)) {
                    var17 = 2;
                    var14 = var14.substring(class252.field3202.length());
                } else if (var16.startsWith(class252.field3204)) {
                    var17 = 3;
                    var14 = var14.substring(class252.field3204.length());
                } else if (var16.startsWith(class252.field3214)) {
                    var17 = 4;
                    var14 = var14.substring(class252.field3214.length());
                } else if (var16.startsWith(class252.field3208)) {
                    var17 = 5;
                    var14 = var14.substring(class252.field3208.length());
                } else if (var16.startsWith(class252.field3210)) {
                    var17 = 6;
                    var14 = var14.substring(class252.field3210.length());
                } else if (var16.startsWith(class252.field3173)) {
                    var17 = 7;
                    var14 = var14.substring(class252.field3173.length());
                } else if (var16.startsWith(class252.field3255)) {
                    var17 = 8;
                    var14 = var14.substring(class252.field3255.length());
                } else if (var16.startsWith(class252.field3082)) {
                    var17 = 9;
                    var14 = var14.substring(class252.field3082.length());
                } else if (var16.startsWith(class252.field3116)) {
                    var17 = 10;
                    var14 = var14.substring(class252.field3116.length());
                } else if (var16.startsWith(class252.field3146)) {
                    var17 = 11;
                    var14 = var14.substring(class252.field3146.length());
                }
            }
            String var18 = var14.toLowerCase();
            byte var19 = 0;
            if (var18.startsWith(class252.field3221)) {
                var19 = 1;
                var14 = var14.substring(class252.field3221.length());
            } else if (var18.startsWith(class252.field3223)) {
                var19 = 2;
                var14 = var14.substring(class252.field3223.length());
            } else if (var18.startsWith(class252.field3225)) {
                var19 = 3;
                var14 = var14.substring(class252.field3225.length());
            } else if (var18.startsWith(class252.field3152)) {
                var19 = 4;
                var14 = var14.substring(class252.field3152.length());
            } else if (var18.startsWith(class252.field3227)) {
                var19 = 5;
                var14 = var14.substring(class252.field3227.length());
            } else if (client.field1020 != 0) {
                if (var18.startsWith(class252.field3104)) {
                    var19 = 1;
                    var14 = var14.substring(class252.field3104.length());
                } else if (var18.startsWith(class252.field3224)) {
                    var19 = 2;
                    var14 = var14.substring(class252.field3224.length());
                } else if (var18.startsWith(class252.field3155)) {
                    var19 = 3;
                    var14 = var14.substring(class252.field3155.length());
                } else if (var18.startsWith(class252.field3228)) {
                    var19 = 4;
                    var14 = var14.substring(class252.field3228.length());
                } else if (var18.startsWith(class252.field3233)) {
                    var19 = 5;
                    var14 = var14.substring(class252.field3233.length());
                }
            }
            class185 var20 = class185.method2191(class182.field2400, client.field912.field1461);
            var20.field2489.method3363(0);
            int var21 = var20.field2489.field2562;
            var20.field2489.method3363(var15);
            var20.field2489.method3363(var17);
            var20.field2489.method3363(var19);
            class314.method3921(var20.field2489, var14);
            var20.field2489.method3459(var20.field2489.field2562 - var21);
            client.field912.method1999(var20);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1268 -= 2;
            String var22 = field1261[Statics.field1268];
            String var23 = field1261[Statics.field1268 + 1];
            class185 var24 = class185.method2191(class182.field2434, client.field912.field1461);
            var24.field2489.method3476(0);
            int var25 = var24.field2489.field2562;
            var24.field2489.method3300(var22);
            class314.method3921(var24.field2489, var23);
            var24.field2489.method3304(var24.field2489.field2562 - var25);
            client.field912.method1999(var24);
            return 1;
        } else if (arg0 == 5015) {
            String var26;
            if (Statics.field3435 == null || Statics.field3435.field829 == null) {
                var26 = "";
            } else {
                var26 = Statics.field3435.field829.method5060();
            }
            field1261[++Statics.field1268 - 1] = var26;
            return 1;
        } else if (arg0 == 5016) {
            field1266[++Statics.field2217 - 1] = client.field1068;
            return 1;
        } else if (arg0 == 5017) {
            int var27 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = class96.method19(var27);
            return 1;
        } else if (arg0 == 5018) {
            int var28 = field1266[--Statics.field2217];
            int[] var29 = field1266;
            int var30 = ++Statics.field2217 - 1;
            class71 var31 = (class71) class96.field1429.method3674((long) var28);
            int var32;
            if (var31 == null) {
                var32 = -1;
            } else if (class96.field1430.field2682 == var31.field2664) {
                var32 = -1;
            } else {
                var32 = ((class71) var31.field2664).field807;
            }
            var29[var30] = var32;
            return 1;
        } else if (arg0 == 5019) {
            int var33 = field1266[--Statics.field2217];
            field1266[++Statics.field2217 - 1] = class96.method1065(var33);
            return 1;
        } else if (arg0 == 5020) {
            String var34 = field1261[--Statics.field1268];
            if (var34.equalsIgnoreCase("toggleroof")) {
                Statics.field1117.field1228 = !Statics.field1117.field1228;
                class79.method4185();
                if (Statics.field1117.field1228) {
                    class96.method5053(99, "", "Roofs are now all hidden");
                } else {
                    class96.method5053(99, "", "Roofs will only be removed selectively");
                }
            }
            if (var34.equalsIgnoreCase("displayfps")) {
                client.field869 = !client.field869;
            }
            if (var34.equalsIgnoreCase("renderself")) {
                client.field929 = !client.field929;
            }
            if (var34.equalsIgnoreCase("mouseovertext")) {
                client.field1113 = !client.field1113;
            }
            if (client.field997 >= 2) {
                if (var34.equalsIgnoreCase("aabb")) {
                    if (!class8.field230) {
                        class8.field230 = true;
                        class8.field227 = class12.field270;
                    } else if (class8.field227 == class12.field270) {
                        class8.field230 = true;
                        class8.field227 = class12.field273;
                    } else {
                        class8.field230 = false;
                    }
                }
                if (var34.equalsIgnoreCase("showcoord")) {
                    Statics.field2585.field4012 = !Statics.field2585.field4012;
                }
                if (var34.equalsIgnoreCase("fpson")) {
                    client.field869 = true;
                }
                if (var34.equalsIgnoreCase("fpsoff")) {
                    client.field869 = false;
                }
                if (var34.equalsIgnoreCase("gc")) {
                    System.gc();
                }
                if (var34.equalsIgnoreCase("clientdrop")) {
                    client.method225();
                }
                if (var34.equalsIgnoreCase("cs")) {
                    class96.method5053(99, "", "" + client.field1061);
                }
                if (var34.equalsIgnoreCase("errortest") && client.field855 == 2) {
                    throw new RuntimeException();
                }
            }
            class185 var35 = class185.method2191(class182.field2406, client.field912.field1461);
            var35.field2489.method3363(var34.length() + 1);
            var35.field2489.method3300(var34);
            client.field912.method1999(var35);
            return 1;
        } else if (arg0 == 5021) {
            client.field1069 = field1261[--Statics.field1268].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1261[++Statics.field1268 - 1] = client.field1069;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bb.t(ILcr;ZI)I")
    public static int method1002(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field2217 -= 2;
            client.field1101 = (short) field1266[Statics.field2217];
            if (client.field1101 <= 0) {
                client.field1101 = 256;
            }
            client.field1126 = (short) field1266[Statics.field2217 + 1];
            if (client.field1126 <= 0) {
                client.field1126 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field2217 -= 2;
            client.field1103 = (short) field1266[Statics.field2217];
            if (client.field1103 <= 0) {
                client.field1103 = 256;
            }
            client.field1104 = (short) field1266[Statics.field2217 + 1];
            if (client.field1104 <= 0) {
                client.field1104 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field2217 -= 4;
            client.field884 = (short) field1266[Statics.field2217];
            if (client.field884 <= 0) {
                client.field884 = 1;
            }
            client.field1027 = (short) field1266[Statics.field2217 + 1];
            if (client.field1027 <= 0) {
                client.field1027 = 32767;
            } else if (client.field1027 < client.field884) {
                client.field1027 = client.field884;
            }
            client.field1107 = (short) field1266[Statics.field2217 + 2];
            if (client.field1107 <= 0) {
                client.field1107 = 1;
            }
            client.field941 = (short) field1266[Statics.field2217 + 3];
            if (client.field941 <= 0) {
                client.field941 = 32767;
            } else if (client.field941 < client.field1107) {
                client.field941 = client.field1107;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field863 == null) {
                field1266[++Statics.field2217 - 1] = -1;
                field1266[++Statics.field2217 - 1] = -1;
            } else {
                client.method3(0, 0, client.field863.field2837, client.field863.field2838, false);
                field1266[++Statics.field2217 - 1] = client.field918;
                field1266[++Statics.field2217 - 1] = client.field899;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1266[++Statics.field2217 - 1] = client.field1103;
            field1266[++Statics.field2217 - 1] = client.field1104;
            return 1;
        } else if (arg0 == 6205) {
            field1266[++Statics.field2217 - 1] = client.field1101;
            field1266[++Statics.field2217 - 1] = client.field1126;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("go.ax(ILcr;ZI)I")
    public static int method3593(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1266[++Statics.field2217 - 1] = class78.method1068() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class78.field1212 = 0;
            class78 var3;
            if (class78.field1212 < class78.field1216) {
                var3 = Statics.field2216[++class78.field1212 - 1];
            } else {
                var3 = null;
            }
            if (var3 == null) {
                field1266[++Statics.field2217 - 1] = -1;
                field1266[++Statics.field2217 - 1] = 0;
                field1261[++Statics.field1268 - 1] = "";
                field1266[++Statics.field2217 - 1] = 0;
                field1266[++Statics.field2217 - 1] = 0;
                field1261[++Statics.field1268 - 1] = "";
            } else {
                field1266[++Statics.field2217 - 1] = var3.field1215;
                field1266[++Statics.field2217 - 1] = var3.field1208;
                field1261[++Statics.field1268 - 1] = var3.field1219;
                field1266[++Statics.field2217 - 1] = var3.field1220;
                field1266[++Statics.field2217 - 1] = var3.field1217;
                field1261[++Statics.field1268 - 1] = var3.field1221;
            }
            return 1;
        } else if (arg0 == 6502) {
            class78 var6;
            if (class78.field1212 < class78.field1216) {
                var6 = Statics.field2216[++class78.field1212 - 1];
            } else {
                var6 = null;
            }
            if (var6 == null) {
                field1266[++Statics.field2217 - 1] = -1;
                field1266[++Statics.field2217 - 1] = 0;
                field1261[++Statics.field1268 - 1] = "";
                field1266[++Statics.field2217 - 1] = 0;
                field1266[++Statics.field2217 - 1] = 0;
                field1261[++Statics.field1268 - 1] = "";
            } else {
                field1266[++Statics.field2217 - 1] = var6.field1215;
                field1266[++Statics.field2217 - 1] = var6.field1208;
                field1261[++Statics.field1268 - 1] = var6.field1219;
                field1266[++Statics.field2217 - 1] = var6.field1220;
                field1266[++Statics.field2217 - 1] = var6.field1217;
                field1261[++Statics.field1268 - 1] = var6.field1221;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var8 = field1266[--Statics.field2217];
            class78 var9 = null;
            for (int var10 = 0; var10 < class78.field1216; var10++) {
                if (Statics.field2216[var10].field1215 == var8) {
                    var9 = Statics.field2216[var10];
                    break;
                }
            }
            if (var9 == null) {
                field1266[++Statics.field2217 - 1] = -1;
                field1266[++Statics.field2217 - 1] = 0;
                field1261[++Statics.field1268 - 1] = "";
                field1266[++Statics.field2217 - 1] = 0;
                field1266[++Statics.field2217 - 1] = 0;
                field1261[++Statics.field1268 - 1] = "";
            } else {
                field1266[++Statics.field2217 - 1] = var9.field1215;
                field1266[++Statics.field2217 - 1] = var9.field1208;
                field1261[++Statics.field1268 - 1] = var9.field1219;
                field1266[++Statics.field2217 - 1] = var9.field1220;
                field1266[++Statics.field2217 - 1] = var9.field1217;
                field1261[++Statics.field1268 - 1] = var9.field1221;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field2217 -= 4;
            int var11 = field1266[Statics.field2217];
            boolean var12 = field1266[Statics.field2217 + 1] == 1;
            int var13 = field1266[Statics.field2217 + 2];
            boolean var14 = field1266[Statics.field2217 + 3] == 1;
            if (Statics.field2216 != null) {
                class78.method331(0, Statics.field2216.length - 1, var11, var12, var13, var14);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var15 = field1266[--Statics.field2217];
            if (var15 >= 0 && var15 < class78.field1216) {
                class78 var16 = Statics.field2216[var15];
                field1266[++Statics.field2217 - 1] = var16.field1215;
                field1266[++Statics.field2217 - 1] = var16.field1208;
                field1261[++Statics.field1268 - 1] = var16.field1219;
                field1266[++Statics.field2217 - 1] = var16.field1220;
                field1266[++Statics.field2217 - 1] = var16.field1217;
                field1261[++Statics.field1268 - 1] = var16.field1221;
            } else {
                field1266[++Statics.field2217 - 1] = -1;
                field1266[++Statics.field2217 - 1] = 0;
                field1261[++Statics.field1268 - 1] = "";
                field1266[++Statics.field2217 - 1] = 0;
                field1266[++Statics.field2217 - 1] = 0;
                field1261[++Statics.field1268 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field1112 = field1266[--Statics.field2217] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field2217 -= 2;
            int var17 = field1266[Statics.field2217];
            int var18 = field1266[Statics.field2217 + 1];
            class279 var19 = Statics.method4255(var18);
            if (var19.method4603()) {
                field1261[++Statics.field1268 - 1] = Statics.method2738(var17).method4802(var18, var19.field3549);
            } else {
                field1266[++Statics.field2217 - 1] = Statics.method2738(var17).method4801(var18, var19.field3547);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field2217 -= 2;
            int var20 = field1266[Statics.field2217];
            int var21 = field1266[Statics.field2217 + 1];
            class279 var22 = Statics.method4255(var21);
            if (var22.method4603()) {
                field1261[++Statics.field1268 - 1] = class283.method1732(var20).method4701(var21, var22.field3549);
            } else {
                field1266[++Statics.field2217 - 1] = class283.method1732(var20).method4700(var21, var22.field3547);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field2217 -= 2;
            int var23 = field1266[Statics.field2217];
            int var24 = field1266[Statics.field2217 + 1];
            class279 var25 = Statics.method4255(var24);
            if (var25.method4603()) {
                field1261[++Statics.field1268 - 1] = class284.method2027(var23).method4751(var24, var25.field3549);
            } else {
                field1266[++Statics.field2217 - 1] = class284.method2027(var23).method4750(var24, var25.field3547);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field2217 -= 2;
            int var26 = field1266[Statics.field2217];
            int var27 = field1266[Statics.field2217 + 1];
            class279 var28 = Statics.method4255(var27);
            if (var28.method4603()) {
                field1261[++Statics.field1268 - 1] = class280.method2948(var26).method4620(var27, var28.field3549);
            } else {
                field1266[++Statics.field2217 - 1] = class280.method2948(var26).method4621(var27, var28.field3547);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1266[++Statics.field2217 - 1] = client.field860 ? 1 : 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1268--;
            Statics.field2217--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1268--;
            Statics.field2217--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cs.ai(II)V")
    public static void method1962(int arg0) {
        if (arg0 == -1 || !class243.method1826(arg0)) {
            return;
        }
        class243[] var1 = Statics.field2503[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3.field2903 != null) {
                class69 var4 = new class69();
                var4.field778 = var3;
                var4.field786 = var3.field2903;
                method34(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("bv.aj(ILio;ZB)V")
    public static void method1603(int arg0, class239 arg1, boolean arg2) {
        class33 var3 = client.method1107().method5765(arg0);
        int var4 = Statics.field3435.field832;
        int var5 = (Statics.field3435.field1154 >> 7) + Statics.field2465;
        int var6 = (Statics.field3435.field1148 >> 7) + Statics.field594;
        class239 var7 = new class239(var4, var5, var6);
        client.method1107().method5648(var3, var7, arg1, arg2);
    }
}
