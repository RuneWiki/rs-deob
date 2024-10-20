package deob;

@ObfuscatedName("js")
public class class283 {

    @ObfuscatedName("js.v")
    public final int field3650;

    @ObfuscatedName("js.n")
    public final long field3648;

    @ObfuscatedName("js.f")
    public final class284 field3649;

    @ObfuscatedName("js.y")
    public String field3647;

    @ObfuscatedName("js.p")
    public String field3651;

    public class283(class383 arg0, byte arg1, int arg2) {
        this.field3647 = arg0.method5974();
        this.field3651 = arg0.method5974();
        this.field3650 = arg0.method5967();
        this.field3648 = arg0.method5971();
        int var4 = arg0.method5970();
        int var5 = arg0.method5970();
        this.field3649 = new class284();
        this.field3649.method4636(2);
        this.field3649.method4646(arg1);
        this.field3649.field3659 = var4;
        this.field3649.field3657 = var5;
        this.field3649.field3654 = 0;
        this.field3649.field3658 = 0;
        this.field3649.field3655 = arg2;
    }

    @ObfuscatedName("js.v(B)Ljava/lang/String;")
    public String method4625() {
        return this.field3647;
    }

    @ObfuscatedName("js.n(I)Ljava/lang/String;")
    public String method4630() {
        return this.field3651;
    }
}
