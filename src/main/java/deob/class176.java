package deob;

@ObfuscatedName("gz")
public class class176 {

    @ObfuscatedName("gz.ai")
    public short[] field1873;

    @ObfuscatedName("gz.ay")
    public short[] field1872;

    @ObfuscatedName("gz.as")
    public int field1869 = -1;

    @ObfuscatedName("gz.ae")
    public int field1874 = -1;

    @ObfuscatedName("gz.am")
    public int field1875 = -1;

    @ObfuscatedName("gz.at")
    public int field1876 = -1;

    @ObfuscatedName("gz.au")
    public int field1877;

    @ObfuscatedName("gz.an")
    public class256 field1868;

    public class176(int arg0) {
        class211 var2 = class211.method7530(arg0);
        if (var2.method4007()) {
            this.field1873 = new short[var2.field2241.length];
            System.arraycopy(var2.field2241, 0, this.field1873, 0, this.field1873.length);
        }
        if (var2.method4022()) {
            this.field1872 = new short[var2.field2243.length];
            System.arraycopy(var2.field2243, 0, this.field1872, 0, this.field1872.length);
        }
        this.field1877 = var2.field2237;
    }

    @ObfuscatedName("gz.ap(I)Z")
    public boolean method3567() {
        return this.field1873 != null;
    }

    @ObfuscatedName("gz.aw(I)Z")
    public boolean method3568() {
        return this.field1872 != null;
    }
}
