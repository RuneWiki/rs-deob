package deob;

@ObfuscatedName("kn")
public class class299 extends class300 {

    @ObfuscatedName("kn.n")
    public final class336 field3830;

    public class299(class336 arg0) {
        super(400);
        this.field3830 = arg0;
    }

    @ObfuscatedName("kn.d(I)Lkm;")
    public class297 method4997() {
        return new class301();
    }

    @ObfuscatedName("kn.z(II)[Lkm;")
    public class297[] method4987(int arg0) {
        return new class301[arg0];
    }

    @ObfuscatedName("kn.n(Lgy;II)V")
    public void method4988(class195 arg0, int arg1) {
        while (true) {
            if (arg0.field2568 < arg1) {
                int var3 = arg0.method3330();
                boolean var4 = (var3 & 0x1) == 1;
                class306 var5 = new class306(arg0.method3268(), this.field3830);
                class306 var6 = new class306(arg0.method3268(), this.field3830);
                arg0.method3268();
                if (var5 != null && var5.method5096()) {
                    class301 var7 = (class301) this.method5004(var4 ? var6 : var5);
                    if (var7 != null) {
                        this.method5020(var7, var5, var6);
                        continue;
                    }
                    if (this.method5000() < 400) {
                        int var8 = this.method5000();
                        class301 var9 = (class301) this.method5049(var5, var6);
                        var9.field3838 = var8;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
