package deob;

@ObfuscatedName("ae")
public class class9 {

    @ObfuscatedName("ae.ab")
    public final int field24;

    @ObfuscatedName("ae.ay")
    public final int field25;

    @ObfuscatedName("ae.an")
    public final String field23;

    public class9(int arg0, int arg1, String arg2) {
        this.field24 = arg0;
        this.field25 = arg1;
        this.field23 = arg2;
    }

    public class9(class549 arg0) {
        this(arg0.method9025(), arg0.method9025(), arg0.method8808());
    }

    @ObfuscatedName("ae.ab()Ljava/lang/String;")
    public String method60() {
        return Integer.toHexString(this.field24) + Integer.toHexString(this.field25) + this.field23;
    }

    @ObfuscatedName("ae.ay()I")
    public int method54() {
        return this.field25;
    }
}
