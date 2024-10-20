package deob;

@ObfuscatedName("kk")
public class class295 extends class287 {

    @ObfuscatedName("kk.o")
    public final class348 field3658;

    @ObfuscatedName("kk.q")
    public final class290 field3659;

    @ObfuscatedName("kk.z")
    public String field3661 = null;

    @ObfuscatedName("kk.w")
    public String field3657 = null;

    @ObfuscatedName("kk.y")
    public byte field3662;

    @ObfuscatedName("kk.c")
    public int field3663;

    @ObfuscatedName("kk.h")
    public int field3664 = 1;

    public class295(class348 arg0, class290 arg1) {
        super(100);
        this.field3658 = arg0;
        this.field3659 = arg1;
    }

    @ObfuscatedName("kk.m(I)Ljf;")
    public class284 method4806() {
        return new class283();
    }

    @ObfuscatedName("kk.o(II)[Ljf;")
    public class284[] method4805(int arg0) {
        return new class283[arg0];
    }

    @ObfuscatedName("kk.q(Ljava/lang/String;B)V")
    public final void method4972(String arg0) {
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
        String var9 = class299.method205(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3661 = var9;
    }

    @ObfuscatedName("kk.a(Ljava/lang/String;I)V")
    public final void method4951(String arg0) {
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
        String var9 = class299.method205(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3657 = var9;
    }

    @ObfuscatedName("kk.z(Lkn;I)V")
    public final void method4952(class310 arg0) {
        this.method4951(arg0.method5236());
        long var2 = arg0.method5233();
        this.method4972(class299.method3102(var2));
        this.field3662 = arg0.method5228();
        int var4 = arg0.method5227();
        if (var4 == 255) {
            return;
        }
        this.method4816();
        for (int var5 = 0; var5 < var4; var5++) {
            class283 var6 = (class283) this.method4825(new class293(arg0.method5236(), this.field3658));
            int var7 = arg0.method5283();
            var6.method4899(var7, ++this.field3664 - 1);
            var6.field3642 = arg0.method5228();
            arg0.method5236();
            this.method4950(var6);
        }
    }

    @ObfuscatedName("kk.ci(Lkn;B)V")
    public final void method4949(class310 arg0) {
        class293 var2 = new class293(arg0.method5236(), this.field3658);
        int var3 = arg0.method5283();
        byte var4 = arg0.method5228();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4860() == 0) {
                return;
            }
            class283 var6 = (class283) this.method4886(var2);
            if (var6 != null && var6.method4911() == var3) {
                this.method4819(var6);
            }
            return;
        }
        arg0.method5236();
        class283 var7 = (class283) this.method4886(var2);
        if (var7 == null) {
            if (this.method4860() > this.field3633) {
                return;
            }
            var7 = (class283) this.method4825(var2);
        }
        var7.method4899(var3, ++this.field3664 - 1);
        var7.field3642 = var4;
        this.method4950(var7);
    }

    @ObfuscatedName("kk.cu(B)V")
    public final void method4954() {
        for (int var1 = 0; var1 < this.method4860(); var1++) {
            ((class283) this.method4827(var1)).method4755();
        }
    }

    @ObfuscatedName("kk.cq(B)V")
    public final void method4968() {
        for (int var1 = 0; var1 < this.method4860(); var1++) {
            ((class283) this.method4827(var1)).method4758();
        }
    }

    @ObfuscatedName("kk.co(Lji;I)V")
    public final void method4950(class283 arg0) {
        if (arg0.method4796().equals(this.field3659.method1203())) {
            this.field3663 = arg0.field3642;
        }
    }
}
