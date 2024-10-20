package deob;

@ObfuscatedName("hd")
public class class215 {

    @ObfuscatedName("hd.a")
    public final int field3156;

    @ObfuscatedName("hd.w")
    public final long field3152;

    @ObfuscatedName("hd.d")
    public final class221 field3154;

    @ObfuscatedName("hd.c")
    public String field3155;

    @ObfuscatedName("hd.y")
    public String field3153;

    public class215(class120 arg0, byte arg1, int arg2) {
        this.field3155 = arg0.method2470();
        this.field3153 = arg0.method2470();
        this.field3156 = arg0.method2464();
        this.field3152 = arg0.method2468();
        int var4 = arg0.method2467();
        int var5 = arg0.method2467();
        this.field3154 = new class221();
        this.field3154.method3814(2);
        this.field3154.method3820(arg1);
        this.field3154.field3172 = var4;
        this.field3154.field3173 = var5;
        this.field3154.field3170 = 0;
        this.field3154.field3175 = 0;
        this.field3154.field3171 = arg2;
    }

    @ObfuscatedName("hd.a(B)Ljava/lang/String;")
    public String method3772() {
        return this.field3155;
    }

    @ObfuscatedName("hd.w(B)Ljava/lang/String;")
    public String method3773() {
        return this.field3153;
    }
}
