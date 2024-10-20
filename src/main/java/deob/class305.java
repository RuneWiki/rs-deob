package deob;

@ObfuscatedName("kz")
public class class305 extends class300 {

    @ObfuscatedName("kz.o")
    public final class336 field3846;

    @ObfuscatedName("kz.r")
    public int field3847 = 1;

    @ObfuscatedName("kz.d")
    public class221 field3848 = new class221();

    public class305(class336 arg0) {
        super(400);
        this.field3846 = arg0;
    }

    @ObfuscatedName("kz.c(I)Lku;")
    public class297 method4925() {
        return new class307();
    }

    @ObfuscatedName("kz.i(II)[Lku;")
    public class297[] method4932(int arg0) {
        return new class307[arg0];
    }

    @ObfuscatedName("kz.o(Lko;ZI)Z")
    public boolean method5021(class306 arg0, boolean arg1) {
        class307 var3 = (class307) this.method4941(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3841 != 0;
        }
    }

    @ObfuscatedName("kz.w(Lgp;II)V")
    public void method5023(class195 arg0, int arg1) {
        while (true) {
            if (arg0.field2566 < arg1) {
                boolean var3 = arg0.method3429() == 1;
                class306 var4 = new class306(arg0.method3427(), this.field3846);
                class306 var5 = new class306(arg0.method3427(), this.field3846);
                int var6 = arg0.method3218();
                int var7 = arg0.method3429();
                int var8 = arg0.method3429();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3427();
                    arg0.method3429();
                    arg0.method3230();
                }
                arg0.method3427();
                if (var4 != null && var4.method5052()) {
                    class307 var11 = (class307) this.method4943(var4);
                    if (var3) {
                        class307 var12 = (class307) this.method4943(var5);
                        if (var12 != null) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4945(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4938() >= 400) {
                            continue;
                        }
                        var11 = (class307) this.method4947(var4, var5);
                    } else {
                        this.method4950(var11, var4, var5);
                        if (var11.field3841 != var6) {
                            boolean var13 = true;
                            for (class309 var14 = (class309) this.field3848.method3752(); var14 != null; var14 = (class309) this.field3848.method3753()) {
                                if (var14.field3866.equals(var4)) {
                                    if (var6 != 0 && var14.field3867 == 0) {
                                        var14.method3760();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3867 != 0) {
                                        var14.method3760();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3848.method3758(new class309(var4, var6));
                            }
                        }
                    }
                    if (var11.field3841 != var6) {
                        var11.field3840 = ++this.field3847 - 1;
                        if (var11.field3841 == -1 && var6 == 0) {
                            var11.field3840 = -(var11.field3840 * 1320922141) * 806385205;
                        }
                        var11.field3841 = var6;
                    }
                    var11.field3839 = var7;
                    var11.field3855 = var9;
                    var11.field3856 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4956();
            return;
        }
    }
}
