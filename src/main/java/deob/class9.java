package deob;

@ObfuscatedName("al")
public class class9 {

    @ObfuscatedName("al.at")
    public final int field30;

    @ObfuscatedName("al.ah")
    public final int field29;

    @ObfuscatedName("al.ar")
    public final String field28;

    public class9(int arg0, int arg1, String arg2) {
        this.field30 = arg0;
        this.field29 = arg1;
        this.field28 = arg2;
    }

    public class9(class527 arg0) {
        this(arg0.method8410(), arg0.method8410(), arg0.method8535());
    }

    @ObfuscatedName("al.at()Ljava/lang/String;")
    public String method67() {
        return Integer.toHexString(this.field30) + Integer.toHexString(this.field29) + this.field28;
    }

    @ObfuscatedName("al.ah()I")
    public int method62() {
        return this.field29;
    }
}
