package deob;

@ObfuscatedName("jq")
public class class261 extends class185 {

    @ObfuscatedName("jq.m")
    public static class155 field3304 = new class155(64);

    @ObfuscatedName("jq.k")
    public class326 field3305;

    @ObfuscatedName("bo.x(Liy;I)V")
    public static void method784(class244 arg0) {
        Statics.field3306 = arg0;
    }

    @ObfuscatedName("jn.m(IB)Ljq;")
    public static class261 method4429(int arg0) {
        class261 var1 = (class261) field3304.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3306.method3869(34, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4195(new class310(var2));
        }
        var3.method4217();
        field3304.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.k(I)V")
    public void method4217() {
    }

    @ObfuscatedName("jq.d(Lkb;B)V")
    public void method4195(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4193(arg0, var2);
        }
    }

    @ObfuscatedName("jq.w(Lkb;II)V")
    public void method4193(class310 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3305 = Statics.method4011(arg0, this.field3305);
        }
    }

    @ObfuscatedName("jq.v(III)I")
    public int method4196(int arg0, int arg1) {
        class326 var3 = this.field3305;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5519((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2115;
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.q(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4194(int arg0, String arg1) {
        return Statics.method95(this.field3305, arg0, arg1);
    }

    @ObfuscatedName("gn.z(I)V")
    public static void method3367() {
        field3304.method3141();
    }
}
