package deob;

@ObfuscatedName("gm")
public class class166 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("gm.aw")
    public long field1788;

    @ObfuscatedName("gm.ay")
    public String field1791;

    public class166(class147 arg0) {
        this.this$0 = arg0;
        this.field1788 = -1L;
        this.field1791 = null;
    }

    @ObfuscatedName("gm.aw(Lty;B)V")
    public void method2950(class514 arg0) {
        if (arg0.method8244() != 255) {
            arg0.field5072--;
            this.field1788 = arg0.method8251();
        }
        this.field1791 = arg0.method8254();
    }

    @ObfuscatedName("gm.ay(Lfx;B)V")
    public void method2951(class155 arg0) {
        arg0.method3008(this.field1788, this.field1791);
    }
}
