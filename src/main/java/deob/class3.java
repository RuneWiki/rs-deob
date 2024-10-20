package deob;

@ObfuscatedName("q")
public class class3 {

    @ObfuscatedName("q.w")
    public final int field18;

    @ObfuscatedName("q.m")
    public final long field11;

    @ObfuscatedName("q.q")
    public final class5 field14;

    @ObfuscatedName("q.b")
    public String field13;

    @ObfuscatedName("q.f")
    public String field15;

    public class3(class183 arg0, byte arg1, int arg2) {
        this.field13 = arg0.method3271();
        this.field15 = arg0.method3271();
        this.field18 = arg0.method3268();
        this.field11 = arg0.method3486();
        int var4 = arg0.method3267();
        int var5 = arg0.method3267();
        this.field14 = new class5();
        this.field14.method53(2);
        this.field14.method37(arg1);
        this.field14.field28 = var4;
        this.field14.field29 = var5;
        this.field14.field30 = 0;
        this.field14.field31 = 0;
        this.field14.field27 = arg2;
    }

    @ObfuscatedName("q.w(S)Ljava/lang/String;")
    public String method17() {
        return this.field13;
    }

    @ObfuscatedName("q.m(B)Ljava/lang/String;")
    public String method18() {
        return this.field15;
    }
}
