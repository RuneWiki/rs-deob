package deob;

@ObfuscatedName("as")
public class class37 {

    @ObfuscatedName("as.f")
    public final int field243;

    @ObfuscatedName("as.o")
    public final int field244;

    @ObfuscatedName("as.u")
    public final String field245;

    public class37(int arg0, int arg1, String arg2) {
        this.field243 = arg0;
        this.field244 = arg1;
        this.field245 = arg2;
    }

    public class37(class382 arg0) {
        this(arg0.method5856(), arg0.method5856(), arg0.method5865());
    }

    @ObfuscatedName("as.f()Ljava/lang/String;")
    public String method261() {
        return Integer.toHexString(this.field243) + Integer.toHexString(this.field244) + this.field245;
    }

    @ObfuscatedName("as.o()I")
    public int method260() {
        return this.field244;
    }
}
