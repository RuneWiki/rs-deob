package deob;

@ObfuscatedName("am")
public class class9 {

    @ObfuscatedName("am.ap")
    public final int field23;

    @ObfuscatedName("am.aw")
    public final int field24;

    @ObfuscatedName("am.ak")
    public final String field25;

    public class9(int arg0, int arg1, String arg2) {
        this.field23 = arg0;
        this.field24 = arg1;
        this.field25 = arg2;
    }

    public class9(class558 arg0) {
        this(arg0.method9258(), arg0.method9258(), arg0.method9269());
    }

    @ObfuscatedName("am.ap()Ljava/lang/String;")
    public String method59() {
        return Integer.toHexString(this.field23) + Integer.toHexString(this.field24) + this.field25;
    }

    @ObfuscatedName("am.aw()I")
    public int method60() {
        return this.field24;
    }
}
