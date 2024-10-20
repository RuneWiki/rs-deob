package deob;

@ObfuscatedName("ga")
public class class157 extends class167 {

    // $FF: synthetic field
    public final class168 this$0;

    @ObfuscatedName("ga.ac")
    public int field1736;

    @ObfuscatedName("ga.ae")
    public byte field1734;

    @ObfuscatedName("ga.ag")
    public int field1733;

    @ObfuscatedName("ga.am")
    public String field1735;

    public class157(class168 arg0) {
        this.this$0 = arg0;
        this.field1736 = -1;
    }

    @ObfuscatedName("ga.ac(Lvf;B)V")
    public void method3287(class551 arg0) {
        this.field1736 = arg0.method9119();
        this.field1734 = arg0.method8975();
        this.field1733 = arg0.method9119();
        arg0.method8980();
        this.field1735 = arg0.method9166();
    }

    @ObfuscatedName("ga.ae(Lgm;I)V")
    public void method3286(class171 arg0) {
        class153 var2 = (class153) arg0.field1836.get(this.field1736);
        var2.field1712 = this.field1734;
        var2.field1713 = this.field1733;
        var2.field1711 = new class574(this.field1735);
    }
}
