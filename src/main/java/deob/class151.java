package deob;

@ObfuscatedName("ed")
public class class151 {

    @ObfuscatedName("ed.f")
    public short[] field1607;

    @ObfuscatedName("ed.j")
    public short[] field1608;

    public class151(int arg0) {
        class170 var2 = class170.method2099(arg0);
        if (var2.method3042()) {
            this.field1607 = new short[var2.field1889.length];
            System.arraycopy(var2.field1889, 0, this.field1607, 0, this.field1607.length);
        }
        if (var2.method3017()) {
            this.field1608 = new short[var2.field1891.length];
            System.arraycopy(var2.field1891, 0, this.field1608, 0, this.field1608.length);
        }
    }
}
