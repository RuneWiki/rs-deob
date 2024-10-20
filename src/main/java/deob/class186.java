package deob;

@ObfuscatedName("hy")
public class class186 {

    @ObfuscatedName("hy.ak")
    public short[] field1895;

    @ObfuscatedName("hy.ax")
    public short[] field1894;

    public class186(int arg0) {
        class221 var2 = class221.method3594(arg0);
        if (var2.method3749()) {
            this.field1895 = new short[var2.field2253.length];
            System.arraycopy(var2.field2253, 0, this.field1895, 0, this.field1895.length);
        }
        if (var2.method3750()) {
            this.field1894 = new short[var2.field2288.length];
            System.arraycopy(var2.field2288, 0, this.field1894, 0, this.field1894.length);
        }
    }
}
