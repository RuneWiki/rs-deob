package deob;

@ObfuscatedName("ri")
public class class448 extends class455 {

    @ObfuscatedName("ri.af")
    public final class513 field4772;

    @ObfuscatedName("ri.at")
    public int field4771 = 1;

    @ObfuscatedName("ri.an")
    public class401 field4774 = new class401();

    public class448(class513 arg0) {
        super(400);
        this.field4772 = arg0;
    }

    @ObfuscatedName("ri.az(I)Lrr;")
    public class453 method7359() {
        return new class450();
    }

    @ObfuscatedName("ri.ah(IB)[Lrr;")
    public class453[] method7360(int arg0) {
        return new class450[arg0];
    }

    @ObfuscatedName("ri.af(Lvx;ZB)Z")
    public boolean method7370(class558 arg0, boolean arg1) {
        class450 var3 = (class450) this.method7522(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4807 != 0;
        }
    }

    @ObfuscatedName("ri.ao(Lur;II)V")
    public void method7372(class535 arg0, int arg1) {
        while (true) {
            if (arg0.field5233 < arg1) {
                boolean var3 = arg0.method8462() == 1;
                class558 var4 = new class558(arg0.method8473(), this.field4772);
                class558 var5 = new class558(arg0.method8473(), this.field4772);
                int var6 = arg0.method8670();
                int var7 = arg0.method8462();
                int var8 = arg0.method8462();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8473();
                    arg0.method8462();
                    arg0.method8682();
                }
                arg0.method8473();
                if (var4 != null && var4.method9076()) {
                    class450 var11 = (class450) this.method7458(var4);
                    if (var3) {
                        class450 var12 = (class450) this.method7458(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7474(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7461() >= 400) {
                            continue;
                        }
                        var11 = (class450) this.method7479(var4, var5);
                    } else {
                        this.method7466(var11, var4, var5);
                        if (var11.field4807 != var6) {
                            boolean var13 = true;
                            for (class451 var14 = (class451) this.field4774.method6723(); var14 != null; var14 = (class451) this.field4774.method6724()) {
                                if (var14.field4786.equals(var4)) {
                                    if (var6 != 0 && var14.field4787 == 0) {
                                        var14.method7849();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4787 != 0) {
                                        var14.method7849();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4774.method6722(new class451(var4, var6));
                            }
                        }
                    }
                    if (var11.field4807 != var6) {
                        var11.field4804 = ++this.field4771 - 1;
                        if (var11.field4807 == -1 && var6 == 0) {
                            var11.field4804 = -(var11.field4804 * -895635327) * 2012385153;
                        }
                        var11.field4807 = var6;
                    }
                    var11.field4805 = var7;
                    var11.field4784 = var9;
                    var11.field4783 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7507();
            return;
        }
    }
}
