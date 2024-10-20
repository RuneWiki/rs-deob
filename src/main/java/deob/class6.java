package deob;

@ObfuscatedName("j")
public class class6 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("j.v")
    public int field57;

    public class6(class20 arg0) {
        this.this$0 = arg0;
        this.field57 = -1;
    }

    @ObfuscatedName("j.v(Lnd;I)V")
    public void method50(class383 arg0) {
        this.field57 = arg0.method5967();
        arg0.method5965();
        if (arg0.method5965() != 255) {
            arg0.field4158--;
            arg0.method5971();
        }
    }

    @ObfuscatedName("j.n(Ly;I)V")
    public void method44(class4 arg0) {
        arg0.method22(this.field57);
    }
}
