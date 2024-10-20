package deob;

@ObfuscatedName("aq")
public class class36 extends class185 {

    @ObfuscatedName("aq.g")
    public static class174 field803 = new class174(64);

    @ObfuscatedName("aq.j")
    public static class174 field791 = new class174(50);

    @ObfuscatedName("aq.w")
    public int field792;

    @ObfuscatedName("aq.c")
    public String field793 = "null";

    @ObfuscatedName("aq.x")
    public int field794 = 1;

    @ObfuscatedName("aq.f")
    public int[] field795;

    @ObfuscatedName("aq.t")
    public int[] field790;

    @ObfuscatedName("aq.n")
    public int field797 = -1;

    @ObfuscatedName("aq.p")
    public int field798 = -1;

    @ObfuscatedName("aq.a")
    public int field799 = -1;

    @ObfuscatedName("aq.o")
    public int field800 = -1;

    @ObfuscatedName("aq.b")
    public int field819 = -1;

    @ObfuscatedName("aq.r")
    public int field805 = -1;

    @ObfuscatedName("aq.z")
    public int field818 = -1;

    @ObfuscatedName("aq.u")
    public short[] field821;

    @ObfuscatedName("aq.s")
    public short[] field825;

    @ObfuscatedName("aq.i")
    public short[] field802;

    @ObfuscatedName("aq.e")
    public short[] field807;

    @ObfuscatedName("aq.h")
    public String[] field808 = new String[5];

    @ObfuscatedName("aq.k")
    public boolean field809 = true;

    @ObfuscatedName("aq.v")
    public int field810 = -1;

    @ObfuscatedName("aq.m")
    public int field811 = 128;

    @ObfuscatedName("aq.d")
    public int field812 = 128;

    @ObfuscatedName("aq.q")
    public boolean field813 = false;

    @ObfuscatedName("aq.ak")
    public int field814 = 0;

    @ObfuscatedName("aq.ah")
    public int field815 = 0;

    @ObfuscatedName("aq.an")
    public int field816 = -1;

    @ObfuscatedName("aq.aw")
    public int field801 = 32;

    @ObfuscatedName("aq.az")
    public int[] field806;

    @ObfuscatedName("aq.ad")
    public int field828 = -1;

    @ObfuscatedName("aq.ag")
    public int field820 = -1;

    @ObfuscatedName("aq.aa")
    public boolean field804 = true;

    @ObfuscatedName("aq.au")
    public boolean field822 = true;

    @ObfuscatedName("aq.aq")
    public boolean field823 = false;

    @ObfuscatedName("aq.am")
    public int field788 = 30;

    @ObfuscatedName("ag.l(IB)Laq;")
    public static class36 method597(int arg0) {
        class36 var1 = (class36) field803.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field796.method2752(9, arg0);
        class36 var3 = new class36();
        var3.field792 = arg0;
        if (var2 != null) {
            var3.method625(new class108(var2));
        }
        var3.method624();
        field803.method3211(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.y(I)V")
    public void method624() {
    }

    @ObfuscatedName("aq.g(Ldk;I)V")
    public void method625(class108 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method626(arg0, var2);
        }
    }

    @ObfuscatedName("aq.j(Ldk;II)V")
    public void method626(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2291();
            this.field795 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field795[var4] = arg0.method2163();
            }
        } else if (arg1 == 2) {
            this.field793 = arg0.method2168();
        } else if (arg1 == 12) {
            this.field794 = arg0.method2291();
        } else if (arg1 == 13) {
            this.field797 = arg0.method2163();
        } else if (arg1 == 14) {
            this.field800 = arg0.method2163();
        } else if (arg1 == 15) {
            this.field798 = arg0.method2163();
        } else if (arg1 == 16) {
            this.field799 = arg0.method2163();
        } else if (arg1 == 17) {
            this.field800 = arg0.method2163();
            this.field819 = arg0.method2163();
            this.field805 = arg0.method2163();
            this.field818 = arg0.method2163();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field808[arg1 - 30] = arg0.method2168();
            if (this.field808[arg1 - 30].equalsIgnoreCase(class145.field2140)) {
                this.field808[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2291();
            this.field821 = new short[var5];
            this.field825 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field821[var6] = (short) arg0.method2163();
                this.field825[var6] = (short) arg0.method2163();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2291();
            this.field802 = new short[var7];
            this.field807 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field802[var8] = (short) arg0.method2163();
                this.field807[var8] = (short) arg0.method2163();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2291();
            this.field790 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field790[var10] = arg0.method2163();
            }
        } else if (arg1 == 93) {
            this.field809 = false;
        } else if (arg1 == 95) {
            this.field810 = arg0.method2163();
        } else if (arg1 == 97) {
            this.field811 = arg0.method2163();
        } else if (arg1 == 98) {
            this.field812 = arg0.method2163();
        } else if (arg1 == 99) {
            this.field813 = true;
        } else if (arg1 == 100) {
            this.field814 = arg0.method2292();
        } else if (arg1 == 101) {
            this.field815 = arg0.method2292();
        } else if (arg1 == 102) {
            this.field816 = arg0.method2163();
        } else if (arg1 == 103) {
            this.field801 = arg0.method2163();
        } else if (arg1 == 106) {
            this.field828 = arg0.method2163();
            if (this.field828 == 65535) {
                this.field828 = -1;
            }
            this.field820 = arg0.method2163();
            if (this.field820 == 65535) {
                this.field820 = -1;
            }
            int var11 = arg0.method2291();
            this.field806 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field806[var12] = arg0.method2163();
                if (this.field806[var12] == 65535) {
                    this.field806[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field804 = false;
        } else if (arg1 == 109) {
            this.field822 = false;
        } else if (arg1 == 111) {
            this.field823 = true;
        } else if (arg1 == 112) {
            this.field788 = arg0.method2291();
        }
    }

    @ObfuscatedName("aq.w(Laf;ILaf;II)Lck;")
    public final class99 method641(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field806 != null) {
            class36 var5 = this.method628();
            return var5 == null ? null : var5.method641(arg0, arg1, arg2, arg3);
        }
        class99 var6 = (class99) field791.method3225((long) this.field792);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field795.length; var8++) {
                if (!Statics.field789.method2783(this.field795[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class94[] var9 = new class94[this.field795.length];
            for (int var10 = 0; var10 < this.field795.length; var10++) {
                var9[var10] = class94.method1902(Statics.field789, this.field795[var10], 0);
            }
            class94 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class94(var9, var9.length);
            }
            if (this.field821 != null) {
                for (int var12 = 0; var12 < this.field821.length; var12++) {
                    var11.method1908(this.field821[var12], this.field825[var12]);
                }
            }
            if (this.field802 != null) {
                for (int var13 = 0; var13 < this.field802.length; var13++) {
                    var11.method1899(this.field802[var13], this.field807[var13]);
                }
            }
            var6 = var11.method1915(this.field814 + 64, this.field815 * 5 + 850, -30, -50, -30);
            field791.method3211(var6, (long) this.field792);
        }
        class99 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method711(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method713(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2074(true);
        } else {
            var14 = arg2.method713(var6, arg3);
        }
        if (this.field811 != 128 || this.field812 != 128) {
            var14.method2015(this.field811, this.field812, this.field811);
        }
        return var14;
    }

    @ObfuscatedName("aq.c(I)Lcm;")
    public final class94 method630() {
        if (this.field806 != null) {
            class36 var1 = this.method628();
            return var1 == null ? null : var1.method630();
        } else if (this.field790 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field790.length; var3++) {
                if (!Statics.field789.method2783(this.field790[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class94[] var4 = new class94[this.field790.length];
            for (int var5 = 0; var5 < this.field790.length; var5++) {
                var4[var5] = class94.method1902(Statics.field789, this.field790[var5], 0);
            }
            class94 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class94(var4, var4.length);
            }
            if (this.field821 != null) {
                for (int var7 = 0; var7 < this.field821.length; var7++) {
                    var6.method1908(this.field821[var7], this.field825[var7]);
                }
            }
            if (this.field802 != null) {
                for (int var8 = 0; var8 < this.field802.length; var8++) {
                    var6.method1899(this.field802[var8], this.field807[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aq.x(I)Laq;")
    public final class36 method628() {
        int var1 = -1;
        if (this.field828 != -1) {
            var1 = class157.method3208(this.field828);
        } else if (this.field820 != -1) {
            var1 = class157.field2655[this.field820];
        }
        return var1 < 0 || var1 >= this.field806.length || this.field806[var1] == -1 ? null : method597(this.field806[var1]);
    }

    @ObfuscatedName("aq.f(S)Z")
    public boolean method634() {
        if (this.field806 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field828 != -1) {
            var1 = class157.method3208(this.field828);
        } else if (this.field820 != -1) {
            var1 = class157.field2655[this.field820];
        }
        return var1 >= 0 && var1 < this.field806.length && this.field806[var1] != -1;
    }
}
