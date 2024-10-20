package deob;

@ObfuscatedName("ao")
public class class9 {

    @ObfuscatedName("ao.aq")
    public final int field24;

    @ObfuscatedName("ao.aw")
    public final int field23;

    @ObfuscatedName("ao.al")
    public final String field25;

    public class9(int arg0, int arg1, String arg2) {
        this.field24 = arg0;
        this.field23 = arg1;
        this.field25 = arg2;
    }

    public class9(class534 arg0) {
        this(arg0.method8591(), arg0.method8591(), arg0.method8741());
    }

    @ObfuscatedName("ao.aq()Ljava/lang/String;")
    public String method55() {
        return Integer.toHexString(this.field24) + Integer.toHexString(this.field23) + this.field25;
    }

    @ObfuscatedName("ao.aw()I")
    public int method53() {
        return this.field23;
    }
}
