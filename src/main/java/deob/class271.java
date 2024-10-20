package deob;

@ObfuscatedName("jz")
public class class271 extends class214 {

    @ObfuscatedName("jz.s")
    public static class208 field3409 = new class208(64);

    @ObfuscatedName("jz.g")
    public char field3410;

    @ObfuscatedName("jz.x")
    public int field3413;

    @ObfuscatedName("jz.h")
    public String field3408;

    @ObfuscatedName("jz.f")
    public boolean field3411 = true;

    @ObfuscatedName("jw.a(II)Ljz;")
    public static class271 method5008(int arg0) {
        class271 var1 = (class271) field3409.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3412.method4422(11, arg0);
        class271 var3 = new class271();
        if (var2 != null) {
            var3.method4746(new class190(var2));
        }
        var3.method4745();
        field3409.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.s(I)V")
    public void method4745() {
    }

    @ObfuscatedName("jz.g(Lgx;B)V")
    public void method4746(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4747(arg0, var2);
        }
    }

    @ObfuscatedName("jz.x(Lgx;II)V")
    public void method4747(class190 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3599();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class308.field3797[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3410 = var6;
        } else if (arg1 == 2) {
            this.field3413 = arg0.method3460();
        } else if (arg1 == 4) {
            this.field3411 = false;
        } else if (arg1 == 5) {
            this.field3408 = arg0.method3647();
        }
    }

    @ObfuscatedName("jz.h(I)Z")
    public boolean method4748() {
        return this.field3410 == 's';
    }

    @ObfuscatedName("ag.f(I)V")
    public static void method365() {
        field3409.method3879();
    }
}
