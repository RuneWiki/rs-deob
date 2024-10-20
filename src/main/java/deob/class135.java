package deob;

@ObfuscatedName("ej")
public class class135 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ej.s")
    public int field1574;

    @ObfuscatedName("ej.h")
    public byte field1575;

    @ObfuscatedName("ej.w")
    public int field1578;

    @ObfuscatedName("ej.v")
    public String field1577;

    public class135(class146 arg0) {
        this.this$0 = arg0;
        this.field1574 = -1;
    }

    @ObfuscatedName("ej.s(Lqr;I)V")
    public void method2654(class444 arg0) {
        this.field1574 = arg0.method7120();
        this.field1575 = arg0.method6930();
        this.field1578 = arg0.method7120();
        arg0.method6935();
        this.field1577 = arg0.method6975();
    }

    @ObfuscatedName("ej.h(Lec;I)V")
    public void method2655(class149 arg0) {
        class131 var2 = (class131) arg0.field1663.get(this.field1574);
        var2.field1543 = this.field1575;
        var2.field1542 = this.field1578;
        var2.field1544 = new class465(this.field1577);
    }
}
