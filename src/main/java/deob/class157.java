package deob;

@ObfuscatedName("gp")
public class class157 extends class167 {

    // $FF: synthetic field
    public final class168 this$0;

    @ObfuscatedName("gp.ap")
    public int field1734;

    @ObfuscatedName("gp.aw")
    public byte field1733;

    @ObfuscatedName("gp.ak")
    public int field1740;

    @ObfuscatedName("gp.aj")
    public String field1735;

    public class157(class168 arg0) {
        this.this$0 = arg0;
        this.field1734 = -1;
    }

    @ObfuscatedName("gp.ap(Lvl;I)V")
    public void method3436(class558 arg0) {
        this.field1734 = arg0.method9260();
        this.field1733 = arg0.method9259();
        this.field1740 = arg0.method9260();
        arg0.method9265();
        this.field1735 = arg0.method9269();
    }

    @ObfuscatedName("gp.aw(Lgw;I)V")
    public void method3434(class171 arg0) {
        class153 var2 = (class153) arg0.field1836.get(this.field1734);
        var2.field1714 = this.field1733;
        var2.field1711 = this.field1740;
        var2.field1712 = new class581(this.field1735);
    }
}
