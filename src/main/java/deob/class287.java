package deob;

@ObfuscatedName("kr")
public class class287 extends class288 {

    @ObfuscatedName("kr.n")
    public final class331 field3671;

    public class287(class331 arg0) {
        super(400);
        this.field3671 = arg0;
    }

    @ObfuscatedName("kr.y(I)Ljd;")
    public class285 method4988() {
        return new class289();
    }

    @ObfuscatedName("kr.c(II)[Ljd;")
    public class285[] method4989(int arg0) {
        return new class289[arg0];
    }

    @ObfuscatedName("kr.n(Lge;II)V")
    public void method4990(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2374 < arg1) {
                int var3 = arg0.method3299();
                boolean var4 = (var3 & 0x1) == 1;
                class294 var5 = new class294(arg0.method3277(), this.field3671);
                class294 var6 = new class294(arg0.method3277(), this.field3671);
                arg0.method3277();
                if (var5 != null && var5.method5096()) {
                    class289 var7 = (class289) this.method5043(var5);
                    if (var4) {
                        class289 var8 = (class289) this.method5043(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5009(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5041(var7, var5, var6);
                        continue;
                    }
                    if (this.method5002() < 400) {
                        int var9 = this.method5002();
                        class289 var10 = (class289) this.method5011(var5, var6);
                        var10.field3681 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
