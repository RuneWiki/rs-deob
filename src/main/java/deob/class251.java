package deob;

@ObfuscatedName("iv")
public class class251 extends class176 {

    @ObfuscatedName("iv.x")
    public static class146 field3286 = new class146(64);

    @ObfuscatedName("iv.t")
    public class316 field3287;

    @ObfuscatedName("gl.c(Lhz;B)V")
    public static void method3356(class234 arg0) {
        Statics.field3288 = arg0;
    }

    @ObfuscatedName("hb.x(IB)Liv;")
    public static class251 method3798(int arg0) {
        class251 var1 = (class251) field3286.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3288.method3825(34, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4189(new class300(var2));
        }
        var3.method4198();
        field3286.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.t(B)V")
    public void method4198() {
    }

    @ObfuscatedName("iv.g(Lkz;I)V")
    public void method4189(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4190(arg0, var2);
        }
    }

    @ObfuscatedName("iv.l(Lkz;II)V")
    public void method4190(class300 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3287 = class248.method4436(arg0, this.field3287);
        }
    }

    @ObfuscatedName("iv.u(III)I")
    public int method4191(int arg0, int arg1) {
        return class248.method1051(this.field3287, arg0, arg1);
    }

    @ObfuscatedName("iv.j(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4195(int arg0, String arg1) {
        class316 var3 = this.field3287;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class177 var5 = (class177) var3.method5493((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2089;
            }
        }
        return var4;
    }
}
