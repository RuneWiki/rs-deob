package deob;

@ObfuscatedName("ns")
public class class368 extends class373 {

    @ObfuscatedName("ns.c")
    public final class422 field4241;

    @ObfuscatedName("ns.i")
    public final class365 field4243;

    @ObfuscatedName("ns.f")
    public String field4240 = null;

    @ObfuscatedName("ns.b")
    public String field4242 = null;

    @ObfuscatedName("ns.n")
    public byte field4246;

    @ObfuscatedName("ns.s")
    public int field4244;

    @ObfuscatedName("ns.l")
    public int field4245 = 1;

    public class368(class422 arg0, class365 arg1) {
        super(100);
        this.field4241 = arg0;
        this.field4243 = arg1;
    }

    @ObfuscatedName("ns.v(I)Lnn;")
    public class371 method6030() {
        return new class370();
    }

    @ObfuscatedName("ns.c(II)[Lnn;")
    public class371[] method6037(int arg0) {
        return new class370[arg0];
    }

    @ObfuscatedName("ns.i(Ljava/lang/String;I)V")
    public final void method6053(String arg0) {
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
        String var9 = class350.method2012(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4240 = var9;
    }

    @ObfuscatedName("ns.n(Ljava/lang/String;I)V")
    public final void method6054(String arg0) {
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
        String var9 = class350.method2012(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4242 = var9;
    }

    @ObfuscatedName("ns.s(Lpi;I)V")
    public final void method6055(class438 arg0) {
        this.method6054(arg0.method6981());
        long var2 = arg0.method7003();
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
                var10.append(class350.field4146[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method6053(var6);
        this.field4246 = arg0.method7093();
        int var13 = arg0.method6971();
        if (var13 == 255) {
            return;
        }
        this.method6142();
        for (int var14 = 0; var14 < var13; var14++) {
            class370 var15 = (class370) this.method6137(new class459(arg0.method6981(), this.field4241));
            int var16 = arg0.method7148();
            var15.method6212(var16, ++this.field4245 - 1);
            var15.field4267 = arg0.method7093();
            arg0.method6981();
            this.method6052(var15);
        }
    }

    @ObfuscatedName("ns.l(Lpi;I)V")
    public final void method6059(class438 arg0) {
        class459 var2 = new class459(arg0.method6981(), this.field4241);
        int var3 = arg0.method7148();
        byte var4 = arg0.method7093();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method6129() == 0) {
                return;
            }
            class370 var6 = (class370) this.method6174(var2);
            if (var6 != null && var6.method6210() == var3) {
                this.method6136(var6);
            }
            return;
        }
        arg0.method6981();
        class370 var7 = (class370) this.method6174(var2);
        if (var7 == null) {
            if (this.method6129() > this.field4261) {
                return;
            }
            var7 = (class370) this.method6137(var2);
        }
        var7.method6212(var3, ++this.field4245 - 1);
        var7.field4267 = var4;
        this.method6052(var7);
    }

    @ObfuscatedName("ns.o(I)V")
    public final void method6057() {
        for (int var1 = 0; var1 < this.method6129(); var1++) {
            ((class370) this.method6139(var1)).method6082();
        }
    }

    @ObfuscatedName("ns.r(I)V")
    public final void method6061() {
        for (int var1 = 0; var1 < this.method6129(); var1++) {
            ((class370) this.method6139(var1)).method6084();
        }
    }

    @ObfuscatedName("ns.p(Lne;I)V")
    public final void method6052(class370 arg0) {
        if (arg0.method6104().equals(this.field4243.method1096())) {
            this.field4244 = arg0.field4267;
        }
    }
}
