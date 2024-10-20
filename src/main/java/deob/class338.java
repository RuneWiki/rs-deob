package deob;

import java.util.zip.CRC32;

@ObfuscatedName("mx")
public class class338 extends class340 {

    @ObfuscatedName("mx.ao")
    public class414 field4168;

    @ObfuscatedName("mx.av")
    public class414 field4165;

    @ObfuscatedName("mx.aq")
    public int field4172;

    @ObfuscatedName("mx.ap")
    public volatile int field4173 = 0;

    @ObfuscatedName("mx.ar")
    public boolean field4174 = false;

    @ObfuscatedName("mx.ak")
    public volatile boolean[] field4170;

    @ObfuscatedName("mx.ax")
    public static CRC32 field4176 = new CRC32();

    @ObfuscatedName("mx.as")
    public int field4177;

    @ObfuscatedName("mx.ay")
    public int field4175;

    @ObfuscatedName("mx.am")
    public int field4179 = -1;

    @ObfuscatedName("mx.az")
    public boolean field4180 = false;

    public class338(class414 arg0, class414 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        super(arg3, arg4);
        this.field4168 = arg0;
        this.field4165 = arg1;
        this.field4172 = arg2;
        this.field4174 = arg5;
        this.field4180 = arg6;
        int var9 = this.field4172;
        if (this.field4180) {
            if (var9 <= class341.field4220) {
                throw new RuntimeException("");
            }
            if (var9 < class341.field4221) {
                class341.field4221 = var9;
            }
        } else if (var9 >= class341.field4221) {
            throw new RuntimeException("");
        } else if (var9 > class341.field4220) {
            class341.field4220 = var9;
        }
        if (Statics.field1224 == null) {
            class341.method301((class338) null, 255, 255, 0, (byte) 0, true);
            class341.field4219[var9] = this;
        } else {
            Statics.field1224.field4904 = var9 * 8 + 5;
            if (Statics.field1224.field4904 >= Statics.field1224.field4906.length) {
                if (!this.field4180) {
                    throw new RuntimeException("");
                }
                this.method5813();
            } else {
                int var10 = Statics.field1224.method7908();
                int var11 = Statics.field1224.method7908();
                this.method5814(var10, var11);
            }
        }
    }

    @ObfuscatedName("mx.aj(I)Z")
    public boolean method5851() {
        return this.field4173 == 1;
    }

    @ObfuscatedName("mx.al(B)I")
    public int method5810() {
        if (this.field4173 == 1 || this.field4180 && this.field4173 == 2) {
            return 100;
        } else if (this.field4196 == null) {
            int var1 = this.field4172;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1566 != null && Statics.field1566.field4673 == var2) {
                var4 = Statics.field4216.field4904 * 99 / (Statics.field4216.field4906.length - Statics.field1566.field4185) + 1;
            } else {
                var4 = 0;
            }
            int var5 = var4;
            if (var4 >= 100) {
                var5 = 99;
            }
            return var5;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("mx.ac(IB)V")
    public void method5811(int arg0) {
        int var2 = this.field4172;
        long var3 = (long) ((var2 << 16) + arg0);
        class339 var5 = (class339) class341.field4222.method7619(var3);
        if (var5 != null) {
            class341.field4210.method6076(var5);
        }
    }

    @ObfuscatedName("mx.ab(IB)V")
    public void method5812(int arg0) {
        if (this.field4168 == null || this.field4170 == null || !this.field4170[arg0]) {
            class341.method301(this, this.field4172, arg0, this.field4190[arg0], (byte) 2, true);
            return;
        }
        class414 var2 = this.field4168;
        byte[] var4 = null;
        class359 var5 = class337.field4160;
        synchronized (class337.field4160) {
            for (class336 var6 = (class336) class337.field4160.method6089(); var6 != null; var6 = (class336) class337.field4160.method6098()) {
                if ((long) arg0 == var6.field4673 && var6.field4153 == var2 && var6.field4154 == 0) {
                    var4 = var6.field4157;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method7089(arg0);
            this.method5839(var2, arg0, var8, true);
        } else {
            this.method5839(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("mx.an(I)V")
    public void method5813() {
        this.field4173 = 2;
        this.field4186 = new int[0];
        this.field4190 = new int[0];
        this.field4191 = new int[0];
        this.field4188 = new int[0];
        this.field4187 = new int[0][];
        this.field4196 = new Object[0];
        this.field4197 = new Object[0][];
    }

    @ObfuscatedName("mx.ao(III)V")
    public void method5814(int arg0, int arg1) {
        this.field4177 = arg0;
        this.field4175 = arg1;
        if (this.field4165 == null) {
            class341.method301(this, 255, this.field4172, this.field4177, (byte) 0, true);
            return;
        }
        int var3 = this.field4172;
        class414 var4 = this.field4165;
        byte[] var6 = null;
        class359 var7 = class337.field4160;
        synchronized (class337.field4160) {
            for (class336 var8 = (class336) class337.field4160.method6089(); var8 != null; var8 = (class336) class337.field4160.method6098()) {
                if ((long) var3 == var8.field4673 && var8.field4153 == var4 && var8.field4154 == 0) {
                    var6 = var8.field4157;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method7089(var3);
            this.method5839(var4, var3, var10, true);
        } else {
            this.method5839(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("mx.av(I[BZZI)V")
    public void method5828(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field4173 == 1) {
                throw new RuntimeException();
            }
            if (this.field4165 != null) {
                class337.method2436(this.field4172, arg1, this.field4165);
            }
            this.method5858(arg1);
            this.method5817();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field4191[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field4191[arg0];
        if (this.field4168 != null) {
            class337.method2436(arg0, arg1, this.field4168);
            this.field4170[arg0] = true;
        }
        if (arg3) {
            this.field4196[arg0] = class317.method4672(arg1, false);
        }
    }

    @ObfuscatedName("mx.aq(Lpv;I[BZI)V")
    public void method5839(class414 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field4165 != arg0) {
            if (!arg3 && this.field4179 == arg1) {
                this.field4173 = 1;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4170[arg1] = false;
                if (this.field4174 || arg3) {
                    class341.method301(this, this.field4172, arg1, this.field4190[arg1], (byte) 2, arg3);
                }
                return;
            }
            field4176.reset();
            field4176.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field4176.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field4190[arg1] != var9 || this.field4191[arg1] != var10) {
                this.field4170[arg1] = false;
                if (this.field4174 || arg3) {
                    class341.method301(this, this.field4172, arg1, this.field4190[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field4170[arg1] = true;
            if (arg3) {
                this.field4196[arg1] = class317.method4672(arg2, false);
            }
            return;
        }
        if (this.field4173 == 1) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class341.method301(this, 255, this.field4172, this.field4177, (byte) 0, true);
            return;
        }
        field4176.reset();
        field4176.update(arg2, 0, arg2.length);
        int var5 = (int) field4176.getValue();
        if (this.field4177 != var5) {
            class341.method301(this, 255, this.field4172, this.field4177, (byte) 0, true);
            return;
        }
        class478 var6 = new class478(class340.method6743(arg2));
        int var7 = var6.method7909();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field4172 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method7908();
        }
        if (this.field4175 != var8) {
            class341.method301(this, 255, this.field4172, this.field4177, (byte) 0, true);
            return;
        }
        this.method5858(arg2);
        this.method5817();
    }

    @ObfuscatedName("mx.ap(B)V")
    public void method5817() {
        this.field4170 = new boolean[this.field4196.length];
        for (int var1 = 0; var1 < this.field4170.length; var1++) {
            this.field4170[var1] = false;
        }
        if (this.field4168 == null) {
            this.field4173 = 1;
            return;
        }
        this.field4179 = -1;
        for (int var2 = 0; var2 < this.field4170.length; var2++) {
            if (this.field4188[var2] > 0) {
                class337.method5761(var2, this.field4168, this);
                this.field4179 = var2;
            }
        }
        if (this.field4179 == -1) {
            this.field4173 = 1;
        }
    }

    @ObfuscatedName("mx.ar(II)I")
    public int method5818(int arg0) {
        if (this.field4196[arg0] != null) {
            return 100;
        } else if (this.field4170[arg0]) {
            return 100;
        } else {
            int var2 = this.field4172;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1566 != null && Statics.field1566.field4673 == var3) {
                var5 = Statics.field4216.field4904 * 99 / (Statics.field4216.field4906.length - Statics.field1566.field4185) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("mx.ak(IS)Z")
    public boolean method5849(int arg0) {
        return this.field4170[arg0];
    }

    @ObfuscatedName("mx.ax(IS)Z")
    public boolean method5820(int arg0) {
        return this.method5890(arg0) != null;
    }

    @ObfuscatedName("mx.as(I)I")
    public int method5821() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4196.length; var3++) {
            if (this.field4188[var3] > 0) {
                var1 += 100;
                var2 += this.method5818(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
