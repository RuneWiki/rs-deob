package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("nm")
public class class353 {

    @ObfuscatedName("nm.ap")
    public class392 field3784;

    @ObfuscatedName("nm.aw")
    public class392 field3781;

    @ObfuscatedName("nm.ak")
    public class392 field3782;

    @ObfuscatedName("nm.aj")
    public class392 field3780;

    @ObfuscatedName("nm.ai")
    public class392 field3788;

    @ObfuscatedName("nm.ay")
    public class362[][] field3785;

    @ObfuscatedName("nm.ae")
    public Map field3791 = new HashMap();

    @ObfuscatedName("nm.am")
    public class316 field3787 = new class316(200);

    @ObfuscatedName("nm.at")
    public class316 field3786 = new class316(50);

    @ObfuscatedName("nm.au")
    public class316 field3789 = new class316(20);

    @ObfuscatedName("nm.an")
    public class316 field3790 = new class316(8);

    @ObfuscatedName("nm.ao")
    public class466 field3783 = new class466(10, class464.field4961);

    @ObfuscatedName("nm.af")
    public class466 field3792 = new class466(10, class464.field4961);

    public class353(class392 arg0, class392 arg1, class392 arg2, class392 arg3, class392 arg4) {
        int var6 = 0;
        if (arg0 != null) {
            this.field3784 = arg0;
            this.field3782 = arg1;
            this.field3780 = arg2;
            this.field3788 = arg3;
            this.field3781 = arg4;
            var6 = this.field3784.method7047();
        }
        this.field3785 = new class362[var6][];
        Statics.field1827 = new boolean[var6];
    }

    @ObfuscatedName("nm.ap(II)Lng;")
    public class362 method6314(int arg0) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (this.field3785[var2] == null || this.field3785[var2][var3] == null) {
            boolean var4 = this.method6299(var2);
            if (!var4) {
                return null;
            }
        }
        return this.field3785[var2][var3];
    }

    @ObfuscatedName("nm.aw(IIB)Lng;")
    public class362 method6298(int arg0, int arg1) {
        class362 var3 = this.method6314(arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field4009 == null || arg1 >= var3.field4009.length) {
            return null;
        } else {
            return var3.field4009[arg1];
        }
    }

    @ObfuscatedName("nm.ak(II)Z")
    public boolean method6299(int arg0) {
        if (Statics.field1827[arg0]) {
            return true;
        } else if (this.field3784.method6991(arg0)) {
            int var2 = this.field3784.method7004(arg0);
            if (var2 == 0) {
                Statics.field1827[arg0] = true;
                return true;
            }
            if (this.field3785[arg0] == null) {
                this.field3785[arg0] = new class362[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (this.field3785[arg0][var3] == null) {
                    byte[] var4 = this.field3784.method7009(arg0, var3);
                    if (var4 != null) {
                        this.field3785[arg0][var3] = new class362();
                        this.field3785[arg0][var3].field3878 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            this.field3785[arg0][var3].method6694(new class558(var4));
                        } else {
                            this.field3785[arg0][var3].method6704(new class558(var4));
                        }
                        if (this.field3781 != null) {
                            byte[] var5 = this.field3781.method7009(arg0, var3);
                            if (var5 != null && var5.length > 0) {
                                this.field3785[arg0][var3].method6804(new class558(var5));
                                this.field3791.put(this.field3785[arg0][var3].field3880, arg0);
                            }
                        }
                    }
                }
            }
            Statics.field1827[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nm.aj(IB)V")
    public void method6296(int arg0) {
        if (arg0 == -1 || !Statics.field1827[arg0]) {
            return;
        }
        this.field3784.method7007(arg0);
        if (this.field3785[arg0] == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3785[arg0].length; var2++) {
            if (this.field3785[arg0][var2] != null) {
                this.field3785[arg0][var2] = null;
            }
        }
        this.field3785[arg0] = null;
        Statics.field1827[arg0] = false;
    }

    @ObfuscatedName("nm.ai(I)V")
    public void method6301() {
        this.field3787.method5930();
        this.field3786.method5930();
        this.field3789.method5930();
        this.field3790.method5930();
    }
}
