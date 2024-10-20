package deob;

@ObfuscatedName("z")
public class class21 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("z.v")
    public int field179;

    @ObfuscatedName("z.n")
    public byte field173;

    @ObfuscatedName("z.f")
    public int field174;

    @ObfuscatedName("z.y")
    public String field175;

    public class21(class20 arg0) {
        this.this$0 = arg0;
        this.field179 = -1;
    }

    @ObfuscatedName("z.v(Lnd;I)V")
    public void method50(class383 arg0) {
        this.field179 = arg0.method5967();
        this.field173 = arg0.method5966();
        this.field174 = arg0.method5967();
        arg0.method5971();
        this.field175 = arg0.method5974();
    }

    @ObfuscatedName("z.n(Ly;I)V")
    public void method44(class4 arg0) {
        class10 var2 = (class10) arg0.field29.get(this.field179);
        var2.field84 = this.field173;
        var2.field80 = this.field174;
        var2.field85 = this.field175;
    }
}
