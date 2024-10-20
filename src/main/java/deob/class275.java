package deob;

@ObfuscatedName("jq")
public class class275 extends class276 {

    @ObfuscatedName("jq.w")
    public final class314 field3680;

    public class275(class314 arg0) {
        super(400);
        this.field3680 = arg0;
    }

    @ObfuscatedName("jq.p(B)Lju;")
    public class274 method4667() {
        return new class277();
    }

    @ObfuscatedName("jq.i(II)[Lju;")
    public class274[] method4668(int arg0) {
        return new class277[arg0];
    }

    @ObfuscatedName("jq.w(Lgj;IS)V")
    public void method4676(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2488 < arg1) {
                int var3 = arg0.method3197();
                boolean var4 = (var3 & 0x1) == 1;
                class281 var5 = new class281(arg0.method3131(), this.field3680);
                class281 var6 = new class281(arg0.method3131(), this.field3680);
                arg0.method3131();
                if (var5 != null && var5.method4753()) {
                    class277 var7 = (class277) this.method4686(var4 ? var6 : var5);
                    if (var7 != null) {
                        this.method4688(var7, var5, var6);
                        continue;
                    }
                    if (this.method4682() < 400) {
                        class277 var8 = (class277) this.method4691(var5, var6);
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
