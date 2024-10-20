package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("nc")
public class class350 {

    @ObfuscatedName("nc.aq")
    public class388 field3745;

    @ObfuscatedName("nc.ad")
    public class388 field3737;

    @ObfuscatedName("nc.ag")
    public class388 field3744;

    @ObfuscatedName("nc.ak")
    public class388 field3749;

    @ObfuscatedName("nc.ap")
    public class388 field3739;

    @ObfuscatedName("nc.an")
    public class359[][] field3741;

    @ObfuscatedName("nc.av")
    public Map field3743 = new HashMap();

    @ObfuscatedName("nc.ab")
    public class313 field3740 = new class313(200);

    @ObfuscatedName("nc.ai")
    public class313 field3736 = new class313(50);

    @ObfuscatedName("nc.ae")
    public class313 field3738 = new class313(20);

    @ObfuscatedName("nc.au")
    public class313 field3747 = new class313(8);

    @ObfuscatedName("nc.ah")
    public class462 field3748 = new class462(10, class460.field4898);

    @ObfuscatedName("nc.az")
    public class462 field3746 = new class462(10, class460.field4898);

    public class350(class388 arg0, class388 arg1, class388 arg2, class388 arg3, class388 arg4) {
        int var6 = 0;
        if (arg0 != null) {
            this.field3745 = arg0;
            this.field3744 = arg1;
            this.field3749 = arg2;
            this.field3739 = arg3;
            this.field3737 = arg4;
            var6 = this.field3745.method6561();
        }
        this.field3741 = new class359[var6][];
        Statics.field3742 = new boolean[var6];
    }

    @ObfuscatedName("nc.aq(II)Lnx;")
    public class359 method5895(int arg0) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (this.field3741[var2] == null || this.field3741[var2][var3] == null) {
            boolean var4 = this.method5890(var2);
            if (!var4) {
                return null;
            }
        }
        return this.field3741[var2][var3];
    }

    @ObfuscatedName("nc.ad(IIB)Lnx;")
    public class359 method5889(int arg0, int arg1) {
        class359 var3 = this.method5895(arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3969 == null || arg1 >= var3.field3969.length) {
            return null;
        } else {
            return var3.field3969[arg1];
        }
    }

    @ObfuscatedName("nc.ag(II)Z")
    public boolean method5890(int arg0) {
        if (Statics.field3742[arg0]) {
            return true;
        } else if (this.field3745.method6543(arg0)) {
            int var2 = this.field3745.method6549(arg0);
            if (var2 == 0) {
                Statics.field3742[arg0] = true;
                return true;
            }
            if (this.field3741[arg0] == null) {
                this.field3741[arg0] = new class359[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (this.field3741[arg0][var3] == null) {
                    byte[] var4 = this.field3745.method6539(arg0, var3);
                    if (var4 != null) {
                        this.field3741[arg0][var3] = new class359();
                        this.field3741[arg0][var3].field3831 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            this.field3741[arg0][var3].method6233(new class547(var4));
                        } else {
                            this.field3741[arg0][var3].method6276(new class547(var4));
                        }
                        if (this.field3737 != null) {
                            byte[] var5 = this.field3737.method6539(arg0, var3);
                            if (var5 != null && var5.length > 0) {
                                this.field3741[arg0][var3].method6234(new class547(var5));
                                this.field3743.put(this.field3741[arg0][var3].field3833, arg0);
                            }
                        }
                    }
                }
            }
            Statics.field3742[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nc.ak(IB)V")
    public void method5888(int arg0) {
        if (arg0 == -1 || !Statics.field3742[arg0]) {
            return;
        }
        this.field3745.method6552(arg0);
        if (this.field3741[arg0] == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3741[arg0].length; var2++) {
            if (this.field3741[arg0][var2] != null) {
                this.field3741[arg0][var2] = null;
            }
        }
        this.field3741[arg0] = null;
        Statics.field3742[arg0] = false;
    }

    @ObfuscatedName("nc.ap(S)V")
    public void method5892() {
        this.field3740.method5500();
        this.field3736.method5500();
        this.field3738.method5500();
        this.field3747.method5500();
    }
}
