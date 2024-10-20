package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("nt")
public class class339 {

    @ObfuscatedName("nt.ac")
    public class374 field3584;

    @ObfuscatedName("nt.al")
    public class374 field3580;

    @ObfuscatedName("nt.ak")
    public class374 field3581;

    @ObfuscatedName("nt.ax")
    public class374 field3582;

    @ObfuscatedName("nt.ao")
    public class374 field3583;

    @ObfuscatedName("nt.ah")
    public class347[][] field3588;

    @ObfuscatedName("nt.ab")
    public Map field3589 = new HashMap();

    @ObfuscatedName("nt.am")
    public class302 field3586 = new class302(200);

    @ObfuscatedName("nt.av")
    public class302 field3590 = new class302(50);

    @ObfuscatedName("nt.ag")
    public class302 field3587 = new class302(20);

    @ObfuscatedName("nt.aa")
    public class302 field3585 = new class302(8);

    @ObfuscatedName("nt.ap")
    public class439 field3579 = new class439(10, class437.field4652);

    @ObfuscatedName("nt.ay")
    public class439 field3591 = new class439(10, class437.field4652);

    public class339(class374 arg0, class374 arg1, class374 arg2, class374 arg3, class374 arg4) {
        int var6 = 0;
        if (arg0 != null) {
            this.field3584 = arg0;
            this.field3581 = arg1;
            this.field3582 = arg2;
            this.field3583 = arg3;
            this.field3580 = arg4;
            var6 = this.field3584.method6274();
        }
        this.field3588 = new class347[var6][];
        Statics.field4700 = new boolean[var6];
    }

    @ObfuscatedName("nt.ac(II)Lnm;")
    public class347 method5639(int arg0) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (this.field3588[var2] == null || this.field3588[var2][var3] == null) {
            boolean var4 = this.method5641(var2);
            if (!var4) {
                return null;
            }
        }
        return this.field3588[var2][var3];
    }

    @ObfuscatedName("nt.al(III)Lnm;")
    public class347 method5640(int arg0, int arg1) {
        class347 var3 = this.method5639(arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3815 == null || arg1 >= var3.field3815.length) {
            return null;
        } else {
            return var3.field3815[arg1];
        }
    }

    @ObfuscatedName("nt.ak(IS)Z")
    public boolean method5641(int arg0) {
        if (Statics.field4700[arg0]) {
            return true;
        } else if (this.field3584.method6348(arg0)) {
            int var2 = this.field3584.method6273(arg0);
            if (var2 == 0) {
                Statics.field4700[arg0] = true;
                return true;
            }
            if (this.field3588[arg0] == null) {
                this.field3588[arg0] = new class347[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (this.field3588[arg0][var3] == null) {
                    byte[] var4 = this.field3584.method6342(arg0, var3);
                    if (var4 != null) {
                        this.field3588[arg0][var3] = new class347();
                        this.field3588[arg0][var3].field3676 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            this.field3588[arg0][var3].method5982(new class530(var4));
                        } else {
                            this.field3588[arg0][var3].method5981(new class530(var4));
                        }
                        if (this.field3580 != null) {
                            byte[] var5 = this.field3580.method6342(arg0, var3);
                            if (var5 != null && var5.length > 0) {
                                this.field3588[arg0][var3].method6050(new class530(var5));
                                this.field3589.put(this.field3588[arg0][var3].field3678, arg0);
                            }
                        }
                    }
                }
            }
            Statics.field4700[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nt.ax(II)V")
    public void method5642(int arg0) {
        if (arg0 == -1 || !Statics.field4700[arg0]) {
            return;
        }
        this.field3584.method6276(arg0);
        if (this.field3588[arg0] == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3588[arg0].length; var2++) {
            if (this.field3588[arg0][var2] != null) {
                this.field3588[arg0][var2] = null;
            }
        }
        this.field3588[arg0] = null;
        Statics.field4700[arg0] = false;
    }

    @ObfuscatedName("nt.ao(B)V")
    public void method5651() {
        this.field3586.method5288();
        this.field3590.method5288();
        this.field3587.method5288();
        this.field3585.method5288();
    }
}
