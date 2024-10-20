package deob;

@ObfuscatedName("fa")
public class class172 extends class364 {

    @ObfuscatedName("fa.k")
    public static class236 field1953 = new class236(64);

    @ObfuscatedName("fa.o")
    public static class236 field1948 = new class236(100);

    @ObfuscatedName("fa.g")
    public int[] field1952;

    @ObfuscatedName("fa.z")
    public int[] field1945;

    @ObfuscatedName("fa.a")
    public int[] field1951;

    @ObfuscatedName("fa.u")
    public int[] field1950;

    @ObfuscatedName("fa.e")
    public int field1958 = -1;

    @ObfuscatedName("fa.l")
    public int[] field1954;

    @ObfuscatedName("fa.y")
    public boolean field1955 = false;

    @ObfuscatedName("fa.v")
    public int field1956 = 5;

    @ObfuscatedName("fa.f")
    public int field1963 = -1;

    @ObfuscatedName("fa.s")
    public int field1946 = -1;

    @ObfuscatedName("fa.h")
    public int field1959 = 99;

    @ObfuscatedName("fa.d")
    public int field1960 = -1;

    @ObfuscatedName("fa.q")
    public int field1961 = -1;

    @ObfuscatedName("fa.j")
    public int field1962 = 2;

    @ObfuscatedName("h.n(Lkk;Lkk;Lkk;B)V")
    public static void method205(class290 arg0, class290 arg1, class290 arg2) {
        Statics.field1957 = arg0;
        Statics.field1944 = arg1;
        Statics.field1947 = arg2;
    }

    @ObfuscatedName("q.c(IB)Lfa;")
    public static class172 method269(int arg0) {
        class172 var1 = (class172) field1953.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1957.method4710(12, arg0);
        class172 var3 = new class172();
        if (var2 != null) {
            var3.method3038(new class400(var2));
        }
        var3.method3074();
        field1953.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fa.m(Lot;I)V")
    public void method3038(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method3039(arg0, var2);
        }
    }

    @ObfuscatedName("fa.k(Lot;II)V")
    public void method3039(class400 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6219();
            this.field1951 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1951[var4] = arg0.method6219();
            }
            this.field1952 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1952[var5] = arg0.method6219();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1952[var6] += arg0.method6219() << 16;
            }
        } else if (arg1 == 2) {
            this.field1958 = arg0.method6219();
        } else if (arg1 == 3) {
            int var7 = arg0.method6217();
            this.field1954 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1954[var8] = arg0.method6217();
            }
            this.field1954[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1955 = true;
        } else if (arg1 == 5) {
            this.field1956 = arg0.method6217();
        } else if (arg1 == 6) {
            this.field1963 = arg0.method6219();
        } else if (arg1 == 7) {
            this.field1946 = arg0.method6219();
        } else if (arg1 == 8) {
            this.field1959 = arg0.method6217();
        } else if (arg1 == 9) {
            this.field1960 = arg0.method6217();
        } else if (arg1 == 10) {
            this.field1961 = arg0.method6217();
        } else if (arg1 == 11) {
            this.field1962 = arg0.method6217();
        } else if (arg1 == 12) {
            int var9 = arg0.method6217();
            this.field1945 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1945[var10] = arg0.method6219();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1945[var11] += arg0.method6219() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method6217();
            this.field1950 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1950[var13] = arg0.method6327();
            }
        }
    }

    @ObfuscatedName("fa.o(B)V")
    public void method3074() {
        if (this.field1960 == -1) {
            if (this.field1954 == null) {
                this.field1960 = 0;
            } else {
                this.field1960 = 2;
            }
        }
        if (this.field1961 != -1) {
            return;
        }
        if (this.field1954 == null) {
            this.field1961 = 0;
        } else {
            this.field1961 = 2;
        }
    }

    @ObfuscatedName("fa.g(Lhg;II)Lhg;")
    public class220 method3041(class220 arg0, int arg1) {
        int var3 = this.field1952[arg1];
        class216 var4 = method2380(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4015(true);
        } else {
            class220 var6 = arg0.method4015(!var4.method3980(var5));
            var6.method4057(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fa.z(Lhg;III)Lhg;")
    public class220 method3065(class220 arg0, int arg1, int arg2) {
        int var4 = this.field1952[arg1];
        class216 var5 = method2380(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4015(true);
        }
        class220 var7 = arg0.method4015(!var5.method3980(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4025();
        } else if (var8 == 2) {
            var7.method4022();
        } else if (var8 == 3) {
            var7.method4049();
        }
        var7.method4057(var5, var6);
        if (var8 == 1) {
            var7.method4049();
        } else if (var8 == 2) {
            var7.method4022();
        } else if (var8 == 3) {
            var7.method4025();
        }
        return var7;
    }

    @ObfuscatedName("fa.a(Lhg;II)Lhg;")
    public class220 method3043(class220 arg0, int arg1) {
        int var3 = this.field1952[arg1];
        class216 var4 = method2380(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4016(true);
        } else {
            class220 var6 = arg0.method4016(!var4.method3980(var5));
            var6.method4057(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fa.u(Lhg;ILfa;II)Lhg;")
    public class220 method3044(class220 arg0, int arg1, class172 arg2, int arg3) {
        int var5 = this.field1952[arg1];
        class216 var6 = method2380(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3041(arg0, arg3);
        }
        int var8 = arg2.field1952[arg3];
        class216 var9 = method2380(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class220 var11 = arg0.method4015(!var6.method3980(var7));
            var11.method4057(var6, var7);
            return var11;
        } else {
            class220 var12 = arg0.method4015(!var6.method3980(var7) & !var9.method3980(var10));
            var12.method4085(var6, var7, var9, var10, this.field1954);
            return var12;
        }
    }

    @ObfuscatedName("fa.e(Lhg;IB)Lhg;")
    public class220 method3053(class220 arg0, int arg1) {
        int var3 = this.field1952[arg1];
        class216 var4 = method2380(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4015(true);
        }
        class216 var6 = null;
        int var7 = 0;
        if (this.field1945 != null && arg1 < this.field1945.length) {
            int var8 = this.field1945[arg1];
            var6 = method2380(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class220 var10 = arg0.method4015(!var4.method3980(var5));
            var10.method4057(var4, var5);
            return var10;
        } else {
            class220 var9 = arg0.method4015(!var4.method3980(var5) & !var6.method3980(var7));
            var9.method4057(var4, var5);
            var9.method4057(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dg.l(II)Lhd;")
    public static class216 method2380(int arg0) {
        class216 var1 = (class216) field1948.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class290 var2 = Statics.field1944;
        class290 var3 = Statics.field1947;
        boolean var4 = true;
        int[] var5 = var2.method4719(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4716(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4716(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class216 var10;
        if (var4) {
            try {
                var10 = new class216(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field1948.method4169(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("b.y(I)V")
    public static void method305() {
        field1953.method4168();
        field1948.method4168();
    }
}
