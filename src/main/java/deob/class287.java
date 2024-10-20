package deob;

@ObfuscatedName("kp")
public class class287 extends class288 {

    @ObfuscatedName("kp.d")
    public final class349 field3633;

    public class287(class349 arg0) {
        super(400);
        this.field3633 = arg0;
    }

    @ObfuscatedName("kp.n(I)Ljn;")
    public class285 method4873() {
        return new class289();
    }

    @ObfuscatedName("kp.v(II)[Ljn;")
    public class285[] method4874(int arg0) {
        return new class289[arg0];
    }

    @ObfuscatedName("kp.d(Lkx;II)V")
    public void method4875(class311 arg0, int arg1) {
        while (true) {
            if (arg0.field3747 < arg1) {
                int var3 = arg0.method5310();
                boolean var4 = (var3 & 0x1) == 1;
                class294 var5 = new class294(arg0.method5465(), this.field3633);
                class294 var6 = new class294(arg0.method5465(), this.field3633);
                arg0.method5465();
                if (var5 != null && var5.method4966()) {
                    class289 var7 = (class289) this.method4892(var5);
                    if (var4) {
                        class289 var8 = (class289) this.method4892(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4888(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4893(var7, var5, var6);
                        continue;
                    }
                    if (this.method4882() < 400) {
                        int var9 = this.method4882();
                        class289 var10 = (class289) this.method4941(var5, var6);
                        var10.field3642 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
