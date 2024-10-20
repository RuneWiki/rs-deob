package deob;

@ObfuscatedName("am")
public class class33 extends class172 {

    @ObfuscatedName("am.z")
    public static class168 field859 = new class168(64);

    @ObfuscatedName("am.c")
    public static class168 field860 = new class168(100);

    @ObfuscatedName("am.e")
    public int[] field861;

    @ObfuscatedName("am.s")
    public int[] field862;

    @ObfuscatedName("am.i")
    public int[] field863;

    @ObfuscatedName("am.g")
    public int[] field874;

    @ObfuscatedName("am.q")
    public int field865 = -1;

    @ObfuscatedName("am.w")
    public int[] field866;

    @ObfuscatedName("am.k")
    public boolean field869 = false;

    @ObfuscatedName("am.v")
    public int field868 = 5;

    @ObfuscatedName("am.o")
    public int field876 = -1;

    @ObfuscatedName("am.m")
    public int field867 = -1;

    @ObfuscatedName("am.u")
    public int field871 = 99;

    @ObfuscatedName("am.r")
    public int field872 = -1;

    @ObfuscatedName("am.d")
    public int field864 = -1;

    @ObfuscatedName("am.n")
    public int field858 = 2;

    @ObfuscatedName("de.j(II)Lam;")
    public static class33 method2614(int arg0) {
        class33 var1 = (class33) field859.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field873.method2903(12, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method689(new class126(var2));
        }
        var3.method684();
        field859.method3181(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.y(Ldr;B)V")
    public void method689(class126 arg0) {
        while (true) {
            int var2 = arg0.method2399();
            if (var2 == 0) {
                return;
            }
            this.method683(arg0, var2);
        }
    }

    @ObfuscatedName("am.x(Ldr;II)V")
    public void method683(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2405();
            this.field863 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field863[var4] = arg0.method2405();
            }
            this.field861 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field861[var5] = arg0.method2405();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field861[var6] += arg0.method2405() << 16;
            }
        } else if (arg1 == 2) {
            this.field865 = arg0.method2405();
        } else if (arg1 == 3) {
            int var7 = arg0.method2399();
            this.field866 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field866[var8] = arg0.method2399();
            }
            this.field866[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field869 = true;
        } else if (arg1 == 5) {
            this.field868 = arg0.method2399();
        } else if (arg1 == 6) {
            this.field876 = arg0.method2405();
        } else if (arg1 == 7) {
            this.field867 = arg0.method2405();
        } else if (arg1 == 8) {
            this.field871 = arg0.method2399();
        } else if (arg1 == 9) {
            this.field872 = arg0.method2399();
        } else if (arg1 == 10) {
            this.field864 = arg0.method2399();
        } else if (arg1 == 11) {
            this.field858 = arg0.method2399();
        } else if (arg1 == 12) {
            int var9 = arg0.method2399();
            this.field862 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field862[var10] = arg0.method2405();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field862[var11] += arg0.method2405() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2399();
            this.field874 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field874[var13] = arg0.method2386();
            }
        }
    }

    @ObfuscatedName("am.z(I)V")
    public void method684() {
        if (this.field872 == -1) {
            if (this.field866 == null) {
                this.field872 = 0;
            } else {
                this.field872 = 2;
            }
        }
        if (this.field864 != -1) {
            return;
        }
        if (this.field866 == null) {
            this.field864 = 0;
        } else {
            this.field864 = 2;
        }
    }

    @ObfuscatedName("am.c(Ldh;IS)Ldh;")
    public class111 method686(class111 arg0, int arg1) {
        int var3 = this.field861[arg1];
        class108 var4 = method1823(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2189(true);
        } else {
            class111 var6 = arg0.method2189(!var4.method2150(var5));
            var6.method2173(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("am.e(Ldh;IIB)Ldh;")
    public class111 method700(class111 arg0, int arg1, int arg2) {
        int var4 = this.field861[arg1];
        class108 var5 = method1823(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2189(true);
        }
        class111 var7 = arg0.method2189(!var5.method2150(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2209();
        } else if (var8 == 2) {
            var7.method2177();
        } else if (var8 == 3) {
            var7.method2233();
        }
        var7.method2173(var5, var6);
        if (var8 == 1) {
            var7.method2233();
        } else if (var8 == 2) {
            var7.method2177();
        } else if (var8 == 3) {
            var7.method2209();
        }
        return var7;
    }

    @ObfuscatedName("am.s(Ldh;II)Ldh;")
    public class111 method715(class111 arg0, int arg1) {
        int var3 = this.field861[arg1];
        class108 var4 = method1823(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2214(true);
        } else {
            class111 var6 = arg0.method2214(!var4.method2150(var5));
            var6.method2173(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("am.i(Ldh;ILam;II)Ldh;")
    public class111 method707(class111 arg0, int arg1, class33 arg2, int arg3) {
        int var5 = this.field861[arg1];
        class108 var6 = method1823(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method686(arg0, arg3);
        }
        int var8 = arg2.field861[arg3];
        class108 var9 = method1823(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class111 var11 = arg0.method2189(!var6.method2150(var7));
            var11.method2173(var6, var7);
            return var11;
        } else {
            class111 var12 = arg0.method2189(!var6.method2150(var7) & !var9.method2150(var10));
            var12.method2226(var6, var7, var9, var10, this.field866);
            return var12;
        }
    }

    @ObfuscatedName("am.g(Ldh;II)Ldh;")
    public class111 method712(class111 arg0, int arg1) {
        int var3 = this.field861[arg1];
        class108 var4 = method1823(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2189(true);
        }
        class108 var6 = null;
        int var7 = 0;
        if (this.field862 != null && arg1 < this.field862.length) {
            int var8 = this.field862[arg1];
            var6 = method1823(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class111 var10 = arg0.method2189(!var4.method2150(var5));
            var10.method2173(var4, var5);
            return var10;
        } else {
            class111 var9 = arg0.method2189(!var4.method2150(var5) & !var6.method2150(var7));
            var9.method2173(var4, var5);
            var9.method2173(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("co.q(IB)Ldu;")
    public static class108 method1823(int arg0) {
        class108 var1 = (class108) field860.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class108 var2 = Statics.method1449(Statics.field857, Statics.field870, arg0, false);
        if (var2 != null) {
            field860.method3181(var2, (long) arg0);
        }
        return var2;
    }
}
