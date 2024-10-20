package deob;

@ObfuscatedName("m")
public class class3 {

    @ObfuscatedName("m.c")
    public final int field20;

    @ObfuscatedName("m.q")
    public final long field15;

    @ObfuscatedName("m.m")
    public final class5 field17;

    @ObfuscatedName("m.j")
    public String field18;

    @ObfuscatedName("m.g")
    public String field19;

    public class3(class185 arg0, byte arg1, int arg2) {
        this.field18 = arg0.method3251();
        this.field19 = arg0.method3251();
        this.field20 = arg0.method3245();
        this.field15 = arg0.method3248();
        int var4 = arg0.method3323();
        int var5 = arg0.method3323();
        this.field17 = new class5();
        this.field17.method56(2);
        this.field17.method51(arg1);
        this.field17.field28 = var4;
        this.field17.field29 = var5;
        this.field17.field30 = 0;
        this.field17.field33 = 0;
        this.field17.field27 = arg2;
    }

    @ObfuscatedName("m.c(I)Ljava/lang/String;")
    public String method20() {
        return this.field18;
    }

    @ObfuscatedName("m.q(I)Ljava/lang/String;")
    public String method23() {
        return this.field19;
    }
}
