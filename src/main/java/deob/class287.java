package deob;

@ObfuscatedName("ke")
public class class287 extends class288 {

    @ObfuscatedName("ke.l")
    public final class349 field3629;

    public class287(class349 arg0) {
        super(400);
        this.field3629 = arg0;
    }

    @ObfuscatedName("ke.f(I)Ljh;")
    public class285 method4799() {
        return new class289();
    }

    @ObfuscatedName("ke.b(IB)[Ljh;")
    public class285[] method4797(int arg0) {
        return new class289[arg0];
    }

    @ObfuscatedName("ke.l(Lkb;IB)V")
    public void method4798(class311 arg0, int arg1) {
        while (true) {
            if (arg0.field3741 < arg1) {
                int var3 = arg0.method5276();
                boolean var4 = (var3 & 0x1) == 1;
                class294 var5 = new class294(arg0.method5189(), this.field3629);
                class294 var6 = new class294(arg0.method5189(), this.field3629);
                arg0.method5189();
                if (var5 != null && var5.method4902()) {
                    class289 var7 = (class289) this.method4827(var5);
                    if (var4) {
                        class289 var8 = (class289) this.method4827(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4815(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4836(var7, var5, var6);
                        continue;
                    }
                    if (this.method4816() < 400) {
                        int var9 = this.method4816();
                        class289 var10 = (class289) this.method4826(var5, var6);
                        var10.field3639 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
