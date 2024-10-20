package deob;

@ObfuscatedName("jk")
public class class283 extends class276 {

    @ObfuscatedName("jk.i")
    public final class314 field3710;

    @ObfuscatedName("jk.w")
    public final class278 field3711;

    @ObfuscatedName("jk.m")
    public String field3714 = null;

    @ObfuscatedName("jk.h")
    public String field3709 = null;

    @ObfuscatedName("jk.o")
    public byte field3712;

    @ObfuscatedName("jk.x")
    public byte field3715;

    public class283(class314 arg0, class278 arg1) {
        super(100);
        this.field3710 = arg0;
        this.field3711 = arg1;
    }

    @ObfuscatedName("jk.p(B)Lju;")
    public class274 method4667() {
        return new class273();
    }

    @ObfuscatedName("jk.i(II)[Lju;")
    public class274[] method4668(int arg0) {
        return new class273[arg0];
    }

    @ObfuscatedName("jk.w(Ljava/lang/String;I)V")
    public final void method4775(String arg0) {
        this.field3714 = class292.method60(arg0);
    }

    @ObfuscatedName("jk.q(Ljava/lang/String;B)V")
    public final void method4776(String arg0) {
        this.field3709 = class292.method60(arg0);
    }

    @ObfuscatedName("jk.d(Lgj;S)V")
    public final void method4777(class185 arg0) {
        this.method4776(arg0.method3131());
        long var2 = arg0.method3128();
        this.method4775(class292.method616(var2));
        this.field3712 = arg0.method3123();
        int var4 = arg0.method3197();
        if (var4 == 255) {
            return;
        }
        this.method4707();
        for (int var5 = 0; var5 < var4; var5++) {
            class273 var6 = (class273) this.method4681(new class281(arg0.method3131(), this.field3710));
            var6.field3674 = arg0.method3124();
            var6.field3675 = arg0.method3123();
            arg0.method3131();
            this.method4781(var6);
        }
    }

    @ObfuscatedName("jk.cx(Lgj;I)V")
    public final void method4778(class185 arg0) {
        class281 var2 = new class281(arg0.method3131(), this.field3710);
        int var3 = arg0.method3124();
        byte var4 = arg0.method3123();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4682() == 0) {
                return;
            }
            class273 var6 = (class273) this.method4686(var2);
            if (var6 != null && var6.field3674 == var3) {
                this.method4689(var6);
            }
            return;
        }
        arg0.method3131();
        class273 var7 = (class273) this.method4685(var2);
        if (var7 == null) {
            if (this.method4682() > this.field3686) {
                return;
            }
            var7 = (class273) this.method4681(var2);
        }
        var7.field3674 = var3;
        var7.field3675 = var4;
        this.method4781(var7);
    }

    @ObfuscatedName("jk.cv(I)V")
    public final void method4779() {
        for (int var1 = 0; var1 < this.method4682(); var1++) {
            ((class273) this.method4699(var1)).method4640();
        }
    }

    @ObfuscatedName("jk.cc(I)V")
    public final void method4780() {
        for (int var1 = 0; var1 < this.method4682(); var1++) {
            ((class273) this.method4699(var1)).method4623();
        }
    }

    @ObfuscatedName("jk.cg(Ljy;B)V")
    public final void method4781(class273 arg0) {
        if (arg0.method4648().equals(this.field3711.method1149())) {
            this.field3715 = arg0.field3675;
        }
    }
}
