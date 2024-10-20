package deob;

@ObfuscatedName("kk")
public class class290 extends class291 {

    @ObfuscatedName("kk.l")
    public final class334 field3690;

    public class290(class334 arg0) {
        super(400);
        this.field3690 = arg0;
    }

    @ObfuscatedName("kk.n(I)Lke;")
    public class288 method5155() {
        return new class292();
    }

    @ObfuscatedName("kk.h(IB)[Lke;")
    public class288[] method5156(int arg0) {
        return new class292[arg0];
    }

    @ObfuscatedName("kk.l(Lgc;II)V")
    public void method5157(class190 arg0, int arg1) {
        while (true) {
            if (arg0.field2423 < arg1) {
                int var3 = arg0.method3511();
                boolean var4 = (var3 & 0x1) == 1;
                class297 var5 = new class297(arg0.method3520(), this.field3690);
                class297 var6 = new class297(arg0.method3520(), this.field3690);
                arg0.method3520();
                if (var5 != null && var5.method5264()) {
                    class292 var7 = (class292) this.method5211(var5);
                    if (var4) {
                        class292 var8 = (class292) this.method5211(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5167(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5183(var7, var5, var6);
                        continue;
                    }
                    if (this.method5164() < 400) {
                        int var9 = this.method5164();
                        class292 var10 = (class292) this.method5188(var5, var6);
                        var10.field3698 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
