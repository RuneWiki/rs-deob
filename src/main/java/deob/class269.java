package deob;

@ObfuscatedName("jn")
public class class269 extends class219 {

    @ObfuscatedName("jn.i")
    public static class213 field3451 = new class213(64);

    @ObfuscatedName("jn.a")
    public int field3450 = 0;

    @ObfuscatedName("ap.t(Ljc;I)V")
    public static void method340(class262 arg0) {
        Statics.field3453 = arg0;
        Statics.field3449 = Statics.field3453.method4204(16);
    }

    @ObfuscatedName("client.q(II)Ljn;")
    public static class269 method1161(int arg0) {
        class269 var1 = (class269) field3451.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3453.method4265(16, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4372(new class195(var2));
        }
        field3451.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.i(Lgb;S)V")
    public void method4372(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4377(arg0, var2);
        }
    }

    @ObfuscatedName("jn.a(Lgb;IB)V")
    public void method4377(class195 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3450 = arg0.method3238();
        }
    }
}
