package deob;

@ObfuscatedName("kh")
public class class287 extends class288 {

    @ObfuscatedName("kh.w")
    public final class331 field3689;

    public class287(class331 arg0) {
        super(400);
        this.field3689 = arg0;
    }

    @ObfuscatedName("kh.f(I)Ljb;")
    public class285 method5023() {
        return new class289();
    }

    @ObfuscatedName("kh.l(IS)[Ljb;")
    public class285[] method5024(int arg0) {
        return new class289[arg0];
    }

    @ObfuscatedName("kh.w(Lgm;II)V")
    public void method5025(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2414 < arg1) {
                int var3 = arg0.method3344();
                boolean var4 = (var3 & 0x1) == 1;
                class294 var5 = new class294(arg0.method3353(), this.field3689);
                class294 var6 = new class294(arg0.method3353(), this.field3689);
                arg0.method3353();
                if (var5 != null && var5.method5131()) {
                    class289 var7 = (class289) this.method5040(var5);
                    if (var4) {
                        class289 var8 = (class289) this.method5040(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5043(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5094(var7, var5, var6);
                        continue;
                    }
                    if (this.method5049() < 400) {
                        int var9 = this.method5049();
                        class289 var10 = (class289) this.method5060(var5, var6);
                        var10.field3697 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
