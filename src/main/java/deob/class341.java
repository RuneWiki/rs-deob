package deob;

@ObfuscatedName("mg")
public class class341 {

    @ObfuscatedName("mg.h")
    public final int field4266;

    @ObfuscatedName("mg.e")
    public final long field4265;

    @ObfuscatedName("mg.v")
    public final class342 field4268;

    @ObfuscatedName("mg.x")
    public String field4267;

    @ObfuscatedName("mg.m")
    public String field4264;

    public class341(class467 arg0, byte arg1, int arg2) {
        this.field4267 = arg0.method7801();
        this.field4264 = arg0.method7801();
        this.field4266 = arg0.method7794();
        this.field4265 = arg0.method7958();
        int var4 = arg0.method7946();
        int var5 = arg0.method7946();
        this.field4268 = new class342();
        this.field4268.method6010(2);
        this.field4268.method6002(arg1);
        this.field4268.field4271 = var4;
        this.field4268.field4272 = var5;
        this.field4268.field4274 = 0;
        this.field4268.field4269 = 0;
        this.field4268.field4270 = arg2;
    }

    @ObfuscatedName("mg.h(I)Ljava/lang/String;")
    public String method5996() {
        return this.field4267;
    }

    @ObfuscatedName("mg.e(B)Ljava/lang/String;")
    public String method5993() {
        return this.field4264;
    }
}
