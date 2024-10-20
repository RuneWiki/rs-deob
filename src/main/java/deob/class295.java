package deob;

@ObfuscatedName("kx")
public class class295 extends class287 {

    @ObfuscatedName("kx.k")
    public final class348 field3658;

    @ObfuscatedName("kx.s")
    public final class290 field3659;

    @ObfuscatedName("kx.m")
    public String field3655 = null;

    @ObfuscatedName("kx.n")
    public String field3656 = null;

    @ObfuscatedName("kx.d")
    public byte field3660;

    @ObfuscatedName("kx.h")
    public int field3657;

    @ObfuscatedName("kx.a")
    public int field3662 = 1;

    public class295(class348 arg0, class290 arg1) {
        super(100);
        this.field3658 = arg0;
        this.field3659 = arg1;
    }

    @ObfuscatedName("kx.z(B)Ljc;")
    public class284 method4798() {
        return new class283();
    }

    @ObfuscatedName("kx.k(IB)[Ljc;")
    public class284[] method4797(int arg0) {
        return new class283[arg0];
    }

    @ObfuscatedName("kx.s(Ljava/lang/String;I)V")
    public final void method4907(String arg0) {
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
        String var9 = class299.method143(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3655 = var9;
    }

    @ObfuscatedName("kx.o(Ljava/lang/String;B)V")
    public final void method4909(String arg0) {
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
        String var9 = class299.method143(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3656 = var9;
    }

    @ObfuscatedName("kx.x(Lkf;I)V")
    public final void method4910(class310 arg0) {
        this.method4909(arg0.method5202());
        long var2 = arg0.method5285();
        this.method4907(class299.method291(var2));
        this.field3660 = arg0.method5194();
        int var4 = arg0.method5193();
        if (var4 == 255) {
            return;
        }
        this.method4806();
        for (int var5 = 0; var5 < var4; var5++) {
            class283 var6 = (class283) this.method4809(new class293(arg0.method5202(), this.field3658));
            int var7 = arg0.method5195();
            var6.method4869(var7, ++this.field3662 - 1);
            var6.field3634 = arg0.method5194();
            arg0.method5202();
            this.method4914(var6);
        }
    }

    @ObfuscatedName("kx.bs(Lkf;I)V")
    public final void method4934(class310 arg0) {
        class293 var2 = new class293(arg0.method5202(), this.field3658);
        int var3 = arg0.method5195();
        byte var4 = arg0.method5194();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4801() == 0) {
                return;
            }
            class283 var6 = (class283) this.method4805(var2);
            if (var6 != null && var6.method4874() == var3) {
                this.method4835(var6);
            }
            return;
        }
        arg0.method5202();
        class283 var7 = (class283) this.method4805(var2);
        if (var7 == null) {
            if (this.method4801() > this.field3628) {
                return;
            }
            var7 = (class283) this.method4809(var2);
        }
        var7.method4869(var3, ++this.field3662 - 1);
        var7.field3634 = var4;
        this.method4914(var7);
    }

    @ObfuscatedName("kx.cg(I)V")
    public final void method4912() {
        for (int var1 = 0; var1 < this.method4801(); var1++) {
            ((class283) this.method4853(var1)).method4731();
        }
    }

    @ObfuscatedName("kx.ca(I)V")
    public final void method4906() {
        for (int var1 = 0; var1 < this.method4801(); var1++) {
            ((class283) this.method4853(var1)).method4734();
        }
    }

    @ObfuscatedName("kx.ct(Ljf;I)V")
    public final void method4914(class283 arg0) {
        if (arg0.method4757().equals(this.field3659.method1216())) {
            this.field3657 = arg0.field3634;
        }
    }
}
