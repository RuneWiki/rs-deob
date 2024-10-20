package deob;

@ObfuscatedName("et")
public class class142 extends class152 {

    // $FF: synthetic field
    public final class153 this$0;

    @ObfuscatedName("et.a")
    public int field1632;

    @ObfuscatedName("et.f")
    public byte field1631;

    @ObfuscatedName("et.c")
    public int field1635;

    @ObfuscatedName("et.x")
    public String field1634;

    public class142(class153 arg0) {
        this.this$0 = arg0;
        this.field1632 = -1;
    }

    @ObfuscatedName("et.a(Lqr;B)V")
    public void method2858(class464 arg0) {
        this.field1632 = arg0.method7716();
        this.field1631 = arg0.method7881();
        this.field1635 = arg0.method7716();
        arg0.method7721();
        this.field1634 = arg0.method7725();
    }

    @ObfuscatedName("et.f(Leq;I)V")
    public void method2859(class156 arg0) {
        class138 var2 = (class138) arg0.field1728.get(this.field1632);
        var2.field1598 = this.field1631;
        var2.field1591 = this.field1635;
        var2.field1596 = new class486(this.field1634);
    }
}
