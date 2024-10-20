package deob;

@ObfuscatedName("c")
public class class14 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("c.v")
    public long field130;

    @ObfuscatedName("c.n")
    public String field129;

    public class14(class3 arg0) {
        this.this$0 = arg0;
        this.field130 = -1L;
        this.field129 = null;
    }

    @ObfuscatedName("c.v(Lnd;I)V")
    public void method2(class383 arg0) {
        if (arg0.method5965() != 255) {
            arg0.field4158--;
            this.field130 = arg0.method5971();
        }
        this.field129 = arg0.method6180();
    }

    @ObfuscatedName("c.n(Ll;B)V")
    public void method1(class12 arg0) {
        arg0.method78(this.field130, this.field129);
    }
}
