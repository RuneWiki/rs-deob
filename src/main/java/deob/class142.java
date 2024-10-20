package deob;

@ObfuscatedName("fp")
public class class142 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("fp.au")
    public long field1664;

    @ObfuscatedName("fp.ae")
    public String field1663;

    public class142(class147 arg0) {
        this.this$0 = arg0;
        this.field1664 = -1L;
        this.field1663 = null;
    }

    @ObfuscatedName("fp.au(Ltm;I)V")
    public void method2950(class515 arg0) {
        if (arg0.method8300() != 255) {
            arg0.field5111--;
            this.field1664 = arg0.method8307();
        }
        this.field1663 = arg0.method8497();
    }

    @ObfuscatedName("fp.ae(Lfi;B)V")
    public void method2949(class155 arg0) {
        arg0.method3033(this.field1664, this.field1663, 0);
    }
}
