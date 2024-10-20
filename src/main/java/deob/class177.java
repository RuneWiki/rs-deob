package deob;

@ObfuscatedName("gq")
public class class177 extends class511 {

    @ObfuscatedName("gq.aw")
    public static class316 field1881 = new class316(64);

    @ObfuscatedName("gq.ak")
    public int field1880 = 0;

    @ObfuscatedName("gb.ap(IS)Lgq;")
    public static class177 method3441(int arg0) {
        class177 var1 = (class177) field1881.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1882.method7009(5, arg0);
        class177 var3 = new class177();
        if (var2 != null) {
            var3.method3572(new class558(var2));
        }
        field1881.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gq.aw(Lvl;S)V")
    public void method3572(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3573(arg0, var2);
        }
    }

    @ObfuscatedName("gq.ak(Lvl;II)V")
    public void method3573(class558 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1880 = arg0.method9260();
        }
    }
}
