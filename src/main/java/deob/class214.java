package deob;

@ObfuscatedName("hh")
public class class214 {

    @ObfuscatedName("hh.d")
    public final int field3135;

    @ObfuscatedName("hh.p")
    public final long field3133;

    @ObfuscatedName("hh.v")
    public final class220 field3132;

    @ObfuscatedName("hh.l")
    public String field3134;

    @ObfuscatedName("hh.y")
    public String field3136;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3134 = arg0.method2365();
        this.field3136 = arg0.method2365();
        this.field3135 = arg0.method2359();
        this.field3133 = arg0.method2363();
        int var4 = arg0.method2362();
        int var5 = arg0.method2362();
        this.field3132 = new class220();
        this.field3132.method3795(2);
        this.field3132.method3794(arg1);
        this.field3132.field3154 = var4;
        this.field3132.field3152 = var5;
        this.field3132.field3157 = 0;
        this.field3132.field3156 = 0;
        this.field3132.field3153 = arg2;
    }

    @ObfuscatedName("hh.d(I)Ljava/lang/String;")
    public String method3752() {
        return this.field3134;
    }

    @ObfuscatedName("hh.p(I)Ljava/lang/String;")
    public String method3751() {
        return this.field3136;
    }
}
