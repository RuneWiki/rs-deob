package deob;

@ObfuscatedName("ed")
public class class148 extends class152 {

    // $FF: synthetic field
    public final class153 this$0;

    @ObfuscatedName("ed.a")
    public String field1688;

    @ObfuscatedName("ed.f")
    public int field1689;

    @ObfuscatedName("ed.c")
    public byte field1694;

    public class148(class153 arg0) {
        this.this$0 = arg0;
        this.field1688 = null;
    }

    @ObfuscatedName("ed.a(Lqr;B)V")
    public void method2858(class464 arg0) {
        if (arg0.method7735() != 255) {
            arg0.field4864--;
            arg0.method7721();
        }
        this.field1688 = arg0.method7899();
        this.field1689 = arg0.method7716();
        this.field1694 = arg0.method7881();
        arg0.method7721();
    }

    @ObfuscatedName("ed.f(Leq;I)V")
    public void method2859(class156 arg0) {
        class138 var2 = new class138();
        var2.field1596 = new class486(this.field1688);
        var2.field1591 = this.field1689;
        var2.field1598 = this.field1694;
        arg0.method2967(var2);
    }
}
