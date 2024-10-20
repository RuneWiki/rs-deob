package deob;

@ObfuscatedName("kt")
public class class296 extends class288 {

    @ObfuscatedName("kt.v")
    public final class349 field3676;

    @ObfuscatedName("kt.x")
    public final class291 field3672;

    @ObfuscatedName("kt.z")
    public String field3670 = null;

    @ObfuscatedName("kt.u")
    public String field3674 = null;

    @ObfuscatedName("kt.e")
    public byte field3675;

    @ObfuscatedName("kt.m")
    public int field3673;

    @ObfuscatedName("kt.c")
    public int field3677 = 1;

    public class296(class349 arg0, class291 arg1) {
        super(100);
        this.field3676 = arg0;
        this.field3672 = arg1;
    }

    @ObfuscatedName("kt.h(B)Lju;")
    public class285 method4716() {
        return new class284();
    }

    @ObfuscatedName("kt.v(II)[Lju;")
    public class285[] method4717(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("kt.x(Ljava/lang/String;I)V")
    public final void method4842(String arg0) {
        this.field3670 = class300.method3813(arg0);
    }

    @ObfuscatedName("kt.u(Ljava/lang/String;B)V")
    public final void method4857(String arg0) {
        this.field3674 = class300.method3813(arg0);
    }

    @ObfuscatedName("kt.e(Lkj;I)V")
    public final void method4846(class311 arg0) {
        this.method4857(arg0.method5202());
        long var2 = arg0.method5121();
        this.method4842(class300.method1097(var2));
        this.field3675 = arg0.method5148();
        int var4 = arg0.method5274();
        if (var4 == 255) {
            return;
        }
        this.method4755();
        for (int var5 = 0; var5 < var4; var5++) {
            class284 var6 = (class284) this.method4739(new class294(arg0.method5202(), this.field3676));
            int var7 = arg0.method5342();
            var6.method4801(var7, ++this.field3677 - 1);
            var6.field3652 = arg0.method5148();
            arg0.method5202();
            this.method4849(var6);
        }
    }

    @ObfuscatedName("kt.m(Lkj;S)V")
    public final void method4841(class311 arg0) {
        class294 var2 = new class294(arg0.method5202(), this.field3676);
        int var3 = arg0.method5342();
        byte var4 = arg0.method5148();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4731() == 0) {
                return;
            }
            class284 var6 = (class284) this.method4777(var2);
            if (var6 != null && var6.method4800() == var3) {
                this.method4738(var6);
            }
            return;
        }
        arg0.method5202();
        class284 var7 = (class284) this.method4777(var2);
        if (var7 == null) {
            if (this.method4731() > this.field3648) {
                return;
            }
            var7 = (class284) this.method4739(var2);
        }
        var7.method4801(var3, ++this.field3677 - 1);
        var7.field3652 = var4;
        this.method4849(var7);
    }

    @ObfuscatedName("kt.cz(B)V")
    public final void method4847() {
        for (int var1 = 0; var1 < this.method4731(); var1++) {
            ((class284) this.method4740(var1)).method4664();
        }
    }

    @ObfuscatedName("kt.cc(B)V")
    public final void method4848() {
        for (int var1 = 0; var1 < this.method4731(); var1++) {
            ((class284) this.method4740(var1)).method4670();
        }
    }

    @ObfuscatedName("kt.ce(Ljz;I)V")
    public final void method4849(class284 arg0) {
        if (arg0.method4699().equals(this.field3672.method1362())) {
            this.field3673 = arg0.field3652;
        }
    }
}
