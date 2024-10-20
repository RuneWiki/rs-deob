package deob;

@ObfuscatedName("gd")
public class class159 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("gd.au")
    public long field1774;

    @ObfuscatedName("gd.ae")
    public String field1769;

    @ObfuscatedName("gd.ao")
    public int field1770;

    public class159(class147 arg0) {
        this.this$0 = arg0;
        this.field1774 = -1L;
        this.field1769 = null;
        this.field1770 = 0;
    }

    @ObfuscatedName("gd.au(Ltm;I)V")
    public void method2950(class515 arg0) {
        if (arg0.method8300() != 255) {
            arg0.field5111--;
            this.field1774 = arg0.method8307();
        }
        this.field1769 = arg0.method8497();
        this.field1770 = arg0.method8448();
    }

    @ObfuscatedName("gd.ae(Lfi;B)V")
    public void method2949(class155 arg0) {
        arg0.method3033(this.field1774, this.field1769, this.field1770);
    }
}
