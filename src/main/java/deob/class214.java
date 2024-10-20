package deob;

@ObfuscatedName("hv")
public class class214 {

    @ObfuscatedName("hv.g")
    public final int field3129;

    @ObfuscatedName("hv.b")
    public final long field3126;

    @ObfuscatedName("hv.w")
    public final class220 field3130;

    @ObfuscatedName("hv.d")
    public String field3127;

    @ObfuscatedName("hv.z")
    public String field3128;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3127 = arg0.method2370();
        this.field3128 = arg0.method2370();
        this.field3129 = arg0.method2376();
        this.field3126 = arg0.method2564();
        int var4 = arg0.method2367();
        int var5 = arg0.method2367();
        this.field3130 = new class220();
        this.field3130.method3773(2);
        this.field3130.method3774(arg1);
        this.field3130.field3152 = var4;
        this.field3130.field3151 = var5;
        this.field3130.field3154 = 0;
        this.field3130.field3150 = 0;
        this.field3130.field3153 = arg2;
    }

    @ObfuscatedName("hv.g(I)Ljava/lang/String;")
    public String method3729() {
        return this.field3127;
    }

    @ObfuscatedName("hv.b(I)Ljava/lang/String;")
    public String method3732() {
        return this.field3128;
    }
}
