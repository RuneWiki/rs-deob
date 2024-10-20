package deob;

@ObfuscatedName("ga")
public class class159 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("ga.aw")
    public long field1747;

    @ObfuscatedName("ga.ay")
    public String field1748;

    @ObfuscatedName("ga.ar")
    public int field1752;

    public class159(class147 arg0) {
        this.this$0 = arg0;
        this.field1747 = -1L;
        this.field1748 = null;
        this.field1752 = 0;
    }

    @ObfuscatedName("ga.aw(Lty;B)V")
    public void method2950(class514 arg0) {
        if (arg0.method8244() != 255) {
            arg0.field5072--;
            this.field1747 = arg0.method8251();
        }
        this.field1748 = arg0.method8254();
        this.field1752 = arg0.method8246();
    }

    @ObfuscatedName("ga.ay(Lfx;B)V")
    public void method2951(class155 arg0) {
        arg0.method3007(this.field1747, this.field1748, this.field1752);
    }
}
