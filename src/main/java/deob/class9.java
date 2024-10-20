package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("k")
public class class9 {

    @ObfuscatedName("k.k")
    public static boolean field137 = false;

    @ObfuscatedName("k.e")
    public static int[] field144 = new int[256];

    @ObfuscatedName("k.g")
    public static int field145 = 0;

    @ObfuscatedName("k.p")
    public static int field160 = 0;

    @ObfuscatedName("k.m")
    public static int field147 = 0;

    @ObfuscatedName("k.ai")
    public static int field151 = 0;

    @ObfuscatedName("k.aa")
    public static int field162 = 0;

    @ObfuscatedName("k.af")
    public static int field149 = 0;

    @ObfuscatedName("k.ae")
    public static int field143 = 10;

    @ObfuscatedName("k.at")
    public static String field152 = "";

    @ObfuscatedName("k.aj")
    public static int field153 = 0;

    @ObfuscatedName("k.ar")
    public static String field154 = "";

    @ObfuscatedName("k.au")
    public static String field146 = "";

    @ObfuscatedName("k.an")
    public static String field156 = "";

    @ObfuscatedName("k.az")
    public static String field157 = "";

    @ObfuscatedName("k.ac")
    public static String field158 = "";

    @ObfuscatedName("k.ap")
    public static int field136 = 0;

    @ObfuscatedName("k.ad")
    public static String field133 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("k.as")
    public static boolean field164 = false;

    @ObfuscatedName("k.ag")
    public static int field159 = 0;

    @ObfuscatedName("k.be")
    public static int[] field169 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("k.bi")
    public static int[] field170 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("k.bp")
    public static int field171 = -1;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.q(B)V")
    public static void method42() {
        if (!Statics.field150) {
            return;
        }
        Statics.field130 = null;
        Statics.field134 = null;
        Statics.field131 = null;
        Statics.field139 = null;
        Statics.field155 = null;
        Statics.field135 = null;
        Statics.field132 = null;
        Statics.field163 = null;
        Statics.field367 = null;
        Statics.field39 = null;
        Statics.field1229 = null;
        Statics.field50 = null;
        Statics.field118 = null;
        Statics.field828 = null;
        Statics.field1480 = null;
        Statics.field165 = null;
        Statics.field826 = null;
        Statics.field1569 = null;
        Statics.field42 = null;
        Statics.field533 = null;
        class79.field1130 = 1;
        Statics.field1125 = null;
        Statics.field563 = -1;
        Statics.field1128 = -1;
        Statics.field736 = 0;
        Statics.field1134 = false;
        Statics.field40 = 2;
        class88.method751(true);
        Statics.field150 = false;
    }

    @ObfuscatedName("bl.l(Ldz;B)V")
    public static void method905(class112 arg0) {
        if (field164) {
            method52(arg0);
            return;
        }
        if (class37.field504 == 1 && class37.field505 >= 715 && class37.field506 >= 453) {
            field137 = !field137;
            if (field137) {
                Statics.field1131.method2286();
                class79.field1130 = 1;
                Statics.field1125 = null;
            } else {
                class121 var1 = Statics.field702;
                int var2 = var1.method1034("scape main");
                int var3 = var1.method1035(var2, "");
                class79.method278(var1, var2, var3, 255, false);
            }
        }
        if (client.field1917 == 5) {
            return;
        }
        field162++;
        if (client.field1917 != 10) {
            return;
        }
        if (client.field2048 == 0) {
            if (class37.field504 == 1) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class37.field505 >= var4 && class37.field505 <= var4 + var6 && class37.field506 >= var5 && class37.field506 <= var5 + var7) {
                    method1230();
                    return;
                }
            }
            if (Statics.field758 != null) {
                method1230();
            }
        }
        int var8 = class37.field504;
        int var9 = class37.field505;
        int var10 = class37.field506;
        if (field153 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field153 = 3;
                field136 = 0;
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field154 = class75.field1009;
                field146 = class75.field1082;
                field156 = class75.field991;
                field153 = 2;
                field136 = 0;
            }
        } else if (field153 == 2) {
            short var14 = 231;
            int var26 = var14 + 30;
            if (var8 == 1 && var10 >= var26 - 15 && var10 < var26) {
                field136 = 0;
            }
            var26 += 15;
            if (var8 == 1 && var10 >= var26 - 15 && var10 < var26) {
                field136 = 1;
            }
            var26 += 15;
            short var15 = 302;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field157 = field157.trim();
                if (field157.length() == 0) {
                    method1352(class75.field992, class75.field993, class75.field994);
                    return;
                }
                if (field158.length() == 0) {
                    method1352(class75.field995, class75.field904, class75.field891);
                    return;
                }
                method1352(class75.field914, class75.field1084, class75.field990);
                client.method1009(20);
                return;
            }
            short var17 = 462;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field153 = 0;
                field157 = "";
                field158 = "";
            }
            while (true) {
                while (true) {
                    class36 var18 = class36.field458;
                    boolean var19;
                    synchronized (class36.field458) {
                        if (class36.field486 == class36.field459) {
                            var19 = false;
                        } else {
                            Statics.field9 = class36.field483[class36.field486];
                            Statics.field1168 = class36.field407[class36.field486];
                            class36.field486 = class36.field486 + 1 & 0x7F;
                            var19 = true;
                        }
                    }
                    if (!var19) {
                        return;
                    }
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field133.length(); var22++) {
                        if (Statics.field1168 == field133.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (field136 == 0) {
                        if (Statics.field9 == 85 && field157.length() > 0) {
                            field157 = field157.substring(0, field157.length() - 1);
                        }
                        if (Statics.field9 == 84 || Statics.field9 == 80) {
                            field136 = 1;
                        }
                        if (var21 && field157.length() < 320) {
                            field157 = field157 + Statics.field1168;
                        }
                    } else if (field136 == 1) {
                        if (Statics.field9 == 85 && field158.length() > 0) {
                            field158 = field158.substring(0, field158.length() - 1);
                        }
                        if (Statics.field9 == 84 || Statics.field9 == 80) {
                            field136 = 0;
                        }
                        if (client.field1911 == 2 && Statics.field9 == 84) {
                            field157 = field157.trim();
                            if (field157.length() == 0) {
                                method1352(class75.field992, class75.field993, class75.field994);
                                return;
                            }
                            if (field158.length() == 0) {
                                method1352(class75.field995, class75.field904, class75.field891);
                                return;
                            }
                            method1352(class75.field914, class75.field1084, class75.field990);
                            client.method1009(20);
                            return;
                        }
                        if (var21 && field158.length() < 20) {
                            field158 = field158 + Statics.field1168;
                        }
                    }
                }
            }
        } else if (field153 == 3) {
            short var23 = 382;
            short var24 = 321;
            if (var8 == 1 && var9 >= var23 - 75 && var9 <= var23 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                field153 = 0;
            }
        }
    }

    @ObfuscatedName("dw.o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1352(String arg0, String arg1, String arg2) {
        field154 = arg0;
        field146 = arg1;
        field156 = arg2;
    }

    @ObfuscatedName("bf.c(Lfm;I)V")
    public static final void method750(class172 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field826.length; var2++) {
            Statics.field826[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field826[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1569[var8] = (Statics.field826[var8 - 1] + Statics.field826[var8 + 1] + Statics.field826[var8 - 128] + Statics.field826[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field826;
            Statics.field826 = Statics.field1569;
            Statics.field1569 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field2516; var11++) {
            for (int var12 = 0; var12 < arg0.field2513; var12++) {
                if (arg0.field2514[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field2517;
                    int var14 = var11 + 16 + arg0.field2515;
                    int var15 = (var14 << 7) + var13;
                    Statics.field826[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cs.h(II)V")
    public static final void method1013(int arg0) {
        short var1 = 256;
        field147 += arg0 * 128;
        if (field147 > Statics.field826.length) {
            field147 -= Statics.field826.length;
            int var2 = (int) (Math.random() * 12.0D);
            method750(Statics.field131[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field42[var3 + var4] - Statics.field826[field147 + var3 & Statics.field826.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field42[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field42[var9 + var10] = 255;
                } else {
                    Statics.field42[var9 + var10] = 0;
                }
            }
        }
        if (field145 > 0) {
            field145 -= arg0 * 4;
        }
        if (field160 > 0) {
            field160 -= arg0 * 4;
        }
        if (field145 == 0 && field160 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field145 = 1024;
            }
            if (var12 == 1) {
                field160 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field144[var13] = field144[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field144[var14] = (int) (Math.sin((double) field149 / 14.0D) * 16.0D + Math.sin((double) field149 / 15.0D) * 14.0D + Math.sin((double) field149 / 16.0D) * 12.0D);
            field149++;
        }
        field151 += arg0 * 1497813717;
        int var15 = ((client.field1919 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field151 * 1570228436; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field42[(var18 << 7) + var17] = 192;
        }
        field151 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field42[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field42[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field533[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field533[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field533[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field42[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bi.r(IIII)I")
    public static final int method734(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("bg.d(Lfs;Lfs;S)V")
    public static void method715(class182 arg0, class182 arg1) {
        if (Statics.field163 == null) {
            Statics.field163 = class40.method346(Statics.field1941, "sl_back", "");
        }
        if (Statics.field367 == null) {
            Statics.field367 = class40.method240(Statics.field1941, "sl_flags", "");
        }
        if (Statics.field39 == null) {
            Statics.field39 = class40.method240(Statics.field1941, "sl_arrows", "");
        }
        if (Statics.field1229 == null) {
            Statics.field1229 = class40.method240(Statics.field1941, "sl_stars", "");
        }
        class165.method2588(0, 23, 765, 480, 0);
        class165.method2593(0, 0, 125, 23, 12425273, 9135624);
        class165.method2593(125, 0, 640, 23, 5197647, 2697513);
        arg0.method2879(class75.field918, 62, 15, 0, -1);
        if (Statics.field1229 != null) {
            Statics.field1229[1].method2752(140, 1);
            arg1.method2852(class75.field1099, 152, 10, 16777215, -1);
            Statics.field1229[0].method2752(140, 12);
            arg1.method2852(class75.field1100, 152, 21, 16777215, -1);
        }
        if (Statics.field39 != null) {
            short var2 = 280;
            if (field169[0] == 0 && field170[0] == 0) {
                Statics.field39[2].method2752(var2, 4);
            } else {
                Statics.field39[0].method2752(var2, 4);
            }
            if (field169[0] == 0 && field170[0] == 1) {
                Statics.field39[3].method2752(var2 + 15, 4);
            } else {
                Statics.field39[1].method2752(var2 + 15, 4);
            }
            arg0.method2852(class75.field1101, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field169[0] == 1 && field170[0] == 0) {
                Statics.field39[2].method2752(var3, 4);
            } else {
                Statics.field39[0].method2752(var3, 4);
            }
            if (field169[0] == 1 && field170[0] == 1) {
                Statics.field39[3].method2752(var3 + 15, 4);
            } else {
                Statics.field39[1].method2752(var3 + 15, 4);
            }
            arg0.method2852(class75.field1102, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field169[0] == 2 && field170[0] == 0) {
                Statics.field39[2].method2752(var4, 4);
            } else {
                Statics.field39[0].method2752(var4, 4);
            }
            if (field169[0] == 2 && field170[0] == 1) {
                Statics.field39[3].method2752(var4 + 15, 4);
            } else {
                Statics.field39[1].method2752(var4 + 15, 4);
            }
            arg0.method2852(class75.field1103, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field169[0] == 3 && field170[0] == 0) {
                Statics.field39[2].method2752(var5, 4);
            } else {
                Statics.field39[0].method2752(var5, 4);
            }
            if (field169[0] == 3 && field170[0] == 1) {
                Statics.field39[3].method2752(var5 + 15, 4);
            } else {
                Statics.field39[1].method2752(var5 + 15, 4);
            }
            arg0.method2852(class75.field1104, var5 + 32, 17, 16777215, -1);
        }
        class165.method2588(708, 4, 50, 16, 0);
        arg1.method2879(class75.field1092, 733, 16, 16777215, -1);
        field171 = -1;
        if (Statics.field163 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field159) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field159) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field159) {
                    var9--;
                }
            } while (var9 != var10 || var8 != var11);
            int var12 = (765 - var6 * var8) / (var8 + 1);
            if (var12 > 5) {
                var12 = 5;
            }
            int var13 = (480 - var7 * var9) / (var9 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (765 - var6 * var8 - (var8 - 1) * var12) / 2;
            int var15 = (480 - var7 * var9 - (var9 - 1) * var13) / 2;
            int var16 = var15 + 23;
            int var17 = var14;
            int var18 = 0;
            for (int var19 = 0; var19 < field159; var19++) {
                class5 var20 = Statics.field1114[var19];
                boolean var21 = true;
                String var22 = Integer.toString(var20.field45);
                if (var20.field45 == -1) {
                    var22 = class75.field1098;
                    var21 = false;
                } else if (var20.field45 > 1980) {
                    var22 = class75.field1106;
                    var21 = false;
                }
                if (class37.field492 >= var17 && class37.field499 >= var16 && class37.field492 < var6 + var17 && class37.field499 < var7 + var16 && var21) {
                    field171 = var19;
                    Statics.field163[var20.field47 ? 1 : 0].method2680(var17, var16, 128, 16777215);
                } else {
                    Statics.field163[var20.field47 ? 1 : 0].method2674(var17, var16);
                }
                if (Statics.field367 != null) {
                    Statics.field367[(var20.field47 ? 8 : 0) + var20.field48].method2752(var17 + 29, var16);
                }
                arg0.method2879(Integer.toString(var20.field49), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method2879(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
        }
        try {
            Graphics var23 = Statics.field558.getGraphics();
            Statics.field1534.method531(var23, 0, 0);
        } catch (Exception var25) {
            Statics.field558.repaint();
        }
    }

    @ObfuscatedName("r.k(Ldz;B)V")
    public static void method52(class112 arg0) {
        if (class37.field504 != 1) {
            return;
        }
        short var1 = 280;
        if (class37.field505 >= var1 && class37.field505 <= var1 + 14 && class37.field506 >= 4 && class37.field506 <= 18) {
            method991(0, 0);
            return;
        }
        if (class37.field505 >= var1 + 15 && class37.field505 <= var1 + 80 && class37.field506 >= 4 && class37.field506 <= 18) {
            method991(0, 1);
            return;
        }
        short var2 = 390;
        if (class37.field505 >= var2 && class37.field505 <= var2 + 14 && class37.field506 >= 4 && class37.field506 <= 18) {
            method991(1, 0);
            return;
        }
        if (class37.field505 >= var2 + 15 && class37.field505 <= var2 + 80 && class37.field506 >= 4 && class37.field506 <= 18) {
            method991(1, 1);
            return;
        }
        short var3 = 500;
        if (class37.field505 >= var3 && class37.field505 <= var3 + 14 && class37.field506 >= 4 && class37.field506 <= 18) {
            method991(2, 0);
            return;
        }
        if (class37.field505 >= var3 + 15 && class37.field505 <= var3 + 80 && class37.field506 >= 4 && class37.field506 <= 18) {
            method991(2, 1);
            return;
        }
        short var4 = 610;
        if (class37.field505 >= var4 && class37.field505 <= var4 + 14 && class37.field506 >= 4 && class37.field506 <= 18) {
            method991(3, 0);
            return;
        }
        if (class37.field505 >= var4 + 15 && class37.field505 <= var4 + 80 && class37.field506 >= 4 && class37.field506 <= 18) {
            method991(3, 1);
            return;
        }
        if (class37.field505 >= 708 && class37.field506 >= 4 && class37.field505 <= 758 && class37.field506 <= 20) {
            field164 = false;
            Statics.field139.method2674(0, 0);
            Statics.field155.method2674(382, 0);
            Statics.field135.method2752(382 - Statics.field135.field2513 / 2, 18);
            return;
        }
        if (field171 == -1) {
            return;
        }
        class5 var5 = Statics.field1114[field171];
        if (client.field1913 == var5.field47) {
            Statics.field1126 = var5.field46;
            client.field2083 = var5.field49;
            Statics.field124 = client.field1911 == 0 ? 43594 : var5.field49 + 40000;
            Statics.field355 = client.field1911 == 0 ? 443 : var5.field49 + 50000;
            Statics.field1244 = Statics.field124;
            field164 = false;
            Statics.field139.method2674(0, 0);
            Statics.field155.method2674(382, 0);
            Statics.field135.method2752(382 - Statics.field135.field2513 / 2, 18);
            return;
        }
        String var6 = "";
        if (client.field1911 != 0) {
            var6 = ":" + (var5.field49 + 7000);
        }
        String var7 = "http://" + var5.field46 + var6 + "/j" + client.field1916;
        try {
            arg0.getAppletContext().showDocument(new URL(var7), "_self");
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("co.u(I)V")
    public static void method1230() {
        try {
            if (Statics.field758 == null) {
                Statics.field758 = new class11(Statics.field1551, new URL(Statics.field557));
            } else {
                byte[] var0 = Statics.field758.method94();
                if (var0 != null) {
                    class136 var1 = new class136(var0);
                    field159 = var1.method1712();
                    Statics.field1114 = new class5[field159];
                    int var2 = 0;
                    while (var2 < field159) {
                        class5 var3 = Statics.field1114[var2] = new class5();
                        int var4 = var1.method1712();
                        var3.field49 = var4 & 0x7FFF;
                        var3.field47 = (var4 & 0x8000) != 0;
                        var3.field46 = var1.method1610();
                        var3.field48 = var1.method1602();
                        var3.field45 = var1.method1605();
                        var3.field44 = var2++;
                    }
                    method764(Statics.field1114, 0, Statics.field1114.length - 1, field169, field170);
                    field164 = true;
                    Statics.field758 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field758 = null;
        }
    }

    @ObfuscatedName("cg.v(III)V")
    public static void method991(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field169[var5] != arg0) {
                var2[var4] = field169[var5];
                var3[var4] = field170[var5];
                var4++;
            }
        }
        field169 = var2;
        field170 = var3;
        method764(Statics.field1114, 0, Statics.field1114.length - 1, field169, field170);
    }

    @ObfuscatedName("bc.f([Lc;II[I[II)V")
    public static void method764(class5[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class5 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field44;
                        var12 = var8.field44;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field45;
                        var12 = var8.field45;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field47 ? 1 : 0;
                        var12 = var8.field47 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field49;
                        var12 = var8.field49;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field44;
                        var16 = var8.field44;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field45;
                        var16 = var8.field45;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field47 ? 1 : 0;
                        var16 = var8.field47 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field49;
                        var16 = var8.field49;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class5 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method764(arg0, arg1, var6, arg3, arg4);
        method764(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
