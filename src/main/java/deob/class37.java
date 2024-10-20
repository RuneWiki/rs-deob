package deob;

@ObfuscatedName("as")
public class class37 extends class195 {

    @ObfuscatedName("as.g")
    public static class184 field831 = new class184(64);

    @ObfuscatedName("as.n")
    public static class184 field832 = new class184(50);

    @ObfuscatedName("as.t")
    public int field843;

    @ObfuscatedName("as.e")
    public String field859 = "null";

    @ObfuscatedName("as.q")
    public int field849 = 1;

    @ObfuscatedName("as.z")
    public int[] field836;

    @ObfuscatedName("as.v")
    public int[] field835;

    @ObfuscatedName("as.b")
    public int field838 = -1;

    @ObfuscatedName("as.f")
    public int field839 = -1;

    @ObfuscatedName("as.i")
    public int field861 = -1;

    @ObfuscatedName("as.w")
    public int field841 = -1;

    @ObfuscatedName("as.l")
    public int field833 = -1;

    @ObfuscatedName("as.j")
    public int field863 = -1;

    @ObfuscatedName("as.s")
    public int field844 = -1;

    @ObfuscatedName("as.r")
    public short[] field845;

    @ObfuscatedName("as.h")
    public short[] field846;

    @ObfuscatedName("as.x")
    public short[] field847;

    @ObfuscatedName("as.m")
    public short[] field848;

    @ObfuscatedName("as.a")
    public String[] field869 = new String[5];

    @ObfuscatedName("as.p")
    public boolean field850 = true;

    @ObfuscatedName("as.c")
    public int field851 = -1;

    @ObfuscatedName("as.u")
    public int field852 = 128;

    @ObfuscatedName("as.d")
    public int field853 = 128;

    @ObfuscatedName("as.o")
    public boolean field854 = false;

    @ObfuscatedName("as.aj")
    public int field842 = 0;

    @ObfuscatedName("as.au")
    public int field856 = 0;

    @ObfuscatedName("as.ah")
    public int field857 = -1;

    @ObfuscatedName("as.ab")
    public int field858 = 32;

    @ObfuscatedName("as.am")
    public int[] field837;

    @ObfuscatedName("as.ar")
    public int field860 = -1;

    @ObfuscatedName("as.an")
    public int field840 = -1;

    @ObfuscatedName("as.az")
    public boolean field862 = true;

    @ObfuscatedName("as.at")
    public boolean field834 = true;

    @ObfuscatedName("as.ag")
    public boolean field864 = false;

    @ObfuscatedName("as.as")
    public int field829 = 30;

    @ObfuscatedName("r.y(Lfd;Lfd;I)V")
    public static void method151(class158 arg0, class158 arg1) {
        Statics.field867 = arg0;
        Statics.field855 = arg1;
    }

    @ObfuscatedName("de.k(II)Las;")
    public static class37 method2412(int arg0) {
        class37 var1 = (class37) field831.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field867.method2874(9, arg0);
        class37 var3 = new class37();
        var3.field843 = arg0;
        if (var2 != null) {
            var3.method674(new class111(var2));
        }
        var3.method673();
        field831.method3340(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.g(B)V")
    public void method673() {
    }

    @ObfuscatedName("as.n(Ldw;I)V")
    public void method674(class111 arg0) {
        while (true) {
            int var2 = arg0.method2205();
            if (var2 == 0) {
                return;
            }
            this.method675(arg0, var2);
        }
    }

    @ObfuscatedName("as.t(Ldw;II)V")
    public void method675(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2205();
            this.field836 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field836[var4] = arg0.method2339();
            }
        } else if (arg1 == 2) {
            this.field859 = arg0.method2170();
        } else if (arg1 == 12) {
            this.field849 = arg0.method2205();
        } else if (arg1 == 13) {
            this.field838 = arg0.method2339();
        } else if (arg1 == 14) {
            this.field841 = arg0.method2339();
        } else if (arg1 == 15) {
            this.field839 = arg0.method2339();
        } else if (arg1 == 16) {
            this.field861 = arg0.method2339();
        } else if (arg1 == 17) {
            this.field841 = arg0.method2339();
            this.field833 = arg0.method2339();
            this.field863 = arg0.method2339();
            this.field844 = arg0.method2339();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field869[arg1 - 30] = arg0.method2170();
            if (this.field869[arg1 - 30].equalsIgnoreCase(class148.field2225)) {
                this.field869[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2205();
            this.field845 = new short[var5];
            this.field846 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field845[var6] = (short) arg0.method2339();
                this.field846[var6] = (short) arg0.method2339();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2205();
            this.field847 = new short[var7];
            this.field848 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field847[var8] = (short) arg0.method2339();
                this.field848[var8] = (short) arg0.method2339();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2205();
            this.field835 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field835[var10] = arg0.method2339();
            }
        } else if (arg1 == 93) {
            this.field850 = false;
        } else if (arg1 == 95) {
            this.field851 = arg0.method2339();
        } else if (arg1 == 97) {
            this.field852 = arg0.method2339();
        } else if (arg1 == 98) {
            this.field853 = arg0.method2339();
        } else if (arg1 == 99) {
            this.field854 = true;
        } else if (arg1 == 100) {
            this.field842 = arg0.method2199();
        } else if (arg1 == 101) {
            this.field856 = arg0.method2199();
        } else if (arg1 == 102) {
            this.field857 = arg0.method2339();
        } else if (arg1 == 103) {
            this.field858 = arg0.method2339();
        } else if (arg1 == 106) {
            this.field860 = arg0.method2339();
            if (this.field860 == 65535) {
                this.field860 = -1;
            }
            this.field840 = arg0.method2339();
            if (this.field840 == 65535) {
                this.field840 = -1;
            }
            int var11 = arg0.method2205();
            this.field837 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field837[var12] = arg0.method2339();
                if (this.field837[var12] == 65535) {
                    this.field837[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field862 = false;
        } else if (arg1 == 109) {
            this.field834 = false;
        } else if (arg1 == 111) {
            this.field864 = true;
        } else if (arg1 == 112) {
            this.field829 = arg0.method2205();
        }
    }

    @ObfuscatedName("as.e(Lay;ILay;II)Lch;")
    public final class100 method676(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field837 != null) {
            class37 var5 = this.method678();
            return var5 == null ? null : var5.method676(arg0, arg1, arg2, arg3);
        }
        class100 var6 = (class100) field832.method3327((long) this.field843);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field836.length; var8++) {
                if (!Statics.field855.method2876(this.field836[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class95[] var9 = new class95[this.field836.length];
            for (int var10 = 0; var10 < this.field836.length; var10++) {
                var9[var10] = class95.method1900(Statics.field855, this.field836[var10], 0);
            }
            class95 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class95(var9, var9.length);
            }
            if (this.field845 != null) {
                for (int var12 = 0; var12 < this.field845.length; var12++) {
                    var11.method1922(this.field845[var12], this.field846[var12]);
                }
            }
            if (this.field847 != null) {
                for (int var13 = 0; var13 < this.field847.length; var13++) {
                    var11.method1915(this.field847[var13], this.field848[var13]);
                }
            }
            var6 = var11.method1953(this.field842 + 64, this.field856 * 5 + 850, -30, -50, -30);
            field832.method3340(var6, (long) this.field843);
        }
        class100 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method768(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method786(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2003(true);
        } else {
            var14 = arg2.method786(var6, arg3);
        }
        if (this.field852 != 128 || this.field853 != 128) {
            var14.method2011(this.field852, this.field853, this.field852);
        }
        return var14;
    }

    @ObfuscatedName("as.q(B)Lcc;")
    public final class95 method687() {
        if (this.field837 != null) {
            class37 var1 = this.method678();
            return var1 == null ? null : var1.method687();
        } else if (this.field835 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field835.length; var3++) {
                if (!Statics.field855.method2876(this.field835[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class95[] var4 = new class95[this.field835.length];
            for (int var5 = 0; var5 < this.field835.length; var5++) {
                var4[var5] = class95.method1900(Statics.field855, this.field835[var5], 0);
            }
            class95 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class95(var4, var4.length);
            }
            if (this.field845 != null) {
                for (int var7 = 0; var7 < this.field845.length; var7++) {
                    var6.method1922(this.field845[var7], this.field846[var7]);
                }
            }
            if (this.field847 != null) {
                for (int var8 = 0; var8 < this.field847.length; var8++) {
                    var6.method1915(this.field847[var8], this.field848[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("as.z(I)Las;")
    public final class37 method678() {
        int var1 = -1;
        if (this.field860 != -1) {
            var1 = class167.method14(this.field860);
        } else if (this.field840 != -1) {
            var1 = class167.field2816[this.field840];
        }
        return var1 < 0 || var1 >= this.field837.length || this.field837[var1] == -1 ? null : method2412(this.field837[var1]);
    }

    @ObfuscatedName("as.v(I)Z")
    public boolean method679() {
        if (this.field837 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field860 != -1) {
            var1 = class167.method14(this.field860);
        } else if (this.field840 != -1) {
            var1 = class167.field2816[this.field840];
        }
        return var1 >= 0 && var1 < this.field837.length && this.field837[var1] != -1;
    }
}
