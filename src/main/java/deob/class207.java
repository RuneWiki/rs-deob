package deob;

@ObfuscatedName("hb")
public class class207 extends class511 {

    @ObfuscatedName("hb.aw")
    public static class316 field2139 = new class316(64);

    @ObfuscatedName("hb.ak")
    public class530 field2140;

    @ObfuscatedName("ac.ap(Lpe;I)V")
    public static void method285(class392 arg0) {
        Statics.field2141 = arg0;
    }

    @ObfuscatedName("et.aw(IB)Lhb;")
    public static class207 method3212(int arg0) {
        class207 var1 = (class207) field2139.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2141.method7009(34, arg0);
        class207 var3 = new class207();
        if (var2 != null) {
            var3.method3895(new class558(var2));
        }
        var3.method3889();
        field2139.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hb.ak(I)V")
    public void method3889() {
    }

    @ObfuscatedName("hb.aj(Lvl;B)V")
    public void method3895(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3892(arg0, var2);
        }
    }

    @ObfuscatedName("hb.ai(Lvl;II)V")
    public void method3892(class558 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2140 = class188.method2372(arg0, this.field2140);
        }
    }

    @ObfuscatedName("hb.ay(III)I")
    public int method3893(int arg0, int arg1) {
        return class188.method3588(this.field2140, arg0, arg1);
    }

    @ObfuscatedName("hb.as(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3894(int arg0, String arg1) {
        return class188.method5808(this.field2140, arg0, arg1);
    }

    @ObfuscatedName("jn.ae(B)V")
    public static void method4986() {
        field2139.method5930();
    }
}
