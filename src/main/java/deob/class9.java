package deob;

@ObfuscatedName("n")
public class class9 {

    @ObfuscatedName("n.a")
    public final int field37;

    @ObfuscatedName("n.f")
    public final int field36;

    @ObfuscatedName("n.c")
    public final String field38;

    public class9(int arg0, int arg1, String arg2) {
        this.field37 = arg0;
        this.field36 = arg1;
        this.field38 = arg2;
    }

    public class9(class464 arg0) {
        this(arg0.method7735(), arg0.method7735(), arg0.method7725());
    }

    @ObfuscatedName("n.a()Ljava/lang/String;")
    public String method49() {
        return Integer.toHexString(this.field37) + Integer.toHexString(this.field36) + this.field38;
    }

    @ObfuscatedName("n.f()I")
    public int method51() {
        return this.field36;
    }
}
