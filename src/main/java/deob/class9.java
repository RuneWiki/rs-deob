package deob;

@ObfuscatedName("ap")
public class class9 {

    @ObfuscatedName("ap.aj")
    public final int field31;

    @ObfuscatedName("ap.al")
    public final int field30;

    @ObfuscatedName("ap.ac")
    public final String field32;

    public class9(int arg0, int arg1, String arg2) {
        this.field31 = arg0;
        this.field30 = arg1;
        this.field32 = arg2;
    }

    public class9(class478 arg0) {
        this(arg0.method7909(), arg0.method7909(), arg0.method7950());
    }

    @ObfuscatedName("ap.aj()Ljava/lang/String;")
    public String method55() {
        return Integer.toHexString(this.field31) + Integer.toHexString(this.field30) + this.field32;
    }

    @ObfuscatedName("ap.al()I")
    public int method56() {
        return this.field30;
    }
}
