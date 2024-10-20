package deob;

@ObfuscatedName("hb")
public class class218 {

    @ObfuscatedName("hb.a")
    public final int field3205;

    @ObfuscatedName("hb.d")
    public final long field3204;

    @ObfuscatedName("hb.v")
    public final class224 field3203;

    @ObfuscatedName("hb.r")
    public String field3206;

    @ObfuscatedName("hb.z")
    public String field3207;

    public class218(class123 arg0, byte arg1, int arg2) {
        this.field3206 = arg0.method2397();
        this.field3207 = arg0.method2397();
        this.field3205 = arg0.method2584();
        this.field3204 = arg0.method2401();
        int var4 = arg0.method2400();
        int var5 = arg0.method2400();
        this.field3203 = new class224();
        this.field3203.method3818(2);
        this.field3203.method3806(arg1);
        this.field3203.field3220 = var4;
        this.field3203.field3218 = var5;
        this.field3203.field3223 = 0;
        this.field3203.field3221 = 0;
        this.field3203.field3219 = arg2;
    }

    @ObfuscatedName("hb.a(B)Ljava/lang/String;")
    public String method3763() {
        return this.field3206;
    }

    @ObfuscatedName("hb.d(B)Ljava/lang/String;")
    public String method3767() {
        return this.field3207;
    }
}
