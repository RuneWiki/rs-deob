package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("or")
public class class390 {

    @ObfuscatedName("or.ao")
    public class480 field4532;

    @ObfuscatedName("or.am")
    public int field4515 = 0;

    @ObfuscatedName("or.ac")
    public long field4511;

    @ObfuscatedName("or.ae")
    public class522 field4517 = new class522(4096);

    @ObfuscatedName("or.ad")
    public int field4518 = 0;

    @ObfuscatedName("or.aq")
    public class522 field4519 = new class522(32);

    @ObfuscatedName("or.al")
    public int field4520 = 0;

    @ObfuscatedName("or.aj")
    public class407 field4514 = new class407();

    @ObfuscatedName("or.as")
    public class522 field4528 = new class522(4096);

    @ObfuscatedName("or.aw")
    public int field4523 = 0;

    @ObfuscatedName("or.af")
    public class522 field4534 = new class522(4096);

    @ObfuscatedName("or.aa")
    public int field4525 = 0;

    @ObfuscatedName("or.ah")
    public boolean field4526;

    @ObfuscatedName("or.ag")
    public class388 field4527;

    @ObfuscatedName("or.av")
    public class549 field4516 = new class549(8);

    @ObfuscatedName("or.ar")
    public class549 field4529;

    @ObfuscatedName("or.ap")
    public int field4530 = 0;

    @ObfuscatedName("or.ai")
    public CRC32 field4531 = new CRC32();

    @ObfuscatedName("or.at")
    public class549 field4537;

    @ObfuscatedName("or.az")
    public class386[] field4524 = new class386[256];

    @ObfuscatedName("or.bg")
    public int field4521 = -1;

    @ObfuscatedName("or.bz")
    public int field4533 = 255;

    @ObfuscatedName("or.bj")
    public byte field4536 = 0;

    @ObfuscatedName("or.bc")
    public int field4535 = 0;

    @ObfuscatedName("or.bo")
    public int field4538 = 0;

    @ObfuscatedName("or.ab(I)Z")
    public boolean method6730() {
        long var1 = class329.method5009();
        int var3 = (int) (var1 - this.field4511);
        this.field4511 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4515 += var3;
        if (this.field4525 == 0 && this.field4520 == 0 && this.field4523 == 0 && this.field4518 == 0) {
            return true;
        } else if (this.field4532 == null) {
            return false;
        } else {
            try {
                if (this.field4515 > 30000) {
                    throw new IOException();
                }
                while (this.field4520 < 200 && this.field4518 > 0) {
                    class388 var4 = (class388) this.field4517.method8546();
                    class549 var5 = new class549(4);
                    var5.method8781(1);
                    var5.method8783((int) var4.field5075);
                    this.field4532.method8068(var5.field5381, 0, 4);
                    this.field4519.method8551(var4, var4.field5075);
                    this.field4518--;
                    this.field4520++;
                }
                while (this.field4525 < 200 && this.field4523 > 0) {
                    class388 var6 = (class388) this.field4514.method6883();
                    class549 var7 = new class549(4);
                    var7.method8781(0);
                    var7.method8783((int) var6.field5075);
                    this.field4532.method8068(var7.field5381, 0, 4);
                    var6.method8217();
                    this.field4534.method8551(var6, var6.field5075);
                    this.field4523--;
                    this.field4525++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4532.method8079();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4515 = 0;
                    byte var10 = 0;
                    if (this.field4527 == null) {
                        var10 = 8;
                    } else if (this.field4530 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4516.field5378;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4532.method8067(this.field4516.field5381, this.field4516.field5378, var11);
                        if (this.field4536 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4516.field5381[this.field4516.field5378 + var12] ^= this.field4536;
                            }
                        }
                        this.field4516.field5378 += var11;
                        if (this.field4516.field5378 < var10) {
                            break;
                        }
                        if (this.field4527 == null) {
                            this.field4516.field5378 = 0;
                            int var13 = this.field4516.method9025();
                            int var14 = this.field4516.method8968();
                            int var15 = this.field4516.method9025();
                            int var16 = this.field4516.method8803();
                            long var17 = (long) ((var13 << 16) + var14);
                            class388 var19 = (class388) this.field4519.method8544(var17);
                            this.field4526 = true;
                            if (var19 == null) {
                                var19 = (class388) this.field4534.method8544(var17);
                                this.field4526 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4527 = var19;
                            this.field4529 = new class549(var16 + var20 + this.field4527.field4489);
                            this.field4529.method8781(var15);
                            this.field4529.method9045(var16);
                            this.field4530 = 8;
                            this.field4516.field5378 = 0;
                        } else if (this.field4530 == 0) {
                            if (this.field4516.field5381[0] == -1) {
                                this.field4530 = 1;
                                this.field4516.field5378 = 0;
                            } else {
                                this.field4527 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4529.field5381.length - this.field4527.field4489;
                        int var22 = 512 - this.field4530;
                        if (var22 > var21 - this.field4529.field5378) {
                            var22 = var21 - this.field4529.field5378;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4532.method8067(this.field4529.field5381, this.field4529.field5378, var22);
                        if (this.field4536 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4529.field5381[this.field4529.field5378 + var23] ^= this.field4536;
                            }
                        }
                        this.field4529.field5378 += var22;
                        this.field4530 += var22;
                        if (this.field4529.field5378 == var21) {
                            if (this.field4527.field5075 == 16711935L) {
                                this.field4537 = this.field4529;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class386 var25 = this.field4524[var24];
                                    if (var25 != null) {
                                        this.method6734(var25, var24);
                                    }
                                }
                            } else {
                                this.field4531.reset();
                                this.field4531.update(this.field4529.field5381, 0, var21);
                                int var26 = (int) this.field4531.getValue();
                                if (this.field4527.field4492 != var26) {
                                    try {
                                        this.field4532.method8069();
                                    } catch (Exception var31) {
                                    }
                                    this.field4535++;
                                    this.field4532 = null;
                                    this.field4536 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4535 = 0;
                                this.field4538 = 0;
                                this.field4527.field4491.method6593((int) (this.field4527.field5075 & 0xFFFFL), this.field4529.field5381, (this.field4527.field5075 & 0xFF0000L) == 16711680L, this.field4526);
                            }
                            this.field4527.method8218();
                            if (this.field4526) {
                                this.field4520--;
                            } else {
                                this.field4525--;
                            }
                            this.field4530 = 0;
                            this.field4527 = null;
                            this.field4529 = null;
                        } else {
                            if (this.field4530 != 512) {
                                break;
                            }
                            this.field4530 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4532.method8069();
                } catch (Exception var30) {
                }
                this.field4538++;
                this.field4532 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("or.ay(ZI)V")
    public void method6741(boolean arg0) {
        if (this.field4532 == null) {
            return;
        }
        try {
            class549 var2 = new class549(4);
            var2.method8781(arg0 ? 2 : 3);
            var2.method8783(0);
            this.field4532.method8068(var2.field5381, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4532.method8069();
            } catch (Exception var5) {
            }
            this.field4538++;
            this.field4532 = null;
        }
    }

    @ObfuscatedName("or.an(Lsx;ZB)V")
    public void method6732(class480 arg0, boolean arg1) {
        if (this.field4532 != null) {
            try {
                this.field4532.method8069();
            } catch (Exception var11) {
            }
            this.field4532 = null;
        }
        this.field4532 = arg0;
        this.method6741(arg1);
        this.field4516.field5378 = 0;
        this.field4527 = null;
        this.field4529 = null;
        this.field4530 = 0;
        while (true) {
            class388 var4 = (class388) this.field4519.method8546();
            if (var4 == null) {
                while (true) {
                    class388 var5 = (class388) this.field4534.method8546();
                    if (var5 == null) {
                        if (this.field4536 != 0) {
                            try {
                                class549 var6 = new class549(4);
                                var6.method8781(4);
                                var6.method8781(this.field4536);
                                var6.method8782(0);
                                this.field4532.method8068(var6.field5381, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4532.method8069();
                                } catch (Exception var9) {
                                }
                                this.field4538++;
                                this.field4532 = null;
                            }
                        }
                        this.field4515 = 0;
                        this.field4511 = class329.method5009();
                        return;
                    }
                    this.field4514.method6882(var5);
                    this.field4528.method8551(var5, var5.field5075);
                    this.field4523++;
                    this.field4525--;
                }
            }
            this.field4517.method8551(var4, var4.field5075);
            this.field4518++;
            this.field4520--;
        }
    }

    @ObfuscatedName("or.au(Loj;II)V")
    public void method6753(class386 arg0, int arg1) {
        if (arg0.field4460 && !arg0.field4446) {
            if (arg1 <= this.field4521) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4533) {
                this.field4533 = arg1;
            }
        } else if (arg1 >= this.field4533) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4521) {
            this.field4521 = arg1;
        }
        if (this.field4537 == null) {
            this.method6735((class386) null, class387.field4486.field4470, 255, 0, (byte) 0, true);
            this.field4524[arg1] = arg0;
        } else {
            this.method6734(arg0, arg1);
        }
    }

    @ObfuscatedName("or.ax(Loj;II)V")
    public void method6734(class386 arg0, int arg1) {
        this.field4537.field5378 = arg1 * 8 + 5;
        if (this.field4537.field5378 < this.field4537.field5381.length) {
            int var3 = this.field4537.method8803();
            int var4 = this.field4537.method8803();
            arg0.method6621(var3, var4);
        } else if (arg0.field4460) {
            arg0.method6591();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("or.ao(Loj;IIIBZB)V")
    public void method6735(class386 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class388 var9 = (class388) this.field4517.method8544(var7);
        if (var9 != null) {
            return;
        }
        class388 var10 = (class388) this.field4519.method8544(var7);
        if (var10 != null) {
            return;
        }
        class388 var11 = (class388) this.field4528.method8544(var7);
        if (var11 == null) {
            if (!arg5) {
                class388 var12 = (class388) this.field4534.method8544(var7);
                if (var12 != null) {
                    return;
                }
            }
            class388 var13 = new class388();
            var13.field4491 = arg0;
            var13.field4492 = arg3;
            var13.field4489 = arg4;
            if (arg5) {
                this.field4517.method8551(var13, var7);
                this.field4518++;
            } else {
                this.field4514.method6881(var13);
                this.field4528.method8551(var13, var7);
                this.field4523++;
            }
        } else if (arg5) {
            var11.method8217();
            this.field4517.method8551(var11, var7);
            this.field4523--;
            this.field4518++;
        }
    }

    @ObfuscatedName("or.am(III)V")
    public void method6736(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class388 var5 = (class388) this.field4528.method8544(var3);
        if (var5 != null) {
            this.field4514.method6882(var5);
        }
    }

    @ObfuscatedName("or.ac(III)I")
    public int method6737(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4527 != null && this.field4527.field5075 == var3 ? this.field4529.field5378 * 99 / (this.field4529.field5381.length - this.field4527.field4489) + 1 : 0;
    }

    @ObfuscatedName("or.ae(ZZI)I")
    public int method6756(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4520 + this.field4518;
        }
        if (arg1) {
            var3 += this.field4525 + this.field4523;
        }
        return var3;
    }

    @ObfuscatedName("or.ad(S)V")
    public void method6739() {
        if (this.field4532 == null) {
            return;
        }
        try {
            this.field4532.method8069();
        } catch (Exception var2) {
        }
        this.field4532 = null;
    }
}
