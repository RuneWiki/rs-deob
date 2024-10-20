package deob;

@ObfuscatedName("gk")
public class class205 {

    @ObfuscatedName("gk.b")
    public final int field3042;

    @ObfuscatedName("gk.e")
    public final long field3043;

    @ObfuscatedName("gk.a")
    public final class211 field3041;

    @ObfuscatedName("gk.k")
    public String field3044;

    @ObfuscatedName("gk.p")
    public String field3045;

    public class205(class111 arg0, byte arg1, int arg2) {
        this.field3044 = arg0.method2166();
        this.field3045 = arg0.method2166();
        this.field3042 = arg0.method2129();
        this.field3043 = arg0.method2133();
        int var4 = arg0.method2194();
        int var5 = arg0.method2194();
        this.field3041 = new class211();
        this.field3041.method3519(2);
        this.field3041.method3501(arg1);
        this.field3041.field3067 = var4;
        this.field3041.field3069 = var5;
        this.field3041.field3066 = 0;
        this.field3041.field3064 = 0;
        this.field3041.field3065 = arg2;
    }

    @ObfuscatedName("gk.b(B)Ljava/lang/String;")
    public String method3451() {
        return this.field3044;
    }

    @ObfuscatedName("gk.e(I)Ljava/lang/String;")
    public String method3452() {
        return this.field3045;
    }
}
