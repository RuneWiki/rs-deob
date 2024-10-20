package deob;

@ObfuscatedName("gd")
public class class202 extends class130 {

    @ObfuscatedName("gd.k")
    public static class125 field3051 = new class125(64);

    @ObfuscatedName("gd.g")
    public static class125 field3055 = new class125(100);

    @ObfuscatedName("gd.n")
    public int[] field3053;

    @ObfuscatedName("gd.a")
    public int[] field3052;

    @ObfuscatedName("gd.q")
    public int[] field3054;

    @ObfuscatedName("gd.w")
    public int[] field3056;

    @ObfuscatedName("gd.v")
    public int field3068 = -1;

    @ObfuscatedName("gd.h")
    public int[] field3058;

    @ObfuscatedName("gd.p")
    public boolean field3059 = false;

    @ObfuscatedName("gd.l")
    public int field3057 = 5;

    @ObfuscatedName("gd.c")
    public int field3061 = -1;

    @ObfuscatedName("gd.m")
    public int field3050 = -1;

    @ObfuscatedName("gd.r")
    public int field3063 = 99;

    @ObfuscatedName("gd.u")
    public int field3064 = -1;

    @ObfuscatedName("gd.j")
    public int field3065 = -1;

    @ObfuscatedName("gd.x")
    public int field3060 = 2;

    @ObfuscatedName("client.i(Lgq;Lgq;Lgq;I)V")
    public static void method554(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field2827 = arg0;
        Statics.field3066 = arg1;
        Statics.field2042 = arg2;
    }

    @ObfuscatedName("dc.e(II)Lgd;")
    public static class202 method2010(int arg0) {
        class202 var1 = (class202) field3051.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2827.method3014(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3472(new class154(var2));
        }
        var3.method3474();
        field3051.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gd.f(Let;I)V")
    public void method3472(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3473(arg0, var2);
        }
    }

    @ObfuscatedName("gd.k(Let;IB)V")
    public void method3473(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2575();
            this.field3054 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3054[var4] = arg0.method2575();
            }
            this.field3053 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3053[var5] = arg0.method2575();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3053[var6] += arg0.method2575() << 16;
            }
        } else if (arg1 == 2) {
            this.field3068 = arg0.method2575();
        } else if (arg1 == 3) {
            int var7 = arg0.method2573();
            this.field3058 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3058[var8] = arg0.method2573();
            }
            this.field3058[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3059 = true;
        } else if (arg1 == 5) {
            this.field3057 = arg0.method2573();
        } else if (arg1 == 6) {
            this.field3061 = arg0.method2575();
        } else if (arg1 == 7) {
            this.field3050 = arg0.method2575();
        } else if (arg1 == 8) {
            this.field3063 = arg0.method2573();
        } else if (arg1 == 9) {
            this.field3064 = arg0.method2573();
        } else if (arg1 == 10) {
            this.field3065 = arg0.method2573();
        } else if (arg1 == 11) {
            this.field3060 = arg0.method2573();
        } else if (arg1 == 12) {
            int var9 = arg0.method2573();
            this.field3052 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3052[var10] = arg0.method2575();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3052[var11] += arg0.method2575() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2573();
            this.field3056 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3056[var13] = arg0.method2706();
            }
        }
    }

    @ObfuscatedName("gd.a(B)V")
    public void method3474() {
        if (this.field3064 == -1) {
            if (this.field3058 == null) {
                this.field3064 = 0;
            } else {
                this.field3064 = 2;
            }
        }
        if (this.field3065 != -1) {
            return;
        }
        if (this.field3058 == null) {
            this.field3065 = 0;
        } else {
            this.field3065 = 2;
        }
    }

    @ObfuscatedName("gd.q(Lch;II)Lch;")
    public class83 method3475(class83 arg0, int arg1) {
        int var3 = this.field3053[arg1];
        class93 var4 = method179(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1463(true);
        } else {
            class83 var6 = arg0.method1463(!var4.method1783(var5));
            var6.method1469(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gd.w(Lch;III)Lch;")
    public class83 method3503(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3053[arg1];
        class93 var5 = method179(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1463(true);
        }
        class83 var7 = arg0.method1463(!var5.method1783(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1474();
        } else if (var8 == 2) {
            var7.method1473();
        } else if (var8 == 3) {
            var7.method1472();
        }
        var7.method1469(var5, var6);
        if (var8 == 1) {
            var7.method1472();
        } else if (var8 == 2) {
            var7.method1473();
        } else if (var8 == 3) {
            var7.method1474();
        }
        return var7;
    }

    @ObfuscatedName("gd.v(Lch;II)Lch;")
    public class83 method3506(class83 arg0, int arg1) {
        int var3 = this.field3053[arg1];
        class93 var4 = method179(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1464(true);
        } else {
            class83 var6 = arg0.method1464(!var4.method1783(var5));
            var6.method1469(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gd.h(Lch;ILgd;IB)Lch;")
    public class83 method3478(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3053[arg1];
        class93 var6 = method179(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3475(arg0, arg3);
        }
        int var8 = arg2.field3053[arg3];
        class93 var9 = method179(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1463(!var6.method1783(var7));
            var11.method1469(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1463(!var6.method1783(var7) & !var9.method1783(var10));
            var12.method1470(var6, var7, var9, var10, this.field3058);
            return var12;
        }
    }

    @ObfuscatedName("gd.p(Lch;IB)Lch;")
    public class83 method3492(class83 arg0, int arg1) {
        int var3 = this.field3053[arg1];
        class93 var4 = method179(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1463(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3052 != null && arg1 < this.field3052.length) {
            int var8 = this.field3052[arg1];
            var6 = method179(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1463(!var4.method1783(var5));
            var10.method1469(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1463(!var4.method1783(var5) & !var6.method1783(var7));
            var9.method1469(var4, var5);
            var9.method1469(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("u.l(IB)Lcx;")
    public static class93 method179(int arg0) {
        class93 var1 = (class93) field3055.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field3066;
        class183 var3 = Statics.field2042;
        boolean var4 = true;
        int[] var5 = var2.method3092(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3015(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3015(var8, 0);
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
            field3055.method2152(var10, (long) arg0);
        }
        return var10;
    }
}
