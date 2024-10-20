package deob;

@ObfuscatedName("jt")
public class class284 {

    @ObfuscatedName("jt.f")
    public final int field3649;

    @ObfuscatedName("jt.e")
    public final long field3648;

    @ObfuscatedName("jt.v")
    public final class285 field3651;

    @ObfuscatedName("jt.y")
    public String field3650;

    @ObfuscatedName("jt.j")
    public String field3652;

    public class284(class384 arg0, byte arg1, int arg2) {
        this.field3650 = arg0.method5906();
        this.field3652 = arg0.method5906();
        this.field3649 = arg0.method5899();
        this.field3648 = arg0.method5896();
        int var4 = arg0.method5965();
        int var5 = arg0.method5965();
        this.field3651 = new class285();
        this.field3651.method4650(2);
        this.field3651.method4655(arg1);
        this.field3651.field3656 = var4;
        this.field3651.field3657 = var5;
        this.field3651.field3658 = 0;
        this.field3651.field3659 = 0;
        this.field3651.field3660 = arg2;
    }

    @ObfuscatedName("jt.f(I)Ljava/lang/String;")
    public String method4639() {
        return this.field3650;
    }

    @ObfuscatedName("jt.e(B)Ljava/lang/String;")
    public String method4641() {
        return this.field3652;
    }
}
