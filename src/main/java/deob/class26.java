package deob;

@ObfuscatedName("a")
public class class26 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("a.f")
    public int field199;

    @ObfuscatedName("a.e")
    public byte field201;

    @ObfuscatedName("a.v")
    public int field200;

    @ObfuscatedName("a.y")
    public String field198;

    public class26(class20 arg0) {
        this.this$0 = arg0;
        this.field199 = -1;
    }

    @ObfuscatedName("a.f(Lnt;I)V")
    public void method53(class384 arg0) {
        arg0.method5902();
        this.field199 = arg0.method5899();
        this.field201 = arg0.method5968();
        this.field200 = arg0.method5899();
        arg0.method5896();
        this.field198 = arg0.method5906();
        arg0.method5902();
    }

    @ObfuscatedName("a.e(Ly;I)V")
    public void method51(class4 arg0) {
        class10 var2 = (class10) arg0.field24.get(this.field199);
        var2.field71 = this.field201;
        var2.field65 = this.field200;
        var2.field67 = this.field198;
    }
}
