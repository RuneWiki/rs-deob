package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bm")
public class class71 {

    @ObfuscatedName("bm.u")
    public static int[] field1038 = new int[5];

    @ObfuscatedName("bm.i")
    public static int[][] field1039 = new int[5][5000];

    @ObfuscatedName("bm.t")
    public static int[] field1040 = new int[1000];

    @ObfuscatedName("bm.l")
    public static String[] field1053 = new String[1000];

    @ObfuscatedName("bm.c")
    public static int field1043 = 0;

    @ObfuscatedName("bm.d")
    public static class52[] field1044 = new class52[50];

    @ObfuscatedName("bm.z")
    public static Calendar field1045 = Calendar.getInstance();

    @ObfuscatedName("bm.e")
    public static final String[] field1041 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bm.j")
    public static boolean field1047 = false;

    @ObfuscatedName("bm.y")
    public static boolean field1048 = false;

    @ObfuscatedName("bm.m")
    public static int field1050 = 0;

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.v(Lbw;I)V")
    public static void method952(class58 arg0) {
        method1872(arg0, 500000);
    }

    @ObfuscatedName("cn.s(Lbw;II)V")
    public static void method1872(class58 arg0, int arg1) {
        Object[] var2 = arg0.field551;
        class87 var13;
        if (Statics.method116(arg0.field552)) {
            Statics.field28 = (class37) var2[0];
            class258 var3 = Statics.field2412[Statics.field28.field328];
            int var4 = arg0.field552;
            int var5 = var3.field3266;
            int var6 = var3.field3283;
            int var7 = (var5 << 8) + var4;
            class87 var9 = class87.method2128(var7, var4);
            class87 var10;
            if (var9 == null) {
                int var11 = class239.method3168(var6, var4);
                class87 var12 = class87.method2128(var11, var4);
                if (var12 == null) {
                    var10 = null;
                } else {
                    var10 = var12;
                }
            } else {
                var10 = var9;
            }
            var13 = var10;
        } else {
            int var14 = (Integer) var2[0];
            class87 var15 = (class87) class87.field1239.method3687((long) var14);
            class87 var16;
            if (var15 == null) {
                byte[] var17 = Statics.field1109.method4270(var14, 0);
                if (var17 == null) {
                    var16 = null;
                } else {
                    class87 var18 = Statics.method1674(var17);
                    class87.field1239.method3689(var18, (long) var14);
                    var16 = var18;
                }
            } else {
                var16 = var15;
            }
            var13 = var16;
        }
        if (var13 == null) {
            return;
        }
        Statics.field1049 = 0;
        Statics.field3795 = 0;
        int var19 = -1;
        int[] var20 = var13.field1235;
        int[] var21 = var13.field1236;
        byte var22 = -1;
        field1043 = 0;
        field1047 = false;
        try {
            Statics.field1036 = new int[var13.field1238];
            int var23 = 0;
            Statics.field1034 = new String[var13.field1234];
            int var24 = 0;
            for (int var25 = 1; var25 < var2.length; var25++) {
                if (var2[var25] instanceof Integer) {
                    int var26 = (Integer) var2[var25];
                    if (var26 == -2147483647) {
                        var26 = arg0.field554;
                    }
                    if (var26 == -2147483646) {
                        var26 = arg0.field545;
                    }
                    if (var26 == -2147483645) {
                        var26 = arg0.field544 == null ? -1 : arg0.field544.field2638;
                    }
                    if (var26 == -2147483644) {
                        var26 = arg0.field546;
                    }
                    if (var26 == -2147483643) {
                        var26 = arg0.field544 == null ? -1 : arg0.field544.field2639;
                    }
                    if (var26 == -2147483642) {
                        var26 = arg0.field553 == null ? -1 : arg0.field553.field2638;
                    }
                    if (var26 == -2147483641) {
                        var26 = arg0.field553 == null ? -1 : arg0.field553.field2639;
                    }
                    if (var26 == -2147483640) {
                        var26 = arg0.field548;
                    }
                    if (var26 == -2147483639) {
                        var26 = arg0.field549;
                    }
                    Statics.field1036[var23++] = var26;
                } else if (var2[var25] instanceof String) {
                    String var27 = (String) var2[var25];
                    if (var27.equals("event_opbase")) {
                        var27 = arg0.field550;
                    }
                    Statics.field1034[var24++] = var27;
                }
            }
            int var28 = 0;
            field1050 = arg0.field557;
            while (true) {
                var28++;
                if (var28 > arg1) {
                    throw new RuntimeException();
                }
                var19++;
                int var88 = var20[var19];
                if (var88 >= 100) {
                    boolean var72;
                    if (var13.field1236[var19] == 1) {
                        var72 = true;
                    } else {
                        var72 = false;
                    }
                    int var73 = method113(var88, var13, var72);
                    switch(var73) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var88 == 0) {
                    field1040[++Statics.field1049 - 1] = var21[var19];
                } else if (var88 == 1) {
                    int var29 = var21[var19];
                    field1040[++Statics.field1049 - 1] = class228.field2596[var29];
                } else if (var88 == 2) {
                    int var30 = var21[var19];
                    class228.field2596[var30] = field1040[--Statics.field1049];
                    client.method143(var30);
                } else if (var88 == 3) {
                    field1053[++Statics.field3795 - 1] = var13.field1237[var19];
                } else if (var88 == 6) {
                    var19 += var21[var19];
                } else if (var88 == 7) {
                    Statics.field1049 -= 2;
                    if (field1040[Statics.field1049] != field1040[Statics.field1049 + 1]) {
                        var19 += var21[var19];
                    }
                } else if (var88 == 8) {
                    Statics.field1049 -= 2;
                    if (field1040[Statics.field1049] == field1040[Statics.field1049 + 1]) {
                        var19 += var21[var19];
                    }
                } else if (var88 == 9) {
                    Statics.field1049 -= 2;
                    if (field1040[Statics.field1049] < field1040[Statics.field1049 + 1]) {
                        var19 += var21[var19];
                    }
                } else if (var88 == 10) {
                    Statics.field1049 -= 2;
                    if (field1040[Statics.field1049] > field1040[Statics.field1049 + 1]) {
                        var19 += var21[var19];
                    }
                } else if (var88 == 21) {
                    if (field1043 == 0) {
                        return;
                    }
                    class52 var33 = field1044[--field1043];
                    var13 = var33.field506;
                    var20 = var13.field1235;
                    var21 = var13.field1236;
                    var19 = var33.field501;
                    Statics.field1036 = var33.field502;
                    Statics.field1034 = var33.field503;
                } else if (var88 == 25) {
                    int var34 = var21[var19];
                    field1040[++Statics.field1049 - 1] = class228.method3899(var34);
                } else if (var88 == 27) {
                    int var35 = var21[var19];
                    class228.method3538(var35, field1040[--Statics.field1049]);
                } else if (var88 == 31) {
                    Statics.field1049 -= 2;
                    if (field1040[Statics.field1049] <= field1040[Statics.field1049 + 1]) {
                        var19 += var21[var19];
                    }
                } else if (var88 == 32) {
                    Statics.field1049 -= 2;
                    if (field1040[Statics.field1049] >= field1040[Statics.field1049 + 1]) {
                        var19 += var21[var19];
                    }
                } else if (var88 == 33) {
                    field1040[++Statics.field1049 - 1] = Statics.field1036[var21[var19]];
                } else if (var88 == 34) {
                    Statics.field1036[var21[var19]] = field1040[--Statics.field1049];
                } else if (var88 == 35) {
                    field1053[++Statics.field3795 - 1] = Statics.field1034[var21[var19]];
                } else if (var88 == 36) {
                    Statics.field1034[var21[var19]] = field1053[--Statics.field3795];
                } else if (var88 == 37) {
                    int var36 = var21[var19];
                    Statics.field3795 -= var36;
                    String[] var37 = field1053;
                    int var38 = Statics.field3795;
                    String var39;
                    if (var36 == 0) {
                        var39 = "";
                    } else if (var36 == 1) {
                        String var40 = var37[var38];
                        if (var40 == null) {
                            var39 = "null";
                        } else {
                            var39 = var40.toString();
                        }
                    } else {
                        int var41 = var36 + var38;
                        int var42 = 0;
                        for (int var43 = var38; var43 < var41; var43++) {
                            String var44 = var37[var43];
                            if (var44 == null) {
                                var42 += 4;
                            } else {
                                var42 += var44.length();
                            }
                        }
                        StringBuilder var45 = new StringBuilder(var42);
                        for (int var46 = var38; var46 < var41; var46++) {
                            String var47 = var37[var46];
                            if (var47 == null) {
                                var45.append("null");
                            } else {
                                var45.append(var47);
                            }
                        }
                        var39 = var45.toString();
                    }
                    field1053[++Statics.field3795 - 1] = var39;
                } else if (var88 == 38) {
                    Statics.field1049--;
                } else if (var88 == 39) {
                    Statics.field3795--;
                } else if (var88 == 40) {
                    int var49 = var21[var19];
                    class87 var50 = (class87) class87.field1239.method3687((long) var49);
                    class87 var51;
                    if (var50 == null) {
                        byte[] var52 = Statics.field1109.method4270(var49, 0);
                        if (var52 == null) {
                            var51 = null;
                        } else {
                            class87 var53 = Statics.method1674(var52);
                            class87.field1239.method3689(var53, (long) var49);
                            var51 = var53;
                        }
                    } else {
                        var51 = var50;
                    }
                    class87 var54 = var51;
                    int[] var55 = new int[var51.field1238];
                    String[] var56 = new String[var51.field1234];
                    for (int var57 = 0; var57 < var54.field1244; var57++) {
                        var55[var57] = field1040[Statics.field1049 - var54.field1244 + var57];
                    }
                    for (int var58 = 0; var58 < var54.field1241; var58++) {
                        var56[var58] = field1053[Statics.field3795 - var54.field1241 + var58];
                    }
                    Statics.field1049 -= var54.field1244;
                    Statics.field3795 -= var54.field1241;
                    class52 var59 = new class52();
                    var59.field506 = var13;
                    var59.field501 = var19;
                    var59.field502 = Statics.field1036;
                    var59.field503 = Statics.field1034;
                    field1044[++field1043 - 1] = var59;
                    var13 = var54;
                    var20 = var54.field1235;
                    var21 = var54.field1236;
                    var19 = -1;
                    Statics.field1036 = var55;
                    Statics.field1034 = var56;
                } else if (var88 == 42) {
                    field1040[++Statics.field1049 - 1] = Statics.field270.method1802(var21[var19]);
                } else if (var88 == 43) {
                    Statics.field270.method1801(var21[var19], field1040[--Statics.field1049]);
                } else if (var88 == 44) {
                    int var60 = var21[var19] >> 16;
                    int var61 = var21[var19] & 0xFFFF;
                    int var62 = field1040[--Statics.field1049];
                    if (var62 < 0 || var62 > 5000) {
                        throw new RuntimeException();
                    }
                    field1038[var60] = var62;
                    byte var63 = -1;
                    if (var61 == 105) {
                        var63 = 0;
                    }
                    for (int var64 = 0; var64 < var62; var64++) {
                        field1039[var60][var64] = var63;
                    }
                } else if (var88 == 45) {
                    int var65 = var21[var19];
                    int var66 = field1040[--Statics.field1049];
                    if (var66 < 0 || var66 >= field1038[var65]) {
                        throw new RuntimeException();
                    }
                    field1040[++Statics.field1049 - 1] = field1039[var65][var66];
                } else if (var88 == 46) {
                    int var67 = var21[var19];
                    Statics.field1049 -= 2;
                    int var68 = field1040[Statics.field1049];
                    if (var68 < 0 || var68 >= field1038[var67]) {
                        throw new RuntimeException();
                    }
                    field1039[var67][var68] = field1040[Statics.field1049 + 1];
                } else if (var88 == 47) {
                    String var69 = Statics.field270.method1831(var21[var19]);
                    if (var69 == null) {
                        var69 = class240.field2830;
                    }
                    field1053[++Statics.field3795 - 1] = var69;
                } else if (var88 == 48) {
                    Statics.field270.method1800(var21[var19], field1053[--Statics.field3795]);
                } else if (var88 == 60) {
                    class200 var70 = var13.field1242[var21[var19]];
                    class214 var71 = (class214) var70.method3659((long) field1040[--Statics.field1049]);
                    if (var71 != null) {
                        var19 += var71.field2480;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var86) {
            StringBuilder var77 = new StringBuilder(30);
            var77.append("").append(var13.field2464).append(" ");
            for (int var78 = field1043 - 1; var78 >= 0; var78--) {
                var77.append("").append(field1044[var78].field506.field2464).append(" ");
            }
            var77.append("").append(var22);
            class155.method2337(var77.toString(), var86);
        } finally {
            if (field1047) {
                field1048 = true;
                class175 var82 = class175.method107(class172.field2257, client.field830.field1266);
                client.field830.method1875(var82);
                for (class57 var83 = (class57) client.field780.method3741(); var83 != null; var83 = (class57) client.field780.method3734()) {
                    if (var83.field536 == 0 || var83.field536 == 3) {
                        client.method5075(var83, true);
                    }
                }
                if (client.field709 != null) {
                    client.method3069(client.field709);
                    client.field709 = null;
                }
                field1048 = false;
                field1047 = false;
            }
        }
    }

    @ObfuscatedName("b.o(ILce;ZB)I")
    public static int method113(int arg0, class87 arg1, boolean arg2) {
        if (arg0 < 1000) {
            byte var10;
            if (arg0 == 100) {
                Statics.field1049 -= 3;
                int var3 = field1040[Statics.field1049];
                int var4 = field1040[Statics.field1049 + 1];
                int var5 = field1040[Statics.field1049 + 2];
                if (var4 == 0) {
                    throw new RuntimeException();
                }
                class233 var6 = class233.method2957(var3);
                if (var6.field2763 == null) {
                    var6.field2763 = new class233[var5 + 1];
                }
                if (var6.field2763.length <= var5) {
                    class233[] var7 = new class233[var5 + 1];
                    for (int var8 = 0; var8 < var6.field2763.length; var8++) {
                        var7[var8] = var6.field2763[var8];
                    }
                    var6.field2763 = var7;
                }
                if (var5 > 0 && var6.field2763[var5 - 1] == null) {
                    throw new RuntimeException("" + (var5 - 1));
                }
                class233 var9 = new class233();
                var9.field2680 = var4;
                var9.field2675 = var9.field2638 = var6.field2638;
                var9.field2639 = var5;
                var9.field2637 = true;
                var6.field2763[var5] = var9;
                if (arg2) {
                    Statics.field381 = var9;
                } else {
                    Statics.field1947 = var9;
                }
                client.method3069(var6);
                var10 = 1;
            } else if (arg0 == 101) {
                class233 var11 = arg2 ? Statics.field381 : Statics.field1947;
                class233 var12 = class233.method2957(var11.field2638);
                var12.field2763[var11.field2639] = null;
                client.method3069(var12);
                var10 = 1;
            } else if (arg0 == 102) {
                class233 var13 = class233.method2957(field1040[--Statics.field1049]);
                var13.field2763 = null;
                client.method3069(var13);
                var10 = 1;
            } else if (arg0 == 200) {
                Statics.field1049 -= 2;
                int var14 = field1040[Statics.field1049];
                int var15 = field1040[Statics.field1049 + 1];
                class233 var16 = class233.method976(var14, var15);
                if (var16 == null || var15 == -1) {
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = 1;
                    if (arg2) {
                        Statics.field381 = var16;
                    } else {
                        Statics.field1947 = var16;
                    }
                }
                var10 = 1;
            } else if (arg0 == 201) {
                class233 var17 = class233.method2957(field1040[--Statics.field1049]);
                if (var17 == null) {
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = 1;
                    if (arg2) {
                        Statics.field381 = var17;
                    } else {
                        Statics.field1947 = var17;
                    }
                }
                var10 = 1;
            } else {
                var10 = 2;
            }
            return var10;
        } else if (arg0 < 1100) {
            return method486(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return Statics.method975(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method390(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3192(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method618(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class233 var21 = arg2 ? Statics.field381 : Statics.field1947;
            byte var22;
            if (arg0 == 1500) {
                field1040[++Statics.field1049 - 1] = var21.field2651;
                var22 = 1;
            } else if (arg0 == 1501) {
                field1040[++Statics.field1049 - 1] = var21.field2652;
                var22 = 1;
            } else if (arg0 == 1502) {
                field1040[++Statics.field1049 - 1] = var21.field2653;
                var22 = 1;
            } else if (arg0 == 1503) {
                field1040[++Statics.field1049 - 1] = var21.field2654;
                var22 = 1;
            } else if (arg0 == 1504) {
                field1040[++Statics.field1049 - 1] = var21.field2658 ? 1 : 0;
                var22 = 1;
            } else if (arg0 == 1505) {
                field1040[++Statics.field1049 - 1] = var21.field2675;
                var22 = 1;
            } else {
                var22 = 2;
            }
            return var22;
        } else if (arg0 < 1700) {
            return method2936(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method989(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method2105(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method96(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method486(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return Statics.method975(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method390(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3192(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method618(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3600(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method475(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return Statics.method219(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            class233 var23 = class233.method2957(field1040[--Statics.field1049]);
            byte var28;
            if (arg0 == 2800) {
                int[] var24 = field1040;
                int var25 = ++Statics.field1049 - 1;
                int var26 = client.method3164(var23);
                int var27 = var26 >> 11 & 0x3F;
                var24[var25] = var27;
                var28 = 1;
            } else if (arg0 == 2801) {
                int var29 = field1040[--Statics.field1049];
                int var289 = var29 - 1;
                if (var23.field2729 == null || var289 >= var23.field2729.length || var23.field2729[var289] == null) {
                    field1053[++Statics.field3795 - 1] = "";
                } else {
                    field1053[++Statics.field3795 - 1] = var23.field2729[var289];
                }
                var28 = 1;
            } else if (arg0 == 2802) {
                if (var23.field2712 == null) {
                    field1053[++Statics.field3795 - 1] = "";
                } else {
                    field1053[++Statics.field3795 - 1] = var23.field2712;
                }
                var28 = 1;
            } else {
                var28 = 2;
            }
            return var28;
        } else if (arg0 < 3000) {
            return method96(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            byte var31;
            if (arg0 == 3100) {
                String var30 = field1053[--Statics.field3795];
                class86.method1515(0, "", var30);
                var31 = 1;
            } else if (arg0 == 3101) {
                Statics.field1049 -= 2;
                client.method2885(Statics.field341, field1040[Statics.field1049], field1040[Statics.field1049 + 1]);
                var31 = 1;
            } else if (arg0 == 3103) {
                if (!field1048) {
                    field1047 = true;
                }
                var31 = 1;
            } else if (arg0 == 3104) {
                String var32 = field1053[--Statics.field3795];
                int var33 = 0;
                boolean var34 = false;
                boolean var35 = false;
                int var36 = 0;
                int var37 = var32.length();
                int var38 = 0;
                boolean var40;
                while (true) {
                    if (var38 >= var37) {
                        var40 = var35;
                        break;
                    }
                    label2362: {
                        char var39 = var32.charAt(var38);
                        if (var38 == 0) {
                            if (var39 == '-') {
                                var34 = true;
                                break label2362;
                            }
                            if (var39 == '+') {
                                break label2362;
                            }
                        }
                        int var290;
                        if (var39 >= '0' && var39 <= '9') {
                            var290 = var39 - '0';
                        } else if (var39 >= 'A' && var39 <= 'Z') {
                            var290 = var39 - '7';
                        } else {
                            if (var39 < 'a' || var39 > 'z') {
                                var40 = false;
                                break;
                            }
                            var290 = var39 - 'W';
                        }
                        if (var290 >= 10) {
                            var40 = false;
                            break;
                        }
                        if (var34) {
                            var290 = -var290;
                        }
                        int var41 = var36 * 10 + var290;
                        if (var41 / 10 != var36) {
                            var40 = false;
                            break;
                        }
                        var36 = var41;
                        var35 = true;
                    }
                    var38++;
                }
                if (var40) {
                    int var43 = class308.method2351(var32, 10, true);
                    var33 = var43;
                }
                class175 var44 = class175.method107(class172.field2253, client.field830.field1266);
                var44.field2311.method3261(var33);
                client.field830.method1875(var44);
                var31 = 1;
            } else if (arg0 == 3105) {
                String var45 = field1053[--Statics.field3795];
                class175 var46 = class175.method107(class172.field2279, client.field830.field1266);
                var46.field2311.method3258(var45.length() + 1);
                var46.field2311.method3265(var45);
                client.field830.method1875(var46);
                var31 = 1;
            } else if (arg0 == 3106) {
                String var47 = field1053[--Statics.field3795];
                class175 var48 = class175.method107(class172.field2245, client.field830.field1266);
                var48.field2311.method3258(var47.length() + 1);
                var48.field2311.method3265(var47);
                client.field830.method1875(var48);
                var31 = 1;
            } else if (arg0 == 3107) {
                int var49 = field1040[--Statics.field1049];
                String var50 = field1053[--Statics.field3795];
                int var51 = class84.field1199;
                int[] var52 = class84.field1205;
                boolean var53 = false;
                class294 var54 = new class294(var50, Statics.field2289);
                for (int var55 = 0; var55 < var51; var55++) {
                    class62 var56 = client.field735[var52[var55]];
                    if (var56 != null && Statics.field341 != var56 && var56.field593 != null && var56.field593.equals(var54)) {
                        if (var49 == 1) {
                            class175 var57 = class175.method107(class172.field2228, client.field830.field1266);
                            var57.field2311.method3311(var52[var55]);
                            var57.field2311.method3300(0);
                            client.field830.method1875(var57);
                        } else if (var49 == 4) {
                            class175 var58 = class175.method107(class172.field2266, client.field830.field1266);
                            var58.field2311.method3311(var52[var55]);
                            var58.field2311.method3301(0);
                            client.field830.method1875(var58);
                        } else if (var49 == 6) {
                            class175 var59 = class175.method107(class172.field2264, client.field830.field1266);
                            var59.field2311.method3311(var52[var55]);
                            var59.field2311.method3300(0);
                            client.field830.method1875(var59);
                        } else if (var49 == 7) {
                            class175 var60 = class175.method107(class172.field2256, client.field830.field1266);
                            var60.field2311.method3258(0);
                            var60.field2311.method3310(var52[var55]);
                            client.field830.method1875(var60);
                        }
                        var53 = true;
                        break;
                    }
                }
                if (!var53) {
                    class86.method1515(4, "", class240.field2828 + var50);
                }
                var31 = 1;
            } else if (arg0 == 3108) {
                Statics.field1049 -= 3;
                int var61 = field1040[Statics.field1049];
                int var62 = field1040[Statics.field1049 + 1];
                int var63 = field1040[Statics.field1049 + 2];
                class233 var64 = class233.method2957(var63);
                client.method977(var64, var61, var62);
                var31 = 1;
            } else if (arg0 == 3109) {
                Statics.field1049 -= 2;
                int var65 = field1040[Statics.field1049];
                int var66 = field1040[Statics.field1049 + 1];
                class233 var67 = arg2 ? Statics.field381 : Statics.field1947;
                client.method977(var67, var65, var66);
                var31 = 1;
            } else if (arg0 == 3110) {
                Statics.field2577 = field1040[--Statics.field1049] == 1;
                var31 = 1;
            } else if (arg0 == 3111) {
                field1040[++Statics.field1049 - 1] = Statics.field580.field997 ? 1 : 0;
                var31 = 1;
            } else if (arg0 == 3112) {
                Statics.field580.field997 = field1040[--Statics.field1049] == 1;
                class68.method3016();
                var31 = 1;
            } else if (arg0 == 3113) {
                String var68 = field1053[--Statics.field3795];
                boolean var69 = field1040[--Statics.field1049] == 1;
                if (var69) {
                    label2213: {
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(var68));
                                break label2213;
                            } catch (Exception var288) {
                            }
                        }
                        if (class46.field405.startsWith("win")) {
                            class46.method658(var68, 0);
                        } else if (class46.field405.startsWith("mac")) {
                            class46.method292(var68, 1, "openjs");
                        } else {
                            class46.method658(var68, 2);
                        }
                    }
                } else {
                    class46.method658(var68, 3);
                }
                var31 = 1;
            } else if (arg0 == 3115) {
                int var71 = field1040[--Statics.field1049];
                class175 var72 = class175.method107(class172.field2193, client.field830.field1266);
                var72.field2311.method3259(var71);
                client.field830.method1875(var72);
                var31 = 1;
            } else if (arg0 == 3116) {
                int var73 = field1040[--Statics.field1049];
                Statics.field3795 -= 2;
                String var74 = field1053[Statics.field3795];
                String var75 = field1053[Statics.field3795 + 1];
                if (var74.length() > 500) {
                    var31 = 1;
                } else if (var75.length() > 500) {
                    var31 = 1;
                } else {
                    class175 var76 = class175.method107(class172.field2232, client.field830.field1266);
                    var76.field2311.method3259(1 + class185.method3230(var74) + class185.method3230(var75));
                    var76.field2311.method3300(var73);
                    var76.field2311.method3265(var74);
                    var76.field2311.method3265(var75);
                    client.field830.method1875(var76);
                    var31 = 1;
                }
            } else if (arg0 == 3117) {
                client.field820 = field1040[--Statics.field1049] == 1;
                var31 = 1;
            } else if (arg0 == 3118) {
                client.field767 = field1040[--Statics.field1049] == 1;
                var31 = 1;
            } else if (arg0 == 3119) {
                client.field620 = field1040[--Statics.field1049] == 1;
                var31 = 1;
            } else if (arg0 == 3120) {
                if (field1040[--Statics.field1049] == 1) {
                    client.field739 |= 0x1;
                } else {
                    client.field739 &= 0xFFFFFFFE;
                }
                var31 = 1;
            } else if (arg0 == 3121) {
                if (field1040[--Statics.field1049] == 1) {
                    client.field739 |= 0x2;
                } else {
                    client.field739 &= 0xFFFFFFFD;
                }
                var31 = 1;
            } else if (arg0 == 3122) {
                if (field1040[--Statics.field1049] == 1) {
                    client.field739 |= 0x4;
                } else {
                    client.field739 &= 0xFFFFFFFB;
                }
                var31 = 1;
            } else if (arg0 == 3123) {
                if (field1040[--Statics.field1049] == 1) {
                    client.field739 |= 0x8;
                } else {
                    client.field739 &= 0xFFFFFFF7;
                }
                var31 = 1;
            } else if (arg0 == 3124) {
                client.field739 = 0;
                var31 = 1;
            } else if (arg0 == 3125) {
                client.field669 = field1040[--Statics.field1049] == 1;
                var31 = 1;
            } else if (arg0 == 3126) {
                client.field734 = field1040[--Statics.field1049] == 1;
                var31 = 1;
            } else if (arg0 == 3127) {
                client.method536(field1040[--Statics.field1049] == 1);
                var31 = 1;
            } else if (arg0 == 3128) {
                field1040[++Statics.field1049 - 1] = client.method3516() ? 1 : 0;
                var31 = 1;
            } else if (arg0 == 3129) {
                Statics.field1049 -= 2;
                client.field803 = field1040[Statics.field1049];
                client.field700 = field1040[Statics.field1049 + 1];
                var31 = 1;
            } else if (arg0 == 3130) {
                Statics.field1049 -= 2;
                var31 = 1;
            } else if (arg0 == 3131) {
                Statics.field1049--;
                var31 = 1;
            } else if (arg0 == 3132) {
                field1040[++Statics.field1049 - 1] = Statics.field2428;
                field1040[++Statics.field1049 - 1] = Statics.field117;
                var31 = 1;
            } else if (arg0 == 3133) {
                Statics.field1049--;
                var31 = 1;
            } else if (arg0 == 3134) {
                var31 = 1;
            } else if (arg0 == 3135) {
                Statics.field1049 -= 2;
                var31 = 1;
            } else {
                var31 = 2;
            }
            return var31;
        } else if (arg0 < 3300) {
            byte var80;
            if (arg0 == 3200) {
                Statics.field1049 -= 3;
                int var77 = field1040[Statics.field1049];
                int var78 = field1040[Statics.field1049 + 1];
                int var79 = field1040[Statics.field1049 + 2];
                if (client.field853 != 0 && var78 != 0 && client.field855 < 50) {
                    client.field856[client.field855] = var77;
                    client.field857[client.field855] = var78;
                    client.field809[client.field855] = var79;
                    client.field860[client.field855] = null;
                    client.field859[client.field855] = 0;
                    client.field855++;
                }
                var80 = 1;
            } else if (arg0 == 3201) {
                int var81 = field1040[--Statics.field1049];
                if (var81 == -1 && !client.field832) {
                    class220.method3158();
                } else if (var81 != -1 && client.field851 != var81 && client.field850 != 0 && !client.field832) {
                    class220.method3513(2, Statics.field1161, var81, 0, client.field850, false);
                }
                client.field851 = var81;
                var80 = 1;
            } else if (arg0 == 3202) {
                Statics.field1049 -= 2;
                int var82 = field1040[Statics.field1049];
                int var83 = field1040[Statics.field1049 + 1];
                if (client.field850 != 0 && var82 != -1) {
                    class220.method210(Statics.field1836, var82, 0, client.field850, false);
                    client.field832 = true;
                }
                var80 = 1;
            } else {
                var80 = 2;
            }
            return var80;
        } else if (arg0 < 3400) {
            return Statics.method211(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method2100(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            byte var84;
            if (arg0 == 3600) {
                if (Statics.field1240.field1007 == 0) {
                    field1040[++Statics.field1049 - 1] = -2;
                } else if (Statics.field1240.field1007 == 1) {
                    field1040[++Statics.field1049 - 1] = -1;
                } else {
                    field1040[++Statics.field1049 - 1] = Statics.field1240.field1014.method4991();
                }
                var84 = 1;
            } else if (arg0 == 3601) {
                int var85 = field1040[--Statics.field1049];
                if (Statics.field1240.method1536() && var85 >= 0 && var85 < Statics.field1240.field1014.method4991()) {
                    class295 var86 = (class295) Statics.field1240.field1014.method5000(var85);
                    field1053[++Statics.field3795 - 1] = var86.method4952();
                    field1053[++Statics.field3795 - 1] = var86.method4953();
                } else {
                    field1053[++Statics.field3795 - 1] = "";
                    field1053[++Statics.field3795 - 1] = "";
                }
                var84 = 1;
            } else if (arg0 == 3602) {
                int var87 = field1040[--Statics.field1049];
                if (Statics.field1240.method1536() && var87 >= 0 && var87 < Statics.field1240.field1014.method4991()) {
                    field1040[++Statics.field1049 - 1] = ((class290) Statics.field1240.field1014.method5000(var87)).field3664;
                } else {
                    field1040[++Statics.field1049 - 1] = 0;
                }
                var84 = 1;
            } else if (arg0 == 3603) {
                int var88 = field1040[--Statics.field1049];
                if (Statics.field1240.method1536() && var88 >= 0 && var88 < Statics.field1240.field1014.method4991()) {
                    field1040[++Statics.field1049 - 1] = ((class290) Statics.field1240.field1014.method5000(var88)).field3663;
                } else {
                    field1040[++Statics.field1049 - 1] = 0;
                }
                var84 = 1;
            } else if (arg0 == 3604) {
                String var89 = field1053[--Statics.field3795];
                int var90 = field1040[--Statics.field1049];
                class175 var91 = class175.method107(class172.field2223, client.field830.field1266);
                var91.field2311.method3258(class185.method3230(var89) + 1);
                var91.field2311.method3265(var89);
                var91.field2311.method3300(var90);
                client.field830.method1875(var91);
                var84 = 1;
            } else if (arg0 == 3605) {
                String var92 = field1053[--Statics.field3795];
                Statics.field1240.method1549(var92);
                var84 = 1;
            } else if (arg0 == 3606) {
                String var93 = field1053[--Statics.field3795];
                Statics.field1240.method1546(var93);
                var84 = 1;
            } else if (arg0 == 3607) {
                String var94 = field1053[--Statics.field3795];
                Statics.field1240.method1543(var94);
                var84 = 1;
            } else if (arg0 == 3608) {
                String var95 = field1053[--Statics.field3795];
                Statics.field1240.method1565(var95);
                var84 = 1;
            } else if (arg0 == 3609) {
                String var96 = field1053[--Statics.field3795];
                String var97 = client.method4246(var96);
                field1040[++Statics.field1049 - 1] = Statics.field1240.method1560(new class294(var97, Statics.field2289), false) ? 1 : 0;
                var84 = 1;
            } else if (arg0 == 3611) {
                if (Statics.field65 == null) {
                    field1053[++Statics.field3795 - 1] = "";
                } else {
                    field1053[++Statics.field3795 - 1] = Statics.field65.field3687;
                }
                var84 = 1;
            } else if (arg0 == 3612) {
                if (Statics.field65 == null) {
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = Statics.field65.method4991();
                }
                var84 = 1;
            } else if (arg0 == 3613) {
                int var98 = field1040[--Statics.field1049];
                if (Statics.field65 == null || var98 >= Statics.field65.method4991()) {
                    field1053[++Statics.field3795 - 1] = "";
                } else {
                    field1053[++Statics.field3795 - 1] = Statics.field65.method5000(var98).method4951().method5082();
                }
                var84 = 1;
            } else if (arg0 == 3614) {
                int var99 = field1040[--Statics.field1049];
                if (Statics.field65 == null || var99 >= Statics.field65.method4991()) {
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = ((class290) Statics.field65.method5000(var99)).method5068();
                }
                var84 = 1;
            } else if (arg0 == 3615) {
                int var100 = field1040[--Statics.field1049];
                if (Statics.field65 == null || var100 >= Statics.field65.method4991()) {
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = ((class290) Statics.field65.method5000(var100)).field3663;
                }
                var84 = 1;
            } else if (arg0 == 3616) {
                field1040[++Statics.field1049 - 1] = Statics.field65 == null ? 0 : Statics.field65.field3689;
                var84 = 1;
            } else if (arg0 == 3617) {
                String var101 = field1053[--Statics.field3795];
                if (Statics.field65 != null) {
                    class175 var102 = class175.method107(class172.field2268, client.field830.field1266);
                    var102.field2311.method3258(class185.method3230(var101));
                    var102.field2311.method3265(var101);
                    client.field830.method1875(var102);
                }
                var84 = 1;
            } else if (arg0 == 3618) {
                field1040[++Statics.field1049 - 1] = Statics.field65 == null ? 0 : Statics.field65.field3690;
                var84 = 1;
            } else if (arg0 == 3619) {
                String var103 = field1053[--Statics.field3795];
                client.method2872(var103);
                var84 = 1;
            } else if (arg0 == 3620) {
                class175 var104 = class175.method107(class172.field2189, client.field830.field1266);
                var104.field2311.method3258(0);
                client.field830.method1875(var104);
                var84 = 1;
            } else if (arg0 == 3621) {
                if (Statics.field1240.method1536()) {
                    field1040[++Statics.field1049 - 1] = Statics.field1240.field1010.method4991();
                } else {
                    field1040[++Statics.field1049 - 1] = -1;
                }
                var84 = 1;
            } else if (arg0 == 3622) {
                int var105 = field1040[--Statics.field1049];
                if (Statics.field1240.method1536() && var105 >= 0 && var105 < Statics.field1240.field1010.method4991()) {
                    class289 var106 = (class289) Statics.field1240.field1010.method5000(var105);
                    field1053[++Statics.field3795 - 1] = var106.method4952();
                    field1053[++Statics.field3795 - 1] = var106.method4953();
                } else {
                    field1053[++Statics.field3795 - 1] = "";
                    field1053[++Statics.field3795 - 1] = "";
                }
                var84 = 1;
            } else if (arg0 == 3623) {
                String var107 = field1053[--Statics.field3795];
                String var108 = client.method4246(var107);
                field1040[++Statics.field1049 - 1] = Statics.field1240.method1588(new class294(var108, Statics.field2289)) ? 1 : 0;
                var84 = 1;
            } else if (arg0 == 3624) {
                int var109 = field1040[--Statics.field1049];
                if (Statics.field65 == null || var109 >= Statics.field65.method4991() || !Statics.field65.method5000(var109).method4951().equals(Statics.field341.field593)) {
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = 1;
                }
                var84 = 1;
            } else if (arg0 == 3625) {
                if (Statics.field65 == null || Statics.field65.field3688 == null) {
                    field1053[++Statics.field3795 - 1] = "";
                } else {
                    field1053[++Statics.field3795 - 1] = Statics.field65.field3688;
                }
                var84 = 1;
            } else if (arg0 == 3626) {
                int var110 = field1040[--Statics.field1049];
                if (Statics.field65 == null || var110 >= Statics.field65.method4991() || !((class284) Statics.field65.method5000(var110)).method4932()) {
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = 1;
                }
                var84 = 1;
            } else if (arg0 == 3627) {
                int var111 = field1040[--Statics.field1049];
                if (Statics.field65 == null || var111 >= Statics.field65.method4991() || !((class284) Statics.field65.method5000(var111)).method4935()) {
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = 1;
                }
                var84 = 1;
            } else if (arg0 == 3628) {
                Statics.field1240.field1014.method5009();
                var84 = 1;
            } else if (arg0 == 3629) {
                boolean var112 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1014.method5010(new class312(var112));
                var84 = 1;
            } else if (arg0 == 3630) {
                boolean var113 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1014.method5010(new class313(var113));
                var84 = 1;
            } else if (arg0 == 3631) {
                boolean var114 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1014.method5010(new class146(var114));
                var84 = 1;
            } else if (arg0 == 3632) {
                boolean var115 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1014.method5010(new class140(var115));
                var84 = 1;
            } else if (arg0 == 3633) {
                boolean var116 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1014.method5010(new class145(var116));
                var84 = 1;
            } else if (arg0 == 3634) {
                boolean var117 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1014.method5010(new class148(var117));
                var84 = 1;
            } else if (arg0 == 3635) {
                boolean var118 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1014.method5010(new class144(var118));
                var84 = 1;
            } else if (arg0 == 3636) {
                boolean var119 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1014.method5010(new class142(var119));
                var84 = 1;
            } else if (arg0 == 3637) {
                boolean var120 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1014.method5010(new class141(var120));
                var84 = 1;
            } else if (arg0 == 3638) {
                boolean var121 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1014.method5010(new class143(var121));
                var84 = 1;
            } else if (arg0 == 3639) {
                Statics.field1240.field1014.method5001();
                var84 = 1;
            } else if (arg0 == 3640) {
                Statics.field1240.field1010.method5009();
                var84 = 1;
            } else if (arg0 == 3641) {
                boolean var122 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1010.method5010(new class312(var122));
                var84 = 1;
            } else if (arg0 == 3642) {
                boolean var123 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1010.method5010(new class313(var123));
                var84 = 1;
            } else if (arg0 == 3643) {
                Statics.field1240.field1010.method5001();
                var84 = 1;
            } else if (arg0 == 3644) {
                if (Statics.field65 != null) {
                    Statics.field65.method5009();
                }
                var84 = 1;
            } else if (arg0 == 3645) {
                boolean var124 = field1040[--Statics.field1049] == 1;
                if (Statics.field65 != null) {
                    Statics.field65.method5010(new class312(var124));
                }
                var84 = 1;
            } else if (arg0 == 3646) {
                boolean var125 = field1040[--Statics.field1049] == 1;
                if (Statics.field65 != null) {
                    Statics.field65.method5010(new class313(var125));
                }
                var84 = 1;
            } else if (arg0 == 3647) {
                boolean var126 = field1040[--Statics.field1049] == 1;
                if (Statics.field65 != null) {
                    Statics.field65.method5010(new class146(var126));
                }
                var84 = 1;
            } else if (arg0 == 3648) {
                boolean var127 = field1040[--Statics.field1049] == 1;
                if (Statics.field65 != null) {
                    Statics.field65.method5010(new class140(var127));
                }
                var84 = 1;
            } else if (arg0 == 3649) {
                boolean var128 = field1040[--Statics.field1049] == 1;
                if (Statics.field65 != null) {
                    Statics.field65.method5010(new class145(var128));
                }
                var84 = 1;
            } else if (arg0 == 3650) {
                boolean var129 = field1040[--Statics.field1049] == 1;
                if (Statics.field65 != null) {
                    Statics.field65.method5010(new class148(var129));
                }
                var84 = 1;
            } else if (arg0 == 3651) {
                boolean var130 = field1040[--Statics.field1049] == 1;
                if (Statics.field65 != null) {
                    Statics.field65.method5010(new class144(var130));
                }
                var84 = 1;
            } else if (arg0 == 3652) {
                boolean var131 = field1040[--Statics.field1049] == 1;
                if (Statics.field65 != null) {
                    Statics.field65.method5010(new class142(var131));
                }
                var84 = 1;
            } else if (arg0 == 3653) {
                boolean var132 = field1040[--Statics.field1049] == 1;
                if (Statics.field65 != null) {
                    Statics.field65.method5010(new class141(var132));
                }
                var84 = 1;
            } else if (arg0 == 3654) {
                boolean var133 = field1040[--Statics.field1049] == 1;
                if (Statics.field65 != null) {
                    Statics.field65.method5010(new class143(var133));
                }
                var84 = 1;
            } else if (arg0 == 3655) {
                if (Statics.field65 != null) {
                    Statics.field65.method5001();
                }
                var84 = 1;
            } else if (arg0 == 3656) {
                boolean var134 = field1040[--Statics.field1049] == 1;
                Statics.field1240.field1014.method5010(new class147(var134));
                var84 = 1;
            } else if (arg0 == 3657) {
                boolean var135 = field1040[--Statics.field1049] == 1;
                if (Statics.field65 != null) {
                    Statics.field65.method5010(new class147(var135));
                }
                var84 = 1;
            } else {
                var84 = 2;
            }
            return var84;
        } else if (arg0 < 4000) {
            return method1707(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method3236(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method4988(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            byte var137;
            if (arg0 == 4200) {
                int var136 = field1040[--Statics.field1049];
                field1053[++Statics.field3795 - 1] = Statics.method945(var136).field3462;
                var137 = 1;
            } else if (arg0 == 4201) {
                Statics.field1049 -= 2;
                int var138 = field1040[Statics.field1049];
                int var139 = field1040[Statics.field1049 + 1];
                class272 var140 = Statics.method945(var138);
                if (var139 < 1 || var139 > 5 || var140.field3476[var139 - 1] == null) {
                    field1053[++Statics.field3795 - 1] = "";
                } else {
                    field1053[++Statics.field3795 - 1] = var140.field3476[var139 - 1];
                }
                var137 = 1;
            } else if (arg0 == 4202) {
                Statics.field1049 -= 2;
                int var141 = field1040[Statics.field1049];
                int var142 = field1040[Statics.field1049 + 1];
                class272 var143 = Statics.method945(var141);
                if (var142 < 1 || var142 > 5 || var143.field3478[var142 - 1] == null) {
                    field1053[++Statics.field3795 - 1] = "";
                } else {
                    field1053[++Statics.field3795 - 1] = var143.field3478[var142 - 1];
                }
                var137 = 1;
            } else if (arg0 == 4203) {
                int var144 = field1040[--Statics.field1049];
                field1040[++Statics.field1049 - 1] = Statics.method945(var144).field3506;
                var137 = 1;
            } else if (arg0 == 4204) {
                int var145 = field1040[--Statics.field1049];
                field1040[++Statics.field1049 - 1] = Statics.method945(var145).field3473 == 1 ? 1 : 0;
                var137 = 1;
            } else if (arg0 == 4205) {
                int var146 = field1040[--Statics.field1049];
                class272 var147 = Statics.method945(var146);
                if (var147.field3457 == -1 && var147.field3493 >= 0) {
                    field1040[++Statics.field1049 - 1] = var147.field3493;
                } else {
                    field1040[++Statics.field1049 - 1] = var146;
                }
                var137 = 1;
            } else if (arg0 == 4206) {
                int var148 = field1040[--Statics.field1049];
                class272 var149 = Statics.method945(var148);
                if (var149.field3457 >= 0 && var149.field3493 >= 0) {
                    field1040[++Statics.field1049 - 1] = var149.field3493;
                } else {
                    field1040[++Statics.field1049 - 1] = var148;
                }
                var137 = 1;
            } else if (arg0 == 4207) {
                int var150 = field1040[--Statics.field1049];
                field1040[++Statics.field1049 - 1] = Statics.method945(var150).field3490 ? 1 : 0;
                var137 = 1;
            } else if (arg0 == 4208) {
                int var151 = field1040[--Statics.field1049];
                class272 var152 = Statics.method945(var151);
                if (var152.field3494 == -1 && var152.field3505 >= 0) {
                    field1040[++Statics.field1049 - 1] = var152.field3505;
                } else {
                    field1040[++Statics.field1049 - 1] = var151;
                }
                var137 = 1;
            } else if (arg0 == 4209) {
                int var153 = field1040[--Statics.field1049];
                class272 var154 = Statics.method945(var153);
                if (var154.field3494 >= 0 && var154.field3505 >= 0) {
                    field1040[++Statics.field1049 - 1] = var154.field3505;
                } else {
                    field1040[++Statics.field1049 - 1] = var153;
                }
                var137 = 1;
            } else if (arg0 == 4210) {
                String var155 = field1053[--Statics.field3795];
                int var156 = field1040[--Statics.field1049];
                boolean var158 = var156 == 1;
                String var159 = var155.toLowerCase();
                short[] var160 = new short[16];
                int var161 = 0;
                int var162 = 0;
                while (true) {
                    if (var162 >= Statics.field1005) {
                        Statics.field2817 = var160;
                        Statics.field1921 = 0;
                        Statics.field558 = var161;
                        String[] var166 = new String[Statics.field558];
                        for (int var167 = 0; var167 < Statics.field558; var167++) {
                            var166[var167] = Statics.method945(var160[var167]).field3462;
                        }
                        short[] var168 = Statics.field2817;
                        class182.method1856(var166, var168, 0, var166.length - 1);
                        break;
                    }
                    class272 var163 = Statics.method945(var162);
                    if ((!var158 || var163.field3461) && var163.field3457 == -1 && var163.field3462.toLowerCase().indexOf(var159) != -1) {
                        if (var161 >= 250) {
                            Statics.field558 = -1;
                            Statics.field2817 = null;
                            break;
                        }
                        if (var161 >= var160.length) {
                            short[] var164 = new short[var160.length * 2];
                            for (int var165 = 0; var165 < var161; var165++) {
                                var164[var165] = var160[var165];
                            }
                            var160 = var164;
                        }
                        var160[var161++] = (short) var162;
                    }
                    var162++;
                }
                field1040[++Statics.field1049 - 1] = Statics.field558;
                var137 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field2817 == null || Statics.field1921 >= Statics.field558) {
                    field1040[++Statics.field1049 - 1] = -1;
                } else {
                    field1040[++Statics.field1049 - 1] = Statics.field2817[++Statics.field1921 - 1] & 0xFFFF;
                }
                var137 = 1;
            } else if (arg0 == 4212) {
                Statics.field1921 = 0;
                var137 = 1;
            } else {
                var137 = 2;
            }
            return var137;
        } else if (arg0 < 5100) {
            byte var169;
            if (arg0 == 5000) {
                field1040[++Statics.field1049 - 1] = client.field833;
                var169 = 1;
            } else if (arg0 == 5001) {
                Statics.field1049 -= 3;
                client.field833 = field1040[Statics.field1049];
                Statics.field1078 = class310.method3081(field1040[Statics.field1049 + 1]);
                if (Statics.field1078 == null) {
                    Statics.field1078 = class310.field3766;
                }
                client.field626 = field1040[Statics.field1049 + 2];
                class175 var170 = class175.method107(class172.field2210, client.field830.field1266);
                var170.field2311.method3258(client.field833);
                var170.field2311.method3258(Statics.field1078.field3769);
                var170.field2311.method3258(client.field626);
                client.field830.method1875(var170);
                var169 = 1;
            } else if (arg0 == 5002) {
                String var171 = field1053[--Statics.field3795];
                Statics.field1049 -= 2;
                int var172 = field1040[Statics.field1049];
                int var173 = field1040[Statics.field1049 + 1];
                class175 var174 = class175.method107(class172.field2187, client.field830.field1266);
                var174.field2311.method3258(class185.method3230(var171) + 2);
                var174.field2311.method3265(var171);
                var174.field2311.method3258(var172 - 1);
                var174.field2311.method3258(var173);
                client.field830.method1875(var174);
                var169 = 1;
            } else if (arg0 == 5003) {
                Statics.field1049 -= 2;
                int var175 = field1040[Statics.field1049];
                int var176 = field1040[Statics.field1049 + 1];
                class89 var177 = (class89) class86.field1226.get(var175);
                class60 var178 = var177.method1861(var176);
                if (var178 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                    field1040[++Statics.field1049 - 1] = 0;
                    field1053[++Statics.field3795 - 1] = "";
                    field1053[++Statics.field3795 - 1] = "";
                    field1053[++Statics.field3795 - 1] = "";
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = var178.field568;
                    field1040[++Statics.field1049 - 1] = var178.field569;
                    field1053[++Statics.field3795 - 1] = var178.field571 == null ? "" : var178.field571;
                    field1053[++Statics.field3795 - 1] = var178.field570 == null ? "" : var178.field570;
                    field1053[++Statics.field3795 - 1] = var178.field576 == null ? "" : var178.field576;
                    field1040[++Statics.field1049 - 1] = var178.method994() ? 1 : (var178.method997() ? 2 : 0);
                }
                var169 = 1;
            } else if (arg0 == 5004) {
                int var180 = field1040[--Statics.field1049];
                class60 var181 = class86.method112(var180);
                if (var181 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                    field1040[++Statics.field1049 - 1] = 0;
                    field1053[++Statics.field3795 - 1] = "";
                    field1053[++Statics.field3795 - 1] = "";
                    field1053[++Statics.field3795 - 1] = "";
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = var181.field573;
                    field1040[++Statics.field1049 - 1] = var181.field569;
                    field1053[++Statics.field3795 - 1] = var181.field571 == null ? "" : var181.field571;
                    field1053[++Statics.field3795 - 1] = var181.field570 == null ? "" : var181.field570;
                    field1053[++Statics.field3795 - 1] = var181.field576 == null ? "" : var181.field576;
                    field1040[++Statics.field1049 - 1] = var181.method994() ? 1 : (var181.method997() ? 2 : 0);
                }
                var169 = 1;
            } else if (arg0 == 5005) {
                if (Statics.field1078 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                } else {
                    field1040[++Statics.field1049 - 1] = Statics.field1078.field3769;
                }
                var169 = 1;
            } else if (arg0 == 5008) {
                String var182 = field1053[--Statics.field3795];
                int var183 = field1040[--Statics.field1049];
                String var184 = var182.toLowerCase();
                byte var185 = 0;
                if (var184.startsWith(class240.field2832)) {
                    var185 = 0;
                    var182 = var182.substring(class240.field2832.length());
                } else if (var184.startsWith(class240.field3002)) {
                    var185 = 1;
                    var182 = var182.substring(class240.field3002.length());
                } else if (var184.startsWith(class240.field3004)) {
                    var185 = 2;
                    var182 = var182.substring(class240.field3004.length());
                } else if (var184.startsWith(class240.field2847)) {
                    var185 = 3;
                    var182 = var182.substring(class240.field2847.length());
                } else if (var184.startsWith(class240.field2893)) {
                    var185 = 4;
                    var182 = var182.substring(class240.field2893.length());
                } else if (var184.startsWith(class240.field3010)) {
                    var185 = 5;
                    var182 = var182.substring(class240.field3010.length());
                } else if (var184.startsWith(class240.field3012)) {
                    var185 = 6;
                    var182 = var182.substring(class240.field3012.length());
                } else if (var184.startsWith(class240.field3014)) {
                    var185 = 7;
                    var182 = var182.substring(class240.field3014.length());
                } else if (var184.startsWith(class240.field2842)) {
                    var185 = 8;
                    var182 = var182.substring(class240.field2842.length());
                } else if (var184.startsWith(class240.field3021)) {
                    var185 = 9;
                    var182 = var182.substring(class240.field3021.length());
                } else if (var184.startsWith(class240.field2844)) {
                    var185 = 10;
                    var182 = var182.substring(class240.field2844.length());
                } else if (var184.startsWith(class240.field2902)) {
                    var185 = 11;
                    var182 = var182.substring(class240.field2902.length());
                } else if (client.field625 != 0) {
                    if (var184.startsWith(class240.field3001)) {
                        var185 = 0;
                        var182 = var182.substring(class240.field3001.length());
                    } else if (var184.startsWith(class240.field3003)) {
                        var185 = 1;
                        var182 = var182.substring(class240.field3003.length());
                    } else if (var184.startsWith(class240.field3005)) {
                        var185 = 2;
                        var182 = var182.substring(class240.field3005.length());
                    } else if (var184.startsWith(class240.field2884)) {
                        var185 = 3;
                        var182 = var182.substring(class240.field2884.length());
                    } else if (var184.startsWith(class240.field3009)) {
                        var185 = 4;
                        var182 = var182.substring(class240.field3009.length());
                    } else if (var184.startsWith(class240.field3011)) {
                        var185 = 5;
                        var182 = var182.substring(class240.field3011.length());
                    } else if (var184.startsWith(class240.field3013)) {
                        var185 = 6;
                        var182 = var182.substring(class240.field3013.length());
                    } else if (var184.startsWith(class240.field2941)) {
                        var185 = 7;
                        var182 = var182.substring(class240.field2941.length());
                    } else if (var184.startsWith(class240.field2959)) {
                        var185 = 8;
                        var182 = var182.substring(class240.field2959.length());
                    } else if (var184.startsWith(class240.field3024)) {
                        var185 = 9;
                        var182 = var182.substring(class240.field3024.length());
                    } else if (var184.startsWith(class240.field2856)) {
                        var185 = 10;
                        var182 = var182.substring(class240.field2856.length());
                    } else if (var184.startsWith(class240.field3023)) {
                        var185 = 11;
                        var182 = var182.substring(class240.field3023.length());
                    }
                }
                String var186 = var182.toLowerCase();
                byte var187 = 0;
                if (var186.startsWith(class240.field3080)) {
                    var187 = 1;
                    var182 = var182.substring(class240.field3080.length());
                } else if (var186.startsWith(class240.field3026)) {
                    var187 = 2;
                    var182 = var182.substring(class240.field3026.length());
                } else if (var186.startsWith(class240.field3028)) {
                    var187 = 3;
                    var182 = var182.substring(class240.field3028.length());
                } else if (var186.startsWith(class240.field3030)) {
                    var187 = 4;
                    var182 = var182.substring(class240.field3030.length());
                } else if (var186.startsWith(class240.field3032)) {
                    var187 = 5;
                    var182 = var182.substring(class240.field3032.length());
                } else if (client.field625 != 0) {
                    if (var186.startsWith(class240.field2903)) {
                        var187 = 1;
                        var182 = var182.substring(class240.field2903.length());
                    } else if (var186.startsWith(class240.field3022)) {
                        var187 = 2;
                        var182 = var182.substring(class240.field3022.length());
                    } else if (var186.startsWith(class240.field3029)) {
                        var187 = 3;
                        var182 = var182.substring(class240.field3029.length());
                    } else if (var186.startsWith(class240.field3031)) {
                        var187 = 4;
                        var182 = var182.substring(class240.field3031.length());
                    } else if (var186.startsWith(class240.field3033)) {
                        var187 = 5;
                        var182 = var182.substring(class240.field3033.length());
                    }
                }
                class175 var188 = class175.method107(class172.field2206, client.field830.field1266);
                var188.field2311.method3258(0);
                int var189 = var188.field2311.field2386;
                var188.field2311.method3258(var183);
                var188.field2311.method3258(var185);
                var188.field2311.method3258(var187);
                class192 var190 = var188.field2311;
                int var191 = var190.field2386;
                int var192 = var182.length();
                byte[] var193 = new byte[var192];
                for (int var194 = 0; var194 < var192; var194++) {
                    char var195 = var182.charAt(var194);
                    if (!(var195 <= 0 || var195 >= 128) || !(var195 < 160 || var195 > 255)) {
                        var193[var194] = (byte) var195;
                    } else if (var195 == 8364) {
                        var193[var194] = -128;
                    } else if (var195 == 8218) {
                        var193[var194] = -126;
                    } else if (var195 == 402) {
                        var193[var194] = -125;
                    } else if (var195 == 8222) {
                        var193[var194] = -124;
                    } else if (var195 == 8230) {
                        var193[var194] = -123;
                    } else if (var195 == 8224) {
                        var193[var194] = -122;
                    } else if (var195 == 8225) {
                        var193[var194] = -121;
                    } else if (var195 == 710) {
                        var193[var194] = -120;
                    } else if (var195 == 8240) {
                        var193[var194] = -119;
                    } else if (var195 == 352) {
                        var193[var194] = -118;
                    } else if (var195 == 8249) {
                        var193[var194] = -117;
                    } else if (var195 == 338) {
                        var193[var194] = -116;
                    } else if (var195 == 381) {
                        var193[var194] = -114;
                    } else if (var195 == 8216) {
                        var193[var194] = -111;
                    } else if (var195 == 8217) {
                        var193[var194] = -110;
                    } else if (var195 == 8220) {
                        var193[var194] = -109;
                    } else if (var195 == 8221) {
                        var193[var194] = -108;
                    } else if (var195 == 8226) {
                        var193[var194] = -107;
                    } else if (var195 == 8211) {
                        var193[var194] = -106;
                    } else if (var195 == 8212) {
                        var193[var194] = -105;
                    } else if (var195 == 732) {
                        var193[var194] = -104;
                    } else if (var195 == 8482) {
                        var193[var194] = -103;
                    } else if (var195 == 353) {
                        var193[var194] = -102;
                    } else if (var195 == 8250) {
                        var193[var194] = -101;
                    } else if (var195 == 339) {
                        var193[var194] = -100;
                    } else if (var195 == 382) {
                        var193[var194] = -98;
                    } else if (var195 == 376) {
                        var193[var194] = -97;
                    } else {
                        var193[var194] = 63;
                    }
                }
                var190.method3330(var193.length);
                var190.field2386 += Statics.field3746.method3194(var193, 0, var193.length, var190.field2387, var190.field2386);
                var188.field2311.method3271(var188.field2311.field2386 - var189);
                client.field830.method1875(var188);
                var169 = 1;
            } else if (arg0 == 5009) {
                Statics.field3795 -= 2;
                String var198 = field1053[Statics.field3795];
                String var199 = field1053[Statics.field3795 + 1];
                class175 var200 = class175.method107(class172.field2244, client.field830.field1266);
                var200.field2311.method3259(0);
                int var201 = var200.field2311.field2386;
                var200.field2311.method3265(var198);
                class192 var202 = var200.field2311;
                int var203 = var202.field2386;
                int var204 = var199.length();
                byte[] var205 = new byte[var204];
                for (int var206 = 0; var206 < var204; var206++) {
                    char var207 = var199.charAt(var206);
                    if (!(var207 <= 0 || var207 >= 128) || !(var207 < 160 || var207 > 255)) {
                        var205[var206] = (byte) var207;
                    } else if (var207 == 8364) {
                        var205[var206] = -128;
                    } else if (var207 == 8218) {
                        var205[var206] = -126;
                    } else if (var207 == 402) {
                        var205[var206] = -125;
                    } else if (var207 == 8222) {
                        var205[var206] = -124;
                    } else if (var207 == 8230) {
                        var205[var206] = -123;
                    } else if (var207 == 8224) {
                        var205[var206] = -122;
                    } else if (var207 == 8225) {
                        var205[var206] = -121;
                    } else if (var207 == 710) {
                        var205[var206] = -120;
                    } else if (var207 == 8240) {
                        var205[var206] = -119;
                    } else if (var207 == 352) {
                        var205[var206] = -118;
                    } else if (var207 == 8249) {
                        var205[var206] = -117;
                    } else if (var207 == 338) {
                        var205[var206] = -116;
                    } else if (var207 == 381) {
                        var205[var206] = -114;
                    } else if (var207 == 8216) {
                        var205[var206] = -111;
                    } else if (var207 == 8217) {
                        var205[var206] = -110;
                    } else if (var207 == 8220) {
                        var205[var206] = -109;
                    } else if (var207 == 8221) {
                        var205[var206] = -108;
                    } else if (var207 == 8226) {
                        var205[var206] = -107;
                    } else if (var207 == 8211) {
                        var205[var206] = -106;
                    } else if (var207 == 8212) {
                        var205[var206] = -105;
                    } else if (var207 == 732) {
                        var205[var206] = -104;
                    } else if (var207 == 8482) {
                        var205[var206] = -103;
                    } else if (var207 == 353) {
                        var205[var206] = -102;
                    } else if (var207 == 8250) {
                        var205[var206] = -101;
                    } else if (var207 == 339) {
                        var205[var206] = -100;
                    } else if (var207 == 382) {
                        var205[var206] = -98;
                    } else if (var207 == 376) {
                        var205[var206] = -97;
                    } else {
                        var205[var206] = 63;
                    }
                }
                var202.method3330(var205.length);
                var202.field2386 += Statics.field3746.method3194(var205, 0, var205.length, var202.field2387, var202.field2386);
                var200.field2311.method3270(var200.field2311.field2386 - var201);
                client.field830.method1875(var200);
                var169 = 1;
            } else if (arg0 == 5015) {
                String var210;
                if (Statics.field341 == null || Statics.field341.field593 == null) {
                    var210 = "";
                } else {
                    var210 = Statics.field341.field593.method5082();
                }
                field1053[++Statics.field3795 - 1] = var210;
                var169 = 1;
            } else if (arg0 == 5016) {
                field1040[++Statics.field1049 - 1] = client.field626;
                var169 = 1;
            } else if (arg0 == 5017) {
                int var211 = field1040[--Statics.field1049];
                int[] var212 = field1040;
                int var213 = ++Statics.field1049 - 1;
                class89 var214 = (class89) class86.field1226.get(var211);
                int var215;
                if (var214 == null) {
                    var215 = 0;
                } else {
                    var215 = var214.method1862();
                }
                var212[var213] = var215;
                var169 = 1;
            } else if (arg0 == 5018) {
                int var216 = field1040[--Statics.field1049];
                int[] var217 = field1040;
                int var218 = ++Statics.field1049 - 1;
                class60 var219 = (class60) class86.field1227.method3659((long) var216);
                int var220;
                if (var219 == null) {
                    var220 = -1;
                } else if (class86.field1228.field2487 == var219.field2469) {
                    var220 = -1;
                } else {
                    var220 = ((class60) var219.field2469).field568;
                }
                var217[var218] = var220;
                var169 = 1;
            } else if (arg0 == 5019) {
                int var221 = field1040[--Statics.field1049];
                int[] var222 = field1040;
                int var223 = ++Statics.field1049 - 1;
                class60 var224 = (class60) class86.field1227.method3659((long) var221);
                int var225;
                if (var224 == null) {
                    var225 = -1;
                } else if (class86.field1228.field2487 == var224.field2470) {
                    var225 = -1;
                } else {
                    var225 = ((class60) var224.field2470).field568;
                }
                var222[var223] = var225;
                var169 = 1;
            } else if (arg0 == 5020) {
                String var226 = field1053[--Statics.field3795];
                if (var226.equalsIgnoreCase("toggleroof")) {
                    Statics.field580.field997 = !Statics.field580.field997;
                    class68.method3016();
                    if (Statics.field580.field997) {
                        class86.method1515(99, "", "Roofs are now all hidden");
                    } else {
                        class86.method1515(99, "", "Roofs will only be removed selectively");
                    }
                }
                if (var226.equalsIgnoreCase("displayfps")) {
                    client.field668 = !client.field668;
                }
                if (var226.equalsIgnoreCase("renderself")) {
                    client.field620 = !client.field620;
                }
                if (var226.equalsIgnoreCase("mouseovertext")) {
                    client.field767 = !client.field767;
                }
                if (client.field686 >= 2) {
                    if (var226.equalsIgnoreCase("showcoord")) {
                        Statics.field1937.field3862 = !Statics.field1937.field3862;
                    }
                    if (var226.equalsIgnoreCase("fpson")) {
                        client.field668 = true;
                    }
                    if (var226.equalsIgnoreCase("fpsoff")) {
                        client.field668 = false;
                    }
                    if (var226.equalsIgnoreCase("gc")) {
                        System.gc();
                    }
                    if (var226.equalsIgnoreCase("clientdrop")) {
                        client.method1459();
                    }
                }
                class175 var227 = class175.method107(class172.field2277, client.field830.field1266);
                var227.field2311.method3258(var226.length() + 1);
                var227.field2311.method3265(var226);
                client.field830.method1875(var227);
                var169 = 1;
            } else if (arg0 == 5021) {
                client.field835 = field1053[--Statics.field3795].toLowerCase().trim();
                var169 = 1;
            } else if (arg0 == 5022) {
                field1053[++Statics.field3795 - 1] = client.field835;
                var169 = 1;
            } else {
                var169 = 2;
            }
            return var169;
        } else if (arg0 < 5400) {
            return method3148(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method1472(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method1534(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method2862(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3029(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            byte var231;
            if (arg0 == 6600) {
                int var228 = Statics.field348;
                int var229 = (Statics.field341.field933 >> 7) + Statics.field6;
                int var230 = (Statics.field341.field964 >> 7) + Statics.field72;
                client.method2578().method5720(var228, var229, var230, true);
                var231 = 1;
            } else if (arg0 == 6601) {
                int var232 = field1040[--Statics.field1049];
                String var233 = "";
                class21 var234 = client.method2578().method5686(var232);
                if (var234 != null) {
                    var233 = var234.method233();
                }
                field1053[++Statics.field3795 - 1] = var233;
                var231 = 1;
            } else if (arg0 == 6602) {
                int var235 = field1040[--Statics.field1049];
                client.method2578().method5670(var235);
                var231 = 1;
            } else if (arg0 == 6603) {
                field1040[++Statics.field1049 - 1] = client.method2578().method5683();
                var231 = 1;
            } else if (arg0 == 6604) {
                int var236 = field1040[--Statics.field1049];
                client.method2578().method5681(var236);
                var231 = 1;
            } else if (arg0 == 6605) {
                field1040[++Statics.field1049 - 1] = client.method2578().method5685() ? 1 : 0;
                var231 = 1;
            } else if (arg0 == 6606) {
                class229 var237 = new class229(field1040[--Statics.field1049]);
                client.method2578().method5745(var237.field2603, var237.field2605);
                var231 = 1;
            } else if (arg0 == 6607) {
                class229 var238 = new class229(field1040[--Statics.field1049]);
                client.method2578().method5688(var238.field2603, var238.field2605);
                var231 = 1;
            } else if (arg0 == 6608) {
                class229 var239 = new class229(field1040[--Statics.field1049]);
                client.method2578().method5801(var239.field2606, var239.field2603, var239.field2605);
                var231 = 1;
            } else if (arg0 == 6609) {
                class229 var240 = new class229(field1040[--Statics.field1049]);
                client.method2578().method5690(var240.field2606, var240.field2603, var240.field2605);
                var231 = 1;
            } else if (arg0 == 6610) {
                field1040[++Statics.field1049 - 1] = client.method2578().method5691();
                field1040[++Statics.field1049 - 1] = client.method2578().method5692();
                var231 = 1;
            } else if (arg0 == 6611) {
                int var241 = field1040[--Statics.field1049];
                class21 var242 = client.method2578().method5686(var241);
                if (var242 == null) {
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = var242.method243().method4123();
                }
                var231 = 1;
            } else if (arg0 == 6612) {
                int var243 = field1040[--Statics.field1049];
                class21 var244 = client.method2578().method5686(var243);
                if (var244 == null) {
                    field1040[++Statics.field1049 - 1] = 0;
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = (var244.method279() - var244.method236() + 1) * 64;
                    field1040[++Statics.field1049 - 1] = (var244.method239() - var244.method238() + 1) * 64;
                }
                var231 = 1;
            } else if (arg0 == 6613) {
                int var245 = field1040[--Statics.field1049];
                class21 var246 = client.method2578().method5686(var245);
                if (var246 == null) {
                    field1040[++Statics.field1049 - 1] = 0;
                    field1040[++Statics.field1049 - 1] = 0;
                    field1040[++Statics.field1049 - 1] = 0;
                    field1040[++Statics.field1049 - 1] = 0;
                } else {
                    field1040[++Statics.field1049 - 1] = var246.method236() * 64;
                    field1040[++Statics.field1049 - 1] = var246.method238() * 64;
                    field1040[++Statics.field1049 - 1] = var246.method279() * 64 + 64 - 1;
                    field1040[++Statics.field1049 - 1] = var246.method239() * 64 + 64 - 1;
                }
                var231 = 1;
            } else if (arg0 == 6614) {
                int var247 = field1040[--Statics.field1049];
                class21 var248 = client.method2578().method5686(var247);
                if (var248 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                } else {
                    field1040[++Statics.field1049 - 1] = var248.method273();
                }
                var231 = 1;
            } else if (arg0 == 6615) {
                class229 var249 = client.method2578().method5693();
                if (var249 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                    field1040[++Statics.field1049 - 1] = -1;
                } else {
                    field1040[++Statics.field1049 - 1] = var249.field2603;
                    field1040[++Statics.field1049 - 1] = var249.field2605;
                }
                var231 = 1;
            } else if (arg0 == 6616) {
                field1040[++Statics.field1049 - 1] = client.method2578().method5778();
                var231 = 1;
            } else if (arg0 == 6617) {
                class229 var250 = new class229(field1040[--Statics.field1049]);
                class21 var251 = client.method2578().method5672();
                if (var251 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                    field1040[++Statics.field1049 - 1] = -1;
                    var231 = 1;
                } else {
                    int[] var252 = var251.method225(var250.field2606, var250.field2603, var250.field2605);
                    if (var252 == null) {
                        field1040[++Statics.field1049 - 1] = -1;
                        field1040[++Statics.field1049 - 1] = -1;
                    } else {
                        field1040[++Statics.field1049 - 1] = var252[0];
                        field1040[++Statics.field1049 - 1] = var252[1];
                    }
                    var231 = 1;
                }
            } else if (arg0 == 6618) {
                class229 var253 = new class229(field1040[--Statics.field1049]);
                class21 var254 = client.method2578().method5672();
                if (var254 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                    field1040[++Statics.field1049 - 1] = -1;
                    var231 = 1;
                } else {
                    class229 var255 = var254.method241(var253.field2603, var253.field2605);
                    if (var255 == null) {
                        field1040[++Statics.field1049 - 1] = -1;
                    } else {
                        field1040[++Statics.field1049 - 1] = var255.method4123();
                    }
                    var231 = 1;
                }
            } else if (arg0 == 6619) {
                Statics.field1049 -= 2;
                int var256 = field1040[Statics.field1049];
                class229 var257 = new class229(field1040[Statics.field1049 + 1]);
                method547(var256, var257, false);
                var231 = 1;
            } else if (arg0 == 6620) {
                Statics.field1049 -= 2;
                int var258 = field1040[Statics.field1049];
                class229 var259 = new class229(field1040[Statics.field1049 + 1]);
                method547(var258, var259, true);
                var231 = 1;
            } else if (arg0 == 6621) {
                Statics.field1049 -= 2;
                int var260 = field1040[Statics.field1049];
                class229 var261 = new class229(field1040[Statics.field1049 + 1]);
                class21 var262 = client.method2578().method5686(var260);
                if (var262 == null) {
                    field1040[++Statics.field1049 - 1] = 0;
                    var231 = 1;
                } else {
                    field1040[++Statics.field1049 - 1] = var262.method257(var261.field2606, var261.field2603, var261.field2605) ? 1 : 0;
                    var231 = 1;
                }
            } else if (arg0 == 6622) {
                field1040[++Statics.field1049 - 1] = client.method2578().method5732();
                field1040[++Statics.field1049 - 1] = client.method2578().method5857();
                var231 = 1;
            } else if (arg0 == 6623) {
                class229 var263 = new class229(field1040[--Statics.field1049]);
                class21 var264 = client.method2578().method5862(var263.field2606, var263.field2603, var263.field2605);
                if (var264 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                } else {
                    field1040[++Statics.field1049 - 1] = var264.method293();
                }
                var231 = 1;
            } else if (arg0 == 6624) {
                client.method2578().method5716(field1040[--Statics.field1049]);
                var231 = 1;
            } else if (arg0 == 6625) {
                client.method2578().method5697();
                var231 = 1;
            } else if (arg0 == 6626) {
                client.method2578().method5698(field1040[--Statics.field1049]);
                var231 = 1;
            } else if (arg0 == 6627) {
                client.method2578().method5699();
                var231 = 1;
            } else if (arg0 == 6628) {
                boolean var265 = field1040[--Statics.field1049] == 1;
                client.method2578().method5817(var265);
                var231 = 1;
            } else if (arg0 == 6629) {
                int var266 = field1040[--Statics.field1049];
                client.method2578().method5701(var266);
                var231 = 1;
            } else if (arg0 == 6630) {
                int var267 = field1040[--Statics.field1049];
                client.method2578().method5702(var267);
                var231 = 1;
            } else if (arg0 == 6631) {
                client.method2578().method5830();
                var231 = 1;
            } else if (arg0 == 6632) {
                boolean var268 = field1040[--Statics.field1049] == 1;
                client.method2578().method5704(var268);
                var231 = 1;
            } else if (arg0 == 6633) {
                Statics.field1049 -= 2;
                int var269 = field1040[Statics.field1049];
                boolean var270 = field1040[Statics.field1049 + 1] == 1;
                client.method2578().method5700(var269, var270);
                var231 = 1;
            } else if (arg0 == 6634) {
                Statics.field1049 -= 2;
                int var271 = field1040[Statics.field1049];
                boolean var272 = field1040[Statics.field1049 + 1] == 1;
                client.method2578().method5706(var271, var272);
                var231 = 1;
            } else if (arg0 == 6635) {
                field1040[++Statics.field1049 - 1] = client.method2578().method5707() ? 1 : 0;
                var231 = 1;
            } else if (arg0 == 6636) {
                int var273 = field1040[--Statics.field1049];
                field1040[++Statics.field1049 - 1] = client.method2578().method5708(var273) ? 1 : 0;
                var231 = 1;
            } else if (arg0 == 6637) {
                int var274 = field1040[--Statics.field1049];
                field1040[++Statics.field1049 - 1] = client.method2578().method5709(var274) ? 1 : 0;
                var231 = 1;
            } else if (arg0 == 6638) {
                Statics.field1049 -= 2;
                int var275 = field1040[Statics.field1049];
                class229 var276 = new class229(field1040[Statics.field1049 + 1]);
                class229 var277 = client.method2578().method5712(var275, var276);
                if (var277 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                } else {
                    field1040[++Statics.field1049 - 1] = var277.method4123();
                }
                var231 = 1;
            } else if (arg0 == 6639) {
                class29 var278 = client.method2578().method5714();
                if (var278 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                    field1040[++Statics.field1049 - 1] = -1;
                } else {
                    field1040[++Statics.field1049 - 1] = var278.field251;
                    field1040[++Statics.field1049 - 1] = var278.field247.method4123();
                }
                var231 = 1;
            } else if (arg0 == 6640) {
                class29 var279 = client.method2578().method5715();
                if (var279 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                    field1040[++Statics.field1049 - 1] = -1;
                } else {
                    field1040[++Statics.field1049 - 1] = var279.field251;
                    field1040[++Statics.field1049 - 1] = var279.field247.method4123();
                }
                var231 = 1;
            } else if (arg0 == 6693) {
                int var280 = field1040[--Statics.field1049];
                class258 var281 = Statics.field2412[var280];
                if (var281.field3267 == null) {
                    field1053[++Statics.field3795 - 1] = "";
                } else {
                    field1053[++Statics.field3795 - 1] = var281.field3267;
                }
                var231 = 1;
            } else if (arg0 == 6694) {
                int var282 = field1040[--Statics.field1049];
                class258 var283 = Statics.field2412[var282];
                field1040[++Statics.field1049 - 1] = var283.field3271;
                var231 = 1;
            } else if (arg0 == 6695) {
                int var284 = field1040[--Statics.field1049];
                class258 var285 = Statics.field2412[var284];
                if (var285 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                } else {
                    field1040[++Statics.field1049 - 1] = var285.field3283;
                }
                var231 = 1;
            } else if (arg0 == 6696) {
                int var286 = field1040[--Statics.field1049];
                class258 var287 = Statics.field2412[var286];
                if (var287 == null) {
                    field1040[++Statics.field1049 - 1] = -1;
                } else {
                    field1040[++Statics.field1049 - 1] = var287.field3265;
                }
                var231 = 1;
            } else if (arg0 == 6697) {
                field1040[++Statics.field1049 - 1] = Statics.field28.field328;
                var231 = 1;
            } else if (arg0 == 6698) {
                field1040[++Statics.field1049 - 1] = Statics.field28.field332.method4123();
                var231 = 1;
            } else if (arg0 == 6699) {
                field1040[++Statics.field1049 - 1] = Statics.field28.field329.method4123();
                var231 = 1;
            } else {
                var231 = 2;
            }
            return var231;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.k(ILce;ZI)I")
    public static int method486(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1040[--Statics.field1049];
            var4 = class233.method2957(var3);
        } else {
            var4 = arg2 ? Statics.field381 : Statics.field1947;
        }
        if (arg0 == 1000) {
            Statics.field1049 -= 4;
            var4.field2647 = field1040[Statics.field1049];
            var4.field2705 = field1040[Statics.field1049 + 1];
            var4.field2636 = field1040[Statics.field1049 + 2];
            var4.field2628 = field1040[Statics.field1049 + 3];
            client.method3069(var4);
            Statics.field391.method1101(var4);
            if (var3 != -1 && var4.field2680 == 0) {
                client.method1514(Statics.field2674[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1049 -= 4;
            var4.field2649 = field1040[Statics.field1049];
            var4.field2650 = field1040[Statics.field1049 + 1];
            var4.field2693 = field1040[Statics.field1049 + 2];
            var4.field2646 = field1040[Statics.field1049 + 3];
            client.method3069(var4);
            Statics.field391.method1101(var4);
            if (var3 != -1 && var4.field2680 == 0) {
                client.method1514(Statics.field2674[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1040[--Statics.field1049] == 1;
            if (var4.field2658 != var5) {
                var4.field2658 = var5;
                client.method3069(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2772 = field1040[--Statics.field1049] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2773 = field1040[--Statics.field1049] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("r.i(ILce;ZI)I")
    public static int method390(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method2957(field1040[--Statics.field1049]);
        } else {
            var3 = arg2 ? Statics.field381 : Statics.field1947;
        }
        client.method3069(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1049 -= 2;
            int var4 = field1040[Statics.field1049];
            int var5 = field1040[Statics.field1049 + 1];
            var3.field2759 = var4;
            var3.field2670 = var5;
            class272 var6 = Statics.method945(var4);
            var3.field2689 = var6.field3468;
            var3.field2742 = var6.field3469;
            var3.field2691 = var6.field3470;
            var3.field2642 = var6.field3495;
            var3.field2627 = var6.field3472;
            var3.field2655 = var6.field3452;
            if (arg0 == 1205) {
                var3.field2697 = 0;
            } else if (arg0 == 1212 | var6.field3473 == 1) {
                var3.field2697 = 1;
            } else {
                var3.field2697 = 2;
            }
            if (var3.field2746 > 0) {
                var3.field2655 = var3.field2655 * 32 / var3.field2746;
            } else if (var3.field2649 > 0) {
                var3.field2655 = var3.field2655 * 32 / var3.field2649;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2681 = 2;
            var3.field2682 = field1040[--Statics.field1049];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2681 = 3;
            var3.field2682 = Statics.field341.field599.method4144();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fb.t(ILce;ZI)I")
    public static int method3192(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method2957(field1040[--Statics.field1049]);
        } else {
            var3 = arg2 ? Statics.field381 : Statics.field1947;
        }
        if (arg0 == 1300) {
            int var4 = field1040[--Statics.field1049] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4184(var4, field1053[--Statics.field3795]);
                return 1;
            } else {
                Statics.field3795--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1049 -= 2;
            int var5 = field1040[Statics.field1049];
            int var6 = field1040[Statics.field1049 + 1];
            var3.field2714 = class233.method976(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2717 = field1040[--Statics.field1049] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2678 = field1040[--Statics.field1049];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2716 = field1040[--Statics.field1049];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2712 = field1053[--Statics.field3795];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2718 = field1053[--Statics.field3795];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2729 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.c(ILce;ZI)I")
    public static int method618(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method2957(field1040[--Statics.field1049]);
        } else {
            var3 = arg2 ? Statics.field381 : Statics.field1947;
        }
        String var4 = field1053[--Statics.field3795];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1040[--Statics.field1049];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1040[--Statics.field1049];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1053[--Statics.field3795];
            } else {
                var7[var8] = Integer.valueOf(field1040[--Statics.field1049]);
            }
        }
        int var9 = field1040[--Statics.field1049];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2721 = var7;
        } else if (arg0 == 1401) {
            var3.field2724 = var7;
        } else if (arg0 == 1402) {
            var3.field2663 = var7;
        } else if (arg0 == 1403) {
            var3.field2760 = var7;
        } else if (arg0 == 1404) {
            var3.field2727 = var7;
        } else if (arg0 == 1405) {
            var3.field2728 = var7;
        } else if (arg0 == 1406) {
            var3.field2731 = var7;
        } else if (arg0 == 1407) {
            var3.field2732 = var7;
            var3.field2733 = var5;
        } else if (arg0 == 1408) {
            var3.field2738 = var7;
        } else if (arg0 == 1409) {
            var3.field2739 = var7;
        } else if (arg0 == 1410) {
            var3.field2698 = var7;
        } else if (arg0 == 1411) {
            var3.field2722 = var7;
        } else if (arg0 == 1412) {
            var3.field2726 = var7;
        } else if (arg0 == 1414) {
            var3.field2690 = var7;
            var3.field2735 = var5;
        } else if (arg0 == 1415) {
            var3.field2748 = var7;
            var3.field2737 = var5;
        } else if (arg0 == 1416) {
            var3.field2730 = var7;
        } else if (arg0 == 1417) {
            var3.field2740 = var7;
        } else if (arg0 == 1418) {
            var3.field2741 = var7;
        } else if (arg0 == 1419) {
            var3.field2685 = var7;
        } else if (arg0 == 1420) {
            var3.field2743 = var7;
        } else if (arg0 == 1421) {
            var3.field2699 = var7;
        } else if (arg0 == 1422) {
            var3.field2745 = var7;
        } else if (arg0 == 1423) {
            var3.field2676 = var7;
        } else if (arg0 == 1424) {
            var3.field2747 = var7;
        } else if (arg0 == 1425) {
            var3.field2671 = var7;
        } else if (arg0 == 1426) {
            var3.field2750 = var7;
        } else if (arg0 == 1427) {
            var3.field2687 = var7;
        } else {
            return 2;
        }
        var3.field2719 = true;
        return 1;
    }

    @ObfuscatedName("er.w(ILce;ZI)I")
    public static int method2936(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field381 : Statics.field1947;
        if (arg0 == 1600) {
            field1040[++Statics.field1049 - 1] = var3.field2659;
            return 1;
        } else if (arg0 == 1601) {
            field1040[++Statics.field1049 - 1] = var3.field2692;
            return 1;
        } else if (arg0 == 1602) {
            field1053[++Statics.field3795 - 1] = var3.field2660;
            return 1;
        } else if (arg0 == 1603) {
            field1040[++Statics.field1049 - 1] = var3.field2661;
            return 1;
        } else if (arg0 == 1604) {
            field1040[++Statics.field1049 - 1] = var3.field2662;
            return 1;
        } else if (arg0 == 1605) {
            field1040[++Statics.field1049 - 1] = var3.field2655;
            return 1;
        } else if (arg0 == 1606) {
            field1040[++Statics.field1049 - 1] = var3.field2689;
            return 1;
        } else if (arg0 == 1607) {
            field1040[++Statics.field1049 - 1] = var3.field2691;
            return 1;
        } else if (arg0 == 1608) {
            field1040[++Statics.field1049 - 1] = var3.field2742;
            return 1;
        } else if (arg0 == 1609) {
            field1040[++Statics.field1049 - 1] = var3.field2669;
            return 1;
        } else if (arg0 == 1610) {
            field1040[++Statics.field1049 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 1611) {
            field1040[++Statics.field1049 - 1] = var3.field2635;
            return 1;
        } else if (arg0 == 1612) {
            field1040[++Statics.field1049 - 1] = var3.field2664;
            return 1;
        } else if (arg0 == 1613) {
            field1040[++Statics.field1049 - 1] = var3.field2668.method174();
            return 1;
        } else if (arg0 == 1614) {
            field1040[++Statics.field1049 - 1] = var3.field2696 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.a(ILce;ZB)I")
    public static int method989(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field381 : Statics.field1947;
        if (arg0 == 1700) {
            field1040[++Statics.field1049 - 1] = var3.field2759;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2759 == -1) {
                field1040[++Statics.field1049 - 1] = 0;
            } else {
                field1040[++Statics.field1049 - 1] = var3.field2670;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1040[++Statics.field1049 - 1] = var3.field2639;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.z(ILce;ZI)I")
    public static int method2105(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field381 : Statics.field1947;
        if (arg0 == 1800) {
            int[] var4 = field1040;
            int var5 = ++Statics.field1049 - 1;
            int var6 = client.method3164(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 1801) {
            int var8 = field1040[--Statics.field1049];
            int var9 = var8 - 1;
            if (var3.field2729 == null || var9 >= var3.field2729.length || var3.field2729[var9] == null) {
                field1053[++Statics.field3795 - 1] = "";
            } else {
                field1053[++Statics.field3795 - 1] = var3.field2729[var9];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2712 == null) {
                field1053[++Statics.field3795 - 1] = "";
            } else {
                field1053[++Statics.field3795 - 1] = var3.field2712;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.e(ILce;ZI)I")
    public static int method96(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method2957(field1040[--Statics.field1049]);
        } else {
            var3 = arg2 ? Statics.field381 : Statics.field1947;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1050 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2687 == null) {
            return 0;
        } else {
            class58 var4 = new class58();
            var4.field544 = var3;
            var4.field551 = var3.field2687;
            var4.field557 = field1050 + 1;
            client.field816.method3793(var4);
            return 1;
        }
    }

    @ObfuscatedName("gi.q(ILce;ZB)I")
    public static int method3600(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method2957(field1040[--Statics.field1049]);
        if (arg0 == 2500) {
            field1040[++Statics.field1049 - 1] = var3.field2651;
            return 1;
        } else if (arg0 == 2501) {
            field1040[++Statics.field1049 - 1] = var3.field2652;
            return 1;
        } else if (arg0 == 2502) {
            field1040[++Statics.field1049 - 1] = var3.field2653;
            return 1;
        } else if (arg0 == 2503) {
            field1040[++Statics.field1049 - 1] = var3.field2654;
            return 1;
        } else if (arg0 == 2504) {
            field1040[++Statics.field1049 - 1] = var3.field2658 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1040[++Statics.field1049 - 1] = var3.field2675;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.j(ILce;ZI)I")
    public static int method475(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method2957(field1040[--Statics.field1049]);
        if (arg0 == 2600) {
            field1040[++Statics.field1049 - 1] = var3.field2659;
            return 1;
        } else if (arg0 == 2601) {
            field1040[++Statics.field1049 - 1] = var3.field2692;
            return 1;
        } else if (arg0 == 2602) {
            field1053[++Statics.field3795 - 1] = var3.field2660;
            return 1;
        } else if (arg0 == 2603) {
            field1040[++Statics.field1049 - 1] = var3.field2661;
            return 1;
        } else if (arg0 == 2604) {
            field1040[++Statics.field1049 - 1] = var3.field2662;
            return 1;
        } else if (arg0 == 2605) {
            field1040[++Statics.field1049 - 1] = var3.field2655;
            return 1;
        } else if (arg0 == 2606) {
            field1040[++Statics.field1049 - 1] = var3.field2689;
            return 1;
        } else if (arg0 == 2607) {
            field1040[++Statics.field1049 - 1] = var3.field2691;
            return 1;
        } else if (arg0 == 2608) {
            field1040[++Statics.field1049 - 1] = var3.field2742;
            return 1;
        } else if (arg0 == 2609) {
            field1040[++Statics.field1049 - 1] = var3.field2669;
            return 1;
        } else if (arg0 == 2610) {
            field1040[++Statics.field1049 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 2611) {
            field1040[++Statics.field1049 - 1] = var3.field2635;
            return 1;
        } else if (arg0 == 2612) {
            field1040[++Statics.field1049 - 1] = var3.field2664;
            return 1;
        } else if (arg0 == 2613) {
            field1040[++Statics.field1049 - 1] = var3.field2668.method174();
            return 1;
        } else if (arg0 == 2614) {
            field1040[++Statics.field1049 - 1] = var3.field2696 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.h(ILce;ZB)I")
    public static int method2100(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1049 -= 2;
            int var3 = field1040[Statics.field1049];
            int var4 = field1040[Statics.field1049 + 1];
            class269 var5 = Statics.method1790(var3);
            if (var5.field3368 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3366; var6++) {
                if (var5.field3372[var6] == var4) {
                    field1053[++Statics.field3795 - 1] = var5.field3374[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1053[++Statics.field3795 - 1] = var5.field3369;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1049 -= 4;
            int var7 = field1040[Statics.field1049];
            int var8 = field1040[Statics.field1049 + 1];
            int var9 = field1040[Statics.field1049 + 2];
            int var10 = field1040[Statics.field1049 + 3];
            class269 var11 = Statics.method1790(var9);
            if (var11.field3367 != var7 || var11.field3368 != var8) {
                if (var8 == 115) {
                    field1053[++Statics.field3795 - 1] = class240.field2830;
                } else {
                    field1040[++Statics.field1049 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3366; var12++) {
                if (var11.field3372[var12] == var10) {
                    if (var8 == 115) {
                        field1053[++Statics.field3795 - 1] = var11.field3374[var12];
                    } else {
                        field1040[++Statics.field1049 - 1] = var11.field3373[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1053[++Statics.field3795 - 1] = var11.field3369;
                } else {
                    field1040[++Statics.field1049 - 1] = var11.field3370;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1040[--Statics.field1049];
            class269 var14 = Statics.method1790(var13);
            field1040[++Statics.field1049 - 1] = var14.method4657();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.x(ILce;ZI)I")
    public static int method1707(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = client.field883[var3].method48();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = client.field883[var4].field33;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = client.field883[var5].field34;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = client.field883[var6].field38;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = client.field883[var7].field35;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = client.field883[var8].field36;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1040[--Statics.field1049];
            int var10 = client.field883[var9].method47();
            field1040[++Statics.field1049 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1040[--Statics.field1049];
            int var12 = client.field883[var11].method47();
            field1040[++Statics.field1049 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1040[--Statics.field1049];
            int var14 = client.field883[var13].method47();
            field1040[++Statics.field1049 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1040[--Statics.field1049];
            int var16 = client.field883[var15].method47();
            field1040[++Statics.field1049 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1040[--Statics.field1049] == 1;
            if (Statics.field233 != null) {
                Statics.field233.method15(class2.field9, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1040[--Statics.field1049] == 1;
            if (Statics.field233 != null) {
                Statics.field233.method15(class2.field17, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1049 -= 2;
            boolean var19 = field1040[Statics.field1049] == 1;
            boolean var20 = field1040[Statics.field1049 + 1] == 1;
            if (Statics.field233 != null) {
                client.field884.field618 = var20;
                Statics.field233.method15(client.field884, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1040[--Statics.field1049] == 1;
            if (Statics.field233 != null) {
                Statics.field233.method15(class2.field7, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1040[--Statics.field1049] == 1;
            if (Statics.field233 != null) {
                Statics.field233.method15(class2.field10, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1040[++Statics.field1049 - 1] = Statics.field233 == null ? 0 : Statics.field233.field13.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1040[--Statics.field1049];
            class3 var24 = (class3) Statics.field233.field13.get(var23);
            field1040[++Statics.field1049 - 1] = var24.field24;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1040[--Statics.field1049];
            class3 var26 = (class3) Statics.field233.field13.get(var25);
            field1053[++Statics.field3795 - 1] = var26.method19();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1040[--Statics.field1049];
            class3 var28 = (class3) Statics.field233.field13.get(var27);
            field1053[++Statics.field3795 - 1] = var28.method18();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1040[--Statics.field1049];
            class3 var30 = (class3) Statics.field233.field13.get(var29);
            long var31 = class187.method3154() - Statics.field3672 - var30.field25;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1053[++Statics.field3795 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1040[--Statics.field1049];
            class3 var38 = (class3) Statics.field233.field13.get(var37);
            field1040[++Statics.field1049 - 1] = var38.field21.field38;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1040[--Statics.field1049];
            class3 var40 = (class3) Statics.field233.field13.get(var39);
            field1040[++Statics.field1049 - 1] = var40.field21.field34;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1040[--Statics.field1049];
            class3 var42 = (class3) Statics.field233.field13.get(var41);
            field1040[++Statics.field1049 - 1] = var42.field21.field33;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ft.f(ILce;ZI)I")
    public static int method3236(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1049 -= 2;
            int var3 = field1040[Statics.field1049];
            int var4 = field1040[Statics.field1049 + 1];
            field1040[++Statics.field1049 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1049 -= 2;
            int var5 = field1040[Statics.field1049];
            int var6 = field1040[Statics.field1049 + 1];
            field1040[++Statics.field1049 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1049 -= 2;
            int var7 = field1040[Statics.field1049];
            int var8 = field1040[Statics.field1049 + 1];
            field1040[++Statics.field1049 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1049 -= 2;
            int var9 = field1040[Statics.field1049];
            int var10 = field1040[Statics.field1049 + 1];
            field1040[++Statics.field1049 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1049 -= 5;
            int var13 = field1040[Statics.field1049];
            int var14 = field1040[Statics.field1049 + 1];
            int var15 = field1040[Statics.field1049 + 2];
            int var16 = field1040[Statics.field1049 + 3];
            int var17 = field1040[Statics.field1049 + 4];
            field1040[++Statics.field1049 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1049 -= 2;
            int var18 = field1040[Statics.field1049];
            int var19 = field1040[Statics.field1049 + 1];
            field1040[++Statics.field1049 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1049 -= 2;
            int var20 = field1040[Statics.field1049];
            int var21 = field1040[Statics.field1049 + 1];
            field1040[++Statics.field1049 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1049 -= 2;
            int var22 = field1040[Statics.field1049];
            int var23 = field1040[Statics.field1049 + 1];
            field1040[++Statics.field1049 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1049 -= 2;
            int var24 = field1040[Statics.field1049];
            int var25 = field1040[Statics.field1049 + 1];
            field1040[++Statics.field1049 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1049 -= 2;
            int var26 = field1040[Statics.field1049];
            int var27 = field1040[Statics.field1049 + 1];
            field1040[++Statics.field1049 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1049 -= 2;
            int var28 = field1040[Statics.field1049];
            int var29 = field1040[Statics.field1049 + 1];
            if (var28 == 0) {
                field1040[++Statics.field1049 - 1] = 0;
            } else {
                field1040[++Statics.field1049 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1049 -= 2;
            int var30 = field1040[Statics.field1049];
            int var31 = field1040[Statics.field1049 + 1];
            if (var30 == 0) {
                field1040[++Statics.field1049 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1040[++Statics.field1049 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1040[++Statics.field1049 - 1] = var30;
                    break;
                case 2:
                    field1040[++Statics.field1049 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1040[++Statics.field1049 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1040[++Statics.field1049 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1040[++Statics.field1049 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1049 -= 2;
            int var32 = field1040[Statics.field1049];
            int var33 = field1040[Statics.field1049 + 1];
            field1040[++Statics.field1049 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1049 -= 2;
            int var34 = field1040[Statics.field1049];
            int var35 = field1040[Statics.field1049 + 1];
            field1040[++Statics.field1049 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1049 -= 3;
            long var36 = (long) field1040[Statics.field1049];
            long var38 = (long) field1040[Statics.field1049 + 1];
            long var40 = (long) field1040[Statics.field1049 + 2];
            field1040[++Statics.field1049 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kz.r(ILce;ZI)I")
    public static int method4988(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1053[--Statics.field3795];
            int var4 = field1040[--Statics.field1049];
            field1053[++Statics.field3795 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field3795 -= 2;
            String var5 = field1053[Statics.field3795];
            String var6 = field1053[Statics.field3795 + 1];
            field1053[++Statics.field3795 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1053[--Statics.field3795];
            int var8 = field1040[--Statics.field1049];
            field1053[++Statics.field3795 - 1] = var7 + class308.method4526(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1053[--Statics.field3795];
            field1053[++Statics.field3795 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1040[--Statics.field1049];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1045.setTime(new Date(var11));
            int var13 = field1045.get(5);
            int var14 = field1045.get(2);
            int var15 = field1045.get(1);
            field1053[++Statics.field3795 - 1] = var13 + "-" + field1041[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field3795 -= 2;
            String var16 = field1053[Statics.field3795];
            String var17 = field1053[Statics.field3795 + 1];
            if (Statics.field341.field599 != null && Statics.field341.field599.field2609) {
                field1053[++Statics.field3795 - 1] = var17;
            } else {
                field1053[++Statics.field3795 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1040[--Statics.field1049];
            field1053[++Statics.field3795 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field3795 -= 2;
            int[] var19 = field1040;
            int var20 = ++Statics.field1049 - 1;
            int var21 = class176.method3153(field1053[Statics.field3795], field1053[Statics.field3795 + 1], client.field625);
            byte var22;
            if (var21 > 0) {
                var22 = 1;
            } else if (var21 < 0) {
                var22 = -1;
            } else {
                var22 = 0;
            }
            var19[var20] = var22;
            return 1;
        } else if (arg0 == 4108) {
            String var23 = field1053[--Statics.field3795];
            Statics.field1049 -= 2;
            int var24 = field1040[Statics.field1049];
            int var25 = field1040[Statics.field1049 + 1];
            byte[] var26 = Statics.field1581.method4270(var25, 0);
            class301 var27 = new class301(var26);
            field1040[++Statics.field1049 - 1] = var27.method5157(var23, var24);
            return 1;
        } else if (arg0 == 4109) {
            String var28 = field1053[--Statics.field3795];
            Statics.field1049 -= 2;
            int var29 = field1040[Statics.field1049];
            int var30 = field1040[Statics.field1049 + 1];
            byte[] var31 = Statics.field1581.method4270(var30, 0);
            class301 var32 = new class301(var31);
            field1040[++Statics.field1049 - 1] = var32.method5156(var28, var29);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field3795 -= 2;
            String var33 = field1053[Statics.field3795];
            String var34 = field1053[Statics.field3795 + 1];
            if (field1040[--Statics.field1049] == 1) {
                field1053[++Statics.field3795 - 1] = var33;
            } else {
                field1053[++Statics.field3795 - 1] = var34;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var35 = field1053[--Statics.field3795];
            field1053[++Statics.field3795 - 1] = class302.method5237(var35);
            return 1;
        } else if (arg0 == 4112) {
            String var36 = field1053[--Statics.field3795];
            int var37 = field1040[--Statics.field1049];
            field1053[++Statics.field3795 - 1] = var36 + (char) var37;
            return 1;
        } else if (arg0 == 4113) {
            int var38 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = class308.method3575((char) var38) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var39 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = class308.method2874((char) var39) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var40 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = class308.method3508((char) var40) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var41 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = Statics.method3887((char) var41) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var42 = field1053[--Statics.field3795];
            if (var42 == null) {
                field1040[++Statics.field1049 - 1] = 0;
            } else {
                field1040[++Statics.field1049 - 1] = var42.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var43 = field1053[--Statics.field3795];
            Statics.field1049 -= 2;
            int var44 = field1040[Statics.field1049];
            int var45 = field1040[Statics.field1049 + 1];
            field1053[++Statics.field3795 - 1] = var43.substring(var44, var45);
            return 1;
        } else if (arg0 == 4119) {
            String var46 = field1053[--Statics.field3795];
            StringBuilder var47 = new StringBuilder(var46.length());
            boolean var48 = false;
            for (int var49 = 0; var49 < var46.length(); var49++) {
                char var50 = var46.charAt(var49);
                if (var50 == '<') {
                    var48 = true;
                } else if (var50 == '>') {
                    var48 = false;
                } else if (!var48) {
                    var47.append(var50);
                }
            }
            field1053[++Statics.field3795 - 1] = var47.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var51 = field1053[--Statics.field3795];
            int var52 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = var51.indexOf(var52);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field3795 -= 2;
            String var53 = field1053[Statics.field3795];
            String var54 = field1053[Statics.field3795 + 1];
            int var55 = field1040[--Statics.field1049];
            field1040[++Statics.field1049 - 1] = var53.indexOf(var54, var55);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fr.n(ILce;ZB)I")
    public static int method3148(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5306) {
            int[] var3 = field1040;
            int var4 = ++Statics.field1049 - 1;
            int var5 = client.field852 ? 2 : 1;
            var3[var4] = var5;
            return 1;
        } else if (arg0 == 5307) {
            int var6 = field1040[--Statics.field1049];
            if (var6 == 1 || var6 == 2) {
                client.method3517(var6);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1040[++Statics.field1049 - 1] = Statics.field580.field999;
            return 1;
        } else if (arg0 == 5309) {
            int var7 = field1040[--Statics.field1049];
            if (var7 == 1 || var7 == 2) {
                Statics.field580.field999 = var7;
                class68.method3016();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.g(ILce;ZI)I")
    public static int method1472(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1049 -= 2;
            int var3 = field1040[Statics.field1049];
            int var4 = field1040[Statics.field1049 + 1];
            if (!client.field861) {
                client.field688 = var3;
                client.field689 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1040[++Statics.field1049 - 1] = client.field688;
            return 1;
        } else if (arg0 == 5506) {
            field1040[++Statics.field1049 - 1] = client.field689;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1040[--Statics.field1049];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field695 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1040[++Statics.field1049 - 1] = client.field695;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.ab(ILce;ZB)I")
    public static int method1534(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field666 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("en.ao(ILce;ZS)I")
    public static int method2862(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1049 -= 2;
            client.field867 = (short) field1040[Statics.field1049];
            if (client.field867 <= 0) {
                client.field867 = 256;
            }
            client.field636 = (short) field1040[Statics.field1049 + 1];
            if (client.field636 <= 0) {
                client.field636 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1049 -= 2;
            client.field869 = (short) field1040[Statics.field1049];
            if (client.field869 <= 0) {
                client.field869 = 256;
            }
            client.field870 = (short) field1040[Statics.field1049 + 1];
            if (client.field870 <= 0) {
                client.field870 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1049 -= 4;
            client.field871 = (short) field1040[Statics.field1049];
            if (client.field871 <= 0) {
                client.field871 = 1;
            }
            client.field872 = (short) field1040[Statics.field1049 + 1];
            if (client.field872 <= 0) {
                client.field872 = 32767;
            } else if (client.field872 < client.field871) {
                client.field872 = client.field871;
            }
            client.field873 = (short) field1040[Statics.field1049 + 2];
            if (client.field873 <= 0) {
                client.field873 = 1;
            }
            client.field834 = (short) field1040[Statics.field1049 + 3];
            if (client.field834 <= 0) {
                client.field834 = 32767;
            } else if (client.field834 < client.field873) {
                client.field834 = client.field873;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field863 == null) {
                field1040[++Statics.field1049 - 1] = -1;
                field1040[++Statics.field1049 - 1] = -1;
            } else {
                client.method487(0, 0, client.field863.field2653, client.field863.field2654, false);
                field1040[++Statics.field1049 - 1] = client.field877;
                field1040[++Statics.field1049 - 1] = client.field878;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1040[++Statics.field1049 - 1] = client.field869;
            field1040[++Statics.field1049 - 1] = client.field870;
            return 1;
        } else if (arg0 == 6205) {
            field1040[++Statics.field1049 - 1] = client.field867;
            field1040[++Statics.field1049 - 1] = client.field636;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fq.an(ILce;ZI)I")
    public static int method3029(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1040[++Statics.field1049 - 1] = class67.method44() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class67 var3 = class67.method3241();
            if (var3 == null) {
                field1040[++Statics.field1049 - 1] = -1;
                field1040[++Statics.field1049 - 1] = 0;
                field1053[++Statics.field3795 - 1] = "";
                field1040[++Statics.field1049 - 1] = 0;
                field1040[++Statics.field1049 - 1] = 0;
                field1053[++Statics.field3795 - 1] = "";
            } else {
                field1040[++Statics.field1049 - 1] = var3.field992;
                field1040[++Statics.field1049 - 1] = var3.field979;
                field1053[++Statics.field3795 - 1] = var3.field991;
                field1040[++Statics.field1049 - 1] = var3.field984;
                field1040[++Statics.field1049 - 1] = var3.field989;
                field1053[++Statics.field3795 - 1] = var3.field986;
            }
            return 1;
        } else if (arg0 == 6502) {
            class67 var4 = class67.method2901();
            if (var4 == null) {
                field1040[++Statics.field1049 - 1] = -1;
                field1040[++Statics.field1049 - 1] = 0;
                field1053[++Statics.field3795 - 1] = "";
                field1040[++Statics.field1049 - 1] = 0;
                field1040[++Statics.field1049 - 1] = 0;
                field1053[++Statics.field3795 - 1] = "";
            } else {
                field1040[++Statics.field1049 - 1] = var4.field992;
                field1040[++Statics.field1049 - 1] = var4.field979;
                field1053[++Statics.field3795 - 1] = var4.field991;
                field1040[++Statics.field1049 - 1] = var4.field984;
                field1040[++Statics.field1049 - 1] = var4.field989;
                field1053[++Statics.field3795 - 1] = var4.field986;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1040[--Statics.field1049];
            class67 var6 = null;
            for (int var7 = 0; var7 < class67.field983; var7++) {
                if (Statics.field982[var7].field992 == var5) {
                    var6 = Statics.field982[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1040[++Statics.field1049 - 1] = -1;
                field1040[++Statics.field1049 - 1] = 0;
                field1053[++Statics.field3795 - 1] = "";
                field1040[++Statics.field1049 - 1] = 0;
                field1040[++Statics.field1049 - 1] = 0;
                field1053[++Statics.field3795 - 1] = "";
            } else {
                field1040[++Statics.field1049 - 1] = var6.field992;
                field1040[++Statics.field1049 - 1] = var6.field979;
                field1053[++Statics.field3795 - 1] = var6.field991;
                field1040[++Statics.field1049 - 1] = var6.field984;
                field1040[++Statics.field1049 - 1] = var6.field989;
                field1053[++Statics.field3795 - 1] = var6.field986;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1049 -= 4;
            int var8 = field1040[Statics.field1049];
            boolean var9 = field1040[Statics.field1049 + 1] == 1;
            int var10 = field1040[Statics.field1049 + 2];
            boolean var11 = field1040[Statics.field1049 + 3] == 1;
            class67.method1660(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1040[--Statics.field1049];
            if (var12 >= 0 && var12 < class67.field983) {
                class67 var13 = Statics.field982[var12];
                field1040[++Statics.field1049 - 1] = var13.field992;
                field1040[++Statics.field1049 - 1] = var13.field979;
                field1053[++Statics.field3795 - 1] = var13.field991;
                field1040[++Statics.field1049 - 1] = var13.field984;
                field1040[++Statics.field1049 - 1] = var13.field989;
                field1053[++Statics.field3795 - 1] = var13.field986;
            } else {
                field1040[++Statics.field1049 - 1] = -1;
                field1040[++Statics.field1049 - 1] = 0;
                field1053[++Statics.field3795 - 1] = "";
                field1040[++Statics.field1049 - 1] = 0;
                field1040[++Statics.field1049 - 1] = 0;
                field1053[++Statics.field3795 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field764 = field1040[--Statics.field1049] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1049 -= 2;
            int var14 = field1040[Statics.field1049];
            int var15 = field1040[Statics.field1049 + 1];
            class267 var16 = class267.method3597(var15);
            if (var16.method4617()) {
                field1053[++Statics.field3795 - 1] = class274.method1807(var14).method4836(var15, var16.field3358);
            } else {
                field1040[++Statics.field1049 - 1] = class274.method1807(var14).method4816(var15, var16.field3357);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1049 -= 2;
            int var17 = field1040[Statics.field1049];
            int var18 = field1040[Statics.field1049 + 1];
            class267 var19 = class267.method3597(var18);
            if (var19.method4617()) {
                field1053[++Statics.field3795 - 1] = class271.method4255(var17).method4725(var18, var19.field3358);
            } else {
                field1040[++Statics.field1049 - 1] = class271.method4255(var17).method4708(var18, var19.field3357);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1049 -= 2;
            int var20 = field1040[Statics.field1049];
            int var21 = field1040[Statics.field1049 + 1];
            class267 var22 = class267.method3597(var21);
            if (var22.method4617()) {
                field1053[++Statics.field3795 - 1] = Statics.method945(var20).method4755(var21, var22.field3358);
            } else {
                field1040[++Statics.field1049 - 1] = Statics.method945(var20).method4754(var21, var22.field3357);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1049 -= 2;
            int var23 = field1040[Statics.field1049];
            int var24 = field1040[Statics.field1049 + 1];
            class267 var25 = class267.method3597(var24);
            if (var25.method4617()) {
                field1053[++Statics.field3795 - 1] = class268.method2859(var23).method4641(var24, var25.field3358);
            } else {
                field1040[++Statics.field1049 - 1] = class268.method2859(var23).method4640(var24, var25.field3357);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1040[++Statics.field1049 - 1] = client.field648 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1040[++Statics.field1049 - 1] = client.field627 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field3795--;
            Statics.field1049--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field3795--;
            Statics.field1049--;
            return 1;
        } else if (arg0 == 6524) {
            field1040[++Statics.field1049 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1040[++Statics.field1049 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1040[++Statics.field1049 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("m.ay(IB)V")
    public static void method220(int arg0) {
        if (arg0 == -1 || !class233.method2911(arg0)) {
            return;
        }
        class233[] var1 = Statics.field2674[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3.field2665 != null) {
                class58 var4 = new class58();
                var4.field544 = var3;
                var4.field551 = var3.field2665;
                method1872(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("am.av(ILhv;ZI)V")
    public static void method547(int arg0, class229 arg1, boolean arg2) {
        class21 var3 = client.method2578().method5686(arg0);
        int var4 = Statics.field341.field605;
        int var5 = (Statics.field341.field933 >> 7) + Statics.field6;
        int var6 = (Statics.field341.field964 >> 7) + Statics.field72;
        class229 var7 = new class229(var4, var5, var6);
        client.method2578().method5675(var3, var7, arg1, arg2);
    }
}
