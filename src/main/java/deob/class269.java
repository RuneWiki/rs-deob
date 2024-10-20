package deob;

@ObfuscatedName("jo")
public class class269 extends class219 {

    @ObfuscatedName("jo.n")
    public static class213 field3445 = new class213(64);

    @ObfuscatedName("jo.r")
    public int field3448 = 0;

    @ObfuscatedName("iv.d(II)Ljo;")
    public static class269 method4248(int arg0) {
        class269 var1 = (class269) field3445.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3446.method4273(16, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4457(new class195(var2));
        }
        field3445.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jo.z(Lgy;B)V")
    public void method4457(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4458(arg0, var2);
        }
    }

    @ObfuscatedName("jo.n(Lgy;IB)V")
    public void method4458(class195 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3448 = arg0.method3269();
        }
    }
}
