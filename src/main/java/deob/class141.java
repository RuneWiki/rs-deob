package deob;

@ObfuscatedName("ep")
public class class141 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ep.s")
    public String field1628;

    @ObfuscatedName("ep.h")
    public int field1629;

    @ObfuscatedName("ep.w")
    public byte field1627;

    public class141(class146 arg0) {
        this.this$0 = arg0;
        this.field1628 = null;
    }

    @ObfuscatedName("ep.s(Lqr;I)V")
    public void method2654(class444 arg0) {
        if (arg0.method6929() != 255) {
            arg0.field4708--;
            arg0.method6935();
        }
        this.field1628 = arg0.method6938();
        this.field1629 = arg0.method7120();
        this.field1627 = arg0.method6930();
        arg0.method6935();
    }

    @ObfuscatedName("ep.h(Lec;I)V")
    public void method2655(class149 arg0) {
        class131 var2 = new class131();
        var2.field1544 = new class465(this.field1628);
        var2.field1542 = this.field1629;
        var2.field1543 = this.field1627;
        arg0.method2766(var2);
    }
}
