package deob;

@ObfuscatedName("p")
public class class21 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("p.f")
    public int field163;

    @ObfuscatedName("p.e")
    public byte field164;

    @ObfuscatedName("p.v")
    public int field162;

    @ObfuscatedName("p.y")
    public String field165;

    public class21(class20 arg0) {
        this.this$0 = arg0;
        this.field163 = -1;
    }

    @ObfuscatedName("p.f(Lnt;I)V")
    public void method53(class384 arg0) {
        this.field163 = arg0.method5899();
        this.field164 = arg0.method5968();
        this.field162 = arg0.method5899();
        arg0.method5896();
        this.field165 = arg0.method5906();
    }

    @ObfuscatedName("p.e(Ly;I)V")
    public void method51(class4 arg0) {
        class10 var2 = (class10) arg0.field24.get(this.field163);
        var2.field71 = this.field164;
        var2.field65 = this.field162;
        var2.field67 = this.field165;
    }
}
