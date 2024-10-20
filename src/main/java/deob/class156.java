package deob;

@ObfuscatedName("fa")
public class class156 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("fa.au")
    public String field1754;

    @ObfuscatedName("fa.ae")
    public int field1752;

    @ObfuscatedName("fa.ao")
    public byte field1753;

    public class156(class161 arg0) {
        this.this$0 = arg0;
        this.field1754 = null;
    }

    @ObfuscatedName("fa.au(Ltm;B)V")
    public void method2976(class515 arg0) {
        if (arg0.method8300() != 255) {
            arg0.field5111--;
            arg0.method8307();
        }
        this.field1754 = arg0.method8497();
        this.field1752 = arg0.method8448();
        this.field1753 = arg0.method8301();
        arg0.method8307();
    }

    @ObfuscatedName("fa.ae(Lgo;I)V")
    public void method2975(class164 arg0) {
        class146 var2 = new class146();
        var2.field1678 = new class538(this.field1754);
        var2.field1681 = this.field1752;
        var2.field1679 = this.field1753;
        arg0.method3072(var2);
    }
}
