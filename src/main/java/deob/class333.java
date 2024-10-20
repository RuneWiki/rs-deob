package deob;

@ObfuscatedName("ls")
public class class333 extends class339 {

    @ObfuscatedName("ls.c")
    public final class382 field3927;

    @ObfuscatedName("ls.m")
    public final class331 field3926;

    @ObfuscatedName("ls.k")
    public String field3929 = null;

    @ObfuscatedName("ls.o")
    public String field3930 = null;

    @ObfuscatedName("ls.g")
    public byte field3936;

    @ObfuscatedName("ls.z")
    public int field3932;

    @ObfuscatedName("ls.a")
    public int field3933 = 1;

    public class333(class382 arg0, class331 arg1) {
        super(100);
        this.field3927 = arg0;
        this.field3926 = arg1;
    }

    @ObfuscatedName("ls.n(B)Lle;")
    public class337 method5374() {
        return new class336();
    }

    @ObfuscatedName("ls.c(II)[Lle;")
    public class337[] method5379(int arg0) {
        return new class336[arg0];
    }

    @ObfuscatedName("ls.m(Ljava/lang/String;B)V")
    public final void method5391(String arg0) {
        this.field3929 = class321.method2331(arg0);
    }

    @ObfuscatedName("ls.u(Ljava/lang/String;I)V")
    public final void method5392(String arg0) {
        this.field3930 = class321.method2331(arg0);
    }

    @ObfuscatedName("ls.e(Lot;I)V")
    public final void method5399(class400 arg0) {
        this.method5392(arg0.method6226());
        long var2 = arg0.method6223();
        this.method5391(class321.method1941(var2));
        this.field3936 = arg0.method6218();
        int var4 = arg0.method6217();
        if (var4 == 255) {
            return;
        }
        this.method5486();
        for (int var5 = 0; var5 < var4; var5++) {
            class336 var6 = (class336) this.method5493(new class421(arg0.method6226(), this.field3927));
            int var7 = arg0.method6219();
            var6.method5567(var7, ++this.field3933 - 1);
            var6.field3962 = arg0.method6218();
            arg0.method6226();
            this.method5397(var6);
        }
    }

    @ObfuscatedName("ls.l(Lot;I)V")
    public final void method5394(class400 arg0) {
        class421 var2 = new class421(arg0.method6226(), this.field3927);
        int var3 = arg0.method6219();
        byte var4 = arg0.method6218();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5504() == 0) {
                return;
            }
            class336 var6 = (class336) this.method5502(var2);
            if (var6 != null && var6.method5560() == var3) {
                this.method5516(var6);
            }
            return;
        }
        arg0.method6226();
        class336 var7 = (class336) this.method5502(var2);
        if (var7 == null) {
            if (this.method5504() > this.field3957) {
                return;
            }
            var7 = (class336) this.method5493(var2);
        }
        var7.method5567(var3, ++this.field3933 - 1);
        var7.field3962 = var4;
        this.method5397(var7);
    }

    @ObfuscatedName("ls.y(I)V")
    public final void method5395() {
        for (int var1 = 0; var1 < this.method5504(); var1++) {
            ((class336) this.method5500(var1)).method5436();
        }
    }

    @ObfuscatedName("ls.v(I)V")
    public final void method5396() {
        for (int var1 = 0; var1 < this.method5504(); var1++) {
            ((class336) this.method5500(var1)).method5432();
        }
    }

    @ObfuscatedName("ls.f(Llq;I)V")
    public final void method5397(class336 arg0) {
        if (arg0.method5455().equals(this.field3926.method1083())) {
            this.field3932 = arg0.field3962;
        }
    }
}
