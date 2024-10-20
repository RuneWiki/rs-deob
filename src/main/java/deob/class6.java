package deob;

@ObfuscatedName("o")
public class class6 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("o.f")
    public int field44;

    public class6(class20 arg0) {
        this.this$0 = arg0;
        this.field44 = -1;
    }

    @ObfuscatedName("o.f(Lnt;I)V")
    public void method53(class384 arg0) {
        this.field44 = arg0.method5899();
        arg0.method5902();
        if (arg0.method5902() != 255) {
            arg0.field4161--;
            arg0.method5896();
        }
    }

    @ObfuscatedName("o.e(Ly;I)V")
    public void method51(class4 arg0) {
        arg0.method28(this.field44);
    }
}
