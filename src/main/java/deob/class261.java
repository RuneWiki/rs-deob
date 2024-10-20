package deob;

@ObfuscatedName("jl")
public class class261 extends class185 {

    @ObfuscatedName("jl.v")
    public static class155 field3330 = new class155(64);

    @ObfuscatedName("jl.x")
    public char field3332;

    @ObfuscatedName("jl.w")
    public int field3333;

    @ObfuscatedName("jl.t")
    public String field3331;

    @ObfuscatedName("jl.j")
    public boolean field3334 = true;

    @ObfuscatedName("c.h(Lib;B)V")
    public static void method107(class245 arg0) {
        Statics.field3335 = arg0;
    }

    @ObfuscatedName("co.v(II)Ljl;")
    public static class261 method2148(int arg0) {
        class261 var1 = (class261) field3330.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3335.method3834(11, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4175(new class311(var2));
        }
        var3.method4158();
        field3330.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jl.x(B)V")
    public void method4158() {
    }

    @ObfuscatedName("jl.w(Lkj;I)V")
    public void method4175(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4160(arg0, var2);
        }
    }

    @ObfuscatedName("jl.t(Lkj;II)V")
    public void method4160(class311 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5148();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class299.field3689[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3332 = var6;
        } else if (arg1 == 2) {
            this.field3333 = arg0.method5120();
        } else if (arg1 == 4) {
            this.field3334 = false;
        } else if (arg1 == 5) {
            this.field3331 = arg0.method5202();
        }
    }

    @ObfuscatedName("jl.j(B)Z")
    public boolean method4163() {
        return this.field3332 == 's';
    }

    @ObfuscatedName("ic.n(I)V")
    public static void method3826() {
        field3330.method3146();
    }
}
