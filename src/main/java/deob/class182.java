package deob;

@ObfuscatedName("gk")
public class class182 extends class511 {

    @ObfuscatedName("gk.ak")
    public static class316 field1900 = new class316(64);

    @ObfuscatedName("gk.aj")
    public int field1899 = 0;

    @ObfuscatedName("oh.ap(Lpe;I)V")
    public static void method6876(class392 arg0) {
        Statics.field1902 = arg0;
        Statics.field2934 = Statics.field1902.method7004(16);
    }

    @ObfuscatedName("br.aw(IB)Lgk;")
    public static class182 method696(int arg0) {
        class182 var1 = (class182) field1900.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1902.method7009(16, arg0);
        class182 var3 = new class182();
        if (var2 != null) {
            var3.method3603(new class558(var2));
        }
        field1900.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gk.ak(Lvl;I)V")
    public void method3603(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3590(arg0, var2);
        }
    }

    @ObfuscatedName("gk.aj(Lvl;IB)V")
    public void method3590(class558 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1899 = arg0.method9260();
        }
    }

    @ObfuscatedName("jb.ai(I)V")
    public static void method4931() {
        field1900.method5930();
    }
}
