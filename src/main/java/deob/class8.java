package deob;

@ObfuscatedName("g")
public class class8 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("g.f")
    public String field54;

    @ObfuscatedName("g.o")
    public byte field55;

    @ObfuscatedName("g.u")
    public byte field56;

    public class8(class20 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("g.f(Lnu;I)V")
    public void method62(class382 arg0) {
        this.field54 = arg0.method5837();
        if (this.field54 != null) {
            arg0.method5856();
            this.field55 = arg0.method6045();
            this.field56 = arg0.method6045();
        }
    }

    @ObfuscatedName("g.o(Lp;I)V")
    public void method61(class4 arg0) {
        arg0.field26 = this.field54;
        if (this.field54 != null) {
            arg0.field32 = this.field55;
            arg0.field31 = this.field56;
        }
    }
}
