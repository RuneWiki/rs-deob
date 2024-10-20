package deob;

@ObfuscatedName("kb")
public class class287 extends class288 {

    @ObfuscatedName("kb.e")
    public final class331 field3697;

    public class287(class331 arg0) {
        super(400);
        this.field3697 = arg0;
    }

    @ObfuscatedName("kb.g(I)Ljr;")
    public class285 method5158() {
        return new class289();
    }

    @ObfuscatedName("kb.r(II)[Ljr;")
    public class285[] method5159(int arg0) {
        return new class289[arg0];
    }

    @ObfuscatedName("kb.e(Lgl;II)V")
    public void method5160(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2406 < arg1) {
                int var3 = arg0.method3679();
                boolean var4 = (var3 & 0x1) == 1;
                class294 var5 = new class294(arg0.method3474(), this.field3697);
                class294 var6 = new class294(arg0.method3474(), this.field3697);
                arg0.method3474();
                if (var5 != null && var5.method5270()) {
                    class289 var7 = (class289) this.method5176(var5);
                    if (var4) {
                        class289 var8 = (class289) this.method5176(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5220(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5177(var7, var5, var6);
                        continue;
                    }
                    if (this.method5172() < 400) {
                        int var9 = this.method5172();
                        class289 var10 = (class289) this.method5180(var5, var6);
                        var10.field3706 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
