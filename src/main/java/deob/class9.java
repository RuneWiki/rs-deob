package deob;

@ObfuscatedName("au")
public class class9 {

    @ObfuscatedName("au.ac")
    public final int field26;

    @ObfuscatedName("au.ae")
    public final int field24;

    @ObfuscatedName("au.ag")
    public final String field25;

    public class9(int arg0, int arg1, String arg2) {
        this.field26 = arg0;
        this.field24 = arg1;
        this.field25 = arg2;
    }

    public class9(class551 arg0) {
        this(arg0.method8955(), arg0.method8955(), arg0.method9166());
    }

    @ObfuscatedName("au.ac()Ljava/lang/String;")
    public String method59() {
        return Integer.toHexString(this.field26) + Integer.toHexString(this.field24) + this.field25;
    }

    @ObfuscatedName("au.ae()I")
    public int method60() {
        return this.field24;
    }
}
