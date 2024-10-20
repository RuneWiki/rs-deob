package deob;

@ObfuscatedName("ed")
public class class136 {

    @ObfuscatedName("ed.f")
    public short[] field1538;

    @ObfuscatedName("ed.y")
    public short[] field1539;

    public class136(int arg0) {
        class155 var2 = class155.method4399(arg0);
        if (var2.method2783()) {
            this.field1538 = new short[var2.field1817.length];
            System.arraycopy(var2.field1817, 0, this.field1538, 0, this.field1538.length);
        }
        if (var2.method2784()) {
            this.field1539 = new short[var2.field1819.length];
            System.arraycopy(var2.field1819, 0, this.field1539, 0, this.field1539.length);
        }
    }
}
