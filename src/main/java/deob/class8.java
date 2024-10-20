package deob;

@ObfuscatedName("r")
public class class8 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("r.f")
    public String field53;

    @ObfuscatedName("r.e")
    public byte field56;

    @ObfuscatedName("r.v")
    public byte field54;

    public class8(class20 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("r.f(Lnt;I)V")
    public void method53(class384 arg0) {
        this.field53 = arg0.method5940();
        if (this.field53 != null) {
            arg0.method5902();
            this.field56 = arg0.method5968();
            this.field54 = arg0.method5968();
        }
    }

    @ObfuscatedName("r.e(Ly;I)V")
    public void method51(class4 arg0) {
        arg0.field25 = this.field53;
        if (this.field53 != null) {
            arg0.field28 = this.field56;
            arg0.field29 = this.field54;
        }
    }
}
