package deob;

@ObfuscatedName("ec")
public class class142 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ec.c")
    public int field1660;

    @ObfuscatedName("ec.v")
    public byte field1661;

    @ObfuscatedName("ec.q")
    public int field1659;

    @ObfuscatedName("ec.f")
    public String field1657;

    public class142(class146 arg0) {
        this.this$0 = arg0;
        this.field1660 = -1;
    }

    @ObfuscatedName("ec.c(Lqt;I)V")
    public void method2716(class443 arg0) {
        arg0.method7047();
        this.field1660 = arg0.method7049();
        this.field1661 = arg0.method7048();
        this.field1659 = arg0.method7049();
        arg0.method7106();
        this.field1657 = arg0.method7057();
        arg0.method7047();
    }

    @ObfuscatedName("ec.v(Lex;I)V")
    public void method2719(class149 arg0) {
        class131 var2 = (class131) arg0.field1692.get(this.field1660);
        var2.field1582 = this.field1661;
        var2.field1579 = this.field1659;
        var2.field1580 = new class464(this.field1657);
    }
}
