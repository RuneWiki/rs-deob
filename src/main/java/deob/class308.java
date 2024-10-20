package deob;

@ObfuscatedName("kl")
public class class308 extends class300 {

    @ObfuscatedName("kl.q")
    public final class336 field3868;

    @ObfuscatedName("kl.i")
    public final class303 field3867;

    @ObfuscatedName("kl.g")
    public String field3872 = null;

    @ObfuscatedName("kl.n")
    public String field3869 = null;

    @ObfuscatedName("kl.o")
    public byte field3866;

    @ObfuscatedName("kl.c")
    public int field3871;

    @ObfuscatedName("kl.v")
    public int field3865 = 1;

    public class308(class336 arg0, class303 arg1) {
        super(100);
        this.field3868 = arg0;
        this.field3867 = arg1;
    }

    @ObfuscatedName("kl.t(B)Lkv;")
    public class297 method4899() {
        return new class296();
    }

    @ObfuscatedName("kl.q(II)[Lkv;")
    public class297[] method4897(int arg0) {
        return new class296[arg0];
    }

    @ObfuscatedName("kl.i(Ljava/lang/String;S)V")
    public final void method5027(String arg0) {
        String var2 = class317.method188(class317.method79(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3872 = var2;
    }

    @ObfuscatedName("kl.p(Ljava/lang/String;I)V")
    public final void method5028(String arg0) {
        String var2 = class317.method188(class317.method79(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3869 = var2;
    }

    @ObfuscatedName("kl.o(Lgb;B)V")
    public final void method5029(class195 arg0) {
        this.method5028(arg0.method3257());
        long var2 = arg0.method3315();
        this.method5027(class317.method7(var2));
        this.field3866 = arg0.method3237();
        int var4 = arg0.method3236();
        if (var4 == 255) {
            return;
        }
        this.method4907();
        for (int var5 = 0; var5 < var4; var5++) {
            class296 var6 = (class296) this.method4941(new class306(arg0.method3257(), this.field3868));
            int var7 = arg0.method3238();
            var6.method4995(var7, ++this.field3865 - 1);
            var6.field3844 = arg0.method3237();
            arg0.method3257();
            this.method5033(var6);
        }
    }

    @ObfuscatedName("kl.ce(Lgb;I)V")
    public final void method5030(class195 arg0) {
        class306 var2 = new class306(arg0.method3257(), this.field3868);
        int var3 = arg0.method3238();
        byte var4 = arg0.method3237();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4908() == 0) {
                return;
            }
            class296 var6 = (class296) this.method4912(var2);
            if (var6 != null && var6.method4997() == var3) {
                this.method4915(var6);
            }
            return;
        }
        arg0.method3257();
        class296 var7 = (class296) this.method4911(var2);
        if (var7 == null) {
            if (this.method4908() > this.field3838) {
                return;
            }
            var7 = (class296) this.method4941(var2);
        }
        var7.method4995(var3, ++this.field3865 - 1);
        var7.field3844 = var4;
        this.method5033(var7);
    }

    @ObfuscatedName("kl.cx(I)V")
    public final void method5031() {
        for (int var1 = 0; var1 < this.method4908(); var1++) {
            ((class296) this.method4918(var1)).method4837();
        }
    }

    @ObfuscatedName("kl.cy(B)V")
    public final void method5043() {
        for (int var1 = 0; var1 < this.method4908(); var1++) {
            ((class296) this.method4918(var1)).method4841();
        }
    }

    @ObfuscatedName("kl.cg(Lki;I)V")
    public final void method5033(class296 arg0) {
        if (arg0.method4856().equals(this.field3867.method1165())) {
            this.field3871 = arg0.field3844;
        }
    }
}
