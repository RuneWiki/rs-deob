package deob;

@ObfuscatedName("id")
public class class227 {

    @ObfuscatedName("id.an")
    public short[] field2429;

    @ObfuscatedName("id.au")
    public short[] field2431;

    public class227(int arg0) {
        class262 var2 = class262.method2385(arg0);
        if (var2.method4822()) {
            this.field2429 = new short[var2.field2813.length];
            System.arraycopy(var2.field2813, 0, this.field2429, 0, this.field2429.length);
        }
        if (var2.method4808()) {
            this.field2431 = new short[var2.field2801.length];
            System.arraycopy(var2.field2801, 0, this.field2431, 0, this.field2431.length);
        }
    }
}
