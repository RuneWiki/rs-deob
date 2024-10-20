package deob;

@ObfuscatedName("ku")
public class class291 extends class292 {

    @ObfuscatedName("ku.g")
    public final class335 field3700;

    public class291(class335 arg0) {
        super(400);
        this.field3700 = arg0;
    }

    @ObfuscatedName("ku.a(I)Lkn;")
    public class289 method5128() {
        return new class293();
    }

    @ObfuscatedName("ku.s(IB)[Lkn;")
    public class289[] method5130(int arg0) {
        return new class293[arg0];
    }

    @ObfuscatedName("ku.g(Lgx;II)V")
    public void method5131(class190 arg0, int arg1) {
        while (true) {
            if (arg0.field2419 < arg1) {
                int var3 = arg0.method3443();
                boolean var4 = (var3 & 0x1) == 1;
                class298 var5 = new class298(arg0.method3647(), this.field3700);
                class298 var6 = new class298(arg0.method3647(), this.field3700);
                arg0.method3647();
                if (var5 != null && var5.method5238()) {
                    class293 var7 = (class293) this.method5174(var5);
                    if (var4) {
                        class293 var8 = (class293) this.method5174(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5147(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5144(var7, var5, var6);
                        continue;
                    }
                    if (this.method5140() < 400) {
                        int var9 = this.method5140();
                        class293 var10 = (class293) this.method5149(var5, var6);
                        var10.field3710 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
