package deob;

@ObfuscatedName("gb")
public class class202 extends class130 {

    @ObfuscatedName("gb.t")
    public static class125 field3076 = new class125(64);

    @ObfuscatedName("gb.k")
    public static class125 field3062 = new class125(100);

    @ObfuscatedName("gb.h")
    public int[] field3073;

    @ObfuscatedName("gb.n")
    public int[] field3064;

    @ObfuscatedName("gb.f")
    public int[] field3067;

    @ObfuscatedName("gb.a")
    public int[] field3059;

    @ObfuscatedName("gb.r")
    public int field3069 = -1;

    @ObfuscatedName("gb.x")
    public int[] field3068;

    @ObfuscatedName("gb.z")
    public boolean field3077 = false;

    @ObfuscatedName("gb.p")
    public int field3070 = 5;

    @ObfuscatedName("gb.s")
    public int field3071 = -1;

    @ObfuscatedName("gb.o")
    public int field3072 = -1;

    @ObfuscatedName("gb.y")
    public int field3061 = 99;

    @ObfuscatedName("gb.w")
    public int field3074 = -1;

    @ObfuscatedName("gb.m")
    public int field3075 = -1;

    @ObfuscatedName("gb.u")
    public int field3063 = 2;

    @ObfuscatedName("d.b(Lgj;Lgj;Lgj;I)V")
    public static void method261(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field1729 = arg0;
        Statics.field3066 = arg1;
        Statics.field3060 = arg2;
    }

    @ObfuscatedName("d.l(II)Lgb;")
    public static class202 method262(int arg0) {
        class202 var1 = (class202) field3076.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1729.method3226(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3651(new class154(var2));
        }
        var3.method3654();
        field3076.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gb.i(Leg;B)V")
    public void method3651(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3652(arg0, var2);
        }
    }

    @ObfuscatedName("gb.t(Leg;II)V")
    public void method3652(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2801();
            this.field3067 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3067[var4] = arg0.method2801();
            }
            this.field3073 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3073[var5] = arg0.method2801();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3073[var6] += arg0.method2801() << 16;
            }
        } else if (arg1 == 2) {
            this.field3069 = arg0.method2801();
        } else if (arg1 == 3) {
            int var7 = arg0.method2678();
            this.field3068 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3068[var8] = arg0.method2678();
            }
            this.field3068[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3077 = true;
        } else if (arg1 == 5) {
            this.field3070 = arg0.method2678();
        } else if (arg1 == 6) {
            this.field3071 = arg0.method2801();
        } else if (arg1 == 7) {
            this.field3072 = arg0.method2801();
        } else if (arg1 == 8) {
            this.field3061 = arg0.method2678();
        } else if (arg1 == 9) {
            this.field3074 = arg0.method2678();
        } else if (arg1 == 10) {
            this.field3075 = arg0.method2678();
        } else if (arg1 == 11) {
            this.field3063 = arg0.method2678();
        } else if (arg1 == 12) {
            int var9 = arg0.method2678();
            this.field3064 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3064[var10] = arg0.method2801();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3064[var11] += arg0.method2801() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2678();
            this.field3059 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3059[var13] = arg0.method2682();
            }
        }
    }

    @ObfuscatedName("gb.k(I)V")
    public void method3654() {
        if (this.field3074 == -1) {
            if (this.field3068 == null) {
                this.field3074 = 0;
            } else {
                this.field3074 = 2;
            }
        }
        if (this.field3075 != -1) {
            return;
        }
        if (this.field3068 == null) {
            this.field3075 = 0;
        } else {
            this.field3075 = 2;
        }
    }

    @ObfuscatedName("gb.x(Lcs;II)Lcs;")
    public class83 method3653(class83 arg0, int arg1) {
        int var3 = this.field3073[arg1];
        class93 var4 = method817(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1533(true);
        } else {
            class83 var6 = arg0.method1533(!var4.method1868(var5));
            var6.method1537(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gb.z(Lcs;III)Lcs;")
    public class83 method3655(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3073[arg1];
        class93 var5 = method817(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1533(true);
        }
        class83 var7 = arg0.method1533(!var5.method1868(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1545();
        } else if (var8 == 2) {
            var7.method1531();
        } else if (var8 == 3) {
            var7.method1578();
        }
        var7.method1537(var5, var6);
        if (var8 == 1) {
            var7.method1578();
        } else if (var8 == 2) {
            var7.method1531();
        } else if (var8 == 3) {
            var7.method1545();
        }
        return var7;
    }

    @ObfuscatedName("gb.p(Lcs;IB)Lcs;")
    public class83 method3656(class83 arg0, int arg1) {
        int var3 = this.field3073[arg1];
        class93 var4 = method817(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1595(true);
        } else {
            class83 var6 = arg0.method1595(!var4.method1868(var5));
            var6.method1537(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gb.s(Lcs;ILgb;IB)Lcs;")
    public class83 method3676(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3073[arg1];
        class93 var6 = method817(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3653(arg0, arg3);
        }
        int var8 = arg2.field3073[arg3];
        class93 var9 = method817(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1533(!var6.method1868(var7));
            var11.method1537(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1533(!var6.method1868(var7) & !var9.method1868(var10));
            var12.method1541(var6, var7, var9, var10, this.field3068);
            return var12;
        }
    }

    @ObfuscatedName("gb.o(Lcs;IB)Lcs;")
    public class83 method3658(class83 arg0, int arg1) {
        int var3 = this.field3073[arg1];
        class93 var4 = method817(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1533(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3064 != null && arg1 < this.field3064.length) {
            int var8 = this.field3064[arg1];
            var6 = method817(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1533(!var4.method1868(var5));
            var10.method1537(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1533(!var4.method1868(var5) & !var6.method1868(var7));
            var9.method1537(var4, var5);
            var9.method1537(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ar.y(II)Lcd;")
    public static class93 method817(int arg0) {
        class93 var1 = (class93) field3062.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class93 var2 = class93.method801(Statics.field3066, Statics.field3060, arg0, false);
        if (var2 != null) {
            field3062.method2258(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("gk.w(B)V")
    public static void method3252() {
        field3076.method2257();
        field3062.method2257();
    }
}
