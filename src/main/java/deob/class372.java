package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("oz")
public class class372 {

    @ObfuscatedName("oz.at")
    public class451 field4324;

    @ObfuscatedName("oz.ah")
    public int field4321 = 0;

    @ObfuscatedName("oz.ar")
    public long field4341;

    @ObfuscatedName("oz.ao")
    public class501 field4323 = new class501(4096);

    @ObfuscatedName("oz.ab")
    public int field4334 = 0;

    @ObfuscatedName("oz.au")
    public class501 field4325 = new class501(32);

    @ObfuscatedName("oz.aa")
    public int field4329 = 0;

    @ObfuscatedName("oz.ac")
    public class389 field4327 = new class389();

    @ObfuscatedName("oz.al")
    public class501 field4320 = new class501(4096);

    @ObfuscatedName("oz.az")
    public int field4342 = 0;

    @ObfuscatedName("oz.ap")
    public class501 field4330 = new class501(4096);

    @ObfuscatedName("oz.av")
    public int field4331 = 0;

    @ObfuscatedName("oz.ax")
    public boolean field4332;

    @ObfuscatedName("oz.as")
    public class370 field4333;

    @ObfuscatedName("oz.ay")
    public class527 field4343 = new class527(8);

    @ObfuscatedName("oz.ak")
    public class527 field4335;

    @ObfuscatedName("oz.aj")
    public int field4336 = 0;

    @ObfuscatedName("oz.aq")
    public CRC32 field4337 = new CRC32();

    @ObfuscatedName("oz.ai")
    public class527 field4338;

    @ObfuscatedName("oz.aw")
    public class369[] field4339 = new class369[256];

    @ObfuscatedName("oz.ae")
    public int field4340 = -1;

    @ObfuscatedName("oz.an")
    public int field4326 = 255;

    @ObfuscatedName("oz.ag")
    public byte field4322 = 0;

    @ObfuscatedName("oz.ad")
    public int field4344 = 0;

    @ObfuscatedName("oz.af")
    public int field4328 = 0;

    @ObfuscatedName("oz.at(B)Z")
    public boolean method6366() {
        long var1 = class313.method3460();
        int var3 = (int) (var1 - this.field4341);
        this.field4341 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4321 += var3;
        if (this.field4331 == 0 && this.field4329 == 0 && this.field4342 == 0 && this.field4334 == 0) {
            return true;
        } else if (this.field4324 == null) {
            return false;
        } else {
            try {
                if (this.field4321 > 30000) {
                    throw new IOException();
                }
                while (this.field4329 < 200 && this.field4334 > 0) {
                    class370 var4 = (class370) this.field4323.method8157();
                    class527 var5 = new class527(4);
                    var5.method8393(1);
                    var5.method8390((int) var4.field4849);
                    this.field4324.method7532(var5.field5140, 0, 4);
                    this.field4325.method8156(var4, var4.field4849);
                    this.field4334--;
                    this.field4329++;
                }
                while (this.field4331 < 200 && this.field4342 > 0) {
                    class370 var6 = (class370) this.field4327.method6530();
                    class527 var7 = new class527(4);
                    var7.method8393(0);
                    var7.method8390((int) var6.field4849);
                    this.field4324.method7532(var7.field5140, 0, 4);
                    var6.method7825();
                    this.field4330.method8156(var6, var6.field4849);
                    this.field4342--;
                    this.field4331++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4324.method7544();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4321 = 0;
                    byte var10 = 0;
                    if (this.field4333 == null) {
                        var10 = 8;
                    } else if (this.field4336 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4343.field5137;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4324.method7531(this.field4343.field5140, this.field4343.field5137, var11);
                        if (this.field4322 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4343.field5140[this.field4343.field5137 + var12] ^= this.field4322;
                            }
                        }
                        this.field4343.field5137 += var11;
                        if (this.field4343.field5137 < var10) {
                            break;
                        }
                        if (this.field4333 == null) {
                            this.field4343.field5137 = 0;
                            int var13 = this.field4343.method8410();
                            int var14 = this.field4343.method8412();
                            int var15 = this.field4343.method8410();
                            int var16 = this.field4343.method8416();
                            long var17 = (long) ((var13 << 16) + var14);
                            class370 var19 = (class370) this.field4325.method8154(var17);
                            this.field4332 = true;
                            if (var19 == null) {
                                var19 = (class370) this.field4330.method8154(var17);
                                this.field4332 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4333 = var19;
                            this.field4335 = new class527(var16 + var20 + this.field4333.field4296);
                            this.field4335.method8393(var15);
                            this.field4335.method8396(var16);
                            this.field4336 = 8;
                            this.field4343.field5137 = 0;
                        } else if (this.field4336 == 0) {
                            if (this.field4343.field5140[0] == -1) {
                                this.field4336 = 1;
                                this.field4343.field5137 = 0;
                            } else {
                                this.field4333 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4335.field5140.length - this.field4333.field4296;
                        int var22 = 512 - this.field4336;
                        if (var22 > var21 - this.field4335.field5137) {
                            var22 = var21 - this.field4335.field5137;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4324.method7531(this.field4335.field5140, this.field4335.field5137, var22);
                        if (this.field4322 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4335.field5140[this.field4335.field5137 + var23] ^= this.field4322;
                            }
                        }
                        this.field4335.field5137 += var22;
                        this.field4336 += var22;
                        if (this.field4335.field5137 == var21) {
                            if (this.field4333.field4849 == 16711935L) {
                                this.field4338 = this.field4335;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class369 var25 = this.field4339[var24];
                                    if (var25 != null) {
                                        this.method6365(var25, var24);
                                    }
                                }
                            } else {
                                this.field4337.reset();
                                this.field4337.update(this.field4335.field5140, 0, var21);
                                int var26 = (int) this.field4337.getValue();
                                if (this.field4333.field4295 != var26) {
                                    try {
                                        this.field4324.method7538();
                                    } catch (Exception var31) {
                                    }
                                    this.field4344++;
                                    this.field4324 = null;
                                    this.field4322 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4344 = 0;
                                this.field4328 = 0;
                                this.field4333.field4297.method6240((int) (this.field4333.field4849 & 0xFFFFL), this.field4335.field5140, (this.field4333.field4849 & 0xFF0000L) == 16711680L, this.field4332);
                            }
                            this.field4333.method7828();
                            if (this.field4332) {
                                this.field4329--;
                            } else {
                                this.field4331--;
                            }
                            this.field4336 = 0;
                            this.field4333 = null;
                            this.field4335 = null;
                        } else {
                            if (this.field4336 != 512) {
                                break;
                            }
                            this.field4336 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4324.method7538();
                } catch (Exception var30) {
                }
                this.field4328++;
                this.field4324 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("oz.ah(ZI)V")
    public void method6367(boolean arg0) {
        if (this.field4324 == null) {
            return;
        }
        try {
            class527 var2 = new class527(4);
            var2.method8393(arg0 ? 2 : 3);
            var2.method8390(0);
            this.field4324.method7532(var2.field5140, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4324.method7538();
            } catch (Exception var5) {
            }
            this.field4328++;
            this.field4324 = null;
        }
    }

    @ObfuscatedName("oz.ar(Lro;ZI)V")
    public void method6368(class451 arg0, boolean arg1) {
        if (this.field4324 != null) {
            try {
                this.field4324.method7538();
            } catch (Exception var11) {
            }
            this.field4324 = null;
        }
        this.field4324 = arg0;
        this.method6367(arg1);
        this.field4343.field5137 = 0;
        this.field4333 = null;
        this.field4335 = null;
        this.field4336 = 0;
        while (true) {
            class370 var4 = (class370) this.field4325.method8157();
            if (var4 == null) {
                while (true) {
                    class370 var5 = (class370) this.field4330.method8157();
                    if (var5 == null) {
                        if (this.field4322 != 0) {
                            try {
                                class527 var6 = new class527(4);
                                var6.method8393(4);
                                var6.method8393(this.field4322);
                                var6.method8394(0);
                                this.field4324.method7532(var6.field5140, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4324.method7538();
                                } catch (Exception var9) {
                                }
                                this.field4328++;
                                this.field4324 = null;
                            }
                        }
                        this.field4321 = 0;
                        this.field4341 = class313.method3460();
                        return;
                    }
                    this.field4327.method6529(var5);
                    this.field4320.method8156(var5, var5.field4849);
                    this.field4342++;
                    this.field4331--;
                }
            }
            this.field4323.method8156(var4, var4.field4849);
            this.field4334++;
            this.field4329--;
        }
    }

    @ObfuscatedName("oz.ao(Loh;II)V")
    public void method6369(class369 arg0, int arg1) {
        if (arg0.field4284 && !arg0.field4291) {
            if (arg1 <= this.field4340) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4326) {
                this.field4326 = arg1;
            }
        } else if (arg1 >= this.field4326) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4340) {
            this.field4340 = arg1;
        }
        if (this.field4338 == null) {
            this.method6376((class369) null, 255, 255, 0, (byte) 0, true);
            this.field4339[arg1] = arg0;
        } else {
            this.method6365(arg0, arg1);
        }
    }

    @ObfuscatedName("oz.ab(Loh;IB)V")
    public void method6365(class369 arg0, int arg1) {
        this.field4338.field5137 = arg1 * 8 + 5;
        if (this.field4338.field5137 < this.field4338.field5140.length) {
            int var3 = this.field4338.method8416();
            int var4 = this.field4338.method8416();
            arg0.method6237(var3, var4);
        } else if (arg0.field4284) {
            arg0.method6236();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("oz.au(Loh;IIIBZB)V")
    public void method6376(class369 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class370 var9 = (class370) this.field4323.method8154(var7);
        if (var9 != null) {
            return;
        }
        class370 var10 = (class370) this.field4325.method8154(var7);
        if (var10 != null) {
            return;
        }
        class370 var11 = (class370) this.field4320.method8154(var7);
        if (var11 == null) {
            if (!arg5) {
                class370 var12 = (class370) this.field4330.method8154(var7);
                if (var12 != null) {
                    return;
                }
            }
            class370 var13 = new class370();
            var13.field4297 = arg0;
            var13.field4295 = arg3;
            var13.field4296 = arg4;
            if (arg5) {
                this.field4323.method8156(var13, var7);
                this.field4334++;
            } else {
                this.field4327.method6531(var13);
                this.field4320.method8156(var13, var7);
                this.field4342++;
            }
        } else if (arg5) {
            var11.method7825();
            this.field4323.method8156(var11, var7);
            this.field4342--;
            this.field4334++;
        }
    }

    @ObfuscatedName("oz.aa(III)V")
    public void method6372(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class370 var5 = (class370) this.field4320.method8154(var3);
        if (var5 != null) {
            this.field4327.method6529(var5);
        }
    }

    @ObfuscatedName("oz.ac(III)I")
    public int method6373(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4333 != null && this.field4333.field4849 == var3 ? this.field4335.field5137 * 99 / (this.field4335.field5140.length - this.field4333.field4296) + 1 : 0;
    }

    @ObfuscatedName("oz.al(ZZB)I")
    public int method6374(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4334 + this.field4329;
        }
        if (arg1) {
            var3 += this.field4342 + this.field4331;
        }
        return var3;
    }

    @ObfuscatedName("oz.az(I)V")
    public void method6371() {
        if (this.field4324 != null) {
            this.field4324.method7538();
        }
    }
}
