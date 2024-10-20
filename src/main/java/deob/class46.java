package deob;

@ObfuscatedName("ak")
public class class46 extends class180 {

    @ObfuscatedName("ak.k")
    public static class170 field1045 = new class170(64);

    @ObfuscatedName("ak.v")
    public int field1046 = 0;

    @ObfuscatedName("c.y(II)Lak;")
    public static class46 method118(int arg0) {
        class46 var1 = (class46) field1045.method3145((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1044.method2704(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method888(new class107(var2));
        }
        field1045.method3147(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.u(Ldo;I)V")
    public void method888(class107 arg0) {
        while (true) {
            int var2 = arg0.method2109();
            if (var2 == 0) {
                return;
            }
            this.method889(arg0, var2);
        }
    }

    @ObfuscatedName("ak.k(Ldo;II)V")
    public void method889(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1046 = arg0.method2111();
        }
    }
}
