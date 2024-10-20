package deob;

@ObfuscatedName("gl")
public class class202 extends class130 {

    @ObfuscatedName("gl.h")
    public static class125 field3059 = new class125(64);

    @ObfuscatedName("gl.r")
    public static class125 field3072 = new class125(100);

    @ObfuscatedName("gl.o")
    public int[] field3061;

    @ObfuscatedName("gl.l")
    public int[] field3060;

    @ObfuscatedName("gl.n")
    public int[] field3066;

    @ObfuscatedName("gl.m")
    public int[] field3064;

    @ObfuscatedName("gl.w")
    public int field3065 = -1;

    @ObfuscatedName("gl.j")
    public int[] field3077;

    @ObfuscatedName("gl.s")
    public boolean field3067 = false;

    @ObfuscatedName("gl.q")
    public int field3068 = 5;

    @ObfuscatedName("gl.d")
    public int field3069 = -1;

    @ObfuscatedName("gl.p")
    public int field3070 = -1;

    @ObfuscatedName("gl.y")
    public int field3071 = 99;

    @ObfuscatedName("gl.a")
    public int field3057 = -1;

    @ObfuscatedName("gl.v")
    public int field3073 = -1;

    @ObfuscatedName("gl.z")
    public int field3074 = 2;

    @ObfuscatedName("dk.f(Lgb;Lgb;Lgb;B)V")
    public static void method1965(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field3062 = arg0;
        Statics.field3079 = arg1;
        Statics.field56 = arg2;
    }

    @ObfuscatedName("p.i(II)Lgl;")
    public static class202 method164(int arg0) {
        class202 var1 = (class202) field3059.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3062.method3163(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3562(new class154(var2));
        }
        var3.method3564();
        field3059.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gl.u(Leo;B)V")
    public void method3562(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3563(arg0, var2);
        }
    }

    @ObfuscatedName("gl.r(Leo;II)V")
    public void method3563(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2668();
            this.field3066 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3066[var4] = arg0.method2668();
            }
            this.field3061 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3061[var5] = arg0.method2668();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3061[var6] += arg0.method2668() << 16;
            }
        } else if (arg1 == 2) {
            this.field3065 = arg0.method2668();
        } else if (arg1 == 3) {
            int var7 = arg0.method2666();
            this.field3077 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3077[var8] = arg0.method2666();
            }
            this.field3077[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3067 = true;
        } else if (arg1 == 5) {
            this.field3068 = arg0.method2666();
        } else if (arg1 == 6) {
            this.field3069 = arg0.method2668();
        } else if (arg1 == 7) {
            this.field3070 = arg0.method2668();
        } else if (arg1 == 8) {
            this.field3071 = arg0.method2666();
        } else if (arg1 == 9) {
            this.field3057 = arg0.method2666();
        } else if (arg1 == 10) {
            this.field3073 = arg0.method2666();
        } else if (arg1 == 11) {
            this.field3074 = arg0.method2666();
        } else if (arg1 == 12) {
            int var9 = arg0.method2666();
            this.field3060 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3060[var10] = arg0.method2668();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3060[var11] += arg0.method2668() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2666();
            this.field3064 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3064[var13] = arg0.method2670();
            }
        }
    }

    @ObfuscatedName("gl.o(I)V")
    public void method3564() {
        if (this.field3057 == -1) {
            if (this.field3077 == null) {
                this.field3057 = 0;
            } else {
                this.field3057 = 2;
            }
        }
        if (this.field3073 != -1) {
            return;
        }
        if (this.field3077 == null) {
            this.field3073 = 0;
        } else {
            this.field3073 = 2;
        }
    }

    @ObfuscatedName("gl.l(Lce;II)Lce;")
    public class83 method3565(class83 arg0, int arg1) {
        int var3 = this.field3061[arg1];
        class93 var4 = method1482(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1497(true);
        } else {
            class83 var6 = arg0.method1497(!var4.method1840(var5));
            var6.method1501(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gl.n(Lce;III)Lce;")
    public class83 method3570(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3061[arg1];
        class93 var5 = method1482(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1497(true);
        }
        class83 var7 = arg0.method1497(!var5.method1840(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1508();
        } else if (var8 == 2) {
            var7.method1507();
        } else if (var8 == 3) {
            var7.method1569();
        }
        var7.method1501(var5, var6);
        if (var8 == 1) {
            var7.method1569();
        } else if (var8 == 2) {
            var7.method1507();
        } else if (var8 == 3) {
            var7.method1508();
        }
        return var7;
    }

    @ObfuscatedName("gl.m(Lce;IB)Lce;")
    public class83 method3567(class83 arg0, int arg1) {
        int var3 = this.field3061[arg1];
        class93 var4 = method1482(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1498(true);
        } else {
            class83 var6 = arg0.method1498(!var4.method1840(var5));
            var6.method1501(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gl.w(Lce;ILgl;II)Lce;")
    public class83 method3568(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3061[arg1];
        class93 var6 = method1482(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3565(arg0, arg3);
        }
        int var8 = arg2.field3061[arg3];
        class93 var9 = method1482(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1497(!var6.method1840(var7));
            var11.method1501(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1497(!var6.method1840(var7) & !var9.method1840(var10));
            var12.method1559(var6, var7, var9, var10, this.field3077);
            return var12;
        }
    }

    @ObfuscatedName("gl.j(Lce;IB)Lce;")
    public class83 method3581(class83 arg0, int arg1) {
        int var3 = this.field3061[arg1];
        class93 var4 = method1482(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1497(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3060 != null && arg1 < this.field3060.length) {
            int var8 = this.field3060[arg1];
            var6 = method1482(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1497(!var4.method1840(var5));
            var10.method1501(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1497(!var4.method1840(var5) & !var6.method1840(var7));
            var9.method1501(var4, var5);
            var9.method1501(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("cl.s(II)Lcc;")
    public static class93 method1482(int arg0) {
        class93 var1 = (class93) field3072.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field3079;
        class183 var3 = Statics.field56;
        boolean var4 = true;
        int[] var5 = var2.method3126(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3152(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3152(var8, 0);
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
            field3072.method2246(var10, (long) arg0);
        }
        return var10;
    }
}
