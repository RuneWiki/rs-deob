package deob;

@ObfuscatedName("q")
public class class19 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("q.f")
    public int field145;

    @ObfuscatedName("q.e")
    public boolean field146;

    public class19(class3 arg0) {
        this.this$0 = arg0;
        this.field145 = -1;
    }

    @ObfuscatedName("q.f(Lnt;I)V")
    public void method11(class384 arg0) {
        this.field145 = arg0.method5899();
        this.field146 = arg0.method5902() == 1;
    }

    @ObfuscatedName("q.e(Lb;I)V")
    public void method3(class12 arg0) {
        arg0.method84(this.field145, this.field146);
    }
}
