package deob;

@ObfuscatedName("e")
public class class3 {

    @ObfuscatedName("e.f")
    public final int field20;

    @ObfuscatedName("e.h")
    public final long field17;

    @ObfuscatedName("e.e")
    public final class5 field16;

    @ObfuscatedName("e.b")
    public String field19;

    @ObfuscatedName("e.l")
    public String field21;

    public class3(class185 arg0, byte arg1, int arg2) {
        this.field19 = arg0.method3435();
        this.field21 = arg0.method3435();
        this.field20 = arg0.method3325();
        this.field17 = arg0.method3505();
        int var4 = arg0.method3328();
        int var5 = arg0.method3328();
        this.field16 = new class5();
        this.field16.method46(2);
        this.field16.method47(arg1);
        this.field16.field31 = var4;
        this.field16.field29 = var5;
        this.field16.field33 = 0;
        this.field16.field34 = 0;
        this.field16.field32 = arg2;
    }

    @ObfuscatedName("e.f(I)Ljava/lang/String;")
    public String method25() {
        return this.field19;
    }

    @ObfuscatedName("e.h(I)Ljava/lang/String;")
    public String method27() {
        return this.field21;
    }
}
