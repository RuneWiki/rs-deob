package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("nk")
public class class349 {

    @ObfuscatedName("nk.ak")
    public class387 field3727;

    @ObfuscatedName("nk.al")
    public class387 field3718;

    @ObfuscatedName("nk.aj")
    public class387 field3724;

    @ObfuscatedName("nk.az")
    public class387 field3720;

    @ObfuscatedName("nk.af")
    public class387 field3721;

    @ObfuscatedName("nk.aa")
    public class358[][] field3722;

    @ObfuscatedName("nk.ab")
    public Map field3723 = new HashMap();

    @ObfuscatedName("nk.ac")
    public class312 field3731 = new class312(200);

    @ObfuscatedName("nk.ao")
    public class312 field3725 = new class312(50);

    @ObfuscatedName("nk.ah")
    public class312 field3728 = new class312(20);

    @ObfuscatedName("nk.av")
    public class312 field3726 = new class312(8);

    @ObfuscatedName("nk.aq")
    public class461 field3729 = new class461(10, class459.field4878);

    @ObfuscatedName("nk.ap")
    public class461 field3717 = new class461(10, class459.field4878);

    public class349(class387 arg0, class387 arg1, class387 arg2, class387 arg3, class387 arg4) {
        int var6 = 0;
        if (arg0 != null) {
            this.field3727 = arg0;
            this.field3724 = arg1;
            this.field3720 = arg2;
            this.field3721 = arg3;
            this.field3718 = arg4;
            var6 = this.field3727.method6582();
        }
        this.field3722 = new class358[var6][];
        Statics.field1749 = new boolean[var6];
    }

    @ObfuscatedName("nk.ak(IB)Lnb;")
    public class358 method5906(int arg0) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (this.field3722[var2] == null || this.field3722[var2][var3] == null) {
            boolean var4 = this.method5908(var2);
            if (!var4) {
                return null;
            }
        }
        return this.field3722[var2][var3];
    }

    @ObfuscatedName("nk.al(III)Lnb;")
    public class358 method5909(int arg0, int arg1) {
        class358 var3 = this.method5906(arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3884 == null || arg1 >= var3.field3884.length) {
            return null;
        } else {
            return var3.field3884[arg1];
        }
    }

    @ObfuscatedName("nk.aj(IB)Z")
    public boolean method5908(int arg0) {
        if (Statics.field1749[arg0]) {
            return true;
        } else if (this.field3727.method6576(arg0)) {
            int var2 = this.field3727.method6591(arg0);
            if (var2 == 0) {
                Statics.field1749[arg0] = true;
                return true;
            }
            if (this.field3722[arg0] == null) {
                this.field3722[arg0] = new class358[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (this.field3722[arg0][var3] == null) {
                    byte[] var4 = this.field3727.method6573(arg0, var3);
                    if (var4 != null) {
                        this.field3722[arg0][var3] = new class358();
                        this.field3722[arg0][var3].field3815 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            this.field3722[arg0][var3].method6284(new class546(var4));
                        } else {
                            this.field3722[arg0][var3].method6368(new class546(var4));
                        }
                        if (this.field3718 != null) {
                            byte[] var5 = this.field3718.method6573(arg0, var3);
                            if (var5 != null && var5.length > 0) {
                                this.field3722[arg0][var3].method6281(new class546(var5));
                                this.field3723.put(this.field3722[arg0][var3].field3817, arg0);
                            }
                        }
                    }
                }
            }
            Statics.field1749[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nk.az(II)V")
    public void method5910(int arg0) {
        if (arg0 == -1 || !Statics.field1749[arg0]) {
            return;
        }
        this.field3727.method6584(arg0);
        if (this.field3722[arg0] == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3722[arg0].length; var2++) {
            if (this.field3722[arg0][var2] != null) {
                this.field3722[arg0][var2] = null;
            }
        }
        this.field3722[arg0] = null;
        Statics.field1749[arg0] = false;
    }

    @ObfuscatedName("nk.af(I)V")
    public void method5920() {
        this.field3731.method5572();
        this.field3725.method5572();
        this.field3728.method5572();
        this.field3726.method5572();
    }
}
