package deob;

@ObfuscatedName("l")
public class class24 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("l.f")
    public int field191;

    @ObfuscatedName("l.e")
    public byte field190;

    public class24(class3 arg0) {
        this.this$0 = arg0;
        this.field191 = -1;
    }

    @ObfuscatedName("l.f(Lnt;I)V")
    public void method11(class384 arg0) {
        this.field191 = arg0.method5899();
        this.field190 = arg0.method5968();
    }

    @ObfuscatedName("l.e(Lb;I)V")
    public void method3(class12 arg0) {
        arg0.method82(this.field191, this.field190);
    }
}
