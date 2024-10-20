package deob;

@ObfuscatedName("ae")
public class class35 extends class183 {

    @ObfuscatedName("ae.k")
    public static class172 field807 = new class172(64);

    @ObfuscatedName("ae.e")
    public static class172 field808 = new class172(50);

    @ObfuscatedName("ae.w")
    public int field809;

    @ObfuscatedName("ae.m")
    public String field810 = "null";

    @ObfuscatedName("ae.u")
    public int field831 = 1;

    @ObfuscatedName("ae.j")
    public int[] field817;

    @ObfuscatedName("ae.o")
    public int[] field813;

    @ObfuscatedName("ae.h")
    public int field814 = -1;

    @ObfuscatedName("ae.b")
    public int field815 = -1;

    @ObfuscatedName("ae.r")
    public int field816 = -1;

    @ObfuscatedName("ae.l")
    public int field844 = -1;

    @ObfuscatedName("ae.x")
    public int field826 = -1;

    @ObfuscatedName("ae.q")
    public int field819 = -1;

    @ObfuscatedName("ae.t")
    public int field820 = -1;

    @ObfuscatedName("ae.y")
    public short[] field834;

    @ObfuscatedName("ae.d")
    public short[] field818;

    @ObfuscatedName("ae.z")
    public short[] field823;

    @ObfuscatedName("ae.n")
    public short[] field824;

    @ObfuscatedName("ae.v")
    public String[] field825 = new String[5];

    @ObfuscatedName("ae.f")
    public boolean field837 = true;

    @ObfuscatedName("ae.a")
    public int field832 = -1;

    @ObfuscatedName("ae.p")
    public int field828 = 128;

    @ObfuscatedName("ae.s")
    public int field839 = 128;

    @ObfuscatedName("ae.c")
    public boolean field830 = false;

    @ObfuscatedName("ae.ar")
    public int field806 = 0;

    @ObfuscatedName("ae.ac")
    public int field836 = 0;

    @ObfuscatedName("ae.ah")
    public int field833 = -1;

    @ObfuscatedName("ae.ap")
    public int field827 = 32;

    @ObfuscatedName("ae.aj")
    public int[] field835;

    @ObfuscatedName("ae.as")
    public int field822 = -1;

    @ObfuscatedName("ae.aa")
    public int field812 = -1;

    @ObfuscatedName("ae.am")
    public boolean field838 = true;

    @ObfuscatedName("ae.ae")
    public boolean field821 = true;

    @ObfuscatedName("ae.ai")
    public boolean field840 = false;

    @ObfuscatedName("ae.ay")
    public int field841 = 30;

    @ObfuscatedName("v.g(Leo;Leo;B)V")
    public static void method477(class147 arg0, class147 arg1) {
        Statics.field829 = arg0;
        Statics.field1916 = arg1;
    }

    @ObfuscatedName("e.i(II)Lae;")
    public static class35 method34(int arg0) {
        class35 var1 = (class35) field807.method3135((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field829.method2734(9, arg0);
        class35 var3 = new class35();
        var3.field809 = arg0;
        if (var2 != null) {
            var3.method587(new class107(var2));
        }
        var3.method586();
        field807.method3140(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.k(I)V")
    public void method586() {
    }

    @ObfuscatedName("ae.e(Ldk;B)V")
    public void method587(class107 arg0) {
        while (true) {
            int var2 = arg0.method2092();
            if (var2 == 0) {
                return;
            }
            this.method588(arg0, var2);
        }
    }

    @ObfuscatedName("ae.w(Ldk;IS)V")
    public void method588(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2092();
            this.field817 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field817[var4] = arg0.method2094();
            }
        } else if (arg1 == 2) {
            this.field810 = arg0.method2251();
        } else if (arg1 == 12) {
            this.field831 = arg0.method2092();
        } else if (arg1 == 13) {
            this.field814 = arg0.method2094();
        } else if (arg1 == 14) {
            this.field844 = arg0.method2094();
        } else if (arg1 == 15) {
            this.field815 = arg0.method2094();
        } else if (arg1 == 16) {
            this.field816 = arg0.method2094();
        } else if (arg1 == 17) {
            this.field844 = arg0.method2094();
            this.field826 = arg0.method2094();
            this.field819 = arg0.method2094();
            this.field820 = arg0.method2094();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field825[arg1 - 30] = arg0.method2251();
            if (this.field825[arg1 - 30].equalsIgnoreCase(class143.field2173)) {
                this.field825[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2092();
            this.field834 = new short[var5];
            this.field818 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field834[var6] = (short) arg0.method2094();
                this.field818[var6] = (short) arg0.method2094();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2092();
            this.field823 = new short[var7];
            this.field824 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field823[var8] = (short) arg0.method2094();
                this.field824[var8] = (short) arg0.method2094();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2092();
            this.field813 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field813[var10] = arg0.method2094();
            }
        } else if (arg1 == 93) {
            this.field837 = false;
        } else if (arg1 == 95) {
            this.field832 = arg0.method2094();
        } else if (arg1 == 97) {
            this.field828 = arg0.method2094();
        } else if (arg1 == 98) {
            this.field839 = arg0.method2094();
        } else if (arg1 == 99) {
            this.field830 = true;
        } else if (arg1 == 100) {
            this.field806 = arg0.method2117();
        } else if (arg1 == 101) {
            this.field836 = arg0.method2117() * 5;
        } else if (arg1 == 102) {
            this.field833 = arg0.method2094();
        } else if (arg1 == 103) {
            this.field827 = arg0.method2094();
        } else if (arg1 == 106) {
            this.field822 = arg0.method2094();
            if (this.field822 == 65535) {
                this.field822 = -1;
            }
            this.field812 = arg0.method2094();
            if (this.field812 == 65535) {
                this.field812 = -1;
            }
            int var11 = arg0.method2092();
            this.field835 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field835[var12] = arg0.method2094();
                if (this.field835[var12] == 65535) {
                    this.field835[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field838 = false;
        } else if (arg1 == 109) {
            this.field821 = false;
        } else if (arg1 == 111) {
            this.field840 = true;
        } else if (arg1 == 112) {
            this.field841 = arg0.method2092();
        }
    }

    @ObfuscatedName("ae.m(Lax;ILax;II)Lce;")
    public final class98 method622(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field835 != null) {
            class35 var5 = this.method596();
            return var5 == null ? null : var5.method622(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field808.method3135((long) this.field809);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field817.length; var8++) {
                if (!Statics.field1916.method2724(this.field817[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field817.length];
            for (int var10 = 0; var10 < this.field817.length; var10++) {
                var9[var10] = class93.method1903(Statics.field1916, this.field817[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field834 != null) {
                for (int var12 = 0; var12 < this.field834.length; var12++) {
                    var11.method1873(this.field834[var12], this.field818[var12]);
                }
            }
            if (this.field823 != null) {
                for (int var13 = 0; var13 < this.field823.length; var13++) {
                    var11.method1874(this.field823[var13], this.field824[var13]);
                }
            }
            var6 = var11.method1881(this.field806 + 64, this.field836 + 850, -30, -50, -30);
            field808.method3140(var6, (long) this.field809);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method694(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method691(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1983(true);
        } else {
            var14 = arg2.method691(var6, arg3);
        }
        if (this.field828 != 128 || this.field839 != 128) {
            var14.method1968(this.field828, this.field839, this.field828);
        }
        return var14;
    }

    @ObfuscatedName("ae.u(B)Lcr;")
    public final class93 method590() {
        if (this.field835 != null) {
            class35 var1 = this.method596();
            return var1 == null ? null : var1.method590();
        } else if (this.field813 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field813.length; var3++) {
                if (!Statics.field1916.method2724(this.field813[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field813.length];
            for (int var5 = 0; var5 < this.field813.length; var5++) {
                var4[var5] = class93.method1903(Statics.field1916, this.field813[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field834 != null) {
                for (int var7 = 0; var7 < this.field834.length; var7++) {
                    var6.method1873(this.field834[var7], this.field818[var7]);
                }
            }
            if (this.field823 != null) {
                for (int var8 = 0; var8 < this.field823.length; var8++) {
                    var6.method1874(this.field823[var8], this.field824[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ae.j(I)Lae;")
    public final class35 method596() {
        int var1 = -1;
        if (this.field822 != -1) {
            var1 = class155.method879(this.field822);
        } else if (this.field812 != -1) {
            var1 = class155.field2684[this.field812];
        }
        return var1 < 0 || var1 >= this.field835.length || this.field835[var1] == -1 ? null : method34(this.field835[var1]);
    }

    @ObfuscatedName("ae.o(I)Z")
    public boolean method593() {
        if (this.field835 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field822 != -1) {
            var1 = class155.method879(this.field822);
        } else if (this.field812 != -1) {
            var1 = class155.field2684[this.field812];
        }
        return var1 >= 0 && var1 < this.field835.length && this.field835[var1] != -1;
    }
}
