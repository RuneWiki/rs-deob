package deob;

@ObfuscatedName("oo")
public class class383 {

    @ObfuscatedName("oo.am")
    public final int field4420;

    @ObfuscatedName("oo.ap")
    public final long field4421;

    @ObfuscatedName("oo.af")
    public final class384 field4422;

    @ObfuscatedName("oo.aj")
    public String field4423;

    @ObfuscatedName("oo.aq")
    public String field4424;

    public class383(class531 arg0, byte arg1, int arg2) {
        this.field4423 = arg0.method8641();
        this.field4424 = arg0.method8641();
        this.field4420 = arg0.method8775();
        this.field4421 = arg0.method8567();
        int var4 = arg0.method8566();
        int var5 = arg0.method8566();
        this.field4422 = new class384();
        this.field4422.method6572(2);
        this.field4422.method6588(arg1);
        this.field4422.field4427 = var4;
        this.field4422.field4428 = var5;
        this.field4422.field4426 = 0;
        this.field4422.field4430 = 0;
        this.field4422.field4429 = arg2;
    }

    @ObfuscatedName("oo.am(I)Ljava/lang/String;")
    public String method6560() {
        return this.field4423;
    }

    @ObfuscatedName("oo.ap(B)Ljava/lang/String;")
    public String method6559() {
        return this.field4424;
    }
}
