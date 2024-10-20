package deob;

@ObfuscatedName("f")
public class class3 {

    @ObfuscatedName("f.s")
    public final int field33;

    @ObfuscatedName("f.c")
    public final long field26;

    @ObfuscatedName("f.f")
    public final class5 field24;

    @ObfuscatedName("f.h")
    public String field25;

    @ObfuscatedName("f.a")
    public String field34;

    public class3(class154 arg0, byte arg1, int arg2) {
        this.field25 = arg0.method2734();
        this.field34 = arg0.method2734();
        this.field33 = arg0.method2541();
        this.field26 = arg0.method2551();
        int var4 = arg0.method2550();
        int var5 = arg0.method2550();
        this.field24 = new class5();
        this.field24.method45(2);
        this.field24.method47(arg1);
        this.field24.field50 = var4;
        this.field24.field48 = var5;
        this.field24.field49 = 0;
        this.field24.field45 = 0;
        this.field24.field46 = arg2;
    }

    @ObfuscatedName("f.s(I)Ljava/lang/String;")
    public String method18() {
        return this.field25;
    }

    @ObfuscatedName("f.c(S)Ljava/lang/String;")
    public String method17() {
        return this.field34;
    }
}
