package deob;

@ObfuscatedName("hv")
public class class184 {

    @ObfuscatedName("hv.ar")
    public short[] field1889;

    @ObfuscatedName("hv.am")
    public short[] field1892;

    public class184(int arg0) {
        class208 var2 = class208.method2788(arg0);
        if (var2.method3654()) {
            this.field1889 = new short[var2.field2196.length];
            System.arraycopy(var2.field2196, 0, this.field1889, 0, this.field1889.length);
        }
        if (var2.method3647()) {
            this.field1892 = new short[var2.field2198.length];
            System.arraycopy(var2.field2198, 0, this.field1892, 0, this.field1892.length);
        }
    }
}
