package deob;

@ObfuscatedName("av")
public class class35 extends class182 {

    @ObfuscatedName("av.z")
    public static class171 field791 = new class171(64);

    @ObfuscatedName("av.h")
    public static class171 field792 = new class171(50);

    @ObfuscatedName("av.k")
    public int field793;

    @ObfuscatedName("av.l")
    public String field794 = "null";

    @ObfuscatedName("av.e")
    public int field800 = 1;

    @ObfuscatedName("av.j")
    public int[] field796;

    @ObfuscatedName("av.n")
    public int[] field797;

    @ObfuscatedName("av.f")
    public int field798 = -1;

    @ObfuscatedName("av.a")
    public int field799 = -1;

    @ObfuscatedName("av.i")
    public int field823 = -1;

    @ObfuscatedName("av.y")
    public int field801 = -1;

    @ObfuscatedName("av.p")
    public int field807 = -1;

    @ObfuscatedName("av.q")
    public int field803 = -1;

    @ObfuscatedName("av.t")
    public int field812 = -1;

    @ObfuscatedName("av.r")
    public short[] field789;

    @ObfuscatedName("av.x")
    public short[] field795;

    @ObfuscatedName("av.s")
    public short[] field820;

    @ObfuscatedName("av.d")
    public short[] field802;

    @ObfuscatedName("av.m")
    public String[] field809 = new String[5];

    @ObfuscatedName("av.o")
    public boolean field810 = true;

    @ObfuscatedName("av.b")
    public int field811 = -1;

    @ObfuscatedName("av.c")
    public int field805 = 128;

    @ObfuscatedName("av.w")
    public int field813 = 128;

    @ObfuscatedName("av.u")
    public boolean field814 = false;

    @ObfuscatedName("av.ac")
    public int field815 = 0;

    @ObfuscatedName("av.ap")
    public int field806 = 0;

    @ObfuscatedName("av.ai")
    public int field817 = -1;

    @ObfuscatedName("av.as")
    public int field790 = 32;

    @ObfuscatedName("av.aa")
    public int[] field819;

    @ObfuscatedName("av.aq")
    public int field808 = -1;

    @ObfuscatedName("av.aw")
    public int field821 = -1;

    @ObfuscatedName("av.am")
    public boolean field822 = true;

    @ObfuscatedName("av.av")
    public boolean field804 = true;

    @ObfuscatedName("av.an")
    public boolean field824 = false;

    @ObfuscatedName("av.at")
    public int field818 = 30;

    @ObfuscatedName("bg.g(Lec;Lec;I)V")
    public static void method1418(class146 arg0, class146 arg1) {
        Statics.field825 = arg0;
        Statics.field816 = arg1;
    }

    @ObfuscatedName("p.v(II)Lav;")
    public static class35 method143(int arg0) {
        class35 var1 = (class35) field791.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field825.method2708(9, arg0);
        class35 var3 = new class35();
        var3.field793 = arg0;
        if (var2 != null) {
            var3.method634(new class107(var2));
        }
        var3.method613();
        field791.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.z(B)V")
    public void method613() {
    }

    @ObfuscatedName("av.h(Ldm;I)V")
    public void method634(class107 arg0) {
        while (true) {
            int var2 = arg0.method2139();
            if (var2 == 0) {
                return;
            }
            this.method615(arg0, var2);
        }
    }

    @ObfuscatedName("av.k(Ldm;II)V")
    public void method615(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2139();
            this.field796 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field796[var4] = arg0.method2141();
            }
        } else if (arg1 == 2) {
            this.field794 = arg0.method2147();
        } else if (arg1 == 12) {
            this.field800 = arg0.method2139();
        } else if (arg1 == 13) {
            this.field798 = arg0.method2141();
        } else if (arg1 == 14) {
            this.field801 = arg0.method2141();
        } else if (arg1 == 15) {
            this.field799 = arg0.method2141();
        } else if (arg1 == 16) {
            this.field823 = arg0.method2141();
        } else if (arg1 == 17) {
            this.field801 = arg0.method2141();
            this.field807 = arg0.method2141();
            this.field803 = arg0.method2141();
            this.field812 = arg0.method2141();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field809[arg1 - 30] = arg0.method2147();
            if (this.field809[arg1 - 30].equalsIgnoreCase(class142.field2207)) {
                this.field809[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2139();
            this.field789 = new short[var5];
            this.field795 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field789[var6] = (short) arg0.method2141();
                this.field795[var6] = (short) arg0.method2141();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2139();
            this.field820 = new short[var7];
            this.field802 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field820[var8] = (short) arg0.method2141();
                this.field802[var8] = (short) arg0.method2141();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2139();
            this.field797 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field797[var10] = arg0.method2141();
            }
        } else if (arg1 == 93) {
            this.field810 = false;
        } else if (arg1 == 95) {
            this.field811 = arg0.method2141();
        } else if (arg1 == 97) {
            this.field805 = arg0.method2141();
        } else if (arg1 == 98) {
            this.field813 = arg0.method2141();
        } else if (arg1 == 99) {
            this.field814 = true;
        } else if (arg1 == 100) {
            this.field815 = arg0.method2140();
        } else if (arg1 == 101) {
            this.field806 = arg0.method2140() * 5;
        } else if (arg1 == 102) {
            this.field817 = arg0.method2141();
        } else if (arg1 == 103) {
            this.field790 = arg0.method2141();
        } else if (arg1 == 106) {
            this.field808 = arg0.method2141();
            if (this.field808 == 65535) {
                this.field808 = -1;
            }
            this.field821 = arg0.method2141();
            if (this.field821 == 65535) {
                this.field821 = -1;
            }
            int var11 = arg0.method2139();
            this.field819 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field819[var12] = arg0.method2141();
                if (this.field819[var12] == 65535) {
                    this.field819[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field822 = false;
        } else if (arg1 == 109) {
            this.field804 = false;
        } else if (arg1 == 111) {
            this.field824 = true;
        } else if (arg1 == 112) {
            this.field818 = arg0.method2139();
        }
    }

    @ObfuscatedName("av.l(Lao;ILao;IB)Lce;")
    public final class98 method616(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field819 != null) {
            class35 var5 = this.method618();
            return var5 == null ? null : var5.method616(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field792.method3166((long) this.field793);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field796.length; var8++) {
                if (!Statics.field816.method2710(this.field796[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field796.length];
            for (int var10 = 0; var10 < this.field796.length; var10++) {
                var9[var10] = class93.method1903(Statics.field816, this.field796[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field789 != null) {
                for (int var12 = 0; var12 < this.field789.length; var12++) {
                    var11.method1916(this.field789[var12], this.field795[var12]);
                }
            }
            if (this.field820 != null) {
                for (int var13 = 0; var13 < this.field820.length; var13++) {
                    var11.method1917(this.field820[var13], this.field802[var13]);
                }
            }
            var6 = var11.method1963(this.field815 + 64, this.field806 + 850, -30, -50, -30);
            field792.method3167(var6, (long) this.field793);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method747(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method711(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2000(true);
        } else {
            var14 = arg2.method711(var6, arg3);
        }
        if (this.field805 != 128 || this.field813 != 128) {
            var14.method2014(this.field805, this.field813, this.field805);
        }
        return var14;
    }

    @ObfuscatedName("av.e(B)Lcv;")
    public final class93 method614() {
        if (this.field819 != null) {
            class35 var1 = this.method618();
            return var1 == null ? null : var1.method614();
        } else if (this.field797 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field797.length; var3++) {
                if (!Statics.field816.method2710(this.field797[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field797.length];
            for (int var5 = 0; var5 < this.field797.length; var5++) {
                var4[var5] = class93.method1903(Statics.field816, this.field797[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field789 != null) {
                for (int var7 = 0; var7 < this.field789.length; var7++) {
                    var6.method1916(this.field789[var7], this.field795[var7]);
                }
            }
            if (this.field820 != null) {
                for (int var8 = 0; var8 < this.field820.length; var8++) {
                    var6.method1917(this.field820[var8], this.field802[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("av.j(I)Lav;")
    public final class35 method618() {
        int var1 = -1;
        if (this.field808 != -1) {
            var1 = class154.method2684(this.field808);
        } else if (this.field821 != -1) {
            var1 = class154.field2660[this.field821];
        }
        return var1 < 0 || var1 >= this.field819.length || this.field819[var1] == -1 ? null : method143(this.field819[var1]);
    }

    @ObfuscatedName("av.n(B)Z")
    public boolean method612() {
        if (this.field819 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field808 != -1) {
            var1 = class154.method2684(this.field808);
        } else if (this.field821 != -1) {
            var1 = class154.field2660[this.field821];
        }
        return var1 >= 0 && var1 < this.field819.length && this.field819[var1] != -1;
    }
}
