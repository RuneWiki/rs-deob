package deob;

@ObfuscatedName("fw")
public class class181 {

    @ObfuscatedName("fw.cg")
    public long field2114;

    @ObfuscatedName("fw.cv")
    public class181 field2115;

    @ObfuscatedName("fw.ce")
    public class181 field2113;

    @ObfuscatedName("fw.fz()V")
    public void method3286() {
        if (this.field2113 != null) {
            this.field2113.field2115 = this.field2115;
            this.field2115.field2113 = this.field2113;
            this.field2115 = null;
            this.field2113 = null;
        }
    }

    @ObfuscatedName("fw.fn()Z")
    public boolean method3285() {
        return this.field2113 != null;
    }
}
