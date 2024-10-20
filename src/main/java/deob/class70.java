package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bv")
public class class70 {

    @ObfuscatedName("bv.f")
    public static int[] field1020 = new int[5];

    @ObfuscatedName("bv.n")
    public static int[][] field1016 = new int[5][5000];

    @ObfuscatedName("bv.h")
    public static int[] field1027 = new int[1000];

    @ObfuscatedName("bv.j")
    public static String[] field1022 = new String[1000];

    @ObfuscatedName("bv.l")
    public static int field1023 = 0;

    @ObfuscatedName("bv.d")
    public static class52[] field1024 = new class52[50];

    @ObfuscatedName("bv.g")
    public static Calendar field1025 = Calendar.getInstance();

    @ObfuscatedName("bv.y")
    public static final String[] field1019 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bv.e")
    public static int field1026 = 0;

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.w(Lbr;I)V")
    public static void method1612(class57 arg0) {
        method1001(arg0, 500000);
    }

    @ObfuscatedName("bk.m(Lbr;II)V")
    public static void method1001(class57 arg0, int arg1) {
        Object[] var2 = arg0.field526;
        class85 var4;
        if (Statics.method4244(arg0.field519)) {
            Statics.field2294 = (class37) var2[0];
            class256 var3 = Statics.field3275[Statics.field2294.field313];
            var4 = class85.method453(arg0.field519, var3.field3262, var3.field3278);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class85.method1689(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field378 = 0;
        Statics.field1208 = 0;
        int var6 = -1;
        int[] var7 = var4.field1212;
        int[] var8 = var4.field1217;
        byte var9 = -1;
        field1023 = 0;
        try {
            Statics.field1017 = new int[var4.field1214];
            int var10 = 0;
            Statics.field1018 = new String[var4.field1211];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field513;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field514;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field512 == null ? -1 : arg0.field512.field2624;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field515;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field512 == null ? -1 : arg0.field512.field2634;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field516 == null ? -1 : arg0.field516.field2624;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field516 == null ? -1 : arg0.field516.field2634;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field521;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field511;
                    }
                    Statics.field1017[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field510;
                    }
                    Statics.field1018[var11++] = var14;
                }
            }
            int var15 = 0;
            field1026 = arg0.field520;
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
                                                                                                                label249: while (true) {
                                                                                                                    var15++;
                                                                                                                    if (var15 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var6++;
                                                                                                                    int var59 = var7[var6];
                                                                                                                    if (var59 >= 100) {
                                                                                                                        boolean var53;
                                                                                                                        if (var4.field1217[var6] == 1) {
                                                                                                                            var53 = true;
                                                                                                                        } else {
                                                                                                                            var53 = false;
                                                                                                                        }
                                                                                                                        int var54 = method2859(var59, var4, var53);
                                                                                                                        switch(var54) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var59 == 0) {
                                                                                                                        field1027[++Statics.field378 - 1] = var8[var6];
                                                                                                                    } else if (var59 == 1) {
                                                                                                                        int var16 = var8[var6];
                                                                                                                        field1027[++Statics.field378 - 1] = class226.field2579[var16];
                                                                                                                    } else if (var59 == 2) {
                                                                                                                        int var17 = var8[var6];
                                                                                                                        class226.field2579[var17] = field1027[--Statics.field378];
                                                                                                                        client.method4169(var17);
                                                                                                                    } else if (var59 == 3) {
                                                                                                                        field1022[++Statics.field1208 - 1] = var4.field1213[var6];
                                                                                                                    } else if (var59 == 6) {
                                                                                                                        var6 += var8[var6];
                                                                                                                    } else if (var59 == 7) {
                                                                                                                        Statics.field378 -= 2;
                                                                                                                        if (field1027[Statics.field378] != field1027[Statics.field378 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 8) {
                                                                                                                        Statics.field378 -= 2;
                                                                                                                        if (field1027[Statics.field378] == field1027[Statics.field378 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 9) {
                                                                                                                        Statics.field378 -= 2;
                                                                                                                        if (field1027[Statics.field378] < field1027[Statics.field378 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 10) {
                                                                                                                        Statics.field378 -= 2;
                                                                                                                        if (field1027[Statics.field378] > field1027[Statics.field378 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 21) {
                                                                                                                        if (field1023 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class52 var18 = field1024[--field1023];
                                                                                                                        var4 = var18.field468;
                                                                                                                        var7 = var4.field1212;
                                                                                                                        var8 = var4.field1217;
                                                                                                                        var6 = var18.field465;
                                                                                                                        Statics.field1017 = var18.field466;
                                                                                                                        Statics.field1018 = var18.field467;
                                                                                                                    } else if (var59 == 25) {
                                                                                                                        int var19 = var8[var6];
                                                                                                                        field1027[++Statics.field378 - 1] = class226.method2926(var19);
                                                                                                                    } else if (var59 == 27) {
                                                                                                                        int var20 = var8[var6];
                                                                                                                        Statics.method3530(var20, field1027[--Statics.field378]);
                                                                                                                    } else if (var59 == 31) {
                                                                                                                        Statics.field378 -= 2;
                                                                                                                        if (field1027[Statics.field378] <= field1027[Statics.field378 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 32) {
                                                                                                                        Statics.field378 -= 2;
                                                                                                                        if (field1027[Statics.field378] >= field1027[Statics.field378 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 33) {
                                                                                                                        field1027[++Statics.field378 - 1] = Statics.field1017[var8[var6]];
                                                                                                                    } else if (var59 == 34) {
                                                                                                                        Statics.field1017[var8[var6]] = field1027[--Statics.field378];
                                                                                                                    } else if (var59 == 35) {
                                                                                                                        field1022[++Statics.field1208 - 1] = Statics.field1018[var8[var6]];
                                                                                                                    } else if (var59 == 36) {
                                                                                                                        Statics.field1018[var8[var6]] = field1022[--Statics.field1208];
                                                                                                                    } else if (var59 == 37) {
                                                                                                                        int var21 = var8[var6];
                                                                                                                        Statics.field1208 -= var21;
                                                                                                                        String[] var22 = field1022;
                                                                                                                        int var23 = Statics.field1208;
                                                                                                                        String var24;
                                                                                                                        if (var21 == 0) {
                                                                                                                            var24 = "";
                                                                                                                        } else if (var21 == 1) {
                                                                                                                            String var25 = var22[var23];
                                                                                                                            if (var25 == null) {
                                                                                                                                var24 = "null";
                                                                                                                            } else {
                                                                                                                                var24 = var25.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var26 = var21 + var23;
                                                                                                                            int var27 = 0;
                                                                                                                            for (int var28 = var23; var28 < var26; var28++) {
                                                                                                                                String var29 = var22[var28];
                                                                                                                                if (var29 == null) {
                                                                                                                                    var27 += 4;
                                                                                                                                } else {
                                                                                                                                    var27 += var29.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var30 = new StringBuilder(var27);
                                                                                                                            for (int var31 = var23; var31 < var26; var31++) {
                                                                                                                                String var32 = var22[var31];
                                                                                                                                if (var32 == null) {
                                                                                                                                    var30.append("null");
                                                                                                                                } else {
                                                                                                                                    var30.append(var32);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var24 = var30.toString();
                                                                                                                        }
                                                                                                                        field1022[++Statics.field1208 - 1] = var24;
                                                                                                                    } else if (var59 == 38) {
                                                                                                                        Statics.field378--;
                                                                                                                    } else if (var59 == 39) {
                                                                                                                        Statics.field1208--;
                                                                                                                    } else if (var59 == 40) {
                                                                                                                        int var34 = var8[var6];
                                                                                                                        class85 var35 = class85.method1689(var34);
                                                                                                                        int[] var36 = new int[var35.field1214];
                                                                                                                        String[] var37 = new String[var35.field1211];
                                                                                                                        for (int var38 = 0; var38 < var35.field1216; var38++) {
                                                                                                                            var36[var38] = field1027[Statics.field378 - var35.field1216 + var38];
                                                                                                                        }
                                                                                                                        for (int var39 = 0; var39 < var35.field1210; var39++) {
                                                                                                                            var37[var39] = field1022[Statics.field1208 - var35.field1210 + var39];
                                                                                                                        }
                                                                                                                        Statics.field378 -= var35.field1216;
                                                                                                                        Statics.field1208 -= var35.field1210;
                                                                                                                        class52 var40 = new class52();
                                                                                                                        var40.field468 = var4;
                                                                                                                        var40.field465 = var6;
                                                                                                                        var40.field466 = Statics.field1017;
                                                                                                                        var40.field467 = Statics.field1018;
                                                                                                                        field1024[++field1023 - 1] = var40;
                                                                                                                        var4 = var35;
                                                                                                                        var7 = var35.field1212;
                                                                                                                        var8 = var35.field1217;
                                                                                                                        var6 = -1;
                                                                                                                        Statics.field1017 = var36;
                                                                                                                        Statics.field1018 = var37;
                                                                                                                    } else if (var59 == 42) {
                                                                                                                        field1027[++Statics.field378 - 1] = Statics.field3145.method1784(var8[var6]);
                                                                                                                    } else if (var59 == 43) {
                                                                                                                        Statics.field3145.method1812(var8[var6], field1027[--Statics.field378]);
                                                                                                                    } else if (var59 == 44) {
                                                                                                                        int var41 = var8[var6] >> 16;
                                                                                                                        int var42 = var8[var6] & 0xFFFF;
                                                                                                                        int var43 = field1027[--Statics.field378];
                                                                                                                        if (var43 >= 0 && var43 <= 5000) {
                                                                                                                            field1020[var41] = var43;
                                                                                                                            byte var44 = -1;
                                                                                                                            if (var42 == 105) {
                                                                                                                                var44 = 0;
                                                                                                                            }
                                                                                                                            int var45 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var45 >= var43) {
                                                                                                                                    continue label249;
                                                                                                                                }
                                                                                                                                field1016[var41][var45] = var44;
                                                                                                                                var45++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var59 == 45) {
                                                                                                                        int var46 = var8[var6];
                                                                                                                        int var47 = field1027[--Statics.field378];
                                                                                                                        if (var47 < 0 || var47 >= field1020[var46]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1027[++Statics.field378 - 1] = field1016[var46][var47];
                                                                                                                    } else if (var59 == 46) {
                                                                                                                        int var48 = var8[var6];
                                                                                                                        Statics.field378 -= 2;
                                                                                                                        int var49 = field1027[Statics.field378];
                                                                                                                        if (var49 < 0 || var49 >= field1020[var48]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1016[var48][var49] = field1027[Statics.field378 + 1];
                                                                                                                    } else if (var59 == 47) {
                                                                                                                        String var50 = Statics.field3145.method1787(var8[var6]);
                                                                                                                        if (var50 == null) {
                                                                                                                            var50 = class238.field2821;
                                                                                                                        }
                                                                                                                        field1022[++Statics.field1208 - 1] = var50;
                                                                                                                    } else if (var59 == 48) {
                                                                                                                        Statics.field3145.method1786(var8[var6], field1022[--Statics.field1208]);
                                                                                                                    } else if (var59 == 60) {
                                                                                                                        class198 var51 = var4.field1218[var8[var6]];
                                                                                                                        class212 var52 = (class212) var51.method3675((long) field1027[--Statics.field378]);
                                                                                                                        if (var52 != null) {
                                                                                                                            var6 += var52.field2465;
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
        } catch (Exception var58) {
            StringBuilder var56 = new StringBuilder(30);
            var56.append("").append(var4.field2450).append(" ");
            for (int var57 = field1023 - 1; var57 >= 0; var57--) {
                var56.append("").append(field1024[var57].field468.field2450).append(" ");
            }
            var56.append("").append(var9);
            class153.method695(var56.toString(), var58);
        }
    }

    @ObfuscatedName("db.q(ILcs;ZI)I")
    public static int method2859(int arg0, class85 arg1, boolean arg2) {
        if (arg0 < 1000) {
            byte var10;
            if (arg0 == 100) {
                Statics.field378 -= 3;
                int var3 = field1027[Statics.field378];
                int var4 = field1027[Statics.field378 + 1];
                int var5 = field1027[Statics.field378 + 2];
                if (var4 == 0) {
                    throw new RuntimeException();
                }
                class231 var6 = class231.method1097(var3);
                if (var6.field2627 == null) {
                    var6.field2627 = new class231[var5 + 1];
                }
                if (var6.field2627.length <= var5) {
                    class231[] var7 = new class231[var5 + 1];
                    for (int var8 = 0; var8 < var6.field2627.length; var8++) {
                        var7[var8] = var6.field2627[var8];
                    }
                    var6.field2627 = var7;
                }
                if (var5 > 0 && var6.field2627[var5 - 1] == null) {
                    throw new RuntimeException("" + (var5 - 1));
                }
                class231 var9 = new class231();
                var9.field2626 = var4;
                var9.field2643 = var9.field2624 = var6.field2624;
                var9.field2634 = var5;
                var9.field2623 = true;
                var6.field2627[var5] = var9;
                if (arg2) {
                    Statics.field2380 = var9;
                } else {
                    Statics.field997 = var9;
                }
                client.method3242(var6);
                var10 = 1;
            } else if (arg0 == 101) {
                class231 var11 = arg2 ? Statics.field2380 : Statics.field997;
                class231 var12 = class231.method1097(var11.field2624);
                var12.field2627[var11.field2634] = null;
                client.method3242(var12);
                var10 = 1;
            } else if (arg0 == 102) {
                class231 var13 = class231.method1097(field1027[--Statics.field378]);
                var13.field2627 = null;
                client.method3242(var13);
                var10 = 1;
            } else if (arg0 == 200) {
                Statics.field378 -= 2;
                int var14 = field1027[Statics.field378];
                int var15 = field1027[Statics.field378 + 1];
                class231 var16 = class231.method282(var14, var15);
                if (var16 == null || var15 == -1) {
                    field1027[++Statics.field378 - 1] = 0;
                } else {
                    field1027[++Statics.field378 - 1] = 1;
                    if (arg2) {
                        Statics.field2380 = var16;
                    } else {
                        Statics.field997 = var16;
                    }
                }
                var10 = 1;
            } else if (arg0 == 201) {
                class231 var17 = class231.method1097(field1027[--Statics.field378]);
                if (var17 == null) {
                    field1027[++Statics.field378 - 1] = 0;
                } else {
                    field1027[++Statics.field378 - 1] = 1;
                    if (arg2) {
                        Statics.field2380 = var17;
                    } else {
                        Statics.field997 = var17;
                    }
                }
                var10 = 1;
            } else {
                var10 = 2;
            }
            return var10;
        } else if (arg0 < 1100) {
            return method1901(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2905(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method971(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method1705(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method999(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method1802(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method975(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method442(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            class231 var18 = arg2 ? Statics.field2380 : Statics.field997;
            byte var23;
            if (arg0 == 1800) {
                int[] var19 = field1027;
                int var20 = ++Statics.field378 - 1;
                int var21 = client.method2080(var18);
                int var22 = var21 >> 11 & 0x3F;
                var19[var20] = var22;
                var23 = 1;
            } else if (arg0 == 1801) {
                int var24 = field1027[--Statics.field378];
                int var312 = var24 - 1;
                if (var18.field2699 == null || var312 >= var18.field2699.length || var18.field2699[var312] == null) {
                    field1022[++Statics.field1208 - 1] = "";
                } else {
                    field1022[++Statics.field1208 - 1] = var18.field2699[var312];
                }
                var23 = 1;
            } else if (arg0 == 1802) {
                if (var18.field2698 == null) {
                    field1022[++Statics.field1208 - 1] = "";
                } else {
                    field1022[++Statics.field1208 - 1] = var18.field2698;
                }
                var23 = 1;
            } else {
                var23 = 2;
            }
            return var23;
        } else if (arg0 < 2000) {
            int var25 = arg0;
            class231 var26;
            if (arg0 >= 2000) {
                var25 = arg0 - 1000;
                var26 = class231.method1097(field1027[--Statics.field378]);
            } else {
                var26 = arg2 ? Statics.field2380 : Statics.field997;
            }
            byte var27;
            if (var25 == 1927) {
                if (field1026 >= 10) {
                    throw new RuntimeException();
                }
                if (var26.field2746 == null) {
                    var27 = 0;
                } else {
                    class57 var28 = new class57();
                    var28.field512 = var26;
                    var28.field526 = var26.field2746;
                    var28.field520 = field1026 + 1;
                    client.field756.method3810(var28);
                    var27 = 1;
                }
            } else {
                var27 = 2;
            }
            return var27;
        } else if (arg0 < 2100) {
            return method1901(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2905(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method971(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method1705(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method999(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            class231 var29 = class231.method1097(field1027[--Statics.field378]);
            byte var30;
            if (arg0 == 2500) {
                field1027[++Statics.field378 - 1] = var29.field2637;
                var30 = 1;
            } else if (arg0 == 2501) {
                field1027[++Statics.field378 - 1] = var29.field2638;
                var30 = 1;
            } else if (arg0 == 2502) {
                field1027[++Statics.field378 - 1] = var29.field2628;
                var30 = 1;
            } else if (arg0 == 2503) {
                field1027[++Statics.field378 - 1] = var29.field2640;
                var30 = 1;
            } else if (arg0 == 2504) {
                field1027[++Statics.field378 - 1] = var29.field2644 ? 1 : 0;
                var30 = 1;
            } else if (arg0 == 2505) {
                field1027[++Statics.field378 - 1] = var29.field2643;
                var30 = 1;
            } else {
                var30 = 2;
            }
            return var30;
        } else if (arg0 < 2700) {
            return method532(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            byte var32;
            if (arg0 == 2700) {
                class231 var31 = class231.method1097(field1027[--Statics.field378]);
                field1027[++Statics.field378 - 1] = var31.field2755;
                var32 = 1;
            } else if (arg0 == 2701) {
                class231 var33 = class231.method1097(field1027[--Statics.field378]);
                if (var33.field2755 == -1) {
                    field1027[++Statics.field378 - 1] = 0;
                } else {
                    field1027[++Statics.field378 - 1] = var33.field2678;
                }
                var32 = 1;
            } else if (arg0 == 2702) {
                int var34 = field1027[--Statics.field378];
                class56 var35 = (class56) client.field827.method3748((long) var34);
                if (var35 == null) {
                    field1027[++Statics.field378 - 1] = 0;
                } else {
                    field1027[++Statics.field378 - 1] = 1;
                }
                var32 = 1;
            } else if (arg0 == 2706) {
                field1027[++Statics.field378 - 1] = client.field753;
                var32 = 1;
            } else {
                var32 = 2;
            }
            return var32;
        } else if (arg0 < 2900) {
            class231 var36 = class231.method1097(field1027[--Statics.field378]);
            byte var41;
            if (arg0 == 2800) {
                int[] var37 = field1027;
                int var38 = ++Statics.field378 - 1;
                int var39 = client.method2080(var36);
                int var40 = var39 >> 11 & 0x3F;
                var37[var38] = var40;
                var41 = 1;
            } else if (arg0 == 2801) {
                int var42 = field1027[--Statics.field378];
                int var313 = var42 - 1;
                if (var36.field2699 == null || var313 >= var36.field2699.length || var36.field2699[var313] == null) {
                    field1022[++Statics.field1208 - 1] = "";
                } else {
                    field1022[++Statics.field1208 - 1] = var36.field2699[var313];
                }
                var41 = 1;
            } else if (arg0 == 2802) {
                if (var36.field2698 == null) {
                    field1022[++Statics.field1208 - 1] = "";
                } else {
                    field1022[++Statics.field1208 - 1] = var36.field2698;
                }
                var41 = 1;
            } else {
                var41 = 2;
            }
            return var41;
        } else if (arg0 < 3000) {
            return method2113(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method483(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method1027(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            byte var43;
            if (arg0 == 3300) {
                field1027[++Statics.field378 - 1] = client.field680;
                var43 = 1;
            } else if (arg0 == 3301) {
                Statics.field378 -= 2;
                int var44 = field1027[Statics.field378];
                int var45 = field1027[Statics.field378 + 1];
                int[] var46 = field1027;
                int var47 = ++Statics.field378 - 1;
                class54 var48 = (class54) class54.field479.method3748((long) var44);
                int var49;
                if (var48 == null) {
                    var49 = -1;
                } else if (var45 >= 0 && var45 < var48.field483.length) {
                    var49 = var48.field483[var45];
                } else {
                    var49 = -1;
                }
                var46[var47] = var49;
                var43 = 1;
            } else if (arg0 == 3302) {
                Statics.field378 -= 2;
                int var50 = field1027[Statics.field378];
                int var51 = field1027[Statics.field378 + 1];
                int[] var52 = field1027;
                int var53 = ++Statics.field378 - 1;
                class54 var54 = (class54) class54.field479.method3748((long) var50);
                int var55;
                if (var54 == null) {
                    var55 = 0;
                } else if (var51 >= 0 && var51 < var54.field481.length) {
                    var55 = var54.field481[var51];
                } else {
                    var55 = 0;
                }
                var52[var53] = var55;
                var43 = 1;
            } else if (arg0 == 3303) {
                Statics.field378 -= 2;
                int var56 = field1027[Statics.field378];
                int var57 = field1027[Statics.field378 + 1];
                int[] var58 = field1027;
                int var59 = ++Statics.field378 - 1;
                class54 var60 = (class54) class54.field479.method3748((long) var56);
                int var61;
                if (var60 == null) {
                    var61 = 0;
                } else if (var57 == -1) {
                    var61 = 0;
                } else {
                    int var62 = 0;
                    for (int var63 = 0; var63 < var60.field481.length; var63++) {
                        if (var60.field483[var63] == var57) {
                            var62 += var60.field481[var63];
                        }
                    }
                    var61 = var62;
                }
                var58[var59] = var61;
                var43 = 1;
            } else if (arg0 == 3304) {
                int var64 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = class254.method4246(var64).field3250;
                var43 = 1;
            } else if (arg0 == 3305) {
                int var65 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = client.field725[var65];
                var43 = 1;
            } else if (arg0 == 3306) {
                int var66 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = client.field726[var66];
                var43 = 1;
            } else if (arg0 == 3307) {
                int var67 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = client.field765[var67];
                var43 = 1;
            } else if (arg0 == 3308) {
                int var68 = Statics.field2416;
                int var69 = (Statics.field1949.field901 >> 7) + Statics.field2316;
                int var70 = (Statics.field1949.field919 >> 7) + Statics.field1052;
                field1027[++Statics.field378 - 1] = (var68 << 28) + (var69 << 14) + var70;
                var43 = 1;
            } else if (arg0 == 3309) {
                int var71 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = var71 >> 14 & 0x3FFF;
                var43 = 1;
            } else if (arg0 == 3310) {
                int var72 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = var72 >> 28;
                var43 = 1;
            } else if (arg0 == 3311) {
                int var73 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = var73 & 0x3FFF;
                var43 = 1;
            } else if (arg0 == 3312) {
                field1027[++Statics.field378 - 1] = client.field629 ? 1 : 0;
                var43 = 1;
            } else if (arg0 == 3313) {
                Statics.field378 -= 2;
                int var74 = field1027[Statics.field378] + 32768;
                int var75 = field1027[Statics.field378 + 1];
                int[] var76 = field1027;
                int var77 = ++Statics.field378 - 1;
                class54 var78 = (class54) class54.field479.method3748((long) var74);
                int var79;
                if (var78 == null) {
                    var79 = -1;
                } else if (var75 >= 0 && var75 < var78.field483.length) {
                    var79 = var78.field483[var75];
                } else {
                    var79 = -1;
                }
                var76[var77] = var79;
                var43 = 1;
            } else if (arg0 == 3314) {
                Statics.field378 -= 2;
                int var80 = field1027[Statics.field378] + 32768;
                int var81 = field1027[Statics.field378 + 1];
                int[] var82 = field1027;
                int var83 = ++Statics.field378 - 1;
                class54 var84 = (class54) class54.field479.method3748((long) var80);
                int var85;
                if (var84 == null) {
                    var85 = 0;
                } else if (var81 >= 0 && var81 < var84.field481.length) {
                    var85 = var84.field481[var81];
                } else {
                    var85 = 0;
                }
                var82[var83] = var85;
                var43 = 1;
            } else if (arg0 == 3315) {
                Statics.field378 -= 2;
                int var86 = field1027[Statics.field378] + 32768;
                int var87 = field1027[Statics.field378 + 1];
                int[] var88 = field1027;
                int var89 = ++Statics.field378 - 1;
                class54 var90 = (class54) class54.field479.method3748((long) var86);
                int var91;
                if (var90 == null) {
                    var91 = 0;
                } else if (var87 == -1) {
                    var91 = 0;
                } else {
                    int var92 = 0;
                    for (int var93 = 0; var93 < var90.field481.length; var93++) {
                        if (var90.field483[var93] == var87) {
                            var92 += var90.field481[var93];
                        }
                    }
                    var91 = var92;
                }
                var88[var89] = var91;
                var43 = 1;
            } else if (arg0 == 3316) {
                if (client.field730 >= 2) {
                    field1027[++Statics.field378 - 1] = client.field730;
                } else {
                    field1027[++Statics.field378 - 1] = 0;
                }
                var43 = 1;
            } else if (arg0 == 3317) {
                field1027[++Statics.field378 - 1] = client.field644;
                var43 = 1;
            } else if (arg0 == 3318) {
                field1027[++Statics.field378 - 1] = client.field677;
                var43 = 1;
            } else if (arg0 == 3321) {
                field1027[++Statics.field378 - 1] = client.field758;
                var43 = 1;
            } else if (arg0 == 3322) {
                field1027[++Statics.field378 - 1] = client.field759;
                var43 = 1;
            } else if (arg0 == 3323) {
                if (client.field762) {
                    field1027[++Statics.field378 - 1] = 1;
                } else {
                    field1027[++Statics.field378 - 1] = 0;
                }
                var43 = 1;
            } else if (arg0 == 3324) {
                field1027[++Statics.field378 - 1] = client.field727;
                var43 = 1;
            } else if (arg0 == 3325) {
                Statics.field378 -= 4;
                int var94 = field1027[Statics.field378];
                int var95 = field1027[Statics.field378 + 1];
                int var96 = field1027[Statics.field378 + 2];
                int var97 = field1027[Statics.field378 + 3];
                int var98 = (var95 << 14) + var94;
                int var99 = (var96 << 28) + var98;
                int var100 = var97 + var99;
                field1027[++Statics.field378 - 1] = var100;
                var43 = 1;
            } else {
                var43 = 2;
            }
            return var43;
        } else if (arg0 < 3500) {
            byte var105;
            if (arg0 == 3400) {
                Statics.field378 -= 2;
                int var101 = field1027[Statics.field378];
                int var102 = field1027[Statics.field378 + 1];
                class267 var103 = class267.method972(var101);
                if (var103.field3356 != 's') {
                }
                for (int var104 = 0; var104 < var103.field3361; var104++) {
                    if (var103.field3360[var104] == var102) {
                        field1022[++Statics.field1208 - 1] = var103.field3364[var104];
                        var103 = null;
                        break;
                    }
                }
                if (var103 != null) {
                    field1022[++Statics.field1208 - 1] = var103.field3359;
                }
                var105 = 1;
            } else if (arg0 == 3408) {
                Statics.field378 -= 4;
                int var106 = field1027[Statics.field378];
                int var107 = field1027[Statics.field378 + 1];
                int var108 = field1027[Statics.field378 + 2];
                int var109 = field1027[Statics.field378 + 3];
                class267 var110 = class267.method972(var108);
                if (var110.field3358 == var106 && var110.field3356 == var107) {
                    for (int var111 = 0; var111 < var110.field3361; var111++) {
                        if (var110.field3360[var111] == var109) {
                            if (var107 == 115) {
                                field1022[++Statics.field1208 - 1] = var110.field3364[var111];
                            } else {
                                field1027[++Statics.field378 - 1] = var110.field3363[var111];
                            }
                            var110 = null;
                            break;
                        }
                    }
                    if (var110 != null) {
                        if (var107 == 115) {
                            field1022[++Statics.field1208 - 1] = var110.field3359;
                        } else {
                            field1027[++Statics.field378 - 1] = var110.field3362;
                        }
                    }
                    var105 = 1;
                } else {
                    if (var107 == 115) {
                        field1022[++Statics.field1208 - 1] = class238.field2821;
                    } else {
                        field1027[++Statics.field378 - 1] = 0;
                    }
                    var105 = 1;
                }
            } else if (arg0 == 3411) {
                int var112 = field1027[--Statics.field378];
                class267 var113 = class267.method972(var112);
                field1027[++Statics.field378 - 1] = var113.method4611();
                var105 = 1;
            } else {
                var105 = 2;
            }
            return var105;
        } else if (arg0 < 3700) {
            return method3159(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            byte var115;
            if (arg0 == 3903) {
                int var114 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = client.field857[var114].method43();
                var115 = 1;
            } else if (arg0 == 3904) {
                int var116 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = client.field857[var116].field27;
                var115 = 1;
            } else if (arg0 == 3905) {
                int var117 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = client.field857[var117].field28;
                var115 = 1;
            } else if (arg0 == 3906) {
                int var118 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = client.field857[var118].field29;
                var115 = 1;
            } else if (arg0 == 3907) {
                int var119 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = client.field857[var119].field30;
                var115 = 1;
            } else if (arg0 == 3908) {
                int var120 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = client.field857[var120].field31;
                var115 = 1;
            } else if (arg0 == 3910) {
                int var121 = field1027[--Statics.field378];
                int var122 = client.field857[var121].method39();
                field1027[++Statics.field378 - 1] = var122 == 0 ? 1 : 0;
                var115 = 1;
            } else if (arg0 == 3911) {
                int var123 = field1027[--Statics.field378];
                int var124 = client.field857[var123].method39();
                field1027[++Statics.field378 - 1] = var124 == 2 ? 1 : 0;
                var115 = 1;
            } else if (arg0 == 3912) {
                int var125 = field1027[--Statics.field378];
                int var126 = client.field857[var125].method39();
                field1027[++Statics.field378 - 1] = var126 == 5 ? 1 : 0;
                var115 = 1;
            } else if (arg0 == 3913) {
                int var127 = field1027[--Statics.field378];
                int var128 = client.field857[var127].method39();
                field1027[++Statics.field378 - 1] = var128 == 1 ? 1 : 0;
                var115 = 1;
            } else if (arg0 == 3914) {
                boolean var129 = field1027[--Statics.field378] == 1;
                if (Statics.field2292 != null) {
                    Statics.field2292.method12(class2.field9, var129);
                }
                var115 = 1;
            } else if (arg0 == 3915) {
                boolean var130 = field1027[--Statics.field378] == 1;
                if (Statics.field2292 != null) {
                    Statics.field2292.method12(class2.field8, var130);
                }
                var115 = 1;
            } else if (arg0 == 3916) {
                Statics.field378 -= 2;
                boolean var131 = field1027[Statics.field378] == 1;
                boolean var132 = field1027[Statics.field378 + 1] == 1;
                if (Statics.field2292 != null) {
                    client.field739.field592 = var132;
                    Statics.field2292.method12(client.field739, var131);
                }
                var115 = 1;
            } else if (arg0 == 3917) {
                boolean var133 = field1027[--Statics.field378] == 1;
                if (Statics.field2292 != null) {
                    Statics.field2292.method12(class2.field6, var133);
                }
                var115 = 1;
            } else if (arg0 == 3918) {
                boolean var134 = field1027[--Statics.field378] == 1;
                if (Statics.field2292 != null) {
                    Statics.field2292.method12(class2.field10, var134);
                }
                var115 = 1;
            } else if (arg0 == 3919) {
                field1027[++Statics.field378 - 1] = Statics.field2292 == null ? 0 : Statics.field2292.field7.size();
                var115 = 1;
            } else if (arg0 == 3920) {
                int var135 = field1027[--Statics.field378];
                class3 var136 = (class3) Statics.field2292.field7.get(var135);
                field1027[++Statics.field378 - 1] = var136.field18;
                var115 = 1;
            } else if (arg0 == 3921) {
                int var137 = field1027[--Statics.field378];
                class3 var138 = (class3) Statics.field2292.field7.get(var137);
                field1022[++Statics.field1208 - 1] = var138.method17();
                var115 = 1;
            } else if (arg0 == 3922) {
                int var139 = field1027[--Statics.field378];
                class3 var140 = (class3) Statics.field2292.field7.get(var139);
                field1022[++Statics.field1208 - 1] = var140.method18();
                var115 = 1;
            } else if (arg0 == 3923) {
                int var141 = field1027[--Statics.field378];
                class3 var142 = (class3) Statics.field2292.field7.get(var141);
                long var143 = class185.method3151() - Statics.field630 - var142.field11;
                int var145 = (int) (var143 / 3600000L);
                int var146 = (int) ((var143 - (long) (var145 * 3600000)) / 60000L);
                int var147 = (int) ((var143 - (long) (var145 * 3600000) - (long) (var146 * 60000)) / 1000L);
                String var148 = var145 + ":" + var146 / 10 + var146 % 10 + ":" + var147 / 10 + var147 % 10;
                field1022[++Statics.field1208 - 1] = var148;
                var115 = 1;
            } else if (arg0 == 3924) {
                int var149 = field1027[--Statics.field378];
                class3 var150 = (class3) Statics.field2292.field7.get(var149);
                field1027[++Statics.field378 - 1] = var150.field14.field29;
                var115 = 1;
            } else if (arg0 == 3925) {
                int var151 = field1027[--Statics.field378];
                class3 var152 = (class3) Statics.field2292.field7.get(var151);
                field1027[++Statics.field378 - 1] = var152.field14.field28;
                var115 = 1;
            } else if (arg0 == 3926) {
                int var153 = field1027[--Statics.field378];
                class3 var154 = (class3) Statics.field2292.field7.get(var153);
                field1027[++Statics.field378 - 1] = var154.field14.field27;
                var115 = 1;
            } else {
                var115 = 2;
            }
            return var115;
        } else if (arg0 < 4100) {
            return method2861(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method2404(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method1545(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            byte var155;
            if (arg0 == 5000) {
                field1027[++Statics.field378 - 1] = client.field852;
                var155 = 1;
            } else if (arg0 == 5001) {
                Statics.field378 -= 3;
                client.field852 = field1027[Statics.field378];
                int var156 = field1027[Statics.field378 + 1];
                class308[] var157 = class308.method2994();
                int var158 = 0;
                class308 var160;
                while (true) {
                    if (var158 >= var157.length) {
                        var160 = null;
                        break;
                    }
                    class308 var159 = var157[var158];
                    if (var159.field3742 == var156) {
                        var160 = var159;
                        break;
                    }
                    var158++;
                }
                Statics.field171 = var160;
                if (Statics.field171 == null) {
                    Statics.field171 = class308.field3741;
                }
                client.field695 = field1027[Statics.field378 + 2];
                class173 var161 = class173.method2882(class170.field2220, client.field740.field1251);
                var161.field2280.method3246(client.field852);
                var161.field2280.method3246(Statics.field171.field3742);
                var161.field2280.method3246(client.field695);
                client.field740.method1873(var161);
                var155 = 1;
            } else if (arg0 == 5002) {
                String var162 = field1022[--Statics.field1208];
                Statics.field378 -= 2;
                int var163 = field1027[Statics.field378];
                int var164 = field1027[Statics.field378 + 1];
                class173 var165 = class173.method2882(class170.field2249, client.field740.field1251);
                var165.field2280.method3246(class183.method124(var162) + 2);
                var165.field2280.method3243(var162);
                var165.field2280.method3246(var163 - 1);
                var165.field2280.method3246(var164);
                client.field740.method1873(var165);
                var155 = 1;
            } else if (arg0 == 5003) {
                Statics.field378 -= 2;
                int var166 = field1027[Statics.field378];
                int var167 = field1027[Statics.field378 + 1];
                class87 var168 = (class87) class84.field1205.get(var166);
                class59 var169 = var168.method1867(var167);
                if (var169 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = 0;
                    field1022[++Statics.field1208 - 1] = "";
                    field1022[++Statics.field1208 - 1] = "";
                    field1022[++Statics.field1208 - 1] = "";
                    field1027[++Statics.field378 - 1] = 0;
                } else {
                    field1027[++Statics.field378 - 1] = var169.field547;
                    field1027[++Statics.field378 - 1] = var169.field538;
                    field1022[++Statics.field1208 - 1] = var169.field540 == null ? "" : var169.field540;
                    field1022[++Statics.field1208 - 1] = var169.field543 == null ? "" : var169.field543;
                    field1022[++Statics.field1208 - 1] = var169.field545 == null ? "" : var169.field545;
                    field1027[++Statics.field378 - 1] = var169.method1005() ? 1 : (var169.method1008() ? 2 : 0);
                }
                var155 = 1;
            } else if (arg0 == 5004) {
                int var171 = field1027[--Statics.field378];
                class59 var172 = (class59) class84.field1204.method3675((long) var171);
                if (var172 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = 0;
                    field1022[++Statics.field1208 - 1] = "";
                    field1022[++Statics.field1208 - 1] = "";
                    field1022[++Statics.field1208 - 1] = "";
                    field1027[++Statics.field378 - 1] = 0;
                } else {
                    field1027[++Statics.field378 - 1] = var172.field539;
                    field1027[++Statics.field378 - 1] = var172.field538;
                    field1022[++Statics.field1208 - 1] = var172.field540 == null ? "" : var172.field540;
                    field1022[++Statics.field1208 - 1] = var172.field543 == null ? "" : var172.field543;
                    field1022[++Statics.field1208 - 1] = var172.field545 == null ? "" : var172.field545;
                    field1027[++Statics.field378 - 1] = var172.method1005() ? 1 : (var172.method1008() ? 2 : 0);
                }
                var155 = 1;
            } else if (arg0 == 5005) {
                if (Statics.field171 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                } else {
                    field1027[++Statics.field378 - 1] = Statics.field171.field3742;
                }
                var155 = 1;
            } else if (arg0 == 5008) {
                String var174 = field1022[--Statics.field1208];
                int var175 = field1027[--Statics.field378];
                String var176 = var174.toLowerCase();
                byte var177 = 0;
                if (var176.startsWith(class238.field3021)) {
                    var177 = 0;
                    var174 = var174.substring(class238.field3021.length());
                } else if (var176.startsWith(class238.field2988)) {
                    var177 = 1;
                    var174 = var174.substring(class238.field2988.length());
                } else if (var176.startsWith(class238.field2834)) {
                    var177 = 2;
                    var174 = var174.substring(class238.field2834.length());
                } else if (var176.startsWith(class238.field3090)) {
                    var177 = 3;
                    var174 = var174.substring(class238.field3090.length());
                } else if (var176.startsWith(class238.field3037)) {
                    var177 = 4;
                    var174 = var174.substring(class238.field3037.length());
                } else if (var176.startsWith(class238.field3001)) {
                    var177 = 5;
                    var174 = var174.substring(class238.field3001.length());
                } else if (var176.startsWith(class238.field3003)) {
                    var177 = 6;
                    var174 = var174.substring(class238.field3003.length());
                } else if (var176.startsWith(class238.field3005)) {
                    var177 = 7;
                    var174 = var174.substring(class238.field3005.length());
                } else if (var176.startsWith(class238.field3007)) {
                    var177 = 8;
                    var174 = var174.substring(class238.field3007.length());
                } else if (var176.startsWith(class238.field3009)) {
                    var177 = 9;
                    var174 = var174.substring(class238.field3009.length());
                } else if (var176.startsWith(class238.field3028)) {
                    var177 = 10;
                    var174 = var174.substring(class238.field3028.length());
                } else if (var176.startsWith(class238.field3013)) {
                    var177 = 11;
                    var174 = var174.substring(class238.field3013.length());
                } else if (client.field600 != 0) {
                    if (var176.startsWith(class238.field2992)) {
                        var177 = 0;
                        var174 = var174.substring(class238.field2992.length());
                    } else if (var176.startsWith(class238.field2994)) {
                        var177 = 1;
                        var174 = var174.substring(class238.field2994.length());
                    } else if (var176.startsWith(class238.field2996)) {
                        var177 = 2;
                        var174 = var174.substring(class238.field2996.length());
                    } else if (var176.startsWith(class238.field2998)) {
                        var177 = 3;
                        var174 = var174.substring(class238.field2998.length());
                    } else if (var176.startsWith(class238.field2950)) {
                        var177 = 4;
                        var174 = var174.substring(class238.field2950.length());
                    } else if (var176.startsWith(class238.field3002)) {
                        var177 = 5;
                        var174 = var174.substring(class238.field3002.length());
                    } else if (var176.startsWith(class238.field3004)) {
                        var177 = 6;
                        var174 = var174.substring(class238.field3004.length());
                    } else if (var176.startsWith(class238.field3006)) {
                        var177 = 7;
                        var174 = var174.substring(class238.field3006.length());
                    } else if (var176.startsWith(class238.field2904)) {
                        var177 = 8;
                        var174 = var174.substring(class238.field2904.length());
                    } else if (var176.startsWith(class238.field3010)) {
                        var177 = 9;
                        var174 = var174.substring(class238.field3010.length());
                    } else if (var176.startsWith(class238.field3012)) {
                        var177 = 10;
                        var174 = var174.substring(class238.field3012.length());
                    } else if (var176.startsWith(class238.field3014)) {
                        var177 = 11;
                        var174 = var174.substring(class238.field3014.length());
                    }
                }
                String var178 = var174.toLowerCase();
                byte var179 = 0;
                if (var178.startsWith(class238.field3103)) {
                    var179 = 1;
                    var174 = var174.substring(class238.field3103.length());
                } else if (var178.startsWith(class238.field3017)) {
                    var179 = 2;
                    var174 = var174.substring(class238.field3017.length());
                } else if (var178.startsWith(class238.field3019)) {
                    var179 = 3;
                    var174 = var174.substring(class238.field3019.length());
                } else if (var178.startsWith(class238.field3034)) {
                    var179 = 4;
                    var174 = var174.substring(class238.field3034.length());
                } else if (var178.startsWith(class238.field3057)) {
                    var179 = 5;
                    var174 = var174.substring(class238.field3057.length());
                } else if (client.field600 != 0) {
                    if (var178.startsWith(class238.field3016)) {
                        var179 = 1;
                        var174 = var174.substring(class238.field3016.length());
                    } else if (var178.startsWith(class238.field3018)) {
                        var179 = 2;
                        var174 = var174.substring(class238.field3018.length());
                    } else if (var178.startsWith(class238.field3020)) {
                        var179 = 3;
                        var174 = var174.substring(class238.field3020.length());
                    } else if (var178.startsWith(class238.field3022)) {
                        var179 = 4;
                        var174 = var174.substring(class238.field3022.length());
                    } else if (var178.startsWith(class238.field3024)) {
                        var179 = 5;
                        var174 = var174.substring(class238.field3024.length());
                    }
                }
                class173 var180 = class173.method2882(class170.field2254, client.field740.field1251);
                var180.field2280.method3246(0);
                int var181 = var180.field2280.field2360;
                var180.field2280.method3246(var175);
                var180.field2280.method3246(var177);
                var180.field2280.method3246(var179);
                class190 var182 = var180.field2280;
                int var183 = var182.field2360;
                byte[] var184 = class302.method2968(var174);
                var182.method3308(var184.length);
                var182.field2360 += Statics.field3725.method3187(var184, 0, var184.length, var182.field2366, var182.field2360);
                var180.field2280.method3259(var180.field2280.field2360 - var181);
                client.field740.method1873(var180);
                var155 = 1;
            } else if (arg0 == 5009) {
                Statics.field1208 -= 2;
                String var185 = field1022[Statics.field1208];
                String var186 = field1022[Statics.field1208 + 1];
                class173 var187 = class173.method2882(class170.field2198, client.field740.field1251);
                var187.field2280.method3296(0);
                int var188 = var187.field2280.field2360;
                var187.field2280.method3243(var185);
                class190 var189 = var187.field2280;
                int var190 = var189.field2360;
                byte[] var191 = class302.method2968(var186);
                var189.method3308(var191.length);
                var189.field2360 += Statics.field3725.method3187(var191, 0, var191.length, var189.field2366, var189.field2360);
                var187.field2280.method3428(var187.field2280.field2360 - var188);
                client.field740.method1873(var187);
                var155 = 1;
            } else if (arg0 == 5015) {
                String var192;
                if (Statics.field1949 == null || Statics.field1949.field588 == null) {
                    var192 = "";
                } else {
                    var192 = Statics.field1949.field588.method5048();
                }
                field1022[++Statics.field1208 - 1] = var192;
                var155 = 1;
            } else if (arg0 == 5016) {
                field1027[++Statics.field378 - 1] = client.field695;
                var155 = 1;
            } else if (arg0 == 5017) {
                int var193 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = class84.method2682(var193);
                var155 = 1;
            } else if (arg0 == 5018) {
                int var194 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = class84.method158(var194);
                var155 = 1;
            } else if (arg0 == 5019) {
                int var195 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = class84.method1764(var195);
                var155 = 1;
            } else if (arg0 == 5020) {
                String var196 = field1022[--Statics.field1208];
                client.method2993(var196);
                var155 = 1;
            } else if (arg0 == 5021) {
                client.field809 = field1022[--Statics.field1208].toLowerCase().trim();
                var155 = 1;
            } else if (arg0 == 5022) {
                field1022[++Statics.field1208 - 1] = client.field809;
                var155 = 1;
            } else {
                var155 = 2;
            }
            return var155;
        } else if (arg0 < 5400) {
            byte var200;
            if (arg0 == 5306) {
                int[] var197 = field1027;
                int var198 = ++Statics.field378 - 1;
                int var199 = client.field676 ? 2 : 1;
                var197[var198] = var199;
                var200 = 1;
            } else if (arg0 == 5307) {
                int var201 = field1027[--Statics.field378];
                if (var201 == 1 || var201 == 2) {
                    client.field804 = 0L;
                    if (var201 >= 2) {
                        client.field676 = true;
                    } else {
                        client.field676 = false;
                    }
                    int var202 = client.field676 ? 2 : 1;
                    if (var202 == 1) {
                        Statics.field322.method805(765, 503);
                    } else {
                        Statics.field322.method805(7680, 2160);
                    }
                    if (client.field612 >= 25) {
                        class173 var203 = class173.method2882(class170.field2207, client.field740.field1251);
                        class190 var204 = var203.field2280;
                        int var205 = client.field676 ? 2 : 1;
                        var204.method3246(var205);
                        var203.field2280.method3296(Statics.field71);
                        var203.field2280.method3296(Statics.field327);
                        client.field740.method1873(var203);
                    }
                }
                var200 = 1;
            } else if (arg0 == 5308) {
                field1027[++Statics.field378 - 1] = Statics.field469.field980;
                var200 = 1;
            } else if (arg0 == 5309) {
                int var206 = field1027[--Statics.field378];
                if (var206 == 1 || var206 == 2) {
                    Statics.field469.field980 = var206;
                    class67.method4621();
                }
                var200 = 1;
            } else {
                var200 = 2;
            }
            return var200;
        } else if (arg0 < 5600) {
            byte var212;
            if (arg0 == 5504) {
                Statics.field378 -= 2;
                int var210 = field1027[Statics.field378];
                int var211 = field1027[Statics.field378 + 1];
                if (!client.field747) {
                    client.field633 = var210;
                    client.field663 = var211;
                }
                var212 = 1;
            } else if (arg0 == 5505) {
                field1027[++Statics.field378 - 1] = client.field633;
                var212 = 1;
            } else if (arg0 == 5506) {
                field1027[++Statics.field378 - 1] = client.field663;
                var212 = 1;
            } else if (arg0 == 5530) {
                int var213 = field1027[--Statics.field378];
                if (var213 < 0) {
                    var213 = 0;
                }
                client.field669 = var213;
                var212 = 1;
            } else if (arg0 == 5531) {
                field1027[++Statics.field378 - 1] = client.field669;
                var212 = 1;
            } else {
                var212 = 2;
            }
            return var212;
        } else if (arg0 < 5700) {
            byte var214;
            if (arg0 == 5630) {
                client.field689 = 250;
                var214 = 1;
            } else {
                var214 = 2;
            }
            return var214;
        } else if (arg0 < 6300) {
            byte var215;
            if (arg0 == 6200) {
                Statics.field378 -= 2;
                client.field746 = (short) field1027[Statics.field378];
                if (client.field746 <= 0) {
                    client.field746 = 256;
                }
                client.field842 = (short) field1027[Statics.field378 + 1];
                if (client.field842 <= 0) {
                    client.field842 = 205;
                }
                var215 = 1;
            } else if (arg0 == 6201) {
                Statics.field378 -= 2;
                client.field843 = (short) field1027[Statics.field378];
                if (client.field843 <= 0) {
                    client.field843 = 256;
                }
                client.field616 = (short) field1027[Statics.field378 + 1];
                if (client.field616 <= 0) {
                    client.field616 = 320;
                }
                var215 = 1;
            } else if (arg0 == 6202) {
                Statics.field378 -= 4;
                client.field845 = (short) field1027[Statics.field378];
                if (client.field845 <= 0) {
                    client.field845 = 1;
                }
                client.field864 = (short) field1027[Statics.field378 + 1];
                if (client.field864 <= 0) {
                    client.field864 = 32767;
                } else if (client.field864 < client.field845) {
                    client.field864 = client.field845;
                }
                client.field708 = (short) field1027[Statics.field378 + 2];
                if (client.field708 <= 0) {
                    client.field708 = 1;
                }
                client.field848 = (short) field1027[Statics.field378 + 3];
                if (client.field848 <= 0) {
                    client.field848 = 32767;
                } else if (client.field848 < client.field708) {
                    client.field848 = client.field708;
                }
                var215 = 1;
            } else if (arg0 == 6203) {
                if (client.field777 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = -1;
                } else {
                    client.method2880(0, 0, client.field777.field2628, client.field777.field2640, false);
                    field1027[++Statics.field378 - 1] = client.field835;
                    field1027[++Statics.field378 - 1] = client.field662;
                }
                var215 = 1;
            } else if (arg0 == 6204) {
                field1027[++Statics.field378 - 1] = client.field843;
                field1027[++Statics.field378 - 1] = client.field616;
                var215 = 1;
            } else if (arg0 == 6205) {
                field1027[++Statics.field378 - 1] = client.field746;
                field1027[++Statics.field378 - 1] = client.field842;
                var215 = 1;
            } else {
                var215 = 2;
            }
            return var215;
        } else if (arg0 < 6600) {
            byte var216;
            if (arg0 == 6500) {
                field1027[++Statics.field378 - 1] = class66.method4358() ? 1 : 0;
                var216 = 1;
            } else if (arg0 == 6501) {
                class66 var217 = class66.method5093();
                if (var217 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = 0;
                    field1022[++Statics.field1208 - 1] = "";
                    field1027[++Statics.field378 - 1] = 0;
                    field1027[++Statics.field378 - 1] = 0;
                    field1022[++Statics.field1208 - 1] = "";
                } else {
                    field1027[++Statics.field378 - 1] = var217.field961;
                    field1027[++Statics.field378 - 1] = var217.field962;
                    field1022[++Statics.field1208 - 1] = var217.field965;
                    field1027[++Statics.field378 - 1] = var217.field953;
                    field1027[++Statics.field378 - 1] = var217.field958;
                    field1022[++Statics.field1208 - 1] = var217.field964;
                }
                var216 = 1;
            } else if (arg0 == 6502) {
                class66 var218 = class66.method2491();
                if (var218 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = 0;
                    field1022[++Statics.field1208 - 1] = "";
                    field1027[++Statics.field378 - 1] = 0;
                    field1027[++Statics.field378 - 1] = 0;
                    field1022[++Statics.field1208 - 1] = "";
                } else {
                    field1027[++Statics.field378 - 1] = var218.field961;
                    field1027[++Statics.field378 - 1] = var218.field962;
                    field1022[++Statics.field1208 - 1] = var218.field965;
                    field1027[++Statics.field378 - 1] = var218.field953;
                    field1027[++Statics.field378 - 1] = var218.field958;
                    field1022[++Statics.field1208 - 1] = var218.field964;
                }
                var216 = 1;
            } else if (arg0 == 6506) {
                int var219 = field1027[--Statics.field378];
                class66 var220 = null;
                for (int var221 = 0; var221 < class66.field956; var221++) {
                    if (Statics.field1915[var221].field961 == var219) {
                        var220 = Statics.field1915[var221];
                        break;
                    }
                }
                if (var220 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = 0;
                    field1022[++Statics.field1208 - 1] = "";
                    field1027[++Statics.field378 - 1] = 0;
                    field1027[++Statics.field378 - 1] = 0;
                    field1022[++Statics.field1208 - 1] = "";
                } else {
                    field1027[++Statics.field378 - 1] = var220.field961;
                    field1027[++Statics.field378 - 1] = var220.field962;
                    field1022[++Statics.field1208 - 1] = var220.field965;
                    field1027[++Statics.field378 - 1] = var220.field953;
                    field1027[++Statics.field378 - 1] = var220.field958;
                    field1022[++Statics.field1208 - 1] = var220.field964;
                }
                var216 = 1;
            } else if (arg0 == 6507) {
                Statics.field378 -= 4;
                int var222 = field1027[Statics.field378];
                boolean var223 = field1027[Statics.field378 + 1] == 1;
                int var224 = field1027[Statics.field378 + 2];
                boolean var225 = field1027[Statics.field378 + 3] == 1;
                class66.method2927(var222, var223, var224, var225);
                var216 = 1;
            } else if (arg0 == 6511) {
                int var226 = field1027[--Statics.field378];
                if (var226 >= 0 && var226 < class66.field956) {
                    class66 var227 = Statics.field1915[var226];
                    field1027[++Statics.field378 - 1] = var227.field961;
                    field1027[++Statics.field378 - 1] = var227.field962;
                    field1022[++Statics.field1208 - 1] = var227.field965;
                    field1027[++Statics.field378 - 1] = var227.field953;
                    field1027[++Statics.field378 - 1] = var227.field958;
                    field1022[++Statics.field1208 - 1] = var227.field964;
                } else {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = 0;
                    field1022[++Statics.field1208 - 1] = "";
                    field1027[++Statics.field378 - 1] = 0;
                    field1027[++Statics.field378 - 1] = 0;
                    field1022[++Statics.field1208 - 1] = "";
                }
                var216 = 1;
            } else if (arg0 == 6512) {
                client.field754 = field1027[--Statics.field378] == 1;
                var216 = 1;
            } else if (arg0 == 6513) {
                Statics.field378 -= 2;
                int var228 = field1027[Statics.field378];
                int var229 = field1027[Statics.field378 + 1];
                class265 var230 = class265.method3505(var229);
                if (var230.method4569()) {
                    field1022[++Statics.field1208 - 1] = class272.method1034(var228).method4786(var229, var230.field3348);
                } else {
                    field1027[++Statics.field378 - 1] = class272.method1034(var228).method4807(var229, var230.field3349);
                }
                var216 = 1;
            } else if (arg0 == 6514) {
                Statics.field378 -= 2;
                int var231 = field1027[Statics.field378];
                int var232 = field1027[Statics.field378 + 1];
                class265 var233 = class265.method3505(var232);
                if (var233.method4569()) {
                    field1022[++Statics.field1208 - 1] = class269.method675(var231).method4670(var232, var233.field3348);
                } else {
                    field1027[++Statics.field378 - 1] = class269.method675(var231).method4691(var232, var233.field3349);
                }
                var216 = 1;
            } else if (arg0 == 6515) {
                Statics.field378 -= 2;
                int var234 = field1027[Statics.field378];
                int var235 = field1027[Statics.field378 + 1];
                class265 var236 = class265.method3505(var235);
                if (var236.method4569()) {
                    field1022[++Statics.field1208 - 1] = class270.method2571(var234).method4724(var235, var236.field3348);
                } else {
                    field1027[++Statics.field378 - 1] = class270.method2571(var234).method4716(var235, var236.field3349);
                }
                var216 = 1;
            } else if (arg0 == 6516) {
                Statics.field378 -= 2;
                int var237 = field1027[Statics.field378];
                int var238 = field1027[Statics.field378 + 1];
                class265 var239 = class265.method3505(var238);
                if (var239.method4569()) {
                    String[] var240 = field1022;
                    int var241 = ++Statics.field1208 - 1;
                    class266 var242 = (class266) class266.field3353.method3707((long) var237);
                    class266 var243;
                    if (var242 == null) {
                        byte[] var244 = Statics.field3352.method4250(34, var237);
                        class266 var245 = new class266();
                        if (var244 != null) {
                            var245.method4603(new class183(var244));
                        }
                        var245.method4589();
                        class266.field3353.method3712(var245, (long) var237);
                        var243 = var245;
                    } else {
                        var243 = var242;
                    }
                    var240[var241] = var243.method4593(var238, var239.field3348);
                } else {
                    int[] var246 = field1027;
                    int var247 = ++Statics.field378 - 1;
                    class266 var248 = (class266) class266.field3353.method3707((long) var237);
                    class266 var249;
                    if (var248 == null) {
                        byte[] var250 = Statics.field3352.method4250(34, var237);
                        class266 var251 = new class266();
                        if (var250 != null) {
                            var251.method4603(new class183(var250));
                        }
                        var251.method4589();
                        class266.field3353.method3712(var251, (long) var237);
                        var249 = var251;
                    } else {
                        var249 = var248;
                    }
                    var246[var247] = var249.method4595(var238, var239.field3349);
                }
                var216 = 1;
            } else if (arg0 == 6518) {
                field1027[++Statics.field378 - 1] = client.field602 ? 1 : 0;
                var216 = 1;
            } else if (arg0 == 6520) {
                var216 = 1;
            } else if (arg0 == 6521) {
                var216 = 1;
            } else if (arg0 == 6522) {
                Statics.field1208--;
                Statics.field378--;
                var216 = 1;
            } else if (arg0 == 6523) {
                Statics.field1208--;
                Statics.field378--;
                var216 = 1;
            } else {
                var216 = 2;
            }
            return var216;
        } else if (arg0 < 6700) {
            byte var255;
            if (arg0 == 6600) {
                int var252 = Statics.field2416;
                int var253 = (Statics.field1949.field901 >> 7) + Statics.field2316;
                int var254 = (Statics.field1949.field919 >> 7) + Statics.field1052;
                client.method1700().method5779(var252, var253, var254, true);
                var255 = 1;
            } else if (arg0 == 6601) {
                int var256 = field1027[--Statics.field378];
                String var257 = "";
                class21 var258 = client.method1700().method5603(var256);
                if (var258 != null) {
                    var257 = var258.method232();
                }
                field1022[++Statics.field1208 - 1] = var257;
                var255 = 1;
            } else if (arg0 == 6602) {
                int var259 = field1027[--Statics.field378];
                client.method1700().method5801(var259);
                var255 = 1;
            } else if (arg0 == 6603) {
                field1027[++Statics.field378 - 1] = client.method1700().method5630();
                var255 = 1;
            } else if (arg0 == 6604) {
                int var260 = field1027[--Statics.field378];
                client.method1700().method5748(var260);
                var255 = 1;
            } else if (arg0 == 6605) {
                field1027[++Statics.field378 - 1] = client.method1700().method5632() ? 1 : 0;
                var255 = 1;
            } else if (arg0 == 6606) {
                class227 var261 = new class227(field1027[--Statics.field378]);
                client.method1700().method5634(var261.field2582, var261.field2584);
                var255 = 1;
            } else if (arg0 == 6607) {
                class227 var262 = new class227(field1027[--Statics.field378]);
                client.method1700().method5627(var262.field2582, var262.field2584);
                var255 = 1;
            } else if (arg0 == 6608) {
                class227 var263 = new class227(field1027[--Statics.field378]);
                client.method1700().method5781(var263.field2588, var263.field2582, var263.field2584);
                var255 = 1;
            } else if (arg0 == 6609) {
                class227 var264 = new class227(field1027[--Statics.field378]);
                client.method1700().method5637(var264.field2588, var264.field2582, var264.field2584);
                var255 = 1;
            } else if (arg0 == 6610) {
                field1027[++Statics.field378 - 1] = client.method1700().method5638();
                field1027[++Statics.field378 - 1] = client.method1700().method5775();
                var255 = 1;
            } else if (arg0 == 6611) {
                int var265 = field1027[--Statics.field378];
                class21 var266 = client.method1700().method5603(var265);
                if (var266 == null) {
                    field1027[++Statics.field378 - 1] = 0;
                } else {
                    field1027[++Statics.field378 - 1] = var266.method222().method4099();
                }
                var255 = 1;
            } else if (arg0 == 6612) {
                int var267 = field1027[--Statics.field378];
                class21 var268 = client.method1700().method5603(var267);
                if (var268 == null) {
                    field1027[++Statics.field378 - 1] = 0;
                    field1027[++Statics.field378 - 1] = 0;
                } else {
                    field1027[++Statics.field378 - 1] = (var268.method216() - var268.method201() + 1) * 64;
                    field1027[++Statics.field378 - 1] = (var268.method248() - var268.method270() + 1) * 64;
                }
                var255 = 1;
            } else if (arg0 == 6613) {
                int var269 = field1027[--Statics.field378];
                class21 var270 = client.method1700().method5603(var269);
                if (var270 == null) {
                    field1027[++Statics.field378 - 1] = 0;
                    field1027[++Statics.field378 - 1] = 0;
                    field1027[++Statics.field378 - 1] = 0;
                    field1027[++Statics.field378 - 1] = 0;
                } else {
                    field1027[++Statics.field378 - 1] = var270.method201() * 64;
                    field1027[++Statics.field378 - 1] = var270.method270() * 64;
                    field1027[++Statics.field378 - 1] = var270.method216() * 64 + 64 - 1;
                    field1027[++Statics.field378 - 1] = var270.method248() * 64 + 64 - 1;
                }
                var255 = 1;
            } else if (arg0 == 6614) {
                int var271 = field1027[--Statics.field378];
                class21 var272 = client.method1700().method5603(var271);
                if (var272 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                } else {
                    field1027[++Statics.field378 - 1] = var272.method225();
                }
                var255 = 1;
            } else if (arg0 == 6615) {
                class227 var273 = client.method1700().method5640();
                if (var273 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = -1;
                } else {
                    field1027[++Statics.field378 - 1] = var273.field2582;
                    field1027[++Statics.field378 - 1] = var273.field2584;
                }
                var255 = 1;
            } else if (arg0 == 6616) {
                field1027[++Statics.field378 - 1] = client.method1700().method5617();
                var255 = 1;
            } else if (arg0 == 6617) {
                class227 var274 = new class227(field1027[--Statics.field378]);
                class21 var275 = client.method1700().method5618();
                if (var275 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = -1;
                    var255 = 1;
                } else {
                    int[] var276 = var275.method259(var274.field2588, var274.field2582, var274.field2584);
                    if (var276 == null) {
                        field1027[++Statics.field378 - 1] = -1;
                        field1027[++Statics.field378 - 1] = -1;
                    } else {
                        field1027[++Statics.field378 - 1] = var276[0];
                        field1027[++Statics.field378 - 1] = var276[1];
                    }
                    var255 = 1;
                }
            } else if (arg0 == 6618) {
                class227 var277 = new class227(field1027[--Statics.field378]);
                class21 var278 = client.method1700().method5618();
                if (var278 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = -1;
                    var255 = 1;
                } else {
                    class227 var279 = var278.method207(var277.field2582, var277.field2584);
                    if (var279 == null) {
                        field1027[++Statics.field378 - 1] = -1;
                    } else {
                        field1027[++Statics.field378 - 1] = var279.method4099();
                    }
                    var255 = 1;
                }
            } else if (arg0 == 6619) {
                Statics.field378 -= 2;
                int var280 = field1027[Statics.field378];
                class227 var281 = new class227(field1027[Statics.field378 + 1]);
                method533(var280, var281, false);
                var255 = 1;
            } else if (arg0 == 6620) {
                Statics.field378 -= 2;
                int var282 = field1027[Statics.field378];
                class227 var283 = new class227(field1027[Statics.field378 + 1]);
                method533(var282, var283, true);
                var255 = 1;
            } else if (arg0 == 6621) {
                Statics.field378 -= 2;
                int var284 = field1027[Statics.field378];
                class227 var285 = new class227(field1027[Statics.field378 + 1]);
                class21 var286 = client.method1700().method5603(var284);
                if (var286 == null) {
                    field1027[++Statics.field378 - 1] = 0;
                    var255 = 1;
                } else {
                    field1027[++Statics.field378 - 1] = var286.method204(var285.field2588, var285.field2582, var285.field2584) ? 1 : 0;
                    var255 = 1;
                }
            } else if (arg0 == 6622) {
                field1027[++Statics.field378 - 1] = client.method1700().method5641();
                field1027[++Statics.field378 - 1] = client.method1700().method5642();
                var255 = 1;
            } else if (arg0 == 6623) {
                class227 var287 = new class227(field1027[--Statics.field378]);
                class21 var288 = client.method1700().method5782(var287.field2588, var287.field2582, var287.field2584);
                if (var288 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                } else {
                    field1027[++Statics.field378 - 1] = var288.method209();
                }
                var255 = 1;
            } else if (arg0 == 6624) {
                client.method1700().method5643(field1027[--Statics.field378]);
                var255 = 1;
            } else if (arg0 == 6625) {
                client.method1700().method5644();
                var255 = 1;
            } else if (arg0 == 6626) {
                client.method1700().method5645(field1027[--Statics.field378]);
                var255 = 1;
            } else if (arg0 == 6627) {
                client.method1700().method5760();
                var255 = 1;
            } else if (arg0 == 6628) {
                boolean var289 = field1027[--Statics.field378] == 1;
                client.method1700().method5615(var289);
                var255 = 1;
            } else if (arg0 == 6629) {
                int var290 = field1027[--Statics.field378];
                client.method1700().method5648(var290);
                var255 = 1;
            } else if (arg0 == 6630) {
                int var291 = field1027[--Statics.field378];
                client.method1700().method5647(var291);
                var255 = 1;
            } else if (arg0 == 6631) {
                client.method1700().method5650();
                var255 = 1;
            } else if (arg0 == 6632) {
                boolean var292 = field1027[--Statics.field378] == 1;
                client.method1700().method5651(var292);
                var255 = 1;
            } else if (arg0 == 6633) {
                Statics.field378 -= 2;
                int var293 = field1027[Statics.field378];
                boolean var294 = field1027[Statics.field378 + 1] == 1;
                client.method1700().method5652(var293, var294);
                var255 = 1;
            } else if (arg0 == 6634) {
                Statics.field378 -= 2;
                int var295 = field1027[Statics.field378];
                boolean var296 = field1027[Statics.field378 + 1] == 1;
                client.method1700().method5639(var295, var296);
                var255 = 1;
            } else if (arg0 == 6635) {
                field1027[++Statics.field378 - 1] = client.method1700().method5654() ? 1 : 0;
                var255 = 1;
            } else if (arg0 == 6636) {
                int var297 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = client.method1700().method5655(var297) ? 1 : 0;
                var255 = 1;
            } else if (arg0 == 6637) {
                int var298 = field1027[--Statics.field378];
                field1027[++Statics.field378 - 1] = client.method1700().method5616(var298) ? 1 : 0;
                var255 = 1;
            } else if (arg0 == 6638) {
                Statics.field378 -= 2;
                int var299 = field1027[Statics.field378];
                class227 var300 = new class227(field1027[Statics.field378 + 1]);
                class227 var301 = client.method1700().method5662(var299, var300);
                if (var301 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                } else {
                    field1027[++Statics.field378 - 1] = var301.method4099();
                }
                var255 = 1;
            } else if (arg0 == 6639) {
                class29 var302 = client.method1700().method5624();
                if (var302 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = -1;
                } else {
                    field1027[++Statics.field378 - 1] = var302.field252;
                    field1027[++Statics.field378 - 1] = var302.field248.method4099();
                }
                var255 = 1;
            } else if (arg0 == 6640) {
                class29 var303 = client.method1700().method5802();
                if (var303 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                    field1027[++Statics.field378 - 1] = -1;
                } else {
                    field1027[++Statics.field378 - 1] = var303.field252;
                    field1027[++Statics.field378 - 1] = var303.field248.method4099();
                }
                var255 = 1;
            } else if (arg0 == 6693) {
                int var304 = field1027[--Statics.field378];
                class256 var305 = Statics.field3275[var304];
                if (var305.field3263 == null) {
                    field1022[++Statics.field1208 - 1] = "";
                } else {
                    field1022[++Statics.field1208 - 1] = var305.field3263;
                }
                var255 = 1;
            } else if (arg0 == 6694) {
                int var306 = field1027[--Statics.field378];
                class256 var307 = Statics.field3275[var306];
                field1027[++Statics.field378 - 1] = var307.field3277;
                var255 = 1;
            } else if (arg0 == 6695) {
                int var308 = field1027[--Statics.field378];
                class256 var309 = Statics.field3275[var308];
                if (var309 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                } else {
                    field1027[++Statics.field378 - 1] = var309.field3278;
                }
                var255 = 1;
            } else if (arg0 == 6696) {
                int var310 = field1027[--Statics.field378];
                class256 var311 = Statics.field3275[var310];
                if (var311 == null) {
                    field1027[++Statics.field378 - 1] = -1;
                } else {
                    field1027[++Statics.field378 - 1] = var311.field3261;
                }
                var255 = 1;
            } else if (arg0 == 6697) {
                field1027[++Statics.field378 - 1] = Statics.field2294.field313;
                var255 = 1;
            } else if (arg0 == 6698) {
                field1027[++Statics.field378 - 1] = Statics.field2294.field309.method4099();
                var255 = 1;
            } else if (arg0 == 6699) {
                field1027[++Statics.field378 - 1] = Statics.field2294.field310.method4099();
                var255 = 1;
            } else {
                var255 = 2;
            }
            return var255;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.x(ILcs;ZI)I")
    public static int method1901(int arg0, class85 arg1, boolean arg2) {
        int var3 = -1;
        class231 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1027[--Statics.field378];
            var4 = class231.method1097(var3);
        } else {
            var4 = arg2 ? Statics.field2380 : Statics.field997;
        }
        if (arg0 == 1000) {
            Statics.field378 -= 4;
            var4.field2633 = field1027[Statics.field378];
            var4.field2654 = field1027[Statics.field378 + 1];
            var4.field2629 = field1027[Statics.field378 + 2];
            var4.field2630 = field1027[Statics.field378 + 3];
            client.method3242(var4);
            Statics.field322.method1115(var4);
            if (var3 != -1 && var4.field2626 == 0) {
                client.method727(Statics.field2616[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field378 -= 4;
            var4.field2635 = field1027[Statics.field378];
            var4.field2636 = field1027[Statics.field378 + 1];
            var4.field2668 = field1027[Statics.field378 + 2];
            var4.field2632 = field1027[Statics.field378 + 3];
            client.method3242(var4);
            Statics.field322.method1115(var4);
            if (var3 != -1 && var4.field2626 == 0) {
                client.method727(Statics.field2616[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1027[--Statics.field378] == 1;
            if (var4.field2644 != var5) {
                var4.field2644 = var5;
                client.method3242(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2732 = field1027[--Statics.field378] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2664 = field1027[--Statics.field378] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("er.j(ILcs;ZI)I")
    public static int method2905(int arg0, class85 arg1, boolean arg2) {
        int var3 = -1;
        class231 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1027[--Statics.field378];
            var4 = class231.method1097(var3);
        } else {
            var4 = arg2 ? Statics.field2380 : Statics.field997;
        }
        if (arg0 == 1100) {
            Statics.field378 -= 2;
            var4.field2645 = field1027[Statics.field378];
            if (var4.field2645 > var4.field2675 - var4.field2628) {
                var4.field2645 = var4.field2675 - var4.field2628;
            }
            if (var4.field2645 < 0) {
                var4.field2645 = 0;
            }
            var4.field2612 = field1027[Statics.field378 + 1];
            if (var4.field2612 > var4.field2648 - var4.field2640) {
                var4.field2612 = var4.field2648 - var4.field2640;
            }
            if (var4.field2612 < 0) {
                var4.field2612 = 0;
            }
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2649 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2653 = field1027[--Statics.field378] == 1;
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2639 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2657 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2659 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2661 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2730 = field1027[--Statics.field378] == 1;
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2667 = 1;
            var4.field2758 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field378 -= 6;
            var4.field2673 = field1027[Statics.field378];
            var4.field2674 = field1027[Statics.field378 + 1];
            var4.field2676 = field1027[Statics.field378 + 2];
            var4.field2708 = field1027[Statics.field378 + 3];
            var4.field2677 = field1027[Statics.field378 + 4];
            var4.field2702 = field1027[Statics.field378 + 5];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1027[--Statics.field378];
            if (var4.field2671 != var5) {
                var4.field2671 = var5;
                var4.field2747 = 0;
                var4.field2719 = 0;
                client.method3242(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2700 = field1027[--Statics.field378] == 1;
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1022[--Statics.field1208];
            if (!var6.equals(var4.field2685)) {
                var4.field2685 = var6;
                client.method3242(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2684 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field378 -= 3;
            var4.field2748 = field1027[Statics.field378];
            var4.field2689 = field1027[Statics.field378 + 1];
            var4.field2687 = field1027[Statics.field378 + 2];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2690 = field1027[--Statics.field378] == 1;
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2663 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2743 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2665 = field1027[--Statics.field378] == 1;
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2666 = field1027[--Statics.field378] == 1;
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field378 -= 2;
            var4.field2675 = field1027[Statics.field378];
            var4.field2648 = field1027[Statics.field378 + 1];
            client.method3242(var4);
            if (var3 != -1 && var4.field2626 == 0) {
                client.method727(Statics.field2616[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2624;
            int var8 = var4.field2634;
            class173 var9 = class173.method2882(class170.field2226, client.field740.field1251);
            var9.field2280.method3364(var7);
            var9.field2280.method3299(var8);
            client.field740.method1873(var9);
            client.field757 = var4;
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2617 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2641 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2650 = field1027[--Statics.field378];
            client.method3242(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var10 = field1027[--Statics.field378];
            class317[] var11 = new class317[] { class317.field3782, class317.field3778, class317.field3781, class317.field3780, class317.field3779 };
            class317 var12 = (class317) class178.method90(var11, var10);
            if (var12 != null) {
                var4.field2701 = var12;
                client.method3242(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var13 = field1027[--Statics.field378] == 1;
            var4.field2658 = var13;
            return 1;
        } else if (arg0 == 1127) {
            boolean var14 = field1027[--Statics.field378] == 1;
            var4.field2680 = var14;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.a(ILcs;ZI)I")
    public static int method971(int arg0, class85 arg1, boolean arg2) {
        class231 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class231.method1097(field1027[--Statics.field378]);
        } else {
            var3 = arg2 ? Statics.field2380 : Statics.field997;
        }
        client.method3242(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field378 -= 2;
            int var4 = field1027[Statics.field378];
            int var5 = field1027[Statics.field378 + 1];
            var3.field2755 = var4;
            var3.field2678 = var5;
            class270 var6 = class270.method2571(var4);
            var3.field2676 = var6.field3471;
            var3.field2708 = var6.field3457;
            var3.field2677 = var6.field3458;
            var3.field2673 = var6.field3459;
            var3.field2674 = var6.field3487;
            var3.field2702 = var6.field3455;
            if (arg0 == 1205) {
                var3.field2646 = 0;
            } else if (arg0 == 1212 | var6.field3483 == 1) {
                var3.field2646 = 1;
            } else {
                var3.field2646 = 2;
            }
            if (var3.field2679 > 0) {
                var3.field2702 = var3.field2702 * 32 / var3.field2679;
            } else if (var3.field2635 > 0) {
                var3.field2702 = var3.field2702 * 32 / var3.field2635;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2667 = 2;
            var3.field2758 = field1027[--Statics.field378];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2667 = 3;
            var3.field2758 = Statics.field1949.field562.method4125();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ba.l(ILcs;ZI)I")
    public static int method1705(int arg0, class85 arg1, boolean arg2) {
        class231 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class231.method1097(field1027[--Statics.field378]);
        } else {
            var3 = arg2 ? Statics.field2380 : Statics.field997;
        }
        if (arg0 == 1300) {
            int var4 = field1027[--Statics.field378] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4163(var4, field1022[--Statics.field1208]);
                return 1;
            } else {
                Statics.field1208--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field378 -= 2;
            int var5 = field1027[Statics.field378];
            int var6 = field1027[Statics.field378 + 1];
            var3.field2625 = class231.method282(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2703 = field1027[--Statics.field378] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2688 = field1027[--Statics.field378];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2695 = field1027[--Statics.field378];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2698 = field1022[--Statics.field1208];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2704 = field1022[--Statics.field1208];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2699 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bk.d(ILcs;ZI)I")
    public static int method999(int arg0, class85 arg1, boolean arg2) {
        class231 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class231.method1097(field1027[--Statics.field378]);
        } else {
            var3 = arg2 ? Statics.field2380 : Statics.field997;
        }
        String var4 = field1022[--Statics.field1208];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1027[--Statics.field378];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1027[--Statics.field378];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1022[--Statics.field1208];
            } else {
                var7[var8] = Integer.valueOf(field1027[--Statics.field378]);
            }
        }
        int var9 = field1027[--Statics.field378];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2707 = var7;
        } else if (arg0 == 1401) {
            var3.field2710 = var7;
        } else if (arg0 == 1402) {
            var3.field2709 = var7;
        } else if (arg0 == 1403) {
            var3.field2706 = var7;
        } else if (arg0 == 1404) {
            var3.field2713 = var7;
        } else if (arg0 == 1405) {
            var3.field2718 = var7;
        } else if (arg0 == 1406) {
            var3.field2717 = var7;
        } else if (arg0 == 1407) {
            var3.field2727 = var7;
            var3.field2749 = var5;
        } else if (arg0 == 1408) {
            var3.field2724 = var7;
        } else if (arg0 == 1409) {
            var3.field2611 = var7;
        } else if (arg0 == 1410) {
            var3.field2715 = var7;
        } else if (arg0 == 1411) {
            var3.field2660 = var7;
        } else if (arg0 == 1412) {
            var3.field2725 = var7;
        } else if (arg0 == 1414) {
            var3.field2720 = var7;
            var3.field2721 = var5;
        } else if (arg0 == 1415) {
            var3.field2722 = var7;
            var3.field2723 = var5;
        } else if (arg0 == 1416) {
            var3.field2716 = var7;
        } else if (arg0 == 1417) {
            var3.field2631 = var7;
        } else if (arg0 == 1418) {
            var3.field2681 = var7;
        } else if (arg0 == 1419) {
            var3.field2728 = var7;
        } else if (arg0 == 1420) {
            var3.field2729 = var7;
        } else if (arg0 == 1421) {
            var3.field2752 = var7;
        } else if (arg0 == 1422) {
            var3.field2731 = var7;
        } else if (arg0 == 1423) {
            var3.field2714 = var7;
        } else if (arg0 == 1424) {
            var3.field2733 = var7;
        } else if (arg0 == 1425) {
            var3.field2735 = var7;
        } else if (arg0 == 1426) {
            var3.field2736 = var7;
        } else if (arg0 == 1427) {
            var3.field2746 = var7;
        } else {
            return 2;
        }
        var3.field2705 = true;
        return 1;
    }

    @ObfuscatedName("cw.s(ILcs;ZB)I")
    public static int method1802(int arg0, class85 arg1, boolean arg2) {
        class231 var3 = arg2 ? Statics.field2380 : Statics.field997;
        if (arg0 == 1500) {
            field1027[++Statics.field378 - 1] = var3.field2637;
            return 1;
        } else if (arg0 == 1501) {
            field1027[++Statics.field378 - 1] = var3.field2638;
            return 1;
        } else if (arg0 == 1502) {
            field1027[++Statics.field378 - 1] = var3.field2628;
            return 1;
        } else if (arg0 == 1503) {
            field1027[++Statics.field378 - 1] = var3.field2640;
            return 1;
        } else if (arg0 == 1504) {
            field1027[++Statics.field378 - 1] = var3.field2644 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1027[++Statics.field378 - 1] = var3.field2643;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bc.p(ILcs;ZI)I")
    public static int method975(int arg0, class85 arg1, boolean arg2) {
        class231 var3 = arg2 ? Statics.field2380 : Statics.field997;
        if (arg0 == 1600) {
            field1027[++Statics.field378 - 1] = var3.field2645;
            return 1;
        } else if (arg0 == 1601) {
            field1027[++Statics.field378 - 1] = var3.field2612;
            return 1;
        } else if (arg0 == 1602) {
            field1022[++Statics.field1208 - 1] = var3.field2685;
            return 1;
        } else if (arg0 == 1603) {
            field1027[++Statics.field378 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 1604) {
            field1027[++Statics.field378 - 1] = var3.field2648;
            return 1;
        } else if (arg0 == 1605) {
            field1027[++Statics.field378 - 1] = var3.field2702;
            return 1;
        } else if (arg0 == 1606) {
            field1027[++Statics.field378 - 1] = var3.field2676;
            return 1;
        } else if (arg0 == 1607) {
            field1027[++Statics.field378 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 1608) {
            field1027[++Statics.field378 - 1] = var3.field2708;
            return 1;
        } else if (arg0 == 1609) {
            field1027[++Statics.field378 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 1610) {
            field1027[++Statics.field378 - 1] = var3.field2650;
            return 1;
        } else if (arg0 == 1611) {
            field1027[++Statics.field378 - 1] = var3.field2649;
            return 1;
        } else if (arg0 == 1612) {
            field1027[++Statics.field378 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 1613) {
            field1027[++Statics.field378 - 1] = var3.field2701.method159();
            return 1;
        } else if (arg0 == 1614) {
            field1027[++Statics.field378 - 1] = var3.field2680 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.g(ILcs;ZI)I")
    public static int method442(int arg0, class85 arg1, boolean arg2) {
        class231 var3 = arg2 ? Statics.field2380 : Statics.field997;
        if (arg0 == 1700) {
            field1027[++Statics.field378 - 1] = var3.field2755;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2755 == -1) {
                field1027[++Statics.field378 - 1] = 0;
            } else {
                field1027[++Statics.field378 - 1] = var3.field2678;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1027[++Statics.field378 - 1] = var3.field2634;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cv.y(ILcs;ZI)I")
    public static int method2113(int arg0, class85 arg1, boolean arg2) {
        class231 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class231.method1097(field1027[--Statics.field378]);
        } else {
            var3 = arg2 ? Statics.field2380 : Statics.field997;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1026 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2746 == null) {
            return 0;
        } else {
            class57 var4 = new class57();
            var4.field512 = var3;
            var4.field526 = var3.field2746;
            var4.field520 = field1026 + 1;
            client.field756.method3810(var4);
            return 1;
        }
    }

    @ObfuscatedName("as.c(ILcs;ZI)I")
    public static int method532(int arg0, class85 arg1, boolean arg2) {
        class231 var3 = class231.method1097(field1027[--Statics.field378]);
        if (arg0 == 2600) {
            field1027[++Statics.field378 - 1] = var3.field2645;
            return 1;
        } else if (arg0 == 2601) {
            field1027[++Statics.field378 - 1] = var3.field2612;
            return 1;
        } else if (arg0 == 2602) {
            field1022[++Statics.field1208 - 1] = var3.field2685;
            return 1;
        } else if (arg0 == 2603) {
            field1027[++Statics.field378 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 2604) {
            field1027[++Statics.field378 - 1] = var3.field2648;
            return 1;
        } else if (arg0 == 2605) {
            field1027[++Statics.field378 - 1] = var3.field2702;
            return 1;
        } else if (arg0 == 2606) {
            field1027[++Statics.field378 - 1] = var3.field2676;
            return 1;
        } else if (arg0 == 2607) {
            field1027[++Statics.field378 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 2608) {
            field1027[++Statics.field378 - 1] = var3.field2708;
            return 1;
        } else if (arg0 == 2609) {
            field1027[++Statics.field378 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 2610) {
            field1027[++Statics.field378 - 1] = var3.field2650;
            return 1;
        } else if (arg0 == 2611) {
            field1027[++Statics.field378 - 1] = var3.field2649;
            return 1;
        } else if (arg0 == 2612) {
            field1027[++Statics.field378 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 2613) {
            field1027[++Statics.field378 - 1] = var3.field2701.method159();
            return 1;
        } else if (arg0 == 2614) {
            field1027[++Statics.field378 - 1] = var3.field2680 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.e(ILcs;ZB)I")
    public static int method483(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1022[--Statics.field1208];
            class84.method1098(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field378 -= 2;
            client.method2960(Statics.field1949, field1027[Statics.field378], field1027[Statics.field378 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.method100();
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1022[--Statics.field1208];
            int var5 = 0;
            boolean var6 = false;
            boolean var7 = false;
            int var8 = 0;
            int var9 = var4.length();
            int var10 = 0;
            boolean var12;
            while (true) {
                if (var10 >= var9) {
                    var12 = var7;
                    break;
                }
                label379: {
                    char var11 = var4.charAt(var10);
                    if (var10 == 0) {
                        if (var11 == '-') {
                            var6 = true;
                            break label379;
                        }
                        if (var11 == '+') {
                            break label379;
                        }
                    }
                    int var49;
                    if (var11 >= '0' && var11 <= '9') {
                        var49 = var11 - '0';
                    } else if (var11 >= 'A' && var11 <= 'Z') {
                        var49 = var11 - '7';
                    } else {
                        if (var11 < 'a' || var11 > 'z') {
                            var12 = false;
                            break;
                        }
                        var49 = var11 - 'W';
                    }
                    if (var49 >= 10) {
                        var12 = false;
                        break;
                    }
                    if (var6) {
                        var49 = -var49;
                    }
                    int var13 = var8 * 10 + var49;
                    if (var13 / 10 != var8) {
                        var12 = false;
                        break;
                    }
                    var8 = var13;
                    var7 = true;
                }
                var10++;
            }
            if (var12) {
                int var15 = class306.method14(var4, 10, true);
                var5 = var15;
            }
            class173 var16 = class173.method2882(class170.field2229, client.field740.field1251);
            var16.field2280.method3249(var5);
            client.field740.method1873(var16);
            return 1;
        } else if (arg0 == 3105) {
            String var17 = field1022[--Statics.field1208];
            class173 var18 = class173.method2882(class170.field2240, client.field740.field1251);
            var18.field2280.method3246(var17.length() + 1);
            var18.field2280.method3243(var17);
            client.field740.method1873(var18);
            return 1;
        } else if (arg0 == 3106) {
            String var19 = field1022[--Statics.field1208];
            class173 var20 = class173.method2882(class170.field2250, client.field740.field1251);
            var20.field2280.method3246(var19.length() + 1);
            var20.field2280.method3243(var19);
            client.field740.method1873(var20);
            return 1;
        } else if (arg0 == 3107) {
            int var21 = field1027[--Statics.field378];
            String var22 = field1022[--Statics.field1208];
            int var23 = class82.field1181;
            int[] var24 = class82.field1182;
            boolean var25 = false;
            class292 var26 = new class292(var22, Statics.field169);
            for (int var27 = 0; var27 < var23; var27++) {
                class61 var28 = client.field807[var24[var27]];
                if (var28 != null && Statics.field1949 != var28 && var28.field588 != null && var28.field588.equals(var26)) {
                    if (var21 == 1) {
                        class173 var29 = class173.method2882(class170.field2214, client.field740.field1251);
                        var29.field2280.method3299(var24[var27]);
                        var29.field2280.method3288(0);
                        client.field740.method1873(var29);
                    } else if (var21 == 4) {
                        class173 var30 = class173.method2882(class170.field2219, client.field740.field1251);
                        var30.field2280.method3246(0);
                        var30.field2280.method3419(var24[var27]);
                        client.field740.method1873(var30);
                    } else if (var21 == 6) {
                        class173 var31 = class173.method2882(class170.field2165, client.field740.field1251);
                        var31.field2280.method3401(var24[var27]);
                        var31.field2280.method3288(0);
                        client.field740.method1873(var31);
                    } else if (var21 == 7) {
                        class173 var32 = class173.method2882(class170.field2181, client.field740.field1251);
                        var32.field2280.method3419(var24[var27]);
                        var32.field2280.method3288(0);
                        client.field740.method1873(var32);
                    }
                    var25 = true;
                    break;
                }
            }
            if (!var25) {
                class84.method1098(4, "", class238.field2964 + var22);
            }
            return 1;
        } else if (arg0 == 3108) {
            Statics.field378 -= 3;
            int var33 = field1027[Statics.field378];
            int var34 = field1027[Statics.field378 + 1];
            int var35 = field1027[Statics.field378 + 2];
            class231 var36 = class231.method1097(var35);
            client.method617(var36, var33, var34);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field378 -= 2;
            int var37 = field1027[Statics.field378];
            int var38 = field1027[Statics.field378 + 1];
            class231 var39 = arg2 ? Statics.field2380 : Statics.field997;
            client.method617(var39, var37, var38);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field58 = field1027[--Statics.field378] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1027[++Statics.field378 - 1] = Statics.field469.field982 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field469.field982 = field1027[--Statics.field378] == 1;
            class67.method4621();
            return 1;
        } else if (arg0 == 3113) {
            String var40 = field1022[--Statics.field1208];
            boolean var41 = field1027[--Statics.field378] == 1;
            class46.method522(var40, var41, "openjs", false);
            return 1;
        } else if (arg0 == 3115) {
            int var42 = field1027[--Statics.field378];
            class173 var43 = class173.method2882(class170.field2201, client.field740.field1251);
            var43.field2280.method3296(var42);
            client.field740.method1873(var43);
            return 1;
        } else if (arg0 == 3116) {
            int var44 = field1027[--Statics.field378];
            Statics.field1208 -= 2;
            String var45 = field1022[Statics.field1208];
            String var46 = field1022[Statics.field1208 + 1];
            if (var45.length() > 500) {
                return 1;
            } else if (var46.length() > 500) {
                return 1;
            } else {
                class173 var47 = class173.method2882(class170.field2206, client.field740.field1251);
                var47.field2280.method3296(1 + class183.method124(var45) + class183.method124(var46));
                var47.field2280.method3243(var46);
                var47.field2280.method3246(var44);
                var47.field2280.method3243(var45);
                client.field740.method1873(var47);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field734 = field1027[--Statics.field378] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field741 = field1027[--Statics.field378] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field712 = field1027[--Statics.field378] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1027[--Statics.field378] == 1) {
                client.field713 |= 0x1;
            } else {
                client.field713 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1027[--Statics.field378] == 1) {
                client.field713 |= 0x2;
            } else {
                client.field713 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1027[--Statics.field378] == 1) {
                client.field713 |= 0x4;
            } else {
                client.field713 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1027[--Statics.field378] == 1) {
                client.field713 |= 0x8;
            } else {
                client.field713 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field713 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field665 = field1027[--Statics.field378] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field716 = field1027[--Statics.field378] == 1;
            return 1;
        } else if (arg0 == 3127) {
            boolean var48 = field1027[--Statics.field378] == 1;
            client.field670 = var48;
            return 1;
        } else if (arg0 == 3128) {
            field1027[++Statics.field378 - 1] = client.method4861() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field378 -= 2;
            client.field673 = field1027[Statics.field378];
            client.field674 = field1027[Statics.field378 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field378 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field378--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.t(ILcs;ZS)I")
    public static int method1027(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field378 -= 3;
            int var3 = field1027[Statics.field378];
            int var4 = field1027[Statics.field378 + 1];
            int var5 = field1027[Statics.field378 + 2];
            if (client.field769 != 0 && var4 != 0 && client.field599 < 50) {
                client.field830[client.field599] = var3;
                client.field696[client.field599] = var4;
                client.field832[client.field599] = var5;
                client.field763[client.field599] = null;
                client.field833[client.field599] = 0;
                client.field599++;
            }
            return 1;
        } else if (arg0 == 3201) {
            int var6 = field1027[--Statics.field378];
            if (var6 == -1 && !client.field826) {
                class218.method630();
            } else if (var6 != -1 && client.field825 != var6 && client.field694 != 0 && !client.field826) {
                class218.method3153(2, Statics.field437, var6, 0, client.field694, false);
            }
            client.field825 = var6;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field378 -= 2;
            Statics.method4492(field1027[Statics.field378], field1027[Statics.field378 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fq.u(ILcs;ZI)I")
    public static int method3159(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1454.field995 == 0) {
                field1027[++Statics.field378 - 1] = -2;
            } else if (Statics.field1454.field995 == 1) {
                field1027[++Statics.field378 - 1] = -1;
            } else {
                field1027[++Statics.field378 - 1] = Statics.field1454.field990.method4952();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1027[--Statics.field378];
            if (Statics.field1454.method1547() && var3 >= 0 && var3 < Statics.field1454.field990.method4952()) {
                class293 var4 = (class293) Statics.field1454.field990.method4962(var3);
                field1022[++Statics.field1208 - 1] = var4.method4911();
                field1022[++Statics.field1208 - 1] = var4.method4912();
            } else {
                field1022[++Statics.field1208 - 1] = "";
                field1022[++Statics.field1208 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1027[--Statics.field378];
            if (Statics.field1454.method1547() && var5 >= 0 && var5 < Statics.field1454.field990.method4952()) {
                field1027[++Statics.field378 - 1] = ((class288) Statics.field1454.field990.method4962(var5)).field3649;
            } else {
                field1027[++Statics.field378 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1027[--Statics.field378];
            if (Statics.field1454.method1547() && var6 >= 0 && var6 < Statics.field1454.field990.method4952()) {
                field1027[++Statics.field378 - 1] = ((class288) Statics.field1454.field990.method4962(var6)).field3648;
            } else {
                field1027[++Statics.field378 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1022[--Statics.field1208];
            int var8 = field1027[--Statics.field378];
            class68.method96(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1022[--Statics.field1208];
            Statics.field1454.method1556(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1022[--Statics.field1208];
            Statics.field1454.method1558(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1022[--Statics.field1208];
            Statics.field1454.method1554(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1022[--Statics.field1208];
            Statics.field1454.method1559(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1022[--Statics.field1208];
            String var14 = client.method98(var13);
            field1027[++Statics.field378 - 1] = Statics.field1454.method1552(new class292(var14, Statics.field169), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field3 == null) {
                field1022[++Statics.field1208 - 1] = "";
            } else {
                field1022[++Statics.field1208 - 1] = Statics.field3.field3668;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field3 == null) {
                field1027[++Statics.field378 - 1] = 0;
            } else {
                field1027[++Statics.field378 - 1] = Statics.field3.method4952();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1027[--Statics.field378];
            if (Statics.field3 == null || var15 >= Statics.field3.method4952()) {
                field1022[++Statics.field1208 - 1] = "";
            } else {
                field1022[++Statics.field1208 - 1] = Statics.field3.method4962(var15).method4910().method5048();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1027[--Statics.field378];
            if (Statics.field3 == null || var16 >= Statics.field3.method4952()) {
                field1027[++Statics.field378 - 1] = 0;
            } else {
                field1027[++Statics.field378 - 1] = ((class288) Statics.field3.method4962(var16)).method5031();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1027[--Statics.field378];
            if (Statics.field3 == null || var17 >= Statics.field3.method4952()) {
                field1027[++Statics.field378 - 1] = 0;
            } else {
                field1027[++Statics.field378 - 1] = ((class288) Statics.field3.method4962(var17)).field3648;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1027[++Statics.field378 - 1] = Statics.field3 == null ? 0 : Statics.field3.field3675;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1022[--Statics.field1208];
            if (Statics.field3 != null) {
                class173 var19 = class173.method2882(class170.field2256, client.field740.field1251);
                var19.field2280.method3246(class183.method124(var18));
                var19.field2280.method3243(var18);
                client.field740.method1873(var19);
            }
            return 1;
        } else if (arg0 == 3618) {
            field1027[++Statics.field378 - 1] = Statics.field3 == null ? 0 : Statics.field3.field3672;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field1022[--Statics.field1208];
            client.method565(var20);
            return 1;
        } else if (arg0 == 3620) {
            class173 var21 = class173.method2882(class170.field2177, client.field740.field1251);
            var21.field2280.method3246(0);
            client.field740.method1873(var21);
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1454.method1547()) {
                field1027[++Statics.field378 - 1] = Statics.field1454.field994.method4952();
            } else {
                field1027[++Statics.field378 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var22 = field1027[--Statics.field378];
            if (Statics.field1454.method1547() && var22 >= 0 && var22 < Statics.field1454.field994.method4952()) {
                class287 var23 = (class287) Statics.field1454.field994.method4962(var22);
                field1022[++Statics.field1208 - 1] = var23.method4911();
                field1022[++Statics.field1208 - 1] = var23.method4912();
            } else {
                field1022[++Statics.field1208 - 1] = "";
                field1022[++Statics.field1208 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var24 = field1022[--Statics.field1208];
            String var25 = client.method98(var24);
            field1027[++Statics.field378 - 1] = Statics.field1454.method1553(new class292(var25, Statics.field169)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var26 = field1027[--Statics.field378];
            if (Statics.field3 == null || var26 >= Statics.field3.method4952() || !Statics.field3.method4962(var26).method4910().equals(Statics.field1949.field588)) {
                field1027[++Statics.field378 - 1] = 0;
            } else {
                field1027[++Statics.field378 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field3 == null || Statics.field3.field3670 == null) {
                field1022[++Statics.field1208 - 1] = "";
            } else {
                field1022[++Statics.field1208 - 1] = Statics.field3.field3670;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var27 = field1027[--Statics.field378];
            if (Statics.field3 == null || var27 >= Statics.field3.method4952() || !((class282) Statics.field3.method4962(var27)).method4888()) {
                field1027[++Statics.field378 - 1] = 0;
            } else {
                field1027[++Statics.field378 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var28 = field1027[--Statics.field378];
            if (Statics.field3 == null || var28 >= Statics.field3.method4952() || !((class282) Statics.field3.method4962(var28)).method4891()) {
                field1027[++Statics.field378 - 1] = 0;
            } else {
                field1027[++Statics.field378 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1454.field990.method4968();
            return 1;
        } else if (arg0 == 3629) {
            boolean var29 = field1027[--Statics.field378] == 1;
            Statics.field1454.field990.method4986(new class309(var29));
            return 1;
        } else if (arg0 == 3630) {
            boolean var30 = field1027[--Statics.field378] == 1;
            Statics.field1454.field990.method4986(new class310(var30));
            return 1;
        } else if (arg0 == 3631) {
            boolean var31 = field1027[--Statics.field378] == 1;
            Statics.field1454.field990.method4986(new class144(var31));
            return 1;
        } else if (arg0 == 3632) {
            boolean var32 = field1027[--Statics.field378] == 1;
            Statics.field1454.field990.method4986(new class138(var32));
            return 1;
        } else if (arg0 == 3633) {
            boolean var33 = field1027[--Statics.field378] == 1;
            Statics.field1454.field990.method4986(new class143(var33));
            return 1;
        } else if (arg0 == 3634) {
            boolean var34 = field1027[--Statics.field378] == 1;
            Statics.field1454.field990.method4986(new class146(var34));
            return 1;
        } else if (arg0 == 3635) {
            boolean var35 = field1027[--Statics.field378] == 1;
            Statics.field1454.field990.method4986(new class142(var35));
            return 1;
        } else if (arg0 == 3636) {
            boolean var36 = field1027[--Statics.field378] == 1;
            Statics.field1454.field990.method4986(new class140(var36));
            return 1;
        } else if (arg0 == 3637) {
            boolean var37 = field1027[--Statics.field378] == 1;
            Statics.field1454.field990.method4986(new class139(var37));
            return 1;
        } else if (arg0 == 3638) {
            boolean var38 = field1027[--Statics.field378] == 1;
            Statics.field1454.field990.method4986(new class141(var38));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1454.field990.method4988();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1454.field994.method4968();
            return 1;
        } else if (arg0 == 3641) {
            boolean var39 = field1027[--Statics.field378] == 1;
            Statics.field1454.field994.method4986(new class309(var39));
            return 1;
        } else if (arg0 == 3642) {
            boolean var40 = field1027[--Statics.field378] == 1;
            Statics.field1454.field994.method4986(new class310(var40));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1454.field994.method4988();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field3 != null) {
                Statics.field3.method4968();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var41 = field1027[--Statics.field378] == 1;
            if (Statics.field3 != null) {
                Statics.field3.method4986(new class309(var41));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var42 = field1027[--Statics.field378] == 1;
            if (Statics.field3 != null) {
                Statics.field3.method4986(new class310(var42));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var43 = field1027[--Statics.field378] == 1;
            if (Statics.field3 != null) {
                Statics.field3.method4986(new class144(var43));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var44 = field1027[--Statics.field378] == 1;
            if (Statics.field3 != null) {
                Statics.field3.method4986(new class138(var44));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var45 = field1027[--Statics.field378] == 1;
            if (Statics.field3 != null) {
                Statics.field3.method4986(new class143(var45));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var46 = field1027[--Statics.field378] == 1;
            if (Statics.field3 != null) {
                Statics.field3.method4986(new class146(var46));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var47 = field1027[--Statics.field378] == 1;
            if (Statics.field3 != null) {
                Statics.field3.method4986(new class142(var47));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var48 = field1027[--Statics.field378] == 1;
            if (Statics.field3 != null) {
                Statics.field3.method4986(new class140(var48));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var49 = field1027[--Statics.field378] == 1;
            if (Statics.field3 != null) {
                Statics.field3.method4986(new class139(var49));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var50 = field1027[--Statics.field378] == 1;
            if (Statics.field3 != null) {
                Statics.field3.method4986(new class141(var50));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field3 != null) {
                Statics.field3.method4988();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var51 = field1027[--Statics.field378] == 1;
            Statics.field1454.field990.method4986(new class145(var51));
            return 1;
        } else if (arg0 == 3657) {
            boolean var52 = field1027[--Statics.field378] == 1;
            if (Statics.field3 != null) {
                Statics.field3.method4986(new class145(var52));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dq.i(ILcs;ZI)I")
    public static int method2861(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field378 -= 2;
            int var3 = field1027[Statics.field378];
            int var4 = field1027[Statics.field378 + 1];
            field1027[++Statics.field378 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field378 -= 2;
            int var5 = field1027[Statics.field378];
            int var6 = field1027[Statics.field378 + 1];
            field1027[++Statics.field378 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field378 -= 2;
            int var7 = field1027[Statics.field378];
            int var8 = field1027[Statics.field378 + 1];
            field1027[++Statics.field378 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field378 -= 2;
            int var9 = field1027[Statics.field378];
            int var10 = field1027[Statics.field378 + 1];
            field1027[++Statics.field378 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1027[--Statics.field378];
            field1027[++Statics.field378 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1027[--Statics.field378];
            field1027[++Statics.field378 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field378 -= 5;
            int var13 = field1027[Statics.field378];
            int var14 = field1027[Statics.field378 + 1];
            int var15 = field1027[Statics.field378 + 2];
            int var16 = field1027[Statics.field378 + 3];
            int var17 = field1027[Statics.field378 + 4];
            field1027[++Statics.field378 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field378 -= 2;
            int var18 = field1027[Statics.field378];
            int var19 = field1027[Statics.field378 + 1];
            field1027[++Statics.field378 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field378 -= 2;
            int var20 = field1027[Statics.field378];
            int var21 = field1027[Statics.field378 + 1];
            field1027[++Statics.field378 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field378 -= 2;
            int var22 = field1027[Statics.field378];
            int var23 = field1027[Statics.field378 + 1];
            field1027[++Statics.field378 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field378 -= 2;
            int var24 = field1027[Statics.field378];
            int var25 = field1027[Statics.field378 + 1];
            field1027[++Statics.field378 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field378 -= 2;
            int var26 = field1027[Statics.field378];
            int var27 = field1027[Statics.field378 + 1];
            field1027[++Statics.field378 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field378 -= 2;
            int var28 = field1027[Statics.field378];
            int var29 = field1027[Statics.field378 + 1];
            if (var28 == 0) {
                field1027[++Statics.field378 - 1] = 0;
            } else {
                field1027[++Statics.field378 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field378 -= 2;
            int var30 = field1027[Statics.field378];
            int var31 = field1027[Statics.field378 + 1];
            if (var30 == 0) {
                field1027[++Statics.field378 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1027[++Statics.field378 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1027[++Statics.field378 - 1] = var30;
                    break;
                case 2:
                    field1027[++Statics.field378 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1027[++Statics.field378 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1027[++Statics.field378 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1027[++Statics.field378 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field378 -= 2;
            int var32 = field1027[Statics.field378];
            int var33 = field1027[Statics.field378 + 1];
            field1027[++Statics.field378 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field378 -= 2;
            int var34 = field1027[Statics.field378];
            int var35 = field1027[Statics.field378 + 1];
            field1027[++Statics.field378 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field378 -= 3;
            long var36 = (long) field1027[Statics.field378];
            long var38 = (long) field1027[Statics.field378 + 1];
            long var40 = (long) field1027[Statics.field378 + 2];
            field1027[++Statics.field378 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.r(ILcs;ZI)I")
    public static int method2404(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1022[--Statics.field1208];
            int var4 = field1027[--Statics.field378];
            field1022[++Statics.field1208 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1208 -= 2;
            String var5 = field1022[Statics.field1208];
            String var6 = field1022[Statics.field1208 + 1];
            field1022[++Statics.field1208 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1022[--Statics.field1208];
            int var8 = field1027[--Statics.field378];
            field1022[++Statics.field1208 - 1] = var7 + class306.method472(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1022[--Statics.field1208];
            field1022[++Statics.field1208 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1027[--Statics.field378];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1025.setTime(new Date(var11));
            int var13 = field1025.get(5);
            int var14 = field1025.get(2);
            int var15 = field1025.get(1);
            field1022[++Statics.field1208 - 1] = var13 + "-" + field1019[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1208 -= 2;
            String var16 = field1022[Statics.field1208];
            String var17 = field1022[Statics.field1208 + 1];
            if (Statics.field1949.field562 != null && Statics.field1949.field562.field2596) {
                field1022[++Statics.field1208 - 1] = var17;
            } else {
                field1022[++Statics.field1208 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1027[--Statics.field378];
            field1022[++Statics.field1208 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1208 -= 2;
            int[] var19 = field1027;
            int var20 = ++Statics.field378 - 1;
            String var21 = field1022[Statics.field1208];
            String var22 = field1022[Statics.field1208 + 1];
            int var23 = client.field600;
            int var24 = var21.length();
            int var25 = var22.length();
            int var26 = 0;
            int var27 = 0;
            char var28 = 0;
            char var29 = 0;
            int var38;
            label210: while (true) {
                if (var26 - var28 >= var24 && var27 - var29 >= var25) {
                    int var30 = Math.min(var24, var25);
                    for (int var31 = 0; var31 < var30; var31++) {
                        char var34 = var21.charAt(var31);
                        char var35 = var22.charAt(var31);
                        if (var34 != var35 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
                            char var36 = Character.toLowerCase(var34);
                            char var37 = Character.toLowerCase(var35);
                            if (var36 != var37) {
                                var38 = class174.method4227(var36, var23) - class174.method4227(var37, var23);
                                break label210;
                            }
                        }
                    }
                    int var39 = var24 - var25;
                    if (var39 == 0) {
                        for (int var40 = 0; var40 < var30; var40++) {
                            char var41 = var21.charAt(var40);
                            char var42 = var22.charAt(var40);
                            if (var41 != var42) {
                                var38 = class174.method4227(var41, var23) - class174.method4227(var42, var23);
                                break label210;
                            }
                        }
                        var38 = 0;
                    } else {
                        var38 = var39;
                    }
                    break;
                }
                if (var26 - var28 >= var24) {
                    var38 = -1;
                    break;
                }
                if (var27 - var29 >= var25) {
                    var38 = 1;
                    break;
                }
                char var43;
                if (var28 == 0) {
                    var43 = var21.charAt(var26++);
                } else {
                    var43 = var28;
                    boolean var44 = false;
                }
                char var45;
                if (var29 == 0) {
                    var45 = var22.charAt(var27++);
                } else {
                    var45 = var29;
                    boolean var46 = false;
                }
                var28 = class174.method1721(var43);
                var29 = class174.method1721(var45);
                char var47 = class174.method4078(var43, var23);
                char var48 = class174.method4078(var45, var23);
                if (var47 != var48 && Character.toUpperCase(var47) != Character.toUpperCase(var48)) {
                    char var49 = Character.toLowerCase(var47);
                    char var50 = Character.toLowerCase(var48);
                    if (var49 != var50) {
                        var38 = class174.method4227(var49, var23) - class174.method4227(var50, var23);
                        break;
                    }
                }
            }
            var19[var20] = class306.method3518(var38);
            return 1;
        } else if (arg0 == 4108) {
            String var51 = field1022[--Statics.field1208];
            Statics.field378 -= 2;
            int var52 = field1027[Statics.field378];
            int var53 = field1027[Statics.field378 + 1];
            byte[] var54 = Statics.field25.method4250(var53, 0);
            class299 var55 = new class299(var54);
            field1027[++Statics.field378 - 1] = var55.method5112(var51, var52);
            return 1;
        } else if (arg0 == 4109) {
            String var56 = field1022[--Statics.field1208];
            Statics.field378 -= 2;
            int var57 = field1027[Statics.field378];
            int var58 = field1027[Statics.field378 + 1];
            byte[] var59 = Statics.field25.method4250(var58, 0);
            class299 var60 = new class299(var59);
            field1027[++Statics.field378 - 1] = var60.method5111(var56, var57);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1208 -= 2;
            String var61 = field1022[Statics.field1208];
            String var62 = field1022[Statics.field1208 + 1];
            if (field1027[--Statics.field378] == 1) {
                field1022[++Statics.field1208 - 1] = var61;
            } else {
                field1022[++Statics.field1208 - 1] = var62;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var63 = field1022[--Statics.field1208];
            field1022[++Statics.field1208 - 1] = class300.method5208(var63);
            return 1;
        } else if (arg0 == 4112) {
            String var64 = field1022[--Statics.field1208];
            int var65 = field1027[--Statics.field378];
            field1022[++Statics.field1208 - 1] = var64 + (char) var65;
            return 1;
        } else if (arg0 == 4113) {
            int var66 = field1027[--Statics.field378];
            int[] var67 = field1027;
            int var68 = ++Statics.field378 - 1;
            char var69 = (char) var66;
            boolean var70;
            if (var69 >= ' ' && var69 <= '~') {
                var70 = true;
            } else if (var69 >= 160 && var69 <= 255) {
                var70 = true;
            } else if (var69 == 8364 || var69 == 338 || var69 == 8212 || var69 == 339 || var69 == 376) {
                var70 = true;
            } else {
                var70 = false;
            }
            var67[var68] = var70 ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var71 = field1027[--Statics.field378];
            field1027[++Statics.field378 - 1] = class306.method2971((char) var71) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var72 = field1027[--Statics.field378];
            field1027[++Statics.field378 - 1] = class306.method2875((char) var72) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var73 = field1027[--Statics.field378];
            field1027[++Statics.field378 - 1] = class306.method3524((char) var73) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var74 = field1022[--Statics.field1208];
            if (var74 == null) {
                field1027[++Statics.field378 - 1] = 0;
            } else {
                field1027[++Statics.field378 - 1] = var74.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var75 = field1022[--Statics.field1208];
            Statics.field378 -= 2;
            int var76 = field1027[Statics.field378];
            int var77 = field1027[Statics.field378 + 1];
            field1022[++Statics.field1208 - 1] = var75.substring(var76, var77);
            return 1;
        } else if (arg0 == 4119) {
            String var78 = field1022[--Statics.field1208];
            StringBuilder var79 = new StringBuilder(var78.length());
            boolean var80 = false;
            for (int var81 = 0; var81 < var78.length(); var81++) {
                char var82 = var78.charAt(var81);
                if (var82 == '<') {
                    var80 = true;
                } else if (var82 == '>') {
                    var80 = false;
                } else if (!var80) {
                    var79.append(var82);
                }
            }
            field1022[++Statics.field1208 - 1] = var79.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var83 = field1022[--Statics.field1208];
            int var84 = field1027[--Statics.field378];
            field1027[++Statics.field378 - 1] = var83.indexOf(var84);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1208 -= 2;
            String var85 = field1022[Statics.field1208];
            String var86 = field1022[Statics.field1208 + 1];
            int var87 = field1027[--Statics.field378];
            field1027[++Statics.field378 - 1] = var85.indexOf(var86, var87);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.v(ILcs;ZI)I")
    public static int method1545(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1027[--Statics.field378];
            field1022[++Statics.field1208 - 1] = class270.method2571(var3).field3450;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field378 -= 2;
            int var4 = field1027[Statics.field378];
            int var5 = field1027[Statics.field378 + 1];
            class270 var6 = class270.method2571(var4);
            if (var5 < 1 || var5 > 5 || var6.field3464[var5 - 1] == null) {
                field1022[++Statics.field1208 - 1] = "";
            } else {
                field1022[++Statics.field1208 - 1] = var6.field3464[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field378 -= 2;
            int var7 = field1027[Statics.field378];
            int var8 = field1027[Statics.field378 + 1];
            class270 var9 = class270.method2571(var7);
            if (var8 < 1 || var8 > 5 || var9.field3465[var8 - 1] == null) {
                field1022[++Statics.field1208 - 1] = "";
            } else {
                field1022[++Statics.field1208 - 1] = var9.field3465[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1027[--Statics.field378];
            field1027[++Statics.field378 - 1] = class270.method2571(var10).field3488;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1027[--Statics.field378];
            field1027[++Statics.field378 - 1] = class270.method2571(var11).field3483 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1027[--Statics.field378];
            class270 var13 = class270.method2571(var12);
            if (var13.field3461 == -1 && var13.field3448 >= 0) {
                field1027[++Statics.field378 - 1] = var13.field3448;
            } else {
                field1027[++Statics.field378 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1027[--Statics.field378];
            class270 var15 = class270.method2571(var14);
            if (var15.field3461 >= 0 && var15.field3448 >= 0) {
                field1027[++Statics.field378 - 1] = var15.field3448;
            } else {
                field1027[++Statics.field378 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1027[--Statics.field378];
            field1027[++Statics.field378 - 1] = class270.method2571(var16).field3463 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1027[--Statics.field378];
            class270 var18 = class270.method2571(var17);
            if (var18.field3441 == -1 && var18.field3493 >= 0) {
                field1027[++Statics.field378 - 1] = var18.field3493;
            } else {
                field1027[++Statics.field378 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1027[--Statics.field378];
            class270 var20 = class270.method2571(var19);
            if (var20.field3441 >= 0 && var20.field3493 >= 0) {
                field1027[++Statics.field378 - 1] = var20.field3493;
            } else {
                field1027[++Statics.field378 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1022[--Statics.field1208];
            int var22 = field1027[--Statics.field378];
            client.method190(var21, var22 == 1);
            field1027[++Statics.field378 - 1] = Statics.field257;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1890 == null || Statics.field523 >= Statics.field257) {
                field1027[++Statics.field378 - 1] = -1;
            } else {
                field1027[++Statics.field378 - 1] = Statics.field1890[++Statics.field523 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field523 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.o(II)V")
    public static void method56(int arg0) {
        if (arg0 == -1 || !class231.method694(arg0)) {
            return;
        }
        class231[] var1 = Statics.field2616[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class231 var3 = var1[var2];
            if (var3.field2682 != null) {
                class57 var4 = new class57();
                var4.field512 = var3;
                var4.field526 = var3.field2682;
                method1001(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("as.ai(ILhh;ZI)V")
    public static void method533(int arg0, class227 arg1, boolean arg2) {
        class21 var3 = client.method1700().method5603(arg0);
        int var4 = Statics.field1949.field582;
        int var5 = (Statics.field1949.field901 >> 7) + Statics.field2316;
        int var6 = (Statics.field1949.field919 >> 7) + Statics.field1052;
        class227 var7 = new class227(var4, var5, var6);
        client.method1700().method5669(var3, var7, arg1, arg2);
    }
}
