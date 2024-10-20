package deob;

@ObfuscatedName("fx")
public class class172 extends class406 {

    @ObfuscatedName("fx.k")
    public static class257 field1867 = new class257(256);

    @ObfuscatedName("fx.a")
    public final int field1868;

    @ObfuscatedName("fx.m")
    public int field1880 = -1;

    @ObfuscatedName("fx.p")
    public int field1879 = -1;

    @ObfuscatedName("fx.s")
    public String field1871;

    @ObfuscatedName("fx.r")
    public int field1872;

    @ObfuscatedName("fx.v")
    public int field1869 = 0;

    @ObfuscatedName("fx.c")
    public boolean field1877 = true;

    @ObfuscatedName("fx.w")
    public boolean field1875 = false;

    @ObfuscatedName("fx.b")
    public String[] field1876 = new String[5];

    @ObfuscatedName("fx.t")
    public String field1881;

    @ObfuscatedName("fx.g")
    public int[] field1874;

    @ObfuscatedName("fx.x")
    public int field1866 = Integer.MAX_VALUE;

    @ObfuscatedName("fx.n")
    public int field1870 = Integer.MAX_VALUE;

    @ObfuscatedName("fx.e")
    public int field1886 = Integer.MIN_VALUE;

    @ObfuscatedName("fx.h")
    public int field1882 = Integer.MIN_VALUE;

    @ObfuscatedName("fx.f")
    public class178 field1883 = class178.field1944;

    @ObfuscatedName("fx.d")
    public class180 field1884 = class180.field2001;

    @ObfuscatedName("fx.j")
    public int[] field1885;

    @ObfuscatedName("fx.z")
    public byte[] field1878;

    @ObfuscatedName("fx.i")
    public int field1887 = -1;

    public class172(int arg0) {
        this.field1868 = arg0;
    }

    @ObfuscatedName("ez.o(Llp;Llp;I)Z")
    public static boolean method2800(class316 arg0, class316 arg1) {
        Statics.field4081 = arg1;
        if (!arg0.method5188()) {
            return false;
        }
        Statics.field1873 = arg0.method5200(35);
        Statics.field4167 = new class172[Statics.field1873];
        for (int var2 = 0; var2 < Statics.field1873; var2++) {
            byte[] var3 = arg0.method5249(35, var2);
            Statics.field4167[var2] = new class172(var2);
            if (var3 != null) {
                Statics.field4167[var2].method3016(new class440(var3));
                Statics.field4167[var2].method3002();
            }
        }
        return true;
    }

    @ObfuscatedName("dv.q(IB)Lfx;")
    public static class172 method2598(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field4167.length || Statics.field4167[arg0] == null ? new class172(arg0) : Statics.field4167[arg0];
    }

    @ObfuscatedName("fx.l(Lpx;B)V")
    public void method3016(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3012(arg0, var2);
        }
    }

    @ObfuscatedName("fx.k(Lpx;IB)V")
    public void method3012(class440 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1880 = arg0.method6910();
        } else if (arg1 == 2) {
            this.field1879 = arg0.method6910();
        } else if (arg1 == 3) {
            this.field1871 = arg0.method7044();
        } else if (arg1 == 4) {
            this.field1872 = arg0.method6897();
        } else if (arg1 == 5) {
            arg0.method6897();
        } else if (arg1 == 6) {
            this.field1869 = arg0.method7071();
        } else if (arg1 == 7) {
            int var3 = arg0.method7071();
            if ((var3 & 0x1) == 0) {
                this.field1877 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1875 = true;
            }
        } else if (arg1 == 8) {
            arg0.method7071();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1876[arg1 - 10] = arg0.method7044();
        } else if (arg1 == 15) {
            int var4 = arg0.method7071();
            this.field1874 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1874[var5] = arg0.method6896();
            }
            arg0.method6898();
            int var6 = arg0.method7071();
            this.field1885 = new int[var6];
            for (int var7 = 0; var7 < this.field1885.length; var7++) {
                this.field1885[var7] = arg0.method6898();
            }
            this.field1878 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1878[var8] = arg0.method7034();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1881 = arg0.method7044();
            } else if (arg1 == 18) {
                arg0.method6910();
            } else if (arg1 == 19) {
                this.field1887 = arg0.method7082();
            } else if (arg1 == 21) {
                arg0.method6898();
            } else if (arg1 == 22) {
                arg0.method6898();
            } else if (arg1 == 23) {
                arg0.method7071();
                arg0.method7071();
                arg0.method7071();
            } else if (arg1 == 24) {
                arg0.method6896();
                arg0.method6896();
            } else if (arg1 == 25) {
                arg0.method6910();
            } else if (arg1 == 28) {
                arg0.method7071();
            } else if (arg1 == 29) {
                class178[] var9 = new class178[] { class178.field1944, class178.field1938, class178.field1939 };
                this.field1883 = (class178) class330.method4934(var9, arg0.method7071());
            } else if (arg1 == 30) {
                class180[] var10 = new class180[] { class180.field2002, class180.field2001, class180.field1995 };
                this.field1884 = (class180) class330.method4934(var10, arg0.method7071());
            }
        }
    }

    @ObfuscatedName("fx.a(B)V")
    public void method3002() {
        if (this.field1874 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1874.length; var1 += 2) {
            if (this.field1874[var1] < this.field1866) {
                this.field1866 = this.field1874[var1];
            } else if (this.field1874[var1] > this.field1886) {
                this.field1886 = this.field1874[var1];
            }
            if (this.field1874[var1 + 1] < this.field1870) {
                this.field1870 = this.field1874[var1 + 1];
            } else if (this.field1874[var1 + 1] > this.field1882) {
                this.field1882 = this.field1874[var1 + 1];
            }
        }
    }

    @ObfuscatedName("fx.m(ZI)Lqr;")
    public class453 method3009(boolean arg0) {
        int var2 = arg0 ? this.field1879 : this.field1880;
        return this.method2998(var2);
    }

    @ObfuscatedName("fx.p(II)Lqr;")
    public class453 method2998(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class453 var2 = (class453) field1867.method4566((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class453 var3 = class454.method3230(Statics.field4081, arg0, 0);
        if (var3 != null) {
            field1867.method4571(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("fx.s(B)I")
    public int method3001() {
        return this.field1868;
    }
}
