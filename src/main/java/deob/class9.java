package deob;

@ObfuscatedName("v")
public class class9 {

    @ObfuscatedName("v.c")
    public final int field46;

    @ObfuscatedName("v.l")
    public final int field47;

    @ObfuscatedName("v.s")
    public final String field45;

    public class9(int arg0, int arg1, String arg2) {
        this.field46 = arg0;
        this.field47 = arg1;
        this.field45 = arg2;
    }

    public class9(class421 arg0) {
        this(arg0.method6686(), arg0.method6686(), arg0.method6674());
    }

    @ObfuscatedName("v.c()Ljava/lang/String;")
    public String method58() {
        return Integer.toHexString(this.field46) + Integer.toHexString(this.field47) + this.field45;
    }

    @ObfuscatedName("v.l()I")
    public int method57() {
        return this.field47;
    }
}
