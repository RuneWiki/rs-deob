package deob;

@ObfuscatedName("ki")
public class class287 extends class288 {

    @ObfuscatedName("ki.e")
    public final class331 field3683;

    public class287(class331 arg0) {
        super(400);
        this.field3683 = arg0;
    }

    @ObfuscatedName("ki.f(B)Ljw;")
    public class285 method4952() {
        return new class289();
    }

    @ObfuscatedName("ki.h(II)[Ljw;")
    public class285[] method4962(int arg0) {
        return new class289[arg0];
    }

    @ObfuscatedName("ki.e(Lgx;II)V")
    public void method4953(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2397 < arg1) {
                int var3 = arg0.method3323();
                boolean var4 = (var3 & 0x1) == 1;
                class294 var5 = new class294(arg0.method3435(), this.field3683);
                class294 var6 = new class294(arg0.method3435(), this.field3683);
                arg0.method3435();
                if (var5 != null && var5.method5060()) {
                    class289 var7 = (class289) this.method4967(var5);
                    if (var4) {
                        class289 var8 = (class289) this.method4967(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4973(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4978(var7, var5, var6);
                        continue;
                    }
                    if (this.method4966() < 400) {
                        int var9 = this.method4966();
                        class289 var10 = (class289) this.method4975(var5, var6);
                        var10.field3692 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
