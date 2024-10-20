package deob;

@ObfuscatedName("gj")
public class class167 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("gj.au")
    public String field1823;

    @ObfuscatedName("gj.ae")
    public byte field1821;

    @ObfuscatedName("gj.ao")
    public byte field1822;

    public class167(class161 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gj.au(Ltm;B)V")
    public void method2976(class515 arg0) {
        this.field1823 = arg0.method8497();
        if (this.field1823 != null) {
            arg0.method8300();
            this.field1821 = arg0.method8301();
            this.field1822 = arg0.method8301();
        }
    }

    @ObfuscatedName("gj.ae(Lgo;I)V")
    public void method2975(class164 arg0) {
        arg0.field1806 = this.field1823;
        if (this.field1823 != null) {
            arg0.field1801 = this.field1821;
            arg0.field1805 = this.field1822;
        }
    }
}
