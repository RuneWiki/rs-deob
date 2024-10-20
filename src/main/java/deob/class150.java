package deob;

@ObfuscatedName("fc")
public class class150 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("fc.au")
    public int field1705;

    @ObfuscatedName("fc.ae")
    public byte field1700;

    @ObfuscatedName("fc.ao")
    public int field1702;

    @ObfuscatedName("fc.at")
    public String field1703;

    public class150(class161 arg0) {
        this.this$0 = arg0;
        this.field1705 = -1;
    }

    @ObfuscatedName("fc.au(Ltm;B)V")
    public void method2976(class515 arg0) {
        this.field1705 = arg0.method8448();
        this.field1700 = arg0.method8301();
        this.field1702 = arg0.method8448();
        arg0.method8307();
        this.field1703 = arg0.method8311();
    }

    @ObfuscatedName("fc.ae(Lgo;I)V")
    public void method2975(class164 arg0) {
        class146 var2 = (class146) arg0.field1803.get(this.field1705);
        var2.field1679 = this.field1700;
        var2.field1681 = this.field1702;
        var2.field1678 = new class538(this.field1703);
    }
}
