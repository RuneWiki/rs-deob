package deob;

@ObfuscatedName("gb")
public class class166 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("gb.au")
    public long field1816;

    @ObfuscatedName("gb.ae")
    public String field1814;

    public class166(class147 arg0) {
        this.this$0 = arg0;
        this.field1816 = -1L;
        this.field1814 = null;
    }

    @ObfuscatedName("gb.au(Ltm;I)V")
    public void method2950(class515 arg0) {
        if (arg0.method8300() != 255) {
            arg0.field5111--;
            this.field1816 = arg0.method8307();
        }
        this.field1814 = arg0.method8497();
    }

    @ObfuscatedName("gb.ae(Lfi;B)V")
    public void method2949(class155 arg0) {
        arg0.method2997(this.field1816, this.field1814);
    }
}
