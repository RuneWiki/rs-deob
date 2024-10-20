package deob;

@ObfuscatedName("ln")
public class class324 {

    @ObfuscatedName("ln.o")
    public final int field4084;

    @ObfuscatedName("ln.q")
    public final long field4085;

    @ObfuscatedName("ln.l")
    public final class325 field4083;

    @ObfuscatedName("ln.k")
    public String field4086;

    @ObfuscatedName("ln.a")
    public String field4087;

    public class324(class440 arg0, byte arg1, int arg2) {
        this.field4086 = arg0.method7044();
        this.field4087 = arg0.method7044();
        this.field4084 = arg0.method7082();
        this.field4085 = arg0.method7014();
        int var4 = arg0.method6898();
        int var5 = arg0.method6898();
        this.field4083 = new class325();
        this.field4083.method5341(2);
        this.field4083.method5344(arg1);
        this.field4083.field4094 = var4;
        this.field4083.field4095 = var5;
        this.field4083.field4097 = 0;
        this.field4083.field4092 = 0;
        this.field4083.field4093 = arg2;
    }

    @ObfuscatedName("ln.o(B)Ljava/lang/String;")
    public String method5327() {
        return this.field4086;
    }

    @ObfuscatedName("ln.q(I)Ljava/lang/String;")
    public String method5328() {
        return this.field4087;
    }
}
