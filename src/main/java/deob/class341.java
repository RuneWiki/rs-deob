package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("nm")
public class class341 {

    @ObfuscatedName("nm.az")
    public class379 field3642;

    @ObfuscatedName("nm.ah")
    public class379 field3651;

    @ObfuscatedName("nm.af")
    public class379 field3654;

    @ObfuscatedName("nm.at")
    public class379 field3644;

    @ObfuscatedName("nm.an")
    public class379 field3650;

    @ObfuscatedName("nm.ao")
    public class350[][] field3646;

    @ObfuscatedName("nm.aw")
    public Map field3648 = new HashMap();

    @ObfuscatedName("nm.ad")
    public class304 field3649 = new class304(200);

    @ObfuscatedName("nm.al")
    public class304 field3645 = new class304(50);

    @ObfuscatedName("nm.as")
    public class304 field3641 = new class304(20);

    @ObfuscatedName("nm.ag")
    public class304 field3652 = new class304(8);

    @ObfuscatedName("nm.ai")
    public class444 field3653 = new class444(10, class442.field4749);

    @ObfuscatedName("nm.ax")
    public class444 field3643 = new class444(10, class442.field4749);

    public class341(class379 arg0, class379 arg1, class379 arg2, class379 arg3, class379 arg4) {
        int var6 = 0;
        if (arg0 != null) {
            this.field3642 = arg0;
            this.field3654 = arg1;
            this.field3644 = arg2;
            this.field3650 = arg3;
            this.field3651 = arg4;
            var6 = this.field3642.method6339();
        }
        this.field3646 = new class350[var6][];
        Statics.field3647 = new boolean[var6];
    }

    @ObfuscatedName("nm.az(II)Lnt;")
    public class350 method5681(int arg0) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (this.field3646[var2] == null || this.field3646[var2][var3] == null) {
            boolean var4 = this.method5685(var2);
            if (!var4) {
                return null;
            }
        }
        return this.field3646[var2][var3];
    }

    @ObfuscatedName("nm.ah(III)Lnt;")
    public class350 method5686(int arg0, int arg1) {
        class350 var3 = this.method5681(arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3862 == null || arg1 >= var3.field3862.length) {
            return null;
        } else {
            return var3.field3862[arg1];
        }
    }

    @ObfuscatedName("nm.af(IB)Z")
    public boolean method5685(int arg0) {
        if (Statics.field3647[arg0]) {
            return true;
        } else if (this.field3642.method6332(arg0)) {
            int var2 = this.field3642.method6338(arg0);
            if (var2 == 0) {
                Statics.field3647[arg0] = true;
                return true;
            }
            if (this.field3646[arg0] == null) {
                this.field3646[arg0] = new class350[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (this.field3646[arg0][var3] == null) {
                    byte[] var4 = this.field3642.method6328(arg0, var3);
                    if (var4 != null) {
                        this.field3646[arg0][var3] = new class350();
                        this.field3646[arg0][var3].field3769 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            this.field3646[arg0][var3].method6089(new class535(var4));
                        } else {
                            this.field3646[arg0][var3].method6046(new class535(var4));
                        }
                        if (this.field3651 != null) {
                            byte[] var5 = this.field3651.method6328(arg0, var3);
                            if (var5 != null && var5.length > 0) {
                                this.field3646[arg0][var3].method6048(new class535(var5));
                                this.field3648.put(this.field3646[arg0][var3].field3745, arg0);
                            }
                        }
                    }
                }
            }
            Statics.field3647[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nm.at(IB)V")
    public void method5683(int arg0) {
        if (arg0 == -1 || !Statics.field3647[arg0]) {
            return;
        }
        this.field3642.method6341(arg0);
        if (this.field3646[arg0] == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3646[arg0].length; var2++) {
            if (this.field3646[arg0][var2] != null) {
                this.field3646[arg0][var2] = null;
            }
        }
        this.field3646[arg0] = null;
        Statics.field3647[arg0] = false;
    }

    @ObfuscatedName("nm.an(I)V")
    public void method5684() {
        this.field3649.method5339();
        this.field3645.method5339();
        this.field3641.method5339();
        this.field3652.method5339();
    }
}
