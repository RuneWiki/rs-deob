package deob;

@ObfuscatedName("gj")
public class class171 {

    @ObfuscatedName("gj.al")
    public short[] field1835;

    @ObfuscatedName("gj.ai")
    public short[] field1836;

    public class171(int arg0) {
        class205 var2 = class205.method6353(arg0);
        if (var2.method3650()) {
            this.field1835 = new short[var2.field2223.length];
            System.arraycopy(var2.field2223, 0, this.field1835, 0, this.field1835.length);
        }
        if (var2.method3651()) {
            this.field1836 = new short[var2.field2179.length];
            System.arraycopy(var2.field2179, 0, this.field1836, 0, this.field1836.length);
        }
    }
}
