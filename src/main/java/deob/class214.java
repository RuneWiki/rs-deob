package deob;

@ObfuscatedName("hm")
public class class214 {

    @ObfuscatedName("hm.c")
    public final int field3123;

    @ObfuscatedName("hm.h")
    public final long field3124;

    @ObfuscatedName("hm.k")
    public final class220 field3125;

    @ObfuscatedName("hm.t")
    public String field3126;

    @ObfuscatedName("hm.g")
    public String field3127;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3126 = arg0.method2299();
        this.field3127 = arg0.method2299();
        this.field3123 = arg0.method2293();
        this.field3124 = arg0.method2297();
        int var4 = arg0.method2296();
        int var5 = arg0.method2296();
        this.field3125 = new class220();
        this.field3125.method3712(2);
        this.field3125.method3719(arg1);
        this.field3125.field3144 = var4;
        this.field3125.field3145 = var5;
        this.field3125.field3142 = 0;
        this.field3125.field3149 = 0;
        this.field3125.field3143 = arg2;
    }

    @ObfuscatedName("hm.c(B)Ljava/lang/String;")
    public String method3680() {
        return this.field3126;
    }

    @ObfuscatedName("hm.h(I)Ljava/lang/String;")
    public String method3684() {
        return this.field3127;
    }
}
