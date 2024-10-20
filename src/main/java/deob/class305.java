package deob;

@ObfuscatedName("kq")
public class class305 extends class300 {

    @ObfuscatedName("kq.t")
    public final class336 field3858;

    @ObfuscatedName("kq.x")
    public int field3856 = 1;

    @ObfuscatedName("kq.y")
    public class221 field3857 = new class221();

    public class305(class336 arg0) {
        super(400);
        this.field3858 = arg0;
    }

    @ObfuscatedName("kq.o(B)Lku;")
    public class297 method4904() {
        return new class307();
    }

    @ObfuscatedName("kq.k(II)[Lku;")
    public class297[] method4905(int arg0) {
        return new class307[arg0];
    }

    @ObfuscatedName("kq.t(Lkz;ZI)Z")
    public boolean method5008(class306 arg0, boolean arg1) {
        class307 var3 = (class307) this.method4919(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3848 != 0;
        }
    }

    @ObfuscatedName("kq.m(Lgc;II)V")
    public void method5007(class195 arg0, int arg1) {
        while (true) {
            if (arg0.field2575 < arg1) {
                boolean var3 = arg0.method3205() == 1;
                class306 var4 = new class306(arg0.method3284(), this.field3858);
                class306 var5 = new class306(arg0.method3284(), this.field3858);
                int var6 = arg0.method3207();
                int var7 = arg0.method3205();
                int var8 = arg0.method3205();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3284();
                    arg0.method3205();
                    arg0.method3254();
                }
                arg0.method3284();
                if (var4 != null && var4.method5017()) {
                    class307 var11 = (class307) this.method4936(var4);
                    if (var3) {
                        class307 var12 = (class307) this.method4936(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4923(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4916() >= 400) {
                            continue;
                        }
                        var11 = (class307) this.method4925(var4, var5);
                    } else {
                        this.method4928(var11, var4, var5);
                        if (var11.field3848 != var6) {
                            boolean var13 = true;
                            for (class309 var14 = (class309) this.field3857.method3735(); var14 != null; var14 = (class309) this.field3857.method3734()) {
                                if (var14.field3878.equals(var4)) {
                                    if (var6 != 0 && var14.field3876 == 0) {
                                        var14.method3741();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3876 != 0) {
                                        var14.method3741();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3857.method3731(new class309(var4, var6));
                            }
                        }
                    }
                    if (var11.field3848 != var6) {
                        var11.field3846 = ++this.field3856 - 1;
                        if (var11.field3848 == -1 && var6 == 0) {
                            var11.field3846 = -(var11.field3846 * -1152622641) * 488130351;
                        }
                        var11.field3848 = var6;
                    }
                    var11.field3847 = var7;
                    var11.field3863 = var9;
                    var11.field3862 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4939();
            return;
        }
    }
}
