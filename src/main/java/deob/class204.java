package deob;

@ObfuscatedName("gd")
public class class204 {

    @ObfuscatedName("gd.q")
    public final int field2993;

    @ObfuscatedName("gd.s")
    public final long field2992;

    @ObfuscatedName("gd.h")
    public final class210 field2991;

    @ObfuscatedName("gd.e")
    public String field2994;

    @ObfuscatedName("gd.n")
    public String field2995;

    public class204(class111 arg0, byte arg1, int arg2) {
        this.field2994 = arg0.method2156();
        this.field2995 = arg0.method2156();
        this.field2993 = arg0.method2307();
        this.field2992 = arg0.method2195();
        int var4 = arg0.method2153();
        int var5 = arg0.method2153();
        this.field2991 = new class210();
        this.field2991.method3473(2);
        this.field2991.method3464(arg1);
        this.field2991.field3023 = var4;
        this.field2991.field3025 = var5;
        this.field2991.field3021 = 0;
        this.field2991.field3020 = 0;
        this.field2991.field3018 = arg2;
    }

    @ObfuscatedName("gd.q(I)Ljava/lang/String;")
    public String method3430() {
        return this.field2994;
    }

    @ObfuscatedName("gd.s(B)Ljava/lang/String;")
    public String method3429() {
        return this.field2995;
    }
}
