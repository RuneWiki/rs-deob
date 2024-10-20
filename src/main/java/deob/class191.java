package deob;

@ObfuscatedName("ha")
public class class191 {

    @ObfuscatedName("ha.aj")
    public short[] field1977;

    @ObfuscatedName("ha.az")
    public short[] field1975;

    public class191(int arg0) {
        class225 var2 = class225.method369(arg0);
        if (var2.method3941()) {
            this.field1977 = new short[var2.field2365.length];
            System.arraycopy(var2.field2365, 0, this.field1977, 0, this.field1977.length);
        }
        if (var2.method3942()) {
            this.field1975 = new short[var2.field2359.length];
            System.arraycopy(var2.field2359, 0, this.field1975, 0, this.field1975.length);
        }
    }
}
