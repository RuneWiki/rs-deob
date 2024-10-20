package deob;

@ObfuscatedName("ei")
public class class141 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ei.c")
    public String field1656;

    @ObfuscatedName("ei.v")
    public int field1652;

    @ObfuscatedName("ei.q")
    public byte field1653;

    public class141(class146 arg0) {
        this.this$0 = arg0;
        this.field1656 = null;
    }

    @ObfuscatedName("ei.c(Lqt;I)V")
    public void method2716(class443 arg0) {
        if (arg0.method7047() != 255) {
            arg0.field4700--;
            arg0.method7106();
        }
        this.field1656 = arg0.method7056();
        this.field1652 = arg0.method7049();
        this.field1653 = arg0.method7048();
        arg0.method7106();
    }

    @ObfuscatedName("ei.v(Lex;I)V")
    public void method2719(class149 arg0) {
        class131 var2 = new class131();
        var2.field1580 = new class464(this.field1656);
        var2.field1579 = this.field1652;
        var2.field1582 = this.field1653;
        arg0.method2834(var2);
    }
}
