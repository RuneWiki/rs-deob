package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("na")
public class class354 {

    @ObfuscatedName("na.ac")
    public class391 field3765;

    @ObfuscatedName("na.ae")
    public class391 field3758;

    @ObfuscatedName("na.ag")
    public class391 field3759;

    @ObfuscatedName("na.am")
    public class391 field3760;

    @ObfuscatedName("na.ax")
    public class391 field3761;

    @ObfuscatedName("na.aq")
    public class363[][] field3764;

    @ObfuscatedName("na.at")
    public Map field3763 = new HashMap();

    @ObfuscatedName("na.au")
    public class317 field3757 = new class317(200);

    @ObfuscatedName("na.ar")
    public class317 field3762 = new class317(50);

    @ObfuscatedName("na.al")
    public class317 field3766 = new class317(20);

    @ObfuscatedName("na.ad")
    public class317 field3767 = new class317(8);

    @ObfuscatedName("na.ah")
    public class465 field3768 = new class465(10, class463.field4932);

    @ObfuscatedName("na.ap")
    public class465 field3769 = new class465(10, class463.field4932);

    public class354(class391 arg0, class391 arg1, class391 arg2, class391 arg3, class391 arg4) {
        int var6 = 0;
        if (arg0 != null) {
            this.field3765 = arg0;
            this.field3759 = arg1;
            this.field3760 = arg2;
            this.field3761 = arg3;
            this.field3758 = arg4;
            var6 = this.field3765.method6793();
        }
        this.field3764 = new class363[var6][];
        Statics.field3677 = new boolean[var6];
    }

    @ObfuscatedName("na.ac(II)Lny;")
    public class363 method6131(int arg0) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (this.field3764[var2] == null || this.field3764[var2][var3] == null) {
            boolean var4 = this.method6146(var2);
            if (!var4) {
                return null;
            }
        }
        return this.field3764[var2][var3];
    }

    @ObfuscatedName("na.ae(III)Lny;")
    public class363 method6130(int arg0, int arg1) {
        class363 var3 = this.method6131(arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3951 == null || arg1 >= var3.field3951.length) {
            return null;
        } else {
            return var3.field3951[arg1];
        }
    }

    @ObfuscatedName("na.ag(IB)Z")
    public boolean method6146(int arg0) {
        if (Statics.field3677[arg0]) {
            return true;
        } else if (this.field3765.method6786(arg0)) {
            int var2 = this.field3765.method6792(arg0);
            if (var2 == 0) {
                Statics.field3677[arg0] = true;
                return true;
            }
            if (this.field3764[arg0] == null) {
                this.field3764[arg0] = new class363[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (this.field3764[arg0][var3] == null) {
                    byte[] var4 = this.field3765.method6782(arg0, var3);
                    if (var4 != null) {
                        this.field3764[arg0][var3] = new class363();
                        this.field3764[arg0][var3].field3852 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            this.field3764[arg0][var3].method6525(new class551(var4));
                        } else {
                            this.field3764[arg0][var3].method6638(new class551(var4));
                        }
                        if (this.field3758 != null) {
                            byte[] var5 = this.field3758.method6782(arg0, var3);
                            if (var5 != null && var5.length > 0) {
                                this.field3764[arg0][var3].method6623(new class551(var5));
                                this.field3763.put(this.field3764[arg0][var3].field3854, arg0);
                            }
                        }
                    }
                }
            }
            Statics.field3677[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("na.am(IB)V")
    public void method6145(int arg0) {
        if (arg0 == -1 || !Statics.field3677[arg0]) {
            return;
        }
        this.field3765.method6795(arg0);
        if (this.field3764[arg0] == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3764[arg0].length; var2++) {
            if (this.field3764[arg0][var2] != null) {
                this.field3764[arg0][var2] = null;
            }
        }
        this.field3764[arg0] = null;
        Statics.field3677[arg0] = false;
    }

    @ObfuscatedName("na.ax(B)V")
    public void method6135() {
        this.field3757.method5736();
        this.field3762.method5736();
        this.field3766.method5736();
        this.field3767.method5736();
    }
}
