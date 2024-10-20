package deob;

@ObfuscatedName("af")
public class class46 extends class183 {

    @ObfuscatedName("af.s")
    public static class172 field1036 = new class172(64);

    @ObfuscatedName("af.g")
    public int field1039 = 0;

    @ObfuscatedName("v.k(IS)Laf;")
    public static class46 method127(int arg0) {
        class46 var1 = (class46) field1036.method3202((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1038.method2729(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method900(new class107(var2));
        }
        field1036.method3204(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.y(Ldy;B)V")
    public void method900(class107 arg0) {
        while (true) {
            int var2 = arg0.method2138();
            if (var2 == 0) {
                return;
            }
            this.method891(arg0, var2);
        }
    }

    @ObfuscatedName("af.s(Ldy;IB)V")
    public void method891(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1039 = arg0.method2239();
        }
    }
}
