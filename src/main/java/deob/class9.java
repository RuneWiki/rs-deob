package deob;

@ObfuscatedName("am")
public class class9 {

    @ObfuscatedName("am.ac")
    public final int field30;

    @ObfuscatedName("am.al")
    public final int field31;

    @ObfuscatedName("am.ak")
    public final String field29;

    public class9(int arg0, int arg1, String arg2) {
        this.field30 = arg0;
        this.field31 = arg1;
        this.field29 = arg2;
    }

    public class9(class530 arg0) {
        this(arg0.method8365(), arg0.method8365(), arg0.method8588());
    }

    @ObfuscatedName("am.ac()Ljava/lang/String;")
    public String method58() {
        return Integer.toHexString(this.field30) + Integer.toHexString(this.field31) + this.field29;
    }

    @ObfuscatedName("am.al()I")
    public int method63() {
        return this.field31;
    }
}
