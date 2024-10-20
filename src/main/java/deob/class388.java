package deob;

import java.util.zip.CRC32;

@ObfuscatedName("of")
public class class388 extends class391 {

    @ObfuscatedName("of.aq")
    public class486 field4506;

    @ObfuscatedName("of.af")
    public class486 field4507;

    @ObfuscatedName("of.at")
    public int field4513;

    @ObfuscatedName("of.au")
    public volatile int field4509 = 0;

    @ObfuscatedName("of.ar")
    public boolean field4510 = false;

    @ObfuscatedName("of.al")
    public volatile boolean[] field4511;

    @ObfuscatedName("of.ad")
    public static CRC32 field4512 = new CRC32();

    @ObfuscatedName("of.ah")
    public int field4502;

    @ObfuscatedName("of.ap")
    public int field4514;

    @ObfuscatedName("of.ab")
    public int field4505 = -1;

    @ObfuscatedName("of.az")
    public boolean field4516 = false;

    @ObfuscatedName("of.aa")
    public boolean field4503 = false;

    @ObfuscatedName("of.ai")
    public class392 field4518;

    public class388(class486 arg0, class486 arg1, class392 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8) {
        super(arg4, arg5);
        this.field4506 = arg0;
        this.field4507 = arg1;
        this.field4513 = arg3;
        this.field4510 = arg6;
        this.field4516 = arg7;
        this.field4503 = arg8;
        this.field4518 = arg2;
        this.field4518.method6863(this, this.field4513);
    }

    @ObfuscatedName("of.ac(B)Z")
    public boolean method6730() {
        return this.field4509 == 1;
    }

    @ObfuscatedName("of.ae(I)I")
    public int method6755() {
        if (this.field4509 == 1 || this.field4516 && this.field4509 == 2) {
            return 100;
        } else if (this.field4547 == null) {
            int var1 = this.field4518.method6867(class389.field4536.field4542, this.field4513);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("of.ag(II)V")
    public void method6732(int arg0) {
        this.field4518.method6866(this.field4513, arg0);
    }

    @ObfuscatedName("of.am(II)V")
    public void method6733(int arg0) {
        if (this.field4506 == null || this.field4511 == null || !this.field4511[arg0]) {
            this.field4518.method6874(this, this.field4513, arg0, this.field4549[arg0], (byte) 2, true);
        } else {
            class387.method281(arg0, this.field4506, this);
        }
    }

    @ObfuscatedName("of.ax(I)V")
    public void method6760() {
        this.field4509 = 2;
        this.field4548 = new int[0];
        this.field4549 = new int[0];
        this.field4553 = new int[0];
        this.field4551 = new int[0];
        this.field4554 = new int[0][];
        this.field4547 = new Object[0];
        this.field4558 = new Object[0][];
    }

    @ObfuscatedName("of.aq(III)V")
    public void method6750(int arg0, int arg1) {
        this.field4502 = arg0;
        this.field4514 = arg1;
        if (this.field4507 == null) {
            this.field4518.method6874(this, class389.field4536.field4542, this.field4513, this.field4502, (byte) 0, true);
        } else {
            class387.method281(this.field4513, this.field4507, this);
        }
    }

    @ObfuscatedName("of.af(I[BZZI)V")
    public void method6731(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("of.at(Lsl;I[BZI)V")
    public void method6736(class486 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("of.au(B)V")
    public void method6737() {
        this.field4511 = new boolean[this.field4547.length];
        for (int var1 = 0; var1 < this.field4511.length; var1++) {
            this.field4511[var1] = false;
        }
        if (this.field4506 == null) {
            this.field4509 = 1;
            return;
        }
        this.field4505 = -1;
        for (int var2 = 0; var2 < this.field4511.length; var2++) {
            if (this.field4551[var2] > 0) {
                Statics.method2957(var2, this.field4506, this);
                this.field4505 = var2;
            }
        }
        if (this.field4505 == -1) {
            this.field4509 = 1;
        }
    }

    @ObfuscatedName("of.ar(II)I")
    public int method6734(int arg0) {
        if (this.field4547[arg0] == null) {
            return this.field4511[arg0] ? 100 : this.field4518.method6867(this.field4513, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("of.al(II)Z")
    public boolean method6739(int arg0) {
        return this.field4511[arg0];
    }

    @ObfuscatedName("of.ad(II)Z")
    public boolean method6740(int arg0) {
        return this.method6808(arg0) != null;
    }

    @ObfuscatedName("of.ah(I)I")
    public int method6741() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4547.length; var3++) {
            if (this.field4551[var3] > 0) {
                var1 += 100;
                var2 += this.method6734(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
