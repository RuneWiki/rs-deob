package deob;

@ObfuscatedName("fi")
public class class179 {

    @ObfuscatedName("fi.dw")
    public long field2820;

    @ObfuscatedName("fi.db")
    public class179 field2821;

    @ObfuscatedName("fi.em")
    public class179 field2819;

    @ObfuscatedName("fi.io()V")
    public void method3360() {
        if (this.field2819 != null) {
            this.field2819.field2821 = this.field2821;
            this.field2821.field2819 = this.field2819;
            this.field2821 = null;
            this.field2819 = null;
        }
    }

    @ObfuscatedName("fi.it()Z")
    public boolean method3359() {
        return this.field2819 != null;
    }
}
