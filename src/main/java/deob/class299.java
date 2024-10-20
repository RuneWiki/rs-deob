package deob;

@ObfuscatedName("kq")
public class class299 extends class300 {

    @ObfuscatedName("kq.o")
    public final class336 field3830;

    public class299(class336 arg0) {
        super(400);
        this.field3830 = arg0;
    }

    @ObfuscatedName("kq.c(I)Lku;")
    public class297 method4925() {
        return new class301();
    }

    @ObfuscatedName("kq.i(II)[Lku;")
    public class297[] method4932(int arg0) {
        return new class301[arg0];
    }

    @ObfuscatedName("kq.o(Lgp;IB)V")
    public void method4934(class195 arg0, int arg1) {
        while (true) {
            if (arg0.field2566 < arg1) {
                int var3 = arg0.method3429();
                boolean var4 = (var3 & 0x1) == 1;
                class306 var5 = new class306(arg0.method3427(), this.field3830);
                class306 var6 = new class306(arg0.method3427(), this.field3830);
                arg0.method3427();
                if (var5 != null && var5.method5052()) {
                    class301 var7 = (class301) this.method4943(var5);
                    if (var4) {
                        class301 var8 = (class301) this.method4943(var6);
                        if (var8 != null) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4945(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4950(var7, var5, var6);
                        continue;
                    }
                    if (this.method4938() < 400) {
                        int var9 = this.method4938();
                        class301 var10 = (class301) this.method4947(var5, var6);
                        var10.field3838 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
