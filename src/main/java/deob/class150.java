package deob;

@ObfuscatedName("fq")
public class class150 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("fq.am")
    public int field1669;

    @ObfuscatedName("fq.ap")
    public byte field1668;

    @ObfuscatedName("fq.af")
    public int field1671;

    @ObfuscatedName("fq.aj")
    public String field1670;

    public class150(class161 arg0) {
        this.this$0 = arg0;
        this.field1669 = -1;
    }

    @ObfuscatedName("fq.am(Luk;I)V")
    public void method3093(class531 arg0) {
        this.field1669 = arg0.method8775();
        this.field1668 = arg0.method8562();
        this.field1671 = arg0.method8775();
        arg0.method8567();
        this.field1670 = arg0.method8641();
    }

    @ObfuscatedName("fq.ap(Lgt;I)V")
    public void method3099(class164 arg0) {
        class146 var2 = (class146) arg0.field1761.get(this.field1669);
        var2.field1642 = this.field1668;
        var2.field1643 = this.field1671;
        var2.field1644 = new class554(this.field1670);
    }
}
