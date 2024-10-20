package deob;

@ObfuscatedName("gd")
public class class158 extends class162 {

    // $FF: synthetic field
    public final class163 this$0;

    @ObfuscatedName("gd.aq")
    public String field1761;

    @ObfuscatedName("gd.aw")
    public int field1762;

    @ObfuscatedName("gd.al")
    public byte field1760;

    public class158(class163 arg0) {
        this.this$0 = arg0;
        this.field1761 = null;
    }

    @ObfuscatedName("gd.aq(Luq;I)V")
    public void method3060(class534 arg0) {
        if (arg0.method8591() != 255) {
            arg0.field5200--;
            arg0.method8598();
        }
        this.field1761 = arg0.method8601();
        this.field1762 = arg0.method8593();
        this.field1760 = arg0.method8592();
        arg0.method8598();
    }

    @ObfuscatedName("gd.aw(Lgg;I)V")
    public void method3061(class166 arg0) {
        class148 var2 = new class148();
        var2.field1679 = new class557(this.field1761);
        var2.field1681 = this.field1762;
        var2.field1680 = this.field1760;
        arg0.method3170(var2);
    }
}
