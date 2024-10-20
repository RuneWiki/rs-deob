package deob;

@ObfuscatedName("e")
public class class15 {

    @ObfuscatedName("e.s")
    public final int field299;

    @ObfuscatedName("e.c")
    public final long field295;

    @ObfuscatedName("e.f")
    public final class17 field305;

    @ObfuscatedName("e.m")
    public String field296;

    @ObfuscatedName("e.h")
    public String field298;

    public class15(class177 arg0, byte arg1, int arg2) {
        this.field296 = arg0.method2973();
        this.field298 = arg0.method2973();
        this.field299 = arg0.method2967();
        this.field295 = arg0.method2971();
        int var4 = arg0.method2970();
        int var5 = arg0.method2970();
        this.field305 = new class17();
        this.field305.method108(2);
        this.field305.method113(arg1);
        this.field305.field314 = var4;
        this.field305.field315 = var5;
        this.field305.field316 = 0;
        this.field305.field317 = 0;
        this.field305.field318 = arg2;
    }

    @ObfuscatedName("e.s(B)Ljava/lang/String;")
    public String method75() {
        return this.field296;
    }

    @ObfuscatedName("e.c(I)Ljava/lang/String;")
    public String method83() {
        return this.field298;
    }
}
