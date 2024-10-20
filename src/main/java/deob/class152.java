package deob;

@ObfuscatedName("ei")
public class class152 extends class347 {

    @ObfuscatedName("ei.n")
    public static class221 field1721 = new class221(64);

    @ObfuscatedName("ei.f")
    public class361 field1722;

    @ObfuscatedName("c.v(Ljv;B)V")
    public static void method144(class275 arg0) {
        Statics.field1720 = arg0;
    }

    @ObfuscatedName("ck.n(II)Lei;")
    public static class152 method1871(int arg0) {
        class152 var1 = (class152) field1721.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1720.method4468(34, arg0);
        class152 var3 = new class152();
        if (var2 != null) {
            var3.method2642(new class383(var2));
        }
        var3.method2660();
        field1721.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ei.f(I)V")
    public void method2660() {
    }

    @ObfuscatedName("ei.y(Lnd;I)V")
    public void method2642(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2654(arg0, var2);
        }
    }

    @ObfuscatedName("ei.p(Lnd;II)V")
    public void method2654(class383 arg0, int arg1) {
        if (arg1 == 249) {
            this.field1722 = class143.method4696(arg0, this.field1722);
        }
    }

    @ObfuscatedName("ei.j(III)I")
    public int method2644(int arg0, int arg1) {
        return class143.method1790(this.field1722, arg0, arg1);
    }

    @ObfuscatedName("ei.r(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2645(int arg0, String arg1) {
        return class143.method5166(this.field1722, arg0, arg1);
    }
}
