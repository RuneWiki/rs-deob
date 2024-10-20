package deob;

@ObfuscatedName("km")
public class class299 extends class300 {

    @ObfuscatedName("km.b")
    public final class336 field3840;

    public class299(class336 arg0) {
        super(400);
        this.field3840 = arg0;
    }

    @ObfuscatedName("km.g(I)Lkg;")
    public class297 method4959() {
        return new class301();
    }

    @ObfuscatedName("km.e(IB)[Lkg;")
    public class297[] method4956(int arg0) {
        return new class301[arg0];
    }

    @ObfuscatedName("km.b(Lgg;II)V")
    public void method4957(class195 arg0, int arg1) {
        while (true) {
            if (arg0.field2562 < arg1) {
                int var3 = arg0.method3332();
                boolean var4 = (var3 & 0x1) == 1;
                class306 var5 = new class306(arg0.method3429(), this.field3840);
                class306 var6 = new class306(arg0.method3429(), this.field3840);
                arg0.method3429();
                if (var5 != null && var5.method5061()) {
                    class301 var7 = (class301) this.method4974(var5);
                    if (var4) {
                        class301 var8 = (class301) this.method4974(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5013(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4980(var7, var5, var6);
                        continue;
                    }
                    if (this.method4979() < 400) {
                        int var9 = this.method4979();
                        class301 var10 = (class301) this.method4978(var5, var6);
                        var10.field3851 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
