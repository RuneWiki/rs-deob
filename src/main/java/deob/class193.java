package deob;

@ObfuscatedName("gv")
public class class193 extends class428 {

    @ObfuscatedName("gv.e")
    public static class269 field2117 = new class269(64);

    @ObfuscatedName("gv.v")
    public char field2116;

    @ObfuscatedName("gv.x")
    public int field2120;

    @ObfuscatedName("gv.m")
    public String field2118;

    @ObfuscatedName("gv.q")
    public boolean field2119 = true;

    @ObfuscatedName("ce.h(Lly;I)V")
    public static void method2401(class333 arg0) {
        Statics.field2121 = arg0;
    }

    @ObfuscatedName("eg.e(II)Lgv;")
    public static class193 method3003(int arg0) {
        class193 var1 = (class193) field2117.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2121.method5909(11, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3438(new class467(var2));
        }
        var3.method3446();
        field2117.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gv.v(B)V")
    public void method3446() {
    }

    @ObfuscatedName("gv.x(Lqy;B)V")
    public void method3438(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3439(arg0, var2);
        }
    }

    @ObfuscatedName("gv.m(Lqy;II)V")
    public void method3439(class467 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method7793();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class359.field4346[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2116 = var6;
        } else if (arg1 == 2) {
            this.field2120 = arg0.method7946();
        } else if (arg1 == 4) {
            this.field2119 = false;
        } else if (arg1 == 5) {
            this.field2118 = arg0.method7801();
        }
    }

    @ObfuscatedName("gv.q(I)Z")
    public boolean method3440() {
        return this.field2116 == 's';
    }
}
