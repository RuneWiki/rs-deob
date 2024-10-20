package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("oj")
public class class388 {

    @ObfuscatedName("oj.aa")
    public class478 field4533;

    @ObfuscatedName("oj.at")
    public int field4521 = 0;

    @ObfuscatedName("oj.ab")
    public long field4522;

    @ObfuscatedName("oj.ac")
    public class520 field4520 = new class520(4096);

    @ObfuscatedName("oj.ao")
    public int field4524 = 0;

    @ObfuscatedName("oj.ah")
    public class520 field4539 = new class520(32);

    @ObfuscatedName("oj.av")
    public int field4526 = 0;

    @ObfuscatedName("oj.aq")
    public class405 field4527 = new class405();

    @ObfuscatedName("oj.ap")
    public class520 field4523 = new class520(4096);

    @ObfuscatedName("oj.ae")
    public int field4529 = 0;

    @ObfuscatedName("oj.ax")
    public class520 field4542 = new class520(4096);

    @ObfuscatedName("oj.ay")
    public int field4531 = 0;

    @ObfuscatedName("oj.au")
    public boolean field4532;

    @ObfuscatedName("oj.as")
    public class386 field4528;

    @ObfuscatedName("oj.aw")
    public class546 field4534 = new class546(8);

    @ObfuscatedName("oj.ad")
    public class546 field4530;

    @ObfuscatedName("oj.ai")
    public int field4536 = 0;

    @ObfuscatedName("oj.am")
    public CRC32 field4537 = new CRC32();

    @ObfuscatedName("oj.ar")
    public class546 field4538;

    @ObfuscatedName("oj.ag")
    public class384[] field4525 = new class384[256];

    @ObfuscatedName("oj.bs")
    public int field4540 = -1;

    @ObfuscatedName("oj.bf")
    public int field4541 = 255;

    @ObfuscatedName("oj.bo")
    public byte field4518 = 0;

    @ObfuscatedName("oj.bi")
    public int field4543 = 0;

    @ObfuscatedName("oj.bt")
    public int field4544 = 0;

    @ObfuscatedName("oj.ak(B)Z")
    public boolean method6677() {
        long var1 = class326.method2895();
        int var3 = (int) (var1 - this.field4522);
        this.field4522 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4521 += var3;
        if (this.field4531 == 0 && this.field4526 == 0 && this.field4529 == 0 && this.field4524 == 0) {
            return true;
        } else if (this.field4533 == null) {
            return false;
        } else {
            try {
                if (this.field4521 > 30000) {
                    throw new IOException();
                }
                while (this.field4526 < 200 && this.field4524 > 0) {
                    class386 var4 = (class386) this.field4520.method8530();
                    class546 var5 = new class546(4);
                    var5.method8779(1);
                    var5.method8781((int) var4.field5049);
                    this.field4533.method8023(var5.field5346, 0, 4);
                    this.field4539.method8527(var4, var4.field5049);
                    this.field4524--;
                    this.field4526++;
                }
                while (this.field4531 < 200 && this.field4529 > 0) {
                    class386 var6 = (class386) this.field4527.method6820();
                    class546 var7 = new class546(4);
                    var7.method8779(0);
                    var7.method8781((int) var6.field5049);
                    this.field4533.method8023(var7.field5346, 0, 4);
                    var6.method8183();
                    this.field4542.method8527(var6, var6.field5049);
                    this.field4529--;
                    this.field4531++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4533.method8020();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4521 = 0;
                    byte var10 = 0;
                    if (this.field4528 == null) {
                        var10 = 8;
                    } else if (this.field4536 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4534.field5344;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4533.method8022(this.field4534.field5346, this.field4534.field5344, var11);
                        if (this.field4518 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4534.field5346[this.field4534.field5344 + var12] ^= this.field4518;
                            }
                        }
                        this.field4534.field5344 += var11;
                        if (this.field4534.field5344 < var10) {
                            break;
                        }
                        if (this.field4528 == null) {
                            this.field4534.field5344 = 0;
                            int var13 = this.field4534.method8796();
                            int var14 = this.field4534.method8798();
                            int var15 = this.field4534.method8796();
                            int var16 = this.field4534.method8801();
                            long var17 = (long) ((var13 << 16) + var14);
                            class386 var19 = (class386) this.field4539.method8528(var17);
                            this.field4532 = true;
                            if (var19 == null) {
                                var19 = (class386) this.field4542.method8528(var17);
                                this.field4532 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4528 = var19;
                            this.field4530 = new class546(var16 + var20 + this.field4528.field4499);
                            this.field4530.method8779(var15);
                            this.field4530.method8981(var16);
                            this.field4536 = 8;
                            this.field4534.field5344 = 0;
                        } else if (this.field4536 == 0) {
                            if (this.field4534.field5346[0] == -1) {
                                this.field4536 = 1;
                                this.field4534.field5344 = 0;
                            } else {
                                this.field4528 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4530.field5346.length - this.field4528.field4499;
                        int var22 = 512 - this.field4536;
                        if (var22 > var21 - this.field4530.field5344) {
                            var22 = var21 - this.field4530.field5344;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4533.method8022(this.field4530.field5346, this.field4530.field5344, var22);
                        if (this.field4518 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4530.field5346[this.field4530.field5344 + var23] ^= this.field4518;
                            }
                        }
                        this.field4530.field5344 += var22;
                        this.field4536 += var22;
                        if (this.field4530.field5344 == var21) {
                            if (this.field4528.field5049 == 16711935L) {
                                this.field4538 = this.field4530;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class384 var25 = this.field4525[var24];
                                    if (var25 != null) {
                                        this.method6660(var25, var24);
                                    }
                                }
                            } else {
                                this.field4537.reset();
                                this.field4537.update(this.field4530.field5346, 0, var21);
                                int var26 = (int) this.field4537.getValue();
                                if (this.field4528.field4496 != var26) {
                                    try {
                                        this.field4533.method8024();
                                    } catch (Exception var31) {
                                    }
                                    this.field4543++;
                                    this.field4533 = null;
                                    this.field4518 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4543 = 0;
                                this.field4544 = 0;
                                this.field4528.field4498.method6567((int) (this.field4528.field5049 & 0xFFFFL), this.field4530.field5346, (this.field4528.field5049 & 0xFF0000L) == 16711680L, this.field4532);
                            }
                            this.field4528.method8189();
                            if (this.field4532) {
                                this.field4526--;
                            } else {
                                this.field4531--;
                            }
                            this.field4536 = 0;
                            this.field4528 = null;
                            this.field4530 = null;
                        } else {
                            if (this.field4536 != 512) {
                                break;
                            }
                            this.field4536 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4533.method8024();
                } catch (Exception var30) {
                }
                this.field4544++;
                this.field4533 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("oj.al(ZI)V")
    public void method6670(boolean arg0) {
        if (this.field4533 == null) {
            return;
        }
        try {
            class546 var2 = new class546(4);
            var2.method8779(arg0 ? 2 : 3);
            var2.method8781(0);
            this.field4533.method8023(var2.field5346, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4533.method8024();
            } catch (Exception var5) {
            }
            this.field4544++;
            this.field4533 = null;
        }
    }

    @ObfuscatedName("oj.aj(Lsm;ZI)V")
    public void method6658(class478 arg0, boolean arg1) {
        if (this.field4533 != null) {
            try {
                this.field4533.method8024();
            } catch (Exception var11) {
            }
            this.field4533 = null;
        }
        this.field4533 = arg0;
        this.method6670(arg1);
        this.field4534.field5344 = 0;
        this.field4528 = null;
        this.field4530 = null;
        this.field4536 = 0;
        while (true) {
            class386 var4 = (class386) this.field4539.method8530();
            if (var4 == null) {
                while (true) {
                    class386 var5 = (class386) this.field4542.method8530();
                    if (var5 == null) {
                        if (this.field4518 != 0) {
                            try {
                                class546 var6 = new class546(4);
                                var6.method8779(4);
                                var6.method8779(this.field4518);
                                var6.method8780(0);
                                this.field4533.method8023(var6.field5346, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4533.method8024();
                                } catch (Exception var9) {
                                }
                                this.field4544++;
                                this.field4533 = null;
                            }
                        }
                        this.field4521 = 0;
                        this.field4522 = class326.method2895();
                        return;
                    }
                    this.field4527.method6819(var5);
                    this.field4523.method8527(var5, var5.field5049);
                    this.field4529++;
                    this.field4531--;
                }
            }
            this.field4520.method8527(var4, var4.field5049);
            this.field4524++;
            this.field4526--;
        }
    }

    @ObfuscatedName("oj.az(Lot;II)V")
    public void method6659(class384 arg0, int arg1) {
        if (arg0.field4463 && !arg0.field4469) {
            if (arg1 <= this.field4540) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4541) {
                this.field4541 = arg1;
            }
        } else if (arg1 >= this.field4541) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4540) {
            this.field4540 = arg1;
        }
        if (this.field4538 == null) {
            this.method6661((class384) null, class385.field4474.field4494, 255, 0, (byte) 0, true);
            this.field4525[arg1] = arg0;
        } else {
            this.method6660(arg0, arg1);
        }
    }

    @ObfuscatedName("oj.af(Lot;II)V")
    public void method6660(class384 arg0, int arg1) {
        this.field4538.field5344 = arg1 * 8 + 5;
        if (this.field4538.field5344 < this.field4538.field5346.length) {
            int var3 = this.field4538.method8801();
            int var4 = this.field4538.method8801();
            arg0.method6550(var3, var4);
        } else if (arg0.field4463) {
            arg0.method6527();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("oj.aa(Lot;IIIBZI)V")
    public void method6661(class384 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class386 var9 = (class386) this.field4520.method8528(var7);
        if (var9 != null) {
            return;
        }
        class386 var10 = (class386) this.field4539.method8528(var7);
        if (var10 != null) {
            return;
        }
        class386 var11 = (class386) this.field4523.method8528(var7);
        if (var11 == null) {
            if (!arg5) {
                class386 var12 = (class386) this.field4542.method8528(var7);
                if (var12 != null) {
                    return;
                }
            }
            class386 var13 = new class386();
            var13.field4498 = arg0;
            var13.field4496 = arg3;
            var13.field4499 = arg4;
            if (arg5) {
                this.field4520.method8527(var13, var7);
                this.field4524++;
            } else {
                this.field4527.method6822(var13);
                this.field4523.method8527(var13, var7);
                this.field4529++;
            }
        } else if (arg5) {
            var11.method8183();
            this.field4520.method8527(var11, var7);
            this.field4529--;
            this.field4524++;
        }
    }

    @ObfuscatedName("oj.at(IIB)V")
    public void method6669(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class386 var5 = (class386) this.field4523.method8528(var3);
        if (var5 != null) {
            this.field4527.method6819(var5);
        }
    }

    @ObfuscatedName("oj.ab(IIB)I")
    public int method6663(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4528 != null && this.field4528.field5049 == var3 ? this.field4530.field5344 * 99 / (this.field4530.field5346.length - this.field4528.field4499) + 1 : 0;
    }

    @ObfuscatedName("oj.ac(ZZB)I")
    public int method6665(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4526 + this.field4524;
        }
        if (arg1) {
            var3 += this.field4531 + this.field4529;
        }
        return var3;
    }

    @ObfuscatedName("oj.ao(I)V")
    public void method6680() {
        if (this.field4533 == null) {
            return;
        }
        try {
            this.field4533.method8024();
        } catch (Exception var2) {
        }
        this.field4533 = null;
    }
}
