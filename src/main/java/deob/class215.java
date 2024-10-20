package deob;

@ObfuscatedName("hp")
public class class215 {

    @ObfuscatedName("hp.j")
    public final int field3163;

    @ObfuscatedName("hp.h")
    public final long field3157;

    @ObfuscatedName("hp.m")
    public final class221 field3159;

    @ObfuscatedName("hp.z")
    public String field3160;

    @ObfuscatedName("hp.x")
    public String field3161;

    public class215(class120 arg0, byte arg1, int arg2) {
        this.field3160 = arg0.method2369();
        this.field3161 = arg0.method2369();
        this.field3163 = arg0.method2363();
        this.field3157 = arg0.method2367();
        int var4 = arg0.method2366();
        int var5 = arg0.method2366();
        this.field3159 = new class221();
        this.field3159.method3740(2);
        this.field3159.method3729(arg1);
        this.field3159.field3176 = var4;
        this.field3159.field3177 = var5;
        this.field3159.field3174 = 0;
        this.field3159.field3179 = 0;
        this.field3159.field3178 = arg2;
    }

    @ObfuscatedName("hp.j(B)Ljava/lang/String;")
    public String method3676() {
        return this.field3160;
    }

    @ObfuscatedName("hp.h(B)Ljava/lang/String;")
    public String method3674() {
        return this.field3161;
    }
}
