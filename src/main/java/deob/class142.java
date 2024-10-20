package deob;

@ObfuscatedName("ex")
public class class142 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ex.s")
    public int field1634;

    @ObfuscatedName("ex.h")
    public byte field1633;

    @ObfuscatedName("ex.w")
    public int field1632;

    @ObfuscatedName("ex.v")
    public String field1631;

    public class142(class146 arg0) {
        this.this$0 = arg0;
        this.field1634 = -1;
    }

    @ObfuscatedName("ex.s(Lqr;I)V")
    public void method2654(class444 arg0) {
        arg0.method6929();
        this.field1634 = arg0.method7120();
        this.field1633 = arg0.method6930();
        this.field1632 = arg0.method7120();
        arg0.method6935();
        this.field1631 = arg0.method6975();
        arg0.method6929();
    }

    @ObfuscatedName("ex.h(Lec;I)V")
    public void method2655(class149 arg0) {
        class131 var2 = (class131) arg0.field1663.get(this.field1634);
        var2.field1543 = this.field1633;
        var2.field1542 = this.field1632;
        var2.field1544 = new class465(this.field1631);
    }
}
