package deob;

@ObfuscatedName("gy")
public class class169 extends class162 {

    // $FF: synthetic field
    public final class163 this$0;

    @ObfuscatedName("gy.aq")
    public String field1826;

    @ObfuscatedName("gy.aw")
    public byte field1822;

    @ObfuscatedName("gy.al")
    public byte field1821;

    public class169(class163 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gy.aq(Luq;I)V")
    public void method3060(class534 arg0) {
        this.field1826 = arg0.method8601();
        if (this.field1826 != null) {
            arg0.method8591();
            this.field1822 = arg0.method8592();
            this.field1821 = arg0.method8592();
        }
    }

    @ObfuscatedName("gy.aw(Lgg;I)V")
    public void method3061(class166 arg0) {
        arg0.field1808 = this.field1826;
        if (this.field1826 != null) {
            arg0.field1807 = this.field1822;
            arg0.field1802 = this.field1821;
        }
    }
}
