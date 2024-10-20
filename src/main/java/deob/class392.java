package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("py")
public class class392 {

    @ObfuscatedName("py.aq")
    public class482 field4569;

    @ObfuscatedName("py.af")
    public int field4574 = 0;

    @ObfuscatedName("py.at")
    public long field4571;

    @ObfuscatedName("py.au")
    public class524 field4578 = new class524(4096);

    @ObfuscatedName("py.ar")
    public int field4573 = 0;

    @ObfuscatedName("py.al")
    public class524 field4576 = new class524(32);

    @ObfuscatedName("py.ad")
    public int field4575 = 0;

    @ObfuscatedName("py.ah")
    public class409 field4583 = new class409();

    @ObfuscatedName("py.ap")
    public class524 field4577 = new class524(4096);

    @ObfuscatedName("py.ab")
    public int field4592 = 0;

    @ObfuscatedName("py.az")
    public class524 field4579 = new class524(4096);

    @ObfuscatedName("py.aa")
    public int field4588 = 0;

    @ObfuscatedName("py.ai")
    public boolean field4581;

    @ObfuscatedName("py.ao")
    public class390 field4582;

    @ObfuscatedName("py.as")
    public class551 field4564 = new class551(8);

    @ObfuscatedName("py.ay")
    public class551 field4584;

    @ObfuscatedName("py.aj")
    public int field4585 = 0;

    @ObfuscatedName("py.aw")
    public CRC32 field4586 = new CRC32();

    @ObfuscatedName("py.an")
    public class551 field4587;

    @ObfuscatedName("py.ak")
    public class388[] field4570 = new class388[256];

    @ObfuscatedName("py.bn")
    public int field4589 = -1;

    @ObfuscatedName("py.bh")
    public int field4590 = 255;

    @ObfuscatedName("py.bd")
    public byte field4591 = 0;

    @ObfuscatedName("py.bx")
    public int field4565 = 0;

    @ObfuscatedName("py.bf")
    public int field4593 = 0;

    @ObfuscatedName("py.ac(B)Z")
    public boolean method6861() {
        long var1 = class331.method3482();
        int var3 = (int) (var1 - this.field4571);
        this.field4571 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4574 += var3;
        if (this.field4588 == 0 && this.field4575 == 0 && this.field4592 == 0 && this.field4573 == 0) {
            return true;
        } else if (this.field4569 == null) {
            return false;
        } else {
            try {
                if (this.field4574 > 30000) {
                    throw new IOException();
                }
                while (this.field4575 < 200 && this.field4573 > 0) {
                    class390 var4 = (class390) this.field4578.method8691();
                    class551 var5 = new class551(4);
                    var5.method9022(1);
                    var5.method9196((int) var4.field5122);
                    this.field4569.method8216(var5.field5413, 0, 4);
                    this.field4576.method8690(var4, var4.field5122);
                    this.field4573--;
                    this.field4575++;
                }
                while (this.field4588 < 200 && this.field4592 > 0) {
                    class390 var6 = (class390) this.field4583.method7015();
                    class551 var7 = new class551(4);
                    var7.method9022(0);
                    var7.method9196((int) var6.field5122);
                    this.field4569.method8216(var7.field5413, 0, 4);
                    var6.method8359();
                    this.field4579.method8690(var6, var6.field5122);
                    this.field4592--;
                    this.field4588++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4569.method8220();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4574 = 0;
                    byte var10 = 0;
                    if (this.field4582 == null) {
                        var10 = 8;
                    } else if (this.field4585 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4564.field5415;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4569.method8196(this.field4564.field5413, this.field4564.field5415, var11);
                        if (this.field4591 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4564.field5413[this.field4564.field5415 + var12] ^= this.field4591;
                            }
                        }
                        this.field4564.field5415 += var11;
                        if (this.field4564.field5415 < var10) {
                            break;
                        }
                        if (this.field4582 == null) {
                            this.field4564.field5415 = 0;
                            int var13 = this.field4564.method8955();
                            int var14 = this.field4564.method9119();
                            int var15 = this.field4564.method8955();
                            int var16 = this.field4564.method9110();
                            long var17 = (long) ((var13 << 16) + var14);
                            class390 var19 = (class390) this.field4576.method8688(var17);
                            this.field4581 = true;
                            if (var19 == null) {
                                var19 = (class390) this.field4579.method8688(var17);
                                this.field4581 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4582 = var19;
                            this.field4584 = new class551(var16 + var20 + this.field4582.field4546);
                            this.field4584.method9022(var15);
                            this.field4584.method8960(var16);
                            this.field4585 = 8;
                            this.field4564.field5415 = 0;
                        } else if (this.field4585 == 0) {
                            if (this.field4564.field5413[0] == -1) {
                                this.field4585 = 1;
                                this.field4564.field5415 = 0;
                            } else {
                                this.field4582 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4584.field5413.length - this.field4582.field4546;
                        int var22 = 512 - this.field4585;
                        if (var22 > var21 - this.field4584.field5415) {
                            var22 = var21 - this.field4584.field5415;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4569.method8196(this.field4584.field5413, this.field4584.field5415, var22);
                        if (this.field4591 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4584.field5413[this.field4584.field5415 + var23] ^= this.field4591;
                            }
                        }
                        this.field4584.field5415 += var22;
                        this.field4585 += var22;
                        if (this.field4584.field5415 == var21) {
                            if (this.field4582.field5122 == 16711935L) {
                                this.field4587 = this.field4584;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class388 var25 = this.field4570[var24];
                                    if (var25 != null) {
                                        this.method6890(var25, var24);
                                    }
                                }
                            } else {
                                this.field4586.reset();
                                this.field4586.update(this.field4584.field5413, 0, var21);
                                int var26 = (int) this.field4586.getValue();
                                if (this.field4582.field4544 != var26) {
                                    try {
                                        this.field4569.method8198();
                                    } catch (Exception var31) {
                                    }
                                    this.field4565++;
                                    this.field4569 = null;
                                    this.field4591 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4565 = 0;
                                this.field4593 = 0;
                                this.field4582.field4545.method6731((int) (this.field4582.field5122 & 0xFFFFL), this.field4584.field5413, (this.field4582.field5122 & 0xFF0000L) == 16711680L, this.field4581);
                            }
                            this.field4582.method8362();
                            if (this.field4581) {
                                this.field4575--;
                            } else {
                                this.field4588--;
                            }
                            this.field4585 = 0;
                            this.field4582 = null;
                            this.field4584 = null;
                        } else {
                            if (this.field4585 != 512) {
                                break;
                            }
                            this.field4585 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4569.method8198();
                } catch (Exception var30) {
                }
                this.field4593++;
                this.field4569 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("py.ae(ZI)V")
    public void method6885(boolean arg0) {
        if (this.field4569 == null) {
            return;
        }
        try {
            class551 var2 = new class551(4);
            var2.method9022(arg0 ? 2 : 3);
            var2.method9196(0);
            this.field4569.method8216(var2.field5413, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4569.method8198();
            } catch (Exception var5) {
            }
            this.field4593++;
            this.field4569 = null;
        }
    }

    @ObfuscatedName("py.ag(Lsk;ZI)V")
    public void method6862(class482 arg0, boolean arg1) {
        if (this.field4569 != null) {
            try {
                this.field4569.method8198();
            } catch (Exception var11) {
            }
            this.field4569 = null;
        }
        this.field4569 = arg0;
        this.method6885(arg1);
        this.field4564.field5415 = 0;
        this.field4582 = null;
        this.field4584 = null;
        this.field4585 = 0;
        while (true) {
            class390 var4 = (class390) this.field4576.method8691();
            if (var4 == null) {
                while (true) {
                    class390 var5 = (class390) this.field4579.method8691();
                    if (var5 == null) {
                        if (this.field4591 != 0) {
                            try {
                                class551 var6 = new class551(4);
                                var6.method9022(4);
                                var6.method9022(this.field4591);
                                var6.method8958(0);
                                this.field4569.method8216(var6.field5413, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4569.method8198();
                                } catch (Exception var9) {
                                }
                                this.field4593++;
                                this.field4569 = null;
                            }
                        }
                        this.field4574 = 0;
                        this.field4571 = class331.method3482();
                        return;
                    }
                    this.field4583.method7018(var5);
                    this.field4577.method8690(var5, var5.field5122);
                    this.field4592++;
                    this.field4588--;
                }
            }
            this.field4578.method8690(var4, var4.field5122);
            this.field4573++;
            this.field4575--;
        }
    }

    @ObfuscatedName("py.am(Lof;II)V")
    public void method6863(class388 arg0, int arg1) {
        if (arg0.field4516 && !arg0.field4503) {
            if (arg1 <= this.field4589) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4590) {
                this.field4590 = arg1;
            }
        } else if (arg1 >= this.field4590) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4589) {
            this.field4589 = arg1;
        }
        if (this.field4587 == null) {
            this.method6874((class388) null, class389.field4536.field4542, 255, 0, (byte) 0, true);
            this.field4570[arg1] = arg0;
        } else {
            this.method6890(arg0, arg1);
        }
    }

    @ObfuscatedName("py.ax(Lof;IB)V")
    public void method6890(class388 arg0, int arg1) {
        this.field4587.field5415 = arg1 * 8 + 5;
        if (this.field4587.field5415 < this.field4587.field5413.length) {
            int var3 = this.field4587.method9110();
            int var4 = this.field4587.method9110();
            arg0.method6750(var3, var4);
        } else if (arg0.field4516) {
            arg0.method6760();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("py.aq(Lof;IIIBZB)V")
    public void method6874(class388 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class390 var9 = (class390) this.field4578.method8688(var7);
        if (var9 != null) {
            return;
        }
        class390 var10 = (class390) this.field4576.method8688(var7);
        if (var10 != null) {
            return;
        }
        class390 var11 = (class390) this.field4577.method8688(var7);
        if (var11 == null) {
            if (!arg5) {
                class390 var12 = (class390) this.field4579.method8688(var7);
                if (var12 != null) {
                    return;
                }
            }
            class390 var13 = new class390();
            var13.field4545 = arg0;
            var13.field4544 = arg3;
            var13.field4546 = arg4;
            if (arg5) {
                this.field4578.method8690(var13, var7);
                this.field4573++;
            } else {
                this.field4583.method7013(var13);
                this.field4577.method8690(var13, var7);
                this.field4592++;
            }
        } else if (arg5) {
            var11.method8359();
            this.field4578.method8690(var11, var7);
            this.field4592--;
            this.field4573++;
        }
    }

    @ObfuscatedName("py.af(III)V")
    public void method6866(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class390 var5 = (class390) this.field4577.method8688(var3);
        if (var5 != null) {
            this.field4583.method7018(var5);
        }
    }

    @ObfuscatedName("py.at(III)I")
    public int method6867(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4582 != null && this.field4582.field5122 == var3 ? this.field4584.field5415 * 99 / (this.field4584.field5413.length - this.field4582.field4546) + 1 : 0;
    }

    @ObfuscatedName("py.au(ZZS)I")
    public int method6868(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4575 + this.field4573;
        }
        if (arg1) {
            var3 += this.field4592 + this.field4588;
        }
        return var3;
    }

    @ObfuscatedName("py.ar(B)V")
    public void method6869() {
        if (this.field4569 == null) {
            return;
        }
        try {
            this.field4569.method8198();
        } catch (Exception var2) {
        }
        this.field4569 = null;
    }
}
