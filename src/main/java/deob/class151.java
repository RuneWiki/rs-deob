package deob;

@ObfuscatedName("fx")
public class class151 extends class159 {

    // $FF: synthetic field
    public final class160 this$0;

    @ObfuscatedName("fx.at")
    public int field1672;

    public class151(class160 arg0) {
        this.this$0 = arg0;
        this.field1672 = -1;
    }

    @ObfuscatedName("fx.at(Ltz;I)V")
    public void method2959(class501 arg0) {
        this.field1672 = arg0.method8195();
        arg0.method8129();
        if (arg0.method8129() != 255) {
            arg0.field5017--;
            arg0.method8135();
        }
    }

    @ObfuscatedName("fx.an(Lgv;I)V")
    public void method2960(class163 arg0) {
        arg0.method3066(this.field1672);
    }
}
