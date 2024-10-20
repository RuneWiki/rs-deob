package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("pk")
public class class393 {

    @ObfuscatedName("pk.ay")
    public class487 field4609;

    @ObfuscatedName("pk.as")
    public int field4613 = 0;

    @ObfuscatedName("pk.ae")
    public long field4615;

    @ObfuscatedName("pk.am")
    public class531 field4612 = new class531(4096);

    @ObfuscatedName("pk.at")
    public int field4623 = 0;

    @ObfuscatedName("pk.au")
    public class531 field4614 = new class531(32);

    @ObfuscatedName("pk.an")
    public int field4610 = 0;

    @ObfuscatedName("pk.ao")
    public class410 field4616 = new class410();

    @ObfuscatedName("pk.af")
    public class531 field4619 = new class531(4096);

    @ObfuscatedName("pk.ar")
    public int field4618 = 0;

    @ObfuscatedName("pk.ab")
    public class531 field4617 = new class531(4096);

    @ObfuscatedName("pk.az")
    public int field4620 = 0;

    @ObfuscatedName("pk.ag")
    public boolean field4627;

    @ObfuscatedName("pk.ad")
    public class391 field4622;

    @ObfuscatedName("pk.ac")
    public class558 field4634 = new class558(8);

    @ObfuscatedName("pk.av")
    public class558 field4624;

    @ObfuscatedName("pk.ax")
    public int field4625 = 0;

    @ObfuscatedName("pk.al")
    public CRC32 field4626 = new CRC32();

    @ObfuscatedName("pk.aa")
    public class558 field4605;

    @ObfuscatedName("pk.ah")
    public class389[] field4628 = new class389[256];

    @ObfuscatedName("pk.bh")
    public int field4629 = -1;

    @ObfuscatedName("pk.bj")
    public int field4630 = 255;

    @ObfuscatedName("pk.bv")
    public byte field4631 = 0;

    @ObfuscatedName("pk.bx")
    public int field4632 = 0;

    @ObfuscatedName("pk.bk")
    public int field4633 = 0;

    @ObfuscatedName("pk.ap(I)Z")
    public boolean method7077() {
        long var1 = class330.method2257();
        int var3 = (int) (var1 - this.field4615);
        this.field4615 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4613 += var3;
        if (this.field4620 == 0 && this.field4610 == 0 && this.field4618 == 0 && this.field4623 == 0) {
            return true;
        } else if (this.field4609 == null) {
            return false;
        } else {
            try {
                if (this.field4613 > 30000) {
                    throw new IOException();
                }
                while (this.field4610 < 200 && this.field4623 > 0) {
                    class391 var4 = (class391) this.field4612.method8996();
                    class558 var5 = new class558(4);
                    var5.method9241(1);
                    var5.method9243((int) var4.field5170);
                    this.field4609.method8502(var5.field5463, 0, 4);
                    this.field4614.method8990(var4, var4.field5170);
                    this.field4623--;
                    this.field4610++;
                }
                while (this.field4620 < 200 && this.field4618 > 0) {
                    class391 var6 = (class391) this.field4616.method7237();
                    class558 var7 = new class558(4);
                    var7.method9241(0);
                    var7.method9243((int) var6.field5170);
                    this.field4609.method8502(var7.field5463, 0, 4);
                    var6.method8665();
                    this.field4617.method8990(var6, var6.field5170);
                    this.field4618--;
                    this.field4620++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4609.method8500();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4613 = 0;
                    byte var10 = 0;
                    if (this.field4622 == null) {
                        var10 = 8;
                    } else if (this.field4625 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4634.field5462;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4609.method8501(this.field4634.field5463, this.field4634.field5462, var11);
                        if (this.field4631 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4634.field5463[this.field4634.field5462 + var12] ^= this.field4631;
                            }
                        }
                        this.field4634.field5462 += var11;
                        if (this.field4634.field5462 < var10) {
                            break;
                        }
                        if (this.field4622 == null) {
                            this.field4634.field5462 = 0;
                            int var13 = this.field4634.method9258();
                            int var14 = this.field4634.method9260();
                            int var15 = this.field4634.method9258();
                            int var16 = this.field4634.method9264();
                            long var17 = (long) ((var13 << 16) + var14);
                            class391 var19 = (class391) this.field4614.method8993(var17);
                            this.field4627 = true;
                            if (var19 == null) {
                                var19 = (class391) this.field4617.method8993(var17);
                                this.field4627 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4622 = var19;
                            this.field4624 = new class558(var16 + var20 + this.field4622.field4581);
                            this.field4624.method9241(var15);
                            this.field4624.method9244(var16);
                            this.field4625 = 8;
                            this.field4634.field5462 = 0;
                        } else if (this.field4625 == 0) {
                            if (this.field4634.field5463[0] == -1) {
                                this.field4625 = 1;
                                this.field4634.field5462 = 0;
                            } else {
                                this.field4622 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4624.field5463.length - this.field4622.field4581;
                        int var22 = 512 - this.field4625;
                        if (var22 > var21 - this.field4624.field5462) {
                            var22 = var21 - this.field4624.field5462;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4609.method8501(this.field4624.field5463, this.field4624.field5462, var22);
                        if (this.field4631 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4624.field5463[this.field4624.field5462 + var23] ^= this.field4631;
                            }
                        }
                        this.field4624.field5462 += var22;
                        this.field4625 += var22;
                        if (this.field4624.field5462 == var21) {
                            if (this.field4622.field5170 == 16711935L) {
                                this.field4605 = this.field4624;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class389 var25 = this.field4628[var24];
                                    if (var25 != null) {
                                        this.method7081(var25, var24);
                                    }
                                }
                            } else {
                                this.field4626.reset();
                                this.field4626.update(this.field4624.field5463, 0, var21);
                                int var26 = (int) this.field4626.getValue();
                                if (this.field4622.field4582 != var26) {
                                    try {
                                        this.field4609.method8512();
                                    } catch (Exception var31) {
                                    }
                                    this.field4632++;
                                    this.field4609 = null;
                                    this.field4631 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4632 = 0;
                                this.field4633 = 0;
                                this.field4622.field4585.method6985((int) (this.field4622.field5170 & 0xFFFFL), this.field4624.field5463, (this.field4622.field5170 & 0xFF0000L) == 16711680L, this.field4627);
                            }
                            this.field4622.method8667();
                            if (this.field4627) {
                                this.field4610--;
                            } else {
                                this.field4620--;
                            }
                            this.field4625 = 0;
                            this.field4622 = null;
                            this.field4624 = null;
                        } else {
                            if (this.field4625 != 512) {
                                break;
                            }
                            this.field4625 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4609.method8512();
                } catch (Exception var30) {
                }
                this.field4633++;
                this.field4609 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("pk.aw(ZI)V")
    public void method7078(boolean arg0) {
        if (this.field4609 == null) {
            return;
        }
        try {
            class558 var2 = new class558(4);
            var2.method9241(arg0 ? 2 : 3);
            var2.method9243(0);
            this.field4609.method8502(var2.field5463, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4609.method8512();
            } catch (Exception var5) {
            }
            this.field4633++;
            this.field4609 = null;
        }
    }

    @ObfuscatedName("pk.ak(Lsw;ZI)V")
    public void method7079(class487 arg0, boolean arg1) {
        if (this.field4609 != null) {
            try {
                this.field4609.method8512();
            } catch (Exception var11) {
            }
            this.field4609 = null;
        }
        this.field4609 = arg0;
        this.method7078(arg1);
        this.field4634.field5462 = 0;
        this.field4622 = null;
        this.field4624 = null;
        this.field4625 = 0;
        while (true) {
            class391 var4 = (class391) this.field4614.method8996();
            if (var4 == null) {
                while (true) {
                    class391 var5 = (class391) this.field4617.method8996();
                    if (var5 == null) {
                        if (this.field4631 != 0) {
                            try {
                                class558 var6 = new class558(4);
                                var6.method9241(4);
                                var6.method9241(this.field4631);
                                var6.method9257(0);
                                this.field4609.method8502(var6.field5463, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4609.method8512();
                                } catch (Exception var9) {
                                }
                                this.field4633++;
                                this.field4609 = null;
                            }
                        }
                        this.field4613 = 0;
                        this.field4615 = class330.method2257();
                        return;
                    }
                    this.field4616.method7234(var5);
                    this.field4619.method8990(var5, var5.field5170);
                    this.field4618++;
                    this.field4620--;
                }
            }
            this.field4612.method8990(var4, var4.field5170);
            this.field4623++;
            this.field4610--;
        }
    }

    @ObfuscatedName("pk.aj(Lor;II)V")
    public void method7080(class389 arg0, int arg1) {
        if (arg0.field4554 && !arg0.field4543) {
            if (arg1 <= this.field4629) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4630) {
                this.field4630 = arg1;
            }
        } else if (arg1 >= this.field4630) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4629) {
            this.field4629 = arg1;
        }
        if (this.field4605 == null) {
            this.method7082((class389) null, class390.field4566.field4580, 255, 0, (byte) 0, true);
            this.field4628[arg1] = arg0;
        } else {
            this.method7081(arg0, arg1);
        }
    }

    @ObfuscatedName("pk.ai(Lor;II)V")
    public void method7081(class389 arg0, int arg1) {
        this.field4605.field5462 = arg1 * 8 + 5;
        if (this.field4605.field5462 < this.field4605.field5463.length) {
            int var3 = this.field4605.method9264();
            int var4 = this.field4605.method9264();
            arg0.method6951(var3, var4);
        } else if (arg0.field4554) {
            arg0.method6950();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("pk.ay(Lor;IIIBZI)V")
    public void method7082(class389 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class391 var9 = (class391) this.field4612.method8993(var7);
        if (var9 != null) {
            return;
        }
        class391 var10 = (class391) this.field4614.method8993(var7);
        if (var10 != null) {
            return;
        }
        class391 var11 = (class391) this.field4619.method8993(var7);
        if (var11 == null) {
            if (!arg5) {
                class391 var12 = (class391) this.field4617.method8993(var7);
                if (var12 != null) {
                    return;
                }
            }
            class391 var13 = new class391();
            var13.field4585 = arg0;
            var13.field4582 = arg3;
            var13.field4581 = arg4;
            if (arg5) {
                this.field4612.method8990(var13, var7);
                this.field4623++;
            } else {
                this.field4616.method7233(var13);
                this.field4619.method8990(var13, var7);
                this.field4618++;
            }
        } else if (arg5) {
            var11.method8665();
            this.field4612.method8990(var11, var7);
            this.field4618--;
            this.field4623++;
        }
    }

    @ObfuscatedName("pk.as(III)V")
    public void method7083(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class391 var5 = (class391) this.field4619.method8993(var3);
        if (var5 != null) {
            this.field4616.method7234(var5);
        }
    }

    @ObfuscatedName("pk.ae(III)I")
    public int method7097(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4622 != null && this.field4622.field5170 == var3 ? this.field4624.field5462 * 99 / (this.field4624.field5463.length - this.field4622.field4581) + 1 : 0;
    }

    @ObfuscatedName("pk.am(ZZB)I")
    public int method7102(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4623 + this.field4610;
        }
        if (arg1) {
            var3 += this.field4620 + this.field4618;
        }
        return var3;
    }

    @ObfuscatedName("pk.at(B)V")
    public void method7086() {
        if (this.field4609 == null) {
            return;
        }
        try {
            this.field4609.method8512();
        } catch (Exception var2) {
        }
        this.field4609 = null;
    }
}
