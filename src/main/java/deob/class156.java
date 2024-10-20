package deob;

@ObfuscatedName("fi")
public class class156 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("fi.aw")
    public String field1733;

    @ObfuscatedName("fi.ay")
    public int field1732;

    @ObfuscatedName("fi.ar")
    public byte field1736;

    public class156(class161 arg0) {
        this.this$0 = arg0;
        this.field1733 = null;
    }

    @ObfuscatedName("fi.aw(Lty;B)V")
    public void method2988(class514 arg0) {
        if (arg0.method8244() != 255) {
            arg0.field5072--;
            arg0.method8251();
        }
        this.field1733 = arg0.method8254();
        this.field1732 = arg0.method8246();
        this.field1736 = arg0.method8264();
        arg0.method8251();
    }

    @ObfuscatedName("fi.ay(Lgh;I)V")
    public void method2983(class164 arg0) {
        class146 var2 = new class146();
        var2.field1654 = new class538(this.field1733);
        var2.field1653 = this.field1732;
        var2.field1656 = this.field1736;
        arg0.method3086(var2);
    }
}
