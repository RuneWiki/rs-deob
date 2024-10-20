package deob;

@ObfuscatedName("kr")
public class class292 extends class287 {

    @ObfuscatedName("kr.k")
    public final class348 field3618;

    @ObfuscatedName("kr.e")
    public int field3619 = 1;

    @ObfuscatedName("kr.s")
    public class273 field3616 = new class273();

    public class292(class348 arg0) {
        super(400);
        this.field3618 = arg0;
    }

    @ObfuscatedName("kr.x(I)Ljd;")
    public class284 method4730() {
        return new class294();
    }

    @ObfuscatedName("kr.m(II)[Ljd;")
    public class284[] method4731(int arg0) {
        return new class294[arg0];
    }

    @ObfuscatedName("kr.k(Lku;ZI)Z")
    public boolean method4843(class293 arg0, boolean arg1) {
        class294 var3 = (class294) this.method4824(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3611 != 0;
        }
    }

    @ObfuscatedName("kr.z(Lkb;IB)V")
    public void method4840(class310 arg0, int arg1) {
        while (true) {
            if (arg0.field3711 < arg1) {
                boolean var3 = arg0.method5137() == 1;
                class293 var4 = new class293(arg0.method5257(), this.field3618);
                class293 var5 = new class293(arg0.method5257(), this.field3618);
                int var6 = arg0.method5139();
                int var7 = arg0.method5137();
                int var8 = arg0.method5137();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5257();
                    arg0.method5137();
                    arg0.method5142();
                }
                arg0.method5257();
                if (var4 != null && var4.method4846()) {
                    class294 var11 = (class294) this.method4747(var4);
                    if (var3) {
                        class294 var12 = (class294) this.method4747(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4817(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4743() >= 400) {
                            continue;
                        }
                        var11 = (class294) this.method4806(var4, var5);
                    } else {
                        this.method4755(var11, var4, var5);
                        if (var11.field3611 != var6) {
                            boolean var13 = true;
                            for (class296 var14 = (class296) this.field3616.method4593(); var14 != null; var14 = (class296) this.field3616.method4589()) {
                                if (var14.field3639.equals(var4)) {
                                    if (var6 != 0 && var14.field3638 == 0) {
                                        var14.method3352();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3638 != 0) {
                                        var14.method3352();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3616.method4588(new class296(var4, var6));
                            }
                        }
                    }
                    if (var11.field3611 != var6) {
                        var11.field3610 = ++this.field3619 - 1;
                        if (var11.field3611 == -1 && var6 == 0) {
                            var11.field3610 = -(var11.field3610 * -1563374063) * 1414783729;
                        }
                        var11.field3611 = var6;
                    }
                    var11.field3612 = var7;
                    var11.field3626 = var9;
                    var11.field3624 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4754();
            return;
        }
    }
}
