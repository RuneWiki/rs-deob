package deob;

@ObfuscatedName("aw")
public class class46 extends class204 {

    @ObfuscatedName("aw.q")
    public static class193 field1043 = new class193(64);

    @ObfuscatedName("aw.c")
    public boolean field1046 = false;

    @ObfuscatedName("at.n(II)Law;")
    public static class46 method665(int arg0) {
        class46 var1 = (class46) field1043.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1045.method3094(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method942(new class119(var2));
        }
        field1043.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.q(Ldc;I)V")
    public void method942(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method944(arg0, var2);
        }
    }

    @ObfuscatedName("aw.c(Ldc;II)V")
    public void method944(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1046 = true;
        }
    }
}
