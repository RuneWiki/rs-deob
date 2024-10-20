package deob;

@ObfuscatedName("n")
public class class9 {

    @ObfuscatedName("n.c")
    public final int field34;

    @ObfuscatedName("n.b")
    public final int field33;

    @ObfuscatedName("n.p")
    public final String field35;

    public class9(int arg0, int arg1, String arg2) {
        this.field34 = arg0;
        this.field33 = arg1;
        this.field35 = arg2;
    }

    public class9(class419 arg0) {
        this(arg0.method6781(), arg0.method6781(), arg0.method6707());
    }

    @ObfuscatedName("n.c()Ljava/lang/String;")
    public String method73() {
        return Integer.toHexString(this.field34) + Integer.toHexString(this.field33) + this.field35;
    }

    @ObfuscatedName("n.b()I")
    public int method75() {
        return this.field33;
    }
}
