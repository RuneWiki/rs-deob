package deob;

@ObfuscatedName("m")
public class class9 {

    @ObfuscatedName("m.c")
    public final int field29;

    @ObfuscatedName("m.p")
    public final int field30;

    @ObfuscatedName("m.f")
    public final String field31;

    public class9(int arg0, int arg1, String arg2) {
        this.field29 = arg0;
        this.field30 = arg1;
        this.field31 = arg2;
    }

    public class9(class445 arg0) {
        this(arg0.method7196(), arg0.method7196(), arg0.method7206());
    }

    @ObfuscatedName("m.c()Ljava/lang/String;")
    public String method68() {
        return Integer.toHexString(this.field29) + Integer.toHexString(this.field30) + this.field31;
    }

    @ObfuscatedName("m.p()I")
    public int method69() {
        return this.field30;
    }
}
