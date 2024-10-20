package deob;

import java.awt.Component;
import java.net.URL;

@ObfuscatedName("an")
public class class29 {

    @ObfuscatedName("an.z")
    public static int[] field642 = new int[256];

    @ObfuscatedName("an.h")
    public static int field644 = 0;

    @ObfuscatedName("an.k")
    public static int field645 = 0;

    @ObfuscatedName("an.ak")
    public static int field657 = 0;

    @ObfuscatedName("an.ah")
    public static int field647 = 0;

    @ObfuscatedName("an.an")
    public static int field648 = 0;

    @ObfuscatedName("an.aw")
    public static int field664 = 0;

    @ObfuscatedName("an.az")
    public static int field650 = 10;

    @ObfuscatedName("an.ad")
    public static String field651 = "";

    @ObfuscatedName("an.ag")
    public static int field660 = 0;

    @ObfuscatedName("an.aa")
    public static String field653 = "";

    @ObfuscatedName("an.au")
    public static String field654 = "";

    @ObfuscatedName("an.aq")
    public static String field655 = "";

    @ObfuscatedName("an.am")
    public static String field656 = "";

    @ObfuscatedName("an.ax")
    public static String field671 = "";

    @ObfuscatedName("an.af")
    public static class147 field638 = class147.field2396;

    @ObfuscatedName("an.al")
    public static boolean field641 = true;

    @ObfuscatedName("an.aj")
    public static int field649 = 0;

    @ObfuscatedName("an.ae")
    public static String field661 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("an.ai")
    public static String field662 = "1234567890";

    @ObfuscatedName("an.ab")
    public static boolean field639 = false;

    @ObfuscatedName("an.bl")
    public static int field652 = 0;

    @ObfuscatedName("an.bn")
    public static int[] field665 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("an.bc")
    public static int[] field666 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("an.bk")
    public static int field643 = -1;

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.l(I)I")
    public static int method1991() {
        return 8;
    }

    @ObfuscatedName("c.y(Ljava/awt/Component;Leo;Leo;ZII)V")
    public static void method96(Component arg0, class149 arg1, class149 arg2, boolean arg3, int arg4) {
        if (!Statics.field659) {
            field660 = arg4;
            class74.method1533();
            byte[] var5 = arg1.method2798("title.jpg", "");
            Statics.field2661 = new class73(var5, arg0);
            Statics.field663 = Statics.field2661.method1431();
            Statics.field2401 = class71.method2082(arg2, "logo", "");
            Statics.field637 = class71.method2082(arg2, "titlebox", "");
            Statics.field2818 = class71.method2082(arg2, "titlebutton", "");
            Statics.field658 = class71.method836(arg2, "runes", "");
            Statics.field601 = class71.method836(arg2, "title_mute", "");
            Statics.field2902 = class71.method2082(arg2, "options_radio_buttons,0", "");
            Statics.field627 = class71.method2082(arg2, "options_radio_buttons,2", "");
            Statics.field636 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field636[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field636[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field636[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field636[var9 + 192] = 16777215;
            }
            Statics.field2929 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2929[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2929[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2929[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2929[var13 + 192] = 16777215;
            }
            Statics.field3013 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field3013[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field3013[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field3013[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field3013[var17 + 192] = 16777215;
            }
            Statics.field667 = new int[256];
            Statics.field711 = new int[32768];
            Statics.field521 = new int[32768];
            method1893((class75) null);
            Statics.field2066 = new int[32768];
            Statics.field2761 = new int[32768];
            if (arg3) {
                field656 = "";
                field671 = "";
            }
            Statics.field600 = 0;
            Statics.field2014 = "";
            field641 = true;
            field639 = false;
            if (Statics.field1773.field133) {
                class164.method1868(2);
            } else {
                class150 var18 = Statics.field565;
                int var19 = var18.method2764("scape main");
                int var20 = var18.method2765(var19, "");
                class164.method3017(2, var18, var19, var20, 255, false);
            }
            class153.method795(false);
            Statics.field659 = true;
            Statics.field2661.method1512(0, 0);
            Statics.field663.method1512(382, 0);
            Statics.field2401.method1588(382 - Statics.field2401.field1308 / 2, 18);
        } else if (arg4 == 4) {
            field660 = 4;
        }
    }

    @ObfuscatedName("co.g(I)V")
    public static void method1890() {
        if (!Statics.field659) {
            return;
        }
        Statics.field637 = null;
        Statics.field2818 = null;
        Statics.field658 = null;
        Statics.field2661 = null;
        Statics.field663 = null;
        Statics.field2401 = null;
        Statics.field601 = null;
        Statics.field2902 = null;
        Statics.field627 = null;
        Statics.field672 = null;
        Statics.field198 = null;
        Statics.field901 = null;
        Statics.field1824 = null;
        Statics.field64 = null;
        Statics.field636 = null;
        Statics.field2929 = null;
        Statics.field3013 = null;
        Statics.field667 = null;
        Statics.field711 = null;
        Statics.field521 = null;
        Statics.field2066 = null;
        Statics.field2761 = null;
        class164.method1868(2);
        class153.method795(true);
        Statics.field659 = false;
    }

    @ObfuscatedName("aa.c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method599(String arg0, String arg1, String arg2) {
        field653 = arg0;
        field654 = arg1;
        field655 = arg2;
    }

    @ObfuscatedName("co.x(Lbw;I)V")
    public static final void method1893(class75 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field711.length; var2++) {
            Statics.field711[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field711[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field521[var8] = (Statics.field711[var8 - 1] + Statics.field711[var8 + 1] + Statics.field711[var8 - 128] + Statics.field711[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field711;
            Statics.field711 = Statics.field521;
            Statics.field521 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1307; var11++) {
            for (int var12 = 0; var12 < arg0.field1308; var12++) {
                if (arg0.field1309[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1305;
                    int var14 = var11 + 16 + arg0.field1310;
                    int var15 = (var14 << 7) + var13;
                    Statics.field711[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("p.f(II)V")
    public static final void method138(int arg0) {
        short var1 = 256;
        field657 += arg0 * 128;
        if (field657 > Statics.field711.length) {
            field657 -= Statics.field711.length;
            int var2 = (int) (Math.random() * 12.0D);
            method1893(Statics.field658[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field2066[var3 + var4] - Statics.field711[field657 + var3 & Statics.field711.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field2066[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field2066[var9 + var10] = 255;
                } else {
                    Statics.field2066[var9 + var10] = 0;
                }
            }
        }
        if (field644 > 0) {
            field644 -= arg0 * 4;
        }
        if (field645 > 0) {
            field645 -= arg0 * 4;
        }
        if (field644 == 0 && field645 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field644 = 1024;
            }
            if (var12 == 1) {
                field645 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field642[var13] = field642[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field642[var14] = (int) (Math.sin((double) field664 / 14.0D) * 16.0D + Math.sin((double) field664 / 15.0D) * 14.0D + Math.sin((double) field664 / 16.0D) * 12.0D);
            field664++;
        }
        field647 += arg0 * -2069719771;
        int var15 = ((client.field246 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field647 * 774208404; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field2066[(var18 << 7) + var17] = 192;
        }
        field647 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field2066[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field2066[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2761[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2761[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2761[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field2066[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("p.t(IIII)I")
    public static final int method139(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("a.n(Lee;I)V")
    public static void method144(class133 arg0) {
        if (class129.field2002 != 1 && Statics.field1985 || class129.field2002 != 4) {
            return;
        }
        short var1 = 280;
        if (class129.field1996 >= var1 && class129.field1996 <= var1 + 14 && class129.field2004 >= 4 && class129.field2004 <= 18) {
            method838(0, 0);
            return;
        }
        if (class129.field1996 >= var1 + 15 && class129.field1996 <= var1 + 80 && class129.field2004 >= 4 && class129.field2004 <= 18) {
            method838(0, 1);
            return;
        }
        short var2 = 390;
        if (class129.field1996 >= var2 && class129.field1996 <= var2 + 14 && class129.field2004 >= 4 && class129.field2004 <= 18) {
            method838(1, 0);
            return;
        }
        if (class129.field1996 >= var2 + 15 && class129.field1996 <= var2 + 80 && class129.field2004 >= 4 && class129.field2004 <= 18) {
            method838(1, 1);
            return;
        }
        short var3 = 500;
        if (class129.field1996 >= var3 && class129.field1996 <= var3 + 14 && class129.field2004 >= 4 && class129.field2004 <= 18) {
            method838(2, 0);
            return;
        }
        if (class129.field1996 >= var3 + 15 && class129.field1996 <= var3 + 80 && class129.field2004 >= 4 && class129.field2004 <= 18) {
            method838(2, 1);
            return;
        }
        short var4 = 610;
        if (class129.field1996 >= var4 && class129.field1996 <= var4 + 14 && class129.field2004 >= 4 && class129.field2004 <= 18) {
            method838(3, 0);
            return;
        }
        if (class129.field1996 >= var4 + 15 && class129.field1996 <= var4 + 80 && class129.field2004 >= 4 && class129.field2004 <= 18) {
            method838(3, 1);
            return;
        }
        if (class129.field1996 >= 708 && class129.field2004 >= 4 && class129.field1996 <= 758 && class129.field2004 <= 20) {
            field639 = false;
            Statics.field2661.method1512(0, 0);
            Statics.field663.method1512(382, 0);
            Statics.field2401.method1588(382 - Statics.field2401.field1308 / 2, 18);
            return;
        }
        if (field643 == -1) {
            return;
        }
        class23 var5 = Statics.field996[field643];
        method692(var5);
        field639 = false;
        Statics.field2661.method1512(0, 0);
        Statics.field663.method1512(382, 0);
        Statics.field2401.method1588(382 - Statics.field2401.field1308 / 2, 18);
        return;
    }

    @ObfuscatedName("ax.p(Lv;I)V")
    public static void method692(class23 arg0) {
        if (arg0.method499() != client.field437) {
            client.field437 = arg0.method499();
            boolean var1 = arg0.method499();
            if (Statics.field1011 != var1) {
                class46.method105();
                Statics.field1011 = var1;
            }
        }
        Statics.field218 = arg0.field570;
        client.field480 = arg0.field581;
        client.field461 = arg0.field568;
        Statics.field1265 = client.field430 == 0 ? 43594 : arg0.field581 + 40000;
        Statics.field272 = client.field430 == 0 ? 443 : arg0.field581 + 50000;
        Statics.field2945 = Statics.field1265;
    }

    @ObfuscatedName("du.a(B)V")
    public static void method2520() {
        try {
            if (Statics.field1941 == null) {
                Statics.field1941 = new class17(Statics.field938, new URL(Statics.field117));
            } else {
                byte[] var0 = Statics.field1941.method167();
                if (var0 != null) {
                    class108 var1 = new class108(var0);
                    field652 = var1.method2163();
                    Statics.field996 = new class23[field652];
                    int var2 = 0;
                    while (var2 < field652) {
                        class23 var3 = Statics.field996[var2] = new class23();
                        var3.field581 = var1.method2163();
                        var3.field568 = var1.method2297();
                        var3.field570 = var1.method2168();
                        var3.field571 = var1.method2168();
                        var3.field572 = var1.method2291();
                        var3.field569 = var1.method2164();
                        var3.field573 = var2++;
                    }
                    method1891(Statics.field996, 0, Statics.field996.length - 1, field665, field666);
                    field639 = true;
                    Statics.field1941 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1941 = null;
        }
    }

    @ObfuscatedName("ai.o(IIS)V")
    public static void method838(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field665[var5] != arg0) {
                var2[var4] = field665[var5];
                var3[var4] = field666[var5];
                var4++;
            }
        }
        field665 = var2;
        field666 = var3;
        method1891(Statics.field996, 0, Statics.field996.length - 1, field665, field666);
    }

    @ObfuscatedName("co.b([Lv;II[I[IB)V")
    public static void method1891(class23[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class23 var8 = arg0[var7];
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
                        var11 = arg0[var6].field573;
                        var12 = var8.field573;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field569;
                        var12 = var8.field569;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method499() ? 1 : 0;
                        var12 = var8.method499() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field581;
                        var12 = var8.field581;
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
                        var15 = arg0[var5].field573;
                        var16 = var8.field573;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field569;
                        var16 = var8.field569;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method499() ? 1 : 0;
                        var16 = var8.method499() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field581;
                        var16 = var8.field581;
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
                class23 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1891(arg0, arg1, var6, arg3, arg4);
        method1891(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
