package deob;

@ObfuscatedName("u")
public class class9 {

    @ObfuscatedName("u.n")
    public final int field30;

    @ObfuscatedName("u.c")
    public final int field29;

    @ObfuscatedName("u.m")
    public final String field31;

    public class9(int arg0, int arg1, String arg2) {
        this.field30 = arg0;
        this.field29 = arg1;
        this.field31 = arg2;
    }

    public class9(class400 arg0) {
        this(arg0.method6217(), arg0.method6217(), arg0.method6226());
    }

    @ObfuscatedName("u.n()Ljava/lang/String;")
    public String method64() {
        return Integer.toHexString(this.field30) + Integer.toHexString(this.field29) + this.field31;
    }

    @ObfuscatedName("u.c()I")
    public int method66() {
        return this.field29;
    }
}
