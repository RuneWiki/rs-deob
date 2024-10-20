package deob;

@ObfuscatedName("gn")
public class class202 extends class130 {

    @ObfuscatedName("gn.l")
    public static class125 field3063 = new class125(64);

    @ObfuscatedName("gn.y")
    public static class125 field3064 = new class125(100);

    @ObfuscatedName("gn.j")
    public int[] field3062;

    @ObfuscatedName("gn.g")
    public int[] field3066;

    @ObfuscatedName("gn.s")
    public int[] field3067;

    @ObfuscatedName("gn.r")
    public int[] field3068;

    @ObfuscatedName("gn.t")
    public int field3065 = -1;

    @ObfuscatedName("gn.k")
    public int[] field3070;

    @ObfuscatedName("gn.f")
    public boolean field3078 = false;

    @ObfuscatedName("gn.a")
    public int field3072 = 5;

    @ObfuscatedName("gn.v")
    public int field3073 = -1;

    @ObfuscatedName("gn.d")
    public int field3074 = -1;

    @ObfuscatedName("gn.o")
    public int field3060 = 99;

    @ObfuscatedName("gn.q")
    public int field3076 = -1;

    @ObfuscatedName("gn.i")
    public int field3075 = -1;

    @ObfuscatedName("gn.x")
    public int field3069 = 2;

    @ObfuscatedName("e.b(II)Lgn;")
    public static class202 method17(int arg0) {
        class202 var1 = (class202) field3063.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3071.method3126(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3578(new class154(var2));
        }
        var3.method3580();
        field3063.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gn.e(Lec;I)V")
    public void method3578(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3585(arg0, var2);
        }
    }

    @ObfuscatedName("gn.c(Lec;II)V")
    public void method3585(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2671();
            this.field3067 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3067[var4] = arg0.method2671();
            }
            this.field3062 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3062[var5] = arg0.method2671();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3062[var6] += arg0.method2671() << 16;
            }
        } else if (arg1 == 2) {
            this.field3065 = arg0.method2671();
        } else if (arg1 == 3) {
            int var7 = arg0.method2669();
            this.field3070 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3070[var8] = arg0.method2669();
            }
            this.field3070[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3078 = true;
        } else if (arg1 == 5) {
            this.field3072 = arg0.method2669();
        } else if (arg1 == 6) {
            this.field3073 = arg0.method2671();
        } else if (arg1 == 7) {
            this.field3074 = arg0.method2671();
        } else if (arg1 == 8) {
            this.field3060 = arg0.method2669();
        } else if (arg1 == 9) {
            this.field3076 = arg0.method2669();
        } else if (arg1 == 10) {
            this.field3075 = arg0.method2669();
        } else if (arg1 == 11) {
            this.field3069 = arg0.method2669();
        } else if (arg1 == 12) {
            int var9 = arg0.method2669();
            this.field3066 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3066[var10] = arg0.method2671();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3066[var11] += arg0.method2671() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2669();
            this.field3068 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3068[var13] = arg0.method2689();
            }
        }
    }

    @ObfuscatedName("gn.l(I)V")
    public void method3580() {
        if (this.field3076 == -1) {
            if (this.field3070 == null) {
                this.field3076 = 0;
            } else {
                this.field3076 = 2;
            }
        }
        if (this.field3075 != -1) {
            return;
        }
        if (this.field3070 == null) {
            this.field3075 = 0;
        } else {
            this.field3075 = 2;
        }
    }

    @ObfuscatedName("gn.y(Lco;IB)Lco;")
    public class83 method3582(class83 arg0, int arg1) {
        int var3 = this.field3062[arg1];
        class93 var4 = method3537(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1502(true);
        } else {
            class83 var6 = arg0.method1502(!var4.method1855(var5));
            var6.method1508(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gn.j(Lco;IIB)Lco;")
    public class83 method3581(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3062[arg1];
        class93 var5 = method3537(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1502(true);
        }
        class83 var7 = arg0.method1502(!var5.method1855(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1512();
        } else if (var8 == 2) {
            var7.method1537();
        } else if (var8 == 3) {
            var7.method1511();
        }
        var7.method1508(var5, var6);
        if (var8 == 1) {
            var7.method1511();
        } else if (var8 == 2) {
            var7.method1537();
        } else if (var8 == 3) {
            var7.method1512();
        }
        return var7;
    }

    @ObfuscatedName("gn.t(Lco;II)Lco;")
    public class83 method3599(class83 arg0, int arg1) {
        int var3 = this.field3062[arg1];
        class93 var4 = method3537(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1503(true);
        } else {
            class83 var6 = arg0.method1503(!var4.method1855(var5));
            var6.method1508(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gn.k(Lco;ILgn;IB)Lco;")
    public class83 method3583(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3062[arg1];
        class93 var6 = method3537(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3582(arg0, arg3);
        }
        int var8 = arg2.field3062[arg3];
        class93 var9 = method3537(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1502(!var6.method1855(var7));
            var11.method1508(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1502(!var6.method1855(var7) & !var9.method1855(var10));
            var12.method1509(var6, var7, var9, var10, this.field3070);
            return var12;
        }
    }

    @ObfuscatedName("gn.f(Lco;IB)Lco;")
    public class83 method3594(class83 arg0, int arg1) {
        int var3 = this.field3062[arg1];
        class93 var4 = method3537(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1502(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3066 != null && arg1 < this.field3066.length) {
            int var8 = this.field3066[arg1];
            var6 = method3537(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1502(!var4.method1855(var5));
            var10.method1508(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1502(!var4.method1855(var5) & !var6.method1855(var7));
            var9.method1508(var4, var5);
            var9.method1508(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gt.a(II)Lcm;")
    public static class93 method3537(int arg0) {
        class93 var1 = (class93) field3064.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field3061;
        class183 var3 = Statics.field3077;
        boolean var4 = true;
        int[] var5 = var2.method3135(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3132(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3132(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class93 var10;
        if (var4) {
            try {
                var10 = new class93(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3064.method2250(var10, (long) arg0);
        }
        return var10;
    }
}
