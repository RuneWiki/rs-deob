package deob;

@ObfuscatedName("af")
public class class35 extends class183 {

    @ObfuscatedName("af.k")
    public static class172 field799 = new class172(64);

    @ObfuscatedName("af.i")
    public static class172 field800 = new class172(50);

    @ObfuscatedName("af.d")
    public int field828;

    @ObfuscatedName("af.q")
    public String field802 = "null";

    @ObfuscatedName("af.m")
    public int field803 = 1;

    @ObfuscatedName("af.a")
    public int[] field804;

    @ObfuscatedName("af.w")
    public int[] field805;

    @ObfuscatedName("af.e")
    public int field806 = -1;

    @ObfuscatedName("af.o")
    public int field807 = -1;

    @ObfuscatedName("af.v")
    public int field808 = -1;

    @ObfuscatedName("af.z")
    public int field822 = -1;

    @ObfuscatedName("af.j")
    public int field809 = -1;

    @ObfuscatedName("af.r")
    public int field801 = -1;

    @ObfuscatedName("af.c")
    public int field812 = -1;

    @ObfuscatedName("af.u")
    public short[] field813;

    @ObfuscatedName("af.h")
    public short[] field814;

    @ObfuscatedName("af.t")
    public short[] field815;

    @ObfuscatedName("af.f")
    public short[] field816;

    @ObfuscatedName("af.g")
    public String[] field817 = new String[5];

    @ObfuscatedName("af.s")
    public boolean field836 = true;

    @ObfuscatedName("af.y")
    public int field819 = -1;

    @ObfuscatedName("af.p")
    public int field820 = 128;

    @ObfuscatedName("af.b")
    public int field821 = 128;

    @ObfuscatedName("af.l")
    public boolean field810 = false;

    @ObfuscatedName("af.al")
    public int field823 = 0;

    @ObfuscatedName("af.aa")
    public int field824 = 0;

    @ObfuscatedName("af.ar")
    public int field825 = -1;

    @ObfuscatedName("af.ak")
    public int field826 = 32;

    @ObfuscatedName("af.ay")
    public int[] field827;

    @ObfuscatedName("af.aw")
    public int field811 = -1;

    @ObfuscatedName("af.av")
    public int field829 = -1;

    @ObfuscatedName("af.at")
    public boolean field798 = true;

    @ObfuscatedName("af.af")
    public boolean field831 = true;

    @ObfuscatedName("af.ae")
    public boolean field832 = false;

    @ObfuscatedName("af.ai")
    public int field833 = 30;

    @ObfuscatedName("cw.n(Lej;Lej;I)V")
    public static void method1857(class147 arg0, class147 arg1) {
        Statics.field818 = arg0;
        Statics.field838 = arg1;
    }

    @ObfuscatedName("av.x(IS)Laf;")
    public static class35 method616(int arg0) {
        class35 var1 = (class35) field799.method3115((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field818.method2738(9, arg0);
        class35 var3 = new class35();
        var3.field828 = arg0;
        if (var2 != null) {
            var3.method624(new class107(var2));
        }
        var3.method623();
        field799.method3117(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.k(I)V")
    public void method623() {
    }

    @ObfuscatedName("af.i(Ldw;B)V")
    public void method624(class107 arg0) {
        while (true) {
            int var2 = arg0.method2148();
            if (var2 == 0) {
                return;
            }
            this.method625(arg0, var2);
        }
    }

    @ObfuscatedName("af.d(Ldw;IB)V")
    public void method625(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2148();
            this.field804 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field804[var4] = arg0.method2140();
            }
        } else if (arg1 == 2) {
            this.field802 = arg0.method2182();
        } else if (arg1 == 12) {
            this.field803 = arg0.method2148();
        } else if (arg1 == 13) {
            this.field806 = arg0.method2140();
        } else if (arg1 == 14) {
            this.field822 = arg0.method2140();
        } else if (arg1 == 15) {
            this.field807 = arg0.method2140();
        } else if (arg1 == 16) {
            this.field808 = arg0.method2140();
        } else if (arg1 == 17) {
            this.field822 = arg0.method2140();
            this.field809 = arg0.method2140();
            this.field801 = arg0.method2140();
            this.field812 = arg0.method2140();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field817[arg1 - 30] = arg0.method2182();
            if (this.field817[arg1 - 30].equalsIgnoreCase(class143.field2327)) {
                this.field817[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2148();
            this.field813 = new short[var5];
            this.field814 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field813[var6] = (short) arg0.method2140();
                this.field814[var6] = (short) arg0.method2140();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2148();
            this.field815 = new short[var7];
            this.field816 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field815[var8] = (short) arg0.method2140();
                this.field816[var8] = (short) arg0.method2140();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2148();
            this.field805 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field805[var10] = arg0.method2140();
            }
        } else if (arg1 == 93) {
            this.field836 = false;
        } else if (arg1 == 95) {
            this.field819 = arg0.method2140();
        } else if (arg1 == 97) {
            this.field820 = arg0.method2140();
        } else if (arg1 == 98) {
            this.field821 = arg0.method2140();
        } else if (arg1 == 99) {
            this.field810 = true;
        } else if (arg1 == 100) {
            this.field823 = arg0.method2175();
        } else if (arg1 == 101) {
            this.field824 = arg0.method2175() * 5;
        } else if (arg1 == 102) {
            this.field825 = arg0.method2140();
        } else if (arg1 == 103) {
            this.field826 = arg0.method2140();
        } else if (arg1 == 106) {
            this.field811 = arg0.method2140();
            if (this.field811 == 65535) {
                this.field811 = -1;
            }
            this.field829 = arg0.method2140();
            if (this.field829 == 65535) {
                this.field829 = -1;
            }
            int var11 = arg0.method2148();
            this.field827 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field827[var12] = arg0.method2140();
                if (this.field827[var12] == 65535) {
                    this.field827[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field798 = false;
        } else if (arg1 == 109) {
            this.field831 = false;
        } else if (arg1 == 111) {
            this.field832 = true;
        } else if (arg1 == 112) {
            this.field833 = arg0.method2148();
        }
    }

    @ObfuscatedName("af.q(Las;ILas;II)Lcy;")
    public final class98 method648(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field827 != null) {
            class35 var5 = this.method637();
            return var5 == null ? null : var5.method648(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field800.method3115((long) this.field828);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field804.length; var8++) {
                if (!Statics.field838.method2712(this.field804[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field804.length];
            for (int var10 = 0; var10 < this.field804.length; var10++) {
                var9[var10] = class93.method1894(Statics.field838, this.field804[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field813 != null) {
                for (int var12 = 0; var12 < this.field813.length; var12++) {
                    var11.method1907(this.field813[var12], this.field814[var12]);
                }
            }
            if (this.field815 != null) {
                for (int var13 = 0; var13 < this.field815.length; var13++) {
                    var11.method1953(this.field815[var13], this.field816[var13]);
                }
            }
            var6 = var11.method1908(this.field823 + 64, this.field824 + 850, -30, -50, -30);
            field800.method3117(var6, (long) this.field828);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method717(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method714(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1988(true);
        } else {
            var14 = arg2.method714(var6, arg3);
        }
        if (this.field820 != 128 || this.field821 != 128) {
            var14.method2001(this.field820, this.field821, this.field820);
        }
        return var14;
    }

    @ObfuscatedName("af.m(S)Lcx;")
    public final class93 method627() {
        if (this.field827 != null) {
            class35 var1 = this.method637();
            return var1 == null ? null : var1.method627();
        } else if (this.field805 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field805.length; var3++) {
                if (!Statics.field838.method2712(this.field805[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field805.length];
            for (int var5 = 0; var5 < this.field805.length; var5++) {
                var4[var5] = class93.method1894(Statics.field838, this.field805[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field813 != null) {
                for (int var7 = 0; var7 < this.field813.length; var7++) {
                    var6.method1907(this.field813[var7], this.field814[var7]);
                }
            }
            if (this.field815 != null) {
                for (int var8 = 0; var8 < this.field815.length; var8++) {
                    var6.method1953(this.field815[var8], this.field816[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("af.a(B)Laf;")
    public final class35 method637() {
        int var1 = -1;
        if (this.field811 != -1) {
            var1 = class155.method2650(this.field811);
        } else if (this.field829 != -1) {
            var1 = class155.field2663[this.field829];
        }
        return var1 < 0 || var1 >= this.field827.length || this.field827[var1] == -1 ? null : method616(this.field827[var1]);
    }

    @ObfuscatedName("af.w(I)Z")
    public boolean method650() {
        if (this.field827 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field811 != -1) {
            var1 = class155.method2650(this.field811);
        } else if (this.field829 != -1) {
            var1 = class155.field2663[this.field829];
        }
        return var1 >= 0 && var1 < this.field827.length && this.field827[var1] != -1;
    }
}
