package deob;

@ObfuscatedName("fc")
public class class173 extends class404 {

    @ObfuscatedName("fc.c")
    public static class257 field1841 = new class257(64);

    @ObfuscatedName("fc.i")
    public boolean field1840 = false;

    @ObfuscatedName("ni.v(IB)Lfc;")
    public static class173 method6220(int arg0) {
        class173 var1 = (class173) field1841.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4331.method5296(19, arg0);
        class173 var3 = new class173();
        if (var2 != null) {
            var3.method3083(new class438(var2));
        }
        field1841.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fc.c(Lpi;I)V")
    public void method3083(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3076(arg0, var2);
        }
    }

    @ObfuscatedName("fc.i(Lpi;IB)V")
    public void method3076(class438 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1840 = true;
        }
    }
}
