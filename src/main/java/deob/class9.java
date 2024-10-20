package deob;

@ObfuscatedName("ad")
public class class9 {

    @ObfuscatedName("ad.az")
    public final int field27;

    @ObfuscatedName("ad.ah")
    public final int field26;

    @ObfuscatedName("ad.af")
    public final String field25;

    public class9(int arg0, int arg1, String arg2) {
        this.field27 = arg0;
        this.field26 = arg1;
        this.field25 = arg2;
    }

    public class9(class535 arg0) {
        this(arg0.method8462(), arg0.method8462(), arg0.method8473());
    }

    @ObfuscatedName("ad.az()Ljava/lang/String;")
    public String method60() {
        return Integer.toHexString(this.field27) + Integer.toHexString(this.field26) + this.field25;
    }

    @ObfuscatedName("ad.ah()I")
    public int method61() {
        return this.field26;
    }
}
