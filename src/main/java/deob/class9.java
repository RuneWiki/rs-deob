package deob;

@ObfuscatedName("o")
public class class9 {

    @ObfuscatedName("o.s")
    public final int field29;

    @ObfuscatedName("o.t")
    public final int field28;

    @ObfuscatedName("o.v")
    public final String field30;

    public class9(int arg0, int arg1, String arg2) {
        this.field29 = arg0;
        this.field28 = arg1;
        this.field30 = arg2;
    }

    public class9(class385 arg0) {
        this(arg0.method5958(), arg0.method5958(), arg0.method5967());
    }

    @ObfuscatedName("o.s()Ljava/lang/String;")
    public String method57() {
        return Integer.toHexString(this.field29) + Integer.toHexString(this.field28) + this.field30;
    }

    @ObfuscatedName("o.t()I")
    public int method63() {
        return this.field28;
    }
}
