package deob;

@ObfuscatedName("eb")
public class class135 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("eb.o")
    public int field1609;

    @ObfuscatedName("eb.q")
    public byte field1608;

    @ObfuscatedName("eb.l")
    public int field1610;

    @ObfuscatedName("eb.k")
    public String field1607;

    public class135(class146 arg0) {
        this.this$0 = arg0;
        this.field1609 = -1;
    }

    @ObfuscatedName("eb.o(Lpx;I)V")
    public void method2673(class440 arg0) {
        this.field1609 = arg0.method7082();
        this.field1608 = arg0.method7034();
        this.field1610 = arg0.method7082();
        arg0.method7014();
        this.field1607 = arg0.method7044();
    }

    @ObfuscatedName("eb.q(Let;I)V")
    public void method2664(class149 arg0) {
        class131 var2 = (class131) arg0.field1708.get(this.field1609);
        var2.field1587 = this.field1608;
        var2.field1586 = this.field1610;
        var2.field1583 = new class461(this.field1607);
    }
}
