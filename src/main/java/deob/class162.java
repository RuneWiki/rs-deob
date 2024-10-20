package deob;

@ObfuscatedName("gw")
public class class162 extends class165 {

    // $FF: synthetic field
    public final class166 this$0;

    @ObfuscatedName("gw.ab")
    public int field1766;

    @ObfuscatedName("gw.ay")
    public byte field1765;

    @ObfuscatedName("gw.an")
    public int field1768;

    @ObfuscatedName("gw.au")
    public String field1767;

    public class162(class166 arg0) {
        this.this$0 = arg0;
        this.field1766 = -1;
    }

    @ObfuscatedName("gw.ab(Lvg;B)V")
    public void method3203(class549 arg0) {
        arg0.method9025();
        this.field1766 = arg0.method8968();
        this.field1765 = arg0.method8798();
        this.field1768 = arg0.method8968();
        arg0.method8804();
        this.field1767 = arg0.method8808();
        arg0.method9025();
    }

    @ObfuscatedName("gw.ay(Lgx;I)V")
    public void method3207(class169 arg0) {
        class151 var2 = (class151) arg0.field1802.get(this.field1766);
        var2.field1684 = this.field1765;
        var2.field1683 = this.field1768;
        var2.field1682 = new class572(this.field1767);
    }
}
