package deob;

@ObfuscatedName("eo")
public class class146 extends class156 {

    // $FF: synthetic field
    public final class157 this$0;

    @ObfuscatedName("eo.f")
    public int field1685;

    @ObfuscatedName("eo.w")
    public byte field1688;

    @ObfuscatedName("eo.v")
    public int field1684;

    @ObfuscatedName("eo.s")
    public String field1687;

    public class146(class157 arg0) {
        this.this$0 = arg0;
        this.field1685 = -1;
    }

    @ObfuscatedName("eo.f(Lrd;B)V")
    public void method3007(class474 arg0) {
        this.field1685 = arg0.method8032();
        this.field1688 = arg0.method7965();
        this.field1684 = arg0.method8032();
        arg0.method8151();
        this.field1687 = arg0.method7983();
    }

    @ObfuscatedName("eo.w(Lfm;I)V")
    public void method3008(class160 arg0) {
        class142 var2 = (class142) arg0.field1794.get(this.field1685);
        var2.field1657 = this.field1688;
        var2.field1659 = this.field1684;
        var2.field1656 = new class497(this.field1687);
    }
}
