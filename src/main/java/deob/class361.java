package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("nq")
public class class361 {

    @ObfuscatedName("nq.aw")
    public class440 field4310;

    @ObfuscatedName("nq.ay")
    public int field4297 = 0;

    @ObfuscatedName("nq.ar")
    public long field4320;

    @ObfuscatedName("nq.am")
    public class490 field4316 = new class490(4096);

    @ObfuscatedName("nq.as")
    public int field4311 = 0;

    @ObfuscatedName("nq.aj")
    public class490 field4301 = new class490(32);

    @ObfuscatedName("nq.ag")
    public int field4302 = 0;

    @ObfuscatedName("nq.az")
    public class378 field4303 = new class378();

    @ObfuscatedName("nq.av")
    public class490 field4304 = new class490(4096);

    @ObfuscatedName("nq.ap")
    public int field4305 = 0;

    @ObfuscatedName("nq.aq")
    public class490 field4306 = new class490(4096);

    @ObfuscatedName("nq.at")
    public int field4298 = 0;

    @ObfuscatedName("nq.ah")
    public boolean field4308;

    @ObfuscatedName("nq.ax")
    public class359 field4309;

    @ObfuscatedName("nq.aa")
    public class514 field4300 = new class514(8);

    @ObfuscatedName("nq.au")
    public class514 field4315;

    @ObfuscatedName("nq.ae")
    public int field4312 = 0;

    @ObfuscatedName("nq.ad")
    public CRC32 field4313 = new CRC32();

    @ObfuscatedName("nq.ao")
    public class514 field4296;

    @ObfuscatedName("nq.ac")
    public class358[] field4307 = new class358[256];

    @ObfuscatedName("nq.ak")
    public int field4317 = -1;

    @ObfuscatedName("nq.an")
    public int field4314 = 255;

    @ObfuscatedName("nq.af")
    public byte field4318 = 0;

    @ObfuscatedName("nq.ai")
    public int field4319 = 0;

    @ObfuscatedName("nq.al")
    public int field4299 = 0;

    @ObfuscatedName("nq.aw(S)Z")
    public boolean method6213() {
        long var1 = class303.method2705();
        int var3 = (int) (var1 - this.field4320);
        this.field4320 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4297 += var3;
        if (this.field4298 == 0 && this.field4302 == 0 && this.field4305 == 0 && this.field4311 == 0) {
            return true;
        } else if (this.field4310 == null) {
            return false;
        } else {
            try {
                if (this.field4297 > 30000) {
                    throw new IOException();
                }
                while (this.field4302 < 200 && this.field4311 > 0) {
                    class359 var4 = (class359) this.field4316.method7983();
                    class514 var5 = new class514(4);
                    var5.method8227(1);
                    var5.method8229((int) var4.field4819);
                    this.field4310.method7347(var5.field5070, 0, 4);
                    this.field4301.method7990(var4, var4.field4819);
                    this.field4311--;
                    this.field4302++;
                }
                while (this.field4298 < 200 && this.field4305 > 0) {
                    class359 var6 = (class359) this.field4303.method6354();
                    class514 var7 = new class514(4);
                    var7.method8227(0);
                    var7.method8229((int) var6.field4819);
                    this.field4310.method7347(var7.field5070, 0, 4);
                    var6.method7660();
                    this.field4306.method7990(var6, var6.field4819);
                    this.field4305--;
                    this.field4298++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4310.method7344();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4297 = 0;
                    byte var10 = 0;
                    if (this.field4309 == null) {
                        var10 = 8;
                    } else if (this.field4312 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4300.field5072;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4310.method7362(this.field4300.field5070, this.field4300.field5072, var11);
                        if (this.field4318 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4300.field5070[this.field4300.field5072 + var12] ^= this.field4318;
                            }
                        }
                        this.field4300.field5072 += var11;
                        if (this.field4300.field5072 < var10) {
                            break;
                        }
                        if (this.field4309 == null) {
                            this.field4300.field5072 = 0;
                            int var13 = this.field4300.method8244();
                            int var14 = this.field4300.method8246();
                            int var15 = this.field4300.method8244();
                            int var16 = this.field4300.method8496();
                            long var17 = (long) ((var13 << 16) + var14);
                            class359 var19 = (class359) this.field4301.method7981(var17);
                            this.field4308 = true;
                            if (var19 == null) {
                                var19 = (class359) this.field4306.method7981(var17);
                                this.field4308 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4309 = var19;
                            this.field4315 = new class514(var16 + var20 + this.field4309.field4271);
                            this.field4315.method8227(var15);
                            this.field4315.method8230(var16);
                            this.field4312 = 8;
                            this.field4300.field5072 = 0;
                        } else if (this.field4312 == 0) {
                            if (this.field4300.field5070[0] == -1) {
                                this.field4312 = 1;
                                this.field4300.field5072 = 0;
                            } else {
                                this.field4309 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4315.field5070.length - this.field4309.field4271;
                        int var22 = 512 - this.field4312;
                        if (var22 > var21 - this.field4315.field5072) {
                            var22 = var21 - this.field4315.field5072;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4310.method7362(this.field4315.field5070, this.field4315.field5072, var22);
                        if (this.field4318 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4315.field5070[this.field4315.field5072 + var23] ^= this.field4318;
                            }
                        }
                        this.field4315.field5072 += var22;
                        this.field4312 += var22;
                        if (this.field4315.field5072 == var21) {
                            if (this.field4309.field4819 == 16711935L) {
                                this.field4296 = this.field4315;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class358 var25 = this.field4307[var24];
                                    if (var25 != null) {
                                        this.method6217(var25, var24);
                                    }
                                }
                            } else {
                                this.field4313.reset();
                                this.field4313.update(this.field4315.field5070, 0, var21);
                                int var26 = (int) this.field4313.getValue();
                                if (this.field4309.field4272 != var26) {
                                    try {
                                        this.field4310.method7348();
                                    } catch (Exception var31) {
                                    }
                                    this.field4319++;
                                    this.field4310 = null;
                                    this.field4318 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4319 = 0;
                                this.field4299 = 0;
                                this.field4309.field4273.method6082((int) (this.field4309.field4819 & 0xFFFFL), this.field4315.field5070, (this.field4309.field4819 & 0xFF0000L) == 16711680L, this.field4308);
                            }
                            this.field4309.method7662();
                            if (this.field4308) {
                                this.field4302--;
                            } else {
                                this.field4298--;
                            }
                            this.field4312 = 0;
                            this.field4309 = null;
                            this.field4315 = null;
                        } else {
                            if (this.field4312 != 512) {
                                break;
                            }
                            this.field4312 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4310.method7348();
                } catch (Exception var30) {
                }
                this.field4299++;
                this.field4310 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("nq.ay(ZB)V")
    public void method6200(boolean arg0) {
        if (this.field4310 == null) {
            return;
        }
        try {
            class514 var2 = new class514(4);
            var2.method8227(arg0 ? 2 : 3);
            var2.method8229(0);
            this.field4310.method7347(var2.field5070, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4310.method7348();
            } catch (Exception var5) {
            }
            this.field4299++;
            this.field4310 = null;
        }
    }

    @ObfuscatedName("nq.ar(Lqh;ZB)V")
    public void method6201(class440 arg0, boolean arg1) {
        if (this.field4310 != null) {
            try {
                this.field4310.method7348();
            } catch (Exception var11) {
            }
            this.field4310 = null;
        }
        this.field4310 = arg0;
        this.method6200(arg1);
        this.field4300.field5072 = 0;
        this.field4309 = null;
        this.field4315 = null;
        this.field4312 = 0;
        while (true) {
            class359 var4 = (class359) this.field4301.method7983();
            if (var4 == null) {
                while (true) {
                    class359 var5 = (class359) this.field4306.method7983();
                    if (var5 == null) {
                        if (this.field4318 != 0) {
                            try {
                                class514 var6 = new class514(4);
                                var6.method8227(4);
                                var6.method8227(this.field4318);
                                var6.method8228(0);
                                this.field4310.method7347(var6.field5070, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4310.method7348();
                                } catch (Exception var9) {
                                }
                                this.field4299++;
                                this.field4310 = null;
                            }
                        }
                        this.field4297 = 0;
                        this.field4320 = class303.method2705();
                        return;
                    }
                    this.field4303.method6356(var5);
                    this.field4304.method7990(var5, var5.field4819);
                    this.field4305++;
                    this.field4298--;
                }
            }
            this.field4316.method7990(var4, var4.field4819);
            this.field4311++;
            this.field4302--;
        }
    }

    @ObfuscatedName("nq.am(Lny;II)V")
    public void method6229(class358 arg0, int arg1) {
        if (arg0.field4268) {
            if (arg1 <= this.field4317) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4314) {
                this.field4314 = arg1;
            }
        } else if (arg1 >= this.field4314) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4317) {
            this.field4317 = arg1;
        }
        if (this.field4296 == null) {
            this.method6204((class358) null, 255, 255, 0, (byte) 0, true);
            this.field4307[arg1] = arg0;
        } else {
            this.method6217(arg0, arg1);
        }
    }

    @ObfuscatedName("nq.as(Lny;IB)V")
    public void method6217(class358 arg0, int arg1) {
        this.field4296.field5072 = arg1 * 8 + 5;
        if (this.field4296.field5072 < this.field4296.field5070.length) {
            int var3 = this.field4296.method8496();
            int var4 = this.field4296.method8496();
            arg0.method6069(var3, var4);
        } else if (arg0.field4268) {
            arg0.method6068();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("nq.aj(Lny;IIIBZI)V")
    public void method6204(class358 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class359 var9 = (class359) this.field4316.method7981(var7);
        if (var9 != null) {
            return;
        }
        class359 var10 = (class359) this.field4301.method7981(var7);
        if (var10 != null) {
            return;
        }
        class359 var11 = (class359) this.field4304.method7981(var7);
        if (var11 == null) {
            if (!arg5) {
                class359 var12 = (class359) this.field4306.method7981(var7);
                if (var12 != null) {
                    return;
                }
            }
            class359 var13 = new class359();
            var13.field4273 = arg0;
            var13.field4272 = arg3;
            var13.field4271 = arg4;
            if (arg5) {
                this.field4316.method7990(var13, var7);
                this.field4311++;
            } else {
                this.field4303.method6355(var13);
                this.field4304.method7990(var13, var7);
                this.field4305++;
            }
        } else if (arg5) {
            var11.method7660();
            this.field4316.method7990(var11, var7);
            this.field4305--;
            this.field4311++;
        }
    }

    @ObfuscatedName("nq.ag(III)V")
    public void method6205(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class359 var5 = (class359) this.field4304.method7981(var3);
        if (var5 != null) {
            this.field4303.method6356(var5);
        }
    }

    @ObfuscatedName("nq.az(IIB)I")
    public int method6206(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4309 != null && this.field4309.field4819 == var3 ? this.field4315.field5072 * 99 / (this.field4315.field5070.length - this.field4309.field4271) + 1 : 0;
    }

    @ObfuscatedName("nq.av(ZZI)I")
    public int method6207(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4311 + this.field4302;
        }
        if (arg1) {
            var3 += this.field4305 + this.field4298;
        }
        return var3;
    }

    @ObfuscatedName("nq.ap(B)V")
    public void method6208() {
        if (this.field4310 != null) {
            this.field4310.method7348();
        }
    }
}
