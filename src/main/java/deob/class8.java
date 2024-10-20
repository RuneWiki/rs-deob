package deob;

@ObfuscatedName("b")
public class class8 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("b.v")
    public String field65;

    @ObfuscatedName("b.n")
    public byte field66;

    @ObfuscatedName("b.f")
    public byte field67;

    public class8(class20 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("b.v(Lnd;I)V")
    public void method50(class383 arg0) {
        this.field65 = arg0.method6180();
        if (this.field65 != null) {
            arg0.method5965();
            this.field66 = arg0.method5966();
            this.field67 = arg0.method5966();
        }
    }

    @ObfuscatedName("b.n(Ly;I)V")
    public void method44(class4 arg0) {
        arg0.field32 = this.field65;
        if (this.field65 != null) {
            arg0.field33 = this.field66;
            arg0.field27 = this.field67;
        }
    }
}
