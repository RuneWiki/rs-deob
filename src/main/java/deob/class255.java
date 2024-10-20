package deob;

@ObfuscatedName("if")
public class class255 extends class198 {

    @ObfuscatedName("if.o")
    public static class193 field3399 = new class193(64);

    @ObfuscatedName("if.x")
    public char field3405;

    @ObfuscatedName("if.k")
    public int field3401;

    @ObfuscatedName("if.f")
    public String field3402;

    @ObfuscatedName("if.i")
    public boolean field3400 = true;

    @ObfuscatedName("ap.w(Liq;I)V")
    public static void method190(class239 arg0) {
        Statics.field3403 = arg0;
    }

    @ObfuscatedName("if.x(B)V")
    public void method4055() {
    }

    @ObfuscatedName("if.k(Lfi;B)V")
    public void method4056(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method4043(arg0, var2);
        }
    }

    @ObfuscatedName("if.f(Lfi;II)V")
    public void method4043(class177 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method2885();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class270.field3676[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3405 = var6;
        } else if (arg1 == 2) {
            this.field3401 = arg0.method2904();
        } else if (arg1 == 4) {
            this.field3400 = false;
        } else if (arg1 == 5) {
            this.field3402 = arg0.method2892();
        }
    }

    @ObfuscatedName("if.i(B)Z")
    public boolean method4047() {
        return this.field3405 == 's';
    }

    @ObfuscatedName("at.j(B)V")
    public static void method539() {
        field3399.method3242();
    }
}
