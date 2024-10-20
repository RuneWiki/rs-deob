package deob;

@ObfuscatedName("fb")
public class class149 extends class159 {

    // $FF: synthetic field
    public final class160 this$0;

    @ObfuscatedName("fb.at")
    public int field1661;

    @ObfuscatedName("fb.an")
    public byte field1655;

    @ObfuscatedName("fb.av")
    public int field1659;

    @ObfuscatedName("fb.as")
    public String field1657;

    public class149(class160 arg0) {
        this.this$0 = arg0;
        this.field1661 = -1;
    }

    @ObfuscatedName("fb.at(Ltz;I)V")
    public void method2959(class501 arg0) {
        this.field1661 = arg0.method8195();
        this.field1655 = arg0.method8130();
        this.field1659 = arg0.method8195();
        arg0.method8135();
        this.field1657 = arg0.method8253();
    }

    @ObfuscatedName("fb.an(Lgv;I)V")
    public void method2960(class163 arg0) {
        class145 var2 = (class145) arg0.field1763.get(this.field1661);
        var2.field1635 = this.field1655;
        var2.field1631 = this.field1659;
        var2.field1632 = new class525(this.field1657);
    }
}
