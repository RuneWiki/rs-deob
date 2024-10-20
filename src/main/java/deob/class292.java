package deob;

@ObfuscatedName("ki")
public class class292 extends class287 {

    @ObfuscatedName("ki.q")
    public final class348 field3651;

    @ObfuscatedName("ki.z")
    public int field3649 = 1;

    @ObfuscatedName("ki.w")
    public class273 field3652 = new class273();

    public class292(class348 arg0) {
        super(400);
        this.field3651 = arg0;
    }

    @ObfuscatedName("ki.m(I)Ljf;")
    public class284 method4806() {
        return new class294();
    }

    @ObfuscatedName("ki.o(II)[Ljf;")
    public class284[] method4805(int arg0) {
        return new class294[arg0];
    }

    @ObfuscatedName("ki.q(Lkq;ZI)Z")
    public boolean method4914(class293 arg0, boolean arg1) {
        class294 var3 = (class294) this.method4820(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3643 != 0;
        }
    }

    @ObfuscatedName("ki.a(Lkn;II)V")
    public void method4915(class310 arg0, int arg1) {
        while (true) {
            if (arg0.field3734 < arg1) {
                boolean var3 = arg0.method5227() == 1;
                class293 var4 = new class293(arg0.method5236(), this.field3651);
                class293 var5 = new class293(arg0.method5236(), this.field3651);
                int var6 = arg0.method5283();
                int var7 = arg0.method5227();
                int var8 = arg0.method5227();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5236();
                    arg0.method5227();
                    arg0.method5209();
                }
                arg0.method5236();
                if (var4 != null && var4.method4926()) {
                    class294 var11 = (class294) this.method4886(var4);
                    if (var3) {
                        class294 var12 = (class294) this.method4886(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4819(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4860() >= 400) {
                            continue;
                        }
                        var11 = (class294) this.method4861(var4, var5);
                    } else {
                        this.method4829(var11, var4, var5);
                        if (var11.field3643 != var6) {
                            boolean var13 = true;
                            for (class296 var14 = (class296) this.field3652.method4677(); var14 != null; var14 = (class296) this.field3652.method4684()) {
                                if (var14.field3666.equals(var4)) {
                                    if (var6 != 0 && var14.field3665 == 0) {
                                        var14.method3384();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3665 != 0) {
                                        var14.method3384();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3652.method4676(new class296(var4, var6));
                            }
                        }
                    }
                    if (var11.field3643 != var6) {
                        var11.field3641 = ++this.field3649 - 1;
                        if (var11.field3643 == -1 && var6 == 0) {
                            var11.field3641 = -(var11.field3641 * -1924610525) * 2013337995;
                        }
                        var11.field3643 = var6;
                    }
                    var11.field3642 = var7;
                    var11.field3656 = var9;
                    var11.field3655 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4828();
            return;
        }
    }
}
