package deob;

@ObfuscatedName("u")
public class class9 {

    @ObfuscatedName("u.h")
    public final int field31;

    @ObfuscatedName("u.e")
    public final int field30;

    @ObfuscatedName("u.v")
    public final String field32;

    public class9(int arg0, int arg1, String arg2) {
        this.field31 = arg0;
        this.field30 = arg1;
        this.field32 = arg2;
    }

    public class9(class467 arg0) {
        this(arg0.method7792(), arg0.method7792(), arg0.method7801());
    }

    @ObfuscatedName("u.h()Ljava/lang/String;")
    public String method56() {
        return Integer.toHexString(this.field31) + Integer.toHexString(this.field30) + this.field32;
    }

    @ObfuscatedName("u.e()I")
    public int method57() {
        return this.field30;
    }
}
