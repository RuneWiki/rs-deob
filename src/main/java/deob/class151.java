package deob;

@ObfuscatedName("fk")
public class class151 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("fk.aw")
    public boolean field1687;

    @ObfuscatedName("fk.ay")
    public byte field1685;

    @ObfuscatedName("fk.ar")
    public byte field1684;

    @ObfuscatedName("fk.am")
    public byte field1688;

    @ObfuscatedName("fk.as")
    public byte field1690;

    public class151(class147 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("fk.aw(Lty;B)V")
    public void method2950(class514 arg0) {
        this.field1687 = arg0.method8244() == 1;
        this.field1685 = arg0.method8264();
        this.field1684 = arg0.method8264();
        this.field1688 = arg0.method8264();
        this.field1690 = arg0.method8264();
    }

    @ObfuscatedName("fk.ay(Lfx;B)V")
    public void method2951(class155 arg0) {
        arg0.field1711 = this.field1687;
        arg0.field1713 = this.field1685;
        arg0.field1707 = this.field1684;
        arg0.field1714 = this.field1688;
        arg0.field1715 = this.field1690;
    }
}
