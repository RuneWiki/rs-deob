package deob;

@ObfuscatedName("at")
public class class33 extends class44 {

    @ObfuscatedName("at.n")
    public final int field216;

    @ObfuscatedName("at.v")
    public final class39 field221;

    @ObfuscatedName("at.d")
    public int field217;

    @ObfuscatedName("at.c")
    public class38 field218;

    @ObfuscatedName("at.y")
    public int field220;

    @ObfuscatedName("at.h")
    public int field215;

    public class33(class223 arg0, class223 arg1, int arg2, class39 arg3) {
        super(arg0, arg1);
        this.field216 = arg2;
        this.field221 = arg3;
        this.method328();
    }

    @ObfuscatedName("at.a(I)V")
    public void method328() {
        this.field217 = class265.method668(this.field216).method4417().field3384;
        this.field218 = this.field221.method463(class253.method4155(this.field217));
        class253 var1 = class253.method4155(this.method250());
        class336 var2 = var1.method4178(false);
        if (var2 == null) {
            this.field220 = 0;
            this.field215 = 0;
        } else {
            this.field220 = var2.field3913;
            this.field215 = var2.field3912;
        }
    }

    @ObfuscatedName("at.n(B)I")
    public int method250() {
        return this.field217;
    }

    @ObfuscatedName("at.v(S)Laa;")
    public class38 method251() {
        return this.field218;
    }

    @ObfuscatedName("at.d(I)I")
    public int method258() {
        return this.field220;
    }

    @ObfuscatedName("at.c(I)I")
    public int method253() {
        return this.field215;
    }
}
