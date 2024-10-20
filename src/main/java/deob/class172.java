package deob;

@ObfuscatedName("fe")
public class class172 extends class365 {

    @ObfuscatedName("fe.j")
    public static class236 field1965 = new class236(64);

    @ObfuscatedName("fe.m")
    public static class236 field1948 = new class236(100);

    @ObfuscatedName("fe.k")
    public int[] field1959;

    @ObfuscatedName("fe.t")
    public int[] field1950;

    @ObfuscatedName("fe.a")
    public int[] field1951;

    @ObfuscatedName("fe.e")
    public int[] field1952;

    @ObfuscatedName("fe.i")
    public int field1949 = -1;

    @ObfuscatedName("fe.y")
    public int[] field1954;

    @ObfuscatedName("fe.w")
    public boolean field1946 = false;

    @ObfuscatedName("fe.g")
    public int field1956 = 5;

    @ObfuscatedName("fe.v")
    public int field1957 = -1;

    @ObfuscatedName("fe.s")
    public int field1958 = -1;

    @ObfuscatedName("fe.c")
    public int field1953 = 99;

    @ObfuscatedName("fe.b")
    public int field1960 = -1;

    @ObfuscatedName("fe.x")
    public int field1961 = -1;

    @ObfuscatedName("fe.p")
    public int field1962 = 2;

    @ObfuscatedName("em.l(II)Lfe;")
    public static class172 method2708(int arg0) {
        class172 var1 = (class172) field1965.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4278.method4756(12, arg0);
        class172 var3 = new class172();
        if (var2 != null) {
            var3.method3091(new class401(var2));
        }
        var3.method3092();
        field1965.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fe.q(Lot;I)V")
    public void method3091(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method3124(arg0, var2);
        }
    }

    @ObfuscatedName("fe.f(Lot;II)V")
    public void method3124(class401 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6284();
            this.field1951 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1951[var4] = arg0.method6284();
            }
            this.field1959 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1959[var5] = arg0.method6284();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1959[var6] += arg0.method6284() << 16;
            }
        } else if (arg1 == 2) {
            this.field1949 = arg0.method6284();
        } else if (arg1 == 3) {
            int var7 = arg0.method6272();
            this.field1954 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1954[var8] = arg0.method6272();
            }
            this.field1954[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1946 = true;
        } else if (arg1 == 5) {
            this.field1956 = arg0.method6272();
        } else if (arg1 == 6) {
            this.field1957 = arg0.method6284();
        } else if (arg1 == 7) {
            this.field1958 = arg0.method6284();
        } else if (arg1 == 8) {
            this.field1953 = arg0.method6272();
        } else if (arg1 == 9) {
            this.field1960 = arg0.method6272();
        } else if (arg1 == 10) {
            this.field1961 = arg0.method6272();
        } else if (arg1 == 11) {
            this.field1962 = arg0.method6272();
        } else if (arg1 == 12) {
            int var9 = arg0.method6272();
            this.field1950 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1950[var10] = arg0.method6284();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1950[var11] += arg0.method6284() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method6272();
            this.field1952 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1952[var13] = arg0.method6276();
            }
        }
    }

    @ObfuscatedName("fe.j(I)V")
    public void method3092() {
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

    @ObfuscatedName("fe.m(Lhl;IS)Lhl;")
    public class220 method3093(class220 arg0, int arg1) {
        int var3 = this.field1959[arg1];
        class216 var4 = method2618(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4062(true);
        } else {
            class220 var6 = arg0.method4062(!var4.method4022(var5));
            var6.method4070(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fe.k(Lhl;IIB)Lhl;")
    public class220 method3107(class220 arg0, int arg1, int arg2) {
        int var4 = this.field1959[arg1];
        class216 var5 = method2618(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4062(true);
        }
        class220 var7 = arg0.method4062(!var5.method4022(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4136();
        } else if (var8 == 2) {
            var7.method4075();
        } else if (var8 == 3) {
            var7.method4098();
        }
        var7.method4070(var5, var6);
        if (var8 == 1) {
            var7.method4098();
        } else if (var8 == 2) {
            var7.method4075();
        } else if (var8 == 3) {
            var7.method4136();
        }
        return var7;
    }

    @ObfuscatedName("fe.t(Lhl;IB)Lhl;")
    public class220 method3095(class220 arg0, int arg1) {
        int var3 = this.field1959[arg1];
        class216 var4 = method2618(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4071(true);
        } else {
            class220 var6 = arg0.method4071(!var4.method4022(var5));
            var6.method4070(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fe.a(Lhl;ILfe;IS)Lhl;")
    public class220 method3096(class220 arg0, int arg1, class172 arg2, int arg3) {
        int var5 = this.field1959[arg1];
        class216 var6 = method2618(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3093(arg0, arg3);
        }
        int var8 = arg2.field1959[arg3];
        class216 var9 = method2618(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class220 var11 = arg0.method4062(!var6.method4022(var7));
            var11.method4070(var6, var7);
            return var11;
        } else {
            class220 var12 = arg0.method4062(!var6.method4022(var7) & !var9.method4022(var10));
            var12.method4073(var6, var7, var9, var10, this.field1954);
            return var12;
        }
    }

    @ObfuscatedName("fe.e(Lhl;IB)Lhl;")
    public class220 method3097(class220 arg0, int arg1) {
        int var3 = this.field1959[arg1];
        class216 var4 = method2618(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4062(true);
        }
        class216 var6 = null;
        int var7 = 0;
        if (this.field1950 != null && arg1 < this.field1950.length) {
            int var8 = this.field1950[arg1];
            var6 = method2618(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class220 var10 = arg0.method4062(!var4.method4022(var5));
            var10.method4070(var4, var5);
            return var10;
        } else {
            class220 var9 = arg0.method4062(!var4.method4022(var5) & !var6.method4022(var7));
            var9.method4070(var4, var5);
            var9.method4070(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("eh.i(II)Lht;")
    public static class216 method2618(int arg0) {
        class216 var1 = (class216) field1948.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class216 var2 = class216.method2403(Statics.field78, Statics.field1947, arg0, false);
        if (var2 != null) {
            field1948.method4225(var2, (long) arg0);
        }
        return var2;
    }
}
