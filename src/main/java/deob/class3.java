package deob;

@ObfuscatedName("i")
public class class3 {

    @ObfuscatedName("i.u")
    public final int field23;

    @ObfuscatedName("i.x")
    public final long field18;

    @ObfuscatedName("i.i")
    public final class5 field16;

    @ObfuscatedName("i.a")
    public String field19;

    @ObfuscatedName("i.f")
    public String field20;

    public class3(class154 arg0, byte arg1, int arg2) {
        this.field19 = arg0.method2778();
        this.field20 = arg0.method2778();
        this.field23 = arg0.method2581();
        this.field18 = arg0.method2721();
        int var4 = arg0.method2593();
        int var5 = arg0.method2593();
        this.field16 = new class5();
        this.field16.method63(2);
        this.field16.method48(arg1);
        this.field16.field34 = var4;
        this.field16.field35 = var5;
        this.field16.field39 = 0;
        this.field16.field37 = 0;
        this.field16.field33 = arg2;
    }

    @ObfuscatedName("i.u(I)Ljava/lang/String;")
    public String method19() {
        return this.field19;
    }

    @ObfuscatedName("i.x(I)Ljava/lang/String;")
    public String method21() {
        return this.field20;
    }
}
