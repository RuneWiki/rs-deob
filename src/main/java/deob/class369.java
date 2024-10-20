package deob;

@ObfuscatedName("nf")
public class class369 extends class375 {

    @ObfuscatedName("nf.p")
    public final class425 field4333;

    @ObfuscatedName("nf.f")
    public final class367 field4334;

    @ObfuscatedName("nf.n")
    public String field4339 = null;

    @ObfuscatedName("nf.k")
    public String field4335 = null;

    @ObfuscatedName("nf.w")
    public byte field4337;

    @ObfuscatedName("nf.s")
    public int field4338;

    @ObfuscatedName("nf.q")
    public int field4332 = 1;

    public class369(class425 arg0, class367 arg1) {
        super(500);
        this.field4333 = arg0;
        this.field4334 = arg1;
    }

    @ObfuscatedName("nf.c(B)Lnc;")
    public class373 method6155() {
        return new class372();
    }

    @ObfuscatedName("nf.p(IB)[Lnc;")
    public class373[] method6159(int arg0) {
        return new class372[arg0];
    }

    @ObfuscatedName("nf.f(Ljava/lang/String;I)V")
    public final void method6174(String arg0) {
        String var2 = class347.method4666(class347.method4665(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4339 = var2;
    }

    @ObfuscatedName("nf.q(Ljava/lang/String;B)V")
    public final void method6191(String arg0) {
        String var2 = class347.method4666(class347.method4665(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4335 = var2;
    }

    @ObfuscatedName("nf.m(Lqq;II)V")
    public final void method6189(class445 arg0, int arg1) {
        this.method6191(arg0.method7206());
        long var3 = arg0.method7319();
        long var5 = var3;
        String var7;
        if (var3 <= 0L || var3 >= 6582952005840035281L) {
            var7 = null;
        } else if (var3 % 37L == 0L) {
            var7 = null;
        } else {
            int var8 = 0;
            for (long var9 = var3; var9 != 0L; var9 /= 37L) {
                var8++;
            }
            StringBuilder var11 = new StringBuilder(var8);
            while (var5 != 0L) {
                long var12 = var5;
                var5 /= 37L;
                var11.append(class347.field4199[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method6174(var7);
        this.field4337 = arg0.method7197();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method7196();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method7212();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method6265();
        for (int var17 = 0; var17 < var16; var17++) {
            class372 var18 = (class372) this.method6254(new class466(arg0.method7206(), this.field4333));
            int var19 = arg0.method7198();
            var18.method6327(var19, ++this.field4332 - 1);
            var18.field4368 = arg0.method7197();
            arg0.method7206();
            this.method6179(var18);
        }
    }

    @ObfuscatedName("nf.x(Lqq;I)V")
    public final void method6177(class445 arg0) {
        class466 var2 = new class466(arg0.method7206(), this.field4333);
        int var3 = arg0.method7198();
        byte var4 = arg0.method7197();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method6246() == 0) {
                return;
            }
            class372 var6 = (class372) this.method6250(var2);
            if (var6 != null && var6.method6328() == var3) {
                this.method6253(var6);
            }
            return;
        }
        arg0.method7206();
        class372 var7 = (class372) this.method6250(var2);
        if (var7 == null) {
            if (this.method6246() > this.field4360) {
                return;
            }
            var7 = (class372) this.method6254(var2);
        }
        var7.method6327(var3, ++this.field4332 - 1);
        var7.field4368 = var4;
        this.method6179(var7);
    }

    @ObfuscatedName("nf.j(I)V")
    public final void method6173() {
        for (int var1 = 0; var1 < this.method6246(); var1++) {
            ((class372) this.method6256(var1)).method6219();
        }
    }

    @ObfuscatedName("nf.v(I)V")
    public final void method6180() {
        for (int var1 = 0; var1 < this.method6246(); var1++) {
            ((class372) this.method6256(var1)).method6207();
        }
    }

    @ObfuscatedName("nf.h(Lnh;I)V")
    public final void method6179(class372 arg0) {
        if (arg0.method6224().equals(this.field4334.method1538())) {
            this.field4338 = arg0.field4368;
        }
    }
}
