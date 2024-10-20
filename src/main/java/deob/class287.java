package deob;

@ObfuscatedName("kf")
public class class287 extends class288 {

    @ObfuscatedName("kf.x")
    public final class349 field3637;

    public class287(class349 arg0) {
        super(400);
        this.field3637 = arg0;
    }

    @ObfuscatedName("kf.h(B)Lju;")
    public class285 method4716() {
        return new class289();
    }

    @ObfuscatedName("kf.v(II)[Lju;")
    public class285[] method4717(int arg0) {
        return new class289[arg0];
    }

    @ObfuscatedName("kf.x(Lkj;II)V")
    public void method4718(class311 arg0, int arg1) {
        while (true) {
            if (arg0.field3752 < arg1) {
                int var3 = arg0.method5274();
                boolean var4 = (var3 & 0x1) == 1;
                class294 var5 = new class294(arg0.method5202(), this.field3637);
                class294 var6 = new class294(arg0.method5202(), this.field3637);
                arg0.method5202();
                if (var5 != null && var5.method4822()) {
                    class289 var7 = (class289) this.method4777(var5);
                    if (var4) {
                        class289 var8 = (class289) this.method4777(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4738(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4742(var7, var5, var6);
                        continue;
                    }
                    if (this.method4731() < 400) {
                        int var9 = this.method4731();
                        class289 var10 = (class289) this.method4732(var5, var6);
                        var10.field3649 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
