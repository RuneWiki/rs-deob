package deob;

@ObfuscatedName("gr")
public class class195 {

    @ObfuscatedName("gr.x")
    public final int field2908;

    @ObfuscatedName("gr.v")
    public final long field2909;

    @ObfuscatedName("gr.m")
    public final class201 field2910;

    @ObfuscatedName("gr.e")
    public String field2912;

    @ObfuscatedName("gr.h")
    public String field2911;

    public class195(class108 arg0, byte arg1, int arg2) {
        this.field2912 = arg0.method2270();
        this.field2911 = arg0.method2270();
        this.field2908 = arg0.method2129();
        this.field2909 = arg0.method2133();
        int var4 = arg0.method2132();
        int var5 = arg0.method2132();
        this.field2910 = new class201();
        this.field2910.method3452(2);
        this.field2910.method3453(arg1);
        this.field2910.field2938 = var4;
        this.field2910.field2939 = var5;
        this.field2910.field2936 = 0;
        this.field2910.field2941 = 0;
        this.field2910.field2937 = arg2;
    }

    @ObfuscatedName("gr.x(I)Ljava/lang/String;")
    public String method3393() {
        return this.field2912;
    }

    @ObfuscatedName("gr.v(I)Ljava/lang/String;")
    public String method3392() {
        return this.field2911;
    }
}
