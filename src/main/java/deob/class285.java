package deob;

@ObfuscatedName("je")
public class class285 extends class286 {

    @ObfuscatedName("je.s")
    public final class323 field3616;

    public class285(class323 arg0) {
        super(400);
        this.field3616 = arg0;
    }

    @ObfuscatedName("je.z(I)Ljx;")
    public class283 method4921() {
        return new class287();
    }

    @ObfuscatedName("je.w(II)[Ljx;")
    public class283[] method4924(int arg0) {
        return new class287[arg0];
    }

    @ObfuscatedName("je.s(Lgk;II)V")
    public void method4923(class183 arg0, int arg1) {
        while (true) {
            if (arg0.field2340 < arg1) {
                int var3 = arg0.method3247();
                boolean var4 = (var3 & 0x1) == 1;
                class292 var5 = new class292(arg0.method3441(), this.field3616);
                class292 var6 = new class292(arg0.method3441(), this.field3616);
                arg0.method3441();
                if (var5 != null && var5.method5027()) {
                    class287 var7 = (class287) this.method4937(var5);
                    if (var4) {
                        class287 var8 = (class287) this.method4937(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4940(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4944(var7, var5, var6);
                        continue;
                    }
                    if (this.method4933() < 400) {
                        int var9 = this.method4933();
                        class287 var10 = (class287) this.method4941(var5, var6);
                        var10.field3625 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
