package deob;

@ObfuscatedName("gk")
public class class161 extends class165 {

    // $FF: synthetic field
    public final class166 this$0;

    @ObfuscatedName("gk.ab")
    public String field1759;

    @ObfuscatedName("gk.ay")
    public int field1760;

    @ObfuscatedName("gk.an")
    public byte field1761;

    public class161(class166 arg0) {
        this.this$0 = arg0;
        this.field1759 = null;
    }

    @ObfuscatedName("gk.ab(Lvg;B)V")
    public void method3203(class549 arg0) {
        if (arg0.method9025() != 255) {
            arg0.field5378--;
            arg0.method8804();
        }
        this.field1759 = arg0.method8807();
        this.field1760 = arg0.method8968();
        this.field1761 = arg0.method8798();
        arg0.method8804();
    }

    @ObfuscatedName("gk.ay(Lgx;I)V")
    public void method3207(class169 arg0) {
        class151 var2 = new class151();
        var2.field1682 = new class572(this.field1759);
        var2.field1683 = this.field1760;
        var2.field1684 = this.field1761;
        arg0.method3320(var2);
    }
}
