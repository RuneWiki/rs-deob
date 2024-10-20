package deob;

@ObfuscatedName("jl")
public class class261 extends class185 {

    @ObfuscatedName("jl.v")
    public static class155 field3333 = new class155(64);

    @ObfuscatedName("jl.d")
    public char field3332;

    @ObfuscatedName("jl.c")
    public int field3335;

    @ObfuscatedName("jl.y")
    public String field3336;

    @ObfuscatedName("jl.h")
    public boolean field3337 = true;

    @ObfuscatedName("gr.n(Lig;B)V")
    public static void method3513(class245 arg0) {
        Statics.field3338 = arg0;
    }

    @ObfuscatedName("ig.v(IB)Ljl;")
    public static class261 method4072(int arg0) {
        class261 var1 = (class261) field3333.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3338.method4032(11, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4303(new class311(var2));
        }
        var3.method4315();
        field3333.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jl.d(I)V")
    public void method4315() {
    }

    @ObfuscatedName("jl.c(Lkx;I)V")
    public void method4303(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4319(arg0, var2);
        }
    }

    @ObfuscatedName("jl.y(Lkx;II)V")
    public void method4319(class311 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5293();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class299.field3681[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3332 = var6;
        } else if (arg1 == 2) {
            this.field3335 = arg0.method5455();
        } else if (arg1 == 4) {
            this.field3337 = false;
        } else if (arg1 == 5) {
            this.field3336 = arg0.method5465();
        }
    }

    @ObfuscatedName("jl.h(S)Z")
    public boolean method4306() {
        return this.field3332 == 's';
    }
}
