package deob;

@ObfuscatedName("lx")
public class class316 extends class323 {

    @ObfuscatedName("lx.u")
    public final class364 field3817;

    @ObfuscatedName("lx.p")
    public int field3816 = 1;

    @ObfuscatedName("lx.b")
    public class275 field3818 = new class275();

    public class316(class364 arg0) {
        super(400);
        this.field3817 = arg0;
    }

    @ObfuscatedName("lx.f(I)Llt;")
    public class321 method5026() {
        return new class318();
    }

    @ObfuscatedName("lx.o(II)[Llt;")
    public class321[] method5027(int arg0) {
        return new class318[arg0];
    }

    @ObfuscatedName("lx.u(Llw;ZS)Z")
    public boolean method5036(class327 arg0, boolean arg1) {
        class318 var3 = (class318) this.method5114(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3852 != 0;
        }
    }

    @ObfuscatedName("lx.h(Lnu;II)V")
    public void method5037(class382 arg0, int arg1) {
        while (true) {
            if (arg0.field4155 < arg1) {
                boolean var3 = arg0.method5856() == 1;
                class327 var4 = new class327(arg0.method5865(), this.field3817);
                class327 var5 = new class327(arg0.method5865(), this.field3817);
                int var6 = arg0.method5858();
                int var7 = arg0.method5856();
                int var8 = arg0.method5856();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5865();
                    arg0.method5856();
                    arg0.method5861();
                }
                arg0.method5865();
                if (var4 != null && var4.method5212()) {
                    class318 var11 = (class318) this.method5160(var4);
                    if (var3) {
                        class318 var12 = (class318) this.method5160(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5118(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5111() >= 400) {
                            continue;
                        }
                        var11 = (class318) this.method5120(var4, var5);
                    } else {
                        this.method5123(var11, var4, var5);
                        if (var11.field3852 != var6) {
                            boolean var13 = true;
                            for (class319 var14 = (class319) this.field3818.method4274(); var14 != null; var14 = (class319) this.field3818.method4275()) {
                                if (var14.field3831.equals(var4)) {
                                    if (var6 != 0 && var14.field3832 == 0) {
                                        var14.method5345();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3832 != 0) {
                                        var14.method5345();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3818.method4277(new class319(var4, var6));
                            }
                        }
                    }
                    if (var11.field3852 != var6) {
                        var11.field3851 = ++this.field3816 - 1;
                        if (var11.field3852 == -1 && var6 == 0) {
                            var11.field3851 = -(var11.field3851 * -755465589) * 1237996835;
                        }
                        var11.field3852 = var6;
                    }
                    var11.field3853 = var7;
                    var11.field3829 = var9;
                    var11.field3828 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5122();
            return;
        }
    }
}
