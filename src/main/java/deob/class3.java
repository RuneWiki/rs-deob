package deob;

@ObfuscatedName("g")
public class class3 {

    @ObfuscatedName("g.x")
    public final int field17;

    @ObfuscatedName("g.n")
    public final long field12;

    @ObfuscatedName("g.g")
    public final class5 field14;

    @ObfuscatedName("g.v")
    public String field15;

    @ObfuscatedName("g.y")
    public String field16;

    public class3(class154 arg0, byte arg1, int arg2) {
        this.field15 = arg0.method2709();
        this.field16 = arg0.method2709();
        this.field17 = arg0.method2833();
        this.field12 = arg0.method2707();
        int var4 = arg0.method2803();
        int var5 = arg0.method2803();
        this.field14 = new class5();
        this.field14.method52(2);
        this.field14.method71(arg1);
        this.field14.field27 = var4;
        this.field14.field28 = var5;
        this.field14.field30 = 0;
        this.field14.field36 = 0;
        this.field14.field26 = arg2;
    }

    @ObfuscatedName("g.x(I)Ljava/lang/String;")
    public String method31() {
        return this.field15;
    }

    @ObfuscatedName("g.n(I)Ljava/lang/String;")
    public String method25() {
        return this.field16;
    }
}
