package deob;

@ObfuscatedName("ce")
public class class87 extends class209 {

    @ObfuscatedName("ce.v")
    public static class203 field1239 = new class203(128);

    @ObfuscatedName("ce.s")
    public int[] field1235;

    @ObfuscatedName("ce.o")
    public int[] field1236;

    @ObfuscatedName("ce.k")
    public String[] field1237;

    @ObfuscatedName("ce.u")
    public int field1238;

    @ObfuscatedName("ce.i")
    public int field1234;

    @ObfuscatedName("ce.t")
    public int field1244;

    @ObfuscatedName("ce.p")
    public int field1241;

    @ObfuscatedName("ce.l")
    public class200[] field1242;

    @ObfuscatedName("dt.v(III)Lce;")
    public static class87 method2128(int arg0, int arg1) {
        class87 var2 = (class87) field1239.method3687((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1109.method4288(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1109.method4349(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class87 var6 = Statics.method1674(var5);
            if (var6 != null) {
                field1239.method3689(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ce.o(IB)[Lga;")
    public class200[] method1847(int arg0) {
        return new class200[arg0];
    }
}
