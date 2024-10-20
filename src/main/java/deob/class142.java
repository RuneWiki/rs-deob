package deob;

@ObfuscatedName("ed")
public class class142 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ed.v")
    public int field1617;

    @ObfuscatedName("ed.c")
    public byte field1618;

    @ObfuscatedName("ed.i")
    public int field1619;

    @ObfuscatedName("ed.f")
    public String field1620;

    public class142(class146 arg0) {
        this.this$0 = arg0;
        this.field1617 = -1;
    }

    @ObfuscatedName("ed.v(Lpi;B)V")
    public void method2708(class438 arg0) {
        arg0.method6971();
        this.field1617 = arg0.method7148();
        this.field1618 = arg0.method7093();
        this.field1619 = arg0.method7148();
        arg0.method7003();
        this.field1620 = arg0.method6981();
        arg0.method6971();
    }

    @ObfuscatedName("ed.c(Lea;I)V")
    public void method2709(class149 arg0) {
        class131 var2 = (class131) arg0.field1653.get(this.field1617);
        var2.field1534 = this.field1618;
        var2.field1529 = this.field1619;
        var2.field1528 = new class459(this.field1620);
    }
}
