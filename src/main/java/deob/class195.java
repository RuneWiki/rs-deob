package deob;

@ObfuscatedName("ho")
public class class195 extends class489 {

    @ObfuscatedName("ho.af")
    public static class304 field1993 = new class304(64);

    @ObfuscatedName("ho.at")
    public int field1994 = 0;

    @ObfuscatedName("tl.az(Loc;I)V")
    public static void method8149(class379 arg0) {
        Statics.field1996 = arg0;
        Statics.field1946 = Statics.field1996.method6338(16);
    }

    @ObfuscatedName("ee.ah(IB)Lho;")
    public static class195 method2746(int arg0) {
        class195 var1 = (class195) field1993.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1996.method6328(16, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3404(new class535(var2));
        }
        field1993.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ho.af(Lur;I)V")
    public void method3404(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3403(arg0, var2);
        }
    }

    @ObfuscatedName("ho.at(Lur;II)V")
    public void method3403(class535 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1994 = arg0.method8670();
        }
    }
}
