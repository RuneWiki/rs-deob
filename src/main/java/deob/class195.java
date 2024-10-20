package deob;

@ObfuscatedName("gs")
public class class195 extends class130 {

    @ObfuscatedName("gs.e")
    public static class125 field2856 = new class125(64);

    @ObfuscatedName("gs.c")
    public int field2857;

    @ObfuscatedName("gs.l")
    public int field2863;

    @ObfuscatedName("gs.y")
    public int field2859;

    @ObfuscatedName("au.b(II)Lgs;")
    public static class195 method623(int arg0) {
        class195 var1 = (class195) field2856.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2860.method3126(14, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3379(new class154(var2));
        }
        field2856.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gs.e(Lec;I)V")
    public void method3379(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3380(arg0, var2);
        }
    }

    @ObfuscatedName("gs.c(Lec;IB)V")
    public void method3380(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2857 = arg0.method2671();
            this.field2863 = arg0.method2669();
            this.field2859 = arg0.method2669();
        }
    }
}
