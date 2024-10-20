package deob;

@ObfuscatedName("he")
public class class189 extends class470 {

    @ObfuscatedName("he.ay")
    public static class289 field1935 = new class289(64);

    @ObfuscatedName("he.ar")
    public boolean field1937 = false;

    @ObfuscatedName("fg.aw(II)Lhe;")
    public static class189 method2891(int arg0) {
        class189 var1 = (class189) field1935.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1938.method6117(19, arg0);
        class189 var3 = new class189();
        if (var2 != null) {
            var3.method3302(new class514(var2));
        }
        field1935.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("he.ay(Lty;I)V")
    public void method3302(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3310(arg0, var2);
        }
    }

    @ObfuscatedName("he.ar(Lty;IB)V")
    public void method3310(class514 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1937 = true;
        }
    }
}
