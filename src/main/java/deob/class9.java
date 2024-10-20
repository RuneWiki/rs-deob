package deob;

@ObfuscatedName("q")
public class class9 {

    @ObfuscatedName("q.v")
    public final int field24;

    @ObfuscatedName("q.c")
    public final int field25;

    @ObfuscatedName("q.i")
    public final String field26;

    public class9(int arg0, int arg1, String arg2) {
        this.field24 = arg0;
        this.field25 = arg1;
        this.field26 = arg2;
    }

    public class9(class438 arg0) {
        this(arg0.method6971(), arg0.method6971(), arg0.method6981());
    }

    @ObfuscatedName("q.v()Ljava/lang/String;")
    public String method59() {
        return Integer.toHexString(this.field24) + Integer.toHexString(this.field25) + this.field26;
    }

    @ObfuscatedName("q.c()I")
    public int method54() {
        return this.field25;
    }
}
