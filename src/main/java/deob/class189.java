package deob;

@ObfuscatedName("gk")
public class class189 extends class130 {

    @ObfuscatedName("gk.c")
    public static class125 field2785 = new class125(64);

    @ObfuscatedName("gk.f")
    public boolean field2786 = false;

    @ObfuscatedName("client.s(II)Lgk;")
    public static class189 method447(int arg0) {
        class189 var1 = (class189) field2785.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2787.method2986(19, arg0);
        class189 var3 = new class189();
        if (var2 != null) {
            var3.method3141(new class154(var2));
        }
        field2785.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gk.c(Lea;I)V")
    public void method3141(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3139(arg0, var2);
        }
    }

    @ObfuscatedName("gk.f(Lea;II)V")
    public void method3139(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2786 = true;
        }
    }
}
