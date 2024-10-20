package deob;

@ObfuscatedName("fm")
public class class158 extends class348 {

    @ObfuscatedName("fm.y")
    public static class222 field1880 = new class222(64);

    @ObfuscatedName("fm.j")
    public static class222 field1877 = new class222(100);

    @ObfuscatedName("fm.o")
    public int[] field1882;

    @ObfuscatedName("fm.m")
    public int[] field1883;

    @ObfuscatedName("fm.r")
    public int[] field1884;

    @ObfuscatedName("fm.h")
    public int[] field1885;

    @ObfuscatedName("fm.d")
    public int field1888 = -1;

    @ObfuscatedName("fm.z")
    public int[] field1887;

    @ObfuscatedName("fm.b")
    public boolean field1889 = false;

    @ObfuscatedName("fm.i")
    public int field1893 = 5;

    @ObfuscatedName("fm.k")
    public int field1890 = -1;

    @ObfuscatedName("fm.g")
    public int field1892 = -1;

    @ObfuscatedName("fm.t")
    public int field1897 = 99;

    @ObfuscatedName("fm.x")
    public int field1896 = -1;

    @ObfuscatedName("fm.u")
    public int field1894 = -1;

    @ObfuscatedName("fm.q")
    public int field1895 = 2;

    @ObfuscatedName("gs.f(II)Lfm;")
    public static class158 method3363(int arg0) {
        class158 var1 = (class158) field1880.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1891.method4504(12, arg0);
        class158 var3 = new class158();
        if (var2 != null) {
            var3.method2857(new class384(var2));
        }
        var3.method2869();
        field1880.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fm.e(Lnt;I)V")
    public void method2857(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2886(arg0, var2);
        }
    }

    @ObfuscatedName("fm.v(Lnt;IB)V")
    public void method2886(class384 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5899();
            this.field1884 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1884[var4] = arg0.method5899();
            }
            this.field1882 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1882[var5] = arg0.method5899();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1882[var6] += arg0.method5899() << 16;
            }
        } else if (arg1 == 2) {
            this.field1888 = arg0.method5899();
        } else if (arg1 == 3) {
            int var7 = arg0.method5902();
            this.field1887 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1887[var8] = arg0.method5902();
            }
            this.field1887[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1889 = true;
        } else if (arg1 == 5) {
            this.field1893 = arg0.method5902();
        } else if (arg1 == 6) {
            this.field1890 = arg0.method5899();
        } else if (arg1 == 7) {
            this.field1892 = arg0.method5899();
        } else if (arg1 == 8) {
            this.field1897 = arg0.method5902();
        } else if (arg1 == 9) {
            this.field1896 = arg0.method5902();
        } else if (arg1 == 10) {
            this.field1894 = arg0.method5902();
        } else if (arg1 == 11) {
            this.field1895 = arg0.method5902();
        } else if (arg1 == 12) {
            int var9 = arg0.method5902();
            this.field1883 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1883[var10] = arg0.method5899();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1883[var11] += arg0.method5899() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5902();
            this.field1885 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1885[var13] = arg0.method5901();
            }
        }
    }

    @ObfuscatedName("fm.y(I)V")
    public void method2869() {
        if (this.field1896 == -1) {
            if (this.field1887 == null) {
                this.field1896 = 0;
            } else {
                this.field1896 = 2;
            }
        }
        if (this.field1894 != -1) {
            return;
        }
        if (this.field1887 == null) {
            this.field1894 = 0;
        } else {
            this.field1894 = 2;
        }
    }

    @ObfuscatedName("fm.j(Lgd;II)Lgd;")
    public class206 method2858(class206 arg0, int arg1) {
        int var3 = this.field1882[arg1];
        class202 var4 = method994(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3839(true);
        } else {
            class206 var6 = arg0.method3839(!var4.method3796(var5));
            var6.method3897(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fm.o(Lgd;III)Lgd;")
    public class206 method2861(class206 arg0, int arg1, int arg2) {
        int var4 = this.field1882[arg1];
        class202 var5 = method994(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method3839(true);
        }
        class206 var7 = arg0.method3839(!var5.method3796(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method3850();
        } else if (var8 == 2) {
            var7.method3849();
        } else if (var8 == 3) {
            var7.method3848();
        }
        var7.method3897(var5, var6);
        if (var8 == 1) {
            var7.method3848();
        } else if (var8 == 2) {
            var7.method3849();
        } else if (var8 == 3) {
            var7.method3850();
        }
        return var7;
    }

    @ObfuscatedName("fm.m(Lgd;IB)Lgd;")
    public class206 method2862(class206 arg0, int arg1) {
        int var3 = this.field1882[arg1];
        class202 var4 = method994(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3859(true);
        } else {
            class206 var6 = arg0.method3859(!var4.method3796(var5));
            var6.method3897(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fm.r(Lgd;ILfm;II)Lgd;")
    public class206 method2863(class206 arg0, int arg1, class158 arg2, int arg3) {
        int var5 = this.field1882[arg1];
        class202 var6 = method994(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method2858(arg0, arg3);
        }
        int var8 = arg2.field1882[arg3];
        class202 var9 = method994(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class206 var11 = arg0.method3839(!var6.method3796(var7));
            var11.method3897(var6, var7);
            return var11;
        } else {
            class206 var12 = arg0.method3839(!var6.method3796(var7) & !var9.method3796(var10));
            var12.method3846(var6, var7, var9, var10, this.field1887);
            return var12;
        }
    }

    @ObfuscatedName("fm.h(Lgd;II)Lgd;")
    public class206 method2888(class206 arg0, int arg1) {
        int var3 = this.field1882[arg1];
        class202 var4 = method994(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3839(true);
        }
        class202 var6 = null;
        int var7 = 0;
        if (this.field1883 != null && arg1 < this.field1883.length) {
            int var8 = this.field1883[arg1];
            var6 = method994(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class206 var10 = arg0.method3839(!var4.method3796(var5));
            var10.method3897(var4, var5);
            return var10;
        } else {
            class206 var9 = arg0.method3839(!var4.method3796(var5) & !var6.method3796(var7));
            var9.method3897(var4, var5);
            var9.method3897(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bo.d(IB)Lgi;")
    public static class202 method994(int arg0) {
        class202 var1 = (class202) field1877.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class202 var2 = Statics.method159(Statics.field1878, Statics.field1879, arg0, false);
        if (var2 != null) {
            field1877.method3988(var2, (long) arg0);
        }
        return var2;
    }
}
