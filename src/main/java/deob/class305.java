package deob;

@ObfuscatedName("ke")
public class class305 extends class300 {

    @ObfuscatedName("ke.i")
    public final class336 field3854;

    @ObfuscatedName("ke.g")
    public int field3852 = 1;

    @ObfuscatedName("ke.n")
    public class221 field3853 = new class221();

    public class305(class336 arg0) {
        super(400);
        this.field3854 = arg0;
    }

    @ObfuscatedName("ke.t(B)Lkv;")
    public class297 method4899() {
        return new class307();
    }

    @ObfuscatedName("ke.q(II)[Lkv;")
    public class297[] method4897(int arg0) {
        return new class307[arg0];
    }

    @ObfuscatedName("ke.i(Lkb;ZS)Z")
    public boolean method5003(class306 arg0, boolean arg1) {
        class307 var3 = (class307) this.method4911(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3845 != 0;
        }
    }

    @ObfuscatedName("ke.p(Lgb;II)V")
    public void method5000(class195 arg0, int arg1) {
        while (true) {
            if (arg0.field2545 < arg1) {
                boolean var3 = arg0.method3236() == 1;
                class306 var4 = new class306(arg0.method3257(), this.field3854);
                class306 var5 = new class306(arg0.method3257(), this.field3854);
                int var6 = arg0.method3238();
                int var7 = arg0.method3236();
                int var8 = arg0.method3236();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3257();
                    arg0.method3236();
                    arg0.method3241();
                }
                arg0.method3257();
                if (var4 != null && var4.method5005()) {
                    class307 var11 = (class307) this.method4912(var3 ? var5 : var4);
                    if (var11 == null) {
                        if (this.method4908() >= 400) {
                            continue;
                        }
                        var11 = (class307) this.method4917(var4, var5);
                    } else {
                        this.method4957(var11, var4, var5);
                        if (var11.field3845 != var6) {
                            boolean var12 = true;
                            for (class309 var13 = (class309) this.field3853.method3766(); var13 != null; var13 = (class309) this.field3853.method3767()) {
                                if (var13.field3873.equals(var4)) {
                                    if (var6 != 0 && var13.field3874 == 0) {
                                        var13.method3775();
                                        var12 = false;
                                    } else if (var6 == 0 && var13.field3874 != 0) {
                                        var13.method3775();
                                        var12 = false;
                                    }
                                }
                            }
                            if (var12) {
                                this.field3853.method3765(new class309(var4, var6));
                            }
                        }
                    }
                    if (var11.field3845 != var6) {
                        var11.field3843 = ++this.field3852 - 1;
                        if (var11.field3845 == -1 && var6 == 0) {
                            var11.field3843 = -(var11.field3843 * 410700773) * -1324713491;
                        }
                        var11.field3845 = var6;
                    }
                    var11.field3844 = var7;
                    var11.field3863 = var9;
                    var11.field3862 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4919();
            return;
        }
    }
}
