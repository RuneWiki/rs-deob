package deob;

@ObfuscatedName("r")
public class class9 {

    @ObfuscatedName("r.o")
    public final int field30;

    @ObfuscatedName("r.q")
    public final int field31;

    @ObfuscatedName("r.l")
    public final String field32;

    public class9(int arg0, int arg1, String arg2) {
        this.field30 = arg0;
        this.field31 = arg1;
        this.field32 = arg2;
    }

    public class9(class440 arg0) {
        this(arg0.method7071(), arg0.method7071(), arg0.method7044());
    }

    @ObfuscatedName("r.o()Ljava/lang/String;")
    public String method56() {
        return Integer.toHexString(this.field30) + Integer.toHexString(this.field31) + this.field32;
    }

    @ObfuscatedName("r.q()I")
    public int method54() {
        return this.field31;
    }
}
