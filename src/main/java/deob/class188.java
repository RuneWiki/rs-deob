package deob;

@ObfuscatedName("hv")
public class class188 {

    @ObfuscatedName("hv.af")
    public short[] field1960;

    @ObfuscatedName("hv.at")
    public short[] field1962;

    public class188(int arg0) {
        class223 var2 = class223.method87(arg0);
        if (var2.method3872()) {
            this.field1960 = new short[var2.field2314.length];
            System.arraycopy(var2.field2314, 0, this.field1960, 0, this.field1960.length);
        }
        if (var2.method3821()) {
            this.field1962 = new short[var2.field2316.length];
            System.arraycopy(var2.field2316, 0, this.field1962, 0, this.field1962.length);
        }
    }
}
