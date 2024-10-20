package deob;

@ObfuscatedName("jl")
public class class286 extends class278 {

    @ObfuscatedName("jl.t")
    public final class339 field3628;

    @ObfuscatedName("jl.o")
    public final class281 field3624;

    @ObfuscatedName("jl.m")
    public String field3625 = null;

    @ObfuscatedName("jl.p")
    public String field3623 = null;

    @ObfuscatedName("jl.h")
    public byte field3627;

    @ObfuscatedName("jl.v")
    public int field3622;

    @ObfuscatedName("jl.n")
    public int field3629 = 1;

    public class286(class339 arg0, class281 arg1) {
        super(100);
        this.field3628 = arg0;
        this.field3624 = arg1;
    }

    @ObfuscatedName("jl.c(S)Ljk;")
    public class275 method4721() {
        return new class274();
    }

    @ObfuscatedName("jl.t(IB)[Ljk;")
    public class275[] method4722(int arg0) {
        return new class274[arg0];
    }

    @ObfuscatedName("jl.o(Ljava/lang/String;B)V")
    public final void method4875(String arg0) {
        String var2 = class290.method313(class290.method4025(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3625 = var2;
    }

    @ObfuscatedName("jl.j(Ljava/lang/String;B)V")
    public final void method4858(String arg0) {
        String var2 = class290.method313(class290.method4025(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3623 = var2;
    }

    @ObfuscatedName("jl.m(Lkp;I)V")
    public final void method4863(class301 arg0) {
        this.method4858(arg0.method5138());
        long var2 = arg0.method5311();
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
                var10.append(class290.field3644[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method4875(var6);
        this.field3627 = arg0.method5130();
        int var13 = arg0.method5129();
        if (var13 == 255) {
            return;
        }
        this.method4732();
        for (int var14 = 0; var14 < var13; var14++) {
            class274 var15 = (class274) this.method4741(new class284(arg0.method5138(), this.field3628));
            int var16 = arg0.method5124();
            var15.method4815(var16, ++this.field3629 - 1);
            var15.field3602 = arg0.method5130();
            arg0.method5138();
            this.method4862(var15);
        }
    }

    @ObfuscatedName("jl.p(Lkp;I)V")
    public final void method4859(class301 arg0) {
        class284 var2 = new class284(arg0.method5138(), this.field3628);
        int var3 = arg0.method5124();
        byte var4 = arg0.method5130();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4787() == 0) {
                return;
            }
            class274 var6 = (class274) this.method4737(var2);
            if (var6 != null && var6.method4811() == var3) {
                this.method4740(var6);
            }
            return;
        }
        arg0.method5138();
        class274 var7 = (class274) this.method4737(var2);
        if (var7 == null) {
            if (this.method4787() > this.field3597) {
                return;
            }
            var7 = (class274) this.method4741(var2);
        }
        var7.method4815(var3, ++this.field3629 - 1);
        var7.field3602 = var4;
        this.method4862(var7);
    }

    @ObfuscatedName("jl.h(B)V")
    public final void method4865() {
        for (int var1 = 0; var1 < this.method4787(); var1++) {
            ((class274) this.method4743(var1)).method4668();
        }
    }

    @ObfuscatedName("jl.cb(I)V")
    public final void method4878() {
        for (int var1 = 0; var1 < this.method4787(); var1++) {
            ((class274) this.method4743(var1)).method4684();
        }
    }

    @ObfuscatedName("jl.cf(Ljt;I)V")
    public final void method4862(class274 arg0) {
        if (arg0.method4689().equals(this.field3624.method1183())) {
            this.field3622 = arg0.field3602;
        }
    }
}
