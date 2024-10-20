package deob;

@ObfuscatedName("js")
public class class280 extends class276 {

    @ObfuscatedName("js.w")
    public final class314 field3696;

    @ObfuscatedName("js.m")
    public class207 field3694 = new class207();

    public class280(class314 arg0) {
        super(400);
        this.field3696 = arg0;
    }

    @ObfuscatedName("js.p(B)Lju;")
    public class274 method4667() {
        return new class282();
    }

    @ObfuscatedName("js.i(II)[Lju;")
    public class274[] method4668(int arg0) {
        return new class282[arg0];
    }

    @ObfuscatedName("js.w(Ljr;ZI)Z")
    public boolean method4745(class281 arg0, boolean arg1) {
        class282 var3 = (class282) this.method4685(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3706 != 0;
        }
    }

    @ObfuscatedName("js.q(Lgj;II)V")
    public void method4746(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2488 < arg1) {
                boolean var3 = arg0.method3197() == 1;
                class281 var4 = new class281(arg0.method3131(), this.field3696);
                class281 var5 = new class281(arg0.method3131(), this.field3696);
                int var6 = arg0.method3124();
                int var7 = arg0.method3197();
                int var8 = arg0.method3197();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3131();
                    arg0.method3197();
                    arg0.method3127();
                }
                arg0.method3131();
                if (var4 != null && var4.method4753()) {
                    class282 var11 = (class282) this.method4686(var3 ? var5 : var4);
                    if (var11 == null) {
                        if (this.method4682() >= 400) {
                            continue;
                        }
                        var11 = (class282) this.method4691(var4, var5);
                    } else {
                        this.method4688(var11, var4, var5);
                        if (var11.field3706 != var6) {
                            boolean var12 = true;
                            for (class284 var13 = (class284) this.field3694.method3606(); var13 != null; var13 = (class284) this.field3694.method3608()) {
                                if (var13.field3716.equals(var4)) {
                                    if (var6 != 0 && var13.field3718 == 0) {
                                        var13.method3620();
                                        var12 = false;
                                    } else if (var6 == 0 && var13.field3718 != 0) {
                                        var13.method3620();
                                        var12 = false;
                                    }
                                }
                            }
                            if (var12) {
                                this.field3694.method3607(new class284(var4, var6));
                            }
                        }
                    }
                    var11.field3706 = var6;
                    var11.field3708 = var7;
                    var11.field3707 = var9;
                    var11.field3705 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4693();
            return;
        }
    }
}
