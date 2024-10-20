package deob;

@ObfuscatedName("gz")
public class class157 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("gz.am")
    public int field1732;

    @ObfuscatedName("gz.ap")
    public byte field1730;

    @ObfuscatedName("gz.af")
    public int field1731;

    @ObfuscatedName("gz.aj")
    public String field1729;

    public class157(class161 arg0) {
        this.this$0 = arg0;
        this.field1732 = -1;
    }

    @ObfuscatedName("gz.am(Luk;I)V")
    public void method3093(class531 arg0) {
        arg0.method8561();
        this.field1732 = arg0.method8775();
        this.field1730 = arg0.method8562();
        this.field1731 = arg0.method8775();
        arg0.method8567();
        this.field1729 = arg0.method8641();
        arg0.method8561();
    }

    @ObfuscatedName("gz.ap(Lgt;I)V")
    public void method3099(class164 arg0) {
        class146 var2 = (class146) arg0.field1761.get(this.field1732);
        var2.field1642 = this.field1730;
        var2.field1643 = this.field1731;
        var2.field1644 = new class554(this.field1729);
    }
}
