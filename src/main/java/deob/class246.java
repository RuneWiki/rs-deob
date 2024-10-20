package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ih")
public class class246 extends class244 {

    @ObfuscatedName("ih.c")
    public class318 field3163;

    @ObfuscatedName("ih.j")
    public class318 field3154;

    @ObfuscatedName("ih.y")
    public int field3156;

    @ObfuscatedName("ih.f")
    public volatile boolean field3155 = false;

    @ObfuscatedName("ih.ae")
    public boolean field3157 = false;

    @ObfuscatedName("ih.an")
    public volatile boolean[] field3158;

    @ObfuscatedName("ih.ai")
    public static CRC32 field3159 = new CRC32();

    @ObfuscatedName("ih.ap")
    public int field3160;

    @ObfuscatedName("ih.ab")
    public int field3161;

    @ObfuscatedName("ih.ar")
    public int field3162 = -1;

    public class246(class318 arg0, class318 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3163 = arg0;
        this.field3154 = arg1;
        this.field3156 = arg2;
        this.field3157 = arg5;
        class247.method43(this, this.field3156);
    }

    @ObfuscatedName("ih.ct(I)Z")
    public boolean method3964() {
        return this.field3155;
    }

    @ObfuscatedName("ih.cf(I)I")
    public int method3990() {
        if (this.field3155) {
            return 100;
        } else if (this.field3139 == null) {
            int var1 = class247.method44(255, this.field3156);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ih.m(IB)V")
    public void method3900(int arg0) {
        int var2 = this.field3156;
        long var3 = (long) ((var2 << 16) + arg0);
        class243 var5 = (class243) class247.field3172.method5561(var3);
        if (var5 != null) {
            class247.field3171.method4479(var5);
        }
    }

    @ObfuscatedName("ih.n(IB)V")
    public void method3943(int arg0) {
        if (this.field3163 == null || this.field3158 == null || !this.field3158[arg0]) {
            class247.method3113(this, this.field3156, arg0, this.field3130[arg0], (byte) 2, true);
        } else {
            class245.method2141(arg0, this.field3163, this);
        }
    }

    @ObfuscatedName("ih.ca(IIB)V")
    public void method3966(int arg0, int arg1) {
        this.field3160 = arg0;
        this.field3161 = arg1;
        if (this.field3154 == null) {
            class247.method3113(this, 255, this.field3156, this.field3160, (byte) 0, true);
        } else {
            class245.method2141(this.field3156, this.field3154, this);
        }
    }

    @ObfuscatedName("ih.cj(I[BZZI)V")
    public void method3965(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ih.cp(Llq;I[BZI)V")
    public void method3985(class318 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ih.ck(I)V")
    public void method3970() {
        this.field3158 = new boolean[this.field3139.length];
        for (int var1 = 0; var1 < this.field3158.length; var1++) {
            this.field3158[var1] = false;
        }
        if (this.field3163 == null) {
            this.field3155 = true;
            return;
        }
        this.field3162 = -1;
        for (int var2 = 0; var2 < this.field3158.length; var2++) {
            if (this.field3135[var2] > 0) {
                class245.method3837(var2, this.field3163, this);
                this.field3162 = var2;
            }
        }
        if (this.field3162 == -1) {
            this.field3155 = true;
        }
    }

    @ObfuscatedName("ih.t(IB)I")
    public int method3875(int arg0) {
        if (this.field3139[arg0] == null) {
            return this.field3158[arg0] ? 100 : class247.method44(this.field3156, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ih.ce(IB)Z")
    public boolean method3971(int arg0) {
        return this.field3158[arg0];
    }

    @ObfuscatedName("ih.cv(II)Z")
    public boolean method3972(int arg0) {
        return this.method3879(arg0) != null;
    }

    @ObfuscatedName("ih.cl(B)I")
    public int method3986() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3139.length; var3++) {
            if (this.field3135[var3] > 0) {
                var1 += 100;
                var2 += this.method3875(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
