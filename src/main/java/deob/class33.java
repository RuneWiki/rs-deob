package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("at")
public class class33 {

    @ObfuscatedName("at.y")
    public static int[] field730 = new int[5];

    @ObfuscatedName("at.j")
    public static int[][] field721 = new int[5][5000];

    @ObfuscatedName("at.g")
    public static int[] field720 = new int[1000];

    @ObfuscatedName("at.r")
    public static String[] field727 = new String[1000];

    @ObfuscatedName("at.k")
    public static int field725 = 0;

    @ObfuscatedName("at.f")
    public static class12[] field726 = new class12[50];

    @ObfuscatedName("at.d")
    public static Calendar field724 = Calendar.getInstance();

    @ObfuscatedName("at.o")
    public static final String[] field729 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("at.q")
    public static int field722 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eb.b(Lx;I)V")
    public static void method2511(class19 arg0) {
        method2399(arg0, 200000);
    }

    @ObfuscatedName("eh.e(Lx;IB)V")
    public static void method2399(class19 arg0, int arg1) {
        Object[] var2 = arg0.field203;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method207(var3);
        if (var4 == null) {
            return;
        }
        Statics.field723 = 0;
        Statics.field240 = 0;
        int var5 = -1;
        int[] var6 = var4.field949;
        int[] var7 = var4.field950;
        byte var8 = -1;
        field725 = 0;
        try {
            Statics.field35 = new int[var4.field953];
            int var9 = 0;
            Statics.field719 = new String[var4.field952];
            int var10 = 0;
            for (int var11 = 1; var11 < var2.length; var11++) {
                if (var2[var11] instanceof Integer) {
                    int var12 = (Integer) var2[var11];
                    if (var12 == -2147483647) {
                        var12 = arg0.field199;
                    }
                    if (var12 == -2147483646) {
                        var12 = arg0.field211;
                    }
                    if (var12 == -2147483645) {
                        var12 = arg0.field214 == null ? -1 : arg0.field214.field2201;
                    }
                    if (var12 == -2147483644) {
                        var12 = arg0.field212;
                    }
                    if (var12 == -2147483643) {
                        var12 = arg0.field214 == null ? -1 : arg0.field214.field2278;
                    }
                    if (var12 == -2147483642) {
                        var12 = arg0.field205 == null ? -1 : arg0.field205.field2201;
                    }
                    if (var12 == -2147483641) {
                        var12 = arg0.field205 == null ? -1 : arg0.field205.field2278;
                    }
                    if (var12 == -2147483640) {
                        var12 = arg0.field206;
                    }
                    if (var12 == -2147483639) {
                        var12 = arg0.field207;
                    }
                    Statics.field35[var9++] = var12;
                } else if (var2[var11] instanceof String) {
                    String var13 = (String) var2[var11];
                    if (var13.equals("event_opbase")) {
                        var13 = arg0.field208;
                    }
                    Statics.field719[var10++] = var13;
                }
            }
            int var14 = 0;
            field722 = arg0.field209;
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
                                                                                                                label219: while (true) {
                                                                                                                    var14++;
                                                                                                                    if (var14 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var5++;
                                                                                                                    int var52 = var6[var5];
                                                                                                                    if (var52 >= 100) {
                                                                                                                        boolean var46;
                                                                                                                        if (var4.field950[var5] == 1) {
                                                                                                                            var46 = true;
                                                                                                                        } else {
                                                                                                                            var46 = false;
                                                                                                                        }
                                                                                                                        int var47 = method200(var52, var4, var46);
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
                                                                                                                        field720[++Statics.field723 - 1] = var7[var5];
                                                                                                                    } else if (var52 == 1) {
                                                                                                                        int var15 = var7[var5];
                                                                                                                        field720[++Statics.field723 - 1] = class166.field2158[var15];
                                                                                                                    } else if (var52 == 2) {
                                                                                                                        int var16 = var7[var5];
                                                                                                                        class166.field2158[var16] = field720[--Statics.field723];
                                                                                                                        client.method1843(var16);
                                                                                                                    } else if (var52 == 3) {
                                                                                                                        field727[++Statics.field240 - 1] = var4.field951[var5];
                                                                                                                    } else if (var52 == 6) {
                                                                                                                        var5 += var7[var5];
                                                                                                                    } else if (var52 == 7) {
                                                                                                                        Statics.field723 -= 2;
                                                                                                                        if (field720[Statics.field723] != field720[Statics.field723 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 8) {
                                                                                                                        Statics.field723 -= 2;
                                                                                                                        if (field720[Statics.field723] == field720[Statics.field723 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 9) {
                                                                                                                        Statics.field723 -= 2;
                                                                                                                        if (field720[Statics.field723] < field720[Statics.field723 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 10) {
                                                                                                                        Statics.field723 -= 2;
                                                                                                                        if (field720[Statics.field723] > field720[Statics.field723 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 21) {
                                                                                                                        if (field725 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class12 var17 = field726[--field725];
                                                                                                                        var4 = var17.field129;
                                                                                                                        var6 = var4.field949;
                                                                                                                        var7 = var4.field950;
                                                                                                                        var5 = var17.field130;
                                                                                                                        Statics.field35 = var17.field125;
                                                                                                                        Statics.field719 = var17.field126;
                                                                                                                    } else if (var52 == 25) {
                                                                                                                        int var18 = var7[var5];
                                                                                                                        field720[++Statics.field723 - 1] = class166.method916(var18);
                                                                                                                    } else if (var52 == 27) {
                                                                                                                        int var19 = var7[var5];
                                                                                                                        int var20 = field720[--Statics.field723];
                                                                                                                        class195 var21 = class195.method623(var19);
                                                                                                                        int var22 = var21.field2857;
                                                                                                                        int var23 = var21.field2863;
                                                                                                                        int var24 = var21.field2859;
                                                                                                                        int var25 = class166.field2156[var24 - var23];
                                                                                                                        if (var20 < 0 || var20 > var25) {
                                                                                                                            var20 = 0;
                                                                                                                        }
                                                                                                                        int var26 = var25 << var23;
                                                                                                                        class166.field2158[var22] = class166.field2158[var22] & ~var26 | var20 << var23 & var26;
                                                                                                                    } else if (var52 == 31) {
                                                                                                                        Statics.field723 -= 2;
                                                                                                                        if (field720[Statics.field723] <= field720[Statics.field723 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 32) {
                                                                                                                        Statics.field723 -= 2;
                                                                                                                        if (field720[Statics.field723] >= field720[Statics.field723 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 33) {
                                                                                                                        field720[++Statics.field723 - 1] = Statics.field35[var7[var5]];
                                                                                                                    } else if (var52 == 34) {
                                                                                                                        Statics.field35[var7[var5]] = field720[--Statics.field723];
                                                                                                                    } else if (var52 == 35) {
                                                                                                                        field727[++Statics.field240 - 1] = Statics.field719[var7[var5]];
                                                                                                                    } else if (var52 == 36) {
                                                                                                                        Statics.field719[var7[var5]] = field727[--Statics.field240];
                                                                                                                    } else if (var52 == 37) {
                                                                                                                        int var27 = var7[var5];
                                                                                                                        Statics.field240 -= var27;
                                                                                                                        String var28 = class208.method2571(field727, Statics.field240, var27);
                                                                                                                        field727[++Statics.field240 - 1] = var28;
                                                                                                                    } else if (var52 == 38) {
                                                                                                                        Statics.field723--;
                                                                                                                    } else if (var52 == 39) {
                                                                                                                        Statics.field240--;
                                                                                                                    } else if (var52 == 40) {
                                                                                                                        int var29 = var7[var5];
                                                                                                                        class49 var30 = class49.method207(var29);
                                                                                                                        int[] var31 = new int[var30.field953];
                                                                                                                        String[] var32 = new String[var30.field952];
                                                                                                                        for (int var33 = 0; var33 < var30.field954; var33++) {
                                                                                                                            var31[var33] = field720[Statics.field723 - var30.field954 + var33];
                                                                                                                        }
                                                                                                                        for (int var34 = 0; var34 < var30.field955; var34++) {
                                                                                                                            var32[var34] = field727[Statics.field240 - var30.field955 + var34];
                                                                                                                        }
                                                                                                                        Statics.field723 -= var30.field954;
                                                                                                                        Statics.field240 -= var30.field955;
                                                                                                                        class12 var35 = new class12();
                                                                                                                        var35.field129 = var4;
                                                                                                                        var35.field130 = var5;
                                                                                                                        var35.field125 = Statics.field35;
                                                                                                                        var35.field126 = Statics.field719;
                                                                                                                        field726[++field725 - 1] = var35;
                                                                                                                        var4 = var30;
                                                                                                                        var6 = var30.field949;
                                                                                                                        var7 = var30.field950;
                                                                                                                        var5 = -1;
                                                                                                                        Statics.field35 = var31;
                                                                                                                        Statics.field719 = var32;
                                                                                                                    } else if (var52 == 42) {
                                                                                                                        field720[++Statics.field723 - 1] = Statics.field128.method853(var7[var5]);
                                                                                                                    } else if (var52 == 43) {
                                                                                                                        Statics.field128.method846(var7[var5], field720[--Statics.field723]);
                                                                                                                    } else if (var52 == 44) {
                                                                                                                        int var36 = var7[var5] >> 16;
                                                                                                                        int var37 = var7[var5] & 0xFFFF;
                                                                                                                        int var38 = field720[--Statics.field723];
                                                                                                                        if (var38 >= 0 && var38 <= 5000) {
                                                                                                                            field730[var36] = var38;
                                                                                                                            byte var39 = -1;
                                                                                                                            if (var37 == 105) {
                                                                                                                                var39 = 0;
                                                                                                                            }
                                                                                                                            int var40 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var40 >= var38) {
                                                                                                                                    continue label219;
                                                                                                                                }
                                                                                                                                field721[var36][var40] = var39;
                                                                                                                                var40++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var52 == 45) {
                                                                                                                        int var41 = var7[var5];
                                                                                                                        int var42 = field720[--Statics.field723];
                                                                                                                        if (var42 < 0 || var42 >= field730[var41]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field720[++Statics.field723 - 1] = field721[var41][var42];
                                                                                                                    } else if (var52 == 46) {
                                                                                                                        int var43 = var7[var5];
                                                                                                                        Statics.field723 -= 2;
                                                                                                                        int var44 = field720[Statics.field723];
                                                                                                                        if (var44 < 0 || var44 >= field730[var43]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field721[var43][var44] = field720[Statics.field723 + 1];
                                                                                                                    } else if (var52 == 47) {
                                                                                                                        String var45 = Statics.field128.method849(var7[var5]);
                                                                                                                        if (var45 == null) {
                                                                                                                            var45 = "null";
                                                                                                                        }
                                                                                                                        field727[++Statics.field240 - 1] = var45;
                                                                                                                    } else if (var52 == 48) {
                                                                                                                        Statics.field128.method856(var7[var5], field727[--Statics.field240]);
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
            var49.append("").append(var4.field1864).append(" ");
            for (int var50 = field725 - 1; var50 >= 0; var50--) {
                var49.append("").append(field726[var50].field129.field1864).append(" ");
            }
            var49.append("").append(var8);
            class102.method24(var49.toString(), var51);
        }
    }

    @ObfuscatedName("q.c(ILad;ZI)I")
    public static int method200(int arg0, class49 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method32(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2601(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method63(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method191(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method1937(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method171(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method2993(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            class170 var3 = arg2 ? Statics.field769 : Statics.field733;
            byte var4;
            if (arg0 == 1600) {
                field720[++Statics.field723 - 1] = var3.field2265;
                var4 = 1;
            } else if (arg0 == 1601) {
                field720[++Statics.field723 - 1] = var3.field2223;
                var4 = 1;
            } else if (arg0 == 1602) {
                field727[++Statics.field240 - 1] = var3.field2261;
                var4 = 1;
            } else if (arg0 == 1603) {
                field720[++Statics.field723 - 1] = var3.field2224;
                var4 = 1;
            } else if (arg0 == 1604) {
                field720[++Statics.field723 - 1] = var3.field2225;
                var4 = 1;
            } else if (arg0 == 1605) {
                field720[++Statics.field723 - 1] = var3.field2255;
                var4 = 1;
            } else if (arg0 == 1606) {
                field720[++Statics.field723 - 1] = var3.field2305;
                var4 = 1;
            } else if (arg0 == 1607) {
                field720[++Statics.field723 - 1] = var3.field2199;
                var4 = 1;
            } else if (arg0 == 1608) {
                field720[++Statics.field723 - 1] = var3.field2277;
                var4 = 1;
            } else if (arg0 == 1609) {
                field720[++Statics.field723 - 1] = var3.field2222;
                var4 = 1;
            } else if (arg0 == 1610) {
                field720[++Statics.field723 - 1] = var3.field2233;
                var4 = 1;
            } else if (arg0 == 1611) {
                field720[++Statics.field723 - 1] = var3.field2226;
                var4 = 1;
            } else if (arg0 == 1612) {
                field720[++Statics.field723 - 1] = var3.field2227;
                var4 = 1;
            } else if (arg0 == 1613) {
                field720[++Statics.field723 - 1] = var3.field2335.method765();
                var4 = 1;
            } else {
                var4 = 2;
            }
            return var4;
        } else if (arg0 < 1800) {
            class170 var8 = arg2 ? Statics.field769 : Statics.field733;
            byte var9;
            if (arg0 == 1700) {
                field720[++Statics.field723 - 1] = var8.field2202;
                var9 = 1;
            } else if (arg0 == 1701) {
                if (var8.field2202 == -1) {
                    field720[++Statics.field723 - 1] = 0;
                } else {
                    field720[++Statics.field723 - 1] = var8.field2322;
                }
                var9 = 1;
            } else if (arg0 == 1702) {
                field720[++Statics.field723 - 1] = var8.field2278;
                var9 = 1;
            } else {
                var9 = 2;
            }
            return var9;
        } else if (arg0 < 1900) {
            class170 var10 = arg2 ? Statics.field769 : Statics.field733;
            byte var11;
            if (arg0 == 1800) {
                field720[++Statics.field723 - 1] = class171.method1870(client.method2885(var10));
                var11 = 1;
            } else if (arg0 == 1801) {
                int var12 = field720[--Statics.field723];
                int var253 = var12 - 1;
                if (var10.field2311 == null || var253 >= var10.field2311.length || var10.field2311[var253] == null) {
                    field727[++Statics.field240 - 1] = "";
                } else {
                    field727[++Statics.field240 - 1] = var10.field2311[var253];
                }
                var11 = 1;
            } else if (arg0 == 1802) {
                if (var10.field2274 == null) {
                    field727[++Statics.field240 - 1] = "";
                } else {
                    field727[++Statics.field240 - 1] = var10.field2274;
                }
                var11 = 1;
            } else {
                var11 = 2;
            }
            return var11;
        } else if (arg0 < 2000) {
            return method1838(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2601(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method63(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method191(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method1937(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method171(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method1643(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            class170 var13 = Statics.method211(field720[--Statics.field723]);
            byte var14;
            if (arg0 == 2600) {
                field720[++Statics.field723 - 1] = var13.field2265;
                var14 = 1;
            } else if (arg0 == 2601) {
                field720[++Statics.field723 - 1] = var13.field2223;
                var14 = 1;
            } else if (arg0 == 2602) {
                field727[++Statics.field240 - 1] = var13.field2261;
                var14 = 1;
            } else if (arg0 == 2603) {
                field720[++Statics.field723 - 1] = var13.field2224;
                var14 = 1;
            } else if (arg0 == 2604) {
                field720[++Statics.field723 - 1] = var13.field2225;
                var14 = 1;
            } else if (arg0 == 2605) {
                field720[++Statics.field723 - 1] = var13.field2255;
                var14 = 1;
            } else if (arg0 == 2606) {
                field720[++Statics.field723 - 1] = var13.field2305;
                var14 = 1;
            } else if (arg0 == 2607) {
                field720[++Statics.field723 - 1] = var13.field2199;
                var14 = 1;
            } else if (arg0 == 2608) {
                field720[++Statics.field723 - 1] = var13.field2277;
                var14 = 1;
            } else if (arg0 == 2609) {
                field720[++Statics.field723 - 1] = var13.field2222;
                var14 = 1;
            } else if (arg0 == 2610) {
                field720[++Statics.field723 - 1] = var13.field2233;
                var14 = 1;
            } else if (arg0 == 2611) {
                field720[++Statics.field723 - 1] = var13.field2226;
                var14 = 1;
            } else if (arg0 == 2612) {
                field720[++Statics.field723 - 1] = var13.field2227;
                var14 = 1;
            } else if (arg0 == 2613) {
                field720[++Statics.field723 - 1] = var13.field2335.method765();
                var14 = 1;
            } else {
                var14 = 2;
            }
            return var14;
        } else if (arg0 < 2800) {
            byte var16;
            if (arg0 == 2700) {
                class170 var15 = Statics.method211(field720[--Statics.field723]);
                field720[++Statics.field723 - 1] = var15.field2202;
                var16 = 1;
            } else if (arg0 == 2701) {
                class170 var17 = Statics.method211(field720[--Statics.field723]);
                if (var17.field2202 == -1) {
                    field720[++Statics.field723 - 1] = 0;
                } else {
                    field720[++Statics.field723 - 1] = var17.field2322;
                }
                var16 = 1;
            } else if (arg0 == 2702) {
                int var18 = field720[--Statics.field723];
                class18 var19 = (class18) client.field449.method2259((long) var18);
                if (var19 == null) {
                    field720[++Statics.field723 - 1] = 0;
                } else {
                    field720[++Statics.field723 - 1] = 1;
                }
                var16 = 1;
            } else if (arg0 == 2706) {
                field720[++Statics.field723 - 1] = client.field448;
                var16 = 1;
            } else {
                var16 = 2;
            }
            return var16;
        } else if (arg0 < 2900) {
            class170 var20 = Statics.method211(field720[--Statics.field723]);
            byte var21;
            if (arg0 == 2800) {
                field720[++Statics.field723 - 1] = class171.method1870(client.method2885(var20));
                var21 = 1;
            } else if (arg0 == 2801) {
                int var22 = field720[--Statics.field723];
                int var254 = var22 - 1;
                if (var20.field2311 == null || var254 >= var20.field2311.length || var20.field2311[var254] == null) {
                    field727[++Statics.field240 - 1] = "";
                } else {
                    field727[++Statics.field240 - 1] = var20.field2311[var254];
                }
                var21 = 1;
            } else if (arg0 == 2802) {
                if (var20.field2274 == null) {
                    field727[++Statics.field240 - 1] = "";
                } else {
                    field727[++Statics.field240 - 1] = var20.field2274;
                }
                var21 = 1;
            } else {
                var21 = 2;
            }
            return var21;
        } else if (arg0 < 3000) {
            return method1838(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            byte var24;
            if (arg0 == 3100) {
                String var23 = field727[--Statics.field240];
                class48.method3031(0, "", var23);
                var24 = 1;
            } else if (arg0 == 3101) {
                Statics.field723 -= 2;
                client.method69(Statics.field685, field720[Statics.field723], field720[Statics.field723 + 1]);
                var24 = 1;
            } else if (arg0 == 3103) {
                client.field417.method2920(196);
                for (class18 var25 = (class18) client.field449.method2262(); var25 != null; var25 = (class18) client.field449.method2260()) {
                    if (var25.field188 == 0 || var25.field188 == 3) {
                        client.method213(var25, true);
                    }
                }
                if (client.field452 != null) {
                    client.method1858(client.field452);
                    client.field452 = null;
                }
                var24 = 1;
            } else if (arg0 == 3104) {
                String var26 = field727[--Statics.field240];
                int var27 = 0;
                boolean var28 = false;
                boolean var29 = false;
                int var30 = 0;
                int var31 = var26.length();
                int var32 = 0;
                boolean var34;
                while (true) {
                    if (var32 >= var31) {
                        var34 = var29;
                        break;
                    }
                    label1616: {
                        char var33 = var26.charAt(var32);
                        if (var32 == 0) {
                            if (var33 == '-') {
                                var28 = true;
                                break label1616;
                            }
                            if (var33 == '+') {
                                break label1616;
                            }
                        }
                        int var255;
                        if (var33 >= '0' && var33 <= '9') {
                            var255 = var33 - '0';
                        } else if (var33 >= 'A' && var33 <= 'Z') {
                            var255 = var33 - '7';
                        } else {
                            if (var33 < 'a' || var33 > 'z') {
                                var34 = false;
                                break;
                            }
                            var255 = var33 - 'W';
                        }
                        if (var255 >= 10) {
                            var34 = false;
                            break;
                        }
                        if (var28) {
                            var255 = -var255;
                        }
                        int var35 = var30 * 10 + var255;
                        if (var35 / 10 != var30) {
                            var34 = false;
                            break;
                        }
                        var30 = var35;
                        var29 = true;
                    }
                    var32++;
                }
                if (var34) {
                    int var37 = class208.method3576(var26, 10, true);
                    var27 = var37;
                }
                client.field417.method2920(202);
                client.field417.method2658(var27);
                var24 = 1;
            } else if (arg0 == 3105) {
                String var38 = field727[--Statics.field240];
                client.field417.method2920(78);
                client.field417.method2780(var38.length() + 1);
                client.field417.method2764(var38);
                var24 = 1;
            } else if (arg0 == 3106) {
                String var39 = field727[--Statics.field240];
                client.field417.method2920(72);
                client.field417.method2780(var39.length() + 1);
                client.field417.method2764(var39);
                var24 = 1;
            } else if (arg0 == 3107) {
                int var40 = field720[--Statics.field723];
                String var41 = field727[--Statics.field240];
                client.method2602(var40, var41);
                var24 = 1;
            } else if (arg0 == 3108) {
                Statics.field723 -= 3;
                int var42 = field720[Statics.field723];
                int var43 = field720[Statics.field723 + 1];
                int var44 = field720[Statics.field723 + 2];
                class170 var45 = Statics.method211(var44);
                client.method2513(var45, var42, var43);
                var24 = 1;
            } else if (arg0 == 3109) {
                Statics.field723 -= 2;
                int var46 = field720[Statics.field723];
                int var47 = field720[Statics.field723 + 1];
                class170 var48 = arg2 ? Statics.field769 : Statics.field733;
                client.method2513(var48, var46, var47);
                var24 = 1;
            } else if (arg0 == 3110) {
                Statics.field1832 = field720[--Statics.field723] == 1;
                var24 = 1;
            } else if (arg0 == 3111) {
                field720[++Statics.field723 - 1] = Statics.field2073.field687 ? 1 : 0;
                var24 = 1;
            } else if (arg0 == 3112) {
                Statics.field2073.field687 = field720[--Statics.field723] == 1;
                class31.method1576();
                var24 = 1;
            } else if (arg0 == 3113) {
                String var49 = field727[--Statics.field240];
                boolean var50 = field720[--Statics.field723] == 1;
                class115.method603(var49, var50, false);
                var24 = 1;
            } else if (arg0 == 3115) {
                int var51 = field720[--Statics.field723];
                client.field417.method2920(164);
                client.field417.method2793(var51);
                var24 = 1;
            } else if (arg0 == 3116) {
                int var52 = field720[--Statics.field723];
                Statics.field240 -= 2;
                String var53 = field727[Statics.field240];
                String var54 = field727[Statics.field240 + 1];
                if (var53.length() > 500) {
                    var24 = 1;
                } else if (var54.length() > 500) {
                    var24 = 1;
                } else {
                    client.field417.method2920(208);
                    client.field417.method2793(1 + class154.method2198(var53) + class154.method2198(var54));
                    client.field417.method2764(var53);
                    client.field417.method2764(var54);
                    client.field417.method2695(var52);
                    var24 = 1;
                }
            } else if (arg0 == 3117) {
                client.field436 = field720[--Statics.field723] == 1;
                var24 = 1;
            } else {
                var24 = 2;
            }
            return var24;
        } else if (arg0 < 3300) {
            byte var58;
            if (arg0 == 3200) {
                Statics.field723 -= 3;
                int var55 = field720[Statics.field723];
                int var56 = field720[Statics.field723 + 1];
                int var57 = field720[Statics.field723 + 2];
                if (client.field528 != 0 && var56 != 0 && client.field530 < 50) {
                    client.field536[client.field530] = var55;
                    client.field532[client.field530] = var56;
                    client.field533[client.field530] = var57;
                    client.field535[client.field530] = null;
                    client.field529[client.field530] = 0;
                    client.field530++;
                }
                var58 = 1;
            } else if (arg0 == 3201) {
                int var59 = field720[--Statics.field723];
                if (var59 == -1 && !client.field527) {
                    Statics.field1902.method2414();
                    class139.field1903 = 1;
                    Statics.field889 = null;
                } else if (var59 != -1 && client.field526 != var59 && client.field525 != 0 && !client.field527) {
                    class139.method2002(2, Statics.field931, var59, 0, client.field525, false);
                }
                client.field526 = var59;
                var58 = 1;
            } else if (arg0 == 3202) {
                Statics.field723 -= 2;
                int var60 = field720[Statics.field723];
                int var61 = field720[Statics.field723 + 1];
                if (client.field525 != 0 && var60 != -1) {
                    class139.method1859(Statics.field131, var60, 0, client.field525, false);
                    client.field527 = true;
                }
                var58 = 1;
            } else {
                var58 = 2;
            }
            return var58;
        } else if (arg0 < 3400) {
            return method192(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method808(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return Statics.method112(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            byte var63;
            if (arg0 == 3903) {
                int var62 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = client.field564[var62].method47();
                var63 = 1;
            } else if (arg0 == 3904) {
                int var64 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = client.field564[var64].field40;
                var63 = 1;
            } else if (arg0 == 3905) {
                int var65 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = client.field564[var65].field43;
                var63 = 1;
            } else if (arg0 == 3906) {
                int var66 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = client.field564[var66].field50;
                var63 = 1;
            } else if (arg0 == 3907) {
                int var67 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = client.field564[var67].field42;
                var63 = 1;
            } else if (arg0 == 3908) {
                int var68 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = client.field564[var68].field44;
                var63 = 1;
            } else if (arg0 == 3910) {
                int var69 = field720[--Statics.field723];
                int var70 = client.field564[var69].method46();
                field720[++Statics.field723 - 1] = var70 == 0 ? 1 : 0;
                var63 = 1;
            } else if (arg0 == 3911) {
                int var71 = field720[--Statics.field723];
                int var72 = client.field564[var71].method46();
                field720[++Statics.field723 - 1] = var72 == 2 ? 1 : 0;
                var63 = 1;
            } else if (arg0 == 3912) {
                int var73 = field720[--Statics.field723];
                int var74 = client.field564[var73].method46();
                field720[++Statics.field723 - 1] = var74 == 5 ? 1 : 0;
                var63 = 1;
            } else if (arg0 == 3913) {
                int var75 = field720[--Statics.field723];
                int var76 = client.field564[var75].method46();
                field720[++Statics.field723 - 1] = var76 == 1 ? 1 : 0;
                var63 = 1;
            } else if (arg0 == 3914) {
                boolean var77 = field720[--Statics.field723] == 1;
                if (Statics.field190 != null) {
                    Statics.field190.method13(class2.field11, var77);
                }
                var63 = 1;
            } else if (arg0 == 3915) {
                boolean var78 = field720[--Statics.field723] == 1;
                if (Statics.field190 != null) {
                    Statics.field190.method13(class2.field10, var78);
                }
                var63 = 1;
            } else if (arg0 == 3916) {
                Statics.field723 -= 2;
                boolean var79 = field720[Statics.field723] == 1;
                boolean var80 = field720[Statics.field723 + 1] == 1;
                if (Statics.field190 != null) {
                    Statics.field190.method13(new class45(var80), var79);
                }
                var63 = 1;
            } else if (arg0 == 3917) {
                boolean var81 = field720[--Statics.field723] == 1;
                if (Statics.field190 != null) {
                    Statics.field190.method13(class2.field13, var81);
                }
                var63 = 1;
            } else if (arg0 == 3918) {
                boolean var82 = field720[--Statics.field723] == 1;
                if (Statics.field190 != null) {
                    Statics.field190.method13(class2.field17, var82);
                }
                var63 = 1;
            } else if (arg0 == 3919) {
                field720[++Statics.field723 - 1] = Statics.field190 == null ? 0 : Statics.field190.field12.size();
                var63 = 1;
            } else if (arg0 == 3920) {
                int var83 = field720[--Statics.field723];
                class3 var84 = (class3) Statics.field190.field12.get(var83);
                field720[++Statics.field723 - 1] = var84.field29;
                var63 = 1;
            } else if (arg0 == 3921) {
                int var85 = field720[--Statics.field723];
                class3 var86 = (class3) Statics.field190.field12.get(var85);
                field727[++Statics.field240 - 1] = var86.method19();
                var63 = 1;
            } else if (arg0 == 3922) {
                int var87 = field720[--Statics.field723];
                class3 var88 = (class3) Statics.field190.field12.get(var87);
                field727[++Statics.field240 - 1] = var88.method20();
                var63 = 1;
            } else if (arg0 == 3923) {
                int var89 = field720[--Statics.field723];
                class3 var90 = (class3) Statics.field190.field12.get(var89);
                long var91 = class156.method81() - Statics.field1560 - var90.field22;
                int var93 = (int) (var91 / 3600000L);
                int var94 = (int) ((var91 - (long) (var93 * 3600000)) / 60000L);
                int var95 = (int) ((var91 - (long) (var93 * 3600000) - (long) (var94 * 60000)) / 1000L);
                String var96 = var93 + ":" + var94 / 10 + var94 % 10 + ":" + var95 / 10 + var95 % 10;
                field727[++Statics.field240 - 1] = var96;
                var63 = 1;
            } else if (arg0 == 3924) {
                int var97 = field720[--Statics.field723];
                class3 var98 = (class3) Statics.field190.field12.get(var97);
                field720[++Statics.field723 - 1] = var98.field25.field50;
                var63 = 1;
            } else if (arg0 == 3925) {
                int var99 = field720[--Statics.field723];
                class3 var100 = (class3) Statics.field190.field12.get(var99);
                field720[++Statics.field723 - 1] = var100.field25.field43;
                var63 = 1;
            } else if (arg0 == 3926) {
                int var101 = field720[--Statics.field723];
                class3 var102 = (class3) Statics.field190.field12.get(var101);
                field720[++Statics.field723 - 1] = var102.field25.field40;
                var63 = 1;
            } else {
                var63 = 2;
            }
            return var63;
        } else if (arg0 < 4100) {
            return method201(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            byte var105;
            if (arg0 == 4100) {
                String var103 = field727[--Statics.field240];
                int var104 = field720[--Statics.field723];
                field727[++Statics.field240 - 1] = var103 + var104;
                var105 = 1;
            } else if (arg0 == 4101) {
                Statics.field240 -= 2;
                String var106 = field727[Statics.field240];
                String var107 = field727[Statics.field240 + 1];
                field727[++Statics.field240 - 1] = var106 + var107;
                var105 = 1;
            } else if (arg0 == 4102) {
                String var108 = field727[--Statics.field240];
                int var109 = field720[--Statics.field723];
                String[] var110 = field727;
                int var111 = ++Statics.field240 - 1;
                String var113;
                if (var109 < 0) {
                    var113 = Integer.toString(var109);
                } else {
                    int var114 = var109;
                    String var115;
                    if (var109 < 0) {
                        var115 = Integer.toString(var109, 10);
                    } else {
                        int var116 = 2;
                        int var117 = var109 / 10;
                        while (var117 != 0) {
                            var117 /= 10;
                            var116++;
                        }
                        char[] var118 = new char[var116];
                        var118[0] = '+';
                        for (int var119 = var116 - 1; var119 > 0; var119--) {
                            int var120 = var114;
                            var114 /= 10;
                            int var121 = var120 - var114 * 10;
                            if (var121 >= 10) {
                                var118[var119] = (char) (var121 + 87);
                            } else {
                                var118[var119] = (char) (var121 + 48);
                            }
                        }
                        var115 = new String(var118);
                    }
                    var113 = var115;
                }
                var110[var111] = var108 + var113;
                var105 = 1;
            } else if (arg0 == 4103) {
                String var122 = field727[--Statics.field240];
                field727[++Statics.field240 - 1] = var122.toLowerCase();
                var105 = 1;
            } else if (arg0 == 4104) {
                int var123 = field720[--Statics.field723];
                long var124 = ((long) var123 + 11745L) * 86400000L;
                field724.setTime(new Date(var124));
                int var126 = field724.get(5);
                int var127 = field724.get(2);
                int var128 = field724.get(1);
                field727[++Statics.field240 - 1] = var126 + "-" + field729[var127] + "-" + var128;
                var105 = 1;
            } else if (arg0 == 4105) {
                Statics.field240 -= 2;
                String var129 = field727[Statics.field240];
                String var130 = field727[Statics.field240 + 1];
                if (Statics.field685.field246 != null && Statics.field685.field246.field2167) {
                    field727[++Statics.field240 - 1] = var130;
                } else {
                    field727[++Statics.field240 - 1] = var129;
                }
                var105 = 1;
            } else if (arg0 == 4106) {
                int var131 = field720[--Statics.field723];
                field727[++Statics.field240 - 1] = Integer.toString(var131);
                var105 = 1;
            } else if (arg0 == 4107) {
                Statics.field240 -= 2;
                int[] var132 = field720;
                int var133 = ++Statics.field723 - 1;
                int var134 = class203.method2905(field727[Statics.field240], field727[Statics.field240 + 1], client.field314);
                byte var135;
                if (var134 > 0) {
                    var135 = 1;
                } else if (var134 < 0) {
                    var135 = -1;
                } else {
                    var135 = 0;
                }
                var132[var133] = var135;
                var105 = 1;
            } else if (arg0 == 4108) {
                String var136 = field727[--Statics.field240];
                Statics.field723 -= 2;
                int var137 = field720[Statics.field723];
                int var138 = field720[Statics.field723 + 1];
                byte[] var139 = Statics.field979.method3126(var138, 0);
                class209 var140 = new class209(var139);
                field720[++Statics.field723 - 1] = var140.method3705(var136, var137);
                var105 = 1;
            } else if (arg0 == 4109) {
                String var141 = field727[--Statics.field240];
                Statics.field723 -= 2;
                int var142 = field720[Statics.field723];
                int var143 = field720[Statics.field723 + 1];
                byte[] var144 = Statics.field979.method3126(var143, 0);
                class209 var145 = new class209(var144);
                field720[++Statics.field723 - 1] = var145.method3704(var141, var142);
                var105 = 1;
            } else if (arg0 == 4110) {
                Statics.field240 -= 2;
                String var146 = field727[Statics.field240];
                String var147 = field727[Statics.field240 + 1];
                if (field720[--Statics.field723] == 1) {
                    field727[++Statics.field240 - 1] = var146;
                } else {
                    field727[++Statics.field240 - 1] = var147;
                }
                var105 = 1;
            } else if (arg0 == 4111) {
                String var148 = field727[--Statics.field240];
                field727[++Statics.field240 - 1] = class210.method3706(var148);
                var105 = 1;
            } else if (arg0 == 4112) {
                String var149 = field727[--Statics.field240];
                int var150 = field720[--Statics.field723];
                field727[++Statics.field240 - 1] = var149 + (char) var150;
                var105 = 1;
            } else if (arg0 == 4113) {
                int var151 = field720[--Statics.field723];
                int[] var152 = field720;
                int var153 = ++Statics.field723 - 1;
                char var154 = (char) var151;
                boolean var155;
                if (var154 >= ' ' && var154 <= '~') {
                    var155 = true;
                } else if (var154 >= 160 && var154 <= 255) {
                    var155 = true;
                } else if (var154 == 8364 || var154 == 338 || var154 == 8212 || var154 == 339 || var154 == 376) {
                    var155 = true;
                } else {
                    var155 = false;
                }
                var152[var153] = var155 ? 1 : 0;
                var105 = 1;
            } else if (arg0 == 4114) {
                int var156 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = class208.method3616((char) var156) ? 1 : 0;
                var105 = 1;
            } else if (arg0 == 4115) {
                int var157 = field720[--Statics.field723];
                int[] var158 = field720;
                int var159 = ++Statics.field723 - 1;
                char var160 = (char) var157;
                boolean var161 = var160 >= 'A' && var160 <= 'Z' || var160 >= 'a' && var160 <= 'z';
                var158[var159] = var161 ? 1 : 0;
                var105 = 1;
            } else if (arg0 == 4116) {
                int var162 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = class208.method2605((char) var162) ? 1 : 0;
                var105 = 1;
            } else if (arg0 == 4117) {
                String var163 = field727[--Statics.field240];
                if (var163 == null) {
                    field720[++Statics.field723 - 1] = 0;
                } else {
                    field720[++Statics.field723 - 1] = var163.length();
                }
                var105 = 1;
            } else if (arg0 == 4118) {
                String var164 = field727[--Statics.field240];
                Statics.field723 -= 2;
                int var165 = field720[Statics.field723];
                int var166 = field720[Statics.field723 + 1];
                field727[++Statics.field240 - 1] = var164.substring(var165, var166);
                var105 = 1;
            } else if (arg0 == 4119) {
                String var167 = field727[--Statics.field240];
                StringBuilder var168 = new StringBuilder(var167.length());
                boolean var169 = false;
                for (int var170 = 0; var170 < var167.length(); var170++) {
                    char var171 = var167.charAt(var170);
                    if (var171 == '<') {
                        var169 = true;
                    } else if (var171 == '>') {
                        var169 = false;
                    } else if (!var169) {
                        var168.append(var171);
                    }
                }
                field727[++Statics.field240 - 1] = var168.toString();
                var105 = 1;
            } else if (arg0 == 4120) {
                String var172 = field727[--Statics.field240];
                int var173 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = var172.indexOf(var173);
                var105 = 1;
            } else if (arg0 == 4121) {
                Statics.field240 -= 2;
                String var174 = field727[Statics.field240];
                String var175 = field727[Statics.field240 + 1];
                int var176 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = var174.indexOf(var175, var176);
                var105 = 1;
            } else {
                var105 = 2;
            }
            return var105;
        } else if (arg0 < 4300) {
            byte var178;
            if (arg0 == 4200) {
                int var177 = field720[--Statics.field723];
                field727[++Statics.field240 - 1] = class199.method751(var177).field2963;
                var178 = 1;
            } else if (arg0 == 4201) {
                Statics.field723 -= 2;
                int var179 = field720[Statics.field723];
                int var180 = field720[Statics.field723 + 1];
                class199 var181 = class199.method751(var179);
                if (var180 < 1 || var180 > 5 || var181.field2977[var180 - 1] == null) {
                    field727[++Statics.field240 - 1] = "";
                } else {
                    field727[++Statics.field240 - 1] = var181.field2977[var180 - 1];
                }
                var178 = 1;
            } else if (arg0 == 4202) {
                Statics.field723 -= 2;
                int var182 = field720[Statics.field723];
                int var183 = field720[Statics.field723 + 1];
                class199 var184 = class199.method751(var182);
                if (var183 < 1 || var183 > 5 || var184.field2995[var183 - 1] == null) {
                    field727[++Statics.field240 - 1] = "";
                } else {
                    field727[++Statics.field240 - 1] = var184.field2995[var183 - 1];
                }
                var178 = 1;
            } else if (arg0 == 4203) {
                int var185 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = class199.method751(var185).field2968;
                var178 = 1;
            } else if (arg0 == 4204) {
                int var186 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = class199.method751(var186).field2974 == 1 ? 1 : 0;
                var178 = 1;
            } else if (arg0 == 4205) {
                int var187 = field720[--Statics.field723];
                class199 var188 = class199.method751(var187);
                if (var188.field2952 == -1 && var188.field2994 >= 0) {
                    field720[++Statics.field723 - 1] = var188.field2994;
                } else {
                    field720[++Statics.field723 - 1] = var187;
                }
                var178 = 1;
            } else if (arg0 == 4206) {
                int var189 = field720[--Statics.field723];
                class199 var190 = class199.method751(var189);
                if (var190.field2952 >= 0 && var190.field2994 >= 0) {
                    field720[++Statics.field723 - 1] = var190.field2994;
                } else {
                    field720[++Statics.field723 - 1] = var189;
                }
                var178 = 1;
            } else if (arg0 == 4207) {
                int var191 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = class199.method751(var191).field2976 ? 1 : 0;
                var178 = 1;
            } else if (arg0 == 4208) {
                int var192 = field720[--Statics.field723];
                class199 var193 = class199.method751(var192);
                if (var193.field2951 == -1 && var193.field3005 >= 0) {
                    field720[++Statics.field723 - 1] = var193.field3005;
                } else {
                    field720[++Statics.field723 - 1] = var192;
                }
                var178 = 1;
            } else if (arg0 == 4209) {
                int var194 = field720[--Statics.field723];
                class199 var195 = class199.method751(var194);
                if (var195.field2951 >= 0 && var195.field3005 >= 0) {
                    field720[++Statics.field723 - 1] = var195.field3005;
                } else {
                    field720[++Statics.field723 - 1] = var194;
                }
                var178 = 1;
            } else if (arg0 == 4210) {
                String var196 = field727[--Statics.field240];
                int var197 = field720[--Statics.field723];
                client.method2389(var196, var197 == 1);
                field720[++Statics.field723 - 1] = Statics.field1964;
                var178 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field1772 == null || Statics.field2676 >= Statics.field1964) {
                    field720[++Statics.field723 - 1] = -1;
                } else {
                    field720[++Statics.field723 - 1] = Statics.field1772[++Statics.field2676 - 1] & 0xFFFF;
                }
                var178 = 1;
            } else if (arg0 == 4212) {
                Statics.field2676 = 0;
                var178 = 1;
            } else {
                var178 = 2;
            }
            return var178;
        } else if (arg0 < 5100) {
            byte var198;
            if (arg0 == 5000) {
                field720[++Statics.field723 - 1] = client.field506;
                var198 = 1;
            } else if (arg0 == 5001) {
                Statics.field723 -= 3;
                client.field506 = field720[Statics.field723];
                Statics.field30 = class217.method799(field720[Statics.field723 + 1]);
                if (Statics.field30 == null) {
                    Statics.field30 = class217.field3179;
                }
                client.field473 = field720[Statics.field723 + 2];
                client.field417.method2920(36);
                client.field417.method2780(client.field506);
                client.field417.method2780(Statics.field30.field3180);
                client.field417.method2780(client.field473);
                var198 = 1;
            } else if (arg0 == 5002) {
                String var199 = field727[--Statics.field240];
                Statics.field723 -= 2;
                int var200 = field720[Statics.field723];
                int var201 = field720[Statics.field723 + 1];
                client.field417.method2920(71);
                client.field417.method2780(class154.method2198(var199) + 2);
                client.field417.method2764(var199);
                client.field417.method2780(var200 - 1);
                client.field417.method2780(var201);
                var198 = 1;
            } else if (arg0 == 5003) {
                Statics.field723 -= 2;
                int var202 = field720[Statics.field723];
                int var203 = field720[Statics.field723 + 1];
                class51 var204 = (class51) class48.field947.get(var202);
                class22 var205 = var204.method913(var203);
                if (var205 == null) {
                    field720[++Statics.field723 - 1] = -1;
                    field720[++Statics.field723 - 1] = 0;
                    field727[++Statics.field240 - 1] = "";
                    field727[++Statics.field240 - 1] = "";
                    field727[++Statics.field240 - 1] = "";
                } else {
                    field720[++Statics.field723 - 1] = var205.field237;
                    field720[++Statics.field723 - 1] = var205.field231;
                    field727[++Statics.field240 - 1] = var205.field233 == null ? "" : var205.field233;
                    field727[++Statics.field240 - 1] = var205.field230 == null ? "" : var205.field230;
                    field727[++Statics.field240 - 1] = var205.field235 == null ? "" : var205.field235;
                }
                var198 = 1;
            } else if (arg0 == 5004) {
                int var207 = field720[--Statics.field723];
                class22 var208 = (class22) class48.field942.method2229((long) var207);
                if (var208 == null) {
                    field720[++Statics.field723 - 1] = -1;
                    field720[++Statics.field723 - 1] = 0;
                    field727[++Statics.field240 - 1] = "";
                    field727[++Statics.field240 - 1] = "";
                    field727[++Statics.field240 - 1] = "";
                } else {
                    field720[++Statics.field723 - 1] = var208.field232;
                    field720[++Statics.field723 - 1] = var208.field231;
                    field727[++Statics.field240 - 1] = var208.field233 == null ? "" : var208.field233;
                    field727[++Statics.field240 - 1] = var208.field230 == null ? "" : var208.field230;
                    field727[++Statics.field240 - 1] = var208.field235 == null ? "" : var208.field235;
                }
                var198 = 1;
            } else if (arg0 == 5005) {
                if (Statics.field30 == null) {
                    field720[++Statics.field723 - 1] = -1;
                } else {
                    field720[++Statics.field723 - 1] = Statics.field30.field3180;
                }
                var198 = 1;
            } else if (arg0 == 5008) {
                String var210 = field727[--Statics.field240];
                int var211 = field720[--Statics.field723];
                String var212 = var210.toLowerCase();
                byte var213 = 0;
                if (var212.startsWith(class174.field2600)) {
                    var213 = 0;
                    var210 = var210.substring(class174.field2600.length());
                } else if (var212.startsWith(class174.field2536)) {
                    var213 = 1;
                    var210 = var210.substring(class174.field2536.length());
                } else if (var212.startsWith(class174.field2538)) {
                    var213 = 2;
                    var210 = var210.substring(class174.field2538.length());
                } else if (var212.startsWith(class174.field2363)) {
                    var213 = 3;
                    var210 = var210.substring(class174.field2363.length());
                } else if (var212.startsWith(class174.field2542)) {
                    var213 = 4;
                    var210 = var210.substring(class174.field2542.length());
                } else if (var212.startsWith(class174.field2379)) {
                    var213 = 5;
                    var210 = var210.substring(class174.field2379.length());
                } else if (var212.startsWith(class174.field2546)) {
                    var213 = 6;
                    var210 = var210.substring(class174.field2546.length());
                } else if (var212.startsWith(class174.field2636)) {
                    var213 = 7;
                    var210 = var210.substring(class174.field2636.length());
                } else if (var212.startsWith(class174.field2550)) {
                    var213 = 8;
                    var210 = var210.substring(class174.field2550.length());
                } else if (var212.startsWith(class174.field2552)) {
                    var213 = 9;
                    var210 = var210.substring(class174.field2552.length());
                } else if (var212.startsWith(class174.field2366)) {
                    var213 = 10;
                    var210 = var210.substring(class174.field2366.length());
                } else if (var212.startsWith(class174.field2512)) {
                    var213 = 11;
                    var210 = var210.substring(class174.field2512.length());
                } else if (client.field314 != 0) {
                    if (var212.startsWith(class174.field2535)) {
                        var213 = 0;
                        var210 = var210.substring(class174.field2535.length());
                    } else if (var212.startsWith(class174.field2537)) {
                        var213 = 1;
                        var210 = var210.substring(class174.field2537.length());
                    } else if (var212.startsWith(class174.field2416)) {
                        var213 = 2;
                        var210 = var210.substring(class174.field2416.length());
                    } else if (var212.startsWith(class174.field2475)) {
                        var213 = 3;
                        var210 = var210.substring(class174.field2475.length());
                    } else if (var212.startsWith(class174.field2543)) {
                        var213 = 4;
                        var210 = var210.substring(class174.field2543.length());
                    } else if (var212.startsWith(class174.field2545)) {
                        var213 = 5;
                        var210 = var210.substring(class174.field2545.length());
                    } else if (var212.startsWith(class174.field2488)) {
                        var213 = 6;
                        var210 = var210.substring(class174.field2488.length());
                    } else if (var212.startsWith(class174.field2549)) {
                        var213 = 7;
                        var210 = var210.substring(class174.field2549.length());
                    } else if (var212.startsWith(class174.field2551)) {
                        var213 = 8;
                        var210 = var210.substring(class174.field2551.length());
                    } else if (var212.startsWith(class174.field2553)) {
                        var213 = 9;
                        var210 = var210.substring(class174.field2553.length());
                    } else if (var212.startsWith(class174.field2555)) {
                        var213 = 10;
                        var210 = var210.substring(class174.field2555.length());
                    } else if (var212.startsWith(class174.field2557)) {
                        var213 = 11;
                        var210 = var210.substring(class174.field2557.length());
                    }
                }
                String var214 = var210.toLowerCase();
                byte var215 = 0;
                if (var214.startsWith(class174.field2558)) {
                    var215 = 1;
                    var210 = var210.substring(class174.field2558.length());
                } else if (var214.startsWith(class174.field2560)) {
                    var215 = 2;
                    var210 = var210.substring(class174.field2560.length());
                } else if (var214.startsWith(class174.field2562)) {
                    var215 = 3;
                    var210 = var210.substring(class174.field2562.length());
                } else if (var214.startsWith(class174.field2564)) {
                    var215 = 4;
                    var210 = var210.substring(class174.field2564.length());
                } else if (var214.startsWith(class174.field2566)) {
                    var215 = 5;
                    var210 = var210.substring(class174.field2566.length());
                } else if (client.field314 != 0) {
                    if (var214.startsWith(class174.field2559)) {
                        var215 = 1;
                        var210 = var210.substring(class174.field2559.length());
                    } else if (var214.startsWith(class174.field2561)) {
                        var215 = 2;
                        var210 = var210.substring(class174.field2561.length());
                    } else if (var214.startsWith(class174.field2563)) {
                        var215 = 3;
                        var210 = var210.substring(class174.field2563.length());
                    } else if (var214.startsWith(class174.field2436)) {
                        var215 = 4;
                        var210 = var210.substring(class174.field2436.length());
                    } else if (var214.startsWith(class174.field2567)) {
                        var215 = 5;
                        var210 = var210.substring(class174.field2567.length());
                    }
                }
                client.field417.method2920(59);
                client.field417.method2780(0);
                int var216 = client.field417.field2079;
                client.field417.method2780(var211);
                client.field417.method2780(var213);
                client.field417.method2780(var215);
                class211.method1499(client.field417, var210);
                client.field417.method2657(client.field417.field2079 - var216);
                var198 = 1;
            } else if (arg0 == 5009) {
                Statics.field240 -= 2;
                String var217 = field727[Statics.field240];
                String var218 = field727[Statics.field240 + 1];
                client.field417.method2920(137);
                client.field417.method2793(0);
                int var219 = client.field417.field2079;
                client.field417.method2764(var217);
                class211.method1499(client.field417, var218);
                client.field417.method2665(client.field417.field2079 - var219);
                var198 = 1;
            } else if (arg0 == 5015) {
                String var220;
                if (Statics.field685 == null || Statics.field685.field267 == null) {
                    var220 = "";
                } else {
                    var220 = Statics.field685.field267;
                }
                field727[++Statics.field240 - 1] = var220;
                var198 = 1;
            } else if (arg0 == 5016) {
                field720[++Statics.field723 - 1] = client.field473;
                var198 = 1;
            } else if (arg0 == 5017) {
                int var221 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = class48.method2643(var221);
                var198 = 1;
            } else if (arg0 == 5018) {
                int var222 = field720[--Statics.field723];
                field720[++Statics.field723 - 1] = class48.method728(var222);
                var198 = 1;
            } else if (arg0 == 5019) {
                int var223 = field720[--Statics.field723];
                int[] var224 = field720;
                int var225 = ++Statics.field723 - 1;
                class22 var226 = (class22) class48.field942.method2229((long) var223);
                int var227;
                if (var226 == null) {
                    var227 = -1;
                } else if (class48.field943.field1884 == var226.field1869) {
                    var227 = -1;
                } else {
                    var227 = ((class22) var226.field1869).field237;
                }
                var224[var225] = var227;
                var198 = 1;
            } else if (arg0 == 5020) {
                String var228 = field727[--Statics.field240];
                if (var228.equalsIgnoreCase("toggleroof")) {
                    Statics.field2073.field687 = !Statics.field2073.field687;
                    class31.method1576();
                    if (Statics.field2073.field687) {
                        class48.method3031(99, "", "Roofs are now all hidden");
                    } else {
                        class48.method3031(99, "", "Roofs will only be removed selectively");
                    }
                }
                if (var228.equalsIgnoreCase("displayfps")) {
                    client.field303 = !client.field303;
                }
                if (client.field507 >= 2) {
                    if (var228.equalsIgnoreCase("fpson")) {
                        client.field303 = true;
                    }
                    if (var228.equalsIgnoreCase("fpsoff")) {
                        client.field303 = false;
                    }
                    if (var228.equalsIgnoreCase("gc")) {
                        System.gc();
                    }
                    if (var228.equalsIgnoreCase("clientdrop")) {
                        client.method3631();
                    }
                    if (var228.equalsIgnoreCase("errortest") && client.field562 == 2) {
                        throw new RuntimeException();
                    }
                }
                client.field417.method2920(128);
                client.field417.method2780(var228.length() + 1);
                client.field417.method2764(var228);
                var198 = 1;
            } else if (arg0 == 5021) {
                client.field413 = field727[--Statics.field240].toLowerCase().trim();
                var198 = 1;
            } else if (arg0 == 5022) {
                field727[++Statics.field240 - 1] = client.field413;
                var198 = 1;
            } else {
                var198 = 2;
            }
            return var198;
        } else if (arg0 < 5400) {
            byte var229;
            if (arg0 == 5306) {
                field720[++Statics.field723 - 1] = client.method3091();
                var229 = 1;
            } else if (arg0 == 5307) {
                int var230 = field720[--Statics.field723];
                if (var230 == 1 || var230 == 2) {
                    client.method2949(var230);
                }
                var229 = 1;
            } else if (arg0 == 5308) {
                field720[++Statics.field723 - 1] = Statics.field2073.field698;
                var229 = 1;
            } else if (arg0 == 5309) {
                int var231 = field720[--Statics.field723];
                if (var231 == 1 || var231 == 2) {
                    Statics.field2073.field698 = var231;
                    class31.method1576();
                }
                var229 = 1;
            } else {
                var229 = 2;
            }
            return var229;
        } else if (arg0 < 5600) {
            byte var237;
            if (arg0 == 5504) {
                Statics.field723 -= 2;
                int var235 = field720[Statics.field723];
                int var236 = field720[Statics.field723 + 1];
                if (!client.field565) {
                    client.field371 = var235;
                    client.field468 = var236;
                }
                var237 = 1;
            } else if (arg0 == 5505) {
                field720[++Statics.field723 - 1] = client.field371;
                var237 = 1;
            } else if (arg0 == 5506) {
                field720[++Statics.field723 - 1] = client.field468;
                var237 = 1;
            } else if (arg0 == 5530) {
                int var238 = field720[--Statics.field723];
                if (var238 < 0) {
                    var238 = 0;
                }
                client.field450 = var238;
                var237 = 1;
            } else if (arg0 == 5531) {
                field720[++Statics.field723 - 1] = client.field450;
                var237 = 1;
            } else {
                var237 = 2;
            }
            return var237;
        } else if (arg0 < 5700) {
            byte var239;
            if (arg0 == 5630) {
                client.field483 = 250;
                var239 = 1;
            } else {
                var239 = 2;
            }
            return var239;
        } else if (arg0 < 6300) {
            return method714(arg0, arg1, arg2);
        } else if (arg0 >= 6600) {
            return 2;
        } else {
            byte var240;
            if (arg0 == 6500) {
                field720[++Statics.field723 - 1] = class30.method604() ? 1 : 0;
                var240 = 1;
            } else if (arg0 == 6501) {
                class30 var241 = class30.method3293();
                if (var241 == null) {
                    field720[++Statics.field723 - 1] = -1;
                    field720[++Statics.field723 - 1] = 0;
                    field727[++Statics.field240 - 1] = "";
                    field720[++Statics.field723 - 1] = 0;
                    field720[++Statics.field723 - 1] = 0;
                    field727[++Statics.field240 - 1] = "";
                } else {
                    field720[++Statics.field723 - 1] = var241.field676;
                    field720[++Statics.field723 - 1] = var241.field677;
                    field727[++Statics.field240 - 1] = var241.field680;
                    field720[++Statics.field723 - 1] = var241.field668;
                    field720[++Statics.field723 - 1] = var241.field669;
                    field727[++Statics.field240 - 1] = var241.field679;
                }
                var240 = 1;
            } else if (arg0 == 6502) {
                class30 var242;
                if (class30.field673 < class30.field671) {
                    var242 = Statics.field61[++class30.field673 - 1];
                } else {
                    var242 = null;
                }
                if (var242 == null) {
                    field720[++Statics.field723 - 1] = -1;
                    field720[++Statics.field723 - 1] = 0;
                    field727[++Statics.field240 - 1] = "";
                    field720[++Statics.field723 - 1] = 0;
                    field720[++Statics.field723 - 1] = 0;
                    field727[++Statics.field240 - 1] = "";
                } else {
                    field720[++Statics.field723 - 1] = var242.field676;
                    field720[++Statics.field723 - 1] = var242.field677;
                    field727[++Statics.field240 - 1] = var242.field680;
                    field720[++Statics.field723 - 1] = var242.field668;
                    field720[++Statics.field723 - 1] = var242.field669;
                    field727[++Statics.field240 - 1] = var242.field679;
                }
                var240 = 1;
            } else if (arg0 == 6506) {
                int var244 = field720[--Statics.field723];
                class30 var245 = null;
                for (int var246 = 0; var246 < class30.field671; var246++) {
                    if (Statics.field61[var246].field676 == var244) {
                        var245 = Statics.field61[var246];
                        break;
                    }
                }
                if (var245 == null) {
                    field720[++Statics.field723 - 1] = -1;
                    field720[++Statics.field723 - 1] = 0;
                    field727[++Statics.field240 - 1] = "";
                    field720[++Statics.field723 - 1] = 0;
                    field720[++Statics.field723 - 1] = 0;
                    field727[++Statics.field240 - 1] = "";
                } else {
                    field720[++Statics.field723 - 1] = var245.field676;
                    field720[++Statics.field723 - 1] = var245.field677;
                    field727[++Statics.field240 - 1] = var245.field680;
                    field720[++Statics.field723 - 1] = var245.field668;
                    field720[++Statics.field723 - 1] = var245.field669;
                    field727[++Statics.field240 - 1] = var245.field679;
                }
                var240 = 1;
            } else if (arg0 == 6507) {
                Statics.field723 -= 4;
                int var247 = field720[Statics.field723];
                boolean var248 = field720[Statics.field723 + 1] == 1;
                int var249 = field720[Statics.field723 + 2];
                boolean var250 = field720[Statics.field723 + 3] == 1;
                if (Statics.field61 != null) {
                    class30.method28(0, Statics.field61.length - 1, var247, var248, var249, var250);
                }
                var240 = 1;
            } else if (arg0 == 6511) {
                int var251 = field720[--Statics.field723];
                if (var251 >= 0 && var251 < class30.field671) {
                    class30 var252 = Statics.field61[var251];
                    field720[++Statics.field723 - 1] = var252.field676;
                    field720[++Statics.field723 - 1] = var252.field677;
                    field727[++Statics.field240 - 1] = var252.field680;
                    field720[++Statics.field723 - 1] = var252.field668;
                    field720[++Statics.field723 - 1] = var252.field669;
                    field727[++Statics.field240 - 1] = var252.field679;
                } else {
                    field720[++Statics.field723 - 1] = -1;
                    field720[++Statics.field723 - 1] = 0;
                    field727[++Statics.field240 - 1] = "";
                    field720[++Statics.field723 - 1] = 0;
                    field720[++Statics.field723 - 1] = 0;
                    field727[++Statics.field240 - 1] = "";
                }
                var240 = 1;
            } else if (arg0 == 6512) {
                client.field434 = field720[--Statics.field723] == 1;
                var240 = 1;
            } else {
                var240 = 2;
            }
            return var240;
        }
    }

    @ObfuscatedName("c.l(ILad;ZI)I")
    public static int method32(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field723 -= 3;
            int var3 = field720[Statics.field723];
            int var4 = field720[Statics.field723 + 1];
            int var5 = field720[Statics.field723 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class170 var6 = Statics.method211(var3);
            if (var6.field2312 == null) {
                var6.field2312 = new class170[var5 + 1];
            }
            if (var6.field2312.length <= var5) {
                class170[] var7 = new class170[var5 + 1];
                for (int var8 = 0; var8 < var6.field2312.length; var8++) {
                    var7[var8] = var6.field2312[var8];
                }
                var6.field2312 = var7;
            }
            if (var5 > 0 && var6.field2312[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class170 var9 = new class170();
            var9.field2203 = var4;
            var9.field2220 = var9.field2201 = var6.field2201;
            var9.field2278 = var5;
            var9.field2200 = true;
            var6.field2312[var5] = var9;
            if (arg2) {
                Statics.field769 = var9;
            } else {
                Statics.field733 = var9;
            }
            client.method1858(var6);
            return 1;
        } else if (arg0 == 101) {
            class170 var10 = arg2 ? Statics.field769 : Statics.field733;
            class170 var11 = Statics.method211(var10.field2201);
            var11.field2312[var10.field2278] = null;
            client.method1858(var11);
            return 1;
        } else if (arg0 == 102) {
            class170 var12 = Statics.method211(field720[--Statics.field723]);
            var12.field2312 = null;
            client.method1858(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field723 -= 2;
            int var13 = field720[Statics.field723];
            int var14 = field720[Statics.field723 + 1];
            class170 var15 = class170.method1407(var13, var14);
            if (var15 == null || var14 == -1) {
                field720[++Statics.field723 - 1] = 0;
            } else {
                field720[++Statics.field723 - 1] = 1;
                if (arg2) {
                    Statics.field769 = var15;
                } else {
                    Statics.field733 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class170 var16 = Statics.method211(field720[--Statics.field723]);
            if (var16 == null) {
                field720[++Statics.field723 - 1] = 0;
            } else {
                field720[++Statics.field723 - 1] = 1;
                if (arg2) {
                    Statics.field769 = var16;
                } else {
                    Statics.field733 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eu.y(ILad;ZB)I")
    public static int method2601(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field720[--Statics.field723];
            var4 = Statics.method211(var3);
        } else {
            var4 = arg2 ? Statics.field769 : Statics.field733;
        }
        if (arg0 == 1000) {
            Statics.field723 -= 4;
            var4.field2315 = field720[Statics.field723];
            var4.field2211 = field720[Statics.field723 + 1];
            var4.field2206 = field720[Statics.field723 + 2];
            var4.field2207 = field720[Statics.field723 + 3];
            client.method1858(var4);
            Statics.method195(var4);
            if (var3 != -1 && var4.field2203 == 0) {
                client.method61(Statics.field2329[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field723 -= 4;
            var4.field2212 = field720[Statics.field723];
            var4.field2213 = field720[Statics.field723 + 1];
            var4.field2319 = field720[Statics.field723 + 2];
            var4.field2323 = field720[Statics.field723 + 3];
            client.method1858(var4);
            Statics.method195(var4);
            if (var3 != -1 && var4.field2203 == 0) {
                client.method61(Statics.field2329[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field720[--Statics.field723] == 1;
            if (var4.field2221 != var5) {
                var4.field2221 = var5;
                client.method1858(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2293 = field720[--Statics.field723] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2334 = field720[--Statics.field723] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.j(ILad;ZI)I")
    public static int method63(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field720[--Statics.field723];
            var4 = Statics.method211(var3);
        } else {
            var4 = arg2 ? Statics.field769 : Statics.field733;
        }
        if (arg0 == 1100) {
            Statics.field723 -= 2;
            var4.field2265 = field720[Statics.field723];
            if (var4.field2265 > var4.field2224 - var4.field2216) {
                var4.field2265 = var4.field2224 - var4.field2216;
            }
            if (var4.field2265 < 0) {
                var4.field2265 = 0;
            }
            var4.field2223 = field720[Statics.field723 + 1];
            if (var4.field2223 > var4.field2225 - var4.field2217) {
                var4.field2223 = var4.field2225 - var4.field2217;
            }
            if (var4.field2223 < 0) {
                var4.field2223 = 0;
            }
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2226 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2230 = field720[--Statics.field723] == 1;
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2222 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2234 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2236 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2210 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2239 = field720[--Statics.field723] == 1;
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2244 = 1;
            var4.field2332 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field723 -= 6;
            var4.field2250 = field720[Statics.field723];
            var4.field2251 = field720[Statics.field723 + 1];
            var4.field2305 = field720[Statics.field723 + 2];
            var4.field2277 = field720[Statics.field723 + 3];
            var4.field2199 = field720[Statics.field723 + 4];
            var4.field2255 = field720[Statics.field723 + 5];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field720[--Statics.field723];
            if (var4.field2248 != var5) {
                var4.field2248 = var5;
                var4.field2192 = 0;
                var4.field2195 = 0;
                client.method1858(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2316 = field720[--Statics.field723] == 1;
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field727[--Statics.field240];
            if (!var6.equals(var4.field2261)) {
                var4.field2261 = var6;
                client.method1858(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2232 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field723 -= 3;
            var4.field2264 = field720[Statics.field723];
            var4.field2328 = field720[Statics.field723 + 1];
            var4.field2263 = field720[Statics.field723 + 2];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2266 = field720[--Statics.field723] == 1;
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2240 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2241 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2252 = field720[--Statics.field723] == 1;
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2243 = field720[--Statics.field723] == 1;
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field723 -= 2;
            var4.field2224 = field720[Statics.field723];
            var4.field2225 = field720[Statics.field723 + 1];
            client.method1858(var4);
            if (var3 != -1 && var4.field2203 == 0) {
                client.method61(Statics.field2329[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2201;
            int var8 = var4.field2278;
            client.field417.method2920(3);
            client.field417.method2703(var8);
            client.field417.method2832(var7);
            client.field452 = var4;
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2237 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2227 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2233 = field720[--Statics.field723];
            client.method1858(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var9 = field720[--Statics.field723];
            class222 var10 = (class222) class149.method1841(class222.method898(), var9);
            if (var10 != null) {
                var4.field2335 = var10;
                client.method1858(var4);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("v.t(ILad;ZI)I")
    public static int method191(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method211(field720[--Statics.field723]);
        } else {
            var3 = arg2 ? Statics.field769 : Statics.field733;
        }
        client.method1858(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field723 -= 2;
            int var4 = field720[Statics.field723];
            int var5 = field720[Statics.field723 + 1];
            var3.field2202 = var4;
            var3.field2322 = var5;
            class199 var6 = class199.method751(var4);
            var3.field2305 = var6.field2993;
            var3.field2277 = var6.field2975;
            var3.field2199 = var6.field3002;
            var3.field2250 = var6.field2972;
            var3.field2251 = var6.field2973;
            var3.field2255 = var6.field2971;
            if (arg0 == 1205) {
                var3.field2288 = 0;
            } else if (arg0 == 1212 | var6.field2974 == 1) {
                var3.field2288 = 1;
            } else {
                var3.field2288 = 2;
            }
            if (var3.field2256 > 0) {
                var3.field2255 = var3.field2255 * 32 / var3.field2256;
            } else if (var3.field2212 > 0) {
                var3.field2255 = var3.field2255 * 32 / var3.field2212;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2244 = 2;
            var3.field2332 = field720[--Statics.field723];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2244 = 3;
            var3.field2332 = Statics.field685.field246.method3012();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("de.k(ILad;ZS)I")
    public static int method1937(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method211(field720[--Statics.field723]);
        } else {
            var3 = arg2 ? Statics.field769 : Statics.field733;
        }
        if (arg0 == 1300) {
            int var4 = field720[--Statics.field723] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3053(var4, field727[--Statics.field240]);
                return 1;
            } else {
                Statics.field240--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field723 -= 2;
            int var5 = field720[Statics.field723];
            int var6 = field720[Statics.field723 + 1];
            var3.field2242 = class170.method1407(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2279 = field720[--Statics.field723] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2259 = field720[--Statics.field723];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2267 = field720[--Statics.field723];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2274 = field727[--Statics.field240];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2280 = field727[--Statics.field240];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2311 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.f(ILad;ZI)I")
    public static int method171(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method211(field720[--Statics.field723]);
        } else {
            var3 = arg2 ? Statics.field769 : Statics.field733;
        }
        String var4 = field727[--Statics.field240];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field720[--Statics.field723];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field720[--Statics.field723];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field727[--Statics.field240];
            } else {
                var7[var8] = Integer.valueOf(field720[--Statics.field723]);
            }
        }
        int var9 = field720[--Statics.field723];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2283 = var7;
        } else if (arg0 == 1401) {
            var3.field2286 = var7;
        } else if (arg0 == 1402) {
            var3.field2285 = var7;
        } else if (arg0 == 1403) {
            var3.field2287 = var7;
        } else if (arg0 == 1404) {
            var3.field2289 = var7;
        } else if (arg0 == 1405) {
            var3.field2290 = var7;
        } else if (arg0 == 1406) {
            var3.field2258 = var7;
        } else if (arg0 == 1407) {
            var3.field2190 = var7;
            var3.field2295 = var5;
        } else if (arg0 == 1408) {
            var3.field2294 = var7;
        } else if (arg0 == 1409) {
            var3.field2301 = var7;
        } else if (arg0 == 1410) {
            var3.field2291 = var7;
        } else if (arg0 == 1411) {
            var3.field2260 = var7;
        } else if (arg0 == 1412) {
            var3.field2214 = var7;
        } else if (arg0 == 1414) {
            var3.field2296 = var7;
            var3.field2297 = var5;
        } else if (arg0 == 1415) {
            var3.field2238 = var7;
            var3.field2299 = var5;
        } else if (arg0 == 1416) {
            var3.field2292 = var7;
        } else if (arg0 == 1417) {
            var3.field2325 = var7;
        } else if (arg0 == 1418) {
            var3.field2303 = var7;
        } else if (arg0 == 1419) {
            var3.field2304 = var7;
        } else if (arg0 == 1420) {
            var3.field2321 = var7;
        } else if (arg0 == 1421) {
            var3.field2306 = var7;
        } else if (arg0 == 1422) {
            var3.field2307 = var7;
        } else if (arg0 == 1423) {
            var3.field2308 = var7;
        } else if (arg0 == 1424) {
            var3.field2309 = var7;
        } else if (arg0 == 1425) {
            var3.field2254 = var7;
        } else if (arg0 == 1426) {
            var3.field2196 = var7;
        } else if (arg0 == 1427) {
            var3.field2310 = var7;
        } else {
            return 2;
        }
        var3.field2281 = true;
        return 1;
    }

    @ObfuscatedName("fl.a(ILad;ZI)I")
    public static int method2993(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = arg2 ? Statics.field769 : Statics.field733;
        if (arg0 == 1500) {
            field720[++Statics.field723 - 1] = var3.field2229;
            return 1;
        } else if (arg0 == 1501) {
            field720[++Statics.field723 - 1] = var3.field2300;
            return 1;
        } else if (arg0 == 1502) {
            field720[++Statics.field723 - 1] = var3.field2216;
            return 1;
        } else if (arg0 == 1503) {
            field720[++Statics.field723 - 1] = var3.field2217;
            return 1;
        } else if (arg0 == 1504) {
            field720[++Statics.field723 - 1] = var3.field2221 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field720[++Statics.field723 - 1] = var3.field2220;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cv.v(ILad;ZB)I")
    public static int method1838(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method211(field720[--Statics.field723]);
        } else {
            var3 = arg2 ? Statics.field769 : Statics.field733;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field722 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2310 == null) {
            return 0;
        } else {
            class19 var4 = new class19();
            var4.field214 = var3;
            var4.field203 = var3.field2310;
            var4.field209 = field722 + 1;
            client.field487.method2308(var4);
            return 1;
        }
    }

    @ObfuscatedName("ca.d(ILad;ZI)I")
    public static int method1643(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = Statics.method211(field720[--Statics.field723]);
        if (arg0 == 2500) {
            field720[++Statics.field723 - 1] = var3.field2229;
            return 1;
        } else if (arg0 == 2501) {
            field720[++Statics.field723 - 1] = var3.field2300;
            return 1;
        } else if (arg0 == 2502) {
            field720[++Statics.field723 - 1] = var3.field2216;
            return 1;
        } else if (arg0 == 2503) {
            field720[++Statics.field723 - 1] = var3.field2217;
            return 1;
        } else if (arg0 == 2504) {
            field720[++Statics.field723 - 1] = var3.field2221 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field720[++Statics.field723 - 1] = var3.field2220;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.o(ILad;ZI)I")
    public static int method192(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field720[++Statics.field723 - 1] = client.field489;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field723 -= 2;
            int var3 = field720[Statics.field723];
            int var4 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = Statics.method210(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field723 -= 2;
            int var5 = field720[Statics.field723];
            int var6 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = class13.method2110(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field723 -= 2;
            int var7 = field720[Statics.field723];
            int var8 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = class13.method186(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field720[--Statics.field723];
            field720[++Statics.field723 - 1] = Statics.method1896(var9).field2775;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field720[--Statics.field723];
            field720[++Statics.field723 - 1] = client.field546[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field720[--Statics.field723];
            field720[++Statics.field723 - 1] = client.field508[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field720[--Statics.field723];
            field720[++Statics.field723 - 1] = client.field424[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field967;
            int var14 = (Statics.field685.field610 >> 7) + Statics.field19;
            int var15 = (Statics.field685.field609 >> 7) + Statics.field341;
            field720[++Statics.field723 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field720[--Statics.field723];
            field720[++Statics.field723 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field720[--Statics.field723];
            field720[++Statics.field723 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field720[--Statics.field723];
            field720[++Statics.field723 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field720[++Statics.field723 - 1] = client.field356 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field723 -= 2;
            int var19 = field720[Statics.field723] + 32768;
            int var20 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = Statics.method210(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field723 -= 2;
            int var21 = field720[Statics.field723] + 32768;
            int var22 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = class13.method2110(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field723 -= 2;
            int var23 = field720[Statics.field723] + 32768;
            int var24 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = class13.method186(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field507 >= 2) {
                field720[++Statics.field723 - 1] = client.field507;
            } else {
                field720[++Statics.field723 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field720[++Statics.field723 - 1] = client.field304;
            return 1;
        } else if (arg0 == 3318) {
            field720[++Statics.field723 - 1] = client.field287;
            return 1;
        } else if (arg0 == 3321) {
            field720[++Statics.field723 - 1] = client.field453;
            return 1;
        } else if (arg0 == 3322) {
            field720[++Statics.field723 - 1] = client.field454;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field440) {
                field720[++Statics.field723 - 1] = 1;
            } else {
                field720[++Statics.field723 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field720[++Statics.field723 - 1] = client.field288;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.q(ILad;ZI)I")
    public static int method808(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field723 -= 2;
            int var3 = field720[Statics.field723];
            int var4 = field720[Statics.field723 + 1];
            class196 var5 = (class196) class196.field2869.method2246((long) var3);
            class196 var6;
            if (var5 == null) {
                byte[] var7 = Statics.field2870.method3126(8, var3);
                class196 var8 = new class196();
                if (var7 != null) {
                    var8.method3389(new class154(var7));
                }
                class196.field2869.method2250(var8, (long) var3);
                var6 = var8;
            } else {
                var6 = var5;
            }
            class196 var9 = var6;
            if (var6.field2864 != 's') {
            }
            for (int var10 = 0; var10 < var9.field2865; var10++) {
                if (var9.field2871[var10] == var4) {
                    field727[++Statics.field240 - 1] = var9.field2867[var10];
                    var9 = null;
                    break;
                }
            }
            if (var9 != null) {
                field727[++Statics.field240 - 1] = var9.field2868;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field723 -= 4;
            int var11 = field720[Statics.field723];
            int var12 = field720[Statics.field723 + 1];
            int var13 = field720[Statics.field723 + 2];
            int var14 = field720[Statics.field723 + 3];
            class196 var15 = (class196) class196.field2869.method2246((long) var13);
            class196 var16;
            if (var15 == null) {
                byte[] var17 = Statics.field2870.method3126(8, var13);
                class196 var18 = new class196();
                if (var17 != null) {
                    var18.method3389(new class154(var17));
                }
                class196.field2869.method2250(var18, (long) var13);
                var16 = var18;
            } else {
                var16 = var15;
            }
            class196 var19 = var16;
            if (var16.field2866 != var11 || var16.field2864 != var12) {
                if (var12 == 115) {
                    field727[++Statics.field240 - 1] = "null";
                } else {
                    field720[++Statics.field723 - 1] = 0;
                }
                return 1;
            }
            for (int var20 = 0; var20 < var19.field2865; var20++) {
                if (var19.field2871[var20] == var14) {
                    if (var12 == 115) {
                        field727[++Statics.field240 - 1] = var19.field2867[var20];
                    } else {
                        field720[++Statics.field723 - 1] = var19.field2872[var20];
                    }
                    var19 = null;
                    break;
                }
            }
            if (var19 != null) {
                if (var12 == 115) {
                    field727[++Statics.field240 - 1] = var19.field2868;
                } else {
                    field720[++Statics.field723 - 1] = var19.field2873;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.x(ILad;ZB)I")
    public static int method201(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field723 -= 2;
            int var3 = field720[Statics.field723];
            int var4 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field723 -= 2;
            int var5 = field720[Statics.field723];
            int var6 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field723 -= 2;
            int var7 = field720[Statics.field723];
            int var8 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field723 -= 2;
            int var9 = field720[Statics.field723];
            int var10 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field720[--Statics.field723];
            field720[++Statics.field723 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field720[--Statics.field723];
            field720[++Statics.field723 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field723 -= 5;
            int var13 = field720[Statics.field723];
            int var14 = field720[Statics.field723 + 1];
            int var15 = field720[Statics.field723 + 2];
            int var16 = field720[Statics.field723 + 3];
            int var17 = field720[Statics.field723 + 4];
            field720[++Statics.field723 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field723 -= 2;
            int var18 = field720[Statics.field723];
            int var19 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field723 -= 2;
            int var20 = field720[Statics.field723];
            int var21 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field723 -= 2;
            int var22 = field720[Statics.field723];
            int var23 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field723 -= 2;
            int var24 = field720[Statics.field723];
            int var25 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field723 -= 2;
            int var26 = field720[Statics.field723];
            int var27 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field723 -= 2;
            int var28 = field720[Statics.field723];
            int var29 = field720[Statics.field723 + 1];
            if (var28 == 0) {
                field720[++Statics.field723 - 1] = 0;
            } else {
                field720[++Statics.field723 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field723 -= 2;
            int var30 = field720[Statics.field723];
            int var31 = field720[Statics.field723 + 1];
            if (var30 == 0) {
                field720[++Statics.field723 - 1] = 0;
            } else if (var31 == 0) {
                field720[++Statics.field723 - 1] = Integer.MAX_VALUE;
            } else {
                field720[++Statics.field723 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field723 -= 2;
            int var32 = field720[Statics.field723];
            int var33 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field723 -= 2;
            int var34 = field720[Statics.field723];
            int var35 = field720[Statics.field723 + 1];
            field720[++Statics.field723 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field723 -= 3;
            long var36 = (long) field720[Statics.field723];
            long var38 = (long) field720[Statics.field723 + 1];
            long var40 = (long) field720[Statics.field723 + 2];
            field720[++Statics.field723 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("at.z(ILad;ZB)I")
    public static int method714(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field723 -= 2;
            client.field542 = (short) field720[Statics.field723];
            if (client.field542 <= 0) {
                client.field542 = 256;
            }
            client.field397 = (short) field720[Statics.field723 + 1];
            if (client.field397 <= 0) {
                client.field397 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field723 -= 2;
            client.field544 = (short) field720[Statics.field723];
            if (client.field544 <= 0) {
                client.field544 = 256;
            }
            client.field545 = (short) field720[Statics.field723 + 1];
            if (client.field545 <= 0) {
                client.field545 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field723 -= 4;
            client.field457 = (short) field720[Statics.field723];
            if (client.field457 <= 0) {
                client.field457 = 1;
            }
            client.field547 = (short) field720[Statics.field723 + 1];
            if (client.field547 <= 0) {
                client.field547 = 32767;
            } else if (client.field547 < client.field457) {
                client.field547 = client.field457;
            }
            client.field548 = (short) field720[Statics.field723 + 2];
            if (client.field548 <= 0) {
                client.field548 = 1;
            }
            client.field549 = (short) field720[Statics.field723 + 3];
            if (client.field549 <= 0) {
                client.field549 = 32767;
            } else if (client.field549 < client.field548) {
                client.field549 = client.field548;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field455 == null) {
                field720[++Statics.field723 - 1] = -1;
                field720[++Statics.field723 - 1] = -1;
            } else {
                client.method840(0, 0, client.field455.field2216, client.field455.field2217, false);
                field720[++Statics.field723 - 1] = client.field552;
                field720[++Statics.field723 - 1] = client.field553;
            }
            return 1;
        } else if (arg0 == 6204) {
            field720[++Statics.field723 - 1] = client.field544;
            field720[++Statics.field723 - 1] = client.field545;
            return 1;
        } else if (arg0 == 6205) {
            field720[++Statics.field723 - 1] = client.field542;
            field720[++Statics.field723 - 1] = client.field397;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("j.n(II)V")
    public static void method75(int arg0) {
        if (arg0 == -1 || !class170.method1498(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2329[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3.field2282 != null) {
                class19 var4 = new class19();
                var4.field214 = var3;
                var4.field203 = var3.field2282;
                method2399(var4, 2000000);
            }
        }
    }
}
