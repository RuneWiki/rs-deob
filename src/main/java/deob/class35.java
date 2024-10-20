package deob;

@ObfuscatedName("av")
public class class35 extends class183 {

    @ObfuscatedName("av.v")
    public static class172 field811 = new class172(64);

    @ObfuscatedName("av.o")
    public static class172 field790 = new class172(50);

    @ObfuscatedName("av.k")
    public int field791;

    @ObfuscatedName("av.m")
    public String field792 = "null";

    @ObfuscatedName("av.i")
    public int field794 = 1;

    @ObfuscatedName("av.t")
    public int[] field816;

    @ObfuscatedName("av.l")
    public int[] field813;

    @ObfuscatedName("av.p")
    public int field796 = -1;

    @ObfuscatedName("av.r")
    public int field793 = -1;

    @ObfuscatedName("av.j")
    public int field798 = -1;

    @ObfuscatedName("av.c")
    public int field799 = -1;

    @ObfuscatedName("av.q")
    public int field800 = -1;

    @ObfuscatedName("av.n")
    public int field822 = -1;

    @ObfuscatedName("av.h")
    public int field802 = -1;

    @ObfuscatedName("av.d")
    public short[] field803;

    @ObfuscatedName("av.b")
    public short[] field804;

    @ObfuscatedName("av.w")
    public short[] field805;

    @ObfuscatedName("av.z")
    public short[] field797;

    @ObfuscatedName("av.x")
    public String[] field807 = new String[5];

    @ObfuscatedName("av.e")
    public boolean field808 = true;

    @ObfuscatedName("av.a")
    public int field809 = -1;

    @ObfuscatedName("av.y")
    public int field810 = 128;

    @ObfuscatedName("av.f")
    public int field821 = 128;

    @ObfuscatedName("av.u")
    public boolean field812 = false;

    @ObfuscatedName("av.ab")
    public int field806 = 0;

    @ObfuscatedName("av.ai")
    public int field814 = 0;

    @ObfuscatedName("av.aj")
    public int field795 = -1;

    @ObfuscatedName("av.as")
    public int field787 = 32;

    @ObfuscatedName("av.ax")
    public int[] field817;

    @ObfuscatedName("av.ac")
    public int field818 = -1;

    @ObfuscatedName("av.az")
    public int field819 = -1;

    @ObfuscatedName("av.au")
    public boolean field820 = true;

    @ObfuscatedName("av.av")
    public boolean field789 = true;

    @ObfuscatedName("av.am")
    public boolean field815 = false;

    @ObfuscatedName("av.ao")
    public int field823 = 30;

    @ObfuscatedName("av.s(I)V")
    public void method614() {
    }

    @ObfuscatedName("av.v(Lde;I)V")
    public void method618(class107 arg0) {
        while (true) {
            int var2 = arg0.method2116();
            if (var2 == 0) {
                return;
            }
            this.method624(arg0, var2);
        }
    }

    @ObfuscatedName("av.o(Lde;II)V")
    public void method624(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2116();
            this.field816 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field816[var4] = arg0.method2094();
            }
        } else if (arg1 == 2) {
            this.field792 = arg0.method2100();
        } else if (arg1 == 12) {
            this.field794 = arg0.method2116();
        } else if (arg1 == 13) {
            this.field796 = arg0.method2094();
        } else if (arg1 == 14) {
            this.field799 = arg0.method2094();
        } else if (arg1 == 15) {
            this.field793 = arg0.method2094();
        } else if (arg1 == 16) {
            this.field798 = arg0.method2094();
        } else if (arg1 == 17) {
            this.field799 = arg0.method2094();
            this.field800 = arg0.method2094();
            this.field822 = arg0.method2094();
            this.field802 = arg0.method2094();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field807[arg1 - 30] = arg0.method2100();
            if (this.field807[arg1 - 30].equalsIgnoreCase(class143.field2168)) {
                this.field807[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2116();
            this.field803 = new short[var5];
            this.field804 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field803[var6] = (short) arg0.method2094();
                this.field804[var6] = (short) arg0.method2094();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2116();
            this.field805 = new short[var7];
            this.field797 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field805[var8] = (short) arg0.method2094();
                this.field797[var8] = (short) arg0.method2094();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2116();
            this.field813 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field813[var10] = arg0.method2094();
            }
        } else if (arg1 == 93) {
            this.field808 = false;
        } else if (arg1 == 95) {
            this.field809 = arg0.method2094();
        } else if (arg1 == 97) {
            this.field810 = arg0.method2094();
        } else if (arg1 == 98) {
            this.field821 = arg0.method2094();
        } else if (arg1 == 99) {
            this.field812 = true;
        } else if (arg1 == 100) {
            this.field806 = arg0.method2093();
        } else if (arg1 == 101) {
            this.field814 = arg0.method2093();
        } else if (arg1 == 102) {
            this.field795 = arg0.method2094();
        } else if (arg1 == 103) {
            this.field787 = arg0.method2094();
        } else if (arg1 == 106) {
            this.field818 = arg0.method2094();
            if (this.field818 == 65535) {
                this.field818 = -1;
            }
            this.field819 = arg0.method2094();
            if (this.field819 == 65535) {
                this.field819 = -1;
            }
            int var11 = arg0.method2116();
            this.field817 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field817[var12] = arg0.method2094();
                if (this.field817[var12] == 65535) {
                    this.field817[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field820 = false;
        } else if (arg1 == 109) {
            this.field789 = false;
        } else if (arg1 == 111) {
            this.field815 = true;
        } else if (arg1 == 112) {
            this.field823 = arg0.method2116();
        }
    }

    @ObfuscatedName("av.k(Laq;ILaq;II)Lcg;")
    public final class98 method617(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field817 != null) {
            class35 var5 = this.method622();
            return var5 == null ? null : var5.method617(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field790.method3112((long) this.field791);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field816.length; var8++) {
                if (!Statics.field788.method2687(this.field816[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field816.length];
            for (int var10 = 0; var10 < this.field816.length; var10++) {
                var9[var10] = class93.method1890(Statics.field788, this.field816[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field803 != null) {
                for (int var12 = 0; var12 < this.field803.length; var12++) {
                    var11.method1859(this.field803[var12], this.field804[var12]);
                }
            }
            if (this.field805 != null) {
                for (int var13 = 0; var13 < this.field805.length; var13++) {
                    var11.method1860(this.field805[var13], this.field797[var13]);
                }
            }
            var6 = var11.method1867(this.field806 + 64, this.field814 * 5 + 850, -30, -50, -30);
            field790.method3115(var6, (long) this.field791);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method706(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method730(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1947(true);
        } else {
            var14 = arg2.method730(var6, arg3);
        }
        if (this.field810 != 128 || this.field821 != 128) {
            var14.method1954(this.field810, this.field821, this.field810);
        }
        return var14;
    }

    @ObfuscatedName("av.m(S)Lcn;")
    public final class93 method619() {
        if (this.field817 != null) {
            class35 var1 = this.method622();
            return var1 == null ? null : var1.method619();
        } else if (this.field813 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field813.length; var3++) {
                if (!Statics.field788.method2687(this.field813[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field813.length];
            for (int var5 = 0; var5 < this.field813.length; var5++) {
                var4[var5] = class93.method1890(Statics.field788, this.field813[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field803 != null) {
                for (int var7 = 0; var7 < this.field803.length; var7++) {
                    var6.method1859(this.field803[var7], this.field804[var7]);
                }
            }
            if (this.field805 != null) {
                for (int var8 = 0; var8 < this.field805.length; var8++) {
                    var6.method1860(this.field805[var8], this.field797[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("av.i(B)Lav;")
    public final class35 method622() {
        int var1 = -1;
        if (this.field818 != -1) {
            var1 = class155.method2637(this.field818);
        } else if (this.field819 != -1) {
            var1 = class155.field2680[this.field819];
        }
        return var1 < 0 || var1 >= this.field817.length || this.field817[var1] == -1 ? null : Statics.method76(this.field817[var1]);
    }

    @ObfuscatedName("av.t(I)Z")
    public boolean method613() {
        if (this.field817 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field818 != -1) {
            var1 = class155.method2637(this.field818);
        } else if (this.field819 != -1) {
            var1 = class155.field2680[this.field819];
        }
        return var1 >= 0 && var1 < this.field817.length && this.field817[var1] != -1;
    }

    @ObfuscatedName("w.l(I)V")
    public static void method465() {
        field811.method3116();
        field790.method3116();
    }
}
