package deob;

@ObfuscatedName("o")
public class class9 {

    @ObfuscatedName("o.s")
    public final int field33;

    @ObfuscatedName("o.h")
    public final int field34;

    @ObfuscatedName("o.w")
    public final String field35;

    public class9(int arg0, int arg1, String arg2) {
        this.field33 = arg0;
        this.field34 = arg1;
        this.field35 = arg2;
    }

    public class9(class444 arg0) {
        this(arg0.method6929(), arg0.method6929(), arg0.method6975());
    }

    @ObfuscatedName("o.s()Ljava/lang/String;")
    public String method59() {
        return Integer.toHexString(this.field33) + Integer.toHexString(this.field34) + this.field35;
    }

    @ObfuscatedName("o.h()I")
    public int method60() {
        return this.field34;
    }
}
