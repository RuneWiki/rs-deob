package deob;

@ObfuscatedName("fu")
public class class145 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("fu.aw")
    public int field1650;

    @ObfuscatedName("fu.ay")
    public boolean field1649;

    public class145(class147 arg0) {
        this.this$0 = arg0;
        this.field1650 = -1;
    }

    @ObfuscatedName("fu.aw(Lty;B)V")
    public void method2950(class514 arg0) {
        this.field1650 = arg0.method8246();
        this.field1649 = arg0.method8244() == 1;
    }

    @ObfuscatedName("fu.ay(Lfx;B)V")
    public void method2951(class155 arg0) {
        arg0.method3033(this.field1650, this.field1649);
    }
}
