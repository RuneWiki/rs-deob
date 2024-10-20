package deob;

@ObfuscatedName("al")
public class class46 extends class183 {

    @ObfuscatedName("al.k")
    public static class172 field1059 = new class172(64);

    @ObfuscatedName("al.e")
    public int field1060 = 0;

    @ObfuscatedName("j.g(II)Lal;")
    public static class46 method101(int arg0) {
        class46 var1 = (class46) field1059.method3135((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1067.method2734(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method880(new class107(var2));
        }
        field1059.method3140(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.i(Ldk;I)V")
    public void method880(class107 arg0) {
        while (true) {
            int var2 = arg0.method2092();
            if (var2 == 0) {
                return;
            }
            this.method889(arg0, var2);
        }
    }

    @ObfuscatedName("al.k(Ldk;II)V")
    public void method889(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1060 = arg0.method2094();
        }
    }
}
