package deob;

@ObfuscatedName("fm")
public class class172 extends class365 {

    @ObfuscatedName("fm.a")
    public static class236 field1951 = new class236(64);

    @ObfuscatedName("fm.o")
    public static class236 field1949 = new class236(100);

    @ObfuscatedName("fm.g")
    public int[] field1953;

    @ObfuscatedName("fm.e")
    public int[] field1948;

    @ObfuscatedName("fm.p")
    public int[] field1955;

    @ObfuscatedName("fm.j")
    public int[] field1956;

    @ObfuscatedName("fm.b")
    public int field1961 = -1;

    @ObfuscatedName("fm.x")
    public int[] field1958;

    @ObfuscatedName("fm.y")
    public boolean field1959 = false;

    @ObfuscatedName("fm.k")
    public int field1960 = 5;

    @ObfuscatedName("fm.t")
    public int field1965 = -1;

    @ObfuscatedName("fm.l")
    public int field1962 = -1;

    @ObfuscatedName("fm.u")
    public int field1963 = 99;

    @ObfuscatedName("fm.n")
    public int field1964 = -1;

    @ObfuscatedName("fm.z")
    public int field1957 = -1;

    @ObfuscatedName("fm.q")
    public int field1966 = 2;

    @ObfuscatedName("ah.i(IB)Lfm;")
    public static class172 method589(int arg0) {
        class172 var1 = (class172) field1951.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1967.method4743(12, arg0);
        class172 var3 = new class172();
        if (var2 != null) {
            var3.method3112(new class401(var2));
        }
        var3.method3114();
        field1951.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fm.w(Lop;S)V")
    public void method3112(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method3113(arg0, var2);
        }
    }

    @ObfuscatedName("fm.s(Lop;II)V")
    public void method3113(class401 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6242();
            this.field1955 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1955[var4] = arg0.method6242();
            }
            this.field1953 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1953[var5] = arg0.method6242();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1953[var6] += arg0.method6242() << 16;
            }
        } else if (arg1 == 2) {
            this.field1961 = arg0.method6242();
        } else if (arg1 == 3) {
            int var7 = arg0.method6240();
            this.field1958 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1958[var8] = arg0.method6240();
            }
            this.field1958[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1959 = true;
        } else if (arg1 == 5) {
            this.field1960 = arg0.method6240();
        } else if (arg1 == 6) {
            this.field1965 = arg0.method6242();
        } else if (arg1 == 7) {
            this.field1962 = arg0.method6242();
        } else if (arg1 == 8) {
            this.field1963 = arg0.method6240();
        } else if (arg1 == 9) {
            this.field1964 = arg0.method6240();
        } else if (arg1 == 10) {
            this.field1957 = arg0.method6240();
        } else if (arg1 == 11) {
            this.field1966 = arg0.method6240();
        } else if (arg1 == 12) {
            int var9 = arg0.method6240();
            this.field1948 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1948[var10] = arg0.method6242();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1948[var11] += arg0.method6242() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method6240();
            this.field1956 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1956[var13] = arg0.method6432();
            }
        }
    }

    @ObfuscatedName("fm.a(I)V")
    public void method3114() {
        if (this.field1964 == -1) {
            if (this.field1958 == null) {
                this.field1964 = 0;
            } else {
                this.field1964 = 2;
            }
        }
        if (this.field1957 != -1) {
            return;
        }
        if (this.field1958 == null) {
            this.field1957 = 0;
        } else {
            this.field1957 = 2;
        }
    }

    @ObfuscatedName("fm.o(Lhl;IS)Lhl;")
    public class220 method3115(class220 arg0, int arg1) {
        int var3 = this.field1953[arg1];
        class216 var4 = method1893(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4065(true);
        } else {
            class220 var6 = arg0.method4065(!var4.method4021(var5));
            var6.method4073(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fm.g(Lhl;IIB)Lhl;")
    public class220 method3128(class220 arg0, int arg1, int arg2) {
        int var4 = this.field1953[arg1];
        class216 var5 = method1893(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4065(true);
        }
        class220 var7 = arg0.method4065(!var5.method4021(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4128();
        } else if (var8 == 2) {
            var7.method4064();
        } else if (var8 == 3) {
            var7.method4076();
        }
        var7.method4073(var5, var6);
        if (var8 == 1) {
            var7.method4076();
        } else if (var8 == 2) {
            var7.method4064();
        } else if (var8 == 3) {
            var7.method4128();
        }
        return var7;
    }

    @ObfuscatedName("fm.e(Lhl;IB)Lhl;")
    public class220 method3116(class220 arg0, int arg1) {
        int var3 = this.field1953[arg1];
        class216 var4 = method1893(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4066(true);
        } else {
            class220 var6 = arg0.method4066(!var4.method4021(var5));
            var6.method4073(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fm.p(Lhl;ILfm;II)Lhl;")
    public class220 method3118(class220 arg0, int arg1, class172 arg2, int arg3) {
        int var5 = this.field1953[arg1];
        class216 var6 = method1893(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3115(arg0, arg3);
        }
        int var8 = arg2.field1953[arg3];
        class216 var9 = method1893(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class220 var11 = arg0.method4065(!var6.method4021(var7));
            var11.method4073(var6, var7);
            return var11;
        } else {
            class220 var12 = arg0.method4065(!var6.method4021(var7) & !var9.method4021(var10));
            var12.method4117(var6, var7, var9, var10, this.field1958);
            return var12;
        }
    }

    @ObfuscatedName("fm.j(Lhl;II)Lhl;")
    public class220 method3142(class220 arg0, int arg1) {
        int var3 = this.field1953[arg1];
        class216 var4 = method1893(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4065(true);
        }
        class216 var6 = null;
        int var7 = 0;
        if (this.field1948 != null && arg1 < this.field1948.length) {
            int var8 = this.field1948[arg1];
            var6 = method1893(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class220 var10 = arg0.method4065(!var4.method4021(var5));
            var10.method4073(var4, var5);
            return var10;
        } else {
            class220 var9 = arg0.method4065(!var4.method4021(var5) & !var6.method4021(var7));
            var9.method4073(var4, var5);
            var9.method4073(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bn.b(II)Lho;")
    public static class216 method1893(int arg0) {
        class216 var1 = (class216) field1949.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class290 var2 = Statics.field1952;
        class290 var3 = Statics.field1950;
        boolean var4 = true;
        int[] var5 = var2.method4752(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4750(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4750(var8, 0);
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
            field1949.method4206(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("ca.x(I)V")
    public static void method1972() {
        field1951.method4207();
        field1949.method4207();
    }
}
