package deob;

@ObfuscatedName("lb")
public class class317 extends class323 {

    @ObfuscatedName("lb.o")
    public final class364 field3824;

    @ObfuscatedName("lb.u")
    public final class315 field3820;

    @ObfuscatedName("lb.p")
    public String field3826 = null;

    @ObfuscatedName("lb.b")
    public String field3822 = null;

    @ObfuscatedName("lb.e")
    public byte field3823;

    @ObfuscatedName("lb.k")
    public int field3821;

    @ObfuscatedName("lb.g")
    public int field3825 = 1;

    public class317(class364 arg0, class315 arg1) {
        super(100);
        this.field3824 = arg0;
        this.field3820 = arg1;
    }

    @ObfuscatedName("lb.f(I)Llt;")
    public class321 method5026() {
        return new class320();
    }

    @ObfuscatedName("lb.o(II)[Llt;")
    public class321[] method5027(int arg0) {
        return new class320[arg0];
    }

    @ObfuscatedName("lb.u(Ljava/lang/String;I)V")
    public final void method5039(String arg0) {
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
        String var9 = class305.method2002(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3826 = var9;
    }

    @ObfuscatedName("lb.h(Ljava/lang/String;I)V")
    public final void method5059(String arg0) {
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
        String var9 = class305.method2002(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3822 = var9;
    }

    @ObfuscatedName("lb.n(Lnu;I)V")
    public final void method5041(class382 arg0) {
        this.method5059(arg0.method5865());
        long var2 = arg0.method6069();
        this.method5039(class305.method142(var2));
        this.field3823 = arg0.method6045();
        int var4 = arg0.method5856();
        if (var4 == 255) {
            return;
        }
        this.method5158();
        for (int var5 = 0; var5 < var4; var5++) {
            class320 var6 = (class320) this.method5119(new class327(arg0.method5865(), this.field3824));
            int var7 = arg0.method5858();
            var6.method5189(var7, ++this.field3825 - 1);
            var6.field3853 = arg0.method6045();
            arg0.method5865();
            this.method5044(var6);
        }
    }

    @ObfuscatedName("lb.l(Lnu;I)V")
    public final void method5053(class382 arg0) {
        class327 var2 = new class327(arg0.method5865(), this.field3824);
        int var3 = arg0.method5858();
        byte var4 = arg0.method6045();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5111() == 0) {
                return;
            }
            class320 var6 = (class320) this.method5160(var2);
            if (var6 != null && var6.method5191() == var3) {
                this.method5118(var6);
            }
            return;
        }
        arg0.method5865();
        class320 var7 = (class320) this.method5160(var2);
        if (var7 == null) {
            if (this.method5111() > this.field3847) {
                return;
            }
            var7 = (class320) this.method5119(var2);
        }
        var7.method5189(var3, ++this.field3825 - 1);
        var7.field3853 = var4;
        this.method5044(var7);
    }

    @ObfuscatedName("lb.m(I)V")
    public final void method5042() {
        for (int var1 = 0; var1 < this.method5111(); var1++) {
            ((class320) this.method5121(var1)).method5072();
        }
    }

    @ObfuscatedName("lb.d(B)V")
    public final void method5043() {
        for (int var1 = 0; var1 < this.method5111(); var1++) {
            ((class320) this.method5121(var1)).method5075();
        }
    }

    @ObfuscatedName("lb.c(Lly;I)V")
    public final void method5044(class320 arg0) {
        if (arg0.method5088().equals(this.field3820.method999())) {
            this.field3821 = arg0.field3853;
        }
    }
}
