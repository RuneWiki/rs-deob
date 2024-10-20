package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aq")
public class class33 {

    @ObfuscatedName("aq.y")
    public static int[] field725 = new int[5];

    @ObfuscatedName("aq.p")
    public static int[][] field728 = new int[5][5000];

    @ObfuscatedName("aq.j")
    public static int[] field727 = new int[1000];

    @ObfuscatedName("aq.a")
    public static String[] field729 = new String[1000];

    @ObfuscatedName("aq.s")
    public static int field730 = 0;

    @ObfuscatedName("aq.k")
    public static class12[] field726 = new class12[50];

    @ObfuscatedName("aq.q")
    public static Calendar field733 = Calendar.getInstance();

    @ObfuscatedName("aq.c")
    public static final String[] field734 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("aq.b")
    public static int field731 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.x(Ll;B)V")
    public static void method815(class19 arg0) {
        method3644(arg0, 200000);
    }

    @ObfuscatedName("gl.n(Ll;II)V")
    public static void method3644(class19 arg0, int arg1) {
        Object[] var2 = arg0.field197;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method692(var3);
        if (var4 == null) {
            return;
        }
        Statics.field736 = 0;
        Statics.field695 = 0;
        int var5 = -1;
        int[] var6 = var4.field953;
        int[] var7 = var4.field958;
        byte var8 = -1;
        field730 = 0;
        try {
            Statics.field721 = new int[var4.field956];
            int var9 = 0;
            Statics.field724 = new String[var4.field957];
            int var10 = 0;
            for (int var11 = 1; var11 < var2.length; var11++) {
                if (var2[var11] instanceof Integer) {
                    int var12 = (Integer) var2[var11];
                    if (var12 == -2147483647) {
                        var12 = arg0.field190;
                    }
                    if (var12 == -2147483646) {
                        var12 = arg0.field191;
                    }
                    if (var12 == -2147483645) {
                        var12 = arg0.field189 == null ? -1 : arg0.field189.field2207;
                    }
                    if (var12 == -2147483644) {
                        var12 = arg0.field192;
                    }
                    if (var12 == -2147483643) {
                        var12 = arg0.field189 == null ? -1 : arg0.field189.field2291;
                    }
                    if (var12 == -2147483642) {
                        var12 = arg0.field193 == null ? -1 : arg0.field193.field2207;
                    }
                    if (var12 == -2147483641) {
                        var12 = arg0.field193 == null ? -1 : arg0.field193.field2291;
                    }
                    if (var12 == -2147483640) {
                        var12 = arg0.field194;
                    }
                    if (var12 == -2147483639) {
                        var12 = arg0.field195;
                    }
                    Statics.field721[var9++] = var12;
                } else if (var2[var11] instanceof String) {
                    String var13 = (String) var2[var11];
                    if (var13.equals("event_opbase")) {
                        var13 = arg0.field196;
                    }
                    Statics.field724[var10++] = var13;
                }
            }
            int var14 = 0;
            field731 = arg0.field188;
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
                                                                                                                label243: while (true) {
                                                                                                                    var14++;
                                                                                                                    if (var14 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var5++;
                                                                                                                    int var63 = var6[var5];
                                                                                                                    if (var63 >= 100) {
                                                                                                                        boolean var57;
                                                                                                                        if (var4.field958[var5] == 1) {
                                                                                                                            var57 = true;
                                                                                                                        } else {
                                                                                                                            var57 = false;
                                                                                                                        }
                                                                                                                        int var58 = method9(var63, var4, var57);
                                                                                                                        switch(var58) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var63 == 0) {
                                                                                                                        field727[++Statics.field736 - 1] = var7[var5];
                                                                                                                    } else if (var63 == 1) {
                                                                                                                        int var15 = var7[var5];
                                                                                                                        field727[++Statics.field736 - 1] = class166.field2166[var15];
                                                                                                                    } else if (var63 == 2) {
                                                                                                                        int var16 = var7[var5];
                                                                                                                        class166.field2166[var16] = field727[--Statics.field736];
                                                                                                                        client.method2425(var16);
                                                                                                                    } else if (var63 == 3) {
                                                                                                                        field729[++Statics.field695 - 1] = var4.field955[var5];
                                                                                                                    } else if (var63 == 6) {
                                                                                                                        var5 += var7[var5];
                                                                                                                    } else if (var63 == 7) {
                                                                                                                        Statics.field736 -= 2;
                                                                                                                        if (field727[Statics.field736] != field727[Statics.field736 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var63 == 8) {
                                                                                                                        Statics.field736 -= 2;
                                                                                                                        if (field727[Statics.field736] == field727[Statics.field736 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var63 == 9) {
                                                                                                                        Statics.field736 -= 2;
                                                                                                                        if (field727[Statics.field736] < field727[Statics.field736 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var63 == 10) {
                                                                                                                        Statics.field736 -= 2;
                                                                                                                        if (field727[Statics.field736] > field727[Statics.field736 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var63 == 21) {
                                                                                                                        if (field730 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class12 var17 = field726[--field730];
                                                                                                                        var4 = var17.field106;
                                                                                                                        var6 = var4.field953;
                                                                                                                        var7 = var4.field958;
                                                                                                                        var5 = var17.field97;
                                                                                                                        Statics.field721 = var17.field103;
                                                                                                                        Statics.field724 = var17.field99;
                                                                                                                    } else if (var63 == 25) {
                                                                                                                        int var18 = var7[var5];
                                                                                                                        field727[++Statics.field736 - 1] = class166.method203(var18);
                                                                                                                    } else if (var63 == 27) {
                                                                                                                        int var19 = var7[var5];
                                                                                                                        int var20 = field727[--Statics.field736];
                                                                                                                        class195 var21 = Statics.method701(var19);
                                                                                                                        int var22 = var21.field2856;
                                                                                                                        int var23 = var21.field2859;
                                                                                                                        int var24 = var21.field2857;
                                                                                                                        int var25 = class166.field2164[var24 - var23];
                                                                                                                        if (var20 < 0 || var20 > var25) {
                                                                                                                            var20 = 0;
                                                                                                                        }
                                                                                                                        int var26 = var25 << var23;
                                                                                                                        class166.field2166[var22] = class166.field2166[var22] & ~var26 | var20 << var23 & var26;
                                                                                                                    } else if (var63 == 31) {
                                                                                                                        Statics.field736 -= 2;
                                                                                                                        if (field727[Statics.field736] <= field727[Statics.field736 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var63 == 32) {
                                                                                                                        Statics.field736 -= 2;
                                                                                                                        if (field727[Statics.field736] >= field727[Statics.field736 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var63 == 33) {
                                                                                                                        field727[++Statics.field736 - 1] = Statics.field721[var7[var5]];
                                                                                                                    } else if (var63 == 34) {
                                                                                                                        Statics.field721[var7[var5]] = field727[--Statics.field736];
                                                                                                                    } else if (var63 == 35) {
                                                                                                                        field729[++Statics.field695 - 1] = Statics.field724[var7[var5]];
                                                                                                                    } else if (var63 == 36) {
                                                                                                                        Statics.field724[var7[var5]] = field729[--Statics.field695];
                                                                                                                    } else if (var63 == 37) {
                                                                                                                        int var27 = var7[var5];
                                                                                                                        Statics.field695 -= var27;
                                                                                                                        String[] var28 = field729;
                                                                                                                        int var29 = Statics.field695;
                                                                                                                        String var30;
                                                                                                                        if (var27 == 0) {
                                                                                                                            var30 = "";
                                                                                                                        } else if (var27 == 1) {
                                                                                                                            String var31 = var28[var29];
                                                                                                                            if (var31 == null) {
                                                                                                                                var30 = "null";
                                                                                                                            } else {
                                                                                                                                var30 = var31.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var32 = var27 + var29;
                                                                                                                            int var33 = 0;
                                                                                                                            for (int var34 = var29; var34 < var32; var34++) {
                                                                                                                                String var35 = var28[var34];
                                                                                                                                if (var35 == null) {
                                                                                                                                    var33 += 4;
                                                                                                                                } else {
                                                                                                                                    var33 += var35.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var36 = new StringBuilder(var33);
                                                                                                                            for (int var37 = var29; var37 < var32; var37++) {
                                                                                                                                String var38 = var28[var37];
                                                                                                                                if (var38 == null) {
                                                                                                                                    var36.append("null");
                                                                                                                                } else {
                                                                                                                                    var36.append(var38);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var30 = var36.toString();
                                                                                                                        }
                                                                                                                        field729[++Statics.field695 - 1] = var30;
                                                                                                                    } else if (var63 == 38) {
                                                                                                                        Statics.field736--;
                                                                                                                    } else if (var63 == 39) {
                                                                                                                        Statics.field695--;
                                                                                                                    } else if (var63 == 40) {
                                                                                                                        int var40 = var7[var5];
                                                                                                                        class49 var41 = class49.method692(var40);
                                                                                                                        int[] var42 = new int[var41.field956];
                                                                                                                        String[] var43 = new String[var41.field957];
                                                                                                                        for (int var44 = 0; var44 < var41.field959; var44++) {
                                                                                                                            var42[var44] = field727[Statics.field736 - var41.field959 + var44];
                                                                                                                        }
                                                                                                                        for (int var45 = 0; var45 < var41.field954; var45++) {
                                                                                                                            var43[var45] = field729[Statics.field695 - var41.field954 + var45];
                                                                                                                        }
                                                                                                                        Statics.field736 -= var41.field959;
                                                                                                                        Statics.field695 -= var41.field954;
                                                                                                                        class12 var46 = new class12();
                                                                                                                        var46.field106 = var4;
                                                                                                                        var46.field97 = var5;
                                                                                                                        var46.field103 = Statics.field721;
                                                                                                                        var46.field99 = Statics.field724;
                                                                                                                        field726[++field730 - 1] = var46;
                                                                                                                        var4 = var41;
                                                                                                                        var6 = var41.field953;
                                                                                                                        var7 = var41.field958;
                                                                                                                        var5 = -1;
                                                                                                                        Statics.field721 = var42;
                                                                                                                        Statics.field724 = var43;
                                                                                                                    } else if (var63 == 42) {
                                                                                                                        field727[++Statics.field736 - 1] = Statics.field239.method901(var7[var5]);
                                                                                                                    } else if (var63 == 43) {
                                                                                                                        Statics.field239.method930(var7[var5], field727[--Statics.field736]);
                                                                                                                    } else if (var63 == 44) {
                                                                                                                        int var47 = var7[var5] >> 16;
                                                                                                                        int var48 = var7[var5] & 0xFFFF;
                                                                                                                        int var49 = field727[--Statics.field736];
                                                                                                                        if (var49 >= 0 && var49 <= 5000) {
                                                                                                                            field725[var47] = var49;
                                                                                                                            byte var50 = -1;
                                                                                                                            if (var48 == 105) {
                                                                                                                                var50 = 0;
                                                                                                                            }
                                                                                                                            int var51 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var51 >= var49) {
                                                                                                                                    continue label243;
                                                                                                                                }
                                                                                                                                field728[var47][var51] = var50;
                                                                                                                                var51++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var63 == 45) {
                                                                                                                        int var52 = var7[var5];
                                                                                                                        int var53 = field727[--Statics.field736];
                                                                                                                        if (var53 < 0 || var53 >= field725[var52]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field727[++Statics.field736 - 1] = field728[var52][var53];
                                                                                                                    } else if (var63 == 46) {
                                                                                                                        int var54 = var7[var5];
                                                                                                                        Statics.field736 -= 2;
                                                                                                                        int var55 = field727[Statics.field736];
                                                                                                                        if (var55 < 0 || var55 >= field725[var54]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field728[var54][var55] = field727[Statics.field736 + 1];
                                                                                                                    } else if (var63 == 47) {
                                                                                                                        String var56 = Statics.field239.method903(var7[var5]);
                                                                                                                        if (var56 == null) {
                                                                                                                            var56 = "null";
                                                                                                                        }
                                                                                                                        field729[++Statics.field695 - 1] = var56;
                                                                                                                    } else if (var63 == 48) {
                                                                                                                        Statics.field239.method902(var7[var5], field729[--Statics.field695]);
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
        } catch (Exception var62) {
            StringBuilder var60 = new StringBuilder(30);
            var60.append("").append(var4.field1884).append(" ");
            for (int var61 = field730 - 1; var61 >= 0; var61--) {
                var60.append("").append(field726[var61].field106.field1884).append(" ");
            }
            var60.append("").append(var8);
            class102.method1916(var60.toString(), var62);
        }
    }

    @ObfuscatedName("x.g(ILat;ZI)I")
    public static int method9(int arg0, class49 arg1, boolean arg2) {
        if (arg0 < 1000) {
            byte var10;
            if (arg0 == 100) {
                Statics.field736 -= 3;
                int var3 = field727[Statics.field736];
                int var4 = field727[Statics.field736 + 1];
                int var5 = field727[Statics.field736 + 2];
                if (var4 == 0) {
                    throw new RuntimeException();
                }
                class170 var6 = class170.method971(var3);
                if (var6.field2340 == null) {
                    var6.field2340 = new class170[var5 + 1];
                }
                if (var6.field2340.length <= var5) {
                    class170[] var7 = new class170[var5 + 1];
                    for (int var8 = 0; var8 < var6.field2340.length; var8++) {
                        var7[var8] = var6.field2340[var8];
                    }
                    var6.field2340 = var7;
                }
                if (var5 > 0 && var6.field2340[var5 - 1] == null) {
                    throw new RuntimeException("" + (var5 - 1));
                }
                class170 var9 = new class170();
                var9.field2209 = var4;
                var9.field2226 = var9.field2207 = var6.field2207;
                var9.field2291 = var5;
                var9.field2231 = true;
                var6.field2340[var5] = var9;
                if (arg2) {
                    Statics.field732 = var9;
                } else {
                    Statics.field1739 = var9;
                }
                client.method974(var6);
                var10 = 1;
            } else if (arg0 == 101) {
                class170 var11 = arg2 ? Statics.field732 : Statics.field1739;
                class170 var12 = class170.method971(var11.field2207);
                var12.field2340[var11.field2291] = null;
                client.method974(var12);
                var10 = 1;
            } else if (arg0 == 102) {
                class170 var13 = class170.method971(field727[--Statics.field736]);
                var13.field2340 = null;
                client.method974(var13);
                var10 = 1;
            } else if (arg0 == 200) {
                Statics.field736 -= 2;
                int var14 = field727[Statics.field736];
                int var15 = field727[Statics.field736 + 1];
                class170 var16 = class170.method769(var14, var15);
                if (var16 == null || var15 == -1) {
                    field727[++Statics.field736 - 1] = 0;
                } else {
                    field727[++Statics.field736 - 1] = 1;
                    if (arg2) {
                        Statics.field732 = var16;
                    } else {
                        Statics.field1739 = var16;
                    }
                }
                var10 = 1;
            } else if (arg0 == 201) {
                class170 var17 = class170.method971(field727[--Statics.field736]);
                if (var17 == null) {
                    field727[++Statics.field736 - 1] = 0;
                } else {
                    field727[++Statics.field736 - 1] = 1;
                    if (arg2) {
                        Statics.field732 = var17;
                    } else {
                        Statics.field1739 = var17;
                    }
                }
                var10 = 1;
            } else {
                var10 = 2;
            }
            return var10;
        } else if (arg0 < 1100) {
            return method3059(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method162(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return Statics.method224(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return Statics.method2683(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method108(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class170 var21 = arg2 ? Statics.field732 : Statics.field1739;
            byte var22;
            if (arg0 == 1500) {
                field727[++Statics.field736 - 1] = var21.field2220;
                var22 = 1;
            } else if (arg0 == 1501) {
                field727[++Statics.field736 - 1] = var21.field2221;
                var22 = 1;
            } else if (arg0 == 1502) {
                field727[++Statics.field736 - 1] = var21.field2249;
                var22 = 1;
            } else if (arg0 == 1503) {
                field727[++Statics.field736 - 1] = var21.field2223;
                var22 = 1;
            } else if (arg0 == 1504) {
                field727[++Statics.field736 - 1] = var21.field2225 ? 1 : 0;
                var22 = 1;
            } else if (arg0 == 1505) {
                field727[++Statics.field736 - 1] = var21.field2226;
                var22 = 1;
            } else {
                var22 = 2;
            }
            return var22;
        } else if (arg0 < 1700) {
            class170 var23 = arg2 ? Statics.field732 : Statics.field1739;
            byte var24;
            if (arg0 == 1600) {
                field727[++Statics.field736 - 1] = var23.field2228;
                var24 = 1;
            } else if (arg0 == 1601) {
                field727[++Statics.field736 - 1] = var23.field2229;
                var24 = 1;
            } else if (arg0 == 1602) {
                field729[++Statics.field695 - 1] = var23.field2267;
                var24 = 1;
            } else if (arg0 == 1603) {
                field727[++Statics.field736 - 1] = var23.field2251;
                var24 = 1;
            } else if (arg0 == 1604) {
                field727[++Statics.field736 - 1] = var23.field2206;
                var24 = 1;
            } else if (arg0 == 1605) {
                field727[++Statics.field736 - 1] = var23.field2261;
                var24 = 1;
            } else if (arg0 == 1606) {
                field727[++Statics.field736 - 1] = var23.field2258;
                var24 = 1;
            } else if (arg0 == 1607) {
                field727[++Statics.field736 - 1] = var23.field2260;
                var24 = 1;
            } else if (arg0 == 1608) {
                field727[++Statics.field736 - 1] = var23.field2332;
                var24 = 1;
            } else if (arg0 == 1609) {
                field727[++Statics.field736 - 1] = var23.field2238;
                var24 = 1;
            } else if (arg0 == 1610) {
                field727[++Statics.field736 - 1] = var23.field2197;
                var24 = 1;
            } else if (arg0 == 1611) {
                field727[++Statics.field736 - 1] = var23.field2324;
                var24 = 1;
            } else if (arg0 == 1612) {
                field727[++Statics.field736 - 1] = var23.field2233;
                var24 = 1;
            } else if (arg0 == 1613) {
                field727[++Statics.field736 - 1] = var23.field2237.method811();
                var24 = 1;
            } else {
                var24 = 2;
            }
            return var24;
        } else if (arg0 < 1800) {
            return method609(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            class170 var25 = arg2 ? Statics.field732 : Statics.field1739;
            byte var30;
            if (arg0 == 1800) {
                int[] var26 = field727;
                int var27 = ++Statics.field736 - 1;
                int var28 = client.method221(var25);
                int var29 = var28 >> 11 & 0x3F;
                var26[var27] = var29;
                var30 = 1;
            } else if (arg0 == 1801) {
                int var31 = field727[--Statics.field736];
                int var280 = var31 - 1;
                if (var25.field2281 == null || var280 >= var25.field2281.length || var25.field2281[var280] == null) {
                    field729[++Statics.field695 - 1] = "";
                } else {
                    field729[++Statics.field695 - 1] = var25.field2281[var280];
                }
                var30 = 1;
            } else if (arg0 == 1802) {
                if (var25.field2280 == null) {
                    field729[++Statics.field695 - 1] = "";
                } else {
                    field729[++Statics.field695 - 1] = var25.field2280;
                }
                var30 = 1;
            } else {
                var30 = 2;
            }
            return var30;
        } else if (arg0 < 2000) {
            return method1708(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method3059(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method162(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return Statics.method224(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return Statics.method2683(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method108(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method626(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            class170 var32 = class170.method971(field727[--Statics.field736]);
            byte var33;
            if (arg0 == 2600) {
                field727[++Statics.field736 - 1] = var32.field2228;
                var33 = 1;
            } else if (arg0 == 2601) {
                field727[++Statics.field736 - 1] = var32.field2229;
                var33 = 1;
            } else if (arg0 == 2602) {
                field729[++Statics.field695 - 1] = var32.field2267;
                var33 = 1;
            } else if (arg0 == 2603) {
                field727[++Statics.field736 - 1] = var32.field2251;
                var33 = 1;
            } else if (arg0 == 2604) {
                field727[++Statics.field736 - 1] = var32.field2206;
                var33 = 1;
            } else if (arg0 == 2605) {
                field727[++Statics.field736 - 1] = var32.field2261;
                var33 = 1;
            } else if (arg0 == 2606) {
                field727[++Statics.field736 - 1] = var32.field2258;
                var33 = 1;
            } else if (arg0 == 2607) {
                field727[++Statics.field736 - 1] = var32.field2260;
                var33 = 1;
            } else if (arg0 == 2608) {
                field727[++Statics.field736 - 1] = var32.field2332;
                var33 = 1;
            } else if (arg0 == 2609) {
                field727[++Statics.field736 - 1] = var32.field2238;
                var33 = 1;
            } else if (arg0 == 2610) {
                field727[++Statics.field736 - 1] = var32.field2197;
                var33 = 1;
            } else if (arg0 == 2611) {
                field727[++Statics.field736 - 1] = var32.field2324;
                var33 = 1;
            } else if (arg0 == 2612) {
                field727[++Statics.field736 - 1] = var32.field2233;
                var33 = 1;
            } else if (arg0 == 2613) {
                field727[++Statics.field736 - 1] = var32.field2237.method811();
                var33 = 1;
            } else {
                var33 = 2;
            }
            return var33;
        } else if (arg0 < 2800) {
            return method105(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method960(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method1708(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            byte var35;
            if (arg0 == 3100) {
                String var34 = field729[--Statics.field695];
                class48.method1892(0, "", var34);
                var35 = 1;
            } else if (arg0 == 3101) {
                Statics.field736 -= 2;
                client.method803(Statics.field186, field727[Statics.field736], field727[Statics.field736 + 1]);
                var35 = 1;
            } else if (arg0 == 3103) {
                client.field333.method2948(200);
                for (class18 var36 = (class18) client.field302.method2289(); var36 != null; var36 = (class18) client.field302.method2290()) {
                    if (var36.field177 == 0 || var36.field177 == 3) {
                        client.method204(var36, true);
                    }
                }
                if (client.field544 != null) {
                    client.method974(client.field544);
                    client.field544 = null;
                }
                var35 = 1;
            } else if (arg0 == 3104) {
                String var37 = field729[--Statics.field695];
                int var38 = 0;
                boolean var39 = class208.method3034(var37, 10, true);
                if (var39) {
                    var38 = class208.method1913(var37);
                }
                client.field333.method2948(164);
                client.field333.method2689(var38);
                var35 = 1;
            } else if (arg0 == 3105) {
                String var40 = field729[--Statics.field695];
                client.field333.method2948(158);
                client.field333.method2688(var40.length() + 1);
                client.field333.method2730(var40);
                var35 = 1;
            } else if (arg0 == 3106) {
                String var41 = field729[--Statics.field695];
                client.field333.method2948(190);
                client.field333.method2688(var41.length() + 1);
                client.field333.method2730(var41);
                var35 = 1;
            } else if (arg0 == 3107) {
                int var42 = field727[--Statics.field736];
                String var43 = field729[--Statics.field695];
                client.method97(var42, var43);
                var35 = 1;
            } else if (arg0 == 3108) {
                Statics.field736 -= 3;
                int var44 = field727[Statics.field736];
                int var45 = field727[Statics.field736 + 1];
                int var46 = field727[Statics.field736 + 2];
                class170 var47 = class170.method971(var46);
                client.method1925(var47, var44, var45);
                var35 = 1;
            } else if (arg0 == 3109) {
                Statics.field736 -= 2;
                int var48 = field727[Statics.field736];
                int var49 = field727[Statics.field736 + 1];
                class170 var50 = arg2 ? Statics.field732 : Statics.field1739;
                client.method1925(var50, var48, var49);
                var35 = 1;
            } else if (arg0 == 3110) {
                Statics.field292 = field727[--Statics.field736] == 1;
                var35 = 1;
            } else if (arg0 == 3111) {
                field727[++Statics.field736 - 1] = Statics.field2945.field691 ? 1 : 0;
                var35 = 1;
            } else if (arg0 == 3112) {
                Statics.field2945.field691 = field727[--Statics.field736] == 1;
                class31.method2626();
                var35 = 1;
            } else if (arg0 == 3113) {
                String var51 = field729[--Statics.field695];
                boolean var52 = field727[--Statics.field736] == 1;
                if (var52) {
                    label1496: {
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(var51));
                                break label1496;
                            } catch (Exception var279) {
                            }
                        }
                        if (class115.field1787.startsWith("win")) {
                            class115.method956(var51, 0, "openjs");
                        } else if (class115.field1787.startsWith("mac")) {
                            class115.method956(var51, 1, "openjs");
                        } else {
                            class115.method956(var51, 2, "openjs");
                        }
                    }
                } else {
                    class115.method956(var51, 3, "openjs");
                }
                var35 = 1;
            } else if (arg0 == 3115) {
                int var54 = field727[--Statics.field736];
                client.field333.method2948(93);
                client.field333.method2687(var54);
                var35 = 1;
            } else if (arg0 == 3116) {
                int var55 = field727[--Statics.field736];
                Statics.field695 -= 2;
                String var56 = field729[Statics.field695];
                String var57 = field729[Statics.field695 + 1];
                if (var56.length() > 500) {
                    var35 = 1;
                } else if (var57.length() > 500) {
                    var35 = 1;
                } else {
                    client.field333.method2948(69);
                    client.field333.method2687(1 + class154.method3037(var56) + class154.method3037(var57));
                    client.field333.method2730(var56);
                    client.field333.method2730(var57);
                    client.field333.method2726(var55);
                    var35 = 1;
                }
            } else if (arg0 == 3117) {
                client.field438 = field727[--Statics.field736] == 1;
                var35 = 1;
            } else {
                var35 = 2;
            }
            return var35;
        } else if (arg0 < 3300) {
            return method941(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            byte var58;
            if (arg0 == 3300) {
                field727[++Statics.field736 - 1] = client.field432;
                var58 = 1;
            } else if (arg0 == 3301) {
                Statics.field736 -= 2;
                int var59 = field727[Statics.field736];
                int var60 = field727[Statics.field736 + 1];
                field727[++Statics.field736 - 1] = class13.method1897(var59, var60);
                var58 = 1;
            } else if (arg0 == 3302) {
                Statics.field736 -= 2;
                int var61 = field727[Statics.field736];
                int var62 = field727[Statics.field736 + 1];
                field727[++Statics.field736 - 1] = class13.method2182(var61, var62);
                var58 = 1;
            } else if (arg0 == 3303) {
                Statics.field736 -= 2;
                int var63 = field727[Statics.field736];
                int var64 = field727[Statics.field736 + 1];
                int[] var65 = field727;
                int var66 = ++Statics.field736 - 1;
                class13 var67 = (class13) class13.field113.method2286((long) var63);
                int var68;
                if (var67 == null) {
                    var68 = 0;
                } else if (var64 == -1) {
                    var68 = 0;
                } else {
                    int var69 = 0;
                    for (int var70 = 0; var70 < var67.field114.length; var70++) {
                        if (var67.field109[var70] == var64) {
                            var69 += var67.field114[var70];
                        }
                    }
                    var68 = var69;
                }
                var65[var66] = var68;
                var58 = 1;
            } else if (arg0 == 3304) {
                int var71 = field727[--Statics.field736];
                int[] var72 = field727;
                int var73 = ++Statics.field736 - 1;
                class187 var74 = (class187) class187.field2773.method2275((long) var71);
                class187 var75;
                if (var74 == null) {
                    byte[] var76 = Statics.field2771.method3153(5, var71);
                    class187 var77 = new class187();
                    if (var76 != null) {
                        var77.method3284(new class154(var76));
                    }
                    class187.field2773.method2282(var77, (long) var71);
                    var75 = var77;
                } else {
                    var75 = var74;
                }
                var72[var73] = var75.field2777;
                var58 = 1;
            } else if (arg0 == 3305) {
                int var78 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = client.field284[var78];
                var58 = 1;
            } else if (arg0 == 3306) {
                int var79 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = client.field425[var79];
                var58 = 1;
            } else if (arg0 == 3307) {
                int var80 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = client.field364[var80];
                var58 = 1;
            } else if (arg0 == 3308) {
                int var81 = Statics.field1834;
                int var82 = (Statics.field186.field636 >> 7) + Statics.field267;
                int var83 = (Statics.field186.field605 >> 7) + Statics.field3221;
                field727[++Statics.field736 - 1] = (var81 << 28) + (var82 << 14) + var83;
                var58 = 1;
            } else if (arg0 == 3309) {
                int var84 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = var84 >> 14 & 0x3FFF;
                var58 = 1;
            } else if (arg0 == 3310) {
                int var85 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = var85 >> 28;
                var58 = 1;
            } else if (arg0 == 3311) {
                int var86 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = var86 & 0x3FFF;
                var58 = 1;
            } else if (arg0 == 3312) {
                field727[++Statics.field736 - 1] = client.field290 ? 1 : 0;
                var58 = 1;
            } else if (arg0 == 3313) {
                Statics.field736 -= 2;
                int var87 = field727[Statics.field736] + 32768;
                int var88 = field727[Statics.field736 + 1];
                field727[++Statics.field736 - 1] = class13.method1897(var87, var88);
                var58 = 1;
            } else if (arg0 == 3314) {
                Statics.field736 -= 2;
                int var89 = field727[Statics.field736] + 32768;
                int var90 = field727[Statics.field736 + 1];
                field727[++Statics.field736 - 1] = class13.method2182(var89, var90);
                var58 = 1;
            } else if (arg0 == 3315) {
                Statics.field736 -= 2;
                int var91 = field727[Statics.field736] + 32768;
                int var92 = field727[Statics.field736 + 1];
                int[] var93 = field727;
                int var94 = ++Statics.field736 - 1;
                class13 var95 = (class13) class13.field113.method2286((long) var91);
                int var96;
                if (var95 == null) {
                    var96 = 0;
                } else if (var92 == -1) {
                    var96 = 0;
                } else {
                    int var97 = 0;
                    for (int var98 = 0; var98 < var95.field114.length; var98++) {
                        if (var95.field109[var98] == var92) {
                            var97 += var95.field114[var98];
                        }
                    }
                    var96 = var97;
                }
                var93[var94] = var96;
                var58 = 1;
            } else if (arg0 == 3316) {
                if (client.field426 >= 2) {
                    field727[++Statics.field736 - 1] = client.field426;
                } else {
                    field727[++Statics.field736 - 1] = 0;
                }
                var58 = 1;
            } else if (arg0 == 3317) {
                field727[++Statics.field736 - 1] = client.field499;
                var58 = 1;
            } else if (arg0 == 3318) {
                field727[++Statics.field736 - 1] = client.field562;
                var58 = 1;
            } else if (arg0 == 3321) {
                field727[++Statics.field736 - 1] = client.field455;
                var58 = 1;
            } else if (arg0 == 3322) {
                field727[++Statics.field736 - 1] = client.field456;
                var58 = 1;
            } else if (arg0 == 3323) {
                if (client.field459) {
                    field727[++Statics.field736 - 1] = 1;
                } else {
                    field727[++Statics.field736 - 1] = 0;
                }
                var58 = 1;
            } else if (arg0 == 3324) {
                field727[++Statics.field736 - 1] = client.field288;
                var58 = 1;
            } else {
                var58 = 2;
            }
            return var58;
        } else if (arg0 < 3500) {
            byte var103;
            if (arg0 == 3400) {
                Statics.field736 -= 2;
                int var99 = field727[Statics.field736];
                int var100 = field727[Statics.field736 + 1];
                class196 var101 = class196.method2595(var99);
                if (var101.field2863 != 's') {
                }
                for (int var102 = 0; var102 < var101.field2866; var102++) {
                    if (var101.field2867[var102] == var100) {
                        field729[++Statics.field695 - 1] = var101.field2860[var102];
                        var101 = null;
                        break;
                    }
                }
                if (var101 != null) {
                    field729[++Statics.field695 - 1] = var101.field2864;
                }
                var103 = 1;
            } else if (arg0 == 3408) {
                Statics.field736 -= 4;
                int var104 = field727[Statics.field736];
                int var105 = field727[Statics.field736 + 1];
                int var106 = field727[Statics.field736 + 2];
                int var107 = field727[Statics.field736 + 3];
                class196 var108 = class196.method2595(var106);
                if (var108.field2862 == var104 && var108.field2863 == var105) {
                    for (int var109 = 0; var109 < var108.field2866; var109++) {
                        if (var108.field2867[var109] == var107) {
                            if (var105 == 115) {
                                field729[++Statics.field695 - 1] = var108.field2860[var109];
                            } else {
                                field727[++Statics.field736 - 1] = var108.field2865[var109];
                            }
                            var108 = null;
                            break;
                        }
                    }
                    if (var108 != null) {
                        if (var105 == 115) {
                            field729[++Statics.field695 - 1] = var108.field2864;
                        } else {
                            field727[++Statics.field736 - 1] = var108.field2869;
                        }
                    }
                    var103 = 1;
                } else {
                    if (var105 == 115) {
                        field729[++Statics.field695 - 1] = "null";
                    } else {
                        field727[++Statics.field736 - 1] = 0;
                    }
                    var103 = 1;
                }
            } else {
                var103 = 2;
            }
            return var103;
        } else if (arg0 < 3700) {
            return method2096(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method207(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method1644(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            byte var112;
            if (arg0 == 4100) {
                String var110 = field729[--Statics.field695];
                int var111 = field727[--Statics.field736];
                field729[++Statics.field695 - 1] = var110 + var111;
                var112 = 1;
            } else if (arg0 == 4101) {
                Statics.field695 -= 2;
                String var113 = field729[Statics.field695];
                String var114 = field729[Statics.field695 + 1];
                field729[++Statics.field695 - 1] = var113 + var114;
                var112 = 1;
            } else if (arg0 == 4102) {
                String var115 = field729[--Statics.field695];
                int var116 = field727[--Statics.field736];
                field729[++Statics.field695 - 1] = var115 + class208.method2945(var116, true);
                var112 = 1;
            } else if (arg0 == 4103) {
                String var117 = field729[--Statics.field695];
                field729[++Statics.field695 - 1] = var117.toLowerCase();
                var112 = 1;
            } else if (arg0 == 4104) {
                int var118 = field727[--Statics.field736];
                long var119 = ((long) var118 + 11745L) * 86400000L;
                field733.setTime(new Date(var119));
                int var121 = field733.get(5);
                int var122 = field733.get(2);
                int var123 = field733.get(1);
                field729[++Statics.field695 - 1] = var121 + "-" + field734[var122] + "-" + var123;
                var112 = 1;
            } else if (arg0 == 4105) {
                Statics.field695 -= 2;
                String var124 = field729[Statics.field695];
                String var125 = field729[Statics.field695 + 1];
                if (Statics.field186.field242 != null && Statics.field186.field242.field2176) {
                    field729[++Statics.field695 - 1] = var125;
                } else {
                    field729[++Statics.field695 - 1] = var124;
                }
                var112 = 1;
            } else if (arg0 == 4106) {
                int var126 = field727[--Statics.field736];
                field729[++Statics.field695 - 1] = Integer.toString(var126);
                var112 = 1;
            } else if (arg0 == 4107) {
                Statics.field695 -= 2;
                int[] var127 = field727;
                int var128 = ++Statics.field736 - 1;
                String var129 = field729[Statics.field695];
                String var130 = field729[Statics.field695 + 1];
                int var131 = client.field429;
                int var132 = var129.length();
                int var133 = var130.length();
                int var134 = 0;
                int var135 = 0;
                byte var136 = 0;
                byte var137 = 0;
                int var138;
                label1228: while (true) {
                    if (var134 - var136 >= var132 && var135 - var137 >= var133) {
                        int var149 = Math.min(var132, var133);
                        for (int var150 = 0; var150 < var149; var150++) {
                            char var153 = var129.charAt(var150);
                            char var154 = var130.charAt(var150);
                            if (var153 != var154 && Character.toUpperCase(var153) != Character.toUpperCase(var154)) {
                                char var155 = Character.toLowerCase(var153);
                                char var156 = Character.toLowerCase(var154);
                                if (var155 != var156) {
                                    var138 = class203.method3356(var155, var131) - class203.method3356(var156, var131);
                                    break label1228;
                                }
                            }
                        }
                        int var157 = var132 - var133;
                        if (var157 != 0) {
                            var138 = var157;
                            break;
                        }
                        for (int var158 = 0; var158 < var149; var158++) {
                            char var159 = var129.charAt(var158);
                            char var160 = var130.charAt(var158);
                            if (var159 != var160) {
                                var138 = class203.method3356(var159, var131) - class203.method3356(var160, var131);
                                break label1228;
                            }
                        }
                        var138 = 0;
                        break;
                    }
                    if (var134 - var136 >= var132) {
                        var138 = -1;
                        break;
                    }
                    if (var135 - var137 >= var133) {
                        var138 = 1;
                        break;
                    }
                    char var139;
                    if (var136 == 0) {
                        var139 = var129.charAt(var134++);
                    } else {
                        var139 = (char) var136;
                        boolean var140 = false;
                    }
                    char var141;
                    if (var137 == 0) {
                        var141 = var130.charAt(var135++);
                    } else {
                        var141 = (char) var137;
                        boolean var142 = false;
                    }
                    byte var143;
                    if (var139 == 198) {
                        var143 = 69;
                    } else if (var139 == 230) {
                        var143 = 101;
                    } else if (var139 == 223) {
                        var143 = 115;
                    } else if (var139 == 338) {
                        var143 = 69;
                    } else if (var139 == 339) {
                        var143 = 101;
                    } else {
                        var143 = 0;
                    }
                    var136 = var143;
                    byte var144;
                    if (var141 == 198) {
                        var144 = 69;
                    } else if (var141 == 230) {
                        var144 = 101;
                    } else if (var141 == 223) {
                        var144 = 115;
                    } else if (var141 == 338) {
                        var144 = 69;
                    } else if (var141 == 339) {
                        var144 = 101;
                    } else {
                        var144 = 0;
                    }
                    var137 = var144;
                    char var145 = class203.method2670(var139, var131);
                    char var146 = class203.method2670(var141, var131);
                    if (var145 != var146 && Character.toUpperCase(var145) != Character.toUpperCase(var146)) {
                        char var147 = Character.toLowerCase(var145);
                        char var148 = Character.toLowerCase(var146);
                        if (var147 != var148) {
                            var138 = class203.method3356(var147, var131) - class203.method3356(var148, var131);
                            break;
                        }
                    }
                }
                byte var162;
                if (var138 > 0) {
                    var162 = 1;
                } else if (var138 < 0) {
                    var162 = -1;
                } else {
                    var162 = 0;
                }
                var127[var128] = var162;
                var112 = 1;
            } else if (arg0 == 4108) {
                String var163 = field729[--Statics.field695];
                Statics.field736 -= 2;
                int var164 = field727[Statics.field736];
                int var165 = field727[Statics.field736 + 1];
                byte[] var166 = Statics.field1309.method3153(var165, 0);
                class209 var167 = new class209(var166);
                field727[++Statics.field736 - 1] = var167.method3698(var163, var164);
                var112 = 1;
            } else if (arg0 == 4109) {
                String var168 = field729[--Statics.field695];
                Statics.field736 -= 2;
                int var169 = field727[Statics.field736];
                int var170 = field727[Statics.field736 + 1];
                byte[] var171 = Statics.field1309.method3153(var170, 0);
                class209 var172 = new class209(var171);
                field727[++Statics.field736 - 1] = var172.method3725(var168, var169);
                var112 = 1;
            } else if (arg0 == 4110) {
                Statics.field695 -= 2;
                String var173 = field729[Statics.field695];
                String var174 = field729[Statics.field695 + 1];
                if (field727[--Statics.field736] == 1) {
                    field729[++Statics.field695 - 1] = var173;
                } else {
                    field729[++Statics.field695 - 1] = var174;
                }
                var112 = 1;
            } else if (arg0 == 4111) {
                String var175 = field729[--Statics.field695];
                field729[++Statics.field695 - 1] = class210.method3735(var175);
                var112 = 1;
            } else if (arg0 == 4112) {
                String var176 = field729[--Statics.field695];
                int var177 = field727[--Statics.field736];
                field729[++Statics.field695 - 1] = var176 + (char) var177;
                var112 = 1;
            } else if (arg0 == 4113) {
                int var178 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = class208.method3130((char) var178) ? 1 : 0;
                var112 = 1;
            } else if (arg0 == 4114) {
                int var179 = field727[--Statics.field736];
                int[] var180 = field727;
                int var181 = ++Statics.field736 - 1;
                char var182 = (char) var179;
                boolean var183 = var182 >= '0' && var182 <= '9' || var182 >= 'A' && var182 <= 'Z' || var182 >= 'a' && var182 <= 'z';
                var180[var181] = var183 ? 1 : 0;
                var112 = 1;
            } else if (arg0 == 4115) {
                int var184 = field727[--Statics.field736];
                int[] var185 = field727;
                int var186 = ++Statics.field736 - 1;
                char var187 = (char) var184;
                boolean var188 = var187 >= 'A' && var187 <= 'Z' || var187 >= 'a' && var187 <= 'z';
                var185[var186] = var188 ? 1 : 0;
                var112 = 1;
            } else if (arg0 == 4116) {
                int var189 = field727[--Statics.field736];
                int[] var190 = field727;
                int var191 = ++Statics.field736 - 1;
                char var192 = (char) var189;
                boolean var193 = var192 >= '0' && var192 <= '9';
                var190[var191] = var193 ? 1 : 0;
                var112 = 1;
            } else if (arg0 == 4117) {
                String var194 = field729[--Statics.field695];
                if (var194 == null) {
                    field727[++Statics.field736 - 1] = 0;
                } else {
                    field727[++Statics.field736 - 1] = var194.length();
                }
                var112 = 1;
            } else if (arg0 == 4118) {
                String var195 = field729[--Statics.field695];
                Statics.field736 -= 2;
                int var196 = field727[Statics.field736];
                int var197 = field727[Statics.field736 + 1];
                field729[++Statics.field695 - 1] = var195.substring(var196, var197);
                var112 = 1;
            } else if (arg0 == 4119) {
                String var198 = field729[--Statics.field695];
                StringBuilder var199 = new StringBuilder(var198.length());
                boolean var200 = false;
                for (int var201 = 0; var201 < var198.length(); var201++) {
                    char var202 = var198.charAt(var201);
                    if (var202 == '<') {
                        var200 = true;
                    } else if (var202 == '>') {
                        var200 = false;
                    } else if (!var200) {
                        var199.append(var202);
                    }
                }
                field729[++Statics.field695 - 1] = var199.toString();
                var112 = 1;
            } else if (arg0 == 4120) {
                String var203 = field729[--Statics.field695];
                int var204 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = var203.indexOf(var204);
                var112 = 1;
            } else if (arg0 == 4121) {
                Statics.field695 -= 2;
                String var205 = field729[Statics.field695];
                String var206 = field729[Statics.field695 + 1];
                int var207 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = var205.indexOf(var206, var207);
                var112 = 1;
            } else {
                var112 = 2;
            }
            return var112;
        } else if (arg0 < 4300) {
            byte var209;
            if (arg0 == 4200) {
                int var208 = field727[--Statics.field736];
                field729[++Statics.field695 - 1] = class199.method973(var208).field2960;
                var209 = 1;
            } else if (arg0 == 4201) {
                Statics.field736 -= 2;
                int var210 = field727[Statics.field736];
                int var211 = field727[Statics.field736 + 1];
                class199 var212 = class199.method973(var210);
                if (var211 < 1 || var211 > 5 || var212.field2987[var211 - 1] == null) {
                    field729[++Statics.field695 - 1] = "";
                } else {
                    field729[++Statics.field695 - 1] = var212.field2987[var211 - 1];
                }
                var209 = 1;
            } else if (arg0 == 4202) {
                Statics.field736 -= 2;
                int var213 = field727[Statics.field736];
                int var214 = field727[Statics.field736 + 1];
                class199 var215 = class199.method973(var213);
                if (var214 < 1 || var214 > 5 || var215.field2975[var214 - 1] == null) {
                    field729[++Statics.field695 - 1] = "";
                } else {
                    field729[++Statics.field695 - 1] = var215.field2975[var214 - 1];
                }
                var209 = 1;
            } else if (arg0 == 4203) {
                int var216 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = class199.method973(var216).field2972;
                var209 = 1;
            } else if (arg0 == 4204) {
                int var217 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = class199.method973(var217).field2971 == 1 ? 1 : 0;
                var209 = 1;
            } else if (arg0 == 4205) {
                int var218 = field727[--Statics.field736];
                class199 var219 = class199.method973(var218);
                if (var219.field2992 == -1 && var219.field2991 >= 0) {
                    field727[++Statics.field736 - 1] = var219.field2991;
                } else {
                    field727[++Statics.field736 - 1] = var218;
                }
                var209 = 1;
            } else if (arg0 == 4206) {
                int var220 = field727[--Statics.field736];
                class199 var221 = class199.method973(var220);
                if (var221.field2992 >= 0 && var221.field2991 >= 0) {
                    field727[++Statics.field736 - 1] = var221.field2991;
                } else {
                    field727[++Statics.field736 - 1] = var220;
                }
                var209 = 1;
            } else if (arg0 == 4207) {
                int var222 = field727[--Statics.field736];
                field727[++Statics.field736 - 1] = class199.method973(var222).field2973 ? 1 : 0;
                var209 = 1;
            } else if (arg0 == 4208) {
                int var223 = field727[--Statics.field736];
                class199 var224 = class199.method973(var223);
                if (var224.field3000 == -1 && var224.field3002 >= 0) {
                    field727[++Statics.field736 - 1] = var224.field3002;
                } else {
                    field727[++Statics.field736 - 1] = var223;
                }
                var209 = 1;
            } else if (arg0 == 4209) {
                int var225 = field727[--Statics.field736];
                class199 var226 = class199.method973(var225);
                if (var226.field3000 >= 0 && var226.field3002 >= 0) {
                    field727[++Statics.field736 - 1] = var226.field3002;
                } else {
                    field727[++Statics.field736 - 1] = var225;
                }
                var209 = 1;
            } else if (arg0 == 4210) {
                String var227 = field729[--Statics.field695];
                int var228 = field727[--Statics.field736];
                client.method2017(var227, var228 == 1);
                field727[++Statics.field736 - 1] = Statics.field1856;
                var209 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field839 == null || Statics.field2768 >= Statics.field1856) {
                    field727[++Statics.field736 - 1] = -1;
                } else {
                    field727[++Statics.field736 - 1] = Statics.field839[++Statics.field2768 - 1] & 0xFFFF;
                }
                var209 = 1;
            } else if (arg0 == 4212) {
                Statics.field2768 = 0;
                var209 = 1;
            } else {
                var209 = 2;
            }
            return var209;
        } else if (arg0 < 5100) {
            byte var229;
            if (arg0 == 5000) {
                field727[++Statics.field736 - 1] = client.field508;
                var229 = 1;
            } else if (arg0 == 5001) {
                Statics.field736 -= 3;
                client.field508 = field727[Statics.field736];
                Statics.field3004 = class217.method816(field727[Statics.field736 + 1]);
                if (Statics.field3004 == null) {
                    Statics.field3004 = class217.field3184;
                }
                client.field446 = field727[Statics.field736 + 2];
                client.field333.method2948(237);
                client.field333.method2688(client.field508);
                client.field333.method2688(Statics.field3004.field3187);
                client.field333.method2688(client.field446);
                var229 = 1;
            } else if (arg0 == 5002) {
                String var230 = field729[--Statics.field695];
                Statics.field736 -= 2;
                int var231 = field727[Statics.field736];
                int var232 = field727[Statics.field736 + 1];
                client.field333.method2948(139);
                client.field333.method2688(class154.method3037(var230) + 2);
                client.field333.method2730(var230);
                client.field333.method2688(var231 - 1);
                client.field333.method2688(var232);
                var229 = 1;
            } else if (arg0 == 5003) {
                Statics.field736 -= 2;
                int var233 = field727[Statics.field736];
                int var234 = field727[Statics.field736 + 1];
                class22 var235 = Statics.method3281(var233, var234);
                if (var235 == null) {
                    field727[++Statics.field736 - 1] = -1;
                    field727[++Statics.field736 - 1] = 0;
                    field729[++Statics.field695 - 1] = "";
                    field729[++Statics.field695 - 1] = "";
                    field729[++Statics.field695 - 1] = "";
                } else {
                    field727[++Statics.field736 - 1] = var235.field227;
                    field727[++Statics.field736 - 1] = var235.field223;
                    field729[++Statics.field695 - 1] = var235.field226 == null ? "" : var235.field226;
                    field729[++Statics.field695 - 1] = var235.field224 == null ? "" : var235.field224;
                    field729[++Statics.field695 - 1] = var235.field228 == null ? "" : var235.field228;
                }
                var229 = 1;
            } else if (arg0 == 5004) {
                int var236 = field727[--Statics.field736];
                class22 var237 = (class22) class48.field944.method2253((long) var236);
                if (var237 == null) {
                    field727[++Statics.field736 - 1] = -1;
                    field727[++Statics.field736 - 1] = 0;
                    field729[++Statics.field695 - 1] = "";
                    field729[++Statics.field695 - 1] = "";
                    field729[++Statics.field695 - 1] = "";
                } else {
                    field727[++Statics.field736 - 1] = var237.field225;
                    field727[++Statics.field736 - 1] = var237.field223;
                    field729[++Statics.field695 - 1] = var237.field226 == null ? "" : var237.field226;
                    field729[++Statics.field695 - 1] = var237.field224 == null ? "" : var237.field224;
                    field729[++Statics.field695 - 1] = var237.field228 == null ? "" : var237.field228;
                }
                var229 = 1;
            } else if (arg0 == 5005) {
                if (Statics.field3004 == null) {
                    field727[++Statics.field736 - 1] = -1;
                } else {
                    field727[++Statics.field736 - 1] = Statics.field3004.field3187;
                }
                var229 = 1;
            } else if (arg0 == 5008) {
                String var239 = field729[--Statics.field695];
                int var240 = field727[--Statics.field736];
                String var241 = var239.toLowerCase();
                byte var242 = 0;
                if (var241.startsWith(class174.field2532)) {
                    var242 = 0;
                    var239 = var239.substring(class174.field2532.length());
                } else if (var241.startsWith(class174.field2475)) {
                    var242 = 1;
                    var239 = var239.substring(class174.field2475.length());
                } else if (var241.startsWith(class174.field2526)) {
                    var242 = 2;
                    var239 = var239.substring(class174.field2526.length());
                } else if (var241.startsWith(class174.field2571)) {
                    var242 = 3;
                    var239 = var239.substring(class174.field2571.length());
                } else if (var241.startsWith(class174.field2570)) {
                    var242 = 4;
                    var239 = var239.substring(class174.field2570.length());
                } else if (var241.startsWith(class174.field2542)) {
                    var242 = 5;
                    var239 = var239.substring(class174.field2542.length());
                } else if (var241.startsWith(class174.field2544)) {
                    var242 = 6;
                    var239 = var239.substring(class174.field2544.length());
                } else if (var241.startsWith(class174.field2546)) {
                    var242 = 7;
                    var239 = var239.substring(class174.field2546.length());
                } else if (var241.startsWith(class174.field2562)) {
                    var242 = 8;
                    var239 = var239.substring(class174.field2562.length());
                } else if (var241.startsWith(class174.field2550)) {
                    var242 = 9;
                    var239 = var239.substring(class174.field2550.length());
                } else if (var241.startsWith(class174.field2552)) {
                    var242 = 10;
                    var239 = var239.substring(class174.field2552.length());
                } else if (var241.startsWith(class174.field2449)) {
                    var242 = 11;
                    var239 = var239.substring(class174.field2449.length());
                } else if (client.field429 != 0) {
                    if (var241.startsWith(class174.field2533)) {
                        var242 = 0;
                        var239 = var239.substring(class174.field2533.length());
                    } else if (var241.startsWith(class174.field2535)) {
                        var242 = 1;
                        var239 = var239.substring(class174.field2535.length());
                    } else if (var241.startsWith(class174.field2537)) {
                        var242 = 2;
                        var239 = var239.substring(class174.field2537.length());
                    } else if (var241.startsWith(class174.field2539)) {
                        var242 = 3;
                        var239 = var239.substring(class174.field2539.length());
                    } else if (var241.startsWith(class174.field2541)) {
                        var242 = 4;
                        var239 = var239.substring(class174.field2541.length());
                    } else if (var241.startsWith(class174.field2415)) {
                        var242 = 5;
                        var239 = var239.substring(class174.field2415.length());
                    } else if (var241.startsWith(class174.field2545)) {
                        var242 = 6;
                        var239 = var239.substring(class174.field2545.length());
                    } else if (var241.startsWith(class174.field2512)) {
                        var242 = 7;
                        var239 = var239.substring(class174.field2512.length());
                    } else if (var241.startsWith(class174.field2484)) {
                        var242 = 8;
                        var239 = var239.substring(class174.field2484.length());
                    } else if (var241.startsWith(class174.field2604)) {
                        var242 = 9;
                        var239 = var239.substring(class174.field2604.length());
                    } else if (var241.startsWith(class174.field2553)) {
                        var242 = 10;
                        var239 = var239.substring(class174.field2553.length());
                    } else if (var241.startsWith(class174.field2555)) {
                        var242 = 11;
                        var239 = var239.substring(class174.field2555.length());
                    }
                }
                String var243 = var239.toLowerCase();
                byte var244 = 0;
                if (var243.startsWith(class174.field2503)) {
                    var244 = 1;
                    var239 = var239.substring(class174.field2503.length());
                } else if (var243.startsWith(class174.field2362)) {
                    var244 = 2;
                    var239 = var239.substring(class174.field2362.length());
                } else if (var243.startsWith(class174.field2376)) {
                    var244 = 3;
                    var239 = var239.substring(class174.field2376.length());
                } else if (var243.startsWith(class174.field2370)) {
                    var244 = 4;
                    var239 = var239.substring(class174.field2370.length());
                } else if (var243.startsWith(class174.field2564)) {
                    var244 = 5;
                    var239 = var239.substring(class174.field2564.length());
                } else if (client.field429 != 0) {
                    if (var243.startsWith(class174.field2557)) {
                        var244 = 1;
                        var239 = var239.substring(class174.field2557.length());
                    } else if (var243.startsWith(class174.field2482)) {
                        var244 = 2;
                        var239 = var239.substring(class174.field2482.length());
                    } else if (var243.startsWith(class174.field2561)) {
                        var244 = 3;
                        var239 = var239.substring(class174.field2561.length());
                    } else if (var243.startsWith(class174.field2563)) {
                        var244 = 4;
                        var239 = var239.substring(class174.field2563.length());
                    } else if (var243.startsWith(class174.field2462)) {
                        var244 = 5;
                        var239 = var239.substring(class174.field2462.length());
                    }
                }
                client.field333.method2948(27);
                client.field333.method2688(0);
                int var245 = client.field333.field2087;
                client.field333.method2688(var240);
                client.field333.method2688(var242);
                client.field333.method2688(var244);
                class160 var246 = client.field333;
                int var247 = var246.field2087;
                byte[] var248 = class204.method613(var239);
                var246.method2832(var248.length);
                var246.field2087 += Statics.field3130.method2614(var248, 0, var248.length, var246.field2086, var246.field2087);
                client.field333.method2698(client.field333.field2087 - var245);
                var229 = 1;
            } else if (arg0 == 5009) {
                Statics.field695 -= 2;
                String var249 = field729[Statics.field695];
                String var250 = field729[Statics.field695 + 1];
                client.field333.method2948(173);
                client.field333.method2687(0);
                int var251 = client.field333.field2087;
                client.field333.method2730(var249);
                class160 var252 = client.field333;
                int var253 = var252.field2087;
                byte[] var254 = class204.method613(var250);
                var252.method2832(var254.length);
                var252.field2087 += Statics.field3130.method2614(var254, 0, var254.length, var252.field2086, var252.field2087);
                client.field333.method2697(client.field333.field2087 - var251);
                var229 = 1;
            } else if (arg0 == 5015) {
                String var255;
                if (Statics.field186 == null || Statics.field186.field244 == null) {
                    var255 = "";
                } else {
                    var255 = Statics.field186.field244;
                }
                field729[++Statics.field695 - 1] = var255;
                var229 = 1;
            } else if (arg0 == 5016) {
                field727[++Statics.field736 - 1] = client.field446;
                var229 = 1;
            } else if (arg0 == 5017) {
                int var256 = field727[--Statics.field736];
                int[] var257 = field727;
                int var258 = ++Statics.field736 - 1;
                class51 var259 = (class51) class48.field950.get(var256);
                int var260;
                if (var259 == null) {
                    var260 = 0;
                } else {
                    var260 = var259.method962();
                }
                var257[var258] = var260;
                var229 = 1;
            } else if (arg0 == 5018) {
                int var261 = field727[--Statics.field736];
                int[] var262 = field727;
                int var263 = ++Statics.field736 - 1;
                class22 var264 = (class22) class48.field944.method2253((long) var261);
                int var265;
                if (var264 == null) {
                    var265 = -1;
                } else if (class48.field945.field1904 == var264.field1889) {
                    var265 = -1;
                } else {
                    var265 = ((class22) var264.field1889).field227;
                }
                var262[var263] = var265;
                var229 = 1;
            } else if (arg0 == 5019) {
                int var266 = field727[--Statics.field736];
                int[] var267 = field727;
                int var268 = ++Statics.field736 - 1;
                class22 var269 = (class22) class48.field944.method2253((long) var266);
                int var270;
                if (var269 == null) {
                    var270 = -1;
                } else if (class48.field945.field1904 == var269.field1890) {
                    var270 = -1;
                } else {
                    var270 = ((class22) var269.field1890).field227;
                }
                var267[var268] = var270;
                var229 = 1;
            } else if (arg0 == 5020) {
                String var271 = field729[--Statics.field695];
                client.method3273(var271);
                var229 = 1;
            } else if (arg0 == 5021) {
                client.field510 = field729[--Statics.field695].toLowerCase().trim();
                var229 = 1;
            } else if (arg0 == 5022) {
                field729[++Statics.field695 - 1] = client.field510;
                var229 = 1;
            } else {
                var229 = 2;
            }
            return var229;
        } else if (arg0 < 5400) {
            byte var275;
            if (arg0 == 5306) {
                int[] var272 = field727;
                int var273 = ++Statics.field736 - 1;
                int var274 = client.field504 ? 2 : 1;
                var272[var273] = var274;
                var275 = 1;
            } else if (arg0 == 5307) {
                int var276 = field727[--Statics.field736];
                if (var276 == 1 || var276 == 2) {
                    client.field331 = 0L;
                    if (var276 >= 2) {
                        client.field504 = true;
                    } else {
                        client.field504 = false;
                    }
                    client.method1901();
                    if (client.field294 >= 25) {
                        client.method2537();
                    }
                    class114.field1779 = true;
                }
                var275 = 1;
            } else if (arg0 == 5308) {
                field727[++Statics.field736 - 1] = Statics.field2945.field698;
                var275 = 1;
            } else if (arg0 == 5309) {
                int var277 = field727[--Statics.field736];
                if (var277 == 1 || var277 == 2) {
                    Statics.field2945.field698 = var277;
                    class31.method2626();
                }
                var275 = 1;
            } else {
                var275 = 2;
            }
            return var275;
        } else if (arg0 < 5600) {
            return method2048(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            byte var278;
            if (arg0 == 5630) {
                client.field343 = 250;
                var278 = 1;
            } else {
                var278 = 2;
            }
            return var278;
        } else if (arg0 < 6300) {
            return method1467(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method2230(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fv.v(ILat;ZI)I")
    public static int method3059(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field727[--Statics.field736];
            var4 = class170.method971(var3);
        } else {
            var4 = arg2 ? Statics.field732 : Statics.field1739;
        }
        if (arg0 == 1000) {
            Statics.field736 -= 4;
            var4.field2216 = field727[Statics.field736];
            var4.field2217 = field727[Statics.field736 + 1];
            var4.field2212 = field727[Statics.field736 + 2];
            var4.field2213 = field727[Statics.field736 + 3];
            client.method974(var4);
            client.method3136(var4);
            if (var3 != -1 && var4.field2209 == 0) {
                Statics.method954(Statics.field3297[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field736 -= 4;
            var4.field2218 = field727[Statics.field736];
            var4.field2200 = field727[Statics.field736 + 1];
            var4.field2214 = field727[Statics.field736 + 2];
            var4.field2215 = field727[Statics.field736 + 3];
            client.method974(var4);
            client.method3136(var4);
            if (var3 != -1 && var4.field2209 == 0) {
                Statics.method954(Statics.field3297[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field727[--Statics.field736] == 1;
            if (var4.field2225 != var5) {
                var4.field2225 = var5;
                client.method974(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2236 = field727[--Statics.field736] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2341 = field727[--Statics.field736] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.y(ILat;ZI)I")
    public static int method162(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field727[--Statics.field736];
            var4 = class170.method971(var3);
        } else {
            var4 = arg2 ? Statics.field732 : Statics.field1739;
        }
        if (arg0 == 1100) {
            Statics.field736 -= 2;
            var4.field2228 = field727[Statics.field736];
            if (var4.field2228 > var4.field2251 - var4.field2249) {
                var4.field2228 = var4.field2251 - var4.field2249;
            }
            if (var4.field2228 < 0) {
                var4.field2228 = 0;
            }
            var4.field2229 = field727[Statics.field736 + 1];
            if (var4.field2229 > var4.field2206 - var4.field2223) {
                var4.field2229 = var4.field2206 - var4.field2223;
            }
            if (var4.field2229 < 0) {
                var4.field2229 = 0;
            }
            client.method974(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2324 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2262 = field727[--Statics.field736] == 1;
            client.method974(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2238 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2240 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2242 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2292 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2245 = field727[--Statics.field736] == 1;
            client.method974(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2250 = 1;
            var4.field2331 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field736 -= 6;
            var4.field2256 = field727[Statics.field736];
            var4.field2257 = field727[Statics.field736 + 1];
            var4.field2258 = field727[Statics.field736 + 2];
            var4.field2332 = field727[Statics.field736 + 3];
            var4.field2260 = field727[Statics.field736 + 4];
            var4.field2261 = field727[Statics.field736 + 5];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field727[--Statics.field736];
            if (var4.field2234 != var5) {
                var4.field2234 = var5;
                var4.field2329 = 0;
                var4.field2330 = 0;
                client.method974(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2264 = field727[--Statics.field736] == 1;
            client.method974(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field729[--Statics.field695];
            if (!var6.equals(var4.field2267)) {
                var4.field2267 = var6;
                client.method974(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2266 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field736 -= 3;
            var4.field2270 = field727[Statics.field736];
            var4.field2271 = field727[Statics.field736 + 1];
            var4.field2269 = field727[Statics.field736 + 2];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2272 = field727[--Statics.field736] == 1;
            client.method974(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2246 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2247 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2283 = field727[--Statics.field736] == 1;
            client.method974(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2241 = field727[--Statics.field736] == 1;
            client.method974(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field736 -= 2;
            var4.field2251 = field727[Statics.field736];
            var4.field2206 = field727[Statics.field736 + 1];
            client.method974(var4);
            if (var3 != -1 && var4.field2209 == 0) {
                Statics.method954(Statics.field3297[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method2014(var4.field2207, var4.field2291);
            client.field544 = var4;
            client.method974(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2232 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2233 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2197 = field727[--Statics.field736];
            client.method974(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field727[--Statics.field736];
            class222 var8 = (class222) class149.method208(class222.method3783(), var7);
            if (var8 != null) {
                var4.field2237 = var8;
                client.method974(var4);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("a.s(ILat;ZI)I")
    public static int method108(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method971(field727[--Statics.field736]);
        } else {
            var3 = arg2 ? Statics.field732 : Statics.field1739;
        }
        String var4 = field729[--Statics.field695];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field727[--Statics.field736];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field727[--Statics.field736];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field729[--Statics.field695];
            } else {
                var7[var8] = Integer.valueOf(field727[--Statics.field736]);
            }
        }
        int var9 = field727[--Statics.field736];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2289 = var7;
        } else if (arg0 == 1401) {
            var3.field2204 = var7;
        } else if (arg0 == 1402) {
            var3.field2275 = var7;
        } else if (arg0 == 1403) {
            var3.field2293 = var7;
        } else if (arg0 == 1404) {
            var3.field2295 = var7;
        } else if (arg0 == 1405) {
            var3.field2312 = var7;
        } else if (arg0 == 1406) {
            var3.field2299 = var7;
        } else if (arg0 == 1407) {
            var3.field2300 = var7;
            var3.field2254 = var5;
        } else if (arg0 == 1408) {
            var3.field2306 = var7;
        } else if (arg0 == 1409) {
            var3.field2307 = var7;
        } else if (arg0 == 1410) {
            var3.field2297 = var7;
        } else if (arg0 == 1411) {
            var3.field2208 = var7;
        } else if (arg0 == 1412) {
            var3.field2294 = var7;
        } else if (arg0 == 1414) {
            var3.field2302 = var7;
            var3.field2303 = var5;
        } else if (arg0 == 1415) {
            var3.field2304 = var7;
            var3.field2305 = var5;
        } else if (arg0 == 1416) {
            var3.field2253 = var7;
        } else if (arg0 == 1417) {
            var3.field2308 = var7;
        } else if (arg0 == 1418) {
            var3.field2309 = var7;
        } else if (arg0 == 1419) {
            var3.field2310 = var7;
        } else if (arg0 == 1420) {
            var3.field2287 = var7;
        } else if (arg0 == 1421) {
            var3.field2323 = var7;
        } else if (arg0 == 1422) {
            var3.field2313 = var7;
        } else if (arg0 == 1423) {
            var3.field2314 = var7;
        } else if (arg0 == 1424) {
            var3.field2315 = var7;
        } else if (arg0 == 1425) {
            var3.field2277 = var7;
        } else if (arg0 == 1426) {
            var3.field2318 = var7;
        } else if (arg0 == 1427) {
            var3.field2316 = var7;
        } else {
            return 2;
        }
        var3.field2222 = true;
        return 1;
    }

    @ObfuscatedName("client.k(ILat;ZI)I")
    public static int method609(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = arg2 ? Statics.field732 : Statics.field1739;
        if (arg0 == 1700) {
            field727[++Statics.field736 - 1] = var3.field2219;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2219 == -1) {
                field727[++Statics.field736 - 1] = 0;
            } else {
                field727[++Statics.field736 - 1] = var3.field2311;
            }
            return 1;
        } else if (arg0 == 1702) {
            field727[++Statics.field736 - 1] = var3.field2291;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cp.f(ILat;ZI)I")
    public static int method1708(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method971(field727[--Statics.field736]);
        } else {
            var3 = arg2 ? Statics.field732 : Statics.field1739;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field731 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2316 == null) {
            return 0;
        } else {
            class19 var4 = new class19();
            var4.field189 = var3;
            var4.field197 = var3.field2316;
            var4.field188 = field731 + 1;
            client.field489.method2360(var4);
            return 1;
        }
    }

    @ObfuscatedName("ac.o(ILat;ZI)I")
    public static int method626(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = class170.method971(field727[--Statics.field736]);
        if (arg0 == 2500) {
            field727[++Statics.field736 - 1] = var3.field2220;
            return 1;
        } else if (arg0 == 2501) {
            field727[++Statics.field736 - 1] = var3.field2221;
            return 1;
        } else if (arg0 == 2502) {
            field727[++Statics.field736 - 1] = var3.field2249;
            return 1;
        } else if (arg0 == 2503) {
            field727[++Statics.field736 - 1] = var3.field2223;
            return 1;
        } else if (arg0 == 2504) {
            field727[++Statics.field736 - 1] = var3.field2225 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field727[++Statics.field736 - 1] = var3.field2226;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("a.q(ILat;ZB)I")
    public static int method105(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class170 var3 = class170.method971(field727[--Statics.field736]);
            field727[++Statics.field736 - 1] = var3.field2219;
            return 1;
        } else if (arg0 == 2701) {
            class170 var4 = class170.method971(field727[--Statics.field736]);
            if (var4.field2219 == -1) {
                field727[++Statics.field736 - 1] = 0;
            } else {
                field727[++Statics.field736 - 1] = var4.field2311;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field727[--Statics.field736];
            class18 var6 = (class18) client.field302.method2286((long) var5);
            if (var6 == null) {
                field727[++Statics.field736 - 1] = 0;
            } else {
                field727[++Statics.field736 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field727[++Statics.field736 - 1] = client.field450;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.c(ILat;ZB)I")
    public static int method960(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = class170.method971(field727[--Statics.field736]);
        if (arg0 == 2800) {
            int[] var4 = field727;
            int var5 = ++Statics.field736 - 1;
            int var6 = client.method221(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 2801) {
            int var8 = field727[--Statics.field736];
            int var9 = var8 - 1;
            if (var3.field2281 == null || var9 >= var3.field2281.length || var3.field2281[var9] == null) {
                field729[++Statics.field695 - 1] = "";
            } else {
                field729[++Statics.field695 - 1] = var3.field2281[var9];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2280 == null) {
                field729[++Statics.field695 - 1] = "";
            } else {
                field729[++Statics.field695 - 1] = var3.field2280;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.b(ILat;ZB)I")
    public static int method941(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field736 -= 3;
            int var3 = field727[Statics.field736];
            int var4 = field727[Statics.field736 + 1];
            int var5 = field727[Statics.field736 + 2];
            if (client.field531 != 0 && var4 != 0 && client.field533 < 50) {
                client.field534[client.field533] = var3;
                client.field535[client.field533] = var4;
                client.field536[client.field533] = var5;
                client.field538[client.field533] = null;
                client.field537[client.field533] = 0;
                client.field533++;
            }
            return 1;
        } else if (arg0 == 3201) {
            Statics.method2982(field727[--Statics.field736]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field736 -= 2;
            int var6 = field727[Statics.field736];
            int var7 = field727[Statics.field736 + 1];
            if (client.field545 != 0 && var6 != -1) {
                class139.method873(Statics.field176, var6, 0, client.field545, false);
                client.field440 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dg.w(ILat;ZS)I")
    public static int method2096(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field559 == 0) {
                field727[++Statics.field736 - 1] = -2;
            } else if (client.field559 == 1) {
                field727[++Statics.field736 - 1] = -1;
            } else {
                field727[++Statics.field736 - 1] = client.field348;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field727[--Statics.field736];
            if (client.field559 == 2 && var3 < client.field348) {
                field729[++Statics.field695 - 1] = client.field560[var3].field138;
                field729[++Statics.field695 - 1] = client.field560[var3].field139;
            } else {
                field729[++Statics.field695 - 1] = "";
                field729[++Statics.field695 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = field727[--Statics.field736];
            if (client.field559 == 2 && var4 < client.field348) {
                field727[++Statics.field736 - 1] = client.field560[var4].field140;
            } else {
                field727[++Statics.field736 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = field727[--Statics.field736];
            if (client.field559 == 2 && var5 < client.field348) {
                field727[++Statics.field736 - 1] = client.field560[var5].field145;
            } else {
                field727[++Statics.field736 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = field729[--Statics.field695];
            int var7 = field727[--Statics.field736];
            client.field333.method2948(48);
            client.field333.method2688(class154.method3037(var6) + 1);
            client.field333.method2688(var7);
            client.field333.method2730(var6);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = field729[--Statics.field695];
            client.method572(var8);
            return 1;
        } else if (arg0 == 3606) {
            String var9 = field729[--Statics.field695];
            client.method205(var9);
            return 1;
        } else if (arg0 == 3607) {
            String var10 = field729[--Statics.field695];
            client.method796(var10, false);
            return 1;
        } else if (arg0 == 3608) {
            String var11 = field729[--Statics.field695];
            client.method804(var11);
            return 1;
        } else if (arg0 == 3609) {
            String var12 = field729[--Statics.field695];
            class178[] var13 = class178.method13();
            for (int var14 = 0; var14 < var13.length; var14++) {
                class178 var15 = var13[var14];
                if (var15.field2666 != -1) {
                    int var17 = var15.field2666;
                    String var18 = "<img=" + var17 + ">";
                    if (var12.startsWith(var18)) {
                        var12 = var12.substring(6 + Integer.toString(var15.field2666).length());
                        break;
                    }
                }
            }
            field727[++Statics.field736 - 1] = client.method216(var12, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field517 == null) {
                field729[++Statics.field695 - 1] = "";
            } else {
                String[] var19 = field729;
                int var20 = ++Statics.field695 - 1;
                String var21 = client.field517;
                long var22 = 0L;
                int var24 = var21.length();
                for (int var25 = 0; var25 < var24; var25++) {
                    var22 *= 37L;
                    char var26 = var21.charAt(var25);
                    if (var26 >= 'A' && var26 <= 'Z') {
                        var22 += (long) (var26 + 1 - 65);
                    } else if (var26 >= 'a' && var26 <= 'z') {
                        var22 += (long) (var26 + 1 - 97);
                    } else if (var26 >= '0' && var26 <= '9') {
                        var22 += (long) (var26 + 27 - 48);
                    }
                    if (var22 >= 177917621779460413L) {
                        break;
                    }
                }
                while (var22 % 37L == 0L && var22 != 0L) {
                    var22 /= 37L;
                }
                String var29 = class206.method1924(var22);
                if (var29 == null) {
                    var29 = "";
                }
                var19[var20] = var29;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field517 == null) {
                field727[++Statics.field736 - 1] = 0;
            } else {
                field727[++Statics.field736 - 1] = Statics.field1861;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var31 = field727[--Statics.field736];
            if (client.field517 == null || var31 >= Statics.field1861) {
                field729[++Statics.field695 - 1] = "";
            } else {
                field729[++Statics.field695 - 1] = Statics.field146[var31].field272;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var32 = field727[--Statics.field736];
            if (client.field517 == null || var32 >= Statics.field1861) {
                field727[++Statics.field736 - 1] = 0;
            } else {
                field727[++Statics.field736 - 1] = Statics.field146[var32].field274;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var33 = field727[--Statics.field736];
            if (client.field517 == null || var33 >= Statics.field1861) {
                field727[++Statics.field736 - 1] = 0;
            } else {
                field727[++Statics.field736 - 1] = Statics.field146[var33].field278;
            }
            return 1;
        } else if (arg0 == 3616) {
            field727[++Statics.field736 - 1] = Statics.field738;
            return 1;
        } else if (arg0 == 3617) {
            String var34 = field729[--Statics.field695];
            client.method3638(var34);
            return 1;
        } else if (arg0 == 3618) {
            field727[++Statics.field736 - 1] = Statics.field519;
            return 1;
        } else if (arg0 == 3619) {
            String var35 = field729[--Statics.field695];
            client.method36(var35);
            return 1;
        } else if (arg0 == 3620) {
            client.field333.method2948(194);
            client.field333.method2688(0);
            return 1;
        } else if (arg0 == 3621) {
            if (client.field559 == 0) {
                field727[++Statics.field736 - 1] = -1;
            } else {
                field727[++Statics.field736 - 1] = client.field567;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var36 = field727[--Statics.field736];
            if (client.field559 == 0 || var36 >= client.field567) {
                field729[++Statics.field695 - 1] = "";
                field729[++Statics.field695 - 1] = "";
            } else {
                field729[++Statics.field695 - 1] = client.field525[var36].field205;
                field729[++Statics.field695 - 1] = client.field525[var36].field207;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var37;
            label273: {
                var37 = field729[--Statics.field695];
                String var39 = "<img=0>";
                if (!var37.startsWith(var39)) {
                    String var41 = "<img=1>";
                    if (!var37.startsWith(var41)) {
                        break label273;
                    }
                }
                var37 = var37.substring(7);
            }
            field727[++Statics.field736 - 1] = Statics.method190(var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var42 = field727[--Statics.field736];
            if (Statics.field146 == null || var42 >= Statics.field1861 || !Statics.field146[var42].field272.equalsIgnoreCase(Statics.field186.field244)) {
                field727[++Statics.field736 - 1] = 0;
            } else {
                field727[++Statics.field736 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field518 == null) {
                field729[++Statics.field695 - 1] = "";
            } else {
                String[] var43 = field729;
                int var44 = ++Statics.field695 - 1;
                String var45 = client.field518;
                long var46 = 0L;
                int var48 = var45.length();
                for (int var49 = 0; var49 < var48; var49++) {
                    var46 *= 37L;
                    char var50 = var45.charAt(var49);
                    if (var50 >= 'A' && var50 <= 'Z') {
                        var46 += (long) (var50 + 1 - 65);
                    } else if (var50 >= 'a' && var50 <= 'z') {
                        var46 += (long) (var50 + 1 - 97);
                    } else if (var50 >= '0' && var50 <= '9') {
                        var46 += (long) (var50 + 27 - 48);
                    }
                    if (var46 >= 177917621779460413L) {
                        break;
                    }
                }
                while (var46 % 37L == 0L && var46 != 0L) {
                    var46 /= 37L;
                }
                String var53 = class206.method1924(var46);
                if (var53 == null) {
                    var53 = "";
                }
                var43[var44] = var53;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("r.l(ILat;ZI)I")
    public static int method207(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field727[--Statics.field736];
            field727[++Statics.field736 - 1] = client.field356[var3].method51();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field727[--Statics.field736];
            field727[++Statics.field736 - 1] = client.field356[var4].field26;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field727[--Statics.field736];
            field727[++Statics.field736 - 1] = client.field356[var5].field27;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field727[--Statics.field736];
            field727[++Statics.field736 - 1] = client.field356[var6].field28;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field727[--Statics.field736];
            field727[++Statics.field736 - 1] = client.field356[var7].field30;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field727[--Statics.field736];
            field727[++Statics.field736 - 1] = client.field356[var8].field36;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field727[--Statics.field736];
            int var10 = client.field356[var9].method55();
            field727[++Statics.field736 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field727[--Statics.field736];
            int var12 = client.field356[var11].method55();
            field727[++Statics.field736 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field727[--Statics.field736];
            int var14 = client.field356[var13].method55();
            field727[++Statics.field736 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field727[--Statics.field736];
            int var16 = client.field356[var15].method55();
            field727[++Statics.field736 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field727[--Statics.field736] == 1;
            if (Statics.field1550 != null) {
                Statics.field1550.method16(class2.field7, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field727[--Statics.field736] == 1;
            if (Statics.field1550 != null) {
                Statics.field1550.method16(class2.field11, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field736 -= 2;
            boolean var19 = field727[Statics.field736] == 1;
            boolean var20 = field727[Statics.field736 + 1] == 1;
            if (Statics.field1550 != null) {
                Statics.field1550.method16(new class45(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field727[--Statics.field736] == 1;
            if (Statics.field1550 != null) {
                Statics.field1550.method16(class2.field5, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field727[--Statics.field736] == 1;
            if (Statics.field1550 != null) {
                Statics.field1550.method16(class2.field8, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field727[++Statics.field736 - 1] = Statics.field1550 == null ? 0 : Statics.field1550.field10.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field727[--Statics.field736];
            class3 var24 = (class3) Statics.field1550.field10.get(var23);
            field727[++Statics.field736 - 1] = var24.field17;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field727[--Statics.field736];
            class3 var26 = (class3) Statics.field1550.field10.get(var25);
            field729[++Statics.field695 - 1] = var26.method31();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field727[--Statics.field736];
            class3 var28 = (class3) Statics.field1550.field10.get(var27);
            field729[++Statics.field695 - 1] = var28.method25();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field727[--Statics.field736];
            class3 var30 = (class3) Statics.field1550.field10.get(var29);
            long var31 = class156.method1898() - Statics.field1543 - var30.field12;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field729[++Statics.field695 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field727[--Statics.field736];
            class3 var38 = (class3) Statics.field1550.field10.get(var37);
            field727[++Statics.field736 - 1] = var38.field14.field28;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field727[--Statics.field736];
            class3 var40 = (class3) Statics.field1550.field10.get(var39);
            field727[++Statics.field736 - 1] = var40.field14.field27;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field727[--Statics.field736];
            class3 var42 = (class3) Statics.field1550.field10.get(var41);
            field727[++Statics.field736 - 1] = var42.field14.field26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("co.r(ILat;ZB)I")
    public static int method1644(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field736 -= 2;
            int var3 = field727[Statics.field736];
            int var4 = field727[Statics.field736 + 1];
            field727[++Statics.field736 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field736 -= 2;
            int var5 = field727[Statics.field736];
            int var6 = field727[Statics.field736 + 1];
            field727[++Statics.field736 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field736 -= 2;
            int var7 = field727[Statics.field736];
            int var8 = field727[Statics.field736 + 1];
            field727[++Statics.field736 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field736 -= 2;
            int var9 = field727[Statics.field736];
            int var10 = field727[Statics.field736 + 1];
            field727[++Statics.field736 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field727[--Statics.field736];
            field727[++Statics.field736 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field727[--Statics.field736];
            field727[++Statics.field736 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field736 -= 5;
            int var13 = field727[Statics.field736];
            int var14 = field727[Statics.field736 + 1];
            int var15 = field727[Statics.field736 + 2];
            int var16 = field727[Statics.field736 + 3];
            int var17 = field727[Statics.field736 + 4];
            field727[++Statics.field736 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field736 -= 2;
            int var18 = field727[Statics.field736];
            int var19 = field727[Statics.field736 + 1];
            field727[++Statics.field736 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field736 -= 2;
            int var20 = field727[Statics.field736];
            int var21 = field727[Statics.field736 + 1];
            field727[++Statics.field736 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field736 -= 2;
            int var22 = field727[Statics.field736];
            int var23 = field727[Statics.field736 + 1];
            field727[++Statics.field736 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field736 -= 2;
            int var24 = field727[Statics.field736];
            int var25 = field727[Statics.field736 + 1];
            field727[++Statics.field736 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field736 -= 2;
            int var26 = field727[Statics.field736];
            int var27 = field727[Statics.field736 + 1];
            field727[++Statics.field736 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field736 -= 2;
            int var28 = field727[Statics.field736];
            int var29 = field727[Statics.field736 + 1];
            if (var28 == 0) {
                field727[++Statics.field736 - 1] = 0;
            } else {
                field727[++Statics.field736 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field736 -= 2;
            int var30 = field727[Statics.field736];
            int var31 = field727[Statics.field736 + 1];
            if (var30 == 0) {
                field727[++Statics.field736 - 1] = 0;
            } else if (var31 == 0) {
                field727[++Statics.field736 - 1] = Integer.MAX_VALUE;
            } else {
                field727[++Statics.field736 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field736 -= 2;
            int var32 = field727[Statics.field736];
            int var33 = field727[Statics.field736 + 1];
            field727[++Statics.field736 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field736 -= 2;
            int var34 = field727[Statics.field736];
            int var35 = field727[Statics.field736 + 1];
            field727[++Statics.field736 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field736 -= 3;
            long var36 = (long) field727[Statics.field736];
            long var38 = (long) field727[Statics.field736 + 1];
            long var40 = (long) field727[Statics.field736 + 2];
            field727[++Statics.field736 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.u(ILat;ZI)I")
    public static int method2048(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field736 -= 2;
            int var3 = field727[Statics.field736];
            int var4 = field727[Statics.field736 + 1];
            if (!client.field460) {
                client.field373 = var3;
                client.field374 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field727[++Statics.field736 - 1] = client.field373;
            return 1;
        } else if (arg0 == 5506) {
            field727[++Statics.field736 - 1] = client.field374;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field727[--Statics.field736];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field379 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field727[++Statics.field736 - 1] = client.field379;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.e(ILat;ZI)I")
    public static int method1467(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field736 -= 2;
            client.field473 = (short) field727[Statics.field736];
            if (client.field473 <= 0) {
                client.field473 = 256;
            }
            client.field546 = (short) field727[Statics.field736 + 1];
            if (client.field546 <= 0) {
                client.field546 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field736 -= 2;
            client.field572 = (short) field727[Statics.field736];
            if (client.field572 <= 0) {
                client.field572 = 256;
            }
            client.field548 = (short) field727[Statics.field736 + 1];
            if (client.field548 <= 0) {
                client.field548 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field736 -= 4;
            client.field549 = (short) field727[Statics.field736];
            if (client.field549 <= 0) {
                client.field549 = 1;
            }
            client.field550 = (short) field727[Statics.field736 + 1];
            if (client.field550 <= 0) {
                client.field550 = 32767;
            } else if (client.field550 < client.field549) {
                client.field550 = client.field549;
            }
            client.field551 = (short) field727[Statics.field736 + 2];
            if (client.field551 <= 0) {
                client.field551 = 1;
            }
            client.field552 = (short) field727[Statics.field736 + 3];
            if (client.field552 <= 0) {
                client.field552 = 32767;
            } else if (client.field552 < client.field551) {
                client.field552 = client.field551;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field462 == null) {
                field727[++Statics.field736 - 1] = -1;
                field727[++Statics.field736 - 1] = -1;
            } else {
                client.method1902(0, 0, client.field462.field2249, client.field462.field2223, false);
                field727[++Statics.field736 - 1] = client.field555;
                field727[++Statics.field736 - 1] = client.field556;
            }
            return 1;
        } else if (arg0 == 6204) {
            field727[++Statics.field736 - 1] = client.field572;
            field727[++Statics.field736 - 1] = client.field548;
            return 1;
        } else if (arg0 == 6205) {
            field727[++Statics.field736 - 1] = client.field473;
            field727[++Statics.field736 - 1] = client.field546;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dd.h(ILat;ZI)I")
    public static int method2230(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field727[++Statics.field736 - 1] = class30.method2989() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class30 var3 = class30.method3147();
            if (var3 == null) {
                field727[++Statics.field736 - 1] = -1;
                field727[++Statics.field736 - 1] = 0;
                field729[++Statics.field695 - 1] = "";
                field727[++Statics.field736 - 1] = 0;
                field727[++Statics.field736 - 1] = 0;
                field729[++Statics.field695 - 1] = "";
            } else {
                field727[++Statics.field736 - 1] = var3.field673;
                field727[++Statics.field736 - 1] = var3.field681;
                field729[++Statics.field695 - 1] = var3.field684;
                field727[++Statics.field736 - 1] = var3.field688;
                field727[++Statics.field736 - 1] = var3.field682;
                field729[++Statics.field695 - 1] = var3.field683;
            }
            return 1;
        } else if (arg0 == 6502) {
            class30 var4 = class30.method160();
            if (var4 == null) {
                field727[++Statics.field736 - 1] = -1;
                field727[++Statics.field736 - 1] = 0;
                field729[++Statics.field695 - 1] = "";
                field727[++Statics.field736 - 1] = 0;
                field727[++Statics.field736 - 1] = 0;
                field729[++Statics.field695 - 1] = "";
            } else {
                field727[++Statics.field736 - 1] = var4.field673;
                field727[++Statics.field736 - 1] = var4.field681;
                field729[++Statics.field695 - 1] = var4.field684;
                field727[++Statics.field736 - 1] = var4.field688;
                field727[++Statics.field736 - 1] = var4.field682;
                field729[++Statics.field695 - 1] = var4.field683;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field727[--Statics.field736];
            class30 var6 = null;
            for (int var7 = 0; var7 < class30.field676; var7++) {
                if (Statics.field754[var7].field673 == var5) {
                    var6 = Statics.field754[var7];
                    break;
                }
            }
            if (var6 == null) {
                field727[++Statics.field736 - 1] = -1;
                field727[++Statics.field736 - 1] = 0;
                field729[++Statics.field695 - 1] = "";
                field727[++Statics.field736 - 1] = 0;
                field727[++Statics.field736 - 1] = 0;
                field729[++Statics.field695 - 1] = "";
            } else {
                field727[++Statics.field736 - 1] = var6.field673;
                field727[++Statics.field736 - 1] = var6.field681;
                field729[++Statics.field695 - 1] = var6.field684;
                field727[++Statics.field736 - 1] = var6.field688;
                field727[++Statics.field736 - 1] = var6.field682;
                field729[++Statics.field695 - 1] = var6.field683;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field736 -= 4;
            int var8 = field727[Statics.field736];
            boolean var9 = field727[Statics.field736 + 1] == 1;
            int var10 = field727[Statics.field736 + 2];
            boolean var11 = field727[Statics.field736 + 3] == 1;
            class30.method860(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field727[--Statics.field736];
            if (var12 >= 0 && var12 < class30.field676) {
                class30 var13 = Statics.field754[var12];
                field727[++Statics.field736 - 1] = var13.field673;
                field727[++Statics.field736 - 1] = var13.field681;
                field729[++Statics.field695 - 1] = var13.field684;
                field727[++Statics.field736 - 1] = var13.field688;
                field727[++Statics.field736 - 1] = var13.field682;
                field729[++Statics.field695 - 1] = var13.field683;
            } else {
                field727[++Statics.field736 - 1] = -1;
                field727[++Statics.field736 - 1] = 0;
                field729[++Statics.field695 - 1] = "";
                field727[++Statics.field736 - 1] = 0;
                field727[++Statics.field736 - 1] = 0;
                field729[++Statics.field695 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field547 = field727[--Statics.field736] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dr.d(II)V")
    public static void method2152(int arg0) {
        if (arg0 == -1 || !class170.method859(arg0)) {
            return;
        }
        class170[] var1 = Statics.field3297[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3.field2288 != null) {
                class19 var4 = new class19();
                var4.field189 = var3;
                var4.field197 = var3.field2288;
                method3644(var4, 2000000);
            }
        }
    }
}
