package deob;

@ObfuscatedName("gy")
public class class202 extends class130 {

    @ObfuscatedName("gy.d")
    public static class125 field3069 = new class125(64);

    @ObfuscatedName("gy.w")
    public static class125 field3058 = new class125(100);

    @ObfuscatedName("gy.h")
    public int[] field3064;

    @ObfuscatedName("gy.u")
    public int[] field3060;

    @ObfuscatedName("gy.k")
    public int[] field3061;

    @ObfuscatedName("gy.g")
    public int[] field3062;

    @ObfuscatedName("gy.y")
    public int field3063 = -1;

    @ObfuscatedName("gy.e")
    public int[] field3057;

    @ObfuscatedName("gy.q")
    public boolean field3056 = false;

    @ObfuscatedName("gy.v")
    public int field3066 = 5;

    @ObfuscatedName("gy.l")
    public int field3067 = -1;

    @ObfuscatedName("gy.s")
    public int field3068 = -1;

    @ObfuscatedName("gy.r")
    public int field3059 = 99;

    @ObfuscatedName("gy.m")
    public int field3070 = -1;

    @ObfuscatedName("gy.i")
    public int field3071 = -1;

    @ObfuscatedName("gy.f")
    public int field3072 = 2;

    @ObfuscatedName("ch.x(Lgk;Lgk;Lgk;I)V")
    public static void method1878(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field3065 = arg0;
        Statics.field3055 = arg1;
        Statics.field3054 = arg2;
    }

    @ObfuscatedName("fs.j(IB)Lgy;")
    public static class202 method2997(int arg0) {
        class202 var1 = (class202) field3069.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3065.method3121(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3548(new class154(var2));
        }
        var3.method3558();
        field3069.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.c(Lek;I)V")
    public void method3548(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3557(arg0, var2);
        }
    }

    @ObfuscatedName("gy.d(Lek;IB)V")
    public void method3557(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2745();
            this.field3061 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3061[var4] = arg0.method2745();
            }
            this.field3064 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3064[var5] = arg0.method2745();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3064[var6] += arg0.method2745() << 16;
            }
        } else if (arg1 == 2) {
            this.field3063 = arg0.method2745();
        } else if (arg1 == 3) {
            int var7 = arg0.method2701();
            this.field3057 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3057[var8] = arg0.method2701();
            }
            this.field3057[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3056 = true;
        } else if (arg1 == 5) {
            this.field3066 = arg0.method2701();
        } else if (arg1 == 6) {
            this.field3067 = arg0.method2745();
        } else if (arg1 == 7) {
            this.field3068 = arg0.method2745();
        } else if (arg1 == 8) {
            this.field3059 = arg0.method2701();
        } else if (arg1 == 9) {
            this.field3070 = arg0.method2701();
        } else if (arg1 == 10) {
            this.field3071 = arg0.method2701();
        } else if (arg1 == 11) {
            this.field3072 = arg0.method2701();
        } else if (arg1 == 12) {
            int var9 = arg0.method2701();
            this.field3060 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3060[var10] = arg0.method2745();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3060[var11] += arg0.method2745() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2701();
            this.field3062 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3062[var13] = arg0.method2643();
            }
        }
    }

    @ObfuscatedName("gy.w(B)V")
    public void method3558() {
        if (this.field3070 == -1) {
            if (this.field3057 == null) {
                this.field3070 = 0;
            } else {
                this.field3070 = 2;
            }
        }
        if (this.field3071 != -1) {
            return;
        }
        if (this.field3057 == null) {
            this.field3071 = 0;
        } else {
            this.field3071 = 2;
        }
    }

    @ObfuscatedName("gy.u(Lcj;II)Lcj;")
    public class83 method3550(class83 arg0, int arg1) {
        int var3 = this.field3064[arg1];
        class93 var4 = method183(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1529(true);
        } else {
            class83 var6 = arg0.method1529(!var4.method1863(var5));
            var6.method1546(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gy.y(Lcj;III)Lcj;")
    public class83 method3554(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3064[arg1];
        class93 var5 = method183(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1529(true);
        }
        class83 var7 = arg0.method1529(!var5.method1863(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1550();
        } else if (var8 == 2) {
            var7.method1539();
        } else if (var8 == 3) {
            var7.method1562();
        }
        var7.method1546(var5, var6);
        if (var8 == 1) {
            var7.method1562();
        } else if (var8 == 2) {
            var7.method1539();
        } else if (var8 == 3) {
            var7.method1550();
        }
        return var7;
    }

    @ObfuscatedName("gy.e(Lcj;II)Lcj;")
    public class83 method3552(class83 arg0, int arg1) {
        int var3 = this.field3064[arg1];
        class93 var4 = method183(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1530(true);
        } else {
            class83 var6 = arg0.method1530(!var4.method1863(var5));
            var6.method1546(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gy.q(Lcj;ILgy;IB)Lcj;")
    public class83 method3564(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3064[arg1];
        class93 var6 = method183(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3550(arg0, arg3);
        }
        int var8 = arg2.field3064[arg3];
        class93 var9 = method183(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1529(!var6.method1863(var7));
            var11.method1546(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1529(!var6.method1863(var7) & !var9.method1863(var10));
            var12.method1536(var6, var7, var9, var10, this.field3057);
            return var12;
        }
    }

    @ObfuscatedName("gy.v(Lcj;II)Lcj;")
    public class83 method3577(class83 arg0, int arg1) {
        int var3 = this.field3064[arg1];
        class93 var4 = method183(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1529(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3060 != null && arg1 < this.field3060.length) {
            int var8 = this.field3060[arg1];
            var6 = method183(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1529(!var4.method1863(var5));
            var10.method1546(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1529(!var4.method1863(var5) & !var6.method1863(var7));
            var9.method1546(var4, var5);
            var9.method1546(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("v.l(II)Lcy;")
    public static class93 method183(int arg0) {
        class93 var1 = (class93) field3058.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class93 var2 = class93.method3085(Statics.field3055, Statics.field3054, arg0, false);
        if (var2 != null) {
            field3058.method2223(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("p.s(I)V")
    public static void method232() {
        field3069.method2225();
        field3058.method2225();
    }
}
