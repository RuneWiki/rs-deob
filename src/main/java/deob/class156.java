package deob;

@ObfuscatedName("fk")
public class class156 extends class159 {

    // $FF: synthetic field
    public final class160 this$0;

    @ObfuscatedName("fk.at")
    public int field1719;

    @ObfuscatedName("fk.an")
    public byte field1724;

    @ObfuscatedName("fk.av")
    public int field1721;

    @ObfuscatedName("fk.as")
    public String field1722;

    public class156(class160 arg0) {
        this.this$0 = arg0;
        this.field1719 = -1;
    }

    @ObfuscatedName("fk.at(Ltz;I)V")
    public void method2959(class501 arg0) {
        arg0.method8129();
        this.field1719 = arg0.method8195();
        this.field1724 = arg0.method8130();
        this.field1721 = arg0.method8195();
        arg0.method8135();
        this.field1722 = arg0.method8253();
        arg0.method8129();
    }

    @ObfuscatedName("fk.an(Lgv;I)V")
    public void method2960(class163 arg0) {
        class145 var2 = (class145) arg0.field1763.get(this.field1719);
        var2.field1635 = this.field1724;
        var2.field1631 = this.field1721;
        var2.field1632 = new class525(this.field1722);
    }
}
