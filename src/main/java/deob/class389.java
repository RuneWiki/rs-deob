package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("oe")
public class class389 {

    @ObfuscatedName("oe.an")
    public class479 field4548;

    @ObfuscatedName("oe.aj")
    public int field4568 = 0;

    @ObfuscatedName("oe.av")
    public long field4549;

    @ObfuscatedName("oe.ab")
    public class521 field4555 = new class521(4096);

    @ObfuscatedName("oe.ai")
    public int field4551 = 0;

    @ObfuscatedName("oe.ae")
    public class521 field4552 = new class521(32);

    @ObfuscatedName("oe.au")
    public int field4553 = 0;

    @ObfuscatedName("oe.ah")
    public class406 field4554 = new class406();

    @ObfuscatedName("oe.az")
    public class521 field4563 = new class521(4096);

    @ObfuscatedName("oe.ax")
    public int field4556 = 0;

    @ObfuscatedName("oe.ac")
    public class521 field4557 = new class521(4096);

    @ObfuscatedName("oe.al")
    public int field4558 = 0;

    @ObfuscatedName("oe.ay")
    public boolean field4559;

    @ObfuscatedName("oe.ao")
    public class387 field4544;

    @ObfuscatedName("oe.aa")
    public class547 field4561 = new class547(8);

    @ObfuscatedName("oe.as")
    public class547 field4562;

    @ObfuscatedName("oe.aw")
    public int field4547 = 0;

    @ObfuscatedName("oe.af")
    public CRC32 field4572 = new CRC32();

    @ObfuscatedName("oe.am")
    public class547 field4565;

    @ObfuscatedName("oe.ar")
    public class385[] field4566 = new class385[256];

    @ObfuscatedName("oe.bt")
    public int field4567 = -1;

    @ObfuscatedName("oe.bj")
    public int field4560 = 255;

    @ObfuscatedName("oe.be")
    public byte field4569 = 0;

    @ObfuscatedName("oe.bm")
    public int field4570 = 0;

    @ObfuscatedName("oe.bo")
    public int field4571 = 0;

    @ObfuscatedName("oe.aq(B)Z")
    public boolean method6621() {
        long var1 = class327.method4500();
        int var3 = (int) (var1 - this.field4549);
        this.field4549 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4568 += var3;
        if (this.field4558 == 0 && this.field4553 == 0 && this.field4556 == 0 && this.field4551 == 0) {
            return true;
        } else if (this.field4548 == null) {
            return false;
        } else {
            try {
                if (this.field4568 > 30000) {
                    throw new IOException();
                }
                while (this.field4553 < 200 && this.field4551 > 0) {
                    class387 var4 = (class387) this.field4555.method8467();
                    class547 var5 = new class547(4);
                    var5.method8711(1);
                    var5.method8713((int) var4.field5082);
                    this.field4548.method7965(var5.field5364, 0, 4);
                    this.field4552.method8470(var4, var4.field5082);
                    this.field4551--;
                    this.field4553++;
                }
                while (this.field4558 < 200 && this.field4556 > 0) {
                    class387 var6 = (class387) this.field4554.method6783();
                    class547 var7 = new class547(4);
                    var7.method8711(0);
                    var7.method8713((int) var6.field5082);
                    this.field4548.method7965(var7.field5364, 0, 4);
                    var6.method8125();
                    this.field4557.method8470(var6, var6.field5082);
                    this.field4556--;
                    this.field4558++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4548.method7970();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4568 = 0;
                    byte var10 = 0;
                    if (this.field4544 == null) {
                        var10 = 8;
                    } else if (this.field4547 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4561.field5363;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4548.method7968(this.field4561.field5364, this.field4561.field5363, var11);
                        if (this.field4569 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4561.field5364[this.field4561.field5363 + var12] ^= this.field4569;
                            }
                        }
                        this.field4561.field5363 += var11;
                        if (this.field4561.field5363 < var10) {
                            break;
                        }
                        if (this.field4544 == null) {
                            this.field4561.field5363 = 0;
                            int var13 = this.field4561.method8804();
                            int var14 = this.field4561.method8899();
                            int var15 = this.field4561.method8804();
                            int var16 = this.field4561.method8734();
                            long var17 = (long) ((var13 << 16) + var14);
                            class387 var19 = (class387) this.field4552.method8464(var17);
                            this.field4559 = true;
                            if (var19 == null) {
                                var19 = (class387) this.field4557.method8464(var17);
                                this.field4559 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4544 = var19;
                            this.field4562 = new class547(var16 + var20 + this.field4544.field4523);
                            this.field4562.method8711(var15);
                            this.field4562.method8714(var16);
                            this.field4547 = 8;
                            this.field4561.field5363 = 0;
                        } else if (this.field4547 == 0) {
                            if (this.field4561.field5364[0] == -1) {
                                this.field4547 = 1;
                                this.field4561.field5363 = 0;
                            } else {
                                this.field4544 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4562.field5364.length - this.field4544.field4523;
                        int var22 = 512 - this.field4547;
                        if (var22 > var21 - this.field4562.field5363) {
                            var22 = var21 - this.field4562.field5363;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4548.method7968(this.field4562.field5364, this.field4562.field5363, var22);
                        if (this.field4569 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4562.field5364[this.field4562.field5363 + var23] ^= this.field4569;
                            }
                        }
                        this.field4562.field5363 += var22;
                        this.field4547 += var22;
                        if (this.field4562.field5363 == var21) {
                            if (this.field4544.field5082 == 16711935L) {
                                this.field4565 = this.field4562;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class385 var25 = this.field4566[var24];
                                    if (var25 != null) {
                                        this.method6643(var25, var24);
                                    }
                                }
                            } else {
                                this.field4572.reset();
                                this.field4572.update(this.field4562.field5364, 0, var21);
                                int var26 = (int) this.field4572.getValue();
                                if (this.field4544.field4525 != var26) {
                                    try {
                                        this.field4548.method7966();
                                    } catch (Exception var31) {
                                    }
                                    this.field4570++;
                                    this.field4548 = null;
                                    this.field4569 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4570 = 0;
                                this.field4571 = 0;
                                this.field4544.field4524.method6514((int) (this.field4544.field5082 & 0xFFFFL), this.field4562.field5364, (this.field4544.field5082 & 0xFF0000L) == 16711680L, this.field4559);
                            }
                            this.field4544.method8130();
                            if (this.field4559) {
                                this.field4553--;
                            } else {
                                this.field4558--;
                            }
                            this.field4547 = 0;
                            this.field4544 = null;
                            this.field4562 = null;
                        } else {
                            if (this.field4547 != 512) {
                                break;
                            }
                            this.field4547 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4548.method7966();
                } catch (Exception var30) {
                }
                this.field4571++;
                this.field4548 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("oe.ad(ZB)V")
    public void method6622(boolean arg0) {
        if (this.field4548 == null) {
            return;
        }
        try {
            class547 var2 = new class547(4);
            var2.method8711(arg0 ? 2 : 3);
            var2.method8713(0);
            this.field4548.method7965(var2.field5364, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4548.method7966();
            } catch (Exception var5) {
            }
            this.field4571++;
            this.field4548 = null;
        }
    }

    @ObfuscatedName("oe.ag(Lsp;ZB)V")
    public void method6623(class479 arg0, boolean arg1) {
        if (this.field4548 != null) {
            try {
                this.field4548.method7966();
            } catch (Exception var11) {
            }
            this.field4548 = null;
        }
        this.field4548 = arg0;
        this.method6622(arg1);
        this.field4561.field5363 = 0;
        this.field4544 = null;
        this.field4562 = null;
        this.field4547 = 0;
        while (true) {
            class387 var4 = (class387) this.field4552.method8467();
            if (var4 == null) {
                while (true) {
                    class387 var5 = (class387) this.field4557.method8467();
                    if (var5 == null) {
                        if (this.field4569 != 0) {
                            try {
                                class547 var6 = new class547(4);
                                var6.method8711(4);
                                var6.method8711(this.field4569);
                                var6.method8712(0);
                                this.field4548.method7965(var6.field5364, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4548.method7966();
                                } catch (Exception var9) {
                                }
                                this.field4571++;
                                this.field4548 = null;
                            }
                        }
                        this.field4568 = 0;
                        this.field4549 = class327.method4500();
                        return;
                    }
                    this.field4554.method6781(var5);
                    this.field4563.method8470(var5, var5.field5082);
                    this.field4556++;
                    this.field4558--;
                }
            }
            this.field4555.method8470(var4, var4.field5082);
            this.field4551++;
            this.field4553--;
        }
    }

    @ObfuscatedName("oe.ak(Loz;II)V")
    public void method6624(class385 arg0, int arg1) {
        if (arg0.field4491 && !arg0.field4489) {
            if (arg1 <= this.field4567) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4560) {
                this.field4560 = arg1;
            }
        } else if (arg1 >= this.field4560) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4567) {
            this.field4567 = arg1;
        }
        if (this.field4565 == null) {
            this.method6626((class385) null, class386.field4514.field4519, 255, 0, (byte) 0, true);
            this.field4566[arg1] = arg0;
        } else {
            this.method6643(arg0, arg1);
        }
    }

    @ObfuscatedName("oe.ap(Loz;II)V")
    public void method6643(class385 arg0, int arg1) {
        this.field4565.field5363 = arg1 * 8 + 5;
        if (this.field4565.field5363 < this.field4565.field5364.length) {
            int var3 = this.field4565.method8734();
            int var4 = this.field4565.method8734();
            arg0.method6492(var3, var4);
        } else if (arg0.field4491) {
            arg0.method6491();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("oe.an(Loz;IIIBZI)V")
    public void method6626(class385 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class387 var9 = (class387) this.field4555.method8464(var7);
        if (var9 != null) {
            return;
        }
        class387 var10 = (class387) this.field4552.method8464(var7);
        if (var10 != null) {
            return;
        }
        class387 var11 = (class387) this.field4563.method8464(var7);
        if (var11 == null) {
            if (!arg5) {
                class387 var12 = (class387) this.field4557.method8464(var7);
                if (var12 != null) {
                    return;
                }
            }
            class387 var13 = new class387();
            var13.field4524 = arg0;
            var13.field4525 = arg3;
            var13.field4523 = arg4;
            if (arg5) {
                this.field4555.method8470(var13, var7);
                this.field4551++;
            } else {
                this.field4554.method6780(var13);
                this.field4563.method8470(var13, var7);
                this.field4556++;
            }
        } else if (arg5) {
            var11.method8125();
            this.field4555.method8470(var11, var7);
            this.field4556--;
            this.field4551++;
        }
    }

    @ObfuscatedName("oe.aj(IIB)V")
    public void method6630(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class387 var5 = (class387) this.field4563.method8464(var3);
        if (var5 != null) {
            this.field4554.method6781(var5);
        }
    }

    @ObfuscatedName("oe.av(III)I")
    public int method6636(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4544 != null && this.field4544.field5082 == var3 ? this.field4562.field5363 * 99 / (this.field4562.field5364.length - this.field4544.field4523) + 1 : 0;
    }

    @ObfuscatedName("oe.ab(ZZB)I")
    public int method6629(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4553 + this.field4551;
        }
        if (arg1) {
            var3 += this.field4558 + this.field4556;
        }
        return var3;
    }

    @ObfuscatedName("oe.ai(B)V")
    public void method6633() {
        if (this.field4548 == null) {
            return;
        }
        try {
            this.field4548.method7966();
        } catch (Exception var2) {
        }
        this.field4548 = null;
    }
}
