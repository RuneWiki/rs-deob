package deob;

@Deprecated
@ObfuscatedName("lj")
public class class323 {

    @ObfuscatedName("lj.c")
    public final int field4062;

    @ObfuscatedName("lj.v")
    public final long field4061;

    @ObfuscatedName("lj.q")
    public final class324 field4066;

    @ObfuscatedName("lj.f")
    public String field4063;

    @ObfuscatedName("lj.j")
    public String field4064;

    public class323(class443 arg0, byte arg1, int arg2) {
        this.field4063 = arg0.method7057();
        this.field4064 = arg0.method7057();
        this.field4062 = arg0.method7049();
        this.field4061 = arg0.method7106();
        int var4 = arg0.method7052();
        int var5 = arg0.method7052();
        this.field4066 = new class324();
        this.field4066.method5450(2);
        this.field4066.method5448(arg1);
        this.field4066.field4069 = var4;
        this.field4066.field4070 = var5;
        this.field4066.field4068 = 0;
        this.field4066.field4072 = 0;
        this.field4066.field4067 = arg2;
    }

    @ObfuscatedName("lj.c(I)Ljava/lang/String;")
    public String method5441() {
        return this.field4063;
    }

    @ObfuscatedName("lj.v(B)Ljava/lang/String;")
    public String method5442() {
        return this.field4064;
    }
}
