package deob;

@ObfuscatedName("rh")
public class class447 extends class454 {

    @ObfuscatedName("rh.al")
    public final class512 field4734;

    @ObfuscatedName("rh.ai")
    public int field4735 = 1;

    @ObfuscatedName("rh.ar")
    public class400 field4736 = new class400();

    public class447(class512 arg0) {
        super(400);
        this.field4734 = arg0;
    }

    @ObfuscatedName("rh.aq(B)Lra;")
    public class452 method7487() {
        return new class449();
    }

    @ObfuscatedName("rh.aw(IS)[Lra;")
    public class452[] method7488(int arg0) {
        return new class449[arg0];
    }

    @ObfuscatedName("rh.al(Lvn;ZB)Z")
    public boolean method7505(class557 arg0, boolean arg1) {
        class449 var3 = (class449) this.method7592(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4770 != 0;
        }
    }

    @ObfuscatedName("rh.ao(Luq;II)V")
    public void method7498(class534 arg0, int arg1) {
        while (true) {
            if (arg0.field5200 < arg1) {
                boolean var3 = arg0.method8591() == 1;
                class557 var4 = new class557(arg0.method8741(), this.field4734);
                class557 var5 = new class557(arg0.method8741(), this.field4734);
                int var6 = arg0.method8593();
                int var7 = arg0.method8591();
                int var8 = arg0.method8591();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8741();
                    arg0.method8591();
                    arg0.method8597();
                }
                arg0.method8741();
                if (var4 != null && var4.method9181()) {
                    class449 var11 = (class449) this.method7649(var4);
                    if (var3) {
                        class449 var12 = (class449) this.method7649(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7595(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7588() >= 400) {
                            continue;
                        }
                        var11 = (class449) this.method7597(var4, var5);
                    } else {
                        this.method7599(var11, var4, var5);
                        if (var11.field4770 != var6) {
                            boolean var13 = true;
                            for (class450 var14 = (class450) this.field4736.method6812(); var14 != null; var14 = (class450) this.field4736.method6815()) {
                                if (var14.field4751.equals(var4)) {
                                    if (var6 != 0 && var14.field4754 == 0) {
                                        var14.method7985();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4754 != 0) {
                                        var14.method7985();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4736.method6813(new class450(var4, var6));
                            }
                        }
                    }
                    if (var11.field4770 != var6) {
                        var11.field4771 = ++this.field4735 - 1;
                        if (var11.field4770 == -1 && var6 == 0) {
                            var11.field4771 = -(var11.field4771 * -2090324989) * 1270931115;
                        }
                        var11.field4770 = var6;
                    }
                    var11.field4772 = var7;
                    var11.field4746 = var9;
                    var11.field4749 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7607();
            return;
        }
    }
}
