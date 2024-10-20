package deob;

@ObfuscatedName("gc")
public class class157 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("gc.aw")
    public int field1740;

    @ObfuscatedName("gc.ay")
    public byte field1738;

    @ObfuscatedName("gc.ar")
    public int field1739;

    @ObfuscatedName("gc.am")
    public String field1741;

    public class157(class161 arg0) {
        this.this$0 = arg0;
        this.field1740 = -1;
    }

    @ObfuscatedName("gc.aw(Lty;B)V")
    public void method2988(class514 arg0) {
        arg0.method8244();
        this.field1740 = arg0.method8246();
        this.field1738 = arg0.method8264();
        this.field1739 = arg0.method8246();
        arg0.method8251();
        this.field1741 = arg0.method8369();
        arg0.method8244();
    }

    @ObfuscatedName("gc.ay(Lgh;I)V")
    public void method2983(class164 arg0) {
        class146 var2 = (class146) arg0.field1775.get(this.field1740);
        var2.field1656 = this.field1738;
        var2.field1653 = this.field1739;
        var2.field1654 = new class538(this.field1741);
    }
}
