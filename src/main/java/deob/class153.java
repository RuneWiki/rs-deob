package deob;

@ObfuscatedName("fk")
public class class153 extends class156 {

    // $FF: synthetic field
    public final class157 this$0;

    @ObfuscatedName("fk.af")
    public int field1741;

    @ObfuscatedName("fk.an")
    public byte field1742;

    @ObfuscatedName("fk.aw")
    public int field1743;

    @ObfuscatedName("fk.ac")
    public String field1744;

    public class153(class157 arg0) {
        this.this$0 = arg0;
        this.field1741 = -1;
    }

    @ObfuscatedName("fk.af(Lsg;I)V")
    public void method3061(class489 arg0) {
        arg0.method8248();
        this.field1741 = arg0.method8250();
        this.field1742 = arg0.method8249();
        this.field1743 = arg0.method8250();
        arg0.method8271();
        this.field1744 = arg0.method8259();
        arg0.method8248();
    }

    @ObfuscatedName("fk.an(Lgj;B)V")
    public void method3060(class160 arg0) {
        class142 var2 = (class142) arg0.field1770.get(this.field1741);
        var2.field1650 = this.field1742;
        var2.field1655 = this.field1743;
        var2.field1652 = new class513(this.field1744);
    }
}
