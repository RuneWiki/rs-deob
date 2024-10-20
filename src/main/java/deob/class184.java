package deob;

@ObfuscatedName("ho")
public class class184 {

    @ObfuscatedName("ho.ao")
    public short[] field1919;

    @ObfuscatedName("ho.at")
    public short[] field1920;

    public class184(int arg0) {
        class207 var2 = class207.method3280(arg0);
        if (var2.method3715()) {
            this.field1919 = new short[var2.field2237.length];
            System.arraycopy(var2.field2237, 0, this.field1919, 0, this.field1919.length);
        }
        if (var2.method3668()) {
            this.field1920 = new short[var2.field2239.length];
            System.arraycopy(var2.field2239, 0, this.field1920, 0, this.field1920.length);
        }
    }
}
