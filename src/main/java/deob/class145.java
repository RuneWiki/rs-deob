package deob;

@ObfuscatedName("en")
public class class145 extends class130 {

    // $FF: synthetic field
    public final class133 this$0;

    @ObfuscatedName("en.c")
    public long field1676;

    @ObfuscatedName("en.p")
    public String field1672;

    @ObfuscatedName("en.f")
    public int field1673;

    public class145(class133 arg0) {
        this.this$0 = arg0;
        this.field1676 = -1L;
        this.field1672 = null;
        this.field1673 = 0;
    }

    @ObfuscatedName("en.c(Lqq;B)V")
    public void method2833(class445 arg0) {
        if (arg0.method7196() != 255) {
            arg0.field4735--;
            this.field1676 = arg0.method7319();
        }
        this.field1672 = arg0.method7205();
        this.field1673 = arg0.method7198();
    }

    @ObfuscatedName("en.p(Led;I)V")
    public void method2837(class141 arg0) {
        arg0.method2887(this.field1676, this.field1672, this.field1673);
    }
}
