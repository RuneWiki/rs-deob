package deob;

@ObfuscatedName("gt")
public class class190 extends class130 {

    @ObfuscatedName("gt.y")
    public static class125 field2768 = new class125(64);

    @ObfuscatedName("gt.o")
    public boolean field2769 = false;

    @ObfuscatedName("r.k(II)Lgt;")
    public static class190 method45(int arg0) {
        class190 var1 = (class190) field2768.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2770.method3065(15, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3226(new class161(var2));
        }
        field2768.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gt.y(Lfm;I)V")
    public void method3226(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3227(arg0, var2);
        }
    }

    @ObfuscatedName("gt.o(Lfm;II)V")
    public void method3227(class161 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2769 = true;
        }
    }
}
