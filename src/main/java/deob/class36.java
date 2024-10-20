package deob;

@ObfuscatedName("aq")
public class class36 extends class187 {

    @ObfuscatedName("aq.d")
    public static class176 field775 = new class176(64);

    @ObfuscatedName("aq.c")
    public static class176 field776 = new class176(50);

    @ObfuscatedName("aq.r")
    public int field777;

    @ObfuscatedName("aq.f")
    public String field784 = "null";

    @ObfuscatedName("aq.z")
    public int field779 = 1;

    @ObfuscatedName("aq.o")
    public int[] field780;

    @ObfuscatedName("aq.k")
    public int[] field803;

    @ObfuscatedName("aq.s")
    public int field805 = -1;

    @ObfuscatedName("aq.h")
    public int field809 = -1;

    @ObfuscatedName("aq.m")
    public int field783 = -1;

    @ObfuscatedName("aq.w")
    public int field785 = -1;

    @ObfuscatedName("aq.q")
    public int field773 = -1;

    @ObfuscatedName("aq.u")
    public int field787 = -1;

    @ObfuscatedName("aq.e")
    public int field788 = -1;

    @ObfuscatedName("aq.b")
    public short[] field807;

    @ObfuscatedName("aq.g")
    public short[] field774;

    @ObfuscatedName("aq.j")
    public short[] field791;

    @ObfuscatedName("aq.a")
    public short[] field792;

    @ObfuscatedName("aq.x")
    public String[] field793 = new String[5];

    @ObfuscatedName("aq.n")
    public boolean field794 = true;

    @ObfuscatedName("aq.v")
    public int field795 = -1;

    @ObfuscatedName("aq.l")
    public int field796 = 128;

    @ObfuscatedName("aq.t")
    public int field799 = 128;

    @ObfuscatedName("aq.i")
    public boolean field798 = false;

    @ObfuscatedName("aq.aw")
    public int field789 = 0;

    @ObfuscatedName("aq.ar")
    public int field800 = 0;

    @ObfuscatedName("aq.af")
    public int field778 = -1;

    @ObfuscatedName("aq.am")
    public int field802 = 32;

    @ObfuscatedName("aq.ax")
    public int[] field801;

    @ObfuscatedName("aq.av")
    public int field804 = -1;

    @ObfuscatedName("aq.al")
    public int field782 = -1;

    @ObfuscatedName("aq.ab")
    public boolean field806 = true;

    @ObfuscatedName("aq.ac")
    public boolean field797 = true;

    @ObfuscatedName("aq.aq")
    public boolean field808 = false;

    @ObfuscatedName("aq.az")
    public int field786 = 30;

    @ObfuscatedName("r.p(II)Laq;")
    public static class36 method31(int arg0) {
        class36 var1 = (class36) field775.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field781.method2811(9, arg0);
        class36 var3 = new class36();
        var3.field777 = arg0;
        if (var2 != null) {
            var3.method642(new class110(var2));
        }
        var3.method651();
        field775.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.y(B)V")
    public void method651() {
    }

    @ObfuscatedName("aq.d(Ldg;B)V")
    public void method642(class110 arg0) {
        while (true) {
            int var2 = arg0.method2309();
            if (var2 == 0) {
                return;
            }
            this.method662(arg0, var2);
        }
    }

    @ObfuscatedName("aq.c(Ldg;IB)V")
    public void method662(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2309();
            this.field780 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field780[var4] = arg0.method2243();
            }
        } else if (arg1 == 2) {
            this.field784 = arg0.method2132();
        } else if (arg1 == 12) {
            this.field779 = arg0.method2309();
        } else if (arg1 == 13) {
            this.field805 = arg0.method2243();
        } else if (arg1 == 14) {
            this.field785 = arg0.method2243();
        } else if (arg1 == 15) {
            this.field809 = arg0.method2243();
        } else if (arg1 == 16) {
            this.field783 = arg0.method2243();
        } else if (arg1 == 17) {
            this.field785 = arg0.method2243();
            this.field773 = arg0.method2243();
            this.field787 = arg0.method2243();
            this.field788 = arg0.method2243();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field793[arg1 - 30] = arg0.method2132();
            if (this.field793[arg1 - 30].equalsIgnoreCase(class147.field2166)) {
                this.field793[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2309();
            this.field807 = new short[var5];
            this.field774 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field807[var6] = (short) arg0.method2243();
                this.field774[var6] = (short) arg0.method2243();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2309();
            this.field791 = new short[var7];
            this.field792 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field791[var8] = (short) arg0.method2243();
                this.field792[var8] = (short) arg0.method2243();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2309();
            this.field803 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field803[var10] = arg0.method2243();
            }
        } else if (arg1 == 93) {
            this.field794 = false;
        } else if (arg1 == 95) {
            this.field795 = arg0.method2243();
        } else if (arg1 == 97) {
            this.field796 = arg0.method2243();
        } else if (arg1 == 98) {
            this.field799 = arg0.method2243();
        } else if (arg1 == 99) {
            this.field798 = true;
        } else if (arg1 == 100) {
            this.field789 = arg0.method2125();
        } else if (arg1 == 101) {
            this.field800 = arg0.method2125();
        } else if (arg1 == 102) {
            this.field778 = arg0.method2243();
        } else if (arg1 == 103) {
            this.field802 = arg0.method2243();
        } else if (arg1 == 106) {
            this.field804 = arg0.method2243();
            if (this.field804 == 65535) {
                this.field804 = -1;
            }
            this.field782 = arg0.method2243();
            if (this.field782 == 65535) {
                this.field782 = -1;
            }
            int var11 = arg0.method2309();
            this.field801 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field801[var12] = arg0.method2243();
                if (this.field801[var12] == 65535) {
                    this.field801[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field806 = false;
        } else if (arg1 == 109) {
            this.field797 = false;
        } else if (arg1 == 111) {
            this.field808 = true;
        } else if (arg1 == 112) {
            this.field786 = arg0.method2309();
        }
    }

    @ObfuscatedName("aq.r(Lat;ILat;II)Lcy;")
    public final class99 method644(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field801 != null) {
            class36 var5 = this.method646();
            return var5 == null ? null : var5.method644(arg0, arg1, arg2, arg3);
        }
        class99 var6 = (class99) field776.method3198((long) this.field777);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field780.length; var8++) {
                if (!Statics.field790.method2783(this.field780[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class94[] var9 = new class94[this.field780.length];
            for (int var10 = 0; var10 < this.field780.length; var10++) {
                var9[var10] = class94.method1903(Statics.field790, this.field780[var10], 0);
            }
            class94 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class94(var9, var9.length);
            }
            if (this.field807 != null) {
                for (int var12 = 0; var12 < this.field807.length; var12++) {
                    var11.method1922(this.field807[var12], this.field774[var12]);
                }
            }
            if (this.field791 != null) {
                for (int var13 = 0; var13 < this.field791.length; var13++) {
                    var11.method1917(this.field791[var13], this.field792[var13]);
                }
            }
            var6 = var11.method1926(this.field789 + 64, this.field800 * 5 + 850, -30, -50, -30);
            field776.method3193(var6, (long) this.field777);
        }
        class99 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method733(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method730(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2042(true);
        } else {
            var14 = arg2.method730(var6, arg3);
        }
        if (this.field796 != 128 || this.field799 != 128) {
            var14.method2013(this.field796, this.field799, this.field796);
        }
        return var14;
    }

    @ObfuscatedName("aq.f(B)Lch;")
    public final class94 method645() {
        if (this.field801 != null) {
            class36 var1 = this.method646();
            return var1 == null ? null : var1.method645();
        } else if (this.field803 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field803.length; var3++) {
                if (!Statics.field790.method2783(this.field803[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class94[] var4 = new class94[this.field803.length];
            for (int var5 = 0; var5 < this.field803.length; var5++) {
                var4[var5] = class94.method1903(Statics.field790, this.field803[var5], 0);
            }
            class94 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class94(var4, var4.length);
            }
            if (this.field807 != null) {
                for (int var7 = 0; var7 < this.field807.length; var7++) {
                    var6.method1922(this.field807[var7], this.field774[var7]);
                }
            }
            if (this.field791 != null) {
                for (int var8 = 0; var8 < this.field791.length; var8++) {
                    var6.method1917(this.field791[var8], this.field792[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aq.z(I)Laq;")
    public final class36 method646() {
        int var1 = -1;
        if (this.field804 != -1) {
            var1 = class159.method2859(this.field804);
        } else if (this.field782 != -1) {
            var1 = class159.field2680[this.field782];
        }
        return var1 < 0 || var1 >= this.field801.length || this.field801[var1] == -1 ? null : method31(this.field801[var1]);
    }

    @ObfuscatedName("aq.o(I)Z")
    public boolean method647() {
        if (this.field801 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field804 != -1) {
            var1 = class159.method2859(this.field804);
        } else if (this.field782 != -1) {
            var1 = class159.field2680[this.field782];
        }
        return var1 >= 0 && var1 < this.field801.length && this.field801[var1] != -1;
    }
}
