package deob;

@ObfuscatedName("tm")
public class class500 extends class504 {

    @ObfuscatedName("tm.ed")
    public long field5043;

    @ObfuscatedName("tm.es")
    public class500 field5042;

    @ObfuscatedName("tm.ef")
    public class500 field5044;

    @ObfuscatedName("tm.jz()V")
    public void method8183() {
        if (this.field5044 != null) {
            this.field5044.field5042 = this.field5042;
            this.field5042.field5044 = this.field5044;
            this.field5042 = null;
            this.field5044 = null;
        }
    }
}
