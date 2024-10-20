package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("or")
public class class376 {

    @ObfuscatedName("or.am")
    public class455 field4377;

    @ObfuscatedName("or.ap")
    public int field4376 = 0;

    @ObfuscatedName("or.af")
    public long field4381;

    @ObfuscatedName("or.aj")
    public class505 field4393 = new class505(4096);

    @ObfuscatedName("or.aq")
    public int field4379 = 0;

    @ObfuscatedName("or.ar")
    public class505 field4380 = new class505(32);

    @ObfuscatedName("or.ag")
    public int field4391 = 0;

    @ObfuscatedName("or.ao")
    public class393 field4382 = new class393();

    @ObfuscatedName("or.ae")
    public class505 field4383 = new class505(4096);

    @ObfuscatedName("or.aa")
    public int field4375 = 0;

    @ObfuscatedName("or.au")
    public class505 field4385 = new class505(4096);

    @ObfuscatedName("or.an")
    public int field4386 = 0;

    @ObfuscatedName("or.ad")
    public boolean field4387;

    @ObfuscatedName("or.ax")
    public class374 field4388;

    @ObfuscatedName("or.aw")
    public class531 field4396 = new class531(8);

    @ObfuscatedName("or.az")
    public class531 field4390;

    @ObfuscatedName("or.av")
    public int field4389 = 0;

    @ObfuscatedName("or.ay")
    public CRC32 field4400 = new CRC32();

    @ObfuscatedName("or.as")
    public class531 field4394;

    @ObfuscatedName("or.ab")
    public class373[] field4395 = new class373[256];

    @ObfuscatedName("or.ah")
    public int field4384 = -1;

    @ObfuscatedName("or.ai")
    public int field4397 = 255;

    @ObfuscatedName("or.ac")
    public byte field4398 = 0;

    @ObfuscatedName("or.al")
    public int field4378 = 0;

    @ObfuscatedName("or.at")
    public int field4399 = 0;

    @ObfuscatedName("or.am(I)Z")
    public boolean method6495() {
        long var1 = Statics.method2852();
        int var3 = (int) (var1 - this.field4381);
        this.field4381 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4376 += var3;
        if (this.field4386 == 0 && this.field4391 == 0 && this.field4375 == 0 && this.field4379 == 0) {
            return true;
        } else if (this.field4377 == null) {
            return false;
        } else {
            try {
                if (this.field4376 > 30000) {
                    throw new IOException();
                }
                while (this.field4391 < 200 && this.field4379 > 0) {
                    class374 var4 = (class374) this.field4393.method8304();
                    class531 var5 = new class531(4);
                    var5.method8699(1);
                    var5.method8778((int) var4.field4889);
                    this.field4377.method7661(var5.field5178, 0, 4);
                    this.field4380.method8307(var4, var4.field4889);
                    this.field4379--;
                    this.field4391++;
                }
                while (this.field4386 < 200 && this.field4375 > 0) {
                    class374 var6 = (class374) this.field4382.method6661();
                    class531 var7 = new class531(4);
                    var7.method8699(0);
                    var7.method8778((int) var6.field4889);
                    this.field4377.method7661(var7.field5178, 0, 4);
                    var6.method7986();
                    this.field4385.method8307(var6, var6.field4889);
                    this.field4375--;
                    this.field4386++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4377.method7659();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4376 = 0;
                    byte var10 = 0;
                    if (this.field4388 == null) {
                        var10 = 8;
                    } else if (this.field4389 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4396.field5181;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4377.method7666(this.field4396.field5178, this.field4396.field5181, var11);
                        if (this.field4398 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4396.field5178[this.field4396.field5181 + var12] ^= this.field4398;
                            }
                        }
                        this.field4396.field5181 += var11;
                        if (this.field4396.field5181 < var10) {
                            break;
                        }
                        if (this.field4388 == null) {
                            this.field4396.field5181 = 0;
                            int var13 = this.field4396.method8561();
                            int var14 = this.field4396.method8775();
                            int var15 = this.field4396.method8561();
                            int var16 = this.field4396.method8566();
                            long var17 = (long) ((var13 << 16) + var14);
                            class374 var19 = (class374) this.field4380.method8301(var17);
                            this.field4387 = true;
                            if (var19 == null) {
                                var19 = (class374) this.field4385.method8301(var17);
                                this.field4387 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4388 = var19;
                            this.field4390 = new class531(var16 + var20 + this.field4388.field4354);
                            this.field4390.method8699(var15);
                            this.field4390.method8547(var16);
                            this.field4389 = 8;
                            this.field4396.field5181 = 0;
                        } else if (this.field4389 == 0) {
                            if (this.field4396.field5178[0] == -1) {
                                this.field4389 = 1;
                                this.field4396.field5181 = 0;
                            } else {
                                this.field4388 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4390.field5178.length - this.field4388.field4354;
                        int var22 = 512 - this.field4389;
                        if (var22 > var21 - this.field4390.field5181) {
                            var22 = var21 - this.field4390.field5181;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4377.method7666(this.field4390.field5178, this.field4390.field5181, var22);
                        if (this.field4398 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4390.field5178[this.field4390.field5181 + var23] ^= this.field4398;
                            }
                        }
                        this.field4390.field5181 += var22;
                        this.field4389 += var22;
                        if (this.field4390.field5181 == var21) {
                            if (this.field4388.field4889 == 16711935L) {
                                this.field4394 = this.field4390;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class373 var25 = this.field4395[var24];
                                    if (var25 != null) {
                                        this.method6485(var25, var24);
                                    }
                                }
                            } else {
                                this.field4400.reset();
                                this.field4400.update(this.field4390.field5178, 0, var21);
                                int var26 = (int) this.field4400.getValue();
                                if (this.field4388.field4355 != var26) {
                                    try {
                                        this.field4377.method7662();
                                    } catch (Exception var31) {
                                    }
                                    this.field4378++;
                                    this.field4377 = null;
                                    this.field4398 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4378 = 0;
                                this.field4399 = 0;
                                this.field4388.field4353.method6356((int) (this.field4388.field4889 & 0xFFFFL), this.field4390.field5178, (this.field4388.field4889 & 0xFF0000L) == 16711680L, this.field4387);
                            }
                            this.field4388.method7988();
                            if (this.field4387) {
                                this.field4391--;
                            } else {
                                this.field4386--;
                            }
                            this.field4389 = 0;
                            this.field4388 = null;
                            this.field4390 = null;
                        } else {
                            if (this.field4389 != 512) {
                                break;
                            }
                            this.field4389 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4377.method7662();
                } catch (Exception var30) {
                }
                this.field4399++;
                this.field4377 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("or.ap(ZB)V")
    public void method6482(boolean arg0) {
        if (this.field4377 == null) {
            return;
        }
        try {
            class531 var2 = new class531(4);
            var2.method8699(arg0 ? 2 : 3);
            var2.method8778(0);
            this.field4377.method7661(var2.field5178, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4377.method7662();
            } catch (Exception var5) {
            }
            this.field4399++;
            this.field4377 = null;
        }
    }

    @ObfuscatedName("or.af(Lri;ZB)V")
    public void method6483(class455 arg0, boolean arg1) {
        if (this.field4377 != null) {
            try {
                this.field4377.method7662();
            } catch (Exception var11) {
            }
            this.field4377 = null;
        }
        this.field4377 = arg0;
        this.method6482(arg1);
        this.field4396.field5181 = 0;
        this.field4388 = null;
        this.field4390 = null;
        this.field4389 = 0;
        while (true) {
            class374 var4 = (class374) this.field4380.method8304();
            if (var4 == null) {
                while (true) {
                    class374 var5 = (class374) this.field4385.method8304();
                    if (var5 == null) {
                        if (this.field4398 != 0) {
                            try {
                                class531 var6 = new class531(4);
                                var6.method8699(4);
                                var6.method8699(this.field4398);
                                var6.method8737(0);
                                this.field4377.method7661(var6.field5178, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4377.method7662();
                                } catch (Exception var9) {
                                }
                                this.field4399++;
                                this.field4377 = null;
                            }
                        }
                        this.field4376 = 0;
                        this.field4381 = Statics.method2852();
                        return;
                    }
                    this.field4382.method6656(var5);
                    this.field4383.method8307(var5, var5.field4889);
                    this.field4375++;
                    this.field4386--;
                }
            }
            this.field4393.method8307(var4, var4.field4889);
            this.field4379++;
            this.field4391--;
        }
    }

    @ObfuscatedName("or.aj(Loz;II)V")
    public void method6481(class373 arg0, int arg1) {
        if (arg0.field4349 && !arg0.field4350) {
            if (arg1 <= this.field4384) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4397) {
                this.field4397 = arg1;
            }
        } else if (arg1 >= this.field4397) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4384) {
            this.field4384 = arg1;
        }
        if (this.field4394 == null) {
            this.method6492((class373) null, 255, 255, 0, (byte) 0, true);
            this.field4395[arg1] = arg0;
        } else {
            this.method6485(arg0, arg1);
        }
    }

    @ObfuscatedName("or.aq(Loz;II)V")
    public void method6485(class373 arg0, int arg1) {
        this.field4394.field5181 = arg1 * 8 + 5;
        if (this.field4394.field5181 < this.field4394.field5178.length) {
            int var3 = this.field4394.method8566();
            int var4 = this.field4394.method8566();
            arg0.method6355(var3, var4);
        } else if (arg0.field4349) {
            arg0.method6381();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("or.ar(Loz;IIIBZB)V")
    public void method6492(class373 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class374 var9 = (class374) this.field4393.method8301(var7);
        if (var9 != null) {
            return;
        }
        class374 var10 = (class374) this.field4380.method8301(var7);
        if (var10 != null) {
            return;
        }
        class374 var11 = (class374) this.field4383.method8301(var7);
        if (var11 == null) {
            if (!arg5) {
                class374 var12 = (class374) this.field4385.method8301(var7);
                if (var12 != null) {
                    return;
                }
            }
            class374 var13 = new class374();
            var13.field4353 = arg0;
            var13.field4355 = arg3;
            var13.field4354 = arg4;
            if (arg5) {
                this.field4393.method8307(var13, var7);
                this.field4379++;
            } else {
                this.field4382.method6657(var13);
                this.field4383.method8307(var13, var7);
                this.field4375++;
            }
        } else if (arg5) {
            var11.method7986();
            this.field4393.method8307(var11, var7);
            this.field4375--;
            this.field4379++;
        }
    }

    @ObfuscatedName("or.ag(IIS)V")
    public void method6489(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class374 var5 = (class374) this.field4383.method8301(var3);
        if (var5 != null) {
            this.field4382.method6656(var5);
        }
    }

    @ObfuscatedName("or.ao(III)I")
    public int method6488(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4388 != null && this.field4388.field4889 == var3 ? this.field4390.field5181 * 99 / (this.field4390.field5178.length - this.field4388.field4354) + 1 : 0;
    }

    @ObfuscatedName("or.ae(ZZB)I")
    public int method6502(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4391 + this.field4379;
        }
        if (arg1) {
            var3 += this.field4386 + this.field4375;
        }
        return var3;
    }

    @ObfuscatedName("or.aa(S)V")
    public void method6490() {
        if (this.field4377 != null) {
            this.field4377.method7662();
        }
    }
}
