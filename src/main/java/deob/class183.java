package deob;

@ObfuscatedName("ag")
public class class183 extends class77 {

    @ObfuscatedName("ag.f")
    public int field2786 = -1;

    @ObfuscatedName("ag.g")
    public int[] field2757;

    @ObfuscatedName("ag.d")
    public int field2774 = 128;

    @ObfuscatedName("ag.e")
    public int[] field2758;

    @ObfuscatedName("ag.b")
    public boolean field2771 = true;

    @ObfuscatedName("ag.c")
    public short[] field2768;

    @ObfuscatedName("ag.a")
    public boolean field2755 = false;

    @ObfuscatedName("ag.n")
    public int field2756 = 1;

    @ObfuscatedName("ag.o")
    public static class67 field2781 = new class67(64);

    @ObfuscatedName("ag.l")
    public int field2762 = -1;

    @ObfuscatedName("ag.m")
    public short[] field2766;

    @ObfuscatedName("ag.k")
    public int field2780 = -1;

    @ObfuscatedName("ag.h")
    public int field2754;

    @ObfuscatedName("ag.i")
    public int field2785 = -1;

    @ObfuscatedName("ag.w")
    public int field2765 = -1;

    @ObfuscatedName("ag.v")
    public short[] field2759;

    @ObfuscatedName("ag.u")
    public short[] field2769;

    @ObfuscatedName("ag.t")
    public static class67 field2753 = new class67(50);

    @ObfuscatedName("ag.s")
    public int field2763 = -1;

    @ObfuscatedName("ag.r")
    public String field2764 = "null";

    @ObfuscatedName("ag.q")
    public int field2773 = 128;

    @ObfuscatedName("ag.z")
    public int field2761 = -1;

    @ObfuscatedName("ag.y")
    public String[] field2770 = new String[5];

    @ObfuscatedName("ag.x")
    public int field2760 = -1;

    @ObfuscatedName("ag.at")
    public int field2777 = 0;

    @ObfuscatedName("ag.aq")
    public boolean field2783 = true;

    @ObfuscatedName("ag.ax")
    public int field2779 = 32;

    @ObfuscatedName("ag.au")
    public int field2778 = -1;

    @ObfuscatedName("ag.ai")
    public boolean field2784 = true;

    @ObfuscatedName("ag.ad")
    public int field2782 = -1;

    @ObfuscatedName("ag.aa")
    public int field2776 = 0;

    @ObfuscatedName("ag.ag")
    public int[] field2775;

    @ObfuscatedName("ag.ah")
    public int field2752 = -1;

    @ObfuscatedName("ag.h(Ldy;II)V")
    public void method3470(class31 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method512();
            this.field2757 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2757[var4] = arg0.method373();
            }
        } else if (arg1 == 2) {
            this.field2764 = arg0.method379();
        } else if (arg1 == 12) {
            this.field2756 = arg0.method512();
        } else if (arg1 == 13) {
            this.field2786 = arg0.method373();
        } else if (arg1 == 14) {
            this.field2762 = arg0.method373();
        } else if (arg1 == 15) {
            this.field2760 = arg0.method373();
        } else if (arg1 == 16) {
            this.field2761 = arg0.method373();
        } else if (arg1 == 17) {
            this.field2762 = arg0.method373();
            this.field2765 = arg0.method373();
            this.field2785 = arg0.method373();
            this.field2763 = arg0.method373();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2770[arg1 - 30] = arg0.method379();
            if (this.field2770[arg1 - 30].equalsIgnoreCase(class98.field1138)) {
                this.field2770[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method512();
            this.field2766 = new short[var5];
            this.field2759 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2766[var6] = (short) arg0.method373();
                this.field2759[var6] = (short) arg0.method373();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method512();
            this.field2768 = new short[var7];
            this.field2769 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2768[var8] = (short) arg0.method373();
                this.field2769[var8] = (short) arg0.method373();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method512();
            this.field2758 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2758[var10] = arg0.method373();
            }
        } else if (arg1 == 93) {
            this.field2771 = false;
        } else if (arg1 == 95) {
            this.field2780 = arg0.method373();
        } else if (arg1 == 97) {
            this.field2773 = arg0.method373();
        } else if (arg1 == 98) {
            this.field2774 = arg0.method373();
        } else if (arg1 == 99) {
            this.field2755 = true;
        } else if (arg1 == 100) {
            this.field2776 = arg0.method492();
        } else if (arg1 == 101) {
            this.field2777 = arg0.method492() * 5;
        } else if (arg1 == 102) {
            this.field2778 = arg0.method373();
        } else if (arg1 == 103) {
            this.field2779 = arg0.method373();
        } else if (arg1 == 106) {
            this.field2752 = arg0.method373();
            if (this.field2752 == 65535) {
                this.field2752 = -1;
            }
            this.field2782 = arg0.method373();
            if (this.field2782 == 65535) {
                this.field2782 = -1;
            }
            int var11 = arg0.method512();
            this.field2775 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field2775[var12] = arg0.method373();
                if (this.field2775[var12] == 65535) {
                    this.field2775[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field2783 = false;
        } else if (arg1 == 109) {
            this.field2784 = false;
        }
    }

    @ObfuscatedName("ag.o(I)V")
    public void method3472() {
    }

    @ObfuscatedName("ag.n(I)Lct;")
    public final class142 method3474() {
        if (this.field2775 != null) {
            class183 var1 = this.method3482();
            return var1 == null ? null : var1.method3474();
        } else if (this.field2758 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field2758.length; var3++) {
                if (!Statics.field1370.method1085(this.field2758[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class142[] var4 = new class142[this.field2758.length];
            for (int var5 = 0; var5 < this.field2758.length; var5++) {
                var4[var5] = class142.method2529(Statics.field1370, this.field2758[var5], 0);
            }
            class142 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class142(var4, var4.length);
            }
            if (this.field2766 != null) {
                for (int var7 = 0; var7 < this.field2766.length; var7++) {
                    var6.method2542(this.field2766[var7], this.field2759[var7]);
                }
            }
            if (this.field2768 != null) {
                for (int var8 = 0; var8 < this.field2768.length; var8++) {
                    var6.method2555(this.field2768[var8], this.field2769[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ag.e(B)Z")
    public boolean method3475() {
        if (this.field2775 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2752 != -1) {
            var1 = class19.method2891(this.field2752);
        } else if (this.field2782 != -1) {
            var1 = class19.field88[this.field2782];
        }
        return var1 >= 0 && var1 < this.field2775.length && this.field2775[var1] != -1;
    }

    @ObfuscatedName("ag.r(Laq;ILaq;II)Ldi;")
    public final class41 method3476(class166 arg0, int arg1, class166 arg2, int arg3) {
        if (this.field2775 != null) {
            class183 var5 = this.method3482();
            return var5 == null ? null : var5.method3476(arg0, arg1, arg2, arg3);
        }
        class41 var6 = (class41) field2753.method908((long) this.field2754);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field2757.length; var8++) {
                if (!Statics.field1370.method1085(this.field2757[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class142[] var9 = new class142[this.field2757.length];
            for (int var10 = 0; var10 < this.field2757.length; var10++) {
                var9[var10] = class142.method2529(Statics.field1370, this.field2757[var10], 0);
            }
            class142 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class142(var9, var9.length);
            }
            if (this.field2766 != null) {
                for (int var12 = 0; var12 < this.field2766.length; var12++) {
                    var11.method2542(this.field2766[var12], this.field2759[var12]);
                }
            }
            if (this.field2768 != null) {
                for (int var13 = 0; var13 < this.field2768.length; var13++) {
                    var11.method2555(this.field2768[var13], this.field2769[var13]);
                }
            }
            var6 = var11.method2603(this.field2776 + 64, this.field2777 + 850, -30, -50, -30);
            field2753.method907(var6, (long) this.field2754);
        }
        class41 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3187(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3175(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method641(true);
        } else {
            var14 = arg2.method3175(var6, arg3);
        }
        if (this.field2773 != 128 || this.field2774 != 128) {
            var14.method702(this.field2773, this.field2774, this.field2773);
        }
        return var14;
    }

    @ObfuscatedName("ag.t(Ldy;I)V")
    public void method3480(class31 arg0) {
        while (true) {
            int var2 = arg0.method512();
            if (var2 == 0) {
                return;
            }
            this.method3470(arg0, var2);
        }
    }

    @ObfuscatedName("ag.g(I)Lag;")
    public final class183 method3482() {
        int var1 = -1;
        if (this.field2752 != -1) {
            var1 = class19.method2891(this.field2752);
        } else if (this.field2782 != -1) {
            var1 = class19.field88[this.field2782];
        }
        return var1 < 0 || var1 >= this.field2775.length || this.field2775[var1] == -1 ? null : method616(this.field2775[var1]);
    }

    @ObfuscatedName("ec.p(II)Lag;")
    public static class183 method616(int arg0) {
        class183 var1 = (class183) field2781.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2772.method1083(9, arg0);
        class183 var3 = new class183();
        var3.field2754 = arg0;
        if (var2 != null) {
            var3.method3480(new class31(var2));
        }
        var3.method3472();
        field2781.method907(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("h.f(B)V")
    public static void method1045() {
        field2781.method910();
        field2753.method910();
    }
}
