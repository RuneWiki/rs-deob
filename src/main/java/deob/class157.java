package deob;

@ObfuscatedName("gu")
public class class157 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("gu.au")
    public int field1759;

    @ObfuscatedName("gu.ae")
    public byte field1758;

    @ObfuscatedName("gu.ao")
    public int field1757;

    @ObfuscatedName("gu.at")
    public String field1760;

    public class157(class161 arg0) {
        this.this$0 = arg0;
        this.field1759 = -1;
    }

    @ObfuscatedName("gu.au(Ltm;B)V")
    public void method2976(class515 arg0) {
        arg0.method8300();
        this.field1759 = arg0.method8448();
        this.field1758 = arg0.method8301();
        this.field1757 = arg0.method8448();
        arg0.method8307();
        this.field1760 = arg0.method8311();
        arg0.method8300();
    }

    @ObfuscatedName("gu.ae(Lgo;I)V")
    public void method2975(class164 arg0) {
        class146 var2 = (class146) arg0.field1803.get(this.field1759);
        var2.field1679 = this.field1758;
        var2.field1681 = this.field1757;
        var2.field1678 = new class538(this.field1760);
    }
}
