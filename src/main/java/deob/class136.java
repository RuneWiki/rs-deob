package deob;

@ObfuscatedName("es")
public class class136 extends class146 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("es.c")
    public int field1600;

    @ObfuscatedName("es.p")
    public byte field1599;

    @ObfuscatedName("es.f")
    public int field1601;

    @ObfuscatedName("es.n")
    public String field1602;

    public class136(class147 arg0) {
        this.this$0 = arg0;
        this.field1600 = -1;
    }

    @ObfuscatedName("es.c(Lqq;I)V")
    public void method2862(class445 arg0) {
        this.field1600 = arg0.method7198();
        this.field1599 = arg0.method7197();
        this.field1601 = arg0.method7198();
        arg0.method7319();
        this.field1602 = arg0.method7206();
    }

    @ObfuscatedName("es.p(Ler;B)V")
    public void method2863(class150 arg0) {
        class132 var2 = (class132) arg0.field1704.get(this.field1600);
        var2.field1575 = this.field1599;
        var2.field1571 = this.field1601;
        var2.field1572 = new class466(this.field1602);
    }
}
