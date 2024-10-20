package deob;

@ObfuscatedName("fd")
public class class142 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("fd.aw")
    public long field1643;

    @ObfuscatedName("fd.ay")
    public String field1644;

    public class142(class147 arg0) {
        this.this$0 = arg0;
        this.field1643 = -1L;
        this.field1644 = null;
    }

    @ObfuscatedName("fd.aw(Lty;B)V")
    public void method2950(class514 arg0) {
        if (arg0.method8244() != 255) {
            arg0.field5072--;
            this.field1643 = arg0.method8251();
        }
        this.field1644 = arg0.method8254();
    }

    @ObfuscatedName("fd.ay(Lfx;B)V")
    public void method2951(class155 arg0) {
        arg0.method3007(this.field1643, this.field1644, 0);
    }
}
