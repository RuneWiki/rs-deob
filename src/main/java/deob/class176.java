package deob;

@ObfuscatedName("gv")
public class class176 {

    @ObfuscatedName("gv.ag")
    public short[] field1867;

    @ObfuscatedName("gv.am")
    public short[] field1868;

    public class176(int arg0) {
        class211 var2 = class211.method2414(arg0);
        if (var2.method3860()) {
            this.field1867 = new short[var2.field2238.length];
            System.arraycopy(var2.field2238, 0, this.field1867, 0, this.field1867.length);
        }
        if (var2.method3859()) {
            this.field1868 = new short[var2.field2240.length];
            System.arraycopy(var2.field2240, 0, this.field1868, 0, this.field1868.length);
        }
    }
}
