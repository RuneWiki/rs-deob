package deob;

@ObfuscatedName("ky")
public class class305 extends class300 {

    @ObfuscatedName("ky.b")
    public final class336 field3861;

    @ObfuscatedName("ky.h")
    public int field3863 = 1;

    @ObfuscatedName("ky.i")
    public class221 field3865 = new class221();

    public class305(class336 arg0) {
        super(400);
        this.field3861 = arg0;
    }

    @ObfuscatedName("ky.g(I)Lkg;")
    public class297 method4959() {
        return new class307();
    }

    @ObfuscatedName("ky.e(IB)[Lkg;")
    public class297[] method4956(int arg0) {
        return new class307[arg0];
    }

    @ObfuscatedName("ky.b(Lkb;ZS)Z")
    public boolean method5055(class306 arg0, boolean arg1) {
        class307 var3 = (class307) this.method4973(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3854 != 0;
        }
    }

    @ObfuscatedName("ky.o(Lgg;II)V")
    public void method5056(class195 arg0, int arg1) {
        while (true) {
            if (arg0.field2562 < arg1) {
                boolean var3 = arg0.method3332() == 1;
                class306 var4 = new class306(arg0.method3429(), this.field3861);
                class306 var5 = new class306(arg0.method3429(), this.field3861);
                int var6 = arg0.method3310();
                int var7 = arg0.method3332();
                int var8 = arg0.method3332();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3429();
                    arg0.method3332();
                    arg0.method3472();
                }
                arg0.method3429();
                if (var4 != null && var4.method5061()) {
                    class307 var11 = (class307) this.method4974(var4);
                    if (var3) {
                        class307 var12 = (class307) this.method4974(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5013(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4979() >= 400) {
                            continue;
                        }
                        var11 = (class307) this.method4978(var4, var5);
                    } else {
                        this.method4980(var11, var4, var5);
                        if (var11.field3854 != var6) {
                            boolean var13 = true;
                            for (class309 var14 = (class309) this.field3865.method3847(); var14 != null; var14 = (class309) this.field3865.method3845()) {
                                if (var14.field3879.equals(var4)) {
                                    if (var6 != 0 && var14.field3880 == 0) {
                                        var14.method3858();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3880 != 0) {
                                        var14.method3858();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3865.method3846(new class309(var4, var6));
                            }
                        }
                    }
                    if (var11.field3854 != var6) {
                        var11.field3852 = ++this.field3863 - 1;
                        if (var11.field3854 == -1 && var6 == 0) {
                            var11.field3852 = -(var11.field3852 * 1925630229) * -671924675;
                        }
                        var11.field3854 = var6;
                    }
                    var11.field3855 = var7;
                    var11.field3868 = var9;
                    var11.field3869 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4968();
            return;
        }
    }
}
