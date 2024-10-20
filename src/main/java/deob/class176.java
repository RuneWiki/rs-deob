package deob;

@ObfuscatedName("fx")
public class class176 {

    @ObfuscatedName("fx.v")
    public short[] field1914;

    @ObfuscatedName("fx.x")
    public short[] field1915;

    public class176(int arg0) {
        class197 var2 = class197.method3345(arg0);
        if (var2.method3614()) {
            this.field1914 = new short[var2.field2217.length];
            System.arraycopy(var2.field2217, 0, this.field1914, 0, this.field1914.length);
        }
        if (var2.method3592()) {
            this.field1915 = new short[var2.field2262.length];
            System.arraycopy(var2.field2262, 0, this.field1915, 0, this.field1915.length);
        }
    }
}
