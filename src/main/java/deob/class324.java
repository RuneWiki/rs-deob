package deob;

@ObfuscatedName("lh")
public class class324 {

    @ObfuscatedName("lh.s")
    public final int field4068;

    @ObfuscatedName("lh.h")
    public final long field4067;

    @ObfuscatedName("lh.w")
    public final class325 field4069;

    @ObfuscatedName("lh.v")
    public String field4070;

    @ObfuscatedName("lh.c")
    public String field4071;

    public class324(class444 arg0, byte arg1, int arg2) {
        this.field4070 = arg0.method6975();
        this.field4071 = arg0.method6975();
        this.field4068 = arg0.method7120();
        this.field4067 = arg0.method6935();
        int var4 = arg0.method6934();
        int var5 = arg0.method6934();
        this.field4069 = new class325();
        this.field4069.method5352(2);
        this.field4069.method5359(arg1);
        this.field4069.field4074 = var4;
        this.field4069.field4075 = var5;
        this.field4069.field4076 = 0;
        this.field4069.field4077 = 0;
        this.field4069.field4072 = arg2;
    }

    @ObfuscatedName("lh.s(B)Ljava/lang/String;")
    public String method5346() {
        return this.field4070;
    }

    @ObfuscatedName("lh.h(I)Ljava/lang/String;")
    public String method5339() {
        return this.field4071;
    }
}
