package deob;

@ObfuscatedName("ez")
public class class138 extends class146 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("ez.c")
    public int field1618;

    public class138(class147 arg0) {
        this.this$0 = arg0;
        this.field1618 = -1;
    }

    @ObfuscatedName("ez.c(Lqq;I)V")
    public void method2862(class445 arg0) {
        this.field1618 = arg0.method7198();
        arg0.method7196();
        if (arg0.method7196() != 255) {
            arg0.field4735--;
            arg0.method7319();
        }
    }

    @ObfuscatedName("ez.p(Ler;B)V")
    public void method2863(class150 arg0) {
        arg0.method2987(this.field1618);
    }
}
