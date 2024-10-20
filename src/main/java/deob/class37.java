package deob;

@ObfuscatedName("ae")
public class class37 {

    @ObfuscatedName("ae.f")
    public final int field251;

    @ObfuscatedName("ae.e")
    public final int field250;

    @ObfuscatedName("ae.v")
    public final String field249;

    public class37(int arg0, int arg1, String arg2) {
        this.field251 = arg0;
        this.field250 = arg1;
        this.field249 = arg2;
    }

    public class37(class384 arg0) {
        this(arg0.method5902(), arg0.method5902(), arg0.method5906());
    }

    @ObfuscatedName("ae.f()Ljava/lang/String;")
    public String method262() {
        return Integer.toHexString(this.field251) + Integer.toHexString(this.field250) + this.field249;
    }

    @ObfuscatedName("ae.e()I")
    public int method267() {
        return this.field250;
    }
}
