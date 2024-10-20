package deob;

@ObfuscatedName("fs")
public class class148 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("fs.aw")
    public int field1664;

    @ObfuscatedName("fs.ay")
    public byte field1663;

    public class148(class147 arg0) {
        this.this$0 = arg0;
        this.field1664 = -1;
    }

    @ObfuscatedName("fs.aw(Lty;B)V")
    public void method2950(class514 arg0) {
        this.field1664 = arg0.method8246();
        this.field1663 = arg0.method8264();
    }

    @ObfuscatedName("fs.ay(Lfx;B)V")
    public void method2951(class155 arg0) {
        arg0.method3010(this.field1664, this.field1663);
    }
}
