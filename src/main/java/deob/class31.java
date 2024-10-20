package deob;

@ObfuscatedName("ag")
public class class31 extends class174 {

    @ObfuscatedName("ag.j")
    public static class170 field776 = new class170(64);

    @ObfuscatedName("ag.i")
    public static class170 field777 = new class170(50);

    @ObfuscatedName("ag.k")
    public int field791;

    @ObfuscatedName("ag.q")
    public String field779 = "null";

    @ObfuscatedName("ag.t")
    public int field781 = 1;

    @ObfuscatedName("ag.v")
    public int[] field785;

    @ObfuscatedName("ag.y")
    public int[] field782;

    @ObfuscatedName("ag.w")
    public int field783 = -1;

    @ObfuscatedName("ag.g")
    public int field784 = -1;

    @ObfuscatedName("ag.s")
    public int field798 = -1;

    @ObfuscatedName("ag.n")
    public int field786 = -1;

    @ObfuscatedName("ag.x")
    public int field807 = -1;

    @ObfuscatedName("ag.o")
    public int field788 = -1;

    @ObfuscatedName("ag.l")
    public int field787 = -1;

    @ObfuscatedName("ag.u")
    public short[] field796;

    @ObfuscatedName("ag.z")
    public short[] field792;

    @ObfuscatedName("ag.d")
    public short[] field789;

    @ObfuscatedName("ag.m")
    public short[] field793;

    @ObfuscatedName("ag.f")
    public String[] field799 = new String[5];

    @ObfuscatedName("ag.a")
    public boolean field795 = true;

    @ObfuscatedName("ag.h")
    public int field790 = -1;

    @ObfuscatedName("ag.p")
    public int field803 = 128;

    @ObfuscatedName("ag.e")
    public int field774 = 128;

    @ObfuscatedName("ag.r")
    public boolean field802 = false;

    @ObfuscatedName("ag.av")
    public int field800 = 0;

    @ObfuscatedName("ag.an")
    public int field801 = 0;

    @ObfuscatedName("ag.ae")
    public int field780 = -1;

    @ObfuscatedName("ag.au")
    public int field794 = 32;

    @ObfuscatedName("ag.ag")
    public int[] field804;

    @ObfuscatedName("ag.at")
    public int field805 = -1;

    @ObfuscatedName("ag.ac")
    public int field806 = -1;

    @ObfuscatedName("ag.aw")
    public boolean field797 = true;

    @ObfuscatedName("ag.ah")
    public boolean field808 = true;

    @ObfuscatedName("bm.b(IB)Lag;")
    public static class31 method1217(int arg0) {
        class31 var1 = (class31) field776.method3188((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field778.method2964(9, arg0);
        class31 var3 = new class31();
        var3.field791 = arg0;
        if (var2 != null) {
            var3.method590(new class127(var2));
        }
        var3.method589();
        field776.method3190(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.c(B)V")
    public void method589() {
    }

    @ObfuscatedName("ag.j(Ldv;B)V")
    public void method590(class127 arg0) {
        while (true) {
            int var2 = arg0.method2416();
            if (var2 == 0) {
                return;
            }
            this.method591(arg0, var2);
        }
    }

    @ObfuscatedName("ag.i(Ldv;IB)V")
    public void method591(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2416();
            this.field785 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field785[var4] = arg0.method2394();
            }
        } else if (arg1 == 2) {
            this.field779 = arg0.method2473();
        } else if (arg1 == 12) {
            this.field781 = arg0.method2416();
        } else if (arg1 == 13) {
            this.field783 = arg0.method2394();
        } else if (arg1 == 14) {
            this.field786 = arg0.method2394();
        } else if (arg1 == 15) {
            this.field784 = arg0.method2394();
        } else if (arg1 == 16) {
            this.field798 = arg0.method2394();
        } else if (arg1 == 17) {
            this.field786 = arg0.method2394();
            this.field807 = arg0.method2394();
            this.field788 = arg0.method2394();
            this.field787 = arg0.method2394();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field799[arg1 - 30] = arg0.method2473();
            if (this.field799[arg1 - 30].equalsIgnoreCase(class135.field2310)) {
                this.field799[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2416();
            this.field796 = new short[var5];
            this.field792 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field796[var6] = (short) arg0.method2394();
                this.field792[var6] = (short) arg0.method2394();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2416();
            this.field789 = new short[var7];
            this.field793 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field789[var8] = (short) arg0.method2394();
                this.field793[var8] = (short) arg0.method2394();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2416();
            this.field782 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field782[var10] = arg0.method2394();
            }
        } else if (arg1 == 93) {
            this.field795 = false;
        } else if (arg1 == 95) {
            this.field790 = arg0.method2394();
        } else if (arg1 == 97) {
            this.field803 = arg0.method2394();
        } else if (arg1 == 98) {
            this.field774 = arg0.method2394();
        } else if (arg1 == 99) {
            this.field802 = true;
        } else if (arg1 == 100) {
            this.field800 = arg0.method2397();
        } else if (arg1 == 101) {
            this.field801 = arg0.method2397() * 5;
        } else if (arg1 == 102) {
            this.field780 = arg0.method2394();
        } else if (arg1 == 103) {
            this.field794 = arg0.method2394();
        } else if (arg1 == 106) {
            this.field805 = arg0.method2394();
            if (this.field805 == 65535) {
                this.field805 = -1;
            }
            this.field806 = arg0.method2394();
            if (this.field806 == 65535) {
                this.field806 = -1;
            }
            int var11 = arg0.method2416();
            this.field804 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field804[var12] = arg0.method2394();
                if (this.field804[var12] == 65535) {
                    this.field804[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field797 = false;
        } else if (arg1 == 109) {
            this.field808 = false;
        }
    }

    @ObfuscatedName("ag.k(Law;ILaw;II)Ldr;")
    public final class112 method592(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field804 != null) {
            class31 var5 = this.method594();
            return var5 == null ? null : var5.method592(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field777.method3188((long) this.field791);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field785.length; var8++) {
                if (!Statics.field775.method3032(this.field785[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field785.length];
            for (int var10 = 0; var10 < this.field785.length; var10++) {
                var9[var10] = class101.method2065(Statics.field775, this.field785[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field796 != null) {
                for (int var12 = 0; var12 < this.field796.length; var12++) {
                    var11.method2077(this.field796[var12], this.field792[var12]);
                }
            }
            if (this.field789 != null) {
                for (int var13 = 0; var13 < this.field789.length; var13++) {
                    var11.method2013(this.field789[var13], this.field793[var13]);
                }
            }
            var6 = var11.method2046(this.field800 + 64, this.field801 + 850, -30, -50, -30);
            field777.method3190(var6, (long) this.field791);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method712(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method729(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2242(true);
        } else {
            var14 = arg2.method729(var6, arg3);
        }
        if (this.field803 != 128 || this.field774 != 128) {
            var14.method2206(this.field803, this.field774, this.field803);
        }
        return var14;
    }

    @ObfuscatedName("ag.q(B)Lcu;")
    public final class101 method605() {
        if (this.field804 != null) {
            class31 var1 = this.method594();
            return var1 == null ? null : var1.method605();
        } else if (this.field782 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field782.length; var3++) {
                if (!Statics.field775.method3032(this.field782[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field782.length];
            for (int var5 = 0; var5 < this.field782.length; var5++) {
                var4[var5] = class101.method2065(Statics.field775, this.field782[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field796 != null) {
                for (int var7 = 0; var7 < this.field796.length; var7++) {
                    var6.method2077(this.field796[var7], this.field792[var7]);
                }
            }
            if (this.field789 != null) {
                for (int var8 = 0; var8 < this.field789.length; var8++) {
                    var6.method2013(this.field789[var8], this.field793[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ag.t(S)Lag;")
    public final class31 method594() {
        int var1 = -1;
        if (this.field805 != -1) {
            var1 = class160.method1338(this.field805);
        } else if (this.field806 != -1) {
            var1 = class160.field2742[this.field806];
        }
        return var1 < 0 || var1 >= this.field804.length || this.field804[var1] == -1 ? null : method1217(this.field804[var1]);
    }

    @ObfuscatedName("ag.v(I)Z")
    public boolean method595() {
        if (this.field804 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field805 != -1) {
            var1 = class160.method1338(this.field805);
        } else if (this.field806 != -1) {
            var1 = class160.field2742[this.field806];
        }
        return var1 >= 0 && var1 < this.field804.length && this.field804[var1] != -1;
    }

    @ObfuscatedName("k.y(I)V")
    public static void method42() {
        field776.method3191();
        field777.method3191();
    }
}
