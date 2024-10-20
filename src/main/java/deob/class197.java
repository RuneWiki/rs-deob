package deob;

@ObfuscatedName("gp")
public class class197 {

    @ObfuscatedName("gp.p")
    public final int field2940;

    @ObfuscatedName("gp.y")
    public final long field2939;

    @ObfuscatedName("gp.d")
    public final class203 field2942;

    @ObfuscatedName("gp.c")
    public String field2941;

    @ObfuscatedName("gp.r")
    public String field2943;

    public class197(class110 arg0, byte arg1, int arg2) {
        this.field2941 = arg0.method2132();
        this.field2943 = arg0.method2132();
        this.field2940 = arg0.method2243();
        this.field2939 = arg0.method2263();
        int var4 = arg0.method2164();
        int var5 = arg0.method2164();
        this.field2942 = new class203();
        this.field2942.method3435(2);
        this.field2942.method3424(arg1);
        this.field2942.field2961 = var4;
        this.field2942.field2963 = var5;
        this.field2942.field2964 = 0;
        this.field2942.field2967 = 0;
        this.field2942.field2965 = arg2;
    }

    @ObfuscatedName("gp.p(I)Ljava/lang/String;")
    public String method3383() {
        return this.field2941;
    }

    @ObfuscatedName("gp.y(B)Ljava/lang/String;")
    public String method3384() {
        return this.field2943;
    }
}
