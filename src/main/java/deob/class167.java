package deob;

@ObfuscatedName("gx")
public class class167 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("gx.aw")
    public String field1793;

    @ObfuscatedName("gx.ay")
    public byte field1795;

    @ObfuscatedName("gx.ar")
    public byte field1794;

    public class167(class161 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gx.aw(Lty;B)V")
    public void method2988(class514 arg0) {
        this.field1793 = arg0.method8254();
        if (this.field1793 != null) {
            arg0.method8244();
            this.field1795 = arg0.method8264();
            this.field1794 = arg0.method8264();
        }
    }

    @ObfuscatedName("gx.ay(Lgh;I)V")
    public void method2983(class164 arg0) {
        arg0.field1778 = this.field1793;
        if (this.field1793 != null) {
            arg0.field1779 = this.field1795;
            arg0.field1781 = this.field1794;
        }
    }
}
