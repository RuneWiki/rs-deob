package deob;

@ObfuscatedName("ew")
public class class142 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ew.o")
    public int field1671;

    @ObfuscatedName("ew.q")
    public byte field1669;

    @ObfuscatedName("ew.l")
    public int field1670;

    @ObfuscatedName("ew.k")
    public String field1672;

    public class142(class146 arg0) {
        this.this$0 = arg0;
        this.field1671 = -1;
    }

    @ObfuscatedName("ew.o(Lpx;I)V")
    public void method2673(class440 arg0) {
        arg0.method7071();
        this.field1671 = arg0.method7082();
        this.field1669 = arg0.method7034();
        this.field1670 = arg0.method7082();
        arg0.method7014();
        this.field1672 = arg0.method7044();
        arg0.method7071();
    }

    @ObfuscatedName("ew.q(Let;I)V")
    public void method2664(class149 arg0) {
        class131 var2 = (class131) arg0.field1708.get(this.field1671);
        var2.field1587 = this.field1669;
        var2.field1586 = this.field1670;
        var2.field1583 = new class461(this.field1672);
    }
}
