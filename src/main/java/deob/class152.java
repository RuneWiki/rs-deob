package deob;

@ObfuscatedName("ec")
public class class152 extends class130 {

    // $FF: synthetic field
    public final class133 this$0;

    @ObfuscatedName("ec.c")
    public long field1719;

    @ObfuscatedName("ec.p")
    public String field1718;

    public class152(class133 arg0) {
        this.this$0 = arg0;
        this.field1719 = -1L;
        this.field1718 = null;
    }

    @ObfuscatedName("ec.c(Lqq;B)V")
    public void method2833(class445 arg0) {
        if (arg0.method7196() != 255) {
            arg0.field4735--;
            this.field1719 = arg0.method7319();
        }
        this.field1718 = arg0.method7205();
    }

    @ObfuscatedName("ec.p(Led;I)V")
    public void method2837(class141 arg0) {
        arg0.method2880(this.field1719, this.field1718);
    }
}
