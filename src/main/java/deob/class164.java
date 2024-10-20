package deob;

@ObfuscatedName("gp")
public class class164 extends class167 {

    // $FF: synthetic field
    public final class168 this$0;

    @ObfuscatedName("gp.ac")
    public int field1805;

    @ObfuscatedName("gp.ae")
    public byte field1801;

    @ObfuscatedName("gp.ag")
    public int field1803;

    @ObfuscatedName("gp.am")
    public String field1802;

    public class164(class168 arg0) {
        this.this$0 = arg0;
        this.field1805 = -1;
    }

    @ObfuscatedName("gp.ac(Lvf;B)V")
    public void method3287(class551 arg0) {
        arg0.method8955();
        this.field1805 = arg0.method9119();
        this.field1801 = arg0.method8975();
        this.field1803 = arg0.method9119();
        arg0.method8980();
        this.field1802 = arg0.method9166();
        arg0.method8955();
    }

    @ObfuscatedName("gp.ae(Lgm;I)V")
    public void method3286(class171 arg0) {
        class153 var2 = (class153) arg0.field1836.get(this.field1805);
        var2.field1712 = this.field1801;
        var2.field1713 = this.field1803;
        var2.field1711 = new class574(this.field1802);
    }
}
