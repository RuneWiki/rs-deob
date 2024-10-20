package deob;

@ObfuscatedName("gy")
public class class197 extends class435 {

    @ObfuscatedName("gy.w")
    public static class273 field2119 = new class273(64);

    @ObfuscatedName("gy.v")
    public char field2120;

    @ObfuscatedName("gy.s")
    public int field2121;

    @ObfuscatedName("gy.z")
    public String field2122;

    @ObfuscatedName("gy.j")
    public boolean field2123 = true;

    @ObfuscatedName("eu.f(IB)Lgy;")
    public static class197 method2995(int arg0) {
        class197 var1 = (class197) field2119.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2124.method5990(11, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3523(new class474(var2));
        }
        var3.method3522();
        field2119.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.w(I)V")
    public void method3522() {
    }

    @ObfuscatedName("gy.v(Lrd;I)V")
    public void method3523(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3535(arg0, var2);
        }
    }

    @ObfuscatedName("gy.s(Lrd;IB)V")
    public void method3535(class474 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method7965();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class363.field4361[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2120 = var6;
        } else if (arg1 == 2) {
            this.field2121 = arg0.method7979();
        } else if (arg1 == 4) {
            this.field2123 = false;
        } else if (arg1 == 5) {
            this.field2122 = arg0.method7983();
        }
    }

    @ObfuscatedName("gy.z(B)Z")
    public boolean method3525() {
        return this.field2120 == 's';
    }
}
