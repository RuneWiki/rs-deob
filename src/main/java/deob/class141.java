package deob;

@ObfuscatedName("eq")
public class class141 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("eq.v")
    public String field1614;

    @ObfuscatedName("eq.c")
    public int field1616;

    @ObfuscatedName("eq.i")
    public byte field1613;

    public class141(class146 arg0) {
        this.this$0 = arg0;
        this.field1614 = null;
    }

    @ObfuscatedName("eq.v(Lpi;B)V")
    public void method2708(class438 arg0) {
        if (arg0.method6971() != 255) {
            arg0.field4621--;
            arg0.method7003();
        }
        this.field1614 = arg0.method6980();
        this.field1616 = arg0.method7148();
        this.field1613 = arg0.method7093();
        arg0.method7003();
    }

    @ObfuscatedName("eq.c(Lea;I)V")
    public void method2709(class149 arg0) {
        class131 var2 = new class131();
        var2.field1528 = new class459(this.field1614);
        var2.field1529 = this.field1616;
        var2.field1534 = this.field1613;
        arg0.method2833(var2);
    }
}
