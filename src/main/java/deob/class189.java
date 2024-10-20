package deob;

@ObfuscatedName("gb")
public class class189 extends class130 {

    @ObfuscatedName("gb.d")
    public static class125 field2784 = new class125(64);

    @ObfuscatedName("gb.m")
    public boolean field2782 = false;

    @ObfuscatedName("fh.n(II)Lgb;")
    public static class189 method3081(int arg0) {
        class189 var1 = (class189) field2784.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2783.method3093(19, arg0);
        class189 var3 = new class189();
        if (var2 != null) {
            var3.method3243(new class161(var2));
        }
        field2784.method2219(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gb.d(Lfa;I)V")
    public void method3243(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3244(arg0, var2);
        }
    }

    @ObfuscatedName("gb.m(Lfa;II)V")
    public void method3244(class161 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2782 = true;
        }
    }
}
