package deob;

@ObfuscatedName("ab")
public class class9 {

    @ObfuscatedName("ab.aq")
    public final int field31;

    @ObfuscatedName("ab.ad")
    public final int field32;

    @ObfuscatedName("ab.ag")
    public final String field33;

    public class9(int arg0, int arg1, String arg2) {
        this.field31 = arg0;
        this.field32 = arg1;
        this.field33 = arg2;
    }

    public class9(class547 arg0) {
        this(arg0.method8804(), arg0.method8804(), arg0.method8739());
    }

    @ObfuscatedName("ab.aq()Ljava/lang/String;")
    public String method59() {
        return Integer.toHexString(this.field31) + Integer.toHexString(this.field32) + this.field33;
    }

    @ObfuscatedName("ab.ad()I")
    public int method58() {
        return this.field32;
    }
}
