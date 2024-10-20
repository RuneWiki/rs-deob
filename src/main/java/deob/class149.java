package deob;

@ObfuscatedName("ez")
public class class149 extends class152 {

    // $FF: synthetic field
    public final class153 this$0;

    @ObfuscatedName("ez.a")
    public int field1698;

    @ObfuscatedName("ez.f")
    public byte field1696;

    @ObfuscatedName("ez.c")
    public int field1697;

    @ObfuscatedName("ez.x")
    public String field1695;

    public class149(class153 arg0) {
        this.this$0 = arg0;
        this.field1698 = -1;
    }

    @ObfuscatedName("ez.a(Lqr;B)V")
    public void method2858(class464 arg0) {
        arg0.method7735();
        this.field1698 = arg0.method7716();
        this.field1696 = arg0.method7881();
        this.field1697 = arg0.method7716();
        arg0.method7721();
        this.field1695 = arg0.method7725();
        arg0.method7735();
    }

    @ObfuscatedName("ez.f(Leq;I)V")
    public void method2859(class156 arg0) {
        class138 var2 = (class138) arg0.field1728.get(this.field1698);
        var2.field1598 = this.field1696;
        var2.field1591 = this.field1697;
        var2.field1596 = new class486(this.field1695);
    }
}
