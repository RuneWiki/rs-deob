package deob;

@ObfuscatedName("fp")
public class class156 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("fp.am")
    public String field1725;

    @ObfuscatedName("fp.ap")
    public int field1728;

    @ObfuscatedName("fp.af")
    public byte field1723;

    public class156(class161 arg0) {
        this.this$0 = arg0;
        this.field1725 = null;
    }

    @ObfuscatedName("fp.am(Luk;I)V")
    public void method3093(class531 arg0) {
        if (arg0.method8561() != 255) {
            arg0.field5181--;
            arg0.method8567();
        }
        this.field1725 = arg0.method8602();
        this.field1728 = arg0.method8775();
        this.field1723 = arg0.method8562();
        arg0.method8567();
    }

    @ObfuscatedName("fp.ap(Lgt;I)V")
    public void method3099(class164 arg0) {
        class146 var2 = new class146();
        var2.field1644 = new class554(this.field1725);
        var2.field1643 = this.field1728;
        var2.field1642 = this.field1723;
        arg0.method3201(var2);
    }
}
