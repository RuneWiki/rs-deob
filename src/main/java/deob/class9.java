package deob;

@ObfuscatedName("l")
public class class9 {

    @ObfuscatedName("l.f")
    public final int field30;

    @ObfuscatedName("l.w")
    public final int field29;

    @ObfuscatedName("l.v")
    public final String field31;

    public class9(int arg0, int arg1, String arg2) {
        this.field30 = arg0;
        this.field29 = arg1;
        this.field31 = arg2;
    }

    public class9(class474 arg0) {
        this(arg0.method7964(), arg0.method7964(), arg0.method7983());
    }

    @ObfuscatedName("l.f()Ljava/lang/String;")
    public String method69() {
        return Integer.toHexString(this.field30) + Integer.toHexString(this.field29) + this.field31;
    }

    @ObfuscatedName("l.w()I")
    public int method70() {
        return this.field29;
    }
}
