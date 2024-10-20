package deob;

@ObfuscatedName("au")
public class class46 extends class204 {

    @ObfuscatedName("au.m")
    public static class193 field1029 = new class193(64);

    @ObfuscatedName("au.f")
    public boolean field1026 = false;

    @ObfuscatedName("cv.j(IB)Lau;")
    public static class46 method2167(int arg0) {
        class46 var1 = (class46) field1029.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1028.method3124(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method946(new class119(var2));
        }
        field1029.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.m(Ldc;I)V")
    public void method946(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method957(arg0, var2);
        }
    }

    @ObfuscatedName("au.f(Ldc;II)V")
    public void method957(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1026 = true;
        }
    }
}
