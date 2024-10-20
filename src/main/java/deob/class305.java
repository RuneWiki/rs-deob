package deob;

@ObfuscatedName("kv")
public class class305 extends class300 {

    @ObfuscatedName("kv.n")
    public final class336 field3849;

    @ObfuscatedName("kv.x")
    public int field3848 = 1;

    @ObfuscatedName("kv.m")
    public class221 field3850 = new class221();

    public class305(class336 arg0) {
        super(400);
        this.field3849 = arg0;
    }

    @ObfuscatedName("kv.d(I)Lkm;")
    public class297 method4997() {
        return new class307();
    }

    @ObfuscatedName("kv.z(II)[Lkm;")
    public class297[] method4987(int arg0) {
        return new class307[arg0];
    }

    @ObfuscatedName("kv.n(Lko;ZB)Z")
    public boolean method5089(class306 arg0, boolean arg1) {
        class307 var3 = (class307) this.method5035(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3840 != 0;
        }
    }

    @ObfuscatedName("kv.h(Lgy;IB)V")
    public void method5087(class195 arg0, int arg1) {
        while (true) {
            if (arg0.field2568 < arg1) {
                boolean var3 = arg0.method3330() == 1;
                class306 var4 = new class306(arg0.method3268(), this.field3849);
                class306 var5 = new class306(arg0.method3268(), this.field3849);
                int var6 = arg0.method3269();
                int var7 = arg0.method3330();
                int var8 = arg0.method3330();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3268();
                    arg0.method3330();
                    arg0.method3264();
                }
                arg0.method3268();
                if (var4 != null && var4.method5096()) {
                    class307 var11 = (class307) this.method5004(var3 ? var5 : var4);
                    if (var11 == null) {
                        if (this.method5000() >= 400) {
                            continue;
                        }
                        var11 = (class307) this.method5049(var4, var5);
                    } else {
                        this.method5020(var11, var4, var5);
                        if (var11.field3840 != var6) {
                            boolean var12 = true;
                            for (class309 var13 = (class309) this.field3850.method3834(); var13 != null; var13 = (class309) this.field3850.method3840()) {
                                if (var13.field3864.equals(var4)) {
                                    if (var6 != 0 && var13.field3865 == 0) {
                                        var13.method3843();
                                        var12 = false;
                                    } else if (var6 == 0 && var13.field3865 != 0) {
                                        var13.method3843();
                                        var12 = false;
                                    }
                                }
                            }
                            if (var12) {
                                this.field3850.method3835(new class309(var4, var6));
                            }
                        }
                    }
                    if (var11.field3840 != var6) {
                        var11.field3841 = ++this.field3848 - 1;
                        if (var11.field3840 == -1 && var6 == 0) {
                            var11.field3841 = -(var11.field3841 * 1994994117) * 210445581;
                        }
                        var11.field3840 = var6;
                    }
                    var11.field3839 = var7;
                    var11.field3855 = var9;
                    var11.field3856 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5010();
            return;
        }
    }
}
