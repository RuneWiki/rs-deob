package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("mr")
public class class336 {

    @ObfuscatedName("mr.at")
    public class371 field3567;

    @ObfuscatedName("mr.ah")
    public class371 field3565;

    @ObfuscatedName("mr.ar")
    public class371 field3566;

    @ObfuscatedName("mr.ao")
    public class371 field3576;

    @ObfuscatedName("mr.ab")
    public class371 field3564;

    @ObfuscatedName("mr.au")
    public class344[][] field3569;

    @ObfuscatedName("mr.ac")
    public Map field3573 = new HashMap();

    @ObfuscatedName("mr.al")
    public class299 field3572 = new class299(200);

    @ObfuscatedName("mr.az")
    public class299 field3571 = new class299(50);

    @ObfuscatedName("mr.ap")
    public class299 field3574 = new class299(20);

    @ObfuscatedName("mr.av")
    public class299 field3575 = new class299(8);

    @ObfuscatedName("mr.ax")
    public class436 field3568 = new class436(10, class434.field4646);

    @ObfuscatedName("mr.as")
    public class436 field3577 = new class436(10, class434.field4646);

    public class336(class371 arg0, class371 arg1, class371 arg2, class371 arg3, class371 arg4) {
        int var6 = 0;
        if (arg0 != null) {
            this.field3567 = arg0;
            this.field3566 = arg1;
            this.field3576 = arg2;
            this.field3564 = arg3;
            this.field3565 = arg4;
            var6 = this.field3567.method6351();
        }
        this.field3569 = new class344[var6][];
        Statics.field3570 = new boolean[var6];
    }

    @ObfuscatedName("mr.at(IB)Lnn;")
    public class344 method5636(int arg0) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (this.field3569[var2] == null || this.field3569[var2][var3] == null) {
            boolean var4 = this.method5633(var2);
            if (!var4) {
                return null;
            }
        }
        return this.field3569[var2][var3];
    }

    @ObfuscatedName("mr.ah(III)Lnn;")
    public class344 method5630(int arg0, int arg1) {
        class344 var3 = this.method5636(arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3797 == null || arg1 >= var3.field3797.length) {
            return null;
        } else {
            return var3.field3797[arg1];
        }
    }

    @ObfuscatedName("mr.ar(II)Z")
    public boolean method5633(int arg0) {
        if (Statics.field3570[arg0]) {
            return true;
        } else if (this.field3567.method6288(arg0)) {
            int var2 = this.field3567.method6294(arg0);
            if (var2 == 0) {
                Statics.field3570[arg0] = true;
                return true;
            }
            if (this.field3569[arg0] == null) {
                this.field3569[arg0] = new class344[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (this.field3569[arg0][var3] == null) {
                    byte[] var4 = this.field3567.method6284(arg0, var3);
                    if (var4 != null) {
                        this.field3569[arg0][var3] = new class344();
                        this.field3569[arg0][var3].field3659 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            this.field3569[arg0][var3].method6008(new class527(var4));
                        } else {
                            this.field3569[arg0][var3].method6007(new class527(var4));
                        }
                        if (this.field3565 != null) {
                            byte[] var5 = this.field3565.method6284(arg0, var3);
                            if (var5 != null && var5.length > 0) {
                                this.field3569[arg0][var3].method6117(new class527(var5));
                                this.field3573.put(this.field3569[arg0][var3].field3661, arg0);
                            }
                        }
                    }
                }
            }
            Statics.field3570[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mr.ao(IB)V")
    public void method5634(int arg0) {
        if (arg0 == -1 || !Statics.field3570[arg0]) {
            return;
        }
        this.field3567.method6338(arg0);
        if (this.field3569[arg0] == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3569[arg0].length; var2++) {
            if (this.field3569[arg0][var2] != null) {
                this.field3569[arg0][var2] = null;
            }
        }
        this.field3569[arg0] = null;
        Statics.field3570[arg0] = false;
    }

    @ObfuscatedName("mr.ab(I)V")
    public void method5639() {
        this.field3572.method5292();
        this.field3571.method5292();
        this.field3574.method5292();
        this.field3575.method5292();
    }
}
