package deob;

@ObfuscatedName("jl")
public class class263 extends class206 {

    @ObfuscatedName("jl.g")
    public static class201 field3467 = new class201(64);

    @ObfuscatedName("jl.m")
    public char field3468;

    @ObfuscatedName("jl.h")
    public int field3466;

    @ObfuscatedName("jl.i")
    public String field3470;

    @ObfuscatedName("jl.w")
    public boolean field3471 = true;

    @ObfuscatedName("gd.s(II)Ljl;")
    public static class263 method3491(int arg0) {
        class263 var1 = (class263) field3467.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3469.method4231(11, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4502(new class185(var2));
        }
        var3.method4516();
        field3467.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jl.g(B)V")
    public void method4516() {
    }

    @ObfuscatedName("jl.m(Lgy;I)V")
    public void method4502(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4501(arg0, var2);
        }
    }

    @ObfuscatedName("jl.h(Lgy;IB)V")
    public void method4501(class185 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3240();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class290.field3786[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3468 = var6;
        } else if (arg1 == 2) {
            this.field3466 = arg0.method3292();
        } else if (arg1 == 4) {
            this.field3471 = false;
        } else if (arg1 == 5) {
            this.field3470 = arg0.method3248();
        }
    }

    @ObfuscatedName("jl.i(I)Z")
    public boolean method4504() {
        return this.field3468 == 's';
    }
}
