package deob;

@ObfuscatedName("ji")
public class class276 extends class277 {

    @ObfuscatedName("ji.t")
    public final class338 field3568;

    public class276(class338 arg0) {
        super(400);
        this.field3568 = arg0;
    }

    @ObfuscatedName("ji.c(I)Ljw;")
    public class274 method4718() {
        return new class278();
    }

    @ObfuscatedName("ji.x(II)[Ljw;")
    public class274[] method4712(int arg0) {
        return new class278[arg0];
    }

    @ObfuscatedName("ji.t(Lkz;IB)V")
    public void method4713(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3696 < arg1) {
                int var3 = arg0.method5103();
                boolean var4 = (var3 & 0x1) == 1;
                class283 var5 = new class283(arg0.method5112(), this.field3568);
                class283 var6 = new class283(arg0.method5112(), this.field3568);
                arg0.method5112();
                if (var5 != null && var5.method4814()) {
                    class278 var7 = (class278) this.method4728(var5);
                    if (var4) {
                        class278 var8 = (class278) this.method4728(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4731(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4736(var7, var5, var6);
                        continue;
                    }
                    if (this.method4784() < 400) {
                        int var9 = this.method4784();
                        class278 var10 = (class278) this.method4764(var5, var6);
                        var10.field3579 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
