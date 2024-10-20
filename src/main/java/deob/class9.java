package deob;

@ObfuscatedName("aa")
public class class9 {

    @ObfuscatedName("aa.au")
    public final int field28;

    @ObfuscatedName("aa.ae")
    public final int field29;

    @ObfuscatedName("aa.ao")
    public final String field30;

    public class9(int arg0, int arg1, String arg2) {
        this.field28 = arg0;
        this.field29 = arg1;
        this.field30 = arg2;
    }

    public class9(class515 arg0) {
        this(arg0.method8300(), arg0.method8300(), arg0.method8311());
    }

    @ObfuscatedName("aa.au()Ljava/lang/String;")
    public String method53() {
        return Integer.toHexString(this.field28) + Integer.toHexString(this.field29) + this.field30;
    }

    @ObfuscatedName("aa.ae()I")
    public int method51() {
        return this.field29;
    }
}
