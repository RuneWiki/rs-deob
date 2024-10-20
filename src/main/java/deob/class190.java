package deob;

@ObfuscatedName("gu")
public class class190 extends class130 {

    @ObfuscatedName("gu.x")
    public static class125 field2761 = new class125(64);

    @ObfuscatedName("gu.i")
    public boolean field2762 = false;

    @ObfuscatedName("x.u(II)Lgu;")
    public static class190 method17(int arg0) {
        class190 var1 = (class190) field2761.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2765.method3071(15, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3230(new class154(var2));
        }
        field2761.method2179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.x(Len;B)V")
    public void method3230(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3232(arg0, var2);
        }
    }

    @ObfuscatedName("gu.i(Len;II)V")
    public void method3232(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2762 = true;
        }
    }
}
