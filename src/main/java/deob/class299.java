package deob;

@ObfuscatedName("kj")
public class class299 extends class300 {

    @ObfuscatedName("kj.i")
    public final class336 field3831;

    public class299(class336 arg0) {
        super(400);
        this.field3831 = arg0;
    }

    @ObfuscatedName("kj.t(B)Lkv;")
    public class297 method4899() {
        return new class301();
    }

    @ObfuscatedName("kj.q(II)[Lkv;")
    public class297[] method4897(int arg0) {
        return new class301[arg0];
    }

    @ObfuscatedName("kj.i(Lgb;II)V")
    public void method4898(class195 arg0, int arg1) {
        while (true) {
            if (arg0.field2545 < arg1) {
                int var3 = arg0.method3236();
                boolean var4 = (var3 & 0x1) == 1;
                class306 var5 = new class306(arg0.method3257(), this.field3831);
                class306 var6 = new class306(arg0.method3257(), this.field3831);
                arg0.method3257();
                if (var5 != null && var5.method5005()) {
                    class301 var7 = (class301) this.method4912(var4 ? var6 : var5);
                    if (var7 != null) {
                        this.method4957(var7, var5, var6);
                        continue;
                    }
                    if (this.method4908() < 400) {
                        int var8 = this.method4908();
                        class301 var9 = (class301) this.method4917(var5, var6);
                        var9.field3840 = var8;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
