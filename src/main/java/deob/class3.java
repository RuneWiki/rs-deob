package deob;

@ObfuscatedName("m")
public class class3 {

    @ObfuscatedName("m.n")
    public final int field25;

    @ObfuscatedName("m.d")
    public final long field16;

    @ObfuscatedName("m.m")
    public final class5 field24;

    @ObfuscatedName("m.h")
    public String field18;

    @ObfuscatedName("m.w")
    public String field19;

    public class3(class161 arg0, byte arg1, int arg2) {
        this.field18 = arg0.method2847();
        this.field19 = arg0.method2847();
        this.field25 = arg0.method2887();
        this.field16 = arg0.method2908();
        int var4 = arg0.method2785();
        int var5 = arg0.method2785();
        this.field24 = new class5();
        this.field24.method60(2);
        this.field24.method68(arg1);
        this.field24.field43 = var4;
        this.field24.field49 = var5;
        this.field24.field44 = 0;
        this.field24.field45 = 0;
        this.field24.field41 = arg2;
    }

    @ObfuscatedName("m.n(I)Ljava/lang/String;")
    public String method25() {
        return this.field18;
    }

    @ObfuscatedName("m.d(I)Ljava/lang/String;")
    public String method26() {
        return this.field19;
    }
}
