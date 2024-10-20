package deob;

@ObfuscatedName("gs")
public class class163 extends class167 {

    // $FF: synthetic field
    public final class168 this$0;

    @ObfuscatedName("gs.ac")
    public String field1796;

    @ObfuscatedName("gs.ae")
    public int field1795;

    @ObfuscatedName("gs.ag")
    public byte field1794;

    public class163(class168 arg0) {
        this.this$0 = arg0;
        this.field1796 = null;
    }

    @ObfuscatedName("gs.ac(Lvf;B)V")
    public void method3287(class551 arg0) {
        if (arg0.method8955() != 255) {
            arg0.field5415--;
            arg0.method8980();
        }
        this.field1796 = arg0.method8987();
        this.field1795 = arg0.method9119();
        this.field1794 = arg0.method8975();
        arg0.method8980();
    }

    @ObfuscatedName("gs.ae(Lgm;I)V")
    public void method3286(class171 arg0) {
        class153 var2 = new class153();
        var2.field1711 = new class574(this.field1796);
        var2.field1713 = this.field1795;
        var2.field1712 = this.field1794;
        arg0.method3389(var2);
    }
}
