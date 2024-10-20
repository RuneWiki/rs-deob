package deob;

@ObfuscatedName("jq")
public class class285 extends class286 {

    @ObfuscatedName("jq.o")
    public final class327 field3708;

    public class285(class327 arg0) {
        super(400);
        this.field3708 = arg0;
    }

    @ObfuscatedName("jq.b(I)Ljw;")
    public class283 method4814() {
        return new class287();
    }

    @ObfuscatedName("jq.q(IB)[Ljw;")
    public class283[] method4816(int arg0) {
        return new class287[arg0];
    }

    @ObfuscatedName("jq.o(Lgn;II)V")
    public void method4824(class194 arg0, int arg1) {
        while (true) {
            if (arg0.field2538 < arg1) {
                int var3 = arg0.method3247();
                boolean var4 = (var3 & 0x1) == 1;
                class292 var5 = new class292(arg0.method3256(), this.field3708);
                class292 var6 = new class292(arg0.method3256(), this.field3708);
                arg0.method3256();
                if (var5 != null && var5.method4927()) {
                    class287 var7 = (class287) this.method4831(var4 ? var6 : var5);
                    if (var7 != null) {
                        this.method4839(var7, var5, var6);
                        continue;
                    }
                    if (this.method4827() < 400) {
                        int var8 = this.method4827();
                        class287 var9 = (class287) this.method4836(var5, var6);
                        var9.field3717 = var8;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
