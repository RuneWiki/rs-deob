package deob;

@ObfuscatedName("gd")
public class class169 extends class162 {

    // $FF: synthetic field
    public final class163 this$0;

    @ObfuscatedName("gd.ac")
    public String field1798;

    @ObfuscatedName("gd.al")
    public byte field1795;

    @ObfuscatedName("gd.ak")
    public byte field1796;

    public class169(class163 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gd.ac(Lul;B)V")
    public void method3000(class530 arg0) {
        this.field1798 = arg0.method8375();
        if (this.field1798 != null) {
            arg0.method8365();
            this.field1795 = arg0.method8366();
            this.field1796 = arg0.method8366();
        }
    }

    @ObfuscatedName("gd.al(Lgb;B)V")
    public void method3008(class166 arg0) {
        arg0.field1775 = this.field1798;
        if (this.field1798 != null) {
            arg0.field1778 = this.field1795;
            arg0.field1779 = this.field1796;
        }
    }
}
