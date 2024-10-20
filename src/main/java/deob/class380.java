package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ow")
public class class380 {

    @ObfuscatedName("ow.ao")
    public class459 field4434;

    @ObfuscatedName("ow.ab")
    public int field4438 = 0;

    @ObfuscatedName("ow.aw")
    public long field4439;

    @ObfuscatedName("ow.ad")
    public class509 field4437 = new class509(4096);

    @ObfuscatedName("ow.al")
    public int field4431 = 0;

    @ObfuscatedName("ow.as")
    public class509 field4445 = new class509(32);

    @ObfuscatedName("ow.ag")
    public int field4435 = 0;

    @ObfuscatedName("ow.ai")
    public class397 field4455 = new class397();

    @ObfuscatedName("ow.ax")
    public class509 field4442 = new class509(4096);

    @ObfuscatedName("ow.ar")
    public int field4443 = 0;

    @ObfuscatedName("ow.aj")
    public class509 field4444 = new class509(4096);

    @ObfuscatedName("ow.au")
    public int field4441 = 0;

    @ObfuscatedName("ow.ay")
    public boolean field4446;

    @ObfuscatedName("ow.ap")
    public class378 field4447;

    @ObfuscatedName("ow.av")
    public class535 field4448 = new class535(8);

    @ObfuscatedName("ow.aa")
    public class535 field4449;

    @ObfuscatedName("ow.aq")
    public int field4450 = 0;

    @ObfuscatedName("ow.ac")
    public CRC32 field4451 = new CRC32();

    @ObfuscatedName("ow.ae")
    public class535 field4452;

    @ObfuscatedName("ow.ak")
    public class376[] field4453 = new class376[256];

    @ObfuscatedName("ow.bp")
    public int field4454 = -1;

    @ObfuscatedName("ow.bz")
    public int field4440 = 255;

    @ObfuscatedName("ow.bc")
    public byte field4456 = 0;

    @ObfuscatedName("ow.bf")
    public int field4457 = 0;

    @ObfuscatedName("ow.be")
    public int field4458 = 0;

    @ObfuscatedName("ow.az(I)Z")
    public boolean method6417() {
        long var1 = class318.method3596();
        int var3 = (int) (var1 - this.field4439);
        this.field4439 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4438 += var3;
        if (this.field4441 == 0 && this.field4435 == 0 && this.field4443 == 0 && this.field4431 == 0) {
            return true;
        } else if (this.field4434 == null) {
            return false;
        } else {
            try {
                if (this.field4438 > 30000) {
                    throw new IOException();
                }
                while (this.field4435 < 200 && this.field4431 > 0) {
                    class378 var4 = (class378) this.field4437.method8207();
                    class535 var5 = new class535(4);
                    var5.method8445(1);
                    var5.method8646((int) var4.field4951);
                    this.field4434.method7555(var5.field5231, 0, 4);
                    this.field4445.method8204(var4, var4.field4951);
                    this.field4431--;
                    this.field4435++;
                }
                while (this.field4441 < 200 && this.field4443 > 0) {
                    class378 var6 = (class378) this.field4455.method6571();
                    class535 var7 = new class535(4);
                    var7.method8445(0);
                    var7.method8646((int) var6.field4951);
                    this.field4434.method7555(var7.field5231, 0, 4);
                    var6.method7853();
                    this.field4444.method8204(var6, var6.field4951);
                    this.field4443--;
                    this.field4441++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4434.method7550();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4438 = 0;
                    byte var10 = 0;
                    if (this.field4447 == null) {
                        var10 = 8;
                    } else if (this.field4450 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4448.field5233;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4434.method7549(this.field4448.field5231, this.field4448.field5233, var11);
                        if (this.field4456 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4448.field5231[this.field4448.field5233 + var12] ^= this.field4456;
                            }
                        }
                        this.field4448.field5233 += var11;
                        if (this.field4448.field5233 < var10) {
                            break;
                        }
                        if (this.field4447 == null) {
                            this.field4448.field5233 = 0;
                            int var13 = this.field4448.method8462();
                            int var14 = this.field4448.method8670();
                            int var15 = this.field4448.method8462();
                            int var16 = this.field4448.method8682();
                            long var17 = (long) ((var13 << 16) + var14);
                            class378 var19 = (class378) this.field4445.method8206(var17);
                            this.field4446 = true;
                            if (var19 == null) {
                                var19 = (class378) this.field4444.method8206(var17);
                                this.field4446 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4447 = var19;
                            this.field4449 = new class535(var16 + var20 + this.field4447.field4411);
                            this.field4449.method8445(var15);
                            this.field4449.method8448(var16);
                            this.field4450 = 8;
                            this.field4448.field5233 = 0;
                        } else if (this.field4450 == 0) {
                            if (this.field4448.field5231[0] == -1) {
                                this.field4450 = 1;
                                this.field4448.field5233 = 0;
                            } else {
                                this.field4447 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4449.field5231.length - this.field4447.field4411;
                        int var22 = 512 - this.field4450;
                        if (var22 > var21 - this.field4449.field5233) {
                            var22 = var21 - this.field4449.field5233;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4434.method7549(this.field4449.field5231, this.field4449.field5233, var22);
                        if (this.field4456 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4449.field5231[this.field4449.field5233 + var23] ^= this.field4456;
                            }
                        }
                        this.field4449.field5233 += var22;
                        this.field4450 += var22;
                        if (this.field4449.field5233 == var21) {
                            if (this.field4447.field4951 == 16711935L) {
                                this.field4452 = this.field4449;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class376 var25 = this.field4453[var24];
                                    if (var25 != null) {
                                        this.method6422(var25, var24);
                                    }
                                }
                            } else {
                                this.field4451.reset();
                                this.field4451.update(this.field4449.field5231, 0, var21);
                                int var26 = (int) this.field4451.getValue();
                                if (this.field4447.field4410 != var26) {
                                    try {
                                        this.field4434.method7551();
                                    } catch (Exception var31) {
                                    }
                                    this.field4457++;
                                    this.field4434 = null;
                                    this.field4456 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4457 = 0;
                                this.field4458 = 0;
                                this.field4447.field4412.method6288((int) (this.field4447.field4951 & 0xFFFFL), this.field4449.field5231, (this.field4447.field4951 & 0xFF0000L) == 16711680L, this.field4446);
                            }
                            this.field4447.method7855();
                            if (this.field4446) {
                                this.field4435--;
                            } else {
                                this.field4441--;
                            }
                            this.field4450 = 0;
                            this.field4447 = null;
                            this.field4449 = null;
                        } else {
                            if (this.field4450 != 512) {
                                break;
                            }
                            this.field4450 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4434.method7551();
                } catch (Exception var30) {
                }
                this.field4458++;
                this.field4434 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ow.ah(ZI)V")
    public void method6419(boolean arg0) {
        if (this.field4434 == null) {
            return;
        }
        try {
            class535 var2 = new class535(4);
            var2.method8445(arg0 ? 2 : 3);
            var2.method8646(0);
            this.field4434.method7555(var2.field5231, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4434.method7551();
            } catch (Exception var5) {
            }
            this.field4458++;
            this.field4434 = null;
        }
    }

    @ObfuscatedName("ow.af(Lrq;ZB)V")
    public void method6420(class459 arg0, boolean arg1) {
        if (this.field4434 != null) {
            try {
                this.field4434.method7551();
            } catch (Exception var11) {
            }
            this.field4434 = null;
        }
        this.field4434 = arg0;
        this.method6419(arg1);
        this.field4448.field5233 = 0;
        this.field4447 = null;
        this.field4449 = null;
        this.field4450 = 0;
        while (true) {
            class378 var4 = (class378) this.field4445.method8207();
            if (var4 == null) {
                while (true) {
                    class378 var5 = (class378) this.field4444.method8207();
                    if (var5 == null) {
                        if (this.field4456 != 0) {
                            try {
                                class535 var6 = new class535(4);
                                var6.method8445(4);
                                var6.method8445(this.field4456);
                                var6.method8446(0);
                                this.field4434.method7555(var6.field5231, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4434.method7551();
                                } catch (Exception var9) {
                                }
                                this.field4458++;
                                this.field4434 = null;
                            }
                        }
                        this.field4438 = 0;
                        this.field4439 = class318.method3596();
                        return;
                    }
                    this.field4455.method6573(var5);
                    this.field4442.method8204(var5, var5.field4951);
                    this.field4443++;
                    this.field4441--;
                }
            }
            this.field4437.method8204(var4, var4.field4951);
            this.field4431++;
            this.field4435--;
        }
    }

    @ObfuscatedName("ow.at(Lov;II)V")
    public void method6418(class376 arg0, int arg1) {
        if (arg0.field4381 && !arg0.field4382) {
            if (arg1 <= this.field4454) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4440) {
                this.field4440 = arg1;
            }
        } else if (arg1 >= this.field4440) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4454) {
            this.field4454 = arg1;
        }
        if (this.field4452 == null) {
            this.method6423((class376) null, class377.field4390.field4408, 255, 0, (byte) 0, true);
            this.field4453[arg1] = arg0;
        } else {
            this.method6422(arg0, arg1);
        }
    }

    @ObfuscatedName("ow.an(Lov;IS)V")
    public void method6422(class376 arg0, int arg1) {
        this.field4452.field5233 = arg1 * 8 + 5;
        if (this.field4452.field5233 < this.field4452.field5231.length) {
            int var3 = this.field4452.method8682();
            int var4 = this.field4452.method8682();
            arg0.method6281(var3, var4);
        } else if (arg0.field4381) {
            arg0.method6316();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ow.ao(Lov;IIIBZI)V")
    public void method6423(class376 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class378 var9 = (class378) this.field4437.method8206(var7);
        if (var9 != null) {
            return;
        }
        class378 var10 = (class378) this.field4445.method8206(var7);
        if (var10 != null) {
            return;
        }
        class378 var11 = (class378) this.field4442.method8206(var7);
        if (var11 == null) {
            if (!arg5) {
                class378 var12 = (class378) this.field4444.method8206(var7);
                if (var12 != null) {
                    return;
                }
            }
            class378 var13 = new class378();
            var13.field4412 = arg0;
            var13.field4410 = arg3;
            var13.field4411 = arg4;
            if (arg5) {
                this.field4437.method8204(var13, var7);
                this.field4431++;
            } else {
                this.field4455.method6570(var13);
                this.field4442.method8204(var13, var7);
                this.field4443++;
            }
        } else if (arg5) {
            var11.method7853();
            this.field4437.method8204(var11, var7);
            this.field4443--;
            this.field4431++;
        }
    }

    @ObfuscatedName("ow.ab(III)V")
    public void method6424(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class378 var5 = (class378) this.field4442.method8206(var3);
        if (var5 != null) {
            this.field4455.method6573(var5);
        }
    }

    @ObfuscatedName("ow.aw(III)I")
    public int method6425(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4447 != null && this.field4447.field4951 == var3 ? this.field4449.field5233 * 99 / (this.field4449.field5231.length - this.field4447.field4411) + 1 : 0;
    }

    @ObfuscatedName("ow.ad(ZZI)I")
    public int method6426(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4435 + this.field4431;
        }
        if (arg1) {
            var3 += this.field4443 + this.field4441;
        }
        return var3;
    }

    @ObfuscatedName("ow.al(I)V")
    public void method6445() {
        if (this.field4434 == null) {
            return;
        }
        try {
            this.field4434.method7551();
        } catch (Exception var2) {
        }
        this.field4434 = null;
    }
}
