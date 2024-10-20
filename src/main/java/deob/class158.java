package deob;

@ObfuscatedName("ge")
public class class158 extends class162 {

    // $FF: synthetic field
    public final class163 this$0;

    @ObfuscatedName("ge.ac")
    public String field1733;

    @ObfuscatedName("ge.al")
    public int field1728;

    @ObfuscatedName("ge.ak")
    public byte field1729;

    public class158(class163 arg0) {
        this.this$0 = arg0;
        this.field1733 = null;
    }

    @ObfuscatedName("ge.ac(Lul;B)V")
    public void method3000(class530 arg0) {
        if (arg0.method8365() != 255) {
            arg0.field5140--;
            arg0.method8573();
        }
        this.field1733 = arg0.method8375();
        this.field1728 = arg0.method8598();
        this.field1729 = arg0.method8366();
        arg0.method8573();
    }

    @ObfuscatedName("ge.al(Lgb;B)V")
    public void method3008(class166 arg0) {
        class148 var2 = new class148();
        var2.field1660 = new class553(this.field1733);
        var2.field1658 = this.field1728;
        var2.field1657 = this.field1729;
        arg0.method3118(var2);
    }
}
