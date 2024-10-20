package deob;

@ObfuscatedName("fr")
public class class152 extends class162 {

    // $FF: synthetic field
    public final class163 this$0;

    @ObfuscatedName("fr.ac")
    public int field1680;

    @ObfuscatedName("fr.al")
    public byte field1681;

    @ObfuscatedName("fr.ak")
    public int field1682;

    @ObfuscatedName("fr.ax")
    public String field1683;

    public class152(class163 arg0) {
        this.this$0 = arg0;
        this.field1680 = -1;
    }

    @ObfuscatedName("fr.ac(Lul;B)V")
    public void method3000(class530 arg0) {
        this.field1680 = arg0.method8598();
        this.field1681 = arg0.method8366();
        this.field1682 = arg0.method8598();
        arg0.method8573();
        this.field1683 = arg0.method8588();
    }

    @ObfuscatedName("fr.al(Lgb;B)V")
    public void method3008(class166 arg0) {
        class148 var2 = (class148) arg0.field1772.get(this.field1680);
        var2.field1657 = this.field1681;
        var2.field1658 = this.field1682;
        var2.field1660 = new class553(this.field1683);
    }
}
