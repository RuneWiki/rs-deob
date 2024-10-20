package deob;

@ObfuscatedName("es")
public class class151 {

    @ObfuscatedName("es.m")
    public short[] field1601;

    @ObfuscatedName("es.k")
    public short[] field1600;

    public class151(int arg0) {
        class170 var2 = class170.method1776(arg0);
        if (var2.method2974()) {
            this.field1601 = new short[var2.field1885.length];
            System.arraycopy(var2.field1885, 0, this.field1601, 0, this.field1601.length);
        }
        if (var2.method2937()) {
            this.field1600 = new short[var2.field1887.length];
            System.arraycopy(var2.field1887, 0, this.field1600, 0, this.field1600.length);
        }
    }
}
