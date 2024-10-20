package deob;

@ObfuscatedName("od")
public class class382 {

    @ObfuscatedName("od.ac")
    public final int field4395;

    @ObfuscatedName("od.al")
    public final long field4391;

    @ObfuscatedName("od.ak")
    public final class383 field4392;

    @ObfuscatedName("od.ax")
    public String field4393;

    @ObfuscatedName("od.ao")
    public String field4394;

    public class382(class530 arg0, byte arg1, int arg2) {
        this.field4393 = arg0.method8588();
        this.field4394 = arg0.method8588();
        this.field4395 = arg0.method8598();
        this.field4391 = arg0.method8573();
        int var4 = arg0.method8371();
        int var5 = arg0.method8371();
        this.field4392 = new class383();
        this.field4392.method6442(2);
        this.field4392.method6444(arg1);
        this.field4392.field4400 = var4;
        this.field4392.field4398 = var5;
        this.field4392.field4402 = 0;
        this.field4392.field4403 = 0;
        this.field4392.field4399 = arg2;
    }

    @ObfuscatedName("od.ac(S)Ljava/lang/String;")
    public String method6432() {
        return this.field4393;
    }

    @ObfuscatedName("od.al(I)Ljava/lang/String;")
    public String method6434() {
        return this.field4394;
    }
}
