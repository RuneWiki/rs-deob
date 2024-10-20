package deob;

@ObfuscatedName("ac")
public class class9 {

    @ObfuscatedName("ac.ak")
    public final int field28;

    @ObfuscatedName("ac.al")
    public final int field27;

    @ObfuscatedName("ac.aj")
    public final String field26;

    public class9(int arg0, int arg1, String arg2) {
        this.field28 = arg0;
        this.field27 = arg1;
        this.field26 = arg2;
    }

    public class9(class546 arg0) {
        this(arg0.method8796(), arg0.method8796(), arg0.method8806());
    }

    @ObfuscatedName("ac.ak()Ljava/lang/String;")
    public String method58() {
        return Integer.toHexString(this.field28) + Integer.toHexString(this.field27) + this.field26;
    }

    @ObfuscatedName("ac.al()I")
    public int method61() {
        return this.field27;
    }
}
