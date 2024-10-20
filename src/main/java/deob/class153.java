package deob;

@ObfuscatedName("ef")
public class class153 extends class364 {

    @ObfuscatedName("ef.m")
    public static class236 field1616 = new class236(64);

    @ObfuscatedName("ef.k")
    public int field1617 = 0;

    @ObfuscatedName("ce.n(II)Lef;")
    public static class153 method2283(int arg0) {
        class153 var1 = (class153) field1616.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1618.method4710(16, arg0);
        class153 var3 = new class153();
        if (var2 != null) {
            var3.method2584(new class400(var2));
        }
        field1616.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ef.c(Lot;I)V")
    public void method2584(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2591(arg0, var2);
        }
    }

    @ObfuscatedName("ef.m(Lot;II)V")
    public void method2591(class400 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1617 = arg0.method6219();
        }
    }
}
