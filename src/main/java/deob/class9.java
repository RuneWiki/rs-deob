package deob;

@ObfuscatedName("d")
public class class9 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("d.v")
    public long field78;

    @ObfuscatedName("d.n")
    public String field72;

    public class9(class3 arg0) {
        this.this$0 = arg0;
        this.field78 = -1L;
        this.field72 = null;
    }

    @ObfuscatedName("d.v(Lnd;I)V")
    public void method2(class383 arg0) {
        if (arg0.method5965() != 255) {
            arg0.field4158--;
            this.field78 = arg0.method5971();
        }
        this.field72 = arg0.method6180();
    }

    @ObfuscatedName("d.n(Ll;B)V")
    public void method1(class12 arg0) {
        arg0.method75(this.field78, this.field72, 0);
    }
}
