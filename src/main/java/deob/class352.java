package deob;

@ObfuscatedName("ma")
public class class352 extends class357 {

    @ObfuscatedName("ma.l")
    public final class405 field4146;

    @ObfuscatedName("ma.s")
    public final class349 field4139;

    @ObfuscatedName("ma.e")
    public String field4140 = null;

    @ObfuscatedName("ma.r")
    public String field4141 = null;

    @ObfuscatedName("ma.o")
    public byte field4143;

    @ObfuscatedName("ma.i")
    public int field4147;

    @ObfuscatedName("ma.w")
    public int field4144 = 1;

    public class352(class405 arg0, class349 arg1) {
        super(100);
        this.field4146 = arg0;
        this.field4139 = arg1;
    }

    @ObfuscatedName("ma.c(I)Lmy;")
    public class355 method5678() {
        return new class354();
    }

    @ObfuscatedName("ma.l(IB)[Lmy;")
    public class355[] method5679(int arg0) {
        return new class354[arg0];
    }

    @ObfuscatedName("ma.s(Ljava/lang/String;S)V")
    public final void method5715(String arg0) {
        this.field4140 = class338.method5193(arg0);
    }

    @ObfuscatedName("ma.v(Ljava/lang/String;I)V")
    public final void method5735(String arg0) {
        this.field4141 = class338.method5193(arg0);
    }

    @ObfuscatedName("ma.a(Lpi;B)V")
    public final void method5717(class421 arg0) {
        this.method5735(arg0.method6674());
        long var2 = arg0.method6670();
        this.method5715(class338.method4784(var2));
        this.field4143 = arg0.method6664();
        int var4 = arg0.method6686();
        if (var4 == 255) {
            return;
        }
        this.method5785();
        for (int var5 = 0; var5 < var4; var5++) {
            class354 var6 = (class354) this.method5793(new class442(arg0.method6674(), this.field4146));
            int var7 = arg0.method6666();
            var6.method5866(var7, ++this.field4144 - 1);
            var6.field4174 = arg0.method6664();
            arg0.method6674();
            this.method5720(var6);
        }
    }

    @ObfuscatedName("ma.y(Lpi;I)V")
    public final void method5713(class421 arg0) {
        class442 var2 = new class442(arg0.method6674(), this.field4146);
        int var3 = arg0.method6666();
        byte var4 = arg0.method6664();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5790() == 0) {
                return;
            }
            class354 var6 = (class354) this.method5789(var2);
            if (var6 != null && var6.method5867() == var3) {
                this.method5824(var6);
            }
            return;
        }
        arg0.method6674();
        class354 var7 = (class354) this.method5789(var2);
        if (var7 == null) {
            if (this.method5790() > this.field4168) {
                return;
            }
            var7 = (class354) this.method5793(var2);
        }
        var7.method5866(var3, ++this.field4144 - 1);
        var7.field4174 = var4;
        this.method5720(var7);
    }

    @ObfuscatedName("ma.u(I)V")
    public final void method5718() {
        for (int var1 = 0; var1 < this.method5790(); var1++) {
            ((class354) this.method5845(var1)).method5743();
        }
    }

    @ObfuscatedName("ma.h(I)V")
    public final void method5714() {
        for (int var1 = 0; var1 < this.method5790(); var1++) {
            ((class354) this.method5845(var1)).method5745();
        }
    }

    @ObfuscatedName("ma.q(Lmm;I)V")
    public final void method5720(class354 arg0) {
        if (arg0.method5770().equals(this.field4139.method1372())) {
            this.field4147 = arg0.field4174;
        }
    }
}
