package deob;

@ObfuscatedName("ae")
public class class46 extends class204 {

    @ObfuscatedName("ae.f")
    public static class193 field1035 = new class193(64);

    @ObfuscatedName("ae.i")
    public boolean field1039 = false;

    @ObfuscatedName("an.v(II)Lae;")
    public static class46 method903(int arg0) {
        class46 var1 = (class46) field1035.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1036.method3082(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method923(new class119(var2));
        }
        field1035.method3502(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.f(Ldx;I)V")
    public void method923(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method924(arg0, var2);
        }
    }

    @ObfuscatedName("ae.i(Ldx;II)V")
    public void method924(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1039 = true;
        }
    }
}
