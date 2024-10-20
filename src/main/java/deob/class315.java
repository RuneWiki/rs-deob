package deob;

@ObfuscatedName("ld")
public class class315 {

    @ObfuscatedName("ld.c")
    public final int field3956;

    @ObfuscatedName("ld.l")
    public final long field3953;

    @ObfuscatedName("ld.s")
    public final class316 field3958;

    @ObfuscatedName("ld.e")
    public String field3955;

    @ObfuscatedName("ld.r")
    public String field3954;

    public class315(class421 arg0, byte arg1, int arg2) {
        this.field3955 = arg0.method6674();
        this.field3954 = arg0.method6674();
        this.field3956 = arg0.method6666();
        this.field3953 = arg0.method6670();
        int var4 = arg0.method6669();
        int var5 = arg0.method6669();
        this.field3958 = new class316();
        this.field3958.method5177(2);
        this.field3958.method5173(arg1);
        this.field3958.field3961 = var4;
        this.field3958.field3962 = var5;
        this.field3958.field3963 = 0;
        this.field3958.field3964 = 0;
        this.field3958.field3959 = arg2;
    }

    @ObfuscatedName("ld.c(I)Ljava/lang/String;")
    public String method5167() {
        return this.field3955;
    }

    @ObfuscatedName("ld.l(I)Ljava/lang/String;")
    public String method5171() {
        return this.field3954;
    }
}
