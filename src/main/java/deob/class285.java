package deob;

@ObfuscatedName("jk")
public class class285 extends class277 {

    @ObfuscatedName("jk.n")
    public final class338 field3617;

    @ObfuscatedName("jk.v")
    public final class280 field3618;

    @ObfuscatedName("jk.i")
    public String field3620 = null;

    @ObfuscatedName("jk.c")
    public String field3621 = null;

    @ObfuscatedName("jk.b")
    public byte field3622;

    @ObfuscatedName("jk.o")
    public int field3619;

    @ObfuscatedName("jk.a")
    public int field3623 = 1;

    public class285(class338 arg0, class280 arg1) {
        super(100);
        this.field3617 = arg0;
        this.field3618 = arg1;
    }

    @ObfuscatedName("jk.z(B)Ljh;")
    public class274 method4599() {
        return new class273();
    }

    @ObfuscatedName("jk.n(II)[Ljh;")
    public class274[] method4598(int arg0) {
        return new class273[arg0];
    }

    @ObfuscatedName("jk.v(Ljava/lang/String;I)V")
    public final void method4723(String arg0) {
        this.field3620 = Statics.method2696(arg0);
    }

    @ObfuscatedName("jk.m(Ljava/lang/String;I)V")
    public final void method4744(String arg0) {
        this.field3621 = Statics.method2696(arg0);
    }

    @ObfuscatedName("jk.y(Lkl;S)V")
    public final void method4725(class300 arg0) {
        this.method4744(arg0.method4999());
        long var2 = arg0.method4996();
        long var4 = var2;
        String var6;
        if (var2 <= 0L || var2 >= 6582952005840035281L) {
            var6 = null;
        } else if (var2 % 37L == 0L) {
            var6 = null;
        } else {
            int var7 = 0;
            for (long var8 = var2; var8 != 0L; var8 /= 37L) {
                var7++;
            }
            StringBuilder var10 = new StringBuilder(var7);
            while (var4 != 0L) {
                long var11 = var4;
                var4 /= 37L;
                var10.append(class289.field3640[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method4723(var6);
        this.field3622 = arg0.method5002();
        int var13 = arg0.method4990();
        if (var13 == 255) {
            return;
        }
        this.method4609();
        for (int var14 = 0; var14 < var13; var14++) {
            class273 var15 = (class273) this.method4669(new class283(arg0.method4999(), this.field3617));
            int var16 = arg0.method4992();
            var15.method4686(var16, ++this.field3623 - 1);
            var15.field3599 = arg0.method5002();
            arg0.method4999();
            this.method4729(var15);
        }
    }

    @ObfuscatedName("jk.i(Lkl;B)V")
    public final void method4726(class300 arg0) {
        class283 var2 = new class283(arg0.method4999(), this.field3617);
        int var3 = arg0.method4992();
        byte var4 = arg0.method5002();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4637() == 0) {
                return;
            }
            class273 var6 = (class273) this.method4652(var2);
            if (var6 != null && var6.method4687() == var3) {
                this.method4678(var6);
            }
            return;
        }
        arg0.method4999();
        class273 var7 = (class273) this.method4652(var2);
        if (var7 == null) {
            if (this.method4637() > this.field3591) {
                return;
            }
            var7 = (class273) this.method4669(var2);
        }
        var7.method4686(var3, ++this.field3623 - 1);
        var7.field3599 = var4;
        this.method4729(var7);
    }

    @ObfuscatedName("jk.cr(I)V")
    public final void method4727() {
        for (int var1 = 0; var1 < this.method4637(); var1++) {
            ((class273) this.method4620(var1)).method4552();
        }
    }

    @ObfuscatedName("jk.ct(I)V")
    public final void method4728() {
        for (int var1 = 0; var1 < this.method4637(); var1++) {
            ((class273) this.method4620(var1)).method4554();
        }
    }

    @ObfuscatedName("jk.ci(Ljo;I)V")
    public final void method4729(class273 arg0) {
        if (arg0.method4570().equals(this.field3618.method1171())) {
            this.field3619 = arg0.field3599;
        }
    }
}
