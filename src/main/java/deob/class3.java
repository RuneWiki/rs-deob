package deob;

@ObfuscatedName("c")
public class class3 {

    @ObfuscatedName("c.b")
    public final int field29;

    @ObfuscatedName("c.e")
    public final long field22;

    @ObfuscatedName("c.c")
    public final class5 field25;

    @ObfuscatedName("c.l")
    public String field21;

    @ObfuscatedName("c.y")
    public String field23;

    public class3(class154 arg0, byte arg1, int arg2) {
        this.field21 = arg0.method2677();
        this.field23 = arg0.method2677();
        this.field29 = arg0.method2671();
        this.field22 = arg0.method2675();
        int var4 = arg0.method2815();
        int var5 = arg0.method2815();
        this.field25 = new class5();
        this.field25.method48(2);
        this.field25.method44(arg1);
        this.field25.field43 = var4;
        this.field25.field50 = var5;
        this.field25.field42 = 0;
        this.field25.field44 = 0;
        this.field25.field40 = arg2;
    }

    @ObfuscatedName("c.b(I)Ljava/lang/String;")
    public String method19() {
        return this.field21;
    }

    @ObfuscatedName("c.e(I)Ljava/lang/String;")
    public String method20() {
        return this.field23;
    }
}
