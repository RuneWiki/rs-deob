package deob;

@ObfuscatedName("kz")
public class class287 extends class288 {

    @ObfuscatedName("kz.o")
    public final class326 field3650;

    public class287(class326 arg0) {
        super(400);
        this.field3650 = arg0;
    }

    @ObfuscatedName("kz.v(I)Ljx;")
    public class285 method4986() {
        return new class289();
    }

    @ObfuscatedName("kz.s(II)[Ljx;")
    public class285[] method4976(int arg0) {
        return new class289[arg0];
    }

    @ObfuscatedName("kz.o(Lgx;IB)V")
    public void method4977(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2386 < arg1) {
                int var3 = arg0.method3274();
                boolean var4 = (var3 & 0x1) == 1;
                class294 var5 = new class294(arg0.method3490(), this.field3650);
                class294 var6 = new class294(arg0.method3490(), this.field3650);
                arg0.method3490();
                if (var5 != null && var5.method5084()) {
                    class289 var7 = (class289) this.method5015(var5);
                    if (var4) {
                        class289 var8 = (class289) this.method5015(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5020(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5036(var7, var5, var6);
                        continue;
                    }
                    if (this.method4991() < 400) {
                        int var9 = this.method4991();
                        class289 var10 = (class289) this.method5007(var5, var6);
                        var10.field3660 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
