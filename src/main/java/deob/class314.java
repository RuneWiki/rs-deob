package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ln")
public class class314 extends class316 {

    @ObfuscatedName("ln.q")
    public class382 field3979;

    @ObfuscatedName("ln.i")
    public class382 field3980;

    @ObfuscatedName("ln.k")
    public int field3981;

    @ObfuscatedName("ln.o")
    public volatile int field3982 = 0;

    @ObfuscatedName("ln.n")
    public boolean field3990 = false;

    @ObfuscatedName("ln.d")
    public volatile boolean[] field3984;

    @ObfuscatedName("ln.a")
    public static CRC32 field3983 = new CRC32();

    @ObfuscatedName("ln.m")
    public int field3986;

    @ObfuscatedName("ln.u")
    public int field3987;

    @ObfuscatedName("ln.l")
    public int field3985 = -1;

    @ObfuscatedName("ln.z")
    public boolean field3989 = false;

    public class314(class382 arg0, class382 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        super(arg3, arg4);
        this.field3979 = arg0;
        this.field3980 = arg1;
        this.field3981 = arg2;
        this.field3990 = arg5;
        this.field3989 = arg6;
        int var9 = this.field3981;
        if (this.field3989) {
            if (var9 <= class317.field4032) {
                throw new RuntimeException("");
            }
            if (var9 < class317.field4016) {
                class317.field4016 = var9;
            }
        } else if (var9 >= class317.field4016) {
            throw new RuntimeException("");
        } else if (var9 > class317.field4032) {
            class317.field4032 = var9;
        }
        if (Statics.field1386 == null) {
            class317.method5104((class314) null, 255, 255, 0, (byte) 0, true);
            class317.field4031[var9] = this;
        } else {
            Statics.field1386.field4708 = var9 * 8 + 5;
            if (Statics.field1386.field4708 >= Statics.field1386.field4707.length) {
                if (!this.field3989) {
                    throw new RuntimeException("");
                }
                this.method5154();
            } else {
                int var10 = Statics.field1386.method6934();
                int var11 = Statics.field1386.method6934();
                this.method5139(var10, var11);
            }
        }
    }

    @ObfuscatedName("ln.s(B)Z")
    public boolean method5135() {
        return this.field3982 == 1;
    }

    @ObfuscatedName("ln.h(I)I")
    public int method5164() {
        if (this.field3982 == 1 || this.field3989 && this.field3982 == 2) {
            return 100;
        } else if (this.field3999 == null) {
            int var1 = class317.method4968(255, this.field3981);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ln.w(IB)V")
    public void method5137(int arg0) {
        int var2 = this.field3981;
        long var3 = (long) ((var2 << 16) + arg0);
        class315 var5 = (class315) class317.field4024.method6695(var3);
        if (var5 != null) {
            class317.field4023.method5416(var5);
        }
    }

    @ObfuscatedName("ln.v(IB)V")
    public void method5138(int arg0) {
        if (this.field3979 == null || this.field3984 == null || !this.field3984[arg0]) {
            class317.method5104(this, this.field3981, arg0, this.field4003[arg0], (byte) 2, true);
        } else {
            class313.method6011(arg0, this.field3979, this);
        }
    }

    @ObfuscatedName("ln.c(B)V")
    public void method5154() {
        this.field3982 = 2;
        this.field4000 = new int[0];
        this.field4003 = new int[0];
        this.field4004 = new int[0];
        this.field4012 = new int[0];
        this.field4005 = new int[0][];
        this.field3999 = new Object[0];
        this.field4010 = new Object[0][];
    }

    @ObfuscatedName("ln.q(III)V")
    public void method5139(int arg0, int arg1) {
        this.field3986 = arg0;
        this.field3987 = arg1;
        if (this.field3980 == null) {
            class317.method5104(this, 255, this.field3981, this.field3986, (byte) 0, true);
        } else {
            class313.method6011(this.field3981, this.field3980, this);
        }
    }

    @ObfuscatedName("ln.i(I[BZZI)V")
    public void method5140(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ln.k(Lnk;I[BZB)V")
    public void method5157(class382 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ln.o(B)V")
    public void method5142() {
        this.field3984 = new boolean[this.field3999.length];
        for (int var1 = 0; var1 < this.field3984.length; var1++) {
            this.field3984[var1] = false;
        }
        if (this.field3979 == null) {
            this.field3982 = 1;
            return;
        }
        this.field3985 = -1;
        for (int var2 = 0; var2 < this.field3984.length; var2++) {
            if (this.field4012[var2] > 0) {
                Statics.method5883(var2, this.field3979, this);
                this.field3985 = var2;
            }
        }
        if (this.field3985 == -1) {
            this.field3982 = 1;
        }
    }

    @ObfuscatedName("ln.n(II)I")
    public int method5134(int arg0) {
        if (this.field3999[arg0] == null) {
            return this.field3984[arg0] ? 100 : class317.method4968(this.field3981, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ln.d(II)Z")
    public boolean method5144(int arg0) {
        return this.field3984[arg0];
    }

    @ObfuscatedName("ln.a(II)Z")
    public boolean method5147(int arg0) {
        return this.method5245(arg0) != null;
    }

    @ObfuscatedName("ln.m(B)I")
    public int method5146() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3999.length; var3++) {
            if (this.field4012[var3] > 0) {
                var1 += 100;
                var2 += this.method5134(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
