package deob;

@ObfuscatedName("hw")
public class class215 {

    @ObfuscatedName("hw.t")
    public final int field3161;

    @ObfuscatedName("hw.i")
    public final long field3157;

    @ObfuscatedName("hw.g")
    public final class221 field3158;

    @ObfuscatedName("hw.h")
    public String field3156;

    @ObfuscatedName("hw.z")
    public String field3160;

    public class215(class120 arg0, byte arg1, int arg2) {
        this.field3156 = arg0.method2316();
        this.field3160 = arg0.method2316();
        this.field3161 = arg0.method2310();
        this.field3157 = arg0.method2314();
        int var4 = arg0.method2345();
        int var5 = arg0.method2345();
        this.field3158 = new class221();
        this.field3158.method3664(2);
        this.field3158.method3668(arg1);
        this.field3158.field3177 = var4;
        this.field3158.field3175 = var5;
        this.field3158.field3172 = 0;
        this.field3158.field3176 = 0;
        this.field3158.field3173 = arg2;
    }

    @ObfuscatedName("hw.t(B)Ljava/lang/String;")
    public String method3626() {
        return this.field3156;
    }

    @ObfuscatedName("hw.i(I)Ljava/lang/String;")
    public String method3627() {
        return this.field3160;
    }
}
