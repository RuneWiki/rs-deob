package deob;

@ObfuscatedName("jk")
public class class276 extends class277 {

    @ObfuscatedName("jk.i")
    public final class338 field3575;

    public class276(class338 arg0) {
        super(400);
        this.field3575 = arg0;
    }

    @ObfuscatedName("jk.s(I)Lju;")
    public class274 method4665() {
        return new class278();
    }

    @ObfuscatedName("jk.j(II)[Lju;")
    public class274[] method4663(int arg0) {
        return new class278[arg0];
    }

    @ObfuscatedName("jk.i(Lky;II)V")
    public void method4662(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3704 < arg1) {
                int var3 = arg0.method5179();
                boolean var4 = (var3 & 0x1) == 1;
                class283 var5 = new class283(arg0.method5150(), this.field3575);
                class283 var6 = new class283(arg0.method5150(), this.field3575);
                arg0.method5150();
                if (var5 != null && var5.method4768()) {
                    class278 var7 = (class278) this.method4713(var5);
                    if (var4) {
                        class278 var8 = (class278) this.method4713(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4678(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4724(var7, var5, var6);
                        continue;
                    }
                    if (this.method4699() < 400) {
                        int var9 = this.method4699();
                        class278 var10 = (class278) this.method4737(var5, var6);
                        var10.field3586 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
