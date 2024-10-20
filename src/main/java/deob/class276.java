package deob;

@ObfuscatedName("je")
public class class276 extends class277 {

    @ObfuscatedName("je.n")
    public final class338 field3587;

    public class276(class338 arg0) {
        super(400);
        this.field3587 = arg0;
    }

    @ObfuscatedName("je.a(I)Ljg;")
    public class274 method4749() {
        return new class278();
    }

    @ObfuscatedName("je.t(II)[Ljg;")
    public class274[] method4750(int arg0) {
        return new class278[arg0];
    }

    @ObfuscatedName("je.n(Lkc;IB)V")
    public void method4754(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3694 < arg1) {
                int var3 = arg0.method5123();
                boolean var4 = (var3 & 0x1) == 1;
                class283 var5 = new class283(arg0.method5132(), this.field3587);
                class283 var6 = new class283(arg0.method5132(), this.field3587);
                arg0.method5132();
                if (var5 != null && var5.method4854()) {
                    class278 var7 = (class278) this.method4760(var5);
                    if (var4) {
                        class278 var8 = (class278) this.method4760(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4763(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4768(var7, var5, var6);
                        continue;
                    }
                    if (this.method4756() < 400) {
                        int var9 = this.method4756();
                        class278 var10 = (class278) this.method4765(var5, var6);
                        var10.field3595 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
