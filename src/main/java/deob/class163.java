package deob;

@ObfuscatedName("fu")
public class class163 extends class156 {

    // $FF: synthetic field
    public final class157 this$0;

    @ObfuscatedName("fu.f")
    public String field1810;

    @ObfuscatedName("fu.w")
    public byte field1807;

    @ObfuscatedName("fu.v")
    public byte field1808;

    public class163(class157 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("fu.f(Lrd;B)V")
    public void method3007(class474 arg0) {
        this.field1810 = arg0.method7973();
        if (this.field1810 != null) {
            arg0.method7964();
            this.field1807 = arg0.method7965();
            this.field1808 = arg0.method7965();
        }
    }

    @ObfuscatedName("fu.w(Lfm;I)V")
    public void method3008(class160 arg0) {
        arg0.field1799 = this.field1810;
        if (this.field1810 != null) {
            arg0.field1795 = this.field1807;
            arg0.field1796 = this.field1808;
        }
    }
}
