package deob;

@ObfuscatedName("er")
public class class138 {

    @ObfuscatedName("er.v")
    public short[] field1516;

    @ObfuscatedName("er.j")
    public short[] field1519;

    public class138(int arg0) {
        class157 var2 = class157.method101(arg0);
        if (var2.method2745()) {
            this.field1516 = new short[var2.field1797.length];
            System.arraycopy(var2.field1797, 0, this.field1516, 0, this.field1516.length);
        }
        if (var2.method2746()) {
            this.field1519 = new short[var2.field1799.length];
            System.arraycopy(var2.field1799, 0, this.field1519, 0, this.field1519.length);
        }
    }
}
