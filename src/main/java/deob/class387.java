package deob;

@ObfuscatedName("nc")
public class class387 extends class393 {

    @ObfuscatedName("nc.f")
    public final class444 field4466;

    @ObfuscatedName("nc.c")
    public final class385 field4465;

    @ObfuscatedName("nc.x")
    public String field4468 = null;

    @ObfuscatedName("nc.h")
    public String field4469 = null;

    @ObfuscatedName("nc.j")
    public byte field4470;

    @ObfuscatedName("nc.y")
    public int field4472;

    @ObfuscatedName("nc.d")
    public int field4471 = 1;

    public class387(class444 arg0, class385 arg1) {
        super(500);
        this.field4466 = arg0;
        this.field4465 = arg1;
    }

    @ObfuscatedName("nc.a(B)Loj;")
    public class391 method6649() {
        return new class390();
    }

    @ObfuscatedName("nc.f(II)[Loj;")
    public class391[] method6650(int arg0) {
        return new class390[arg0];
    }

    @ObfuscatedName("nc.c(Ljava/lang/String;I)V")
    public final void method6675(String arg0) {
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
        String var9 = class360.method4800(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4468 = var9;
    }

    @ObfuscatedName("nc.n(Ljava/lang/String;B)V")
    public final void method6668(String arg0) {
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
        String var9 = class360.method4800(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4469 = var9;
    }

    @ObfuscatedName("nc.r(Lqr;IB)V")
    public final void method6669(class464 arg0, int arg1) {
        this.method6668(arg0.method7725());
        long var3 = arg0.method7721();
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
                var11.append(class360.field4305[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method6675(var7);
        this.field4470 = arg0.method7881();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method7735();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method7953();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method6756();
        for (int var17 = 0; var17 < var16; var17++) {
            class390 var18 = (class390) this.method6755(new class486(arg0.method7725(), this.field4466));
            int var19 = arg0.method7716();
            var18.method6839(var19, ++this.field4471 - 1);
            var18.field4496 = arg0.method7881();
            arg0.method7725();
            this.method6673(var18);
        }
    }

    @ObfuscatedName("nc.l(Lqr;B)V")
    public final void method6670(class464 arg0) {
        class486 var2 = new class486(arg0.method7725(), this.field4466);
        int var3 = arg0.method7716();
        byte var4 = arg0.method7881();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method6803() == 0) {
                return;
            }
            class390 var6 = (class390) this.method6761(var2);
            if (var6 != null && var6.method6834() == var3) {
                this.method6764(var6);
            }
            return;
        }
        arg0.method7725();
        class390 var7 = (class390) this.method6761(var2);
        if (var7 == null) {
            if (this.method6803() > this.field4489) {
                return;
            }
            var7 = (class390) this.method6755(var2);
        }
        var7.method6839(var3, ++this.field4471 - 1);
        var7.field4496 = var4;
        this.method6673(var7);
    }

    @ObfuscatedName("nc.s(S)V")
    public final void method6671() {
        for (int var1 = 0; var1 < this.method6803(); var1++) {
            ((class390) this.method6767(var1)).method6709();
        }
    }

    @ObfuscatedName("nc.p(B)V")
    public final void method6672() {
        for (int var1 = 0; var1 < this.method6803(); var1++) {
            ((class390) this.method6767(var1)).method6706();
        }
    }

    @ObfuscatedName("nc.b(Lni;I)V")
    public final void method6673(class390 arg0) {
        if (arg0.method6728().equals(this.field4465.method1145())) {
            this.field4472 = arg0.field4496;
        }
    }
}
