package deob;

@ObfuscatedName("fw")
public class class175 {

    @ObfuscatedName("fw.c")
    public short[] field1859;

    @ObfuscatedName("fw.x")
    public short[] field1856;

    public class175(int arg0) {
        class195 var2 = class195.method5052(arg0);
        if (var2.method3475()) {
            this.field1859 = new short[var2.field2146.length];
            System.arraycopy(var2.field2146, 0, this.field1859, 0, this.field1859.length);
        }
        if (var2.method3511()) {
            this.field1856 = new short[var2.field2148.length];
            System.arraycopy(var2.field2148, 0, this.field1856, 0, this.field1856.length);
        }
    }
}
