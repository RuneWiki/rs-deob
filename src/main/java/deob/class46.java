package deob;

@ObfuscatedName("am")
public class class46 extends class204 {

    @ObfuscatedName("am.v")
    public static class193 field1036 = new class193(64);

    @ObfuscatedName("am.r")
    public boolean field1037 = false;

    @ObfuscatedName("w.i(IS)Lam;")
    public static class46 method646(int arg0) {
        class46 var1 = (class46) field1036.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1039.method3035(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method944(new class119(var2));
        }
        field1036.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.v(Ldx;I)V")
    public void method944(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method935(arg0, var2);
        }
    }

    @ObfuscatedName("am.r(Ldx;II)V")
    public void method935(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1037 = true;
        }
    }
}
