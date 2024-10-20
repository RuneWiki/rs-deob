package deob;

@ObfuscatedName("lf")
public class class320 extends class326 {

    @ObfuscatedName("lf.t")
    public final class367 field3831;

    @ObfuscatedName("lf.v")
    public final class318 field3836;

    @ObfuscatedName("lf.j")
    public String field3834 = null;

    @ObfuscatedName("lf.l")
    public String field3833 = null;

    @ObfuscatedName("lf.n")
    public byte field3832;

    @ObfuscatedName("lf.w")
    public int field3837;

    @ObfuscatedName("lf.f")
    public int field3838 = 1;

    public class320(class367 arg0, class318 arg1) {
        super(100);
        this.field3831 = arg0;
        this.field3836 = arg1;
    }

    @ObfuscatedName("lf.s(B)Llm;")
    public class324 method5114() {
        return new class323();
    }

    @ObfuscatedName("lf.t(II)[Llm;")
    public class324[] method5113(int arg0) {
        return new class323[arg0];
    }

    @ObfuscatedName("lf.v(Ljava/lang/String;I)V")
    public final void method5139(String arg0) {
        this.field3834 = Statics.method5219(arg0);
    }

    @ObfuscatedName("lf.o(Ljava/lang/String;I)V")
    public final void method5140(String arg0) {
        this.field3833 = Statics.method5219(arg0);
    }

    @ObfuscatedName("lf.x(Lnv;B)V")
    public final void method5150(class385 arg0) {
        this.method5140(arg0.method5967());
        long var2 = arg0.method5964();
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
                var10.append(class308.field3764[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5139(var6);
        this.field3832 = arg0.method5959();
        int var13 = arg0.method5958();
        if (var13 == 255) {
            return;
        }
        this.method5221();
        for (int var14 = 0; var14 < var13; var14++) {
            class323 var15 = (class323) this.method5229(new class406(arg0.method5967(), this.field3831));
            int var16 = arg0.method6053();
            var15.method5304(var16, ++this.field3838 - 1);
            var15.field3866 = arg0.method5959();
            arg0.method5967();
            this.method5151(var15);
        }
    }

    @ObfuscatedName("lf.r(Lnv;B)V")
    public final void method5142(class385 arg0) {
        class406 var2 = new class406(arg0.method5967(), this.field3831);
        int var3 = arg0.method6053();
        byte var4 = arg0.method5959();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5235() == 0) {
                return;
            }
            class323 var6 = (class323) this.method5225(var2);
            if (var6 != null && var6.method5297() == var3) {
                this.method5228(var6);
            }
            return;
        }
        arg0.method5967();
        class323 var7 = (class323) this.method5225(var2);
        if (var7 == null) {
            if (this.method5235() > this.field3860) {
                return;
            }
            var7 = (class323) this.method5229(var2);
        }
        var7.method5304(var3, ++this.field3838 - 1);
        var7.field3866 = var4;
        this.method5151(var7);
    }

    @ObfuscatedName("lf.p(I)V")
    public final void method5143() {
        for (int var1 = 0; var1 < this.method5235(); var1++) {
            ((class323) this.method5231(var1)).method5194();
        }
    }

    @ObfuscatedName("lf.h(I)V")
    public final void method5156() {
        for (int var1 = 0; var1 < this.method5235(); var1++) {
            ((class323) this.method5231(var1)).method5181();
        }
    }

    @ObfuscatedName("lf.k(Llg;B)V")
    public final void method5151(class323 arg0) {
        if (arg0.method5204().equals(this.field3836.method854())) {
            this.field3837 = arg0.field3866;
        }
    }
}
