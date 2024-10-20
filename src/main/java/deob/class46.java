package deob;

@ObfuscatedName("ag")
public class class46 extends class205 {

    @ObfuscatedName("ag.w")
    public static class194 field1055 = new class194(64);

    @ObfuscatedName("ag.d")
    public boolean field1056 = false;

    @ObfuscatedName("gj.a(II)Lag;")
    public static class46 method3569(int arg0) {
        class46 var1 = (class46) field1055.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1057.method3188(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method1024(new class120(var2));
        }
        field1055.method3581(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.w(Ldx;S)V")
    public void method1024(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method1023(arg0, var2);
        }
    }

    @ObfuscatedName("ag.d(Ldx;II)V")
    public void method1023(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1056 = true;
        }
    }
}
