package deob;

import java.util.zip.CRC32;

@ObfuscatedName("nd")
public class class342 extends class344 {

    @ObfuscatedName("nd.ab")
    public class418 field4203;

    @ObfuscatedName("nd.aq")
    public class418 field4211;

    @ObfuscatedName("nd.al")
    public int field4204;

    @ObfuscatedName("nd.at")
    public volatile int field4205 = 0;

    @ObfuscatedName("nd.aa")
    public boolean field4206 = false;

    @ObfuscatedName("nd.ay")
    public volatile boolean[] field4207;

    @ObfuscatedName("nd.ao")
    public static CRC32 field4213 = new CRC32();

    @ObfuscatedName("nd.ax")
    public int field4209;

    @ObfuscatedName("nd.ai")
    public int field4202;

    @ObfuscatedName("nd.ag")
    public int field4208 = -1;

    @ObfuscatedName("nd.ah")
    public boolean field4212 = false;

    public class342(class418 arg0, class418 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        super(arg3, arg4);
        this.field4203 = arg0;
        this.field4211 = arg1;
        this.field4204 = arg2;
        this.field4206 = arg5;
        this.field4212 = arg6;
        int var9 = this.field4204;
        if (this.field4212) {
            if (var9 <= class345.field4239) {
                throw new RuntimeException("");
            }
            if (var9 < class345.field4258) {
                class345.field4258 = var9;
            }
        } else if (var9 >= class345.field4258) {
            throw new RuntimeException("");
        } else if (var9 > class345.field4239) {
            class345.field4239 = var9;
        }
        if (Statics.field929 == null) {
            class345.method1131((class342) null, 255, 255, 0, (byte) 0, true);
            class345.field4240[var9] = this;
        } else {
            Statics.field929.field4989 = var9 * 8 + 5;
            if (Statics.field929.field4989 >= Statics.field929.field4991.length) {
                if (!this.field4212) {
                    throw new RuntimeException("");
                }
                this.method6042();
            } else {
                int var10 = Statics.field929.method8254();
                int var11 = Statics.field929.method8254();
                this.method6021(var10, var11);
            }
        }
    }

    @ObfuscatedName("nd.af(B)Z")
    public boolean method6016() {
        return this.field4205 == 1;
    }

    @ObfuscatedName("nd.an(B)I")
    public int method6017() {
        if (this.field4205 == 1 || this.field4212 && this.field4205 == 2) {
            return 100;
        } else if (this.field4231 == null) {
            int var1 = class345.method298(255, this.field4204);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("nd.aw(II)V")
    public void method6044(int arg0) {
        int var2 = this.field4204;
        long var3 = (long) ((var2 << 16) + arg0);
        class343 var5 = (class343) class345.field4247.method7966(var3);
        if (var5 != null) {
            class345.field4246.method6320(var5);
        }
    }

    @ObfuscatedName("nd.ac(II)V")
    public void method6019(int arg0) {
        if (this.field4203 == null || this.field4207 == null || !this.field4207[arg0]) {
            class345.method1131(this, this.field4204, arg0, this.field4225[arg0], (byte) 2, true);
            return;
        }
        class418 var2 = this.field4203;
        byte[] var4 = null;
        class363 var5 = class341.field4196;
        synchronized (class341.field4196) {
            for (class340 var6 = (class340) class341.field4196.method6329(); var6 != null; var6 = (class340) class341.field4196.method6338()) {
                if ((long) arg0 == var6.field4745 && var6.field4192 == var2 && var6.field4190 == 0) {
                    var4 = var6.field4191;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method7351(arg0);
            this.method6023(var2, arg0, var8, true);
        } else {
            this.method6023(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("nd.au(B)V")
    public void method6042() {
        this.field4205 = 2;
        this.field4232 = new int[0];
        this.field4225 = new int[0];
        this.field4228 = new int[0];
        this.field4227 = new int[0];
        this.field4222 = new int[0][];
        this.field4231 = new Object[0];
        this.field4234 = new Object[0][];
    }

    @ObfuscatedName("nd.ab(III)V")
    public void method6021(int arg0, int arg1) {
        this.field4209 = arg0;
        this.field4202 = arg1;
        if (this.field4211 == null) {
            class345.method1131(this, 255, this.field4204, this.field4209, (byte) 0, true);
            return;
        }
        int var3 = this.field4204;
        class418 var4 = this.field4211;
        byte[] var6 = null;
        class363 var7 = class341.field4196;
        synchronized (class341.field4196) {
            for (class340 var8 = (class340) class341.field4196.method6329(); var8 != null; var8 = (class340) class341.field4196.method6338()) {
                if ((long) var3 == var8.field4745 && var8.field4192 == var4 && var8.field4190 == 0) {
                    var6 = var8.field4191;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method7351(var3);
            this.method6023(var4, var3, var10, true);
        } else {
            this.method6023(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("nd.aq(I[BZZI)V")
    public void method6022(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field4205 == 1) {
                throw new RuntimeException();
            }
            if (this.field4211 != null) {
                class341.method1945(this.field4204, arg1, this.field4211);
            }
            this.method6069(arg1);
            this.method6026();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field4228[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field4228[arg0];
        if (this.field4203 != null) {
            class341.method1945(arg0, arg1, this.field4203);
            this.field4207[arg0] = true;
        }
        if (arg3) {
            this.field4231[arg0] = class321.method2705(arg1, false);
        }
    }

    @ObfuscatedName("nd.al(Lqk;I[BZB)V")
    public void method6023(class418 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field4211 != arg0) {
            if (!arg3 && this.field4208 == arg1) {
                this.field4205 = 1;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4207[arg1] = false;
                if (this.field4206 || arg3) {
                    class345.method1131(this, this.field4204, arg1, this.field4225[arg1], (byte) 2, arg3);
                }
                return;
            }
            field4213.reset();
            field4213.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field4213.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field4225[arg1] != var9 || this.field4228[arg1] != var10) {
                this.field4207[arg1] = false;
                if (this.field4206 || arg3) {
                    class345.method1131(this, this.field4204, arg1, this.field4225[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field4207[arg1] = true;
            if (arg3) {
                this.field4231[arg1] = class321.method2705(arg2, false);
            }
            return;
        }
        if (this.field4205 == 1) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class345.method1131(this, 255, this.field4204, this.field4209, (byte) 0, true);
            return;
        }
        field4213.reset();
        field4213.update(arg2, 0, arg2.length);
        int var5 = (int) field4213.getValue();
        if (this.field4209 != var5) {
            class345.method1131(this, 255, this.field4204, this.field4209, (byte) 0, true);
            return;
        }
        class489 var6 = new class489(class344.method169(arg2));
        int var7 = var6.method8248();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field4204 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method8254();
        }
        if (this.field4202 != var8) {
            class345.method1131(this, 255, this.field4204, this.field4209, (byte) 0, true);
            return;
        }
        this.method6069(arg2);
        this.method6026();
    }

    @ObfuscatedName("nd.at(I)V")
    public void method6026() {
        this.field4207 = new boolean[this.field4231.length];
        for (int var1 = 0; var1 < this.field4207.length; var1++) {
            this.field4207[var1] = false;
        }
        if (this.field4203 == null) {
            this.field4205 = 1;
            return;
        }
        this.field4208 = -1;
        for (int var2 = 0; var2 < this.field4207.length; var2++) {
            if (this.field4227[var2] > 0) {
                class341.method4574(var2, this.field4203, this);
                this.field4208 = var2;
            }
        }
        if (this.field4208 == -1) {
            this.field4205 = 1;
        }
    }

    @ObfuscatedName("nd.aa(II)I")
    public int method6025(int arg0) {
        if (this.field4231[arg0] == null) {
            return this.field4207[arg0] ? 100 : class345.method298(this.field4204, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("nd.ay(II)Z")
    public boolean method6031(int arg0) {
        return this.field4207[arg0];
    }

    @ObfuscatedName("nd.ao(II)Z")
    public boolean method6027(int arg0) {
        return this.method6074(arg0) != null;
    }

    @ObfuscatedName("nd.ax(B)I")
    public int method6048() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4231.length; var3++) {
            if (this.field4227[var3] > 0) {
                var1 += 100;
                var2 += this.method6025(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
