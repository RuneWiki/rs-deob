package deob;

@ObfuscatedName("at")
public class class9 {

    @ObfuscatedName("at.af")
    public final int field33;

    @ObfuscatedName("at.an")
    public final int field32;

    @ObfuscatedName("at.aw")
    public final String field34;

    public class9(int arg0, int arg1, String arg2) {
        this.field33 = arg0;
        this.field32 = arg1;
        this.field34 = arg2;
    }

    public class9(class489 arg0) {
        this(arg0.method8248(), arg0.method8248(), arg0.method8259());
    }

    @ObfuscatedName("at.af()Ljava/lang/String;")
    public String method66() {
        return Integer.toHexString(this.field33) + Integer.toHexString(this.field32) + this.field34;
    }

    @ObfuscatedName("at.an()I")
    public int method62() {
        return this.field32;
    }
}
