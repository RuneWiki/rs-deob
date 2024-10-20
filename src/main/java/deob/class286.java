package deob;

@ObfuscatedName("jx")
public class class286 extends class278 {

    @ObfuscatedName("jx.w")
    public final class339 field3659;

    @ObfuscatedName("jx.e")
    public final class281 field3653;

    @ObfuscatedName("jx.f")
    public String field3656 = null;

    @ObfuscatedName("jx.m")
    public String field3657 = null;

    @ObfuscatedName("jx.u")
    public byte field3658;

    @ObfuscatedName("jx.x")
    public int field3654;

    @ObfuscatedName("jx.r")
    public int field3660 = 1;

    public class286(class339 arg0, class281 arg1) {
        super(100);
        this.field3659 = arg0;
        this.field3653 = arg1;
    }

    @ObfuscatedName("jx.q(I)Ljd;")
    public class275 method4683() {
        return new class274();
    }

    @ObfuscatedName("jx.w(II)[Ljd;")
    public class275[] method4685(int arg0) {
        return new class274[arg0];
    }

    @ObfuscatedName("jx.e(Ljava/lang/String;I)V")
    public final void method4817(String arg0) {
        this.field3656 = class290.method4020(arg0);
    }

    @ObfuscatedName("jx.c(Ljava/lang/String;I)V")
    public final void method4818(String arg0) {
        this.field3657 = class290.method4020(arg0);
    }

    @ObfuscatedName("jx.u(Lkf;I)V")
    public final void method4819(class301 arg0) {
        this.method4818(arg0.method5076());
        long var2 = arg0.method5104();
        this.method4817(class290.method2598(var2));
        this.field3658 = arg0.method5068();
        int var4 = arg0.method5077();
        if (var4 == 255) {
            return;
        }
        this.method4708();
        for (int var5 = 0; var5 < var4; var5++) {
            class274 var6 = (class274) this.method4701(new class284(arg0.method5076(), this.field3659));
            int var7 = arg0.method5069();
            var6.method4766(var7, ++this.field3660 - 1);
            var6.field3635 = arg0.method5068();
            arg0.method5076();
            this.method4823(var6);
        }
    }

    @ObfuscatedName("jx.ct(Lkf;I)V")
    public final void method4820(class301 arg0) {
        class284 var2 = new class284(arg0.method5076(), this.field3659);
        int var3 = arg0.method5069();
        byte var4 = arg0.method5068();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4694() == 0) {
                return;
            }
            class274 var6 = (class274) this.method4746(var2);
            if (var6 != null && var6.method4767() == var3) {
                this.method4700(var6);
            }
            return;
        }
        arg0.method5076();
        class274 var7 = (class274) this.method4746(var2);
        if (var7 == null) {
            if (this.method4694() > this.field3628) {
                return;
            }
            var7 = (class274) this.method4701(var2);
        }
        var7.method4766(var3, ++this.field3660 - 1);
        var7.field3635 = var4;
        this.method4823(var7);
    }

    @ObfuscatedName("jx.cq(I)V")
    public final void method4816() {
        for (int var1 = 0; var1 < this.method4694(); var1++) {
            ((class274) this.method4759(var1)).method4633();
        }
    }

    @ObfuscatedName("jx.cp(I)V")
    public final void method4821() {
        for (int var1 = 0; var1 < this.method4694(); var1++) {
            ((class274) this.method4759(var1)).method4635();
        }
    }

    @ObfuscatedName("jx.ch(Ljw;I)V")
    public final void method4823(class274 arg0) {
        if (arg0.method4656().equals(this.field3653.method1119())) {
            this.field3654 = arg0.field3635;
        }
    }
}
