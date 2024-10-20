package deob;

@ObfuscatedName("u")
public class class18 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("u.f")
    public boolean field141;

    @ObfuscatedName("u.e")
    public byte field137;

    @ObfuscatedName("u.v")
    public byte field138;

    @ObfuscatedName("u.y")
    public byte field136;

    @ObfuscatedName("u.j")
    public byte field140;

    public class18(class3 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("u.f(Lnt;I)V")
    public void method11(class384 arg0) {
        this.field141 = arg0.method5902() == 1;
        this.field137 = arg0.method5968();
        this.field138 = arg0.method5968();
        this.field136 = arg0.method5968();
        this.field140 = arg0.method5968();
    }

    @ObfuscatedName("u.e(Lb;I)V")
    public void method3(class12 arg0) {
        arg0.field87 = this.field141;
        arg0.field88 = this.field137;
        arg0.field89 = this.field138;
        arg0.field94 = this.field136;
        arg0.field91 = this.field140;
    }
}
