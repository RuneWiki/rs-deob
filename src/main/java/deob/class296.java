package deob;

@ObfuscatedName("kn")
public class class296 extends class288 {

    @ObfuscatedName("kn.s")
    public final class326 field3685;

    @ObfuscatedName("kn.o")
    public final class291 field3686;

    @ObfuscatedName("kn.b")
    public String field3687 = null;

    @ObfuscatedName("kn.c")
    public String field3688 = null;

    @ObfuscatedName("kn.d")
    public byte field3689;

    @ObfuscatedName("kn.w")
    public int field3690;

    @ObfuscatedName("kn.a")
    public int field3684 = 1;

    public class296(class326 arg0, class291 arg1) {
        super(100);
        this.field3685 = arg0;
        this.field3686 = arg1;
    }

    @ObfuscatedName("kn.v(I)Ljx;")
    public class285 method4986() {
        return new class284();
    }

    @ObfuscatedName("kn.s(II)[Ljx;")
    public class285[] method4976(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("kn.o(Ljava/lang/String;I)V")
    public final void method5129(String arg0) {
        String var2 = class306.method1772(Statics.method4259(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3687 = var2;
    }

    @ObfuscatedName("kn.z(Ljava/lang/String;I)V")
    public final void method5123(String arg0) {
        String var2 = class306.method1772(Statics.method4259(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3688 = var2;
    }

    @ObfuscatedName("kn.e(Lgx;I)V")
    public final void method5113(class185 arg0) {
        this.method5123(arg0.method3490());
        long var2 = arg0.method3280();
        this.method5129(class306.method4857(var2));
        this.field3689 = arg0.method3275();
        int var4 = arg0.method3274();
        if (var4 == 255) {
            return;
        }
        this.method4990();
        for (int var5 = 0; var5 < var4; var5++) {
            class284 var6 = (class284) this.method4998(new class294(arg0.method3490(), this.field3685));
            int var7 = arg0.method3276();
            var6.method5073(var7, ++this.field3684 - 1);
            var6.field3663 = arg0.method3275();
            arg0.method3490();
            this.method5117(var6);
        }
    }

    @ObfuscatedName("kn.q(Lgx;I)V")
    public final void method5114(class185 arg0) {
        class294 var2 = new class294(arg0.method3490(), this.field3685);
        int var3 = arg0.method3276();
        byte var4 = arg0.method3275();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4991() == 0) {
                return;
            }
            class284 var6 = (class284) this.method5015(var2);
            if (var6 != null && var6.method5068() == var3) {
                this.method5020(var6);
            }
            return;
        }
        arg0.method3490();
        class284 var7 = (class284) this.method5015(var2);
        if (var7 == null) {
            if (this.method4991() > this.field3653) {
                return;
            }
            var7 = (class284) this.method4998(var2);
        }
        var7.method5073(var3, ++this.field3684 - 1);
        var7.field3663 = var4;
        this.method5117(var7);
    }

    @ObfuscatedName("kn.cr(I)V")
    public final void method5115() {
        for (int var1 = 0; var1 < this.method4991(); var1++) {
            ((class284) this.method5000(var1)).method4931();
        }
    }

    @ObfuscatedName("kn.co(B)V")
    public final void method5116() {
        for (int var1 = 0; var1 < this.method4991(); var1++) {
            ((class284) this.method5000(var1)).method4934();
        }
    }

    @ObfuscatedName("kn.cy(Ljz;I)V")
    public final void method5117(class284 arg0) {
        if (arg0.method4951().equals(this.field3686.method1103())) {
            this.field3690 = arg0.field3663;
        }
    }
}
