package deob;

@ObfuscatedName("fr")
public class class146 extends class156 {

    // $FF: synthetic field
    public final class157 this$0;

    @ObfuscatedName("fr.af")
    public int field1680;

    @ObfuscatedName("fr.an")
    public byte field1681;

    @ObfuscatedName("fr.aw")
    public int field1685;

    @ObfuscatedName("fr.ac")
    public String field1683;

    public class146(class157 arg0) {
        this.this$0 = arg0;
        this.field1680 = -1;
    }

    @ObfuscatedName("fr.af(Lsg;I)V")
    public void method3061(class489 arg0) {
        this.field1680 = arg0.method8250();
        this.field1681 = arg0.method8249();
        this.field1685 = arg0.method8250();
        arg0.method8271();
        this.field1683 = arg0.method8259();
    }

    @ObfuscatedName("fr.an(Lgj;B)V")
    public void method3060(class160 arg0) {
        class142 var2 = (class142) arg0.field1770.get(this.field1680);
        var2.field1650 = this.field1681;
        var2.field1655 = this.field1685;
        var2.field1652 = new class513(this.field1683);
    }
}
