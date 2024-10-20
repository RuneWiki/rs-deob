package deob;

@ObfuscatedName("fz")
public class class145 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("fz.au")
    public int field1673;

    @ObfuscatedName("fz.ae")
    public boolean field1671;

    public class145(class147 arg0) {
        this.this$0 = arg0;
        this.field1673 = -1;
    }

    @ObfuscatedName("fz.au(Ltm;I)V")
    public void method2950(class515 arg0) {
        this.field1673 = arg0.method8448();
        this.field1671 = arg0.method8300() == 1;
    }

    @ObfuscatedName("fz.ae(Lfi;B)V")
    public void method2949(class155 arg0) {
        arg0.method3042(this.field1673, this.field1671);
    }
}
