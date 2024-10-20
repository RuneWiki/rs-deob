package deob;

@ObfuscatedName("f")
public class class3 {

    @ObfuscatedName("f.i")
    public final int field24;

    @ObfuscatedName("f.e")
    public final long field27;

    @ObfuscatedName("f.f")
    public final class5 field25;

    @ObfuscatedName("f.k")
    public String field23;

    @ObfuscatedName("f.g")
    public String field22;

    public class3(class154 arg0, byte arg1, int arg2) {
        this.field23 = arg0.method2581();
        this.field22 = arg0.method2581();
        this.field24 = arg0.method2575();
        this.field27 = arg0.method2680();
        int var4 = arg0.method2658();
        int var5 = arg0.method2658();
        this.field25 = new class5();
        this.field25.method43(2);
        this.field25.method44(arg1);
        this.field25.field38 = var4;
        this.field25.field39 = var5;
        this.field25.field40 = 0;
        this.field25.field41 = 0;
        this.field25.field44 = arg2;
    }

    @ObfuscatedName("f.i(I)Ljava/lang/String;")
    public String method25() {
        return this.field23;
    }

    @ObfuscatedName("f.e(I)Ljava/lang/String;")
    public String method20() {
        return this.field22;
    }
}
