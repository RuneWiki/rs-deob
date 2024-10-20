package deob;

@ObfuscatedName("on")
public class class397 extends class403 {

    @ObfuscatedName("on.w")
    public final class454 field4551;

    @ObfuscatedName("on.v")
    public final class395 field4545;

    @ObfuscatedName("on.s")
    public String field4544 = null;

    @ObfuscatedName("on.z")
    public String field4547 = null;

    @ObfuscatedName("on.j")
    public byte field4548;

    @ObfuscatedName("on.i")
    public int field4549;

    @ObfuscatedName("on.n")
    public int field4550 = 1;

    public class397(class454 arg0, class395 arg1) {
        super(500);
        this.field4551 = arg0;
        this.field4545 = arg1;
    }

    @ObfuscatedName("on.f(I)Low;")
    public class401 method6946() {
        return new class400();
    }

    @ObfuscatedName("on.w(II)[Low;")
    public class401[] method6950(int arg0) {
        return new class400[arg0];
    }

    @ObfuscatedName("on.v(Ljava/lang/String;I)V")
    public final void method6964(String arg0) {
        String var2 = class367.method4917(class367.method1055(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4544 = var2;
    }

    @ObfuscatedName("on.n(Ljava/lang/String;S)V")
    public final void method6983(String arg0) {
        String var2 = class367.method4917(class367.method1055(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4547 = var2;
    }

    @ObfuscatedName("on.l(Lrd;IB)V")
    public final void method6970(class474 arg0, int arg1) {
        this.method6983(arg0.method7983());
        long var3 = arg0.method8151();
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
                var11.append(class367.field4372[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method6964(var7);
        this.field4548 = arg0.method7965();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method7964();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method7980();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method7050();
        for (int var17 = 0; var17 < var16; var17++) {
            class400 var18 = (class400) this.method7059(new class497(arg0.method7983(), this.field4551));
            int var19 = arg0.method8032();
            var18.method7140(var19, ++this.field4550 - 1);
            var18.field4576 = arg0.method7965();
            arg0.method7983();
            this.method6969(var18);
        }
    }

    @ObfuscatedName("on.k(Lrd;I)V")
    public final void method6967(class474 arg0) {
        class497 var2 = new class497(arg0.method7983(), this.field4551);
        int var3 = arg0.method8032();
        byte var4 = arg0.method7965();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7052() == 0) {
                return;
            }
            class400 var6 = (class400) this.method7055(var2);
            if (var6 != null && var6.method7136() == var3) {
                this.method7097(var6);
            }
            return;
        }
        arg0.method7983();
        class400 var7 = (class400) this.method7055(var2);
        if (var7 == null) {
            if (this.method7052() > this.field4566) {
                return;
            }
            var7 = (class400) this.method7059(var2);
        }
        var7.method7140(var3, ++this.field4550 - 1);
        var7.field4576 = var4;
        this.method6969(var7);
    }

    @ObfuscatedName("on.c(I)V")
    public final void method6980() {
        for (int var1 = 0; var1 < this.method7052(); var1++) {
            ((class400) this.method7069(var1)).method7000();
        }
    }

    @ObfuscatedName("on.r(I)V")
    public final void method6963() {
        for (int var1 = 0; var1 < this.method7052(); var1++) {
            ((class400) this.method7069(var1)).method7002();
        }
    }

    @ObfuscatedName("on.b(Log;I)V")
    public final void method6969(class400 arg0) {
        if (arg0.method7024().equals(this.field4545.method1173())) {
            this.field4549 = arg0.field4576;
        }
    }
}
