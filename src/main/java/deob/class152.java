package deob;

@ObfuscatedName("fb")
public class class152 extends class162 {

    // $FF: synthetic field
    public final class163 this$0;

    @ObfuscatedName("fb.aq")
    public int field1711;

    @ObfuscatedName("fb.aw")
    public byte field1710;

    @ObfuscatedName("fb.al")
    public int field1713;

    @ObfuscatedName("fb.ai")
    public String field1712;

    public class152(class163 arg0) {
        this.this$0 = arg0;
        this.field1711 = -1;
    }

    @ObfuscatedName("fb.aq(Luq;I)V")
    public void method3060(class534 arg0) {
        this.field1711 = arg0.method8593();
        this.field1710 = arg0.method8592();
        this.field1713 = arg0.method8593();
        arg0.method8598();
        this.field1712 = arg0.method8741();
    }

    @ObfuscatedName("fb.aw(Lgg;I)V")
    public void method3061(class166 arg0) {
        class148 var2 = (class148) arg0.field1804.get(this.field1711);
        var2.field1680 = this.field1710;
        var2.field1681 = this.field1713;
        var2.field1679 = new class557(this.field1712);
    }
}
