package deob;

@ObfuscatedName("as")
public class class35 extends class181 {

    @ObfuscatedName("as.x")
    public static class171 field820 = new class171(64);

    @ObfuscatedName("as.j")
    public static class171 field795 = new class171(50);

    @ObfuscatedName("as.o")
    public int field796;

    @ObfuscatedName("as.n")
    public String field797 = "null";

    @ObfuscatedName("as.y")
    public int field825 = 1;

    @ObfuscatedName("as.f")
    public int[] field807;

    @ObfuscatedName("as.p")
    public int[] field816;

    @ObfuscatedName("as.l")
    public int field804 = -1;

    @ObfuscatedName("as.k")
    public int field799 = -1;

    @ObfuscatedName("as.q")
    public int field803 = -1;

    @ObfuscatedName("as.e")
    public int field822 = -1;

    @ObfuscatedName("as.t")
    public int field805 = -1;

    @ObfuscatedName("as.g")
    public int field806 = -1;

    @ObfuscatedName("as.c")
    public int field794 = -1;

    @ObfuscatedName("as.m")
    public short[] field798;

    @ObfuscatedName("as.i")
    public short[] field809;

    @ObfuscatedName("as.h")
    public short[] field811;

    @ObfuscatedName("as.a")
    public short[] field792;

    @ObfuscatedName("as.w")
    public String[] field812 = new String[5];

    @ObfuscatedName("as.z")
    public boolean field813 = true;

    @ObfuscatedName("as.v")
    public int field814 = -1;

    @ObfuscatedName("as.s")
    public int field815 = 128;

    @ObfuscatedName("as.r")
    public int field801 = 128;

    @ObfuscatedName("as.d")
    public boolean field817 = false;

    @ObfuscatedName("as.al")
    public int field818 = 0;

    @ObfuscatedName("as.ab")
    public int field802 = 0;

    @ObfuscatedName("as.au")
    public int field829 = -1;

    @ObfuscatedName("as.az")
    public int field821 = 32;

    @ObfuscatedName("as.ai")
    public int[] field800;

    @ObfuscatedName("as.ay")
    public int field819 = -1;

    @ObfuscatedName("as.ar")
    public int field824 = -1;

    @ObfuscatedName("as.af")
    public boolean field823 = true;

    @ObfuscatedName("as.as")
    public boolean field826 = true;

    @ObfuscatedName("as.ap")
    public boolean field827 = false;

    @ObfuscatedName("ew.b(Leg;Leg;I)V")
    public static void method2641(class146 arg0, class146 arg1) {
        Statics.field808 = arg0;
        Statics.field793 = arg1;
    }

    @ObfuscatedName("ef.u(IS)Las;")
    public static class35 method2793(int arg0) {
        class35 var1 = (class35) field820.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field808.method2692(9, arg0);
        class35 var3 = new class35();
        var3.field796 = arg0;
        if (var2 != null) {
            var3.method610(new class107(var2));
        }
        var3.method609();
        field820.method3116(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.x(I)V")
    public void method609() {
    }

    @ObfuscatedName("as.j(Ldh;I)V")
    public void method610(class107 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method611(arg0, var2);
        }
    }

    @ObfuscatedName("as.o(Ldh;II)V")
    public void method611(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2134();
            this.field807 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field807[var4] = arg0.method2136();
            }
        } else if (arg1 == 2) {
            this.field797 = arg0.method2339();
        } else if (arg1 == 12) {
            this.field825 = arg0.method2134();
        } else if (arg1 == 13) {
            this.field804 = arg0.method2136();
        } else if (arg1 == 14) {
            this.field822 = arg0.method2136();
        } else if (arg1 == 15) {
            this.field799 = arg0.method2136();
        } else if (arg1 == 16) {
            this.field803 = arg0.method2136();
        } else if (arg1 == 17) {
            this.field822 = arg0.method2136();
            this.field805 = arg0.method2136();
            this.field806 = arg0.method2136();
            this.field794 = arg0.method2136();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field812[arg1 - 30] = arg0.method2339();
            if (this.field812[arg1 - 30].equalsIgnoreCase(class142.field2149)) {
                this.field812[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2134();
            this.field798 = new short[var5];
            this.field809 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field798[var6] = (short) arg0.method2136();
                this.field809[var6] = (short) arg0.method2136();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2134();
            this.field811 = new short[var7];
            this.field792 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field811[var8] = (short) arg0.method2136();
                this.field792[var8] = (short) arg0.method2136();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2134();
            this.field816 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field816[var10] = arg0.method2136();
            }
        } else if (arg1 == 93) {
            this.field813 = false;
        } else if (arg1 == 95) {
            this.field814 = arg0.method2136();
        } else if (arg1 == 97) {
            this.field815 = arg0.method2136();
        } else if (arg1 == 98) {
            this.field801 = arg0.method2136();
        } else if (arg1 == 99) {
            this.field817 = true;
        } else if (arg1 == 100) {
            this.field818 = arg0.method2135();
        } else if (arg1 == 101) {
            this.field802 = arg0.method2135() * 5;
        } else if (arg1 == 102) {
            this.field829 = arg0.method2136();
        } else if (arg1 == 103) {
            this.field821 = arg0.method2136();
        } else if (arg1 == 106) {
            this.field819 = arg0.method2136();
            if (this.field819 == 65535) {
                this.field819 = -1;
            }
            this.field824 = arg0.method2136();
            if (this.field824 == 65535) {
                this.field824 = -1;
            }
            int var11 = arg0.method2134();
            this.field800 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field800[var12] = arg0.method2136();
                if (this.field800[var12] == 65535) {
                    this.field800[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field823 = false;
        } else if (arg1 == 109) {
            this.field826 = false;
        } else if (arg1 == 111) {
            this.field827 = true;
        }
    }

    @ObfuscatedName("as.n(Lac;ILac;II)Lcu;")
    public final class98 method635(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field800 != null) {
            class35 var5 = this.method614();
            return var5 == null ? null : var5.method635(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field795.method3114((long) this.field796);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field807.length; var8++) {
                if (!Statics.field793.method2694(this.field807[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field807.length];
            for (int var10 = 0; var10 < this.field807.length; var10++) {
                var9[var10] = class93.method1901(Statics.field793, this.field807[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field798 != null) {
                for (int var12 = 0; var12 < this.field798.length; var12++) {
                    var11.method1903(this.field798[var12], this.field809[var12]);
                }
            }
            if (this.field811 != null) {
                for (int var13 = 0; var13 < this.field811.length; var13++) {
                    var11.method1904(this.field811[var13], this.field792[var13]);
                }
            }
            var6 = var11.method1910(this.field818 + 64, this.field802 + 850, -30, -50, -30);
            field795.method3116(var6, (long) this.field796);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method701(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method698(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2005(true);
        } else {
            var14 = arg2.method698(var6, arg3);
        }
        if (this.field815 != 128 || this.field801 != 128) {
            var14.method2000(this.field815, this.field801, this.field815);
        }
        return var14;
    }

    @ObfuscatedName("as.y(I)Lct;")
    public final class93 method613() {
        if (this.field800 != null) {
            class35 var1 = this.method614();
            return var1 == null ? null : var1.method613();
        } else if (this.field816 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field816.length; var3++) {
                if (!Statics.field793.method2694(this.field816[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field816.length];
            for (int var5 = 0; var5 < this.field816.length; var5++) {
                var4[var5] = class93.method1901(Statics.field793, this.field816[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field798 != null) {
                for (int var7 = 0; var7 < this.field798.length; var7++) {
                    var6.method1903(this.field798[var7], this.field809[var7]);
                }
            }
            if (this.field811 != null) {
                for (int var8 = 0; var8 < this.field811.length; var8++) {
                    var6.method1904(this.field811[var8], this.field792[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("as.f(B)Las;")
    public final class35 method614() {
        int var1 = -1;
        if (this.field819 != -1) {
            var1 = class154.method140(this.field819);
        } else if (this.field824 != -1) {
            var1 = class154.field2657[this.field824];
        }
        return var1 < 0 || var1 >= this.field800.length || this.field800[var1] == -1 ? null : method2793(this.field800[var1]);
    }

    @ObfuscatedName("as.p(I)Z")
    public boolean method615() {
        if (this.field800 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field819 != -1) {
            var1 = class154.method140(this.field819);
        } else if (this.field824 != -1) {
            var1 = class154.field2657[this.field824];
        }
        return var1 >= 0 && var1 < this.field800.length && this.field800[var1] != -1;
    }
}
