package deob;

@ObfuscatedName("aj")
public class class37 {

    @ObfuscatedName("aj.v")
    public final int field272;

    @ObfuscatedName("aj.n")
    public final int field273;

    @ObfuscatedName("aj.f")
    public final String field271;

    public class37(int arg0, int arg1, String arg2) {
        this.field272 = arg0;
        this.field273 = arg1;
        this.field271 = arg2;
    }

    public class37(class383 arg0) {
        this(arg0.method5965(), arg0.method5965(), arg0.method5974());
    }

    @ObfuscatedName("aj.v()Ljava/lang/String;")
    public String method246() {
        return Integer.toHexString(this.field272) + Integer.toHexString(this.field273) + this.field271;
    }

    @ObfuscatedName("aj.n()I")
    public int method247() {
        return this.field273;
    }
}
