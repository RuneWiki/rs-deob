package deob;

@ObfuscatedName("j")
public class class9 {

    @ObfuscatedName("j.i")
    public final int field24;

    @ObfuscatedName("j.w")
    public final int field25;

    @ObfuscatedName("j.s")
    public final String field26;

    public class9(int arg0, int arg1, String arg2) {
        this.field24 = arg0;
        this.field25 = arg1;
        this.field26 = arg2;
    }

    public class9(class401 arg0) {
        this(arg0.method6240(), arg0.method6240(), arg0.method6335());
    }

    @ObfuscatedName("j.i()Ljava/lang/String;")
    public String method56() {
        return Integer.toHexString(this.field24) + Integer.toHexString(this.field25) + this.field26;
    }

    @ObfuscatedName("j.w()I")
    public int method60() {
        return this.field25;
    }
}
