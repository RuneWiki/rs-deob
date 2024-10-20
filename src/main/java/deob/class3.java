package deob;

@ObfuscatedName("n")
public class class3 {

    @ObfuscatedName("n.y")
    public final int field18;

    @ObfuscatedName("n.c")
    public final long field15;

    @ObfuscatedName("n.n")
    public final class5 field16;

    @ObfuscatedName("n.u")
    public String field17;

    @ObfuscatedName("n.i")
    public String field14;

    public class3(class185 arg0, byte arg1, int arg2) {
        this.field17 = arg0.method3277();
        this.field14 = arg0.method3277();
        this.field18 = arg0.method3280();
        this.field15 = arg0.method3488();
        int var4 = arg0.method3374();
        int var5 = arg0.method3374();
        this.field16 = new class5();
        this.field16.method54(2);
        this.field16.method39(arg1);
        this.field16.field34 = var4;
        this.field16.field38 = var5;
        this.field16.field29 = 0;
        this.field16.field32 = 0;
        this.field16.field28 = arg2;
    }

    @ObfuscatedName("n.y(I)Ljava/lang/String;")
    public String method15() {
        return this.field17;
    }

    @ObfuscatedName("n.c(I)Ljava/lang/String;")
    public String method17() {
        return this.field14;
    }
}
