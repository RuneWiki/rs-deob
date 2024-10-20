package deob;

@ObfuscatedName("aw")
public class class34 extends class174 {

    @ObfuscatedName("aw.i")
    public static class170 field884 = new class170(64);

    @ObfuscatedName("aw.k")
    public static class170 field885 = new class170(100);

    @ObfuscatedName("aw.q")
    public int[] field891;

    @ObfuscatedName("aw.t")
    public int[] field899;

    @ObfuscatedName("aw.v")
    public int[] field888;

    @ObfuscatedName("aw.y")
    public int[] field882;

    @ObfuscatedName("aw.w")
    public int field890 = -1;

    @ObfuscatedName("aw.g")
    public int[] field889;

    @ObfuscatedName("aw.s")
    public boolean field892 = false;

    @ObfuscatedName("aw.n")
    public int field893 = 5;

    @ObfuscatedName("aw.x")
    public int field901 = -1;

    @ObfuscatedName("aw.o")
    public int field895 = -1;

    @ObfuscatedName("aw.l")
    public int field896 = 99;

    @ObfuscatedName("aw.u")
    public int field903 = -1;

    @ObfuscatedName("aw.z")
    public int field898 = -1;

    @ObfuscatedName("aw.d")
    public int field897 = 2;

    @ObfuscatedName("ex.b(Leo;Leo;Leo;B)V")
    public static void method2961(class153 arg0, class153 arg1, class153 arg2) {
        Statics.field886 = arg0;
        Statics.field894 = arg1;
        Statics.field883 = arg2;
    }

    @ObfuscatedName("aw.j(Ldv;I)V")
    public void method693(class127 arg0) {
        while (true) {
            int var2 = arg0.method2416();
            if (var2 == 0) {
                return;
            }
            this.method694(arg0, var2);
        }
    }

    @ObfuscatedName("aw.i(Ldv;IB)V")
    public void method694(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2394();
            this.field888 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field888[var4] = arg0.method2394();
            }
            this.field891 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field891[var5] = arg0.method2394();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field891[var6] += arg0.method2394() << 16;
            }
        } else if (arg1 == 2) {
            this.field890 = arg0.method2394();
        } else if (arg1 == 3) {
            int var7 = arg0.method2416();
            this.field889 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field889[var8] = arg0.method2416();
            }
            this.field889[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field892 = true;
        } else if (arg1 == 5) {
            this.field893 = arg0.method2416();
        } else if (arg1 == 6) {
            this.field901 = arg0.method2394();
        } else if (arg1 == 7) {
            this.field895 = arg0.method2394();
        } else if (arg1 == 8) {
            this.field896 = arg0.method2416();
        } else if (arg1 == 9) {
            this.field903 = arg0.method2416();
        } else if (arg1 == 10) {
            this.field898 = arg0.method2416();
        } else if (arg1 == 11) {
            this.field897 = arg0.method2416();
        } else if (arg1 == 12) {
            int var9 = arg0.method2416();
            this.field899 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field899[var10] = arg0.method2394();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field899[var11] += arg0.method2394() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2416();
            this.field882 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field882[var13] = arg0.method2400();
            }
        }
    }

    @ObfuscatedName("aw.k(B)V")
    public void method695() {
        if (this.field903 == -1) {
            if (this.field889 == null) {
                this.field903 = 0;
            } else {
                this.field903 = 2;
            }
        }
        if (this.field898 != -1) {
            return;
        }
        if (this.field889 == null) {
            this.field898 = 0;
        } else {
            this.field898 = 2;
        }
    }

    @ObfuscatedName("aw.q(Ldr;II)Ldr;")
    public class112 method729(class112 arg0, int arg1) {
        int var3 = this.field891[arg1];
        class109 var4 = method12(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2242(true);
        } else {
            class112 var6 = arg0.method2242(!var4.method2172(var5));
            var6.method2199(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.t(Ldr;III)Ldr;")
    public class112 method697(class112 arg0, int arg1, int arg2) {
        int var4 = this.field891[arg1];
        class109 var5 = method12(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2242(true);
        }
        class112 var7 = arg0.method2242(!var5.method2172(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2204();
        } else if (var8 == 2) {
            var7.method2203();
        } else if (var8 == 3) {
            var7.method2202();
        }
        var7.method2199(var5, var6);
        if (var8 == 1) {
            var7.method2202();
        } else if (var8 == 2) {
            var7.method2203();
        } else if (var8 == 3) {
            var7.method2204();
        }
        return var7;
    }

    @ObfuscatedName("aw.v(Ldr;II)Ldr;")
    public class112 method720(class112 arg0, int arg1) {
        int var3 = this.field891[arg1];
        class109 var4 = method12(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2194(true);
        } else {
            class112 var6 = arg0.method2194(!var4.method2172(var5));
            var6.method2199(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.y(Ldr;ILaw;II)Ldr;")
    public class112 method712(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field891[arg1];
        class109 var6 = method12(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method729(arg0, arg3);
        }
        int var8 = arg2.field891[arg3];
        class109 var9 = method12(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2242(!var6.method2172(var7));
            var11.method2199(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2242(!var6.method2172(var7) & !var9.method2172(var10));
            var12.method2200(var6, var7, var9, var10, this.field889);
            return var12;
        }
    }

    @ObfuscatedName("aw.w(Ldr;II)Ldr;")
    public class112 method727(class112 arg0, int arg1) {
        int var3 = this.field891[arg1];
        class109 var4 = method12(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2242(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field899 != null && arg1 < this.field899.length) {
            int var8 = this.field899[arg1];
            var6 = method12(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2242(!var4.method2172(var5));
            var10.method2199(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2242(!var4.method2172(var5) & !var6.method2172(var7));
            var9.method2199(var4, var5);
            var9.method2199(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("j.g(IB)Ldf;")
    public static class109 method12(int arg0) {
        class109 var1 = (class109) field885.method3188((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class153 var2 = Statics.field894;
        class153 var3 = Statics.field883;
        boolean var4 = true;
        int[] var5 = var2.method2999(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2969(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2969(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class109 var10;
        if (var4) {
            try {
                var10 = new class109(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field885.method3190(var10, (long) arg0);
        }
        return var10;
    }
}
