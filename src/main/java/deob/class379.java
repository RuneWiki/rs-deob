package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ot")
public class class379 {

    @ObfuscatedName("ot.as")
    public class458 field4410;

    @ObfuscatedName("ot.aa")
    public int field4411 = 0;

    @ObfuscatedName("ot.az")
    public long field4412;

    @ObfuscatedName("ot.ao")
    public class508 field4408 = new class508(4096);

    @ObfuscatedName("ot.au")
    public int field4414 = 0;

    @ObfuscatedName("ot.ak")
    public class508 field4415 = new class508(32);

    @ObfuscatedName("ot.ah")
    public int field4416 = 0;

    @ObfuscatedName("ot.aj")
    public class396 field4420 = new class396();

    @ObfuscatedName("ot.af")
    public class508 field4418 = new class508(4096);

    @ObfuscatedName("ot.ax")
    public int field4419 = 0;

    @ObfuscatedName("ot.an")
    public class508 field4424 = new class508(4096);

    @ObfuscatedName("ot.ag")
    public int field4429 = 0;

    @ObfuscatedName("ot.am")
    public boolean field4432;

    @ObfuscatedName("ot.ad")
    public class377 field4423;

    @ObfuscatedName("ot.at")
    public class534 field4422 = new class534(8);

    @ObfuscatedName("ot.ay")
    public class534 field4425;

    @ObfuscatedName("ot.ae")
    public int field4426 = 0;

    @ObfuscatedName("ot.ab")
    public CRC32 field4427 = new CRC32();

    @ObfuscatedName("ot.av")
    public class534 field4428;

    @ObfuscatedName("ot.ap")
    public class376[] field4413 = new class376[256];

    @ObfuscatedName("ot.bu")
    public int field4430 = -1;

    @ObfuscatedName("ot.bo")
    public int field4431 = 255;

    @ObfuscatedName("ot.bd")
    public byte field4421 = 0;

    @ObfuscatedName("ot.bi")
    public int field4417 = 0;

    @ObfuscatedName("ot.bq")
    public int field4434 = 0;

    @ObfuscatedName("ot.aq(I)Z")
    public boolean method6512() {
        long var1 = class318.method2218();
        int var3 = (int) (var1 - this.field4412);
        this.field4412 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4411 += var3;
        if (this.field4429 == 0 && this.field4416 == 0 && this.field4419 == 0 && this.field4414 == 0) {
            return true;
        } else if (this.field4410 == null) {
            return false;
        } else {
            try {
                if (this.field4411 > 30000) {
                    throw new IOException();
                }
                while (this.field4416 < 200 && this.field4414 > 0) {
                    class377 var4 = (class377) this.field4408.method8325();
                    class534 var5 = new class534(4);
                    var5.method8574(1);
                    var5.method8576((int) var4.field4920);
                    this.field4410.method7671(var5.field5199, 0, 4);
                    this.field4415.method8324(var4, var4.field4920);
                    this.field4414--;
                    this.field4416++;
                }
                while (this.field4429 < 200 && this.field4419 > 0) {
                    class377 var6 = (class377) this.field4420.method6670();
                    class534 var7 = new class534(4);
                    var7.method8574(0);
                    var7.method8576((int) var6.field4920);
                    this.field4410.method7671(var7.field5199, 0, 4);
                    var6.method7989();
                    this.field4424.method8324(var6, var6.field4920);
                    this.field4419--;
                    this.field4429++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4410.method7668();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4411 = 0;
                    byte var10 = 0;
                    if (this.field4423 == null) {
                        var10 = 8;
                    } else if (this.field4426 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4422.field5200;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4410.method7670(this.field4422.field5199, this.field4422.field5200, var11);
                        if (this.field4421 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4422.field5199[this.field4422.field5200 + var12] ^= this.field4421;
                            }
                        }
                        this.field4422.field5200 += var11;
                        if (this.field4422.field5200 < var10) {
                            break;
                        }
                        if (this.field4423 == null) {
                            this.field4422.field5200 = 0;
                            int var13 = this.field4422.method8591();
                            int var14 = this.field4422.method8593();
                            int var15 = this.field4422.method8591();
                            int var16 = this.field4422.method8597();
                            long var17 = (long) ((var13 << 16) + var14);
                            class377 var19 = (class377) this.field4415.method8322(var17);
                            this.field4432 = true;
                            if (var19 == null) {
                                var19 = (class377) this.field4424.method8322(var17);
                                this.field4432 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4423 = var19;
                            this.field4425 = new class534(var16 + var20 + this.field4423.field4387);
                            this.field4425.method8574(var15);
                            this.field4425.method8577(var16);
                            this.field4426 = 8;
                            this.field4422.field5200 = 0;
                        } else if (this.field4426 == 0) {
                            if (this.field4422.field5199[0] == -1) {
                                this.field4426 = 1;
                                this.field4422.field5200 = 0;
                            } else {
                                this.field4423 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4425.field5199.length - this.field4423.field4387;
                        int var22 = 512 - this.field4426;
                        if (var22 > var21 - this.field4425.field5200) {
                            var22 = var21 - this.field4425.field5200;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4410.method7670(this.field4425.field5199, this.field4425.field5200, var22);
                        if (this.field4421 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4425.field5199[this.field4425.field5200 + var23] ^= this.field4421;
                            }
                        }
                        this.field4425.field5200 += var22;
                        this.field4426 += var22;
                        if (this.field4425.field5200 == var21) {
                            if (this.field4423.field4920 == 16711935L) {
                                this.field4428 = this.field4425;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class376 var25 = this.field4413[var24];
                                    if (var25 != null) {
                                        this.method6516(var25, var24);
                                    }
                                }
                            } else {
                                this.field4427.reset();
                                this.field4427.update(this.field4425.field5199, 0, var21);
                                int var26 = (int) this.field4427.getValue();
                                if (this.field4423.field4385 != var26) {
                                    try {
                                        this.field4410.method7672();
                                    } catch (Exception var31) {
                                    }
                                    this.field4417++;
                                    this.field4410 = null;
                                    this.field4421 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4417 = 0;
                                this.field4434 = 0;
                                this.field4423.field4386.method6370((int) (this.field4423.field4920 & 0xFFFFL), this.field4425.field5199, (this.field4423.field4920 & 0xFF0000L) == 16711680L, this.field4432);
                            }
                            this.field4423.method7996();
                            if (this.field4432) {
                                this.field4416--;
                            } else {
                                this.field4429--;
                            }
                            this.field4426 = 0;
                            this.field4423 = null;
                            this.field4425 = null;
                        } else {
                            if (this.field4426 != 512) {
                                break;
                            }
                            this.field4426 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4410.method7672();
                } catch (Exception var30) {
                }
                this.field4434++;
                this.field4410 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ot.aw(ZB)V")
    public void method6514(boolean arg0) {
        if (this.field4410 == null) {
            return;
        }
        try {
            class534 var2 = new class534(4);
            var2.method8574(arg0 ? 2 : 3);
            var2.method8576(0);
            this.field4410.method7671(var2.field5199, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4410.method7672();
            } catch (Exception var5) {
            }
            this.field4434++;
            this.field4410 = null;
        }
    }

    @ObfuscatedName("ot.al(Lrr;ZI)V")
    public void method6520(class458 arg0, boolean arg1) {
        if (this.field4410 != null) {
            try {
                this.field4410.method7672();
            } catch (Exception var11) {
            }
            this.field4410 = null;
        }
        this.field4410 = arg0;
        this.method6514(arg1);
        this.field4422.field5200 = 0;
        this.field4423 = null;
        this.field4425 = null;
        this.field4426 = 0;
        while (true) {
            class377 var4 = (class377) this.field4415.method8325();
            if (var4 == null) {
                while (true) {
                    class377 var5 = (class377) this.field4424.method8325();
                    if (var5 == null) {
                        if (this.field4421 != 0) {
                            try {
                                class534 var6 = new class534(4);
                                var6.method8574(4);
                                var6.method8574(this.field4421);
                                var6.method8575(0);
                                this.field4410.method7671(var6.field5199, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4410.method7672();
                                } catch (Exception var9) {
                                }
                                this.field4434++;
                                this.field4410 = null;
                            }
                        }
                        this.field4411 = 0;
                        this.field4412 = class318.method2218();
                        return;
                    }
                    this.field4420.method6671(var5);
                    this.field4418.method8324(var5, var5.field4920);
                    this.field4419++;
                    this.field4429--;
                }
            }
            this.field4408.method8324(var4, var4.field4920);
            this.field4414++;
            this.field4416--;
        }
    }

    @ObfuscatedName("ot.ai(Lom;IB)V")
    public void method6527(class376 arg0, int arg1) {
        if (arg0.field4383 && !arg0.field4382) {
            if (arg1 <= this.field4430) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4431) {
                this.field4431 = arg1;
            }
        } else if (arg1 >= this.field4431) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4430) {
            this.field4430 = arg1;
        }
        if (this.field4428 == null) {
            this.method6522((class376) null, 255, 255, 0, (byte) 0, true);
            this.field4413[arg1] = arg0;
        } else {
            this.method6516(arg0, arg1);
        }
    }

    @ObfuscatedName("ot.ar(Lom;II)V")
    public void method6516(class376 arg0, int arg1) {
        this.field4428.field5200 = arg1 * 8 + 5;
        if (this.field4428.field5200 < this.field4428.field5199.length) {
            int var3 = this.field4428.method8597();
            int var4 = this.field4428.method8597();
            arg0.method6393(var3, var4);
        } else if (arg0.field4383) {
            arg0.method6368();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ot.as(Lom;IIIBZS)V")
    public void method6522(class376 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class377 var9 = (class377) this.field4408.method8322(var7);
        if (var9 != null) {
            return;
        }
        class377 var10 = (class377) this.field4415.method8322(var7);
        if (var10 != null) {
            return;
        }
        class377 var11 = (class377) this.field4418.method8322(var7);
        if (var11 == null) {
            if (!arg5) {
                class377 var12 = (class377) this.field4424.method8322(var7);
                if (var12 != null) {
                    return;
                }
            }
            class377 var13 = new class377();
            var13.field4386 = arg0;
            var13.field4385 = arg3;
            var13.field4387 = arg4;
            if (arg5) {
                this.field4408.method8324(var13, var7);
                this.field4414++;
            } else {
                this.field4420.method6669(var13);
                this.field4418.method8324(var13, var7);
                this.field4419++;
            }
        } else if (arg5) {
            var11.method7989();
            this.field4408.method8324(var11, var7);
            this.field4419--;
            this.field4414++;
        }
    }

    @ObfuscatedName("ot.aa(III)V")
    public void method6518(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class377 var5 = (class377) this.field4418.method8322(var3);
        if (var5 != null) {
            this.field4420.method6671(var5);
        }
    }

    @ObfuscatedName("ot.az(III)I")
    public int method6519(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4423 != null && this.field4423.field4920 == var3 ? this.field4425.field5200 * 99 / (this.field4425.field5199.length - this.field4423.field4387) + 1 : 0;
    }

    @ObfuscatedName("ot.ao(ZZI)I")
    public int method6513(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4416 + this.field4414;
        }
        if (arg1) {
            var3 += this.field4429 + this.field4419;
        }
        return var3;
    }

    @ObfuscatedName("ot.au(I)V")
    public void method6515() {
        if (this.field4410 == null) {
            return;
        }
        try {
            this.field4410.method7672();
        } catch (Exception var2) {
        }
        this.field4410 = null;
    }
}
