package deob;

@ObfuscatedName("eu")
public class class143 extends class146 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("eu.c")
    public int field1661;

    @ObfuscatedName("eu.p")
    public byte field1659;

    @ObfuscatedName("eu.f")
    public int field1660;

    @ObfuscatedName("eu.n")
    public String field1667;

    public class143(class147 arg0) {
        this.this$0 = arg0;
        this.field1661 = -1;
    }

    @ObfuscatedName("eu.c(Lqq;I)V")
    public void method2862(class445 arg0) {
        arg0.method7196();
        this.field1661 = arg0.method7198();
        this.field1659 = arg0.method7197();
        this.field1660 = arg0.method7198();
        arg0.method7319();
        this.field1667 = arg0.method7206();
        arg0.method7196();
    }

    @ObfuscatedName("eu.p(Ler;B)V")
    public void method2863(class150 arg0) {
        class132 var2 = (class132) arg0.field1704.get(this.field1661);
        var2.field1575 = this.field1659;
        var2.field1571 = this.field1660;
        var2.field1572 = new class466(this.field1667);
    }
}
