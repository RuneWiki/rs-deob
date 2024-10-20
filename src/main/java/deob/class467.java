package deob;

@ObfuscatedName("ry")
public class class467 extends class474 {

    @ObfuscatedName("ry.an")
    public final class526 field4897;

    @ObfuscatedName("ry.au")
    public int field4900 = 1;

    @ObfuscatedName("ry.ax")
    public class411 field4901 = new class411();

    public class467(class526 arg0) {
        super(400);
        this.field4897 = arg0;
    }

    @ObfuscatedName("ry.ab(I)Lsz;")
    public class472 method7861() {
        return new class469();
    }

    @ObfuscatedName("ry.ay(IB)[Lsz;")
    public class472[] method7862(int arg0) {
        return new class469[arg0];
    }

    @ObfuscatedName("ry.an(Lvf;ZI)Z")
    public boolean method7871(class572 arg0, boolean arg1) {
        class469 var3 = (class469) this.method7958(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4938 != 0;
        }
    }

    @ObfuscatedName("ry.ad(Lvg;II)V")
    public void method7870(class549 arg0, int arg1) {
        while (true) {
            if (arg0.field5378 < arg1) {
                boolean var3 = arg0.method9025() == 1;
                class572 var4 = new class572(arg0.method8808(), this.field4897);
                class572 var5 = new class572(arg0.method8808(), this.field4897);
                int var6 = arg0.method8968();
                int var7 = arg0.method9025();
                int var8 = arg0.method9025();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8808();
                    arg0.method9025();
                    arg0.method8803();
                }
                arg0.method8808();
                if (var4 != null && var4.method9468()) {
                    class469 var11 = (class469) this.method7959(var4);
                    if (var3) {
                        class469 var12 = (class469) this.method7959(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7955(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method8008() >= 400) {
                            continue;
                        }
                        var11 = (class469) this.method7965(var4, var5);
                    } else {
                        this.method8010(var11, var4, var5);
                        if (var11.field4938 != var6) {
                            boolean var13 = true;
                            for (class470 var14 = (class470) this.field4901.method7009(); var14 != null; var14 = (class470) this.field4901.method7011()) {
                                if (var14.field4914.equals(var4)) {
                                    if (var6 != 0 && var14.field4915 == 0) {
                                        var14.method8212();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4915 != 0) {
                                        var14.method8212();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4901.method7010(new class470(var4, var6));
                            }
                        }
                    }
                    if (var11.field4938 != var6) {
                        var11.field4934 = ++this.field4900 - 1;
                        if (var11.field4938 == -1 && var6 == 0) {
                            var11.field4934 = -(var11.field4934 * -605268887) * 1265531865;
                        }
                        var11.field4938 = var6;
                    }
                    var11.field4936 = var7;
                    var11.field4912 = var9;
                    var11.field4913 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7970();
            return;
        }
    }
}
