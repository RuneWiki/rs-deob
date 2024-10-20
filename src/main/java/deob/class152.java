package deob;

@ObfuscatedName("fm")
public class class152 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("fm.au")
    public int field1713;

    public class152(class161 arg0) {
        this.this$0 = arg0;
        this.field1713 = -1;
    }

    @ObfuscatedName("fm.au(Ltm;B)V")
    public void method2976(class515 arg0) {
        this.field1713 = arg0.method8448();
        arg0.method8300();
        if (arg0.method8300() != 255) {
            arg0.field5111--;
            arg0.method8307();
        }
    }

    @ObfuscatedName("fm.ae(Lgo;I)V")
    public void method2975(class164 arg0) {
        arg0.method3074(this.field1713);
    }
}
