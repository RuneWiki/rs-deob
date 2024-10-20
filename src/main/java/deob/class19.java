package deob;

@ObfuscatedName("m")
public class class19 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("m.v")
    public int field158;

    @ObfuscatedName("m.n")
    public boolean field151;

    public class19(class3 arg0) {
        this.this$0 = arg0;
        this.field158 = -1;
    }

    @ObfuscatedName("m.v(Lnd;I)V")
    public void method2(class383 arg0) {
        this.field158 = arg0.method5967();
        this.field151 = arg0.method5965() == 1;
    }

    @ObfuscatedName("m.n(Ll;B)V")
    public void method1(class12 arg0) {
        arg0.method82(this.field158, this.field151);
    }
}
