package deob;

@ObfuscatedName("y")
public class class26 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("y.f")
    public int field200;

    @ObfuscatedName("y.o")
    public byte field194;

    @ObfuscatedName("y.u")
    public int field193;

    @ObfuscatedName("y.p")
    public String field196;

    public class26(class20 arg0) {
        this.this$0 = arg0;
        this.field200 = -1;
    }

    @ObfuscatedName("y.f(Lnu;I)V")
    public void method62(class382 arg0) {
        arg0.method5856();
        this.field200 = arg0.method5858();
        this.field194 = arg0.method6045();
        this.field193 = arg0.method5858();
        arg0.method6069();
        this.field196 = arg0.method5865();
        arg0.method5856();
    }

    @ObfuscatedName("y.o(Lp;I)V")
    public void method61(class4 arg0) {
        class10 var2 = (class10) arg0.field28.get(this.field200);
        var2.field67 = this.field194;
        var2.field65 = this.field193;
        var2.field66 = this.field196;
    }
}
