package deob;

@ObfuscatedName("gb")
public class class159 extends class162 {

    // $FF: synthetic field
    public final class163 this$0;

    @ObfuscatedName("gb.aq")
    public int field1770;

    @ObfuscatedName("gb.aw")
    public byte field1765;

    @ObfuscatedName("gb.al")
    public int field1767;

    @ObfuscatedName("gb.ai")
    public String field1768;

    public class159(class163 arg0) {
        this.this$0 = arg0;
        this.field1770 = -1;
    }

    @ObfuscatedName("gb.aq(Luq;I)V")
    public void method3060(class534 arg0) {
        arg0.method8591();
        this.field1770 = arg0.method8593();
        this.field1765 = arg0.method8592();
        this.field1767 = arg0.method8593();
        arg0.method8598();
        this.field1768 = arg0.method8741();
        arg0.method8591();
    }

    @ObfuscatedName("gb.aw(Lgg;I)V")
    public void method3061(class166 arg0) {
        class148 var2 = (class148) arg0.field1804.get(this.field1770);
        var2.field1680 = this.field1765;
        var2.field1681 = this.field1767;
        var2.field1679 = new class557(this.field1768);
    }
}
