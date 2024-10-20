package deob;

@ObfuscatedName("em")
public class class135 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("em.v")
    public int field1559;

    @ObfuscatedName("em.c")
    public byte field1558;

    @ObfuscatedName("em.i")
    public int field1560;

    @ObfuscatedName("em.f")
    public String field1561;

    public class135(class146 arg0) {
        this.this$0 = arg0;
        this.field1559 = -1;
    }

    @ObfuscatedName("em.v(Lpi;B)V")
    public void method2708(class438 arg0) {
        this.field1559 = arg0.method7148();
        this.field1558 = arg0.method7093();
        this.field1560 = arg0.method7148();
        arg0.method7003();
        this.field1561 = arg0.method6981();
    }

    @ObfuscatedName("em.c(Lea;I)V")
    public void method2709(class149 arg0) {
        class131 var2 = (class131) arg0.field1653.get(this.field1559);
        var2.field1534 = this.field1558;
        var2.field1529 = this.field1560;
        var2.field1528 = new class459(this.field1561);
    }
}
