package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("nw")
public class class352 {

    @ObfuscatedName("nw.ab")
    public class389 field3710;

    @ObfuscatedName("nw.ay")
    public class389 field3712;

    @ObfuscatedName("nw.an")
    public class389 field3717;

    @ObfuscatedName("nw.au")
    public class389 field3713;

    @ObfuscatedName("nw.ax")
    public class389 field3707;

    @ObfuscatedName("nw.ao")
    public class361[][] field3709;

    @ObfuscatedName("nw.ac")
    public Map field3715 = new HashMap();

    @ObfuscatedName("nw.ae")
    public class315 field3714 = new class315(200);

    @ObfuscatedName("nw.ad")
    public class315 field3708 = new class315(50);

    @ObfuscatedName("nw.aq")
    public class315 field3716 = new class315(20);

    @ObfuscatedName("nw.al")
    public class315 field3711 = new class315(8);

    @ObfuscatedName("nw.aj")
    public class463 field3718 = new class463(10, class461.field4877);

    @ObfuscatedName("nw.as")
    public class463 field3719 = new class463(10, class461.field4877);

    public class352(class389 arg0, class389 arg1, class389 arg2, class389 arg3, class389 arg4) {
        int var6 = 0;
        if (arg0 != null) {
            this.field3710 = arg0;
            this.field3717 = arg1;
            this.field3713 = arg2;
            this.field3707 = arg3;
            this.field3712 = arg4;
            var6 = this.field3710.method6649();
        }
        this.field3709 = new class361[var6][];
        Statics.field3973 = new boolean[var6];
    }

    @ObfuscatedName("nw.ab(IB)Lnq;")
    public class361 method5964(int arg0) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (this.field3709[var2] == null || this.field3709[var2][var3] == null) {
            boolean var4 = this.method5980(var2);
            if (!var4) {
                return null;
            }
        }
        return this.field3709[var2][var3];
    }

    @ObfuscatedName("nw.ay(IIB)Lnq;")
    public class361 method5965(int arg0, int arg1) {
        class361 var3 = this.method5964(arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3936 == null || arg1 >= var3.field3936.length) {
            return null;
        } else {
            return var3.field3936[arg1];
        }
    }

    @ObfuscatedName("nw.an(II)Z")
    public boolean method5980(int arg0) {
        if (Statics.field3973[arg0]) {
            return true;
        } else if (this.field3710.method6642(arg0)) {
            int var2 = this.field3710.method6685(arg0);
            if (var2 == 0) {
                Statics.field3973[arg0] = true;
                return true;
            }
            if (this.field3709[arg0] == null) {
                this.field3709[arg0] = new class361[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (this.field3709[arg0][var3] == null) {
                    byte[] var4 = this.field3710.method6670(arg0, var3);
                    if (var4 != null) {
                        this.field3709[arg0][var3] = new class361();
                        this.field3709[arg0][var3].field3941 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            this.field3709[arg0][var3].method6357(new class549(var4));
                        } else {
                            this.field3709[arg0][var3].method6356(new class549(var4));
                        }
                        if (this.field3712 != null) {
                            byte[] var5 = this.field3712.method6670(arg0, var3);
                            if (var5 != null && var5.length > 0) {
                                this.field3709[arg0][var3].method6363(new class549(var5));
                                this.field3715.put(this.field3709[arg0][var3].field3805, arg0);
                            }
                        }
                    }
                }
            }
            Statics.field3973[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nw.au(II)V")
    public void method5967(int arg0) {
        if (arg0 == -1 || !Statics.field3973[arg0]) {
            return;
        }
        this.field3710.method6651(arg0);
        if (this.field3709[arg0] == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3709[arg0].length; var2++) {
            if (this.field3709[arg0][var2] != null) {
                this.field3709[arg0][var2] = null;
            }
        }
        this.field3709[arg0] = null;
        Statics.field3973[arg0] = false;
    }

    @ObfuscatedName("nw.ax(I)V")
    public void method5968() {
        this.field3714.method5588();
        this.field3708.method5588();
        this.field3716.method5588();
        this.field3711.method5588();
    }
}
