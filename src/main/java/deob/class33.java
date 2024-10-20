package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ai")
public class class33 {

    @ObfuscatedName("ai.j")
    public static int[] field753 = new int[5];

    @ObfuscatedName("ai.n")
    public static int[][] field747 = new int[5][5000];

    @ObfuscatedName("ai.r")
    public static int[] field748 = new int[1000];

    @ObfuscatedName("ai.i")
    public static String[] field749 = new String[1000];

    @ObfuscatedName("ai.m")
    public static int field751 = 0;

    @ObfuscatedName("ai.s")
    public static class12[] field752 = new class12[50];

    @ObfuscatedName("ai.v")
    public static Calendar field760 = Calendar.getInstance();

    @ObfuscatedName("ai.f")
    public static final String[] field754 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ai.z")
    public static int field755 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gc.q(Ly;I)V")
    public static void method3298(class19 arg0) {
        method3098(arg0, 200000);
    }

    @ObfuscatedName("fr.d(Ly;IB)V")
    public static void method3098(class19 arg0, int arg1) {
        Object[] var2 = arg0.field210;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method3191(var3);
        if (var4 == null) {
            return;
        }
        Statics.field1687 = 0;
        Statics.field750 = 0;
        int var5 = -1;
        int[] var6 = var4.field960;
        int[] var7 = var4.field961;
        byte var8 = -1;
        field751 = 0;
        try {
            Statics.field38 = new int[var4.field965];
            int var9 = 0;
            Statics.field758 = new String[var4.field962];
            int var10 = 0;
            for (int var11 = 1; var11 < var2.length; var11++) {
                if (var2[var11] instanceof Integer) {
                    int var12 = (Integer) var2[var11];
                    if (var12 == -2147483647) {
                        var12 = arg0.field206;
                    }
                    if (var12 == -2147483646) {
                        var12 = arg0.field201;
                    }
                    if (var12 == -2147483645) {
                        var12 = arg0.field199 == null ? -1 : arg0.field199.field2206;
                    }
                    if (var12 == -2147483644) {
                        var12 = arg0.field202;
                    }
                    if (var12 == -2147483643) {
                        var12 = arg0.field199 == null ? -1 : arg0.field199.field2306;
                    }
                    if (var12 == -2147483642) {
                        var12 = arg0.field211 == null ? -1 : arg0.field211.field2206;
                    }
                    if (var12 == -2147483641) {
                        var12 = arg0.field211 == null ? -1 : arg0.field211.field2306;
                    }
                    if (var12 == -2147483640) {
                        var12 = arg0.field204;
                    }
                    if (var12 == -2147483639) {
                        var12 = arg0.field205;
                    }
                    Statics.field38[var9++] = var12;
                } else if (var2[var11] instanceof String) {
                    String var13 = (String) var2[var11];
                    if (var13.equals("event_opbase")) {
                        var13 = arg0.field203;
                    }
                    Statics.field758[var10++] = var13;
                }
            }
            int var14 = 0;
            field755 = arg0.field198;
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
                                                                                                                label240: while (true) {
                                                                                                                    var14++;
                                                                                                                    if (var14 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var5++;
                                                                                                                    int var56 = var6[var5];
                                                                                                                    if (var56 >= 100) {
                                                                                                                        boolean var50;
                                                                                                                        if (var4.field961[var5] == 1) {
                                                                                                                            var50 = true;
                                                                                                                        } else {
                                                                                                                            var50 = false;
                                                                                                                        }
                                                                                                                        int var51 = method255(var56, var4, var50);
                                                                                                                        switch(var51) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var56 == 0) {
                                                                                                                        field748[++Statics.field1687 - 1] = var7[var5];
                                                                                                                    } else if (var56 == 1) {
                                                                                                                        int var15 = var7[var5];
                                                                                                                        field748[++Statics.field1687 - 1] = class166.field2163[var15];
                                                                                                                    } else if (var56 == 2) {
                                                                                                                        int var16 = var7[var5];
                                                                                                                        class166.field2163[var16] = field748[--Statics.field1687];
                                                                                                                        client.method2593(var16);
                                                                                                                    } else if (var56 == 3) {
                                                                                                                        field749[++Statics.field750 - 1] = var4.field969[var5];
                                                                                                                    } else if (var56 == 6) {
                                                                                                                        var5 += var7[var5];
                                                                                                                    } else if (var56 == 7) {
                                                                                                                        Statics.field1687 -= 2;
                                                                                                                        if (field748[Statics.field1687] != field748[Statics.field1687 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var56 == 8) {
                                                                                                                        Statics.field1687 -= 2;
                                                                                                                        if (field748[Statics.field1687] == field748[Statics.field1687 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var56 == 9) {
                                                                                                                        Statics.field1687 -= 2;
                                                                                                                        if (field748[Statics.field1687] < field748[Statics.field1687 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var56 == 10) {
                                                                                                                        Statics.field1687 -= 2;
                                                                                                                        if (field748[Statics.field1687] > field748[Statics.field1687 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var56 == 21) {
                                                                                                                        if (field751 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class12 var17 = field752[--field751];
                                                                                                                        var4 = var17.field122;
                                                                                                                        var6 = var4.field960;
                                                                                                                        var7 = var4.field961;
                                                                                                                        var5 = var17.field125;
                                                                                                                        Statics.field38 = var17.field135;
                                                                                                                        Statics.field758 = var17.field124;
                                                                                                                    } else if (var56 == 25) {
                                                                                                                        int var18 = var7[var5];
                                                                                                                        field748[++Statics.field1687 - 1] = class166.method2011(var18);
                                                                                                                    } else if (var56 == 27) {
                                                                                                                        int var19 = var7[var5];
                                                                                                                        class166.method3525(var19, field748[--Statics.field1687]);
                                                                                                                    } else if (var56 == 31) {
                                                                                                                        Statics.field1687 -= 2;
                                                                                                                        if (field748[Statics.field1687] <= field748[Statics.field1687 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var56 == 32) {
                                                                                                                        Statics.field1687 -= 2;
                                                                                                                        if (field748[Statics.field1687] >= field748[Statics.field1687 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var56 == 33) {
                                                                                                                        field748[++Statics.field1687 - 1] = Statics.field38[var7[var5]];
                                                                                                                    } else if (var56 == 34) {
                                                                                                                        Statics.field38[var7[var5]] = field748[--Statics.field1687];
                                                                                                                    } else if (var56 == 35) {
                                                                                                                        field749[++Statics.field750 - 1] = Statics.field758[var7[var5]];
                                                                                                                    } else if (var56 == 36) {
                                                                                                                        Statics.field758[var7[var5]] = field749[--Statics.field750];
                                                                                                                    } else if (var56 == 37) {
                                                                                                                        int var20 = var7[var5];
                                                                                                                        Statics.field750 -= var20;
                                                                                                                        String[] var21 = field749;
                                                                                                                        int var22 = Statics.field750;
                                                                                                                        String var23;
                                                                                                                        if (var20 == 0) {
                                                                                                                            var23 = "";
                                                                                                                        } else if (var20 == 1) {
                                                                                                                            String var24 = var21[var22];
                                                                                                                            if (var24 == null) {
                                                                                                                                var23 = "null";
                                                                                                                            } else {
                                                                                                                                var23 = var24.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var25 = var20 + var22;
                                                                                                                            int var26 = 0;
                                                                                                                            for (int var27 = var22; var27 < var25; var27++) {
                                                                                                                                String var28 = var21[var27];
                                                                                                                                if (var28 == null) {
                                                                                                                                    var26 += 4;
                                                                                                                                } else {
                                                                                                                                    var26 += var28.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var29 = new StringBuilder(var26);
                                                                                                                            for (int var30 = var22; var30 < var25; var30++) {
                                                                                                                                String var31 = var21[var30];
                                                                                                                                if (var31 == null) {
                                                                                                                                    var29.append("null");
                                                                                                                                } else {
                                                                                                                                    var29.append(var31);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var23 = var29.toString();
                                                                                                                        }
                                                                                                                        field749[++Statics.field750 - 1] = var23;
                                                                                                                    } else if (var56 == 38) {
                                                                                                                        Statics.field1687--;
                                                                                                                    } else if (var56 == 39) {
                                                                                                                        Statics.field750--;
                                                                                                                    } else if (var56 == 40) {
                                                                                                                        int var33 = var7[var5];
                                                                                                                        class49 var34 = class49.method3191(var33);
                                                                                                                        int[] var35 = new int[var34.field965];
                                                                                                                        String[] var36 = new String[var34.field962];
                                                                                                                        for (int var37 = 0; var37 < var34.field966; var37++) {
                                                                                                                            var35[var37] = field748[Statics.field1687 - var34.field966 + var37];
                                                                                                                        }
                                                                                                                        for (int var38 = 0; var38 < var34.field964; var38++) {
                                                                                                                            var36[var38] = field749[Statics.field750 - var34.field964 + var38];
                                                                                                                        }
                                                                                                                        Statics.field1687 -= var34.field966;
                                                                                                                        Statics.field750 -= var34.field964;
                                                                                                                        class12 var39 = new class12();
                                                                                                                        var39.field122 = var4;
                                                                                                                        var39.field125 = var5;
                                                                                                                        var39.field135 = Statics.field38;
                                                                                                                        var39.field124 = Statics.field758;
                                                                                                                        field752[++field751 - 1] = var39;
                                                                                                                        var4 = var34;
                                                                                                                        var6 = var34.field960;
                                                                                                                        var7 = var34.field961;
                                                                                                                        var5 = -1;
                                                                                                                        Statics.field38 = var35;
                                                                                                                        Statics.field758 = var36;
                                                                                                                    } else if (var56 == 42) {
                                                                                                                        field748[++Statics.field1687 - 1] = Statics.field232.method906(var7[var5]);
                                                                                                                    } else if (var56 == 43) {
                                                                                                                        Statics.field232.method892(var7[var5], field748[--Statics.field1687]);
                                                                                                                    } else if (var56 == 44) {
                                                                                                                        int var40 = var7[var5] >> 16;
                                                                                                                        int var41 = var7[var5] & 0xFFFF;
                                                                                                                        int var42 = field748[--Statics.field1687];
                                                                                                                        if (var42 >= 0 && var42 <= 5000) {
                                                                                                                            field753[var40] = var42;
                                                                                                                            byte var43 = -1;
                                                                                                                            if (var41 == 105) {
                                                                                                                                var43 = 0;
                                                                                                                            }
                                                                                                                            int var44 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var44 >= var42) {
                                                                                                                                    continue label240;
                                                                                                                                }
                                                                                                                                field747[var40][var44] = var43;
                                                                                                                                var44++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var56 == 45) {
                                                                                                                        int var45 = var7[var5];
                                                                                                                        int var46 = field748[--Statics.field1687];
                                                                                                                        if (var46 < 0 || var46 >= field753[var45]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field748[++Statics.field1687 - 1] = field747[var45][var46];
                                                                                                                    } else if (var56 == 46) {
                                                                                                                        int var47 = var7[var5];
                                                                                                                        Statics.field1687 -= 2;
                                                                                                                        int var48 = field748[Statics.field1687];
                                                                                                                        if (var48 < 0 || var48 >= field753[var47]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field747[var47][var48] = field748[Statics.field1687 + 1];
                                                                                                                    } else if (var56 == 47) {
                                                                                                                        String var49 = Statics.field232.method895(var7[var5]);
                                                                                                                        if (var49 == null) {
                                                                                                                            var49 = "null";
                                                                                                                        }
                                                                                                                        field749[++Statics.field750 - 1] = var49;
                                                                                                                    } else if (var56 == 48) {
                                                                                                                        Statics.field232.method894(var7[var5], field749[--Statics.field750]);
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
        } catch (Exception var55) {
            StringBuilder var53 = new StringBuilder(30);
            var53.append("").append(var4.field1882).append(" ");
            for (int var54 = field751 - 1; var54 >= 0; var54--) {
                var53.append("").append(field752[var54].field122.field1882).append(" ");
            }
            var53.append("").append(var8);
            class102.method811(var53.toString(), var55);
        }
    }

    @ObfuscatedName("g.h(ILay;ZB)I")
    public static int method255(int arg0, class49 arg1, boolean arg2) {
        if (arg0 < 1000) {
            byte var10;
            if (arg0 == 100) {
                Statics.field1687 -= 3;
                int var3 = field748[Statics.field1687];
                int var4 = field748[Statics.field1687 + 1];
                int var5 = field748[Statics.field1687 + 2];
                if (var4 == 0) {
                    throw new RuntimeException();
                }
                class170 var6 = class170.method3109(var3);
                if (var6.field2330 == null) {
                    var6.field2330 = new class170[var5 + 1];
                }
                if (var6.field2330.length <= var5) {
                    class170[] var7 = new class170[var5 + 1];
                    for (int var8 = 0; var8 < var6.field2330.length; var8++) {
                        var7[var8] = var6.field2330[var8];
                    }
                    var6.field2330 = var7;
                }
                if (var5 > 0 && var6.field2330[var5 - 1] == null) {
                    throw new RuntimeException("" + (var5 - 1));
                }
                class170 var9 = new class170();
                var9.field2208 = var4;
                var9.field2225 = var9.field2206 = var6.field2206;
                var9.field2306 = var5;
                var9.field2205 = true;
                var6.field2330[var5] = var9;
                if (arg2) {
                    Statics.field59 = var9;
                } else {
                    Statics.field298 = var9;
                }
                client.method3099(var6);
                var10 = 1;
            } else if (arg0 == 101) {
                class170 var11 = arg2 ? Statics.field59 : Statics.field298;
                class170 var12 = class170.method3109(var11.field2206);
                var12.field2330[var11.field2306] = null;
                client.method3099(var12);
                var10 = 1;
            } else if (arg0 == 102) {
                class170 var13 = class170.method3109(field748[--Statics.field1687]);
                var13.field2330 = null;
                client.method3099(var13);
                var10 = 1;
            } else if (arg0 == 200) {
                Statics.field1687 -= 2;
                int var14 = field748[Statics.field1687];
                int var15 = field748[Statics.field1687 + 1];
                class170 var16 = class170.method1140(var14, var15);
                if (var16 == null || var15 == -1) {
                    field748[++Statics.field1687 - 1] = 0;
                } else {
                    field748[++Statics.field1687 - 1] = 1;
                    if (arg2) {
                        Statics.field59 = var16;
                    } else {
                        Statics.field298 = var16;
                    }
                }
                var10 = 1;
            } else if (arg0 == 201) {
                class170 var17 = class170.method3109(field748[--Statics.field1687]);
                if (var17 == null) {
                    field748[++Statics.field1687 - 1] = 0;
                } else {
                    field748[++Statics.field1687 - 1] = 1;
                    if (arg2) {
                        Statics.field59 = var17;
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
            return method705(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method3112(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2038(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method197(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method96(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class170 var21 = arg2 ? Statics.field59 : Statics.field298;
            byte var22;
            if (arg0 == 1500) {
                field748[++Statics.field1687 - 1] = var21.field2219;
                var22 = 1;
            } else if (arg0 == 1501) {
                field748[++Statics.field1687 - 1] = var21.field2220;
                var22 = 1;
            } else if (arg0 == 1502) {
                field748[++Statics.field1687 - 1] = var21.field2221;
                var22 = 1;
            } else if (arg0 == 1503) {
                field748[++Statics.field1687 - 1] = var21.field2196;
                var22 = 1;
            } else if (arg0 == 1504) {
                field748[++Statics.field1687 - 1] = var21.field2226 ? 1 : 0;
                var22 = 1;
            } else if (arg0 == 1505) {
                field748[++Statics.field1687 - 1] = var21.field2225;
                var22 = 1;
            } else {
                var22 = 2;
            }
            return var22;
        } else if (arg0 < 1700) {
            return method1924(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method257(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            class170 var23 = arg2 ? Statics.field59 : Statics.field298;
            byte var28;
            if (arg0 == 1800) {
                int[] var24 = field748;
                int var25 = ++Statics.field1687 - 1;
                int var26 = client.method3421(var23);
                int var27 = var26 >> 11 & 0x3F;
                var24[var25] = var27;
                var28 = 1;
            } else if (arg0 == 1801) {
                int var29 = field748[--Statics.field1687];
                int var173 = var29 - 1;
                if (var23.field2280 == null || var173 >= var23.field2280.length || var23.field2280[var173] == null) {
                    field749[++Statics.field750 - 1] = "";
                } else {
                    field749[++Statics.field750 - 1] = var23.field2280[var173];
                }
                var28 = 1;
            } else if (arg0 == 1802) {
                if (var23.field2279 == null) {
                    field749[++Statics.field750 - 1] = "";
                } else {
                    field749[++Statics.field750 - 1] = var23.field2279;
                }
                var28 = 1;
            } else {
                var28 = 2;
            }
            return var28;
        } else if (arg0 < 2000) {
            return method1679(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method705(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method3112(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2038(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method197(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method96(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method2990(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            byte var31;
            if (arg0 == 2700) {
                class170 var30 = class170.method3109(field748[--Statics.field1687]);
                field748[++Statics.field1687 - 1] = var30.field2326;
                var31 = 1;
            } else if (arg0 == 2701) {
                class170 var32 = class170.method3109(field748[--Statics.field1687]);
                if (var32.field2326 == -1) {
                    field748[++Statics.field1687 - 1] = 0;
                } else {
                    field748[++Statics.field1687 - 1] = var32.field2327;
                }
                var31 = 1;
            } else if (arg0 == 2702) {
                int var33 = field748[--Statics.field1687];
                class18 var34 = (class18) client.field467.method2260((long) var33);
                if (var34 == null) {
                    field748[++Statics.field1687 - 1] = 0;
                } else {
                    field748[++Statics.field1687 - 1] = 1;
                }
                var31 = 1;
            } else if (arg0 == 2706) {
                field748[++Statics.field1687 - 1] = client.field523;
                var31 = 1;
            } else {
                var31 = 2;
            }
            return var31;
        } else if (arg0 < 2900) {
            class170 var35 = class170.method3109(field748[--Statics.field1687]);
            byte var40;
            if (arg0 == 2800) {
                int[] var36 = field748;
                int var37 = ++Statics.field1687 - 1;
                int var38 = client.method3421(var35);
                int var39 = var38 >> 11 & 0x3F;
                var36[var37] = var39;
                var40 = 1;
            } else if (arg0 == 2801) {
                int var41 = field748[--Statics.field1687];
                int var174 = var41 - 1;
                if (var35.field2280 == null || var174 >= var35.field2280.length || var35.field2280[var174] == null) {
                    field749[++Statics.field750 - 1] = "";
                } else {
                    field749[++Statics.field750 - 1] = var35.field2280[var174];
                }
                var40 = 1;
            } else if (arg0 == 2802) {
                if (var35.field2279 == null) {
                    field749[++Statics.field750 - 1] = "";
                } else {
                    field749[++Statics.field750 - 1] = var35.field2279;
                }
                var40 = 1;
            } else {
                var40 = 2;
            }
            return var40;
        } else if (arg0 < 3000) {
            return method1679(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method65(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2937(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            byte var42;
            if (arg0 == 3300) {
                field748[++Statics.field1687 - 1] = client.field450;
                var42 = 1;
            } else if (arg0 == 3301) {
                Statics.field1687 -= 2;
                int var43 = field748[Statics.field1687];
                int var44 = field748[Statics.field1687 + 1];
                int[] var45 = field748;
                int var46 = ++Statics.field1687 - 1;
                class13 var47 = (class13) class13.field145.method2260((long) var43);
                int var48;
                if (var47 == null) {
                    var48 = -1;
                } else if (var44 >= 0 && var44 < var47.field139.length) {
                    var48 = var47.field139[var44];
                } else {
                    var48 = -1;
                }
                var45[var46] = var48;
                var42 = 1;
            } else if (arg0 == 3302) {
                Statics.field1687 -= 2;
                int var49 = field748[Statics.field1687];
                int var50 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = class13.method1424(var49, var50);
                var42 = 1;
            } else if (arg0 == 3303) {
                Statics.field1687 -= 2;
                int var51 = field748[Statics.field1687];
                int var52 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = class13.method1142(var51, var52);
                var42 = 1;
            } else if (arg0 == 3304) {
                int var53 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = class187.method3202(var53).field2775;
                var42 = 1;
            } else if (arg0 == 3305) {
                int var54 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = client.field385[var54];
                var42 = 1;
            } else if (arg0 == 3306) {
                int var55 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = client.field367[var55];
                var42 = 1;
            } else if (arg0 == 3307) {
                int var56 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = client.field442[var56];
                var42 = 1;
            } else if (arg0 == 3308) {
                int var57 = Statics.field1569;
                int var58 = (Statics.field792.field638 >> 7) + Statics.field60;
                int var59 = (Statics.field792.field625 >> 7) + Statics.field290;
                field748[++Statics.field1687 - 1] = (var57 << 28) + (var58 << 14) + var59;
                var42 = 1;
            } else if (arg0 == 3309) {
                int var60 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = var60 >> 14 & 0x3FFF;
                var42 = 1;
            } else if (arg0 == 3310) {
                int var61 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = var61 >> 28;
                var42 = 1;
            } else if (arg0 == 3311) {
                int var62 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = var62 & 0x3FFF;
                var42 = 1;
            } else if (arg0 == 3312) {
                field748[++Statics.field1687 - 1] = client.field308 ? 1 : 0;
                var42 = 1;
            } else if (arg0 == 3313) {
                Statics.field1687 -= 2;
                int var63 = field748[Statics.field1687] + 32768;
                int var64 = field748[Statics.field1687 + 1];
                int[] var65 = field748;
                int var66 = ++Statics.field1687 - 1;
                class13 var67 = (class13) class13.field145.method2260((long) var63);
                int var68;
                if (var67 == null) {
                    var68 = -1;
                } else if (var64 >= 0 && var64 < var67.field139.length) {
                    var68 = var67.field139[var64];
                } else {
                    var68 = -1;
                }
                var65[var66] = var68;
                var42 = 1;
            } else if (arg0 == 3314) {
                Statics.field1687 -= 2;
                int var69 = field748[Statics.field1687] + 32768;
                int var70 = field748[Statics.field1687 + 1];
                int[] var71 = field748;
                int var72 = ++Statics.field1687 - 1;
                class13 var73 = (class13) class13.field145.method2260((long) var69);
                int var74;
                if (var73 == null) {
                    var74 = 0;
                } else if (var70 >= 0 && var70 < var73.field140.length) {
                    var74 = var73.field140[var70];
                } else {
                    var74 = 0;
                }
                var71[var72] = var74;
                var42 = 1;
            } else if (arg0 == 3315) {
                Statics.field1687 -= 2;
                int var75 = field748[Statics.field1687] + 32768;
                int var76 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = class13.method1142(var75, var76);
                var42 = 1;
            } else if (arg0 == 3316) {
                if (client.field473 >= 2) {
                    field748[++Statics.field1687 - 1] = client.field473;
                } else {
                    field748[++Statics.field1687 - 1] = 0;
                }
                var42 = 1;
            } else if (arg0 == 3317) {
                field748[++Statics.field1687 - 1] = client.field323;
                var42 = 1;
            } else if (arg0 == 3318) {
                field748[++Statics.field1687 - 1] = client.field303;
                var42 = 1;
            } else if (arg0 == 3321) {
                field748[++Statics.field1687 - 1] = client.field471;
                var42 = 1;
            } else if (arg0 == 3322) {
                field748[++Statics.field1687 - 1] = client.field472;
                var42 = 1;
            } else if (arg0 == 3323) {
                if (client.field475) {
                    field748[++Statics.field1687 - 1] = 1;
                } else {
                    field748[++Statics.field1687 - 1] = 0;
                }
                var42 = 1;
            } else if (arg0 == 3324) {
                field748[++Statics.field1687 - 1] = client.field304;
                var42 = 1;
            } else {
                var42 = 2;
            }
            return var42;
        } else if (arg0 < 3500) {
            return method1925(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method181(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method31(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            byte var79;
            if (arg0 == 4000) {
                Statics.field1687 -= 2;
                int var77 = field748[Statics.field1687];
                int var78 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = var77 + var78;
                var79 = 1;
            } else if (arg0 == 4001) {
                Statics.field1687 -= 2;
                int var80 = field748[Statics.field1687];
                int var81 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = var80 - var81;
                var79 = 1;
            } else if (arg0 == 4002) {
                Statics.field1687 -= 2;
                int var82 = field748[Statics.field1687];
                int var83 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = var82 * var83;
                var79 = 1;
            } else if (arg0 == 4003) {
                Statics.field1687 -= 2;
                int var84 = field748[Statics.field1687];
                int var85 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = var84 / var85;
                var79 = 1;
            } else if (arg0 == 4004) {
                int var86 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = (int) (Math.random() * (double) var86);
                var79 = 1;
            } else if (arg0 == 4005) {
                int var87 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = (int) (Math.random() * (double) (var87 + 1));
                var79 = 1;
            } else if (arg0 == 4006) {
                Statics.field1687 -= 5;
                int var88 = field748[Statics.field1687];
                int var89 = field748[Statics.field1687 + 1];
                int var90 = field748[Statics.field1687 + 2];
                int var91 = field748[Statics.field1687 + 3];
                int var92 = field748[Statics.field1687 + 4];
                field748[++Statics.field1687 - 1] = (var89 - var88) * (var92 - var90) / (var91 - var90) + var88;
                var79 = 1;
            } else if (arg0 == 4007) {
                Statics.field1687 -= 2;
                int var93 = field748[Statics.field1687];
                int var94 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = var93 * var94 / 100 + var93;
                var79 = 1;
            } else if (arg0 == 4008) {
                Statics.field1687 -= 2;
                int var95 = field748[Statics.field1687];
                int var96 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = var95 | 0x1 << var96;
                var79 = 1;
            } else if (arg0 == 4009) {
                Statics.field1687 -= 2;
                int var97 = field748[Statics.field1687];
                int var98 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = var97 & -1 - (0x1 << var98);
                var79 = 1;
            } else if (arg0 == 4010) {
                Statics.field1687 -= 2;
                int var99 = field748[Statics.field1687];
                int var100 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = (var99 & 0x1 << var100) == 0 ? 0 : 1;
                var79 = 1;
            } else if (arg0 == 4011) {
                Statics.field1687 -= 2;
                int var101 = field748[Statics.field1687];
                int var102 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = var101 % var102;
                var79 = 1;
            } else if (arg0 == 4012) {
                Statics.field1687 -= 2;
                int var103 = field748[Statics.field1687];
                int var104 = field748[Statics.field1687 + 1];
                if (var103 == 0) {
                    field748[++Statics.field1687 - 1] = 0;
                } else {
                    field748[++Statics.field1687 - 1] = (int) Math.pow((double) var103, (double) var104);
                }
                var79 = 1;
            } else if (arg0 == 4013) {
                Statics.field1687 -= 2;
                int var105 = field748[Statics.field1687];
                int var106 = field748[Statics.field1687 + 1];
                if (var105 == 0) {
                    field748[++Statics.field1687 - 1] = 0;
                } else if (var106 == 0) {
                    field748[++Statics.field1687 - 1] = Integer.MAX_VALUE;
                } else {
                    field748[++Statics.field1687 - 1] = (int) Math.pow((double) var105, 1.0D / (double) var106);
                }
                var79 = 1;
            } else if (arg0 == 4014) {
                Statics.field1687 -= 2;
                int var107 = field748[Statics.field1687];
                int var108 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = var107 & var108;
                var79 = 1;
            } else if (arg0 == 4015) {
                Statics.field1687 -= 2;
                int var109 = field748[Statics.field1687];
                int var110 = field748[Statics.field1687 + 1];
                field748[++Statics.field1687 - 1] = var109 | var110;
                var79 = 1;
            } else if (arg0 == 4018) {
                Statics.field1687 -= 3;
                long var111 = (long) field748[Statics.field1687];
                long var113 = (long) field748[Statics.field1687 + 1];
                long var115 = (long) field748[Statics.field1687 + 2];
                field748[++Statics.field1687 - 1] = (int) (var111 * var115 / var113);
                var79 = 1;
            } else {
                var79 = 2;
            }
            return var79;
        } else if (arg0 < 4200) {
            return method1948(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            byte var118;
            if (arg0 == 4200) {
                int var117 = field748[--Statics.field1687];
                field749[++Statics.field750 - 1] = class199.method1947(var117).field2959;
                var118 = 1;
            } else if (arg0 == 4201) {
                Statics.field1687 -= 2;
                int var119 = field748[Statics.field1687];
                int var120 = field748[Statics.field1687 + 1];
                class199 var121 = class199.method1947(var119);
                if (var120 < 1 || var120 > 5 || var121.field3002[var120 - 1] == null) {
                    field749[++Statics.field750 - 1] = "";
                } else {
                    field749[++Statics.field750 - 1] = var121.field3002[var120 - 1];
                }
                var118 = 1;
            } else if (arg0 == 4202) {
                Statics.field1687 -= 2;
                int var122 = field748[Statics.field1687];
                int var123 = field748[Statics.field1687 + 1];
                class199 var124 = class199.method1947(var122);
                if (var123 < 1 || var123 > 5 || var124.field2974[var123 - 1] == null) {
                    field749[++Statics.field750 - 1] = "";
                } else {
                    field749[++Statics.field750 - 1] = var124.field2974[var123 - 1];
                }
                var118 = 1;
            } else if (arg0 == 4203) {
                int var125 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = class199.method1947(var125).field2971;
                var118 = 1;
            } else if (arg0 == 4204) {
                int var126 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = class199.method1947(var126).field2995 == 1 ? 1 : 0;
                var118 = 1;
            } else if (arg0 == 4205) {
                int var127 = field748[--Statics.field1687];
                class199 var128 = class199.method1947(var127);
                if (var128.field2972 == -1 && var128.field2990 >= 0) {
                    field748[++Statics.field1687 - 1] = var128.field2990;
                } else {
                    field748[++Statics.field1687 - 1] = var127;
                }
                var118 = 1;
            } else if (arg0 == 4206) {
                int var129 = field748[--Statics.field1687];
                class199 var130 = class199.method1947(var129);
                if (var130.field2972 >= 0 && var130.field2990 >= 0) {
                    field748[++Statics.field1687 - 1] = var130.field2990;
                } else {
                    field748[++Statics.field1687 - 1] = var129;
                }
                var118 = 1;
            } else if (arg0 == 4207) {
                int var131 = field748[--Statics.field1687];
                field748[++Statics.field1687 - 1] = class199.method1947(var131).field2985 ? 1 : 0;
                var118 = 1;
            } else if (arg0 == 4208) {
                int var132 = field748[--Statics.field1687];
                class199 var133 = class199.method1947(var132);
                if (var133.field2977 == -1 && var133.field3001 >= 0) {
                    field748[++Statics.field1687 - 1] = var133.field3001;
                } else {
                    field748[++Statics.field1687 - 1] = var132;
                }
                var118 = 1;
            } else if (arg0 == 4209) {
                int var134 = field748[--Statics.field1687];
                class199 var135 = class199.method1947(var134);
                if (var135.field2977 >= 0 && var135.field3001 >= 0) {
                    field748[++Statics.field1687 - 1] = var135.field3001;
                } else {
                    field748[++Statics.field1687 - 1] = var134;
                }
                var118 = 1;
            } else if (arg0 == 4210) {
                String var136 = field749[--Statics.field750];
                int var137 = field748[--Statics.field1687];
                boolean var139 = var137 == 1;
                String var140 = var136.toLowerCase();
                short[] var141 = new short[16];
                int var142 = 0;
                int var143 = 0;
                while (true) {
                    if (var143 >= Statics.field2961) {
                        Statics.field15 = var141;
                        Statics.field3052 = 0;
                        Statics.field209 = var142;
                        String[] var147 = new String[Statics.field209];
                        for (int var148 = 0; var148 < Statics.field209; var148++) {
                            var147[var148] = class199.method1947(var141[var148]).field2959;
                        }
                        class151.method1891(var147, Statics.field15);
                        break;
                    }
                    class199 var144 = class199.method1947(var143);
                    if ((!var139 || var144.field2998) && var144.field2972 == -1 && var144.field2959.toLowerCase().indexOf(var140) != -1) {
                        if (var142 >= 250) {
                            Statics.field209 = -1;
                            Statics.field15 = null;
                            break;
                        }
                        if (var142 >= var141.length) {
                            short[] var145 = new short[var141.length * 2];
                            for (int var146 = 0; var146 < var142; var146++) {
                                var145[var146] = var141[var146];
                            }
                            var141 = var145;
                        }
                        var141[var142++] = (short) var143;
                    }
                    var143++;
                }
                field748[++Statics.field1687 - 1] = Statics.field209;
                var118 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field15 == null || Statics.field3052 >= Statics.field209) {
                    field748[++Statics.field1687 - 1] = -1;
                } else {
                    field748[++Statics.field1687 - 1] = Statics.field15[++Statics.field3052 - 1] & 0xFFFF;
                }
                var118 = 1;
            } else if (arg0 == 4212) {
                Statics.field3052 = 0;
                var118 = 1;
            } else {
                var118 = 2;
            }
            return var118;
        } else if (arg0 < 5100) {
            return method95(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            byte var149;
            if (arg0 == 5306) {
                field748[++Statics.field1687 - 1] = client.method98();
                var149 = 1;
            } else if (arg0 == 5307) {
                int var150 = field748[--Statics.field1687];
                if (var150 == 1 || var150 == 2) {
                    client.method951(var150);
                }
                var149 = 1;
            } else if (arg0 == 5308) {
                field748[++Statics.field1687 - 1] = Statics.field2736.field717;
                var149 = 1;
            } else if (arg0 == 5309) {
                int var151 = field748[--Statics.field1687];
                if (var151 == 1 || var151 == 2) {
                    Statics.field2736.field717 = var151;
                    class31.method1906();
                }
                var149 = 1;
            } else {
                var149 = 2;
            }
            return var149;
        } else if (arg0 < 5600) {
            byte var157;
            if (arg0 == 5504) {
                Statics.field1687 -= 2;
                int var155 = field748[Statics.field1687];
                int var156 = field748[Statics.field1687 + 1];
                if (!client.field554) {
                    client.field542 = var155;
                    client.field527 = var156;
                }
                var157 = 1;
            } else if (arg0 == 5505) {
                field748[++Statics.field1687 - 1] = client.field542;
                var157 = 1;
            } else if (arg0 == 5506) {
                field748[++Statics.field1687 - 1] = client.field527;
                var157 = 1;
            } else if (arg0 == 5530) {
                int var158 = field748[--Statics.field1687];
                if (var158 < 0) {
                    var158 = 0;
                }
                client.field395 = var158;
                var157 = 1;
            } else if (arg0 == 5531) {
                field748[++Statics.field1687 - 1] = client.field395;
                var157 = 1;
            } else {
                var157 = 2;
            }
            return var157;
        } else if (arg0 < 5700) {
            byte var159;
            if (arg0 == 5630) {
                client.field359 = 250;
                var159 = 1;
            } else {
                var159 = 2;
            }
            return var159;
        } else if (arg0 < 6300) {
            return method2043(arg0, arg1, arg2);
        } else if (arg0 >= 6600) {
            return 2;
        } else {
            byte var160;
            if (arg0 == 6500) {
                field748[++Statics.field1687 - 1] = class30.method3269() ? 1 : 0;
                var160 = 1;
            } else if (arg0 == 6501) {
                class30.field712 = 0;
                class30 var161 = class30.method149();
                if (var161 == null) {
                    field748[++Statics.field1687 - 1] = -1;
                    field748[++Statics.field1687 - 1] = 0;
                    field749[++Statics.field750 - 1] = "";
                    field748[++Statics.field1687 - 1] = 0;
                    field748[++Statics.field1687 - 1] = 0;
                    field749[++Statics.field750 - 1] = "";
                } else {
                    field748[++Statics.field1687 - 1] = var161.field700;
                    field748[++Statics.field1687 - 1] = var161.field703;
                    field749[++Statics.field750 - 1] = var161.field692;
                    field748[++Statics.field1687 - 1] = var161.field705;
                    field748[++Statics.field1687 - 1] = var161.field702;
                    field749[++Statics.field750 - 1] = var161.field696;
                }
                var160 = 1;
            } else if (arg0 == 6502) {
                class30 var163 = class30.method149();
                if (var163 == null) {
                    field748[++Statics.field1687 - 1] = -1;
                    field748[++Statics.field1687 - 1] = 0;
                    field749[++Statics.field750 - 1] = "";
                    field748[++Statics.field1687 - 1] = 0;
                    field748[++Statics.field1687 - 1] = 0;
                    field749[++Statics.field750 - 1] = "";
                } else {
                    field748[++Statics.field1687 - 1] = var163.field700;
                    field748[++Statics.field1687 - 1] = var163.field703;
                    field749[++Statics.field750 - 1] = var163.field692;
                    field748[++Statics.field1687 - 1] = var163.field705;
                    field748[++Statics.field1687 - 1] = var163.field702;
                    field749[++Statics.field750 - 1] = var163.field696;
                }
                var160 = 1;
            } else if (arg0 == 6506) {
                int var164 = field748[--Statics.field1687];
                class30 var165 = null;
                for (int var166 = 0; var166 < class30.field704; var166++) {
                    if (Statics.field695[var166].field700 == var164) {
                        var165 = Statics.field695[var166];
                        break;
                    }
                }
                if (var165 == null) {
                    field748[++Statics.field1687 - 1] = -1;
                    field748[++Statics.field1687 - 1] = 0;
                    field749[++Statics.field750 - 1] = "";
                    field748[++Statics.field1687 - 1] = 0;
                    field748[++Statics.field1687 - 1] = 0;
                    field749[++Statics.field750 - 1] = "";
                } else {
                    field748[++Statics.field1687 - 1] = var165.field700;
                    field748[++Statics.field1687 - 1] = var165.field703;
                    field749[++Statics.field750 - 1] = var165.field692;
                    field748[++Statics.field1687 - 1] = var165.field705;
                    field748[++Statics.field1687 - 1] = var165.field702;
                    field749[++Statics.field750 - 1] = var165.field696;
                }
                var160 = 1;
            } else if (arg0 == 6507) {
                Statics.field1687 -= 4;
                int var167 = field748[Statics.field1687];
                boolean var168 = field748[Statics.field1687 + 1] == 1;
                int var169 = field748[Statics.field1687 + 2];
                boolean var170 = field748[Statics.field1687 + 3] == 1;
                if (Statics.field695 != null) {
                    class30.method601(0, Statics.field695.length - 1, var167, var168, var169, var170);
                }
                var160 = 1;
            } else if (arg0 == 6511) {
                int var171 = field748[--Statics.field1687];
                if (var171 >= 0 && var171 < class30.field704) {
                    class30 var172 = Statics.field695[var171];
                    field748[++Statics.field1687 - 1] = var172.field700;
                    field748[++Statics.field1687 - 1] = var172.field703;
                    field749[++Statics.field750 - 1] = var172.field692;
                    field748[++Statics.field1687 - 1] = var172.field705;
                    field748[++Statics.field1687 - 1] = var172.field702;
                    field749[++Statics.field750 - 1] = var172.field696;
                } else {
                    field748[++Statics.field1687 - 1] = -1;
                    field748[++Statics.field1687 - 1] = 0;
                    field749[++Statics.field750 - 1] = "";
                    field748[++Statics.field1687 - 1] = 0;
                    field748[++Statics.field1687 - 1] = 0;
                    field749[++Statics.field750 - 1] = "";
                }
                var160 = 1;
            } else if (arg0 == 6512) {
                client.field315 = field748[--Statics.field1687] == 1;
                var160 = 1;
            } else {
                var160 = 2;
            }
            return var160;
        }
    }

    @ObfuscatedName("ad.p(ILay;ZI)I")
    public static int method705(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field748[--Statics.field1687];
            var4 = class170.method3109(var3);
        } else {
            var4 = arg2 ? Statics.field59 : Statics.field298;
        }
        if (arg0 == 1000) {
            Statics.field1687 -= 4;
            var4.field2215 = field748[Statics.field1687];
            var4.field2194 = field748[Statics.field1687 + 1];
            var4.field2292 = field748[Statics.field1687 + 2];
            var4.field2218 = field748[Statics.field1687 + 3];
            client.method3099(var4);
            client.method2010(var4);
            if (var3 != -1 && var4.field2208 == 0) {
                client.method2867(Statics.field2197[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1687 -= 4;
            var4.field2211 = field748[Statics.field1687];
            var4.field2298 = field748[Statics.field1687 + 1];
            var4.field2216 = field748[Statics.field1687 + 2];
            var4.field2313 = field748[Statics.field1687 + 3];
            client.method3099(var4);
            client.method2010(var4);
            if (var3 != -1 && var4.field2208 == 0) {
                client.method2867(Statics.field2197[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field748[--Statics.field1687] == 1;
            if (var4.field2226 != var5) {
                var4.field2226 = var5;
                client.method3099(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2233 = field748[--Statics.field1687] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2200 = field748[--Statics.field1687] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fo.j(ILay;ZI)I")
    public static int method3112(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field748[--Statics.field1687];
            var4 = class170.method3109(var3);
        } else {
            var4 = arg2 ? Statics.field59 : Statics.field298;
        }
        if (arg0 == 1100) {
            Statics.field1687 -= 2;
            var4.field2227 = field748[Statics.field1687];
            if (var4.field2227 > var4.field2229 - var4.field2221) {
                var4.field2227 = var4.field2229 - var4.field2221;
            }
            if (var4.field2227 < 0) {
                var4.field2227 = 0;
            }
            var4.field2252 = field748[Statics.field1687 + 1];
            if (var4.field2252 > var4.field2248 - var4.field2196) {
                var4.field2252 = var4.field2248 - var4.field2196;
            }
            if (var4.field2252 < 0) {
                var4.field2252 = 0;
            }
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2232 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2235 = field748[--Statics.field1687] == 1;
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2286 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2290 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2241 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2243 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2244 = field748[--Statics.field1687] == 1;
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2249 = 1;
            var4.field2247 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1687 -= 6;
            var4.field2255 = field748[Statics.field1687];
            var4.field2256 = field748[Statics.field1687 + 1];
            var4.field2257 = field748[Statics.field1687 + 2];
            var4.field2258 = field748[Statics.field1687 + 3];
            var4.field2214 = field748[Statics.field1687 + 4];
            var4.field2260 = field748[Statics.field1687 + 5];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field748[--Statics.field1687];
            if (var4.field2231 != var5) {
                var4.field2231 = var5;
                var4.field2328 = 0;
                var4.field2329 = 0;
                client.method3099(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2263 = field748[--Statics.field1687] == 1;
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field749[--Statics.field750];
            if (!var6.equals(var4.field2266)) {
                var4.field2266 = var6;
                client.method3099(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2239 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1687 -= 3;
            var4.field2269 = field748[Statics.field1687];
            var4.field2270 = field748[Statics.field1687 + 1];
            var4.field2268 = field748[Statics.field1687 + 2];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2271 = field748[--Statics.field1687] == 1;
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2245 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2246 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2217 = field748[--Statics.field1687] == 1;
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2210 = field748[--Statics.field1687] == 1;
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1687 -= 2;
            var4.field2229 = field748[Statics.field1687];
            var4.field2248 = field748[Statics.field1687 + 1];
            client.method3099(var4);
            if (var3 != -1 && var4.field2208 == 0) {
                client.method2867(Statics.field2197[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method859(var4.field2206, var4.field2306);
            client.field470 = var4;
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2339 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2314 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2238 = field748[--Statics.field1687];
            client.method3099(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field748[--Statics.field1687];
            class222 var8 = (class222) class149.method2203(class222.method877(), var7);
            if (var8 != null) {
                var4.field2236 = var8;
                client.method3099(var4);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dn.n(ILay;ZI)I")
    public static int method2038(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method3109(field748[--Statics.field1687]);
        } else {
            var3 = arg2 ? Statics.field59 : Statics.field298;
        }
        client.method3099(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1687 -= 2;
            int var4 = field748[Statics.field1687];
            int var5 = field748[Statics.field1687 + 1];
            var3.field2326 = var4;
            var3.field2327 = var5;
            class199 var6 = class199.method1947(var4);
            var3.field2257 = var6.field2968;
            var3.field2258 = var6.field2966;
            var3.field2214 = var6.field2967;
            var3.field2255 = var6.field2965;
            var3.field2256 = var6.field2969;
            var3.field2260 = var6.field2991;
            if (arg0 == 1205) {
                var3.field2264 = 0;
            } else if (arg0 == 1212 | var6.field2995 == 1) {
                var3.field2264 = 1;
            } else {
                var3.field2264 = 2;
            }
            if (var3.field2261 > 0) {
                var3.field2260 = var3.field2260 * 32 / var3.field2261;
            } else if (var3.field2211 > 0) {
                var3.field2260 = var3.field2260 * 32 / var3.field2211;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2249 = 2;
            var3.field2247 = field748[--Statics.field1687];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2249 = 3;
            var3.field2247 = Statics.field792.field284.method3001();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.c(ILay;ZI)I")
    public static int method197(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method3109(field748[--Statics.field1687]);
        } else {
            var3 = arg2 ? Statics.field59 : Statics.field298;
        }
        if (arg0 == 1300) {
            int var4 = field748[--Statics.field1687] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3043(var4, field749[--Statics.field750]);
                return 1;
            } else {
                Statics.field750--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1687 -= 2;
            int var5 = field748[Statics.field1687];
            int var6 = field748[Statics.field1687 + 1];
            var3.field2281 = class170.method1140(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2284 = field748[--Statics.field1687] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2282 = field748[--Statics.field1687];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2237 = field748[--Statics.field1687];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2279 = field749[--Statics.field750];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2307 = field749[--Statics.field750];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2280 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("i.o(ILay;ZI)I")
    public static int method96(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method3109(field748[--Statics.field1687]);
        } else {
            var3 = arg2 ? Statics.field59 : Statics.field298;
        }
        String var4 = field749[--Statics.field750];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field748[--Statics.field1687];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field748[--Statics.field1687];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field749[--Statics.field750];
            } else {
                var7[var8] = Integer.valueOf(field748[--Statics.field1687]);
            }
        }
        int var9 = field748[--Statics.field1687];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2288 = var7;
        } else if (arg0 == 1401) {
            var3.field2291 = var7;
        } else if (arg0 == 1402) {
            var3.field2287 = var7;
        } else if (arg0 == 1403) {
            var3.field2267 = var7;
        } else if (arg0 == 1404) {
            var3.field2294 = var7;
        } else if (arg0 == 1405) {
            var3.field2283 = var7;
        } else if (arg0 == 1406) {
            var3.field2207 = var7;
        } else if (arg0 == 1407) {
            var3.field2228 = var7;
            var3.field2300 = var5;
        } else if (arg0 == 1408) {
            var3.field2305 = var7;
        } else if (arg0 == 1409) {
            var3.field2275 = var7;
        } else if (arg0 == 1410) {
            var3.field2296 = var7;
        } else if (arg0 == 1411) {
            var3.field2289 = var7;
        } else if (arg0 == 1412) {
            var3.field2293 = var7;
        } else if (arg0 == 1414) {
            var3.field2204 = var7;
            var3.field2302 = var5;
        } else if (arg0 == 1415) {
            var3.field2303 = var7;
            var3.field2304 = var5;
        } else if (arg0 == 1416) {
            var3.field2297 = var7;
        } else if (arg0 == 1417) {
            var3.field2209 = var7;
        } else if (arg0 == 1418) {
            var3.field2308 = var7;
        } else if (arg0 == 1419) {
            var3.field2285 = var7;
        } else if (arg0 == 1420) {
            var3.field2312 = var7;
        } else if (arg0 == 1421) {
            var3.field2311 = var7;
        } else if (arg0 == 1422) {
            var3.field2331 = var7;
        } else if (arg0 == 1423) {
            var3.field2299 = var7;
        } else if (arg0 == 1424) {
            var3.field2201 = var7;
        } else if (arg0 == 1425) {
            var3.field2316 = var7;
        } else if (arg0 == 1426) {
            var3.field2317 = var7;
        } else if (arg0 == 1427) {
            var3.field2212 = var7;
        } else {
            return 2;
        }
        var3.field2310 = true;
        return 1;
    }

    @ObfuscatedName("ce.s(ILay;ZI)I")
    public static int method1924(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = arg2 ? Statics.field59 : Statics.field298;
        if (arg0 == 1600) {
            field748[++Statics.field1687 - 1] = var3.field2227;
            return 1;
        } else if (arg0 == 1601) {
            field748[++Statics.field1687 - 1] = var3.field2252;
            return 1;
        } else if (arg0 == 1602) {
            field749[++Statics.field750 - 1] = var3.field2266;
            return 1;
        } else if (arg0 == 1603) {
            field748[++Statics.field1687 - 1] = var3.field2229;
            return 1;
        } else if (arg0 == 1604) {
            field748[++Statics.field1687 - 1] = var3.field2248;
            return 1;
        } else if (arg0 == 1605) {
            field748[++Statics.field1687 - 1] = var3.field2260;
            return 1;
        } else if (arg0 == 1606) {
            field748[++Statics.field1687 - 1] = var3.field2257;
            return 1;
        } else if (arg0 == 1607) {
            field748[++Statics.field1687 - 1] = var3.field2214;
            return 1;
        } else if (arg0 == 1608) {
            field748[++Statics.field1687 - 1] = var3.field2258;
            return 1;
        } else if (arg0 == 1609) {
            field748[++Statics.field1687 - 1] = var3.field2286;
            return 1;
        } else if (arg0 == 1610) {
            field748[++Statics.field1687 - 1] = var3.field2238;
            return 1;
        } else if (arg0 == 1611) {
            field748[++Statics.field1687 - 1] = var3.field2232;
            return 1;
        } else if (arg0 == 1612) {
            field748[++Statics.field1687 - 1] = var3.field2314;
            return 1;
        } else if (arg0 == 1613) {
            field748[++Statics.field1687 - 1] = var3.field2236.method815();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.u(ILay;ZI)I")
    public static int method257(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = arg2 ? Statics.field59 : Statics.field298;
        if (arg0 == 1700) {
            field748[++Statics.field1687 - 1] = var3.field2326;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2326 == -1) {
                field748[++Statics.field1687 - 1] = 0;
            } else {
                field748[++Statics.field1687 - 1] = var3.field2327;
            }
            return 1;
        } else if (arg0 == 1702) {
            field748[++Statics.field1687 - 1] = var3.field2306;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.b(ILay;ZS)I")
    public static int method1679(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method3109(field748[--Statics.field1687]);
        } else {
            var3 = arg2 ? Statics.field59 : Statics.field298;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field755 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2212 == null) {
            return 0;
        } else {
            class19 var4 = new class19();
            var4.field199 = var3;
            var4.field210 = var3.field2212;
            var4.field198 = field755 + 1;
            client.field436.method2314(var4);
            return 1;
        }
    }

    @ObfuscatedName("q.v(ILay;ZI)I")
    public static int method3(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = class170.method3109(field748[--Statics.field1687]);
        if (arg0 == 2500) {
            field748[++Statics.field1687 - 1] = var3.field2219;
            return 1;
        } else if (arg0 == 2501) {
            field748[++Statics.field1687 - 1] = var3.field2220;
            return 1;
        } else if (arg0 == 2502) {
            field748[++Statics.field1687 - 1] = var3.field2221;
            return 1;
        } else if (arg0 == 2503) {
            field748[++Statics.field1687 - 1] = var3.field2196;
            return 1;
        } else if (arg0 == 2504) {
            field748[++Statics.field1687 - 1] = var3.field2226 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field748[++Statics.field1687 - 1] = var3.field2225;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fp.f(ILay;ZI)I")
    public static int method2990(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = class170.method3109(field748[--Statics.field1687]);
        if (arg0 == 2600) {
            field748[++Statics.field1687 - 1] = var3.field2227;
            return 1;
        } else if (arg0 == 2601) {
            field748[++Statics.field1687 - 1] = var3.field2252;
            return 1;
        } else if (arg0 == 2602) {
            field749[++Statics.field750 - 1] = var3.field2266;
            return 1;
        } else if (arg0 == 2603) {
            field748[++Statics.field1687 - 1] = var3.field2229;
            return 1;
        } else if (arg0 == 2604) {
            field748[++Statics.field1687 - 1] = var3.field2248;
            return 1;
        } else if (arg0 == 2605) {
            field748[++Statics.field1687 - 1] = var3.field2260;
            return 1;
        } else if (arg0 == 2606) {
            field748[++Statics.field1687 - 1] = var3.field2257;
            return 1;
        } else if (arg0 == 2607) {
            field748[++Statics.field1687 - 1] = var3.field2214;
            return 1;
        } else if (arg0 == 2608) {
            field748[++Statics.field1687 - 1] = var3.field2258;
            return 1;
        } else if (arg0 == 2609) {
            field748[++Statics.field1687 - 1] = var3.field2286;
            return 1;
        } else if (arg0 == 2610) {
            field748[++Statics.field1687 - 1] = var3.field2238;
            return 1;
        } else if (arg0 == 2611) {
            field748[++Statics.field1687 - 1] = var3.field2232;
            return 1;
        } else if (arg0 == 2612) {
            field748[++Statics.field1687 - 1] = var3.field2314;
            return 1;
        } else if (arg0 == 2613) {
            field748[++Statics.field1687 - 1] = var3.field2236.method815();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("n.z(ILay;ZI)I")
    public static int method65(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field749[--Statics.field750];
            class48.method187(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1687 -= 2;
            client.method950(Statics.field792, field748[Statics.field1687], field748[Statics.field1687 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.method2866();
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field749[--Statics.field750];
            int var5 = 0;
            if (class208.method1987(var4)) {
                var5 = class208.method2592(var4);
            }
            client.field349.method2896(23);
            client.field349.method2654(var5);
            return 1;
        } else if (arg0 == 3105) {
            String var6 = field749[--Statics.field750];
            client.field349.method2896(191);
            client.field349.method2751(var6.length() + 1);
            client.field349.method2657(var6);
            return 1;
        } else if (arg0 == 3106) {
            String var7 = field749[--Statics.field750];
            client.field349.method2896(41);
            client.field349.method2751(var7.length() + 1);
            client.field349.method2657(var7);
            return 1;
        } else if (arg0 == 3107) {
            int var8 = field748[--Statics.field1687];
            String var9 = field749[--Statics.field750];
            int var10 = class46.field922;
            int[] var11 = class46.field932;
            boolean var12 = false;
            for (int var13 = 0; var13 < var10; var13++) {
                class24 var14 = client.field426[var11[var13]];
                if (var14 != null && Statics.field792 != var14 && var14.field263 != null && var14.field263.equalsIgnoreCase(var9)) {
                    if (var8 == 1) {
                        client.field349.method2896(96);
                        client.field349.method2664(var11[var13]);
                        client.field349.method2689(0);
                    } else if (var8 == 4) {
                        client.field349.method2896(42);
                        client.field349.method2751(0);
                        client.field349.method2698(var11[var13]);
                    } else if (var8 == 6) {
                        client.field349.method2896(176);
                        client.field349.method2690(0);
                        client.field349.method2697(var11[var13]);
                    } else if (var8 == 7) {
                        client.field349.method2896(30);
                        client.field349.method2698(var11[var13]);
                        client.field349.method2768(0);
                    }
                    var12 = true;
                    break;
                }
            }
            if (!var12) {
                class48.method187(4, "", class174.field2633 + var9);
            }
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1687 -= 3;
            int var15 = field748[Statics.field1687];
            int var16 = field748[Statics.field1687 + 1];
            int var17 = field748[Statics.field1687 + 2];
            class170 var18 = class170.method3109(var17);
            client.method177(var18, var15, var16);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1687 -= 2;
            int var19 = field748[Statics.field1687];
            int var20 = field748[Statics.field1687 + 1];
            class170 var21 = arg2 ? Statics.field59 : Statics.field298;
            client.method177(var21, var19, var20);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field174 = field748[--Statics.field1687] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field748[++Statics.field1687 - 1] = Statics.field2736.field715 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field2736.field715 = field748[--Statics.field1687] == 1;
            class31.method1906();
            return 1;
        } else if (arg0 == 3113) {
            String var22 = field749[--Statics.field750];
            boolean var23 = field748[--Statics.field1687] == 1;
            class115.method1442(var22, var23, "openjs", false);
            return 1;
        } else if (arg0 == 3115) {
            int var24 = field748[--Statics.field1687];
            client.field349.method2896(184);
            client.field349.method2664(var24);
            return 1;
        } else if (arg0 == 3116) {
            int var25 = field748[--Statics.field1687];
            Statics.field750 -= 2;
            String var26 = field749[Statics.field750];
            String var27 = field749[Statics.field750 + 1];
            if (var26.length() > 500) {
                return 1;
            } else if (var27.length() > 500) {
                return 1;
            } else {
                client.field349.method2896(179);
                client.field349.method2664(1 + class154.method2202(var26) + class154.method2202(var27));
                client.field349.method2657(var27);
                client.field349.method2768(var25);
                client.field349.method2657(var26);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field454 = field748[--Statics.field1687] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fc.t(ILay;ZI)I")
    public static int method2937(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1687 -= 3;
            client.method1619(field748[Statics.field1687], field748[Statics.field1687 + 1], field748[Statics.field1687 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            int var3 = field748[--Statics.field1687];
            if (var3 == -1 && !client.field546) {
                Statics.field1917.method2469();
                class139.field1920 = 1;
                Statics.field2183 = null;
            } else if (var3 != -1 && client.field422 != var3 && client.field543 != 0 && !client.field546) {
                class139.method2648(2, Statics.field128, var3, 0, client.field543, false);
            }
            client.field422 = var3;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1687 -= 2;
            int var4 = field748[Statics.field1687];
            int var5 = field748[Statics.field1687 + 1];
            if (client.field543 != 0 && var4 != -1) {
                class139.method1399(Statics.field2045, var4, 0, client.field543, false);
                client.field546 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ce.y(ILay;ZI)I")
    public static int method1925(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1687 -= 2;
            int var3 = field748[Statics.field1687];
            int var4 = field748[Statics.field1687 + 1];
            class196 var5 = class196.method3021(var3);
            if (var5.field2858 != 's') {
            }
            for (int var6 = 0; var6 < var5.field2859; var6++) {
                if (var5.field2863[var6] == var4) {
                    field749[++Statics.field750 - 1] = var5.field2861[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field749[++Statics.field750 - 1] = var5.field2862;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1687 -= 4;
            int var7 = field748[Statics.field1687];
            int var8 = field748[Statics.field1687 + 1];
            int var9 = field748[Statics.field1687 + 2];
            int var10 = field748[Statics.field1687 + 3];
            class196 var11 = class196.method3021(var9);
            if (var11.field2857 != var7 || var11.field2858 != var8) {
                if (var8 == 115) {
                    field749[++Statics.field750 - 1] = "null";
                } else {
                    field748[++Statics.field1687 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field2859; var12++) {
                if (var11.field2863[var12] == var10) {
                    if (var8 == 115) {
                        field749[++Statics.field750 - 1] = var11.field2861[var12];
                    } else {
                        field748[++Statics.field1687 - 1] = var11.field2866[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field749[++Statics.field750 - 1] = var11.field2862;
                } else {
                    field748[++Statics.field1687 - 1] = var11.field2864;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.w(ILay;ZB)I")
    public static int method181(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field574 == 0) {
                field748[++Statics.field1687 - 1] = -2;
            } else if (client.field574 == 1) {
                field748[++Statics.field1687 - 1] = -1;
            } else {
                field748[++Statics.field1687 - 1] = client.field573;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field748[--Statics.field1687];
            if (client.field574 == 2 && var3 < client.field573) {
                field749[++Statics.field750 - 1] = client.field423[var3].field166;
                field749[++Statics.field750 - 1] = client.field423[var3].field161;
            } else {
                field749[++Statics.field750 - 1] = "";
                field749[++Statics.field750 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = field748[--Statics.field1687];
            if (client.field574 == 2 && var4 < client.field573) {
                field748[++Statics.field1687 - 1] = client.field423[var4].field164;
            } else {
                field748[++Statics.field1687 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = field748[--Statics.field1687];
            if (client.field574 == 2 && var5 < client.field573) {
                field748[++Statics.field1687 - 1] = client.field423[var5].field163;
            } else {
                field748[++Statics.field1687 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = field749[--Statics.field750];
            int var7 = field748[--Statics.field1687];
            client.method3096(var6, var7);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = field749[--Statics.field750];
            if (var8 != null) {
                if ((client.field573 < 200 || client.field428 == 1) && client.field573 < 400) {
                    String var9 = class205.method1529(var8, Statics.field245);
                    if (var9 != null) {
                        int var10 = 0;
                        while (true) {
                            if (var10 >= client.field573) {
                                for (int var14 = 0; var14 < client.field577; var14++) {
                                    class20 var15 = client.field505[var14];
                                    String var16 = class205.method1529(var15.field223, Statics.field245);
                                    if (var16 != null && var16.equals(var9)) {
                                        class48.method187(30, "", class174.field2531 + var8 + class174.field2532);
                                        return 1;
                                    }
                                    if (var15.field218 != null) {
                                        String var17 = class205.method1529(var15.field218, Statics.field245);
                                        if (var17 != null && var17.equals(var9)) {
                                            class48.method187(30, "", class174.field2531 + var8 + class174.field2532);
                                            return 1;
                                        }
                                    }
                                }
                                if (class205.method1529(Statics.field792.field263, Statics.field245).equals(var9)) {
                                    class48.method187(30, "", class174.field2529);
                                } else {
                                    client.field349.method2896(238);
                                    client.field349.method2751(class154.method2202(var8));
                                    client.field349.method2657(var8);
                                }
                                break;
                            }
                            class15 var11 = client.field423[var10];
                            String var12 = class205.method1529(var11.field166, Statics.field245);
                            if (var12 != null && var12.equals(var9)) {
                                class48.method187(30, "", var8 + class174.field2526);
                                break;
                            }
                            if (var11.field161 != null) {
                                String var13 = class205.method1529(var11.field161, Statics.field245);
                                if (var13 != null && var13.equals(var9)) {
                                    class48.method187(30, "", var8 + class174.field2526);
                                    break;
                                }
                            }
                            var10++;
                        }
                    }
                } else {
                    class48.method187(30, "", class174.field2525);
                }
            }
            return 1;
        } else if (arg0 == 3606) {
            String var18 = field749[--Statics.field750];
            if (var18 != null) {
                String var19 = class205.method1529(var18, Statics.field245);
                if (var19 != null) {
                    for (int var20 = 0; var20 < client.field573; var20++) {
                        class15 var21 = client.field423[var20];
                        String var22 = var21.field166;
                        String var23 = class205.method1529(var22, Statics.field245);
                        boolean var24;
                        if (var18 == null || var22 == null) {
                            var24 = false;
                        } else if (var18.startsWith("#") || var22.startsWith("#")) {
                            var24 = var18.equals(var22);
                        } else {
                            var24 = var19.equals(var23);
                        }
                        if (var24) {
                            client.field573--;
                            for (int var25 = var20; var25 < client.field573; var25++) {
                                client.field423[var25] = client.field423[var25 + 1];
                            }
                            client.field452 = client.field491;
                            client.field349.method2896(1);
                            client.field349.method2751(class154.method2202(var18));
                            client.field349.method2657(var18);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3607) {
            String var26 = field749[--Statics.field750];
            if (var26 != null) {
                if ((client.field577 < 100 || client.field428 == 1) && client.field577 < 400) {
                    String var27 = class205.method1529(var26, Statics.field245);
                    if (var27 != null) {
                        int var28 = 0;
                        while (true) {
                            if (var28 >= client.field577) {
                                for (int var32 = 0; var32 < client.field573; var32++) {
                                    class15 var33 = client.field423[var32];
                                    String var34 = class205.method1529(var33.field166, Statics.field245);
                                    if (var34 != null && var34.equals(var27)) {
                                        class48.method187(31, "", class174.field2533 + var26 + class174.field2534);
                                        return 1;
                                    }
                                    if (var33.field161 != null) {
                                        String var35 = class205.method1529(var33.field161, Statics.field245);
                                        if (var35 != null && var35.equals(var27)) {
                                            class48.method187(31, "", class174.field2533 + var26 + class174.field2534);
                                            return 1;
                                        }
                                    }
                                }
                                if (class205.method1529(Statics.field792.field263, Statics.field245).equals(var27)) {
                                    class48.method187(31, "", class174.field2402);
                                } else {
                                    client.field349.method2896(105);
                                    client.field349.method2751(class154.method2202(var26));
                                    client.field349.method2657(var26);
                                }
                                break;
                            }
                            class20 var29 = client.field505[var28];
                            String var30 = class205.method1529(var29.field223, Statics.field245);
                            if (var30 != null && var30.equals(var27)) {
                                class48.method187(31, "", var26 + class174.field2620);
                                break;
                            }
                            if (var29.field218 != null) {
                                String var31 = class205.method1529(var29.field218, Statics.field245);
                                if (var31 != null && var31.equals(var27)) {
                                    class48.method187(31, "", var26 + class174.field2620);
                                    break;
                                }
                            }
                            var28++;
                        }
                    }
                } else {
                    class48.method187(31, "", class174.field2527);
                }
            }
            return 1;
        } else if (arg0 == 3608) {
            String var36 = field749[--Statics.field750];
            if (var36 != null) {
                String var37 = class205.method1529(var36, Statics.field245);
                if (var37 != null) {
                    for (int var38 = 0; var38 < client.field577; var38++) {
                        class20 var39 = client.field505[var38];
                        String var40 = var39.field223;
                        String var41 = class205.method1529(var40, Statics.field245);
                        boolean var42;
                        if (var36 == null || var40 == null) {
                            var42 = false;
                        } else if (var36.startsWith("#") || var40.startsWith("#")) {
                            var42 = var36.equals(var40);
                        } else {
                            var42 = var37.equals(var41);
                        }
                        if (var42) {
                            client.field577--;
                            for (int var43 = var38; var43 < client.field577; var43++) {
                                client.field505[var43] = client.field505[var43 + 1];
                            }
                            client.field452 = client.field491;
                            client.field349.method2896(150);
                            client.field349.method2751(class154.method2202(var36));
                            client.field349.method2657(var36);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3609) {
            String var44 = field749[--Statics.field750];
            class178[] var45 = class178.method180();
            for (int var46 = 0; var46 < var45.length; var46++) {
                class178 var47 = var45[var46];
                if (var47.field2670 != -1) {
                    int var49 = var47.field2670;
                    String var50 = "<img=" + var49 + ">";
                    if (var44.startsWith(var50)) {
                        var44 = var44.substring(6 + Integer.toString(var47.field2670).length());
                        break;
                    }
                }
            }
            field748[++Statics.field1687 - 1] = client.method184(var44, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field533 == null) {
                field749[++Statics.field750 - 1] = "";
            } else {
                field749[++Statics.field750 - 1] = class206.method2638(client.field533);
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field533 == null) {
                field748[++Statics.field1687 - 1] = 0;
            } else {
                field748[++Statics.field1687 - 1] = Statics.field273;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var51 = field748[--Statics.field1687];
            if (client.field533 == null || var51 >= Statics.field273) {
                field749[++Statics.field750 - 1] = "";
            } else {
                field749[++Statics.field750 - 1] = Statics.field1205[var51].field296;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var52 = field748[--Statics.field1687];
            if (client.field533 == null || var52 >= Statics.field273) {
                field748[++Statics.field1687 - 1] = 0;
            } else {
                field748[++Statics.field1687 - 1] = Statics.field1205[var52].field291;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var53 = field748[--Statics.field1687];
            if (client.field533 == null || var53 >= Statics.field273) {
                field748[++Statics.field1687 - 1] = 0;
            } else {
                field748[++Statics.field1687 - 1] = Statics.field1205[var53].field299;
            }
            return 1;
        } else if (arg0 == 3616) {
            field748[++Statics.field1687 - 1] = Statics.field1806;
            return 1;
        } else if (arg0 == 3617) {
            String var54 = field749[--Statics.field750];
            if (Statics.field1205 != null) {
                client.field349.method2896(194);
                client.field349.method2751(class154.method2202(var54));
                client.field349.method2657(var54);
            }
            return 1;
        } else if (arg0 == 3618) {
            field748[++Statics.field1687 - 1] = Statics.field2943;
            return 1;
        } else if (arg0 == 3619) {
            String var55 = field749[--Statics.field750];
            if (!var55.equals("")) {
                client.field349.method2896(152);
                client.field349.method2751(class154.method2202(var55));
                client.field349.method2657(var55);
            }
            return 1;
        } else if (arg0 == 3620) {
            client.method254();
            return 1;
        } else if (arg0 == 3621) {
            if (client.field574 == 0) {
                field748[++Statics.field1687 - 1] = -1;
            } else {
                field748[++Statics.field1687 - 1] = client.field577;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var56 = field748[--Statics.field1687];
            if (client.field574 == 0 || var56 >= client.field577) {
                field749[++Statics.field750 - 1] = "";
                field749[++Statics.field750 - 1] = "";
            } else {
                field749[++Statics.field750 - 1] = client.field505[var56].field223;
                field749[++Statics.field750 - 1] = client.field505[var56].field218;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var57;
            label446: {
                var57 = field749[--Statics.field750];
                String var59 = "<img=0>";
                if (!var57.startsWith(var59)) {
                    String var61 = "<img=1>";
                    if (!var57.startsWith(var61)) {
                        break label446;
                    }
                }
                var57 = var57.substring(7);
            }
            field748[++Statics.field1687 - 1] = Statics.method207(var57) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var62 = field748[--Statics.field1687];
            if (Statics.field1205 == null || var62 >= Statics.field273 || !Statics.field1205[var62].field296.equalsIgnoreCase(Statics.field792.field263)) {
                field748[++Statics.field1687 - 1] = 0;
            } else {
                field748[++Statics.field1687 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field534 == null) {
                field749[++Statics.field750 - 1] = "";
            } else {
                field749[++Statics.field750 - 1] = class206.method2638(client.field534);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.a(ILay;ZI)I")
    public static int method31(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = client.field582[var3].method44();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = client.field582[var4].field45;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = client.field582[var5].field55;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = client.field582[var6].field48;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = client.field582[var7].field49;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = client.field582[var8].field50;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field748[--Statics.field1687];
            int var10 = client.field582[var9].method56();
            field748[++Statics.field1687 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field748[--Statics.field1687];
            int var12 = client.field582[var11].method56();
            field748[++Statics.field1687 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field748[--Statics.field1687];
            int var14 = client.field582[var13].method56();
            field748[++Statics.field1687 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field748[--Statics.field1687];
            int var16 = client.field582[var15].method56();
            field748[++Statics.field1687 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field748[--Statics.field1687] == 1;
            if (Statics.field1704 != null) {
                Statics.field1704.method15(class2.field21, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field748[--Statics.field1687] == 1;
            if (Statics.field1704 != null) {
                Statics.field1704.method15(class2.field12, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1687 -= 2;
            boolean var19 = field748[Statics.field1687] == 1;
            boolean var20 = field748[Statics.field1687 + 1] == 1;
            if (Statics.field1704 != null) {
                Statics.field1704.method15(new class45(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field748[--Statics.field1687] == 1;
            if (Statics.field1704 != null) {
                Statics.field1704.method15(class2.field11, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field748[--Statics.field1687] == 1;
            if (Statics.field1704 != null) {
                Statics.field1704.method15(class2.field14, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field748[++Statics.field1687 - 1] = Statics.field1704 == null ? 0 : Statics.field1704.field10.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field748[--Statics.field1687];
            class3 var24 = (class3) Statics.field1704.field10.get(var23);
            field748[++Statics.field1687 - 1] = var24.field31;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field748[--Statics.field1687];
            class3 var26 = (class3) Statics.field1704.field10.get(var25);
            field749[++Statics.field750 - 1] = var26.method21();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field748[--Statics.field1687];
            class3 var28 = (class3) Statics.field1704.field10.get(var27);
            field749[++Statics.field750 - 1] = var28.method30();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field748[--Statics.field1687];
            class3 var30 = (class3) Statics.field1704.field10.get(var29);
            long var31 = class156.method12() - Statics.field767 - var30.field26;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field749[++Statics.field750 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field748[--Statics.field1687];
            class3 var38 = (class3) Statics.field1704.field10.get(var37);
            field748[++Statics.field1687 - 1] = var38.field27.field48;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field748[--Statics.field1687];
            class3 var40 = (class3) Statics.field1704.field10.get(var39);
            field748[++Statics.field1687 - 1] = var40.field27.field55;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field748[--Statics.field1687];
            class3 var42 = (class3) Statics.field1704.field10.get(var41);
            field748[++Statics.field1687 - 1] = var42.field27.field45;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.k(ILay;ZI)I")
    public static int method1948(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field749[--Statics.field750];
            int var4 = field748[--Statics.field1687];
            field749[++Statics.field750 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field750 -= 2;
            String var5 = field749[Statics.field750];
            String var6 = field749[Statics.field750 + 1];
            field749[++Statics.field750 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field749[--Statics.field750];
            int var8 = field748[--Statics.field1687];
            field749[++Statics.field750 - 1] = var7 + class208.method3106(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field749[--Statics.field750];
            field749[++Statics.field750 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field748[--Statics.field1687];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field760.setTime(new Date(var11));
            int var13 = field760.get(5);
            int var14 = field760.get(2);
            int var15 = field760.get(1);
            field749[++Statics.field750 - 1] = var13 + "-" + field754[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field750 -= 2;
            String var16 = field749[Statics.field750];
            String var17 = field749[Statics.field750 + 1];
            if (Statics.field792.field284 != null && Statics.field792.field284.field2171) {
                field749[++Statics.field750 - 1] = var17;
            } else {
                field749[++Statics.field750 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field748[--Statics.field1687];
            field749[++Statics.field750 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field750 -= 2;
            int[] var19 = field748;
            int var20 = ++Statics.field1687 - 1;
            String var21 = field749[Statics.field750];
            String var22 = field749[Statics.field750 + 1];
            int var23 = client.field310;
            int var24 = var21.length();
            int var25 = var22.length();
            int var26 = 0;
            int var27 = 0;
            byte var28 = 0;
            byte var29 = 0;
            int var38;
            label244: while (true) {
                if (var26 - var28 >= var24 && var27 - var29 >= var25) {
                    int var30 = Math.min(var24, var25);
                    for (int var31 = 0; var31 < var30; var31++) {
                        char var34 = var21.charAt(var31);
                        char var35 = var22.charAt(var31);
                        if (var34 != var35 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
                            char var36 = Character.toLowerCase(var34);
                            char var37 = Character.toLowerCase(var35);
                            if (var36 != var37) {
                                var38 = Statics.method3333(var36, var23) - Statics.method3333(var37, var23);
                                break label244;
                            }
                        }
                    }
                    int var39 = var24 - var25;
                    if (var39 == 0) {
                        for (int var40 = 0; var40 < var30; var40++) {
                            char var41 = var21.charAt(var40);
                            char var42 = var22.charAt(var40);
                            if (var41 != var42) {
                                var38 = Statics.method3333(var41, var23) - Statics.method3333(var42, var23);
                                break label244;
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
                    var43 = (char) var28;
                    boolean var44 = false;
                }
                char var45;
                if (var29 == 0) {
                    var45 = var22.charAt(var27++);
                } else {
                    var45 = (char) var29;
                    boolean var46 = false;
                }
                byte var47;
                if (var43 == 198) {
                    var47 = 69;
                } else if (var43 == 230) {
                    var47 = 101;
                } else if (var43 == 223) {
                    var47 = 115;
                } else if (var43 == 338) {
                    var47 = 69;
                } else if (var43 == 339) {
                    var47 = 101;
                } else {
                    var47 = 0;
                }
                var28 = var47;
                byte var48;
                if (var45 == 198) {
                    var48 = 69;
                } else if (var45 == 230) {
                    var48 = 101;
                } else if (var45 == 223) {
                    var48 = 115;
                } else if (var45 == 338) {
                    var48 = 69;
                } else if (var45 == 339) {
                    var48 = 101;
                } else {
                    var48 = 0;
                }
                var29 = var48;
                char var49 = class203.method360(var43, var23);
                char var50 = class203.method360(var45, var23);
                if (var49 != var50 && Character.toUpperCase(var49) != Character.toUpperCase(var50)) {
                    char var51 = Character.toLowerCase(var49);
                    char var52 = Character.toLowerCase(var50);
                    if (var51 != var52) {
                        var38 = Statics.method3333(var51, var23) - Statics.method3333(var52, var23);
                        break;
                    }
                }
            }
            var19[var20] = class208.method19(var38);
            return 1;
        } else if (arg0 == 4108) {
            String var53 = field749[--Statics.field750];
            Statics.field1687 -= 2;
            int var54 = field748[Statics.field1687];
            int var55 = field748[Statics.field1687 + 1];
            byte[] var56 = Statics.field1.method3133(var55, 0);
            class209 var57 = new class209(var56);
            field748[++Statics.field1687 - 1] = var57.method3772(var53, var54);
            return 1;
        } else if (arg0 == 4109) {
            String var58 = field749[--Statics.field750];
            Statics.field1687 -= 2;
            int var59 = field748[Statics.field1687];
            int var60 = field748[Statics.field1687 + 1];
            byte[] var61 = Statics.field1.method3133(var60, 0);
            class209 var62 = new class209(var61);
            field748[++Statics.field1687 - 1] = var62.method3702(var58, var59);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field750 -= 2;
            String var63 = field749[Statics.field750];
            String var64 = field749[Statics.field750 + 1];
            if (field748[--Statics.field1687] == 1) {
                field749[++Statics.field750 - 1] = var63;
            } else {
                field749[++Statics.field750 - 1] = var64;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var65 = field749[--Statics.field750];
            field749[++Statics.field750 - 1] = class210.method3761(var65);
            return 1;
        } else if (arg0 == 4112) {
            String var66 = field749[--Statics.field750];
            int var67 = field748[--Statics.field1687];
            field749[++Statics.field750 - 1] = var66 + (char) var67;
            return 1;
        } else if (arg0 == 4113) {
            int var68 = field748[--Statics.field1687];
            int[] var69 = field748;
            int var70 = ++Statics.field1687 - 1;
            char var71 = (char) var68;
            boolean var72;
            if (var71 >= ' ' && var71 <= '~') {
                var72 = true;
            } else if (var71 >= 160 && var71 <= 255) {
                var72 = true;
            } else if (var71 == 8364 || var71 == 338 || var71 == 8212 || var71 == 339 || var71 == 376) {
                var72 = true;
            } else {
                var72 = false;
            }
            var69[var70] = var72 ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var73 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = class208.method1170((char) var73) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var74 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = class208.method928((char) var74) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var75 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = class208.method219((char) var75) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var76 = field749[--Statics.field750];
            if (var76 == null) {
                field748[++Statics.field1687 - 1] = 0;
            } else {
                field748[++Statics.field1687 - 1] = var76.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var77 = field749[--Statics.field750];
            Statics.field1687 -= 2;
            int var78 = field748[Statics.field1687];
            int var79 = field748[Statics.field1687 + 1];
            field749[++Statics.field750 - 1] = var77.substring(var78, var79);
            return 1;
        } else if (arg0 == 4119) {
            String var80 = field749[--Statics.field750];
            StringBuilder var81 = new StringBuilder(var80.length());
            boolean var82 = false;
            for (int var83 = 0; var83 < var80.length(); var83++) {
                char var84 = var80.charAt(var83);
                if (var84 == '<') {
                    var82 = true;
                } else if (var84 == '>') {
                    var82 = false;
                } else if (!var82) {
                    var81.append(var84);
                }
            }
            field749[++Statics.field750 - 1] = var81.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var85 = field749[--Statics.field750];
            int var86 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = var85.indexOf(var86);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field750 -= 2;
            String var87 = field749[Statics.field750];
            String var88 = field749[Statics.field750 + 1];
            int var89 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = var87.indexOf(var88, var89);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("i.l(ILay;ZB)I")
    public static int method95(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field748[++Statics.field1687 - 1] = client.field589;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1687 -= 3;
            client.field589 = field748[Statics.field1687];
            Statics.field2675 = class217.method2128(field748[Statics.field1687 + 1]);
            if (Statics.field2675 == null) {
                Statics.field2675 = class217.field3180;
            }
            client.field525 = field748[Statics.field1687 + 2];
            client.field349.method2896(37);
            client.field349.method2751(client.field589);
            client.field349.method2751(Statics.field2675.field3182);
            client.field349.method2751(client.field525);
            return 1;
        } else if (arg0 == 5002) {
            String var3 = field749[--Statics.field750];
            Statics.field1687 -= 2;
            int var4 = field748[Statics.field1687];
            int var5 = field748[Statics.field1687 + 1];
            client.field349.method2896(90);
            client.field349.method2751(class154.method2202(var3) + 2);
            client.field349.method2657(var3);
            client.field349.method2751(var4 - 1);
            client.field349.method2751(var5);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1687 -= 2;
            int var6 = field748[Statics.field1687];
            int var7 = field748[Statics.field1687 + 1];
            class22 var8 = class48.method3303(var6, var7);
            if (var8 == null) {
                field748[++Statics.field1687 - 1] = -1;
                field748[++Statics.field1687 - 1] = 0;
                field749[++Statics.field750 - 1] = "";
                field749[++Statics.field750 - 1] = "";
                field749[++Statics.field750 - 1] = "";
            } else {
                field748[++Statics.field1687 - 1] = var8.field241;
                field748[++Statics.field1687 - 1] = var8.field239;
                field749[++Statics.field750 - 1] = var8.field247 == null ? "" : var8.field247;
                field749[++Statics.field750 - 1] = var8.field238 == null ? "" : var8.field238;
                field749[++Statics.field750 - 1] = var8.field242 == null ? "" : var8.field242;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var9 = field748[--Statics.field1687];
            class22 var10 = (class22) class48.field952.method2233((long) var9);
            if (var10 == null) {
                field748[++Statics.field1687 - 1] = -1;
                field748[++Statics.field1687 - 1] = 0;
                field749[++Statics.field750 - 1] = "";
                field749[++Statics.field750 - 1] = "";
                field749[++Statics.field750 - 1] = "";
            } else {
                field748[++Statics.field1687 - 1] = var10.field237;
                field748[++Statics.field1687 - 1] = var10.field239;
                field749[++Statics.field750 - 1] = var10.field247 == null ? "" : var10.field247;
                field749[++Statics.field750 - 1] = var10.field238 == null ? "" : var10.field238;
                field749[++Statics.field750 - 1] = var10.field242 == null ? "" : var10.field242;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2675 == null) {
                field748[++Statics.field1687 - 1] = -1;
            } else {
                field748[++Statics.field1687 - 1] = Statics.field2675.field3182;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var12 = field749[--Statics.field750];
            int var13 = field748[--Statics.field1687];
            String var14 = var12.toLowerCase();
            byte var15 = 0;
            if (var14.startsWith(class174.field2535)) {
                var15 = 0;
                var12 = var12.substring(class174.field2535.length());
            } else if (var14.startsWith(class174.field2537)) {
                var15 = 1;
                var12 = var12.substring(class174.field2537.length());
            } else if (var14.startsWith(class174.field2424)) {
                var15 = 2;
                var12 = var12.substring(class174.field2424.length());
            } else if (var14.startsWith(class174.field2541)) {
                var15 = 3;
                var12 = var12.substring(class174.field2541.length());
            } else if (var14.startsWith(class174.field2543)) {
                var15 = 4;
                var12 = var12.substring(class174.field2543.length());
            } else if (var14.startsWith(class174.field2545)) {
                var15 = 5;
                var12 = var12.substring(class174.field2545.length());
            } else if (var14.startsWith(class174.field2547)) {
                var15 = 6;
                var12 = var12.substring(class174.field2547.length());
            } else if (var14.startsWith(class174.field2612)) {
                var15 = 7;
                var12 = var12.substring(class174.field2612.length());
            } else if (var14.startsWith(class174.field2551)) {
                var15 = 8;
                var12 = var12.substring(class174.field2551.length());
            } else if (var14.startsWith(class174.field2553)) {
                var15 = 9;
                var12 = var12.substring(class174.field2553.length());
            } else if (var14.startsWith(class174.field2555)) {
                var15 = 10;
                var12 = var12.substring(class174.field2555.length());
            } else if (var14.startsWith(class174.field2557)) {
                var15 = 11;
                var12 = var12.substring(class174.field2557.length());
            } else if (client.field310 != 0) {
                if (var14.startsWith(class174.field2572)) {
                    var15 = 0;
                    var12 = var12.substring(class174.field2572.length());
                } else if (var14.startsWith(class174.field2538)) {
                    var15 = 1;
                    var12 = var12.substring(class174.field2538.length());
                } else if (var14.startsWith(class174.field2540)) {
                    var15 = 2;
                    var12 = var12.substring(class174.field2540.length());
                } else if (var14.startsWith(class174.field2365)) {
                    var15 = 3;
                    var12 = var12.substring(class174.field2365.length());
                } else if (var14.startsWith(class174.field2373)) {
                    var15 = 4;
                    var12 = var12.substring(class174.field2373.length());
                } else if (var14.startsWith(class174.field2519)) {
                    var15 = 5;
                    var12 = var12.substring(class174.field2519.length());
                } else if (var14.startsWith(class174.field2548)) {
                    var15 = 6;
                    var12 = var12.substring(class174.field2548.length());
                } else if (var14.startsWith(class174.field2550)) {
                    var15 = 7;
                    var12 = var12.substring(class174.field2550.length());
                } else if (var14.startsWith(class174.field2602)) {
                    var15 = 8;
                    var12 = var12.substring(class174.field2602.length());
                } else if (var14.startsWith(class174.field2494)) {
                    var15 = 9;
                    var12 = var12.substring(class174.field2494.length());
                } else if (var14.startsWith(class174.field2556)) {
                    var15 = 10;
                    var12 = var12.substring(class174.field2556.length());
                } else if (var14.startsWith(class174.field2558)) {
                    var15 = 11;
                    var12 = var12.substring(class174.field2558.length());
                }
            }
            String var16 = var12.toLowerCase();
            byte var17 = 0;
            if (var16.startsWith(class174.field2559)) {
                var17 = 1;
                var12 = var12.substring(class174.field2559.length());
            } else if (var16.startsWith(class174.field2447)) {
                var17 = 2;
                var12 = var12.substring(class174.field2447.length());
            } else if (var16.startsWith(class174.field2563)) {
                var17 = 3;
                var12 = var12.substring(class174.field2563.length());
            } else if (var16.startsWith(class174.field2605)) {
                var17 = 4;
                var12 = var12.substring(class174.field2605.length());
            } else if (var16.startsWith(class174.field2517)) {
                var17 = 5;
                var12 = var12.substring(class174.field2517.length());
            } else if (client.field310 != 0) {
                if (var16.startsWith(class174.field2560)) {
                    var17 = 1;
                    var12 = var12.substring(class174.field2560.length());
                } else if (var16.startsWith(class174.field2562)) {
                    var17 = 2;
                    var12 = var12.substring(class174.field2562.length());
                } else if (var16.startsWith(class174.field2361)) {
                    var17 = 3;
                    var12 = var12.substring(class174.field2361.length());
                } else if (var16.startsWith(class174.field2507)) {
                    var17 = 4;
                    var12 = var12.substring(class174.field2507.length());
                } else if (var16.startsWith(class174.field2568)) {
                    var17 = 5;
                    var12 = var12.substring(class174.field2568.length());
                }
            }
            client.field349.method2896(172);
            client.field349.method2751(0);
            int var18 = client.field349.field2091;
            client.field349.method2751(var13);
            client.field349.method2751(var15);
            client.field349.method2751(var17);
            class211.method3190(client.field349, var12);
            client.field349.method2663(client.field349.field2091 - var18);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field750 -= 2;
            String var19 = field749[Statics.field750];
            String var20 = field749[Statics.field750 + 1];
            client.field349.method2896(56);
            client.field349.method2664(0);
            int var21 = client.field349.field2091;
            client.field349.method2657(var19);
            class211.method3190(client.field349, var20);
            client.field349.method2662(client.field349.field2091 - var21);
            return 1;
        } else if (arg0 == 5015) {
            String var22;
            if (Statics.field792 == null || Statics.field792.field263 == null) {
                var22 = "";
            } else {
                var22 = Statics.field792.field263;
            }
            field749[++Statics.field750 - 1] = var22;
            return 1;
        } else if (arg0 == 5016) {
            field748[++Statics.field1687 - 1] = client.field525;
            return 1;
        } else if (arg0 == 5017) {
            int var23 = field748[--Statics.field1687];
            int[] var24 = field748;
            int var25 = ++Statics.field1687 - 1;
            class51 var26 = (class51) class48.field956.get(var23);
            int var27;
            if (var26 == null) {
                var27 = 0;
            } else {
                var27 = var26.method962();
            }
            var24[var25] = var27;
            return 1;
        } else if (arg0 == 5018) {
            int var28 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = class48.method647(var28);
            return 1;
        } else if (arg0 == 5019) {
            int var29 = field748[--Statics.field1687];
            field748[++Statics.field1687 - 1] = class48.method3264(var29);
            return 1;
        } else if (arg0 == 5020) {
            String var30 = field749[--Statics.field750];
            client.method871(var30);
            return 1;
        } else if (arg0 == 5021) {
            client.field526 = field749[--Statics.field750].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field749[++Statics.field750 - 1] = client.field526;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dy.x(ILay;ZI)I")
    public static int method2043(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1687 -= 2;
            client.field386 = (short) field748[Statics.field1687];
            if (client.field386 <= 0) {
                client.field386 = 256;
            }
            client.field561 = (short) field748[Statics.field1687 + 1];
            if (client.field561 <= 0) {
                client.field561 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1687 -= 2;
            client.field562 = (short) field748[Statics.field1687];
            if (client.field562 <= 0) {
                client.field562 = 256;
            }
            client.field563 = (short) field748[Statics.field1687 + 1];
            if (client.field563 <= 0) {
                client.field563 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1687 -= 4;
            client.field379 = (short) field748[Statics.field1687];
            if (client.field379 <= 0) {
                client.field379 = 1;
            }
            client.field483 = (short) field748[Statics.field1687 + 1];
            if (client.field483 <= 0) {
                client.field483 = 32767;
            } else if (client.field483 < client.field379) {
                client.field483 = client.field379;
            }
            client.field566 = (short) field748[Statics.field1687 + 2];
            if (client.field566 <= 0) {
                client.field566 = 1;
            }
            client.field402 = (short) field748[Statics.field1687 + 3];
            if (client.field402 <= 0) {
                client.field402 = 32767;
            } else if (client.field402 < client.field566) {
                client.field402 = client.field566;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field478 == null) {
                field748[++Statics.field1687 - 1] = -1;
                field748[++Statics.field1687 - 1] = -1;
            } else {
                client.method1406(0, 0, client.field478.field2221, client.field478.field2196, false);
                field748[++Statics.field1687 - 1] = client.field570;
                field748[++Statics.field1687 - 1] = client.field571;
            }
            return 1;
        } else if (arg0 == 6204) {
            field748[++Statics.field1687 - 1] = client.field562;
            field748[++Statics.field1687 - 1] = client.field563;
            return 1;
        } else if (arg0 == 6205) {
            field748[++Statics.field1687 - 1] = client.field386;
            field748[++Statics.field1687 - 1] = client.field561;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ff.g(IB)V")
    public static void method2894(int arg0) {
        if (arg0 == -1 || !class170.method693(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2197[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3.field2332 != null) {
                class19 var4 = new class19();
                var4.field199 = var3;
                var4.field210 = var3.field2332;
                method3098(var4, 2000000);
            }
        }
    }
}
