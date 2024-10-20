package deob;

@ObfuscatedName("gd")
public class class194 extends class428 {

    @ObfuscatedName("gd.e")
    public static class269 field2124 = new class269(64);

    @ObfuscatedName("gd.v")
    public class443 field2125;

    @ObfuscatedName("df.h(II)Lgd;")
    public static class194 method2704(int arg0) {
        class194 var1 = (class194) field2124.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2127.method5909(34, arg0);
        class194 var3 = new class194();
        if (var2 != null) {
            var3.method3472(new class467(var2));
        }
        var3.method3470();
        field2124.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gd.e(I)V")
    public void method3470() {
    }

    @ObfuscatedName("gd.v(Lqy;S)V")
    public void method3472(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3455(arg0, var2);
        }
    }

    @ObfuscatedName("gd.x(Lqy;IB)V")
    public void method3455(class467 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2125 = class183.method2026(arg0, this.field2125);
        }
    }

    @ObfuscatedName("gd.m(IIB)I")
    public int method3459(int arg0, int arg1) {
        return class183.method2676(this.field2125, arg0, arg1);
    }

    @ObfuscatedName("gd.q(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3460(int arg0, String arg1) {
        class443 var3 = this.field2125;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class429 var5 = (class429) var3.method7525((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4680;
            }
        }
        return var4;
    }
}
