package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("np")
public class class339 {

    @ObfuscatedName("np.am")
    public class375 field3617;

    @ObfuscatedName("np.ap")
    public class375 field3618;

    @ObfuscatedName("np.af")
    public class375 field3608;

    @ObfuscatedName("np.aj")
    public class375 field3609;

    @ObfuscatedName("np.aq")
    public class375 field3614;

    @ObfuscatedName("np.ar")
    public class347[][] field3611;

    @ObfuscatedName("np.ao")
    public Map field3612 = new HashMap();

    @ObfuscatedName("np.ae")
    public class302 field3613 = new class302(200);

    @ObfuscatedName("np.aa")
    public class302 field3607 = new class302(50);

    @ObfuscatedName("np.au")
    public class302 field3615 = new class302(20);

    @ObfuscatedName("np.an")
    public class302 field3610 = new class302(8);

    @ObfuscatedName("np.ad")
    public class440 field3616 = new class440(10, class438.field4678);

    @ObfuscatedName("np.ax")
    public class440 field3606 = new class440(10, class438.field4678);

    public class339(class375 arg0, class375 arg1, class375 arg2, class375 arg3, class375 arg4) {
        int var6 = 0;
        if (arg0 != null) {
            this.field3617 = arg0;
            this.field3608 = arg1;
            this.field3609 = arg2;
            this.field3614 = arg3;
            this.field3618 = arg4;
            var6 = this.field3617.method6398();
        }
        this.field3611 = new class347[var6][];
        Statics.field3913 = new boolean[var6];
    }

    @ObfuscatedName("np.am(IB)Lnn;")
    public class347 method5742(int arg0) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (this.field3611[var2] == null || this.field3611[var2][var3] == null) {
            boolean var4 = this.method5751(var2);
            if (!var4) {
                return null;
            }
        }
        return this.field3611[var2][var3];
    }

    @ObfuscatedName("np.ap(III)Lnn;")
    public class347 method5741(int arg0, int arg1) {
        class347 var3 = this.method5742(arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3839 == null || arg1 >= var3.field3839.length) {
            return null;
        } else {
            return var3.field3839[arg1];
        }
    }

    @ObfuscatedName("np.af(II)Z")
    public boolean method5751(int arg0) {
        if (Statics.field3913[arg0]) {
            return true;
        } else if (this.field3617.method6400(arg0)) {
            int var2 = this.field3617.method6406(arg0);
            if (var2 == 0) {
                Statics.field3913[arg0] = true;
                return true;
            }
            if (this.field3611[arg0] == null) {
                this.field3611[arg0] = new class347[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (this.field3611[arg0][var3] == null) {
                    byte[] var4 = this.field3617.method6396(arg0, var3);
                    if (var4 != null) {
                        this.field3611[arg0][var3] = new class347();
                        this.field3611[arg0][var3].field3701 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            this.field3611[arg0][var3].method6083(new class531(var4));
                        } else {
                            this.field3611[arg0][var3].method6192(new class531(var4));
                        }
                        if (this.field3618 != null) {
                            byte[] var5 = this.field3618.method6396(arg0, var3);
                            if (var5 != null && var5.length > 0) {
                                this.field3611[arg0][var3].method6084(new class531(var5));
                                this.field3612.put(this.field3611[arg0][var3].field3703, arg0);
                            }
                        }
                    }
                }
            }
            Statics.field3913[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("np.aj(IB)V")
    public void method5740(int arg0) {
        if (arg0 == -1 || !Statics.field3913[arg0]) {
            return;
        }
        this.field3617.method6443(arg0);
        if (this.field3611[arg0] == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3611[arg0].length; var2++) {
            if (this.field3611[arg0][var2] != null) {
                this.field3611[arg0][var2] = null;
            }
        }
        this.field3611[arg0] = null;
        Statics.field3913[arg0] = false;
    }

    @ObfuscatedName("np.aq(I)V")
    public void method5743() {
        this.field3613.method5403();
        this.field3607.method5403();
        this.field3615.method5403();
        this.field3610.method5403();
    }
}
