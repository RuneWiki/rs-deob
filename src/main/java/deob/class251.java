package deob;

@ObfuscatedName("ir")
public class class251 extends class176 {

    @ObfuscatedName("ir.n")
    public static class146 field3292 = new class146(64);

    @ObfuscatedName("ir.v")
    public class316 field3296;

    @ObfuscatedName("fh.z(IB)Lir;")
    public static class251 method3143(int arg0) {
        class251 var1 = (class251) field3292.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3294.method3726(34, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4080(new class300(var2));
        }
        var3.method4082();
        field3292.method2994(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.n(B)V")
    public void method4082() {
    }

    @ObfuscatedName("ir.v(Lkl;I)V")
    public void method4080(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method4081(arg0, var2);
        }
    }

    @ObfuscatedName("ir.u(Lkl;II)V")
    public void method4081(class300 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3296 = class248.method3085(arg0, this.field3296);
        }
    }

    @ObfuscatedName("ir.r(III)I")
    public int method4085(int arg0, int arg1) {
        return Statics.method1847(this.field3296, arg0, arg1);
    }

    @ObfuscatedName("ir.p(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4083(int arg0, String arg1) {
        return class248.method2060(this.field3296, arg0, arg1);
    }
}
