package deob;

@ObfuscatedName("z")
public class class21 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("z.f")
    public int field159;

    @ObfuscatedName("z.o")
    public byte field165;

    @ObfuscatedName("z.u")
    public int field164;

    @ObfuscatedName("z.p")
    public String field161;

    public class21(class20 arg0) {
        this.this$0 = arg0;
        this.field159 = -1;
    }

    @ObfuscatedName("z.f(Lnu;I)V")
    public void method62(class382 arg0) {
        this.field159 = arg0.method5858();
        this.field165 = arg0.method6045();
        this.field164 = arg0.method5858();
        arg0.method6069();
        this.field161 = arg0.method5865();
    }

    @ObfuscatedName("z.o(Lp;I)V")
    public void method61(class4 arg0) {
        class10 var2 = (class10) arg0.field28.get(this.field159);
        var2.field67 = this.field165;
        var2.field65 = this.field164;
        var2.field66 = this.field161;
    }
}
