package deob;

@ObfuscatedName("gi")
public class class187 extends class130 {

    @ObfuscatedName("gi.g")
    public static class125 field2765 = new class125(64);

    @ObfuscatedName("gi.x")
    public int field2766 = 0;

    @ObfuscatedName("fw.p(II)Lgi;")
    public static class187 method2980(int arg0) {
        class187 var1 = (class187) field2765.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2768.method3044(5, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3165(new class154(var2));
        }
        field2765.method2174(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gi.g(Lev;I)V")
    public void method3165(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3162(arg0, var2);
        }
    }

    @ObfuscatedName("gi.x(Lev;II)V")
    public void method3162(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2766 = arg0.method2595();
        }
    }
}
