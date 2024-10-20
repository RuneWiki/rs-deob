package deob;

@ObfuscatedName("ix")
public class class251 extends class176 {

    @ObfuscatedName("ix.j")
    public static class146 field3293 = new class146(64);

    @ObfuscatedName("ix.i")
    public class316 field3295;

    @ObfuscatedName("ap.s(IB)Lix;")
    public static class251 method631(int arg0) {
        class251 var1 = (class251) field3293.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3294.method3790(34, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4114(new class300(var2));
        }
        var3.method4113();
        field3293.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.j(I)V")
    public void method4113() {
    }

    @ObfuscatedName("ix.i(Lky;I)V")
    public void method4114(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4119(arg0, var2);
        }
    }

    @ObfuscatedName("ix.k(Lky;II)V")
    public void method4119(class300 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3295 = Statics.method2030(arg0, this.field3295);
        }
    }

    @ObfuscatedName("ix.u(III)I")
    public int method4126(int arg0, int arg1) {
        class316 var3 = this.field3295;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5405((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2094;
            }
        }
        return var4;
    }

    @ObfuscatedName("ix.n(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4121(int arg0, String arg1) {
        return class248.method3751(this.field3295, arg0, arg1);
    }
}
