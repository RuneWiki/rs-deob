package deob;

@ObfuscatedName("ax")
public class class46 extends class204 {

    @ObfuscatedName("ax.l")
    public static class193 field1005 = new class193(64);

    @ObfuscatedName("ax.y")
    public boolean field1006 = false;

    @ObfuscatedName("dc.m(II)Lax;")
    public static class46 method2311(int arg0) {
        class46 var1 = (class46) field1005.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1007.method3080(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method958(new class119(var2));
        }
        field1005.method3539(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.l(Ldx;S)V")
    public void method958(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method959(arg0, var2);
        }
    }

    @ObfuscatedName("ax.y(Ldx;II)V")
    public void method959(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1006 = true;
        }
    }
}
