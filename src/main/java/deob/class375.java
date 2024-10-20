package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("oo")
public class class375 {

    @ObfuscatedName("oo.ac")
    public class454 field4342;

    @ObfuscatedName("oo.al")
    public int field4350 = 0;

    @ObfuscatedName("oo.ak")
    public long field4343;

    @ObfuscatedName("oo.ax")
    public class504 field4344 = new class504(4096);

    @ObfuscatedName("oo.ao")
    public int field4366 = 0;

    @ObfuscatedName("oo.ah")
    public class504 field4346 = new class504(32);

    @ObfuscatedName("oo.ar")
    public int field4347 = 0;

    @ObfuscatedName("oo.ab")
    public class392 field4348 = new class392();

    @ObfuscatedName("oo.am")
    public class504 field4349 = new class504(4096);

    @ObfuscatedName("oo.av")
    public int field4359 = 0;

    @ObfuscatedName("oo.ag")
    public class504 field4351 = new class504(4096);

    @ObfuscatedName("oo.aa")
    public int field4352 = 0;

    @ObfuscatedName("oo.ap")
    public boolean field4353;

    @ObfuscatedName("oo.ay")
    public class373 field4341;

    @ObfuscatedName("oo.as")
    public class530 field4355 = new class530(8);

    @ObfuscatedName("oo.aj")
    public class530 field4356;

    @ObfuscatedName("oo.an")
    public int field4345 = 0;

    @ObfuscatedName("oo.ai")
    public CRC32 field4354 = new CRC32();

    @ObfuscatedName("oo.ae")
    public class530 field4361;

    @ObfuscatedName("oo.aw")
    public class372[] field4360 = new class372[256];

    @ObfuscatedName("oo.aq")
    public int field4362 = -1;

    @ObfuscatedName("oo.az")
    public int field4363 = 255;

    @ObfuscatedName("oo.at")
    public byte field4364 = 0;

    @ObfuscatedName("oo.af")
    public int field4365 = 0;

    @ObfuscatedName("oo.ad")
    public int field4357 = 0;

    @ObfuscatedName("oo.ac(I)Z")
    public boolean method6379() {
        long var1 = class316.method6401();
        int var3 = (int) (var1 - this.field4343);
        this.field4343 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        this.field4350 += var3;
        if (this.field4352 == 0 && this.field4347 == 0 && this.field4359 == 0 && this.field4366 == 0) {
            return true;
        } else if (this.field4342 == null) {
            return false;
        } else {
            try {
                if (this.field4350 > 30000) {
                    throw new IOException();
                }
                while (this.field4347 < 200 && this.field4366 > 0) {
                    class373 var4 = (class373) this.field4344.method8091();
                    class530 var5 = new class530(4);
                    var5.method8348(1);
                    var5.method8350((int) var4.field4857);
                    this.field4342.method7435(var5.field5139, 0, 4);
                    this.field4346.method8098(var4, var4.field4857);
                    this.field4366--;
                    this.field4347++;
                }
                while (this.field4352 < 200 && this.field4359 > 0) {
                    class373 var6 = (class373) this.field4348.method6520();
                    class530 var7 = new class530(4);
                    var7.method8348(0);
                    var7.method8350((int) var6.field4857);
                    this.field4342.method7435(var7.field5139, 0, 4);
                    var6.method7774();
                    this.field4351.method8098(var6, var6.field4857);
                    this.field4359--;
                    this.field4352++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field4342.method7448();
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field4350 = 0;
                    byte var10 = 0;
                    if (this.field4341 == null) {
                        var10 = 8;
                    } else if (this.field4345 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field4355.field5140;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field4342.method7447(this.field4355.field5139, this.field4355.field5140, var11);
                        if (this.field4364 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field4355.field5139[this.field4355.field5140 + var12] ^= this.field4364;
                            }
                        }
                        this.field4355.field5140 += var11;
                        if (this.field4355.field5140 < var10) {
                            break;
                        }
                        if (this.field4341 == null) {
                            this.field4355.field5140 = 0;
                            int var13 = this.field4355.method8365();
                            int var14 = this.field4355.method8598();
                            int var15 = this.field4355.method8365();
                            int var16 = this.field4355.method8371();
                            long var17 = (long) ((var13 << 16) + var14);
                            class373 var19 = (class373) this.field4346.method8104(var17);
                            this.field4353 = true;
                            if (var19 == null) {
                                var19 = (class373) this.field4351.method8104(var17);
                                this.field4353 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            this.field4341 = var19;
                            this.field4356 = new class530(var16 + var20 + this.field4341.field4321);
                            this.field4356.method8348(var15);
                            this.field4356.method8351(var16);
                            this.field4345 = 8;
                            this.field4355.field5140 = 0;
                        } else if (this.field4345 == 0) {
                            if (this.field4355.field5139[0] == -1) {
                                this.field4345 = 1;
                                this.field4355.field5140 = 0;
                            } else {
                                this.field4341 = null;
                            }
                        }
                    } else {
                        int var21 = this.field4356.field5139.length - this.field4341.field4321;
                        int var22 = 512 - this.field4345;
                        if (var22 > var21 - this.field4356.field5140) {
                            var22 = var21 - this.field4356.field5140;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        this.field4342.method7447(this.field4356.field5139, this.field4356.field5140, var22);
                        if (this.field4364 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                this.field4356.field5139[this.field4356.field5140 + var23] ^= this.field4364;
                            }
                        }
                        this.field4356.field5140 += var22;
                        this.field4345 += var22;
                        if (this.field4356.field5140 == var21) {
                            if (this.field4341.field4857 == 16711935L) {
                                this.field4361 = this.field4356;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class372 var25 = this.field4360[var24];
                                    if (var25 != null) {
                                        this.method6351(var25, var24);
                                    }
                                }
                            } else {
                                this.field4354.reset();
                                this.field4354.update(this.field4356.field5139, 0, var21);
                                int var26 = (int) this.field4354.getValue();
                                if (this.field4341.field4322 != var26) {
                                    try {
                                        this.field4342.method7441();
                                    } catch (Exception var31) {
                                    }
                                    this.field4365++;
                                    this.field4342 = null;
                                    this.field4364 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                this.field4365 = 0;
                                this.field4357 = 0;
                                this.field4341.field4320.method6225((int) (this.field4341.field4857 & 0xFFFFL), this.field4356.field5139, (this.field4341.field4857 & 0xFF0000L) == 16711680L, this.field4353);
                            }
                            this.field4341.method7776();
                            if (this.field4353) {
                                this.field4347--;
                            } else {
                                this.field4352--;
                            }
                            this.field4345 = 0;
                            this.field4341 = null;
                            this.field4356 = null;
                        } else {
                            if (this.field4345 != 512) {
                                break;
                            }
                            this.field4345 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    this.field4342.method7441();
                } catch (Exception var30) {
                }
                this.field4357++;
                this.field4342 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("oo.al(ZB)V")
    public void method6352(boolean arg0) {
        if (this.field4342 == null) {
            return;
        }
        try {
            class530 var2 = new class530(4);
            var2.method8348(arg0 ? 2 : 3);
            var2.method8350(0);
            this.field4342.method7435(var2.field5139, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4342.method7441();
            } catch (Exception var5) {
            }
            this.field4357++;
            this.field4342 = null;
        }
    }

    @ObfuscatedName("oo.ak(Lre;ZB)V")
    public void method6353(class454 arg0, boolean arg1) {
        if (this.field4342 != null) {
            try {
                this.field4342.method7441();
            } catch (Exception var11) {
            }
            this.field4342 = null;
        }
        this.field4342 = arg0;
        this.method6352(arg1);
        this.field4355.field5140 = 0;
        this.field4341 = null;
        this.field4356 = null;
        this.field4345 = 0;
        while (true) {
            class373 var4 = (class373) this.field4346.method8091();
            if (var4 == null) {
                while (true) {
                    class373 var5 = (class373) this.field4351.method8091();
                    if (var5 == null) {
                        if (this.field4364 != 0) {
                            try {
                                class530 var6 = new class530(4);
                                var6.method8348(4);
                                var6.method8348(this.field4364);
                                var6.method8349(0);
                                this.field4342.method7435(var6.field5139, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4342.method7441();
                                } catch (Exception var9) {
                                }
                                this.field4357++;
                                this.field4342 = null;
                            }
                        }
                        this.field4350 = 0;
                        this.field4343 = class316.method6401();
                        return;
                    }
                    this.field4348.method6519(var5);
                    this.field4349.method8098(var5, var5.field4857);
                    this.field4359++;
                    this.field4352--;
                }
            }
            this.field4344.method8098(var4, var4.field4857);
            this.field4366++;
            this.field4347--;
        }
    }

    @ObfuscatedName("oo.ax(Lok;II)V")
    public void method6354(class372 arg0, int arg1) {
        if (arg0.field4316 && !arg0.field4317) {
            if (arg1 <= this.field4362) {
                throw new RuntimeException("");
            }
            if (arg1 < this.field4363) {
                this.field4363 = arg1;
            }
        } else if (arg1 >= this.field4363) {
            throw new RuntimeException("");
        } else if (arg1 > this.field4362) {
            this.field4362 = arg1;
        }
        if (this.field4361 == null) {
            this.method6356((class372) null, 255, 255, 0, (byte) 0, true);
            this.field4360[arg1] = arg0;
        } else {
            this.method6351(arg0, arg1);
        }
    }

    @ObfuscatedName("oo.ao(Lok;II)V")
    public void method6351(class372 arg0, int arg1) {
        this.field4361.field5140 = arg1 * 8 + 5;
        if (this.field4361.field5140 < this.field4361.field5139.length) {
            int var3 = this.field4361.method8371();
            int var4 = this.field4361.method8371();
            arg0.method6253(var3, var4);
        } else if (arg0.field4316) {
            arg0.method6221();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("oo.ah(Lok;IIIBZI)V")
    public void method6356(class372 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var7 = (long) ((arg1 << 16) + arg2);
        class373 var9 = (class373) this.field4344.method8104(var7);
        if (var9 != null) {
            return;
        }
        class373 var10 = (class373) this.field4346.method8104(var7);
        if (var10 != null) {
            return;
        }
        class373 var11 = (class373) this.field4349.method8104(var7);
        if (var11 == null) {
            if (!arg5) {
                class373 var12 = (class373) this.field4351.method8104(var7);
                if (var12 != null) {
                    return;
                }
            }
            class373 var13 = new class373();
            var13.field4320 = arg0;
            var13.field4322 = arg3;
            var13.field4321 = arg4;
            if (arg5) {
                this.field4344.method8098(var13, var7);
                this.field4366++;
            } else {
                this.field4348.method6518(var13);
                this.field4349.method8098(var13, var7);
                this.field4359++;
            }
        } else if (arg5) {
            var11.method7774();
            this.field4344.method8098(var11, var7);
            this.field4359--;
            this.field4366++;
        }
    }

    @ObfuscatedName("oo.ar(III)V")
    public void method6357(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        class373 var5 = (class373) this.field4349.method8104(var3);
        if (var5 != null) {
            this.field4348.method6519(var5);
        }
    }

    @ObfuscatedName("oo.ab(III)I")
    public int method6358(int arg0, int arg1) {
        long var3 = (long) ((arg0 << 16) + arg1);
        return this.field4341 != null && this.field4341.field4857 == var3 ? this.field4356.field5140 * 99 / (this.field4356.field5139.length - this.field4341.field4321) + 1 : 0;
    }

    @ObfuscatedName("oo.am(ZZB)I")
    public int method6359(boolean arg0, boolean arg1) {
        int var3 = 0;
        if (arg0) {
            var3 += this.field4366 + this.field4347;
        }
        if (arg1) {
            var3 += this.field4359 + this.field4352;
        }
        return var3;
    }

    @ObfuscatedName("oo.av(B)V")
    public void method6360() {
        if (this.field4342 != null) {
            this.field4342.method7441();
        }
    }
}
