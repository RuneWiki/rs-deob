package deob;

@ObfuscatedName("ga")
public class class164 extends class167 {

    // $FF: synthetic field
    public final class168 this$0;

    @ObfuscatedName("ga.ap")
    public int field1795;

    @ObfuscatedName("ga.aw")
    public byte field1796;

    @ObfuscatedName("ga.ak")
    public int field1797;

    @ObfuscatedName("ga.aj")
    public String field1798;

    public class164(class168 arg0) {
        this.this$0 = arg0;
        this.field1795 = -1;
    }

    @ObfuscatedName("ga.ap(Lvl;I)V")
    public void method3436(class558 arg0) {
        arg0.method9258();
        this.field1795 = arg0.method9260();
        this.field1796 = arg0.method9259();
        this.field1797 = arg0.method9260();
        arg0.method9265();
        this.field1798 = arg0.method9269();
        arg0.method9258();
    }

    @ObfuscatedName("ga.aw(Lgw;I)V")
    public void method3434(class171 arg0) {
        class153 var2 = (class153) arg0.field1836.get(this.field1795);
        var2.field1714 = this.field1796;
        var2.field1711 = this.field1797;
        var2.field1712 = new class581(this.field1798);
    }
}
