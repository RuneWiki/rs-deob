package deob;

@ObfuscatedName("al")
public class class33 extends class173 {

    @ObfuscatedName("al.c")
    public static class169 field859 = new class169(64);

    @ObfuscatedName("al.r")
    public static class169 field860 = new class169(100);

    @ObfuscatedName("al.k")
    public int[] field861;

    @ObfuscatedName("al.e")
    public int[] field858;

    @ObfuscatedName("al.q")
    public int[] field864;

    @ObfuscatedName("al.u")
    public int[] field866;

    @ObfuscatedName("al.s")
    public int field865 = -1;

    @ObfuscatedName("al.l")
    public int[] field863;

    @ObfuscatedName("al.o")
    public boolean field867 = false;

    @ObfuscatedName("al.h")
    public int field868 = 5;

    @ObfuscatedName("al.p")
    public int field869 = -1;

    @ObfuscatedName("al.d")
    public int field870 = -1;

    @ObfuscatedName("al.m")
    public int field871 = 99;

    @ObfuscatedName("al.z")
    public int field872 = -1;

    @ObfuscatedName("al.t")
    public int field873 = -1;

    @ObfuscatedName("al.i")
    public int field874 = 2;

    @ObfuscatedName("bn.v(II)Lal;")
    public static class33 method1401(int arg0) {
        class33 var1 = (class33) field859.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2451.method3020(12, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method720(new class126(var2));
        }
        var3.method705();
        field859.method3231(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.f(Ldr;I)V")
    public void method720(class126 arg0) {
        while (true) {
            int var2 = arg0.method2466();
            if (var2 == 0) {
                return;
            }
            this.method704(arg0, var2);
        }
    }

    @ObfuscatedName("al.n(Ldr;II)V")
    public void method704(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2468();
            this.field864 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field864[var4] = arg0.method2468();
            }
            this.field861 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field861[var5] = arg0.method2468();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field861[var6] += arg0.method2468() << 16;
            }
        } else if (arg1 == 2) {
            this.field865 = arg0.method2468();
        } else if (arg1 == 3) {
            int var7 = arg0.method2466();
            this.field863 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field863[var8] = arg0.method2466();
            }
            this.field863[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field867 = true;
        } else if (arg1 == 5) {
            this.field868 = arg0.method2466();
        } else if (arg1 == 6) {
            this.field869 = arg0.method2468();
        } else if (arg1 == 7) {
            this.field870 = arg0.method2468();
        } else if (arg1 == 8) {
            this.field871 = arg0.method2466();
        } else if (arg1 == 9) {
            this.field872 = arg0.method2466();
        } else if (arg1 == 10) {
            this.field873 = arg0.method2466();
        } else if (arg1 == 11) {
            this.field874 = arg0.method2466();
        } else if (arg1 == 12) {
            int var9 = arg0.method2466();
            this.field858 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field858[var10] = arg0.method2468();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field858[var11] += arg0.method2468() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2466();
            this.field866 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field866[var13] = arg0.method2470();
            }
        }
    }

    @ObfuscatedName("al.c(I)V")
    public void method705() {
        if (this.field872 == -1) {
            if (this.field863 == null) {
                this.field872 = 0;
            } else {
                this.field872 = 2;
            }
        }
        if (this.field873 != -1) {
            return;
        }
        if (this.field863 == null) {
            this.field873 = 0;
        } else {
            this.field873 = 2;
        }
    }

    @ObfuscatedName("al.r(Ldf;II)Ldf;")
    public class111 method710(class111 arg0, int arg1) {
        int var3 = this.field861[arg1];
        class108 var4 = method2140(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2276(true);
        } else {
            class111 var6 = arg0.method2276(!var4.method2231(var5));
            var6.method2256(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("al.k(Ldf;III)Ldf;")
    public class111 method707(class111 arg0, int arg1, int arg2) {
        int var4 = this.field861[arg1];
        class108 var5 = method2140(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2276(true);
        }
        class111 var7 = arg0.method2276(!var5.method2231(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2261();
        } else if (var8 == 2) {
            var7.method2260();
        } else if (var8 == 3) {
            var7.method2259();
        }
        var7.method2256(var5, var6);
        if (var8 == 1) {
            var7.method2259();
        } else if (var8 == 2) {
            var7.method2260();
        } else if (var8 == 3) {
            var7.method2261();
        }
        return var7;
    }

    @ObfuscatedName("al.e(Ldf;II)Ldf;")
    public class111 method708(class111 arg0, int arg1) {
        int var3 = this.field861[arg1];
        class108 var4 = method2140(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2273(true);
        } else {
            class111 var6 = arg0.method2273(!var4.method2231(var5));
            var6.method2256(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("al.q(Ldf;ILal;IB)Ldf;")
    public class111 method709(class111 arg0, int arg1, class33 arg2, int arg3) {
        int var5 = this.field861[arg1];
        class108 var6 = method2140(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method710(arg0, arg3);
        }
        int var8 = arg2.field861[arg3];
        class108 var9 = method2140(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class111 var11 = arg0.method2276(!var6.method2231(var7));
            var11.method2256(var6, var7);
            return var11;
        } else {
            class111 var12 = arg0.method2276(!var6.method2231(var7) & !var9.method2231(var10));
            var12.method2267(var6, var7, var9, var10, this.field863);
            return var12;
        }
    }

    @ObfuscatedName("al.u(Ldf;II)Ldf;")
    public class111 method702(class111 arg0, int arg1) {
        int var3 = this.field861[arg1];
        class108 var4 = method2140(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2276(true);
        }
        class108 var6 = null;
        int var7 = 0;
        if (this.field858 != null && arg1 < this.field858.length) {
            int var8 = this.field858[arg1];
            var6 = method2140(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class111 var10 = arg0.method2276(!var4.method2231(var5));
            var10.method2256(var4, var5);
            return var10;
        } else {
            class111 var9 = arg0.method2276(!var4.method2231(var5) & !var6.method2231(var7));
            var9.method2256(var4, var5);
            var9.method2256(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ck.s(II)Lds;")
    public static class108 method2140(int arg0) {
        class108 var1 = (class108) field860.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class151 var2 = Statics.field862;
        class151 var3 = Statics.field875;
        boolean var4 = true;
        int[] var5 = var2.method2970(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3025(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3025(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class108 var10;
        if (var4) {
            try {
                var10 = new class108(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field860.method3231(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("m.l(I)V")
    public static void method132() {
        field859.method3227();
        field860.method3227();
    }
}
