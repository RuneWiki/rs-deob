package deob;

@ObfuscatedName("ey")
public class class142 extends class146 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("ey.c")
    public String field1655;

    @ObfuscatedName("ey.p")
    public int field1658;

    @ObfuscatedName("ey.f")
    public byte field1657;

    public class142(class147 arg0) {
        this.this$0 = arg0;
        this.field1655 = null;
    }

    @ObfuscatedName("ey.c(Lqq;I)V")
    public void method2862(class445 arg0) {
        if (arg0.method7196() != 255) {
            arg0.field4735--;
            arg0.method7319();
        }
        this.field1655 = arg0.method7205();
        this.field1658 = arg0.method7198();
        this.field1657 = arg0.method7197();
        arg0.method7319();
    }

    @ObfuscatedName("ey.p(Ler;B)V")
    public void method2863(class150 arg0) {
        class132 var2 = new class132();
        var2.field1572 = new class466(this.field1655);
        var2.field1571 = this.field1658;
        var2.field1575 = this.field1657;
        arg0.method2967(var2);
    }
}
