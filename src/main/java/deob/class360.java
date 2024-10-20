package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("nf")
public class class360 {

    @ObfuscatedName("nf.au")
    public class439 field4325;

    @ObfuscatedName("nf.ae")
    public int field4323 = 0;

    @ObfuscatedName("nf.ao")
    public long field4303;

    @ObfuscatedName("nf.at")
    public class489 field4315 = new class489(4096);

    @ObfuscatedName("nf.ac")
    public int field4314 = 0;

    @ObfuscatedName("nf.ai")
    public class489 field4306 = new class489(32);

    @ObfuscatedName("nf.az")
    public int field4307 = 0;

    @ObfuscatedName("nf.ap")
    public class377 field4308 = new class377();

    @ObfuscatedName("nf.aa")
    public class489 field4309 = new class489(4096);

    @ObfuscatedName("nf.af")
    public int field4319 = 0;

    @ObfuscatedName("nf.ad")
    public class489 field4311 = new class489(4096);

    @ObfuscatedName("nf.aq")
    public int field4312 = 0;

    @ObfuscatedName("nf.al")
    public boolean field4313;

    @ObfuscatedName("nf.an")
    public class358 field4310;

    @ObfuscatedName("nf.ar")
    public class515 field4302 = new class515(8);

    @ObfuscatedName("nf.ab")
    public class515 field4316;

    @ObfuscatedName("nf.ag")
    public int field4317 = 0;

    @ObfuscatedName("nf.ax")
    public CRC32 field4318 = new CRC32();

    @ObfuscatedName("nf.ah")
    public class515 field4305;

    @ObfuscatedName("nf.as")
    public class357[] field4320 = new class357[256];

    @ObfuscatedName("nf.ay")
    public int field4321 = -1;

    @ObfuscatedName("nf.aj")
    public int field4322 = 255;

    @ObfuscatedName("nf.av")
    public byte field4304 = 0;

    @ObfuscatedName("nf.aw")
    public int field4301 = 0;

    @ObfuscatedName("nf.ak")
    public int field4324 = 0;

    @ObfuscatedName("nf.au(I)Z")
    public boolean method6220() {
        long var1 = class302.method655();
        int var3 = (int) (var1 - this.field4303);
        this.field4303 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4323 += var3;
        if (this.field4312 == 0 && this.field4307 == 0 && this.field4319 == 0 && this.field4314 == 0) {
            return true;
        } else if (this.field4325 == null) {
            return false;
        } else {
            try {
                if (this.field4323 > 30000) {
                    throw new IOException();
                }
                while (this.field4307 < 200 && this.field4314 > 0) {
                    class358 var4 = (class358) this.field4315.method8027();
                    class515 var5 = new class515(4);
                    var5.method8283(1);
                    var5.method8384((int) var4.field4814);
                    this.field4325.method7369(var5.field5108, 0, 4);
                    this.field4306.method8035(var4, var4.field4814);
                    this.field4314--;
                    this.field4307++;
                }
                while (this.field4312 < 200 && this.field4319 > 0) {
                    class358 var6 = (class358) this.field4308.method6380();
                    class515 var7 = new class515(4);
                    var7.method8283(0);
                    var7.method8384((int) var6.field4814);
                    this.field4325.method7369(var7.field5108, 0, 4);
                    var6.method7697();
                    this.field4311.method8035(var6, var6.field4814);
                    this.field4319--;
                    this.field4312++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4325.method7368();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4323 = 0;
                    byte var10 = 0;
                    if (this.field4310 == null) {
                        var10 = 8;
                    } else if (this.field4317 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4302.field5111;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4325.method7367(this.field4302.field5108, this.field4302.field5111, var11);
                        if (this.field4304 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4302.field5108[this.field4302.field5111 + var12] ^= this.field4304;
                            }
                        }
                        this.field4302.field5111 += var11;
                        if (this.field4302.field5111 < var10) {
                            break;
                        }
                        if (this.field4310 == null) {
                            this.field4302.field5111 = 0;
                            int var13 = this.field4302.method8300();
                            int var14 = this.field4302.method8448();
                            int var15 = this.field4302.method8300();
                            int var16 = this.field4302.method8306();
                            long var17 = (long) ((var13 << 16) + var14);
                            class358 var19 = (class358) this.field4306.method8025(var17);
                            this.field4313 = true;
                            if (var19 == null) {
                                var19 = (class358) this.field4311.method8025(var17);
                                this.field4313 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4310 = var19;
                            this.field4316 = new class515(var16 + var20 + this.field4310.field4279);
                            this.field4316.method8283(var15);
                            this.field4316.method8464(var16);
                            this.field4317 = 8;
                            this.field4302.field5111 = 0;
                        } else if (this.field4317 == 0) {
                            if (this.field4302.field5108[0] == -1) {
                                this.field4317 = 1;
                                this.field4302.field5111 = 0;
                            } else {
                                this.field4310 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4316.field5108.length - this.field4310.field4279;
                        int var22 = 512 - this.field4317;
                        if (var22 > var21 - this.field4316.field5111) {
                            var22 = var21 - this.field4316.field5111;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4325.method7367(this.field4316.field5108, this.field4316.field5111, var22);
                        if (this.field4304 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4316.field5108[this.field4316.field5111 + var23] ^= this.field4304;
                            }
                        }
                        this.field4316.field5111 += var22;
                        this.field4317 += var22;
                        if (this.field4316.field5111 == var21) {
                            if (this.field4310.field4814 == 16711935L) {
                                this.field4305 = this.field4316;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class357 var25 = this.field4320[var24];
                                    if (var25 != null) {
                                        this.method6218(var25, var24);
                                    }
                                }
                            } else {
                                this.field4318.reset();
                                this.field4318.update(this.field4316.field5108, 0, var21);
                                int var26 = (int) this.field4318.getValue();
                                if (this.field4310.field4277 != var26) {
                                    try {
                                        this.field4325.method7386();
                                    } catch (Exception var31) {
                                    }
                                    this.field4301++;
                                    this.field4325 = null;
                                    this.field4304 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4301 = 0;
                                this.field4324 = 0;
                                this.field4310.field4278.method6088((int) (this.field4310.field4814 & 0xFFFFL), this.field4316.field5108, (this.field4310.field4814 & 0xFF0000L) == 16711680L, this.field4313);
                            }
                            this.field4310.method7700();
                            if (this.field4313) {
                                this.field4307--;
                            } else {
                                this.field4312--;
                            }
                            this.field4317 = 0;
                            this.field4310 = null;
                            this.field4316 = null;
                        } else {
                            if (this.field4317 != 512) {
                                break;
                            }
                            this.field4317 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4325.method7386();
                } catch (Exception var30) {
                }
                this.field4324++;
                this.field4325 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("nf.ae(ZI)V")
    public void method6216(boolean arg0) {
        if (this.field4325 == null) {
            return;
        }
        try {
            class515 var2 = new class515(4);
            var2.method8283(arg0 ? 2 : 3);
            var2.method8384(0);
            this.field4325.method7369(var2.field5108, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4325.method7386();
            } catch (Exception var5) {
            }
            this.field4324++;
            this.field4325 = null;
        }
    }

    @ObfuscatedName("nf.ao(Lqi;ZI)V")
    public void method6215(class439 arg0, boolean arg1) {
        if (this.field4325 != null) {
            try {
                this.field4325.method7386();
            } catch (Exception var11) {
            }
            this.field4325 = null;
        }
        this.field4325 = arg0;
        this.method6216(arg1);
        this.field4302.field5111 = 0;
        this.field4310 = null;
        this.field4316 = null;
        this.field4317 = 0;
        while (true) {
            class358 var4 = (class358) this.field4306.method8027();
            if (var4 == null) {
                while (true) {
                    class358 var5 = (class358) this.field4311.method8027();
                    if (var5 == null) {
                        if (this.field4304 != 0) {
                            try {
                                class515 var6 = new class515(4);
                                var6.method8283(4);
                                var6.method8283(this.field4304);
                                var6.method8345(0);
                                this.field4325.method7369(var6.field5108, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4325.method7386();
                                } catch (Exception var9) {
                                }
                                this.field4324++;
                                this.field4325 = null;
                            }
                        }
                        this.field4323 = 0;
                        this.field4303 = class302.method655();
                        return;
                    }
                    this.field4308.method6379(var5);
                    this.field4309.method8035(var5, var5.field4814);
                    this.field4319++;
                    this.field4312--;
                }
            }
            this.field4315.method8035(var4, var4.field4814);
            this.field4314++;
            this.field4307--;
        }
    }

    @ObfuscatedName("nf.at(Lnk;II)V")
    public void method6217(class357 arg0, int arg1) {
        if (arg0.field4263) {
            if (arg1 <= this.field4321) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4322) {
                this.field4322 = arg1;
            }
        } else if (arg1 >= this.field4322) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4321) {
            this.field4321 = arg1;
        }
        if (this.field4305 == null) {
            this.method6219((class357) null, 255, 255, 0, (byte) 0, true);
            this.field4320[arg1] = arg0;
        } else {
            this.method6218(arg0, arg1);
        }
    }

    @ObfuscatedName("nf.ac(Lnk;II)V")
    public void method6218(class357 arg0, int arg1) {
        this.field4305.field5111 = arg1 * 8 + 5;
        if (this.field4305.field5111 < this.field4305.field5108.length) {
            int var3 = this.field4305.method8306();
            int var4 = this.field4305.method8306();
            arg0.method6087(var3, var4);
        } else if (arg0.field4263) {
            arg0.method6108();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("nf.ai(Lnk;IIIBZB)V")
    public void method6219(class357 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class358 var9 = (class358) this.field4315.method8025(var7);
        if (var9 != null) {
            return;
        }
        class358 var10 = (class358) this.field4306.method8025(var7);
        if (var10 != null) {
            return;
        }
        class358 var11 = (class358) this.field4309.method8025(var7);
        if (var11 == null) {
            if (!arg5) {
                class358 var12 = (class358) this.field4311.method8025(var7);
                if (var12 != null) {
                    return;
                }
            }
            class358 var13 = new class358();
            var13.field4278 = arg0;
            var13.field4277 = arg3;
            var13.field4279 = arg4;
            if (arg5) {
                this.field4315.method8035(var13, var7);
                this.field4314++;
            } else {
                this.field4308.method6385(var13);
                this.field4309.method8035(var13, var7);
                this.field4319++;
            }
        } else if (arg5) {
            var11.method7697();
            this.field4315.method8035(var11, var7);
            this.field4319--;
            this.field4314++;
        }
    }

    @ObfuscatedName("nf.az(III)V")
    public void method6226(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class358 var5 = (class358) this.field4309.method8025(var3);
        if (var5 != null) {
            this.field4308.method6379(var5);
        }
    }

    @ObfuscatedName("nf.ap(III)I")
    public int method6237(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4310 != null && this.field4310.field4814 == var3 ? this.field4316.field5111 * 99 / (this.field4316.field5108.length - this.field4310.field4279) + 1 : 0;
    }

    @ObfuscatedName("nf.aa(ZZS)I")
    public int method6233(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4314 + this.field4307;
        }
        if (arg1) {
            var3 += this.field4319 + this.field4312;
        }
        return var3;
    }

    @ObfuscatedName("nf.af(I)V")
    public void method6223() {
        if (this.field4325 != null) {
            this.field4325.method7386();
        }
    }
}
