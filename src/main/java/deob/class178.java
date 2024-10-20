package deob;

@ObfuscatedName("fe")
public class class178 extends class387 {

    @ObfuscatedName("fe.l")
    public static class249 field1942 = new class249(64);

    @ObfuscatedName("fe.s")
    public class401 field1943;

    @ObfuscatedName("hh.c(Lkq;I)V")
    public static void method3977(class307 arg0) {
        Statics.field1944 = arg0;
    }

    @ObfuscatedName("ee.l(II)Lfe;")
    public static class178 method2633(int arg0) {
        class178 var1 = (class178) field1942.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1944.method5066(34, arg0);
        class178 var3 = new class178();
        if (var2 != null) {
            var3.method3068(new class421(var2));
        }
        var3.method3069();
        field1942.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fe.s(I)V")
    public void method3069() {
    }

    @ObfuscatedName("fe.e(Lpi;I)V")
    public void method3068(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method3080(arg0, var2);
        }
    }

    @ObfuscatedName("fe.r(Lpi;IB)V")
    public void method3080(class421 arg0, int arg1) {
        if (arg1 == 249) {
            this.field1943 = class168.method4950(arg0, this.field1943);
        }
    }

    @ObfuscatedName("fe.o(IIB)I")
    public int method3070(int arg0, int arg1) {
        return class168.method6932(this.field1943, arg0, arg1);
    }

    @ObfuscatedName("fe.i(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3092(int arg0, String arg1) {
        return class168.method4942(this.field1943, arg0, arg1);
    }

    @ObfuscatedName("cu.w(B)V")
    public static void method1999() {
        field1942.method4475();
    }
}
