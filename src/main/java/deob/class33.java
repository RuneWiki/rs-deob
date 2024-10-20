package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("az")
public class class33 {

    @ObfuscatedName("az.w")
    public static int[] field752 = new int[5];

    @ObfuscatedName("az.h")
    public static int[][] field751 = new int[5][5000];

    @ObfuscatedName("az.u")
    public static int[] field757 = new int[1000];

    @ObfuscatedName("az.g")
    public static String[] field754 = new String[1000];

    @ObfuscatedName("az.e")
    public static int field756 = 0;

    @ObfuscatedName("az.q")
    public static class12[] field764 = new class12[50];

    @ObfuscatedName("az.s")
    public static Calendar field758 = Calendar.getInstance();

    @ObfuscatedName("az.r")
    public static final String[] field762 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("az.m")
    public static int field760 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.x(Lf;I)V")
    public static void method1870(class19 arg0) {
        method272(arg0, 200000);
    }

    @ObfuscatedName("n.j(Lf;II)V")
    public static void method272(class19 arg0, int arg1) {
        Object[] var2 = arg0.field233;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method2621(var3);
        if (var4 == null) {
            return;
        }
        Statics.field753 = 0;
        Statics.field92 = 0;
        int var5 = -1;
        int[] var6 = var4.field960;
        int[] var7 = var4.field961;
        byte var8 = -1;
        field756 = 0;
        try {
            Statics.field749 = new int[var4.field959];
            int var9 = 0;
            Statics.field3248 = new String[var4.field964];
            int var10 = 0;
            for (int var11 = 1; var11 < var2.length; var11++) {
                if (var2[var11] instanceof Integer) {
                    int var12 = (Integer) var2[var11];
                    if (var12 == -2147483647) {
                        var12 = arg0.field223;
                    }
                    if (var12 == -2147483646) {
                        var12 = arg0.field226;
                    }
                    if (var12 == -2147483645) {
                        var12 = arg0.field224 == null ? -1 : arg0.field224.field2187;
                    }
                    if (var12 == -2147483644) {
                        var12 = arg0.field227;
                    }
                    if (var12 == -2147483643) {
                        var12 = arg0.field224 == null ? -1 : arg0.field224.field2220;
                    }
                    if (var12 == -2147483642) {
                        var12 = arg0.field228 == null ? -1 : arg0.field228.field2187;
                    }
                    if (var12 == -2147483641) {
                        var12 = arg0.field228 == null ? -1 : arg0.field228.field2220;
                    }
                    if (var12 == -2147483640) {
                        var12 = arg0.field231;
                    }
                    if (var12 == -2147483639) {
                        var12 = arg0.field230;
                    }
                    Statics.field749[var9++] = var12;
                } else if (var2[var11] instanceof String) {
                    String var13 = (String) var2[var11];
                    if (var13.equals("event_opbase")) {
                        var13 = arg0.field225;
                    }
                    Statics.field3248[var10++] = var13;
                }
            }
            int var14 = 0;
            field760 = arg0.field232;
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
                                                                                                                label220: while (true) {
                                                                                                                    var14++;
                                                                                                                    if (var14 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var5++;
                                                                                                                    int var52 = var6[var5];
                                                                                                                    if (var52 >= 100) {
                                                                                                                        boolean var46;
                                                                                                                        if (var4.field961[var5] == 1) {
                                                                                                                            var46 = true;
                                                                                                                        } else {
                                                                                                                            var46 = false;
                                                                                                                        }
                                                                                                                        int var47 = method230(var52, var4, var46);
                                                                                                                        switch(var47) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var52 == 0) {
                                                                                                                        field757[++Statics.field753 - 1] = var7[var5];
                                                                                                                    } else if (var52 == 1) {
                                                                                                                        int var15 = var7[var5];
                                                                                                                        field757[++Statics.field753 - 1] = class166.field2154[var15];
                                                                                                                    } else if (var52 == 2) {
                                                                                                                        int var16 = var7[var5];
                                                                                                                        class166.field2154[var16] = field757[--Statics.field753];
                                                                                                                        client.method264(var16);
                                                                                                                    } else if (var52 == 3) {
                                                                                                                        field754[++Statics.field92 - 1] = var4.field962[var5];
                                                                                                                    } else if (var52 == 6) {
                                                                                                                        var5 += var7[var5];
                                                                                                                    } else if (var52 == 7) {
                                                                                                                        Statics.field753 -= 2;
                                                                                                                        if (field757[Statics.field753] != field757[Statics.field753 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 8) {
                                                                                                                        Statics.field753 -= 2;
                                                                                                                        if (field757[Statics.field753] == field757[Statics.field753 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 9) {
                                                                                                                        Statics.field753 -= 2;
                                                                                                                        if (field757[Statics.field753] < field757[Statics.field753 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 10) {
                                                                                                                        Statics.field753 -= 2;
                                                                                                                        if (field757[Statics.field753] > field757[Statics.field753 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 21) {
                                                                                                                        if (field756 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class12 var17 = field764[--field756];
                                                                                                                        var4 = var17.field135;
                                                                                                                        var6 = var4.field960;
                                                                                                                        var7 = var4.field961;
                                                                                                                        var5 = var17.field138;
                                                                                                                        Statics.field749 = var17.field134;
                                                                                                                        Statics.field3248 = var17.field137;
                                                                                                                    } else if (var52 == 25) {
                                                                                                                        int var18 = var7[var5];
                                                                                                                        field757[++Statics.field753 - 1] = class166.method1852(var18);
                                                                                                                    } else if (var52 == 27) {
                                                                                                                        int var19 = var7[var5];
                                                                                                                        int var20 = field757[--Statics.field753];
                                                                                                                        class195 var21 = class195.method2993(var19);
                                                                                                                        int var22 = var21.field2845;
                                                                                                                        int var23 = var21.field2848;
                                                                                                                        int var24 = var21.field2849;
                                                                                                                        int var25 = class166.field2157[var24 - var23];
                                                                                                                        if (var20 < 0 || var20 > var25) {
                                                                                                                            var20 = 0;
                                                                                                                        }
                                                                                                                        int var26 = var25 << var23;
                                                                                                                        class166.field2154[var22] = class166.field2154[var22] & ~var26 | var20 << var23 & var26;
                                                                                                                    } else if (var52 == 31) {
                                                                                                                        Statics.field753 -= 2;
                                                                                                                        if (field757[Statics.field753] <= field757[Statics.field753 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 32) {
                                                                                                                        Statics.field753 -= 2;
                                                                                                                        if (field757[Statics.field753] >= field757[Statics.field753 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 33) {
                                                                                                                        field757[++Statics.field753 - 1] = Statics.field749[var7[var5]];
                                                                                                                    } else if (var52 == 34) {
                                                                                                                        Statics.field749[var7[var5]] = field757[--Statics.field753];
                                                                                                                    } else if (var52 == 35) {
                                                                                                                        field754[++Statics.field92 - 1] = Statics.field3248[var7[var5]];
                                                                                                                    } else if (var52 == 36) {
                                                                                                                        Statics.field3248[var7[var5]] = field754[--Statics.field92];
                                                                                                                    } else if (var52 == 37) {
                                                                                                                        int var27 = var7[var5];
                                                                                                                        Statics.field92 -= var27;
                                                                                                                        String var28 = class208.method218(field754, Statics.field92, var27);
                                                                                                                        field754[++Statics.field92 - 1] = var28;
                                                                                                                    } else if (var52 == 38) {
                                                                                                                        Statics.field753--;
                                                                                                                    } else if (var52 == 39) {
                                                                                                                        Statics.field92--;
                                                                                                                    } else if (var52 == 40) {
                                                                                                                        int var29 = var7[var5];
                                                                                                                        class49 var30 = class49.method2621(var29);
                                                                                                                        int[] var31 = new int[var30.field959];
                                                                                                                        String[] var32 = new String[var30.field964];
                                                                                                                        for (int var33 = 0; var33 < var30.field967; var33++) {
                                                                                                                            var31[var33] = field757[Statics.field753 - var30.field967 + var33];
                                                                                                                        }
                                                                                                                        for (int var34 = 0; var34 < var30.field966; var34++) {
                                                                                                                            var32[var34] = field754[Statics.field92 - var30.field966 + var34];
                                                                                                                        }
                                                                                                                        Statics.field753 -= var30.field967;
                                                                                                                        Statics.field92 -= var30.field966;
                                                                                                                        class12 var35 = new class12();
                                                                                                                        var35.field135 = var4;
                                                                                                                        var35.field138 = var5;
                                                                                                                        var35.field134 = Statics.field749;
                                                                                                                        var35.field137 = Statics.field3248;
                                                                                                                        field764[++field756 - 1] = var35;
                                                                                                                        var4 = var30;
                                                                                                                        var6 = var30.field960;
                                                                                                                        var7 = var30.field961;
                                                                                                                        var5 = -1;
                                                                                                                        Statics.field749 = var31;
                                                                                                                        Statics.field3248 = var32;
                                                                                                                    } else if (var52 == 42) {
                                                                                                                        field757[++Statics.field753 - 1] = Statics.field73.method894(var7[var5]);
                                                                                                                    } else if (var52 == 43) {
                                                                                                                        Statics.field73.method893(var7[var5], field757[--Statics.field753]);
                                                                                                                    } else if (var52 == 44) {
                                                                                                                        int var36 = var7[var5] >> 16;
                                                                                                                        int var37 = var7[var5] & 0xFFFF;
                                                                                                                        int var38 = field757[--Statics.field753];
                                                                                                                        if (var38 >= 0 && var38 <= 5000) {
                                                                                                                            field752[var36] = var38;
                                                                                                                            byte var39 = -1;
                                                                                                                            if (var37 == 105) {
                                                                                                                                var39 = 0;
                                                                                                                            }
                                                                                                                            int var40 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var40 >= var38) {
                                                                                                                                    continue label220;
                                                                                                                                }
                                                                                                                                field751[var36][var40] = var39;
                                                                                                                                var40++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var52 == 45) {
                                                                                                                        int var41 = var7[var5];
                                                                                                                        int var42 = field757[--Statics.field753];
                                                                                                                        if (var42 < 0 || var42 >= field752[var41]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field757[++Statics.field753 - 1] = field751[var41][var42];
                                                                                                                    } else if (var52 == 46) {
                                                                                                                        int var43 = var7[var5];
                                                                                                                        Statics.field753 -= 2;
                                                                                                                        int var44 = field757[Statics.field753];
                                                                                                                        if (var44 < 0 || var44 >= field752[var43]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field751[var43][var44] = field757[Statics.field753 + 1];
                                                                                                                    } else if (var52 == 47) {
                                                                                                                        String var45 = Statics.field73.method896(var7[var5]);
                                                                                                                        if (var45 == null) {
                                                                                                                            var45 = "null";
                                                                                                                        }
                                                                                                                        field754[++Statics.field92 - 1] = var45;
                                                                                                                    } else if (var52 == 48) {
                                                                                                                        Statics.field73.method895(var7[var5], field754[--Statics.field92]);
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
        } catch (Exception var51) {
            StringBuilder var49 = new StringBuilder(30);
            var49.append("").append(var4.field1885).append(" ");
            for (int var50 = field756 - 1; var50 >= 0; var50--) {
                var49.append("").append(field764[var50].field135.field1885).append(" ");
            }
            var49.append("").append(var8);
            class102.method702(var49.toString(), var51);
        }
    }

    @ObfuscatedName("z.c(ILag;ZI)I")
    public static int method230(int arg0, class49 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2851(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method194(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method30(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method107(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method598(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method207(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method241(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method262(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method803(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            class170 var3 = arg2 ? Statics.field625 : Statics.field755;
            byte var8;
            if (arg0 == 1800) {
                int[] var4 = field757;
                int var5 = ++Statics.field753 - 1;
                int var6 = client.method3069(var3);
                int var7 = var6 >> 11 & 0x3F;
                var4[var5] = var7;
                var8 = 1;
            } else if (arg0 == 1801) {
                int var9 = field757[--Statics.field753];
                int var151 = var9 - 1;
                if (var3.field2267 == null || var151 >= var3.field2267.length || var3.field2267[var151] == null) {
                    field754[++Statics.field92 - 1] = "";
                } else {
                    field754[++Statics.field92 - 1] = var3.field2267[var151];
                }
                var8 = 1;
            } else if (arg0 == 1802) {
                if (var3.field2248 == null) {
                    field754[++Statics.field92 - 1] = "";
                } else {
                    field754[++Statics.field92 - 1] = var3.field2248;
                }
                var8 = 1;
            } else {
                var8 = 2;
            }
            return var8;
        } else if (arg0 < 2000) {
            return method116(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method194(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method30(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method107(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method598(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method207(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            class170 var10 = class170.method669(field757[--Statics.field753]);
            byte var11;
            if (arg0 == 2500) {
                field757[++Statics.field753 - 1] = var10.field2253;
                var11 = 1;
            } else if (arg0 == 2501) {
                field757[++Statics.field753 - 1] = var10.field2201;
                var11 = 1;
            } else if (arg0 == 2502) {
                field757[++Statics.field753 - 1] = var10.field2202;
                var11 = 1;
            } else if (arg0 == 2503) {
                field757[++Statics.field753 - 1] = var10.field2302;
                var11 = 1;
            } else if (arg0 == 2504) {
                field757[++Statics.field753 - 1] = var10.field2207 ? 1 : 0;
                var11 = 1;
            } else if (arg0 == 2505) {
                field757[++Statics.field753 - 1] = var10.field2255;
                var11 = 1;
            } else {
                var11 = 2;
            }
            return var11;
        } else if (arg0 < 2700) {
            return method105(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            byte var13;
            if (arg0 == 2700) {
                class170 var12 = class170.method669(field757[--Statics.field753]);
                field757[++Statics.field753 - 1] = var12.field2307;
                var13 = 1;
            } else if (arg0 == 2701) {
                class170 var14 = class170.method669(field757[--Statics.field753]);
                if (var14.field2307 == -1) {
                    field757[++Statics.field753 - 1] = 0;
                } else {
                    field757[++Statics.field753 - 1] = var14.field2308;
                }
                var13 = 1;
            } else if (arg0 == 2702) {
                int var15 = field757[--Statics.field753];
                class18 var16 = (class18) client.field346.method2247((long) var15);
                if (var16 == null) {
                    field757[++Statics.field753 - 1] = 0;
                } else {
                    field757[++Statics.field753 - 1] = 1;
                }
                var13 = 1;
            } else if (arg0 == 2706) {
                field757[++Statics.field753 - 1] = client.field474;
                var13 = 1;
            } else {
                var13 = 2;
            }
            return var13;
        } else if (arg0 < 2900) {
            class170 var17 = class170.method669(field757[--Statics.field753]);
            byte var22;
            if (arg0 == 2800) {
                int[] var18 = field757;
                int var19 = ++Statics.field753 - 1;
                int var20 = client.method3069(var17);
                int var21 = var20 >> 11 & 0x3F;
                var18[var19] = var21;
                var22 = 1;
            } else if (arg0 == 2801) {
                int var23 = field757[--Statics.field753];
                int var152 = var23 - 1;
                if (var17.field2267 == null || var152 >= var17.field2267.length || var17.field2267[var152] == null) {
                    field754[++Statics.field92 - 1] = "";
                } else {
                    field754[++Statics.field92 - 1] = var17.field2267[var152];
                }
                var22 = 1;
            } else if (arg0 == 2802) {
                if (var17.field2248 == null) {
                    field754[++Statics.field92 - 1] = "";
                } else {
                    field754[++Statics.field92 - 1] = var17.field2248;
                }
                var22 = 1;
            } else {
                var22 = 2;
            }
            return var22;
        } else if (arg0 < 3000) {
            return method116(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            byte var25;
            if (arg0 == 3100) {
                String var24 = field754[--Statics.field92];
                class48.method685(0, "", var24);
                var25 = 1;
            } else if (arg0 == 3101) {
                Statics.field753 -= 2;
                client.method1872(Statics.field266, field757[Statics.field753], field757[Statics.field753 + 1]);
                var25 = 1;
            } else if (arg0 == 3103) {
                client.method1987();
                var25 = 1;
            } else if (arg0 == 3104) {
                String var26 = field754[--Statics.field92];
                int var27 = 0;
                if (class208.method2754(var26)) {
                    var27 = class208.method3386(var26);
                }
                client.field310.method2874(189);
                client.field310.method2627(var27);
                var25 = 1;
            } else if (arg0 == 3105) {
                String var28 = field754[--Statics.field92];
                client.field310.method2874(37);
                client.field310.method2651(var28.length() + 1);
                client.field310.method2630(var28);
                var25 = 1;
            } else if (arg0 == 3106) {
                String var29 = field754[--Statics.field92];
                client.field310.method2874(128);
                client.field310.method2651(var29.length() + 1);
                client.field310.method2630(var29);
                var25 = 1;
            } else if (arg0 == 3107) {
                int var30 = field757[--Statics.field753];
                String var31 = field754[--Statics.field92];
                client.method175(var30, var31);
                var25 = 1;
            } else if (arg0 == 3108) {
                Statics.field753 -= 3;
                int var32 = field757[Statics.field753];
                int var33 = field757[Statics.field753 + 1];
                int var34 = field757[Statics.field753 + 2];
                class170 var35 = class170.method669(var34);
                client.method96(var35, var32, var33);
                var25 = 1;
            } else if (arg0 == 3109) {
                Statics.field753 -= 2;
                int var36 = field757[Statics.field753];
                int var37 = field757[Statics.field753 + 1];
                class170 var38 = arg2 ? Statics.field625 : Statics.field755;
                client.method96(var38, var36, var37);
                var25 = 1;
            } else if (arg0 == 3110) {
                Statics.field3077 = field757[--Statics.field753] == 1;
                var25 = 1;
            } else if (arg0 == 3111) {
                field757[++Statics.field753 - 1] = Statics.field85.field718 ? 1 : 0;
                var25 = 1;
            } else if (arg0 == 3112) {
                Statics.field85.field718 = field757[--Statics.field753] == 1;
                class31.method11();
                var25 = 1;
            } else if (arg0 == 3113) {
                String var39 = field754[--Statics.field92];
                boolean var40 = field757[--Statics.field753] == 1;
                class115.method2013(var39, var40, false);
                var25 = 1;
            } else if (arg0 == 3115) {
                int var41 = field757[--Statics.field753];
                client.field310.method2874(92);
                client.field310.method2625(var41);
                var25 = 1;
            } else if (arg0 == 3116) {
                int var42 = field757[--Statics.field753];
                Statics.field92 -= 2;
                String var43 = field754[Statics.field92];
                String var44 = field754[Statics.field92 + 1];
                if (var43.length() > 500) {
                    var25 = 1;
                } else if (var44.length() > 500) {
                    var25 = 1;
                } else {
                    client.field310.method2874(136);
                    client.field310.method2625(1 + class154.method2955(var43) + class154.method2955(var44));
                    client.field310.method2630(var44);
                    client.field310.method2663(var42);
                    client.field310.method2630(var43);
                    var25 = 1;
                }
            } else if (arg0 == 3117) {
                client.field562 = field757[--Statics.field753] == 1;
                var25 = 1;
            } else {
                var25 = 2;
            }
            return var25;
        } else if (arg0 < 3300) {
            return Statics.method10(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method796(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            byte var53;
            if (arg0 == 3400) {
                Statics.field753 -= 2;
                int var45 = field757[Statics.field753];
                int var46 = field757[Statics.field753 + 1];
                class196 var47 = (class196) class196.field2850.method2221((long) var45);
                class196 var48;
                if (var47 == null) {
                    byte[] var49 = Statics.field2851.method3121(8, var45);
                    class196 var50 = new class196();
                    if (var49 != null) {
                        var50.method3367(new class154(var49));
                    }
                    class196.field2850.method2223(var50, (long) var45);
                    var48 = var50;
                } else {
                    var48 = var47;
                }
                class196 var51 = var48;
                if (var48.field2853 != 's') {
                }
                for (int var52 = 0; var52 < var51.field2862; var52++) {
                    if (var51.field2857[var52] == var46) {
                        field754[++Statics.field92 - 1] = var51.field2859[var52];
                        var51 = null;
                        break;
                    }
                }
                if (var51 != null) {
                    field754[++Statics.field92 - 1] = var51.field2854;
                }
                var53 = 1;
            } else if (arg0 == 3408) {
                Statics.field753 -= 4;
                int var54 = field757[Statics.field753];
                int var55 = field757[Statics.field753 + 1];
                int var56 = field757[Statics.field753 + 2];
                int var57 = field757[Statics.field753 + 3];
                class196 var58 = (class196) class196.field2850.method2221((long) var56);
                class196 var59;
                if (var58 == null) {
                    byte[] var60 = Statics.field2851.method3121(8, var56);
                    class196 var61 = new class196();
                    if (var60 != null) {
                        var61.method3367(new class154(var60));
                    }
                    class196.field2850.method2223(var61, (long) var56);
                    var59 = var61;
                } else {
                    var59 = var58;
                }
                class196 var62 = var59;
                if (var59.field2852 == var54 && var59.field2853 == var55) {
                    for (int var63 = 0; var63 < var62.field2862; var63++) {
                        if (var62.field2857[var63] == var57) {
                            if (var55 == 115) {
                                field754[++Statics.field92 - 1] = var62.field2859[var63];
                            } else {
                                field757[++Statics.field753 - 1] = var62.field2858[var63];
                            }
                            var62 = null;
                            break;
                        }
                    }
                    if (var62 != null) {
                        if (var55 == 115) {
                            field754[++Statics.field92 - 1] = var62.field2854;
                        } else {
                            field757[++Statics.field753 - 1] = var62.field2855;
                        }
                    }
                    var53 = 1;
                } else {
                    if (var55 == 115) {
                        field754[++Statics.field92 - 1] = "null";
                    } else {
                        field757[++Statics.field753 - 1] = 0;
                    }
                    var53 = 1;
                }
            } else {
                var53 = 2;
            }
            return var53;
        } else if (arg0 < 3700) {
            return method2609(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method805(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method203(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method2917(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            byte var65;
            if (arg0 == 4200) {
                int var64 = field757[--Statics.field753];
                field754[++Statics.field92 - 1] = class199.method2849(var64).field2958;
                var65 = 1;
            } else if (arg0 == 4201) {
                Statics.field753 -= 2;
                int var66 = field757[Statics.field753];
                int var67 = field757[Statics.field753 + 1];
                class199 var68 = class199.method2849(var66);
                if (var67 < 1 || var67 > 5 || var68.field2982[var67 - 1] == null) {
                    field754[++Statics.field92 - 1] = "";
                } else {
                    field754[++Statics.field92 - 1] = var68.field2982[var67 - 1];
                }
                var65 = 1;
            } else if (arg0 == 4202) {
                Statics.field753 -= 2;
                int var69 = field757[Statics.field753];
                int var70 = field757[Statics.field753 + 1];
                class199 var71 = class199.method2849(var69);
                if (var70 < 1 || var70 > 5 || var71.field2973[var70 - 1] == null) {
                    field754[++Statics.field92 - 1] = "";
                } else {
                    field754[++Statics.field92 - 1] = var71.field2973[var70 - 1];
                }
                var65 = 1;
            } else if (arg0 == 4203) {
                int var72 = field757[--Statics.field753];
                field757[++Statics.field753 - 1] = class199.method2849(var72).field2993;
                var65 = 1;
            } else if (arg0 == 4204) {
                int var73 = field757[--Statics.field753];
                field757[++Statics.field753 - 1] = class199.method2849(var73).field2969 == 1 ? 1 : 0;
                var65 = 1;
            } else if (arg0 == 4205) {
                int var74 = field757[--Statics.field753];
                class199 var75 = class199.method2849(var74);
                if (var75.field2990 == -1 && var75.field2950 >= 0) {
                    field757[++Statics.field753 - 1] = var75.field2950;
                } else {
                    field757[++Statics.field753 - 1] = var74;
                }
                var65 = 1;
            } else if (arg0 == 4206) {
                int var76 = field757[--Statics.field753];
                class199 var77 = class199.method2849(var76);
                if (var77.field2990 >= 0 && var77.field2950 >= 0) {
                    field757[++Statics.field753 - 1] = var77.field2950;
                } else {
                    field757[++Statics.field753 - 1] = var76;
                }
                var65 = 1;
            } else if (arg0 == 4207) {
                int var78 = field757[--Statics.field753];
                field757[++Statics.field753 - 1] = class199.method2849(var78).field2971 ? 1 : 0;
                var65 = 1;
            } else if (arg0 == 4208) {
                int var79 = field757[--Statics.field753];
                class199 var80 = class199.method2849(var79);
                if (var80.field3001 == -1 && var80.field2974 >= 0) {
                    field757[++Statics.field753 - 1] = var80.field2974;
                } else {
                    field757[++Statics.field753 - 1] = var79;
                }
                var65 = 1;
            } else if (arg0 == 4209) {
                int var81 = field757[--Statics.field753];
                class199 var82 = class199.method2849(var81);
                if (var82.field3001 >= 0 && var82.field2974 >= 0) {
                    field757[++Statics.field753 - 1] = var82.field2974;
                } else {
                    field757[++Statics.field753 - 1] = var81;
                }
                var65 = 1;
            } else if (arg0 == 4210) {
                String var83 = field754[--Statics.field92];
                int var84 = field757[--Statics.field753];
                boolean var86 = var84 == 1;
                String var87 = var83.toLowerCase();
                short[] var88 = new short[16];
                int var89 = 0;
                int var90 = 0;
                while (true) {
                    if (var90 >= Statics.field1738) {
                        Statics.field845 = var88;
                        Statics.field806 = 0;
                        Statics.field127 = var89;
                        String[] var94 = new String[Statics.field127];
                        for (int var95 = 0; var95 < Statics.field127; var95++) {
                            var94[var95] = class199.method2849(var88[var95]).field2958;
                        }
                        short[] var96 = Statics.field845;
                        class151.method1435(var94, var96, 0, var94.length - 1);
                        break;
                    }
                    class199 var91 = class199.method2849(var90);
                    if ((!var86 || var91.field2997) && var91.field2990 == -1 && var91.field2958.toLowerCase().indexOf(var87) != -1) {
                        if (var89 >= 250) {
                            Statics.field127 = -1;
                            Statics.field845 = null;
                            break;
                        }
                        if (var89 >= var88.length) {
                            short[] var92 = new short[var88.length * 2];
                            for (int var93 = 0; var93 < var89; var93++) {
                                var92[var93] = var88[var93];
                            }
                            var88 = var92;
                        }
                        var88[var89++] = (short) var90;
                    }
                    var90++;
                }
                field757[++Statics.field753 - 1] = Statics.field127;
                var65 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field845 == null || Statics.field806 >= Statics.field127) {
                    field757[++Statics.field753 - 1] = -1;
                } else {
                    field757[++Statics.field753 - 1] = Statics.field845[++Statics.field806 - 1] & 0xFFFF;
                }
                var65 = 1;
            } else if (arg0 == 4212) {
                Statics.field806 = 0;
                var65 = 1;
            } else {
                var65 = 2;
            }
            return var65;
        } else if (arg0 < 5100) {
            byte var97;
            if (arg0 == 5000) {
                field757[++Statics.field753 - 1] = client.field308;
                var97 = 1;
            } else if (arg0 == 5001) {
                Statics.field753 -= 3;
                client.field308 = field757[Statics.field753];
                Statics.field1741 = Statics.method201(field757[Statics.field753 + 1]);
                if (Statics.field1741 == null) {
                    Statics.field1741 = class217.field3179;
                }
                client.field533 = field757[Statics.field753 + 2];
                client.field310.method2874(2);
                client.field310.method2651(client.field308);
                client.field310.method2651(Statics.field1741.field3181);
                client.field310.method2651(client.field533);
                var97 = 1;
            } else if (arg0 == 5002) {
                String var98 = field754[--Statics.field92];
                Statics.field753 -= 2;
                int var99 = field757[Statics.field753];
                int var100 = field757[Statics.field753 + 1];
                client.field310.method2874(195);
                client.field310.method2651(class154.method2955(var98) + 2);
                client.field310.method2630(var98);
                client.field310.method2651(var99 - 1);
                client.field310.method2651(var100);
                var97 = 1;
            } else if (arg0 == 5003) {
                Statics.field753 -= 2;
                int var101 = field757[Statics.field753];
                int var102 = field757[Statics.field753 + 1];
                class22 var103 = class48.method3761(var101, var102);
                if (var103 == null) {
                    field757[++Statics.field753 - 1] = -1;
                    field757[++Statics.field753 - 1] = 0;
                    field754[++Statics.field92 - 1] = "";
                    field754[++Statics.field92 - 1] = "";
                    field754[++Statics.field92 - 1] = "";
                } else {
                    field757[++Statics.field753 - 1] = var103.field257;
                    field757[++Statics.field753 - 1] = var103.field256;
                    field754[++Statics.field92 - 1] = var103.field258 == null ? "" : var103.field258;
                    field754[++Statics.field92 - 1] = var103.field260 == null ? "" : var103.field260;
                    field754[++Statics.field92 - 1] = var103.field259 == null ? "" : var103.field259;
                }
                var97 = 1;
            } else if (arg0 == 5004) {
                int var104 = field757[--Statics.field753];
                class22 var105 = class48.method1938(var104);
                if (var105 == null) {
                    field757[++Statics.field753 - 1] = -1;
                    field757[++Statics.field753 - 1] = 0;
                    field754[++Statics.field92 - 1] = "";
                    field754[++Statics.field92 - 1] = "";
                    field754[++Statics.field92 - 1] = "";
                } else {
                    field757[++Statics.field753 - 1] = var105.field265;
                    field757[++Statics.field753 - 1] = var105.field256;
                    field754[++Statics.field92 - 1] = var105.field258 == null ? "" : var105.field258;
                    field754[++Statics.field92 - 1] = var105.field260 == null ? "" : var105.field260;
                    field754[++Statics.field92 - 1] = var105.field259 == null ? "" : var105.field259;
                }
                var97 = 1;
            } else if (arg0 == 5005) {
                if (Statics.field1741 == null) {
                    field757[++Statics.field753 - 1] = -1;
                } else {
                    field757[++Statics.field753 - 1] = Statics.field1741.field3181;
                }
                var97 = 1;
            } else if (arg0 == 5008) {
                String var106 = field754[--Statics.field92];
                int var107 = field757[--Statics.field753];
                String var108 = var106.toLowerCase();
                byte var109 = 0;
                if (var108.startsWith(class174.field2518)) {
                    var109 = 0;
                    var106 = var106.substring(class174.field2518.length());
                } else if (var108.startsWith(class174.field2520)) {
                    var109 = 1;
                    var106 = var106.substring(class174.field2520.length());
                } else if (var108.startsWith(class174.field2522)) {
                    var109 = 2;
                    var106 = var106.substring(class174.field2522.length());
                } else if (var108.startsWith(class174.field2477)) {
                    var109 = 3;
                    var106 = var106.substring(class174.field2477.length());
                } else if (var108.startsWith(class174.field2526)) {
                    var109 = 4;
                    var106 = var106.substring(class174.field2526.length());
                } else if (var108.startsWith(class174.field2389)) {
                    var109 = 5;
                    var106 = var106.substring(class174.field2389.length());
                } else if (var108.startsWith(class174.field2530)) {
                    var109 = 6;
                    var106 = var106.substring(class174.field2530.length());
                } else if (var108.startsWith(class174.field2600)) {
                    var109 = 7;
                    var106 = var106.substring(class174.field2600.length());
                } else if (var108.startsWith(class174.field2545)) {
                    var109 = 8;
                    var106 = var106.substring(class174.field2545.length());
                } else if (var108.startsWith(class174.field2544)) {
                    var109 = 9;
                    var106 = var106.substring(class174.field2544.length());
                } else if (var108.startsWith(class174.field2479)) {
                    var109 = 10;
                    var106 = var106.substring(class174.field2479.length());
                } else if (var108.startsWith(class174.field2540)) {
                    var109 = 11;
                    var106 = var106.substring(class174.field2540.length());
                } else if (client.field410 != 0) {
                    if (var108.startsWith(class174.field2519)) {
                        var109 = 0;
                        var106 = var106.substring(class174.field2519.length());
                    } else if (var108.startsWith(class174.field2521)) {
                        var109 = 1;
                        var106 = var106.substring(class174.field2521.length());
                    } else if (var108.startsWith(class174.field2511)) {
                        var109 = 2;
                        var106 = var106.substring(class174.field2511.length());
                    } else if (var108.startsWith(class174.field2473)) {
                        var109 = 3;
                        var106 = var106.substring(class174.field2473.length());
                    } else if (var108.startsWith(class174.field2527)) {
                        var109 = 4;
                        var106 = var106.substring(class174.field2527.length());
                    } else if (var108.startsWith(class174.field2386)) {
                        var109 = 5;
                        var106 = var106.substring(class174.field2386.length());
                    } else if (var108.startsWith(class174.field2370)) {
                        var109 = 6;
                        var106 = var106.substring(class174.field2370.length());
                    } else if (var108.startsWith(class174.field2510)) {
                        var109 = 7;
                        var106 = var106.substring(class174.field2510.length());
                    } else if (var108.startsWith(class174.field2535)) {
                        var109 = 8;
                        var106 = var106.substring(class174.field2535.length());
                    } else if (var108.startsWith(class174.field2592)) {
                        var109 = 9;
                        var106 = var106.substring(class174.field2592.length());
                    } else if (var108.startsWith(class174.field2539)) {
                        var109 = 10;
                        var106 = var106.substring(class174.field2539.length());
                    } else if (var108.startsWith(class174.field2541)) {
                        var109 = 11;
                        var106 = var106.substring(class174.field2541.length());
                    }
                }
                String var110 = var106.toLowerCase();
                byte var111 = 0;
                if (var110.startsWith(class174.field2542)) {
                    var111 = 1;
                    var106 = var106.substring(class174.field2542.length());
                } else if (var110.startsWith(class174.field2459)) {
                    var111 = 2;
                    var106 = var106.substring(class174.field2459.length());
                } else if (var110.startsWith(class174.field2546)) {
                    var111 = 3;
                    var106 = var106.substring(class174.field2546.length());
                } else if (var110.startsWith(class174.field2573)) {
                    var111 = 4;
                    var106 = var106.substring(class174.field2573.length());
                } else if (var110.startsWith(class174.field2550)) {
                    var111 = 5;
                    var106 = var106.substring(class174.field2550.length());
                } else if (client.field410 != 0) {
                    if (var110.startsWith(class174.field2543)) {
                        var111 = 1;
                        var106 = var106.substring(class174.field2543.length());
                    } else if (var110.startsWith(class174.field2403)) {
                        var111 = 2;
                        var106 = var106.substring(class174.field2403.length());
                    } else if (var110.startsWith(class174.field2547)) {
                        var111 = 3;
                        var106 = var106.substring(class174.field2547.length());
                    } else if (var110.startsWith(class174.field2549)) {
                        var111 = 4;
                        var106 = var106.substring(class174.field2549.length());
                    } else if (var110.startsWith(class174.field2551)) {
                        var111 = 5;
                        var106 = var106.substring(class174.field2551.length());
                    }
                }
                client.field310.method2874(79);
                client.field310.method2651(0);
                int var112 = client.field310.field2086;
                client.field310.method2651(var107);
                client.field310.method2651(var109);
                client.field310.method2651(var111);
                class160 var113 = client.field310;
                int var114 = var113.field2086;
                byte[] var115 = Statics.method242(var106);
                var113.method2637(var115.length);
                var113.field2086 += Statics.field3131.method2567(var115, 0, var115.length, var113.field2091, var113.field2086);
                client.field310.method2636(client.field310.field2086 - var112);
                var97 = 1;
            } else if (arg0 == 5009) {
                Statics.field92 -= 2;
                String var116 = field754[Statics.field92];
                String var117 = field754[Statics.field92 + 1];
                client.field310.method2874(169);
                client.field310.method2625(0);
                int var118 = client.field310.field2086;
                client.field310.method2630(var116);
                class160 var119 = client.field310;
                int var120 = var119.field2086;
                byte[] var121 = Statics.method242(var117);
                var119.method2637(var121.length);
                var119.field2086 += Statics.field3131.method2567(var121, 0, var121.length, var119.field2091, var119.field2086);
                client.field310.method2753(client.field310.field2086 - var118);
                var97 = 1;
            } else if (arg0 == 5015) {
                String var122;
                if (Statics.field266 == null || Statics.field266.field283 == null) {
                    var122 = "";
                } else {
                    var122 = Statics.field266.field283;
                }
                field754[++Statics.field92 - 1] = var122;
                var97 = 1;
            } else if (arg0 == 5016) {
                field757[++Statics.field753 - 1] = client.field533;
                var97 = 1;
            } else if (arg0 == 5017) {
                int var123 = field757[--Statics.field753];
                field757[++Statics.field753 - 1] = class48.method109(var123);
                var97 = 1;
            } else if (arg0 == 5018) {
                int var124 = field757[--Statics.field753];
                int[] var125 = field757;
                int var126 = ++Statics.field753 - 1;
                class22 var127 = (class22) class48.field952.method2203((long) var124);
                int var128;
                if (var127 == null) {
                    var128 = -1;
                } else if (class48.field953.field1903 == var127.field1888) {
                    var128 = -1;
                } else {
                    var128 = ((class22) var127.field1888).field257;
                }
                var125[var126] = var128;
                var97 = 1;
            } else if (arg0 == 5019) {
                int var129 = field757[--Statics.field753];
                int[] var130 = field757;
                int var131 = ++Statics.field753 - 1;
                class22 var132 = (class22) class48.field952.method2203((long) var129);
                int var133;
                if (var132 == null) {
                    var133 = -1;
                } else if (class48.field953.field1903 == var132.field1889) {
                    var133 = -1;
                } else {
                    var133 = ((class22) var132.field1889).field257;
                }
                var130[var131] = var133;
                var97 = 1;
            } else if (arg0 == 5020) {
                String var134 = field754[--Statics.field92];
                client.method2015(var134);
                var97 = 1;
            } else if (arg0 == 5021) {
                client.field534 = field754[--Statics.field92].toLowerCase().trim();
                var97 = 1;
            } else if (arg0 == 5022) {
                field754[++Statics.field92 - 1] = client.field534;
                var97 = 1;
            } else {
                var97 = 2;
            }
            return var97;
        } else if (arg0 < 5400) {
            byte var135;
            if (arg0 == 5306) {
                field757[++Statics.field753 - 1] = client.method197();
                var135 = 1;
            } else if (arg0 == 5307) {
                int var136 = field757[--Statics.field753];
                if (var136 == 1 || var136 == 2) {
                    client.field343 = 0L;
                    if (var136 >= 2) {
                        client.field528 = true;
                    } else {
                        client.field528 = false;
                    }
                    client.method236();
                    if (client.field318 >= 25) {
                        client.method887();
                    }
                    class114.field1788 = true;
                }
                var135 = 1;
            } else if (arg0 == 5308) {
                field757[++Statics.field753 - 1] = Statics.field85.field716;
                var135 = 1;
            } else if (arg0 == 5309) {
                int var137 = field757[--Statics.field753];
                if (var137 == 1 || var137 == 2) {
                    Statics.field85.field716 = var137;
                    class31.method11();
                }
                var135 = 1;
            } else {
                var135 = 2;
            }
            return var135;
        } else if (arg0 < 5600) {
            return method1434(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            byte var138;
            if (arg0 == 5630) {
                client.field366 = 250;
                var138 = 1;
            } else {
                var138 = 2;
            }
            return var138;
        } else if (arg0 < 6300) {
            return method3076(arg0, arg1, arg2);
        } else if (arg0 >= 6600) {
            return 2;
        } else {
            byte var139;
            if (arg0 == 6500) {
                field757[++Statics.field753 - 1] = class30.method1988() ? 1 : 0;
                var139 = 1;
            } else if (arg0 == 6501) {
                class30 var140 = class30.method2996();
                if (var140 == null) {
                    field757[++Statics.field753 - 1] = -1;
                    field757[++Statics.field753 - 1] = 0;
                    field754[++Statics.field92 - 1] = "";
                    field757[++Statics.field753 - 1] = 0;
                    field757[++Statics.field753 - 1] = 0;
                    field754[++Statics.field92 - 1] = "";
                } else {
                    field757[++Statics.field753 - 1] = var140.field703;
                    field757[++Statics.field753 - 1] = var140.field700;
                    field754[++Statics.field92 - 1] = var140.field707;
                    field757[++Statics.field753 - 1] = var140.field708;
                    field757[++Statics.field753 - 1] = var140.field705;
                    field754[++Statics.field92 - 1] = var140.field706;
                }
                var139 = 1;
            } else if (arg0 == 6502) {
                class30 var141 = class30.method2164();
                if (var141 == null) {
                    field757[++Statics.field753 - 1] = -1;
                    field757[++Statics.field753 - 1] = 0;
                    field754[++Statics.field92 - 1] = "";
                    field757[++Statics.field753 - 1] = 0;
                    field757[++Statics.field753 - 1] = 0;
                    field754[++Statics.field92 - 1] = "";
                } else {
                    field757[++Statics.field753 - 1] = var141.field703;
                    field757[++Statics.field753 - 1] = var141.field700;
                    field754[++Statics.field92 - 1] = var141.field707;
                    field757[++Statics.field753 - 1] = var141.field708;
                    field757[++Statics.field753 - 1] = var141.field705;
                    field754[++Statics.field92 - 1] = var141.field706;
                }
                var139 = 1;
            } else if (arg0 == 6506) {
                int var142 = field757[--Statics.field753];
                class30 var143 = null;
                for (int var144 = 0; var144 < class30.field698; var144++) {
                    if (Statics.field704[var144].field703 == var142) {
                        var143 = Statics.field704[var144];
                        break;
                    }
                }
                if (var143 == null) {
                    field757[++Statics.field753 - 1] = -1;
                    field757[++Statics.field753 - 1] = 0;
                    field754[++Statics.field92 - 1] = "";
                    field757[++Statics.field753 - 1] = 0;
                    field757[++Statics.field753 - 1] = 0;
                    field754[++Statics.field92 - 1] = "";
                } else {
                    field757[++Statics.field753 - 1] = var143.field703;
                    field757[++Statics.field753 - 1] = var143.field700;
                    field754[++Statics.field92 - 1] = var143.field707;
                    field757[++Statics.field753 - 1] = var143.field708;
                    field757[++Statics.field753 - 1] = var143.field705;
                    field754[++Statics.field92 - 1] = var143.field706;
                }
                var139 = 1;
            } else if (arg0 == 6507) {
                Statics.field753 -= 4;
                int var145 = field757[Statics.field753];
                boolean var146 = field757[Statics.field753 + 1] == 1;
                int var147 = field757[Statics.field753 + 2];
                boolean var148 = field757[Statics.field753 + 3] == 1;
                if (Statics.field704 != null) {
                    class30.method219(0, Statics.field704.length - 1, var145, var146, var147, var148);
                }
                var139 = 1;
            } else if (arg0 == 6511) {
                int var149 = field757[--Statics.field753];
                if (var149 >= 0 && var149 < class30.field698) {
                    class30 var150 = Statics.field704[var149];
                    field757[++Statics.field753 - 1] = var150.field703;
                    field757[++Statics.field753 - 1] = var150.field700;
                    field754[++Statics.field92 - 1] = var150.field707;
                    field757[++Statics.field753 - 1] = var150.field708;
                    field757[++Statics.field753 - 1] = var150.field705;
                    field754[++Statics.field92 - 1] = var150.field706;
                } else {
                    field757[++Statics.field753 - 1] = -1;
                    field757[++Statics.field753 - 1] = 0;
                    field754[++Statics.field92 - 1] = "";
                    field757[++Statics.field753 - 1] = 0;
                    field757[++Statics.field753 - 1] = 0;
                    field754[++Statics.field92 - 1] = "";
                }
                var139 = 1;
            } else if (arg0 == 6512) {
                client.field347 = field757[--Statics.field753] == 1;
                var139 = 1;
            } else {
                var139 = 2;
            }
            return var139;
        }
    }

    @ObfuscatedName("eu.d(ILag;ZI)I")
    public static int method2851(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field753 -= 3;
            int var3 = field757[Statics.field753];
            int var4 = field757[Statics.field753 + 1];
            int var5 = field757[Statics.field753 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class170 var6 = class170.method669(var3);
            if (var6.field2311 == null) {
                var6.field2311 = new class170[var5 + 1];
            }
            if (var6.field2311.length <= var5) {
                class170[] var7 = new class170[var5 + 1];
                for (int var8 = 0; var8 < var6.field2311.length; var8++) {
                    var7[var8] = var6.field2311[var8];
                }
                var6.field2311 = var7;
            }
            if (var5 > 0 && var6.field2311[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class170 var9 = new class170();
            var9.field2189 = var4;
            var9.field2255 = var9.field2187 = var6.field2187;
            var9.field2220 = var5;
            var9.field2277 = true;
            var6.field2311[var5] = var9;
            if (arg2) {
                Statics.field625 = var9;
            } else {
                Statics.field755 = var9;
            }
            client.method37(var6);
            return 1;
        } else if (arg0 == 101) {
            class170 var10 = arg2 ? Statics.field625 : Statics.field755;
            class170 var11 = class170.method669(var10.field2187);
            var11.field2311[var10.field2220] = null;
            client.method37(var11);
            return 1;
        } else if (arg0 == 102) {
            class170 var12 = class170.method669(field757[--Statics.field753]);
            var12.field2311 = null;
            client.method37(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field753 -= 2;
            int var13 = field757[Statics.field753];
            int var14 = field757[Statics.field753 + 1];
            class170 var15 = class170.method813(var13, var14);
            if (var15 == null || var14 == -1) {
                field757[++Statics.field753 - 1] = 0;
            } else {
                field757[++Statics.field753 - 1] = 1;
                if (arg2) {
                    Statics.field625 = var15;
                } else {
                    Statics.field755 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class170 var16 = class170.method669(field757[--Statics.field753]);
            if (var16 == null) {
                field757[++Statics.field753 - 1] = 0;
            } else {
                field757[++Statics.field753 - 1] = 1;
                if (arg2) {
                    Statics.field625 = var16;
                } else {
                    Statics.field755 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.w(ILag;ZI)I")
    public static int method194(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field757[--Statics.field753];
            var4 = class170.method669(var3);
        } else {
            var4 = arg2 ? Statics.field625 : Statics.field755;
        }
        if (arg0 == 1000) {
            Statics.field753 -= 4;
            var4.field2196 = field757[Statics.field753];
            var4.field2197 = field757[Statics.field753 + 1];
            var4.field2192 = field757[Statics.field753 + 2];
            var4.field2193 = field757[Statics.field753 + 3];
            client.method37(var4);
            Statics.method606(var4);
            if (var3 != -1 && var4.field2189 == 0) {
                client.method1983(Statics.field2223[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field753 -= 4;
            var4.field2198 = field757[Statics.field753];
            var4.field2199 = field757[Statics.field753 + 1];
            var4.field2186 = field757[Statics.field753 + 2];
            var4.field2208 = field757[Statics.field753 + 3];
            client.method37(var4);
            Statics.method606(var4);
            if (var3 != -1 && var4.field2189 == 0) {
                client.method1983(Statics.field2223[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field757[--Statics.field753] == 1;
            if (var4.field2207 != var5) {
                var4.field2207 = var5;
                client.method37(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2288 = field757[--Statics.field753] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2231 = field757[--Statics.field753] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("c.u(ILag;ZI)I")
    public static int method30(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field757[--Statics.field753];
            var4 = class170.method669(var3);
        } else {
            var4 = arg2 ? Statics.field625 : Statics.field755;
        }
        if (arg0 == 1100) {
            Statics.field753 -= 2;
            var4.field2242 = field757[Statics.field753];
            if (var4.field2242 > var4.field2261 - var4.field2202) {
                var4.field2242 = var4.field2261 - var4.field2202;
            }
            if (var4.field2242 < 0) {
                var4.field2242 = 0;
            }
            var4.field2209 = field757[Statics.field753 + 1];
            if (var4.field2209 > var4.field2321 - var4.field2302) {
                var4.field2209 = var4.field2321 - var4.field2302;
            }
            if (var4.field2209 < 0) {
                var4.field2209 = 0;
            }
            client.method37(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2320 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2216 = field757[--Statics.field753] == 1;
            client.method37(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2218 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2203 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2222 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2301 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2225 = field757[--Statics.field753] == 1;
            client.method37(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2285 = 1;
            var4.field2188 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field753 -= 6;
            var4.field2236 = field757[Statics.field753];
            var4.field2237 = field757[Statics.field753 + 1];
            var4.field2232 = field757[Statics.field753 + 2];
            var4.field2239 = field757[Statics.field753 + 3];
            var4.field2230 = field757[Statics.field753 + 4];
            var4.field2241 = field757[Statics.field753 + 5];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field757[--Statics.field753];
            if (var4.field2234 != var5) {
                var4.field2234 = var5;
                var4.field2309 = 0;
                var4.field2214 = 0;
                client.method37(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2244 = field757[--Statics.field753] == 1;
            client.method37(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field754[--Statics.field92];
            if (!var6.equals(var4.field2247)) {
                var4.field2247 = var6;
                client.method37(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2268 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field753 -= 3;
            var4.field2250 = field757[Statics.field753];
            var4.field2251 = field757[Statics.field753 + 1];
            var4.field2249 = field757[Statics.field753 + 2];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2252 = field757[--Statics.field753] == 1;
            client.method37(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2226 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2227 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2228 = field757[--Statics.field753] == 1;
            client.method37(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2229 = field757[--Statics.field753] == 1;
            client.method37(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field753 -= 2;
            var4.field2261 = field757[Statics.field753];
            var4.field2321 = field757[Statics.field753 + 1];
            client.method37(var4);
            if (var3 != -1 && var4.field2189 == 0) {
                client.method1983(Statics.field2223[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2187;
            int var8 = var4.field2220;
            client.field310.method2874(171);
            client.field310.method2672(var8);
            client.field310.method2627(var7);
            client.field478 = var4;
            client.method37(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2298 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2213 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2219 = field757[--Statics.field753];
            client.method37(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var9 = field757[--Statics.field753];
            class222[] var10 = new class222[] { class222.field3204, class222.field3200, class222.field3202, class222.field3203, class222.field3205 };
            class222 var11 = (class222) Statics.method78(var10, var9);
            if (var11 != null) {
                var4.field2195 = var11;
                client.method37(var4);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.y(ILag;ZI)I")
    public static int method107(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method669(field757[--Statics.field753]);
        } else {
            var3 = arg2 ? Statics.field625 : Statics.field755;
        }
        client.method37(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field753 -= 2;
            int var4 = field757[Statics.field753];
            int var5 = field757[Statics.field753 + 1];
            var3.field2307 = var4;
            var3.field2308 = var5;
            class199 var6 = class199.method2849(var4);
            var3.field2232 = var6.field2987;
            var3.field2239 = var6.field3000;
            var3.field2230 = var6.field3002;
            var3.field2236 = var6.field2955;
            var3.field2237 = var6.field2983;
            var3.field2241 = var6.field2972;
            if (arg0 == 1205) {
                var3.field2245 = 0;
            } else if (arg0 == 1212 | var6.field2969 == 1) {
                var3.field2245 = 1;
            } else {
                var3.field2245 = 2;
            }
            if (var3.field2180 > 0) {
                var3.field2241 = var3.field2241 * 32 / var3.field2180;
            } else if (var3.field2198 > 0) {
                var3.field2241 = var3.field2241 * 32 / var3.field2198;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2285 = 2;
            var3.field2188 = field757[--Statics.field753];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2285 = 3;
            var3.field2188 = Statics.field266.field270.method2966();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.e(ILag;ZI)I")
    public static int method598(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method669(field757[--Statics.field753]);
        } else {
            var3 = arg2 ? Statics.field625 : Statics.field755;
        }
        if (arg0 == 1300) {
            int var4 = field757[--Statics.field753] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3041(var4, field754[--Statics.field92]);
                return 1;
            } else {
                Statics.field92--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field753 -= 2;
            int var5 = field757[Statics.field753];
            int var6 = field757[Statics.field753 + 1];
            var3.field2262 = class170.method813(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2265 = field757[--Statics.field753] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2263 = field757[--Statics.field753];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2217 = field757[--Statics.field753];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2248 = field754[--Statics.field92];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2266 = field754[--Statics.field92];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2267 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("i.q(ILag;ZI)I")
    public static int method207(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method669(field757[--Statics.field753]);
        } else {
            var3 = arg2 ? Statics.field625 : Statics.field755;
        }
        String var4 = field754[--Statics.field92];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field757[--Statics.field753];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field757[--Statics.field753];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field754[--Statics.field92];
            } else {
                var7[var8] = Integer.valueOf(field757[--Statics.field753]);
            }
        }
        int var9 = field757[--Statics.field753];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2269 = var7;
        } else if (arg0 == 1401) {
            var3.field2272 = var7;
        } else if (arg0 == 1402) {
            var3.field2310 = var7;
        } else if (arg0 == 1403) {
            var3.field2273 = var7;
        } else if (arg0 == 1404) {
            var3.field2275 = var7;
        } else if (arg0 == 1405) {
            var3.field2276 = var7;
        } else if (arg0 == 1406) {
            var3.field2279 = var7;
        } else if (arg0 == 1407) {
            var3.field2280 = var7;
            var3.field2281 = var5;
        } else if (arg0 == 1408) {
            var3.field2286 = var7;
        } else if (arg0 == 1409) {
            var3.field2287 = var7;
        } else if (arg0 == 1410) {
            var3.field2304 = var7;
        } else if (arg0 == 1411) {
            var3.field2254 = var7;
        } else if (arg0 == 1412) {
            var3.field2274 = var7;
        } else if (arg0 == 1414) {
            var3.field2282 = var7;
            var3.field2206 = var5;
        } else if (arg0 == 1415) {
            var3.field2284 = var7;
            var3.field2246 = var5;
        } else if (arg0 == 1416) {
            var3.field2278 = var7;
        } else if (arg0 == 1417) {
            var3.field2318 = var7;
        } else if (arg0 == 1418) {
            var3.field2289 = var7;
        } else if (arg0 == 1419) {
            var3.field2290 = var7;
        } else if (arg0 == 1420) {
            var3.field2291 = var7;
        } else if (arg0 == 1421) {
            var3.field2292 = var7;
        } else if (arg0 == 1422) {
            var3.field2293 = var7;
        } else if (arg0 == 1423) {
            var3.field2294 = var7;
        } else if (arg0 == 1424) {
            var3.field2295 = var7;
        } else if (arg0 == 1425) {
            var3.field2297 = var7;
        } else if (arg0 == 1426) {
            var3.field2300 = var7;
        } else if (arg0 == 1427) {
            var3.field2296 = var7;
        } else {
            return 2;
        }
        var3.field2179 = true;
        return 1;
    }

    @ObfuscatedName("p.v(ILag;ZI)I")
    public static int method241(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = arg2 ? Statics.field625 : Statics.field755;
        if (arg0 == 1500) {
            field757[++Statics.field753 - 1] = var3.field2253;
            return 1;
        } else if (arg0 == 1501) {
            field757[++Statics.field753 - 1] = var3.field2201;
            return 1;
        } else if (arg0 == 1502) {
            field757[++Statics.field753 - 1] = var3.field2202;
            return 1;
        } else if (arg0 == 1503) {
            field757[++Statics.field753 - 1] = var3.field2302;
            return 1;
        } else if (arg0 == 1504) {
            field757[++Statics.field753 - 1] = var3.field2207 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field757[++Statics.field753 - 1] = var3.field2255;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("n.l(ILag;ZI)I")
    public static int method262(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = arg2 ? Statics.field625 : Statics.field755;
        if (arg0 == 1600) {
            field757[++Statics.field753 - 1] = var3.field2242;
            return 1;
        } else if (arg0 == 1601) {
            field757[++Statics.field753 - 1] = var3.field2209;
            return 1;
        } else if (arg0 == 1602) {
            field754[++Statics.field92 - 1] = var3.field2247;
            return 1;
        } else if (arg0 == 1603) {
            field757[++Statics.field753 - 1] = var3.field2261;
            return 1;
        } else if (arg0 == 1604) {
            field757[++Statics.field753 - 1] = var3.field2321;
            return 1;
        } else if (arg0 == 1605) {
            field757[++Statics.field753 - 1] = var3.field2241;
            return 1;
        } else if (arg0 == 1606) {
            field757[++Statics.field753 - 1] = var3.field2232;
            return 1;
        } else if (arg0 == 1607) {
            field757[++Statics.field753 - 1] = var3.field2230;
            return 1;
        } else if (arg0 == 1608) {
            field757[++Statics.field753 - 1] = var3.field2239;
            return 1;
        } else if (arg0 == 1609) {
            field757[++Statics.field753 - 1] = var3.field2218;
            return 1;
        } else if (arg0 == 1610) {
            field757[++Statics.field753 - 1] = var3.field2219;
            return 1;
        } else if (arg0 == 1611) {
            field757[++Statics.field753 - 1] = var3.field2320;
            return 1;
        } else if (arg0 == 1612) {
            field757[++Statics.field753 - 1] = var3.field2213;
            return 1;
        } else if (arg0 == 1613) {
            field757[++Statics.field753 - 1] = var3.field2195.method809();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.s(ILag;ZI)I")
    public static int method803(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = arg2 ? Statics.field625 : Statics.field755;
        if (arg0 == 1700) {
            field757[++Statics.field753 - 1] = var3.field2307;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2307 == -1) {
                field757[++Statics.field753 - 1] = 0;
            } else {
                field757[++Statics.field753 - 1] = var3.field2308;
            }
            return 1;
        } else if (arg0 == 1702) {
            field757[++Statics.field753 - 1] = var3.field2220;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("e.r(ILag;ZB)I")
    public static int method116(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method669(field757[--Statics.field753]);
        } else {
            var3 = arg2 ? Statics.field625 : Statics.field755;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field760 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2296 == null) {
            return 0;
        } else {
            class19 var4 = new class19();
            var4.field224 = var3;
            var4.field233 = var3.field2296;
            var4.field232 = field760 + 1;
            client.field513.method2300(var4);
            return 1;
        }
    }

    @ObfuscatedName("g.m(ILag;ZB)I")
    public static int method105(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = class170.method669(field757[--Statics.field753]);
        if (arg0 == 2600) {
            field757[++Statics.field753 - 1] = var3.field2242;
            return 1;
        } else if (arg0 == 2601) {
            field757[++Statics.field753 - 1] = var3.field2209;
            return 1;
        } else if (arg0 == 2602) {
            field754[++Statics.field92 - 1] = var3.field2247;
            return 1;
        } else if (arg0 == 2603) {
            field757[++Statics.field753 - 1] = var3.field2261;
            return 1;
        } else if (arg0 == 2604) {
            field757[++Statics.field753 - 1] = var3.field2321;
            return 1;
        } else if (arg0 == 2605) {
            field757[++Statics.field753 - 1] = var3.field2241;
            return 1;
        } else if (arg0 == 2606) {
            field757[++Statics.field753 - 1] = var3.field2232;
            return 1;
        } else if (arg0 == 2607) {
            field757[++Statics.field753 - 1] = var3.field2230;
            return 1;
        } else if (arg0 == 2608) {
            field757[++Statics.field753 - 1] = var3.field2239;
            return 1;
        } else if (arg0 == 2609) {
            field757[++Statics.field753 - 1] = var3.field2218;
            return 1;
        } else if (arg0 == 2610) {
            field757[++Statics.field753 - 1] = var3.field2219;
            return 1;
        } else if (arg0 == 2611) {
            field757[++Statics.field753 - 1] = var3.field2320;
            return 1;
        } else if (arg0 == 2612) {
            field757[++Statics.field753 - 1] = var3.field2213;
            return 1;
        } else if (arg0 == 2613) {
            field757[++Statics.field753 - 1] = var3.field2195.method809();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.f(ILag;ZI)I")
    public static int method796(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field757[++Statics.field753 - 1] = client.field320;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field753 -= 2;
            int var3 = field757[Statics.field753];
            int var4 = field757[Statics.field753 + 1];
            int[] var5 = field757;
            int var6 = ++Statics.field753 - 1;
            class13 var7 = (class13) class13.field144.method2247((long) var3);
            int var8;
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.field145.length) {
                var8 = var7.field145[var4];
            } else {
                var8 = -1;
            }
            var5[var6] = var8;
            return 1;
        } else if (arg0 == 3302) {
            Statics.field753 -= 2;
            int var9 = field757[Statics.field753];
            int var10 = field757[Statics.field753 + 1];
            int[] var11 = field757;
            int var12 = ++Statics.field753 - 1;
            class13 var13 = (class13) class13.field144.method2247((long) var9);
            int var14;
            if (var13 == null) {
                var14 = 0;
            } else if (var10 >= 0 && var10 < var13.field147.length) {
                var14 = var13.field147[var10];
            } else {
                var14 = 0;
            }
            var11[var12] = var14;
            return 1;
        } else if (arg0 == 3303) {
            Statics.field753 -= 2;
            int var15 = field757[Statics.field753];
            int var16 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = class13.method19(var15, var16);
            return 1;
        } else if (arg0 == 3304) {
            int var17 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = class187.method2620(var17).field2762;
            return 1;
        } else if (arg0 == 3305) {
            int var18 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = client.field427[var18];
            return 1;
        } else if (arg0 == 3306) {
            int var19 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = client.field449[var19];
            return 1;
        } else if (arg0 == 3307) {
            int var20 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = client.field525[var20];
            return 1;
        } else if (arg0 == 3308) {
            int var21 = Statics.field744;
            int var22 = (Statics.field266.field675 >> 7) + Statics.field791;
            int var23 = (Statics.field266.field627 >> 7) + Statics.field37;
            field757[++Statics.field753 - 1] = (var21 << 28) + (var22 << 14) + var23;
            return 1;
        } else if (arg0 == 3309) {
            int var24 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = var24 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var25 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = var25 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var26 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = var26 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field757[++Statics.field753 - 1] = client.field314 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field753 -= 2;
            int var27 = field757[Statics.field753] + 32768;
            int var28 = field757[Statics.field753 + 1];
            int[] var29 = field757;
            int var30 = ++Statics.field753 - 1;
            class13 var31 = (class13) class13.field144.method2247((long) var27);
            int var32;
            if (var31 == null) {
                var32 = -1;
            } else if (var28 >= 0 && var28 < var31.field145.length) {
                var32 = var31.field145[var28];
            } else {
                var32 = -1;
            }
            var29[var30] = var32;
            return 1;
        } else if (arg0 == 3314) {
            Statics.field753 -= 2;
            int var33 = field757[Statics.field753] + 32768;
            int var34 = field757[Statics.field753 + 1];
            int[] var35 = field757;
            int var36 = ++Statics.field753 - 1;
            class13 var37 = (class13) class13.field144.method2247((long) var33);
            int var38;
            if (var37 == null) {
                var38 = 0;
            } else if (var34 >= 0 && var34 < var37.field147.length) {
                var38 = var37.field147[var34];
            } else {
                var38 = 0;
            }
            var35[var36] = var38;
            return 1;
        } else if (arg0 == 3315) {
            Statics.field753 -= 2;
            int var39 = field757[Statics.field753] + 32768;
            int var40 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = class13.method19(var39, var40);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field481 >= 2) {
                field757[++Statics.field753 - 1] = client.field481;
            } else {
                field757[++Statics.field753 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field757[++Statics.field753 - 1] = client.field328;
            return 1;
        } else if (arg0 == 3318) {
            field757[++Statics.field753 - 1] = client.field583;
            return 1;
        } else if (arg0 == 3321) {
            field757[++Statics.field753 - 1] = client.field479;
            return 1;
        } else if (arg0 == 3322) {
            field757[++Statics.field753 - 1] = client.field415;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field483) {
                field757[++Statics.field753 - 1] = 1;
            } else {
                field757[++Statics.field753 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field757[++Statics.field753 - 1] = client.field375;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ez.b(ILag;ZI)I")
    public static int method2609(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field376 == 0) {
                field757[++Statics.field753 - 1] = -2;
            } else if (client.field376 == 1) {
                field757[++Statics.field753 - 1] = -1;
            } else {
                field757[++Statics.field753 - 1] = client.field581;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field757[--Statics.field753];
            if (client.field376 == 2 && var3 < client.field581) {
                field754[++Statics.field92 - 1] = client.field537[var3].field177;
                field754[++Statics.field92 - 1] = client.field537[var3].field172;
            } else {
                field754[++Statics.field92 - 1] = "";
                field754[++Statics.field92 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = field757[--Statics.field753];
            if (client.field376 == 2 && var4 < client.field581) {
                field757[++Statics.field753 - 1] = client.field537[var4].field182;
            } else {
                field757[++Statics.field753 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = field757[--Statics.field753];
            if (client.field376 == 2 && var5 < client.field581) {
                field757[++Statics.field753 - 1] = client.field537[var5].field174;
            } else {
                field757[++Statics.field753 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = field754[--Statics.field92];
            int var7 = field757[--Statics.field753];
            client.field310.method2874(22);
            client.field310.method2651(class154.method2955(var6) + 1);
            client.field310.method2665(var7);
            client.field310.method2630(var6);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = field754[--Statics.field92];
            if (var8 != null) {
                if ((client.field581 < 200 || client.field530 == 1) && client.field581 < 400) {
                    String var9 = class205.method1513(var8, Statics.field2156);
                    if (var9 != null) {
                        int var10 = 0;
                        while (true) {
                            if (var10 >= client.field581) {
                                for (int var14 = 0; var14 < client.field585; var14++) {
                                    class20 var15 = client.field480[var14];
                                    String var16 = class205.method1513(var15.field244, Statics.field2156);
                                    if (var16 != null && var16.equals(var9)) {
                                        class48.method685(30, "", class174.field2524 + var8 + class174.field2515);
                                        return 1;
                                    }
                                    if (var15.field240 != null) {
                                        String var17 = class205.method1513(var15.field240, Statics.field2156);
                                        if (var17 != null && var17.equals(var9)) {
                                            class48.method685(30, "", class174.field2524 + var8 + class174.field2515);
                                            return 1;
                                        }
                                    }
                                }
                                if (class205.method1513(Statics.field266.field283, Statics.field2156).equals(var9)) {
                                    class48.method685(30, "", class174.field2356);
                                } else {
                                    client.field310.method2874(36);
                                    client.field310.method2651(class154.method2955(var8));
                                    client.field310.method2630(var8);
                                }
                                break;
                            }
                            class15 var11 = client.field537[var10];
                            String var12 = class205.method1513(var11.field177, Statics.field2156);
                            if (var12 != null && var12.equals(var9)) {
                                class48.method685(30, "", var8 + class174.field2509);
                                break;
                            }
                            if (var11.field172 != null) {
                                String var13 = class205.method1513(var11.field172, Statics.field2156);
                                if (var13 != null && var13.equals(var9)) {
                                    class48.method685(30, "", var8 + class174.field2509);
                                    break;
                                }
                            }
                            var10++;
                        }
                    }
                } else {
                    class48.method685(30, "", class174.field2531);
                }
            }
            return 1;
        } else if (arg0 == 3606) {
            String var18 = field754[--Statics.field92];
            if (var18 != null) {
                String var19 = class205.method1513(var18, Statics.field2156);
                if (var19 != null) {
                    for (int var20 = 0; var20 < client.field581; var20++) {
                        class15 var21 = client.field537[var20];
                        String var22 = var21.field177;
                        String var23 = class205.method1513(var22, Statics.field2156);
                        boolean var24;
                        if (var18 == null || var22 == null) {
                            var24 = false;
                        } else if (var18.startsWith("#") || var22.startsWith("#")) {
                            var24 = var18.equals(var22);
                        } else {
                            var24 = var19.equals(var23);
                        }
                        if (var24) {
                            client.field581--;
                            for (int var25 = var20; var25 < client.field581; var25++) {
                                client.field537[var25] = client.field537[var25 + 1];
                            }
                            client.field507 = client.field499;
                            client.field310.method2874(196);
                            client.field310.method2651(class154.method2955(var18));
                            client.field310.method2630(var18);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3607) {
            String var26 = field754[--Statics.field92];
            if (var26 != null) {
                if ((client.field585 < 100 || client.field530 == 1) && client.field585 < 400) {
                    String var27 = class205.method1513(var26, Statics.field2156);
                    if (var27 != null) {
                        int var28 = 0;
                        while (true) {
                            if (var28 >= client.field585) {
                                for (int var32 = 0; var32 < client.field581; var32++) {
                                    class15 var33 = client.field537[var32];
                                    String var34 = class205.method1513(var33.field177, Statics.field2156);
                                    if (var34 != null && var34.equals(var27)) {
                                        class48.method685(31, "", class174.field2516 + var26 + class174.field2517);
                                        return 1;
                                    }
                                    if (var33.field172 != null) {
                                        String var35 = class205.method1513(var33.field172, Statics.field2156);
                                        if (var35 != null && var35.equals(var27)) {
                                            class48.method685(31, "", class174.field2516 + var26 + class174.field2517);
                                            return 1;
                                        }
                                    }
                                }
                                if (class205.method1513(Statics.field266.field283, Statics.field2156).equals(var27)) {
                                    class48.method685(31, "", class174.field2513);
                                } else {
                                    client.field310.method2874(190);
                                    client.field310.method2651(class154.method2955(var26));
                                    client.field310.method2630(var26);
                                }
                                break;
                            }
                            class20 var29 = client.field480[var28];
                            String var30 = class205.method1513(var29.field244, Statics.field2156);
                            if (var30 != null && var30.equals(var27)) {
                                class48.method685(31, "", var26 + class174.field2464);
                                break;
                            }
                            if (var29.field240 != null) {
                                String var31 = class205.method1513(var29.field240, Statics.field2156);
                                if (var31 != null && var31.equals(var27)) {
                                    class48.method685(31, "", var26 + class174.field2464);
                                    break;
                                }
                            }
                            var28++;
                        }
                    }
                } else {
                    class48.method685(31, "", class174.field2615);
                }
            }
            return 1;
        } else if (arg0 == 3608) {
            String var36 = field754[--Statics.field92];
            client.method3213(var36);
            return 1;
        } else if (arg0 == 3609) {
            String var37 = field754[--Statics.field92];
            class178[] var38 = new class178[] { class178.field2656, class178.field2660, class178.field2654, class178.field2653, class178.field2658, class178.field2655 };
            class178[] var39 = var38;
            for (int var40 = 0; var40 < var39.length; var40++) {
                class178 var41 = var39[var40];
                if (var41.field2659 != -1 && var37.startsWith(class38.method2016(var41.field2659))) {
                    var37 = var37.substring(6 + Integer.toString(var41.field2659).length());
                    break;
                }
            }
            field757[++Statics.field753 - 1] = client.method229(var37, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field541 == null) {
                field754[++Statics.field92 - 1] = "";
            } else {
                field754[++Statics.field92 - 1] = class206.method1860(client.field541);
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field541 == null) {
                field757[++Statics.field753 - 1] = 0;
            } else {
                field757[++Statics.field753 - 1] = Statics.field95;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var42 = field757[--Statics.field753];
            if (client.field541 == null || var42 >= Statics.field95) {
                field754[++Statics.field92 - 1] = "";
            } else {
                field754[++Statics.field92 - 1] = Statics.field1916[var42].field304;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var43 = field757[--Statics.field753];
            if (client.field541 == null || var43 >= Statics.field95) {
                field757[++Statics.field753 - 1] = 0;
            } else {
                field757[++Statics.field753 - 1] = Statics.field1916[var43].field300;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var44 = field757[--Statics.field753];
            if (client.field541 == null || var44 >= Statics.field95) {
                field757[++Statics.field753 - 1] = 0;
            } else {
                field757[++Statics.field753 - 1] = Statics.field1916[var44].field299;
            }
            return 1;
        } else if (arg0 == 3616) {
            field757[++Statics.field753 - 1] = Statics.field1747;
            return 1;
        } else if (arg0 == 3617) {
            String var45 = field754[--Statics.field92];
            client.method213(var45);
            return 1;
        } else if (arg0 == 3618) {
            field757[++Statics.field753 - 1] = Statics.field104;
            return 1;
        } else if (arg0 == 3619) {
            String var46 = field754[--Statics.field92];
            client.method624(var46);
            return 1;
        } else if (arg0 == 3620) {
            client.field310.method2874(164);
            client.field310.method2651(0);
            return 1;
        } else if (arg0 == 3621) {
            if (client.field376 == 0) {
                field757[++Statics.field753 - 1] = -1;
            } else {
                field757[++Statics.field753 - 1] = client.field585;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var47 = field757[--Statics.field753];
            if (client.field376 == 0 || var47 >= client.field585) {
                field754[++Statics.field92 - 1] = "";
                field754[++Statics.field92 - 1] = "";
            } else {
                field754[++Statics.field92 - 1] = client.field480[var47].field244;
                field754[++Statics.field92 - 1] = client.field480[var47].field240;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var48 = field754[--Statics.field92];
            if (var48.startsWith(class38.method2016(0)) || var48.startsWith(class38.method2016(1))) {
                var48 = var48.substring(7);
            }
            field757[++Statics.field753 - 1] = client.method2088(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var49 = field757[--Statics.field753];
            if (Statics.field1916 == null || var49 >= Statics.field95 || !Statics.field1916[var49].field304.equalsIgnoreCase(Statics.field266.field283)) {
                field757[++Statics.field753 - 1] = 0;
            } else {
                field757[++Statics.field753 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field436 == null) {
                field754[++Statics.field92 - 1] = "";
            } else {
                field754[++Statics.field92 - 1] = class206.method1860(client.field436);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.t(ILag;ZI)I")
    public static int method805(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = client.field590[var3].method52();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = client.field590[var4].field43;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = client.field590[var5].field44;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = client.field590[var6].field45;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = client.field590[var7].field46;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = client.field590[var8].field47;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field757[--Statics.field753];
            int var10 = client.field590[var9].method67();
            field757[++Statics.field753 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field757[--Statics.field753];
            int var12 = client.field590[var11].method67();
            field757[++Statics.field753 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field757[--Statics.field753];
            int var14 = client.field590[var13].method67();
            field757[++Statics.field753 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field757[--Statics.field753];
            int var16 = client.field590[var15].method67();
            field757[++Statics.field753 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field757[--Statics.field753] == 1;
            if (Statics.field1703 != null) {
                Statics.field1703.method17(class2.field15, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field757[--Statics.field753] == 1;
            if (Statics.field1703 != null) {
                Statics.field1703.method17(class2.field20, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field753 -= 2;
            boolean var19 = field757[Statics.field753] == 1;
            boolean var20 = field757[Statics.field753 + 1] == 1;
            if (Statics.field1703 != null) {
                Statics.field1703.method17(new class45(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field757[--Statics.field753] == 1;
            if (Statics.field1703 != null) {
                Statics.field1703.method17(class2.field12, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field757[--Statics.field753] == 1;
            if (Statics.field1703 != null) {
                Statics.field1703.method17(class2.field14, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field757[++Statics.field753 - 1] = Statics.field1703 == null ? 0 : Statics.field1703.field22.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field757[--Statics.field753];
            class3 var24 = (class3) Statics.field1703.field22.get(var23);
            field757[++Statics.field753 - 1] = var24.field27;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field757[--Statics.field753];
            class3 var26 = (class3) Statics.field1703.field22.get(var25);
            field754[++Statics.field92 - 1] = var26.method24();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field757[--Statics.field753];
            class3 var28 = (class3) Statics.field1703.field22.get(var27);
            field754[++Statics.field92 - 1] = var28.method25();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field757[--Statics.field753];
            class3 var30 = (class3) Statics.field1703.field22.get(var29);
            long var31 = class156.method1888() - Statics.field2663 - var30.field25;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field754[++Statics.field92 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field757[--Statics.field753];
            class3 var38 = (class3) Statics.field1703.field22.get(var37);
            field757[++Statics.field753 - 1] = var38.field26.field45;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field757[--Statics.field753];
            class3 var40 = (class3) Statics.field1703.field22.get(var39);
            field757[++Statics.field753 - 1] = var40.field26.field44;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field757[--Statics.field753];
            class3 var42 = (class3) Statics.field1703.field22.get(var41);
            field757[++Statics.field753 - 1] = var42.field26.field43;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("m.z(ILag;ZB)I")
    public static int method203(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field753 -= 2;
            int var3 = field757[Statics.field753];
            int var4 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field753 -= 2;
            int var5 = field757[Statics.field753];
            int var6 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field753 -= 2;
            int var7 = field757[Statics.field753];
            int var8 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field753 -= 2;
            int var9 = field757[Statics.field753];
            int var10 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field753 -= 5;
            int var13 = field757[Statics.field753];
            int var14 = field757[Statics.field753 + 1];
            int var15 = field757[Statics.field753 + 2];
            int var16 = field757[Statics.field753 + 3];
            int var17 = field757[Statics.field753 + 4];
            field757[++Statics.field753 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field753 -= 2;
            int var18 = field757[Statics.field753];
            int var19 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field753 -= 2;
            int var20 = field757[Statics.field753];
            int var21 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field753 -= 2;
            int var22 = field757[Statics.field753];
            int var23 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field753 -= 2;
            int var24 = field757[Statics.field753];
            int var25 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field753 -= 2;
            int var26 = field757[Statics.field753];
            int var27 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field753 -= 2;
            int var28 = field757[Statics.field753];
            int var29 = field757[Statics.field753 + 1];
            if (var28 == 0) {
                field757[++Statics.field753 - 1] = 0;
            } else {
                field757[++Statics.field753 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field753 -= 2;
            int var30 = field757[Statics.field753];
            int var31 = field757[Statics.field753 + 1];
            if (var30 == 0) {
                field757[++Statics.field753 - 1] = 0;
            } else if (var31 == 0) {
                field757[++Statics.field753 - 1] = Integer.MAX_VALUE;
            } else {
                field757[++Statics.field753 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field753 -= 2;
            int var32 = field757[Statics.field753];
            int var33 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field753 -= 2;
            int var34 = field757[Statics.field753];
            int var35 = field757[Statics.field753 + 1];
            field757[++Statics.field753 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field753 -= 3;
            long var36 = (long) field757[Statics.field753];
            long var38 = (long) field757[Statics.field753 + 1];
            long var40 = (long) field757[Statics.field753 + 2];
            field757[++Statics.field753 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fn.p(ILag;ZB)I")
    public static int method2917(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field754[--Statics.field92];
            int var4 = field757[--Statics.field753];
            field754[++Statics.field92 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field92 -= 2;
            String var5 = field754[Statics.field92];
            String var6 = field754[Statics.field92 + 1];
            field754[++Statics.field92 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field754[--Statics.field92];
            int var8 = field757[--Statics.field753];
            field754[++Statics.field92 - 1] = var7 + class208.method2174(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field754[--Statics.field92];
            field754[++Statics.field92 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field757[--Statics.field753];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field758.setTime(new Date(var11));
            int var13 = field758.get(5);
            int var14 = field758.get(2);
            int var15 = field758.get(1);
            field754[++Statics.field92 - 1] = var13 + "-" + field762[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field92 -= 2;
            String var16 = field754[Statics.field92];
            String var17 = field754[Statics.field92 + 1];
            if (Statics.field266.field270 != null && Statics.field266.field270.field2162) {
                field754[++Statics.field92 - 1] = var17;
            } else {
                field754[++Statics.field92 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field757[--Statics.field753];
            field754[++Statics.field92 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field92 -= 2;
            int[] var19 = field757;
            int var20 = ++Statics.field753 - 1;
            String var21 = field754[Statics.field92];
            String var22 = field754[Statics.field92 + 1];
            int var23 = client.field410;
            int var24 = var21.length();
            int var25 = var22.length();
            int var26 = 0;
            int var27 = 0;
            byte var28 = 0;
            byte var29 = 0;
            int var38;
            label258: while (true) {
                if (var26 - var28 >= var24 && var27 - var29 >= var25) {
                    int var30 = Math.min(var24, var25);
                    for (int var31 = 0; var31 < var30; var31++) {
                        char var34 = var21.charAt(var31);
                        char var35 = var22.charAt(var31);
                        if (var34 != var35 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
                            char var36 = Character.toLowerCase(var34);
                            char var37 = Character.toLowerCase(var35);
                            if (var36 != var37) {
                                var38 = class203.method3236(var36, var23) - class203.method3236(var37, var23);
                                break label258;
                            }
                        }
                    }
                    int var39 = var24 - var25;
                    if (var39 == 0) {
                        for (int var40 = 0; var40 < var30; var40++) {
                            char var41 = var21.charAt(var40);
                            char var42 = var22.charAt(var40);
                            if (var41 != var42) {
                                var38 = class203.method3236(var41, var23) - class203.method3236(var42, var23);
                                break label258;
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
                char var49 = class203.method278(var43, var23);
                char var50 = class203.method278(var45, var23);
                if (var49 != var50 && Character.toUpperCase(var49) != Character.toUpperCase(var50)) {
                    char var51 = Character.toLowerCase(var49);
                    char var52 = Character.toLowerCase(var50);
                    if (var51 != var52) {
                        var38 = class203.method3236(var51, var23) - class203.method3236(var52, var23);
                        break;
                    }
                }
            }
            byte var54;
            if (var38 > 0) {
                var54 = 1;
            } else if (var38 < 0) {
                var54 = -1;
            } else {
                var54 = 0;
            }
            var19[var20] = var54;
            return 1;
        } else if (arg0 == 4108) {
            String var55 = field754[--Statics.field92];
            Statics.field753 -= 2;
            int var56 = field757[Statics.field753];
            int var57 = field757[Statics.field753 + 1];
            byte[] var58 = Statics.field1966.method3121(var57, 0);
            class209 var59 = new class209(var58);
            field757[++Statics.field753 - 1] = var59.method3666(var55, var56);
            return 1;
        } else if (arg0 == 4109) {
            String var60 = field754[--Statics.field92];
            Statics.field753 -= 2;
            int var61 = field757[Statics.field753];
            int var62 = field757[Statics.field753 + 1];
            byte[] var63 = Statics.field1966.method3121(var62, 0);
            class209 var64 = new class209(var63);
            field757[++Statics.field753 - 1] = var64.method3710(var60, var61);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field92 -= 2;
            String var65 = field754[Statics.field92];
            String var66 = field754[Statics.field92 + 1];
            if (field757[--Statics.field753] == 1) {
                field754[++Statics.field92 - 1] = var65;
            } else {
                field754[++Statics.field92 - 1] = var66;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var67 = field754[--Statics.field92];
            field754[++Statics.field92 - 1] = class210.method3667(var67);
            return 1;
        } else if (arg0 == 4112) {
            String var68 = field754[--Statics.field92];
            int var69 = field757[--Statics.field753];
            field754[++Statics.field92 - 1] = var68 + (char) var69;
            return 1;
        } else if (arg0 == 4113) {
            int var70 = field757[--Statics.field753];
            int[] var71 = field757;
            int var72 = ++Statics.field753 - 1;
            char var73 = (char) var70;
            boolean var74;
            if (var73 >= ' ' && var73 <= '~') {
                var74 = true;
            } else if (var73 >= 160 && var73 <= 255) {
                var74 = true;
            } else if (var73 == 8364 || var73 == 338 || var73 == 8212 || var73 == 339 || var73 == 376) {
                var74 = true;
            } else {
                var74 = false;
            }
            var71[var72] = var74 ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var75 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = class208.method855((char) var75) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var76 = field757[--Statics.field753];
            int[] var77 = field757;
            int var78 = ++Statics.field753 - 1;
            char var79 = (char) var76;
            boolean var80 = var79 >= 'A' && var79 <= 'Z' || var79 >= 'a' && var79 <= 'z';
            var77[var78] = var80 ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var81 = field757[--Statics.field753];
            int[] var82 = field757;
            int var83 = ++Statics.field753 - 1;
            char var84 = (char) var81;
            boolean var85 = var84 >= '0' && var84 <= '9';
            var82[var83] = var85 ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var86 = field754[--Statics.field92];
            if (var86 == null) {
                field757[++Statics.field753 - 1] = 0;
            } else {
                field757[++Statics.field753 - 1] = var86.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var87 = field754[--Statics.field92];
            Statics.field753 -= 2;
            int var88 = field757[Statics.field753];
            int var89 = field757[Statics.field753 + 1];
            field754[++Statics.field92 - 1] = var87.substring(var88, var89);
            return 1;
        } else if (arg0 == 4119) {
            String var90 = field754[--Statics.field92];
            StringBuilder var91 = new StringBuilder(var90.length());
            boolean var92 = false;
            for (int var93 = 0; var93 < var90.length(); var93++) {
                char var94 = var90.charAt(var93);
                if (var94 == '<') {
                    var92 = true;
                } else if (var94 == '>') {
                    var92 = false;
                } else if (!var92) {
                    var91.append(var94);
                }
            }
            field754[++Statics.field92 - 1] = var91.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var95 = field754[--Statics.field92];
            int var96 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = var95.indexOf(var96);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field92 -= 2;
            String var97 = field754[Statics.field92];
            String var98 = field754[Statics.field92 + 1];
            int var99 = field757[--Statics.field753];
            field757[++Statics.field753 - 1] = var97.indexOf(var98, var99);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("br.n(ILag;ZB)I")
    public static int method1434(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field753 -= 2;
            int var3 = field757[Statics.field753];
            int var4 = field757[Statics.field753 + 1];
            if (!client.field441) {
                client.field397 = var3;
                client.field398 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field757[++Statics.field753 - 1] = client.field397;
            return 1;
        } else if (arg0 == 5506) {
            field757[++Statics.field753 - 1] = client.field398;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field757[--Statics.field753];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field403 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field757[++Statics.field753 - 1] = client.field403;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fe.a(ILag;ZI)I")
    public static int method3076(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field753 -= 2;
            client.field568 = (short) field757[Statics.field753];
            if (client.field568 <= 0) {
                client.field568 = 256;
            }
            client.field569 = (short) field757[Statics.field753 + 1];
            if (client.field569 <= 0) {
                client.field569 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field753 -= 2;
            client.field570 = (short) field757[Statics.field753];
            if (client.field570 <= 0) {
                client.field570 = 256;
            }
            client.field523 = (short) field757[Statics.field753 + 1];
            if (client.field523 <= 0) {
                client.field523 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field753 -= 4;
            client.field325 = (short) field757[Statics.field753];
            if (client.field325 <= 0) {
                client.field325 = 1;
            }
            client.field573 = (short) field757[Statics.field753 + 1];
            if (client.field573 <= 0) {
                client.field573 = 32767;
            } else if (client.field573 < client.field325) {
                client.field573 = client.field325;
            }
            client.field574 = (short) field757[Statics.field753 + 2];
            if (client.field574 <= 0) {
                client.field574 = 1;
            }
            client.field575 = (short) field757[Statics.field753 + 3];
            if (client.field575 <= 0) {
                client.field575 = 32767;
            } else if (client.field575 < client.field574) {
                client.field575 = client.field574;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field552 == null) {
                field757[++Statics.field753 - 1] = -1;
                field757[++Statics.field753 - 1] = -1;
            } else {
                client.method811(0, 0, client.field552.field2202, client.field552.field2302, false);
                field757[++Statics.field753 - 1] = client.field578;
                field757[++Statics.field753 - 1] = client.field579;
            }
            return 1;
        } else if (arg0 == 6204) {
            field757[++Statics.field753 - 1] = client.field570;
            field757[++Statics.field753 - 1] = client.field523;
            return 1;
        } else if (arg0 == 6205) {
            field757[++Statics.field753 - 1] = client.field568;
            field757[++Statics.field753 - 1] = client.field569;
            return 1;
        } else {
            return 2;
        }
    }
}
