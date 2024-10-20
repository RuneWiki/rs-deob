package deob;

@ObfuscatedName("ae")
public class class9 {

    @ObfuscatedName("ae.am")
    public final int field17;

    @ObfuscatedName("ae.ap")
    public final int field18;

    @ObfuscatedName("ae.af")
    public final String field16;

    public class9(int arg0, int arg1, String arg2) {
        this.field17 = arg0;
        this.field18 = arg1;
        this.field16 = arg2;
    }

    public class9(class531 arg0) {
        this(arg0.method8561(), arg0.method8561(), arg0.method8641());
    }

    @ObfuscatedName("ae.am()Ljava/lang/String;")
    public String method57() {
        return Integer.toHexString(this.field17) + Integer.toHexString(this.field18) + this.field16;
    }

    @ObfuscatedName("ae.ap()I")
    public int method58() {
        return this.field18;
    }
}
