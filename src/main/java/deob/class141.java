package deob;

@ObfuscatedName("ed")
public class class141 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ed.o")
    public String field1665;

    @ObfuscatedName("ed.q")
    public int field1662;

    @ObfuscatedName("ed.l")
    public byte field1663;

    public class141(class146 arg0) {
        this.this$0 = arg0;
        this.field1665 = null;
    }

    @ObfuscatedName("ed.o(Lpx;I)V")
    public void method2673(class440 arg0) {
        if (arg0.method7071() != 255) {
            arg0.field4678--;
            arg0.method7014();
        }
        this.field1665 = arg0.method6902();
        this.field1662 = arg0.method7082();
        this.field1663 = arg0.method7034();
        arg0.method7014();
    }

    @ObfuscatedName("ed.q(Let;I)V")
    public void method2664(class149 arg0) {
        class131 var2 = new class131();
        var2.field1583 = new class461(this.field1665);
        var2.field1586 = this.field1662;
        var2.field1587 = this.field1663;
        arg0.method2777(var2);
    }
}
