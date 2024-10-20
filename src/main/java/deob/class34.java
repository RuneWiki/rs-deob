package deob;

@ObfuscatedName("ac")
public class class34 extends class174 {

    @ObfuscatedName("ac.e")
    public static class170 field872 = new class170(64);

    @ObfuscatedName("ac.l")
    public static class170 field873 = new class170(100);

    @ObfuscatedName("ac.d")
    public int[] field890;

    @ObfuscatedName("ac.r")
    public int[] field879;

    @ObfuscatedName("ac.k")
    public int[] field887;

    @ObfuscatedName("ac.u")
    public int[] field886;

    @ObfuscatedName("ac.o")
    public int field877 = -1;

    @ObfuscatedName("ac.g")
    public int[] field875;

    @ObfuscatedName("ac.s")
    public boolean field869 = false;

    @ObfuscatedName("ac.b")
    public int field881 = 5;

    @ObfuscatedName("ac.v")
    public int field882 = -1;

    @ObfuscatedName("ac.j")
    public int field883 = -1;

    @ObfuscatedName("ac.q")
    public int field884 = 99;

    @ObfuscatedName("ac.a")
    public int field885 = -1;

    @ObfuscatedName("ac.c")
    public int field880 = -1;

    @ObfuscatedName("ac.m")
    public int field893 = 2;

    @ObfuscatedName("x.f(Leo;Leo;Leo;I)V")
    public static void method230(class153 arg0, class153 arg1, class153 arg2) {
        Statics.field876 = arg0;
        Statics.field870 = arg1;
        Statics.field874 = arg2;
    }

    @ObfuscatedName("ad.t(II)Lac;")
    public static class34 method572(int arg0) {
        class34 var1 = (class34) field872.method3276((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field876.method3035(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method713(new class127(var2));
        }
        var3.method696();
        field872.method3275(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.n(Ldq;S)V")
    public void method713(class127 arg0) {
        while (true) {
            int var2 = arg0.method2458();
            if (var2 == 0) {
                return;
            }
            this.method732(arg0, var2);
        }
    }

    @ObfuscatedName("ac.e(Ldq;II)V")
    public void method732(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2460();
            this.field887 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field887[var4] = arg0.method2460();
            }
            this.field890 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field890[var5] = arg0.method2460();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field890[var6] += arg0.method2460() << 16;
            }
        } else if (arg1 == 2) {
            this.field877 = arg0.method2460();
        } else if (arg1 == 3) {
            int var7 = arg0.method2458();
            this.field875 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field875[var8] = arg0.method2458();
            }
            this.field875[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field869 = true;
        } else if (arg1 == 5) {
            this.field881 = arg0.method2458();
        } else if (arg1 == 6) {
            this.field882 = arg0.method2460();
        } else if (arg1 == 7) {
            this.field883 = arg0.method2460();
        } else if (arg1 == 8) {
            this.field884 = arg0.method2458();
        } else if (arg1 == 9) {
            this.field885 = arg0.method2458();
        } else if (arg1 == 10) {
            this.field880 = arg0.method2458();
        } else if (arg1 == 11) {
            this.field893 = arg0.method2458();
        } else if (arg1 == 12) {
            int var9 = arg0.method2458();
            this.field879 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field879[var10] = arg0.method2460();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field879[var11] += arg0.method2460() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2458();
            this.field886 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field886[var13] = arg0.method2554();
            }
        }
    }

    @ObfuscatedName("ac.l(I)V")
    public void method696() {
        if (this.field885 == -1) {
            if (this.field875 == null) {
                this.field885 = 0;
            } else {
                this.field885 = 2;
            }
        }
        if (this.field880 != -1) {
            return;
        }
        if (this.field875 == null) {
            this.field880 = 0;
        } else {
            this.field880 = 2;
        }
    }

    @ObfuscatedName("ac.d(Ldp;IB)Ldp;")
    public class112 method714(class112 arg0, int arg1) {
        int var3 = this.field890[arg1];
        class109 var4 = method1537(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2263(true);
        } else {
            class112 var6 = arg0.method2263(!var4.method2223(var5));
            var6.method2299(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.r(Ldp;III)Ldp;")
    public class112 method698(class112 arg0, int arg1, int arg2) {
        int var4 = this.field890[arg1];
        class109 var5 = method1537(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2263(true);
        }
        class112 var7 = arg0.method2263(!var5.method2223(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2258();
        } else if (var8 == 2) {
            var7.method2246();
        } else if (var8 == 3) {
            var7.method2286();
        }
        var7.method2299(var5, var6);
        if (var8 == 1) {
            var7.method2286();
        } else if (var8 == 2) {
            var7.method2246();
        } else if (var8 == 3) {
            var7.method2258();
        }
        return var7;
    }

    @ObfuscatedName("ac.k(Ldp;IB)Ldp;")
    public class112 method719(class112 arg0, int arg1) {
        int var3 = this.field890[arg1];
        class109 var4 = method1537(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2238(true);
        } else {
            class112 var6 = arg0.method2238(!var4.method2223(var5));
            var6.method2299(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.u(Ldp;ILac;IB)Ldp;")
    public class112 method728(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field890[arg1];
        class109 var6 = method1537(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method714(arg0, arg3);
        }
        int var8 = arg2.field890[arg3];
        class109 var9 = method1537(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2263(!var6.method2223(var7));
            var11.method2299(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2263(!var6.method2223(var7) & !var9.method2223(var10));
            var12.method2243(var6, var7, var9, var10, this.field875);
            return var12;
        }
    }

    @ObfuscatedName("ac.o(Ldp;IB)Ldp;")
    public class112 method700(class112 arg0, int arg1) {
        int var3 = this.field890[arg1];
        class109 var4 = method1537(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2263(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field879 != null && arg1 < this.field879.length) {
            int var8 = this.field879[arg1];
            var6 = method1537(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2263(!var4.method2223(var5));
            var10.method2299(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2263(!var4.method2223(var5) & !var6.method2223(var7));
            var9.method2299(var4, var5);
            var9.method2299(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bf.g(II)Ldc;")
    public static class109 method1537(int arg0) {
        class109 var1 = (class109) field873.method3276((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class153 var2 = Statics.field870;
        class153 var3 = Statics.field874;
        boolean var4 = true;
        int[] var5 = var2.method3043(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3081(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3081(var8, 0);
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
            field873.method3275(var10, (long) arg0);
        }
        return var10;
    }
}
