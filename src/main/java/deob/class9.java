package deob;

@ObfuscatedName("y")
public class class9 {

    @ObfuscatedName("y.c")
    public final int field28;

    @ObfuscatedName("y.v")
    public final int field27;

    @ObfuscatedName("y.q")
    public final String field29;

    public class9(int arg0, int arg1, String arg2) {
        this.field28 = arg0;
        this.field27 = arg1;
        this.field29 = arg2;
    }

    public class9(class443 arg0) {
        this(arg0.method7047(), arg0.method7047(), arg0.method7057());
    }

    @ObfuscatedName("y.c()Ljava/lang/String;")
    public String method55() {
        return Integer.toHexString(this.field28) + Integer.toHexString(this.field27) + this.field29;
    }

    @ObfuscatedName("y.v()I")
    public int method53() {
        return this.field27;
    }
}
