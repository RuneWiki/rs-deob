package deob;

@ObfuscatedName("o")
public class class3 {

    @ObfuscatedName("o.v")
    public final int field24;

    @ObfuscatedName("o.s")
    public final long field25;

    @ObfuscatedName("o.o")
    public final class5 field21;

    @ObfuscatedName("o.k")
    public String field22;

    @ObfuscatedName("o.u")
    public String field23;

    public class3(class185 arg0, byte arg1, int arg2) {
        this.field22 = arg0.method3490();
        this.field23 = arg0.method3490();
        this.field24 = arg0.method3276();
        this.field25 = arg0.method3280();
        int var4 = arg0.method3279();
        int var5 = arg0.method3279();
        this.field21 = new class5();
        this.field21.method62(2);
        this.field21.method50(arg1);
        this.field21.field34 = var4;
        this.field21.field38 = var5;
        this.field21.field35 = 0;
        this.field21.field36 = 0;
        this.field21.field33 = arg2;
    }

    @ObfuscatedName("o.v(I)Ljava/lang/String;")
    public String method19() {
        return this.field22;
    }

    @ObfuscatedName("o.s(B)Ljava/lang/String;")
    public String method18() {
        return this.field23;
    }
}
