package deob;

@ObfuscatedName("i")
public class class26 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("i.v")
    public int field214;

    @ObfuscatedName("i.n")
    public byte field211;

    @ObfuscatedName("i.f")
    public int field215;

    @ObfuscatedName("i.y")
    public String field213;

    public class26(class20 arg0) {
        this.this$0 = arg0;
        this.field214 = -1;
    }

    @ObfuscatedName("i.v(Lnd;I)V")
    public void method50(class383 arg0) {
        arg0.method5965();
        this.field214 = arg0.method5967();
        this.field211 = arg0.method5966();
        this.field215 = arg0.method5967();
        arg0.method5971();
        this.field213 = arg0.method5974();
        arg0.method5965();
    }

    @ObfuscatedName("i.n(Ly;I)V")
    public void method44(class4 arg0) {
        class10 var2 = (class10) arg0.field29.get(this.field214);
        var2.field84 = this.field211;
        var2.field80 = this.field215;
        var2.field85 = this.field213;
    }
}
