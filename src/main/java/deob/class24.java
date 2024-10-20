package deob;

@ObfuscatedName("h")
public class class24 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("h.v")
    public int field200;

    @ObfuscatedName("h.n")
    public byte field199;

    public class24(class3 arg0) {
        this.this$0 = arg0;
        this.field200 = -1;
    }

    @ObfuscatedName("h.v(Lnd;I)V")
    public void method2(class383 arg0) {
        this.field200 = arg0.method5967();
        this.field199 = arg0.method5966();
    }

    @ObfuscatedName("h.n(Ll;B)V")
    public void method1(class12 arg0) {
        arg0.method84(this.field200, this.field199);
    }
}
