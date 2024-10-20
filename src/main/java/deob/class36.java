package deob;

@ObfuscatedName("ax")
public class class36 extends class187 {

    @ObfuscatedName("ax.i")
    public static class176 field805 = new class176(64);

    @ObfuscatedName("ax.b")
    public static class176 field834 = new class176(50);

    @ObfuscatedName("ax.l")
    public int field807;

    @ObfuscatedName("ax.m")
    public String field827 = "null";

    @ObfuscatedName("ax.w")
    public int field820 = 1;

    @ObfuscatedName("ax.e")
    public int[] field804;

    @ObfuscatedName("ax.n")
    public int[] field811;

    @ObfuscatedName("ax.s")
    public int field819 = -1;

    @ObfuscatedName("ax.k")
    public int field813 = -1;

    @ObfuscatedName("ax.f")
    public int field832 = -1;

    @ObfuscatedName("ax.d")
    public int field815 = -1;

    @ObfuscatedName("ax.x")
    public int field816 = -1;

    @ObfuscatedName("ax.o")
    public int field817 = -1;

    @ObfuscatedName("ax.q")
    public int field818 = -1;

    @ObfuscatedName("ax.t")
    public short[] field806;

    @ObfuscatedName("ax.h")
    public short[] field831;

    @ObfuscatedName("ax.u")
    public short[] field810;

    @ObfuscatedName("ax.j")
    public short[] field821;

    @ObfuscatedName("ax.g")
    public String[] field822 = new String[5];

    @ObfuscatedName("ax.y")
    public boolean field824 = true;

    @ObfuscatedName("ax.p")
    public int field825 = -1;

    @ObfuscatedName("ax.r")
    public int field826 = 128;

    @ObfuscatedName("ax.z")
    public int field812 = 128;

    @ObfuscatedName("ax.c")
    public boolean field828 = false;

    @ObfuscatedName("ax.an")
    public int field829 = 0;

    @ObfuscatedName("ax.as")
    public int field830 = 0;

    @ObfuscatedName("ax.ah")
    public int field814 = -1;

    @ObfuscatedName("ax.ar")
    public int field823 = 32;

    @ObfuscatedName("ax.ae")
    public int[] field833;

    @ObfuscatedName("ax.av")
    public int field809 = -1;

    @ObfuscatedName("ax.al")
    public int field835 = -1;

    @ObfuscatedName("ax.aq")
    public boolean field836 = true;

    @ObfuscatedName("ax.am")
    public boolean field837 = true;

    @ObfuscatedName("ax.ax")
    public boolean field838 = false;

    @ObfuscatedName("ax.az")
    public int field839 = 30;

    @ObfuscatedName("dw.a(Lek;Lek;I)V")
    public static void method2397(class151 arg0, class151 arg1) {
        Statics.field808 = arg0;
        Statics.field2704 = arg1;
    }

    @ObfuscatedName("bo.v(II)Lax;")
    public static class36 method1074(int arg0) {
        class36 var1 = (class36) field805.method3181((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field808.method2731(9, arg0);
        class36 var3 = new class36();
        var3.field807 = arg0;
        if (var2 != null) {
            var3.method631(new class110(var2));
        }
        var3.method663();
        field805.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.i(B)V")
    public void method663() {
    }

    @ObfuscatedName("ax.b(Ldi;I)V")
    public void method631(class110 arg0) {
        while (true) {
            int var2 = arg0.method2199();
            if (var2 == 0) {
                return;
            }
            this.method629(arg0, var2);
        }
    }

    @ObfuscatedName("ax.l(Ldi;II)V")
    public void method629(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2199();
            this.field804 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field804[var4] = arg0.method2282();
            }
        } else if (arg1 == 2) {
            this.field827 = arg0.method2139();
        } else if (arg1 == 12) {
            this.field820 = arg0.method2199();
        } else if (arg1 == 13) {
            this.field819 = arg0.method2282();
        } else if (arg1 == 14) {
            this.field815 = arg0.method2282();
        } else if (arg1 == 15) {
            this.field813 = arg0.method2282();
        } else if (arg1 == 16) {
            this.field832 = arg0.method2282();
        } else if (arg1 == 17) {
            this.field815 = arg0.method2282();
            this.field816 = arg0.method2282();
            this.field817 = arg0.method2282();
            this.field818 = arg0.method2282();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field822[arg1 - 30] = arg0.method2139();
            if (this.field822[arg1 - 30].equalsIgnoreCase(class147.field2290)) {
                this.field822[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2199();
            this.field806 = new short[var5];
            this.field831 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field806[var6] = (short) arg0.method2282();
                this.field831[var6] = (short) arg0.method2282();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2199();
            this.field810 = new short[var7];
            this.field821 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field810[var8] = (short) arg0.method2282();
                this.field821[var8] = (short) arg0.method2282();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2199();
            this.field811 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field811[var10] = arg0.method2282();
            }
        } else if (arg1 == 93) {
            this.field824 = false;
        } else if (arg1 == 95) {
            this.field825 = arg0.method2282();
        } else if (arg1 == 97) {
            this.field826 = arg0.method2282();
        } else if (arg1 == 98) {
            this.field812 = arg0.method2282();
        } else if (arg1 == 99) {
            this.field828 = true;
        } else if (arg1 == 100) {
            this.field829 = arg0.method2132();
        } else if (arg1 == 101) {
            this.field830 = arg0.method2132();
        } else if (arg1 == 102) {
            this.field814 = arg0.method2282();
        } else if (arg1 == 103) {
            this.field823 = arg0.method2282();
        } else if (arg1 == 106) {
            this.field809 = arg0.method2282();
            if (this.field809 == 65535) {
                this.field809 = -1;
            }
            this.field835 = arg0.method2282();
            if (this.field835 == 65535) {
                this.field835 = -1;
            }
            int var11 = arg0.method2199();
            this.field833 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field833[var12] = arg0.method2282();
                if (this.field833[var12] == 65535) {
                    this.field833[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field836 = false;
        } else if (arg1 == 109) {
            this.field837 = false;
        } else if (arg1 == 111) {
            this.field838 = true;
        } else if (arg1 == 112) {
            this.field839 = arg0.method2199();
        }
    }

    @ObfuscatedName("ax.m(Laa;ILaa;II)Lcl;")
    public final class99 method633(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field833 != null) {
            class36 var5 = this.method635();
            return var5 == null ? null : var5.method633(arg0, arg1, arg2, arg3);
        }
        class99 var6 = (class99) field834.method3181((long) this.field807);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field804.length; var8++) {
                if (!Statics.field2704.method2733(this.field804[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class94[] var9 = new class94[this.field804.length];
            for (int var10 = 0; var10 < this.field804.length; var10++) {
                var9[var10] = class94.method1882(Statics.field2704, this.field804[var10], 0);
            }
            class94 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class94(var9, var9.length);
            }
            if (this.field806 != null) {
                for (int var12 = 0; var12 < this.field806.length; var12++) {
                    var11.method1892(this.field806[var12], this.field831[var12]);
                }
            }
            if (this.field810 != null) {
                for (int var13 = 0; var13 < this.field810.length; var13++) {
                    var11.method1907(this.field810[var13], this.field821[var13]);
                }
            }
            var6 = var11.method1879(this.field829 + 64, this.field830 * 5 + 850, -30, -50, -30);
            field834.method3183(var6, (long) this.field807);
        }
        class99 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method744(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method763(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1977(true);
        } else {
            var14 = arg2.method763(var6, arg3);
        }
        if (this.field826 != 128 || this.field812 != 128) {
            var14.method2036(this.field826, this.field812, this.field826);
        }
        return var14;
    }

    @ObfuscatedName("ax.w(I)Lcy;")
    public final class94 method634() {
        if (this.field833 != null) {
            class36 var1 = this.method635();
            return var1 == null ? null : var1.method634();
        } else if (this.field811 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field811.length; var3++) {
                if (!Statics.field2704.method2733(this.field811[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class94[] var4 = new class94[this.field811.length];
            for (int var5 = 0; var5 < this.field811.length; var5++) {
                var4[var5] = class94.method1882(Statics.field2704, this.field811[var5], 0);
            }
            class94 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class94(var4, var4.length);
            }
            if (this.field806 != null) {
                for (int var7 = 0; var7 < this.field806.length; var7++) {
                    var6.method1892(this.field806[var7], this.field831[var7]);
                }
            }
            if (this.field810 != null) {
                for (int var8 = 0; var8 < this.field810.length; var8++) {
                    var6.method1907(this.field810[var8], this.field821[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ax.e(I)Lax;")
    public final class36 method635() {
        int var1 = -1;
        if (this.field809 != -1) {
            var1 = class159.method2538(this.field809);
        } else if (this.field835 != -1) {
            var1 = class159.field2701[this.field835];
        }
        return var1 < 0 || var1 >= this.field833.length || this.field833[var1] == -1 ? null : method1074(this.field833[var1]);
    }

    @ObfuscatedName("ax.n(B)Z")
    public boolean method636() {
        if (this.field833 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field809 != -1) {
            var1 = class159.method2538(this.field809);
        } else if (this.field835 != -1) {
            var1 = class159.field2701[this.field835];
        }
        return var1 >= 0 && var1 < this.field833.length && this.field833[var1] != -1;
    }

    @ObfuscatedName("az.s(I)V")
    public static void method676() {
        field805.method3184();
        field834.method3184();
    }
}
