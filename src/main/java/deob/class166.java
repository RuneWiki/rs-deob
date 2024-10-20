package deob;

@ObfuscatedName("gt")
public class class166 extends class159 {

    // $FF: synthetic field
    public final class160 this$0;

    @ObfuscatedName("gt.at")
    public String field1785;

    @ObfuscatedName("gt.an")
    public byte field1783;

    @ObfuscatedName("gt.av")
    public byte field1781;

    public class166(class160 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gt.at(Ltz;I)V")
    public void method2959(class501 arg0) {
        this.field1785 = arg0.method8128();
        if (this.field1785 != null) {
            arg0.method8129();
            this.field1783 = arg0.method8130();
            this.field1781 = arg0.method8130();
        }
    }

    @ObfuscatedName("gt.an(Lgv;I)V")
    public void method2960(class163 arg0) {
        arg0.field1762 = this.field1785;
        if (this.field1785 != null) {
            arg0.field1767 = this.field1783;
            arg0.field1768 = this.field1781;
        }
    }
}
