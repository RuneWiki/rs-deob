package deob;

import java.util.zip.CRC32;

@ObfuscatedName("or")
public class class389 extends class392 {

    @ObfuscatedName("or.ay")
    public class491 field4544;

    @ObfuscatedName("or.as")
    public class491 field4545;

    @ObfuscatedName("or.ae")
    public int field4546;

    @ObfuscatedName("or.am")
    public volatile int field4555 = 0;

    @ObfuscatedName("or.at")
    public boolean field4548 = false;

    @ObfuscatedName("or.au")
    public volatile boolean[] field4549;

    @ObfuscatedName("or.an")
    public static CRC32 field4550 = new CRC32();

    @ObfuscatedName("or.ao")
    public int field4542;

    @ObfuscatedName("or.af")
    public int field4551;

    @ObfuscatedName("or.ar")
    public int field4553 = -1;

    @ObfuscatedName("or.ab")
    public boolean field4554 = false;

    @ObfuscatedName("or.az")
    public boolean field4543 = false;

    @ObfuscatedName("or.ag")
    public class393 field4556;

    public class389(class491 arg0, class491 arg1, class393 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8) {
        super(arg4, arg5);
        this.field4544 = arg0;
        this.field4545 = arg1;
        this.field4546 = arg3;
        this.field4548 = arg6;
        this.field4554 = arg7;
        this.field4543 = arg8;
        this.field4556 = arg2;
        this.field4556.method7080(this, this.field4546);
    }

    @ObfuscatedName("or.ap(I)Z")
    public boolean method6946() {
        return this.field4555 == 1;
    }

    @ObfuscatedName("or.aw(I)I")
    public int method6947() {
        if (this.field4555 == 1 || this.field4554 && this.field4555 == 2) {
            return 100;
        } else if (this.field4598 == null) {
            int var1 = this.field4556.method7097(class390.field4566.field4580, this.field4546);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("or.ak(II)V")
    public void method6948(int arg0) {
        this.field4556.method7083(this.field4546, arg0);
    }

    @ObfuscatedName("or.aj(II)V")
    public void method6949(int arg0) {
        if (this.field4544 == null || this.field4549 == null || !this.field4549[arg0]) {
            this.field4556.method7082(this, this.field4546, arg0, this.field4604[arg0], (byte) 2, true);
            return;
        }
        class491 var2 = this.field4544;
        byte[] var4 = null;
        class411 var5 = class388.field4537;
        synchronized (class388.field4537) {
            for (class387 var6 = (class387) class388.field4537.method7247(); var6 != null; var6 = (class387) class388.field4537.method7249()) {
                if ((long) arg0 == var6.field5170 && var6.field4529 == var2 && var6.field4532 == 0) {
                    var4 = var6.field4527;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method8554(arg0);
            this.method6953(var2, arg0, var8, true);
        } else {
            this.method6953(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("or.ai(B)V")
    public void method6950() {
        this.field4555 = 2;
        this.field4593 = new int[0];
        this.field4604 = new int[0];
        this.field4589 = new int[0];
        this.field4594 = new int[0];
        this.field4588 = new int[0][];
        this.field4598 = new Object[0];
        this.field4599 = new Object[0][];
    }

    @ObfuscatedName("or.ay(III)V")
    public void method6951(int arg0, int arg1) {
        this.field4542 = arg0;
        this.field4551 = arg1;
        if (this.field4545 == null) {
            this.field4556.method7082(this, class390.field4566.field4580, this.field4546, this.field4542, (byte) 0, true);
        } else {
            class388.method2570(this.field4546, this.field4545, this);
        }
    }

    @ObfuscatedName("or.as(I[BZZB)V")
    public void method6985(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field4555 == 1) {
                throw new RuntimeException();
            }
            if (this.field4545 != null) {
                class388.method4617(this.field4546, arg1, this.field4545);
            }
            this.method7060(arg1);
            this.method6954();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field4589[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field4589[arg0];
        if (this.field4544 != null) {
            class388.method4617(arg0, arg1, this.field4544);
            this.field4549[arg0] = true;
        }
        if (arg3) {
            this.field4598[arg0] = class366.method5310(arg1, false);
        }
    }

    @ObfuscatedName("or.ae(Lsl;I[BZB)V")
    public void method6953(class491 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field4545 != arg0) {
            if (!arg3 && this.field4553 == arg1) {
                this.field4555 = 1;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4549[arg1] = false;
                if (this.field4548 || arg3) {
                    this.field4556.method7082(this, this.field4546, arg1, this.field4604[arg1], (byte) 2, arg3);
                }
                return;
            }
            field4550.reset();
            field4550.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field4550.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field4604[arg1] != var9 || this.field4589[arg1] != var10) {
                this.field4549[arg1] = false;
                if (this.field4548 || arg3) {
                    this.field4556.method7082(this, this.field4546, arg1, this.field4604[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field4549[arg1] = true;
            if (arg3) {
                this.field4598[arg1] = class366.method5310(arg2, false);
            }
            return;
        }
        if (this.field4555 == 1) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            this.field4556.method7082(this, class390.field4566.field4580, this.field4546, this.field4542, (byte) 0, true);
            return;
        }
        field4550.reset();
        field4550.update(arg2, 0, arg2.length);
        int var5 = (int) field4550.getValue();
        if (this.field4542 != var5) {
            this.field4556.method7082(this, class390.field4566.field4580, this.field4546, this.field4542, (byte) 0, true);
            return;
        }
        class558 var6 = new class558(class392.method6037(arg2));
        int var7 = var6.method9258();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field4546 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method9264();
        }
        if (this.field4551 != var8) {
            this.field4556.method7082(this, class390.field4566.field4580, this.field4546, this.field4542, (byte) 0, true);
            return;
        }
        this.method7060(arg2);
        this.method6954();
    }

    @ObfuscatedName("or.am(I)V")
    public void method6954() {
        this.field4549 = new boolean[this.field4598.length];
        for (int var1 = 0; var1 < this.field4549.length; var1++) {
            this.field4549[var1] = false;
        }
        if (this.field4544 == null) {
            this.field4555 = 1;
            return;
        }
        this.field4553 = -1;
        for (int var2 = 0; var2 < this.field4549.length; var2++) {
            if (this.field4594[var2] > 0) {
                class491 var3 = this.field4544;
                class387 var5 = new class387();
                var5.field4532 = 1;
                var5.field5170 = (long) var2;
                var5.field4529 = var3;
                var5.field4530 = this;
                class411 var6 = class388.field4537;
                synchronized (class388.field4537) {
                    class388.field4537.method7243(var5);
                }
                class388.method5891();
                this.field4553 = var2;
            }
        }
        if (this.field4553 == -1) {
            this.field4555 = 1;
        }
    }

    @ObfuscatedName("or.at(IB)I")
    public int method6955(int arg0) {
        if (this.field4598[arg0] == null) {
            return this.field4549[arg0] ? 100 : this.field4556.method7097(this.field4546, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("or.au(II)Z")
    public boolean method6956(int arg0) {
        return this.field4549[arg0];
    }

    @ObfuscatedName("or.an(II)Z")
    public boolean method6972(int arg0) {
        return this.method7003(arg0) != null;
    }

    @ObfuscatedName("or.ao(I)I")
    public int method6958() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4598.length; var3++) {
            if (this.field4594[var3] > 0) {
                var1 += 100;
                var2 += this.method6955(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
