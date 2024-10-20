package deob;

@ObfuscatedName("av")
public class class50 extends class204 {

    @ObfuscatedName("av.l")
    public static class193 field1093 = new class193(64);

    @ObfuscatedName("av.a")
    public boolean field1091 = false;

    @ObfuscatedName("bo.j(II)Lav;")
    public static class50 method1562(int arg0) {
        class50 var1 = (class50) field1093.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1089.method3005(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method983(new class119(var2));
        }
        field1093.method3468(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.l(Ldc;I)V")
    public void method983(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method982(arg0, var2);
        }
    }

    @ObfuscatedName("av.a(Ldc;II)V")
    public void method982(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1091 = true;
        }
    }
}
