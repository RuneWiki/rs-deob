package deob;

@ObfuscatedName("w")
public class class3 {

    @ObfuscatedName("w.f")
    public final int field16;

    @ObfuscatedName("w.l")
    public final long field21;

    @ObfuscatedName("w.w")
    public final class5 field15;

    @ObfuscatedName("w.s")
    public String field18;

    @ObfuscatedName("w.e")
    public String field19;

    public class3(class185 arg0, byte arg1, int arg2) {
        this.field18 = arg0.method3353();
        this.field19 = arg0.method3353();
        this.field16 = arg0.method3346();
        this.field21 = arg0.method3437();
        int var4 = arg0.method3432();
        int var5 = arg0.method3432();
        this.field15 = new class5();
        this.field15.method36(2);
        this.field15.method41(arg1);
        this.field15.field37 = var4;
        this.field15.field32 = var5;
        this.field15.field33 = 0;
        this.field15.field34 = 0;
        this.field15.field30 = arg2;
    }

    @ObfuscatedName("w.f(I)Ljava/lang/String;")
    public String method15() {
        return this.field18;
    }

    @ObfuscatedName("w.l(I)Ljava/lang/String;")
    public String method20() {
        return this.field19;
    }
}
