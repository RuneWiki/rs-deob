package deob;

@ObfuscatedName("fi")
public class class169 {

    @ObfuscatedName("fi.f")
    public short[] field1836;

    @ObfuscatedName("fi.n")
    public short[] field1834;

    public class169(int arg0) {
        class189 var2 = class189.method2643(arg0);
        if (var2.method3481()) {
            this.field1836 = new short[var2.field2135.length];
            System.arraycopy(var2.field2135, 0, this.field1836, 0, this.field1836.length);
        }
        if (var2.method3473()) {
            this.field1834 = new short[var2.field2137.length];
            System.arraycopy(var2.field2137, 0, this.field1834, 0, this.field1834.length);
        }
    }
}
