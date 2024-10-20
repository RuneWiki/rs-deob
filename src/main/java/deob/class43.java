package deob;

@ObfuscatedName("az")
public class class43 extends class204 {

    @ObfuscatedName("az.n")
    public static class193 field992 = new class193(64);

    @ObfuscatedName("az.f")
    public static class193 field993 = new class193(100);

    @ObfuscatedName("az.g")
    public int[] field994;

    @ObfuscatedName("az.o")
    public int[] field995;

    @ObfuscatedName("az.s")
    public int[] field996;

    @ObfuscatedName("az.k")
    public int[] field997;

    @ObfuscatedName("az.b")
    public int field998 = -1;

    @ObfuscatedName("az.c")
    public int[] field1011;

    @ObfuscatedName("az.l")
    public boolean field1000 = false;

    @ObfuscatedName("az.p")
    public int field991 = 5;

    @ObfuscatedName("az.d")
    public int field989 = -1;

    @ObfuscatedName("az.i")
    public int field1002 = -1;

    @ObfuscatedName("az.x")
    public int field1004 = 99;

    @ObfuscatedName("az.j")
    public int field1005 = -1;

    @ObfuscatedName("az.w")
    public int field1006 = -1;

    @ObfuscatedName("az.r")
    public int field1007 = 2;

    @ObfuscatedName("an.h(IB)Laz;")
    public static class43 method733(int arg0) {
        class43 var1 = (class43) field992.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1010.method3073(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method834(new class119(var2));
        }
        var3.method869();
        field992.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.q(Ldm;S)V")
    public void method834(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method835(arg0, var2);
        }
    }

    @ObfuscatedName("az.v(Ldm;IB)V")
    public void method835(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2385();
            this.field996 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field996[var4] = arg0.method2385();
            }
            this.field994 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field994[var5] = arg0.method2385();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field994[var6] += arg0.method2385() << 16;
            }
        } else if (arg1 == 2) {
            this.field998 = arg0.method2385();
        } else if (arg1 == 3) {
            int var7 = arg0.method2383();
            this.field1011 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1011[var8] = arg0.method2383();
            }
            this.field1011[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1000 = true;
        } else if (arg1 == 5) {
            this.field991 = arg0.method2383();
        } else if (arg1 == 6) {
            this.field989 = arg0.method2385();
        } else if (arg1 == 7) {
            this.field1002 = arg0.method2385();
        } else if (arg1 == 8) {
            this.field1004 = arg0.method2383();
        } else if (arg1 == 9) {
            this.field1005 = arg0.method2383();
        } else if (arg1 == 10) {
            this.field1006 = arg0.method2383();
        } else if (arg1 == 11) {
            this.field1007 = arg0.method2383();
        } else if (arg1 == 12) {
            int var9 = arg0.method2383();
            this.field995 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field995[var10] = arg0.method2385();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field995[var11] += arg0.method2385() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2383();
            this.field997 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field997[var13] = arg0.method2387();
            }
        }
    }

    @ObfuscatedName("az.n(I)V")
    public void method869() {
        if (this.field1005 == -1) {
            if (this.field1011 == null) {
                this.field1005 = 0;
            } else {
                this.field1005 = 2;
            }
        }
        if (this.field1006 != -1) {
            return;
        }
        if (this.field1011 == null) {
            this.field1006 = 0;
        } else {
            this.field1006 = 2;
        }
    }

    @ObfuscatedName("az.f(Ldg;II)Ldg;")
    public class105 method837(class105 arg0, int arg1) {
        int var3 = this.field994[arg1];
        class103 var4 = method619(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2216(true);
        } else {
            class105 var6 = arg0.method2216(!var4.method2166(var5));
            var6.method2180(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.g(Ldg;IIB)Ldg;")
    public class105 method838(class105 arg0, int arg1, int arg2) {
        int var4 = this.field994[arg1];
        class103 var5 = method619(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2216(true);
        }
        class105 var7 = arg0.method2216(!var5.method2166(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2184();
        } else if (var8 == 2) {
            var7.method2209();
        } else if (var8 == 3) {
            var7.method2182();
        }
        var7.method2180(var5, var6);
        if (var8 == 1) {
            var7.method2182();
        } else if (var8 == 2) {
            var7.method2209();
        } else if (var8 == 3) {
            var7.method2184();
        }
        return var7;
    }

    @ObfuscatedName("az.o(Ldg;II)Ldg;")
    public class105 method839(class105 arg0, int arg1) {
        int var3 = this.field994[arg1];
        class103 var4 = method619(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2175(true);
        } else {
            class105 var6 = arg0.method2175(!var4.method2166(var5));
            var6.method2180(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.s(Ldg;ILaz;II)Ldg;")
    public class105 method840(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field994[arg1];
        class103 var6 = method619(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method837(arg0, arg3);
        }
        int var8 = arg2.field994[arg3];
        class103 var9 = method619(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2216(!var6.method2166(var7));
            var11.method2180(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2216(!var6.method2166(var7) & !var9.method2166(var10));
            var12.method2197(var6, var7, var9, var10, this.field1011);
            return var12;
        }
    }

    @ObfuscatedName("az.k(Ldg;II)Ldg;")
    public class105 method841(class105 arg0, int arg1) {
        int var3 = this.field994[arg1];
        class103 var4 = method619(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2216(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field995 != null && arg1 < this.field995.length) {
            int var8 = this.field995[arg1];
            var6 = method619(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2216(!var4.method2166(var5));
            var10.method2180(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2216(!var4.method2166(var5) & !var6.method2166(var7));
            var9.method2180(var4, var5);
            var9.method2180(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("a.b(IB)Lcc;")
    public static class103 method619(int arg0) {
        class103 var1 = (class103) field993.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class103 var2 = class103.method2685(Statics.field1001, Statics.field999, arg0, false);
        if (var2 != null) {
            field993.method3540(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("at.c(I)V")
    public static void method622() {
        field992.method3541();
        field993.method3541();
    }
}
