package deob;

@ObfuscatedName("fp")
public class class155 extends class165 {

    // $FF: synthetic field
    public final class166 this$0;

    @ObfuscatedName("fp.ab")
    public int field1711;

    @ObfuscatedName("fp.ay")
    public byte field1708;

    @ObfuscatedName("fp.an")
    public int field1709;

    @ObfuscatedName("fp.au")
    public String field1712;

    public class155(class166 arg0) {
        this.this$0 = arg0;
        this.field1711 = -1;
    }

    @ObfuscatedName("fp.ab(Lvg;B)V")
    public void method3203(class549 arg0) {
        this.field1711 = arg0.method8968();
        this.field1708 = arg0.method8798();
        this.field1709 = arg0.method8968();
        arg0.method8804();
        this.field1712 = arg0.method8808();
    }

    @ObfuscatedName("fp.ay(Lgx;I)V")
    public void method3207(class169 arg0) {
        class151 var2 = (class151) arg0.field1802.get(this.field1711);
        var2.field1684 = this.field1708;
        var2.field1683 = this.field1709;
        var2.field1682 = new class572(this.field1712);
    }
}
