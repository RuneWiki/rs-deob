package deob;

@ObfuscatedName("gj")
public class class159 extends class162 {

    // $FF: synthetic field
    public final class163 this$0;

    @ObfuscatedName("gj.ac")
    public int field1736;

    @ObfuscatedName("gj.al")
    public byte field1734;

    @ObfuscatedName("gj.ak")
    public int field1737;

    @ObfuscatedName("gj.ax")
    public String field1738;

    public class159(class163 arg0) {
        this.this$0 = arg0;
        this.field1736 = -1;
    }

    @ObfuscatedName("gj.ac(Lul;B)V")
    public void method3000(class530 arg0) {
        arg0.method8365();
        this.field1736 = arg0.method8598();
        this.field1734 = arg0.method8366();
        this.field1737 = arg0.method8598();
        arg0.method8573();
        this.field1738 = arg0.method8588();
        arg0.method8365();
    }

    @ObfuscatedName("gj.al(Lgb;B)V")
    public void method3008(class166 arg0) {
        class148 var2 = (class148) arg0.field1772.get(this.field1736);
        var2.field1657 = this.field1734;
        var2.field1658 = this.field1737;
        var2.field1660 = new class553(this.field1738);
    }
}
