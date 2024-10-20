package deob;

@ObfuscatedName("eg")
public class class135 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("eg.c")
    public int field1603;

    @ObfuscatedName("eg.v")
    public byte field1600;

    @ObfuscatedName("eg.q")
    public int field1601;

    @ObfuscatedName("eg.f")
    public String field1599;

    public class135(class146 arg0) {
        this.this$0 = arg0;
        this.field1603 = -1;
    }

    @ObfuscatedName("eg.c(Lqt;I)V")
    public void method2716(class443 arg0) {
        this.field1603 = arg0.method7049();
        this.field1600 = arg0.method7048();
        this.field1601 = arg0.method7049();
        arg0.method7106();
        this.field1599 = arg0.method7057();
    }

    @ObfuscatedName("eg.v(Lex;I)V")
    public void method2719(class149 arg0) {
        class131 var2 = (class131) arg0.field1692.get(this.field1603);
        var2.field1582 = this.field1600;
        var2.field1579 = this.field1601;
        var2.field1580 = new class464(this.field1599);
    }
}
