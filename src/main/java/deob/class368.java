package deob;

@ObfuscatedName("nn")
public class class368 extends class374 {

    @ObfuscatedName("nn.h")
    public final class424 field4286;

    @ObfuscatedName("nn.w")
    public final class366 field4287;

    @ObfuscatedName("nn.v")
    public String field4291 = null;

    @ObfuscatedName("nn.c")
    public String field4289 = null;

    @ObfuscatedName("nn.q")
    public byte field4290;

    @ObfuscatedName("nn.i")
    public int field4285;

    @ObfuscatedName("nn.k")
    public int field4292 = 1;

    public class368(class424 arg0, class366 arg1) {
        super(500);
        this.field4286 = arg0;
        this.field4287 = arg1;
    }

    @ObfuscatedName("nn.s(I)Lnb;")
    public class372 method5922() {
        return new class371();
    }

    @ObfuscatedName("nn.h(II)[Lnb;")
    public class372[] method5924(int arg0) {
        return new class371[arg0];
    }

    @ObfuscatedName("nn.w(Ljava/lang/String;I)V")
    public final void method5939(String arg0) {
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        String var9 = class346.method4871(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4291 = var9;
    }

    @ObfuscatedName("nn.o(Ljava/lang/String;B)V")
    public final void method5941(String arg0) {
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        String var9 = class346.method4871(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4289 = var9;
    }

    @ObfuscatedName("nn.n(Lqr;II)V")
    public final void method5940(class444 arg0, int arg1) {
        this.method5941(arg0.method6975());
        long var3 = arg0.method6935();
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
                var11.append(class346.field4159[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method5939(var7);
        this.field4290 = arg0.method6930();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method6929();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method6999();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method6020();
        for (int var17 = 0; var17 < var16; var17++) {
            class371 var18 = (class371) this.method6089(new class465(arg0.method6975(), this.field4286));
            int var19 = arg0.method7120();
            var18.method6104(var19, ++this.field4292 - 1);
            var18.field4326 = arg0.method6930();
            arg0.method6975();
            this.method5946(var18);
        }
    }

    @ObfuscatedName("nn.d(Lqr;I)V")
    public final void method5943(class444 arg0) {
        class465 var2 = new class465(arg0.method6975(), this.field4286);
        int var3 = arg0.method7120();
        byte var4 = arg0.method6930();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method6067() == 0) {
                return;
            }
            class371 var6 = (class371) this.method6025(var2);
            if (var6 != null && var6.method6106() == var3) {
                this.method6086(var6);
            }
            return;
        }
        arg0.method6975();
        class371 var7 = (class371) this.method6025(var2);
        if (var7 == null) {
            if (this.method6067() > this.field4317) {
                return;
            }
            var7 = (class371) this.method6089(var2);
        }
        var7.method6104(var3, ++this.field4292 - 1);
        var7.field4326 = var4;
        this.method5946(var7);
    }

    @ObfuscatedName("nn.a(I)V")
    public final void method5944() {
        for (int var1 = 0; var1 < this.method6067(); var1++) {
            ((class371) this.method6051(var1)).method5980();
        }
    }

    @ObfuscatedName("nn.m(I)V")
    public final void method5945() {
        for (int var1 = 0; var1 < this.method6067(); var1++) {
            ((class371) this.method6051(var1)).method5983();
        }
    }

    @ObfuscatedName("nn.u(Lnp;S)V")
    public final void method5946(class371 arg0) {
        if (arg0.method5996().equals(this.field4287.method1132())) {
            this.field4285 = arg0.field4326;
        }
    }
}
