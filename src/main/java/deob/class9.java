package deob;

@ObfuscatedName("ae")
public class class9 {

    @ObfuscatedName("ae.at")
    public final int field28;

    @ObfuscatedName("ae.an")
    public final int field29;

    @ObfuscatedName("ae.av")
    public final String field30;

    public class9(int arg0, int arg1, String arg2) {
        this.field28 = arg0;
        this.field29 = arg1;
        this.field30 = arg2;
    }

    public class9(class501 arg0) {
        this(arg0.method8129(), arg0.method8129(), arg0.method8253());
    }

    @ObfuscatedName("ae.at()Ljava/lang/String;")
    public String method54() {
        return Integer.toHexString(this.field28) + Integer.toHexString(this.field29) + this.field30;
    }

    @ObfuscatedName("ae.an()I")
    public int method60() {
        return this.field29;
    }
}
