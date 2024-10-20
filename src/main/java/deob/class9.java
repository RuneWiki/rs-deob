package deob;

@ObfuscatedName("e")
public class class9 {

    @ObfuscatedName("e.l")
    public final int field34;

    @ObfuscatedName("e.q")
    public final int field33;

    @ObfuscatedName("e.f")
    public final String field35;

    public class9(int arg0, int arg1, String arg2) {
        this.field34 = arg0;
        this.field33 = arg1;
        this.field35 = arg2;
    }

    public class9(class401 arg0) {
        this(arg0.method6272(), arg0.method6272(), arg0.method6474());
    }

    @ObfuscatedName("e.l()Ljava/lang/String;")
    public String method64() {
        return Integer.toHexString(this.field34) + Integer.toHexString(this.field33) + this.field35;
    }

    @ObfuscatedName("e.q()I")
    public int method65() {
        return this.field33;
    }
}
