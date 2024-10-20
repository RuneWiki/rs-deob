package deob;

@ObfuscatedName("af")
public class class35 extends class183 {

    @ObfuscatedName("af.x")
    public static class172 field802 = new class172(64);

    @ObfuscatedName("af.c")
    public static class172 field803 = new class172(50);

    @ObfuscatedName("af.n")
    public int field809;

    @ObfuscatedName("af.s")
    public String field805 = "null";

    @ObfuscatedName("af.r")
    public int field827 = 1;

    @ObfuscatedName("af.w")
    public int[] field819;

    @ObfuscatedName("af.u")
    public int[] field808;

    @ObfuscatedName("af.d")
    public int field807 = -1;

    @ObfuscatedName("af.h")
    public int field810 = -1;

    @ObfuscatedName("af.a")
    public int field811 = -1;

    @ObfuscatedName("af.y")
    public int field812 = -1;

    @ObfuscatedName("af.v")
    public int field804 = -1;

    @ObfuscatedName("af.e")
    public int field836 = -1;

    @ObfuscatedName("af.b")
    public int field815 = -1;

    @ObfuscatedName("af.z")
    public short[] field816;

    @ObfuscatedName("af.l")
    public short[] field817;

    @ObfuscatedName("af.t")
    public short[] field806;

    @ObfuscatedName("af.q")
    public short[] field824;

    @ObfuscatedName("af.j")
    public String[] field800 = new String[5];

    @ObfuscatedName("af.o")
    public boolean field821 = true;

    @ObfuscatedName("af.i")
    public int field822 = -1;

    @ObfuscatedName("af.m")
    public int field823 = 128;

    @ObfuscatedName("af.f")
    public int field838 = 128;

    @ObfuscatedName("af.k")
    public boolean field825 = false;

    @ObfuscatedName("af.an")
    public int field820 = 0;

    @ObfuscatedName("af.aw")
    public int field814 = 0;

    @ObfuscatedName("af.at")
    public int field818 = -1;

    @ObfuscatedName("af.al")
    public int field829 = 32;

    @ObfuscatedName("af.as")
    public int[] field830;

    @ObfuscatedName("af.ak")
    public int field831 = -1;

    @ObfuscatedName("af.aa")
    public int field832 = -1;

    @ObfuscatedName("af.ao")
    public boolean field833 = true;

    @ObfuscatedName("af.af")
    public boolean field834 = true;

    @ObfuscatedName("af.aj")
    public boolean field835 = false;

    @ObfuscatedName("af.az")
    public int field826 = 30;

    @ObfuscatedName("x.p(Ler;Ler;B)V")
    public static void method31(class147 arg0, class147 arg1) {
        Statics.field828 = arg0;
        Statics.field801 = arg1;
    }

    @ObfuscatedName("aw.g(IB)Laf;")
    public static class35 method586(int arg0) {
        class35 var1 = (class35) field802.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field828.method2855(9, arg0);
        class35 var3 = new class35();
        var3.field809 = arg0;
        if (var2 != null) {
            var3.method632(new class107(var2));
        }
        var3.method639();
        field802.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.x(I)V")
    public void method639() {
    }

    @ObfuscatedName("af.c(Ldp;B)V")
    public void method632(class107 arg0) {
        while (true) {
            int var2 = arg0.method2173();
            if (var2 == 0) {
                return;
            }
            this.method633(arg0, var2);
        }
    }

    @ObfuscatedName("af.n(Ldp;II)V")
    public void method633(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2173();
            this.field819 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field819[var4] = arg0.method2175();
            }
        } else if (arg1 == 2) {
            this.field805 = arg0.method2351();
        } else if (arg1 == 12) {
            this.field827 = arg0.method2173();
        } else if (arg1 == 13) {
            this.field807 = arg0.method2175();
        } else if (arg1 == 14) {
            this.field812 = arg0.method2175();
        } else if (arg1 == 15) {
            this.field810 = arg0.method2175();
        } else if (arg1 == 16) {
            this.field811 = arg0.method2175();
        } else if (arg1 == 17) {
            this.field812 = arg0.method2175();
            this.field804 = arg0.method2175();
            this.field836 = arg0.method2175();
            this.field815 = arg0.method2175();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field800[arg1 - 30] = arg0.method2351();
            if (this.field800[arg1 - 30].equalsIgnoreCase(class143.field2207)) {
                this.field800[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2173();
            this.field816 = new short[var5];
            this.field817 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field816[var6] = (short) arg0.method2175();
                this.field817[var6] = (short) arg0.method2175();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2173();
            this.field806 = new short[var7];
            this.field824 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field806[var8] = (short) arg0.method2175();
                this.field824[var8] = (short) arg0.method2175();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2173();
            this.field808 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field808[var10] = arg0.method2175();
            }
        } else if (arg1 == 93) {
            this.field821 = false;
        } else if (arg1 == 95) {
            this.field822 = arg0.method2175();
        } else if (arg1 == 97) {
            this.field823 = arg0.method2175();
        } else if (arg1 == 98) {
            this.field838 = arg0.method2175();
        } else if (arg1 == 99) {
            this.field825 = true;
        } else if (arg1 == 100) {
            this.field820 = arg0.method2174();
        } else if (arg1 == 101) {
            this.field814 = arg0.method2174();
        } else if (arg1 == 102) {
            this.field818 = arg0.method2175();
        } else if (arg1 == 103) {
            this.field829 = arg0.method2175();
        } else if (arg1 == 106) {
            this.field831 = arg0.method2175();
            if (this.field831 == 65535) {
                this.field831 = -1;
            }
            this.field832 = arg0.method2175();
            if (this.field832 == 65535) {
                this.field832 = -1;
            }
            int var11 = arg0.method2173();
            this.field830 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field830[var12] = arg0.method2175();
                if (this.field830[var12] == 65535) {
                    this.field830[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field833 = false;
        } else if (arg1 == 109) {
            this.field834 = false;
        } else if (arg1 == 111) {
            this.field835 = true;
        } else if (arg1 == 112) {
            this.field826 = arg0.method2173();
        }
    }

    @ObfuscatedName("af.s(Lae;ILae;II)Lcn;")
    public final class98 method631(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field830 != null) {
            class35 var5 = this.method636();
            return var5 == null ? null : var5.method631(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field803.method3225((long) this.field809);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field819.length; var8++) {
                if (!Statics.field801.method2805(this.field819[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field819.length];
            for (int var10 = 0; var10 < this.field819.length; var10++) {
                var9[var10] = class93.method1943(Statics.field801, this.field819[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field816 != null) {
                for (int var12 = 0; var12 < this.field816.length; var12++) {
                    var11.method1955(this.field816[var12], this.field817[var12]);
                }
            }
            if (this.field806 != null) {
                for (int var13 = 0; var13 < this.field806.length; var13++) {
                    var11.method1956(this.field806[var13], this.field824[var13]);
                }
            }
            var6 = var11.method1952(this.field820 + 64, this.field814 * 5 + 850, -30, -50, -30);
            field803.method3234(var6, (long) this.field809);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method742(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method741(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2046(true);
        } else {
            var14 = arg2.method741(var6, arg3);
        }
        if (this.field823 != 128 || this.field838 != 128) {
            var14.method2045(this.field823, this.field838, this.field823);
        }
        return var14;
    }

    @ObfuscatedName("af.r(I)Lcq;")
    public final class93 method655() {
        if (this.field830 != null) {
            class35 var1 = this.method636();
            return var1 == null ? null : var1.method655();
        } else if (this.field808 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field808.length; var3++) {
                if (!Statics.field801.method2805(this.field808[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field808.length];
            for (int var5 = 0; var5 < this.field808.length; var5++) {
                var4[var5] = class93.method1943(Statics.field801, this.field808[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field816 != null) {
                for (int var7 = 0; var7 < this.field816.length; var7++) {
                    var6.method1955(this.field816[var7], this.field817[var7]);
                }
            }
            if (this.field806 != null) {
                for (int var8 = 0; var8 < this.field806.length; var8++) {
                    var6.method1956(this.field806[var8], this.field824[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("af.w(I)Laf;")
    public final class35 method636() {
        int var1 = -1;
        if (this.field831 != -1) {
            var1 = class155.method2483(this.field831);
        } else if (this.field832 != -1) {
            var1 = class155.field2662[this.field832];
        }
        return var1 < 0 || var1 >= this.field830.length || this.field830[var1] == -1 ? null : method586(this.field830[var1]);
    }

    @ObfuscatedName("af.u(I)Z")
    public boolean method630() {
        if (this.field830 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field831 != -1) {
            var1 = class155.method2483(this.field831);
        } else if (this.field832 != -1) {
            var1 = class155.field2662[this.field832];
        }
        return var1 >= 0 && var1 < this.field830.length && this.field830[var1] != -1;
    }
}
