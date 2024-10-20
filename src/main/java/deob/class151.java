package deob;

@ObfuscatedName("eh")
public class class151 extends class347 {

    @ObfuscatedName("eh.n")
    public static class221 field1711 = new class221(64);

    @ObfuscatedName("eh.f")
    public char field1712;

    @ObfuscatedName("eh.y")
    public int field1713;

    @ObfuscatedName("eh.p")
    public String field1710;

    @ObfuscatedName("eh.j")
    public boolean field1719 = true;

    @ObfuscatedName("dc.v(II)Leh;")
    public static class151 method2140(int arg0) {
        class151 var1 = (class151) field1711.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1715.method4468(11, arg0);
        class151 var3 = new class151();
        if (var2 != null) {
            var3.method2621(new class383(var2));
        }
        var3.method2619();
        field1711.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eh.n(I)V")
    public void method2619() {
    }

    @ObfuscatedName("eh.f(Lnd;S)V")
    public void method2621(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2622(arg0, var2);
        }
    }

    @ObfuscatedName("eh.y(Lnd;IB)V")
    public void method2622(class383 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5966();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class302.field3741[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field1712 = var6;
        } else if (arg1 == 2) {
            this.field1713 = arg0.method5970();
        } else if (arg1 == 4) {
            this.field1719 = false;
        } else if (arg1 == 5) {
            this.field1710 = arg0.method5974();
        }
    }

    @ObfuscatedName("eh.p(S)Z")
    public boolean method2623() {
        return this.field1712 == 's';
    }

    @ObfuscatedName("ec.j(I)V")
    public static void method2325() {
        field1711.method3957();
    }
}
