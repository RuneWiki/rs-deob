package deob;

@ObfuscatedName("lt")
public class class318 extends class324 {

    @ObfuscatedName("lt.n")
    public final class365 field3823;

    @ObfuscatedName("lt.f")
    public final class316 field3816;

    @ObfuscatedName("lt.y")
    public String field3817 = null;

    @ObfuscatedName("lt.p")
    public String field3814 = null;

    @ObfuscatedName("lt.j")
    public byte field3819;

    @ObfuscatedName("lt.r")
    public int field3820;

    @ObfuscatedName("lt.b")
    public int field3818 = 1;

    public class318(class365 arg0, class316 arg1) {
        super(100);
        this.field3823 = arg0;
        this.field3816 = arg1;
    }

    @ObfuscatedName("lt.v(B)Llx;")
    public class322 method5146() {
        return new class321();
    }

    @ObfuscatedName("lt.n(II)[Llx;")
    public class322[] method5149(int arg0) {
        return new class321[arg0];
    }

    @ObfuscatedName("lt.f(Ljava/lang/String;B)V")
    public final void method5186(String arg0) {
        this.field3817 = class306.method3291(arg0);
    }

    @ObfuscatedName("lt.b(Ljava/lang/String;I)V")
    public final void method5169(String arg0) {
        this.field3814 = class306.method3291(arg0);
    }

    @ObfuscatedName("lt.d(Lnd;I)V")
    public final void method5170(class383 arg0) {
        this.method5169(arg0.method5974());
        long var2 = arg0.method5971();
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
                var10.append(class306.field3753[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5186(var6);
        this.field3819 = arg0.method5966();
        int var13 = arg0.method5965();
        if (var13 == 255) {
            return;
        }
        this.method5284();
        for (int var14 = 0; var14 < var13; var14++) {
            class321 var15 = (class321) this.method5254(new class328(arg0.method5974(), this.field3823));
            int var16 = arg0.method5967();
            var15.method5329(var16, ++this.field3818 - 1);
            var15.field3852 = arg0.method5966();
            arg0.method5974();
            this.method5174(var15);
        }
    }

    @ObfuscatedName("lt.s(Lnd;I)V")
    public final void method5173(class383 arg0) {
        class328 var2 = new class328(arg0.method5974(), this.field3823);
        int var3 = arg0.method5967();
        byte var4 = arg0.method5966();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5246() == 0) {
                return;
            }
            class321 var6 = (class321) this.method5250(var2);
            if (var6 != null && var6.method5330() == var3) {
                this.method5253(var6);
            }
            return;
        }
        arg0.method5974();
        class321 var7 = (class321) this.method5250(var2);
        if (var7 == null) {
            if (this.method5246() > this.field3843) {
                return;
            }
            var7 = (class321) this.method5254(var2);
        }
        var7.method5329(var3, ++this.field3818 - 1);
        var7.field3852 = var4;
        this.method5174(var7);
    }

    @ObfuscatedName("lt.u(I)V")
    public final void method5172() {
        for (int var1 = 0; var1 < this.method5246(); var1++) {
            ((class321) this.method5256(var1)).method5202();
        }
    }

    @ObfuscatedName("lt.l(I)V")
    public final void method5183() {
        for (int var1 = 0; var1 < this.method5246(); var1++) {
            ((class321) this.method5256(var1)).method5208();
        }
    }

    @ObfuscatedName("lt.o(Lll;I)V")
    public final void method5174(class321 arg0) {
        if (arg0.method5229().equals(this.field3816.method1036())) {
            this.field3820 = arg0.field3852;
        }
    }
}
