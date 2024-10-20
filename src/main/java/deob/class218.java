package deob;

@ObfuscatedName("hk")
public class class218 {

    @ObfuscatedName("hk.s")
    public final int field3200;

    @ObfuscatedName("hk.z")
    public final long field3199;

    @ObfuscatedName("hk.t")
    public final class224 field3203;

    @ObfuscatedName("hk.y")
    public String field3201;

    @ObfuscatedName("hk.p")
    public String field3202;

    public class218(class123 arg0, byte arg1, int arg2) {
        this.field3201 = arg0.method2385();
        this.field3202 = arg0.method2385();
        this.field3200 = arg0.method2550();
        this.field3199 = arg0.method2369();
        int var4 = arg0.method2408();
        int var5 = arg0.method2408();
        this.field3203 = new class224();
        this.field3203.method3785(2);
        this.field3203.method3770(arg1);
        this.field3203.field3222 = var4;
        this.field3203.field3219 = var5;
        this.field3203.field3223 = 0;
        this.field3203.field3224 = 0;
        this.field3203.field3220 = arg2;
    }

    @ObfuscatedName("hk.s(S)Ljava/lang/String;")
    public String method3724() {
        return this.field3201;
    }

    @ObfuscatedName("hk.z(B)Ljava/lang/String;")
    public String method3728() {
        return this.field3202;
    }
}
