package deob;

@ObfuscatedName("kj")
public class class310 {

    @ObfuscatedName("kj.c")
    public final int field3898;

    @ObfuscatedName("kj.b")
    public final long field3894;

    @ObfuscatedName("kj.p")
    public final class311 field3896;

    @ObfuscatedName("kj.m")
    public String field3897;

    @ObfuscatedName("kj.t")
    public String field3895;

    public class310(class419 arg0, byte arg1, int arg2) {
        this.field3897 = arg0.method6707();
        this.field3895 = arg0.method6707();
        this.field3898 = arg0.method6672();
        this.field3894 = arg0.method6676();
        int var4 = arg0.method6675();
        int var5 = arg0.method6675();
        this.field3896 = new class311();
        this.field3896.method5217(2);
        this.field3896.method5218(arg1);
        this.field3896.field3900 = var4;
        this.field3896.field3902 = var5;
        this.field3896.field3904 = 0;
        this.field3896.field3905 = 0;
        this.field3896.field3906 = arg2;
    }

    @ObfuscatedName("kj.c(B)Ljava/lang/String;")
    public String method5206() {
        return this.field3897;
    }

    @ObfuscatedName("kj.b(I)Ljava/lang/String;")
    public String method5205() {
        return this.field3895;
    }
}
