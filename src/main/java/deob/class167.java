package deob;

@ObfuscatedName("gj")
public class class167 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("gj.am")
    public String field1785;

    @ObfuscatedName("gj.ap")
    public byte field1789;

    @ObfuscatedName("gj.af")
    public byte field1784;

    public class167(class161 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gj.am(Luk;I)V")
    public void method3093(class531 arg0) {
        this.field1785 = arg0.method8602();
        if (this.field1785 != null) {
            arg0.method8561();
            this.field1789 = arg0.method8562();
            this.field1784 = arg0.method8562();
        }
    }

    @ObfuscatedName("gj.ap(Lgt;I)V")
    public void method3099(class164 arg0) {
        arg0.field1764 = this.field1785;
        if (this.field1785 != null) {
            arg0.field1759 = this.field1789;
            arg0.field1768 = this.field1784;
        }
    }
}
