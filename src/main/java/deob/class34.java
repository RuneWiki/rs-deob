package deob;

@ObfuscatedName("ag")
public class class34 extends class174 {

    @ObfuscatedName("ag.l")
    public static class170 field888 = new class170(64);

    @ObfuscatedName("ag.q")
    public static class170 field893 = new class170(100);

    @ObfuscatedName("ag.b")
    public int[] field890;

    @ObfuscatedName("ag.u")
    public int[] field891;

    @ObfuscatedName("ag.d")
    public int[] field892;

    @ObfuscatedName("ag.m")
    public int[] field887;

    @ObfuscatedName("ag.v")
    public int field894 = -1;

    @ObfuscatedName("ag.j")
    public int[] field905;

    @ObfuscatedName("ag.f")
    public boolean field901 = false;

    @ObfuscatedName("ag.h")
    public int field897 = 5;

    @ObfuscatedName("ag.o")
    public int field885 = -1;

    @ObfuscatedName("ag.z")
    public int field899 = -1;

    @ObfuscatedName("ag.k")
    public int field900 = 99;

    @ObfuscatedName("ag.y")
    public int field902 = -1;

    @ObfuscatedName("ag.g")
    public int field896 = -1;

    @ObfuscatedName("ag.e")
    public int field903 = 2;

    @ObfuscatedName("ak.i(IB)Lag;")
    public static class34 method763(int arg0) {
        class34 var1 = (class34) field888.method3223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field889.method2932(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method723(new class127(var2));
        }
        var3.method718();
        field888.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.p(Ldn;B)V")
    public void method723(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method690(arg0, var2);
        }
    }

    @ObfuscatedName("ag.a(Ldn;IB)V")
    public void method690(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2413();
            this.field892 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field892[var4] = arg0.method2413();
            }
            this.field890 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field890[var5] = arg0.method2413();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field890[var6] += arg0.method2413() << 16;
            }
        } else if (arg1 == 2) {
            this.field894 = arg0.method2413();
        } else if (arg1 == 3) {
            int var7 = arg0.method2411();
            this.field905 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field905[var8] = arg0.method2411();
            }
            this.field905[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field901 = true;
        } else if (arg1 == 5) {
            this.field897 = arg0.method2411();
        } else if (arg1 == 6) {
            this.field885 = arg0.method2413();
        } else if (arg1 == 7) {
            this.field899 = arg0.method2413();
        } else if (arg1 == 8) {
            this.field900 = arg0.method2411();
        } else if (arg1 == 9) {
            this.field902 = arg0.method2411();
        } else if (arg1 == 10) {
            this.field896 = arg0.method2411();
        } else if (arg1 == 11) {
            this.field903 = arg0.method2411();
        } else if (arg1 == 12) {
            int var9 = arg0.method2411();
            this.field891 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field891[var10] = arg0.method2413();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field891[var11] += arg0.method2413() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2411();
            this.field887 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field887[var13] = arg0.method2415();
            }
        }
    }

    @ObfuscatedName("ag.l(I)V")
    public void method718() {
        if (this.field902 == -1) {
            if (this.field905 == null) {
                this.field902 = 0;
            } else {
                this.field902 = 2;
            }
        }
        if (this.field896 != -1) {
            return;
        }
        if (this.field905 == null) {
            this.field896 = 0;
        } else {
            this.field896 = 2;
        }
    }

    @ObfuscatedName("ag.q(Ldc;IS)Ldc;")
    public class112 method692(class112 arg0, int arg1) {
        int var3 = this.field890[arg1];
        class109 var4 = method3111(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2239(true);
        } else {
            class112 var6 = arg0.method2239(!var4.method2150(var5));
            var6.method2177(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ag.b(Ldc;IIB)Ldc;")
    public class112 method693(class112 arg0, int arg1, int arg2) {
        int var4 = this.field890[arg1];
        class109 var5 = method3111(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2239(true);
        }
        class112 var7 = arg0.method2239(!var5.method2150(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2182();
        } else if (var8 == 2) {
            var7.method2181();
        } else if (var8 == 3) {
            var7.method2250();
        }
        var7.method2177(var5, var6);
        if (var8 == 1) {
            var7.method2250();
        } else if (var8 == 2) {
            var7.method2181();
        } else if (var8 == 3) {
            var7.method2182();
        }
        return var7;
    }

    @ObfuscatedName("ag.u(Ldc;II)Ldc;")
    public class112 method697(class112 arg0, int arg1) {
        int var3 = this.field890[arg1];
        class109 var4 = method3111(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2237(true);
        } else {
            class112 var6 = arg0.method2237(!var4.method2150(var5));
            var6.method2177(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ag.d(Ldc;ILag;II)Ldc;")
    public class112 method695(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field890[arg1];
        class109 var6 = method3111(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method692(arg0, arg3);
        }
        int var8 = arg2.field890[arg3];
        class109 var9 = method3111(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2239(!var6.method2150(var7));
            var11.method2177(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2239(!var6.method2150(var7) & !var9.method2150(var10));
            var12.method2178(var6, var7, var9, var10, this.field905);
            return var12;
        }
    }

    @ObfuscatedName("ag.m(Ldc;II)Ldc;")
    public class112 method696(class112 arg0, int arg1) {
        int var3 = this.field890[arg1];
        class109 var4 = method3111(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2239(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field891 != null && arg1 < this.field891.length) {
            int var8 = this.field891[arg1];
            var6 = method3111(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2239(!var4.method2150(var5));
            var10.method2177(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2239(!var4.method2150(var5) & !var6.method2150(var7));
            var9.method2177(var4, var5);
            var9.method2177(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fj.v(IS)Ldg;")
    public static class109 method3111(int arg0) {
        class109 var1 = (class109) field893.method3223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class152 var2 = Statics.field886;
        class152 var3 = Statics.field895;
        boolean var4 = true;
        int[] var5 = var2.method2944(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2948(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2948(var8, 0);
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
            field893.method3225(var10, (long) arg0);
        }
        return var10;
    }
}
